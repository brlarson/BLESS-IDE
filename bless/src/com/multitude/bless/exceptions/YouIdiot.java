package com.multitude.bless.exceptions;
//(C) 2009 Multitude Corporation


import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;

import com.multitude.bless.app.Global;
import com.multitude.bless.tree.BAST;


//renamed from YouIdiot

	public class
YouIdiot extends RecognitionException implements Serializable 
{

private static final long serialVersionUID = -1517908051668860378L;
BAST ast=null;
public static int countYouIdiot = 0;
String errorMessage="";	//error message when exception is thrown
//private Color COLOR_RED = Display.getDefault().getSystemColor(SWT.COLOR_RED);
//private Color COLOR_BLACK = Display.getDefault().getSystemColor(SWT.COLOR_BLACK);

public static Vector<String> error_messages = new Vector<String>();

	public 
YouIdiot(String s) 
	{ //super(s);
	errorMessage=s;
	error_messages.add(errorMessage);
  countYouIdiot++;
//	Dump.error("\n\nYouIdiot:  "+s+"\n");
	}	//default constructor

  public //know AST
YouIdiot(String s, BAST errorAST) 
  { 
  //super(s); 
  ast = errorAST;
  errorMessage=s;
  error_messages.add(errorMessage);
  countYouIdiot++;
//  Dump.error("\n\nYouIdiot:  "+s+"\n");
  } //end of know AST constructor

public
YouIdiot(Exception ex)
  {
  //super(ex.getMessage()); 
  errorMessage=ex.getMessage();
  error_messages.add(errorMessage);
  countYouIdiot++;
  ex.printStackTrace();
  Dump.error("YouIdiot made from Exception:  "+errorMessage);  
  }
  
	public void
handleException()
	{
	//change console color
//	if (Activator.consoleStream!=null)
//	  Activator.consoleStream.setColor(COLOR_RED);
  //stop proving
  // Global.stopProof = true;
	Long time = System.currentTimeMillis();
	if (countYouIdiot<Global.YouIdiotReportLimit)
		{
		//print current time
	Date today = new Date(time);
	//give hint?
	if (time.intValue()%Global.hintRatio==3)	// 1 out of hintRatio gets HelpfulHints
		{
  	Dump.error("\n*********************************************");
//  	Dump.error("You are a "+HelpfulHints.getIdiot()+", "+today.toString()+".");
		HelpfulHints.giveHint();	
		Dump.error("*********************************************\n");
		}
	else Dump.error("time of exception: "+today.toString()+".");
//	if (Activator.consoleStream!=null)
//	  Activator.consoleStream.setFontStyle(SWT.BOLD);
	Dump.error("\n"+errorMessage+"\n");
//	if (Activator.consoleStream!=null)
//	  Activator.consoleStream.setFontStyle(SWT.NORMAL);
	//special hints
//	if ((ast!=null)&&ast.hasType(BLESStoASTLexer.OLD_NEQ))
//		Dump.error("Try using <> for inequality instead of !=");
	//these throw exceptions
//	if (Parse.parser.input.LT(1).getText().compareTo(")")==0)
//		Dump.error("\nDo you have an extra (or missing) parenthesis?\n");
//	if (Parse.parser.input.LT(0).getText().compareTo("return")==0)
//		Dump.error("\nDid you forget an identifier for the return variable?\n");
	String line1 = "";
	String line2 = "";
//	String line3 = ((Parse.parser!=null)&&(Parse.parser.input!=null)&&(Parse.parser.input.LT(0)!=null)?
//			Integer.toString(Parse.parser.input.LT(0).getLine()):"");
//	if (Parse.lexer!=null)
//		line1 = String.valueOf(Parse.lexer.getLine());
	if ((ast!=null)&&(ast.getLine()>0))
		line2 = Integer.toString(ast.getLine());		
	Dump.error("line numbers:  BLESS.lexer="+line1+", "+(ast!=null?" ast="+line2+", ":"")+
		"Parse.parser.input.LT(0).getLine()=");  //+line3);
	if (ast!=null) Dump.error("ast.toStringTree()="+ast.toStringTree());
//	if ((Parse.parser!=null)&&(Parse.parser.input!=null)&&(Parse.parser.input.LT(0)!=null))
//		Dump.error("surrounding tokens:  "+Parse.parser.input.LT(-1).getText()+
//			" |"+Parse.parser.input.LT(0).getText()+"| "+Parse.parser.input.LT(1).getText());
//	if (!Global.dumpFileClosed)
//		{
//		if (!Global.stackTracePrinted)
//			{
	  Dump.error((ast!=null?"from line "+Integer.toString(ast.getLine())+":  \"":"\"")+getMessage()+"\"");
//	Dump.error("level\t call stack trace");
//			StackTraceElement[] ste = getStackTrace(); 
//			for (int k=0;k<ste.length;k++)
//				Dump.error(Integer.toString(ste.length-k)+"\t"+ste[k].toString());     
			//					Dump.error(getMessage());
			printStackTrace(System.out);       
//			printStackTrace(Global.pw);
      Global.stackTracePrinted=true;
//       } 
//    }  
		}	//end of you idiot report
	//give insult?
	if (time.intValue()%(Global.hintRatio*Global.hintRatio)==7)	// 1 out of hintRatio^2 gets idiot
		{
		String insult = HelpfulHints.getIdiot();
		String article = "a";  //defoult
		//change to "an" => look a first letter for plural
		char firstLetter = insult.charAt(0);
		if ((firstLetter=='a')||(firstLetter=='e')||(firstLetter=='i')||(firstLetter=='o')||(firstLetter=='u'))
			article = "an";
		Dump.error("Have you considered you may indeed be "+article+" "+insult+"? ");			
		}	//end of give insult
//	countYouIdiot++;
	if ((ast!=null)&&(countYouIdiot<Global.YouIdiotShowParseTreeLimit)) 
		ast.showParseTree("error #"+Integer.toString(countYouIdiot));
	if (ast!=null)
		Dump.error("error #"+Integer.toString(countYouIdiot)+" tree:\n"+ast.toStringTree());
	else
		Dump.error("error #"+Integer.toString(countYouIdiot)+" did not have a tree passed.");
	Global.exceptionOccurred = true;
 //repaint now 		
//	if (!Global.runningAsOSATEplugin)
//		BLESS.consoleScrollPane.paintImmediately(
//						new Rectangle(BLESS.consoleScrollPane.getWidth(),
//				BLESS.consoleScrollPane.getHeight()));
//	if (ast!=null)
//		setErrorMarker(errorMessage,ast.getLine(),ast);
	//change console color
//	if (Activator.consoleStream!=null)
//	  Activator.consoleStream.setColor(COLOR_BLACK);    
	}	//end of handleException


//	public static void
//setErrorMarker(String message, int line, BAST node)
//		{
//		if (node.getElement()!=null)
//			{
//			if (BLESSmarker.errManager==null)
//				BLESSmarker.errManager = new AnalysisErrorReporterManager(
//						new MarkerAnalysisErrorReporter.Factory("com.multitude.bless.BLESSErrorMarker"));  	
//			BLESSmarker.errManager.error(node.getElement(), message);
//			}
//		else Dump.it("AADL element in BAST is null:  "+node.toStringTree());
//		}		//end of setErrorMarker
	
}	//end of YI