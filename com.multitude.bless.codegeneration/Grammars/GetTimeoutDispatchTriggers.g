//GetTimeoutDispatchTriggers.g
//find list of timeout dispatch triggers


tree grammar GetTimeoutDispatchTriggers;

options
{
tokenVocab=BLESStoAST;
ASTLabelType=BAST;
output=AST;
filter=true;  //tree pattern matching mode
backtrack=true;
}


@header  
{
//copyright 2012 Multitude Corporation
package com.multitude.bless.codegeneration.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.exceptions.Dump;
import java.util.Vector;
import java.util.HashSet;
import java.util.ArrayList;
import com.multitude.bless.antlr3generated.BLESStoASTLexer;

import com.multitude.bless.codegeneration.TimeoutRecord;
}

//suppress automatic exception handling
@rulecatch { }

@members
{

public GetTimeoutDispatchTriggers(BAST useThisASTforRoot)
  {
  this(new CommonTreeNodeStream(useThisASTforRoot));
  }

/*
public void tellClassCastException(String s, ClassCastException cce, BAST problem)
  {
  Dump.it("\n\nYou are a ninny. Class cast exceptions show you are obviously incompetent.\n\n");
  if (!toldASTtoOther)
    {
    Dump.it(s);
    toldASTtoOther=true;
    if (problem != null)
      {
      problem.showParseTree("ClassCastException");
      Dump.it(problem.toStringTree());
      }
    }
  Dump.it(cce);
  }  */

public boolean recognitionErrorOccurred = false;    //did a parse error occur?

public void reportError(RecognitionException ex)
  {
  Dump.it("GetTimeoutDispatchTriggers.reportError(RecognitionException ex)=> "
    +ex.toString());
  Dump.it(getErrorHeader(ex));
  Dump.it(ex);
  recognitionErrorOccurred = true;
  if ((ex.node!=null)&&(ex.node instanceof BAST))
    ((BAST)ex.node).showParseTree(((BAST)ex.node).getText());
  super.reportError(ex);
//  HelpfulHints.giveHint();
  }

public void emitErrorMessage(String msg) 
  {
  System.err.println(msg);
  Dump.it(msg);
  }

public Vector<BAST> s = new Vector<BAST>();

//private BAST sortPorts(BAST b)

} //end of members

topdown
  :
  get_timeout_dispatch_triggers
  ;

get_timeout_dispatch_triggers 
  :
  ^(t=LITERAL_timeout LPAREN ports+=ID+ RPAREN b=. {s.add($t.dupTree());})
 //   {//System.out.println("p1="+($p1==null?"null":$p1.toStringTree())+" p2="+($p2==null?"null":p2.toStringTree())+
    //" elq="+($elq==null?"null":$elq.toStringTree()));
 //   s.add($t.dupTree());}
  ;
//  catch [ProofException pe] {pe.handleProofException();}

///////END OF FILE	
