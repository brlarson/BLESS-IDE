// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g 2023-05-08 05:04:04

//copyright 2012 Multitude Corporation
package com.multitude.bless.codegeneration.antlr3generated;
import java.util.List;
import java.util.ArrayList;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;

import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.app.Global;
import com.multitude.bless.antlr3generated.BLESStoASTLexer;


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
		"ACTION", "AL", "AM", "AMPERSAND", "ANNEX_END", "ANNEX_START", "ARROW", 
		"ASSERTION", "ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", 
		"ASSIGN", "AT_SIGN", "BASE", "BASED_INTEGER", "BEHAVIOR_GUARD", "BEHAVIOR_TIME", 
		"BI", "BOUND", "BOX", "CARET", "CASE_EXPRESSION", "COLON", "COMMA", "COMMACOMMA", 
		"COMMADOT", "COMPLEX", "COMPONENT", "CONDITION", "CONDITIONAL", "CONDITIONAL_FUNCTION", 
		"CONNECTION", "COUNTING_TRIGGER", "DESTINATION", "DIGIT", "DIVIDE", "DOLLAR", 
		"DOTCOMMA", "DOTDOT", "DOUBLE_COLON", "DOUBLE_QUOTE", "DO_NOT_PROVE", 
		"DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", "EQ", "EXCLAMATION", 
		"EXP", "EXPONENT", "EXTENDED_DIGIT", "FLOATING", "FUNCTION", "FUNCTION_CALL", 
		"GT", "GUARD", "HEX_DIGIT", "ID", "IMP", "INMODE", "INOUT", "INTEGER_LIT", 
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
		"WP", "WS", "'|'"
	};
	public static final int EOF=-1;
	public static final int T__303=303;
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
	public static final int COMMA=29;
	public static final int COMMACOMMA=30;
	public static final int COMMADOT=31;
	public static final int COMPLEX=32;
	public static final int COMPONENT=33;
	public static final int CONDITION=34;
	public static final int CONDITIONAL=35;
	public static final int CONDITIONAL_FUNCTION=36;
	public static final int CONNECTION=37;
	public static final int COUNTING_TRIGGER=38;
	public static final int DESTINATION=39;
	public static final int DIGIT=40;
	public static final int DIVIDE=41;
	public static final int DOLLAR=42;
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
	public static final int FUNCTION_CALL=58;
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
	public static final int LITERAL_abstract=89;
	public static final int LITERAL_access=90;
	public static final int LITERAL_all=91;
	public static final int LITERAL_and=92;
	public static final int LITERAL_annex=93;
	public static final int LITERAL_any=94;
	public static final int LITERAL_applies=95;
	public static final int LITERAL_are=96;
	public static final int LITERAL_array=97;
	public static final int LITERAL_assert=98;
	public static final int LITERAL_availability=99;
	public static final int LITERAL_boolean=100;
	public static final int LITERAL_bound=101;
	public static final int LITERAL_bus=102;
	public static final int LITERAL_call=103;
	public static final int LITERAL_calls=104;
	public static final int LITERAL_cand=105;
	public static final int LITERAL_catch=106;
	public static final int LITERAL_classifier=107;
	public static final int LITERAL_complete=108;
	public static final int LITERAL_complex=109;
	public static final int LITERAL_component=110;
	public static final int LITERAL_computation=111;
	public static final int LITERAL_connection=112;
	public static final int LITERAL_connections=113;
	public static final int LITERAL_constant=114;
	public static final int LITERAL_cor=115;
	public static final int LITERAL_count=116;
	public static final int LITERAL_data=117;
	public static final int LITERAL_declare=118;
	public static final int LITERAL_def=119;
	public static final int LITERAL_delay=120;
	public static final int LITERAL_device=121;
	public static final int LITERAL_dispatch=122;
	public static final int LITERAL_do=123;
	public static final int LITERAL_else=124;
	public static final int LITERAL_end=125;
	public static final int LITERAL_enumeration=126;
	public static final int LITERAL_event=127;
	public static final int LITERAL_exception=128;
	public static final int LITERAL_exists=129;
	public static final int LITERAL_extends=130;
	public static final int LITERAL_false=131;
	public static final int LITERAL_feature=132;
	public static final int LITERAL_features=133;
	public static final int LITERAL_fetchadd=134;
	public static final int LITERAL_fetchand=135;
	public static final int LITERAL_fetchor=136;
	public static final int LITERAL_fetchxor=137;
	public static final int LITERAL_fi=138;
	public static final int LITERAL_final=139;
	public static final int LITERAL_flow=140;
	public static final int LITERAL_flows=141;
	public static final int LITERAL_for=142;
	public static final int LITERAL_forall=143;
	public static final int LITERAL_fresh=144;
	public static final int LITERAL_function=145;
	public static final int LITERAL_group=146;
	public static final int LITERAL_hr=147;
	public static final int LITERAL_if=148;
	public static final int LITERAL_iff=149;
	public static final int LITERAL_implementation=150;
	public static final int LITERAL_implies=151;
	public static final int LITERAL_in=152;
	public static final int LITERAL_inherit=153;
	public static final int LITERAL_initial=154;
	public static final int LITERAL_integer=155;
	public static final int LITERAL_invariant=156;
	public static final int LITERAL_inverse=157;
	public static final int LITERAL_is=158;
	public static final int LITERAL_list=159;
	public static final int LITERAL_lower_bound=160;
	public static final int LITERAL_memory=161;
	public static final int LITERAL_min=162;
	public static final int LITERAL_mod=163;
	public static final int LITERAL_mode=164;
	public static final int LITERAL_modes=165;
	public static final int LITERAL_ms=166;
	public static final int LITERAL_natural=167;
	public static final int LITERAL_none=168;
	public static final int LITERAL_nonvolatile=169;
	public static final int LITERAL_not=170;
	public static final int LITERAL_now=171;
	public static final int LITERAL_ns=172;
	public static final int LITERAL_null=173;
	public static final int LITERAL_numberof=174;
	public static final int LITERAL_of=175;
	public static final int LITERAL_on=176;
	public static final int LITERAL_or=177;
	public static final int LITERAL_out=178;
	public static final int LITERAL_package=179;
	public static final int LITERAL_parameter=180;
	public static final int LITERAL_pause=181;
	public static final int LITERAL_port=182;
	public static final int LITERAL_post=183;
	public static final int LITERAL_pre=184;
	public static final int LITERAL_private=185;
	public static final int LITERAL_procedure=186;
	public static final int LITERAL_process=187;
	public static final int LITERAL_processor=188;
	public static final int LITERAL_product=189;
	public static final int LITERAL_properties=190;
	public static final int LITERAL_property=191;
	public static final int LITERAL_prototypes=192;
	public static final int LITERAL_provides=193;
	public static final int LITERAL_ps=194;
	public static final int LITERAL_public=195;
	public static final int LITERAL_range=196;
	public static final int LITERAL_rational=197;
	public static final int LITERAL_real=198;
	public static final int LITERAL_record=199;
	public static final int LITERAL_reference=200;
	public static final int LITERAL_rem=201;
	public static final int LITERAL_renames=202;
	public static final int LITERAL_requires=203;
	public static final int LITERAL_sec=204;
	public static final int LITERAL_self=205;
	public static final int LITERAL_sequence=206;
	public static final int LITERAL_set=207;
	public static final int LITERAL_setmode=208;
	public static final int LITERAL_shared=209;
	public static final int LITERAL_skip=210;
	public static final int LITERAL_spread=211;
	public static final int LITERAL_state=212;
	public static final int LITERAL_states=213;
	public static final int LITERAL_stop=214;
	public static final int LITERAL_string=215;
	public static final int LITERAL_subcomponents=216;
	public static final int LITERAL_subprogram=217;
	public static final int LITERAL_sum=218;
	public static final int LITERAL_swap=219;
	public static final int LITERAL_system=220;
	public static final int LITERAL_that=221;
	public static final int LITERAL_then=222;
	public static final int LITERAL_thread=223;
	public static final int LITERAL_throw=224;
	public static final int LITERAL_time=225;
	public static final int LITERAL_timeout=226;
	public static final int LITERAL_to=227;
	public static final int LITERAL_tops=228;
	public static final int LITERAL_transition=229;
	public static final int LITERAL_transitions=230;
	public static final int LITERAL_true=231;
	public static final int LITERAL_type=232;
	public static final int LITERAL_units=233;
	public static final int LITERAL_until=234;
	public static final int LITERAL_updated=235;
	public static final int LITERAL_upper_bound=236;
	public static final int LITERAL_us=237;
	public static final int LITERAL_variables=238;
	public static final int LITERAL_variant=239;
	public static final int LITERAL_virtual=240;
	public static final int LITERAL_when=241;
	public static final int LITERAL_while=242;
	public static final int LITERAL_with=243;
	public static final int LITERAL_xor=244;
	public static final int LPAREN=245;
	public static final int LT=246;
	public static final int LTE_STRING=247;
	public static final int LT_STRING=248;
	public static final int MINUS=249;
	public static final int MT_STRING=250;
	public static final int NEQ=251;
	public static final int OBLIGATION=252;
	public static final int OCTOTHORPE=253;
	public static final int ON=254;
	public static final int P=255;
	public static final int PARAMETER=256;
	public static final int PARAMETERS=257;
	public static final int PERIOD=258;
	public static final int PLUS=259;
	public static final int PLUS_ARROW=260;
	public static final int PLUS_EQUALS=261;
	public static final int PORT=262;
	public static final int PORT_INPUT=263;
	public static final int PORT_OUTPUT=264;
	public static final int PREDICATE_RELATION=265;
	public static final int PROCEDURE=266;
	public static final int PROCEDURE_CALL=267;
	public static final int PROPERTY_LIST=268;
	public static final int Q=269;
	public static final int QQ=270;
	public static final int QUESTION=271;
	public static final int RASS=272;
	public static final int RATIONAL=273;
	public static final int RBRACKET=274;
	public static final int RCON=275;
	public static final int RCURLY=276;
	public static final int REAL_LIT=277;
	public static final int RECORD_VALUE=278;
	public static final int RPAREN=279;
	public static final int S=280;
	public static final int SEMICOLON=281;
	public static final int SLCOMMENT=282;
	public static final int SOURCE=283;
	public static final int START=284;
	public static final int START_ASSERTION_PROPERTY=285;
	public static final int STOP=286;
	public static final int SUBCOMPONENT=287;
	public static final int SUBPROGRAM_ANNEX=288;
	public static final int THREAD_ANNEX=289;
	public static final int THREAD_GROUP=290;
	public static final int TICK=291;
	public static final int TILDE=292;
	public static final int TIMES=293;
	public static final int TOP=294;
	public static final int TRANSITION=295;
	public static final int TYPE=296;
	public static final int TYPE_OPERATOR=297;
	public static final int TYPE_OPERATOR_INVOCATION=298;
	public static final int UNARY_MINUS=299;
	public static final int VALUE=300;
	public static final int WP=301;
	public static final int WS=302;

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
			else if ( (LA1_0==PERIOD) ) {
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
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:106:1: convertFeatureNames : ( ^(p= PERIOD label= ID (rest+= ID )+ {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ( $rest)+ ) | ^(p= PERIOD label= ID {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ) );
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
		RewriteRuleNodeStream stream_PERIOD=new RewriteRuleNodeStream(adaptor,"token PERIOD");
		RewriteRuleNodeStream stream_ID=new RewriteRuleNodeStream(adaptor,"token ID");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:107:3: ( ^(p= PERIOD label= ID (rest+= ID )+ {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ( $rest)+ ) | ^(p= PERIOD label= ID {...}?) -> ^( $p ID[\"api\"] ID[\"get_\"+$label.text+\"()\"] ID[\"get\"] ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==PERIOD) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:108:3: ^(p= PERIOD label= ID (rest+= ID )+ {...}?)
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					_last = (BAST)input.LT(1);
					p=(BAST)match(input,PERIOD,FOLLOW_PERIOD_in_convertFeatureNames211); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PERIOD.add(p);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = p;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (BAST)input.LT(1);
					label=(BAST)match(input,ID,FOLLOW_ID_in_convertFeatureNames215); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ID.add(label);

					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:108:27: (rest+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:108:27: rest+= ID
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
					// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g:111:3: ^(p= PERIOD label= ID {...}?)
					{
					_last = (BAST)input.LT(1);
					{
					BAST _save_last_1 = _last;
					BAST _first_1 = null;
					_last = (BAST)input.LT(1);
					p=(BAST)match(input,PERIOD,FOLLOW_PERIOD_in_convertFeatureNames259); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PERIOD.add(p);

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
	public static final BitSet FOLLOW_PERIOD_in_convertFeatureNames211 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames215 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames219 = new BitSet(new long[]{0x4000000000000008L});
	public static final BitSet FOLLOW_PERIOD_in_convertFeatureNames259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames263 = new BitSet(new long[]{0x0000000000000008L});
}
