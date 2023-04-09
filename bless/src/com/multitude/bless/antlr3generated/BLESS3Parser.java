// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g 2023-04-08 21:25:23

//copyright 2023 Multitude Corporation
package com.multitude.bless.antlr3generated;
import java.util.HashMap;
import java.util.Vector;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.app.Global;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.record.ThreadRecord;
import com.multitude.bless.record.DataRecord;
import com.multitude.bless.record.SubprogramRecord;
import com.multitude.bless.record.PropertySetRecord;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class BLESS3Parser extends Parser {
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
		"INVARIANT", "INVOKE", "IP_NAME", "IP_PE", "IP_PRED", "LABEL", "LASS", 
		"LBRACKET", "LCON", "LCURLY", "LITERAL_Assertion", "LITERAL_Invariant", 
		"LITERAL_Postcondition", "LITERAL_Precondition", "LITERAL_Typed", "LITERAL_aadlboolean", 
		"LITERAL_aadlinteger", "LITERAL_aadlreal", "LITERAL_aadlstring", "LITERAL_abs", 
		"LITERAL_access", "LITERAL_all", "LITERAL_and", "LITERAL_any", "LITERAL_applies", 
		"LITERAL_are", "LITERAL_array", "LITERAL_assert", "LITERAL_availability", 
		"LITERAL_base", "LITERAL_binding", "LITERAL_boolean", "LITERAL_bound", 
		"LITERAL_call", "LITERAL_calls", "LITERAL_case", "LITERAL_catch", "LITERAL_classifier", 
		"LITERAL_complete", "LITERAL_component", "LITERAL_computation", "LITERAL_connection", 
		"LITERAL_connections", "LITERAL_constant", "LITERAL_count", "LITERAL_declare", 
		"LITERAL_def", "LITERAL_delay", "LITERAL_dispatch", "LITERAL_div", "LITERAL_do", 
		"LITERAL_else", "LITERAL_enumeration", "LITERAL_exception", "LITERAL_exists", 
		"LITERAL_extends", "LITERAL_extension", "LITERAL_false", "LITERAL_feature", 
		"LITERAL_fetchadd", "LITERAL_fetchand", "LITERAL_fetchor", "LITERAL_fetchxor", 
		"LITERAL_fi", "LITERAL_final", "LITERAL_flow", "LITERAL_for", "LITERAL_forall", 
		"LITERAL_fresh", "LITERAL_ghost", "LITERAL_if", "LITERAL_iff", "LITERAL_implementation", 
		"LITERAL_implies", "LITERAL_in", "LITERAL_inherit", "LITERAL_initial", 
		"LITERAL_internal", "LITERAL_invariant", "LITERAL_inverse", "LITERAL_is", 
		"LITERAL_list", "LITERAL_lower_bound", "LITERAL_mod", "LITERAL_mode", 
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
		"NUMBER", "OBLIGATION", "OCTOTHORPE", "OLD_NEQ", "ON", "P", "PARAMETER", 
		"PARAMETERS", "PLUS", "PLUS_ARROW", "PLUS_EQUALS", "PORT", "PORT_INPUT", 
		"PORT_OUTPUT", "PREDICATE_RELATION", "PROCEDURE", "Q", "QCLREF", "QCREF", 
		"QQ", "QUANTITY", "QUESTION", "RASS", "RBRACKET", "RCON", "RCURLY", "RECORD_TERM", 
		"ROOT_DECLARATION", "RPAREN", "S", "SEMICOLON", "SLCOMMENT", "SOURCE", 
		"START", "START_ASSERTION_PROPERTY", "STOP", "SUBPROGRAM_INVOCATION", 
		"TICK", "TILDE", "TIMES", "TOP", "TRANSITION", "TRIGGER", "TYPE", "TYPE_LIBRARY", 
		"TYPE_OPERATOR", "TYPE_OPERATOR_INVOCATION", "UNARY_MINUS", "UNIT_FORMULA", 
		"UNIT_LIBRARY", "UNIT_NAME", "VALUE", "VARIABLE_DECLARATION", "VERT", 
		"WS"
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
	public static final int INVARIANT=62;
	public static final int INVOKE=63;
	public static final int IP_NAME=64;
	public static final int IP_PE=65;
	public static final int IP_PRED=66;
	public static final int LABEL=67;
	public static final int LASS=68;
	public static final int LBRACKET=69;
	public static final int LCON=70;
	public static final int LCURLY=71;
	public static final int LITERAL_Assertion=72;
	public static final int LITERAL_Invariant=73;
	public static final int LITERAL_Postcondition=74;
	public static final int LITERAL_Precondition=75;
	public static final int LITERAL_Typed=76;
	public static final int LITERAL_aadlboolean=77;
	public static final int LITERAL_aadlinteger=78;
	public static final int LITERAL_aadlreal=79;
	public static final int LITERAL_aadlstring=80;
	public static final int LITERAL_abs=81;
	public static final int LITERAL_access=82;
	public static final int LITERAL_all=83;
	public static final int LITERAL_and=84;
	public static final int LITERAL_any=85;
	public static final int LITERAL_applies=86;
	public static final int LITERAL_are=87;
	public static final int LITERAL_array=88;
	public static final int LITERAL_assert=89;
	public static final int LITERAL_availability=90;
	public static final int LITERAL_base=91;
	public static final int LITERAL_binding=92;
	public static final int LITERAL_boolean=93;
	public static final int LITERAL_bound=94;
	public static final int LITERAL_call=95;
	public static final int LITERAL_calls=96;
	public static final int LITERAL_case=97;
	public static final int LITERAL_catch=98;
	public static final int LITERAL_classifier=99;
	public static final int LITERAL_complete=100;
	public static final int LITERAL_component=101;
	public static final int LITERAL_computation=102;
	public static final int LITERAL_connection=103;
	public static final int LITERAL_connections=104;
	public static final int LITERAL_constant=105;
	public static final int LITERAL_count=106;
	public static final int LITERAL_declare=107;
	public static final int LITERAL_def=108;
	public static final int LITERAL_delay=109;
	public static final int LITERAL_dispatch=110;
	public static final int LITERAL_div=111;
	public static final int LITERAL_do=112;
	public static final int LITERAL_else=113;
	public static final int LITERAL_enumeration=114;
	public static final int LITERAL_exception=115;
	public static final int LITERAL_exists=116;
	public static final int LITERAL_extends=117;
	public static final int LITERAL_extension=118;
	public static final int LITERAL_false=119;
	public static final int LITERAL_feature=120;
	public static final int LITERAL_fetchadd=121;
	public static final int LITERAL_fetchand=122;
	public static final int LITERAL_fetchor=123;
	public static final int LITERAL_fetchxor=124;
	public static final int LITERAL_fi=125;
	public static final int LITERAL_final=126;
	public static final int LITERAL_flow=127;
	public static final int LITERAL_for=128;
	public static final int LITERAL_forall=129;
	public static final int LITERAL_fresh=130;
	public static final int LITERAL_ghost=131;
	public static final int LITERAL_if=132;
	public static final int LITERAL_iff=133;
	public static final int LITERAL_implementation=134;
	public static final int LITERAL_implies=135;
	public static final int LITERAL_in=136;
	public static final int LITERAL_inherit=137;
	public static final int LITERAL_initial=138;
	public static final int LITERAL_internal=139;
	public static final int LITERAL_invariant=140;
	public static final int LITERAL_inverse=141;
	public static final int LITERAL_is=142;
	public static final int LITERAL_list=143;
	public static final int LITERAL_lower_bound=144;
	public static final int LITERAL_mod=145;
	public static final int LITERAL_mode=146;
	public static final int LITERAL_modes=147;
	public static final int LITERAL_nonvolatile=148;
	public static final int LITERAL_not=149;
	public static final int LITERAL_now=150;
	public static final int LITERAL_null=151;
	public static final int LITERAL_numberof=152;
	public static final int LITERAL_of=153;
	public static final int LITERAL_on=154;
	public static final int LITERAL_or=155;
	public static final int LITERAL_package=156;
	public static final int LITERAL_parameter=157;
	public static final int LITERAL_pause=158;
	public static final int LITERAL_post=159;
	public static final int LITERAL_pre=160;
	public static final int LITERAL_private=161;
	public static final int LITERAL_product=162;
	public static final int LITERAL_property=163;
	public static final int LITERAL_provides=164;
	public static final int LITERAL_public=165;
	public static final int LITERAL_quantity=166;
	public static final int LITERAL_range=167;
	public static final int LITERAL_record=168;
	public static final int LITERAL_reference=169;
	public static final int LITERAL_rem=170;
	public static final int LITERAL_renames=171;
	public static final int LITERAL_representation=172;
	public static final int LITERAL_requires=173;
	public static final int LITERAL_returns=174;
	public static final int LITERAL_round=175;
	public static final int LITERAL_scalar=176;
	public static final int LITERAL_self=177;
	public static final int LITERAL_sequence=178;
	public static final int LITERAL_set=179;
	public static final int LITERAL_setmode=180;
	public static final int LITERAL_shared=181;
	public static final int LITERAL_skip=182;
	public static final int LITERAL_spread=183;
	public static final int LITERAL_state=184;
	public static final int LITERAL_states=185;
	public static final int LITERAL_step=186;
	public static final int LITERAL_stop=187;
	public static final int LITERAL_string=188;
	public static final int LITERAL_subcomponents=189;
	public static final int LITERAL_sum=190;
	public static final int LITERAL_swap=191;
	public static final int LITERAL_that=192;
	public static final int LITERAL_then=193;
	public static final int LITERAL_throw=194;
	public static final int LITERAL_throws=195;
	public static final int LITERAL_timeout=196;
	public static final int LITERAL_to=197;
	public static final int LITERAL_tops=198;
	public static final int LITERAL_transition=199;
	public static final int LITERAL_transitions=200;
	public static final int LITERAL_true=201;
	public static final int LITERAL_truncate=202;
	public static final int LITERAL_type=203;
	public static final int LITERAL_union=204;
	public static final int LITERAL_units=205;
	public static final int LITERAL_until=206;
	public static final int LITERAL_updated=207;
	public static final int LITERAL_upper_bound=208;
	public static final int LITERAL_variables=209;
	public static final int LITERAL_variant=210;
	public static final int LITERAL_when=211;
	public static final int LITERAL_which=212;
	public static final int LITERAL_while=213;
	public static final int LITERAL_whole=214;
	public static final int LITERAL_with=215;
	public static final int LITERAL_xor=216;
	public static final int LPAREN=217;
	public static final int LT=218;
	public static final int LTE_STRING=219;
	public static final int LT_STRING=220;
	public static final int MINUS=221;
	public static final int MT_STRING=222;
	public static final int NEQ=223;
	public static final int NUMBER=224;
	public static final int OBLIGATION=225;
	public static final int OCTOTHORPE=226;
	public static final int OLD_NEQ=227;
	public static final int ON=228;
	public static final int P=229;
	public static final int PARAMETER=230;
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
	public static final int QCLREF=241;
	public static final int QCREF=242;
	public static final int QQ=243;
	public static final int QUANTITY=244;
	public static final int QUESTION=245;
	public static final int RASS=246;
	public static final int RBRACKET=247;
	public static final int RCON=248;
	public static final int RCURLY=249;
	public static final int RECORD_TERM=250;
	public static final int ROOT_DECLARATION=251;
	public static final int RPAREN=252;
	public static final int S=253;
	public static final int SEMICOLON=254;
	public static final int SLCOMMENT=255;
	public static final int SOURCE=256;
	public static final int START=257;
	public static final int START_ASSERTION_PROPERTY=258;
	public static final int STOP=259;
	public static final int SUBPROGRAM_INVOCATION=260;
	public static final int TICK=261;
	public static final int TILDE=262;
	public static final int TIMES=263;
	public static final int TOP=264;
	public static final int TRANSITION=265;
	public static final int TRIGGER=266;
	public static final int TYPE=267;
	public static final int TYPE_LIBRARY=268;
	public static final int TYPE_OPERATOR=269;
	public static final int TYPE_OPERATOR_INVOCATION=270;
	public static final int UNARY_MINUS=271;
	public static final int UNIT_FORMULA=272;
	public static final int UNIT_LIBRARY=273;
	public static final int UNIT_NAME=274;
	public static final int VALUE=275;
	public static final int VARIABLE_DECLARATION=276;
	public static final int VERT=277;
	public static final int WS=278;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BLESS3Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BLESS3Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return BLESS3Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Token tok = null;
	public boolean recognitionErrorOccurred = false;    //did a parse error occur?
	public static int countRecognitionErrors = 1; //accumulates count of recognition errors
	public static Vector<String> error_messages = new Vector<String>();

	//MUST SET currentPackageRecord BEFORE USE
	public PackageRecord currentPackageRecord = null;  //created by package_spec
	public PropertySetRecord currentPropertySetRecord = null;  //created by property_set
	public ParseRecord currentParseRecord = null;  //either currentPackageRecord or currentPropertySetRecord
	//public boolean putAssertionsIntoMap = true;  //put Assertions with labels into Proof.label_assertion_map?
	boolean saidTypeError = false;  //has a type exception already happened
	public String fileName = null;

	int startingLine = 0; //starting line of sublanguage in AADL file
	static int staticLine=0;  //used by BAST constructor

	  public void 
	setStartingLine(int line) //sets starting line
	  {
	  startingLine = line;
	  staticLine = line;
	  }

	  public int
	getStartingLine()
	  {
	  return startingLine;
	  }

	  public static int
	getStaticStartingLine()
	  {
	  return staticLine;
	  }
	  
	 
	public void reportError(RecognitionException ex, BAST start)
	  {
	  if (start!=null)
	    if (start.getParent()!=null)
	      ((BAST)start.getParent()).showParseTree("parent of "+start.getText());
	    else
	      start.showParseTree(start.getText());
	  reportError(ex);     
	  }  //end of reportError(RecognitionException ex, BAST start)

	public void reportError(RecognitionException ex)
	  {
	  if ((currentPackageRecord != null) && (currentPackageRecord.packageID != null))
	    Dump.it("In Package "+currentPackageRecord.packageID);
	  if ((currentPackageRecord != null) && (currentPackageRecord.file != null))
	    Dump.it("In File "+currentPackageRecord.file.getName());
	  else if (fileName != null)
	    Dump.it("In File "+fileName);
	  Dump.it("BLESS Syntax Error #"+
	    Integer.toString(countRecognitionErrors));
	  error_messages.add(getErrorHeader(ex));  
	  Dump.it("Some "+Global.dope+", made another "+
	     (Global.kindMessages?"unfortunate":"stupid")+" grammatical mistake. \n"+
	      "We know this because the token we\'re trying to parse has token-type \""+
	      ((ex.getUnexpectedType()>0)&&(ex.getUnexpectedType()<tokenNames.length)?tokenNames[ex.getUnexpectedType()]:Integer.toString(ex.getUnexpectedType()))+
	      "\" "+
	      (ex.token!=null?"having text \""+ex.token.getText()+"\"":"")+"\n"+
	      "  which is not among the permitted token types here on line "+
	      (ex.token!=null?ex.token.getLine():"null ex.token"));
	//  Dump.it("This "+Global.dope+" may not be you, but you must fix it.");
	  if ((ex.node!=null)&&(ex.node instanceof BAST))
	    ((BAST)ex.node).showParseTree(((BAST)ex.node).getText());
	  int x=5;
	  if (ex instanceof UnwantedTokenException)
	    {
	    UnwantedTokenException ute = (UnwantedTokenException)ex;
	    Dump.it("Expecting:  "+tokenNames[ute.expecting]);
	    Dump.it("\nHint: Don\'t include units for numeric literals in BLESS::Assertion property strings.\n");
	    }
	  recognitionErrorOccurred = true;
	  ex.line = ex.line+startingLine;
	  Dump.it("offending text = \""+input.toString()+"\"");
	  Dump.it(getErrorHeader(ex));
	  if (countRecognitionErrors<Global.YouIdiotReportLimit)
	    {
	    ex.printStackTrace();
	    }
	  else
	    {
	    Dump.it(countRecognitionErrors+" recognition errors occurred; divide by zero to stop runaway parser");
	    x=(x+x)/(x-5);
	    }
	  countRecognitionErrors++;
	//  // Global.stopProof = true; 
	  } //end of reportError

	public int errorCount = 0;
	public final int errorLimit=3;

	//REPLACE THIS WITH LOOK-UP OF OSATE RENAMES CLAUSE
	public String timeAlias = "T";

	//public void emitErrorMessage(String msg) 
	//  {
	//  System.err.println(msg);
	//  Dump.it(msg);
	//  }

	public void recover(IntStream input, RecognitionException re) {}  
	  


	public static class relation_symbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "relation_symbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:595:1: relation_symbol : ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS );
	public final BLESS3Parser.relation_symbol_return relation_symbol() throws RecognitionException {
		BLESS3Parser.relation_symbol_return retval = new BLESS3Parser.relation_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set1=null;

		BAST set1_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:596:3: ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set1=input.LT(1);
			if ( (input.LA(1) >= AL && input.LA(1) <= AM)||input.LA(1)==EQ||input.LA(1)==GT||input.LA(1)==LT||input.LA(1)==NEQ||input.LA(1)==OLD_NEQ||input.LA(1)==PLUS_EQUALS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set1));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation_symbol"


	public static class range_symbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "range_symbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:1: range_symbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.range_symbol_return range_symbol() throws RecognitionException {
		BLESS3Parser.range_symbol_return retval = new BLESS3Parser.range_symbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set2=null;

		BAST set2_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:14: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set2=input.LT(1);
			if ( (input.LA(1) >= COMMACOMMA && input.LA(1) <= COMMADOT)||(input.LA(1) >= DOTCOMMA && input.LA(1) <= DOTDOT) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set2));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range_symbol"


	public static class identifier_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:1: identifier : ID ;
	public final BLESS3Parser.identifier_return identifier() throws RecognitionException {
		BLESS3Parser.identifier_return retval = new BLESS3Parser.identifier_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID3=null;

		BAST ID3_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:613:3: ( ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:613:5: ID
			{
			root_0 = (BAST)adaptor.nil();


			ID3=(Token)match(input,ID,FOLLOW_ID_in_identifier2358); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID3_tree = (BAST)adaptor.create(ID3);
			adaptor.addChild(root_0, ID3_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re,(BAST)retval.getTree()); Dump.it("\nYou may be using a reserved word inappropriately.\n");throw(re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class unitLibrary_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:619:1: unitLibrary : (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) ;
	public final BLESS3Parser.unitLibrary_return unitLibrary() throws RecognitionException {
		BLESS3Parser.unitLibrary_return retval = new BLESS3Parser.unitLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_unitDeclarations=null;
		RuleReturnScope unitDeclarations = null;
		RewriteRuleSubtreeStream stream_unitDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule unitDeclaration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:619:12: ( (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:620:3: (unitDeclarations+= unitDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:620:19: (unitDeclarations+= unitDeclaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DIVIDE||LA1_0==ID||LA1_0==LITERAL_base||LA1_0==LITERAL_extension) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:620:19: unitDeclarations+= unitDeclaration
					{
					pushFollow(FOLLOW_unitDeclaration_in_unitLibrary2381);
					unitDeclarations=unitDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitDeclaration.add(unitDeclarations.getTree());
					if (list_unitDeclarations==null) list_unitDeclarations=new ArrayList<Object>();
					list_unitDeclarations.add(unitDeclarations.getTree());
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// AST REWRITE
			// elements: unitDeclarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: unitDeclarations
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_unitDeclarations=new RewriteRuleSubtreeStream(adaptor,"token unitDeclarations",list_unitDeclarations);
			root_0 = (BAST)adaptor.nil();
			// 621:5: -> ^( UNIT_LIBRARY ( $unitDeclarations)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:621:8: ^( UNIT_LIBRARY ( $unitDeclarations)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_LIBRARY, "UNIT_LIBRARY"), root_1);
				if ( !(stream_unitDeclarations.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_unitDeclarations.hasNext() ) {
					adaptor.addChild(root_1, stream_unitDeclarations.nextTree());
				}
				stream_unitDeclarations.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitLibrary"


	public static class unitName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:624:1: unitName : (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) ;
	public final BLESS3Parser.unitName_return unitName() throws RecognitionException {
		BLESS3Parser.unitName_return retval = new BLESS3Parser.unitName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lt=null;
		Token id=null;
		Token GT4=null;
		Token longname=null;
		List<Object> list_longname=null;

		BAST lt_tree=null;
		BAST id_tree=null;
		BAST GT4_tree=null;
		BAST longname_tree=null;
		RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:625:3: ( (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:3: (lt= LT (longname+= ID )+ GT )? id= ID
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:3: (lt= LT (longname+= ID )+ GT )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==LT) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:5: lt= LT (longname+= ID )+ GT
					{
					lt=(Token)match(input,LT,FOLLOW_LT_in_unitName2420); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT.add(lt);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:11: (longname+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:12: longname+= ID
							{
							longname=(Token)match(input,ID,FOLLOW_ID_in_unitName2425); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(longname);

							if (list_longname==null) list_longname=new ArrayList<Object>();
							list_longname.add(longname);
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

					GT4=(Token)match(input,GT,FOLLOW_GT_in_unitName2429); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT.add(GT4);

					}
					break;

			}

			id=(Token)match(input,ID,FOLLOW_ID_in_unitName2436); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// AST REWRITE
			// elements: longname, id
			// token labels: id
			// rule labels: retval
			// token list labels: longname
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_longname=new RewriteRuleTokenStream(adaptor,"token longname", list_longname);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 627:5: -> ^( UNIT_NAME $id ( $longname)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:627:8: ^( UNIT_NAME $id ( $longname)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_NAME, "UNIT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:627:26: ( $longname)*
				while ( stream_longname.hasNext() ) {
					adaptor.addChild(root_1, stream_longname.nextNode());
				}
				stream_longname.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitName"


	public static class unitFormula_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitFormula"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:630:1: unitFormula : ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) );
	public final BLESS3Parser.unitFormula_return unitFormula() throws RecognitionException {
		BLESS3Parser.unitFormula_return retval = new BLESS3Parser.unitFormula_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token slash=null;
		Token top=null;
		Token bottom=null;
		List<Object> list_top=null;
		List<Object> list_bottom=null;

		BAST slash_tree=null;
		BAST top_tree=null;
		BAST bottom_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:630:12: ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ID) ) {
				alt8=1;
			}
			else if ( (LA8_0==DIVIDE) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:3: (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )?
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:6: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:6: top+= ID
							{
							top=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2468); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(top);

							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:12: (slash= DIVIDE (bottom+= ID )+ )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==DIVIDE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:14: slash= DIVIDE (bottom+= ID )+
							{
							slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2475); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:33: (bottom+= ID )+
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
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:33: bottom+= ID
									{
									bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2479); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_ID.add(bottom);

									if (list_bottom==null) list_bottom=new ArrayList<Object>();
									list_bottom.add(bottom);
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

							}
							break;

					}

					// AST REWRITE
					// elements: slash, top, bottom
					// token labels: slash
					// rule labels: retval
					// token list labels: top, bottom
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_slash=new RewriteRuleTokenStream(adaptor,"token slash",slash);
					RewriteRuleTokenStream stream_top=new RewriteRuleTokenStream(adaptor,"token top", list_top);
					RewriteRuleTokenStream stream_bottom=new RewriteRuleTokenStream(adaptor,"token bottom", list_bottom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 632:5: -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:632:8: ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_FORMULA, "UNIT_FORMULA"), root_1);
						if ( !(stream_top.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_top.hasNext() ) {
							adaptor.addChild(root_1, stream_top.nextNode());
						}
						stream_top.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:632:31: ( $slash)?
						if ( stream_slash.hasNext() ) {
							adaptor.addChild(root_1, stream_slash.nextNode());
						}
						stream_slash.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:632:39: ( $bottom)*
						while ( stream_bottom.hasNext() ) {
							adaptor.addChild(root_1, stream_bottom.nextNode());
						}
						stream_bottom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:3: slash= DIVIDE (bottom+= ID )+
					{
					slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2517); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:22: (bottom+= ID )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==ID) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:22: bottom+= ID
							{
							bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2521); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(bottom);

							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// AST REWRITE
					// elements: slash, bottom
					// token labels: slash
					// rule labels: retval
					// token list labels: bottom
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_slash=new RewriteRuleTokenStream(adaptor,"token slash",slash);
					RewriteRuleTokenStream stream_bottom=new RewriteRuleTokenStream(adaptor,"token bottom", list_bottom);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 635:5: -> ^( UNIT_FORMULA $slash ( $bottom)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:8: ^( UNIT_FORMULA $slash ( $bottom)+ )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_FORMULA, "UNIT_FORMULA"), root_1);
						adaptor.addChild(root_1, stream_slash.nextNode());
						if ( !(stream_bottom.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_bottom.hasNext() ) {
							adaptor.addChild(root_1, stream_bottom.nextNode());
						}
						stream_bottom.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitFormula"


	public static class unitDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final BLESS3Parser.unitDeclaration_return unitDeclaration() throws RecognitionException {
		BLESS3Parser.unitDeclaration_return retval = new BLESS3Parser.unitDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope rootDeclaration5 =null;
		ParserRuleReturnScope unitExtension6 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:16: ( rootDeclaration | unitExtension )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==DIVIDE||LA9_0==ID||LA9_0==LITERAL_base) ) {
				alt9=1;
			}
			else if ( (LA9_0==LITERAL_extension) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:639:3: rootDeclaration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration2554);
					rootDeclaration5=rootDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rootDeclaration5.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:639:21: unitExtension
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_unitExtension_in_unitDeclaration2558);
					unitExtension6=unitExtension();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unitExtension6.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitDeclaration"


	public static class rootDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "rootDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:642:1: rootDeclaration : (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) ;
	public final BLESS3Parser.rootDeclaration_return rootDeclaration() throws RecognitionException {
		BLESS3Parser.rootDeclaration_return retval = new BLESS3Parser.rootDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token base=null;
		Token lb=null;
		Token RBRACKET7=null;
		Token SEMICOLON8=null;
		Token kindWords=null;
		List<Object> list_kindWords=null;
		List<Object> list_factors=null;
		ParserRuleReturnScope formula =null;
		ParserRuleReturnScope unit =null;
		RuleReturnScope factors = null;
		BAST base_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET7_tree=null;
		BAST SEMICOLON8_tree=null;
		BAST kindWords_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_LITERAL_base=new RewriteRuleTokenStream(adaptor,"token LITERAL_base");
		RewriteRuleSubtreeStream stream_unitFormula=new RewriteRuleSubtreeStream(adaptor,"rule unitFormula");
		RewriteRuleSubtreeStream stream_unitName=new RewriteRuleSubtreeStream(adaptor,"rule unitName");
		RewriteRuleSubtreeStream stream_unitFactor=new RewriteRuleSubtreeStream(adaptor,"rule unitFactor");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:642:16: ( (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:3: (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:3: (base= LITERAL_base |formula= unitFormula )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==LITERAL_base) ) {
				alt10=1;
			}
			else if ( (LA10_0==DIVIDE||LA10_0==ID) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:5: base= LITERAL_base
					{
					base=(Token)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration2577); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_base.add(base);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:25: formula= unitFormula
					{
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration2583);
					formula=unitFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFormula.add(formula.getTree());
					}
					break;

			}

			lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration2589); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:68: (kindWords+= ID )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==ID) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:68: kindWords+= ID
					{
					kindWords=(Token)match(input,ID,FOLLOW_ID_in_rootDeclaration2593); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(kindWords);

					if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
					list_kindWords.add(kindWords);
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

			RBRACKET7=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_rootDeclaration2596); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET7);

			pushFollow(FOLLOW_unitName_in_rootDeclaration2603);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:24: (factors+= unitFactor )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:24: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_rootDeclaration2607);
					factors=unitFactor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFactor.add(factors.getTree());
					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTree());
					}
					break;

				default :
					break loop12;
				}
			}

			SEMICOLON8=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rootDeclaration2610); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON8);

			// AST REWRITE
			// elements: kindWords, formula, factors, unit, base, lb
			// token labels: lb, base
			// rule labels: unit, formula, retval
			// token list labels: kindWords
			// rule list labels: factors
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lb=new RewriteRuleTokenStream(adaptor,"token lb",lb);
			RewriteRuleTokenStream stream_base=new RewriteRuleTokenStream(adaptor,"token base",base);
			RewriteRuleTokenStream stream_kindWords=new RewriteRuleTokenStream(adaptor,"token kindWords", list_kindWords);
			RewriteRuleSubtreeStream stream_unit=new RewriteRuleSubtreeStream(adaptor,"rule unit",unit!=null?unit.getTree():null);
			RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula",formula!=null?formula.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_factors=new RewriteRuleSubtreeStream(adaptor,"token factors",list_factors);
			root_0 = (BAST)adaptor.nil();
			// 645:5: -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:645:8: ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ROOT_DECLARATION, "ROOT_DECLARATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:645:29: ( $base)?
				if ( stream_base.hasNext() ) {
					adaptor.addChild(root_1, stream_base.nextNode());
				}
				stream_base.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:645:36: ( $formula)?
				if ( stream_formula.hasNext() ) {
					adaptor.addChild(root_1, stream_formula.nextTree());
				}
				stream_formula.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:645:45: ^( $lb ( $kindWords)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_kindWords.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_kindWords.hasNext() ) {
					adaptor.addChild(root_2, stream_kindWords.nextNode());
				}
				stream_kindWords.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_unit.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:645:73: ( $factors)*
				while ( stream_factors.hasNext() ) {
					adaptor.addChild(root_1, stream_factors.nextTree());
				}
				stream_factors.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rootDeclaration"


	public static class unitExtension_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitExtension"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:648:1: unitExtension : LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !;
	public final BLESS3Parser.unitExtension_return unitExtension() throws RecognitionException {
		BLESS3Parser.unitExtension_return retval = new BLESS3Parser.unitExtension_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token root=null;
		Token LITERAL_extension9=null;
		Token SEMICOLON10=null;
		List<Object> list_factors=null;
		RuleReturnScope factors = null;
		BAST root_tree=null;
		BAST LITERAL_extension9_tree=null;
		BAST SEMICOLON10_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:648:14: ( LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:3: LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_extension9=(Token)match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension2660); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_extension9_tree = (BAST)adaptor.create(LITERAL_extension9);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_extension9_tree, root_0);
			}

			root=(Token)match(input,ID,FOLLOW_ID_in_unitExtension2665); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			root_tree = (BAST)adaptor.create(root);
			adaptor.addChild(root_0, root_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:37: (factors+= unitFactor )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:37: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension2669);
					factors=unitFactor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factors.getTree());

					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTree());
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

			SEMICOLON10=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_unitExtension2672); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitExtension"


	public static class mulDiv_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "mulDiv"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:652:1: mulDiv : ( TIMES | DIVIDE ) ;
	public final BLESS3Parser.mulDiv_return mulDiv() throws RecognitionException {
		BLESS3Parser.mulDiv_return retval = new BLESS3Parser.mulDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set11=null;

		BAST set11_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:652:7: ( ( TIMES | DIVIDE ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set11=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==TIMES ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set11));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mulDiv"


	public static class unitFactor_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unitFactor"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:1: unitFactor : c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) ;
	public final BLESS3Parser.unitFactor_return unitFactor() throws RecognitionException {
		BLESS3Parser.unitFactor_return retval = new BLESS3Parser.unitFactor_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token c=null;
		Token factor=null;
		ParserRuleReturnScope unit =null;
		ParserRuleReturnScope op =null;

		BAST c_tree=null;
		BAST factor_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_NUMBER=new RewriteRuleTokenStream(adaptor,"token NUMBER");
		RewriteRuleSubtreeStream stream_unitName=new RewriteRuleSubtreeStream(adaptor,"rule unitName");
		RewriteRuleSubtreeStream stream_mulDiv=new RewriteRuleSubtreeStream(adaptor,"rule mulDiv");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:11: (c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:656:3: c= COMMA unit= unitName op= mulDiv factor= NUMBER
			{
			c=(Token)match(input,COMMA,FOLLOW_COMMA_in_unitFactor2706); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(c);

			pushFollow(FOLLOW_unitName_in_unitFactor2710);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			pushFollow(FOLLOW_mulDiv_in_unitFactor2714);
			op=mulDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mulDiv.add(op.getTree());
			factor=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor2718); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NUMBER.add(factor);

			// AST REWRITE
			// elements: op, c, unit, factor
			// token labels: c, factor
			// rule labels: op, unit, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_factor=new RewriteRuleTokenStream(adaptor,"token factor",factor);
			RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op",op!=null?op.getTree():null);
			RewriteRuleSubtreeStream stream_unit=new RewriteRuleSubtreeStream(adaptor,"rule unit",unit!=null?unit.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 657:5: -> ^( $c $unit $op $factor)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:8: ^( $c $unit $op $factor)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_c.nextNode(), root_1);
				adaptor.addChild(root_1, stream_unit.nextTree());
				adaptor.addChild(root_1, stream_op.nextTree());
				adaptor.addChild(root_1, stream_factor.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitFactor"


	public static class typeLibrary_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "typeLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:1: typeLibrary : (decs+= typeDeclaration )+ ;
	public final BLESS3Parser.typeLibrary_return typeLibrary() throws RecognitionException {
		BLESS3Parser.typeLibrary_return retval = new BLESS3Parser.typeLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_decs=null;
		RuleReturnScope decs = null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:12: ( (decs+= typeDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:663:3: (decs+= typeDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:663:7: (decs+= typeDeclaration )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==LITERAL_type) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:663:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary2758);
					decs=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTree());
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeLibrary"


	public static class typeDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "typeDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:1: typeDeclaration : LITERAL_type ^id= ID LITERAL_is !ty= type ;
	public final BLESS3Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		BLESS3Parser.typeDeclaration_return retval = new BLESS3Parser.typeDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LITERAL_type12=null;
		Token LITERAL_is13=null;
		ParserRuleReturnScope ty =null;

		BAST id_tree=null;
		BAST LITERAL_type12_tree=null;
		BAST LITERAL_is13_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:16: ( LITERAL_type ^id= ID LITERAL_is !ty= type )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:3: LITERAL_type ^id= ID LITERAL_is !ty= type
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_type12=(Token)match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration2771); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_type12_tree = (BAST)adaptor.create(LITERAL_type12);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_type12_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_typeDeclaration2776); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			LITERAL_is13=(Token)match(input,LITERAL_is,FOLLOW_LITERAL_is_in_typeDeclaration2778); if (state.failed) return retval;
			pushFollow(FOLLOW_type_in_typeDeclaration2783);
			ty=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class type_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "type"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:670:1: type : ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null );
	public final BLESS3Parser.type_return type() throws RecognitionException {
		BLESS3Parser.type_return retval = new BLESS3Parser.type_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_boolean18=null;
		Token LITERAL_string19=null;
		Token LITERAL_null20=null;
		ParserRuleReturnScope enumerationType14 =null;
		ParserRuleReturnScope quantityType15 =null;
		ParserRuleReturnScope arrayType16 =null;
		ParserRuleReturnScope recordType17 =null;

		BAST LITERAL_boolean18_tree=null;
		BAST LITERAL_string19_tree=null;
		BAST LITERAL_null20_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:670:5: ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null )
			int alt15=7;
			switch ( input.LA(1) ) {
			case LITERAL_enumeration:
				{
				alt15=1;
				}
				break;
			case LITERAL_quantity:
				{
				alt15=2;
				}
				break;
			case LITERAL_array:
				{
				alt15=3;
				}
				break;
			case LITERAL_record:
			case LITERAL_union:
			case LITERAL_variant:
				{
				alt15=4;
				}
				break;
			case LITERAL_boolean:
				{
				alt15=5;
				}
				break;
			case LITERAL_string:
				{
				alt15=6;
				}
				break;
			case LITERAL_null:
				{
				alt15=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:671:3: enumerationType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationType_in_type2795);
					enumerationType14=enumerationType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationType14.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:5: quantityType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantityType_in_type2801);
					quantityType15=quantityType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantityType15.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:673:5: arrayType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type2807);
					arrayType16=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType16.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:674:5: recordType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type2813);
					recordType17=recordType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType17.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:675:5: LITERAL_boolean
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_boolean18=(Token)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type2819); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_boolean18_tree = (BAST)adaptor.create(LITERAL_boolean18);
					adaptor.addChild(root_0, LITERAL_boolean18_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:676:5: LITERAL_string
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_string19=(Token)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type2825); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_string19_tree = (BAST)adaptor.create(LITERAL_string19);
					adaptor.addChild(root_0, LITERAL_string19_tree);
					}

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:677:5: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null20=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type2831); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null20_tree = (BAST)adaptor.create(LITERAL_null20);
					adaptor.addChild(root_0, LITERAL_null20_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class typeOrReference_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "typeOrReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:680:1: typeOrReference : (ty= type |ref= ID );
	public final BLESS3Parser.typeOrReference_return typeOrReference() throws RecognitionException {
		BLESS3Parser.typeOrReference_return retval = new BLESS3Parser.typeOrReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ref=null;
		ParserRuleReturnScope ty =null;

		BAST ref_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:680:16: (ty= type |ref= ID )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==LITERAL_array||LA16_0==LITERAL_boolean||LA16_0==LITERAL_enumeration||LA16_0==LITERAL_null||LA16_0==LITERAL_quantity||LA16_0==LITERAL_record||LA16_0==LITERAL_string||LA16_0==LITERAL_union||LA16_0==LITERAL_variant) ) {
				alt16=1;
			}
			else if ( (LA16_0==ID) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:681:3: ty= type
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeOrReference2843);
					ty=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:681:13: ref= ID
					{
					root_0 = (BAST)adaptor.nil();


					ref=(Token)match(input,ID,FOLLOW_ID_in_typeOrReference2849); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ref_tree = (BAST)adaptor.create(ref);
					adaptor.addChild(root_0, ref_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeOrReference"


	public static class enumerationType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "enumerationType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:684:1: enumerationType : LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !;
	public final BLESS3Parser.enumerationType_return enumerationType() throws RecognitionException {
		BLESS3Parser.enumerationType_return retval = new BLESS3Parser.enumerationType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_enumeration21=null;
		Token LPAREN22=null;
		Token RPAREN23=null;
		Token defining_enumeration_literal=null;
		List<Object> list_defining_enumeration_literal=null;

		BAST LITERAL_enumeration21_tree=null;
		BAST LPAREN22_tree=null;
		BAST RPAREN23_tree=null;
		BAST defining_enumeration_literal_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:684:16: ( LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:3: LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_enumeration21=(Token)match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType2862); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_enumeration21_tree = (BAST)adaptor.create(LITERAL_enumeration21);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_enumeration21_tree, root_0);
			}

			LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumerationType2865); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:60: (defining_enumeration_literal+= ID )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==ID) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:60: defining_enumeration_literal+= ID
					{
					defining_enumeration_literal=(Token)match(input,ID,FOLLOW_ID_in_enumerationType2870); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					defining_enumeration_literal_tree = (BAST)adaptor.create(defining_enumeration_literal);
					adaptor.addChild(root_0, defining_enumeration_literal_tree);
					}

					if (list_defining_enumeration_literal==null) list_defining_enumeration_literal=new ArrayList<Object>();
					list_defining_enumeration_literal.add(defining_enumeration_literal);
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

			RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumerationType2873); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationType"


	public static class quantityType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantityType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:688:1: quantityType : q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )? ;
	public final BLESS3Parser.quantityType_return quantityType() throws RecognitionException {
		BLESS3Parser.quantityType_return retval = new BLESS3Parser.quantityType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token q=null;
		Token unit=null;
		Token scalar=null;
		Token whole=null;
		Token dd=null;
		Token st=null;
		Token rep=null;
		Token representation=null;
		Token LBRACKET24=null;
		Token RBRACKET25=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope step =null;

		BAST q_tree=null;
		BAST unit_tree=null;
		BAST scalar_tree=null;
		BAST whole_tree=null;
		BAST dd_tree=null;
		BAST st_tree=null;
		BAST rep_tree=null;
		BAST representation_tree=null;
		BAST LBRACKET24_tree=null;
		BAST RBRACKET25_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:688:13: (q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:689:3: q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= QCLREF )?
			{
			root_0 = (BAST)adaptor.nil();


			q=(Token)match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType2889); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			q_tree = (BAST)adaptor.create(q);
			root_0 = (BAST)adaptor.becomeRoot(q_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:3: (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole )
			int alt18=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt18=1;
				}
				break;
			case LITERAL_scalar:
				{
				alt18=2;
				}
				break;
			case LITERAL_whole:
				{
				alt18=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:5: unit= ID
					{
					unit=(Token)match(input,ID,FOLLOW_ID_in_quantityType2899); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					unit_tree = (BAST)adaptor.create(unit);
					adaptor.addChild(root_0, unit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:15: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType2905); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					scalar_tree = (BAST)adaptor.create(scalar);
					adaptor.addChild(root_0, scalar_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:690:39: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType2911); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					whole_tree = (BAST)adaptor.create(whole);
					adaptor.addChild(root_0, whole_tree);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:691:3: ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LBRACKET) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:691:5: LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )?
					{
					LBRACKET24=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_quantityType2919); if (state.failed) return retval;
					pushFollow(FOLLOW_aNumber_in_quantityType2924);
					lb=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

					dd=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType2928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					dd_tree = (BAST)adaptor.create(dd);
					root_0 = (BAST)adaptor.becomeRoot(dd_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_quantityType2933);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					RBRACKET25=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_quantityType2935); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:692:3: (st= LITERAL_step ^step= aNumber )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==LITERAL_step) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:692:5: st= LITERAL_step ^step= aNumber
							{
							st=(Token)match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType2945); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							st_tree = (BAST)adaptor.create(st);
							root_0 = (BAST)adaptor.becomeRoot(st_tree, root_0);
							}

							pushFollow(FOLLOW_aNumber_in_quantityType2950);
							step=aNumber();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, step.getTree());

							}
							break;

					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:3: (rep= LITERAL_representation ^representation= QCLREF )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LITERAL_representation) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:5: rep= LITERAL_representation ^representation= QCLREF
					{
					rep=(Token)match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType2965); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					rep_tree = (BAST)adaptor.create(rep);
					root_0 = (BAST)adaptor.becomeRoot(rep_tree, root_0);
					}

					representation=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_quantityType2970); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					representation_tree = (BAST)adaptor.create(representation);
					adaptor.addChild(root_0, representation_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantityType"


	public static class arrayType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "arrayType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:1: arrayType : LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference ;
	public final BLESS3Parser.arrayType_return arrayType() throws RecognitionException {
		BLESS3Parser.arrayType_return retval = new BLESS3Parser.arrayType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_array26=null;
		Token LBRACKET27=null;
		Token RBRACKET28=null;
		Token LITERAL_of29=null;
		ParserRuleReturnScope array_ranges =null;
		ParserRuleReturnScope ty =null;

		BAST LITERAL_array26_tree=null;
		BAST LBRACKET27_tree=null;
		BAST RBRACKET28_tree=null;
		BAST LITERAL_of29_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:11: ( LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:697:3: LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_array26=(Token)match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType2989); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_array26_tree = (BAST)adaptor.create(LITERAL_array26);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_array26_tree, root_0);
			}

			LBRACKET27=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType2992); if (state.failed) return retval;
			pushFollow(FOLLOW_arrayRangeList_in_arrayType2997);
			array_ranges=arrayRangeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, array_ranges.getTree());

			RBRACKET28=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType2999); if (state.failed) return retval;
			LITERAL_of29=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType3002); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_of29_tree = (BAST)adaptor.create(LITERAL_of29);
			adaptor.addChild(root_0, LITERAL_of29_tree);
			}

			pushFollow(FOLLOW_typeOrReference_in_arrayType3006);
			ty=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayType"


	public static class arrayRangeList_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "arrayRangeList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:1: arrayRangeList :rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? ;
	public final BLESS3Parser.arrayRangeList_return arrayRangeList() throws RecognitionException {
		BLESS3Parser.arrayRangeList_return retval = new BLESS3Parser.arrayRangeList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA30=null;
		Token COMMA31=null;
		List<Object> list_rang=null;
		RuleReturnScope rang = null;
		BAST COMMA30_tree=null;
		BAST COMMA31_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:16: (rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:3: rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_arrayRange_in_arrayRangeList3022);
			rang=arrayRange();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

			if (list_rang==null) list_rang=new ArrayList<Object>();
			list_rang.add(rang.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:20: ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==COMMA) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:22: COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )*
					{
					COMMA30=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3026); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA30_tree = (BAST)adaptor.create(COMMA30);
					root_0 = (BAST)adaptor.becomeRoot(COMMA30_tree, root_0);
					}

					pushFollow(FOLLOW_arrayRange_in_arrayRangeList3031);
					rang=arrayRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

					if (list_rang==null) list_rang=new ArrayList<Object>();
					list_rang.add(rang.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:46: ( COMMA !rang+= arrayRange )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==COMMA) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:48: COMMA !rang+= arrayRange
							{
							COMMA31=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3035); if (state.failed) return retval;
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList3040);
							rang=arrayRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

							if (list_rang==null) list_rang=new ArrayList<Object>();
							list_rang.add(rang.getTree());
							}
							break;

						default :
							break loop22;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayRangeList"


	public static class arrayRange_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "arrayRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:1: arrayRange : lb= aNumber ( DOTDOT ^ub= aNumber )? ;
	public final BLESS3Parser.arrayRange_return arrayRange() throws RecognitionException {
		BLESS3Parser.arrayRange_return retval = new BLESS3Parser.arrayRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT32=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST DOTDOT32_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:12: (lb= aNumber ( DOTDOT ^ub= aNumber )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:14: lb= aNumber ( DOTDOT ^ub= aNumber )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_aNumber_in_arrayRange3060);
			lb=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:25: ( DOTDOT ^ub= aNumber )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==DOTDOT) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:27: DOTDOT ^ub= aNumber
					{
					DOTDOT32=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange3064); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT32_tree = (BAST)adaptor.create(DOTDOT32);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT32_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_arrayRange3069);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayRange"


	public static class recordType_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:706:1: recordType : ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !;
	public final BLESS3Parser.recordType_return recordType() throws RecognitionException {
		BLESS3Parser.recordType_return retval = new BLESS3Parser.recordType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set33=null;
		Token LPAREN34=null;
		Token RPAREN35=null;
		List<Object> list_fields=null;
		RuleReturnScope fields = null;
		BAST set33_tree=null;
		BAST LPAREN34_tree=null;
		BAST RPAREN35_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:706:12: ( ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:707:3: ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			set33=input.LT(1);
			set33=input.LT(1);
			if ( input.LA(1)==LITERAL_record||input.LA(1)==LITERAL_union||input.LA(1)==LITERAL_variant ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(set33), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_recordType3099); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:17: (fields+= recordField )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==ID) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:17: fields+= recordField
					{
					pushFollow(FOLLOW_recordField_in_recordType3104);
					fields=recordField();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fields.getTree());

					if (list_fields==null) list_fields=new ArrayList<Object>();
					list_fields.add(fields.getTree());
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

			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_recordType3107); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordType"


	public static class recordField_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:1: recordField : id= ID COLON ^ty= typeOrReference ;
	public final BLESS3Parser.recordField_return recordField() throws RecognitionException {
		BLESS3Parser.recordField_return retval = new BLESS3Parser.recordField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token COLON36=null;
		ParserRuleReturnScope ty =null;

		BAST id_tree=null;
		BAST COLON36_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:13: (id= ID COLON ^ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:3: id= ID COLON ^ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_recordField3125); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_recordField3127); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON36_tree = (BAST)adaptor.create(COLON36);
			root_0 = (BAST)adaptor.becomeRoot(COLON36_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_recordField3132);
			ty=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordField"


	public static class assertionLibrary_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertionLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:1: assertionLibrary : (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) ;
	public final BLESS3Parser.assertionLibrary_return assertionLibrary() throws RecognitionException {
		BLESS3Parser.assertionLibrary_return retval = new BLESS3Parser.assertionLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_assertion_list=null;
		ParserRuleReturnScope ghosts =null;
		RuleReturnScope assertion_list = null;
		RewriteRuleSubtreeStream stream_ghostVariables=new RewriteRuleSubtreeStream(adaptor,"rule ghostVariables");
		RewriteRuleSubtreeStream stream_namedAssertion=new RewriteRuleSubtreeStream(adaptor,"rule namedAssertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:17: ( (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:719:3: (ghosts= ghostVariables )? (assertion_list+= namedAssertion )*
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:719:3: (ghosts= ghostVariables )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LITERAL_ghost) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:719:5: ghosts= ghostVariables
					{
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary3152);
					ghosts=ghostVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ghostVariables.add(ghosts.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:17: (assertion_list+= namedAssertion )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==LASS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:17: assertion_list+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertionLibrary3161);
					assertion_list=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namedAssertion.add(assertion_list.getTree());
					if (list_assertion_list==null) list_assertion_list=new ArrayList<Object>();
					list_assertion_list.add(assertion_list.getTree());
					}
					break;

				default :
					break loop27;
				}
			}

			// AST REWRITE
			// elements: assertion_list, ghosts
			// token labels: 
			// rule labels: ghosts, retval
			// token list labels: 
			// rule list labels: assertion_list
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_ghosts=new RewriteRuleSubtreeStream(adaptor,"rule ghosts",ghosts!=null?ghosts.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_assertion_list=new RewriteRuleSubtreeStream(adaptor,"token assertion_list",list_assertion_list);
			root_0 = (BAST)adaptor.nil();
			// 721:3: -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:721:6: ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ANNEX, "ASSERTION_ANNEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:721:25: ( $ghosts)?
				if ( stream_ghosts.hasNext() ) {
					adaptor.addChild(root_1, stream_ghosts.nextTree());
				}
				stream_ghosts.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:721:34: ( $assertion_list)*
				while ( stream_assertion_list.hasNext() ) {
					adaptor.addChild(root_1, stream_assertion_list.nextTree());
				}
				stream_assertion_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionLibrary"


	public static class ghostVariables_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "ghostVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:1: ghostVariables : LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ ;
	public final BLESS3Parser.ghostVariables_return ghostVariables() throws RecognitionException {
		BLESS3Parser.ghostVariables_return retval = new BLESS3Parser.ghostVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_ghost37=null;
		Token LITERAL_variables38=null;
		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		BAST LITERAL_ghost37_tree=null;
		BAST LITERAL_variables38_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:3: ( LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:726:3: LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_ghost37=(Token)match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables3194); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_ghost37_tree = (BAST)adaptor.create(LITERAL_ghost37);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_ghost37_tree, root_0);
			}

			LITERAL_variables38=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_ghostVariables3197); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:726:39: (gv+= ghostVariable )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==LITERAL_def) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:726:39: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables3202);
					gv=ghostVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, gv.getTree());

					if (list_gv==null) list_gv=new ArrayList<Object>();
					list_gv.add(gv.getTree());
					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ghostVariables"


	public static class ghostVariable_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "ghostVariable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:1: ghostVariable : LITERAL_def ^id= ID TILDE !tod= typeOrReference ;
	public final BLESS3Parser.ghostVariable_return ghostVariable() throws RecognitionException {
		BLESS3Parser.ghostVariable_return retval = new BLESS3Parser.ghostVariable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LITERAL_def39=null;
		Token TILDE40=null;
		ParserRuleReturnScope tod =null;

		BAST id_tree=null;
		BAST LITERAL_def39_tree=null;
		BAST TILDE40_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:14: ( LITERAL_def ^id= ID TILDE !tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:3: LITERAL_def ^id= ID TILDE !tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_def39=(Token)match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable3215); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_def39_tree = (BAST)adaptor.create(LITERAL_def39);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_def39_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_ghostVariable3221); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE40=(Token)match(input,TILDE,FOLLOW_TILDE_in_ghostVariable3223); if (state.failed) return retval;
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable3228);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tod.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ghostVariable"


	public static class namedAssertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namedAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:733:1: namedAssertion : lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION ^( LABEL $id) $pred) -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {til!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> $lass;
	public final BLESS3Parser.namedAssertion_return namedAssertion() throws RecognitionException {
		BLESS3Parser.namedAssertion_return retval = new BLESS3Parser.namedAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lass=null;
		Token id=null;
		Token col=null;
		Token ret=null;
		Token assertionvariable=null;
		Token til=null;
		Token enumerationTy=null;
		Token COLON41=null;
		Token ASSIGN42=null;
		Token RASS43=null;
		ParserRuleReturnScope formals =null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;
		ParserRuleReturnScope enumeration =null;

		BAST lass_tree=null;
		BAST id_tree=null;
		BAST col_tree=null;
		BAST ret_tree=null;
		BAST assertionvariable_tree=null;
		BAST til_tree=null;
		BAST enumerationTy_tree=null;
		BAST COLON41_tree=null;
		BAST ASSIGN42_tree=null;
		BAST RASS43_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_TILDE=new RewriteRuleTokenStream(adaptor,"token TILDE");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");
		RewriteRuleSubtreeStream stream_variableList=new RewriteRuleSubtreeStream(adaptor,"rule variableList");
		RewriteRuleSubtreeStream stream_assertionEnumeration=new RewriteRuleSubtreeStream(adaptor,"rule assertionEnumeration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:733:15: (lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION ^( LABEL $id) $pred) -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {til!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> $lass)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:734:3: lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS
			{
			lass=(Token)match(input,LASS,FOLLOW_LASS_in_namedAssertion3245); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(lass);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:735:3: (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:735:5: id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3253); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			COLON41=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3255); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON41);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:736:5: ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==ID) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==TILDE) ) {
					int LA31_3 = input.LA(3);
					if ( (LA31_3==ID) ) {
						int LA31_4 = input.LA(4);
						if ( (LA31_4==PLUS_ARROW) ) {
							alt31=2;
						}
						else if ( (LA31_4==COLON||LA31_4==COMMA||LA31_4==LITERAL_returns) ) {
							alt31=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
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
					else if ( (LA31_3==LITERAL_array||LA31_3==LITERAL_boolean||LA31_3==LITERAL_enumeration||LA31_3==LITERAL_null||LA31_3==LITERAL_quantity||LA31_3==LITERAL_record||LA31_3==LITERAL_string||LA31_3==LITERAL_union||LA31_3==LITERAL_variant) ) {
						alt31=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 31, 3, input);
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
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA31_0==COLON||LA31_0==LITERAL_returns) ) {
				alt31=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:737:5: (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:737:12: (formals= variableList )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==ID) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:737:12: formals= variableList
							{
							pushFollow(FOLLOW_variableList_in_namedAssertion3270);
							formals=variableList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_variableList.add(formals.getTree());
							}
							break;

					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:738:7: (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==COLON) ) {
						alt30=1;
					}
					else if ( (LA30_0==LITERAL_returns) ) {
						alt30=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:739:7: col= COLON pred= predicate
							{
							col=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3290); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(col);

							pushFollow(FOLLOW_predicate_in_namedAssertion3295);
							pred=predicate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:741:7: ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue
							{
							ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion3315); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

							pushFollow(FOLLOW_typeOrReference_in_namedAssertion3319);
							tod=typeOrReference();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
							ASSIGN42=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namedAssertion3321); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN42);

							pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion3326);
							functionvalue=assertionFunctionValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
							}
							break;

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:5: assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration
					{
					assertionvariable=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3351); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(assertionvariable);

					til=(Token)match(input,TILDE,FOLLOW_TILDE_in_namedAssertion3355); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(til);

					enumerationTy=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3359); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(enumerationTy);

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion3363);
					enumeration=assertionEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertionEnumeration.add(enumeration.getTree());
					}
					break;

			}

			}

			RASS43=(Token)match(input,RASS,FOLLOW_RASS_in_namedAssertion3377); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS43);

			// AST REWRITE
			// elements: enumerationTy, lass, formals, assertionvariable, formals, id, id, functionvalue, id, pred, pred, tod, enumeration, functionvalue, id, til, tod, ret, id, ret
			// token labels: assertionvariable, ret, til, lass, id, enumerationTy
			// rule labels: pred, tod, functionvalue, formals, enumeration, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_assertionvariable=new RewriteRuleTokenStream(adaptor,"token assertionvariable",assertionvariable);
			RewriteRuleTokenStream stream_ret=new RewriteRuleTokenStream(adaptor,"token ret",ret);
			RewriteRuleTokenStream stream_til=new RewriteRuleTokenStream(adaptor,"token til",til);
			RewriteRuleTokenStream stream_lass=new RewriteRuleTokenStream(adaptor,"token lass",lass);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_enumerationTy=new RewriteRuleTokenStream(adaptor,"token enumerationTy",enumerationTy);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_tod=new RewriteRuleSubtreeStream(adaptor,"rule tod",tod!=null?tod.getTree():null);
			RewriteRuleSubtreeStream stream_functionvalue=new RewriteRuleSubtreeStream(adaptor,"rule functionvalue",functionvalue!=null?functionvalue.getTree():null);
			RewriteRuleSubtreeStream stream_formals=new RewriteRuleSubtreeStream(adaptor,"rule formals",formals!=null?formals.getTree():null);
			RewriteRuleSubtreeStream stream_enumeration=new RewriteRuleSubtreeStream(adaptor,"rule enumeration",enumeration!=null?enumeration.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 748:4: -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION ^( LABEL $id) $pred)
			if (id!=null&&formals==null&&col!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:45: ^( ASSERTION ^( LABEL $id) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:58: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 749:4: -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred)
			if (id!=null&&formals!=null&&col!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:45: ^( ASSERTION ^( LABEL $id) ^( PARAMETERS $formals) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:58: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:73: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 750:4: -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue)
			if (id!=null&&formals==null&&ret!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:45: ^( ASSERTION_FUNCTION ^( LABEL $id) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:67: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:82: ^( $ret $tod)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ret.nextNode(), root_2);
				adaptor.addChild(root_2, stream_tod.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_functionvalue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 751:4: -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
			if (id!=null&&formals!=null&&ret!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:45: ^( ASSERTION_FUNCTION ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:67: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:82: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:107: ^( $ret $tod)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ret.nextNode(), root_2);
				adaptor.addChild(root_2, stream_tod.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_functionvalue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 752:4: -> {til!=null}? ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
			if (til!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:752:21: ^( ASSERTION_ENUMERATION ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, "ASSERTION_ENUMERATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:752:46: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:752:61: ^( $til $assertionvariable $enumerationTy)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_til.nextNode(), root_2);
				adaptor.addChild(root_2, stream_assertionvariable.nextNode());
				adaptor.addChild(root_2, stream_enumerationTy.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_enumeration.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 753:4: -> $lass
			{
				adaptor.addChild(root_0, stream_lass.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedAssertion"


	public static class predicate_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "predicate"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:756:1: predicate : ex= expression -> $ex;
	public final BLESS3Parser.predicate_return predicate() throws RecognitionException {
		BLESS3Parser.predicate_return retval = new BLESS3Parser.predicate_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope ex =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:756:10: (ex= expression -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:756:13: ex= expression
			{
			pushFollow(FOLLOW_expression_in_predicate3663);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: ex
			// token labels: 
			// rule labels: ex, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 757:3: -> $ex
			{
				adaptor.addChild(root_0, stream_ex.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class variableList_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variableList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:760:1: variableList : first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? ;
	public final BLESS3Parser.variableList_return variableList() throws RecognitionException {
		BLESS3Parser.variableList_return retval = new BLESS3Parser.variableList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA44=null;
		Token COMMA45=null;
		List<Object> list_parameter=null;
		ParserRuleReturnScope first =null;
		RuleReturnScope parameter = null;
		BAST COMMA44_tree=null;
		BAST COMMA45_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:760:13: (first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:3: first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_variableList3684);
			first=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, first.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:18: ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMA) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:20: COMMA ^parameter+= variable ( COMMA !parameter+= variable )*
					{
					COMMA44=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3688); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA44_tree = (BAST)adaptor.create(COMMA44);
					root_0 = (BAST)adaptor.becomeRoot(COMMA44_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_variableList3693);
					parameter=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

					if (list_parameter==null) list_parameter=new ArrayList<Object>();
					list_parameter.add(parameter.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:47: ( COMMA !parameter+= variable )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==COMMA) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:49: COMMA !parameter+= variable
							{
							COMMA45=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3697); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_variableList3702);
							parameter=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTree());
							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableList"


	public static class variable_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:764:1: variable : id= ID TILDE ^tod= typeOrReference ;
	public final BLESS3Parser.variable_return variable() throws RecognitionException {
		BLESS3Parser.variable_return retval = new BLESS3Parser.variable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token TILDE46=null;
		ParserRuleReturnScope tod =null;

		BAST id_tree=null;
		BAST TILDE46_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:764:9: (id= ID TILDE ^tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:765:3: id= ID TILDE ^tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_variable3720); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE46=(Token)match(input,TILDE,FOLLOW_TILDE_in_variable3722); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TILDE46_tree = (BAST)adaptor.create(TILDE46);
			root_0 = (BAST)adaptor.becomeRoot(TILDE46_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_variable3727);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tod.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class assertionFunctionValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertionFunctionValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:768:1: assertionFunctionValue : ( conditionalAssertionFunction | expression );
	public final BLESS3Parser.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		BLESS3Parser.assertionFunctionValue_return retval = new BLESS3Parser.assertionFunctionValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalAssertionFunction47 =null;
		ParserRuleReturnScope expression48 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:768:23: ( conditionalAssertionFunction | expression )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==LBRACKET) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==ID) ) {
					alt34=2;
				}
				else if ( (LA34_1==LPAREN) ) {
					alt34=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA34_0==AADL_STRING_LITERAL||LA34_0==ID||LA34_0==LITERAL_abs||LA34_0==LITERAL_all||LA34_0==LITERAL_exists||LA34_0==LITERAL_false||(LA34_0 >= LITERAL_not && LA34_0 <= LITERAL_numberof)||LA34_0==LITERAL_product||LA34_0==LITERAL_round||LA34_0==LITERAL_self||LA34_0==LITERAL_sum||LA34_0==LITERAL_timeout||LA34_0==LITERAL_tops||(LA34_0 >= LITERAL_true && LA34_0 <= LITERAL_truncate)||LA34_0==LPAREN||LA34_0==MINUS||LA34_0==NUMBER||LA34_0==OCTOTHORPE||(LA34_0 >= QCLREF && LA34_0 <= QCREF)) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:769:2: conditionalAssertionFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue3738);
					conditionalAssertionFunction47=conditionalAssertionFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAssertionFunction47.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:770:4: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assertionFunctionValue3744);
					expression48=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression48.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionFunctionValue"


	public static class conditionalAssertionFunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conditionalAssertionFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:1: conditionalAssertionFunction : LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) ;
	public final BLESS3Parser.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		BLESS3Parser.conditionalAssertionFunction_return retval = new BLESS3Parser.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET49=null;
		Token COMMA50=null;
		Token RBRACKET51=null;
		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		BAST LBRACKET49_tree=null;
		BAST COMMA50_tree=null;
		BAST RBRACKET51_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_conditionValuePair=new RewriteRuleSubtreeStream(adaptor,"rule conditionValuePair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:29: ( LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:2: LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET
			{
			LBRACKET49=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_conditionalAssertionFunction3757); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET49);

			pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction3761);
			cvp=conditionValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
			if (list_cvp==null) list_cvp=new ArrayList<Object>();
			list_cvp.add(cvp.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:35: ( COMMA cvp+= conditionValuePair )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==COMMA) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:37: COMMA cvp+= conditionValuePair
					{
					COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_conditionalAssertionFunction3765); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA50);

					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction3769);
					cvp=conditionValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
					if (list_cvp==null) list_cvp=new ArrayList<Object>();
					list_cvp.add(cvp.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			RBRACKET51=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_conditionalAssertionFunction3774); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET51);

			// AST REWRITE
			// elements: cvp
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: cvp
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_cvp=new RewriteRuleSubtreeStream(adaptor,"token cvp",list_cvp);
			root_0 = (BAST)adaptor.nil();
			// 775:4: -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:7: ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITIONAL_ASSERTION_FUNCTION, "CONDITIONAL_ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:42: ( $cvp)*
				while ( stream_cvp.hasNext() ) {
					adaptor.addChild(root_1, stream_cvp.nextTree());
				}
				stream_cvp.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalAssertionFunction"


	public static class conditionValuePair_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conditionValuePair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:778:1: conditionValuePair : LPAREN ! predicate CVP ^ expression ;
	public final BLESS3Parser.conditionValuePair_return conditionValuePair() throws RecognitionException {
		BLESS3Parser.conditionValuePair_return retval = new BLESS3Parser.conditionValuePair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN52=null;
		Token CVP54=null;
		ParserRuleReturnScope predicate53 =null;
		ParserRuleReturnScope expression55 =null;

		BAST LPAREN52_tree=null;
		BAST CVP54_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:778:19: ( LPAREN ! predicate CVP ^ expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:779:3: LPAREN ! predicate CVP ^ expression
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionValuePair3802); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_conditionValuePair3805);
			predicate53=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate53.getTree());

			CVP54=(Token)match(input,CVP,FOLLOW_CVP_in_conditionValuePair3807); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CVP54_tree = (BAST)adaptor.create(CVP54);
			root_0 = (BAST)adaptor.becomeRoot(CVP54_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_conditionValuePair3810);
			expression55=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression55.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionValuePair"


	public static class assertionEnumeration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertionEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:1: assertionEnumeration : ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) ) -> ^( $pa $pair) );
	public final BLESS3Parser.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		BLESS3Parser.assertionEnumeration_return retval = new BLESS3Parser.assertionEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token com=null;
		Token COMMA56=null;
		List<Object> list_pair=null;
		ParserRuleReturnScope inv =null;
		RuleReturnScope pair = null;
		BAST pa_tree=null;
		BAST com_tree=null;
		BAST COMMA56_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");
		RewriteRuleSubtreeStream stream_enumerationPair=new RewriteRuleSubtreeStream(adaptor,"rule enumerationPair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:21: ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) ) -> ^( $pa $pair) )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==PLUS_ARROW) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==ID) ) {
					int LA38_2 = input.LA(3);
					if ( (LA38_2==LPAREN) ) {
						alt38=1;
					}
					else if ( (LA38_2==IMP) ) {
						alt38=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:783:2: (pa= PLUS_ARROW inv= invocation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:783:2: (pa= PLUS_ARROW inv= invocation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:783:4: pa= PLUS_ARROW inv= invocation
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3826); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_invocation_in_assertionEnumeration3830);
					inv=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
					}

					// AST REWRITE
					// elements: inv, pa
					// token labels: pa
					// rule labels: inv, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_pa=new RewriteRuleTokenStream(adaptor,"token pa",pa);
					RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 784:4: -> ^( $pa $inv)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:784:7: ^( $pa $inv)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						adaptor.addChild(root_1, stream_inv.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:4: pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3861);
					pair=enumerationPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
					if (list_pair==null) list_pair=new ArrayList<Object>();
					list_pair.add(pair.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:40: (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==COMMA) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:42: com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )*
							{
							com=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration3867); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(com);

							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3871);
							pair=enumerationPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTree());
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:74: ( COMMA pair+= enumerationPair )*
							loop36:
							while (true) {
								int alt36=2;
								int LA36_0 = input.LA(1);
								if ( (LA36_0==COMMA) ) {
									alt36=1;
								}

								switch (alt36) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:76: COMMA pair+= enumerationPair
									{
									COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration3875); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA56);

									pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3879);
									pair=enumerationPair();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
									if (list_pair==null) list_pair=new ArrayList<Object>();
									list_pair.add(pair.getTree());
									}
									break;

								default :
									break loop36;
								}
							}

							}
							break;

					}

					}

					// AST REWRITE
					// elements: pa, com, pa, pair, pair
					// token labels: com, pa
					// rule labels: retval
					// token list labels: 
					// rule list labels: pair
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_com=new RewriteRuleTokenStream(adaptor,"token com",com);
					RewriteRuleTokenStream stream_pa=new RewriteRuleTokenStream(adaptor,"token pa",pa);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"token pair",list_pair);
					root_0 = (BAST)adaptor.nil();
					// 787:4: -> {com!=null}? ^( $pa ^( $com ( $pair)+ ) )
					if (com!=null) {
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:20: ^( $pa ^( $com ( $pair)+ ) )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:27: ^( $com ( $pair)+ )
						{
						BAST root_2 = (BAST)adaptor.nil();
						root_2 = (BAST)adaptor.becomeRoot(stream_com.nextNode(), root_2);
						if ( !(stream_pair.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_pair.hasNext() ) {
							adaptor.addChild(root_2, stream_pair.nextTree());
						}
						stream_pair.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}

					else // 788:4: -> ^( $pa $pair)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:788:7: ^( $pa $pair)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						adaptor.addChild(root_1, stream_pair.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionEnumeration"


	public static class enumerationPair_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "enumerationPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:791:1: enumerationPair : ID IMP ^ predicate ;
	public final BLESS3Parser.enumerationPair_return enumerationPair() throws RecognitionException {
		BLESS3Parser.enumerationPair_return retval = new BLESS3Parser.enumerationPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID57=null;
		Token IMP58=null;
		ParserRuleReturnScope predicate59 =null;

		BAST ID57_tree=null;
		BAST IMP58_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:791:16: ( ID IMP ^ predicate )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:792:3: ID IMP ^ predicate
			{
			root_0 = (BAST)adaptor.nil();


			ID57=(Token)match(input,ID,FOLLOW_ID_in_enumerationPair3939); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID57_tree = (BAST)adaptor.create(ID57);
			adaptor.addChild(root_0, ID57_tree);
			}

			IMP58=(Token)match(input,IMP,FOLLOW_IMP_in_enumerationPair3941); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP58_tree = (BAST)adaptor.create(IMP58);
			root_0 = (BAST)adaptor.becomeRoot(IMP58_tree, root_0);
			}

			pushFollow(FOLLOW_predicate_in_enumerationPair3944);
			predicate59=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate59.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationPair"


	public static class enumerationValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "enumerationValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:1: enumerationValue : enumeration_type= ID TICK ^enumeration_value= ID ;
	public final BLESS3Parser.enumerationValue_return enumerationValue() throws RecognitionException {
		BLESS3Parser.enumerationValue_return retval = new BLESS3Parser.enumerationValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token enumeration_type=null;
		Token enumeration_value=null;
		Token TICK60=null;

		BAST enumeration_type_tree=null;
		BAST enumeration_value_tree=null;
		BAST TICK60_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:17: (enumeration_type= ID TICK ^enumeration_value= ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:3: enumeration_type= ID TICK ^enumeration_value= ID
			{
			root_0 = (BAST)adaptor.nil();


			enumeration_type=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue3958); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			enumeration_type_tree = (BAST)adaptor.create(enumeration_type);
			adaptor.addChild(root_0, enumeration_type_tree);
			}

			TICK60=(Token)match(input,TICK,FOLLOW_TICK_in_enumerationValue3960); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TICK60_tree = (BAST)adaptor.create(TICK60);
			root_0 = (BAST)adaptor.becomeRoot(TICK60_tree, root_0);
			}

			enumeration_value=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue3965); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			enumeration_value_tree = (BAST)adaptor.create(enumeration_value);
			adaptor.addChild(root_0, enumeration_value_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationValue"


	public static class namelessAssertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:800:1: namelessAssertion : LASS pred= predicate RASS -> ^( ASSERTION $pred) ;
	public final BLESS3Parser.namelessAssertion_return namelessAssertion() throws RecognitionException {
		BLESS3Parser.namelessAssertion_return retval = new BLESS3Parser.namelessAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LASS61=null;
		Token RASS62=null;
		ParserRuleReturnScope pred =null;

		BAST LASS61_tree=null;
		BAST RASS62_tree=null;
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:800:18: ( LASS pred= predicate RASS -> ^( ASSERTION $pred) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:801:3: LASS pred= predicate RASS
			{
			LASS61=(Token)match(input,LASS,FOLLOW_LASS_in_namelessAssertion3978); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS61);

			pushFollow(FOLLOW_predicate_in_namelessAssertion3982);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			RASS62=(Token)match(input,RASS,FOLLOW_RASS_in_namelessAssertion3984); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS62);

			// AST REWRITE
			// elements: pred
			// token labels: 
			// rule labels: pred, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 802:5: -> ^( ASSERTION $pred)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:802:8: ^( ASSERTION $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, "ASSERTION"), root_1);
				adaptor.addChild(root_1, stream_pred.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessAssertion"


	public static class namelessFunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:805:1: namelessFunction : LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue) ;
	public final BLESS3Parser.namelessFunction_return namelessFunction() throws RecognitionException {
		BLESS3Parser.namelessFunction_return retval = new BLESS3Parser.namelessFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ret=null;
		Token LASS63=null;
		Token ASSIGN64=null;
		Token RASS65=null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;

		BAST ret_tree=null;
		BAST LASS63_tree=null;
		BAST ASSIGN64_tree=null;
		BAST RASS65_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:805:17: ( LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:3: LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS
			{
			LASS63=(Token)match(input,LASS,FOLLOW_LASS_in_namelessFunction4013); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS63);

			ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction4017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

			pushFollow(FOLLOW_typeOrReference_in_namelessFunction4021);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
			ASSIGN64=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namelessFunction4023); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN64);

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction4027);
			functionvalue=assertionFunctionValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
			RASS65=(Token)match(input,RASS,FOLLOW_RASS_in_namelessFunction4029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS65);

			// AST REWRITE
			// elements: ret, tod, functionvalue
			// token labels: ret
			// rule labels: tod, functionvalue, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ret=new RewriteRuleTokenStream(adaptor,"token ret",ret);
			RewriteRuleSubtreeStream stream_tod=new RewriteRuleSubtreeStream(adaptor,"rule tod",tod!=null?tod.getTree():null);
			RewriteRuleSubtreeStream stream_functionvalue=new RewriteRuleSubtreeStream(adaptor,"rule functionvalue",functionvalue!=null?functionvalue.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 807:5: -> ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:8: ^( ASSERTION_FUNCTION ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, "ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:30: ^( $ret $tod)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ret.nextNode(), root_2);
				adaptor.addChild(root_2, stream_tod.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_functionvalue.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessFunction"


	public static class namelessEnumeration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "namelessEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:810:1: namelessEnumeration : LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION $inv) ;
	public final BLESS3Parser.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		BLESS3Parser.namelessEnumeration_return retval = new BLESS3Parser.namelessEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token LASS66=null;
		Token RASS67=null;
		ParserRuleReturnScope inv =null;

		BAST pa_tree=null;
		BAST LASS66_tree=null;
		BAST RASS67_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:810:20: ( LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION $inv) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:811:2: LASS pa= PLUS_ARROW inv= invocation RASS
			{
			LASS66=(Token)match(input,LASS,FOLLOW_LASS_in_namelessEnumeration4069); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS66);

			pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_namelessEnumeration4073); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

			pushFollow(FOLLOW_invocation_in_namelessEnumeration4077);
			inv=invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
			RASS67=(Token)match(input,RASS,FOLLOW_RASS_in_namelessEnumeration4079); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS67);

			// AST REWRITE
			// elements: inv
			// token labels: 
			// rule labels: inv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 812:4: -> ^( ASSERTION_ENUMERATION $inv)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:8: ^( ASSERTION_ENUMERATION $inv)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, "ASSERTION_ENUMERATION"), root_1);
				adaptor.addChild(root_1, stream_inv.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessEnumeration"


	public static class assertion_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:815:1: assertion : ( ( LASS ID COLON )=> namedAssertion | ( LASS LITERAL_returns )=> namelessFunction | ( LASS PLUS_ARROW )=> namelessEnumeration | namelessAssertion );
	public final BLESS3Parser.assertion_return assertion() throws RecognitionException {
		BLESS3Parser.assertion_return retval = new BLESS3Parser.assertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope namedAssertion68 =null;
		ParserRuleReturnScope namelessFunction69 =null;
		ParserRuleReturnScope namelessEnumeration70 =null;
		ParserRuleReturnScope namelessAssertion71 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:817:3: ( ( LASS ID COLON )=> namedAssertion | ( LASS LITERAL_returns )=> namelessFunction | ( LASS PLUS_ARROW )=> namelessEnumeration | namelessAssertion )
			int alt39=4;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==LASS) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==LITERAL_returns) && (synpred59_BLESS3())) {
					alt39=2;
				}
				else if ( (LA39_1==PLUS_ARROW) && (synpred60_BLESS3())) {
					alt39=3;
				}
				else if ( (LA39_1==ID) ) {
					int LA39_4 = input.LA(3);
					if ( (LA39_4==COLON) && (synpred58_BLESS3())) {
						alt39=1;
					}
					else if ( ((LA39_4 >= AL && LA39_4 <= AM)||LA39_4==AT_SIGN||LA39_4==CARET||(LA39_4 >= DIVIDE && LA39_4 <= DOT)||LA39_4==EQ||LA39_4==EXP||LA39_4==GT||LA39_4==LBRACKET||LA39_4==LITERAL_and||LA39_4==LITERAL_div||LA39_4==LITERAL_iff||(LA39_4 >= LITERAL_implies && LA39_4 <= LITERAL_in)||LA39_4==LITERAL_mod||LA39_4==LITERAL_or||LA39_4==LITERAL_rem||(LA39_4 >= LITERAL_xor && LA39_4 <= LT)||LA39_4==MINUS||LA39_4==NEQ||LA39_4==OLD_NEQ||LA39_4==PLUS||LA39_4==PLUS_EQUALS||(LA39_4 >= QUESTION && LA39_4 <= RASS)||LA39_4==TICK||LA39_4==TIMES) ) {
						alt39=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
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
				else if ( (LA39_1==AADL_STRING_LITERAL||LA39_1==LBRACKET||LA39_1==LITERAL_abs||LA39_1==LITERAL_all||LA39_1==LITERAL_exists||LA39_1==LITERAL_false||(LA39_1 >= LITERAL_not && LA39_1 <= LITERAL_numberof)||LA39_1==LITERAL_product||LA39_1==LITERAL_round||LA39_1==LITERAL_self||LA39_1==LITERAL_sum||LA39_1==LITERAL_timeout||LA39_1==LITERAL_tops||(LA39_1 >= LITERAL_true && LA39_1 <= LITERAL_truncate)||LA39_1==LPAREN||LA39_1==MINUS||LA39_1==NUMBER||LA39_1==OCTOTHORPE||(LA39_1 >= QCLREF && LA39_1 <= QCREF)) ) {
					alt39=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}

			switch (alt39) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:818:3: ( LASS ID COLON )=> namedAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namedAssertion_in_assertion4116);
					namedAssertion68=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion68.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:819:5: ( LASS LITERAL_returns )=> namelessFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessFunction_in_assertion4129);
					namelessFunction69=namelessFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessFunction69.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:5: ( LASS PLUS_ARROW )=> namelessEnumeration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessEnumeration_in_assertion4142);
					namelessEnumeration70=namelessEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessEnumeration70.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:5: namelessAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessAssertion_in_assertion4148);
					namelessAssertion71=namelessAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessAssertion71.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertion"


	public static class invocation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "invocation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:825:1: invocation : id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE $id ( $params)* ( $exp)? ) ;
	public final BLESS3Parser.invocation_return invocation() throws RecognitionException {
		BLESS3Parser.invocation_return retval = new BLESS3Parser.invocation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN72=null;
		Token COMMA73=null;
		Token RPAREN74=null;
		List<Object> list_params=null;
		ParserRuleReturnScope exp =null;
		RuleReturnScope params = null;
		BAST id_tree=null;
		BAST LPAREN72_tree=null;
		BAST COMMA73_tree=null;
		BAST RPAREN74_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_actualParameter=new RewriteRuleSubtreeStream(adaptor,"rule actualParameter");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:825:11: (id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE $id ( $params)* ( $exp)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:2: id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_invocation4162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN72=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_invocation4164); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN72);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:2: ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )?
			int alt41=3;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==ID) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==COLON) ) {
					alt41=1;
				}
				else if ( ((LA41_1 >= AL && LA41_1 <= AM)||LA41_1==AT_SIGN||LA41_1==CARET||(LA41_1 >= DIVIDE && LA41_1 <= DOT)||LA41_1==EQ||LA41_1==EXP||LA41_1==GT||LA41_1==LBRACKET||LA41_1==LITERAL_and||LA41_1==LITERAL_div||LA41_1==LITERAL_iff||(LA41_1 >= LITERAL_implies && LA41_1 <= LITERAL_in)||LA41_1==LITERAL_mod||LA41_1==LITERAL_or||LA41_1==LITERAL_rem||(LA41_1 >= LITERAL_xor && LA41_1 <= LT)||LA41_1==MINUS||LA41_1==NEQ||LA41_1==OLD_NEQ||LA41_1==PLUS||LA41_1==PLUS_EQUALS||LA41_1==QUESTION||LA41_1==RPAREN||LA41_1==TICK||LA41_1==TIMES) ) {
					alt41=2;
				}
			}
			else if ( (LA41_0==AADL_STRING_LITERAL||LA41_0==LBRACKET||LA41_0==LITERAL_abs||LA41_0==LITERAL_all||LA41_0==LITERAL_exists||LA41_0==LITERAL_false||(LA41_0 >= LITERAL_not && LA41_0 <= LITERAL_numberof)||LA41_0==LITERAL_product||LA41_0==LITERAL_round||LA41_0==LITERAL_self||LA41_0==LITERAL_sum||LA41_0==LITERAL_timeout||LA41_0==LITERAL_tops||(LA41_0 >= LITERAL_true && LA41_0 <= LITERAL_truncate)||LA41_0==LPAREN||LA41_0==MINUS||LA41_0==NUMBER||LA41_0==OCTOTHORPE||(LA41_0 >= QCLREF && LA41_0 <= QCREF)) ) {
				alt41=2;
			}
			switch (alt41) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:6: params+= actualParameter ( COMMA params+= actualParameter )*
					{
					pushFollow(FOLLOW_actualParameter_in_invocation4174);
					params=actualParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
					if (list_params==null) list_params=new ArrayList<Object>();
					list_params.add(params.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:30: ( COMMA params+= actualParameter )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==COMMA) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:32: COMMA params+= actualParameter
							{
							COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_invocation4178); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA73);

							pushFollow(FOLLOW_actualParameter_in_invocation4182);
							params=actualParameter();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTree());
							}
							break;

						default :
							break loop40;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:6: exp= expression
					{
					pushFollow(FOLLOW_expression_in_invocation4196);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			RPAREN74=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_invocation4201); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN74);

			// AST REWRITE
			// elements: id, params, exp
			// token labels: id
			// rule labels: exp, retval
			// token list labels: 
			// rule list labels: params
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"token params",list_params);
			root_0 = (BAST)adaptor.nil();
			// 829:4: -> ^( INVOKE $id ( $params)* ( $exp)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:829:7: ^( INVOKE $id ( $params)* ( $exp)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVOKE, "INVOKE"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:829:22: ( $params)*
				while ( stream_params.hasNext() ) {
					adaptor.addChild(root_1, stream_params.nextTree());
				}
				stream_params.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:829:31: ( $exp)?
				if ( stream_exp.hasNext() ) {
					adaptor.addChild(root_1, stream_exp.nextTree());
				}
				stream_exp.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invocation"


	public static class actualParameter_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "actualParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:1: actualParameter : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.actualParameter_return actualParameter() throws RecognitionException {
		BLESS3Parser.actualParameter_return retval = new BLESS3Parser.actualParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON75=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON75_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:16: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:833:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_actualParameter4236); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON75=(Token)match(input,COLON,FOLLOW_COLON_in_actualParameter4238); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON75_tree = (BAST)adaptor.create(COLON75);
			root_0 = (BAST)adaptor.becomeRoot(COLON75_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_actualParameter4243);
			actual=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actual.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualParameter"


	public static class expression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:838:1: expression : (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? );
	public final BLESS3Parser.expression_return expression() throws RecognitionException {
		BLESS3Parser.expression_return retval = new BLESS3Parser.expression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_iff76=null;
		Token LITERAL_implies77=null;
		ParserRuleReturnScope all =null;
		ParserRuleReturnScope exists =null;
		ParserRuleReturnScope sum =null;
		ParserRuleReturnScope product =null;
		ParserRuleReturnScope numberof =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		BAST LITERAL_iff76_tree=null;
		BAST LITERAL_implies77_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:838:11: (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? )
			int alt44=6;
			switch ( input.LA(1) ) {
			case LITERAL_all:
				{
				alt44=1;
				}
				break;
			case LITERAL_exists:
				{
				alt44=2;
				}
				break;
			case LITERAL_sum:
				{
				alt44=3;
				}
				break;
			case LITERAL_product:
				{
				alt44=4;
				}
				break;
			case LITERAL_numberof:
				{
				alt44=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_false:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_round:
			case LITERAL_self:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case MINUS:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt44=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:3: all= universalQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalQuantification_in_expression4261);
					all=universalQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, all.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:840:5: exists= existentialQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialQuantification_in_expression4269);
					exists=existentialQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:5: sum= sumQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_sumQuantification_in_expression4277);
					sum=sumQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sum.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:842:5: product= productQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_productQuantification_in_expression4285);
					product=productQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, product.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:843:5: numberof= countingQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_countingQuantification_in_expression4293);
					numberof=countingQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numberof.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:5: l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_disjunction_in_expression4301);
					l=disjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:19: ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==LITERAL_iff||LA43_0==LITERAL_implies) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:21: ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:21: ( LITERAL_iff ^| LITERAL_implies ^)
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==LITERAL_iff) ) {
								alt42=1;
							}
							else if ( (LA42_0==LITERAL_implies) ) {
								alt42=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 42, 0, input);
								throw nvae;
							}

							switch (alt42) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:22: LITERAL_iff ^
									{
									LITERAL_iff76=(Token)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression4306); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_iff76_tree = (BAST)adaptor.create(LITERAL_iff76);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_iff76_tree, root_0);
									}

									}
									break;
								case 2 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:37: LITERAL_implies ^
									{
									LITERAL_implies77=(Token)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression4311); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_implies77_tree = (BAST)adaptor.create(LITERAL_implies77);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_implies77_tree, root_0);
									}

									}
									break;

							}

							pushFollow(FOLLOW_disjunction_in_expression4317);
							r=disjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class universalQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "universalQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:1: universalQuantification : al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al;
	public final BLESS3Parser.universalQuantification_return universalQuantification() throws RecognitionException {
		BLESS3Parser.universalQuantification_return retval = new BLESS3Parser.universalQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token al=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope pred =null;

		BAST al_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_all=new RewriteRuleTokenStream(adaptor,"token LITERAL_all");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_are=new RewriteRuleTokenStream(adaptor,"token LITERAL_are");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:24: (al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:849:3: al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate
			{
			al=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification4333); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_all.add(al);

			pushFollow(FOLLOW_logicVariables_in_universalQuantification4337);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==LITERAL_in) ) {
				alt45=1;
			}
			else if ( (LA45_0==LITERAL_which) ) {
				alt45=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalQuantification4348); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_universalQuantification4352);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_universalQuantification4358); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_universalQuantification4362);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification4373); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_universalQuantification4377);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: al, w, pred, b, r, lv, i, pred, al, ar, al, ar, lv
			// token labels: ar, w, i, al
			// rule labels: b, r, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_al=new RewriteRuleTokenStream(adaptor,"token al",al);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 852:4: -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:852:18: ^( $al $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:852:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:852:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 853:4: -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:18: ^( $al $lv ^( $w $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 854:4: -> $al
			{
				adaptor.addChild(root_0, stream_al.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalQuantification"


	public static class existentialQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "existentialQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:857:1: existentialQuantification : ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) th= LITERAL_that pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) ) -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $th $pred) ) -> $ex;
	public final BLESS3Parser.existentialQuantification_return existentialQuantification() throws RecognitionException {
		BLESS3Parser.existentialQuantification_return retval = new BLESS3Parser.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ex=null;
		Token i=null;
		Token th=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope pred =null;

		BAST ex_tree=null;
		BAST i_tree=null;
		BAST th_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_that=new RewriteRuleTokenStream(adaptor,"token LITERAL_that");
		RewriteRuleTokenStream stream_LITERAL_exists=new RewriteRuleTokenStream(adaptor,"token LITERAL_exists");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:857:26: (ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) th= LITERAL_that pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) ) -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $th $pred) ) -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:858:3: ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |th= LITERAL_that b= predicate ) th= LITERAL_that pred= predicate
			{
			ex=(Token)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification4473); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_exists.add(ex);

			pushFollow(FOLLOW_logicVariables_in_existentialQuantification4477);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:5: (i= LITERAL_in r= range |th= LITERAL_that b= predicate )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==LITERAL_in) ) {
				alt46=1;
			}
			else if ( (LA46_0==LITERAL_that) ) {
				alt46=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_existentialQuantification4488); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_existentialQuantification4492);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:29: th= LITERAL_that b= predicate
					{
					th=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification4498); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_that.add(th);

					pushFollow(FOLLOW_predicate_in_existentialQuantification4502);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			th=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification4513); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(th);

			pushFollow(FOLLOW_predicate_in_existentialQuantification4517);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: th, i, ex, th, pred, lv, ex, b, ex, lv, r, th, pred
			// token labels: ex, th, i
			// rule labels: b, r, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ex=new RewriteRuleTokenStream(adaptor,"token ex",ex);
			RewriteRuleTokenStream stream_th=new RewriteRuleTokenStream(adaptor,"token th",th);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 861:4: -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:18: ^( $ex $lv ^( $i $r) ^( $th $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:40: ^( $th $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 862:4: -> {th!=null}? ^( $ex $lv ^( $th $b) ^( $th $pred) )
			if (th!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:19: ^( $ex $lv ^( $th $b) ^( $th $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:30: ^( $th $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:42: ^( $th $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 863:4: -> $ex
			{
				adaptor.addChild(root_0, stream_ex.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialQuantification"


	public static class sumQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "sumQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:866:1: sumQuantification : sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum;
	public final BLESS3Parser.sumQuantification_return sumQuantification() throws RecognitionException {
		BLESS3Parser.sumQuantification_return retval = new BLESS3Parser.sumQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token sum=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope ex =null;

		BAST sum_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_of=new RewriteRuleTokenStream(adaptor,"token LITERAL_of");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_sum=new RewriteRuleTokenStream(adaptor,"token LITERAL_sum");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:866:18: (sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:867:3: sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			sum=(Token)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification4613); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_sum.add(sum);

			pushFollow(FOLLOW_logicVariables_in_sumQuantification4617);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:868:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==LITERAL_in) ) {
				alt47=1;
			}
			else if ( (LA47_0==LITERAL_which) ) {
				alt47=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:868:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_sumQuantification4628); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_sumQuantification4632);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:868:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_sumQuantification4638); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_sumQuantification4642);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification4653); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_sumQuantification4657);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: i, sum, sum, r, ar, lv, w, ex, sum, b, ex, lv, ar
			// token labels: ar, w, i, sum
			// rule labels: r, b, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_sum=new RewriteRuleTokenStream(adaptor,"token sum",sum);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 870:4: -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:18: ^( $sum $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:30: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 871:4: -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:18: ^( $sum $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:30: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 872:4: -> $sum
			{
				adaptor.addChild(root_0, stream_sum.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sumQuantification"


	public static class productQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "productQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:875:1: productQuantification : pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr;
	public final BLESS3Parser.productQuantification_return productQuantification() throws RecognitionException {
		BLESS3Parser.productQuantification_return retval = new BLESS3Parser.productQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pr=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope ex =null;

		BAST pr_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_of=new RewriteRuleTokenStream(adaptor,"token LITERAL_of");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_product=new RewriteRuleTokenStream(adaptor,"token LITERAL_product");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:875:22: (pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:876:3: pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			pr=(Token)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification4753); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_product.add(pr);

			pushFollow(FOLLOW_logicVariables_in_productQuantification4757);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:877:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==LITERAL_in) ) {
				alt48=1;
			}
			else if ( (LA48_0==LITERAL_which) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:877:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_productQuantification4768); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_productQuantification4772);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:877:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_productQuantification4778); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_productQuantification4782);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification4793); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_productQuantification4797);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: ex, lv, r, pr, ex, pr, pr, lv, i, ar, w, b, ar
			// token labels: ar, pr, w, i
			// rule labels: r, b, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_pr=new RewriteRuleTokenStream(adaptor,"token pr",pr);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 879:4: -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:18: ^( $pr $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 880:4: -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:18: ^( $pr $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 881:4: -> $pr
			{
				adaptor.addChild(root_0, stream_pr.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "productQuantification"


	public static class countingQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "countingQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:884:1: countingQuantification : n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n;
	public final BLESS3Parser.countingQuantification_return countingQuantification() throws RecognitionException {
		BLESS3Parser.countingQuantification_return retval = new BLESS3Parser.countingQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token n=null;
		Token i=null;
		Token w=null;
		Token ar=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope ex =null;

		BAST n_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST ar_tree=null;
		RewriteRuleTokenStream stream_LITERAL_numberof=new RewriteRuleTokenStream(adaptor,"token LITERAL_numberof");
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_that=new RewriteRuleTokenStream(adaptor,"token LITERAL_that");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:884:23: (n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:885:3: n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression
			{
			n=(Token)match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification4893); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_numberof.add(n);

			pushFollow(FOLLOW_logicVariables_in_countingQuantification4897);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:886:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==LITERAL_in) ) {
				alt49=1;
			}
			else if ( (LA49_0==LITERAL_which) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:886:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_countingQuantification4908); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_countingQuantification4912);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:886:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_countingQuantification4918); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_countingQuantification4922);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification4933); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(ar);

			pushFollow(FOLLOW_expression_in_countingQuantification4937);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: ex, b, n, n, r, i, ar, w, ar, lv, n, ex, lv
			// token labels: ar, w, i, n
			// rule labels: b, r, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 888:4: -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:18: ^( $n $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:28: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 889:4: -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:18: ^( $n $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:28: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 890:4: -> $n
			{
				adaptor.addChild(root_0, stream_n.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "countingQuantification"


	public static class logicVariables_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "logicVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:893:1: logicVariables :lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? ;
	public final BLESS3Parser.logicVariables_return logicVariables() throws RecognitionException {
		BLESS3Parser.logicVariables_return retval = new BLESS3Parser.logicVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA78=null;
		Token COMMA79=null;
		List<Object> list_lv=null;
		RuleReturnScope lv = null;
		BAST COMMA78_tree=null;
		BAST COMMA79_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:893:15: (lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:3: lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_logicVariables5033);
			lv=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

			if (list_lv==null) list_lv=new ArrayList<Object>();
			list_lv.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:16: ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==COMMA) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:18: COMMA ^lv+= variable ( COMMA !lv+= variable )*
					{
					COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA78_tree = (BAST)adaptor.create(COMMA78);
					root_0 = (BAST)adaptor.becomeRoot(COMMA78_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_logicVariables5042);
					lv=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:38: ( COMMA !lv+= variable )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==COMMA) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:40: COMMA !lv+= variable
							{
							COMMA79=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5046); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_logicVariables5051);
							lv=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv.getTree());
							}
							break;

						default :
							break loop50;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicVariables"


	public static class disjunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "disjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:1: disjunction : l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? ;
	public final BLESS3Parser.disjunction_return disjunction() throws RecognitionException {
		BLESS3Parser.disjunction_return retval = new BLESS3Parser.disjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or80=null;
		Token LITERAL_or81=null;
		Token LITERAL_or82=null;
		Token LITERAL_else83=null;
		Token LITERAL_or84=null;
		Token LITERAL_else85=null;
		Token LITERAL_xor86=null;
		Token LITERAL_xor87=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_or80_tree=null;
		BAST LITERAL_or81_tree=null;
		BAST LITERAL_or82_tree=null;
		BAST LITERAL_else83_tree=null;
		BAST LITERAL_or84_tree=null;
		BAST LITERAL_else85_tree=null;
		BAST LITERAL_xor86_tree=null;
		BAST LITERAL_xor87_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:12: (l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:3: l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_conjunction_in_disjunction5073);
			l=conjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:899:6: ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			int alt55=4;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==LITERAL_or) ) {
				int LA55_1 = input.LA(2);
				if ( (LA55_1==LITERAL_else) ) {
					alt55=2;
				}
				else if ( (LA55_1==AADL_STRING_LITERAL||LA55_1==ID||LA55_1==LBRACKET||LA55_1==LITERAL_abs||LA55_1==LITERAL_false||(LA55_1 >= LITERAL_not && LA55_1 <= LITERAL_null)||LA55_1==LITERAL_round||LA55_1==LITERAL_self||LA55_1==LITERAL_timeout||LA55_1==LITERAL_tops||(LA55_1 >= LITERAL_true && LA55_1 <= LITERAL_truncate)||LA55_1==LPAREN||LA55_1==MINUS||LA55_1==NUMBER||LA55_1==OCTOTHORPE||(LA55_1 >= QCLREF && LA55_1 <= QCREF)) ) {
					alt55=1;
				}
			}
			else if ( (LA55_0==LITERAL_xor) ) {
				alt55=3;
			}
			switch (alt55) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:8: LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )*
					{
					LITERAL_or80=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5090); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or80_tree = (BAST)adaptor.create(LITERAL_or80);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or80_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5095);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:35: ( LITERAL_or !r+= conjunction )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==LITERAL_or) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:37: LITERAL_or !r+= conjunction
							{
							LITERAL_or81=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5099); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5104);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop52;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:902:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:902:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:902:8: LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					{
					LITERAL_or82=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5125); if (state.failed) return retval;
					LITERAL_else83=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5128); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else83_tree = (BAST)adaptor.create(LITERAL_else83);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_else83_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5133);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:902:49: ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==LITERAL_or) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:902:51: LITERAL_or ! LITERAL_else !r+= conjunction
							{
							LITERAL_or84=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5137); if (state.failed) return retval;
							LITERAL_else85=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5140); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5145);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop53;
						}
					}

					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:904:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:904:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:904:8: LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )*
					{
					LITERAL_xor86=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor86_tree = (BAST)adaptor.create(LITERAL_xor86);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_xor86_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5171);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:904:36: ( LITERAL_xor !r+= conjunction )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==LITERAL_xor) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:904:38: LITERAL_xor !r+= conjunction
							{
							LITERAL_xor87=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5175); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5180);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop54;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "disjunction"


	public static class conjunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:908:1: conjunction : l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? ;
	public final BLESS3Parser.conjunction_return conjunction() throws RecognitionException {
		BLESS3Parser.conjunction_return retval = new BLESS3Parser.conjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and88=null;
		Token LITERAL_and89=null;
		Token LITERAL_and90=null;
		Token LITERAL_then91=null;
		Token LITERAL_and92=null;
		Token LITERAL_then93=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_and88_tree=null;
		BAST LITERAL_and89_tree=null;
		BAST LITERAL_and90_tree=null;
		BAST LITERAL_then91_tree=null;
		BAST LITERAL_and92_tree=null;
		BAST LITERAL_then93_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:908:12: (l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:3: l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_relation_in_conjunction5204);
			l=relation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:5: ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			int alt58=3;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==LITERAL_and) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==LITERAL_then) ) {
					alt58=2;
				}
				else if ( (LA58_1==AADL_STRING_LITERAL||LA58_1==ID||LA58_1==LBRACKET||LA58_1==LITERAL_abs||LA58_1==LITERAL_false||(LA58_1 >= LITERAL_not && LA58_1 <= LITERAL_null)||LA58_1==LITERAL_round||LA58_1==LITERAL_self||LA58_1==LITERAL_timeout||LA58_1==LITERAL_tops||(LA58_1 >= LITERAL_true && LA58_1 <= LITERAL_truncate)||LA58_1==LPAREN||LA58_1==MINUS||LA58_1==NUMBER||LA58_1==OCTOTHORPE||(LA58_1 >= QCLREF && LA58_1 <= QCREF)) ) {
					alt58=1;
				}
			}
			switch (alt58) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:9: LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )*
					{
					LITERAL_and88=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5214); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and88_tree = (BAST)adaptor.create(LITERAL_and88);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and88_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5219);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:34: ( LITERAL_and !r+= relation )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==LITERAL_and) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:36: LITERAL_and !r+= relation
							{
							LITERAL_and89=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5223); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5228);
							r=relation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop56;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:9: LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )*
					{
					LITERAL_and90=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5243); if (state.failed) return retval;
					LITERAL_then91=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5246); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then91_tree = (BAST)adaptor.create(LITERAL_then91);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_then91_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5251);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:48: ( LITERAL_and ! LITERAL_then !r+= relation )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==LITERAL_and) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:50: LITERAL_and ! LITERAL_then !r+= relation
							{
							LITERAL_and92=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5255); if (state.failed) return retval;
							LITERAL_then93=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5258); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5263);
							r=relation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop57;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conjunction"


	public static class relation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:1: relation : addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )? ;
	public final BLESS3Parser.relation_return relation() throws RecognitionException {
		BLESS3Parser.relation_return retval = new BLESS3Parser.relation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_in97=null;
		ParserRuleReturnScope addSub94 =null;
		ParserRuleReturnScope relation_symbol95 =null;
		ParserRuleReturnScope addSub96 =null;
		ParserRuleReturnScope range98 =null;

		BAST LITERAL_in97_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:9: ( addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:2: addSub ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_addSub_in_relation5284);
			addSub94=addSub();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub94.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:2: ( ( relation_symbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			int alt59=3;
			int LA59_0 = input.LA(1);
			if ( ((LA59_0 >= AL && LA59_0 <= AM)||LA59_0==EQ||LA59_0==GT||LA59_0==LT||LA59_0==NEQ||LA59_0==OLD_NEQ||LA59_0==PLUS_EQUALS) ) {
				alt59=1;
			}
			else if ( (LA59_0==LITERAL_in) ) {
				alt59=2;
			}
			switch (alt59) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:918:4: ( relation_symbol ^ addSub )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:918:4: ( relation_symbol ^ addSub )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:918:6: relation_symbol ^ addSub
					{
					pushFollow(FOLLOW_relation_symbol_in_relation5294);
					relation_symbol95=relation_symbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(relation_symbol95.getTree(), root_0);
					pushFollow(FOLLOW_addSub_in_relation5297);
					addSub96=addSub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub96.getTree());

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:920:4: ( LITERAL_in ^ range )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:920:4: ( LITERAL_in ^ range )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:920:6: LITERAL_in ^ range
					{
					LITERAL_in97=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation5311); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_in97_tree = (BAST)adaptor.create(LITERAL_in97);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_in97_tree, root_0);
					}

					pushFollow(FOLLOW_range_in_relation5314);
					range98=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, range98.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class range_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "range"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:924:1: range : subexpression rangeSymbol ^ subexpression ;
	public final BLESS3Parser.range_return range() throws RecognitionException {
		BLESS3Parser.range_return retval = new BLESS3Parser.range_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope subexpression99 =null;
		ParserRuleReturnScope rangeSymbol100 =null;
		ParserRuleReturnScope subexpression101 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:924:6: ( subexpression rangeSymbol ^ subexpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:924:8: subexpression rangeSymbol ^ subexpression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_range5329);
			subexpression99=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression99.getTree());

			pushFollow(FOLLOW_rangeSymbol_in_range5331);
			rangeSymbol100=rangeSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(rangeSymbol100.getTree(), root_0);
			pushFollow(FOLLOW_subexpression_in_range5334);
			subexpression101=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression101.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class rangeSymbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "rangeSymbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:926:1: rangeSymbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.rangeSymbol_return rangeSymbol() throws RecognitionException {
		BLESS3Parser.rangeSymbol_return retval = new BLESS3Parser.rangeSymbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set102=null;

		BAST set102_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:926:13: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set102=input.LT(1);
			if ( (input.LA(1) >= COMMACOMMA && input.LA(1) <= COMMADOT)||(input.LA(1) >= DOTCOMMA && input.LA(1) <= DOTDOT) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set102));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rangeSymbol"


	public static class addSub_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "addSub"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:929:1: addSub : multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? ;
	public final BLESS3Parser.addSub_return addSub() throws RecognitionException {
		BLESS3Parser.addSub_return retval = new BLESS3Parser.addSub_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token PLUS104=null;
		Token PLUS106=null;
		Token MINUS108=null;
		ParserRuleReturnScope multDiv103 =null;
		ParserRuleReturnScope multDiv105 =null;
		ParserRuleReturnScope multDiv107 =null;
		ParserRuleReturnScope multDiv109 =null;

		BAST PLUS104_tree=null;
		BAST PLUS106_tree=null;
		BAST MINUS108_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:929:7: ( multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:3: multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_multDiv_in_addSub5365);
			multDiv103=multDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv103.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:3: ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			int alt61=3;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==PLUS) ) {
				alt61=1;
			}
			else if ( (LA61_0==MINUS) ) {
				alt61=2;
			}
			switch (alt61) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:7: PLUS ^ multDiv ( PLUS ! multDiv )*
					{
					PLUS104=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5377); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS104_tree = (BAST)adaptor.create(PLUS104);
					root_0 = (BAST)adaptor.becomeRoot(PLUS104_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5380);
					multDiv105=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv105.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:21: ( PLUS ! multDiv )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==PLUS) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:23: PLUS ! multDiv
							{
							PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5384); if (state.failed) return retval;
							pushFollow(FOLLOW_multDiv_in_addSub5387);
							multDiv107=multDiv();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv107.getTree());

							}
							break;

						default :
							break loop60;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:934:5: ( MINUS ^ multDiv )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:934:5: ( MINUS ^ multDiv )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:934:7: MINUS ^ multDiv
					{
					MINUS108=(Token)match(input,MINUS,FOLLOW_MINUS_in_addSub5406); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS108_tree = (BAST)adaptor.create(MINUS108);
					root_0 = (BAST)adaptor.becomeRoot(MINUS108_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5409);
					multDiv109=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv109.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addSub"


	public static class multDiv_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "multDiv"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:938:1: multDiv : exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? ;
	public final BLESS3Parser.multDiv_return multDiv() throws RecognitionException {
		BLESS3Parser.multDiv_return retval = new BLESS3Parser.multDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TIMES111=null;
		Token TIMES113=null;
		ParserRuleReturnScope exponentiation110 =null;
		ParserRuleReturnScope exponentiation112 =null;
		ParserRuleReturnScope exponentiation114 =null;
		ParserRuleReturnScope dividers115 =null;
		ParserRuleReturnScope exponentiation116 =null;

		BAST TIMES111_tree=null;
		BAST TIMES113_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:938:8: ( exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:3: exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_exponentiation_in_multDiv5429);
			exponentiation110=exponentiation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation110.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:940:3: ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==TIMES) ) {
				alt63=1;
			}
			else if ( (LA63_0==DIVIDE||LA63_0==LITERAL_div||LA63_0==LITERAL_mod||LA63_0==LITERAL_rem) ) {
				alt63=2;
			}
			switch (alt63) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:7: TIMES ^ exponentiation ( TIMES ! exponentiation )*
					{
					TIMES111=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5441); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES111_tree = (BAST)adaptor.create(TIMES111);
					root_0 = (BAST)adaptor.becomeRoot(TIMES111_tree, root_0);
					}

					pushFollow(FOLLOW_exponentiation_in_multDiv5444);
					exponentiation112=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation112.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:29: ( TIMES ! exponentiation )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==TIMES) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:31: TIMES ! exponentiation
							{
							TIMES113=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5448); if (state.failed) return retval;
							pushFollow(FOLLOW_exponentiation_in_multDiv5451);
							exponentiation114=exponentiation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation114.getTree());

							}
							break;

						default :
							break loop62;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:943:4: ( dividers ^ exponentiation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:943:4: ( dividers ^ exponentiation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:943:6: dividers ^ exponentiation
					{
					pushFollow(FOLLOW_dividers_in_multDiv5469);
					dividers115=dividers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(dividers115.getTree(), root_0);
					pushFollow(FOLLOW_exponentiation_in_multDiv5472);
					exponentiation116=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation116.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multDiv"


	public static class dividers_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dividers"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:1: dividers : ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem );
	public final BLESS3Parser.dividers_return dividers() throws RecognitionException {
		BLESS3Parser.dividers_return retval = new BLESS3Parser.dividers_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set117=null;

		BAST set117_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:9: ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set117=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==LITERAL_div||input.LA(1)==LITERAL_mod||input.LA(1)==LITERAL_rem ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set117));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dividers"


	public static class exponentiation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "exponentiation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:1: exponentiation : subexpression ( EXP ^ subexpression )? ;
	public final BLESS3Parser.exponentiation_return exponentiation() throws RecognitionException {
		BLESS3Parser.exponentiation_return retval = new BLESS3Parser.exponentiation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token EXP119=null;
		ParserRuleReturnScope subexpression118 =null;
		ParserRuleReturnScope subexpression120 =null;

		BAST EXP119_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:15: ( subexpression ( EXP ^ subexpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:3: subexpression ( EXP ^ subexpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_exponentiation5515);
			subexpression118=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression118.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:17: ( EXP ^ subexpression )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==EXP) ) {
				alt64=1;
			}
			switch (alt64) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:19: EXP ^ subexpression
					{
					EXP119=(Token)match(input,EXP,FOLLOW_EXP_in_exponentiation5519); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXP119_tree = (BAST)adaptor.create(EXP119);
					root_0 = (BAST)adaptor.becomeRoot(EXP119_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_exponentiation5522);
					subexpression120=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression120.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exponentiation"


	public static class subexpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:1: subexpression : (n= LITERAL_not te= timedExpression -> ^( $n $te) |abs= LITERAL_abs te= timedExpression -> ^( $abs $te) |trunc= LITERAL_truncate te= timedExpression -> ^( $trunc $te) |rnd= LITERAL_round te= timedExpression -> ^( $rnd $te) | MINUS te= timedExpression -> ^( UNARY_MINUS $te) |te= timedExpression -> $te);
	public final BLESS3Parser.subexpression_return subexpression() throws RecognitionException {
		BLESS3Parser.subexpression_return retval = new BLESS3Parser.subexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token n=null;
		Token abs=null;
		Token trunc=null;
		Token rnd=null;
		Token MINUS121=null;
		ParserRuleReturnScope te =null;

		BAST n_tree=null;
		BAST abs_tree=null;
		BAST trunc_tree=null;
		BAST rnd_tree=null;
		BAST MINUS121_tree=null;
		RewriteRuleTokenStream stream_LITERAL_not=new RewriteRuleTokenStream(adaptor,"token LITERAL_not");
		RewriteRuleTokenStream stream_LITERAL_round=new RewriteRuleTokenStream(adaptor,"token LITERAL_round");
		RewriteRuleTokenStream stream_LITERAL_abs=new RewriteRuleTokenStream(adaptor,"token LITERAL_abs");
		RewriteRuleTokenStream stream_LITERAL_truncate=new RewriteRuleTokenStream(adaptor,"token LITERAL_truncate");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_timedExpression=new RewriteRuleSubtreeStream(adaptor,"rule timedExpression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:14: (n= LITERAL_not te= timedExpression -> ^( $n $te) |abs= LITERAL_abs te= timedExpression -> ^( $abs $te) |trunc= LITERAL_truncate te= timedExpression -> ^( $trunc $te) |rnd= LITERAL_round te= timedExpression -> ^( $rnd $te) | MINUS te= timedExpression -> ^( UNARY_MINUS $te) |te= timedExpression -> $te)
			int alt65=6;
			switch ( input.LA(1) ) {
			case LITERAL_not:
				{
				alt65=1;
				}
				break;
			case LITERAL_abs:
				{
				alt65=2;
				}
				break;
			case LITERAL_truncate:
				{
				alt65=3;
				}
				break;
			case LITERAL_round:
				{
				alt65=4;
				}
				break;
			case MINUS:
				{
				alt65=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_self:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LPAREN:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt65=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:954:3: n= LITERAL_not te= timedExpression
					{
					n=(Token)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_not.add(n);

					pushFollow(FOLLOW_timedExpression_in_subexpression5545);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te, n
					// token labels: n
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 955:5: -> ^( $n $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:8: ^( $n $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:957:3: abs= LITERAL_abs te= timedExpression
					{
					abs=(Token)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_abs.add(abs);

					pushFollow(FOLLOW_timedExpression_in_subexpression5574);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: abs, te
					// token labels: abs
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_abs=new RewriteRuleTokenStream(adaptor,"token abs",abs);
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 958:5: -> ^( $abs $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:8: ^( $abs $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_abs.nextNode(), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:960:3: trunc= LITERAL_truncate te= timedExpression
					{
					trunc=(Token)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5599); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_truncate.add(trunc);

					pushFollow(FOLLOW_timedExpression_in_subexpression5603);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te, trunc
					// token labels: trunc
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_trunc=new RewriteRuleTokenStream(adaptor,"token trunc",trunc);
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 961:5: -> ^( $trunc $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:8: ^( $trunc $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_trunc.nextNode(), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:963:3: rnd= LITERAL_round te= timedExpression
					{
					rnd=(Token)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5628); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_round.add(rnd);

					pushFollow(FOLLOW_timedExpression_in_subexpression5632);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: rnd, te
					// token labels: rnd
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_rnd=new RewriteRuleTokenStream(adaptor,"token rnd",rnd);
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 964:5: -> ^( $rnd $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:964:8: ^( $rnd $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_rnd.nextNode(), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:966:2: MINUS te= timedExpression
					{
					MINUS121=(Token)match(input,MINUS,FOLLOW_MINUS_in_subexpression5654); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS121);

					pushFollow(FOLLOW_timedExpression_in_subexpression5658);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te
					// token labels: 
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 967:4: -> ^( UNARY_MINUS $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:7: ^( UNARY_MINUS $te)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
						adaptor.addChild(root_1, stream_te.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:969:2: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5680);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te
					// token labels: 
					// rule labels: te, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_te=new RewriteRuleSubtreeStream(adaptor,"rule te",te!=null?te.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 970:4: -> $te
					{
						adaptor.addChild(root_0, stream_te.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subexpression"


	public static class unaryOperator_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "unaryOperator"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:973:1: unaryOperator : ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round );
	public final BLESS3Parser.unaryOperator_return unaryOperator() throws RecognitionException {
		BLESS3Parser.unaryOperator_return retval = new BLESS3Parser.unaryOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set122=null;

		BAST set122_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:973:14: ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set122=input.LT(1);
			if ( input.LA(1)==LITERAL_abs||input.LA(1)==LITERAL_not||input.LA(1)==LITERAL_round||input.LA(1)==LITERAL_truncate ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set122));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryOperator"


	public static class timedExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "timedExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:977:1: timedExpression : timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? ;
	public final BLESS3Parser.timedExpression_return timedExpression() throws RecognitionException {
		BLESS3Parser.timedExpression_return retval = new BLESS3Parser.timedExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AT_SIGN124=null;
		Token TICK126=null;
		Token CARET127=null;
		ParserRuleReturnScope timedSubject123 =null;
		ParserRuleReturnScope subexpression125 =null;
		ParserRuleReturnScope periodShift128 =null;

		BAST AT_SIGN124_tree=null;
		BAST TICK126_tree=null;
		BAST CARET127_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:977:16: ( timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:978:3: timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_timedSubject_in_timedExpression5721);
			timedSubject123=timedSubject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, timedSubject123.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:979:3: ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			int alt66=4;
			switch ( input.LA(1) ) {
				case AT_SIGN:
					{
					alt66=1;
					}
					break;
				case TICK:
					{
					alt66=2;
					}
					break;
				case CARET:
					{
					alt66=3;
					}
					break;
			}
			switch (alt66) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:980:3: AT_SIGN ^ subexpression
					{
					AT_SIGN124=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5729); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_SIGN124_tree = (BAST)adaptor.create(AT_SIGN124);
					root_0 = (BAST)adaptor.becomeRoot(AT_SIGN124_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_timedExpression5732);
					subexpression125=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression125.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:981:5: TICK
					{
					TICK126=(Token)match(input,TICK,FOLLOW_TICK_in_timedExpression5738); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK126_tree = (BAST)adaptor.create(TICK126);
					adaptor.addChild(root_0, TICK126_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:982:5: CARET ^ periodShift
					{
					CARET127=(Token)match(input,CARET,FOLLOW_CARET_in_timedExpression5744); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CARET127_tree = (BAST)adaptor.create(CARET127);
					root_0 = (BAST)adaptor.becomeRoot(CARET127_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_timedExpression5747);
					periodShift128=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift128.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedExpression"


	public static class timedSubject_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "timedSubject"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:986:1: timedSubject : ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value );
	public final BLESS3Parser.timedSubject_return timedSubject() throws RecognitionException {
		BLESS3Parser.timedSubject_return retval = new BLESS3Parser.timedSubject_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalExpression129 =null;
		ParserRuleReturnScope parenthesizedSubexpression130 =null;
		ParserRuleReturnScope recordTerm131 =null;
		ParserRuleReturnScope invocation132 =null;
		ParserRuleReturnScope value133 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:986:13: ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value )
			int alt67=5;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==LPAREN) ) {
				int LA67_1 = input.LA(2);
				if ( (LA67_1==LITERAL_if) && (synpred114_BLESS3())) {
					alt67=1;
				}
				else if ( (LA67_1==AADL_STRING_LITERAL||LA67_1==ID||LA67_1==LBRACKET||LA67_1==LITERAL_abs||LA67_1==LITERAL_all||LA67_1==LITERAL_case||LA67_1==LITERAL_exists||LA67_1==LITERAL_false||(LA67_1 >= LITERAL_not && LA67_1 <= LITERAL_numberof)||LA67_1==LITERAL_product||LA67_1==LITERAL_round||LA67_1==LITERAL_self||LA67_1==LITERAL_sum||LA67_1==LITERAL_timeout||LA67_1==LITERAL_tops||(LA67_1 >= LITERAL_true && LA67_1 <= LITERAL_truncate)||LA67_1==LPAREN||LA67_1==MINUS||LA67_1==NUMBER||LA67_1==OCTOTHORPE||(LA67_1 >= QCLREF && LA67_1 <= QCREF)) ) {
					alt67=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA67_0==LBRACKET) && (synpred116_BLESS3())) {
				alt67=3;
			}
			else if ( (LA67_0==ID) ) {
				int LA67_3 = input.LA(2);
				if ( (LA67_3==LPAREN) && (synpred117_BLESS3())) {
					alt67=4;
				}
				else if ( (LA67_3==EOF||(LA67_3 >= AL && LA67_3 <= AMPERSAND)||LA67_3==AT_SIGN||(LA67_3 >= BOX && LA67_3 <= COLON)||(LA67_3 >= COMMA && LA67_3 <= COMMADOT)||LA67_3==CVP||(LA67_3 >= DIVIDE && LA67_3 <= DOTDOT)||LA67_3==EQ||LA67_3==EXP||(LA67_3 >= GT && LA67_3 <= GUARD)||(LA67_3 >= ID && LA67_3 <= IMP)||(LA67_3 >= LASS && LA67_3 <= LBRACKET)||LA67_3==LCURLY||LA67_3==LITERAL_and||LA67_3==LITERAL_are||LA67_3==LITERAL_computation||LA67_3==LITERAL_declare||(LA67_3 >= LITERAL_div && LA67_3 <= LITERAL_else)||LA67_3==LITERAL_exception||(LA67_3 >= LITERAL_fetchadd && LA67_3 <= LITERAL_fi)||(LA67_3 >= LITERAL_for && LA67_3 <= LITERAL_forall)||(LA67_3 >= LITERAL_if && LA67_3 <= LITERAL_iff)||(LA67_3 >= LITERAL_implies && LA67_3 <= LITERAL_in)||LA67_3==LITERAL_invariant||LA67_3==LITERAL_mod||LA67_3==LITERAL_of||LA67_3==LITERAL_or||LA67_3==LITERAL_rem||LA67_3==LITERAL_setmode||LA67_3==LITERAL_skip||LA67_3==LITERAL_states||(LA67_3 >= LITERAL_swap && LA67_3 <= LITERAL_then)||LA67_3==LITERAL_transitions||LA67_3==LITERAL_until||LA67_3==LITERAL_when||LA67_3==LITERAL_while||LA67_3==LITERAL_xor||LA67_3==LT||LA67_3==MINUS||LA67_3==NEQ||LA67_3==OLD_NEQ||LA67_3==PLUS||LA67_3==PLUS_EQUALS||LA67_3==QQ||(LA67_3 >= QUESTION && LA67_3 <= RCURLY)||LA67_3==RPAREN||LA67_3==SEMICOLON||LA67_3==TICK||LA67_3==TIMES||LA67_3==VERT) ) {
					alt67=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 67, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA67_0==AADL_STRING_LITERAL||LA67_0==LITERAL_false||(LA67_0 >= LITERAL_now && LA67_0 <= LITERAL_null)||LA67_0==LITERAL_self||LA67_0==LITERAL_timeout||LA67_0==LITERAL_tops||LA67_0==LITERAL_true||LA67_0==NUMBER||LA67_0==OCTOTHORPE||(LA67_0 >= QCLREF && LA67_0 <= QCREF)) ) {
				alt67=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 67, 0, input);
				throw nvae;
			}

			switch (alt67) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:3: ( LPAREN LITERAL_if )=> conditionalExpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5772);
					conditionalExpression129=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression129.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5778);
					parenthesizedSubexpression130=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression130.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:5: ( LBRACKET ID COLON )=> recordTerm
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordTerm_in_timedSubject5795);
					recordTerm131=recordTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordTerm131.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:5: ( ID LPAREN )=> invocation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_invocation_in_timedSubject5808);
					invocation132=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, invocation132.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:991:5: value
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_value_in_timedSubject5816);
					value133=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value133.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedSubject"


	public static class parenthesizedSubexpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "parenthesizedSubexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:994:1: parenthesizedSubexpression : LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN ;
	public final BLESS3Parser.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		BLESS3Parser.parenthesizedSubexpression_return retval = new BLESS3Parser.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN134=null;
		Token QQ136=null;
		Token COLON138=null;
		Token RPAREN140=null;
		ParserRuleReturnScope caseexpression =null;
		ParserRuleReturnScope expression135 =null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope expression139 =null;

		BAST LPAREN134_tree=null;
		BAST QQ136_tree=null;
		BAST COLON138_tree=null;
		BAST RPAREN140_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:994:27: ( LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:2: LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN134=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression5827); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN134_tree = (BAST)adaptor.create(LPAREN134);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN134_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:2: ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==AADL_STRING_LITERAL||LA69_0==ID||LA69_0==LBRACKET||LA69_0==LITERAL_abs||LA69_0==LITERAL_all||LA69_0==LITERAL_exists||LA69_0==LITERAL_false||(LA69_0 >= LITERAL_not && LA69_0 <= LITERAL_numberof)||LA69_0==LITERAL_product||LA69_0==LITERAL_round||LA69_0==LITERAL_self||LA69_0==LITERAL_sum||LA69_0==LITERAL_timeout||LA69_0==LITERAL_tops||(LA69_0 >= LITERAL_true && LA69_0 <= LITERAL_truncate)||LA69_0==LPAREN||LA69_0==MINUS||LA69_0==NUMBER||LA69_0==OCTOTHORPE||(LA69_0 >= QCLREF && LA69_0 <= QCREF)) ) {
				alt69=1;
			}
			else if ( (LA69_0==LITERAL_case) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:4: ( expression ( QQ ^ expression COLON ! expression )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:4: ( expression ( QQ ^ expression COLON ! expression )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:6: expression ( QQ ^ expression COLON ! expression )?
					{
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5840);
					expression135=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression135.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:17: ( QQ ^ expression COLON ! expression )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==QQ) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:19: QQ ^ expression COLON ! expression
							{
							QQ136=(Token)match(input,QQ,FOLLOW_QQ_in_parenthesizedSubexpression5844); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							QQ136_tree = (BAST)adaptor.create(QQ136);
							root_0 = (BAST)adaptor.becomeRoot(QQ136_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5847);
							expression137=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());

							COLON138=(Token)match(input,COLON,FOLLOW_COLON_in_parenthesizedSubexpression5849); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5852);
							expression139=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression139.getTree());

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:999:4: caseexpression= caseExpression
					{
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression5870);
					caseexpression=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseexpression.getTree());

					}
					break;

			}

			RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression5878); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN140_tree = (BAST)adaptor.create(RPAREN140);
			adaptor.addChild(root_0, RPAREN140_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parenthesizedSubexpression"


	public static class caseExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "caseExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:1: caseExpression : LITERAL_case ^ ( caseChoice )+ ;
	public final BLESS3Parser.caseExpression_return caseExpression() throws RecognitionException {
		BLESS3Parser.caseExpression_return retval = new BLESS3Parser.caseExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_case141=null;
		ParserRuleReturnScope caseChoice142 =null;

		BAST LITERAL_case141_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:15: ( LITERAL_case ^ ( caseChoice )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:3: LITERAL_case ^ ( caseChoice )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_case141=(Token)match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression5888); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_case141_tree = (BAST)adaptor.create(LITERAL_case141);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_case141_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:17: ( caseChoice )+
			int cnt70=0;
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==LPAREN) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:17: caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression5891);
					caseChoice142=caseChoice();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseChoice142.getTree());

					}
					break;

				default :
					if ( cnt70 >= 1 ) break loop70;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(70, input);
					throw eee;
				}
				cnt70++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseExpression"


	public static class caseChoice_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "caseChoice"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1008:1: caseChoice : LPAREN !bool= expression IMP ^exp= expression RPAREN !;
	public final BLESS3Parser.caseChoice_return caseChoice() throws RecognitionException {
		BLESS3Parser.caseChoice_return retval = new BLESS3Parser.caseChoice_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN143=null;
		Token IMP144=null;
		Token RPAREN145=null;
		ParserRuleReturnScope bool =null;
		ParserRuleReturnScope exp =null;

		BAST LPAREN143_tree=null;
		BAST IMP144_tree=null;
		BAST RPAREN145_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1009:3: ( LPAREN !bool= expression IMP ^exp= expression RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1010:3: LPAREN !bool= expression IMP ^exp= expression RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN143=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_caseChoice5907); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseChoice5912);
			bool=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

			IMP144=(Token)match(input,IMP,FOLLOW_IMP_in_caseChoice5914); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP144_tree = (BAST)adaptor.create(IMP144);
			root_0 = (BAST)adaptor.becomeRoot(IMP144_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_caseChoice5919);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN145=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_caseChoice5921); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseChoice"


	public static class conditionalExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "conditionalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1013:1: conditionalExpression : lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) ;
	public final BLESS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		BLESS3Parser.conditionalExpression_return retval = new BLESS3Parser.conditionalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lp=null;
		Token rp=null;
		Token LITERAL_if146=null;
		Token LITERAL_then147=null;
		Token LITERAL_else148=null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope f =null;

		BAST lp_tree=null;
		BAST rp_tree=null;
		BAST LITERAL_if146_tree=null;
		BAST LITERAL_then147_tree=null;
		BAST LITERAL_else148_tree=null;
		RewriteRuleTokenStream stream_LITERAL_else=new RewriteRuleTokenStream(adaptor,"token LITERAL_else");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LITERAL_then=new RewriteRuleTokenStream(adaptor,"token LITERAL_then");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1013:22: (lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:3: lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression5937); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			LITERAL_if146=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_conditionalExpression5939); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(LITERAL_if146);

			pushFollow(FOLLOW_expression_in_conditionalExpression5943);
			pred=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(pred.getTree());
			LITERAL_then147=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conditionalExpression5945); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_then.add(LITERAL_then147);

			pushFollow(FOLLOW_expression_in_conditionalExpression5949);
			t=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(t.getTree());
			LITERAL_else148=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_conditionalExpression5951); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_else.add(LITERAL_else148);

			pushFollow(FOLLOW_expression_in_conditionalExpression5955);
			f=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(f.getTree());
			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression5959); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: f, lp, pred, t, rp
			// token labels: lp, rp
			// rule labels: t, pred, f, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lp=new RewriteRuleTokenStream(adaptor,"token lp",lp);
			RewriteRuleTokenStream stream_rp=new RewriteRuleTokenStream(adaptor,"token rp",rp);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1015:5: -> ^( $lp ^( QQ $pred $t $f) $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:8: ^( $lp ^( QQ $pred $t $f) $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:15: ^( QQ $pred $t $f)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QQ, "QQ"), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_2, stream_t.nextTree());
				adaptor.addChild(root_2, stream_f.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_rp.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class recordTerm_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1018:1: recordTerm : LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) ;
	public final BLESS3Parser.recordTerm_return recordTerm() throws RecognitionException {
		BLESS3Parser.recordTerm_return retval = new BLESS3Parser.recordTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token typeid=null;
		Token LBRACKET149=null;
		Token COLON150=null;
		Token RBRACKET151=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		BAST typeid_tree=null;
		BAST LBRACKET149_tree=null;
		BAST COLON150_tree=null;
		BAST RBRACKET151_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_recordValue=new RewriteRuleSubtreeStream(adaptor,"rule recordValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:3: ( LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1020:3: LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET
			{
			LBRACKET149=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_recordTerm6005); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET149);

			typeid=(Token)match(input,ID,FOLLOW_ID_in_recordTerm6009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(typeid);

			COLON150=(Token)match(input,COLON,FOLLOW_COLON_in_recordTerm6011); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON150);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1020:31: (prv+= recordValue )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1020:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6015);
					prv=recordValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_recordValue.add(prv.getTree());
					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTree());
					}
					break;

				default :
					if ( cnt71 >= 1 ) break loop71;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(71, input);
					throw eee;
				}
				cnt71++;
			}

			RBRACKET151=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_recordTerm6018); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET151);

			// AST REWRITE
			// elements: typeid, prv
			// token labels: typeid
			// rule labels: retval
			// token list labels: 
			// rule list labels: prv
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_typeid=new RewriteRuleTokenStream(adaptor,"token typeid",typeid);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_prv=new RewriteRuleSubtreeStream(adaptor,"token prv",list_prv);
			root_0 = (BAST)adaptor.nil();
			// 1021:5: -> ^( RECORD_TERM $typeid ( $prv)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1021:8: ^( RECORD_TERM $typeid ( $prv)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RECORD_TERM, "RECORD_TERM"), root_1);
				adaptor.addChild(root_1, stream_typeid.nextNode());
				if ( !(stream_prv.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_prv.hasNext() ) {
					adaptor.addChild(root_1, stream_prv.nextTree());
				}
				stream_prv.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordTerm"


	public static class recordValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "recordValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1024:1: recordValue : identifier ARROW ^ value SEMICOLON !;
	public final BLESS3Parser.recordValue_return recordValue() throws RecognitionException {
		BLESS3Parser.recordValue_return retval = new BLESS3Parser.recordValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ARROW153=null;
		Token SEMICOLON155=null;
		ParserRuleReturnScope identifier152 =null;
		ParserRuleReturnScope value154 =null;

		BAST ARROW153_tree=null;
		BAST SEMICOLON155_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1025:3: ( identifier ARROW ^ value SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1026:20: identifier ARROW ^ value SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_recordValue6054);
			identifier152=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier152.getTree());

			ARROW153=(Token)match(input,ARROW,FOLLOW_ARROW_in_recordValue6056); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARROW153_tree = (BAST)adaptor.create(ARROW153);
			root_0 = (BAST)adaptor.becomeRoot(ARROW153_tree, root_0);
			}

			pushFollow(FOLLOW_value_in_recordValue6059);
			value154=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value154.getTree());

			SEMICOLON155=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordValue6061); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordValue"


	public static class periodShift_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "periodShift"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1029:1: periodShift : (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) ;
	public final BLESS3Parser.periodShift_return periodShift() throws RecognitionException {
		BLESS3Parser.periodShift_return retval = new BLESS3Parser.periodShift_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token m=null;
		Token lp=null;
		Token rp=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope ie =null;

		BAST m_tree=null;
		BAST lp_tree=null;
		BAST rp_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_indexExpression=new RewriteRuleSubtreeStream(adaptor,"rule indexExpression");
		RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1029:12: ( (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:2: (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:2: (m= MINUS )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==MINUS) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:4: m= MINUS
					{
					m=(Token)match(input,MINUS,FOLLOW_MINUS_in_periodShift6081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(m);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:2: (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==AADL_STRING_LITERAL||LA73_0==ID||LA73_0==LITERAL_false||(LA73_0 >= LITERAL_now && LA73_0 <= LITERAL_null)||LA73_0==LITERAL_self||LA73_0==LITERAL_timeout||LA73_0==LITERAL_tops||LA73_0==LITERAL_true||LA73_0==NUMBER||LA73_0==OCTOTHORPE||(LA73_0 >= QCLREF && LA73_0 <= QCREF)) ) {
				alt73=1;
			}
			else if ( (LA73_0==LPAREN) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1032:4: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift6094);
					v=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(v.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1034:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1034:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1034:5: lp= LPAREN ie= indexExpression rp= RPAREN
					{
					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_periodShift6108); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					pushFollow(FOLLOW_indexExpression_in_periodShift6112);
					ie=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpression.add(ie.getTree());
					rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_periodShift6116); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(rp);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: lp, ie, rp, v, lp, ie, v, rp
			// token labels: lp, rp
			// rule labels: v, ie, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lp=new RewriteRuleTokenStream(adaptor,"token lp",lp);
			RewriteRuleTokenStream stream_rp=new RewriteRuleTokenStream(adaptor,"token rp",rp);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_ie=new RewriteRuleSubtreeStream(adaptor,"rule ie",ie!=null?ie.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1036:2: -> {m!=null&&v!=null}? ^( UNARY_MINUS $v)
			if (m!=null&&v!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:25: ^( UNARY_MINUS $v)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1037:2: -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) )
			if (m!=null&&ie!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1037:26: ^( UNARY_MINUS ^( $lp $ie $rp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1037:41: ^( $lp $ie $rp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ie.nextTree());
				adaptor.addChild(root_2, stream_rp.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1038:2: -> {m==null&&v!=null}? $v
			if (m==null&&v!=null) {
				adaptor.addChild(root_0, stream_v.nextTree());
			}

			else // 1039:2: -> ^( $lp $ie $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1039:5: ^( $lp $ie $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ie.nextTree());
				adaptor.addChild(root_1, stream_rp.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "periodShift"


	public static class indexExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "indexExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1042:1: indexExpression : periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? ;
	public final BLESS3Parser.indexExpression_return indexExpression() throws RecognitionException {
		BLESS3Parser.indexExpression_return retval = new BLESS3Parser.indexExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS157=null;
		Token LITERAL_div159=null;
		Token LITERAL_mod161=null;
		Token LITERAL_rem163=null;
		Token PLUS165=null;
		Token PLUS167=null;
		Token TIMES169=null;
		Token TIMES171=null;
		ParserRuleReturnScope periodShift156 =null;
		ParserRuleReturnScope periodShift158 =null;
		ParserRuleReturnScope periodShift160 =null;
		ParserRuleReturnScope periodShift162 =null;
		ParserRuleReturnScope periodShift164 =null;
		ParserRuleReturnScope periodShift166 =null;
		ParserRuleReturnScope periodShift168 =null;
		ParserRuleReturnScope periodShift170 =null;
		ParserRuleReturnScope periodShift172 =null;

		BAST MINUS157_tree=null;
		BAST LITERAL_div159_tree=null;
		BAST LITERAL_mod161_tree=null;
		BAST LITERAL_rem163_tree=null;
		BAST PLUS165_tree=null;
		BAST PLUS167_tree=null;
		BAST TIMES169_tree=null;
		BAST TIMES171_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1042:16: ( periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:2: periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_periodShift_in_indexExpression6196);
			periodShift156=periodShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift156.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1044:2: ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			int alt76=7;
			switch ( input.LA(1) ) {
				case MINUS:
					{
					alt76=1;
					}
					break;
				case LITERAL_div:
					{
					alt76=2;
					}
					break;
				case LITERAL_mod:
					{
					alt76=3;
					}
					break;
				case LITERAL_rem:
					{
					alt76=4;
					}
					break;
				case PLUS:
					{
					alt76=5;
					}
					break;
				case TIMES:
					{
					alt76=6;
					}
					break;
			}
			switch (alt76) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1045:4: MINUS ^ periodShift
					{
					MINUS157=(Token)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6204); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS157_tree = (BAST)adaptor.create(MINUS157);
					root_0 = (BAST)adaptor.becomeRoot(MINUS157_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6207);
					periodShift158=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift158.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1047:4: LITERAL_div ^ periodShift
					{
					LITERAL_div159=(Token)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6217); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_div159_tree = (BAST)adaptor.create(LITERAL_div159);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_div159_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6220);
					periodShift160=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift160.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1049:4: LITERAL_mod ^ periodShift
					{
					LITERAL_mod161=(Token)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6230); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_mod161_tree = (BAST)adaptor.create(LITERAL_mod161);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_mod161_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6233);
					periodShift162=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift162.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1051:4: LITERAL_rem ^ periodShift
					{
					LITERAL_rem163=(Token)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6243); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_rem163_tree = (BAST)adaptor.create(LITERAL_rem163);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_rem163_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6246);
					periodShift164=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift164.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1053:4: PLUS ^ periodShift ( PLUS ! periodShift )*
					{
					PLUS165=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6256); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS165_tree = (BAST)adaptor.create(PLUS165);
					root_0 = (BAST)adaptor.becomeRoot(PLUS165_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6259);
					periodShift166=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift166.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1053:22: ( PLUS ! periodShift )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==PLUS) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1053:24: PLUS ! periodShift
							{
							PLUS167=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6263); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6266);
							periodShift168=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift168.getTree());

							}
							break;

						default :
							break loop74;
						}
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1055:4: TIMES ^ periodShift ( TIMES ! periodShift )*
					{
					TIMES169=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES169_tree = (BAST)adaptor.create(TIMES169);
					root_0 = (BAST)adaptor.becomeRoot(TIMES169_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6282);
					periodShift170=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift170.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1055:23: ( TIMES ! periodShift )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==TIMES) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1055:25: TIMES ! periodShift
							{
							TIMES171=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6286); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6289);
							periodShift172=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift172.getTree());

							}
							break;

						default :
							break loop75;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexExpression"


	public static class indexExpressionOrRange_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "indexExpressionOrRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:1: indexExpressionOrRange : indexExpression ( DOTDOT ^ indexExpression )? ;
	public final BLESS3Parser.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		BLESS3Parser.indexExpressionOrRange_return retval = new BLESS3Parser.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT174=null;
		ParserRuleReturnScope indexExpression173 =null;
		ParserRuleReturnScope indexExpression175 =null;

		BAST DOTDOT174_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:23: ( indexExpression ( DOTDOT ^ indexExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:2: indexExpression ( DOTDOT ^ indexExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6306);
			indexExpression173=indexExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression173.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:18: ( DOTDOT ^ indexExpression )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==DOTDOT) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:20: DOTDOT ^ indexExpression
					{
					DOTDOT174=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT174_tree = (BAST)adaptor.create(DOTDOT174);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT174_tree, root_0);
					}

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6313);
					indexExpression175=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression175.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexExpressionOrRange"


	public static class value_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "value"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1065:1: value : ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue );
	public final BLESS3Parser.value_return value() throws RecognitionException {
		BLESS3Parser.value_return retval = new BLESS3Parser.value_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout178=null;
		Token LITERAL_now179=null;
		Token LITERAL_tops180=null;
		ParserRuleReturnScope valueName176 =null;
		ParserRuleReturnScope constant177 =null;
		ParserRuleReturnScope enumerationValue181 =null;

		BAST LITERAL_timeout178_tree=null;
		BAST LITERAL_now179_tree=null;
		BAST LITERAL_tops180_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1065:6: ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue )
			int alt78=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA78_1 = input.LA(2);
				if ( (LA78_1==TICK) ) {
					int LA78_6 = input.LA(3);
					if ( (LA78_6==ID) ) {
						switch ( input.LA(4) ) {
						case ASSIGN:
						case DOLLAR:
						case DOT:
						case EXCLAMATION:
						case LBRACKET:
						case LPAREN:
						case QUESTION:
						case TILDE:
							{
							alt78=1;
							}
							break;
						case EOF:
						case AL:
						case AM:
						case AMPERSAND:
						case AT_SIGN:
						case BOX:
						case CARET:
						case COLON:
						case COMMA:
						case COMMACOMMA:
						case COMMADOT:
						case CVP:
						case DIVIDE:
						case DOTCOMMA:
						case DOTDOT:
						case EQ:
						case EXP:
						case GT:
						case GUARD:
						case ID:
						case IMP:
						case LASS:
						case LCURLY:
						case LITERAL_and:
						case LITERAL_are:
						case LITERAL_computation:
						case LITERAL_declare:
						case LITERAL_div:
						case LITERAL_do:
						case LITERAL_else:
						case LITERAL_exception:
						case LITERAL_fetchadd:
						case LITERAL_fetchand:
						case LITERAL_fetchor:
						case LITERAL_fetchxor:
						case LITERAL_fi:
						case LITERAL_for:
						case LITERAL_forall:
						case LITERAL_if:
						case LITERAL_iff:
						case LITERAL_implies:
						case LITERAL_in:
						case LITERAL_invariant:
						case LITERAL_mod:
						case LITERAL_of:
						case LITERAL_or:
						case LITERAL_rem:
						case LITERAL_setmode:
						case LITERAL_skip:
						case LITERAL_states:
						case LITERAL_swap:
						case LITERAL_that:
						case LITERAL_then:
						case LITERAL_transitions:
						case LITERAL_until:
						case LITERAL_when:
						case LITERAL_while:
						case LITERAL_xor:
						case LT:
						case MINUS:
						case NEQ:
						case OLD_NEQ:
						case PLUS:
						case PLUS_EQUALS:
						case QQ:
						case RASS:
						case RBRACKET:
						case RCON:
						case RCURLY:
						case RPAREN:
						case SEMICOLON:
						case TIMES:
						case VERT:
							{
							alt78=6;
							}
							break;
						case TICK:
							{
							int LA78_10 = input.LA(5);
							if ( (LA78_10==ASSIGN||LA78_10==LITERAL_count||LA78_10==LITERAL_fresh||LA78_10==LITERAL_updated) ) {
								alt78=1;
							}
							else if ( (LA78_10==EOF||(LA78_10 >= AL && LA78_10 <= AMPERSAND)||LA78_10==BOX||LA78_10==COLON||(LA78_10 >= COMMA && LA78_10 <= COMMADOT)||LA78_10==CVP||LA78_10==DIVIDE||(LA78_10 >= DOTCOMMA && LA78_10 <= DOTDOT)||LA78_10==EQ||LA78_10==EXP||(LA78_10 >= GT && LA78_10 <= GUARD)||(LA78_10 >= ID && LA78_10 <= IMP)||LA78_10==LASS||LA78_10==LCURLY||LA78_10==LITERAL_and||LA78_10==LITERAL_are||LA78_10==LITERAL_computation||LA78_10==LITERAL_declare||(LA78_10 >= LITERAL_div && LA78_10 <= LITERAL_else)||LA78_10==LITERAL_exception||(LA78_10 >= LITERAL_fetchadd && LA78_10 <= LITERAL_fi)||(LA78_10 >= LITERAL_for && LA78_10 <= LITERAL_forall)||(LA78_10 >= LITERAL_if && LA78_10 <= LITERAL_iff)||(LA78_10 >= LITERAL_implies && LA78_10 <= LITERAL_in)||LA78_10==LITERAL_invariant||LA78_10==LITERAL_mod||LA78_10==LITERAL_of||LA78_10==LITERAL_or||LA78_10==LITERAL_rem||LA78_10==LITERAL_setmode||LA78_10==LITERAL_skip||LA78_10==LITERAL_states||(LA78_10 >= LITERAL_swap && LA78_10 <= LITERAL_then)||LA78_10==LITERAL_transitions||LA78_10==LITERAL_until||LA78_10==LITERAL_when||LA78_10==LITERAL_while||LA78_10==LITERAL_xor||LA78_10==LT||LA78_10==MINUS||LA78_10==NEQ||LA78_10==OLD_NEQ||LA78_10==PLUS||LA78_10==PLUS_EQUALS||LA78_10==QQ||(LA78_10 >= RASS && LA78_10 <= RCURLY)||LA78_10==RPAREN||LA78_10==SEMICOLON||LA78_10==TIMES||LA78_10==VERT) ) {
								alt78=6;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 78, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 78, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA78_6==EOF||(LA78_6 >= AL && LA78_6 <= AMPERSAND)||LA78_6==BOX||LA78_6==COLON||(LA78_6 >= COMMA && LA78_6 <= COMMADOT)||LA78_6==CVP||LA78_6==DIVIDE||(LA78_6 >= DOTCOMMA && LA78_6 <= DOTDOT)||LA78_6==EQ||LA78_6==EXP||(LA78_6 >= GT && LA78_6 <= GUARD)||LA78_6==IMP||LA78_6==LASS||LA78_6==LCURLY||LA78_6==LITERAL_and||LA78_6==LITERAL_are||LA78_6==LITERAL_computation||(LA78_6 >= LITERAL_count && LA78_6 <= LITERAL_declare)||(LA78_6 >= LITERAL_div && LA78_6 <= LITERAL_else)||LA78_6==LITERAL_exception||(LA78_6 >= LITERAL_fetchadd && LA78_6 <= LITERAL_fi)||(LA78_6 >= LITERAL_for && LA78_6 <= LITERAL_fresh)||(LA78_6 >= LITERAL_if && LA78_6 <= LITERAL_iff)||(LA78_6 >= LITERAL_implies && LA78_6 <= LITERAL_in)||LA78_6==LITERAL_invariant||LA78_6==LITERAL_mod||LA78_6==LITERAL_of||LA78_6==LITERAL_or||LA78_6==LITERAL_rem||LA78_6==LITERAL_setmode||LA78_6==LITERAL_skip||LA78_6==LITERAL_states||(LA78_6 >= LITERAL_swap && LA78_6 <= LITERAL_then)||LA78_6==LITERAL_transitions||(LA78_6 >= LITERAL_until && LA78_6 <= LITERAL_updated)||LA78_6==LITERAL_when||LA78_6==LITERAL_while||LA78_6==LITERAL_xor||LA78_6==LT||LA78_6==MINUS||LA78_6==NEQ||LA78_6==OLD_NEQ||LA78_6==PLUS||LA78_6==PLUS_EQUALS||LA78_6==QQ||(LA78_6 >= RASS && LA78_6 <= RCURLY)||LA78_6==RPAREN||LA78_6==SEMICOLON||LA78_6==TIMES||LA78_6==VERT) ) {
						alt78=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 78, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA78_1==EOF||(LA78_1 >= AL && LA78_1 <= AMPERSAND)||LA78_1==AT_SIGN||(LA78_1 >= BOX && LA78_1 <= COLON)||(LA78_1 >= COMMA && LA78_1 <= COMMADOT)||LA78_1==CVP||(LA78_1 >= DIVIDE && LA78_1 <= DOTDOT)||LA78_1==EQ||LA78_1==EXP||(LA78_1 >= GT && LA78_1 <= GUARD)||(LA78_1 >= ID && LA78_1 <= IMP)||(LA78_1 >= LASS && LA78_1 <= LBRACKET)||LA78_1==LCURLY||LA78_1==LITERAL_and||LA78_1==LITERAL_are||LA78_1==LITERAL_computation||LA78_1==LITERAL_declare||(LA78_1 >= LITERAL_div && LA78_1 <= LITERAL_else)||LA78_1==LITERAL_exception||(LA78_1 >= LITERAL_fetchadd && LA78_1 <= LITERAL_fi)||(LA78_1 >= LITERAL_for && LA78_1 <= LITERAL_forall)||(LA78_1 >= LITERAL_if && LA78_1 <= LITERAL_iff)||(LA78_1 >= LITERAL_implies && LA78_1 <= LITERAL_in)||LA78_1==LITERAL_invariant||LA78_1==LITERAL_mod||LA78_1==LITERAL_of||LA78_1==LITERAL_or||LA78_1==LITERAL_rem||LA78_1==LITERAL_setmode||LA78_1==LITERAL_skip||LA78_1==LITERAL_states||(LA78_1 >= LITERAL_swap && LA78_1 <= LITERAL_then)||LA78_1==LITERAL_transitions||LA78_1==LITERAL_until||LA78_1==LITERAL_when||LA78_1==LITERAL_while||LA78_1==LITERAL_xor||LA78_1==LT||LA78_1==MINUS||LA78_1==NEQ||LA78_1==OLD_NEQ||LA78_1==PLUS||LA78_1==PLUS_EQUALS||LA78_1==QQ||(LA78_1 >= QUESTION && LA78_1 <= RCURLY)||LA78_1==RPAREN||LA78_1==SEMICOLON||LA78_1==TIMES||LA78_1==VERT) ) {
					alt78=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 78, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_self:
			case LITERAL_true:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt78=2;
				}
				break;
			case LITERAL_timeout:
				{
				alt78=3;
				}
				break;
			case LITERAL_now:
				{
				alt78=4;
				}
				break;
			case LITERAL_tops:
				{
				alt78=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1066:3: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_value6329);
					valueName176=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName176.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1068:3: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_value6337);
					constant177=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant177.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1070:3: LITERAL_timeout
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout178=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6345); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout178_tree = (BAST)adaptor.create(LITERAL_timeout178);
					adaptor.addChild(root_0, LITERAL_timeout178_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1072:3: LITERAL_now
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_now179=(Token)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6353); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_now179_tree = (BAST)adaptor.create(LITERAL_now179);
					adaptor.addChild(root_0, LITERAL_now179_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1074:3: LITERAL_tops
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_tops180=(Token)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6361); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_tops180_tree = (BAST)adaptor.create(LITERAL_tops180);
					adaptor.addChild(root_0, LITERAL_tops180_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1076:3: enumerationValue
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationValue_in_value6369);
					enumerationValue181=enumerationValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationValue181.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class valueName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "valueName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1079:1: valueName : id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id;
	public final BLESS3Parser.valueName_return valueName() throws RecognitionException {
		BLESS3Parser.valueName_return retval = new BLESS3Parser.valueName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token dol=null;
		Token lp=null;
		Token lb=null;
		Token dot=null;
		Token q=null;
		Token t=null;
		Token fresh=null;
		Token count=null;
		Token updated=null;
		Token RPAREN182=null;
		Token RBRACKET183=null;
		Token LBRACKET184=null;
		Token RBRACKET185=null;
		Token DOT186=null;
		List<Object> list_array_index=null;
		List<Object> list_pn=null;
		ParserRuleReturnScope pr =null;
		RuleReturnScope array_index = null;
		RuleReturnScope pn = null;
		BAST id_tree=null;
		BAST dol_tree=null;
		BAST lp_tree=null;
		BAST lb_tree=null;
		BAST dot_tree=null;
		BAST q_tree=null;
		BAST t_tree=null;
		BAST fresh_tree=null;
		BAST count_tree=null;
		BAST updated_tree=null;
		BAST RPAREN182_tree=null;
		BAST RBRACKET183_tree=null;
		BAST LBRACKET184_tree=null;
		BAST RBRACKET185_tree=null;
		BAST DOT186_tree=null;
		RewriteRuleTokenStream stream_LITERAL_count=new RewriteRuleTokenStream(adaptor,"token LITERAL_count");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_DOLLAR=new RewriteRuleTokenStream(adaptor,"token DOLLAR");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_TICK=new RewriteRuleTokenStream(adaptor,"token TICK");
		RewriteRuleTokenStream stream_LITERAL_fresh=new RewriteRuleTokenStream(adaptor,"token LITERAL_fresh");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_updated=new RewriteRuleTokenStream(adaptor,"token LITERAL_updated");
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_partialName=new RewriteRuleSubtreeStream(adaptor,"rule partialName");
		RewriteRuleSubtreeStream stream_functionParameters=new RewriteRuleSubtreeStream(adaptor,"rule functionParameters");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1079:10: (id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1080:3: id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_valueName6384); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:5: (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==DOLLAR) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:7: dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN
					{
					dol=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOLLAR.add(dol);

					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueName6402); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:31: (pr= functionParameters )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==ID) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:31: pr= functionParameters
							{
							pushFollow(FOLLOW_functionParameters_in_valueName6407);
							pr=functionParameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_functionParameters.add(pr.getTree());
							}
							break;

					}

					RPAREN182=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueName6410); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN182);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:4: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==LBRACKET) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:6: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6422); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6426);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET183=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6428); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET183);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:6: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==LBRACKET) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:8: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET184=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6438); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET184);

							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6442);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET185=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6444); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET185);

							}
							break;

						default :
							break loop81;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:4: (dot= DOT pn+= partialName ( DOT pn+= partialName )* )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==DOT) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:6: dot= DOT pn+= partialName ( DOT pn+= partialName )*
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6460); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					pushFollow(FOLLOW_partialName_in_valueName6464);
					pn=partialName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
					if (list_pn==null) list_pn=new ArrayList<Object>();
					list_pn.add(pn.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:30: ( DOT pn+= partialName )*
					loop83:
					while (true) {
						int alt83=2;
						int LA83_0 = input.LA(1);
						if ( (LA83_0==DOT) ) {
							alt83=1;
						}

						switch (alt83) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:32: DOT pn+= partialName
							{
							DOT186=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6468); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(DOT186);

							pushFollow(FOLLOW_partialName_in_valueName6472);
							pn=partialName();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTree());
							}
							break;

						default :
							break loop83;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1086:5: (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			int alt85=5;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==QUESTION) ) {
				alt85=1;
			}
			else if ( (LA85_0==TICK) ) {
				switch ( input.LA(2) ) {
					case LITERAL_fresh:
						{
						alt85=2;
						}
						break;
					case LITERAL_count:
						{
						alt85=3;
						}
						break;
					case LITERAL_updated:
						{
						alt85=4;
						}
						break;
				}
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1086:8: q= QUESTION
					{
					q=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6489); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(q);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1087:7: t= TICK fresh= LITERAL_fresh
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6501); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					fresh=(Token)match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6505); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_fresh.add(fresh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:7: t= TICK count= LITERAL_count
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6516); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					count=(Token)match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6520); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_count.add(count);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1089:7: t= TICK updated= LITERAL_updated
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6530); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					updated=(Token)match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6534); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_updated.add(updated);

					}
					break;

			}

			// AST REWRITE
			// elements: t, id, array_index, id, count, pr, q, array_index, id, updated, lb, fresh, id, id, pn, DOT, id, id, dot, t, dot, pn, id, lb, t, id, dol
			// token labels: dol, q, t, lb, count, dot, id, fresh, updated
			// rule labels: pr, retval
			// token list labels: 
			// rule list labels: array_index, pn
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dol=new RewriteRuleTokenStream(adaptor,"token dol",dol);
			RewriteRuleTokenStream stream_q=new RewriteRuleTokenStream(adaptor,"token q",q);
			RewriteRuleTokenStream stream_t=new RewriteRuleTokenStream(adaptor,"token t",t);
			RewriteRuleTokenStream stream_lb=new RewriteRuleTokenStream(adaptor,"token lb",lb);
			RewriteRuleTokenStream stream_count=new RewriteRuleTokenStream(adaptor,"token count",count);
			RewriteRuleTokenStream stream_dot=new RewriteRuleTokenStream(adaptor,"token dot",dot);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_fresh=new RewriteRuleTokenStream(adaptor,"token fresh",fresh);
			RewriteRuleTokenStream stream_updated=new RewriteRuleTokenStream(adaptor,"token updated",updated);
			RewriteRuleSubtreeStream stream_pr=new RewriteRuleSubtreeStream(adaptor,"rule pr",pr!=null?pr.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_array_index=new RewriteRuleSubtreeStream(adaptor,"token array_index",list_array_index);
			RewriteRuleSubtreeStream stream_pn=new RewriteRuleSubtreeStream(adaptor,"token pn",list_pn);
			root_0 = (BAST)adaptor.nil();
			// 1092:3: -> {dol!=null}? ^( $id $dol $pr)
			if (dol!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:19: ^( $id $dol $pr)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				adaptor.addChild(root_1, stream_dol.nextNode());
				adaptor.addChild(root_1, stream_pr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1093:3: -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
			if (lb!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:29: ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:36: ^( $lb ( $array_index)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_array_index.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_index.hasNext() ) {
					adaptor.addChild(root_2, stream_array_index.nextTree());
				}
				stream_array_index.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:59: ^( $dot ( $pn)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				if ( !(stream_pn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_pn.hasNext() ) {
					adaptor.addChild(root_2, stream_pn.nextTree());
				}
				stream_pn.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1094:3: -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT )
			if (lb!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:29: ^( $id ^( $lb ( $array_index)+ ) DOT )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:36: ^( $lb ( $array_index)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_array_index.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_index.hasNext() ) {
					adaptor.addChild(root_2, stream_array_index.nextTree());
				}
				stream_array_index.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_DOT.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1095:3: -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) )
			if (lb==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1095:29: ^( $id ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1095:36: ^( $dot ( $pn)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				if ( !(stream_pn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_pn.hasNext() ) {
					adaptor.addChild(root_2, stream_pn.nextTree());
				}
				stream_pn.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1096:3: -> {q!=null}? ^( $q $id)
			if (q!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1096:17: ^( $q $id)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_q.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1097:3: -> {fresh!=null}? ^( $t $id $fresh)
			if (fresh!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1097:21: ^( $t $id $fresh)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fresh.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1098:3: -> {count!=null}? ^( $t $id $count)
			if (count!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1098:21: ^( $t $id $count)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_count.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1099:3: -> {updated!=null}? ^( $t $id $updated)
			if (updated!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1099:23: ^( $t $id $updated)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_updated.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1100:3: -> $id
			{
				adaptor.addChild(root_0, stream_id.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueName"


	public static class functionParameters_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "functionParameters"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:1: functionParameters :parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? ;
	public final BLESS3Parser.functionParameters_return functionParameters() throws RecognitionException {
		BLESS3Parser.functionParameters_return retval = new BLESS3Parser.functionParameters_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA187=null;
		Token COMMA188=null;
		List<Object> list_parameters=null;
		RuleReturnScope parameters = null;
		BAST COMMA187_tree=null;
		BAST COMMA188_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:19: (parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:3: parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6742);
			parameters=formalExpressionPair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

			if (list_parameters==null) list_parameters=new ArrayList<Object>();
			list_parameters.add(parameters.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:36: ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==COMMA) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:38: COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )*
					{
					COMMA187=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6746); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA187_tree = (BAST)adaptor.create(COMMA187);
					root_0 = (BAST)adaptor.becomeRoot(COMMA187_tree, root_0);
					}

					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6751);
					parameters=formalExpressionPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1105:3: ( COMMA !parameters+= formalExpressionPair )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==COMMA) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1105:5: COMMA !parameters+= formalExpressionPair
							{
							COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6758); if (state.failed) return retval;
							pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6763);
							parameters=formalExpressionPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

							if (list_parameters==null) list_parameters=new ArrayList<Object>();
							list_parameters.add(parameters.getTree());
							}
							break;

						default :
							break loop86;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionParameters"


	public static class formalExpressionPair_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "formalExpressionPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1108:1: formalExpressionPair : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		BLESS3Parser.formalExpressionPair_return retval = new BLESS3Parser.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON189=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON189_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1108:21: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1109:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_formalExpressionPair6781); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON189=(Token)match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6789); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON189_tree = (BAST)adaptor.create(COLON189);
			root_0 = (BAST)adaptor.becomeRoot(COLON189_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_formalExpressionPair6794);
			actual=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actual.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalExpressionPair"


	public static class partialName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "partialName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1113:1: partialName : record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id;
	public final BLESS3Parser.partialName_return partialName() throws RecognitionException {
		BLESS3Parser.partialName_return retval = new BLESS3Parser.partialName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token record_id=null;
		Token lb=null;
		Token RBRACKET190=null;
		Token LBRACKET191=null;
		Token RBRACKET192=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		BAST record_id_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET190_tree=null;
		BAST LBRACKET191_tree=null;
		BAST RBRACKET192_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1113:12: (record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:2: record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			{
			record_id=(Token)match(input,ID,FOLLOW_ID_in_partialName6807); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(record_id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:3: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==LBRACKET) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:5: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6817); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6821);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET190=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName6823); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET190);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:3: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==LBRACKET) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:5: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET191=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6830); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET191);

							pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6834);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET192=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName6836); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET192);

							}
							break;

						default :
							break loop88;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: record_id, record_id, array_index, lb
			// token labels: record_id, lb
			// rule labels: retval
			// token list labels: 
			// rule list labels: array_index
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_record_id=new RewriteRuleTokenStream(adaptor,"token record_id",record_id);
			RewriteRuleTokenStream stream_lb=new RewriteRuleTokenStream(adaptor,"token lb",lb);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_array_index=new RewriteRuleSubtreeStream(adaptor,"token array_index",list_array_index);
			root_0 = (BAST)adaptor.nil();
			// 1117:2: -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) )
			if (lb!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1117:17: ^( $record_id ^( $lb ( $array_index)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_record_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1117:31: ^( $lb ( $array_index)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lb.nextNode(), root_2);
				if ( !(stream_array_index.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_index.hasNext() ) {
					adaptor.addChild(root_2, stream_array_index.nextTree());
				}
				stream_array_index.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1118:2: -> $record_id
			{
				adaptor.addChild(root_0, stream_record_id.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partialName"


	public static class constant_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:1: constant : ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null );
	public final BLESS3Parser.constant_return constant() throws RecognitionException {
		BLESS3Parser.constant_return retval = new BLESS3Parser.constant_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AADL_STRING_LITERAL194=null;
		Token LITERAL_true195=null;
		Token LITERAL_false196=null;
		Token LITERAL_null197=null;
		ParserRuleReturnScope quantity193 =null;

		BAST AADL_STRING_LITERAL194_tree=null;
		BAST LITERAL_true195_tree=null;
		BAST LITERAL_false196_tree=null;
		BAST LITERAL_null197_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:9: ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null )
			int alt90=5;
			switch ( input.LA(1) ) {
			case LITERAL_self:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt90=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt90=2;
				}
				break;
			case LITERAL_true:
				{
				alt90=3;
				}
				break;
			case LITERAL_false:
				{
				alt90=4;
				}
				break;
			case LITERAL_null:
				{
				alt90=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 90, 0, input);
				throw nvae;
			}
			switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1122:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_constant6884);
					quantity193=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity193.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1124:3: AADL_STRING_LITERAL
					{
					root_0 = (BAST)adaptor.nil();


					AADL_STRING_LITERAL194=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant6892); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AADL_STRING_LITERAL194_tree = (BAST)adaptor.create(AADL_STRING_LITERAL194);
					adaptor.addChild(root_0, AADL_STRING_LITERAL194_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1126:3: LITERAL_true
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_true195=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant6900); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_true195_tree = (BAST)adaptor.create(LITERAL_true195);
					adaptor.addChild(root_0, LITERAL_true195_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1128:3: LITERAL_false
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_false196=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant6908); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_false196_tree = (BAST)adaptor.create(LITERAL_false196);
					adaptor.addChild(root_0, LITERAL_false196_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1130:3: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null197=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant6916); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null197_tree = (BAST)adaptor.create(LITERAL_null197);
					adaptor.addChild(root_0, LITERAL_null197_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class quantity_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantity"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:1: quantity : (num= aNumber u= ID -> ^( QUANTITY $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY $num $whole) |num= aNumber -> ^( QUANTITY $num) );
	public final BLESS3Parser.quantity_return quantity() throws RecognitionException {
		BLESS3Parser.quantity_return retval = new BLESS3Parser.quantity_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token u=null;
		Token scalar=null;
		Token whole=null;
		ParserRuleReturnScope num =null;

		BAST u_tree=null;
		BAST scalar_tree=null;
		BAST whole_tree=null;
		RewriteRuleTokenStream stream_LITERAL_whole=new RewriteRuleTokenStream(adaptor,"token LITERAL_whole");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_LITERAL_scalar=new RewriteRuleTokenStream(adaptor,"token LITERAL_scalar");
		RewriteRuleSubtreeStream stream_aNumber=new RewriteRuleSubtreeStream(adaptor,"rule aNumber");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:9: (num= aNumber u= ID -> ^( QUANTITY $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY $num $whole) |num= aNumber -> ^( QUANTITY $num) )
			int alt91=4;
			alt91 = dfa91.predict(input);
			switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1135:3: num= aNumber u= ID
					{
					pushFollow(FOLLOW_aNumber_in_quantity6933);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					u=(Token)match(input,ID,FOLLOW_ID_in_quantity6937); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(u);

					// AST REWRITE
					// elements: num, u
					// token labels: u
					// rule labels: num, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
					RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num",num!=null?num.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1136:4: -> ^( QUANTITY $num $u)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1136:7: ^( QUANTITY $num $u)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, "QUANTITY"), root_1);
						adaptor.addChild(root_1, stream_num.nextTree());
						adaptor.addChild(root_1, stream_u.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1138:3: num= aNumber scalar= LITERAL_scalar
					{
					pushFollow(FOLLOW_aNumber_in_quantity6966);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity6970); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_scalar.add(scalar);

					// AST REWRITE
					// elements: num, scalar
					// token labels: scalar
					// rule labels: num, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_scalar=new RewriteRuleTokenStream(adaptor,"token scalar",scalar);
					RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num",num!=null?num.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1139:4: -> ^( QUANTITY $num $scalar)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1139:7: ^( QUANTITY $num $scalar)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, "QUANTITY"), root_1);
						adaptor.addChild(root_1, stream_num.nextTree());
						adaptor.addChild(root_1, stream_scalar.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1141:3: num= aNumber whole= LITERAL_whole
					{
					pushFollow(FOLLOW_aNumber_in_quantity7000);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7004); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_whole.add(whole);

					// AST REWRITE
					// elements: num, whole
					// token labels: whole
					// rule labels: num, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_whole=new RewriteRuleTokenStream(adaptor,"token whole",whole);
					RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num",num!=null?num.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1142:4: -> ^( QUANTITY $num $whole)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1142:7: ^( QUANTITY $num $whole)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, "QUANTITY"), root_1);
						adaptor.addChild(root_1, stream_num.nextTree());
						adaptor.addChild(root_1, stream_whole.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1144:3: num= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_quantity7032);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					// AST REWRITE
					// elements: num
					// token labels: 
					// rule labels: num, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_num=new RewriteRuleSubtreeStream(adaptor,"rule num",num!=null?num.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1145:4: -> ^( QUANTITY $num)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1145:7: ^( QUANTITY $num)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, "QUANTITY"), root_1);
						adaptor.addChild(root_1, stream_num.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantity"


	public static class aNumber_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "aNumber"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:1: aNumber : (lit= NUMBER |property= propertyReference |propertyConstant= QCLREF );
	public final BLESS3Parser.aNumber_return aNumber() throws RecognitionException {
		BLESS3Parser.aNumber_return retval = new BLESS3Parser.aNumber_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lit=null;
		Token propertyConstant=null;
		ParserRuleReturnScope property =null;

		BAST lit_tree=null;
		BAST propertyConstant_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:8: (lit= NUMBER |property= propertyReference |propertyConstant= QCLREF )
			int alt92=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt92=1;
				}
				break;
			case LITERAL_self:
			case OCTOTHORPE:
			case QCREF:
				{
				alt92=2;
				}
				break;
			case QCLREF:
				{
				alt92=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1149:2: lit= NUMBER
					{
					root_0 = (BAST)adaptor.nil();


					lit=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7062); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					lit_tree = (BAST)adaptor.create(lit);
					adaptor.addChild(root_0, lit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1150:4: property= propertyReference
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyReference_in_aNumber7069);
					property=propertyReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, property.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1151:4: propertyConstant= QCLREF
					{
					root_0 = (BAST)adaptor.nil();


					propertyConstant=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_aNumber7076); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					propertyConstant_tree = (BAST)adaptor.create(propertyConstant);
					adaptor.addChild(root_0, propertyConstant_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aNumber"


	public static class propertyReference_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:1: propertyReference : ( OCTOTHORPE ^pname= QCLREF (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )* |component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )* );
	public final BLESS3Parser.propertyReference_return propertyReference() throws RecognitionException {
		BLESS3Parser.propertyReference_return retval = new BLESS3Parser.propertyReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pname=null;
		Token spname=null;
		Token component=null;
		Token cpname=null;
		Token OCTOTHORPE198=null;
		Token LITERAL_self199=null;
		Token OCTOTHORPE200=null;
		Token OCTOTHORPE201=null;
		List<Object> list_field=null;
		RuleReturnScope field = null;
		BAST pname_tree=null;
		BAST spname_tree=null;
		BAST component_tree=null;
		BAST cpname_tree=null;
		BAST OCTOTHORPE198_tree=null;
		BAST LITERAL_self199_tree=null;
		BAST OCTOTHORPE200_tree=null;
		BAST OCTOTHORPE201_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:18: ( OCTOTHORPE ^pname= QCLREF (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )* |component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )* )
			int alt96=3;
			switch ( input.LA(1) ) {
			case OCTOTHORPE:
				{
				alt96=1;
				}
				break;
			case LITERAL_self:
				{
				alt96=2;
				}
				break;
			case QCREF:
				{
				alt96=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 96, 0, input);
				throw nvae;
			}
			switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1155:2: OCTOTHORPE ^pname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					OCTOTHORPE198=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7090); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE198_tree = (BAST)adaptor.create(OCTOTHORPE198);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE198_tree, root_0);
					}

					pname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7095); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					pname_tree = (BAST)adaptor.create(pname);
					adaptor.addChild(root_0, pname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1156:4: (field+= propertyField )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==DOT||LA93_0==LBRACKET) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1156:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7106);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop93;
						}
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1158:4: LITERAL_self OCTOTHORPE ^spname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_self199=(Token)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7116); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_self199_tree = (BAST)adaptor.create(LITERAL_self199);
					adaptor.addChild(root_0, LITERAL_self199_tree);
					}

					OCTOTHORPE200=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7118); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE200_tree = (BAST)adaptor.create(OCTOTHORPE200);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE200_tree, root_0);
					}

					spname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					spname_tree = (BAST)adaptor.create(spname);
					adaptor.addChild(root_0, spname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:4: (field+= propertyField )*
					loop94:
					while (true) {
						int alt94=2;
						int LA94_0 = input.LA(1);
						if ( (LA94_0==DOT||LA94_0==LBRACKET) ) {
							alt94=1;
						}

						switch (alt94) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7134);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop94;
						}
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1160:4: component= QCREF OCTOTHORPE ^cpname= QCLREF (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					component=(Token)match(input,QCREF,FOLLOW_QCREF_in_propertyReference7144); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					component_tree = (BAST)adaptor.create(component);
					adaptor.addChild(root_0, component_tree);
					}

					OCTOTHORPE201=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7150); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE201_tree = (BAST)adaptor.create(OCTOTHORPE201);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE201_tree, root_0);
					}

					cpname=(Token)match(input,QCLREF,FOLLOW_QCLREF_in_propertyReference7155); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					cpname_tree = (BAST)adaptor.create(cpname);
					adaptor.addChild(root_0, cpname_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1162:5: (field+= propertyField )*
					loop95:
					while (true) {
						int alt95=2;
						int LA95_0 = input.LA(1);
						if ( (LA95_0==DOT||LA95_0==LBRACKET) ) {
							alt95=1;
						}

						switch (alt95) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1162:7: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7167);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop95;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyReference"


	public static class propertyField_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:1: propertyField : ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) );
	public final BLESS3Parser.propertyField_return propertyField() throws RecognitionException {
		BLESS3Parser.propertyField_return retval = new BLESS3Parser.propertyField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token index=null;
		Token var=null;
		Token pf=null;
		Token upper=null;
		Token lower=null;
		Token LBRACKET202=null;
		Token RBRACKET203=null;
		Token DOT204=null;

		BAST index_tree=null;
		BAST var_tree=null;
		BAST pf_tree=null;
		BAST upper_tree=null;
		BAST lower_tree=null;
		BAST LBRACKET202_tree=null;
		BAST RBRACKET203_tree=null;
		BAST DOT204_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:14: ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) )
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LBRACKET) ) {
				alt99=1;
			}
			else if ( (LA99_0==DOT) ) {
				alt99=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 99, 0, input);
				throw nvae;
			}

			switch (alt99) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:2: LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !
					{
					root_0 = (BAST)adaptor.nil();


					LBRACKET202=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACKET202_tree = (BAST)adaptor.create(LBRACKET202);
					root_0 = (BAST)adaptor.becomeRoot(LBRACKET202_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:12: (index= NUMBER |var= ID )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==NUMBER) ) {
						alt97=1;
					}
					else if ( (LA97_0==ID) ) {
						alt97=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);
						throw nvae;
					}

					switch (alt97) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:13: index= NUMBER
							{
							index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7188); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							index_tree = (BAST)adaptor.create(index);
							adaptor.addChild(root_0, index_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:28: var= ID
							{
							var=(Token)match(input,ID,FOLLOW_ID_in_propertyField7194); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							var_tree = (BAST)adaptor.create(var);
							adaptor.addChild(root_0, var_tree);
							}

							}
							break;

					}

					RBRACKET203=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_propertyField7203); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:4: DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					{
					root_0 = (BAST)adaptor.nil();


					DOT204=(Token)match(input,DOT,FOLLOW_DOT_in_propertyField7211); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT204_tree = (BAST)adaptor.create(DOT204);
					root_0 = (BAST)adaptor.becomeRoot(DOT204_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:10: (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					int alt98=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt98=1;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt98=2;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt98=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 98, 0, input);
						throw nvae;
					}
					switch (alt98) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:11: pf= ID
							{
							pf=(Token)match(input,ID,FOLLOW_ID_in_propertyField7218); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							pf_tree = (BAST)adaptor.create(pf);
							adaptor.addChild(root_0, pf_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:19: upper= LITERAL_upper_bound
							{
							upper=(Token)match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7224); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							upper_tree = (BAST)adaptor.create(upper);
							adaptor.addChild(root_0, upper_tree);
							}

							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:47: lower= LITERAL_lower_bound
							{
							lower=(Token)match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7230); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							lower_tree = (BAST)adaptor.create(lower);
							adaptor.addChild(root_0, lower_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyField"


	public static class actionSubclause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "actionSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:1: actionSubclause : (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) ;
	public final BLESS3Parser.actionSubclause_return actionSubclause() throws RecognitionException {
		BLESS3Parser.actionSubclause_return retval = new BLESS3Parser.actionSubclause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token no_proof=null;
		Token pre=null;
		Token post=null;
		Token inv=null;
		ParserRuleReturnScope throws_clause =null;
		ParserRuleReturnScope assert_clause =null;
		ParserRuleReturnScope precondition =null;
		ParserRuleReturnScope postcondition =null;
		ParserRuleReturnScope invariant =null;
		ParserRuleReturnScope elq =null;

		BAST no_proof_tree=null;
		BAST pre_tree=null;
		BAST post_tree=null;
		BAST inv_tree=null;
		RewriteRuleTokenStream stream_LITERAL_pre=new RewriteRuleTokenStream(adaptor,"token LITERAL_pre");
		RewriteRuleTokenStream stream_LITERAL_post=new RewriteRuleTokenStream(adaptor,"token LITERAL_post");
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_DO_NOT_PROVE=new RewriteRuleTokenStream(adaptor,"token DO_NOT_PROVE");
		RewriteRuleSubtreeStream stream_assertClause=new RewriteRuleSubtreeStream(adaptor,"rule assertClause");
		RewriteRuleSubtreeStream stream_throwsClause=new RewriteRuleSubtreeStream(adaptor,"rule throwsClause");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:16: ( (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:2: (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:11: (no_proof= DO_NOT_PROVE )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==DO_NOT_PROVE) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:11: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7250); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1176:16: (throws_clause= throwsClause )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==LITERAL_throws) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1176:16: throws_clause= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7257);
					throws_clause=throwsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_throwsClause.add(throws_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:16: (assert_clause= assertClause )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==LITERAL_assert) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:16: assert_clause= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7265);
					assert_clause=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(assert_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:3: (pre= LITERAL_pre precondition= assertion )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LITERAL_pre) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:5: pre= LITERAL_pre precondition= assertion
					{
					pre=(Token)match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7276); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_pre.add(pre);

					pushFollow(FOLLOW_assertion_in_actionSubclause7280);
					precondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(precondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:3: (post= LITERAL_post postcondition= assertion )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LITERAL_post) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1179:5: post= LITERAL_post postcondition= assertion
					{
					post=(Token)match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7291); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_post.add(post);

					pushFollow(FOLLOW_assertion_in_actionSubclause7295);
					postcondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(postcondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1180:3: (inv= LITERAL_invariant invariant= assertion )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LITERAL_invariant) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1180:5: inv= LITERAL_invariant invariant= assertion
					{
					inv=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7307); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(inv);

					pushFollow(FOLLOW_assertion_in_actionSubclause7311);
					invariant=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(invariant.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7321);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: LITERAL_invariant, invariant, elq, precondition, no_proof, LITERAL_post, assert_clause, LITERAL_pre, throws_clause, postcondition
			// token labels: no_proof
			// rule labels: assert_clause, throws_clause, elq, precondition, postcondition, retval, invariant
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_assert_clause=new RewriteRuleSubtreeStream(adaptor,"rule assert_clause",assert_clause!=null?assert_clause.getTree():null);
			RewriteRuleSubtreeStream stream_throws_clause=new RewriteRuleSubtreeStream(adaptor,"rule throws_clause",throws_clause!=null?throws_clause.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_precondition=new RewriteRuleSubtreeStream(adaptor,"rule precondition",precondition!=null?precondition.getTree():null);
			RewriteRuleSubtreeStream stream_postcondition=new RewriteRuleSubtreeStream(adaptor,"rule postcondition",postcondition!=null?postcondition.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_invariant=new RewriteRuleSubtreeStream(adaptor,"rule invariant",invariant!=null?invariant.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1182:3: -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:6: ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION_SUBCLAUSE, "ACTION_SUBCLAUSE"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:27: ( $no_proof)?
				if ( stream_no_proof.hasNext() ) {
					adaptor.addChild(root_1, stream_no_proof.nextNode());
				}
				stream_no_proof.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:38: ( $throws_clause)?
				if ( stream_throws_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_clause.nextTree());
				}
				stream_throws_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:54: ( $assert_clause)?
				if ( stream_assert_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_assert_clause.nextTree());
				}
				stream_assert_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:69: ^( LITERAL_pre ( $precondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_pre.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:85: ( $precondition)?
				if ( stream_precondition.hasNext() ) {
					adaptor.addChild(root_2, stream_precondition.nextTree());
				}
				stream_precondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:6: ^( LITERAL_post ( $postcondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_post.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:23: ( $postcondition)?
				if ( stream_postcondition.hasNext() ) {
					adaptor.addChild(root_2, stream_postcondition.nextTree());
				}
				stream_postcondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:40: ^( LITERAL_invariant $invariant)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_invariant.nextNode(), root_2);
				adaptor.addChild(root_2, stream_invariant.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_elq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionSubclause"


	public static class throwsClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "throwsClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:1: throwsClause : LITERAL_throws ^ (exceptions+= ID )+ ;
	public final BLESS3Parser.throwsClause_return throwsClause() throws RecognitionException {
		BLESS3Parser.throwsClause_return retval = new BLESS3Parser.throwsClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_throws205=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;

		BAST LITERAL_throws205_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:13: ( LITERAL_throws ^ (exceptions+= ID )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:2: LITERAL_throws ^ (exceptions+= ID )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_throws205=(Token)match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7389); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throws205_tree = (BAST)adaptor.create(LITERAL_throws205);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_throws205_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:28: (exceptions+= ID )+
			int cnt106=0;
			loop106:
			while (true) {
				int alt106=2;
				int LA106_0 = input.LA(1);
				if ( (LA106_0==ID) ) {
					alt106=1;
				}

				switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:28: exceptions+= ID
					{
					exceptions=(Token)match(input,ID,FOLLOW_ID_in_throwsClause7394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					exceptions_tree = (BAST)adaptor.create(exceptions);
					adaptor.addChild(root_0, exceptions_tree);
					}

					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt106 >= 1 ) break loop106;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(106, input);
					throw eee;
				}
				cnt106++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throwsClause"


	public static class assertClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:1: assertClause : LITERAL_assert ^ ( namedAssertion )+ ;
	public final BLESS3Parser.assertClause_return assertClause() throws RecognitionException {
		BLESS3Parser.assertClause_return retval = new BLESS3Parser.assertClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_assert206=null;
		ParserRuleReturnScope namedAssertion207 =null;

		BAST LITERAL_assert206_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:13: ( LITERAL_assert ^ ( namedAssertion )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:3: LITERAL_assert ^ ( namedAssertion )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_assert206=(Token)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7409); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_assert206_tree = (BAST)adaptor.create(LITERAL_assert206);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_assert206_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:19: ( namedAssertion )+
			int cnt107=0;
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==LASS) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:19: namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7412);
					namedAssertion207=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion207.getTree());

					}
					break;

				default :
					if ( cnt107 >= 1 ) break loop107;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(107, input);
					throw eee;
				}
				cnt107++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertClause"


	public static class behaviorTime_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorTime"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:1: behaviorTime : ( quantity | valueName | parenthesizedSubexpression );
	public final BLESS3Parser.behaviorTime_return behaviorTime() throws RecognitionException {
		BLESS3Parser.behaviorTime_return retval = new BLESS3Parser.behaviorTime_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope quantity208 =null;
		ParserRuleReturnScope valueName209 =null;
		ParserRuleReturnScope parenthesizedSubexpression210 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:13: ( quantity | valueName | parenthesizedSubexpression )
			int alt108=3;
			switch ( input.LA(1) ) {
			case LITERAL_self:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt108=1;
				}
				break;
			case ID:
				{
				alt108=2;
				}
				break;
			case LPAREN:
				{
				alt108=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 108, 0, input);
				throw nvae;
			}
			switch (alt108) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_behaviorTime7432);
					quantity208=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity208.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1201:5: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_behaviorTime7438);
					valueName209=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName209.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1202:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_behaviorTime7444);
					parenthesizedSubexpression210=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression210.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTime"


	public static class catchClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "catchClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1206:1: catchClause : LITERAL_catch ^ ( catchClauseTerm )+ ;
	public final BLESS3Parser.catchClause_return catchClause() throws RecognitionException {
		BLESS3Parser.catchClause_return retval = new BLESS3Parser.catchClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_catch211=null;
		ParserRuleReturnScope catchClauseTerm212 =null;

		BAST LITERAL_catch211_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1206:12: ( LITERAL_catch ^ ( catchClauseTerm )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:2: LITERAL_catch ^ ( catchClauseTerm )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_catch211=(Token)match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause7457); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_catch211_tree = (BAST)adaptor.create(LITERAL_catch211);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_catch211_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:17: ( catchClauseTerm )+
			int cnt109=0;
			loop109:
			while (true) {
				int alt109=2;
				int LA109_0 = input.LA(1);
				if ( (LA109_0==LPAREN) ) {
					alt109=1;
				}

				switch (alt109) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:17: catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause7460);
					catchClauseTerm212=catchClauseTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClauseTerm212.getTree());

					}
					break;

				default :
					if ( cnt109 >= 1 ) break loop109;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(109, input);
					throw eee;
				}
				cnt109++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchClause"


	public static class catchClauseTerm_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "catchClauseTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1210:1: catchClauseTerm : LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN ;
	public final BLESS3Parser.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		BLESS3Parser.catchClauseTerm_return retval = new BLESS3Parser.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token colon=null;
		Token LPAREN213=null;
		Token LITERAL_all214=null;
		Token RPAREN215=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;
		ParserRuleReturnScope act =null;

		BAST colon_tree=null;
		BAST LPAREN213_tree=null;
		BAST LITERAL_all214_tree=null;
		BAST RPAREN215_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1210:16: ( LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:3: LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN213=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7473); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN213_tree = (BAST)adaptor.create(LPAREN213);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN213_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:3: ( (exceptions+= ID )+ | LITERAL_all )
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==ID) ) {
				alt111=1;
			}
			else if ( (LA111_0==LITERAL_all) ) {
				alt111=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 111, 0, input);
				throw nvae;
			}

			switch (alt111) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:5: (exceptions+= ID )+
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:15: (exceptions+= ID )+
					int cnt110=0;
					loop110:
					while (true) {
						int alt110=2;
						int LA110_0 = input.LA(1);
						if ( (LA110_0==ID) ) {
							alt110=1;
						}

						switch (alt110) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:15: exceptions+= ID
							{
							exceptions=(Token)match(input,ID,FOLLOW_ID_in_catchClauseTerm7482); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							exceptions_tree = (BAST)adaptor.create(exceptions);
							adaptor.addChild(root_0, exceptions_tree);
							}

							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt110 >= 1 ) break loop110;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(110, input);
							throw eee;
						}
						cnt110++;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:23: LITERAL_all
					{
					LITERAL_all214=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm7487); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_all214_tree = (BAST)adaptor.create(LITERAL_all214);
					adaptor.addChild(root_0, LITERAL_all214_tree);
					}

					}
					break;

			}

			colon=(Token)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7493); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			colon_tree = (BAST)adaptor.create(colon);
			adaptor.addChild(root_0, colon_tree);
			}

			pushFollow(FOLLOW_basicAction_in_catchClauseTerm7497);
			act=basicAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, act.getTree());

			RPAREN215=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7499); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN215_tree = (BAST)adaptor.create(RPAREN215);
			adaptor.addChild(root_0, RPAREN215_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchClauseTerm"


	public static class quantifiedVariables_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantifiedVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:1: quantifiedVariables : LITERAL_declare ^ ( variableDeclaration )+ ;
	public final BLESS3Parser.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		BLESS3Parser.quantifiedVariables_return retval = new BLESS3Parser.quantifiedVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_declare216=null;
		ParserRuleReturnScope variableDeclaration217 =null;

		BAST LITERAL_declare216_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:20: ( LITERAL_declare ^ ( variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1216:3: LITERAL_declare ^ ( variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_declare216=(Token)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7511); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_declare216_tree = (BAST)adaptor.create(LITERAL_declare216);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_declare216_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1216:20: ( variableDeclaration )+
			int cnt112=0;
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==ID) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1216:20: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7514);
					variableDeclaration217=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration217.getTree());

					}
					break;

				default :
					if ( cnt112 >= 1 ) break loop112;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(112, input);
					throw eee;
				}
				cnt112++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantifiedVariables"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1219:1: variableDeclaration : v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) ;
	public final BLESS3Parser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		BLESS3Parser.variableDeclaration_return retval = new BLESS3Parser.variableDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token nv=null;
		Token sh=null;
		Token c=null;
		Token sp=null;
		Token f=null;
		Token assign=null;
		Token semi=null;
		ParserRuleReturnScope v =null;
		ParserRuleReturnScope exp =null;
		ParserRuleReturnScope a =null;

		BAST nv_tree=null;
		BAST sh_tree=null;
		BAST c_tree=null;
		BAST sp_tree=null;
		BAST f_tree=null;
		BAST assign_tree=null;
		BAST semi_tree=null;
		RewriteRuleTokenStream stream_LITERAL_shared=new RewriteRuleTokenStream(adaptor,"token LITERAL_shared");
		RewriteRuleTokenStream stream_LITERAL_final=new RewriteRuleTokenStream(adaptor,"token LITERAL_final");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LITERAL_nonvolatile=new RewriteRuleTokenStream(adaptor,"token LITERAL_nonvolatile");
		RewriteRuleTokenStream stream_LITERAL_spread=new RewriteRuleTokenStream(adaptor,"token LITERAL_spread");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleTokenStream stream_LITERAL_constant=new RewriteRuleTokenStream(adaptor,"token LITERAL_constant");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1219:20: (v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:3: v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )?
			{
			pushFollow(FOLLOW_variable_in_variableDeclaration7528);
			v=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(v.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1221:2: (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )?
			int alt113=6;
			switch ( input.LA(1) ) {
				case LITERAL_nonvolatile:
					{
					alt113=1;
					}
					break;
				case LITERAL_shared:
					{
					alt113=2;
					}
					break;
				case LITERAL_constant:
					{
					alt113=3;
					}
					break;
				case LITERAL_spread:
					{
					alt113=4;
					}
					break;
				case LITERAL_final:
					{
					alt113=5;
					}
					break;
			}
			switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:4: nv= LITERAL_nonvolatile
					{
					nv=(Token)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7539); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_nonvolatile.add(nv);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:6: sh= LITERAL_shared
					{
					sh=(Token)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7549); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_shared.add(sh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:6: c= LITERAL_constant
					{
					c=(Token)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7559); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_constant.add(c);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1225:7: sp= LITERAL_spread
					{
					sp=(Token)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7569); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_spread.add(sp);

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1226:7: f= LITERAL_final
					{
					f=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration7579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(f);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:3: (assign= ASSIGN exp= expression )?
			int alt114=2;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==ASSIGN) ) {
				alt114=1;
			}
			switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:5: assign= ASSIGN exp= expression
					{
					assign=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7593); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(assign);

					pushFollow(FOLLOW_expression_in_variableDeclaration7597);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1229:4: (a= assertion )?
			int alt115=2;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==LASS) ) {
				alt115=1;
			}
			switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1229:4: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7607);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:7: (semi= SEMICOLON )?
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==SEMICOLON) ) {
				alt116=1;
			}
			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1230:7: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration7616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: a, a, sh, f, v, nv, sp, sp, c, exp, c, v, nv, sh, assign, f
			// token labels: c, sh, f, nv, sp, assign
			// rule labels: a, v, exp, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_c=new RewriteRuleTokenStream(adaptor,"token c",c);
			RewriteRuleTokenStream stream_sh=new RewriteRuleTokenStream(adaptor,"token sh",sh);
			RewriteRuleTokenStream stream_f=new RewriteRuleTokenStream(adaptor,"token f",f);
			RewriteRuleTokenStream stream_nv=new RewriteRuleTokenStream(adaptor,"token nv",nv);
			RewriteRuleTokenStream stream_sp=new RewriteRuleTokenStream(adaptor,"token sp",sp);
			RewriteRuleTokenStream stream_assign=new RewriteRuleTokenStream(adaptor,"token assign",assign);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
			RewriteRuleSubtreeStream stream_exp=new RewriteRuleSubtreeStream(adaptor,"rule exp",exp!=null?exp.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1231:5: -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			if (assign!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:24: ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:51: ^( $assign $exp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_assign.nextNode(), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:70: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:74: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:79: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:84: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:88: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:93: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1232:5: -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:8: ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:36: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:40: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:45: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:50: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:54: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:59: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class behaviorActions_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1236:1: behaviorActions :a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? ;
	public final BLESS3Parser.behaviorActions_return behaviorActions() throws RecognitionException {
		BLESS3Parser.behaviorActions_return retval = new BLESS3Parser.behaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token SEMICOLON218=null;
		Token SEMICOLON219=null;
		Token AMPERSAND220=null;
		Token AMPERSAND221=null;
		List<Object> list_a=null;
		RuleReturnScope a = null;
		BAST SEMICOLON218_tree=null;
		BAST SEMICOLON219_tree=null;
		BAST AMPERSAND220_tree=null;
		BAST AMPERSAND221_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1236:16: (a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1237:3: a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_assertedAction_in_behaviorActions7723);
			a=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

			if (list_a==null) list_a=new ArrayList<Object>();
			list_a.add(a.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:3: ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			int alt119=3;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==SEMICOLON) ) {
				alt119=1;
			}
			else if ( (LA119_0==AMPERSAND) ) {
				alt119=2;
			}
			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1239:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1239:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1239:6: SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )*
					{
					SEMICOLON218=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7736); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON218_tree = (BAST)adaptor.create(SEMICOLON218);
					root_0 = (BAST)adaptor.becomeRoot(SEMICOLON218_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7741);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1239:35: ( SEMICOLON !a+= assertedAction )*
					loop117:
					while (true) {
						int alt117=2;
						int LA117_0 = input.LA(1);
						if ( (LA117_0==SEMICOLON) ) {
							alt117=1;
						}

						switch (alt117) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1239:37: SEMICOLON !a+= assertedAction
							{
							SEMICOLON219=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7745); if (state.failed) return retval;
							pushFollow(FOLLOW_assertedAction_in_behaviorActions7750);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop117;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:6: AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )*
					{
					AMPERSAND220=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7769); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND220_tree = (BAST)adaptor.create(AMPERSAND220);
					root_0 = (BAST)adaptor.becomeRoot(AMPERSAND220_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7774);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:35: ( AMPERSAND a+= assertedAction )*
					loop118:
					while (true) {
						int alt118=2;
						int LA118_0 = input.LA(1);
						if ( (LA118_0==AMPERSAND) ) {
							alt118=1;
						}

						switch (alt118) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:37: AMPERSAND a+= assertedAction
							{
							AMPERSAND221=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7778); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AMPERSAND221_tree = (BAST)adaptor.create(AMPERSAND221);
							adaptor.addChild(root_0, AMPERSAND221_tree);
							}

							pushFollow(FOLLOW_assertedAction_in_behaviorActions7782);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop118;
						}
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorActions"


	public static class assertedAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:1: assertedAction : (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) ;
	public final BLESS3Parser.assertedAction_return assertedAction() throws RecognitionException {
		BLESS3Parser.assertedAction_return retval = new BLESS3Parser.assertedAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pre =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope post =null;

		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:17: ( (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:3: (pre= assertion )? s= action (post= assertion )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:6: (pre= assertion )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==LASS) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:6: pre= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7805);
					pre=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(pre.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_assertedAction7814);
			s=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(s.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:7: (post= assertion )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==LASS) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:7: post= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7820);
					post=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(post.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: post, s, pre
			// token labels: 
			// rule labels: pre, s, post, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_pre=new RewriteRuleSubtreeStream(adaptor,"rule pre",pre!=null?pre.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_post=new RewriteRuleSubtreeStream(adaptor,"rule post",post!=null?post.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1249:5: -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1250:5: ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, (s!=null?((BAST)s.getTree()):null).getToken(), "ACTION["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1251:9: ^( P[\"P\"] ( $pre)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(P, "P"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1251:20: ( $pre)?
				if ( stream_pre.hasNext() ) {
					adaptor.addChild(root_2, stream_pre.nextTree());
				}
				stream_pre.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1252:9: ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(S, (s!=null?((BAST)s.getTree()):null).getToken(), "S["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1253:9: ^( Q[\"Q\"] ( $post)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, "Q"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1253:20: ( $post)?
				if ( stream_post.hasNext() ) {
					adaptor.addChild(root_2, stream_post.nextTree());
				}
				stream_post.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertedAction"


	public static class action_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "action"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1259:1: action : ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification );
	public final BLESS3Parser.action_return action() throws RecognitionException {
		BLESS3Parser.action_return retval = new BLESS3Parser.action_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope if_fi =null;
		ParserRuleReturnScope wl =null;
		ParserRuleReturnScope fl =null;
		ParserRuleReturnScope du =null;
		ParserRuleReturnScope elq =null;
		ParserRuleReturnScope ulq =null;
		ParserRuleReturnScope basicAction222 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1259:7: ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification )
			int alt122=7;
			switch ( input.LA(1) ) {
			case ID:
			case LITERAL_computation:
			case LITERAL_exception:
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_setmode:
			case LITERAL_skip:
			case LITERAL_swap:
			case LITERAL_when:
			case VERT:
				{
				alt122=1;
				}
				break;
			case LITERAL_if:
				{
				alt122=2;
				}
				break;
			case LITERAL_while:
				{
				alt122=3;
				}
				break;
			case LITERAL_for:
				{
				alt122=4;
				}
				break;
			case LITERAL_do:
				{
				alt122=5;
				}
				break;
			case LCURLY:
			case LITERAL_declare:
				{
				alt122=6;
				}
				break;
			case LITERAL_forall:
				{
				alt122=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 122, 0, input);
				throw nvae;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1260:3: basicAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_basicAction_in_action7936);
					basicAction222=basicAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basicAction222.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1261:5: if_fi= alternative
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_alternative_in_action7944);
					if_fi=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_fi.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:5: wl= whileLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_action7952);
					wl=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, wl.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1263:5: fl= forLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_action7960);
					fl=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fl.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1264:5: du= doUntilLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_doUntilLoop_in_action7968);
					du=doUntilLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, du.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:5: elq= existentialLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialLatticeQuantification_in_action7976);
					elq=existentialLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elq.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1266:5: ulq= universalLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalLatticeQuantification_in_action7985);
					ulq=universalLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ulq.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class basicAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "basicAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1269:1: basicAction : ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException );
	public final BLESS3Parser.basicAction_return basicAction() throws RecognitionException {
		BLESS3Parser.basicAction_return retval = new BLESS3Parser.basicAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token mode=null;
		Token LITERAL_skip223=null;
		Token LITERAL_setmode225=null;
		ParserRuleReturnScope assignment224 =null;
		ParserRuleReturnScope whenThrow226 =null;
		ParserRuleReturnScope combinableOperation227 =null;
		ParserRuleReturnScope communicationAction228 =null;
		ParserRuleReturnScope computation229 =null;
		ParserRuleReturnScope simultaneousAssignment230 =null;
		ParserRuleReturnScope issueException231 =null;

		BAST mode_tree=null;
		BAST LITERAL_skip223_tree=null;
		BAST LITERAL_setmode225_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1269:12: ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException )
			int alt123=9;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt123=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EXCLAMATION:
				case LPAREN:
					{
					alt123=6;
					}
					break;
				case QUESTION:
					{
					int LA123_10 = input.LA(3);
					if ( (LA123_10==LPAREN) ) {
						alt123=6;
					}
					else if ( (LA123_10==ASSIGN||LA123_10==TICK) ) {
						alt123=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 123, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ASSIGN:
				case DOLLAR:
				case DOT:
				case LBRACKET:
				case TICK:
					{
					alt123=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 123, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LITERAL_setmode:
				{
				alt123=3;
				}
				break;
			case LITERAL_when:
				{
				alt123=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt123=5;
				}
				break;
			case LITERAL_computation:
				{
				alt123=7;
				}
				break;
			case VERT:
				{
				alt123=8;
				}
				break;
			case LITERAL_exception:
				{
				alt123=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1270:3: LITERAL_skip
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_skip223=(Token)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8000); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_skip223_tree = (BAST)adaptor.create(LITERAL_skip223);
					adaptor.addChild(root_0, LITERAL_skip223_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1271:5: assignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_basicAction8006);
					assignment224=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment224.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1272:5: ^( LITERAL_setmode mode= ID )
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_setmode225=(Token)match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8014); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_setmode225_tree = (BAST)adaptor.create(LITERAL_setmode225);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_setmode225_tree, root_0);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					mode=(Token)match(input,ID,FOLLOW_ID_in_basicAction8018); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					mode_tree = (BAST)adaptor.create(mode);
					adaptor.addChild(root_0, mode_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1273:5: whenThrow
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whenThrow_in_basicAction8027);
					whenThrow226=whenThrow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThrow226.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1274:5: combinableOperation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_combinableOperation_in_basicAction8033);
					combinableOperation227=combinableOperation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, combinableOperation227.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1275:5: communicationAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_communicationAction_in_basicAction8039);
					communicationAction228=communicationAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, communicationAction228.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1276:5: computation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_computation_in_basicAction8046);
					computation229=computation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, computation229.getTree());

					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1277:5: simultaneousAssignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8052);
					simultaneousAssignment230=simultaneousAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simultaneousAssignment230.getTree());

					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1279:5: issueException
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_issueException_in_basicAction8059);
					issueException231=issueException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, issueException231.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "basicAction"


	public static class assignment_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1282:1: assignment : nameTick ASSIGN ^ expressionOrAny ;
	public final BLESS3Parser.assignment_return assignment() throws RecognitionException {
		BLESS3Parser.assignment_return retval = new BLESS3Parser.assignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ASSIGN233=null;
		ParserRuleReturnScope nameTick232 =null;
		ParserRuleReturnScope expressionOrAny234 =null;

		BAST ASSIGN233_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1282:11: ( nameTick ASSIGN ^ expressionOrAny )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1283:3: nameTick ASSIGN ^ expressionOrAny
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_nameTick_in_assignment8071);
			nameTick232=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nameTick232.getTree());

			ASSIGN233=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8073); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN233_tree = (BAST)adaptor.create(ASSIGN233);
			root_0 = (BAST)adaptor.becomeRoot(ASSIGN233_tree, root_0);
			}

			pushFollow(FOLLOW_expressionOrAny_in_assignment8076);
			expressionOrAny234=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrAny234.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class simultaneousAssignment_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "simultaneousAssignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:1: simultaneousAssignment : VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) ;
	public final BLESS3Parser.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		BLESS3Parser.simultaneousAssignment_return retval = new BLESS3Parser.simultaneousAssignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token left_comma=null;
		Token a=null;
		Token right_comma=null;
		Token VERT235=null;
		Token COMMA236=null;
		Token COMMA237=null;
		Token VERT238=null;
		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		BAST left_comma_tree=null;
		BAST a_tree=null;
		BAST right_comma_tree=null;
		BAST VERT235_tree=null;
		BAST COMMA236_tree=null;
		BAST COMMA237_tree=null;
		BAST VERT238_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERT=new RewriteRuleTokenStream(adaptor,"token VERT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_nameTick=new RewriteRuleSubtreeStream(adaptor,"rule nameTick");
		RewriteRuleSubtreeStream stream_expressionOrAny=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrAny");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:24: ( VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1287:2: VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT
			{
			VERT235=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8088); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT235);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8094);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			left_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8098); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(left_comma);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8102);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:47: ( COMMA lhs+= nameTick )*
			loop124:
			while (true) {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==COMMA) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:49: COMMA lhs+= nameTick
					{
					COMMA236=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8106); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA236);

					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8110);
					lhs=nameTick();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTree());
					}
					break;

				default :
					break loop124;
				}
			}

			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8118); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(a);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8124);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			right_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8128); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(right_comma);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8132);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1290:62: ( COMMA rhs+= expressionOrAny )*
			loop125:
			while (true) {
				int alt125=2;
				int LA125_0 = input.LA(1);
				if ( (LA125_0==COMMA) ) {
					alt125=1;
				}

				switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1290:64: COMMA rhs+= expressionOrAny
					{
					COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8136); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA237);

					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8140);
					rhs=expressionOrAny();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTree());
					}
					break;

				default :
					break loop125;
				}
			}

			VERT238=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8147); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT238);

			// AST REWRITE
			// elements: rhs, a, right_comma, lhs, left_comma
			// token labels: a, right_comma, left_comma
			// rule labels: retval
			// token list labels: 
			// rule list labels: lhs, rhs
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
			RewriteRuleTokenStream stream_right_comma=new RewriteRuleTokenStream(adaptor,"token right_comma",right_comma);
			RewriteRuleTokenStream stream_left_comma=new RewriteRuleTokenStream(adaptor,"token left_comma",left_comma);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"token lhs",list_lhs);
			RewriteRuleSubtreeStream stream_rhs=new RewriteRuleSubtreeStream(adaptor,"token rhs",list_rhs);
			root_0 = (BAST)adaptor.nil();
			// 1292:5: -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1292:8: ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_a.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1292:13: ^( $left_comma ( $lhs)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_left_comma.nextNode(), root_2);
				if ( !(stream_lhs.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_lhs.hasNext() ) {
					adaptor.addChild(root_2, stream_lhs.nextTree());
				}
				stream_lhs.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1292:36: ^( $right_comma ( $rhs)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_right_comma.nextNode(), root_2);
				if ( !(stream_rhs.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_rhs.hasNext() ) {
					adaptor.addChild(root_2, stream_rhs.nextTree());
				}
				stream_rhs.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simultaneousAssignment"


	public static class nameTick_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "nameTick"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:1: nameTick : valueName ( TICK ^)? ;
	public final BLESS3Parser.nameTick_return nameTick() throws RecognitionException {
		BLESS3Parser.nameTick_return retval = new BLESS3Parser.nameTick_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TICK240=null;
		ParserRuleReturnScope valueName239 =null;

		BAST TICK240_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:9: ( valueName ( TICK ^)? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:11: valueName ( TICK ^)?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_valueName_in_nameTick8188);
			valueName239=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName239.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:21: ( TICK ^)?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==TICK) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:23: TICK ^
					{
					TICK240=(Token)match(input,TICK,FOLLOW_TICK_in_nameTick8192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK240_tree = (BAST)adaptor.create(TICK240);
					root_0 = (BAST)adaptor.becomeRoot(TICK240_tree, root_0);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameTick"


	public static class expressionOrAny_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "expressionOrAny"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:1: expressionOrAny : ( expression | LITERAL_any );
	public final BLESS3Parser.expressionOrAny_return expressionOrAny() throws RecognitionException {
		BLESS3Parser.expressionOrAny_return retval = new BLESS3Parser.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_any242=null;
		ParserRuleReturnScope expression241 =null;

		BAST LITERAL_any242_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:16: ( expression | LITERAL_any )
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==AADL_STRING_LITERAL||LA127_0==ID||LA127_0==LBRACKET||LA127_0==LITERAL_abs||LA127_0==LITERAL_all||LA127_0==LITERAL_exists||LA127_0==LITERAL_false||(LA127_0 >= LITERAL_not && LA127_0 <= LITERAL_numberof)||LA127_0==LITERAL_product||LA127_0==LITERAL_round||LA127_0==LITERAL_self||LA127_0==LITERAL_sum||LA127_0==LITERAL_timeout||LA127_0==LITERAL_tops||(LA127_0 >= LITERAL_true && LA127_0 <= LITERAL_truncate)||LA127_0==LPAREN||LA127_0==MINUS||LA127_0==NUMBER||LA127_0==OCTOTHORPE||(LA127_0 >= QCLREF && LA127_0 <= QCREF)) ) {
				alt127=1;
			}
			else if ( (LA127_0==LITERAL_any) ) {
				alt127=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}

			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1298:3: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_expressionOrAny8206);
					expression241=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression241.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1298:16: LITERAL_any
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_any242=(Token)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8210); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_any242_tree = (BAST)adaptor.create(LITERAL_any242);
					adaptor.addChild(root_0, LITERAL_any242_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionOrAny"


	public static class whenThrow_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "whenThrow"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1301:1: whenThrow : LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ;
	public final BLESS3Parser.whenThrow_return whenThrow() throws RecognitionException {
		BLESS3Parser.whenThrow_return retval = new BLESS3Parser.whenThrow_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token excep=null;
		Token message=null;
		Token LITERAL_when243=null;
		Token LPAREN244=null;
		Token RPAREN245=null;
		Token LITERAL_throw246=null;
		ParserRuleReturnScope exp =null;

		BAST excep_tree=null;
		BAST message_tree=null;
		BAST LITERAL_when243_tree=null;
		BAST LPAREN244_tree=null;
		BAST RPAREN245_tree=null;
		BAST LITERAL_throw246_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1301:10: ( LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:3: LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_when243=(Token)match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8222); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_when243_tree = (BAST)adaptor.create(LITERAL_when243);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_when243_tree, root_0);
			}

			LPAREN244=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8225); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN244_tree = (BAST)adaptor.create(LPAREN244);
			adaptor.addChild(root_0, LPAREN244_tree);
			}

			pushFollow(FOLLOW_expression_in_whenThrow8229);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8231); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN245_tree = (BAST)adaptor.create(RPAREN245);
			adaptor.addChild(root_0, RPAREN245_tree);
			}

			LITERAL_throw246=(Token)match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8233); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throw246_tree = (BAST)adaptor.create(LITERAL_throw246);
			adaptor.addChild(root_0, LITERAL_throw246_tree);
			}

			excep=(Token)match(input,ID,FOLLOW_ID_in_whenThrow8237); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			excep_tree = (BAST)adaptor.create(excep);
			adaptor.addChild(root_0, excep_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1303:10: (message= AADL_STRING_LITERAL )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==AADL_STRING_LITERAL) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1303:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8245); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenThrow"


	public static class combinableOperation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "combinableOperation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1306:1: combinableOperation : (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !);
	public final BLESS3Parser.combinableOperation_return combinableOperation() throws RecognitionException {
		BLESS3Parser.combinableOperation_return retval = new BLESS3Parser.combinableOperation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token f_add=null;
		Token target=null;
		Token result=null;
		Token f_or=null;
		Token f_and=null;
		Token f_xor=null;
		Token sw=null;
		Token reference=null;
		Token LPAREN247=null;
		Token COMMA248=null;
		Token COMMA249=null;
		Token RPAREN250=null;
		Token LPAREN251=null;
		Token COMMA252=null;
		Token COMMA253=null;
		Token RPAREN254=null;
		Token LPAREN255=null;
		Token COMMA256=null;
		Token COMMA257=null;
		Token RPAREN258=null;
		Token LPAREN259=null;
		Token COMMA260=null;
		Token COMMA261=null;
		Token RPAREN262=null;
		Token LPAREN263=null;
		Token COMMA264=null;
		Token COMMA265=null;
		Token RPAREN266=null;
		ParserRuleReturnScope arithmetic =null;
		ParserRuleReturnScope bool =null;

		BAST f_add_tree=null;
		BAST target_tree=null;
		BAST result_tree=null;
		BAST f_or_tree=null;
		BAST f_and_tree=null;
		BAST f_xor_tree=null;
		BAST sw_tree=null;
		BAST reference_tree=null;
		BAST LPAREN247_tree=null;
		BAST COMMA248_tree=null;
		BAST COMMA249_tree=null;
		BAST RPAREN250_tree=null;
		BAST LPAREN251_tree=null;
		BAST COMMA252_tree=null;
		BAST COMMA253_tree=null;
		BAST RPAREN254_tree=null;
		BAST LPAREN255_tree=null;
		BAST COMMA256_tree=null;
		BAST COMMA257_tree=null;
		BAST RPAREN258_tree=null;
		BAST LPAREN259_tree=null;
		BAST COMMA260_tree=null;
		BAST COMMA261_tree=null;
		BAST RPAREN262_tree=null;
		BAST LPAREN263_tree=null;
		BAST COMMA264_tree=null;
		BAST COMMA265_tree=null;
		BAST RPAREN266_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1306:20: (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !)
			int alt129=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt129=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt129=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt129=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt129=4;
				}
				break;
			case LITERAL_swap:
				{
				alt129=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}
			switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1307:3: f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_add=(Token)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation8266); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_add_tree = (BAST)adaptor.create(f_add);
					root_0 = (BAST)adaptor.becomeRoot(f_add_tree, root_0);
					}

					LPAREN247=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8269); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8274); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8276); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8281);
					arithmetic=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic.getTree());

					COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8283); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8288); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8290); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1309:3: f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_or=(Token)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation8302); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_or_tree = (BAST)adaptor.create(f_or);
					root_0 = (BAST)adaptor.becomeRoot(f_or_tree, root_0);
					}

					LPAREN251=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8305); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8310); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8312); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8317);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8319); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8324); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN254=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8326); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1311:3: f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_and=(Token)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation8337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_and_tree = (BAST)adaptor.create(f_and);
					root_0 = (BAST)adaptor.becomeRoot(f_and_tree, root_0);
					}

					LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8340); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8345); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8347); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8352);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA257=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8354); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8359); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8361); if (state.failed) return retval;
					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1313:3: f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_xor=(Token)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation8372); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_xor_tree = (BAST)adaptor.create(f_xor);
					root_0 = (BAST)adaptor.becomeRoot(f_xor_tree, root_0);
					}

					LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8375); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8382); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8387);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA261=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8389); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN262=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8396); if (state.failed) return retval;
					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1315:3: sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					sw=(Token)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation8407); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					sw_tree = (BAST)adaptor.create(sw);
					root_0 = (BAST)adaptor.becomeRoot(sw_tree, root_0);
					}

					LPAREN263=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8410); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8415); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8417); if (state.failed) return retval;
					reference=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					reference_tree = (BAST)adaptor.create(reference);
					adaptor.addChild(root_0, reference_tree);
					}

					COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8424); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8429); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN266=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8431); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "combinableOperation"


	public static class communicationAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "communicationAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:1: communicationAction : (pc= subprogramCall |po= portOutput |pi= portInput );
	public final BLESS3Parser.communicationAction_return communicationAction() throws RecognitionException {
		BLESS3Parser.communicationAction_return retval = new BLESS3Parser.communicationAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pc =null;
		ParserRuleReturnScope po =null;
		ParserRuleReturnScope pi =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:20: (pc= subprogramCall |po= portOutput |pi= portInput )
			int alt130=3;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==ID) ) {
				switch ( input.LA(2) ) {
				case LPAREN:
					{
					alt130=1;
					}
					break;
				case EXCLAMATION:
					{
					alt130=2;
					}
					break;
				case QUESTION:
					{
					alt130=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 130, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 130, 0, input);
				throw nvae;
			}

			switch (alt130) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1319:3: pc= subprogramCall
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_subprogramCall_in_communicationAction8446);
					pc=subprogramCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1321:3: po= portOutput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portOutput_in_communicationAction8456);
					po=portOutput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, po.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1323:3: pi= portInput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portInput_in_communicationAction8466);
					pi=portInput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pi.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "communicationAction"


	public static class computation_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "computation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1330:1: computation : LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )? ;
	public final BLESS3Parser.computation_return computation() throws RecognitionException {
		BLESS3Parser.computation_return retval = new BLESS3Parser.computation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token component=null;
		Token LITERAL_computation267=null;
		Token LPAREN268=null;
		Token COMMA269=null;
		Token RPAREN270=null;
		Token LITERAL_in271=null;
		Token LITERAL_binding272=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST component_tree=null;
		BAST LITERAL_computation267_tree=null;
		BAST LPAREN268_tree=null;
		BAST COMMA269_tree=null;
		BAST RPAREN270_tree=null;
		BAST LITERAL_in271_tree=null;
		BAST LITERAL_binding272_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1330:12: ( LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:3: LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_computation267=(Token)match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation8482); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_computation267_tree = (BAST)adaptor.create(LITERAL_computation267);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_computation267_tree, root_0);
			}

			LPAREN268=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computation8485); if (state.failed) return retval;
			pushFollow(FOLLOW_behaviorTime_in_computation8490);
			lb=behaviorTime();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:48: ( COMMA !ub= behaviorTime )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==COMMA) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1331:50: COMMA !ub= behaviorTime
					{
					COMMA269=(Token)match(input,COMMA,FOLLOW_COMMA_in_computation8494); if (state.failed) return retval;
					pushFollow(FOLLOW_behaviorTime_in_computation8499);
					ub=behaviorTime();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					}
					break;

			}

			RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computation8504); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:5: ( LITERAL_in ! LITERAL_binding ^ (component= QCREF )+ )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==LITERAL_in) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:7: LITERAL_in ! LITERAL_binding ^ (component= QCREF )+
					{
					LITERAL_in271=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_computation8513); if (state.failed) return retval;
					LITERAL_binding272=(Token)match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation8516); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_binding272_tree = (BAST)adaptor.create(LITERAL_binding272);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_binding272_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:45: (component= QCREF )+
					int cnt132=0;
					loop132:
					while (true) {
						int alt132=2;
						int LA132_0 = input.LA(1);
						if ( (LA132_0==QCREF) ) {
							alt132=1;
						}

						switch (alt132) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:45: component= QCREF
							{
							component=(Token)match(input,QCREF,FOLLOW_QCREF_in_computation8521); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							component_tree = (BAST)adaptor.create(component);
							adaptor.addChild(root_0, component_tree);
							}

							}
							break;

						default :
							if ( cnt132 >= 1 ) break loop132;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(132, input);
							throw eee;
						}
						cnt132++;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "computation"


	public static class subprogramCall_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subprogramCall"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:1: subprogramCall : id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal) ;
	public final BLESS3Parser.subprogramCall_return subprogramCall() throws RecognitionException {
		BLESS3Parser.subprogramCall_return retval = new BLESS3Parser.subprogramCall_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN273=null;
		Token RPAREN274=null;
		ParserRuleReturnScope fal =null;

		BAST id_tree=null;
		BAST LPAREN273_tree=null;
		BAST RPAREN274_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_formalActualList=new RewriteRuleSubtreeStream(adaptor,"rule formalActualList");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:15: (id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:3: id= ID LPAREN (fal= formalActualList )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_subprogramCall8539); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN273=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subprogramCall8541); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN273);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:19: (fal= formalActualList )?
			int alt134=2;
			int LA134_0 = input.LA(1);
			if ( (LA134_0==AADL_STRING_LITERAL||LA134_0==ID||LA134_0==LITERAL_false||LA134_0==LITERAL_null||LA134_0==LITERAL_self||LA134_0==LITERAL_true||LA134_0==LPAREN||LA134_0==NUMBER||LA134_0==OCTOTHORPE||(LA134_0 >= QCLREF && LA134_0 <= QCREF)) ) {
				alt134=1;
			}
			switch (alt134) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:19: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall8545);
					fal=formalActualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalActualList.add(fal.getTree());
					}
					break;

			}

			RPAREN274=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subprogramCall8548); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN274);

			// AST REWRITE
			// elements: fal, id
			// token labels: id
			// rule labels: fal, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_fal=new RewriteRuleSubtreeStream(adaptor,"rule fal",fal!=null?fal.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1337:5: -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1337:8: ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+Integer.toString($id.tree.getLine())+\"] \"] $id $fal)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(SUBPROGRAM_INVOCATION, id, "SUBPROGRAM_INVOCATION["+Integer.toString(id_tree.getLine())+"] "), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fal.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subprogramCall"


	public static class formalActualList_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "formalActualList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:1: formalActualList : formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? ;
	public final BLESS3Parser.formalActualList_return formalActualList() throws RecognitionException {
		BLESS3Parser.formalActualList_return retval = new BLESS3Parser.formalActualList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA276=null;
		Token COMMA278=null;
		ParserRuleReturnScope formalActual275 =null;
		ParserRuleReturnScope formalActual277 =null;
		ParserRuleReturnScope formalActual279 =null;

		BAST COMMA276_tree=null;
		BAST COMMA278_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:17: ( formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1342:3: formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalActual_in_formalActualList8579);
			formalActual275=formalActual();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual275.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1342:16: ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==COMMA) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1342:18: COMMA ^ formalActual ( COMMA ! formalActual )*
					{
					COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8583); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA276_tree = (BAST)adaptor.create(COMMA276);
					root_0 = (BAST)adaptor.becomeRoot(COMMA276_tree, root_0);
					}

					pushFollow(FOLLOW_formalActual_in_formalActualList8586);
					formalActual277=formalActual();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual277.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1342:38: ( COMMA ! formalActual )*
					loop135:
					while (true) {
						int alt135=2;
						int LA135_0 = input.LA(1);
						if ( (LA135_0==COMMA) ) {
							alt135=1;
						}

						switch (alt135) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1342:40: COMMA ! formalActual
							{
							COMMA278=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8590); if (state.failed) return retval;
							pushFollow(FOLLOW_formalActual_in_formalActualList8593);
							formalActual279=formalActual();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual279.getTree());

							}
							break;

						default :
							break loop135;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalActualList"


	public static class formalActual_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "formalActual"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1345:1: formalActual : (formal= ID COLON ^)? actual= subProgramParameter ;
	public final BLESS3Parser.formalActual_return formalActual() throws RecognitionException {
		BLESS3Parser.formalActual_return retval = new BLESS3Parser.formalActual_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON280=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON280_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1345:13: ( (formal= ID COLON ^)? actual= subProgramParameter )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1346:3: (formal= ID COLON ^)? actual= subProgramParameter
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1346:3: (formal= ID COLON ^)?
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==ID) ) {
				int LA137_1 = input.LA(2);
				if ( (LA137_1==COLON) ) {
					alt137=1;
				}
			}
			switch (alt137) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1346:5: formal= ID COLON ^
					{
					formal=(Token)match(input,ID,FOLLOW_ID_in_formalActual8615); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					formal_tree = (BAST)adaptor.create(formal);
					adaptor.addChild(root_0, formal_tree);
					}

					COLON280=(Token)match(input,COLON,FOLLOW_COLON_in_formalActual8623); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLON280_tree = (BAST)adaptor.create(COLON280);
					root_0 = (BAST)adaptor.becomeRoot(COLON280_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_subProgramParameter_in_formalActual8631);
			actual=subProgramParameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, actual.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalActual"


	public static class subProgramParameter_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "subProgramParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1350:1: subProgramParameter : ( valueName | constant | parenthesizedSubexpression );
	public final BLESS3Parser.subProgramParameter_return subProgramParameter() throws RecognitionException {
		BLESS3Parser.subProgramParameter_return retval = new BLESS3Parser.subProgramParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope valueName281 =null;
		ParserRuleReturnScope constant282 =null;
		ParserRuleReturnScope parenthesizedSubexpression283 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1350:20: ( valueName | constant | parenthesizedSubexpression )
			int alt138=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt138=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_self:
			case LITERAL_true:
			case NUMBER:
			case OCTOTHORPE:
			case QCLREF:
			case QCREF:
				{
				alt138=2;
				}
				break;
			case LPAREN:
				{
				alt138=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 138, 0, input);
				throw nvae;
			}
			switch (alt138) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1351:2: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_subProgramParameter8642);
					valueName281=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName281.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1352:4: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_subProgramParameter8647);
					constant282=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant282.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1353:4: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter8652);
					parenthesizedSubexpression283=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression283.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subProgramParameter"


	public static class portOutput_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "portOutput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:1: portOutput : pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) ;
	public final BLESS3Parser.portOutput_return portOutput() throws RecognitionException {
		BLESS3Parser.portOutput_return retval = new BLESS3Parser.portOutput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn=null;
		Token EXCLAMATION284=null;
		Token LPAREN285=null;
		Token RPAREN286=null;
		ParserRuleReturnScope be =null;

		BAST pn_tree=null;
		BAST EXCLAMATION284_tree=null;
		BAST LPAREN285_tree=null;
		BAST RPAREN286_tree=null;
		RewriteRuleTokenStream stream_EXCLAMATION=new RewriteRuleTokenStream(adaptor,"token EXCLAMATION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:11: (pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:5: pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )?
			{
			pn=(Token)match(input,ID,FOLLOW_ID_in_portOutput8668); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn);

			EXCLAMATION284=(Token)match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_portOutput8670); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXCLAMATION.add(EXCLAMATION284);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:23: ( LPAREN be= expression RPAREN )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==LPAREN) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:25: LPAREN be= expression RPAREN
					{
					LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portOutput8674); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN285);

					pushFollow(FOLLOW_expression_in_portOutput8678);
					be=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(be.getTree());
					RPAREN286=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portOutput8680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN286);

					}
					break;

			}

			// AST REWRITE
			// elements: be, pn
			// token labels: pn
			// rule labels: be, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_pn=new RewriteRuleTokenStream(adaptor,"token pn",pn);
			RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1358:5: -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:8: ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_OUTPUT, pn, "PORT_OUTPUT["+Integer.toString(pn_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1360:19: ( $be)?
				if ( stream_be.hasNext() ) {
					adaptor.addChild(root_1, stream_be.nextTree());
				}
				stream_be.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portOutput"


	public static class portInput_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "portInput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:1: portInput : pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) ;
	public final BLESS3Parser.portInput_return portInput() throws RecognitionException {
		BLESS3Parser.portInput_return retval = new BLESS3Parser.portInput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn2=null;
		Token QUESTION287=null;
		Token LPAREN288=null;
		Token RPAREN289=null;
		ParserRuleReturnScope n =null;

		BAST pn2_tree=null;
		BAST QUESTION287_tree=null;
		BAST LPAREN288_tree=null;
		BAST RPAREN289_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_valueName=new RewriteRuleSubtreeStream(adaptor,"rule valueName");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:10: (pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1364:5: pn2= ID QUESTION LPAREN n= valueName RPAREN
			{
			pn2=(Token)match(input,ID,FOLLOW_ID_in_portInput8726); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn2);

			QUESTION287=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_portInput8728); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION287);

			LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portInput8730); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN288);

			pushFollow(FOLLOW_valueName_in_portInput8735);
			n=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(n.getTree());
			RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portInput8737); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN289);

			// AST REWRITE
			// elements: pn2, n
			// token labels: pn2
			// rule labels: n, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_pn2=new RewriteRuleTokenStream(adaptor,"token pn2",pn2);
			RewriteRuleSubtreeStream stream_n=new RewriteRuleSubtreeStream(adaptor,"rule n",n!=null?n.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1365:6: -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1365:9: ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_INPUT, pn2, "PORT_INPUT["+Integer.toString(pn2_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn2.nextNode());
				adaptor.addChild(root_1, stream_n.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portInput"


	public static class alternative_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "alternative"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1370:1: alternative : lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) ;
	public final BLESS3Parser.alternative_return alternative() throws RecognitionException {
		BLESS3Parser.alternative_return retval = new BLESS3Parser.alternative_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lif=null;
		Token BOX290=null;
		Token LITERAL_fi291=null;
		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		BAST lif_tree=null;
		BAST BOX290_tree=null;
		BAST LITERAL_fi291_tree=null;
		RewriteRuleTokenStream stream_LITERAL_fi=new RewriteRuleTokenStream(adaptor,"token LITERAL_fi");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_BOX=new RewriteRuleTokenStream(adaptor,"token BOX");
		RewriteRuleSubtreeStream stream_guardedAction=new RewriteRuleSubtreeStream(adaptor,"rule guardedAction");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1370:12: (lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1371:3: lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi
			{
			lif=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative8778); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(lif);

			pushFollow(FOLLOW_guardedAction_in_alternative8786);
			alt=guardedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
			if (list_alt==null) list_alt=new ArrayList<Object>();
			list_alt.add(alt.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1374:3: ( BOX alt+= guardedAction )+
			int cnt140=0;
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==BOX) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1374:5: BOX alt+= guardedAction
					{
					BOX290=(Token)match(input,BOX,FOLLOW_BOX_in_alternative8792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOX.add(BOX290);

					pushFollow(FOLLOW_guardedAction_in_alternative8796);
					alt=guardedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTree());
					}
					break;

				default :
					if ( cnt140 >= 1 ) break loop140;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(140, input);
					throw eee;
				}
				cnt140++;
			}

			LITERAL_fi291=(Token)match(input,LITERAL_fi,FOLLOW_LITERAL_fi_in_alternative8804); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_fi.add(LITERAL_fi291);

			// AST REWRITE
			// elements: lif, alt
			// token labels: lif
			// rule labels: retval
			// token list labels: 
			// rule list labels: alt
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lif=new RewriteRuleTokenStream(adaptor,"token lif",lif);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_alt=new RewriteRuleSubtreeStream(adaptor,"token alt",list_alt);
			root_0 = (BAST)adaptor.nil();
			// 1376:5: -> ^( $lif ( $alt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1376:8: ^( $lif ( $alt)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lif.nextNode(), root_1);
				if ( !(stream_alt.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_alt.hasNext() ) {
					adaptor.addChild(root_1, stream_alt.nextTree());
				}
				stream_alt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternative"


	public static class guardedAction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "guardedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1382:1: guardedAction : LPAREN ! expression GUARD ^ assertedAction ;
	public final BLESS3Parser.guardedAction_return guardedAction() throws RecognitionException {
		BLESS3Parser.guardedAction_return retval = new BLESS3Parser.guardedAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN292=null;
		Token GUARD294=null;
		ParserRuleReturnScope expression293 =null;
		ParserRuleReturnScope assertedAction295 =null;

		BAST LPAREN292_tree=null;
		BAST GUARD294_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1382:14: ( LPAREN ! expression GUARD ^ assertedAction )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1383:3: LPAREN ! expression GUARD ^ assertedAction
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_guardedAction8842); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_guardedAction8846);
			expression293=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression293.getTree());

			GUARD294=(Token)match(input,GUARD,FOLLOW_GUARD_in_guardedAction8848); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GUARD294_tree = (BAST)adaptor.create(GUARD294);
			root_0 = (BAST)adaptor.becomeRoot(GUARD294_tree, root_0);
			}

			pushFollow(FOLLOW_assertedAction_in_guardedAction8851);
			assertedAction295=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertedAction295.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "guardedAction"


	public static class whileLoop_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1388:1: whileLoop : lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) ;
	public final BLESS3Parser.whileLoop_return whileLoop() throws RecognitionException {
		BLESS3Parser.whileLoop_return retval = new BLESS3Parser.whileLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lw=null;
		Token LPAREN296=null;
		Token RPAREN297=null;
		Token LITERAL_invariant298=null;
		Token LITERAL_bound299=null;
		ParserRuleReturnScope be =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope elq =null;

		BAST lw_tree=null;
		BAST LPAREN296_tree=null;
		BAST RPAREN297_tree=null;
		BAST LITERAL_invariant298_tree=null;
		BAST LITERAL_bound299_tree=null;
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_bound=new RewriteRuleTokenStream(adaptor,"token LITERAL_bound");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_while=new RewriteRuleTokenStream(adaptor,"token LITERAL_while");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1388:10: (lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1389:3: lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification
			{
			lw=(Token)match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop8875); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_while.add(lw);

			LPAREN296=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileLoop8881); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN296);

			pushFollow(FOLLOW_expression_in_whileLoop8886);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN297=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileLoop8888); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN297);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1392:3: ( LITERAL_invariant inv= assertion )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==LITERAL_invariant) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1392:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant298=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_whileLoop8895); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant298);

					pushFollow(FOLLOW_assertion_in_whileLoop8899);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1393:3: ( LITERAL_bound bd= expression )?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==LITERAL_bound) ) {
				alt142=1;
			}
			switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1393:5: LITERAL_bound bd= expression
					{
					LITERAL_bound299=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_whileLoop8908); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound299);

					pushFollow(FOLLOW_expression_in_whileLoop8913);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop8924);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: be, elq, lw, bd, inv
			// token labels: lw
			// rule labels: inv, bd, be, elq, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lw=new RewriteRuleTokenStream(adaptor,"token lw",lw);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_bd=new RewriteRuleSubtreeStream(adaptor,"rule bd",bd!=null?bd.getTree():null);
			RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1395:5: -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1395:8: ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lw.nextNode(), root_1);
				adaptor.addChild(root_1, stream_be.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1395:18: ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lw, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1395:48: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1395:54: ^( BOUND[$lw,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, lw, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1395:76: ( $bd)?
				if ( stream_bd.hasNext() ) {
					adaptor.addChild(root_2, stream_bd.nextTree());
				}
				stream_bd.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_elq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class forLoop_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "forLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1400:1: forLoop : lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) ;
	public final BLESS3Parser.forLoop_return forLoop() throws RecognitionException {
		BLESS3Parser.forLoop_return retval = new BLESS3Parser.forLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT300=null;
		Token LITERAL_invariant301=null;
		Token LCURLY302=null;
		Token RCURLY303=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope act =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT300_tree=null;
		BAST LITERAL_invariant301_tree=null;
		BAST LCURLY302_tree=null;
		BAST RCURLY303_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_for=new RewriteRuleTokenStream(adaptor,"token LITERAL_for");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_behaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule behaviorActions");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1400:8: (lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1401:3: lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY
			{
			lf=(Token)match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop8982); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_for.add(lf);

			pushFollow(FOLLOW_identifier_in_forLoop8989);
			a=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(a.getTree());
			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop8994); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_forLoop8999);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT300=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_forLoop9001); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT300);

			pushFollow(FOLLOW_expression_in_forLoop9006);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1403:3: ( LITERAL_invariant inv= assertion )?
			int alt143=2;
			int LA143_0 = input.LA(1);
			if ( (LA143_0==LITERAL_invariant) ) {
				alt143=1;
			}
			switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1403:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant301=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_forLoop9013); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant301);

					pushFollow(FOLLOW_assertion_in_forLoop9017);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			LCURLY302=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forLoop9024); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY302);

			pushFollow(FOLLOW_behaviorActions_in_forLoop9029);
			act=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(act.getTree());
			RCURLY303=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forLoop9031); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY303);

			// AST REWRITE
			// elements: lb, ub, a, li, act, lf, inv
			// token labels: lf, li
			// rule labels: inv, a, act, lb, ub, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lf=new RewriteRuleTokenStream(adaptor,"token lf",lf);
			RewriteRuleTokenStream stream_li=new RewriteRuleTokenStream(adaptor,"token li",li);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_act=new RewriteRuleSubtreeStream(adaptor,"rule act",act!=null?act.getTree():null);
			RewriteRuleSubtreeStream stream_lb=new RewriteRuleSubtreeStream(adaptor,"rule lb",lb!=null?lb.getTree():null);
			RewriteRuleSubtreeStream stream_ub=new RewriteRuleSubtreeStream(adaptor,"rule ub",ub!=null?ub.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1405:5: -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1405:7: ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1405:16: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1405:31: ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lf, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1405:61: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_act.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class doUntilLoop_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "doUntilLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1410:1: doUntilLoop : ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) ;
	public final BLESS3Parser.doUntilLoop_return doUntilLoop() throws RecognitionException {
		BLESS3Parser.doUntilLoop_return retval = new BLESS3Parser.doUntilLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ld=null;
		Token lu=null;
		Token LITERAL_invariant304=null;
		Token LITERAL_bound305=null;
		Token LPAREN306=null;
		Token RPAREN307=null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope be =null;

		BAST ld_tree=null;
		BAST lu_tree=null;
		BAST LITERAL_invariant304_tree=null;
		BAST LITERAL_bound305_tree=null;
		BAST LPAREN306_tree=null;
		BAST RPAREN307_tree=null;
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_bound=new RewriteRuleTokenStream(adaptor,"token LITERAL_bound");
		RewriteRuleTokenStream stream_LITERAL_until=new RewriteRuleTokenStream(adaptor,"token LITERAL_until");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_do=new RewriteRuleTokenStream(adaptor,"token LITERAL_do");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_behaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule behaviorActions");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1410:12: (ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1411:3: ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN
			{
			ld=(Token)match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9094); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_do.add(ld);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:3: ( LITERAL_invariant inv= assertion )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LITERAL_invariant) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant304=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_doUntilLoop9101); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant304);

					pushFollow(FOLLOW_assertion_in_doUntilLoop9105);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1413:3: ( LITERAL_bound bd= expression )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( (LA145_0==LITERAL_bound) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1413:5: LITERAL_bound bd= expression
					{
					LITERAL_bound305=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_doUntilLoop9114); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound305);

					pushFollow(FOLLOW_expression_in_doUntilLoop9119);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9130);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(ba.getTree());
			lu=(Token)match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9136); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_until.add(lu);

			LPAREN306=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doUntilLoop9138); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN306);

			pushFollow(FOLLOW_expression_in_doUntilLoop9143);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN307=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doUntilLoop9145); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN307);

			// AST REWRITE
			// elements: bd, lu, inv, ld, be, ba
			// token labels: ld, lu
			// rule labels: inv, bd, be, retval, ba
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ld=new RewriteRuleTokenStream(adaptor,"token ld",ld);
			RewriteRuleTokenStream stream_lu=new RewriteRuleTokenStream(adaptor,"token lu",lu);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_bd=new RewriteRuleSubtreeStream(adaptor,"rule bd",bd!=null?bd.getTree():null);
			RewriteRuleSubtreeStream stream_be=new RewriteRuleSubtreeStream(adaptor,"rule be",be!=null?be.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ba=new RewriteRuleSubtreeStream(adaptor,"rule ba",ba!=null?ba.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1416:5: -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:7: ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ld.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:13: ^( $lu $be)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lu.nextNode(), root_2);
				adaptor.addChild(root_2, stream_be.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:24: ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, ld, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:54: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:60: ^( BOUND[$ld,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, ld, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1416:82: ( $bd)?
				if ( stream_bd.hasNext() ) {
					adaptor.addChild(root_2, stream_bd.nextTree());
				}
				stream_bd.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_ba.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doUntilLoop"


	public static class existentialLatticeQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "existentialLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:1: existentialLatticeQuantification : (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? ;
	public final BLESS3Parser.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		BLESS3Parser.existentialLatticeQuantification_return retval = new BLESS3Parser.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lc=null;
		Token RCURLY308=null;
		ParserRuleReturnScope qv =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope cc =null;

		BAST lc_tree=null;
		BAST RCURLY308_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:33: ( (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1423:3: (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )?
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1423:5: (qv= quantifiedVariables )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==LITERAL_declare) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1423:5: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9212);
					qv=quantifiedVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qv.getTree());

					}
					break;

			}

			lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification9219); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			lc_tree = (BAST)adaptor.create(lc);
			root_0 = (BAST)adaptor.becomeRoot(lc_tree, root_0);
			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification9225);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ba.getTree());

			RCURLY308=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification9227); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RCURLY308_tree = (BAST)adaptor.create(RCURLY308);
			adaptor.addChild(root_0, RCURLY308_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1425:5: (cc= catchClause )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==LITERAL_catch) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1425:5: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification9235);
					cc=catchClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cc.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialLatticeQuantification"


	public static class universalLatticeQuantification_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "universalLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1430:1: universalLatticeQuantification : lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) ;
	public final BLESS3Parser.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		BLESS3Parser.universalLatticeQuantification_return retval = new BLESS3Parser.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT309=null;
		Token lv=null;
		List<Object> list_lv=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope elq =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT309_tree=null;
		BAST lv_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_forall=new RewriteRuleTokenStream(adaptor,"token LITERAL_forall");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1430:31: (lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:3: lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification
			{
			lf=(Token)match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9260); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_forall.add(lf);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1432:5: (lv+= ID )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==ID) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1432:5: lv+= ID
					{
					lv=(Token)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9269); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(lv);

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt148 >= 1 ) break loop148;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(148, input);
					throw eee;
				}
				cnt148++;
			}

			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9274); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9278);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT309=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_universalLatticeQuantification9280); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT309);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9284);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9293);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: ub, lb, li, elq, lv, lf
			// token labels: lf, li
			// rule labels: lb, elq, ub, retval
			// token list labels: lv
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_lf=new RewriteRuleTokenStream(adaptor,"token lf",lf);
			RewriteRuleTokenStream stream_li=new RewriteRuleTokenStream(adaptor,"token li",li);
			RewriteRuleTokenStream stream_lv=new RewriteRuleTokenStream(adaptor,"token lv", list_lv);
			RewriteRuleSubtreeStream stream_lb=new RewriteRuleSubtreeStream(adaptor,"rule lb",lb!=null?lb.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_ub=new RewriteRuleSubtreeStream(adaptor,"rule ub",ub!=null?ub.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1435:5: -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1435:8: ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				if ( !(stream_lv.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_lv.hasNext() ) {
					adaptor.addChild(root_1, stream_lv.nextNode());
				}
				stream_lv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1435:19: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_elq.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); 
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalLatticeQuantification"


	public static class issueException_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "issueException"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:1: issueException : LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN ;
	public final BLESS3Parser.issueException_return issueException() throws RecognitionException {
		BLESS3Parser.issueException_return retval = new BLESS3Parser.issueException_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token exception=null;
		Token message=null;
		Token LITERAL_exception310=null;
		Token LPAREN311=null;
		Token RPAREN312=null;

		BAST exception_tree=null;
		BAST message_tree=null;
		BAST LITERAL_exception310_tree=null;
		BAST LPAREN311_tree=null;
		BAST RPAREN312_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:15: ( LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1441:2: LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_exception310=(Token)match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9342); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_exception310_tree = (BAST)adaptor.create(LITERAL_exception310);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_exception310_tree, root_0);
			}

			LPAREN311=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_issueException9345); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN311_tree = (BAST)adaptor.create(LPAREN311);
			adaptor.addChild(root_0, LPAREN311_tree);
			}

			exception=(Token)match(input,ID,FOLLOW_ID_in_issueException9349); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			exception_tree = (BAST)adaptor.create(exception);
			adaptor.addChild(root_0, exception_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:10: (message= AADL_STRING_LITERAL )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==AADL_STRING_LITERAL) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9357); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			RPAREN312=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_issueException9360); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN312_tree = (BAST)adaptor.create(RPAREN312);
			adaptor.addChild(root_0, RPAREN312_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "issueException"


	public static class blessSubclause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "blessSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:1: blessSubclause : (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) ;
	public final BLESS3Parser.blessSubclause_return blessSubclause() throws RecognitionException {
		BLESS3Parser.blessSubclause_return retval = new BLESS3Parser.blessSubclause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token no_proof=null;
		ParserRuleReturnScope ac =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope vs =null;
		ParserRuleReturnScope ss =null;
		ParserRuleReturnScope t =null;

		BAST no_proof_tree=null;
		RewriteRuleTokenStream stream_DO_NOT_PROVE=new RewriteRuleTokenStream(adaptor,"token DO_NOT_PROVE");
		RewriteRuleSubtreeStream stream_invariantClause=new RewriteRuleSubtreeStream(adaptor,"rule invariantClause");
		RewriteRuleSubtreeStream stream_assertClause=new RewriteRuleSubtreeStream(adaptor,"rule assertClause");
		RewriteRuleSubtreeStream stream_variablesSection=new RewriteRuleSubtreeStream(adaptor,"rule variablesSection");
		RewriteRuleSubtreeStream stream_statesSection=new RewriteRuleSubtreeStream(adaptor,"rule statesSection");
		RewriteRuleSubtreeStream stream_transitions=new RewriteRuleSubtreeStream(adaptor,"rule transitions");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:15: ( (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:2: (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:10: (no_proof= DO_NOT_PROVE )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==DO_NOT_PROVE) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:10: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9374); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1450:5: (ac= assertClause )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LITERAL_assert) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1450:5: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_blessSubclause9381);
					ac=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(ac.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1451:6: (inv= invariantClause )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==LITERAL_invariant) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1451:6: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_blessSubclause9390);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invariantClause.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1452:5: (vs= variablesSection )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==LITERAL_variables) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1452:5: vs= variablesSection
					{
					pushFollow(FOLLOW_variablesSection_in_blessSubclause9397);
					vs=variablesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variablesSection.add(vs.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1453:5: (ss= statesSection )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==LITERAL_states) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1453:5: ss= statesSection
					{
					pushFollow(FOLLOW_statesSection_in_blessSubclause9404);
					ss=statesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statesSection.add(ss.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1454:4: (t= transitions )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==LITERAL_transitions) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1454:4: t= transitions
					{
					pushFollow(FOLLOW_transitions_in_blessSubclause9411);
					t=transitions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_transitions.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: no_proof, vs, inv, ac, t, ss
			// token labels: no_proof
			// rule labels: inv, ss, ac, t, vs, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_ss=new RewriteRuleSubtreeStream(adaptor,"rule ss",ss!=null?ss.getTree():null);
			RewriteRuleSubtreeStream stream_ac=new RewriteRuleSubtreeStream(adaptor,"rule ac",ac!=null?ac.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_vs=new RewriteRuleSubtreeStream(adaptor,"rule vs",vs!=null?vs.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1455:5: -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1455:8: ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BLESS_SUBCLAUSE, "BLESS_SUBCLAUSE"), root_1);
				adaptor.addChild(root_1, stream_no_proof.nextNode());
				adaptor.addChild(root_1, stream_ac.nextTree());
				adaptor.addChild(root_1, stream_inv.nextTree());
				adaptor.addChild(root_1, stream_vs.nextTree());
				adaptor.addChild(root_1, stream_ss.nextTree());
				adaptor.addChild(root_1, stream_t.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blessSubclause"


	public static class invariantClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "invariantClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:1: invariantClause : LITERAL_invariant ^ assertion ;
	public final BLESS3Parser.invariantClause_return invariantClause() throws RecognitionException {
		BLESS3Parser.invariantClause_return retval = new BLESS3Parser.invariantClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_invariant313=null;
		ParserRuleReturnScope assertion314 =null;

		BAST LITERAL_invariant313_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:16: ( LITERAL_invariant ^ assertion )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1459:3: LITERAL_invariant ^ assertion
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_invariant313=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9453); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_invariant313_tree = (BAST)adaptor.create(LITERAL_invariant313);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_invariant313_tree, root_0);
			}

			pushFollow(FOLLOW_assertion_in_invariantClause9456);
			assertion314=assertion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertion314.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invariantClause"


	public static class variablesSection_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "variablesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1462:1: variablesSection : LITERAL_variables ^ (vd+= variableDeclaration )+ ;
	public final BLESS3Parser.variablesSection_return variablesSection() throws RecognitionException {
		BLESS3Parser.variablesSection_return retval = new BLESS3Parser.variablesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_variables315=null;
		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		BAST LITERAL_variables315_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1462:17: ( LITERAL_variables ^ (vd+= variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1463:2: LITERAL_variables ^ (vd+= variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_variables315=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection9468); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_variables315_tree = (BAST)adaptor.create(LITERAL_variables315);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_variables315_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1463:23: (vd+= variableDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1463:23: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection9473);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTree());
					}
					break;

				default :
					if ( cnt156 >= 1 ) break loop156;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(156, input);
					throw eee;
				}
				cnt156++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variablesSection"


	public static class statesSection_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "statesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:1: statesSection : LITERAL_states ^ (states+= behaviorState )+ ;
	public final BLESS3Parser.statesSection_return statesSection() throws RecognitionException {
		BLESS3Parser.statesSection_return retval = new BLESS3Parser.statesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_states316=null;
		List<Object> list_states=null;
		RuleReturnScope states = null;
		BAST LITERAL_states316_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:14: ( LITERAL_states ^ (states+= behaviorState )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:4: LITERAL_states ^ (states+= behaviorState )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_states316=(Token)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection9485); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_states316_tree = (BAST)adaptor.create(LITERAL_states316);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_states316_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:26: (states+= behaviorState )+
			int cnt157=0;
			loop157:
			while (true) {
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==ID) ) {
					alt157=1;
				}

				switch (alt157) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection9490);
					states=behaviorState();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, states.getTree());

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTree());
					}
					break;

				default :
					if ( cnt157 >= 1 ) break loop157;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(157, input);
					throw eee;
				}
				cnt157++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statesSection"


	public static class behaviorState_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorState"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1473:1: behaviorState : i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) ;
	public final BLESS3Parser.behaviorState_return behaviorState() throws RecognitionException {
		BLESS3Parser.behaviorState_return retval = new BLESS3Parser.behaviorState_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token init=null;
		Token com=null;
		Token finl=null;
		Token st=null;
		Token COLON317=null;
		Token SEMICOLON318=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope a =null;

		BAST init_tree=null;
		BAST com_tree=null;
		BAST finl_tree=null;
		BAST st_tree=null;
		BAST COLON317_tree=null;
		BAST SEMICOLON318_tree=null;
		RewriteRuleTokenStream stream_LITERAL_final=new RewriteRuleTokenStream(adaptor,"token LITERAL_final");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LITERAL_state=new RewriteRuleTokenStream(adaptor,"token LITERAL_state");
		RewriteRuleTokenStream stream_LITERAL_initial=new RewriteRuleTokenStream(adaptor,"token LITERAL_initial");
		RewriteRuleTokenStream stream_LITERAL_complete=new RewriteRuleTokenStream(adaptor,"token LITERAL_complete");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1473:14: (i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:3: i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )?
			{
			pushFollow(FOLLOW_identifier_in_behaviorState9507);
			i=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(i.getTree());
			COLON317=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorState9512); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON317);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:9: (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )?
			int alt158=4;
			switch ( input.LA(1) ) {
				case LITERAL_initial:
					{
					alt158=1;
					}
					break;
				case LITERAL_complete:
					{
					alt158=2;
					}
					break;
				case LITERAL_final:
					{
					alt158=3;
					}
					break;
			}
			switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:10: init= LITERAL_initial
					{
					init=(Token)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState9517); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_initial.add(init);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:33: com= LITERAL_complete
					{
					com=(Token)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState9523); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_complete.add(com);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:56: finl= LITERAL_final
					{
					finl=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState9529); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(finl);

					}
					break;

			}

			st=(Token)match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState9535); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_state.add(st);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:95: (a= assertion )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==LASS) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:95: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState9539);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:107: ( SEMICOLON )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==SEMICOLON) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:107: SEMICOLON
					{
					SEMICOLON318=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorState9542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON318);

					}
					break;

			}

			// AST REWRITE
			// elements: finl, a, init, LITERAL_state, i, com
			// token labels: com, init, finl
			// rule labels: a, i, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_com=new RewriteRuleTokenStream(adaptor,"token com",com);
			RewriteRuleTokenStream stream_init=new RewriteRuleTokenStream(adaptor,"token init",init);
			RewriteRuleTokenStream stream_finl=new RewriteRuleTokenStream(adaptor,"token finl",finl);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.getTree():null);
			RewriteRuleSubtreeStream stream_i=new RewriteRuleSubtreeStream(adaptor,"rule i",i!=null?i.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1476:5: -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:8: ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_state, st, "state["+Integer.toString(st.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:89: ( $init)?
				if ( stream_init.hasNext() ) {
					adaptor.addChild(root_1, stream_init.nextNode());
				}
				stream_init.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:96: ( $com)?
				if ( stream_com.hasNext() ) {
					adaptor.addChild(root_1, stream_com.nextNode());
				}
				stream_com.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:102: ( $finl)?
				if ( stream_finl.hasNext() ) {
					adaptor.addChild(root_1, stream_finl.nextNode());
				}
				stream_finl.reset();

				adaptor.addChild(root_1, stream_i.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:112: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree());
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorState"


	public static class transitions_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "transitions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1481:1: transitions : t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) ;
	public final BLESS3Parser.transitions_return transitions() throws RecognitionException {
		BLESS3Parser.transitions_return retval = new BLESS3Parser.transitions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token t=null;
		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		BAST t_tree=null;
		RewriteRuleTokenStream stream_LITERAL_transitions=new RewriteRuleTokenStream(adaptor,"token LITERAL_transitions");
		RewriteRuleSubtreeStream stream_behaviorTransition=new RewriteRuleSubtreeStream(adaptor,"rule behaviorTransition");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1482:3: (t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:3: t= LITERAL_transitions (bt+= behaviorTransition )+
			{
			t=(Token)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions9603); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(t);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:27: (bt+= behaviorTransition )+
			int cnt161=0;
			loop161:
			while (true) {
				int alt161=2;
				int LA161_0 = input.LA(1);
				if ( (LA161_0==ID) ) {
					alt161=1;
				}

				switch (alt161) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:27: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions9607);
					bt=behaviorTransition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorTransition.add(bt.getTree());
					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTree());
					}
					break;

				default :
					if ( cnt161 >= 1 ) break loop161;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(161, input);
					throw eee;
				}
				cnt161++;
			}

			// AST REWRITE
			// elements: bt, LITERAL_transitions
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: bt
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_bt=new RewriteRuleSubtreeStream(adaptor,"token bt",list_bt);
			root_0 = (BAST)adaptor.nil();
			// 1484:5: -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:8: ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_transitions, t, "transitions["+Integer.toString(t.getLine()+startingLine)+"]"), root_1);
				if ( !(stream_bt.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_bt.hasNext() ) {
					adaptor.addChild(root_1, stream_bt.nextTree());
				}
				stream_bt.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree()); Dump.it("If you get \"mismatched input"+
			      " '<<' expecting 'transitions'\" then you might have put a semicolon "+
			      "between an action and a Assertion, instead of afterwards.");
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transitions"


	public static class behaviorTransition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorTransition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1491:1: behaviorTransition : id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) ;
	public final BLESS3Parser.behaviorTransition_return behaviorTransition() throws RecognitionException {
		BLESS3Parser.behaviorTransition_return retval = new BLESS3Parser.behaviorTransition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token x=null;
		Token semi=null;
		Token COLON319=null;
		Token COMMA320=null;
		Token RCON321=null;
		Token LCURLY322=null;
		Token RCURLY323=null;
		Token EMPTY_CURLY324=null;
		List<Object> list_ssi=null;
		ParserRuleReturnScope pr =null;
		ParserRuleReturnScope bc =null;
		ParserRuleReturnScope dsi =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope q =null;
		RuleReturnScope ssi = null;
		BAST id_tree=null;
		BAST x_tree=null;
		BAST semi_tree=null;
		BAST COLON319_tree=null;
		BAST COMMA320_tree=null;
		BAST RCON321_tree=null;
		BAST LCURLY322_tree=null;
		BAST RCURLY323_tree=null;
		BAST EMPTY_CURLY324_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_EMPTY_CURLY=new RewriteRuleTokenStream(adaptor,"token EMPTY_CURLY");
		RewriteRuleTokenStream stream_LCON=new RewriteRuleTokenStream(adaptor,"token LCON");
		RewriteRuleTokenStream stream_RCON=new RewriteRuleTokenStream(adaptor,"token RCON");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_behaviorCondition=new RewriteRuleSubtreeStream(adaptor,"rule behaviorCondition");
		RewriteRuleSubtreeStream stream_behaviorActions=new RewriteRuleSubtreeStream(adaptor,"rule behaviorActions");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_priority=new RewriteRuleSubtreeStream(adaptor,"rule priority");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:3: (id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:4: id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_behaviorTransition9652); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:12: (pr= priority )?
			int alt162=2;
			int LA162_0 = input.LA(1);
			if ( (LA162_0==LBRACKET) ) {
				alt162=1;
			}
			switch (alt162) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:12: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition9656);
					pr=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_priority.add(pr.getTree());
					}
					break;

			}

			COLON319=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorTransition9659); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON319);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9667);
			ssi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
			if (list_ssi==null) list_ssi=new ArrayList<Object>();
			list_ssi.add(ssi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1494:36: ( COMMA ssi+= identifier )*
			loop163:
			while (true) {
				int alt163=2;
				int LA163_0 = input.LA(1);
				if ( (LA163_0==COMMA) ) {
					alt163=1;
				}

				switch (alt163) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1494:38: COMMA ssi+= identifier
					{
					COMMA320=(Token)match(input,COMMA,FOLLOW_COMMA_in_behaviorTransition9671); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA320);

					pushFollow(FOLLOW_identifier_in_behaviorTransition9676);
					ssi=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi.getTree());
					}
					break;

				default :
					break loop163;
				}
			}

			x=(Token)match(input,LCON,FOLLOW_LCON_in_behaviorTransition9685); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCON.add(x);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1495:12: (bc= behaviorCondition )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==AADL_STRING_LITERAL||LA164_0==ID||LA164_0==LBRACKET||LA164_0==LITERAL_abs||LA164_0==LITERAL_all||LA164_0==LITERAL_exists||LA164_0==LITERAL_false||(LA164_0 >= LITERAL_not && LA164_0 <= LITERAL_numberof)||LA164_0==LITERAL_on||LA164_0==LITERAL_product||LA164_0==LITERAL_round||LA164_0==LITERAL_self||LA164_0==LITERAL_sum||LA164_0==LITERAL_timeout||LA164_0==LITERAL_tops||(LA164_0 >= LITERAL_true && LA164_0 <= LITERAL_truncate)||LA164_0==LPAREN||LA164_0==MINUS||LA164_0==NUMBER||LA164_0==OCTOTHORPE||(LA164_0 >= QCLREF && LA164_0 <= QCREF)) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1495:12: bc= behaviorCondition
					{
					pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition9689);
					bc=behaviorCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorCondition.add(bc.getTree());
					}
					break;

			}

			RCON321=(Token)match(input,RCON,FOLLOW_RCON_in_behaviorTransition9692); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCON.add(RCON321);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9699);
			dsi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dsi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:3: ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY )
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==LCURLY) ) {
				alt165=1;
			}
			else if ( (LA165_0==EMPTY_CURLY) ) {
				alt165=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:5: LCURLY s= behaviorActions RCURLY
					{
					LCURLY322=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behaviorTransition9706); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY322);

					pushFollow(FOLLOW_behaviorActions_in_behaviorTransition9710);
					s=behaviorActions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorActions.add(s.getTree());
					RCURLY323=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_behaviorTransition9712); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY323);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1497:39: EMPTY_CURLY
					{
					EMPTY_CURLY324=(Token)match(input,EMPTY_CURLY,FOLLOW_EMPTY_CURLY_in_behaviorTransition9716); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EMPTY_CURLY.add(EMPTY_CURLY324);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:4: (q= assertion )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==LASS) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:4: q= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorTransition9724);
					q=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(q.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:20: (semi= SEMICOLON )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==SEMICOLON) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:20: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorTransition9729); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: dsi, ssi, id, q, s, pr, bc
			// token labels: id
			// rule labels: q, bc, pr, s, dsi, retval
			// token list labels: 
			// rule list labels: ssi
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.getTree():null);
			RewriteRuleSubtreeStream stream_bc=new RewriteRuleSubtreeStream(adaptor,"rule bc",bc!=null?bc.getTree():null);
			RewriteRuleSubtreeStream stream_pr=new RewriteRuleSubtreeStream(adaptor,"rule pr",pr!=null?pr.getTree():null);
			RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
			RewriteRuleSubtreeStream stream_dsi=new RewriteRuleSubtreeStream(adaptor,"rule dsi",dsi!=null?dsi.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ssi=new RewriteRuleSubtreeStream(adaptor,"token ssi",list_ssi);
			root_0 = (BAST)adaptor.nil();
			// 1499:5: -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1500:7: ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(TRANSITION, x, "TRANSITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:7: ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, x, "LABEL["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:82: ( $pr)?
				if ( stream_pr.hasNext() ) {
					adaptor.addChild(root_2, stream_pr.nextTree());
				}
				stream_pr.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:7: ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(SOURCE, x, "SOURCE["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				if ( !(stream_ssi.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_ssi.hasNext() ) {
					adaptor.addChild(root_2, stream_ssi.nextTree());
				}
				stream_ssi.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1503:7: ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITION, x, "CONDITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1503:86: ( $bc)?
				if ( stream_bc.hasNext() ) {
					adaptor.addChild(root_2, stream_bc.nextTree());
				}
				stream_bc.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1504:7: ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(DESTINATION, x, "DESTINATION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_dsi.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1505:7: ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, x, "ACTION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1505:80: ( $s)?
				if ( stream_s.hasNext() ) {
					adaptor.addChild(root_2, stream_s.nextTree());
				}
				stream_s.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1506:7: ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, semi, "Q["+Integer.toString(semi.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1506:76: ( $q)?
				if ( stream_q.hasNext() ) {
					adaptor.addChild(root_2, stream_q.nextTree());
				}
				stream_q.reset();

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {

			    Dump.it("\nDo you have either behavior actions or empty curly brackets?");
			    Dump.it("Is there a space between your empty curly brackets?\nYou stink!  Take a bath.\n");
			    Dump.it("Is your execute condition grammatically-correct? ");
			    Dump.it("error token text=\""+retval.start.getText()+"\"");
			     reportError(re,(BAST)retval.getTree());
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTransition"


	public static class priority_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "priority"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1517:1: priority : LBRACKET ^ NUMBER RBRACKET ;
	public final BLESS3Parser.priority_return priority() throws RecognitionException {
		BLESS3Parser.priority_return retval = new BLESS3Parser.priority_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET325=null;
		Token NUMBER326=null;
		Token RBRACKET327=null;

		BAST LBRACKET325_tree=null;
		BAST NUMBER326_tree=null;
		BAST RBRACKET327_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1517:9: ( LBRACKET ^ NUMBER RBRACKET )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1518:2: LBRACKET ^ NUMBER RBRACKET
			{
			root_0 = (BAST)adaptor.nil();


			LBRACKET325=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_priority9891); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACKET325_tree = (BAST)adaptor.create(LBRACKET325);
			root_0 = (BAST)adaptor.becomeRoot(LBRACKET325_tree, root_0);
			}

			NUMBER326=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_priority9894); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER326_tree = (BAST)adaptor.create(NUMBER326);
			adaptor.addChild(root_0, NUMBER326_tree);
			}

			RBRACKET327=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_priority9896); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RBRACKET327_tree = (BAST)adaptor.create(RBRACKET327);
			adaptor.addChild(root_0, RBRACKET327_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "priority"


	public static class behaviorCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1521:1: behaviorCondition : ( dispatchCondition | executeCondition | modeCondition | internalCondition );
	public final BLESS3Parser.behaviorCondition_return behaviorCondition() throws RecognitionException {
		BLESS3Parser.behaviorCondition_return retval = new BLESS3Parser.behaviorCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope dispatchCondition328 =null;
		ParserRuleReturnScope executeCondition329 =null;
		ParserRuleReturnScope modeCondition330 =null;
		ParserRuleReturnScope internalCondition331 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1522:3: ( dispatchCondition | executeCondition | modeCondition | internalCondition )
			int alt168=4;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==LITERAL_on) ) {
				switch ( input.LA(2) ) {
				case LITERAL_dispatch:
					{
					alt168=1;
					}
					break;
				case LITERAL_internal:
					{
					alt168=4;
					}
					break;
				case LPAREN:
				case TRIGGER:
					{
					alt168=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 168, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA168_0==AADL_STRING_LITERAL||LA168_0==ID||LA168_0==LBRACKET||LA168_0==LITERAL_abs||LA168_0==LITERAL_all||LA168_0==LITERAL_exists||LA168_0==LITERAL_false||(LA168_0 >= LITERAL_not && LA168_0 <= LITERAL_numberof)||LA168_0==LITERAL_product||LA168_0==LITERAL_round||LA168_0==LITERAL_self||LA168_0==LITERAL_sum||LA168_0==LITERAL_timeout||LA168_0==LITERAL_tops||(LA168_0 >= LITERAL_true && LA168_0 <= LITERAL_truncate)||LA168_0==LPAREN||LA168_0==MINUS||LA168_0==NUMBER||LA168_0==OCTOTHORPE||(LA168_0 >= QCLREF && LA168_0 <= QCREF)) ) {
				alt168=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 168, 0, input);
				throw nvae;
			}

			switch (alt168) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:3: dispatchCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition9911);
					dispatchCondition328=dispatchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchCondition328.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:23: executeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_executeCondition_in_behaviorCondition9915);
					executeCondition329=executeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, executeCondition329.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:42: modeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeCondition_in_behaviorCondition9919);
					modeCondition330=modeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modeCondition330.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:58: internalCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_internalCondition_in_behaviorCondition9923);
					internalCondition331=internalCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, internalCondition331.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorCondition"


	public static class dispatchCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1526:1: dispatchCondition : LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? ;
	public final BLESS3Parser.dispatchCondition_return dispatchCondition() throws RecognitionException {
		BLESS3Parser.dispatchCondition_return retval = new BLESS3Parser.dispatchCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on332=null;
		Token LITERAL_dispatch333=null;
		ParserRuleReturnScope de =null;

		BAST LITERAL_on332_tree=null;
		BAST LITERAL_dispatch333_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1526:18: ( LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:3: LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on332=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_dispatchCondition9935); if (state.failed) return retval;
			LITERAL_dispatch333=(Token)match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition9938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_dispatch333_tree = (BAST)adaptor.create(LITERAL_dispatch333);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_dispatch333_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:35: (de= dispatchExpression )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==ID||LA169_0==LITERAL_timeout) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:35: de= dispatchExpression
					{
					pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition9943);
					de=dispatchExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, de.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchCondition"


	public static class dispatchExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1532:1: dispatchExpression :dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? ;
	public final BLESS3Parser.dispatchExpression_return dispatchExpression() throws RecognitionException {
		BLESS3Parser.dispatchExpression_return retval = new BLESS3Parser.dispatchExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or334=null;
		Token LITERAL_or335=null;
		List<Object> list_dc=null;
		RuleReturnScope dc = null;
		BAST LITERAL_or334_tree=null;
		BAST LITERAL_or335_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1532:19: (dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1533:3: dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression9961);
			dc=dispatchConjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

			if (list_dc==null) list_dc=new ArrayList<Object>();
			list_dc.add(dc.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1533:27: ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==LITERAL_or) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1533:29: LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )*
					{
					LITERAL_or334=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression9965); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or334_tree = (BAST)adaptor.create(LITERAL_or334);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or334_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression9970);
					dc=dispatchConjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

					if (list_dc==null) list_dc=new ArrayList<Object>();
					list_dc.add(dc.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:4: ( LITERAL_or !dc+= dispatchConjunction )*
					loop170:
					while (true) {
						int alt170=2;
						int LA170_0 = input.LA(1);
						if ( (LA170_0==LITERAL_or) ) {
							alt170=1;
						}

						switch (alt170) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:6: LITERAL_or !dc+= dispatchConjunction
							{
							LITERAL_or335=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression9978); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression9983);
							dc=dispatchConjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTree());
							}
							break;

						default :
							break loop170;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchExpression"


	public static class dispatchConjunction_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchConjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1539:1: dispatchConjunction :trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? ;
	public final BLESS3Parser.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		BLESS3Parser.dispatchConjunction_return retval = new BLESS3Parser.dispatchConjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and336=null;
		Token LITERAL_and337=null;
		List<Object> list_trigger=null;
		RuleReturnScope trigger = null;
		BAST LITERAL_and336_tree=null;
		BAST LITERAL_and337_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1539:20: (trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:3: trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10006);
			trigger=dispatchTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

			if (list_trigger==null) list_trigger=new ArrayList<Object>();
			list_trigger.add(trigger.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:5: ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==LITERAL_and) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1541:7: LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )*
					{
					LITERAL_and336=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10015); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and336_tree = (BAST)adaptor.create(LITERAL_and336);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and336_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10020);
					trigger=dispatchTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

					if (list_trigger==null) list_trigger=new ArrayList<Object>();
					list_trigger.add(trigger.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1542:6: ( LITERAL_and !trigger+= dispatchTrigger )*
					loop172:
					while (true) {
						int alt172=2;
						int LA172_0 = input.LA(1);
						if ( (LA172_0==LITERAL_and) ) {
							alt172=1;
						}

						switch (alt172) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1542:8: LITERAL_and !trigger+= dispatchTrigger
							{
							LITERAL_and337=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10030); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10035);
							trigger=dispatchTrigger();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

							if (list_trigger==null) list_trigger=new ArrayList<Object>();
							list_trigger.add(trigger.getTree());
							}
							break;

						default :
							break loop172;
						}
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchConjunction"


	public static class dispatchTrigger_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "dispatchTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1545:1: dispatchTrigger : (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )? );
	public final BLESS3Parser.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		BLESS3Parser.dispatchTrigger_return retval = new BLESS3Parser.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout338=null;
		Token LPAREN339=null;
		Token LITERAL_or340=null;
		Token RPAREN341=null;
		Token ports=null;
		List<Object> list_ports=null;
		ParserRuleReturnScope port =null;
		ParserRuleReturnScope time =null;

		BAST LITERAL_timeout338_tree=null;
		BAST LPAREN339_tree=null;
		BAST LITERAL_or340_tree=null;
		BAST RPAREN341_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1545:16: (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )? )
			int alt177=2;
			int LA177_0 = input.LA(1);
			if ( (LA177_0==ID) ) {
				alt177=1;
			}
			else if ( (LA177_0==LITERAL_timeout) ) {
				alt177=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 177, 0, input);
				throw nvae;
			}

			switch (alt177) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1546:3: port= portName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portName_in_dispatchTrigger10053);
					port=portName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, port.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1547:5: LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )?
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout338=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger10061); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout338_tree = (BAST)adaptor.create(LITERAL_timeout338);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_timeout338_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1548:4: ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime )?
					int alt176=2;
					int LA176_0 = input.LA(1);
					if ( (LA176_0==ID||LA176_0==LITERAL_self||LA176_0==LPAREN||LA176_0==NUMBER||LA176_0==OCTOTHORPE||(LA176_0 >= QCLREF && LA176_0 <= QCREF)) ) {
						alt176=1;
					}
					switch (alt176) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1548:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )? time= behaviorTime
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1548:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )?
							int alt175=2;
							alt175 = dfa175.predict(input);
							switch (alt175) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1548:8: LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN
									{
									LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger10072); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LPAREN339_tree = (BAST)adaptor.create(LPAREN339);
									root_0 = (BAST)adaptor.becomeRoot(LPAREN339_tree, root_0);
									}

									ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10077); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ports_tree = (BAST)adaptor.create(ports);
									adaptor.addChild(root_0, ports_tree);
									}

									if (list_ports==null) list_ports=new ArrayList<Object>();
									list_ports.add(ports);
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:9: ( LITERAL_or !ports+= ID )*
									loop174:
									while (true) {
										int alt174=2;
										int LA174_0 = input.LA(1);
										if ( (LA174_0==LITERAL_or) ) {
											alt174=1;
										}

										switch (alt174) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:10: LITERAL_or !ports+= ID
											{
											LITERAL_or340=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchTrigger10089); if (state.failed) return retval;
											ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10094); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ports_tree = (BAST)adaptor.create(ports);
											adaptor.addChild(root_0, ports_tree);
											}

											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop174;
										}
									}

									RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dispatchTrigger10108); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									RPAREN341_tree = (BAST)adaptor.create(RPAREN341);
									adaptor.addChild(root_0, RPAREN341_tree);
									}

									}
									break;

							}

							pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10126);
							time=behaviorTime();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, time.getTree());

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchTrigger"


	public static class portName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "portName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1556:1: portName : port= ID ^ ( '[' index= NUMBER ']' )? ;
	public final BLESS3Parser.portName_return portName() throws RecognitionException {
		BLESS3Parser.portName_return retval = new BLESS3Parser.portName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token port=null;
		Token index=null;
		Token char_literal342=null;
		Token char_literal343=null;

		BAST port_tree=null;
		BAST index_tree=null;
		BAST char_literal342_tree=null;
		BAST char_literal343_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1556:9: (port= ID ^ ( '[' index= NUMBER ']' )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1557:3: port= ID ^ ( '[' index= NUMBER ']' )?
			{
			root_0 = (BAST)adaptor.nil();


			port=(Token)match(input,ID,FOLLOW_ID_in_portName10147); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			port_tree = (BAST)adaptor.create(port);
			root_0 = (BAST)adaptor.becomeRoot(port_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:3: ( '[' index= NUMBER ']' )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==LBRACKET) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:5: '[' index= NUMBER ']'
					{
					char_literal342=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_portName10155); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal342_tree = (BAST)adaptor.create(char_literal342);
					adaptor.addChild(root_0, char_literal342_tree);
					}

					index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_portName10159); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					index_tree = (BAST)adaptor.create(index);
					adaptor.addChild(root_0, index_tree);
					}

					char_literal343=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_portName10161); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal343_tree = (BAST)adaptor.create(char_literal343);
					adaptor.addChild(root_0, char_literal343_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portName"


	public static class executeCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "executeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1561:1: executeCondition : expression ;
	public final BLESS3Parser.executeCondition_return executeCondition() throws RecognitionException {
		BLESS3Parser.executeCondition_return retval = new BLESS3Parser.executeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression344 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1561:17: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:15: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_executeCondition10176);
			expression344=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression344.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "executeCondition"


	public static class modeCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "modeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:1: modeCondition : LITERAL_on ^tle= triggerLogicalExpression ;
	public final BLESS3Parser.modeCondition_return modeCondition() throws RecognitionException {
		BLESS3Parser.modeCondition_return retval = new BLESS3Parser.modeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on345=null;
		ParserRuleReturnScope tle =null;

		BAST LITERAL_on345_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:14: ( LITERAL_on ^tle= triggerLogicalExpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1566:2: LITERAL_on ^tle= triggerLogicalExpression
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on345=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10187); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_on345_tree = (BAST)adaptor.create(LITERAL_on345);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_on345_tree, root_0);
			}

			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10192);
			tle=triggerLogicalExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tle.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modeCondition"


	public static class triggerLogicalExpression_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "triggerLogicalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1569:1: triggerLogicalExpression : first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first;
	public final BLESS3Parser.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		BLESS3Parser.triggerLogicalExpression_return retval = new BLESS3Parser.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_et=null;
		ParserRuleReturnScope first =null;
		ParserRuleReturnScope op1 =null;
		ParserRuleReturnScope op2 =null;
		RuleReturnScope et = null;
		RewriteRuleSubtreeStream stream_logicalOperator=new RewriteRuleSubtreeStream(adaptor,"rule logicalOperator");
		RewriteRuleSubtreeStream stream_eventTrigger=new RewriteRuleSubtreeStream(adaptor,"rule eventTrigger");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1569:25: (first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1570:3: first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			{
			pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10205);
			first=eventTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_eventTrigger.add(first.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1570:22: (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			int alt180=2;
			int LA180_0 = input.LA(1);
			if ( (LA180_0==LITERAL_and||LA180_0==LITERAL_or||LA180_0==LITERAL_xor) ) {
				alt180=1;
			}
			switch (alt180) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1570:24: op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)*
					{
					pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10211);
					op1=logicalOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalOperator.add(op1.getTree());
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10215);
					et=eventTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
					if (list_et==null) list_et=new ArrayList<Object>();
					list_et.add(et.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:5: (op2= logicalOperator et+= eventTrigger {...}?)*
					loop179:
					while (true) {
						int alt179=2;
						int LA179_0 = input.LA(1);
						if ( (LA179_0==LITERAL_and||LA179_0==LITERAL_or||LA179_0==LITERAL_xor) ) {
							alt179=1;
						}

						switch (alt179) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:6: op2= logicalOperator et+= eventTrigger {...}?
							{
							pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10225);
							op2=logicalOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicalOperator.add(op2.getTree());
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10229);
							et=eventTrigger();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTree());
							if ( !((op1==op2)) ) {
								if (state.backtracking>0) {state.failed=true; return retval;}
								throw new FailedPredicateException(input, "triggerLogicalExpression", "op1==op2");
							}
							}
							break;

						default :
							break loop179;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: et, first, op1, first
			// token labels: 
			// rule labels: op1, first, retval
			// token list labels: 
			// rule list labels: et
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.getTree():null);
			RewriteRuleSubtreeStream stream_first=new RewriteRuleSubtreeStream(adaptor,"rule first",first!=null?first.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_et=new RewriteRuleSubtreeStream(adaptor,"token et",list_et);
			root_0 = (BAST)adaptor.nil();
			// 1572:5: -> {op1!=null}? ^( $op1 $first ( $et)+ )
			if (op1!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1572:21: ^( $op1 $first ( $et)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_op1.nextNode(), root_1);
				adaptor.addChild(root_1, stream_first.nextTree());
				if ( !(stream_et.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_et.hasNext() ) {
					adaptor.addChild(root_1, stream_et.nextTree());
				}
				stream_et.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1573:5: -> $first
			{
				adaptor.addChild(root_0, stream_first.nextTree());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {

			    Dump.it("\nAll operators in trigger_logical_expression must be the same.");
			    reportError(re,(BAST)retval.getTree());
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerLogicalExpression"


	public static class logicalOperator_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "logicalOperator"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1580:1: logicalOperator : ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else );
	public final BLESS3Parser.logicalOperator_return logicalOperator() throws RecognitionException {
		BLESS3Parser.logicalOperator_return retval = new BLESS3Parser.logicalOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and346=null;
		Token LITERAL_or347=null;
		Token LITERAL_xor348=null;
		Token LITERAL_and349=null;
		Token LITERAL_then350=null;
		Token LITERAL_or351=null;
		Token LITERAL_else352=null;

		BAST LITERAL_and346_tree=null;
		BAST LITERAL_or347_tree=null;
		BAST LITERAL_xor348_tree=null;
		BAST LITERAL_and349_tree=null;
		BAST LITERAL_then350_tree=null;
		BAST LITERAL_or351_tree=null;
		BAST LITERAL_else352_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1581:3: ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else )
			int alt181=5;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				int LA181_1 = input.LA(2);
				if ( (LA181_1==LITERAL_then) ) {
					alt181=4;
				}
				else if ( (LA181_1==LPAREN||LA181_1==TRIGGER) ) {
					alt181=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 181, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_or:
				{
				int LA181_2 = input.LA(2);
				if ( (LA181_2==LITERAL_else) ) {
					alt181=5;
				}
				else if ( (LA181_2==LPAREN||LA181_2==TRIGGER) ) {
					alt181=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 181, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_xor:
				{
				alt181=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 181, 0, input);
				throw nvae;
			}
			switch (alt181) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:3: LITERAL_and
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and346=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10295); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and346_tree = (BAST)adaptor.create(LITERAL_and346);
					adaptor.addChild(root_0, LITERAL_and346_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1583:5: LITERAL_or
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or347=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10301); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or347_tree = (BAST)adaptor.create(LITERAL_or347);
					adaptor.addChild(root_0, LITERAL_or347_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1584:5: LITERAL_xor
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_xor348=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_logicalOperator10307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor348_tree = (BAST)adaptor.create(LITERAL_xor348);
					adaptor.addChild(root_0, LITERAL_xor348_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1585:5: LITERAL_and ! LITERAL_then
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and349=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10313); if (state.failed) return retval;
					LITERAL_then350=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_logicalOperator10316); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then350_tree = (BAST)adaptor.create(LITERAL_then350);
					adaptor.addChild(root_0, LITERAL_then350_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1586:5: LITERAL_or ! LITERAL_else
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or351=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10322); if (state.failed) return retval;
					LITERAL_else352=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_logicalOperator10325); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else352_tree = (BAST)adaptor.create(LITERAL_else352);
					adaptor.addChild(root_0, LITERAL_else352_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOperator"


	public static class eventTrigger_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "eventTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1589:1: eventTrigger : (tr= TRIGGER | LPAREN ^ triggerLogicalExpression RPAREN );
	public final BLESS3Parser.eventTrigger_return eventTrigger() throws RecognitionException {
		BLESS3Parser.eventTrigger_return retval = new BLESS3Parser.eventTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token tr=null;
		Token LPAREN353=null;
		Token RPAREN355=null;
		ParserRuleReturnScope triggerLogicalExpression354 =null;

		BAST tr_tree=null;
		BAST LPAREN353_tree=null;
		BAST RPAREN355_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1589:13: (tr= TRIGGER | LPAREN ^ triggerLogicalExpression RPAREN )
			int alt182=2;
			int LA182_0 = input.LA(1);
			if ( (LA182_0==TRIGGER) ) {
				alt182=1;
			}
			else if ( (LA182_0==LPAREN) ) {
				alt182=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 182, 0, input);
				throw nvae;
			}

			switch (alt182) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1590:3: tr= TRIGGER
					{
					root_0 = (BAST)adaptor.nil();


					tr=(Token)match(input,TRIGGER,FOLLOW_TRIGGER_in_eventTrigger10340); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					tr_tree = (BAST)adaptor.create(tr);
					adaptor.addChild(root_0, tr_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1591:5: LPAREN ^ triggerLogicalExpression RPAREN
					{
					root_0 = (BAST)adaptor.nil();


					LPAREN353=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger10346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN353_tree = (BAST)adaptor.create(LPAREN353);
					root_0 = (BAST)adaptor.becomeRoot(LPAREN353_tree, root_0);
					}

					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger10349);
					triggerLogicalExpression354=triggerLogicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, triggerLogicalExpression354.getTree());

					RPAREN355=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger10351); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN355_tree = (BAST)adaptor.create(RPAREN355);
					adaptor.addChild(root_0, RPAREN355_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "eventTrigger"


	public static class internalCondition_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "internalCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1594:1: internalCondition : LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* ;
	public final BLESS3Parser.internalCondition_return internalCondition() throws RecognitionException {
		BLESS3Parser.internalCondition_return retval = new BLESS3Parser.internalCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on356=null;
		Token LITERAL_internal357=null;
		Token LITERAL_or358=null;
		Token ports=null;
		List<Object> list_ports=null;

		BAST LITERAL_on356_tree=null;
		BAST LITERAL_internal357_tree=null;
		BAST LITERAL_or358_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1594:18: ( LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1595:2: LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )*
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on356=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_internalCondition10362); if (state.failed) return retval;
			LITERAL_internal357=(Token)match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10365); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_internal357_tree = (BAST)adaptor.create(LITERAL_internal357);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_internal357_tree, root_0);
			}

			ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10370); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ports_tree = (BAST)adaptor.create(ports);
			adaptor.addChild(root_0, ports_tree);
			}

			if (list_ports==null) list_ports=new ArrayList<Object>();
			list_ports.add(ports);
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1596:3: ( LITERAL_or !ports+= ID )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==LITERAL_or) ) {
					alt183=1;
				}

				switch (alt183) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1596:5: LITERAL_or !ports+= ID
					{
					LITERAL_or358=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_internalCondition10377); if (state.failed) return retval;
					ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10382); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ports_tree = (BAST)adaptor.create(ports);
					adaptor.addChild(root_0, ports_tree);
					}

					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					break loop183;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (BAST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (BAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "internalCondition"

	// $ANTLR start synpred58_BLESS3
	public final void synpred58_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:818:3: ( LASS ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:818:4: LASS ID COLON
		{
		match(input,LASS,FOLLOW_LASS_in_synpred58_BLESS34108); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred58_BLESS34110); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred58_BLESS34112); if (state.failed) return;

		}

	}
	// $ANTLR end synpred58_BLESS3

	// $ANTLR start synpred59_BLESS3
	public final void synpred59_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:819:5: ( LASS LITERAL_returns )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:819:6: LASS LITERAL_returns
		{
		match(input,LASS,FOLLOW_LASS_in_synpred59_BLESS34123); if (state.failed) return;

		match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_synpred59_BLESS34125); if (state.failed) return;

		}

	}
	// $ANTLR end synpred59_BLESS3

	// $ANTLR start synpred60_BLESS3
	public final void synpred60_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:5: ( LASS PLUS_ARROW )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:6: LASS PLUS_ARROW
		{
		match(input,LASS,FOLLOW_LASS_in_synpred60_BLESS34136); if (state.failed) return;

		match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_synpred60_BLESS34138); if (state.failed) return;

		}

	}
	// $ANTLR end synpred60_BLESS3

	// $ANTLR start synpred114_BLESS3
	public final void synpred114_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:3: ( LPAREN LITERAL_if )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:4: LPAREN LITERAL_if
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred114_BLESS35766); if (state.failed) return;

		match(input,LITERAL_if,FOLLOW_LITERAL_if_in_synpred114_BLESS35768); if (state.failed) return;

		}

	}
	// $ANTLR end synpred114_BLESS3

	// $ANTLR start synpred116_BLESS3
	public final void synpred116_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:5: ( LBRACKET ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:6: LBRACKET ID COLON
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred116_BLESS35786); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred116_BLESS35788); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred116_BLESS35790); if (state.failed) return;

		}

	}
	// $ANTLR end synpred116_BLESS3

	// $ANTLR start synpred117_BLESS3
	public final void synpred117_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:5: ( ID LPAREN )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:6: ID LPAREN
		{
		match(input,ID,FOLLOW_ID_in_synpred117_BLESS35802); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_BLESS35804); if (state.failed) return;

		}

	}
	// $ANTLR end synpred117_BLESS3

	// Delegated rules

	public final boolean synpred117_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred114_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred114_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred58_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred116_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred116_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred60_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred60_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA91 dfa91 = new DFA91(this);
	protected DFA175 dfa175 = new DFA175(this);
	static final String DFA91_eotS =
		"\51\uffff";
	static final String DFA91_eofS =
		"\1\uffff\1\11\3\uffff\1\11\1\15\3\uffff\1\11\3\uffff\1\15\2\uffff\2\11"+
		"\2\uffff\3\11\4\uffff\1\11\2\uffff\3\11\2\uffff\5\11";
	static final String DFA91_minS =
		"\1\u00b1\1\10\1\u00f1\2\u00e2\2\10\3\uffff\1\10\2\u00f1\1\uffff\1\10\2"+
		"\72\2\10\2\u00f7\3\10\4\72\1\10\2\u00f7\3\10\2\u00f7\5\10";
	static final String DFA91_maxS =
		"\1\u00f2\1\u0115\1\u00f1\2\u00e2\2\u0115\3\uffff\1\u0115\2\u00f1\1\uffff"+
		"\1\u0115\1\u00e0\1\u00d0\2\u0115\2\u00f7\3\u0115\1\u00e0\1\u00d0\1\u00e0"+
		"\1\u00d0\1\u0115\2\u00f7\3\u0115\2\u00f7\5\u0115";
	static final String DFA91_acceptS =
		"\7\uffff\1\2\1\3\1\4\3\uffff\1\1\33\uffff";
	static final String DFA91_specialS =
		"\51\uffff}>";
	static final String[] DFA91_transitionS = {
			"\1\3\56\uffff\1\1\1\uffff\1\2\16\uffff\1\5\1\4",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\2\uffff\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\1\6\1"+
			"\11\10\uffff\1\11\2\uffff\1\11\14\uffff\1\11\2\uffff\1\11\16\uffff\1"+
			"\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2\uffff\2\11"+
			"\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff\1\11\1\uffff"+
			"\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11\2\uffff\1\11"+
			"\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff\1\11\1\10"+
			"\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\1\11\4\uffff"+
			"\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1\11\1\uffff\1"+
			"\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\1\12",
			"\1\13",
			"\1\14",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\2\uffff\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff\1\6\1"+
			"\11\10\uffff\1\11\2\uffff\1\11\14\uffff\1\11\2\uffff\1\11\16\uffff\1"+
			"\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2\uffff\2\11"+
			"\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff\1\11\1\uffff"+
			"\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11\2\uffff\1\11"+
			"\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff\1\11\1\10"+
			"\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff\1\11\4\uffff"+
			"\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1\11\1\uffff\1"+
			"\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\15\7\uffff\1\11\1\15\4\uffff\3\15\1\uffff\3\15\4\uffff\1\15\2\uffff"+
			"\1\15\2\11\2\15\6\uffff\1\15\1\11\1\15\3\uffff\2\15\1\uffff\2\15\10\uffff"+
			"\1\15\1\11\1\uffff\1\15\14\uffff\1\15\2\uffff\1\15\16\uffff\1\15\4\uffff"+
			"\1\15\3\uffff\3\15\1\uffff\1\15\5\uffff\5\15\2\uffff\2\15\2\uffff\2\15"+
			"\1\uffff\2\15\3\uffff\1\15\4\uffff\1\15\7\uffff\1\15\1\uffff\1\15\16"+
			"\uffff\1\15\11\uffff\1\15\1\uffff\1\15\2\uffff\1\15\5\uffff\3\15\6\uffff"+
			"\1\15\5\uffff\1\15\4\uffff\1\15\1\uffff\1\15\2\uffff\1\15\1\11\1\15\2"+
			"\uffff\1\15\1\uffff\1\15\3\uffff\1\15\4\uffff\1\15\1\uffff\1\15\10\uffff"+
			"\1\15\1\uffff\1\11\4\15\2\uffff\1\15\1\uffff\1\15\6\uffff\1\16\1\11\1"+
			"\15\15\uffff\1\15",
			"",
			"",
			"",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\20\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\17\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\1\21",
			"\1\22",
			"",
			"\3\15\7\uffff\1\11\5\uffff\1\15\1\uffff\1\15\1\uffff\3\15\4\uffff\1"+
			"\15\2\uffff\1\15\2\uffff\2\15\6\uffff\1\15\1\uffff\1\15\3\uffff\2\15"+
			"\1\uffff\2\15\10\uffff\1\15\2\uffff\1\15\14\uffff\1\15\2\uffff\1\15\16"+
			"\uffff\1\15\3\uffff\1\11\1\15\3\uffff\3\15\1\uffff\1\15\5\uffff\5\15"+
			"\2\uffff\2\15\1\11\1\uffff\2\15\1\uffff\2\15\3\uffff\1\15\4\uffff\1\15"+
			"\7\uffff\1\15\1\uffff\1\15\16\uffff\1\15\11\uffff\1\15\1\uffff\1\15\2"+
			"\uffff\1\15\5\uffff\3\15\6\uffff\1\15\5\uffff\1\15\1\11\3\uffff\1\15"+
			"\1\uffff\1\15\2\uffff\1\15\1\uffff\1\15\2\uffff\1\15\1\uffff\1\15\3\uffff"+
			"\1\15\4\uffff\1\15\1\uffff\1\15\10\uffff\1\15\2\uffff\4\15\2\uffff\1"+
			"\15\1\uffff\1\15\10\uffff\1\15\15\uffff\1\15",
			"\1\24\u00a5\uffff\1\23",
			"\1\25\125\uffff\1\27\77\uffff\1\26",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\31\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\30\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\33\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\32\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\1\34",
			"\1\34",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\20\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\17\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\20\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\17\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\20\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\17\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\1\36\u00a5\uffff\1\35",
			"\1\37\125\uffff\1\41\77\uffff\1\40",
			"\1\43\u00a5\uffff\1\42",
			"\1\44\125\uffff\1\46\77\uffff\1\45",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\20\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\17\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\1\47",
			"\1\47",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\31\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\30\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\31\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\30\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\31\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\30\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\1\50",
			"\1\50",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\33\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\32\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\33\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\32\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\33\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\32\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\31\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\30\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11",
			"\3\11\10\uffff\1\11\4\uffff\3\11\1\uffff\3\11\4\uffff\1\11\2\uffff\1"+
			"\11\1\uffff\1\33\2\11\6\uffff\1\11\1\uffff\1\11\3\uffff\2\11\1\uffff"+
			"\1\6\1\11\10\uffff\1\11\1\32\1\uffff\1\11\14\uffff\1\11\2\uffff\1\11"+
			"\16\uffff\1\11\4\uffff\1\11\3\uffff\3\11\1\uffff\1\11\5\uffff\5\11\2"+
			"\uffff\2\11\2\uffff\2\11\1\uffff\2\11\3\uffff\1\11\4\uffff\1\11\7\uffff"+
			"\1\11\1\uffff\1\11\16\uffff\1\11\5\uffff\1\7\3\uffff\1\11\1\uffff\1\11"+
			"\2\uffff\1\11\5\uffff\3\11\6\uffff\1\11\5\uffff\1\11\4\uffff\1\11\1\uffff"+
			"\1\11\1\10\1\uffff\1\11\1\uffff\1\11\2\uffff\1\11\1\uffff\1\11\3\uffff"+
			"\1\11\4\uffff\1\11\1\uffff\1\11\10\uffff\1\11\2\uffff\4\11\2\uffff\1"+
			"\11\1\uffff\1\11\6\uffff\1\11\1\uffff\1\11\15\uffff\1\11"
	};

	static final short[] DFA91_eot = DFA.unpackEncodedString(DFA91_eotS);
	static final short[] DFA91_eof = DFA.unpackEncodedString(DFA91_eofS);
	static final char[] DFA91_min = DFA.unpackEncodedStringToUnsignedChars(DFA91_minS);
	static final char[] DFA91_max = DFA.unpackEncodedStringToUnsignedChars(DFA91_maxS);
	static final short[] DFA91_accept = DFA.unpackEncodedString(DFA91_acceptS);
	static final short[] DFA91_special = DFA.unpackEncodedString(DFA91_specialS);
	static final short[][] DFA91_transition;

	static {
		int numStates = DFA91_transitionS.length;
		DFA91_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA91_transition[i] = DFA.unpackEncodedString(DFA91_transitionS[i]);
		}
	}

	protected class DFA91 extends DFA {

		public DFA91(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 91;
			this.eot = DFA91_eot;
			this.eof = DFA91_eof;
			this.min = DFA91_min;
			this.max = DFA91_max;
			this.accept = DFA91_accept;
			this.special = DFA91_special;
			this.transition = DFA91_transition;
		}
		@Override
		public String getDescription() {
			return "1134:1: quantity : (num= aNumber u= ID -> ^( QUANTITY $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY $num $whole) |num= aNumber -> ^( QUANTITY $num) );";
		}
	}

	static final String DFA175_eotS =
		"\12\uffff";
	static final String DFA175_eofS =
		"\5\uffff\1\2\4\uffff";
	static final String DFA175_minS =
		"\1\72\1\4\1\uffff\1\10\1\4\1\72\1\10\1\uffff\1\4\1\10";
	static final String DFA175_maxS =
		"\2\u00f2\1\uffff\1\u0107\1\u00f2\1\u00f8\1\u0107\1\uffff\1\u00f2\1\u0107";
	static final String DFA175_acceptS =
		"\2\uffff\1\2\4\uffff\1\1\2\uffff";
	static final String DFA175_specialS =
		"\12\uffff}>";
	static final String[] DFA175_transitionS = {
			"\1\2\166\uffff\1\2\47\uffff\1\1\6\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"\1\2\65\uffff\1\3\12\uffff\1\2\13\uffff\1\2\1\uffff\1\2\15\uffff\1\2"+
			"\22\uffff\1\2\2\uffff\1\2\35\uffff\4\2\11\uffff\1\2\14\uffff\1\2\1\uffff"+
			"\1\2\14\uffff\1\2\5\uffff\1\2\1\uffff\1\2\2\uffff\2\2\16\uffff\1\2\3"+
			"\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"",
			"\2\2\11\uffff\1\2\5\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\3\uffff\1\2\15\uffff\1\2\16\uffff\1\2\32\uffff\1\2\25\uffff\1\2\1\uffff"+
			"\2\2\10\uffff\1\2\11\uffff\1\4\16\uffff\1\2\55\uffff\3\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
			"\1\2\6\uffff\1\5\10\uffff\1\2\1\uffff\1\2",
			"\1\2\65\uffff\1\6\12\uffff\1\2\13\uffff\1\2\37\uffff\1\2\5\uffff\1\2"+
			"\35\uffff\3\2\27\uffff\1\2\1\uffff\1\2\22\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\16\uffff\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"\1\7\31\uffff\1\2\106\uffff\1\2\25\uffff\1\7\47\uffff\1\7\6\uffff\1"+
			"\7\1\uffff\1\7\16\uffff\2\7\5\uffff\1\2",
			"\2\2\11\uffff\1\2\5\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\3\uffff\1\2\15\uffff\1\2\16\uffff\1\2\32\uffff\1\2\25\uffff\1\2\1\uffff"+
			"\2\2\10\uffff\1\2\11\uffff\1\10\16\uffff\1\2\56\uffff\2\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
			"\1\2\6\uffff\1\5\10\uffff\1\2\1\uffff\1\2",
			"",
			"\1\2\65\uffff\1\11\12\uffff\1\2\13\uffff\1\2\45\uffff\1\2\35\uffff\3"+
			"\2\27\uffff\1\2\1\uffff\1\2\22\uffff\1\2\1\uffff\1\2\2\uffff\2\2\16\uffff"+
			"\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\1\2\16\uffff\2\2",
			"\2\2\11\uffff\1\2\5\uffff\1\2\14\uffff\3\2\10\uffff\1\2\1\uffff\1\2"+
			"\3\uffff\1\2\15\uffff\1\2\16\uffff\1\2\32\uffff\1\2\25\uffff\1\2\1\uffff"+
			"\2\2\10\uffff\1\2\11\uffff\1\10\16\uffff\1\2\56\uffff\2\2\2\uffff\1\2"+
			"\1\uffff\1\2\3\uffff\1\2\4\uffff\1\2\1\uffff\1\2\10\uffff\1\2\1\uffff"+
			"\1\2\6\uffff\1\5\10\uffff\1\2\1\uffff\1\2"
	};

	static final short[] DFA175_eot = DFA.unpackEncodedString(DFA175_eotS);
	static final short[] DFA175_eof = DFA.unpackEncodedString(DFA175_eofS);
	static final char[] DFA175_min = DFA.unpackEncodedStringToUnsignedChars(DFA175_minS);
	static final char[] DFA175_max = DFA.unpackEncodedStringToUnsignedChars(DFA175_maxS);
	static final short[] DFA175_accept = DFA.unpackEncodedString(DFA175_acceptS);
	static final short[] DFA175_special = DFA.unpackEncodedString(DFA175_specialS);
	static final short[][] DFA175_transition;

	static {
		int numStates = DFA175_transitionS.length;
		DFA175_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA175_transition[i] = DFA.unpackEncodedString(DFA175_transitionS[i]);
		}
	}

	protected class DFA175 extends DFA {

		public DFA175(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 175;
			this.eot = DFA175_eot;
			this.eof = DFA175_eof;
			this.min = DFA175_min;
			this.max = DFA175_max;
			this.accept = DFA175_accept;
			this.special = DFA175_special;
			this.transition = DFA175_transition;
		}
		@Override
		public String getDescription() {
			return "1548:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN )?";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitDeclaration_in_unitLibrary2381 = new BitSet(new long[]{0x0400004000000002L,0x0040000008000000L});
	public static final BitSet FOLLOW_LT_in_unitName2420 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2425 = new BitSet(new long[]{0x0480000000000000L});
	public static final BitSet FOLLOW_GT_in_unitName2429 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula2468 = new BitSet(new long[]{0x0400004000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2475 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2479 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2517 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2521 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration2554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration2558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration2583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration2589 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration2593 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_rootDeclaration2596 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration2603 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration2607 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_rootDeclaration2610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension2660 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_unitExtension2665 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension2669 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_unitExtension2672 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor2706 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_unitName_in_unitFactor2710 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_mulDiv_in_unitFactor2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor2718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary2758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration2771 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration2776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_is_in_typeDeclaration2778 = new BitSet(new long[]{0x0000000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration2783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationType_in_type2795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type2801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type2813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type2819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type2825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type2831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference2843 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType2862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_enumerationType2865 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationType2870 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_enumerationType2873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType2889 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0001000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_quantityType2899 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType2905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType2911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000100000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_quantityType2919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2924 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_quantityType2935 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400100000000000L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType2945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType2965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_quantityType2970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayType2992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType2997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayType2999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType3002 = new BitSet(new long[]{0x0400000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType3006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3022 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3031 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3040 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3060 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000500000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_recordType3083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_recordType3099 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_recordField_in_recordType3104 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_recordType3107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_recordField3125 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_recordField3127 = new BitSet(new long[]{0x0400000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField3132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary3152 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary3161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables3194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_variables_in_ghostVariables3197 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables3202 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable3215 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_ghostVariable3221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_TILDE_in_ghostVariable3223 = new BitSet(new long[]{0x0400000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable3228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namedAssertion3245 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3253 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3255 = new BitSet(new long[]{0x0400000004000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion3270 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3290 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion3295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion3315 = new BitSet(new long[]{0x0400000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion3319 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namedAssertion3321 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion3326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion3355 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RASS_in_namedAssertion3377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_predicate3663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableList3684 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3688 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3693 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3697 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3702 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_variable3720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_TILDE_in_variable3722 = new BitSet(new long[]{0x0400000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable3727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue3738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue3744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_conditionalAssertionFunction3757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction3761 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_COMMA_in_conditionalAssertionFunction3765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction3769 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_conditionalAssertionFunction3774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionValuePair3802 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair3805 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair3807 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair3810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3826 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration3830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3857 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3861 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration3867 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3871 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration3875 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3879 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_enumerationPair3939 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair3941 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair3944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue3960 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessAssertion3978 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessAssertion3984 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessFunction4013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction4017 = new BitSet(new long[]{0x0400000000000000L,0x0004000021000000L,0x1000014000800000L,0x0000000000041000L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction4021 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namelessFunction4023 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction4027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessFunction4029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessEnumeration4069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_namelessEnumeration4073 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration4077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessEnumeration4079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion4116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion4129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion4142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion4148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_invocation4162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_invocation4164 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x1006000522000650L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4174 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_invocation4178 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4182 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_expression_in_invocation4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_invocation4201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_actualParameter4236 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_actualParameter4238 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_actualParameter4243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression4261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression4269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression4277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression4285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression4293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disjunction_in_expression4301 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression4306 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression4311 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_disjunction_in_expression4317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification4333 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification4337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalQuantification4348 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_range_in_universalQuantification4352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_which_in_universalQuantification4358 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification4373 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification4473 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification4477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_in_in_existentialQuantification4488 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_range_in_existentialQuantification4492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification4498 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification4513 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification4613 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification4617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_in_in_sumQuantification4628 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_range_in_sumQuantification4632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_sumQuantification4638 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_sumQuantification4642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification4653 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_sumQuantification4657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification4753 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification4757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_in_in_productQuantification4768 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_range_in_productQuantification4772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_productQuantification4778 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_productQuantification4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification4793 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_productQuantification4797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification4893 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification4897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_in_in_countingQuantification4908 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_range_in_countingQuantification4912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_which_in_countingQuantification4918 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_predicate_in_countingQuantification4922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification4933 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_countingQuantification4937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_logicVariables5033 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5037 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5042 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5046 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5051 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5073 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5090 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5099 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5125 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5128 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5137 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5140 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5166 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5171 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5175 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5180 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_relation_in_conjunction5204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5214 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_relation_in_conjunction5219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5223 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_relation_in_conjunction5228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5246 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_relation_in_conjunction5251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5258 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_relation_in_conjunction5263 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_addSub_in_relation5284 = new BitSet(new long[]{0x0082000000000302L,0x0000000000000000L,0x0000000000000100L,0x0000040884000000L});
	public static final BitSet FOLLOW_relation_symbol_in_relation5294 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_addSub_in_relation5297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation5311 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_range_in_relation5314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_range5329 = new BitSet(new long[]{0x0000060060000000L});
	public static final BitSet FOLLOW_rangeSymbol_in_range5331 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_subexpression_in_range5334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multDiv_in_addSub5365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010020000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5377 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_multDiv_in_addSub5380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5384 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_multDiv_in_addSub5387 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_MINUS_in_addSub5406 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_multDiv_in_addSub5409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5429 = new BitSet(new long[]{0x0000004000000002L,0x0000800000000000L,0x0000040000020000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5441 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5444 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5448 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_dividers_in_multDiv5469 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5515 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5519 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5541 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000020L,0x0002000000C00000L,0x0006000502000250L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5570 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000020L,0x0002000000C00000L,0x0006000502000250L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5599 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000020L,0x0002000000C00000L,0x0006000502000250L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5628 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000020L,0x0002000000C00000L,0x0006000502000250L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_subexpression5654 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000020L,0x0002000000C00000L,0x0006000502000250L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5721 = new BitSet(new long[]{0x0000000002080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5729 = new BitSet(new long[]{0x0400000000000010L,0x0080000000020020L,0x0002800000E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5744 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression5827 = new BitSet(new long[]{0x0400000000000010L,0x00900002000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1008000000000000L});
	public static final BitSet FOLLOW_QQ_in_parenthesizedSubexpression5844 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5847 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_parenthesizedSubexpression5849 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression5870 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression5878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression5888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression5891 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_caseChoice5907 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_caseChoice5912 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_IMP_in_caseChoice5914 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_caseChoice5919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_caseChoice5921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression5937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_if_in_conditionalExpression5939 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_then_in_conditionalExpression5945 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5949 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_conditionalExpression5951 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression5959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_recordTerm6005 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_recordTerm6009 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_recordTerm6011 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6015 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_recordTerm6018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_recordValue6054 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6056 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000500000250L});
	public static final BitSet FOLLOW_value_in_recordValue6059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_recordValue6061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_periodShift6081 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000502000250L});
	public static final BitSet FOLLOW_value_in_periodShift6094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift6108 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift6112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift6116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6196 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L,0x0000040000020000L,0x0000010020000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6204 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6217 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6230 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6243 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6256 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6259 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6263 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6279 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6286 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6306 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6310 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationValue_in_value6369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6384 = new BitSet(new long[]{0x0000018000000002L,0x0000000000000020L,0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_valueName6402 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_valueName6410 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L,0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6422 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6428 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L,0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6438 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6444 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L,0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DOT_in_valueName6460 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6464 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_DOT_in_valueName6468 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6472 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6516 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6742 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6746 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6751 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6758 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6763 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6781 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6789 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6817 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName6823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6830 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000C00000L,0x0006000522000250L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName6836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_quantity_in_constant6884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant6892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant6900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant6908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant6916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity6933 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity6937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity6966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity6970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QCLREF_in_aNumber7076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7095 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7106 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7123 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7134 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_QCREF_in_propertyReference7144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_QCLREF_in_propertyReference7155 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7167 = new BitSet(new long[]{0x0000010000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7182 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_ID_in_propertyField7194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_propertyField7203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propertyField7211 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000010000L,0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_propertyField7218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7250 = new BitSet(new long[]{0x0000000000000000L,0x0000080002000080L,0x0000000180001000L,0x0000000000000008L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7257 = new BitSet(new long[]{0x0000000000000000L,0x0000080002000080L,0x0000000180001000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7265 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L,0x0000000180001000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7280 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L,0x0000000080001000L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7295 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7311 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7389 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_throwsClause7394 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime7432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_behaviorTime7444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause7457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause7460 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7473 = new BitSet(new long[]{0x0400000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm7482 = new BitSet(new long[]{0x0400000004000000L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm7487 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7493 = new BitSet(new long[]{0x0400000000000000L,0x1E08004000000000L,0x8050000000000000L,0x0000000000080000L,0x0000000000200000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7511 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7514 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7528 = new BitSet(new long[]{0x0000000000040002L,0x4000020000000010L,0x00A0000000100000L,0x4000000000000000L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7539 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7549 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7559 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7569 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration7579 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7593 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7597 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration7616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7723 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7736 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7745 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7750 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7769 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7774 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7778 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7782 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7805 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000080L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_action_in_assertedAction7814 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicAction_in_action7936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action7944 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action7952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action7960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action7968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action7976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action7985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8014 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction8018 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_computation_in_basicAction8046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameTick_in_assignment8071 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8073 = new BitSet(new long[]{0x0400000000000010L,0x00900000002A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8088 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8094 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8098 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8102 = new BitSet(new long[]{0x0000000010040000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8106 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8110 = new BitSet(new long[]{0x0000000010040000L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8118 = new BitSet(new long[]{0x0400000000000010L,0x00900000002A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8124 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8128 = new BitSet(new long[]{0x0400000000000010L,0x00900000002A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8132 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8136 = new BitSet(new long[]{0x0400000000000010L,0x00900000002A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8140 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_nameTick8188 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TICK_in_nameTick8192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8225 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_whenThrow8229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8233 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8237 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation8266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8269 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8274 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8276 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8281 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8283 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation8302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8305 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8310 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8312 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8317 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8319 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation8337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8340 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8345 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8347 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8352 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8354 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation8372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8375 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8380 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8382 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8387 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8389 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation8407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8410 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8415 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8417 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8422 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8424 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction8446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction8456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction8466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation8482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_computation8485 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000502000000L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8490 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_computation8494 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000502000000L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_computation8504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_in_in_computation8513 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation8516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_QCREF_in_computation8521 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_ID_in_subprogramCall8539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_subprogramCall8541 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000800000L,0x1006000502000200L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall8545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_subprogramCall8548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8579 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8583 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000800000L,0x0006000502000200L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8586 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8590 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000800000L,0x0006000502000200L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8593 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_ID_in_formalActual8615 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_formalActual8623 = new BitSet(new long[]{0x0400000000000010L,0x0080000000000000L,0x0002000000800000L,0x0006000502000200L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter8642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter8647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter8652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portOutput8668 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_EXCLAMATION_in_portOutput8670 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_portOutput8674 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_portOutput8678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_portOutput8680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portInput8726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_QUESTION_in_portInput8728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_portInput8730 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_valueName_in_portInput8735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_portInput8737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative8778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8786 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_BOX_in_alternative8792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8796 = new BitSet(new long[]{0x0000000001000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_LITERAL_fi_in_alternative8804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_guardedAction8842 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_guardedAction8846 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction8848 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction8851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop8875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileLoop8881 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_whileLoop8886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileLoop8888 = new BitSet(new long[]{0x0000000000000000L,0x0000080040000080L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_whileLoop8895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_whileLoop8899 = new BitSet(new long[]{0x0000000000000000L,0x0000080040000080L});
	public static final BitSet FOLLOW_LITERAL_bound_in_whileLoop8908 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_whileLoop8913 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop8924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop8982 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_identifier_in_forLoop8989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop8994 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_forLoop8999 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_forLoop9001 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_forLoop9006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_forLoop9013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_forLoop9017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LCURLY_in_forLoop9024 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_forLoop9031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9094 = new BitSet(new long[]{0x0400000000000000L,0x1E09084040000090L,0x8050000000001013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_doUntilLoop9101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9105 = new BitSet(new long[]{0x0400000000000000L,0x1E09084040000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_doUntilLoop9114 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9119 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_doUntilLoop9138 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_doUntilLoop9145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9212 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification9219 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification9225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification9227 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification9235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9260 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9269 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9274 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9278 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_universalLatticeQuantification9280 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800401E00000L,0x0006000522000650L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9284 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000080L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_issueException9345 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_issueException9349 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_issueException9360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9374 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L,0x0200000000001000L,0x0000000000020100L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9381 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000001000L,0x0000000000020100L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L,0x0000000000020100L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9397 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0200000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection9468 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection9473 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection9485 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection9490 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_identifier_in_behaviorState9507 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorState9512 = new BitSet(new long[]{0x0000000000000000L,0x4000001000000000L,0x0100000000000400L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState9517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState9523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState9529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState9535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_assertion_in_behaviorState9539 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorState9542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions9603 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions9607 = new BitSet(new long[]{0x0400000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9652 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition9656 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorTransition9659 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9667 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_behaviorTransition9671 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9676 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LCON_in_behaviorTransition9685 = new BitSet(new long[]{0x0400000000000010L,0x00900000000A0020L,0x4002800405E00000L,0x0106000522000650L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition9689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
	public static final BitSet FOLLOW_RCON_in_behaviorTransition9692 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9699 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LCURLY_in_behaviorTransition9706 = new BitSet(new long[]{0x0400000000000000L,0x1E09084000000090L,0x8050000000000013L,0x0000000000280000L,0x0000000000200000L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition9710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_behaviorTransition9712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_EMPTY_CURLY_in_behaviorTransition9716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition9724 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorTransition9729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_priority9891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_NUMBER_in_priority9894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_priority9896 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition9911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition9915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition9919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition9923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_dispatchCondition9935 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition9938 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition9943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression9961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression9965 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression9970 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression9978 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression9983 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10006 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10015 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10030 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10035 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger10053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger10061 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000000L,0x0002000000000000L,0x0006000502000000L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger10072 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchTrigger10089 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_dispatchTrigger10108 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000000L,0x0002000000000000L,0x0006000502000000L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10147 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LBRACKET_in_portName10155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_NUMBER_in_portName10159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_portName10161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_executeCondition10176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10205 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L,0x0000000008000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L,0x0000000008000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10229 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L,0x0000000008000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_xor_in_logicalOperator10307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_then_in_logicalOperator10316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10322 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_logicalOperator10325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRIGGER_in_eventTrigger10340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger10346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger10349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger10351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_internalCondition10362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10365 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_internalCondition10377 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_LASS_in_synpred58_BLESS34108 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred58_BLESS34110 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_synpred58_BLESS34112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_synpred59_BLESS34123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_synpred59_BLESS34125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_synpred60_BLESS34136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_synpred60_BLESS34138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred114_BLESS35766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_if_in_synpred114_BLESS35768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred116_BLESS35786 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred116_BLESS35788 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_in_synpred116_BLESS35790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred117_BLESS35802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred117_BLESS35804 = new BitSet(new long[]{0x0000000000000002L});
}
