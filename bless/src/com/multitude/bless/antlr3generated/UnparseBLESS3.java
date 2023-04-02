// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g 2023-04-01 20:11:37

//copyright 2023 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.exceptions.BLESSmarker;
import com.multitude.bless.app.Global;
import com.multitude.aadl.bless.maps.BlessMaps;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class UnparseBLESS3 extends TreeParser {
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
		"UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", "VERT", "WP", "WS", "'%'", 
		"FUNCTION_CALL"
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
	public static final int FUNCTION_CALL=300;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public UnparseBLESS3(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public UnparseBLESS3(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("UnparseBLESS3Templates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return UnparseBLESS3.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g"; }


	public static int countRecognitionErrors = 0; //accumulates count of recognition errors
	public static boolean recognitionErrorOccurred = false;    //did a parse error occur?
	public static boolean suppressRecognitionException = false;  //inhibit report error of RecognitionException 
	//public static StringTemplateGroup templates=null;	//templates currently used by UnparseBLESS
	public static boolean lookUpPropertyValues = false;  //look up AADL property values when unparsing rather than name
	public static String singletonName = "";	//Slang name for AADL component hving subprogram subcomponents

	//public boolean SAL=false;  //are we unparsing to SAL?

	public String componentName = "";

	 int startingLine = 0; //starting line of sublanguage in AADL file

	  public  void 
	setStartingLine(int line) //sets starting line
	  {
	  startingLine = line;
	  }

	public  int
	getStartingLine()
	  {
	  return startingLine;
	  }
	  

	//ANTLR string template magic
	  public static StringTemplate 
	template(String name) 
	  {
	  return Global.templates.getInstanceOf(name);
	  }

	  public static StringTemplate 
	text(String t) 
	  {
	  return new StringTemplate(Global.templates,t);
	  }

	  public void 
	reportError(RecognitionException ex)
	  {
	  if (!suppressRecognitionException)
	  {
	 // if (true)
	 // {
	  if (countRecognitionErrors<Global.YouIdiotReportLimit)
	    {
	//   Dump.it("\nUnparseBLESS.reportError(RecognitionException ex)=>"+
	//    Integer.toString(countRecognitionErrors)+" ");
	  Dump.it(getErrorHeader(ex));
	  Dump.it(ex);
	   recognitionErrorOccurred = true;
	   ex.line = ex.line+startingLine;
	   super.reportError(ex);
	  ex.printStackTrace();
	//  Dump.re(ex);
	    }
	  countRecognitionErrors++;
	//  }
	//  // Global.stopProof = true;	//stop proving!
	  }
	  } //end of reportError

	static int typeNameNumber = 0;	//counts type names created


	static StringTemplate getNextTypeID()
		{
		typeNameNumber++;
		return text(makeIntoString(typeNameNumber));
		}

	public static String makeIntoString(int i)
		{
		return Integer.toString(i);
		}

	static StringTemplate  getPackageName()
		{
		return text(Global.packageOrPropertySetID);
		}

	  static StringTemplate slang_simultaneous_assignment(List<Object> l, List<Object> r)
	    {
	    String spaces = "    ";
	    StringBuffer sb = new StringBuffer();
	    sb.append("//simultaneous assignment\n");
	    sb.append(spaces+"//assign to fresh values\n");
	    for (int i=0;i<l.size();i++)
	      {
	      String lhs = ((StringTemplate)l.get(i)).toString().replace("'", "");
	      String rhs = ((StringTemplate)r.get(i)).toString();
	      sb.append(spaces+"val new_"+lhs+" = "+rhs+"\n");
	      }
	    sb.append(spaces+"//copy to variables\n");
	    for (int i=0;i<l.size();i++)
	      {
	      String lhs = ((StringTemplate)l.get(i)).toString().replace("'", "");
	      sb.append(spaces+lhs+" = new_"+lhs+"\n");
	      }
	    return text(sb.toString());
	    }

	static StringTemplate  makeDimensionFromRange(StringTemplate l, StringTemplate r)
		{
		String l_value = l.toString();
		int l_int = 0;
		try
			{
			l_int = Integer.decode(l_value).intValue();
			}
		catch (NumberFormatException ex)
			{
			//look up the value of the ID or enumeration literal
			//otherwise leave as 0
			}	
		String r_value = r.toString();
		int r_int = 1;
		try
			{
			r_int = Integer.decode(r_value).intValue();
			}
		catch (NumberFormatException ex)
			{
			//look up the value of the ID or enumeration literal
			//otherwise use length of string
			r_int = r_value.length();
			}	
		int dimension = r_int-l_int;
		return text(makeIntoString(dimension));
		}  //end of makeDimensionFromRange
		
	static StringTemplate getAadlPropertyValue(BAST dc)
		  {
		  if (!dc.hasType(DOUBLE_COLON))
		    return text("parameter to UnparseBLESS.getAadlPropertyValue must have root DOUBLE_COLON");
		  return text(Global.getAadlPropertyValue(dc.getChild(0).getText(),dc.getChild(1).getText()));
		  }  //end of getAadlPropertyValue
		  
	  
	static StringTemplate getSlangFunctionCall(String functionID)
	  {
	  return text(singletonName+"_subprograms."+functionID);
	  }
	  

	  


	public static class identifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identifier"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:210:1: identifier : word= ID -> {%{$word.text}};
	public final UnparseBLESS3.identifier_return identifier() throws RecognitionException {
		UnparseBLESS3.identifier_return retval = new UnparseBLESS3.identifier_return();
		retval.start = input.LT(1);

		BAST word=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:211:2: (word= ID -> {%{$word.text}})
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:212:2: word= ID
			{
			word=(BAST)match(input,ID,FOLLOW_ID_in_identifier66); 
			// TEMPLATE REWRITE
			// 213:3: -> {%{$word.text}}
			{
				retval.st = new StringTemplate(templateLib,(word!=null?word.getText():null));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class unitName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:226:1: unitName : ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname);
	public final UnparseBLESS3.unitName_return unitName() throws RecognitionException {
		UnparseBLESS3.unitName_return retval = new UnparseBLESS3.unitName_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST longname=null;
		List<Object> list_longname=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:227:3: ( ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:228:3: ^( UNIT_NAME id= ID (longname+= ID )* )
			{
			match(input,UNIT_NAME,FOLLOW_UNIT_NAME_in_unitName94); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_unitName98); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:228:30: (longname+= ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:228:30: longname+= ID
					{
					longname=(BAST)match(input,ID,FOLLOW_ID_in_unitName102); 
					if (list_longname==null) list_longname=new ArrayList<Object>();
					list_longname.add(longname);
					}
					break;

				default :
					break loop1;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 229:5: -> unit_name(id=$id.textlongname=$longname)
			{
				retval.st = templateLib.getInstanceOf("unit_name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("longname", list_longname));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitName"


	public static class unitFormula_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitFormula"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:232:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom));
	public final UnparseBLESS3.unitFormula_return unitFormula() throws RecognitionException {
		UnparseBLESS3.unitFormula_return retval = new UnparseBLESS3.unitFormula_return();
		retval.start = input.LT(1);

		BAST top=null;
		BAST bottom=null;
		List<Object> list_top=null;
		List<Object> list_bottom=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:233:3: ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom))
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:234:3: ^( UNIT_FORMULA (top+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula142); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:234:22: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:234:22: top+= ID
							{
							top=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula146); 
							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 235:5: -> unit_formula(top=$top)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:3: ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula172); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:22: (top+= ID )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:22: top+= ID
							{
							top=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula176); 
							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula179); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:41: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:41: bottom+= ID
							{
							bottom=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula183); 
							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 238:5: -> unit_formula(top=$topbottom=$bottom)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top).put("bottom", list_bottom));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:240:3: ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula214); 
					match(input, Token.DOWN, null); 
					match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula216); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:240:32: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:240:32: bottom+= ID
							{
							bottom=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula220); 
							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 241:5: -> unit_formula(bottom=$bottom)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("bottom", list_bottom));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitFormula"


	public static class unitDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:244:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final UnparseBLESS3.unitDeclaration_return unitDeclaration() throws RecognitionException {
		UnparseBLESS3.unitDeclaration_return retval = new UnparseBLESS3.unitDeclaration_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:244:16: ( rootDeclaration | unitExtension )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ROOT_DECLARATION) ) {
				alt7=1;
			}
			else if ( (LA7_0==LITERAL_extension) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:245:3: rootDeclaration
					{
					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration249);
					rootDeclaration();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:245:21: unitExtension
					{
					pushFollow(FOLLOW_unitExtension_in_unitDeclaration253);
					unitExtension();
					state._fsp--;

					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitDeclaration"


	public static class rootDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "rootDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:248:1: rootDeclaration : ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors));
	public final UnparseBLESS3.rootDeclaration_return rootDeclaration() throws RecognitionException {
		UnparseBLESS3.rootDeclaration_return retval = new UnparseBLESS3.rootDeclaration_return();
		retval.start = input.LT(1);

		BAST base=null;
		BAST kindWords=null;
		List<Object> list_kindWords=null;
		List<Object> list_factors=null;
		TreeRuleReturnScope unit =null;
		TreeRuleReturnScope formula =null;
		RuleReturnScope factors = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:249:3: ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors))
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ROOT_DECLARATION) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==DOWN) ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2==LITERAL_base) ) {
						alt12=1;
					}
					else if ( (LA12_2==UNIT_FORMULA) ) {
						alt12=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:3: ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* )
					{
					match(input,ROOT_DECLARATION,FOLLOW_ROOT_DECLARATION_in_rootDeclaration270); 
					match(input, Token.DOWN, null); 
					base=(BAST)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration274); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration278); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:62: (kindWords+= ID )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ID) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:62: kindWords+= ID
							{
							kindWords=(BAST)match(input,ID,FOLLOW_ID_in_rootDeclaration282); 
							if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
							list_kindWords.add(kindWords);
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_unitName_in_rootDeclaration289);
					unit=unitName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:91: (factors+= unitFactor )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:91: factors+= unitFactor
							{
							pushFollow(FOLLOW_unitFactor_in_rootDeclaration293);
							factors=unitFactor();
							state._fsp--;

							if (list_factors==null) list_factors=new ArrayList<Object>();
							list_factors.add(factors.getTemplate());
							}
							break;

						default :
							break loop9;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 251:5: -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("base", (base!=null?base.getText():null)).put("kindWords", list_kindWords).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:3: ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* )
					{
					match(input,ROOT_DECLARATION,FOLLOW_ROOT_DECLARATION_in_rootDeclaration334); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration338);
					formula=unitFormula();
					state._fsp--;

					match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration342); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:64: (kindWords+= ID )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==ID) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:64: kindWords+= ID
							{
							kindWords=(BAST)match(input,ID,FOLLOW_ID_in_rootDeclaration346); 
							if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
							list_kindWords.add(kindWords);
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_unitName_in_rootDeclaration353);
					unit=unitName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:93: (factors+= unitFactor )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:93: factors+= unitFactor
							{
							pushFollow(FOLLOW_unitFactor_in_rootDeclaration357);
							factors=unitFactor();
							state._fsp--;

							if (list_factors==null) list_factors=new ArrayList<Object>();
							list_factors.add(factors.getTemplate());
							}
							break;

						default :
							break loop11;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 254:5: -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("formula", (formula!=null?((StringTemplate)formula.getTemplate()):null)).put("kindWords", list_kindWords).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rootDeclaration"


	public static class unitExtension_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitExtension"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:257:1: unitExtension : ^( LITERAL_extension root= ID (factors+= unitFactor )+ ) -> unit_extension(root=$root.textfactors=$factors);
	public final UnparseBLESS3.unitExtension_return unitExtension() throws RecognitionException {
		UnparseBLESS3.unitExtension_return retval = new UnparseBLESS3.unitExtension_return();
		retval.start = input.LT(1);

		BAST root=null;
		List<Object> list_factors=null;
		RuleReturnScope factors = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:3: ( ^( LITERAL_extension root= ID (factors+= unitFactor )+ ) -> unit_extension(root=$root.textfactors=$factors))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:259:3: ^( LITERAL_extension root= ID (factors+= unitFactor )+ )
			{
			match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension405); 
			match(input, Token.DOWN, null); 
			root=(BAST)match(input,ID,FOLLOW_ID_in_unitExtension409); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:259:39: (factors+= unitFactor )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:259:39: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension413);
					factors=unitFactor();
					state._fsp--;

					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTemplate());
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 260:5: -> unit_extension(root=$root.textfactors=$factors)
			{
				retval.st = templateLib.getInstanceOf("unit_extension",new STAttrMap().put("root", (root!=null?root.getText():null)).put("factors", list_factors));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitExtension"


	public static class unitFactor_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitFactor"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:264:1: unitFactor : ( ^( COMMA unit= unitName t= TIMES factor= NUMBER ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= NUMBER ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text));
	public final UnparseBLESS3.unitFactor_return unitFactor() throws RecognitionException {
		UnparseBLESS3.unitFactor_return retval = new UnparseBLESS3.unitFactor_return();
		retval.start = input.LT(1);

		BAST t=null;
		BAST factor=null;
		BAST d=null;
		TreeRuleReturnScope unit =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:264:11: ( ^( COMMA unit= unitName t= TIMES factor= NUMBER ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= NUMBER ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text))
			int alt14=2;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:265:3: ^( COMMA unit= unitName t= TIMES factor= NUMBER )
					{
					match(input,COMMA,FOLLOW_COMMA_in_unitFactor450); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitName_in_unitFactor454);
					unit=unitName();
					state._fsp--;

					t=(BAST)match(input,TIMES,FOLLOW_TIMES_in_unitFactor458); 
					factor=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor462); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 266:5: -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)
					{
						retval.st = templateLib.getInstanceOf("unit_factor",new STAttrMap().put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("op", (t!=null?t.getText():null)).put("factor", (factor!=null?factor.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:268:3: ^( COMMA unit= unitName d= DIVIDE factor= NUMBER )
					{
					match(input,COMMA,FOLLOW_COMMA_in_unitFactor497); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitName_in_unitFactor501);
					unit=unitName();
					state._fsp--;

					d=(BAST)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFactor505); 
					factor=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor509); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 269:5: -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text)
					{
						retval.st = templateLib.getInstanceOf("unit_factor",new STAttrMap().put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("op", (d!=null?d.getText():null)).put("factor", (factor!=null?factor.getText():null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitFactor"


	public static class typeLibrary_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:275:1: typeLibrary : (decs+= typeDeclaration )+ -> type_library(decs=$decs);
	public final UnparseBLESS3.typeLibrary_return typeLibrary() throws RecognitionException {
		UnparseBLESS3.typeLibrary_return retval = new UnparseBLESS3.typeLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:275:12: ( (decs+= typeDeclaration )+ -> type_library(decs=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:3: (decs+= typeDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:7: (decs+= typeDeclaration )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==LITERAL_type) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary556);
					decs=typeDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			// TEMPLATE REWRITE
			// 277:5: -> type_library(decs=$decs)
			{
				retval.st = templateLib.getInstanceOf("type_library",new STAttrMap().put("decs", list_decs));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeLibrary"


	public static class typeDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:280:1: typeDeclaration : ^( LITERAL_type id= ID ty= type ) -> type_declaration(id=$id.textty=$ty.st);
	public final UnparseBLESS3.typeDeclaration_return typeDeclaration() throws RecognitionException {
		UnparseBLESS3.typeDeclaration_return retval = new UnparseBLESS3.typeDeclaration_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:280:16: ( ^( LITERAL_type id= ID ty= type ) -> type_declaration(id=$id.textty=$ty.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:281:3: ^( LITERAL_type id= ID ty= type )
			{
			match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration584); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_typeDeclaration588); 
			pushFollow(FOLLOW_type_in_typeDeclaration592);
			ty=type();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 282:5: -> type_declaration(id=$id.textty=$ty.st)
			{
				retval.st = templateLib.getInstanceOf("type_declaration",new STAttrMap().put("id", (id!=null?id.getText():null)).put("ty", (ty!=null?((StringTemplate)ty.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:287:1: type : (et= enumerationType -> {$et.st}|nt= quantityType -> {$nt.st}|at= arrayType -> {$at.st}|rt= recordType -> {$rt.st}|bo= LITERAL_boolean -> boolean(|st= LITERAL_string -> string(|nu= LITERAL_null -> {%{$nu.text}});
	public final UnparseBLESS3.type_return type() throws RecognitionException {
		UnparseBLESS3.type_return retval = new UnparseBLESS3.type_return();
		retval.start = input.LT(1);

		BAST bo=null;
		BAST st=null;
		BAST nu=null;
		TreeRuleReturnScope et =null;
		TreeRuleReturnScope nt =null;
		TreeRuleReturnScope at =null;
		TreeRuleReturnScope rt =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:288:2: (et= enumerationType -> {$et.st}|nt= quantityType -> {$nt.st}|at= arrayType -> {$at.st}|rt= recordType -> {$rt.st}|bo= LITERAL_boolean -> boolean(|st= LITERAL_string -> string(|nu= LITERAL_null -> {%{$nu.text}})
			int alt16=7;
			switch ( input.LA(1) ) {
			case LITERAL_enumeration:
				{
				alt16=1;
				}
				break;
			case LITERAL_quantity:
				{
				alt16=2;
				}
				break;
			case LITERAL_array:
				{
				alt16=3;
				}
				break;
			case LITERAL_record:
			case LITERAL_union:
			case LITERAL_variant:
				{
				alt16=4;
				}
				break;
			case LITERAL_boolean:
				{
				alt16=5;
				}
				break;
			case LITERAL_string:
				{
				alt16=6;
				}
				break;
			case LITERAL_null:
				{
				alt16=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:289:2: et= enumerationType
					{
					pushFollow(FOLLOW_enumerationType_in_type631);
					et=enumerationType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 290:3: -> {$et.st}
					{
						retval.st = (et!=null?((StringTemplate)et.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:292:2: nt= quantityType
					{
					pushFollow(FOLLOW_quantityType_in_type644);
					nt=quantityType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 293:3: -> {$nt.st}
					{
						retval.st = (nt!=null?((StringTemplate)nt.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:295:2: at= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_type657);
					at=arrayType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 296:3: -> {$at.st}
					{
						retval.st = (at!=null?((StringTemplate)at.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:298:2: rt= recordType
					{
					pushFollow(FOLLOW_recordType_in_type670);
					rt=recordType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 299:3: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:301:2: bo= LITERAL_boolean
					{
					bo=(BAST)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type683); 
					// TEMPLATE REWRITE
					// 301:21: -> boolean(
					{
						retval.st = templateLib.getInstanceOf("boolean");
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:303:2: st= LITERAL_string
					{
					st=(BAST)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type699); 
					// TEMPLATE REWRITE
					// 303:20: -> string(
					{
						retval.st = templateLib.getInstanceOf("string");
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:305:2: nu= LITERAL_null
					{
					nu=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type715); 
					// TEMPLATE REWRITE
					// 305:18: -> {%{$nu.text}}
					{
						retval.st = new StringTemplate(templateLib,(nu!=null?nu.getText():null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			Dump.it("Unparse:type="+((BAST)retval.start).toStringTree()); reportError(re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class typeOrReference_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeOrReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:310:1: typeOrReference : (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}});
	public final UnparseBLESS3.typeOrReference_return typeOrReference() throws RecognitionException {
		UnparseBLESS3.typeOrReference_return retval = new UnparseBLESS3.typeOrReference_return();
		retval.start = input.LT(1);

		BAST ref=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:310:16: (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}})
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LITERAL_array||LA17_0==LITERAL_boolean||LA17_0==LITERAL_enumeration||LA17_0==LITERAL_null||LA17_0==LITERAL_quantity||LA17_0==LITERAL_record||LA17_0==LITERAL_string||LA17_0==LITERAL_union||LA17_0==LITERAL_variant) ) {
				alt17=1;
			}
			else if ( (LA17_0==ID) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:311:3: ty= type
					{
					pushFollow(FOLLOW_type_in_typeOrReference742);
					ty=type();
					state._fsp--;

					// TEMPLATE REWRITE
					// 312:5: -> {$ty.st}
					{
						retval.st = (ty!=null?((StringTemplate)ty.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:314:3: ref= ID
					{
					ref=(BAST)match(input,ID,FOLLOW_ID_in_typeOrReference762); 
					// TEMPLATE REWRITE
					// 315:5: -> {%{$ref.text}}
					{
						retval.st = new StringTemplate(templateLib,(ref!=null?ref.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeOrReference"


	public static class enumerationType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "enumerationType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:318:1: enumerationType : ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id);
	public final UnparseBLESS3.enumerationType_return enumerationType() throws RecognitionException {
		UnparseBLESS3.enumerationType_return retval = new UnparseBLESS3.enumerationType_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_id=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:319:3: ( ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:320:3: ^( LITERAL_enumeration (id+= ID )+ )
			{
			match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType789); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:320:27: (id+= ID )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==ID) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:320:27: id+= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationType793); 
					if (list_id==null) list_id=new ArrayList<Object>();
					list_id.add(id);
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 321:5: -> enumeration_type(id=$id)
			{
				retval.st = templateLib.getInstanceOf("enumeration_type",new STAttrMap().put("id", list_id));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationType"


	public static class quantityType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantityType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:324:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text));
	public final UnparseBLESS3.quantityType_return quantityType() throws RecognitionException {
		UnparseBLESS3.quantityType_return retval = new UnparseBLESS3.quantityType_return();
		retval.start = input.LT(1);

		BAST unit=null;
		BAST scalar=null;
		BAST whole=null;
		BAST representation=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope step =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:325:3: ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text))
			int alt19=18;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:326:3: ^( LITERAL_quantity unit= ID )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType828); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType832); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 327:5: -> quantity_type(unit=$unit.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:329:3: ^( LITERAL_quantity scalar= LITERAL_scalar )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType857); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType861); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 330:5: -> quantity_type(scalar=$scalar.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:332:3: ^( LITERAL_quantity whole= LITERAL_whole )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType886); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType890); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 333:5: -> quantity_type(whole=$whole.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:335:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType915); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType919); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType922); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType926);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType930);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 336:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:338:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType966); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType970); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType973); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType977);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType981);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 339:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:341:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1017); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1021); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1024); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1028);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1032);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 342:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:344:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1068); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1072); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1075); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1079);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1083);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1087); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1091);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 345:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:347:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1132); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1136); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1139); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1143);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1147);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1151); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1155);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 348:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:350:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1196); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1200); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1203); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1207);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1211);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1215); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1219);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 351:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:353:3: ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1260); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1264); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1267); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1271); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 354:5: -> quantity_type(unit=$unit.textrepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 11 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:356:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1303); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1307); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1310); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1314); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 357:5: -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 12 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:359:3: ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1346); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1350); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1353); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1357); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 360:5: -> quantity_type(whole=$whole.textrepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 13 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:362:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1389); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1393); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1396); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1400);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1404);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1408); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1412); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 363:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 14 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:365:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1454); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1458); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1461); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1465);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1469);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1473); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1477); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 366:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 15 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:368:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1519); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1523); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1526); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1530);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1534);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1538); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1542); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 369:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 16 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:371:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1584); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1588); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1591); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1595);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1599);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1603); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1607);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1611); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1615); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 372:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 17 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:374:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1662); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1666); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1669); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1673);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1677);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1681); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1685);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1689); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1693); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 375:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 18 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:377:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1740); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1744); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1747); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1751);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1755);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1759); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1763);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1767); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1771); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 378:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantityType"


	public static class arrayType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:382:1: arrayType : ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st);
	public final UnparseBLESS3.arrayType_return arrayType() throws RecognitionException {
		UnparseBLESS3.arrayType_return retval = new UnparseBLESS3.arrayType_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope arl =null;
		TreeRuleReturnScope t =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:383:2: ( ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:384:2: ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference )
			{
			match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType1827); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_arrayRangeList_in_arrayType1831);
			arl=arrayRangeList();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType1833); 
			pushFollow(FOLLOW_typeOrReference_in_arrayType1837);
			t=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 385:3: -> array_type(arl=$arl.stt=$t.st)
			{
				retval.st = templateLib.getInstanceOf("array_type",new STAttrMap().put("arl", (arl!=null?((StringTemplate)arl.getTemplate()):null)).put("t", (t!=null?((StringTemplate)t.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayType"


	public static class arrayRangeList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayRangeList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:389:1: arrayRangeList : (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges));
	public final UnparseBLESS3.arrayRangeList_return arrayRangeList() throws RecognitionException {
		UnparseBLESS3.arrayRangeList_return retval = new UnparseBLESS3.arrayRangeList_return();
		retval.start = input.LT(1);

		List<Object> list_ranges=null;
		TreeRuleReturnScope nr =null;
		RuleReturnScope ranges = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:390:2: (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges))
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DOTDOT||LA21_0==NUMBER||LA21_0==OCTOTHORPE||LA21_0==QCLREF) ) {
				alt21=1;
			}
			else if ( (LA21_0==COMMA) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:391:2: nr= arrayRange
					{
					pushFollow(FOLLOW_arrayRange_in_arrayRangeList1870);
					nr=arrayRange();
					state._fsp--;

					// TEMPLATE REWRITE
					// 392:4: -> {$nr.st}
					{
						retval.st = (nr!=null?((StringTemplate)nr.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:2: ^( COMMA (ranges+= arrayRange )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList1884); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:16: (ranges+= arrayRange )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==DOTDOT||LA20_0==NUMBER||LA20_0==OCTOTHORPE||LA20_0==QCLREF) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:16: ranges+= arrayRange
							{
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList1888);
							ranges=arrayRange();
							state._fsp--;

							if (list_ranges==null) list_ranges=new ArrayList<Object>();
							list_ranges.add(ranges.getTemplate());
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 395:4: -> array_range_list(r=$ranges)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_ranges));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayRangeList"


	public static class arrayRange_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:398:1: arrayRange : (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st));
	public final UnparseBLESS3.arrayRange_return arrayRange() throws RecognitionException {
		UnparseBLESS3.arrayRange_return retval = new UnparseBLESS3.arrayRange_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:399:3: (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st))
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NUMBER||LA22_0==OCTOTHORPE||LA22_0==QCLREF) ) {
				alt22=1;
			}
			else if ( (LA22_0==DOTDOT) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:400:3: n= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_arrayRange1919);
					n=aNumber();
					state._fsp--;

					// TEMPLATE REWRITE
					// 401:5: -> {$n.st}
					{
						retval.st = (n!=null?((StringTemplate)n.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:403:3: ^( DOTDOT lb= aNumber ub= aNumber )
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange1937); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_arrayRange1941);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_arrayRange1945);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 404:5: -> array_range(l=$lb.str=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("array_range",new STAttrMap().put("l", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("r", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayRange"


	public static class recordType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:407:1: recordType : ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_union (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf));
	public final UnparseBLESS3.recordType_return recordType() throws RecognitionException {
		UnparseBLESS3.recordType_return retval = new UnparseBLESS3.recordType_return();
		retval.start = input.LT(1);

		BAST r=null;
		List<Object> list_rf=null;
		RuleReturnScope rf = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:408:2: ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_union (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf))
			int alt26=3;
			switch ( input.LA(1) ) {
			case LITERAL_record:
				{
				alt26=1;
				}
				break;
			case LITERAL_variant:
				{
				alt26=2;
				}
				break;
			case LITERAL_union:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:409:2: ^(r= LITERAL_record (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_record,FOLLOW_LITERAL_record_in_recordType1982); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:409:23: (rf+= recordField )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==COLON) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:409:23: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType1986);
							rf=recordField();
							state._fsp--;

							if (list_rf==null) list_rf=new ArrayList<Object>();
							list_rf.add(rf.getTemplate());
							}
							break;

						default :
							if ( cnt23 >= 1 ) break loop23;
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 410:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:412:2: ^(r= LITERAL_variant (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_variant,FOLLOW_LITERAL_variant_in_recordType2013); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:412:24: (rf+= recordField )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==COLON) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:412:24: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2017);
							rf=recordField();
							state._fsp--;

							if (list_rf==null) list_rf=new ArrayList<Object>();
							list_rf.add(rf.getTemplate());
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 413:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:415:2: ^(r= LITERAL_union (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_union,FOLLOW_LITERAL_union_in_recordType2044); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:415:22: (rf+= recordField )+
					int cnt25=0;
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==COLON) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:415:22: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2048);
							rf=recordField();
							state._fsp--;

							if (list_rf==null) list_rf=new ArrayList<Object>();
							list_rf.add(rf.getTemplate());
							}
							break;

						default :
							if ( cnt25 >= 1 ) break loop25;
							EarlyExitException eee = new EarlyExitException(25, input);
							throw eee;
						}
						cnt25++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 416:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordType"


	public static class recordField_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:420:1: recordField : ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st);
	public final UnparseBLESS3.recordField_return recordField() throws RecognitionException {
		UnparseBLESS3.recordField_return retval = new UnparseBLESS3.recordField_return();
		retval.start = input.LT(1);

		BAST df=null;
		TreeRuleReturnScope ptd =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:421:2: ( ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:422:2: ^( COLON df= ID ptd= typeOrReference )
			{
			match(input,COLON,FOLLOW_COLON_in_recordField2082); 
			match(input, Token.DOWN, null); 
			df=(BAST)match(input,ID,FOLLOW_ID_in_recordField2086); 
			pushFollow(FOLLOW_typeOrReference_in_recordField2090);
			ptd=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 423:3: -> record_field(df=$df.textptd=$ptd.st)
			{
				retval.st = templateLib.getInstanceOf("record_field",new STAttrMap().put("df", (df!=null?df.getText():null)).put("ptd", (ptd!=null?((StringTemplate)ptd.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordField"


	public static class assertionLibrary_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertionLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:431:1: assertionLibrary : ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass));
	public final UnparseBLESS3.assertionLibrary_return assertionLibrary() throws RecognitionException {
		UnparseBLESS3.assertionLibrary_return retval = new UnparseBLESS3.assertionLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_ass=null;
		TreeRuleReturnScope ghosts =null;
		RuleReturnScope ass = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:432:2: ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass))
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==ASSERTION_ANNEX) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==DOWN) ) {
					int LA29_2 = input.LA(3);
					if ( (LA29_2==LITERAL_ghost) ) {
						alt29=1;
					}
					else if ( (LA29_2==ASSERTION||(LA29_2 >= ASSERTION_ENUMERATION && LA29_2 <= ASSERTION_FUNCTION)) ) {
						alt29=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:433:3: ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2127); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary2131);
					ghosts=ghostVariables();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:433:46: (ass+= namedAssertion )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==ASSERTION||(LA27_0 >= ASSERTION_ENUMERATION && LA27_0 <= ASSERTION_FUNCTION)) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:433:46: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2135);
							ass=namedAssertion();
							state._fsp--;

							if (list_ass==null) list_ass=new ArrayList<Object>();
							list_ass.add(ass.getTemplate());
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 434:4: -> annex_library_assertion(ghosts=$ghosts.stass=$ass)
					{
						retval.st = templateLib.getInstanceOf("annex_library_assertion",new STAttrMap().put("ghosts", (ghosts!=null?((StringTemplate)ghosts.getTemplate()):null)).put("ass", list_ass));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:436:3: ^( ASSERTION_ANNEX (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2162); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:436:24: (ass+= namedAssertion )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==ASSERTION||(LA28_0 >= ASSERTION_ENUMERATION && LA28_0 <= ASSERTION_FUNCTION)) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:436:24: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2166);
							ass=namedAssertion();
							state._fsp--;

							if (list_ass==null) list_ass=new ArrayList<Object>();
							list_ass.add(ass.getTemplate());
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 437:4: -> annex_library_assertion(ass=$ass)
					{
						retval.st = templateLib.getInstanceOf("annex_library_assertion",new STAttrMap().put("ass", list_ass));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionLibrary"


	public static class ghostVariables_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ghostVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:1: ghostVariables : ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv);
	public final UnparseBLESS3.ghostVariables_return ghostVariables() throws RecognitionException {
		UnparseBLESS3.ghostVariables_return retval = new UnparseBLESS3.ghostVariables_return();
		retval.start = input.LT(1);

		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:442:3: ( ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:443:3: ^( LITERAL_ghost (gv+= ghostVariable )+ )
			{
			match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables2202); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:443:22: (gv+= ghostVariable )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==LITERAL_def) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:443:22: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables2206);
					gv=ghostVariable();
					state._fsp--;

					if (list_gv==null) list_gv=new ArrayList<Object>();
					list_gv.add(gv.getTemplate());
					}
					break;

				default :
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 444:5: -> ghost_variables(gv=$gv)
			{
				retval.st = templateLib.getInstanceOf("ghost_variables",new STAttrMap().put("gv", list_gv));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ghostVariables"


	public static class ghostVariable_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ghostVariable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:447:1: ghostVariable : ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.ghostVariable_return ghostVariable() throws RecognitionException {
		UnparseBLESS3.ghostVariable_return retval = new UnparseBLESS3.ghostVariable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:448:3: ( ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:449:3: ^( LITERAL_def id= ID tod= typeOrReference )
			{
			match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable2239); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_ghostVariable2244); 
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable2248);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 450:5: -> ghost_variable(id=$id.texttod=$tod.st)
			{
				retval.st = templateLib.getInstanceOf("ghost_variable",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ghostVariable"


	public static class namedAssertion_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namedAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:453:1: namedAssertion : ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st));
	public final UnparseBLESS3.namedAssertion_return namedAssertion() throws RecognitionException {
		UnparseBLESS3.namedAssertion_return retval = new UnparseBLESS3.namedAssertion_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST assertionvariable=null;
		BAST enumerationTy=null;
		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope formals =null;
		TreeRuleReturnScope tod =null;
		TreeRuleReturnScope functionvalue =null;
		TreeRuleReturnScope enumeration =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:454:3: ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st))
			int alt31=5;
			switch ( input.LA(1) ) {
			case ASSERTION:
				{
				int LA31_1 = input.LA(2);
				if ( (LA31_1==DOWN) ) {
					int LA31_4 = input.LA(3);
					if ( (LA31_4==LABEL) ) {
						int LA31_6 = input.LA(4);
						if ( (LA31_6==DOWN) ) {
							int LA31_8 = input.LA(5);
							if ( (LA31_8==ID) ) {
								int LA31_10 = input.LA(6);
								if ( (LA31_10==UP) ) {
									int LA31_12 = input.LA(7);
									if ( (LA31_12==PARAMETERS) ) {
										alt31=2;
									}
									else if ( (LA31_12==LITERAL_all||LA31_12==LITERAL_exists||LA31_12==LITERAL_iff||LA31_12==LITERAL_implies||LA31_12==LITERAL_numberof||LA31_12==LITERAL_product||LA31_12==LITERAL_sum) ) {
										alt31=1;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 31, 12, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 31, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 31, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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

				else {
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
				break;
			case ASSERTION_FUNCTION:
				{
				int LA31_2 = input.LA(2);
				if ( (LA31_2==DOWN) ) {
					int LA31_5 = input.LA(3);
					if ( (LA31_5==LABEL) ) {
						int LA31_7 = input.LA(4);
						if ( (LA31_7==DOWN) ) {
							int LA31_9 = input.LA(5);
							if ( (LA31_9==ID) ) {
								int LA31_11 = input.LA(6);
								if ( (LA31_11==UP) ) {
									int LA31_13 = input.LA(7);
									if ( (LA31_13==LITERAL_returns) ) {
										alt31=3;
									}
									else if ( (LA31_13==PARAMETERS) ) {
										alt31=4;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 31, 13, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 31, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 31, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 31, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_ENUMERATION:
				{
				alt31=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:455:3: ^( ASSERTION ^( LABEL id= ID ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2285); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2289); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2293); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2299);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 456:5: -> named_assertion(id=$id.textpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:458:3: ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2329); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2333); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2337); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2343); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2347);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2353);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 459:5: -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:461:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2388); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2392); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2396); 
					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2402); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2406);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2412);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 462:5: -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:464:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2447); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2451); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2455); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2461); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2465);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2471); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2475);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2481);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 465:5: -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:467:3: ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration )
					{
					match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2521); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2525); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2529); 
					match(input, Token.UP, null); 

					match(input,TILDE,FOLLOW_TILDE_in_namedAssertion2535); 
					match(input, Token.DOWN, null); 
					assertionvariable=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2539); 
					enumerationTy=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2543); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion2549);
					enumeration=assertionEnumeration();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 468:5: -> named_assertion_enum(id=$id.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion_enum",new STAttrMap().put("id", (id!=null?id.getText():null)).put("enumerationTy", (enumerationTy!=null?enumerationTy.getText():null)).put("enumeration", (enumeration!=null?((StringTemplate)enumeration.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedAssertion"


	public static class variableList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:471:1: variableList : (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter));
	public final UnparseBLESS3.variableList_return variableList() throws RecognitionException {
		UnparseBLESS3.variableList_return retval = new UnparseBLESS3.variableList_return();
		retval.start = input.LT(1);

		List<Object> list_parameter=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope parameter = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:472:3: (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter))
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==TILDE) ) {
				alt33=1;
			}
			else if ( (LA33_0==COMMA) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:473:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_variableList2593);
					v=variable();
					state._fsp--;

					// TEMPLATE REWRITE
					// 474:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:476:3: ^( COMMA (parameter+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_variableList2611); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:476:21: (parameter+= variable )+
					int cnt32=0;
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==TILDE) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:476:21: parameter+= variable
							{
							pushFollow(FOLLOW_variable_in_variableList2615);
							parameter=variable();
							state._fsp--;

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTemplate());
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							EarlyExitException eee = new EarlyExitException(32, input);
							throw eee;
						}
						cnt32++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 477:5: -> variable_list(parameter=$parameter)
					{
						retval.st = templateLib.getInstanceOf("variable_list",new STAttrMap().put("parameter", list_parameter));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableList"


	public static class variable_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:480:1: variable : ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.variable_return variable() throws RecognitionException {
		UnparseBLESS3.variable_return retval = new UnparseBLESS3.variable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:481:3: ( ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:482:3: ^( TILDE id= ID tod= typeOrReference )
			{
			match(input,TILDE,FOLLOW_TILDE_in_variable2649); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_variable2653); 
			pushFollow(FOLLOW_typeOrReference_in_variable2657);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 483:5: -> variable(id=$id.texttod=$tod.st)
			{
				retval.st = templateLib.getInstanceOf("variable",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class assertionFunctionValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertionFunctionValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:486:1: assertionFunctionValue : (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st});
	public final UnparseBLESS3.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		UnparseBLESS3.assertionFunctionValue_return retval = new UnparseBLESS3.assertionFunctionValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope caf =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:487:3: (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st})
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==CONDITIONAL_ASSERTION_FUNCTION) ) {
				alt34=1;
			}
			else if ( (LA34_0==LITERAL_all||LA34_0==LITERAL_exists||LA34_0==LITERAL_iff||LA34_0==LITERAL_implies||LA34_0==LITERAL_numberof||LA34_0==LITERAL_product||LA34_0==LITERAL_sum) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:488:3: caf= conditionalAssertionFunction
					{
					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2694);
					caf=conditionalAssertionFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 489:5: -> {$caf.st}
					{
						retval.st = (caf!=null?((StringTemplate)caf.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:490:4: exp= expression
					{
					pushFollow(FOLLOW_expression_in_assertionFunctionValue2710);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 491:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionFunctionValue"


	public static class conditionalAssertionFunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionalAssertionFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:495:1: conditionalAssertionFunction : ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp);
	public final UnparseBLESS3.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		UnparseBLESS3.conditionalAssertionFunction_return retval = new UnparseBLESS3.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:496:3: ( ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:3: ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ )
			{
			match(input,CONDITIONAL_ASSERTION_FUNCTION,FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2739); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:40: (cvp+= conditionValuePair )+
			int cnt35=0;
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==CVP) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:40: cvp+= conditionValuePair
					{
					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction2743);
					cvp=conditionValuePair();
					state._fsp--;

					if (list_cvp==null) list_cvp=new ArrayList<Object>();
					list_cvp.add(cvp.getTemplate());
					}
					break;

				default :
					if ( cnt35 >= 1 ) break loop35;
					EarlyExitException eee = new EarlyExitException(35, input);
					throw eee;
				}
				cnt35++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 498:5: -> conditional_assertion_function(cvp=$cvp)
			{
				retval.st = templateLib.getInstanceOf("conditional_assertion_function",new STAttrMap().put("cvp", list_cvp));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalAssertionFunction"


	public static class conditionValuePair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionValuePair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:501:1: conditionValuePair : ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st);
	public final UnparseBLESS3.conditionValuePair_return conditionValuePair() throws RecognitionException {
		UnparseBLESS3.conditionValuePair_return retval = new UnparseBLESS3.conditionValuePair_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:502:3: ( ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:503:3: ^( CVP pred= predicate exp= expression )
			{
			match(input,CVP,FOLLOW_CVP_in_conditionValuePair2777); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_conditionValuePair2781);
			pred=predicate();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionValuePair2785);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 504:5: -> condition_value_pair(pp=$pred.stpe=$exp.st)
			{
				retval.st = templateLib.getInstanceOf("condition_value_pair",new STAttrMap().put("pp", (pred!=null?((StringTemplate)pred.getTemplate()):null)).put("pe", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionValuePair"


	public static class assertionEnumeration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertionEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:507:1: assertionEnumeration : ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW ep= enumerationPair ) -> assertion_enumeration_pairs(ep=$ep.st)| ^( PLUS_ARROW ^( COMMA (pair+= enumerationPair )+ ) ) -> assertion_enumeration_pairs(ep=$pair));
	public final UnparseBLESS3.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		UnparseBLESS3.assertionEnumeration_return retval = new UnparseBLESS3.assertionEnumeration_return();
		retval.start = input.LT(1);

		List<Object> list_pair=null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope ep =null;
		RuleReturnScope pair = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:508:3: ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW ep= enumerationPair ) -> assertion_enumeration_pairs(ep=$ep.st)| ^( PLUS_ARROW ^( COMMA (pair+= enumerationPair )+ ) ) -> assertion_enumeration_pairs(ep=$pair))
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==PLUS_ARROW) ) {
				int LA37_1 = input.LA(2);
				if ( (LA37_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case COMMA:
						{
						alt37=3;
						}
						break;
					case INVOKE:
						{
						alt37=1;
						}
						break;
					case ARROW:
						{
						alt37=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 37, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 37, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:509:3: ^( PLUS_ARROW inv= invocation )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2824); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_invocation_in_assertionEnumeration2828);
					inv=invocation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 510:5: -> assertion_enumeration_predicate_invocation(pi=$inv.st)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_predicate_invocation",new STAttrMap().put("pi", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:512:3: ^( PLUS_ARROW ep= enumerationPair )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2853); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration2857);
					ep=enumerationPair();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 513:5: -> assertion_enumeration_pairs(ep=$ep.st)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_pairs",new STAttrMap().put("ep", (ep!=null?((StringTemplate)ep.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:515:3: ^( PLUS_ARROW ^( COMMA (pair+= enumerationPair )+ ) )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2883); 
					match(input, Token.DOWN, null); 
					match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration2887); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:515:30: (pair+= enumerationPair )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==ARROW) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:515:30: pair+= enumerationPair
							{
							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration2891);
							pair=enumerationPair();
							state._fsp--;

							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTemplate());
							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 516:5: -> assertion_enumeration_pairs(ep=$pair)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_pairs",new STAttrMap().put("ep", list_pair));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionEnumeration"


	public static class enumerationPair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "enumerationPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:519:1: enumerationPair : ^( ARROW id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st);
	public final UnparseBLESS3.enumerationPair_return enumerationPair() throws RecognitionException {
		UnparseBLESS3.enumerationPair_return retval = new UnparseBLESS3.enumerationPair_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:520:3: ( ^( ARROW id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:521:3: ^( ARROW id= ID pred= predicate )
			{
			match(input,ARROW,FOLLOW_ARROW_in_enumerationPair2928); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationPair2932); 
			pushFollow(FOLLOW_predicate_in_enumerationPair2936);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 522:5: -> enumeration_pair(i=$id.textpe=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("enumeration_pair",new STAttrMap().put("i", (id!=null?id.getText():null)).put("pe", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationPair"


	public static class invocation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "invocation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:525:1: invocation : ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st));
	public final UnparseBLESS3.invocation_return invocation() throws RecognitionException {
		UnparseBLESS3.invocation_return retval = new UnparseBLESS3.invocation_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_params=null;
		TreeRuleReturnScope exp =null;
		RuleReturnScope params = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:526:3: ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st))
			int alt39=3;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==INVOKE) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==DOWN) ) {
					int LA39_2 = input.LA(3);
					if ( (LA39_2==ID) ) {
						switch ( input.LA(4) ) {
						case UP:
							{
							alt39=1;
							}
							break;
						case COLON:
							{
							alt39=2;
							}
							break;
						case LITERAL_all:
						case LITERAL_exists:
						case LITERAL_iff:
						case LITERAL_implies:
						case LITERAL_numberof:
						case LITERAL_product:
						case LITERAL_sum:
							{
							alt39=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 39, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:527:3: ^( INVOKE id= ID )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation2975); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation2979); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 528:5: -> invocation(i=$id.text)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:530:3: ^( INVOKE id= ID (params+= actualParameter )+ )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3004); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3008); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:530:25: (params+= actualParameter )+
					int cnt38=0;
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==COLON) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:530:25: params+= actualParameter
							{
							pushFollow(FOLLOW_actualParameter_in_invocation3012);
							params=actualParameter();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt38 >= 1 ) break loop38;
							EarlyExitException eee = new EarlyExitException(38, input);
							throw eee;
						}
						cnt38++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 531:5: -> invocation(i=$id.textp=$params)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)).put("p", list_params));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:533:3: ^( INVOKE id= ID exp= expression )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3043); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3047); 
					pushFollow(FOLLOW_expression_in_invocation3051);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 534:5: -> invocation(i=$id.textp=$exp.st)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)).put("p", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invocation"


	public static class actualParameter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "actualParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:537:1: actualParameter : ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st);
	public final UnparseBLESS3.actualParameter_return actualParameter() throws RecognitionException {
		UnparseBLESS3.actualParameter_return retval = new UnparseBLESS3.actualParameter_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:538:3: ( ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:539:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_actualParameter3088); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_actualParameter3092); 
			pushFollow(FOLLOW_expression_in_actualParameter3096);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 540:5: -> actual_parameter(formal=$formal.textactual=$actual.st)
			{
				retval.st = templateLib.getInstanceOf("actual_parameter",new STAttrMap().put("formal", (formal!=null?formal.getText():null)).put("actual", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualParameter"


	public static class namelessAssertion_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namelessAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:543:1: namelessAssertion : ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st);
	public final UnparseBLESS3.namelessAssertion_return namelessAssertion() throws RecognitionException {
		UnparseBLESS3.namelessAssertion_return retval = new UnparseBLESS3.namelessAssertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:544:3: ( ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:545:3: ^( ASSERTION pred= predicate )
			{
			match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3135); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_namelessAssertion3139);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 546:5: -> nameless_assertion(a=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("nameless_assertion",new STAttrMap().put("a", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessAssertion"


	public static class namelessFunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namelessFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:549:1: namelessFunction : ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st);
	public final UnparseBLESS3.namelessFunction_return namelessFunction() throws RecognitionException {
		UnparseBLESS3.namelessFunction_return retval = new UnparseBLESS3.namelessFunction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tod =null;
		TreeRuleReturnScope functionvalue =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:550:3: ( ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:551:3: ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
			{
			match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3173); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction3177); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeOrReference_in_namelessFunction3181);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction3187);
			functionvalue=assertionFunctionValue();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 552:5: -> nameless_function(tod=$tod.sta=$functionvalue.st)
			{
				retval.st = templateLib.getInstanceOf("nameless_function",new STAttrMap().put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("a", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessFunction"


	public static class namelessEnumeration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namelessEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:555:1: namelessEnumeration : ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st);
	public final UnparseBLESS3.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		UnparseBLESS3.namelessEnumeration_return retval = new UnparseBLESS3.namelessEnumeration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope inv =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:556:3: ( ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:557:2: ^( ASSERTION_ENUMERATION inv= invocation )
			{
			match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3225); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_invocation_in_namelessEnumeration3229);
			inv=invocation();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 558:4: -> nameless_enumeration(inv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("nameless_enumeration",new STAttrMap().put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessEnumeration"


	public static class assertion_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:1: assertion : (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st});
	public final UnparseBLESS3.assertion_return assertion() throws RecognitionException {
		UnparseBLESS3.assertion_return retval = new UnparseBLESS3.assertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope na =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:10: (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st})
			int alt40=4;
			switch ( input.LA(1) ) {
			case ASSERTION:
				{
				int LA40_1 = input.LA(2);
				if ( (LA40_1==DOWN) ) {
					int LA40_4 = input.LA(3);
					if ( (LA40_4==LABEL) ) {
						alt40=1;
					}
					else if ( (LA40_4==LITERAL_all||LA40_4==LITERAL_exists||LA40_4==LITERAL_iff||LA40_4==LITERAL_implies||LA40_4==LITERAL_numberof||LA40_4==LITERAL_product||LA40_4==LITERAL_sum) ) {
						alt40=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_FUNCTION:
				{
				int LA40_2 = input.LA(2);
				if ( (LA40_2==DOWN) ) {
					int LA40_5 = input.LA(3);
					if ( (LA40_5==LABEL) ) {
						alt40=1;
					}
					else if ( (LA40_5==LITERAL_returns) ) {
						alt40=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_ENUMERATION:
				{
				int LA40_3 = input.LA(2);
				if ( (LA40_3==DOWN) ) {
					int LA40_6 = input.LA(3);
					if ( (LA40_6==LABEL) ) {
						alt40=1;
					}
					else if ( (LA40_6==INVOKE) ) {
						alt40=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:562:3: na= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertion3258);
					na=namedAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 563:5: -> {$na.st}
					{
						retval.st = (na!=null?((StringTemplate)na.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:564:5: a= namelessAssertion
					{
					pushFollow(FOLLOW_namelessAssertion_in_assertion3274);
					a=namelessAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 565:5: -> {$a.st}
					{
						retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:566:5: f= namelessFunction
					{
					pushFollow(FOLLOW_namelessFunction_in_assertion3290);
					f=namelessFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 567:5: -> {$f.st}
					{
						retval.st = (f!=null?((StringTemplate)f.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:568:5: e= namelessEnumeration
					{
					pushFollow(FOLLOW_namelessEnumeration_in_assertion3306);
					e=namelessEnumeration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 569:5: -> {$e.st}
					{
						retval.st = (e!=null?((StringTemplate)e.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertion"


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:574:1: expression : (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st));
	public final UnparseBLESS3.expression_return expression() throws RecognitionException {
		UnparseBLESS3.expression_return retval = new UnparseBLESS3.expression_return();
		retval.start = input.LT(1);

		BAST iff=null;
		BAST imp=null;
		TreeRuleReturnScope all =null;
		TreeRuleReturnScope exists =null;
		TreeRuleReturnScope sum =null;
		TreeRuleReturnScope product =null;
		TreeRuleReturnScope numberof =null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:575:2: (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st))
			int alt41=7;
			switch ( input.LA(1) ) {
			case LITERAL_all:
				{
				alt41=1;
				}
				break;
			case LITERAL_exists:
				{
				alt41=2;
				}
				break;
			case LITERAL_sum:
				{
				alt41=3;
				}
				break;
			case LITERAL_product:
				{
				alt41=4;
				}
				break;
			case LITERAL_numberof:
				{
				alt41=5;
				}
				break;
			case LITERAL_iff:
				{
				alt41=6;
				}
				break;
			case LITERAL_implies:
				{
				alt41=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:576:3: all= universalQuantification
					{
					pushFollow(FOLLOW_universalQuantification_in_expression3338);
					all=universalQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 577:5: -> {$all.st}
					{
						retval.st = (all!=null?((StringTemplate)all.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:578:5: exists= existentialQuantification
					{
					pushFollow(FOLLOW_existentialQuantification_in_expression3354);
					exists=existentialQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 579:5: -> {$exists.st}
					{
						retval.st = (exists!=null?((StringTemplate)exists.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:580:5: sum= sumQuantification
					{
					pushFollow(FOLLOW_sumQuantification_in_expression3370);
					sum=sumQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 581:5: -> {$sum.st}
					{
						retval.st = (sum!=null?((StringTemplate)sum.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:582:5: product= productQuantification
					{
					pushFollow(FOLLOW_productQuantification_in_expression3386);
					product=productQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 583:5: -> {$product.st}
					{
						retval.st = (product!=null?((StringTemplate)product.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:584:5: numberof= countingQuantification
					{
					pushFollow(FOLLOW_countingQuantification_in_expression3402);
					numberof=countingQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 585:5: -> {$numberof.st}
					{
						retval.st = (numberof!=null?((StringTemplate)numberof.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:586:5: ^(iff= LITERAL_iff l= disjunction r= disjunction )
					{
					iff=(BAST)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression3420); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3424);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3428);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 587:5: -> relation(r=$iff.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (iff!=null?iff.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:588:5: ^(imp= LITERAL_implies l= disjunction r= disjunction )
					{
					imp=(BAST)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression3463); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3467);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3471);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 589:5: -> relation(r=$imp.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (imp!=null?imp.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class universalQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "universalQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:592:1: universalQuantification : ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st);
	public final UnparseBLESS3.universalQuantification_return universalQuantification() throws RecognitionException {
		UnparseBLESS3.universalQuantification_return retval = new UnparseBLESS3.universalQuantification_return();
		retval.start = input.LT(1);

		BAST a=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:593:3: ( ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:594:3: ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			a=(BAST)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification3515); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_universalQuantification3519);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_universalQuantification3523);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification3527); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_universalQuantification3531);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 595:5: -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("universal_quantification",new STAttrMap().put("a", (a!=null?a.getText():null)).put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("p", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalQuantification"


	public static class in_which_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "in_which"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:598:1: in_which : ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\");
	public final UnparseBLESS3.in_which_return in_which() throws RecognitionException {
		UnparseBLESS3.in_which_return retval = new UnparseBLESS3.in_which_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope b =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:599:3: ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\")
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==LITERAL_in) ) {
				alt42=1;
			}
			else if ( (LA42_0==LITERAL_which) ) {
				alt42=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:600:3: ^( LITERAL_in r= range )
					{
					match(input,LITERAL_in,FOLLOW_LITERAL_in_in_in_which3580); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_range_in_in_which3584);
					r=range();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 601:5: -> template(r=$r.st) \"in <r>\"
					{
						retval.st = new StringTemplate(templateLib, "in <r>",new STAttrMap().put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:603:3: ^( LITERAL_which b= predicate )
					{
					match(input,LITERAL_which,FOLLOW_LITERAL_which_in_in_which3611); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_in_which3615);
					b=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 604:5: -> template(b=$b.st) \"which <b>\"
					{
						retval.st = new StringTemplate(templateLib, "which <b>",new STAttrMap().put("b", (b!=null?((StringTemplate)b.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in_which"


	public static class existentialQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "existentialQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:607:1: existentialQuantification : ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st);
	public final UnparseBLESS3.existentialQuantification_return existentialQuantification() throws RecognitionException {
		UnparseBLESS3.existentialQuantification_return retval = new UnparseBLESS3.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST e=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:608:3: ( ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:609:3: ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			e=(BAST)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification3651); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_existentialQuantification3655);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_existentialQuantification3659);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_existentialQuantification3663); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_existentialQuantification3667);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 610:5: -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("existential_quantification",new STAttrMap().put("e", (e!=null?e.getText():null)).put("lv2", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d2", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("p2", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialQuantification"


	public static class sumQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sumQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:613:1: sumQuantification : ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.sumQuantification_return sumQuantification() throws RecognitionException {
		UnparseBLESS3.sumQuantification_return retval = new UnparseBLESS3.sumQuantification_return();
		retval.start = input.LT(1);

		BAST s=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:614:3: ( ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:615:3: ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			s=(BAST)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification3718); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_sumQuantification3722);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_sumQuantification3726);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification3730); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sumQuantification3734);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 616:5: -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("s", (s!=null?s.getText():null)).put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("pe", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sumQuantification"


	public static class productQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "productQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:619:1: productQuantification : ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.productQuantification_return productQuantification() throws RecognitionException {
		UnparseBLESS3.productQuantification_return retval = new UnparseBLESS3.productQuantification_return();
		retval.start = input.LT(1);

		BAST p=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:620:3: ( ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:621:3: ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			p=(BAST)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification3786); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_productQuantification3790);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_productQuantification3794);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification3798); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_productQuantification3802);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 622:6: -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("product",new STAttrMap().put("p", (p!=null?p.getText():null)).put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("pe", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "productQuantification"


	public static class countingQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "countingQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:625:1: countingQuantification : ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.countingQuantification_return countingQuantification() throws RecognitionException {
		UnparseBLESS3.countingQuantification_return retval = new UnparseBLESS3.countingQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:626:3: ( ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:627:3: ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) )
			{
			match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification3853); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_countingQuantification3857);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_countingQuantification3861);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification3865); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_countingQuantification3869);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 628:5: -> numberof(lv=$lv.std=$iw.stpe=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("numberof",new STAttrMap().put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("pe", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "countingQuantification"


	public static class logicVariables_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "logicVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:631:1: logicVariables : ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable );
	public final UnparseBLESS3.logicVariables_return logicVariables() throws RecognitionException {
		UnparseBLESS3.logicVariables_return retval = new UnparseBLESS3.logicVariables_return();
		retval.start = input.LT(1);

		List<Object> list_lv=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope lv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:632:3: ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable )
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==COMMA) ) {
				alt44=1;
			}
			else if ( (LA44_0==TILDE) ) {
				alt44=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}

			switch (alt44) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:3: ^( COMMA (lv+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_logicVariables3916); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:14: (lv+= variable )+
					int cnt43=0;
					loop43:
					while (true) {
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==TILDE) ) {
							alt43=1;
						}

						switch (alt43) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:14: lv+= variable
							{
							pushFollow(FOLLOW_variable_in_logicVariables3920);
							lv=variable();
							state._fsp--;

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv.getTemplate());
							}
							break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							EarlyExitException eee = new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 634:5: -> variable_list(parameter=$lv)
					{
						retval.st = templateLib.getInstanceOf("variable_list",new STAttrMap().put("parameter", list_lv));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:636:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_logicVariables3946);
					v=variable();
					state._fsp--;

					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicVariables"


	public static class disjunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "disjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:639:1: disjunction : ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction );
	public final UnparseBLESS3.disjunction_return disjunction() throws RecognitionException {
		UnparseBLESS3.disjunction_return retval = new UnparseBLESS3.disjunction_return();
		retval.start = input.LT(1);

		List<Object> list_c=null;
		TreeRuleReturnScope con =null;
		RuleReturnScope c = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:640:3: ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction )
			int alt48=4;
			switch ( input.LA(1) ) {
			case LITERAL_or:
				{
				alt48=1;
				}
				break;
			case LITERAL_else:
				{
				alt48=2;
				}
				break;
			case LITERAL_xor:
				{
				alt48=3;
				}
				break;
			case AADL_STRING_LITERAL:
			case AL:
			case AM:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EQ:
			case EXP:
			case GT:
			case ID:
			case INVOKE:
			case LITERAL_abs:
			case LITERAL_and:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_then:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case LT:
			case MINUS:
			case NEQ:
			case OLD_NEQ:
			case PLUS:
			case PLUS_EQUALS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt48=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:641:3: ^( LITERAL_or (c+= conjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction3967); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:641:18: (c+= conjunction )+
					int cnt45=0;
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==AADL_STRING_LITERAL||(LA45_0 >= AL && LA45_0 <= AM)||LA45_0==AT_SIGN||LA45_0==CARET||LA45_0==DIVIDE||LA45_0==EQ||LA45_0==EXP||LA45_0==GT||LA45_0==ID||LA45_0==INVOKE||LA45_0==LITERAL_abs||LA45_0==LITERAL_and||LA45_0==LITERAL_div||LA45_0==LITERAL_false||LA45_0==LITERAL_mod||(LA45_0 >= LITERAL_not && LA45_0 <= LITERAL_now)||LA45_0==LITERAL_null||LA45_0==LITERAL_rem||LA45_0==LITERAL_round||LA45_0==LITERAL_then||LA45_0==LITERAL_timeout||LA45_0==LITERAL_tops||(LA45_0 >= LITERAL_true && LA45_0 <= LITERAL_truncate)||(LA45_0 >= LPAREN && LA45_0 <= LT)||LA45_0==MINUS||LA45_0==NEQ||LA45_0==OLD_NEQ||LA45_0==PLUS||LA45_0==PLUS_EQUALS||(LA45_0 >= QUANTITY && LA45_0 <= QUESTION)||LA45_0==RECORD_TERM||LA45_0==TICK||LA45_0==TIMES||LA45_0==UNARY_MINUS) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:641:18: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction3971);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt45 >= 1 ) break loop45;
							EarlyExitException eee = new EarlyExitException(45, input);
							throw eee;
						}
						cnt45++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 642:5: -> disjunction(bopt=$c)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_c));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:3: ^( LITERAL_else (c+= conjunction )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction3997); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:20: (c+= conjunction )+
					int cnt46=0;
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==AADL_STRING_LITERAL||(LA46_0 >= AL && LA46_0 <= AM)||LA46_0==AT_SIGN||LA46_0==CARET||LA46_0==DIVIDE||LA46_0==EQ||LA46_0==EXP||LA46_0==GT||LA46_0==ID||LA46_0==INVOKE||LA46_0==LITERAL_abs||LA46_0==LITERAL_and||LA46_0==LITERAL_div||LA46_0==LITERAL_false||LA46_0==LITERAL_mod||(LA46_0 >= LITERAL_not && LA46_0 <= LITERAL_now)||LA46_0==LITERAL_null||LA46_0==LITERAL_rem||LA46_0==LITERAL_round||LA46_0==LITERAL_then||LA46_0==LITERAL_timeout||LA46_0==LITERAL_tops||(LA46_0 >= LITERAL_true && LA46_0 <= LITERAL_truncate)||(LA46_0 >= LPAREN && LA46_0 <= LT)||LA46_0==MINUS||LA46_0==NEQ||LA46_0==OLD_NEQ||LA46_0==PLUS||LA46_0==PLUS_EQUALS||(LA46_0 >= QUANTITY && LA46_0 <= QUESTION)||LA46_0==RECORD_TERM||LA46_0==TICK||LA46_0==TIMES||LA46_0==UNARY_MINUS) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:20: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4001);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt46 >= 1 ) break loop46;
							EarlyExitException eee = new EarlyExitException(46, input);
							throw eee;
						}
						cnt46++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 645:5: -> cor(t=$c)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_c));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:647:3: ^( LITERAL_xor (c+= conjunction )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction4027); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:647:19: (c+= conjunction )+
					int cnt47=0;
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==AADL_STRING_LITERAL||(LA47_0 >= AL && LA47_0 <= AM)||LA47_0==AT_SIGN||LA47_0==CARET||LA47_0==DIVIDE||LA47_0==EQ||LA47_0==EXP||LA47_0==GT||LA47_0==ID||LA47_0==INVOKE||LA47_0==LITERAL_abs||LA47_0==LITERAL_and||LA47_0==LITERAL_div||LA47_0==LITERAL_false||LA47_0==LITERAL_mod||(LA47_0 >= LITERAL_not && LA47_0 <= LITERAL_now)||LA47_0==LITERAL_null||LA47_0==LITERAL_rem||LA47_0==LITERAL_round||LA47_0==LITERAL_then||LA47_0==LITERAL_timeout||LA47_0==LITERAL_tops||(LA47_0 >= LITERAL_true && LA47_0 <= LITERAL_truncate)||(LA47_0 >= LPAREN && LA47_0 <= LT)||LA47_0==MINUS||LA47_0==NEQ||LA47_0==OLD_NEQ||LA47_0==PLUS||LA47_0==PLUS_EQUALS||(LA47_0 >= QUANTITY && LA47_0 <= QUESTION)||LA47_0==RECORD_TERM||LA47_0==TICK||LA47_0==TIMES||LA47_0==UNARY_MINUS) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:647:19: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4031);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt47 >= 1 ) break loop47;
							EarlyExitException eee = new EarlyExitException(47, input);
							throw eee;
						}
						cnt47++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 648:5: -> xor(terms=$c)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_c));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:650:3: con= conjunction
					{
					pushFollow(FOLLOW_conjunction_in_disjunction4057);
					con=conjunction();
					state._fsp--;

					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "disjunction"


	public static class conjunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:653:1: conjunction : ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st});
	public final UnparseBLESS3.conjunction_return conjunction() throws RecognitionException {
		UnparseBLESS3.conjunction_return retval = new UnparseBLESS3.conjunction_return();
		retval.start = input.LT(1);

		List<Object> list_r=null;
		TreeRuleReturnScope rel =null;
		RuleReturnScope r = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:654:3: ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st})
			int alt51=3;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt51=1;
				}
				break;
			case LITERAL_then:
				{
				alt51=2;
				}
				break;
			case AADL_STRING_LITERAL:
			case AL:
			case AM:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EQ:
			case EXP:
			case GT:
			case ID:
			case INVOKE:
			case LITERAL_abs:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case LT:
			case MINUS:
			case NEQ:
			case OLD_NEQ:
			case PLUS:
			case PLUS_EQUALS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt51=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:655:3: ^( LITERAL_and (r+= relation )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction4076); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:655:19: (r+= relation )+
					int cnt49=0;
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==AADL_STRING_LITERAL||(LA49_0 >= AL && LA49_0 <= AM)||LA49_0==AT_SIGN||LA49_0==CARET||LA49_0==DIVIDE||LA49_0==EQ||LA49_0==EXP||LA49_0==GT||LA49_0==ID||LA49_0==INVOKE||LA49_0==LITERAL_abs||LA49_0==LITERAL_div||LA49_0==LITERAL_false||LA49_0==LITERAL_mod||(LA49_0 >= LITERAL_not && LA49_0 <= LITERAL_now)||LA49_0==LITERAL_null||LA49_0==LITERAL_rem||LA49_0==LITERAL_round||LA49_0==LITERAL_timeout||LA49_0==LITERAL_tops||(LA49_0 >= LITERAL_true && LA49_0 <= LITERAL_truncate)||(LA49_0 >= LPAREN && LA49_0 <= LT)||LA49_0==MINUS||LA49_0==NEQ||LA49_0==OLD_NEQ||LA49_0==PLUS||LA49_0==PLUS_EQUALS||(LA49_0 >= QUANTITY && LA49_0 <= QUESTION)||LA49_0==RECORD_TERM||LA49_0==TICK||LA49_0==TIMES||LA49_0==UNARY_MINUS) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:655:19: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4080);
							r=relation();
							state._fsp--;

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTemplate());
							}
							break;

						default :
							if ( cnt49 >= 1 ) break loop49;
							EarlyExitException eee = new EarlyExitException(49, input);
							throw eee;
						}
						cnt49++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 656:5: -> conjunction(bopt=$r)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_r));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:658:3: ^( LITERAL_then (r+= relation )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction4106); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:658:20: (r+= relation )+
					int cnt50=0;
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==AADL_STRING_LITERAL||(LA50_0 >= AL && LA50_0 <= AM)||LA50_0==AT_SIGN||LA50_0==CARET||LA50_0==DIVIDE||LA50_0==EQ||LA50_0==EXP||LA50_0==GT||LA50_0==ID||LA50_0==INVOKE||LA50_0==LITERAL_abs||LA50_0==LITERAL_div||LA50_0==LITERAL_false||LA50_0==LITERAL_mod||(LA50_0 >= LITERAL_not && LA50_0 <= LITERAL_now)||LA50_0==LITERAL_null||LA50_0==LITERAL_rem||LA50_0==LITERAL_round||LA50_0==LITERAL_timeout||LA50_0==LITERAL_tops||(LA50_0 >= LITERAL_true && LA50_0 <= LITERAL_truncate)||(LA50_0 >= LPAREN && LA50_0 <= LT)||LA50_0==MINUS||LA50_0==NEQ||LA50_0==OLD_NEQ||LA50_0==PLUS||LA50_0==PLUS_EQUALS||(LA50_0 >= QUANTITY && LA50_0 <= QUESTION)||LA50_0==RECORD_TERM||LA50_0==TICK||LA50_0==TIMES||LA50_0==UNARY_MINUS) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:658:20: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4110);
							r=relation();
							state._fsp--;

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTemplate());
							}
							break;

						default :
							if ( cnt50 >= 1 ) break loop50;
							EarlyExitException eee = new EarlyExitException(50, input);
							throw eee;
						}
						cnt50++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 659:5: -> cand(t=$r)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_r));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:661:3: rel= relation
					{
					pushFollow(FOLLOW_relation_in_conjunction4136);
					rel=relation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 662:5: -> {$rel.st}
					{
						retval.st = (rel!=null?((StringTemplate)rel.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conjunction"


	public static class relation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:2: relation : ( ^( EQ lhs= addSub rhs= addSub ) -> equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"| ^( AM lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"| ^( AL lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"| ^( GT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"| ^( PLUS_EQUALS lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"| ^( NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( OLD_NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)|as= addSub -> {$as.st});
	public final UnparseBLESS3.relation_return relation() throws RecognitionException {
		UnparseBLESS3.relation_return retval = new UnparseBLESS3.relation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lhs =null;
		TreeRuleReturnScope rhs =null;
		TreeRuleReturnScope as =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:666:3: ( ^( EQ lhs= addSub rhs= addSub ) -> equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"| ^( AM lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"| ^( AL lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"| ^( GT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"| ^( PLUS_EQUALS lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"| ^( NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( OLD_NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)|as= addSub -> {$as.st})
			int alt52=9;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt52=1;
				}
				break;
			case LT:
				{
				alt52=2;
				}
				break;
			case AM:
				{
				alt52=3;
				}
				break;
			case AL:
				{
				alt52=4;
				}
				break;
			case GT:
				{
				alt52=5;
				}
				break;
			case PLUS_EQUALS:
				{
				alt52=6;
				}
				break;
			case NEQ:
				{
				alt52=7;
				}
				break;
			case OLD_NEQ:
				{
				alt52=8;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EXP:
			case ID:
			case INVOKE:
			case LITERAL_abs:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case MINUS:
			case PLUS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt52=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:667:3: ^( EQ lhs= addSub rhs= addSub )
					{
					match(input,EQ,FOLLOW_EQ_in_relation4163); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4168);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4172);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 668:5: -> equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:670:3: ^( LT lhs= addSub rhs= addSub )
					{
					match(input,LT,FOLLOW_LT_in_relation4202); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4207);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4211);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 671:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\< <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:673:3: ^( AM lhs= addSub rhs= addSub )
					{
					match(input,AM,FOLLOW_AM_in_relation4243); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4248);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4252);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 674:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\<= <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:676:3: ^( AL lhs= addSub rhs= addSub )
					{
					match(input,AL,FOLLOW_AL_in_relation4284); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4289);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4293);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 677:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\>= <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:679:3: ^( GT lhs= addSub rhs= addSub )
					{
					match(input,GT,FOLLOW_GT_in_relation4325); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4330);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4334);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 680:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\> <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:682:3: ^( PLUS_EQUALS lhs= addSub rhs= addSub )
					{
					match(input,PLUS_EQUALS,FOLLOW_PLUS_EQUALS_in_relation4366); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4371);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4375);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 683:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> += <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:685:3: ^( NEQ lhs= addSub rhs= addSub )
					{
					match(input,NEQ,FOLLOW_NEQ_in_relation4407); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4412);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4416);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 686:5: -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("not_equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:688:3: ^( OLD_NEQ lhs= addSub rhs= addSub )
					{
					match(input,OLD_NEQ,FOLLOW_OLD_NEQ_in_relation4446); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4451);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4455);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 689:5: -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("not_equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:691:3: as= addSub
					{
					pushFollow(FOLLOW_addSub_in_relation4484);
					as=addSub();
					state._fsp--;

					// TEMPLATE REWRITE
					// 692:5: -> {$as.st}
					{
						retval.st = (as!=null?((StringTemplate)as.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class range_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "range"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:1: range : ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st));
	public final UnparseBLESS3.range_return range() throws RecognitionException {
		UnparseBLESS3.range_return retval = new UnparseBLESS3.range_return();
		retval.start = input.LT(1);

		BAST dd=null;
		BAST cd=null;
		BAST dc=null;
		BAST cc=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:696:3: ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st))
			int alt53=4;
			switch ( input.LA(1) ) {
			case DOTDOT:
				{
				alt53=1;
				}
				break;
			case COMMADOT:
				{
				alt53=2;
				}
				break;
			case DOTCOMMA:
				{
				alt53=3;
				}
				break;
			case COMMACOMMA:
				{
				alt53=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:697:3: ^(dd= DOTDOT lb= subexpression ub= subexpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_range4511); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4515);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4519);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 698:5: -> range(rs=$dd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dd!=null?dd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:700:4: ^(cd= COMMADOT lb= subexpression ub= subexpression )
					{
					cd=(BAST)match(input,COMMADOT,FOLLOW_COMMADOT_in_range4557); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4561);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4565);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 701:5: -> range(rs=$cd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cd!=null?cd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:703:4: ^(dc= DOTCOMMA lb= subexpression ub= subexpression )
					{
					dc=(BAST)match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_range4603); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4607);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4611);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 704:5: -> range(rs=$dc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dc!=null?dc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:706:4: ^(cc= COMMACOMMA lb= subexpression ub= subexpression )
					{
					cc=(BAST)match(input,COMMACOMMA,FOLLOW_COMMACOMMA_in_range4649); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4653);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4657);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 707:5: -> range(rs=$cc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cc!=null?cc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class addSub_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "addSub"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:710:1: addSub : ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st});
	public final UnparseBLESS3.addSub_return addSub() throws RecognitionException {
		UnparseBLESS3.addSub_return retval = new UnparseBLESS3.addSub_return();
		retval.start = input.LT(1);

		List<Object> list_md=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope m =null;
		RuleReturnScope md = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:711:3: ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st})
			int alt55=3;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt55=1;
				}
				break;
			case MINUS:
				{
				alt55=2;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EXP:
			case ID:
			case INVOKE:
			case LITERAL_abs:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt55=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:712:3: ^( PLUS (md+= multDiv )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_addSub4700); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:712:13: (md+= multDiv )+
					int cnt54=0;
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==AADL_STRING_LITERAL||LA54_0==AT_SIGN||LA54_0==CARET||LA54_0==DIVIDE||LA54_0==EXP||LA54_0==ID||LA54_0==INVOKE||LA54_0==LITERAL_abs||LA54_0==LITERAL_div||LA54_0==LITERAL_false||LA54_0==LITERAL_mod||(LA54_0 >= LITERAL_not && LA54_0 <= LITERAL_now)||LA54_0==LITERAL_null||LA54_0==LITERAL_rem||LA54_0==LITERAL_round||LA54_0==LITERAL_timeout||LA54_0==LITERAL_tops||(LA54_0 >= LITERAL_true && LA54_0 <= LITERAL_truncate)||LA54_0==LPAREN||(LA54_0 >= QUANTITY && LA54_0 <= QUESTION)||LA54_0==RECORD_TERM||LA54_0==TICK||LA54_0==TIMES||LA54_0==UNARY_MINUS) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:712:13: md+= multDiv
							{
							pushFollow(FOLLOW_multDiv_in_addSub4704);
							md=multDiv();
							state._fsp--;

							if (list_md==null) list_md=new ArrayList<Object>();
							list_md.add(md.getTemplate());
							}
							break;

						default :
							if ( cnt54 >= 1 ) break loop54;
							EarlyExitException eee = new EarlyExitException(54, input);
							throw eee;
						}
						cnt54++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 713:5: -> add(terms=$md)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_md));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:715:3: ^( MINUS l= multDiv r= multDiv )
					{
					match(input,MINUS,FOLLOW_MINUS_in_addSub4730); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_multDiv_in_addSub4734);
					l=multDiv();
					state._fsp--;

					pushFollow(FOLLOW_multDiv_in_addSub4738);
					r=multDiv();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 716:5: -> template(l=$l.str=$r.st) \"<l> - <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> - <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:718:3: m= multDiv
					{
					pushFollow(FOLLOW_multDiv_in_addSub4770);
					m=multDiv();
					state._fsp--;

					// TEMPLATE REWRITE
					// 719:5: -> {$m.st}
					{
						retval.st = (m!=null?((StringTemplate)m.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addSub"


	public static class multDiv_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "multDiv"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:722:1: multDiv : ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st});
	public final UnparseBLESS3.multDiv_return multDiv() throws RecognitionException {
		UnparseBLESS3.multDiv_return retval = new UnparseBLESS3.multDiv_return();
		retval.start = input.LT(1);

		List<Object> list_exp=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;
		RuleReturnScope exp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:723:3: ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st})
			int alt57=6;
			switch ( input.LA(1) ) {
			case TIMES:
				{
				alt57=1;
				}
				break;
			case DIVIDE:
				{
				alt57=2;
				}
				break;
			case LITERAL_div:
				{
				alt57=3;
				}
				break;
			case LITERAL_mod:
				{
				alt57=4;
				}
				break;
			case LITERAL_rem:
				{
				alt57=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case EXP:
			case ID:
			case INVOKE:
			case LITERAL_abs:
			case LITERAL_false:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case UNARY_MINUS:
				{
				alt57=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:724:3: ^( TIMES (exp+= exponentiation )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multDiv4801); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:724:15: (exp+= exponentiation )+
					int cnt56=0;
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==AADL_STRING_LITERAL||LA56_0==AT_SIGN||LA56_0==CARET||LA56_0==EXP||LA56_0==ID||LA56_0==INVOKE||LA56_0==LITERAL_abs||LA56_0==LITERAL_false||(LA56_0 >= LITERAL_not && LA56_0 <= LITERAL_now)||LA56_0==LITERAL_null||LA56_0==LITERAL_round||LA56_0==LITERAL_timeout||LA56_0==LITERAL_tops||(LA56_0 >= LITERAL_true && LA56_0 <= LITERAL_truncate)||LA56_0==LPAREN||(LA56_0 >= QUANTITY && LA56_0 <= QUESTION)||LA56_0==RECORD_TERM||LA56_0==TICK||LA56_0==UNARY_MINUS) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:724:15: exp+= exponentiation
							{
							pushFollow(FOLLOW_exponentiation_in_multDiv4805);
							exp=exponentiation();
							state._fsp--;

							if (list_exp==null) list_exp=new ArrayList<Object>();
							list_exp.add(exp.getTemplate());
							}
							break;

						default :
							if ( cnt56 >= 1 ) break loop56;
							EarlyExitException eee = new EarlyExitException(56, input);
							throw eee;
						}
						cnt56++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 725:5: -> multiply(terms=$exp)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_exp));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:727:3: ^( DIVIDE l= exponentiation r= exponentiation )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multDiv4831); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4835);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4839);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 728:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:730:3: ^( LITERAL_div l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_div,FOLLOW_LITERAL_div_in_multDiv4871); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4875);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4879);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 731:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:733:3: ^( LITERAL_mod l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_multDiv4911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4915);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4919);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 734:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:736:3: ^( LITERAL_rem l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_multDiv4951); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4955);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4959);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 737:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:739:3: e= exponentiation
					{
					pushFollow(FOLLOW_exponentiation_in_multDiv4991);
					e=exponentiation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 740:5: -> {$e.st}
					{
						retval.st = (e!=null?((StringTemplate)e.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multDiv"


	public static class exponentiation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exponentiation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:744:1: exponentiation : ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st});
	public final UnparseBLESS3.exponentiation_return exponentiation() throws RecognitionException {
		UnparseBLESS3.exponentiation_return retval = new UnparseBLESS3.exponentiation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope s =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:745:3: ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st})
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==EXP) ) {
				alt58=1;
			}
			else if ( (LA58_0==AADL_STRING_LITERAL||LA58_0==AT_SIGN||LA58_0==CARET||LA58_0==ID||LA58_0==INVOKE||LA58_0==LITERAL_abs||LA58_0==LITERAL_false||(LA58_0 >= LITERAL_not && LA58_0 <= LITERAL_now)||LA58_0==LITERAL_null||LA58_0==LITERAL_round||LA58_0==LITERAL_timeout||LA58_0==LITERAL_tops||(LA58_0 >= LITERAL_true && LA58_0 <= LITERAL_truncate)||LA58_0==LPAREN||(LA58_0 >= QUANTITY && LA58_0 <= QUESTION)||LA58_0==RECORD_TERM||LA58_0==TICK||LA58_0==UNARY_MINUS) ) {
				alt58=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}

			switch (alt58) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:746:3: ^( EXP l= subexpression r= subexpression )
					{
					match(input,EXP,FOLLOW_EXP_in_exponentiation5023); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_exponentiation5027);
					l=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_exponentiation5031);
					r=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 747:5: -> template(l=$l.str=$r.st) \"<l> ** <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> ** <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:749:3: s= subexpression
					{
					pushFollow(FOLLOW_subexpression_in_exponentiation5063);
					s=subexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 750:5: -> {$s.st}
					{
						retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exponentiation"


	public static class subexpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:753:1: subexpression : ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st});
	public final UnparseBLESS3.subexpression_return subexpression() throws RecognitionException {
		UnparseBLESS3.subexpression_return retval = new UnparseBLESS3.subexpression_return();
		retval.start = input.LT(1);

		BAST n=null;
		BAST m=null;
		BAST s=null;
		BAST t=null;
		BAST r=null;
		TreeRuleReturnScope te =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:754:3: ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st})
			int alt59=6;
			switch ( input.LA(1) ) {
			case LITERAL_not:
				{
				alt59=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt59=2;
				}
				break;
			case LITERAL_abs:
				{
				alt59=3;
				}
				break;
			case LITERAL_truncate:
				{
				alt59=4;
				}
				break;
			case LITERAL_round:
				{
				alt59=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case ID:
			case INVOKE:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
				{
				alt59=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:755:3: ^(n= LITERAL_not te= timedExpression )
					{
					n=(BAST)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5094); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5098);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 756:5: -> unary(sym=$n.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (n!=null?n.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:758:3: ^(m= UNARY_MINUS te= timedExpression )
					{
					m=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_subexpression5130); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5134);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 759:5: -> unary(sym=$m.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (m!=null?m.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:761:3: ^(s= LITERAL_abs te= timedExpression )
					{
					s=(BAST)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5166); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5170);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 762:5: -> unary(sym=$s.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (s!=null?s.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:764:3: ^(t= LITERAL_truncate te= timedExpression )
					{
					t=(BAST)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5202); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5206);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 765:5: -> unary(sym=$t.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (t!=null?t.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:767:3: ^(r= LITERAL_round te= timedExpression )
					{
					r=(BAST)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5238); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5242);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 768:5: -> unary(sym=$r.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (r!=null?r.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:770:3: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5272);
					te=timedExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 771:5: -> {$te.st}
					{
						retval.st = (te!=null?((StringTemplate)te.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subexpression"


	public static class timedExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "timedExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:774:1: timedExpression : ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st});
	public final UnparseBLESS3.timedExpression_return timedExpression() throws RecognitionException {
		UnparseBLESS3.timedExpression_return retval = new UnparseBLESS3.timedExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:775:3: ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st})
			int alt60=4;
			switch ( input.LA(1) ) {
			case TICK:
				{
				int LA60_1 = input.LA(2);
				if ( (LA60_1==DOWN) ) {
					int LA60_5 = input.LA(3);
					if ( (LA60_5==ID) ) {
						int LA60_6 = input.LA(4);
						if ( (LA60_6==LITERAL_count||LA60_6==LITERAL_fresh||LA60_6==LITERAL_updated) ) {
							alt60=4;
						}
						else if ( ((LA60_6 >= DOWN && LA60_6 <= UP)) ) {
							alt60=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 60, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA60_5==AADL_STRING_LITERAL||LA60_5==INVOKE||LA60_5==LITERAL_false||LA60_5==LITERAL_now||LA60_5==LITERAL_null||LA60_5==LITERAL_timeout||LA60_5==LITERAL_tops||LA60_5==LITERAL_true||LA60_5==LPAREN||(LA60_5 >= QUANTITY && LA60_5 <= QUESTION)||LA60_5==RECORD_TERM||LA60_5==TICK) ) {
						alt60=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 60, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT_SIGN:
				{
				alt60=2;
				}
				break;
			case CARET:
				{
				alt60=3;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case INVOKE:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
				{
				alt60=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:776:3: ^( TICK ts= timedSubject )
					{
					match(input,TICK,FOLLOW_TICK_in_timedExpression5302); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5306);
					ts=timedSubject();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 777:5: -> tick(tp=$ts.st)
					{
						retval.st = templateLib.getInstanceOf("tick",new STAttrMap().put("tp", (ts!=null?((StringTemplate)ts.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:779:3: ^( AT_SIGN ts= timedSubject se= subexpression )
					{
					match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5331); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5335);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_timedExpression5339);
					se=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 780:5: -> at(p=$ts.stt=$se.st)
					{
						retval.st = templateLib.getInstanceOf("at",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("t", (se!=null?((StringTemplate)se.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:782:3: ^( CARET ts= timedSubject ps= periodShift )
					{
					match(input,CARET,FOLLOW_CARET_in_timedExpression5369); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5373);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_timedExpression5377);
					ps=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 783:5: -> caret(p=$ts.stcv=$ps.st)
					{
						retval.st = templateLib.getInstanceOf("caret",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("cv", (ps!=null?((StringTemplate)ps.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:785:3: ts= timedSubject
					{
					pushFollow(FOLLOW_timedSubject_in_timedExpression5407);
					ts=timedSubject();
					state._fsp--;

					// TEMPLATE REWRITE
					// 786:5: -> {$ts.st}
					{
						retval.st = (ts!=null?((StringTemplate)ts.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedExpression"


	public static class timedSubject_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "timedSubject"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:789:1: timedSubject : (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st});
	public final UnparseBLESS3.timedSubject_return timedSubject() throws RecognitionException {
		UnparseBLESS3.timedSubject_return retval = new UnparseBLESS3.timedSubject_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ce =null;
		TreeRuleReturnScope ps =null;
		TreeRuleReturnScope rt =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:790:3: (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st})
			int alt61=5;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				int LA61_1 = input.LA(2);
				if ( (LA61_1==DOWN) ) {
					int LA61_5 = input.LA(3);
					if ( (LA61_5==QQ) ) {
						alt61=1;
					}
					else if ( (LA61_5==LITERAL_all||LA61_5==LITERAL_case||LA61_5==LITERAL_exists||LA61_5==LITERAL_iff||LA61_5==LITERAL_implies||LA61_5==LITERAL_numberof||LA61_5==LITERAL_product||LA61_5==LITERAL_sum) ) {
						alt61=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 61, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 61, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RECORD_TERM:
				{
				alt61=3;
				}
				break;
			case INVOKE:
				{
				alt61=4;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case QUANTITY:
			case QUESTION:
			case TICK:
				{
				alt61=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:791:3: ce= conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5434);
					ce=conditionalExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 792:4: -> {$ce.st}
					{
						retval.st = (ce!=null?((StringTemplate)ce.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:793:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5449);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 794:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:795:5: rt= recordTerm
					{
					pushFollow(FOLLOW_recordTerm_in_timedSubject5466);
					rt=recordTerm();
					state._fsp--;

					// TEMPLATE REWRITE
					// 796:5: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:797:5: inv= invocation
					{
					pushFollow(FOLLOW_invocation_in_timedSubject5482);
					inv=invocation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 798:5: -> {$inv.st}
					{
						retval.st = (inv!=null?((StringTemplate)inv.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:799:5: v= value
					{
					pushFollow(FOLLOW_value_in_timedSubject5500);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 800:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedSubject"


	public static class periodShift_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "periodShift"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:803:1: periodShift : ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st));
	public final UnparseBLESS3.periodShift_return periodShift() throws RecognitionException {
		UnparseBLESS3.periodShift_return retval = new UnparseBLESS3.periodShift_return();
		retval.start = input.LT(1);

		BAST um=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:804:3: ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st))
			int alt62=4;
			switch ( input.LA(1) ) {
			case UNARY_MINUS:
				{
				int LA62_1 = input.LA(2);
				if ( (LA62_1==DOWN) ) {
					int LA62_4 = input.LA(3);
					if ( (LA62_4==LPAREN) ) {
						alt62=2;
					}
					else if ( (LA62_4==AADL_STRING_LITERAL||LA62_4==ID||LA62_4==LITERAL_false||LA62_4==LITERAL_now||LA62_4==LITERAL_null||LA62_4==LITERAL_timeout||LA62_4==LITERAL_tops||LA62_4==LITERAL_true||(LA62_4 >= QUANTITY && LA62_4 <= QUESTION)||LA62_4==TICK) ) {
						alt62=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 62, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case QUANTITY:
			case QUESTION:
			case TICK:
				{
				alt62=3;
				}
				break;
			case LPAREN:
				{
				alt62=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:805:3: ^(um= UNARY_MINUS v= value )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5529); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_value_in_periodShift5533);
					v=value();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 806:5: -> unary(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:808:3: ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5565); 
					match(input, Token.DOWN, null); 
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5569); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5573);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5575); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 809:5: -> unary_paren(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary_paren",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:811:3: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift5607);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 812:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:814:3: ^( LPAREN ie= indexExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5625); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5629);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5631); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 815:5: -> parentheses(be=$ie.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ie!=null?((StringTemplate)ie.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "periodShift"


	public static class indexExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "indexExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:818:1: indexExpression : ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps));
	public final UnparseBLESS3.indexExpression_return indexExpression() throws RecognitionException {
		UnparseBLESS3.indexExpression_return retval = new UnparseBLESS3.indexExpression_return();
		retval.start = input.LT(1);

		BAST m=null;
		List<Object> list_ps=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		RuleReturnScope ps = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:819:3: ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps))
			int alt65=6;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				alt65=1;
				}
				break;
			case LITERAL_div:
				{
				alt65=2;
				}
				break;
			case LITERAL_mod:
				{
				alt65=3;
				}
				break;
			case LITERAL_rem:
				{
				alt65=4;
				}
				break;
			case PLUS:
				{
				alt65=5;
				}
				break;
			case TIMES:
				{
				alt65=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:820:3: ^(m= MINUS l= periodShift r= periodShift )
					{
					m=(BAST)match(input,MINUS,FOLLOW_MINUS_in_indexExpression5667); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5671);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5675);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 821:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:823:3: ^(m= LITERAL_div l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression5709); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5713);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5717);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 824:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:826:3: ^(m= LITERAL_mod l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression5751); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5755);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5759);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 827:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:829:3: ^(m= LITERAL_rem l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression5793); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5797);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5801);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 830:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:832:3: ^( PLUS (ps+= periodShift )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_indexExpression5833); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:832:13: (ps+= periodShift )+
					int cnt63=0;
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0==AADL_STRING_LITERAL||LA63_0==ID||LA63_0==LITERAL_false||LA63_0==LITERAL_now||LA63_0==LITERAL_null||LA63_0==LITERAL_timeout||LA63_0==LITERAL_tops||LA63_0==LITERAL_true||LA63_0==LPAREN||(LA63_0 >= QUANTITY && LA63_0 <= QUESTION)||LA63_0==TICK||LA63_0==UNARY_MINUS) ) {
							alt63=1;
						}

						switch (alt63) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:832:13: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression5837);
							ps=periodShift();
							state._fsp--;

							if (list_ps==null) list_ps=new ArrayList<Object>();
							list_ps.add(ps.getTemplate());
							}
							break;

						default :
							if ( cnt63 >= 1 ) break loop63;
							EarlyExitException eee = new EarlyExitException(63, input);
							throw eee;
						}
						cnt63++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 833:5: -> add(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:835:3: ^( TIMES (ps+= periodShift )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_indexExpression5863); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:835:14: (ps+= periodShift )+
					int cnt64=0;
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==AADL_STRING_LITERAL||LA64_0==ID||LA64_0==LITERAL_false||LA64_0==LITERAL_now||LA64_0==LITERAL_null||LA64_0==LITERAL_timeout||LA64_0==LITERAL_tops||LA64_0==LITERAL_true||LA64_0==LPAREN||(LA64_0 >= QUANTITY && LA64_0 <= QUESTION)||LA64_0==TICK||LA64_0==UNARY_MINUS) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:835:14: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression5867);
							ps=periodShift();
							state._fsp--;

							if (list_ps==null) list_ps=new ArrayList<Object>();
							list_ps.add(ps.getTemplate());
							}
							break;

						default :
							if ( cnt64 >= 1 ) break loop64;
							EarlyExitException eee = new EarlyExitException(64, input);
							throw eee;
						}
						cnt64++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 836:5: -> multiply(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_ps));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexExpression"


	public static class conditionalExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:839:1: conditionalExpression : ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st);
	public final UnparseBLESS3.conditionalExpression_return conditionalExpression() throws RecognitionException {
		UnparseBLESS3.conditionalExpression_return retval = new UnparseBLESS3.conditionalExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope f =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:840:3: ( ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:841:3: ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN )
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression5902); 
			match(input, Token.DOWN, null); 
			match(input,QQ,FOLLOW_QQ_in_conditionalExpression5906); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_conditionalExpression5910);
			pred=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression5914);
			t=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression5918);
			f=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression5923); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 842:5: -> conditional_expression(be=$pred.stt=$t.stf=$f.st)
			{
				retval.st = templateLib.getInstanceOf("conditional_expression",new STAttrMap().put("be", (pred!=null?((StringTemplate)pred.getTemplate()):null)).put("t", (t!=null?((StringTemplate)t.getTemplate()):null)).put("f", (f!=null?((StringTemplate)f.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class parenthesizedSubexpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "parenthesizedSubexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:845:1: parenthesizedSubexpression : ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st));
	public final UnparseBLESS3.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		UnparseBLESS3.parenthesizedSubexpression_return retval = new UnparseBLESS3.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope ce =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:846:3: ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st))
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==LPAREN) ) {
				int LA66_1 = input.LA(2);
				if ( (LA66_1==DOWN) ) {
					int LA66_2 = input.LA(3);
					if ( (LA66_2==LITERAL_all||LA66_2==LITERAL_exists||LA66_2==LITERAL_iff||LA66_2==LITERAL_implies||LA66_2==LITERAL_numberof||LA66_2==LITERAL_product||LA66_2==LITERAL_sum) ) {
						alt66=1;
					}
					else if ( (LA66_2==LITERAL_case) ) {
						alt66=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 66, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}

			switch (alt66) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:847:3: ^( LPAREN ex= expression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression5969); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5973);
					ex=expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression5975); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 848:5: -> parentheses(be=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:853:3: ^( LPAREN ce= caseExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6005); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6009);
					ce=caseExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6011); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 854:5: -> parentheses(be=$ce.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ce!=null?((StringTemplate)ce.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parenthesizedSubexpression"


	public static class caseExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:857:1: caseExpression : ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc);
	public final UnparseBLESS3.caseExpression_return caseExpression() throws RecognitionException {
		UnparseBLESS3.caseExpression_return retval = new UnparseBLESS3.caseExpression_return();
		retval.start = input.LT(1);

		List<Object> list_cc=null;
		RuleReturnScope cc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:858:3: ( ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:859:3: ^( LITERAL_case (cc+= caseChoice )+ )
			{
			match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6045); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:859:21: (cc+= caseChoice )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==IMP) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:859:21: cc+= caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6049);
					cc=caseChoice();
					state._fsp--;

					if (list_cc==null) list_cc=new ArrayList<Object>();
					list_cc.add(cc.getTemplate());
					}
					break;

				default :
					if ( cnt67 >= 1 ) break loop67;
					EarlyExitException eee = new EarlyExitException(67, input);
					throw eee;
				}
				cnt67++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 860:5: -> case_expression(cc=$cc)
			{
				retval.st = templateLib.getInstanceOf("case_expression",new STAttrMap().put("cc", list_cc));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseExpression"


	public static class caseChoice_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseChoice"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:863:1: caseChoice : ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st);
	public final UnparseBLESS3.caseChoice_return caseChoice() throws RecognitionException {
		UnparseBLESS3.caseChoice_return retval = new UnparseBLESS3.caseChoice_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope bool =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:864:3: ( ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:865:3: ^( IMP bool= expression exp= expression )
			{
			match(input,IMP,FOLLOW_IMP_in_caseChoice6082); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_caseChoice6086);
			bool=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_caseChoice6090);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 866:5: -> case_choice(be=$bool.stexp=$exp.st)
			{
				retval.st = templateLib.getInstanceOf("case_choice",new STAttrMap().put("be", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("exp", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseChoice"


	public static class recordTerm_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:869:1: recordTerm : ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv);
	public final UnparseBLESS3.recordTerm_return recordTerm() throws RecognitionException {
		UnparseBLESS3.recordTerm_return retval = new UnparseBLESS3.recordTerm_return();
		retval.start = input.LT(1);

		BAST typeid=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:870:3: ( ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:871:3: ^( RECORD_TERM typeid= ID (prv+= recordValue )+ )
			{
			match(input,RECORD_TERM,FOLLOW_RECORD_TERM_in_recordTerm6131); 
			match(input, Token.DOWN, null); 
			typeid=(BAST)match(input,ID,FOLLOW_ID_in_recordTerm6135); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:871:31: (prv+= recordValue )+
			int cnt68=0;
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==ARROW) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:871:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6139);
					prv=recordValue();
					state._fsp--;

					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTemplate());
					}
					break;

				default :
					if ( cnt68 >= 1 ) break loop68;
					EarlyExitException eee = new EarlyExitException(68, input);
					throw eee;
				}
				cnt68++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 872:5: -> record_term(typeid=$typeid.textprv=$prv)
			{
				retval.st = templateLib.getInstanceOf("record_term",new STAttrMap().put("typeid", (typeid!=null?typeid.getText():null)).put("prv", list_prv));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordTerm"


	public static class recordValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:875:1: recordValue : ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st);
	public final UnparseBLESS3.recordValue_return recordValue() throws RecognitionException {
		UnparseBLESS3.recordValue_return retval = new UnparseBLESS3.recordValue_return();
		retval.start = input.LT(1);

		BAST field=null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:876:3: ( ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:3: ^( ARROW field= ID v= value )
			{
			match(input,ARROW,FOLLOW_ARROW_in_recordValue6178); 
			match(input, Token.DOWN, null); 
			field=(BAST)match(input,ID,FOLLOW_ID_in_recordValue6182); 
			pushFollow(FOLLOW_value_in_recordValue6186);
			v=value();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 878:5: -> record_value(id=$field.textv=$v.st)
			{
				retval.st = templateLib.getInstanceOf("record_value",new STAttrMap().put("id", (field!=null?field.getText():null)).put("v", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordValue"


	public static class predicate_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "predicate"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:881:1: predicate : expression ;
	public final UnparseBLESS3.predicate_return predicate() throws RecognitionException {
		UnparseBLESS3.predicate_return retval = new UnparseBLESS3.predicate_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:882:3: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:883:3: expression
			{
			pushFollow(FOLLOW_expression_in_predicate6223);
			expression();
			state._fsp--;

			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class value_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "value"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:888:1: value : (vn= valueName -> {$vn.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}});
	public final UnparseBLESS3.value_return value() throws RecognitionException {
		UnparseBLESS3.value_return retval = new UnparseBLESS3.value_return();
		retval.start = input.LT(1);

		BAST to=null;
		BAST n=null;
		BAST t=null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope c =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:889:3: (vn= valueName -> {$vn.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}})
			int alt69=5;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt69=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt69=2;
				}
				break;
			case LITERAL_timeout:
				{
				alt69=3;
				}
				break;
			case LITERAL_now:
				{
				alt69=4;
				}
				break;
			case LITERAL_tops:
				{
				alt69=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:890:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_value6244);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 891:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:893:3: c= constant
					{
					pushFollow(FOLLOW_constant_in_value6262);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 894:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:896:3: to= LITERAL_timeout
					{
					to=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6280); 
					// TEMPLATE REWRITE
					// 897:5: -> {%{$to.text}}
					{
						retval.st = new StringTemplate(templateLib,(to!=null?to.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:899:3: n= LITERAL_now
					{
					n=(BAST)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6298); 
					// TEMPLATE REWRITE
					// 900:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:902:3: t= LITERAL_tops
					{
					t=(BAST)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6316); 
					// TEMPLATE REWRITE
					// 903:5: -> {%{$t.text}}
					{
						retval.st = new StringTemplate(templateLib,(t!=null?t.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class valueName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "valueName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:906:1: valueName : ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}});
	public final UnparseBLESS3.valueName_return valueName() throws RecognitionException {
		UnparseBLESS3.valueName_return retval = new UnparseBLESS3.valueName_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST q=null;
		List<Object> list_array_index=null;
		List<Object> list_pn=null;
		TreeRuleReturnScope pr =null;
		RuleReturnScope array_index = null;
		RuleReturnScope pn = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:907:3: ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}})
			int alt73=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA73_1 = input.LA(2);
				if ( (LA73_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case DOLLAR:
						{
						alt73=1;
						}
						break;
					case LBRACKET:
						{
						alt73=2;
						}
						break;
					case DOT:
						{
						alt73=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 73, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( ((LA73_1 >= UP && LA73_1 <= AADL_STRING_LITERAL)||(LA73_1 >= AL && LA73_1 <= AM)||LA73_1==AT_SIGN||(LA73_1 >= CARET && LA73_1 <= COLON)||LA73_1==DIVIDE||LA73_1==EQ||LA73_1==EXP||LA73_1==GT||LA73_1==ID||LA73_1==INVOKE||LA73_1==LITERAL_abs||(LA73_1 >= LITERAL_all && LA73_1 <= LITERAL_any)||LA73_1==LITERAL_div||LA73_1==LITERAL_else||LA73_1==LITERAL_exists||LA73_1==LITERAL_false||LA73_1==LITERAL_iff||LA73_1==LITERAL_implies||LA73_1==LITERAL_mod||(LA73_1 >= LITERAL_not && LA73_1 <= LITERAL_now)||(LA73_1 >= LITERAL_null && LA73_1 <= LITERAL_numberof)||LA73_1==LITERAL_or||LA73_1==LITERAL_product||LA73_1==LITERAL_rem||LA73_1==LITERAL_round||LA73_1==LITERAL_sum||LA73_1==LITERAL_then||LA73_1==LITERAL_timeout||LA73_1==LITERAL_tops||(LA73_1 >= LITERAL_true && LA73_1 <= LITERAL_truncate)||(LA73_1 >= LITERAL_xor && LA73_1 <= LT)||LA73_1==MINUS||LA73_1==NEQ||LA73_1==OLD_NEQ||LA73_1==PLUS||LA73_1==PLUS_EQUALS||(LA73_1 >= QUANTITY && LA73_1 <= QUESTION)||LA73_1==RECORD_TERM||LA73_1==TICK||LA73_1==TIMES||LA73_1==UNARY_MINUS) ) {
					alt73=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case QUESTION:
				{
				alt73=4;
				}
				break;
			case TICK:
				{
				int LA73_3 = input.LA(2);
				if ( (LA73_3==DOWN) ) {
					int LA73_6 = input.LA(3);
					if ( (LA73_6==ID) ) {
						switch ( input.LA(4) ) {
						case LITERAL_fresh:
							{
							alt73=5;
							}
							break;
						case LITERAL_count:
							{
							alt73=6;
							}
							break;
						case LITERAL_updated:
							{
							alt73=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 73, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 73, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:908:3: ^(id= ID DOLLAR pr= functionParameters )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6343); 
					match(input, Token.DOWN, null); 
					match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6345); 
					pushFollow(FOLLOW_functionParameters_in_valueName6349);
					pr=functionParameters();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 909:5: -> function_call(f=$id.textpl=$pr.st)
					{
						retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (pr!=null?((StringTemplate)pr.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:3: ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6381); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6385); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:35: (array_index+= indexExpressionOrRange )+
					int cnt70=0;
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==DOTDOT||LA70_0==LITERAL_div||LA70_0==LITERAL_mod||LA70_0==LITERAL_rem||LA70_0==MINUS||LA70_0==PLUS||LA70_0==TIMES) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:35: array_index+= indexExpressionOrRange
							{
							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6389);
							array_index=indexExpressionOrRange();
							state._fsp--;

							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTemplate());
							}
							break;

						default :
							if ( cnt70 >= 1 ) break loop70;
							EarlyExitException eee = new EarlyExitException(70, input);
							throw eee;
						}
						cnt70++;
					}

					match(input, Token.UP, null); 

					match(input,DOT,FOLLOW_DOT_in_valueName6396); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:72: (pn+= partialName )*
						loop71:
						while (true) {
							int alt71=2;
							int LA71_0 = input.LA(1);
							if ( (LA71_0==ID) ) {
								alt71=1;
							}

							switch (alt71) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:72: pn+= partialName
								{
								pushFollow(FOLLOW_partialName_in_valueName6400);
								pn=partialName();
								state._fsp--;

								if (list_pn==null) list_pn=new ArrayList<Object>();
								list_pn.add(pn.getTemplate());
								}
								break;

							default :
								break loop71;
							}
						}

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 912:5: -> name(id=$id.textindex=$array_indexrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("index", list_array_index).put("rec", list_pn));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:3: ^(id= ID ^( DOT (pn+= partialName )+ ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6441); 
					match(input, Token.DOWN, null); 
					match(input,DOT,FOLLOW_DOT_in_valueName6445); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:21: (pn+= partialName )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:21: pn+= partialName
							{
							pushFollow(FOLLOW_partialName_in_valueName6449);
							pn=partialName();
							state._fsp--;

							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTemplate());
							}
							break;

						default :
							if ( cnt72 >= 1 ) break loop72;
							EarlyExitException eee = new EarlyExitException(72, input);
							throw eee;
						}
						cnt72++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 915:5: -> name(id=$id.textrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("rec", list_pn));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:917:3: ^(q= QUESTION id= ID )
					{
					q=(BAST)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6485); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6489); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 918:5: -> template(id=$id.text) \"<id>?\"
					{
						retval.st = new StringTemplate(templateLib, "<id>?",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:920:3: ^( TICK id= ID LITERAL_fresh )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6516); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6520); 
					match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6522); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 921:5: -> port_fresh(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_fresh",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:3: ^( TICK id= ID LITERAL_count )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6547); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6551); 
					match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6553); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 924:5: -> port_count(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_count",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:926:3: ^( TICK id= ID LITERAL_updated )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6578); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6582); 
					match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6584); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 927:5: -> port_updated(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_updated",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:929:3: id= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6609); 
					// TEMPLATE REWRITE
					// 930:5: -> {%{$id.text}}
					{
						retval.st = new StringTemplate(templateLib,(id!=null?id.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueName"


	public static class functionParameters_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionParameters"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:933:1: functionParameters : ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st});
	public final UnparseBLESS3.functionParameters_return functionParameters() throws RecognitionException {
		UnparseBLESS3.functionParameters_return retval = new UnparseBLESS3.functionParameters_return();
		retval.start = input.LT(1);

		List<Object> list_parameters=null;
		TreeRuleReturnScope parameter =null;
		RuleReturnScope parameters = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:934:3: ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st})
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==COMMA) ) {
				alt74=1;
			}
			else if ( (LA74_0==COLON) ) {
				alt74=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:935:3: ^( COMMA parameters+= formalExpressionPair )
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParameters6634); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6638);
					parameters=formalExpressionPair();
					state._fsp--;

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTemplate());
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 936:5: -> array_range_list(r=$parameters)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_parameters));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:938:3: parameter= formalExpressionPair
					{
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6663);
					parameter=formalExpressionPair();
					state._fsp--;

					// TEMPLATE REWRITE
					// 939:5: -> {$parameter.st}
					{
						retval.st = (parameter!=null?((StringTemplate)parameter.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionParameters"


	public static class formalExpressionPair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalExpressionPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:942:1: formalExpressionPair : ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st);
	public final UnparseBLESS3.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		UnparseBLESS3.formalExpressionPair_return retval = new UnparseBLESS3.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:943:3: ( ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:944:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6688); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_formalExpressionPair6692); 
			pushFollow(FOLLOW_expression_in_formalExpressionPair6696);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 945:5: -> formal_actual(f=$formal.textap=$actual.st)
			{
				retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalExpressionPair"


	public static class indexExpressionOrRange_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "indexExpressionOrRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:948:1: indexExpressionOrRange : ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st});
	public final UnparseBLESS3.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		UnparseBLESS3.indexExpressionOrRange_return retval = new UnparseBLESS3.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST dd=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope index =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:949:3: ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st})
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==DOTDOT) ) {
				alt75=1;
			}
			else if ( (LA75_0==LITERAL_div||LA75_0==LITERAL_mod||LA75_0==LITERAL_rem||LA75_0==MINUS||LA75_0==PLUS||LA75_0==TIMES) ) {
				alt75=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:950:3: ^(dd= DOTDOT lb= indexExpression ub= indexExpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6739); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6743);
					lb=indexExpression();
					state._fsp--;

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6747);
					ub=indexExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 951:5: -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (dd!=null?dd.getText():null)).put("lhs", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("rhs", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:953:3: index= indexExpression
					{
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6782);
					index=indexExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 954:5: -> {$index.st}
					{
						retval.st = (index!=null?((StringTemplate)index.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexExpressionOrRange"


	public static class partialName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "partialName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:957:1: partialName : ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}});
	public final UnparseBLESS3.partialName_return partialName() throws RecognitionException {
		UnparseBLESS3.partialName_return retval = new UnparseBLESS3.partialName_return();
		retval.start = input.LT(1);

		BAST record_id=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:958:3: ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}})
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==ID) ) {
				int LA76_1 = input.LA(2);
				if ( (LA76_1==DOWN) ) {
					alt76=1;
				}
				else if ( (LA76_1==UP||LA76_1==ID) ) {
					alt76=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 76, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}

			switch (alt76) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:959:3: ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) )
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName6809); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6813); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6817);
					array_index=indexExpressionOrRange();
					state._fsp--;

					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTemplate());
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 960:5: -> partial_name(i=$record_id.textp=$array_index)
					{
						retval.st = templateLib.getInstanceOf("partial_name",new STAttrMap().put("i", (record_id!=null?record_id.getText():null)).put("p", list_array_index));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:962:3: record_id= ID
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName6849); 
					// TEMPLATE REWRITE
					// 963:5: -> {%{$record_id.text}}
					{
						retval.st = new StringTemplate(templateLib,(record_id!=null?record_id.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partialName"


	public static class constant_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constant"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:967:1: constant : (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}});
	public final UnparseBLESS3.constant_return constant() throws RecognitionException {
		UnparseBLESS3.constant_return retval = new UnparseBLESS3.constant_return();
		retval.start = input.LT(1);

		BAST s=null;
		BAST t=null;
		BAST f=null;
		BAST n=null;
		TreeRuleReturnScope q =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:968:3: (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}})
			int alt77=5;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt77=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt77=2;
				}
				break;
			case LITERAL_true:
				{
				alt77=3;
				}
				break;
			case LITERAL_false:
				{
				alt77=4;
				}
				break;
			case LITERAL_null:
				{
				alt77=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:969:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_constant6876);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 970:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:972:3: s= AADL_STRING_LITERAL
					{
					s=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant6894); 
					// TEMPLATE REWRITE
					// 973:5: -> {%{$s.text}}
					{
						retval.st = new StringTemplate(templateLib,(s!=null?s.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:975:3: t= LITERAL_true
					{
					t=(BAST)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant6912); 
					// TEMPLATE REWRITE
					// 976:5: -> {%{$t.text}}
					{
						retval.st = new StringTemplate(templateLib,(t!=null?t.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:978:3: f= LITERAL_false
					{
					f=(BAST)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant6930); 
					// TEMPLATE REWRITE
					// 979:5: -> {%{$f.text}}
					{
						retval.st = new StringTemplate(templateLib,(f!=null?f.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:981:3: n= LITERAL_null
					{
					n=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant6948); 
					// TEMPLATE REWRITE
					// 982:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class quantity_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantity"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:985:1: quantity : ( ^( QUANTITY number= aNumber ) -> {$number.st}| ^( QUANTITY number= aNumber unit= ID ) -> template(number=$number.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY number= aNumber LITERAL_scalar ) -> template(number=$number.st) \"<number> scalar\"| ^( QUANTITY number= aNumber LITERAL_whole ) -> template(number=$number.st) \"<number> whole\");
	public final UnparseBLESS3.quantity_return quantity() throws RecognitionException {
		UnparseBLESS3.quantity_return retval = new UnparseBLESS3.quantity_return();
		retval.start = input.LT(1);

		BAST unit=null;
		TreeRuleReturnScope number =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:986:3: ( ^( QUANTITY number= aNumber ) -> {$number.st}| ^( QUANTITY number= aNumber unit= ID ) -> template(number=$number.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY number= aNumber LITERAL_scalar ) -> template(number=$number.st) \"<number> scalar\"| ^( QUANTITY number= aNumber LITERAL_whole ) -> template(number=$number.st) \"<number> whole\")
			int alt78=4;
			alt78 = dfa78.predict(input);
			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:987:3: ^( QUANTITY number= aNumber )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity6973); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity6977);
					number=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 988:5: -> {$number.st}
					{
						retval.st = (number!=null?((StringTemplate)number.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:990:3: ^( QUANTITY number= aNumber unit= ID )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity6997); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7001);
					number=aNumber();
					state._fsp--;

					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantity7005); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 991:5: -> template(number=$number.stunit=$unit.text) \"<number> <unit>\"
					{
						retval.st = new StringTemplate(templateLib, "<number> <unit>",new STAttrMap().put("number", (number!=null?((StringTemplate)number.getTemplate()):null)).put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:993:3: ^( QUANTITY number= aNumber LITERAL_scalar )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7037); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7041);
					number=aNumber();
					state._fsp--;

					match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7043); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 994:5: -> template(number=$number.st) \"<number> scalar\"
					{
						retval.st = new StringTemplate(templateLib, "<number> scalar",new STAttrMap().put("number", (number!=null?((StringTemplate)number.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:996:3: ^( QUANTITY number= aNumber LITERAL_whole )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7070); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7074);
					number=aNumber();
					state._fsp--;

					match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7076); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 997:5: -> template(number=$number.st) \"<number> whole\"
					{
						retval.st = new StringTemplate(templateLib, "<number> whole",new STAttrMap().put("number", (number!=null?((StringTemplate)number.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantity"


	public static class aNumber_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "aNumber"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1000:1: aNumber : (lit= NUMBER -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= QCLREF -> {%{$propertyConstant.text}});
	public final UnparseBLESS3.aNumber_return aNumber() throws RecognitionException {
		UnparseBLESS3.aNumber_return retval = new UnparseBLESS3.aNumber_return();
		retval.start = input.LT(1);

		BAST lit=null;
		BAST propertyConstant=null;
		TreeRuleReturnScope property =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1000:8: (lit= NUMBER -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= QCLREF -> {%{$propertyConstant.text}})
			int alt79=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt79=1;
				}
				break;
			case OCTOTHORPE:
				{
				alt79=2;
				}
				break;
			case QCLREF:
				{
				alt79=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1001:2: lit= NUMBER
					{
					lit=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7111); 
					// TEMPLATE REWRITE
					// 1002:4: -> {%{$lit.text}}
					{
						retval.st = new StringTemplate(templateLib,(lit!=null?lit.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1003:4: property= propertyReference
					{
					pushFollow(FOLLOW_propertyReference_in_aNumber7125);
					property=propertyReference();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1004:4: -> {$property.st}
					{
						retval.st = (property!=null?((StringTemplate)property.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1005:4: propertyConstant= QCLREF
					{
					propertyConstant=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_aNumber7139); 
					// TEMPLATE REWRITE
					// 1006:4: -> {%{$propertyConstant.text}}
					{
						retval.st = new StringTemplate(templateLib,(propertyConstant!=null?propertyConstant.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aNumber"


	public static class propertyReference_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1009:1: propertyReference : ( ^(oct= OCTOTHORPE pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.text)| ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.textf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.text)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF ) -> property_reference(component=$component.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ ) -> property_reference(component=$component.textpname=$pname.textf=$field));
	public final UnparseBLESS3.propertyReference_return propertyReference() throws RecognitionException {
		UnparseBLESS3.propertyReference_return retval = new UnparseBLESS3.propertyReference_return();
		retval.start = input.LT(1);

		BAST oct=null;
		BAST pname=null;
		BAST self=null;
		BAST component=null;
		List<Object> list_field=null;
		RuleReturnScope field = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1010:2: ( ^(oct= OCTOTHORPE pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.text)| ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.textf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.text)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF ) -> property_reference(component=$component.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ ) -> property_reference(component=$component.textpname=$pname.textf=$field))
			int alt83=6;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==OCTOTHORPE) ) {
				int LA83_1 = input.LA(2);
				if ( (LA83_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case QCLREF:
						{
						int LA83_3 = input.LA(4);
						if ( (LA83_3==UP) ) {
							alt83=1;
						}
						else if ( (LA83_3==DOT||LA83_3==LBRACKET) ) {
							alt83=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 83, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LITERAL_self:
						{
						int LA83_4 = input.LA(4);
						if ( (LA83_4==QCLREF) ) {
							int LA83_8 = input.LA(5);
							if ( (LA83_8==UP) ) {
								alt83=3;
							}
							else if ( (LA83_8==DOT||LA83_8==LBRACKET) ) {
								alt83=4;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 83, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 83, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case QCREF:
						{
						int LA83_5 = input.LA(4);
						if ( (LA83_5==QCLREF) ) {
							int LA83_9 = input.LA(5);
							if ( (LA83_9==UP) ) {
								alt83=5;
							}
							else if ( (LA83_9==DOT||LA83_9==LBRACKET) ) {
								alt83=6;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 83, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 83, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 83, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1012:3: ^(oct= OCTOTHORPE pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7171); 
					match(input, Token.DOWN, null); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7175); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1013:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1014:5: -> property_reference(pname=$pname.text)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?pname.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1016:3: ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7212); 
					match(input, Token.DOWN, null); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7216); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1016:38: (field+= propertyField )+
					int cnt80=0;
					loop80:
					while (true) {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==DOT||LA80_0==LBRACKET) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1016:38: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7220);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt80 >= 1 ) break loop80;
							EarlyExitException eee = new EarlyExitException(80, input);
							throw eee;
						}
						cnt80++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1017:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1018:5: -> property_reference(pname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1020:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7262); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7266); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7270); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1021:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1022:5: -> property_reference(component=$self.textpname=$pname.text)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?pname.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1024:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7312); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7316); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7320); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1024:56: (field+= propertyField )+
					int cnt81=0;
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==DOT||LA81_0==LBRACKET) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1024:56: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7324);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt81 >= 1 ) break loop81;
							EarlyExitException eee = new EarlyExitException(81, input);
							throw eee;
						}
						cnt81++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1025:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1026:5: -> property_reference(component=$self.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1028:3: ^(oct= OCTOTHORPE component= QCREF pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7370); 
					match(input, Token.DOWN, null); 
					component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7374); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7378); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1029:5: -> property_reference(component=$component.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?component.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1031:3: ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7413); 
					match(input, Token.DOWN, null); 
					component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7417); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7421); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1031:54: (field+= propertyField )+
					int cnt82=0;
					loop82:
					while (true) {
						int alt82=2;
						int LA82_0 = input.LA(1);
						if ( (LA82_0==DOT||LA82_0==LBRACKET) ) {
							alt82=1;
						}

						switch (alt82) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1031:54: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7425);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt82 >= 1 ) break loop82;
							EarlyExitException eee = new EarlyExitException(82, input);
							throw eee;
						}
						cnt82++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1032:5: -> property_reference(component=$component.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?component.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyReference"


	public static class propertyField_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1035:1: propertyField : ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\");
	public final UnparseBLESS3.propertyField_return propertyField() throws RecognitionException {
		UnparseBLESS3.propertyField_return retval = new UnparseBLESS3.propertyField_return();
		retval.start = input.LT(1);

		BAST index=null;
		BAST var=null;
		BAST pf=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:3: ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\")
			int alt84=5;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==LBRACKET) ) {
				int LA84_1 = input.LA(2);
				if ( (LA84_1==DOWN) ) {
					int LA84_3 = input.LA(3);
					if ( (LA84_3==NUMBER) ) {
						alt84=1;
					}
					else if ( (LA84_3==ID) ) {
						alt84=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 84, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA84_0==DOT) ) {
				int LA84_2 = input.LA(2);
				if ( (LA84_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case ID:
						{
						alt84=3;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt84=4;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt84=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 84, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 84, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1037:3: ^( LBRACKET index= NUMBER )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7467); 
					match(input, Token.DOWN, null); 
					index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7471); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1038:5: -> index(i=$index.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (index!=null?index.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1040:3: ^( LBRACKET var= ID )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7496); 
					match(input, Token.DOWN, null); 
					var=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7500); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1041:5: -> index(i=$var.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (var!=null?var.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1043:3: ^( DOT pf= ID )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7525); 
					match(input, Token.DOWN, null); 
					pf=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7529); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1044:5: -> template(pf=$pf.text) \".<pf>\"
					{
						retval.st = new StringTemplate(templateLib, ".<pf>",new STAttrMap().put("pf", (pf!=null?pf.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1046:3: ^( DOT LITERAL_upper_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7556); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7558); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1047:5: -> template( \".upper_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".upper_bound");
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1049:3: ^( DOT LITERAL_lower_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7582); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7584); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1050:5: -> template( \".lower_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".lower_bound");
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyField"


	public static class actionSubclause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "actionSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1057:1: actionSubclause : ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st);
	public final UnparseBLESS3.actionSubclause_return actionSubclause() throws RecognitionException {
		UnparseBLESS3.actionSubclause_return retval = new UnparseBLESS3.actionSubclause_return();
		retval.start = input.LT(1);

		BAST no_proof=null;
		TreeRuleReturnScope tc =null;
		TreeRuleReturnScope ac =null;
		TreeRuleReturnScope precondition =null;
		TreeRuleReturnScope postcondition =null;
		TreeRuleReturnScope invariant =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1058:3: ( ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:3: ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,ACTION_SUBCLAUSE,FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause7619); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:23: (no_proof= DO_NOT_PROVE )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DO_NOT_PROVE) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:24: no_proof= DO_NOT_PROVE
					{
					no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7624); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:48: (tc= throwsClause )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==LITERAL_throws) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:49: tc= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7631);
					tc=throwsClause();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:67: (ac= assertClause )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LITERAL_assert) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:68: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7638);
					ac=assertClause();
					state._fsp--;

					}
					break;

			}

			match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7649); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1060:20: (precondition= assertion )?
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==ASSERTION||(LA88_0 >= ASSERTION_ENUMERATION && LA88_0 <= ASSERTION_FUNCTION)) ) {
					alt88=1;
				}
				switch (alt88) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1060:21: precondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7654);
						precondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7666); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:21: (postcondition= assertion )?
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==ASSERTION||(LA89_0 >= ASSERTION_ENUMERATION && LA89_0 <= ASSERTION_FUNCTION)) ) {
					alt89=1;
				}
				switch (alt89) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:22: postcondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7671);
						postcondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7684); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1062:26: (invariant= assertion )?
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==ASSERTION||(LA90_0 >= ASSERTION_ENUMERATION && LA90_0 <= ASSERTION_FUNCTION)) ) {
					alt90=1;
				}
				switch (alt90) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1062:27: invariant= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7689);
						invariant=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7702);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1064:3: -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st)
			{
				retval.st = templateLib.getInstanceOf("action_subclause",new STAttrMap().put("no_proof", (no_proof!=null?no_proof.getText():null)).put("tc", (tc!=null?((StringTemplate)tc.getTemplate()):null)).put("ac", (ac!=null?((StringTemplate)ac.getTemplate()):null)).put("pre", (precondition!=null?((StringTemplate)precondition.getTemplate()):null)).put("post", (postcondition!=null?((StringTemplate)postcondition.getTemplate()):null)).put("inv", (invariant!=null?((StringTemplate)invariant.getTemplate()):null)).put("elq", (elq!=null?((StringTemplate)elq.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionSubclause"


	public static class throwsClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "throwsClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1069:1: throwsClause : ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions);
	public final UnparseBLESS3.throwsClause_return throwsClause() throws RecognitionException {
		UnparseBLESS3.throwsClause_return retval = new UnparseBLESS3.throwsClause_return();
		retval.start = input.LT(1);

		BAST exceptions=null;
		List<Object> list_exceptions=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1070:3: ( ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:2: ^( LITERAL_throws (exceptions+= ID )+ )
			{
			match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7775); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:30: (exceptions+= ID )+
			int cnt91=0;
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==ID) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:30: exceptions+= ID
					{
					exceptions=(BAST)match(input,ID,FOLLOW_ID_in_throwsClause7779); 
					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt91 >= 1 ) break loop91;
					EarlyExitException eee = new EarlyExitException(91, input);
					throw eee;
				}
				cnt91++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1072:4: -> throws_clause(ex=$exceptions)
			{
				retval.st = templateLib.getInstanceOf("throws_clause",new STAttrMap().put("ex", list_exceptions));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throwsClause"


	public static class assertClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1075:1: assertClause : ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions);
	public final UnparseBLESS3.assertClause_return assertClause() throws RecognitionException {
		UnparseBLESS3.assertClause_return retval = new UnparseBLESS3.assertClause_return();
		retval.start = input.LT(1);

		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1076:3: ( ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1077:3: ^( LITERAL_assert (assertions+= namedAssertion )+ )
			{
			match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7812); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1077:31: (assertions+= namedAssertion )+
			int cnt92=0;
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==ASSERTION||(LA92_0 >= ASSERTION_ENUMERATION && LA92_0 <= ASSERTION_FUNCTION)) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1077:31: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7816);
					assertions=namedAssertion();
					state._fsp--;

					if (list_assertions==null) list_assertions=new ArrayList<Object>();
					list_assertions.add(assertions.getTemplate());
					}
					break;

				default :
					if ( cnt92 >= 1 ) break loop92;
					EarlyExitException eee = new EarlyExitException(92, input);
					throw eee;
				}
				cnt92++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1078:5: -> assert_clause(a=$assertions)
			{
				retval.st = templateLib.getInstanceOf("assert_clause",new STAttrMap().put("a", list_assertions));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertClause"


	public static class existentialLatticeQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "existentialLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1081:1: existentialLatticeQuantification : ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st);
	public final UnparseBLESS3.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.existentialLatticeQuantification_return retval = new UnparseBLESS3.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope qv =null;
		TreeRuleReturnScope actions =null;
		TreeRuleReturnScope cc =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1082:3: ( ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:3: ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification7849); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:13: (qv= quantifiedVariables )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LITERAL_declare) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:15: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification7855);
					qv=quantifiedVariables();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification7862);
			actions=behaviorActions();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification7864); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:72: (cc= catchClause )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==LITERAL_catch) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:74: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification7870);
					cc=catchClause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1084:5: -> elq(v=$qv.stba=$actions.stcc=$cc.st)
			{
				retval.st = templateLib.getInstanceOf("elq",new STAttrMap().put("v", (qv!=null?((StringTemplate)qv.getTemplate()):null)).put("ba", (actions!=null?((StringTemplate)actions.getTemplate()):null)).put("cc", (cc!=null?((StringTemplate)cc.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialLatticeQuantification"


	public static class quantifiedVariables_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantifiedVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:1: quantifiedVariables : ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs);
	public final UnparseBLESS3.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		UnparseBLESS3.quantifiedVariables_return retval = new UnparseBLESS3.quantifiedVariables_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:3: ( ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1089:3: ^( LITERAL_declare (decs+= variableDeclaration )+ )
			{
			match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7915); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1089:26: (decs+= variableDeclaration )+
			int cnt95=0;
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==VARIABLE_DECLARATION) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1089:26: decs+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7919);
					decs=variableDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt95 >= 1 ) break loop95;
					EarlyExitException eee = new EarlyExitException(95, input);
					throw eee;
				}
				cnt95++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1090:5: -> quantified_variables(bv=$decs)
			{
				retval.st = templateLib.getInstanceOf("quantified_variables",new STAttrMap().put("bv", list_decs));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantifiedVariables"


	public static class variableDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1093:1: variableDeclaration : ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text);
	public final UnparseBLESS3.variableDeclaration_return variableDeclaration() throws RecognitionException {
		UnparseBLESS3.variableDeclaration_return retval = new UnparseBLESS3.variableDeclaration_return();
		retval.start = input.LT(1);

		BAST nv=null;
		BAST sh=null;
		BAST c=null;
		BAST sp=null;
		BAST f=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1094:3: ( ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:3: ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? )
			{
			match(input,VARIABLE_DECLARATION,FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration7951); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variable_in_variableDeclaration7955);
			v=variable();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:38: ( ^( ASSIGN exp= expression ) )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==ASSIGN) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:40: ^( ASSIGN exp= expression )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7961); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_variableDeclaration7965);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:71: (a= assertion )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==ASSERTION||(LA97_0 >= ASSERTION_ENUMERATION && LA97_0 <= ASSERTION_FUNCTION)) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:71: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7974);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:7: (nv= LITERAL_nonvolatile )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LITERAL_nonvolatile) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:7: nv= LITERAL_nonvolatile
					{
					nv=(BAST)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7984); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:31: (sh= LITERAL_shared )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LITERAL_shared) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:31: sh= LITERAL_shared
					{
					sh=(BAST)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7989); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:49: (c= LITERAL_constant )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==LITERAL_constant) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:49: c= LITERAL_constant
					{
					c=(BAST)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7994); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:70: (sp= LITERAL_spread )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LITERAL_spread) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:70: sp= LITERAL_spread
					{
					sp=(BAST)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7999); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:88: (f= LITERAL_final )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==LITERAL_final) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1096:88: f= LITERAL_final
					{
					f=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration8004); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1097:5: -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text)
			{
				retval.st = templateLib.getInstanceOf("variable_declaration",new STAttrMap().put("v", (v!=null?((StringTemplate)v.getTemplate()):null)).put("exp", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("a", (a!=null?((StringTemplate)a.getTemplate()):null)).put("nv", (nv!=null?nv.getText():null)).put("sh", (sh!=null?sh.getText():null)).put("c", (c!=null?c.getText():null)).put("sp", (sp!=null?sp.getText():null)).put("f", (f!=null?f.getText():null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class catchClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "catchClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1100:1: catchClause : ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct);
	public final UnparseBLESS3.catchClause_return catchClause() throws RecognitionException {
		UnparseBLESS3.catchClause_return retval = new UnparseBLESS3.catchClause_return();
		retval.start = input.LT(1);

		List<Object> list_cct=null;
		RuleReturnScope cct = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1101:3: ( ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1102:2: ^( LITERAL_catch (cct+= catchClauseTerm )+ )
			{
			match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause8064); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1102:22: (cct+= catchClauseTerm )+
			int cnt103=0;
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==LPAREN) ) {
					alt103=1;
				}

				switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1102:22: cct+= catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause8068);
					cct=catchClauseTerm();
					state._fsp--;

					if (list_cct==null) list_cct=new ArrayList<Object>();
					list_cct.add(cct.getTemplate());
					}
					break;

				default :
					if ( cnt103 >= 1 ) break loop103;
					EarlyExitException eee = new EarlyExitException(103, input);
					throw eee;
				}
				cnt103++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1103:4: -> catch_clause(cct=$cct)
			{
				retval.st = templateLib.getInstanceOf("catch_clause",new STAttrMap().put("cct", list_cct));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchClause"


	public static class catchClauseTerm_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "catchClauseTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1106:1: catchClauseTerm : ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st));
	public final UnparseBLESS3.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		UnparseBLESS3.catchClauseTerm_return retval = new UnparseBLESS3.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST colon=null;
		BAST exceptions=null;
		List<Object> list_exceptions=null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1107:3: ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st))
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LPAREN) ) {
				int LA105_1 = input.LA(2);
				if ( (LA105_1==DOWN) ) {
					int LA105_2 = input.LA(3);
					if ( (LA105_2==LITERAL_all) ) {
						alt105=2;
					}
					else if ( (LA105_2==ID) ) {
						alt105=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:3: ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8100); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:23: (exceptions+= ID )+
					int cnt104=0;
					loop104:
					while (true) {
						int alt104=2;
						int LA104_0 = input.LA(1);
						if ( (LA104_0==ID) ) {
							alt104=1;
						}

						switch (alt104) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:23: exceptions+= ID
							{
							exceptions=(BAST)match(input,ID,FOLLOW_ID_in_catchClauseTerm8104); 
							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt104 >= 1 ) break loop104;
							EarlyExitException eee = new EarlyExitException(104, input);
							throw eee;
						}
						cnt104++;
					}

					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8110); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8114);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8116); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1109:5: -> catch_clause_term(ei=$exceptionsba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term",new STAttrMap().put("ei", list_exceptions).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1111:3: ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8146); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm8148); 
					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8152); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8156);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8158); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1112:5: -> catch_clause_term_all(ba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term_all",new STAttrMap().put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchClauseTerm"


	public static class behaviorActions_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1115:1: behaviorActions : ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st});
	public final UnparseBLESS3.behaviorActions_return behaviorActions() throws RecognitionException {
		UnparseBLESS3.behaviorActions_return retval = new UnparseBLESS3.behaviorActions_return();
		retval.start = input.LT(1);

		List<Object> list_aa=null;
		TreeRuleReturnScope a =null;
		RuleReturnScope aa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1116:3: ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st})
			int alt108=3;
			switch ( input.LA(1) ) {
			case SEMICOLON:
				{
				alt108=1;
				}
				break;
			case AMPERSAND:
				{
				alt108=2;
				}
				break;
			case ACTION:
				{
				alt108=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1117:3: ^( SEMICOLON (aa+= assertedAction )+ )
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions8190); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1117:18: (aa+= assertedAction )+
					int cnt106=0;
					loop106:
					while (true) {
						int alt106=2;
						int LA106_0 = input.LA(1);
						if ( (LA106_0==ACTION) ) {
							alt106=1;
						}

						switch (alt106) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1117:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8194);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt106 >= 1 ) break loop106;
							EarlyExitException eee = new EarlyExitException(106, input);
							throw eee;
						}
						cnt106++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1118:5: -> sequential_composition(f=$aa)
					{
						retval.st = templateLib.getInstanceOf("sequential_composition",new STAttrMap().put("f", list_aa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:3: ^( AMPERSAND (aa+= assertedAction )+ )
					{
					match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions8220); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:18: (aa+= assertedAction )+
					int cnt107=0;
					loop107:
					while (true) {
						int alt107=2;
						int LA107_0 = input.LA(1);
						if ( (LA107_0==ACTION) ) {
							alt107=1;
						}

						switch (alt107) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8224);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt107 >= 1 ) break loop107;
							EarlyExitException eee = new EarlyExitException(107, input);
							throw eee;
						}
						cnt107++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1121:5: -> concurrent_composition(g=$aa)
					{
						retval.st = templateLib.getInstanceOf("concurrent_composition",new STAttrMap().put("g", list_aa));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1123:3: a= assertedAction
					{
					pushFollow(FOLLOW_assertedAction_in_behaviorActions8250);
					a=assertedAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1124:5: -> {$a.st}
					{
						retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorActions"


	public static class assertedAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:1: assertedAction : ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st);
	public final UnparseBLESS3.assertedAction_return assertedAction() throws RecognitionException {
		UnparseBLESS3.assertedAction_return retval = new UnparseBLESS3.assertedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pre =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope post =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1128:3: ( ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:3: ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) )
			{
			match(input,ACTION,FOLLOW_ACTION_in_assertedAction8275); 
			match(input, Token.DOWN, null); 
			match(input,P,FOLLOW_P_in_assertedAction8279); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:21: (pre= assertion )?
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==ASSERTION||(LA109_0 >= ASSERTION_ENUMERATION && LA109_0 <= ASSERTION_FUNCTION)) ) {
					alt109=1;
				}
				switch (alt109) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:21: pre= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8283);
						pre=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,S,FOLLOW_S_in_assertedAction8290); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_action_in_assertedAction8294);
			s=action();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,Q,FOLLOW_Q_in_assertedAction8300); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:60: (post= assertion )?
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==ASSERTION||(LA110_0 >= ASSERTION_ENUMERATION && LA110_0 <= ASSERTION_FUNCTION)) ) {
					alt110=1;
				}
				switch (alt110) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:60: post= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8304);
						post=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1130:5: -> asserted_action(p=$pre.sts=$s.stq=$post.st)
			{
				retval.st = templateLib.getInstanceOf("asserted_action",new STAttrMap().put("p", (pre!=null?((StringTemplate)pre.getTemplate()):null)).put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("q", (post!=null?((StringTemplate)post.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertedAction"


	public static class action_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "action"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1133:1: action : (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st});
	public final UnparseBLESS3.action_return action() throws RecognitionException {
		UnparseBLESS3.action_return retval = new UnparseBLESS3.action_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ba =null;
		TreeRuleReturnScope if_fi =null;
		TreeRuleReturnScope wl =null;
		TreeRuleReturnScope fl =null;
		TreeRuleReturnScope du =null;
		TreeRuleReturnScope elq =null;
		TreeRuleReturnScope ulq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1133:7: (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st})
			int alt111=7;
			switch ( input.LA(1) ) {
			case ASSIGN:
			case LITERAL_exception:
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_setmode:
			case LITERAL_skip:
			case LITERAL_swap:
			case LITERAL_when:
			case PORT_INPUT:
			case PORT_OUTPUT:
			case FUNCTION_CALL:
				{
				alt111=1;
				}
				break;
			case LITERAL_if:
				{
				alt111=2;
				}
				break;
			case LITERAL_while:
				{
				alt111=3;
				}
				break;
			case LITERAL_for:
				{
				alt111=4;
				}
				break;
			case LITERAL_do:
				{
				alt111=5;
				}
				break;
			case LCURLY:
				{
				alt111=6;
				}
				break;
			case LITERAL_forall:
				{
				alt111=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1134:3: ba= basicAction
					{
					pushFollow(FOLLOW_basicAction_in_action8346);
					ba=basicAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1135:5: -> {$ba.st}
					{
						retval.st = (ba!=null?((StringTemplate)ba.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1136:5: if_fi= alternative
					{
					pushFollow(FOLLOW_alternative_in_action8362);
					if_fi=alternative();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1137:5: -> {$if_fi.st}
					{
						retval.st = (if_fi!=null?((StringTemplate)if_fi.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1138:5: wl= whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_action8378);
					wl=whileLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1139:5: -> {$wl.st}
					{
						retval.st = (wl!=null?((StringTemplate)wl.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:5: fl= forLoop
					{
					pushFollow(FOLLOW_forLoop_in_action8394);
					fl=forLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1141:5: -> {$fl.st}
					{
						retval.st = (fl!=null?((StringTemplate)fl.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1142:5: du= doUntilLoop
					{
					pushFollow(FOLLOW_doUntilLoop_in_action8410);
					du=doUntilLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1143:5: -> {$du.st}
					{
						retval.st = (du!=null?((StringTemplate)du.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1144:5: elq= existentialLatticeQuantification
					{
					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8426);
					elq=existentialLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1145:5: -> {$elq.st}
					{
						retval.st = (elq!=null?((StringTemplate)elq.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:5: ulq= universalLatticeQuantification
					{
					pushFollow(FOLLOW_universalLatticeQuantification_in_action8443);
					ulq=universalLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1147:5: -> {$ulq.st}
					{
						retval.st = (ulq!=null?((StringTemplate)ulq.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class basicAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "basicAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1150:1: basicAction : (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| LITERAL_setmode mode= ID -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st});
	public final UnparseBLESS3.basicAction_return basicAction() throws RecognitionException {
		UnparseBLESS3.basicAction_return retval = new UnparseBLESS3.basicAction_return();
		retval.start = input.LT(1);

		BAST sk=null;
		BAST mode=null;
		TreeRuleReturnScope ass =null;
		TreeRuleReturnScope wt =null;
		TreeRuleReturnScope co =null;
		TreeRuleReturnScope ca =null;
		TreeRuleReturnScope sa =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1151:3: (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| LITERAL_setmode mode= ID -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st})
			int alt112=8;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt112=1;
				}
				break;
			case ASSIGN:
				{
				int LA112_2 = input.LA(2);
				if ( (LA112_2==DOWN) ) {
					int LA112_8 = input.LA(3);
					if ( (LA112_8==COMMA) ) {
						alt112=7;
					}
					else if ( (LA112_8==ID||LA112_8==QUESTION||LA112_8==TICK) ) {
						alt112=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 112, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 112, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_setmode:
				{
				alt112=3;
				}
				break;
			case LITERAL_when:
				{
				alt112=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt112=5;
				}
				break;
			case PORT_INPUT:
			case PORT_OUTPUT:
			case FUNCTION_CALL:
				{
				alt112=6;
				}
				break;
			case LITERAL_exception:
				{
				alt112=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}
			switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:3: sk= LITERAL_skip
					{
					sk=(BAST)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8472); 
					// TEMPLATE REWRITE
					// 1153:4: -> {%{$sk.text}}
					{
						retval.st = new StringTemplate(templateLib,(sk!=null?sk.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1154:5: ass= assignment
					{
					pushFollow(FOLLOW_assignment_in_basicAction8488);
					ass=assignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1155:5: -> {$ass.st}
					{
						retval.st = (ass!=null?((StringTemplate)ass.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1156:5: LITERAL_setmode mode= ID
					{
					match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8502); 
					mode=(BAST)match(input,ID,FOLLOW_ID_in_basicAction8506); 
					// TEMPLATE REWRITE
					// 1157:5: -> template(mode=$mode.text) \"setmode <mode>\"
					{
						retval.st = new StringTemplate(templateLib, "setmode <mode>",new STAttrMap().put("mode", (mode!=null?mode.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:5: wt= whenThrow
					{
					pushFollow(FOLLOW_whenThrow_in_basicAction8530);
					wt=whenThrow();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1159:5: -> {$wt.st}
					{
						retval.st = (wt!=null?((StringTemplate)wt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1160:5: co= combinableOperation
					{
					pushFollow(FOLLOW_combinableOperation_in_basicAction8546);
					co=combinableOperation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1161:5: -> {$co.st}
					{
						retval.st = (co!=null?((StringTemplate)co.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1162:5: ca= communicationAction
					{
					pushFollow(FOLLOW_communicationAction_in_basicAction8562);
					ca=communicationAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1163:5: -> {$ca.st}
					{
						retval.st = (ca!=null?((StringTemplate)ca.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1164:5: sa= simultaneousAssignment
					{
					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8579);
					sa=simultaneousAssignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1165:5: -> {$sa.st}
					{
						retval.st = (sa!=null?((StringTemplate)sa.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1166:5: ie= issueException
					{
					pushFollow(FOLLOW_issueException_in_basicAction8595);
					ie=issueException();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1167:5: -> {$ie.st}
					{
						retval.st = (ie!=null?((StringTemplate)ie.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "basicAction"


	public static class issueException_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "issueException"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1170:1: issueException : ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text);
	public final UnparseBLESS3.issueException_return issueException() throws RecognitionException {
		UnparseBLESS3.issueException_return retval = new UnparseBLESS3.issueException_return();
		retval.start = input.LT(1);

		BAST exception=null;
		BAST message=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:3: ( ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1172:3: ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException8621); 
			match(input, Token.DOWN, null); 
			exception=(BAST)match(input,ID,FOLLOW_ID_in_issueException8625); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1172:44: (message= AADL_STRING_LITERAL )?
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==AADL_STRING_LITERAL) ) {
				alt113=1;
			}
			switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1172:44: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException8629); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1173:5: -> issue_exception(ex=$exception.textm=$message.text)
			{
				retval.st = templateLib.getInstanceOf("issue_exception",new STAttrMap().put("ex", (exception!=null?exception.getText():null)).put("m", (message!=null?message.getText():null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "issueException"


	public static class assignment_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1176:1: assignment : ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st);
	public final UnparseBLESS3.assignment_return assignment() throws RecognitionException {
		UnparseBLESS3.assignment_return retval = new UnparseBLESS3.assignment_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1177:3: ( ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1178:3: ^( ASSIGN n= nameTick e= expressionOrAny )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8669); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_nameTick_in_assignment8673);
			n=nameTick();
			state._fsp--;

			pushFollow(FOLLOW_expressionOrAny_in_assignment8677);
			e=expressionOrAny();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1179:5: -> assignment(nt=$n.steort=$e.st)
			{
				retval.st = templateLib.getInstanceOf("assignment",new STAttrMap().put("nt", (n!=null?((StringTemplate)n.getTemplate()):null)).put("eort", (e!=null?((StringTemplate)e.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class nameTick_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "nameTick"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1182:1: nameTick : ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st});
	public final UnparseBLESS3.nameTick_return nameTick() throws RecognitionException {
		UnparseBLESS3.nameTick_return retval = new UnparseBLESS3.nameTick_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1183:3: ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st})
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==TICK) ) {
				int LA114_1 = input.LA(2);
				if ( (LA114_1==DOWN) ) {
					int LA114_3 = input.LA(3);
					if ( (LA114_3==ID) ) {
						int LA114_4 = input.LA(4);
						if ( (LA114_4==LITERAL_count||LA114_4==LITERAL_fresh||LA114_4==LITERAL_updated) ) {
							alt114=2;
						}
						else if ( ((LA114_4 >= DOWN && LA114_4 <= UP)) ) {
							alt114=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 114, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA114_3==QUESTION||LA114_3==TICK) ) {
						alt114=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 114, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 114, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA114_0==ID||LA114_0==QUESTION) ) {
				alt114=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1184:3: ^( TICK vn= valueName )
					{
					match(input,TICK,FOLLOW_TICK_in_nameTick8716); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_nameTick8720);
					vn=valueName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1185:5: -> name_tick(vn=$vn.st)
					{
						retval.st = templateLib.getInstanceOf("name_tick",new STAttrMap().put("vn", (vn!=null?((StringTemplate)vn.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1187:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_nameTick8745);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1188:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameTick"


	public static class expressionOrAny_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expressionOrAny"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1191:1: expressionOrAny : (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}});
	public final UnparseBLESS3.expressionOrAny_return expressionOrAny() throws RecognitionException {
		UnparseBLESS3.expressionOrAny_return retval = new UnparseBLESS3.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST any=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:3: (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}})
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==LITERAL_all||LA115_0==LITERAL_exists||LA115_0==LITERAL_iff||LA115_0==LITERAL_implies||LA115_0==LITERAL_numberof||LA115_0==LITERAL_product||LA115_0==LITERAL_sum) ) {
				alt115=1;
			}
			else if ( (LA115_0==LITERAL_any) ) {
				alt115=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}

			switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1193:3: exp= expression
					{
					pushFollow(FOLLOW_expression_in_expressionOrAny8772);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1194:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1196:3: any= LITERAL_any
					{
					any=(BAST)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8792); 
					// TEMPLATE REWRITE
					// 1197:4: -> {%{$any.text}}
					{
						retval.st = new StringTemplate(templateLib,(any!=null?any.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionOrAny"


	public static class simultaneousAssignment_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "simultaneousAssignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1200:1: simultaneousAssignment : ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs);
	public final UnparseBLESS3.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		UnparseBLESS3.simultaneousAssignment_return retval = new UnparseBLESS3.simultaneousAssignment_return();
		retval.start = input.LT(1);

		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1201:3: ( ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1202:3: ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8818); 
			match(input, Token.DOWN, null); 
			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8822); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1202:25: (lhs+= nameTick )+
			int cnt116=0;
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==ID||LA116_0==QUESTION||LA116_0==TICK) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1202:25: lhs+= nameTick
					{
					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8826);
					lhs=nameTick();
					state._fsp--;

					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTemplate());
					}
					break;

				default :
					if ( cnt116 >= 1 ) break loop116;
					EarlyExitException eee = new EarlyExitException(116, input);
					throw eee;
				}
				cnt116++;
			}

			match(input, Token.UP, null); 

			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8833); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1202:51: (rhs+= expressionOrAny )+
			int cnt117=0;
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==LITERAL_all||LA117_0==LITERAL_any||LA117_0==LITERAL_exists||LA117_0==LITERAL_iff||LA117_0==LITERAL_implies||LA117_0==LITERAL_numberof||LA117_0==LITERAL_product||LA117_0==LITERAL_sum) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1202:51: rhs+= expressionOrAny
					{
					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8837);
					rhs=expressionOrAny();
					state._fsp--;

					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTemplate());
					}
					break;

				default :
					if ( cnt117 >= 1 ) break loop117;
					EarlyExitException eee = new EarlyExitException(117, input);
					throw eee;
				}
				cnt117++;
			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1203:5: -> simultaneous_assignment(l=$lhsr=$rhs)
			{
				retval.st = templateLib.getInstanceOf("simultaneous_assignment",new STAttrMap().put("l", list_lhs).put("r", list_rhs));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simultaneousAssignment"


	public static class whenThrow_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whenThrow"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1206:1: whenThrow : ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text);
	public final UnparseBLESS3.whenThrow_return whenThrow() throws RecognitionException {
		UnparseBLESS3.whenThrow_return retval = new UnparseBLESS3.whenThrow_return();
		retval.start = input.LT(1);

		BAST excep=null;
		BAST message=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1206:10: ( ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1207:3: ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8877); 
			match(input, Token.DOWN, null); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8879); 
			pushFollow(FOLLOW_expression_in_whenThrow8883);
			exp=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8885); 
			match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8887); 
			excep=(BAST)match(input,ID,FOLLOW_ID_in_whenThrow8891); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1208:14: (message= AADL_STRING_LITERAL )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==AADL_STRING_LITERAL) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1208:14: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8903); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1209:5: -> when_throw(e=$exp.sti=$excep.textm=$message.text)
			{
				retval.st = templateLib.getInstanceOf("when_throw",new STAttrMap().put("e", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("i", (excep!=null?excep.getText():null)).put("m", (message!=null?message.getText():null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenThrow"


	public static class combinableOperation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "combinableOperation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1212:1: combinableOperation : (fa= LITERAL_fetchadd -> {%{$fa.text}}|fo= LITERAL_fetchor -> {%{$fo.text}}|fan= LITERAL_fetchand -> {%{$fan.text}}|fx= LITERAL_fetchxor -> {%{$fx.text}}|sw= LITERAL_swap -> {%{$sw.text}});
	public final UnparseBLESS3.combinableOperation_return combinableOperation() throws RecognitionException {
		UnparseBLESS3.combinableOperation_return retval = new UnparseBLESS3.combinableOperation_return();
		retval.start = input.LT(1);

		BAST fa=null;
		BAST fo=null;
		BAST fan=null;
		BAST fx=null;
		BAST sw=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1212:20: (fa= LITERAL_fetchadd -> {%{$fa.text}}|fo= LITERAL_fetchor -> {%{$fo.text}}|fan= LITERAL_fetchand -> {%{$fan.text}}|fx= LITERAL_fetchxor -> {%{$fx.text}}|sw= LITERAL_swap -> {%{$sw.text}})
			int alt119=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt119=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt119=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt119=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt119=4;
				}
				break;
			case LITERAL_swap:
				{
				alt119=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}
			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1213:3: fa= LITERAL_fetchadd
					{
					fa=(BAST)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation8947); 
					// TEMPLATE REWRITE
					// 1214:4: -> {%{$fa.text}}
					{
						retval.st = new StringTemplate(templateLib,(fa!=null?fa.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1216:3: fo= LITERAL_fetchor
					{
					fo=(BAST)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation8964); 
					// TEMPLATE REWRITE
					// 1217:4: -> {%{$fo.text}}
					{
						retval.st = new StringTemplate(templateLib,(fo!=null?fo.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1219:3: fan= LITERAL_fetchand
					{
					fan=(BAST)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation8981); 
					// TEMPLATE REWRITE
					// 1220:4: -> {%{$fan.text}}
					{
						retval.st = new StringTemplate(templateLib,(fan!=null?fan.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1222:3: fx= LITERAL_fetchxor
					{
					fx=(BAST)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation8998); 
					// TEMPLATE REWRITE
					// 1223:4: -> {%{$fx.text}}
					{
						retval.st = new StringTemplate(templateLib,(fx!=null?fx.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1225:3: sw= LITERAL_swap
					{
					sw=(BAST)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation9015); 
					// TEMPLATE REWRITE
					// 1226:4: -> {%{$sw.text}}
					{
						retval.st = new StringTemplate(templateLib,(sw!=null?sw.getText():null));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "combinableOperation"


	public static class communicationAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "communicationAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1229:1: communicationAction : (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st});
	public final UnparseBLESS3.communicationAction_return communicationAction() throws RecognitionException {
		UnparseBLESS3.communicationAction_return retval = new UnparseBLESS3.communicationAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pc =null;
		TreeRuleReturnScope po =null;
		TreeRuleReturnScope pi =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1229:20: (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st})
			int alt120=3;
			switch ( input.LA(1) ) {
			case FUNCTION_CALL:
				{
				alt120=1;
				}
				break;
			case PORT_OUTPUT:
				{
				alt120=2;
				}
				break;
			case PORT_INPUT:
				{
				alt120=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1230:3: pc= subprogramCall
					{
					pushFollow(FOLLOW_subprogramCall_in_communicationAction9038);
					pc=subprogramCall();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1231:5: -> {$pc.st}
					{
						retval.st = (pc!=null?((StringTemplate)pc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1233:3: po= portOutput
					{
					pushFollow(FOLLOW_portOutput_in_communicationAction9056);
					po=portOutput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1234:5: -> {$po.st}
					{
						retval.st = (po!=null?((StringTemplate)po.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1236:3: pi= portInput
					{
					pushFollow(FOLLOW_portInput_in_communicationAction9074);
					pi=portInput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1237:5: -> {$pi.st}
					{
						retval.st = (pi!=null?((StringTemplate)pi.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "communicationAction"


	public static class portOutput_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portOutput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1240:1: portOutput : ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st);
	public final UnparseBLESS3.portOutput_return portOutput() throws RecognitionException {
		UnparseBLESS3.portOutput_return retval = new UnparseBLESS3.portOutput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope be =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1241:3: ( ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1242:3: ^( PORT_OUTPUT pn= ID (be= expression )? )
			{
			match(input,PORT_OUTPUT,FOLLOW_PORT_OUTPUT_in_portOutput9101); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portOutput9105); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1242:26: (be= expression )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==LITERAL_all||LA121_0==LITERAL_exists||LA121_0==LITERAL_iff||LA121_0==LITERAL_implies||LA121_0==LITERAL_numberof||LA121_0==LITERAL_product||LA121_0==LITERAL_sum) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1242:26: be= expression
					{
					pushFollow(FOLLOW_expression_in_portOutput9109);
					be=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1243:5: -> port_output(o=$pn.textbe=$be.st)
			{
				retval.st = templateLib.getInstanceOf("port_output",new STAttrMap().put("o", (pn!=null?pn.getText():null)).put("be", (be!=null?((StringTemplate)be.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portOutput"


	public static class portInput_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portInput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:1: portInput : ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st);
	public final UnparseBLESS3.portInput_return portInput() throws RecognitionException {
		UnparseBLESS3.portInput_return retval = new UnparseBLESS3.portInput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope n =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1247:3: ( ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1248:3: ^( PORT_INPUT pn= ID n= valueName )
			{
			match(input,PORT_INPUT,FOLLOW_PORT_INPUT_in_portInput9151); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portInput9155); 
			pushFollow(FOLLOW_valueName_in_portInput9159);
			n=valueName();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1249:5: -> port_input(i=$pn.textn=$n.st)
			{
				retval.st = templateLib.getInstanceOf("port_input",new STAttrMap().put("i", (pn!=null?pn.getText():null)).put("n", (n!=null?((StringTemplate)n.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portInput"


	public static class subprogramCall_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subprogramCall"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1253:1: subprogramCall : ^( FUNCTION_CALL id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st);
	public final UnparseBLESS3.subprogramCall_return subprogramCall() throws RecognitionException {
		UnparseBLESS3.subprogramCall_return retval = new UnparseBLESS3.subprogramCall_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope fal =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:3: ( ^( FUNCTION_CALL id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1255:3: ^( FUNCTION_CALL id= ID (fal= formalActualList )? )
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_subprogramCall9203); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_subprogramCall9207); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1255:29: (fal= formalActualList )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==AADL_STRING_LITERAL||LA122_0==COLON||LA122_0==COMMA||LA122_0==ID||LA122_0==LITERAL_false||LA122_0==LITERAL_null||LA122_0==LITERAL_true||LA122_0==LPAREN||(LA122_0 >= QUANTITY && LA122_0 <= QUESTION)||LA122_0==TICK) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1255:29: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall9211);
					fal=formalActualList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1256:5: -> function_call(f=$id.textpl=$fal.st)
			{
				retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (fal!=null?((StringTemplate)fal.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subprogramCall"


	public static class formalActualList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalActualList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1260:1: formalActualList : ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st});
	public final UnparseBLESS3.formalActualList_return formalActualList() throws RecognitionException {
		UnparseBLESS3.formalActualList_return retval = new UnparseBLESS3.formalActualList_return();
		retval.start = input.LT(1);

		List<Object> list_fa=null;
		TreeRuleReturnScope s =null;
		RuleReturnScope fa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1261:3: ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st})
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==COMMA) ) {
				alt124=1;
			}
			else if ( (LA124_0==AADL_STRING_LITERAL||LA124_0==COLON||LA124_0==ID||LA124_0==LITERAL_false||LA124_0==LITERAL_null||LA124_0==LITERAL_true||LA124_0==LPAREN||(LA124_0 >= QUANTITY && LA124_0 <= QUESTION)||LA124_0==TICK) ) {
				alt124=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}

			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1262:3: ^( COMMA (fa+= formalActual )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_formalActualList9256); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1262:14: (fa+= formalActual )+
					int cnt123=0;
					loop123:
					while (true) {
						int alt123=2;
						int LA123_0 = input.LA(1);
						if ( (LA123_0==AADL_STRING_LITERAL||LA123_0==COLON||LA123_0==ID||LA123_0==LITERAL_false||LA123_0==LITERAL_null||LA123_0==LITERAL_true||LA123_0==LPAREN||(LA123_0 >= QUANTITY && LA123_0 <= QUESTION)||LA123_0==TICK) ) {
							alt123=1;
						}

						switch (alt123) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1262:14: fa+= formalActual
							{
							pushFollow(FOLLOW_formalActual_in_formalActualList9260);
							fa=formalActual();
							state._fsp--;

							if (list_fa==null) list_fa=new ArrayList<Object>();
							list_fa.add(fa.getTemplate());
							}
							break;

						default :
							if ( cnt123 >= 1 ) break loop123;
							EarlyExitException eee = new EarlyExitException(123, input);
							throw eee;
						}
						cnt123++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1263:5: -> formal_actual_list(ns=$fa)
					{
						retval.st = templateLib.getInstanceOf("formal_actual_list",new STAttrMap().put("ns", list_fa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:3: s= formalActual
					{
					pushFollow(FOLLOW_formalActual_in_formalActualList9286);
					s=formalActual();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1266:5: -> {$s.st}
					{
						retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalActualList"


	public static class formalActual_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalActual"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1269:1: formalActual : ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter );
	public final UnparseBLESS3.formalActual_return formalActual() throws RecognitionException {
		UnparseBLESS3.formalActual_return retval = new UnparseBLESS3.formalActual_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;
		TreeRuleReturnScope spp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1270:3: ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter )
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==COLON) ) {
				alt125=1;
			}
			else if ( (LA125_0==AADL_STRING_LITERAL||LA125_0==ID||LA125_0==LITERAL_false||LA125_0==LITERAL_null||LA125_0==LITERAL_true||LA125_0==LPAREN||(LA125_0 >= QUANTITY && LA125_0 <= QUESTION)||LA125_0==TICK) ) {
				alt125=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}

			switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1271:3: ^( COLON formal= ID actual= subProgramParameter )
					{
					match(input,COLON,FOLLOW_COLON_in_formalActual9315); 
					match(input, Token.DOWN, null); 
					formal=(BAST)match(input,ID,FOLLOW_ID_in_formalActual9319); 
					pushFollow(FOLLOW_subProgramParameter_in_formalActual9323);
					actual=subProgramParameter();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1272:5: -> formal_actual(f=$formal.textap=$actual.st)
					{
						retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1274:3: spp= subProgramParameter
					{
					pushFollow(FOLLOW_subProgramParameter_in_formalActual9353);
					spp=subProgramParameter();
					state._fsp--;

					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalActual"


	public static class subProgramParameter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subProgramParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1277:1: subProgramParameter : (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.subProgramParameter_return subProgramParameter() throws RecognitionException {
		UnparseBLESS3.subProgramParameter_return retval = new UnparseBLESS3.subProgramParameter_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1277:20: (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt126=3;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt126=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt126=2;
				}
				break;
			case LPAREN:
				{
				alt126=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}
			switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1278:2: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_subProgramParameter9367);
					v=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1279:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1280:4: c= constant
					{
					pushFollow(FOLLOW_constant_in_subProgramParameter9382);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1281:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1282:4: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter9397);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1283:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subProgramParameter"


	public static class alternative_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alternative"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:1: alternative : ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt);
	public final UnparseBLESS3.alternative_return alternative() throws RecognitionException {
		UnparseBLESS3.alternative_return retval = new UnparseBLESS3.alternative_return();
		retval.start = input.LT(1);

		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1287:3: ( ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1288:3: ^( LITERAL_if (alt+= guardedAction )+ )
			{
			match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative9425); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1288:20: (alt+= guardedAction )+
			int cnt127=0;
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==GUARD) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1288:20: alt+= guardedAction
					{
					pushFollow(FOLLOW_guardedAction_in_alternative9429);
					alt=guardedAction();
					state._fsp--;

					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTemplate());
					}
					break;

				default :
					if ( cnt127 >= 1 ) break loop127;
					EarlyExitException eee = new EarlyExitException(127, input);
					throw eee;
				}
				cnt127++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1289:5: -> alternative(gf=$alt)
			{
				retval.st = templateLib.getInstanceOf("alternative",new STAttrMap().put("gf", list_alt));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternative"


	public static class guardedAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "guardedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:1: guardedAction : ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st);
	public final UnparseBLESS3.guardedAction_return guardedAction() throws RecognitionException {
		UnparseBLESS3.guardedAction_return retval = new UnparseBLESS3.guardedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope aa =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1293:3: ( ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1294:3: ^( GUARD exp= expression aa= assertedAction )
			{
			match(input,GUARD,FOLLOW_GUARD_in_guardedAction9466); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_guardedAction9470);
			exp=expression();
			state._fsp--;

			pushFollow(FOLLOW_assertedAction_in_guardedAction9474);
			aa=assertedAction();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1295:5: -> guarded_action(be=$exp.stba=$aa.st)
			{
				retval.st = templateLib.getInstanceOf("guarded_action",new STAttrMap().put("be", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("ba", (aa!=null?((StringTemplate)aa.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "guardedAction"


	public static class whileLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whileLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1298:1: whileLoop : ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.whileLoop_return whileLoop() throws RecognitionException {
		UnparseBLESS3.whileLoop_return retval = new UnparseBLESS3.whileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1299:3: ( ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1300:3: ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop9513); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileLoop9517);
			be=expression();
			state._fsp--;

			match(input,INVARIANT,FOLLOW_INVARIANT_in_whileLoop9521); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1300:50: (inv= assertion )?
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==ASSERTION||(LA128_0 >= ASSERTION_ENUMERATION && LA128_0 <= ASSERTION_FUNCTION)) ) {
					alt128=1;
				}
				switch (alt128) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1300:50: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop9525);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_whileLoop9532); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1300:75: (bd= assertion )?
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==ASSERTION||(LA129_0 >= ASSERTION_ENUMERATION && LA129_0 <= ASSERTION_FUNCTION)) ) {
					alt129=1;
				}
				switch (alt129) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1300:75: bd= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop9536);
						bd=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop9550);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1302:5: -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("while_loop",new STAttrMap().put("be", (be!=null?((StringTemplate)be.getTemplate()):null)).put("elq", (elq!=null?((StringTemplate)elq.getTemplate()):null)).put("bd", (bd!=null?((StringTemplate)bd.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class forLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:1: forLoop : ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st);
	public final UnparseBLESS3.forLoop_return forLoop() throws RecognitionException {
		UnparseBLESS3.forLoop_return retval = new UnparseBLESS3.forLoop_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1306:3: ( ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1307:3: ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop9599); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_forLoop9603); 
			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop9607); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_forLoop9611);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forLoop9615);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_forLoop9621); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1307:84: (inv= assertion )?
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==ASSERTION||(LA130_0 >= ASSERTION_ENUMERATION && LA130_0 <= ASSERTION_FUNCTION)) ) {
					alt130=1;
				}
				switch (alt130) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1307:84: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_forLoop9625);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_forLoop9639);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1309:5: -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("for_loop",new STAttrMap().put("a", (id!=null?id.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class doUntilLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "doUntilLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1312:1: doUntilLoop : ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.doUntilLoop_return doUntilLoop() throws RecognitionException {
		UnparseBLESS3.doUntilLoop_return retval = new UnparseBLESS3.doUntilLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1313:3: ( ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1314:3: ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9694); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9698); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_doUntilLoop9702);
			be=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_doUntilLoop9708); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1314:66: (inv= assertion )?
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==ASSERTION||(LA131_0 >= ASSERTION_ENUMERATION && LA131_0 <= ASSERTION_FUNCTION)) ) {
					alt131=1;
				}
				switch (alt131) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1314:66: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop9712);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_doUntilLoop9719); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1314:91: (bd= assertion )?
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==ASSERTION||(LA132_0 >= ASSERTION_ENUMERATION && LA132_0 <= ASSERTION_FUNCTION)) ) {
					alt132=1;
				}
				switch (alt132) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1314:91: bd= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop9723);
						bd=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9736);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1316:5: -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("do_until",new STAttrMap().put("be", (be!=null?((StringTemplate)be.getTemplate()):null)).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)).put("bd", (bd!=null?((StringTemplate)bd.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doUntilLoop"


	public static class universalLatticeQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "universalLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1319:1: universalLatticeQuantification : ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st);
	public final UnparseBLESS3.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.universalLatticeQuantification_return retval = new UnparseBLESS3.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST lv=null;
		List<Object> list_lv=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1320:3: ( ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1321:3: ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9789); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1321:23: (lv+= ID )+
			int cnt133=0;
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==ID) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1321:23: lv+= ID
					{
					lv=(BAST)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9793); 
					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt133 >= 1 ) break loop133;
					EarlyExitException eee = new EarlyExitException(133, input);
					throw eee;
				}
				cnt133++;
			}

			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9798); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9802);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9806);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9812);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1322:5: -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st)
			{
				retval.st = templateLib.getInstanceOf("ulq",new STAttrMap().put("lv", list_lv).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("elq", (elq!=null?((StringTemplate)elq.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalLatticeQuantification"


	public static class blessSubclause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "blessSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1328:1: blessSubclause : ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st);
	public final UnparseBLESS3.blessSubclause_return blessSubclause() throws RecognitionException {
		UnparseBLESS3.blessSubclause_return retval = new UnparseBLESS3.blessSubclause_return();
		retval.start = input.LT(1);

		BAST no_proof=null;
		TreeRuleReturnScope ac =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope vs =null;
		TreeRuleReturnScope ss =null;
		TreeRuleReturnScope t =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:3: ( ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1330:3: ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? )
			{
			match(input,BLESS_SUBCLAUSE,FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause9862); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:12: (no_proof= DO_NOT_PROVE )?
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==DO_NOT_PROVE) ) {
					alt134=1;
				}
				switch (alt134) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:12: no_proof= DO_NOT_PROVE
						{
						no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9870); 
						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:7: (ac= assertClause )?
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==LITERAL_assert) ) {
					alt135=1;
				}
				switch (alt135) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:7: ac= assertClause
						{
						pushFollow(FOLLOW_assertClause_in_blessSubclause9879);
						ac=assertClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1333:8: (inv= invariantClause )?
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==LITERAL_invariant) ) {
					alt136=1;
				}
				switch (alt136) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1333:8: inv= invariantClause
						{
						pushFollow(FOLLOW_invariantClause_in_blessSubclause9890);
						inv=invariantClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1334:7: (vs= variablesSection )?
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==LITERAL_variables) ) {
					alt137=1;
				}
				switch (alt137) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1334:7: vs= variablesSection
						{
						pushFollow(FOLLOW_variablesSection_in_blessSubclause9899);
						vs=variablesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1335:7: (ss= statesSection )?
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==LITERAL_states) ) {
					alt138=1;
				}
				switch (alt138) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1335:7: ss= statesSection
						{
						pushFollow(FOLLOW_statesSection_in_blessSubclause9908);
						ss=statesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1336:6: (t= transitions )?
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==LITERAL_transitions) ) {
					alt139=1;
				}
				switch (alt139) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1336:6: t= transitions
						{
						pushFollow(FOLLOW_transitions_in_blessSubclause9917);
						t=transitions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1337:5: -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st)
			{
				retval.st = templateLib.getInstanceOf("bless_subclause",new STAttrMap().put("n", (no_proof!=null?no_proof.getText():null)).put("ac", (ac!=null?((StringTemplate)ac.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)).put("vs", (vs!=null?((StringTemplate)vs.getTemplate()):null)).put("ss", (ss!=null?((StringTemplate)ss.getTemplate()):null)).put("t", (t!=null?((StringTemplate)t.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blessSubclause"


	public static class invariantClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "invariantClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1340:1: invariantClause : ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st);
	public final UnparseBLESS3.invariantClause_return invariantClause() throws RecognitionException {
		UnparseBLESS3.invariantClause_return retval = new UnparseBLESS3.invariantClause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1341:3: ( ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1342:3: ^( LITERAL_invariant a= assertion )
			{
			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9979); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assertion_in_invariantClause9983);
			a=assertion();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1343:5: -> invariant_clause(a=$a.st)
			{
				retval.st = templateLib.getInstanceOf("invariant_clause",new STAttrMap().put("a", (a!=null?((StringTemplate)a.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invariantClause"


	public static class variablesSection_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variablesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1346:1: variablesSection : ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd);
	public final UnparseBLESS3.variablesSection_return variablesSection() throws RecognitionException {
		UnparseBLESS3.variablesSection_return retval = new UnparseBLESS3.variablesSection_return();
		retval.start = input.LT(1);

		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1347:3: ( ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1348:2: ^( LITERAL_variables (vd+= variableDeclaration )+ )
			{
			match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection10015); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1348:25: (vd+= variableDeclaration )+
			int cnt140=0;
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==VARIABLE_DECLARATION) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1348:25: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection10019);
					vd=variableDeclaration();
					state._fsp--;

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTemplate());
					}
					break;

				default :
					if ( cnt140 >= 1 ) break loop140;
					EarlyExitException eee = new EarlyExitException(140, input);
					throw eee;
				}
				cnt140++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1349:4: -> variables(bv=$vd)
			{
				retval.st = templateLib.getInstanceOf("variables",new STAttrMap().put("bv", list_vd));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variablesSection"


	public static class statesSection_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1352:1: statesSection : ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states);
	public final UnparseBLESS3.statesSection_return statesSection() throws RecognitionException {
		UnparseBLESS3.statesSection_return retval = new UnparseBLESS3.statesSection_return();
		retval.start = input.LT(1);

		List<Object> list_states=null;
		RuleReturnScope states = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1353:3: ( ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1354:2: ^( LITERAL_states (states+= behaviorState )+ )
			{
			match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection10050); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1354:26: (states+= behaviorState )+
			int cnt141=0;
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==LITERAL_state) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1354:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection10054);
					states=behaviorState();
					state._fsp--;

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTemplate());
					}
					break;

				default :
					if ( cnt141 >= 1 ) break loop141;
					EarlyExitException eee = new EarlyExitException(141, input);
					throw eee;
				}
				cnt141++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1355:4: -> states_section(bs=$states)
			{
				retval.st = templateLib.getInstanceOf("states_section",new STAttrMap().put("bs", list_states));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statesSection"


	public static class behaviorState_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorState"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:1: behaviorState : ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st);
	public final UnparseBLESS3.behaviorState_return behaviorState() throws RecognitionException {
		UnparseBLESS3.behaviorState_return retval = new UnparseBLESS3.behaviorState_return();
		retval.start = input.LT(1);

		BAST init=null;
		BAST com=null;
		BAST finl=null;
		BAST i=null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1359:3: ( ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:3: ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? )
			{
			match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState10086); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:24: (init= LITERAL_initial )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==LITERAL_initial) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:24: init= LITERAL_initial
					{
					init=(BAST)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState10090); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:45: (com= LITERAL_complete )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==LITERAL_complete) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:45: com= LITERAL_complete
					{
					com=(BAST)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState10095); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:68: (finl= LITERAL_final )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LITERAL_final) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:68: finl= LITERAL_final
					{
					finl=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState10100); 
					}
					break;

			}

			i=(BAST)match(input,ID,FOLLOW_ID_in_behaviorState10105); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:90: (a= assertion )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==ASSERTION||(LA145_0 >= ASSERTION_ENUMERATION && LA145_0 <= ASSERTION_FUNCTION)) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:90: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState10109);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1361:5: -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st)
			{
				retval.st = templateLib.getInstanceOf("behavior_state",new STAttrMap().put("bsi", (i!=null?i.getText():null)).put("i", (init!=null?init.getText():null)).put("com", (com!=null?com.getText():null)).put("finl", (finl!=null?finl.getText():null)).put("a", (a!=null?((StringTemplate)a.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorState"


	public static class transitions_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "transitions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1364:1: transitions : ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt);
	public final UnparseBLESS3.transitions_return transitions() throws RecognitionException {
		UnparseBLESS3.transitions_return retval = new UnparseBLESS3.transitions_return();
		retval.start = input.LT(1);

		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:3: ( ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:3: ^( LITERAL_transitions (bt+= behaviorTransition )+ )
			{
			match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions10164); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:28: (bt+= behaviorTransition )+
			int cnt146=0;
			loop146:
			while (true) {
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==TRANSITION) ) {
					alt146=1;
				}

				switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:28: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions10168);
					bt=behaviorTransition();
					state._fsp--;

					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTemplate());
					}
					break;

				default :
					if ( cnt146 >= 1 ) break loop146;
					EarlyExitException eee = new EarlyExitException(146, input);
					throw eee;
				}
				cnt146++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1367:5: -> transitions(bt=$bt)
			{
				retval.st = templateLib.getInstanceOf("transitions",new STAttrMap().put("bt", list_bt));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transitions"


	public static class behaviorTransition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorTransition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:1: behaviorTransition : ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st);
	public final UnparseBLESS3.behaviorTransition_return behaviorTransition() throws RecognitionException {
		UnparseBLESS3.behaviorTransition_return retval = new UnparseBLESS3.behaviorTransition_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST dsi=null;
		BAST ssi=null;
		List<Object> list_ssi=null;
		TreeRuleReturnScope pr =null;
		TreeRuleReturnScope bc =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope q =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1371:3: ( ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:3: ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) )
			{
			match(input,TRANSITION,FOLLOW_TRANSITION_in_behaviorTransition10201); 
			match(input, Token.DOWN, null); 
			match(input,LABEL,FOLLOW_LABEL_in_behaviorTransition10205); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10209); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:34: (pr= priority )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==LBRACKET) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:34: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition10213);
					pr=priority();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input,SOURCE,FOLLOW_SOURCE_in_behaviorTransition10220); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:60: (ssi+= ID )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==ID) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:60: ssi+= ID
					{
					ssi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10224); 
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi);
					}
					break;

				default :
					if ( cnt148 >= 1 ) break loop148;
					EarlyExitException eee = new EarlyExitException(148, input);
					throw eee;
				}
				cnt148++;
			}

			match(input, Token.UP, null); 

			match(input,CONDITION,FOLLOW_CONDITION_in_behaviorTransition10236); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1373:20: (bc= behaviorCondition )?
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==LITERAL_all||LA149_0==LITERAL_dispatch||LA149_0==LITERAL_exists||LA149_0==LITERAL_iff||LA149_0==LITERAL_implies||LA149_0==LITERAL_internal||LA149_0==LITERAL_numberof||LA149_0==LITERAL_on||LA149_0==LITERAL_product||LA149_0==LITERAL_sum) ) {
					alt149=1;
				}
				switch (alt149) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1373:20: bc= behaviorCondition
						{
						pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition10240);
						bc=behaviorCondition();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,DESTINATION,FOLLOW_DESTINATION_in_behaviorTransition10247); 
			match(input, Token.DOWN, null); 
			dsi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10251); 
			match(input, Token.UP, null); 

			match(input,ACTION,FOLLOW_ACTION_in_behaviorTransition10261); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1374:16: (s= behaviorActions )?
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==ACTION||LA150_0==AMPERSAND||LA150_0==SEMICOLON) ) {
					alt150=1;
				}
				switch (alt150) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1374:16: s= behaviorActions
						{
						pushFollow(FOLLOW_behaviorActions_in_behaviorTransition10265);
						s=behaviorActions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,Q,FOLLOW_Q_in_behaviorTransition10272); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1374:42: (q= assertion )?
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==ASSERTION||(LA151_0 >= ASSERTION_ENUMERATION && LA151_0 <= ASSERTION_FUNCTION)) ) {
					alt151=1;
				}
				switch (alt151) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1374:42: q= assertion
						{
						pushFollow(FOLLOW_assertion_in_behaviorTransition10276);
						q=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1375:5: -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st)
			{
				retval.st = templateLib.getInstanceOf("behavior_transition",new STAttrMap().put("id", (id!=null?id.getText():null)).put("pr", (pr!=null?((StringTemplate)pr.getTemplate()):null)).put("ssi", list_ssi).put("bc", (bc!=null?((StringTemplate)bc.getTemplate()):null)).put("dsi", (dsi!=null?dsi.getText():null)).put("ba", (s!=null?((StringTemplate)s.getTemplate()):null)).put("btq", (q!=null?((StringTemplate)q.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTransition"


	public static class priority_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "priority"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1379:1: priority : ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text);
	public final UnparseBLESS3.priority_return priority() throws RecognitionException {
		UnparseBLESS3.priority_return retval = new UnparseBLESS3.priority_return();
		retval.start = input.LT(1);

		BAST num=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1380:3: ( ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1381:2: ^( LBRACKET num= NUMBER RBRACKET )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_priority10348); 
			match(input, Token.DOWN, null); 
			num=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_priority10352); 
			match(input,RBRACKET,FOLLOW_RBRACKET_in_priority10354); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1382:4: -> priority(num=$num.text)
			{
				retval.st = templateLib.getInstanceOf("priority",new STAttrMap().put("num", (num!=null?num.getText():null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "priority"


	public static class behaviorCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1385:1: behaviorCondition : (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st});
	public final UnparseBLESS3.behaviorCondition_return behaviorCondition() throws RecognitionException {
		UnparseBLESS3.behaviorCondition_return retval = new UnparseBLESS3.behaviorCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope dc =null;
		TreeRuleReturnScope ec =null;
		TreeRuleReturnScope mc =null;
		TreeRuleReturnScope ic =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1386:3: (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st})
			int alt152=4;
			switch ( input.LA(1) ) {
			case LITERAL_dispatch:
				{
				alt152=1;
				}
				break;
			case LITERAL_all:
			case LITERAL_exists:
			case LITERAL_iff:
			case LITERAL_implies:
			case LITERAL_numberof:
			case LITERAL_product:
			case LITERAL_sum:
				{
				alt152=2;
				}
				break;
			case LITERAL_on:
				{
				alt152=3;
				}
				break;
			case LITERAL_internal:
				{
				alt152=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 152, 0, input);
				throw nvae;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1387:3: dc= dispatchCondition
					{
					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition10385);
					dc=dispatchCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1388:5: -> {$dc.st}
					{
						retval.st = (dc!=null?((StringTemplate)dc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1389:5: ec= executeCondition
					{
					pushFollow(FOLLOW_executeCondition_in_behaviorCondition10402);
					ec=executeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1390:5: -> {$ec.st}
					{
						retval.st = (ec!=null?((StringTemplate)ec.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:5: mc= modeCondition
					{
					pushFollow(FOLLOW_modeCondition_in_behaviorCondition10420);
					mc=modeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1392:5: -> {$mc.st}
					{
						retval.st = (mc!=null?((StringTemplate)mc.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1393:5: ic= internalCondition
					{
					pushFollow(FOLLOW_internalCondition_in_behaviorCondition10438);
					ic=internalCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1394:5: -> {$ic.st}
					{
						retval.st = (ic!=null?((StringTemplate)ic.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorCondition"


	public static class dispatchCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1397:1: dispatchCondition : ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st);
	public final UnparseBLESS3.dispatchCondition_return dispatchCondition() throws RecognitionException {
		UnparseBLESS3.dispatchCondition_return retval = new UnparseBLESS3.dispatchCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope de =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1398:3: ( ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:3: ^( LITERAL_dispatch (de= dispatchExpression )? )
			{
			match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition10466); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:25: (de= dispatchExpression )?
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==ID||LA153_0==LITERAL_and||LA153_0==LITERAL_or||LA153_0==LITERAL_timeout) ) {
					alt153=1;
				}
				switch (alt153) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:25: de= dispatchExpression
						{
						pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition10470);
						de=dispatchExpression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1400:5: -> dispatch_condition(dle=$de.st)
			{
				retval.st = templateLib.getInstanceOf("dispatch_condition",new STAttrMap().put("dle", (de!=null?((StringTemplate)de.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchCondition"


	public static class executeCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "executeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1403:1: executeCondition : expression ;
	public final UnparseBLESS3.executeCondition_return executeCondition() throws RecognitionException {
		UnparseBLESS3.executeCondition_return retval = new UnparseBLESS3.executeCondition_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:3: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:3: expression
			{
			pushFollow(FOLLOW_expression_in_executeCondition10505);
			expression();
			state._fsp--;

			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "executeCondition"


	public static class modeCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "modeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1408:1: modeCondition : ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st);
	public final UnparseBLESS3.modeCondition_return modeCondition() throws RecognitionException {
		UnparseBLESS3.modeCondition_return retval = new UnparseBLESS3.modeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1409:3: ( ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1410:3: ^( LITERAL_on tle= triggerLogicalExpression )
			{
			match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10526); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10530);
			tle=triggerLogicalExpression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1411:5: -> mode_condition(tle=$tle.st)
			{
				retval.st = templateLib.getInstanceOf("mode_condition",new STAttrMap().put("tle", (tle!=null?((StringTemplate)tle.getTemplate()):null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modeCondition"


	public static class internalCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "internalCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1414:1: internalCondition : ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports);
	public final UnparseBLESS3.internalCondition_return internalCondition() throws RecognitionException {
		UnparseBLESS3.internalCondition_return retval = new UnparseBLESS3.internalCondition_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1415:3: ( ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1416:3: ^( LITERAL_internal (ports+= ID )+ )
			{
			match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10564); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1416:28: (ports+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1416:28: ports+= ID
					{
					ports=(BAST)match(input,ID,FOLLOW_ID_in_internalCondition10568); 
					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					if ( cnt154 >= 1 ) break loop154;
					EarlyExitException eee = new EarlyExitException(154, input);
					throw eee;
				}
				cnt154++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1417:5: -> internal_condition(p=$ports)
			{
				retval.st = templateLib.getInstanceOf("internal_condition",new STAttrMap().put("p", list_ports));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "internalCondition"


	public static class dispatchExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1420:1: dispatchExpression : ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st});
	public final UnparseBLESS3.dispatchExpression_return dispatchExpression() throws RecognitionException {
		UnparseBLESS3.dispatchExpression_return retval = new UnparseBLESS3.dispatchExpression_return();
		retval.start = input.LT(1);

		List<Object> list_dc=null;
		TreeRuleReturnScope c =null;
		RuleReturnScope dc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1421:3: ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st})
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LITERAL_or) ) {
				alt156=1;
			}
			else if ( (LA156_0==ID||LA156_0==LITERAL_and||LA156_0==LITERAL_timeout) ) {
				alt156=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 156, 0, input);
				throw nvae;
			}

			switch (alt156) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1422:3: ^( LITERAL_or (dc+= dispatchConjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10604); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1422:19: (dc+= dispatchConjunction )+
					int cnt155=0;
					loop155:
					while (true) {
						int alt155=2;
						int LA155_0 = input.LA(1);
						if ( (LA155_0==ID||LA155_0==LITERAL_and||LA155_0==LITERAL_timeout) ) {
							alt155=1;
						}

						switch (alt155) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1422:19: dc+= dispatchConjunction
							{
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10608);
							dc=dispatchConjunction();
							state._fsp--;

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTemplate());
							}
							break;

						default :
							if ( cnt155 >= 1 ) break loop155;
							EarlyExitException eee = new EarlyExitException(155, input);
							throw eee;
						}
						cnt155++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1423:5: -> disjunction(bopt=$dc)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_dc));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1425:3: c= dispatchConjunction
					{
					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10634);
					c=dispatchConjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1426:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchExpression"


	public static class dispatchConjunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchConjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1429:1: dispatchConjunction : ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st});
	public final UnparseBLESS3.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		UnparseBLESS3.dispatchConjunction_return retval = new UnparseBLESS3.dispatchConjunction_return();
		retval.start = input.LT(1);

		List<Object> list_tr=null;
		TreeRuleReturnScope t =null;
		RuleReturnScope tr = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:3: ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st})
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==LITERAL_and) ) {
				alt158=1;
			}
			else if ( (LA158_0==ID||LA158_0==LITERAL_timeout) ) {
				alt158=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}

			switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1431:3: ^( LITERAL_and (tr+= dispatchTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10665); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1431:20: (tr+= dispatchTrigger )+
					int cnt157=0;
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==ID||LA157_0==LITERAL_timeout) ) {
							alt157=1;
						}

						switch (alt157) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1431:20: tr+= dispatchTrigger
							{
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10669);
							tr=dispatchTrigger();
							state._fsp--;

							if (list_tr==null) list_tr=new ArrayList<Object>();
							list_tr.add(tr.getTemplate());
							}
							break;

						default :
							if ( cnt157 >= 1 ) break loop157;
							EarlyExitException eee = new EarlyExitException(157, input);
							throw eee;
						}
						cnt157++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1432:5: -> conjunction(bopt=$tr)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_tr));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1434:3: t= dispatchTrigger
					{
					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10695);
					t=dispatchTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1435:5: -> {$t.st}
					{
						retval.st = (t!=null?((StringTemplate)t.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchConjunction"


	public static class dispatchTrigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1438:1: dispatchTrigger : (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports));
	public final UnparseBLESS3.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		UnparseBLESS3.dispatchTrigger_return retval = new UnparseBLESS3.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;
		TreeRuleReturnScope port =null;
		TreeRuleReturnScope time =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1439:3: (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports))
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==ID) ) {
				alt162=1;
			}
			else if ( (LA162_0==LITERAL_timeout) ) {
				alt162=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 162, 0, input);
				throw nvae;
			}

			switch (alt162) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:3: port= portName
					{
					pushFollow(FOLLOW_portName_in_dispatchTrigger10721);
					port=portName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1441:5: -> {$port.st}
					{
						retval.st = (port!=null?((StringTemplate)port.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:3: ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? )
					{
					match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger10739); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:22: ( ^( LPAREN (ports+= ID )* ) )?
						int alt160=2;
						int LA160_0 = input.LA(1);
						if ( (LA160_0==LPAREN) ) {
							int LA160_1 = input.LA(2);
							if ( (LA160_1==DOWN) ) {
								int LA160_3 = input.LA(3);
								if ( (LA160_3==UP||LA160_3==ID) ) {
									alt160=1;
								}
							}
						}
						switch (alt160) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:24: ^( LPAREN (ports+= ID )* )
								{
								match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger10745); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:39: (ports+= ID )*
									loop159:
									while (true) {
										int alt159=2;
										int LA159_0 = input.LA(1);
										if ( (LA159_0==ID) ) {
											alt159=1;
										}

										switch (alt159) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:39: ports+= ID
											{
											ports=(BAST)match(input,ID,FOLLOW_ID_in_dispatchTrigger10749); 
											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop159;
										}
									}

									match(input, Token.UP, null); 
								}

								}
								break;

						}

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:54: (time= behaviorTime )?
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==ID||LA161_0==LPAREN||(LA161_0 >= QUANTITY && LA161_0 <= QUESTION)||LA161_0==TICK) ) {
							alt161=1;
						}
						switch (alt161) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:54: time= behaviorTime
								{
								pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10759);
								time=behaviorTime();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 1444:5: -> timeout(bt=$time.stp=$ports)
					{
						retval.st = templateLib.getInstanceOf("timeout",new STAttrMap().put("bt", (time!=null?((StringTemplate)time.getTemplate()):null)).put("p", list_ports));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchTrigger"


	public static class behaviorTime_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorTime"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1447:1: behaviorTime : (q= quantity -> {$q.st}|vn= valueName -> {$vn.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.behaviorTime_return behaviorTime() throws RecognitionException {
		UnparseBLESS3.behaviorTime_return retval = new UnparseBLESS3.behaviorTime_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope q =null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1447:13: (q= quantity -> {$q.st}|vn= valueName -> {$vn.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt163=3;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt163=1;
				}
				break;
			case ID:
			case QUESTION:
			case TICK:
				{
				alt163=2;
				}
				break;
			case LPAREN:
				{
				alt163=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 163, 0, input);
				throw nvae;
			}
			switch (alt163) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1448:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_behaviorTime10793);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1449:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1450:5: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime10809);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1451:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1452:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_behaviorTime10825);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1453:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTime"


	public static class portName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1456:1: portName : ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text);
	public final UnparseBLESS3.portName_return portName() throws RecognitionException {
		UnparseBLESS3.portName_return retval = new UnparseBLESS3.portName_return();
		retval.start = input.LT(1);

		BAST port=null;
		BAST index=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1457:3: ( ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1458:3: ^(port= ID (index= NUMBER )? )
			{
			port=(BAST)match(input,ID,FOLLOW_ID_in_portName10853); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1458:19: (index= NUMBER )?
				int alt164=2;
				int LA164_0 = input.LA(1);
				if ( (LA164_0==NUMBER) ) {
					alt164=1;
				}
				switch (alt164) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1458:19: index= NUMBER
						{
						index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_portName10857); 
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1459:5: -> port_name(port=$port.textindex=$index.text)
			{
				retval.st = templateLib.getInstanceOf("port_name",new STAttrMap().put("port", (port!=null?port.getText():null)).put("index", (index!=null?index.getText():null)));
			}



			}

		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portName"


	public static class triggerLogicalExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "triggerLogicalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1462:1: triggerLogicalExpression : ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st});
	public final UnparseBLESS3.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		UnparseBLESS3.triggerLogicalExpression_return retval = new UnparseBLESS3.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		List<Object> list_et=null;
		TreeRuleReturnScope first =null;
		RuleReturnScope et = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1463:3: ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st})
			int alt170=6;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt170=1;
				}
				break;
			case LITERAL_or:
				{
				alt170=2;
				}
				break;
			case LITERAL_xor:
				{
				alt170=3;
				}
				break;
			case LITERAL_then:
				{
				alt170=4;
				}
				break;
			case LITERAL_else:
				{
				alt170=5;
				}
				break;
			case LPAREN:
			case TRIGGER:
				{
				alt170=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 170, 0, input);
				throw nvae;
			}
			switch (alt170) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1464:3: ^( LITERAL_and (et+= eventTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_triggerLogicalExpression10894); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1464:20: (et+= eventTrigger )+
					int cnt165=0;
					loop165:
					while (true) {
						int alt165=2;
						int LA165_0 = input.LA(1);
						if ( (LA165_0==LPAREN||LA165_0==TRIGGER) ) {
							alt165=1;
						}

						switch (alt165) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1464:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10898);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt165 >= 1 ) break loop165;
							EarlyExitException eee = new EarlyExitException(165, input);
							throw eee;
						}
						cnt165++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1465:5: -> conjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1467:3: ^( LITERAL_or (et+= eventTrigger )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_triggerLogicalExpression10925); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1467:19: (et+= eventTrigger )+
					int cnt166=0;
					loop166:
					while (true) {
						int alt166=2;
						int LA166_0 = input.LA(1);
						if ( (LA166_0==LPAREN||LA166_0==TRIGGER) ) {
							alt166=1;
						}

						switch (alt166) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1467:19: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10929);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt166 >= 1 ) break loop166;
							EarlyExitException eee = new EarlyExitException(166, input);
							throw eee;
						}
						cnt166++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1468:5: -> disjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1470:3: ^( LITERAL_xor (et+= eventTrigger )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_triggerLogicalExpression10956); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1470:20: (et+= eventTrigger )+
					int cnt167=0;
					loop167:
					while (true) {
						int alt167=2;
						int LA167_0 = input.LA(1);
						if ( (LA167_0==LPAREN||LA167_0==TRIGGER) ) {
							alt167=1;
						}

						switch (alt167) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1470:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10960);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt167 >= 1 ) break loop167;
							EarlyExitException eee = new EarlyExitException(167, input);
							throw eee;
						}
						cnt167++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1471:5: -> xor(terms=$et)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_et));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1473:3: ^( LITERAL_then (et+= eventTrigger )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_triggerLogicalExpression10987); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1473:21: (et+= eventTrigger )+
					int cnt168=0;
					loop168:
					while (true) {
						int alt168=2;
						int LA168_0 = input.LA(1);
						if ( (LA168_0==LPAREN||LA168_0==TRIGGER) ) {
							alt168=1;
						}

						switch (alt168) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1473:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10991);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt168 >= 1 ) break loop168;
							EarlyExitException eee = new EarlyExitException(168, input);
							throw eee;
						}
						cnt168++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1474:5: -> cand(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:3: ^( LITERAL_else (et+= eventTrigger )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_triggerLogicalExpression11018); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:21: (et+= eventTrigger )+
					int cnt169=0;
					loop169:
					while (true) {
						int alt169=2;
						int LA169_0 = input.LA(1);
						if ( (LA169_0==LPAREN||LA169_0==TRIGGER) ) {
							alt169=1;
						}

						switch (alt169) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11022);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt169 >= 1 ) break loop169;
							EarlyExitException eee = new EarlyExitException(169, input);
							throw eee;
						}
						cnt169++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1477:5: -> cor(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1479:3: first= eventTrigger
					{
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11048);
					first=eventTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1480:5: -> {$first.st}
					{
						retval.st = (first!=null?((StringTemplate)first.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerLogicalExpression"


	public static class eventTrigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "eventTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1483:1: eventTrigger : (tr= TRIGGER -> {%{$tr.text}}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st));
	public final UnparseBLESS3.eventTrigger_return eventTrigger() throws RecognitionException {
		UnparseBLESS3.eventTrigger_return retval = new UnparseBLESS3.eventTrigger_return();
		retval.start = input.LT(1);

		BAST tr=null;
		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1484:3: (tr= TRIGGER -> {%{$tr.text}}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st))
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==TRIGGER) ) {
				alt171=1;
			}
			else if ( (LA171_0==LPAREN) ) {
				alt171=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 171, 0, input);
				throw nvae;
			}

			switch (alt171) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1485:3: tr= TRIGGER
					{
					tr=(BAST)match(input,TRIGGER,FOLLOW_TRIGGER_in_eventTrigger11073); 
					// TEMPLATE REWRITE
					// 1486:5: -> {%{$tr.text}}
					{
						retval.st = new StringTemplate(templateLib,(tr!=null?tr.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1488:3: ^( LPAREN tle= triggerLogicalExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger11092); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger11096);
					tle=triggerLogicalExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger11098); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1489:5: -> parentheses(be=$tle.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (tle!=null?((StringTemplate)tle.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (RecognitionException re) 
			{
			countRecognitionErrors++;
			Dump.it("recognition error #"+countRecognitionErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		  {
		  Dump.it("retval.getClass()="+retval.getClass());
		  if (retval.start==null)
		    Dump.it("null retval.start");
		  else if (retval.start instanceof BAST)
			BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
			  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			else
			  {
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
			}
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "eventTrigger"

	// Delegated rules


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA14 dfa14 = new DFA14(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA78 dfa78 = new DFA78(this);
	static final String DFA6_eotS =
		"\7\uffff";
	static final String DFA6_eofS =
		"\7\uffff";
	static final String DFA6_minS =
		"\1\u0123\1\2\1\51\1\uffff\1\3\2\uffff";
	static final String DFA6_maxS =
		"\1\u0123\1\2\1\76\1\uffff\1\76\2\uffff";
	static final String DFA6_acceptS =
		"\3\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA6_specialS =
		"\7\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\24\uffff\1\4",
			"",
			"\1\5\45\uffff\1\6\24\uffff\1\4",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "232:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom));";
		}
	}

	static final String DFA14_eotS =
		"\12\uffff";
	static final String DFA14_eofS =
		"\12\uffff";
	static final String DFA14_minS =
		"\1\37\1\2\1\u0125\1\2\1\76\2\3\1\51\2\uffff";
	static final String DFA14_maxS =
		"\1\37\1\2\1\u0125\1\2\3\76\1\u011a\2\uffff";
	static final String DFA14_acceptS =
		"\10\uffff\1\1\1\2";
	static final String DFA14_specialS =
		"\12\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3",
			"\1\4",
			"\1\5",
			"\1\7\72\uffff\1\6",
			"\1\7\72\uffff\1\6",
			"\1\11\u00f0\uffff\1\10",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "264:1: unitFactor : ( ^( COMMA unit= unitName t= TIMES factor= NUMBER ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= NUMBER ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text));";
		}
	}

	static final String DFA19_eotS =
		"\u022b\uffff";
	static final String DFA19_eofS =
		"\u022b\uffff";
	static final String DFA19_minS =
		"\1\u00b3\1\2\1\76\3\3\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff\4\u00f0"+
		"\1\2\2\u00f0\1\2\2\u00f0\1\2\1\u00f0\1\3\1\2\1\3\1\u00bf\1\3\1\2\1\3\1"+
		"\u00bf\1\3\1\2\1\3\1\u00bf\1\3\1\u00bf\1\3\2\u0102\1\3\1\u00bf\1\3\2\u0102"+
		"\1\3\1\u00bf\1\3\2\u0102\1\uffff\1\2\1\uffff\1\3\2\u0102\1\u00f0\2\2\2"+
		"\3\1\uffff\1\2\1\uffff\1\3\2\u0102\1\u00f0\2\2\2\3\1\uffff\1\2\1\uffff"+
		"\1\3\2\u0102\1\u00f0\2\2\2\3\1\u00f0\1\3\2\2\2\3\2\76\1\u00f0\2\2\1\u00f0"+
		"\2\2\1\u00f0\1\3\2\2\2\3\2\76\1\u00f0\2\2\1\u00f0\2\2\1\u00f0\1\3\2\2"+
		"\2\3\2\76\1\u00f0\2\2\1\u00f0\2\2\1\3\1\2\1\3\2\76\1\3\2\2\1\3\2\2\5\3"+
		"\4\76\1\3\1\2\1\3\2\76\1\3\2\2\1\3\2\2\5\3\4\76\1\3\1\2\1\3\2\76\1\3\2"+
		"\2\1\3\2\2\5\3\4\76\1\3\1\u00bf\5\3\4\76\20\3\1\u00bf\5\3\4\76\20\3\1"+
		"\u00bf\5\3\4\76\17\3\2\uffff\1\3\2\u0102\17\3\1\u00f0\12\3\2\uffff\1\3"+
		"\2\u0102\17\3\1\u00f0\12\3\2\uffff\1\3\2\u0102\17\3\1\u00f0\13\3\2\2\15"+
		"\3\2\u00f0\1\3\2\2\15\3\2\u00f0\1\3\2\2\15\3\2\u00f0\2\76\1\3\2\2\1\3"+
		"\2\2\2\3\2\76\1\3\2\2\1\3\2\2\2\3\2\76\1\3\2\2\1\3\2\2\7\3\4\76\5\3\4"+
		"\76\5\3\4\76\124\3";
	static final String DFA19_maxS =
		"\1\u00b3\1\2\1\u00e6\3\u00b9\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff"+
		"\4\u0102\1\2\2\u0102\1\2\2\u0102\1\2\1\u0102\1\3\1\2\1\3\1\u0103\1\3\1"+
		"\2\1\3\1\u0103\1\3\1\2\1\3\1\u0103\1\u00c8\1\u0103\1\114\2\u0102\1\u00c8"+
		"\1\u0103\1\114\2\u0102\1\u00c8\1\u0103\1\114\2\u0102\1\uffff\1\2\1\uffff"+
		"\1\114\3\u0102\2\2\2\114\1\uffff\1\2\1\uffff\1\114\3\u0102\2\2\2\114\1"+
		"\uffff\1\2\1\uffff\1\114\3\u0102\2\2\2\114\1\u0102\1\3\2\2\2\114\1\u00f0"+
		"\1\u00df\1\u0102\2\2\1\u0102\2\2\1\u0102\1\3\2\2\2\114\1\u00f0\1\u00df"+
		"\1\u0102\2\2\1\u0102\2\2\1\u0102\1\3\2\2\2\114\1\u00f0\1\u00df\1\u0102"+
		"\2\2\1\u0102\2\2\1\3\1\2\1\3\1\u00f0\1\u00df\1\3\2\2\1\3\2\2\5\3\1\u00f0"+
		"\1\u00df\1\u00f0\1\u00df\1\3\1\2\1\3\1\u00f0\1\u00df\1\3\2\2\1\3\2\2\5"+
		"\3\1\u00f0\1\u00df\1\u00f0\1\u00df\1\3\1\2\1\3\1\u00f0\1\u00df\1\3\2\2"+
		"\1\3\2\2\5\3\1\u00f0\1\u00df\1\u00f0\1\u00df\1\u00b9\1\u0103\5\3\1\u00f0"+
		"\1\u00df\1\u00f0\1\u00df\5\114\12\3\1\u00b9\1\u0103\5\3\1\u00f0\1\u00df"+
		"\1\u00f0\1\u00df\5\114\12\3\1\u00b9\1\u0103\5\3\1\u00f0\1\u00df\1\u00f0"+
		"\1\u00df\5\114\12\3\2\uffff\1\114\2\u0102\5\114\12\3\1\u0102\12\114\2"+
		"\uffff\1\114\2\u0102\5\114\12\3\1\u0102\12\114\2\uffff\1\114\2\u0102\5"+
		"\114\12\3\1\u0102\12\114\1\3\2\2\2\114\1\3\12\114\2\u0102\1\3\2\2\2\114"+
		"\1\3\12\114\2\u0102\1\3\2\2\2\114\1\3\12\114\2\u0102\1\u00f0\1\u00df\1"+
		"\3\2\2\1\3\2\2\2\3\1\u00f0\1\u00df\1\3\2\2\1\3\2\2\2\3\1\u00f0\1\u00df"+
		"\1\3\2\2\1\3\2\2\7\3\1\u00f0\1\u00df\1\u00f0\1\u00df\5\3\1\u00f0\1\u00df"+
		"\1\u00f0\1\u00df\5\3\1\u00f0\1\u00df\1\u00f0\1\u00df\5\114\12\3\5\114"+
		"\12\3\5\114\13\3\12\114\1\3\12\114\1\3\12\114\6\3";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\uffff\1\12\1\2\1\uffff\1\13\1\3\1\uffff\1\14\47\uffff\1"+
		"\4\1\uffff\1\15\10\uffff\1\5\1\uffff\1\16\10\uffff\1\6\1\uffff\1\17\u00bc"+
		"\uffff\1\7\1\20\35\uffff\1\10\1\21\35\uffff\1\11\1\22\u00e0\uffff";
	static final String DFA19_specialS =
		"\u022b\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\176\uffff\1\4\50\uffff\1\5",
			"\1\6\51\uffff\1\7\u008b\uffff\1\10",
			"\1\11\51\uffff\1\12\u008b\uffff\1\13",
			"\1\14\51\uffff\1\15\u008b\uffff\1\16",
			"",
			"\1\17",
			"",
			"",
			"\1\20",
			"",
			"",
			"\1\21",
			"",
			"\1\22\1\uffff\1\23\17\uffff\1\24",
			"\1\25\1\uffff\1\26\17\uffff\1\27",
			"\1\30\1\uffff\1\31\17\uffff\1\32",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\36",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\42",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\46",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\47",
			"\1\50",
			"\1\47",
			"\1\52\102\uffff\1\51\1\53",
			"\1\54",
			"\1\55",
			"\1\54",
			"\1\57\102\uffff\1\56\1\60",
			"\1\61",
			"\1\62",
			"\1\61",
			"\1\64\102\uffff\1\63\1\65",
			"\1\66\u00b5\uffff\1\70\16\uffff\1\67",
			"\1\72\102\uffff\1\71\1\73",
			"\1\74\47\uffff\1\76\40\uffff\1\75",
			"\1\77",
			"\1\100",
			"\1\101\u00b5\uffff\1\103\16\uffff\1\102",
			"\1\105\102\uffff\1\104\1\106",
			"\1\107\47\uffff\1\111\40\uffff\1\110",
			"\1\112",
			"\1\113",
			"\1\114\u00b5\uffff\1\116\16\uffff\1\115",
			"\1\120\102\uffff\1\117\1\121",
			"\1\122\47\uffff\1\124\40\uffff\1\123",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"",
			"\1\130\47\uffff\1\132\40\uffff\1\131",
			"\1\133",
			"\1\134",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\135",
			"\1\136",
			"\1\137\47\uffff\1\141\40\uffff\1\140",
			"\1\142\47\uffff\1\144\40\uffff\1\143",
			"",
			"\1\145",
			"",
			"\1\146\47\uffff\1\150\40\uffff\1\147",
			"\1\151",
			"\1\152",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\153",
			"\1\154",
			"\1\155\47\uffff\1\157\40\uffff\1\156",
			"\1\160\47\uffff\1\162\40\uffff\1\161",
			"",
			"\1\163",
			"",
			"\1\164\47\uffff\1\166\40\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\171",
			"\1\172",
			"\1\173\47\uffff\1\175\40\uffff\1\174",
			"\1\176\47\uffff\1\u0080\40\uffff\1\177",
			"\1\u0081\1\uffff\1\u0082\17\uffff\1\u0083",
			"\1\47",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086\47\uffff\1\u0088\40\uffff\1\u0087",
			"\1\u0089\47\uffff\1\u008b\40\uffff\1\u008a",
			"\1\u008d\u00b1\uffff\1\u008c",
			"\1\u008e\132\uffff\1\u0090\105\uffff\1\u008f",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\u0091",
			"\1\u0092",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\1\uffff\1\u0096\17\uffff\1\u0097",
			"\1\54",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a\47\uffff\1\u009c\40\uffff\1\u009b",
			"\1\u009d\47\uffff\1\u009f\40\uffff\1\u009e",
			"\1\u00a1\u00b1\uffff\1\u00a0",
			"\1\u00a2\132\uffff\1\u00a4\105\uffff\1\u00a3",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\u00a5",
			"\1\u00a6",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9\1\uffff\1\u00aa\17\uffff\1\u00ab",
			"\1\61",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae\47\uffff\1\u00b0\40\uffff\1\u00af",
			"\1\u00b1\47\uffff\1\u00b3\40\uffff\1\u00b2",
			"\1\u00b5\u00b1\uffff\1\u00b4",
			"\1\u00b6\132\uffff\1\u00b8\105\uffff\1\u00b7",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\u00b9",
			"\1\u00ba",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bd",
			"\1\u00c0\u00b1\uffff\1\u00bf",
			"\1\u00c1\132\uffff\1\u00c3\105\uffff\1\u00c2",
			"\1\47",
			"\1\u00c4",
			"\1\u00c5",
			"\1\47",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00ce\u00b1\uffff\1\u00cd",
			"\1\u00cf\132\uffff\1\u00d1\105\uffff\1\u00d0",
			"\1\u00d3\u00b1\uffff\1\u00d2",
			"\1\u00d4\132\uffff\1\u00d6\105\uffff\1\u00d5",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d7",
			"\1\u00da\u00b1\uffff\1\u00d9",
			"\1\u00db\132\uffff\1\u00dd\105\uffff\1\u00dc",
			"\1\54",
			"\1\u00de",
			"\1\u00df",
			"\1\54",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e8\u00b1\uffff\1\u00e7",
			"\1\u00e9\132\uffff\1\u00eb\105\uffff\1\u00ea",
			"\1\u00ed\u00b1\uffff\1\u00ec",
			"\1\u00ee\132\uffff\1\u00f0\105\uffff\1\u00ef",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f1",
			"\1\u00f4\u00b1\uffff\1\u00f3",
			"\1\u00f5\132\uffff\1\u00f7\105\uffff\1\u00f6",
			"\1\61",
			"\1\u00f8",
			"\1\u00f9",
			"\1\61",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0102\u00b1\uffff\1\u0101",
			"\1\u0103\132\uffff\1\u0105\105\uffff\1\u0104",
			"\1\u0107\u00b1\uffff\1\u0106",
			"\1\u0108\132\uffff\1\u010a\105\uffff\1\u0109",
			"\1\u010b\u00b5\uffff\1\u010c",
			"\1\u010e\102\uffff\1\u010d\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0116\u00b1\uffff\1\u0115",
			"\1\u0117\132\uffff\1\u0119\105\uffff\1\u0118",
			"\1\u011b\u00b1\uffff\1\u011a",
			"\1\u011c\132\uffff\1\u011e\105\uffff\1\u011d",
			"\1\u011f\47\uffff\1\76\40\uffff\1\75",
			"\1\u011f\47\uffff\1\76\40\uffff\1\75",
			"\1\u011f\47\uffff\1\76\40\uffff\1\75",
			"\1\u011f\47\uffff\1\76\40\uffff\1\75",
			"\1\u011f\47\uffff\1\76\40\uffff\1\75",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a\u00b5\uffff\1\u012b",
			"\1\u012d\102\uffff\1\u012c\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0135\u00b1\uffff\1\u0134",
			"\1\u0136\132\uffff\1\u0138\105\uffff\1\u0137",
			"\1\u013a\u00b1\uffff\1\u0139",
			"\1\u013b\132\uffff\1\u013d\105\uffff\1\u013c",
			"\1\u013e\47\uffff\1\111\40\uffff\1\110",
			"\1\u013e\47\uffff\1\111\40\uffff\1\110",
			"\1\u013e\47\uffff\1\111\40\uffff\1\110",
			"\1\u013e\47\uffff\1\111\40\uffff\1\110",
			"\1\u013e\47\uffff\1\111\40\uffff\1\110",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149\u00b5\uffff\1\u014a",
			"\1\u014c\102\uffff\1\u014b\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0154\u00b1\uffff\1\u0153",
			"\1\u0155\132\uffff\1\u0157\105\uffff\1\u0156",
			"\1\u0159\u00b1\uffff\1\u0158",
			"\1\u015a\132\uffff\1\u015c\105\uffff\1\u015b",
			"\1\u015d\47\uffff\1\124\40\uffff\1\123",
			"\1\u015d\47\uffff\1\124\40\uffff\1\123",
			"\1\u015d\47\uffff\1\124\40\uffff\1\123",
			"\1\u015d\47\uffff\1\124\40\uffff\1\123",
			"\1\u015d\47\uffff\1\124\40\uffff\1\123",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0164",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"",
			"",
			"\1\u0168\47\uffff\1\u016a\40\uffff\1\u0169",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d\47\uffff\1\132\40\uffff\1\131",
			"\1\u016d\47\uffff\1\132\40\uffff\1\131",
			"\1\u016d\47\uffff\1\132\40\uffff\1\131",
			"\1\u016d\47\uffff\1\132\40\uffff\1\131",
			"\1\u016d\47\uffff\1\132\40\uffff\1\131",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\u0178\47\uffff\1\141\40\uffff\1\140",
			"\1\u0178\47\uffff\1\141\40\uffff\1\140",
			"\1\u0178\47\uffff\1\141\40\uffff\1\140",
			"\1\u0178\47\uffff\1\141\40\uffff\1\140",
			"\1\u0178\47\uffff\1\141\40\uffff\1\140",
			"\1\u0179\47\uffff\1\144\40\uffff\1\143",
			"\1\u0179\47\uffff\1\144\40\uffff\1\143",
			"\1\u0179\47\uffff\1\144\40\uffff\1\143",
			"\1\u0179\47\uffff\1\144\40\uffff\1\143",
			"\1\u0179\47\uffff\1\144\40\uffff\1\143",
			"",
			"",
			"\1\u017a\47\uffff\1\u017c\40\uffff\1\u017b",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f\47\uffff\1\150\40\uffff\1\147",
			"\1\u017f\47\uffff\1\150\40\uffff\1\147",
			"\1\u017f\47\uffff\1\150\40\uffff\1\147",
			"\1\u017f\47\uffff\1\150\40\uffff\1\147",
			"\1\u017f\47\uffff\1\150\40\uffff\1\147",
			"\1\u0180",
			"\1\u0181",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\u018a\47\uffff\1\157\40\uffff\1\156",
			"\1\u018a\47\uffff\1\157\40\uffff\1\156",
			"\1\u018a\47\uffff\1\157\40\uffff\1\156",
			"\1\u018a\47\uffff\1\157\40\uffff\1\156",
			"\1\u018a\47\uffff\1\157\40\uffff\1\156",
			"\1\u018b\47\uffff\1\162\40\uffff\1\161",
			"\1\u018b\47\uffff\1\162\40\uffff\1\161",
			"\1\u018b\47\uffff\1\162\40\uffff\1\161",
			"\1\u018b\47\uffff\1\162\40\uffff\1\161",
			"\1\u018b\47\uffff\1\162\40\uffff\1\161",
			"",
			"",
			"\1\u018c\47\uffff\1\u018e\40\uffff\1\u018d",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191\47\uffff\1\166\40\uffff\1\165",
			"\1\u0191\47\uffff\1\166\40\uffff\1\165",
			"\1\u0191\47\uffff\1\166\40\uffff\1\165",
			"\1\u0191\47\uffff\1\166\40\uffff\1\165",
			"\1\u0191\47\uffff\1\166\40\uffff\1\165",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\1\u0195",
			"\1\u0196",
			"\1\u0197",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\u019c\47\uffff\1\175\40\uffff\1\174",
			"\1\u019c\47\uffff\1\175\40\uffff\1\174",
			"\1\u019c\47\uffff\1\175\40\uffff\1\174",
			"\1\u019c\47\uffff\1\175\40\uffff\1\174",
			"\1\u019c\47\uffff\1\175\40\uffff\1\174",
			"\1\u019d\47\uffff\1\u0080\40\uffff\1\177",
			"\1\u019d\47\uffff\1\u0080\40\uffff\1\177",
			"\1\u019d\47\uffff\1\u0080\40\uffff\1\177",
			"\1\u019d\47\uffff\1\u0080\40\uffff\1\177",
			"\1\u019d\47\uffff\1\u0080\40\uffff\1\177",
			"\1\u00bd",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0\47\uffff\1\u01a2\40\uffff\1\u01a1",
			"\1\u01a3\47\uffff\1\u01a5\40\uffff\1\u01a4",
			"\1\47",
			"\1\u01a6\47\uffff\1\u0088\40\uffff\1\u0087",
			"\1\u01a6\47\uffff\1\u0088\40\uffff\1\u0087",
			"\1\u01a6\47\uffff\1\u0088\40\uffff\1\u0087",
			"\1\u01a6\47\uffff\1\u0088\40\uffff\1\u0087",
			"\1\u01a6\47\uffff\1\u0088\40\uffff\1\u0087",
			"\1\u01a7\47\uffff\1\u008b\40\uffff\1\u008a",
			"\1\u01a7\47\uffff\1\u008b\40\uffff\1\u008a",
			"\1\u01a7\47\uffff\1\u008b\40\uffff\1\u008a",
			"\1\u01a7\47\uffff\1\u008b\40\uffff\1\u008a",
			"\1\u01a7\47\uffff\1\u008b\40\uffff\1\u008a",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\33\1\uffff\1\34\17\uffff\1\35",
			"\1\u00d7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa\47\uffff\1\u01ac\40\uffff\1\u01ab",
			"\1\u01ad\47\uffff\1\u01af\40\uffff\1\u01ae",
			"\1\54",
			"\1\u01b0\47\uffff\1\u009c\40\uffff\1\u009b",
			"\1\u01b0\47\uffff\1\u009c\40\uffff\1\u009b",
			"\1\u01b0\47\uffff\1\u009c\40\uffff\1\u009b",
			"\1\u01b0\47\uffff\1\u009c\40\uffff\1\u009b",
			"\1\u01b0\47\uffff\1\u009c\40\uffff\1\u009b",
			"\1\u01b1\47\uffff\1\u009f\40\uffff\1\u009e",
			"\1\u01b1\47\uffff\1\u009f\40\uffff\1\u009e",
			"\1\u01b1\47\uffff\1\u009f\40\uffff\1\u009e",
			"\1\u01b1\47\uffff\1\u009f\40\uffff\1\u009e",
			"\1\u01b1\47\uffff\1\u009f\40\uffff\1\u009e",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\37\1\uffff\1\40\17\uffff\1\41",
			"\1\u00f1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4\47\uffff\1\u01b6\40\uffff\1\u01b5",
			"\1\u01b7\47\uffff\1\u01b9\40\uffff\1\u01b8",
			"\1\61",
			"\1\u01ba\47\uffff\1\u00b0\40\uffff\1\u00af",
			"\1\u01ba\47\uffff\1\u00b0\40\uffff\1\u00af",
			"\1\u01ba\47\uffff\1\u00b0\40\uffff\1\u00af",
			"\1\u01ba\47\uffff\1\u00b0\40\uffff\1\u00af",
			"\1\u01ba\47\uffff\1\u00b0\40\uffff\1\u00af",
			"\1\u01bb\47\uffff\1\u00b3\40\uffff\1\u00b2",
			"\1\u01bb\47\uffff\1\u00b3\40\uffff\1\u00b2",
			"\1\u01bb\47\uffff\1\u00b3\40\uffff\1\u00b2",
			"\1\u01bb\47\uffff\1\u00b3\40\uffff\1\u00b2",
			"\1\u01bb\47\uffff\1\u00b3\40\uffff\1\u00b2",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\43\1\uffff\1\44\17\uffff\1\45",
			"\1\u01bd\u00b1\uffff\1\u01bc",
			"\1\u01be\132\uffff\1\u01c0\105\uffff\1\u01bf",
			"\1\u00bd",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u00bd",
			"\1\u01c3",
			"\1\u01c4",
			"\1\47",
			"\1\47",
			"\1\u01c6\u00b1\uffff\1\u01c5",
			"\1\u01c7\132\uffff\1\u01c9\105\uffff\1\u01c8",
			"\1\u00d7",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u00d7",
			"\1\u01cc",
			"\1\u01cd",
			"\1\54",
			"\1\54",
			"\1\u01cf\u00b1\uffff\1\u01ce",
			"\1\u01d0\132\uffff\1\u01d2\105\uffff\1\u01d1",
			"\1\u00f1",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u00f1",
			"\1\u01d5",
			"\1\u01d6",
			"\1\61",
			"\1\61",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dd\u00b1\uffff\1\u01dc",
			"\1\u01de\132\uffff\1\u01e0\105\uffff\1\u01df",
			"\1\u01e2\u00b1\uffff\1\u01e1",
			"\1\u01e3\132\uffff\1\u01e5\105\uffff\1\u01e4",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01ec\u00b1\uffff\1\u01eb",
			"\1\u01ed\132\uffff\1\u01ef\105\uffff\1\u01ee",
			"\1\u01f1\u00b1\uffff\1\u01f0",
			"\1\u01f2\132\uffff\1\u01f4\105\uffff\1\u01f3",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fb\u00b1\uffff\1\u01fa",
			"\1\u01fc\132\uffff\1\u01fe\105\uffff\1\u01fd",
			"\1\u0200\u00b1\uffff\1\u01ff",
			"\1\u0201\132\uffff\1\u0203\105\uffff\1\u0202",
			"\1\u0204\47\uffff\1\u016a\40\uffff\1\u0169",
			"\1\u0204\47\uffff\1\u016a\40\uffff\1\u0169",
			"\1\u0204\47\uffff\1\u016a\40\uffff\1\u0169",
			"\1\u0204\47\uffff\1\u016a\40\uffff\1\u0169",
			"\1\u0204\47\uffff\1\u016a\40\uffff\1\u0169",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f\47\uffff\1\u017c\40\uffff\1\u017b",
			"\1\u020f\47\uffff\1\u017c\40\uffff\1\u017b",
			"\1\u020f\47\uffff\1\u017c\40\uffff\1\u017b",
			"\1\u020f\47\uffff\1\u017c\40\uffff\1\u017b",
			"\1\u020f\47\uffff\1\u017c\40\uffff\1\u017b",
			"\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\1\u021a\47\uffff\1\u018e\40\uffff\1\u018d",
			"\1\u021a\47\uffff\1\u018e\40\uffff\1\u018d",
			"\1\u021a\47\uffff\1\u018e\40\uffff\1\u018d",
			"\1\u021a\47\uffff\1\u018e\40\uffff\1\u018d",
			"\1\u021a\47\uffff\1\u018e\40\uffff\1\u018d",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\1\u00bd",
			"\1\u0225\47\uffff\1\u01a2\40\uffff\1\u01a1",
			"\1\u0225\47\uffff\1\u01a2\40\uffff\1\u01a1",
			"\1\u0225\47\uffff\1\u01a2\40\uffff\1\u01a1",
			"\1\u0225\47\uffff\1\u01a2\40\uffff\1\u01a1",
			"\1\u0225\47\uffff\1\u01a2\40\uffff\1\u01a1",
			"\1\u0226\47\uffff\1\u01a5\40\uffff\1\u01a4",
			"\1\u0226\47\uffff\1\u01a5\40\uffff\1\u01a4",
			"\1\u0226\47\uffff\1\u01a5\40\uffff\1\u01a4",
			"\1\u0226\47\uffff\1\u01a5\40\uffff\1\u01a4",
			"\1\u0226\47\uffff\1\u01a5\40\uffff\1\u01a4",
			"\1\u00d7",
			"\1\u0227\47\uffff\1\u01ac\40\uffff\1\u01ab",
			"\1\u0227\47\uffff\1\u01ac\40\uffff\1\u01ab",
			"\1\u0227\47\uffff\1\u01ac\40\uffff\1\u01ab",
			"\1\u0227\47\uffff\1\u01ac\40\uffff\1\u01ab",
			"\1\u0227\47\uffff\1\u01ac\40\uffff\1\u01ab",
			"\1\u0228\47\uffff\1\u01af\40\uffff\1\u01ae",
			"\1\u0228\47\uffff\1\u01af\40\uffff\1\u01ae",
			"\1\u0228\47\uffff\1\u01af\40\uffff\1\u01ae",
			"\1\u0228\47\uffff\1\u01af\40\uffff\1\u01ae",
			"\1\u0228\47\uffff\1\u01af\40\uffff\1\u01ae",
			"\1\u00f1",
			"\1\u0229\47\uffff\1\u01b6\40\uffff\1\u01b5",
			"\1\u0229\47\uffff\1\u01b6\40\uffff\1\u01b5",
			"\1\u0229\47\uffff\1\u01b6\40\uffff\1\u01b5",
			"\1\u0229\47\uffff\1\u01b6\40\uffff\1\u01b5",
			"\1\u0229\47\uffff\1\u01b6\40\uffff\1\u01b5",
			"\1\u022a\47\uffff\1\u01b9\40\uffff\1\u01b8",
			"\1\u022a\47\uffff\1\u01b9\40\uffff\1\u01b8",
			"\1\u022a\47\uffff\1\u01b9\40\uffff\1\u01b8",
			"\1\u022a\47\uffff\1\u01b9\40\uffff\1\u01b8",
			"\1\u022a\47\uffff\1\u01b9\40\uffff\1\u01b8",
			"\1\u00bd",
			"\1\u00bd",
			"\1\u00d7",
			"\1\u00d7",
			"\1\u00f1",
			"\1\u00f1"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "324:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text));";
		}
	}

	static final String DFA78_eotS =
		"\100\uffff";
	static final String DFA78_eofS =
		"\100\uffff";
	static final String DFA78_minS =
		"\1\u0105\1\2\1\u00f0\1\3\1\2\1\3\4\uffff\1\u00bf\1\3\2\u0102\1\3\2\2\2"+
		"\3\2\76\1\3\2\2\1\3\2\2\5\3\4\76\34\3";
	static final String DFA78_maxS =
		"\1\u0105\1\2\1\u0102\1\u00e6\1\2\1\u00e6\4\uffff\1\u0103\1\114\2\u0102"+
		"\1\u00e6\2\2\2\114\1\u00f0\1\u00df\1\u00e6\2\2\1\u00e6\2\2\5\3\1\u00f0"+
		"\1\u00df\1\u00f0\1\u00df\5\114\12\3\1\u00e6\12\114\2\u00e6";
	static final String DFA78_acceptS =
		"\6\uffff\1\1\1\2\1\3\1\4\66\uffff";
	static final String DFA78_specialS =
		"\100\uffff}>";
	static final String[] DFA78_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\1\uffff\1\4\17\uffff\1\5",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"\1\12",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"",
			"",
			"",
			"",
			"\1\14\102\uffff\1\13\1\15",
			"\1\16\47\uffff\1\20\40\uffff\1\17",
			"\1\21",
			"\1\22",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"\1\23",
			"\1\24",
			"\1\25\47\uffff\1\27\40\uffff\1\26",
			"\1\30\47\uffff\1\32\40\uffff\1\31",
			"\1\34\u00b1\uffff\1\33",
			"\1\35\132\uffff\1\37\105\uffff\1\36",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"\1\40",
			"\1\41",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\52\u00b1\uffff\1\51",
			"\1\53\132\uffff\1\55\105\uffff\1\54",
			"\1\57\u00b1\uffff\1\56",
			"\1\60\132\uffff\1\62\105\uffff\1\61",
			"\1\63\47\uffff\1\20\40\uffff\1\17",
			"\1\63\47\uffff\1\20\40\uffff\1\17",
			"\1\63\47\uffff\1\20\40\uffff\1\17",
			"\1\63\47\uffff\1\20\40\uffff\1\17",
			"\1\63\47\uffff\1\20\40\uffff\1\17",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"\1\76\47\uffff\1\27\40\uffff\1\26",
			"\1\76\47\uffff\1\27\40\uffff\1\26",
			"\1\76\47\uffff\1\27\40\uffff\1\26",
			"\1\76\47\uffff\1\27\40\uffff\1\26",
			"\1\76\47\uffff\1\27\40\uffff\1\26",
			"\1\77\47\uffff\1\32\40\uffff\1\31",
			"\1\77\47\uffff\1\32\40\uffff\1\31",
			"\1\77\47\uffff\1\32\40\uffff\1\31",
			"\1\77\47\uffff\1\32\40\uffff\1\31",
			"\1\77\47\uffff\1\32\40\uffff\1\31",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11",
			"\1\6\72\uffff\1\7\176\uffff\1\10\50\uffff\1\11"
	};

	static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
	static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
	static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
	static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
	static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
	static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
	static final short[][] DFA78_transition;

	static {
		int numStates = DFA78_transitionS.length;
		DFA78_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
		}
	}

	protected class DFA78 extends DFA {

		public DFA78(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 78;
			this.eot = DFA78_eot;
			this.eof = DFA78_eof;
			this.min = DFA78_min;
			this.max = DFA78_max;
			this.accept = DFA78_accept;
			this.special = DFA78_special;
			this.transition = DFA78_transition;
		}
		@Override
		public String getDescription() {
			return "985:1: quantity : ( ^( QUANTITY number= aNumber ) -> {$number.st}| ^( QUANTITY number= aNumber unit= ID ) -> template(number=$number.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY number= aNumber LITERAL_scalar ) -> template(number=$number.st) \"<number> scalar\"| ^( QUANTITY number= aNumber LITERAL_whole ) -> template(number=$number.st) \"<number> whole\");";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_NAME_in_unitName94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitName98 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_ID_in_unitName102 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula146 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula176 = new BitSet(new long[]{0x4000020000000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula179 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula183 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula216 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula220 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration282 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration289 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration293 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration346 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration353 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration357 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitExtension409 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension413 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_TIMES_in_unitFactor458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor462 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor501 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFactor505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration588 = new BitSet(new long[]{0x0000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_type_in_typeDeclaration592 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_enumerationType_in_type631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType789 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationType793 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType828 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType832 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType857 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType861 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType886 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType890 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType915 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType919 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType922 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType930 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType966 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType970 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType981 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1017 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1021 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1024 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1032 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1072 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1075 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1083 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1087 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1091 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1136 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1139 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1147 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1155 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1200 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1207 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1215 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1260 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1267 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1271 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1303 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1314 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1389 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1393 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1454 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1458 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1469 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1473 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1519 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1523 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1534 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1538 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1542 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1588 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1666 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1669 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1681 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1744 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1755 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1763 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1771 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType1827 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType1833 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType1837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList1870 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList1884 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList1888 = new BitSet(new long[]{0x0000200000000008L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange1937 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0005000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1945 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_record_in_recordType1982 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType1986 = new BitSet(new long[]{0x0000000020000008L});
	public static final BitSet FOLLOW_LITERAL_variant_in_recordType2013 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2017 = new BitSet(new long[]{0x0000000020000008L});
	public static final BitSet FOLLOW_LITERAL_union_in_recordType2044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2048 = new BitSet(new long[]{0x0000000020000008L});
	public static final BitSet FOLLOW_COLON_in_recordField2082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordField2086 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField2090 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary2131 = new BitSet(new long[]{0x0000000000034000L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2135 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2166 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables2202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables2206 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable2239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ghostVariable2244 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable2248 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2285 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2299 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2329 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2333 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2388 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2406 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2465 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2481 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion2535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2539 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2543 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion2549 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_in_variableList2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList2611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList2615 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_TILDE_in_variable2649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable2653 = new BitSet(new long[]{0x4000000000000000L,0x0400000880000000L,0x0028000800000000L,0x0000000408000400L});
	public static final BitSet FOLLOW_typeOrReference_in_variable2657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue2710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2739 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction2743 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair2777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair2781 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair2785 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2824 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration2828 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration2857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration2887 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration2891 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_ARROW_in_enumerationPair2928 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationPair2932 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair2936 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation2975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation2979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3004 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3008 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation3012 = new BitSet(new long[]{0x0000000020000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3043 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3047 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_invocation3051 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COLON_in_actualParameter3088 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_actualParameter3092 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_actualParameter3096 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3139 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction3177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction3181 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction3187 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration3229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion3258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion3274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion3290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion3306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression3338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression3354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression3370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression3386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression3402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression3420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3424 = new BitSet(new long[]{0x4850020010080310L,0x8280000009000020L,0x1080008B08000000L,0x0508A70003288000L,0x0000000405001060L});
	public static final BitSet FOLLOW_disjunction_in_expression3428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression3463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3467 = new BitSet(new long[]{0x4850020010080310L,0x8280000009000020L,0x1080008B08000000L,0x0508A70003288000L,0x0000000405001060L});
	public static final BitSet FOLLOW_disjunction_in_expression3471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification3515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification3519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_in_which_in_universalQuantification3523 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification3527 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification3531 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_in_which3580 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_range_in_in_which3584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_which_in_in_which3611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_in_which3615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification3651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification3655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_in_which_in_existentialQuantification3659 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_existentialQuantification3663 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification3667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification3718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_in_which_in_sumQuantification3726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification3730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sumQuantification3734 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification3786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification3790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_in_which_in_productQuantification3794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification3798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_productQuantification3802 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification3853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification3857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000001000000000L});
	public static final BitSet FOLLOW_in_which_in_countingQuantification3861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification3865 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_countingQuantification3869 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables3916 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_logicVariables3920 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables3946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction3967 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction3971 = new BitSet(new long[]{0x4850020010080318L,0x8080000009000020L,0x1080000B08000000L,0x0508A60003288000L,0x0000000405001060L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction3997 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4001 = new BitSet(new long[]{0x4850020010080318L,0x8080000009000020L,0x1080000B08000000L,0x0508A60003288000L,0x0000000405001060L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction4027 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4031 = new BitSet(new long[]{0x4850020010080318L,0x8080000009000020L,0x1080000B08000000L,0x0508A60003288000L,0x0000000405001060L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction4076 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4080 = new BitSet(new long[]{0x4850020010080318L,0x8080000001000020L,0x1080000B08000000L,0x0508A60003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction4106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4110 = new BitSet(new long[]{0x4850020010080318L,0x8080000001000020L,0x1080000B08000000L,0x0508A60003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_relation_in_conjunction4136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_relation4163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4168 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_relation4202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4207 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AM_in_relation4243 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4248 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4252 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AL_in_relation4284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4289 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_relation4325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4330 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4334 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_EQUALS_in_relation4366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4371 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4375 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_relation4407 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4412 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4416 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_NEQ_in_relation4446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4451 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0100220003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_addSub_in_relation4455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_addSub_in_relation4484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_range4511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4515 = new BitSet(new long[]{0x4000000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_subexpression_in_range4519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMADOT_in_range4557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4561 = new BitSet(new long[]{0x4000000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_subexpression_in_range4565 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTCOMMA_in_range4603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4607 = new BitSet(new long[]{0x4000000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_subexpression_in_range4611 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMACOMMA_in_range4649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4653 = new BitSet(new long[]{0x4000000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_subexpression_in_range4657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_addSub4700 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub4704 = new BitSet(new long[]{0x4040020010080018L,0x8080000001000020L,0x1080000B08000000L,0x0000020003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_MINUS_in_addSub4730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub4734 = new BitSet(new long[]{0x4040020010080010L,0x8080000001000020L,0x1080000B08000000L,0x0000020003280000L,0x0000000405001060L});
	public static final BitSet FOLLOW_multDiv_in_addSub4738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multDiv_in_addSub4770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multDiv4801 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4805 = new BitSet(new long[]{0x4040000010080018L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_DIVIDE_in_multDiv4831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4835 = new BitSet(new long[]{0x4040000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4839 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_multDiv4871 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4875 = new BitSet(new long[]{0x4040000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4879 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_multDiv4911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4915 = new BitSet(new long[]{0x4040000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_multDiv4951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4955 = new BitSet(new long[]{0x4040000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4959 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5023 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5027 = new BitSet(new long[]{0x4000000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5031 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5094 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5098 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_subexpression5130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5170 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5335 = new BitSet(new long[]{0x4000000010080010L,0x8000000001000020L,0x1000000B00000000L,0x0000020003280000L,0x0000000401001060L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5373 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5377 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_periodShift5533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5573 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5575 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_periodShift5607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5625 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression5667 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5671 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression5709 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5713 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression5751 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5755 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression5793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5797 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5801 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression5833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5837 = new BitSet(new long[]{0x4000000000000018L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression5863 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5867 = new BitSet(new long[]{0x4000000000000018L,0x8000000000000000L,0x0000000A00000000L,0x0000020001280000L,0x0000000401000060L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression5902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQ_in_conditionalExpression5906 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5910 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5914 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression5923 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression5969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression5975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6005 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6011 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6045 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6049 = new BitSet(new long[]{0x8000000000000008L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_caseChoice6086 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_caseChoice6090 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RECORD_TERM_in_recordTerm6131 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordTerm6135 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6139 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordValue6182 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000A00000000L,0x0000000001280000L,0x0000000001000060L});
	public static final BitSet FOLLOW_value_in_recordValue6186 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_predicate6223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6343 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6345 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6389 = new BitSet(new long[]{0x0000200000000008L,0x0080000000000000L,0x0080000008000000L,0x0100200000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_DOT_in_valueName6396 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6400 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_valueName6445 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6449 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6489 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6551 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6578 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6634 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6688 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6692 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6696 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6739 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6743 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0080000008000000L,0x0100200000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6747 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6817 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_partialName6849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_constant6876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant6894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant6912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant6930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant6948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity6973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity6977 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity6997 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7001 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity7005 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7037 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7043 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7070 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QCLREF_in_aNumber7139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7216 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7220 = new BitSet(new long[]{0x0000080000000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7270 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7320 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7324 = new BitSet(new long[]{0x0000080000000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7421 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7425 = new BitSet(new long[]{0x0000080000000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause7619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7624 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000100000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7631 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7654 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7671 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_throwsClause7779 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7812 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7816 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification7849 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification7855 = new BitSet(new long[]{0x0000000000000440L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification7862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification7864 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification7870 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7915 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7919 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration7951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7955 = new BitSet(new long[]{0x0000000000074008L,0x0001000000000000L,0x0000000080000040L,0x0000000000000028L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7965 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7974 = new BitSet(new long[]{0x0000000000000008L,0x0001000000000000L,0x0000000080000040L,0x0000000000000028L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7984 = new BitSet(new long[]{0x0000000000000008L,0x0001000000000000L,0x0000000000000040L,0x0000000000000028L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7989 = new BitSet(new long[]{0x0000000000000008L,0x0001000000000000L,0x0000000000000040L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7994 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7999 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration8004 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause8064 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause8068 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm8104 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8110 = new BitSet(new long[]{0x0000000000040000L,0x0800000000000000L,0x000000000000001EL,0x3000000800002014L,0x0000100000000000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8116 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8146 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm8148 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8152 = new BitSet(new long[]{0x0000000000040000L,0x0800000000000000L,0x000000000000001EL,0x3000000800002014L,0x0000100000000000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions8190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8194 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions8220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8224 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_assertedAction8275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_assertedAction8279 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_S_in_assertedAction8290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_action_in_assertedAction8294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_assertedAction8300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_basicAction_in_action8346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8362 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8502 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_basicAction8506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException8621 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_issueException8625 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException8629 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8669 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_assignment8673 = new BitSet(new long[]{0x0000000000000000L,0x1000000014000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_nameTick8716 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_nameTick8720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_valueName_in_nameTick8745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8826 = new BitSet(new long[]{0x4000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8837 = new BitSet(new long[]{0x0000000000000008L,0x1000000014000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8877 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8879 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_whenThrow8883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8887 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8891 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation8947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation8964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation8981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation8998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation9015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction9038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction9056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction9074 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PORT_OUTPUT_in_portOutput9101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portOutput9105 = new BitSet(new long[]{0x0000000000000008L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_portOutput9109 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PORT_INPUT_in_portInput9151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portInput9155 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000040L});
	public static final BitSet FOLLOW_valueName_in_portInput9159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_subprogramCall9203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_subprogramCall9207 = new BitSet(new long[]{0x40000000A0000018L,0x8000000000000000L,0x0000000800000000L,0x0000020001000000L,0x0000000001000060L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall9211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList9256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList9260 = new BitSet(new long[]{0x4000000020000018L,0x8000000000000000L,0x0000000800000000L,0x0000020001000000L,0x0000000001000060L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList9286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalActual9315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalActual9319 = new BitSet(new long[]{0x4000000000000010L,0x8000000000000000L,0x0000000800000000L,0x0000020001000000L,0x0000000001000060L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual9323 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual9353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter9367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter9382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter9397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative9425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_guardedAction_in_alternative9429 = new BitSet(new long[]{0x1000000000000008L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction9466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_guardedAction9470 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction9474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop9513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop9517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_INVARIANT_in_whileLoop9521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9525 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_whileLoop9532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop9550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop9599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_forLoop9603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop9607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forLoop9611 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_forLoop9615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_forLoop9621 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_forLoop9625 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_doUntilLoop9708 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_doUntilLoop9719 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9736 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9789 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9793 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9802 = new BitSet(new long[]{0x0000000000000000L,0x1000000004000000L,0x0000401000014000L,0x0000000000001000L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9806 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9812 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause9862 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9870 = new BitSet(new long[]{0x0000000000000008L,0x0000000100000000L,0x0000000000200000L,0x0000000200800080L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9879 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000200000L,0x0000000200800080L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9890 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000200800080L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9899 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000800080L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9908 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9983 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection10015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection10019 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection10050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection10054 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState10086 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState10090 = new BitSet(new long[]{0x4000000000000000L,0x0000080000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState10095 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState10100 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_behaviorState10105 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_assertion_in_behaviorState10109 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions10164 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions10168 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_TRANSITION_in_behaviorTransition10201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_behaviorTransition10205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10209 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition10213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SOURCE_in_behaviorTransition10220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10224 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_CONDITION_in_behaviorTransition10236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition10240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESTINATION_in_behaviorTransition10247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_behaviorTransition10261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition10265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_behaviorTransition10272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition10276 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_priority10348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_priority10352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RBRACKET_in_priority10354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition10385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition10402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition10420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition10438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition10466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition10470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_executeCondition10505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_internalCondition10568 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10608 = new BitSet(new long[]{0x4000000000000008L,0x0000000008000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10665 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10669 = new BitSet(new long[]{0x4000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger10721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger10739 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger10745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10749 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10759 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime10793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime10809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_behaviorTime10825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_portName10857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_and_in_triggerLogicalExpression10894 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10898 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_triggerLogicalExpression10925 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10929 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_triggerLogicalExpression10956 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10960 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_then_in_triggerLogicalExpression10987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10991 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_triggerLogicalExpression11018 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11022 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_eventTrigger11073 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger11092 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger11096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger11098 = new BitSet(new long[]{0x0000000000000008L});
}
