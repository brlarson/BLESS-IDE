//ASTtoAST.g
//tree grammar to make trees from other trees


tree grammar ASTtoAST;

options
{
tokenVocab=BLESStoAST;
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
import com.multitude.bless.antlr3generated.BLESStoASTLexer;
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
  if (!amp.hasType(BLESStoASTLexer.AMPERSAND))
    {Dump.it("parameter to ASTtoAST.makeConjunctionOfAssertions"+
      " must be AMPERSAND "+amp.getText()); return null;}
  if (amp.getChildCount()==0)
    {return null;}  //no Assertions on the &
  if (amp.getChildCount()==1)
    {return (BAST)amp.getChild(0);}  //return only child of &
  //o.w. make conjunction
  BAST theAnd = new BAST("and",BLESStoASTLexer.LITERAL_and,amp);
  for (int f=0; f<amp.getChildCount();f++)
    {
    BAST anAssertion = (BAST)amp.getChild(f);
    if (!amp.hasType(BLESStoASTLexer.ASSERTION))
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
    BAST lp = new BAST("(",BLESStoASTLexer.LPAREN,t);
    lp.addChild(t);
    lp.addChild(new BAST(")",BLESStoASTLexer.RPAREN,t));
    return lp;
  }
  
} //end of members

//   all a:t in r are P1
makeAnAllAreTree[Tree a, Tree t, Tree r, Tree p1]
  :
  -> ^(LITERAL_all {$a} COLON {$t} LITERAL_in {$r} LITERAL_are {$p1} )
  ;

getPredicateFromAssertion
  :
  ^( ASSERTION  (^( LABEL ID ))? (^(PARAMETERS ID+ ))?  p=. )
    -> {$p}
  ;


getBehaviorActionsFromELQ
  :
  ^(LCURLY (^(LITERAL_declare .*) )? ba=. RCURLY )
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
      $pre = new BAST("ASSERTION",BLESStoASTLexer.ASSERTION,$amp);
      BAST anAnd = new BAST("and",BLESStoASTLexer.LITERAL_and,$amp);
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
  ^( ass=ASSERTION  ^( l=LABEL a=ID ) ^(par=PARAMETERS lv+=ID+ )  p=. )
    -> ^($ass ^($l $a) ^($par $lv+) $p)
  |
  ^( ass=ASSERTION  ^( l=LABEL a=ID )  p=. )
    -> ^($ass ^($l $a) $p)
  |
  ^( ass=ASSERTION p=. ) 
    -> ^($ass $p)
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
      $post = new BAST("ASSERTION",BLESStoASTLexer.ASSERTION,$amp);
      BAST anAnd = new BAST("and",BLESStoASTLexer.LITERAL_and,$amp);
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
 
get_invariant_from_thread_behavior  
  :  
  ^(c=COMPONENT cc=. 
    (LITERAL_implementation ^(PERIOD dcti=ID des=ID)
      | ID)
    ( ^(LITERAL_features .+) )?
    ( ^(LITERAL_properties  .+) )?
    ^(LITERAL_annex LITERAL_BLESS 
      ^( THREAD_ANNEX  
      ^(LITERAL_states .+ ) 
      (^(LITERAL_availability .) )? 
      (^(LITERAL_assert .+) )?
      ^(LITERAL_invariant  ^( ass=ASSERTION  (^( LABEL a=ID ) )? ( ^(PARAMETERS lv+=ID+ ) )? predicate=. )) //must have invariant
      (^(LITERAL_variables .+) )?
      ^(LITERAL_transitions .+) 
//      (^(LITERAL_transitions .+) )?
      DO_NOT_PROVE?
      STOP
      )
    ) 
    LITERAL_end
  )
    -> ^($ass $predicate)  //get the predicate only
  ;  
  catch [RecognitionException re] 
  {Dump.it("Did you forget an invariant clause, Bub?");
  tell("ASTtoAST.get_invariant_from_thread_behavior",re,(BAST)retval.getTree());}

get_invariant_from_bless_subclause  
  :  
      ^( ta=THREAD_ANNEX  
      ^(LITERAL_states .+ ) 
      (^(LITERAL_availability .) )? 
      (^(LITERAL_assert .+) )?
      ^(LITERAL_invariant  ^( ass=ASSERTION  (^( LABEL a=ID ) )? ( ^(PARAMETERS lv+=ID+ ) )? predicate=. )) //must have invariant
      (^(LITERAL_variables .+) )?
      ^(LITERAL_transitions .+) 
//      (^(LITERAL_transitions .+) )?
      DO_NOT_PROVE?
      STOP
      )
    -> ^($ass $predicate)  //get the predicate only
  ;  
  catch [RecognitionException re] 
  {Dump.it("Did you forget an invariant clause, Bub?");
  tell("Did you forget an invariant clause, Bub?",re,$ta);
//  tell("ASTtoAST.get_invariant_from_bless_subclause",re,(BAST)retval.getTree());
  }

    
    
///////END OF FILE	