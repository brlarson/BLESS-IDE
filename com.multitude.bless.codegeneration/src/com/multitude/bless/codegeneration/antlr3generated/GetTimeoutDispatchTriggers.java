// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g 2023-07-08 19:13:31

//copyright 2012 Multitude Corporation
package com.multitude.bless.codegeneration.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.exceptions.Dump;
import java.util.Vector;
import java.util.HashSet;
import java.util.ArrayList;
import com.multitude.bless.antlr3generated.BLESS3Lexer;

import com.multitude.bless.codegeneration.TimeoutRecord;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class GetTimeoutDispatchTriggers extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AADL_STRING_LITERAL", "AADL_STRING_PART", 
		"ACTION", "ACTION_SUBCLAUSE", "AL", "AM", "AMPERSAND", "ANNEX_END", "ANNEX_START", 
		"ARROW", "ASSERTION", "ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", 
		"ASSIGN", "AT_SIGN", "BEHAVIOR_GUARD", "BEHAVIOR_TIME", "BI", "BLESS_SUBCLAUSE", 
		"BOUND", "BOX", "CARET", "COLON", "COLON_TILDE", "COMMA", "COMMACOMMA", 
		"COMMADOT", "COMPONENT", "CONDITION", "CONDITIONAL_ASSERTION_FUNCTION", 
		"COUNTING_TRIGGER", "CVP", "DESTINATION", "DIGIT", "DIVIDE", "DOLLAR", 
		"DOT", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", "DOUBLE_QUOTE", "DO_NOT_PROVE", 
		"DUMMY", "EMPTY_CURLY", "END_ASSERTION_PROPERTY", "EQ", "EXCLAMATION", 
		"EXP", "EXPONENT", "FLOATING", "FUNCTION", "GT", "GUARD", "HEX_DIGIT", 
		"ID", "IMP", "INMODE", "INOUT", "INVARIANT", "INVOKE", "IP_NAME", "IP_PE", 
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
		"NUMBER", "OBLIGATION", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETERS", 
		"PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", "PORT_OUTPUT", 
		"PREDICATE_RELATION", "PROCEDURE", "Q", "QQ", "QUANTITY", "QUESTION", 
		"RASS", "RBRACKET", "RCON", "RCURLY", "RECORD_TERM", "ROOT_DECLARATION", 
		"RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", "START", "START_ASSERTION_PROPERTY", 
		"STOP", "SUBPROGRAM_INVOCATION", "TICK", "TILDE", "TIMES", "TOP", "TRANSITION", 
		"TYPE", "TYPE_LIBRARY", "TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", 
		"UNIT_FORMULA", "UNIT_LIBRARY", "UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", 
		"VERT", "WS"
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
	public static final int BEHAVIOR_TIME=21;
	public static final int BI=22;
	public static final int BLESS_SUBCLAUSE=23;
	public static final int BOUND=24;
	public static final int BOX=25;
	public static final int CARET=26;
	public static final int COLON=27;
	public static final int COLON_TILDE=28;
	public static final int COMMA=29;
	public static final int COMMACOMMA=30;
	public static final int COMMADOT=31;
	public static final int COMPONENT=32;
	public static final int CONDITION=33;
	public static final int CONDITIONAL_ASSERTION_FUNCTION=34;
	public static final int COUNTING_TRIGGER=35;
	public static final int CVP=36;
	public static final int DESTINATION=37;
	public static final int DIGIT=38;
	public static final int DIVIDE=39;
	public static final int DOLLAR=40;
	public static final int DOT=41;
	public static final int DOTCOMMA=42;
	public static final int DOTDOT=43;
	public static final int DOUBLE_COLON=44;
	public static final int DOUBLE_QUOTE=45;
	public static final int DO_NOT_PROVE=46;
	public static final int DUMMY=47;
	public static final int EMPTY_CURLY=48;
	public static final int END_ASSERTION_PROPERTY=49;
	public static final int EQ=50;
	public static final int EXCLAMATION=51;
	public static final int EXP=52;
	public static final int EXPONENT=53;
	public static final int FLOATING=54;
	public static final int FUNCTION=55;
	public static final int GT=56;
	public static final int GUARD=57;
	public static final int HEX_DIGIT=58;
	public static final int ID=59;
	public static final int IMP=60;
	public static final int INMODE=61;
	public static final int INOUT=62;
	public static final int INVARIANT=63;
	public static final int INVOKE=64;
	public static final int IP_NAME=65;
	public static final int IP_PE=66;
	public static final int IP_PRED=67;
	public static final int LABEL=68;
	public static final int LASS=69;
	public static final int LBRACKET=70;
	public static final int LCON=71;
	public static final int LCURLY=72;
	public static final int LITERAL_Assertion=73;
	public static final int LITERAL_Invariant=74;
	public static final int LITERAL_Postcondition=75;
	public static final int LITERAL_Precondition=76;
	public static final int LITERAL_Typed=77;
	public static final int LITERAL_aadlboolean=78;
	public static final int LITERAL_aadlinteger=79;
	public static final int LITERAL_aadlreal=80;
	public static final int LITERAL_aadlstring=81;
	public static final int LITERAL_abs=82;
	public static final int LITERAL_access=83;
	public static final int LITERAL_all=84;
	public static final int LITERAL_and=85;
	public static final int LITERAL_any=86;
	public static final int LITERAL_applies=87;
	public static final int LITERAL_are=88;
	public static final int LITERAL_array=89;
	public static final int LITERAL_assert=90;
	public static final int LITERAL_availability=91;
	public static final int LITERAL_base=92;
	public static final int LITERAL_binding=93;
	public static final int LITERAL_boolean=94;
	public static final int LITERAL_bound=95;
	public static final int LITERAL_call=96;
	public static final int LITERAL_calls=97;
	public static final int LITERAL_case=98;
	public static final int LITERAL_catch=99;
	public static final int LITERAL_classifier=100;
	public static final int LITERAL_complete=101;
	public static final int LITERAL_component=102;
	public static final int LITERAL_computation=103;
	public static final int LITERAL_connection=104;
	public static final int LITERAL_connections=105;
	public static final int LITERAL_constant=106;
	public static final int LITERAL_count=107;
	public static final int LITERAL_declare=108;
	public static final int LITERAL_def=109;
	public static final int LITERAL_delay=110;
	public static final int LITERAL_dispatch=111;
	public static final int LITERAL_div=112;
	public static final int LITERAL_do=113;
	public static final int LITERAL_else=114;
	public static final int LITERAL_enumeration=115;
	public static final int LITERAL_exception=116;
	public static final int LITERAL_exists=117;
	public static final int LITERAL_extends=118;
	public static final int LITERAL_extension=119;
	public static final int LITERAL_false=120;
	public static final int LITERAL_feature=121;
	public static final int LITERAL_fetchadd=122;
	public static final int LITERAL_fetchand=123;
	public static final int LITERAL_fetchor=124;
	public static final int LITERAL_fetchxor=125;
	public static final int LITERAL_fi=126;
	public static final int LITERAL_final=127;
	public static final int LITERAL_flow=128;
	public static final int LITERAL_for=129;
	public static final int LITERAL_forall=130;
	public static final int LITERAL_fresh=131;
	public static final int LITERAL_ghost=132;
	public static final int LITERAL_if=133;
	public static final int LITERAL_iff=134;
	public static final int LITERAL_implementation=135;
	public static final int LITERAL_implies=136;
	public static final int LITERAL_in=137;
	public static final int LITERAL_inherit=138;
	public static final int LITERAL_initial=139;
	public static final int LITERAL_internal=140;
	public static final int LITERAL_invariant=141;
	public static final int LITERAL_inverse=142;
	public static final int LITERAL_is=143;
	public static final int LITERAL_list=144;
	public static final int LITERAL_lower_bound=145;
	public static final int LITERAL_mod=146;
	public static final int LITERAL_mode=147;
	public static final int LITERAL_modes=148;
	public static final int LITERAL_nonvolatile=149;
	public static final int LITERAL_not=150;
	public static final int LITERAL_now=151;
	public static final int LITERAL_null=152;
	public static final int LITERAL_numberof=153;
	public static final int LITERAL_of=154;
	public static final int LITERAL_on=155;
	public static final int LITERAL_or=156;
	public static final int LITERAL_package=157;
	public static final int LITERAL_parameter=158;
	public static final int LITERAL_pause=159;
	public static final int LITERAL_post=160;
	public static final int LITERAL_pre=161;
	public static final int LITERAL_private=162;
	public static final int LITERAL_product=163;
	public static final int LITERAL_property=164;
	public static final int LITERAL_provides=165;
	public static final int LITERAL_public=166;
	public static final int LITERAL_quantity=167;
	public static final int LITERAL_range=168;
	public static final int LITERAL_record=169;
	public static final int LITERAL_reference=170;
	public static final int LITERAL_rem=171;
	public static final int LITERAL_renames=172;
	public static final int LITERAL_representation=173;
	public static final int LITERAL_requires=174;
	public static final int LITERAL_returns=175;
	public static final int LITERAL_round=176;
	public static final int LITERAL_scalar=177;
	public static final int LITERAL_self=178;
	public static final int LITERAL_sequence=179;
	public static final int LITERAL_set=180;
	public static final int LITERAL_setmode=181;
	public static final int LITERAL_shared=182;
	public static final int LITERAL_skip=183;
	public static final int LITERAL_spread=184;
	public static final int LITERAL_state=185;
	public static final int LITERAL_states=186;
	public static final int LITERAL_step=187;
	public static final int LITERAL_stop=188;
	public static final int LITERAL_string=189;
	public static final int LITERAL_subcomponents=190;
	public static final int LITERAL_sum=191;
	public static final int LITERAL_swap=192;
	public static final int LITERAL_that=193;
	public static final int LITERAL_then=194;
	public static final int LITERAL_throw=195;
	public static final int LITERAL_throws=196;
	public static final int LITERAL_timeout=197;
	public static final int LITERAL_to=198;
	public static final int LITERAL_tops=199;
	public static final int LITERAL_transition=200;
	public static final int LITERAL_transitions=201;
	public static final int LITERAL_true=202;
	public static final int LITERAL_truncate=203;
	public static final int LITERAL_type=204;
	public static final int LITERAL_union=205;
	public static final int LITERAL_units=206;
	public static final int LITERAL_until=207;
	public static final int LITERAL_updated=208;
	public static final int LITERAL_upper_bound=209;
	public static final int LITERAL_variables=210;
	public static final int LITERAL_variant=211;
	public static final int LITERAL_when=212;
	public static final int LITERAL_which=213;
	public static final int LITERAL_while=214;
	public static final int LITERAL_whole=215;
	public static final int LITERAL_with=216;
	public static final int LITERAL_xor=217;
	public static final int LPAREN=218;
	public static final int LT=219;
	public static final int LTE_STRING=220;
	public static final int LT_STRING=221;
	public static final int MINUS=222;
	public static final int MT_STRING=223;
	public static final int NEQ=224;
	public static final int NUMBER=225;
	public static final int OBLIGATION=226;
	public static final int OCTOTHORPE=227;
	public static final int OLD_NEQ=228;
	public static final int ON=229;
	public static final int P=230;
	public static final int PARAMETERS=231;
	public static final int PLUS=232;
	public static final int PLUS_ARROW=233;
	public static final int PLUS_EQUALS=234;
	public static final int PORT=235;
	public static final int PORT_INPUT=236;
	public static final int PORT_OUTPUT=237;
	public static final int PREDICATE_RELATION=238;
	public static final int PROCEDURE=239;
	public static final int Q=240;
	public static final int QQ=241;
	public static final int QUANTITY=242;
	public static final int QUESTION=243;
	public static final int RASS=244;
	public static final int RBRACKET=245;
	public static final int RCON=246;
	public static final int RCURLY=247;
	public static final int RECORD_TERM=248;
	public static final int ROOT_DECLARATION=249;
	public static final int RPAREN=250;
	public static final int S=251;
	public static final int SEMICOLON=252;
	public static final int SLCOMMENT=253;
	public static final int SOURCE=254;
	public static final int START=255;
	public static final int START_ASSERTION_PROPERTY=256;
	public static final int STOP=257;
	public static final int SUBPROGRAM_INVOCATION=258;
	public static final int TICK=259;
	public static final int TILDE=260;
	public static final int TIMES=261;
	public static final int TOP=262;
	public static final int TRANSITION=263;
	public static final int TYPE=264;
	public static final int TYPE_LIBRARY=265;
	public static final int TYPE_OPERATOR=266;
	public static final int TYPE_OPERATOR_INVOCATION=267;
	public static final int UNARY_MINUS=268;
	public static final int UNIT_FORMULA=269;
	public static final int UNIT_LIBRARY=270;
	public static final int UNIT_NAME=271;
	public static final int VALUE=272;
	public static final int VARIABLE_DECLARATION=273;
	public static final int VERT=274;
	public static final int WS=275;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public GetTimeoutDispatchTriggers(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public GetTimeoutDispatchTriggers(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GetTimeoutDispatchTriggers.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g"; }



	public GetTimeoutDispatchTriggers(BAST useThisASTforRoot)
	  {
	  this(new CommonTreeNodeStream(useThisASTforRoot));
	  }

	/*
	public void tellClassCastException(String s, ClassCastException cce, BAST problem)
	  {
	  Dump.it("\n\nYou are a ninny. Class cast exceptions show you are obviously incompetent.\n\n");
	  if (!toldASTtoOther)
	    {
	    Dump.it(s);
	    toldASTtoOther=true;
	    if (problem != null)
	      {
	      problem.showParseTree("ClassCastException");
	      Dump.it(problem.toStringTree());
	      }
	    }
	  Dump.it(cce);
	  }  */

	public boolean recognitionErrorOccurred = false;    //did a parse error occur?

	public void reportError(RecognitionException ex)
	  {
	  Dump.it("GetTimeoutDispatchTriggers.reportError(RecognitionException ex)=> "
	    +ex.toString());
	  Dump.it(getErrorHeader(ex));
	  Dump.it(ex);
	  recognitionErrorOccurred = true;
	  if ((ex.node!=null)&&(ex.node instanceof BAST))
	    ((BAST)ex.node).showParseTree(((BAST)ex.node).getText());
	  super.reportError(ex);
	//  HelpfulHints.giveHint();
	  }

	public void emitErrorMessage(String msg) 
	  {
	  System.err.println(msg);
	  Dump.it(msg);
	  }

	public Vector<BAST> s = new Vector<BAST>();

	//private BAST sortPorts(BAST b)



	public static class topdown_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "topdown"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:89:1: topdown : get_timeout_dispatch_triggers ;
	@Override
	public final GetTimeoutDispatchTriggers.topdown_return topdown() throws RecognitionException {
		GetTimeoutDispatchTriggers.topdown_return retval = new GetTimeoutDispatchTriggers.topdown_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		TreeRuleReturnScope get_timeout_dispatch_triggers1 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:90:3: ( get_timeout_dispatch_triggers )
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:91:3: get_timeout_dispatch_triggers
			{
			_last = (BAST)input.LT(1);
			pushFollow(FOLLOW_get_timeout_dispatch_triggers_in_topdown75);
			get_timeout_dispatch_triggers1=get_timeout_dispatch_triggers();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (BAST)get_timeout_dispatch_triggers1.getTree();

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


	public static class get_timeout_dispatch_triggers_return extends TreeRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "get_timeout_dispatch_triggers"
	// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:94:1: get_timeout_dispatch_triggers : ^(t= LITERAL_timeout ( . )* ) ;
	public final GetTimeoutDispatchTriggers.get_timeout_dispatch_triggers_return get_timeout_dispatch_triggers() throws RecognitionException {
		GetTimeoutDispatchTriggers.get_timeout_dispatch_triggers_return retval = new GetTimeoutDispatchTriggers.get_timeout_dispatch_triggers_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		BAST _first_0 = null;
		BAST _last = null;


		BAST t=null;
		BAST wildcard2=null;

		BAST t_tree=null;
		BAST wildcard2_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:95:3: ( ^(t= LITERAL_timeout ( . )* ) )
			// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:96:3: ^(t= LITERAL_timeout ( . )* )
			{
			_last = (BAST)input.LT(1);
			{
			BAST _save_last_1 = _last;
			BAST _first_1 = null;
			_last = (BAST)input.LT(1);
			t=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_get_timeout_dispatch_triggers94); if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = t;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:96:23: ( . )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AADL_STRING_LITERAL && LA1_0 <= WS)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g:96:23: .
						{
						_last = (BAST)input.LT(1);
						wildcard2=(BAST)input.LT(1);
						matchAny(input); if (state.failed) return retval;
						 
						if ( state.backtracking==1 )
						if ( _first_1==null ) _first_1 = wildcard2;

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

				if ( state.backtracking==1 ) {s.add(t.dupTree());}
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
	// $ANTLR end "get_timeout_dispatch_triggers"

	// Delegated rules



	public static final BitSet FOLLOW_get_timeout_dispatch_triggers_in_topdown75 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_get_timeout_dispatch_triggers94 = new BitSet(new long[]{0x0000000000000004L});
}
