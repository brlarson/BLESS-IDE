// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g 2023-04-04 02:40:35

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
		"ASSIGN", "AT_SIGN", "BEHAVIOR_GUARD", "BI", "BLESS_SUBCLAUSE", "BOUND", 
		"BOX", "CARET", "COLON", "COLON_TILDE", "COMMA", "COMMACOMMA", "COMMADOT", 
		"COMPONENT", "CONDITION", "CONDITIONAL_ASSERTION_FUNCTION", "COUNTING_TRIGGER", 
		"CVP", "DESTINATION", "DIGIT", "DIVIDE", "DOLLAR", "DOT", "DOTCOMMA", 
		"DOTDOT", "DOUBLE_COLON", "DOUBLE_QUOTE", "DO_NOT_PROVE", "DUMMY", "EMPTY_CURLY", 
		"END_ASSERTION_PROPERTY", "EQ", "EXCLAMATION", "EXP", "EXPONENT", "FLOATING", 
		"FUNCTION", "GT", "GUARD", "HEX_DIGIT", "ID", "IMP", "INMODE", "INOUT", 
		"INTEGER_LIT", "INVARIANT", "INVOKE", "INVOKE_FUNCTION", "IP_NAME", "IP_PE", 
		"IP_PRED", "LABEL", "LASS", "LBRACKET", "LCON", "LCURLY", "LITERAL_Assertion", 
		"LITERAL_Invariant", "LITERAL_Postcondition", "LITERAL_Precondition", 
		"LITERAL_Typed", "LITERAL_aadlboolean", "LITERAL_aadlinteger", "LITERAL_aadlreal", 
		"LITERAL_aadlstring", "LITERAL_abs", "LITERAL_access", "LITERAL_all", 
		"LITERAL_and", "LITERAL_any", "LITERAL_applies", "LITERAL_are", "LITERAL_array", 
		"LITERAL_assert", "LITERAL_availability", "LITERAL_base", "LITERAL_binding", 
		"LITERAL_boolean", "LITERAL_bound", "LITERAL_call", "LITERAL_calls", "LITERAL_case", 
		"LITERAL_catch", "LITERAL_classifier", "LITERAL_complete", "LITERAL_component", 
		"LITERAL_computation", "LITERAL_connection", "LITERAL_connections", "LITERAL_constant", 
		"LITERAL_count", "LITERAL_declare", "LITERAL_def", "LITERAL_delay", "LITERAL_dispatch", 
		"LITERAL_div", "LITERAL_do", "LITERAL_else", "LITERAL_enumeration", "LITERAL_exception", 
		"LITERAL_exists", "LITERAL_extends", "LITERAL_extension", "LITERAL_false", 
		"LITERAL_feature", "LITERAL_fetchadd", "LITERAL_fetchand", "LITERAL_fetchor", 
		"LITERAL_fetchxor", "LITERAL_fi", "LITERAL_final", "LITERAL_flow", "LITERAL_for", 
		"LITERAL_forall", "LITERAL_fresh", "LITERAL_ghost", "LITERAL_if", "LITERAL_iff", 
		"LITERAL_implementation", "LITERAL_implies", "LITERAL_in", "LITERAL_inherit", 
		"LITERAL_initial", "LITERAL_internal", "LITERAL_invariant", "LITERAL_inverse", 
		"LITERAL_is", "LITERAL_list", "LITERAL_lower_bound", "LITERAL_mod", "LITERAL_mode", 
		"LITERAL_modes", "LITERAL_nonvolatile", "LITERAL_not", "LITERAL_now", 
		"LITERAL_null", "LITERAL_numberof", "LITERAL_of", "LITERAL_on", "LITERAL_or", 
		"LITERAL_package", "LITERAL_parameter", "LITERAL_pause", "LITERAL_post", 
		"LITERAL_pre", "LITERAL_private", "LITERAL_product", "LITERAL_property", 
		"LITERAL_provides", "LITERAL_public", "LITERAL_quantity", "LITERAL_range", 
		"LITERAL_record", "LITERAL_reference", "LITERAL_rem", "LITERAL_renames", 
		"LITERAL_representation", "LITERAL_requires", "LITERAL_returns", "LITERAL_round", 
		"LITERAL_scalar", "LITERAL_self", "LITERAL_sequence", "LITERAL_set", "LITERAL_setmode", 
		"LITERAL_shared", "LITERAL_skip", "LITERAL_spread", "LITERAL_state", "LITERAL_states", 
		"LITERAL_step", "LITERAL_stop", "LITERAL_string", "LITERAL_subcomponents", 
		"LITERAL_sum", "LITERAL_swap", "LITERAL_that", "LITERAL_then", "LITERAL_throw", 
		"LITERAL_throws", "LITERAL_timeout", "LITERAL_to", "LITERAL_tops", "LITERAL_transition", 
		"LITERAL_transitions", "LITERAL_true", "LITERAL_truncate", "LITERAL_type", 
		"LITERAL_union", "LITERAL_units", "LITERAL_until", "LITERAL_updated", 
		"LITERAL_upper_bound", "LITERAL_variables", "LITERAL_variant", "LITERAL_when", 
		"LITERAL_which", "LITERAL_while", "LITERAL_whole", "LITERAL_with", "LITERAL_xor", 
		"LPAREN", "LT", "LTE_STRING", "LT_STRING", "MINUS", "MT_STRING", "NEQ", 
		"OBLIGATION", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETER", "PARAMETERS", 
		"PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", 
		"PREDICATE_RELATION", "PROCEDURE", "Q", "QCLREF", "QCREF", "QQ", "QUANTITY", 
		"QUESTION", "RASS", "RBRACKET", "RCON", "RCURLY", "REAL_LIT", "RECORD_TERM", 
		"ROOT_DECLARATION", "RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", 
		"START", "START_ASSERTION_PROPERTY", "STOP", "SUBPROGRAM_INVOCATION", 
		"TICK", "TILDE", "TIMES", "TOP", "TRANSITION", "TRIGGER", "TYPE", "TYPE_LIBRARY", 
		"TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", "UNIT_FORMULA", 
		"UNIT_LIBRARY", "UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", "VERT", 
		"WP", "WS"
	};
	public static final int EOF=-1;
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
	public static final int BEHAVIOR_GUARD=20;
	public static final int BI=21;
	public static final int BLESS_SUBCLAUSE=22;
	public static final int BOUND=23;
	public static final int BOX=24;
	public static final int CARET=25;
	public static final int COLON=26;
	public static final int COLON_TILDE=27;
	public static final int COMMA=28;
	public static final int COMMACOMMA=29;
	public static final int COMMADOT=30;
	public static final int COMPONENT=31;
	public static final int CONDITION=32;
	public static final int CONDITIONAL_ASSERTION_FUNCTION=33;
	public static final int COUNTING_TRIGGER=34;
	public static final int CVP=35;
	public static final int DESTINATION=36;
	public static final int DIGIT=37;
	public static final int DIVIDE=38;
	public static final int DOLLAR=39;
	public static final int DOT=40;
	public static final int DOTCOMMA=41;
	public static final int DOTDOT=42;
	public static final int DOUBLE_COLON=43;
	public static final int DOUBLE_QUOTE=44;
	public static final int DO_NOT_PROVE=45;
	public static final int DUMMY=46;
	public static final int EMPTY_CURLY=47;
	public static final int END_ASSERTION_PROPERTY=48;
	public static final int EQ=49;
	public static final int EXCLAMATION=50;
	public static final int EXP=51;
	public static final int EXPONENT=52;
	public static final int FLOATING=53;
	public static final int FUNCTION=54;
	public static final int GT=55;
	public static final int GUARD=56;
	public static final int HEX_DIGIT=57;
	public static final int ID=58;
	public static final int IMP=59;
	public static final int INMODE=60;
	public static final int INOUT=61;
	public static final int INTEGER_LIT=62;
	public static final int INVARIANT=63;
	public static final int INVOKE=64;
	public static final int INVOKE_FUNCTION=65;
	public static final int IP_NAME=66;
	public static final int IP_PE=67;
	public static final int IP_PRED=68;
	public static final int LABEL=69;
	public static final int LASS=70;
	public static final int LBRACKET=71;
	public static final int LCON=72;
	public static final int LCURLY=73;
	public static final int LITERAL_Assertion=74;
	public static final int LITERAL_Invariant=75;
	public static final int LITERAL_Postcondition=76;
	public static final int LITERAL_Precondition=77;
	public static final int LITERAL_Typed=78;
	public static final int LITERAL_aadlboolean=79;
	public static final int LITERAL_aadlinteger=80;
	public static final int LITERAL_aadlreal=81;
	public static final int LITERAL_aadlstring=82;
	public static final int LITERAL_abs=83;
	public static final int LITERAL_access=84;
	public static final int LITERAL_all=85;
	public static final int LITERAL_and=86;
	public static final int LITERAL_any=87;
	public static final int LITERAL_applies=88;
	public static final int LITERAL_are=89;
	public static final int LITERAL_array=90;
	public static final int LITERAL_assert=91;
	public static final int LITERAL_availability=92;
	public static final int LITERAL_base=93;
	public static final int LITERAL_binding=94;
	public static final int LITERAL_boolean=95;
	public static final int LITERAL_bound=96;
	public static final int LITERAL_call=97;
	public static final int LITERAL_calls=98;
	public static final int LITERAL_case=99;
	public static final int LITERAL_catch=100;
	public static final int LITERAL_classifier=101;
	public static final int LITERAL_complete=102;
	public static final int LITERAL_component=103;
	public static final int LITERAL_computation=104;
	public static final int LITERAL_connection=105;
	public static final int LITERAL_connections=106;
	public static final int LITERAL_constant=107;
	public static final int LITERAL_count=108;
	public static final int LITERAL_declare=109;
	public static final int LITERAL_def=110;
	public static final int LITERAL_delay=111;
	public static final int LITERAL_dispatch=112;
	public static final int LITERAL_div=113;
	public static final int LITERAL_do=114;
	public static final int LITERAL_else=115;
	public static final int LITERAL_enumeration=116;
	public static final int LITERAL_exception=117;
	public static final int LITERAL_exists=118;
	public static final int LITERAL_extends=119;
	public static final int LITERAL_extension=120;
	public static final int LITERAL_false=121;
	public static final int LITERAL_feature=122;
	public static final int LITERAL_fetchadd=123;
	public static final int LITERAL_fetchand=124;
	public static final int LITERAL_fetchor=125;
	public static final int LITERAL_fetchxor=126;
	public static final int LITERAL_fi=127;
	public static final int LITERAL_final=128;
	public static final int LITERAL_flow=129;
	public static final int LITERAL_for=130;
	public static final int LITERAL_forall=131;
	public static final int LITERAL_fresh=132;
	public static final int LITERAL_ghost=133;
	public static final int LITERAL_if=134;
	public static final int LITERAL_iff=135;
	public static final int LITERAL_implementation=136;
	public static final int LITERAL_implies=137;
	public static final int LITERAL_in=138;
	public static final int LITERAL_inherit=139;
	public static final int LITERAL_initial=140;
	public static final int LITERAL_internal=141;
	public static final int LITERAL_invariant=142;
	public static final int LITERAL_inverse=143;
	public static final int LITERAL_is=144;
	public static final int LITERAL_list=145;
	public static final int LITERAL_lower_bound=146;
	public static final int LITERAL_mod=147;
	public static final int LITERAL_mode=148;
	public static final int LITERAL_modes=149;
	public static final int LITERAL_nonvolatile=150;
	public static final int LITERAL_not=151;
	public static final int LITERAL_now=152;
	public static final int LITERAL_null=153;
	public static final int LITERAL_numberof=154;
	public static final int LITERAL_of=155;
	public static final int LITERAL_on=156;
	public static final int LITERAL_or=157;
	public static final int LITERAL_package=158;
	public static final int LITERAL_parameter=159;
	public static final int LITERAL_pause=160;
	public static final int LITERAL_post=161;
	public static final int LITERAL_pre=162;
	public static final int LITERAL_private=163;
	public static final int LITERAL_product=164;
	public static final int LITERAL_property=165;
	public static final int LITERAL_provides=166;
	public static final int LITERAL_public=167;
	public static final int LITERAL_quantity=168;
	public static final int LITERAL_range=169;
	public static final int LITERAL_record=170;
	public static final int LITERAL_reference=171;
	public static final int LITERAL_rem=172;
	public static final int LITERAL_renames=173;
	public static final int LITERAL_representation=174;
	public static final int LITERAL_requires=175;
	public static final int LITERAL_returns=176;
	public static final int LITERAL_round=177;
	public static final int LITERAL_scalar=178;
	public static final int LITERAL_self=179;
	public static final int LITERAL_sequence=180;
	public static final int LITERAL_set=181;
	public static final int LITERAL_setmode=182;
	public static final int LITERAL_shared=183;
	public static final int LITERAL_skip=184;
	public static final int LITERAL_spread=185;
	public static final int LITERAL_state=186;
	public static final int LITERAL_states=187;
	public static final int LITERAL_step=188;
	public static final int LITERAL_stop=189;
	public static final int LITERAL_string=190;
	public static final int LITERAL_subcomponents=191;
	public static final int LITERAL_sum=192;
	public static final int LITERAL_swap=193;
	public static final int LITERAL_that=194;
	public static final int LITERAL_then=195;
	public static final int LITERAL_throw=196;
	public static final int LITERAL_throws=197;
	public static final int LITERAL_timeout=198;
	public static final int LITERAL_to=199;
	public static final int LITERAL_tops=200;
	public static final int LITERAL_transition=201;
	public static final int LITERAL_transitions=202;
	public static final int LITERAL_true=203;
	public static final int LITERAL_truncate=204;
	public static final int LITERAL_type=205;
	public static final int LITERAL_union=206;
	public static final int LITERAL_units=207;
	public static final int LITERAL_until=208;
	public static final int LITERAL_updated=209;
	public static final int LITERAL_upper_bound=210;
	public static final int LITERAL_variables=211;
	public static final int LITERAL_variant=212;
	public static final int LITERAL_when=213;
	public static final int LITERAL_which=214;
	public static final int LITERAL_while=215;
	public static final int LITERAL_whole=216;
	public static final int LITERAL_with=217;
	public static final int LITERAL_xor=218;
	public static final int LPAREN=219;
	public static final int LT=220;
	public static final int LTE_STRING=221;
	public static final int LT_STRING=222;
	public static final int MINUS=223;
	public static final int MT_STRING=224;
	public static final int NEQ=225;
	public static final int OBLIGATION=226;
	public static final int OCTOTHORPE=227;
	public static final int OLD_NEQ=228;
	public static final int ON=229;
	public static final int P=230;
	public static final int PARAMETER=231;
	public static final int PARAMETERS=232;
	public static final int PLUS=233;
	public static final int PLUS_ARROW=234;
	public static final int PLUS_EQUALS=235;
	public static final int PORT=236;
	public static final int PORT_INPUT=237;
	public static final int PORT_OUTPUT=238;
	public static final int PREDICATE_RELATION=239;
	public static final int PROCEDURE=240;
	public static final int Q=241;
	public static final int QCLREF=242;
	public static final int QCREF=243;
	public static final int QQ=244;
	public static final int QUANTITY=245;
	public static final int QUESTION=246;
	public static final int RASS=247;
	public static final int RBRACKET=248;
	public static final int RCON=249;
	public static final int RCURLY=250;
	public static final int REAL_LIT=251;
	public static final int RECORD_TERM=252;
	public static final int ROOT_DECLARATION=253;
	public static final int RPAREN=254;
	public static final int S=255;
	public static final int SEMICOLON=256;
	public static final int SLCOMMENT=257;
	public static final int SOURCE=258;
	public static final int START=259;
	public static final int START_ASSERTION_PROPERTY=260;
	public static final int STOP=261;
	public static final int SUBPROGRAM_INVOCATION=262;
	public static final int TICK=263;
	public static final int TILDE=264;
	public static final int TIMES=265;
	public static final int TOP=266;
	public static final int TRANSITION=267;
	public static final int TRIGGER=268;
	public static final int TYPE=269;
	public static final int TYPE_LIBRARY=270;
	public static final int TYPE_OPERATOR=271;
	public static final int TYPE_OPERATOR_INVOCATION=272;
	public static final int UNARY_MINUS=273;
	public static final int UNIT_FORMULA=274;
	public static final int UNIT_LIBRARY=275;
	public static final int UNIT_NAME=276;
	public static final int VALUE=277;
	public static final int VARIABLE_DECLARATION=278;
	public static final int VERT=279;
	public static final int WP=280;
	public static final int WS=281;

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


	public static class number_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "number"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:217:1: number : ( INTEGER_LIT | REAL_LIT );
	public final UnparseBLESS3.number_return number() throws RecognitionException {
		UnparseBLESS3.number_return retval = new UnparseBLESS3.number_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:218:3: ( INTEGER_LIT | REAL_LIT )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:
			{
			if ( input.LA(1)==INTEGER_LIT||input.LA(1)==REAL_LIT ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "number"


	public static class unitName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:231:1: unitName : ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname);
	public final UnparseBLESS3.unitName_return unitName() throws RecognitionException {
		UnparseBLESS3.unitName_return retval = new UnparseBLESS3.unitName_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST longname=null;
		List<Object> list_longname=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:232:3: ( ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:233:3: ^( UNIT_NAME id= ID (longname+= ID )* )
			{
			match(input,UNIT_NAME,FOLLOW_UNIT_NAME_in_unitName115); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_unitName119); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:233:30: (longname+= ID )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:233:30: longname+= ID
					{
					longname=(BAST)match(input,ID,FOLLOW_ID_in_unitName123); 
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
			// 234:5: -> unit_name(id=$id.textlongname=$longname)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom));
	public final UnparseBLESS3.unitFormula_return unitFormula() throws RecognitionException {
		UnparseBLESS3.unitFormula_return retval = new UnparseBLESS3.unitFormula_return();
		retval.start = input.LT(1);

		BAST top=null;
		BAST bottom=null;
		List<Object> list_top=null;
		List<Object> list_bottom=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:238:3: ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom))
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:239:3: ^( UNIT_FORMULA (top+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula163); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:239:22: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:239:22: top+= ID
							{
							top=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula167); 
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
					// 240:5: -> unit_formula(top=$top)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:242:3: ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula193); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:242:22: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:242:22: top+= ID
							{
							top=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula197); 
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

					match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula200); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:242:41: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:242:41: bottom+= ID
							{
							bottom=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula204); 
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
					// 243:5: -> unit_formula(top=$topbottom=$bottom)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top).put("bottom", list_bottom));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:245:3: ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula235); 
					match(input, Token.DOWN, null); 
					match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula237); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:245:32: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:245:32: bottom+= ID
							{
							bottom=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula241); 
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
					// 246:5: -> unit_formula(bottom=$bottom)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:249:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final UnparseBLESS3.unitDeclaration_return unitDeclaration() throws RecognitionException {
		UnparseBLESS3.unitDeclaration_return retval = new UnparseBLESS3.unitDeclaration_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:249:16: ( rootDeclaration | unitExtension )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:3: rootDeclaration
					{
					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration270);
					rootDeclaration();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:250:21: unitExtension
					{
					pushFollow(FOLLOW_unitExtension_in_unitDeclaration274);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:1: rootDeclaration : ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:254:3: ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:255:3: ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* )
					{
					match(input,ROOT_DECLARATION,FOLLOW_ROOT_DECLARATION_in_rootDeclaration291); 
					match(input, Token.DOWN, null); 
					base=(BAST)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration295); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration299); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:255:62: (kindWords+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:255:62: kindWords+= ID
							{
							kindWords=(BAST)match(input,ID,FOLLOW_ID_in_rootDeclaration303); 
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

					pushFollow(FOLLOW_unitName_in_rootDeclaration310);
					unit=unitName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:255:91: (factors+= unitFactor )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:255:91: factors+= unitFactor
							{
							pushFollow(FOLLOW_unitFactor_in_rootDeclaration314);
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
					// 256:5: -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("base", (base!=null?base.getText():null)).put("kindWords", list_kindWords).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:3: ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* )
					{
					match(input,ROOT_DECLARATION,FOLLOW_ROOT_DECLARATION_in_rootDeclaration355); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration359);
					formula=unitFormula();
					state._fsp--;

					match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration363); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:64: (kindWords+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:64: kindWords+= ID
							{
							kindWords=(BAST)match(input,ID,FOLLOW_ID_in_rootDeclaration367); 
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

					pushFollow(FOLLOW_unitName_in_rootDeclaration374);
					unit=unitName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:93: (factors+= unitFactor )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==COMMA) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:93: factors+= unitFactor
							{
							pushFollow(FOLLOW_unitFactor_in_rootDeclaration378);
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
					// 259:5: -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:262:1: unitExtension : ^( LITERAL_extension root= ID (factors+= unitFactor )+ ) -> unit_extension(root=$root.textfactors=$factors);
	public final UnparseBLESS3.unitExtension_return unitExtension() throws RecognitionException {
		UnparseBLESS3.unitExtension_return retval = new UnparseBLESS3.unitExtension_return();
		retval.start = input.LT(1);

		BAST root=null;
		List<Object> list_factors=null;
		RuleReturnScope factors = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:263:3: ( ^( LITERAL_extension root= ID (factors+= unitFactor )+ ) -> unit_extension(root=$root.textfactors=$factors))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:264:3: ^( LITERAL_extension root= ID (factors+= unitFactor )+ )
			{
			match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension426); 
			match(input, Token.DOWN, null); 
			root=(BAST)match(input,ID,FOLLOW_ID_in_unitExtension430); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:264:39: (factors+= unitFactor )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:264:39: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension434);
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
			// 265:5: -> unit_extension(root=$root.textfactors=$factors)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:269:1: unitFactor : ( ^( COMMA unit= unitName t= TIMES factor= number ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= number ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text));
	public final UnparseBLESS3.unitFactor_return unitFactor() throws RecognitionException {
		UnparseBLESS3.unitFactor_return retval = new UnparseBLESS3.unitFactor_return();
		retval.start = input.LT(1);

		BAST t=null;
		BAST d=null;
		TreeRuleReturnScope unit =null;
		TreeRuleReturnScope factor =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:269:11: ( ^( COMMA unit= unitName t= TIMES factor= number ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= number ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text))
			int alt14=2;
			alt14 = dfa14.predict(input);
			switch (alt14) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:270:3: ^( COMMA unit= unitName t= TIMES factor= number )
					{
					match(input,COMMA,FOLLOW_COMMA_in_unitFactor471); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitName_in_unitFactor475);
					unit=unitName();
					state._fsp--;

					t=(BAST)match(input,TIMES,FOLLOW_TIMES_in_unitFactor479); 
					pushFollow(FOLLOW_number_in_unitFactor483);
					factor=number();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 271:5: -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)
					{
						retval.st = templateLib.getInstanceOf("unit_factor",new STAttrMap().put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("op", (t!=null?t.getText():null)).put("factor", (factor!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(factor.start),input.getTreeAdaptor().getTokenStopIndex(factor.start))):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:273:3: ^( COMMA unit= unitName d= DIVIDE factor= number )
					{
					match(input,COMMA,FOLLOW_COMMA_in_unitFactor518); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitName_in_unitFactor522);
					unit=unitName();
					state._fsp--;

					d=(BAST)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFactor526); 
					pushFollow(FOLLOW_number_in_unitFactor530);
					factor=number();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 274:5: -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text)
					{
						retval.st = templateLib.getInstanceOf("unit_factor",new STAttrMap().put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("op", (d!=null?d.getText():null)).put("factor", (factor!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(factor.start),input.getTreeAdaptor().getTokenStopIndex(factor.start))):null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:280:1: typeLibrary : (decs+= typeDeclaration )+ -> type_library(decs=$decs);
	public final UnparseBLESS3.typeLibrary_return typeLibrary() throws RecognitionException {
		UnparseBLESS3.typeLibrary_return retval = new UnparseBLESS3.typeLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:280:12: ( (decs+= typeDeclaration )+ -> type_library(decs=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:281:3: (decs+= typeDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:281:7: (decs+= typeDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:281:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary577);
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
			// 282:5: -> type_library(decs=$decs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:285:1: typeDeclaration : ^( LITERAL_type id= ID ty= type ) -> type_declaration(id=$id.textty=$ty.st);
	public final UnparseBLESS3.typeDeclaration_return typeDeclaration() throws RecognitionException {
		UnparseBLESS3.typeDeclaration_return retval = new UnparseBLESS3.typeDeclaration_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:285:16: ( ^( LITERAL_type id= ID ty= type ) -> type_declaration(id=$id.textty=$ty.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:286:3: ^( LITERAL_type id= ID ty= type )
			{
			match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration605); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_typeDeclaration609); 
			pushFollow(FOLLOW_type_in_typeDeclaration613);
			ty=type();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 287:5: -> type_declaration(id=$id.textty=$ty.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:292:1: type : (et= enumerationType -> {$et.st}|nt= quantityType -> {$nt.st}|at= arrayType -> {$at.st}|rt= recordType -> {$rt.st}|bo= LITERAL_boolean -> boolean(|st= LITERAL_string -> string(|nu= LITERAL_null -> {%{$nu.text}});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:293:2: (et= enumerationType -> {$et.st}|nt= quantityType -> {$nt.st}|at= arrayType -> {$at.st}|rt= recordType -> {$rt.st}|bo= LITERAL_boolean -> boolean(|st= LITERAL_string -> string(|nu= LITERAL_null -> {%{$nu.text}})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:294:2: et= enumerationType
					{
					pushFollow(FOLLOW_enumerationType_in_type652);
					et=enumerationType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 295:3: -> {$et.st}
					{
						retval.st = (et!=null?((StringTemplate)et.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:297:2: nt= quantityType
					{
					pushFollow(FOLLOW_quantityType_in_type665);
					nt=quantityType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 298:3: -> {$nt.st}
					{
						retval.st = (nt!=null?((StringTemplate)nt.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:300:2: at= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_type678);
					at=arrayType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 301:3: -> {$at.st}
					{
						retval.st = (at!=null?((StringTemplate)at.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:303:2: rt= recordType
					{
					pushFollow(FOLLOW_recordType_in_type691);
					rt=recordType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 304:3: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:306:2: bo= LITERAL_boolean
					{
					bo=(BAST)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type704); 
					// TEMPLATE REWRITE
					// 306:21: -> boolean(
					{
						retval.st = templateLib.getInstanceOf("boolean");
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:308:2: st= LITERAL_string
					{
					st=(BAST)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type720); 
					// TEMPLATE REWRITE
					// 308:20: -> string(
					{
						retval.st = templateLib.getInstanceOf("string");
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:310:2: nu= LITERAL_null
					{
					nu=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type736); 
					// TEMPLATE REWRITE
					// 310:18: -> {%{$nu.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:315:1: typeOrReference : (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}});
	public final UnparseBLESS3.typeOrReference_return typeOrReference() throws RecognitionException {
		UnparseBLESS3.typeOrReference_return retval = new UnparseBLESS3.typeOrReference_return();
		retval.start = input.LT(1);

		BAST ref=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:315:16: (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}})
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==LITERAL_array||LA17_0==LITERAL_boolean||LA17_0==LITERAL_enumeration||LA17_0==LITERAL_null||LA17_0==LITERAL_quantity||LA17_0==LITERAL_record||LA17_0==LITERAL_string||LA17_0==LITERAL_variant) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:316:3: ty= type
					{
					pushFollow(FOLLOW_type_in_typeOrReference763);
					ty=type();
					state._fsp--;

					// TEMPLATE REWRITE
					// 317:5: -> {$ty.st}
					{
						retval.st = (ty!=null?((StringTemplate)ty.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:319:3: ref= ID
					{
					ref=(BAST)match(input,ID,FOLLOW_ID_in_typeOrReference783); 
					// TEMPLATE REWRITE
					// 320:5: -> {%{$ref.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:323:1: enumerationType : ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id);
	public final UnparseBLESS3.enumerationType_return enumerationType() throws RecognitionException {
		UnparseBLESS3.enumerationType_return retval = new UnparseBLESS3.enumerationType_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_id=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:324:3: ( ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:325:3: ^( LITERAL_enumeration (id+= ID )+ )
			{
			match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType810); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:325:27: (id+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:325:27: id+= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationType814); 
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
			// 326:5: -> enumeration_type(id=$id)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:329:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:330:3: ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text))
			int alt19=18;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:331:3: ^( LITERAL_quantity unit= ID )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType849); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType853); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 332:5: -> quantity_type(unit=$unit.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:334:3: ^( LITERAL_quantity scalar= LITERAL_scalar )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType878); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType882); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 335:5: -> quantity_type(scalar=$scalar.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:337:3: ^( LITERAL_quantity whole= LITERAL_whole )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType907); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType911); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 338:5: -> quantity_type(whole=$whole.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:340:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType936); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType940); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType943); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType947);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType951);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 341:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:343:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType987); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType991); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType994); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType998);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1002);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 344:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:346:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1038); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1042); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1045); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1049);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1053);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 347:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:349:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1089); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1093); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1096); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1100);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1104);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1108); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1112);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 350:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:352:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1153); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1157); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1160); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1164);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1168);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1172); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1176);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 353:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:355:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1217); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1221); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1224); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1228);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1232);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1236); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1240);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 356:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:358:3: ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1281); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1285); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1288); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1292); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 359:5: -> quantity_type(unit=$unit.textrepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 11 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:361:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1324); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1328); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1331); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1335); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 362:5: -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 12 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:364:3: ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1367); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1371); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1374); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1378); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 365:5: -> quantity_type(whole=$whole.textrepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 13 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:367:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1410); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1414); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1417); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1421);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1425);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1429); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1433); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 368:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 14 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:370:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1475); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1479); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1482); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1486);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1490);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1494); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1498); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 371:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 15 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:373:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1540); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1544); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1547); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1551);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1555);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1559); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1563); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 374:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 16 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:376:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1605); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1609); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1612); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1616);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1620);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1624); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1628);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1632); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1636); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 377:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 17 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:379:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1683); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1687); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1690); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1694);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1698);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1702); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1706);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1710); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1714); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 380:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?representation.getText():null)));
					}



					}
					break;
				case 18 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:382:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1761); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1765); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1768); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1772);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1776);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1780); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1784);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1788); 
					match(input, Token.DOWN, null); 
					representation=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType1792); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 383:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:387:1: arrayType : ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st);
	public final UnparseBLESS3.arrayType_return arrayType() throws RecognitionException {
		UnparseBLESS3.arrayType_return retval = new UnparseBLESS3.arrayType_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope arl =null;
		TreeRuleReturnScope t =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:388:2: ( ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:389:2: ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference )
			{
			match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType1848); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_arrayRangeList_in_arrayType1852);
			arl=arrayRangeList();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType1854); 
			pushFollow(FOLLOW_typeOrReference_in_arrayType1858);
			t=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 390:3: -> array_type(arl=$arl.stt=$t.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:1: arrayRangeList : (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges));
	public final UnparseBLESS3.arrayRangeList_return arrayRangeList() throws RecognitionException {
		UnparseBLESS3.arrayRangeList_return retval = new UnparseBLESS3.arrayRangeList_return();
		retval.start = input.LT(1);

		List<Object> list_ranges=null;
		TreeRuleReturnScope nr =null;
		RuleReturnScope ranges = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:395:2: (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges))
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==DOTDOT||LA21_0==INTEGER_LIT||LA21_0==OCTOTHORPE||LA21_0==QCLREF||LA21_0==REAL_LIT) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:396:2: nr= arrayRange
					{
					pushFollow(FOLLOW_arrayRange_in_arrayRangeList1891);
					nr=arrayRange();
					state._fsp--;

					// TEMPLATE REWRITE
					// 397:4: -> {$nr.st}
					{
						retval.st = (nr!=null?((StringTemplate)nr.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:399:2: ^( COMMA (ranges+= arrayRange )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList1905); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:399:16: (ranges+= arrayRange )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==DOTDOT||LA20_0==INTEGER_LIT||LA20_0==OCTOTHORPE||LA20_0==QCLREF||LA20_0==REAL_LIT) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:399:16: ranges+= arrayRange
							{
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList1909);
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
					// 400:4: -> array_range_list(r=$ranges)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:403:1: arrayRange : (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st));
	public final UnparseBLESS3.arrayRange_return arrayRange() throws RecognitionException {
		UnparseBLESS3.arrayRange_return retval = new UnparseBLESS3.arrayRange_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:404:3: (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st))
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==INTEGER_LIT||LA22_0==OCTOTHORPE||LA22_0==QCLREF||LA22_0==REAL_LIT) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:405:3: n= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_arrayRange1940);
					n=aNumber();
					state._fsp--;

					// TEMPLATE REWRITE
					// 406:5: -> {$n.st}
					{
						retval.st = (n!=null?((StringTemplate)n.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:408:3: ^( DOTDOT lb= aNumber ub= aNumber )
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange1958); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_arrayRange1962);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_arrayRange1966);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 409:5: -> array_range(l=$lb.str=$ub.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:412:1: recordType : ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf));
	public final UnparseBLESS3.recordType_return recordType() throws RecognitionException {
		UnparseBLESS3.recordType_return retval = new UnparseBLESS3.recordType_return();
		retval.start = input.LT(1);

		BAST r=null;
		List<Object> list_rf=null;
		RuleReturnScope rf = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:413:2: ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf))
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LITERAL_record) ) {
				alt25=1;
			}
			else if ( (LA25_0==LITERAL_variant) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:414:2: ^(r= LITERAL_record (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_record,FOLLOW_LITERAL_record_in_recordType2003); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:414:23: (rf+= recordField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:414:23: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2007);
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
					// 415:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:417:2: ^(r= LITERAL_variant (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_variant,FOLLOW_LITERAL_variant_in_recordType2034); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:417:24: (rf+= recordField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:417:24: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2038);
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
					// 418:3: -> record_type(rvu=$r.textrf=$rf)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:425:1: recordField : ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st);
	public final UnparseBLESS3.recordField_return recordField() throws RecognitionException {
		UnparseBLESS3.recordField_return retval = new UnparseBLESS3.recordField_return();
		retval.start = input.LT(1);

		BAST df=null;
		TreeRuleReturnScope ptd =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:426:2: ( ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:427:2: ^( COLON df= ID ptd= typeOrReference )
			{
			match(input,COLON,FOLLOW_COLON_in_recordField2075); 
			match(input, Token.DOWN, null); 
			df=(BAST)match(input,ID,FOLLOW_ID_in_recordField2079); 
			pushFollow(FOLLOW_typeOrReference_in_recordField2083);
			ptd=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 428:3: -> record_field(df=$df.textptd=$ptd.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:436:1: assertionLibrary : ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass));
	public final UnparseBLESS3.assertionLibrary_return assertionLibrary() throws RecognitionException {
		UnparseBLESS3.assertionLibrary_return retval = new UnparseBLESS3.assertionLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_ass=null;
		TreeRuleReturnScope ghosts =null;
		RuleReturnScope ass = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:437:2: ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass))
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==ASSERTION_ANNEX) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOWN) ) {
					int LA28_2 = input.LA(3);
					if ( (LA28_2==LITERAL_ghost) ) {
						alt28=1;
					}
					else if ( (LA28_2==ASSERTION||(LA28_2 >= ASSERTION_ENUMERATION && LA28_2 <= ASSERTION_FUNCTION)) ) {
						alt28=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 2, input);
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
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:3: ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2120); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary2124);
					ghosts=ghostVariables();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:46: (ass+= namedAssertion )+
					int cnt26=0;
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==ASSERTION||(LA26_0 >= ASSERTION_ENUMERATION && LA26_0 <= ASSERTION_FUNCTION)) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:46: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2128);
							ass=namedAssertion();
							state._fsp--;

							if (list_ass==null) list_ass=new ArrayList<Object>();
							list_ass.add(ass.getTemplate());
							}
							break;

						default :
							if ( cnt26 >= 1 ) break loop26;
							EarlyExitException eee = new EarlyExitException(26, input);
							throw eee;
						}
						cnt26++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 439:4: -> annex_library_assertion(ghosts=$ghosts.stass=$ass)
					{
						retval.st = templateLib.getInstanceOf("annex_library_assertion",new STAttrMap().put("ghosts", (ghosts!=null?((StringTemplate)ghosts.getTemplate()):null)).put("ass", list_ass));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:3: ^( ASSERTION_ANNEX (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2155); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:24: (ass+= namedAssertion )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:24: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2159);
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
					// 442:4: -> annex_library_assertion(ass=$ass)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:446:1: ghostVariables : ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv);
	public final UnparseBLESS3.ghostVariables_return ghostVariables() throws RecognitionException {
		UnparseBLESS3.ghostVariables_return retval = new UnparseBLESS3.ghostVariables_return();
		retval.start = input.LT(1);

		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:447:3: ( ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:448:3: ^( LITERAL_ghost (gv+= ghostVariable )+ )
			{
			match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables2195); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:448:22: (gv+= ghostVariable )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==LITERAL_def) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:448:22: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables2199);
					gv=ghostVariable();
					state._fsp--;

					if (list_gv==null) list_gv=new ArrayList<Object>();
					list_gv.add(gv.getTemplate());
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 449:5: -> ghost_variables(gv=$gv)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:452:1: ghostVariable : ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.ghostVariable_return ghostVariable() throws RecognitionException {
		UnparseBLESS3.ghostVariable_return retval = new UnparseBLESS3.ghostVariable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:453:3: ( ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:454:3: ^( LITERAL_def id= ID tod= typeOrReference )
			{
			match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable2232); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_ghostVariable2237); 
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable2241);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 455:5: -> ghost_variable(id=$id.texttod=$tod.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:458:1: namedAssertion : ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:459:3: ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st))
			int alt30=5;
			switch ( input.LA(1) ) {
			case ASSERTION:
				{
				int LA30_1 = input.LA(2);
				if ( (LA30_1==DOWN) ) {
					int LA30_4 = input.LA(3);
					if ( (LA30_4==LABEL) ) {
						int LA30_6 = input.LA(4);
						if ( (LA30_6==DOWN) ) {
							int LA30_8 = input.LA(5);
							if ( (LA30_8==ID) ) {
								int LA30_10 = input.LA(6);
								if ( (LA30_10==UP) ) {
									int LA30_12 = input.LA(7);
									if ( (LA30_12==PARAMETERS) ) {
										alt30=2;
									}
									else if ( (LA30_12==LITERAL_all||LA30_12==LITERAL_exists||LA30_12==LITERAL_iff||LA30_12==LITERAL_implies||LA30_12==LITERAL_numberof||LA30_12==LITERAL_product||LA30_12==LITERAL_sum) ) {
										alt30=1;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 30, 12, input);
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
											new NoViableAltException("", 30, 10, input);
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
										new NoViableAltException("", 30, 8, input);
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
									new NoViableAltException("", 30, 6, input);
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
								new NoViableAltException("", 30, 4, input);
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
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_FUNCTION:
				{
				int LA30_2 = input.LA(2);
				if ( (LA30_2==DOWN) ) {
					int LA30_5 = input.LA(3);
					if ( (LA30_5==LABEL) ) {
						int LA30_7 = input.LA(4);
						if ( (LA30_7==DOWN) ) {
							int LA30_9 = input.LA(5);
							if ( (LA30_9==ID) ) {
								int LA30_11 = input.LA(6);
								if ( (LA30_11==UP) ) {
									int LA30_13 = input.LA(7);
									if ( (LA30_13==LITERAL_returns) ) {
										alt30=3;
									}
									else if ( (LA30_13==PARAMETERS) ) {
										alt30=4;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 30, 13, input);
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
											new NoViableAltException("", 30, 11, input);
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
										new NoViableAltException("", 30, 9, input);
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
									new NoViableAltException("", 30, 7, input);
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
								new NoViableAltException("", 30, 5, input);
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
							new NoViableAltException("", 30, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_ENUMERATION:
				{
				alt30=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:460:3: ^( ASSERTION ^( LABEL id= ID ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2278); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2282); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2286); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2292);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 461:5: -> named_assertion(id=$id.textpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:463:3: ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2322); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2326); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2330); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2336); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2340);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2346);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 464:5: -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:466:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2381); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2385); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2389); 
					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2395); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2399);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2405);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 467:5: -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:469:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2440); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2444); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2448); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2454); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2458);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2464); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2468);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2474);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 470:5: -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:472:3: ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration )
					{
					match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2514); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2518); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2522); 
					match(input, Token.UP, null); 

					match(input,TILDE,FOLLOW_TILDE_in_namedAssertion2528); 
					match(input, Token.DOWN, null); 
					assertionvariable=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2532); 
					enumerationTy=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2536); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion2542);
					enumeration=assertionEnumeration();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 473:5: -> named_assertion_enum(id=$id.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:476:1: variableList : (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter));
	public final UnparseBLESS3.variableList_return variableList() throws RecognitionException {
		UnparseBLESS3.variableList_return retval = new UnparseBLESS3.variableList_return();
		retval.start = input.LT(1);

		List<Object> list_parameter=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope parameter = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:477:3: (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter))
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==TILDE) ) {
				alt32=1;
			}
			else if ( (LA32_0==COMMA) ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:478:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_variableList2586);
					v=variable();
					state._fsp--;

					// TEMPLATE REWRITE
					// 479:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:481:3: ^( COMMA (parameter+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_variableList2604); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:481:21: (parameter+= variable )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==TILDE) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:481:21: parameter+= variable
							{
							pushFollow(FOLLOW_variable_in_variableList2608);
							parameter=variable();
							state._fsp--;

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTemplate());
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 482:5: -> variable_list(parameter=$parameter)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:485:1: variable : ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.variable_return variable() throws RecognitionException {
		UnparseBLESS3.variable_return retval = new UnparseBLESS3.variable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:486:3: ( ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:487:3: ^( TILDE id= ID tod= typeOrReference )
			{
			match(input,TILDE,FOLLOW_TILDE_in_variable2642); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_variable2646); 
			pushFollow(FOLLOW_typeOrReference_in_variable2650);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 488:5: -> variable(id=$id.texttod=$tod.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:491:1: assertionFunctionValue : (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st});
	public final UnparseBLESS3.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		UnparseBLESS3.assertionFunctionValue_return retval = new UnparseBLESS3.assertionFunctionValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope caf =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:492:3: (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st})
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==CONDITIONAL_ASSERTION_FUNCTION) ) {
				alt33=1;
			}
			else if ( (LA33_0==LITERAL_all||LA33_0==LITERAL_exists||LA33_0==LITERAL_iff||LA33_0==LITERAL_implies||LA33_0==LITERAL_numberof||LA33_0==LITERAL_product||LA33_0==LITERAL_sum) ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:493:3: caf= conditionalAssertionFunction
					{
					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2687);
					caf=conditionalAssertionFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 494:5: -> {$caf.st}
					{
						retval.st = (caf!=null?((StringTemplate)caf.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:495:4: exp= expression
					{
					pushFollow(FOLLOW_expression_in_assertionFunctionValue2703);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 496:5: -> {$exp.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:499:1: conditionalAssertionFunction : ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp);
	public final UnparseBLESS3.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		UnparseBLESS3.conditionalAssertionFunction_return retval = new UnparseBLESS3.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:500:3: ( ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:501:3: ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ )
			{
			match(input,CONDITIONAL_ASSERTION_FUNCTION,FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2730); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:501:40: (cvp+= conditionValuePair )+
			int cnt34=0;
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==CVP) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:501:40: cvp+= conditionValuePair
					{
					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction2734);
					cvp=conditionValuePair();
					state._fsp--;

					if (list_cvp==null) list_cvp=new ArrayList<Object>();
					list_cvp.add(cvp.getTemplate());
					}
					break;

				default :
					if ( cnt34 >= 1 ) break loop34;
					EarlyExitException eee = new EarlyExitException(34, input);
					throw eee;
				}
				cnt34++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 502:5: -> conditional_assertion_function(cvp=$cvp)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:505:1: conditionValuePair : ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st);
	public final UnparseBLESS3.conditionValuePair_return conditionValuePair() throws RecognitionException {
		UnparseBLESS3.conditionValuePair_return retval = new UnparseBLESS3.conditionValuePair_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:506:3: ( ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:507:3: ^( CVP pred= predicate exp= expression )
			{
			match(input,CVP,FOLLOW_CVP_in_conditionValuePair2768); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_conditionValuePair2772);
			pred=predicate();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionValuePair2776);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 508:5: -> condition_value_pair(pp=$pred.stpe=$exp.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:511:1: assertionEnumeration : ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW ep= enumerationPair ) -> assertion_enumeration_pairs(ep=$ep.st)| ^( PLUS_ARROW ^( COMMA (pair+= enumerationPair )+ ) ) -> assertion_enumeration_pairs(ep=$pair));
	public final UnparseBLESS3.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		UnparseBLESS3.assertionEnumeration_return retval = new UnparseBLESS3.assertionEnumeration_return();
		retval.start = input.LT(1);

		List<Object> list_pair=null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope ep =null;
		RuleReturnScope pair = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:512:3: ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW ep= enumerationPair ) -> assertion_enumeration_pairs(ep=$ep.st)| ^( PLUS_ARROW ^( COMMA (pair+= enumerationPair )+ ) ) -> assertion_enumeration_pairs(ep=$pair))
			int alt36=3;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==PLUS_ARROW) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case COMMA:
						{
						alt36=3;
						}
						break;
					case INVOKE:
						{
						alt36=1;
						}
						break;
					case IMP:
						{
						alt36=2;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 36, 2, input);
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
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:513:3: ^( PLUS_ARROW inv= invocation )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2815); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_invocation_in_assertionEnumeration2819);
					inv=invocation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 514:5: -> assertion_enumeration_predicate_invocation(pi=$inv.st)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_predicate_invocation",new STAttrMap().put("pi", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:516:3: ^( PLUS_ARROW ep= enumerationPair )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2844); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration2848);
					ep=enumerationPair();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 517:5: -> assertion_enumeration_pairs(ep=$ep.st)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_pairs",new STAttrMap().put("ep", (ep!=null?((StringTemplate)ep.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:519:3: ^( PLUS_ARROW ^( COMMA (pair+= enumerationPair )+ ) )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration2874); 
					match(input, Token.DOWN, null); 
					match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration2878); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:519:30: (pair+= enumerationPair )+
					int cnt35=0;
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==IMP) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:519:30: pair+= enumerationPair
							{
							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration2882);
							pair=enumerationPair();
							state._fsp--;

							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTemplate());
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

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 520:5: -> assertion_enumeration_pairs(ep=$pair)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:523:1: enumerationPair : ^( IMP id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st);
	public final UnparseBLESS3.enumerationPair_return enumerationPair() throws RecognitionException {
		UnparseBLESS3.enumerationPair_return retval = new UnparseBLESS3.enumerationPair_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:524:3: ( ^( IMP id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:525:3: ^( IMP id= ID pred= predicate )
			{
			match(input,IMP,FOLLOW_IMP_in_enumerationPair2919); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationPair2923); 
			pushFollow(FOLLOW_predicate_in_enumerationPair2927);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 526:5: -> enumeration_pair(i=$id.textpe=$pred.st)
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


	public static class enumerationValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "enumerationValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:529:1: enumerationValue : ^( TICK enumeration_type= ID enumeration_value= ID ) -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text);
	public final UnparseBLESS3.enumerationValue_return enumerationValue() throws RecognitionException {
		UnparseBLESS3.enumerationValue_return retval = new UnparseBLESS3.enumerationValue_return();
		retval.start = input.LT(1);

		BAST enumeration_type=null;
		BAST enumeration_value=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:530:3: ( ^( TICK enumeration_type= ID enumeration_value= ID ) -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:531:3: ^( TICK enumeration_type= ID enumeration_value= ID )
			{
			match(input,TICK,FOLLOW_TICK_in_enumerationValue2966); 
			match(input, Token.DOWN, null); 
			enumeration_type=(BAST)match(input,ID,FOLLOW_ID_in_enumerationValue2970); 
			enumeration_value=(BAST)match(input,ID,FOLLOW_ID_in_enumerationValue2974); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 532:5: -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text)
			{
				retval.st = templateLib.getInstanceOf("enumeration_value",new STAttrMap().put("t", (enumeration_type!=null?enumeration_type.getText():null)).put("v", (enumeration_value!=null?enumeration_value.getText():null)));
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
	// $ANTLR end "enumerationValue"


	public static class invocation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "invocation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:535:1: invocation : ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st));
	public final UnparseBLESS3.invocation_return invocation() throws RecognitionException {
		UnparseBLESS3.invocation_return retval = new UnparseBLESS3.invocation_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_params=null;
		TreeRuleReturnScope exp =null;
		RuleReturnScope params = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:536:3: ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st))
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==INVOKE) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==DOWN) ) {
					int LA38_2 = input.LA(3);
					if ( (LA38_2==ID) ) {
						switch ( input.LA(4) ) {
						case UP:
							{
							alt38=1;
							}
							break;
						case COLON:
							{
							alt38=2;
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
							alt38=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 38, 3, input);
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
								new NoViableAltException("", 38, 2, input);
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
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:537:3: ^( INVOKE id= ID )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3011); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3015); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 538:5: -> invocation(i=$id.text)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:540:3: ^( INVOKE id= ID (params+= actualParameter )+ )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3040); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3044); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:540:25: (params+= actualParameter )+
					int cnt37=0;
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==COLON) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:540:25: params+= actualParameter
							{
							pushFollow(FOLLOW_actualParameter_in_invocation3048);
							params=actualParameter();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt37 >= 1 ) break loop37;
							EarlyExitException eee = new EarlyExitException(37, input);
							throw eee;
						}
						cnt37++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 541:5: -> invocation(i=$id.textp=$params)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)).put("p", list_params));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:543:3: ^( INVOKE id= ID exp= expression )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3079); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3083); 
					pushFollow(FOLLOW_expression_in_invocation3087);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 544:5: -> invocation(i=$id.textp=$exp.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:547:1: actualParameter : ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st);
	public final UnparseBLESS3.actualParameter_return actualParameter() throws RecognitionException {
		UnparseBLESS3.actualParameter_return retval = new UnparseBLESS3.actualParameter_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:548:3: ( ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:549:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_actualParameter3124); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_actualParameter3128); 
			pushFollow(FOLLOW_expression_in_actualParameter3132);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 550:5: -> actual_parameter(formal=$formal.textactual=$actual.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:553:1: namelessAssertion : ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st);
	public final UnparseBLESS3.namelessAssertion_return namelessAssertion() throws RecognitionException {
		UnparseBLESS3.namelessAssertion_return retval = new UnparseBLESS3.namelessAssertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:554:3: ( ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:555:3: ^( ASSERTION pred= predicate )
			{
			match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3171); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_namelessAssertion3175);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 556:5: -> nameless_assertion(a=$pred.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:559:1: namelessFunction : ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st);
	public final UnparseBLESS3.namelessFunction_return namelessFunction() throws RecognitionException {
		UnparseBLESS3.namelessFunction_return retval = new UnparseBLESS3.namelessFunction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tod =null;
		TreeRuleReturnScope functionvalue =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:560:3: ( ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:3: ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
			{
			match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3209); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction3213); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeOrReference_in_namelessFunction3217);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction3223);
			functionvalue=assertionFunctionValue();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 562:5: -> nameless_function(tod=$tod.sta=$functionvalue.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:565:1: namelessEnumeration : ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st);
	public final UnparseBLESS3.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		UnparseBLESS3.namelessEnumeration_return retval = new UnparseBLESS3.namelessEnumeration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope inv =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:566:3: ( ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:567:2: ^( ASSERTION_ENUMERATION inv= invocation )
			{
			match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3261); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_invocation_in_namelessEnumeration3265);
			inv=invocation();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 568:4: -> nameless_enumeration(inv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:571:1: assertion : (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st});
	public final UnparseBLESS3.assertion_return assertion() throws RecognitionException {
		UnparseBLESS3.assertion_return retval = new UnparseBLESS3.assertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope na =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:571:10: (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st})
			int alt39=4;
			switch ( input.LA(1) ) {
			case ASSERTION:
				{
				int LA39_1 = input.LA(2);
				if ( (LA39_1==DOWN) ) {
					int LA39_4 = input.LA(3);
					if ( (LA39_4==LABEL) ) {
						alt39=1;
					}
					else if ( (LA39_4==LITERAL_all||LA39_4==LITERAL_exists||LA39_4==LITERAL_iff||LA39_4==LITERAL_implies||LA39_4==LITERAL_numberof||LA39_4==LITERAL_product||LA39_4==LITERAL_sum) ) {
						alt39=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 4, input);
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
				break;
			case ASSERTION_FUNCTION:
				{
				int LA39_2 = input.LA(2);
				if ( (LA39_2==DOWN) ) {
					int LA39_5 = input.LA(3);
					if ( (LA39_5==LABEL) ) {
						alt39=1;
					}
					else if ( (LA39_5==LITERAL_returns) ) {
						alt39=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 5, input);
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
							new NoViableAltException("", 39, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_ENUMERATION:
				{
				int LA39_3 = input.LA(2);
				if ( (LA39_3==DOWN) ) {
					int LA39_6 = input.LA(3);
					if ( (LA39_6==LABEL) ) {
						alt39=1;
					}
					else if ( (LA39_6==INVOKE) ) {
						alt39=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 39, 6, input);
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
							new NoViableAltException("", 39, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:572:3: na= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertion3294);
					na=namedAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 573:5: -> {$na.st}
					{
						retval.st = (na!=null?((StringTemplate)na.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:574:5: a= namelessAssertion
					{
					pushFollow(FOLLOW_namelessAssertion_in_assertion3310);
					a=namelessAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 575:5: -> {$a.st}
					{
						retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:576:5: f= namelessFunction
					{
					pushFollow(FOLLOW_namelessFunction_in_assertion3326);
					f=namelessFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 577:5: -> {$f.st}
					{
						retval.st = (f!=null?((StringTemplate)f.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:578:5: e= namelessEnumeration
					{
					pushFollow(FOLLOW_namelessEnumeration_in_assertion3342);
					e=namelessEnumeration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 579:5: -> {$e.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:584:1: expression : (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:585:2: (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st))
			int alt40=7;
			switch ( input.LA(1) ) {
			case LITERAL_all:
				{
				alt40=1;
				}
				break;
			case LITERAL_exists:
				{
				alt40=2;
				}
				break;
			case LITERAL_sum:
				{
				alt40=3;
				}
				break;
			case LITERAL_product:
				{
				alt40=4;
				}
				break;
			case LITERAL_numberof:
				{
				alt40=5;
				}
				break;
			case LITERAL_iff:
				{
				alt40=6;
				}
				break;
			case LITERAL_implies:
				{
				alt40=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:586:3: all= universalQuantification
					{
					pushFollow(FOLLOW_universalQuantification_in_expression3374);
					all=universalQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 587:5: -> {$all.st}
					{
						retval.st = (all!=null?((StringTemplate)all.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:588:5: exists= existentialQuantification
					{
					pushFollow(FOLLOW_existentialQuantification_in_expression3390);
					exists=existentialQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 589:5: -> {$exists.st}
					{
						retval.st = (exists!=null?((StringTemplate)exists.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:590:5: sum= sumQuantification
					{
					pushFollow(FOLLOW_sumQuantification_in_expression3406);
					sum=sumQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 591:5: -> {$sum.st}
					{
						retval.st = (sum!=null?((StringTemplate)sum.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:592:5: product= productQuantification
					{
					pushFollow(FOLLOW_productQuantification_in_expression3422);
					product=productQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 593:5: -> {$product.st}
					{
						retval.st = (product!=null?((StringTemplate)product.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:594:5: numberof= countingQuantification
					{
					pushFollow(FOLLOW_countingQuantification_in_expression3438);
					numberof=countingQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 595:5: -> {$numberof.st}
					{
						retval.st = (numberof!=null?((StringTemplate)numberof.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:596:5: ^(iff= LITERAL_iff l= disjunction r= disjunction )
					{
					iff=(BAST)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression3456); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3460);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3464);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 597:5: -> relation(r=$iff.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (iff!=null?iff.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:598:5: ^(imp= LITERAL_implies l= disjunction r= disjunction )
					{
					imp=(BAST)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression3499); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3503);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3507);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 599:5: -> relation(r=$imp.textlhs=$l.strhs=$r.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:602:1: universalQuantification : ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st);
	public final UnparseBLESS3.universalQuantification_return universalQuantification() throws RecognitionException {
		UnparseBLESS3.universalQuantification_return retval = new UnparseBLESS3.universalQuantification_return();
		retval.start = input.LT(1);

		BAST a=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:603:3: ( ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:604:3: ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			a=(BAST)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification3551); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_universalQuantification3555);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_universalQuantification3559);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification3563); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_universalQuantification3567);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 605:5: -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:608:1: in_which : ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\");
	public final UnparseBLESS3.in_which_return in_which() throws RecognitionException {
		UnparseBLESS3.in_which_return retval = new UnparseBLESS3.in_which_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope b =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:609:3: ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\")
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LITERAL_in) ) {
				alt41=1;
			}
			else if ( (LA41_0==LITERAL_which) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:610:3: ^( LITERAL_in r= range )
					{
					match(input,LITERAL_in,FOLLOW_LITERAL_in_in_in_which3616); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_range_in_in_which3620);
					r=range();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 611:5: -> template(r=$r.st) \"in <r>\"
					{
						retval.st = new StringTemplate(templateLib, "in <r>",new STAttrMap().put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:613:3: ^( LITERAL_which b= predicate )
					{
					match(input,LITERAL_which,FOLLOW_LITERAL_which_in_in_which3647); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_in_which3651);
					b=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 614:5: -> template(b=$b.st) \"which <b>\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:617:1: existentialQuantification : ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st);
	public final UnparseBLESS3.existentialQuantification_return existentialQuantification() throws RecognitionException {
		UnparseBLESS3.existentialQuantification_return retval = new UnparseBLESS3.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST e=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:618:3: ( ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:619:3: ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			e=(BAST)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification3687); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_existentialQuantification3691);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_existentialQuantification3695);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_existentialQuantification3699); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_existentialQuantification3703);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 620:5: -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:623:1: sumQuantification : ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.sumQuantification_return sumQuantification() throws RecognitionException {
		UnparseBLESS3.sumQuantification_return retval = new UnparseBLESS3.sumQuantification_return();
		retval.start = input.LT(1);

		BAST s=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:624:3: ( ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:625:3: ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			s=(BAST)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification3754); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_sumQuantification3758);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_sumQuantification3762);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification3766); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sumQuantification3770);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 626:5: -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:629:1: productQuantification : ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.productQuantification_return productQuantification() throws RecognitionException {
		UnparseBLESS3.productQuantification_return retval = new UnparseBLESS3.productQuantification_return();
		retval.start = input.LT(1);

		BAST p=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:630:3: ( ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:631:3: ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			p=(BAST)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification3822); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_productQuantification3826);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_productQuantification3830);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification3834); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_productQuantification3838);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 632:6: -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:635:1: countingQuantification : ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.countingQuantification_return countingQuantification() throws RecognitionException {
		UnparseBLESS3.countingQuantification_return retval = new UnparseBLESS3.countingQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:636:3: ( ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:637:3: ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) )
			{
			match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification3889); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_countingQuantification3893);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_countingQuantification3897);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification3901); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_countingQuantification3905);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 638:5: -> numberof(lv=$lv.std=$iw.stpe=$ex.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:641:1: logicVariables : ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable );
	public final UnparseBLESS3.logicVariables_return logicVariables() throws RecognitionException {
		UnparseBLESS3.logicVariables_return retval = new UnparseBLESS3.logicVariables_return();
		retval.start = input.LT(1);

		List<Object> list_lv=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope lv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:642:3: ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==COMMA) ) {
				alt43=1;
			}
			else if ( (LA43_0==TILDE) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:643:3: ^( COMMA (lv+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_logicVariables3952); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:643:14: (lv+= variable )+
					int cnt42=0;
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==TILDE) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:643:14: lv+= variable
							{
							pushFollow(FOLLOW_variable_in_logicVariables3956);
							lv=variable();
							state._fsp--;

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv.getTemplate());
							}
							break;

						default :
							if ( cnt42 >= 1 ) break loop42;
							EarlyExitException eee = new EarlyExitException(42, input);
							throw eee;
						}
						cnt42++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 644:5: -> variable_list(parameter=$lv)
					{
						retval.st = templateLib.getInstanceOf("variable_list",new STAttrMap().put("parameter", list_lv));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:646:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_logicVariables3982);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:649:1: disjunction : ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction );
	public final UnparseBLESS3.disjunction_return disjunction() throws RecognitionException {
		UnparseBLESS3.disjunction_return retval = new UnparseBLESS3.disjunction_return();
		retval.start = input.LT(1);

		List<Object> list_c=null;
		TreeRuleReturnScope con =null;
		RuleReturnScope c = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:650:3: ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction )
			int alt47=4;
			switch ( input.LA(1) ) {
			case LITERAL_or:
				{
				alt47=1;
				}
				break;
			case LITERAL_else:
				{
				alt47=2;
				}
				break;
			case LITERAL_xor:
				{
				alt47=3;
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
			case LITERAL_in:
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
				alt47=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:651:3: ^( LITERAL_or (c+= conjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction4003); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:651:18: (c+= conjunction )+
					int cnt44=0;
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==AADL_STRING_LITERAL||(LA44_0 >= AL && LA44_0 <= AM)||LA44_0==AT_SIGN||LA44_0==CARET||LA44_0==DIVIDE||LA44_0==EQ||LA44_0==EXP||LA44_0==GT||LA44_0==ID||LA44_0==INVOKE||LA44_0==LITERAL_abs||LA44_0==LITERAL_and||LA44_0==LITERAL_div||LA44_0==LITERAL_false||LA44_0==LITERAL_in||LA44_0==LITERAL_mod||(LA44_0 >= LITERAL_not && LA44_0 <= LITERAL_null)||LA44_0==LITERAL_rem||LA44_0==LITERAL_round||LA44_0==LITERAL_then||LA44_0==LITERAL_timeout||LA44_0==LITERAL_tops||(LA44_0 >= LITERAL_true && LA44_0 <= LITERAL_truncate)||(LA44_0 >= LPAREN && LA44_0 <= LT)||LA44_0==MINUS||LA44_0==NEQ||LA44_0==OLD_NEQ||LA44_0==PLUS||LA44_0==PLUS_EQUALS||(LA44_0 >= QUANTITY && LA44_0 <= QUESTION)||LA44_0==RECORD_TERM||LA44_0==TICK||LA44_0==TIMES||LA44_0==UNARY_MINUS) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:651:18: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4007);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt44 >= 1 ) break loop44;
							EarlyExitException eee = new EarlyExitException(44, input);
							throw eee;
						}
						cnt44++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 652:5: -> disjunction(bopt=$c)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_c));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:654:3: ^( LITERAL_else (c+= conjunction )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction4033); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:654:20: (c+= conjunction )+
					int cnt45=0;
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==AADL_STRING_LITERAL||(LA45_0 >= AL && LA45_0 <= AM)||LA45_0==AT_SIGN||LA45_0==CARET||LA45_0==DIVIDE||LA45_0==EQ||LA45_0==EXP||LA45_0==GT||LA45_0==ID||LA45_0==INVOKE||LA45_0==LITERAL_abs||LA45_0==LITERAL_and||LA45_0==LITERAL_div||LA45_0==LITERAL_false||LA45_0==LITERAL_in||LA45_0==LITERAL_mod||(LA45_0 >= LITERAL_not && LA45_0 <= LITERAL_null)||LA45_0==LITERAL_rem||LA45_0==LITERAL_round||LA45_0==LITERAL_then||LA45_0==LITERAL_timeout||LA45_0==LITERAL_tops||(LA45_0 >= LITERAL_true && LA45_0 <= LITERAL_truncate)||(LA45_0 >= LPAREN && LA45_0 <= LT)||LA45_0==MINUS||LA45_0==NEQ||LA45_0==OLD_NEQ||LA45_0==PLUS||LA45_0==PLUS_EQUALS||(LA45_0 >= QUANTITY && LA45_0 <= QUESTION)||LA45_0==RECORD_TERM||LA45_0==TICK||LA45_0==TIMES||LA45_0==UNARY_MINUS) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:654:20: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4037);
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
					// 655:5: -> cor(t=$c)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_c));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:657:3: ^( LITERAL_xor (c+= conjunction )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction4063); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:657:19: (c+= conjunction )+
					int cnt46=0;
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==AADL_STRING_LITERAL||(LA46_0 >= AL && LA46_0 <= AM)||LA46_0==AT_SIGN||LA46_0==CARET||LA46_0==DIVIDE||LA46_0==EQ||LA46_0==EXP||LA46_0==GT||LA46_0==ID||LA46_0==INVOKE||LA46_0==LITERAL_abs||LA46_0==LITERAL_and||LA46_0==LITERAL_div||LA46_0==LITERAL_false||LA46_0==LITERAL_in||LA46_0==LITERAL_mod||(LA46_0 >= LITERAL_not && LA46_0 <= LITERAL_null)||LA46_0==LITERAL_rem||LA46_0==LITERAL_round||LA46_0==LITERAL_then||LA46_0==LITERAL_timeout||LA46_0==LITERAL_tops||(LA46_0 >= LITERAL_true && LA46_0 <= LITERAL_truncate)||(LA46_0 >= LPAREN && LA46_0 <= LT)||LA46_0==MINUS||LA46_0==NEQ||LA46_0==OLD_NEQ||LA46_0==PLUS||LA46_0==PLUS_EQUALS||(LA46_0 >= QUANTITY && LA46_0 <= QUESTION)||LA46_0==RECORD_TERM||LA46_0==TICK||LA46_0==TIMES||LA46_0==UNARY_MINUS) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:657:19: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4067);
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
					// 658:5: -> xor(terms=$c)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_c));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:660:3: con= conjunction
					{
					pushFollow(FOLLOW_conjunction_in_disjunction4093);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:663:1: conjunction : ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st});
	public final UnparseBLESS3.conjunction_return conjunction() throws RecognitionException {
		UnparseBLESS3.conjunction_return retval = new UnparseBLESS3.conjunction_return();
		retval.start = input.LT(1);

		List<Object> list_r=null;
		TreeRuleReturnScope rel =null;
		RuleReturnScope r = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:664:3: ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st})
			int alt50=3;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt50=1;
				}
				break;
			case LITERAL_then:
				{
				alt50=2;
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
			case LITERAL_in:
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
				alt50=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:3: ^( LITERAL_and (r+= relation )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction4112); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:19: (r+= relation )+
					int cnt48=0;
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==AADL_STRING_LITERAL||(LA48_0 >= AL && LA48_0 <= AM)||LA48_0==AT_SIGN||LA48_0==CARET||LA48_0==DIVIDE||LA48_0==EQ||LA48_0==EXP||LA48_0==GT||LA48_0==ID||LA48_0==INVOKE||LA48_0==LITERAL_abs||LA48_0==LITERAL_div||LA48_0==LITERAL_false||LA48_0==LITERAL_in||LA48_0==LITERAL_mod||(LA48_0 >= LITERAL_not && LA48_0 <= LITERAL_null)||LA48_0==LITERAL_rem||LA48_0==LITERAL_round||LA48_0==LITERAL_timeout||LA48_0==LITERAL_tops||(LA48_0 >= LITERAL_true && LA48_0 <= LITERAL_truncate)||(LA48_0 >= LPAREN && LA48_0 <= LT)||LA48_0==MINUS||LA48_0==NEQ||LA48_0==OLD_NEQ||LA48_0==PLUS||LA48_0==PLUS_EQUALS||(LA48_0 >= QUANTITY && LA48_0 <= QUESTION)||LA48_0==RECORD_TERM||LA48_0==TICK||LA48_0==TIMES||LA48_0==UNARY_MINUS) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:19: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4116);
							r=relation();
							state._fsp--;

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTemplate());
							}
							break;

						default :
							if ( cnt48 >= 1 ) break loop48;
							EarlyExitException eee = new EarlyExitException(48, input);
							throw eee;
						}
						cnt48++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 666:5: -> conjunction(bopt=$r)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_r));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:3: ^( LITERAL_then (r+= relation )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction4142); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:20: (r+= relation )+
					int cnt49=0;
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==AADL_STRING_LITERAL||(LA49_0 >= AL && LA49_0 <= AM)||LA49_0==AT_SIGN||LA49_0==CARET||LA49_0==DIVIDE||LA49_0==EQ||LA49_0==EXP||LA49_0==GT||LA49_0==ID||LA49_0==INVOKE||LA49_0==LITERAL_abs||LA49_0==LITERAL_div||LA49_0==LITERAL_false||LA49_0==LITERAL_in||LA49_0==LITERAL_mod||(LA49_0 >= LITERAL_not && LA49_0 <= LITERAL_null)||LA49_0==LITERAL_rem||LA49_0==LITERAL_round||LA49_0==LITERAL_timeout||LA49_0==LITERAL_tops||(LA49_0 >= LITERAL_true && LA49_0 <= LITERAL_truncate)||(LA49_0 >= LPAREN && LA49_0 <= LT)||LA49_0==MINUS||LA49_0==NEQ||LA49_0==OLD_NEQ||LA49_0==PLUS||LA49_0==PLUS_EQUALS||(LA49_0 >= QUANTITY && LA49_0 <= QUESTION)||LA49_0==RECORD_TERM||LA49_0==TICK||LA49_0==TIMES||LA49_0==UNARY_MINUS) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:20: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4146);
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
					// 669:5: -> cand(t=$r)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_r));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:671:3: rel= relation
					{
					pushFollow(FOLLOW_relation_in_conjunction4172);
					rel=relation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 672:5: -> {$rel.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:675:2: relation : ( ^( EQ lhs= addSub rhs= addSub ) -> equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"| ^( AM lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"| ^( AL lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"| ^( GT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"| ^( PLUS_EQUALS lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"| ^( NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( OLD_NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LITERAL_in lhs= addSub rng= range ) |as= addSub -> {$as.st});
	public final UnparseBLESS3.relation_return relation() throws RecognitionException {
		UnparseBLESS3.relation_return retval = new UnparseBLESS3.relation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lhs =null;
		TreeRuleReturnScope rhs =null;
		TreeRuleReturnScope rng =null;
		TreeRuleReturnScope as =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:676:3: ( ^( EQ lhs= addSub rhs= addSub ) -> equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"| ^( AM lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"| ^( AL lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"| ^( GT lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"| ^( PLUS_EQUALS lhs= addSub rhs= addSub ) -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"| ^( NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( OLD_NEQ lhs= addSub rhs= addSub ) -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)| ^( LITERAL_in lhs= addSub rng= range ) |as= addSub -> {$as.st})
			int alt51=10;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt51=1;
				}
				break;
			case LT:
				{
				alt51=2;
				}
				break;
			case AM:
				{
				alt51=3;
				}
				break;
			case AL:
				{
				alt51=4;
				}
				break;
			case GT:
				{
				alt51=5;
				}
				break;
			case PLUS_EQUALS:
				{
				alt51=6;
				}
				break;
			case NEQ:
				{
				alt51=7;
				}
				break;
			case OLD_NEQ:
				{
				alt51=8;
				}
				break;
			case LITERAL_in:
				{
				alt51=9;
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
				alt51=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:3: ^( EQ lhs= addSub rhs= addSub )
					{
					match(input,EQ,FOLLOW_EQ_in_relation4199); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4204);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4208);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 678:5: -> equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:3: ^( LT lhs= addSub rhs= addSub )
					{
					match(input,LT,FOLLOW_LT_in_relation4238); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4243);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4247);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 681:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\< <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\< <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:683:3: ^( AM lhs= addSub rhs= addSub )
					{
					match(input,AM,FOLLOW_AM_in_relation4279); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4284);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4288);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 684:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\<= <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\<= <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:686:3: ^( AL lhs= addSub rhs= addSub )
					{
					match(input,AL,FOLLOW_AL_in_relation4320); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4325);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4329);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 687:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\>= <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\>= <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:689:3: ^( GT lhs= addSub rhs= addSub )
					{
					match(input,GT,FOLLOW_GT_in_relation4361); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4366);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4370);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 690:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> \\> <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> \\> <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:3: ^( PLUS_EQUALS lhs= addSub rhs= addSub )
					{
					match(input,PLUS_EQUALS,FOLLOW_PLUS_EQUALS_in_relation4402); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4407);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4411);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 693:5: -> template(lhs=$lhs.strhs=$rhs.st) \"<lhs> += <rhs>\"
					{
						retval.st = new StringTemplate(templateLib, "<lhs> += <rhs>",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:3: ^( NEQ lhs= addSub rhs= addSub )
					{
					match(input,NEQ,FOLLOW_NEQ_in_relation4443); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4448);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4452);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 696:5: -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("not_equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:698:3: ^( OLD_NEQ lhs= addSub rhs= addSub )
					{
					match(input,OLD_NEQ,FOLLOW_OLD_NEQ_in_relation4482); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4487);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4491);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 699:5: -> not_equal_relation(lhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("not_equal_relation",new STAttrMap().put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:701:3: ^( LITERAL_in lhs= addSub rng= range )
					{
					match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation4519); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4523);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_range_in_relation4527);
					rng=range();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:703:3: as= addSub
					{
					pushFollow(FOLLOW_addSub_in_relation4539);
					as=addSub();
					state._fsp--;

					// TEMPLATE REWRITE
					// 704:5: -> {$as.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:707:1: range : ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:708:3: ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st))
			int alt52=4;
			switch ( input.LA(1) ) {
			case DOTDOT:
				{
				alt52=1;
				}
				break;
			case COMMADOT:
				{
				alt52=2;
				}
				break;
			case DOTCOMMA:
				{
				alt52=3;
				}
				break;
			case COMMACOMMA:
				{
				alt52=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:709:3: ^(dd= DOTDOT lb= subexpression ub= subexpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_range4566); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4570);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4574);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 710:5: -> range(rs=$dd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dd!=null?dd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:712:4: ^(cd= COMMADOT lb= subexpression ub= subexpression )
					{
					cd=(BAST)match(input,COMMADOT,FOLLOW_COMMADOT_in_range4612); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4616);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4620);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 713:5: -> range(rs=$cd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cd!=null?cd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:715:4: ^(dc= DOTCOMMA lb= subexpression ub= subexpression )
					{
					dc=(BAST)match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_range4658); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4662);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4666);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 716:5: -> range(rs=$dc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dc!=null?dc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:718:4: ^(cc= COMMACOMMA lb= subexpression ub= subexpression )
					{
					cc=(BAST)match(input,COMMACOMMA,FOLLOW_COMMACOMMA_in_range4704); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4708);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4712);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 719:5: -> range(rs=$cc.textlb=$lb.stub=$ub.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:722:1: addSub : ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st});
	public final UnparseBLESS3.addSub_return addSub() throws RecognitionException {
		UnparseBLESS3.addSub_return retval = new UnparseBLESS3.addSub_return();
		retval.start = input.LT(1);

		List<Object> list_md=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope m =null;
		RuleReturnScope md = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:723:3: ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st})
			int alt54=3;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt54=1;
				}
				break;
			case MINUS:
				{
				alt54=2;
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
				alt54=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:724:3: ^( PLUS (md+= multDiv )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_addSub4755); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:724:13: (md+= multDiv )+
					int cnt53=0;
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==AADL_STRING_LITERAL||LA53_0==AT_SIGN||LA53_0==CARET||LA53_0==DIVIDE||LA53_0==EXP||LA53_0==ID||LA53_0==INVOKE||LA53_0==LITERAL_abs||LA53_0==LITERAL_div||LA53_0==LITERAL_false||LA53_0==LITERAL_mod||(LA53_0 >= LITERAL_not && LA53_0 <= LITERAL_null)||LA53_0==LITERAL_rem||LA53_0==LITERAL_round||LA53_0==LITERAL_timeout||LA53_0==LITERAL_tops||(LA53_0 >= LITERAL_true && LA53_0 <= LITERAL_truncate)||LA53_0==LPAREN||(LA53_0 >= QUANTITY && LA53_0 <= QUESTION)||LA53_0==RECORD_TERM||LA53_0==TICK||LA53_0==TIMES||LA53_0==UNARY_MINUS) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:724:13: md+= multDiv
							{
							pushFollow(FOLLOW_multDiv_in_addSub4759);
							md=multDiv();
							state._fsp--;

							if (list_md==null) list_md=new ArrayList<Object>();
							list_md.add(md.getTemplate());
							}
							break;

						default :
							if ( cnt53 >= 1 ) break loop53;
							EarlyExitException eee = new EarlyExitException(53, input);
							throw eee;
						}
						cnt53++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 725:5: -> add(terms=$md)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_md));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:727:3: ^( MINUS l= multDiv r= multDiv )
					{
					match(input,MINUS,FOLLOW_MINUS_in_addSub4785); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_multDiv_in_addSub4789);
					l=multDiv();
					state._fsp--;

					pushFollow(FOLLOW_multDiv_in_addSub4793);
					r=multDiv();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 728:5: -> template(l=$l.str=$r.st) \"<l> - <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> - <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:730:3: m= multDiv
					{
					pushFollow(FOLLOW_multDiv_in_addSub4825);
					m=multDiv();
					state._fsp--;

					// TEMPLATE REWRITE
					// 731:5: -> {$m.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:734:1: multDiv : ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st});
	public final UnparseBLESS3.multDiv_return multDiv() throws RecognitionException {
		UnparseBLESS3.multDiv_return retval = new UnparseBLESS3.multDiv_return();
		retval.start = input.LT(1);

		List<Object> list_exp=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;
		RuleReturnScope exp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:735:3: ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st})
			int alt56=6;
			switch ( input.LA(1) ) {
			case TIMES:
				{
				alt56=1;
				}
				break;
			case DIVIDE:
				{
				alt56=2;
				}
				break;
			case LITERAL_div:
				{
				alt56=3;
				}
				break;
			case LITERAL_mod:
				{
				alt56=4;
				}
				break;
			case LITERAL_rem:
				{
				alt56=5;
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
				alt56=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:736:3: ^( TIMES (exp+= exponentiation )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multDiv4856); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:736:15: (exp+= exponentiation )+
					int cnt55=0;
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==AADL_STRING_LITERAL||LA55_0==AT_SIGN||LA55_0==CARET||LA55_0==EXP||LA55_0==ID||LA55_0==INVOKE||LA55_0==LITERAL_abs||LA55_0==LITERAL_false||(LA55_0 >= LITERAL_not && LA55_0 <= LITERAL_null)||LA55_0==LITERAL_round||LA55_0==LITERAL_timeout||LA55_0==LITERAL_tops||(LA55_0 >= LITERAL_true && LA55_0 <= LITERAL_truncate)||LA55_0==LPAREN||(LA55_0 >= QUANTITY && LA55_0 <= QUESTION)||LA55_0==RECORD_TERM||LA55_0==TICK||LA55_0==UNARY_MINUS) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:736:15: exp+= exponentiation
							{
							pushFollow(FOLLOW_exponentiation_in_multDiv4860);
							exp=exponentiation();
							state._fsp--;

							if (list_exp==null) list_exp=new ArrayList<Object>();
							list_exp.add(exp.getTemplate());
							}
							break;

						default :
							if ( cnt55 >= 1 ) break loop55;
							EarlyExitException eee = new EarlyExitException(55, input);
							throw eee;
						}
						cnt55++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 737:5: -> multiply(terms=$exp)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_exp));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:739:3: ^( DIVIDE l= exponentiation r= exponentiation )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multDiv4886); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4890);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4894);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 740:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:742:3: ^( LITERAL_div l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_div,FOLLOW_LITERAL_div_in_multDiv4926); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4930);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4934);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 743:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:745:3: ^( LITERAL_mod l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_multDiv4966); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv4970);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv4974);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 746:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:748:3: ^( LITERAL_rem l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_multDiv5006); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5010);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5014);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 749:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:751:3: e= exponentiation
					{
					pushFollow(FOLLOW_exponentiation_in_multDiv5046);
					e=exponentiation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 752:5: -> {$e.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:756:1: exponentiation : ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st});
	public final UnparseBLESS3.exponentiation_return exponentiation() throws RecognitionException {
		UnparseBLESS3.exponentiation_return retval = new UnparseBLESS3.exponentiation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope s =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:757:3: ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st})
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==EXP) ) {
				alt57=1;
			}
			else if ( (LA57_0==AADL_STRING_LITERAL||LA57_0==AT_SIGN||LA57_0==CARET||LA57_0==ID||LA57_0==INVOKE||LA57_0==LITERAL_abs||LA57_0==LITERAL_false||(LA57_0 >= LITERAL_not && LA57_0 <= LITERAL_null)||LA57_0==LITERAL_round||LA57_0==LITERAL_timeout||LA57_0==LITERAL_tops||(LA57_0 >= LITERAL_true && LA57_0 <= LITERAL_truncate)||LA57_0==LPAREN||(LA57_0 >= QUANTITY && LA57_0 <= QUESTION)||LA57_0==RECORD_TERM||LA57_0==TICK||LA57_0==UNARY_MINUS) ) {
				alt57=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:758:3: ^( EXP l= subexpression r= subexpression )
					{
					match(input,EXP,FOLLOW_EXP_in_exponentiation5078); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_exponentiation5082);
					l=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_exponentiation5086);
					r=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 759:5: -> template(l=$l.str=$r.st) \"<l> ** <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> ** <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:761:3: s= subexpression
					{
					pushFollow(FOLLOW_subexpression_in_exponentiation5118);
					s=subexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 762:5: -> {$s.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:765:1: subexpression : ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:766:3: ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st})
			int alt58=6;
			switch ( input.LA(1) ) {
			case LITERAL_not:
				{
				alt58=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt58=2;
				}
				break;
			case LITERAL_abs:
				{
				alt58=3;
				}
				break;
			case LITERAL_truncate:
				{
				alt58=4;
				}
				break;
			case LITERAL_round:
				{
				alt58=5;
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
				alt58=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:767:3: ^(n= LITERAL_not te= timedExpression )
					{
					n=(BAST)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5149); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5153);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 768:5: -> unary(sym=$n.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (n!=null?n.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:770:3: ^(m= UNARY_MINUS te= timedExpression )
					{
					m=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_subexpression5185); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5189);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 771:5: -> unary(sym=$m.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (m!=null?m.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:773:3: ^(s= LITERAL_abs te= timedExpression )
					{
					s=(BAST)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5221); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5225);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 774:5: -> unary(sym=$s.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (s!=null?s.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:776:3: ^(t= LITERAL_truncate te= timedExpression )
					{
					t=(BAST)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5257); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5261);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 777:5: -> unary(sym=$t.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (t!=null?t.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:779:3: ^(r= LITERAL_round te= timedExpression )
					{
					r=(BAST)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5293); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5297);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 780:5: -> unary(sym=$r.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (r!=null?r.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:782:3: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5327);
					te=timedExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 783:5: -> {$te.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:786:1: timedExpression : ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st});
	public final UnparseBLESS3.timedExpression_return timedExpression() throws RecognitionException {
		UnparseBLESS3.timedExpression_return retval = new UnparseBLESS3.timedExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:787:3: ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st})
			int alt59=4;
			switch ( input.LA(1) ) {
			case TICK:
				{
				int LA59_1 = input.LA(2);
				if ( (LA59_1==DOWN) ) {
					int LA59_5 = input.LA(3);
					if ( (LA59_5==ID) ) {
						int LA59_6 = input.LA(4);
						if ( (LA59_6==LITERAL_count||LA59_6==LITERAL_fresh||LA59_6==LITERAL_updated) ) {
							alt59=4;
						}
						else if ( ((LA59_6 >= DOWN && LA59_6 <= UP)) ) {
							alt59=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 59, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA59_5==AADL_STRING_LITERAL||LA59_5==INVOKE||LA59_5==LITERAL_false||(LA59_5 >= LITERAL_now && LA59_5 <= LITERAL_null)||LA59_5==LITERAL_timeout||LA59_5==LITERAL_tops||LA59_5==LITERAL_true||LA59_5==LPAREN||(LA59_5 >= QUANTITY && LA59_5 <= QUESTION)||LA59_5==RECORD_TERM||LA59_5==TICK) ) {
						alt59=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 59, 5, input);
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
							new NoViableAltException("", 59, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT_SIGN:
				{
				alt59=2;
				}
				break;
			case CARET:
				{
				alt59=3;
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
				alt59=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:788:3: ^( TICK ts= timedSubject )
					{
					match(input,TICK,FOLLOW_TICK_in_timedExpression5357); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5361);
					ts=timedSubject();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 789:5: -> tick(tp=$ts.st)
					{
						retval.st = templateLib.getInstanceOf("tick",new STAttrMap().put("tp", (ts!=null?((StringTemplate)ts.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:791:3: ^( AT_SIGN ts= timedSubject se= subexpression )
					{
					match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5386); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5390);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_timedExpression5394);
					se=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 792:5: -> at(p=$ts.stt=$se.st)
					{
						retval.st = templateLib.getInstanceOf("at",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("t", (se!=null?((StringTemplate)se.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:794:3: ^( CARET ts= timedSubject ps= periodShift )
					{
					match(input,CARET,FOLLOW_CARET_in_timedExpression5424); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5428);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_timedExpression5432);
					ps=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 795:5: -> caret(p=$ts.stcv=$ps.st)
					{
						retval.st = templateLib.getInstanceOf("caret",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("cv", (ps!=null?((StringTemplate)ps.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:797:3: ts= timedSubject
					{
					pushFollow(FOLLOW_timedSubject_in_timedExpression5462);
					ts=timedSubject();
					state._fsp--;

					// TEMPLATE REWRITE
					// 798:5: -> {$ts.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:801:1: timedSubject : (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st});
	public final UnparseBLESS3.timedSubject_return timedSubject() throws RecognitionException {
		UnparseBLESS3.timedSubject_return retval = new UnparseBLESS3.timedSubject_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ce =null;
		TreeRuleReturnScope ps =null;
		TreeRuleReturnScope rt =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:802:3: (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st})
			int alt60=5;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				int LA60_1 = input.LA(2);
				if ( (LA60_1==DOWN) ) {
					int LA60_5 = input.LA(3);
					if ( (LA60_5==QQ) ) {
						alt60=1;
					}
					else if ( (LA60_5==LITERAL_all||LA60_5==LITERAL_case||LA60_5==LITERAL_exists||LA60_5==LITERAL_iff||LA60_5==LITERAL_implies||LA60_5==LITERAL_numberof||LA60_5==LITERAL_product||LA60_5==LITERAL_sum) ) {
						alt60=2;
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
			case RECORD_TERM:
				{
				alt60=3;
				}
				break;
			case INVOKE:
				{
				alt60=4;
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
				alt60=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:803:3: ce= conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5489);
					ce=conditionalExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 804:4: -> {$ce.st}
					{
						retval.st = (ce!=null?((StringTemplate)ce.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:805:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5504);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 806:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:807:5: rt= recordTerm
					{
					pushFollow(FOLLOW_recordTerm_in_timedSubject5521);
					rt=recordTerm();
					state._fsp--;

					// TEMPLATE REWRITE
					// 808:5: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:809:5: inv= invocation
					{
					pushFollow(FOLLOW_invocation_in_timedSubject5537);
					inv=invocation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 810:5: -> {$inv.st}
					{
						retval.st = (inv!=null?((StringTemplate)inv.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:811:5: v= value
					{
					pushFollow(FOLLOW_value_in_timedSubject5555);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 812:5: -> {$v.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:815:1: periodShift : ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st));
	public final UnparseBLESS3.periodShift_return periodShift() throws RecognitionException {
		UnparseBLESS3.periodShift_return retval = new UnparseBLESS3.periodShift_return();
		retval.start = input.LT(1);

		BAST um=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:816:3: ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st))
			int alt61=4;
			switch ( input.LA(1) ) {
			case UNARY_MINUS:
				{
				int LA61_1 = input.LA(2);
				if ( (LA61_1==DOWN) ) {
					int LA61_4 = input.LA(3);
					if ( (LA61_4==LPAREN) ) {
						alt61=2;
					}
					else if ( (LA61_4==AADL_STRING_LITERAL||LA61_4==ID||LA61_4==LITERAL_false||(LA61_4 >= LITERAL_now && LA61_4 <= LITERAL_null)||LA61_4==LITERAL_timeout||LA61_4==LITERAL_tops||LA61_4==LITERAL_true||(LA61_4 >= QUANTITY && LA61_4 <= QUESTION)||LA61_4==TICK) ) {
						alt61=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 61, 4, input);
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
				alt61=3;
				}
				break;
			case LPAREN:
				{
				alt61=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:817:3: ^(um= UNARY_MINUS v= value )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5584); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_value_in_periodShift5588);
					v=value();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 818:5: -> unary(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:820:3: ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5620); 
					match(input, Token.DOWN, null); 
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5624); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5628);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5630); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 821:5: -> unary_paren(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary_paren",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:823:3: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift5662);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 824:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:826:3: ^( LPAREN ie= indexExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5680); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5684);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5686); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 827:5: -> parentheses(be=$ie.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:830:1: indexExpression : ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps));
	public final UnparseBLESS3.indexExpression_return indexExpression() throws RecognitionException {
		UnparseBLESS3.indexExpression_return retval = new UnparseBLESS3.indexExpression_return();
		retval.start = input.LT(1);

		BAST m=null;
		List<Object> list_ps=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		RuleReturnScope ps = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:831:3: ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps))
			int alt64=6;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				alt64=1;
				}
				break;
			case LITERAL_div:
				{
				alt64=2;
				}
				break;
			case LITERAL_mod:
				{
				alt64=3;
				}
				break;
			case LITERAL_rem:
				{
				alt64=4;
				}
				break;
			case PLUS:
				{
				alt64=5;
				}
				break;
			case TIMES:
				{
				alt64=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:832:3: ^(m= MINUS l= periodShift r= periodShift )
					{
					m=(BAST)match(input,MINUS,FOLLOW_MINUS_in_indexExpression5722); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5726);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5730);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 833:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:835:3: ^(m= LITERAL_div l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression5764); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5768);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5772);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 836:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:838:3: ^(m= LITERAL_mod l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression5806); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5810);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5814);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 839:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:841:3: ^(m= LITERAL_rem l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression5848); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression5852);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression5856);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 842:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:844:3: ^( PLUS (ps+= periodShift )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_indexExpression5888); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:844:13: (ps+= periodShift )+
					int cnt62=0;
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==AADL_STRING_LITERAL||LA62_0==ID||LA62_0==LITERAL_false||(LA62_0 >= LITERAL_now && LA62_0 <= LITERAL_null)||LA62_0==LITERAL_timeout||LA62_0==LITERAL_tops||LA62_0==LITERAL_true||LA62_0==LPAREN||(LA62_0 >= QUANTITY && LA62_0 <= QUESTION)||LA62_0==TICK||LA62_0==UNARY_MINUS) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:844:13: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression5892);
							ps=periodShift();
							state._fsp--;

							if (list_ps==null) list_ps=new ArrayList<Object>();
							list_ps.add(ps.getTemplate());
							}
							break;

						default :
							if ( cnt62 >= 1 ) break loop62;
							EarlyExitException eee = new EarlyExitException(62, input);
							throw eee;
						}
						cnt62++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 845:5: -> add(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:847:3: ^( TIMES (ps+= periodShift )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_indexExpression5918); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:847:14: (ps+= periodShift )+
					int cnt63=0;
					loop63:
					while (true) {
						int alt63=2;
						int LA63_0 = input.LA(1);
						if ( (LA63_0==AADL_STRING_LITERAL||LA63_0==ID||LA63_0==LITERAL_false||(LA63_0 >= LITERAL_now && LA63_0 <= LITERAL_null)||LA63_0==LITERAL_timeout||LA63_0==LITERAL_tops||LA63_0==LITERAL_true||LA63_0==LPAREN||(LA63_0 >= QUANTITY && LA63_0 <= QUESTION)||LA63_0==TICK||LA63_0==UNARY_MINUS) ) {
							alt63=1;
						}

						switch (alt63) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:847:14: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression5922);
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
					// 848:5: -> multiply(terms=$ps)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:851:1: conditionalExpression : ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st);
	public final UnparseBLESS3.conditionalExpression_return conditionalExpression() throws RecognitionException {
		UnparseBLESS3.conditionalExpression_return retval = new UnparseBLESS3.conditionalExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope f =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:852:3: ( ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:853:3: ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN )
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression5957); 
			match(input, Token.DOWN, null); 
			match(input,QQ,FOLLOW_QQ_in_conditionalExpression5961); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_conditionalExpression5965);
			pred=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression5969);
			t=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression5973);
			f=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression5978); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 854:5: -> conditional_expression(be=$pred.stt=$t.stf=$f.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:857:1: parenthesizedSubexpression : ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st));
	public final UnparseBLESS3.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		UnparseBLESS3.parenthesizedSubexpression_return retval = new UnparseBLESS3.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope ce =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:858:3: ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st))
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==LPAREN) ) {
				int LA65_1 = input.LA(2);
				if ( (LA65_1==DOWN) ) {
					int LA65_2 = input.LA(3);
					if ( (LA65_2==LITERAL_all||LA65_2==LITERAL_exists||LA65_2==LITERAL_iff||LA65_2==LITERAL_implies||LA65_2==LITERAL_numberof||LA65_2==LITERAL_product||LA65_2==LITERAL_sum) ) {
						alt65=1;
					}
					else if ( (LA65_2==LITERAL_case) ) {
						alt65=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 65, 2, input);
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
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}

			switch (alt65) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:859:3: ^( LPAREN ex= expression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6024); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6028);
					ex=expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6030); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 860:5: -> parentheses(be=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:865:3: ^( LPAREN ce= caseExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6060); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6064);
					ce=caseExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6066); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 866:5: -> parentheses(be=$ce.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:869:1: caseExpression : ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc);
	public final UnparseBLESS3.caseExpression_return caseExpression() throws RecognitionException {
		UnparseBLESS3.caseExpression_return retval = new UnparseBLESS3.caseExpression_return();
		retval.start = input.LT(1);

		List<Object> list_cc=null;
		RuleReturnScope cc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:870:3: ( ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:871:3: ^( LITERAL_case (cc+= caseChoice )+ )
			{
			match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6100); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:871:21: (cc+= caseChoice )+
			int cnt66=0;
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==IMP) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:871:21: cc+= caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6104);
					cc=caseChoice();
					state._fsp--;

					if (list_cc==null) list_cc=new ArrayList<Object>();
					list_cc.add(cc.getTemplate());
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
			// 872:5: -> case_expression(cc=$cc)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:875:1: caseChoice : ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st);
	public final UnparseBLESS3.caseChoice_return caseChoice() throws RecognitionException {
		UnparseBLESS3.caseChoice_return retval = new UnparseBLESS3.caseChoice_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope bool =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:876:3: ( ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:877:3: ^( IMP bool= expression exp= expression )
			{
			match(input,IMP,FOLLOW_IMP_in_caseChoice6137); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_caseChoice6141);
			bool=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_caseChoice6145);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 878:5: -> case_choice(be=$bool.stexp=$exp.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:881:1: recordTerm : ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv);
	public final UnparseBLESS3.recordTerm_return recordTerm() throws RecognitionException {
		UnparseBLESS3.recordTerm_return retval = new UnparseBLESS3.recordTerm_return();
		retval.start = input.LT(1);

		BAST typeid=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:882:3: ( ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:883:3: ^( RECORD_TERM typeid= ID (prv+= recordValue )+ )
			{
			match(input,RECORD_TERM,FOLLOW_RECORD_TERM_in_recordTerm6186); 
			match(input, Token.DOWN, null); 
			typeid=(BAST)match(input,ID,FOLLOW_ID_in_recordTerm6190); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:883:31: (prv+= recordValue )+
			int cnt67=0;
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==ARROW) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:883:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6194);
					prv=recordValue();
					state._fsp--;

					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTemplate());
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
			// 884:5: -> record_term(typeid=$typeid.textprv=$prv)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:887:1: recordValue : ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st);
	public final UnparseBLESS3.recordValue_return recordValue() throws RecognitionException {
		UnparseBLESS3.recordValue_return retval = new UnparseBLESS3.recordValue_return();
		retval.start = input.LT(1);

		BAST field=null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:888:3: ( ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:889:3: ^( ARROW field= ID v= value )
			{
			match(input,ARROW,FOLLOW_ARROW_in_recordValue6233); 
			match(input, Token.DOWN, null); 
			field=(BAST)match(input,ID,FOLLOW_ID_in_recordValue6237); 
			pushFollow(FOLLOW_value_in_recordValue6241);
			v=value();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 890:5: -> record_value(id=$field.textv=$v.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:893:1: predicate : expression ;
	public final UnparseBLESS3.predicate_return predicate() throws RecognitionException {
		UnparseBLESS3.predicate_return retval = new UnparseBLESS3.predicate_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:894:3: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:895:3: expression
			{
			pushFollow(FOLLOW_expression_in_predicate6278);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:900:1: value : (vn= valueName -> {$vn.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}});
	public final UnparseBLESS3.value_return value() throws RecognitionException {
		UnparseBLESS3.value_return retval = new UnparseBLESS3.value_return();
		retval.start = input.LT(1);

		BAST to=null;
		BAST n=null;
		BAST t=null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope c =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:901:3: (vn= valueName -> {$vn.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}})
			int alt68=5;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt68=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt68=2;
				}
				break;
			case LITERAL_timeout:
				{
				alt68=3;
				}
				break;
			case LITERAL_now:
				{
				alt68=4;
				}
				break;
			case LITERAL_tops:
				{
				alt68=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:902:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_value6299);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 903:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:905:3: c= constant
					{
					pushFollow(FOLLOW_constant_in_value6317);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 906:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:908:3: to= LITERAL_timeout
					{
					to=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6335); 
					// TEMPLATE REWRITE
					// 909:5: -> {%{$to.text}}
					{
						retval.st = new StringTemplate(templateLib,(to!=null?to.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:3: n= LITERAL_now
					{
					n=(BAST)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6353); 
					// TEMPLATE REWRITE
					// 912:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:3: t= LITERAL_tops
					{
					t=(BAST)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6371); 
					// TEMPLATE REWRITE
					// 915:5: -> {%{$t.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:918:1: valueName : ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:919:3: ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}})
			int alt72=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA72_1 = input.LA(2);
				if ( (LA72_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case DOLLAR:
						{
						alt72=1;
						}
						break;
					case LBRACKET:
						{
						alt72=2;
						}
						break;
					case DOT:
						{
						alt72=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 72, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( ((LA72_1 >= UP && LA72_1 <= AADL_STRING_LITERAL)||(LA72_1 >= AL && LA72_1 <= AM)||LA72_1==AT_SIGN||(LA72_1 >= CARET && LA72_1 <= COLON)||(LA72_1 >= COMMACOMMA && LA72_1 <= COMMADOT)||LA72_1==DIVIDE||(LA72_1 >= DOTCOMMA && LA72_1 <= DOTDOT)||LA72_1==EQ||LA72_1==EXP||LA72_1==GT||LA72_1==ID||LA72_1==INVOKE||LA72_1==LITERAL_abs||(LA72_1 >= LITERAL_all && LA72_1 <= LITERAL_any)||LA72_1==LITERAL_binding||LA72_1==LITERAL_div||LA72_1==LITERAL_else||LA72_1==LITERAL_exists||LA72_1==LITERAL_false||LA72_1==LITERAL_iff||(LA72_1 >= LITERAL_implies && LA72_1 <= LITERAL_in)||LA72_1==LITERAL_mod||(LA72_1 >= LITERAL_not && LA72_1 <= LITERAL_numberof)||LA72_1==LITERAL_or||LA72_1==LITERAL_product||LA72_1==LITERAL_rem||LA72_1==LITERAL_round||LA72_1==LITERAL_sum||LA72_1==LITERAL_then||LA72_1==LITERAL_timeout||LA72_1==LITERAL_tops||(LA72_1 >= LITERAL_true && LA72_1 <= LITERAL_truncate)||(LA72_1 >= LITERAL_xor && LA72_1 <= LT)||LA72_1==MINUS||LA72_1==NEQ||LA72_1==OLD_NEQ||LA72_1==PLUS||LA72_1==PLUS_EQUALS||(LA72_1 >= QUANTITY && LA72_1 <= QUESTION)||LA72_1==RECORD_TERM||LA72_1==TICK||LA72_1==TIMES||LA72_1==UNARY_MINUS) ) {
					alt72=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 72, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case QUESTION:
				{
				alt72=4;
				}
				break;
			case TICK:
				{
				int LA72_3 = input.LA(2);
				if ( (LA72_3==DOWN) ) {
					int LA72_6 = input.LA(3);
					if ( (LA72_6==ID) ) {
						switch ( input.LA(4) ) {
						case LITERAL_fresh:
							{
							alt72=5;
							}
							break;
						case LITERAL_count:
							{
							alt72=6;
							}
							break;
						case LITERAL_updated:
							{
							alt72=7;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 72, 10, input);
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
								new NoViableAltException("", 72, 6, input);
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
							new NoViableAltException("", 72, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:920:3: ^(id= ID DOLLAR pr= functionParameters )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6398); 
					match(input, Token.DOWN, null); 
					match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6400); 
					pushFollow(FOLLOW_functionParameters_in_valueName6404);
					pr=functionParameters();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 921:5: -> function_call(f=$id.textpl=$pr.st)
					{
						retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (pr!=null?((StringTemplate)pr.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:3: ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6436); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6440); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:35: (array_index+= indexExpressionOrRange )+
					int cnt69=0;
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==DOTDOT||LA69_0==LITERAL_div||LA69_0==LITERAL_mod||LA69_0==LITERAL_rem||LA69_0==MINUS||LA69_0==PLUS||LA69_0==TIMES) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:35: array_index+= indexExpressionOrRange
							{
							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6444);
							array_index=indexExpressionOrRange();
							state._fsp--;

							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTemplate());
							}
							break;

						default :
							if ( cnt69 >= 1 ) break loop69;
							EarlyExitException eee = new EarlyExitException(69, input);
							throw eee;
						}
						cnt69++;
					}

					match(input, Token.UP, null); 

					match(input,DOT,FOLLOW_DOT_in_valueName6451); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:72: (pn+= partialName )*
						loop70:
						while (true) {
							int alt70=2;
							int LA70_0 = input.LA(1);
							if ( (LA70_0==ID) ) {
								alt70=1;
							}

							switch (alt70) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:72: pn+= partialName
								{
								pushFollow(FOLLOW_partialName_in_valueName6455);
								pn=partialName();
								state._fsp--;

								if (list_pn==null) list_pn=new ArrayList<Object>();
								list_pn.add(pn.getTemplate());
								}
								break;

							default :
								break loop70;
							}
						}

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 924:5: -> name(id=$id.textindex=$array_indexrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("index", list_array_index).put("rec", list_pn));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:926:3: ^(id= ID ^( DOT (pn+= partialName )+ ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6496); 
					match(input, Token.DOWN, null); 
					match(input,DOT,FOLLOW_DOT_in_valueName6500); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:926:21: (pn+= partialName )+
					int cnt71=0;
					loop71:
					while (true) {
						int alt71=2;
						int LA71_0 = input.LA(1);
						if ( (LA71_0==ID) ) {
							alt71=1;
						}

						switch (alt71) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:926:21: pn+= partialName
							{
							pushFollow(FOLLOW_partialName_in_valueName6504);
							pn=partialName();
							state._fsp--;

							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTemplate());
							}
							break;

						default :
							if ( cnt71 >= 1 ) break loop71;
							EarlyExitException eee = new EarlyExitException(71, input);
							throw eee;
						}
						cnt71++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 927:5: -> name(id=$id.textrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("rec", list_pn));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:929:3: ^(q= QUESTION id= ID )
					{
					q=(BAST)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6540); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6544); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 930:5: -> template(id=$id.text) \"<id>?\"
					{
						retval.st = new StringTemplate(templateLib, "<id>?",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:932:3: ^( TICK id= ID LITERAL_fresh )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6571); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6575); 
					match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6577); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 933:5: -> port_fresh(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_fresh",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:935:3: ^( TICK id= ID LITERAL_count )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6602); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6606); 
					match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6608); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 936:5: -> port_count(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_count",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:938:3: ^( TICK id= ID LITERAL_updated )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6633); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6637); 
					match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6639); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 939:5: -> port_updated(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_updated",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:941:3: id= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6664); 
					// TEMPLATE REWRITE
					// 942:5: -> {%{$id.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:945:1: functionParameters : ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st});
	public final UnparseBLESS3.functionParameters_return functionParameters() throws RecognitionException {
		UnparseBLESS3.functionParameters_return retval = new UnparseBLESS3.functionParameters_return();
		retval.start = input.LT(1);

		List<Object> list_parameters=null;
		TreeRuleReturnScope parameter =null;
		RuleReturnScope parameters = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:946:3: ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st})
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==COMMA) ) {
				alt73=1;
			}
			else if ( (LA73_0==COLON) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:947:3: ^( COMMA parameters+= formalExpressionPair )
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParameters6689); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6693);
					parameters=formalExpressionPair();
					state._fsp--;

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTemplate());
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 948:5: -> array_range_list(r=$parameters)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_parameters));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:950:3: parameter= formalExpressionPair
					{
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6718);
					parameter=formalExpressionPair();
					state._fsp--;

					// TEMPLATE REWRITE
					// 951:5: -> {$parameter.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:954:1: formalExpressionPair : ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st);
	public final UnparseBLESS3.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		UnparseBLESS3.formalExpressionPair_return retval = new UnparseBLESS3.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:3: ( ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:956:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6743); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_formalExpressionPair6747); 
			pushFollow(FOLLOW_expression_in_formalExpressionPair6751);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 957:5: -> formal_actual(f=$formal.textap=$actual.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:960:1: indexExpressionOrRange : ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st});
	public final UnparseBLESS3.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		UnparseBLESS3.indexExpressionOrRange_return retval = new UnparseBLESS3.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST dd=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope index =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:3: ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st})
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==DOTDOT) ) {
				alt74=1;
			}
			else if ( (LA74_0==LITERAL_div||LA74_0==LITERAL_mod||LA74_0==LITERAL_rem||LA74_0==MINUS||LA74_0==PLUS||LA74_0==TIMES) ) {
				alt74=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:962:3: ^(dd= DOTDOT lb= indexExpression ub= indexExpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6794); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6798);
					lb=indexExpression();
					state._fsp--;

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6802);
					ub=indexExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 963:5: -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (dd!=null?dd.getText():null)).put("lhs", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("rhs", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:965:3: index= indexExpression
					{
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6837);
					index=indexExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 966:5: -> {$index.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:969:1: partialName : ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}});
	public final UnparseBLESS3.partialName_return partialName() throws RecognitionException {
		UnparseBLESS3.partialName_return retval = new UnparseBLESS3.partialName_return();
		retval.start = input.LT(1);

		BAST record_id=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:970:3: ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}})
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==ID) ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1==DOWN) ) {
					alt75=1;
				}
				else if ( (LA75_1==UP||LA75_1==ID) ) {
					alt75=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:971:3: ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) )
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName6864); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6868); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6872);
					array_index=indexExpressionOrRange();
					state._fsp--;

					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTemplate());
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 972:5: -> partial_name(i=$record_id.textp=$array_index)
					{
						retval.st = templateLib.getInstanceOf("partial_name",new STAttrMap().put("i", (record_id!=null?record_id.getText():null)).put("p", list_array_index));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:974:3: record_id= ID
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName6904); 
					// TEMPLATE REWRITE
					// 975:5: -> {%{$record_id.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:979:1: constant : (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}});
	public final UnparseBLESS3.constant_return constant() throws RecognitionException {
		UnparseBLESS3.constant_return retval = new UnparseBLESS3.constant_return();
		retval.start = input.LT(1);

		BAST s=null;
		BAST t=null;
		BAST f=null;
		BAST n=null;
		TreeRuleReturnScope q =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:980:3: (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}})
			int alt76=5;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt76=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt76=2;
				}
				break;
			case LITERAL_true:
				{
				alt76=3;
				}
				break;
			case LITERAL_false:
				{
				alt76=4;
				}
				break;
			case LITERAL_null:
				{
				alt76=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}
			switch (alt76) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:981:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_constant6931);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 982:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:984:3: s= AADL_STRING_LITERAL
					{
					s=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant6949); 
					// TEMPLATE REWRITE
					// 985:5: -> {%{$s.text}}
					{
						retval.st = new StringTemplate(templateLib,(s!=null?s.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:987:3: t= LITERAL_true
					{
					t=(BAST)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant6967); 
					// TEMPLATE REWRITE
					// 988:5: -> {%{$t.text}}
					{
						retval.st = new StringTemplate(templateLib,(t!=null?t.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:990:3: f= LITERAL_false
					{
					f=(BAST)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant6985); 
					// TEMPLATE REWRITE
					// 991:5: -> {%{$f.text}}
					{
						retval.st = new StringTemplate(templateLib,(f!=null?f.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:993:3: n= LITERAL_null
					{
					n=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant7003); 
					// TEMPLATE REWRITE
					// 994:5: -> {%{$n.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:997:1: quantity : ( ^( QUANTITY num= aNumber ) -> {$num.st}| ^( QUANTITY num= aNumber unit= ID ) -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY num= aNumber LITERAL_scalar ) -> template(number=$num.st) \"<number> scalar\"| ^( QUANTITY num= aNumber LITERAL_whole ) -> template(number=$num.st) \"<number> whole\");
	public final UnparseBLESS3.quantity_return quantity() throws RecognitionException {
		UnparseBLESS3.quantity_return retval = new UnparseBLESS3.quantity_return();
		retval.start = input.LT(1);

		BAST unit=null;
		TreeRuleReturnScope num =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:998:3: ( ^( QUANTITY num= aNumber ) -> {$num.st}| ^( QUANTITY num= aNumber unit= ID ) -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY num= aNumber LITERAL_scalar ) -> template(number=$num.st) \"<number> scalar\"| ^( QUANTITY num= aNumber LITERAL_whole ) -> template(number=$num.st) \"<number> whole\")
			int alt77=4;
			alt77 = dfa77.predict(input);
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:999:3: ^( QUANTITY num= aNumber )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7028); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7032);
					num=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1000:5: -> {$num.st}
					{
						retval.st = (num!=null?((StringTemplate)num.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1002:3: ^( QUANTITY num= aNumber unit= ID )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7052); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7056);
					num=aNumber();
					state._fsp--;

					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantity7060); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1003:5: -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"
					{
						retval.st = new StringTemplate(templateLib, "<number> <unit>",new STAttrMap().put("number", (num!=null?((StringTemplate)num.getTemplate()):null)).put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1005:3: ^( QUANTITY num= aNumber LITERAL_scalar )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7092); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7096);
					num=aNumber();
					state._fsp--;

					match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7098); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1006:5: -> template(number=$num.st) \"<number> scalar\"
					{
						retval.st = new StringTemplate(templateLib, "<number> scalar",new STAttrMap().put("number", (num!=null?((StringTemplate)num.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1008:3: ^( QUANTITY num= aNumber LITERAL_whole )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7125); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7129);
					num=aNumber();
					state._fsp--;

					match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7131); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1009:5: -> template(number=$num.st) \"<number> whole\"
					{
						retval.st = new StringTemplate(templateLib, "<number> whole",new STAttrMap().put("number", (num!=null?((StringTemplate)num.getTemplate()):null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1012:1: aNumber : (lit= number -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= QCLREF -> {%{$propertyConstant.text}});
	public final UnparseBLESS3.aNumber_return aNumber() throws RecognitionException {
		UnparseBLESS3.aNumber_return retval = new UnparseBLESS3.aNumber_return();
		retval.start = input.LT(1);

		BAST propertyConstant=null;
		TreeRuleReturnScope lit =null;
		TreeRuleReturnScope property =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1012:8: (lit= number -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= QCLREF -> {%{$propertyConstant.text}})
			int alt78=3;
			switch ( input.LA(1) ) {
			case INTEGER_LIT:
			case REAL_LIT:
				{
				alt78=1;
				}
				break;
			case OCTOTHORPE:
				{
				alt78=2;
				}
				break;
			case QCLREF:
				{
				alt78=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1013:2: lit= number
					{
					pushFollow(FOLLOW_number_in_aNumber7166);
					lit=number();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1014:4: -> {%{$lit.text}}
					{
						retval.st = new StringTemplate(templateLib,(lit!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(lit.start),input.getTreeAdaptor().getTokenStopIndex(lit.start))):null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1015:4: property= propertyReference
					{
					pushFollow(FOLLOW_propertyReference_in_aNumber7180);
					property=propertyReference();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1016:4: -> {$property.st}
					{
						retval.st = (property!=null?((StringTemplate)property.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1017:4: propertyConstant= QCLREF
					{
					propertyConstant=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_aNumber7194); 
					// TEMPLATE REWRITE
					// 1018:4: -> {%{$propertyConstant.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1021:1: propertyReference : ( ^(oct= OCTOTHORPE pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.text)| ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.textf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.text)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF ) -> property_reference(component=$component.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ ) -> property_reference(component=$component.textpname=$pname.textf=$field));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1022:2: ( ^(oct= OCTOTHORPE pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.text)| ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.textf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.text)| ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF ) -> property_reference(component=$component.textpname=$pname.textf=$field)| ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ ) -> property_reference(component=$component.textpname=$pname.textf=$field))
			int alt82=6;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==OCTOTHORPE) ) {
				int LA82_1 = input.LA(2);
				if ( (LA82_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case QCLREF:
						{
						int LA82_3 = input.LA(4);
						if ( (LA82_3==UP) ) {
							alt82=1;
						}
						else if ( (LA82_3==DOT||LA82_3==LBRACKET) ) {
							alt82=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
						break;
					case LITERAL_self:
						{
						int LA82_4 = input.LA(4);
						if ( (LA82_4==QCLREF) ) {
							int LA82_8 = input.LA(5);
							if ( (LA82_8==UP) ) {
								alt82=3;
							}
							else if ( (LA82_8==DOT||LA82_8==LBRACKET) ) {
								alt82=4;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 82, 8, input);
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
									new NoViableAltException("", 82, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case QCREF:
						{
						int LA82_5 = input.LA(4);
						if ( (LA82_5==QCLREF) ) {
							int LA82_9 = input.LA(5);
							if ( (LA82_9==UP) ) {
								alt82=5;
							}
							else if ( (LA82_9==DOT||LA82_9==LBRACKET) ) {
								alt82=6;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 82, 9, input);
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
									new NoViableAltException("", 82, 5, input);
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
								new NoViableAltException("", 82, 2, input);
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

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1024:3: ^(oct= OCTOTHORPE pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7226); 
					match(input, Token.DOWN, null); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7230); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1025:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1026:5: -> property_reference(pname=$pname.text)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?pname.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1028:3: ^(oct= OCTOTHORPE pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7267); 
					match(input, Token.DOWN, null); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7271); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1028:38: (field+= propertyField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1028:38: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7275);
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
					// 1029:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1030:5: -> property_reference(pname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1032:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7317); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7321); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7325); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1033:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1034:5: -> property_reference(component=$self.textpname=$pname.text)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?pname.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7367); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7371); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7375); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:56: (field+= propertyField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1036:56: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7379);
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
					// 1037:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1038:5: -> property_reference(component=$self.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1040:3: ^(oct= OCTOTHORPE component= QCREF pname= QCLREF )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7425); 
					match(input, Token.DOWN, null); 
					component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7429); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7433); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1041:5: -> property_reference(component=$component.textpname=$pname.textf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?component.getText():null)).put("pname", (pname!=null?pname.getText():null)).put("f", list_field));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1043:3: ^(oct= OCTOTHORPE component= QCREF pname= QCLREF (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7468); 
					match(input, Token.DOWN, null); 
					component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7472); 
					pname=(BAST)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7476); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1043:54: (field+= propertyField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1043:54: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7480);
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
					// 1044:5: -> property_reference(component=$component.textpname=$pname.textf=$field)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1047:1: propertyField : ( ^( LBRACKET index= number ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\");
	public final UnparseBLESS3.propertyField_return propertyField() throws RecognitionException {
		UnparseBLESS3.propertyField_return retval = new UnparseBLESS3.propertyField_return();
		retval.start = input.LT(1);

		BAST var=null;
		BAST pf=null;
		TreeRuleReturnScope index =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1048:3: ( ^( LBRACKET index= number ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\")
			int alt83=5;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==LBRACKET) ) {
				int LA83_1 = input.LA(2);
				if ( (LA83_1==DOWN) ) {
					int LA83_3 = input.LA(3);
					if ( (LA83_3==ID) ) {
						alt83=2;
					}
					else if ( (LA83_3==INTEGER_LIT||LA83_3==REAL_LIT) ) {
						alt83=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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
			else if ( (LA83_0==DOT) ) {
				int LA83_2 = input.LA(2);
				if ( (LA83_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case ID:
						{
						alt83=3;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt83=4;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt83=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
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

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 2, input);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1049:3: ^( LBRACKET index= number )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7522); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_number_in_propertyField7526);
					index=number();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1050:5: -> index(i=$index.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (index!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(index.start),input.getTreeAdaptor().getTokenStopIndex(index.start))):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1052:3: ^( LBRACKET var= ID )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7551); 
					match(input, Token.DOWN, null); 
					var=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7555); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1053:5: -> index(i=$var.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (var!=null?var.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1055:3: ^( DOT pf= ID )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7580); 
					match(input, Token.DOWN, null); 
					pf=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7584); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1056:5: -> template(pf=$pf.text) \".<pf>\"
					{
						retval.st = new StringTemplate(templateLib, ".<pf>",new STAttrMap().put("pf", (pf!=null?pf.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1058:3: ^( DOT LITERAL_upper_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7611); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7613); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1059:5: -> template( \".upper_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".upper_bound");
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:3: ^( DOT LITERAL_lower_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7637); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7639); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1062:5: -> template( \".lower_bound\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1069:1: actionSubclause : ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1070:3: ( ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:3: ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,ACTION_SUBCLAUSE,FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause7674); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:23: (no_proof= DO_NOT_PROVE )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==DO_NOT_PROVE) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:24: no_proof= DO_NOT_PROVE
					{
					no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7679); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:48: (tc= throwsClause )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==LITERAL_throws) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:49: tc= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7686);
					tc=throwsClause();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:67: (ac= assertClause )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==LITERAL_assert) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1071:68: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7693);
					ac=assertClause();
					state._fsp--;

					}
					break;

			}

			match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7704); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1072:20: (precondition= assertion )?
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==ASSERTION||(LA87_0 >= ASSERTION_ENUMERATION && LA87_0 <= ASSERTION_FUNCTION)) ) {
					alt87=1;
				}
				switch (alt87) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1072:21: precondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7709);
						precondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7721); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1073:21: (postcondition= assertion )?
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==ASSERTION||(LA88_0 >= ASSERTION_ENUMERATION && LA88_0 <= ASSERTION_FUNCTION)) ) {
					alt88=1;
				}
				switch (alt88) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1073:22: postcondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7726);
						postcondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7739); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1074:26: (invariant= assertion )?
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==ASSERTION||(LA89_0 >= ASSERTION_ENUMERATION && LA89_0 <= ASSERTION_FUNCTION)) ) {
					alt89=1;
				}
				switch (alt89) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1074:27: invariant= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause7744);
						invariant=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7757);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1076:3: -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1081:1: throwsClause : ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions);
	public final UnparseBLESS3.throwsClause_return throwsClause() throws RecognitionException {
		UnparseBLESS3.throwsClause_return retval = new UnparseBLESS3.throwsClause_return();
		retval.start = input.LT(1);

		BAST exceptions=null;
		List<Object> list_exceptions=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1082:3: ( ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:2: ^( LITERAL_throws (exceptions+= ID )+ )
			{
			match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7830); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:30: (exceptions+= ID )+
			int cnt90=0;
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==ID) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:30: exceptions+= ID
					{
					exceptions=(BAST)match(input,ID,FOLLOW_ID_in_throwsClause7834); 
					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
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
			// 1084:4: -> throws_clause(ex=$exceptions)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:1: assertClause : ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions);
	public final UnparseBLESS3.assertClause_return assertClause() throws RecognitionException {
		UnparseBLESS3.assertClause_return retval = new UnparseBLESS3.assertClause_return();
		retval.start = input.LT(1);

		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1088:3: ( ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1089:3: ^( LITERAL_assert (assertions+= namedAssertion )+ )
			{
			match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7867); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1089:31: (assertions+= namedAssertion )+
			int cnt91=0;
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==ASSERTION||(LA91_0 >= ASSERTION_ENUMERATION && LA91_0 <= ASSERTION_FUNCTION)) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1089:31: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7871);
					assertions=namedAssertion();
					state._fsp--;

					if (list_assertions==null) list_assertions=new ArrayList<Object>();
					list_assertions.add(assertions.getTemplate());
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
			// 1090:5: -> assert_clause(a=$assertions)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1093:1: existentialLatticeQuantification : ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st);
	public final UnparseBLESS3.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.existentialLatticeQuantification_return retval = new UnparseBLESS3.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope qv =null;
		TreeRuleReturnScope actions =null;
		TreeRuleReturnScope cc =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1094:3: ( ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:3: ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification7904); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:13: (qv= quantifiedVariables )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LITERAL_declare) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:15: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification7910);
					qv=quantifiedVariables();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification7917);
			actions=behaviorActions();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification7919); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:72: (cc= catchClause )?
			int alt93=2;
			int LA93_0 = input.LA(1);
			if ( (LA93_0==LITERAL_catch) ) {
				alt93=1;
			}
			switch (alt93) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1095:74: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification7925);
					cc=catchClause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1096:5: -> elq(v=$qv.stba=$actions.stcc=$cc.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1099:1: quantifiedVariables : ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs);
	public final UnparseBLESS3.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		UnparseBLESS3.quantifiedVariables_return retval = new UnparseBLESS3.quantifiedVariables_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1100:3: ( ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1101:3: ^( LITERAL_declare (decs+= variableDeclaration )+ )
			{
			match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7970); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1101:26: (decs+= variableDeclaration )+
			int cnt94=0;
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==VARIABLE_DECLARATION) ) {
					alt94=1;
				}

				switch (alt94) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1101:26: decs+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7974);
					decs=variableDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt94 >= 1 ) break loop94;
					EarlyExitException eee = new EarlyExitException(94, input);
					throw eee;
				}
				cnt94++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1102:5: -> quantified_variables(bv=$decs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1105:1: variableDeclaration : ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1106:3: ( ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1107:3: ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? )
			{
			match(input,VARIABLE_DECLARATION,FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration8006); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variable_in_variableDeclaration8010);
			v=variable();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1107:38: ( ^( ASSIGN exp= expression ) )?
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==ASSIGN) ) {
				alt95=1;
			}
			switch (alt95) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1107:40: ^( ASSIGN exp= expression )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration8016); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_variableDeclaration8020);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1107:71: (a= assertion )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==ASSERTION||(LA96_0 >= ASSERTION_ENUMERATION && LA96_0 <= ASSERTION_FUNCTION)) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1107:71: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration8029);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:7: (nv= LITERAL_nonvolatile )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==LITERAL_nonvolatile) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:7: nv= LITERAL_nonvolatile
					{
					nv=(BAST)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration8039); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:31: (sh= LITERAL_shared )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LITERAL_shared) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:31: sh= LITERAL_shared
					{
					sh=(BAST)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration8044); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:49: (c= LITERAL_constant )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LITERAL_constant) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:49: c= LITERAL_constant
					{
					c=(BAST)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration8049); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:70: (sp= LITERAL_spread )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==LITERAL_spread) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:70: sp= LITERAL_spread
					{
					sp=(BAST)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration8054); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:88: (f= LITERAL_final )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LITERAL_final) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1108:88: f= LITERAL_final
					{
					f=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration8059); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1109:5: -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1112:1: catchClause : ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct);
	public final UnparseBLESS3.catchClause_return catchClause() throws RecognitionException {
		UnparseBLESS3.catchClause_return retval = new UnparseBLESS3.catchClause_return();
		retval.start = input.LT(1);

		List<Object> list_cct=null;
		RuleReturnScope cct = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1113:3: ( ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1114:2: ^( LITERAL_catch (cct+= catchClauseTerm )+ )
			{
			match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause8119); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1114:22: (cct+= catchClauseTerm )+
			int cnt102=0;
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==LPAREN) ) {
					alt102=1;
				}

				switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1114:22: cct+= catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause8123);
					cct=catchClauseTerm();
					state._fsp--;

					if (list_cct==null) list_cct=new ArrayList<Object>();
					list_cct.add(cct.getTemplate());
					}
					break;

				default :
					if ( cnt102 >= 1 ) break loop102;
					EarlyExitException eee = new EarlyExitException(102, input);
					throw eee;
				}
				cnt102++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1115:4: -> catch_clause(cct=$cct)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1118:1: catchClauseTerm : ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st));
	public final UnparseBLESS3.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		UnparseBLESS3.catchClauseTerm_return retval = new UnparseBLESS3.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST colon=null;
		BAST exceptions=null;
		List<Object> list_exceptions=null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1119:3: ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st))
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LPAREN) ) {
				int LA104_1 = input.LA(2);
				if ( (LA104_1==DOWN) ) {
					int LA104_2 = input.LA(3);
					if ( (LA104_2==LITERAL_all) ) {
						alt104=2;
					}
					else if ( (LA104_2==ID) ) {
						alt104=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 104, 2, input);
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
							new NoViableAltException("", 104, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}

			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:3: ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8155); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:23: (exceptions+= ID )+
					int cnt103=0;
					loop103:
					while (true) {
						int alt103=2;
						int LA103_0 = input.LA(1);
						if ( (LA103_0==ID) ) {
							alt103=1;
						}

						switch (alt103) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:23: exceptions+= ID
							{
							exceptions=(BAST)match(input,ID,FOLLOW_ID_in_catchClauseTerm8159); 
							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt103 >= 1 ) break loop103;
							EarlyExitException eee = new EarlyExitException(103, input);
							throw eee;
						}
						cnt103++;
					}

					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8165); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8169);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8171); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1121:5: -> catch_clause_term(ei=$exceptionsba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term",new STAttrMap().put("ei", list_exceptions).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1123:3: ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8201); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm8203); 
					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8207); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8211);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8213); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1124:5: -> catch_clause_term_all(ba=$act.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:1: behaviorActions : ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st});
	public final UnparseBLESS3.behaviorActions_return behaviorActions() throws RecognitionException {
		UnparseBLESS3.behaviorActions_return retval = new UnparseBLESS3.behaviorActions_return();
		retval.start = input.LT(1);

		List<Object> list_aa=null;
		TreeRuleReturnScope a =null;
		RuleReturnScope aa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1128:3: ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st})
			int alt107=3;
			switch ( input.LA(1) ) {
			case SEMICOLON:
				{
				alt107=1;
				}
				break;
			case AMPERSAND:
				{
				alt107=2;
				}
				break;
			case ACTION:
				{
				alt107=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 107, 0, input);
				throw nvae;
			}
			switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:3: ^( SEMICOLON (aa+= assertedAction )+ )
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions8245); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:18: (aa+= assertedAction )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1129:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8249);
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
					// 1130:5: -> sequential_composition(f=$aa)
					{
						retval.st = templateLib.getInstanceOf("sequential_composition",new STAttrMap().put("f", list_aa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1132:3: ^( AMPERSAND (aa+= assertedAction )+ )
					{
					match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions8275); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1132:18: (aa+= assertedAction )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1132:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8279);
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
					// 1133:5: -> concurrent_composition(g=$aa)
					{
						retval.st = templateLib.getInstanceOf("concurrent_composition",new STAttrMap().put("g", list_aa));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1135:3: a= assertedAction
					{
					pushFollow(FOLLOW_assertedAction_in_behaviorActions8305);
					a=assertedAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1136:5: -> {$a.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:1: assertedAction : ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st);
	public final UnparseBLESS3.assertedAction_return assertedAction() throws RecognitionException {
		UnparseBLESS3.assertedAction_return retval = new UnparseBLESS3.assertedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pre =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope post =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:3: ( ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1141:3: ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) )
			{
			match(input,ACTION,FOLLOW_ACTION_in_assertedAction8330); 
			match(input, Token.DOWN, null); 
			match(input,P,FOLLOW_P_in_assertedAction8334); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1141:21: (pre= assertion )?
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==ASSERTION||(LA108_0 >= ASSERTION_ENUMERATION && LA108_0 <= ASSERTION_FUNCTION)) ) {
					alt108=1;
				}
				switch (alt108) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1141:21: pre= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8338);
						pre=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,S,FOLLOW_S_in_assertedAction8345); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_action_in_assertedAction8349);
			s=action();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,Q,FOLLOW_Q_in_assertedAction8355); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1141:60: (post= assertion )?
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==ASSERTION||(LA109_0 >= ASSERTION_ENUMERATION && LA109_0 <= ASSERTION_FUNCTION)) ) {
					alt109=1;
				}
				switch (alt109) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1141:60: post= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8359);
						post=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1142:5: -> asserted_action(p=$pre.sts=$s.stq=$post.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1145:1: action : (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1145:7: (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st})
			int alt110=7;
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
			case SUBPROGRAM_INVOCATION:
				{
				alt110=1;
				}
				break;
			case LITERAL_if:
				{
				alt110=2;
				}
				break;
			case LITERAL_while:
				{
				alt110=3;
				}
				break;
			case LITERAL_for:
				{
				alt110=4;
				}
				break;
			case LITERAL_do:
				{
				alt110=5;
				}
				break;
			case LCURLY:
				{
				alt110=6;
				}
				break;
			case LITERAL_forall:
				{
				alt110=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:3: ba= basicAction
					{
					pushFollow(FOLLOW_basicAction_in_action8401);
					ba=basicAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1147:5: -> {$ba.st}
					{
						retval.st = (ba!=null?((StringTemplate)ba.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1148:5: if_fi= alternative
					{
					pushFollow(FOLLOW_alternative_in_action8417);
					if_fi=alternative();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1149:5: -> {$if_fi.st}
					{
						retval.st = (if_fi!=null?((StringTemplate)if_fi.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1150:5: wl= whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_action8433);
					wl=whileLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1151:5: -> {$wl.st}
					{
						retval.st = (wl!=null?((StringTemplate)wl.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:5: fl= forLoop
					{
					pushFollow(FOLLOW_forLoop_in_action8449);
					fl=forLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1153:5: -> {$fl.st}
					{
						retval.st = (fl!=null?((StringTemplate)fl.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1154:5: du= doUntilLoop
					{
					pushFollow(FOLLOW_doUntilLoop_in_action8465);
					du=doUntilLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1155:5: -> {$du.st}
					{
						retval.st = (du!=null?((StringTemplate)du.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1156:5: elq= existentialLatticeQuantification
					{
					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8481);
					elq=existentialLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1157:5: -> {$elq.st}
					{
						retval.st = (elq!=null?((StringTemplate)elq.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:5: ulq= universalLatticeQuantification
					{
					pushFollow(FOLLOW_universalLatticeQuantification_in_action8498);
					ulq=universalLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1159:5: -> {$ulq.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1162:1: basicAction : (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| ^( LITERAL_setmode mode= ID ) -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1163:3: (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| ^( LITERAL_setmode mode= ID ) -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st})
			int alt111=8;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt111=1;
				}
				break;
			case ASSIGN:
				{
				int LA111_2 = input.LA(2);
				if ( (LA111_2==DOWN) ) {
					int LA111_8 = input.LA(3);
					if ( (LA111_8==COMMA) ) {
						alt111=7;
					}
					else if ( (LA111_8==ID||LA111_8==QUESTION||LA111_8==TICK) ) {
						alt111=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 111, 8, input);
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
							new NoViableAltException("", 111, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_setmode:
				{
				alt111=3;
				}
				break;
			case LITERAL_when:
				{
				alt111=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt111=5;
				}
				break;
			case PORT_INPUT:
			case PORT_OUTPUT:
			case SUBPROGRAM_INVOCATION:
				{
				alt111=6;
				}
				break;
			case LITERAL_exception:
				{
				alt111=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}
			switch (alt111) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1164:3: sk= LITERAL_skip
					{
					sk=(BAST)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8527); 
					// TEMPLATE REWRITE
					// 1165:4: -> {%{$sk.text}}
					{
						retval.st = new StringTemplate(templateLib,(sk!=null?sk.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1166:5: ass= assignment
					{
					pushFollow(FOLLOW_assignment_in_basicAction8543);
					ass=assignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1167:5: -> {$ass.st}
					{
						retval.st = (ass!=null?((StringTemplate)ass.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1168:5: ^( LITERAL_setmode mode= ID )
					{
					match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8559); 
					match(input, Token.DOWN, null); 
					mode=(BAST)match(input,ID,FOLLOW_ID_in_basicAction8563); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1169:5: -> template(mode=$mode.text) \"setmode <mode>\"
					{
						retval.st = new StringTemplate(templateLib, "setmode <mode>",new STAttrMap().put("mode", (mode!=null?mode.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1170:5: wt= whenThrow
					{
					pushFollow(FOLLOW_whenThrow_in_basicAction8589);
					wt=whenThrow();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1171:5: -> {$wt.st}
					{
						retval.st = (wt!=null?((StringTemplate)wt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1172:5: co= combinableOperation
					{
					pushFollow(FOLLOW_combinableOperation_in_basicAction8605);
					co=combinableOperation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1173:5: -> {$co.st}
					{
						retval.st = (co!=null?((StringTemplate)co.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1174:5: ca= communicationAction
					{
					pushFollow(FOLLOW_communicationAction_in_basicAction8621);
					ca=communicationAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1175:5: -> {$ca.st}
					{
						retval.st = (ca!=null?((StringTemplate)ca.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1176:5: sa= simultaneousAssignment
					{
					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8638);
					sa=simultaneousAssignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1177:5: -> {$sa.st}
					{
						retval.st = (sa!=null?((StringTemplate)sa.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1178:5: ie= issueException
					{
					pushFollow(FOLLOW_issueException_in_basicAction8654);
					ie=issueException();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1179:5: -> {$ie.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1182:1: issueException : ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text);
	public final UnparseBLESS3.issueException_return issueException() throws RecognitionException {
		UnparseBLESS3.issueException_return retval = new UnparseBLESS3.issueException_return();
		retval.start = input.LT(1);

		BAST exception=null;
		BAST message=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1183:3: ( ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1184:3: ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException8680); 
			match(input, Token.DOWN, null); 
			exception=(BAST)match(input,ID,FOLLOW_ID_in_issueException8684); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1184:44: (message= AADL_STRING_LITERAL )?
			int alt112=2;
			int LA112_0 = input.LA(1);
			if ( (LA112_0==AADL_STRING_LITERAL) ) {
				alt112=1;
			}
			switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1184:44: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException8688); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1185:5: -> issue_exception(ex=$exception.textm=$message.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1188:1: assignment : ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st);
	public final UnparseBLESS3.assignment_return assignment() throws RecognitionException {
		UnparseBLESS3.assignment_return retval = new UnparseBLESS3.assignment_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1189:3: ( ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1190:3: ^( ASSIGN n= nameTick e= expressionOrAny )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8728); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_nameTick_in_assignment8732);
			n=nameTick();
			state._fsp--;

			pushFollow(FOLLOW_expressionOrAny_in_assignment8736);
			e=expressionOrAny();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1191:5: -> assignment(nt=$n.steort=$e.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1194:1: nameTick : ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st});
	public final UnparseBLESS3.nameTick_return nameTick() throws RecognitionException {
		UnparseBLESS3.nameTick_return retval = new UnparseBLESS3.nameTick_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1195:3: ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st})
			int alt113=2;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==TICK) ) {
				int LA113_1 = input.LA(2);
				if ( (LA113_1==DOWN) ) {
					int LA113_3 = input.LA(3);
					if ( (LA113_3==ID) ) {
						int LA113_4 = input.LA(4);
						if ( (LA113_4==LITERAL_count||LA113_4==LITERAL_fresh||LA113_4==LITERAL_updated) ) {
							alt113=2;
						}
						else if ( ((LA113_4 >= DOWN && LA113_4 <= UP)) ) {
							alt113=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 113, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA113_3==QUESTION||LA113_3==TICK) ) {
						alt113=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 113, 3, input);
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
							new NoViableAltException("", 113, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA113_0==ID||LA113_0==QUESTION) ) {
				alt113=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}

			switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1196:3: ^( TICK vn= valueName )
					{
					match(input,TICK,FOLLOW_TICK_in_nameTick8775); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_nameTick8779);
					vn=valueName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1197:5: -> name_tick(vn=$vn.st)
					{
						retval.st = templateLib.getInstanceOf("name_tick",new STAttrMap().put("vn", (vn!=null?((StringTemplate)vn.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1199:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_nameTick8804);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1200:5: -> {$vn.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1203:1: expressionOrAny : (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}});
	public final UnparseBLESS3.expressionOrAny_return expressionOrAny() throws RecognitionException {
		UnparseBLESS3.expressionOrAny_return retval = new UnparseBLESS3.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST any=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1204:3: (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}})
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==LITERAL_all||LA114_0==LITERAL_exists||LA114_0==LITERAL_iff||LA114_0==LITERAL_implies||LA114_0==LITERAL_numberof||LA114_0==LITERAL_product||LA114_0==LITERAL_sum) ) {
				alt114=1;
			}
			else if ( (LA114_0==LITERAL_any) ) {
				alt114=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1205:3: exp= expression
					{
					pushFollow(FOLLOW_expression_in_expressionOrAny8831);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1206:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1208:3: any= LITERAL_any
					{
					any=(BAST)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8851); 
					// TEMPLATE REWRITE
					// 1209:4: -> {%{$any.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1212:1: simultaneousAssignment : ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs);
	public final UnparseBLESS3.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		UnparseBLESS3.simultaneousAssignment_return retval = new UnparseBLESS3.simultaneousAssignment_return();
		retval.start = input.LT(1);

		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1213:3: ( ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:3: ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8877); 
			match(input, Token.DOWN, null); 
			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8881); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:25: (lhs+= nameTick )+
			int cnt115=0;
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==ID||LA115_0==QUESTION||LA115_0==TICK) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:25: lhs+= nameTick
					{
					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8885);
					lhs=nameTick();
					state._fsp--;

					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTemplate());
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

			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8892); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:51: (rhs+= expressionOrAny )+
			int cnt116=0;
			loop116:
			while (true) {
				int alt116=2;
				int LA116_0 = input.LA(1);
				if ( (LA116_0==LITERAL_all||LA116_0==LITERAL_any||LA116_0==LITERAL_exists||LA116_0==LITERAL_iff||LA116_0==LITERAL_implies||LA116_0==LITERAL_numberof||LA116_0==LITERAL_product||LA116_0==LITERAL_sum) ) {
					alt116=1;
				}

				switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:51: rhs+= expressionOrAny
					{
					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8896);
					rhs=expressionOrAny();
					state._fsp--;

					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTemplate());
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

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1215:5: -> simultaneous_assignment(l=$lhsr=$rhs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1218:1: whenThrow : ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text);
	public final UnparseBLESS3.whenThrow_return whenThrow() throws RecognitionException {
		UnparseBLESS3.whenThrow_return retval = new UnparseBLESS3.whenThrow_return();
		retval.start = input.LT(1);

		BAST excep=null;
		BAST message=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1218:10: ( ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1219:3: ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8936); 
			match(input, Token.DOWN, null); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8938); 
			pushFollow(FOLLOW_expression_in_whenThrow8942);
			exp=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8944); 
			match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8946); 
			excep=(BAST)match(input,ID,FOLLOW_ID_in_whenThrow8950); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1220:14: (message= AADL_STRING_LITERAL )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==AADL_STRING_LITERAL) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1220:14: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8962); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1221:5: -> when_throw(e=$exp.sti=$excep.textm=$message.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1224:1: combinableOperation : ( ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID ) -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)| ^(fo= LITERAL_fetchor target= ID bool= expression result= ID ) -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)| ^(fan= LITERAL_fetchand target= ID bool= expression result= ID ) -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)| ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID ) -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)| ^(sw= LITERAL_swap target= ID reference= ID result= ID ) -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text));
	public final UnparseBLESS3.combinableOperation_return combinableOperation() throws RecognitionException {
		UnparseBLESS3.combinableOperation_return retval = new UnparseBLESS3.combinableOperation_return();
		retval.start = input.LT(1);

		BAST fa=null;
		BAST target=null;
		BAST result=null;
		BAST fo=null;
		BAST fan=null;
		BAST fx=null;
		BAST sw=null;
		BAST reference=null;
		TreeRuleReturnScope arithmetic =null;
		TreeRuleReturnScope bool =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1224:20: ( ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID ) -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)| ^(fo= LITERAL_fetchor target= ID bool= expression result= ID ) -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)| ^(fan= LITERAL_fetchand target= ID bool= expression result= ID ) -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)| ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID ) -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)| ^(sw= LITERAL_swap target= ID reference= ID result= ID ) -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text))
			int alt118=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt118=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt118=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt118=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt118=4;
				}
				break;
			case LITERAL_swap:
				{
				alt118=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}
			switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1225:3: ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID )
					{
					fa=(BAST)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation9008); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9012); 
					pushFollow(FOLLOW_expression_in_combinableOperation9016);
					arithmetic=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9020); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1226:4: -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fa!=null?fa.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (arithmetic!=null?((StringTemplate)arithmetic.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1228:3: ^(fo= LITERAL_fetchor target= ID bool= expression result= ID )
					{
					fo=(BAST)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation9062); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9066); 
					pushFollow(FOLLOW_expression_in_combinableOperation9070);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9074); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1229:4: -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fo!=null?fo.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1231:3: ^(fan= LITERAL_fetchand target= ID bool= expression result= ID )
					{
					fan=(BAST)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation9116); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9120); 
					pushFollow(FOLLOW_expression_in_combinableOperation9124);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9128); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1232:4: -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fan!=null?fan.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1234:3: ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID )
					{
					fx=(BAST)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation9170); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9174); 
					pushFollow(FOLLOW_expression_in_combinableOperation9178);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9182); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1235:4: -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fx!=null?fx.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1237:3: ^(sw= LITERAL_swap target= ID reference= ID result= ID )
					{
					sw=(BAST)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation9224); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9228); 
					reference=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9232); 
					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9236); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1238:4: -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (sw!=null?sw.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (reference!=null?reference.getText():null)).put("r", (result!=null?result.getText():null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1241:1: communicationAction : (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st});
	public final UnparseBLESS3.communicationAction_return communicationAction() throws RecognitionException {
		UnparseBLESS3.communicationAction_return retval = new UnparseBLESS3.communicationAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pc =null;
		TreeRuleReturnScope po =null;
		TreeRuleReturnScope pi =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1241:20: (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st})
			int alt119=3;
			switch ( input.LA(1) ) {
			case SUBPROGRAM_INVOCATION:
				{
				alt119=1;
				}
				break;
			case PORT_OUTPUT:
				{
				alt119=2;
				}
				break;
			case PORT_INPUT:
				{
				alt119=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}
			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1242:3: pc= subprogramCall
					{
					pushFollow(FOLLOW_subprogramCall_in_communicationAction9282);
					pc=subprogramCall();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1243:5: -> {$pc.st}
					{
						retval.st = (pc!=null?((StringTemplate)pc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1245:3: po= portOutput
					{
					pushFollow(FOLLOW_portOutput_in_communicationAction9300);
					po=portOutput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1246:5: -> {$po.st}
					{
						retval.st = (po!=null?((StringTemplate)po.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1248:3: pi= portInput
					{
					pushFollow(FOLLOW_portInput_in_communicationAction9318);
					pi=portInput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1249:5: -> {$pi.st}
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


	public static class computation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "computation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1252:1: computation : ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component= QCREF )+ ) )? ) -> computation(lb=$lb.stub=$ub.stc=$component);
	public final UnparseBLESS3.computation_return computation() throws RecognitionException {
		UnparseBLESS3.computation_return retval = new UnparseBLESS3.computation_return();
		retval.start = input.LT(1);

		BAST component=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1253:3: ( ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component= QCREF )+ ) )? ) -> computation(lb=$lb.stub=$ub.stc=$component))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:3: ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component= QCREF )+ ) )? )
			{
			match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation9344); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_behaviorTime_in_computation9348);
			lb=behaviorTime();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:44: (ub= behaviorTime )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==ID||LA120_0==LPAREN||(LA120_0 >= QUANTITY && LA120_0 <= QUESTION)||LA120_0==TICK) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:44: ub= behaviorTime
					{
					pushFollow(FOLLOW_behaviorTime_in_computation9352);
					ub=behaviorTime();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:59: ( ^( LITERAL_binding (component= QCREF )+ ) )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==LITERAL_binding) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:61: ^( LITERAL_binding (component= QCREF )+ )
					{
					match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation9359); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:89: (component= QCREF )+
					int cnt121=0;
					loop121:
					while (true) {
						int alt121=2;
						int LA121_0 = input.LA(1);
						if ( (LA121_0==QCREF) ) {
							alt121=1;
						}

						switch (alt121) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:89: component= QCREF
							{
							component=(BAST)match(input,QCREF,FOLLOW_QCREF_in_computation9363); 
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

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1255:5: -> computation(lb=$lb.stub=$ub.stc=$component)
			{
				retval.st = templateLib.getInstanceOf("computation",new STAttrMap().put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("c", component));
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
	// $ANTLR end "computation"


	public static class portOutput_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portOutput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1258:1: portOutput : ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st);
	public final UnparseBLESS3.portOutput_return portOutput() throws RecognitionException {
		UnparseBLESS3.portOutput_return retval = new UnparseBLESS3.portOutput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope be =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1259:3: ( ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1260:3: ^( PORT_OUTPUT pn= ID (be= expression )? )
			{
			match(input,PORT_OUTPUT,FOLLOW_PORT_OUTPUT_in_portOutput9414); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portOutput9418); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1260:26: (be= expression )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==LITERAL_all||LA123_0==LITERAL_exists||LA123_0==LITERAL_iff||LA123_0==LITERAL_implies||LA123_0==LITERAL_numberof||LA123_0==LITERAL_product||LA123_0==LITERAL_sum) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1260:26: be= expression
					{
					pushFollow(FOLLOW_expression_in_portOutput9422);
					be=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1261:5: -> port_output(o=$pn.textbe=$be.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1264:1: portInput : ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st);
	public final UnparseBLESS3.portInput_return portInput() throws RecognitionException {
		UnparseBLESS3.portInput_return retval = new UnparseBLESS3.portInput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope n =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:3: ( ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1266:3: ^( PORT_INPUT pn= ID n= valueName )
			{
			match(input,PORT_INPUT,FOLLOW_PORT_INPUT_in_portInput9464); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portInput9468); 
			pushFollow(FOLLOW_valueName_in_portInput9472);
			n=valueName();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1267:5: -> port_input(i=$pn.textn=$n.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1271:1: subprogramCall : ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st);
	public final UnparseBLESS3.subprogramCall_return subprogramCall() throws RecognitionException {
		UnparseBLESS3.subprogramCall_return retval = new UnparseBLESS3.subprogramCall_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope fal =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1272:3: ( ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1273:3: ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? )
			{
			match(input,SUBPROGRAM_INVOCATION,FOLLOW_SUBPROGRAM_INVOCATION_in_subprogramCall9516); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_subprogramCall9520); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1273:37: (fal= formalActualList )?
			int alt124=2;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==AADL_STRING_LITERAL||LA124_0==COLON||LA124_0==COMMA||LA124_0==ID||LA124_0==LITERAL_false||LA124_0==LITERAL_null||LA124_0==LITERAL_true||LA124_0==LPAREN||(LA124_0 >= QUANTITY && LA124_0 <= QUESTION)||LA124_0==TICK) ) {
				alt124=1;
			}
			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1273:37: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall9524);
					fal=formalActualList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1274:5: -> function_call(f=$id.textpl=$fal.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1278:1: formalActualList : ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st});
	public final UnparseBLESS3.formalActualList_return formalActualList() throws RecognitionException {
		UnparseBLESS3.formalActualList_return retval = new UnparseBLESS3.formalActualList_return();
		retval.start = input.LT(1);

		List<Object> list_fa=null;
		TreeRuleReturnScope s =null;
		RuleReturnScope fa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1279:3: ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st})
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==COMMA) ) {
				alt126=1;
			}
			else if ( (LA126_0==AADL_STRING_LITERAL||LA126_0==COLON||LA126_0==ID||LA126_0==LITERAL_false||LA126_0==LITERAL_null||LA126_0==LITERAL_true||LA126_0==LPAREN||(LA126_0 >= QUANTITY && LA126_0 <= QUESTION)||LA126_0==TICK) ) {
				alt126=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 126, 0, input);
				throw nvae;
			}

			switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1280:3: ^( COMMA (fa+= formalActual )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_formalActualList9569); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1280:14: (fa+= formalActual )+
					int cnt125=0;
					loop125:
					while (true) {
						int alt125=2;
						int LA125_0 = input.LA(1);
						if ( (LA125_0==AADL_STRING_LITERAL||LA125_0==COLON||LA125_0==ID||LA125_0==LITERAL_false||LA125_0==LITERAL_null||LA125_0==LITERAL_true||LA125_0==LPAREN||(LA125_0 >= QUANTITY && LA125_0 <= QUESTION)||LA125_0==TICK) ) {
							alt125=1;
						}

						switch (alt125) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1280:14: fa+= formalActual
							{
							pushFollow(FOLLOW_formalActual_in_formalActualList9573);
							fa=formalActual();
							state._fsp--;

							if (list_fa==null) list_fa=new ArrayList<Object>();
							list_fa.add(fa.getTemplate());
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

					// TEMPLATE REWRITE
					// 1281:5: -> formal_actual_list(ns=$fa)
					{
						retval.st = templateLib.getInstanceOf("formal_actual_list",new STAttrMap().put("ns", list_fa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1283:3: s= formalActual
					{
					pushFollow(FOLLOW_formalActual_in_formalActualList9599);
					s=formalActual();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1284:5: -> {$s.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1287:1: formalActual : ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter );
	public final UnparseBLESS3.formalActual_return formalActual() throws RecognitionException {
		UnparseBLESS3.formalActual_return retval = new UnparseBLESS3.formalActual_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;
		TreeRuleReturnScope spp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1288:3: ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==COLON) ) {
				alt127=1;
			}
			else if ( (LA127_0==AADL_STRING_LITERAL||LA127_0==ID||LA127_0==LITERAL_false||LA127_0==LITERAL_null||LA127_0==LITERAL_true||LA127_0==LPAREN||(LA127_0 >= QUANTITY && LA127_0 <= QUESTION)||LA127_0==TICK) ) {
				alt127=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1289:3: ^( COLON formal= ID actual= subProgramParameter )
					{
					match(input,COLON,FOLLOW_COLON_in_formalActual9628); 
					match(input, Token.DOWN, null); 
					formal=(BAST)match(input,ID,FOLLOW_ID_in_formalActual9632); 
					pushFollow(FOLLOW_subProgramParameter_in_formalActual9636);
					actual=subProgramParameter();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1290:5: -> formal_actual(f=$formal.textap=$actual.st)
					{
						retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:3: spp= subProgramParameter
					{
					pushFollow(FOLLOW_subProgramParameter_in_formalActual9666);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1295:1: subProgramParameter : (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.subProgramParameter_return subProgramParameter() throws RecognitionException {
		UnparseBLESS3.subProgramParameter_return retval = new UnparseBLESS3.subProgramParameter_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1295:20: (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt128=3;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt128=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt128=2;
				}
				break;
			case LPAREN:
				{
				alt128=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1296:2: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_subProgramParameter9680);
					v=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1297:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1298:4: c= constant
					{
					pushFollow(FOLLOW_constant_in_subProgramParameter9695);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1299:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1300:4: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter9710);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1301:5: -> {$ps.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1304:1: alternative : ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt);
	public final UnparseBLESS3.alternative_return alternative() throws RecognitionException {
		UnparseBLESS3.alternative_return retval = new UnparseBLESS3.alternative_return();
		retval.start = input.LT(1);

		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:3: ( ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1306:3: ^( LITERAL_if (alt+= guardedAction )+ )
			{
			match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative9738); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1306:20: (alt+= guardedAction )+
			int cnt129=0;
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==GUARD) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1306:20: alt+= guardedAction
					{
					pushFollow(FOLLOW_guardedAction_in_alternative9742);
					alt=guardedAction();
					state._fsp--;

					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTemplate());
					}
					break;

				default :
					if ( cnt129 >= 1 ) break loop129;
					EarlyExitException eee = new EarlyExitException(129, input);
					throw eee;
				}
				cnt129++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1307:5: -> alternative(gf=$alt)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1310:1: guardedAction : ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st);
	public final UnparseBLESS3.guardedAction_return guardedAction() throws RecognitionException {
		UnparseBLESS3.guardedAction_return retval = new UnparseBLESS3.guardedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope aa =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:3: ( ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1312:3: ^( GUARD exp= expression aa= assertedAction )
			{
			match(input,GUARD,FOLLOW_GUARD_in_guardedAction9779); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_guardedAction9783);
			exp=expression();
			state._fsp--;

			pushFollow(FOLLOW_assertedAction_in_guardedAction9787);
			aa=assertedAction();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1313:5: -> guarded_action(be=$exp.stba=$aa.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1316:1: whileLoop : ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.whileLoop_return whileLoop() throws RecognitionException {
		UnparseBLESS3.whileLoop_return retval = new UnparseBLESS3.whileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:3: ( ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1318:3: ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop9826); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileLoop9830);
			be=expression();
			state._fsp--;

			match(input,INVARIANT,FOLLOW_INVARIANT_in_whileLoop9834); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1318:50: (inv= assertion )?
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==ASSERTION||(LA130_0 >= ASSERTION_ENUMERATION && LA130_0 <= ASSERTION_FUNCTION)) ) {
					alt130=1;
				}
				switch (alt130) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1318:50: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop9838);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_whileLoop9845); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1318:75: (bd= assertion )?
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==ASSERTION||(LA131_0 >= ASSERTION_ENUMERATION && LA131_0 <= ASSERTION_FUNCTION)) ) {
					alt131=1;
				}
				switch (alt131) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1318:75: bd= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop9849);
						bd=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop9863);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1320:5: -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1323:1: forLoop : ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st);
	public final UnparseBLESS3.forLoop_return forLoop() throws RecognitionException {
		UnparseBLESS3.forLoop_return retval = new UnparseBLESS3.forLoop_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1324:3: ( ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1325:3: ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop9912); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_forLoop9916); 
			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop9920); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_forLoop9924);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forLoop9928);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_forLoop9934); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1325:84: (inv= assertion )?
				int alt132=2;
				int LA132_0 = input.LA(1);
				if ( (LA132_0==ASSERTION||(LA132_0 >= ASSERTION_ENUMERATION && LA132_0 <= ASSERTION_FUNCTION)) ) {
					alt132=1;
				}
				switch (alt132) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1325:84: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_forLoop9938);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_forLoop9952);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1327:5: -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1330:1: doUntilLoop : ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.doUntilLoop_return doUntilLoop() throws RecognitionException {
		UnparseBLESS3.doUntilLoop_return retval = new UnparseBLESS3.doUntilLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:3: ( ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:3: ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop10007); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop10011); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_doUntilLoop10015);
			be=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_doUntilLoop10021); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:66: (inv= assertion )?
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==ASSERTION||(LA133_0 >= ASSERTION_ENUMERATION && LA133_0 <= ASSERTION_FUNCTION)) ) {
					alt133=1;
				}
				switch (alt133) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:66: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop10025);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_doUntilLoop10032); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:91: (bd= assertion )?
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==ASSERTION||(LA134_0 >= ASSERTION_ENUMERATION && LA134_0 <= ASSERTION_FUNCTION)) ) {
					alt134=1;
				}
				switch (alt134) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1332:91: bd= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop10036);
						bd=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop10049);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1334:5: -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1337:1: universalLatticeQuantification : ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st);
	public final UnparseBLESS3.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.universalLatticeQuantification_return retval = new UnparseBLESS3.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST lv=null;
		List<Object> list_lv=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1338:3: ( ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:3: ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification10102); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:23: (lv+= ID )+
			int cnt135=0;
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==ID) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:23: lv+= ID
					{
					lv=(BAST)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification10106); 
					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					EarlyExitException eee = new EarlyExitException(135, input);
					throw eee;
				}
				cnt135++;
			}

			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification10111); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_universalLatticeQuantification10115);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification10119);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification10125);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1340:5: -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1346:1: blessSubclause : ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1347:3: ( ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1348:3: ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? )
			{
			match(input,BLESS_SUBCLAUSE,FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause10175); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1349:12: (no_proof= DO_NOT_PROVE )?
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==DO_NOT_PROVE) ) {
					alt136=1;
				}
				switch (alt136) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1349:12: no_proof= DO_NOT_PROVE
						{
						no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause10183); 
						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1350:7: (ac= assertClause )?
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==LITERAL_assert) ) {
					alt137=1;
				}
				switch (alt137) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1350:7: ac= assertClause
						{
						pushFollow(FOLLOW_assertClause_in_blessSubclause10192);
						ac=assertClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:8: (inv= invariantClause )?
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==LITERAL_invariant) ) {
					alt138=1;
				}
				switch (alt138) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:8: inv= invariantClause
						{
						pushFollow(FOLLOW_invariantClause_in_blessSubclause10203);
						inv=invariantClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1352:7: (vs= variablesSection )?
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==LITERAL_variables) ) {
					alt139=1;
				}
				switch (alt139) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1352:7: vs= variablesSection
						{
						pushFollow(FOLLOW_variablesSection_in_blessSubclause10212);
						vs=variablesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1353:7: (ss= statesSection )?
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==LITERAL_states) ) {
					alt140=1;
				}
				switch (alt140) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1353:7: ss= statesSection
						{
						pushFollow(FOLLOW_statesSection_in_blessSubclause10221);
						ss=statesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1354:6: (t= transitions )?
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==LITERAL_transitions) ) {
					alt141=1;
				}
				switch (alt141) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1354:6: t= transitions
						{
						pushFollow(FOLLOW_transitions_in_blessSubclause10230);
						t=transitions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1355:5: -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:1: invariantClause : ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st);
	public final UnparseBLESS3.invariantClause_return invariantClause() throws RecognitionException {
		UnparseBLESS3.invariantClause_return retval = new UnparseBLESS3.invariantClause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1359:3: ( ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1360:3: ^( LITERAL_invariant a= assertion )
			{
			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause10292); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assertion_in_invariantClause10296);
			a=assertion();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1361:5: -> invariant_clause(a=$a.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1364:1: variablesSection : ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd);
	public final UnparseBLESS3.variablesSection_return variablesSection() throws RecognitionException {
		UnparseBLESS3.variablesSection_return retval = new UnparseBLESS3.variablesSection_return();
		retval.start = input.LT(1);

		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:3: ( ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:2: ^( LITERAL_variables (vd+= variableDeclaration )+ )
			{
			match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection10328); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:25: (vd+= variableDeclaration )+
			int cnt142=0;
			loop142:
			while (true) {
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==VARIABLE_DECLARATION) ) {
					alt142=1;
				}

				switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1366:25: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection10332);
					vd=variableDeclaration();
					state._fsp--;

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTemplate());
					}
					break;

				default :
					if ( cnt142 >= 1 ) break loop142;
					EarlyExitException eee = new EarlyExitException(142, input);
					throw eee;
				}
				cnt142++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1367:4: -> variables(bv=$vd)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:1: statesSection : ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states);
	public final UnparseBLESS3.statesSection_return statesSection() throws RecognitionException {
		UnparseBLESS3.statesSection_return retval = new UnparseBLESS3.statesSection_return();
		retval.start = input.LT(1);

		List<Object> list_states=null;
		RuleReturnScope states = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1371:3: ( ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:2: ^( LITERAL_states (states+= behaviorState )+ )
			{
			match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection10363); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:26: (states+= behaviorState )+
			int cnt143=0;
			loop143:
			while (true) {
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==LITERAL_state) ) {
					alt143=1;
				}

				switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection10367);
					states=behaviorState();
					state._fsp--;

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTemplate());
					}
					break;

				default :
					if ( cnt143 >= 1 ) break loop143;
					EarlyExitException eee = new EarlyExitException(143, input);
					throw eee;
				}
				cnt143++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1373:4: -> states_section(bs=$states)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1376:1: behaviorState : ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st);
	public final UnparseBLESS3.behaviorState_return behaviorState() throws RecognitionException {
		UnparseBLESS3.behaviorState_return retval = new UnparseBLESS3.behaviorState_return();
		retval.start = input.LT(1);

		BAST init=null;
		BAST com=null;
		BAST finl=null;
		BAST i=null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1377:3: ( ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:3: ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? )
			{
			match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState10399); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:24: (init= LITERAL_initial )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LITERAL_initial) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:24: init= LITERAL_initial
					{
					init=(BAST)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState10403); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:45: (com= LITERAL_complete )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==LITERAL_complete) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:45: com= LITERAL_complete
					{
					com=(BAST)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState10408); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:68: (finl= LITERAL_final )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==LITERAL_final) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:68: finl= LITERAL_final
					{
					finl=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState10413); 
					}
					break;

			}

			i=(BAST)match(input,ID,FOLLOW_ID_in_behaviorState10418); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:90: (a= assertion )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==ASSERTION||(LA147_0 >= ASSERTION_ENUMERATION && LA147_0 <= ASSERTION_FUNCTION)) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1378:90: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState10422);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1379:5: -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1382:1: transitions : ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt);
	public final UnparseBLESS3.transitions_return transitions() throws RecognitionException {
		UnparseBLESS3.transitions_return retval = new UnparseBLESS3.transitions_return();
		retval.start = input.LT(1);

		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1383:3: ( ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:3: ^( LITERAL_transitions (bt+= behaviorTransition )+ )
			{
			match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions10477); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:28: (bt+= behaviorTransition )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==TRANSITION) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:28: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions10481);
					bt=behaviorTransition();
					state._fsp--;

					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTemplate());
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

			// TEMPLATE REWRITE
			// 1385:5: -> transitions(bt=$bt)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1388:1: behaviorTransition : ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1389:3: ( ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1390:3: ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) )
			{
			match(input,TRANSITION,FOLLOW_TRANSITION_in_behaviorTransition10514); 
			match(input, Token.DOWN, null); 
			match(input,LABEL,FOLLOW_LABEL_in_behaviorTransition10518); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10522); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1390:34: (pr= priority )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==LBRACKET) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1390:34: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition10526);
					pr=priority();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input,SOURCE,FOLLOW_SOURCE_in_behaviorTransition10533); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1390:60: (ssi+= ID )+
			int cnt150=0;
			loop150:
			while (true) {
				int alt150=2;
				int LA150_0 = input.LA(1);
				if ( (LA150_0==ID) ) {
					alt150=1;
				}

				switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1390:60: ssi+= ID
					{
					ssi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10537); 
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi);
					}
					break;

				default :
					if ( cnt150 >= 1 ) break loop150;
					EarlyExitException eee = new EarlyExitException(150, input);
					throw eee;
				}
				cnt150++;
			}

			match(input, Token.UP, null); 

			match(input,CONDITION,FOLLOW_CONDITION_in_behaviorTransition10549); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:20: (bc= behaviorCondition )?
				int alt151=2;
				int LA151_0 = input.LA(1);
				if ( (LA151_0==LITERAL_all||LA151_0==LITERAL_dispatch||LA151_0==LITERAL_exists||LA151_0==LITERAL_iff||LA151_0==LITERAL_implies||LA151_0==LITERAL_internal||LA151_0==LITERAL_numberof||LA151_0==LITERAL_on||LA151_0==LITERAL_product||LA151_0==LITERAL_sum) ) {
					alt151=1;
				}
				switch (alt151) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:20: bc= behaviorCondition
						{
						pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition10553);
						bc=behaviorCondition();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,DESTINATION,FOLLOW_DESTINATION_in_behaviorTransition10560); 
			match(input, Token.DOWN, null); 
			dsi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10564); 
			match(input, Token.UP, null); 

			match(input,ACTION,FOLLOW_ACTION_in_behaviorTransition10574); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1392:16: (s= behaviorActions )?
				int alt152=2;
				int LA152_0 = input.LA(1);
				if ( (LA152_0==ACTION||LA152_0==AMPERSAND||LA152_0==SEMICOLON) ) {
					alt152=1;
				}
				switch (alt152) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1392:16: s= behaviorActions
						{
						pushFollow(FOLLOW_behaviorActions_in_behaviorTransition10578);
						s=behaviorActions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,Q,FOLLOW_Q_in_behaviorTransition10585); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1392:42: (q= assertion )?
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==ASSERTION||(LA153_0 >= ASSERTION_ENUMERATION && LA153_0 <= ASSERTION_FUNCTION)) ) {
					alt153=1;
				}
				switch (alt153) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1392:42: q= assertion
						{
						pushFollow(FOLLOW_assertion_in_behaviorTransition10589);
						q=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1393:5: -> behavior_transition(id=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1397:1: priority : ^( LBRACKET num= INTEGER_LIT RBRACKET ) -> priority(num=$num.text);
	public final UnparseBLESS3.priority_return priority() throws RecognitionException {
		UnparseBLESS3.priority_return retval = new UnparseBLESS3.priority_return();
		retval.start = input.LT(1);

		BAST num=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1398:3: ( ^( LBRACKET num= INTEGER_LIT RBRACKET ) -> priority(num=$num.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:2: ^( LBRACKET num= INTEGER_LIT RBRACKET )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_priority10661); 
			match(input, Token.DOWN, null); 
			num=(BAST)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_priority10665); 
			match(input,RBRACKET,FOLLOW_RBRACKET_in_priority10667); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1400:4: -> priority(num=$num.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1403:1: behaviorCondition : (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st});
	public final UnparseBLESS3.behaviorCondition_return behaviorCondition() throws RecognitionException {
		UnparseBLESS3.behaviorCondition_return retval = new UnparseBLESS3.behaviorCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope dc =null;
		TreeRuleReturnScope ec =null;
		TreeRuleReturnScope mc =null;
		TreeRuleReturnScope ic =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:3: (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st})
			int alt154=4;
			switch ( input.LA(1) ) {
			case LITERAL_dispatch:
				{
				alt154=1;
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
				alt154=2;
				}
				break;
			case LITERAL_on:
				{
				alt154=3;
				}
				break;
			case LITERAL_internal:
				{
				alt154=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 154, 0, input);
				throw nvae;
			}
			switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:3: dc= dispatchCondition
					{
					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition10698);
					dc=dispatchCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1406:5: -> {$dc.st}
					{
						retval.st = (dc!=null?((StringTemplate)dc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1407:5: ec= executeCondition
					{
					pushFollow(FOLLOW_executeCondition_in_behaviorCondition10715);
					ec=executeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1408:5: -> {$ec.st}
					{
						retval.st = (ec!=null?((StringTemplate)ec.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1409:5: mc= modeCondition
					{
					pushFollow(FOLLOW_modeCondition_in_behaviorCondition10733);
					mc=modeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1410:5: -> {$mc.st}
					{
						retval.st = (mc!=null?((StringTemplate)mc.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:5: ic= internalCondition
					{
					pushFollow(FOLLOW_internalCondition_in_behaviorCondition10751);
					ic=internalCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1412:5: -> {$ic.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1415:1: dispatchCondition : ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st);
	public final UnparseBLESS3.dispatchCondition_return dispatchCondition() throws RecognitionException {
		UnparseBLESS3.dispatchCondition_return retval = new UnparseBLESS3.dispatchCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope de =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1416:3: ( ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:3: ^( LITERAL_dispatch (de= dispatchExpression )? )
			{
			match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition10779); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:25: (de= dispatchExpression )?
				int alt155=2;
				int LA155_0 = input.LA(1);
				if ( (LA155_0==ID||LA155_0==LITERAL_and||LA155_0==LITERAL_or||LA155_0==LITERAL_timeout) ) {
					alt155=1;
				}
				switch (alt155) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:25: de= dispatchExpression
						{
						pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition10783);
						de=dispatchExpression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1418:5: -> dispatch_condition(dle=$de.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1421:1: executeCondition : expression ;
	public final UnparseBLESS3.executeCondition_return executeCondition() throws RecognitionException {
		UnparseBLESS3.executeCondition_return retval = new UnparseBLESS3.executeCondition_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1422:3: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1423:3: expression
			{
			pushFollow(FOLLOW_expression_in_executeCondition10818);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1426:1: modeCondition : ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st);
	public final UnparseBLESS3.modeCondition_return modeCondition() throws RecognitionException {
		UnparseBLESS3.modeCondition_return retval = new UnparseBLESS3.modeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1427:3: ( ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1428:3: ^( LITERAL_on tle= triggerLogicalExpression )
			{
			match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10839); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10843);
			tle=triggerLogicalExpression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1429:5: -> mode_condition(tle=$tle.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1432:1: internalCondition : ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports);
	public final UnparseBLESS3.internalCondition_return internalCondition() throws RecognitionException {
		UnparseBLESS3.internalCondition_return retval = new UnparseBLESS3.internalCondition_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1433:3: ( ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1434:3: ^( LITERAL_internal (ports+= ID )+ )
			{
			match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10877); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1434:28: (ports+= ID )+
			int cnt156=0;
			loop156:
			while (true) {
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==ID) ) {
					alt156=1;
				}

				switch (alt156) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1434:28: ports+= ID
					{
					ports=(BAST)match(input,ID,FOLLOW_ID_in_internalCondition10881); 
					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					if ( cnt156 >= 1 ) break loop156;
					EarlyExitException eee = new EarlyExitException(156, input);
					throw eee;
				}
				cnt156++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1435:5: -> internal_condition(p=$ports)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1438:1: dispatchExpression : ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st});
	public final UnparseBLESS3.dispatchExpression_return dispatchExpression() throws RecognitionException {
		UnparseBLESS3.dispatchExpression_return retval = new UnparseBLESS3.dispatchExpression_return();
		retval.start = input.LT(1);

		List<Object> list_dc=null;
		TreeRuleReturnScope c =null;
		RuleReturnScope dc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1439:3: ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st})
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==LITERAL_or) ) {
				alt158=1;
			}
			else if ( (LA158_0==ID||LA158_0==LITERAL_and||LA158_0==LITERAL_timeout) ) {
				alt158=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}

			switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:3: ^( LITERAL_or (dc+= dispatchConjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10917); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:19: (dc+= dispatchConjunction )+
					int cnt157=0;
					loop157:
					while (true) {
						int alt157=2;
						int LA157_0 = input.LA(1);
						if ( (LA157_0==ID||LA157_0==LITERAL_and||LA157_0==LITERAL_timeout) ) {
							alt157=1;
						}

						switch (alt157) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:19: dc+= dispatchConjunction
							{
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10921);
							dc=dispatchConjunction();
							state._fsp--;

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTemplate());
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
					// 1441:5: -> disjunction(bopt=$dc)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_dc));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:3: c= dispatchConjunction
					{
					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10947);
					c=dispatchConjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1444:5: -> {$c.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1447:1: dispatchConjunction : ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st});
	public final UnparseBLESS3.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		UnparseBLESS3.dispatchConjunction_return retval = new UnparseBLESS3.dispatchConjunction_return();
		retval.start = input.LT(1);

		List<Object> list_tr=null;
		TreeRuleReturnScope t =null;
		RuleReturnScope tr = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1448:3: ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st})
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==LITERAL_and) ) {
				alt160=1;
			}
			else if ( (LA160_0==ID||LA160_0==LITERAL_timeout) ) {
				alt160=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}

			switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1449:3: ^( LITERAL_and (tr+= dispatchTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10978); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1449:20: (tr+= dispatchTrigger )+
					int cnt159=0;
					loop159:
					while (true) {
						int alt159=2;
						int LA159_0 = input.LA(1);
						if ( (LA159_0==ID||LA159_0==LITERAL_timeout) ) {
							alt159=1;
						}

						switch (alt159) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1449:20: tr+= dispatchTrigger
							{
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10982);
							tr=dispatchTrigger();
							state._fsp--;

							if (list_tr==null) list_tr=new ArrayList<Object>();
							list_tr.add(tr.getTemplate());
							}
							break;

						default :
							if ( cnt159 >= 1 ) break loop159;
							EarlyExitException eee = new EarlyExitException(159, input);
							throw eee;
						}
						cnt159++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1450:5: -> conjunction(bopt=$tr)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_tr));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1452:3: t= dispatchTrigger
					{
					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction11008);
					t=dispatchTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1453:5: -> {$t.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1456:1: dispatchTrigger : (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports));
	public final UnparseBLESS3.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		UnparseBLESS3.dispatchTrigger_return retval = new UnparseBLESS3.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;
		TreeRuleReturnScope port =null;
		TreeRuleReturnScope time =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1457:3: (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports))
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==ID) ) {
				alt164=1;
			}
			else if ( (LA164_0==LITERAL_timeout) ) {
				alt164=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1458:3: port= portName
					{
					pushFollow(FOLLOW_portName_in_dispatchTrigger11034);
					port=portName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1459:5: -> {$port.st}
					{
						retval.st = (port!=null?((StringTemplate)port.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:3: ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? )
					{
					match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger11052); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:22: ( ^( LPAREN (ports+= ID )* ) )?
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==LPAREN) ) {
							int LA162_1 = input.LA(2);
							if ( (LA162_1==DOWN) ) {
								int LA162_3 = input.LA(3);
								if ( (LA162_3==UP||LA162_3==ID) ) {
									alt162=1;
								}
							}
						}
						switch (alt162) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:24: ^( LPAREN (ports+= ID )* )
								{
								match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger11058); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:39: (ports+= ID )*
									loop161:
									while (true) {
										int alt161=2;
										int LA161_0 = input.LA(1);
										if ( (LA161_0==ID) ) {
											alt161=1;
										}

										switch (alt161) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:39: ports+= ID
											{
											ports=(BAST)match(input,ID,FOLLOW_ID_in_dispatchTrigger11062); 
											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop161;
										}
									}

									match(input, Token.UP, null); 
								}

								}
								break;

						}

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:54: (time= behaviorTime )?
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==ID||LA163_0==LPAREN||(LA163_0 >= QUANTITY && LA163_0 <= QUESTION)||LA163_0==TICK) ) {
							alt163=1;
						}
						switch (alt163) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:54: time= behaviorTime
								{
								pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger11072);
								time=behaviorTime();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 1462:5: -> timeout(bt=$time.stp=$ports)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1465:1: behaviorTime : (q= quantity -> {$q.st}|vn= valueName -> {$vn.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.behaviorTime_return behaviorTime() throws RecognitionException {
		UnparseBLESS3.behaviorTime_return retval = new UnparseBLESS3.behaviorTime_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope q =null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1465:13: (q= quantity -> {$q.st}|vn= valueName -> {$vn.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt165=3;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt165=1;
				}
				break;
			case ID:
			case QUESTION:
			case TICK:
				{
				alt165=2;
				}
				break;
			case LPAREN:
				{
				alt165=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}
			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1466:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_behaviorTime11106);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1467:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1468:5: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime11122);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1469:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1470:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_behaviorTime11138);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1471:5: -> {$ps.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1474:1: portName : ^(port= ID (index= INTEGER_LIT )? ) -> port_name(port=$port.textindex=$index.text);
	public final UnparseBLESS3.portName_return portName() throws RecognitionException {
		UnparseBLESS3.portName_return retval = new UnparseBLESS3.portName_return();
		retval.start = input.LT(1);

		BAST port=null;
		BAST index=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1475:3: ( ^(port= ID (index= INTEGER_LIT )? ) -> port_name(port=$port.textindex=$index.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:3: ^(port= ID (index= INTEGER_LIT )? )
			{
			port=(BAST)match(input,ID,FOLLOW_ID_in_portName11166); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:19: (index= INTEGER_LIT )?
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==INTEGER_LIT) ) {
					alt166=1;
				}
				switch (alt166) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:19: index= INTEGER_LIT
						{
						index=(BAST)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_portName11170); 
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1477:5: -> port_name(port=$port.textindex=$index.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1480:1: triggerLogicalExpression : ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st});
	public final UnparseBLESS3.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		UnparseBLESS3.triggerLogicalExpression_return retval = new UnparseBLESS3.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		List<Object> list_et=null;
		TreeRuleReturnScope first =null;
		RuleReturnScope et = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1481:3: ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st})
			int alt172=6;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt172=1;
				}
				break;
			case LITERAL_or:
				{
				alt172=2;
				}
				break;
			case LITERAL_xor:
				{
				alt172=3;
				}
				break;
			case LITERAL_then:
				{
				alt172=4;
				}
				break;
			case LITERAL_else:
				{
				alt172=5;
				}
				break;
			case LPAREN:
			case TRIGGER:
				{
				alt172=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}
			switch (alt172) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1482:3: ^( LITERAL_and (et+= eventTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_triggerLogicalExpression11207); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1482:20: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1482:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11211);
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
					// 1483:5: -> conjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1485:3: ^( LITERAL_or (et+= eventTrigger )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_triggerLogicalExpression11238); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1485:19: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1485:19: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11242);
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
					// 1486:5: -> disjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1488:3: ^( LITERAL_xor (et+= eventTrigger )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_triggerLogicalExpression11269); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1488:20: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1488:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11273);
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
					// 1489:5: -> xor(terms=$et)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_et));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1491:3: ^( LITERAL_then (et+= eventTrigger )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_triggerLogicalExpression11300); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1491:21: (et+= eventTrigger )+
					int cnt170=0;
					loop170:
					while (true) {
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==LPAREN||LA170_0==TRIGGER) ) {
							alt170=1;
						}

						switch (alt170) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1491:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11304);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt170 >= 1 ) break loop170;
							EarlyExitException eee = new EarlyExitException(170, input);
							throw eee;
						}
						cnt170++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1492:5: -> cand(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1494:3: ^( LITERAL_else (et+= eventTrigger )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_triggerLogicalExpression11331); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1494:21: (et+= eventTrigger )+
					int cnt171=0;
					loop171:
					while (true) {
						int alt171=2;
						int LA171_0 = input.LA(1);
						if ( (LA171_0==LPAREN||LA171_0==TRIGGER) ) {
							alt171=1;
						}

						switch (alt171) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1494:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11335);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt171 >= 1 ) break loop171;
							EarlyExitException eee = new EarlyExitException(171, input);
							throw eee;
						}
						cnt171++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1495:5: -> cor(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1497:3: first= eventTrigger
					{
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11361);
					first=eventTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1498:5: -> {$first.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1501:1: eventTrigger : (tr= TRIGGER -> {%{$tr.text}}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st));
	public final UnparseBLESS3.eventTrigger_return eventTrigger() throws RecognitionException {
		UnparseBLESS3.eventTrigger_return retval = new UnparseBLESS3.eventTrigger_return();
		retval.start = input.LT(1);

		BAST tr=null;
		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1502:3: (tr= TRIGGER -> {%{$tr.text}}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st))
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==TRIGGER) ) {
				alt173=1;
			}
			else if ( (LA173_0==LPAREN) ) {
				alt173=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}

			switch (alt173) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1503:3: tr= TRIGGER
					{
					tr=(BAST)match(input,TRIGGER,FOLLOW_TRIGGER_in_eventTrigger11386); 
					// TEMPLATE REWRITE
					// 1504:5: -> {%{$tr.text}}
					{
						retval.st = new StringTemplate(templateLib,(tr!=null?tr.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:3: ^( LPAREN tle= triggerLogicalExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger11405); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger11409);
					tle=triggerLogicalExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger11411); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1507:5: -> parentheses(be=$tle.st)
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
	protected DFA77 dfa77 = new DFA77(this);
	static final String DFA6_eotS =
		"\7\uffff";
	static final String DFA6_eofS =
		"\7\uffff";
	static final String DFA6_minS =
		"\1\u0112\1\2\1\46\1\uffff\1\3\2\uffff";
	static final String DFA6_maxS =
		"\1\u0112\1\2\1\72\1\uffff\1\72\2\uffff";
	static final String DFA6_acceptS =
		"\3\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA6_specialS =
		"\7\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\23\uffff\1\4",
			"",
			"\1\5\42\uffff\1\6\23\uffff\1\4",
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
			return "237:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom));";
		}
	}

	static final String DFA14_eotS =
		"\12\uffff";
	static final String DFA14_eofS =
		"\12\uffff";
	static final String DFA14_minS =
		"\1\34\1\2\1\u0114\1\2\1\72\2\3\1\46\2\uffff";
	static final String DFA14_maxS =
		"\1\34\1\2\1\u0114\1\2\3\72\1\u0109\2\uffff";
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
			"\1\7\66\uffff\1\6",
			"\1\7\66\uffff\1\6",
			"\1\11\u00e2\uffff\1\10",
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
			return "269:1: unitFactor : ( ^( COMMA unit= unitName t= TIMES factor= number ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= number ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text));";
		}
	}

	static final String DFA19_eotS =
		"\u022b\uffff";
	static final String DFA19_eofS =
		"\u022b\uffff";
	static final String DFA19_minS =
		"\1\u00a8\1\2\1\72\3\3\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff\4\76"+
		"\1\2\2\76\1\2\2\76\1\2\1\76\1\3\1\2\1\3\1\u00b3\1\3\1\2\1\3\1\u00b3\1"+
		"\3\1\2\1\3\1\u00b3\1\3\1\u00b3\1\3\2\u00f2\1\3\1\u00b3\1\3\2\u00f2\1\3"+
		"\1\u00b3\1\3\2\u00f2\1\uffff\1\2\1\uffff\1\3\2\u00f2\1\76\2\2\2\3\1\uffff"+
		"\1\2\1\uffff\1\3\2\u00f2\1\76\2\2\2\3\1\uffff\1\2\1\uffff\1\3\2\u00f2"+
		"\1\76\2\2\2\3\1\76\1\3\2\2\2\3\2\72\1\76\2\2\1\76\2\2\1\76\1\3\2\2\2\3"+
		"\2\72\1\76\2\2\1\76\2\2\1\76\1\3\2\2\2\3\2\72\1\76\2\2\1\76\2\2\1\3\1"+
		"\2\1\3\2\72\1\3\2\2\1\3\2\2\5\3\4\72\1\3\1\2\1\3\2\72\1\3\2\2\1\3\2\2"+
		"\5\3\4\72\1\3\1\2\1\3\2\72\1\3\2\2\1\3\2\2\5\3\4\72\1\3\1\u00b3\5\3\4"+
		"\72\20\3\1\u00b3\5\3\4\72\20\3\1\u00b3\5\3\4\72\17\3\2\uffff\1\3\2\u00f2"+
		"\17\3\1\76\12\3\2\uffff\1\3\2\u00f2\17\3\1\76\12\3\2\uffff\1\3\2\u00f2"+
		"\17\3\1\76\13\3\2\2\15\3\2\76\1\3\2\2\15\3\2\76\1\3\2\2\15\3\2\76\2\72"+
		"\1\3\2\2\1\3\2\2\2\3\2\72\1\3\2\2\1\3\2\2\2\3\2\72\1\3\2\2\1\3\2\2\7\3"+
		"\4\72\5\3\4\72\5\3\4\72\124\3";
	static final String DFA19_maxS =
		"\1\u00a8\1\2\1\u00d8\3\u00ae\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff"+
		"\4\u00fb\1\2\2\u00fb\1\2\2\u00fb\1\2\1\u00fb\1\3\1\2\1\3\1\u00f3\1\3\1"+
		"\2\1\3\1\u00f3\1\3\1\2\1\3\1\u00f3\1\u00bc\1\u00f3\1\107\2\u00f2\1\u00bc"+
		"\1\u00f3\1\107\2\u00f2\1\u00bc\1\u00f3\1\107\2\u00f2\1\uffff\1\2\1\uffff"+
		"\1\107\2\u00f2\1\u00fb\2\2\2\107\1\uffff\1\2\1\uffff\1\107\2\u00f2\1\u00fb"+
		"\2\2\2\107\1\uffff\1\2\1\uffff\1\107\2\u00f2\1\u00fb\2\2\2\107\1\u00fb"+
		"\1\3\2\2\2\107\1\u00fb\1\u00d2\1\u00fb\2\2\1\u00fb\2\2\1\u00fb\1\3\2\2"+
		"\2\107\1\u00fb\1\u00d2\1\u00fb\2\2\1\u00fb\2\2\1\u00fb\1\3\2\2\2\107\1"+
		"\u00fb\1\u00d2\1\u00fb\2\2\1\u00fb\2\2\1\3\1\2\1\3\1\u00fb\1\u00d2\1\3"+
		"\2\2\1\3\2\2\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\1\3\1\2\1\3\1\u00fb\1"+
		"\u00d2\1\3\2\2\1\3\2\2\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\1\3\1\2\1\3"+
		"\1\u00fb\1\u00d2\1\3\2\2\1\3\2\2\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\1"+
		"\u00ae\1\u00f3\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\5\107\12\3\1\u00ae"+
		"\1\u00f3\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\5\107\12\3\1\u00ae\1\u00f3"+
		"\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\5\107\12\3\2\uffff\1\107\2\u00f2"+
		"\5\107\12\3\1\u00fb\12\107\2\uffff\1\107\2\u00f2\5\107\12\3\1\u00fb\12"+
		"\107\2\uffff\1\107\2\u00f2\5\107\12\3\1\u00fb\12\107\1\3\2\2\2\107\1\3"+
		"\12\107\2\u00fb\1\3\2\2\2\107\1\3\12\107\2\u00fb\1\3\2\2\2\107\1\3\12"+
		"\107\3\u00fb\1\u00d2\1\3\2\2\1\3\2\2\2\3\1\u00fb\1\u00d2\1\3\2\2\1\3\2"+
		"\2\2\3\1\u00fb\1\u00d2\1\3\2\2\1\3\2\2\7\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2"+
		"\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2\5\3\1\u00fb\1\u00d2\1\u00fb\1\u00d2"+
		"\5\107\12\3\5\107\12\3\5\107\13\3\12\107\1\3\12\107\1\3\12\107\6\3";
	static final String DFA19_acceptS =
		"\6\uffff\1\1\1\uffff\1\12\1\2\1\uffff\1\13\1\3\1\uffff\1\14\47\uffff\1"+
		"\4\1\uffff\1\15\10\uffff\1\5\1\uffff\1\16\10\uffff\1\6\1\uffff\1\17\u00bc"+
		"\uffff\1\7\1\20\35\uffff\1\10\1\21\35\uffff\1\11\1\22\u00e0\uffff";
	static final String DFA19_specialS =
		"\u022b\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\167\uffff\1\4\45\uffff\1\5",
			"\1\6\46\uffff\1\7\u0083\uffff\1\10",
			"\1\11\46\uffff\1\12\u0083\uffff\1\13",
			"\1\14\46\uffff\1\15\u0083\uffff\1\16",
			"",
			"\1\17",
			"",
			"",
			"\1\20",
			"",
			"",
			"\1\21",
			"",
			"\1\22\u00a4\uffff\1\23\16\uffff\1\24\10\uffff\1\22",
			"\1\25\u00a4\uffff\1\26\16\uffff\1\27\10\uffff\1\25",
			"\1\30\u00a4\uffff\1\31\16\uffff\1\32\10\uffff\1\30",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\36",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\42",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\46",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\47",
			"\1\50",
			"\1\47",
			"\1\52\76\uffff\1\51\1\53",
			"\1\54",
			"\1\55",
			"\1\54",
			"\1\57\76\uffff\1\56\1\60",
			"\1\61",
			"\1\62",
			"\1\61",
			"\1\64\76\uffff\1\63\1\65",
			"\1\66\u00aa\uffff\1\70\15\uffff\1\67",
			"\1\72\76\uffff\1\71\1\73",
			"\1\74\44\uffff\1\76\36\uffff\1\75",
			"\1\77",
			"\1\100",
			"\1\101\u00aa\uffff\1\103\15\uffff\1\102",
			"\1\105\76\uffff\1\104\1\106",
			"\1\107\44\uffff\1\111\36\uffff\1\110",
			"\1\112",
			"\1\113",
			"\1\114\u00aa\uffff\1\116\15\uffff\1\115",
			"\1\120\76\uffff\1\117\1\121",
			"\1\122\44\uffff\1\124\36\uffff\1\123",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"",
			"\1\130\44\uffff\1\132\36\uffff\1\131",
			"\1\133",
			"\1\134",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\135",
			"\1\136",
			"\1\137\44\uffff\1\141\36\uffff\1\140",
			"\1\142\44\uffff\1\144\36\uffff\1\143",
			"",
			"\1\145",
			"",
			"\1\146\44\uffff\1\150\36\uffff\1\147",
			"\1\151",
			"\1\152",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\153",
			"\1\154",
			"\1\155\44\uffff\1\157\36\uffff\1\156",
			"\1\160\44\uffff\1\162\36\uffff\1\161",
			"",
			"\1\163",
			"",
			"\1\164\44\uffff\1\166\36\uffff\1\165",
			"\1\167",
			"\1\170",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\171",
			"\1\172",
			"\1\173\44\uffff\1\175\36\uffff\1\174",
			"\1\176\44\uffff\1\u0080\36\uffff\1\177",
			"\1\u0081\u00a4\uffff\1\u0082\16\uffff\1\u0083\10\uffff\1\u0081",
			"\1\47",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086\44\uffff\1\u0088\36\uffff\1\u0087",
			"\1\u0089\44\uffff\1\u008b\36\uffff\1\u008a",
			"\1\u008c\3\uffff\1\u008d\u00bc\uffff\1\u008d",
			"\1\u008e\127\uffff\1\u0090\77\uffff\1\u008f",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\u0091",
			"\1\u0092",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095\u00a4\uffff\1\u0096\16\uffff\1\u0097\10\uffff\1\u0095",
			"\1\54",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a\44\uffff\1\u009c\36\uffff\1\u009b",
			"\1\u009d\44\uffff\1\u009f\36\uffff\1\u009e",
			"\1\u00a0\3\uffff\1\u00a1\u00bc\uffff\1\u00a1",
			"\1\u00a2\127\uffff\1\u00a4\77\uffff\1\u00a3",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\u00a5",
			"\1\u00a6",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9\u00a4\uffff\1\u00aa\16\uffff\1\u00ab\10\uffff\1\u00a9",
			"\1\61",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae\44\uffff\1\u00b0\36\uffff\1\u00af",
			"\1\u00b1\44\uffff\1\u00b3\36\uffff\1\u00b2",
			"\1\u00b4\3\uffff\1\u00b5\u00bc\uffff\1\u00b5",
			"\1\u00b6\127\uffff\1\u00b8\77\uffff\1\u00b7",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\u00b9",
			"\1\u00ba",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bd",
			"\1\u00bf\3\uffff\1\u00c0\u00bc\uffff\1\u00c0",
			"\1\u00c1\127\uffff\1\u00c3\77\uffff\1\u00c2",
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
			"\1\u00cd\3\uffff\1\u00ce\u00bc\uffff\1\u00ce",
			"\1\u00cf\127\uffff\1\u00d1\77\uffff\1\u00d0",
			"\1\u00d2\3\uffff\1\u00d3\u00bc\uffff\1\u00d3",
			"\1\u00d4\127\uffff\1\u00d6\77\uffff\1\u00d5",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d7",
			"\1\u00d9\3\uffff\1\u00da\u00bc\uffff\1\u00da",
			"\1\u00db\127\uffff\1\u00dd\77\uffff\1\u00dc",
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
			"\1\u00e7\3\uffff\1\u00e8\u00bc\uffff\1\u00e8",
			"\1\u00e9\127\uffff\1\u00eb\77\uffff\1\u00ea",
			"\1\u00ec\3\uffff\1\u00ed\u00bc\uffff\1\u00ed",
			"\1\u00ee\127\uffff\1\u00f0\77\uffff\1\u00ef",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f1",
			"\1\u00f3\3\uffff\1\u00f4\u00bc\uffff\1\u00f4",
			"\1\u00f5\127\uffff\1\u00f7\77\uffff\1\u00f6",
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
			"\1\u0101\3\uffff\1\u0102\u00bc\uffff\1\u0102",
			"\1\u0103\127\uffff\1\u0105\77\uffff\1\u0104",
			"\1\u0106\3\uffff\1\u0107\u00bc\uffff\1\u0107",
			"\1\u0108\127\uffff\1\u010a\77\uffff\1\u0109",
			"\1\u010b\u00aa\uffff\1\u010c",
			"\1\u010e\76\uffff\1\u010d\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115\3\uffff\1\u0116\u00bc\uffff\1\u0116",
			"\1\u0117\127\uffff\1\u0119\77\uffff\1\u0118",
			"\1\u011a\3\uffff\1\u011b\u00bc\uffff\1\u011b",
			"\1\u011c\127\uffff\1\u011e\77\uffff\1\u011d",
			"\1\u011f\44\uffff\1\76\36\uffff\1\75",
			"\1\u011f\44\uffff\1\76\36\uffff\1\75",
			"\1\u011f\44\uffff\1\76\36\uffff\1\75",
			"\1\u011f\44\uffff\1\76\36\uffff\1\75",
			"\1\u011f\44\uffff\1\76\36\uffff\1\75",
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
			"\1\u012a\u00aa\uffff\1\u012b",
			"\1\u012d\76\uffff\1\u012c\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134\3\uffff\1\u0135\u00bc\uffff\1\u0135",
			"\1\u0136\127\uffff\1\u0138\77\uffff\1\u0137",
			"\1\u0139\3\uffff\1\u013a\u00bc\uffff\1\u013a",
			"\1\u013b\127\uffff\1\u013d\77\uffff\1\u013c",
			"\1\u013e\44\uffff\1\111\36\uffff\1\110",
			"\1\u013e\44\uffff\1\111\36\uffff\1\110",
			"\1\u013e\44\uffff\1\111\36\uffff\1\110",
			"\1\u013e\44\uffff\1\111\36\uffff\1\110",
			"\1\u013e\44\uffff\1\111\36\uffff\1\110",
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
			"\1\u0149\u00aa\uffff\1\u014a",
			"\1\u014c\76\uffff\1\u014b\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153\3\uffff\1\u0154\u00bc\uffff\1\u0154",
			"\1\u0155\127\uffff\1\u0157\77\uffff\1\u0156",
			"\1\u0158\3\uffff\1\u0159\u00bc\uffff\1\u0159",
			"\1\u015a\127\uffff\1\u015c\77\uffff\1\u015b",
			"\1\u015d\44\uffff\1\124\36\uffff\1\123",
			"\1\u015d\44\uffff\1\124\36\uffff\1\123",
			"\1\u015d\44\uffff\1\124\36\uffff\1\123",
			"\1\u015d\44\uffff\1\124\36\uffff\1\123",
			"\1\u015d\44\uffff\1\124\36\uffff\1\123",
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
			"\1\u0168\44\uffff\1\u016a\36\uffff\1\u0169",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d\44\uffff\1\132\36\uffff\1\131",
			"\1\u016d\44\uffff\1\132\36\uffff\1\131",
			"\1\u016d\44\uffff\1\132\36\uffff\1\131",
			"\1\u016d\44\uffff\1\132\36\uffff\1\131",
			"\1\u016d\44\uffff\1\132\36\uffff\1\131",
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
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\u0178\44\uffff\1\141\36\uffff\1\140",
			"\1\u0178\44\uffff\1\141\36\uffff\1\140",
			"\1\u0178\44\uffff\1\141\36\uffff\1\140",
			"\1\u0178\44\uffff\1\141\36\uffff\1\140",
			"\1\u0178\44\uffff\1\141\36\uffff\1\140",
			"\1\u0179\44\uffff\1\144\36\uffff\1\143",
			"\1\u0179\44\uffff\1\144\36\uffff\1\143",
			"\1\u0179\44\uffff\1\144\36\uffff\1\143",
			"\1\u0179\44\uffff\1\144\36\uffff\1\143",
			"\1\u0179\44\uffff\1\144\36\uffff\1\143",
			"",
			"",
			"\1\u017a\44\uffff\1\u017c\36\uffff\1\u017b",
			"\1\u017d",
			"\1\u017e",
			"\1\u017f\44\uffff\1\150\36\uffff\1\147",
			"\1\u017f\44\uffff\1\150\36\uffff\1\147",
			"\1\u017f\44\uffff\1\150\36\uffff\1\147",
			"\1\u017f\44\uffff\1\150\36\uffff\1\147",
			"\1\u017f\44\uffff\1\150\36\uffff\1\147",
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
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\u018a\44\uffff\1\157\36\uffff\1\156",
			"\1\u018a\44\uffff\1\157\36\uffff\1\156",
			"\1\u018a\44\uffff\1\157\36\uffff\1\156",
			"\1\u018a\44\uffff\1\157\36\uffff\1\156",
			"\1\u018a\44\uffff\1\157\36\uffff\1\156",
			"\1\u018b\44\uffff\1\162\36\uffff\1\161",
			"\1\u018b\44\uffff\1\162\36\uffff\1\161",
			"\1\u018b\44\uffff\1\162\36\uffff\1\161",
			"\1\u018b\44\uffff\1\162\36\uffff\1\161",
			"\1\u018b\44\uffff\1\162\36\uffff\1\161",
			"",
			"",
			"\1\u018c\44\uffff\1\u018e\36\uffff\1\u018d",
			"\1\u018f",
			"\1\u0190",
			"\1\u0191\44\uffff\1\166\36\uffff\1\165",
			"\1\u0191\44\uffff\1\166\36\uffff\1\165",
			"\1\u0191\44\uffff\1\166\36\uffff\1\165",
			"\1\u0191\44\uffff\1\166\36\uffff\1\165",
			"\1\u0191\44\uffff\1\166\36\uffff\1\165",
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
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\u019c\44\uffff\1\175\36\uffff\1\174",
			"\1\u019c\44\uffff\1\175\36\uffff\1\174",
			"\1\u019c\44\uffff\1\175\36\uffff\1\174",
			"\1\u019c\44\uffff\1\175\36\uffff\1\174",
			"\1\u019c\44\uffff\1\175\36\uffff\1\174",
			"\1\u019d\44\uffff\1\u0080\36\uffff\1\177",
			"\1\u019d\44\uffff\1\u0080\36\uffff\1\177",
			"\1\u019d\44\uffff\1\u0080\36\uffff\1\177",
			"\1\u019d\44\uffff\1\u0080\36\uffff\1\177",
			"\1\u019d\44\uffff\1\u0080\36\uffff\1\177",
			"\1\u00bd",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0\44\uffff\1\u01a2\36\uffff\1\u01a1",
			"\1\u01a3\44\uffff\1\u01a5\36\uffff\1\u01a4",
			"\1\47",
			"\1\u01a6\44\uffff\1\u0088\36\uffff\1\u0087",
			"\1\u01a6\44\uffff\1\u0088\36\uffff\1\u0087",
			"\1\u01a6\44\uffff\1\u0088\36\uffff\1\u0087",
			"\1\u01a6\44\uffff\1\u0088\36\uffff\1\u0087",
			"\1\u01a6\44\uffff\1\u0088\36\uffff\1\u0087",
			"\1\u01a7\44\uffff\1\u008b\36\uffff\1\u008a",
			"\1\u01a7\44\uffff\1\u008b\36\uffff\1\u008a",
			"\1\u01a7\44\uffff\1\u008b\36\uffff\1\u008a",
			"\1\u01a7\44\uffff\1\u008b\36\uffff\1\u008a",
			"\1\u01a7\44\uffff\1\u008b\36\uffff\1\u008a",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\33\u00a4\uffff\1\34\16\uffff\1\35\10\uffff\1\33",
			"\1\u00d7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa\44\uffff\1\u01ac\36\uffff\1\u01ab",
			"\1\u01ad\44\uffff\1\u01af\36\uffff\1\u01ae",
			"\1\54",
			"\1\u01b0\44\uffff\1\u009c\36\uffff\1\u009b",
			"\1\u01b0\44\uffff\1\u009c\36\uffff\1\u009b",
			"\1\u01b0\44\uffff\1\u009c\36\uffff\1\u009b",
			"\1\u01b0\44\uffff\1\u009c\36\uffff\1\u009b",
			"\1\u01b0\44\uffff\1\u009c\36\uffff\1\u009b",
			"\1\u01b1\44\uffff\1\u009f\36\uffff\1\u009e",
			"\1\u01b1\44\uffff\1\u009f\36\uffff\1\u009e",
			"\1\u01b1\44\uffff\1\u009f\36\uffff\1\u009e",
			"\1\u01b1\44\uffff\1\u009f\36\uffff\1\u009e",
			"\1\u01b1\44\uffff\1\u009f\36\uffff\1\u009e",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\37\u00a4\uffff\1\40\16\uffff\1\41\10\uffff\1\37",
			"\1\u00f1",
			"\1\u01b2",
			"\1\u01b3",
			"\1\u01b4\44\uffff\1\u01b6\36\uffff\1\u01b5",
			"\1\u01b7\44\uffff\1\u01b9\36\uffff\1\u01b8",
			"\1\61",
			"\1\u01ba\44\uffff\1\u00b0\36\uffff\1\u00af",
			"\1\u01ba\44\uffff\1\u00b0\36\uffff\1\u00af",
			"\1\u01ba\44\uffff\1\u00b0\36\uffff\1\u00af",
			"\1\u01ba\44\uffff\1\u00b0\36\uffff\1\u00af",
			"\1\u01ba\44\uffff\1\u00b0\36\uffff\1\u00af",
			"\1\u01bb\44\uffff\1\u00b3\36\uffff\1\u00b2",
			"\1\u01bb\44\uffff\1\u00b3\36\uffff\1\u00b2",
			"\1\u01bb\44\uffff\1\u00b3\36\uffff\1\u00b2",
			"\1\u01bb\44\uffff\1\u00b3\36\uffff\1\u00b2",
			"\1\u01bb\44\uffff\1\u00b3\36\uffff\1\u00b2",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\43\u00a4\uffff\1\44\16\uffff\1\45\10\uffff\1\43",
			"\1\u01bc\3\uffff\1\u01bd\u00bc\uffff\1\u01bd",
			"\1\u01be\127\uffff\1\u01c0\77\uffff\1\u01bf",
			"\1\u00bd",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u00bd",
			"\1\u01c3",
			"\1\u01c4",
			"\1\47",
			"\1\47",
			"\1\u01c5\3\uffff\1\u01c6\u00bc\uffff\1\u01c6",
			"\1\u01c7\127\uffff\1\u01c9\77\uffff\1\u01c8",
			"\1\u00d7",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u00d7",
			"\1\u01cc",
			"\1\u01cd",
			"\1\54",
			"\1\54",
			"\1\u01ce\3\uffff\1\u01cf\u00bc\uffff\1\u01cf",
			"\1\u01d0\127\uffff\1\u01d2\77\uffff\1\u01d1",
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
			"\1\u01dc\3\uffff\1\u01dd\u00bc\uffff\1\u01dd",
			"\1\u01de\127\uffff\1\u01e0\77\uffff\1\u01df",
			"\1\u01e1\3\uffff\1\u01e2\u00bc\uffff\1\u01e2",
			"\1\u01e3\127\uffff\1\u01e5\77\uffff\1\u01e4",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb\3\uffff\1\u01ec\u00bc\uffff\1\u01ec",
			"\1\u01ed\127\uffff\1\u01ef\77\uffff\1\u01ee",
			"\1\u01f0\3\uffff\1\u01f1\u00bc\uffff\1\u01f1",
			"\1\u01f2\127\uffff\1\u01f4\77\uffff\1\u01f3",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa\3\uffff\1\u01fb\u00bc\uffff\1\u01fb",
			"\1\u01fc\127\uffff\1\u01fe\77\uffff\1\u01fd",
			"\1\u01ff\3\uffff\1\u0200\u00bc\uffff\1\u0200",
			"\1\u0201\127\uffff\1\u0203\77\uffff\1\u0202",
			"\1\u0204\44\uffff\1\u016a\36\uffff\1\u0169",
			"\1\u0204\44\uffff\1\u016a\36\uffff\1\u0169",
			"\1\u0204\44\uffff\1\u016a\36\uffff\1\u0169",
			"\1\u0204\44\uffff\1\u016a\36\uffff\1\u0169",
			"\1\u0204\44\uffff\1\u016a\36\uffff\1\u0169",
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
			"\1\u020f\44\uffff\1\u017c\36\uffff\1\u017b",
			"\1\u020f\44\uffff\1\u017c\36\uffff\1\u017b",
			"\1\u020f\44\uffff\1\u017c\36\uffff\1\u017b",
			"\1\u020f\44\uffff\1\u017c\36\uffff\1\u017b",
			"\1\u020f\44\uffff\1\u017c\36\uffff\1\u017b",
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
			"\1\u021a\44\uffff\1\u018e\36\uffff\1\u018d",
			"\1\u021a\44\uffff\1\u018e\36\uffff\1\u018d",
			"\1\u021a\44\uffff\1\u018e\36\uffff\1\u018d",
			"\1\u021a\44\uffff\1\u018e\36\uffff\1\u018d",
			"\1\u021a\44\uffff\1\u018e\36\uffff\1\u018d",
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
			"\1\u0225\44\uffff\1\u01a2\36\uffff\1\u01a1",
			"\1\u0225\44\uffff\1\u01a2\36\uffff\1\u01a1",
			"\1\u0225\44\uffff\1\u01a2\36\uffff\1\u01a1",
			"\1\u0225\44\uffff\1\u01a2\36\uffff\1\u01a1",
			"\1\u0225\44\uffff\1\u01a2\36\uffff\1\u01a1",
			"\1\u0226\44\uffff\1\u01a5\36\uffff\1\u01a4",
			"\1\u0226\44\uffff\1\u01a5\36\uffff\1\u01a4",
			"\1\u0226\44\uffff\1\u01a5\36\uffff\1\u01a4",
			"\1\u0226\44\uffff\1\u01a5\36\uffff\1\u01a4",
			"\1\u0226\44\uffff\1\u01a5\36\uffff\1\u01a4",
			"\1\u00d7",
			"\1\u0227\44\uffff\1\u01ac\36\uffff\1\u01ab",
			"\1\u0227\44\uffff\1\u01ac\36\uffff\1\u01ab",
			"\1\u0227\44\uffff\1\u01ac\36\uffff\1\u01ab",
			"\1\u0227\44\uffff\1\u01ac\36\uffff\1\u01ab",
			"\1\u0227\44\uffff\1\u01ac\36\uffff\1\u01ab",
			"\1\u0228\44\uffff\1\u01af\36\uffff\1\u01ae",
			"\1\u0228\44\uffff\1\u01af\36\uffff\1\u01ae",
			"\1\u0228\44\uffff\1\u01af\36\uffff\1\u01ae",
			"\1\u0228\44\uffff\1\u01af\36\uffff\1\u01ae",
			"\1\u0228\44\uffff\1\u01af\36\uffff\1\u01ae",
			"\1\u00f1",
			"\1\u0229\44\uffff\1\u01b6\36\uffff\1\u01b5",
			"\1\u0229\44\uffff\1\u01b6\36\uffff\1\u01b5",
			"\1\u0229\44\uffff\1\u01b6\36\uffff\1\u01b5",
			"\1\u0229\44\uffff\1\u01b6\36\uffff\1\u01b5",
			"\1\u0229\44\uffff\1\u01b6\36\uffff\1\u01b5",
			"\1\u022a\44\uffff\1\u01b9\36\uffff\1\u01b8",
			"\1\u022a\44\uffff\1\u01b9\36\uffff\1\u01b8",
			"\1\u022a\44\uffff\1\u01b9\36\uffff\1\u01b8",
			"\1\u022a\44\uffff\1\u01b9\36\uffff\1\u01b8",
			"\1\u022a\44\uffff\1\u01b9\36\uffff\1\u01b8",
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
			return "329:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= QCLREF ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.text));";
		}
	}

	static final String DFA77_eotS =
		"\100\uffff";
	static final String DFA77_eofS =
		"\100\uffff";
	static final String DFA77_minS =
		"\1\u00f5\1\2\1\76\1\3\1\2\1\3\4\uffff\1\u00b3\1\3\2\u00f2\1\3\2\2\2\3"+
		"\2\72\1\3\2\2\1\3\2\2\5\3\4\72\34\3";
	static final String DFA77_maxS =
		"\1\u00f5\1\2\1\u00fb\1\u00d8\1\2\1\u00d8\4\uffff\1\u00f3\1\107\2\u00f2"+
		"\1\u00d8\2\2\2\107\1\u00fb\1\u00d2\1\u00d8\2\2\1\u00d8\2\2\5\3\1\u00fb"+
		"\1\u00d2\1\u00fb\1\u00d2\5\107\12\3\1\u00d8\12\107\2\u00d8";
	static final String DFA77_acceptS =
		"\6\uffff\1\1\1\2\1\3\1\4\66\uffff";
	static final String DFA77_specialS =
		"\100\uffff}>";
	static final String[] DFA77_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\u00a4\uffff\1\4\16\uffff\1\5\10\uffff\1\3",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"\1\12",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"",
			"",
			"",
			"",
			"\1\14\76\uffff\1\13\1\15",
			"\1\16\44\uffff\1\20\36\uffff\1\17",
			"\1\21",
			"\1\22",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"\1\23",
			"\1\24",
			"\1\25\44\uffff\1\27\36\uffff\1\26",
			"\1\30\44\uffff\1\32\36\uffff\1\31",
			"\1\33\3\uffff\1\34\u00bc\uffff\1\34",
			"\1\35\127\uffff\1\37\77\uffff\1\36",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"\1\40",
			"\1\41",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51\3\uffff\1\52\u00bc\uffff\1\52",
			"\1\53\127\uffff\1\55\77\uffff\1\54",
			"\1\56\3\uffff\1\57\u00bc\uffff\1\57",
			"\1\60\127\uffff\1\62\77\uffff\1\61",
			"\1\63\44\uffff\1\20\36\uffff\1\17",
			"\1\63\44\uffff\1\20\36\uffff\1\17",
			"\1\63\44\uffff\1\20\36\uffff\1\17",
			"\1\63\44\uffff\1\20\36\uffff\1\17",
			"\1\63\44\uffff\1\20\36\uffff\1\17",
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
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"\1\76\44\uffff\1\27\36\uffff\1\26",
			"\1\76\44\uffff\1\27\36\uffff\1\26",
			"\1\76\44\uffff\1\27\36\uffff\1\26",
			"\1\76\44\uffff\1\27\36\uffff\1\26",
			"\1\76\44\uffff\1\27\36\uffff\1\26",
			"\1\77\44\uffff\1\32\36\uffff\1\31",
			"\1\77\44\uffff\1\32\36\uffff\1\31",
			"\1\77\44\uffff\1\32\36\uffff\1\31",
			"\1\77\44\uffff\1\32\36\uffff\1\31",
			"\1\77\44\uffff\1\32\36\uffff\1\31",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11",
			"\1\6\66\uffff\1\7\167\uffff\1\10\45\uffff\1\11"
	};

	static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
	static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
	static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
	static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
	static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
	static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
	static final short[][] DFA77_transition;

	static {
		int numStates = DFA77_transitionS.length;
		DFA77_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
		}
	}

	protected class DFA77 extends DFA {

		public DFA77(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 77;
			this.eot = DFA77_eot;
			this.eof = DFA77_eof;
			this.min = DFA77_min;
			this.max = DFA77_max;
			this.accept = DFA77_accept;
			this.special = DFA77_special;
			this.transition = DFA77_transition;
		}
		@Override
		public String getDescription() {
			return "997:1: quantity : ( ^( QUANTITY num= aNumber ) -> {$num.st}| ^( QUANTITY num= aNumber unit= ID ) -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY num= aNumber LITERAL_scalar ) -> template(number=$num.st) \"<number> scalar\"| ^( QUANTITY num= aNumber LITERAL_whole ) -> template(number=$num.st) \"<number> whole\");";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIT_NAME_in_unitName115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitName119 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_ID_in_unitName123 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula167 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula197 = new BitSet(new long[]{0x0400004000000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula200 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula204 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula237 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula241 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration303 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration310 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration314 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration367 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration374 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration378 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitExtension430 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension434 = new BitSet(new long[]{0x0000000010000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_TIMES_in_unitFactor479 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_number_in_unitFactor483 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor522 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFactor526 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_number_in_unitFactor530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary577 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration609 = new BitSet(new long[]{0x0000000000000000L,0x0010000084000000L,0x4000050002000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_enumerationType_in_type652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationType814 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType849 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType853 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType882 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType936 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType940 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType943 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType947 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType951 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType991 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType998 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1002 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1038 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1042 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1045 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1049 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1093 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1096 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1100 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1104 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1108 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1112 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1153 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1157 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1160 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1164 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1168 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1176 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1221 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1228 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1281 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1288 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1324 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1335 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1414 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1421 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1475 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1479 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1486 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1490 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1498 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1544 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1551 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1609 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1616 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1628 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1632 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1683 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1687 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1694 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1698 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1714 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1765 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1772 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1784 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType1792 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType1848 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType1854 = new BitSet(new long[]{0x0400000000000000L,0x0010000084000000L,0x4000050002000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType1858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList1905 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList1909 = new BitSet(new long[]{0x4000040000000008L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange1958 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1962 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0804000800000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange1966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_record_in_recordType2003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2007 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_LITERAL_variant_in_recordType2034 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2038 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_COLON_in_recordField2075 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordField2079 = new BitSet(new long[]{0x0400000000000000L,0x0010000084000000L,0x4000050002000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField2083 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary2124 = new BitSet(new long[]{0x0000000000034000L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2128 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2159 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables2195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables2199 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable2232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ghostVariable2237 = new BitSet(new long[]{0x0400000000000000L,0x0010000084000000L,0x4000050002000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable2241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2330 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2340 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2389 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2399 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2405 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2454 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2458 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion2528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2532 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion2542 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_in_variableList2586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList2604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList2608 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_TILDE_in_variable2642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable2646 = new BitSet(new long[]{0x0400000000000000L,0x0010000084000000L,0x4000050002000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable2650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue2703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction2734 = new BitSet(new long[]{0x0000000800000008L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair2768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair2772 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair2776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2815 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration2819 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2844 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration2848 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration2874 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration2878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration2882 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair2919 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationPair2923 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair2927 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue2966 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationValue2970 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue2974 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3040 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3044 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation3048 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3079 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3083 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_invocation3087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COLON_in_actualParameter3124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_actualParameter3128 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_actualParameter3132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction3213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction3217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction3223 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration3265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion3294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion3310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion3326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion3342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression3374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression3390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression3406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression3422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression3438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression3456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3460 = new BitSet(new long[]{0x048A004002080310L,0x020A000000480001L,0x0002100023880400L,0x10600A129C001948L,0x0000000000020280L});
	public static final BitSet FOLLOW_disjunction_in_expression3464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression3499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3503 = new BitSet(new long[]{0x048A004002080310L,0x020A000000480001L,0x0002100023880400L,0x10600A129C001948L,0x0000000000020280L});
	public static final BitSet FOLLOW_disjunction_in_expression3507 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification3551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification3555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000400000L});
	public static final BitSet FOLLOW_in_which_in_universalQuantification3559 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification3563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification3567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_in_which3616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_range_in_in_which3620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_which_in_in_which3647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_in_which3651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification3687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification3691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000400000L});
	public static final BitSet FOLLOW_in_which_in_existentialQuantification3695 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_existentialQuantification3699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification3703 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification3754 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification3758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000400000L});
	public static final BitSet FOLLOW_in_which_in_sumQuantification3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification3766 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sumQuantification3770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification3822 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification3826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000400000L});
	public static final BitSet FOLLOW_in_which_in_productQuantification3830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification3834 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_productQuantification3838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification3889 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification3893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000000000400000L});
	public static final BitSet FOLLOW_in_which_in_countingQuantification3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification3901 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_countingQuantification3905 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables3952 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_logicVariables3956 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_variable_in_logicVariables3982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction4003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4007 = new BitSet(new long[]{0x048A004002080318L,0x0202000000480001L,0x0002100003880400L,0x10600A1298001948L,0x0000000000020280L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction4033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4037 = new BitSet(new long[]{0x048A004002080318L,0x0202000000480001L,0x0002100003880400L,0x10600A1298001948L,0x0000000000020280L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction4063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4067 = new BitSet(new long[]{0x048A004002080318L,0x0202000000480001L,0x0002100003880400L,0x10600A1298001948L,0x0000000000020280L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction4112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4116 = new BitSet(new long[]{0x048A004002080318L,0x0202000000080001L,0x0002100003880400L,0x10600A1298001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction4142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4146 = new BitSet(new long[]{0x048A004002080318L,0x0202000000080001L,0x0002100003880400L,0x10600A1298001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_relation_in_conjunction4172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_relation4199 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4204 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_relation4238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4243 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4247 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AM_in_relation4279 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4284 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AL_in_relation4320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4325 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_relation4361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4366 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4370 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_EQUALS_in_relation4402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4407 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4411 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_relation4443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4448 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_NEQ_in_relation4482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4487 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060020088001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_addSub_in_relation4491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation4519 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4523 = new BitSet(new long[]{0x0000060060000000L});
	public static final BitSet FOLLOW_range_in_relation4527 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_addSub_in_relation4539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_range4566 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4570 = new BitSet(new long[]{0x0400000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_subexpression_in_range4574 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMADOT_in_range4612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4616 = new BitSet(new long[]{0x0400000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_subexpression_in_range4620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTCOMMA_in_range4658 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4662 = new BitSet(new long[]{0x0400000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_subexpression_in_range4666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMACOMMA_in_range4704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4708 = new BitSet(new long[]{0x0400000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_subexpression_in_range4712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_addSub4755 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub4759 = new BitSet(new long[]{0x0408004002080018L,0x0202000000080001L,0x0002100003880000L,0x1060000008001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_MINUS_in_addSub4785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub4789 = new BitSet(new long[]{0x0408004002080010L,0x0202000000080001L,0x0002100003880000L,0x1060000008001940L,0x0000000000020280L});
	public static final BitSet FOLLOW_multDiv_in_addSub4793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multDiv_in_addSub4825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multDiv4856 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4860 = new BitSet(new long[]{0x0408000002080018L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_DIVIDE_in_multDiv4886 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4890 = new BitSet(new long[]{0x0408000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4894 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_multDiv4926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4930 = new BitSet(new long[]{0x0408000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_multDiv4966 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4970 = new BitSet(new long[]{0x0408000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv4974 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_multDiv5006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5010 = new BitSet(new long[]{0x0408000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5082 = new BitSet(new long[]{0x0400000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5149 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_subexpression5185 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5225 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5297 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5361 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5386 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5390 = new BitSet(new long[]{0x0400000002080010L,0x0200000000080001L,0x0002000003800000L,0x1060000008001940L,0x0000000000020080L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5394 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5428 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5584 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_periodShift5588 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5620 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_periodShift5662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5686 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression5722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5726 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression5764 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5768 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5772 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression5806 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5810 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5814 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression5848 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5852 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression5888 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5892 = new BitSet(new long[]{0x0400000000000018L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression5918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression5922 = new BitSet(new long[]{0x0400000000000018L,0x0200000000000000L,0x0000000003000000L,0x0060000008000940L,0x0000000000020080L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression5957 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQ_in_conditionalExpression5961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5965 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5969 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression5978 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6024 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6030 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6066 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6104 = new BitSet(new long[]{0x0800000000000008L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_caseChoice6141 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_caseChoice6145 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RECORD_TERM_in_recordTerm6186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordTerm6190 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6194 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordValue6237 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000003000000L,0x0060000000000940L,0x0000000000000080L});
	public static final BitSet FOLLOW_value_in_recordValue6241 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_predicate6278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6398 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6400 = new BitSet(new long[]{0x0000000014000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6444 = new BitSet(new long[]{0x0000040000000008L,0x0002000000000000L,0x0000100000080000L,0x0000020080000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_DOT_in_valueName6451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6455 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_valueName6500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6504 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6544 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6571 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6606 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6633 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6637 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6743 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6747 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6794 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6798 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L,0x0000100000080000L,0x0000020080000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6802 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6868 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6872 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_partialName6904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_constant6931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant6949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant6967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant6985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant7003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7028 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7032 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7052 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7056 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity7060 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7092 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7098 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_number_in_aNumber7166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QCLREF_in_aNumber7194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7226 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7267 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7271 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7275 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7317 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7367 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7375 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7379 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7476 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7480 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_number_in_propertyField7526 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7580 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7584 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause7674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7679 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000400000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7686 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7704 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7709 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7726 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7739 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7744 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7757 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7830 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_throwsClause7834 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7871 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification7904 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification7910 = new BitSet(new long[]{0x0000000000000440L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification7917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification7919 = new BitSet(new long[]{0x0000000000000008L,0x0000001000000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification7925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7974 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration8006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration8010 = new BitSet(new long[]{0x0000000000074008L,0x0000080000000000L,0x0280000000400001L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration8016 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration8020 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration8029 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L,0x0280000000400001L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration8039 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L,0x0280000000000001L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration8044 = new BitSet(new long[]{0x0000000000000008L,0x0000080000000000L,0x0200000000000001L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration8049 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0200000000000001L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration8054 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration8059 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause8119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause8123 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm8159 = new BitSet(new long[]{0x0400000004000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8165 = new BitSet(new long[]{0x0000000000040000L,0x7820000000000000L,0x0140000000000000L,0x0000600000200002L,0x0000000000000040L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm8203 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8207 = new BitSet(new long[]{0x0000000000040000L,0x7820000000000000L,0x0140000000000000L,0x0000600000200002L,0x0000000000000040L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions8245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8249 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions8275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8279 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8305 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_assertedAction8330 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_assertedAction8334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8338 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_S_in_assertedAction8345 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_action_in_assertedAction8349 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_assertedAction8355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_basicAction_in_action8401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction8563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException8680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_issueException8684 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException8688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_assignment8732 = new BitSet(new long[]{0x0000000000000000L,0x0040000000A00000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8736 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_nameTick8775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_nameTick8779 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_valueName_in_nameTick8804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8877 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8885 = new BitSet(new long[]{0x0400000000000008L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8892 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8896 = new BitSet(new long[]{0x0000000000000008L,0x0040000000A00000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8936 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8938 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_whenThrow8942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8946 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8950 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8962 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation9008 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9012 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9016 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9020 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation9062 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9066 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9070 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9074 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation9116 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9120 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9124 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9128 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation9170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9174 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9178 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9182 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation9224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9228 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9232 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9236 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction9282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction9300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction9318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation9344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTime_in_computation9348 = new BitSet(new long[]{0x0400000000000008L,0x0000000040000000L,0x0000000000000000L,0x0060000008000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_behaviorTime_in_computation9352 = new BitSet(new long[]{0x0000000000000008L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation9359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QCREF_in_computation9363 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_PORT_OUTPUT_in_portOutput9414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portOutput9418 = new BitSet(new long[]{0x0000000000000008L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_portOutput9422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PORT_INPUT_in_portInput9464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portInput9468 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_valueName_in_portInput9472 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUBPROGRAM_INVOCATION_in_subprogramCall9516 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_subprogramCall9520 = new BitSet(new long[]{0x0400000014000018L,0x0200000000000000L,0x0000000002000000L,0x0060000008000800L,0x0000000000000080L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall9524 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList9569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList9573 = new BitSet(new long[]{0x0400000004000018L,0x0200000000000000L,0x0000000002000000L,0x0060000008000800L,0x0000000000000080L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList9599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalActual9628 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalActual9632 = new BitSet(new long[]{0x0400000000000010L,0x0200000000000000L,0x0000000002000000L,0x0060000008000800L,0x0000000000000080L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual9636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual9666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter9680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter9695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter9710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative9738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_guardedAction_in_alternative9742 = new BitSet(new long[]{0x0100000000000008L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction9779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_guardedAction9783 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction9787 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop9826 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop9830 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_INVARIANT_in_whileLoop9834 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_whileLoop9845 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9849 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop9863 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop9912 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_forLoop9916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop9920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forLoop9924 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_forLoop9928 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_forLoop9934 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_forLoop9938 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9952 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop10007 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop10011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop10015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_doUntilLoop10021 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop10025 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_doUntilLoop10032 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop10036 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop10049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification10102 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification10106 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification10111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification10115 = new BitSet(new long[]{0x0000000000000000L,0x0040000000200000L,0x0000001004000280L,0x0000000000000001L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification10119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification10125 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause10175 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause10183 = new BitSet(new long[]{0x0000000000000008L,0x0000000008000000L,0x0800000000004000L,0x0000000000080400L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause10192 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0800000000004000L,0x0000000000080400L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause10203 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0800000000000000L,0x0000000000080400L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause10212 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0800000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause10221 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause10230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause10292 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_invariantClause10296 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection10328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection10332 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection10363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection10367 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState10399 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState10403 = new BitSet(new long[]{0x0400000000000000L,0x0000004000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState10408 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState10413 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_behaviorState10418 = new BitSet(new long[]{0x0000000000034008L});
	public static final BitSet FOLLOW_assertion_in_behaviorState10422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions10477 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions10481 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_TRANSITION_in_behaviorTransition10514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_behaviorTransition10518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10522 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000080L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition10526 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SOURCE_in_behaviorTransition10533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10537 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_CONDITION_in_behaviorTransition10549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition10553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESTINATION_in_behaviorTransition10560 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10564 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_behaviorTransition10574 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition10578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_behaviorTransition10585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition10589 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_priority10661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTEGER_LIT_in_priority10665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_priority10667 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition10698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition10715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition10733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition10751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition10779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition10783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_executeCondition10818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10877 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_internalCondition10881 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10917 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10921 = new BitSet(new long[]{0x0400000000000008L,0x0000000000400000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10978 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10982 = new BitSet(new long[]{0x0400000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction11008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger11034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger11052 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger11058 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger11062 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger11072 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime11106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime11122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_behaviorTime11138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName11166 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTEGER_LIT_in_portName11170 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_and_in_triggerLogicalExpression11207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11211 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_or_in_triggerLogicalExpression11238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11242 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_triggerLogicalExpression11269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11273 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_then_in_triggerLogicalExpression11300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11304 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_else_in_triggerLogicalExpression11331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11335 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_eventTrigger11386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger11405 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger11409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger11411 = new BitSet(new long[]{0x0000000000000008L});
}
