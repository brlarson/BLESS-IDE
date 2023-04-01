// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g 2023-04-01 03:51:28

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
		"BI", "BLESS_SUBCLAUSE", "BOUND", "BOX", "CARET", "CASE_EXPRESSION", "COLON", 
		"COLON_TILDE", "COMMA", "COMMACOMMA", "COMMADOT", "COMPONENT", "CONDITION", 
		"CONDITIONAL", "CONDITIONAL_FUNCTION", "COUNTING_TRIGGER", "CVP", "DESTINATION", 
		"DIGIT", "DIVIDE", "DOLLAR", "DOT", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", 
		"DOUBLE_QUOTE", "DO_NOT_PROVE", "DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", 
		"EQ", "EXCLAMATION", "EXP", "EXPONENT", "EXTENDED_DIGIT", "FLOATING", 
		"FUNCTION", "FUNCTION_CALL", "GT", "GUARD", "HEX_DIGIT", "ID", "IMP", 
		"INMODE", "INOUT", "INTEGER_LIT", "INT_EXPONENT", "INVARIANT", "INVOKE", 
		"INVOKE_FUNCTION", "IP_NAME", "IP_PE", "IP_PRED", "LABEL", "LASS", "LBRACKET", 
		"LCON", "LCURLY", "LITERAL_Assertion", "LITERAL_Invariant", "LITERAL_Postcondition", 
		"LITERAL_Precondition", "LITERAL_Typed", "LITERAL_aadlboolean", "LITERAL_aadlinteger", 
		"LITERAL_aadlreal", "LITERAL_aadlstring", "LITERAL_abs", "LITERAL_access", 
		"LITERAL_all", "LITERAL_and", "LITERAL_any", "LITERAL_applies", "LITERAL_are", 
		"LITERAL_array", "LITERAL_assert", "LITERAL_availability", "LITERAL_base", 
		"LITERAL_boolean", "LITERAL_bound", "LITERAL_call", "LITERAL_calls", "LITERAL_cand", 
		"LITERAL_case", "LITERAL_catch", "LITERAL_classifier", "LITERAL_complete", 
		"LITERAL_complex", "LITERAL_component", "LITERAL_computation", "LITERAL_connection", 
		"LITERAL_connections", "LITERAL_constant", "LITERAL_cor", "LITERAL_count", 
		"LITERAL_declare", "LITERAL_def", "LITERAL_delay", "LITERAL_dispatch", 
		"LITERAL_div", "LITERAL_do", "LITERAL_else", "LITERAL_enumeration", "LITERAL_exception", 
		"LITERAL_exists", "LITERAL_extends", "LITERAL_extension", "LITERAL_false", 
		"LITERAL_feature", "LITERAL_fetchadd", "LITERAL_fetchand", "LITERAL_fetchor", 
		"LITERAL_fetchxor", "LITERAL_fi", "LITERAL_final", "LITERAL_flow", "LITERAL_for", 
		"LITERAL_forall", "LITERAL_fresh", "LITERAL_ghost", "LITERAL_hr", "LITERAL_if", 
		"LITERAL_iff", "LITERAL_implementation", "LITERAL_implies", "LITERAL_in", 
		"LITERAL_inherit", "LITERAL_initial", "LITERAL_integer", "LITERAL_internal", 
		"LITERAL_invariant", "LITERAL_inverse", "LITERAL_is", "LITERAL_list", 
		"LITERAL_lower_bound", "LITERAL_min", "LITERAL_mod", "LITERAL_mode", "LITERAL_modes", 
		"LITERAL_ms", "LITERAL_natural", "LITERAL_nonvolatile", "LITERAL_not", 
		"LITERAL_now", "LITERAL_ns", "LITERAL_null", "LITERAL_numberof", "LITERAL_of", 
		"LITERAL_on", "LITERAL_or", "LITERAL_package", "LITERAL_parameter", "LITERAL_pause", 
		"LITERAL_post", "LITERAL_pre", "LITERAL_private", "LITERAL_product", "LITERAL_property", 
		"LITERAL_provides", "LITERAL_ps", "LITERAL_public", "LITERAL_quantity", 
		"LITERAL_range", "LITERAL_rational", "LITERAL_real", "LITERAL_record", 
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
		"NEQ", "NUMBER", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETER", "PARAMETERS", 
		"PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", 
		"PREDICATE_RELATION", "PROCEDURE", "PROCEDURE_CALL", "Q", "QCLREF", "QCREF", 
		"QQ", "QUANTITY", "QUESTION", "RASS", "RBRACKET", "RCON", "RCURLY", "REAL_LIT", 
		"RECORD_TERM", "ROOT_DECLARATION", "RPAREN", "S", "SEMICOLON", "SLCOMMENT", 
		"SOURCE", "START", "START_ASSERTION_PROPERTY", "STOP", "SUBPROGRAM_ANNEX", 
		"THREAD_ANNEX", "TICK", "TILDE", "TIMES", "TOP", "TRANSITION", "TRIGGER", 
		"TYPE", "TYPE_LIBRARY", "TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", 
		"UNIT_FORMULA", "UNIT_LIBRARY", "UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", 
		"VERT", "WP", "WS", "'%'"
	};
	public static final int EOF=-1;
	public static final int T__306=306;
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
	public static final int CASE_EXPRESSION=29;
	public static final int COLON=30;
	public static final int COLON_TILDE=31;
	public static final int COMMA=32;
	public static final int COMMACOMMA=33;
	public static final int COMMADOT=34;
	public static final int COMPONENT=35;
	public static final int CONDITION=36;
	public static final int CONDITIONAL=37;
	public static final int CONDITIONAL_FUNCTION=38;
	public static final int COUNTING_TRIGGER=39;
	public static final int CVP=40;
	public static final int DESTINATION=41;
	public static final int DIGIT=42;
	public static final int DIVIDE=43;
	public static final int DOLLAR=44;
	public static final int DOT=45;
	public static final int DOTCOMMA=46;
	public static final int DOTDOT=47;
	public static final int DOUBLE_COLON=48;
	public static final int DOUBLE_QUOTE=49;
	public static final int DO_NOT_PROVE=50;
	public static final int DUMMY=51;
	public static final int EMPTY_CURLY=52;
	public static final int END_ASSERTION_PROPERTY=53;
	public static final int EQ=54;
	public static final int EXCLAMATION=55;
	public static final int EXP=56;
	public static final int EXPONENT=57;
	public static final int EXTENDED_DIGIT=58;
	public static final int FLOATING=59;
	public static final int FUNCTION=60;
	public static final int FUNCTION_CALL=61;
	public static final int GT=62;
	public static final int GUARD=63;
	public static final int HEX_DIGIT=64;
	public static final int ID=65;
	public static final int IMP=66;
	public static final int INMODE=67;
	public static final int INOUT=68;
	public static final int INTEGER_LIT=69;
	public static final int INT_EXPONENT=70;
	public static final int INVARIANT=71;
	public static final int INVOKE=72;
	public static final int INVOKE_FUNCTION=73;
	public static final int IP_NAME=74;
	public static final int IP_PE=75;
	public static final int IP_PRED=76;
	public static final int LABEL=77;
	public static final int LASS=78;
	public static final int LBRACKET=79;
	public static final int LCON=80;
	public static final int LCURLY=81;
	public static final int LITERAL_Assertion=82;
	public static final int LITERAL_Invariant=83;
	public static final int LITERAL_Postcondition=84;
	public static final int LITERAL_Precondition=85;
	public static final int LITERAL_Typed=86;
	public static final int LITERAL_aadlboolean=87;
	public static final int LITERAL_aadlinteger=88;
	public static final int LITERAL_aadlreal=89;
	public static final int LITERAL_aadlstring=90;
	public static final int LITERAL_abs=91;
	public static final int LITERAL_access=92;
	public static final int LITERAL_all=93;
	public static final int LITERAL_and=94;
	public static final int LITERAL_any=95;
	public static final int LITERAL_applies=96;
	public static final int LITERAL_are=97;
	public static final int LITERAL_array=98;
	public static final int LITERAL_assert=99;
	public static final int LITERAL_availability=100;
	public static final int LITERAL_base=101;
	public static final int LITERAL_boolean=102;
	public static final int LITERAL_bound=103;
	public static final int LITERAL_call=104;
	public static final int LITERAL_calls=105;
	public static final int LITERAL_cand=106;
	public static final int LITERAL_case=107;
	public static final int LITERAL_catch=108;
	public static final int LITERAL_classifier=109;
	public static final int LITERAL_complete=110;
	public static final int LITERAL_complex=111;
	public static final int LITERAL_component=112;
	public static final int LITERAL_computation=113;
	public static final int LITERAL_connection=114;
	public static final int LITERAL_connections=115;
	public static final int LITERAL_constant=116;
	public static final int LITERAL_cor=117;
	public static final int LITERAL_count=118;
	public static final int LITERAL_declare=119;
	public static final int LITERAL_def=120;
	public static final int LITERAL_delay=121;
	public static final int LITERAL_dispatch=122;
	public static final int LITERAL_div=123;
	public static final int LITERAL_do=124;
	public static final int LITERAL_else=125;
	public static final int LITERAL_enumeration=126;
	public static final int LITERAL_exception=127;
	public static final int LITERAL_exists=128;
	public static final int LITERAL_extends=129;
	public static final int LITERAL_extension=130;
	public static final int LITERAL_false=131;
	public static final int LITERAL_feature=132;
	public static final int LITERAL_fetchadd=133;
	public static final int LITERAL_fetchand=134;
	public static final int LITERAL_fetchor=135;
	public static final int LITERAL_fetchxor=136;
	public static final int LITERAL_fi=137;
	public static final int LITERAL_final=138;
	public static final int LITERAL_flow=139;
	public static final int LITERAL_for=140;
	public static final int LITERAL_forall=141;
	public static final int LITERAL_fresh=142;
	public static final int LITERAL_ghost=143;
	public static final int LITERAL_hr=144;
	public static final int LITERAL_if=145;
	public static final int LITERAL_iff=146;
	public static final int LITERAL_implementation=147;
	public static final int LITERAL_implies=148;
	public static final int LITERAL_in=149;
	public static final int LITERAL_inherit=150;
	public static final int LITERAL_initial=151;
	public static final int LITERAL_integer=152;
	public static final int LITERAL_internal=153;
	public static final int LITERAL_invariant=154;
	public static final int LITERAL_inverse=155;
	public static final int LITERAL_is=156;
	public static final int LITERAL_list=157;
	public static final int LITERAL_lower_bound=158;
	public static final int LITERAL_min=159;
	public static final int LITERAL_mod=160;
	public static final int LITERAL_mode=161;
	public static final int LITERAL_modes=162;
	public static final int LITERAL_ms=163;
	public static final int LITERAL_natural=164;
	public static final int LITERAL_nonvolatile=165;
	public static final int LITERAL_not=166;
	public static final int LITERAL_now=167;
	public static final int LITERAL_ns=168;
	public static final int LITERAL_null=169;
	public static final int LITERAL_numberof=170;
	public static final int LITERAL_of=171;
	public static final int LITERAL_on=172;
	public static final int LITERAL_or=173;
	public static final int LITERAL_package=174;
	public static final int LITERAL_parameter=175;
	public static final int LITERAL_pause=176;
	public static final int LITERAL_post=177;
	public static final int LITERAL_pre=178;
	public static final int LITERAL_private=179;
	public static final int LITERAL_product=180;
	public static final int LITERAL_property=181;
	public static final int LITERAL_provides=182;
	public static final int LITERAL_ps=183;
	public static final int LITERAL_public=184;
	public static final int LITERAL_quantity=185;
	public static final int LITERAL_range=186;
	public static final int LITERAL_rational=187;
	public static final int LITERAL_real=188;
	public static final int LITERAL_record=189;
	public static final int LITERAL_reference=190;
	public static final int LITERAL_rem=191;
	public static final int LITERAL_renames=192;
	public static final int LITERAL_representation=193;
	public static final int LITERAL_requires=194;
	public static final int LITERAL_returns=195;
	public static final int LITERAL_round=196;
	public static final int LITERAL_scalar=197;
	public static final int LITERAL_sec=198;
	public static final int LITERAL_self=199;
	public static final int LITERAL_sequence=200;
	public static final int LITERAL_set=201;
	public static final int LITERAL_setmode=202;
	public static final int LITERAL_shared=203;
	public static final int LITERAL_skip=204;
	public static final int LITERAL_spread=205;
	public static final int LITERAL_state=206;
	public static final int LITERAL_states=207;
	public static final int LITERAL_step=208;
	public static final int LITERAL_stop=209;
	public static final int LITERAL_string=210;
	public static final int LITERAL_subcomponents=211;
	public static final int LITERAL_sum=212;
	public static final int LITERAL_swap=213;
	public static final int LITERAL_that=214;
	public static final int LITERAL_then=215;
	public static final int LITERAL_throw=216;
	public static final int LITERAL_throws=217;
	public static final int LITERAL_time=218;
	public static final int LITERAL_timeout=219;
	public static final int LITERAL_to=220;
	public static final int LITERAL_tops=221;
	public static final int LITERAL_transition=222;
	public static final int LITERAL_transitions=223;
	public static final int LITERAL_true=224;
	public static final int LITERAL_truncate=225;
	public static final int LITERAL_type=226;
	public static final int LITERAL_union=227;
	public static final int LITERAL_units=228;
	public static final int LITERAL_until=229;
	public static final int LITERAL_updated=230;
	public static final int LITERAL_upper_bound=231;
	public static final int LITERAL_us=232;
	public static final int LITERAL_variables=233;
	public static final int LITERAL_variant=234;
	public static final int LITERAL_when=235;
	public static final int LITERAL_which=236;
	public static final int LITERAL_while=237;
	public static final int LITERAL_whole=238;
	public static final int LITERAL_with=239;
	public static final int LITERAL_xor=240;
	public static final int LPAREN=241;
	public static final int LT=242;
	public static final int LTE_STRING=243;
	public static final int LT_STRING=244;
	public static final int MINUS=245;
	public static final int MT_STRING=246;
	public static final int NEQ=247;
	public static final int NUMBER=248;
	public static final int OCTOTHORPE=249;
	public static final int OLD_NEQ=250;
	public static final int ON=251;
	public static final int P=252;
	public static final int PARAMETER=253;
	public static final int PARAMETERS=254;
	public static final int PLUS=255;
	public static final int PLUS_ARROW=256;
	public static final int PLUS_EQUALS=257;
	public static final int PORT=258;
	public static final int PORT_INPUT=259;
	public static final int PORT_OUTPUT=260;
	public static final int PREDICATE_RELATION=261;
	public static final int PROCEDURE=262;
	public static final int PROCEDURE_CALL=263;
	public static final int Q=264;
	public static final int QCLREF=265;
	public static final int QCREF=266;
	public static final int QQ=267;
	public static final int QUANTITY=268;
	public static final int QUESTION=269;
	public static final int RASS=270;
	public static final int RBRACKET=271;
	public static final int RCON=272;
	public static final int RCURLY=273;
	public static final int REAL_LIT=274;
	public static final int RECORD_TERM=275;
	public static final int ROOT_DECLARATION=276;
	public static final int RPAREN=277;
	public static final int S=278;
	public static final int SEMICOLON=279;
	public static final int SLCOMMENT=280;
	public static final int SOURCE=281;
	public static final int START=282;
	public static final int START_ASSERTION_PROPERTY=283;
	public static final int STOP=284;
	public static final int SUBPROGRAM_ANNEX=285;
	public static final int THREAD_ANNEX=286;
	public static final int TICK=287;
	public static final int TILDE=288;
	public static final int TIMES=289;
	public static final int TOP=290;
	public static final int TRANSITION=291;
	public static final int TRIGGER=292;
	public static final int TYPE=293;
	public static final int TYPE_LIBRARY=294;
	public static final int TYPE_OPERATOR=295;
	public static final int TYPE_OPERATOR_INVOCATION=296;
	public static final int UNARY_MINUS=297;
	public static final int UNIT_FORMULA=298;
	public static final int UNIT_LIBRARY=299;
	public static final int UNIT_NAME=300;
	public static final int VALUE=301;
	public static final int VARIABLE_DECLARATION=302;
	public static final int VERT=303;
	public static final int WP=304;
	public static final int WS=305;

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:226:1: unitName : ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname*);
	public final UnparseBLESS3.unitName_return unitName() throws RecognitionException {
		UnparseBLESS3.unitName_return retval = new UnparseBLESS3.unitName_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST longname=null;
		List<Object> list_longname=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:227:3: ( ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname*))
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
			// 229:5: -> unit_name(id=$id.textlongname=$longname*)
			{
				retval.st = templateLib.getInstanceOf("unit_name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("longname", list_longname*));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:232:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top+)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$top+bottom=$bottom+)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom+));
	public final UnparseBLESS3.unitFormula_return unitFormula() throws RecognitionException {
		UnparseBLESS3.unitFormula_return retval = new UnparseBLESS3.unitFormula_return();
		retval.start = input.LT(1);

		BAST top=null;
		BAST bottom=null;
		List<Object> list_top=null;
		List<Object> list_bottom=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:233:3: ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top+)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$top+bottom=$bottom+)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom+))
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
					// 235:5: -> unit_formula(top=$top+)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top+));
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
					// 238:5: -> unit_formula(top=$top+bottom=$bottom+)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top+).put("bottom", list_bottom+));
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
					// 241:5: -> unit_formula(bottom=$bottom+)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("bottom", list_bottom+));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:248:1: rootDeclaration : ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWords+unit=$unit.stfactors=$factors*)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWords+unit=$unit.stfactors=$factors*));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:249:3: ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWords+unit=$unit.stfactors=$factors*)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWords+unit=$unit.stfactors=$factors*))
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
					// 251:5: -> root_declaration(base=$base.textkindWords=$kindWords+unit=$unit.stfactors=$factors*)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("base", (base!=null?base.getText():null)).put("kindWords", list_kindWords+).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors*));
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
					// 254:5: -> root_declaration(formula=$formula.stkindWords=$kindWords+unit=$unit.stfactors=$factors*)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("formula", (formula!=null?((StringTemplate)formula.getTemplate()):null)).put("kindWords", list_kindWords+).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors*));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:275:1: typeLibrary : (decs+= typeDeclaration )+ -> {$decs};
	public final UnparseBLESS3.typeLibrary_return typeLibrary() throws RecognitionException {
		UnparseBLESS3.typeLibrary_return retval = new UnparseBLESS3.typeLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:275:12: ( (decs+= typeDeclaration )+ -> {$decs})
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
			// 277:5: -> {$decs}
			{
				retval.st = list_decs;
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
			match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration579); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_typeDeclaration583); 
			pushFollow(FOLLOW_type_in_typeDeclaration587);
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
					pushFollow(FOLLOW_enumerationType_in_type626);
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
					pushFollow(FOLLOW_quantityType_in_type639);
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
					pushFollow(FOLLOW_arrayType_in_type652);
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
					pushFollow(FOLLOW_recordType_in_type665);
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
					bo=(BAST)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type678); 
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
					st=(BAST)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type694); 
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
					nu=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type710); 
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:310:1: typeOrReference : (ty= type -> {ty.st}|ref= ID -> {%{$ref.text}});
	public final UnparseBLESS3.typeOrReference_return typeOrReference() throws RecognitionException {
		UnparseBLESS3.typeOrReference_return retval = new UnparseBLESS3.typeOrReference_return();
		retval.start = input.LT(1);

		BAST ref=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:310:16: (ty= type -> {ty.st}|ref= ID -> {%{$ref.text}})
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
					pushFollow(FOLLOW_type_in_typeOrReference737);
					ty=type();
					state._fsp--;

					// TEMPLATE REWRITE
					// 312:5: -> {ty.st}
					{
						retval.st = ty.st;
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:314:3: ref= ID
					{
					ref=(BAST)match(input,ID,FOLLOW_ID_in_typeOrReference757); 
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
			match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType784); 
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
					id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationType788); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType823); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType827); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType852); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType856); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType881); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType885); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType910); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType914); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType917); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType921);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType925);
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType961); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType965); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType968); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType972);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType976);
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1012); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1016); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1019); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1023);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1027);
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1063); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1067); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1070); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1074);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1078);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1082); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1086);
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1127); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1131); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1134); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1138);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1142);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1146); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1150);
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1191); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1195); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1198); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1202);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1206);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1210); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1214);
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1255); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1259); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1262); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1266); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1298); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1302); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1305); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1309); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1341); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1345); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1348); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1352); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1384); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1388); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1391); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1395);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1399);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1403); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1407); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1449); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1453); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1456); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1460);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1464);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1468); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1472); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1514); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1518); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1521); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1525);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1529);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1533); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1537); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1579); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1583); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1586); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1590);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1594);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1598); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1602);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1606); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1610); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1657); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1661); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1664); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1668);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1672);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1676); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1680);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1684); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1688); 
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
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1735); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1739); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1742); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1746);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1750);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1754); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1758);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1762); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1766); 
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
			match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType1822); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_arrayRangeList_in_arrayType1826);
			arl=arrayRangeList();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType1828); 
			pushFollow(FOLLOW_typeOrReference_in_arrayType1832);
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
			if ( (LA21_0==DOTDOT||(LA21_0 >= NUMBER && LA21_0 <= OCTOTHORPE)||LA21_0==QCLREF) ) {
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
					pushFollow(FOLLOW_arrayRange_in_arrayRangeList1865);
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
					match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList1879); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:16: (ranges+= arrayRange )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==DOTDOT||(LA20_0 >= NUMBER && LA20_0 <= OCTOTHORPE)||LA20_0==QCLREF) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:16: ranges+= arrayRange
							{
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList1883);
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
			if ( ((LA22_0 >= NUMBER && LA22_0 <= OCTOTHORPE)||LA22_0==QCLREF) ) {
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
					pushFollow(FOLLOW_aNumber_in_arrayRange1914);
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
					match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange1932); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_arrayRange1936);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_arrayRange1940);
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
					r=(BAST)match(input,LITERAL_record,FOLLOW_LITERAL_record_in_recordType1977); 
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
							pushFollow(FOLLOW_recordField_in_recordType1981);
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
					r=(BAST)match(input,LITERAL_variant,FOLLOW_LITERAL_variant_in_recordType2008); 
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
							pushFollow(FOLLOW_recordField_in_recordType2012);
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
					r=(BAST)match(input,LITERAL_union,FOLLOW_LITERAL_union_in_recordType2039); 
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
							pushFollow(FOLLOW_recordField_in_recordType2043);
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
			match(input,COLON,FOLLOW_COLON_in_recordField2077); 
			match(input, Token.DOWN, null); 
			df=(BAST)match(input,ID,FOLLOW_ID_in_recordField2081); 
			pushFollow(FOLLOW_typeOrReference_in_recordField2085);
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
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2122); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary2126);
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
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2130);
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
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2157); 
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
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2161);
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
			match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables2197); 
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
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables2201);
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
			match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable2234); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_ghostVariable2239); 
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable2243);
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
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2280); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2284); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2288); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2294);
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
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2324); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2328); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2332); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2338); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2342);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2348);
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
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2383); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2387); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2391); 
					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2397); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2401);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2407);
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
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2442); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2446); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2450); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2456); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2460);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2466); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2470);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2476);
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
					match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2516); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2520); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2524); 
					match(input, Token.UP, null); 

					match(input,TILDE,FOLLOW_TILDE_in_namedAssertion2530); 
					match(input, Token.DOWN, null); 
					assertionvariable=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2534); 
					enumerationTy=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2538); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion2544);
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
					pushFollow(FOLLOW_variable_in_variableList2588);
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
					match(input,COMMA,FOLLOW_COMMA_in_variableList2606); 
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
							pushFollow(FOLLOW_variable_in_variableList2610);
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
			match(input,TILDE,FOLLOW_TILDE_in_variable2644); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_variable2648); 
			pushFollow(FOLLOW_typeOrReference_in_variable2652);
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
			if ( (LA34_0==LBRACKET) ) {
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
					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2689);
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
					pushFollow(FOLLOW_expression_in_assertionFunctionValue2705);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:495:1: conditionalAssertionFunction : ^( LBRACKET (cvp+= conditionValuePair )+ RBRACKET ) -> conditional_assertion_function(cvp=$cvp);
	public final UnparseBLESS3.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		UnparseBLESS3.conditionalAssertionFunction_return retval = new UnparseBLESS3.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:496:3: ( ^( LBRACKET (cvp+= conditionValuePair )+ RBRACKET ) -> conditional_assertion_function(cvp=$cvp))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:3: ^( LBRACKET (cvp+= conditionValuePair )+ RBRACKET )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_conditionalAssertionFunction2734); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:18: (cvp+= conditionValuePair )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:18: cvp+= conditionValuePair
					{
					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction2738);
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

			match(input,RBRACKET,FOLLOW_RBRACKET_in_conditionalAssertionFunction2742); 
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
			match(input,CVP,FOLLOW_CVP_in_conditionValuePair2775); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_conditionValuePair2779);
			pred=predicate();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionValuePair2783);
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
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2822); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_invocation_in_assertionEnumeration2826);
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
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2851); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration2855);
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
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2881); 
					match(input, Token.DOWN, null); 
					match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration2885); 
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
							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration2889);
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
			match(input,ARROW,FOLLOW_ARROW_in_enumerationPair2926); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationPair2930); 
			pushFollow(FOLLOW_predicate_in_enumerationPair2934);
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
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation2973); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation2977); 
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
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3002); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3006); 
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
							pushFollow(FOLLOW_actualParameter_in_invocation3010);
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
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3041); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3045); 
					pushFollow(FOLLOW_expression_in_invocation3049);
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
			match(input,COLON,FOLLOW_COLON_in_actualParameter3086); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_actualParameter3090); 
			pushFollow(FOLLOW_expression_in_actualParameter3094);
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
			match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3133); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_namelessAssertion3137);
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
			match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3171); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction3175); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeOrReference_in_namelessFunction3179);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction3185);
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
			match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3223); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_invocation_in_namelessEnumeration3227);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:1: assertion : (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {a.st}|f= namelessFunction -> {f.st}|e= namelessEnumeration -> {e.st});
	public final UnparseBLESS3.assertion_return assertion() throws RecognitionException {
		UnparseBLESS3.assertion_return retval = new UnparseBLESS3.assertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope na =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:10: (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {a.st}|f= namelessFunction -> {f.st}|e= namelessEnumeration -> {e.st})
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
					pushFollow(FOLLOW_namedAssertion_in_assertion3256);
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
					pushFollow(FOLLOW_namelessAssertion_in_assertion3272);
					a=namelessAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 565:5: -> {a.st}
					{
						retval.st = a.st;
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:566:5: f= namelessFunction
					{
					pushFollow(FOLLOW_namelessFunction_in_assertion3288);
					f=namelessFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 567:5: -> {f.st}
					{
						retval.st = f.st;
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:568:5: e= namelessEnumeration
					{
					pushFollow(FOLLOW_namelessEnumeration_in_assertion3304);
					e=namelessEnumeration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 569:5: -> {e.st}
					{
						retval.st = e.st;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:574:1: expression : (all= universalQuantification -> {all.st}|exists= existentialQuantification -> {exists.st}|sum= sumQuantification -> {sum.st}|product= productQuantification -> {product.st}|numberof= countingQuantification -> {numberof.st}| ^( LITERAL_iff l= disjunction r= disjunction ) | ^( LITERAL_implies l= disjunction r= disjunction ) );
	public final UnparseBLESS3.expression_return expression() throws RecognitionException {
		UnparseBLESS3.expression_return retval = new UnparseBLESS3.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope all =null;
		TreeRuleReturnScope exists =null;
		TreeRuleReturnScope sum =null;
		TreeRuleReturnScope product =null;
		TreeRuleReturnScope numberof =null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:575:2: (all= universalQuantification -> {all.st}|exists= existentialQuantification -> {exists.st}|sum= sumQuantification -> {sum.st}|product= productQuantification -> {product.st}|numberof= countingQuantification -> {numberof.st}| ^( LITERAL_iff l= disjunction r= disjunction ) | ^( LITERAL_implies l= disjunction r= disjunction ) )
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
					pushFollow(FOLLOW_universalQuantification_in_expression3336);
					all=universalQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 577:5: -> {all.st}
					{
						retval.st = all.st;
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:578:5: exists= existentialQuantification
					{
					pushFollow(FOLLOW_existentialQuantification_in_expression3352);
					exists=existentialQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 579:5: -> {exists.st}
					{
						retval.st = exists.st;
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:580:5: sum= sumQuantification
					{
					pushFollow(FOLLOW_sumQuantification_in_expression3368);
					sum=sumQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 581:5: -> {sum.st}
					{
						retval.st = sum.st;
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:582:5: product= productQuantification
					{
					pushFollow(FOLLOW_productQuantification_in_expression3384);
					product=productQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 583:5: -> {product.st}
					{
						retval.st = product.st;
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:584:5: numberof= countingQuantification
					{
					pushFollow(FOLLOW_countingQuantification_in_expression3400);
					numberof=countingQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 585:5: -> {numberof.st}
					{
						retval.st = numberof.st;
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:586:5: ^( LITERAL_iff l= disjunction r= disjunction )
					{
					match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression3416); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3420);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3424);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:587:5: ^( LITERAL_implies l= disjunction r= disjunction )
					{
					match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression3434); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3438);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3442);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:590:1: universalQuantification : ^( LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) ;
	public final UnparseBLESS3.universalQuantification_return universalQuantification() throws RecognitionException {
		UnparseBLESS3.universalQuantification_return retval = new UnparseBLESS3.universalQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:591:3: ( ^( LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:592:3: ^( LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification3461); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_universalQuantification3465);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_universalQuantification3469);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification3473); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_universalQuantification3477);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:595:1: in_which : ( ^( LITERAL_in r= range ) | ^( LITERAL_which b= predicate ) );
	public final UnparseBLESS3.in_which_return in_which() throws RecognitionException {
		UnparseBLESS3.in_which_return retval = new UnparseBLESS3.in_which_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope b =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:596:3: ( ^( LITERAL_in r= range ) | ^( LITERAL_which b= predicate ) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:597:3: ^( LITERAL_in r= range )
					{
					match(input,LITERAL_in,FOLLOW_LITERAL_in_in_in_which3498); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_range_in_in_which3502);
					r=range();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:599:3: ^( LITERAL_which b= predicate )
					{
					match(input,LITERAL_which,FOLLOW_LITERAL_which_in_in_which3514); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_in_which3518);
					b=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:602:1: existentialQuantification : ^( LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) ;
	public final UnparseBLESS3.existentialQuantification_return existentialQuantification() throws RecognitionException {
		UnparseBLESS3.existentialQuantification_return retval = new UnparseBLESS3.existentialQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:603:3: ( ^( LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:604:3: ^( LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification3537); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_existentialQuantification3541);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_existentialQuantification3545);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_existentialQuantification3549); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_existentialQuantification3553);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:607:1: sumQuantification : ^( LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) ;
	public final UnparseBLESS3.sumQuantification_return sumQuantification() throws RecognitionException {
		UnparseBLESS3.sumQuantification_return retval = new UnparseBLESS3.sumQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:608:3: ( ^( LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:609:3: ^( LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification3573); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_sumQuantification3577);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_sumQuantification3581);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification3585); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sumQuantification3589);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:612:1: productQuantification : ^( LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) ;
	public final UnparseBLESS3.productQuantification_return productQuantification() throws RecognitionException {
		UnparseBLESS3.productQuantification_return retval = new UnparseBLESS3.productQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:613:3: ( ^( LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:614:3: ^( LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification3611); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_productQuantification3615);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_productQuantification3619);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification3623); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_productQuantification3627);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:617:1: countingQuantification : ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) ;
	public final UnparseBLESS3.countingQuantification_return countingQuantification() throws RecognitionException {
		UnparseBLESS3.countingQuantification_return retval = new UnparseBLESS3.countingQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:618:3: ( ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:619:3: ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification3650); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_countingQuantification3654);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_countingQuantification3658);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_countingQuantification3662); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_countingQuantification3666);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:622:1: logicVariables : ( ^( COMMA (lv+= variable )+ ) |v= variable );
	public final UnparseBLESS3.logicVariables_return logicVariables() throws RecognitionException {
		UnparseBLESS3.logicVariables_return retval = new UnparseBLESS3.logicVariables_return();
		retval.start = input.LT(1);

		List<Object> list_lv=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope lv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:623:3: ( ^( COMMA (lv+= variable )+ ) |v= variable )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:624:3: ^( COMMA (lv+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_logicVariables3690); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:624:14: (lv+= variable )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:624:14: lv+= variable
							{
							pushFollow(FOLLOW_variable_in_logicVariables3694);
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

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:626:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_logicVariables3707);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:629:1: disjunction : ( ^( LITERAL_or (c+= conjunction )+ ) | ^( LITERAL_else (c+= conjunction )+ ) | ^( LITERAL_xor (c+= conjunction )+ ) |con= conjunction );
	public final UnparseBLESS3.disjunction_return disjunction() throws RecognitionException {
		UnparseBLESS3.disjunction_return retval = new UnparseBLESS3.disjunction_return();
		retval.start = input.LT(1);

		List<Object> list_c=null;
		TreeRuleReturnScope con =null;
		RuleReturnScope c = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:630:3: ( ^( LITERAL_or (c+= conjunction )+ ) | ^( LITERAL_else (c+= conjunction )+ ) | ^( LITERAL_xor (c+= conjunction )+ ) |con= conjunction )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:631:3: ^( LITERAL_or (c+= conjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction3728); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:631:18: (c+= conjunction )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:631:18: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction3732);
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

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:3: ^( LITERAL_else (c+= conjunction )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction3745); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:20: (c+= conjunction )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:20: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction3749);
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

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:635:3: ^( LITERAL_xor (c+= conjunction )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction3762); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:635:19: (c+= conjunction )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:635:19: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction3766);
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

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:637:3: con= conjunction
					{
					pushFollow(FOLLOW_conjunction_in_disjunction3779);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:640:1: conjunction : ( ^( LITERAL_and (r+= relation )+ ) | ^( LITERAL_then (r+= relation )+ ) |rel= relation );
	public final UnparseBLESS3.conjunction_return conjunction() throws RecognitionException {
		UnparseBLESS3.conjunction_return retval = new UnparseBLESS3.conjunction_return();
		retval.start = input.LT(1);

		List<Object> list_r=null;
		TreeRuleReturnScope rel =null;
		RuleReturnScope r = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:641:3: ( ^( LITERAL_and (r+= relation )+ ) | ^( LITERAL_then (r+= relation )+ ) |rel= relation )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:642:3: ^( LITERAL_and (r+= relation )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction3798); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:642:19: (r+= relation )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:642:19: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction3802);
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

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:3: ^( LITERAL_then (r+= relation )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction3815); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:20: (r+= relation )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:20: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction3819);
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

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:646:3: rel= relation
					{
					pushFollow(FOLLOW_relation_in_conjunction3832);
					rel=relation();
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
	// $ANTLR end "conjunction"


	public static class relation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:649:2: relation : ( ^( EQ lhs= addSub rhs= addSub ) -> equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"| ^( AM lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"| ^( AL lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"| ^( GT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"| ^( PLUS_EQUALS lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"| ^( NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( OLD_NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)|as= addSub -> {$as.st});
	public final UnparseBLESS3.relation_return relation() throws RecognitionException {
		UnparseBLESS3.relation_return retval = new UnparseBLESS3.relation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lhs =null;
		TreeRuleReturnScope rhs =null;
		TreeRuleReturnScope as =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:650:3: ( ^( EQ lhs= addSub rhs= addSub ) -> equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"| ^( AM lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"| ^( AL lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"| ^( GT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"| ^( PLUS_EQUALS lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"| ^( NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( OLD_NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)|as= addSub -> {$as.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:651:3: ^( EQ lhs= addSub rhs= addSub )
					{
					match(input,EQ,FOLLOW_EQ_in_relation3851); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation3856);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation3860);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 652:5: -> equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:654:3: ^( LT lhs= addSub rhs= addSub )
					{
					match(input,LT,FOLLOW_LT_in_relation3890); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation3895);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation3899);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 655:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\< <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:657:3: ^( AM lhs= addSub rhs= addSub )
					{
					match(input,AM,FOLLOW_AM_in_relation3931); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation3936);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation3940);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 658:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\<= <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:660:3: ^( AL lhs= addSub rhs= addSub )
					{
					match(input,AL,FOLLOW_AL_in_relation3972); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation3977);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation3981);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 661:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\>= <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:663:3: ^( GT lhs= addSub rhs= addSub )
					{
					match(input,GT,FOLLOW_GT_in_relation4013); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4018);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4022);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 664:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\> <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:666:3: ^( PLUS_EQUALS lhs= addSub rhs= addSub )
					{
					match(input,PLUS_EQUALS,FOLLOW_PLUS_EQUALS_in_relation4054); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4059);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4063);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 667:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> += <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:669:3: ^( NEQ lhs= addSub rhs= addSub )
					{
					match(input,NEQ,FOLLOW_NEQ_in_relation4095); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4100);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4104);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 670:5: -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("not_equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:672:3: ^( OLD_NEQ lhs= addSub rhs= addSub )
					{
					match(input,OLD_NEQ,FOLLOW_OLD_NEQ_in_relation4134); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4139);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4143);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 673:5: -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("not_equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:675:3: as= addSub
					{
					pushFollow(FOLLOW_addSub_in_relation4172);
					as=addSub();
					state._fsp--;

					// TEMPLATE REWRITE
					// 676:5: -> {$as.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:679:1: range : ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:3: ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:681:3: ^(dd= DOTDOT lb= subexpression ub= subexpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_range4199); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4203);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4207);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 682:5: -> range(rs=$dd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dd!=null?dd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:684:4: ^(cd= COMMADOT lb= subexpression ub= subexpression )
					{
					cd=(BAST)match(input,COMMADOT,FOLLOW_COMMADOT_in_range4245); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4249);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4253);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 685:5: -> range(rs=$cd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cd!=null?cd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:687:4: ^(dc= DOTCOMMA lb= subexpression ub= subexpression )
					{
					dc=(BAST)match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_range4291); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4295);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4299);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 688:5: -> range(rs=$dc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dc!=null?dc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:690:4: ^(cc= COMMACOMMA lb= subexpression ub= subexpression )
					{
					cc=(BAST)match(input,COMMACOMMA,FOLLOW_COMMACOMMA_in_range4337); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4341);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4345);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 691:5: -> range(rs=$cc.textlb=$lb.stub=$ub.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:694:1: addSub : ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st});
	public final UnparseBLESS3.addSub_return addSub() throws RecognitionException {
		UnparseBLESS3.addSub_return retval = new UnparseBLESS3.addSub_return();
		retval.start = input.LT(1);

		List<Object> list_md=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope m =null;
		RuleReturnScope md = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:3: ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:696:3: ^( PLUS (md+= multDiv )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_addSub4388); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:696:13: (md+= multDiv )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:696:13: md+= multDiv
							{
							pushFollow(FOLLOW_multDiv_in_addSub4392);
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
					// 697:5: -> add(terms=$md)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_md));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:699:3: ^( MINUS l= multDiv r= multDiv )
					{
					match(input,MINUS,FOLLOW_MINUS_in_addSub4418); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_multDiv_in_addSub4422);
					l=multDiv();
					state._fsp--;

					pushFollow(FOLLOW_multDiv_in_addSub4426);
					r=multDiv();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 700:5: -> template(l=$l.str=$r.st) \"<l> - <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> - <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:702:3: m= multDiv
					{
					pushFollow(FOLLOW_multDiv_in_addSub4458);
					m=multDiv();
					state._fsp--;

					// TEMPLATE REWRITE
					// 703:5: -> {$m.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:706:1: multDiv : ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st});
	public final UnparseBLESS3.multDiv_return multDiv() throws RecognitionException {
		UnparseBLESS3.multDiv_return retval = new UnparseBLESS3.multDiv_return();
		retval.start = input.LT(1);

		List<Object> list_exp=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;
		RuleReturnScope exp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:707:3: ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:708:3: ^( TIMES (exp+= exponentiation )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multDiv4489); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:708:15: (exp+= exponentiation )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:708:15: exp+= exponentiation
							{
							pushFollow(FOLLOW_exponentiation_in_multDiv4493);
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
					// 709:5: -> multiply(terms=$exp)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_exp));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:711:3: ^( DIVIDE l= exponentiation r= exponentiation )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multDiv4519); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4523);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4527);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 712:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:714:3: ^( LITERAL_div l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_div,FOLLOW_LITERAL_div_in_multDiv4559); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4563);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4567);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 715:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:717:3: ^( LITERAL_mod l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_multDiv4599); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4603);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4607);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 718:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:720:3: ^( LITERAL_rem l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_multDiv4639); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4643);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4647);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 721:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:723:3: e= exponentiation
					{
					pushFollow(FOLLOW_exponentiation_in_multDiv4679);
					e=exponentiation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 724:5: -> {$e.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:728:1: exponentiation : ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st});
	public final UnparseBLESS3.exponentiation_return exponentiation() throws RecognitionException {
		UnparseBLESS3.exponentiation_return retval = new UnparseBLESS3.exponentiation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope s =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:729:3: ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:730:3: ^( EXP l= subexpression r= subexpression )
					{
					match(input,EXP,FOLLOW_EXP_in_exponentiation4711); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_exponentiation4715);
					l=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_exponentiation4719);
					r=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 731:5: -> template(l=$l.str=$r.st) \"<l> ** <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> ** <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:733:3: s= subexpression
					{
					pushFollow(FOLLOW_subexpression_in_exponentiation4751);
					s=subexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 734:5: -> {$s.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:737:1: subexpression : ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:738:3: ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:739:3: ^(n= LITERAL_not te= timedExpression )
					{
					n=(BAST)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression4782); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression4786);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 740:5: -> unary(sym=$n.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (n!=null?n.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:742:3: ^(m= UNARY_MINUS te= timedExpression )
					{
					m=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_subexpression4818); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression4822);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 743:5: -> unary(sym=$m.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (m!=null?m.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:745:3: ^(s= LITERAL_abs te= timedExpression )
					{
					s=(BAST)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression4854); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression4858);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 746:5: -> unary(sym=$s.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (s!=null?s.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:748:3: ^(t= LITERAL_truncate te= timedExpression )
					{
					t=(BAST)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression4890); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression4894);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 749:5: -> unary(sym=$t.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (t!=null?t.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:751:3: ^(r= LITERAL_round te= timedExpression )
					{
					r=(BAST)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression4926); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression4930);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 752:5: -> unary(sym=$r.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (r!=null?r.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:754:3: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression4960);
					te=timedExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 755:5: -> {$te.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:758:1: timedExpression : ( ^( TICK ts= timedSubject ) -> tick(tp=ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st});
	public final UnparseBLESS3.timedExpression_return timedExpression() throws RecognitionException {
		UnparseBLESS3.timedExpression_return retval = new UnparseBLESS3.timedExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:759:3: ( ^( TICK ts= timedSubject ) -> tick(tp=ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:760:3: ^( TICK ts= timedSubject )
					{
					match(input,TICK,FOLLOW_TICK_in_timedExpression4990); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression4994);
					ts=timedSubject();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 761:5: -> tick(tp=ts.st)
					{
						retval.st = templateLib.getInstanceOf("tick",new STAttrMap().put("tp", ts.st));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:763:3: ^( AT_SIGN ts= timedSubject se= subexpression )
					{
					match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5019); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5023);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_timedExpression5027);
					se=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 764:5: -> at(p=$ts.stt=$se.st)
					{
						retval.st = templateLib.getInstanceOf("at",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("t", (se!=null?((StringTemplate)se.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:766:3: ^( CARET ts= timedSubject ps= periodShift )
					{
					match(input,CARET,FOLLOW_CARET_in_timedExpression5057); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5061);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_timedExpression5065);
					ps=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 767:5: -> caret(p=$ts.stcv=$ps.st)
					{
						retval.st = templateLib.getInstanceOf("caret",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("cv", (ps!=null?((StringTemplate)ps.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:769:3: ts= timedSubject
					{
					pushFollow(FOLLOW_timedSubject_in_timedExpression5095);
					ts=timedSubject();
					state._fsp--;

					// TEMPLATE REWRITE
					// 770:5: -> {$ts.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:773:1: timedSubject : (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st});
	public final UnparseBLESS3.timedSubject_return timedSubject() throws RecognitionException {
		UnparseBLESS3.timedSubject_return retval = new UnparseBLESS3.timedSubject_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ce =null;
		TreeRuleReturnScope ps =null;
		TreeRuleReturnScope rt =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:774:3: (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st})
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
					else if ( (LA61_5==LITERAL_all||LA61_5==LITERAL_exists||LA61_5==LITERAL_iff||LA61_5==LITERAL_implies||LA61_5==LITERAL_numberof||LA61_5==LITERAL_product||LA61_5==LITERAL_sum) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:775:3: ce= conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5122);
					ce=conditionalExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 776:5: -> {$ce.st}
					{
						retval.st = (ce!=null?((StringTemplate)ce.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:777:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5138);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 778:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:779:5: rt= recordTerm
					{
					pushFollow(FOLLOW_recordTerm_in_timedSubject5155);
					rt=recordTerm();
					state._fsp--;

					// TEMPLATE REWRITE
					// 780:5: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:781:5: inv= invocation
					{
					pushFollow(FOLLOW_invocation_in_timedSubject5171);
					inv=invocation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 782:5: -> {$inv.st}
					{
						retval.st = (inv!=null?((StringTemplate)inv.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:783:5: v= value
					{
					pushFollow(FOLLOW_value_in_timedSubject5189);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 784:5: -> {$v.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:787:1: periodShift : ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st));
	public final UnparseBLESS3.periodShift_return periodShift() throws RecognitionException {
		UnparseBLESS3.periodShift_return retval = new UnparseBLESS3.periodShift_return();
		retval.start = input.LT(1);

		BAST um=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:788:3: ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:789:3: ^(um= UNARY_MINUS v= value )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5218); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_value_in_periodShift5222);
					v=value();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 790:5: -> unary(sym=$um.textex=v.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", v.st));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:792:3: ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5254); 
					match(input, Token.DOWN, null); 
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5258); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5262);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5264); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 793:5: -> unary_paren(sym=$um.textex=v.st)
					{
						retval.st = templateLib.getInstanceOf("unary_paren",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", v.st));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:795:3: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift5296);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 796:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:798:3: ^( LPAREN ie= indexExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5314); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5318);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5320); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 799:5: -> parentheses(be=$ie.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:802:1: indexExpression : ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps));
	public final UnparseBLESS3.indexExpression_return indexExpression() throws RecognitionException {
		UnparseBLESS3.indexExpression_return retval = new UnparseBLESS3.indexExpression_return();
		retval.start = input.LT(1);

		BAST m=null;
		List<Object> list_ps=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		RuleReturnScope ps = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:803:3: ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:804:3: ^(m= MINUS l= periodShift r= periodShift )
					{
					m=(BAST)match(input,MINUS,FOLLOW_MINUS_in_indexExpression5356); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5360);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5364);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 805:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:807:3: ^(m= LITERAL_div l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression5398); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5402);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5406);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 808:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:810:3: ^(m= LITERAL_mod l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression5440); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5444);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5448);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 811:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:813:3: ^(m= LITERAL_rem l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression5482); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5486);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5490);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 814:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:816:3: ^( PLUS (ps+= periodShift )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_indexExpression5522); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:816:13: (ps+= periodShift )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:816:13: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression5526);
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
					// 817:5: -> add(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:819:3: ^( TIMES (ps+= periodShift )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_indexExpression5552); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:819:14: (ps+= periodShift )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:819:14: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression5556);
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
					// 820:5: -> multiply(terms=$ps)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:823:1: conditionalExpression : ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st);
	public final UnparseBLESS3.conditionalExpression_return conditionalExpression() throws RecognitionException {
		UnparseBLESS3.conditionalExpression_return retval = new UnparseBLESS3.conditionalExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope f =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:824:3: ( ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:825:3: ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN )
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression5591); 
			match(input, Token.DOWN, null); 
			match(input,QQ,FOLLOW_QQ_in_conditionalExpression5595); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_conditionalExpression5599);
			pred=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression5603);
			t=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression5607);
			f=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression5612); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 826:5: -> conditional_expression(be=$pred.stt=$t.stf=$f.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:829:1: parenthesizedSubexpression : ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st);
	public final UnparseBLESS3.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		UnparseBLESS3.parenthesizedSubexpression_return retval = new UnparseBLESS3.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:830:3: ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:831:3: ^( LPAREN ex= expression RPAREN )
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression5658); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5662);
			ex=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression5664); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 832:5: -> parentheses(be=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
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
	// $ANTLR end "parenthesizedSubexpression"


	public static class recordTerm_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:835:1: recordTerm : ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$.textprv=$prv);
	public final UnparseBLESS3.recordTerm_return recordTerm() throws RecognitionException {
		UnparseBLESS3.recordTerm_return retval = new UnparseBLESS3.recordTerm_return();
		retval.start = input.LT(1);

		BAST typeid=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:836:3: ( ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$.textprv=$prv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:837:3: ^( RECORD_TERM typeid= ID (prv+= recordValue )+ )
			{
			match(input,RECORD_TERM,FOLLOW_RECORD_TERM_in_recordTerm5700); 
			match(input, Token.DOWN, null); 
			typeid=(BAST)match(input,ID,FOLLOW_ID_in_recordTerm5704); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:837:31: (prv+= recordValue )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==ARROW) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:837:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm5708);
					prv=recordValue();
					state._fsp--;

					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTemplate());
					}
					break;

				default :
					if ( cnt66 >= 1 ) break loop66;
					EarlyExitException eee = new EarlyExitException(66, input);
					throw eee;
				}
				cnt66++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 838:5: -> record_term(typeid=$.textprv=$prv)
			{
				retval.st = templateLib.getInstanceOf("record_term",new STAttrMap().put("typeid", $.text).put("prv", list_prv));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:841:1: recordValue : ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st);
	public final UnparseBLESS3.recordValue_return recordValue() throws RecognitionException {
		UnparseBLESS3.recordValue_return retval = new UnparseBLESS3.recordValue_return();
		retval.start = input.LT(1);

		BAST field=null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:842:3: ( ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:843:3: ^( ARROW field= ID v= value )
			{
			match(input,ARROW,FOLLOW_ARROW_in_recordValue5747); 
			match(input, Token.DOWN, null); 
			field=(BAST)match(input,ID,FOLLOW_ID_in_recordValue5751); 
			pushFollow(FOLLOW_value_in_recordValue5755);
			v=value();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 844:5: -> record_value(id=$field.textv=$v.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:847:1: predicate : expression ;
	public final UnparseBLESS3.predicate_return predicate() throws RecognitionException {
		UnparseBLESS3.predicate_return retval = new UnparseBLESS3.predicate_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:848:3: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:849:3: expression
			{
			pushFollow(FOLLOW_expression_in_predicate5792);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:854:1: value : (vn= valueName -> {$vn.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}});
	public final UnparseBLESS3.value_return value() throws RecognitionException {
		UnparseBLESS3.value_return retval = new UnparseBLESS3.value_return();
		retval.start = input.LT(1);

		BAST to=null;
		BAST n=null;
		BAST t=null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope c =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:855:3: (vn= valueName -> {$vn.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}})
			int alt67=5;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt67=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt67=2;
				}
				break;
			case LITERAL_timeout:
				{
				alt67=3;
				}
				break;
			case LITERAL_now:
				{
				alt67=4;
				}
				break;
			case LITERAL_tops:
				{
				alt67=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}
			switch (alt67) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:856:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_value5813);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 857:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:859:3: c= constant
					{
					pushFollow(FOLLOW_constant_in_value5831);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 860:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:862:3: to= LITERAL_timeout
					{
					to=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value5849); 
					// TEMPLATE REWRITE
					// 863:5: -> {%{$to.text}}
					{
						retval.st = new StringTemplate(templateLib,(to!=null?to.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:865:3: n= LITERAL_now
					{
					n=(BAST)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value5867); 
					// TEMPLATE REWRITE
					// 866:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:868:3: t= LITERAL_tops
					{
					t=(BAST)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value5885); 
					// TEMPLATE REWRITE
					// 869:5: -> {%{$t.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:1: valueName : ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:873:3: ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}})
			int alt71=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA71_1 = input.LA(2);
				if ( (LA71_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case DOLLAR:
						{
						alt71=1;
						}
						break;
					case LBRACKET:
						{
						alt71=2;
						}
						break;
					case DOT:
						{
						alt71=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 71, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( ((LA71_1 >= UP && LA71_1 <= AADL_STRING_LITERAL)||(LA71_1 >= AL && LA71_1 <= AM)||LA71_1==AT_SIGN||LA71_1==CARET||LA71_1==COLON||LA71_1==DIVIDE||LA71_1==EQ||LA71_1==EXP||LA71_1==GT||LA71_1==ID||LA71_1==INVOKE||LA71_1==LITERAL_abs||(LA71_1 >= LITERAL_all && LA71_1 <= LITERAL_any)||LA71_1==LITERAL_div||LA71_1==LITERAL_else||LA71_1==LITERAL_exists||LA71_1==LITERAL_false||LA71_1==LITERAL_iff||LA71_1==LITERAL_implies||LA71_1==LITERAL_mod||(LA71_1 >= LITERAL_not && LA71_1 <= LITERAL_now)||(LA71_1 >= LITERAL_null && LA71_1 <= LITERAL_numberof)||LA71_1==LITERAL_or||LA71_1==LITERAL_product||LA71_1==LITERAL_rem||LA71_1==LITERAL_round||LA71_1==LITERAL_sum||LA71_1==LITERAL_then||LA71_1==LITERAL_timeout||LA71_1==LITERAL_tops||(LA71_1 >= LITERAL_true && LA71_1 <= LITERAL_truncate)||(LA71_1 >= LITERAL_xor && LA71_1 <= LT)||LA71_1==MINUS||LA71_1==NEQ||LA71_1==OLD_NEQ||LA71_1==PLUS||LA71_1==PLUS_EQUALS||(LA71_1 >= QUANTITY && LA71_1 <= QUESTION)||LA71_1==RECORD_TERM||LA71_1==TICK||LA71_1==TIMES||LA71_1==UNARY_MINUS) ) {
					alt71=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case QUESTION:
				{
				alt71=4;
				}
				break;
			case TICK:
				{
				int LA71_3 = input.LA(2);
				if ( (LA71_3==DOWN) ) {
					int LA71_6 = input.LA(3);
					if ( (LA71_6==ID) ) {
						switch ( input.LA(4) ) {
						case LITERAL_fresh:
							{
							alt71=5;
							}
							break;
						case LITERAL_count:
							{
							alt71=6;
							}
							break;
						case LITERAL_updated:
							{
							alt71=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 71, 10, input);
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
								new NoViableAltException("", 71, 6, input);
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
							new NoViableAltException("", 71, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:874:3: ^(id= ID DOLLAR pr= functionParameters )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName5912); 
					match(input, Token.DOWN, null); 
					match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName5914); 
					pushFollow(FOLLOW_functionParameters_in_valueName5918);
					pr=functionParameters();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 875:5: -> function_call(f=$id.textpl=$pr.st)
					{
						retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (pr!=null?((StringTemplate)pr.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:3: ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName5950); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName5954); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:35: (array_index+= indexExpressionOrRange )+
					int cnt68=0;
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==DOTDOT||LA68_0==LITERAL_div||LA68_0==LITERAL_mod||LA68_0==LITERAL_rem||LA68_0==MINUS||LA68_0==PLUS||LA68_0==TIMES) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:35: array_index+= indexExpressionOrRange
							{
							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName5958);
							array_index=indexExpressionOrRange();
							state._fsp--;

							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTemplate());
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

					match(input,DOT,FOLLOW_DOT_in_valueName5965); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:72: (pn+= partialName )*
						loop69:
						while (true) {
							int alt69=2;
							int LA69_0 = input.LA(1);
							if ( (LA69_0==ID) ) {
								alt69=1;
							}

							switch (alt69) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:72: pn+= partialName
								{
								pushFollow(FOLLOW_partialName_in_valueName5969);
								pn=partialName();
								state._fsp--;

								if (list_pn==null) list_pn=new ArrayList<Object>();
								list_pn.add(pn.getTemplate());
								}
								break;

							default :
								break loop69;
							}
						}

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 878:5: -> name(id=$id.textindex=$array_indexrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("index", list_array_index).put("rec", list_pn));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:880:3: ^(id= ID ^( DOT (pn+= partialName )+ ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6010); 
					match(input, Token.DOWN, null); 
					match(input,DOT,FOLLOW_DOT_in_valueName6014); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:880:21: (pn+= partialName )+
					int cnt70=0;
					loop70:
					while (true) {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==ID) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:880:21: pn+= partialName
							{
							pushFollow(FOLLOW_partialName_in_valueName6018);
							pn=partialName();
							state._fsp--;

							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTemplate());
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

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 881:5: -> name(id=$id.textrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("rec", list_pn));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:883:3: ^(q= QUESTION id= ID )
					{
					q=(BAST)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6054); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6058); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 884:5: -> template(id=$id.text) \"<id>?\"
					{
						retval.st = new StringTemplate(templateLib, "<id>?",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:886:3: ^( TICK id= ID LITERAL_fresh )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6085); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6089); 
					match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6091); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 887:5: -> port_fresh(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_fresh",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:889:3: ^( TICK id= ID LITERAL_count )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6116); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6120); 
					match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6122); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 890:5: -> port_count(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_count",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:892:3: ^( TICK id= ID LITERAL_updated )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6147); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6151); 
					match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6153); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 893:5: -> port_updated(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_updated",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:895:3: id= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6178); 
					// TEMPLATE REWRITE
					// 896:5: -> {%{$id.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:899:1: functionParameters : ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st});
	public final UnparseBLESS3.functionParameters_return functionParameters() throws RecognitionException {
		UnparseBLESS3.functionParameters_return retval = new UnparseBLESS3.functionParameters_return();
		retval.start = input.LT(1);

		List<Object> list_parameters=null;
		TreeRuleReturnScope parameter =null;
		RuleReturnScope parameters = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:900:3: ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st})
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==COMMA) ) {
				alt72=1;
			}
			else if ( (LA72_0==COLON) ) {
				alt72=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}

			switch (alt72) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:901:3: ^( COMMA parameters+= formalExpressionPair )
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParameters6203); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6207);
					parameters=formalExpressionPair();
					state._fsp--;

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTemplate());
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 902:5: -> array_range_list(r=$parameters)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_parameters));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:904:3: parameter= formalExpressionPair
					{
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6232);
					parameter=formalExpressionPair();
					state._fsp--;

					// TEMPLATE REWRITE
					// 905:5: -> {$parameter.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:908:1: formalExpressionPair : ^( COLON formal= ID actual= expression ) -> formal_actual(f=$id.textap=$actual.st);
	public final UnparseBLESS3.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		UnparseBLESS3.formalExpressionPair_return retval = new UnparseBLESS3.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:909:3: ( ^( COLON formal= ID actual= expression ) -> formal_actual(f=$id.textap=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:910:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6257); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_formalExpressionPair6261); 
			pushFollow(FOLLOW_expression_in_formalExpressionPair6265);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 911:5: -> formal_actual(f=$id.textap=$actual.st)
			{
				retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", $id.text).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:1: indexExpressionOrRange : ( ^( DOTDOT lb= indexExpression up= indexExpression ) |index= indexExpression );
	public final UnparseBLESS3.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		UnparseBLESS3.indexExpressionOrRange_return retval = new UnparseBLESS3.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope up =null;
		TreeRuleReturnScope index =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:915:3: ( ^( DOTDOT lb= indexExpression up= indexExpression ) |index= indexExpression )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==DOTDOT) ) {
				alt73=1;
			}
			else if ( (LA73_0==LITERAL_div||LA73_0==LITERAL_mod||LA73_0==LITERAL_rem||LA73_0==MINUS||LA73_0==PLUS||LA73_0==TIMES) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:916:3: ^( DOTDOT lb= indexExpression up= indexExpression )
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6306); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6310);
					lb=indexExpression();
					state._fsp--;

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6314);
					up=indexExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:918:3: index= indexExpression
					{
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6326);
					index=indexExpression();
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
	// $ANTLR end "indexExpressionOrRange"


	public static class partialName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "partialName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:921:1: partialName : ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}});
	public final UnparseBLESS3.partialName_return partialName() throws RecognitionException {
		UnparseBLESS3.partialName_return retval = new UnparseBLESS3.partialName_return();
		retval.start = input.LT(1);

		BAST record_id=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:922:3: ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}})
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==ID) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==DOWN) ) {
					alt74=1;
				}
				else if ( (LA74_1==UP||LA74_1==ID) ) {
					alt74=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:3: ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) )
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName6345); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6349); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6353);
					array_index=indexExpressionOrRange();
					state._fsp--;

					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTemplate());
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 924:5: -> partial_name(i=$record_id.textp=$array_index)
					{
						retval.st = templateLib.getInstanceOf("partial_name",new STAttrMap().put("i", (record_id!=null?record_id.getText():null)).put("p", list_array_index));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:926:3: record_id= ID
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName6385); 
					// TEMPLATE REWRITE
					// 927:5: -> {%{$record_id.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:931:1: constant : ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null );
	public final UnparseBLESS3.constant_return constant() throws RecognitionException {
		UnparseBLESS3.constant_return retval = new UnparseBLESS3.constant_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:932:3: ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null )
			int alt75=5;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt75=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt75=2;
				}
				break;
			case LITERAL_true:
				{
				alt75=3;
				}
				break;
			case LITERAL_false:
				{
				alt75=4;
				}
				break;
			case LITERAL_null:
				{
				alt75=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:933:3: quantity
					{
					pushFollow(FOLLOW_quantity_in_constant6410);
					quantity();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:935:3: AADL_STRING_LITERAL
					{
					match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant6418); 
					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:937:3: LITERAL_true
					{
					match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant6426); 
					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:939:3: LITERAL_false
					{
					match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant6434); 
					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:941:3: LITERAL_null
					{
					match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant6442); 
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:944:1: quantity : ( ^( QUANTITY number= aNumber ) -> {$number.st}| ^( QUANTITY number= aNumber unit= ID ) -> template(number=$number.stunit=$unit.st) \"<number> <unit>\"| ^( QUANTITY number= aNumber LITERAL_scalar ) -> template(number=$number.st) \"<number> scalar\"| ^( QUANTITY number= aNumber LITERAL_whole ) -> template(number=$number.st) \"<number> whole\");
	public final UnparseBLESS3.quantity_return quantity() throws RecognitionException {
		UnparseBLESS3.quantity_return retval = new UnparseBLESS3.quantity_return();
		retval.start = input.LT(1);

		BAST unit=null;
		TreeRuleReturnScope number =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:945:3: ( ^( QUANTITY number= aNumber ) -> {$number.st}| ^( QUANTITY number= aNumber unit= ID ) -> template(number=$number.stunit=$unit.st) \"<number> <unit>\"| ^( QUANTITY number= aNumber LITERAL_scalar ) -> template(number=$number.st) \"<number> scalar\"| ^( QUANTITY number= aNumber LITERAL_whole ) -> template(number=$number.st) \"<number> whole\")
			int alt76=4;
			alt76 = dfa76.predict(input);
			switch (alt76) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:946:3: ^( QUANTITY number= aNumber )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity6459); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity6463);
					number=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 947:5: -> {$number.st}
					{
						retval.st = (number!=null?((StringTemplate)number.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:949:3: ^( QUANTITY number= aNumber unit= ID )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity6483); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity6487);
					number=aNumber();
					state._fsp--;

					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantity6491); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 950:5: -> template(number=$number.stunit=$unit.st) \"<number> <unit>\"
					{
						retval.st = new StringTemplate(templateLib, "<number> <unit>",new STAttrMap().put("number", (number!=null?((StringTemplate)number.getTemplate()):null)).put("unit", unit.st));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:952:3: ^( QUANTITY number= aNumber LITERAL_scalar )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity6523); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity6527);
					number=aNumber();
					state._fsp--;

					match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity6529); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 953:5: -> template(number=$number.st) \"<number> scalar\"
					{
						retval.st = new StringTemplate(templateLib, "<number> scalar",new STAttrMap().put("number", (number!=null?((StringTemplate)number.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:3: ^( QUANTITY number= aNumber LITERAL_whole )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity6556); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity6560);
					number=aNumber();
					state._fsp--;

					match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity6562); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 956:5: -> template(number=$number.st) \"<number> whole\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:959:1: aNumber : (lit= NUMBER -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= QCLREF -> {%{$propertyConstant.text}});
	public final UnparseBLESS3.aNumber_return aNumber() throws RecognitionException {
		UnparseBLESS3.aNumber_return retval = new UnparseBLESS3.aNumber_return();
		retval.start = input.LT(1);

		BAST lit=null;
		BAST propertyConstant=null;
		TreeRuleReturnScope property =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:959:8: (lit= NUMBER -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= QCLREF -> {%{$propertyConstant.text}})
			int alt77=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt77=1;
				}
				break;
			case OCTOTHORPE:
				{
				alt77=2;
				}
				break;
			case QCLREF:
				{
				alt77=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:960:2: lit= NUMBER
					{
					lit=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber6597); 
					// TEMPLATE REWRITE
					// 961:4: -> {%{$lit.text}}
					{
						retval.st = new StringTemplate(templateLib,(lit!=null?lit.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:962:4: property= propertyReference
					{
					pushFollow(FOLLOW_propertyReference_in_aNumber6611);
					property=propertyReference();
					state._fsp--;

					// TEMPLATE REWRITE
					// 963:4: -> {$property.st}
					{
						retval.st = (property!=null?((StringTemplate)property.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:964:4: propertyConstant= QCLREF
					{
					propertyConstant=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_aNumber6625); 
					// TEMPLATE REWRITE
					// 965:4: -> {%{$propertyConstant.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:968:1: propertyReference : ( ^(oct= OCTOTHORPE pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.text)| ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.textf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.text)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF ) -> property_reference(component=$component.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ ) -> property_reference(component=$component.textpname=$pname.textf=$field));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:969:2: ( ^(oct= OCTOTHORPE pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.text)| ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.textf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.text)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF ) -> property_reference(component=$component.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ ) -> property_reference(component=$component.textpname=$pname.textf=$field))
			int alt81=6;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==OCTOTHORPE) ) {
				int LA81_1 = input.LA(2);
				if ( (LA81_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case QCLREF:
						{
						int LA81_3 = input.LA(4);
						if ( (LA81_3==UP) ) {
							alt81=1;
						}
						else if ( (LA81_3==DOT||LA81_3==LBRACKET) ) {
							alt81=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 81, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LITERAL_self:
						{
						int LA81_4 = input.LA(4);
						if ( (LA81_4==QCLREF) ) {
							int LA81_8 = input.LA(5);
							if ( (LA81_8==UP) ) {
								alt81=3;
							}
							else if ( (LA81_8==DOT||LA81_8==LBRACKET) ) {
								alt81=4;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 81, 8, input);
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
									new NoViableAltException("", 81, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case QCREF:
						{
						int LA81_5 = input.LA(4);
						if ( (LA81_5==QCLREF) ) {
							int LA81_9 = input.LA(5);
							if ( (LA81_9==UP) ) {
								alt81=5;
							}
							else if ( (LA81_9==DOT||LA81_9==LBRACKET) ) {
								alt81=6;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 81, 9, input);
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
									new NoViableAltException("", 81, 5, input);
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
								new NoViableAltException("", 81, 2, input);
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
							new NoViableAltException("", 81, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:971:3: ^(oct= OCTOTHORPE pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference6657); 
					match(input, Token.DOWN, null); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference6661); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 972:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 973:5: -> property_reference(pname=$pname.text)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?pname.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:975:3: ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference6698); 
					match(input, Token.DOWN, null); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference6702); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:975:38: (field+= propertyField )+
					int cnt78=0;
					loop78:
					while (true) {
						int alt78=2;
						int LA78_0 = input.LA(1);
						if ( (LA78_0==DOT||LA78_0==LBRACKET) ) {
							alt78=1;
						}

						switch (alt78) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:975:38: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference6706);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt78 >= 1 ) break loop78;
							EarlyExitException eee = new EarlyExitException(78, input);
							throw eee;
						}
						cnt78++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 976:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 977:5: -> property_reference(pname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:979:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference6748); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference6752); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference6756); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 980:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 981:5: -> property_reference(component=$self.textpname=$pname.text)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?pname.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:983:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference6798); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference6802); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference6806); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:983:56: (field+= propertyField )+
					int cnt79=0;
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==DOT||LA79_0==LBRACKET) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:983:56: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference6810);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt79 >= 1 ) break loop79;
							EarlyExitException eee = new EarlyExitException(79, input);
							throw eee;
						}
						cnt79++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 984:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 985:5: -> property_reference(component=$self.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:987:3: ^(oct= OCTOTHORPE component= QCREF pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference6856); 
					match(input, Token.DOWN, null); 
					component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_propertyReference6860); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference6864); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 988:5: -> property_reference(component=$component.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?component.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:990:3: ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference6899); 
					match(input, Token.DOWN, null); 
					component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_propertyReference6903); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference6907); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:990:54: (field+= propertyField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:990:54: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference6911);
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
					// 991:5: -> property_reference(component=$component.textpname=$pname.textf=$field)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:994:1: propertyField : ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\");
	public final UnparseBLESS3.propertyField_return propertyField() throws RecognitionException {
		UnparseBLESS3.propertyField_return retval = new UnparseBLESS3.propertyField_return();
		retval.start = input.LT(1);

		BAST index=null;
		BAST var=null;
		BAST pf=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:995:3: ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\")
			int alt82=5;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LBRACKET) ) {
				int LA82_1 = input.LA(2);
				if ( (LA82_1==DOWN) ) {
					int LA82_3 = input.LA(3);
					if ( (LA82_3==NUMBER) ) {
						alt82=1;
					}
					else if ( (LA82_3==ID) ) {
						alt82=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 82, 3, input);
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
							new NoViableAltException("", 82, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA82_0==DOT) ) {
				int LA82_2 = input.LA(2);
				if ( (LA82_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case ID:
						{
						alt82=3;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt82=4;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt82=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 82, 4, input);
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
							new NoViableAltException("", 82, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:996:3: ^( LBRACKET index= NUMBER )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField6953); 
					match(input, Token.DOWN, null); 
					index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField6957); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 997:5: -> index(i=$index.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (index!=null?index.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:999:3: ^( LBRACKET var= ID )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField6982); 
					match(input, Token.DOWN, null); 
					var=(BAST)match(input,ID,FOLLOW_ID_in_propertyField6986); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1000:5: -> index(i=$var.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (var!=null?var.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1002:3: ^( DOT pf= ID )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7011); 
					match(input, Token.DOWN, null); 
					pf=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7015); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1003:5: -> template(pf=$pf.text) \".<pf>\"
					{
						retval.st = new StringTemplate(templateLib, ".<pf>",new STAttrMap().put("pf", (pf!=null?pf.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1005:3: ^( DOT LITERAL_upper_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7042); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7044); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1006:5: -> template( \".upper_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".upper_bound");
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1008:3: ^( DOT LITERAL_lower_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7068); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7070); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1009:5: -> template( \".lower_bound\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1016:1: actionSubclause : ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1017:3: ( ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:3: ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,ACTION_SUBCLAUSE,FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause7105); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:23: (no_proof= DO_NOT_PROVE )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==DO_NOT_PROVE) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:24: no_proof= DO_NOT_PROVE
					{
					no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7110); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:48: (tc= throwsClause )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==LITERAL_throws) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:49: tc= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7117);
					tc=throwsClause();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:67: (ac= assertClause )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==LITERAL_assert) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:68: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7124);
					ac=assertClause();
					state._fsp--;

					}
					break;

			}

			match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7135); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1019:20: (precondition= assertion )?
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==ASSERTION||(LA86_0 >= ASSERTION_ENUMERATION && LA86_0 <= ASSERTION_FUNCTION)) ) {
					alt86=1;
				}
				switch (alt86) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1019:21: precondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7140);
						precondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7152); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1020:21: (postcondition= assertion )?
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==ASSERTION||(LA87_0 >= ASSERTION_ENUMERATION && LA87_0 <= ASSERTION_FUNCTION)) ) {
					alt87=1;
				}
				switch (alt87) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1020:22: postcondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7157);
						postcondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7170); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1021:26: (invariant= assertion )?
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==ASSERTION||(LA88_0 >= ASSERTION_ENUMERATION && LA88_0 <= ASSERTION_FUNCTION)) ) {
					alt88=1;
				}
				switch (alt88) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1021:27: invariant= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7175);
						invariant=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7188);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1023:3: -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1028:1: throwsClause : ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions);
	public final UnparseBLESS3.throwsClause_return throwsClause() throws RecognitionException {
		UnparseBLESS3.throwsClause_return retval = new UnparseBLESS3.throwsClause_return();
		retval.start = input.LT(1);

		BAST exceptions=null;
		List<Object> list_exceptions=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1029:3: ( ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1030:2: ^( LITERAL_throws (exceptions+= ID )+ )
			{
			match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7261); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1030:30: (exceptions+= ID )+
			int cnt89=0;
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==ID) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1030:30: exceptions+= ID
					{
					exceptions=(BAST)match(input,ID,FOLLOW_ID_in_throwsClause7265); 
					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt89 >= 1 ) break loop89;
					EarlyExitException eee = new EarlyExitException(89, input);
					throw eee;
				}
				cnt89++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1031:4: -> throws_clause(ex=$exceptions)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1034:1: assertClause : ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions);
	public final UnparseBLESS3.assertClause_return assertClause() throws RecognitionException {
		UnparseBLESS3.assertClause_return retval = new UnparseBLESS3.assertClause_return();
		retval.start = input.LT(1);

		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1035:3: ( ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:3: ^( LITERAL_assert (assertions+= namedAssertion )+ )
			{
			match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7298); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:31: (assertions+= namedAssertion )+
			int cnt90=0;
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==ASSERTION||(LA90_0 >= ASSERTION_ENUMERATION && LA90_0 <= ASSERTION_FUNCTION)) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:31: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7302);
					assertions=namedAssertion();
					state._fsp--;

					if (list_assertions==null) list_assertions=new ArrayList<Object>();
					list_assertions.add(assertions.getTemplate());
					}
					break;

				default :
					if ( cnt90 >= 1 ) break loop90;
					EarlyExitException eee = new EarlyExitException(90, input);
					throw eee;
				}
				cnt90++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1037:5: -> assert_clause(a=$assertions)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1040:1: existentialLatticeQuantification : ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st);
	public final UnparseBLESS3.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.existentialLatticeQuantification_return retval = new UnparseBLESS3.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope qv =null;
		TreeRuleReturnScope actions =null;
		TreeRuleReturnScope cc =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1041:3: ( ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1042:3: ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification7335); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1042:13: (qv= quantifiedVariables )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==LITERAL_declare) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1042:15: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification7341);
					qv=quantifiedVariables();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification7348);
			actions=behaviorActions();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification7350); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1042:72: (cc= catchClause )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LITERAL_catch) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1042:74: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification7356);
					cc=catchClause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1043:5: -> elq(v=$qv.stba=$actions.stcc=$cc.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1046:1: quantifiedVariables : ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs);
	public final UnparseBLESS3.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		UnparseBLESS3.quantifiedVariables_return retval = new UnparseBLESS3.quantifiedVariables_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1047:3: ( ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1048:3: ^( LITERAL_declare (decs+= variableDeclaration )+ )
			{
			match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7401); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1048:26: (decs+= variableDeclaration )+
			int cnt93=0;
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==VARIABLE_DECLARATION) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1048:26: decs+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7405);
					decs=variableDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt93 >= 1 ) break loop93;
					EarlyExitException eee = new EarlyExitException(93, input);
					throw eee;
				}
				cnt93++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1049:5: -> quantified_variables(bv=$decs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1052:1: variableDeclaration : ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1053:3: ( ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:3: ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? )
			{
			match(input,VARIABLE_DECLARATION,FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration7437); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variable_in_variableDeclaration7441);
			v=variable();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:38: ( ^( ASSIGN exp= expression ) )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==ASSIGN) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:40: ^( ASSIGN exp= expression )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7447); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_variableDeclaration7451);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:71: (a= assertion )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==ASSERTION||(LA95_0 >= ASSERTION_ENUMERATION && LA95_0 <= ASSERTION_FUNCTION)) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:71: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7460);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:7: (nv= LITERAL_nonvolatile )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==LITERAL_nonvolatile) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:7: nv= LITERAL_nonvolatile
					{
					nv=(BAST)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7470); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:31: (sh= LITERAL_shared )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==LITERAL_shared) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:31: sh= LITERAL_shared
					{
					sh=(BAST)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7475); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:49: (c= LITERAL_constant )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LITERAL_constant) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:49: c= LITERAL_constant
					{
					c=(BAST)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7480); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:70: (sp= LITERAL_spread )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LITERAL_spread) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:70: sp= LITERAL_spread
					{
					sp=(BAST)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7485); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:88: (f= LITERAL_final )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==LITERAL_final) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:88: f= LITERAL_final
					{
					f=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration7490); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1056:5: -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:1: catchClause : ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct);
	public final UnparseBLESS3.catchClause_return catchClause() throws RecognitionException {
		UnparseBLESS3.catchClause_return retval = new UnparseBLESS3.catchClause_return();
		retval.start = input.LT(1);

		List<Object> list_cct=null;
		RuleReturnScope cct = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1060:3: ( ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:2: ^( LITERAL_catch (cct+= catchClauseTerm )+ )
			{
			match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause7550); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:22: (cct+= catchClauseTerm )+
			int cnt101=0;
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==LPAREN) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:22: cct+= catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause7554);
					cct=catchClauseTerm();
					state._fsp--;

					if (list_cct==null) list_cct=new ArrayList<Object>();
					list_cct.add(cct.getTemplate());
					}
					break;

				default :
					if ( cnt101 >= 1 ) break loop101;
					EarlyExitException eee = new EarlyExitException(101, input);
					throw eee;
				}
				cnt101++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1062:4: -> catch_clause(cct=$cct)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1065:1: catchClauseTerm : ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st));
	public final UnparseBLESS3.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		UnparseBLESS3.catchClauseTerm_return retval = new UnparseBLESS3.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST colon=null;
		BAST exceptions=null;
		List<Object> list_exceptions=null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1066:3: ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st))
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LPAREN) ) {
				int LA103_1 = input.LA(2);
				if ( (LA103_1==DOWN) ) {
					int LA103_2 = input.LA(3);
					if ( (LA103_2==LITERAL_all) ) {
						alt103=2;
					}
					else if ( (LA103_2==ID) ) {
						alt103=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 103, 2, input);
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
							new NoViableAltException("", 103, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 103, 0, input);
				throw nvae;
			}

			switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1067:3: ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7586); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1067:23: (exceptions+= ID )+
					int cnt102=0;
					loop102:
					while (true) {
						int alt102=2;
						int LA102_0 = input.LA(1);
						if ( (LA102_0==ID) ) {
							alt102=1;
						}

						switch (alt102) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1067:23: exceptions+= ID
							{
							exceptions=(BAST)match(input,ID,FOLLOW_ID_in_catchClauseTerm7590); 
							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt102 >= 1 ) break loop102;
							EarlyExitException eee = new EarlyExitException(102, input);
							throw eee;
						}
						cnt102++;
					}

					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7596); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm7600);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7602); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1068:5: -> catch_clause_term(ei=$exceptionsba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term",new STAttrMap().put("ei", list_exceptions).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1070:3: ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7632); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm7634); 
					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7638); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm7642);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7644); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1071:5: -> catch_clause_term_all(ba=$act.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1074:1: behaviorActions : ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st});
	public final UnparseBLESS3.behaviorActions_return behaviorActions() throws RecognitionException {
		UnparseBLESS3.behaviorActions_return retval = new UnparseBLESS3.behaviorActions_return();
		retval.start = input.LT(1);

		List<Object> list_aa=null;
		TreeRuleReturnScope a =null;
		RuleReturnScope aa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1075:3: ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st})
			int alt106=3;
			switch ( input.LA(1) ) {
			case SEMICOLON:
				{
				alt106=1;
				}
				break;
			case AMPERSAND:
				{
				alt106=2;
				}
				break;
			case ACTION:
				{
				alt106=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1076:3: ^( SEMICOLON (aa+= assertedAction )+ )
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7676); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1076:18: (aa+= assertedAction )+
					int cnt104=0;
					loop104:
					while (true) {
						int alt104=2;
						int LA104_0 = input.LA(1);
						if ( (LA104_0==ACTION) ) {
							alt104=1;
						}

						switch (alt104) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1076:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions7680);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt104 >= 1 ) break loop104;
							EarlyExitException eee = new EarlyExitException(104, input);
							throw eee;
						}
						cnt104++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1077:5: -> sequential_composition(f=$aa)
					{
						retval.st = templateLib.getInstanceOf("sequential_composition",new STAttrMap().put("f", list_aa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:3: ^( AMPERSAND (aa+= assertedAction )+ )
					{
					match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7706); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:18: (aa+= assertedAction )+
					int cnt105=0;
					loop105:
					while (true) {
						int alt105=2;
						int LA105_0 = input.LA(1);
						if ( (LA105_0==ACTION) ) {
							alt105=1;
						}

						switch (alt105) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions7710);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt105 >= 1 ) break loop105;
							EarlyExitException eee = new EarlyExitException(105, input);
							throw eee;
						}
						cnt105++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1080:5: -> concurrent_composition(g=$aa)
					{
						retval.st = templateLib.getInstanceOf("concurrent_composition",new STAttrMap().put("g", list_aa));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1082:3: a= assertedAction
					{
					pushFollow(FOLLOW_assertedAction_in_behaviorActions7736);
					a=assertedAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1083:5: -> {$a.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1086:1: assertedAction : ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st);
	public final UnparseBLESS3.assertedAction_return assertedAction() throws RecognitionException {
		UnparseBLESS3.assertedAction_return retval = new UnparseBLESS3.assertedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pre =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope post =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:3: ( ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:3: ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) )
			{
			match(input,ACTION,FOLLOW_ACTION_in_assertedAction7761); 
			match(input, Token.DOWN, null); 
			match(input,P,FOLLOW_P_in_assertedAction7765); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:21: (pre= assertion )?
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==ASSERTION||(LA107_0 >= ASSERTION_ENUMERATION && LA107_0 <= ASSERTION_FUNCTION)) ) {
					alt107=1;
				}
				switch (alt107) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:21: pre= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction7769);
						pre=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,S,FOLLOW_S_in_assertedAction7776); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_action_in_assertedAction7780);
			s=action();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,Q,FOLLOW_Q_in_assertedAction7786); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:60: (post= assertion )?
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==ASSERTION||(LA108_0 >= ASSERTION_ENUMERATION && LA108_0 <= ASSERTION_FUNCTION)) ) {
					alt108=1;
				}
				switch (alt108) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:60: post= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction7790);
						post=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1089:5: -> asserted_action(p=$pre.sts=$s.stq=$post.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1092:1: action : (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1092:7: (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st})
			int alt109=7;
			switch ( input.LA(1) ) {
			case ASSIGN:
			case FUNCTION_CALL:
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
				{
				alt109=1;
				}
				break;
			case LITERAL_if:
				{
				alt109=2;
				}
				break;
			case LITERAL_while:
				{
				alt109=3;
				}
				break;
			case LITERAL_for:
				{
				alt109=4;
				}
				break;
			case LITERAL_do:
				{
				alt109=5;
				}
				break;
			case LCURLY:
				{
				alt109=6;
				}
				break;
			case LITERAL_forall:
				{
				alt109=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}
			switch (alt109) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1093:3: ba= basicAction
					{
					pushFollow(FOLLOW_basicAction_in_action7832);
					ba=basicAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1094:5: -> {$ba.st}
					{
						retval.st = (ba!=null?((StringTemplate)ba.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:5: if_fi= alternative
					{
					pushFollow(FOLLOW_alternative_in_action7848);
					if_fi=alternative();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1096:5: -> {$if_fi.st}
					{
						retval.st = (if_fi!=null?((StringTemplate)if_fi.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1097:5: wl= whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_action7864);
					wl=whileLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1098:5: -> {$wl.st}
					{
						retval.st = (wl!=null?((StringTemplate)wl.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1099:5: fl= forLoop
					{
					pushFollow(FOLLOW_forLoop_in_action7880);
					fl=forLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1100:5: -> {$fl.st}
					{
						retval.st = (fl!=null?((StringTemplate)fl.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1101:5: du= doUntilLoop
					{
					pushFollow(FOLLOW_doUntilLoop_in_action7896);
					du=doUntilLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1102:5: -> {$du.st}
					{
						retval.st = (du!=null?((StringTemplate)du.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:5: elq= existentialLatticeQuantification
					{
					pushFollow(FOLLOW_existentialLatticeQuantification_in_action7912);
					elq=existentialLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1104:5: -> {$elq.st}
					{
						retval.st = (elq!=null?((StringTemplate)elq.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1105:5: ulq= universalLatticeQuantification
					{
					pushFollow(FOLLOW_universalLatticeQuantification_in_action7929);
					ulq=universalLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1106:5: -> {$ulq.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1109:1: basicAction : (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| LITERAL_setmode mode= ID -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1110:3: (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| LITERAL_setmode mode= ID -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st})
			int alt110=8;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt110=1;
				}
				break;
			case ASSIGN:
				{
				int LA110_2 = input.LA(2);
				if ( (LA110_2==DOWN) ) {
					int LA110_8 = input.LA(3);
					if ( (LA110_8==COMMA) ) {
						alt110=7;
					}
					else if ( (LA110_8==ID||LA110_8==QUESTION||LA110_8==TICK) ) {
						alt110=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 110, 8, input);
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
							new NoViableAltException("", 110, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_setmode:
				{
				alt110=3;
				}
				break;
			case LITERAL_when:
				{
				alt110=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt110=5;
				}
				break;
			case FUNCTION_CALL:
			case PORT_INPUT:
			case PORT_OUTPUT:
				{
				alt110=6;
				}
				break;
			case LITERAL_exception:
				{
				alt110=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1111:3: sk= LITERAL_skip
					{
					sk=(BAST)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction7958); 
					// TEMPLATE REWRITE
					// 1112:4: -> {%{$sk.text}}
					{
						retval.st = new StringTemplate(templateLib,(sk!=null?sk.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1113:5: ass= assignment
					{
					pushFollow(FOLLOW_assignment_in_basicAction7974);
					ass=assignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1114:5: -> {$ass.st}
					{
						retval.st = (ass!=null?((StringTemplate)ass.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1115:5: LITERAL_setmode mode= ID
					{
					match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction7988); 
					mode=(BAST)match(input,ID,FOLLOW_ID_in_basicAction7992); 
					// TEMPLATE REWRITE
					// 1116:5: -> template(mode=$mode.text) \"setmode <mode>\"
					{
						retval.st = new StringTemplate(templateLib, "setmode <mode>",new STAttrMap().put("mode", (mode!=null?mode.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1117:5: wt= whenThrow
					{
					pushFollow(FOLLOW_whenThrow_in_basicAction8016);
					wt=whenThrow();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1118:5: -> {$wt.st}
					{
						retval.st = (wt!=null?((StringTemplate)wt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1119:5: co= combinableOperation
					{
					pushFollow(FOLLOW_combinableOperation_in_basicAction8032);
					co=combinableOperation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1120:5: -> {$co.st}
					{
						retval.st = (co!=null?((StringTemplate)co.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1121:5: ca= communicationAction
					{
					pushFollow(FOLLOW_communicationAction_in_basicAction8048);
					ca=communicationAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1122:5: -> {$ca.st}
					{
						retval.st = (ca!=null?((StringTemplate)ca.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1123:5: sa= simultaneousAssignment
					{
					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8065);
					sa=simultaneousAssignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1124:5: -> {$sa.st}
					{
						retval.st = (sa!=null?((StringTemplate)sa.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1125:5: ie= issueException
					{
					pushFollow(FOLLOW_issueException_in_basicAction8081);
					ie=issueException();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1126:5: -> {$ie.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:1: issueException : ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text);
	public final UnparseBLESS3.issueException_return issueException() throws RecognitionException {
		UnparseBLESS3.issueException_return retval = new UnparseBLESS3.issueException_return();
		retval.start = input.LT(1);

		BAST exception=null;
		BAST message=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1130:3: ( ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1131:3: ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException8107); 
			match(input, Token.DOWN, null); 
			exception=(BAST)match(input,ID,FOLLOW_ID_in_issueException8111); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1131:44: (message= AADL_STRING_LITERAL )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==AADL_STRING_LITERAL) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1131:44: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException8115); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1132:5: -> issue_exception(ex=$exception.textm=$message.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1135:1: assignment : ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st);
	public final UnparseBLESS3.assignment_return assignment() throws RecognitionException {
		UnparseBLESS3.assignment_return retval = new UnparseBLESS3.assignment_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1136:3: ( ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1137:3: ^( ASSIGN n= nameTick e= expressionOrAny )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8155); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_nameTick_in_assignment8159);
			n=nameTick();
			state._fsp--;

			pushFollow(FOLLOW_expressionOrAny_in_assignment8163);
			e=expressionOrAny();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1138:5: -> assignment(nt=$n.steort=$e.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1141:1: nameTick : ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st});
	public final UnparseBLESS3.nameTick_return nameTick() throws RecognitionException {
		UnparseBLESS3.nameTick_return retval = new UnparseBLESS3.nameTick_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1142:3: ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st})
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==TICK) ) {
				int LA112_1 = input.LA(2);
				if ( (LA112_1==DOWN) ) {
					int LA112_3 = input.LA(3);
					if ( (LA112_3==ID) ) {
						int LA112_4 = input.LA(4);
						if ( (LA112_4==LITERAL_count||LA112_4==LITERAL_fresh||LA112_4==LITERAL_updated) ) {
							alt112=2;
						}
						else if ( ((LA112_4 >= DOWN && LA112_4 <= UP)) ) {
							alt112=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 112, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA112_3==QUESTION||LA112_3==TICK) ) {
						alt112=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 112, 3, input);
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
							new NoViableAltException("", 112, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA112_0==ID||LA112_0==QUESTION) ) {
				alt112=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}

			switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1143:3: ^( TICK vn= valueName )
					{
					match(input,TICK,FOLLOW_TICK_in_nameTick8202); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_nameTick8206);
					vn=valueName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1144:5: -> name_tick(vn=$vn.st)
					{
						retval.st = templateLib.getInstanceOf("name_tick",new STAttrMap().put("vn", (vn!=null?((StringTemplate)vn.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_nameTick8231);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1147:5: -> {$vn.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1150:1: expressionOrAny : (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}});
	public final UnparseBLESS3.expressionOrAny_return expressionOrAny() throws RecognitionException {
		UnparseBLESS3.expressionOrAny_return retval = new UnparseBLESS3.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST any=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1151:3: (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}})
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==LITERAL_all||LA113_0==LITERAL_exists||LA113_0==LITERAL_iff||LA113_0==LITERAL_implies||LA113_0==LITERAL_numberof||LA113_0==LITERAL_product||LA113_0==LITERAL_sum) ) {
				alt113=1;
			}
			else if ( (LA113_0==LITERAL_any) ) {
				alt113=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}

			switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:3: exp= expression
					{
					pushFollow(FOLLOW_expression_in_expressionOrAny8258);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1153:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1155:3: any= LITERAL_any
					{
					any=(BAST)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8278); 
					// TEMPLATE REWRITE
					// 1156:4: -> {%{$any.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:1: simultaneousAssignment : ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs);
	public final UnparseBLESS3.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		UnparseBLESS3.simultaneousAssignment_return retval = new UnparseBLESS3.simultaneousAssignment_return();
		retval.start = input.LT(1);

		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1160:3: ( ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:3: ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8304); 
			match(input, Token.DOWN, null); 
			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8308); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:25: (lhs+= nameTick )+
			int cnt114=0;
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==ID||LA114_0==QUESTION||LA114_0==TICK) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:25: lhs+= nameTick
					{
					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8312);
					lhs=nameTick();
					state._fsp--;

					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTemplate());
					}
					break;

				default :
					if ( cnt114 >= 1 ) break loop114;
					EarlyExitException eee = new EarlyExitException(114, input);
					throw eee;
				}
				cnt114++;
			}

			match(input, Token.UP, null); 

			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8319); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:51: (rhs+= expressionOrAny )+
			int cnt115=0;
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==LITERAL_all||LA115_0==LITERAL_any||LA115_0==LITERAL_exists||LA115_0==LITERAL_iff||LA115_0==LITERAL_implies||LA115_0==LITERAL_numberof||LA115_0==LITERAL_product||LA115_0==LITERAL_sum) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:51: rhs+= expressionOrAny
					{
					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8323);
					rhs=expressionOrAny();
					state._fsp--;

					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTemplate());
					}
					break;

				default :
					if ( cnt115 >= 1 ) break loop115;
					EarlyExitException eee = new EarlyExitException(115, input);
					throw eee;
				}
				cnt115++;
			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1162:5: -> simultaneous_assignment(l=$lhsr=$rhs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1165:1: whenThrow : ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text);
	public final UnparseBLESS3.whenThrow_return whenThrow() throws RecognitionException {
		UnparseBLESS3.whenThrow_return retval = new UnparseBLESS3.whenThrow_return();
		retval.start = input.LT(1);

		BAST excep=null;
		BAST message=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1165:10: ( ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1166:3: ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8363); 
			match(input, Token.DOWN, null); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8365); 
			pushFollow(FOLLOW_expression_in_whenThrow8369);
			exp=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8371); 
			match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8373); 
			excep=(BAST)match(input,ID,FOLLOW_ID_in_whenThrow8377); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1167:14: (message= AADL_STRING_LITERAL )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==AADL_STRING_LITERAL) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1167:14: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8389); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1168:5: -> when_throw(e=$exp.sti=$excep.textm=$message.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:1: combinableOperation : (fa= LITERAL_fetchadd -> {%{$fa.text}}|fo= LITERAL_fetchor -> {%{$fo.text}}|fan= LITERAL_fetchand -> {%{$fan.text}}|fx= LITERAL_fetchxor -> {%{$fx.text}}|sw= LITERAL_swap -> {%{$sw.text}});
	public final UnparseBLESS3.combinableOperation_return combinableOperation() throws RecognitionException {
		UnparseBLESS3.combinableOperation_return retval = new UnparseBLESS3.combinableOperation_return();
		retval.start = input.LT(1);

		BAST fa=null;
		BAST fo=null;
		BAST fan=null;
		BAST fx=null;
		BAST sw=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:20: (fa= LITERAL_fetchadd -> {%{$fa.text}}|fo= LITERAL_fetchor -> {%{$fo.text}}|fan= LITERAL_fetchand -> {%{$fan.text}}|fx= LITERAL_fetchxor -> {%{$fx.text}}|sw= LITERAL_swap -> {%{$sw.text}})
			int alt117=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt117=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt117=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt117=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt117=4;
				}
				break;
			case LITERAL_swap:
				{
				alt117=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}
			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1172:3: fa= LITERAL_fetchadd
					{
					fa=(BAST)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation8433); 
					// TEMPLATE REWRITE
					// 1173:4: -> {%{$fa.text}}
					{
						retval.st = new StringTemplate(templateLib,(fa!=null?fa.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1175:3: fo= LITERAL_fetchor
					{
					fo=(BAST)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation8450); 
					// TEMPLATE REWRITE
					// 1176:4: -> {%{$fo.text}}
					{
						retval.st = new StringTemplate(templateLib,(fo!=null?fo.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1178:3: fan= LITERAL_fetchand
					{
					fan=(BAST)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation8467); 
					// TEMPLATE REWRITE
					// 1179:4: -> {%{$fan.text}}
					{
						retval.st = new StringTemplate(templateLib,(fan!=null?fan.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1181:3: fx= LITERAL_fetchxor
					{
					fx=(BAST)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation8484); 
					// TEMPLATE REWRITE
					// 1182:4: -> {%{$fx.text}}
					{
						retval.st = new StringTemplate(templateLib,(fx!=null?fx.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1184:3: sw= LITERAL_swap
					{
					sw=(BAST)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation8501); 
					// TEMPLATE REWRITE
					// 1185:4: -> {%{$sw.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1188:1: communicationAction : (pc= subprogramCall -> {pc.st}|po= portOutput -> {po.st}|pi= portInput -> {pi.st});
	public final UnparseBLESS3.communicationAction_return communicationAction() throws RecognitionException {
		UnparseBLESS3.communicationAction_return retval = new UnparseBLESS3.communicationAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pc =null;
		TreeRuleReturnScope po =null;
		TreeRuleReturnScope pi =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1188:20: (pc= subprogramCall -> {pc.st}|po= portOutput -> {po.st}|pi= portInput -> {pi.st})
			int alt118=3;
			switch ( input.LA(1) ) {
			case FUNCTION_CALL:
				{
				alt118=1;
				}
				break;
			case PORT_OUTPUT:
				{
				alt118=2;
				}
				break;
			case PORT_INPUT:
				{
				alt118=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1189:3: pc= subprogramCall
					{
					pushFollow(FOLLOW_subprogramCall_in_communicationAction8524);
					pc=subprogramCall();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1190:5: -> {pc.st}
					{
						retval.st = pc.st;
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:3: po= portOutput
					{
					pushFollow(FOLLOW_portOutput_in_communicationAction8542);
					po=portOutput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1193:5: -> {po.st}
					{
						retval.st = po.st;
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1195:3: pi= portInput
					{
					pushFollow(FOLLOW_portInput_in_communicationAction8560);
					pi=portInput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1196:5: -> {pi.st}
					{
						retval.st = pi.st;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1199:1: portOutput : ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=pn.textbe=$be.st);
	public final UnparseBLESS3.portOutput_return portOutput() throws RecognitionException {
		UnparseBLESS3.portOutput_return retval = new UnparseBLESS3.portOutput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope be =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1200:3: ( ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=pn.textbe=$be.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1201:3: ^( PORT_OUTPUT pn= ID (be= expression )? )
			{
			match(input,PORT_OUTPUT,FOLLOW_PORT_OUTPUT_in_portOutput8587); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portOutput8591); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1201:26: (be= expression )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==LITERAL_all||LA119_0==LITERAL_exists||LA119_0==LITERAL_iff||LA119_0==LITERAL_implies||LA119_0==LITERAL_numberof||LA119_0==LITERAL_product||LA119_0==LITERAL_sum) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1201:26: be= expression
					{
					pushFollow(FOLLOW_expression_in_portOutput8595);
					be=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1202:5: -> port_output(o=pn.textbe=$be.st)
			{
				retval.st = templateLib.getInstanceOf("port_output",new STAttrMap().put("o", pn.text).put("be", (be!=null?((StringTemplate)be.getTemplate()):null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1205:1: portInput : ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st);
	public final UnparseBLESS3.portInput_return portInput() throws RecognitionException {
		UnparseBLESS3.portInput_return retval = new UnparseBLESS3.portInput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope n =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1206:3: ( ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1207:3: ^( PORT_INPUT pn= ID n= valueName )
			{
			match(input,PORT_INPUT,FOLLOW_PORT_INPUT_in_portInput8637); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portInput8641); 
			pushFollow(FOLLOW_valueName_in_portInput8645);
			n=valueName();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1208:5: -> port_input(i=$pn.textn=$n.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1212:1: subprogramCall : ^( FUNCTION_CALL id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st);
	public final UnparseBLESS3.subprogramCall_return subprogramCall() throws RecognitionException {
		UnparseBLESS3.subprogramCall_return retval = new UnparseBLESS3.subprogramCall_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope fal =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1213:3: ( ^( FUNCTION_CALL id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:3: ^( FUNCTION_CALL id= ID (fal= formalActualList )? )
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_subprogramCall8689); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_subprogramCall8693); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:29: (fal= formalActualList )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==AADL_STRING_LITERAL||LA120_0==COLON||LA120_0==COMMA||LA120_0==ID||LA120_0==LITERAL_false||LA120_0==LITERAL_null||LA120_0==LITERAL_true||LA120_0==LPAREN||(LA120_0 >= QUANTITY && LA120_0 <= QUESTION)||LA120_0==TICK) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:29: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall8697);
					fal=formalActualList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1215:5: -> function_call(f=$id.textpl=$fal.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1219:1: formalActualList : ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st});
	public final UnparseBLESS3.formalActualList_return formalActualList() throws RecognitionException {
		UnparseBLESS3.formalActualList_return retval = new UnparseBLESS3.formalActualList_return();
		retval.start = input.LT(1);

		List<Object> list_fa=null;
		TreeRuleReturnScope s =null;
		RuleReturnScope fa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1220:3: ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st})
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==COMMA) ) {
				alt122=1;
			}
			else if ( (LA122_0==AADL_STRING_LITERAL||LA122_0==COLON||LA122_0==ID||LA122_0==LITERAL_false||LA122_0==LITERAL_null||LA122_0==LITERAL_true||LA122_0==LPAREN||(LA122_0 >= QUANTITY && LA122_0 <= QUESTION)||LA122_0==TICK) ) {
				alt122=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}

			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1221:3: ^( COMMA (fa+= formalActual )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_formalActualList8742); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1221:14: (fa+= formalActual )+
					int cnt121=0;
					loop121:
					while (true) {
						int alt121=2;
						int LA121_0 = input.LA(1);
						if ( (LA121_0==AADL_STRING_LITERAL||LA121_0==COLON||LA121_0==ID||LA121_0==LITERAL_false||LA121_0==LITERAL_null||LA121_0==LITERAL_true||LA121_0==LPAREN||(LA121_0 >= QUANTITY && LA121_0 <= QUESTION)||LA121_0==TICK) ) {
							alt121=1;
						}

						switch (alt121) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1221:14: fa+= formalActual
							{
							pushFollow(FOLLOW_formalActual_in_formalActualList8746);
							fa=formalActual();
							state._fsp--;

							if (list_fa==null) list_fa=new ArrayList<Object>();
							list_fa.add(fa.getTemplate());
							}
							break;

						default :
							if ( cnt121 >= 1 ) break loop121;
							EarlyExitException eee = new EarlyExitException(121, input);
							throw eee;
						}
						cnt121++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1222:5: -> formal_actual_list(ns=$fa)
					{
						retval.st = templateLib.getInstanceOf("formal_actual_list",new STAttrMap().put("ns", list_fa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1224:3: s= formalActual
					{
					pushFollow(FOLLOW_formalActual_in_formalActualList8772);
					s=formalActual();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1225:5: -> {$s.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1228:1: formalActual : ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter );
	public final UnparseBLESS3.formalActual_return formalActual() throws RecognitionException {
		UnparseBLESS3.formalActual_return retval = new UnparseBLESS3.formalActual_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;
		TreeRuleReturnScope spp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1229:3: ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter )
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==COLON) ) {
				alt123=1;
			}
			else if ( (LA123_0==AADL_STRING_LITERAL||LA123_0==ID||LA123_0==LITERAL_false||LA123_0==LITERAL_null||LA123_0==LITERAL_true||LA123_0==LPAREN||(LA123_0 >= QUANTITY && LA123_0 <= QUESTION)||LA123_0==TICK) ) {
				alt123=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}

			switch (alt123) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1230:3: ^( COLON formal= ID actual= subProgramParameter )
					{
					match(input,COLON,FOLLOW_COLON_in_formalActual8801); 
					match(input, Token.DOWN, null); 
					formal=(BAST)match(input,ID,FOLLOW_ID_in_formalActual8805); 
					pushFollow(FOLLOW_subProgramParameter_in_formalActual8809);
					actual=subProgramParameter();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1231:5: -> formal_actual(f=$formal.textap=$actual.st)
					{
						retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1233:3: spp= subProgramParameter
					{
					pushFollow(FOLLOW_subProgramParameter_in_formalActual8839);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1236:1: subProgramParameter : (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.subProgramParameter_return subProgramParameter() throws RecognitionException {
		UnparseBLESS3.subProgramParameter_return retval = new UnparseBLESS3.subProgramParameter_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1236:20: (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt124=3;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt124=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt124=2;
				}
				break;
			case LPAREN:
				{
				alt124=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1237:2: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_subProgramParameter8853);
					v=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1238:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1239:4: c= constant
					{
					pushFollow(FOLLOW_constant_in_subProgramParameter8868);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1240:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1241:4: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter8883);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1242:5: -> {$ps.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1245:1: alternative : ^( LITERAL_if (alt+= guardedAction )+ ) ;
	public final UnparseBLESS3.alternative_return alternative() throws RecognitionException {
		UnparseBLESS3.alternative_return retval = new UnparseBLESS3.alternative_return();
		retval.start = input.LT(1);

		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:3: ( ^( LITERAL_if (alt+= guardedAction )+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1247:3: ^( LITERAL_if (alt+= guardedAction )+ )
			{
			match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative8911); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1247:20: (alt+= guardedAction )+
			int cnt125=0;
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==GUARD) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1247:20: alt+= guardedAction
					{
					pushFollow(FOLLOW_guardedAction_in_alternative8915);
					alt=guardedAction();
					state._fsp--;

					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTemplate());
					}
					break;

				default :
					if ( cnt125 >= 1 ) break loop125;
					EarlyExitException eee = new EarlyExitException(125, input);
					throw eee;
				}
				cnt125++;
			}

			match(input, Token.UP, null); 

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1250:1: guardedAction : ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st);
	public final UnparseBLESS3.guardedAction_return guardedAction() throws RecognitionException {
		UnparseBLESS3.guardedAction_return retval = new UnparseBLESS3.guardedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope aa =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1251:3: ( ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1252:3: ^( GUARD exp= expression aa= assertedAction )
			{
			match(input,GUARD,FOLLOW_GUARD_in_guardedAction8939); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_guardedAction8943);
			exp=expression();
			state._fsp--;

			pushFollow(FOLLOW_assertedAction_in_guardedAction8947);
			aa=assertedAction();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1253:5: -> guarded_action(be=$exp.stba=$aa.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1256:1: whileLoop : ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.whileLoop_return whileLoop() throws RecognitionException {
		UnparseBLESS3.whileLoop_return retval = new UnparseBLESS3.whileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1257:3: ( ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1258:3: ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop8986); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileLoop8990);
			be=expression();
			state._fsp--;

			match(input,INVARIANT,FOLLOW_INVARIANT_in_whileLoop8994); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1258:50: (inv= assertion )?
				int alt126=2;
				int LA126_0 = input.LA(1);
				if ( (LA126_0==ASSERTION||(LA126_0 >= ASSERTION_ENUMERATION && LA126_0 <= ASSERTION_FUNCTION)) ) {
					alt126=1;
				}
				switch (alt126) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1258:50: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop8998);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_whileLoop9005); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1258:75: (bd= assertion )?
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==ASSERTION||(LA127_0 >= ASSERTION_ENUMERATION && LA127_0 <= ASSERTION_FUNCTION)) ) {
					alt127=1;
				}
				switch (alt127) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1258:75: bd= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop9009);
						bd=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop9023);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1260:5: -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1263:1: forLoop : ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st);
	public final UnparseBLESS3.forLoop_return forLoop() throws RecognitionException {
		UnparseBLESS3.forLoop_return retval = new UnparseBLESS3.forLoop_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1264:3: ( ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:3: ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop9072); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_forLoop9076); 
			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop9080); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_forLoop9084);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forLoop9088);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_forLoop9094); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:84: (inv= assertion )?
				int alt128=2;
				int LA128_0 = input.LA(1);
				if ( (LA128_0==ASSERTION||(LA128_0 >= ASSERTION_ENUMERATION && LA128_0 <= ASSERTION_FUNCTION)) ) {
					alt128=1;
				}
				switch (alt128) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:84: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_forLoop9098);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_forLoop9112);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1267:5: -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1270:1: doUntilLoop : ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.doUntilLoop_return doUntilLoop() throws RecognitionException {
		UnparseBLESS3.doUntilLoop_return retval = new UnparseBLESS3.doUntilLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1271:3: ( ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1272:3: ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9167); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9171); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_doUntilLoop9175);
			be=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_doUntilLoop9181); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1272:66: (inv= assertion )?
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==ASSERTION||(LA129_0 >= ASSERTION_ENUMERATION && LA129_0 <= ASSERTION_FUNCTION)) ) {
					alt129=1;
				}
				switch (alt129) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1272:66: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop9185);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_doUntilLoop9192); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1272:91: (bd= assertion )?
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==ASSERTION||(LA130_0 >= ASSERTION_ENUMERATION && LA130_0 <= ASSERTION_FUNCTION)) ) {
					alt130=1;
				}
				switch (alt130) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1272:91: bd= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop9196);
						bd=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9209);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1274:5: -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1277:1: universalLatticeQuantification : ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st);
	public final UnparseBLESS3.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.universalLatticeQuantification_return retval = new UnparseBLESS3.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST lv=null;
		List<Object> list_lv=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1278:3: ( ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1279:3: ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9262); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1279:23: (lv+= ID )+
			int cnt131=0;
			loop131:
			while (true) {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==ID) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1279:23: lv+= ID
					{
					lv=(BAST)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9266); 
					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt131 >= 1 ) break loop131;
					EarlyExitException eee = new EarlyExitException(131, input);
					throw eee;
				}
				cnt131++;
			}

			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9271); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9275);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9279);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9285);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1280:5: -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:1: blessSubclause : ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1287:3: ( ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1288:3: ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? )
			{
			match(input,BLESS_SUBCLAUSE,FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause9335); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1289:12: (no_proof= DO_NOT_PROVE )?
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==DO_NOT_PROVE) ) {
					alt132=1;
				}
				switch (alt132) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1289:12: no_proof= DO_NOT_PROVE
						{
						no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9343); 
						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1290:7: (ac= assertClause )?
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==LITERAL_assert) ) {
					alt133=1;
				}
				switch (alt133) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1290:7: ac= assertClause
						{
						pushFollow(FOLLOW_assertClause_in_blessSubclause9352);
						ac=assertClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1291:8: (inv= invariantClause )?
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==LITERAL_invariant) ) {
					alt134=1;
				}
				switch (alt134) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1291:8: inv= invariantClause
						{
						pushFollow(FOLLOW_invariantClause_in_blessSubclause9363);
						inv=invariantClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:7: (vs= variablesSection )?
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==LITERAL_variables) ) {
					alt135=1;
				}
				switch (alt135) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:7: vs= variablesSection
						{
						pushFollow(FOLLOW_variablesSection_in_blessSubclause9372);
						vs=variablesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1293:7: (ss= statesSection )?
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==LITERAL_states) ) {
					alt136=1;
				}
				switch (alt136) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1293:7: ss= statesSection
						{
						pushFollow(FOLLOW_statesSection_in_blessSubclause9381);
						ss=statesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1294:6: (t= transitions )?
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==LITERAL_transitions) ) {
					alt137=1;
				}
				switch (alt137) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1294:6: t= transitions
						{
						pushFollow(FOLLOW_transitions_in_blessSubclause9390);
						t=transitions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1297:1: invariantClause : ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st);
	public final UnparseBLESS3.invariantClause_return invariantClause() throws RecognitionException {
		UnparseBLESS3.invariantClause_return retval = new UnparseBLESS3.invariantClause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1298:3: ( ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1299:3: ^( LITERAL_invariant a= assertion )
			{
			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9414); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assertion_in_invariantClause9418);
			a=assertion();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1300:5: -> invariant_clause(a=$a.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1303:1: variablesSection : ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd);
	public final UnparseBLESS3.variablesSection_return variablesSection() throws RecognitionException {
		UnparseBLESS3.variablesSection_return retval = new UnparseBLESS3.variablesSection_return();
		retval.start = input.LT(1);

		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1304:3: ( ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:2: ^( LITERAL_variables (vd+= variableDeclaration )+ )
			{
			match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection9450); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:25: (vd+= variableDeclaration )+
			int cnt138=0;
			loop138:
			while (true) {
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==VARIABLE_DECLARATION) ) {
					alt138=1;
				}

				switch (alt138) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:25: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection9454);
					vd=variableDeclaration();
					state._fsp--;

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTemplate());
					}
					break;

				default :
					if ( cnt138 >= 1 ) break loop138;
					EarlyExitException eee = new EarlyExitException(138, input);
					throw eee;
				}
				cnt138++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1306:4: -> variables(bv=$vd)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1309:1: statesSection : ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states);
	public final UnparseBLESS3.statesSection_return statesSection() throws RecognitionException {
		UnparseBLESS3.statesSection_return retval = new UnparseBLESS3.statesSection_return();
		retval.start = input.LT(1);

		List<Object> list_states=null;
		RuleReturnScope states = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1310:3: ( ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:2: ^( LITERAL_states (states+= behaviorState )+ )
			{
			match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection9485); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:26: (states+= behaviorState )+
			int cnt139=0;
			loop139:
			while (true) {
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==LITERAL_state) ) {
					alt139=1;
				}

				switch (alt139) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection9489);
					states=behaviorState();
					state._fsp--;

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTemplate());
					}
					break;

				default :
					if ( cnt139 >= 1 ) break loop139;
					EarlyExitException eee = new EarlyExitException(139, input);
					throw eee;
				}
				cnt139++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1312:4: -> states_section(bs=$states)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1315:1: behaviorState : ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st);
	public final UnparseBLESS3.behaviorState_return behaviorState() throws RecognitionException {
		UnparseBLESS3.behaviorState_return retval = new UnparseBLESS3.behaviorState_return();
		retval.start = input.LT(1);

		BAST init=null;
		BAST com=null;
		BAST finl=null;
		BAST i=null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1316:3: ( ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:3: ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? )
			{
			match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState9521); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:24: (init= LITERAL_initial )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==LITERAL_initial) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:24: init= LITERAL_initial
					{
					init=(BAST)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState9525); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:45: (com= LITERAL_complete )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==LITERAL_complete) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:45: com= LITERAL_complete
					{
					com=(BAST)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState9530); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:68: (finl= LITERAL_final )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==LITERAL_final) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:68: finl= LITERAL_final
					{
					finl=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState9535); 
					}
					break;

			}

			i=(BAST)match(input,ID,FOLLOW_ID_in_behaviorState9540); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:90: (a= assertion )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==ASSERTION||(LA143_0 >= ASSERTION_ENUMERATION && LA143_0 <= ASSERTION_FUNCTION)) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:90: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState9544);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1318:5: -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1321:1: transitions : ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt);
	public final UnparseBLESS3.transitions_return transitions() throws RecognitionException {
		UnparseBLESS3.transitions_return retval = new UnparseBLESS3.transitions_return();
		retval.start = input.LT(1);

		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1322:3: ( ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1323:3: ^( LITERAL_transitions (bt+= behaviorTransition )+ )
			{
			match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions9599); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1323:28: (bt+= behaviorTransition )+
			int cnt144=0;
			loop144:
			while (true) {
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==TRANSITION) ) {
					alt144=1;
				}

				switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1323:28: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions9603);
					bt=behaviorTransition();
					state._fsp--;

					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTemplate());
					}
					break;

				default :
					if ( cnt144 >= 1 ) break loop144;
					EarlyExitException eee = new EarlyExitException(144, input);
					throw eee;
				}
				cnt144++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1324:5: -> transitions(bt=$bt)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1327:1: behaviorTransition : ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION s= behaviorActions ) ^( Q (q= assertion )? ) ) -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1328:3: ( ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION s= behaviorActions ) ^( Q (q= assertion )? ) ) -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:3: ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION s= behaviorActions ) ^( Q (q= assertion )? ) )
			{
			match(input,TRANSITION,FOLLOW_TRANSITION_in_behaviorTransition9636); 
			match(input, Token.DOWN, null); 
			match(input,LABEL,FOLLOW_LABEL_in_behaviorTransition9640); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition9644); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:34: (pr= priority )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==LBRACKET) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:34: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition9648);
					pr=priority();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input,SOURCE,FOLLOW_SOURCE_in_behaviorTransition9655); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:60: (ssi+= ID )+
			int cnt146=0;
			loop146:
			while (true) {
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==ID) ) {
					alt146=1;
				}

				switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:60: ssi+= ID
					{
					ssi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition9659); 
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi);
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

			match(input,CONDITION,FOLLOW_CONDITION_in_behaviorTransition9671); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1330:20: (bc= behaviorCondition )?
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==LITERAL_all||LA147_0==LITERAL_dispatch||LA147_0==LITERAL_exists||LA147_0==LITERAL_iff||LA147_0==LITERAL_implies||LA147_0==LITERAL_internal||LA147_0==LITERAL_numberof||LA147_0==LITERAL_on||LA147_0==LITERAL_product||LA147_0==LITERAL_sum) ) {
					alt147=1;
				}
				switch (alt147) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1330:20: bc= behaviorCondition
						{
						pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition9675);
						bc=behaviorCondition();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,DESTINATION,FOLLOW_DESTINATION_in_behaviorTransition9682); 
			match(input, Token.DOWN, null); 
			dsi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition9686); 
			match(input, Token.UP, null); 

			match(input,ACTION,FOLLOW_ACTION_in_behaviorTransition9696); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_behaviorActions_in_behaviorTransition9700);
			s=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,Q,FOLLOW_Q_in_behaviorTransition9706); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:41: (q= assertion )?
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==ASSERTION||(LA148_0 >= ASSERTION_ENUMERATION && LA148_0 <= ASSERTION_FUNCTION)) ) {
					alt148=1;
				}
				switch (alt148) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:41: q= assertion
						{
						pushFollow(FOLLOW_assertion_in_behaviorTransition9710);
						q=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1332:5: -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1336:1: priority : ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text);
	public final UnparseBLESS3.priority_return priority() throws RecognitionException {
		UnparseBLESS3.priority_return retval = new UnparseBLESS3.priority_return();
		retval.start = input.LT(1);

		BAST num=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1337:3: ( ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1338:2: ^( LBRACKET num= NUMBER RBRACKET )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_priority9782); 
			match(input, Token.DOWN, null); 
			num=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_priority9786); 
			match(input,RBRACKET,FOLLOW_RBRACKET_in_priority9788); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1339:4: -> priority(num=$num.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1342:1: behaviorCondition : (dc= dispatchCondition -> {dc.st}|ec= executeCondition -> {ec.st}|mc= modeCondition -> {mc.st}|ic= internalCondition -> {ic.st});
	public final UnparseBLESS3.behaviorCondition_return behaviorCondition() throws RecognitionException {
		UnparseBLESS3.behaviorCondition_return retval = new UnparseBLESS3.behaviorCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope dc =null;
		TreeRuleReturnScope ec =null;
		TreeRuleReturnScope mc =null;
		TreeRuleReturnScope ic =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1343:3: (dc= dispatchCondition -> {dc.st}|ec= executeCondition -> {ec.st}|mc= modeCondition -> {mc.st}|ic= internalCondition -> {ic.st})
			int alt149=4;
			switch ( input.LA(1) ) {
			case LITERAL_dispatch:
				{
				alt149=1;
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
				alt149=2;
				}
				break;
			case LITERAL_on:
				{
				alt149=3;
				}
				break;
			case LITERAL_internal:
				{
				alt149=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 149, 0, input);
				throw nvae;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1344:3: dc= dispatchCondition
					{
					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition9819);
					dc=dispatchCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1345:5: -> {dc.st}
					{
						retval.st = dc.st;
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1346:5: ec= executeCondition
					{
					pushFollow(FOLLOW_executeCondition_in_behaviorCondition9836);
					ec=executeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1347:5: -> {ec.st}
					{
						retval.st = ec.st;
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1348:5: mc= modeCondition
					{
					pushFollow(FOLLOW_modeCondition_in_behaviorCondition9854);
					mc=modeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1349:5: -> {mc.st}
					{
						retval.st = mc.st;
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1350:5: ic= internalCondition
					{
					pushFollow(FOLLOW_internalCondition_in_behaviorCondition9872);
					ic=internalCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1351:5: -> {ic.st}
					{
						retval.st = ic.st;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1354:1: dispatchCondition : ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st);
	public final UnparseBLESS3.dispatchCondition_return dispatchCondition() throws RecognitionException {
		UnparseBLESS3.dispatchCondition_return retval = new UnparseBLESS3.dispatchCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope de =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1355:3: ( ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1356:3: ^( LITERAL_dispatch (de= dispatchExpression )? )
			{
			match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition9900); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1356:25: (de= dispatchExpression )?
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==ID||LA150_0==LITERAL_and||LA150_0==LITERAL_or||LA150_0==LITERAL_timeout) ) {
					alt150=1;
				}
				switch (alt150) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1356:25: de= dispatchExpression
						{
						pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition9904);
						de=dispatchExpression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1357:5: -> dispatch_condition(dle=$de.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:1: executeCondition : expression ;
	public final UnparseBLESS3.executeCondition_return executeCondition() throws RecognitionException {
		UnparseBLESS3.executeCondition_return retval = new UnparseBLESS3.executeCondition_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1361:3: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1362:3: expression
			{
			pushFollow(FOLLOW_expression_in_executeCondition9939);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:1: modeCondition : ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st);
	public final UnparseBLESS3.modeCondition_return modeCondition() throws RecognitionException {
		UnparseBLESS3.modeCondition_return retval = new UnparseBLESS3.modeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:3: ( ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1367:3: ^( LITERAL_on tle= triggerLogicalExpression )
			{
			match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition9960); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition9964);
			tle=triggerLogicalExpression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1368:5: -> mode_condition(tle=$tle.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1371:1: internalCondition : ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports);
	public final UnparseBLESS3.internalCondition_return internalCondition() throws RecognitionException {
		UnparseBLESS3.internalCondition_return retval = new UnparseBLESS3.internalCondition_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:3: ( ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1373:3: ^( LITERAL_internal (ports+= ID )+ )
			{
			match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition9998); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1373:28: (ports+= ID )+
			int cnt151=0;
			loop151:
			while (true) {
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==ID) ) {
					alt151=1;
				}

				switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1373:28: ports+= ID
					{
					ports=(BAST)match(input,ID,FOLLOW_ID_in_internalCondition10002); 
					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					if ( cnt151 >= 1 ) break loop151;
					EarlyExitException eee = new EarlyExitException(151, input);
					throw eee;
				}
				cnt151++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1374:5: -> internal_condition(p=$ports)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1377:1: dispatchExpression : ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st});
	public final UnparseBLESS3.dispatchExpression_return dispatchExpression() throws RecognitionException {
		UnparseBLESS3.dispatchExpression_return retval = new UnparseBLESS3.dispatchExpression_return();
		retval.start = input.LT(1);

		List<Object> list_dc=null;
		TreeRuleReturnScope c =null;
		RuleReturnScope dc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:3: ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st})
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==LITERAL_or) ) {
				alt153=1;
			}
			else if ( (LA153_0==ID||LA153_0==LITERAL_and||LA153_0==LITERAL_timeout) ) {
				alt153=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 153, 0, input);
				throw nvae;
			}

			switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1379:3: ^( LITERAL_or (dc+= dispatchConjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10038); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1379:19: (dc+= dispatchConjunction )+
					int cnt152=0;
					loop152:
					while (true) {
						int alt152=2;
						int LA152_0 = input.LA(1);
						if ( (LA152_0==ID||LA152_0==LITERAL_and||LA152_0==LITERAL_timeout) ) {
							alt152=1;
						}

						switch (alt152) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1379:19: dc+= dispatchConjunction
							{
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10042);
							dc=dispatchConjunction();
							state._fsp--;

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTemplate());
							}
							break;

						default :
							if ( cnt152 >= 1 ) break loop152;
							EarlyExitException eee = new EarlyExitException(152, input);
							throw eee;
						}
						cnt152++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1380:5: -> disjunction(bopt=$dc)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_dc));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1382:3: c= dispatchConjunction
					{
					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10068);
					c=dispatchConjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1383:5: -> {$c.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1386:1: dispatchConjunction : ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st});
	public final UnparseBLESS3.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		UnparseBLESS3.dispatchConjunction_return retval = new UnparseBLESS3.dispatchConjunction_return();
		retval.start = input.LT(1);

		List<Object> list_tr=null;
		TreeRuleReturnScope t =null;
		RuleReturnScope tr = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1387:3: ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st})
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==LITERAL_and) ) {
				alt155=1;
			}
			else if ( (LA155_0==ID||LA155_0==LITERAL_timeout) ) {
				alt155=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 155, 0, input);
				throw nvae;
			}

			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1388:3: ^( LITERAL_and (tr+= dispatchTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10099); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1388:20: (tr+= dispatchTrigger )+
					int cnt154=0;
					loop154:
					while (true) {
						int alt154=2;
						int LA154_0 = input.LA(1);
						if ( (LA154_0==ID||LA154_0==LITERAL_timeout) ) {
							alt154=1;
						}

						switch (alt154) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1388:20: tr+= dispatchTrigger
							{
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10103);
							tr=dispatchTrigger();
							state._fsp--;

							if (list_tr==null) list_tr=new ArrayList<Object>();
							list_tr.add(tr.getTemplate());
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
					// 1389:5: -> conjunction(bopt=$tr)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_tr));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:3: t= dispatchTrigger
					{
					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10129);
					t=dispatchTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1392:5: -> {$t.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1395:1: dispatchTrigger : (port= portName -> {$port.st}| ^( LITERAL_timeout ^( LPAREN (ports+= ID )* ) (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports));
	public final UnparseBLESS3.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		UnparseBLESS3.dispatchTrigger_return retval = new UnparseBLESS3.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;
		TreeRuleReturnScope port =null;
		TreeRuleReturnScope time =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1396:3: (port= portName -> {$port.st}| ^( LITERAL_timeout ^( LPAREN (ports+= ID )* ) (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports))
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==ID) ) {
				alt158=1;
			}
			else if ( (LA158_0==LITERAL_timeout) ) {
				alt158=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}

			switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1397:3: port= portName
					{
					pushFollow(FOLLOW_portName_in_dispatchTrigger10155);
					port=portName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1398:5: -> {$port.st}
					{
						retval.st = (port!=null?((StringTemplate)port.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1400:3: ^( LITERAL_timeout ^( LPAREN (ports+= ID )* ) (time= behaviorTime )? )
					{
					match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger10173); 
					match(input, Token.DOWN, null); 
					match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger10177); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1400:37: (ports+= ID )*
						loop156:
						while (true) {
							int alt156=2;
							int LA156_0 = input.LA(1);
							if ( (LA156_0==ID) ) {
								alt156=1;
							}

							switch (alt156) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1400:37: ports+= ID
								{
								ports=(BAST)match(input,ID,FOLLOW_ID_in_dispatchTrigger10181); 
								if (list_ports==null) list_ports=new ArrayList<Object>();
								list_ports.add(ports);
								}
								break;

							default :
								break loop156;
							}
						}

						match(input, Token.UP, null); 
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1400:49: (time= behaviorTime )?
					int alt157=2;
					int LA157_0 = input.LA(1);
					if ( (LA157_0==ID||LA157_0==LPAREN||(LA157_0 >= QUANTITY && LA157_0 <= QUESTION)||LA157_0==TICK) ) {
						alt157=1;
					}
					switch (alt157) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1400:49: time= behaviorTime
							{
							pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10188);
							time=behaviorTime();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1401:5: -> timeout(bt=$time.stp=$ports)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:1: behaviorTime : (q= quantity -> {$q.st}|vn= valueName -> {$vn.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.behaviorTime_return behaviorTime() throws RecognitionException {
		UnparseBLESS3.behaviorTime_return retval = new UnparseBLESS3.behaviorTime_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope q =null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:13: (q= quantity -> {$q.st}|vn= valueName -> {$vn.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt159=3;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt159=1;
				}
				break;
			case ID:
			case QUESTION:
			case TICK:
				{
				alt159=2;
				}
				break;
			case LPAREN:
				{
				alt159=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_behaviorTime10222);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1406:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1407:5: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime10238);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1408:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1409:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_behaviorTime10254);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1410:5: -> {$ps.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1413:1: portName : ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text);
	public final UnparseBLESS3.portName_return portName() throws RecognitionException {
		UnparseBLESS3.portName_return retval = new UnparseBLESS3.portName_return();
		retval.start = input.LT(1);

		BAST port=null;
		BAST index=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1414:3: ( ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1415:3: ^(port= ID (index= NUMBER )? )
			{
			port=(BAST)match(input,ID,FOLLOW_ID_in_portName10282); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1415:19: (index= NUMBER )?
				int alt160=2;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==NUMBER) ) {
					alt160=1;
				}
				switch (alt160) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1415:19: index= NUMBER
						{
						index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_portName10286); 
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1416:5: -> port_name(port=$port.textindex=$index.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1419:1: triggerLogicalExpression : ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st});
	public final UnparseBLESS3.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		UnparseBLESS3.triggerLogicalExpression_return retval = new UnparseBLESS3.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		List<Object> list_et=null;
		TreeRuleReturnScope first =null;
		RuleReturnScope et = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1420:3: ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st})
			int alt166=6;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt166=1;
				}
				break;
			case LITERAL_or:
				{
				alt166=2;
				}
				break;
			case LITERAL_xor:
				{
				alt166=3;
				}
				break;
			case LITERAL_then:
				{
				alt166=4;
				}
				break;
			case LITERAL_else:
				{
				alt166=5;
				}
				break;
			case LPAREN:
			case TRIGGER:
				{
				alt166=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}
			switch (alt166) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1421:3: ^( LITERAL_and (et+= eventTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_triggerLogicalExpression10323); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1421:20: (et+= eventTrigger )+
					int cnt161=0;
					loop161:
					while (true) {
						int alt161=2;
						int LA161_0 = input.LA(1);
						if ( (LA161_0==LPAREN||LA161_0==TRIGGER) ) {
							alt161=1;
						}

						switch (alt161) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1421:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10327);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt161 >= 1 ) break loop161;
							EarlyExitException eee = new EarlyExitException(161, input);
							throw eee;
						}
						cnt161++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1422:5: -> conjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:3: ^( LITERAL_or (et+= eventTrigger )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_triggerLogicalExpression10354); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:19: (et+= eventTrigger )+
					int cnt162=0;
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==LPAREN||LA162_0==TRIGGER) ) {
							alt162=1;
						}

						switch (alt162) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:19: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10358);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt162 >= 1 ) break loop162;
							EarlyExitException eee = new EarlyExitException(162, input);
							throw eee;
						}
						cnt162++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1425:5: -> disjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1427:3: ^( LITERAL_xor (et+= eventTrigger )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_triggerLogicalExpression10385); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1427:20: (et+= eventTrigger )+
					int cnt163=0;
					loop163:
					while (true) {
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==LPAREN||LA163_0==TRIGGER) ) {
							alt163=1;
						}

						switch (alt163) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1427:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10389);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt163 >= 1 ) break loop163;
							EarlyExitException eee = new EarlyExitException(163, input);
							throw eee;
						}
						cnt163++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1428:5: -> xor(terms=$et)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_et));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:3: ^( LITERAL_then (et+= eventTrigger )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_triggerLogicalExpression10416); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:21: (et+= eventTrigger )+
					int cnt164=0;
					loop164:
					while (true) {
						int alt164=2;
						int LA164_0 = input.LA(1);
						if ( (LA164_0==LPAREN||LA164_0==TRIGGER) ) {
							alt164=1;
						}

						switch (alt164) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10420);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt164 >= 1 ) break loop164;
							EarlyExitException eee = new EarlyExitException(164, input);
							throw eee;
						}
						cnt164++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1431:5: -> cand(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1433:3: ^( LITERAL_else (et+= eventTrigger )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_triggerLogicalExpression10447); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1433:21: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1433:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10451);
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
					// 1434:5: -> cor(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1436:3: first= eventTrigger
					{
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10477);
					first=eventTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1437:5: -> {$first.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:1: eventTrigger : (tr= TRIGGER -> {%{$tr.text}}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st));
	public final UnparseBLESS3.eventTrigger_return eventTrigger() throws RecognitionException {
		UnparseBLESS3.eventTrigger_return retval = new UnparseBLESS3.eventTrigger_return();
		retval.start = input.LT(1);

		BAST tr=null;
		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1441:3: (tr= TRIGGER -> {%{$tr.text}}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st))
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==TRIGGER) ) {
				alt167=1;
			}
			else if ( (LA167_0==LPAREN) ) {
				alt167=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 167, 0, input);
				throw nvae;
			}

			switch (alt167) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1442:3: tr= TRIGGER
					{
					tr=(BAST)match(input,TRIGGER,FOLLOW_TRIGGER_in_eventTrigger10502); 
					// TEMPLATE REWRITE
					// 1443:5: -> {%{$tr.text}}
					{
						retval.st = new StringTemplate(templateLib,(tr!=null?tr.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1445:3: ^( LPAREN tle= triggerLogicalExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger10521); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger10525);
					tle=triggerLogicalExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger10527); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1446:5: -> parentheses(be=$tle.st)
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
	protected DFA76 dfa76 = new DFA76(this);
	static final String DFA6_eotS =
		"\7\uffff";
	static final String DFA6_eofS =
		"\7\uffff";
	static final String DFA6_minS =
		"\1\u012a\1\2\1\53\1\uffff\1\3\2\uffff";
	static final String DFA6_maxS =
		"\1\u012a\1\2\1\101\1\uffff\1\101\2\uffff";
	static final String DFA6_acceptS =
		"\3\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA6_specialS =
		"\7\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\25\uffff\1\4",
			"",
			"\1\5\47\uffff\1\6\25\uffff\1\4",
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
			return "232:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top+)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$top+bottom=$bottom+)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom+));";
		}
	}

	static final String DFA14_eotS =
		"\12\uffff";
	static final String DFA14_eofS =
		"\12\uffff";
	static final String DFA14_minS =
		"\1\40\1\2\1\u012c\1\2\1\101\2\3\1\53\2\uffff";
	static final String DFA14_maxS =
		"\1\40\1\2\1\u012c\1\2\3\101\1\u0121\2\uffff";
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
			"\1\7\75\uffff\1\6",
			"\1\7\75\uffff\1\6",
			"\1\11\u00f5\uffff\1\10",
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
		"\1\u00b9\1\2\1\101\3\3\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff\4\u00f8"+
		"\1\2\2\u00f8\1\2\2\u00f8\1\2\1\u00f8\1\3\1\2\1\3\1\u00c7\1\3\1\2\1\3\1"+
		"\u00c7\1\3\1\2\1\3\1\u00c7\1\3\1\u00c7\1\3\2\u0109\1\3\1\u00c7\1\3\2\u0109"+
		"\1\3\1\u00c7\1\3\2\u0109\1\uffff\1\2\1\uffff\1\3\2\u0109\1\u00f8\2\2\2"+
		"\3\1\uffff\1\2\1\uffff\1\3\2\u0109\1\u00f8\2\2\2\3\1\uffff\1\2\1\uffff"+
		"\1\3\2\u0109\1\u00f8\2\2\2\3\1\u00f8\1\3\2\2\2\3\2\101\1\u00f8\2\2\1\u00f8"+
		"\2\2\1\u00f8\1\3\2\2\2\3\2\101\1\u00f8\2\2\1\u00f8\2\2\1\u00f8\1\3\2\2"+
		"\2\3\2\101\1\u00f8\2\2\1\u00f8\2\2\1\3\1\2\1\3\2\101\1\3\2\2\1\3\2\2\5"+
		"\3\4\101\1\3\1\2\1\3\2\101\1\3\2\2\1\3\2\2\5\3\4\101\1\3\1\2\1\3\2\101"+
		"\1\3\2\2\1\3\2\2\5\3\4\101\1\3\1\u00c7\5\3\4\101\20\3\1\u00c7\5\3\4\101"+
		"\20\3\1\u00c7\5\3\4\101\17\3\2\uffff\1\3\2\u0109\17\3\1\u00f8\12\3\2\uffff"+
		"\1\3\2\u0109\17\3\1\u00f8\12\3\2\uffff\1\3\2\u0109\17\3\1\u00f8\13\3\2"+
		"\2\15\3\2\u00f8\1\3\2\2\15\3\2\u00f8\1\3\2\2\15\3\2\u00f8\2\101\1\3\2"+
		"\2\1\3\2\2\2\3\2\101\1\3\2\2\1\3\2\2\2\3\2\101\1\3\2\2\1\3\2\2\7\3\4\101"+
		"\5\3\4\101\5\3\4\101\124\3";
	static final String DFA19_maxS =
		"\1\u00b9\1\2\1\u00ee\3\u00c1\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff"+
		"\4\u0109\1\2\2\u0109\1\2\2\u0109\1\2\1\u0109\1\3\1\2\1\3\1\u010a\1\3\1"+
		"\2\1\3\1\u010a\1\3\1\2\1\3\1\u010a\1\u00d0\1\u010a\1\117\2\u0109\1\u00d0"+
		"\1\u010a\1\117\2\u0109\1\u00d0\1\u010a\1\117\2\u0109\1\uffff\1\2\1\uffff"+
		"\1\117\3\u0109\2\2\2\117\1\uffff\1\2\1\uffff\1\117\3\u0109\2\2\2\117\1"+
		"\uffff\1\2\1\uffff\1\117\3\u0109\2\2\2\117\1\u0109\1\3\2\2\2\117\1\u00f8"+
		"\1\u00e7\1\u0109\2\2\1\u0109\2\2\1\u0109\1\3\2\2\2\117\1\u00f8\1\u00e7"+
		"\1\u0109\2\2\1\u0109\2\2\1\u0109\1\3\2\2\2\117\1\u00f8\1\u00e7\1\u0109"+
		"\2\2\1\u0109\2\2\1\3\1\2\1\3\1\u00f8\1\u00e7\1\3\2\2\1\3\2\2\5\3\1\u00f8"+
		"\1\u00e7\1\u00f8\1\u00e7\1\3\1\2\1\3\1\u00f8\1\u00e7\1\3\2\2\1\3\2\2\5"+
		"\3\1\u00f8\1\u00e7\1\u00f8\1\u00e7\1\3\1\2\1\3\1\u00f8\1\u00e7\1\3\2\2"+
		"\1\3\2\2\5\3\1\u00f8\1\u00e7\1\u00f8\1\u00e7\1\u00c1\1\u010a\5\3\1\u00f8"+
		"\1\u00e7\1\u00f8\1\u00e7\5\117\12\3\1\u00c1\1\u010a\5\3\1\u00f8\1\u00e7"+
		"\1\u00f8\1\u00e7\5\117\12\3\1\u00c1\1\u010a\5\3\1\u00f8\1\u00e7\1\u00f8"+
		"\1\u00e7\5\117\12\3\2\uffff\1\117\2\u0109\5\117\12\3\1\u0109\12\117\2"+
		"\uffff\1\117\2\u0109\5\117\12\3\1\u0109\12\117\2\uffff\1\117\2\u0109\5"+
		"\117\12\3\1\u0109\12\117\1\3\2\2\2\117\1\3\12\117\2\u0109\1\3\2\2\2\117"+
		"\1\3\12\117\2\u0109\1\3\2\2\2\117\1\3\12\117\2\u0109\1\u00f8\1\u00e7\1"+
		"\3\2\2\1\3\2\2\2\3\1\u00f8\1\u00e7\1\3\2\2\1\3\2\2\2\3\1\u00f8\1\u00e7"+
		"\1\3\2\2\1\3\2\2\7\3\1\u00f8\1\u00e7\1\u00f8\1\u00e7\5\3\1\u00f8\1\u00e7"+
		"\1\u00f8\1\u00e7\5\3\1\u00f8\1\u00e7\1\u00f8\1\u00e7\5\117\12\3\5\117"+
		"\12\3\5\117\13\3\12\117\1\3\12\117\1\3\12\117\6\3";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\uffff\1\12\1\2\1\uffff\1\13\1\3\1\uffff\1\14\47\uffff\1"+
		"\4\1\uffff\1\15\10\uffff\1\5\1\uffff\1\16\10\uffff\1\6\1\uffff\1\17\u00bc"+
		"\uffff\1\7\1\20\35\uffff\1\10\1\21\35\uffff\1\11\1\22\u00e0\uffff";
	static final String DFA19_specialS =
		"\u022b\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\u0083\uffff\1\4\50\uffff\1\5",
			"\1\6\53\uffff\1\7\u0091\uffff\1\10",
			"\1\11\53\uffff\1\12\u0091\uffff\1\13",
			"\1\14\53\uffff\1\15\u0091\uffff\1\16",
			"",
			"\1\17",
			"",
			"",
			"\1\20",
			"",
			"",
			"\1\21",
			"",
			"\1\22\1\23\17\uffff\1\24",
			"\1\25\1\26\17\uffff\1\27",
			"\1\30\1\31\17\uffff\1\32",
			"\1\33\1\34\17\uffff\1\35",
			"\1\36",
			"\1\33\1\34\17\uffff\1\35",
			"\1\37\1\40\17\uffff\1\41",
			"\1\42",
			"\1\37\1\40\17\uffff\1\41",
			"\1\43\1\44\17\uffff\1\45",
			"\1\46",
			"\1\43\1\44\17\uffff\1\45",
			"\1\47",
			"\1\50",
			"\1\47",
			"\1\52\101\uffff\1\51\1\53",
			"\1\54",
			"\1\55",
			"\1\54",
			"\1\57\101\uffff\1\56\1\60",
			"\1\61",
			"\1\62",
			"\1\61",
			"\1\64\101\uffff\1\63\1\65",
			"\1\66\u00bd\uffff\1\70\16\uffff\1\67",
			"\1\72\101\uffff\1\71\1\73",
			"\1\74\51\uffff\1\76\41\uffff\1\75",
			"\1\77",
			"\1\100",
			"\1\101\u00bd\uffff\1\103\16\uffff\1\102",
			"\1\105\101\uffff\1\104\1\106",
			"\1\107\51\uffff\1\111\41\uffff\1\110",
			"\1\112",
			"\1\113",
			"\1\114\u00bd\uffff\1\116\16\uffff\1\115",
			"\1\120\101\uffff\1\117\1\121",
			"\1\122\51\uffff\1\124\41\uffff\1\123",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"",
			"\1\130\51\uffff\1\132\41\uffff\1\131",
			"\1\133",
			"\1\134",
			"\1\33\1\34\17\uffff\1\35",
			"\1\135",
			"\1\136",
			"\1\137\51\uffff\1\141\41\uffff\1\140",
			"\1\142\51\uffff\1\144\41\uffff\1\143",
			"",
			"\1\145",
			"",
			"\1\146\51\uffff\1\150\41\uffff\1\147",
			"\1\151",
			"\1\152",
			"\1\37\1\40\17\uffff\1\41",
			"\1\153",
			"\1\154",
			"\1\155\51\uffff\1\157\41\uffff\1\156",
			"\1\160\51\uffff\1\162\41\uffff\1\161",
			"",
			"\1\163",
			"",
			"\1\164\51\uffff\1\166\41\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\43\1\44\17\uffff\1\45",
			"\1\171",
			"\1\172",
			"\1\173\51\uffff\1\175\41\uffff\1\174",
			"\1\176\51\uffff\1\u0080\41\uffff\1\177",
			"\1\u0081\1\u0082\17\uffff\1\u0083",
			"\1\47",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086\51\uffff\1\u0088\41\uffff\1\u0087",
			"\1\u0089\51\uffff\1\u008b\41\uffff\1\u008a",
			"\1\u008d\u00b6\uffff\1\u008c",
			"\1\u008e\134\uffff\1\u0090\110\uffff\1\u008f",
			"\1\33\1\34\17\uffff\1\35",
			"\1\u0091",
			"\1\u0092",
			"\1\33\1\34\17\uffff\1\35",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\1\u0096\17\uffff\1\u0097",
			"\1\54",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a\51\uffff\1\u009c\41\uffff\1\u009b",
			"\1\u009d\51\uffff\1\u009f\41\uffff\1\u009e",
			"\1\u00a1\u00b6\uffff\1\u00a0",
			"\1\u00a2\134\uffff\1\u00a4\110\uffff\1\u00a3",
			"\1\37\1\40\17\uffff\1\41",
			"\1\u00a5",
			"\1\u00a6",
			"\1\37\1\40\17\uffff\1\41",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9\1\u00aa\17\uffff\1\u00ab",
			"\1\61",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae\51\uffff\1\u00b0\41\uffff\1\u00af",
			"\1\u00b1\51\uffff\1\u00b3\41\uffff\1\u00b2",
			"\1\u00b5\u00b6\uffff\1\u00b4",
			"\1\u00b6\134\uffff\1\u00b8\110\uffff\1\u00b7",
			"\1\43\1\44\17\uffff\1\45",
			"\1\u00b9",
			"\1\u00ba",
			"\1\43\1\44\17\uffff\1\45",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bd",
			"\1\u00c0\u00b6\uffff\1\u00bf",
			"\1\u00c1\134\uffff\1\u00c3\110\uffff\1\u00c2",
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
			"\1\u00ce\u00b6\uffff\1\u00cd",
			"\1\u00cf\134\uffff\1\u00d1\110\uffff\1\u00d0",
			"\1\u00d3\u00b6\uffff\1\u00d2",
			"\1\u00d4\134\uffff\1\u00d6\110\uffff\1\u00d5",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d7",
			"\1\u00da\u00b6\uffff\1\u00d9",
			"\1\u00db\134\uffff\1\u00dd\110\uffff\1\u00dc",
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
			"\1\u00e8\u00b6\uffff\1\u00e7",
			"\1\u00e9\134\uffff\1\u00eb\110\uffff\1\u00ea",
			"\1\u00ed\u00b6\uffff\1\u00ec",
			"\1\u00ee\134\uffff\1\u00f0\110\uffff\1\u00ef",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f1",
			"\1\u00f4\u00b6\uffff\1\u00f3",
			"\1\u00f5\134\uffff\1\u00f7\110\uffff\1\u00f6",
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
			"\1\u0102\u00b6\uffff\1\u0101",
			"\1\u0103\134\uffff\1\u0105\110\uffff\1\u0104",
			"\1\u0107\u00b6\uffff\1\u0106",
			"\1\u0108\134\uffff\1\u010a\110\uffff\1\u0109",
			"\1\u010b\u00bd\uffff\1\u010c",
			"\1\u010e\101\uffff\1\u010d\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0116\u00b6\uffff\1\u0115",
			"\1\u0117\134\uffff\1\u0119\110\uffff\1\u0118",
			"\1\u011b\u00b6\uffff\1\u011a",
			"\1\u011c\134\uffff\1\u011e\110\uffff\1\u011d",
			"\1\u011f\51\uffff\1\76\41\uffff\1\75",
			"\1\u011f\51\uffff\1\76\41\uffff\1\75",
			"\1\u011f\51\uffff\1\76\41\uffff\1\75",
			"\1\u011f\51\uffff\1\76\41\uffff\1\75",
			"\1\u011f\51\uffff\1\76\41\uffff\1\75",
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
			"\1\u012a\u00bd\uffff\1\u012b",
			"\1\u012d\101\uffff\1\u012c\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0135\u00b6\uffff\1\u0134",
			"\1\u0136\134\uffff\1\u0138\110\uffff\1\u0137",
			"\1\u013a\u00b6\uffff\1\u0139",
			"\1\u013b\134\uffff\1\u013d\110\uffff\1\u013c",
			"\1\u013e\51\uffff\1\111\41\uffff\1\110",
			"\1\u013e\51\uffff\1\111\41\uffff\1\110",
			"\1\u013e\51\uffff\1\111\41\uffff\1\110",
			"\1\u013e\51\uffff\1\111\41\uffff\1\110",
			"\1\u013e\51\uffff\1\111\41\uffff\1\110",
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
			"\1\u0149\u00bd\uffff\1\u014a",
			"\1\u014c\101\uffff\1\u014b\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0154\u00b6\uffff\1\u0153",
			"\1\u0155\134\uffff\1\u0157\110\uffff\1\u0156",
			"\1\u0159\u00b6\uffff\1\u0158",
			"\1\u015a\134\uffff\1\u015c\110\uffff\1\u015b",
			"\1\u015d\51\uffff\1\124\41\uffff\1\123",
			"\1\u015d\51\uffff\1\124\41\uffff\1\123",
			"\1\u015d\51\uffff\1\124\41\uffff\1\123",
			"\1\u015d\51\uffff\1\124\41\uffff\1\123",
			"\1\u015d\51\uffff\1\124\41\uffff\1\123",
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
			"\1\u0168\51\uffff\1\u016a\41\uffff\1\u0169",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d\51\uffff\1\132\41\uffff\1\131",
			"\1\u016d\51\uffff\1\132\41\uffff\1\131",
			"\1\u016d\51\uffff\1\132\41\uffff\1\131",
			"\1\u016d\51\uffff\1\132\41\uffff\1\131",
			"\1\u016d\51\uffff\1\132\41\uffff\1\131",
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
			"\1\33\1\34\17\uffff\1\35",
			"\1\u0178\51\uffff\1\141\41\uffff\1\140",
			"\1\u0178\51\uffff\1\141\41\uffff\1\140",
			"\1\u0178\51\uffff\1\141\41\uffff\1\140",
			"\1\u0178\51\uffff\1\141\41\uffff\1\140",
			"\1\u0178\51\uffff\1\141\41\uffff\1\140",
			"\1\u0179\51\uffff\1\144\41\uffff\1\143",
			"\1\u0179\51\uffff\1\144\41\uffff\1\143",
			"\1\u0179\51\uffff\1\144\41\uffff\1\143",
			"\1\u0179\51\uffff\1\144\41\uffff\1\143",
			"\1\u0179\51\uffff\1\144\41\uffff\1\143",
			"",
			"",
			"\1\u017a\51\uffff\1\u017c\41\uffff\1\u017b",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f\51\uffff\1\150\41\uffff\1\147",
			"\1\u017f\51\uffff\1\150\41\uffff\1\147",
			"\1\u017f\51\uffff\1\150\41\uffff\1\147",
			"\1\u017f\51\uffff\1\150\41\uffff\1\147",
			"\1\u017f\51\uffff\1\150\41\uffff\1\147",
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
			"\1\37\1\40\17\uffff\1\41",
			"\1\u018a\51\uffff\1\157\41\uffff\1\156",
			"\1\u018a\51\uffff\1\157\41\uffff\1\156",
			"\1\u018a\51\uffff\1\157\41\uffff\1\156",
			"\1\u018a\51\uffff\1\157\41\uffff\1\156",
			"\1\u018a\51\uffff\1\157\41\uffff\1\156",
			"\1\u018b\51\uffff\1\162\41\uffff\1\161",
			"\1\u018b\51\uffff\1\162\41\uffff\1\161",
			"\1\u018b\51\uffff\1\162\41\uffff\1\161",
			"\1\u018b\51\uffff\1\162\41\uffff\1\161",
			"\1\u018b\51\uffff\1\162\41\uffff\1\161",
			"",
			"",
			"\1\u018c\51\uffff\1\u018e\41\uffff\1\u018d",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191\51\uffff\1\166\41\uffff\1\165",
			"\1\u0191\51\uffff\1\166\41\uffff\1\165",
			"\1\u0191\51\uffff\1\166\41\uffff\1\165",
			"\1\u0191\51\uffff\1\166\41\uffff\1\165",
			"\1\u0191\51\uffff\1\166\41\uffff\1\165",
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
			"\1\43\1\44\17\uffff\1\45",
			"\1\u019c\51\uffff\1\175\41\uffff\1\174",
			"\1\u019c\51\uffff\1\175\41\uffff\1\174",
			"\1\u019c\51\uffff\1\175\41\uffff\1\174",
			"\1\u019c\51\uffff\1\175\41\uffff\1\174",
			"\1\u019c\51\uffff\1\175\41\uffff\1\174",
			"\1\u019d\51\uffff\1\u0080\41\uffff\1\177",
			"\1\u019d\51\uffff\1\u0080\41\uffff\1\177",
			"\1\u019d\51\uffff\1\u0080\41\uffff\1\177",
			"\1\u019d\51\uffff\1\u0080\41\uffff\1\177",
			"\1\u019d\51\uffff\1\u0080\41\uffff\1\177",
			"\1\u00bd",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0\51\uffff\1\u01a2\41\uffff\1\u01a1",
			"\1\u01a3\51\uffff\1\u01a5\41\uffff\1\u01a4",
			"\1\47",
			"\1\u01a6\51\uffff\1\u0088\41\uffff\1\u0087",
			"\1\u01a6\51\uffff\1\u0088\41\uffff\1\u0087",
			"\1\u01a6\51\uffff\1\u0088\41\uffff\1\u0087",
			"\1\u01a6\51\uffff\1\u0088\41\uffff\1\u0087",
			"\1\u01a6\51\uffff\1\u0088\41\uffff\1\u0087",
			"\1\u01a7\51\uffff\1\u008b\41\uffff\1\u008a",
			"\1\u01a7\51\uffff\1\u008b\41\uffff\1\u008a",
			"\1\u01a7\51\uffff\1\u008b\41\uffff\1\u008a",
			"\1\u01a7\51\uffff\1\u008b\41\uffff\1\u008a",
			"\1\u01a7\51\uffff\1\u008b\41\uffff\1\u008a",
			"\1\33\1\34\17\uffff\1\35",
			"\1\33\1\34\17\uffff\1\35",
			"\1\u00d7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa\51\uffff\1\u01ac\41\uffff\1\u01ab",
			"\1\u01ad\51\uffff\1\u01af\41\uffff\1\u01ae",
			"\1\54",
			"\1\u01b0\51\uffff\1\u009c\41\uffff\1\u009b",
			"\1\u01b0\51\uffff\1\u009c\41\uffff\1\u009b",
			"\1\u01b0\51\uffff\1\u009c\41\uffff\1\u009b",
			"\1\u01b0\51\uffff\1\u009c\41\uffff\1\u009b",
			"\1\u01b0\51\uffff\1\u009c\41\uffff\1\u009b",
			"\1\u01b1\51\uffff\1\u009f\41\uffff\1\u009e",
			"\1\u01b1\51\uffff\1\u009f\41\uffff\1\u009e",
			"\1\u01b1\51\uffff\1\u009f\41\uffff\1\u009e",
			"\1\u01b1\51\uffff\1\u009f\41\uffff\1\u009e",
			"\1\u01b1\51\uffff\1\u009f\41\uffff\1\u009e",
			"\1\37\1\40\17\uffff\1\41",
			"\1\37\1\40\17\uffff\1\41",
			"\1\u00f1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4\51\uffff\1\u01b6\41\uffff\1\u01b5",
			"\1\u01b7\51\uffff\1\u01b9\41\uffff\1\u01b8",
			"\1\61",
			"\1\u01ba\51\uffff\1\u00b0\41\uffff\1\u00af",
			"\1\u01ba\51\uffff\1\u00b0\41\uffff\1\u00af",
			"\1\u01ba\51\uffff\1\u00b0\41\uffff\1\u00af",
			"\1\u01ba\51\uffff\1\u00b0\41\uffff\1\u00af",
			"\1\u01ba\51\uffff\1\u00b0\41\uffff\1\u00af",
			"\1\u01bb\51\uffff\1\u00b3\41\uffff\1\u00b2",
			"\1\u01bb\51\uffff\1\u00b3\41\uffff\1\u00b2",
			"\1\u01bb\51\uffff\1\u00b3\41\uffff\1\u00b2",
			"\1\u01bb\51\uffff\1\u00b3\41\uffff\1\u00b2",
			"\1\u01bb\51\uffff\1\u00b3\41\uffff\1\u00b2",
			"\1\43\1\44\17\uffff\1\45",
			"\1\43\1\44\17\uffff\1\45",
			"\1\u01bd\u00b6\uffff\1\u01bc",
			"\1\u01be\134\uffff\1\u01c0\110\uffff\1\u01bf",
			"\1\u00bd",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u00bd",
			"\1\u01c3",
			"\1\u01c4",
			"\1\47",
			"\1\47",
			"\1\u01c6\u00b6\uffff\1\u01c5",
			"\1\u01c7\134\uffff\1\u01c9\110\uffff\1\u01c8",
			"\1\u00d7",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u00d7",
			"\1\u01cc",
			"\1\u01cd",
			"\1\54",
			"\1\54",
			"\1\u01cf\u00b6\uffff\1\u01ce",
			"\1\u01d0\134\uffff\1\u01d2\110\uffff\1\u01d1",
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
			"\1\u01dd\u00b6\uffff\1\u01dc",
			"\1\u01de\134\uffff\1\u01e0\110\uffff\1\u01df",
			"\1\u01e2\u00b6\uffff\1\u01e1",
			"\1\u01e3\134\uffff\1\u01e5\110\uffff\1\u01e4",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01ec\u00b6\uffff\1\u01eb",
			"\1\u01ed\134\uffff\1\u01ef\110\uffff\1\u01ee",
			"\1\u01f1\u00b6\uffff\1\u01f0",
			"\1\u01f2\134\uffff\1\u01f4\110\uffff\1\u01f3",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fb\u00b6\uffff\1\u01fa",
			"\1\u01fc\134\uffff\1\u01fe\110\uffff\1\u01fd",
			"\1\u0200\u00b6\uffff\1\u01ff",
			"\1\u0201\134\uffff\1\u0203\110\uffff\1\u0202",
			"\1\u0204\51\uffff\1\u016a\41\uffff\1\u0169",
			"\1\u0204\51\uffff\1\u016a\41\uffff\1\u0169",
			"\1\u0204\51\uffff\1\u016a\41\uffff\1\u0169",
			"\1\u0204\51\uffff\1\u016a\41\uffff\1\u0169",
			"\1\u0204\51\uffff\1\u016a\41\uffff\1\u0169",
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
			"\1\u020f\51\uffff\1\u017c\41\uffff\1\u017b",
			"\1\u020f\51\uffff\1\u017c\41\uffff\1\u017b",
			"\1\u020f\51\uffff\1\u017c\41\uffff\1\u017b",
			"\1\u020f\51\uffff\1\u017c\41\uffff\1\u017b",
			"\1\u020f\51\uffff\1\u017c\41\uffff\1\u017b",
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
			"\1\u021a\51\uffff\1\u018e\41\uffff\1\u018d",
			"\1\u021a\51\uffff\1\u018e\41\uffff\1\u018d",
			"\1\u021a\51\uffff\1\u018e\41\uffff\1\u018d",
			"\1\u021a\51\uffff\1\u018e\41\uffff\1\u018d",
			"\1\u021a\51\uffff\1\u018e\41\uffff\1\u018d",
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
			"\1\u0225\51\uffff\1\u01a2\41\uffff\1\u01a1",
			"\1\u0225\51\uffff\1\u01a2\41\uffff\1\u01a1",
			"\1\u0225\51\uffff\1\u01a2\41\uffff\1\u01a1",
			"\1\u0225\51\uffff\1\u01a2\41\uffff\1\u01a1",
			"\1\u0225\51\uffff\1\u01a2\41\uffff\1\u01a1",
			"\1\u0226\51\uffff\1\u01a5\41\uffff\1\u01a4",
			"\1\u0226\51\uffff\1\u01a5\41\uffff\1\u01a4",
			"\1\u0226\51\uffff\1\u01a5\41\uffff\1\u01a4",
			"\1\u0226\51\uffff\1\u01a5\41\uffff\1\u01a4",
			"\1\u0226\51\uffff\1\u01a5\41\uffff\1\u01a4",
			"\1\u00d7",
			"\1\u0227\51\uffff\1\u01ac\41\uffff\1\u01ab",
			"\1\u0227\51\uffff\1\u01ac\41\uffff\1\u01ab",
			"\1\u0227\51\uffff\1\u01ac\41\uffff\1\u01ab",
			"\1\u0227\51\uffff\1\u01ac\41\uffff\1\u01ab",
			"\1\u0227\51\uffff\1\u01ac\41\uffff\1\u01ab",
			"\1\u0228\51\uffff\1\u01af\41\uffff\1\u01ae",
			"\1\u0228\51\uffff\1\u01af\41\uffff\1\u01ae",
			"\1\u0228\51\uffff\1\u01af\41\uffff\1\u01ae",
			"\1\u0228\51\uffff\1\u01af\41\uffff\1\u01ae",
			"\1\u0228\51\uffff\1\u01af\41\uffff\1\u01ae",
			"\1\u00f1",
			"\1\u0229\51\uffff\1\u01b6\41\uffff\1\u01b5",
			"\1\u0229\51\uffff\1\u01b6\41\uffff\1\u01b5",
			"\1\u0229\51\uffff\1\u01b6\41\uffff\1\u01b5",
			"\1\u0229\51\uffff\1\u01b6\41\uffff\1\u01b5",
			"\1\u0229\51\uffff\1\u01b6\41\uffff\1\u01b5",
			"\1\u022a\51\uffff\1\u01b9\41\uffff\1\u01b8",
			"\1\u022a\51\uffff\1\u01b9\41\uffff\1\u01b8",
			"\1\u022a\51\uffff\1\u01b9\41\uffff\1\u01b8",
			"\1\u022a\51\uffff\1\u01b9\41\uffff\1\u01b8",
			"\1\u022a\51\uffff\1\u01b9\41\uffff\1\u01b8",
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

	static final String DFA76_eotS =
		"\100\uffff";
	static final String DFA76_eofS =
		"\100\uffff";
	static final String DFA76_minS =
		"\1\u010c\1\2\1\u00f8\1\3\1\2\1\3\4\uffff\1\u00c7\1\3\2\u0109\1\3\2\2\2"+
		"\3\2\101\1\3\2\2\1\3\2\2\5\3\4\101\34\3";
	static final String DFA76_maxS =
		"\1\u010c\1\2\1\u0109\1\u00ee\1\2\1\u00ee\4\uffff\1\u010a\1\117\2\u0109"+
		"\1\u00ee\2\2\2\117\1\u00f8\1\u00e7\1\u00ee\2\2\1\u00ee\2\2\5\3\1\u00f8"+
		"\1\u00e7\1\u00f8\1\u00e7\5\117\12\3\1\u00ee\12\117\2\u00ee";
	static final String DFA76_acceptS =
		"\6\uffff\1\1\1\2\1\3\1\4\66\uffff";
	static final String DFA76_specialS =
		"\100\uffff}>";
	static final String[] DFA76_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\1\4\17\uffff\1\5",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"\1\12",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"",
			"",
			"",
			"",
			"\1\14\101\uffff\1\13\1\15",
			"\1\16\51\uffff\1\20\41\uffff\1\17",
			"\1\21",
			"\1\22",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"\1\23",
			"\1\24",
			"\1\25\51\uffff\1\27\41\uffff\1\26",
			"\1\30\51\uffff\1\32\41\uffff\1\31",
			"\1\34\u00b6\uffff\1\33",
			"\1\35\134\uffff\1\37\110\uffff\1\36",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"\1\40",
			"\1\41",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\52\u00b6\uffff\1\51",
			"\1\53\134\uffff\1\55\110\uffff\1\54",
			"\1\57\u00b6\uffff\1\56",
			"\1\60\134\uffff\1\62\110\uffff\1\61",
			"\1\63\51\uffff\1\20\41\uffff\1\17",
			"\1\63\51\uffff\1\20\41\uffff\1\17",
			"\1\63\51\uffff\1\20\41\uffff\1\17",
			"\1\63\51\uffff\1\20\41\uffff\1\17",
			"\1\63\51\uffff\1\20\41\uffff\1\17",
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
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"\1\76\51\uffff\1\27\41\uffff\1\26",
			"\1\76\51\uffff\1\27\41\uffff\1\26",
			"\1\76\51\uffff\1\27\41\uffff\1\26",
			"\1\76\51\uffff\1\27\41\uffff\1\26",
			"\1\76\51\uffff\1\27\41\uffff\1\26",
			"\1\77\51\uffff\1\32\41\uffff\1\31",
			"\1\77\51\uffff\1\32\41\uffff\1\31",
			"\1\77\51\uffff\1\32\41\uffff\1\31",
			"\1\77\51\uffff\1\32\41\uffff\1\31",
			"\1\77\51\uffff\1\32\41\uffff\1\31",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11",
			"\1\6\75\uffff\1\7\u0083\uffff\1\10\50\uffff\1\11"
	};

	static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
	static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
	static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
	static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
	static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
	static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
	static final short[][] DFA76_transition;

	static {
		int numStates = DFA76_transitionS.length;
		DFA76_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
		}
	}

	protected class DFA76 extends DFA {

		public DFA76(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 76;
			this.eot = DFA76_eot;
			this.eof = DFA76_eof;
			this.min = DFA76_min;
			this.max = DFA76_max;
			this.accept = DFA76_accept;
			this.special = DFA76_special;
			this.transition = DFA76_transition;
		}
		@Override
		public String getDescription() {
			return "944:1: quantity : ( ^( QUANTITY number= aNumber ) -> {$number.st}| ^( QUANTITY number= aNumber unit= ID ) -> template(number=$number.stunit=$unit.st) \"<number> <unit>\"| ^( QUANTITY number= aNumber LITERAL_scalar ) -> template(number=$number.st) \"<number> scalar\"| ^( QUANTITY number= aNumber LITERAL_whole ) -> template(number=$number.st) \"<number> whole\");";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_NAME_in_unitName94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitName98 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitName102 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula146 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula176 = new BitSet(new long[]{0x0000080000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula183 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula220 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration282 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration289 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration293 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration346 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration353 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration357 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitExtension409 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension413 = new BitSet(new long[]{0x0000000100000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_TIMES_in_unitFactor458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor462 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor501 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFactor505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration583 = new BitSet(new long[]{0x0000000000000000L,0x4000004400000000L,0x2200020000000000L,0x0000040800040000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_enumerationType_in_type626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType784 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationType788 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType914 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType917 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType965 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1012 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1016 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1019 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1027 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1067 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1070 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1078 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1082 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1131 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1146 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1150 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1195 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1198 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1305 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1352 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1388 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1391 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1399 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1403 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1407 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1453 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1472 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1518 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1583 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1586 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1610 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1661 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1672 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1680 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1735 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1739 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1750 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1754 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1758 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1766 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType1822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType1828 = new BitSet(new long[]{0x0000000000000000L,0x4000004400000002L,0x2200020000000000L,0x0000040800040000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType1832 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList1879 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList1883 = new BitSet(new long[]{0x0000800000000008L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange1932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0300000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_record_in_recordType1977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType1981 = new BitSet(new long[]{0x0000000040000008L});
	public static final BitSet FOLLOW_LITERAL_variant_in_recordType2008 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2012 = new BitSet(new long[]{0x0000000040000008L});
	public static final BitSet FOLLOW_LITERAL_union_in_recordType2039 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2043 = new BitSet(new long[]{0x0000000040000008L});
	public static final BitSet FOLLOW_COLON_in_recordField2077 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordField2081 = new BitSet(new long[]{0x0000000000000000L,0x4000004400000002L,0x2200020000000000L,0x0000040800040000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField2085 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary2126 = new BitSet(new long[]{0x0000000000034000L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2130 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2161 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables2197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables2201 = new BitSet(new long[]{0x0000000000000008L,0x0100000000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable2234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ghostVariable2239 = new BitSet(new long[]{0x0000000000000000L,0x4000004400000002L,0x2200020000000000L,0x0000040800040000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable2243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2284 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2294 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2332 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2348 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2383 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2391 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2397 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2401 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2407 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2442 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2450 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2476 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2520 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2524 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion2530 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion2544 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_in_variableList2588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList2606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList2610 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TILDE_in_variable2644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable2648 = new BitSet(new long[]{0x0000000000000000L,0x4000004400000002L,0x2200020000000000L,0x0000040800040000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable2652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_conditionalAssertionFunction2734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction2738 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_conditionalAssertionFunction2742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair2775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair2779 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair2783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration2826 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2851 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration2855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration2885 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration2889 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_ARROW_in_enumerationPair2926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationPair2930 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair2934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation2973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation2977 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3002 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3006 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation3010 = new BitSet(new long[]{0x0000000040000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3045 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_invocation3049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COLON_in_actualParameter3086 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_actualParameter3090 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_actualParameter3094 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction3175 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction3179 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction3185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3223 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration3227 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion3256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion3272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion3288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion3304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression3336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression3352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression3368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression3384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression3400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression3416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3420 = new BitSet(new long[]{0x4140080010080310L,0x2800000048000102L,0x800022C100000008L,0x84A7000328800010L,0x0000020280083002L});
	public static final BitSet FOLLOW_disjunction_in_expression3424 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression3434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3438 = new BitSet(new long[]{0x4140080010080310L,0x2800000048000102L,0x800022C100000008L,0x84A7000328800010L,0x0000020280083002L});
	public static final BitSet FOLLOW_disjunction_in_expression3442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification3461 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000100000000000L});
	public static final BitSet FOLLOW_in_which_in_universalQuantification3469 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification3473 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification3477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_in_which3498 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_range_in_in_which3502 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_which_in_in_which3514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_in_which3518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification3537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000100000000000L});
	public static final BitSet FOLLOW_in_which_in_existentialQuantification3545 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_existentialQuantification3549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification3553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification3573 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification3577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000100000000000L});
	public static final BitSet FOLLOW_in_which_in_sumQuantification3581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification3585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sumQuantification3589 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification3611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification3615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000100000000000L});
	public static final BitSet FOLLOW_in_which_in_productQuantification3619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification3623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_productQuantification3627 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification3650 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification3654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L,0x0000100000000000L});
	public static final BitSet FOLLOW_in_which_in_countingQuantification3658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_countingQuantification3662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_countingQuantification3666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables3690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_logicVariables3694 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables3707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction3728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction3732 = new BitSet(new long[]{0x4140080010080318L,0x0800000048000102L,0x800002C100000008L,0x84A6000328800010L,0x0000020280083002L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction3745 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction3749 = new BitSet(new long[]{0x4140080010080318L,0x0800000048000102L,0x800002C100000008L,0x84A6000328800010L,0x0000020280083002L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction3762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction3766 = new BitSet(new long[]{0x4140080010080318L,0x0800000048000102L,0x800002C100000008L,0x84A6000328800010L,0x0000020280083002L});
	public static final BitSet FOLLOW_conjunction_in_disjunction3779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction3798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction3802 = new BitSet(new long[]{0x4140080010080318L,0x0800000008000102L,0x800002C100000008L,0x84A6000328000010L,0x0000020280083002L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction3815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction3819 = new BitSet(new long[]{0x4140080010080318L,0x0800000008000102L,0x800002C100000008L,0x84A6000328000010L,0x0000020280083002L});
	public static final BitSet FOLLOW_relation_in_conjunction3832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_relation3851 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation3856 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation3860 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_relation3890 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation3895 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation3899 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AM_in_relation3931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation3936 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation3940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AL_in_relation3972 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation3977 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation3981 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_relation4013 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4018 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation4022 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_EQUALS_in_relation4054 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4059 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation4063 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_relation4095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4100 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation4104 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_NEQ_in_relation4134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4139 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x8022000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_addSub_in_relation4143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_addSub_in_relation4172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_range4199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4203 = new BitSet(new long[]{0x0000000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_subexpression_in_range4207 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMADOT_in_range4245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4249 = new BitSet(new long[]{0x0000000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_subexpression_in_range4253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTCOMMA_in_range4291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4295 = new BitSet(new long[]{0x0000000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_subexpression_in_range4299 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMACOMMA_in_range4337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4341 = new BitSet(new long[]{0x0000000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_subexpression_in_range4345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_addSub4388 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub4392 = new BitSet(new long[]{0x0100080010080018L,0x0800000008000102L,0x800002C100000008L,0x0002000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_MINUS_in_addSub4418 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub4422 = new BitSet(new long[]{0x0100080010080010L,0x0800000008000102L,0x800002C100000008L,0x0002000328000010L,0x0000020280083000L});
	public static final BitSet FOLLOW_multDiv_in_addSub4426 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multDiv_in_addSub4458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multDiv4489 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4493 = new BitSet(new long[]{0x0100000010080018L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_DIVIDE_in_multDiv4519 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4523 = new BitSet(new long[]{0x0100000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_multDiv4559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4563 = new BitSet(new long[]{0x0100000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_multDiv4599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4603 = new BitSet(new long[]{0x0100000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_multDiv4639 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4643 = new BitSet(new long[]{0x0100000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4647 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation4711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation4715 = new BitSet(new long[]{0x0000000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation4719 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation4751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression4782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression4786 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_subexpression4818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression4822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression4854 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression4858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression4890 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression4894 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression4926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression4930 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression4960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression4990 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression4994 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5019 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5023 = new BitSet(new long[]{0x0000000010080010L,0x0000000008000102L,0x000002C000000008L,0x0002000328000010L,0x0000020080083000L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5027 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5057 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5061 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5065 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_periodShift5222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_periodShift5296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5320 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression5356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5360 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression5398 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5402 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5406 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression5440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5444 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression5482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5486 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5490 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression5522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5526 = new BitSet(new long[]{0x0000000000000018L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression5552 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5556 = new BitSet(new long[]{0x0000000000000018L,0x0000000000000002L,0x0000028000000008L,0x0002000128000000L,0x0000020080003000L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression5591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQ_in_conditionalExpression5595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5599 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5603 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression5612 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression5658 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression5664 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RECORD_TERM_in_recordTerm5700 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordTerm5704 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm5708 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_ARROW_in_recordValue5747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordValue5751 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000028000000008L,0x0000000128000000L,0x0000000080003000L});
	public static final BitSet FOLLOW_value_in_recordValue5755 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_predicate5792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value5813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value5831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value5849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value5867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value5885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName5912 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName5914 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName5918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName5950 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName5954 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName5958 = new BitSet(new long[]{0x0000800000000008L,0x0800000000000000L,0x8000000100000000L,0x8020000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_DOT_in_valueName5965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName5969 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6010 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_valueName6014 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6018 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6054 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6058 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6085 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6091 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6120 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6122 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6207 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6261 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6306 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6310 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x8000000100000000L,0x8020000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6314 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_partialName6385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_constant6410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant6418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant6426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant6434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant6442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity6459 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity6463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity6483 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity6487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_quantity6491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity6523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity6527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity6529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity6556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity6560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity6562 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber6597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber6611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QCLREF_in_aNumber6625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference6657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference6661 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference6698 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference6702 = new BitSet(new long[]{0x0000200000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference6706 = new BitSet(new long[]{0x0000200000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference6748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference6752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference6756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference6798 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference6802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference6806 = new BitSet(new long[]{0x0000200000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference6810 = new BitSet(new long[]{0x0000200000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference6856 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference6860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference6864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference6899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference6903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference6907 = new BitSet(new long[]{0x0000200000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference6911 = new BitSet(new long[]{0x0000200000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField6953 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField6957 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField6982 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField6986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7042 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7044 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7070 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause7105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7110 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0004000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7117 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7135 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7140 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7152 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7157 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_throwsClause7265 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7302 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification7335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification7341 = new BitSet(new long[]{0x0000000000000440L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification7348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification7350 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification7356 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7405 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration7437 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7441 = new BitSet(new long[]{0x0000000000074008L,0x0010000000000000L,0x0000002000000400L,0x0000000000002800L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7460 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L,0x0000002000000400L,0x0000000000002800L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7470 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L,0x0000000000000400L,0x0000000000002800L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7475 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L,0x0000000000000400L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7480 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000400L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7485 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration7490 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause7550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause7554 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7586 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm7590 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7596 = new BitSet(new long[]{0x2000000000040000L,0x8000000000000000L,0x00000000000001E0L,0x0000080000201400L,0x0000000000000018L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm7634 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7638 = new BitSet(new long[]{0x2000000000040000L,0x8000000000000000L,0x00000000000001E0L,0x0000080000201400L,0x0000000000000018L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7680 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7710 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_assertedAction7761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_assertedAction7765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_S_in_assertedAction7776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_action_in_assertedAction7780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_assertedAction7786 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_basicAction_in_action7832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action7848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action7864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action7880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action7896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action7912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action7929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction7958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction7974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction7988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_basicAction7992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException8107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_issueException8111 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException8115 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_assignment8159 = new BitSet(new long[]{0x0000000000000000L,0x00000000A0000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8163 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_nameTick8202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_nameTick8206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_valueName_in_nameTick8231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8308 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8312 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000080002000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8323 = new BitSet(new long[]{0x0000000000000008L,0x00000000A0000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8365 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_whenThrow8369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_whenThrow8377 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8389 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation8433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation8450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation8467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation8484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation8501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction8524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction8542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction8560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PORT_OUTPUT_in_portOutput8587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portOutput8591 = new BitSet(new long[]{0x0000000000000008L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_portOutput8595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PORT_INPUT_in_portInput8637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portInput8641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000080002000L});
	public static final BitSet FOLLOW_valueName_in_portInput8645 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_subprogramCall8689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_subprogramCall8693 = new BitSet(new long[]{0x0000000140000018L,0x0000000000000002L,0x0000020000000008L,0x0002000100000000L,0x0000000080003000L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall8697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8746 = new BitSet(new long[]{0x0000000040000018L,0x0000000000000002L,0x0000020000000008L,0x0002000100000000L,0x0000000080003000L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalActual8801 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalActual8805 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L,0x0000020000000008L,0x0002000100000000L,0x0000000080003000L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8809 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter8853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter8868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter8883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative8911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8915 = new BitSet(new long[]{0x8000000000000008L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction8939 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_guardedAction8943 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction8947 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop8986 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop8990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_INVARIANT_in_whileLoop8994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop8998 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_whileLoop9005 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9009 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop9023 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop9072 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_forLoop9076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop9080 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forLoop9084 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_forLoop9088 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_forLoop9094 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_forLoop9098 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_doUntilLoop9181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_doUntilLoop9192 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9196 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9209 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9271 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9275 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0010040000140001L,0x0000000000100000L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9279 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9285 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause9335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9343 = new BitSet(new long[]{0x0000000000000008L,0x0000000800000000L,0x0000000004000000L,0x0000020080008000L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9352 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000004000000L,0x0000020080008000L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9363 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000020080008000L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9372 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000080008000L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9381 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9418 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection9450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection9454 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection9485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection9489 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState9521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState9525 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState9530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState9535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviorState9540 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_assertion_in_behaviorState9544 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions9599 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions9603 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_TRANSITION_in_behaviorTransition9636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_behaviorTransition9640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9644 = new BitSet(new long[]{0x0000000000000008L,0x0000000000008000L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition9648 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SOURCE_in_behaviorTransition9655 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9659 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_CONDITION_in_behaviorTransition9671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition9675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESTINATION_in_behaviorTransition9682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9686 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_behaviorTransition9696 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition9700 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_behaviorTransition9706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition9710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_priority9782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_priority9786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_priority9788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition9819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition9836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition9854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition9872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition9900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition9904 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_executeCondition9939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition9960 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition9964 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition9998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_internalCondition10002 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10038 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10042 = new BitSet(new long[]{0x0000000000000008L,0x0000000040000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10099 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10103 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger10155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger10173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger10177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10181 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000002L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime10222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime10238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_behaviorTime10254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_portName10286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_and_in_triggerLogicalExpression10323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10327 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_triggerLogicalExpression10354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10358 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_triggerLogicalExpression10385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10389 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_then_in_triggerLogicalExpression10416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10420 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_triggerLogicalExpression10447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10451 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_eventTrigger10502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger10521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger10525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger10527 = new BitSet(new long[]{0x0000000000000008L});
}
