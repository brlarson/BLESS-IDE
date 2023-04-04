package com.multitude.bless;

import java.awt.Frame;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import javax.swing.UIManager;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin
{

// The plug-in ID
public static final String PLUGIN_ID = "com.multitude.BLESS";

// The shared instance
public static Activator plugin;
private Bundle bundle;

//the console for BLESS
public static MessageConsole console;
//the message stream for the console
public static MessageConsoleStream consoleStream;


//public static TreeTabbedPane treeTabbedPane = null;	//hold pane with tabs
public static Frame frame = null;  //frame that holds treeTabbedPane
public static Shell myShell = null;  //shell that holds the frame

public static String stringTemplateGroupFolder = "StringTemplateGroups/";		//prefix to .stg file names,

/**
 * The constructor
 */
public Activator()
	{
//USE CONSOLE IN BlessControl	
//	//create the console
//	console = new MessageConsole("BLESS Console",null);
//	//get its message stream
//	consoleStream = console.newMessageStream();
//	//activate console when this stream is written to
// 	consoleStream.setActivateOnWrite(true);
//	//add console to the console plugin
//	IConsole[] consoles={console};
//	ConsolePlugin.getDefault().getConsoleManager().addConsoles(consoles);
//	//show the console
//	ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
	}

/*
 * (non-Javadoc)
 *
 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
 */
@Override
public void start(BundleContext context) throws Exception
	{
	super.start(context);
	plugin = this;
	bundle = context.getBundle();
	Time.startTime = System.currentTimeMillis();
	Time.today = new Date(Time.startTime);
	Time.todayString = Time.today.toString();
	Global.runningAsOSATEplugin=true;
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	Dump.it("\nBehavioral Language for Embedded Systems with Software Proof Tool "+
			BLESS.versionDate+" at "+Time.todayString);
	Dump.it("\nCopyright (C) "+Global.CopyrightYear+", Multitude Corporation.  All rights reserved.\n");
	Dump.it("Works with OSATE "+Global.OsateVersion+" on Eclipse "+Global.EclipseVersion);
	Dump.it("Praying hands icon made by Freepik from www.flaticon.com is licensed by Creative Commons BY 3.0");
  Dump.it("Java="+System.getProperty("java.class.version")+" user="+System.getProperty("user.name"));
  Dump.it("To use BLESS hot-key bindings select:  Preferences->General->Keys then choose scheme \"BLESS hot keys\"\n");
  Global.setUpFiles();
//  Dump.it(System.getProperties().toString());
	//set up dump file
//	if (Global.useDumpFile)
//		{
//		try
//			{
//			Global.df = new File("dump.txt");
//			Global.fw = new FileWriter(Global.df);
//			Global.pw = new PrintWriter(Global.fw);
//			Dump.it("opening dump file \""+Global.df.getAbsolutePath()+"\" "+
//					Time.todayString);
//			}
//		catch (IOException e)
//			{
//			Global.exceptionOccurred = true;
//			Dump.it("Error while making dump file");
//			e.printStackTrace(System.out);
//			} //done catching file making
//		} //done setting up dump file
//	if (Global.useProofFile)
//		{
//		try
//			{
//			Global.dfProof = new File("proof.txt");
//			Global.fwProof = new FileWriter(Global.dfProof);
//			Global.pwProof = new PrintWriter(Global.fwProof);
//			Dump.it("opening proof file \""+Global.dfProof.getAbsolutePath()+"\" "+
//					Time.todayString);
//			}
//		catch (IOException e)
//			{
//			Global.exceptionOccurred = true;
//			Dump.it("Error while making proof file");
//			Dump.it(e.getMessage());
//			e.printStackTrace(System.out);
//			} //done catching file making
//		Dump.itToProofFile("This file, proof.txt, was produced the BLESS Proof Assistant "+BLESS.versionDate);
//		Dump.itToProofFile("  at "+Time.todayString+" by "+System.getProperty("user.name")+"\n");
//		} //done setting up dump file
//	if (Global.useScriptFile)
//		{
//		String fileName = "script.txt";
//		try
//			{
//			Global.dfScript = new File(fileName);
//			Global.fwScript = new FileWriter(Global.dfScript);
//			Global.pwScript = new PrintWriter(Global.fwScript);
//			Dump.it("opening proof script file \""+Global.dfScript.getAbsolutePath()+"\"\n");
//			}
//		catch (IOException e)
//			{
//			Global.exceptionOccurred = true;
//			Dump.it("Error while making script file");
//			Dump.it(e.getMessage());
//			e.printStackTrace(System.out);
//			} //done catching file making
//		Dump.itToScriptFile("#This file, "+fileName+", was produced the BLESS Proof Assistant "+BLESS.versionDate);
//		Dump.itToScriptFile("#  at "+Time.todayString+" by "+System.getProperty("user.name"));
//		} //done setting up dump file
//	//make frame for treeTabbedPane
//	final Display display = getWorkbench().getDisplay();
//	myShell = new Shell(display);
//  Composite composite = new Composite(myShell, SWT.EMBEDDED); // | SWT.NO_BACKGROUND);
//  composite.setLayout(new FillLayout());
//  frame = SWT_AWT.new_Frame(composite);
//  java.awt.Panel panel = new java.awt.Panel(new java.awt.BorderLayout());
//  frame.add(panel);
//  //make the tree tabbed pane
//	treeTabbedPane = new TreeTabbedPane();
//	panel.add(treeTabbedPane, BorderLayout.CENTER);
//	panel.setVisible(true);
////	frame.setVisible(true);
//	myShell.setText("BLESS trees");
//	//open the Shell
//	myShell.open();
	//READ IN STRING TEMPLATE GRAMMAR FILE
		//read in BLESS.stg (or BA.stg)
	try
		{
		Global.templates=loadStringTemplateGroup(stringTemplateGroupFolder+"BLESS3.stg");
		Global.BLESStemplates = Global.templates;
		}
	catch(Exception e)
		{
		if (!Global.dumpFileClosed)
			{
			Global.dumpToSystemOutToo = true;
			if (!Global.stackTracePrinted)
				{
				Dump.it(e.getMessage());
				e.printStackTrace(System.out);
				e.printStackTrace(Global.pw);
				Global.stackTracePrinted=true;
				}
			Dump.it("Exception caught by Activator.start");
			//					if (BLESS.parser!=null)
			//						Dump.it(BLESS.parser.getSurroundingTokens());
			//					BAST whatsLeft = Global.currentCompilationUnitRoot;
			//					if (whatsLeft!=null)
			//						whatsLeft.showParseTree("really bad error tree "+e.getMessage());
			Global.exceptionOccurred = true;
			//			e.printStackTrace(System.out);   // so we can get stack trace
			//			e.printStackTrace(Global.pw);
			if (e instanceof YouIdiot) {
				((YouIdiot)e).handleException();
			}
			//					else if (e instanceof ProofException)
			//						((ProofException)e).handleProofException();
			Dump.close();
			}
		}	//end of catch(Exception e)
	catch (Throwable e)
		{
		System.err.println("Error!  caught Throwable exception in Activator.start ");
		e.printStackTrace();
		}
//load BLESS data structures
//	LoadBLESS.load();
//	myShell.open();
//	while (!myShell.isDisposed()) {
//		if (!display.readAndDispatch()) display.sleep();
//	}
//	display.dispose();
	}  //end of start

/*
 * (non-Javadoc)
 *
 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
 */
@Override
public void stop(BundleContext context) throws Exception
	{
	plugin = null;
	super.stop(context);
	}

/**
 * Returns the shared instance
 *
 * @return the shared instance
 */
public static Activator getDefault()
	{
	return plugin;
	}

public static StringTemplateGroup
loadStringTemplateGroup(String templateFileName)
		throws YouIdiot
{
	StringTemplateGroup templates=null;
//Dump.it("opening StringTemplateGroup file:  "+templateFileName);
	//set flags if using BA.stg or DataModel.stg instead of BLESS.stg
	Global.usingDataModelStringTemplateGroup  = (templateFileName.compareTo("DataModel.stg")==0);
	Global.usingBAStringTemplateGroup  = (templateFileName.compareTo("BA.stg")==0);
	Global.usingBLESSStringTemplateGroup  = (templateFileName.compareTo("BLESS.stg")==0);
	//if it ends in .stg
	try
	{
		if ((templateFileName.length()>4) &&
				templateFileName.substring(templateFileName.length()-4).equals(".stg"))
		{
			if (Global.runningAsOSATEplugin)
			{  //I'm a plugin
				// code to retrieve an java.io.InputStream
				Path stgPath =  new Path(templateFileName);
				if (stgPath==null) {
					throw new YouIdiot(templateFileName+" cannot be found!");
				}
				InputStream inputStream = FileLocator.openStream(
						Activator.getDefault().getBundle(),stgPath, false);
				InputStreamReader isr = new InputStreamReader(inputStream);
				templates = new StringTemplateGroup(isr,AngleBracketTemplateLexer.class);
			} else {
				templates = new StringTemplateGroup(new FileReader(templateFileName),
						AngleBracketTemplateLexer.class);
			}
		}
		else
		{
			//				Dump.it("The first parameter must be a StringTemplateGroup file: *.stg like BLESS3.stg or BA.stg");
			extracted();
		}
	}
	catch (FileNotFoundException fnfe)
	{
		Dump.it(fnfe);
		throw new YouIdiot("The StringTemplateGroup "+templateFileName+" file could not be found");
	}
	catch (IOException ioe)
	{
		Dump.it(ioe);
		throw new YouIdiot("The StringTemplateGroup "+templateFileName+" file caused an IO exception.");
	}
	return templates;
} 	//end of loadStringTemplateGroup

private static void extracted() throws YouIdiot
  {
  throw new YouIdiot("The first parameter must be a StringTemplateGroup file: *.stg like BLESS.stg or BA.stg");
  }

}
