//ASTtoAST.g
//tree grammar to make trees from other trees


tree grammar ASTtoAST;

options
{
tokenVocab=BLESS3;
ASTLabelType=BAST;
output=AST;
//filter=true;  //tree pattern matching mode
//backtrack=true;
}


@header 
{
//copyright 2012 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.BLESS;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.*;
import java.util.ArrayList;
}

//suppress automatic exception handling
@rulecatch { }

@members
{
public ASTtoAST(BAST useThisASTforRoot)
  {
  this(new CommonTreeNodeStream(useThisASTforRoot));
  }

public boolean toldASTtoAST=false;         
public void tell(String s, RecognitionException re, BAST problem)
  {
  Dump.it("ASTtoAST.tell "+s);
  if (!toldASTtoAST)
    {
    toldASTtoAST=true;
    if (problem != null)
      {
      problem.showParseTree(s);
      Dump.it(problem.toStringTree());
      }
    reportError(re);  
    }
  } //end of tell

public boolean recognitionErrorOccurred = false;    //did a parse error occur?

public void reportError(RecognitionException ex)
  {
  Dump.it("ASTtoAST.reportError(RecognitionException ex)=> "
    +ex.getMessage());
  Dump.it(getErrorHeader(ex));
  Dump.it(ex);
  recognitionErrorOccurred = true;
  if ((ex.node!=null)&&(ex.node instanceof BAST))
    ((BAST)ex.node).showParseTree(((BAST)ex.node).getText());
  super.reportError(ex);
  HelpfulHints.giveHint();
  }

//public void emitErrorMessage(String msg) 
//  {
//  System.err.println(msg);
//  Dump.it(msg);
//  }

  public BAST
makeConjunctionOfAssertions(BAST amp)
  {
  if (amp==null)
    {Dump.it("null parameter to ASTtoAST.makeConjunctionOfAssertions"); return null;}
  if (!amp.hasType(BLESS3Lexer.AMPERSAND))
    {Dump.it("parameter to ASTtoAST.makeConjunctionOfAssertions"+
      " must be AMPERSAND "+amp.getText()); return null;}
  if (amp.getChildCount()==0)
    {return null;}  //no Assertions on the &
  if (amp.getChildCount()==1)
    {return (BAST)amp.getChild(0);}  //return only child of &
  //o.w. make conjunction
  BAST theAnd = new BAST("and",BLESS3Lexer.LITERAL_and,amp);
  for (int f=0; f<amp.getChildCount();f++)
    {
    BAST anAssertion = (BAST)amp.getChild(f);
    if (!amp.hasType(BLESS3Lexer.ASSERTION))
      {Dump.it("children of & of parameter to ASTtoAST.makeConjunctionOfAssertions"+
        " must be ASSERTION "+amp.getText()); return null;}
    if (anAssertion.getChildCount()==1) //just predicate as child
      theAnd.addChild((BAST)anAssertion.getChild(0));
    else if (anAssertion.getChildCount()==2) //label and  predicate 
      theAnd.addChild((BAST)anAssertion.getChild(1));
    else if (anAssertion.getChildCount()==3) //label, parameters and  predicate 
      theAnd.addChild((BAST)anAssertion.getChild(2));
    }
  return theAnd;
  } //end of makeConjunctionOfAssertions

  /**put parentheses around t*/
  public static BAST
  parenthesize(BAST t)
  { //put parentheses around t
    BAST lp = new BAST("(",BLESS3Lexer.LPAREN,t);
    lp.addChild(t);
    lp.addChild(new BAST(")",BLESS3Lexer.RPAREN,t));
    return lp;
  }
  
} //end of members

//   all a:t in r are P1
makeAnAllAreTree[Tree lv, Tree iw, Tree pred]
  :
  -> ^(LITERAL_all {$lv} {$iw} LITERAL_are {$pred} )
  ;

getPredicateFromAssertion
  :
  ^( ASSERTION  (^( LABEL ID ))? (^(PARAMETERS . ))?  p=. )
    -> {$p}
  ;


getBehaviorActionsFromELQ
  :
  ^(LCURLY (^(LITERAL_declare .*) )? ba=. RCURLY (^( LITERAL_catch .+ ) )? )
    -> {$ba}
  
  ;

getPreconditionFromBehaviorActionsInELQ
  :
  ^(LCURLY v=.? ba=getPreconditionFromBehaviorActions RCURLY )
    -> {$ba.pre} //use .tree when getting returned  tree instead of wlidcard match
  ;

//behavior_actions : asserted_action | ^(SEMICOLON asserted_action+) | ^(AMPERSAND asserted_action+)
getPreconditionFromBehaviorActions returns [BAST pre = null]
  options {backtrack=true;}  
  @init{ArrayList<BAST> andTerms = new ArrayList<BAST>();}
  :
  ^(ACTION ^(P p=.?) ^(S . ) ^(Q .?) )  //ACTION root => it's an asserted action
   {$pre=$p;}
  |
  ^(SEMICOLON ^(ACTION ^(P p2=.?) ^(S . ) ^(Q .?) )  .+) //SEMICOLON root => it's sequential composition
    {$pre=$p2;}
