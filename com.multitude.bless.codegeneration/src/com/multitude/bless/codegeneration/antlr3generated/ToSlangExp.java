// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g 2023-04-01 20:26:12

//copyright 2012 Multitude Corporation
package com.multitude.bless.codegeneration.antlr3generated;
import java.util.List;
import java.util.ArrayList;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;

import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.app.Global;
import com.multitude.bless.antlr3generated.BLESS3Lexer;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class ToSlangExp extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADL_STRING_LITERAL", "AADL_STRING_PART", 
		"ACTION", "ACTION_SUBCLAUSE", "AL", "AM", "AMPERSAND", "ANNEX_END", "ANNEX_START", 
		"ARROW", "ASSERTION", "ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", 
		"ASSIGN", "AT_SIGN", "BASE", "BASED_INTEGER", "BEHAVIOR_GUARD", "BEHAVIOR_TIME", 
		"BI", "BLESS_SUBCLAUSE", "BOUND", "BOX", "CARET", "CASE_EXPRESSION", "COLON", 
		"COLON_TILDE", "COMMA", "COMMACOMMA", "COMMADOT", "COMPONENT", "CONDITION", 
		"CONDITIONAL_ASSERTION_FUNCTION", "COUNTING_TRIGGER", "CVP", "DESTINATION", 
		"DIGIT", "DIVIDE", "DOLLAR", "DOT", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", 
		"DOUBLE_QUOTE", "DO_NOT_PROVE", "DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", 
		"EQ", "EXCLAMATION", "EXP", "EXPONENT", "EXTENDED_DIGIT", "FLOATING", 
		"FUNCTION", "GT", "GUARD", "HEX_DIGIT", "ID", "IMP", "INMODE", "INOUT", 
		"INTEGER_LIT", "INT_EXPONENT", "INVARIANT", "INVOKE", "INVOKE_FUNCTION", 
		"IP_NAME", "IP_PE", "IP_PRED", "LABEL", "LASS", "LBRACKET", "LCON", "LCURLY", 
		"LITERAL_Assertion", "LITERAL_Invariant", "LITERAL_Postcondition", "LITERAL_Precondition", 
		"LITERAL_Typed", "LITERAL_aadlboolean", "LITERAL_aadlinteger", "LITERAL_aadlreal", 
		"LITERAL_aadlstring", "LITERAL_abs", "LITERAL_access", "LITERAL_all", 
		"LITERAL_and", "LITERAL_any", "LITERAL_applies", "LITERAL_are", "LITERAL_array", 
		"LITERAL_assert", "LITERAL_availability", "LITERAL_base", "LITERAL_boolean", 
		"LITERAL_bound", "LITERAL_call", "LITERAL_calls", "LITERAL_cand", "LITERAL_case", 
		"LITERAL_catch", "LITERAL_classifier", "LITERAL_complete", "LITERAL_component", 
		"LITERAL_computation", "LITERAL_connection", "LITERAL_connections", "LITERAL_constant", 
		"LITERAL_cor", "LITERAL_count", "LITERAL_declare", "LITERAL_def", "LITERAL_delay", 
		"LITERAL_dispatch", "LITERAL_div", "LITERAL_do", "LITERAL_else", "LITERAL_enumeration", 
		"LITERAL_exception", "LITERAL_exists", "LITERAL_extends", "LITERAL_extension", 
		"LITERAL_false", "LITERAL_feature", "LITERAL_fetchadd", "LITERAL_fetchand", 
		"LITERAL_fetchor", "LITERAL_fetchxor", "LITERAL_fi", "LITERAL_final", 
		"LITERAL_flow", "LITERAL_for", "LITERAL_forall", "LITERAL_fresh", "LITERAL_ghost", 
		"LITERAL_hr", "LITERAL_if", "LITERAL_iff", "LITERAL_implementation", "LITERAL_implies", 
		"LITERAL_in", "LITERAL_inherit", "LITERAL_initial", "LITERAL_internal", 
		"LITERAL_invariant", "LITERAL_inverse", "LITERAL_is", "LITERAL_list", 
		"LITERAL_lower_bound", "LITERAL_min", "LITERAL_mod", "LITERAL_mode", "LITERAL_modes", 
		"LITERAL_ms", "LITERAL_nonvolatile", "LITERAL_not", "LITERAL_now", "LITERAL_ns", 
		"LITERAL_null", "LITERAL_numberof", "LITERAL_of", "LITERAL_on", "LITERAL_or", 
		"LITERAL_package", "LITERAL_parameter", "LITERAL_pause", "LITERAL_post", 
		"LITERAL_pre", "LITERAL_private", "LITERAL_product", "LITERAL_property", 
		"LITERAL_provides", "LITERAL_ps", "LITERAL_public", "LITERAL_quantity", 
		"LITERAL_range", "LITERAL_record", "LITERAL_reference", "LITERAL_rem", 
		"LITERAL_renames", "LITERAL_representation", "LITERAL_requires", "LITERAL_returns", 
		"LITERAL_round", "LITERAL_scalar", "LITERAL_sec", "LITERAL_self", "LITERAL_sequence", 
		"LITERAL_set", "LITERAL_setmode", "LITERAL_shared", "LITERAL_skip", "LITERAL_spread", 
		"LITERAL_state", "LITERAL_states", "LITERAL_step", "LITERAL_stop", "LITERAL_string", 
		"LITERAL_subcomponents", "LITERAL_sum", "LITERAL_swap", "LITERAL_that", 
		"LITERAL_then", "LITERAL_throw", "LITERAL_throws", "LITERAL_time", "LITERAL_timeout", 
		"LITERAL_to", "LITERAL_tops", "LITERAL_transition", "LITERAL_transitions", 
		"LITERAL_true", "LITERAL_truncate", "LITERAL_type", "LITERAL_union", "LITERAL_units", 
		"LITERAL_until", "LITERAL_updated", "LITERAL_upper_bound", "LITERAL_us", 
		"LITERAL_variables", "LITERAL_variant", "LITERAL_when", "LITERAL_which", 
		"LITERAL_while", "LITERAL_whole", "LITERAL_with", "LITERAL_xor", "LPAREN", 
		"LT", "LTE_STRING", "LT_STRING", "MINUS", "MT_STRING", "NEQ", "NUMBER", 
		"OBLIGATION", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETER", "PARAMETERS", 
		"PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", 
		"PREDICATE_RELATION", "PROCEDURE", "PROCEDURE_CALL", "Q", "QCLREF", "QCREF", 
		"QQ", "QUANTITY", "QUESTION", "RASS", "RBRACKET", "RCON", "RCURLY", "REAL_LIT", 
		"RECORD_TERM", "ROOT_DECLARATION", "RPAREN", "S", "SEMICOLON", "SLCOMMENT", 
		"SOURCE", "START", "START_ASSERTION_PROPERTY", "STOP", "SUBPROGRAM_ANNEX", 
		"SUBPROGRAM_INVOCATION", "TICK", "TILDE", "TIMES", "TOP", "TRANSITION", 
		"TRIGGER", "TYPE", "TYPE_LIBRARY", "TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", 
		"UNARY_MINUS", "UNIT_FORMULA", "UNIT_LIBRARY", "UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", 
		"VERT", "WP", "WS", "'%'"
	};
	public static final int EOF=-1;
	public static final int T__300=300;
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
	public static final int CONDITIONAL_ASSERTION_FUNCTION=37;
	public static final int COUNTING_TRIGGER=38;
	public static final int CVP=39;
	public static final int DESTINATION=40;
	public static final int DIGIT=41;
	public static final int DIVIDE=42;
	public static final int DOLLAR=43;
	public static final int DOT=44;
	public static final int DOTCOMMA=45;
	public static final int DOTDOT=46;
	public static final int DOUBLE_COLON=47;
	public static final int DOUBLE_QUOTE=48;
	public static final int DO_NOT_PROVE=49;
	public static final int DUMMY=50;
	public static final int EMPTY_CURLY=51;
	public static final int END_ASSERTION_PROPERTY=52;
	public static final int EQ=53;
	public static final int EXCLAMATION=54;
	public static final int EXP=55;
	public static final int EXPONENT=56;
	public static final int EXTENDED_DIGIT=57;
	public static final int FLOATING=58;
	public static final int FUNCTION=59;
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
	public static final int LITERAL_access=90;
	public static final int LITERAL_all=91;
	public static final int LITERAL_and=92;
	public static final int LITERAL_any=93;
	public static final int LITERAL_applies=94;
	public static final int LITERAL_are=95;
	public static final int LITERAL_array=96;
	public static final int LITERAL_assert=97;
	public static final int LITERAL_availability=98;
	public static final int LITERAL_base=99;
	public static final int LITERAL_boolean=100;
	public static final int LITERAL_bound=101;
	public static final int LITERAL_call=102;
	public static final int LITERAL_calls=103;
	public static final int LITERAL_cand=104;
	public static final int LITERAL_case=105;
	public static final int LITERAL_catch=106;
	public static final int LITERAL_classifier=107;
	public static final int LITERAL_complete=108;
	public static final int LITERAL_component=109;
	public static final int LITERAL_computation=110;
	public static final int LITERAL_connection=111;
	public static final int LITERAL_connections=112;
	public static final int LITERAL_constant=113;
	public static final int LITERAL_cor=114;
	public static final int LITERAL_count=115;
	public static final int LITERAL_declare=116;
	public static final int LITERAL_def=117;
	public static final int LITERAL_delay=118;
	public static final int LITERAL_dispatch=119;
	public static final int LITERAL_div=120;
	public static final int LITERAL_do=121;
	public static final int LITERAL_else=122;
	public static final int LITERAL_enumeration=123;
	public static final int LITERAL_exception=124;
	public static final int LITERAL_exists=125;
	public static final int LITERAL_extends=126;
	public static final int LITERAL_extension=127;
	public static final int LITERAL_false=128;
	public static final int LITERAL_feature=129;
	public static final int LITERAL_fetchadd=130;
	public static final int LITERAL_fetchand=131;
	public static final int LITERAL_fetchor=132;
	public static final int LITERAL_fetchxor=133;
	public static final int LITERAL_fi=134;
	public static final int LITERAL_final=135;
	public static final int LITERAL_flow=136;
	public static final int LITERAL_for=137;
	public static final int LITERAL_forall=138;
	public static final int LITERAL_fresh=139;
	public static final int LITERAL_ghost=140;
	public static final int LITERAL_hr=141;
	public static final int LITERAL_if=142;
	public static final int LITERAL_iff=143;
	public static final int LITERAL_implementation=144;
	public static final int LITERAL_implies=145;
	public static final int LITERAL_in=146;
	public static final int LITERAL_inherit=147;
	public static final int LITERAL_initial=148;
	public static final int LITERAL_internal=149;
	public static final int LITERAL_invariant=150;
	public static final int LITERAL_inverse=151;
	public static final int LITERAL_is=152;
	public static final int LITERAL_list=153;
	public static final int LITERAL_lower_bound=154;
	public static final int LITERAL_min=155;
	public static final int LITERAL_mod=156;
	public static final int LITERAL_mode=157;
	public static final int LITERAL_modes=158;
	public static final int LITERAL_ms=159;
	public static final int LITERAL_nonvolatile=160;
	public static final int LITERAL_not=161;
	public static final int LITERAL_now=162;
	public static final int LITERAL_ns=163;
	public static final int LITERAL_null=164;
	public static final int LITERAL_numberof=165;
	public static final int LITERAL_of=166;
	public static final int LITERAL_on=167;
	public static final int LITERAL_or=168;
	public static final int LITERAL_package=169;
	public static final int LITERAL_parameter=170;
	public static final int LITERAL_pause=171;
	public static final int LITERAL_post=172;
	public static final int LITERAL_pre=173;
	public static final int LITERAL_private=174;
	public static final int LITERAL_product=175;
	public static final int LITERAL_property=176;
	public static final int LITERAL_provides=177;
	public static final int LITERAL_ps=178;
	public static final int LITERAL_public=179;
	public static final int LITERAL_quantity=180;
	public static final int LITERAL_range=181;
	public static final int LITERAL_record=182;
	public static final int LITERAL_reference=183;
	public static final int LITERAL_rem=184;
	public static final int LITERAL_renames=185;
	public static final int LITERAL_representation=186;
	public static final int LITERAL_requires=187;
	public static final int LITERAL_returns=188;
	public static final int LITERAL_round=189;
	public static final int LITERAL_scalar=190;
	public static final int LITERAL_sec=191;
	public static final int LITERAL_self=192;
	public static final int LITERAL_sequence=193;
	public static final int LITERAL_set=194;
	public static final int LITERAL_setmode=195;
	public static final int LITERAL_shared=196;
	public static final int LITERAL_skip=197;
	public static final int LITERAL_spread=198;
	public static final int LITERAL_state=199;
	public static final int LITERAL_states=200;
	public static final int LITERAL_step=201;
	public static final int LITERAL_stop=202;
	public static final int LITERAL_string=203;
	public static final int LITERAL_subcomponents=204;
	public static final int LITERAL_sum=205;
	public static final int LITERAL_swap=206;
	public static final int LITERAL_that=207;
	public static final int LITERAL_then=208;
	public static final int LITERAL_throw=209;
	public static final int LITERAL_throws=210;
	public static final int LITERAL_time=211;
	public static final int LITERAL_timeout=212;
	public static final int LITERAL_to=213;
	public static final int LITERAL_tops=214;
	public static final int LITERAL_transition=215;
	public static final int LITERAL_transitions=216;
	public static final int LITERAL_true=217;
	public static final int LITERAL_truncate=218;
	public static final int LITERAL_type=219;
	public static final int LITERAL_union=220;
	public static final int LITERAL_units=221;
	public static final int LITERAL_until=222;
	public static final int LITERAL_updated=223;
	public static final int LITERAL_upper_bound=224;
	public static final int LITERAL_us=225;
	public static final int LITERAL_variables=226;
	public static final int LITERAL_variant=227;
	public static final int LITERAL_when=228;
	public static final int LITERAL_which=229;
	public static final int LITERAL_while=230;
	public static final int LITERAL_whole=231;
	public static final int LITERAL_with=232;
	public static final int LITERAL_xor=233;
	public static final int LPAREN=234;
	public static final int LT=235;
	public static final int LTE_STRING=236;
	public static final int LT_STRING=237;
	public static final int MINUS=238;
	public static final int MT_STRING=239;
	public static final int NEQ=240;
	public static final int NUMBER=241;
	public static final int OBLIGATION=242;
	public static final int OCTOTHORPE=243;
	public static final int OLD_NEQ=244;
	public static final int ON=245;
	public static final int P=246;
	public static final int PARAMETER=247;
	public static final int PARAMETERS=248;
	public static final int PLUS=249;
	public static final int PLUS_ARROW=250;
	public static final int PLUS_EQUALS=251;
	public static final int PORT=252;
	public static final int PORT_INPUT=253;
	public static final int PORT_OUTPUT=254;
	public static final int PREDICATE_RELATION=255;
	public static final int PROCEDURE=256;
	public static final int PROCEDURE_CALL=257;
	public static final int Q=258;
	public static final int QCLREF=259;
	public static final int QCREF=260;
	public static final int QQ=261;
	public static final int QUANTITY=262;
	public static final int QUESTION=263;
	public static final int RASS=264;
	public static final int RBRACKET=265;
	public static final int RCON=266;
	public static final int RCURLY=267;
	public static final int REAL_LIT=268;
	public static final int RECORD_TERM=269;
	public static final int ROOT_DECLARATION=270;
	public static final int RPAREN=271;
	public static final int S=272;
	public static final int SEMICOLON=273;
	public static final int SLCOMMENT=274;
	public static final int SOURCE=275;
	public static final int START=276;
	public static final int START_ASSERTION_PROPERTY=277;
	public static final int STOP=278;
	public static final int SUBPROGRAM_ANNEX=279;
	public static final int SUBPROGRAM_INVOCATION=280;
	public static final int TICK=281;
	public static final int TILDE=282;
	public static final int TIMES=283;
	public static final int TOP=284;
	public static final int TRANSITION=285;
	public static final int TRIGGER=286;
	public static final int TYPE=287;
	public static final int TYPE_LIBRARY=288;
	public static final int TYPE_OPERATOR=289;
	public static final int TYPE_OPERATOR_INVOCATION=290;
	public static final int UNARY_MINUS=291;
	public static final int UNIT_FORMULA=292;
	public static final int UNIT_LIBRARY=293;
	public static final int UNIT_NAME=294;
	public static final int VALUE=295;
	public static final int VARIABLE_DECLARATION=296;
	public static final int VERT=297;
	public static final int WP=298;
	public static final int WS=299;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public ToSlangExp(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ToSlangExp(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ToSlangExp.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g"; }


	//static boolean verbose = ConfigurationPreferencePage.getVerboseProof();

	public List<String> featureNames = null;

	public void reportError(RecognitionException ex)
	  {
	  Dump.it("ToSlangExp.reportError(RecognitionException ex)=> "
	    +ex.toString());
	    Dump.it(getErrorHeader(ex));
	    String[] tokenNames=new String[10];
	    Dump.it(getErrorMessage(ex,tokenNames)+"\n----");
	  StackTraceElement[] ste = ex.getStackTrace(); 
	  for (int k=0;k<ste.length;k++)
	    Dump.it("   "+ste[k].toString());     
	  HelpfulHints.giveHint();
	  }

	public void emitErrorMessage(String msg) 
	  {
	  System.err.println(msg);
	  Dump.it(msg);
	  }
	 
	//public boolean substitutionMade = false; //made true when replacement is made  

	/*     public Object downup(Object t) {
	         TreeVisitor v = new TreeVisitor(new CommonTreeAdaptor());
	         TreeVisitorAction actions = new TreeVisitorAction() {
	             public Object pre(Object t)  { return applyOnce(t, topdown_fptr); }
	             public Object post(Object t) { return applyOnce(t, bottomup_ftpr); }
	         };
	         t = v.visit(t, actions);
	         return t;
	     }
	     
	     fptr topdown_fptr = new fptr() {
	         public Object rule() throws RecognitionException { return topdown(); }
	     };
	     
	     fptr bottomup_ftpr = new fptr() {
	         public Object rule() throws RecognitionException { return bottomup(); }
	     };
	*/





	public static class topdown_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "topdown"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:82:1: topdown : ( removeDuplicateParentheses | convertFeatureNames );
	@Override
	public final ToSlangExp.topdown_return topdown() throws RecognitionException {
		ToSlangExp.topdown_return retval = new ToSlangExp.topdown_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		TreeRuleReturnScope removeDuplicateParentheses1 =null;
		TreeRuleReturnScope convertFeatureNames2 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:83:3: ( removeDuplicateParentheses | convertFeatureNames )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==LPAREN) ) {
				alt1=1;
			}
			else if ( (LA1_0==DOT) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:84:3: removeDuplicateParentheses
					{
					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_removeDuplicateParentheses_in_topdown76);
					removeDuplicateParentheses1=removeDuplicateParentheses();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (BAST)removeDuplicateParentheses1.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (BAST)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:85:5: convertFeatureNames
					{
					_last = (BAST)input.LT(1);
					pushFollow(FOLLOW_convertFeatureNames_in_topdown82);
					convertFeatureNames2=convertFeatureNames();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (BAST)convertFeatureNames2.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (BAST)adaptor.getParent(retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "topdown"


	public static class bottomup_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:88:2: bottomup : removeTopParentheses ;
	@Override
	public final ToSlangExp.bottomup_return bottomup() throws RecognitionException {
		ToSlangExp.bottomup_return retval = new ToSlangExp.bottomup_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		TreeRuleReturnScope removeTopParentheses3 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:89:3: ( removeTopParentheses )
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:90:3: removeTopParentheses
			{
			_last = (BAST)input.LT(1);
			pushFollow(FOLLOW_removeTopParentheses_in_bottomup99);
			removeTopParentheses3=removeTopParentheses();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (BAST)removeTopParentheses3.getTree();

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (BAST)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bottomup"


	public static class removeDuplicateParentheses_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "removeDuplicateParentheses"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:94:1: removeDuplicateParentheses : ^( LPAREN ^(lp= LPAREN x= . rp= RPAREN ) RPAREN ) -> ^( $lp $x $rp) ;
	public final ToSlangExp.removeDuplicateParentheses_return removeDuplicateParentheses() throws RecognitionException {
		ToSlangExp.removeDuplicateParentheses_return retval = new ToSlangExp.removeDuplicateParentheses_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST lp=null;
		BAST rp=null;
		BAST LPAREN4=null;
		BAST RPAREN5=null;
		BAST x=null;

		BAST lp_tree=null;
		BAST rp_tree=null;
		BAST LPAREN4_tree=null;
		BAST RPAREN5_tree=null;
		BAST x_tree=null;
		RewriteRuleNodeStream stream_LPAREN=new RewriteRuleNodeStream(adaptor,"token LPAREN");
		RewriteRuleNodeStream stream_RPAREN=new RewriteRuleNodeStream(adaptor,"token RPAREN");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:95:3: ( ^( LPAREN ^(lp= LPAREN x= . rp= RPAREN ) RPAREN ) -> ^( $lp $x $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:96:3: ^( LPAREN ^(lp= LPAREN x= . rp= RPAREN ) RPAREN )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			_last = (BAST)input.LT(1);
			LPAREN4=(BAST)match(input,LPAREN,FOLLOW_LPAREN_in_removeDuplicateParentheses119); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_LPAREN.add(LPAREN4);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = LPAREN4;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_2 = _last;
			BAST _first_2 = null;
			_last = (BAST)input.LT(1);
			lp=(BAST)match(input,LPAREN,FOLLOW_LPAREN_in_removeDuplicateParentheses124); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_LPAREN.add(lp);

			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = lp;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			x=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_2==null ) _first_2 = x;

			_last = (BAST)input.LT(1);
			rp=(BAST)match(input,RPAREN,FOLLOW_RPAREN_in_removeDuplicateParentheses132); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_RPAREN.add(rp);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_2;
			}


			_last = (BAST)input.LT(1);
			RPAREN5=(BAST)match(input,RPAREN,FOLLOW_RPAREN_in_removeDuplicateParentheses136); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_RPAREN.add(RPAREN5);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: lp, x, rp
			// token labels: lp, rp
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: x
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleNodeStream stream_lp=new RewriteRuleNodeStream(adaptor,"token lp",lp);
			RewriteRuleNodeStream stream_rp=new RewriteRuleNodeStream(adaptor,"token rp",rp);
			RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"wildcard x",x);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 97:5: -> ^( $lp $x $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:97:8: ^( $lp $x $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				adaptor.addChild(root_1, stream_x.nextTree());
				adaptor.addChild(root_1, stream_rp.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "removeDuplicateParentheses"


	public static class removeTopParentheses_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "removeTopParentheses"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:100:1: removeTopParentheses : ^(lp= LPAREN x= . RPAREN {...}?) -> $x;
	public final ToSlangExp.removeTopParentheses_return removeTopParentheses() throws RecognitionException {
		ToSlangExp.removeTopParentheses_return retval = new ToSlangExp.removeTopParentheses_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST lp=null;
		BAST RPAREN6=null;
		BAST x=null;

		BAST lp_tree=null;
		BAST RPAREN6_tree=null;
		BAST x_tree=null;
		RewriteRuleNodeStream stream_LPAREN=new RewriteRuleNodeStream(adaptor,"token LPAREN");
		RewriteRuleNodeStream stream_RPAREN=new RewriteRuleNodeStream(adaptor,"token RPAREN");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:101:3: ( ^(lp= LPAREN x= . RPAREN {...}?) -> $x)
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:102:3: ^(lp= LPAREN x= . RPAREN {...}?)
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			_last = (BAST)input.LT(1);
			lp=(BAST)match(input,LPAREN,FOLLOW_LPAREN_in_removeTopParentheses174); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_LPAREN.add(lp);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = lp;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (BAST)input.LT(1);
			x=(BAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = x;

			_last = (BAST)input.LT(1);
			RPAREN6=(BAST)match(input,RPAREN,FOLLOW_RPAREN_in_removeTopParentheses180); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_RPAREN.add(RPAREN6);

			if ( !((lp.getParent() == null)) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "removeTopParentheses", "lp.getParent() == null");
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: x
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: x
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_x=new RewriteRuleSubtreeStream(adaptor,"wildcard x",x);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 103:5: -> $x
			{
				adaptor.addChild(root_0, stream_x.nextTree());
			}


			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "removeTopParentheses"


	public static class convertFeatureNames_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "convertFeatureNames"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:106:1: convertFeatureNames : ( ^(p= DOT label= ID (rest+= ID )+ {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ( $rest)+ ) | ^(p= DOT label= ID {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ) );
	public final ToSlangExp.convertFeatureNames_return convertFeatureNames() throws RecognitionException {
		ToSlangExp.convertFeatureNames_return retval = new ToSlangExp.convertFeatureNames_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST p=null;
		BAST label=null;
		BAST rest=null;
		List<Object> list_rest=null;

		BAST p_tree=null;
		BAST label_tree=null;
		BAST rest_tree=null;
		RewriteRuleNodeStream stream_DOT=new RewriteRuleNodeStream(adaptor,"token DOT");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:107:3: ( ^(p= DOT label= ID (rest+= ID )+ {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ( $rest)+ ) | ^(p= DOT label= ID {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DOT) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOWN) ) {
					int LA3_2 = input.LA(3);
					if ( (LA3_2==ID) ) {
						int LA3_3 = input.LA(4);
						if ( (LA3_3==ID) ) {
							alt3=1;
						}
						else if ( (LA3_3==UP) ) {
							alt3=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 3, 3, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 2, input);
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
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:108:3: ^(p= DOT label= ID (rest+= ID )+ {...}?)
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					_last = (BAST)input.LT(1);
					p=(BAST)match(input,DOT,FOLLOW_DOT_in_convertFeatureNames211); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOT.add(p);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = p;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					label=(BAST)match(input,ID,FOLLOW_ID_in_convertFeatureNames215); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ID.add(label);

					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:108:24: (rest+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:108:24: rest+= ID
							{
							_last = (BAST)input.LT(1);
							rest=(BAST)match(input,ID,FOLLOW_ID_in_convertFeatureNames219); if (state.failed) return retval;
							 
							if ( state.backtracking==1 ) stream_ID.add(rest);

							if (list_rest==null) list_rest=new ArrayList<Object>();
							list_rest.add(rest);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (BAST)adaptor.getParent(retval.tree);
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

					if ( !(( featureNames.contains((label!=null?label.getText():null)) )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "convertFeatureNames", " featureNames.contains($label.text) ");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ID, ID, ID, p, rest
					// token labels: p
					// rule labels: retval
					// token list labels: rest
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_p=new RewriteRuleNodeStream(adaptor,"token p",p);
					RewriteRuleNodeStream stream_rest=new RewriteRuleNodeStream(adaptor,"token rest", list_rest);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 109:5: -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ( $rest)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:109:8: ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ( $rest)+ )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_p.nextNode(), root_1);
						adaptor.addChild(root_1, (BAST)adaptor.create(ID, "api"));
						adaptor.addChild(root_1, (BAST)adaptor.create(ID, "get_"+(label!=null?label.getText():null)+"()"));
						adaptor.addChild(root_1, (BAST)adaptor.create(ID, "get"));
						if ( !(stream_rest.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_rest.hasNext() ) {
							adaptor.addChild(root_1, stream_rest.nextNode());
						}
						stream_rest.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:111:3: ^(p= DOT label= ID {...}?)
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					_last = (BAST)input.LT(1);
					p=(BAST)match(input,DOT,FOLLOW_DOT_in_convertFeatureNames259); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOT.add(p);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = p;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					label=(BAST)match(input,ID,FOLLOW_ID_in_convertFeatureNames263); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ID.add(label);

					if ( !(( featureNames.contains((label!=null?label.getText():null)) )) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "convertFeatureNames", " featureNames.contains($label.text) ");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ID, ID, ID, p
					// token labels: p
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_p=new RewriteRuleNodeStream(adaptor,"token p",p);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 112:5: -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] )
					{
						// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:112:8: ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_p.nextNode(), root_1);
						adaptor.addChild(root_1, (BAST)adaptor.create(ID, "api"));
						adaptor.addChild(root_1, (BAST)adaptor.create(ID, "get_"+(label!=null?label.getText():null)+"()"));
						adaptor.addChild(root_1, (BAST)adaptor.create(ID, "get"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "convertFeatureNames"

	// Delegated rules



	public static final BitSet FOLLOW_removeDuplicateParentheses_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_convertFeatureNames_in_topdown82 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_removeTopParentheses_in_bottomup99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_removeDuplicateParentheses119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_removeDuplicateParentheses124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RPAREN_in_removeDuplicateParentheses132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RPAREN_in_removeDuplicateParentheses136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_removeTopParentheses174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_RPAREN_in_removeTopParentheses180 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_convertFeatureNames211 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames215 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames219 = new BitSet(new long[]{0x8000000000000008L});
	public static final BitSet FOLLOW_DOT_in_convertFeatureNames259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames263 = new BitSet(new long[]{0x0000000000000008L});
}
