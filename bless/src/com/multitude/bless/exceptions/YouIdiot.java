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
BAST otherAst=null;
public static int countYouIdiot = 0;
String errorMessage="";	//error message when exception is thrown

public static Vector<String> error_messages = new Vector<String>();

	public 
YouIdiot(String s) 
	{ 
	errorMessage=s;
	error_messages.add(errorMessage);
  countYouIdiot++;
	}	//default constructor

  public //know AST
YouIdiot(String s, BAST errorAST) 
  { 
  ast = errorAST;
  errorMessage=s;
  error_messages.add(errorMessage);
  countYouIdiot++;
  } //end of know AST constructor

  public //know AST
YouIdiot(String s, BAST firstAST, BAST secondAST) 
  { 
  ast = firstAST;
  otherAst = secondAST;
  errorMessage=s;
  error_messages.add(errorMessage);
  countYouIdiot++;
  } //end of know AST constructor

public
YouIdiot(Exception ex)
  {
  errorMessage=ex.getMessage();
  error_messages.add(errorMessage);
  countYouIdiot++;
  ex.printStackTrace();
  Dump.error("YouIdiot made from Exception:  "+errorMessage);  
  }
  
	public void
handleException()
	{
	Long time = System.currentTimeMillis();
	if (countYouIdiot<Global.YouIdiotReportLimit)
		{
		//print current time
	Date today = new Date(time);
	//give hint?
	if (countYouIdiot%Global.hintRatio==3)	// 1 out of hintRatio gets HelpfulHints
		{
  	Dump.error("\n*********************************************");
		HelpfulHints.giveHint();	
		Dump.error("*********************************************\n");
		}
	else Dump.error("time of exception: "+today.toString()+".");
	Dump.error("\n"+errorMessage+"\n");
	String line1 = "";
	String line2 = "";
  if ((ast!=null)&&(ast.getLine()>0))
    line1 = "("+ast.getText()+":"+Integer.toString(ast.getLine())+")";    
  if ((otherAst!=null)&&(otherAst.getLine()>0))
    line2 = "\n("+otherAst.getText()+":"+Integer.toString(otherAst.getLine())+")";   
	Dump.error(line1+" "+line2);  //+line3);
  if (ast!=null) Dump.error("ast="+ast.toStringTree());
  if (otherAst!=null) Dump.error("ast="+otherAst.toStringTree());
	printStackTrace(System.out);       
      Global.stackTracePrinted=true;
		}	//end of you idiot report
  if ((ast!=null)&&(countYouIdiot<Global.YouIdiotShowParseTreeLimit)) 
    ast.showParseTree("error #"+Integer.toString(countYouIdiot));
  if ((otherAst!=null)&&(countYouIdiot<Global.YouIdiotShowParseTreeLimit)) 
    otherAst.showParseTree("error #"+Integer.toString(countYouIdiot));
	}	//end of handleException

	
}	//end of YouIdiot