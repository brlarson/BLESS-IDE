// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g 2023-03-27 17:59:01

//copyright 2012 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.antlr3generated.BLESStoASTLexer;
import com.multitude.bless.BLESS;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.*;
import java.util.ArrayList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class ASTtoAST extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADL_STRING_LITERAL", "AADL_STRING_PART", 
		"ACTION", "AL", "AM", "AMPERSAND", "ANNEX_END", "ANNEX_START", "ARROW", 
		"ASSERTION", "ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", 
		"ASSIGN", "AT_SIGN", "BASE", "BASED_INTEGER", "BEHAVIOR_GUARD", "BEHAVIOR_TIME", 
		"BI", "BOUND", "BOX", "CARET", "CASE_EXPRESSION", "COLON", "COLON_TILDE", 
		"COMMA", "COMMACOMMA", "COMMADOT", "COMPLEX", "COMPONENT", "CONDITION", 
		"CONDITIONAL", "CONDITIONAL_FUNCTION", "CONNECTION", "COUNTING_TRIGGER", 
		"DESTINATION", "DIGIT", "DIVIDE", "DOLLAR", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", 
		"DOUBLE_QUOTE", "DO_NOT_PROVE", "DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", 
		"EQ", "EXCLAMATION", "EXP", "EXPONENT", "EXTENDED_DIGIT", "FLOATING", 
		"FUNCTION", "FUNCTION_CALL", "GT", "GUARD", "HEX_DIGIT", "ID", "IMP", 
		"INMODE", "INOUT", "INTEGER_LIT", "INT_EXPONENT", "INVARIANT", "INVOKE", 
		"INVOKE_FUNCTION", "IP_NAME", "IP_PE", "IP_PRED", "LABEL", "LASS", "LBRACKET", 
		"LCON", "LCURLY", "LITERAL_Assertion", "LITERAL_Invariant", "LITERAL_Postcondition", 
		"LITERAL_Precondition", "LITERAL_Typed", "LITERAL_aadlboolean", "LITERAL_aadlinteger", 
		"LITERAL_aadlreal", "LITERAL_aadlstring", "LITERAL_abs", "LITERAL_abstract", 
		"LITERAL_access", "LITERAL_all", "LITERAL_and", "LITERAL_annex", "LITERAL_any", 
		"LITERAL_applies", "LITERAL_are", "LITERAL_array", "LITERAL_assert", "LITERAL_availability", 
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
		"LITERAL_fresh", "LITERAL_function", "LITERAL_group", "LITERAL_hr", "LITERAL_if", 
		"LITERAL_iff", "LITERAL_implementation", "LITERAL_implies", "LITERAL_in", 
		"LITERAL_inherit", "LITERAL_initial", "LITERAL_integer", "LITERAL_invariant", 
		"LITERAL_inverse", "LITERAL_is", "LITERAL_list", "LITERAL_lower_bound", 
		"LITERAL_memory", "LITERAL_min", "LITERAL_mod", "LITERAL_mode", "LITERAL_modes", 
		"LITERAL_ms", "LITERAL_natural", "LITERAL_none", "LITERAL_nonvolatile", 
		"LITERAL_not", "LITERAL_now", "LITERAL_ns", "LITERAL_null", "LITERAL_numberof", 
		"LITERAL_of", "LITERAL_on", "LITERAL_or", "LITERAL_out", "LITERAL_package", 
		"LITERAL_parameter", "LITERAL_pause", "LITERAL_port", "LITERAL_post", 
		"LITERAL_pre", "LITERAL_private", "LITERAL_procedure", "LITERAL_process", 
		"LITERAL_processor", "LITERAL_product", "LITERAL_properties", "LITERAL_property", 
		"LITERAL_prototypes", "LITERAL_provides", "LITERAL_ps", "LITERAL_public", 
		"LITERAL_range", "LITERAL_rational", "LITERAL_real", "LITERAL_record", 
		"LITERAL_reference", "LITERAL_rem", "LITERAL_renames", "LITERAL_requires", 
		"LITERAL_sec", "LITERAL_self", "LITERAL_sequence", "LITERAL_set", "LITERAL_setmode", 
		"LITERAL_shared", "LITERAL_skip", "LITERAL_spread", "LITERAL_state", "LITERAL_states", 
		"LITERAL_stop", "LITERAL_string", "LITERAL_subcomponents", "LITERAL_subprogram", 
		"LITERAL_sum", "LITERAL_swap", "LITERAL_system", "LITERAL_that", "LITERAL_then", 
		"LITERAL_thread", "LITERAL_throw", "LITERAL_time", "LITERAL_timeout", 
		"LITERAL_to", "LITERAL_tops", "LITERAL_transition", "LITERAL_transitions", 
		"LITERAL_true", "LITERAL_type", "LITERAL_units", "LITERAL_until", "LITERAL_updated", 
		"LITERAL_upper_bound", "LITERAL_us", "LITERAL_variables", "LITERAL_variant", 
		"LITERAL_virtual", "LITERAL_when", "LITERAL_while", "LITERAL_with", "LITERAL_xor", 
		"LPAREN", "LT", "LTE_STRING", "LT_STRING", "MINUS", "MT_STRING", "NEQ", 
		"OBLIGATION", "OCTOTHORPE", "ON", "P", "PARAMETER", "PARAMETERS", "PERIOD", 
		"PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", 
		"PREDICATE_RELATION", "PROCEDURE", "PROCEDURE_CALL", "PROPERTY_LIST", 
		"Q", "QQ", "QUESTION", "RASS", "RATIONAL", "RBRACKET", "RCON", "RCURLY", 
		"REAL_LIT", "RECORD_VALUE", "RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", 
		"START", "START_ASSERTION_PROPERTY", "STOP", "SUBCOMPONENT", "SUBPROGRAM_ANNEX", 
		"THREAD_ANNEX", "THREAD_GROUP", "TICK", "TILDE", "TIMES", "TOP", "TRANSITION", 
		"TYPE", "TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", "VALUE", 
		"WP", "WS", "'|'", "LITERAL_BLESS"
	};
	public static final int EOF=-1;
	public static final int T__304=304;
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
	public static final int BASE=19;
	public static final int BASED_INTEGER=20;
	public static final int BEHAVIOR_GUARD=21;
	public static final int BEHAVIOR_TIME=22;
	public static final int BI=23;
	public static final int BOUND=24;
	public static final int BOX=25;
	public static final int CARET=26;
	public static final int CASE_EXPRESSION=27;
	public static final int COLON=28;
	public static final int COLON_TILDE=29;
	public static final int COMMA=30;
	public static final int COMMACOMMA=31;
	public static final int COMMADOT=32;
	public static final int COMPLEX=33;
	public static final int COMPONENT=34;
	public static final int CONDITION=35;
	public static final int CONDITIONAL=36;
	public static final int CONDITIONAL_FUNCTION=37;
	public static final int CONNECTION=38;
	public static final int COUNTING_TRIGGER=39;
	public static final int DESTINATION=40;
	public static final int DIGIT=41;
	public static final int DIVIDE=42;
	public static final int DOLLAR=43;
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
	public static final int FUNCTION_CALL=59;
	public static final int GT=60;
	public static final int GUARD=61;
	public static final int HEX_DIGIT=62;
	public static final int ID=63;
	public static final int IMP=64;
	public static final int INMODE=65;
	public static final int INOUT=66;
	public static final int INTEGER_LIT=67;
	public static final int INT_EXPONENT=68;
	public static final int INVARIANT=69;
	public static final int INVOKE=70;
	public static final int INVOKE_FUNCTION=71;
	public static final int IP_NAME=72;
	public static final int IP_PE=73;
	public static final int IP_PRED=74;
	public static final int LABEL=75;
	public static final int LASS=76;
	public static final int LBRACKET=77;
	public static final int LCON=78;
	public static final int LCURLY=79;
	public static final int LITERAL_Assertion=80;
	public static final int LITERAL_Invariant=81;
	public static final int LITERAL_Postcondition=82;
	public static final int LITERAL_Precondition=83;
	public static final int LITERAL_Typed=84;
	public static final int LITERAL_aadlboolean=85;
	public static final int LITERAL_aadlinteger=86;
	public static final int LITERAL_aadlreal=87;
	public static final int LITERAL_aadlstring=88;
	public static final int LITERAL_abs=89;
	public static final int LITERAL_abstract=90;
	public static final int LITERAL_access=91;
	public static final int LITERAL_all=92;
	public static final int LITERAL_and=93;
	public static final int LITERAL_annex=94;
	public static final int LITERAL_any=95;
	public static final int LITERAL_applies=96;
	public static final int LITERAL_are=97;
	public static final int LITERAL_array=98;
	public static final int LITERAL_assert=99;
	public static final int LITERAL_availability=100;
	public static final int LITERAL_boolean=101;
	public static final int LITERAL_bound=102;
	public static final int LITERAL_bus=103;
	public static final int LITERAL_call=104;
	public static final int LITERAL_calls=105;
	public static final int LITERAL_cand=106;
	public static final int LITERAL_catch=107;
	public static final int LITERAL_classifier=108;
	public static final int LITERAL_complete=109;
	public static final int LITERAL_complex=110;
	public static final int LITERAL_component=111;
	public static final int LITERAL_computation=112;
	public static final int LITERAL_connection=113;
	public static final int LITERAL_connections=114;
	public static final int LITERAL_constant=115;
	public static final int LITERAL_cor=116;
	public static final int LITERAL_count=117;
	public static final int LITERAL_data=118;
	public static final int LITERAL_declare=119;
	public static final int LITERAL_def=120;
	public static final int LITERAL_delay=121;
	public static final int LITERAL_device=122;
	public static final int LITERAL_dispatch=123;
	public static final int LITERAL_do=124;
	public static final int LITERAL_else=125;
	public static final int LITERAL_end=126;
	public static final int LITERAL_enumeration=127;
	public static final int LITERAL_event=128;
	public static final int LITERAL_exception=129;
	public static final int LITERAL_exists=130;
	public static final int LITERAL_extends=131;
	public static final int LITERAL_false=132;
	public static final int LITERAL_feature=133;
	public static final int LITERAL_features=134;
	public static final int LITERAL_fetchadd=135;
	public static final int LITERAL_fetchand=136;
	public static final int LITERAL_fetchor=137;
	public static final int LITERAL_fetchxor=138;
	public static final int LITERAL_fi=139;
	public static final int LITERAL_final=140;
	public static final int LITERAL_flow=141;
	public static final int LITERAL_flows=142;
	public static final int LITERAL_for=143;
	public static final int LITERAL_forall=144;
	public static final int LITERAL_fresh=145;
	public static final int LITERAL_function=146;
	public static final int LITERAL_group=147;
	public static final int LITERAL_hr=148;
	public static final int LITERAL_if=149;
	public static final int LITERAL_iff=150;
	public static final int LITERAL_implementation=151;
	public static final int LITERAL_implies=152;
	public static final int LITERAL_in=153;
	public static final int LITERAL_inherit=154;
	public static final int LITERAL_initial=155;
	public static final int LITERAL_integer=156;
	public static final int LITERAL_invariant=157;
	public static final int LITERAL_inverse=158;
	public static final int LITERAL_is=159;
	public static final int LITERAL_list=160;
	public static final int LITERAL_lower_bound=161;
	public static final int LITERAL_memory=162;
	public static final int LITERAL_min=163;
	public static final int LITERAL_mod=164;
	public static final int LITERAL_mode=165;
	public static final int LITERAL_modes=166;
	public static final int LITERAL_ms=167;
	public static final int LITERAL_natural=168;
	public static final int LITERAL_none=169;
	public static final int LITERAL_nonvolatile=170;
	public static final int LITERAL_not=171;
	public static final int LITERAL_now=172;
	public static final int LITERAL_ns=173;
	public static final int LITERAL_null=174;
	public static final int LITERAL_numberof=175;
	public static final int LITERAL_of=176;
	public static final int LITERAL_on=177;
	public static final int LITERAL_or=178;
	public static final int LITERAL_out=179;
	public static final int LITERAL_package=180;
	public static final int LITERAL_parameter=181;
	public static final int LITERAL_pause=182;
	public static final int LITERAL_port=183;
	public static final int LITERAL_post=184;
	public static final int LITERAL_pre=185;
	public static final int LITERAL_private=186;
	public static final int LITERAL_procedure=187;
	public static final int LITERAL_process=188;
	public static final int LITERAL_processor=189;
	public static final int LITERAL_product=190;
	public static final int LITERAL_properties=191;
	public static final int LITERAL_property=192;
	public static final int LITERAL_prototypes=193;
	public static final int LITERAL_provides=194;
	public static final int LITERAL_ps=195;
	public static final int LITERAL_public=196;
	public static final int LITERAL_range=197;
	public static final int LITERAL_rational=198;
	public static final int LITERAL_real=199;
	public static final int LITERAL_record=200;
	public static final int LITERAL_reference=201;
	public static final int LITERAL_rem=202;
	public static final int LITERAL_renames=203;
	public static final int LITERAL_requires=204;
	public static final int LITERAL_sec=205;
	public static final int LITERAL_self=206;
	public static final int LITERAL_sequence=207;
	public static final int LITERAL_set=208;
	public static final int LITERAL_setmode=209;
	public static final int LITERAL_shared=210;
	public static final int LITERAL_skip=211;
	public static final int LITERAL_spread=212;
	public static final int LITERAL_state=213;
	public static final int LITERAL_states=214;
	public static final int LITERAL_stop=215;
	public static final int LITERAL_string=216;
	public static final int LITERAL_subcomponents=217;
	public static final int LITERAL_subprogram=218;
	public static final int LITERAL_sum=219;
	public static final int LITERAL_swap=220;
	public static final int LITERAL_system=221;
	public static final int LITERAL_that=222;
	public static final int LITERAL_then=223;
	public static final int LITERAL_thread=224;
	public static final int LITERAL_throw=225;
	public static final int LITERAL_time=226;
	public static final int LITERAL_timeout=227;
	public static final int LITERAL_to=228;
	public static final int LITERAL_tops=229;
	public static final int LITERAL_transition=230;
	public static final int LITERAL_transitions=231;
	public static final int LITERAL_true=232;
	public static final int LITERAL_type=233;
	public static final int LITERAL_units=234;
	public static final int LITERAL_until=235;
	public static final int LITERAL_updated=236;
	public static final int LITERAL_upper_bound=237;
	public static final int LITERAL_us=238;
	public static final int LITERAL_variables=239;
	public static final int LITERAL_variant=240;
	public static final int LITERAL_virtual=241;
	public static final int LITERAL_when=242;
	public static final int LITERAL_while=243;
	public static final int LITERAL_with=244;
	public static final int LITERAL_xor=245;
	public static final int LPAREN=246;
	public static final int LT=247;
	public static final int LTE_STRING=248;
	public static final int LT_STRING=249;
	public static final int MINUS=250;
	public static final int MT_STRING=251;
	public static final int NEQ=252;
	public static final int OBLIGATION=253;
	public static final int OCTOTHORPE=254;
	public static final int ON=255;
	public static final int P=256;
	public static final int PARAMETER=257;
	public static final int PARAMETERS=258;
	public static final int PERIOD=259;
	public static final int PLUS=260;
	public static final int PLUS_ARROW=261;
	public static final int PLUS_EQUALS=262;
	public static final int PORT=263;
	public static final int PORT_INPUT=264;
	public static final int PORT_OUTPUT=265;
	public static final int PREDICATE_RELATION=266;
	public static final int PROCEDURE=267;
	public static final int PROCEDURE_CALL=268;
	public static final int PROPERTY_LIST=269;
	public static final int Q=270;
	public static final int QQ=271;
	public static final int QUESTION=272;
	public static final int RASS=273;
	public static final int RATIONAL=274;
	public static final int RBRACKET=275;
	public static final int RCON=276;
	public static final int RCURLY=277;
	public static final int REAL_LIT=278;
	public static final int RECORD_VALUE=279;
	public static final int RPAREN=280;
	public static final int S=281;
	public static final int SEMICOLON=282;
	public static final int SLCOMMENT=283;
	public static final int SOURCE=284;
	public static final int START=285;
	public static final int START_ASSERTION_PROPERTY=286;
	public static final int STOP=287;
	public static final int SUBCOMPONENT=288;
	public static final int SUBPROGRAM_ANNEX=289;
	public static final int THREAD_ANNEX=290;
	public static final int THREAD_GROUP=291;
	public static final int TICK=292;
	public static final int TILDE=293;
	public static final int TIMES=294;
	public static final int TOP=295;
	public static final int TRANSITION=296;
	public static final int TYPE=297;
	public static final int TYPE_OPERATOR=298;
	public static final int TYPE_OPERATOR_INVOCATION=299;
	public static final int UNARY_MINUS=300;
	public static final int VALUE=301;
	public static final int WP=302;
	public static final int WS=303;
	public static final int LITERAL_BLESS=305;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ASTtoAST(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ASTtoAST(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ASTtoAST.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g"; }


	public ASTtoAST(BAST useThisASTforRoot)
	  {
	  this(new CommonTreeNodeStream(useThisASTforRoot));
	  }

	public boolean toldASTtoAST=false;         
	public void tell(String s, RecognitionException re, BAST problem)
	  {
	  Dump.it("ASTtoAST.tell "+s);
	  if (!toldASTtoAST)
	    {
	    toldASTtoAST=true;
	    if (problem != null)
	      {
	      problem.showParseTree(s);
	      Dump.it(problem.toStringTree());
	      }
	    reportError(re);  
	    }
	  } //end of tell

	public boolean recognitionErrorOccurred = false;    //did a parse error occur?

	public void reportError(RecognitionException ex)
	  {
	  Dump.it("ASTtoAST.reportError(RecognitionException ex)=> "
	    +ex.getMessage());
	  Dump.it(getErrorHeader(ex));
	  Dump.it(ex);
	  recognitionErrorOccurred = true;
	  if ((ex.node!=null)&&(ex.node instanceof BAST))
	    ((BAST)ex.node).showParseTree(((BAST)ex.node).getText());
	  super.reportError(ex);
	  HelpfulHints.giveHint();
	  }

	//public void emitErrorMessage(String msg) 
	//  {
	//  System.err.println(msg);
	//  Dump.it(msg);
	//  }

	  public BAST
	makeConjunctionOfAssertions(BAST amp)
	  {
	  if (amp==null)
	    {Dump.it("null parameter to ASTtoAST.makeConjunctionOfAssertions"); return null;}
	  if (!amp.hasType(BLESStoASTLexer.AMPERSAND))
	    {Dump.it("parameter to ASTtoAST.makeConjunctionOfAssertions"+
	      " must be AMPERSAND "+amp.getText()); return null;}
	  if (amp.getChildCount()==0)
	    {return null;}  //no Assertions on the &
	  if (amp.getChildCount()==1)
	    {return (BAST)amp.getChild(0);}  //return only child of &
	  //o.w. make conjunction
	  BAST theAnd = new BAST("and",BLESStoASTLexer.LITERAL_and,amp);
	  for (int f=0; f<amp.getChildCount();f++)
	    {
	    BAST anAssertion = (BAST)amp.getChild(f);
	    if (!amp.hasType(BLESStoASTLexer.ASSERTION))
	      {Dump.it("children of & of parameter to ASTtoAST.makeConjunctionOfAssertions"+
	        " must be ASSERTION "+amp.getText()); return null;}
	    if (anAssertion.getChildCount()==1) //just predicate as child
	      theAnd.addChild((BAST)anAssertion.getChild(0));
	    else if (anAssertion.getChildCount()==2) //label and  predicate 
	      theAnd.addChild((BAST)anAssertion.getChild(1));
	    else if (anAssertion.getChildCount()==3) //label, parameters and  predicate 
	      theAnd.addChild((BAST)anAssertion.getChild(2));
	    }
	  return theAnd;
	  } //end of makeConjunctionOfAssertions

	  /**put parentheses around t*/
	  public static BAST
	  parenthesize(BAST t)
	  { //put parentheses around t
	    BAST lp = new BAST("(",BLESStoASTLexer.LPAREN,t);
	    lp.addChild(t);
	    lp.addChild(new BAST(")",BLESStoASTLexer.RPAREN,t));
	    return lp;
	  }
	  


	public static class makeAnAllAreTree_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "makeAnAllAreTree"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:123:1: makeAnAllAreTree[Tree a, Tree t, Tree r, Tree p1] : -> ^( LITERAL_all COLON LITERAL_in LITERAL_are ) ;
	public final ASTtoAST.makeAnAllAreTree_return makeAnAllAreTree(Tree a, Tree t, Tree r, Tree p1) throws RecognitionException {
		ASTtoAST.makeAnAllAreTree_return retval = new ASTtoAST.makeAnAllAreTree_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:124:3: ( -> ^( LITERAL_all COLON LITERAL_in LITERAL_are ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:125:3: 
			{
			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 125:3: -> ^( LITERAL_all COLON LITERAL_in LITERAL_are )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:125:6: ^( LITERAL_all COLON LITERAL_in LITERAL_are )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_all, "LITERAL_all"), root_1);
				adaptor.addChild(root_1, a);
				adaptor.addChild(root_1, (BAST)adaptor.create(COLON, "COLON"));
				adaptor.addChild(root_1, t);
				adaptor.addChild(root_1, (BAST)adaptor.create(LITERAL_in, "LITERAL_in"));
				adaptor.addChild(root_1, r);
				adaptor.addChild(root_1, (BAST)adaptor.create(LITERAL_are, "LITERAL_are"));
				adaptor.addChild(root_1, p1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "makeAnAllAreTree"


	public static class getPredicateFromAssertion_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getPredicateFromAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:128:1: getPredicateFromAssertion : ^( ASSERTION ( ^( LABEL ID ) )? ( ^( PARAMETERS ( ID )+ ) )? p= . ) ->;
	public final ASTtoAST.getPredicateFromAssertion_return getPredicateFromAssertion() throws RecognitionException {
		ASTtoAST.getPredicateFromAssertion_return retval = new ASTtoAST.getPredicateFromAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST ASSERTION1=null;
		BAST LABEL2=null;
		BAST ID3=null;
		BAST PARAMETERS4=null;
		BAST ID5=null;
		BAST p=null;

		BAST ASSERTION1_tree=null;
		BAST LABEL2_tree=null;
		BAST ID3_tree=null;
		BAST PARAMETERS4_tree=null;
		BAST ID5_tree=null;
		BAST p_tree=null;
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LABEL=new RewriteRuleNodeStream(adaptor,"token LABEL");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_PARAMETERS=new RewriteRuleNodeStream(adaptor,"token PARAMETERS");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:129:3: ( ^( ASSERTION ( ^( LABEL ID ) )? ( ^( PARAMETERS ( ID )+ ) )? p= . ) ->)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:3: ^( ASSERTION ( ^( LABEL ID ) )? ( ^( PARAMETERS ( ID )+ ) )? p= . )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ASSERTION1=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_getPredicateFromAssertion102); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_ASSERTION.add(ASSERTION1);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:17: ( ^( LABEL ID ) )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==LABEL) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==DOWN) ) {
					int LA1_3 = input.LA(3);
					if ( (LA1_3==ID) ) {
						int LA1_4 = input.LA(4);
						if ( (LA1_4==UP) ) {
							int LA1_5 = input.LA(5);
							if ( ((LA1_5 >= AADL_STRING_LITERAL && LA1_5 <= LITERAL_BLESS)) ) {
								alt1=1;
							}
						}
					}
				}
			}
			switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:18: ^( LABEL ID )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LABEL2=(BAST)match(input,LABEL,FOLLOW_LABEL_in_getPredicateFromAssertion108); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(LABEL2);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					ID3=(BAST)match(input,ID,FOLLOW_ID_in_getPredicateFromAssertion110); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(ID3);

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:34: ( ^( PARAMETERS ( ID )+ ) )?
			int alt3=2;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:35: ^( PARAMETERS ( ID )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					PARAMETERS4=(BAST)match(input,PARAMETERS,FOLLOW_PARAMETERS_in_getPredicateFromAssertion118); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PARAMETERS.add(PARAMETERS4);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:48: ( ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:48: ID
							{
							_last = (BAST)input.LT(1);
							ID5=(BAST)match(input,ID,FOLLOW_ID_in_getPredicateFromAssertion120); if (state.failed) return retval;
							 
							if ( state.backtracking==0 ) stream_ID.add(ID5);

							if ( state.backtracking==0 ) {
							}

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

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			p=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			p_tree = (BAST)adaptor.dupTree(p);
			adaptor.addChild(root_1, p_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 131:5: ->
			{
				adaptor.addChild(root_0, p);
			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getPredicateFromAssertion"


	public static class getBehaviorActionsFromELQ_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getBehaviorActionsFromELQ"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:135:1: getBehaviorActionsFromELQ : ^( LCURLY ( ^( LITERAL_declare ( . )* ) )? ba= . RCURLY ) ->;
	public final ASTtoAST.getBehaviorActionsFromELQ_return getBehaviorActionsFromELQ() throws RecognitionException {
		ASTtoAST.getBehaviorActionsFromELQ_return retval = new ASTtoAST.getBehaviorActionsFromELQ_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST LCURLY6=null;
		BAST LITERAL_declare7=null;
		BAST wildcard8=null;
		BAST RCURLY9=null;
		BAST ba=null;

		BAST LCURLY6_tree=null;
		BAST LITERAL_declare7_tree=null;
		BAST wildcard8_tree=null;
		BAST RCURLY9_tree=null;
		BAST ba_tree=null;
		RewriteRuleNodeStream stream_LCURLY=new RewriteRuleNodeStream(adaptor,"token LCURLY");
		RewriteRuleNodeStream stream_LITERAL_declare=new RewriteRuleNodeStream(adaptor,"token LITERAL_declare");
		RewriteRuleNodeStream stream_RCURLY=new RewriteRuleNodeStream(adaptor,"token RCURLY");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:136:3: ( ^( LCURLY ( ^( LITERAL_declare ( . )* ) )? ba= . RCURLY ) ->)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:3: ^( LCURLY ( ^( LITERAL_declare ( . )* ) )? ba= . RCURLY )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LCURLY6=(BAST)match(input,LCURLY,FOLLOW_LCURLY_in_getBehaviorActionsFromELQ157); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY6);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:12: ( ^( LITERAL_declare ( . )* ) )?
			int alt5=2;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:13: ^( LITERAL_declare ( . )* )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_declare7=(BAST)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_getBehaviorActionsFromELQ161); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_declare.add(LITERAL_declare7);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:31: ( . )*
						loop4:
						while (true) {
							int alt4=2;
							int LA4_0 = input.LA(1);
							if ( ((LA4_0 >= AADL_STRING_LITERAL && LA4_0 <= LITERAL_BLESS)) ) {
								alt4=1;
							}
							else if ( (LA4_0==UP) ) {
								alt4=2;
							}

							switch (alt4) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:31: .
								{
								_last = (BAST)input.LT(1);
								wildcard8=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard8_tree = (BAST)adaptor.dupTree(wildcard8);
								adaptor.addChild(root_2, wildcard8_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

							default :
								break loop4;
							}
						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			ba=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ba_tree = (BAST)adaptor.dupTree(ba);
			adaptor.addChild(root_1, ba_tree);
			}

			_last = (BAST)input.LT(1);
			RCURLY9=(BAST)match(input,RCURLY,FOLLOW_RCURLY_in_getBehaviorActionsFromELQ174); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY9);

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 138:5: ->
			{
				adaptor.addChild(root_0, ba);
			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getBehaviorActionsFromELQ"


	public static class getPreconditionFromBehaviorActionsInELQ_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getPreconditionFromBehaviorActionsInELQ"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:142:1: getPreconditionFromBehaviorActionsInELQ : ^( LCURLY (v= . )? ba= getPreconditionFromBehaviorActions RCURLY ) ->;
	public final ASTtoAST.getPreconditionFromBehaviorActionsInELQ_return getPreconditionFromBehaviorActionsInELQ() throws RecognitionException {
		ASTtoAST.getPreconditionFromBehaviorActionsInELQ_return retval = new ASTtoAST.getPreconditionFromBehaviorActionsInELQ_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST LCURLY10=null;
		BAST RCURLY11=null;
		BAST v=null;
		TreeRuleReturnScope ba =null;

		BAST LCURLY10_tree=null;
		BAST RCURLY11_tree=null;
		BAST v_tree=null;
		RewriteRuleNodeStream stream_LCURLY=new RewriteRuleNodeStream(adaptor,"token LCURLY");
		RewriteRuleNodeStream stream_RCURLY=new RewriteRuleNodeStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_getPreconditionFromBehaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule getPreconditionFromBehaviorActions");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:143:3: ( ^( LCURLY (v= . )? ba= getPreconditionFromBehaviorActions RCURLY ) ->)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:144:3: ^( LCURLY (v= . )? ba= getPreconditionFromBehaviorActions RCURLY )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LCURLY10=(BAST)match(input,LCURLY,FOLLOW_LCURLY_in_getPreconditionFromBehaviorActionsInELQ203); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY10);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:144:13: (v= . )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ACTION) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==DOWN) ) {
					int LA6_6 = input.LA(3);
					if ( (LA6_6==P) ) {
						int LA6_10 = input.LA(4);
						if ( ((LA6_10 >= UP && LA6_10 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( ((LA6_6 >= AADL_STRING_LITERAL && LA6_6 <= ON)||(LA6_6 >= PARAMETER && LA6_6 <= LITERAL_BLESS)) ) {
						alt6=1;
					}
				}
				else if ( (LA6_1==ACTION||LA6_1==AMPERSAND||LA6_1==LCURLY||LA6_1==SEMICOLON) ) {
					alt6=1;
				}
			}
			else if ( (LA6_0==SEMICOLON) ) {
				int LA6_2 = input.LA(2);
				if ( (LA6_2==DOWN) ) {
					int LA6_7 = input.LA(3);
					if ( (LA6_7==ACTION) ) {
						int LA6_11 = input.LA(4);
						if ( ((LA6_11 >= UP && LA6_11 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( ((LA6_7 >= AADL_STRING_LITERAL && LA6_7 <= AADL_STRING_PART)||(LA6_7 >= AL && LA6_7 <= LITERAL_BLESS)) ) {
						alt6=1;
					}
				}
				else if ( (LA6_2==ACTION||LA6_2==AMPERSAND||LA6_2==LCURLY||LA6_2==SEMICOLON) ) {
					alt6=1;
				}
			}
			else if ( (LA6_0==AMPERSAND) ) {
				int LA6_3 = input.LA(2);
				if ( (LA6_3==DOWN) ) {
					int LA6_8 = input.LA(3);
					if ( (LA6_8==ACTION) ) {
						int LA6_12 = input.LA(4);
						if ( ((LA6_12 >= UP && LA6_12 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( (LA6_8==SEMICOLON) ) {
						int LA6_13 = input.LA(4);
						if ( ((LA6_13 >= UP && LA6_13 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( (LA6_8==AMPERSAND) ) {
						int LA6_14 = input.LA(4);
						if ( ((LA6_14 >= UP && LA6_14 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( (LA6_8==LCURLY) ) {
						int LA6_15 = input.LA(4);
						if ( ((LA6_15 >= UP && LA6_15 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( ((LA6_8 >= AADL_STRING_LITERAL && LA6_8 <= AADL_STRING_PART)||(LA6_8 >= AL && LA6_8 <= AM)||(LA6_8 >= ANNEX_END && LA6_8 <= LCON)||(LA6_8 >= LITERAL_Assertion && LA6_8 <= S)||(LA6_8 >= SLCOMMENT && LA6_8 <= LITERAL_BLESS)) ) {
						alt6=1;
					}
				}
				else if ( (LA6_3==ACTION||LA6_3==AMPERSAND||LA6_3==LCURLY||LA6_3==SEMICOLON) ) {
					alt6=1;
				}
			}
			else if ( (LA6_0==LCURLY) ) {
				int LA6_4 = input.LA(2);
				if ( (LA6_4==DOWN) ) {
					int LA6_9 = input.LA(3);
					if ( (LA6_9==ACTION) ) {
						int LA6_16 = input.LA(4);
						if ( (LA6_16==ACTION) ) {
							int LA6_22 = input.LA(5);
							if ( ((LA6_22 >= UP && LA6_22 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_16==SEMICOLON) ) {
							int LA6_23 = input.LA(5);
							if ( ((LA6_23 >= UP && LA6_23 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_16==AMPERSAND) ) {
							int LA6_24 = input.LA(5);
							if ( ((LA6_24 >= UP && LA6_24 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_16==LCURLY) ) {
							int LA6_25 = input.LA(5);
							if ( ((LA6_25 >= UP && LA6_25 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( ((LA6_16 >= UP && LA6_16 <= AADL_STRING_PART)||(LA6_16 >= AL && LA6_16 <= AM)||(LA6_16 >= ANNEX_END && LA6_16 <= LCON)||(LA6_16 >= LITERAL_Assertion && LA6_16 <= S)||(LA6_16 >= SLCOMMENT && LA6_16 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( (LA6_9==SEMICOLON) ) {
						int LA6_17 = input.LA(4);
						if ( (LA6_17==ACTION) ) {
							int LA6_22 = input.LA(5);
							if ( ((LA6_22 >= UP && LA6_22 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_17==SEMICOLON) ) {
							int LA6_23 = input.LA(5);
							if ( ((LA6_23 >= UP && LA6_23 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_17==AMPERSAND) ) {
							int LA6_24 = input.LA(5);
							if ( ((LA6_24 >= UP && LA6_24 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_17==LCURLY) ) {
							int LA6_25 = input.LA(5);
							if ( ((LA6_25 >= UP && LA6_25 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( ((LA6_17 >= UP && LA6_17 <= AADL_STRING_PART)||(LA6_17 >= AL && LA6_17 <= AM)||(LA6_17 >= ANNEX_END && LA6_17 <= LCON)||(LA6_17 >= LITERAL_Assertion && LA6_17 <= S)||(LA6_17 >= SLCOMMENT && LA6_17 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( (LA6_9==AMPERSAND) ) {
						int LA6_18 = input.LA(4);
						if ( (LA6_18==ACTION) ) {
							int LA6_22 = input.LA(5);
							if ( ((LA6_22 >= UP && LA6_22 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_18==SEMICOLON) ) {
							int LA6_23 = input.LA(5);
							if ( ((LA6_23 >= UP && LA6_23 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_18==AMPERSAND) ) {
							int LA6_24 = input.LA(5);
							if ( ((LA6_24 >= UP && LA6_24 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_18==LCURLY) ) {
							int LA6_25 = input.LA(5);
							if ( ((LA6_25 >= UP && LA6_25 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( ((LA6_18 >= UP && LA6_18 <= AADL_STRING_PART)||(LA6_18 >= AL && LA6_18 <= AM)||(LA6_18 >= ANNEX_END && LA6_18 <= LCON)||(LA6_18 >= LITERAL_Assertion && LA6_18 <= S)||(LA6_18 >= SLCOMMENT && LA6_18 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( (LA6_9==LCURLY) ) {
						int LA6_19 = input.LA(4);
						if ( (LA6_19==ACTION) ) {
							int LA6_22 = input.LA(5);
							if ( ((LA6_22 >= UP && LA6_22 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_19==SEMICOLON) ) {
							int LA6_23 = input.LA(5);
							if ( ((LA6_23 >= UP && LA6_23 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_19==AMPERSAND) ) {
							int LA6_24 = input.LA(5);
							if ( ((LA6_24 >= UP && LA6_24 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_19==LCURLY) ) {
							int LA6_25 = input.LA(5);
							if ( ((LA6_25 >= UP && LA6_25 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( ((LA6_19 >= UP && LA6_19 <= AADL_STRING_PART)||(LA6_19 >= AL && LA6_19 <= AM)||(LA6_19 >= ANNEX_END && LA6_19 <= LCON)||(LA6_19 >= LITERAL_Assertion && LA6_19 <= S)||(LA6_19 >= SLCOMMENT && LA6_19 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
					else if ( ((LA6_9 >= AADL_STRING_LITERAL && LA6_9 <= AADL_STRING_PART)||(LA6_9 >= AL && LA6_9 <= AM)||(LA6_9 >= ANNEX_END && LA6_9 <= LCON)||(LA6_9 >= LITERAL_Assertion && LA6_9 <= S)||(LA6_9 >= SLCOMMENT && LA6_9 <= LITERAL_BLESS)) ) {
						int LA6_20 = input.LA(4);
						if ( (LA6_20==ACTION) ) {
							int LA6_22 = input.LA(5);
							if ( ((LA6_22 >= UP && LA6_22 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_20==SEMICOLON) ) {
							int LA6_23 = input.LA(5);
							if ( ((LA6_23 >= UP && LA6_23 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_20==AMPERSAND) ) {
							int LA6_24 = input.LA(5);
							if ( ((LA6_24 >= UP && LA6_24 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( (LA6_20==LCURLY) ) {
							int LA6_25 = input.LA(5);
							if ( ((LA6_25 >= UP && LA6_25 <= LITERAL_BLESS)) ) {
								alt6=1;
							}
						}
						else if ( ((LA6_20 >= UP && LA6_20 <= AADL_STRING_PART)||(LA6_20 >= AL && LA6_20 <= AM)||(LA6_20 >= ANNEX_END && LA6_20 <= LCON)||(LA6_20 >= LITERAL_Assertion && LA6_20 <= S)||(LA6_20 >= SLCOMMENT && LA6_20 <= LITERAL_BLESS)) ) {
							alt6=1;
						}
					}
				}
				else if ( (LA6_4==ACTION||LA6_4==AMPERSAND||LA6_4==LCURLY||LA6_4==SEMICOLON) ) {
					alt6=1;
				}
			}
			else if ( ((LA6_0 >= AADL_STRING_LITERAL && LA6_0 <= AADL_STRING_PART)||(LA6_0 >= AL && LA6_0 <= AM)||(LA6_0 >= ANNEX_END && LA6_0 <= LCON)||(LA6_0 >= LITERAL_Assertion && LA6_0 <= S)||(LA6_0 >= SLCOMMENT && LA6_0 <= LITERAL_BLESS)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:144:13: v= .
					{
					_last = (BAST)input.LT(1);
					v=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					v_tree = (BAST)adaptor.dupTree(v);
					adaptor.addChild(root_1, v_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			pushFollow(FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActionsInELQ212);
			ba=getPreconditionFromBehaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_getPreconditionFromBehaviorActions.add(ba.getTree());
			_last = (BAST)input.LT(1);
			RCURLY11=(BAST)match(input,RCURLY,FOLLOW_RCURLY_in_getPreconditionFromBehaviorActionsInELQ214); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY11);

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 145:5: ->
			{
				adaptor.addChild(root_0, (ba!=null?((ASTtoAST.getPreconditionFromBehaviorActions_return)ba).pre:null));
			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getPreconditionFromBehaviorActionsInELQ"


	public static class getPreconditionFromBehaviorActions_return extends TreeRuleReturnScope {
		public BAST pre = null;
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getPreconditionFromBehaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:149:1: getPreconditionFromBehaviorActions returns [BAST pre = null] options {backtrack=true; } : ( ^( ACTION ^( P (p= . )? ) ^( S . ) ^( Q ( . )? ) ) | ^( SEMICOLON ^( ACTION ^( P (p2= . )? ) ^( S . ) ^( Q ( . )? ) ) ( . )+ ) | ^(amp= AMPERSAND (prc= getPreconditionFromBehaviorActions )+ ) |elq= getPreconditionFromBehaviorActionsInELQ ->);
	public final ASTtoAST.getPreconditionFromBehaviorActions_return getPreconditionFromBehaviorActions() throws RecognitionException {
		ASTtoAST.getPreconditionFromBehaviorActions_return retval = new ASTtoAST.getPreconditionFromBehaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST amp=null;
		BAST ACTION12=null;
		BAST P13=null;
		BAST S14=null;
		BAST wildcard15=null;
		BAST Q16=null;
		BAST wildcard17=null;
		BAST SEMICOLON18=null;
		BAST ACTION19=null;
		BAST P20=null;
		BAST S21=null;
		BAST wildcard22=null;
		BAST Q23=null;
		BAST wildcard24=null;
		BAST wildcard25=null;
		BAST p=null;
		BAST p2=null;
		TreeRuleReturnScope prc =null;
		TreeRuleReturnScope elq =null;

		BAST amp_tree=null;
		BAST ACTION12_tree=null;
		BAST P13_tree=null;
		BAST S14_tree=null;
		BAST wildcard15_tree=null;
		BAST Q16_tree=null;
		BAST wildcard17_tree=null;
		BAST SEMICOLON18_tree=null;
		BAST ACTION19_tree=null;
		BAST P20_tree=null;
		BAST S21_tree=null;
		BAST wildcard22_tree=null;
		BAST Q23_tree=null;
		BAST wildcard24_tree=null;
		BAST wildcard25_tree=null;
		BAST p_tree=null;
		BAST p2_tree=null;
		RewriteRuleSubtreeStream stream_getPreconditionFromBehaviorActionsInELQ=new RewriteRuleSubtreeStream(adaptor,"rule getPreconditionFromBehaviorActionsInELQ");

		ArrayList<BAST> andTerms = new ArrayList<BAST>();
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:152:3: ( ^( ACTION ^( P (p= . )? ) ^( S . ) ^( Q ( . )? ) ) | ^( SEMICOLON ^( ACTION ^( P (p2= . )? ) ^( S . ) ^( Q ( . )? ) ) ( . )+ ) | ^(amp= AMPERSAND (prc= getPreconditionFromBehaviorActions )+ ) |elq= getPreconditionFromBehaviorActionsInELQ ->)
			int alt13=4;
			switch ( input.LA(1) ) {
			case ACTION:
				{
				alt13=1;
				}
				break;
			case SEMICOLON:
				{
				alt13=2;
				}
				break;
			case AMPERSAND:
				{
				alt13=3;
				}
				break;
			case LCURLY:
				{
				alt13=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:3: ^( ACTION ^( P (p= . )? ) ^( S . ) ^( Q ( . )? ) )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ACTION12=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPreconditionFromBehaviorActions263); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION12_tree = (BAST)adaptor.dupNode(ACTION12);


					root_1 = (BAST)adaptor.becomeRoot(ACTION12_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					P13=(BAST)match(input,P,FOLLOW_P_in_getPreconditionFromBehaviorActions266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					P13_tree = (BAST)adaptor.dupNode(P13);


					root_2 = (BAST)adaptor.becomeRoot(P13_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:17: (p= . )?
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= AADL_STRING_LITERAL && LA7_0 <= LITERAL_BLESS)) ) {
							alt7=1;
						}
						switch (alt7) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:17: p= .
								{
								_last = (BAST)input.LT(1);
								p=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								p_tree = (BAST)adaptor.dupTree(p);
								adaptor.addChild(root_2, p_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					S14=(BAST)match(input,S,FOLLOW_S_in_getPreconditionFromBehaviorActions275); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					S14_tree = (BAST)adaptor.dupNode(S14);


					root_2 = (BAST)adaptor.becomeRoot(S14_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard15=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard15_tree = (BAST)adaptor.dupTree(wildcard15);
					adaptor.addChild(root_2, wildcard15_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					Q16=(BAST)match(input,Q,FOLLOW_Q_in_getPreconditionFromBehaviorActions282); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Q16_tree = (BAST)adaptor.dupNode(Q16);


					root_2 = (BAST)adaptor.becomeRoot(Q16_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:34: ( . )?
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= AADL_STRING_LITERAL && LA8_0 <= LITERAL_BLESS)) ) {
							alt8=1;
						}
						switch (alt8) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:34: .
								{
								_last = (BAST)input.LT(1);
								wildcard17=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard17_tree = (BAST)adaptor.dupTree(wildcard17);
								adaptor.addChild(root_2, wildcard17_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {retval.pre =p;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:3: ^( SEMICOLON ^( ACTION ^( P (p2= . )? ) ^( S . ) ^( Q ( . )? ) ) ( . )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					SEMICOLON18=(BAST)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_getPreconditionFromBehaviorActions304); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON18_tree = (BAST)adaptor.dupNode(SEMICOLON18);


					root_1 = (BAST)adaptor.becomeRoot(SEMICOLON18_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ACTION19=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPreconditionFromBehaviorActions307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION19_tree = (BAST)adaptor.dupNode(ACTION19);


					root_2 = (BAST)adaptor.becomeRoot(ACTION19_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_3 = _last;
					BAST _first_3 = null;
					BAST root_3 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					P20=(BAST)match(input,P,FOLLOW_P_in_getPreconditionFromBehaviorActions310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					P20_tree = (BAST)adaptor.dupNode(P20);


					root_3 = (BAST)adaptor.becomeRoot(P20_tree, root_3);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:30: (p2= . )?
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= AADL_STRING_LITERAL && LA9_0 <= LITERAL_BLESS)) ) {
							alt9=1;
						}
						switch (alt9) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:30: p2= .
								{
								_last = (BAST)input.LT(1);
								p2=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								p2_tree = (BAST)adaptor.dupTree(p2);
								adaptor.addChild(root_3, p2_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_2, root_3);
					_last = _save_last_3;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_3 = _last;
					BAST _first_3 = null;
					BAST root_3 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					S21=(BAST)match(input,S,FOLLOW_S_in_getPreconditionFromBehaviorActions319); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					S21_tree = (BAST)adaptor.dupNode(S21);


					root_3 = (BAST)adaptor.becomeRoot(S21_tree, root_3);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard22=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard22_tree = (BAST)adaptor.dupTree(wildcard22);
					adaptor.addChild(root_3, wildcard22_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_2, root_3);
					_last = _save_last_3;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_3 = _last;
					BAST _first_3 = null;
					BAST root_3 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					Q23=(BAST)match(input,Q,FOLLOW_Q_in_getPreconditionFromBehaviorActions326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Q23_tree = (BAST)adaptor.dupNode(Q23);


					root_3 = (BAST)adaptor.becomeRoot(Q23_tree, root_3);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:47: ( . )?
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= AADL_STRING_LITERAL && LA10_0 <= LITERAL_BLESS)) ) {
							alt10=1;
						}
						switch (alt10) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:47: .
								{
								_last = (BAST)input.LT(1);
								wildcard24=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard24_tree = (BAST)adaptor.dupTree(wildcard24);
								adaptor.addChild(root_3, wildcard24_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_2, root_3);
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:54: ( . )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= AADL_STRING_LITERAL && LA11_0 <= LITERAL_BLESS)) ) {
							alt11=1;
						}
						else if ( (LA11_0==UP) ) {
							alt11=2;
						}

						switch (alt11) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:54: .
							{
							_last = (BAST)input.LT(1);
							wildcard25=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard25_tree = (BAST)adaptor.dupTree(wildcard25);
							adaptor.addChild(root_1, wildcard25_tree);
							}

							if ( state.backtracking==0 ) {
							}

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

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {retval.pre =p2;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:160:3: ^(amp= AMPERSAND (prc= getPreconditionFromBehaviorActions )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					amp=(BAST)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_getPreconditionFromBehaviorActions356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					amp_tree = (BAST)adaptor.dupNode(amp);


					root_1 = (BAST)adaptor.becomeRoot(amp_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:161:6: (prc= getPreconditionFromBehaviorActions )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==ACTION||LA12_0==AMPERSAND||LA12_0==LCURLY||LA12_0==SEMICOLON) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:161:8: prc= getPreconditionFromBehaviorActions
							{
							_last = (BAST)input.LT(1);
							pushFollow(FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActions368);
							prc=getPreconditionFromBehaviorActions();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, prc.getTree());

							if ( state.backtracking==0 ) {if ((prc!=null?((ASTtoAST.getPreconditionFromBehaviorActions_return)prc).pre:null)!=null) andTerms.add((prc!=null?((ASTtoAST.getPreconditionFromBehaviorActions_return)prc).pre:null).dupTree());}
							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {if (andTerms.size()==0) retval.pre =null;
					    else if (andTerms.size()==1) retval.pre =andTerms.get(0);
					    else
					      {
					      retval.pre = new BAST("ASSERTION",BLESStoASTLexer.ASSERTION,amp);
					      BAST anAnd = new BAST("and",BLESStoASTLexer.LITERAL_and,amp);
					      for (int i=0;i<andTerms.size();i++)
					        anAnd.addChild(parenthesize((BAST)andTerms.get(i).getChild(0)));
					      retval.pre.addChild(parenthesize(anAnd));
					      }
					    }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:179:3: elq= getPreconditionFromBehaviorActionsInELQ
					{
					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_getPreconditionFromBehaviorActionsInELQ_in_getPreconditionFromBehaviorActions410);
					elq=getPreconditionFromBehaviorActionsInELQ();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_getPreconditionFromBehaviorActionsInELQ.add(elq.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 180:5: ->
					{
						adaptor.addChild(root_0, (BAST)(elq!=null?((BAST)elq.getTree()):null));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getPreconditionFromBehaviorActions"


	public static class getPostconditionFromBehaviorActionsInELQ_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getPostconditionFromBehaviorActionsInELQ"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:183:1: getPostconditionFromBehaviorActionsInELQ : ^( LCURLY ( . )? b= getPostconditionFromBehaviorActions RCURLY ) ->;
	public final ASTtoAST.getPostconditionFromBehaviorActionsInELQ_return getPostconditionFromBehaviorActionsInELQ() throws RecognitionException {
		ASTtoAST.getPostconditionFromBehaviorActionsInELQ_return retval = new ASTtoAST.getPostconditionFromBehaviorActionsInELQ_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST LCURLY26=null;
		BAST wildcard27=null;
		BAST RCURLY28=null;
		TreeRuleReturnScope b =null;

		BAST LCURLY26_tree=null;
		BAST wildcard27_tree=null;
		BAST RCURLY28_tree=null;
		RewriteRuleNodeStream stream_LCURLY=new RewriteRuleNodeStream(adaptor,"token LCURLY");
		RewriteRuleNodeStream stream_RCURLY=new RewriteRuleNodeStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_getPostconditionFromBehaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule getPostconditionFromBehaviorActions");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:184:3: ( ^( LCURLY ( . )? b= getPostconditionFromBehaviorActions RCURLY ) ->)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:185:3: ^( LCURLY ( . )? b= getPostconditionFromBehaviorActions RCURLY )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LCURLY26=(BAST)match(input,LCURLY,FOLLOW_LCURLY_in_getPostconditionFromBehaviorActionsInELQ434); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY26);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:185:12: ( . )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==ACTION) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==DOWN) ) {
					int LA14_6 = input.LA(3);
					if ( (LA14_6==P) ) {
						int LA14_10 = input.LA(4);
						if ( ((LA14_10 >= UP && LA14_10 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( ((LA14_6 >= AADL_STRING_LITERAL && LA14_6 <= ON)||(LA14_6 >= PARAMETER && LA14_6 <= LITERAL_BLESS)) ) {
						alt14=1;
					}
				}
				else if ( (LA14_1==ACTION||LA14_1==AMPERSAND||LA14_1==LCURLY||LA14_1==SEMICOLON) ) {
					alt14=1;
				}
			}
			else if ( (LA14_0==SEMICOLON) ) {
				int LA14_2 = input.LA(2);
				if ( (LA14_2==DOWN) ) {
					int LA14_7 = input.LA(3);
					if ( (LA14_7==ACTION) ) {
						int LA14_11 = input.LA(4);
						if ( ((LA14_11 >= UP && LA14_11 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( ((LA14_7 >= AADL_STRING_LITERAL && LA14_7 <= AADL_STRING_PART)||(LA14_7 >= AL && LA14_7 <= LITERAL_BLESS)) ) {
						alt14=1;
					}
				}
				else if ( (LA14_2==ACTION||LA14_2==AMPERSAND||LA14_2==LCURLY||LA14_2==SEMICOLON) ) {
					alt14=1;
				}
			}
			else if ( (LA14_0==AMPERSAND) ) {
				int LA14_3 = input.LA(2);
				if ( (LA14_3==DOWN) ) {
					int LA14_8 = input.LA(3);
					if ( (LA14_8==ACTION) ) {
						int LA14_12 = input.LA(4);
						if ( ((LA14_12 >= UP && LA14_12 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( (LA14_8==SEMICOLON) ) {
						int LA14_13 = input.LA(4);
						if ( ((LA14_13 >= UP && LA14_13 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( (LA14_8==AMPERSAND) ) {
						int LA14_14 = input.LA(4);
						if ( ((LA14_14 >= UP && LA14_14 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( (LA14_8==LCURLY) ) {
						int LA14_15 = input.LA(4);
						if ( ((LA14_15 >= UP && LA14_15 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( ((LA14_8 >= AADL_STRING_LITERAL && LA14_8 <= AADL_STRING_PART)||(LA14_8 >= AL && LA14_8 <= AM)||(LA14_8 >= ANNEX_END && LA14_8 <= LCON)||(LA14_8 >= LITERAL_Assertion && LA14_8 <= S)||(LA14_8 >= SLCOMMENT && LA14_8 <= LITERAL_BLESS)) ) {
						alt14=1;
					}
				}
				else if ( (LA14_3==ACTION||LA14_3==AMPERSAND||LA14_3==LCURLY||LA14_3==SEMICOLON) ) {
					alt14=1;
				}
			}
			else if ( (LA14_0==LCURLY) ) {
				int LA14_4 = input.LA(2);
				if ( (LA14_4==DOWN) ) {
					int LA14_9 = input.LA(3);
					if ( (LA14_9==ACTION) ) {
						int LA14_16 = input.LA(4);
						if ( (LA14_16==ACTION) ) {
							int LA14_22 = input.LA(5);
							if ( ((LA14_22 >= UP && LA14_22 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_16==SEMICOLON) ) {
							int LA14_23 = input.LA(5);
							if ( ((LA14_23 >= UP && LA14_23 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_16==AMPERSAND) ) {
							int LA14_24 = input.LA(5);
							if ( ((LA14_24 >= UP && LA14_24 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_16==LCURLY) ) {
							int LA14_25 = input.LA(5);
							if ( ((LA14_25 >= UP && LA14_25 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( ((LA14_16 >= UP && LA14_16 <= AADL_STRING_PART)||(LA14_16 >= AL && LA14_16 <= AM)||(LA14_16 >= ANNEX_END && LA14_16 <= LCON)||(LA14_16 >= LITERAL_Assertion && LA14_16 <= S)||(LA14_16 >= SLCOMMENT && LA14_16 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( (LA14_9==SEMICOLON) ) {
						int LA14_17 = input.LA(4);
						if ( (LA14_17==ACTION) ) {
							int LA14_22 = input.LA(5);
							if ( ((LA14_22 >= UP && LA14_22 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_17==SEMICOLON) ) {
							int LA14_23 = input.LA(5);
							if ( ((LA14_23 >= UP && LA14_23 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_17==AMPERSAND) ) {
							int LA14_24 = input.LA(5);
							if ( ((LA14_24 >= UP && LA14_24 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_17==LCURLY) ) {
							int LA14_25 = input.LA(5);
							if ( ((LA14_25 >= UP && LA14_25 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( ((LA14_17 >= UP && LA14_17 <= AADL_STRING_PART)||(LA14_17 >= AL && LA14_17 <= AM)||(LA14_17 >= ANNEX_END && LA14_17 <= LCON)||(LA14_17 >= LITERAL_Assertion && LA14_17 <= S)||(LA14_17 >= SLCOMMENT && LA14_17 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( (LA14_9==AMPERSAND) ) {
						int LA14_18 = input.LA(4);
						if ( (LA14_18==ACTION) ) {
							int LA14_22 = input.LA(5);
							if ( ((LA14_22 >= UP && LA14_22 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_18==SEMICOLON) ) {
							int LA14_23 = input.LA(5);
							if ( ((LA14_23 >= UP && LA14_23 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_18==AMPERSAND) ) {
							int LA14_24 = input.LA(5);
							if ( ((LA14_24 >= UP && LA14_24 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_18==LCURLY) ) {
							int LA14_25 = input.LA(5);
							if ( ((LA14_25 >= UP && LA14_25 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( ((LA14_18 >= UP && LA14_18 <= AADL_STRING_PART)||(LA14_18 >= AL && LA14_18 <= AM)||(LA14_18 >= ANNEX_END && LA14_18 <= LCON)||(LA14_18 >= LITERAL_Assertion && LA14_18 <= S)||(LA14_18 >= SLCOMMENT && LA14_18 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( (LA14_9==LCURLY) ) {
						int LA14_19 = input.LA(4);
						if ( (LA14_19==ACTION) ) {
							int LA14_22 = input.LA(5);
							if ( ((LA14_22 >= UP && LA14_22 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_19==SEMICOLON) ) {
							int LA14_23 = input.LA(5);
							if ( ((LA14_23 >= UP && LA14_23 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_19==AMPERSAND) ) {
							int LA14_24 = input.LA(5);
							if ( ((LA14_24 >= UP && LA14_24 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_19==LCURLY) ) {
							int LA14_25 = input.LA(5);
							if ( ((LA14_25 >= UP && LA14_25 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( ((LA14_19 >= UP && LA14_19 <= AADL_STRING_PART)||(LA14_19 >= AL && LA14_19 <= AM)||(LA14_19 >= ANNEX_END && LA14_19 <= LCON)||(LA14_19 >= LITERAL_Assertion && LA14_19 <= S)||(LA14_19 >= SLCOMMENT && LA14_19 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
					else if ( ((LA14_9 >= AADL_STRING_LITERAL && LA14_9 <= AADL_STRING_PART)||(LA14_9 >= AL && LA14_9 <= AM)||(LA14_9 >= ANNEX_END && LA14_9 <= LCON)||(LA14_9 >= LITERAL_Assertion && LA14_9 <= S)||(LA14_9 >= SLCOMMENT && LA14_9 <= LITERAL_BLESS)) ) {
						int LA14_20 = input.LA(4);
						if ( (LA14_20==ACTION) ) {
							int LA14_22 = input.LA(5);
							if ( ((LA14_22 >= UP && LA14_22 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_20==SEMICOLON) ) {
							int LA14_23 = input.LA(5);
							if ( ((LA14_23 >= UP && LA14_23 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_20==AMPERSAND) ) {
							int LA14_24 = input.LA(5);
							if ( ((LA14_24 >= UP && LA14_24 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( (LA14_20==LCURLY) ) {
							int LA14_25 = input.LA(5);
							if ( ((LA14_25 >= UP && LA14_25 <= LITERAL_BLESS)) ) {
								alt14=1;
							}
						}
						else if ( ((LA14_20 >= UP && LA14_20 <= AADL_STRING_PART)||(LA14_20 >= AL && LA14_20 <= AM)||(LA14_20 >= ANNEX_END && LA14_20 <= LCON)||(LA14_20 >= LITERAL_Assertion && LA14_20 <= S)||(LA14_20 >= SLCOMMENT && LA14_20 <= LITERAL_BLESS)) ) {
							alt14=1;
						}
					}
				}
				else if ( (LA14_4==ACTION||LA14_4==AMPERSAND||LA14_4==LCURLY||LA14_4==SEMICOLON) ) {
					alt14=1;
				}
			}
			else if ( ((LA14_0 >= AADL_STRING_LITERAL && LA14_0 <= AADL_STRING_PART)||(LA14_0 >= AL && LA14_0 <= AM)||(LA14_0 >= ANNEX_END && LA14_0 <= LCON)||(LA14_0 >= LITERAL_Assertion && LA14_0 <= S)||(LA14_0 >= SLCOMMENT && LA14_0 <= LITERAL_BLESS)) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:185:12: .
					{
					_last = (BAST)input.LT(1);
					wildcard27=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard27_tree = (BAST)adaptor.dupTree(wildcard27);
					adaptor.addChild(root_1, wildcard27_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			pushFollow(FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActionsInELQ446);
			b=getPostconditionFromBehaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_getPostconditionFromBehaviorActions.add(b.getTree());
			_last = (BAST)input.LT(1);
			RCURLY28=(BAST)match(input,RCURLY,FOLLOW_RCURLY_in_getPostconditionFromBehaviorActionsInELQ448); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY28);

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 187:5: ->
			{
				adaptor.addChild(root_0, (b!=null?((ASTtoAST.getPostconditionFromBehaviorActions_return)b).post:null));
			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			Dump.it("Aw elq.");
			  tell("ASTtoAST.getPostconditionFromBehaviorActionsInELQ",re,(BAST)retval.getTree());
			  throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getPostconditionFromBehaviorActionsInELQ"


	public static class anAssertion_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "anAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:195:1: anAssertion : ( ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS (lv+= ID )+ ) p= . ) -> ^( $ass ^( $l $a) ^( $par ( $lv)+ ) $p) | ^(ass= ASSERTION ^(l= LABEL a= ID ) p= . ) -> ^( $ass ^( $l $a) $p) | ^(ass= ASSERTION p= . ) -> ^( $ass $p) );
	public final ASTtoAST.anAssertion_return anAssertion() throws RecognitionException {
		ASTtoAST.anAssertion_return retval = new ASTtoAST.anAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST ass=null;
		BAST l=null;
		BAST a=null;
		BAST par=null;
		BAST lv=null;
		BAST p=null;
		List<Object> list_lv=null;

		BAST ass_tree=null;
		BAST l_tree=null;
		BAST a_tree=null;
		BAST par_tree=null;
		BAST p_tree=null;
		BAST lv_tree=null;
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LABEL=new RewriteRuleNodeStream(adaptor,"token LABEL");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_PARAMETERS=new RewriteRuleNodeStream(adaptor,"token PARAMETERS");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:196:3: ( ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS (lv+= ID )+ ) p= . ) -> ^( $ass ^( $l $a) ^( $par ( $lv)+ ) $p) | ^(ass= ASSERTION ^(l= LABEL a= ID ) p= . ) -> ^( $ass ^( $l $a) $p) | ^(ass= ASSERTION p= . ) -> ^( $ass $p) )
			int alt16=3;
			alt16 = dfa16.predict(input);
			switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:197:3: ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS (lv+= ID )+ ) p= . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_anAssertion493); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					l=(BAST)match(input,LABEL,FOLLOW_LABEL_in_anAssertion500); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(l);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					a=(BAST)match(input,ID,FOLLOW_ID_in_anAssertion504); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(a);

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					par=(BAST)match(input,PARAMETERS,FOLLOW_PARAMETERS_in_anAssertion511); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PARAMETERS.add(par);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:197:58: (lv+= ID )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==ID) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:197:58: lv+= ID
							{
							_last = (BAST)input.LT(1);
							lv=(BAST)match(input,ID,FOLLOW_ID_in_anAssertion515); if (state.failed) return retval;
							 
							if ( state.backtracking==0 ) stream_ID.add(lv);

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv);
							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					p=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					p_tree = (BAST)adaptor.dupTree(p);
					adaptor.addChild(root_1, p_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ass, a, par, lv, l, p
					// token labels: ass, par, a, l
					// rule labels: retval
					// token list labels: lv
					// rule list labels: 
					// wildcard labels: p
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
					RewriteRuleNodeStream stream_par=new RewriteRuleNodeStream(adaptor,"token par",par);
					RewriteRuleNodeStream stream_a=new RewriteRuleNodeStream(adaptor,"token a",a);
					RewriteRuleNodeStream stream_l=new RewriteRuleNodeStream(adaptor,"token l",l);
					RewriteRuleNodeStream stream_lv=new RewriteRuleNodeStream(adaptor,"token lv", list_lv);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"wildcard p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 198:5: -> ^( $ass ^( $l $a) ^( $par ( $lv)+ ) $p)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:198:8: ^( $ass ^( $l $a) ^( $par ( $lv)+ ) $p)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_ass.nextNode(), root_1);
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:198:15: ^( $l $a)
						{
						BAST root_2 = (BAST)adaptor.nil();
						root_2 = (BAST)adaptor.becomeRoot(stream_l.nextNode(), root_2);
						adaptor.addChild(root_2, stream_a.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:198:24: ^( $par ( $lv)+ )
						{
						BAST root_2 = (BAST)adaptor.nil();
						root_2 = (BAST)adaptor.becomeRoot(stream_par.nextNode(), root_2);
						if ( !(stream_lv.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_lv.hasNext() ) {
							adaptor.addChild(root_2, stream_lv.nextNode());
						}
						stream_lv.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_p.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:200:3: ^(ass= ASSERTION ^(l= LABEL a= ID ) p= . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_anAssertion568); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					l=(BAST)match(input,LABEL,FOLLOW_LABEL_in_anAssertion575); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(l);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					a=(BAST)match(input,ID,FOLLOW_ID_in_anAssertion579); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(a);

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					p=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					p_tree = (BAST)adaptor.dupTree(p);
					adaptor.addChild(root_1, p_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ass, l, a, p
					// token labels: ass, a, l
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: p
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
					RewriteRuleNodeStream stream_a=new RewriteRuleNodeStream(adaptor,"token a",a);
					RewriteRuleNodeStream stream_l=new RewriteRuleNodeStream(adaptor,"token l",l);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"wildcard p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 201:5: -> ^( $ass ^( $l $a) $p)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:201:8: ^( $ass ^( $l $a) $p)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_ass.nextNode(), root_1);
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:201:15: ^( $l $a)
						{
						BAST root_2 = (BAST)adaptor.nil();
						root_2 = (BAST)adaptor.becomeRoot(stream_l.nextNode(), root_2);
						adaptor.addChild(root_2, stream_a.nextNode());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_p.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:203:3: ^(ass= ASSERTION p= . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_anAssertion622); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					p=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					p_tree = (BAST)adaptor.dupTree(p);
					adaptor.addChild(root_1, p_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ass, p
					// token labels: ass
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: p
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"wildcard p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 204:5: -> ^( $ass $p)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:204:8: ^( $ass $p)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_ass.nextNode(), root_1);
						adaptor.addChild(root_1, stream_p.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "anAssertion"


	public static class getPostconditionFromBehaviorActions_return extends TreeRuleReturnScope {
		public BAST post = null;
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getPostconditionFromBehaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:207:1: getPostconditionFromBehaviorActions returns [BAST post = null] options {backtrack=true; } : ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q= . )? ) ) | ^( SEMICOLON ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+ ) | ^(amp= AMPERSAND (prc= getPostconditionFromBehaviorActions )+ ) |elq= getPostconditionFromBehaviorActionsInELQ ->);
	public final ASTtoAST.getPostconditionFromBehaviorActions_return getPostconditionFromBehaviorActions() throws RecognitionException {
		ASTtoAST.getPostconditionFromBehaviorActions_return retval = new ASTtoAST.getPostconditionFromBehaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST amp=null;
		BAST ACTION29=null;
		BAST P30=null;
		BAST wildcard31=null;
		BAST S32=null;
		BAST wildcard33=null;
		BAST Q34=null;
		BAST SEMICOLON35=null;
		BAST ACTION36=null;
		BAST P37=null;
		BAST wildcard38=null;
		BAST S39=null;
		BAST wildcard40=null;
		BAST Q41=null;
		BAST q=null;
		BAST q2=null;
		TreeRuleReturnScope prc =null;
		TreeRuleReturnScope elq =null;

		BAST amp_tree=null;
		BAST ACTION29_tree=null;
		BAST P30_tree=null;
		BAST wildcard31_tree=null;
		BAST S32_tree=null;
		BAST wildcard33_tree=null;
		BAST Q34_tree=null;
		BAST SEMICOLON35_tree=null;
		BAST ACTION36_tree=null;
		BAST P37_tree=null;
		BAST wildcard38_tree=null;
		BAST S39_tree=null;
		BAST wildcard40_tree=null;
		BAST Q41_tree=null;
		BAST q_tree=null;
		BAST q2_tree=null;
		RewriteRuleSubtreeStream stream_getPostconditionFromBehaviorActionsInELQ=new RewriteRuleSubtreeStream(adaptor,"rule getPostconditionFromBehaviorActionsInELQ");

		ArrayList<BAST> ampersandPostconditions = new ArrayList<BAST>();
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:210:3: ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q= . )? ) ) | ^( SEMICOLON ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+ ) | ^(amp= AMPERSAND (prc= getPostconditionFromBehaviorActions )+ ) |elq= getPostconditionFromBehaviorActionsInELQ ->)
			int alt23=4;
			switch ( input.LA(1) ) {
			case ACTION:
				{
				alt23=1;
				}
				break;
			case SEMICOLON:
				{
				alt23=2;
				}
				break;
			case AMPERSAND:
				{
				alt23=3;
				}
				break;
			case LCURLY:
				{
				alt23=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:3: ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q= . )? ) )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ACTION29=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPostconditionFromBehaviorActions684); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION29_tree = (BAST)adaptor.dupNode(ACTION29);


					root_1 = (BAST)adaptor.becomeRoot(ACTION29_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					P30=(BAST)match(input,P,FOLLOW_P_in_getPostconditionFromBehaviorActions687); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					P30_tree = (BAST)adaptor.dupNode(P30);


					root_2 = (BAST)adaptor.becomeRoot(P30_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:16: ( . )?
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= AADL_STRING_LITERAL && LA17_0 <= LITERAL_BLESS)) ) {
							alt17=1;
						}
						switch (alt17) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:16: .
								{
								_last = (BAST)input.LT(1);
								wildcard31=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard31_tree = (BAST)adaptor.dupTree(wildcard31);
								adaptor.addChild(root_2, wildcard31_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					S32=(BAST)match(input,S,FOLLOW_S_in_getPostconditionFromBehaviorActions694); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					S32_tree = (BAST)adaptor.dupNode(S32);


					root_2 = (BAST)adaptor.becomeRoot(S32_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard33=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard33_tree = (BAST)adaptor.dupTree(wildcard33);
					adaptor.addChild(root_2, wildcard33_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					Q34=(BAST)match(input,Q,FOLLOW_Q_in_getPostconditionFromBehaviorActions701); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Q34_tree = (BAST)adaptor.dupNode(Q34);


					root_2 = (BAST)adaptor.becomeRoot(Q34_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:33: (q= . )?
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= AADL_STRING_LITERAL && LA18_0 <= LITERAL_BLESS)) ) {
							alt18=1;
						}
						switch (alt18) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:33: q= .
								{
								_last = (BAST)input.LT(1);
								q=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								q_tree = (BAST)adaptor.dupTree(q);
								adaptor.addChild(root_2, q_tree);
								}

								if ( state.backtracking==0 ) {
								}

								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {retval.post =q;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:214:3: ^( SEMICOLON ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					SEMICOLON35=(BAST)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_getPostconditionFromBehaviorActions727); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON35_tree = (BAST)adaptor.dupNode(SEMICOLON35);


					root_1 = (BAST)adaptor.becomeRoot(SEMICOLON35_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:215:5: ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==ACTION) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:215:7: ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) )
							{
							_last = (BAST)input.LT(1);
							{
							BAST _save_last_2 = _last;
							BAST _first_2 = null;
							BAST root_2 = (BAST)adaptor.nil();
							_last = (BAST)input.LT(1);
							ACTION36=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPostconditionFromBehaviorActions737); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ACTION36_tree = (BAST)adaptor.dupNode(ACTION36);


							root_2 = (BAST)adaptor.becomeRoot(ACTION36_tree, root_2);
							}

							match(input, Token.DOWN, null); if (state.failed) return retval;
							_last = (BAST)input.LT(1);
							{
							BAST _save_last_3 = _last;
							BAST _first_3 = null;
							BAST root_3 = (BAST)adaptor.nil();
							_last = (BAST)input.LT(1);
							P37=(BAST)match(input,P,FOLLOW_P_in_getPostconditionFromBehaviorActions747); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							P37_tree = (BAST)adaptor.dupNode(P37);


							root_3 = (BAST)adaptor.becomeRoot(P37_tree, root_3);
							}

							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:216:11: ( . )?
								int alt19=2;
								int LA19_0 = input.LA(1);
								if ( ((LA19_0 >= AADL_STRING_LITERAL && LA19_0 <= LITERAL_BLESS)) ) {
									alt19=1;
								}
								switch (alt19) {
									case 1 :
										// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:216:11: .
										{
										_last = (BAST)input.LT(1);
										wildcard38=(BAST)input.LT(1);
										matchAny(input); if (state.failed) return retval;
										if ( state.backtracking==0 ) {
										wildcard38_tree = (BAST)adaptor.dupTree(wildcard38);
										adaptor.addChild(root_3, wildcard38_tree);
										}

										if ( state.backtracking==0 ) {
										}

										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}
							adaptor.addChild(root_2, root_3);
							_last = _save_last_3;
							}


							_last = (BAST)input.LT(1);
							{
							BAST _save_last_3 = _last;
							BAST _first_3 = null;
							BAST root_3 = (BAST)adaptor.nil();
							_last = (BAST)input.LT(1);
							S39=(BAST)match(input,S,FOLLOW_S_in_getPostconditionFromBehaviorActions761); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							S39_tree = (BAST)adaptor.dupNode(S39);


							root_3 = (BAST)adaptor.becomeRoot(S39_tree, root_3);
							}

							match(input, Token.DOWN, null); if (state.failed) return retval;
							_last = (BAST)input.LT(1);
							wildcard40=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard40_tree = (BAST)adaptor.dupTree(wildcard40);
							adaptor.addChild(root_3, wildcard40_tree);
							}

							match(input, Token.UP, null); if (state.failed) return retval;
							adaptor.addChild(root_2, root_3);
							_last = _save_last_3;
							}


							_last = (BAST)input.LT(1);
							{
							BAST _save_last_3 = _last;
							BAST _first_3 = null;
							BAST root_3 = (BAST)adaptor.nil();
							_last = (BAST)input.LT(1);
							Q41=(BAST)match(input,Q,FOLLOW_Q_in_getPostconditionFromBehaviorActions775); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Q41_tree = (BAST)adaptor.dupNode(Q41);


							root_3 = (BAST)adaptor.becomeRoot(Q41_tree, root_3);
							}

							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:218:13: (q2= . )?
								int alt20=2;
								int LA20_0 = input.LA(1);
								if ( ((LA20_0 >= AADL_STRING_LITERAL && LA20_0 <= LITERAL_BLESS)) ) {
									alt20=1;
								}
								switch (alt20) {
									case 1 :
										// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:218:13: q2= .
										{
										_last = (BAST)input.LT(1);
										q2=(BAST)input.LT(1);
										matchAny(input); if (state.failed) return retval;
										if ( state.backtracking==0 ) {
										q2_tree = (BAST)adaptor.dupTree(q2);
										adaptor.addChild(root_3, q2_tree);
										}

										if ( state.backtracking==0 ) {
										}

										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}
							adaptor.addChild(root_2, root_3);
							_last = _save_last_3;
							}


							match(input, Token.UP, null); if (state.failed) return retval;
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {retval.post =q2;}
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:223:3: ^(amp= AMPERSAND (prc= getPostconditionFromBehaviorActions )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					amp=(BAST)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_getPostconditionFromBehaviorActions816); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					amp_tree = (BAST)adaptor.dupNode(amp);


					root_1 = (BAST)adaptor.becomeRoot(amp_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:224:6: (prc= getPostconditionFromBehaviorActions )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==ACTION||LA22_0==AMPERSAND||LA22_0==LCURLY||LA22_0==SEMICOLON) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:224:8: prc= getPostconditionFromBehaviorActions
							{
							_last = (BAST)input.LT(1);
							pushFollow(FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActions828);
							prc=getPostconditionFromBehaviorActions();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, prc.getTree());

							if ( state.backtracking==0 ) {if((prc!=null?((ASTtoAST.getPostconditionFromBehaviorActions_return)prc).post:null)!=null)ampersandPostconditions.add((prc!=null?((ASTtoAST.getPostconditionFromBehaviorActions_return)prc).post:null).dupTree());}
							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {if (ampersandPostconditions.size()==0) retval.post =null;
					    else if (ampersandPostconditions.size()==1) retval.post =ampersandPostconditions.get(0);
					    else
					      {
					      retval.post = new BAST("ASSERTION",BLESStoASTLexer.ASSERTION,amp);
					      BAST anAnd = new BAST("and",BLESStoASTLexer.LITERAL_and,amp);
					      for (int i=0;i<ampersandPostconditions.size();i++)
					        anAnd.addChild(parenthesize((BAST)ampersandPostconditions.get(i).getChild(0)));
					      retval.post.addChild(anAnd);
					      }
					    }
					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:239:3: elq= getPostconditionFromBehaviorActionsInELQ
					{
					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_getPostconditionFromBehaviorActionsInELQ_in_getPostconditionFromBehaviorActions866);
					elq=getPostconditionFromBehaviorActionsInELQ();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_getPostconditionFromBehaviorActionsInELQ.add(elq.getTree());
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 240:5: ->
					{
						adaptor.addChild(root_0, (elq!=null?((BAST)elq.getTree()):null));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			Dump.it("Aw shucks.");
			  tell("ASTtoAST.getPostconditionFromBehaviorActions",re,(BAST)retval.getTree());
			  throw re;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "getPostconditionFromBehaviorActions"


	public static class get_invariant_from_thread_behavior_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "get_invariant_from_thread_behavior"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:262:1: get_invariant_from_thread_behavior : ^(c= COMPONENT cc= . ( LITERAL_implementation ^( PERIOD dcti= ID des= ID ) | ID ) ( ^( LITERAL_features ( . )+ ) )? ( ^( LITERAL_properties ( . )+ ) )? ^( LITERAL_annex LITERAL_BLESS ^( THREAD_ANNEX ^( LITERAL_states ( . )+ ) ( ^( LITERAL_availability . ) )? ( ^( LITERAL_assert ( . )+ ) )? ^( LITERAL_invariant ^(ass= ASSERTION ( ^( LABEL a= ID ) )? ( ^( PARAMETERS (lv+= . )+ ) )? predicate= . ) ) ( ^( LITERAL_variables ( . )+ ) )? ^( LITERAL_transitions ( . )+ ) ( DO_NOT_PROVE )? STOP ) ) LITERAL_end ) -> ^( $ass $predicate) ;
	public final ASTtoAST.get_invariant_from_thread_behavior_return get_invariant_from_thread_behavior() throws RecognitionException {
		ASTtoAST.get_invariant_from_thread_behavior_return retval = new ASTtoAST.get_invariant_from_thread_behavior_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST c=null;
		BAST dcti=null;
		BAST des=null;
		BAST ass=null;
		BAST a=null;
		BAST LITERAL_implementation42=null;
		BAST PERIOD43=null;
		BAST ID44=null;
		BAST LITERAL_features45=null;
		BAST wildcard46=null;
		BAST LITERAL_properties47=null;
		BAST wildcard48=null;
		BAST LITERAL_annex49=null;
		BAST LITERAL_BLESS50=null;
		BAST THREAD_ANNEX51=null;
		BAST LITERAL_states52=null;
		BAST wildcard53=null;
		BAST LITERAL_availability54=null;
		BAST wildcard55=null;
		BAST LITERAL_assert56=null;
		BAST wildcard57=null;
		BAST LITERAL_invariant58=null;
		BAST LABEL59=null;
		BAST PARAMETERS60=null;
		BAST LITERAL_variables61=null;
		BAST wildcard62=null;
		BAST LITERAL_transitions63=null;
		BAST wildcard64=null;
		BAST DO_NOT_PROVE65=null;
		BAST STOP66=null;
		BAST LITERAL_end67=null;
		BAST cc=null;
		BAST predicate=null;
		BAST lv=null;
		List<Object> list_lv=null;

		BAST c_tree=null;
		BAST dcti_tree=null;
		BAST des_tree=null;
		BAST ass_tree=null;
		BAST a_tree=null;
		BAST LITERAL_implementation42_tree=null;
		BAST PERIOD43_tree=null;
		BAST ID44_tree=null;
		BAST LITERAL_features45_tree=null;
		BAST wildcard46_tree=null;
		BAST LITERAL_properties47_tree=null;
		BAST wildcard48_tree=null;
		BAST LITERAL_annex49_tree=null;
		BAST LITERAL_BLESS50_tree=null;
		BAST THREAD_ANNEX51_tree=null;
		BAST LITERAL_states52_tree=null;
		BAST wildcard53_tree=null;
		BAST LITERAL_availability54_tree=null;
		BAST wildcard55_tree=null;
		BAST LITERAL_assert56_tree=null;
		BAST wildcard57_tree=null;
		BAST LITERAL_invariant58_tree=null;
		BAST LABEL59_tree=null;
		BAST PARAMETERS60_tree=null;
		BAST LITERAL_variables61_tree=null;
		BAST wildcard62_tree=null;
		BAST LITERAL_transitions63_tree=null;
		BAST wildcard64_tree=null;
		BAST DO_NOT_PROVE65_tree=null;
		BAST STOP66_tree=null;
		BAST LITERAL_end67_tree=null;
		BAST cc_tree=null;
		BAST predicate_tree=null;
		BAST lv_tree=null;
		RewriteRuleNodeStream stream_LITERAL_implementation=new RewriteRuleNodeStream(adaptor,"token LITERAL_implementation");
		RewriteRuleNodeStream stream_THREAD_ANNEX=new RewriteRuleNodeStream(adaptor,"token THREAD_ANNEX");
		RewriteRuleNodeStream stream_LITERAL_features=new RewriteRuleNodeStream(adaptor,"token LITERAL_features");
		RewriteRuleNodeStream stream_LITERAL_invariant=new RewriteRuleNodeStream(adaptor,"token LITERAL_invariant");
		RewriteRuleNodeStream stream_STOP=new RewriteRuleNodeStream(adaptor,"token STOP");
		RewriteRuleNodeStream stream_LITERAL_end=new RewriteRuleNodeStream(adaptor,"token LITERAL_end");
		RewriteRuleNodeStream stream_PARAMETERS=new RewriteRuleNodeStream(adaptor,"token PARAMETERS");
		RewriteRuleNodeStream stream_DO_NOT_PROVE=new RewriteRuleNodeStream(adaptor,"token DO_NOT_PROVE");
		RewriteRuleNodeStream stream_LITERAL_states=new RewriteRuleNodeStream(adaptor,"token LITERAL_states");
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LITERAL_availability=new RewriteRuleNodeStream(adaptor,"token LITERAL_availability");
		RewriteRuleNodeStream stream_LITERAL_assert=new RewriteRuleNodeStream(adaptor,"token LITERAL_assert");
		RewriteRuleNodeStream stream_LITERAL_transitions=new RewriteRuleNodeStream(adaptor,"token LITERAL_transitions");
		RewriteRuleNodeStream stream_PERIOD=new RewriteRuleNodeStream(adaptor,"token PERIOD");
		RewriteRuleNodeStream stream_LITERAL_annex=new RewriteRuleNodeStream(adaptor,"token LITERAL_annex");
		RewriteRuleNodeStream stream_LABEL=new RewriteRuleNodeStream(adaptor,"token LABEL");
		RewriteRuleNodeStream stream_COMPONENT=new RewriteRuleNodeStream(adaptor,"token COMPONENT");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_LITERAL_properties=new RewriteRuleNodeStream(adaptor,"token LITERAL_properties");
		RewriteRuleNodeStream stream_LITERAL_BLESS=new RewriteRuleNodeStream(adaptor,"token LITERAL_BLESS");
		RewriteRuleNodeStream stream_LITERAL_variables=new RewriteRuleNodeStream(adaptor,"token LITERAL_variables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:263:3: ( ^(c= COMPONENT cc= . ( LITERAL_implementation ^( PERIOD dcti= ID des= ID ) | ID ) ( ^( LITERAL_features ( . )+ ) )? ( ^( LITERAL_properties ( . )+ ) )? ^( LITERAL_annex LITERAL_BLESS ^( THREAD_ANNEX ^( LITERAL_states ( . )+ ) ( ^( LITERAL_availability . ) )? ( ^( LITERAL_assert ( . )+ ) )? ^( LITERAL_invariant ^(ass= ASSERTION ( ^( LABEL a= ID ) )? ( ^( PARAMETERS (lv+= . )+ ) )? predicate= . ) ) ( ^( LITERAL_variables ( . )+ ) )? ^( LITERAL_transitions ( . )+ ) ( DO_NOT_PROVE )? STOP ) ) LITERAL_end ) -> ^( $ass $predicate) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:264:3: ^(c= COMPONENT cc= . ( LITERAL_implementation ^( PERIOD dcti= ID des= ID ) | ID ) ( ^( LITERAL_features ( . )+ ) )? ( ^( LITERAL_properties ( . )+ ) )? ^( LITERAL_annex LITERAL_BLESS ^( THREAD_ANNEX ^( LITERAL_states ( . )+ ) ( ^( LITERAL_availability . ) )? ( ^( LITERAL_assert ( . )+ ) )? ^( LITERAL_invariant ^(ass= ASSERTION ( ^( LABEL a= ID ) )? ( ^( PARAMETERS (lv+= . )+ ) )? predicate= . ) ) ( ^( LITERAL_variables ( . )+ ) )? ^( LITERAL_transitions ( . )+ ) ( DO_NOT_PROVE )? STOP ) ) LITERAL_end )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			c=(BAST)match(input,COMPONENT,FOLLOW_COMPONENT_in_get_invariant_from_thread_behavior911); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_COMPONENT.add(c);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			cc=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			cc_tree = (BAST)adaptor.dupTree(cc);
			adaptor.addChild(root_1, cc_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:265:5: ( LITERAL_implementation ^( PERIOD dcti= ID des= ID ) | ID )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LITERAL_implementation) ) {
				alt24=1;
			}
			else if ( (LA24_0==ID) ) {
				alt24=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:265:6: LITERAL_implementation ^( PERIOD dcti= ID des= ID )
					{
					_last = (BAST)input.LT(1);
					LITERAL_implementation42=(BAST)match(input,LITERAL_implementation,FOLLOW_LITERAL_implementation_in_get_invariant_from_thread_behavior923); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_implementation.add(LITERAL_implementation42);

					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					PERIOD43=(BAST)match(input,PERIOD,FOLLOW_PERIOD_in_get_invariant_from_thread_behavior926); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD43);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					dcti=(BAST)match(input,ID,FOLLOW_ID_in_get_invariant_from_thread_behavior930); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(dcti);

					_last = (BAST)input.LT(1);
					des=(BAST)match(input,ID,FOLLOW_ID_in_get_invariant_from_thread_behavior934); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(des);

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:266:9: ID
					{
					_last = (BAST)input.LT(1);
					ID44=(BAST)match(input,ID,FOLLOW_ID_in_get_invariant_from_thread_behavior945); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(ID44);

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:267:5: ( ^( LITERAL_features ( . )+ ) )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LITERAL_features) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:267:7: ^( LITERAL_features ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_features45=(BAST)match(input,LITERAL_features,FOLLOW_LITERAL_features_in_get_invariant_from_thread_behavior955); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_features.add(LITERAL_features45);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:267:26: ( . )+
					int cnt25=0;
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( ((LA25_0 >= AADL_STRING_LITERAL && LA25_0 <= LITERAL_BLESS)) ) {
							alt25=1;
						}
						else if ( (LA25_0==UP) ) {
							alt25=2;
						}

						switch (alt25) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:267:26: .
							{
							_last = (BAST)input.LT(1);
							wildcard46=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard46_tree = (BAST)adaptor.dupTree(wildcard46);
							adaptor.addChild(root_2, wildcard46_tree);
							}

							if ( state.backtracking==0 ) {
							}

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

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:268:5: ( ^( LITERAL_properties ( . )+ ) )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==LITERAL_properties) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:268:7: ^( LITERAL_properties ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_properties47=(BAST)match(input,LITERAL_properties,FOLLOW_LITERAL_properties_in_get_invariant_from_thread_behavior971); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_properties.add(LITERAL_properties47);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:268:29: ( . )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= AADL_STRING_LITERAL && LA27_0 <= LITERAL_BLESS)) ) {
							alt27=1;
						}
						else if ( (LA27_0==UP) ) {
							alt27=2;
						}

						switch (alt27) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:268:29: .
							{
							_last = (BAST)input.LT(1);
							wildcard48=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard48_tree = (BAST)adaptor.dupTree(wildcard48);
							adaptor.addChild(root_2, wildcard48_tree);
							}

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			{
			BAST _save_last_2 = _last;
			BAST _first_2 = null;
			BAST root_2 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_annex49=(BAST)match(input,LITERAL_annex,FOLLOW_LITERAL_annex_in_get_invariant_from_thread_behavior986); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_annex.add(LITERAL_annex49);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			LITERAL_BLESS50=(BAST)match(input,LITERAL_BLESS,FOLLOW_LITERAL_BLESS_in_get_invariant_from_thread_behavior988); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_BLESS.add(LITERAL_BLESS50);

			_last = (BAST)input.LT(1);
			{
			BAST _save_last_3 = _last;
			BAST _first_3 = null;
			BAST root_3 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			THREAD_ANNEX51=(BAST)match(input,THREAD_ANNEX,FOLLOW_THREAD_ANNEX_in_get_invariant_from_thread_behavior999); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_THREAD_ANNEX.add(THREAD_ANNEX51);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_4 = _last;
			BAST _first_4 = null;
			BAST root_4 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_states52=(BAST)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_get_invariant_from_thread_behavior1010); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_states.add(LITERAL_states52);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:271:24: ( . )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= AADL_STRING_LITERAL && LA29_0 <= LITERAL_BLESS)) ) {
					alt29=1;
				}
				else if ( (LA29_0==UP) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:271:24: .
					{
					_last = (BAST)input.LT(1);
					wildcard53=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard53_tree = (BAST)adaptor.dupTree(wildcard53);
					adaptor.addChild(root_4, wildcard53_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_3, root_4);
			_last = _save_last_4;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:272:7: ( ^( LITERAL_availability . ) )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LITERAL_availability) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:272:8: ^( LITERAL_availability . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_4 = _last;
					BAST _first_4 = null;
					BAST root_4 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_availability54=(BAST)match(input,LITERAL_availability,FOLLOW_LITERAL_availability_in_get_invariant_from_thread_behavior1026); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_availability.add(LITERAL_availability54);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard55=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard55_tree = (BAST)adaptor.dupTree(wildcard55);
					adaptor.addChild(root_4, wildcard55_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_3, root_4);
					_last = _save_last_4;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:273:7: ( ^( LITERAL_assert ( . )+ ) )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==LITERAL_assert) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:273:8: ^( LITERAL_assert ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_4 = _last;
					BAST _first_4 = null;
					BAST root_4 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_assert56=(BAST)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_get_invariant_from_thread_behavior1043); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_assert.add(LITERAL_assert56);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:273:25: ( . )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( ((LA31_0 >= AADL_STRING_LITERAL && LA31_0 <= LITERAL_BLESS)) ) {
							alt31=1;
						}
						else if ( (LA31_0==UP) ) {
							alt31=2;
						}

						switch (alt31) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:273:25: .
							{
							_last = (BAST)input.LT(1);
							wildcard57=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard57_tree = (BAST)adaptor.dupTree(wildcard57);
							adaptor.addChild(root_4, wildcard57_tree);
							}

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_3, root_4);
					_last = _save_last_4;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			{
			BAST _save_last_4 = _last;
			BAST _first_4 = null;
			BAST root_4 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_invariant58=(BAST)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_get_invariant_from_thread_behavior1059); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant58);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_5 = _last;
			BAST _first_5 = null;
			BAST root_5 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_get_invariant_from_thread_behavior1066); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:46: ( ^( LABEL a= ID ) )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==LABEL) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==DOWN) ) {
					int LA33_3 = input.LA(3);
					if ( (LA33_3==ID) ) {
						int LA33_4 = input.LA(4);
						if ( (LA33_4==UP) ) {
							int LA33_5 = input.LA(5);
							if ( ((LA33_5 >= AADL_STRING_LITERAL && LA33_5 <= LITERAL_BLESS)) ) {
								alt33=1;
							}
						}
					}
				}
			}
			switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:47: ^( LABEL a= ID )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_6 = _last;
					BAST _first_6 = null;
					BAST root_6 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LABEL59=(BAST)match(input,LABEL,FOLLOW_LABEL_in_get_invariant_from_thread_behavior1072); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(LABEL59);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					a=(BAST)match(input,ID,FOLLOW_ID_in_get_invariant_from_thread_behavior1076); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(a);

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_5, root_6);
					_last = _save_last_6;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:66: ( ^( PARAMETERS (lv+= . )+ ) )?
			int alt35=2;
			alt35 = dfa35.predict(input);
			switch (alt35) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:68: ^( PARAMETERS (lv+= . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_6 = _last;
					BAST _first_6 = null;
					BAST root_6 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					PARAMETERS60=(BAST)match(input,PARAMETERS,FOLLOW_PARAMETERS_in_get_invariant_from_thread_behavior1086); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PARAMETERS.add(PARAMETERS60);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:83: (lv+= . )+
					int cnt34=0;
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( ((LA34_0 >= AADL_STRING_LITERAL && LA34_0 <= LITERAL_BLESS)) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:83: lv+= .
							{
							_last = (BAST)input.LT(1);
							lv=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							lv_tree = (BAST)adaptor.dupTree(lv);
							adaptor.addChild(root_6, lv_tree);
							}

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv);
							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(34, input);
							throw eee;
						}
						cnt34++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_5, root_6);
					_last = _save_last_6;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			predicate=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			predicate_tree = (BAST)adaptor.dupTree(predicate);
			adaptor.addChild(root_5, predicate_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_4, root_5);
			_last = _save_last_5;
			}


			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_3, root_4);
			_last = _save_last_4;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:275:7: ( ^( LITERAL_variables ( . )+ ) )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==LITERAL_variables) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:275:8: ^( LITERAL_variables ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_4 = _last;
					BAST _first_4 = null;
					BAST root_4 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_variables61=(BAST)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_get_invariant_from_thread_behavior1114); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_variables.add(LITERAL_variables61);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:275:28: ( . )+
					int cnt36=0;
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( ((LA36_0 >= AADL_STRING_LITERAL && LA36_0 <= LITERAL_BLESS)) ) {
							alt36=1;
						}
						else if ( (LA36_0==UP) ) {
							alt36=2;
						}

						switch (alt36) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:275:28: .
							{
							_last = (BAST)input.LT(1);
							wildcard62=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard62_tree = (BAST)adaptor.dupTree(wildcard62);
							adaptor.addChild(root_4, wildcard62_tree);
							}

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt36 >= 1 ) break loop36;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(36, input);
							throw eee;
						}
						cnt36++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_3, root_4);
					_last = _save_last_4;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			{
			BAST _save_last_4 = _last;
			BAST _first_4 = null;
			BAST root_4 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_transitions63=(BAST)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_get_invariant_from_thread_behavior1130); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(LITERAL_transitions63);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:29: ( . )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( ((LA38_0 >= AADL_STRING_LITERAL && LA38_0 <= LITERAL_BLESS)) ) {
					alt38=1;
				}
				else if ( (LA38_0==UP) ) {
					alt38=2;
				}

				switch (alt38) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:29: .
					{
					_last = (BAST)input.LT(1);
					wildcard64=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard64_tree = (BAST)adaptor.dupTree(wildcard64);
					adaptor.addChild(root_4, wildcard64_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_3, root_4);
			_last = _save_last_4;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:278:7: ( DO_NOT_PROVE )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==DO_NOT_PROVE) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:278:7: DO_NOT_PROVE
					{
					_last = (BAST)input.LT(1);
					DO_NOT_PROVE65=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_get_invariant_from_thread_behavior1144); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(DO_NOT_PROVE65);

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			STOP66=(BAST)match(input,STOP,FOLLOW_STOP_in_get_invariant_from_thread_behavior1153); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_STOP.add(STOP66);

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_2, root_3);
			_last = _save_last_3;
			}


			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			_last = (BAST)input.LT(1);
			LITERAL_end67=(BAST)match(input,LITERAL_end,FOLLOW_LITERAL_end_in_get_invariant_from_thread_behavior1174); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_end.add(LITERAL_end67);

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: predicate, ass
			// token labels: ass
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: predicate
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
			RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"wildcard predicate",predicate);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 284:5: -> ^( $ass $predicate)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:284:8: ^( $ass $predicate)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ass.nextNode(), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			Dump.it("Did you forget an invariant clause, Bub?");
			  tell("ASTtoAST.get_invariant_from_thread_behavior",re,(BAST)retval.getTree());
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "get_invariant_from_thread_behavior"


	public static class get_invariant_from_bless_subclause_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "get_invariant_from_bless_subclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:290:1: get_invariant_from_bless_subclause : ^(ta= THREAD_ANNEX ^( LITERAL_states ( . )+ ) ( ^( LITERAL_availability . ) )? ( ^( LITERAL_assert ( . )+ ) )? ^( LITERAL_invariant ^(ass= ASSERTION ( ^( LABEL a= ID ) )? ( ^( PARAMETERS (lv+= . )+ ) )? predicate= . ) ) ( ^( LITERAL_variables ( . )+ ) )? ^( LITERAL_transitions ( . )+ ) ( DO_NOT_PROVE )? STOP ) -> ^( $ass $predicate) ;
	public final ASTtoAST.get_invariant_from_bless_subclause_return get_invariant_from_bless_subclause() throws RecognitionException {
		ASTtoAST.get_invariant_from_bless_subclause_return retval = new ASTtoAST.get_invariant_from_bless_subclause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST ta=null;
		BAST ass=null;
		BAST a=null;
		BAST LITERAL_states68=null;
		BAST wildcard69=null;
		BAST LITERAL_availability70=null;
		BAST wildcard71=null;
		BAST LITERAL_assert72=null;
		BAST wildcard73=null;
		BAST LITERAL_invariant74=null;
		BAST LABEL75=null;
		BAST PARAMETERS76=null;
		BAST LITERAL_variables77=null;
		BAST wildcard78=null;
		BAST LITERAL_transitions79=null;
		BAST wildcard80=null;
		BAST DO_NOT_PROVE81=null;
		BAST STOP82=null;
		BAST predicate=null;
		BAST lv=null;
		List<Object> list_lv=null;

		BAST ta_tree=null;
		BAST ass_tree=null;
		BAST a_tree=null;
		BAST LITERAL_states68_tree=null;
		BAST wildcard69_tree=null;
		BAST LITERAL_availability70_tree=null;
		BAST wildcard71_tree=null;
		BAST LITERAL_assert72_tree=null;
		BAST wildcard73_tree=null;
		BAST LITERAL_invariant74_tree=null;
		BAST LABEL75_tree=null;
		BAST PARAMETERS76_tree=null;
		BAST LITERAL_variables77_tree=null;
		BAST wildcard78_tree=null;
		BAST LITERAL_transitions79_tree=null;
		BAST wildcard80_tree=null;
		BAST DO_NOT_PROVE81_tree=null;
		BAST STOP82_tree=null;
		BAST predicate_tree=null;
		BAST lv_tree=null;
		RewriteRuleNodeStream stream_THREAD_ANNEX=new RewriteRuleNodeStream(adaptor,"token THREAD_ANNEX");
		RewriteRuleNodeStream stream_LITERAL_invariant=new RewriteRuleNodeStream(adaptor,"token LITERAL_invariant");
		RewriteRuleNodeStream stream_STOP=new RewriteRuleNodeStream(adaptor,"token STOP");
		RewriteRuleNodeStream stream_PARAMETERS=new RewriteRuleNodeStream(adaptor,"token PARAMETERS");
		RewriteRuleNodeStream stream_DO_NOT_PROVE=new RewriteRuleNodeStream(adaptor,"token DO_NOT_PROVE");
		RewriteRuleNodeStream stream_LITERAL_states=new RewriteRuleNodeStream(adaptor,"token LITERAL_states");
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LITERAL_availability=new RewriteRuleNodeStream(adaptor,"token LITERAL_availability");
		RewriteRuleNodeStream stream_LITERAL_assert=new RewriteRuleNodeStream(adaptor,"token LITERAL_assert");
		RewriteRuleNodeStream stream_LITERAL_transitions=new RewriteRuleNodeStream(adaptor,"token LITERAL_transitions");
		RewriteRuleNodeStream stream_LABEL=new RewriteRuleNodeStream(adaptor,"token LABEL");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_LITERAL_variables=new RewriteRuleNodeStream(adaptor,"token LITERAL_variables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:291:3: ( ^(ta= THREAD_ANNEX ^( LITERAL_states ( . )+ ) ( ^( LITERAL_availability . ) )? ( ^( LITERAL_assert ( . )+ ) )? ^( LITERAL_invariant ^(ass= ASSERTION ( ^( LABEL a= ID ) )? ( ^( PARAMETERS (lv+= . )+ ) )? predicate= . ) ) ( ^( LITERAL_variables ( . )+ ) )? ^( LITERAL_transitions ( . )+ ) ( DO_NOT_PROVE )? STOP ) -> ^( $ass $predicate) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:292:7: ^(ta= THREAD_ANNEX ^( LITERAL_states ( . )+ ) ( ^( LITERAL_availability . ) )? ( ^( LITERAL_assert ( . )+ ) )? ^( LITERAL_invariant ^(ass= ASSERTION ( ^( LABEL a= ID ) )? ( ^( PARAMETERS (lv+= . )+ ) )? predicate= . ) ) ( ^( LITERAL_variables ( . )+ ) )? ^( LITERAL_transitions ( . )+ ) ( DO_NOT_PROVE )? STOP )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ta=(BAST)match(input,THREAD_ANNEX,FOLLOW_THREAD_ANNEX_in_get_invariant_from_bless_subclause1234); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_THREAD_ANNEX.add(ta);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_2 = _last;
			BAST _first_2 = null;
			BAST root_2 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_states68=(BAST)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_get_invariant_from_bless_subclause1245); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_states.add(LITERAL_states68);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:293:24: ( . )+
			int cnt40=0;
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= AADL_STRING_LITERAL && LA40_0 <= LITERAL_BLESS)) ) {
					alt40=1;
				}
				else if ( (LA40_0==UP) ) {
					alt40=2;
				}

				switch (alt40) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:293:24: .
					{
					_last = (BAST)input.LT(1);
					wildcard69=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard69_tree = (BAST)adaptor.dupTree(wildcard69);
					adaptor.addChild(root_2, wildcard69_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt40 >= 1 ) break loop40;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(40, input);
					throw eee;
				}
				cnt40++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:294:7: ( ^( LITERAL_availability . ) )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LITERAL_availability) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:294:8: ^( LITERAL_availability . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_availability70=(BAST)match(input,LITERAL_availability,FOLLOW_LITERAL_availability_in_get_invariant_from_bless_subclause1261); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_availability.add(LITERAL_availability70);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard71=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard71_tree = (BAST)adaptor.dupTree(wildcard71);
					adaptor.addChild(root_2, wildcard71_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:295:7: ( ^( LITERAL_assert ( . )+ ) )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==LITERAL_assert) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:295:8: ^( LITERAL_assert ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_assert72=(BAST)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_get_invariant_from_bless_subclause1278); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_assert.add(LITERAL_assert72);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:295:25: ( . )+
					int cnt42=0;
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( ((LA42_0 >= AADL_STRING_LITERAL && LA42_0 <= LITERAL_BLESS)) ) {
							alt42=1;
						}
						else if ( (LA42_0==UP) ) {
							alt42=2;
						}

						switch (alt42) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:295:25: .
							{
							_last = (BAST)input.LT(1);
							wildcard73=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard73_tree = (BAST)adaptor.dupTree(wildcard73);
							adaptor.addChild(root_2, wildcard73_tree);
							}

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt42 >= 1 ) break loop42;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(42, input);
							throw eee;
						}
						cnt42++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			{
			BAST _save_last_2 = _last;
			BAST _first_2 = null;
			BAST root_2 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_invariant74=(BAST)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_get_invariant_from_bless_subclause1294); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant74);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_3 = _last;
			BAST _first_3 = null;
			BAST root_3 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_get_invariant_from_bless_subclause1301); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:296:46: ( ^( LABEL a= ID ) )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==LABEL) ) {
				int LA44_1 = input.LA(2);
				if ( (LA44_1==DOWN) ) {
					int LA44_3 = input.LA(3);
					if ( (LA44_3==ID) ) {
						int LA44_4 = input.LA(4);
						if ( (LA44_4==UP) ) {
							int LA44_5 = input.LA(5);
							if ( ((LA44_5 >= AADL_STRING_LITERAL && LA44_5 <= LITERAL_BLESS)) ) {
								alt44=1;
							}
						}
					}
				}
			}
			switch (alt44) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:296:47: ^( LABEL a= ID )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_4 = _last;
					BAST _first_4 = null;
					BAST root_4 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LABEL75=(BAST)match(input,LABEL,FOLLOW_LABEL_in_get_invariant_from_bless_subclause1307); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(LABEL75);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					a=(BAST)match(input,ID,FOLLOW_ID_in_get_invariant_from_bless_subclause1311); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ID.add(a);

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_3, root_4);
					_last = _save_last_4;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:296:66: ( ^( PARAMETERS (lv+= . )+ ) )?
			int alt46=2;
			alt46 = dfa46.predict(input);
			switch (alt46) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:296:68: ^( PARAMETERS (lv+= . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_4 = _last;
					BAST _first_4 = null;
					BAST root_4 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					PARAMETERS76=(BAST)match(input,PARAMETERS,FOLLOW_PARAMETERS_in_get_invariant_from_bless_subclause1321); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PARAMETERS.add(PARAMETERS76);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:296:83: (lv+= . )+
					int cnt45=0;
					loop45:
					while (true) {
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( ((LA45_0 >= AADL_STRING_LITERAL && LA45_0 <= LITERAL_BLESS)) ) {
							alt45=1;
						}

						switch (alt45) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:296:83: lv+= .
							{
							_last = (BAST)input.LT(1);
							lv=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							lv_tree = (BAST)adaptor.dupTree(lv);
							adaptor.addChild(root_4, lv_tree);
							}

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv);
							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt45 >= 1 ) break loop45;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(45, input);
							throw eee;
						}
						cnt45++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_3, root_4);
					_last = _save_last_4;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			predicate=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			predicate_tree = (BAST)adaptor.dupTree(predicate);
			adaptor.addChild(root_3, predicate_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_2, root_3);
			_last = _save_last_3;
			}


			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:297:7: ( ^( LITERAL_variables ( . )+ ) )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==LITERAL_variables) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:297:8: ^( LITERAL_variables ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_variables77=(BAST)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_get_invariant_from_bless_subclause1349); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_variables.add(LITERAL_variables77);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:297:28: ( . )+
					int cnt47=0;
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( ((LA47_0 >= AADL_STRING_LITERAL && LA47_0 <= LITERAL_BLESS)) ) {
							alt47=1;
						}
						else if ( (LA47_0==UP) ) {
							alt47=2;
						}

						switch (alt47) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:297:28: .
							{
							_last = (BAST)input.LT(1);
							wildcard78=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard78_tree = (BAST)adaptor.dupTree(wildcard78);
							adaptor.addChild(root_2, wildcard78_tree);
							}

							if ( state.backtracking==0 ) {
							}

							}
							break;

						default :
							if ( cnt47 >= 1 ) break loop47;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(47, input);
							throw eee;
						}
						cnt47++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			{
			BAST _save_last_2 = _last;
			BAST _first_2 = null;
			BAST root_2 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LITERAL_transitions79=(BAST)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_get_invariant_from_bless_subclause1365); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(LITERAL_transitions79);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:298:29: ( . )+
			int cnt49=0;
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( ((LA49_0 >= AADL_STRING_LITERAL && LA49_0 <= LITERAL_BLESS)) ) {
					alt49=1;
				}
				else if ( (LA49_0==UP) ) {
					alt49=2;
				}

				switch (alt49) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:298:29: .
					{
					_last = (BAST)input.LT(1);
					wildcard80=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard80_tree = (BAST)adaptor.dupTree(wildcard80);
					adaptor.addChild(root_2, wildcard80_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					if ( cnt49 >= 1 ) break loop49;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(49, input);
					throw eee;
				}
				cnt49++;
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:300:7: ( DO_NOT_PROVE )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==DO_NOT_PROVE) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:300:7: DO_NOT_PROVE
					{
					_last = (BAST)input.LT(1);
					DO_NOT_PROVE81=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_get_invariant_from_bless_subclause1379); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(DO_NOT_PROVE81);

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			STOP82=(BAST)match(input,STOP,FOLLOW_STOP_in_get_invariant_from_bless_subclause1388); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_STOP.add(STOP82);

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: ass, predicate
			// token labels: ass
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: predicate
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
			RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"wildcard predicate",predicate);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 303:5: -> ^( $ass $predicate)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:303:8: ^( $ass $predicate)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ass.nextNode(), root_1);
				adaptor.addChild(root_1, stream_predicate.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			if ( state.backtracking==0 ) {

			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			}

		}
		catch (RecognitionException re) {
			Dump.it("Did you forget an invariant clause, Bub?");
			  tell("Did you forget an invariant clause, Bub?",re,ta);
			//  tell("ASTtoAST.get_invariant_from_bless_subclause",re,(BAST)retval.getTree());
			  
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "get_invariant_from_bless_subclause"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA5 dfa5 = new DFA5(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA35 dfa35 = new DFA35(this);
	protected DFA46 dfa46 = new DFA46(this);
	static final String DFA3_eotS =
		"\7\uffff";
	static final String DFA3_eofS =
		"\7\uffff";
	static final String DFA3_minS =
		"\1\4\1\2\1\uffff\1\4\2\3\1\uffff";
	static final String DFA3_maxS =
		"\1\u0131\1\3\1\uffff\3\u0131\1\uffff";
	static final String DFA3_acceptS =
		"\2\uffff\1\2\3\uffff\1\1";
	static final String DFA3_specialS =
		"\7\uffff}>";
	static final String[] DFA3_transitionS = {
			"\u00fe\2\1\1\57\2",
			"\1\3\1\2",
			"",
			"\73\2\1\4\u00f2\2",
			"\1\5\73\2\1\4\u00f2\2",
			"\1\2\u012e\6",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "130:34: ( ^( PARAMETERS ( ID )+ ) )?";
		}
	}

	static final String DFA5_eotS =
		"\10\uffff";
	static final String DFA5_eofS =
		"\10\uffff";
	static final String DFA5_minS =
		"\1\4\1\2\1\uffff\1\3\1\2\1\uffff\1\4\1\2";
	static final String DFA5_maxS =
		"\1\u0131\1\u0115\1\uffff\2\u0131\1\uffff\1\u0131\1\u0115";
	static final String DFA5_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\2\uffff";
	static final String DFA5_specialS =
		"\10\uffff}>";
	static final String[] DFA5_transitionS = {
			"\163\2\1\1\u00ba\2",
			"\1\3\u0112\uffff\1\2",
			"",
			"\1\5\u012e\4",
			"\1\5\1\6\u012e\4",
			"",
			"\u0111\5\1\7\34\5",
			"\1\5\1\2\u0111\uffff\1\5"
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "137:12: ( ^( LITERAL_declare ( . )* ) )?";
		}
	}

	static final String DFA16_eotS =
		"\16\uffff";
	static final String DFA16_eofS =
		"\16\uffff";
	static final String DFA16_minS =
		"\1\15\1\2\1\4\1\2\1\uffff\1\4\2\3\1\2\1\uffff\1\4\2\3\1\uffff";
	static final String DFA16_maxS =
		"\1\15\1\2\1\u0131\1\3\1\uffff\3\u0131\1\3\1\uffff\3\u0131\1\uffff";
	static final String DFA16_acceptS =
		"\4\uffff\1\3\4\uffff\1\2\3\uffff\1\1";
	static final String DFA16_specialS =
		"\16\uffff}>";
	static final String[] DFA16_transitionS = {
			"\1\1",
			"\1\2",
			"\107\4\1\3\u00e6\4",
			"\1\5\1\4",
			"",
			"\73\4\1\6\u00f2\4",
			"\1\7\u012e\4",
			"\1\4\u00fe\11\1\10\57\11",
			"\1\12\1\11",
			"",
			"\73\11\1\13\u00f2\11",
			"\1\14\73\11\1\13\u00f2\11",
			"\1\11\u012e\15",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "195:1: anAssertion : ( ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS (lv+= ID )+ ) p= . ) -> ^( $ass ^( $l $a) ^( $par ( $lv)+ ) $p) | ^(ass= ASSERTION ^(l= LABEL a= ID ) p= . ) -> ^( $ass ^( $l $a) $p) | ^(ass= ASSERTION p= . ) -> ^( $ass $p) );";
		}
	}

	static final String DFA35_eotS =
		"\7\uffff";
	static final String DFA35_eofS =
		"\7\uffff";
	static final String DFA35_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA35_maxS =
		"\1\u0131\1\3\1\uffff\2\u0131\1\uffff\1\u0131";
	static final String DFA35_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\1\uffff";
	static final String DFA35_specialS =
		"\7\uffff}>";
	static final String[] DFA35_transitionS = {
			"\u00fe\2\1\1\57\2",
			"\1\3\1\2",
			"",
			"\u012e\4",
			"\1\5\1\6\u012e\4",
			"",
			"\1\2\u012e\5"
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "274:66: ( ^( PARAMETERS (lv+= . )+ ) )?";
		}
	}

	static final String DFA46_eotS =
		"\7\uffff";
	static final String DFA46_eofS =
		"\7\uffff";
	static final String DFA46_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA46_maxS =
		"\1\u0131\1\3\1\uffff\2\u0131\1\uffff\1\u0131";
	static final String DFA46_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\1\uffff";
	static final String DFA46_specialS =
		"\7\uffff}>";
	static final String[] DFA46_transitionS = {
			"\u00fe\2\1\1\57\2",
			"\1\3\1\2",
			"",
			"\u012e\4",
			"\1\5\1\6\u012e\4",
			"",
			"\1\2\u012e\5"
	};

	static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
	static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
	static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
	static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
	static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
	static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
	static final short[][] DFA46_transition;

	static {
		int numStates = DFA46_transitionS.length;
		DFA46_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
		}
	}

	protected class DFA46 extends DFA {

		public DFA46(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 46;
			this.eot = DFA46_eot;
			this.eof = DFA46_eof;
			this.min = DFA46_min;
			this.max = DFA46_max;
			this.accept = DFA46_accept;
			this.special = DFA46_special;
			this.transition = DFA46_transition;
		}
		@Override
		public String getDescription() {
			return "296:66: ( ^( PARAMETERS (lv+= . )+ ) )?";
		}
	}

	public static final BitSet FOLLOW_ASSERTION_in_getPredicateFromAssertion102 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_getPredicateFromAssertion108 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_getPredicateFromAssertion110 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_getPredicateFromAssertion118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_getPredicateFromAssertion120 = new BitSet(new long[]{0x8000000000000008L});
	public static final BitSet FOLLOW_LCURLY_in_getBehaviorActionsFromELQ157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_declare_in_getBehaviorActionsFromELQ161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_getBehaviorActionsFromELQ174 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LCURLY_in_getPreconditionFromBehaviorActionsInELQ203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActionsInELQ212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RCURLY_in_getPreconditionFromBehaviorActionsInELQ214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_getPreconditionFromBehaviorActions263 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPreconditionFromBehaviorActions266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPreconditionFromBehaviorActions275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPreconditionFromBehaviorActions282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEMICOLON_in_getPreconditionFromBehaviorActions304 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_getPreconditionFromBehaviorActions307 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPreconditionFromBehaviorActions310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPreconditionFromBehaviorActions319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPreconditionFromBehaviorActions326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AMPERSAND_in_getPreconditionFromBehaviorActions356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActions368 = new BitSet(new long[]{0x0000000000000248L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_getPreconditionFromBehaviorActionsInELQ_in_getPreconditionFromBehaviorActions410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_getPostconditionFromBehaviorActionsInELQ434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActionsInELQ446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_RCURLY_in_getPostconditionFromBehaviorActionsInELQ448 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_anAssertion493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_anAssertion500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_anAssertion504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_anAssertion511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_anAssertion515 = new BitSet(new long[]{0x8000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_anAssertion568 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_anAssertion575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_anAssertion579 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_anAssertion622 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_getPostconditionFromBehaviorActions684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPostconditionFromBehaviorActions687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPostconditionFromBehaviorActions694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPostconditionFromBehaviorActions701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEMICOLON_in_getPostconditionFromBehaviorActions727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_getPostconditionFromBehaviorActions737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPostconditionFromBehaviorActions747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPostconditionFromBehaviorActions761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPostconditionFromBehaviorActions775 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AMPERSAND_in_getPostconditionFromBehaviorActions816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActions828 = new BitSet(new long[]{0x0000000000000248L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_getPostconditionFromBehaviorActionsInELQ_in_getPostconditionFromBehaviorActions866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMPONENT_in_get_invariant_from_thread_behavior911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_implementation_in_get_invariant_from_thread_behavior923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_PERIOD_in_get_invariant_from_thread_behavior926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_get_invariant_from_thread_behavior930 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_ID_in_get_invariant_from_thread_behavior934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_get_invariant_from_thread_behavior945 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L,0x8000000000000040L});
	public static final BitSet FOLLOW_LITERAL_features_in_get_invariant_from_thread_behavior955 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_properties_in_get_invariant_from_thread_behavior971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_annex_in_get_invariant_from_thread_behavior986 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_BLESS_in_get_invariant_from_thread_behavior988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_THREAD_ANNEX_in_get_invariant_from_thread_behavior999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_states_in_get_invariant_from_thread_behavior1010 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_availability_in_get_invariant_from_thread_behavior1026 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_assert_in_get_invariant_from_thread_behavior1043 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_get_invariant_from_thread_behavior1059 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSERTION_in_get_invariant_from_thread_behavior1066 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_get_invariant_from_thread_behavior1072 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_get_invariant_from_thread_behavior1076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_get_invariant_from_thread_behavior1086 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_variables_in_get_invariant_from_thread_behavior1114 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_get_invariant_from_thread_behavior1130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_get_invariant_from_thread_behavior1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_STOP_in_get_invariant_from_thread_behavior1153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_end_in_get_invariant_from_thread_behavior1174 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THREAD_ANNEX_in_get_invariant_from_bless_subclause1234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_states_in_get_invariant_from_bless_subclause1245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_availability_in_get_invariant_from_bless_subclause1261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_assert_in_get_invariant_from_bless_subclause1278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_get_invariant_from_bless_subclause1294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSERTION_in_get_invariant_from_bless_subclause1301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_get_invariant_from_bless_subclause1307 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_get_invariant_from_bless_subclause1311 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_get_invariant_from_bless_subclause1321 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_variables_in_get_invariant_from_bless_subclause1349 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_get_invariant_from_bless_subclause1365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_get_invariant_from_bless_subclause1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_STOP_in_get_invariant_from_bless_subclause1388 = new BitSet(new long[]{0x0000000000000008L});
}
