// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g 2023-05-08 04:59:39

//copyright 2020 Multitude Corporation
package com.multitude.bless.antlr3generated;
import java.util.HashMap;
import java.util.Vector;
//import com.multitude.bless.BAST;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import com.multitude.bless.exceptions.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.app.Global;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.record.ThreadRecord;
import com.multitude.bless.record.DataRecord;
import com.multitude.bless.record.SubprogramRecord;
import com.multitude.bless.record.PropertySetRecord;
//import com.multitude.bless.symbol.Model;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class BLESStoAST3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADL_STRING_LITERAL", "AADL_STRING_PART", 
		"ACTION", "AL", "AM", "AMPERSAND", "ANNEX_END", "ANNEX_START", "ARROW", 
		"ASSERTION", "ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", 
		"ASSIGN", "AT_SIGN", "ActionSubclause", "AssertionLibrary", "BASE", "BASED_INTEGER", 
		"BEHAVIOR_GUARD", "BEHAVIOR_TIME", "BI", "BLESSGRammarRoots", "BLESSSubclause", 
		"BOUND", "BOX", "CARET", "CASE_EXPRESSION", "COLON", "COLON_TILDE", "COMMA", 
		"COMMACOMMA", "COMMADOT", "COMPLEX", "COMPONENT", "CONDITION", "CONDITIONAL", 
		"CONDITIONAL_FUNCTION", "CONNECTION", "COUNTING_TRIGGER", "DESTINATION", 
		"DIGIT", "DIVIDE", "DOLLAR", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", "DOUBLE_QUOTE", 
		"DO_NOT_PROVE", "DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", "EQ", 
		"EXCLAMATION", "EXP", "EXPONENT", "EXTENDED_DIGIT", "ExceptionLibrary", 
		"FLOATING", "FUNCTION", "FUNCTION_CALL", "GT", "GUARD", "GhostVariable", 
		"GhostVariables", "HEX_DIGIT", "ID", "IMP", "INMODE", "INOUT", "INTEGER_LIT", 
		"INT_EXPONENT", "INVARIANT", "INVOKE", "INVOKE_FUNCTION", "IP_NAME", "IP_PE", 
		"IP_PRED", "LABEL", "LASS", "LBRACKET", "LCON", "LCURLY", "LITERAL_Assertion", 
		"LITERAL_Invariant", "LITERAL_Postcondition", "LITERAL_Precondition", 
		"LITERAL_Typed", "LITERAL_aadlboolean", "LITERAL_aadlinteger", "LITERAL_aadlreal", 
		"LITERAL_aadlstring", "LITERAL_abs", "LITERAL_abstract", "LITERAL_access", 
		"LITERAL_all", "LITERAL_and", "LITERAL_annex", "LITERAL_any", "LITERAL_applies", 
		"LITERAL_are", "LITERAL_array", "LITERAL_assert", "LITERAL_availability", 
		"LITERAL_boolean", "LITERAL_bound", "LITERAL_bus", "LITERAL_call", "LITERAL_calls", 
		"LITERAL_cand", "LITERAL_catch", "LITERAL_classifier", "LITERAL_complete", 
		"LITERAL_complex", "LITERAL_component", "LITERAL_computation", "LITERAL_connection", 
		"LITERAL_connections", "LITERAL_constant", "LITERAL_cor", "LITERAL_count", 
		"LITERAL_data", "LITERAL_declare", "LITERAL_def", "LITERAL_delay", "LITERAL_device", 
		"LITERAL_dispatch", "LITERAL_do", "LITERAL_else", "LITERAL_end", "LITERAL_enumeration", 
		"LITERAL_event", "LITERAL_exception", "LITERAL_exists", "LITERAL_extends", 
		"LITERAL_false", "LITERAL_feature", "LITERAL_features", "LITERAL_fetchadd", 
		"LITERAL_fetchand", "LITERAL_fetchor", "LITERAL_fetchxor", "LITERAL_fi", 
		"LITERAL_final", "LITERAL_flow", "LITERAL_flows", "LITERAL_for", "LITERAL_forall", 
		"LITERAL_fresh", "LITERAL_function", "LITERAL_ghost", "LITERAL_group", 
		"LITERAL_hr", "LITERAL_if", "LITERAL_iff", "LITERAL_implementation", "LITERAL_implies", 
		"LITERAL_in", "LITERAL_inherit", "LITERAL_initial", "LITERAL_integer", 
		"LITERAL_invariant", "LITERAL_inverse", "LITERAL_is", "LITERAL_list", 
		"LITERAL_lower_bound", "LITERAL_memory", "LITERAL_min", "LITERAL_mod", 
		"LITERAL_mode", "LITERAL_modes", "LITERAL_ms", "LITERAL_natural", "LITERAL_none", 
		"LITERAL_nonvolatile", "LITERAL_not", "LITERAL_now", "LITERAL_ns", "LITERAL_null", 
		"LITERAL_numberof", "LITERAL_of", "LITERAL_on", "LITERAL_or", "LITERAL_out", 
		"LITERAL_package", "LITERAL_parameter", "LITERAL_pause", "LITERAL_port", 
		"LITERAL_post", "LITERAL_pre", "LITERAL_private", "LITERAL_procedure", 
		"LITERAL_process", "LITERAL_processor", "LITERAL_product", "LITERAL_properties", 
		"LITERAL_property", "LITERAL_prototypes", "LITERAL_provides", "LITERAL_ps", 
		"LITERAL_public", "LITERAL_range", "LITERAL_rational", "LITERAL_real", 
		"LITERAL_record", "LITERAL_reference", "LITERAL_rem", "LITERAL_renames", 
		"LITERAL_requires", "LITERAL_sec", "LITERAL_self", "LITERAL_sequence", 
		"LITERAL_set", "LITERAL_setmode", "LITERAL_shared", "LITERAL_skip", "LITERAL_spread", 
		"LITERAL_state", "LITERAL_states", "LITERAL_stop", "LITERAL_string", "LITERAL_subcomponents", 
		"LITERAL_subprogram", "LITERAL_sum", "LITERAL_swap", "LITERAL_system", 
		"LITERAL_that", "LITERAL_then", "LITERAL_thread", "LITERAL_throw", "LITERAL_time", 
		"LITERAL_timeout", "LITERAL_to", "LITERAL_tops", "LITERAL_transition", 
		"LITERAL_transitions", "LITERAL_true", "LITERAL_type", "LITERAL_units", 
		"LITERAL_until", "LITERAL_updated", "LITERAL_upper_bound", "LITERAL_us", 
		"LITERAL_variables", "LITERAL_variant", "LITERAL_virtual", "LITERAL_when", 
		"LITERAL_while", "LITERAL_with", "LITERAL_xor", "LPAREN", "LT", "LTE_STRING", 
		"LT_STRING", "MINUS", "MT_STRING", "NEQ", "NamedAssertion", "OBLIGATION", 
		"OCTOTHORPE", "ON", "P", "PARAMETER", "PARAMETERS", "PERIOD", "PLUS", 
		"PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", "PREDICATE_RELATION", 
		"PROCEDURE", "PROCEDURE_CALL", "PROPERTY_LIST", "Q", "QQ", "QUESTION", 
		"RASS", "RATIONAL", "RBRACKET", "RCON", "RCURLY", "REAL_LIT", "RECORD_TERM", 
		"RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", "START", "START_ASSERTION_PROPERTY", 
		"STOP", "SUBCOMPONENT", "SUBPROGRAM_ANNEX", "THREAD_ANNEX", "THREAD_GROUP", 
		"TICK", "TILDE", "TIMES", "TOP", "TRANSITION", "TYPE", "TYPE_OPERATOR", 
		"TYPE_OPERATOR_INVOCATION", "TypeLibrary", "UNARY_MINUS", "UnitLibrary", 
		"VALUE", "WP", "WS", "'|'"
	};
	public static final int EOF=-1;
	public static final int T__315=315;
	public static final int AADL_STRING_LITERAL=4;
	public static final int AADL_STRING_PART=5;
	public static final int ACTION=6;
	public static final int AL=7;
	public static final int AM=8;
	public static final int AMPERSAND=9;
	public static final int ANNEX_END=10;
	public static final int ANNEX_START=11;
	public static final int ARROW=12;
	public static final int ASSERTION=13;
	public static final int ASSERTION_ANNEX=14;
	public static final int ASSERTION_ENUMERATION=15;
	public static final int ASSERTION_FUNCTION=16;
	public static final int ASSIGN=17;
	public static final int AT_SIGN=18;
	public static final int ActionSubclause=19;
	public static final int AssertionLibrary=20;
	public static final int BASE=21;
	public static final int BASED_INTEGER=22;
	public static final int BEHAVIOR_GUARD=23;
	public static final int BEHAVIOR_TIME=24;
	public static final int BI=25;
	public static final int BLESSGRammarRoots=26;
	public static final int BLESSSubclause=27;
	public static final int BOUND=28;
	public static final int BOX=29;
	public static final int CARET=30;
	public static final int CASE_EXPRESSION=31;
	public static final int COLON=32;
	public static final int COLON_TILDE=33;
	public static final int COMMA=34;
	public static final int COMMACOMMA=35;
	public static final int COMMADOT=36;
	public static final int COMPLEX=37;
	public static final int COMPONENT=38;
	public static final int CONDITION=39;
	public static final int CONDITIONAL=40;
	public static final int CONDITIONAL_FUNCTION=41;
	public static final int CONNECTION=42;
	public static final int COUNTING_TRIGGER=43;
	public static final int DESTINATION=44;
	public static final int DIGIT=45;
	public static final int DIVIDE=46;
	public static final int DOLLAR=47;
	public static final int DOTCOMMA=48;
	public static final int DOTDOT=49;
	public static final int DOUBLE_COLON=50;
	public static final int DOUBLE_QUOTE=51;
	public static final int DO_NOT_PROVE=52;
	public static final int DUMMY=53;
	public static final int EMPTY_CURLY=54;
	public static final int END_ASSERTION_PROPERTY=55;
	public static final int EQ=56;
	public static final int EXCLAMATION=57;
	public static final int EXP=58;
	public static final int EXPONENT=59;
	public static final int EXTENDED_DIGIT=60;
	public static final int ExceptionLibrary=61;
	public static final int FLOATING=62;
	public static final int FUNCTION=63;
	public static final int FUNCTION_CALL=64;
	public static final int GT=65;
	public static final int GUARD=66;
	public static final int GhostVariable=67;
	public static final int GhostVariables=68;
	public static final int HEX_DIGIT=69;
	public static final int ID=70;
	public static final int IMP=71;
	public static final int INMODE=72;
	public static final int INOUT=73;
	public static final int INTEGER_LIT=74;
	public static final int INT_EXPONENT=75;
	public static final int INVARIANT=76;
	public static final int INVOKE=77;
	public static final int INVOKE_FUNCTION=78;
	public static final int IP_NAME=79;
	public static final int IP_PE=80;
	public static final int IP_PRED=81;
	public static final int LABEL=82;
	public static final int LASS=83;
	public static final int LBRACKET=84;
	public static final int LCON=85;
	public static final int LCURLY=86;
	public static final int LITERAL_Assertion=87;
	public static final int LITERAL_Invariant=88;
	public static final int LITERAL_Postcondition=89;
	public static final int LITERAL_Precondition=90;
	public static final int LITERAL_Typed=91;
	public static final int LITERAL_aadlboolean=92;
	public static final int LITERAL_aadlinteger=93;
	public static final int LITERAL_aadlreal=94;
	public static final int LITERAL_aadlstring=95;
	public static final int LITERAL_abs=96;
	public static final int LITERAL_abstract=97;
	public static final int LITERAL_access=98;
	public static final int LITERAL_all=99;
	public static final int LITERAL_and=100;
	public static final int LITERAL_annex=101;
	public static final int LITERAL_any=102;
	public static final int LITERAL_applies=103;
	public static final int LITERAL_are=104;
	public static final int LITERAL_array=105;
	public static final int LITERAL_assert=106;
	public static final int LITERAL_availability=107;
	public static final int LITERAL_boolean=108;
	public static final int LITERAL_bound=109;
	public static final int LITERAL_bus=110;
	public static final int LITERAL_call=111;
	public static final int LITERAL_calls=112;
	public static final int LITERAL_cand=113;
	public static final int LITERAL_catch=114;
	public static final int LITERAL_classifier=115;
	public static final int LITERAL_complete=116;
	public static final int LITERAL_complex=117;
	public static final int LITERAL_component=118;
	public static final int LITERAL_computation=119;
	public static final int LITERAL_connection=120;
	public static final int LITERAL_connections=121;
	public static final int LITERAL_constant=122;
	public static final int LITERAL_cor=123;
	public static final int LITERAL_count=124;
	public static final int LITERAL_data=125;
	public static final int LITERAL_declare=126;
	public static final int LITERAL_def=127;
	public static final int LITERAL_delay=128;
	public static final int LITERAL_device=129;
	public static final int LITERAL_dispatch=130;
	public static final int LITERAL_do=131;
	public static final int LITERAL_else=132;
	public static final int LITERAL_end=133;
	public static final int LITERAL_enumeration=134;
	public static final int LITERAL_event=135;
	public static final int LITERAL_exception=136;
	public static final int LITERAL_exists=137;
	public static final int LITERAL_extends=138;
	public static final int LITERAL_false=139;
	public static final int LITERAL_feature=140;
	public static final int LITERAL_features=141;
	public static final int LITERAL_fetchadd=142;
	public static final int LITERAL_fetchand=143;
	public static final int LITERAL_fetchor=144;
	public static final int LITERAL_fetchxor=145;
	public static final int LITERAL_fi=146;
	public static final int LITERAL_final=147;
	public static final int LITERAL_flow=148;
	public static final int LITERAL_flows=149;
	public static final int LITERAL_for=150;
	public static final int LITERAL_forall=151;
	public static final int LITERAL_fresh=152;
	public static final int LITERAL_function=153;
	public static final int LITERAL_ghost=154;
	public static final int LITERAL_group=155;
	public static final int LITERAL_hr=156;
	public static final int LITERAL_if=157;
	public static final int LITERAL_iff=158;
	public static final int LITERAL_implementation=159;
	public static final int LITERAL_implies=160;
	public static final int LITERAL_in=161;
	public static final int LITERAL_inherit=162;
	public static final int LITERAL_initial=163;
	public static final int LITERAL_integer=164;
	public static final int LITERAL_invariant=165;
	public static final int LITERAL_inverse=166;
	public static final int LITERAL_is=167;
	public static final int LITERAL_list=168;
	public static final int LITERAL_lower_bound=169;
	public static final int LITERAL_memory=170;
	public static final int LITERAL_min=171;
	public static final int LITERAL_mod=172;
	public static final int LITERAL_mode=173;
	public static final int LITERAL_modes=174;
	public static final int LITERAL_ms=175;
	public static final int LITERAL_natural=176;
	public static final int LITERAL_none=177;
	public static final int LITERAL_nonvolatile=178;
	public static final int LITERAL_not=179;
	public static final int LITERAL_now=180;
	public static final int LITERAL_ns=181;
	public static final int LITERAL_null=182;
	public static final int LITERAL_numberof=183;
	public static final int LITERAL_of=184;
	public static final int LITERAL_on=185;
	public static final int LITERAL_or=186;
	public static final int LITERAL_out=187;
	public static final int LITERAL_package=188;
	public static final int LITERAL_parameter=189;
	public static final int LITERAL_pause=190;
	public static final int LITERAL_port=191;
	public static final int LITERAL_post=192;
	public static final int LITERAL_pre=193;
	public static final int LITERAL_private=194;
	public static final int LITERAL_procedure=195;
	public static final int LITERAL_process=196;
	public static final int LITERAL_processor=197;
	public static final int LITERAL_product=198;
	public static final int LITERAL_properties=199;
	public static final int LITERAL_property=200;
	public static final int LITERAL_prototypes=201;
	public static final int LITERAL_provides=202;
	public static final int LITERAL_ps=203;
	public static final int LITERAL_public=204;
	public static final int LITERAL_range=205;
	public static final int LITERAL_rational=206;
	public static final int LITERAL_real=207;
	public static final int LITERAL_record=208;
	public static final int LITERAL_reference=209;
	public static final int LITERAL_rem=210;
	public static final int LITERAL_renames=211;
	public static final int LITERAL_requires=212;
	public static final int LITERAL_sec=213;
	public static final int LITERAL_self=214;
	public static final int LITERAL_sequence=215;
	public static final int LITERAL_set=216;
	public static final int LITERAL_setmode=217;
	public static final int LITERAL_shared=218;
	public static final int LITERAL_skip=219;
	public static final int LITERAL_spread=220;
	public static final int LITERAL_state=221;
	public static final int LITERAL_states=222;
	public static final int LITERAL_stop=223;
	public static final int LITERAL_string=224;
	public static final int LITERAL_subcomponents=225;
	public static final int LITERAL_subprogram=226;
	public static final int LITERAL_sum=227;
	public static final int LITERAL_swap=228;
	public static final int LITERAL_system=229;
	public static final int LITERAL_that=230;
	public static final int LITERAL_then=231;
	public static final int LITERAL_thread=232;
	public static final int LITERAL_throw=233;
	public static final int LITERAL_time=234;
	public static final int LITERAL_timeout=235;
	public static final int LITERAL_to=236;
	public static final int LITERAL_tops=237;
	public static final int LITERAL_transition=238;
	public static final int LITERAL_transitions=239;
	public static final int LITERAL_true=240;
	public static final int LITERAL_type=241;
	public static final int LITERAL_units=242;
	public static final int LITERAL_until=243;
	public static final int LITERAL_updated=244;
	public static final int LITERAL_upper_bound=245;
	public static final int LITERAL_us=246;
	public static final int LITERAL_variables=247;
	public static final int LITERAL_variant=248;
	public static final int LITERAL_virtual=249;
	public static final int LITERAL_when=250;
	public static final int LITERAL_while=251;
	public static final int LITERAL_with=252;
	public static final int LITERAL_xor=253;
	public static final int LPAREN=254;
	public static final int LT=255;
	public static final int LTE_STRING=256;
	public static final int LT_STRING=257;
	public static final int MINUS=258;
	public static final int MT_STRING=259;
	public static final int NEQ=260;
	public static final int NamedAssertion=261;
	public static final int OBLIGATION=262;
	public static final int OCTOTHORPE=263;
	public static final int ON=264;
	public static final int P=265;
	public static final int PARAMETER=266;
	public static final int PARAMETERS=267;
	public static final int PERIOD=268;
	public static final int PLUS=269;
	public static final int PLUS_ARROW=270;
	public static final int PLUS_EQUALS=271;
	public static final int PORT=272;
	public static final int PORT_INPUT=273;
	public static final int PORT_OUTPUT=274;
	public static final int PREDICATE_RELATION=275;
	public static final int PROCEDURE=276;
	public static final int PROCEDURE_CALL=277;
	public static final int PROPERTY_LIST=278;
	public static final int Q=279;
	public static final int QQ=280;
	public static final int QUESTION=281;
	public static final int RASS=282;
	public static final int RATIONAL=283;
	public static final int RBRACKET=284;
	public static final int RCON=285;
	public static final int RCURLY=286;
	public static final int REAL_LIT=287;
	public static final int RECORD_TERM=288;
	public static final int RPAREN=289;
	public static final int S=290;
	public static final int SEMICOLON=291;
	public static final int SLCOMMENT=292;
	public static final int SOURCE=293;
	public static final int START=294;
	public static final int START_ASSERTION_PROPERTY=295;
	public static final int STOP=296;
	public static final int SUBCOMPONENT=297;
	public static final int SUBPROGRAM_ANNEX=298;
	public static final int THREAD_ANNEX=299;
	public static final int THREAD_GROUP=300;
	public static final int TICK=301;
	public static final int TILDE=302;
	public static final int TIMES=303;
	public static final int TOP=304;
	public static final int TRANSITION=305;
	public static final int TYPE=306;
	public static final int TYPE_OPERATOR=307;
	public static final int TYPE_OPERATOR_INVOCATION=308;
	public static final int TypeLibrary=309;
	public static final int UNARY_MINUS=310;
	public static final int UnitLibrary=311;
	public static final int VALUE=312;
	public static final int WP=313;
	public static final int WS=314;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BLESStoAST3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BLESStoAST3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return BLESStoAST3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Token tok = null;
	public boolean recognitionErrorOccurred = false;    //did a parse error occur?
	public static int countRecognitionErrors = 1; //accumulates count of recognition errors
	public static Vector<String> error_messages = new Vector<String>();

	//MUST SET currentPackageRecord BEFORE USE
	public PackageRecord currentPackageRecord = null;  //created by package_spec
	public PropertySetRecord currentPropertySetRecord = null;  //created by property_set
	public ParseRecord currentParseRecord = null;  //either currentPackageRecord or currentPropertySetRecord
	//public boolean putAssertionsIntoMap = true;  //put Assertions with labels into Proof.label_assertion_map?
	boolean saidTypeError = false;  //has a type exception already happened
	public String fileName = null;

	int startingLine = 0; //starting line of sublanguage in AADL file
	static int staticLine=0;  //used by BAST constructor

	  public void 
	setStartingLine(int line) //sets starting line
	  {
	  startingLine = line;
	  staticLine = line;
	  }

	  public int
	getStartingLine()
	  {
	  return startingLine;
	  }

	  public static int
	getStaticStartingLine()
	  {
	  return staticLine;
	  }
	  
	 
	public void reportError(RecognitionException ex, BAST start)
	  {
	  if (start!=null)
	    if (start.getParent()!=null)
	      ((BAST)start.getParent()).showParseTree("parent of "+start.getText());
	    else
	      start.showParseTree(start.getText());
	  reportError(ex);     
	  }  //end of reportError(RecognitionException ex, BAST start)

	public void reportError(RecognitionException ex)
	  {
	  if ((currentPackageRecord != null) && (currentPackageRecord.packageID != null))
	    Dump.it("In Package "+currentPackageRecord.packageID);
	  if ((currentPackageRecord != null) && (currentPackageRecord.file != null))
	    Dump.it("In File "+currentPackageRecord.file.getName());
	  else if (fileName != null)
	    Dump.it("In File "+fileName);
	  Dump.it("\nBLESS Syntax Error #"+
	    Integer.toString(countRecognitionErrors)+"\n");
	  error_messages.add(getErrorHeader(ex));  
	  Dump.it("\nSome "+Global.dope+", made another "+
	     (Global.kindMessages?"unfortunate":"stupid")+" grammatical mistake. \n"+
	      "We know this because the token we\'re trying to parse has token-type \""+
	      ((ex.getUnexpectedType()>0)&&(ex.getUnexpectedType()<tokenNames.length)?tokenNames[ex.getUnexpectedType()]:Integer.toString(ex.getUnexpectedType()))+
	      "\" "+
	      (ex.token!=null?"having text \""+ex.token.getText()+"\"":"")+"\n"+
	      "  which is not among the permitted token types here on line "+
	      (ex.token!=null?ex.token.getLine():"null ex.token"));
	//  Dump.it("This "+Global.dope+" may not be you, but you must fix it.");
	  if ((ex.node!=null)&&(ex.node instanceof BAST))
	    ((BAST)ex.node).showParseTree(((BAST)ex.node).getText());
	  int x=5;
	  if (ex instanceof UnwantedTokenException)
	    {
	    UnwantedTokenException ute = (UnwantedTokenException)ex;
	    Dump.it("Expecting:  "+tokenNames[ute.expecting]);
	    Dump.it("\nHint: Don\'t include units for numeric literals in BLESS::Assertion property strings.\n");
	    }
	  if (countRecognitionErrors<Global.YouIdiotReportLimit)
	    {
	    recognitionErrorOccurred = true;
	    ex.line = ex.line+startingLine;
	    Dump.it("offending text = \""+input.toString()+"\"");
	    Dump.it(getErrorHeader(ex));
	//    super.reportError(ex);
	  ex.printStackTrace();
	//    StackTraceElement[] ste = ex.getStackTrace(); 
	//    for (int k=0;k<ste.length;k++)
	//      Dump.it("   "+ste[k].toString());     
	//    HelpfulHints.giveHint();
	    }
	  else
	    {
	    Dump.it(countRecognitionErrors+" recognition errors occurred; divide by zero to stop runaway parser");
	    x=(x+x)/(x-5);
	    }
	  countRecognitionErrors++;
	//  // Global.stopProof = true; 
	  } //end of reportError

	public int errorCount = 0;
	public final int errorLimit=3;

	//REPLACE THIS WITH LOOK-UP OF OSATE RENAMES CLAUSE
	public String timeAlias = "T";

	//public void emitErrorMessage(String msg) 
	//  {
	//  System.err.println(msg);
	//  Dump.it(msg);
	//  }

	public void recover(IntStream input, RecognitionException re) {}
	 

	//tell user of BNF when they make a mistake 
	public boolean toldBNF=false;         
	public void tellBNF(String s, RecognitionException re)
	  {
	  if (!toldBNF)
	    {
	    Dump.it("BNF reminder:\n"+s);
	    toldBNF=true;
	    }
	  } //end of tellBNF(String s, RecognitionException re)
	  
	public void tellBNF(String s, RecognitionException re, BAST errorTree)
	  {
	  if (errorTree!=null)
	    {
	    errorTree.showParseTree(errorTree.getText()!=null?errorTree.getText():"error");
	    Dump.it("error on line "+Integer.toString(errorTree.getLine()+startingLine)+": "+
	      (errorTree.getText()!=null?errorTree.getText():""));
	    }
	  else Dump.it("error tree is null");
	  tellBNF(s,re);
	  }  //end of tellBNF(String s, RecognitionException re, BAST errorTree)
	  
	  


	public static class rational_literal_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "rational_literal"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:592:1: rational_literal : LBRACKET (up= MINUS )? dividend= INTEGER_LIT '|' (down= MINUS )? divisor= INTEGER_LIT RBRACKET -> {(up!=null)&&(down!=null)}? ^( RATIONAL ^( $up $dividend) ^( $down $divisor) ) -> {up!=null}? ^( RATIONAL ^( $up $dividend) $divisor) -> {down!=null}? ^( RATIONAL $dividend ^( $down $divisor) ) -> ^( RATIONAL $dividend $divisor) ;
	public final BLESStoAST3Parser.rational_literal_return rational_literal() throws RecognitionException {
		BLESStoAST3Parser.rational_literal_return retval = new BLESStoAST3Parser.rational_literal_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token up=null;
		Token dividend=null;
		Token down=null;
		Token divisor=null;
		Token LBRACKET1=null;
		Token char_literal2=null;
		Token RBRACKET3=null;

		BAST up_tree=null;
		BAST dividend_tree=null;
		BAST down_tree=null;
		BAST divisor_tree=null;
		BAST LBRACKET1_tree=null;
		BAST char_literal2_tree=null;
		BAST RBRACKET3_tree=null;
		RewriteRuleTokenStream stream_INTEGER_LIT=new RewriteRuleTokenStream(adaptor,"token INTEGER_LIT");
		RewriteRuleTokenStream stream_315=new RewriteRuleTokenStream(adaptor,"token 315");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:593:3: ( LBRACKET (up= MINUS )? dividend= INTEGER_LIT '|' (down= MINUS )? divisor= INTEGER_LIT RBRACKET -> {(up!=null)&&(down!=null)}? ^( RATIONAL ^( $up $dividend) ^( $down $divisor) ) -> {up!=null}? ^( RATIONAL ^( $up $dividend) $divisor) -> {down!=null}? ^( RATIONAL $dividend ^( $down $divisor) ) -> ^( RATIONAL $dividend $divisor) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:594:3: LBRACKET (up= MINUS )? dividend= INTEGER_LIT '|' (down= MINUS )? divisor= INTEGER_LIT RBRACKET
			{
			LBRACKET1=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_rational_literal2489);  
			stream_LBRACKET.add(LBRACKET1);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:594:14: (up= MINUS )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==MINUS) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:594:14: up= MINUS
					{
					up=(Token)match(input,MINUS,FOLLOW_MINUS_in_rational_literal2493);  
					stream_MINUS.add(up);

					}
					break;

			}

			dividend=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_rational_literal2498);  
			stream_INTEGER_LIT.add(dividend);

			char_literal2=(Token)match(input,315,FOLLOW_315_in_rational_literal2500);  
			stream_315.add(char_literal2);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:594:51: (down= MINUS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==MINUS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:594:51: down= MINUS
					{
					down=(Token)match(input,MINUS,FOLLOW_MINUS_in_rational_literal2504);  
					stream_MINUS.add(down);

					}
					break;

			}

			divisor=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_rational_literal2509);  
			stream_INTEGER_LIT.add(divisor);

			RBRACKET3=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_rational_literal2511);  
			stream_RBRACKET.add(RBRACKET3);

			// AST REWRITE
			// elements: divisor, up, dividend, dividend, up, dividend, divisor, down, divisor, down, divisor, dividend
			// token labels: divisor, dividend, up, down
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_divisor=new RewriteRuleTokenStream(adaptor,"token divisor",divisor);
			RewriteRuleTokenStream stream_dividend=new RewriteRuleTokenStream(adaptor,"token dividend",dividend);
			RewriteRuleTokenStream stream_up=new RewriteRuleTokenStream(adaptor,"token up",up);
			RewriteRuleTokenStream stream_down=new RewriteRuleTokenStream(adaptor,"token down",down);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 595:3: -> {(up!=null)&&(down!=null)}? ^( RATIONAL ^( $up $dividend) ^( $down $divisor) )
			if ((up!=null)&&(down!=null)) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:595:34: ^( RATIONAL ^( $up $dividend) ^( $down $divisor) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RATIONAL, "RATIONAL"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:595:45: ^( $up $dividend)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_up.nextNode(), root_2);
				adaptor.addChild(root_2, stream_dividend.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:595:62: ^( $down $divisor)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_down.nextNode(), root_2);
				adaptor.addChild(root_2, stream_divisor.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 596:3: -> {up!=null}? ^( RATIONAL ^( $up $dividend) $divisor)
			if (up!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:596:18: ^( RATIONAL ^( $up $dividend) $divisor)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RATIONAL, "RATIONAL"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:596:29: ^( $up $dividend)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_up.nextNode(), root_2);
				adaptor.addChild(root_2, stream_dividend.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_divisor.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 597:3: -> {down!=null}? ^( RATIONAL $dividend ^( $down $divisor) )
			if (down!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:597:20: ^( RATIONAL $dividend ^( $down $divisor) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RATIONAL, "RATIONAL"), root_1);
				adaptor.addChild(root_1, stream_dividend.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:597:41: ^( $down $divisor)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_down.nextNode(), root_2);
				adaptor.addChild(root_2, stream_divisor.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 598:3: -> ^( RATIONAL $dividend $divisor)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:598:6: ^( RATIONAL $dividend $divisor)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RATIONAL, "RATIONAL"), root_1);
				adaptor.addChild(root_1, stream_dividend.nextNode());
				adaptor.addChild(root_1, stream_divisor.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rational_literal"


	public static class complex_literal_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "complex_literal"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:601:1: complex_literal : LBRACKET (up= MINUS )? real= REAL_LIT COLON (down= MINUS )? im= REAL_LIT RBRACKET -> {(up!=null)&&(down!=null)}? ^( COMPLEX ^( $up $real) ^( $down $im) ) -> {up!=null}? ^( COMPLEX ^( $up $real) $im) -> {down!=null}? ^( COMPLEX $real ^( $down $im) ) -> ^( COMPLEX $real $im) ;
	public final BLESStoAST3Parser.complex_literal_return complex_literal() throws RecognitionException {
		BLESStoAST3Parser.complex_literal_return retval = new BLESStoAST3Parser.complex_literal_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token up=null;
		Token real=null;
		Token down=null;
		Token im=null;
		Token LBRACKET4=null;
		Token COLON5=null;
		Token RBRACKET6=null;

		BAST up_tree=null;
		BAST real_tree=null;
		BAST down_tree=null;
		BAST im_tree=null;
		BAST LBRACKET4_tree=null;
		BAST COLON5_tree=null;
		BAST RBRACKET6_tree=null;
		RewriteRuleTokenStream stream_REAL_LIT=new RewriteRuleTokenStream(adaptor,"token REAL_LIT");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:602:3: ( LBRACKET (up= MINUS )? real= REAL_LIT COLON (down= MINUS )? im= REAL_LIT RBRACKET -> {(up!=null)&&(down!=null)}? ^( COMPLEX ^( $up $real) ^( $down $im) ) -> {up!=null}? ^( COMPLEX ^( $up $real) $im) -> {down!=null}? ^( COMPLEX $real ^( $down $im) ) -> ^( COMPLEX $real $im) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:603:3: LBRACKET (up= MINUS )? real= REAL_LIT COLON (down= MINUS )? im= REAL_LIT RBRACKET
			{
			LBRACKET4=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_complex_literal2608);  
			stream_LBRACKET.add(LBRACKET4);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:603:14: (up= MINUS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MINUS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:603:14: up= MINUS
					{
					up=(Token)match(input,MINUS,FOLLOW_MINUS_in_complex_literal2612);  
					stream_MINUS.add(up);

					}
					break;

			}

			real=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_complex_literal2617);  
			stream_REAL_LIT.add(real);

			COLON5=(Token)match(input,COLON,FOLLOW_COLON_in_complex_literal2619);  
			stream_COLON.add(COLON5);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:603:46: (down= MINUS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==MINUS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:603:46: down= MINUS
					{
					down=(Token)match(input,MINUS,FOLLOW_MINUS_in_complex_literal2623);  
					stream_MINUS.add(down);

					}
					break;

			}

			im=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_complex_literal2628);  
			stream_REAL_LIT.add(im);

			RBRACKET6=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_complex_literal2630);  
			stream_RBRACKET.add(RBRACKET6);

			// AST REWRITE
			// elements: down, im, real, real, real, im, down, real, im, im, up, up
			// token labels: im, real, up, down
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_im=new RewriteRuleTokenStream(adaptor,"token im",im);
			RewriteRuleTokenStream stream_real=new RewriteRuleTokenStream(adaptor,"token real",real);
			RewriteRuleTokenStream stream_up=new RewriteRuleTokenStream(adaptor,"token up",up);
			RewriteRuleTokenStream stream_down=new RewriteRuleTokenStream(adaptor,"token down",down);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 604:3: -> {(up!=null)&&(down!=null)}? ^( COMPLEX ^( $up $real) ^( $down $im) )
			if ((up!=null)&&(down!=null)) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:604:34: ^( COMPLEX ^( $up $real) ^( $down $im) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(COMPLEX, "COMPLEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:604:44: ^( $up $real)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_up.nextNode(), root_2);
				adaptor.addChild(root_2, stream_real.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:604:57: ^( $down $im)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_down.nextNode(), root_2);
				adaptor.addChild(root_2, stream_im.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 605:3: -> {up!=null}? ^( COMPLEX ^( $up $real) $im)
			if (up!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:605:18: ^( COMPLEX ^( $up $real) $im)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(COMPLEX, "COMPLEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:605:28: ^( $up $real)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_up.nextNode(), root_2);
				adaptor.addChild(root_2, stream_real.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_im.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 606:3: -> {down!=null}? ^( COMPLEX $real ^( $down $im) )
			if (down!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:606:20: ^( COMPLEX $real ^( $down $im) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(COMPLEX, "COMPLEX"), root_1);
				adaptor.addChild(root_1, stream_real.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:606:36: ^( $down $im)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_down.nextNode(), root_2);
				adaptor.addChild(root_2, stream_im.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 607:3: -> ^( COMPLEX $real $im)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:607:6: ^( COMPLEX $real $im)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(COMPLEX, "COMPLEX"), root_1);
				adaptor.addChild(root_1, stream_real.nextNode());
				adaptor.addChild(root_1, stream_im.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "complex_literal"


	public static class relation_symbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "relation_symbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:610:1: relation_symbol : ( EQ | NEQ | LT | AM | AL | GT );
	public final BLESStoAST3Parser.relation_symbol_return relation_symbol() throws RecognitionException {
		BLESStoAST3Parser.relation_symbol_return retval = new BLESStoAST3Parser.relation_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set7=null;

		BAST set7_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:611:3: ( EQ | NEQ | LT | AM | AL | GT )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set7=input.LT(1);
			if ( (input.LA(1) >= AL && input.LA(1) <= AM)||input.LA(1)==EQ||input.LA(1)==GT||input.LA(1)==LT||input.LA(1)==NEQ ) {
				input.consume();
				adaptor.addChild(root_0, (BAST)adaptor.create(set7));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation_symbol"


	public static class range_symbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "range_symbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:616:1: range_symbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESStoAST3Parser.range_symbol_return range_symbol() throws RecognitionException {
		BLESStoAST3Parser.range_symbol_return retval = new BLESStoAST3Parser.range_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set8=null;

		BAST set8_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:616:14: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set8=input.LT(1);
			if ( (input.LA(1) >= COMMACOMMA && input.LA(1) <= COMMADOT)||(input.LA(1) >= DOTCOMMA && input.LA(1) <= DOTDOT) ) {
				input.consume();
				adaptor.addChild(root_0, (BAST)adaptor.create(set8));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range_symbol"


	public static class identifier_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:618:1: identifier : ID ;
	public final BLESStoAST3Parser.identifier_return identifier() throws RecognitionException {
		BLESStoAST3Parser.identifier_return retval = new BLESStoAST3Parser.identifier_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID9=null;

		BAST ID9_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:619:3: ( ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESStoAST3.g:619:5: ID
			{
			root_0 = (BAST)adaptor.nil();


			ID9=(Token)match(input,ID,FOLLOW_ID_in_identifier2784); 
			ID9_tree = (BAST)adaptor.create(ID9);
			adaptor.addChild(root_0, ID9_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re,(BAST)retval.getTree()); Dump.it("\nYou may be using a reserved word inappropriately.\n");throw(re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"

	// Delegated rules



	public static final BitSet FOLLOW_LBRACKET_in_rational_literal2489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_rational_literal2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGER_LIT_in_rational_literal2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_315_in_rational_literal2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_rational_literal2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_INTEGER_LIT_in_rational_literal2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RBRACKET_in_rational_literal2511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_complex_literal2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000004L});
	public static final BitSet FOLLOW_MINUS_in_complex_literal2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_REAL_LIT_in_complex_literal2617 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_COLON_in_complex_literal2619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000004L});
	public static final BitSet FOLLOW_MINUS_in_complex_literal2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_REAL_LIT_in_complex_literal2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_RBRACKET_in_complex_literal2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifier2784 = new BitSet(new long[]{0x0000000000000002L});
}
