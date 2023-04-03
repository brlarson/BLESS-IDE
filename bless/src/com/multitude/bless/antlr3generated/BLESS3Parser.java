// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g 2023-04-03 12:20:40

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
		"ASSIGN", "AT_SIGN", "BASE", "BASED_INTEGER", "BEHAVIOR_GUARD", "BI", 
		"BLESS_SUBCLAUSE", "BOUND", "BOX", "CARET", "COLON", "COLON_TILDE", "COMMA", 
		"COMMACOMMA", "COMMADOT", "COMPONENT", "CONDITION", "CONDITIONAL_ASSERTION_FUNCTION", 
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
		"LITERAL_base", "LITERAL_binding", "LITERAL_boolean", "LITERAL_bound", 
		"LITERAL_call", "LITERAL_calls", "LITERAL_case", "LITERAL_catch", "LITERAL_classifier", 
		"LITERAL_complete", "LITERAL_component", "LITERAL_computation", "LITERAL_connection", 
		"LITERAL_connections", "LITERAL_constant", "LITERAL_count", "LITERAL_declare", 
		"LITERAL_def", "LITERAL_delay", "LITERAL_dispatch", "LITERAL_div", "LITERAL_do", 
		"LITERAL_else", "LITERAL_enumeration", "LITERAL_exception", "LITERAL_exists", 
		"LITERAL_extends", "LITERAL_extension", "LITERAL_false", "LITERAL_feature", 
		"LITERAL_fetchadd", "LITERAL_fetchand", "LITERAL_fetchor", "LITERAL_fetchxor", 
		"LITERAL_fi", "LITERAL_final", "LITERAL_flow", "LITERAL_for", "LITERAL_forall", 
		"LITERAL_fresh", "LITERAL_ghost", "LITERAL_hr", "LITERAL_if", "LITERAL_iff", 
		"LITERAL_implementation", "LITERAL_implies", "LITERAL_in", "LITERAL_inherit", 
		"LITERAL_initial", "LITERAL_internal", "LITERAL_invariant", "LITERAL_inverse", 
		"LITERAL_is", "LITERAL_list", "LITERAL_lower_bound", "LITERAL_min", "LITERAL_mod", 
		"LITERAL_mode", "LITERAL_modes", "LITERAL_ms", "LITERAL_nonvolatile", 
		"LITERAL_not", "LITERAL_now", "LITERAL_ns", "LITERAL_null", "LITERAL_numberof", 
		"LITERAL_of", "LITERAL_on", "LITERAL_or", "LITERAL_package", "LITERAL_parameter", 
		"LITERAL_pause", "LITERAL_post", "LITERAL_pre", "LITERAL_private", "LITERAL_product", 
		"LITERAL_property", "LITERAL_provides", "LITERAL_ps", "LITERAL_public", 
		"LITERAL_quantity", "LITERAL_range", "LITERAL_record", "LITERAL_reference", 
		"LITERAL_rem", "LITERAL_renames", "LITERAL_representation", "LITERAL_requires", 
		"LITERAL_returns", "LITERAL_round", "LITERAL_scalar", "LITERAL_sec", "LITERAL_self", 
		"LITERAL_sequence", "LITERAL_set", "LITERAL_setmode", "LITERAL_shared", 
		"LITERAL_skip", "LITERAL_spread", "LITERAL_state", "LITERAL_states", "LITERAL_step", 
		"LITERAL_stop", "LITERAL_string", "LITERAL_subcomponents", "LITERAL_sum", 
		"LITERAL_swap", "LITERAL_that", "LITERAL_then", "LITERAL_throw", "LITERAL_throws", 
		"LITERAL_timeout", "LITERAL_to", "LITERAL_tops", "LITERAL_transition", 
		"LITERAL_transitions", "LITERAL_true", "LITERAL_truncate", "LITERAL_type", 
		"LITERAL_union", "LITERAL_units", "LITERAL_until", "LITERAL_updated", 
		"LITERAL_upper_bound", "LITERAL_us", "LITERAL_variables", "LITERAL_variant", 
		"LITERAL_when", "LITERAL_which", "LITERAL_while", "LITERAL_whole", "LITERAL_with", 
		"LITERAL_xor", "LPAREN", "LT", "LTE_STRING", "LT_STRING", "MINUS", "MT_STRING", 
		"NEQ", "NUMBER", "OBLIGATION", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETER", 
		"PARAMETERS", "PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", 
		"PORT_OUTPUT", "PREDICATE_RELATION", "PROCEDURE", "Q", "QCLREF", "QCREF", 
		"QQ", "QUANTITY", "QUESTION", "RASS", "RBRACKET", "RCON", "RCURLY", "REAL_LIT", 
		"RECORD_TERM", "ROOT_DECLARATION", "RPAREN", "S", "SEMICOLON", "SLCOMMENT", 
		"SOURCE", "START", "START_ASSERTION_PROPERTY", "STOP", "SUBPROGRAM_INVOCATION", 
		"TICK", "TILDE", "TIMES", "TOP", "TRANSITION", "TRIGGER", "TYPE", "TYPE_LIBRARY", 
		"TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", "UNIT_FORMULA", 
		"UNIT_LIBRARY", "UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", "VERT", 
		"WP", "WS", "'%'"
	};
	public static final int EOF=-1;
	public static final int T__294=294;
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
	public static final int BI=23;
	public static final int BLESS_SUBCLAUSE=24;
	public static final int BOUND=25;
	public static final int BOX=26;
	public static final int CARET=27;
	public static final int COLON=28;
	public static final int COLON_TILDE=29;
	public static final int COMMA=30;
	public static final int COMMACOMMA=31;
	public static final int COMMADOT=32;
	public static final int COMPONENT=33;
	public static final int CONDITION=34;
	public static final int CONDITIONAL_ASSERTION_FUNCTION=35;
	public static final int COUNTING_TRIGGER=36;
	public static final int CVP=37;
	public static final int DESTINATION=38;
	public static final int DIGIT=39;
	public static final int DIVIDE=40;
	public static final int DOLLAR=41;
	public static final int DOT=42;
	public static final int DOTCOMMA=43;
	public static final int DOTDOT=44;
	public static final int DOUBLE_COLON=45;
	public static final int DOUBLE_QUOTE=46;
	public static final int DO_NOT_PROVE=47;
	public static final int DUMMY=48;
	public static final int EMPTY_CURLY=49;
	public static final int END_ASSERTION_PROPERTY=50;
	public static final int EQ=51;
	public static final int EXCLAMATION=52;
	public static final int EXP=53;
	public static final int EXPONENT=54;
	public static final int EXTENDED_DIGIT=55;
	public static final int FLOATING=56;
	public static final int FUNCTION=57;
	public static final int GT=58;
	public static final int GUARD=59;
	public static final int HEX_DIGIT=60;
	public static final int ID=61;
	public static final int IMP=62;
	public static final int INMODE=63;
	public static final int INOUT=64;
	public static final int INTEGER_LIT=65;
	public static final int INT_EXPONENT=66;
	public static final int INVARIANT=67;
	public static final int INVOKE=68;
	public static final int INVOKE_FUNCTION=69;
	public static final int IP_NAME=70;
	public static final int IP_PE=71;
	public static final int IP_PRED=72;
	public static final int LABEL=73;
	public static final int LASS=74;
	public static final int LBRACKET=75;
	public static final int LCON=76;
	public static final int LCURLY=77;
	public static final int LITERAL_Assertion=78;
	public static final int LITERAL_Invariant=79;
	public static final int LITERAL_Postcondition=80;
	public static final int LITERAL_Precondition=81;
	public static final int LITERAL_Typed=82;
	public static final int LITERAL_aadlboolean=83;
	public static final int LITERAL_aadlinteger=84;
	public static final int LITERAL_aadlreal=85;
	public static final int LITERAL_aadlstring=86;
	public static final int LITERAL_abs=87;
	public static final int LITERAL_access=88;
	public static final int LITERAL_all=89;
	public static final int LITERAL_and=90;
	public static final int LITERAL_any=91;
	public static final int LITERAL_applies=92;
	public static final int LITERAL_are=93;
	public static final int LITERAL_array=94;
	public static final int LITERAL_assert=95;
	public static final int LITERAL_availability=96;
	public static final int LITERAL_base=97;
	public static final int LITERAL_binding=98;
	public static final int LITERAL_boolean=99;
	public static final int LITERAL_bound=100;
	public static final int LITERAL_call=101;
	public static final int LITERAL_calls=102;
	public static final int LITERAL_case=103;
	public static final int LITERAL_catch=104;
	public static final int LITERAL_classifier=105;
	public static final int LITERAL_complete=106;
	public static final int LITERAL_component=107;
	public static final int LITERAL_computation=108;
	public static final int LITERAL_connection=109;
	public static final int LITERAL_connections=110;
	public static final int LITERAL_constant=111;
	public static final int LITERAL_count=112;
	public static final int LITERAL_declare=113;
	public static final int LITERAL_def=114;
	public static final int LITERAL_delay=115;
	public static final int LITERAL_dispatch=116;
	public static final int LITERAL_div=117;
	public static final int LITERAL_do=118;
	public static final int LITERAL_else=119;
	public static final int LITERAL_enumeration=120;
	public static final int LITERAL_exception=121;
	public static final int LITERAL_exists=122;
	public static final int LITERAL_extends=123;
	public static final int LITERAL_extension=124;
	public static final int LITERAL_false=125;
	public static final int LITERAL_feature=126;
	public static final int LITERAL_fetchadd=127;
	public static final int LITERAL_fetchand=128;
	public static final int LITERAL_fetchor=129;
	public static final int LITERAL_fetchxor=130;
	public static final int LITERAL_fi=131;
	public static final int LITERAL_final=132;
	public static final int LITERAL_flow=133;
	public static final int LITERAL_for=134;
	public static final int LITERAL_forall=135;
	public static final int LITERAL_fresh=136;
	public static final int LITERAL_ghost=137;
	public static final int LITERAL_hr=138;
	public static final int LITERAL_if=139;
	public static final int LITERAL_iff=140;
	public static final int LITERAL_implementation=141;
	public static final int LITERAL_implies=142;
	public static final int LITERAL_in=143;
	public static final int LITERAL_inherit=144;
	public static final int LITERAL_initial=145;
	public static final int LITERAL_internal=146;
	public static final int LITERAL_invariant=147;
	public static final int LITERAL_inverse=148;
	public static final int LITERAL_is=149;
	public static final int LITERAL_list=150;
	public static final int LITERAL_lower_bound=151;
	public static final int LITERAL_min=152;
	public static final int LITERAL_mod=153;
	public static final int LITERAL_mode=154;
	public static final int LITERAL_modes=155;
	public static final int LITERAL_ms=156;
	public static final int LITERAL_nonvolatile=157;
	public static final int LITERAL_not=158;
	public static final int LITERAL_now=159;
	public static final int LITERAL_ns=160;
	public static final int LITERAL_null=161;
	public static final int LITERAL_numberof=162;
	public static final int LITERAL_of=163;
	public static final int LITERAL_on=164;
	public static final int LITERAL_or=165;
	public static final int LITERAL_package=166;
	public static final int LITERAL_parameter=167;
	public static final int LITERAL_pause=168;
	public static final int LITERAL_post=169;
	public static final int LITERAL_pre=170;
	public static final int LITERAL_private=171;
	public static final int LITERAL_product=172;
	public static final int LITERAL_property=173;
	public static final int LITERAL_provides=174;
	public static final int LITERAL_ps=175;
	public static final int LITERAL_public=176;
	public static final int LITERAL_quantity=177;
	public static final int LITERAL_range=178;
	public static final int LITERAL_record=179;
	public static final int LITERAL_reference=180;
	public static final int LITERAL_rem=181;
	public static final int LITERAL_renames=182;
	public static final int LITERAL_representation=183;
	public static final int LITERAL_requires=184;
	public static final int LITERAL_returns=185;
	public static final int LITERAL_round=186;
	public static final int LITERAL_scalar=187;
	public static final int LITERAL_sec=188;
	public static final int LITERAL_self=189;
	public static final int LITERAL_sequence=190;
	public static final int LITERAL_set=191;
	public static final int LITERAL_setmode=192;
	public static final int LITERAL_shared=193;
	public static final int LITERAL_skip=194;
	public static final int LITERAL_spread=195;
	public static final int LITERAL_state=196;
	public static final int LITERAL_states=197;
	public static final int LITERAL_step=198;
	public static final int LITERAL_stop=199;
	public static final int LITERAL_string=200;
	public static final int LITERAL_subcomponents=201;
	public static final int LITERAL_sum=202;
	public static final int LITERAL_swap=203;
	public static final int LITERAL_that=204;
	public static final int LITERAL_then=205;
	public static final int LITERAL_throw=206;
	public static final int LITERAL_throws=207;
	public static final int LITERAL_timeout=208;
	public static final int LITERAL_to=209;
	public static final int LITERAL_tops=210;
	public static final int LITERAL_transition=211;
	public static final int LITERAL_transitions=212;
	public static final int LITERAL_true=213;
	public static final int LITERAL_truncate=214;
	public static final int LITERAL_type=215;
	public static final int LITERAL_union=216;
	public static final int LITERAL_units=217;
	public static final int LITERAL_until=218;
	public static final int LITERAL_updated=219;
	public static final int LITERAL_upper_bound=220;
	public static final int LITERAL_us=221;
	public static final int LITERAL_variables=222;
	public static final int LITERAL_variant=223;
	public static final int LITERAL_when=224;
	public static final int LITERAL_which=225;
	public static final int LITERAL_while=226;
	public static final int LITERAL_whole=227;
	public static final int LITERAL_with=228;
	public static final int LITERAL_xor=229;
	public static final int LPAREN=230;
	public static final int LT=231;
	public static final int LTE_STRING=232;
	public static final int LT_STRING=233;
	public static final int MINUS=234;
	public static final int MT_STRING=235;
	public static final int NEQ=236;
	public static final int NUMBER=237;
	public static final int OBLIGATION=238;
	public static final int OCTOTHORPE=239;
	public static final int OLD_NEQ=240;
	public static final int ON=241;
	public static final int P=242;
	public static final int PARAMETER=243;
	public static final int PARAMETERS=244;
	public static final int PLUS=245;
	public static final int PLUS_ARROW=246;
	public static final int PLUS_EQUALS=247;
	public static final int PORT=248;
	public static final int PORT_INPUT=249;
	public static final int PORT_OUTPUT=250;
	public static final int PREDICATE_RELATION=251;
	public static final int PROCEDURE=252;
	public static final int Q=253;
	public static final int QCLREF=254;
	public static final int QCREF=255;
	public static final int QQ=256;
	public static final int QUANTITY=257;
	public static final int QUESTION=258;
	public static final int RASS=259;
	public static final int RBRACKET=260;
	public static final int RCON=261;
	public static final int RCURLY=262;
	public static final int REAL_LIT=263;
	public static final int RECORD_TERM=264;
	public static final int ROOT_DECLARATION=265;
	public static final int RPAREN=266;
	public static final int S=267;
	public static final int SEMICOLON=268;
	public static final int SLCOMMENT=269;
	public static final int SOURCE=270;
	public static final int START=271;
	public static final int START_ASSERTION_PROPERTY=272;
	public static final int STOP=273;
	public static final int SUBPROGRAM_INVOCATION=274;
	public static final int TICK=275;
	public static final int TILDE=276;
	public static final int TIMES=277;
	public static final int TOP=278;
	public static final int TRANSITION=279;
	public static final int TRIGGER=280;
	public static final int TYPE=281;
	public static final int TYPE_LIBRARY=282;
	public static final int TYPE_OPERATOR=283;
	public static final int TYPE_OPERATOR_INVOCATION=284;
	public static final int UNARY_MINUS=285;
	public static final int UNIT_FORMULA=286;
	public static final int UNIT_LIBRARY=287;
	public static final int UNIT_NAME=288;
	public static final int VALUE=289;
	public static final int VARIABLE_DECLARATION=290;
	public static final int VERT=291;
	public static final int WP=292;
	public static final int WS=293;

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:617:1: relation_symbol : ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS );
	public final BLESS3Parser.relation_symbol_return relation_symbol() throws RecognitionException {
		BLESS3Parser.relation_symbol_return retval = new BLESS3Parser.relation_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set1=null;

		BAST set1_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:618:3: ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:1: range_symbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.range_symbol_return range_symbol() throws RecognitionException {
		BLESS3Parser.range_symbol_return retval = new BLESS3Parser.range_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set2=null;

		BAST set2_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:14: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:1: identifier : ID ;
	public final BLESS3Parser.identifier_return identifier() throws RecognitionException {
		BLESS3Parser.identifier_return retval = new BLESS3Parser.identifier_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID3=null;

		BAST ID3_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:3: ( ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:5: ID
			{
			root_0 = (BAST)adaptor.nil();


			ID3=(Token)match(input,ID,FOLLOW_ID_in_identifier2625); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:1: unitLibrary : (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) ;
	public final BLESS3Parser.unitLibrary_return unitLibrary() throws RecognitionException {
		BLESS3Parser.unitLibrary_return retval = new BLESS3Parser.unitLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_unitDeclarations=null;
		RuleReturnScope unitDeclarations = null;
		RewriteRuleSubtreeStream stream_unitDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule unitDeclaration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:12: ( (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:3: (unitDeclarations+= unitDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:19: (unitDeclarations+= unitDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:19: unitDeclarations+= unitDeclaration
					{
					pushFollow(FOLLOW_unitDeclaration_in_unitLibrary2652);
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
			// 645:5: -> ^( UNIT_LIBRARY ( $unitDeclarations)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:645:8: ^( UNIT_LIBRARY ( $unitDeclarations)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:648:1: unitName : (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:3: ( (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:3: (lt= LT (longname+= ID )+ GT )? id= ID
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:3: (lt= LT (longname+= ID )+ GT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:5: lt= LT (longname+= ID )+ GT
					{
					lt=(Token)match(input,LT,FOLLOW_LT_in_unitName2691); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT.add(lt);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:11: (longname+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:12: longname+= ID
							{
							longname=(Token)match(input,ID,FOLLOW_ID_in_unitName2696); if (state.failed) return retval; 
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

					GT4=(Token)match(input,GT,FOLLOW_GT_in_unitName2700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT.add(GT4);

					}
					break;

			}

			id=(Token)match(input,ID,FOLLOW_ID_in_unitName2707); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// AST REWRITE
			// elements: id, longname
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
			// 651:5: -> ^( UNIT_NAME $id ( $longname)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:651:8: ^( UNIT_NAME $id ( $longname)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_NAME, "UNIT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:651:26: ( $longname)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:1: unitFormula : ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:12: ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:3: (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )?
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:6: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:6: top+= ID
							{
							top=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2739); if (state.failed) return retval; 
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

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:12: (slash= DIVIDE (bottom+= ID )+ )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==DIVIDE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:14: slash= DIVIDE (bottom+= ID )+
							{
							slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2746); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:33: (bottom+= ID )+
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
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:33: bottom+= ID
									{
									bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2750); if (state.failed) return retval; 
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
					// elements: slash, top, bottom
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
					// 656:5: -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:656:8: ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
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

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:656:31: ( $slash)?
						if ( stream_slash.hasNext() ) {
							adaptor.addChild(root_1, stream_slash.nextNode());
						}
						stream_slash.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:656:39: ( $bottom)*
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:658:3: slash= DIVIDE (bottom+= ID )+
					{
					slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2788); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:658:22: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:658:22: bottom+= ID
							{
							bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2792); if (state.failed) return retval; 
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
					// 659:5: -> ^( UNIT_FORMULA $slash ( $bottom)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:659:8: ^( UNIT_FORMULA $slash ( $bottom)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final BLESS3Parser.unitDeclaration_return unitDeclaration() throws RecognitionException {
		BLESS3Parser.unitDeclaration_return retval = new BLESS3Parser.unitDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope rootDeclaration5 =null;
		ParserRuleReturnScope unitExtension6 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:16: ( rootDeclaration | unitExtension )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:663:3: rootDeclaration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration2825);
					rootDeclaration5=rootDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rootDeclaration5.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:663:21: unitExtension
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_unitExtension_in_unitDeclaration2829);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:1: rootDeclaration : (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:16: ( (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:3: (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:3: (base= LITERAL_base |formula= unitFormula )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:5: base= LITERAL_base
					{
					base=(Token)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration2848); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_base.add(base);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:25: formula= unitFormula
					{
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration2854);
					formula=unitFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFormula.add(formula.getTree());
					}
					break;

			}

			lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration2860); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:68: (kindWords+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:68: kindWords+= ID
					{
					kindWords=(Token)match(input,ID,FOLLOW_ID_in_rootDeclaration2864); if (state.failed) return retval; 
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

			RBRACKET7=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_rootDeclaration2867); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET7);

			pushFollow(FOLLOW_unitName_in_rootDeclaration2874);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:24: (factors+= unitFactor )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:24: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_rootDeclaration2878);
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

			SEMICOLON8=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rootDeclaration2881); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON8);

			// AST REWRITE
			// elements: base, lb, unit, formula, kindWords, factors
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
			// 669:5: -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:8: ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ROOT_DECLARATION, "ROOT_DECLARATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:29: ( $base)?
				if ( stream_base.hasNext() ) {
					adaptor.addChild(root_1, stream_base.nextNode());
				}
				stream_base.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:36: ( $formula)?
				if ( stream_formula.hasNext() ) {
					adaptor.addChild(root_1, stream_formula.nextTree());
				}
				stream_formula.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:45: ^( $lb ( $kindWords)+ )
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
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:73: ( $factors)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:1: unitExtension : LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:14: ( LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:673:3: LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_extension9=(Token)match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension2931); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_extension9_tree = (BAST)adaptor.create(LITERAL_extension9);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_extension9_tree, root_0);
			}

			root=(Token)match(input,ID,FOLLOW_ID_in_unitExtension2936); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			root_tree = (BAST)adaptor.create(root);
			adaptor.addChild(root_0, root_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:673:37: (factors+= unitFactor )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:673:37: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension2940);
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

			SEMICOLON10=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_unitExtension2943); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:676:1: mulDiv : ( TIMES | DIVIDE ) ;
	public final BLESS3Parser.mulDiv_return mulDiv() throws RecognitionException {
		BLESS3Parser.mulDiv_return retval = new BLESS3Parser.mulDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set11=null;

		BAST set11_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:676:7: ( ( TIMES | DIVIDE ) )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:679:1: unitFactor : c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:679:11: (c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:680:3: c= COMMA unit= unitName op= mulDiv factor= NUMBER
			{
			c=(Token)match(input,COMMA,FOLLOW_COMMA_in_unitFactor2977); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(c);

			pushFollow(FOLLOW_unitName_in_unitFactor2981);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			pushFollow(FOLLOW_mulDiv_in_unitFactor2985);
			op=mulDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mulDiv.add(op.getTree());
			factor=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor2989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NUMBER.add(factor);

			// AST REWRITE
			// elements: factor, unit, op, c
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
			// 681:5: -> ^( $c $unit $op $factor)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:681:8: ^( $c $unit $op $factor)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:686:1: typeLibrary : (decs+= typeDeclaration )+ ;
	public final BLESS3Parser.typeLibrary_return typeLibrary() throws RecognitionException {
		BLESS3Parser.typeLibrary_return retval = new BLESS3Parser.typeLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_decs=null;
		RuleReturnScope decs = null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:686:12: ( (decs+= typeDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:687:3: (decs+= typeDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:687:7: (decs+= typeDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:687:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary3029);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:1: typeDeclaration : LITERAL_type ^id= ID LITERAL_is !ty= type ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:16: ( LITERAL_type ^id= ID LITERAL_is !ty= type )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:691:3: LITERAL_type ^id= ID LITERAL_is !ty= type
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_type12=(Token)match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration3042); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_type12_tree = (BAST)adaptor.create(LITERAL_type12);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_type12_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_typeDeclaration3047); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			LITERAL_is13=(Token)match(input,LITERAL_is,FOLLOW_LITERAL_is_in_typeDeclaration3049); if (state.failed) return retval;
			pushFollow(FOLLOW_type_in_typeDeclaration3054);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:694:1: type : ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:694:5: ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:695:3: enumerationType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationType_in_type3066);
					enumerationType14=enumerationType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationType14.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:5: quantityType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantityType_in_type3072);
					quantityType15=quantityType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantityType15.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:697:5: arrayType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type3078);
					arrayType16=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType16.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:698:5: recordType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type3084);
					recordType17=recordType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType17.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:699:5: LITERAL_boolean
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_boolean18=(Token)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type3090); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_boolean18_tree = (BAST)adaptor.create(LITERAL_boolean18);
					adaptor.addChild(root_0, LITERAL_boolean18_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:5: LITERAL_string
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_string19=(Token)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type3096); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_string19_tree = (BAST)adaptor.create(LITERAL_string19);
					adaptor.addChild(root_0, LITERAL_string19_tree);
					}

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:5: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null20=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type3102); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:1: typeOrReference : (ty= type |ref= ID );
	public final BLESS3Parser.typeOrReference_return typeOrReference() throws RecognitionException {
		BLESS3Parser.typeOrReference_return retval = new BLESS3Parser.typeOrReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ref=null;
		ParserRuleReturnScope ty =null;

		BAST ref_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:16: (ty= type |ref= ID )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:705:3: ty= type
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeOrReference3114);
					ty=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:705:13: ref= ID
					{
					root_0 = (BAST)adaptor.nil();


					ref=(Token)match(input,ID,FOLLOW_ID_in_typeOrReference3120); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:1: enumerationType : LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:16: ( LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:709:3: LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_enumeration21=(Token)match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType3133); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_enumeration21_tree = (BAST)adaptor.create(LITERAL_enumeration21);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_enumeration21_tree, root_0);
			}

			LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumerationType3136); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:709:60: (defining_enumeration_literal+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:709:60: defining_enumeration_literal+= ID
					{
					defining_enumeration_literal=(Token)match(input,ID,FOLLOW_ID_in_enumerationType3141); if (state.failed) return retval;
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

			RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumerationType3144); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:1: quantityType : q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:13: (q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:3: q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )?
			{
			root_0 = (BAST)adaptor.nil();


			q=(Token)match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType3160); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			q_tree = (BAST)adaptor.create(q);
			root_0 = (BAST)adaptor.becomeRoot(q_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:714:3: (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:714:5: unit= ID
					{
					unit=(Token)match(input,ID,FOLLOW_ID_in_quantityType3170); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					unit_tree = (BAST)adaptor.create(unit);
					adaptor.addChild(root_0, unit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:714:15: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType3176); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					scalar_tree = (BAST)adaptor.create(scalar);
					adaptor.addChild(root_0, scalar_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:714:39: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType3182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					whole_tree = (BAST)adaptor.create(whole);
					adaptor.addChild(root_0, whole_tree);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:715:3: ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LBRACKET) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:715:5: LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )?
					{
					LBRACKET24=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_quantityType3190); if (state.failed) return retval;
					pushFollow(FOLLOW_aNumber_in_quantityType3195);
					lb=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

					dd=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType3199); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					dd_tree = (BAST)adaptor.create(dd);
					root_0 = (BAST)adaptor.becomeRoot(dd_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_quantityType3204);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					RBRACKET25=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_quantityType3206); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:3: (st= LITERAL_step ^step= aNumber )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LITERAL_step) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:5: st= LITERAL_step ^step= aNumber
							{
							st=(Token)match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType3216); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							st_tree = (BAST)adaptor.create(st);
							root_0 = (BAST)adaptor.becomeRoot(st_tree, root_0);
							}

							pushFollow(FOLLOW_aNumber_in_quantityType3221);
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

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:717:3: (rep= LITERAL_representation ^representation= QCLREF )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LITERAL_representation) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:717:5: rep= LITERAL_representation ^representation= QCLREF
					{
					rep=(Token)match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType3236); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					rep_tree = (BAST)adaptor.create(rep);
					root_0 = (BAST)adaptor.becomeRoot(rep_tree, root_0);
					}

					representation=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType3241); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:1: arrayType : LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:11: ( LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:721:3: LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_array26=(Token)match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType3260); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_array26_tree = (BAST)adaptor.create(LITERAL_array26);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_array26_tree, root_0);
			}

			LBRACKET27=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType3263); if (state.failed) return retval;
			pushFollow(FOLLOW_arrayRangeList_in_arrayType3268);
			array_ranges=arrayRangeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, array_ranges.getTree());

			RBRACKET28=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType3270); if (state.failed) return retval;
			LITERAL_of29=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType3273); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_of29_tree = (BAST)adaptor.create(LITERAL_of29);
			adaptor.addChild(root_0, LITERAL_of29_tree);
			}

			pushFollow(FOLLOW_typeOrReference_in_arrayType3277);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:1: arrayRangeList :rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:16: (rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:3: rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_arrayRange_in_arrayRangeList3293);
			rang=arrayRange();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

			if (list_rang==null) list_rang=new ArrayList<Object>();
			list_rang.add(rang.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:20: ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==COMMA) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:22: COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )*
					{
					COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA30_tree = (BAST)adaptor.create(COMMA30);
					root_0 = (BAST)adaptor.becomeRoot(COMMA30_tree, root_0);
					}

					pushFollow(FOLLOW_arrayRange_in_arrayRangeList3302);
					rang=arrayRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

					if (list_rang==null) list_rang=new ArrayList<Object>();
					list_rang.add(rang.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:46: ( COMMA !rang+= arrayRange )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==COMMA) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:48: COMMA !rang+= arrayRange
							{
							COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3306); if (state.failed) return retval;
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList3311);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:728:1: arrayRange : lb= aNumber ( DOTDOT ^ub= aNumber )? ;
	public final BLESS3Parser.arrayRange_return arrayRange() throws RecognitionException {
		BLESS3Parser.arrayRange_return retval = new BLESS3Parser.arrayRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT32=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST DOTDOT32_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:728:12: (lb= aNumber ( DOTDOT ^ub= aNumber )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:728:14: lb= aNumber ( DOTDOT ^ub= aNumber )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_aNumber_in_arrayRange3331);
			lb=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:728:25: ( DOTDOT ^ub= aNumber )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==DOTDOT) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:728:27: DOTDOT ^ub= aNumber
					{
					DOTDOT32=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange3335); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT32_tree = (BAST)adaptor.create(DOTDOT32);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT32_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_arrayRange3340);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:1: recordType : ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:12: ( ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:3: ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !
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
			LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_recordType3370); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:732:17: (fields+= recordField )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:732:17: fields+= recordField
					{
					pushFollow(FOLLOW_recordField_in_recordType3375);
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

			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_recordType3378); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:735:1: recordField : id= ID COLON ^ty= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:735:13: (id= ID COLON ^ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:736:3: id= ID COLON ^ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_recordField3396); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_recordField3398); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON36_tree = (BAST)adaptor.create(COLON36);
			root_0 = (BAST)adaptor.becomeRoot(COLON36_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_recordField3403);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:1: assertionLibrary : (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:17: ( (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:743:3: (ghosts= ghostVariables )? (assertion_list+= namedAssertion )*
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:743:3: (ghosts= ghostVariables )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LITERAL_ghost) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:743:5: ghosts= ghostVariables
					{
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary3423);
					ghosts=ghostVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ghostVariables.add(ghosts.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:17: (assertion_list+= namedAssertion )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==LASS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:17: assertion_list+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertionLibrary3432);
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
			// elements: assertion_list, ghosts
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
			// 745:3: -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:6: ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ANNEX, "ASSERTION_ANNEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:25: ( $ghosts)?
				if ( stream_ghosts.hasNext() ) {
					adaptor.addChild(root_1, stream_ghosts.nextTree());
				}
				stream_ghosts.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:34: ( $assertion_list)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:1: ghostVariables : LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:3: ( LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:3: LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_ghost37=(Token)match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables3465); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_ghost37_tree = (BAST)adaptor.create(LITERAL_ghost37);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_ghost37_tree, root_0);
			}

			LITERAL_variables38=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_ghostVariables3468); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:39: (gv+= ghostVariable )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:39: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables3473);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:753:1: ghostVariable : LITERAL_def ^id= ID TILDE !tod= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:753:14: ( LITERAL_def ^id= ID TILDE !tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:754:3: LITERAL_def ^id= ID TILDE !tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_def39=(Token)match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable3486); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_def39_tree = (BAST)adaptor.create(LITERAL_def39);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_def39_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_ghostVariable3492); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE40=(Token)match(input,TILDE,FOLLOW_TILDE_in_ghostVariable3494); if (state.failed) return retval;
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable3499);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:757:1: namedAssertion : LASS id= ID COLON ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) RASS -> {formals==null&&pred!=null}? ^( ASSERTION ^( LABEL $id) $pred) -> {formals!=null&&pred!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {formals==null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {formals!=null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {assertionvariable!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> ^( ASSERTION ^( LABEL $id) DUMMY ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:757:15: ( LASS id= ID COLON ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) RASS -> {formals==null&&pred!=null}? ^( ASSERTION ^( LABEL $id) $pred) -> {formals!=null&&pred!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {formals==null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {formals!=null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {assertionvariable!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> ^( ASSERTION ^( LABEL $id) DUMMY ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:758:3: LASS id= ID COLON ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) RASS
			{
			LASS41=(Token)match(input,LASS,FOLLOW_LASS_in_namedAssertion3514); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS41);

			id=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3520); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			COLON42=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3522); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON42);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:760:3: ( (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:5: (formals= variableList )? ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:12: (formals= variableList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ID) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:12: formals= variableList
							{
							pushFollow(FOLLOW_variableList_in_namedAssertion3535);
							formals=variableList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_variableList.add(formals.getTree());
							}
							break;

					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:7: ( COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:763:7: COLON pred= predicate
							{
							COLON43=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3553); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(COLON43);

							pushFollow(FOLLOW_predicate_in_namedAssertion3558);
							pred=predicate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:765:7: ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue
							{
							ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion3578); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

							pushFollow(FOLLOW_typeOrReference_in_namedAssertion3582);
							tod=typeOrReference();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
							ASSIGN44=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namedAssertion3584); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN44);

							pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion3589);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:768:5: assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration
					{
					assertionvariable=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(assertionvariable);

					til=(Token)match(input,TILDE,FOLLOW_TILDE_in_namedAssertion3618); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(til);

					enumerationTy=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3622); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(enumerationTy);

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion3626);
					enumeration=assertionEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertionEnumeration.add(enumeration.getTree());
					}
					break;

			}

			RASS45=(Token)match(input,RASS,FOLLOW_RASS_in_namedAssertion3634); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS45);

			// AST REWRITE
			// elements: formals, enumeration, id, pred, pred, id, id, ret, til, tod, assertionvariable, formals, functionvalue, id, functionvalue, ret, tod, id, enumerationTy, id
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
			// 771:4: -> {formals==null&&pred!=null}? ^( ASSERTION ^( LABEL $id) $pred)
			if (formals==null&&pred!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:36: ^( ASSERTION ^( LABEL $id) $pred)
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

				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 772:4: -> {formals!=null&&pred!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred)
			if (formals!=null&&pred!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:772:36: ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:772:49: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:772:64: ^( PARAMETERS $formals)
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

			else // 773:4: -> {formals==null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue)
			if (formals==null&&tod!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:35: ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue)
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:72: ^( $ret $tod)
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

			else // 774:4: -> {formals!=null&&tod!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
			if (formals!=null&&tod!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:35: ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:57: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:72: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:97: ^( $ret $tod)
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

			else // 775:4: -> {assertionvariable!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
			if (assertionvariable!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:35: ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, "ASSERTION_ENUMERATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:60: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:75: ^( $til $assertionvariable $enumerationTy)
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

			else // 776:4: -> ^( ASSERTION ^( LABEL $id) DUMMY )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:776:7: ^( ASSERTION ^( LABEL $id) DUMMY )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:776:20: ^( LABEL $id)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:779:1: predicate : expression ;
	public final BLESS3Parser.predicate_return predicate() throws RecognitionException {
		BLESS3Parser.predicate_return retval = new BLESS3Parser.predicate_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression46 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:779:10: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:779:13: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_predicate3966);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:1: variableList : first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:13: (first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:3: first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_variableList3977);
			first=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, first.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:18: ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMA) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:20: COMMA ^parameter+= variable ( COMMA !parameter+= variable )*
					{
					COMMA47=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA47_tree = (BAST)adaptor.create(COMMA47);
					root_0 = (BAST)adaptor.becomeRoot(COMMA47_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_variableList3986);
					parameter=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

					if (list_parameter==null) list_parameter=new ArrayList<Object>();
					list_parameter.add(parameter.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:47: ( COMMA !parameter+= variable )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==COMMA) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:49: COMMA !parameter+= variable
							{
							COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3990); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_variableList3995);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:785:1: variable : id= ID TILDE ^tod= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:785:9: (id= ID TILDE ^tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:3: id= ID TILDE ^tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_variable4013); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE49=(Token)match(input,TILDE,FOLLOW_TILDE_in_variable4015); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TILDE49_tree = (BAST)adaptor.create(TILDE49);
			root_0 = (BAST)adaptor.becomeRoot(TILDE49_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_variable4020);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:789:1: assertionFunctionValue : ( conditionalAssertionFunction | expression );
	public final BLESS3Parser.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		BLESS3Parser.assertionFunctionValue_return retval = new BLESS3Parser.assertionFunctionValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalAssertionFunction50 =null;
		ParserRuleReturnScope expression51 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:789:23: ( conditionalAssertionFunction | expression )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:790:2: conditionalAssertionFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue4031);
					conditionalAssertionFunction50=conditionalAssertionFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAssertionFunction50.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:791:4: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assertionFunctionValue4037);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:1: conditionalAssertionFunction : LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:29: ( LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:2: LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET
			{
			LBRACKET52=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_conditionalAssertionFunction4050); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET52);

			pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction4054);
			cvp=conditionValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
			if (list_cvp==null) list_cvp=new ArrayList<Object>();
			list_cvp.add(cvp.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:35: ( COMMA cvp+= conditionValuePair )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==COMMA) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:37: COMMA cvp+= conditionValuePair
					{
					COMMA53=(Token)match(input,COMMA,FOLLOW_COMMA_in_conditionalAssertionFunction4058); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA53);

					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction4062);
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

			RBRACKET54=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_conditionalAssertionFunction4067); if (state.failed) return retval; 
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
			// 796:4: -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:7: ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITIONAL_ASSERTION_FUNCTION, "CONDITIONAL_ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:42: ( $cvp)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:799:1: conditionValuePair : LPAREN ! predicate CVP ^ expression ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:799:19: ( LPAREN ! predicate CVP ^ expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:800:3: LPAREN ! predicate CVP ^ expression
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN55=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionValuePair4095); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_conditionValuePair4098);
			predicate56=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate56.getTree());

			CVP57=(Token)match(input,CVP,FOLLOW_CVP_in_conditionValuePair4100); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CVP57_tree = (BAST)adaptor.create(CVP57);
			root_0 = (BAST)adaptor.becomeRoot(CVP57_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_conditionValuePair4103);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:1: assertionEnumeration : ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) ) -> ^( $pa $pair) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:21: ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) ) -> ^( $pa $pair) )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==PLUS_ARROW) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==ID) ) {
					int LA38_2 = input.LA(3);
					if ( (LA38_2==LPAREN) ) {
						alt38=1;
					}
					else if ( (LA38_2==IMP) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:2: (pa= PLUS_ARROW inv= invocation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:2: (pa= PLUS_ARROW inv= invocation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:4: pa= PLUS_ARROW inv= invocation
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration4119); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_invocation_in_assertionEnumeration4123);
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
					// 805:4: -> ^( $pa $inv)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:805:7: ^( $pa $inv)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:4: pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration4150); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4154);
					pair=enumerationPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
					if (list_pair==null) list_pair=new ArrayList<Object>();
					list_pair.add(pair.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:40: (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==COMMA) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:42: com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )*
							{
							com=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration4160); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(com);

							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4164);
							pair=enumerationPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTree());
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:74: ( COMMA pair+= enumerationPair )*
							loop36:
							while (true) {
								int alt36=2;
								int LA36_0 = input.LA(1);
								if ( (LA36_0==COMMA) ) {
									alt36=1;
								}

								switch (alt36) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:76: COMMA pair+= enumerationPair
									{
									COMMA59=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration4168); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA59);

									pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4172);
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
					// elements: pair, com, pa, pair, pa
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
					// 808:4: -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) )
					if (com!=null) {
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:808:20: ^( $pa ^( $com ( $pair)+ ) )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:808:27: ^( $com ( $pair)+ )
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

					else // 809:4: -> ^( $pa $pair)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:809:7: ^( $pa $pair)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:1: enumerationPair : ID IMP ^ predicate ;
	public final BLESS3Parser.enumerationPair_return enumerationPair() throws RecognitionException {
		BLESS3Parser.enumerationPair_return retval = new BLESS3Parser.enumerationPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID60=null;
		Token IMP61=null;
		ParserRuleReturnScope predicate62 =null;

		BAST ID60_tree=null;
		BAST IMP61_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:16: ( ID IMP ^ predicate )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:813:3: ID IMP ^ predicate
			{
			root_0 = (BAST)adaptor.nil();


			ID60=(Token)match(input,ID,FOLLOW_ID_in_enumerationPair4232); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID60_tree = (BAST)adaptor.create(ID60);
			adaptor.addChild(root_0, ID60_tree);
			}

			IMP61=(Token)match(input,IMP,FOLLOW_IMP_in_enumerationPair4234); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP61_tree = (BAST)adaptor.create(IMP61);
			root_0 = (BAST)adaptor.becomeRoot(IMP61_tree, root_0);
			}

			pushFollow(FOLLOW_predicate_in_enumerationPair4237);
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


	public static class enumerationValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "enumerationValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:816:1: enumerationValue : enumeration_type= ID TICK ^enumeration_value= ID ;
	public final BLESS3Parser.enumerationValue_return enumerationValue() throws RecognitionException {
		BLESS3Parser.enumerationValue_return retval = new BLESS3Parser.enumerationValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token enumeration_type=null;
		Token enumeration_value=null;
		Token TICK63=null;

		BAST enumeration_type_tree=null;
		BAST enumeration_value_tree=null;
		BAST TICK63_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:816:17: (enumeration_type= ID TICK ^enumeration_value= ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:817:3: enumeration_type= ID TICK ^enumeration_value= ID
			{
			root_0 = (BAST)adaptor.nil();


			enumeration_type=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue4251); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			enumeration_type_tree = (BAST)adaptor.create(enumeration_type);
			adaptor.addChild(root_0, enumeration_type_tree);
			}

			TICK63=(Token)match(input,TICK,FOLLOW_TICK_in_enumerationValue4253); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TICK63_tree = (BAST)adaptor.create(TICK63);
			root_0 = (BAST)adaptor.becomeRoot(TICK63_tree, root_0);
			}

			enumeration_value=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue4258); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			enumeration_value_tree = (BAST)adaptor.create(enumeration_value);
			adaptor.addChild(root_0, enumeration_value_tree);
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
	// $ANTLR end "enumerationValue"


	public static class namelessAssertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:1: namelessAssertion : LASS pred= predicate RASS -> ^( ASSERTION $pred) ;
	public final BLESS3Parser.namelessAssertion_return namelessAssertion() throws RecognitionException {
		BLESS3Parser.namelessAssertion_return retval = new BLESS3Parser.namelessAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LASS64=null;
		Token RASS65=null;
		ParserRuleReturnScope pred =null;

		BAST LASS64_tree=null;
		BAST RASS65_tree=null;
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:18: ( LASS pred= predicate RASS -> ^( ASSERTION $pred) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:3: LASS pred= predicate RASS
			{
			LASS64=(Token)match(input,LASS,FOLLOW_LASS_in_namelessAssertion4270); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS64);

			pushFollow(FOLLOW_predicate_in_namelessAssertion4274);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			RASS65=(Token)match(input,RASS,FOLLOW_RASS_in_namelessAssertion4276); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS65);

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
			// 822:5: -> ^( ASSERTION $pred)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:822:8: ^( ASSERTION $pred)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:825:1: namelessFunction : LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue) ;
	public final BLESS3Parser.namelessFunction_return namelessFunction() throws RecognitionException {
		BLESS3Parser.namelessFunction_return retval = new BLESS3Parser.namelessFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ret=null;
		Token LASS66=null;
		Token ASSIGN67=null;
		Token RASS68=null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;

		BAST ret_tree=null;
		BAST LASS66_tree=null;
		BAST ASSIGN67_tree=null;
		BAST RASS68_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:825:17: ( LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:3: LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS
			{
			LASS66=(Token)match(input,LASS,FOLLOW_LASS_in_namelessFunction4305); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS66);

			ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction4309); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

			pushFollow(FOLLOW_typeOrReference_in_namelessFunction4313);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
			ASSIGN67=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namelessFunction4315); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN67);

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction4319);
			functionvalue=assertionFunctionValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
			RASS68=(Token)match(input,RASS,FOLLOW_RASS_in_namelessFunction4321); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS68);

			// AST REWRITE
			// elements: tod, ret, functionvalue
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
			// 827:5: -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:8: ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:30: ^( $ret $tod)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:1: namelessEnumeration : LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION $inv) ;
	public final BLESS3Parser.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		BLESS3Parser.namelessEnumeration_return retval = new BLESS3Parser.namelessEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token LASS69=null;
		Token RASS70=null;
		ParserRuleReturnScope inv =null;

		BAST pa_tree=null;
		BAST LASS69_tree=null;
		BAST RASS70_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:20: ( LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION $inv) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:831:2: LASS pa= PLUS_ARROW inv= invocation RASS
			{
			LASS69=(Token)match(input,LASS,FOLLOW_LASS_in_namelessEnumeration4361); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS69);

			pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_namelessEnumeration4365); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

			pushFollow(FOLLOW_invocation_in_namelessEnumeration4369);
			inv=invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
			RASS70=(Token)match(input,RASS,FOLLOW_RASS_in_namelessEnumeration4371); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS70);

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
			// 832:4: -> ^( ASSERTION_ENUMERATION $inv)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:8: ^( ASSERTION_ENUMERATION $inv)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:835:1: invocation : id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE $id ( $params)* ( $exp)? ) ;
	public final BLESS3Parser.invocation_return invocation() throws RecognitionException {
		BLESS3Parser.invocation_return retval = new BLESS3Parser.invocation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN71=null;
		Token COMMA72=null;
		Token RPAREN73=null;
		List<Object> list_params=null;
		ParserRuleReturnScope exp =null;
		RuleReturnScope params = null;
		BAST id_tree=null;
		BAST LPAREN71_tree=null;
		BAST COMMA72_tree=null;
		BAST RPAREN73_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_actualParameter=new RewriteRuleSubtreeStream(adaptor,"rule actualParameter");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:835:11: (id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE $id ( $params)* ( $exp)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:836:2: id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_invocation4398); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_invocation4400); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN71);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:2: ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:6: params+= actualParameter ( COMMA params+= actualParameter )*
					{
					pushFollow(FOLLOW_actualParameter_in_invocation4410);
					params=actualParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
					if (list_params==null) list_params=new ArrayList<Object>();
					list_params.add(params.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:30: ( COMMA params+= actualParameter )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==COMMA) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:837:32: COMMA params+= actualParameter
							{
							COMMA72=(Token)match(input,COMMA,FOLLOW_COMMA_in_invocation4414); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA72);

							pushFollow(FOLLOW_actualParameter_in_invocation4418);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:838:6: exp= expression
					{
					pushFollow(FOLLOW_expression_in_invocation4432);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_invocation4437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN73);

			// AST REWRITE
			// elements: exp, id, params
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
			// 839:4: -> ^( INVOKE $id ( $params)* ( $exp)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:7: ^( INVOKE $id ( $params)* ( $exp)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVOKE, "INVOKE"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:22: ( $params)*
				while ( stream_params.hasNext() ) {
					adaptor.addChild(root_1, stream_params.nextTree());
				}
				stream_params.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:31: ( $exp)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:842:1: actualParameter : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.actualParameter_return actualParameter() throws RecognitionException {
		BLESS3Parser.actualParameter_return retval = new BLESS3Parser.actualParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON74=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON74_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:842:16: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:843:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_actualParameter4472); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON74=(Token)match(input,COLON,FOLLOW_COLON_in_actualParameter4474); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON74_tree = (BAST)adaptor.create(COLON74);
			root_0 = (BAST)adaptor.becomeRoot(COLON74_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_actualParameter4479);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:846:1: assertion : ( namedAssertion | namelessAssertion | namelessFunction | namelessEnumeration );
	public final BLESS3Parser.assertion_return assertion() throws RecognitionException {
		BLESS3Parser.assertion_return retval = new BLESS3Parser.assertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope namedAssertion75 =null;
		ParserRuleReturnScope namelessAssertion76 =null;
		ParserRuleReturnScope namelessFunction77 =null;
		ParserRuleReturnScope namelessEnumeration78 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:846:10: ( namedAssertion | namelessAssertion | namelessFunction | namelessEnumeration )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:847:3: namedAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namedAssertion_in_assertion4491);
					namedAssertion75=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion75.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:5: namelessAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessAssertion_in_assertion4497);
					namelessAssertion76=namelessAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessAssertion76.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:849:5: namelessFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessFunction_in_assertion4503);
					namelessFunction77=namelessFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessFunction77.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:5: namelessEnumeration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessEnumeration_in_assertion4509);
					namelessEnumeration78=namelessEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessEnumeration78.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:855:1: expression : (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? );
	public final BLESS3Parser.expression_return expression() throws RecognitionException {
		BLESS3Parser.expression_return retval = new BLESS3Parser.expression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_iff79=null;
		Token LITERAL_implies80=null;
		ParserRuleReturnScope all =null;
		ParserRuleReturnScope exists =null;
		ParserRuleReturnScope sum =null;
		ParserRuleReturnScope product =null;
		ParserRuleReturnScope numberof =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		BAST LITERAL_iff79_tree=null;
		BAST LITERAL_implies80_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:855:11: (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:856:3: all= universalQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalQuantification_in_expression4527);
					all=universalQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, all.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:857:5: exists= existentialQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialQuantification_in_expression4535);
					exists=existentialQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:858:5: sum= sumQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_sumQuantification_in_expression4543);
					sum=sumQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sum.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:5: product= productQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_productQuantification_in_expression4551);
					product=productQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, product.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:5: numberof= countingQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_countingQuantification_in_expression4559);
					numberof=countingQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numberof.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:5: l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_disjunction_in_expression4567);
					l=disjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:19: ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==LITERAL_iff||LA43_0==LITERAL_implies) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:21: ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:21: ( LITERAL_iff ^| LITERAL_implies ^)
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
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:22: LITERAL_iff ^
									{
									LITERAL_iff79=(Token)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression4572); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_iff79_tree = (BAST)adaptor.create(LITERAL_iff79);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_iff79_tree, root_0);
									}

									}
									break;
								case 2 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:37: LITERAL_implies ^
									{
									LITERAL_implies80=(Token)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression4577); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_implies80_tree = (BAST)adaptor.create(LITERAL_implies80);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_implies80_tree, root_0);
									}

									}
									break;

							}

							pushFollow(FOLLOW_disjunction_in_expression4583);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:1: universalQuantification : al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:24: (al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:866:3: al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate
			{
			al=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification4599); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_all.add(al);

			pushFollow(FOLLOW_logicVariables_in_universalQuantification4603);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:867:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:867:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalQuantification4614); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_universalQuantification4618);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:867:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_universalQuantification4624); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_universalQuantification4628);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification4639); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_universalQuantification4643);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: b, pred, al, w, ar, lv, ar, pred, al, lv, i, r, al
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
			// 869:4: -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:18: ^( $al $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 870:4: -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:18: ^( $al $lv ^( $w $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 871:4: -> $al
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:1: existentialQuantification : ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $ar $pred) ) -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $ar $pred) ) -> $ex;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:26: (ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $ar $pred) ) -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $ar $pred) ) -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:875:3: ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) ar= LITERAL_are pred= predicate
			{
			ex=(Token)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification4739); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_exists.add(ex);

			pushFollow(FOLLOW_logicVariables_in_existentialQuantification4743);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:876:5: (i= LITERAL_in r= range |th= LITERAL_that b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:876:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_existentialQuantification4754); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_existentialQuantification4758);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:876:29: th= LITERAL_that b= predicate
					{
					th=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification4764); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_that.add(th);

					pushFollow(FOLLOW_predicate_in_existentialQuantification4768);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_existentialQuantification4779); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_existentialQuantification4783);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: b, pred, ex, ex, th, lv, pred, lv, r, ex, ar, ar, i
			// token labels: ar, ex, th, i
			// rule labels: b, r, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_ex=new RewriteRuleTokenStream(adaptor,"token ex",ex);
			RewriteRuleTokenStream stream_th=new RewriteRuleTokenStream(adaptor,"token th",th);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 878:4: -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:18: ^( $ex $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 879:4: -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $ar $pred) )
			if (th!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:19: ^( $ex $lv ^( $th $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:30: ^( $th $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:42: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 880:4: -> $ex
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:1: sumQuantification : sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:18: (sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:884:3: sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			sum=(Token)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification4879); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_sum.add(sum);

			pushFollow(FOLLOW_logicVariables_in_sumQuantification4883);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:885:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:885:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_sumQuantification4894); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_sumQuantification4898);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:885:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_sumQuantification4904); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_sumQuantification4908);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification4919); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_sumQuantification4923);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: b, ex, ex, i, ar, sum, sum, lv, w, lv, ar, r, sum
			// token labels: ar, w, i, sum
			// rule labels: b, r, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_sum=new RewriteRuleTokenStream(adaptor,"token sum",sum);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 887:4: -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:18: ^( $sum $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:30: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 888:4: -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:18: ^( $sum $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:30: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 889:4: -> $sum
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:1: productQuantification : pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:22: (pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:893:3: pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			pr=(Token)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification5019); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_product.add(pr);

			pushFollow(FOLLOW_logicVariables_in_productQuantification5023);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_productQuantification5034); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_productQuantification5038);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_productQuantification5044); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_productQuantification5048);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification5059); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_productQuantification5063);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: w, i, r, ex, lv, pr, pr, b, pr, ar, ar, lv, ex
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
			// 896:4: -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:18: ^( $pr $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 897:4: -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:18: ^( $pr $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 898:4: -> $pr
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:1: countingQuantification : n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:23: (n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:902:3: n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression
			{
			n=(Token)match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification5159); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_numberof.add(n);

			pushFollow(FOLLOW_logicVariables_in_countingQuantification5163);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_countingQuantification5174); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_countingQuantification5178);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_countingQuantification5184); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_countingQuantification5188);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification5199); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(ar);

			pushFollow(FOLLOW_expression_in_countingQuantification5203);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: lv, r, n, ar, lv, w, b, ex, n, ex, i, n, ar
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
			// 905:4: -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:18: ^( $n $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:28: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 906:4: -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:18: ^( $n $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:28: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 907:4: -> $n
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:1: logicVariables :lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? ;
	public final BLESS3Parser.logicVariables_return logicVariables() throws RecognitionException {
		BLESS3Parser.logicVariables_return retval = new BLESS3Parser.logicVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA81=null;
		Token COMMA82=null;
		List<Object> list_lv=null;
		RuleReturnScope lv = null;
		BAST COMMA81_tree=null;
		BAST COMMA82_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:15: (lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:3: lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_logicVariables5299);
			lv=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

			if (list_lv==null) list_lv=new ArrayList<Object>();
			list_lv.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:16: ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COMMA) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:18: COMMA ^lv+= variable ( COMMA !lv+= variable )*
					{
					COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5303); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA81_tree = (BAST)adaptor.create(COMMA81);
					root_0 = (BAST)adaptor.becomeRoot(COMMA81_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_logicVariables5308);
					lv=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:38: ( COMMA !lv+= variable )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==COMMA) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:40: COMMA !lv+= variable
							{
							COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5312); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_logicVariables5317);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:1: disjunction : l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? ;
	public final BLESS3Parser.disjunction_return disjunction() throws RecognitionException {
		BLESS3Parser.disjunction_return retval = new BLESS3Parser.disjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or83=null;
		Token LITERAL_or84=null;
		Token LITERAL_or85=null;
		Token LITERAL_else86=null;
		Token LITERAL_or87=null;
		Token LITERAL_else88=null;
		Token LITERAL_xor89=null;
		Token LITERAL_xor90=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_or83_tree=null;
		BAST LITERAL_or84_tree=null;
		BAST LITERAL_or85_tree=null;
		BAST LITERAL_else86_tree=null;
		BAST LITERAL_or87_tree=null;
		BAST LITERAL_else88_tree=null;
		BAST LITERAL_xor89_tree=null;
		BAST LITERAL_xor90_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:12: (l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:3: l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_conjunction_in_disjunction5339);
			l=conjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:6: ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:8: LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )*
					{
					LITERAL_or83=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or83_tree = (BAST)adaptor.create(LITERAL_or83);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or83_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5361);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:35: ( LITERAL_or !r+= conjunction )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==LITERAL_or) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:37: LITERAL_or !r+= conjunction
							{
							LITERAL_or84=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5365); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5370);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:8: LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					{
					LITERAL_or85=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5391); if (state.failed) return retval;
					LITERAL_else86=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else86_tree = (BAST)adaptor.create(LITERAL_else86);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_else86_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5399);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:49: ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==LITERAL_or) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:51: LITERAL_or ! LITERAL_else !r+= conjunction
							{
							LITERAL_or87=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5403); if (state.failed) return retval;
							LITERAL_else88=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5406); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5411);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:8: LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )*
					{
					LITERAL_xor89=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5432); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor89_tree = (BAST)adaptor.create(LITERAL_xor89);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_xor89_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5437);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:36: ( LITERAL_xor !r+= conjunction )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==LITERAL_xor) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:38: LITERAL_xor !r+= conjunction
							{
							LITERAL_xor90=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5441); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5446);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:1: conjunction : l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? ;
	public final BLESS3Parser.conjunction_return conjunction() throws RecognitionException {
		BLESS3Parser.conjunction_return retval = new BLESS3Parser.conjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and91=null;
		Token LITERAL_and92=null;
		Token LITERAL_and93=null;
		Token LITERAL_then94=null;
		Token LITERAL_and95=null;
		Token LITERAL_then96=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_and91_tree=null;
		BAST LITERAL_and92_tree=null;
		BAST LITERAL_and93_tree=null;
		BAST LITERAL_then94_tree=null;
		BAST LITERAL_and95_tree=null;
		BAST LITERAL_then96_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:12: (l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:926:3: l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_relation_in_conjunction5470);
			l=relation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:5: ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:9: LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )*
					{
					LITERAL_and91=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5480); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and91_tree = (BAST)adaptor.create(LITERAL_and91);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and91_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5485);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:34: ( LITERAL_and !r+= relation )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==LITERAL_and) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:36: LITERAL_and !r+= relation
							{
							LITERAL_and92=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5489); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5494);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:9: LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )*
					{
					LITERAL_and93=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5509); if (state.failed) return retval;
					LITERAL_then94=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5512); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then94_tree = (BAST)adaptor.create(LITERAL_then94);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_then94_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5517);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:48: ( LITERAL_and ! LITERAL_then !r+= relation )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==LITERAL_and) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:50: LITERAL_and ! LITERAL_then !r+= relation
							{
							LITERAL_and95=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5521); if (state.failed) return retval;
							LITERAL_then96=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5524); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5529);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:1: relation : addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )? ;
	public final BLESS3Parser.relation_return relation() throws RecognitionException {
		BLESS3Parser.relation_return retval = new BLESS3Parser.relation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_in100=null;
		ParserRuleReturnScope addSub97 =null;
		ParserRuleReturnScope relation_symbol98 =null;
		ParserRuleReturnScope addSub99 =null;
		ParserRuleReturnScope range101 =null;

		BAST LITERAL_in100_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:9: ( addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:933:2: addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_addSub_in_relation5550);
			addSub97=addSub();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub97.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:934:2: ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:935:4: ( relation_symbol ^ addSub )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:935:4: ( relation_symbol ^ addSub )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:935:6: relation_symbol ^ addSub
					{
					pushFollow(FOLLOW_relation_symbol_in_relation5560);
					relation_symbol98=relation_symbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(relation_symbol98.getTree(), root_0);
					pushFollow(FOLLOW_addSub_in_relation5563);
					addSub99=addSub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub99.getTree());

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:937:4: ( LITERAL_in ^ range )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:937:4: ( LITERAL_in ^ range )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:937:6: LITERAL_in ^ range
					{
					LITERAL_in100=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation5577); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_in100_tree = (BAST)adaptor.create(LITERAL_in100);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_in100_tree, root_0);
					}

					pushFollow(FOLLOW_range_in_relation5580);
					range101=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, range101.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:1: range : subexpression rangeSymbol ^ subexpression ;
	public final BLESS3Parser.range_return range() throws RecognitionException {
		BLESS3Parser.range_return retval = new BLESS3Parser.range_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope subexpression102 =null;
		ParserRuleReturnScope rangeSymbol103 =null;
		ParserRuleReturnScope subexpression104 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:6: ( subexpression rangeSymbol ^ subexpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:8: subexpression rangeSymbol ^ subexpression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_range5595);
			subexpression102=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression102.getTree());

			pushFollow(FOLLOW_rangeSymbol_in_range5597);
			rangeSymbol103=rangeSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(rangeSymbol103.getTree(), root_0);
			pushFollow(FOLLOW_subexpression_in_range5600);
			subexpression104=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression104.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:943:1: rangeSymbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.rangeSymbol_return rangeSymbol() throws RecognitionException {
		BLESS3Parser.rangeSymbol_return retval = new BLESS3Parser.rangeSymbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set105=null;

		BAST set105_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:943:13: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set105=input.LT(1);
			if ( (input.LA(1) >= COMMACOMMA && input.LA(1) <= COMMADOT)||(input.LA(1) >= DOTCOMMA && input.LA(1) <= DOTDOT) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set105));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:946:1: addSub : multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? ;
	public final BLESS3Parser.addSub_return addSub() throws RecognitionException {
		BLESS3Parser.addSub_return retval = new BLESS3Parser.addSub_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token PLUS107=null;
		Token PLUS109=null;
		Token MINUS111=null;
		ParserRuleReturnScope multDiv106 =null;
		ParserRuleReturnScope multDiv108 =null;
		ParserRuleReturnScope multDiv110 =null;
		ParserRuleReturnScope multDiv112 =null;

		BAST PLUS107_tree=null;
		BAST PLUS109_tree=null;
		BAST MINUS111_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:946:7: ( multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:3: multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_multDiv_in_addSub5631);
			multDiv106=multDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv106.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:948:3: ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:7: PLUS ^ multDiv ( PLUS ! multDiv )*
					{
					PLUS107=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5643); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS107_tree = (BAST)adaptor.create(PLUS107);
					root_0 = (BAST)adaptor.becomeRoot(PLUS107_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5646);
					multDiv108=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv108.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:21: ( PLUS ! multDiv )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==PLUS) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:23: PLUS ! multDiv
							{
							PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5650); if (state.failed) return retval;
							pushFollow(FOLLOW_multDiv_in_addSub5653);
							multDiv110=multDiv();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv110.getTree());

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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:951:5: ( MINUS ^ multDiv )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:951:5: ( MINUS ^ multDiv )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:951:7: MINUS ^ multDiv
					{
					MINUS111=(Token)match(input,MINUS,FOLLOW_MINUS_in_addSub5672); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS111_tree = (BAST)adaptor.create(MINUS111);
					root_0 = (BAST)adaptor.becomeRoot(MINUS111_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5675);
					multDiv112=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv112.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:1: multDiv : exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? ;
	public final BLESS3Parser.multDiv_return multDiv() throws RecognitionException {
		BLESS3Parser.multDiv_return retval = new BLESS3Parser.multDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TIMES114=null;
		Token TIMES116=null;
		ParserRuleReturnScope exponentiation113 =null;
		ParserRuleReturnScope exponentiation115 =null;
		ParserRuleReturnScope exponentiation117 =null;
		ParserRuleReturnScope dividers118 =null;
		ParserRuleReturnScope exponentiation119 =null;

		BAST TIMES114_tree=null;
		BAST TIMES116_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:8: ( exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:956:3: exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_exponentiation_in_multDiv5695);
			exponentiation113=exponentiation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation113.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:957:3: ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:7: TIMES ^ exponentiation ( TIMES ! exponentiation )*
					{
					TIMES114=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5707); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES114_tree = (BAST)adaptor.create(TIMES114);
					root_0 = (BAST)adaptor.becomeRoot(TIMES114_tree, root_0);
					}

					pushFollow(FOLLOW_exponentiation_in_multDiv5710);
					exponentiation115=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation115.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:29: ( TIMES ! exponentiation )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==TIMES) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:31: TIMES ! exponentiation
							{
							TIMES116=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5714); if (state.failed) return retval;
							pushFollow(FOLLOW_exponentiation_in_multDiv5717);
							exponentiation117=exponentiation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation117.getTree());

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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:960:4: ( dividers ^ exponentiation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:960:4: ( dividers ^ exponentiation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:960:6: dividers ^ exponentiation
					{
					pushFollow(FOLLOW_dividers_in_multDiv5735);
					dividers118=dividers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(dividers118.getTree(), root_0);
					pushFollow(FOLLOW_exponentiation_in_multDiv5738);
					exponentiation119=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation119.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:964:1: dividers : ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem );
	public final BLESS3Parser.dividers_return dividers() throws RecognitionException {
		BLESS3Parser.dividers_return retval = new BLESS3Parser.dividers_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set120=null;

		BAST set120_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:964:9: ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set120=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==LITERAL_div||input.LA(1)==LITERAL_mod||input.LA(1)==LITERAL_rem ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set120));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:966:1: exponentiation : subexpression ( EXP ^ subexpression )? ;
	public final BLESS3Parser.exponentiation_return exponentiation() throws RecognitionException {
		BLESS3Parser.exponentiation_return retval = new BLESS3Parser.exponentiation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token EXP122=null;
		ParserRuleReturnScope subexpression121 =null;
		ParserRuleReturnScope subexpression123 =null;

		BAST EXP122_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:966:15: ( subexpression ( EXP ^ subexpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:3: subexpression ( EXP ^ subexpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_exponentiation5781);
			subexpression121=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression121.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:17: ( EXP ^ subexpression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==EXP) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:19: EXP ^ subexpression
					{
					EXP122=(Token)match(input,EXP,FOLLOW_EXP_in_exponentiation5785); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXP122_tree = (BAST)adaptor.create(EXP122);
					root_0 = (BAST)adaptor.becomeRoot(EXP122_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_exponentiation5788);
					subexpression123=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression123.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:970:1: subexpression : ( (uo= unaryOperator )? te= timedExpression -> {uo!=null}? ^( $uo $te) -> $te| MINUS te= timedExpression -> ^( UNARY_MINUS $te) );
	public final BLESS3Parser.subexpression_return subexpression() throws RecognitionException {
		BLESS3Parser.subexpression_return retval = new BLESS3Parser.subexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS124=null;
		ParserRuleReturnScope uo =null;
		ParserRuleReturnScope te =null;

		BAST MINUS124_tree=null;
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_unaryOperator=new RewriteRuleSubtreeStream(adaptor,"rule unaryOperator");
		RewriteRuleSubtreeStream stream_timedExpression=new RewriteRuleSubtreeStream(adaptor,"rule timedExpression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:970:14: ( (uo= unaryOperator )? te= timedExpression -> {uo!=null}? ^( $uo $te) -> $te| MINUS te= timedExpression -> ^( UNARY_MINUS $te) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:2: (uo= unaryOperator )? te= timedExpression
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:2: (uo= unaryOperator )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==LITERAL_abs||LA65_0==LITERAL_not||LA65_0==LITERAL_round||LA65_0==LITERAL_truncate) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:4: uo= unaryOperator
							{
							pushFollow(FOLLOW_unaryOperator_in_subexpression5808);
							uo=unaryOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_unaryOperator.add(uo.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_timedExpression_in_subexpression5815);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: uo, te, te
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
					// 972:4: -> {uo!=null}? ^( $uo $te)
					if (uo!=null) {
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:972:19: ^( $uo $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_uo.nextNode(), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 973:4: -> $te
					{
						adaptor.addChild(root_0, stream_te.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:975:2: MINUS te= timedExpression
					{
					MINUS124=(Token)match(input,MINUS,FOLLOW_MINUS_in_subexpression5846); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS124);

					pushFollow(FOLLOW_timedExpression_in_subexpression5850);
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
					// 976:4: -> ^( UNARY_MINUS $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:976:7: ^( UNARY_MINUS $te)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:979:1: unaryOperator : ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round );
	public final BLESS3Parser.unaryOperator_return unaryOperator() throws RecognitionException {
		BLESS3Parser.unaryOperator_return retval = new BLESS3Parser.unaryOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set125=null;

		BAST set125_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:979:14: ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set125=input.LT(1);
			if ( input.LA(1)==LITERAL_abs||input.LA(1)==LITERAL_not||input.LA(1)==LITERAL_round||input.LA(1)==LITERAL_truncate ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set125));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:983:1: timedExpression : timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? ;
	public final BLESS3Parser.timedExpression_return timedExpression() throws RecognitionException {
		BLESS3Parser.timedExpression_return retval = new BLESS3Parser.timedExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AT_SIGN127=null;
		Token TICK129=null;
		Token CARET130=null;
		ParserRuleReturnScope timedSubject126 =null;
		ParserRuleReturnScope subexpression128 =null;
		ParserRuleReturnScope periodShift131 =null;

		BAST AT_SIGN127_tree=null;
		BAST TICK129_tree=null;
		BAST CARET130_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:983:16: ( timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:984:3: timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_timedSubject_in_timedExpression5897);
			timedSubject126=timedSubject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, timedSubject126.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:985:3: ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:986:3: AT_SIGN ^ subexpression
					{
					AT_SIGN127=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5905); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_SIGN127_tree = (BAST)adaptor.create(AT_SIGN127);
					root_0 = (BAST)adaptor.becomeRoot(AT_SIGN127_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_timedExpression5908);
					subexpression128=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression128.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:5: TICK
					{
					TICK129=(Token)match(input,TICK,FOLLOW_TICK_in_timedExpression5914); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK129_tree = (BAST)adaptor.create(TICK129);
					adaptor.addChild(root_0, TICK129_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:5: CARET ^ periodShift
					{
					CARET130=(Token)match(input,CARET,FOLLOW_CARET_in_timedExpression5920); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CARET130_tree = (BAST)adaptor.create(CARET130);
					root_0 = (BAST)adaptor.becomeRoot(CARET130_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_timedExpression5923);
					periodShift131=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift131.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:992:1: timedSubject : ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value );
	public final BLESS3Parser.timedSubject_return timedSubject() throws RecognitionException {
		BLESS3Parser.timedSubject_return retval = new BLESS3Parser.timedSubject_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalExpression132 =null;
		ParserRuleReturnScope parenthesizedSubexpression133 =null;
		ParserRuleReturnScope recordTerm134 =null;
		ParserRuleReturnScope invocation135 =null;
		ParserRuleReturnScope value136 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:992:13: ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value )
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
				else if ( (LA68_3==EOF||(LA68_3 >= AL && LA68_3 <= AMPERSAND)||LA68_3==AT_SIGN||(LA68_3 >= BOX && LA68_3 <= COLON)||(LA68_3 >= COMMA && LA68_3 <= COMMADOT)||LA68_3==CVP||(LA68_3 >= DIVIDE && LA68_3 <= DOTDOT)||LA68_3==EQ||LA68_3==EXP||(LA68_3 >= GT && LA68_3 <= GUARD)||(LA68_3 >= ID && LA68_3 <= IMP)||(LA68_3 >= LASS && LA68_3 <= LBRACKET)||LA68_3==LCURLY||LA68_3==LITERAL_and||LA68_3==LITERAL_are||LA68_3==LITERAL_computation||LA68_3==LITERAL_declare||(LA68_3 >= LITERAL_div && LA68_3 <= LITERAL_else)||LA68_3==LITERAL_exception||(LA68_3 >= LITERAL_fetchadd && LA68_3 <= LITERAL_fi)||(LA68_3 >= LITERAL_for && LA68_3 <= LITERAL_forall)||(LA68_3 >= LITERAL_if && LA68_3 <= LITERAL_iff)||(LA68_3 >= LITERAL_implies && LA68_3 <= LITERAL_in)||LA68_3==LITERAL_invariant||LA68_3==LITERAL_mod||LA68_3==LITERAL_of||LA68_3==LITERAL_or||LA68_3==LITERAL_rem||LA68_3==LITERAL_setmode||LA68_3==LITERAL_skip||LA68_3==LITERAL_states||(LA68_3 >= LITERAL_swap && LA68_3 <= LITERAL_then)||LA68_3==LITERAL_transitions||LA68_3==LITERAL_until||LA68_3==LITERAL_when||LA68_3==LITERAL_while||LA68_3==LITERAL_xor||LA68_3==LT||LA68_3==MINUS||LA68_3==NEQ||LA68_3==OLD_NEQ||LA68_3==PLUS||LA68_3==PLUS_EQUALS||LA68_3==QQ||(LA68_3 >= QUESTION && LA68_3 <= RCURLY)||LA68_3==RPAREN||LA68_3==SEMICOLON||LA68_3==TICK||LA68_3==TIMES||LA68_3==VERT) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:993:3: ( LPAREN LITERAL_if )=> conditionalExpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5948);
					conditionalExpression132=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression132.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:994:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5954);
					parenthesizedSubexpression133=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression133.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:5: ( LBRACKET ID COLON )=> recordTerm
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordTerm_in_timedSubject5971);
					recordTerm134=recordTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordTerm134.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:5: ( ID LPAREN )=> invocation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_invocation_in_timedSubject5984);
					invocation135=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, invocation135.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:5: value
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_value_in_timedSubject5992);
					value136=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value136.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1000:1: parenthesizedSubexpression : LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN ;
	public final BLESS3Parser.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		BLESS3Parser.parenthesizedSubexpression_return retval = new BLESS3Parser.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN137=null;
		Token QQ139=null;
		Token COLON141=null;
		Token RPAREN143=null;
		ParserRuleReturnScope caseexpression =null;
		ParserRuleReturnScope expression138 =null;
		ParserRuleReturnScope expression140 =null;
		ParserRuleReturnScope expression142 =null;

		BAST LPAREN137_tree=null;
		BAST QQ139_tree=null;
		BAST COLON141_tree=null;
		BAST RPAREN143_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1000:27: ( LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1001:2: LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6003); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN137_tree = (BAST)adaptor.create(LPAREN137);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN137_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1002:2: ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:4: ( expression ( QQ ^ expression COLON ! expression )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:4: ( expression ( QQ ^ expression COLON ! expression )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:6: expression ( QQ ^ expression COLON ! expression )?
					{
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6016);
					expression138=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression138.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:17: ( QQ ^ expression COLON ! expression )?
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==QQ) ) {
						alt69=1;
					}
					switch (alt69) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:19: QQ ^ expression COLON ! expression
							{
							QQ139=(Token)match(input,QQ,FOLLOW_QQ_in_parenthesizedSubexpression6020); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							QQ139_tree = (BAST)adaptor.create(QQ139);
							root_0 = (BAST)adaptor.becomeRoot(QQ139_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6023);
							expression140=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression140.getTree());

							COLON141=(Token)match(input,COLON,FOLLOW_COLON_in_parenthesizedSubexpression6025); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6028);
							expression142=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression142.getTree());

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:4: caseexpression= caseExpression
					{
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6046);
					caseexpression=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseexpression.getTree());

					}
					break;

			}

			RPAREN143=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6054); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN143_tree = (BAST)adaptor.create(RPAREN143);
			adaptor.addChild(root_0, RPAREN143_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1010:1: caseExpression : LITERAL_case ^ ( caseChoice )+ ;
	public final BLESS3Parser.caseExpression_return caseExpression() throws RecognitionException {
		BLESS3Parser.caseExpression_return retval = new BLESS3Parser.caseExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_case144=null;
		ParserRuleReturnScope caseChoice145 =null;

		BAST LITERAL_case144_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1010:15: ( LITERAL_case ^ ( caseChoice )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1011:3: LITERAL_case ^ ( caseChoice )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_case144=(Token)match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6064); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_case144_tree = (BAST)adaptor.create(LITERAL_case144);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_case144_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1011:17: ( caseChoice )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1011:17: caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6067);
					caseChoice145=caseChoice();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseChoice145.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:1: caseChoice : LPAREN !bool= expression IMP ^exp= expression RPAREN !;
	public final BLESS3Parser.caseChoice_return caseChoice() throws RecognitionException {
		BLESS3Parser.caseChoice_return retval = new BLESS3Parser.caseChoice_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN146=null;
		Token IMP147=null;
		Token RPAREN148=null;
		ParserRuleReturnScope bool =null;
		ParserRuleReturnScope exp =null;

		BAST LPAREN146_tree=null;
		BAST IMP147_tree=null;
		BAST RPAREN148_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:3: ( LPAREN !bool= expression IMP ^exp= expression RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1016:3: LPAREN !bool= expression IMP ^exp= expression RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN146=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_caseChoice6083); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseChoice6088);
			bool=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

			IMP147=(Token)match(input,IMP,FOLLOW_IMP_in_caseChoice6090); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP147_tree = (BAST)adaptor.create(IMP147);
			root_0 = (BAST)adaptor.becomeRoot(IMP147_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_caseChoice6095);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN148=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_caseChoice6097); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:1: conditionalExpression : lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) ;
	public final BLESS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		BLESS3Parser.conditionalExpression_return retval = new BLESS3Parser.conditionalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lp=null;
		Token rp=null;
		Token LITERAL_if149=null;
		Token LITERAL_then150=null;
		Token LITERAL_else151=null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope f =null;

		BAST lp_tree=null;
		BAST rp_tree=null;
		BAST LITERAL_if149_tree=null;
		BAST LITERAL_then150_tree=null;
		BAST LITERAL_else151_tree=null;
		RewriteRuleTokenStream stream_LITERAL_else=new RewriteRuleTokenStream(adaptor,"token LITERAL_else");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LITERAL_then=new RewriteRuleTokenStream(adaptor,"token LITERAL_then");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:22: (lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1020:3: lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression6113); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			LITERAL_if149=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_conditionalExpression6115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(LITERAL_if149);

			pushFollow(FOLLOW_expression_in_conditionalExpression6119);
			pred=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(pred.getTree());
			LITERAL_then150=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conditionalExpression6121); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_then.add(LITERAL_then150);

			pushFollow(FOLLOW_expression_in_conditionalExpression6125);
			t=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(t.getTree());
			LITERAL_else151=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_conditionalExpression6127); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_else.add(LITERAL_else151);

			pushFollow(FOLLOW_expression_in_conditionalExpression6131);
			f=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(f.getTree());
			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression6135); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: f, rp, lp, pred, t
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
			// 1021:5: -> ^( $lp ^( QQ $pred $t $f) $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1021:8: ^( $lp ^( QQ $pred $t $f) $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1021:15: ^( QQ $pred $t $f)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1024:1: recordTerm : LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) ;
	public final BLESS3Parser.recordTerm_return recordTerm() throws RecognitionException {
		BLESS3Parser.recordTerm_return retval = new BLESS3Parser.recordTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token typeid=null;
		Token LBRACKET152=null;
		Token COLON153=null;
		Token RBRACKET154=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		BAST typeid_tree=null;
		BAST LBRACKET152_tree=null;
		BAST COLON153_tree=null;
		BAST RBRACKET154_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_recordValue=new RewriteRuleSubtreeStream(adaptor,"rule recordValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1025:3: ( LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1026:3: LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET
			{
			LBRACKET152=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_recordTerm6181); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET152);

			typeid=(Token)match(input,ID,FOLLOW_ID_in_recordTerm6185); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(typeid);

			COLON153=(Token)match(input,COLON,FOLLOW_COLON_in_recordTerm6187); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON153);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1026:31: (prv+= recordValue )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1026:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6191);
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

			RBRACKET154=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_recordTerm6194); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET154);

			// AST REWRITE
			// elements: prv, typeid
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
			// 1027:5: -> ^( RECORD_TERM $typeid ( $prv)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1027:8: ^( RECORD_TERM $typeid ( $prv)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:1: recordValue : identifier ARROW ^ value SEMICOLON !;
	public final BLESS3Parser.recordValue_return recordValue() throws RecognitionException {
		BLESS3Parser.recordValue_return retval = new BLESS3Parser.recordValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ARROW156=null;
		Token SEMICOLON158=null;
		ParserRuleReturnScope identifier155 =null;
		ParserRuleReturnScope value157 =null;

		BAST ARROW156_tree=null;
		BAST SEMICOLON158_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:3: ( identifier ARROW ^ value SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1032:20: identifier ARROW ^ value SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_recordValue6230);
			identifier155=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier155.getTree());

			ARROW156=(Token)match(input,ARROW,FOLLOW_ARROW_in_recordValue6232); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARROW156_tree = (BAST)adaptor.create(ARROW156);
			root_0 = (BAST)adaptor.becomeRoot(ARROW156_tree, root_0);
			}

			pushFollow(FOLLOW_value_in_recordValue6235);
			value157=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value157.getTree());

			SEMICOLON158=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordValue6237); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1035:1: periodShift : (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1035:12: ( (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:2: (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:2: (m= MINUS )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==MINUS) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:4: m= MINUS
					{
					m=(Token)match(input,MINUS,FOLLOW_MINUS_in_periodShift6257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(m);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1037:2: (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:4: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift6270);
					v=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(v.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1040:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1040:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1040:5: lp= LPAREN ie= indexExpression rp= RPAREN
					{
					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_periodShift6284); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					pushFollow(FOLLOW_indexExpression_in_periodShift6288);
					ie=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpression.add(ie.getTree());
					rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_periodShift6292); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(rp);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: lp, rp, ie, ie, v, v, rp, lp
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
			// 1042:2: -> {m!=null&&v!=null}? ^( UNARY_MINUS $v)
			if (m!=null&&v!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1042:25: ^( UNARY_MINUS $v)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1043:2: -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) )
			if (m!=null&&ie!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:26: ^( UNARY_MINUS ^( $lp $ie $rp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:41: ^( $lp $ie $rp)
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

			else // 1044:2: -> {m==null&&v!=null}? $v
			if (m==null&&v!=null) {
				adaptor.addChild(root_0, stream_v.nextTree());
			}

			else // 1045:2: -> ^( $lp $ie $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1045:5: ^( $lp $ie $rp)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:1: indexExpression : periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? ;
	public final BLESS3Parser.indexExpression_return indexExpression() throws RecognitionException {
		BLESS3Parser.indexExpression_return retval = new BLESS3Parser.indexExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS160=null;
		Token LITERAL_div162=null;
		Token LITERAL_mod164=null;
		Token LITERAL_rem166=null;
		Token PLUS168=null;
		Token PLUS170=null;
		Token TIMES172=null;
		Token TIMES174=null;
		ParserRuleReturnScope periodShift159 =null;
		ParserRuleReturnScope periodShift161 =null;
		ParserRuleReturnScope periodShift163 =null;
		ParserRuleReturnScope periodShift165 =null;
		ParserRuleReturnScope periodShift167 =null;
		ParserRuleReturnScope periodShift169 =null;
		ParserRuleReturnScope periodShift171 =null;
		ParserRuleReturnScope periodShift173 =null;
		ParserRuleReturnScope periodShift175 =null;

		BAST MINUS160_tree=null;
		BAST LITERAL_div162_tree=null;
		BAST LITERAL_mod164_tree=null;
		BAST LITERAL_rem166_tree=null;
		BAST PLUS168_tree=null;
		BAST PLUS170_tree=null;
		BAST TIMES172_tree=null;
		BAST TIMES174_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:16: ( periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1049:2: periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_periodShift_in_indexExpression6372);
			periodShift159=periodShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift159.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1050:2: ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1051:4: MINUS ^ periodShift
					{
					MINUS160=(Token)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS160_tree = (BAST)adaptor.create(MINUS160);
					root_0 = (BAST)adaptor.becomeRoot(MINUS160_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6383);
					periodShift161=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift161.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1053:4: LITERAL_div ^ periodShift
					{
					LITERAL_div162=(Token)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6393); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_div162_tree = (BAST)adaptor.create(LITERAL_div162);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_div162_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6396);
					periodShift163=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift163.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1055:4: LITERAL_mod ^ periodShift
					{
					LITERAL_mod164=(Token)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6406); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_mod164_tree = (BAST)adaptor.create(LITERAL_mod164);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_mod164_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6409);
					periodShift165=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift165.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1057:4: LITERAL_rem ^ periodShift
					{
					LITERAL_rem166=(Token)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6419); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_rem166_tree = (BAST)adaptor.create(LITERAL_rem166);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_rem166_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6422);
					periodShift167=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift167.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:4: PLUS ^ periodShift ( PLUS ! periodShift )*
					{
					PLUS168=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6432); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS168_tree = (BAST)adaptor.create(PLUS168);
					root_0 = (BAST)adaptor.becomeRoot(PLUS168_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6435);
					periodShift169=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift169.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:22: ( PLUS ! periodShift )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==PLUS) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:24: PLUS ! periodShift
							{
							PLUS170=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6439); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6442);
							periodShift171=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift171.getTree());

							}
							break;

						default :
							break loop75;
						}
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:4: TIMES ^ periodShift ( TIMES ! periodShift )*
					{
					TIMES172=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6455); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES172_tree = (BAST)adaptor.create(TIMES172);
					root_0 = (BAST)adaptor.becomeRoot(TIMES172_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6458);
					periodShift173=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift173.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:23: ( TIMES ! periodShift )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==TIMES) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:25: TIMES ! periodShift
							{
							TIMES174=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6462); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6465);
							periodShift175=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift175.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1065:1: indexExpressionOrRange : indexExpression ( DOTDOT ^ indexExpression )? ;
	public final BLESS3Parser.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		BLESS3Parser.indexExpressionOrRange_return retval = new BLESS3Parser.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT177=null;
		ParserRuleReturnScope indexExpression176 =null;
		ParserRuleReturnScope indexExpression178 =null;

		BAST DOTDOT177_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1065:23: ( indexExpression ( DOTDOT ^ indexExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1066:2: indexExpression ( DOTDOT ^ indexExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6482);
			indexExpression176=indexExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression176.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1066:18: ( DOTDOT ^ indexExpression )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==DOTDOT) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1066:20: DOTDOT ^ indexExpression
					{
					DOTDOT177=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6486); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT177_tree = (BAST)adaptor.create(DOTDOT177);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT177_tree, root_0);
					}

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6489);
					indexExpression178=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression178.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:1: value : ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue );
	public final BLESS3Parser.value_return value() throws RecognitionException {
		BLESS3Parser.value_return retval = new BLESS3Parser.value_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout181=null;
		Token LITERAL_now182=null;
		Token LITERAL_tops183=null;
		ParserRuleReturnScope valueName179 =null;
		ParserRuleReturnScope constant180 =null;
		ParserRuleReturnScope enumerationValue184 =null;

		BAST LITERAL_timeout181_tree=null;
		BAST LITERAL_now182_tree=null;
		BAST LITERAL_tops183_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:6: ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue )
			int alt79=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA79_1 = input.LA(2);
				if ( (LA79_1==TICK) ) {
					int LA79_6 = input.LA(3);
					if ( (LA79_6==ID) ) {
						switch ( input.LA(4) ) {
						case ASSIGN:
						case DOLLAR:
						case DOT:
						case EXCLAMATION:
						case LBRACKET:
						case LPAREN:
						case QUESTION:
						case TILDE:
							{
							alt79=1;
							}
							break;
						case EOF:
						case AL:
						case AM:
						case AMPERSAND:
						case AT_SIGN:
						case BOX:
						case CARET:
						case COLON:
						case COMMA:
						case COMMACOMMA:
						case COMMADOT:
						case CVP:
						case DIVIDE:
						case DOTCOMMA:
						case DOTDOT:
						case EQ:
						case EXP:
						case GT:
						case GUARD:
						case ID:
						case IMP:
						case LASS:
						case LCURLY:
						case LITERAL_and:
						case LITERAL_are:
						case LITERAL_computation:
						case LITERAL_declare:
						case LITERAL_div:
						case LITERAL_do:
						case LITERAL_else:
						case LITERAL_exception:
						case LITERAL_fetchadd:
						case LITERAL_fetchand:
						case LITERAL_fetchor:
						case LITERAL_fetchxor:
						case LITERAL_fi:
						case LITERAL_for:
						case LITERAL_forall:
						case LITERAL_if:
						case LITERAL_iff:
						case LITERAL_implies:
						case LITERAL_in:
						case LITERAL_invariant:
						case LITERAL_mod:
						case LITERAL_of:
						case LITERAL_or:
						case LITERAL_rem:
						case LITERAL_setmode:
						case LITERAL_skip:
						case LITERAL_states:
						case LITERAL_swap:
						case LITERAL_that:
						case LITERAL_then:
						case LITERAL_transitions:
						case LITERAL_until:
						case LITERAL_when:
						case LITERAL_while:
						case LITERAL_xor:
						case LT:
						case MINUS:
						case NEQ:
						case OLD_NEQ:
						case PLUS:
						case PLUS_EQUALS:
						case QQ:
						case RASS:
						case RBRACKET:
						case RCON:
						case RCURLY:
						case RPAREN:
						case SEMICOLON:
						case TIMES:
						case VERT:
							{
							alt79=6;
							}
							break;
						case TICK:
							{
							int LA79_10 = input.LA(5);
							if ( (LA79_10==ASSIGN||LA79_10==LITERAL_count||LA79_10==LITERAL_fresh||LA79_10==LITERAL_updated) ) {
								alt79=1;
							}
							else if ( (LA79_10==EOF||(LA79_10 >= AL && LA79_10 <= AMPERSAND)||LA79_10==BOX||LA79_10==COLON||(LA79_10 >= COMMA && LA79_10 <= COMMADOT)||LA79_10==CVP||LA79_10==DIVIDE||(LA79_10 >= DOTCOMMA && LA79_10 <= DOTDOT)||LA79_10==EQ||LA79_10==EXP||(LA79_10 >= GT && LA79_10 <= GUARD)||(LA79_10 >= ID && LA79_10 <= IMP)||LA79_10==LASS||LA79_10==LCURLY||LA79_10==LITERAL_and||LA79_10==LITERAL_are||LA79_10==LITERAL_computation||LA79_10==LITERAL_declare||(LA79_10 >= LITERAL_div && LA79_10 <= LITERAL_else)||LA79_10==LITERAL_exception||(LA79_10 >= LITERAL_fetchadd && LA79_10 <= LITERAL_fi)||(LA79_10 >= LITERAL_for && LA79_10 <= LITERAL_forall)||(LA79_10 >= LITERAL_if && LA79_10 <= LITERAL_iff)||(LA79_10 >= LITERAL_implies && LA79_10 <= LITERAL_in)||LA79_10==LITERAL_invariant||LA79_10==LITERAL_mod||LA79_10==LITERAL_of||LA79_10==LITERAL_or||LA79_10==LITERAL_rem||LA79_10==LITERAL_setmode||LA79_10==LITERAL_skip||LA79_10==LITERAL_states||(LA79_10 >= LITERAL_swap && LA79_10 <= LITERAL_then)||LA79_10==LITERAL_transitions||LA79_10==LITERAL_until||LA79_10==LITERAL_when||LA79_10==LITERAL_while||LA79_10==LITERAL_xor||LA79_10==LT||LA79_10==MINUS||LA79_10==NEQ||LA79_10==OLD_NEQ||LA79_10==PLUS||LA79_10==PLUS_EQUALS||LA79_10==QQ||(LA79_10 >= RASS && LA79_10 <= RCURLY)||LA79_10==RPAREN||LA79_10==SEMICOLON||LA79_10==TIMES||LA79_10==VERT) ) {
								alt79=6;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 79, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 79, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA79_6==EOF||(LA79_6 >= AL && LA79_6 <= AMPERSAND)||LA79_6==BOX||LA79_6==COLON||(LA79_6 >= COMMA && LA79_6 <= COMMADOT)||LA79_6==CVP||LA79_6==DIVIDE||(LA79_6 >= DOTCOMMA && LA79_6 <= DOTDOT)||LA79_6==EQ||LA79_6==EXP||(LA79_6 >= GT && LA79_6 <= GUARD)||LA79_6==IMP||LA79_6==LASS||LA79_6==LCURLY||LA79_6==LITERAL_and||LA79_6==LITERAL_are||LA79_6==LITERAL_computation||(LA79_6 >= LITERAL_count && LA79_6 <= LITERAL_declare)||(LA79_6 >= LITERAL_div && LA79_6 <= LITERAL_else)||LA79_6==LITERAL_exception||(LA79_6 >= LITERAL_fetchadd && LA79_6 <= LITERAL_fi)||(LA79_6 >= LITERAL_for && LA79_6 <= LITERAL_fresh)||(LA79_6 >= LITERAL_if && LA79_6 <= LITERAL_iff)||(LA79_6 >= LITERAL_implies && LA79_6 <= LITERAL_in)||LA79_6==LITERAL_invariant||LA79_6==LITERAL_mod||LA79_6==LITERAL_of||LA79_6==LITERAL_or||LA79_6==LITERAL_rem||LA79_6==LITERAL_setmode||LA79_6==LITERAL_skip||LA79_6==LITERAL_states||(LA79_6 >= LITERAL_swap && LA79_6 <= LITERAL_then)||LA79_6==LITERAL_transitions||(LA79_6 >= LITERAL_until && LA79_6 <= LITERAL_updated)||LA79_6==LITERAL_when||LA79_6==LITERAL_while||LA79_6==LITERAL_xor||LA79_6==LT||LA79_6==MINUS||LA79_6==NEQ||LA79_6==OLD_NEQ||LA79_6==PLUS||LA79_6==PLUS_EQUALS||LA79_6==QQ||(LA79_6 >= RASS && LA79_6 <= RCURLY)||LA79_6==RPAREN||LA79_6==SEMICOLON||LA79_6==TIMES||LA79_6==VERT) ) {
						alt79=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 79, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA79_1==EOF||(LA79_1 >= AL && LA79_1 <= AMPERSAND)||LA79_1==AT_SIGN||(LA79_1 >= BOX && LA79_1 <= COLON)||(LA79_1 >= COMMA && LA79_1 <= COMMADOT)||LA79_1==CVP||(LA79_1 >= DIVIDE && LA79_1 <= DOTDOT)||LA79_1==EQ||LA79_1==EXP||(LA79_1 >= GT && LA79_1 <= GUARD)||(LA79_1 >= ID && LA79_1 <= IMP)||(LA79_1 >= LASS && LA79_1 <= LBRACKET)||LA79_1==LCURLY||LA79_1==LITERAL_and||LA79_1==LITERAL_are||LA79_1==LITERAL_computation||LA79_1==LITERAL_declare||(LA79_1 >= LITERAL_div && LA79_1 <= LITERAL_else)||LA79_1==LITERAL_exception||(LA79_1 >= LITERAL_fetchadd && LA79_1 <= LITERAL_fi)||(LA79_1 >= LITERAL_for && LA79_1 <= LITERAL_forall)||(LA79_1 >= LITERAL_if && LA79_1 <= LITERAL_iff)||(LA79_1 >= LITERAL_implies && LA79_1 <= LITERAL_in)||LA79_1==LITERAL_invariant||LA79_1==LITERAL_mod||LA79_1==LITERAL_of||LA79_1==LITERAL_or||LA79_1==LITERAL_rem||LA79_1==LITERAL_setmode||LA79_1==LITERAL_skip||LA79_1==LITERAL_states||(LA79_1 >= LITERAL_swap && LA79_1 <= LITERAL_then)||LA79_1==LITERAL_transitions||LA79_1==LITERAL_until||LA79_1==LITERAL_when||LA79_1==LITERAL_while||LA79_1==LITERAL_xor||LA79_1==LT||LA79_1==MINUS||LA79_1==NEQ||LA79_1==OLD_NEQ||LA79_1==PLUS||LA79_1==PLUS_EQUALS||LA79_1==QQ||(LA79_1 >= QUESTION && LA79_1 <= RCURLY)||LA79_1==RPAREN||LA79_1==SEMICOLON||LA79_1==TIMES||LA79_1==VERT) ) {
					alt79=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 79, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1072:3: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_value6505);
					valueName179=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName179.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1074:3: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_value6513);
					constant180=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant180.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1076:3: LITERAL_timeout
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout181=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6521); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout181_tree = (BAST)adaptor.create(LITERAL_timeout181);
					adaptor.addChild(root_0, LITERAL_timeout181_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:3: LITERAL_now
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_now182=(Token)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6529); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_now182_tree = (BAST)adaptor.create(LITERAL_now182);
					adaptor.addChild(root_0, LITERAL_now182_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1080:3: LITERAL_tops
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_tops183=(Token)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6537); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_tops183_tree = (BAST)adaptor.create(LITERAL_tops183);
					adaptor.addChild(root_0, LITERAL_tops183_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:3: enumerationValue
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationValue_in_value6545);
					enumerationValue184=enumerationValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationValue184.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:1: valueName : id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id;
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
		Token RPAREN185=null;
		Token RBRACKET186=null;
		Token LBRACKET187=null;
		Token RBRACKET188=null;
		Token DOT189=null;
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
		BAST RPAREN185_tree=null;
		BAST RBRACKET186_tree=null;
		BAST LBRACKET187_tree=null;
		BAST RBRACKET188_tree=null;
		BAST DOT189_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:10: (id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1086:3: id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_valueName6560); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:5: (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==DOLLAR) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:7: dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN
					{
					dol=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6574); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOLLAR.add(dol);

					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueName6578); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:31: (pr= functionParameters )?
					int alt80=2;
					int LA80_0 = input.LA(1);
					if ( (LA80_0==ID) ) {
						alt80=1;
					}
					switch (alt80) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:31: pr= functionParameters
							{
							pushFollow(FOLLOW_functionParameters_in_valueName6583);
							pr=functionParameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_functionParameters.add(pr.getTree());
							}
							break;

					}

					RPAREN185=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueName6586); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN185);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1089:4: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==LBRACKET) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1089:6: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6598); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6602);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET186=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6604); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET186);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1090:6: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop82:
					while (true) {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==LBRACKET) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1090:8: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET187=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6614); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET187);

							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6618);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET188=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6620); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET188);

							}
							break;

						default :
							break loop82;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:4: (dot= DOT pn+= partialName ( DOT pn+= partialName )* )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DOT) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:6: dot= DOT pn+= partialName ( DOT pn+= partialName )*
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6636); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					pushFollow(FOLLOW_partialName_in_valueName6640);
					pn=partialName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
					if (list_pn==null) list_pn=new ArrayList<Object>();
					list_pn.add(pn.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:30: ( DOT pn+= partialName )*
					loop84:
					while (true) {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==DOT) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:32: DOT pn+= partialName
							{
							DOT189=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6644); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(DOT189);

							pushFollow(FOLLOW_partialName_in_valueName6648);
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

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:5: (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:8: q= QUESTION
					{
					q=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6665); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(q);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:7: t= TICK fresh= LITERAL_fresh
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6677); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					fresh=(Token)match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6681); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_fresh.add(fresh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:7: t= TICK count= LITERAL_count
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6692); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					count=(Token)match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6696); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_count.add(count);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1095:7: t= TICK updated= LITERAL_updated
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6706); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					updated=(Token)match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6710); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_updated.add(updated);

					}
					break;

			}

			// AST REWRITE
			// elements: lb, t, pr, lb, id, id, count, id, id, pn, updated, t, dot, t, id, array_index, pn, id, id, DOT, q, id, dol, fresh, id, dot, array_index
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
			// 1098:3: -> {dol!=null}? ^( $id $dol $pr)
			if (dol!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1098:19: ^( $id $dol $pr)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				adaptor.addChild(root_1, stream_dol.nextNode());
				adaptor.addChild(root_1, stream_pr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1099:3: -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
			if (lb!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1099:29: ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1099:36: ^( $lb ( $array_index)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1099:59: ^( $dot ( $pn)+ )
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

			else // 1100:3: -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT )
			if (lb!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1100:29: ^( $id ^( $lb ( $array_index)+ ) DOT )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1100:36: ^( $lb ( $array_index)+ )
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

			else // 1101:3: -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) )
			if (lb==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1101:29: ^( $id ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1101:36: ^( $dot ( $pn)+ )
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

			else // 1102:3: -> {q!=null}? ^( $q $id)
			if (q!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:17: ^( $q $id)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_q.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1103:3: -> {fresh!=null}? ^( $t $id $fresh)
			if (fresh!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:21: ^( $t $id $fresh)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fresh.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1104:3: -> {count!=null}? ^( $t $id $count)
			if (count!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:21: ^( $t $id $count)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_count.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1105:3: -> {updated!=null}? ^( $t $id $updated)
			if (updated!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1105:23: ^( $t $id $updated)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_updated.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1106:3: -> $id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1109:1: functionParameters :parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? ;
	public final BLESS3Parser.functionParameters_return functionParameters() throws RecognitionException {
		BLESS3Parser.functionParameters_return retval = new BLESS3Parser.functionParameters_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA190=null;
		Token COMMA191=null;
		List<Object> list_parameters=null;
		RuleReturnScope parameters = null;
		BAST COMMA190_tree=null;
		BAST COMMA191_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1109:19: (parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1110:3: parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6918);
			parameters=formalExpressionPair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

			if (list_parameters==null) list_parameters=new ArrayList<Object>();
			list_parameters.add(parameters.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1110:36: ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==COMMA) ) {
				alt88=1;
			}
			switch (alt88) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1110:38: COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )*
					{
					COMMA190=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6922); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA190_tree = (BAST)adaptor.create(COMMA190);
					root_0 = (BAST)adaptor.becomeRoot(COMMA190_tree, root_0);
					}

					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6927);
					parameters=formalExpressionPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1111:3: ( COMMA !parameters+= formalExpressionPair )*
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==COMMA) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1111:5: COMMA !parameters+= formalExpressionPair
							{
							COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6934); if (state.failed) return retval;
							pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6939);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:1: formalExpressionPair : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		BLESS3Parser.formalExpressionPair_return retval = new BLESS3Parser.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON192=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON192_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:21: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_formalExpressionPair6957); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON192=(Token)match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6965); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON192_tree = (BAST)adaptor.create(COLON192);
			root_0 = (BAST)adaptor.becomeRoot(COLON192_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_formalExpressionPair6970);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1119:1: partialName : record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id;
	public final BLESS3Parser.partialName_return partialName() throws RecognitionException {
		BLESS3Parser.partialName_return retval = new BLESS3Parser.partialName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token record_id=null;
		Token lb=null;
		Token RBRACKET193=null;
		Token LBRACKET194=null;
		Token RBRACKET195=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		BAST record_id_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET193_tree=null;
		BAST LBRACKET194_tree=null;
		BAST RBRACKET195_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1119:12: (record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1120:2: record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			{
			record_id=(Token)match(input,ID,FOLLOW_ID_in_partialName6983); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(record_id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:3: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LBRACKET) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:5: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6993); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6997);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET193=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName6999); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET193);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1122:3: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop89:
					while (true) {
						int alt89=2;
						int LA89_0 = input.LA(1);
						if ( (LA89_0==LBRACKET) ) {
							alt89=1;
						}

						switch (alt89) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1122:5: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET194=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName7006); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET194);

							pushFollow(FOLLOW_indexExpressionOrRange_in_partialName7010);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET195=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName7012); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET195);

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
			// elements: lb, record_id, array_index, record_id
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
			// 1123:2: -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) )
			if (lb!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1123:17: ^( $record_id ^( $lb ( $array_index)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_record_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1123:31: ^( $lb ( $array_index)+ )
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

			else // 1124:2: -> $record_id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1127:1: constant : ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null );
	public final BLESS3Parser.constant_return constant() throws RecognitionException {
		BLESS3Parser.constant_return retval = new BLESS3Parser.constant_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AADL_STRING_LITERAL197=null;
		Token LITERAL_true198=null;
		Token LITERAL_false199=null;
		Token LITERAL_null200=null;
		ParserRuleReturnScope quantity196 =null;

		BAST AADL_STRING_LITERAL197_tree=null;
		BAST LITERAL_true198_tree=null;
		BAST LITERAL_false199_tree=null;
		BAST LITERAL_null200_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1127:9: ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1128:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_constant7060);
					quantity196=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity196.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1130:3: AADL_STRING_LITERAL
					{
					root_0 = (BAST)adaptor.nil();


					AADL_STRING_LITERAL197=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant7068); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AADL_STRING_LITERAL197_tree = (BAST)adaptor.create(AADL_STRING_LITERAL197);
					adaptor.addChild(root_0, AADL_STRING_LITERAL197_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1132:3: LITERAL_true
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_true198=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant7076); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_true198_tree = (BAST)adaptor.create(LITERAL_true198);
					adaptor.addChild(root_0, LITERAL_true198_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:3: LITERAL_false
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_false199=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant7084); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_false199_tree = (BAST)adaptor.create(LITERAL_false199);
					adaptor.addChild(root_0, LITERAL_false199_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1136:3: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null200=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant7092); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null200_tree = (BAST)adaptor.create(LITERAL_null200);
					adaptor.addChild(root_0, LITERAL_null200_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1140:1: quantity : number= aNumber (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )? -> ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? ) ;
	public final BLESS3Parser.quantity_return quantity() throws RecognitionException {
		BLESS3Parser.quantity_return retval = new BLESS3Parser.quantity_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token u=null;
		Token scalar=null;
		Token whole=null;
		Token char_literal201=null;
		ParserRuleReturnScope number =null;

		BAST u_tree=null;
		BAST scalar_tree=null;
		BAST whole_tree=null;
		BAST char_literal201_tree=null;
		RewriteRuleTokenStream stream_LITERAL_whole=new RewriteRuleTokenStream(adaptor,"token LITERAL_whole");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_294=new RewriteRuleTokenStream(adaptor,"token 294");
		RewriteRuleTokenStream stream_LITERAL_scalar=new RewriteRuleTokenStream(adaptor,"token LITERAL_scalar");
		RewriteRuleSubtreeStream stream_aNumber=new RewriteRuleSubtreeStream(adaptor,"rule aNumber");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1140:9: (number= aNumber (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )? -> ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1141:3: number= aNumber (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )?
			{
			pushFollow(FOLLOW_aNumber_in_quantity7109);
			number=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_aNumber.add(number.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1142:3: (u= ID '%' |scalar= LITERAL_scalar |whole= LITERAL_whole )?
			int alt92=4;
			switch ( input.LA(1) ) {
				case ID:
					{
					int LA92_1 = input.LA(2);
					if ( (LA92_1==294) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1142:5: u= ID '%'
					{
					u=(Token)match(input,ID,FOLLOW_ID_in_quantity7118); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(u);

					char_literal201=(Token)match(input,294,FOLLOW_294_in_quantity7120); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_294.add(char_literal201);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1143:3: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7129); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_scalar.add(scalar);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1143:27: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7135); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_whole.add(whole);

					}
					break;

			}

			// AST REWRITE
			// elements: whole, number, scalar, u
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
			// 1144:4: -> ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1144:7: ^( QUANTITY $number ( $u)? ( $scalar)? ( $whole)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, "QUANTITY"), root_1);
				adaptor.addChild(root_1, stream_number.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1144:28: ( $u)?
				if ( stream_u.hasNext() ) {
					adaptor.addChild(root_1, stream_u.nextNode());
				}
				stream_u.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1144:32: ( $scalar)?
				if ( stream_scalar.hasNext() ) {
					adaptor.addChild(root_1, stream_scalar.nextNode());
				}
				stream_scalar.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1144:41: ( $whole)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1147:1: aNumber : (lit= NUMBER |property= propertyReference |propertyConstant= QCLREF );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1147:8: (lit= NUMBER |property= propertyReference |propertyConstant= QCLREF )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:2: lit= NUMBER
					{
					root_0 = (BAST)adaptor.nil();


					lit=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7179); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					lit_tree = (BAST)adaptor.create(lit);
					adaptor.addChild(root_0, lit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1149:4: property= propertyReference
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyReference_in_aNumber7186);
					property=propertyReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, property.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1150:4: propertyConstant= QCLREF
					{
					root_0 = (BAST)adaptor.nil();


					propertyConstant=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_aNumber7193); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1153:1: propertyReference : ( OCTOTHORPE ^pname= QCLREF (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )* |component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )* );
	public final BLESS3Parser.propertyReference_return propertyReference() throws RecognitionException {
		BLESS3Parser.propertyReference_return retval = new BLESS3Parser.propertyReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pname=null;
		Token spname=null;
		Token component=null;
		Token cpname=null;
		Token OCTOTHORPE202=null;
		Token LITERAL_self203=null;
		Token OCTOTHORPE204=null;
		Token OCTOTHORPE205=null;
		List<Object> list_field=null;
		RuleReturnScope field = null;
		BAST pname_tree=null;
		BAST spname_tree=null;
		BAST component_tree=null;
		BAST cpname_tree=null;
		BAST OCTOTHORPE202_tree=null;
		BAST LITERAL_self203_tree=null;
		BAST OCTOTHORPE204_tree=null;
		BAST OCTOTHORPE205_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1153:18: ( OCTOTHORPE ^pname= QCLREF (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )* |component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )* )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:2: OCTOTHORPE ^pname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					OCTOTHORPE202=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7207); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE202_tree = (BAST)adaptor.create(OCTOTHORPE202);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE202_tree, root_0);
					}

					pname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7212); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					pname_tree = (BAST)adaptor.create(pname);
					adaptor.addChild(root_0, pname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1155:4: (field+= propertyField )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==DOT||LA94_0==LBRACKET) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1155:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7223);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1157:4: LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_self203=(Token)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7233); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_self203_tree = (BAST)adaptor.create(LITERAL_self203);
					adaptor.addChild(root_0, LITERAL_self203_tree);
					}

					OCTOTHORPE204=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7235); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE204_tree = (BAST)adaptor.create(OCTOTHORPE204);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE204_tree, root_0);
					}

					spname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7240); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					spname_tree = (BAST)adaptor.create(spname);
					adaptor.addChild(root_0, spname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1158:4: (field+= propertyField )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==DOT||LA95_0==LBRACKET) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1158:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7251);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:4: component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					component=(Token)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7261); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					component_tree = (BAST)adaptor.create(component);
					adaptor.addChild(root_0, component_tree);
					}

					OCTOTHORPE205=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7267); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE205_tree = (BAST)adaptor.create(OCTOTHORPE205);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE205_tree, root_0);
					}

					cpname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					cpname_tree = (BAST)adaptor.create(cpname);
					adaptor.addChild(root_0, cpname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:5: (field+= propertyField )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==DOT||LA96_0==LBRACKET) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1161:7: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7284);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1165:1: propertyField : ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) );
	public final BLESS3Parser.propertyField_return propertyField() throws RecognitionException {
		BLESS3Parser.propertyField_return retval = new BLESS3Parser.propertyField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token index=null;
		Token var=null;
		Token pf=null;
		Token upper=null;
		Token lower=null;
		Token LBRACKET206=null;
		Token RBRACKET207=null;
		Token DOT208=null;

		BAST index_tree=null;
		BAST var_tree=null;
		BAST pf_tree=null;
		BAST upper_tree=null;
		BAST lower_tree=null;
		BAST LBRACKET206_tree=null;
		BAST RBRACKET207_tree=null;
		BAST DOT208_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1165:14: ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:2: LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !
					{
					root_0 = (BAST)adaptor.nil();


					LBRACKET206=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7299); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACKET206_tree = (BAST)adaptor.create(LBRACKET206);
					root_0 = (BAST)adaptor.becomeRoot(LBRACKET206_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:12: (index= NUMBER |var= ID )
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:13: index= NUMBER
							{
							index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7305); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							index_tree = (BAST)adaptor.create(index);
							adaptor.addChild(root_0, index_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:28: var= ID
							{
							var=(Token)match(input,ID,FOLLOW_ID_in_propertyField7311); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							var_tree = (BAST)adaptor.create(var);
							adaptor.addChild(root_0, var_tree);
							}

							}
							break;

					}

					RBRACKET207=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_propertyField7320); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:4: DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					{
					root_0 = (BAST)adaptor.nil();


					DOT208=(Token)match(input,DOT,FOLLOW_DOT_in_propertyField7328); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT208_tree = (BAST)adaptor.create(DOT208);
					root_0 = (BAST)adaptor.becomeRoot(DOT208_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:10: (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:11: pf= ID
							{
							pf=(Token)match(input,ID,FOLLOW_ID_in_propertyField7335); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							pf_tree = (BAST)adaptor.create(pf);
							adaptor.addChild(root_0, pf_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:19: upper= LITERAL_upper_bound
							{
							upper=(Token)match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7341); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							upper_tree = (BAST)adaptor.create(upper);
							adaptor.addChild(root_0, upper_tree);
							}

							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:47: lower= LITERAL_lower_bound
							{
							lower=(Token)match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7347); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1173:1: actionSubclause : (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1173:16: ( (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:2: (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:11: (no_proof= DO_NOT_PROVE )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==DO_NOT_PROVE) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:11: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7367); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:16: (throws_clause= throwsClause )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==LITERAL_throws) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:16: throws_clause= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7374);
					throws_clause=throwsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_throwsClause.add(throws_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1176:16: (assert_clause= assertClause )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LITERAL_assert) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1176:16: assert_clause= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7382);
					assert_clause=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(assert_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:3: (pre= LITERAL_pre precondition= assertion )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LITERAL_pre) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:5: pre= LITERAL_pre precondition= assertion
					{
					pre=(Token)match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7393); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_pre.add(pre);

					pushFollow(FOLLOW_assertion_in_actionSubclause7397);
					precondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(precondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:3: (post= LITERAL_post postcondition= assertion )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LITERAL_post) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:5: post= LITERAL_post postcondition= assertion
					{
					post=(Token)match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7408); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_post.add(post);

					pushFollow(FOLLOW_assertion_in_actionSubclause7412);
					postcondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(postcondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:3: (inv= LITERAL_invariant invariant= assertion )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LITERAL_invariant) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:5: inv= LITERAL_invariant invariant= assertion
					{
					inv=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7424); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(inv);

					pushFollow(FOLLOW_assertion_in_actionSubclause7428);
					invariant=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(invariant.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7438);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: postcondition, LITERAL_invariant, elq, assert_clause, precondition, LITERAL_pre, throws_clause, no_proof, LITERAL_post, invariant
			// token labels: no_proof
			// rule labels: assert_clause, throws_clause, elq, precondition, postcondition, retval, invariant
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_assert_clause=new RewriteRuleSubtreeStream(adaptor,"rule assert_clause",assert_clause!=null?assert_clause.getTree():null);
			RewriteRuleSubtreeStream stream_throws_clause=new RewriteRuleSubtreeStream(adaptor,"rule throws_clause",throws_clause!=null?throws_clause.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_precondition=new RewriteRuleSubtreeStream(adaptor,"rule precondition",precondition!=null?precondition.getTree():null);
			RewriteRuleSubtreeStream stream_postcondition=new RewriteRuleSubtreeStream(adaptor,"rule postcondition",postcondition!=null?postcondition.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_invariant=new RewriteRuleSubtreeStream(adaptor,"rule invariant",invariant!=null?invariant.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1181:3: -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1181:6: ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION_SUBCLAUSE, "ACTION_SUBCLAUSE"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1181:27: ( $no_proof)?
				if ( stream_no_proof.hasNext() ) {
					adaptor.addChild(root_1, stream_no_proof.nextNode());
				}
				stream_no_proof.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1181:38: ( $throws_clause)?
				if ( stream_throws_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_clause.nextTree());
				}
				stream_throws_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1181:54: ( $assert_clause)?
				if ( stream_assert_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_assert_clause.nextTree());
				}
				stream_assert_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1181:69: ^( LITERAL_pre ( $precondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_pre.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1181:85: ( $precondition)?
				if ( stream_precondition.hasNext() ) {
					adaptor.addChild(root_2, stream_precondition.nextTree());
				}
				stream_precondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:6: ^( LITERAL_post ( $postcondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_post.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:23: ( $postcondition)?
				if ( stream_postcondition.hasNext() ) {
					adaptor.addChild(root_2, stream_postcondition.nextTree());
				}
				stream_postcondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:40: ^( LITERAL_invariant $invariant)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:1: throwsClause : LITERAL_throws ^ (exceptions+= ID )+ ;
	public final BLESS3Parser.throwsClause_return throwsClause() throws RecognitionException {
		BLESS3Parser.throwsClause_return retval = new BLESS3Parser.throwsClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_throws209=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;

		BAST LITERAL_throws209_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:13: ( LITERAL_throws ^ (exceptions+= ID )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:2: LITERAL_throws ^ (exceptions+= ID )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_throws209=(Token)match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7506); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throws209_tree = (BAST)adaptor.create(LITERAL_throws209);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_throws209_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:28: (exceptions+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:28: exceptions+= ID
					{
					exceptions=(Token)match(input,ID,FOLLOW_ID_in_throwsClause7511); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1189:1: assertClause : LITERAL_assert ^ (assertions+= namedAssertion )+ ;
	public final BLESS3Parser.assertClause_return assertClause() throws RecognitionException {
		BLESS3Parser.assertClause_return retval = new BLESS3Parser.assertClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_assert210=null;
		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		BAST LITERAL_assert210_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1189:13: ( LITERAL_assert ^ (assertions+= namedAssertion )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:3: LITERAL_assert ^ (assertions+= namedAssertion )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_assert210=(Token)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7526); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_assert210_tree = (BAST)adaptor.create(LITERAL_assert210);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_assert210_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:19: (assertions+= namedAssertion )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:20: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7532);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:1: behaviorTime : ( quantity | valueName | parenthesizedSubexpression );
	public final BLESS3Parser.behaviorTime_return behaviorTime() throws RecognitionException {
		BLESS3Parser.behaviorTime_return retval = new BLESS3Parser.behaviorTime_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope quantity211 =null;
		ParserRuleReturnScope valueName212 =null;
		ParserRuleReturnScope parenthesizedSubexpression213 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:13: ( quantity | valueName | parenthesizedSubexpression )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_behaviorTime7553);
					quantity211=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity211.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:5: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_behaviorTime7559);
					valueName212=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName212.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1201:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_behaviorTime7565);
					parenthesizedSubexpression213=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression213.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1205:1: catchClause : LITERAL_catch ^ ( catchClauseTerm )+ ;
	public final BLESS3Parser.catchClause_return catchClause() throws RecognitionException {
		BLESS3Parser.catchClause_return retval = new BLESS3Parser.catchClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_catch214=null;
		ParserRuleReturnScope catchClauseTerm215 =null;

		BAST LITERAL_catch214_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1205:12: ( LITERAL_catch ^ ( catchClauseTerm )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1206:2: LITERAL_catch ^ ( catchClauseTerm )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_catch214=(Token)match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause7578); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_catch214_tree = (BAST)adaptor.create(LITERAL_catch214);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_catch214_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1206:17: ( catchClauseTerm )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1206:17: catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause7581);
					catchClauseTerm215=catchClauseTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClauseTerm215.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1209:1: catchClauseTerm : LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN ;
	public final BLESS3Parser.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		BLESS3Parser.catchClauseTerm_return retval = new BLESS3Parser.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token colon=null;
		Token LPAREN216=null;
		Token LITERAL_all217=null;
		Token RPAREN218=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;
		ParserRuleReturnScope act =null;

		BAST colon_tree=null;
		BAST LPAREN216_tree=null;
		BAST LITERAL_all217_tree=null;
		BAST RPAREN218_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1209:16: ( LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1210:3: LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN216=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7594); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN216_tree = (BAST)adaptor.create(LPAREN216);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN216_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:3: ( (exceptions+= ID )+ | LITERAL_all )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:5: (exceptions+= ID )+
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:15: (exceptions+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:15: exceptions+= ID
							{
							exceptions=(Token)match(input,ID,FOLLOW_ID_in_catchClauseTerm7603); if (state.failed) return retval;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:23: LITERAL_all
					{
					LITERAL_all217=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm7608); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_all217_tree = (BAST)adaptor.create(LITERAL_all217);
					adaptor.addChild(root_0, LITERAL_all217_tree);
					}

					}
					break;

			}

			colon=(Token)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7614); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			colon_tree = (BAST)adaptor.create(colon);
			adaptor.addChild(root_0, colon_tree);
			}

			pushFollow(FOLLOW_basicAction_in_catchClauseTerm7618);
			act=basicAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, act.getTree());

			RPAREN218=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7620); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN218_tree = (BAST)adaptor.create(RPAREN218);
			adaptor.addChild(root_0, RPAREN218_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1214:1: quantifiedVariables : LITERAL_declare ^ ( variableDeclaration )+ ;
	public final BLESS3Parser.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		BLESS3Parser.quantifiedVariables_return retval = new BLESS3Parser.quantifiedVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_declare219=null;
		ParserRuleReturnScope variableDeclaration220 =null;

		BAST LITERAL_declare219_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1214:20: ( LITERAL_declare ^ ( variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:3: LITERAL_declare ^ ( variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_declare219=(Token)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7632); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_declare219_tree = (BAST)adaptor.create(LITERAL_declare219);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_declare219_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:20: ( variableDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:20: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7635);
					variableDeclaration220=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration220.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1218:1: variableDeclaration : v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1218:20: (v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1219:3: v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )?
			{
			pushFollow(FOLLOW_variable_in_variableDeclaration7649);
			v=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(v.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:2: (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1221:4: nv= LITERAL_nonvolatile
					{
					nv=(Token)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7660); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_nonvolatile.add(nv);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:6: sh= LITERAL_shared
					{
					sh=(Token)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_shared.add(sh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:6: c= LITERAL_constant
					{
					c=(Token)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_constant.add(c);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:7: sp= LITERAL_spread
					{
					sp=(Token)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7690); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_spread.add(sp);

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1225:7: f= LITERAL_final
					{
					f=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration7700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(f);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1227:3: (assign= ASSIGN exp= expression )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ASSIGN) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1227:5: assign= ASSIGN exp= expression
					{
					assign=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7714); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(assign);

					pushFollow(FOLLOW_expression_in_variableDeclaration7718);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:4: (a= assertion )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==LASS) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:4: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7728);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1229:7: (semi= SEMICOLON )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==SEMICOLON) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1229:7: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration7737); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: nv, nv, sh, sh, c, sp, a, v, assign, f, exp, c, v, f, sp, a
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
			// 1230:5: -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			if (assign!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:24: ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:51: ^( $assign $exp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_assign.nextNode(), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:70: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:74: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:79: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:84: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:88: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:93: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1231:5: -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:8: ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:36: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:40: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:45: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:50: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:54: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:59: ( $f)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:1: behaviorActions :a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? ;
	public final BLESS3Parser.behaviorActions_return behaviorActions() throws RecognitionException {
		BLESS3Parser.behaviorActions_return retval = new BLESS3Parser.behaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token SEMICOLON221=null;
		Token SEMICOLON222=null;
		Token AMPERSAND223=null;
		Token AMPERSAND224=null;
		List<Object> list_a=null;
		RuleReturnScope a = null;
		BAST SEMICOLON221_tree=null;
		BAST SEMICOLON222_tree=null;
		BAST AMPERSAND223_tree=null;
		BAST AMPERSAND224_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:16: (a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1236:3: a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_assertedAction_in_behaviorActions7844);
			a=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

			if (list_a==null) list_a=new ArrayList<Object>();
			list_a.add(a.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1237:3: ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:6: SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )*
					{
					SEMICOLON221=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7857); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON221_tree = (BAST)adaptor.create(SEMICOLON221);
					root_0 = (BAST)adaptor.becomeRoot(SEMICOLON221_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7862);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:35: ( SEMICOLON !a+= assertedAction )*
					loop118:
					while (true) {
						int alt118=2;
						int LA118_0 = input.LA(1);
						if ( (LA118_0==SEMICOLON) ) {
							alt118=1;
						}

						switch (alt118) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:37: SEMICOLON !a+= assertedAction
							{
							SEMICOLON222=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7866); if (state.failed) return retval;
							pushFollow(FOLLOW_assertedAction_in_behaviorActions7871);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1240:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1240:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1240:6: AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )*
					{
					AMPERSAND223=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7890); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND223_tree = (BAST)adaptor.create(AMPERSAND223);
					root_0 = (BAST)adaptor.becomeRoot(AMPERSAND223_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7895);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1240:35: ( AMPERSAND a+= assertedAction )*
					loop119:
					while (true) {
						int alt119=2;
						int LA119_0 = input.LA(1);
						if ( (LA119_0==AMPERSAND) ) {
							alt119=1;
						}

						switch (alt119) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1240:37: AMPERSAND a+= assertedAction
							{
							AMPERSAND224=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7899); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AMPERSAND224_tree = (BAST)adaptor.create(AMPERSAND224);
							adaptor.addChild(root_0, AMPERSAND224_tree);
							}

							pushFollow(FOLLOW_assertedAction_in_behaviorActions7903);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1244:1: assertedAction : (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1244:17: ( (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:3: (pre= assertion )? s= action (post= assertion )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:6: (pre= assertion )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==LASS) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:6: pre= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7926);
					pre=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(pre.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_assertedAction7935);
			s=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(s.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:7: (post= assertion )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==LASS) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:7: post= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7941);
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
			// 1248:5: -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1249:5: ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, (s!=null?((BAST)s.getTree()):null).getToken(), "ACTION["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1250:9: ^( P[\"P\"] ( $pre)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(P, "P"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1250:20: ( $pre)?
				if ( stream_pre.hasNext() ) {
					adaptor.addChild(root_2, stream_pre.nextTree());
				}
				stream_pre.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1251:9: ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(S, (s!=null?((BAST)s.getTree()):null).getToken(), "S["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1252:9: ^( Q[\"Q\"] ( $post)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, "Q"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1252:20: ( $post)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:1: action : ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification );
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
		ParserRuleReturnScope basicAction225 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:7: ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification )
			int alt123=7;
			switch ( input.LA(1) ) {
			case ID:
			case LITERAL_computation:
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1259:3: basicAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_basicAction_in_action8057);
					basicAction225=basicAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basicAction225.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1260:5: if_fi= alternative
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_alternative_in_action8065);
					if_fi=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_fi.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1261:5: wl= whileLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_action8073);
					wl=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, wl.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:5: fl= forLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_action8081);
					fl=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fl.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1263:5: du= doUntilLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_doUntilLoop_in_action8089);
					du=doUntilLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, du.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1264:5: elq= existentialLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8097);
					elq=existentialLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elq.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:5: ulq= universalLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalLatticeQuantification_in_action8106);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1268:1: basicAction : ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException );
	public final BLESS3Parser.basicAction_return basicAction() throws RecognitionException {
		BLESS3Parser.basicAction_return retval = new BLESS3Parser.basicAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token mode=null;
		Token LITERAL_skip226=null;
		Token LITERAL_setmode228=null;
		ParserRuleReturnScope assignment227 =null;
		ParserRuleReturnScope whenThrow229 =null;
		ParserRuleReturnScope combinableOperation230 =null;
		ParserRuleReturnScope communicationAction231 =null;
		ParserRuleReturnScope computation232 =null;
		ParserRuleReturnScope simultaneousAssignment233 =null;
		ParserRuleReturnScope issueException234 =null;

		BAST mode_tree=null;
		BAST LITERAL_skip226_tree=null;
		BAST LITERAL_setmode228_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1268:12: ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException )
			int alt124=9;
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
					int LA124_10 = input.LA(3);
					if ( (LA124_10==LPAREN) ) {
						alt124=6;
					}
					else if ( (LA124_10==ASSIGN||LA124_10==TICK) ) {
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
								new NoViableAltException("", 124, 10, input);
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
			case LITERAL_computation:
				{
				alt124=7;
				}
				break;
			case VERT:
				{
				alt124=8;
				}
				break;
			case LITERAL_exception:
				{
				alt124=9;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1269:3: LITERAL_skip
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_skip226=(Token)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8121); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_skip226_tree = (BAST)adaptor.create(LITERAL_skip226);
					adaptor.addChild(root_0, LITERAL_skip226_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1270:5: assignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_basicAction8127);
					assignment227=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment227.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1271:5: ^( LITERAL_setmode mode= ID )
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_setmode228=(Token)match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8135); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_setmode228_tree = (BAST)adaptor.create(LITERAL_setmode228);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_setmode228_tree, root_0);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					mode=(Token)match(input,ID,FOLLOW_ID_in_basicAction8139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					mode_tree = (BAST)adaptor.create(mode);
					adaptor.addChild(root_0, mode_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1272:5: whenThrow
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whenThrow_in_basicAction8148);
					whenThrow229=whenThrow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThrow229.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1273:5: combinableOperation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_combinableOperation_in_basicAction8154);
					combinableOperation230=combinableOperation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, combinableOperation230.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1274:5: communicationAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_communicationAction_in_basicAction8160);
					communicationAction231=communicationAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, communicationAction231.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1275:5: computation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_computation_in_basicAction8167);
					computation232=computation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, computation232.getTree());

					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1276:5: simultaneousAssignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8173);
					simultaneousAssignment233=simultaneousAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simultaneousAssignment233.getTree());

					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1278:5: issueException
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_issueException_in_basicAction8180);
					issueException234=issueException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, issueException234.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1281:1: assignment : nameTick ASSIGN ^ expressionOrAny ;
	public final BLESS3Parser.assignment_return assignment() throws RecognitionException {
		BLESS3Parser.assignment_return retval = new BLESS3Parser.assignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ASSIGN236=null;
		ParserRuleReturnScope nameTick235 =null;
		ParserRuleReturnScope expressionOrAny237 =null;

		BAST ASSIGN236_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1281:11: ( nameTick ASSIGN ^ expressionOrAny )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1282:3: nameTick ASSIGN ^ expressionOrAny
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_nameTick_in_assignment8192);
			nameTick235=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nameTick235.getTree());

			ASSIGN236=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8194); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN236_tree = (BAST)adaptor.create(ASSIGN236);
			root_0 = (BAST)adaptor.becomeRoot(ASSIGN236_tree, root_0);
			}

			pushFollow(FOLLOW_expressionOrAny_in_assignment8197);
			expressionOrAny237=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrAny237.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1285:1: simultaneousAssignment : VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) ;
	public final BLESS3Parser.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		BLESS3Parser.simultaneousAssignment_return retval = new BLESS3Parser.simultaneousAssignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token left_comma=null;
		Token a=null;
		Token right_comma=null;
		Token VERT238=null;
		Token COMMA239=null;
		Token COMMA240=null;
		Token VERT241=null;
		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		BAST left_comma_tree=null;
		BAST a_tree=null;
		BAST right_comma_tree=null;
		BAST VERT238_tree=null;
		BAST COMMA239_tree=null;
		BAST COMMA240_tree=null;
		BAST VERT241_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERT=new RewriteRuleTokenStream(adaptor,"token VERT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_nameTick=new RewriteRuleSubtreeStream(adaptor,"rule nameTick");
		RewriteRuleSubtreeStream stream_expressionOrAny=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrAny");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1285:24: ( VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:2: VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT
			{
			VERT238=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8209); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT238);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8215);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			left_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8219); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(left_comma);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8223);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1287:47: ( COMMA lhs+= nameTick )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==COMMA) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1287:49: COMMA lhs+= nameTick
					{
					COMMA239=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8227); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA239);

					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8231);
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

			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8239); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(a);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8245);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			right_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8249); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(right_comma);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8253);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1289:62: ( COMMA rhs+= expressionOrAny )*
			loop126:
			while (true) {
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==COMMA) ) {
					alt126=1;
				}

				switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1289:64: COMMA rhs+= expressionOrAny
					{
					COMMA240=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA240);

					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8261);
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

			VERT241=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT241);

			// AST REWRITE
			// elements: left_comma, right_comma, rhs, a, lhs
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
			// 1291:5: -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:8: ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_a.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:13: ^( $left_comma ( $lhs)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:36: ^( $right_comma ( $rhs)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:1: nameTick : valueName ( TICK ^)? ;
	public final BLESS3Parser.nameTick_return nameTick() throws RecognitionException {
		BLESS3Parser.nameTick_return retval = new BLESS3Parser.nameTick_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TICK243=null;
		ParserRuleReturnScope valueName242 =null;

		BAST TICK243_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:9: ( valueName ( TICK ^)? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:11: valueName ( TICK ^)?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_valueName_in_nameTick8309);
			valueName242=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName242.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:21: ( TICK ^)?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==TICK) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1294:23: TICK ^
					{
					TICK243=(Token)match(input,TICK,FOLLOW_TICK_in_nameTick8313); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK243_tree = (BAST)adaptor.create(TICK243);
					root_0 = (BAST)adaptor.becomeRoot(TICK243_tree, root_0);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1296:1: expressionOrAny : ( expression | LITERAL_any );
	public final BLESS3Parser.expressionOrAny_return expressionOrAny() throws RecognitionException {
		BLESS3Parser.expressionOrAny_return retval = new BLESS3Parser.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_any245=null;
		ParserRuleReturnScope expression244 =null;

		BAST LITERAL_any245_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1296:16: ( expression | LITERAL_any )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:3: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_expressionOrAny8327);
					expression244=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression244.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:16: LITERAL_any
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_any245=(Token)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8331); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_any245_tree = (BAST)adaptor.create(LITERAL_any245);
					adaptor.addChild(root_0, LITERAL_any245_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1300:1: whenThrow : LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ;
	public final BLESS3Parser.whenThrow_return whenThrow() throws RecognitionException {
		BLESS3Parser.whenThrow_return retval = new BLESS3Parser.whenThrow_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token excep=null;
		Token message=null;
		Token LITERAL_when246=null;
		Token LPAREN247=null;
		Token RPAREN248=null;
		Token LITERAL_throw249=null;
		ParserRuleReturnScope exp =null;

		BAST excep_tree=null;
		BAST message_tree=null;
		BAST LITERAL_when246_tree=null;
		BAST LPAREN247_tree=null;
		BAST RPAREN248_tree=null;
		BAST LITERAL_throw249_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1300:10: ( LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1301:3: LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_when246=(Token)match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8343); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_when246_tree = (BAST)adaptor.create(LITERAL_when246);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_when246_tree, root_0);
			}

			LPAREN247=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8346); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN247_tree = (BAST)adaptor.create(LPAREN247);
			adaptor.addChild(root_0, LPAREN247_tree);
			}

			pushFollow(FOLLOW_expression_in_whenThrow8350);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN248=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8352); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN248_tree = (BAST)adaptor.create(RPAREN248);
			adaptor.addChild(root_0, RPAREN248_tree);
			}

			LITERAL_throw249=(Token)match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8354); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throw249_tree = (BAST)adaptor.create(LITERAL_throw249);
			adaptor.addChild(root_0, LITERAL_throw249_tree);
			}

			excep=(Token)match(input,ID,FOLLOW_ID_in_whenThrow8358); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			excep_tree = (BAST)adaptor.create(excep);
			adaptor.addChild(root_0, excep_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:10: (message= AADL_STRING_LITERAL )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==AADL_STRING_LITERAL) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8366); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1305:1: combinableOperation : (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !);
	public final BLESS3Parser.combinableOperation_return combinableOperation() throws RecognitionException {
		BLESS3Parser.combinableOperation_return retval = new BLESS3Parser.combinableOperation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token f_add=null;
		Token target=null;
		Token result=null;
		Token f_or=null;
		Token f_and=null;
		Token f_xor=null;
		Token sw=null;
		Token reference=null;
		Token LPAREN250=null;
		Token COMMA251=null;
		Token COMMA252=null;
		Token RPAREN253=null;
		Token LPAREN254=null;
		Token COMMA255=null;
		Token COMMA256=null;
		Token RPAREN257=null;
		Token LPAREN258=null;
		Token COMMA259=null;
		Token COMMA260=null;
		Token RPAREN261=null;
		Token LPAREN262=null;
		Token COMMA263=null;
		Token COMMA264=null;
		Token RPAREN265=null;
		Token LPAREN266=null;
		Token COMMA267=null;
		Token COMMA268=null;
		Token RPAREN269=null;
		ParserRuleReturnScope arithmetic =null;
		ParserRuleReturnScope bool =null;

		BAST f_add_tree=null;
		BAST target_tree=null;
		BAST result_tree=null;
		BAST f_or_tree=null;
		BAST f_and_tree=null;
		BAST f_xor_tree=null;
		BAST sw_tree=null;
		BAST reference_tree=null;
		BAST LPAREN250_tree=null;
		BAST COMMA251_tree=null;
		BAST COMMA252_tree=null;
		BAST RPAREN253_tree=null;
		BAST LPAREN254_tree=null;
		BAST COMMA255_tree=null;
		BAST COMMA256_tree=null;
		BAST RPAREN257_tree=null;
		BAST LPAREN258_tree=null;
		BAST COMMA259_tree=null;
		BAST COMMA260_tree=null;
		BAST RPAREN261_tree=null;
		BAST LPAREN262_tree=null;
		BAST COMMA263_tree=null;
		BAST COMMA264_tree=null;
		BAST RPAREN265_tree=null;
		BAST LPAREN266_tree=null;
		BAST COMMA267_tree=null;
		BAST COMMA268_tree=null;
		BAST RPAREN269_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1305:20: (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !)
			int alt130=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt130=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt130=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt130=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt130=4;
				}
				break;
			case LITERAL_swap:
				{
				alt130=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}
			switch (alt130) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1306:3: f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_add=(Token)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation8387); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_add_tree = (BAST)adaptor.create(f_add);
					root_0 = (BAST)adaptor.becomeRoot(f_add_tree, root_0);
					}

					LPAREN250=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8390); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8395); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA251=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8397); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8402);
					arithmetic=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic.getTree());

					COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8404); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8409); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN253=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8411); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1308:3: f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_or=(Token)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation8423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_or_tree = (BAST)adaptor.create(f_or);
					root_0 = (BAST)adaptor.becomeRoot(f_or_tree, root_0);
					}

					LPAREN254=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8426); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8431); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA255=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8433); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8438);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8440); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8445); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN257=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8447); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1310:3: f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_and=(Token)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation8458); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_and_tree = (BAST)adaptor.create(f_and);
					root_0 = (BAST)adaptor.becomeRoot(f_and_tree, root_0);
					}

					LPAREN258=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8461); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8466); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA259=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8468); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8473);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8475); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8480); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8482); if (state.failed) return retval;
					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1312:3: f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_xor=(Token)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation8493); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_xor_tree = (BAST)adaptor.create(f_xor);
					root_0 = (BAST)adaptor.becomeRoot(f_xor_tree, root_0);
					}

					LPAREN262=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8496); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8501); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA263=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8503); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8508);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8510); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8515); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN265=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8517); if (state.failed) return retval;
					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:3: sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					sw=(Token)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation8528); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					sw_tree = (BAST)adaptor.create(sw);
					root_0 = (BAST)adaptor.becomeRoot(sw_tree, root_0);
					}

					LPAREN266=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8531); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8536); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8538); if (state.failed) return retval;
					reference=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8543); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					reference_tree = (BAST)adaptor.create(reference);
					adaptor.addChild(root_0, reference_tree);
					}

					COMMA268=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8545); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8550); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8552); if (state.failed) return retval;
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
	// $ANTLR end "combinableOperation"


	public static class communicationAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "communicationAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1317:1: communicationAction : (pc= subprogramCall |po= portOutput |pi= portInput );
	public final BLESS3Parser.communicationAction_return communicationAction() throws RecognitionException {
		BLESS3Parser.communicationAction_return retval = new BLESS3Parser.communicationAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pc =null;
		ParserRuleReturnScope po =null;
		ParserRuleReturnScope pi =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1317:20: (pc= subprogramCall |po= portOutput |pi= portInput )
			int alt131=3;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==ID) ) {
				switch ( input.LA(2) ) {
				case LPAREN:
					{
					alt131=1;
					}
					break;
				case EXCLAMATION:
					{
					alt131=2;
					}
					break;
				case QUESTION:
					{
					alt131=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 131, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:3: pc= subprogramCall
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_subprogramCall_in_communicationAction8567);
					pc=subprogramCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1320:3: po= portOutput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portOutput_in_communicationAction8577);
					po=portOutput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, po.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1322:3: pi= portInput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portInput_in_communicationAction8587);
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


	public static class computation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "computation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1329:1: computation : LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )? ;
	public final BLESS3Parser.computation_return computation() throws RecognitionException {
		BLESS3Parser.computation_return retval = new BLESS3Parser.computation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token component=null;
		Token LITERAL_computation270=null;
		Token LPAREN271=null;
		Token COMMA272=null;
		Token RPAREN273=null;
		Token LITERAL_in274=null;
		Token LITERAL_binding275=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST component_tree=null;
		BAST LITERAL_computation270_tree=null;
		BAST LPAREN271_tree=null;
		BAST COMMA272_tree=null;
		BAST RPAREN273_tree=null;
		BAST LITERAL_in274_tree=null;
		BAST LITERAL_binding275_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1329:12: ( LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1330:3: LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_computation270=(Token)match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation8603); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_computation270_tree = (BAST)adaptor.create(LITERAL_computation270);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_computation270_tree, root_0);
			}

			LPAREN271=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computation8606); if (state.failed) return retval;
			pushFollow(FOLLOW_behaviorTime_in_computation8611);
			lb=behaviorTime();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1330:48: ( COMMA !ub= behaviorTime )?
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==COMMA) ) {
				alt132=1;
			}
			switch (alt132) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1330:50: COMMA !ub= behaviorTime
					{
					COMMA272=(Token)match(input,COMMA,FOLLOW_COMMA_in_computation8615); if (state.failed) return retval;
					pushFollow(FOLLOW_behaviorTime_in_computation8620);
					ub=behaviorTime();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					}
					break;

			}

			RPAREN273=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computation8625); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:5: ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==LITERAL_in) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:7: LITERAL_in ! LITERAL_binding ^ (component= QCREF )+
					{
					LITERAL_in274=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_computation8634); if (state.failed) return retval;
					LITERAL_binding275=(Token)match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation8637); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_binding275_tree = (BAST)adaptor.create(LITERAL_binding275);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_binding275_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:45: (component= QCREF )+
					int cnt133=0;
					loop133:
					while (true) {
						int alt133=2;
						int LA133_0 = input.LA(1);
						if ( (LA133_0==QCREF) ) {
							alt133=1;
						}

						switch (alt133) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:45: component= QCREF
							{
							component=(Token)match(input,QCREF,FOLLOW_QCREF_in_computation8642); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							component_tree = (BAST)adaptor.create(component);
							adaptor.addChild(root_0, component_tree);
							}

							}
							break;

						default :
							if ( cnt133 >= 1 ) break loop133;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(133, input);
							throw eee;
						}
						cnt133++;
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
	// $ANTLR end "computation"


	public static class subprogramCall_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subprogramCall"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1334:1: subprogramCall : id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal) ;
	public final BLESS3Parser.subprogramCall_return subprogramCall() throws RecognitionException {
		BLESS3Parser.subprogramCall_return retval = new BLESS3Parser.subprogramCall_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN276=null;
		Token RPAREN277=null;
		ParserRuleReturnScope fal =null;

		BAST id_tree=null;
		BAST LPAREN276_tree=null;
		BAST RPAREN277_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_formalActualList=new RewriteRuleSubtreeStream(adaptor,"rule formalActualList");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1334:15: (id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:3: id= ID LPAREN (fal= formalActualList )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_subprogramCall8660); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN276=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subprogramCall8662); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN276);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:19: (fal= formalActualList )?
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==AADL_STRING_LITERAL||LA135_0==ID||LA135_0==LITERAL_false||LA135_0==LITERAL_null||LA135_0==LITERAL_self||LA135_0==LITERAL_true||LA135_0==LPAREN||LA135_0==NUMBER||LA135_0==OCTOTHORPE||(LA135_0 >= QCLREF && LA135_0 <= QCREF)) ) {
				alt135=1;
			}
			switch (alt135) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:19: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall8666);
					fal=formalActualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalActualList.add(fal.getTree());
					}
					break;

			}

			RPAREN277=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subprogramCall8669); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN277);

			// AST REWRITE
			// elements: id, fal
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
			// 1336:5: -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:8: ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1340:1: formalActualList : formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? ;
	public final BLESS3Parser.formalActualList_return formalActualList() throws RecognitionException {
		BLESS3Parser.formalActualList_return retval = new BLESS3Parser.formalActualList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA279=null;
		Token COMMA281=null;
		ParserRuleReturnScope formalActual278 =null;
		ParserRuleReturnScope formalActual280 =null;
		ParserRuleReturnScope formalActual282 =null;

		BAST COMMA279_tree=null;
		BAST COMMA281_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1340:17: ( formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:3: formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalActual_in_formalActualList8700);
			formalActual278=formalActual();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual278.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:16: ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==COMMA) ) {
				alt137=1;
			}
			switch (alt137) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:18: COMMA ^ formalActual ( COMMA ! formalActual )*
					{
					COMMA279=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8704); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA279_tree = (BAST)adaptor.create(COMMA279);
					root_0 = (BAST)adaptor.becomeRoot(COMMA279_tree, root_0);
					}

					pushFollow(FOLLOW_formalActual_in_formalActualList8707);
					formalActual280=formalActual();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual280.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:38: ( COMMA ! formalActual )*
					loop136:
					while (true) {
						int alt136=2;
						int LA136_0 = input.LA(1);
						if ( (LA136_0==COMMA) ) {
							alt136=1;
						}

						switch (alt136) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:40: COMMA ! formalActual
							{
							COMMA281=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8711); if (state.failed) return retval;
							pushFollow(FOLLOW_formalActual_in_formalActualList8714);
							formalActual282=formalActual();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual282.getTree());

							}
							break;

						default :
							break loop136;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1344:1: formalActual : (formal= ID COLON ^)? actual= subProgramParameter ;
	public final BLESS3Parser.formalActual_return formalActual() throws RecognitionException {
		BLESS3Parser.formalActual_return retval = new BLESS3Parser.formalActual_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON283=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON283_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1344:13: ( (formal= ID COLON ^)? actual= subProgramParameter )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1345:3: (formal= ID COLON ^)? actual= subProgramParameter
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1345:3: (formal= ID COLON ^)?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==ID) ) {
				int LA138_1 = input.LA(2);
				if ( (LA138_1==COLON) ) {
					alt138=1;
				}
			}
			switch (alt138) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1345:5: formal= ID COLON ^
					{
					formal=(Token)match(input,ID,FOLLOW_ID_in_formalActual8736); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					formal_tree = (BAST)adaptor.create(formal);
					adaptor.addChild(root_0, formal_tree);
					}

					COLON283=(Token)match(input,COLON,FOLLOW_COLON_in_formalActual8744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLON283_tree = (BAST)adaptor.create(COLON283);
					root_0 = (BAST)adaptor.becomeRoot(COLON283_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_subProgramParameter_in_formalActual8752);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:1: subProgramParameter : ( valueName | constant | parenthesizedSubexpression );
	public final BLESS3Parser.subProgramParameter_return subProgramParameter() throws RecognitionException {
		BLESS3Parser.subProgramParameter_return retval = new BLESS3Parser.subProgramParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope valueName284 =null;
		ParserRuleReturnScope constant285 =null;
		ParserRuleReturnScope parenthesizedSubexpression286 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:20: ( valueName | constant | parenthesizedSubexpression )
			int alt139=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt139=1;
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
				alt139=2;
				}
				break;
			case LPAREN:
				{
				alt139=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}
			switch (alt139) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1350:2: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_subProgramParameter8763);
					valueName284=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName284.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1351:4: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_subProgramParameter8768);
					constant285=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant285.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1352:4: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter8773);
					parenthesizedSubexpression286=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression286.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1355:1: portOutput : pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) ;
	public final BLESS3Parser.portOutput_return portOutput() throws RecognitionException {
		BLESS3Parser.portOutput_return retval = new BLESS3Parser.portOutput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn=null;
		Token EXCLAMATION287=null;
		Token LPAREN288=null;
		Token RPAREN289=null;
		ParserRuleReturnScope be =null;

		BAST pn_tree=null;
		BAST EXCLAMATION287_tree=null;
		BAST LPAREN288_tree=null;
		BAST RPAREN289_tree=null;
		RewriteRuleTokenStream stream_EXCLAMATION=new RewriteRuleTokenStream(adaptor,"token EXCLAMATION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1355:11: (pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:5: pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )?
			{
			pn=(Token)match(input,ID,FOLLOW_ID_in_portOutput8789); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn);

			EXCLAMATION287=(Token)match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_portOutput8791); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXCLAMATION.add(EXCLAMATION287);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:23: ( LPAREN be= expression RPAREN )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==LPAREN) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:25: LPAREN be= expression RPAREN
					{
					LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portOutput8795); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN288);

					pushFollow(FOLLOW_expression_in_portOutput8799);
					be=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(be.getTree());
					RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portOutput8801); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN289);

					}
					break;

			}

			// AST REWRITE
			// elements: pn, be
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
			// 1357:5: -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:8: ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_OUTPUT, pn, "PORT_OUTPUT["+Integer.toString(pn_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1359:19: ( $be)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:1: portInput : pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) ;
	public final BLESS3Parser.portInput_return portInput() throws RecognitionException {
		BLESS3Parser.portInput_return retval = new BLESS3Parser.portInput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn2=null;
		Token QUESTION290=null;
		Token LPAREN291=null;
		Token RPAREN292=null;
		ParserRuleReturnScope n =null;

		BAST pn2_tree=null;
		BAST QUESTION290_tree=null;
		BAST LPAREN291_tree=null;
		BAST RPAREN292_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_valueName=new RewriteRuleSubtreeStream(adaptor,"rule valueName");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:10: (pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:5: pn2= ID QUESTION LPAREN n= valueName RPAREN
			{
			pn2=(Token)match(input,ID,FOLLOW_ID_in_portInput8847); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn2);

			QUESTION290=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_portInput8849); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION290);

			LPAREN291=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portInput8851); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN291);

			pushFollow(FOLLOW_valueName_in_portInput8856);
			n=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(n.getTree());
			RPAREN292=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portInput8858); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN292);

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
			// 1364:6: -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1364:9: ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1369:1: alternative : lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) ;
	public final BLESS3Parser.alternative_return alternative() throws RecognitionException {
		BLESS3Parser.alternative_return retval = new BLESS3Parser.alternative_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lif=null;
		Token BOX293=null;
		Token LITERAL_fi294=null;
		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		BAST lif_tree=null;
		BAST BOX293_tree=null;
		BAST LITERAL_fi294_tree=null;
		RewriteRuleTokenStream stream_LITERAL_fi=new RewriteRuleTokenStream(adaptor,"token LITERAL_fi");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_BOX=new RewriteRuleTokenStream(adaptor,"token BOX");
		RewriteRuleSubtreeStream stream_guardedAction=new RewriteRuleSubtreeStream(adaptor,"rule guardedAction");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1369:12: (lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1370:3: lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi
			{
			lif=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative8899); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(lif);

			pushFollow(FOLLOW_guardedAction_in_alternative8907);
			alt=guardedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
			if (list_alt==null) list_alt=new ArrayList<Object>();
			list_alt.add(alt.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1373:3: ( BOX alt+= guardedAction )+
			int cnt141=0;
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==BOX) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1373:5: BOX alt+= guardedAction
					{
					BOX293=(Token)match(input,BOX,FOLLOW_BOX_in_alternative8913); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOX.add(BOX293);

					pushFollow(FOLLOW_guardedAction_in_alternative8917);
					alt=guardedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTree());
					}
					break;

				default :
					if ( cnt141 >= 1 ) break loop141;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(141, input);
					throw eee;
				}
				cnt141++;
			}

			LITERAL_fi294=(Token)match(input,LITERAL_fi,FOLLOW_LITERAL_fi_in_alternative8925); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_fi.add(LITERAL_fi294);

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
			// 1375:5: -> ^( $lif ( $alt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1375:8: ^( $lif ( $alt)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1381:1: guardedAction : LPAREN ! expression GUARD ^ assertedAction ;
	public final BLESS3Parser.guardedAction_return guardedAction() throws RecognitionException {
		BLESS3Parser.guardedAction_return retval = new BLESS3Parser.guardedAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN295=null;
		Token GUARD297=null;
		ParserRuleReturnScope expression296 =null;
		ParserRuleReturnScope assertedAction298 =null;

		BAST LPAREN295_tree=null;
		BAST GUARD297_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1381:14: ( LPAREN ! expression GUARD ^ assertedAction )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1382:3: LPAREN ! expression GUARD ^ assertedAction
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN295=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_guardedAction8963); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_guardedAction8967);
			expression296=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression296.getTree());

			GUARD297=(Token)match(input,GUARD,FOLLOW_GUARD_in_guardedAction8969); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GUARD297_tree = (BAST)adaptor.create(GUARD297);
			root_0 = (BAST)adaptor.becomeRoot(GUARD297_tree, root_0);
			}

			pushFollow(FOLLOW_assertedAction_in_guardedAction8972);
			assertedAction298=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertedAction298.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1387:1: whileLoop : lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) ;
	public final BLESS3Parser.whileLoop_return whileLoop() throws RecognitionException {
		BLESS3Parser.whileLoop_return retval = new BLESS3Parser.whileLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lw=null;
		Token LPAREN299=null;
		Token RPAREN300=null;
		Token LITERAL_invariant301=null;
		Token LITERAL_bound302=null;
		ParserRuleReturnScope be =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope elq =null;

		BAST lw_tree=null;
		BAST LPAREN299_tree=null;
		BAST RPAREN300_tree=null;
		BAST LITERAL_invariant301_tree=null;
		BAST LITERAL_bound302_tree=null;
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_bound=new RewriteRuleTokenStream(adaptor,"token LITERAL_bound");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_while=new RewriteRuleTokenStream(adaptor,"token LITERAL_while");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1387:10: (lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1388:3: lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification
			{
			lw=(Token)match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop8996); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_while.add(lw);

			LPAREN299=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileLoop9002); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN299);

			pushFollow(FOLLOW_expression_in_whileLoop9007);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN300=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileLoop9009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN300);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:3: ( LITERAL_invariant inv= assertion )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==LITERAL_invariant) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant301=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_whileLoop9016); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant301);

					pushFollow(FOLLOW_assertion_in_whileLoop9020);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1392:3: ( LITERAL_bound bd= expression )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==LITERAL_bound) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1392:5: LITERAL_bound bd= expression
					{
					LITERAL_bound302=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_whileLoop9029); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound302);

					pushFollow(FOLLOW_expression_in_whileLoop9034);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop9045);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: inv, bd, lw, elq, be
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
			// 1394:5: -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:8: ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lw.nextNode(), root_1);
				adaptor.addChild(root_1, stream_be.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:18: ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lw, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:48: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:54: ^( BOUND[$lw,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, lw, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1394:76: ( $bd)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1399:1: forLoop : lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) ;
	public final BLESS3Parser.forLoop_return forLoop() throws RecognitionException {
		BLESS3Parser.forLoop_return retval = new BLESS3Parser.forLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT303=null;
		Token LITERAL_invariant304=null;
		Token LCURLY305=null;
		Token RCURLY306=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope act =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT303_tree=null;
		BAST LITERAL_invariant304_tree=null;
		BAST LCURLY305_tree=null;
		BAST RCURLY306_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1399:8: (lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1400:3: lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY
			{
			lf=(Token)match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop9103); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_for.add(lf);

			pushFollow(FOLLOW_identifier_in_forLoop9110);
			a=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(a.getTree());
			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop9115); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_forLoop9120);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT303=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_forLoop9122); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT303);

			pushFollow(FOLLOW_expression_in_forLoop9127);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1402:3: ( LITERAL_invariant inv= assertion )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LITERAL_invariant) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1402:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant304=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_forLoop9134); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant304);

					pushFollow(FOLLOW_assertion_in_forLoop9138);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			LCURLY305=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forLoop9145); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY305);

			pushFollow(FOLLOW_behaviorActions_in_forLoop9150);
			act=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(act.getTree());
			RCURLY306=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forLoop9152); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY306);

			// AST REWRITE
			// elements: inv, act, lf, a, lb, ub, li
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
			// 1404:5: -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1404:7: ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1404:16: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1404:31: ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lf, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1404:61: ( $inv)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1409:1: doUntilLoop : ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) ;
	public final BLESS3Parser.doUntilLoop_return doUntilLoop() throws RecognitionException {
		BLESS3Parser.doUntilLoop_return retval = new BLESS3Parser.doUntilLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ld=null;
		Token lu=null;
		Token LITERAL_invariant307=null;
		Token LITERAL_bound308=null;
		Token LPAREN309=null;
		Token RPAREN310=null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope be =null;

		BAST ld_tree=null;
		BAST lu_tree=null;
		BAST LITERAL_invariant307_tree=null;
		BAST LITERAL_bound308_tree=null;
		BAST LPAREN309_tree=null;
		BAST RPAREN310_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1409:12: (ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1410:3: ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN
			{
			ld=(Token)match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9215); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_do.add(ld);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1411:3: ( LITERAL_invariant inv= assertion )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==LITERAL_invariant) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1411:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant307=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_doUntilLoop9222); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant307);

					pushFollow(FOLLOW_assertion_in_doUntilLoop9226);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:3: ( LITERAL_bound bd= expression )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==LITERAL_bound) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:5: LITERAL_bound bd= expression
					{
					LITERAL_bound308=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_doUntilLoop9235); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound308);

					pushFollow(FOLLOW_expression_in_doUntilLoop9240);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9251);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(ba.getTree());
			lu=(Token)match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9257); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_until.add(lu);

			LPAREN309=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doUntilLoop9259); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN309);

			pushFollow(FOLLOW_expression_in_doUntilLoop9264);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN310=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doUntilLoop9266); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN310);

			// AST REWRITE
			// elements: be, ba, bd, ld, inv, lu
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
			// 1415:5: -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:7: ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ld.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:13: ^( $lu $be)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lu.nextNode(), root_2);
				adaptor.addChild(root_2, stream_be.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:24: ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, ld, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:54: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:60: ^( BOUND[$ld,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, ld, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:82: ( $bd)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:1: existentialLatticeQuantification : (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? ;
	public final BLESS3Parser.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		BLESS3Parser.existentialLatticeQuantification_return retval = new BLESS3Parser.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lc=null;
		Token RCURLY311=null;
		ParserRuleReturnScope qv =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope cc =null;

		BAST lc_tree=null;
		BAST RCURLY311_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:33: ( (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:3: (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )?
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:5: (qv= quantifiedVariables )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==LITERAL_declare) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:5: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9333);
					qv=quantifiedVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qv.getTree());

					}
					break;

			}

			lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification9340); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			lc_tree = (BAST)adaptor.create(lc);
			root_0 = (BAST)adaptor.becomeRoot(lc_tree, root_0);
			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification9346);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ba.getTree());

			RCURLY311=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification9348); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RCURLY311_tree = (BAST)adaptor.create(RCURLY311);
			adaptor.addChild(root_0, RCURLY311_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1424:5: (cc= catchClause )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==LITERAL_catch) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1424:5: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification9356);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1429:1: universalLatticeQuantification : lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) ;
	public final BLESS3Parser.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		BLESS3Parser.universalLatticeQuantification_return retval = new BLESS3Parser.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT312=null;
		Token lv=null;
		List<Object> list_lv=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope elq =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT312_tree=null;
		BAST lv_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_forall=new RewriteRuleTokenStream(adaptor,"token LITERAL_forall");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1429:31: (lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1430:3: lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification
			{
			lf=(Token)match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9381); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_forall.add(lf);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:5: (lv+= ID )+
			int cnt149=0;
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==ID) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:5: lv+= ID
					{
					lv=(Token)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9390); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(lv);

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt149 >= 1 ) break loop149;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(149, input);
					throw eee;
				}
				cnt149++;
			}

			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9395); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9399);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT312=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_universalLatticeQuantification9401); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT312);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9405);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9414);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: lv, elq, lb, lf, li, ub
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
			// 1434:5: -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1434:8: ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1434:19: ^( $li $lb $ub)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:1: issueException : LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN ;
	public final BLESS3Parser.issueException_return issueException() throws RecognitionException {
		BLESS3Parser.issueException_return retval = new BLESS3Parser.issueException_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token exception=null;
		Token message=null;
		Token LITERAL_exception313=null;
		Token LPAREN314=null;
		Token RPAREN315=null;

		BAST exception_tree=null;
		BAST message_tree=null;
		BAST LITERAL_exception313_tree=null;
		BAST LPAREN314_tree=null;
		BAST RPAREN315_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:15: ( LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:2: LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_exception313=(Token)match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9463); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_exception313_tree = (BAST)adaptor.create(LITERAL_exception313);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_exception313_tree, root_0);
			}

			LPAREN314=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_issueException9466); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN314_tree = (BAST)adaptor.create(LPAREN314);
			adaptor.addChild(root_0, LPAREN314_tree);
			}

			exception=(Token)match(input,ID,FOLLOW_ID_in_issueException9470); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			exception_tree = (BAST)adaptor.create(exception);
			adaptor.addChild(root_0, exception_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1441:10: (message= AADL_STRING_LITERAL )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==AADL_STRING_LITERAL) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1441:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9478); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			RPAREN315=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_issueException9481); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN315_tree = (BAST)adaptor.create(RPAREN315);
			adaptor.addChild(root_0, RPAREN315_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1447:1: blessSubclause : (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1447:15: ( (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:2: (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:10: (no_proof= DO_NOT_PROVE )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==DO_NOT_PROVE) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:10: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9495); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:5: (ac= assertClause )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==LITERAL_assert) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:5: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_blessSubclause9502);
					ac=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(ac.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1450:6: (inv= invariantClause )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==LITERAL_invariant) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1450:6: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_blessSubclause9511);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invariantClause.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1451:5: (vs= variablesSection )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==LITERAL_variables) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1451:5: vs= variablesSection
					{
					pushFollow(FOLLOW_variablesSection_in_blessSubclause9518);
					vs=variablesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variablesSection.add(vs.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1452:5: (ss= statesSection )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==LITERAL_states) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1452:5: ss= statesSection
					{
					pushFollow(FOLLOW_statesSection_in_blessSubclause9525);
					ss=statesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statesSection.add(ss.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1453:4: (t= transitions )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LITERAL_transitions) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1453:4: t= transitions
					{
					pushFollow(FOLLOW_transitions_in_blessSubclause9532);
					t=transitions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_transitions.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ac, ss, inv, no_proof, t, vs
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
			// 1454:5: -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1454:8: ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:1: invariantClause : LITERAL_invariant ^ assertion ;
	public final BLESS3Parser.invariantClause_return invariantClause() throws RecognitionException {
		BLESS3Parser.invariantClause_return retval = new BLESS3Parser.invariantClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_invariant316=null;
		ParserRuleReturnScope assertion317 =null;

		BAST LITERAL_invariant316_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:16: ( LITERAL_invariant ^ assertion )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:3: LITERAL_invariant ^ assertion
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_invariant316=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9574); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_invariant316_tree = (BAST)adaptor.create(LITERAL_invariant316);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_invariant316_tree, root_0);
			}

			pushFollow(FOLLOW_assertion_in_invariantClause9577);
			assertion317=assertion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertion317.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1461:1: variablesSection : LITERAL_variables ^ (vd+= variableDeclaration )+ ;
	public final BLESS3Parser.variablesSection_return variablesSection() throws RecognitionException {
		BLESS3Parser.variablesSection_return retval = new BLESS3Parser.variablesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_variables318=null;
		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		BAST LITERAL_variables318_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1461:17: ( LITERAL_variables ^ (vd+= variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1462:2: LITERAL_variables ^ (vd+= variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_variables318=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection9589); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_variables318_tree = (BAST)adaptor.create(LITERAL_variables318);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_variables318_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1462:23: (vd+= variableDeclaration )+
			int cnt157=0;
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==ID) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1462:23: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection9594);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTree());
					}
					break;

				default :
					if ( cnt157 >= 1 ) break loop157;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(157, input);
					throw eee;
				}
				cnt157++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1465:1: statesSection : LITERAL_states ^ (states+= behaviorState )+ ;
	public final BLESS3Parser.statesSection_return statesSection() throws RecognitionException {
		BLESS3Parser.statesSection_return retval = new BLESS3Parser.statesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_states319=null;
		List<Object> list_states=null;
		RuleReturnScope states = null;
		BAST LITERAL_states319_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1465:14: ( LITERAL_states ^ (states+= behaviorState )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:4: LITERAL_states ^ (states+= behaviorState )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_states319=(Token)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection9606); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_states319_tree = (BAST)adaptor.create(LITERAL_states319);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_states319_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:26: (states+= behaviorState )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection9611);
					states=behaviorState();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, states.getTree());

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTree());
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1472:1: behaviorState : i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) ;
	public final BLESS3Parser.behaviorState_return behaviorState() throws RecognitionException {
		BLESS3Parser.behaviorState_return retval = new BLESS3Parser.behaviorState_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token init=null;
		Token com=null;
		Token finl=null;
		Token st=null;
		Token COLON320=null;
		Token SEMICOLON321=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope a =null;

		BAST init_tree=null;
		BAST com_tree=null;
		BAST finl_tree=null;
		BAST st_tree=null;
		BAST COLON320_tree=null;
		BAST SEMICOLON321_tree=null;
		RewriteRuleTokenStream stream_LITERAL_final=new RewriteRuleTokenStream(adaptor,"token LITERAL_final");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LITERAL_state=new RewriteRuleTokenStream(adaptor,"token LITERAL_state");
		RewriteRuleTokenStream stream_LITERAL_initial=new RewriteRuleTokenStream(adaptor,"token LITERAL_initial");
		RewriteRuleTokenStream stream_LITERAL_complete=new RewriteRuleTokenStream(adaptor,"token LITERAL_complete");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1472:14: (i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1473:3: i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )?
			{
			pushFollow(FOLLOW_identifier_in_behaviorState9628);
			i=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(i.getTree());
			COLON320=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorState9633); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON320);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:9: (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )?
			int alt159=4;
			switch ( input.LA(1) ) {
				case LITERAL_initial:
					{
					alt159=1;
					}
					break;
				case LITERAL_complete:
					{
					alt159=2;
					}
					break;
				case LITERAL_final:
					{
					alt159=3;
					}
					break;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:10: init= LITERAL_initial
					{
					init=(Token)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState9638); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_initial.add(init);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:33: com= LITERAL_complete
					{
					com=(Token)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState9644); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_complete.add(com);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:56: finl= LITERAL_final
					{
					finl=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState9650); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(finl);

					}
					break;

			}

			st=(Token)match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState9656); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_state.add(st);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:95: (a= assertion )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==LASS) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:95: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState9660);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:107: ( SEMICOLON )?
			int alt161=2;
			int LA161_0 = input.LA(1);
			if ( (LA161_0==SEMICOLON) ) {
				alt161=1;
			}
			switch (alt161) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:107: SEMICOLON
					{
					SEMICOLON321=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorState9663); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON321);

					}
					break;

			}

			// AST REWRITE
			// elements: finl, com, a, i, init, LITERAL_state
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
			// 1475:5: -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:8: ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_state, st, "state["+Integer.toString(st.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:89: ( $init)?
				if ( stream_init.hasNext() ) {
					adaptor.addChild(root_1, stream_init.nextNode());
				}
				stream_init.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:96: ( $com)?
				if ( stream_com.hasNext() ) {
					adaptor.addChild(root_1, stream_com.nextNode());
				}
				stream_com.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:102: ( $finl)?
				if ( stream_finl.hasNext() ) {
					adaptor.addChild(root_1, stream_finl.nextNode());
				}
				stream_finl.reset();

				adaptor.addChild(root_1, stream_i.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:112: ( $a)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1480:1: transitions : t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1481:3: (t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1482:3: t= LITERAL_transitions (bt+= behaviorTransition )+
			{
			t=(Token)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions9724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(t);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1482:27: (bt+= behaviorTransition )+
			int cnt162=0;
			loop162:
			while (true) {
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==ID) ) {
					alt162=1;
				}

				switch (alt162) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1482:27: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions9728);
					bt=behaviorTransition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorTransition.add(bt.getTree());
					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTree());
					}
					break;

				default :
					if ( cnt162 >= 1 ) break loop162;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(162, input);
					throw eee;
				}
				cnt162++;
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
			// 1483:5: -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:8: ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1491:1: behaviorTransition : id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) ;
	public final BLESS3Parser.behaviorTransition_return behaviorTransition() throws RecognitionException {
		BLESS3Parser.behaviorTransition_return retval = new BLESS3Parser.behaviorTransition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token x=null;
		Token semi=null;
		Token COLON322=null;
		Token COMMA323=null;
		Token RCON324=null;
		Token LCURLY325=null;
		Token RCURLY326=null;
		Token EMPTY_CURLY327=null;
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
		BAST COLON322_tree=null;
		BAST COMMA323_tree=null;
		BAST RCON324_tree=null;
		BAST LCURLY325_tree=null;
		BAST RCURLY326_tree=null;
		BAST EMPTY_CURLY327_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:3: (id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:4: id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_behaviorTransition9773); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:12: (pr= priority )?
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==LBRACKET) ) {
				alt163=1;
			}
			switch (alt163) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:12: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition9777);
					pr=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_priority.add(pr.getTree());
					}
					break;

			}

			COLON322=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorTransition9780); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON322);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9788);
			ssi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
			if (list_ssi==null) list_ssi=new ArrayList<Object>();
			list_ssi.add(ssi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1494:36: ( COMMA ssi+= identifier )*
			loop164:
			while (true) {
				int alt164=2;
				int LA164_0 = input.LA(1);
				if ( (LA164_0==COMMA) ) {
					alt164=1;
				}

				switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1494:38: COMMA ssi+= identifier
					{
					COMMA323=(Token)match(input,COMMA,FOLLOW_COMMA_in_behaviorTransition9792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA323);

					pushFollow(FOLLOW_identifier_in_behaviorTransition9797);
					ssi=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi.getTree());
					}
					break;

				default :
					break loop164;
				}
			}

			x=(Token)match(input,LCON,FOLLOW_LCON_in_behaviorTransition9806); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCON.add(x);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1495:12: (bc= behaviorCondition )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==AADL_STRING_LITERAL||LA165_0==ID||LA165_0==LBRACKET||LA165_0==LITERAL_abs||LA165_0==LITERAL_all||LA165_0==LITERAL_exists||LA165_0==LITERAL_false||(LA165_0 >= LITERAL_not && LA165_0 <= LITERAL_now)||(LA165_0 >= LITERAL_null && LA165_0 <= LITERAL_numberof)||LA165_0==LITERAL_on||LA165_0==LITERAL_product||LA165_0==LITERAL_round||LA165_0==LITERAL_self||LA165_0==LITERAL_sum||LA165_0==LITERAL_timeout||LA165_0==LITERAL_tops||(LA165_0 >= LITERAL_true && LA165_0 <= LITERAL_truncate)||LA165_0==LPAREN||LA165_0==MINUS||LA165_0==NUMBER||LA165_0==OCTOTHORPE||(LA165_0 >= QCLREF && LA165_0 <= QCREF)) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1495:12: bc= behaviorCondition
					{
					pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition9810);
					bc=behaviorCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorCondition.add(bc.getTree());
					}
					break;

			}

			RCON324=(Token)match(input,RCON,FOLLOW_RCON_in_behaviorTransition9813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCON.add(RCON324);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9820);
			dsi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dsi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:3: ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY )
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==LCURLY) ) {
				alt166=1;
			}
			else if ( (LA166_0==EMPTY_CURLY) ) {
				alt166=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}

			switch (alt166) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:5: LCURLY s= behaviorActions RCURLY
					{
					LCURLY325=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behaviorTransition9827); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY325);

					pushFollow(FOLLOW_behaviorActions_in_behaviorTransition9831);
					s=behaviorActions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorActions.add(s.getTree());
					RCURLY326=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_behaviorTransition9833); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY326);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:39: EMPTY_CURLY
					{
					EMPTY_CURLY327=(Token)match(input,EMPTY_CURLY,FOLLOW_EMPTY_CURLY_in_behaviorTransition9837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EMPTY_CURLY.add(EMPTY_CURLY327);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:4: (q= assertion )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==LASS) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:4: q= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorTransition9845);
					q=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(q.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:20: (semi= SEMICOLON )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==SEMICOLON) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:20: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorTransition9850); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: ssi, q, dsi, id, bc, pr, s
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
			// 1499:5: -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1500:7: ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(TRANSITION, x, "TRANSITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:7: ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, x, "LABEL["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:82: ( $pr)?
				if ( stream_pr.hasNext() ) {
					adaptor.addChild(root_2, stream_pr.nextTree());
				}
				stream_pr.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:7: ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1503:7: ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITION, x, "CONDITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1503:86: ( $bc)?
				if ( stream_bc.hasNext() ) {
					adaptor.addChild(root_2, stream_bc.nextTree());
				}
				stream_bc.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1504:7: ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(DESTINATION, x, "DESTINATION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_dsi.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1505:7: ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, x, "ACTION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1505:80: ( $s)?
				if ( stream_s.hasNext() ) {
					adaptor.addChild(root_2, stream_s.nextTree());
				}
				stream_s.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1506:7: ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, semi, "Q["+Integer.toString(semi.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1506:76: ( $q)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1518:1: priority : LBRACKET ^ NUMBER RBRACKET ;
	public final BLESS3Parser.priority_return priority() throws RecognitionException {
		BLESS3Parser.priority_return retval = new BLESS3Parser.priority_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET328=null;
		Token NUMBER329=null;
		Token RBRACKET330=null;

		BAST LBRACKET328_tree=null;
		BAST NUMBER329_tree=null;
		BAST RBRACKET330_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1518:9: ( LBRACKET ^ NUMBER RBRACKET )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:2: LBRACKET ^ NUMBER RBRACKET
			{
			root_0 = (BAST)adaptor.nil();


			LBRACKET328=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_priority10012); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACKET328_tree = (BAST)adaptor.create(LBRACKET328);
			root_0 = (BAST)adaptor.becomeRoot(LBRACKET328_tree, root_0);
			}

			NUMBER329=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_priority10015); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER329_tree = (BAST)adaptor.create(NUMBER329);
			adaptor.addChild(root_0, NUMBER329_tree);
			}

			RBRACKET330=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_priority10017); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RBRACKET330_tree = (BAST)adaptor.create(RBRACKET330);
			adaptor.addChild(root_0, RBRACKET330_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1522:1: behaviorCondition : ( dispatchCondition | executeCondition | modeCondition | internalCondition );
	public final BLESS3Parser.behaviorCondition_return behaviorCondition() throws RecognitionException {
		BLESS3Parser.behaviorCondition_return retval = new BLESS3Parser.behaviorCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope dispatchCondition331 =null;
		ParserRuleReturnScope executeCondition332 =null;
		ParserRuleReturnScope modeCondition333 =null;
		ParserRuleReturnScope internalCondition334 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:3: ( dispatchCondition | executeCondition | modeCondition | internalCondition )
			int alt169=4;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==LITERAL_on) ) {
				switch ( input.LA(2) ) {
				case LITERAL_dispatch:
					{
					alt169=1;
					}
					break;
				case LITERAL_internal:
					{
					alt169=4;
					}
					break;
				case LPAREN:
				case TRIGGER:
					{
					alt169=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 169, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA169_0==AADL_STRING_LITERAL||LA169_0==ID||LA169_0==LBRACKET||LA169_0==LITERAL_abs||LA169_0==LITERAL_all||LA169_0==LITERAL_exists||LA169_0==LITERAL_false||(LA169_0 >= LITERAL_not && LA169_0 <= LITERAL_now)||(LA169_0 >= LITERAL_null && LA169_0 <= LITERAL_numberof)||LA169_0==LITERAL_product||LA169_0==LITERAL_round||LA169_0==LITERAL_self||LA169_0==LITERAL_sum||LA169_0==LITERAL_timeout||LA169_0==LITERAL_tops||(LA169_0 >= LITERAL_true && LA169_0 <= LITERAL_truncate)||LA169_0==LPAREN||LA169_0==MINUS||LA169_0==NUMBER||LA169_0==OCTOTHORPE||(LA169_0 >= QCLREF && LA169_0 <= QCREF)) ) {
				alt169=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}

			switch (alt169) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:3: dispatchCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition10032);
					dispatchCondition331=dispatchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchCondition331.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:23: executeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_executeCondition_in_behaviorCondition10036);
					executeCondition332=executeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, executeCondition332.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:42: modeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeCondition_in_behaviorCondition10040);
					modeCondition333=modeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modeCondition333.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:58: internalCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_internalCondition_in_behaviorCondition10044);
					internalCondition334=internalCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, internalCondition334.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:1: dispatchCondition : LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? ;
	public final BLESS3Parser.dispatchCondition_return dispatchCondition() throws RecognitionException {
		BLESS3Parser.dispatchCondition_return retval = new BLESS3Parser.dispatchCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on335=null;
		Token LITERAL_dispatch336=null;
		ParserRuleReturnScope de =null;

		BAST LITERAL_on335_tree=null;
		BAST LITERAL_dispatch336_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:18: ( LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1528:3: LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on335=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_dispatchCondition10056); if (state.failed) return retval;
			LITERAL_dispatch336=(Token)match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition10059); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_dispatch336_tree = (BAST)adaptor.create(LITERAL_dispatch336);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_dispatch336_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1528:35: (de= dispatchExpression )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==ID||LA170_0==LITERAL_timeout) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1528:35: de= dispatchExpression
					{
					pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition10064);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1533:1: dispatchExpression :dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? ;
	public final BLESS3Parser.dispatchExpression_return dispatchExpression() throws RecognitionException {
		BLESS3Parser.dispatchExpression_return retval = new BLESS3Parser.dispatchExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or337=null;
		Token LITERAL_or338=null;
		List<Object> list_dc=null;
		RuleReturnScope dc = null;
		BAST LITERAL_or337_tree=null;
		BAST LITERAL_or338_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1533:19: (dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:3: dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10082);
			dc=dispatchConjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

			if (list_dc==null) list_dc=new ArrayList<Object>();
			list_dc.add(dc.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:27: ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==LITERAL_or) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:29: LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )*
					{
					LITERAL_or337=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10086); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or337_tree = (BAST)adaptor.create(LITERAL_or337);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or337_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10091);
					dc=dispatchConjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

					if (list_dc==null) list_dc=new ArrayList<Object>();
					list_dc.add(dc.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1535:4: ( LITERAL_or !dc+= dispatchConjunction )*
					loop171:
					while (true) {
						int alt171=2;
						int LA171_0 = input.LA(1);
						if ( (LA171_0==LITERAL_or) ) {
							alt171=1;
						}

						switch (alt171) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1535:6: LITERAL_or !dc+= dispatchConjunction
							{
							LITERAL_or338=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10099); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10104);
							dc=dispatchConjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTree());
							}
							break;

						default :
							break loop171;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:1: dispatchConjunction :trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? ;
	public final BLESS3Parser.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		BLESS3Parser.dispatchConjunction_return retval = new BLESS3Parser.dispatchConjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and339=null;
		Token LITERAL_and340=null;
		List<Object> list_trigger=null;
		RuleReturnScope trigger = null;
		BAST LITERAL_and339_tree=null;
		BAST LITERAL_and340_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:20: (trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:3: trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10127);
			trigger=dispatchTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

			if (list_trigger==null) list_trigger=new ArrayList<Object>();
			list_trigger.add(trigger.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1542:5: ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==LITERAL_and) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1542:7: LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )*
					{
					LITERAL_and339=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10136); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and339_tree = (BAST)adaptor.create(LITERAL_and339);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and339_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10141);
					trigger=dispatchTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

					if (list_trigger==null) list_trigger=new ArrayList<Object>();
					list_trigger.add(trigger.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1543:6: ( LITERAL_and !trigger+= dispatchTrigger )*
					loop173:
					while (true) {
						int alt173=2;
						int LA173_0 = input.LA(1);
						if ( (LA173_0==LITERAL_and) ) {
							alt173=1;
						}

						switch (alt173) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1543:8: LITERAL_and !trigger+= dispatchTrigger
							{
							LITERAL_and340=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10151); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10156);
							trigger=dispatchTrigger();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

							if (list_trigger==null) list_trigger=new ArrayList<Object>();
							list_trigger.add(trigger.getTree());
							}
							break;

						default :
							break loop173;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1546:1: dispatchTrigger : (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )? );
	public final BLESS3Parser.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		BLESS3Parser.dispatchTrigger_return retval = new BLESS3Parser.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout341=null;
		Token LPAREN342=null;
		Token LITERAL_or343=null;
		Token RPAREN344=null;
		Token ports=null;
		List<Object> list_ports=null;
		ParserRuleReturnScope port =null;
		ParserRuleReturnScope time =null;

		BAST LITERAL_timeout341_tree=null;
		BAST LPAREN342_tree=null;
		BAST LITERAL_or343_tree=null;
		BAST RPAREN344_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1546:16: (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )? )
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==ID) ) {
				alt178=1;
			}
			else if ( (LA178_0==LITERAL_timeout) ) {
				alt178=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 178, 0, input);
				throw nvae;
			}

			switch (alt178) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1547:3: port= portName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portName_in_dispatchTrigger10174);
					port=portName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, port.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1548:5: LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )?
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout341=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger10182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout341_tree = (BAST)adaptor.create(LITERAL_timeout341);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_timeout341_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:4: ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )?
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==ID||LA177_0==LITERAL_self||LA177_0==LPAREN||LA177_0==NUMBER||LA177_0==OCTOTHORPE||(LA177_0 >= QCLREF && LA177_0 <= QCREF)) ) {
						alt177=1;
					}
					switch (alt177) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )?
							int alt176=2;
							alt176 = dfa176.predict(input);
							switch (alt176) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:8: LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN
									{
									LPAREN342=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger10193); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LPAREN342_tree = (BAST)adaptor.create(LPAREN342);
									root_0 = (BAST)adaptor.becomeRoot(LPAREN342_tree, root_0);
									}

									ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10198); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ports_tree = (BAST)adaptor.create(ports);
									adaptor.addChild(root_0, ports_tree);
									}

									if (list_ports==null) list_ports=new ArrayList<Object>();
									list_ports.add(ports);
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1550:9: ( LITERAL_or !ports+= ID )*
									loop175:
									while (true) {
										int alt175=2;
										int LA175_0 = input.LA(1);
										if ( (LA175_0==LITERAL_or) ) {
											alt175=1;
										}

										switch (alt175) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1550:10: LITERAL_or !ports+= ID
											{
											LITERAL_or343=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchTrigger10210); if (state.failed) return retval;
											ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10215); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ports_tree = (BAST)adaptor.create(ports);
											adaptor.addChild(root_0, ports_tree);
											}

											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop175;
										}
									}

									RPAREN344=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dispatchTrigger10229); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									RPAREN344_tree = (BAST)adaptor.create(RPAREN344);
									adaptor.addChild(root_0, RPAREN344_tree);
									}

									}
									break;

							}

							pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10247);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1557:1: portName : port= ID ^ ( '[' index= NUMBER ']' )? ;
	public final BLESS3Parser.portName_return portName() throws RecognitionException {
		BLESS3Parser.portName_return retval = new BLESS3Parser.portName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token port=null;
		Token index=null;
		Token char_literal345=null;
		Token char_literal346=null;

		BAST port_tree=null;
		BAST index_tree=null;
		BAST char_literal345_tree=null;
		BAST char_literal346_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1557:9: (port= ID ^ ( '[' index= NUMBER ']' )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:3: port= ID ^ ( '[' index= NUMBER ']' )?
			{
			root_0 = (BAST)adaptor.nil();


			port=(Token)match(input,ID,FOLLOW_ID_in_portName10268); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			port_tree = (BAST)adaptor.create(port);
			root_0 = (BAST)adaptor.becomeRoot(port_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:3: ( '[' index= NUMBER ']' )?
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==LBRACKET) ) {
				alt179=1;
			}
			switch (alt179) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:5: '[' index= NUMBER ']'
					{
					char_literal345=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_portName10276); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal345_tree = (BAST)adaptor.create(char_literal345);
					adaptor.addChild(root_0, char_literal345_tree);
					}

					index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_portName10280); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					index_tree = (BAST)adaptor.create(index);
					adaptor.addChild(root_0, index_tree);
					}

					char_literal346=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_portName10282); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal346_tree = (BAST)adaptor.create(char_literal346);
					adaptor.addChild(root_0, char_literal346_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:1: executeCondition : expression ;
	public final BLESS3Parser.executeCondition_return executeCondition() throws RecognitionException {
		BLESS3Parser.executeCondition_return retval = new BLESS3Parser.executeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression347 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:17: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1563:15: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_executeCondition10297);
			expression347=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression347.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1566:1: modeCondition : LITERAL_on ^tle= triggerLogicalExpression ;
	public final BLESS3Parser.modeCondition_return modeCondition() throws RecognitionException {
		BLESS3Parser.modeCondition_return retval = new BLESS3Parser.modeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on348=null;
		ParserRuleReturnScope tle =null;

		BAST LITERAL_on348_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1566:14: ( LITERAL_on ^tle= triggerLogicalExpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1567:2: LITERAL_on ^tle= triggerLogicalExpression
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on348=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10308); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_on348_tree = (BAST)adaptor.create(LITERAL_on348);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_on348_tree, root_0);
			}

			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10313);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1570:1: triggerLogicalExpression : first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1570:25: (first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:3: first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			{
			pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10326);
			first=eventTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_eventTrigger.add(first.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:22: (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			int alt181=2;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==LITERAL_and||LA181_0==LITERAL_or||LA181_0==LITERAL_xor) ) {
				alt181=1;
			}
			switch (alt181) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:24: op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)*
					{
					pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10332);
					op1=logicalOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalOperator.add(op1.getTree());
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10336);
					et=eventTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
					if (list_et==null) list_et=new ArrayList<Object>();
					list_et.add(et.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1572:5: (op2= logicalOperator et+= eventTrigger {...}?)*
					loop180:
					while (true) {
						int alt180=2;
						int LA180_0 = input.LA(1);
						if ( (LA180_0==LITERAL_and||LA180_0==LITERAL_or||LA180_0==LITERAL_xor) ) {
							alt180=1;
						}

						switch (alt180) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1572:6: op2= logicalOperator et+= eventTrigger {...}?
							{
							pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10346);
							op2=logicalOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicalOperator.add(op2.getTree());
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10350);
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
							break loop180;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: first, et, first, op1
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
			// 1573:5: -> {op1!=null}? ^( $op1 $first ( $et)+ )
			if (op1!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1573:21: ^( $op1 $first ( $et)+ )
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

			else // 1574:5: -> $first
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1581:1: logicalOperator : ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else );
	public final BLESS3Parser.logicalOperator_return logicalOperator() throws RecognitionException {
		BLESS3Parser.logicalOperator_return retval = new BLESS3Parser.logicalOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and349=null;
		Token LITERAL_or350=null;
		Token LITERAL_xor351=null;
		Token LITERAL_and352=null;
		Token LITERAL_then353=null;
		Token LITERAL_or354=null;
		Token LITERAL_else355=null;

		BAST LITERAL_and349_tree=null;
		BAST LITERAL_or350_tree=null;
		BAST LITERAL_xor351_tree=null;
		BAST LITERAL_and352_tree=null;
		BAST LITERAL_then353_tree=null;
		BAST LITERAL_or354_tree=null;
		BAST LITERAL_else355_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:3: ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else )
			int alt182=5;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				int LA182_1 = input.LA(2);
				if ( (LA182_1==LITERAL_then) ) {
					alt182=4;
				}
				else if ( (LA182_1==LPAREN||LA182_1==TRIGGER) ) {
					alt182=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_or:
				{
				int LA182_2 = input.LA(2);
				if ( (LA182_2==LITERAL_else) ) {
					alt182=5;
				}
				else if ( (LA182_2==LPAREN||LA182_2==TRIGGER) ) {
					alt182=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 182, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_xor:
				{
				alt182=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}
			switch (alt182) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1583:3: LITERAL_and
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and349=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10416); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and349_tree = (BAST)adaptor.create(LITERAL_and349);
					adaptor.addChild(root_0, LITERAL_and349_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1584:5: LITERAL_or
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or350=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or350_tree = (BAST)adaptor.create(LITERAL_or350);
					adaptor.addChild(root_0, LITERAL_or350_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1585:5: LITERAL_xor
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_xor351=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_logicalOperator10428); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor351_tree = (BAST)adaptor.create(LITERAL_xor351);
					adaptor.addChild(root_0, LITERAL_xor351_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1586:5: LITERAL_and ! LITERAL_then
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and352=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10434); if (state.failed) return retval;
					LITERAL_then353=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_logicalOperator10437); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then353_tree = (BAST)adaptor.create(LITERAL_then353);
					adaptor.addChild(root_0, LITERAL_then353_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:5: LITERAL_or ! LITERAL_else
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or354=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10443); if (state.failed) return retval;
					LITERAL_else355=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_logicalOperator10446); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else355_tree = (BAST)adaptor.create(LITERAL_else355);
					adaptor.addChild(root_0, LITERAL_else355_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1590:1: eventTrigger : (tr= TRIGGER | LPAREN ^ triggerLogicalExpression RPAREN );
	public final BLESS3Parser.eventTrigger_return eventTrigger() throws RecognitionException {
		BLESS3Parser.eventTrigger_return retval = new BLESS3Parser.eventTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token tr=null;
		Token LPAREN356=null;
		Token RPAREN358=null;
		ParserRuleReturnScope triggerLogicalExpression357 =null;

		BAST tr_tree=null;
		BAST LPAREN356_tree=null;
		BAST RPAREN358_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1590:13: (tr= TRIGGER | LPAREN ^ triggerLogicalExpression RPAREN )
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==TRIGGER) ) {
				alt183=1;
			}
			else if ( (LA183_0==LPAREN) ) {
				alt183=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 183, 0, input);
				throw nvae;
			}

			switch (alt183) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1591:3: tr= TRIGGER
					{
					root_0 = (BAST)adaptor.nil();


					tr=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_eventTrigger10461); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					tr_tree = (BAST)adaptor.create(tr);
					adaptor.addChild(root_0, tr_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1592:5: LPAREN ^ triggerLogicalExpression RPAREN
					{
					root_0 = (BAST)adaptor.nil();


					LPAREN356=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger10467); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN356_tree = (BAST)adaptor.create(LPAREN356);
					root_0 = (BAST)adaptor.becomeRoot(LPAREN356_tree, root_0);
					}

					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger10470);
					triggerLogicalExpression357=triggerLogicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, triggerLogicalExpression357.getTree());

					RPAREN358=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger10472); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN358_tree = (BAST)adaptor.create(RPAREN358);
					adaptor.addChild(root_0, RPAREN358_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1595:1: internalCondition : LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* ;
	public final BLESS3Parser.internalCondition_return internalCondition() throws RecognitionException {
		BLESS3Parser.internalCondition_return retval = new BLESS3Parser.internalCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on359=null;
		Token LITERAL_internal360=null;
		Token LITERAL_or361=null;
		Token ports=null;
		List<Object> list_ports=null;

		BAST LITERAL_on359_tree=null;
		BAST LITERAL_internal360_tree=null;
		BAST LITERAL_or361_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1595:18: ( LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1596:2: LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )*
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on359=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_internalCondition10483); if (state.failed) return retval;
			LITERAL_internal360=(Token)match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10486); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_internal360_tree = (BAST)adaptor.create(LITERAL_internal360);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_internal360_tree, root_0);
			}

			ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10491); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ports_tree = (BAST)adaptor.create(ports);
			adaptor.addChild(root_0, ports_tree);
			}

			if (list_ports==null) list_ports=new ArrayList<Object>();
			list_ports.add(ports);
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1597:3: ( LITERAL_or !ports+= ID )*
			loop184:
			while (true) {
				int alt184=2;
				int LA184_0 = input.LA(1);
				if ( (LA184_0==LITERAL_or) ) {
					alt184=1;
				}

				switch (alt184) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1597:5: LITERAL_or !ports+= ID
					{
					LITERAL_or361=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_internalCondition10498); if (state.failed) return retval;
					ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10503); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ports_tree = (BAST)adaptor.create(ports);
					adaptor.addChild(root_0, ports_tree);
					}

					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					break loop184;
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
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:993:3: ( LPAREN LITERAL_if )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:993:4: LPAREN LITERAL_if
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_BLESS35942); if (state.failed) return;

		match(input,LITERAL_if,FOLLOW_LITERAL_if_in_synpred1_BLESS35944); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_BLESS3

	// $ANTLR start synpred2_BLESS3
	public final void synpred2_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:5: ( LBRACKET ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:6: LBRACKET ID COLON
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred2_BLESS35962); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred2_BLESS35964); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred2_BLESS35966); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_BLESS3

	// $ANTLR start synpred3_BLESS3
	public final void synpred3_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:5: ( ID LPAREN )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:6: ID LPAREN
		{
		match(input,ID,FOLLOW_ID_in_synpred3_BLESS35978); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_BLESS35980); if (state.failed) return;

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


	protected DFA176 dfa176 = new DFA176(this);
	static final String DFA176_eotS =
		"\12\uffff";
	static final String DFA176_eofS =
		"\12\uffff";
	static final String DFA176_minS =
		"\1\75\1\4\1\uffff\1\10\1\4\1\75\1\10\1\uffff\1\4\1\10";
	static final String DFA176_maxS =
		"\2\u00ff\1\uffff\1\u0115\1\u00ff\1\u0105\1\u0115\1\uffff\1\u00ff\1\u0115";
	static final String DFA176_acceptS =
		"\2\uffff\1\2\4\uffff\1\1\2\uffff";
	static final String DFA176_specialS =
		"\12\uffff}>";
	static final String[] DFA176_transitionS = {
			"\1\2\177\uffff\1\2\50\uffff\1\1\6\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"\1\2\70\uffff\1\3\15\uffff\1\2\13\uffff\1\2\1\uffff\1\2\15\uffff\1\2"+
			"\22\uffff\1\2\2\uffff\1\2\40\uffff\2\2\1\uffff\2\2\11\uffff\1\2\15\uffff"+
			"\1\2\2\uffff\1\2\14\uffff\1\2\5\uffff\1\2\1\uffff\1\2\2\uffff\2\2\17"+
			"\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"",
			"\2\2\11\uffff\1\2\7\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\4\uffff\1\2\20\uffff\1\2\16\uffff\1\2\32\uffff\1\2\26\uffff\1\2\1\uffff"+
			"\2\2\11\uffff\1\2\13\uffff\1\4\17\uffff\1\2\57\uffff\3\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
			"\1\2\7\uffff\1\5\10\uffff\1\2\1\uffff\1\2",
			"\1\2\70\uffff\1\6\15\uffff\1\2\13\uffff\1\2\37\uffff\1\2\5\uffff\1\2"+
			"\40\uffff\2\2\1\uffff\1\2\30\uffff\1\2\2\uffff\1\2\22\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\2\2\17\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16"+
			"\uffff\2\2",
			"\1\7\34\uffff\1\2\112\uffff\1\2\27\uffff\1\7\50\uffff\1\7\6\uffff\1"+
			"\7\1\uffff\1\7\16\uffff\2\7\5\uffff\1\2",
			"\2\2\11\uffff\1\2\7\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\4\uffff\1\2\20\uffff\1\2\16\uffff\1\2\32\uffff\1\2\26\uffff\1\2\1\uffff"+
			"\2\2\11\uffff\1\2\13\uffff\1\10\17\uffff\1\2\60\uffff\2\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
			"\1\2\7\uffff\1\5\10\uffff\1\2\1\uffff\1\2",
			"",
			"\1\2\70\uffff\1\11\15\uffff\1\2\13\uffff\1\2\45\uffff\1\2\40\uffff\2"+
			"\2\1\uffff\1\2\30\uffff\1\2\2\uffff\1\2\22\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\17\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"\2\2\11\uffff\1\2\7\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\4\uffff\1\2\20\uffff\1\2\16\uffff\1\2\32\uffff\1\2\26\uffff\1\2\1\uffff"+
			"\2\2\11\uffff\1\2\13\uffff\1\10\17\uffff\1\2\60\uffff\2\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
			"\1\2\7\uffff\1\5\10\uffff\1\2\1\uffff\1\2"
	};

	static final short[] DFA176_eot = DFA.unpackEncodedString(DFA176_eotS);
	static final short[] DFA176_eof = DFA.unpackEncodedString(DFA176_eofS);
	static final char[] DFA176_min = DFA.unpackEncodedStringToUnsignedChars(DFA176_minS);
	static final char[] DFA176_max = DFA.unpackEncodedStringToUnsignedChars(DFA176_maxS);
	static final short[] DFA176_accept = DFA.unpackEncodedString(DFA176_acceptS);
	static final short[] DFA176_special = DFA.unpackEncodedString(DFA176_specialS);
	static final short[][] DFA176_transition;

	static {
		int numStates = DFA176_transitionS.length;
		DFA176_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA176_transition[i] = DFA.unpackEncodedString(DFA176_transitionS[i]);
		}
	}

	protected class DFA176 extends DFA {

		public DFA176(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 176;
			this.eot = DFA176_eot;
			this.eof = DFA176_eof;
			this.min = DFA176_min;
			this.max = DFA176_max;
			this.accept = DFA176_accept;
			this.special = DFA176_special;
			this.transition = DFA176_transition;
		}
		@Override
		public String getDescription() {
			return "1549:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )?";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitDeclaration_in_unitLibrary2652 = new BitSet(new long[]{0x2000010000000002L,0x1000000200000000L});
	public static final BitSet FOLLOW_LT_in_unitName2691 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2696 = new BitSet(new long[]{0x2400000000000000L});
	public static final BitSet FOLLOW_GT_in_unitName2700 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula2739 = new BitSet(new long[]{0x2000010000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2746 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2750 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2788 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2792 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration2825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration2829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration2848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration2860 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration2864 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_rootDeclaration2867 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration2874 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration2878 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_rootDeclaration2881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension2931 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitExtension2936 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension2940 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_unitExtension2943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor2977 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_unitName_in_unitFactor2981 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_mulDiv_in_unitFactor2985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor2989 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary3029 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration3042 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_is_in_typeDeclaration3049 = new BitSet(new long[]{0x0000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_type_in_typeDeclaration3054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationType_in_type3066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type3072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type3078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type3084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type3096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type3102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference3114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference3120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType3133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_enumerationType3136 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationType3141 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_enumerationType3144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType3160 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_quantityType3170 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType3176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType3182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L,0x0080000000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_quantityType3190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType3195 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType3199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType3204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_quantityType3206 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType3216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType3221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType3236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType3241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType3260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayType3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType3268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayType3270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType3273 = new BitSet(new long[]{0x2000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType3277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3293 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3302 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3311 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3331 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange3335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A00000000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_recordType3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_recordType3370 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_recordField_in_recordType3375 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_recordType3378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_recordField3396 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_recordField3398 = new BitSet(new long[]{0x2000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField3403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary3423 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary3432 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_variables_in_ghostVariables3468 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables3473 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable3486 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_ghostVariable3492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_TILDE_in_ghostVariable3494 = new BitSet(new long[]{0x2000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable3499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namedAssertion3514 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3520 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3522 = new BitSet(new long[]{0x2000000010000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion3535 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3553 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion3558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion3578 = new BitSet(new long[]{0x2000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion3582 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namedAssertion3584 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion3589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion3618 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion3626 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RASS_in_namedAssertion3634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_predicate3966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableList3977 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3981 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3986 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3990 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3995 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ID_in_variable4013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_TILDE_in_variable4015 = new BitSet(new long[]{0x2000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_typeOrReference_in_variable4020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue4031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue4037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_conditionalAssertionFunction4050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction4054 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_COMMA_in_conditionalAssertionFunction4058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction4062 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_conditionalAssertionFunction4067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionValuePair4095 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair4098 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair4100 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair4103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration4119 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration4123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration4150 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4154 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration4160 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4164 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration4168 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4172 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ID_in_enumerationPair4232 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair4234 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair4237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_enumerationValue4251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue4253 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue4258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessAssertion4270 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion4274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RASS_in_namelessAssertion4276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessFunction4305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction4309 = new BitSet(new long[]{0x2000000000000000L,0x0100000840000000L,0x000A000200000000L,0x0000000081000100L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction4313 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namelessFunction4315 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction4319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RASS_in_namelessFunction4321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessEnumeration4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_namelessEnumeration4365 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration4369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_RASS_in_namelessEnumeration4371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_invocation4398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_invocation4400 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L,0x0000000000000400L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4410 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_invocation4414 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4418 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_expression_in_invocation4432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_invocation4437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_actualParameter4472 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_actualParameter4474 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_actualParameter4479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion4491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion4497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion4503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion4509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression4527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression4535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression4543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression4551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression4559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disjunction_in_expression4567 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000005000L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression4572 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression4577 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_disjunction_in_expression4583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification4599 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification4603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalQuantification4614 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_range_in_universalQuantification4618 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_universalQuantification4624 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4628 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification4639 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification4739 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification4743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_in_in_existentialQuantification4754 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_range_in_existentialQuantification4758 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification4764 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4768 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_existentialQuantification4779 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification4879 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification4883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_sumQuantification4894 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_range_in_sumQuantification4898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_sumQuantification4904 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_sumQuantification4908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification4919 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_sumQuantification4923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification5019 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification5023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_productQuantification5034 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_range_in_productQuantification5038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_productQuantification5044 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_productQuantification5048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification5059 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_productQuantification5063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification5159 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification5163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_countingQuantification5174 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_range_in_countingQuantification5178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_which_in_countingQuantification5184 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_predicate_in_countingQuantification5188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification5199 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_countingQuantification5203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_logicVariables5299 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5303 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5308 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5312 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5317 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5339 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5356 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5365 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5391 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5394 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5403 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5406 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5432 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5437 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5441 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_relation_in_conjunction5470 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5480 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_relation_in_conjunction5485 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5489 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_relation_in_conjunction5494 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5512 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_relation_in_conjunction5517 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5524 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_relation_in_conjunction5529 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_addSub_in_relation5550 = new BitSet(new long[]{0x0408000000000302L,0x0000000000000000L,0x0000000000008000L,0x0081108000000000L});
	public static final BitSet FOLLOW_relation_symbol_in_relation5560 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_addSub_in_relation5563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation5577 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_range_in_relation5580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_range5595 = new BitSet(new long[]{0x0000180180000000L});
	public static final BitSet FOLLOW_rangeSymbol_in_range5597 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_subexpression_in_range5600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multDiv_in_addSub5631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0020040000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5643 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_multDiv_in_addSub5646 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5650 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_multDiv_in_addSub5653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_MINUS_in_addSub5672 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_multDiv_in_addSub5675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5695 = new BitSet(new long[]{0x0000010000000002L,0x0020000000000000L,0x0020000002000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5707 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5714 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5717 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_dividers_in_multDiv5735 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5781 = new BitSet(new long[]{0x0020000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5785 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryOperator_in_subexpression5808 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000800L,0x2000000280000000L,0xC000A04000250000L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_subexpression5846 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000800L,0x2000000280000000L,0xC000A04000250000L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5897 = new BitSet(new long[]{0x0000000008080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5905 = new BitSet(new long[]{0x2000000000000010L,0x2000000000800800L,0x24000002C0000000L,0xC000A44000650000L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5920 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6003 = new BitSet(new long[]{0x2000000000000010L,0x2400008002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000401L});
	public static final BitSet FOLLOW_QQ_in_parenthesizedSubexpression6020 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6023 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_parenthesizedSubexpression6025 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_caseChoice6083 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_caseChoice6088 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6090 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_caseChoice6095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_caseChoice6097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression6113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LITERAL_if_in_conditionalExpression6115 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conditionalExpression6121 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6125 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_conditionalExpression6127 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression6135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_recordTerm6181 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_recordTerm6185 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_recordTerm6187 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6191 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_recordTerm6194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_recordValue6230 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6232 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A00000250000L});
	public static final BitSet FOLLOW_value_in_recordValue6235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_recordValue6237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_periodShift6257 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A04000250000L});
	public static final BitSet FOLLOW_value_in_periodShift6270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift6284 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift6288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift6292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6372 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0020000002000000L,0x0020040000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6380 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6393 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6406 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6419 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6432 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6439 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6455 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6462 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6482 = new BitSet(new long[]{0x0000100000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6486 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationValue_in_value6545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6560 = new BitSet(new long[]{0x0000060000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_valueName6578 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_valueName6586 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6598 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6604 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6614 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6620 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L,0x0000000000000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_DOT_in_valueName6636 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6640 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_DOT_in_valueName6644 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6648 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080004L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6692 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6918 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6922 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6927 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6934 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6939 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6957 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6965 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6993 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName6999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName7006 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000280000000L,0xC000A44000250000L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName7010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName7012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_quantity_in_constant7060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant7068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant7076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant7084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant7092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7109 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000000L,0x0800000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_ID_in_quantity7118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_294_in_quantity7120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QCLREF_in_aNumber7193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7212 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7223 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7240 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7251 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7272 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7284 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7299 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_propertyField7311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_propertyField7320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propertyField7328 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ID_in_propertyField7335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7367 = new BitSet(new long[]{0x0000000000000000L,0x0002000080002000L,0x0000060000080000L,0x0000000000008000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7374 = new BitSet(new long[]{0x0000000000000000L,0x0002000080002000L,0x0000060000080000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7382 = new BitSet(new long[]{0x0000000000000000L,0x0002000000002000L,0x0000060000080000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7397 = new BitSet(new long[]{0x0000000000000000L,0x0002000000002000L,0x0000020000080000L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7412 = new BitSet(new long[]{0x0000000000000000L,0x0002000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7428 = new BitSet(new long[]{0x0000000000000000L,0x0002000000002000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7506 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_throwsClause7511 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7532 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime7553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_behaviorTime7565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause7578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause7581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7594 = new BitSet(new long[]{0x2000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm7603 = new BitSet(new long[]{0x2000000010000000L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm7608 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7614 = new BitSet(new long[]{0x2000000000000000L,0x8200100000000000L,0x0000000000000007L,0x0000000100000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7632 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7635 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7649 = new BitSet(new long[]{0x0000000000040002L,0x0000800000000400L,0x0000000020000010L,0x000000000000000AL,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7660 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7670 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7680 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7690 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration7700 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7714 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7718 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration7737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7844 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7857 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7866 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7890 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7895 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7899 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7903 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7926 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002000L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_action_in_assertedAction7935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicAction_in_action8057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction8139 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_computation_in_basicAction8167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameTick_in_assignment8192 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8194 = new BitSet(new long[]{0x2000000000000010L,0x240000000A800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8209 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8215 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8219 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8223 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8227 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8231 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8239 = new BitSet(new long[]{0x2000000000000010L,0x240000000A800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8245 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8249 = new BitSet(new long[]{0x2000000000000010L,0x240000000A800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8253 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8257 = new BitSet(new long[]{0x2000000000000010L,0x240000000A800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8261 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_nameTick8309 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_TICK_in_nameTick8313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8346 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_whenThrow8350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8354 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8358 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation8387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8390 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8395 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8397 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8402 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8404 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation8423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8426 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8431 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8433 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8438 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8440 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation8458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8461 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8466 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8468 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8473 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8475 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation8493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8496 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8501 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8503 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8508 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8510 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation8528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8531 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8536 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8538 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8543 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8545 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction8567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction8577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction8587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation8603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_computation8606 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A04000000000L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8611 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_computation8615 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A04000000000L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_computation8625 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_in_in_computation8634 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation8637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_QCREF_in_computation8642 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_ID_in_subprogramCall8660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_subprogramCall8662 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000200000000L,0xC000A04000200000L,0x0000000000000400L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall8666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_subprogramCall8669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8700 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8704 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000200000000L,0xC000A04000200000L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8707 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8711 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000200000000L,0xC000A04000200000L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8714 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_ID_in_formalActual8736 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_formalActual8744 = new BitSet(new long[]{0x2000000000000010L,0x2000000000000000L,0x2000000200000000L,0xC000A04000200000L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter8763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter8768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter8773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portOutput8789 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_EXCLAMATION_in_portOutput8791 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_portOutput8795 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_portOutput8799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_portOutput8801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portInput8847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QUESTION_in_portInput8849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_portInput8851 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_valueName_in_portInput8856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_portInput8858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative8899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8907 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_BOX_in_alternative8913 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8917 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fi_in_alternative8925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_guardedAction8963 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_guardedAction8967 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction8969 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction8972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop8996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileLoop9002 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_whileLoop9007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_whileLoop9009 = new BitSet(new long[]{0x0000000000000000L,0x0002001000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_whileLoop9016 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9020 = new BitSet(new long[]{0x0000000000000000L,0x0002001000002000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_whileLoop9029 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_whileLoop9034 = new BitSet(new long[]{0x0000000000000000L,0x0002000000002000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop9045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop9103 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_identifier_in_forLoop9110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop9115 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_forLoop9120 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_forLoop9122 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_forLoop9127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_forLoop9134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_forLoop9138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LCURLY_in_forLoop9145 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RCURLY_in_forLoop9152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9215 = new BitSet(new long[]{0x2000000000000000L,0x8242101000002400L,0x00000000000808C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_doUntilLoop9222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9226 = new BitSet(new long[]{0x2000000000000000L,0x8242101000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_doUntilLoop9235 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9240 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_doUntilLoop9259 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_doUntilLoop9266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification9340 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification9346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification9348 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification9356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9381 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9390 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9395 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9399 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_universalLatticeQuantification9401 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001006C0000000L,0xC000A44000650400L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9405 = new BitSet(new long[]{0x0000000000000000L,0x0002000000002000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9414 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_issueException9466 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_issueException9470 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_issueException9481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9495 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L,0x0000000000080000L,0x0000000040100020L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9502 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L,0x0000000040100020L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000040100020L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000100020L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection9589 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection9594 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection9606 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection9611 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_identifier_in_behaviorState9628 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorState9633 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000020010L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState9638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState9644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState9650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState9656 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_assertion_in_behaviorState9660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorState9663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions9724 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions9728 = new BitSet(new long[]{0x2000000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9773 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition9777 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorTransition9780 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9788 = new BitSet(new long[]{0x0000000040000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_behaviorTransition9792 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9797 = new BitSet(new long[]{0x0000000040000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LCON_in_behaviorTransition9806 = new BitSet(new long[]{0x2000000000000010L,0x2400000002800800L,0x24001016C0000000L,0xC000A44000650400L,0x0000000000000020L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition9810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RCON_in_behaviorTransition9813 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9820 = new BitSet(new long[]{0x0002000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LCURLY_in_behaviorTransition9827 = new BitSet(new long[]{0x2000000000000000L,0x8242100000002400L,0x00000000000008C7L,0x0000000500000805L,0x0000000800000000L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition9831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_RCURLY_in_behaviorTransition9833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_EMPTY_CURLY_in_behaviorTransition9837 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition9845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorTransition9850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_priority10012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_NUMBER_in_priority10015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_priority10017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition10032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition10036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition10040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition10044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_dispatchCondition10056 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition10059 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition10064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10082 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10086 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10091 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10099 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10127 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10136 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10141 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10151 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10156 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger10174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger10182 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000000L,0x2000000000000000L,0xC000A04000000000L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger10193 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchTrigger10210 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_dispatchTrigger10229 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x2000000000000000L,0xC000A04000000000L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_LBRACKET_in_portName10276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_NUMBER_in_portName10280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_RBRACKET_in_portName10282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_executeCondition10297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10326 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x0000002000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10336 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x0000002000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10350 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x0000002000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_xor_in_logicalOperator10428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_then_in_logicalOperator10437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10443 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_logicalOperator10446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_eventTrigger10461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger10467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger10470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger10472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_internalCondition10483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10486 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_internalCondition10498 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10503 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred1_BLESS35942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LITERAL_if_in_synpred1_BLESS35944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred2_BLESS35962 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred2_BLESS35964 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COLON_in_synpred2_BLESS35966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred3_BLESS35978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred3_BLESS35980 = new BitSet(new long[]{0x0000000000000002L});
}
