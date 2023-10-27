// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/com.multitude.bless.codegeneration/Grammars/GetTimeoutDispatchTriggers.g 2023-10-27 12:45:01

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
		"ACTION", "ACTION_SUBCLAUSE", "AL", "AM", "AMPERSAND", "ARROW", "ASSERTION", 
		"ASSERTION_ANNEX", "ASSERTION_ENUMERATION", "ASSERTION_FUNCTION", "ASSIGN", 
		"AT_SIGN", "BEHAVIOR_TIME", "BI", "BLESS_SUBCLAUSE", "BOUND", "BOX", "CARET", 
		"COLON", "COLON_TILDE", "COMMA", "COMMACOMMA", "COMMADOT", "CONDITION", 
		"CONDITIONAL_ASSERTION_FUNCTION", "CVP", "DESTINATION", "DIGIT", "DIVIDE", 
		"DOLLAR", "DOT", "DOTCOMMA", "DOTDOT", "DOUBLE_COLON", "DOUBLE_QUOTE", 
		"DO_NOT_PROVE", "DUMMY", "EMPTY_CURLY", "EQ", "EXCLAMATION", "EXP", "EXPONENT", 
		"GT", "GUARD", "HEX_DIGIT", "ID", "IMP", "INVARIANT", "INVOKE", "LABEL", 
		"LASS", "LBRACKET", "LCON", "LCURLY", "LITERAL_abs", "LITERAL_all", "LITERAL_and", 
		"LITERAL_any", "LITERAL_are", "LITERAL_array", "LITERAL_assert", "LITERAL_availability", 
		"LITERAL_base", "LITERAL_binding", "LITERAL_boolean", "LITERAL_bound", 
		"LITERAL_call", "LITERAL_calls", "LITERAL_case", "LITERAL_catch", "LITERAL_complete", 
		"LITERAL_computation", "LITERAL_constant", "LITERAL_count", "LITERAL_declare", 
		"LITERAL_def", "LITERAL_delay", "LITERAL_dispatch", "LITERAL_div", "LITERAL_do", 
		"LITERAL_else", "LITERAL_enumeration", "LITERAL_exception", "LITERAL_exists", 
		"LITERAL_extends", "LITERAL_extension", "LITERAL_false", "LITERAL_fetchadd", 
		"LITERAL_fetchand", "LITERAL_fetchor", "LITERAL_fetchxor", "LITERAL_fi", 
		"LITERAL_final", "LITERAL_for", "LITERAL_forall", "LITERAL_fresh", "LITERAL_ghost", 
		"LITERAL_if", "LITERAL_iff", "LITERAL_implies", "LITERAL_in", "LITERAL_initial", 
		"LITERAL_internal", "LITERAL_invariant", "LITERAL_inverse", "LITERAL_is", 
		"LITERAL_lower_bound", "LITERAL_mod", "LITERAL_nonvolatile", "LITERAL_not", 
		"LITERAL_now", "LITERAL_null", "LITERAL_numberof", "LITERAL_of", "LITERAL_on", 
		"LITERAL_or", "LITERAL_post", "LITERAL_pre", "LITERAL_product", "LITERAL_quantity", 
		"LITERAL_range", "LITERAL_record", "LITERAL_rem", "LITERAL_representation", 
		"LITERAL_returns", "LITERAL_round", "LITERAL_scalar", "LITERAL_self", 
		"LITERAL_setmode", "LITERAL_shared", "LITERAL_skip", "LITERAL_spread", 
		"LITERAL_state", "LITERAL_states", "LITERAL_step", "LITERAL_string", "LITERAL_sum", 
		"LITERAL_swap", "LITERAL_that", "LITERAL_then", "LITERAL_throw", "LITERAL_throws", 
		"LITERAL_timeout", "LITERAL_to", "LITERAL_tops", "LITERAL_transitions", 
		"LITERAL_true", "LITERAL_truncate", "LITERAL_type", "LITERAL_union", "LITERAL_units", 
		"LITERAL_until", "LITERAL_updated", "LITERAL_upper_bound", "LITERAL_variables", 
		"LITERAL_variant", "LITERAL_when", "LITERAL_which", "LITERAL_while", "LITERAL_whole", 
		"LITERAL_with", "LITERAL_xor", "LPAREN", "LT", "LTE_STRING", "LT_STRING", 
		"MINUS", "MT_STRING", "NEQ", "NUMBER", "OBLIGATION", "OCTOTHORPE", "OLD_NEQ", 
		"P", "PARAMETERS", "PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT_INPUT", 
		"PORT_OUTPUT", "PREDICATE_RELATION", "Q", "QQ", "QUANTITY", "QUESTION", 
		"RASS", "RBRACKET", "RCON", "RCURLY", "RECORD_TERM", "ROOT_DECLARATION", 
		"RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", "STOP", "SUBPROGRAM_INVOCATION", 
		"TICK", "TILDE", "TIMES", "TRANSITION", "TYPE_LIBRARY", "UNARY_MINUS", 
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
	public static final int ARROW=11;
	public static final int ASSERTION=12;
	public static final int ASSERTION_ANNEX=13;
	public static final int ASSERTION_ENUMERATION=14;
	public static final int ASSERTION_FUNCTION=15;
	public static final int ASSIGN=16;
	public static final int AT_SIGN=17;
	public static final int BEHAVIOR_TIME=18;
	public static final int BI=19;
	public static final int BLESS_SUBCLAUSE=20;
	public static final int BOUND=21;
	public static final int BOX=22;
	public static final int CARET=23;
	public static final int COLON=24;
	public static final int COLON_TILDE=25;
	public static final int COMMA=26;
	public static final int COMMACOMMA=27;
	public static final int COMMADOT=28;
	public static final int CONDITION=29;
	public static final int CONDITIONAL_ASSERTION_FUNCTION=30;
	public static final int CVP=31;
	public static final int DESTINATION=32;
	public static final int DIGIT=33;
	public static final int DIVIDE=34;
	public static final int DOLLAR=35;
	public static final int DOT=36;
	public static final int DOTCOMMA=37;
	public static final int DOTDOT=38;
	public static final int DOUBLE_COLON=39;
	public static final int DOUBLE_QUOTE=40;
	public static final int DO_NOT_PROVE=41;
	public static final int DUMMY=42;
	public static final int EMPTY_CURLY=43;
	public static final int EQ=44;
	public static final int EXCLAMATION=45;
	public static final int EXP=46;
	public static final int EXPONENT=47;
	public static final int GT=48;
	public static final int GUARD=49;
	public static final int HEX_DIGIT=50;
	public static final int ID=51;
	public static final int IMP=52;
	public static final int INVARIANT=53;
	public static final int INVOKE=54;
	public static final int LABEL=55;
	public static final int LASS=56;
	public static final int LBRACKET=57;
	public static final int LCON=58;
	public static final int LCURLY=59;
	public static final int LITERAL_abs=60;
	public static final int LITERAL_all=61;
	public static final int LITERAL_and=62;
	public static final int LITERAL_any=63;
	public static final int LITERAL_are=64;
	public static final int LITERAL_array=65;
	public static final int LITERAL_assert=66;
	public static final int LITERAL_availability=67;
	public static final int LITERAL_base=68;
	public static final int LITERAL_binding=69;
	public static final int LITERAL_boolean=70;
	public static final int LITERAL_bound=71;
	public static final int LITERAL_call=72;
	public static final int LITERAL_calls=73;
	public static final int LITERAL_case=74;
	public static final int LITERAL_catch=75;
	public static final int LITERAL_complete=76;
	public static final int LITERAL_computation=77;
	public static final int LITERAL_constant=78;
	public static final int LITERAL_count=79;
	public static final int LITERAL_declare=80;
	public static final int LITERAL_def=81;
	public static final int LITERAL_delay=82;
	public static final int LITERAL_dispatch=83;
	public static final int LITERAL_div=84;
	public static final int LITERAL_do=85;
	public static final int LITERAL_else=86;
	public static final int LITERAL_enumeration=87;
	public static final int LITERAL_exception=88;
	public static final int LITERAL_exists=89;
	public static final int LITERAL_extends=90;
	public static final int LITERAL_extension=91;
	public static final int LITERAL_false=92;
	public static final int LITERAL_fetchadd=93;
	public static final int LITERAL_fetchand=94;
	public static final int LITERAL_fetchor=95;
	public static final int LITERAL_fetchxor=96;
	public static final int LITERAL_fi=97;
	public static final int LITERAL_final=98;
	public static final int LITERAL_for=99;
	public static final int LITERAL_forall=100;
	public static final int LITERAL_fresh=101;
	public static final int LITERAL_ghost=102;
	public static final int LITERAL_if=103;
	public static final int LITERAL_iff=104;
	public static final int LITERAL_implies=105;
	public static final int LITERAL_in=106;
	public static final int LITERAL_initial=107;
	public static final int LITERAL_internal=108;
	public static final int LITERAL_invariant=109;
	public static final int LITERAL_inverse=110;
	public static final int LITERAL_is=111;
	public static final int LITERAL_lower_bound=112;
	public static final int LITERAL_mod=113;
	public static final int LITERAL_nonvolatile=114;
	public static final int LITERAL_not=115;
	public static final int LITERAL_now=116;
	public static final int LITERAL_null=117;
	public static final int LITERAL_numberof=118;
	public static final int LITERAL_of=119;
	public static final int LITERAL_on=120;
	public static final int LITERAL_or=121;
	public static final int LITERAL_post=122;
	public static final int LITERAL_pre=123;
	public static final int LITERAL_product=124;
	public static final int LITERAL_quantity=125;
	public static final int LITERAL_range=126;
	public static final int LITERAL_record=127;
	public static final int LITERAL_rem=128;
	public static final int LITERAL_representation=129;
	public static final int LITERAL_returns=130;
	public static final int LITERAL_round=131;
	public static final int LITERAL_scalar=132;
	public static final int LITERAL_self=133;
	public static final int LITERAL_setmode=134;
	public static final int LITERAL_shared=135;
	public static final int LITERAL_skip=136;
	public static final int LITERAL_spread=137;
	public static final int LITERAL_state=138;
	public static final int LITERAL_states=139;
	public static final int LITERAL_step=140;
	public static final int LITERAL_string=141;
	public static final int LITERAL_sum=142;
	public static final int LITERAL_swap=143;
	public static final int LITERAL_that=144;
	public static final int LITERAL_then=145;
	public static final int LITERAL_throw=146;
	public static final int LITERAL_throws=147;
	public static final int LITERAL_timeout=148;
	public static final int LITERAL_to=149;
	public static final int LITERAL_tops=150;
	public static final int LITERAL_transitions=151;
	public static final int LITERAL_true=152;
	public static final int LITERAL_truncate=153;
	public static final int LITERAL_type=154;
	public static final int LITERAL_union=155;
	public static final int LITERAL_units=156;
	public static final int LITERAL_until=157;
	public static final int LITERAL_updated=158;
	public static final int LITERAL_upper_bound=159;
	public static final int LITERAL_variables=160;
	public static final int LITERAL_variant=161;
	public static final int LITERAL_when=162;
	public static final int LITERAL_which=163;
	public static final int LITERAL_while=164;
	public static final int LITERAL_whole=165;
	public static final int LITERAL_with=166;
	public static final int LITERAL_xor=167;
	public static final int LPAREN=168;
	public static final int LT=169;
	public static final int LTE_STRING=170;
	public static final int LT_STRING=171;
	public static final int MINUS=172;
	public static final int MT_STRING=173;
	public static final int NEQ=174;
	public static final int NUMBER=175;
	public static final int OBLIGATION=176;
	public static final int OCTOTHORPE=177;
	public static final int OLD_NEQ=178;
	public static final int P=179;
	public static final int PARAMETERS=180;
	public static final int PLUS=181;
	public static final int PLUS_ARROW=182;
	public static final int PLUS_EQUALS=183;
	public static final int PORT_INPUT=184;
	public static final int PORT_OUTPUT=185;
	public static final int PREDICATE_RELATION=186;
	public static final int Q=187;
	public static final int QQ=188;
	public static final int QUANTITY=189;
	public static final int QUESTION=190;
	public static final int RASS=191;
	public static final int RBRACKET=192;
	public static final int RCON=193;
	public static final int RCURLY=194;
	public static final int RECORD_TERM=195;
	public static final int ROOT_DECLARATION=196;
	public static final int RPAREN=197;
	public static final int S=198;
	public static final int SEMICOLON=199;
	public static final int SLCOMMENT=200;
	public static final int SOURCE=201;
	public static final int STOP=202;
	public static final int SUBPROGRAM_INVOCATION=203;
	public static final int TICK=204;
	public static final int TILDE=205;
	public static final int TIMES=206;
	public static final int TRANSITION=207;
	public static final int TYPE_LIBRARY=208;
	public static final int UNARY_MINUS=209;
	public static final int UNIT_FORMULA=210;
	public static final int UNIT_LIBRARY=211;
	public static final int UNIT_NAME=212;
	public static final int VALUE=213;
	public static final int VARIABLE_DECLARATION=214;
	public static final int VERT=215;
	public static final int WS=216;

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
