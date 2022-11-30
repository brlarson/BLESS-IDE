//NormalizeParentheses.g
//use tree pattern matching to normalize trees


tree grammar ToSlangExp;

options {
tokenVocab=BLESStoAST;
ASTLabelType=BAST;
language = Java;
output=AST;
backtrack=true;  //very, very important
filter=true;  //activates tree pattern matching mode
//k=3;
}

@header 
{
//copyright 2012 Multitude Corporation
package com.multitude.bless.codegeneration.antlr3generated;
import java.util.List;
import java.util.ArrayList;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;

import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.app.Global;
import com.multitude.bless.antlr3generated.BLESStoASTLexer;
}

@members
{
//static boolean verbose = ConfigurationPreferencePage.getVerboseProof();

public List<String> featureNames = null;

public void reportError(RecognitionException ex)
  {
  Dump.it("ToSlangExp.reportError(RecognitionException ex)=> "
    +ex.toString());
    Dump.it(getErrorHeader(ex));
    String[] tokenNames=new String[10];
    Dump.it(getErrorMessage(ex,tokenNames)+"\n----");
  StackTraceElement[] ste = ex.getStackTrace(); 
  for (int k=0;k<ste.length;k++)
    Dump.it("   "+ste[k].toString());     
  HelpfulHints.giveHint();
  }

public void emitErrorMessage(String msg) 
  {
  System.err.println(msg);
  Dump.it(msg);
  }
 
//public boolean substitutionMade = false; //made true when replacement is made  

/*     public Object downup(Object t) {
         TreeVisitor v = new TreeVisitor(new CommonTreeAdaptor());
         TreeVisitorAction actions = new TreeVisitorAction() {
             public Object pre(Object t)  { return applyOnce(t, topdown_fptr); }
             public Object post(Object t) { return applyOnce(t, bottomup_ftpr); }
         };
         t = v.visit(t, actions);
         return t;
     }
     
     fptr topdown_fptr = new fptr() {
         public Object rule() throws RecognitionException { return topdown(); }
     };
     
     fptr bottomup_ftpr = new fptr() {
         public Object rule() throws RecognitionException { return bottomup(); }
     };
*/



} //end of members

topdown
  :
  removeDuplicateParentheses
  | convertFeatureNames
  ;

 bottomup
  :	
  removeTopParentheses
  ;   


removeDuplicateParentheses
  :
  ^(LPAREN ^(lp=LPAREN x=. rp=RPAREN ) RPAREN )
    -> ^($lp $x $rp)
  ;

removeTopParentheses
  :	
  ^(lp=LPAREN x=. RPAREN {lp.getParent() == null}?)
    -> $x
  ;
 
convertFeatureNames
  :
  ^(p=PERIOD label=ID rest+=ID+ { featureNames.contains($label.text) }? )
    -> ^($p ID["api"] ID["get_"+$label.text+"()"] ID["get"] $rest+)
  |
  ^(p=PERIOD label=ID { featureNames.contains($label.text) }? )
    -> ^($p ID["api"] ID["get_"+$label.text+"()"] ID["get"] )
  ;
 
  