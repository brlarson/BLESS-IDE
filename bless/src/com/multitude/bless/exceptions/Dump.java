package com.multitude.bless.exceptions;
//(C) 2006 Multitude Corporation


//diverts to "dump file" from System.out


import java.io.IOException;

import org.antlr.runtime.RecognitionException;

import com.multitude.aadl.bless.BlessControl;
import com.multitude.bless.app.Global;
import com.multitude.bless.tree.BAST;

	public class 
Dump
{
static private int maxNesting = 100;	//how many levels is too many levels?
static private boolean bar[] = null;	//holds indications whether | should be drawn
static private int tabs=0;	//how many tabs in?
static private boolean dumpStackTraceToConsole = true;

	public static void
it() { it(""); }

	public static void
it(Exception ex) 
	{  
	it("Exception:  "+ex.getMessage());
	ex.printStackTrace();
	if (dumpStackTraceToConsole) ex.printStackTrace(System.out);	
	StackTraceElement[] trace = ex.getStackTrace();
	if (trace!=null)
		for (int i=0;i<trace.length;i++)
			{
			StackTraceElement ste = trace[i];
//			it(Integer.toString(trace.length-i)+"\t"+ste.toString());
			it(ste.toString());
			}	//end of for
	if (ex instanceof RecognitionException)
		{
		RecognitionException re = (RecognitionException)ex;
		if (re.token!=null) 
			it("token text="+re.token.getText()+
			  " token type="+Integer.toString(re.token.getType())+
			  " token line="+Integer.toString(re.token.getLine())+
			  " token position in line="+Integer.toString(re.token.getCharPositionInLine())			  
			  );
		else
			it("line="+Integer.toString(re.line)+
			  " position in line="+Integer.toString(re.charPositionInLine)			  
			  );
		if ((re.node!=null)&&(re.node instanceof BAST))
			{
			BAST b=(BAST)re.node;
			it("BAST text="+b.getText()+
			  " BAST type="+Integer.toString(b.getType())+
			  " BAST line="+Integer.toString(b.getLine())+
			  " position in line="+Integer.toString(b.getCharPositionInLine())			  
			  );
			it("BAST.toStringTree()=\n  "+b.toStringTree());
			}	//end of BAST
		}	//done with RecognitionException	
 //repaint now (only for application)
//	  if (BLESS.consoleScrollPane!=null)
//		BLESS.consoleScrollPane.paintImmediately(
//						new Rectangle(BLESS.consoleScrollPane.getWidth(),
//				BLESS.consoleScrollPane.getHeight()));	
}	//end of it(Exception ex)

  public static int stringCount=0;
  
  public static int stringRepaintLimit=100;

  
  public static void
error(String s)
  {
  System.err.println(s);  
  it(s);
  }
  
  public static void
it(String s)
  {
  BlessControl.println(s);
  s += "\n";  //add a newline at the end
  if (!Global.dumpFileClosed&&!Global.suppressOutput)
  	{
  	if (Global.useDumpFile&&(Global.fw!=null)&&
  			(Global.df!=null)&&Global.df.canWrite())
  		try
  		{
  		Global.fw.write(s,0,s.length());
  		}
  	catch (IOException e)
  		{
  		Dump.it("\nI/O error writing dump.txt file");
  		e.printStackTrace(System.out);   // so we can get stack trace
  		}
  	if (!Global.useDumpFile||Global.dumpToSystemOutToo)
  		System.out.print(s);
  	}
  } //end of Dump.it

  public static void
itToProofFile(String s)
  {
  if (!Global.proofFileClosed)
    {
    s += "\n";  //add a newline at the end
    if (Global.useProofFile&&(Global.fwProof!=null)&&
        (Global.dfProof!=null)&&Global.dfProof.canWrite())
      try
      {
      Global.fwProof.write(s,0,s.length());
      }
      catch (IOException e)
        {
        Dump.it("\nI/O error writing proof.txt file");
        e.printStackTrace(System.out);   // so we can get stack trace
        }
    }
  } //end of Dump.itToProofFile

  public static void
itToScriptFile(String s)
  {
  if (!Global.scriptFileClosed)
    {
    s += "\n";  //add a newline at the end
    if (Global.useScriptFile&&(Global.fwScript!=null)&&
        (Global.dfScript!=null)&&Global.dfScript.canWrite())
      try
      {
      Global.fwScript.write(s,0,s.length());
      }
      catch (IOException e)
        {
        Dump.it("\nI/O error writing proof script file");
        e.printStackTrace(System.out);   // so we can get stack trace
        }
    }
  } //end of Dump.itToScriptFile


  public static void
flush()
  {   //flush the last characters of the file writer
  try
    {
    if (Global.fw!=null)
      Global.fw.flush();
    if (Global.fwScript!=null)
      Global.fwScript.flush(); 
    if (Global.fwProof!=null)
      Global.fwProof.flush();  
    } 
  catch (IOException e)
    {
    System.out.println("IOException during flush:  "+e.getMessage());
//    e.printStackTrace();
    }  
  }  //end of flush

  public static void
close()
  {   //close the dump file
  if (!Global.dumpFileClosed)
    if (Global.fw!=null)
      try
      {
			Dump.it("closing dump.txt file \""+Global.df.getAbsolutePath()+"\"");
      String s = "closing dump.txt file; ";
      System.out.print(s);
      if (Global.useDumpFile&&(Global.fw!=null)&&
          (Global.df!=null)&&Global.df.canWrite())
        Global.fw.write(s,0,s.length());    
      Global.fw.flush();  //flush the last characters of the file writer
      Global.fw.close();  //close the file writer
      }
      catch (IOException e)
      {
      Dump.it("\nError while closing dump.txt file\n");
      e.printStackTrace();
      } //done catching file closing
  Global.dumpFileClosed = true;
  if (!Global.scriptFileClosed)
    if (Global.fwScript!=null)
      try
      {
			Dump.it("closing script.txt file \""+Global.dfScript.getAbsolutePath()+"\"");
      String s = "#closing script.txt file:  \""+Global.dfScript.getAbsolutePath()+"\"";
      Dump.it(s);
      if (Global.useScriptFile&&(Global.fwScript!=null)&&
          (Global.dfScript!=null)&&Global.dfScript.canWrite())
        Global.fwScript.write(s,0,s.length());    
      Global.fwScript.flush();  //flush the last characters of the file writer
      Global.fwScript.close();  //close the file writer
      }
      catch (IOException e)
      {
      Dump.it("\nError while closing proof script file\n");
      e.printStackTrace();
      } //done catching file closing
  Global.scriptFileClosed = true;
//  closeProofFile();
  } //end of close()

  public static void
closeProofFile()
  {   //close the proof file
  if (!Global.proofFileClosed)
    if (Global.fwProof!=null)
      try
      {
      String s = "closing proof.txt file ";
      Dump.it(s);
      if (Global.useProofFile&&(Global.fwProof!=null)&&
          (Global.dfProof!=null)&&Global.dfProof.canWrite())
        Global.fwProof.write(s,0,s.length());    
      Global.fwProof.flush();  //flush the last characters of the file writer
      Global.fwProof.close();  //close the file writer
      }
      catch (IOException e)
      {
      Dump.it("\nError while closing proof.txt file\n");
      e.printStackTrace();
      } //done catching file closing
  Global.proofFileClosed = true;
  } //end of closeProofFile()

	public static void
tree(BAST t)
	{	//dump tree, usually Theorems
	if (bar==null) bar = new boolean[maxNesting];
	String s = "";	//t's string
	//tab in, add t's message
	for (int i=0;i<tabs;i++) 
		if (bar[i]) s +="| ";
		else s+="  ";
	s+="|-";
	s+=t.getText();
	it(s);	//dump it
  itToProofFile(s);  //to proof.txt file too
//	if (t.hasChildren())
//		{	//have children
//		tabs++;	//tab in
//		bar[tabs] = true;	//start doing bar
//		BAST ch = (BAST)t.getFirstChild();
//		while (ch!=null)
//			{
//			if (ch.getNextSibling()==null)	//is this the last child?
//				bar[tabs]=false;	//stop making bar
//			tree(ch);	//dump its tree
//			ch = (BAST)ch.getNextSibling();	//go on to next
//			}		
//		tabs--;	//tab out
//		}	//done with children
	}	//end of Dump.tree

	
/**dump a RecognitionException*/	
	public static void
re(RecognitionException ex)
  {
  it("\nYou threw another recognition exception, "+Global.dope+"! \n\n"+
  	"Because you\'re a pitiable "+Global.dope+", we try to tell you as much about your error as we feel like.  Enjoy:");
	BAST problemTree = ((ex.node!=null)&&(ex.node instanceof BAST)?
									(BAST)ex.node:null); 
	if (problemTree!=null)
		{
		Dump.it("problem tree root:  "+problemTree.getText());
		Dump.it("problem tree (as string):  "+problemTree.toStringTree());
//		problemTree.showParseTree("RecognitionException");
		}
	if (ex.token!=null)
		{
		Dump.it("problem token:  "+ex.token.getText());
		Dump.it("problem token line="+Integer.toString(ex.token.getLine())+
			" pos="+Integer.toString(ex.token.getLine()));
		Dump.it("problem token index="+Integer.toString(ex.token.getTokenIndex())+
			" type="+Integer.toString(ex.token.getType()));		
		}
//	ex.printStackTrace();
	if (!Global.stackTracePrinted)
		{
		it("level\t call stack trace");
		StackTraceElement[] ste = ex.getStackTrace(); 
		for (int k=0;k<ste.length;k++)
			Dump.it(Integer.toString(ste.length-k)+"\t"+ste[k].toString());     
		//					Dump.it(getMessage());
		ex.printStackTrace(System.out);       
		ex.printStackTrace(Global.pw);
		Global.stackTracePrinted=true;
		}
  }	//end of re

	

}	//end of Dump class

