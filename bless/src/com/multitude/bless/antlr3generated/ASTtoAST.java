// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g 2023-04-01 03:51:28

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:123:1: makeAnAllAreTree[Tree lv, Tree iw, Tree pred] : -> ^( LITERAL_all LITERAL_are ) ;
	public final ASTtoAST.makeAnAllAreTree_return makeAnAllAreTree(Tree lv, Tree iw, Tree pred) throws RecognitionException {
		ASTtoAST.makeAnAllAreTree_return retval = new ASTtoAST.makeAnAllAreTree_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:124:3: ( -> ^( LITERAL_all LITERAL_are ) )
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
			// 125:3: -> ^( LITERAL_all LITERAL_are )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:125:6: ^( LITERAL_all LITERAL_are )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_all, "LITERAL_all"), root_1);
				adaptor.addChild(root_1, lv);
				adaptor.addChild(root_1, iw);
				adaptor.addChild(root_1, (BAST)adaptor.create(LITERAL_are, "LITERAL_are"));
				adaptor.addChild(root_1, pred);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:128:1: getPredicateFromAssertion : ^( ASSERTION ( ^( LABEL ID ) )? ( ^( PARAMETERS . ) )? p= . ) ->;
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
		BAST wildcard5=null;
		BAST p=null;

		BAST ASSERTION1_tree=null;
		BAST LABEL2_tree=null;
		BAST ID3_tree=null;
		BAST PARAMETERS4_tree=null;
		BAST wildcard5_tree=null;
		BAST p_tree=null;
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LABEL=new RewriteRuleNodeStream(adaptor,"token LABEL");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_PARAMETERS=new RewriteRuleNodeStream(adaptor,"token PARAMETERS");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:129:3: ( ^( ASSERTION ( ^( LABEL ID ) )? ( ^( PARAMETERS . ) )? p= . ) ->)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:3: ^( ASSERTION ( ^( LABEL ID ) )? ( ^( PARAMETERS . ) )? p= . )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ASSERTION1=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_getPredicateFromAssertion96); if (state.failed) return retval;
			 
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
							if ( ((LA1_5 >= AADL_STRING_LITERAL && LA1_5 <= 306)) ) {
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
					LABEL2=(BAST)match(input,LABEL,FOLLOW_LABEL_in_getPredicateFromAssertion102); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(LABEL2);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					ID3=(BAST)match(input,ID,FOLLOW_ID_in_getPredicateFromAssertion104); if (state.failed) return retval;
					 
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

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:34: ( ^( PARAMETERS . ) )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==PARAMETERS) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_3 = input.LA(3);
					if ( ((LA2_3 >= AADL_STRING_LITERAL && LA2_3 <= 306)) ) {
						int LA2_4 = input.LA(4);
						if ( (LA2_4==DOWN) ) {
							alt2=1;
						}
						else if ( (LA2_4==UP) ) {
							int LA2_6 = input.LA(5);
							if ( ((LA2_6 >= AADL_STRING_LITERAL && LA2_6 <= 306)) ) {
								alt2=1;
							}
						}
					}
				}
			}
			switch (alt2) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:130:35: ^( PARAMETERS . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					PARAMETERS4=(BAST)match(input,PARAMETERS,FOLLOW_PARAMETERS_in_getPredicateFromAssertion112); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PARAMETERS.add(PARAMETERS4);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard5=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard5_tree = (BAST)adaptor.dupTree(wildcard5);
					adaptor.addChild(root_2, wildcard5_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:135:1: getBehaviorActionsFromELQ : ^( LCURLY ( ^( LITERAL_declare ( . )* ) )? ba= . RCURLY ( ^( LITERAL_catch ( . )+ ) )? ) ->;
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
		BAST LITERAL_catch10=null;
		BAST wildcard11=null;
		BAST ba=null;

		BAST LCURLY6_tree=null;
		BAST LITERAL_declare7_tree=null;
		BAST wildcard8_tree=null;
		BAST RCURLY9_tree=null;
		BAST LITERAL_catch10_tree=null;
		BAST wildcard11_tree=null;
		BAST ba_tree=null;
		RewriteRuleNodeStream stream_LITERAL_catch=new RewriteRuleNodeStream(adaptor,"token LITERAL_catch");
		RewriteRuleNodeStream stream_LCURLY=new RewriteRuleNodeStream(adaptor,"token LCURLY");
		RewriteRuleNodeStream stream_LITERAL_declare=new RewriteRuleNodeStream(adaptor,"token LITERAL_declare");
		RewriteRuleNodeStream stream_RCURLY=new RewriteRuleNodeStream(adaptor,"token RCURLY");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:136:3: ( ^( LCURLY ( ^( LITERAL_declare ( . )* ) )? ba= . RCURLY ( ^( LITERAL_catch ( . )+ ) )? ) ->)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:3: ^( LCURLY ( ^( LITERAL_declare ( . )* ) )? ba= . RCURLY ( ^( LITERAL_catch ( . )+ ) )? )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			LCURLY6=(BAST)match(input,LCURLY,FOLLOW_LCURLY_in_getBehaviorActionsFromELQ150); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY6);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:12: ( ^( LITERAL_declare ( . )* ) )?
			int alt4=2;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:13: ^( LITERAL_declare ( . )* )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_declare7=(BAST)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_getBehaviorActionsFromELQ154); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_declare.add(LITERAL_declare7);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:31: ( . )*
						loop3:
						while (true) {
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( ((LA3_0 >= AADL_STRING_LITERAL && LA3_0 <= 306)) ) {
								alt3=1;
							}
							else if ( (LA3_0==UP) ) {
								alt3=2;
							}

							switch (alt3) {
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
								break loop3;
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
			RCURLY9=(BAST)match(input,RCURLY,FOLLOW_RCURLY_in_getBehaviorActionsFromELQ167); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY9);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:50: ( ^( LITERAL_catch ( . )+ ) )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==LITERAL_catch) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:51: ^( LITERAL_catch ( . )+ )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					LITERAL_catch10=(BAST)match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_getBehaviorActionsFromELQ172); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LITERAL_catch.add(LITERAL_catch10);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:68: ( . )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= AADL_STRING_LITERAL && LA5_0 <= 306)) ) {
							alt5=1;
						}
						else if ( (LA5_0==UP) ) {
							alt5=2;
						}

						switch (alt5) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:137:68: .
							{
							_last = (BAST)input.LT(1);
							wildcard11=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard11_tree = (BAST)adaptor.dupTree(wildcard11);
							adaptor.addChild(root_2, wildcard11_tree);
							}

							if ( state.backtracking==0 ) {
							}

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

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					if ( state.backtracking==0 ) {
					}

					}
					break;

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


		BAST LCURLY12=null;
		BAST RCURLY13=null;
		BAST v=null;
		TreeRuleReturnScope ba =null;

		BAST LCURLY12_tree=null;
		BAST RCURLY13_tree=null;
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
			LCURLY12=(BAST)match(input,LCURLY,FOLLOW_LCURLY_in_getPreconditionFromBehaviorActionsInELQ209); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY12);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:144:13: (v= . )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ACTION) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					int LA7_6 = input.LA(3);
					if ( (LA7_6==P) ) {
						int LA7_10 = input.LA(4);
						if ( ((LA7_10 >= UP && LA7_10 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( ((LA7_6 >= AADL_STRING_LITERAL && LA7_6 <= ON)||(LA7_6 >= PARAMETER && LA7_6 <= 306)) ) {
						alt7=1;
					}
				}
				else if ( (LA7_1==ACTION||LA7_1==AMPERSAND||LA7_1==LCURLY||LA7_1==SEMICOLON) ) {
					alt7=1;
				}
			}
			else if ( (LA7_0==SEMICOLON) ) {
				int LA7_2 = input.LA(2);
				if ( (LA7_2==DOWN) ) {
					int LA7_7 = input.LA(3);
					if ( (LA7_7==ACTION) ) {
						int LA7_11 = input.LA(4);
						if ( ((LA7_11 >= UP && LA7_11 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( ((LA7_7 >= AADL_STRING_LITERAL && LA7_7 <= AADL_STRING_PART)||(LA7_7 >= ACTION_SUBCLAUSE && LA7_7 <= 306)) ) {
						alt7=1;
					}
				}
				else if ( (LA7_2==ACTION||LA7_2==AMPERSAND||LA7_2==LCURLY||LA7_2==SEMICOLON) ) {
					alt7=1;
				}
			}
			else if ( (LA7_0==AMPERSAND) ) {
				int LA7_3 = input.LA(2);
				if ( (LA7_3==DOWN) ) {
					int LA7_8 = input.LA(3);
					if ( (LA7_8==ACTION) ) {
						int LA7_12 = input.LA(4);
						if ( ((LA7_12 >= UP && LA7_12 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( (LA7_8==SEMICOLON) ) {
						int LA7_13 = input.LA(4);
						if ( ((LA7_13 >= UP && LA7_13 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( (LA7_8==AMPERSAND) ) {
						int LA7_14 = input.LA(4);
						if ( ((LA7_14 >= UP && LA7_14 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( (LA7_8==LCURLY) ) {
						int LA7_15 = input.LA(4);
						if ( ((LA7_15 >= UP && LA7_15 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( ((LA7_8 >= AADL_STRING_LITERAL && LA7_8 <= AADL_STRING_PART)||(LA7_8 >= ACTION_SUBCLAUSE && LA7_8 <= AM)||(LA7_8 >= ANNEX_END && LA7_8 <= LCON)||(LA7_8 >= LITERAL_Assertion && LA7_8 <= S)||(LA7_8 >= SLCOMMENT && LA7_8 <= 306)) ) {
						alt7=1;
					}
				}
				else if ( (LA7_3==ACTION||LA7_3==AMPERSAND||LA7_3==LCURLY||LA7_3==SEMICOLON) ) {
					alt7=1;
				}
			}
			else if ( (LA7_0==LCURLY) ) {
				int LA7_4 = input.LA(2);
				if ( (LA7_4==DOWN) ) {
					int LA7_9 = input.LA(3);
					if ( (LA7_9==ACTION) ) {
						int LA7_16 = input.LA(4);
						if ( (LA7_16==ACTION) ) {
							int LA7_22 = input.LA(5);
							if ( ((LA7_22 >= UP && LA7_22 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_16==SEMICOLON) ) {
							int LA7_23 = input.LA(5);
							if ( ((LA7_23 >= UP && LA7_23 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_16==AMPERSAND) ) {
							int LA7_24 = input.LA(5);
							if ( ((LA7_24 >= UP && LA7_24 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_16==LCURLY) ) {
							int LA7_25 = input.LA(5);
							if ( ((LA7_25 >= UP && LA7_25 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( ((LA7_16 >= UP && LA7_16 <= AADL_STRING_PART)||(LA7_16 >= ACTION_SUBCLAUSE && LA7_16 <= AM)||(LA7_16 >= ANNEX_END && LA7_16 <= LCON)||(LA7_16 >= LITERAL_Assertion && LA7_16 <= S)||(LA7_16 >= SLCOMMENT && LA7_16 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( (LA7_9==SEMICOLON) ) {
						int LA7_17 = input.LA(4);
						if ( (LA7_17==ACTION) ) {
							int LA7_22 = input.LA(5);
							if ( ((LA7_22 >= UP && LA7_22 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_17==SEMICOLON) ) {
							int LA7_23 = input.LA(5);
							if ( ((LA7_23 >= UP && LA7_23 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_17==AMPERSAND) ) {
							int LA7_24 = input.LA(5);
							if ( ((LA7_24 >= UP && LA7_24 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_17==LCURLY) ) {
							int LA7_25 = input.LA(5);
							if ( ((LA7_25 >= UP && LA7_25 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( ((LA7_17 >= UP && LA7_17 <= AADL_STRING_PART)||(LA7_17 >= ACTION_SUBCLAUSE && LA7_17 <= AM)||(LA7_17 >= ANNEX_END && LA7_17 <= LCON)||(LA7_17 >= LITERAL_Assertion && LA7_17 <= S)||(LA7_17 >= SLCOMMENT && LA7_17 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( (LA7_9==AMPERSAND) ) {
						int LA7_18 = input.LA(4);
						if ( (LA7_18==ACTION) ) {
							int LA7_22 = input.LA(5);
							if ( ((LA7_22 >= UP && LA7_22 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_18==SEMICOLON) ) {
							int LA7_23 = input.LA(5);
							if ( ((LA7_23 >= UP && LA7_23 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_18==AMPERSAND) ) {
							int LA7_24 = input.LA(5);
							if ( ((LA7_24 >= UP && LA7_24 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_18==LCURLY) ) {
							int LA7_25 = input.LA(5);
							if ( ((LA7_25 >= UP && LA7_25 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( ((LA7_18 >= UP && LA7_18 <= AADL_STRING_PART)||(LA7_18 >= ACTION_SUBCLAUSE && LA7_18 <= AM)||(LA7_18 >= ANNEX_END && LA7_18 <= LCON)||(LA7_18 >= LITERAL_Assertion && LA7_18 <= S)||(LA7_18 >= SLCOMMENT && LA7_18 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( (LA7_9==LCURLY) ) {
						int LA7_19 = input.LA(4);
						if ( (LA7_19==ACTION) ) {
							int LA7_22 = input.LA(5);
							if ( ((LA7_22 >= UP && LA7_22 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_19==SEMICOLON) ) {
							int LA7_23 = input.LA(5);
							if ( ((LA7_23 >= UP && LA7_23 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_19==AMPERSAND) ) {
							int LA7_24 = input.LA(5);
							if ( ((LA7_24 >= UP && LA7_24 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_19==LCURLY) ) {
							int LA7_25 = input.LA(5);
							if ( ((LA7_25 >= UP && LA7_25 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( ((LA7_19 >= UP && LA7_19 <= AADL_STRING_PART)||(LA7_19 >= ACTION_SUBCLAUSE && LA7_19 <= AM)||(LA7_19 >= ANNEX_END && LA7_19 <= LCON)||(LA7_19 >= LITERAL_Assertion && LA7_19 <= S)||(LA7_19 >= SLCOMMENT && LA7_19 <= 306)) ) {
							alt7=1;
						}
					}
					else if ( ((LA7_9 >= AADL_STRING_LITERAL && LA7_9 <= AADL_STRING_PART)||(LA7_9 >= ACTION_SUBCLAUSE && LA7_9 <= AM)||(LA7_9 >= ANNEX_END && LA7_9 <= LCON)||(LA7_9 >= LITERAL_Assertion && LA7_9 <= S)||(LA7_9 >= SLCOMMENT && LA7_9 <= 306)) ) {
						int LA7_20 = input.LA(4);
						if ( (LA7_20==ACTION) ) {
							int LA7_22 = input.LA(5);
							if ( ((LA7_22 >= UP && LA7_22 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_20==SEMICOLON) ) {
							int LA7_23 = input.LA(5);
							if ( ((LA7_23 >= UP && LA7_23 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_20==AMPERSAND) ) {
							int LA7_24 = input.LA(5);
							if ( ((LA7_24 >= UP && LA7_24 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( (LA7_20==LCURLY) ) {
							int LA7_25 = input.LA(5);
							if ( ((LA7_25 >= UP && LA7_25 <= 306)) ) {
								alt7=1;
							}
						}
						else if ( ((LA7_20 >= UP && LA7_20 <= AADL_STRING_PART)||(LA7_20 >= ACTION_SUBCLAUSE && LA7_20 <= AM)||(LA7_20 >= ANNEX_END && LA7_20 <= LCON)||(LA7_20 >= LITERAL_Assertion && LA7_20 <= S)||(LA7_20 >= SLCOMMENT && LA7_20 <= 306)) ) {
							alt7=1;
						}
					}
				}
				else if ( (LA7_4==ACTION||LA7_4==AMPERSAND||LA7_4==LCURLY||LA7_4==SEMICOLON) ) {
					alt7=1;
				}
			}
			else if ( ((LA7_0 >= AADL_STRING_LITERAL && LA7_0 <= AADL_STRING_PART)||(LA7_0 >= ACTION_SUBCLAUSE && LA7_0 <= AM)||(LA7_0 >= ANNEX_END && LA7_0 <= LCON)||(LA7_0 >= LITERAL_Assertion && LA7_0 <= S)||(LA7_0 >= SLCOMMENT && LA7_0 <= 306)) ) {
				alt7=1;
			}
			switch (alt7) {
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
			pushFollow(FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActionsInELQ218);
			ba=getPreconditionFromBehaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_getPreconditionFromBehaviorActions.add(ba.getTree());
			_last = (BAST)input.LT(1);
			RCURLY13=(BAST)match(input,RCURLY,FOLLOW_RCURLY_in_getPreconditionFromBehaviorActionsInELQ220); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY13);

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
		BAST ACTION14=null;
		BAST P15=null;
		BAST S16=null;
		BAST wildcard17=null;
		BAST Q18=null;
		BAST wildcard19=null;
		BAST SEMICOLON20=null;
		BAST ACTION21=null;
		BAST P22=null;
		BAST S23=null;
		BAST wildcard24=null;
		BAST Q25=null;
		BAST wildcard26=null;
		BAST wildcard27=null;
		BAST p=null;
		BAST p2=null;
		TreeRuleReturnScope prc =null;
		TreeRuleReturnScope elq =null;

		BAST amp_tree=null;
		BAST ACTION14_tree=null;
		BAST P15_tree=null;
		BAST S16_tree=null;
		BAST wildcard17_tree=null;
		BAST Q18_tree=null;
		BAST wildcard19_tree=null;
		BAST SEMICOLON20_tree=null;
		BAST ACTION21_tree=null;
		BAST P22_tree=null;
		BAST S23_tree=null;
		BAST wildcard24_tree=null;
		BAST Q25_tree=null;
		BAST wildcard26_tree=null;
		BAST wildcard27_tree=null;
		BAST p_tree=null;
		BAST p2_tree=null;
		RewriteRuleSubtreeStream stream_getPreconditionFromBehaviorActionsInELQ=new RewriteRuleSubtreeStream(adaptor,"rule getPreconditionFromBehaviorActionsInELQ");

		ArrayList<BAST> andTerms = new ArrayList<BAST>();
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:152:3: ( ^( ACTION ^( P (p= . )? ) ^( S . ) ^( Q ( . )? ) ) | ^( SEMICOLON ^( ACTION ^( P (p2= . )? ) ^( S . ) ^( Q ( . )? ) ) ( . )+ ) | ^(amp= AMPERSAND (prc= getPreconditionFromBehaviorActions )+ ) |elq= getPreconditionFromBehaviorActionsInELQ ->)
			int alt14=4;
			switch ( input.LA(1) ) {
			case ACTION:
				{
				alt14=1;
				}
				break;
			case SEMICOLON:
				{
				alt14=2;
				}
				break;
			case AMPERSAND:
				{
				alt14=3;
				}
				break;
			case LCURLY:
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
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
					ACTION14=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPreconditionFromBehaviorActions269); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION14_tree = (BAST)adaptor.dupNode(ACTION14);


					root_1 = (BAST)adaptor.becomeRoot(ACTION14_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					P15=(BAST)match(input,P,FOLLOW_P_in_getPreconditionFromBehaviorActions272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					P15_tree = (BAST)adaptor.dupNode(P15);


					root_2 = (BAST)adaptor.becomeRoot(P15_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:17: (p= . )?
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= AADL_STRING_LITERAL && LA8_0 <= 306)) ) {
							alt8=1;
						}
						switch (alt8) {
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
					S16=(BAST)match(input,S,FOLLOW_S_in_getPreconditionFromBehaviorActions281); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					S16_tree = (BAST)adaptor.dupNode(S16);


					root_2 = (BAST)adaptor.becomeRoot(S16_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard17=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard17_tree = (BAST)adaptor.dupTree(wildcard17);
					adaptor.addChild(root_2, wildcard17_tree);
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
					Q18=(BAST)match(input,Q,FOLLOW_Q_in_getPreconditionFromBehaviorActions288); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Q18_tree = (BAST)adaptor.dupNode(Q18);


					root_2 = (BAST)adaptor.becomeRoot(Q18_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:34: ( . )?
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= AADL_STRING_LITERAL && LA9_0 <= 306)) ) {
							alt9=1;
						}
						switch (alt9) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:153:34: .
								{
								_last = (BAST)input.LT(1);
								wildcard19=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard19_tree = (BAST)adaptor.dupTree(wildcard19);
								adaptor.addChild(root_2, wildcard19_tree);
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
					SEMICOLON20=(BAST)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_getPreconditionFromBehaviorActions310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON20_tree = (BAST)adaptor.dupNode(SEMICOLON20);


					root_1 = (BAST)adaptor.becomeRoot(SEMICOLON20_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ACTION21=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPreconditionFromBehaviorActions313); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION21_tree = (BAST)adaptor.dupNode(ACTION21);


					root_2 = (BAST)adaptor.becomeRoot(ACTION21_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_3 = _last;
					BAST _first_3 = null;
					BAST root_3 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					P22=(BAST)match(input,P,FOLLOW_P_in_getPreconditionFromBehaviorActions316); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					P22_tree = (BAST)adaptor.dupNode(P22);


					root_3 = (BAST)adaptor.becomeRoot(P22_tree, root_3);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:30: (p2= . )?
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= AADL_STRING_LITERAL && LA10_0 <= 306)) ) {
							alt10=1;
						}
						switch (alt10) {
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
					S23=(BAST)match(input,S,FOLLOW_S_in_getPreconditionFromBehaviorActions325); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					S23_tree = (BAST)adaptor.dupNode(S23);


					root_3 = (BAST)adaptor.becomeRoot(S23_tree, root_3);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard24=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard24_tree = (BAST)adaptor.dupTree(wildcard24);
					adaptor.addChild(root_3, wildcard24_tree);
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
					Q25=(BAST)match(input,Q,FOLLOW_Q_in_getPreconditionFromBehaviorActions332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Q25_tree = (BAST)adaptor.dupNode(Q25);


					root_3 = (BAST)adaptor.becomeRoot(Q25_tree, root_3);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:47: ( . )?
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= AADL_STRING_LITERAL && LA11_0 <= 306)) ) {
							alt11=1;
						}
						switch (alt11) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:47: .
								{
								_last = (BAST)input.LT(1);
								wildcard26=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard26_tree = (BAST)adaptor.dupTree(wildcard26);
								adaptor.addChild(root_3, wildcard26_tree);
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
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= AADL_STRING_LITERAL && LA12_0 <= 306)) ) {
							alt12=1;
						}
						else if ( (LA12_0==UP) ) {
							alt12=2;
						}

						switch (alt12) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:156:54: .
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
					amp=(BAST)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_getPreconditionFromBehaviorActions362); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					amp_tree = (BAST)adaptor.dupNode(amp);


					root_1 = (BAST)adaptor.becomeRoot(amp_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:161:6: (prc= getPreconditionFromBehaviorActions )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==ACTION||LA13_0==AMPERSAND||LA13_0==LCURLY||LA13_0==SEMICOLON) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:161:8: prc= getPreconditionFromBehaviorActions
							{
							_last = (BAST)input.LT(1);
							pushFollow(FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActions374);
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
							if ( cnt13 >= 1 ) break loop13;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
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
					pushFollow(FOLLOW_getPreconditionFromBehaviorActionsInELQ_in_getPreconditionFromBehaviorActions416);
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


		BAST LCURLY28=null;
		BAST wildcard29=null;
		BAST RCURLY30=null;
		TreeRuleReturnScope b =null;

		BAST LCURLY28_tree=null;
		BAST wildcard29_tree=null;
		BAST RCURLY30_tree=null;
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
			LCURLY28=(BAST)match(input,LCURLY,FOLLOW_LCURLY_in_getPostconditionFromBehaviorActionsInELQ440); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY28);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:185:12: ( . )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ACTION) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==DOWN) ) {
					int LA15_6 = input.LA(3);
					if ( (LA15_6==P) ) {
						int LA15_10 = input.LA(4);
						if ( ((LA15_10 >= UP && LA15_10 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( ((LA15_6 >= AADL_STRING_LITERAL && LA15_6 <= ON)||(LA15_6 >= PARAMETER && LA15_6 <= 306)) ) {
						alt15=1;
					}
				}
				else if ( (LA15_1==ACTION||LA15_1==AMPERSAND||LA15_1==LCURLY||LA15_1==SEMICOLON) ) {
					alt15=1;
				}
			}
			else if ( (LA15_0==SEMICOLON) ) {
				int LA15_2 = input.LA(2);
				if ( (LA15_2==DOWN) ) {
					int LA15_7 = input.LA(3);
					if ( (LA15_7==ACTION) ) {
						int LA15_11 = input.LA(4);
						if ( ((LA15_11 >= UP && LA15_11 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( ((LA15_7 >= AADL_STRING_LITERAL && LA15_7 <= AADL_STRING_PART)||(LA15_7 >= ACTION_SUBCLAUSE && LA15_7 <= 306)) ) {
						alt15=1;
					}
				}
				else if ( (LA15_2==ACTION||LA15_2==AMPERSAND||LA15_2==LCURLY||LA15_2==SEMICOLON) ) {
					alt15=1;
				}
			}
			else if ( (LA15_0==AMPERSAND) ) {
				int LA15_3 = input.LA(2);
				if ( (LA15_3==DOWN) ) {
					int LA15_8 = input.LA(3);
					if ( (LA15_8==ACTION) ) {
						int LA15_12 = input.LA(4);
						if ( ((LA15_12 >= UP && LA15_12 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( (LA15_8==SEMICOLON) ) {
						int LA15_13 = input.LA(4);
						if ( ((LA15_13 >= UP && LA15_13 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( (LA15_8==AMPERSAND) ) {
						int LA15_14 = input.LA(4);
						if ( ((LA15_14 >= UP && LA15_14 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( (LA15_8==LCURLY) ) {
						int LA15_15 = input.LA(4);
						if ( ((LA15_15 >= UP && LA15_15 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( ((LA15_8 >= AADL_STRING_LITERAL && LA15_8 <= AADL_STRING_PART)||(LA15_8 >= ACTION_SUBCLAUSE && LA15_8 <= AM)||(LA15_8 >= ANNEX_END && LA15_8 <= LCON)||(LA15_8 >= LITERAL_Assertion && LA15_8 <= S)||(LA15_8 >= SLCOMMENT && LA15_8 <= 306)) ) {
						alt15=1;
					}
				}
				else if ( (LA15_3==ACTION||LA15_3==AMPERSAND||LA15_3==LCURLY||LA15_3==SEMICOLON) ) {
					alt15=1;
				}
			}
			else if ( (LA15_0==LCURLY) ) {
				int LA15_4 = input.LA(2);
				if ( (LA15_4==DOWN) ) {
					int LA15_9 = input.LA(3);
					if ( (LA15_9==ACTION) ) {
						int LA15_16 = input.LA(4);
						if ( (LA15_16==ACTION) ) {
							int LA15_22 = input.LA(5);
							if ( ((LA15_22 >= UP && LA15_22 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_16==SEMICOLON) ) {
							int LA15_23 = input.LA(5);
							if ( ((LA15_23 >= UP && LA15_23 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_16==AMPERSAND) ) {
							int LA15_24 = input.LA(5);
							if ( ((LA15_24 >= UP && LA15_24 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_16==LCURLY) ) {
							int LA15_25 = input.LA(5);
							if ( ((LA15_25 >= UP && LA15_25 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( ((LA15_16 >= UP && LA15_16 <= AADL_STRING_PART)||(LA15_16 >= ACTION_SUBCLAUSE && LA15_16 <= AM)||(LA15_16 >= ANNEX_END && LA15_16 <= LCON)||(LA15_16 >= LITERAL_Assertion && LA15_16 <= S)||(LA15_16 >= SLCOMMENT && LA15_16 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( (LA15_9==SEMICOLON) ) {
						int LA15_17 = input.LA(4);
						if ( (LA15_17==ACTION) ) {
							int LA15_22 = input.LA(5);
							if ( ((LA15_22 >= UP && LA15_22 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_17==SEMICOLON) ) {
							int LA15_23 = input.LA(5);
							if ( ((LA15_23 >= UP && LA15_23 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_17==AMPERSAND) ) {
							int LA15_24 = input.LA(5);
							if ( ((LA15_24 >= UP && LA15_24 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_17==LCURLY) ) {
							int LA15_25 = input.LA(5);
							if ( ((LA15_25 >= UP && LA15_25 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( ((LA15_17 >= UP && LA15_17 <= AADL_STRING_PART)||(LA15_17 >= ACTION_SUBCLAUSE && LA15_17 <= AM)||(LA15_17 >= ANNEX_END && LA15_17 <= LCON)||(LA15_17 >= LITERAL_Assertion && LA15_17 <= S)||(LA15_17 >= SLCOMMENT && LA15_17 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( (LA15_9==AMPERSAND) ) {
						int LA15_18 = input.LA(4);
						if ( (LA15_18==ACTION) ) {
							int LA15_22 = input.LA(5);
							if ( ((LA15_22 >= UP && LA15_22 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_18==SEMICOLON) ) {
							int LA15_23 = input.LA(5);
							if ( ((LA15_23 >= UP && LA15_23 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_18==AMPERSAND) ) {
							int LA15_24 = input.LA(5);
							if ( ((LA15_24 >= UP && LA15_24 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_18==LCURLY) ) {
							int LA15_25 = input.LA(5);
							if ( ((LA15_25 >= UP && LA15_25 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( ((LA15_18 >= UP && LA15_18 <= AADL_STRING_PART)||(LA15_18 >= ACTION_SUBCLAUSE && LA15_18 <= AM)||(LA15_18 >= ANNEX_END && LA15_18 <= LCON)||(LA15_18 >= LITERAL_Assertion && LA15_18 <= S)||(LA15_18 >= SLCOMMENT && LA15_18 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( (LA15_9==LCURLY) ) {
						int LA15_19 = input.LA(4);
						if ( (LA15_19==ACTION) ) {
							int LA15_22 = input.LA(5);
							if ( ((LA15_22 >= UP && LA15_22 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_19==SEMICOLON) ) {
							int LA15_23 = input.LA(5);
							if ( ((LA15_23 >= UP && LA15_23 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_19==AMPERSAND) ) {
							int LA15_24 = input.LA(5);
							if ( ((LA15_24 >= UP && LA15_24 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_19==LCURLY) ) {
							int LA15_25 = input.LA(5);
							if ( ((LA15_25 >= UP && LA15_25 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( ((LA15_19 >= UP && LA15_19 <= AADL_STRING_PART)||(LA15_19 >= ACTION_SUBCLAUSE && LA15_19 <= AM)||(LA15_19 >= ANNEX_END && LA15_19 <= LCON)||(LA15_19 >= LITERAL_Assertion && LA15_19 <= S)||(LA15_19 >= SLCOMMENT && LA15_19 <= 306)) ) {
							alt15=1;
						}
					}
					else if ( ((LA15_9 >= AADL_STRING_LITERAL && LA15_9 <= AADL_STRING_PART)||(LA15_9 >= ACTION_SUBCLAUSE && LA15_9 <= AM)||(LA15_9 >= ANNEX_END && LA15_9 <= LCON)||(LA15_9 >= LITERAL_Assertion && LA15_9 <= S)||(LA15_9 >= SLCOMMENT && LA15_9 <= 306)) ) {
						int LA15_20 = input.LA(4);
						if ( (LA15_20==ACTION) ) {
							int LA15_22 = input.LA(5);
							if ( ((LA15_22 >= UP && LA15_22 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_20==SEMICOLON) ) {
							int LA15_23 = input.LA(5);
							if ( ((LA15_23 >= UP && LA15_23 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_20==AMPERSAND) ) {
							int LA15_24 = input.LA(5);
							if ( ((LA15_24 >= UP && LA15_24 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( (LA15_20==LCURLY) ) {
							int LA15_25 = input.LA(5);
							if ( ((LA15_25 >= UP && LA15_25 <= 306)) ) {
								alt15=1;
							}
						}
						else if ( ((LA15_20 >= UP && LA15_20 <= AADL_STRING_PART)||(LA15_20 >= ACTION_SUBCLAUSE && LA15_20 <= AM)||(LA15_20 >= ANNEX_END && LA15_20 <= LCON)||(LA15_20 >= LITERAL_Assertion && LA15_20 <= S)||(LA15_20 >= SLCOMMENT && LA15_20 <= 306)) ) {
							alt15=1;
						}
					}
				}
				else if ( (LA15_4==ACTION||LA15_4==AMPERSAND||LA15_4==LCURLY||LA15_4==SEMICOLON) ) {
					alt15=1;
				}
			}
			else if ( ((LA15_0 >= AADL_STRING_LITERAL && LA15_0 <= AADL_STRING_PART)||(LA15_0 >= ACTION_SUBCLAUSE && LA15_0 <= AM)||(LA15_0 >= ANNEX_END && LA15_0 <= LCON)||(LA15_0 >= LITERAL_Assertion && LA15_0 <= S)||(LA15_0 >= SLCOMMENT && LA15_0 <= 306)) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:185:12: .
					{
					_last = (BAST)input.LT(1);
					wildcard29=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard29_tree = (BAST)adaptor.dupTree(wildcard29);
					adaptor.addChild(root_1, wildcard29_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

			}

			_last = (BAST)input.LT(1);
			pushFollow(FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActionsInELQ452);
			b=getPostconditionFromBehaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_getPostconditionFromBehaviorActions.add(b.getTree());
			_last = (BAST)input.LT(1);
			RCURLY30=(BAST)match(input,RCURLY,FOLLOW_RCURLY_in_getPostconditionFromBehaviorActionsInELQ454); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY30);

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:195:1: anAssertion : ( ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS formals= variableList ) p= . ) -> ^( $ass ^( $l $a) ^( $par $formals) $p) | ^(ass= ASSERTION ^(l= LABEL a= ID ) p= . ) -> ^( $ass ^( $l $a) $p) | ^(ass= ASSERTION p= . ) -> ^( $ass $p) );
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
		BAST p=null;
		TreeRuleReturnScope formals =null;

		BAST ass_tree=null;
		BAST l_tree=null;
		BAST a_tree=null;
		BAST par_tree=null;
		BAST p_tree=null;
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LABEL=new RewriteRuleNodeStream(adaptor,"token LABEL");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");
		RewriteRuleNodeStream stream_PARAMETERS=new RewriteRuleNodeStream(adaptor,"token PARAMETERS");
		RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:196:3: ( ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS formals= variableList ) p= . ) -> ^( $ass ^( $l $a) ^( $par $formals) $p) | ^(ass= ASSERTION ^(l= LABEL a= ID ) p= . ) -> ^( $ass ^( $l $a) $p) | ^(ass= ASSERTION p= . ) -> ^( $ass $p) )
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ASSERTION) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==DOWN) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==LABEL) ) {
						int LA16_3 = input.LA(4);
						if ( (LA16_3==DOWN) ) {
							int LA16_5 = input.LA(5);
							if ( (LA16_5==ID) ) {
								int LA16_6 = input.LA(6);
								if ( (LA16_6==UP) ) {
									int LA16_7 = input.LA(7);
									if ( (LA16_7==PARAMETERS) ) {
										int LA16_8 = input.LA(8);
										if ( (LA16_8==DOWN) ) {
											int LA16_10 = input.LA(9);
											if ( (LA16_10==TILDE) ) {
												int LA16_11 = input.LA(10);
												if ( (LA16_11==DOWN) ) {
													alt16=1;
												}
												else if ( ((LA16_11 >= UP && LA16_11 <= 306)) ) {
													alt16=2;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 16, 11, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}
											else if ( (LA16_10==COMMA) ) {
												int LA16_12 = input.LA(10);
												if ( (LA16_12==DOWN) ) {
													alt16=1;
												}
												else if ( ((LA16_12 >= UP && LA16_12 <= 306)) ) {
													alt16=2;
												}

												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 16, 12, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}
											else if ( ((LA16_10 >= AADL_STRING_LITERAL && LA16_10 <= COLON_TILDE)||(LA16_10 >= COMMACOMMA && LA16_10 <= TICK)||(LA16_10 >= TIMES && LA16_10 <= 306)) ) {
												alt16=2;
											}

											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 16, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}
										else if ( (LA16_8==UP) ) {
											alt16=2;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 16, 8, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( ((LA16_7 >= AADL_STRING_LITERAL && LA16_7 <= PARAMETER)||(LA16_7 >= PLUS && LA16_7 <= 306)) ) {
										alt16=2;
									}
									else if ( (LA16_7==UP) ) {
										alt16=3;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 16, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( ((LA16_6 >= AADL_STRING_LITERAL && LA16_6 <= 306)) ) {
									alt16=3;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( ((LA16_5 >= AADL_STRING_LITERAL && LA16_5 <= HEX_DIGIT)||(LA16_5 >= IMP && LA16_5 <= 306)) ) {
								alt16=3;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 16, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA16_3==UP) ) {
							alt16=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 16, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA16_2 >= AADL_STRING_LITERAL && LA16_2 <= IP_PRED)||(LA16_2 >= LASS && LA16_2 <= 306)) ) {
						alt16=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
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
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:197:3: ^(ass= ASSERTION ^(l= LABEL a= ID ) ^(par= PARAMETERS formals= variableList ) p= . )
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_anAssertion499); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					l=(BAST)match(input,LABEL,FOLLOW_LABEL_in_anAssertion506); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(l);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					a=(BAST)match(input,ID,FOLLOW_ID_in_anAssertion510); if (state.failed) return retval;
					 
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
					par=(BAST)match(input,PARAMETERS,FOLLOW_PARAMETERS_in_anAssertion517); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_PARAMETERS.add(par);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_variableList_in_anAssertion521);
					formals=variableList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variableList.add(formals.getTree());
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
					// elements: l, p, a, par, formals, ass
					// token labels: par, ass, a, l
					// rule labels: formals, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: p
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_par=new RewriteRuleNodeStream(adaptor,"token par",par);
					RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
					RewriteRuleNodeStream stream_a=new RewriteRuleNodeStream(adaptor,"token a",a);
					RewriteRuleNodeStream stream_l=new RewriteRuleNodeStream(adaptor,"token l",l);
					RewriteRuleSubtreeStream stream_p=new RewriteRuleSubtreeStream(adaptor,"wildcard p",p);
					RewriteRuleSubtreeStream stream_formals=new RewriteRuleSubtreeStream(adaptor,"rule formals",formals!=null?formals.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 198:5: -> ^( $ass ^( $l $a) ^( $par $formals) $p)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:198:8: ^( $ass ^( $l $a) ^( $par $formals) $p)
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

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:198:24: ^( $par $formals)
						{
						BAST root_2 = (BAST)adaptor.nil();
						root_2 = (BAST)adaptor.becomeRoot(stream_par.nextNode(), root_2);
						adaptor.addChild(root_2, stream_formals.nextTree());
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
					ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_anAssertion572); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					l=(BAST)match(input,LABEL,FOLLOW_LABEL_in_anAssertion579); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_LABEL.add(l);

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					a=(BAST)match(input,ID,FOLLOW_ID_in_anAssertion583); if (state.failed) return retval;
					 
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
					// elements: l, a, ass, p
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
					ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_anAssertion626); if (state.failed) return retval;
					 
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
					// elements: p, ass
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


	public static class variableList_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variableList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:207:1: variableList : (v= variable | ^( COMMA (parameter+= variable )+ ) );
	public final ASTtoAST.variableList_return variableList() throws RecognitionException {
		ASTtoAST.variableList_return retval = new ASTtoAST.variableList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST COMMA31=null;
		List<Object> list_parameter=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope parameter = null;
		BAST COMMA31_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:208:3: (v= variable | ^( COMMA (parameter+= variable )+ ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==TILDE) ) {
				alt18=1;
			}
			else if ( (LA18_0==COMMA) ) {
				alt18=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:209:3: v= variable
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_variable_in_variableList667);
					v=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) 
					adaptor.addChild(root_0, v.getTree());

					if ( state.backtracking==0 ) {
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:3: ^( COMMA (parameter+= variable )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					COMMA31=(BAST)match(input,COMMA,FOLLOW_COMMA_in_variableList677); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA31_tree = (BAST)adaptor.dupNode(COMMA31);


					root_1 = (BAST)adaptor.becomeRoot(COMMA31_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:21: (parameter+= variable )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==TILDE) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:211:21: parameter+= variable
							{
							_last = (BAST)input.LT(1);
							pushFollow(FOLLOW_variable_in_variableList681);
							parameter=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) 
							adaptor.addChild(root_1, parameter.getTree());

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTree());

							if ( state.backtracking==0 ) {
							}

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

					match(input, Token.UP, null); if (state.failed) return retval;
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					if ( state.backtracking==0 ) {
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
	// $ANTLR end "variableList"


	public static class variable_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:214:1: variable : ^( TILDE id= ID tod= . ) ;
	public final ASTtoAST.variable_return variable() throws RecognitionException {
		ASTtoAST.variable_return retval = new ASTtoAST.variable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST id=null;
		BAST TILDE32=null;
		BAST tod=null;

		BAST id_tree=null;
		BAST TILDE32_tree=null;
		BAST tod_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:215:3: ( ^( TILDE id= ID tod= . ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:216:3: ^( TILDE id= ID tod= . )
			{
			root_0 = (BAST)adaptor.nil();


			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			TILDE32=(BAST)match(input,TILDE,FOLLOW_TILDE_in_variable702); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TILDE32_tree = (BAST)adaptor.dupNode(TILDE32);


			root_1 = (BAST)adaptor.becomeRoot(TILDE32_tree, root_1);
			}

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			id=(BAST)match(input,ID,FOLLOW_ID_in_variable706); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.dupNode(id);


			adaptor.addChild(root_1, id_tree);
			}

			_last = (BAST)input.LT(1);
			tod=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			tod_tree = (BAST)adaptor.dupTree(tod);
			adaptor.addChild(root_1, tod_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			if ( state.backtracking==0 ) {
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
	// $ANTLR end "variable"


	public static class getPostconditionFromBehaviorActions_return extends TreeRuleReturnScope {
		public BAST post = null;
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "getPostconditionFromBehaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:219:1: getPostconditionFromBehaviorActions returns [BAST post = null] options {backtrack=true; } : ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q= . )? ) ) | ^( SEMICOLON ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+ ) | ^(amp= AMPERSAND (prc= getPostconditionFromBehaviorActions )+ ) |elq= getPostconditionFromBehaviorActionsInELQ ->);
	public final ASTtoAST.getPostconditionFromBehaviorActions_return getPostconditionFromBehaviorActions() throws RecognitionException {
		ASTtoAST.getPostconditionFromBehaviorActions_return retval = new ASTtoAST.getPostconditionFromBehaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST amp=null;
		BAST ACTION33=null;
		BAST P34=null;
		BAST wildcard35=null;
		BAST S36=null;
		BAST wildcard37=null;
		BAST Q38=null;
		BAST SEMICOLON39=null;
		BAST ACTION40=null;
		BAST P41=null;
		BAST wildcard42=null;
		BAST S43=null;
		BAST wildcard44=null;
		BAST Q45=null;
		BAST q=null;
		BAST q2=null;
		TreeRuleReturnScope prc =null;
		TreeRuleReturnScope elq =null;

		BAST amp_tree=null;
		BAST ACTION33_tree=null;
		BAST P34_tree=null;
		BAST wildcard35_tree=null;
		BAST S36_tree=null;
		BAST wildcard37_tree=null;
		BAST Q38_tree=null;
		BAST SEMICOLON39_tree=null;
		BAST ACTION40_tree=null;
		BAST P41_tree=null;
		BAST wildcard42_tree=null;
		BAST S43_tree=null;
		BAST wildcard44_tree=null;
		BAST Q45_tree=null;
		BAST q_tree=null;
		BAST q2_tree=null;
		RewriteRuleSubtreeStream stream_getPostconditionFromBehaviorActionsInELQ=new RewriteRuleSubtreeStream(adaptor,"rule getPostconditionFromBehaviorActionsInELQ");

		ArrayList<BAST> ampersandPostconditions = new ArrayList<BAST>();
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:222:3: ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q= . )? ) ) | ^( SEMICOLON ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+ ) | ^(amp= AMPERSAND (prc= getPostconditionFromBehaviorActions )+ ) |elq= getPostconditionFromBehaviorActionsInELQ ->)
			int alt25=4;
			switch ( input.LA(1) ) {
			case ACTION:
				{
				alt25=1;
				}
				break;
			case SEMICOLON:
				{
				alt25=2;
				}
				break;
			case AMPERSAND:
				{
				alt25=3;
				}
				break;
			case LCURLY:
				{
				alt25=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:223:3: ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q= . )? ) )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					ACTION33=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPostconditionFromBehaviorActions751); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ACTION33_tree = (BAST)adaptor.dupNode(ACTION33);


					root_1 = (BAST)adaptor.becomeRoot(ACTION33_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_2 = _last;
					BAST _first_2 = null;
					BAST root_2 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					P34=(BAST)match(input,P,FOLLOW_P_in_getPostconditionFromBehaviorActions754); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					P34_tree = (BAST)adaptor.dupNode(P34);


					root_2 = (BAST)adaptor.becomeRoot(P34_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:223:16: ( . )?
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( ((LA19_0 >= AADL_STRING_LITERAL && LA19_0 <= 306)) ) {
							alt19=1;
						}
						switch (alt19) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:223:16: .
								{
								_last = (BAST)input.LT(1);
								wildcard35=(BAST)input.LT(1);
								matchAny(input); if (state.failed) return retval;
								if ( state.backtracking==0 ) {
								wildcard35_tree = (BAST)adaptor.dupTree(wildcard35);
								adaptor.addChild(root_2, wildcard35_tree);
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
					S36=(BAST)match(input,S,FOLLOW_S_in_getPostconditionFromBehaviorActions761); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					S36_tree = (BAST)adaptor.dupNode(S36);


					root_2 = (BAST)adaptor.becomeRoot(S36_tree, root_2);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					wildcard37=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard37_tree = (BAST)adaptor.dupTree(wildcard37);
					adaptor.addChild(root_2, wildcard37_tree);
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
					Q38=(BAST)match(input,Q,FOLLOW_Q_in_getPostconditionFromBehaviorActions768); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Q38_tree = (BAST)adaptor.dupNode(Q38);


					root_2 = (BAST)adaptor.becomeRoot(Q38_tree, root_2);
					}

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:223:33: (q= . )?
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= AADL_STRING_LITERAL && LA20_0 <= 306)) ) {
							alt20=1;
						}
						switch (alt20) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:223:33: q= .
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:226:3: ^( SEMICOLON ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					SEMICOLON39=(BAST)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_getPostconditionFromBehaviorActions794); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON39_tree = (BAST)adaptor.dupNode(SEMICOLON39);


					root_1 = (BAST)adaptor.becomeRoot(SEMICOLON39_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:227:5: ( ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) ) )+
					int cnt23=0;
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==ACTION) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:227:7: ^( ACTION ^( P ( . )? ) ^( S . ) ^( Q (q2= . )? ) )
							{
							_last = (BAST)input.LT(1);
							{
							BAST _save_last_2 = _last;
							BAST _first_2 = null;
							BAST root_2 = (BAST)adaptor.nil();
							_last = (BAST)input.LT(1);
							ACTION40=(BAST)match(input,ACTION,FOLLOW_ACTION_in_getPostconditionFromBehaviorActions804); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ACTION40_tree = (BAST)adaptor.dupNode(ACTION40);


							root_2 = (BAST)adaptor.becomeRoot(ACTION40_tree, root_2);
							}

							match(input, Token.DOWN, null); if (state.failed) return retval;
							_last = (BAST)input.LT(1);
							{
							BAST _save_last_3 = _last;
							BAST _first_3 = null;
							BAST root_3 = (BAST)adaptor.nil();
							_last = (BAST)input.LT(1);
							P41=(BAST)match(input,P,FOLLOW_P_in_getPostconditionFromBehaviorActions814); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							P41_tree = (BAST)adaptor.dupNode(P41);


							root_3 = (BAST)adaptor.becomeRoot(P41_tree, root_3);
							}

							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:228:11: ( . )?
								int alt21=2;
								int LA21_0 = input.LA(1);
								if ( ((LA21_0 >= AADL_STRING_LITERAL && LA21_0 <= 306)) ) {
									alt21=1;
								}
								switch (alt21) {
									case 1 :
										// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:228:11: .
										{
										_last = (BAST)input.LT(1);
										wildcard42=(BAST)input.LT(1);
										matchAny(input); if (state.failed) return retval;
										if ( state.backtracking==0 ) {
										wildcard42_tree = (BAST)adaptor.dupTree(wildcard42);
										adaptor.addChild(root_3, wildcard42_tree);
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
							S43=(BAST)match(input,S,FOLLOW_S_in_getPostconditionFromBehaviorActions828); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							S43_tree = (BAST)adaptor.dupNode(S43);


							root_3 = (BAST)adaptor.becomeRoot(S43_tree, root_3);
							}

							match(input, Token.DOWN, null); if (state.failed) return retval;
							_last = (BAST)input.LT(1);
							wildcard44=(BAST)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							wildcard44_tree = (BAST)adaptor.dupTree(wildcard44);
							adaptor.addChild(root_3, wildcard44_tree);
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
							Q45=(BAST)match(input,Q,FOLLOW_Q_in_getPostconditionFromBehaviorActions842); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							Q45_tree = (BAST)adaptor.dupNode(Q45);


							root_3 = (BAST)adaptor.becomeRoot(Q45_tree, root_3);
							}

							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:230:13: (q2= . )?
								int alt22=2;
								int LA22_0 = input.LA(1);
								if ( ((LA22_0 >= AADL_STRING_LITERAL && LA22_0 <= 306)) ) {
									alt22=1;
								}
								switch (alt22) {
									case 1 :
										// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:230:13: q2= .
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
							if ( cnt23 >= 1 ) break loop23;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(23, input);
							throw eee;
						}
						cnt23++;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:235:3: ^(amp= AMPERSAND (prc= getPostconditionFromBehaviorActions )+ )
					{
					root_0 = (BAST)adaptor.nil();


					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					BAST root_1 = (BAST)adaptor.nil();
					_last = (BAST)input.LT(1);
					amp=(BAST)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_getPostconditionFromBehaviorActions883); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					amp_tree = (BAST)adaptor.dupNode(amp);


					root_1 = (BAST)adaptor.becomeRoot(amp_tree, root_1);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:236:6: (prc= getPostconditionFromBehaviorActions )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==ACTION||LA24_0==AMPERSAND||LA24_0==LCURLY||LA24_0==SEMICOLON) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:236:8: prc= getPostconditionFromBehaviorActions
							{
							_last = (BAST)input.LT(1);
							pushFollow(FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActions895);
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
							if ( cnt24 >= 1 ) break loop24;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:251:3: elq= getPostconditionFromBehaviorActionsInELQ
					{
					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_getPostconditionFromBehaviorActionsInELQ_in_getPostconditionFromBehaviorActions933);
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
					// 252:5: ->
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


	public static class get_invariant_from_bless_subclause_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "get_invariant_from_bless_subclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:274:1: get_invariant_from_bless_subclause : ^( BLESS_SUBCLAUSE ( DO_NOT_PROVE )? ^( LITERAL_assert ( . )+ ) ^(ta= LITERAL_invariant ^(ass= ASSERTION pred= . ) ( . )* ) ) -> ^( $ass $pred) ;
	public final ASTtoAST.get_invariant_from_bless_subclause_return get_invariant_from_bless_subclause() throws RecognitionException {
		ASTtoAST.get_invariant_from_bless_subclause_return retval = new ASTtoAST.get_invariant_from_bless_subclause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST ta=null;
		BAST ass=null;
		BAST BLESS_SUBCLAUSE46=null;
		BAST DO_NOT_PROVE47=null;
		BAST LITERAL_assert48=null;
		BAST wildcard49=null;
		BAST wildcard50=null;
		BAST pred=null;

		BAST ta_tree=null;
		BAST ass_tree=null;
		BAST BLESS_SUBCLAUSE46_tree=null;
		BAST DO_NOT_PROVE47_tree=null;
		BAST LITERAL_assert48_tree=null;
		BAST wildcard49_tree=null;
		BAST wildcard50_tree=null;
		BAST pred_tree=null;
		RewriteRuleNodeStream stream_BLESS_SUBCLAUSE=new RewriteRuleNodeStream(adaptor,"token BLESS_SUBCLAUSE");
		RewriteRuleNodeStream stream_ASSERTION=new RewriteRuleNodeStream(adaptor,"token ASSERTION");
		RewriteRuleNodeStream stream_LITERAL_assert=new RewriteRuleNodeStream(adaptor,"token LITERAL_assert");
		RewriteRuleNodeStream stream_LITERAL_invariant=new RewriteRuleNodeStream(adaptor,"token LITERAL_invariant");
		RewriteRuleNodeStream stream_DO_NOT_PROVE=new RewriteRuleNodeStream(adaptor,"token DO_NOT_PROVE");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:275:3: ( ^( BLESS_SUBCLAUSE ( DO_NOT_PROVE )? ^( LITERAL_assert ( . )+ ) ^(ta= LITERAL_invariant ^(ass= ASSERTION pred= . ) ( . )* ) ) -> ^( $ass $pred) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:3: ^( BLESS_SUBCLAUSE ( DO_NOT_PROVE )? ^( LITERAL_assert ( . )+ ) ^(ta= LITERAL_invariant ^(ass= ASSERTION pred= . ) ( . )* ) )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			BAST root_1 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			BLESS_SUBCLAUSE46=(BAST)match(input,BLESS_SUBCLAUSE,FOLLOW_BLESS_SUBCLAUSE_in_get_invariant_from_bless_subclause977); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_BLESS_SUBCLAUSE.add(BLESS_SUBCLAUSE46);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:22: ( DO_NOT_PROVE )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==DO_NOT_PROVE) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:22: DO_NOT_PROVE
					{
					_last = (BAST)input.LT(1);
					DO_NOT_PROVE47=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_get_invariant_from_bless_subclause979); if (state.failed) return retval;
					 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(DO_NOT_PROVE47);

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
			LITERAL_assert48=(BAST)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_get_invariant_from_bless_subclause984); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_assert.add(LITERAL_assert48);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:54: ( . )+
			int cnt27=0;
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= AADL_STRING_LITERAL && LA27_0 <= 306)) ) {
					alt27=1;
				}
				else if ( (LA27_0==UP) ) {
					alt27=2;
				}

				switch (alt27) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:276:54: .
					{
					_last = (BAST)input.LT(1);
					wildcard49=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard49_tree = (BAST)adaptor.dupTree(wildcard49);
					adaptor.addChild(root_2, wildcard49_tree);
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


			_last = (BAST)input.LT(1);
			{
			BAST _save_last_2 = _last;
			BAST _first_2 = null;
			BAST root_2 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ta=(BAST)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_get_invariant_from_bless_subclause999); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_LITERAL_invariant.add(ta);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_3 = _last;
			BAST _first_3 = null;
			BAST root_3 = (BAST)adaptor.nil();
			_last = (BAST)input.LT(1);
			ass=(BAST)match(input,ASSERTION,FOLLOW_ASSERTION_in_get_invariant_from_bless_subclause1005); if (state.failed) return retval;
			 
			if ( state.backtracking==0 ) stream_ASSERTION.add(ass);

			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			pred=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			pred_tree = (BAST)adaptor.dupTree(pred);
			adaptor.addChild(root_3, pred_tree);
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_2, root_3);
			_last = _save_last_3;
			}


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:277:55: ( . )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= AADL_STRING_LITERAL && LA28_0 <= 306)) ) {
					alt28=1;
				}
				else if ( (LA28_0==UP) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:277:55: .
					{
					_last = (BAST)input.LT(1);
					wildcard50=(BAST)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					wildcard50_tree = (BAST)adaptor.dupTree(wildcard50);
					adaptor.addChild(root_2, wildcard50_tree);
					}

					if ( state.backtracking==0 ) {
					}

					}
					break;

				default :
					break loop28;
				}
			}

			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			match(input, Token.UP, null); if (state.failed) return retval;
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: pred, ass
			// token labels: ass
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: pred
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleNodeStream stream_ass=new RewriteRuleNodeStream(adaptor,"token ass",ass);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"wildcard pred",pred);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 279:5: -> ^( $ass $pred)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/ASTtoAST.g:279:8: ^( $ass $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ass.nextNode(), root_1);
				adaptor.addChild(root_1, stream_pred.nextTree());
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


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\10\uffff";
	static final String DFA4_eofS =
		"\10\uffff";
	static final String DFA4_minS =
		"\1\4\1\2\1\uffff\1\3\1\2\1\uffff\1\4\1\2";
	static final String DFA4_maxS =
		"\1\u0132\1\u0111\1\uffff\2\u0132\1\uffff\1\u0132\1\u0111";
	static final String DFA4_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\2\uffff";
	static final String DFA4_specialS =
		"\10\uffff}>";
	static final String[] DFA4_transitionS = {
			"\163\2\1\1\u00bb\2",
			"\1\3\u010e\uffff\1\2",
			"",
			"\1\5\u012f\4",
			"\1\5\1\6\u012f\4",
			"",
			"\u010d\5\1\7\41\5",
			"\1\5\1\2\150\uffff\1\2\u00a4\uffff\1\5"
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "137:12: ( ^( LITERAL_declare ( . )* ) )?";
		}
	}

	public static final BitSet FOLLOW_ASSERTION_in_getPredicateFromAssertion96 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_getPredicateFromAssertion102 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_getPredicateFromAssertion104 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_getPredicateFromAssertion112 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LCURLY_in_getBehaviorActionsFromELQ150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_declare_in_getBehaviorActionsFromELQ154 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_getBehaviorActionsFromELQ167 = new BitSet(new long[]{0x0000000000000008L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_catch_in_getBehaviorActionsFromELQ172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LCURLY_in_getPreconditionFromBehaviorActionsInELQ209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActionsInELQ218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RCURLY_in_getPreconditionFromBehaviorActionsInELQ220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_getPreconditionFromBehaviorActions269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPreconditionFromBehaviorActions272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPreconditionFromBehaviorActions281 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPreconditionFromBehaviorActions288 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEMICOLON_in_getPreconditionFromBehaviorActions310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_getPreconditionFromBehaviorActions313 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPreconditionFromBehaviorActions316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPreconditionFromBehaviorActions325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPreconditionFromBehaviorActions332 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AMPERSAND_in_getPreconditionFromBehaviorActions362 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPreconditionFromBehaviorActions_in_getPreconditionFromBehaviorActions374 = new BitSet(new long[]{0x0000000000000448L,0x0000000000020000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_getPreconditionFromBehaviorActionsInELQ_in_getPreconditionFromBehaviorActions416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_getPostconditionFromBehaviorActionsInELQ440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActionsInELQ452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_RCURLY_in_getPostconditionFromBehaviorActionsInELQ454 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_anAssertion499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_anAssertion506 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_anAssertion510 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_anAssertion517 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_anAssertion521 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_anAssertion572 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_anAssertion579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_anAssertion583 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_anAssertion626 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList681 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TILDE_in_variable702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable706 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0xFFFFFFFFFFFFFFFFL,0x0007FFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ACTION_in_getPostconditionFromBehaviorActions751 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPostconditionFromBehaviorActions754 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPostconditionFromBehaviorActions761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPostconditionFromBehaviorActions768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEMICOLON_in_getPostconditionFromBehaviorActions794 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_getPostconditionFromBehaviorActions804 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_getPostconditionFromBehaviorActions814 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_S_in_getPostconditionFromBehaviorActions828 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Q_in_getPostconditionFromBehaviorActions842 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AMPERSAND_in_getPostconditionFromBehaviorActions883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_getPostconditionFromBehaviorActions_in_getPostconditionFromBehaviorActions895 = new BitSet(new long[]{0x0000000000000448L,0x0000000000020000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_getPostconditionFromBehaviorActionsInELQ_in_getPostconditionFromBehaviorActions933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLESS_SUBCLAUSE_in_get_invariant_from_bless_subclause977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_get_invariant_from_bless_subclause979 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_assert_in_get_invariant_from_bless_subclause984 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_get_invariant_from_bless_subclause999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSERTION_in_get_invariant_from_bless_subclause1005 = new BitSet(new long[]{0x0000000000000004L});
}