//    -> {$p2} //precondition of first formula, if it has one
  |
  ^(amp=AMPERSAND 
     ( prc=getPreconditionFromBehaviorActions  
        {if ($prc.pre!=null) andTerms.add($prc.pre.dupTree());}  )+ 
   ) //AMPERSAND root => it's concurrent composition
    {if (andTerms.size()==0) $pre=null;
    else if (andTerms.size()==1) $pre=andTerms.get(0);
    else
      {
      $pre = new BAST("ASSERTION",BLESS3Lexer.ASSERTION,$amp);
      BAST anAnd = new BAST("and",BLESS3Lexer.LITERAL_and,$amp);
      for (int i=0;i<andTerms.size();i++)
        anAnd.addChild(parenthesize((BAST)andTerms.get(i).getChild(0)));
      $pre.addChild(parenthesize(anAnd));
      }
    }
//    -> {$amp.getChildCount()==0}? {null}
//    -> {$amp.getChildCount()==1}? $prc
//    -> ^(LITERAL_and["and"] $prc+ )  //tree rooted in 'and' of all the preconditions
  |
  elq=getPreconditionFromBehaviorActionsInELQ
    -> {(BAST)$elq.tree}
  ;

getPostconditionFromBehaviorActionsInELQ
  :
  ^(LCURLY .? 
    b=getPostconditionFromBehaviorActions RCURLY )
    -> {$b.post}  
  ;
  catch [RecognitionException re] 
  {Dump.it("Aw elq.");
  tell("ASTtoAST.getPostconditionFromBehaviorActionsInELQ",re,(BAST)retval.getTree());
  throw re;}
//  return null;}
  
anAssertion
  :
  ^( ass=ASSERTION  ^( l=LABEL a=ID ) ^(par=PARAMETERS formals=variableList )  p=. )
    -> ^($ass ^($l $a) ^($par $formals) $p)
  |
  ^( ass=ASSERTION  ^( l=LABEL a=ID )  p=. )
    -> ^($ass ^($l $a) $p)
  |
  ^( ass=ASSERTION p=. ) 
    -> ^($ass $p)
  ;  
 
variableList
  :
  v=variable
  |
  ^( COMMA parameter+=variable+ )
  ; 

variable
  :
  ^( TILDE id=ID tod=. )
  ;
  
getPostconditionFromBehaviorActions returns [BAST post = null]
  options {backtrack=true;}  
  @init{ArrayList<BAST> ampersandPostconditions = new ArrayList<BAST>();}
  :
  ^(ACTION ^(P .?) ^(S . ) ^(Q q=.?)  )  //just postcondition
    {$post=$q;}
  |
  ^(SEMICOLON //SEMICOLON root => it's sequential composition
    ( ^(ACTION 
      ^(P .?) 
      ^(S . ) 
      ^(Q q2=.?)  //last assignment (may get previous Q if last one is empty)
      ) )+  ) 
    {$post=$q2;}
//    -> {$q2} //postcondition of first formula, if it has one
  |
  ^(amp=AMPERSAND //AMPERSAND root => it's concurrent composition
     ( prc=getPostconditionFromBehaviorActions  
      {if($prc.post!=null)ampersandPostconditions.add($prc.post.dupTree());}  )+ 
   ) 
    {if (ampersandPostconditions.size()==0) $post=null;
    else if (ampersandPostconditions.size()==1) $post=ampersandPostconditions.get(0);
    else
      {
      $post = new BAST("ASSERTION",BLESS3Lexer.ASSERTION,$amp);
      BAST anAnd = new BAST("and",BLESS3Lexer.LITERAL_and,$amp);
      for (int i=0;i<ampersandPostconditions.size();i++)
        anAnd.addChild(parenthesize((BAST)ampersandPostconditions.get(i).getChild(0)));
      $post.addChild(anAnd);
      }
    } //end of concurrent composition
  |
  elq=getPostconditionFromBehaviorActionsInELQ
    -> {$elq.tree}
  ;
  catch [RecognitionException re] 
  {Dump.it("Aw shucks.");
  tell("ASTtoAST.getPostconditionFromBehaviorActions",re,(BAST)retval.getTree());
  throw re;}

/*
get_exists_x_t_that_from_elq
  :
  ^(lc=LCURLY (^(dec=LITERAL_declare ( bv+=get_x_t_from_behavior_variable)+ ))? ba=getPostconditionFromBehaviorActions RCURLY )
    ->{dec!=null}? ^(LITERAL_exists $bv+ LITERAL_that)
    -> {dec} //otherwise return null
  ;

get_x_t_from_behavior_variable
  :
  ^(c=COLON d=. ^(t=TYPE rest=.) .*  )
    -> ^($c $d ^($t $rest))
   ; 
*/
 
get_invariant_from_bless_subclause  
  :  
  ^( BLESS_SUBCLAUSE DO_NOT_PROVE? ^( LITERAL_assert .+ )
    ^( ta=LITERAL_invariant ^( ass=ASSERTION ( ^(LABEL id= ID ) )? pred=. ) .* )
  )
    -> ^($ass $pred)  //get the predicate only
  ;  
  catch [RecognitionException re] 
  {Dump.it("Did you forget an invariant clause, Bub?");
  tell("Did you forget an invariant clause, Bub?",re,$ta);
//  tell("ASTtoAST.get_invariant_from_bless_subclause",re,(BAST)retval.getTree());
  }

    
    
///////END OF FILE	
