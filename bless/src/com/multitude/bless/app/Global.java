//Global.java

package com.multitude.bless.app;
//(C) 2006 Multitude Corporation

//holds global state variables

//import exceptions.Dump;
//import gui.DANCE;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Vector;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Property;
import org.osate.xtext.aadl2.properties.util.GetProperties;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;

import com.multitude.bless.BLESS;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.tree.BAST;

	public class
Global	//global variables
{
public static String CopyrightYear = "2023";
public static String OsateVersion = "2.13.0";
public static String EclipseVersion = "2023_03";

public static boolean kindMessages = true;  //put out kind rather than insulting messages
public static boolean runningAsOSATEplugin = false;
public final boolean beChatty = false;		//dump to console?
public static final String dope = HelpfulHints.getIdiot();
//public BLESS app;	 	//pointer to application Frame
public int numLevels;	//number of levels
//public State startNode;		//top node of the lattice being constructed
//public State endNode;		//bottom node of the lattice being constructed
//public Floor[] elevator;	//pointer to leftmost state in each level
		//elevator[l] => must have length=numLevels+1 (elevator[0] is unused)
//MAKE THESE CONSTANTS
public static final int howBigIsIt = 800;
public int pixelsPerLevel = 25;
public int nodeRadius = 6;
public final int halfFatLineWidth = 2;
public final int pixelsBetweenDots = 4;	//really dot centers, sort of
public final int dashLength = 5;
public int elipsisDiameter = 5;	  //2*nodeRadius-2 / 3
public String paintErrorMsg = "";	//start with null string, look for
		// non-empty string after repainting
public boolean scrunch = false;	//scrunch epsilon arcs in output?
public boolean doSim = false;	//flag for thread in AnimateCanvas
public int step = 0;		//what step of graphi substitution is this?
public static boolean exceptionOccurred = false;	//did an exception occur?
public static boolean haveSomethingToPaint = false;
public static BAST currentCompilationUnitRoot = null;
//public static Vector frameList = new Vector();
	//frameListholds pointers to frames to kill later

public static final int RANDOM_SATISFACTION = 1;
public static final int TOP_DOWN_SATISFACTION = 2;
public static final int MOST_FIRST_SATISFACTION = 3;
public static int satisfactionMode = MOST_FIRST_SATISFACTION;
	//satisfactionMode control choice of arcs to satisfy
public static boolean currentlyParsingAssertion = false;

  //dump.txt file stuff
public static File df = null; //dump file for output
public static FileWriter fw = null; //file writer for output
public static PrintWriter pw = null;  //print writer for e.printStackTrace();
public static boolean useDumpFile = true; //dump output to text file?
public static boolean dumpToSystemOutToo = true; //dump output to window?
public static boolean dumpFileClosed = false; //have we already closed the dump file?
public static boolean suppressOutput = false;  //inhibit output to console

  //proof rule control flags
public static boolean tryTopLevelSubstitution = false;  //allow top level =
public static boolean substitueEqualsAnywhere = false;  //substitute = anywhere => dangerous
public static boolean ageTicksInReplaceOccurances = false;  //age ticks in replaceOccurances?
public static boolean stackTracePrinted = false;  //has an exception already had its stact trace?

//proof.txt file stuff
public static File dfProof = null; //proof file for output
public static FileWriter fwProof = null; //file writer for proof
public static PrintWriter pwProof = null;  //print writer for e.printStackTrace();
public static boolean useProofFile = true; //dump proof output to proof.txt?
public static boolean proofFileClosed = false; //have we already closed the proof.txt file?

//script recording file stuff
public static File dfScript = null; //script file for output
public static FileWriter fwScript = null; //file writer for proof script
public static PrintWriter pwScript = null;  //print writer for e.printStackTrace();
public static boolean useScriptFile = true; //dump proof script output to file
public static boolean scriptFileClosed = false; //have we already closed the proof script file?

  //window stuff
public static boolean showTree = false;	//show tree after parse?
	public static Vector<BAST> treesToShow = null; // holds parse trees to show
public static int lineHeight = 12;		//editor line height in pixels
public static int characterWidth = 6;	//editor character width
public static boolean showLineNumbers = true;	//include line numbers?
public static Font editorFont = Font.decode("Courier-PLAIN-"+Integer.toString(lineHeight));
public static Color defaultColor = Color.black;	//default color in editor
public static Color stringColor = Color.blue;	// color  of strings in editor
public static Color commentColor = Color.lightGray;	// color  of comments in editor
public static Color assertionColor = Color.pink;	// color of assertions in editor
public static Color reservedColor = Color.red;		// color of reserved words
public static Color inferredColor = Color.magenta;		// color of inferred assertions
public static int spacesPerTab = 2;	//how many spaces per tab (preceeding only!)
public static double tabConsoleSplitResizeWeight = 0.66; //fraction of window to be tabs  66% tabs  34% console

//string template stuff
public static StringTemplateGroup templates = null;  
public static StringTemplateGroup BLESStemplates = null;  
public static StringTemplateGroup ISOSCELEStemplates = null;
public static StringTemplateGroup JSONtemplates = null;
public static StringTemplateGroup Slangtemplates =null;
public static StringTemplateGroup BAtemplates =null;
public static StringTemplateGroup DataModeltemplates =null;
public static String componentName = "";	//name of current aadl component
public static String fileName = "";	//name of current file being parsed
public static String packageOrPropertySetID = "";	//used to generate BA or DataModel text for a package to hold the data component declarations
public static boolean usingDataModelStringTemplateGroup = false;	//using DataModel.stg?
public static boolean usingBAStringTemplateGroup = false;	//using BA.stg?
public static boolean usingBLESSStringTemplateGroup = false; //using BLESS3.stg?
public static boolean usingSignalStringTemplateGroup = false; //using Signal.stg?
public static boolean usingSlangStringTemplateGroup = false; //using Slang.stg?
public static int newlineNodeCountThreshold = 20;	//how many nodes in tree needed to get a newline prepended

public static boolean preNormalize = false;	//normalize string upon reading file?
public static int wrapLength = 72;	//length of line for wrapping unparsed strings

public static int startingLine = 0; //starting line of sublanguage in AADL file

//flags used by proof engine
public static boolean generateSuperfluousProofObligations = false;	//make proof obligations:  <<M(a) and b>> => <true> ?
public static boolean punishSuperfluousProofObligations = false;	//punish missing assertions on states?
//public static boolean routinelyNormalize = false;		//normalize w/o generating theorems?
public static boolean displayIntermediateProofObligations = false;		//show PO trees after each proof phase?
public static boolean sortProofObligationsByLineNumber = false;		//put po's in line number order
public static boolean sortProofObligationsBySerialNumber = true;		//put po's in serial number order
public static boolean removeAssertionLabels = false;		//remove rather than replace Assertion labels?
public static boolean allQuantifiedVariablesAreEqual = true;		//used by BAST.equalTree() to make #12# = #2#, should really set up a Map when encountering exists or all quantified variables and check the map instead, but this shouldn't be a problem until people have wierd, nested quantifiers


//file of user-defined manipulation-technique names
public static boolean userDefinedStrategy = false;	//the user hasn't selected custom proof strategy file
public static FileReader userStrategyFileReader = null; // file with user's sequence of manipulations


//holds reasons for normalization (temporarily)
//public static HashSet<Integer> normalizationReason = new HashSet<Integer>();	//stuffed by normalization rules when fired, must empty and copy

//holds flags and constants
public static int YouIdiotShowParseTreeLimit = 3;	//how many YI parse trees to show?
public static int YouIdiotReportLimit = 10; //how many YI exception reports to show?
public static int UnparserReportLimit = 2; //how many unparser exception reports to show?
public static boolean automaticallyNormalizeAfterAssertionLabelSubstitution = false;  //automatically normalize P and Q after Assertion label substition
public static boolean repeatedlyNormalize = true;  //cause Strategy.normalize() to put new p.o. back into unsolvedProofObligations; or copy new p.o. after all unsolved normalized once
public static boolean parsingPredeclaredProperties = false; //are files holding predeclared AADL or BLESS properties or packages being parsed?
public static boolean replaceSubtractionWithAddingNegation = false; //flag used by Normalize.g to cause (a-b) to become (a+ -b)


//how often should hints be given?
public static int hintRatio = 10;  // 1 out of hintRatio gets a HelpfulHint

//use BAST node's text, regardless of whether it has a token
public static boolean useOnlyASTtext = true;

//map of compilation unit names to file names
public static HashMap<String,String> compilation_unit_file_name_map = new HashMap<String,String>();
//map of compilation unit names to root AST node
public static HashMap<String,BAST> compilation_unit_map = new HashMap<String,BAST>();
//map of data components to their types
public static HashMap<String,BAST> data_type_map = new HashMap<String,BAST>();
//set of enumeration labels
public static HashSet<String> enum_label_set = new HashSet<String>();

//public static boolean translateIntoPilar = false;	//automatically unparse into pilar
//public static String pilarFileName = "";

//public static TreeView treeview=null;

public static boolean checkTypeWithProofTool=false;

public static boolean unparseAssertions=true;

public static EObject context = null;

//migrated to here in big split 10/19/2018
	public static String stringTemplateGroupFolder = "StringTemplateGroups/";
public static boolean prayingHandsClicked = false;
public static Vector<ParseRecord>  compilationUnits = new Vector<ParseRecord>();
public static Vector<Integer>  compilationUnitStartingProductions = new Vector<Integer>();
public static Vector<ParseRecord> compilationUnitRecords= new Vector<ParseRecord>();	//holds everything about parsed files
//global map of assertion labels to their assertions
public static TreeMap<String,BAST> label_assertion_map = new TreeMap<String,BAST>();

//make this controlled in BLESS preferences, and used everywhere

public static boolean verbose = true;

public static String scriptFileName = "";

// code generation
public static boolean generatingSlangTime = false;  //use S64 ms for Art.Time and literals


//regular constructor
//		public
//	Global(State start, State end)
//		{
//		init(start, end);
//		}	//end of constructor

//null constructor
		public
	Global()
		{
		}	//end of null constructor

	public static void
addToShow(BAST t)
	{
	if (treesToShow == null)
		{
			treesToShow = new Vector<BAST>();
			}
	treesToShow.addElement(t);
	}


	public static String
getAadlPropertyValue(String propertySet, String propertyName)
  {
  if (context==null)
		{
			return propertySet + "::" + propertyName;
			}
  Property prop = GetProperties.lookupPropertyDefinition(context,propertySet,propertyName);
  if (prop!=null)
		{
			return Long.toString(PropertyUtils.getIntegerValue((NamedElement) context,prop));
			}
//    return prop.evaluateDefault((EvaluationContext) context).toString();
  return propertySet + "::" + propertyName;
  }

	public static String
getAadlPropertyValue(String propertyName)
  {
  if (context==null)
		{
			return propertyName;
			}
  Property prop = GetProperties.lookupPropertyDefinition(context,propertyName);
  if (prop!=null)
		{
			return Long.toString(PropertyUtils.getIntegerValue((NamedElement) context,prop));
			}
//    return prop.evaluateDefault((EvaluationContext) context).toString();
  return propertyName;
  }
	
	public static void
setUpFiles()
  {
  // open dump and script files if not already open
//  if (Global.dumpFileClosed && !Global.suppressOutput)
//    {
    if (Global.useDumpFile)
      {
      try
        {
        Global.df = new File("dump.txt");
        Global.fw = new FileWriter(Global.df);
        Global.pw = new PrintWriter(Global.fw);
        Dump.it("opening dump file \"" + Global.df.getAbsolutePath() + "\" " + Time.todayString);
        }
      catch (IOException e)
        {
        Global.exceptionOccurred = true;
        Dump.it("Error while making dump file");
        e.printStackTrace(System.out);
        } // done catching file making
//      if (Global.useProofFile)
//        {
//        try
//          {
//          Global.dfProof = new File("proof.txt");
//          Global.fwProof = new FileWriter(Global.dfProof);
//          Global.pwProof = new PrintWriter(Global.fwProof);
//          Dump.it("opening proof file \"" + Global.dfProof.getAbsolutePath() + "\" " + Time.todayString);
//          }
//        catch (IOException e)
//          {
//          Global.exceptionOccurred = true;
//          Dump.it("Error while making proof file");
//          Dump.it(e.getMessage());
//          e.printStackTrace(System.out);
//          } // done catching file making
//        Dump.itToProofFile("This file, proof.txt, was produced the BLESS Proof Assistant " + BLESS.versionDate);
//        Dump.itToProofFile("  at " + Time.todayString + " by " + System.getProperty("user.name") + "\n");
//        } // done setting up dump file
      if (Global.useScriptFile)
        {
        String fileName = "script.txt";
        try
          {
          Global.dfScript = new File(fileName);
          Global.fwScript = new FileWriter(Global.dfScript);
          Global.pwScript = new PrintWriter(Global.fwScript);
          Dump.it("opening proof script file \"" + Global.dfScript.getAbsolutePath() + "\"");
          }
        catch (IOException e)
          {
          Global.exceptionOccurred = true;
          Dump.it("Error while making script file");
          Dump.it(e.getMessage());
          e.printStackTrace(System.out);
          } // done catching file making
        Dump.itToScriptFile("#This file, " + fileName + ", was produced the BLESS Proof Assistant " + BLESS.versionDate);
        Dump.itToScriptFile("#  at " + Time.todayString + " by " + System.getProperty("user.name"));
        } // done setting up dump file
      }
//    Global.dumpFileClosed = false;
//    }
  }  //end of setUpfiles

	public static void
showMessageBox(String message)	
  {
  Shell shell = new Shell(Display.getDefault());
  MessageDialog.openInformation(shell, "BLESS Message", message); 
  }
	
}	//end of Global

