// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g 2023-04-01 20:11:36

//copyright 2023 Multitude Corporation
package com.multitude.bless.antlr3generated;
import java.util.HashMap;
import java.util.Vector;
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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class BLESS3Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADL_STRING_LITERAL", "AADL_STRING_PART", 
		"ACTION", "ACTION_SUBCLAUSE", "AL", "AM", "AMPERSAND", "ANNEX_END", "ANNEX_START", 
		"ARROW", "ASSERTION", "ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", 
		"ASSIGN", "AT_SIGN", "BASE", "BASED_INTEGER", "BEHAVIOR_GUARD", "BEHAVIOR_TIME", 
		"BI", "BLESS_SUBCLAUSE", "BOUND", "BOX", "CARET", "COLON", "COLON_TILDE", 
		"COMMA", "COMMACOMMA", "COMMADOT", "COMPONENT", "CONDITION", "CONDITIONAL_ASSERTION_FUNCTION", 
		"COUNTING_TRIGGER", "CVP", "DESTINATION", "DIGIT", "DIVIDE", "DOLLAR", 
		"DOT", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", "DOUBLE_QUOTE", "DO_NOT_PROVE", 
		"DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", "EQ", "EXCLAMATION", 
		"EXP", "EXPONENT", "EXTENDED_DIGIT", "FLOATING", "FUNCTION", "GT", "GUARD", 
		"HEX_DIGIT", "ID", "IMP", "INMODE", "INOUT", "INTEGER_LIT", "INT_EXPONENT", 
		"INVARIANT", "INVOKE", "INVOKE_FUNCTION", "IP_NAME", "IP_PE", "IP_PRED", 
		"LABEL", "LASS", "LBRACKET", "LCON", "LCURLY", "LITERAL_Assertion", "LITERAL_Invariant", 
		"LITERAL_Postcondition", "LITERAL_Precondition", "LITERAL_Typed", "LITERAL_aadlboolean", 
		"LITERAL_aadlinteger", "LITERAL_aadlreal", "LITERAL_aadlstring", "LITERAL_abs", 
		"LITERAL_access", "LITERAL_all", "LITERAL_and", "LITERAL_any", "LITERAL_applies", 
		"LITERAL_are", "LITERAL_array", "LITERAL_assert", "LITERAL_availability", 
		"LITERAL_base", "LITERAL_boolean", "LITERAL_bound", "LITERAL_call", "LITERAL_calls", 
		"LITERAL_cand", "LITERAL_case", "LITERAL_catch", "LITERAL_classifier", 
		"LITERAL_complete", "LITERAL_component", "LITERAL_computation", "LITERAL_connection", 
		"LITERAL_connections", "LITERAL_constant", "LITERAL_cor", "LITERAL_count", 
		"LITERAL_declare", "LITERAL_def", "LITERAL_delay", "LITERAL_dispatch", 
		"LITERAL_div", "LITERAL_do", "LITERAL_else", "LITERAL_enumeration", "LITERAL_exception", 
		"LITERAL_exists", "LITERAL_extends", "LITERAL_extension", "LITERAL_false", 
		"LITERAL_feature", "LITERAL_fetchadd", "LITERAL_fetchand", "LITERAL_fetchor", 
		"LITERAL_fetchxor", "LITERAL_fi", "LITERAL_final", "LITERAL_flow", "LITERAL_for", 
		"LITERAL_forall", "LITERAL_fresh", "LITERAL_ghost", "LITERAL_hr", "LITERAL_if", 
		"LITERAL_iff", "LITERAL_implementation", "LITERAL_implies", "LITERAL_in", 
		"LITERAL_inherit", "LITERAL_initial", "LITERAL_internal", "LITERAL_invariant", 
		"LITERAL_inverse", "LITERAL_is", "LITERAL_list", "LITERAL_lower_bound", 
		"LITERAL_min", "LITERAL_mod", "LITERAL_mode", "LITERAL_modes", "LITERAL_ms", 
		"LITERAL_nonvolatile", "LITERAL_not", "LITERAL_now", "LITERAL_ns", "LITERAL_null", 
		"LITERAL_numberof", "LITERAL_of", "LITERAL_on", "LITERAL_or", "LITERAL_package", 
		"LITERAL_parameter", "LITERAL_pause", "LITERAL_post", "LITERAL_pre", "LITERAL_private", 
		"LITERAL_product", "LITERAL_property", "LITERAL_provides", "LITERAL_ps", 
		"LITERAL_public", "LITERAL_quantity", "LITERAL_range", "LITERAL_record", 
		"LITERAL_reference", "LITERAL_rem", "LITERAL_renames", "LITERAL_representation", 
		"LITERAL_requires", "LITERAL_returns", "LITERAL_round", "LITERAL_scalar", 
		"LITERAL_sec", "LITERAL_self", "LITERAL_sequence", "LITERAL_set", "LITERAL_setmode", 
		"LITERAL_shared", "LITERAL_skip", "LITERAL_spread", "LITERAL_state", "LITERAL_states", 
		"LITERAL_step", "LITERAL_stop", "LITERAL_string", "LITERAL_subcomponents", 
		"LITERAL_sum", "LITERAL_swap", "LITERAL_that", "LITERAL_then", "LITERAL_throw", 
		"LITERAL_throws", "LITERAL_time", "LITERAL_timeout", "LITERAL_to", "LITERAL_tops", 
		"LITERAL_transition", "LITERAL_transitions", "LITERAL_true", "LITERAL_truncate", 
		"LITERAL_type", "LITERAL_union", "LITERAL_units", "LITERAL_until", "LITERAL_updated", 
		"LITERAL_upper_bound", "LITERAL_us", "LITERAL_variables", "LITERAL_variant", 
		"LITERAL_when", "LITERAL_which", "LITERAL_while", "LITERAL_whole", "LITERAL_with", 
		"LITERAL_xor", "LPAREN", "LT", "LTE_STRING", "LT_STRING", "MINUS", "MT_STRING", 
		"NEQ", "NUMBER", "OBLIGATION", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETER", 
		"PARAMETERS", "PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", 
		"PORT_OUTPUT", "PREDICATE_RELATION", "PROCEDURE", "PROCEDURE_CALL", "Q", 
		"QCLREF", "QCREF", "QQ", "QUANTITY", "QUESTION", "RASS", "RBRACKET", "RCON", 
		"RCURLY", "REAL_LIT", "RECORD_TERM", "ROOT_DECLARATION", "RPAREN", "S", 
		"SEMICOLON", "SLCOMMENT", "SOURCE", "START", "START_ASSERTION_PROPERTY", 
		"STOP", "SUBPROGRAM_ANNEX", "SUBPROGRAM_INVOCATION", "TICK", "TILDE", 
		"TIMES", "TOP", "TRANSITION", "TRIGGER", "TYPE", "TYPE_LIBRARY", "TYPE_OPERATOR", 
		"TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", "UNIT_FORMULA", "UNIT_LIBRARY", 
		"UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", "VERT", "WP", "WS", "'%'"
	};
	public static final int EOF=-1;
	public static final int T__299=299;
	public static final int AADL_STRING_LITERAL=4;
	public static final int AADL_STRING_PART=5;
	public static final int ACTION=6;
	public static final int ACTION_SUBCLAUSE=7;
	public static final int AL=8;
	public static final int AM=9;
	public static final int AMPERSAND=10;
	public static final int ANNEX_END=11;
	public static final int ANNEX_START=12;
	public static final int ARROW=13;
	public static final int ASSERTION=14;
	public static final int ASSERTION_ANNEX=15;
	public static final int ASSERTION_ENUMERATION=16;
	public static final int ASSERTION_FUNCTION=17;
	public static final int ASSIGN=18;
	public static final int AT_SIGN=19;
	public static final int BASE=20;
	public static final int BASED_INTEGER=21;
	public static final int BEHAVIOR_GUARD=22;
	public static final int BEHAVIOR_TIME=23;
	public static final int BI=24;
	public static final int BLESS_SUBCLAUSE=25;
	public static final int BOUND=26;
	public static final int BOX=27;
	public static final int CARET=28;
	public static final int COLON=29;
	public static final int COLON_TILDE=30;
	public static final int COMMA=31;
	public static final int COMMACOMMA=32;
	public static final int COMMADOT=33;
	public static final int COMPONENT=34;
	public static final int CONDITION=35;
	public static final int CONDITIONAL_ASSERTION_FUNCTION=36;
	public static final int COUNTING_TRIGGER=37;
	public static final int CVP=38;
	public static final int DESTINATION=39;
	public static final int DIGIT=40;
	public static final int DIVIDE=41;
	public static final int DOLLAR=42;
	public static final int DOT=43;
	public static final int DOTCOMMA=44;
	public static final int DOTDOT=45;
	public static final int DOUBLE_COLON=46;
	public static final int DOUBLE_QUOTE=47;
	public static final int DO_NOT_PROVE=48;
	public static final int DUMMY=49;
	public static final int EMPTY_CURLY=50;
	public static final int END_ASSERTION_PROPERTY=51;
	public static final int EQ=52;
	public static final int EXCLAMATION=53;
	public static final int EXP=54;
	public static final int EXPONENT=55;
	public static final int EXTENDED_DIGIT=56;
	public static final int FLOATING=57;
	public static final int FUNCTION=58;
	public static final int GT=59;
	public static final int GUARD=60;
	public static final int HEX_DIGIT=61;
	public static final int ID=62;
	public static final int IMP=63;
	public static final int INMODE=64;
	public static final int INOUT=65;
	public static final int INTEGER_LIT=66;
	public static final int INT_EXPONENT=67;
	public static final int INVARIANT=68;
	public static final int INVOKE=69;
	public static final int INVOKE_FUNCTION=70;
	public static final int IP_NAME=71;
	public static final int IP_PE=72;
	public static final int IP_PRED=73;
	public static final int LABEL=74;
	public static final int LASS=75;
	public static final int LBRACKET=76;
	public static final int LCON=77;
	public static final int LCURLY=78;
	public static final int LITERAL_Assertion=79;
	public static final int LITERAL_Invariant=80;
	public static final int LITERAL_Postcondition=81;
	public static final int LITERAL_Precondition=82;
	public static final int LITERAL_Typed=83;
	public static final int LITERAL_aadlboolean=84;
	public static final int LITERAL_aadlinteger=85;
	public static final int LITERAL_aadlreal=86;
	public static final int LITERAL_aadlstring=87;
	public static final int LITERAL_abs=88;
	public static final int LITERAL_access=89;
	public static final int LITERAL_all=90;
	public static final int LITERAL_and=91;
	public static final int LITERAL_any=92;
	public static final int LITERAL_applies=93;
	public static final int LITERAL_are=94;
	public static final int LITERAL_array=95;
	public static final int LITERAL_assert=96;
	public static final int LITERAL_availability=97;
	public static final int LITERAL_base=98;
	public static final int LITERAL_boolean=99;
	public static final int LITERAL_bound=100;
	public static final int LITERAL_call=101;
	public static final int LITERAL_calls=102;
	public static final int LITERAL_cand=103;
	public static final int LITERAL_case=104;
	public static final int LITERAL_catch=105;
	public static final int LITERAL_classifier=106;
	public static final int LITERAL_complete=107;
	public static final int LITERAL_component=108;
	public static final int LITERAL_computation=109;
	public static final int LITERAL_connection=110;
	public static final int LITERAL_connections=111;
	public static final int LITERAL_constant=112;
	public static final int LITERAL_cor=113;
	public static final int LITERAL_count=114;
	public static final int LITERAL_declare=115;
	public static final int LITERAL_def=116;
	public static final int LITERAL_delay=117;
	public static final int LITERAL_dispatch=118;
	public static final int LITERAL_div=119;
	public static final int LITERAL_do=120;
	public static final int LITERAL_else=121;
	public static final int LITERAL_enumeration=122;
	public static final int LITERAL_exception=123;
	public static final int LITERAL_exists=124;
	public static final int LITERAL_extends=125;
	public static final int LITERAL_extension=126;
	public static final int LITERAL_false=127;
	public static final int LITERAL_feature=128;
	public static final int LITERAL_fetchadd=129;
	public static final int LITERAL_fetchand=130;
	public static final int LITERAL_fetchor=131;
	public static final int LITERAL_fetchxor=132;
	public static final int LITERAL_fi=133;
	public static final int LITERAL_final=134;
	public static final int LITERAL_flow=135;
	public static final int LITERAL_for=136;
	public static final int LITERAL_forall=137;
	public static final int LITERAL_fresh=138;
	public static final int LITERAL_ghost=139;
	public static final int LITERAL_hr=140;
	public static final int LITERAL_if=141;
	public static final int LITERAL_iff=142;
	public static final int LITERAL_implementation=143;
	public static final int LITERAL_implies=144;
	public static final int LITERAL_in=145;
	public static final int LITERAL_inherit=146;
	public static final int LITERAL_initial=147;
	public static final int LITERAL_internal=148;
	public static final int LITERAL_invariant=149;
	public static final int LITERAL_inverse=150;
	public static final int LITERAL_is=151;
	public static final int LITERAL_list=152;
	public static final int LITERAL_lower_bound=153;
	public static final int LITERAL_min=154;
	public static final int LITERAL_mod=155;
	public static final int LITERAL_mode=156;
	public static final int LITERAL_modes=157;
	public static final int LITERAL_ms=158;
	public static final int LITERAL_nonvolatile=159;
	public static final int LITERAL_not=160;
	public static final int LITERAL_now=161;
	public static final int LITERAL_ns=162;
	public static final int LITERAL_null=163;
	public static final int LITERAL_numberof=164;
	public static final int LITERAL_of=165;
	public static final int LITERAL_on=166;
	public static final int LITERAL_or=167;
	public static final int LITERAL_package=168;
	public static final int LITERAL_parameter=169;
	public static final int LITERAL_pause=170;
	public static final int LITERAL_post=171;
	public static final int LITERAL_pre=172;
	public static final int LITERAL_private=173;
	public static final int LITERAL_product=174;
	public static final int LITERAL_property=175;
	public static final int LITERAL_provides=176;
	public static final int LITERAL_ps=177;
	public static final int LITERAL_public=178;
	public static final int LITERAL_quantity=179;
	public static final int LITERAL_range=180;
	public static final int LITERAL_record=181;
	public static final int LITERAL_reference=182;
	public static final int LITERAL_rem=183;
	public static final int LITERAL_renames=184;
	public static final int LITERAL_representation=185;
	public static final int LITERAL_requires=186;
	public static final int LITERAL_returns=187;
	public static final int LITERAL_round=188;
	public static final int LITERAL_scalar=189;
	public static final int LITERAL_sec=190;
	public static final int LITERAL_self=191;
	public static final int LITERAL_sequence=192;
	public static final int LITERAL_set=193;
	public static final int LITERAL_setmode=194;
	public static final int LITERAL_shared=195;
	public static final int LITERAL_skip=196;
	public static final int LITERAL_spread=197;
	public static final int LITERAL_state=198;
	public static final int LITERAL_states=199;
	public static final int LITERAL_step=200;
	public static final int LITERAL_stop=201;
	public static final int LITERAL_string=202;
	public static final int LITERAL_subcomponents=203;
	public static final int LITERAL_sum=204;
	public static final int LITERAL_swap=205;
	public static final int LITERAL_that=206;
	public static final int LITERAL_then=207;
	public static final int LITERAL_throw=208;
	public static final int LITERAL_throws=209;
	public static final int LITERAL_time=210;
	public static final int LITERAL_timeout=211;
	public static final int LITERAL_to=212;
	public static final int LITERAL_tops=213;
	public static final int LITERAL_transition=214;
	public static final int LITERAL_transitions=215;
	public static final int LITERAL_true=216;
	public static final int LITERAL_truncate=217;
	public static final int LITERAL_type=218;
	public static final int LITERAL_union=219;
	public static final int LITERAL_units=220;
	public static final int LITERAL_until=221;
	public static final int LITERAL_updated=222;
	public static final int LITERAL_upper_bound=223;
	public static final int LITERAL_us=224;
	public static final int LITERAL_variables=225;
	public static final int LITERAL_variant=226;
	public static final int LITERAL_when=227;
	public static final int LITERAL_which=228;
	public static final int LITERAL_while=229;
	public static final int LITERAL_whole=230;
	public static final int LITERAL_with=231;
	public static final int LITERAL_xor=232;
	public static final int LPAREN=233;
	public static final int LT=234;
	public static final int LTE_STRING=235;
	public static final int LT_STRING=236;
	public static final int MINUS=237;
	public static final int MT_STRING=238;
	public static final int NEQ=239;
	public static final int NUMBER=240;
	public static final int OBLIGATION=241;
	public static final int OCTOTHORPE=242;
	public static final int OLD_NEQ=243;
	public static final int ON=244;
	public static final int P=245;
	public static final int PARAMETER=246;
	public static final int PARAMETERS=247;
	public static final int PLUS=248;
	public static final int PLUS_ARROW=249;
	public static final int PLUS_EQUALS=250;
	public static final int PORT=251;
	public static final int PORT_INPUT=252;
	public static final int PORT_OUTPUT=253;
	public static final int PREDICATE_RELATION=254;
	public static final int PROCEDURE=255;
	public static final int PROCEDURE_CALL=256;
	public static final int Q=257;
	public static final int QCLREF=258;
	public static final int QCREF=259;
	public static final int QQ=260;
	public static final int QUANTITY=261;
	public static final int QUESTION=262;
	public static final int RASS=263;
	public static final int RBRACKET=264;
	public static final int RCON=265;
	public static final int RCURLY=266;
	public static final int REAL_LIT=267;
	public static final int RECORD_TERM=268;
	public static final int ROOT_DECLARATION=269;
	public static final int RPAREN=270;
	public static final int S=271;
	public static final int SEMICOLON=272;
	public static final int SLCOMMENT=273;
	public static final int SOURCE=274;
	public static final int START=275;
	public static final int START_ASSERTION_PROPERTY=276;
	public static final int STOP=277;
	public static final int SUBPROGRAM_ANNEX=278;
	public static final int SUBPROGRAM_INVOCATION=279;
	public static final int TICK=280;
	public static final int TILDE=281;
	public static final int TIMES=282;
	public static final int TOP=283;
	public static final int TRANSITION=284;
	public static final int TRIGGER=285;
	public static final int TYPE=286;
	public static final int TYPE_LIBRARY=287;
	public static final int TYPE_OPERATOR=288;
	public static final int TYPE_OPERATOR_INVOCATION=289;
	public static final int UNARY_MINUS=290;
	public static final int UNIT_FORMULA=291;
	public static final int UNIT_LIBRARY=292;
	public static final int UNIT_NAME=293;
	public static final int VALUE=294;
	public static final int VARIABLE_DECLARATION=295;
	public static final int VERT=296;
	public static final int WP=297;
	public static final int WS=298;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BLESS3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BLESS3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return BLESS3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g"; }


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
	  
	  


	public static class relation_symbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "relation_symbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:616:1: relation_symbol : ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS );
	public final BLESS3Parser.relation_symbol_return relation_symbol() throws RecognitionException {
		BLESS3Parser.relation_symbol_return retval = new BLESS3Parser.relation_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set1=null;

		BAST set1_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:617:3: ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set1=input.LT(1);
			if ( (input.LA(1) >= AL && input.LA(1) <= AM)||input.LA(1)==EQ||input.LA(1)==GT||input.LA(1)==LT||input.LA(1)==NEQ||input.LA(1)==OLD_NEQ||input.LA(1)==PLUS_EQUALS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set1));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:622:1: range_symbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.range_symbol_return range_symbol() throws RecognitionException {
		BLESS3Parser.range_symbol_return retval = new BLESS3Parser.range_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set2=null;

		BAST set2_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:622:14: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set2=input.LT(1);
			if ( (input.LA(1) >= COMMACOMMA && input.LA(1) <= COMMADOT)||(input.LA(1) >= DOTCOMMA && input.LA(1) <= DOTDOT) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set2));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:633:1: identifier : ID ;
	public final BLESS3Parser.identifier_return identifier() throws RecognitionException {
		BLESS3Parser.identifier_return retval = new BLESS3Parser.identifier_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID3=null;

		BAST ID3_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:3: ( ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:5: ID
			{
			root_0 = (BAST)adaptor.nil();


			ID3=(Token)match(input,ID,FOLLOW_ID_in_identifier2644); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID3_tree = (BAST)adaptor.create(ID3);
			adaptor.addChild(root_0, ID3_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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


	public static class unitLibrary_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:642:1: unitLibrary : (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) ;
	public final BLESS3Parser.unitLibrary_return unitLibrary() throws RecognitionException {
		BLESS3Parser.unitLibrary_return retval = new BLESS3Parser.unitLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_unitDeclarations=null;
		RuleReturnScope unitDeclarations = null;
		RewriteRuleSubtreeStream stream_unitDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule unitDeclaration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:642:12: ( (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:3: (unitDeclarations+= unitDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:19: (unitDeclarations+= unitDeclaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DIVIDE||LA1_0==ID||LA1_0==LITERAL_base||LA1_0==LITERAL_extension) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:19: unitDeclarations+= unitDeclaration
					{
					pushFollow(FOLLOW_unitDeclaration_in_unitLibrary2671);
					unitDeclarations=unitDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitDeclaration.add(unitDeclarations.getTree());
					if (list_unitDeclarations==null) list_unitDeclarations=new ArrayList<Object>();
					list_unitDeclarations.add(unitDeclarations.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: unitDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: unitDeclarations
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_unitDeclarations=new RewriteRuleSubtreeStream(adaptor,"token unitDeclarations",list_unitDeclarations);
			root_0 = (BAST)adaptor.nil();
			// 644:5: -> ^( UNIT_LIBRARY ( $unitDeclarations)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:8: ^( UNIT_LIBRARY ( $unitDeclarations)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_LIBRARY, "UNIT_LIBRARY"), root_1);
				if ( !(stream_unitDeclarations.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_unitDeclarations.hasNext() ) {
					adaptor.addChild(root_1, stream_unitDeclarations.nextTree());
				}
				stream_unitDeclarations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unitLibrary"


	public static class unitName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:647:1: unitName : (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) ;
	public final BLESS3Parser.unitName_return unitName() throws RecognitionException {
		BLESS3Parser.unitName_return retval = new BLESS3Parser.unitName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lt=null;
		Token id=null;
		Token GT4=null;
		Token longname=null;
		List<Object> list_longname=null;

		BAST lt_tree=null;
		BAST id_tree=null;
		BAST GT4_tree=null;
		BAST longname_tree=null;
		RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:648:3: ( (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:3: (lt= LT (longname+= ID )+ GT )? id= ID
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:3: (lt= LT (longname+= ID )+ GT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:5: lt= LT (longname+= ID )+ GT
					{
					lt=(Token)match(input,LT,FOLLOW_LT_in_unitName2710); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT.add(lt);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:11: (longname+= ID )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:12: longname+= ID
							{
							longname=(Token)match(input,ID,FOLLOW_ID_in_unitName2715); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(longname);

							if (list_longname==null) list_longname=new ArrayList<Object>();
							list_longname.add(longname);
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					GT4=(Token)match(input,GT,FOLLOW_GT_in_unitName2719); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT.add(GT4);

					}
					break;

			}

			id=(Token)match(input,ID,FOLLOW_ID_in_unitName2726); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// AST REWRITE
			// elements: longname, id
			// token labels: id
			// rule labels: retval
			// token list labels: longname
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_longname=new RewriteRuleTokenStream(adaptor,"token longname", list_longname);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 650:5: -> ^( UNIT_NAME $id ( $longname)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:8: ^( UNIT_NAME $id ( $longname)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_NAME, "UNIT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:26: ( $longname)*
				while ( stream_longname.hasNext() ) {
					adaptor.addChild(root_1, stream_longname.nextNode());
				}
				stream_longname.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unitName"


	public static class unitFormula_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitFormula"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:653:1: unitFormula : ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) );
	public final BLESS3Parser.unitFormula_return unitFormula() throws RecognitionException {
		BLESS3Parser.unitFormula_return retval = new BLESS3Parser.unitFormula_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token slash=null;
		Token top=null;
		Token bottom=null;
		List<Object> list_top=null;
		List<Object> list_bottom=null;

		BAST slash_tree=null;
		BAST top_tree=null;
		BAST bottom_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:653:12: ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			else if ( (LA8_0==DIVIDE) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:3: (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )?
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:6: (top+= ID )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:6: top+= ID
							{
							top=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2758); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(top);

							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:12: (slash= DIVIDE (bottom+= ID )+ )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==DIVIDE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:14: slash= DIVIDE (bottom+= ID )+
							{
							slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2765); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:33: (bottom+= ID )+
							int cnt5=0;
							loop5:
							while (true) {
								int alt5=2;
								int LA5_0 = input.LA(1);
								if ( (LA5_0==ID) ) {
									alt5=1;
								}

								switch (alt5) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:33: bottom+= ID
									{
									bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2769); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_ID.add(bottom);

									if (list_bottom==null) list_bottom=new ArrayList<Object>();
									list_bottom.add(bottom);
									}
									break;

								default :
									if ( cnt5 >= 1 ) break loop5;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(5, input);
									throw eee;
								}
								cnt5++;
							}

							}
							break;

					}

					// AST REWRITE
					// elements: top, bottom, slash
					// token labels: slash
					// rule labels: retval
					// token list labels: top, bottom
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_slash=new RewriteRuleTokenStream(adaptor,"token slash",slash);
					RewriteRuleTokenStream stream_top=new RewriteRuleTokenStream(adaptor,"token top", list_top);
					RewriteRuleTokenStream stream_bottom=new RewriteRuleTokenStream(adaptor,"token bottom", list_bottom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 655:5: -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:8: ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_FORMULA, "UNIT_FORMULA"), root_1);
						if ( !(stream_top.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_top.hasNext() ) {
							adaptor.addChild(root_1, stream_top.nextNode());
						}
						stream_top.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:31: ( $slash)?
						if ( stream_slash.hasNext() ) {
							adaptor.addChild(root_1, stream_slash.nextNode());
						}
						stream_slash.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:39: ( $bottom)*
						while ( stream_bottom.hasNext() ) {
							adaptor.addChild(root_1, stream_bottom.nextNode());
						}
						stream_bottom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:3: slash= DIVIDE (bottom+= ID )+
					{
					slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2807); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:22: (bottom+= ID )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:22: bottom+= ID
							{
							bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2811); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(bottom);

							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// AST REWRITE
					// elements: slash, bottom
					// token labels: slash
					// rule labels: retval
					// token list labels: bottom
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_slash=new RewriteRuleTokenStream(adaptor,"token slash",slash);
					RewriteRuleTokenStream stream_bottom=new RewriteRuleTokenStream(adaptor,"token bottom", list_bottom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 658:5: -> ^( UNIT_FORMULA $slash ( $bottom)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:658:8: ^( UNIT_FORMULA $slash ( $bottom)+ )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_FORMULA, "UNIT_FORMULA"), root_1);
						adaptor.addChild(root_1, stream_slash.nextNode());
						if ( !(stream_bottom.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_bottom.hasNext() ) {
							adaptor.addChild(root_1, stream_bottom.nextNode());
						}
						stream_bottom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unitFormula"


	public static class unitDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:661:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final BLESS3Parser.unitDeclaration_return unitDeclaration() throws RecognitionException {
		BLESS3Parser.unitDeclaration_return retval = new BLESS3Parser.unitDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope rootDeclaration5 =null;
		ParserRuleReturnScope unitExtension6 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:661:16: ( rootDeclaration | unitExtension )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DIVIDE||LA9_0==ID||LA9_0==LITERAL_base) ) {
				alt9=1;
			}
			else if ( (LA9_0==LITERAL_extension) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:3: rootDeclaration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration2844);
					rootDeclaration5=rootDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rootDeclaration5.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:21: unitExtension
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_unitExtension_in_unitDeclaration2848);
					unitExtension6=unitExtension();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unitExtension6.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unitDeclaration"


	public static class rootDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "rootDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:665:1: rootDeclaration : (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) ;
	public final BLESS3Parser.rootDeclaration_return rootDeclaration() throws RecognitionException {
		BLESS3Parser.rootDeclaration_return retval = new BLESS3Parser.rootDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token base=null;
		Token lb=null;
		Token RBRACKET7=null;
		Token SEMICOLON8=null;
		Token kindWords=null;
		List<Object> list_kindWords=null;
		List<Object> list_factors=null;
		ParserRuleReturnScope formula =null;
		ParserRuleReturnScope unit =null;
		RuleReturnScope factors = null;
		BAST base_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET7_tree=null;
		BAST SEMICOLON8_tree=null;
		BAST kindWords_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_LITERAL_base=new RewriteRuleTokenStream(adaptor,"token LITERAL_base");
		RewriteRuleSubtreeStream stream_unitFormula=new RewriteRuleSubtreeStream(adaptor,"rule unitFormula");
		RewriteRuleSubtreeStream stream_unitName=new RewriteRuleSubtreeStream(adaptor,"rule unitName");
		RewriteRuleSubtreeStream stream_unitFactor=new RewriteRuleSubtreeStream(adaptor,"rule unitFactor");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:665:16: ( (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:3: (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:3: (base= LITERAL_base |formula= unitFormula )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LITERAL_base) ) {
				alt10=1;
			}
			else if ( (LA10_0==DIVIDE||LA10_0==ID) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:5: base= LITERAL_base
					{
					base=(Token)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration2867); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_base.add(base);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:25: formula= unitFormula
					{
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration2873);
					formula=unitFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFormula.add(formula.getTree());
					}
					break;

			}

			lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration2879); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:68: (kindWords+= ID )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==ID) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:68: kindWords+= ID
					{
					kindWords=(Token)match(input,ID,FOLLOW_ID_in_rootDeclaration2883); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(kindWords);

					if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
					list_kindWords.add(kindWords);
					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			RBRACKET7=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_rootDeclaration2886); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET7);

			pushFollow(FOLLOW_unitName_in_rootDeclaration2893);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:24: (factors+= unitFactor )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:24: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_rootDeclaration2897);
					factors=unitFactor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFactor.add(factors.getTree());
					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			SEMICOLON8=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rootDeclaration2900); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON8);

			// AST REWRITE
			// elements: lb, unit, formula, kindWords, base, factors
			// token labels: lb, base
			// rule labels: unit, formula, retval
			// token list labels: kindWords
			// rule list labels: factors
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lb=new RewriteRuleTokenStream(adaptor,"token lb",lb);
			RewriteRuleTokenStream stream_base=new RewriteRuleTokenStream(adaptor,"token base",base);
			RewriteRuleTokenStream stream_kindWords=new RewriteRuleTokenStream(adaptor,"token kindWords", list_kindWords);
			RewriteRuleSubtreeStream stream_unit=new RewriteRuleSubtreeStream(adaptor,"rule unit",unit!=null?unit.getTree():null);
			RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula",formula!=null?formula.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_factors=new RewriteRuleSubtreeStream(adaptor,"token factors",list_factors);
			root_0 = (BAST)adaptor.nil();
			// 668:5: -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:8: ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ROOT_DECLARATION, "ROOT_DECLARATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:29: ( $base)?
				if ( stream_base.hasNext() ) {
					adaptor.addChild(root_1, stream_base.nextNode());
				}
				stream_base.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:36: ( $formula)?
				if ( stream_formula.hasNext() ) {
					adaptor.addChild(root_1, stream_formula.nextTree());
				}
				stream_formula.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:45: ^( $lb ( $kindWords)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_kindWords.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_kindWords.hasNext() ) {
					adaptor.addChild(root_2, stream_kindWords.nextNode());
				}
				stream_kindWords.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_unit.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:73: ( $factors)*
				while ( stream_factors.hasNext() ) {
					adaptor.addChild(root_1, stream_factors.nextTree());
				}
				stream_factors.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "rootDeclaration"


	public static class unitExtension_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitExtension"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:671:1: unitExtension : LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !;
	public final BLESS3Parser.unitExtension_return unitExtension() throws RecognitionException {
		BLESS3Parser.unitExtension_return retval = new BLESS3Parser.unitExtension_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token root=null;
		Token LITERAL_extension9=null;
		Token SEMICOLON10=null;
		List<Object> list_factors=null;
		RuleReturnScope factors = null;
		BAST root_tree=null;
		BAST LITERAL_extension9_tree=null;
		BAST SEMICOLON10_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:671:14: ( LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:3: LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_extension9=(Token)match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension2950); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_extension9_tree = (BAST)adaptor.create(LITERAL_extension9);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_extension9_tree, root_0);
			}

			root=(Token)match(input,ID,FOLLOW_ID_in_unitExtension2955); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			root_tree = (BAST)adaptor.create(root);
			adaptor.addChild(root_0, root_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:37: (factors+= unitFactor )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==COMMA) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:37: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension2959);
					factors=unitFactor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factors.getTree());

					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTree());
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			SEMICOLON10=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_unitExtension2962); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unitExtension"


	public static class mulDiv_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "mulDiv"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:675:1: mulDiv : ( TIMES | DIVIDE ) ;
	public final BLESS3Parser.mulDiv_return mulDiv() throws RecognitionException {
		BLESS3Parser.mulDiv_return retval = new BLESS3Parser.mulDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set11=null;

		BAST set11_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:675:7: ( ( TIMES | DIVIDE ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set11=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==TIMES ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set11));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "mulDiv"


	public static class unitFactor_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitFactor"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:678:1: unitFactor : c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) ;
	public final BLESS3Parser.unitFactor_return unitFactor() throws RecognitionException {
		BLESS3Parser.unitFactor_return retval = new BLESS3Parser.unitFactor_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token c=null;
		Token factor=null;
		ParserRuleReturnScope unit =null;
		ParserRuleReturnScope op =null;

		BAST c_tree=null;
		BAST factor_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleSubtreeStream stream_unitName=new RewriteRuleSubtreeStream(adaptor,"rule unitName");
		RewriteRuleSubtreeStream stream_mulDiv=new RewriteRuleSubtreeStream(adaptor,"rule mulDiv");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:678:11: (c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:679:3: c= COMMA unit= unitName op= mulDiv factor= NUMBER
			{
			c=(Token)match(input,COMMA,FOLLOW_COMMA_in_unitFactor2996); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(c);

			pushFollow(FOLLOW_unitName_in_unitFactor3000);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			pushFollow(FOLLOW_mulDiv_in_unitFactor3004);
			op=mulDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mulDiv.add(op.getTree());
			factor=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor3008); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NUMBER.add(factor);

			// AST REWRITE
			// elements: c, factor, unit, op
			// token labels: c, factor
			// rule labels: op, unit, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_factor=new RewriteRuleTokenStream(adaptor,"token factor",factor);
			RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op",op!=null?op.getTree():null);
			RewriteRuleSubtreeStream stream_unit=new RewriteRuleSubtreeStream(adaptor,"rule unit",unit!=null?unit.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 680:5: -> ^( $c $unit $op $factor)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:680:8: ^( $c $unit $op $factor)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_c.nextNode(), root_1);
				adaptor.addChild(root_1, stream_unit.nextTree());
				adaptor.addChild(root_1, stream_op.nextTree());
				adaptor.addChild(root_1, stream_factor.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unitFactor"


	public static class typeLibrary_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "typeLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:1: typeLibrary : (decs+= typeDeclaration )+ ;
	public final BLESS3Parser.typeLibrary_return typeLibrary() throws RecognitionException {
		BLESS3Parser.typeLibrary_return retval = new BLESS3Parser.typeLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_decs=null;
		RuleReturnScope decs = null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:12: ( (decs+= typeDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:686:3: (decs+= typeDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:686:7: (decs+= typeDeclaration )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==LITERAL_type) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:686:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary3048);
					decs=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTree());
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "typeLibrary"


	public static class typeDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "typeDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:689:1: typeDeclaration : LITERAL_type ^id= ID LITERAL_is !ty= type ;
	public final BLESS3Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		BLESS3Parser.typeDeclaration_return retval = new BLESS3Parser.typeDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LITERAL_type12=null;
		Token LITERAL_is13=null;
		ParserRuleReturnScope ty =null;

		BAST id_tree=null;
		BAST LITERAL_type12_tree=null;
		BAST LITERAL_is13_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:689:16: ( LITERAL_type ^id= ID LITERAL_is !ty= type )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:3: LITERAL_type ^id= ID LITERAL_is !ty= type
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_type12=(Token)match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration3061); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_type12_tree = (BAST)adaptor.create(LITERAL_type12);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_type12_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_typeDeclaration3066); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			LITERAL_is13=(Token)match(input,LITERAL_is,FOLLOW_LITERAL_is_in_typeDeclaration3068); if (state.failed) return retval;
			pushFollow(FOLLOW_type_in_typeDeclaration3073);
			ty=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "typeDeclaration"


	public static class type_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:1: type : ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null );
	public final BLESS3Parser.type_return type() throws RecognitionException {
		BLESS3Parser.type_return retval = new BLESS3Parser.type_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_boolean18=null;
		Token LITERAL_string19=null;
		Token LITERAL_null20=null;
		ParserRuleReturnScope enumerationType14 =null;
		ParserRuleReturnScope quantityType15 =null;
		ParserRuleReturnScope arrayType16 =null;
		ParserRuleReturnScope recordType17 =null;

		BAST LITERAL_boolean18_tree=null;
		BAST LITERAL_string19_tree=null;
		BAST LITERAL_null20_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:5: ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null )
			int alt15=7;
			switch ( input.LA(1) ) {
			case LITERAL_enumeration:
				{
				alt15=1;
				}
				break;
			case LITERAL_quantity:
				{
				alt15=2;
				}
				break;
			case LITERAL_array:
				{
				alt15=3;
				}
				break;
			case LITERAL_record:
			case LITERAL_union:
			case LITERAL_variant:
				{
				alt15=4;
				}
				break;
			case LITERAL_boolean:
				{
				alt15=5;
				}
				break;
			case LITERAL_string:
				{
				alt15=6;
				}
				break;
			case LITERAL_null:
				{
				alt15=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:694:3: enumerationType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationType_in_type3085);
					enumerationType14=enumerationType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationType14.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:695:5: quantityType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantityType_in_type3091);
					quantityType15=quantityType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantityType15.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:5: arrayType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type3097);
					arrayType16=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType16.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:697:5: recordType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type3103);
					recordType17=recordType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType17.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:698:5: LITERAL_boolean
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_boolean18=(Token)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type3109); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_boolean18_tree = (BAST)adaptor.create(LITERAL_boolean18);
					adaptor.addChild(root_0, LITERAL_boolean18_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:699:5: LITERAL_string
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_string19=(Token)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type3115); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_string19_tree = (BAST)adaptor.create(LITERAL_string19);
					adaptor.addChild(root_0, LITERAL_string19_tree);
					}

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:5: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null20=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type3121); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null20_tree = (BAST)adaptor.create(LITERAL_null20);
					adaptor.addChild(root_0, LITERAL_null20_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "type"


	public static class typeOrReference_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "typeOrReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:703:1: typeOrReference : (ty= type |ref= ID );
	public final BLESS3Parser.typeOrReference_return typeOrReference() throws RecognitionException {
		BLESS3Parser.typeOrReference_return retval = new BLESS3Parser.typeOrReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ref=null;
		ParserRuleReturnScope ty =null;

		BAST ref_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:703:16: (ty= type |ref= ID )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LITERAL_array||LA16_0==LITERAL_boolean||LA16_0==LITERAL_enumeration||LA16_0==LITERAL_null||LA16_0==LITERAL_quantity||LA16_0==LITERAL_record||LA16_0==LITERAL_string||LA16_0==LITERAL_union||LA16_0==LITERAL_variant) ) {
				alt16=1;
			}
			else if ( (LA16_0==ID) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:3: ty= type
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeOrReference3133);
					ty=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:13: ref= ID
					{
					root_0 = (BAST)adaptor.nil();


					ref=(Token)match(input,ID,FOLLOW_ID_in_typeOrReference3139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ref_tree = (BAST)adaptor.create(ref);
					adaptor.addChild(root_0, ref_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "typeOrReference"


	public static class enumerationType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "enumerationType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:707:1: enumerationType : LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !;
	public final BLESS3Parser.enumerationType_return enumerationType() throws RecognitionException {
		BLESS3Parser.enumerationType_return retval = new BLESS3Parser.enumerationType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_enumeration21=null;
		Token LPAREN22=null;
		Token RPAREN23=null;
		Token defining_enumeration_literal=null;
		List<Object> list_defining_enumeration_literal=null;

		BAST LITERAL_enumeration21_tree=null;
		BAST LPAREN22_tree=null;
		BAST RPAREN23_tree=null;
		BAST defining_enumeration_literal_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:707:16: ( LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:3: LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_enumeration21=(Token)match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType3152); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_enumeration21_tree = (BAST)adaptor.create(LITERAL_enumeration21);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_enumeration21_tree, root_0);
			}

			LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumerationType3155); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:60: (defining_enumeration_literal+= ID )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==ID) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:60: defining_enumeration_literal+= ID
					{
					defining_enumeration_literal=(Token)match(input,ID,FOLLOW_ID_in_enumerationType3160); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					defining_enumeration_literal_tree = (BAST)adaptor.create(defining_enumeration_literal);
					adaptor.addChild(root_0, defining_enumeration_literal_tree);
					}

					if (list_defining_enumeration_literal==null) list_defining_enumeration_literal=new ArrayList<Object>();
					list_defining_enumeration_literal.add(defining_enumeration_literal);
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumerationType3163); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "enumerationType"


	public static class quantityType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantityType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:1: quantityType : q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )? ;
	public final BLESS3Parser.quantityType_return quantityType() throws RecognitionException {
		BLESS3Parser.quantityType_return retval = new BLESS3Parser.quantityType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token q=null;
		Token unit=null;
		Token scalar=null;
		Token whole=null;
		Token dd=null;
		Token st=null;
		Token rep=null;
		Token representation=null;
		Token LBRACKET24=null;
		Token RBRACKET25=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope step =null;

		BAST q_tree=null;
		BAST unit_tree=null;
		BAST scalar_tree=null;
		BAST whole_tree=null;
		BAST dd_tree=null;
		BAST st_tree=null;
		BAST rep_tree=null;
		BAST representation_tree=null;
		BAST LBRACKET24_tree=null;
		BAST RBRACKET25_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:13: (q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:3: q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )?
			{
			root_0 = (BAST)adaptor.nil();


			q=(Token)match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType3179); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			q_tree = (BAST)adaptor.create(q);
			root_0 = (BAST)adaptor.becomeRoot(q_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:3: (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole )
			int alt18=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt18=1;
				}
				break;
			case LITERAL_scalar:
				{
				alt18=2;
				}
				break;
			case LITERAL_whole:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:5: unit= ID
					{
					unit=(Token)match(input,ID,FOLLOW_ID_in_quantityType3189); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					unit_tree = (BAST)adaptor.create(unit);
					adaptor.addChild(root_0, unit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:15: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType3195); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					scalar_tree = (BAST)adaptor.create(scalar);
					adaptor.addChild(root_0, scalar_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:39: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType3201); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					whole_tree = (BAST)adaptor.create(whole);
					adaptor.addChild(root_0, whole_tree);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:714:3: ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LBRACKET) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:714:5: LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )?
					{
					LBRACKET24=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_quantityType3209); if (state.failed) return retval;
					pushFollow(FOLLOW_aNumber_in_quantityType3214);
					lb=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

					dd=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType3218); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					dd_tree = (BAST)adaptor.create(dd);
					root_0 = (BAST)adaptor.becomeRoot(dd_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_quantityType3223);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					RBRACKET25=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_quantityType3225); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:715:3: (st= LITERAL_step ^step= aNumber )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LITERAL_step) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:715:5: st= LITERAL_step ^step= aNumber
							{
							st=(Token)match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType3235); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							st_tree = (BAST)adaptor.create(st);
							root_0 = (BAST)adaptor.becomeRoot(st_tree, root_0);
							}

							pushFollow(FOLLOW_aNumber_in_quantityType3240);
							step=aNumber();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, step.getTree());

							}
							break;

					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:3: (rep= LITERAL_representation ^representation= QCLREF )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LITERAL_representation) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:5: rep= LITERAL_representation ^representation= QCLREF
					{
					rep=(Token)match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType3255); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					rep_tree = (BAST)adaptor.create(rep);
					root_0 = (BAST)adaptor.becomeRoot(rep_tree, root_0);
					}

					representation=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType3260); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					representation_tree = (BAST)adaptor.create(representation);
					adaptor.addChild(root_0, representation_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "quantityType"


	public static class arrayType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "arrayType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:719:1: arrayType : LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference ;
	public final BLESS3Parser.arrayType_return arrayType() throws RecognitionException {
		BLESS3Parser.arrayType_return retval = new BLESS3Parser.arrayType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_array26=null;
		Token LBRACKET27=null;
		Token RBRACKET28=null;
		Token LITERAL_of29=null;
		ParserRuleReturnScope array_ranges =null;
		ParserRuleReturnScope ty =null;

		BAST LITERAL_array26_tree=null;
		BAST LBRACKET27_tree=null;
		BAST RBRACKET28_tree=null;
		BAST LITERAL_of29_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:719:11: ( LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:3: LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_array26=(Token)match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType3279); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_array26_tree = (BAST)adaptor.create(LITERAL_array26);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_array26_tree, root_0);
			}

			LBRACKET27=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType3282); if (state.failed) return retval;
			pushFollow(FOLLOW_arrayRangeList_in_arrayType3287);
			array_ranges=arrayRangeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, array_ranges.getTree());

			RBRACKET28=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType3289); if (state.failed) return retval;
			LITERAL_of29=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType3292); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_of29_tree = (BAST)adaptor.create(LITERAL_of29);
			adaptor.addChild(root_0, LITERAL_of29_tree);
			}

			pushFollow(FOLLOW_typeOrReference_in_arrayType3296);
			ty=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "arrayType"


	public static class arrayRangeList_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "arrayRangeList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:723:1: arrayRangeList :rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? ;
	public final BLESS3Parser.arrayRangeList_return arrayRangeList() throws RecognitionException {
		BLESS3Parser.arrayRangeList_return retval = new BLESS3Parser.arrayRangeList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA30=null;
		Token COMMA31=null;
		List<Object> list_rang=null;
		RuleReturnScope rang = null;
		BAST COMMA30_tree=null;
		BAST COMMA31_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:723:16: (rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:3: rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_arrayRange_in_arrayRangeList3312);
			rang=arrayRange();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

			if (list_rang==null) list_rang=new ArrayList<Object>();
			list_rang.add(rang.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:20: ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==COMMA) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:22: COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )*
					{
					COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3316); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA30_tree = (BAST)adaptor.create(COMMA30);
					root_0 = (BAST)adaptor.becomeRoot(COMMA30_tree, root_0);
					}

					pushFollow(FOLLOW_arrayRange_in_arrayRangeList3321);
					rang=arrayRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

					if (list_rang==null) list_rang=new ArrayList<Object>();
					list_rang.add(rang.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:46: ( COMMA !rang+= arrayRange )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==COMMA) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:48: COMMA !rang+= arrayRange
							{
							COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3325); if (state.failed) return retval;
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList3330);
							rang=arrayRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

							if (list_rang==null) list_rang=new ArrayList<Object>();
							list_rang.add(rang.getTree());
							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "arrayRangeList"


	public static class arrayRange_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "arrayRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:1: arrayRange : lb= aNumber ( DOTDOT ^ub= aNumber )? ;
	public final BLESS3Parser.arrayRange_return arrayRange() throws RecognitionException {
		BLESS3Parser.arrayRange_return retval = new BLESS3Parser.arrayRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT32=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST DOTDOT32_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:12: (lb= aNumber ( DOTDOT ^ub= aNumber )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:14: lb= aNumber ( DOTDOT ^ub= aNumber )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_aNumber_in_arrayRange3350);
			lb=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:25: ( DOTDOT ^ub= aNumber )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==DOTDOT) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:27: DOTDOT ^ub= aNumber
					{
					DOTDOT32=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange3354); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT32_tree = (BAST)adaptor.create(DOTDOT32);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT32_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_arrayRange3359);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "arrayRange"


	public static class recordType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:1: recordType : ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !;
	public final BLESS3Parser.recordType_return recordType() throws RecognitionException {
		BLESS3Parser.recordType_return retval = new BLESS3Parser.recordType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set33=null;
		Token LPAREN34=null;
		Token RPAREN35=null;
		List<Object> list_fields=null;
		RuleReturnScope fields = null;
		BAST set33_tree=null;
		BAST LPAREN34_tree=null;
		BAST RPAREN35_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:12: ( ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:3: ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			set33=input.LT(1);
			set33=input.LT(1);
			if ( input.LA(1)==LITERAL_record||input.LA(1)==LITERAL_union||input.LA(1)==LITERAL_variant ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(set33), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_recordType3389); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:17: (fields+= recordField )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==ID) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:17: fields+= recordField
					{
					pushFollow(FOLLOW_recordField_in_recordType3394);
					fields=recordField();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fields.getTree());

					if (list_fields==null) list_fields=new ArrayList<Object>();
					list_fields.add(fields.getTree());
					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_recordType3397); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "recordType"


	public static class recordField_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:734:1: recordField : id= ID COLON ^ty= typeOrReference ;
	public final BLESS3Parser.recordField_return recordField() throws RecognitionException {
		BLESS3Parser.recordField_return retval = new BLESS3Parser.recordField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token COLON36=null;
		ParserRuleReturnScope ty =null;

		BAST id_tree=null;
		BAST COLON36_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:734:13: (id= ID COLON ^ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:735:3: id= ID COLON ^ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_recordField3415); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_recordField3417); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON36_tree = (BAST)adaptor.create(COLON36);
			root_0 = (BAST)adaptor.becomeRoot(COLON36_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_recordField3422);
			ty=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "recordField"


	public static class assertionLibrary_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertionLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:741:1: assertionLibrary : (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) ;
	public final BLESS3Parser.assertionLibrary_return assertionLibrary() throws RecognitionException {
		BLESS3Parser.assertionLibrary_return retval = new BLESS3Parser.assertionLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_assertion_list=null;
		ParserRuleReturnScope ghosts =null;
		RuleReturnScope assertion_list = null;
		RewriteRuleSubtreeStream stream_ghostVariables=new RewriteRuleSubtreeStream(adaptor,"rule ghostVariables");
		RewriteRuleSubtreeStream stream_namedAssertion=new RewriteRuleSubtreeStream(adaptor,"rule namedAssertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:741:17: ( (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:3: (ghosts= ghostVariables )? (assertion_list+= namedAssertion )*
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:3: (ghosts= ghostVariables )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LITERAL_ghost) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:5: ghosts= ghostVariables
					{
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary3442);
					ghosts=ghostVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ghostVariables.add(ghosts.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:743:17: (assertion_list+= namedAssertion )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==LASS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:743:17: assertion_list+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertionLibrary3451);
					assertion_list=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namedAssertion.add(assertion_list.getTree());
					if (list_assertion_list==null) list_assertion_list=new ArrayList<Object>();
					list_assertion_list.add(assertion_list.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			// AST REWRITE
			// elements: ghosts, assertion_list
			// token labels: 
			// rule labels: ghosts, retval
			// token list labels: 
			// rule list labels: assertion_list
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_ghosts=new RewriteRuleSubtreeStream(adaptor,"rule ghosts",ghosts!=null?ghosts.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_assertion_list=new RewriteRuleSubtreeStream(adaptor,"token assertion_list",list_assertion_list);
			root_0 = (BAST)adaptor.nil();
			// 744:3: -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:6: ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ANNEX, "ASSERTION_ANNEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:25: ( $ghosts)?
				if ( stream_ghosts.hasNext() ) {
					adaptor.addChild(root_1, stream_ghosts.nextTree());
				}
				stream_ghosts.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:34: ( $assertion_list)*
				while ( stream_assertion_list.hasNext() ) {
					adaptor.addChild(root_1, stream_assertion_list.nextTree());
				}
				stream_assertion_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assertionLibrary"


	public static class ghostVariables_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "ghostVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:747:1: ghostVariables : LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ ;
	public final BLESS3Parser.ghostVariables_return ghostVariables() throws RecognitionException {
		BLESS3Parser.ghostVariables_return retval = new BLESS3Parser.ghostVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_ghost37=null;
		Token LITERAL_variables38=null;
		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		BAST LITERAL_ghost37_tree=null;
		BAST LITERAL_variables38_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:3: ( LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:3: LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_ghost37=(Token)match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables3484); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_ghost37_tree = (BAST)adaptor.create(LITERAL_ghost37);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_ghost37_tree, root_0);
			}

			LITERAL_variables38=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_ghostVariables3487); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:39: (gv+= ghostVariable )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==LITERAL_def) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:39: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables3492);
					gv=ghostVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, gv.getTree());

					if (list_gv==null) list_gv=new ArrayList<Object>();
					list_gv.add(gv.getTree());
					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "ghostVariables"


	public static class ghostVariable_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "ghostVariable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:752:1: ghostVariable : LITERAL_def ^id= ID TILDE !tod= typeOrReference ;
	public final BLESS3Parser.ghostVariable_return ghostVariable() throws RecognitionException {
		BLESS3Parser.ghostVariable_return retval = new BLESS3Parser.ghostVariable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LITERAL_def39=null;
		Token TILDE40=null;
		ParserRuleReturnScope tod =null;

		BAST id_tree=null;
		BAST LITERAL_def39_tree=null;
		BAST TILDE40_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:752:14: ( LITERAL_def ^id= ID TILDE !tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:753:3: LITERAL_def ^id= ID TILDE !tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_def39=(Token)match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable3505); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_def39_tree = (BAST)adaptor.create(LITERAL_def39);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_def39_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_ghostVariable3511); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE40=(Token)match(input,TILDE,FOLLOW_TILDE_in_ghostVariable3513); if (state.failed) return retval;
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable3518);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tod.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "ghostVariable"


	public static class namedAssertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namedAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:756:1: namedAssertion : LASS id= ID COLON ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) RASS -> {formals==null&&pred!=null}? ^( ASSERTION ^( LABEL $id) $pred) -> {formals!=null&&pred!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {formals==null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {formals!=null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {assertionvariable!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> ^( ASSERTION ^( LABEL $id) DUMMY ) ;
	public final BLESS3Parser.namedAssertion_return namedAssertion() throws RecognitionException {
		BLESS3Parser.namedAssertion_return retval = new BLESS3Parser.namedAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token ret=null;
		Token assertionvariable=null;
		Token til=null;
		Token enumerationTy=null;
		Token LASS41=null;
		Token COLON42=null;
		Token COLON43=null;
		Token ASSIGN44=null;
		Token RASS45=null;
		ParserRuleReturnScope formals =null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;
		ParserRuleReturnScope enumeration =null;

		BAST id_tree=null;
		BAST ret_tree=null;
		BAST assertionvariable_tree=null;
		BAST til_tree=null;
		BAST enumerationTy_tree=null;
		BAST LASS41_tree=null;
		BAST COLON42_tree=null;
		BAST COLON43_tree=null;
		BAST ASSIGN44_tree=null;
		BAST RASS45_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");
		RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
		RewriteRuleSubtreeStream stream_assertionEnumeration=new RewriteRuleSubtreeStream(adaptor,"rule assertionEnumeration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:756:15: ( LASS id= ID COLON ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) RASS -> {formals==null&&pred!=null}? ^( ASSERTION ^( LABEL $id) $pred) -> {formals!=null&&pred!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {formals==null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {formals!=null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {assertionvariable!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> ^( ASSERTION ^( LABEL $id) DUMMY ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:757:3: LASS id= ID COLON ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) RASS
			{
			LASS41=(Token)match(input,LASS,FOLLOW_LASS_in_namedAssertion3533); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS41);

			id=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3539); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			COLON42=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3541); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON42);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:759:3: ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ID) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==TILDE) ) {
					int LA31_3 = input.LA(3);
					if ( (LA31_3==ID) ) {
						int LA31_4 = input.LA(4);
						if ( (LA31_4==PLUS_ARROW) ) {
							alt31=2;
						}
						else if ( (LA31_4==COLON||LA31_4==COMMA||LA31_4==LITERAL_returns) ) {
							alt31=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA31_3==LITERAL_array||LA31_3==LITERAL_boolean||LA31_3==LITERAL_enumeration||LA31_3==LITERAL_null||LA31_3==LITERAL_quantity||LA31_3==LITERAL_record||LA31_3==LITERAL_string||LA31_3==LITERAL_union||LA31_3==LITERAL_variant) ) {
						alt31=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA31_0==COLON||LA31_0==LITERAL_returns) ) {
				alt31=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:760:5: (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:760:12: (formals= variableList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ID) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:760:12: formals= variableList
							{
							pushFollow(FOLLOW_variableList_in_namedAssertion3554);
							formals=variableList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_variableList.add(formals.getTree());
							}
							break;

					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:7: ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==COLON) ) {
						alt30=1;
					}
					else if ( (LA30_0==LITERAL_returns) ) {
						alt30=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:7: COLON pred= predicate
							{
							COLON43=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3572); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(COLON43);

							pushFollow(FOLLOW_predicate_in_namedAssertion3577);
							pred=predicate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:764:7: ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue
							{
							ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion3597); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

							pushFollow(FOLLOW_typeOrReference_in_namedAssertion3601);
							tod=typeOrReference();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
							ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namedAssertion3603); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN44);

							pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion3608);
							functionvalue=assertionFunctionValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:767:5: assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration
					{
					assertionvariable=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3633); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(assertionvariable);

					til=(Token)match(input,TILDE,FOLLOW_TILDE_in_namedAssertion3637); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(til);

					enumerationTy=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3641); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(enumerationTy);

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion3645);
					enumeration=assertionEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertionEnumeration.add(enumeration.getTree());
					}
					break;

			}

			RASS45=(Token)match(input,RASS,FOLLOW_RASS_in_namedAssertion3653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS45);

			// AST REWRITE
			// elements: tod, tod, formals, ret, pred, pred, assertionvariable, id, functionvalue, enumerationTy, id, enumeration, id, til, ret, formals, functionvalue, id, id, id
			// token labels: ret, assertionvariable, til, id, enumerationTy
			// rule labels: pred, tod, functionvalue, formals, enumeration, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ret=new RewriteRuleTokenStream(adaptor,"token ret",ret);
			RewriteRuleTokenStream stream_assertionvariable=new RewriteRuleTokenStream(adaptor,"token assertionvariable",assertionvariable);
			RewriteRuleTokenStream stream_til=new RewriteRuleTokenStream(adaptor,"token til",til);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_enumerationTy=new RewriteRuleTokenStream(adaptor,"token enumerationTy",enumerationTy);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_tod=new RewriteRuleSubtreeStream(adaptor,"rule tod",tod!=null?tod.getTree():null);
			RewriteRuleSubtreeStream stream_functionvalue=new RewriteRuleSubtreeStream(adaptor,"rule functionvalue",functionvalue!=null?functionvalue.getTree():null);
			RewriteRuleSubtreeStream stream_formals=new RewriteRuleSubtreeStream(adaptor,"rule formals",formals!=null?formals.getTree():null);
			RewriteRuleSubtreeStream stream_enumeration=new RewriteRuleSubtreeStream(adaptor,"rule enumeration",enumeration!=null?enumeration.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 770:4: -> {formals==null&&pred!=null}? ^( ASSERTION ^( LABEL $id) $pred)
			if (formals==null&&pred!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:770:36: ^( ASSERTION ^( LABEL $id) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:770:49: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 771:4: -> {formals!=null&&pred!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred)
			if (formals!=null&&pred!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:36: ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:49: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:64: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 772:4: -> {formals==null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue)
			if (formals==null&&tod!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:772:35: ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:772:57: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:772:72: ^( $ret $tod)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ret.nextNode(), root_2);
				adaptor.addChild(root_2, stream_tod.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_functionvalue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 773:4: -> {formals!=null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
			if (formals!=null&&tod!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:35: ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:57: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:72: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:97: ^( $ret $tod)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ret.nextNode(), root_2);
				adaptor.addChild(root_2, stream_tod.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_functionvalue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 774:4: -> {assertionvariable!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
			if (assertionvariable!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:35: ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, "ASSERTION_ENUMERATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:60: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:75: ^( $til $assertionvariable $enumerationTy)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_til.nextNode(), root_2);
				adaptor.addChild(root_2, stream_assertionvariable.nextNode());
				adaptor.addChild(root_2, stream_enumerationTy.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_enumeration.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 775:4: -> ^( ASSERTION ^( LABEL $id) DUMMY )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:7: ^( ASSERTION ^( LABEL $id) DUMMY )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:20: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, (BAST)adaptor.create(DUMMY, "DUMMY"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "namedAssertion"


	public static class predicate_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:778:1: predicate : expression ;
	public final BLESS3Parser.predicate_return predicate() throws RecognitionException {
		BLESS3Parser.predicate_return retval = new BLESS3Parser.predicate_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression46 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:778:10: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:778:13: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_predicate3985);
			expression46=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression46.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "predicate"


	public static class variableList_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variableList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:780:1: variableList : first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? ;
	public final BLESS3Parser.variableList_return variableList() throws RecognitionException {
		BLESS3Parser.variableList_return retval = new BLESS3Parser.variableList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA47=null;
		Token COMMA48=null;
		List<Object> list_parameter=null;
		ParserRuleReturnScope first =null;
		RuleReturnScope parameter = null;
		BAST COMMA47_tree=null;
		BAST COMMA48_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:780:13: (first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:3: first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_variableList3996);
			first=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, first.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:18: ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMA) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:20: COMMA ^parameter+= variable ( COMMA !parameter+= variable )*
					{
					COMMA47=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList4000); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA47_tree = (BAST)adaptor.create(COMMA47);
					root_0 = (BAST)adaptor.becomeRoot(COMMA47_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_variableList4005);
					parameter=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

					if (list_parameter==null) list_parameter=new ArrayList<Object>();
					list_parameter.add(parameter.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:47: ( COMMA !parameter+= variable )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==COMMA) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:49: COMMA !parameter+= variable
							{
							COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList4009); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_variableList4014);
							parameter=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTree());
							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "variableList"


	public static class variable_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:784:1: variable : id= ID TILDE ^tod= typeOrReference ;
	public final BLESS3Parser.variable_return variable() throws RecognitionException {
		BLESS3Parser.variable_return retval = new BLESS3Parser.variable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token TILDE49=null;
		ParserRuleReturnScope tod =null;

		BAST id_tree=null;
		BAST TILDE49_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:784:9: (id= ID TILDE ^tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:785:3: id= ID TILDE ^tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_variable4032); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE49=(Token)match(input,TILDE,FOLLOW_TILDE_in_variable4034); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TILDE49_tree = (BAST)adaptor.create(TILDE49);
			root_0 = (BAST)adaptor.becomeRoot(TILDE49_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_variable4039);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tod.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "variable"


	public static class assertionFunctionValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertionFunctionValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:788:1: assertionFunctionValue : ( conditionalAssertionFunction | expression );
	public final BLESS3Parser.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		BLESS3Parser.assertionFunctionValue_return retval = new BLESS3Parser.assertionFunctionValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalAssertionFunction50 =null;
		ParserRuleReturnScope expression51 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:788:23: ( conditionalAssertionFunction | expression )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==LBRACKET) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==ID) ) {
					alt34=2;
				}
				else if ( (LA34_1==LPAREN) ) {
					alt34=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA34_0==AADL_STRING_LITERAL||LA34_0==ID||LA34_0==LITERAL_abs||LA34_0==LITERAL_all||LA34_0==LITERAL_exists||LA34_0==LITERAL_false||(LA34_0 >= LITERAL_not && LA34_0 <= LITERAL_now)||(LA34_0 >= LITERAL_null && LA34_0 <= LITERAL_numberof)||LA34_0==LITERAL_product||LA34_0==LITERAL_round||LA34_0==LITERAL_self||LA34_0==LITERAL_sum||LA34_0==LITERAL_timeout||LA34_0==LITERAL_tops||(LA34_0 >= LITERAL_true && LA34_0 <= LITERAL_truncate)||LA34_0==LPAREN||LA34_0==MINUS||LA34_0==NUMBER||LA34_0==OCTOTHORPE||(LA34_0 >= QCLREF && LA34_0 <= QCREF)) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:789:2: conditionalAssertionFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue4050);
					conditionalAssertionFunction50=conditionalAssertionFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAssertionFunction50.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:790:4: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assertionFunctionValue4056);
					expression51=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression51.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assertionFunctionValue"


	public static class conditionalAssertionFunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conditionalAssertionFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:793:1: conditionalAssertionFunction : LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) ;
	public final BLESS3Parser.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		BLESS3Parser.conditionalAssertionFunction_return retval = new BLESS3Parser.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET52=null;
		Token COMMA53=null;
		Token RBRACKET54=null;
		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		BAST LBRACKET52_tree=null;
		BAST COMMA53_tree=null;
		BAST RBRACKET54_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_conditionValuePair=new RewriteRuleSubtreeStream(adaptor,"rule conditionValuePair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:793:29: ( LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:2: LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET
			{
			LBRACKET52=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_conditionalAssertionFunction4069); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET52);

			pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction4073);
			cvp=conditionValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
			if (list_cvp==null) list_cvp=new ArrayList<Object>();
			list_cvp.add(cvp.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:35: ( COMMA cvp+= conditionValuePair )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==COMMA) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:37: COMMA cvp+= conditionValuePair
					{
					COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_conditionalAssertionFunction4077); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA53);

					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction4081);
					cvp=conditionValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
					if (list_cvp==null) list_cvp=new ArrayList<Object>();
					list_cvp.add(cvp.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			RBRACKET54=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_conditionalAssertionFunction4086); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET54);

			// AST REWRITE
			// elements: cvp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: cvp
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_cvp=new RewriteRuleSubtreeStream(adaptor,"token cvp",list_cvp);
			root_0 = (BAST)adaptor.nil();
			// 795:4: -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:7: ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITIONAL_ASSERTION_FUNCTION, "CONDITIONAL_ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:42: ( $cvp)*
				while ( stream_cvp.hasNext() ) {
					adaptor.addChild(root_1, stream_cvp.nextTree());
				}
				stream_cvp.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "conditionalAssertionFunction"


	public static class conditionValuePair_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conditionValuePair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:798:1: conditionValuePair : LPAREN ! predicate CVP ^ expression ;
	public final BLESS3Parser.conditionValuePair_return conditionValuePair() throws RecognitionException {
		BLESS3Parser.conditionValuePair_return retval = new BLESS3Parser.conditionValuePair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN55=null;
		Token CVP57=null;
		ParserRuleReturnScope predicate56 =null;
		ParserRuleReturnScope expression58 =null;

		BAST LPAREN55_tree=null;
		BAST CVP57_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:798:19: ( LPAREN ! predicate CVP ^ expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:799:3: LPAREN ! predicate CVP ^ expression
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN55=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionValuePair4114); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_conditionValuePair4117);
			predicate56=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate56.getTree());

			CVP57=(Token)match(input,CVP,FOLLOW_CVP_in_conditionValuePair4119); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CVP57_tree = (BAST)adaptor.create(CVP57);
			root_0 = (BAST)adaptor.becomeRoot(CVP57_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_conditionValuePair4122);
			expression58=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression58.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "conditionValuePair"


	public static class assertionEnumeration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertionEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:802:1: assertionEnumeration : ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) ) -> ^( $pa $pair) );
	public final BLESS3Parser.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		BLESS3Parser.assertionEnumeration_return retval = new BLESS3Parser.assertionEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token com=null;
		Token COMMA59=null;
		List<Object> list_pair=null;
		ParserRuleReturnScope inv =null;
		RuleReturnScope pair = null;
		BAST pa_tree=null;
		BAST com_tree=null;
		BAST COMMA59_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");
		RewriteRuleSubtreeStream stream_enumerationPair=new RewriteRuleSubtreeStream(adaptor,"rule enumerationPair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:802:21: ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) ) -> ^( $pa $pair) )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==PLUS_ARROW) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==ID) ) {
					int LA38_2 = input.LA(3);
					if ( (LA38_2==LPAREN) ) {
						alt38=1;
					}
					else if ( (LA38_2==ARROW) ) {
						alt38=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 38, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:2: (pa= PLUS_ARROW inv= invocation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:2: (pa= PLUS_ARROW inv= invocation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:4: pa= PLUS_ARROW inv= invocation
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration4138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_invocation_in_assertionEnumeration4142);
					inv=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
					}

					// AST REWRITE
					// elements: inv, pa
					// token labels: pa
					// rule labels: inv, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_pa=new RewriteRuleTokenStream(adaptor,"token pa",pa);
					RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 804:4: -> ^( $pa $inv)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:7: ^( $pa $inv)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						adaptor.addChild(root_1, stream_inv.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:4: pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration4169); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4173);
					pair=enumerationPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
					if (list_pair==null) list_pair=new ArrayList<Object>();
					list_pair.add(pair.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:40: (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==COMMA) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:42: com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )*
							{
							com=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration4179); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(com);

							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4183);
							pair=enumerationPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTree());
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:74: ( COMMA pair+= enumerationPair )*
							loop36:
							while (true) {
								int alt36=2;
								int LA36_0 = input.LA(1);
								if ( (LA36_0==COMMA) ) {
									alt36=1;
								}

								switch (alt36) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:76: COMMA pair+= enumerationPair
									{
									COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration4187); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);

									pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4191);
									pair=enumerationPair();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
									if (list_pair==null) list_pair=new ArrayList<Object>();
									list_pair.add(pair.getTree());
									}
									break;

								default :
									break loop36;
								}
							}

							}
							break;

					}

					}

					// AST REWRITE
					// elements: pair, pa, pa, com, pair
					// token labels: com, pa
					// rule labels: retval
					// token list labels: 
					// rule list labels: pair
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_com=new RewriteRuleTokenStream(adaptor,"token com",com);
					RewriteRuleTokenStream stream_pa=new RewriteRuleTokenStream(adaptor,"token pa",pa);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"token pair",list_pair);
					root_0 = (BAST)adaptor.nil();
					// 807:4: -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) )
					if (com!=null) {
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:20: ^( $pa ^( $com ( $pair)+ ) )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:27: ^( $com ( $pair)+ )
						{
						BAST root_2 = (BAST)adaptor.nil();
						root_2 = (BAST)adaptor.becomeRoot(stream_com.nextNode(), root_2);
						if ( !(stream_pair.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_pair.hasNext() ) {
							adaptor.addChild(root_2, stream_pair.nextTree());
						}
						stream_pair.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 808:4: -> ^( $pa $pair)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:808:7: ^( $pa $pair)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						adaptor.addChild(root_1, stream_pair.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assertionEnumeration"


	public static class enumerationPair_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "enumerationPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:811:1: enumerationPair : ID ARROW ^ predicate ;
	public final BLESS3Parser.enumerationPair_return enumerationPair() throws RecognitionException {
		BLESS3Parser.enumerationPair_return retval = new BLESS3Parser.enumerationPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID60=null;
		Token ARROW61=null;
		ParserRuleReturnScope predicate62 =null;

		BAST ID60_tree=null;
		BAST ARROW61_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:811:16: ( ID ARROW ^ predicate )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:3: ID ARROW ^ predicate
			{
			root_0 = (BAST)adaptor.nil();


			ID60=(Token)match(input,ID,FOLLOW_ID_in_enumerationPair4251); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID60_tree = (BAST)adaptor.create(ID60);
			adaptor.addChild(root_0, ID60_tree);
			}

			ARROW61=(Token)match(input,ARROW,FOLLOW_ARROW_in_enumerationPair4253); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARROW61_tree = (BAST)adaptor.create(ARROW61);
			root_0 = (BAST)adaptor.becomeRoot(ARROW61_tree, root_0);
			}

			pushFollow(FOLLOW_predicate_in_enumerationPair4256);
			predicate62=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate62.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "enumerationPair"


	public static class namelessAssertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:815:1: namelessAssertion : LASS pred= predicate RASS -> ^( ASSERTION $pred) ;
	public final BLESS3Parser.namelessAssertion_return namelessAssertion() throws RecognitionException {
		BLESS3Parser.namelessAssertion_return retval = new BLESS3Parser.namelessAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LASS63=null;
		Token RASS64=null;
		ParserRuleReturnScope pred =null;

		BAST LASS63_tree=null;
		BAST RASS64_tree=null;
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:815:18: ( LASS pred= predicate RASS -> ^( ASSERTION $pred) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:816:3: LASS pred= predicate RASS
			{
			LASS63=(Token)match(input,LASS,FOLLOW_LASS_in_namelessAssertion4268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS63);

			pushFollow(FOLLOW_predicate_in_namelessAssertion4272);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			RASS64=(Token)match(input,RASS,FOLLOW_RASS_in_namelessAssertion4274); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS64);

			// AST REWRITE
			// elements: pred
			// token labels: 
			// rule labels: pred, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 817:5: -> ^( ASSERTION $pred)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:817:8: ^( ASSERTION $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "namelessAssertion"


	public static class namelessFunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:1: namelessFunction : LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue) ;
	public final BLESS3Parser.namelessFunction_return namelessFunction() throws RecognitionException {
		BLESS3Parser.namelessFunction_return retval = new BLESS3Parser.namelessFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ret=null;
		Token LASS65=null;
		Token ASSIGN66=null;
		Token RASS67=null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;

		BAST ret_tree=null;
		BAST LASS65_tree=null;
		BAST ASSIGN66_tree=null;
		BAST RASS67_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:17: ( LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:3: LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS
			{
			LASS65=(Token)match(input,LASS,FOLLOW_LASS_in_namelessFunction4303); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS65);

			ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction4307); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

			pushFollow(FOLLOW_typeOrReference_in_namelessFunction4311);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
			ASSIGN66=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namelessFunction4313); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN66);

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction4317);
			functionvalue=assertionFunctionValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
			RASS67=(Token)match(input,RASS,FOLLOW_RASS_in_namelessFunction4319); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS67);

			// AST REWRITE
			// elements: tod, functionvalue, ret
			// token labels: ret
			// rule labels: tod, functionvalue, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ret=new RewriteRuleTokenStream(adaptor,"token ret",ret);
			RewriteRuleSubtreeStream stream_tod=new RewriteRuleSubtreeStream(adaptor,"rule tod",tod!=null?tod.getTree():null);
			RewriteRuleSubtreeStream stream_functionvalue=new RewriteRuleSubtreeStream(adaptor,"rule functionvalue",functionvalue!=null?functionvalue.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 822:5: -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:822:8: ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:822:30: ^( $ret $tod)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ret.nextNode(), root_2);
				adaptor.addChild(root_2, stream_tod.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_functionvalue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "namelessFunction"


	public static class namelessEnumeration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:825:1: namelessEnumeration : LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION $inv) ;
	public final BLESS3Parser.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		BLESS3Parser.namelessEnumeration_return retval = new BLESS3Parser.namelessEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token LASS68=null;
		Token RASS69=null;
		ParserRuleReturnScope inv =null;

		BAST pa_tree=null;
		BAST LASS68_tree=null;
		BAST RASS69_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:825:20: ( LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION $inv) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:2: LASS pa= PLUS_ARROW inv= invocation RASS
			{
			LASS68=(Token)match(input,LASS,FOLLOW_LASS_in_namelessEnumeration4359); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS68);

			pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_namelessEnumeration4363); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

			pushFollow(FOLLOW_invocation_in_namelessEnumeration4367);
			inv=invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
			RASS69=(Token)match(input,RASS,FOLLOW_RASS_in_namelessEnumeration4369); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS69);

			// AST REWRITE
			// elements: inv
			// token labels: 
			// rule labels: inv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 827:4: -> ^( ASSERTION_ENUMERATION $inv)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:8: ^( ASSERTION_ENUMERATION $inv)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, "ASSERTION_ENUMERATION"), root_1);
				adaptor.addChild(root_1, stream_inv.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "namelessEnumeration"


	public static class invocation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "invocation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:1: invocation : id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE $id ( $params)* ( $exp)? ) ;
	public final BLESS3Parser.invocation_return invocation() throws RecognitionException {
		BLESS3Parser.invocation_return retval = new BLESS3Parser.invocation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN70=null;
		Token COMMA71=null;
		Token RPAREN72=null;
		List<Object> list_params=null;
		ParserRuleReturnScope exp =null;
		RuleReturnScope params = null;
		BAST id_tree=null;
		BAST LPAREN70_tree=null;
		BAST COMMA71_tree=null;
		BAST RPAREN72_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_actualParameter=new RewriteRuleSubtreeStream(adaptor,"rule actualParameter");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:11: (id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE $id ( $params)* ( $exp)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:831:2: id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_invocation4396); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN70=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_invocation4398); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN70);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:2: ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )?
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==COLON) ) {
					alt40=1;
				}
				else if ( ((LA40_1 >= AL && LA40_1 <= AM)||LA40_1==AT_SIGN||LA40_1==CARET||(LA40_1 >= DIVIDE && LA40_1 <= DOT)||LA40_1==EQ||LA40_1==EXP||LA40_1==GT||LA40_1==LBRACKET||LA40_1==LITERAL_and||LA40_1==LITERAL_div||LA40_1==LITERAL_iff||(LA40_1 >= LITERAL_implies && LA40_1 <= LITERAL_in)||LA40_1==LITERAL_mod||LA40_1==LITERAL_or||LA40_1==LITERAL_rem||(LA40_1 >= LITERAL_xor && LA40_1 <= LT)||LA40_1==MINUS||LA40_1==NEQ||LA40_1==OLD_NEQ||LA40_1==PLUS||LA40_1==PLUS_EQUALS||LA40_1==QUESTION||LA40_1==RPAREN||LA40_1==TICK||LA40_1==TIMES) ) {
					alt40=2;
				}
			}
			else if ( (LA40_0==AADL_STRING_LITERAL||LA40_0==LBRACKET||LA40_0==LITERAL_abs||LA40_0==LITERAL_all||LA40_0==LITERAL_exists||LA40_0==LITERAL_false||(LA40_0 >= LITERAL_not && LA40_0 <= LITERAL_now)||(LA40_0 >= LITERAL_null && LA40_0 <= LITERAL_numberof)||LA40_0==LITERAL_product||LA40_0==LITERAL_round||LA40_0==LITERAL_self||LA40_0==LITERAL_sum||LA40_0==LITERAL_timeout||LA40_0==LITERAL_tops||(LA40_0 >= LITERAL_true && LA40_0 <= LITERAL_truncate)||LA40_0==LPAREN||LA40_0==MINUS||LA40_0==NUMBER||LA40_0==OCTOTHORPE||(LA40_0 >= QCLREF && LA40_0 <= QCREF)) ) {
				alt40=2;
			}
			switch (alt40) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:6: params+= actualParameter ( COMMA params+= actualParameter )*
					{
					pushFollow(FOLLOW_actualParameter_in_invocation4408);
					params=actualParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
					if (list_params==null) list_params=new ArrayList<Object>();
					list_params.add(params.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:30: ( COMMA params+= actualParameter )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==COMMA) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:32: COMMA params+= actualParameter
							{
							COMMA71=(Token)match(input,COMMA,FOLLOW_COMMA_in_invocation4412); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA71);

							pushFollow(FOLLOW_actualParameter_in_invocation4416);
							params=actualParameter();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTree());
							}
							break;

						default :
							break loop39;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:833:6: exp= expression
					{
					pushFollow(FOLLOW_expression_in_invocation4430);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			RPAREN72=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_invocation4435); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN72);

			// AST REWRITE
			// elements: params, id, exp
			// token labels: id
			// rule labels: exp, retval
			// token list labels: 
			// rule list labels: params
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"token params",list_params);
			root_0 = (BAST)adaptor.nil();
			// 834:4: -> ^( INVOKE $id ( $params)* ( $exp)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:834:7: ^( INVOKE $id ( $params)* ( $exp)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVOKE, "INVOKE"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:834:22: ( $params)*
				while ( stream_params.hasNext() ) {
					adaptor.addChild(root_1, stream_params.nextTree());
				}
				stream_params.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:834:31: ( $exp)?
				if ( stream_exp.hasNext() ) {
					adaptor.addChild(root_1, stream_exp.nextTree());
				}
				stream_exp.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "invocation"


	public static class actualParameter_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "actualParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:1: actualParameter : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.actualParameter_return actualParameter() throws RecognitionException {
		BLESS3Parser.actualParameter_return retval = new BLESS3Parser.actualParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON73=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON73_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:16: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:838:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_actualParameter4470); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON73=(Token)match(input,COLON,FOLLOW_COLON_in_actualParameter4472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON73_tree = (BAST)adaptor.create(COLON73);
			root_0 = (BAST)adaptor.becomeRoot(COLON73_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_actualParameter4477);
			actual=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actual.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "actualParameter"


	public static class assertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:1: assertion : ( namedAssertion | namelessAssertion | namelessFunction | namelessEnumeration );
	public final BLESS3Parser.assertion_return assertion() throws RecognitionException {
		BLESS3Parser.assertion_return retval = new BLESS3Parser.assertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope namedAssertion74 =null;
		ParserRuleReturnScope namelessAssertion75 =null;
		ParserRuleReturnScope namelessFunction76 =null;
		ParserRuleReturnScope namelessEnumeration77 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:10: ( namedAssertion | namelessAssertion | namelessFunction | namelessEnumeration )
			int alt41=4;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LASS) ) {
				switch ( input.LA(2) ) {
				case ID:
					{
					int LA41_2 = input.LA(3);
					if ( (LA41_2==COLON) ) {
						alt41=1;
					}
					else if ( ((LA41_2 >= AL && LA41_2 <= AM)||LA41_2==AT_SIGN||LA41_2==CARET||(LA41_2 >= DIVIDE && LA41_2 <= DOT)||LA41_2==EQ||LA41_2==EXP||LA41_2==GT||LA41_2==LBRACKET||LA41_2==LITERAL_and||LA41_2==LITERAL_div||LA41_2==LITERAL_iff||(LA41_2 >= LITERAL_implies && LA41_2 <= LITERAL_in)||LA41_2==LITERAL_mod||LA41_2==LITERAL_or||LA41_2==LITERAL_rem||(LA41_2 >= LITERAL_xor && LA41_2 <= LT)||LA41_2==MINUS||LA41_2==NEQ||LA41_2==OLD_NEQ||LA41_2==PLUS||LA41_2==PLUS_EQUALS||(LA41_2 >= QUESTION && LA41_2 <= RASS)||LA41_2==TICK||LA41_2==TIMES) ) {
						alt41=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 41, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LITERAL_returns:
					{
					alt41=3;
					}
					break;
				case PLUS_ARROW:
					{
					alt41=4;
					}
					break;
				case AADL_STRING_LITERAL:
				case LBRACKET:
				case LITERAL_abs:
				case LITERAL_all:
				case LITERAL_exists:
				case LITERAL_false:
				case LITERAL_not:
				case LITERAL_now:
				case LITERAL_null:
				case LITERAL_numberof:
				case LITERAL_product:
				case LITERAL_round:
				case LITERAL_self:
				case LITERAL_sum:
				case LITERAL_timeout:
				case LITERAL_tops:
				case LITERAL_true:
				case LITERAL_truncate:
				case LPAREN:
				case MINUS:
				case NUMBER:
				case OCTOTHORPE:
				case QCLREF:
				case QCREF:
					{
					alt41=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:842:3: namedAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namedAssertion_in_assertion4489);
					namedAssertion74=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion74.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:843:5: namelessAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessAssertion_in_assertion4495);
					namelessAssertion75=namelessAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessAssertion75.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:5: namelessFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessFunction_in_assertion4501);
					namelessFunction76=namelessFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessFunction76.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:5: namelessEnumeration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessEnumeration_in_assertion4507);
					namelessEnumeration77=namelessEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessEnumeration77.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assertion"


	public static class expression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:1: expression : (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? );
	public final BLESS3Parser.expression_return expression() throws RecognitionException {
		BLESS3Parser.expression_return retval = new BLESS3Parser.expression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_iff78=null;
		Token LITERAL_implies79=null;
		ParserRuleReturnScope all =null;
		ParserRuleReturnScope exists =null;
		ParserRuleReturnScope sum =null;
		ParserRuleReturnScope product =null;
		ParserRuleReturnScope numberof =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		BAST LITERAL_iff78_tree=null;
		BAST LITERAL_implies79_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:11: (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? )
			int alt44=6;
			switch ( input.LA(1) ) {
			case LITERAL_all:
				{
				alt44=1;
				}
				break;
			case LITERAL_exists:
				{
				alt44=2;
				}
				break;
			case LITERAL_sum:
				{
				alt44=3;
				}
				break;
			case LITERAL_product:
				{
				alt44=4;
				}
				break;
			case LITERAL_numberof:
				{
				alt44=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_false:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_round:
			case LITERAL_self:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case MINUS:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt44=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:851:3: all= universalQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalQuantification_in_expression4525);
					all=universalQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, all.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:852:5: exists= existentialQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialQuantification_in_expression4533);
					exists=existentialQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:5: sum= sumQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_sumQuantification_in_expression4541);
					sum=sumQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sum.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:854:5: product= productQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_productQuantification_in_expression4549);
					product=productQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, product.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:855:5: numberof= countingQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_countingQuantification_in_expression4557);
					numberof=countingQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numberof.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:5: l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_disjunction_in_expression4565);
					l=disjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:19: ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==LITERAL_iff||LA43_0==LITERAL_implies) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:21: ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:21: ( LITERAL_iff ^| LITERAL_implies ^)
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==LITERAL_iff) ) {
								alt42=1;
							}
							else if ( (LA42_0==LITERAL_implies) ) {
								alt42=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:22: LITERAL_iff ^
									{
									LITERAL_iff78=(Token)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression4570); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_iff78_tree = (BAST)adaptor.create(LITERAL_iff78);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_iff78_tree, root_0);
									}

									}
									break;
								case 2 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:37: LITERAL_implies ^
									{
									LITERAL_implies79=(Token)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression4575); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_implies79_tree = (BAST)adaptor.create(LITERAL_implies79);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_implies79_tree, root_0);
									}

									}
									break;

							}

							pushFollow(FOLLOW_disjunction_in_expression4581);
							r=disjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "expression"


	public static class universalQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "universalQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:1: universalQuantification : al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al;
	public final BLESS3Parser.universalQuantification_return universalQuantification() throws RecognitionException {
		BLESS3Parser.universalQuantification_return retval = new BLESS3Parser.universalQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token al=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope pred =null;

		BAST al_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_all=new RewriteRuleTokenStream(adaptor,"token LITERAL_all");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_are=new RewriteRuleTokenStream(adaptor,"token LITERAL_are");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:24: (al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:3: al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate
			{
			al=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification4597); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_all.add(al);

			pushFollow(FOLLOW_logicVariables_in_universalQuantification4601);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==LITERAL_in) ) {
				alt45=1;
			}
			else if ( (LA45_0==LITERAL_which) ) {
				alt45=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalQuantification4612); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_universalQuantification4616);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_universalQuantification4622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_universalQuantification4626);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification4637); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_universalQuantification4641);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: i, ar, pred, al, lv, al, b, ar, r, al, lv, w, pred
			// token labels: ar, w, i, al
			// rule labels: b, r, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_al=new RewriteRuleTokenStream(adaptor,"token al",al);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 864:4: -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:864:18: ^( $al $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:864:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:864:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 865:4: -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:18: ^( $al $lv ^( $w $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 866:4: -> $al
			{
				adaptor.addChild(root_0, stream_al.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "universalQuantification"


	public static class existentialQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "existentialQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:1: existentialQuantification : ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $ar $pred) ) -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $ar $pred) ) -> $ex;
	public final BLESS3Parser.existentialQuantification_return existentialQuantification() throws RecognitionException {
		BLESS3Parser.existentialQuantification_return retval = new BLESS3Parser.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ex=null;
		Token i=null;
		Token th=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope pred =null;

		BAST ex_tree=null;
		BAST i_tree=null;
		BAST th_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_that=new RewriteRuleTokenStream(adaptor,"token LITERAL_that");
		RewriteRuleTokenStream stream_LITERAL_exists=new RewriteRuleTokenStream(adaptor,"token LITERAL_exists");
		RewriteRuleTokenStream stream_LITERAL_are=new RewriteRuleTokenStream(adaptor,"token LITERAL_are");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:26: (ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $ar $pred) ) -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $ar $pred) ) -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:3: ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) ar= LITERAL_are pred= predicate
			{
			ex=(Token)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification4737); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_exists.add(ex);

			pushFollow(FOLLOW_logicVariables_in_existentialQuantification4741);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:5: (i= LITERAL_in r= range |th= LITERAL_that b= predicate )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==LITERAL_in) ) {
				alt46=1;
			}
			else if ( (LA46_0==LITERAL_that) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_existentialQuantification4752); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_existentialQuantification4756);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:29: th= LITERAL_that b= predicate
					{
					th=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification4762); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_that.add(th);

					pushFollow(FOLLOW_predicate_in_existentialQuantification4766);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_existentialQuantification4777); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_existentialQuantification4781);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: ar, ex, r, ar, pred, ex, ex, th, pred, lv, b, i, lv
			// token labels: ar, ex, th, i
			// rule labels: r, b, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_ex=new RewriteRuleTokenStream(adaptor,"token ex",ex);
			RewriteRuleTokenStream stream_th=new RewriteRuleTokenStream(adaptor,"token th",th);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 873:4: -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:873:18: ^( $ex $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:873:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:873:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 874:4: -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $ar $pred) )
			if (th!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:19: ^( $ex $lv ^( $th $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:30: ^( $th $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:42: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 875:4: -> $ex
			{
				adaptor.addChild(root_0, stream_ex.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "existentialQuantification"


	public static class sumQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "sumQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:1: sumQuantification : sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum;
	public final BLESS3Parser.sumQuantification_return sumQuantification() throws RecognitionException {
		BLESS3Parser.sumQuantification_return retval = new BLESS3Parser.sumQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token sum=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope ex =null;

		BAST sum_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_of=new RewriteRuleTokenStream(adaptor,"token LITERAL_of");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_sum=new RewriteRuleTokenStream(adaptor,"token LITERAL_sum");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:18: (sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:3: sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			sum=(Token)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification4877); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_sum.add(sum);

			pushFollow(FOLLOW_logicVariables_in_sumQuantification4881);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==LITERAL_in) ) {
				alt47=1;
			}
			else if ( (LA47_0==LITERAL_which) ) {
				alt47=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_sumQuantification4892); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_sumQuantification4896);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_sumQuantification4902); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_sumQuantification4906);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification4917); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_sumQuantification4921);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: ar, i, r, lv, sum, ex, ex, sum, sum, lv, b, ar, w
			// token labels: ar, w, i, sum
			// rule labels: r, b, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_sum=new RewriteRuleTokenStream(adaptor,"token sum",sum);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 882:4: -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:882:18: ^( $sum $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:882:30: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:882:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 883:4: -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:18: ^( $sum $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:30: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 884:4: -> $sum
			{
				adaptor.addChild(root_0, stream_sum.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "sumQuantification"


	public static class productQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "productQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:1: productQuantification : pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr;
	public final BLESS3Parser.productQuantification_return productQuantification() throws RecognitionException {
		BLESS3Parser.productQuantification_return retval = new BLESS3Parser.productQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pr=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope ex =null;

		BAST pr_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_of=new RewriteRuleTokenStream(adaptor,"token LITERAL_of");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_product=new RewriteRuleTokenStream(adaptor,"token LITERAL_product");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:22: (pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:3: pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			pr=(Token)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification5017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_product.add(pr);

			pushFollow(FOLLOW_logicVariables_in_productQuantification5021);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==LITERAL_in) ) {
				alt48=1;
			}
			else if ( (LA48_0==LITERAL_which) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_productQuantification5032); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_productQuantification5036);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_productQuantification5042); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_productQuantification5046);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification5057); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_productQuantification5061);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: i, lv, w, ar, pr, ex, ar, ex, lv, pr, r, b, pr
			// token labels: ar, pr, w, i
			// rule labels: r, b, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_pr=new RewriteRuleTokenStream(adaptor,"token pr",pr);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 891:4: -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:891:18: ^( $pr $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:891:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:891:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 892:4: -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:18: ^( $pr $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 893:4: -> $pr
			{
				adaptor.addChild(root_0, stream_pr.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "productQuantification"


	public static class countingQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "countingQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:1: countingQuantification : n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n;
	public final BLESS3Parser.countingQuantification_return countingQuantification() throws RecognitionException {
		BLESS3Parser.countingQuantification_return retval = new BLESS3Parser.countingQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token n=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope ex =null;

		BAST n_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_numberof=new RewriteRuleTokenStream(adaptor,"token LITERAL_numberof");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_that=new RewriteRuleTokenStream(adaptor,"token LITERAL_that");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:23: (n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:3: n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression
			{
			n=(Token)match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification5157); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_numberof.add(n);

			pushFollow(FOLLOW_logicVariables_in_countingQuantification5161);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==LITERAL_in) ) {
				alt49=1;
			}
			else if ( (LA49_0==LITERAL_which) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_countingQuantification5172); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_countingQuantification5176);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_countingQuantification5182); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_countingQuantification5186);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification5197); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(ar);

			pushFollow(FOLLOW_expression_in_countingQuantification5201);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: n, w, ex, n, i, r, ar, ex, lv, ar, lv, n, b
			// token labels: ar, w, i, n
			// rule labels: r, b, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 900:4: -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:18: ^( $n $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:28: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 901:4: -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:18: ^( $n $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:28: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 902:4: -> $n
			{
				adaptor.addChild(root_0, stream_n.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "countingQuantification"


	public static class logicVariables_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "logicVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:1: logicVariables :lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? ;
	public final BLESS3Parser.logicVariables_return logicVariables() throws RecognitionException {
		BLESS3Parser.logicVariables_return retval = new BLESS3Parser.logicVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA80=null;
		Token COMMA81=null;
		List<Object> list_lv=null;
		RuleReturnScope lv = null;
		BAST COMMA80_tree=null;
		BAST COMMA81_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:15: (lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:3: lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_logicVariables5297);
			lv=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

			if (list_lv==null) list_lv=new ArrayList<Object>();
			list_lv.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:16: ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COMMA) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:18: COMMA ^lv+= variable ( COMMA !lv+= variable )*
					{
					COMMA80=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5301); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA80_tree = (BAST)adaptor.create(COMMA80);
					root_0 = (BAST)adaptor.becomeRoot(COMMA80_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_logicVariables5306);
					lv=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:38: ( COMMA !lv+= variable )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==COMMA) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:40: COMMA !lv+= variable
							{
							COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5310); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_logicVariables5315);
							lv=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv.getTree());
							}
							break;

						default :
							break loop50;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "logicVariables"


	public static class disjunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "disjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:1: disjunction : l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? ;
	public final BLESS3Parser.disjunction_return disjunction() throws RecognitionException {
		BLESS3Parser.disjunction_return retval = new BLESS3Parser.disjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or82=null;
		Token LITERAL_or83=null;
		Token LITERAL_or84=null;
		Token LITERAL_else85=null;
		Token LITERAL_or86=null;
		Token LITERAL_else87=null;
		Token LITERAL_xor88=null;
		Token LITERAL_xor89=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_or82_tree=null;
		BAST LITERAL_or83_tree=null;
		BAST LITERAL_or84_tree=null;
		BAST LITERAL_else85_tree=null;
		BAST LITERAL_or86_tree=null;
		BAST LITERAL_else87_tree=null;
		BAST LITERAL_xor88_tree=null;
		BAST LITERAL_xor89_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:12: (l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:3: l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_conjunction_in_disjunction5337);
			l=conjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:6: ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			int alt55=4;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==LITERAL_or) ) {
				int LA55_1 = input.LA(2);
				if ( (LA55_1==LITERAL_else) ) {
					alt55=2;
				}
				else if ( (LA55_1==AADL_STRING_LITERAL||LA55_1==ID||LA55_1==LBRACKET||LA55_1==LITERAL_abs||LA55_1==LITERAL_false||(LA55_1 >= LITERAL_not && LA55_1 <= LITERAL_now)||LA55_1==LITERAL_null||LA55_1==LITERAL_round||LA55_1==LITERAL_self||LA55_1==LITERAL_timeout||LA55_1==LITERAL_tops||(LA55_1 >= LITERAL_true && LA55_1 <= LITERAL_truncate)||LA55_1==LPAREN||LA55_1==MINUS||LA55_1==NUMBER||LA55_1==OCTOTHORPE||(LA55_1 >= QCLREF && LA55_1 <= QCREF)) ) {
					alt55=1;
				}
			}
			else if ( (LA55_0==LITERAL_xor) ) {
				alt55=3;
			}
			switch (alt55) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:8: LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )*
					{
					LITERAL_or82=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5354); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or82_tree = (BAST)adaptor.create(LITERAL_or82);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or82_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5359);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:35: ( LITERAL_or !r+= conjunction )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==LITERAL_or) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:37: LITERAL_or !r+= conjunction
							{
							LITERAL_or83=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5363); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5368);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop52;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:8: LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					{
					LITERAL_or84=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5389); if (state.failed) return retval;
					LITERAL_else85=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5392); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else85_tree = (BAST)adaptor.create(LITERAL_else85);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_else85_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5397);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:49: ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==LITERAL_or) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:51: LITERAL_or ! LITERAL_else !r+= conjunction
							{
							LITERAL_or86=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5401); if (state.failed) return retval;
							LITERAL_else87=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5404); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5409);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop53;
						}
					}

					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:8: LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )*
					{
					LITERAL_xor88=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5430); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor88_tree = (BAST)adaptor.create(LITERAL_xor88);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_xor88_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5435);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:36: ( LITERAL_xor !r+= conjunction )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==LITERAL_xor) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:38: LITERAL_xor !r+= conjunction
							{
							LITERAL_xor89=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5439); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5444);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop54;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "disjunction"


	public static class conjunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:920:1: conjunction : l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? ;
	public final BLESS3Parser.conjunction_return conjunction() throws RecognitionException {
		BLESS3Parser.conjunction_return retval = new BLESS3Parser.conjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and90=null;
		Token LITERAL_and91=null;
		Token LITERAL_and92=null;
		Token LITERAL_then93=null;
		Token LITERAL_and94=null;
		Token LITERAL_then95=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_and90_tree=null;
		BAST LITERAL_and91_tree=null;
		BAST LITERAL_and92_tree=null;
		BAST LITERAL_then93_tree=null;
		BAST LITERAL_and94_tree=null;
		BAST LITERAL_then95_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:920:12: (l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:3: l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_relation_in_conjunction5468);
			l=relation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:922:5: ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==LITERAL_and) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==LITERAL_then) ) {
					alt58=2;
				}
				else if ( (LA58_1==AADL_STRING_LITERAL||LA58_1==ID||LA58_1==LBRACKET||LA58_1==LITERAL_abs||LA58_1==LITERAL_false||(LA58_1 >= LITERAL_not && LA58_1 <= LITERAL_now)||LA58_1==LITERAL_null||LA58_1==LITERAL_round||LA58_1==LITERAL_self||LA58_1==LITERAL_timeout||LA58_1==LITERAL_tops||(LA58_1 >= LITERAL_true && LA58_1 <= LITERAL_truncate)||LA58_1==LPAREN||LA58_1==MINUS||LA58_1==NUMBER||LA58_1==OCTOTHORPE||(LA58_1 >= QCLREF && LA58_1 <= QCREF)) ) {
					alt58=1;
				}
			}
			switch (alt58) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:922:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:922:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:922:9: LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )*
					{
					LITERAL_and90=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5478); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and90_tree = (BAST)adaptor.create(LITERAL_and90);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and90_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5483);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:922:34: ( LITERAL_and !r+= relation )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==LITERAL_and) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:922:36: LITERAL_and !r+= relation
							{
							LITERAL_and91=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5487); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5492);
							r=relation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop56;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:9: LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )*
					{
					LITERAL_and92=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5507); if (state.failed) return retval;
					LITERAL_then93=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5510); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then93_tree = (BAST)adaptor.create(LITERAL_then93);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_then93_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5515);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:48: ( LITERAL_and ! LITERAL_then !r+= relation )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==LITERAL_and) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:50: LITERAL_and ! LITERAL_then !r+= relation
							{
							LITERAL_and94=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5519); if (state.failed) return retval;
							LITERAL_then95=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5522); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5527);
							r=relation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop57;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "conjunction"


	public static class relation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:1: relation : addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )? ;
	public final BLESS3Parser.relation_return relation() throws RecognitionException {
		BLESS3Parser.relation_return retval = new BLESS3Parser.relation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_in99=null;
		ParserRuleReturnScope addSub96 =null;
		ParserRuleReturnScope relation_symbol97 =null;
		ParserRuleReturnScope addSub98 =null;
		ParserRuleReturnScope range100 =null;

		BAST LITERAL_in99_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:9: ( addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:2: addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_addSub_in_relation5548);
			addSub96=addSub();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub96.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:929:2: ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			int alt59=3;
			int LA59_0 = input.LA(1);
			if ( ((LA59_0 >= AL && LA59_0 <= AM)||LA59_0==EQ||LA59_0==GT||LA59_0==LT||LA59_0==NEQ||LA59_0==OLD_NEQ||LA59_0==PLUS_EQUALS) ) {
				alt59=1;
			}
			else if ( (LA59_0==LITERAL_in) ) {
				alt59=2;
			}
			switch (alt59) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:4: ( relation_symbol ^ addSub )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:4: ( relation_symbol ^ addSub )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:6: relation_symbol ^ addSub
					{
					pushFollow(FOLLOW_relation_symbol_in_relation5558);
					relation_symbol97=relation_symbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(relation_symbol97.getTree(), root_0);
					pushFollow(FOLLOW_addSub_in_relation5561);
					addSub98=addSub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub98.getTree());

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:4: ( LITERAL_in ^ range )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:4: ( LITERAL_in ^ range )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:6: LITERAL_in ^ range
					{
					LITERAL_in99=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation5575); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_in99_tree = (BAST)adaptor.create(LITERAL_in99);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_in99_tree, root_0);
					}

					pushFollow(FOLLOW_range_in_relation5578);
					range100=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, range100.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "relation"


	public static class range_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "range"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:1: range : subexpression rangeSymbol ^ subexpression ;
	public final BLESS3Parser.range_return range() throws RecognitionException {
		BLESS3Parser.range_return retval = new BLESS3Parser.range_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope subexpression101 =null;
		ParserRuleReturnScope rangeSymbol102 =null;
		ParserRuleReturnScope subexpression103 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:6: ( subexpression rangeSymbol ^ subexpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:8: subexpression rangeSymbol ^ subexpression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_range5593);
			subexpression101=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression101.getTree());

			pushFollow(FOLLOW_rangeSymbol_in_range5595);
			rangeSymbol102=rangeSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(rangeSymbol102.getTree(), root_0);
			pushFollow(FOLLOW_subexpression_in_range5598);
			subexpression103=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression103.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "range"


	public static class rangeSymbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "rangeSymbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:938:1: rangeSymbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.rangeSymbol_return rangeSymbol() throws RecognitionException {
		BLESS3Parser.rangeSymbol_return retval = new BLESS3Parser.rangeSymbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set104=null;

		BAST set104_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:938:13: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set104=input.LT(1);
			if ( (input.LA(1) >= COMMACOMMA && input.LA(1) <= COMMADOT)||(input.LA(1) >= DOTCOMMA && input.LA(1) <= DOTDOT) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set104));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "rangeSymbol"


	public static class addSub_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "addSub"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:1: addSub : multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? ;
	public final BLESS3Parser.addSub_return addSub() throws RecognitionException {
		BLESS3Parser.addSub_return retval = new BLESS3Parser.addSub_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token PLUS106=null;
		Token PLUS108=null;
		Token MINUS110=null;
		ParserRuleReturnScope multDiv105 =null;
		ParserRuleReturnScope multDiv107 =null;
		ParserRuleReturnScope multDiv109 =null;
		ParserRuleReturnScope multDiv111 =null;

		BAST PLUS106_tree=null;
		BAST PLUS108_tree=null;
		BAST MINUS110_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:7: ( multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:942:3: multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_multDiv_in_addSub5629);
			multDiv105=multDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv105.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:943:3: ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			int alt61=3;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==PLUS) ) {
				alt61=1;
			}
			else if ( (LA61_0==MINUS) ) {
				alt61=2;
			}
			switch (alt61) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:944:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:944:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:944:7: PLUS ^ multDiv ( PLUS ! multDiv )*
					{
					PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5641); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS106_tree = (BAST)adaptor.create(PLUS106);
					root_0 = (BAST)adaptor.becomeRoot(PLUS106_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5644);
					multDiv107=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv107.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:944:21: ( PLUS ! multDiv )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==PLUS) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:944:23: PLUS ! multDiv
							{
							PLUS108=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5648); if (state.failed) return retval;
							pushFollow(FOLLOW_multDiv_in_addSub5651);
							multDiv109=multDiv();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv109.getTree());

							}
							break;

						default :
							break loop60;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:946:5: ( MINUS ^ multDiv )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:946:5: ( MINUS ^ multDiv )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:946:7: MINUS ^ multDiv
					{
					MINUS110=(Token)match(input,MINUS,FOLLOW_MINUS_in_addSub5670); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS110_tree = (BAST)adaptor.create(MINUS110);
					root_0 = (BAST)adaptor.becomeRoot(MINUS110_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5673);
					multDiv111=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv111.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "addSub"


	public static class multDiv_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "multDiv"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:1: multDiv : exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? ;
	public final BLESS3Parser.multDiv_return multDiv() throws RecognitionException {
		BLESS3Parser.multDiv_return retval = new BLESS3Parser.multDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TIMES113=null;
		Token TIMES115=null;
		ParserRuleReturnScope exponentiation112 =null;
		ParserRuleReturnScope exponentiation114 =null;
		ParserRuleReturnScope exponentiation116 =null;
		ParserRuleReturnScope dividers117 =null;
		ParserRuleReturnScope exponentiation118 =null;

		BAST TIMES113_tree=null;
		BAST TIMES115_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:8: ( exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:951:3: exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_exponentiation_in_multDiv5693);
			exponentiation112=exponentiation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation112.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:952:3: ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==TIMES) ) {
				alt63=1;
			}
			else if ( (LA63_0==DIVIDE||LA63_0==LITERAL_div||LA63_0==LITERAL_mod||LA63_0==LITERAL_rem) ) {
				alt63=2;
			}
			switch (alt63) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:7: TIMES ^ exponentiation ( TIMES ! exponentiation )*
					{
					TIMES113=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5705); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES113_tree = (BAST)adaptor.create(TIMES113);
					root_0 = (BAST)adaptor.becomeRoot(TIMES113_tree, root_0);
					}

					pushFollow(FOLLOW_exponentiation_in_multDiv5708);
					exponentiation114=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation114.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:29: ( TIMES ! exponentiation )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==TIMES) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:31: TIMES ! exponentiation
							{
							TIMES115=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5712); if (state.failed) return retval;
							pushFollow(FOLLOW_exponentiation_in_multDiv5715);
							exponentiation116=exponentiation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation116.getTree());

							}
							break;

						default :
							break loop62;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:4: ( dividers ^ exponentiation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:4: ( dividers ^ exponentiation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:6: dividers ^ exponentiation
					{
					pushFollow(FOLLOW_dividers_in_multDiv5733);
					dividers117=dividers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(dividers117.getTree(), root_0);
					pushFollow(FOLLOW_exponentiation_in_multDiv5736);
					exponentiation118=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation118.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "multDiv"


	public static class dividers_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dividers"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:1: dividers : ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem );
	public final BLESS3Parser.dividers_return dividers() throws RecognitionException {
		BLESS3Parser.dividers_return retval = new BLESS3Parser.dividers_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set119=null;

		BAST set119_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:9: ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set119=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==LITERAL_div||input.LA(1)==LITERAL_mod||input.LA(1)==LITERAL_rem ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set119));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "dividers"


	public static class exponentiation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "exponentiation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:1: exponentiation : subexpression ( EXP ^ subexpression )? ;
	public final BLESS3Parser.exponentiation_return exponentiation() throws RecognitionException {
		BLESS3Parser.exponentiation_return retval = new BLESS3Parser.exponentiation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token EXP121=null;
		ParserRuleReturnScope subexpression120 =null;
		ParserRuleReturnScope subexpression122 =null;

		BAST EXP121_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:15: ( subexpression ( EXP ^ subexpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:962:3: subexpression ( EXP ^ subexpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_exponentiation5779);
			subexpression120=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression120.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:962:17: ( EXP ^ subexpression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==EXP) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:962:19: EXP ^ subexpression
					{
					EXP121=(Token)match(input,EXP,FOLLOW_EXP_in_exponentiation5783); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXP121_tree = (BAST)adaptor.create(EXP121);
					root_0 = (BAST)adaptor.becomeRoot(EXP121_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_exponentiation5786);
					subexpression122=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression122.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "exponentiation"


	public static class subexpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:965:1: subexpression : ( (uo= unaryOperator )? te= timedExpression -> {uo!=null}? ^( $uo $te) -> $te| MINUS te= timedExpression -> ^( UNARY_MINUS $te) );
	public final BLESS3Parser.subexpression_return subexpression() throws RecognitionException {
		BLESS3Parser.subexpression_return retval = new BLESS3Parser.subexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS123=null;
		ParserRuleReturnScope uo =null;
		ParserRuleReturnScope te =null;

		BAST MINUS123_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_unaryOperator=new RewriteRuleSubtreeStream(adaptor,"rule unaryOperator");
		RewriteRuleSubtreeStream stream_timedExpression=new RewriteRuleSubtreeStream(adaptor,"rule timedExpression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:965:14: ( (uo= unaryOperator )? te= timedExpression -> {uo!=null}? ^( $uo $te) -> $te| MINUS te= timedExpression -> ^( UNARY_MINUS $te) )
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==AADL_STRING_LITERAL||LA66_0==ID||LA66_0==LBRACKET||LA66_0==LITERAL_abs||LA66_0==LITERAL_false||(LA66_0 >= LITERAL_not && LA66_0 <= LITERAL_now)||LA66_0==LITERAL_null||LA66_0==LITERAL_round||LA66_0==LITERAL_self||LA66_0==LITERAL_timeout||LA66_0==LITERAL_tops||(LA66_0 >= LITERAL_true && LA66_0 <= LITERAL_truncate)||LA66_0==LPAREN||LA66_0==NUMBER||LA66_0==OCTOTHORPE||(LA66_0 >= QCLREF && LA66_0 <= QCREF)) ) {
				alt66=1;
			}
			else if ( (LA66_0==MINUS) ) {
				alt66=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:966:2: (uo= unaryOperator )? te= timedExpression
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:966:2: (uo= unaryOperator )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==LITERAL_abs||LA65_0==LITERAL_not||LA65_0==LITERAL_round||LA65_0==LITERAL_truncate) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:966:4: uo= unaryOperator
							{
							pushFollow(FOLLOW_unaryOperator_in_subexpression5806);
							uo=unaryOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_unaryOperator.add(uo.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_timedExpression_in_subexpression5813);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te, te, uo
					// token labels: 
					// rule labels: te, uo, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_uo=new RewriteRuleSubtreeStream(adaptor,"rule uo",uo!=null?uo.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 967:4: -> {uo!=null}? ^( $uo $te)
					if (uo!=null) {
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:19: ^( $uo $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_uo.nextNode(), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 968:4: -> $te
					{
						adaptor.addChild(root_0, stream_te.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:970:2: MINUS te= timedExpression
					{
					MINUS123=(Token)match(input,MINUS,FOLLOW_MINUS_in_subexpression5844); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS123);

					pushFollow(FOLLOW_timedExpression_in_subexpression5848);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te
					// token labels: 
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 971:4: -> ^( UNARY_MINUS $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:7: ^( UNARY_MINUS $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "subexpression"


	public static class unaryOperator_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unaryOperator"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:974:1: unaryOperator : ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round );
	public final BLESS3Parser.unaryOperator_return unaryOperator() throws RecognitionException {
		BLESS3Parser.unaryOperator_return retval = new BLESS3Parser.unaryOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set124=null;

		BAST set124_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:974:14: ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set124=input.LT(1);
			if ( input.LA(1)==LITERAL_abs||input.LA(1)==LITERAL_not||input.LA(1)==LITERAL_round||input.LA(1)==LITERAL_truncate ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set124));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "unaryOperator"


	public static class timedExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "timedExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:978:1: timedExpression : timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? ;
	public final BLESS3Parser.timedExpression_return timedExpression() throws RecognitionException {
		BLESS3Parser.timedExpression_return retval = new BLESS3Parser.timedExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AT_SIGN126=null;
		Token TICK128=null;
		Token CARET129=null;
		ParserRuleReturnScope timedSubject125 =null;
		ParserRuleReturnScope subexpression127 =null;
		ParserRuleReturnScope periodShift130 =null;

		BAST AT_SIGN126_tree=null;
		BAST TICK128_tree=null;
		BAST CARET129_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:978:16: ( timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:979:3: timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_timedSubject_in_timedExpression5895);
			timedSubject125=timedSubject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, timedSubject125.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:980:3: ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			int alt67=4;
			switch ( input.LA(1) ) {
				case AT_SIGN:
					{
					alt67=1;
					}
					break;
				case TICK:
					{
					alt67=2;
					}
					break;
				case CARET:
					{
					alt67=3;
					}
					break;
			}
			switch (alt67) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:981:3: AT_SIGN ^ subexpression
					{
					AT_SIGN126=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5903); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_SIGN126_tree = (BAST)adaptor.create(AT_SIGN126);
					root_0 = (BAST)adaptor.becomeRoot(AT_SIGN126_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_timedExpression5906);
					subexpression127=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression127.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:982:5: TICK
					{
					TICK128=(Token)match(input,TICK,FOLLOW_TICK_in_timedExpression5912); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK128_tree = (BAST)adaptor.create(TICK128);
					adaptor.addChild(root_0, TICK128_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:983:5: CARET ^ periodShift
					{
					CARET129=(Token)match(input,CARET,FOLLOW_CARET_in_timedExpression5918); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CARET129_tree = (BAST)adaptor.create(CARET129);
					root_0 = (BAST)adaptor.becomeRoot(CARET129_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_timedExpression5921);
					periodShift130=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift130.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "timedExpression"


	public static class timedSubject_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "timedSubject"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:1: timedSubject : ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value );
	public final BLESS3Parser.timedSubject_return timedSubject() throws RecognitionException {
		BLESS3Parser.timedSubject_return retval = new BLESS3Parser.timedSubject_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalExpression131 =null;
		ParserRuleReturnScope parenthesizedSubexpression132 =null;
		ParserRuleReturnScope recordTerm133 =null;
		ParserRuleReturnScope invocation134 =null;
		ParserRuleReturnScope value135 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:13: ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value )
			int alt68=5;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==LPAREN) ) {
				int LA68_1 = input.LA(2);
				if ( (LA68_1==LITERAL_if) && (synpred1_BLESS3())) {
					alt68=1;
				}
				else if ( (LA68_1==AADL_STRING_LITERAL||LA68_1==ID||LA68_1==LBRACKET||LA68_1==LITERAL_abs||LA68_1==LITERAL_all||LA68_1==LITERAL_case||LA68_1==LITERAL_exists||LA68_1==LITERAL_false||(LA68_1 >= LITERAL_not && LA68_1 <= LITERAL_now)||(LA68_1 >= LITERAL_null && LA68_1 <= LITERAL_numberof)||LA68_1==LITERAL_product||LA68_1==LITERAL_round||LA68_1==LITERAL_self||LA68_1==LITERAL_sum||LA68_1==LITERAL_timeout||LA68_1==LITERAL_tops||(LA68_1 >= LITERAL_true && LA68_1 <= LITERAL_truncate)||LA68_1==LPAREN||LA68_1==MINUS||LA68_1==NUMBER||LA68_1==OCTOTHORPE||(LA68_1 >= QCLREF && LA68_1 <= QCREF)) ) {
					alt68=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA68_0==LBRACKET) && (synpred2_BLESS3())) {
				alt68=3;
			}
			else if ( (LA68_0==ID) ) {
				int LA68_3 = input.LA(2);
				if ( (LA68_3==LPAREN) && (synpred3_BLESS3())) {
					alt68=4;
				}
				else if ( (LA68_3==EOF||(LA68_3 >= AL && LA68_3 <= AMPERSAND)||LA68_3==AT_SIGN||(LA68_3 >= BOX && LA68_3 <= COLON)||(LA68_3 >= COMMA && LA68_3 <= COMMADOT)||LA68_3==CVP||(LA68_3 >= DIVIDE && LA68_3 <= DOTDOT)||LA68_3==EQ||LA68_3==EXP||(LA68_3 >= GT && LA68_3 <= GUARD)||(LA68_3 >= ID && LA68_3 <= IMP)||(LA68_3 >= LASS && LA68_3 <= LBRACKET)||LA68_3==LCURLY||LA68_3==LITERAL_and||LA68_3==LITERAL_are||LA68_3==LITERAL_declare||(LA68_3 >= LITERAL_div && LA68_3 <= LITERAL_else)||LA68_3==LITERAL_exception||(LA68_3 >= LITERAL_fetchadd && LA68_3 <= LITERAL_fi)||(LA68_3 >= LITERAL_for && LA68_3 <= LITERAL_forall)||(LA68_3 >= LITERAL_if && LA68_3 <= LITERAL_iff)||(LA68_3 >= LITERAL_implies && LA68_3 <= LITERAL_in)||LA68_3==LITERAL_invariant||LA68_3==LITERAL_mod||LA68_3==LITERAL_of||LA68_3==LITERAL_or||LA68_3==LITERAL_rem||LA68_3==LITERAL_setmode||LA68_3==LITERAL_skip||LA68_3==LITERAL_states||(LA68_3 >= LITERAL_swap && LA68_3 <= LITERAL_then)||LA68_3==LITERAL_transitions||LA68_3==LITERAL_until||LA68_3==LITERAL_when||LA68_3==LITERAL_while||LA68_3==LITERAL_xor||LA68_3==LT||LA68_3==MINUS||LA68_3==NEQ||LA68_3==OLD_NEQ||LA68_3==PLUS||LA68_3==PLUS_EQUALS||LA68_3==QQ||(LA68_3 >= QUESTION && LA68_3 <= RCURLY)||LA68_3==RPAREN||LA68_3==SEMICOLON||LA68_3==TICK||LA68_3==TIMES||LA68_3==VERT) ) {
					alt68=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 68, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA68_0==AADL_STRING_LITERAL||LA68_0==LITERAL_false||LA68_0==LITERAL_now||LA68_0==LITERAL_null||LA68_0==LITERAL_self||LA68_0==LITERAL_timeout||LA68_0==LITERAL_tops||LA68_0==LITERAL_true||LA68_0==NUMBER||LA68_0==OCTOTHORPE||(LA68_0 >= QCLREF && LA68_0 <= QCREF)) ) {
				alt68=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}

			switch (alt68) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:3: ( LPAREN LITERAL_if )=> conditionalExpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5946);
					conditionalExpression131=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression131.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5952);
					parenthesizedSubexpression132=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression132.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:5: ( LBRACKET ID COLON )=> recordTerm
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordTerm_in_timedSubject5969);
					recordTerm133=recordTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordTerm133.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:991:5: ( ID LPAREN )=> invocation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_invocation_in_timedSubject5982);
					invocation134=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, invocation134.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:992:5: value
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_value_in_timedSubject5990);
					value135=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value135.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "timedSubject"


	public static class parenthesizedSubexpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "parenthesizedSubexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:1: parenthesizedSubexpression : LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN ;
	public final BLESS3Parser.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		BLESS3Parser.parenthesizedSubexpression_return retval = new BLESS3Parser.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN136=null;
		Token QQ138=null;
		Token COLON140=null;
		Token RPAREN142=null;
		ParserRuleReturnScope caseexpression =null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope expression139 =null;
		ParserRuleReturnScope expression141 =null;

		BAST LPAREN136_tree=null;
		BAST QQ138_tree=null;
		BAST COLON140_tree=null;
		BAST RPAREN142_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:27: ( LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:2: LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6001); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN136_tree = (BAST)adaptor.create(LPAREN136);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN136_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:2: ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression )
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==AADL_STRING_LITERAL||LA70_0==ID||LA70_0==LBRACKET||LA70_0==LITERAL_abs||LA70_0==LITERAL_all||LA70_0==LITERAL_exists||LA70_0==LITERAL_false||(LA70_0 >= LITERAL_not && LA70_0 <= LITERAL_now)||(LA70_0 >= LITERAL_null && LA70_0 <= LITERAL_numberof)||LA70_0==LITERAL_product||LA70_0==LITERAL_round||LA70_0==LITERAL_self||LA70_0==LITERAL_sum||LA70_0==LITERAL_timeout||LA70_0==LITERAL_tops||(LA70_0 >= LITERAL_true && LA70_0 <= LITERAL_truncate)||LA70_0==LPAREN||LA70_0==MINUS||LA70_0==NUMBER||LA70_0==OCTOTHORPE||(LA70_0 >= QCLREF && LA70_0 <= QCREF)) ) {
				alt70=1;
			}
			else if ( (LA70_0==LITERAL_case) ) {
				alt70=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:4: ( expression ( QQ ^ expression COLON ! expression )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:4: ( expression ( QQ ^ expression COLON ! expression )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:6: expression ( QQ ^ expression COLON ! expression )?
					{
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6014);
					expression137=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:17: ( QQ ^ expression COLON ! expression )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==QQ) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:19: QQ ^ expression COLON ! expression
							{
							QQ138=(Token)match(input,QQ,FOLLOW_QQ_in_parenthesizedSubexpression6018); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							QQ138_tree = (BAST)adaptor.create(QQ138);
							root_0 = (BAST)adaptor.becomeRoot(QQ138_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6021);
							expression139=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression139.getTree());

							COLON140=(Token)match(input,COLON,FOLLOW_COLON_in_parenthesizedSubexpression6023); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6026);
							expression141=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression141.getTree());

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1000:4: caseexpression= caseExpression
					{
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6044);
					caseexpression=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseexpression.getTree());

					}
					break;

			}

			RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6052); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN142_tree = (BAST)adaptor.create(RPAREN142);
			adaptor.addChild(root_0, RPAREN142_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "parenthesizedSubexpression"


	public static class caseExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "caseExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:1: caseExpression : LITERAL_case ^ ( caseChoice )+ ;
	public final BLESS3Parser.caseExpression_return caseExpression() throws RecognitionException {
		BLESS3Parser.caseExpression_return retval = new BLESS3Parser.caseExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_case143=null;
		ParserRuleReturnScope caseChoice144 =null;

		BAST LITERAL_case143_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:15: ( LITERAL_case ^ ( caseChoice )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1006:3: LITERAL_case ^ ( caseChoice )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_case143=(Token)match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6062); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_case143_tree = (BAST)adaptor.create(LITERAL_case143);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_case143_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1006:17: ( caseChoice )+
			int cnt71=0;
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==LPAREN) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1006:17: caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6065);
					caseChoice144=caseChoice();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseChoice144.getTree());

					}
					break;

				default :
					if ( cnt71 >= 1 ) break loop71;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(71, input);
					throw eee;
				}
				cnt71++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "caseExpression"


	public static class caseChoice_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "caseChoice"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1009:1: caseChoice : LPAREN !bool= expression IMP ^exp= expression RPAREN !;
	public final BLESS3Parser.caseChoice_return caseChoice() throws RecognitionException {
		BLESS3Parser.caseChoice_return retval = new BLESS3Parser.caseChoice_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN145=null;
		Token IMP146=null;
		Token RPAREN147=null;
		ParserRuleReturnScope bool =null;
		ParserRuleReturnScope exp =null;

		BAST LPAREN145_tree=null;
		BAST IMP146_tree=null;
		BAST RPAREN147_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1010:3: ( LPAREN !bool= expression IMP ^exp= expression RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1011:3: LPAREN !bool= expression IMP ^exp= expression RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_caseChoice6081); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseChoice6086);
			bool=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

			IMP146=(Token)match(input,IMP,FOLLOW_IMP_in_caseChoice6088); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP146_tree = (BAST)adaptor.create(IMP146);
			root_0 = (BAST)adaptor.becomeRoot(IMP146_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_caseChoice6093);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_caseChoice6095); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "caseChoice"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conditionalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:1: conditionalExpression : lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) ;
	public final BLESS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		BLESS3Parser.conditionalExpression_return retval = new BLESS3Parser.conditionalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lp=null;
		Token rp=null;
		Token LITERAL_if148=null;
		Token LITERAL_then149=null;
		Token LITERAL_else150=null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope f =null;

		BAST lp_tree=null;
		BAST rp_tree=null;
		BAST LITERAL_if148_tree=null;
		BAST LITERAL_then149_tree=null;
		BAST LITERAL_else150_tree=null;
		RewriteRuleTokenStream stream_LITERAL_else=new RewriteRuleTokenStream(adaptor,"token LITERAL_else");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LITERAL_then=new RewriteRuleTokenStream(adaptor,"token LITERAL_then");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:22: (lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:3: lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression6111); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			LITERAL_if148=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_conditionalExpression6113); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(LITERAL_if148);

			pushFollow(FOLLOW_expression_in_conditionalExpression6117);
			pred=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(pred.getTree());
			LITERAL_then149=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conditionalExpression6119); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_then.add(LITERAL_then149);

			pushFollow(FOLLOW_expression_in_conditionalExpression6123);
			t=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(t.getTree());
			LITERAL_else150=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_conditionalExpression6125); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_else.add(LITERAL_else150);

			pushFollow(FOLLOW_expression_in_conditionalExpression6129);
			f=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(f.getTree());
			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression6133); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: f, rp, t, lp, pred
			// token labels: lp, rp
			// rule labels: t, pred, f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lp=new RewriteRuleTokenStream(adaptor,"token lp",lp);
			RewriteRuleTokenStream stream_rp=new RewriteRuleTokenStream(adaptor,"token rp",rp);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1016:5: -> ^( $lp ^( QQ $pred $t $f) $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1016:8: ^( $lp ^( QQ $pred $t $f) $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1016:15: ^( QQ $pred $t $f)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QQ, "QQ"), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_2, stream_f.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_rp.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "conditionalExpression"


	public static class recordTerm_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:1: recordTerm : LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) ;
	public final BLESS3Parser.recordTerm_return recordTerm() throws RecognitionException {
		BLESS3Parser.recordTerm_return retval = new BLESS3Parser.recordTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token typeid=null;
		Token LBRACKET151=null;
		Token COLON152=null;
		Token RBRACKET153=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		BAST typeid_tree=null;
		BAST LBRACKET151_tree=null;
		BAST COLON152_tree=null;
		BAST RBRACKET153_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_recordValue=new RewriteRuleSubtreeStream(adaptor,"rule recordValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1020:3: ( LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1021:3: LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET
			{
			LBRACKET151=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_recordTerm6179); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET151);

			typeid=(Token)match(input,ID,FOLLOW_ID_in_recordTerm6183); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(typeid);

			COLON152=(Token)match(input,COLON,FOLLOW_COLON_in_recordTerm6185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON152);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1021:31: (prv+= recordValue )+
			int cnt72=0;
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==ID) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1021:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6189);
					prv=recordValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_recordValue.add(prv.getTree());
					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTree());
					}
					break;

				default :
					if ( cnt72 >= 1 ) break loop72;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(72, input);
					throw eee;
				}
				cnt72++;
			}

			RBRACKET153=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_recordTerm6192); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET153);

			// AST REWRITE
			// elements: typeid, prv
			// token labels: typeid
			// rule labels: retval
			// token list labels: 
			// rule list labels: prv
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_typeid=new RewriteRuleTokenStream(adaptor,"token typeid",typeid);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_prv=new RewriteRuleSubtreeStream(adaptor,"token prv",list_prv);
			root_0 = (BAST)adaptor.nil();
			// 1022:5: -> ^( RECORD_TERM $typeid ( $prv)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1022:8: ^( RECORD_TERM $typeid ( $prv)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RECORD_TERM, "RECORD_TERM"), root_1);
				adaptor.addChild(root_1, stream_typeid.nextNode());
				if ( !(stream_prv.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_prv.hasNext() ) {
					adaptor.addChild(root_1, stream_prv.nextTree());
				}
				stream_prv.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "recordTerm"


	public static class recordValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1025:1: recordValue : identifier ARROW ^ value SEMICOLON !;
	public final BLESS3Parser.recordValue_return recordValue() throws RecognitionException {
		BLESS3Parser.recordValue_return retval = new BLESS3Parser.recordValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ARROW155=null;
		Token SEMICOLON157=null;
		ParserRuleReturnScope identifier154 =null;
		ParserRuleReturnScope value156 =null;

		BAST ARROW155_tree=null;
		BAST SEMICOLON157_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1026:3: ( identifier ARROW ^ value SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1027:20: identifier ARROW ^ value SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_recordValue6228);
			identifier154=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier154.getTree());

			ARROW155=(Token)match(input,ARROW,FOLLOW_ARROW_in_recordValue6230); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARROW155_tree = (BAST)adaptor.create(ARROW155);
			root_0 = (BAST)adaptor.becomeRoot(ARROW155_tree, root_0);
			}

			pushFollow(FOLLOW_value_in_recordValue6233);
			value156=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value156.getTree());

			SEMICOLON157=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordValue6235); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "recordValue"


	public static class periodShift_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "periodShift"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:1: periodShift : (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) ;
	public final BLESS3Parser.periodShift_return periodShift() throws RecognitionException {
		BLESS3Parser.periodShift_return retval = new BLESS3Parser.periodShift_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token m=null;
		Token lp=null;
		Token rp=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope ie =null;

		BAST m_tree=null;
		BAST lp_tree=null;
		BAST rp_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_indexExpression=new RewriteRuleSubtreeStream(adaptor,"rule indexExpression");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:12: ( (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:2: (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:2: (m= MINUS )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==MINUS) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:4: m= MINUS
					{
					m=(Token)match(input,MINUS,FOLLOW_MINUS_in_periodShift6255); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(m);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1032:2: (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==AADL_STRING_LITERAL||LA74_0==ID||LA74_0==LITERAL_false||LA74_0==LITERAL_now||LA74_0==LITERAL_null||LA74_0==LITERAL_self||LA74_0==LITERAL_timeout||LA74_0==LITERAL_tops||LA74_0==LITERAL_true||LA74_0==NUMBER||LA74_0==OCTOTHORPE||(LA74_0 >= QCLREF && LA74_0 <= QCREF)) ) {
				alt74=1;
			}
			else if ( (LA74_0==LPAREN) ) {
				alt74=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1033:4: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift6268);
					v=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(v.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1035:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1035:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1035:5: lp= LPAREN ie= indexExpression rp= RPAREN
					{
					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_periodShift6282); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					pushFollow(FOLLOW_indexExpression_in_periodShift6286);
					ie=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpression.add(ie.getTree());
					rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_periodShift6290); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(rp);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: rp, v, lp, ie, v, rp, lp, ie
			// token labels: lp, rp
			// rule labels: v, ie, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lp=new RewriteRuleTokenStream(adaptor,"token lp",lp);
			RewriteRuleTokenStream stream_rp=new RewriteRuleTokenStream(adaptor,"token rp",rp);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_ie=new RewriteRuleSubtreeStream(adaptor,"rule ie",ie!=null?ie.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1037:2: -> {m!=null&&v!=null}? ^( UNARY_MINUS $v)
			if (m!=null&&v!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1037:25: ^( UNARY_MINUS $v)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1038:2: -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) )
			if (m!=null&&ie!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:26: ^( UNARY_MINUS ^( $lp $ie $rp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:41: ^( $lp $ie $rp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ie.nextTree());
				adaptor.addChild(root_2, stream_rp.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1039:2: -> {m==null&&v!=null}? $v
			if (m==null&&v!=null) {
				adaptor.addChild(root_0, stream_v.nextTree());
			}

			else // 1040:2: -> ^( $lp $ie $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1040:5: ^( $lp $ie $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ie.nextTree());
				adaptor.addChild(root_1, stream_rp.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "periodShift"


	public static class indexExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "indexExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:1: indexExpression : periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? ;
	public final BLESS3Parser.indexExpression_return indexExpression() throws RecognitionException {
		BLESS3Parser.indexExpression_return retval = new BLESS3Parser.indexExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS159=null;
		Token LITERAL_div161=null;
		Token LITERAL_mod163=null;
		Token LITERAL_rem165=null;
		Token PLUS167=null;
		Token PLUS169=null;
		Token TIMES171=null;
		Token TIMES173=null;
		ParserRuleReturnScope periodShift158 =null;
		ParserRuleReturnScope periodShift160 =null;
		ParserRuleReturnScope periodShift162 =null;
		ParserRuleReturnScope periodShift164 =null;
		ParserRuleReturnScope periodShift166 =null;
		ParserRuleReturnScope periodShift168 =null;
		ParserRuleReturnScope periodShift170 =null;
		ParserRuleReturnScope periodShift172 =null;
		ParserRuleReturnScope periodShift174 =null;

		BAST MINUS159_tree=null;
		BAST LITERAL_div161_tree=null;
		BAST LITERAL_mod163_tree=null;
		BAST LITERAL_rem165_tree=null;
		BAST PLUS167_tree=null;
		BAST PLUS169_tree=null;
		BAST TIMES171_tree=null;
		BAST TIMES173_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:16: ( periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1044:2: periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_periodShift_in_indexExpression6370);
			periodShift158=periodShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift158.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1045:2: ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			int alt77=7;
			switch ( input.LA(1) ) {
				case MINUS:
					{
					alt77=1;
					}
					break;
				case LITERAL_div:
					{
					alt77=2;
					}
					break;
				case LITERAL_mod:
					{
					alt77=3;
					}
					break;
				case LITERAL_rem:
					{
					alt77=4;
					}
					break;
				case PLUS:
					{
					alt77=5;
					}
					break;
				case TIMES:
					{
					alt77=6;
					}
					break;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1046:4: MINUS ^ periodShift
					{
					MINUS159=(Token)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6378); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS159_tree = (BAST)adaptor.create(MINUS159);
					root_0 = (BAST)adaptor.becomeRoot(MINUS159_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6381);
					periodShift160=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift160.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:4: LITERAL_div ^ periodShift
					{
					LITERAL_div161=(Token)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6391); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_div161_tree = (BAST)adaptor.create(LITERAL_div161);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_div161_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6394);
					periodShift162=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift162.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1050:4: LITERAL_mod ^ periodShift
					{
					LITERAL_mod163=(Token)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6404); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_mod163_tree = (BAST)adaptor.create(LITERAL_mod163);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_mod163_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6407);
					periodShift164=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift164.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:4: LITERAL_rem ^ periodShift
					{
					LITERAL_rem165=(Token)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6417); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_rem165_tree = (BAST)adaptor.create(LITERAL_rem165);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_rem165_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6420);
					periodShift166=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift166.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:4: PLUS ^ periodShift ( PLUS ! periodShift )*
					{
					PLUS167=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6430); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS167_tree = (BAST)adaptor.create(PLUS167);
					root_0 = (BAST)adaptor.becomeRoot(PLUS167_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6433);
					periodShift168=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift168.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:22: ( PLUS ! periodShift )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==PLUS) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:24: PLUS ! periodShift
							{
							PLUS169=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6437); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6440);
							periodShift170=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift170.getTree());

							}
							break;

						default :
							break loop75;
						}
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1056:4: TIMES ^ periodShift ( TIMES ! periodShift )*
					{
					TIMES171=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6453); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES171_tree = (BAST)adaptor.create(TIMES171);
					root_0 = (BAST)adaptor.becomeRoot(TIMES171_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6456);
					periodShift172=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift172.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1056:23: ( TIMES ! periodShift )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==TIMES) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1056:25: TIMES ! periodShift
							{
							TIMES173=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6460); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6463);
							periodShift174=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift174.getTree());

							}
							break;

						default :
							break loop76;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "indexExpression"


	public static class indexExpressionOrRange_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "indexExpressionOrRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:1: indexExpressionOrRange : indexExpression ( DOTDOT ^ indexExpression )? ;
	public final BLESS3Parser.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		BLESS3Parser.indexExpressionOrRange_return retval = new BLESS3Parser.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT176=null;
		ParserRuleReturnScope indexExpression175 =null;
		ParserRuleReturnScope indexExpression177 =null;

		BAST DOTDOT176_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:23: ( indexExpression ( DOTDOT ^ indexExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:2: indexExpression ( DOTDOT ^ indexExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6480);
			indexExpression175=indexExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression175.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:18: ( DOTDOT ^ indexExpression )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DOTDOT) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:20: DOTDOT ^ indexExpression
					{
					DOTDOT176=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6484); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT176_tree = (BAST)adaptor.create(DOTDOT176);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT176_tree, root_0);
					}

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6487);
					indexExpression177=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression177.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "indexExpressionOrRange"


	public static class value_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "value"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1066:1: value : ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops );
	public final BLESS3Parser.value_return value() throws RecognitionException {
		BLESS3Parser.value_return retval = new BLESS3Parser.value_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout180=null;
		Token LITERAL_now181=null;
		Token LITERAL_tops182=null;
		ParserRuleReturnScope valueName178 =null;
		ParserRuleReturnScope constant179 =null;

		BAST LITERAL_timeout180_tree=null;
		BAST LITERAL_now181_tree=null;
		BAST LITERAL_tops182_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1066:6: ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops )
			int alt79=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt79=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_self:
			case LITERAL_true:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt79=2;
				}
				break;
			case LITERAL_timeout:
				{
				alt79=3;
				}
				break;
			case LITERAL_now:
				{
				alt79=4;
				}
				break;
			case LITERAL_tops:
				{
				alt79=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1067:3: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_value6503);
					valueName178=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName178.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1069:3: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_value6511);
					constant179=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant179.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:3: LITERAL_timeout
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout180=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6519); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout180_tree = (BAST)adaptor.create(LITERAL_timeout180);
					adaptor.addChild(root_0, LITERAL_timeout180_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1073:3: LITERAL_now
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_now181=(Token)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6527); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_now181_tree = (BAST)adaptor.create(LITERAL_now181);
					adaptor.addChild(root_0, LITERAL_now181_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1075:3: LITERAL_tops
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_tops182=(Token)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6535); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_tops182_tree = (BAST)adaptor.create(LITERAL_tops182);
					adaptor.addChild(root_0, LITERAL_tops182_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "value"


	public static class valueName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "valueName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:1: valueName : id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id;
	public final BLESS3Parser.valueName_return valueName() throws RecognitionException {
		BLESS3Parser.valueName_return retval = new BLESS3Parser.valueName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token dol=null;
		Token lp=null;
		Token lb=null;
		Token dot=null;
		Token q=null;
		Token t=null;
		Token fresh=null;
		Token count=null;
		Token updated=null;
		Token RPAREN183=null;
		Token RBRACKET184=null;
		Token LBRACKET185=null;
		Token RBRACKET186=null;
		Token DOT187=null;
		List<Object> list_array_index=null;
		List<Object> list_pn=null;
		ParserRuleReturnScope pr =null;
		RuleReturnScope array_index = null;
		RuleReturnScope pn = null;
		BAST id_tree=null;
		BAST dol_tree=null;
		BAST lp_tree=null;
		BAST lb_tree=null;
		BAST dot_tree=null;
		BAST q_tree=null;
		BAST t_tree=null;
		BAST fresh_tree=null;
		BAST count_tree=null;
		BAST updated_tree=null;
		BAST RPAREN183_tree=null;
		BAST RBRACKET184_tree=null;
		BAST LBRACKET185_tree=null;
		BAST RBRACKET186_tree=null;
		BAST DOT187_tree=null;
		RewriteRuleTokenStream stream_LITERAL_count=new RewriteRuleTokenStream(adaptor,"token LITERAL_count");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_DOLLAR=new RewriteRuleTokenStream(adaptor,"token DOLLAR");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_TICK=new RewriteRuleTokenStream(adaptor,"token TICK");
		RewriteRuleTokenStream stream_LITERAL_fresh=new RewriteRuleTokenStream(adaptor,"token LITERAL_fresh");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_updated=new RewriteRuleTokenStream(adaptor,"token LITERAL_updated");
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_partialName=new RewriteRuleSubtreeStream(adaptor,"rule partialName");
		RewriteRuleSubtreeStream stream_functionParameters=new RewriteRuleSubtreeStream(adaptor,"rule functionParameters");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:10: (id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1079:3: id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_valueName6550); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:5: (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==DOLLAR) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:7: dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN
					{
					dol=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6564); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOLLAR.add(dol);

					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueName6568); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:31: (pr= functionParameters )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==ID) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:31: pr= functionParameters
							{
							pushFollow(FOLLOW_functionParameters_in_valueName6573);
							pr=functionParameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_functionParameters.add(pr.getTree());
							}
							break;

					}

					RPAREN183=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueName6576); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN183);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:4: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==LBRACKET) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:6: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6588); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6592);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET184=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6594); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET184);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:6: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop82:
					while (true) {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==LBRACKET) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:8: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET185=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6604); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET185);

							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6608);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET186=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6610); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET186);

							}
							break;

						default :
							break loop82;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:4: (dot= DOT pn+= partialName ( DOT pn+= partialName )* )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DOT) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:6: dot= DOT pn+= partialName ( DOT pn+= partialName )*
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6626); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					pushFollow(FOLLOW_partialName_in_valueName6630);
					pn=partialName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
					if (list_pn==null) list_pn=new ArrayList<Object>();
					list_pn.add(pn.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:30: ( DOT pn+= partialName )*
					loop84:
					while (true) {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==DOT) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:32: DOT pn+= partialName
							{
							DOT187=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6634); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(DOT187);

							pushFollow(FOLLOW_partialName_in_valueName6638);
							pn=partialName();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTree());
							}
							break;

						default :
							break loop84;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:5: (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			int alt86=5;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==QUESTION) ) {
				alt86=1;
			}
			else if ( (LA86_0==TICK) ) {
				switch ( input.LA(2) ) {
					case LITERAL_fresh:
						{
						alt86=2;
						}
						break;
					case LITERAL_count:
						{
						alt86=3;
						}
						break;
					case LITERAL_updated:
						{
						alt86=4;
						}
						break;
				}
			}
			switch (alt86) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:8: q= QUESTION
					{
					q=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6655); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(q);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1086:7: t= TICK fresh= LITERAL_fresh
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6667); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					fresh=(Token)match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6671); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_fresh.add(fresh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1087:7: t= TICK count= LITERAL_count
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6682); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					count=(Token)match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6686); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_count.add(count);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:7: t= TICK updated= LITERAL_updated
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6696); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					updated=(Token)match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_updated.add(updated);

					}
					break;

			}

			// AST REWRITE
			// elements: q, id, id, pr, array_index, dol, lb, pn, count, dot, t, id, id, t, id, DOT, array_index, dot, lb, t, id, id, pn, updated, fresh, id, id
			// token labels: dol, q, t, lb, count, dot, id, fresh, updated
			// rule labels: pr, retval
			// token list labels: 
			// rule list labels: array_index, pn
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dol=new RewriteRuleTokenStream(adaptor,"token dol",dol);
			RewriteRuleTokenStream stream_q=new RewriteRuleTokenStream(adaptor,"token q",q);
			RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
			RewriteRuleTokenStream stream_lb=new RewriteRuleTokenStream(adaptor,"token lb",lb);
			RewriteRuleTokenStream stream_count=new RewriteRuleTokenStream(adaptor,"token count",count);
			RewriteRuleTokenStream stream_dot=new RewriteRuleTokenStream(adaptor,"token dot",dot);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_fresh=new RewriteRuleTokenStream(adaptor,"token fresh",fresh);
			RewriteRuleTokenStream stream_updated=new RewriteRuleTokenStream(adaptor,"token updated",updated);
			RewriteRuleSubtreeStream stream_pr=new RewriteRuleSubtreeStream(adaptor,"rule pr",pr!=null?pr.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_array_index=new RewriteRuleSubtreeStream(adaptor,"token array_index",list_array_index);
			RewriteRuleSubtreeStream stream_pn=new RewriteRuleSubtreeStream(adaptor,"token pn",list_pn);
			root_0 = (BAST)adaptor.nil();
			// 1091:3: -> {dol!=null}? ^( $id $dol $pr)
			if (dol!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:19: ^( $id $dol $pr)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				adaptor.addChild(root_1, stream_dol.nextNode());
				adaptor.addChild(root_1, stream_pr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1092:3: -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
			if (lb!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:29: ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:36: ^( $lb ( $array_index)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_array_index.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_index.hasNext() ) {
					adaptor.addChild(root_2, stream_array_index.nextTree());
				}
				stream_array_index.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:59: ^( $dot ( $pn)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				if ( !(stream_pn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_pn.hasNext() ) {
					adaptor.addChild(root_2, stream_pn.nextTree());
				}
				stream_pn.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1093:3: -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT )
			if (lb!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:29: ^( $id ^( $lb ( $array_index)+ ) DOT )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:36: ^( $lb ( $array_index)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_array_index.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_index.hasNext() ) {
					adaptor.addChild(root_2, stream_array_index.nextTree());
				}
				stream_array_index.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_DOT.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1094:3: -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) )
			if (lb==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:29: ^( $id ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:36: ^( $dot ( $pn)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				if ( !(stream_pn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_pn.hasNext() ) {
					adaptor.addChild(root_2, stream_pn.nextTree());
				}
				stream_pn.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1095:3: -> {q!=null}? ^( $q $id)
			if (q!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1095:17: ^( $q $id)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_q.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1096:3: -> {fresh!=null}? ^( $t $id $fresh)
			if (fresh!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1096:21: ^( $t $id $fresh)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fresh.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1097:3: -> {count!=null}? ^( $t $id $count)
			if (count!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1097:21: ^( $t $id $count)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_count.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1098:3: -> {updated!=null}? ^( $t $id $updated)
			if (updated!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1098:23: ^( $t $id $updated)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_updated.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1099:3: -> $id
			{
				adaptor.addChild(root_0, stream_id.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "valueName"


	public static class functionParameters_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "functionParameters"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:1: functionParameters :parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? ;
	public final BLESS3Parser.functionParameters_return functionParameters() throws RecognitionException {
		BLESS3Parser.functionParameters_return retval = new BLESS3Parser.functionParameters_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA188=null;
		Token COMMA189=null;
		List<Object> list_parameters=null;
		RuleReturnScope parameters = null;
		BAST COMMA188_tree=null;
		BAST COMMA189_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:19: (parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:3: parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6908);
			parameters=formalExpressionPair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

			if (list_parameters==null) list_parameters=new ArrayList<Object>();
			list_parameters.add(parameters.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:36: ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==COMMA) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:38: COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )*
					{
					COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6912); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA188_tree = (BAST)adaptor.create(COMMA188);
					root_0 = (BAST)adaptor.becomeRoot(COMMA188_tree, root_0);
					}

					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6917);
					parameters=formalExpressionPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:3: ( COMMA !parameters+= formalExpressionPair )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==COMMA) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:5: COMMA !parameters+= formalExpressionPair
							{
							COMMA189=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6924); if (state.failed) return retval;
							pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6929);
							parameters=formalExpressionPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

							if (list_parameters==null) list_parameters=new ArrayList<Object>();
							list_parameters.add(parameters.getTree());
							}
							break;

						default :
							break loop87;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "functionParameters"


	public static class formalExpressionPair_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "formalExpressionPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1107:1: formalExpressionPair : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		BLESS3Parser.formalExpressionPair_return retval = new BLESS3Parser.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON190=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON190_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1107:21: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1108:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_formalExpressionPair6947); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON190=(Token)match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6955); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON190_tree = (BAST)adaptor.create(COLON190);
			root_0 = (BAST)adaptor.becomeRoot(COLON190_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_formalExpressionPair6960);
			actual=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actual.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "formalExpressionPair"


	public static class partialName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "partialName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1112:1: partialName : record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id;
	public final BLESS3Parser.partialName_return partialName() throws RecognitionException {
		BLESS3Parser.partialName_return retval = new BLESS3Parser.partialName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token record_id=null;
		Token lb=null;
		Token RBRACKET191=null;
		Token LBRACKET192=null;
		Token RBRACKET193=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		BAST record_id_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET191_tree=null;
		BAST LBRACKET192_tree=null;
		BAST RBRACKET193_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1112:12: (record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1113:2: record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			{
			record_id=(Token)match(input,ID,FOLLOW_ID_in_partialName6973); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(record_id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:3: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LBRACKET) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:5: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6983); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6987);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET191=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName6989); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET191);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:3: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==LBRACKET) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:5: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET192=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6996); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET192);

							pushFollow(FOLLOW_indexExpressionOrRange_in_partialName7000);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET193=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName7002); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET193);

							}
							break;

						default :
							break loop89;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: array_index, record_id, record_id, lb
			// token labels: record_id, lb
			// rule labels: retval
			// token list labels: 
			// rule list labels: array_index
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_record_id=new RewriteRuleTokenStream(adaptor,"token record_id",record_id);
			RewriteRuleTokenStream stream_lb=new RewriteRuleTokenStream(adaptor,"token lb",lb);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_array_index=new RewriteRuleSubtreeStream(adaptor,"token array_index",list_array_index);
			root_0 = (BAST)adaptor.nil();
			// 1116:2: -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) )
			if (lb!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:17: ^( $record_id ^( $lb ( $array_index)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_record_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:31: ^( $lb ( $array_index)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_array_index.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_index.hasNext() ) {
					adaptor.addChild(root_2, stream_array_index.nextTree());
				}
				stream_array_index.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1117:2: -> $record_id
			{
				adaptor.addChild(root_0, stream_record_id.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "partialName"


	public static class constant_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1120:1: constant : ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null );
	public final BLESS3Parser.constant_return constant() throws RecognitionException {
		BLESS3Parser.constant_return retval = new BLESS3Parser.constant_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AADL_STRING_LITERAL195=null;
		Token LITERAL_true196=null;
		Token LITERAL_false197=null;
		Token LITERAL_null198=null;
		ParserRuleReturnScope quantity194 =null;

		BAST AADL_STRING_LITERAL195_tree=null;
		BAST LITERAL_true196_tree=null;
		BAST LITERAL_false197_tree=null;
		BAST LITERAL_null198_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1120:9: ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null )
			int alt91=5;
			switch ( input.LA(1) ) {
			case LITERAL_self:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt91=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt91=2;
				}
				break;
			case LITERAL_true:
				{
				alt91=3;
				}
				break;
			case LITERAL_false:
				{
				alt91=4;
				}
				break;
			case LITERAL_null:
				{
				alt91=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 91, 0, input);
				throw nvae;
			}
			switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_constant7050);
					quantity194=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity194.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1123:3: AADL_STRING_LITERAL
					{
					root_0 = (BAST)adaptor.nil();


					AADL_STRING_LITERAL195=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant7058); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AADL_STRING_LITERAL195_tree = (BAST)adaptor.create(AADL_STRING_LITERAL195);
					adaptor.addChild(root_0, AADL_STRING_LITERAL195_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1125:3: LITERAL_true
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_true196=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant7066); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_true196_tree = (BAST)adaptor.create(LITERAL_true196);
					adaptor.addChild(root_0, LITERAL_true196_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1127:3: LITERAL_false
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_false197=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant7074); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_false197_tree = (BAST)adaptor.create(LITERAL_false197);
					adaptor.addChild(root_0, LITERAL_false197_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1129:3: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null198=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant7082); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null198_tree = (BAST)adaptor.create(LITERAL_null198);
					adaptor.addChild(root_0, LITERAL_null198_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "constant"


	public static class quantity_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantity"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1133:1: quantity : number= aNumber (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )? -> ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? ) ;
	public final BLESS3Parser.quantity_return quantity() throws RecognitionException {
		BLESS3Parser.quantity_return retval = new BLESS3Parser.quantity_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token u=null;
		Token scalar=null;
		Token whole=null;
		Token char_literal199=null;
		ParserRuleReturnScope number =null;

		BAST u_tree=null;
		BAST scalar_tree=null;
		BAST whole_tree=null;
		BAST char_literal199_tree=null;
		RewriteRuleTokenStream stream_299=new RewriteRuleTokenStream(adaptor,"token 299");
		RewriteRuleTokenStream stream_LITERAL_whole=new RewriteRuleTokenStream(adaptor,"token LITERAL_whole");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_LITERAL_scalar=new RewriteRuleTokenStream(adaptor,"token LITERAL_scalar");
		RewriteRuleSubtreeStream stream_aNumber=new RewriteRuleSubtreeStream(adaptor,"rule aNumber");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1133:9: (number= aNumber (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )? -> ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:3: number= aNumber (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )?
			{
			pushFollow(FOLLOW_aNumber_in_quantity7099);
			number=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_aNumber.add(number.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1135:3: (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )?
			int alt92=4;
			switch ( input.LA(1) ) {
				case ID:
					{
					int LA92_1 = input.LA(2);
					if ( (LA92_1==299) ) {
						alt92=1;
					}
					}
					break;
				case LITERAL_scalar:
					{
					alt92=2;
					}
					break;
				case LITERAL_whole:
					{
					alt92=3;
					}
					break;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1135:5: u= ID '%'
					{
					u=(Token)match(input,ID,FOLLOW_ID_in_quantity7108); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(u);

					char_literal199=(Token)match(input,299,FOLLOW_299_in_quantity7110); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_299.add(char_literal199);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1136:3: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7119); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_scalar.add(scalar);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1136:27: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7125); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_whole.add(whole);

					}
					break;

			}

			// AST REWRITE
			// elements: whole, scalar, u, number
			// token labels: scalar, u, whole
			// rule labels: number, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_scalar=new RewriteRuleTokenStream(adaptor,"token scalar",scalar);
			RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
			RewriteRuleTokenStream stream_whole=new RewriteRuleTokenStream(adaptor,"token whole",whole);
			RewriteRuleSubtreeStream stream_number=new RewriteRuleSubtreeStream(adaptor,"rule number",number!=null?number.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1137:4: -> ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1137:7: ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, "QUANTITY"), root_1);
				adaptor.addChild(root_1, stream_number.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1137:28: ( $u)?
				if ( stream_u.hasNext() ) {
					adaptor.addChild(root_1, stream_u.nextNode());
				}
				stream_u.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1137:32: ( $scalar)?
				if ( stream_scalar.hasNext() ) {
					adaptor.addChild(root_1, stream_scalar.nextNode());
				}
				stream_scalar.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1137:41: ( $whole)?
				if ( stream_whole.hasNext() ) {
					adaptor.addChild(root_1, stream_whole.nextNode());
				}
				stream_whole.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "quantity"


	public static class aNumber_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "aNumber"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1140:1: aNumber : (lit= NUMBER |property= propertyReference |propertyConstant= QCLREF );
	public final BLESS3Parser.aNumber_return aNumber() throws RecognitionException {
		BLESS3Parser.aNumber_return retval = new BLESS3Parser.aNumber_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lit=null;
		Token propertyConstant=null;
		ParserRuleReturnScope property =null;

		BAST lit_tree=null;
		BAST propertyConstant_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1140:8: (lit= NUMBER |property= propertyReference |propertyConstant= QCLREF )
			int alt93=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt93=1;
				}
				break;
			case LITERAL_self:
			case OCTOTHORPE:
			case QCREF:
				{
				alt93=2;
				}
				break;
			case QCLREF:
				{
				alt93=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1141:2: lit= NUMBER
					{
					root_0 = (BAST)adaptor.nil();


					lit=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7169); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					lit_tree = (BAST)adaptor.create(lit);
					adaptor.addChild(root_0, lit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1142:4: property= propertyReference
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyReference_in_aNumber7176);
					property=propertyReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, property.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1143:4: propertyConstant= QCLREF
					{
					root_0 = (BAST)adaptor.nil();


					propertyConstant=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_aNumber7183); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					propertyConstant_tree = (BAST)adaptor.create(propertyConstant);
					adaptor.addChild(root_0, propertyConstant_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "aNumber"


	public static class propertyReference_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1146:1: propertyReference : ( OCTOTHORPE ^pname= QCLREF (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )* |component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )* );
	public final BLESS3Parser.propertyReference_return propertyReference() throws RecognitionException {
		BLESS3Parser.propertyReference_return retval = new BLESS3Parser.propertyReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pname=null;
		Token spname=null;
		Token component=null;
		Token cpname=null;
		Token OCTOTHORPE200=null;
		Token LITERAL_self201=null;
		Token OCTOTHORPE202=null;
		Token OCTOTHORPE203=null;
		List<Object> list_field=null;
		RuleReturnScope field = null;
		BAST pname_tree=null;
		BAST spname_tree=null;
		BAST component_tree=null;
		BAST cpname_tree=null;
		BAST OCTOTHORPE200_tree=null;
		BAST LITERAL_self201_tree=null;
		BAST OCTOTHORPE202_tree=null;
		BAST OCTOTHORPE203_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1146:18: ( OCTOTHORPE ^pname= QCLREF (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )* |component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )* )
			int alt97=3;
			switch ( input.LA(1) ) {
			case OCTOTHORPE:
				{
				alt97=1;
				}
				break;
			case LITERAL_self:
				{
				alt97=2;
				}
				break;
			case QCREF:
				{
				alt97=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1147:2: OCTOTHORPE ^pname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					OCTOTHORPE200=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7197); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE200_tree = (BAST)adaptor.create(OCTOTHORPE200);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE200_tree, root_0);
					}

					pname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					pname_tree = (BAST)adaptor.create(pname);
					adaptor.addChild(root_0, pname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:4: (field+= propertyField )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==DOT||LA94_0==LBRACKET) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7213);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop94;
						}
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1150:4: LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_self201=(Token)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_self201_tree = (BAST)adaptor.create(LITERAL_self201);
					adaptor.addChild(root_0, LITERAL_self201_tree);
					}

					OCTOTHORPE202=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7225); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE202_tree = (BAST)adaptor.create(OCTOTHORPE202);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE202_tree, root_0);
					}

					spname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					spname_tree = (BAST)adaptor.create(spname);
					adaptor.addChild(root_0, spname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1151:4: (field+= propertyField )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==DOT||LA95_0==LBRACKET) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1151:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7241);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop95;
						}
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1152:4: component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					component=(Token)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7251); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					component_tree = (BAST)adaptor.create(component);
					adaptor.addChild(root_0, component_tree);
					}

					OCTOTHORPE203=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7257); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE203_tree = (BAST)adaptor.create(OCTOTHORPE203);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE203_tree, root_0);
					}

					cpname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					cpname_tree = (BAST)adaptor.create(cpname);
					adaptor.addChild(root_0, cpname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:5: (field+= propertyField )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==DOT||LA96_0==LBRACKET) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:7: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7274);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop96;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "propertyReference"


	public static class propertyField_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1158:1: propertyField : ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) );
	public final BLESS3Parser.propertyField_return propertyField() throws RecognitionException {
		BLESS3Parser.propertyField_return retval = new BLESS3Parser.propertyField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token index=null;
		Token var=null;
		Token pf=null;
		Token upper=null;
		Token lower=null;
		Token LBRACKET204=null;
		Token RBRACKET205=null;
		Token DOT206=null;

		BAST index_tree=null;
		BAST var_tree=null;
		BAST pf_tree=null;
		BAST upper_tree=null;
		BAST lower_tree=null;
		BAST LBRACKET204_tree=null;
		BAST RBRACKET205_tree=null;
		BAST DOT206_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1158:14: ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) )
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==LBRACKET) ) {
				alt100=1;
			}
			else if ( (LA100_0==DOT) ) {
				alt100=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 100, 0, input);
				throw nvae;
			}

			switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:2: LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !
					{
					root_0 = (BAST)adaptor.nil();


					LBRACKET204=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACKET204_tree = (BAST)adaptor.create(LBRACKET204);
					root_0 = (BAST)adaptor.becomeRoot(LBRACKET204_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:12: (index= NUMBER |var= ID )
					int alt98=2;
					int LA98_0 = input.LA(1);
					if ( (LA98_0==NUMBER) ) {
						alt98=1;
					}
					else if ( (LA98_0==ID) ) {
						alt98=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}

					switch (alt98) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:13: index= NUMBER
							{
							index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7295); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							index_tree = (BAST)adaptor.create(index);
							adaptor.addChild(root_0, index_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:28: var= ID
							{
							var=(Token)match(input,ID,FOLLOW_ID_in_propertyField7301); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							var_tree = (BAST)adaptor.create(var);
							adaptor.addChild(root_0, var_tree);
							}

							}
							break;

					}

					RBRACKET205=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_propertyField7310); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:4: DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					{
					root_0 = (BAST)adaptor.nil();


					DOT206=(Token)match(input,DOT,FOLLOW_DOT_in_propertyField7318); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT206_tree = (BAST)adaptor.create(DOT206);
					root_0 = (BAST)adaptor.becomeRoot(DOT206_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:10: (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					int alt99=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt99=1;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt99=2;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt99=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 99, 0, input);
						throw nvae;
					}
					switch (alt99) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:11: pf= ID
							{
							pf=(Token)match(input,ID,FOLLOW_ID_in_propertyField7325); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							pf_tree = (BAST)adaptor.create(pf);
							adaptor.addChild(root_0, pf_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:19: upper= LITERAL_upper_bound
							{
							upper=(Token)match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7331); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							upper_tree = (BAST)adaptor.create(upper);
							adaptor.addChild(root_0, upper_tree);
							}

							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:47: lower= LITERAL_lower_bound
							{
							lower=(Token)match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7337); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							lower_tree = (BAST)adaptor.create(lower);
							adaptor.addChild(root_0, lower_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "propertyField"


	public static class actionSubclause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "actionSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:1: actionSubclause : (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) ;
	public final BLESS3Parser.actionSubclause_return actionSubclause() throws RecognitionException {
		BLESS3Parser.actionSubclause_return retval = new BLESS3Parser.actionSubclause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token no_proof=null;
		Token pre=null;
		Token post=null;
		Token inv=null;
		ParserRuleReturnScope throws_clause =null;
		ParserRuleReturnScope assert_clause =null;
		ParserRuleReturnScope precondition =null;
		ParserRuleReturnScope postcondition =null;
		ParserRuleReturnScope invariant =null;
		ParserRuleReturnScope elq =null;

		BAST no_proof_tree=null;
		BAST pre_tree=null;
		BAST post_tree=null;
		BAST inv_tree=null;
		RewriteRuleTokenStream stream_LITERAL_pre=new RewriteRuleTokenStream(adaptor,"token LITERAL_pre");
		RewriteRuleTokenStream stream_LITERAL_post=new RewriteRuleTokenStream(adaptor,"token LITERAL_post");
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_DO_NOT_PROVE=new RewriteRuleTokenStream(adaptor,"token DO_NOT_PROVE");
		RewriteRuleSubtreeStream stream_assertClause=new RewriteRuleSubtreeStream(adaptor,"rule assertClause");
		RewriteRuleSubtreeStream stream_throwsClause=new RewriteRuleSubtreeStream(adaptor,"rule throwsClause");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:16: ( (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:2: (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:11: (no_proof= DO_NOT_PROVE )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==DO_NOT_PROVE) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:11: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7357); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:16: (throws_clause= throwsClause )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==LITERAL_throws) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:16: throws_clause= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7364);
					throws_clause=throwsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_throwsClause.add(throws_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:16: (assert_clause= assertClause )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LITERAL_assert) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:16: assert_clause= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7372);
					assert_clause=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(assert_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1170:3: (pre= LITERAL_pre precondition= assertion )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LITERAL_pre) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1170:5: pre= LITERAL_pre precondition= assertion
					{
					pre=(Token)match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7383); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_pre.add(pre);

					pushFollow(FOLLOW_assertion_in_actionSubclause7387);
					precondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(precondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1171:3: (post= LITERAL_post postcondition= assertion )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LITERAL_post) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1171:5: post= LITERAL_post postcondition= assertion
					{
					post=(Token)match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_post.add(post);

					pushFollow(FOLLOW_assertion_in_actionSubclause7402);
					postcondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(postcondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1172:3: (inv= LITERAL_invariant invariant= assertion )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LITERAL_invariant) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1172:5: inv= LITERAL_invariant invariant= assertion
					{
					inv=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7414); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(inv);

					pushFollow(FOLLOW_assertion_in_actionSubclause7418);
					invariant=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(invariant.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7428);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: LITERAL_post, no_proof, throws_clause, invariant, LITERAL_pre, elq, assert_clause, precondition, LITERAL_invariant, postcondition
			// token labels: no_proof
			// rule labels: throws_clause, assert_clause, elq, precondition, postcondition, retval, invariant
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_throws_clause=new RewriteRuleSubtreeStream(adaptor,"rule throws_clause",throws_clause!=null?throws_clause.getTree():null);
			RewriteRuleSubtreeStream stream_assert_clause=new RewriteRuleSubtreeStream(adaptor,"rule assert_clause",assert_clause!=null?assert_clause.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_precondition=new RewriteRuleSubtreeStream(adaptor,"rule precondition",precondition!=null?precondition.getTree():null);
			RewriteRuleSubtreeStream stream_postcondition=new RewriteRuleSubtreeStream(adaptor,"rule postcondition",postcondition!=null?postcondition.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_invariant=new RewriteRuleSubtreeStream(adaptor,"rule invariant",invariant!=null?invariant.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1174:3: -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:6: ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION_SUBCLAUSE, "ACTION_SUBCLAUSE"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:27: ( $no_proof)?
				if ( stream_no_proof.hasNext() ) {
					adaptor.addChild(root_1, stream_no_proof.nextNode());
				}
				stream_no_proof.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:38: ( $throws_clause)?
				if ( stream_throws_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_clause.nextTree());
				}
				stream_throws_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:54: ( $assert_clause)?
				if ( stream_assert_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_assert_clause.nextTree());
				}
				stream_assert_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:69: ^( LITERAL_pre ( $precondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_pre.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:85: ( $precondition)?
				if ( stream_precondition.hasNext() ) {
					adaptor.addChild(root_2, stream_precondition.nextTree());
				}
				stream_precondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:6: ^( LITERAL_post ( $postcondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_post.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:23: ( $postcondition)?
				if ( stream_postcondition.hasNext() ) {
					adaptor.addChild(root_2, stream_postcondition.nextTree());
				}
				stream_postcondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:40: ^( LITERAL_invariant $invariant)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_invariant.nextNode(), root_2);
				adaptor.addChild(root_2, stream_invariant.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_elq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "actionSubclause"


	public static class throwsClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "throwsClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:1: throwsClause : LITERAL_throws ^ (exceptions+= ID )+ ;
	public final BLESS3Parser.throwsClause_return throwsClause() throws RecognitionException {
		BLESS3Parser.throwsClause_return retval = new BLESS3Parser.throwsClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_throws207=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;

		BAST LITERAL_throws207_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:13: ( LITERAL_throws ^ (exceptions+= ID )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:2: LITERAL_throws ^ (exceptions+= ID )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_throws207=(Token)match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7496); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throws207_tree = (BAST)adaptor.create(LITERAL_throws207);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_throws207_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:28: (exceptions+= ID )+
			int cnt107=0;
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==ID) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:28: exceptions+= ID
					{
					exceptions=(Token)match(input,ID,FOLLOW_ID_in_throwsClause7501); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					exceptions_tree = (BAST)adaptor.create(exceptions);
					adaptor.addChild(root_0, exceptions_tree);
					}

					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt107 >= 1 ) break loop107;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(107, input);
					throw eee;
				}
				cnt107++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "throwsClause"


	public static class assertClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:1: assertClause : LITERAL_assert ^ (assertions+= namedAssertion )+ ;
	public final BLESS3Parser.assertClause_return assertClause() throws RecognitionException {
		BLESS3Parser.assertClause_return retval = new BLESS3Parser.assertClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_assert208=null;
		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		BAST LITERAL_assert208_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:13: ( LITERAL_assert ^ (assertions+= namedAssertion )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:3: LITERAL_assert ^ (assertions+= namedAssertion )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_assert208=(Token)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7516); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_assert208_tree = (BAST)adaptor.create(LITERAL_assert208);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_assert208_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:19: (assertions+= namedAssertion )+
			int cnt108=0;
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==LASS) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:20: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7522);
					assertions=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assertions.getTree());

					if (list_assertions==null) list_assertions=new ArrayList<Object>();
					list_assertions.add(assertions.getTree());
					}
					break;

				default :
					if ( cnt108 >= 1 ) break loop108;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(108, input);
					throw eee;
				}
				cnt108++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assertClause"


	public static class behaviorTime_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorTime"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:1: behaviorTime : ( quantity | valueName | parenthesizedSubexpression );
	public final BLESS3Parser.behaviorTime_return behaviorTime() throws RecognitionException {
		BLESS3Parser.behaviorTime_return retval = new BLESS3Parser.behaviorTime_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope quantity209 =null;
		ParserRuleReturnScope valueName210 =null;
		ParserRuleReturnScope parenthesizedSubexpression211 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:13: ( quantity | valueName | parenthesizedSubexpression )
			int alt109=3;
			switch ( input.LA(1) ) {
			case LITERAL_self:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt109=1;
				}
				break;
			case ID:
				{
				alt109=2;
				}
				break;
			case LPAREN:
				{
				alt109=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1192:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_behaviorTime7543);
					quantity209=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity209.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1193:5: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_behaviorTime7549);
					valueName210=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName210.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1194:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_behaviorTime7555);
					parenthesizedSubexpression211=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression211.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "behaviorTime"


	public static class catchClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "catchClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:1: catchClause : LITERAL_catch ^ ( catchClauseTerm )+ ;
	public final BLESS3Parser.catchClause_return catchClause() throws RecognitionException {
		BLESS3Parser.catchClause_return retval = new BLESS3Parser.catchClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_catch212=null;
		ParserRuleReturnScope catchClauseTerm213 =null;

		BAST LITERAL_catch212_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:12: ( LITERAL_catch ^ ( catchClauseTerm )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:2: LITERAL_catch ^ ( catchClauseTerm )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_catch212=(Token)match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause7568); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_catch212_tree = (BAST)adaptor.create(LITERAL_catch212);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_catch212_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:17: ( catchClauseTerm )+
			int cnt110=0;
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==LPAREN) ) {
					alt110=1;
				}

				switch (alt110) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:17: catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause7571);
					catchClauseTerm213=catchClauseTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClauseTerm213.getTree());

					}
					break;

				default :
					if ( cnt110 >= 1 ) break loop110;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(110, input);
					throw eee;
				}
				cnt110++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "catchClause"


	public static class catchClauseTerm_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "catchClauseTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1202:1: catchClauseTerm : LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN ;
	public final BLESS3Parser.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		BLESS3Parser.catchClauseTerm_return retval = new BLESS3Parser.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token colon=null;
		Token LPAREN214=null;
		Token LITERAL_all215=null;
		Token RPAREN216=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;
		ParserRuleReturnScope act =null;

		BAST colon_tree=null;
		BAST LPAREN214_tree=null;
		BAST LITERAL_all215_tree=null;
		BAST RPAREN216_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1202:16: ( LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1203:3: LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN214=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7584); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN214_tree = (BAST)adaptor.create(LPAREN214);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN214_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:3: ( (exceptions+= ID )+ | LITERAL_all )
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==ID) ) {
				alt112=1;
			}
			else if ( (LA112_0==LITERAL_all) ) {
				alt112=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}

			switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:5: (exceptions+= ID )+
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:15: (exceptions+= ID )+
					int cnt111=0;
					loop111:
					while (true) {
						int alt111=2;
						int LA111_0 = input.LA(1);
						if ( (LA111_0==ID) ) {
							alt111=1;
						}

						switch (alt111) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:15: exceptions+= ID
							{
							exceptions=(Token)match(input,ID,FOLLOW_ID_in_catchClauseTerm7593); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							exceptions_tree = (BAST)adaptor.create(exceptions);
							adaptor.addChild(root_0, exceptions_tree);
							}

							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt111 >= 1 ) break loop111;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(111, input);
							throw eee;
						}
						cnt111++;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:23: LITERAL_all
					{
					LITERAL_all215=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm7598); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_all215_tree = (BAST)adaptor.create(LITERAL_all215);
					adaptor.addChild(root_0, LITERAL_all215_tree);
					}

					}
					break;

			}

			colon=(Token)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7604); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			colon_tree = (BAST)adaptor.create(colon);
			adaptor.addChild(root_0, colon_tree);
			}

			pushFollow(FOLLOW_basicAction_in_catchClauseTerm7608);
			act=basicAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, act.getTree());

			RPAREN216=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7610); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN216_tree = (BAST)adaptor.create(RPAREN216);
			adaptor.addChild(root_0, RPAREN216_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "catchClauseTerm"


	public static class quantifiedVariables_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantifiedVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:1: quantifiedVariables : LITERAL_declare ^ ( variableDeclaration )+ ;
	public final BLESS3Parser.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		BLESS3Parser.quantifiedVariables_return retval = new BLESS3Parser.quantifiedVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_declare217=null;
		ParserRuleReturnScope variableDeclaration218 =null;

		BAST LITERAL_declare217_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:20: ( LITERAL_declare ^ ( variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:3: LITERAL_declare ^ ( variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_declare217=(Token)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7622); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_declare217_tree = (BAST)adaptor.create(LITERAL_declare217);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_declare217_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:20: ( variableDeclaration )+
			int cnt113=0;
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==ID) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:20: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7625);
					variableDeclaration218=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration218.getTree());

					}
					break;

				default :
					if ( cnt113 >= 1 ) break loop113;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(113, input);
					throw eee;
				}
				cnt113++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "quantifiedVariables"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:1: variableDeclaration : v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) ;
	public final BLESS3Parser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		BLESS3Parser.variableDeclaration_return retval = new BLESS3Parser.variableDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token nv=null;
		Token sh=null;
		Token c=null;
		Token sp=null;
		Token f=null;
		Token assign=null;
		Token semi=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope a =null;

		BAST nv_tree=null;
		BAST sh_tree=null;
		BAST c_tree=null;
		BAST sp_tree=null;
		BAST f_tree=null;
		BAST assign_tree=null;
		BAST semi_tree=null;
		RewriteRuleTokenStream stream_LITERAL_shared=new RewriteRuleTokenStream(adaptor,"token LITERAL_shared");
		RewriteRuleTokenStream stream_LITERAL_final=new RewriteRuleTokenStream(adaptor,"token LITERAL_final");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LITERAL_nonvolatile=new RewriteRuleTokenStream(adaptor,"token LITERAL_nonvolatile");
		RewriteRuleTokenStream stream_LITERAL_spread=new RewriteRuleTokenStream(adaptor,"token LITERAL_spread");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_LITERAL_constant=new RewriteRuleTokenStream(adaptor,"token LITERAL_constant");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:20: (v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:3: v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )?
			{
			pushFollow(FOLLOW_variable_in_variableDeclaration7639);
			v=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(v.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1213:2: (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )?
			int alt114=6;
			switch ( input.LA(1) ) {
				case LITERAL_nonvolatile:
					{
					alt114=1;
					}
					break;
				case LITERAL_shared:
					{
					alt114=2;
					}
					break;
				case LITERAL_constant:
					{
					alt114=3;
					}
					break;
				case LITERAL_spread:
					{
					alt114=4;
					}
					break;
				case LITERAL_final:
					{
					alt114=5;
					}
					break;
			}
			switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1214:4: nv= LITERAL_nonvolatile
					{
					nv=(Token)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7650); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_nonvolatile.add(nv);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:6: sh= LITERAL_shared
					{
					sh=(Token)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7660); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_shared.add(sh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1216:6: c= LITERAL_constant
					{
					c=(Token)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_constant.add(c);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1217:7: sp= LITERAL_spread
					{
					sp=(Token)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_spread.add(sp);

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1218:7: f= LITERAL_final
					{
					f=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration7690); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(f);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:3: (assign= ASSIGN exp= expression )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ASSIGN) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:5: assign= ASSIGN exp= expression
					{
					assign=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7704); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(assign);

					pushFollow(FOLLOW_expression_in_variableDeclaration7708);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1221:4: (a= assertion )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==LASS) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1221:4: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7718);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:7: (semi= SEMICOLON )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==SEMICOLON) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:7: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration7727); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: a, nv, v, c, sh, a, sp, f, sh, nv, f, v, sp, exp, c, assign
			// token labels: c, sh, f, nv, sp, assign
			// rule labels: a, v, exp, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_sh=new RewriteRuleTokenStream(adaptor,"token sh",sh);
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleTokenStream stream_nv=new RewriteRuleTokenStream(adaptor,"token nv",nv);
			RewriteRuleTokenStream stream_sp=new RewriteRuleTokenStream(adaptor,"token sp",sp);
			RewriteRuleTokenStream stream_assign=new RewriteRuleTokenStream(adaptor,"token assign",assign);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1223:5: -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			if (assign!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:24: ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:51: ^( $assign $exp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_assign.nextNode(), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:70: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:74: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:79: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:84: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:88: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:93: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1224:5: -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:8: ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:36: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:40: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:45: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:50: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:54: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:59: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "variableDeclaration"


	public static class behaviorActions_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:1: behaviorActions :a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? ;
	public final BLESS3Parser.behaviorActions_return behaviorActions() throws RecognitionException {
		BLESS3Parser.behaviorActions_return retval = new BLESS3Parser.behaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token SEMICOLON219=null;
		Token SEMICOLON220=null;
		Token AMPERSAND221=null;
		Token AMPERSAND222=null;
		List<Object> list_a=null;
		RuleReturnScope a = null;
		BAST SEMICOLON219_tree=null;
		BAST SEMICOLON220_tree=null;
		BAST AMPERSAND221_tree=null;
		BAST AMPERSAND222_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:16: (a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:3: a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_assertedAction_in_behaviorActions7837);
			a=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

			if (list_a==null) list_a=new ArrayList<Object>();
			list_a.add(a.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:3: ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			int alt120=3;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==SEMICOLON) ) {
				alt120=1;
			}
			else if ( (LA120_0==AMPERSAND) ) {
				alt120=2;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:6: SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )*
					{
					SEMICOLON219=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7850); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON219_tree = (BAST)adaptor.create(SEMICOLON219);
					root_0 = (BAST)adaptor.becomeRoot(SEMICOLON219_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7855);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:35: ( SEMICOLON !a+= assertedAction )*
					loop118:
					while (true) {
						int alt118=2;
						int LA118_0 = input.LA(1);
						if ( (LA118_0==SEMICOLON) ) {
							alt118=1;
						}

						switch (alt118) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:37: SEMICOLON !a+= assertedAction
							{
							SEMICOLON220=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7859); if (state.failed) return retval;
							pushFollow(FOLLOW_assertedAction_in_behaviorActions7864);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop118;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:6: AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )*
					{
					AMPERSAND221=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7883); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND221_tree = (BAST)adaptor.create(AMPERSAND221);
					root_0 = (BAST)adaptor.becomeRoot(AMPERSAND221_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7888);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:35: ( AMPERSAND a+= assertedAction )*
					loop119:
					while (true) {
						int alt119=2;
						int LA119_0 = input.LA(1);
						if ( (LA119_0==AMPERSAND) ) {
							alt119=1;
						}

						switch (alt119) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:37: AMPERSAND a+= assertedAction
							{
							AMPERSAND222=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7892); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AMPERSAND222_tree = (BAST)adaptor.create(AMPERSAND222);
							adaptor.addChild(root_0, AMPERSAND222_tree);
							}

							pushFollow(FOLLOW_assertedAction_in_behaviorActions7896);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop119;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "behaviorActions"


	public static class assertedAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:1: assertedAction : (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) ;
	public final BLESS3Parser.assertedAction_return assertedAction() throws RecognitionException {
		BLESS3Parser.assertedAction_return retval = new BLESS3Parser.assertedAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pre =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope post =null;

		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:17: ( (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:3: (pre= assertion )? s= action (post= assertion )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:6: (pre= assertion )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==LASS) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:6: pre= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7921);
					pre=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(pre.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_assertedAction7930);
			s=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(s.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1244:7: (post= assertion )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==LASS) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1244:7: post= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7936);
					post=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(post.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: s, pre, post
			// token labels: 
			// rule labels: pre, s, post, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_pre=new RewriteRuleSubtreeStream(adaptor,"rule pre",pre!=null?pre.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_post=new RewriteRuleSubtreeStream(adaptor,"rule post",post!=null?post.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1245:5: -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:5: ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, (s!=null?((BAST)s.getTree()):null).getToken(), "ACTION["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:9: ^( P[\"P\"] ( $pre)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(P, "P"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:20: ( $pre)?
				if ( stream_pre.hasNext() ) {
					adaptor.addChild(root_2, stream_pre.nextTree());
				}
				stream_pre.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:9: ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(S, (s!=null?((BAST)s.getTree()):null).getToken(), "S["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1249:9: ^( Q[\"Q\"] ( $post)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, "Q"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1249:20: ( $post)?
				if ( stream_post.hasNext() ) {
					adaptor.addChild(root_2, stream_post.nextTree());
				}
				stream_post.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.assertedAction,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertedAction"


	public static class action_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "action"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:1: action : ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification );
	public final BLESS3Parser.action_return action() throws RecognitionException {
		BLESS3Parser.action_return retval = new BLESS3Parser.action_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope if_fi =null;
		ParserRuleReturnScope wl =null;
		ParserRuleReturnScope fl =null;
		ParserRuleReturnScope du =null;
		ParserRuleReturnScope elq =null;
		ParserRuleReturnScope ulq =null;
		ParserRuleReturnScope basicAction223 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:7: ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification )
			int alt123=7;
			switch ( input.LA(1) ) {
			case ID:
			case LITERAL_exception:
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_setmode:
			case LITERAL_skip:
			case LITERAL_swap:
			case LITERAL_when:
			case VERT:
				{
				alt123=1;
				}
				break;
			case LITERAL_if:
				{
				alt123=2;
				}
				break;
			case LITERAL_while:
				{
				alt123=3;
				}
				break;
			case LITERAL_for:
				{
				alt123=4;
				}
				break;
			case LITERAL_do:
				{
				alt123=5;
				}
				break;
			case LCURLY:
			case LITERAL_declare:
				{
				alt123=6;
				}
				break;
			case LITERAL_forall:
				{
				alt123=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1256:3: basicAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_basicAction_in_action8052);
					basicAction223=basicAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basicAction223.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:5: if_fi= alternative
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_alternative_in_action8060);
					if_fi=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_fi.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:5: wl= whileLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_action8068);
					wl=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, wl.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1259:5: fl= forLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_action8076);
					fl=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fl.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1260:5: du= doUntilLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_doUntilLoop_in_action8084);
					du=doUntilLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, du.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1261:5: elq= existentialLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8092);
					elq=existentialLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elq.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:5: ulq= universalLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalLatticeQuantification_in_action8101);
					ulq=universalLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ulq.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "action"


	public static class basicAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "basicAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:1: basicAction : ( LITERAL_skip | assignment | LITERAL_setmode mode= ID | whenThrow | combinableOperation | communicationAction | simultaneousAssignment | issueException );
	public final BLESS3Parser.basicAction_return basicAction() throws RecognitionException {
		BLESS3Parser.basicAction_return retval = new BLESS3Parser.basicAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token mode=null;
		Token LITERAL_skip224=null;
		Token LITERAL_setmode226=null;
		ParserRuleReturnScope assignment225 =null;
		ParserRuleReturnScope whenThrow227 =null;
		ParserRuleReturnScope combinableOperation228 =null;
		ParserRuleReturnScope communicationAction229 =null;
		ParserRuleReturnScope simultaneousAssignment230 =null;
		ParserRuleReturnScope issueException231 =null;

		BAST mode_tree=null;
		BAST LITERAL_skip224_tree=null;
		BAST LITERAL_setmode226_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:12: ( LITERAL_skip | assignment | LITERAL_setmode mode= ID | whenThrow | combinableOperation | communicationAction | simultaneousAssignment | issueException )
			int alt124=8;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt124=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EXCLAMATION:
				case LPAREN:
					{
					alt124=6;
					}
					break;
				case QUESTION:
					{
					int LA124_9 = input.LA(3);
					if ( (LA124_9==LPAREN) ) {
						alt124=6;
					}
					else if ( (LA124_9==ASSIGN||LA124_9==TICK) ) {
						alt124=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 124, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ASSIGN:
				case DOLLAR:
				case DOT:
				case LBRACKET:
				case TICK:
					{
					alt124=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 124, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LITERAL_setmode:
				{
				alt124=3;
				}
				break;
			case LITERAL_when:
				{
				alt124=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt124=5;
				}
				break;
			case VERT:
				{
				alt124=7;
				}
				break;
			case LITERAL_exception:
				{
				alt124=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1266:3: LITERAL_skip
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_skip224=(Token)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8116); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_skip224_tree = (BAST)adaptor.create(LITERAL_skip224);
					adaptor.addChild(root_0, LITERAL_skip224_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:5: assignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_basicAction8122);
					assignment225=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment225.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1268:5: LITERAL_setmode mode= ID
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_setmode226=(Token)match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8128); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_setmode226_tree = (BAST)adaptor.create(LITERAL_setmode226);
					adaptor.addChild(root_0, LITERAL_setmode226_tree);
					}

					mode=(Token)match(input,ID,FOLLOW_ID_in_basicAction8132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					mode_tree = (BAST)adaptor.create(mode);
					adaptor.addChild(root_0, mode_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1269:5: whenThrow
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whenThrow_in_basicAction8139);
					whenThrow227=whenThrow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThrow227.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1270:5: combinableOperation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_combinableOperation_in_basicAction8145);
					combinableOperation228=combinableOperation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, combinableOperation228.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1271:5: communicationAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_communicationAction_in_basicAction8151);
					communicationAction229=communicationAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, communicationAction229.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1273:5: simultaneousAssignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8159);
					simultaneousAssignment230=simultaneousAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simultaneousAssignment230.getTree());

					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1275:5: issueException
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_issueException_in_basicAction8166);
					issueException231=issueException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, issueException231.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "basicAction"


	public static class assignment_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1278:1: assignment : nameTick ASSIGN ^ expressionOrAny ;
	public final BLESS3Parser.assignment_return assignment() throws RecognitionException {
		BLESS3Parser.assignment_return retval = new BLESS3Parser.assignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ASSIGN233=null;
		ParserRuleReturnScope nameTick232 =null;
		ParserRuleReturnScope expressionOrAny234 =null;

		BAST ASSIGN233_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1278:11: ( nameTick ASSIGN ^ expressionOrAny )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1279:3: nameTick ASSIGN ^ expressionOrAny
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_nameTick_in_assignment8178);
			nameTick232=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nameTick232.getTree());

			ASSIGN233=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8180); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN233_tree = (BAST)adaptor.create(ASSIGN233);
			root_0 = (BAST)adaptor.becomeRoot(ASSIGN233_tree, root_0);
			}

			pushFollow(FOLLOW_expressionOrAny_in_assignment8183);
			expressionOrAny234=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrAny234.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "assignment"


	public static class simultaneousAssignment_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "simultaneousAssignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1282:1: simultaneousAssignment : VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) ;
	public final BLESS3Parser.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		BLESS3Parser.simultaneousAssignment_return retval = new BLESS3Parser.simultaneousAssignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token left_comma=null;
		Token a=null;
		Token right_comma=null;
		Token VERT235=null;
		Token COMMA236=null;
		Token COMMA237=null;
		Token VERT238=null;
		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		BAST left_comma_tree=null;
		BAST a_tree=null;
		BAST right_comma_tree=null;
		BAST VERT235_tree=null;
		BAST COMMA236_tree=null;
		BAST COMMA237_tree=null;
		BAST VERT238_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERT=new RewriteRuleTokenStream(adaptor,"token VERT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_nameTick=new RewriteRuleSubtreeStream(adaptor,"rule nameTick");
		RewriteRuleSubtreeStream stream_expressionOrAny=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrAny");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1282:24: ( VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1283:2: VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT
			{
			VERT235=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8195); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT235);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8201);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			left_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8205); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(left_comma);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8209);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1284:47: ( COMMA lhs+= nameTick )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==COMMA) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1284:49: COMMA lhs+= nameTick
					{
					COMMA236=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8213); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA236);

					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8217);
					lhs=nameTick();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTree());
					}
					break;

				default :
					break loop125;
				}
			}

			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8225); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(a);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8231);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			right_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8235); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(right_comma);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8239);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:62: ( COMMA rhs+= expressionOrAny )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==COMMA) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:64: COMMA rhs+= expressionOrAny
					{
					COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA237);

					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8247);
					rhs=expressionOrAny();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTree());
					}
					break;

				default :
					break loop126;
				}
			}

			VERT238=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8254); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT238);

			// AST REWRITE
			// elements: lhs, left_comma, right_comma, a, rhs
			// token labels: a, right_comma, left_comma
			// rule labels: retval
			// token list labels: 
			// rule list labels: lhs, rhs
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleTokenStream stream_right_comma=new RewriteRuleTokenStream(adaptor,"token right_comma",right_comma);
			RewriteRuleTokenStream stream_left_comma=new RewriteRuleTokenStream(adaptor,"token left_comma",left_comma);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"token lhs",list_lhs);
			RewriteRuleSubtreeStream stream_rhs=new RewriteRuleSubtreeStream(adaptor,"token rhs",list_rhs);
			root_0 = (BAST)adaptor.nil();
			// 1288:5: -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:8: ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_a.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:13: ^( $left_comma ( $lhs)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_left_comma.nextNode(), root_2);
				if ( !(stream_lhs.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_lhs.hasNext() ) {
					adaptor.addChild(root_2, stream_lhs.nextTree());
				}
				stream_lhs.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:36: ^( $right_comma ( $rhs)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_right_comma.nextNode(), root_2);
				if ( !(stream_rhs.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_rhs.hasNext() ) {
					adaptor.addChild(root_2, stream_rhs.nextTree());
				}
				stream_rhs.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "simultaneousAssignment"


	public static class nameTick_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "nameTick"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:1: nameTick : valueName ( TICK ^)? ;
	public final BLESS3Parser.nameTick_return nameTick() throws RecognitionException {
		BLESS3Parser.nameTick_return retval = new BLESS3Parser.nameTick_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TICK240=null;
		ParserRuleReturnScope valueName239 =null;

		BAST TICK240_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:9: ( valueName ( TICK ^)? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:11: valueName ( TICK ^)?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_valueName_in_nameTick8295);
			valueName239=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName239.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:21: ( TICK ^)?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==TICK) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:23: TICK ^
					{
					TICK240=(Token)match(input,TICK,FOLLOW_TICK_in_nameTick8299); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK240_tree = (BAST)adaptor.create(TICK240);
					root_0 = (BAST)adaptor.becomeRoot(TICK240_tree, root_0);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "nameTick"


	public static class expressionOrAny_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "expressionOrAny"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1293:1: expressionOrAny : ( expression | LITERAL_any );
	public final BLESS3Parser.expressionOrAny_return expressionOrAny() throws RecognitionException {
		BLESS3Parser.expressionOrAny_return retval = new BLESS3Parser.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_any242=null;
		ParserRuleReturnScope expression241 =null;

		BAST LITERAL_any242_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1293:16: ( expression | LITERAL_any )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==AADL_STRING_LITERAL||LA128_0==ID||LA128_0==LBRACKET||LA128_0==LITERAL_abs||LA128_0==LITERAL_all||LA128_0==LITERAL_exists||LA128_0==LITERAL_false||(LA128_0 >= LITERAL_not && LA128_0 <= LITERAL_now)||(LA128_0 >= LITERAL_null && LA128_0 <= LITERAL_numberof)||LA128_0==LITERAL_product||LA128_0==LITERAL_round||LA128_0==LITERAL_self||LA128_0==LITERAL_sum||LA128_0==LITERAL_timeout||LA128_0==LITERAL_tops||(LA128_0 >= LITERAL_true && LA128_0 <= LITERAL_truncate)||LA128_0==LPAREN||LA128_0==MINUS||LA128_0==NUMBER||LA128_0==OCTOTHORPE||(LA128_0 >= QCLREF && LA128_0 <= QCREF)) ) {
				alt128=1;
			}
			else if ( (LA128_0==LITERAL_any) ) {
				alt128=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:3: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_expressionOrAny8313);
					expression241=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression241.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:16: LITERAL_any
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_any242=(Token)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8317); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_any242_tree = (BAST)adaptor.create(LITERAL_any242);
					adaptor.addChild(root_0, LITERAL_any242_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "expressionOrAny"


	public static class whenThrow_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "whenThrow"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:1: whenThrow : LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ;
	public final BLESS3Parser.whenThrow_return whenThrow() throws RecognitionException {
		BLESS3Parser.whenThrow_return retval = new BLESS3Parser.whenThrow_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token excep=null;
		Token message=null;
		Token LITERAL_when243=null;
		Token LPAREN244=null;
		Token RPAREN245=null;
		Token LITERAL_throw246=null;
		ParserRuleReturnScope exp =null;

		BAST excep_tree=null;
		BAST message_tree=null;
		BAST LITERAL_when243_tree=null;
		BAST LPAREN244_tree=null;
		BAST RPAREN245_tree=null;
		BAST LITERAL_throw246_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:10: ( LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1298:3: LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_when243=(Token)match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8329); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_when243_tree = (BAST)adaptor.create(LITERAL_when243);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_when243_tree, root_0);
			}

			LPAREN244=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8332); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN244_tree = (BAST)adaptor.create(LPAREN244);
			adaptor.addChild(root_0, LPAREN244_tree);
			}

			pushFollow(FOLLOW_expression_in_whenThrow8336);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8338); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN245_tree = (BAST)adaptor.create(RPAREN245);
			adaptor.addChild(root_0, RPAREN245_tree);
			}

			LITERAL_throw246=(Token)match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8340); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throw246_tree = (BAST)adaptor.create(LITERAL_throw246);
			adaptor.addChild(root_0, LITERAL_throw246_tree);
			}

			excep=(Token)match(input,ID,FOLLOW_ID_in_whenThrow8344); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			excep_tree = (BAST)adaptor.create(excep);
			adaptor.addChild(root_0, excep_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1299:10: (message= AADL_STRING_LITERAL )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==AADL_STRING_LITERAL) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1299:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8352); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "whenThrow"


	public static class combinableOperation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "combinableOperation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:1: combinableOperation : ( LITERAL_fetchadd | LITERAL_fetchor | LITERAL_fetchand | LITERAL_fetchxor | LITERAL_swap );
	public final BLESS3Parser.combinableOperation_return combinableOperation() throws RecognitionException {
		BLESS3Parser.combinableOperation_return retval = new BLESS3Parser.combinableOperation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set247=null;

		BAST set247_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:20: ( LITERAL_fetchadd | LITERAL_fetchor | LITERAL_fetchand | LITERAL_fetchxor | LITERAL_swap )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set247=input.LT(1);
			if ( (input.LA(1) >= LITERAL_fetchadd && input.LA(1) <= LITERAL_fetchxor)||input.LA(1)==LITERAL_swap ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set247));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "combinableOperation"


	public static class communicationAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "communicationAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:1: communicationAction : (pc= subprogramCall |po= portOutput |pi= portInput );
	public final BLESS3Parser.communicationAction_return communicationAction() throws RecognitionException {
		BLESS3Parser.communicationAction_return retval = new BLESS3Parser.communicationAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pc =null;
		ParserRuleReturnScope po =null;
		ParserRuleReturnScope pi =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:20: (pc= subprogramCall |po= portOutput |pi= portInput )
			int alt130=3;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==ID) ) {
				switch ( input.LA(2) ) {
				case LPAREN:
					{
					alt130=1;
					}
					break;
				case EXCLAMATION:
					{
					alt130=2;
					}
					break;
				case QUESTION:
					{
					alt130=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}

			switch (alt130) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1315:3: pc= subprogramCall
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_subprogramCall_in_communicationAction8417);
					pc=subprogramCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1317:3: po= portOutput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portOutput_in_communicationAction8427);
					po=portOutput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, po.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1319:3: pi= portInput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portInput_in_communicationAction8437);
					pi=portInput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pi.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "communicationAction"


	public static class subprogramCall_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subprogramCall"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1326:1: subprogramCall : id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal) ;
	public final BLESS3Parser.subprogramCall_return subprogramCall() throws RecognitionException {
		BLESS3Parser.subprogramCall_return retval = new BLESS3Parser.subprogramCall_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN248=null;
		Token RPAREN249=null;
		ParserRuleReturnScope fal =null;

		BAST id_tree=null;
		BAST LPAREN248_tree=null;
		BAST RPAREN249_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_formalActualList=new RewriteRuleSubtreeStream(adaptor,"rule formalActualList");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1326:15: (id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1327:3: id= ID LPAREN (fal= formalActualList )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_subprogramCall8455); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN248=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subprogramCall8457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN248);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1327:19: (fal= formalActualList )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==AADL_STRING_LITERAL||LA131_0==ID||LA131_0==LITERAL_false||LA131_0==LITERAL_null||LA131_0==LITERAL_self||LA131_0==LITERAL_true||LA131_0==LPAREN||LA131_0==NUMBER||LA131_0==OCTOTHORPE||(LA131_0 >= QCLREF && LA131_0 <= QCREF)) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1327:19: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall8461);
					fal=formalActualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalActualList.add(fal.getTree());
					}
					break;

			}

			RPAREN249=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subprogramCall8464); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN249);

			// AST REWRITE
			// elements: fal, id
			// token labels: id
			// rule labels: fal, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_fal=new RewriteRuleSubtreeStream(adaptor,"rule fal",fal!=null?fal.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1328:5: -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1328:8: ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(SUBPROGRAM_INVOCATION, id, "SUBPROGRAM_INVOCATION["+Integer.toString(id_tree.getLine())+"] "), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "subprogramCall"


	public static class formalActualList_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "formalActualList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:1: formalActualList : formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? ;
	public final BLESS3Parser.formalActualList_return formalActualList() throws RecognitionException {
		BLESS3Parser.formalActualList_return retval = new BLESS3Parser.formalActualList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA251=null;
		Token COMMA253=null;
		ParserRuleReturnScope formalActual250 =null;
		ParserRuleReturnScope formalActual252 =null;
		ParserRuleReturnScope formalActual254 =null;

		BAST COMMA251_tree=null;
		BAST COMMA253_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:17: ( formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1333:3: formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalActual_in_formalActualList8495);
			formalActual250=formalActual();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual250.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1333:16: ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==COMMA) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1333:18: COMMA ^ formalActual ( COMMA ! formalActual )*
					{
					COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8499); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA251_tree = (BAST)adaptor.create(COMMA251);
					root_0 = (BAST)adaptor.becomeRoot(COMMA251_tree, root_0);
					}

					pushFollow(FOLLOW_formalActual_in_formalActualList8502);
					formalActual252=formalActual();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual252.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1333:38: ( COMMA ! formalActual )*
					loop132:
					while (true) {
						int alt132=2;
						int LA132_0 = input.LA(1);
						if ( (LA132_0==COMMA) ) {
							alt132=1;
						}

						switch (alt132) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1333:40: COMMA ! formalActual
							{
							COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8506); if (state.failed) return retval;
							pushFollow(FOLLOW_formalActual_in_formalActualList8509);
							formalActual254=formalActual();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual254.getTree());

							}
							break;

						default :
							break loop132;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "formalActualList"


	public static class formalActual_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "formalActual"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:1: formalActual : (formal= ID COLON ^)? actual= subProgramParameter ;
	public final BLESS3Parser.formalActual_return formalActual() throws RecognitionException {
		BLESS3Parser.formalActual_return retval = new BLESS3Parser.formalActual_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON255=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON255_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:13: ( (formal= ID COLON ^)? actual= subProgramParameter )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1337:3: (formal= ID COLON ^)? actual= subProgramParameter
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1337:3: (formal= ID COLON ^)?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==ID) ) {
				int LA134_1 = input.LA(2);
				if ( (LA134_1==COLON) ) {
					alt134=1;
				}
			}
			switch (alt134) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1337:5: formal= ID COLON ^
					{
					formal=(Token)match(input,ID,FOLLOW_ID_in_formalActual8531); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					formal_tree = (BAST)adaptor.create(formal);
					adaptor.addChild(root_0, formal_tree);
					}

					COLON255=(Token)match(input,COLON,FOLLOW_COLON_in_formalActual8539); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLON255_tree = (BAST)adaptor.create(COLON255);
					root_0 = (BAST)adaptor.becomeRoot(COLON255_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_subProgramParameter_in_formalActual8547);
			actual=subProgramParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actual.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "formalActual"


	public static class subProgramParameter_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subProgramParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:1: subProgramParameter : ( valueName | constant | parenthesizedSubexpression );
	public final BLESS3Parser.subProgramParameter_return subProgramParameter() throws RecognitionException {
		BLESS3Parser.subProgramParameter_return retval = new BLESS3Parser.subProgramParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope valueName256 =null;
		ParserRuleReturnScope constant257 =null;
		ParserRuleReturnScope parenthesizedSubexpression258 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:20: ( valueName | constant | parenthesizedSubexpression )
			int alt135=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt135=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_self:
			case LITERAL_true:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt135=2;
				}
				break;
			case LPAREN:
				{
				alt135=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}
			switch (alt135) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1342:2: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_subProgramParameter8558);
					valueName256=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName256.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1343:4: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_subProgramParameter8563);
					constant257=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant257.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1344:4: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter8568);
					parenthesizedSubexpression258=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression258.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "subProgramParameter"


	public static class portOutput_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "portOutput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1347:1: portOutput : pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) ;
	public final BLESS3Parser.portOutput_return portOutput() throws RecognitionException {
		BLESS3Parser.portOutput_return retval = new BLESS3Parser.portOutput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn=null;
		Token EXCLAMATION259=null;
		Token LPAREN260=null;
		Token RPAREN261=null;
		ParserRuleReturnScope be =null;

		BAST pn_tree=null;
		BAST EXCLAMATION259_tree=null;
		BAST LPAREN260_tree=null;
		BAST RPAREN261_tree=null;
		RewriteRuleTokenStream stream_EXCLAMATION=new RewriteRuleTokenStream(adaptor,"token EXCLAMATION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1347:11: (pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1348:5: pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )?
			{
			pn=(Token)match(input,ID,FOLLOW_ID_in_portOutput8584); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn);

			EXCLAMATION259=(Token)match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_portOutput8586); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXCLAMATION.add(EXCLAMATION259);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1348:23: ( LPAREN be= expression RPAREN )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==LPAREN) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1348:25: LPAREN be= expression RPAREN
					{
					LPAREN260=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portOutput8590); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN260);

					pushFollow(FOLLOW_expression_in_portOutput8594);
					be=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(be.getTree());
					RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portOutput8596); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN261);

					}
					break;

			}

			// AST REWRITE
			// elements: be, pn
			// token labels: pn
			// rule labels: be, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_pn=new RewriteRuleTokenStream(adaptor,"token pn",pn);
			RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1349:5: -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:8: ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_OUTPUT, pn, "PORT_OUTPUT["+Integer.toString(pn_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1351:19: ( $be)?
				if ( stream_be.hasNext() ) {
					adaptor.addChild(root_1, stream_be.nextTree());
				}
				stream_be.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "portOutput"


	public static class portInput_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "portInput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1354:1: portInput : pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) ;
	public final BLESS3Parser.portInput_return portInput() throws RecognitionException {
		BLESS3Parser.portInput_return retval = new BLESS3Parser.portInput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn2=null;
		Token QUESTION262=null;
		Token LPAREN263=null;
		Token RPAREN264=null;
		ParserRuleReturnScope n =null;

		BAST pn2_tree=null;
		BAST QUESTION262_tree=null;
		BAST LPAREN263_tree=null;
		BAST RPAREN264_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_valueName=new RewriteRuleSubtreeStream(adaptor,"rule valueName");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1354:10: (pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1355:5: pn2= ID QUESTION LPAREN n= valueName RPAREN
			{
			pn2=(Token)match(input,ID,FOLLOW_ID_in_portInput8642); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn2);

			QUESTION262=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_portInput8644); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION262);

			LPAREN263=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portInput8646); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN263);

			pushFollow(FOLLOW_valueName_in_portInput8651);
			n=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(n.getTree());
			RPAREN264=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portInput8653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN264);

			// AST REWRITE
			// elements: pn2, n
			// token labels: pn2
			// rule labels: n, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_pn2=new RewriteRuleTokenStream(adaptor,"token pn2",pn2);
			RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1356:6: -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:9: ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_INPUT, pn2, "PORT_INPUT["+Integer.toString(pn2_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn2.nextNode());
				adaptor.addChild(root_1, stream_n.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "portInput"


	public static class alternative_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "alternative"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1361:1: alternative : lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) ;
	public final BLESS3Parser.alternative_return alternative() throws RecognitionException {
		BLESS3Parser.alternative_return retval = new BLESS3Parser.alternative_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lif=null;
		Token BOX265=null;
		Token LITERAL_fi266=null;
		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		BAST lif_tree=null;
		BAST BOX265_tree=null;
		BAST LITERAL_fi266_tree=null;
		RewriteRuleTokenStream stream_LITERAL_fi=new RewriteRuleTokenStream(adaptor,"token LITERAL_fi");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_BOX=new RewriteRuleTokenStream(adaptor,"token BOX");
		RewriteRuleSubtreeStream stream_guardedAction=new RewriteRuleSubtreeStream(adaptor,"rule guardedAction");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1361:12: (lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:3: lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi
			{
			lif=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative8694); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(lif);

			pushFollow(FOLLOW_guardedAction_in_alternative8702);
			alt=guardedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
			if (list_alt==null) list_alt=new ArrayList<Object>();
			list_alt.add(alt.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1365:3: ( BOX alt+= guardedAction )+
			int cnt137=0;
			loop137:
			while (true) {
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==BOX) ) {
					alt137=1;
				}

				switch (alt137) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1365:5: BOX alt+= guardedAction
					{
					BOX265=(Token)match(input,BOX,FOLLOW_BOX_in_alternative8708); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOX.add(BOX265);

					pushFollow(FOLLOW_guardedAction_in_alternative8712);
					alt=guardedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTree());
					}
					break;

				default :
					if ( cnt137 >= 1 ) break loop137;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(137, input);
					throw eee;
				}
				cnt137++;
			}

			LITERAL_fi266=(Token)match(input,LITERAL_fi,FOLLOW_LITERAL_fi_in_alternative8720); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_fi.add(LITERAL_fi266);

			// AST REWRITE
			// elements: alt, lif
			// token labels: lif
			// rule labels: retval
			// token list labels: 
			// rule list labels: alt
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lif=new RewriteRuleTokenStream(adaptor,"token lif",lif);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_alt=new RewriteRuleSubtreeStream(adaptor,"token alt",list_alt);
			root_0 = (BAST)adaptor.nil();
			// 1367:5: -> ^( $lif ( $alt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1367:8: ^( $lif ( $alt)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lif.nextNode(), root_1);
				if ( !(stream_alt.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_alt.hasNext() ) {
					adaptor.addChild(root_1, stream_alt.nextTree());
				}
				stream_alt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.alternative,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternative"


	public static class guardedAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "guardedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1373:1: guardedAction : LPAREN ! expression GUARD ^ assertedAction ;
	public final BLESS3Parser.guardedAction_return guardedAction() throws RecognitionException {
		BLESS3Parser.guardedAction_return retval = new BLESS3Parser.guardedAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN267=null;
		Token GUARD269=null;
		ParserRuleReturnScope expression268 =null;
		ParserRuleReturnScope assertedAction270 =null;

		BAST LPAREN267_tree=null;
		BAST GUARD269_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1373:14: ( LPAREN ! expression GUARD ^ assertedAction )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1374:3: LPAREN ! expression GUARD ^ assertedAction
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN267=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_guardedAction8758); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_guardedAction8762);
			expression268=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression268.getTree());

			GUARD269=(Token)match(input,GUARD,FOLLOW_GUARD_in_guardedAction8764); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GUARD269_tree = (BAST)adaptor.create(GUARD269);
			root_0 = (BAST)adaptor.becomeRoot(GUARD269_tree, root_0);
			}

			pushFollow(FOLLOW_assertedAction_in_guardedAction8767);
			assertedAction270=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertedAction270.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.guardedAction,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "guardedAction"


	public static class whileLoop_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1379:1: whileLoop : lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) ;
	public final BLESS3Parser.whileLoop_return whileLoop() throws RecognitionException {
		BLESS3Parser.whileLoop_return retval = new BLESS3Parser.whileLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lw=null;
		Token LPAREN271=null;
		Token RPAREN272=null;
		Token LITERAL_invariant273=null;
		Token LITERAL_bound274=null;
		ParserRuleReturnScope be =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope elq =null;

		BAST lw_tree=null;
		BAST LPAREN271_tree=null;
		BAST RPAREN272_tree=null;
		BAST LITERAL_invariant273_tree=null;
		BAST LITERAL_bound274_tree=null;
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_bound=new RewriteRuleTokenStream(adaptor,"token LITERAL_bound");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_while=new RewriteRuleTokenStream(adaptor,"token LITERAL_while");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1379:10: (lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1380:3: lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification
			{
			lw=(Token)match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop8791); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_while.add(lw);

			LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileLoop8797); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN271);

			pushFollow(FOLLOW_expression_in_whileLoop8802);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN272=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileLoop8804); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN272);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1383:3: ( LITERAL_invariant inv= assertion )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==LITERAL_invariant) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1383:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant273=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_whileLoop8811); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant273);

					pushFollow(FOLLOW_assertion_in_whileLoop8815);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1384:3: ( LITERAL_bound bd= expression )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==LITERAL_bound) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1384:5: LITERAL_bound bd= expression
					{
					LITERAL_bound274=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_whileLoop8824); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound274);

					pushFollow(FOLLOW_expression_in_whileLoop8829);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop8840);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: elq, be, bd, lw, inv
			// token labels: lw
			// rule labels: inv, bd, be, elq, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lw=new RewriteRuleTokenStream(adaptor,"token lw",lw);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_bd=new RewriteRuleSubtreeStream(adaptor,"rule bd",bd!=null?bd.getTree():null);
			RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1386:5: -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1386:8: ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lw.nextNode(), root_1);
				adaptor.addChild(root_1, stream_be.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1386:18: ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lw, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1386:48: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1386:54: ^( BOUND[$lw,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, lw, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1386:76: ( $bd)?
				if ( stream_bd.hasNext() ) {
					adaptor.addChild(root_2, stream_bd.nextTree());
				}
				stream_bd.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_elq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.whileLoop,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class forLoop_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:1: forLoop : lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) ;
	public final BLESS3Parser.forLoop_return forLoop() throws RecognitionException {
		BLESS3Parser.forLoop_return retval = new BLESS3Parser.forLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT275=null;
		Token LITERAL_invariant276=null;
		Token LCURLY277=null;
		Token RCURLY278=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope act =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT275_tree=null;
		BAST LITERAL_invariant276_tree=null;
		BAST LCURLY277_tree=null;
		BAST RCURLY278_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_for=new RewriteRuleTokenStream(adaptor,"token LITERAL_for");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_behaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule behaviorActions");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:8: (lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1392:3: lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY
			{
			lf=(Token)match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop8898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_for.add(lf);

			pushFollow(FOLLOW_identifier_in_forLoop8905);
			a=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(a.getTree());
			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop8910); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_forLoop8915);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT275=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_forLoop8917); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT275);

			pushFollow(FOLLOW_expression_in_forLoop8922);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:3: ( LITERAL_invariant inv= assertion )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==LITERAL_invariant) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant276=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_forLoop8929); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant276);

					pushFollow(FOLLOW_assertion_in_forLoop8933);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			LCURLY277=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forLoop8940); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY277);

			pushFollow(FOLLOW_behaviorActions_in_forLoop8945);
			act=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(act.getTree());
			RCURLY278=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forLoop8947); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY278);

			// AST REWRITE
			// elements: act, lf, inv, lb, a, ub, li
			// token labels: lf, li
			// rule labels: inv, a, act, lb, ub, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lf=new RewriteRuleTokenStream(adaptor,"token lf",lf);
			RewriteRuleTokenStream stream_li=new RewriteRuleTokenStream(adaptor,"token li",li);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_act=new RewriteRuleSubtreeStream(adaptor,"rule act",act!=null?act.getTree():null);
			RewriteRuleSubtreeStream stream_lb=new RewriteRuleSubtreeStream(adaptor,"rule lb",lb!=null?lb.getTree():null);
			RewriteRuleSubtreeStream stream_ub=new RewriteRuleSubtreeStream(adaptor,"rule ub",ub!=null?ub.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1396:5: -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1396:7: ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1396:16: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1396:31: ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lf, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1396:61: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_act.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.forLoop,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class doUntilLoop_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "doUntilLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1401:1: doUntilLoop : ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) ;
	public final BLESS3Parser.doUntilLoop_return doUntilLoop() throws RecognitionException {
		BLESS3Parser.doUntilLoop_return retval = new BLESS3Parser.doUntilLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ld=null;
		Token lu=null;
		Token LITERAL_invariant279=null;
		Token LITERAL_bound280=null;
		Token LPAREN281=null;
		Token RPAREN282=null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope be =null;

		BAST ld_tree=null;
		BAST lu_tree=null;
		BAST LITERAL_invariant279_tree=null;
		BAST LITERAL_bound280_tree=null;
		BAST LPAREN281_tree=null;
		BAST RPAREN282_tree=null;
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_bound=new RewriteRuleTokenStream(adaptor,"token LITERAL_bound");
		RewriteRuleTokenStream stream_LITERAL_until=new RewriteRuleTokenStream(adaptor,"token LITERAL_until");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_do=new RewriteRuleTokenStream(adaptor,"token LITERAL_do");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_behaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule behaviorActions");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1401:12: (ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1402:3: ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN
			{
			ld=(Token)match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9010); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_do.add(ld);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1403:3: ( LITERAL_invariant inv= assertion )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==LITERAL_invariant) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1403:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant279=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_doUntilLoop9017); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant279);

					pushFollow(FOLLOW_assertion_in_doUntilLoop9021);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1404:3: ( LITERAL_bound bd= expression )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==LITERAL_bound) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1404:5: LITERAL_bound bd= expression
					{
					LITERAL_bound280=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_doUntilLoop9030); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound280);

					pushFollow(FOLLOW_expression_in_doUntilLoop9035);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9046);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(ba.getTree());
			lu=(Token)match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9052); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_until.add(lu);

			LPAREN281=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doUntilLoop9054); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN281);

			pushFollow(FOLLOW_expression_in_doUntilLoop9059);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN282=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doUntilLoop9061); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN282);

			// AST REWRITE
			// elements: bd, ld, ba, be, inv, lu
			// token labels: ld, lu
			// rule labels: inv, bd, be, retval, ba
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ld=new RewriteRuleTokenStream(adaptor,"token ld",ld);
			RewriteRuleTokenStream stream_lu=new RewriteRuleTokenStream(adaptor,"token lu",lu);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_bd=new RewriteRuleSubtreeStream(adaptor,"rule bd",bd!=null?bd.getTree():null);
			RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ba=new RewriteRuleSubtreeStream(adaptor,"rule ba",ba!=null?ba.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1407:5: -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1407:7: ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ld.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1407:13: ^( $lu $be)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lu.nextNode(), root_2);
				adaptor.addChild(root_2, stream_be.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1407:24: ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, ld, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1407:54: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1407:60: ^( BOUND[$ld,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, ld, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1407:82: ( $bd)?
				if ( stream_bd.hasNext() ) {
					adaptor.addChild(root_2, stream_bd.nextTree());
				}
				stream_bd.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_ba.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.doUntilLoop,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doUntilLoop"


	public static class existentialLatticeQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "existentialLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1413:1: existentialLatticeQuantification : (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? ;
	public final BLESS3Parser.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		BLESS3Parser.existentialLatticeQuantification_return retval = new BLESS3Parser.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lc=null;
		Token RCURLY283=null;
		ParserRuleReturnScope qv =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope cc =null;

		BAST lc_tree=null;
		BAST RCURLY283_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1413:33: ( (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1414:3: (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )?
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1414:5: (qv= quantifiedVariables )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==LITERAL_declare) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1414:5: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9128);
					qv=quantifiedVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qv.getTree());

					}
					break;

			}

			lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification9135); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			lc_tree = (BAST)adaptor.create(lc);
			root_0 = (BAST)adaptor.becomeRoot(lc_tree, root_0);
			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification9141);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ba.getTree());

			RCURLY283=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification9143); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RCURLY283_tree = (BAST)adaptor.create(RCURLY283);
			adaptor.addChild(root_0, RCURLY283_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:5: (cc= catchClause )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LITERAL_catch) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:5: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification9151);
					cc=catchClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cc.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.elq,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialLatticeQuantification"


	public static class universalLatticeQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "universalLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:1: universalLatticeQuantification : lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) ;
	public final BLESS3Parser.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		BLESS3Parser.universalLatticeQuantification_return retval = new BLESS3Parser.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT284=null;
		Token lv=null;
		List<Object> list_lv=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope elq =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT284_tree=null;
		BAST lv_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_forall=new RewriteRuleTokenStream(adaptor,"token LITERAL_forall");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:31: (lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:3: lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification
			{
			lf=(Token)match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9176); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_forall.add(lf);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1423:5: (lv+= ID )+
			int cnt145=0;
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==ID) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1423:5: lv+= ID
					{
					lv=(Token)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9185); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(lv);

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt145 >= 1 ) break loop145;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(145, input);
					throw eee;
				}
				cnt145++;
			}

			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9190); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9194);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT284=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_universalLatticeQuantification9196); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT284);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9200);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9209);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: li, lb, lf, elq, ub, lv
			// token labels: lf, li
			// rule labels: lb, elq, ub, retval
			// token list labels: lv
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lf=new RewriteRuleTokenStream(adaptor,"token lf",lf);
			RewriteRuleTokenStream stream_li=new RewriteRuleTokenStream(adaptor,"token li",li);
			RewriteRuleTokenStream stream_lv=new RewriteRuleTokenStream(adaptor,"token lv", list_lv);
			RewriteRuleSubtreeStream stream_lb=new RewriteRuleSubtreeStream(adaptor,"rule lb",lb!=null?lb.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_ub=new RewriteRuleSubtreeStream(adaptor,"rule ub",ub!=null?ub.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1426:5: -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1426:8: ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				if ( !(stream_lv.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_lv.hasNext() ) {
					adaptor.addChild(root_1, stream_lv.nextNode());
				}
				stream_lv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1426:19: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_elq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.ulq,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalLatticeQuantification"


	public static class issueException_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "issueException"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:1: issueException : LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN ;
	public final BLESS3Parser.issueException_return issueException() throws RecognitionException {
		BLESS3Parser.issueException_return retval = new BLESS3Parser.issueException_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token exception=null;
		Token message=null;
		Token LITERAL_exception285=null;
		Token LPAREN286=null;
		Token RPAREN287=null;

		BAST exception_tree=null;
		BAST message_tree=null;
		BAST LITERAL_exception285_tree=null;
		BAST LPAREN286_tree=null;
		BAST RPAREN287_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:15: ( LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1432:2: LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_exception285=(Token)match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9258); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_exception285_tree = (BAST)adaptor.create(LITERAL_exception285);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_exception285_tree, root_0);
			}

			LPAREN286=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_issueException9261); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN286_tree = (BAST)adaptor.create(LPAREN286);
			adaptor.addChild(root_0, LPAREN286_tree);
			}

			exception=(Token)match(input,ID,FOLLOW_ID_in_issueException9265); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			exception_tree = (BAST)adaptor.create(exception);
			adaptor.addChild(root_0, exception_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:10: (message= AADL_STRING_LITERAL )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==AADL_STRING_LITERAL) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9273); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_issueException9276); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN287_tree = (BAST)adaptor.create(RPAREN287);
			adaptor.addChild(root_0, RPAREN287_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "issueException"


	public static class blessSubclause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "blessSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:1: blessSubclause : (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) ;
	public final BLESS3Parser.blessSubclause_return blessSubclause() throws RecognitionException {
		BLESS3Parser.blessSubclause_return retval = new BLESS3Parser.blessSubclause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token no_proof=null;
		ParserRuleReturnScope ac =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope vs =null;
		ParserRuleReturnScope ss =null;
		ParserRuleReturnScope t =null;

		BAST no_proof_tree=null;
		RewriteRuleTokenStream stream_DO_NOT_PROVE=new RewriteRuleTokenStream(adaptor,"token DO_NOT_PROVE");
		RewriteRuleSubtreeStream stream_invariantClause=new RewriteRuleSubtreeStream(adaptor,"rule invariantClause");
		RewriteRuleSubtreeStream stream_assertClause=new RewriteRuleSubtreeStream(adaptor,"rule assertClause");
		RewriteRuleSubtreeStream stream_variablesSection=new RewriteRuleSubtreeStream(adaptor,"rule variablesSection");
		RewriteRuleSubtreeStream stream_statesSection=new RewriteRuleSubtreeStream(adaptor,"rule statesSection");
		RewriteRuleSubtreeStream stream_transitions=new RewriteRuleSubtreeStream(adaptor,"rule transitions");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:15: ( (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:2: (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:10: (no_proof= DO_NOT_PROVE )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==DO_NOT_PROVE) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:10: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9290); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1441:5: (ac= assertClause )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==LITERAL_assert) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1441:5: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_blessSubclause9297);
					ac=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(ac.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:6: (inv= invariantClause )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==LITERAL_invariant) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:6: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_blessSubclause9306);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invariantClause.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1443:5: (vs= variablesSection )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LITERAL_variables) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1443:5: vs= variablesSection
					{
					pushFollow(FOLLOW_variablesSection_in_blessSubclause9313);
					vs=variablesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variablesSection.add(vs.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1444:5: (ss= statesSection )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LITERAL_states) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1444:5: ss= statesSection
					{
					pushFollow(FOLLOW_statesSection_in_blessSubclause9320);
					ss=statesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statesSection.add(ss.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1445:4: (t= transitions )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==LITERAL_transitions) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1445:4: t= transitions
					{
					pushFollow(FOLLOW_transitions_in_blessSubclause9327);
					t=transitions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_transitions.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ss, t, no_proof, inv, vs, ac
			// token labels: no_proof
			// rule labels: ss, inv, ac, t, vs, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_ss=new RewriteRuleSubtreeStream(adaptor,"rule ss",ss!=null?ss.getTree():null);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_ac=new RewriteRuleSubtreeStream(adaptor,"rule ac",ac!=null?ac.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_vs=new RewriteRuleSubtreeStream(adaptor,"rule vs",vs!=null?vs.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1446:5: -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1446:8: ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BLESS_SUBCLAUSE, "BLESS_SUBCLAUSE"), root_1);
				adaptor.addChild(root_1, stream_no_proof.nextNode());
				adaptor.addChild(root_1, stream_ac.nextTree());
				adaptor.addChild(root_1, stream_inv.nextTree());
				adaptor.addChild(root_1, stream_vs.nextTree());
				adaptor.addChild(root_1, stream_ss.nextTree());
				adaptor.addChild(root_1, stream_t.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "blessSubclause"


	public static class invariantClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "invariantClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:1: invariantClause : LITERAL_invariant ^ assertion ;
	public final BLESS3Parser.invariantClause_return invariantClause() throws RecognitionException {
		BLESS3Parser.invariantClause_return retval = new BLESS3Parser.invariantClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_invariant288=null;
		ParserRuleReturnScope assertion289 =null;

		BAST LITERAL_invariant288_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:16: ( LITERAL_invariant ^ assertion )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1450:3: LITERAL_invariant ^ assertion
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_invariant288=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9369); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_invariant288_tree = (BAST)adaptor.create(LITERAL_invariant288);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_invariant288_tree, root_0);
			}

			pushFollow(FOLLOW_assertion_in_invariantClause9372);
			assertion289=assertion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertion289.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "invariantClause"


	public static class variablesSection_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variablesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1453:1: variablesSection : LITERAL_variables ^ (vd+= variableDeclaration )+ ;
	public final BLESS3Parser.variablesSection_return variablesSection() throws RecognitionException {
		BLESS3Parser.variablesSection_return retval = new BLESS3Parser.variablesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_variables290=null;
		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		BAST LITERAL_variables290_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1453:17: ( LITERAL_variables ^ (vd+= variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1454:2: LITERAL_variables ^ (vd+= variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_variables290=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection9384); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_variables290_tree = (BAST)adaptor.create(LITERAL_variables290);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_variables290_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1454:23: (vd+= variableDeclaration )+
			int cnt153=0;
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==ID) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1454:23: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection9389);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTree());
					}
					break;

				default :
					if ( cnt153 >= 1 ) break loop153;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(153, input);
					throw eee;
				}
				cnt153++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "variablesSection"


	public static class statesSection_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "statesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:1: statesSection : LITERAL_states ^ (states+= behaviorState )+ ;
	public final BLESS3Parser.statesSection_return statesSection() throws RecognitionException {
		BLESS3Parser.statesSection_return retval = new BLESS3Parser.statesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_states291=null;
		List<Object> list_states=null;
		RuleReturnScope states = null;
		BAST LITERAL_states291_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:14: ( LITERAL_states ^ (states+= behaviorState )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:4: LITERAL_states ^ (states+= behaviorState )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_states291=(Token)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection9401); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_states291_tree = (BAST)adaptor.create(LITERAL_states291);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_states291_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:26: (states+= behaviorState )+
			int cnt154=0;
			loop154:
			while (true) {
				int alt154=2;
				int LA154_0 = input.LA(1);
				if ( (LA154_0==ID) ) {
					alt154=1;
				}

				switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection9406);
					states=behaviorState();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, states.getTree());

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTree());
					}
					break;

				default :
					if ( cnt154 >= 1 ) break loop154;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(154, input);
					throw eee;
				}
				cnt154++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "statesSection"


	public static class behaviorState_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorState"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1464:1: behaviorState : i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) ;
	public final BLESS3Parser.behaviorState_return behaviorState() throws RecognitionException {
		BLESS3Parser.behaviorState_return retval = new BLESS3Parser.behaviorState_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token init=null;
		Token com=null;
		Token finl=null;
		Token st=null;
		Token COLON292=null;
		Token SEMICOLON293=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope a =null;

		BAST init_tree=null;
		BAST com_tree=null;
		BAST finl_tree=null;
		BAST st_tree=null;
		BAST COLON292_tree=null;
		BAST SEMICOLON293_tree=null;
		RewriteRuleTokenStream stream_LITERAL_final=new RewriteRuleTokenStream(adaptor,"token LITERAL_final");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LITERAL_state=new RewriteRuleTokenStream(adaptor,"token LITERAL_state");
		RewriteRuleTokenStream stream_LITERAL_initial=new RewriteRuleTokenStream(adaptor,"token LITERAL_initial");
		RewriteRuleTokenStream stream_LITERAL_complete=new RewriteRuleTokenStream(adaptor,"token LITERAL_complete");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1464:14: (i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1465:3: i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )?
			{
			pushFollow(FOLLOW_identifier_in_behaviorState9423);
			i=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(i.getTree());
			COLON292=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorState9428); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON292);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:9: (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )?
			int alt155=4;
			switch ( input.LA(1) ) {
				case LITERAL_initial:
					{
					alt155=1;
					}
					break;
				case LITERAL_complete:
					{
					alt155=2;
					}
					break;
				case LITERAL_final:
					{
					alt155=3;
					}
					break;
			}
			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:10: init= LITERAL_initial
					{
					init=(Token)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState9433); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_initial.add(init);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:33: com= LITERAL_complete
					{
					com=(Token)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState9439); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_complete.add(com);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:56: finl= LITERAL_final
					{
					finl=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState9445); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(finl);

					}
					break;

			}

			st=(Token)match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState9451); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_state.add(st);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:95: (a= assertion )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LASS) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:95: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState9455);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:107: ( SEMICOLON )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==SEMICOLON) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:107: SEMICOLON
					{
					SEMICOLON293=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorState9458); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON293);

					}
					break;

			}

			// AST REWRITE
			// elements: a, i, finl, init, LITERAL_state, com
			// token labels: com, init, finl
			// rule labels: a, i, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_com=new RewriteRuleTokenStream(adaptor,"token com",com);
			RewriteRuleTokenStream stream_init=new RewriteRuleTokenStream(adaptor,"token init",init);
			RewriteRuleTokenStream stream_finl=new RewriteRuleTokenStream(adaptor,"token finl",finl);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1467:5: -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:8: ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_state, st, "state["+Integer.toString(st.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:89: ( $init)?
				if ( stream_init.hasNext() ) {
					adaptor.addChild(root_1, stream_init.nextNode());
				}
				stream_init.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:96: ( $com)?
				if ( stream_com.hasNext() ) {
					adaptor.addChild(root_1, stream_com.nextNode());
				}
				stream_com.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:102: ( $finl)?
				if ( stream_finl.hasNext() ) {
					adaptor.addChild(root_1, stream_finl.nextNode());
				}
				stream_finl.reset();

				adaptor.addChild(root_1, stream_i.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:112: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.behaviorState,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorState"


	public static class transitions_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "transitions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1472:1: transitions : t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) ;
	public final BLESS3Parser.transitions_return transitions() throws RecognitionException {
		BLESS3Parser.transitions_return retval = new BLESS3Parser.transitions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token t=null;
		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		BAST t_tree=null;
		RewriteRuleTokenStream stream_LITERAL_transitions=new RewriteRuleTokenStream(adaptor,"token LITERAL_transitions");
		RewriteRuleSubtreeStream stream_behaviorTransition=new RewriteRuleSubtreeStream(adaptor,"rule behaviorTransition");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1473:3: (t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:3: t= LITERAL_transitions (bt+= behaviorTransition )+
			{
			t=(Token)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions9519); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(t);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:27: (bt+= behaviorTransition )+
			int cnt158=0;
			loop158:
			while (true) {
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==ID) ) {
					alt158=1;
				}

				switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:27: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions9523);
					bt=behaviorTransition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorTransition.add(bt.getTree());
					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTree());
					}
					break;

				default :
					if ( cnt158 >= 1 ) break loop158;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(158, input);
					throw eee;
				}
				cnt158++;
			}

			// AST REWRITE
			// elements: bt, LITERAL_transitions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: bt
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_bt=new RewriteRuleSubtreeStream(adaptor,"token bt",list_bt);
			root_0 = (BAST)adaptor.nil();
			// 1475:5: -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:8: ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_transitions, t, "transitions["+Integer.toString(t.getLine()+startingLine)+"]"), root_1);
				if ( !(stream_bt.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bt.hasNext() ) {
					adaptor.addChild(root_1, stream_bt.nextTree());
				}
				stream_bt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); Dump.it("If you get \"mismatched input"+
			      " '<<' expecting 'transitions'\" then you might have put a semicolon "+
			      "between an action and a Assertion, instead of afterwards.");
			    tellBNF(GrammarStrings.transitions,re,retval.tree);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transitions"


	public static class behaviorTransition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorTransition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:1: behaviorTransition : id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) ;
	public final BLESS3Parser.behaviorTransition_return behaviorTransition() throws RecognitionException {
		BLESS3Parser.behaviorTransition_return retval = new BLESS3Parser.behaviorTransition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token x=null;
		Token semi=null;
		Token COLON294=null;
		Token COMMA295=null;
		Token RCON296=null;
		Token LCURLY297=null;
		Token RCURLY298=null;
		Token EMPTY_CURLY299=null;
		List<Object> list_ssi=null;
		ParserRuleReturnScope pr =null;
		ParserRuleReturnScope bc =null;
		ParserRuleReturnScope dsi =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope q =null;
		RuleReturnScope ssi = null;
		BAST id_tree=null;
		BAST x_tree=null;
		BAST semi_tree=null;
		BAST COLON294_tree=null;
		BAST COMMA295_tree=null;
		BAST RCON296_tree=null;
		BAST LCURLY297_tree=null;
		BAST RCURLY298_tree=null;
		BAST EMPTY_CURLY299_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_EMPTY_CURLY=new RewriteRuleTokenStream(adaptor,"token EMPTY_CURLY");
		RewriteRuleTokenStream stream_LCON=new RewriteRuleTokenStream(adaptor,"token LCON");
		RewriteRuleTokenStream stream_RCON=new RewriteRuleTokenStream(adaptor,"token RCON");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_behaviorCondition=new RewriteRuleSubtreeStream(adaptor,"rule behaviorCondition");
		RewriteRuleSubtreeStream stream_behaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule behaviorActions");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_priority=new RewriteRuleSubtreeStream(adaptor,"rule priority");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:3: (id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1485:4: id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_behaviorTransition9568); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1485:12: (pr= priority )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==LBRACKET) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1485:12: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition9572);
					pr=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_priority.add(pr.getTree());
					}
					break;

			}

			COLON294=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorTransition9575); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON294);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9583);
			ssi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
			if (list_ssi==null) list_ssi=new ArrayList<Object>();
			list_ssi.add(ssi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1486:36: ( COMMA ssi+= identifier )*
			loop160:
			while (true) {
				int alt160=2;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==COMMA) ) {
					alt160=1;
				}

				switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1486:38: COMMA ssi+= identifier
					{
					COMMA295=(Token)match(input,COMMA,FOLLOW_COMMA_in_behaviorTransition9587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA295);

					pushFollow(FOLLOW_identifier_in_behaviorTransition9592);
					ssi=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi.getTree());
					}
					break;

				default :
					break loop160;
				}
			}

			x=(Token)match(input,LCON,FOLLOW_LCON_in_behaviorTransition9601); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCON.add(x);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1487:12: (bc= behaviorCondition )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==AADL_STRING_LITERAL||LA161_0==ID||LA161_0==LBRACKET||LA161_0==LITERAL_abs||LA161_0==LITERAL_all||LA161_0==LITERAL_exists||LA161_0==LITERAL_false||(LA161_0 >= LITERAL_not && LA161_0 <= LITERAL_now)||(LA161_0 >= LITERAL_null && LA161_0 <= LITERAL_numberof)||LA161_0==LITERAL_on||LA161_0==LITERAL_product||LA161_0==LITERAL_round||LA161_0==LITERAL_self||LA161_0==LITERAL_sum||LA161_0==LITERAL_timeout||LA161_0==LITERAL_tops||(LA161_0 >= LITERAL_true && LA161_0 <= LITERAL_truncate)||LA161_0==LPAREN||LA161_0==MINUS||LA161_0==NUMBER||LA161_0==OCTOTHORPE||(LA161_0 >= QCLREF && LA161_0 <= QCREF)) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1487:12: bc= behaviorCondition
					{
					pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition9605);
					bc=behaviorCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorCondition.add(bc.getTree());
					}
					break;

			}

			RCON296=(Token)match(input,RCON,FOLLOW_RCON_in_behaviorTransition9608); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCON.add(RCON296);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9615);
			dsi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dsi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1489:3: ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY )
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==LCURLY) ) {
				alt162=1;
			}
			else if ( (LA162_0==EMPTY_CURLY) ) {
				alt162=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 162, 0, input);
				throw nvae;
			}

			switch (alt162) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1489:5: LCURLY s= behaviorActions RCURLY
					{
					LCURLY297=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behaviorTransition9622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY297);

					pushFollow(FOLLOW_behaviorActions_in_behaviorTransition9626);
					s=behaviorActions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorActions.add(s.getTree());
					RCURLY298=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_behaviorTransition9628); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY298);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1489:39: EMPTY_CURLY
					{
					EMPTY_CURLY299=(Token)match(input,EMPTY_CURLY,FOLLOW_EMPTY_CURLY_in_behaviorTransition9632); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EMPTY_CURLY.add(EMPTY_CURLY299);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1490:4: (q= assertion )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==LASS) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1490:4: q= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorTransition9640);
					q=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(q.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1490:20: (semi= SEMICOLON )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==SEMICOLON) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1490:20: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorTransition9645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: dsi, id, q, pr, bc, ssi, s
			// token labels: id
			// rule labels: q, bc, pr, s, dsi, retval
			// token list labels: 
			// rule list labels: ssi
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.getTree():null);
			RewriteRuleSubtreeStream stream_bc=new RewriteRuleSubtreeStream(adaptor,"rule bc",bc!=null?bc.getTree():null);
			RewriteRuleSubtreeStream stream_pr=new RewriteRuleSubtreeStream(adaptor,"rule pr",pr!=null?pr.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_dsi=new RewriteRuleSubtreeStream(adaptor,"rule dsi",dsi!=null?dsi.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ssi=new RewriteRuleSubtreeStream(adaptor,"token ssi",list_ssi);
			root_0 = (BAST)adaptor.nil();
			// 1491:5: -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:7: ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(TRANSITION, x, "TRANSITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:7: ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, x, "LABEL["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:82: ( $pr)?
				if ( stream_pr.hasNext() ) {
					adaptor.addChild(root_2, stream_pr.nextTree());
				}
				stream_pr.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1494:7: ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(SOURCE, x, "SOURCE["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				if ( !(stream_ssi.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ssi.hasNext() ) {
					adaptor.addChild(root_2, stream_ssi.nextTree());
				}
				stream_ssi.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1495:7: ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITION, x, "CONDITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1495:86: ( $bc)?
				if ( stream_bc.hasNext() ) {
					adaptor.addChild(root_2, stream_bc.nextTree());
				}
				stream_bc.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1496:7: ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(DESTINATION, x, "DESTINATION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_dsi.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:7: ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, x, "ACTION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:80: ( $s)?
				if ( stream_s.hasNext() ) {
					adaptor.addChild(root_2, stream_s.nextTree());
				}
				stream_s.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:7: ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, semi, "Q["+Integer.toString(semi.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:76: ( $q)?
				if ( stream_q.hasNext() ) {
					adaptor.addChild(root_2, stream_q.nextTree());
				}
				stream_q.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {

			    Dump.it("\nDo you have either behavior actions or empty curly brackets?");
			    Dump.it("Is there a space between your empty curly brackets?\nYou stink!  Take a bath.\n");
			    Dump.it("Is your execute condition grammatically-correct? ");
			    tellBNF(GrammarStrings.behaviorTransition,re,retval.tree);
			    Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree());
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTransition"


	public static class priority_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "priority"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1510:1: priority : LBRACKET ^ NUMBER RBRACKET ;
	public final BLESS3Parser.priority_return priority() throws RecognitionException {
		BLESS3Parser.priority_return retval = new BLESS3Parser.priority_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET300=null;
		Token NUMBER301=null;
		Token RBRACKET302=null;

		BAST LBRACKET300_tree=null;
		BAST NUMBER301_tree=null;
		BAST RBRACKET302_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1510:9: ( LBRACKET ^ NUMBER RBRACKET )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1511:2: LBRACKET ^ NUMBER RBRACKET
			{
			root_0 = (BAST)adaptor.nil();


			LBRACKET300=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_priority9807); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACKET300_tree = (BAST)adaptor.create(LBRACKET300);
			root_0 = (BAST)adaptor.becomeRoot(LBRACKET300_tree, root_0);
			}

			NUMBER301=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_priority9810); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER301_tree = (BAST)adaptor.create(NUMBER301);
			adaptor.addChild(root_0, NUMBER301_tree);
			}

			RBRACKET302=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_priority9812); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RBRACKET302_tree = (BAST)adaptor.create(RBRACKET302);
			adaptor.addChild(root_0, RBRACKET302_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "priority"


	public static class behaviorCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1514:1: behaviorCondition : ( dispatchCondition | executeCondition | modeCondition | internalCondition );
	public final BLESS3Parser.behaviorCondition_return behaviorCondition() throws RecognitionException {
		BLESS3Parser.behaviorCondition_return retval = new BLESS3Parser.behaviorCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope dispatchCondition303 =null;
		ParserRuleReturnScope executeCondition304 =null;
		ParserRuleReturnScope modeCondition305 =null;
		ParserRuleReturnScope internalCondition306 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1515:3: ( dispatchCondition | executeCondition | modeCondition | internalCondition )
			int alt165=4;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==LITERAL_on) ) {
				switch ( input.LA(2) ) {
				case LITERAL_dispatch:
					{
					alt165=1;
					}
					break;
				case LITERAL_internal:
					{
					alt165=4;
					}
					break;
				case LPAREN:
				case TRIGGER:
					{
					alt165=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 165, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA165_0==AADL_STRING_LITERAL||LA165_0==ID||LA165_0==LBRACKET||LA165_0==LITERAL_abs||LA165_0==LITERAL_all||LA165_0==LITERAL_exists||LA165_0==LITERAL_false||(LA165_0 >= LITERAL_not && LA165_0 <= LITERAL_now)||(LA165_0 >= LITERAL_null && LA165_0 <= LITERAL_numberof)||LA165_0==LITERAL_product||LA165_0==LITERAL_round||LA165_0==LITERAL_self||LA165_0==LITERAL_sum||LA165_0==LITERAL_timeout||LA165_0==LITERAL_tops||(LA165_0 >= LITERAL_true && LA165_0 <= LITERAL_truncate)||LA165_0==LPAREN||LA165_0==MINUS||LA165_0==NUMBER||LA165_0==OCTOTHORPE||(LA165_0 >= QCLREF && LA165_0 <= QCREF)) ) {
				alt165=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1516:3: dispatchCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition9827);
					dispatchCondition303=dispatchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchCondition303.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1516:23: executeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_executeCondition_in_behaviorCondition9831);
					executeCondition304=executeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, executeCondition304.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1516:42: modeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeCondition_in_behaviorCondition9835);
					modeCondition305=modeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modeCondition305.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1516:58: internalCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_internalCondition_in_behaviorCondition9839);
					internalCondition306=internalCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, internalCondition306.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "behaviorCondition"


	public static class dispatchCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:1: dispatchCondition : LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? ;
	public final BLESS3Parser.dispatchCondition_return dispatchCondition() throws RecognitionException {
		BLESS3Parser.dispatchCondition_return retval = new BLESS3Parser.dispatchCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on307=null;
		Token LITERAL_dispatch308=null;
		ParserRuleReturnScope de =null;

		BAST LITERAL_on307_tree=null;
		BAST LITERAL_dispatch308_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:18: ( LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:3: LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on307=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_dispatchCondition9851); if (state.failed) return retval;
			LITERAL_dispatch308=(Token)match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition9854); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_dispatch308_tree = (BAST)adaptor.create(LITERAL_dispatch308);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_dispatch308_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:35: (de= dispatchExpression )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==ID||LA166_0==LITERAL_timeout) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:35: de= dispatchExpression
					{
					pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition9859);
					de=dispatchExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, de.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "dispatchCondition"


	public static class dispatchExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1525:1: dispatchExpression :dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? ;
	public final BLESS3Parser.dispatchExpression_return dispatchExpression() throws RecognitionException {
		BLESS3Parser.dispatchExpression_return retval = new BLESS3Parser.dispatchExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or309=null;
		Token LITERAL_or310=null;
		List<Object> list_dc=null;
		RuleReturnScope dc = null;
		BAST LITERAL_or309_tree=null;
		BAST LITERAL_or310_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1525:19: (dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1526:3: dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression9877);
			dc=dispatchConjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

			if (list_dc==null) list_dc=new ArrayList<Object>();
			list_dc.add(dc.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1526:27: ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==LITERAL_or) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1526:29: LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )*
					{
					LITERAL_or309=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression9881); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or309_tree = (BAST)adaptor.create(LITERAL_or309);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or309_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression9886);
					dc=dispatchConjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

					if (list_dc==null) list_dc=new ArrayList<Object>();
					list_dc.add(dc.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:4: ( LITERAL_or !dc+= dispatchConjunction )*
					loop167:
					while (true) {
						int alt167=2;
						int LA167_0 = input.LA(1);
						if ( (LA167_0==LITERAL_or) ) {
							alt167=1;
						}

						switch (alt167) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:6: LITERAL_or !dc+= dispatchConjunction
							{
							LITERAL_or310=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression9894); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression9899);
							dc=dispatchConjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTree());
							}
							break;

						default :
							break loop167;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "dispatchExpression"


	public static class dispatchConjunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchConjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1532:1: dispatchConjunction :trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? ;
	public final BLESS3Parser.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		BLESS3Parser.dispatchConjunction_return retval = new BLESS3Parser.dispatchConjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and311=null;
		Token LITERAL_and312=null;
		List<Object> list_trigger=null;
		RuleReturnScope trigger = null;
		BAST LITERAL_and311_tree=null;
		BAST LITERAL_and312_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1532:20: (trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1533:3: trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction9922);
			trigger=dispatchTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

			if (list_trigger==null) list_trigger=new ArrayList<Object>();
			list_trigger.add(trigger.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:5: ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==LITERAL_and) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:7: LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )*
					{
					LITERAL_and311=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction9931); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and311_tree = (BAST)adaptor.create(LITERAL_and311);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and311_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction9936);
					trigger=dispatchTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

					if (list_trigger==null) list_trigger=new ArrayList<Object>();
					list_trigger.add(trigger.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1535:6: ( LITERAL_and !trigger+= dispatchTrigger )*
					loop169:
					while (true) {
						int alt169=2;
						int LA169_0 = input.LA(1);
						if ( (LA169_0==LITERAL_and) ) {
							alt169=1;
						}

						switch (alt169) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1535:8: LITERAL_and !trigger+= dispatchTrigger
							{
							LITERAL_and312=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction9946); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction9951);
							trigger=dispatchTrigger();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

							if (list_trigger==null) list_trigger=new ArrayList<Object>();
							list_trigger.add(trigger.getTree());
							}
							break;

						default :
							break loop169;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "dispatchConjunction"


	public static class dispatchTrigger_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1538:1: dispatchTrigger : (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )? );
	public final BLESS3Parser.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		BLESS3Parser.dispatchTrigger_return retval = new BLESS3Parser.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout313=null;
		Token LPAREN314=null;
		Token LITERAL_or315=null;
		Token RPAREN316=null;
		Token ports=null;
		List<Object> list_ports=null;
		ParserRuleReturnScope port =null;
		ParserRuleReturnScope time =null;

		BAST LITERAL_timeout313_tree=null;
		BAST LPAREN314_tree=null;
		BAST LITERAL_or315_tree=null;
		BAST RPAREN316_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1538:16: (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )? )
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==ID) ) {
				alt174=1;
			}
			else if ( (LA174_0==LITERAL_timeout) ) {
				alt174=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 174, 0, input);
				throw nvae;
			}

			switch (alt174) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1539:3: port= portName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portName_in_dispatchTrigger9969);
					port=portName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, port.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:5: LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )?
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout313=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger9977); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout313_tree = (BAST)adaptor.create(LITERAL_timeout313);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_timeout313_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:4: ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )?
					int alt173=2;
					int LA173_0 = input.LA(1);
					if ( (LA173_0==ID||LA173_0==LITERAL_self||LA173_0==LPAREN||LA173_0==NUMBER||LA173_0==OCTOTHORPE||(LA173_0 >= QCLREF && LA173_0 <= QCREF)) ) {
						alt173=1;
					}
					switch (alt173) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )?
							int alt172=2;
							alt172 = dfa172.predict(input);
							switch (alt172) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:8: LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN
									{
									LPAREN314=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger9988); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LPAREN314_tree = (BAST)adaptor.create(LPAREN314);
									root_0 = (BAST)adaptor.becomeRoot(LPAREN314_tree, root_0);
									}

									ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger9993); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ports_tree = (BAST)adaptor.create(ports);
									adaptor.addChild(root_0, ports_tree);
									}

									if (list_ports==null) list_ports=new ArrayList<Object>();
									list_ports.add(ports);
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1542:9: ( LITERAL_or !ports+= ID )*
									loop171:
									while (true) {
										int alt171=2;
										int LA171_0 = input.LA(1);
										if ( (LA171_0==LITERAL_or) ) {
											alt171=1;
										}

										switch (alt171) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1542:10: LITERAL_or !ports+= ID
											{
											LITERAL_or315=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchTrigger10005); if (state.failed) return retval;
											ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10010); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ports_tree = (BAST)adaptor.create(ports);
											adaptor.addChild(root_0, ports_tree);
											}

											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop171;
										}
									}

									RPAREN316=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dispatchTrigger10024); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									RPAREN316_tree = (BAST)adaptor.create(RPAREN316);
									adaptor.addChild(root_0, RPAREN316_tree);
									}

									}
									break;

							}

							pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10042);
							time=behaviorTime();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, time.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "dispatchTrigger"


	public static class portName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "portName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:1: portName : port= ID ^ ( '[' index= NUMBER ']' )? ;
	public final BLESS3Parser.portName_return portName() throws RecognitionException {
		BLESS3Parser.portName_return retval = new BLESS3Parser.portName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token port=null;
		Token index=null;
		Token char_literal317=null;
		Token char_literal318=null;

		BAST port_tree=null;
		BAST index_tree=null;
		BAST char_literal317_tree=null;
		BAST char_literal318_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:9: (port= ID ^ ( '[' index= NUMBER ']' )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1550:3: port= ID ^ ( '[' index= NUMBER ']' )?
			{
			root_0 = (BAST)adaptor.nil();


			port=(Token)match(input,ID,FOLLOW_ID_in_portName10063); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			port_tree = (BAST)adaptor.create(port);
			root_0 = (BAST)adaptor.becomeRoot(port_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1551:3: ( '[' index= NUMBER ']' )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==LBRACKET) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1551:5: '[' index= NUMBER ']'
					{
					char_literal317=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_portName10071); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal317_tree = (BAST)adaptor.create(char_literal317);
					adaptor.addChild(root_0, char_literal317_tree);
					}

					index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_portName10075); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					index_tree = (BAST)adaptor.create(index);
					adaptor.addChild(root_0, index_tree);
					}

					char_literal318=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_portName10077); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal318_tree = (BAST)adaptor.create(char_literal318);
					adaptor.addChild(root_0, char_literal318_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "portName"


	public static class executeCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "executeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1554:1: executeCondition : expression ;
	public final BLESS3Parser.executeCondition_return executeCondition() throws RecognitionException {
		BLESS3Parser.executeCondition_return retval = new BLESS3Parser.executeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression319 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1554:17: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1555:15: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_executeCondition10092);
			expression319=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression319.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "executeCondition"


	public static class modeCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "modeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:1: modeCondition : LITERAL_on ^tle= triggerLogicalExpression ;
	public final BLESS3Parser.modeCondition_return modeCondition() throws RecognitionException {
		BLESS3Parser.modeCondition_return retval = new BLESS3Parser.modeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on320=null;
		ParserRuleReturnScope tle =null;

		BAST LITERAL_on320_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:14: ( LITERAL_on ^tle= triggerLogicalExpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:2: LITERAL_on ^tle= triggerLogicalExpression
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on320=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10103); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_on320_tree = (BAST)adaptor.create(LITERAL_on320);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_on320_tree, root_0);
			}

			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10108);
			tle=triggerLogicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tle.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "modeCondition"


	public static class triggerLogicalExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "triggerLogicalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:1: triggerLogicalExpression : first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first;
	public final BLESS3Parser.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		BLESS3Parser.triggerLogicalExpression_return retval = new BLESS3Parser.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_et=null;
		ParserRuleReturnScope first =null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;
		RuleReturnScope et = null;
		RewriteRuleSubtreeStream stream_logicalOperator=new RewriteRuleSubtreeStream(adaptor,"rule logicalOperator");
		RewriteRuleSubtreeStream stream_eventTrigger=new RewriteRuleSubtreeStream(adaptor,"rule eventTrigger");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:25: (first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1563:3: first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			{
			pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10121);
			first=eventTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_eventTrigger.add(first.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1563:22: (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==LITERAL_and||LA177_0==LITERAL_or||LA177_0==LITERAL_xor) ) {
				alt177=1;
			}
			switch (alt177) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1563:24: op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)*
					{
					pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10127);
					op1=logicalOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalOperator.add(op1.getTree());
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10131);
					et=eventTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
					if (list_et==null) list_et=new ArrayList<Object>();
					list_et.add(et.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1564:5: (op2= logicalOperator et+= eventTrigger {...}?)*
					loop176:
					while (true) {
						int alt176=2;
						int LA176_0 = input.LA(1);
						if ( (LA176_0==LITERAL_and||LA176_0==LITERAL_or||LA176_0==LITERAL_xor) ) {
							alt176=1;
						}

						switch (alt176) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1564:6: op2= logicalOperator et+= eventTrigger {...}?
							{
							pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10141);
							op2=logicalOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicalOperator.add(op2.getTree());
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10145);
							et=eventTrigger();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTree());
							if ( !((op1==op2)) ) {
								if (state.backtracking>0) {state.failed=true; return retval;}
								throw new FailedPredicateException(input, "triggerLogicalExpression", "op1==op2");
							}
							}
							break;

						default :
							break loop176;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: et, first, op1, first
			// token labels: 
			// rule labels: op1, first, retval
			// token list labels: 
			// rule list labels: et
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_et=new RewriteRuleSubtreeStream(adaptor,"token et",list_et);
			root_0 = (BAST)adaptor.nil();
			// 1565:5: -> {op1!=null}? ^( $op1 $first ( $et)+ )
			if (op1!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:21: ^( $op1 $first ( $et)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_op1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_first.nextTree());
				if ( !(stream_et.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_et.hasNext() ) {
					adaptor.addChild(root_1, stream_et.nextTree());
				}
				stream_et.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1566:5: -> $first
			{
				adaptor.addChild(root_0, stream_first.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {

			    Dump.it("\nAll operators in trigger_logical_expression must be the same.");
			    reportError(re,(BAST)retval.getTree());
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerLogicalExpression"


	public static class logicalOperator_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "logicalOperator"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1573:1: logicalOperator : ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else );
	public final BLESS3Parser.logicalOperator_return logicalOperator() throws RecognitionException {
		BLESS3Parser.logicalOperator_return retval = new BLESS3Parser.logicalOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and321=null;
		Token LITERAL_or322=null;
		Token LITERAL_xor323=null;
		Token LITERAL_and324=null;
		Token LITERAL_then325=null;
		Token LITERAL_or326=null;
		Token LITERAL_else327=null;

		BAST LITERAL_and321_tree=null;
		BAST LITERAL_or322_tree=null;
		BAST LITERAL_xor323_tree=null;
		BAST LITERAL_and324_tree=null;
		BAST LITERAL_then325_tree=null;
		BAST LITERAL_or326_tree=null;
		BAST LITERAL_else327_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1574:3: ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else )
			int alt178=5;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				int LA178_1 = input.LA(2);
				if ( (LA178_1==LITERAL_then) ) {
					alt178=4;
				}
				else if ( (LA178_1==LPAREN||LA178_1==TRIGGER) ) {
					alt178=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 178, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_or:
				{
				int LA178_2 = input.LA(2);
				if ( (LA178_2==LITERAL_else) ) {
					alt178=5;
				}
				else if ( (LA178_2==LPAREN||LA178_2==TRIGGER) ) {
					alt178=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 178, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_xor:
				{
				alt178=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 178, 0, input);
				throw nvae;
			}
			switch (alt178) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1575:3: LITERAL_and
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and321=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and321_tree = (BAST)adaptor.create(LITERAL_and321);
					adaptor.addChild(root_0, LITERAL_and321_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1576:5: LITERAL_or
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or322=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10217); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or322_tree = (BAST)adaptor.create(LITERAL_or322);
					adaptor.addChild(root_0, LITERAL_or322_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1577:5: LITERAL_xor
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_xor323=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_logicalOperator10223); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor323_tree = (BAST)adaptor.create(LITERAL_xor323);
					adaptor.addChild(root_0, LITERAL_xor323_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1578:5: LITERAL_and ! LITERAL_then
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and324=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10229); if (state.failed) return retval;
					LITERAL_then325=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_logicalOperator10232); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then325_tree = (BAST)adaptor.create(LITERAL_then325);
					adaptor.addChild(root_0, LITERAL_then325_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1579:5: LITERAL_or ! LITERAL_else
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or326=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10238); if (state.failed) return retval;
					LITERAL_else327=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_logicalOperator10241); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else327_tree = (BAST)adaptor.create(LITERAL_else327);
					adaptor.addChild(root_0, LITERAL_else327_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "logicalOperator"


	public static class eventTrigger_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "eventTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:1: eventTrigger : (tr= TRIGGER | LPAREN ^ triggerLogicalExpression RPAREN );
	public final BLESS3Parser.eventTrigger_return eventTrigger() throws RecognitionException {
		BLESS3Parser.eventTrigger_return retval = new BLESS3Parser.eventTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token tr=null;
		Token LPAREN328=null;
		Token RPAREN330=null;
		ParserRuleReturnScope triggerLogicalExpression329 =null;

		BAST tr_tree=null;
		BAST LPAREN328_tree=null;
		BAST RPAREN330_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:13: (tr= TRIGGER | LPAREN ^ triggerLogicalExpression RPAREN )
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==TRIGGER) ) {
				alt179=1;
			}
			else if ( (LA179_0==LPAREN) ) {
				alt179=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}

			switch (alt179) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1583:3: tr= TRIGGER
					{
					root_0 = (BAST)adaptor.nil();


					tr=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_eventTrigger10256); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					tr_tree = (BAST)adaptor.create(tr);
					adaptor.addChild(root_0, tr_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1584:5: LPAREN ^ triggerLogicalExpression RPAREN
					{
					root_0 = (BAST)adaptor.nil();


					LPAREN328=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger10262); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN328_tree = (BAST)adaptor.create(LPAREN328);
					root_0 = (BAST)adaptor.becomeRoot(LPAREN328_tree, root_0);
					}

					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger10265);
					triggerLogicalExpression329=triggerLogicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, triggerLogicalExpression329.getTree());

					RPAREN330=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger10267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN330_tree = (BAST)adaptor.create(RPAREN330);
					adaptor.addChild(root_0, RPAREN330_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "eventTrigger"


	public static class internalCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "internalCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:1: internalCondition : LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* ;
	public final BLESS3Parser.internalCondition_return internalCondition() throws RecognitionException {
		BLESS3Parser.internalCondition_return retval = new BLESS3Parser.internalCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on331=null;
		Token LITERAL_internal332=null;
		Token LITERAL_or333=null;
		Token ports=null;
		List<Object> list_ports=null;

		BAST LITERAL_on331_tree=null;
		BAST LITERAL_internal332_tree=null;
		BAST LITERAL_or333_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:18: ( LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1588:2: LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )*
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on331=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_internalCondition10278); if (state.failed) return retval;
			LITERAL_internal332=(Token)match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10281); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_internal332_tree = (BAST)adaptor.create(LITERAL_internal332);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_internal332_tree, root_0);
			}

			ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10286); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ports_tree = (BAST)adaptor.create(ports);
			adaptor.addChild(root_0, ports_tree);
			}

			if (list_ports==null) list_ports=new ArrayList<Object>();
			list_ports.add(ports);
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1589:3: ( LITERAL_or !ports+= ID )*
			loop180:
			while (true) {
				int alt180=2;
				int LA180_0 = input.LA(1);
				if ( (LA180_0==LITERAL_or) ) {
					alt180=1;
				}

				switch (alt180) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1589:5: LITERAL_or !ports+= ID
					{
					LITERAL_or333=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_internalCondition10293); if (state.failed) return retval;
					ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10298); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ports_tree = (BAST)adaptor.create(ports);
					adaptor.addChild(root_0, ports_tree);
					}

					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					break loop180;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
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
	// $ANTLR end "internalCondition"

	// $ANTLR start synpred1_BLESS3
	public final void synpred1_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:3: ( LPAREN LITERAL_if )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:4: LPAREN LITERAL_if
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_BLESS35940); if (state.failed) return;

		match(input,LITERAL_if,FOLLOW_LITERAL_if_in_synpred1_BLESS35942); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_BLESS3

	// $ANTLR start synpred2_BLESS3
	public final void synpred2_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:5: ( LBRACKET ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:6: LBRACKET ID COLON
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred2_BLESS35960); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred2_BLESS35962); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred2_BLESS35964); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_BLESS3

	// $ANTLR start synpred3_BLESS3
	public final void synpred3_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:991:5: ( ID LPAREN )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:991:6: ID LPAREN
		{
		match(input,ID,FOLLOW_ID_in_synpred3_BLESS35976); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_BLESS35978); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_BLESS3

	// Delegated rules

	public final boolean synpred1_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA172 dfa172 = new DFA172(this);
	static final String DFA172_eotS =
		"\12\uffff";
	static final String DFA172_eofS =
		"\12\uffff";
	static final String DFA172_minS =
		"\1\76\1\4\1\uffff\1\10\1\4\1\76\1\10\1\uffff\1\4\1\10";
	static final String DFA172_maxS =
		"\2\u0103\1\uffff\1\u011a\1\u0103\1\u0109\1\u011a\1\uffff\1\u0103\1\u011a";
	static final String DFA172_acceptS =
		"\2\uffff\1\2\4\uffff\1\1\2\uffff";
	static final String DFA172_specialS =
		"\12\uffff}>";
	static final String[] DFA172_transitionS = {
			"\1\2\u0080\uffff\1\2\51\uffff\1\1\6\uffff\1\2\1\uffff\1\2\17\uffff\2"+
			"\2",
			"\1\2\71\uffff\1\3\15\uffff\1\2\13\uffff\1\2\1\uffff\1\2\15\uffff\1\2"+
			"\23\uffff\1\2\2\uffff\1\2\40\uffff\2\2\1\uffff\2\2\11\uffff\1\2\15\uffff"+
			"\1\2\2\uffff\1\2\14\uffff\1\2\6\uffff\1\2\1\uffff\1\2\2\uffff\2\2\17"+
			"\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\17\uffff\2\2",
			"",
			"\2\2\11\uffff\1\2\10\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\4\uffff\1\2\20\uffff\1\2\16\uffff\1\2\33\uffff\1\2\26\uffff\1\2\1\uffff"+
			"\2\2\11\uffff\1\2\13\uffff\1\4\17\uffff\1\2\60\uffff\3\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\11\uffff\1\2\1\uffff"+
			"\1\2\7\uffff\1\5\11\uffff\1\2\1\uffff\1\2",
			"\1\2\71\uffff\1\6\15\uffff\1\2\13\uffff\1\2\40\uffff\1\2\5\uffff\1\2"+
			"\40\uffff\2\2\1\uffff\1\2\30\uffff\1\2\2\uffff\1\2\23\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\2\2\17\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\17"+
			"\uffff\2\2",
			"\1\7\34\uffff\1\2\113\uffff\1\2\27\uffff\1\7\51\uffff\1\7\6\uffff\1"+
			"\7\1\uffff\1\7\17\uffff\2\7\5\uffff\1\2",
			"\2\2\11\uffff\1\2\10\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\4\uffff\1\2\20\uffff\1\2\16\uffff\1\2\33\uffff\1\2\26\uffff\1\2\1\uffff"+
			"\2\2\11\uffff\1\2\13\uffff\1\10\17\uffff\1\2\61\uffff\2\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\11\uffff\1\2\1\uffff"+
			"\1\2\7\uffff\1\5\11\uffff\1\2\1\uffff\1\2",
			"",
			"\1\2\71\uffff\1\11\15\uffff\1\2\13\uffff\1\2\46\uffff\1\2\40\uffff\2"+
			"\2\1\uffff\1\2\30\uffff\1\2\2\uffff\1\2\23\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\17\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\17\uffff\2\2",
			"\2\2\11\uffff\1\2\10\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\4\uffff\1\2\20\uffff\1\2\16\uffff\1\2\33\uffff\1\2\26\uffff\1\2\1\uffff"+
			"\2\2\11\uffff\1\2\13\uffff\1\10\17\uffff\1\2\61\uffff\2\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\11\uffff\1\2\1\uffff"+
			"\1\2\7\uffff\1\5\11\uffff\1\2\1\uffff\1\2"
	};

	static final short[] DFA172_eot = DFA.unpackEncodedString(DFA172_eotS);
	static final short[] DFA172_eof = DFA.unpackEncodedString(DFA172_eofS);
	static final char[] DFA172_min = DFA.unpackEncodedStringToUnsignedChars(DFA172_minS);
	static final char[] DFA172_max = DFA.unpackEncodedStringToUnsignedChars(DFA172_maxS);
	static final short[] DFA172_accept = DFA.unpackEncodedString(DFA172_acceptS);
	static final short[] DFA172_special = DFA.unpackEncodedString(DFA172_specialS);
	static final short[][] DFA172_transition;

	static {
		int numStates = DFA172_transitionS.length;
		DFA172_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA172_transition[i] = DFA.unpackEncodedString(DFA172_transitionS[i]);
		}
	}

	protected class DFA172 extends DFA {

		public DFA172(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 172;
			this.eot = DFA172_eot;
			this.eof = DFA172_eof;
			this.min = DFA172_min;
			this.max = DFA172_max;
			this.accept = DFA172_accept;
			this.special = DFA172_special;
			this.transition = DFA172_transition;
		}
		@Override
		public String getDescription() {
			return "1541:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )?";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier2644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitDeclaration_in_unitLibrary2671 = new BitSet(new long[]{0x4000020000000002L,0x4000000400000000L});
	public static final BitSet FOLLOW_LT_in_unitName2710 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2715 = new BitSet(new long[]{0x4800000000000000L});
	public static final BitSet FOLLOW_GT_in_unitName2719 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula2758 = new BitSet(new long[]{0x4000020000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2765 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2769 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2807 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2811 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration2844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration2848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration2867 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration2879 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration2883 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_rootDeclaration2886 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration2893 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration2897 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_rootDeclaration2900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension2950 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitExtension2955 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension2959 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_unitExtension2962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor2996 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_unitName_in_unitFactor3000 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_mulDiv_in_unitFactor3004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor3008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary3048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration3061 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration3066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_is_in_typeDeclaration3068 = new BitSet(new long[]{0x0000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_type_in_typeDeclaration3073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationType_in_type3085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type3091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type3097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type3103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type3109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type3115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type3121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference3133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference3139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType3152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_enumerationType3155 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationType3160 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_enumerationType3163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType3179 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_ID_in_quantityType3189 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType3195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType3201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_quantityType3209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_aNumber_in_quantityType3214 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType3218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_aNumber_in_quantityType3223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_quantityType3225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType3235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_aNumber_in_quantityType3240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType3255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType3260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType3279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayType3282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType3287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayType3289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType3292 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType3296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3312 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3321 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3330 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3350 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005000000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_recordType3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_recordType3389 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_recordField_in_recordType3394 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_recordType3397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_recordField3415 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_recordField3417 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField3422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary3442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary3451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables3484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_variables_in_ghostVariables3487 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables3492 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable3505 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_ghostVariable3511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_TILDE_in_ghostVariable3513 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable3518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namedAssertion3533 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3539 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3541 = new BitSet(new long[]{0x4000000020000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion3554 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3572 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_namedAssertion3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion3597 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion3601 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namedAssertion3603 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion3608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion3637 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion3645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RASS_in_namedAssertion3653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_predicate3985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableList3996 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList4000 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList4005 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList4009 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList4014 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ID_in_variable4032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_TILDE_in_variable4034 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_variable4039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue4050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue4056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_conditionalAssertionFunction4069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction4073 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_COMMA_in_conditionalAssertionFunction4077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction4081 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_conditionalAssertionFunction4086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionValuePair4114 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair4117 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair4119 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_conditionValuePair4122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration4138 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration4142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration4169 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4173 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration4179 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4183 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration4187 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4191 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ID_in_enumerationPair4251 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARROW_in_enumerationPair4253 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_enumerationPair4256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessAssertion4268 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion4272 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RASS_in_namelessAssertion4274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessFunction4303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction4307 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction4311 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namelessFunction4313 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction4317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RASS_in_namelessFunction4319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessEnumeration4359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_namelessEnumeration4363 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_RASS_in_namelessEnumeration4369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_invocation4396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_invocation4398 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000400CL});
	public static final BitSet FOLLOW_actualParameter_in_invocation4408 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_COMMA_in_invocation4412 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4416 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_expression_in_invocation4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_invocation4435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_actualParameter4470 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_actualParameter4472 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_actualParameter4477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion4489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion4495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion4501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion4507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression4525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression4533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression4541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression4549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression4557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disjunction_in_expression4565 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000014000L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression4570 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression4575 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_disjunction_in_expression4581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification4597 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification4601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalQuantification4612 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_range_in_universalQuantification4616 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_universalQuantification4622 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4626 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification4637 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification4737 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification4741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_in_in_existentialQuantification4752 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_range_in_existentialQuantification4756 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification4762 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4766 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_existentialQuantification4777 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification4877 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_sumQuantification4892 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_range_in_sumQuantification4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_sumQuantification4902 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_sumQuantification4906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification4917 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_sumQuantification4921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification5017 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification5021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_productQuantification5032 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_range_in_productQuantification5036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_productQuantification5042 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_productQuantification5046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification5057 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_productQuantification5061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification5157 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification5161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_countingQuantification5172 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_range_in_countingQuantification5176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_which_in_countingQuantification5182 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_predicate_in_countingQuantification5186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification5197 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_countingQuantification5201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_logicVariables5297 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5301 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5306 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5310 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5315 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5354 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_conjunction_in_disjunction5359 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5363 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_conjunction_in_disjunction5368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5389 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5392 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_conjunction_in_disjunction5397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5401 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5404 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_conjunction_in_disjunction5409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5430 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_conjunction_in_disjunction5435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5439 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_conjunction_in_disjunction5444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_relation_in_conjunction5468 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5478 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_relation_in_conjunction5483 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5487 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_relation_in_conjunction5492 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5510 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_relation_in_conjunction5515 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5522 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_relation_in_conjunction5527 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_addSub_in_relation5548 = new BitSet(new long[]{0x0810000000000302L,0x0000000000000000L,0x0000000000020000L,0x0408840000000000L});
	public static final BitSet FOLLOW_relation_symbol_in_relation5558 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_addSub_in_relation5561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation5575 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_range_in_relation5578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_range5593 = new BitSet(new long[]{0x0000300300000000L});
	public static final BitSet FOLLOW_rangeSymbol_in_range5595 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_subexpression_in_range5598 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multDiv_in_addSub5629 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100200000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5641 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_multDiv_in_addSub5644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5648 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_multDiv_in_addSub5651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_MINUS_in_addSub5670 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_multDiv_in_addSub5673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5693 = new BitSet(new long[]{0x0000020000000002L,0x0080000000000000L,0x0080000008000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5705 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5712 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_dividers_in_multDiv5733 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5779 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5783 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryOperator_in_subexpression5806 = new BitSet(new long[]{0x4000000000000010L,0x8000000000001000L,0x8000000A00000000L,0x0005020001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_subexpression5844 = new BitSet(new long[]{0x4000000000000010L,0x8000000000001000L,0x8000000A00000000L,0x0005020001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5895 = new BitSet(new long[]{0x0000000010080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5903 = new BitSet(new long[]{0x4000000000000010L,0x8000000001001000L,0x9000000B00000000L,0x0005220003280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5918 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6001 = new BitSet(new long[]{0x4000000000000010L,0x9000010005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004010L});
	public static final BitSet FOLLOW_QQ_in_parenthesizedSubexpression6018 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6021 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_parenthesizedSubexpression6023 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_caseChoice6081 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_caseChoice6086 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6088 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_caseChoice6093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_caseChoice6095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression6111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_if_in_conditionalExpression6113 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conditionalExpression6119 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6123 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_conditionalExpression6125 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression6133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_recordTerm6179 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_recordTerm6183 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_recordTerm6185 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6189 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_recordTerm6192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_recordValue6228 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6230 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005000001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_value_in_recordValue6233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_recordValue6235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_periodShift6255 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005020001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_value_in_periodShift6268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift6282 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_indexExpression_in_periodShift6286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift6290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6370 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L,0x0080000008000000L,0x0100200000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6378 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6391 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6404 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6417 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6430 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6437 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6453 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6456 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6460 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6480 = new BitSet(new long[]{0x0000200000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6484 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6550 = new BitSet(new long[]{0x00000C0000000002L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_valueName6568 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_valueName6576 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6588 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6594 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6604 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6610 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_DOT_in_valueName6626 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6630 = new BitSet(new long[]{0x0000080000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_DOT_in_valueName6634 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6638 = new BitSet(new long[]{0x0000080000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6682 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6908 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6912 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6917 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6924 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6929 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6947 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6955 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6973 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6983 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName6989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6996 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000A00000000L,0x0005220001280000L,0x000000000000000CL});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName7000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName7002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_quantity_in_constant7050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant7058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant7066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant7074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant7082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7099 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000000L,0x2000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_ID_in_quantity7108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_299_in_quantity7110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QCLREF_in_aNumber7183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7202 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7213 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7230 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7241 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7262 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7274 = new BitSet(new long[]{0x0000080000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7289 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_propertyField7301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_propertyField7310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propertyField7318 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_propertyField7325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7357 = new BitSet(new long[]{0x0000000000000000L,0x0008000100004000L,0x0000180000200000L,0x0000000000020000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7364 = new BitSet(new long[]{0x0000000000000000L,0x0008000100004000L,0x0000180000200000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7372 = new BitSet(new long[]{0x0000000000000000L,0x0008000000004000L,0x0000180000200000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7387 = new BitSet(new long[]{0x0000000000000000L,0x0008000000004000L,0x0000080000200000L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7402 = new BitSet(new long[]{0x0000000000000000L,0x0008000000004000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7418 = new BitSet(new long[]{0x0000000000000000L,0x0008000000004000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7496 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_throwsClause7501 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7522 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime7543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_behaviorTime7555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause7568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause7571 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7584 = new BitSet(new long[]{0x4000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm7593 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm7598 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7604 = new BitSet(new long[]{0x4000000000000000L,0x0800000000000000L,0x000000000000001EL,0x0000000800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7622 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7625 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7639 = new BitSet(new long[]{0x0000000000040002L,0x0001000000000800L,0x0000000080000040L,0x0000000000000028L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7650 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7660 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7670 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7680 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration7690 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7704 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7708 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration7727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7837 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7850 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7859 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7883 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7888 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7892 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7896 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7921 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004000L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_action_in_assertedAction7930 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicAction_in_action8052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8128 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_basicAction8132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameTick_in_assignment8178 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8180 = new BitSet(new long[]{0x4000000000000010L,0x9000000015001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8195 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8201 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8205 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8209 = new BitSet(new long[]{0x0000000080040000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8213 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8217 = new BitSet(new long[]{0x0000000080040000L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8225 = new BitSet(new long[]{0x4000000000000010L,0x9000000015001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8231 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8235 = new BitSet(new long[]{0x4000000000000010L,0x9000000015001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8239 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8243 = new BitSet(new long[]{0x4000000000000010L,0x9000000015001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8247 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_nameTick8295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TICK_in_nameTick8299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8332 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_whenThrow8336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8340 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8344 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction8417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction8427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction8437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_subprogramCall8455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_subprogramCall8457 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000800000000L,0x0005020001000000L,0x000000000000400CL});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall8461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_subprogramCall8464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8495 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8499 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000800000000L,0x0005020001000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8502 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8506 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000800000000L,0x0005020001000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8509 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_ID_in_formalActual8531 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_formalActual8539 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x8000000800000000L,0x0005020001000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter8558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter8563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter8568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portOutput8584 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_EXCLAMATION_in_portOutput8586 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_portOutput8590 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_portOutput8594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_portOutput8596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portInput8642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_QUESTION_in_portInput8644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_portInput8646 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_valueName_in_portInput8651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_portInput8653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative8694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8702 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_BOX_in_alternative8708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8712 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_fi_in_alternative8720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_guardedAction8758 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_guardedAction8762 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction8764 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction8767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop8791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileLoop8797 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_whileLoop8802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_whileLoop8804 = new BitSet(new long[]{0x0000000000000000L,0x0008001000004000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_whileLoop8811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_whileLoop8815 = new BitSet(new long[]{0x0000000000000000L,0x0008001000004000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_whileLoop8824 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_whileLoop8829 = new BitSet(new long[]{0x0000000000000000L,0x0008000000004000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop8840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop8898 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifier_in_forLoop8905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop8910 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_forLoop8915 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_forLoop8917 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_forLoop8922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_forLoop8929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_forLoop8933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LCURLY_in_forLoop8940 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop8945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RCURLY_in_forLoop8947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9010 = new BitSet(new long[]{0x4000000000000000L,0x0908001000004800L,0x000000000020231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_doUntilLoop9017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9021 = new BitSet(new long[]{0x4000000000000000L,0x0908001000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_doUntilLoop9030 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9035 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_doUntilLoop9054 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_doUntilLoop9061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification9135 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification9141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification9143 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification9151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9176 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9185 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9190 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9194 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_universalLatticeQuantification9196 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000401B00000000L,0x0005220003281000L,0x000000000000000CL});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9200 = new BitSet(new long[]{0x0000000000000000L,0x0008000000004000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_issueException9261 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_issueException9265 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_issueException9276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9290 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L,0x0000000000200000L,0x0000000200800080L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L,0x0000000200800080L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9306 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000200800080L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9313 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800080L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9320 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection9384 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection9389 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection9401 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection9406 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_identifier_in_behaviorState9423 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorState9428 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L,0x0000000000080040L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState9433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState9439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState9445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState9451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_assertion_in_behaviorState9455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorState9458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions9519 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions9523 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9568 = new BitSet(new long[]{0x0000000020000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition9572 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorTransition9575 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9583 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_behaviorTransition9587 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9592 = new BitSet(new long[]{0x0000000080000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LCON_in_behaviorTransition9601 = new BitSet(new long[]{0x4000000000000010L,0x9000000005001000L,0x9000405B00000000L,0x0005220003281000L,0x000000000000020CL});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition9605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RCON_in_behaviorTransition9608 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9615 = new BitSet(new long[]{0x0004000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LCURLY_in_behaviorTransition9622 = new BitSet(new long[]{0x4000000000000000L,0x0908000000004800L,0x000000000000231EL,0x0000002800002014L,0x0000010000000000L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition9626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RCURLY_in_behaviorTransition9628 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_EMPTY_CURLY_in_behaviorTransition9632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition9640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorTransition9645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_priority9807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_priority9810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_priority9812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition9827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition9831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition9835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition9839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_dispatchCondition9851 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition9854 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition9859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression9877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression9881 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression9886 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression9894 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression9899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction9922 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction9931 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction9936 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction9946 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction9951 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger9969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger9977 = new BitSet(new long[]{0x4000000000000002L,0x0000000000000000L,0x8000000000000000L,0x0005020000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger9988 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger9993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchTrigger10005 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_dispatchTrigger10024 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x8000000000000000L,0x0005020000000000L,0x000000000000000CL});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10063 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_portName10071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_portName10075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_portName10077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_executeCondition10092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10121 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L,0x0000008000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10131 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L,0x0000008000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10145 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L,0x0000008000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_xor_in_logicalOperator10223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_then_in_logicalOperator10232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10238 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_logicalOperator10241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_eventTrigger10256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger10262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger10265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger10267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_internalCondition10278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10281 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_internalCondition10293 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10298 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred1_BLESS35940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_if_in_synpred1_BLESS35942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred2_BLESS35960 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred2_BLESS35962 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_synpred2_BLESS35964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred3_BLESS35976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred3_BLESS35978 = new BitSet(new long[]{0x0000000000000002L});
}
