// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g 2023-02-18 18:28:22

//copyright 2022 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import com.multitude.bless.tree.BAST;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class GetTimeouts extends TreeRewriter {
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
		"INT_EXPONENT", "INVARIANT", "INVOKE", "IP_NAME", "IP_PE", "IP_PRED", 
		"LABEL", "LASS", "LBRACKET", "LCON", "LCURLY", "LITERAL_Assertion", "LITERAL_Invariant", 
		"LITERAL_Postcondition", "LITERAL_Precondition", "LITERAL_Typed", "LITERAL_aadlboolean", 
		"LITERAL_aadlinteger", "LITERAL_aadlreal", "LITERAL_aadlstring", "LITERAL_abs", 
		"LITERAL_abstract", "LITERAL_access", "LITERAL_all", "LITERAL_and", "LITERAL_annex", 
		"LITERAL_any", "LITERAL_applies", "LITERAL_are", "LITERAL_array", "LITERAL_assert", 
		"LITERAL_availability", "LITERAL_boolean", "LITERAL_bound", "LITERAL_bus", 
		"LITERAL_call", "LITERAL_calls", "LITERAL_cand", "LITERAL_catch", "LITERAL_classifier", 
		"LITERAL_complete", "LITERAL_complex", "LITERAL_component", "LITERAL_computation", 
		"LITERAL_connection", "LITERAL_connections", "LITERAL_constant", "LITERAL_cor", 
		"LITERAL_count", "LITERAL_data", "LITERAL_declare", "LITERAL_def", "LITERAL_delay", 
		"LITERAL_device", "LITERAL_dispatch", "LITERAL_do", "LITERAL_else", "LITERAL_end", 
		"LITERAL_enumeration", "LITERAL_event", "LITERAL_exception", "LITERAL_exists", 
		"LITERAL_extends", "LITERAL_false", "LITERAL_feature", "LITERAL_features", 
		"LITERAL_fetchadd", "LITERAL_fetchand", "LITERAL_fetchor", "LITERAL_fetchxor", 
		"LITERAL_fi", "LITERAL_final", "LITERAL_flow", "LITERAL_flows", "LITERAL_for", 
		"LITERAL_forall", "LITERAL_fresh", "LITERAL_function", "LITERAL_group", 
		"LITERAL_hr", "LITERAL_if", "LITERAL_iff", "LITERAL_implementation", "LITERAL_implies", 
		"LITERAL_in", "LITERAL_inherit", "LITERAL_initial", "LITERAL_integer", 
		"LITERAL_invariant", "LITERAL_inverse", "LITERAL_is", "LITERAL_list", 
		"LITERAL_lower_bound", "LITERAL_memory", "LITERAL_min", "LITERAL_mod", 
		"LITERAL_mode", "LITERAL_modes", "LITERAL_ms", "LITERAL_natural", "LITERAL_none", 
		"LITERAL_nonvolatile", "LITERAL_not", "LITERAL_now", "LITERAL_ns", "LITERAL_null", 
		"LITERAL_numberof", "LITERAL_of", "LITERAL_on", "LITERAL_or", "LITERAL_out", 
		"LITERAL_package", "LITERAL_parameter", "LITERAL_pause", "LITERAL_port", 
		"LITERAL_post", "LITERAL_pre", "LITERAL_private", "LITERAL_procedure", 
		"LITERAL_process", "LITERAL_processor", "LITERAL_product", "LITERAL_properties", 
		"LITERAL_property", "LITERAL_prototypes", "LITERAL_provides", "LITERAL_ps", 
		"LITERAL_public", "LITERAL_range", "LITERAL_rational", "LITERAL_real", 
		"LITERAL_record", "LITERAL_reference", "LITERAL_rem", "LITERAL_renames", 
		"LITERAL_requires", "LITERAL_sec", "LITERAL_self", "LITERAL_sequence", 
		"LITERAL_set", "LITERAL_setmode", "LITERAL_shared", "LITERAL_skip", "LITERAL_spread", 
		"LITERAL_state", "LITERAL_states", "LITERAL_stop", "LITERAL_string", "LITERAL_subcomponents", 
		"LITERAL_subprogram", "LITERAL_sum", "LITERAL_swap", "LITERAL_system", 
		"LITERAL_that", "LITERAL_then", "LITERAL_thread", "LITERAL_throw", "LITERAL_time", 
		"LITERAL_timeout", "LITERAL_to", "LITERAL_tops", "LITERAL_transition", 
		"LITERAL_transitions", "LITERAL_true", "LITERAL_type", "LITERAL_units", 
		"LITERAL_until", "LITERAL_updated", "LITERAL_upper_bound", "LITERAL_us", 
		"LITERAL_variables", "LITERAL_variant", "LITERAL_virtual", "LITERAL_when", 
		"LITERAL_while", "LITERAL_with", "LITERAL_xor", "LPAREN", "LT", "LTE_STRING", 
		"LT_STRING", "MINUS", "MT_STRING", "NEQ", "OBLIGATION", "OCTOTHORPE", 
		"ON", "P", "PARAMETER", "PARAMETERS", "PERIOD", "PLUS", "PLUS_ARROW", 
		"PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", "PREDICATE_RELATION", 
		"PROCEDURE", "PROCEDURE_CALL", "PROPERTY_LIST", "Q", "QQ", "QUESTION", 
		"RASS", "RATIONAL", "RBRACKET", "RCON", "RCURLY", "REAL_LIT", "RECORD_VALUE", 
		"RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", "START", "START_ASSERTION_PROPERTY", 
		"STOP", "SUBCOMPONENT", "SUBPROGRAM_ANNEX", "THREAD_ANNEX", "THREAD_GROUP", 
		"TICK", "TILDE", "TIMES", "TOP", "TRANSITION", "TYPE", "TYPE_OPERATOR", 
		"TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", "VALUE", "WP", "WS", "'|'"
	};
	public static final int EOF=-1;
	public static final int T__302=302;
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
	public static final int LITERAL_abstract=88;
	public static final int LITERAL_access=89;
	public static final int LITERAL_all=90;
	public static final int LITERAL_and=91;
	public static final int LITERAL_annex=92;
	public static final int LITERAL_any=93;
	public static final int LITERAL_applies=94;
	public static final int LITERAL_are=95;
	public static final int LITERAL_array=96;
	public static final int LITERAL_assert=97;
	public static final int LITERAL_availability=98;
	public static final int LITERAL_boolean=99;
	public static final int LITERAL_bound=100;
	public static final int LITERAL_bus=101;
	public static final int LITERAL_call=102;
	public static final int LITERAL_calls=103;
	public static final int LITERAL_cand=104;
	public static final int LITERAL_catch=105;
	public static final int LITERAL_classifier=106;
	public static final int LITERAL_complete=107;
	public static final int LITERAL_complex=108;
	public static final int LITERAL_component=109;
	public static final int LITERAL_computation=110;
	public static final int LITERAL_connection=111;
	public static final int LITERAL_connections=112;
	public static final int LITERAL_constant=113;
	public static final int LITERAL_cor=114;
	public static final int LITERAL_count=115;
	public static final int LITERAL_data=116;
	public static final int LITERAL_declare=117;
	public static final int LITERAL_def=118;
	public static final int LITERAL_delay=119;
	public static final int LITERAL_device=120;
	public static final int LITERAL_dispatch=121;
	public static final int LITERAL_do=122;
	public static final int LITERAL_else=123;
	public static final int LITERAL_end=124;
	public static final int LITERAL_enumeration=125;
	public static final int LITERAL_event=126;
	public static final int LITERAL_exception=127;
	public static final int LITERAL_exists=128;
	public static final int LITERAL_extends=129;
	public static final int LITERAL_false=130;
	public static final int LITERAL_feature=131;
	public static final int LITERAL_features=132;
	public static final int LITERAL_fetchadd=133;
	public static final int LITERAL_fetchand=134;
	public static final int LITERAL_fetchor=135;
	public static final int LITERAL_fetchxor=136;
	public static final int LITERAL_fi=137;
	public static final int LITERAL_final=138;
	public static final int LITERAL_flow=139;
	public static final int LITERAL_flows=140;
	public static final int LITERAL_for=141;
	public static final int LITERAL_forall=142;
	public static final int LITERAL_fresh=143;
	public static final int LITERAL_function=144;
	public static final int LITERAL_group=145;
	public static final int LITERAL_hr=146;
	public static final int LITERAL_if=147;
	public static final int LITERAL_iff=148;
	public static final int LITERAL_implementation=149;
	public static final int LITERAL_implies=150;
	public static final int LITERAL_in=151;
	public static final int LITERAL_inherit=152;
	public static final int LITERAL_initial=153;
	public static final int LITERAL_integer=154;
	public static final int LITERAL_invariant=155;
	public static final int LITERAL_inverse=156;
	public static final int LITERAL_is=157;
	public static final int LITERAL_list=158;
	public static final int LITERAL_lower_bound=159;
	public static final int LITERAL_memory=160;
	public static final int LITERAL_min=161;
	public static final int LITERAL_mod=162;
	public static final int LITERAL_mode=163;
	public static final int LITERAL_modes=164;
	public static final int LITERAL_ms=165;
	public static final int LITERAL_natural=166;
	public static final int LITERAL_none=167;
	public static final int LITERAL_nonvolatile=168;
	public static final int LITERAL_not=169;
	public static final int LITERAL_now=170;
	public static final int LITERAL_ns=171;
	public static final int LITERAL_null=172;
	public static final int LITERAL_numberof=173;
	public static final int LITERAL_of=174;
	public static final int LITERAL_on=175;
	public static final int LITERAL_or=176;
	public static final int LITERAL_out=177;
	public static final int LITERAL_package=178;
	public static final int LITERAL_parameter=179;
	public static final int LITERAL_pause=180;
	public static final int LITERAL_port=181;
	public static final int LITERAL_post=182;
	public static final int LITERAL_pre=183;
	public static final int LITERAL_private=184;
	public static final int LITERAL_procedure=185;
	public static final int LITERAL_process=186;
	public static final int LITERAL_processor=187;
	public static final int LITERAL_product=188;
	public static final int LITERAL_properties=189;
	public static final int LITERAL_property=190;
	public static final int LITERAL_prototypes=191;
	public static final int LITERAL_provides=192;
	public static final int LITERAL_ps=193;
	public static final int LITERAL_public=194;
	public static final int LITERAL_range=195;
	public static final int LITERAL_rational=196;
	public static final int LITERAL_real=197;
	public static final int LITERAL_record=198;
	public static final int LITERAL_reference=199;
	public static final int LITERAL_rem=200;
	public static final int LITERAL_renames=201;
	public static final int LITERAL_requires=202;
	public static final int LITERAL_sec=203;
	public static final int LITERAL_self=204;
	public static final int LITERAL_sequence=205;
	public static final int LITERAL_set=206;
	public static final int LITERAL_setmode=207;
	public static final int LITERAL_shared=208;
	public static final int LITERAL_skip=209;
	public static final int LITERAL_spread=210;
	public static final int LITERAL_state=211;
	public static final int LITERAL_states=212;
	public static final int LITERAL_stop=213;
	public static final int LITERAL_string=214;
	public static final int LITERAL_subcomponents=215;
	public static final int LITERAL_subprogram=216;
	public static final int LITERAL_sum=217;
	public static final int LITERAL_swap=218;
	public static final int LITERAL_system=219;
	public static final int LITERAL_that=220;
	public static final int LITERAL_then=221;
	public static final int LITERAL_thread=222;
	public static final int LITERAL_throw=223;
	public static final int LITERAL_time=224;
	public static final int LITERAL_timeout=225;
	public static final int LITERAL_to=226;
	public static final int LITERAL_tops=227;
	public static final int LITERAL_transition=228;
	public static final int LITERAL_transitions=229;
	public static final int LITERAL_true=230;
	public static final int LITERAL_type=231;
	public static final int LITERAL_units=232;
	public static final int LITERAL_until=233;
	public static final int LITERAL_updated=234;
	public static final int LITERAL_upper_bound=235;
	public static final int LITERAL_us=236;
	public static final int LITERAL_variables=237;
	public static final int LITERAL_variant=238;
	public static final int LITERAL_virtual=239;
	public static final int LITERAL_when=240;
	public static final int LITERAL_while=241;
	public static final int LITERAL_with=242;
	public static final int LITERAL_xor=243;
	public static final int LPAREN=244;
	public static final int LT=245;
	public static final int LTE_STRING=246;
	public static final int LT_STRING=247;
	public static final int MINUS=248;
	public static final int MT_STRING=249;
	public static final int NEQ=250;
	public static final int OBLIGATION=251;
	public static final int OCTOTHORPE=252;
	public static final int ON=253;
	public static final int P=254;
	public static final int PARAMETER=255;
	public static final int PARAMETERS=256;
	public static final int PERIOD=257;
	public static final int PLUS=258;
	public static final int PLUS_ARROW=259;
	public static final int PLUS_EQUALS=260;
	public static final int PORT=261;
	public static final int PORT_INPUT=262;
	public static final int PORT_OUTPUT=263;
	public static final int PREDICATE_RELATION=264;
	public static final int PROCEDURE=265;
	public static final int PROCEDURE_CALL=266;
	public static final int PROPERTY_LIST=267;
	public static final int Q=268;
	public static final int QQ=269;
	public static final int QUESTION=270;
	public static final int RASS=271;
	public static final int RATIONAL=272;
	public static final int RBRACKET=273;
	public static final int RCON=274;
	public static final int RCURLY=275;
	public static final int REAL_LIT=276;
	public static final int RECORD_VALUE=277;
	public static final int RPAREN=278;
	public static final int S=279;
	public static final int SEMICOLON=280;
	public static final int SLCOMMENT=281;
	public static final int SOURCE=282;
	public static final int START=283;
	public static final int START_ASSERTION_PROPERTY=284;
	public static final int STOP=285;
	public static final int SUBCOMPONENT=286;
	public static final int SUBPROGRAM_ANNEX=287;
	public static final int THREAD_ANNEX=288;
	public static final int THREAD_GROUP=289;
	public static final int TICK=290;
	public static final int TILDE=291;
	public static final int TIMES=292;
	public static final int TOP=293;
	public static final int TRANSITION=294;
	public static final int TYPE=295;
	public static final int TYPE_OPERATOR=296;
	public static final int TYPE_OPERATOR_INVOCATION=297;
	public static final int UNARY_MINUS=298;
	public static final int VALUE=299;
	public static final int WP=300;
	public static final int WS=301;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public GetTimeouts(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public GetTimeouts(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GetTimeouts.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g"; }


	public Set<BAST> timeouts = new HashSet<BAST>();


	public static class topdown_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "topdown"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:35:1: topdown : get_timeout ;
	@Override
	public final GetTimeouts.topdown_return topdown() throws RecognitionException {
		GetTimeouts.topdown_return retval = new GetTimeouts.topdown_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		TreeRuleReturnScope get_timeout1 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:36:3: ( get_timeout )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:37:3: get_timeout
			{
			_last = (BAST)input.LT(1);
			pushFollow(FOLLOW_get_timeout_in_topdown69);
			get_timeout1=get_timeout();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (BAST)get_timeout1.getTree();

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (BAST)adaptor.getParent(retval.tree);
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "topdown"


	public static class get_timeout_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "get_timeout"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:40:1: get_timeout : ^(t= LITERAL_timeout (e+= . )* ) ;
	public final GetTimeouts.get_timeout_return get_timeout() throws RecognitionException {
		GetTimeouts.get_timeout_return retval = new GetTimeouts.get_timeout_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST t=null;
		BAST e=null;
		List<Object> list_e=null;

		BAST t_tree=null;
		BAST e_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:41:3: ( ^(t= LITERAL_timeout (e+= . )* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:42:3: ^(t= LITERAL_timeout (e+= . )* )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			_last = (BAST)input.LT(1);
			t=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_get_timeout87); if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = t;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:42:24: (e+= . )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AADL_STRING_LITERAL && LA1_0 <= 302)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/GetTimeouts.g:42:24: e+= .
						{
						_last = (BAST)input.LT(1);
						e=(BAST)input.LT(1);
						matchAny(input); if (state.failed) return retval;
						 
						if ( state.backtracking==1 )
						if ( _first_1==null ) _first_1 = e;

						if (list_e==null) list_e=new ArrayList<Object>();
						list_e.add(e);
						if ( state.backtracking==1 ) {
						retval.tree = _first_0;
						if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
							retval.tree = (BAST)adaptor.getParent(retval.tree);
						}

						}
						break;

					default :
						break loop1;
					}
				}

				if ( state.backtracking==1 ) {timeouts.add(t);}
				match(input, Token.UP, null); if (state.failed) return retval;
			}
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (BAST)adaptor.getParent(retval.tree);
			}

			}

		}
		 
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "get_timeout"

	// Delegated rules



	public static final BitSet FOLLOW_get_timeout_in_topdown69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_get_timeout87 = new BitSet(new long[]{0x0000000000000004L});
}
