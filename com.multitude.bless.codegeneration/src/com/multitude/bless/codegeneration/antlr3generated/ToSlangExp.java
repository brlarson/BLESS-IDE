// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/ToSlangExp.g 2023-04-04 02:34:18

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
	public static final BitSet FOLLOW_ID_in_convertFeatureNames215 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames219 = new BitSet(new long[]{0x0400000000000008L});
	public static final BitSet FOLLOW_DOT_in_convertFeatureNames259 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_convertFeatureNames263 = new BitSet(new long[]{0x0000000000000008L});
}
