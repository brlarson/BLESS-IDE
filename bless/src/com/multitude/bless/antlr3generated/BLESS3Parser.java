// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g 2023-07-06 13:18:44

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

	//public int errorCount = 0;
	//public final int errorLimit=3;

	//REPLACE THIS WITH LOOK-UP OF OSATE RENAMES CLAUSE
	//public String timeAlias = "T";

	//public void emitErrorMessage(String msg) 
	//  {
	//  System.err.println(msg);
	//  Dump.it(msg);
	//  }

	public void recover(IntStream input, RecognitionException re) {}  
	  


	public static class relationSymbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "relationSymbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:595:1: relationSymbol : ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS );
	public final BLESS3Parser.relationSymbol_return relationSymbol() throws RecognitionException {
		BLESS3Parser.relationSymbol_return retval = new BLESS3Parser.relationSymbol_return();
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
	// $ANTLR end "relationSymbol"


	public static class rangeSymbol_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "rangeSymbol"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:1: rangeSymbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.rangeSymbol_return rangeSymbol() throws RecognitionException {
		BLESS3Parser.rangeSymbol_return retval = new BLESS3Parser.rangeSymbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set2=null;

		BAST set2_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:13: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
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
	// $ANTLR end "rangeSymbol"


	public static class propertyName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:603:1: propertyName : ( ID COLON )=>propertyset= ID dc= DOUBLE_COLON propertyid= ID -> ^( $dc $propertyset $propertyid) ;
	public final BLESS3Parser.propertyName_return propertyName() throws RecognitionException {
		BLESS3Parser.propertyName_return retval = new BLESS3Parser.propertyName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token propertyset=null;
		Token dc=null;
		Token propertyid=null;

		BAST propertyset_tree=null;
		BAST dc_tree=null;
		BAST propertyid_tree=null;
		RewriteRuleTokenStream stream_DOUBLE_COLON=new RewriteRuleTokenStream(adaptor,"token DOUBLE_COLON");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:604:3: ( ( ID COLON )=>propertyset= ID dc= DOUBLE_COLON propertyid= ID -> ^( $dc $propertyset $propertyid) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:605:3: ( ID COLON )=>propertyset= ID dc= DOUBLE_COLON propertyid= ID
			{
			propertyset=(Token)match(input,ID,FOLLOW_ID_in_propertyName2321); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(propertyset);

			dc=(Token)match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_propertyName2325); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOUBLE_COLON.add(dc);

			propertyid=(Token)match(input,ID,FOLLOW_ID_in_propertyName2329); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(propertyid);

			// AST REWRITE
			// elements: propertyid, propertyset, dc
			// token labels: propertyset, propertyid, dc
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_propertyset=new RewriteRuleTokenStream(adaptor,"token propertyset",propertyset);
			RewriteRuleTokenStream stream_propertyid=new RewriteRuleTokenStream(adaptor,"token propertyid",propertyid);
			RewriteRuleTokenStream stream_dc=new RewriteRuleTokenStream(adaptor,"token dc",dc);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 607:5: -> ^( $dc $propertyset $propertyid)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:607:8: ^( $dc $propertyset $propertyid)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_dc.nextNode(), root_1);
				adaptor.addChild(root_1, stream_propertyset.nextNode());
				adaptor.addChild(root_1, stream_propertyid.nextNode());
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
	// $ANTLR end "propertyName"


	public static class componentName_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "componentName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:610:1: componentName : id= ID (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )? (dot= DOT imp= ID )? -> {dc!=null&&dot!=null}? ^( $dc $id ( $id2)* ^( $dot $imp) ) -> {dc!=null&&dot==null}? ^( $dc $id ( $id2)* ) -> {dc==null&&dot!=null}? ^( $id ^( $dot $imp) ) -> $id;
	public final BLESS3Parser.componentName_return componentName() throws RecognitionException {
		BLESS3Parser.componentName_return retval = new BLESS3Parser.componentName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token dc=null;
		Token dot=null;
		Token imp=null;
		Token DOUBLE_COLON3=null;
		Token id2=null;
		List<Object> list_id2=null;

		BAST id_tree=null;
		BAST dc_tree=null;
		BAST dot_tree=null;
		BAST imp_tree=null;
		BAST DOUBLE_COLON3_tree=null;
		BAST id2_tree=null;
		RewriteRuleTokenStream stream_DOUBLE_COLON=new RewriteRuleTokenStream(adaptor,"token DOUBLE_COLON");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:611:3: (id= ID (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )? (dot= DOT imp= ID )? -> {dc!=null&&dot!=null}? ^( $dc $id ( $id2)* ^( $dot $imp) ) -> {dc!=null&&dot==null}? ^( $dc $id ( $id2)* ) -> {dc==null&&dot!=null}? ^( $id ^( $dot $imp) ) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:2: id= ID (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )? (dot= DOT imp= ID )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_componentName2362); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:8: (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DOUBLE_COLON) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:10: dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID )
					{
					dc=(Token)match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_componentName2368); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE_COLON.add(dc);

					id2=(Token)match(input,ID,FOLLOW_ID_in_componentName2372); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(id2);

					if (list_id2==null) list_id2=new ArrayList<Object>();
					list_id2.add(id2);
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:34: ( DOUBLE_COLON id2+= ID )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:36: DOUBLE_COLON id2+= ID
					{
					DOUBLE_COLON3=(Token)match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_componentName2376); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE_COLON.add(DOUBLE_COLON3);

					id2=(Token)match(input,ID,FOLLOW_ID_in_componentName2380); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(id2);

					if (list_id2==null) list_id2=new ArrayList<Object>();
					list_id2.add(id2);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:63: (dot= DOT imp= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==DOT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:64: dot= DOT imp= ID
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_componentName2391); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					imp=(Token)match(input,ID,FOLLOW_ID_in_componentName2395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(imp);

					}
					break;

			}

			// AST REWRITE
			// elements: id2, id, imp, id, dot, id, imp, id, dc, dot, dc, id2
			// token labels: dot, id, imp, dc
			// rule labels: retval
			// token list labels: id2
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_dot=new RewriteRuleTokenStream(adaptor,"token dot",dot);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_imp=new RewriteRuleTokenStream(adaptor,"token imp",imp);
			RewriteRuleTokenStream stream_dc=new RewriteRuleTokenStream(adaptor,"token dc",dc);
			RewriteRuleTokenStream stream_id2=new RewriteRuleTokenStream(adaptor,"token id2", list_id2);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 613:4: -> {dc!=null&&dot!=null}? ^( $dc $id ( $id2)* ^( $dot $imp) )
			if (dc!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:613:31: ^( $dc $id ( $id2)* ^( $dot $imp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_dc.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:613:42: ( $id2)*
				while ( stream_id2.hasNext() ) {
					adaptor.addChild(root_1, stream_id2.nextNode());
				}
				stream_id2.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:613:47: ^( $dot $imp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				adaptor.addChild(root_2, stream_imp.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 614:4: -> {dc!=null&&dot==null}? ^( $dc $id ( $id2)* )
			if (dc!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:614:31: ^( $dc $id ( $id2)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_dc.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:614:42: ( $id2)*
				while ( stream_id2.hasNext() ) {
					adaptor.addChild(root_1, stream_id2.nextNode());
				}
				stream_id2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 615:4: -> {dc==null&&dot!=null}? ^( $id ^( $dot $imp) )
			if (dc==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:615:31: ^( $id ^( $dot $imp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:615:37: ^( $dot $imp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				adaptor.addChild(root_2, stream_imp.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 616:4: -> $id
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
	// $ANTLR end "componentName"


	public static class modeTrigger_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "modeTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:619:1: modeTrigger : ID ( DOT ^ ID ( DOT ID )* )? ;
	public final BLESS3Parser.modeTrigger_return modeTrigger() throws RecognitionException {
		BLESS3Parser.modeTrigger_return retval = new BLESS3Parser.modeTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID4=null;
		Token DOT5=null;
		Token ID6=null;
		Token DOT7=null;
		Token ID8=null;

		BAST ID4_tree=null;
		BAST DOT5_tree=null;
		BAST ID6_tree=null;
		BAST DOT7_tree=null;
		BAST ID8_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:620:3: ( ID ( DOT ^ ID ( DOT ID )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:621:3: ID ( DOT ^ ID ( DOT ID )* )?
			{
			root_0 = (BAST)adaptor.nil();


			ID4=(Token)match(input,ID,FOLLOW_ID_in_modeTrigger2491); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID4_tree = (BAST)adaptor.create(ID4);
			adaptor.addChild(root_0, ID4_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:621:6: ( DOT ^ ID ( DOT ID )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DOT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:621:8: DOT ^ ID ( DOT ID )*
					{
					DOT5=(Token)match(input,DOT,FOLLOW_DOT_in_modeTrigger2495); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT5_tree = (BAST)adaptor.create(DOT5);
					root_0 = (BAST)adaptor.becomeRoot(DOT5_tree, root_0);
					}

					ID6=(Token)match(input,ID,FOLLOW_ID_in_modeTrigger2498); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID6_tree = (BAST)adaptor.create(ID6);
					adaptor.addChild(root_0, ID6_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:621:16: ( DOT ID )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==DOT) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:621:18: DOT ID
							{
							DOT7=(Token)match(input,DOT,FOLLOW_DOT_in_modeTrigger2502); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DOT7_tree = (BAST)adaptor.create(DOT7);
							adaptor.addChild(root_0, DOT7_tree);
							}

							ID8=(Token)match(input,ID,FOLLOW_ID_in_modeTrigger2504); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							ID8_tree = (BAST)adaptor.create(ID8);
							adaptor.addChild(root_0, ID8_tree);
							}

							}
							break;

						default :
							break loop3;
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
	// $ANTLR end "modeTrigger"


	public static class identifier_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:624:1: identifier : ID ;
	public final BLESS3Parser.identifier_return identifier() throws RecognitionException {
		BLESS3Parser.identifier_return retval = new BLESS3Parser.identifier_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID9=null;

		BAST ID9_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:625:3: ( ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:625:5: ID
			{
			root_0 = (BAST)adaptor.nil();


			ID9=(Token)match(input,ID,FOLLOW_ID_in_identifier2525); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID9_tree = (BAST)adaptor.create(ID9);
			adaptor.addChild(root_0, ID9_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:1: unitLibrary : (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) ;
	public final BLESS3Parser.unitLibrary_return unitLibrary() throws RecognitionException {
		BLESS3Parser.unitLibrary_return retval = new BLESS3Parser.unitLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_unitDeclarations=null;
		RuleReturnScope unitDeclarations = null;
		RewriteRuleSubtreeStream stream_unitDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule unitDeclaration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:12: ( (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY ( $unitDeclarations)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:632:3: (unitDeclarations+= unitDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:632:19: (unitDeclarations+= unitDeclaration )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==DIVIDE||LA5_0==ID||LA5_0==LITERAL_base||LA5_0==LITERAL_extension) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:632:19: unitDeclarations+= unitDeclaration
					{
					pushFollow(FOLLOW_unitDeclaration_in_unitLibrary2548);
					unitDeclarations=unitDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitDeclaration.add(unitDeclarations.getTree());
					if (list_unitDeclarations==null) list_unitDeclarations=new ArrayList<Object>();
					list_unitDeclarations.add(unitDeclarations.getTree());
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
			// 633:5: -> ^( UNIT_LIBRARY ( $unitDeclarations)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:633:8: ^( UNIT_LIBRARY ( $unitDeclarations)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:636:1: unitName : (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) ;
	public final BLESS3Parser.unitName_return unitName() throws RecognitionException {
		BLESS3Parser.unitName_return retval = new BLESS3Parser.unitName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lt=null;
		Token id=null;
		Token GT10=null;
		Token longname=null;
		List<Object> list_longname=null;

		BAST lt_tree=null;
		BAST id_tree=null;
		BAST GT10_tree=null;
		BAST longname_tree=null;
		RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:637:3: ( (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME $id ( $longname)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:3: (lt= LT (longname+= ID )+ GT )? id= ID
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:3: (lt= LT (longname+= ID )+ GT )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LT) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:5: lt= LT (longname+= ID )+ GT
					{
					lt=(Token)match(input,LT,FOLLOW_LT_in_unitName2587); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT.add(lt);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:11: (longname+= ID )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:638:12: longname+= ID
							{
							longname=(Token)match(input,ID,FOLLOW_ID_in_unitName2592); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(longname);

							if (list_longname==null) list_longname=new ArrayList<Object>();
							list_longname.add(longname);
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					GT10=(Token)match(input,GT,FOLLOW_GT_in_unitName2596); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT.add(GT10);

					}
					break;

			}

			id=(Token)match(input,ID,FOLLOW_ID_in_unitName2603); if (state.failed) return retval; 
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
			// 639:5: -> ^( UNIT_NAME $id ( $longname)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:639:8: ^( UNIT_NAME $id ( $longname)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_NAME, "UNIT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:639:26: ( $longname)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:642:1: unitFormula : ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:642:12: ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA $slash ( $bottom)+ ) )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID) ) {
				alt12=1;
			}
			else if ( (LA12_0==DIVIDE) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:3: (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )?
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:6: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:6: top+= ID
							{
							top=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2635); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(top);

							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:12: (slash= DIVIDE (bottom+= ID )+ )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==DIVIDE) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:14: slash= DIVIDE (bottom+= ID )+
							{
							slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2642); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:33: (bottom+= ID )+
							int cnt9=0;
							loop9:
							while (true) {
								int alt9=2;
								int LA9_0 = input.LA(1);
								if ( (LA9_0==ID) ) {
									alt9=1;
								}

								switch (alt9) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:643:33: bottom+= ID
									{
									bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2646); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_ID.add(bottom);

									if (list_bottom==null) list_bottom=new ArrayList<Object>();
									list_bottom.add(bottom);
									}
									break;

								default :
									if ( cnt9 >= 1 ) break loop9;
									if (state.backtracking>0) {state.failed=true; return retval;}
									EarlyExitException eee = new EarlyExitException(9, input);
									throw eee;
								}
								cnt9++;
							}

							}
							break;

					}

					// AST REWRITE
					// elements: bottom, top, slash
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
					// 644:5: -> ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:8: ^( UNIT_FORMULA ( $top)+ ( $slash)? ( $bottom)* )
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

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:31: ( $slash)?
						if ( stream_slash.hasNext() ) {
							adaptor.addChild(root_1, stream_slash.nextNode());
						}
						stream_slash.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:39: ( $bottom)*
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:646:3: slash= DIVIDE (bottom+= ID )+
					{
					slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2684); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:646:22: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:646:22: bottom+= ID
							{
							bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2688); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ID.add(bottom);

							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
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
					// 647:5: -> ^( UNIT_FORMULA $slash ( $bottom)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:647:8: ^( UNIT_FORMULA $slash ( $bottom)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final BLESS3Parser.unitDeclaration_return unitDeclaration() throws RecognitionException {
		BLESS3Parser.unitDeclaration_return retval = new BLESS3Parser.unitDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope rootDeclaration11 =null;
		ParserRuleReturnScope unitExtension12 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:650:16: ( rootDeclaration | unitExtension )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==DIVIDE||LA13_0==ID||LA13_0==LITERAL_base) ) {
				alt13=1;
			}
			else if ( (LA13_0==LITERAL_extension) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:651:3: rootDeclaration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration2721);
					rootDeclaration11=rootDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rootDeclaration11.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:651:21: unitExtension
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_unitExtension_in_unitDeclaration2725);
					unitExtension12=unitExtension();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unitExtension12.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:1: rootDeclaration : (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) ;
	public final BLESS3Parser.rootDeclaration_return rootDeclaration() throws RecognitionException {
		BLESS3Parser.rootDeclaration_return retval = new BLESS3Parser.rootDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token base=null;
		Token lb=null;
		Token RBRACKET13=null;
		Token SEMICOLON14=null;
		Token kindWords=null;
		List<Object> list_kindWords=null;
		List<Object> list_factors=null;
		ParserRuleReturnScope formula =null;
		ParserRuleReturnScope unit =null;
		RuleReturnScope factors = null;
		BAST base_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET13_tree=null;
		BAST SEMICOLON14_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:16: ( (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:3: (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:3: (base= LITERAL_base |formula= unitFormula )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LITERAL_base) ) {
				alt14=1;
			}
			else if ( (LA14_0==DIVIDE||LA14_0==ID) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:5: base= LITERAL_base
					{
					base=(Token)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration2744); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_base.add(base);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:25: formula= unitFormula
					{
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration2750);
					formula=unitFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFormula.add(formula.getTree());
					}
					break;

			}

			lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration2756); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:68: (kindWords+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:68: kindWords+= ID
					{
					kindWords=(Token)match(input,ID,FOLLOW_ID_in_rootDeclaration2760); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(kindWords);

					if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
					list_kindWords.add(kindWords);
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

			RBRACKET13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_rootDeclaration2763); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET13);

			pushFollow(FOLLOW_unitName_in_rootDeclaration2770);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:656:24: (factors+= unitFactor )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:656:24: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_rootDeclaration2774);
					factors=unitFactor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFactor.add(factors.getTree());
					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTree());
					}
					break;

				default :
					break loop16;
				}
			}

			SEMICOLON14=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rootDeclaration2777); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON14);

			// AST REWRITE
			// elements: factors, base, unit, lb, kindWords, formula
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
			// 657:5: -> ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:8: ^( ROOT_DECLARATION ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ROOT_DECLARATION, "ROOT_DECLARATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:29: ( $base)?
				if ( stream_base.hasNext() ) {
					adaptor.addChild(root_1, stream_base.nextNode());
				}
				stream_base.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:36: ( $formula)?
				if ( stream_formula.hasNext() ) {
					adaptor.addChild(root_1, stream_formula.nextTree());
				}
				stream_formula.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:45: ^( $lb ( $kindWords)+ )
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
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:657:73: ( $factors)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:660:1: unitExtension : LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !;
	public final BLESS3Parser.unitExtension_return unitExtension() throws RecognitionException {
		BLESS3Parser.unitExtension_return retval = new BLESS3Parser.unitExtension_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token root=null;
		Token LITERAL_extension15=null;
		Token SEMICOLON16=null;
		List<Object> list_factors=null;
		RuleReturnScope factors = null;
		BAST root_tree=null;
		BAST LITERAL_extension15_tree=null;
		BAST SEMICOLON16_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:660:14: ( LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:661:3: LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_extension15=(Token)match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension2827); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_extension15_tree = (BAST)adaptor.create(LITERAL_extension15);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_extension15_tree, root_0);
			}

			root=(Token)match(input,ID,FOLLOW_ID_in_unitExtension2832); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			root_tree = (BAST)adaptor.create(root);
			adaptor.addChild(root_0, root_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:661:37: (factors+= unitFactor )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:661:37: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension2836);
					factors=unitFactor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factors.getTree());

					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTree());
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

			SEMICOLON16=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_unitExtension2839); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:664:1: mulDiv : ( TIMES | DIVIDE ) ;
	public final BLESS3Parser.mulDiv_return mulDiv() throws RecognitionException {
		BLESS3Parser.mulDiv_return retval = new BLESS3Parser.mulDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set17=null;

		BAST set17_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:664:7: ( ( TIMES | DIVIDE ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set17=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==TIMES ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set17));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:1: unitFactor : c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:11: (c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:3: c= COMMA unit= unitName op= mulDiv factor= NUMBER
			{
			c=(Token)match(input,COMMA,FOLLOW_COMMA_in_unitFactor2873); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(c);

			pushFollow(FOLLOW_unitName_in_unitFactor2877);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			pushFollow(FOLLOW_mulDiv_in_unitFactor2881);
			op=mulDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mulDiv.add(op.getTree());
			factor=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor2885); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NUMBER.add(factor);

			// AST REWRITE
			// elements: factor, c, unit, op
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
			// 669:5: -> ^( $c $unit $op $factor)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:8: ^( $c $unit $op $factor)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:674:1: typeLibrary : (decs+= typeDeclaration )+ ;
	public final BLESS3Parser.typeLibrary_return typeLibrary() throws RecognitionException {
		BLESS3Parser.typeLibrary_return retval = new BLESS3Parser.typeLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_decs=null;
		RuleReturnScope decs = null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:674:12: ( (decs+= typeDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:675:3: (decs+= typeDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:675:7: (decs+= typeDeclaration )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==LITERAL_type) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:675:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary2925);
					decs=typeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, decs.getTree());

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTree());
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:678:1: typeDeclaration : LITERAL_type ^id= ID LITERAL_is !ty= type ;
	public final BLESS3Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
		BLESS3Parser.typeDeclaration_return retval = new BLESS3Parser.typeDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LITERAL_type18=null;
		Token LITERAL_is19=null;
		ParserRuleReturnScope ty =null;

		BAST id_tree=null;
		BAST LITERAL_type18_tree=null;
		BAST LITERAL_is19_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:678:16: ( LITERAL_type ^id= ID LITERAL_is !ty= type )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:679:3: LITERAL_type ^id= ID LITERAL_is !ty= type
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_type18=(Token)match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration2938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_type18_tree = (BAST)adaptor.create(LITERAL_type18);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_type18_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_typeDeclaration2943); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			LITERAL_is19=(Token)match(input,LITERAL_is,FOLLOW_LITERAL_is_in_typeDeclaration2945); if (state.failed) return retval;
			pushFollow(FOLLOW_type_in_typeDeclaration2950);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:682:1: type : ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null );
	public final BLESS3Parser.type_return type() throws RecognitionException {
		BLESS3Parser.type_return retval = new BLESS3Parser.type_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_boolean24=null;
		Token LITERAL_string25=null;
		Token LITERAL_null26=null;
		ParserRuleReturnScope enumerationType20 =null;
		ParserRuleReturnScope quantityType21 =null;
		ParserRuleReturnScope arrayType22 =null;
		ParserRuleReturnScope recordType23 =null;

		BAST LITERAL_boolean24_tree=null;
		BAST LITERAL_string25_tree=null;
		BAST LITERAL_null26_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:682:5: ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null )
			int alt19=7;
			switch ( input.LA(1) ) {
			case LITERAL_enumeration:
				{
				alt19=1;
				}
				break;
			case LITERAL_quantity:
				{
				alt19=2;
				}
				break;
			case LITERAL_array:
				{
				alt19=3;
				}
				break;
			case LITERAL_record:
			case LITERAL_union:
			case LITERAL_variant:
				{
				alt19=4;
				}
				break;
			case LITERAL_boolean:
				{
				alt19=5;
				}
				break;
			case LITERAL_string:
				{
				alt19=6;
				}
				break;
			case LITERAL_null:
				{
				alt19=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:683:3: enumerationType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationType_in_type2962);
					enumerationType20=enumerationType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationType20.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:684:5: quantityType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantityType_in_type2968);
					quantityType21=quantityType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantityType21.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:5: arrayType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type2974);
					arrayType22=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType22.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:686:5: recordType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type2980);
					recordType23=recordType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType23.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:687:5: LITERAL_boolean
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_boolean24=(Token)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type2986); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_boolean24_tree = (BAST)adaptor.create(LITERAL_boolean24);
					adaptor.addChild(root_0, LITERAL_boolean24_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:688:5: LITERAL_string
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_string25=(Token)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type2992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_string25_tree = (BAST)adaptor.create(LITERAL_string25);
					adaptor.addChild(root_0, LITERAL_string25_tree);
					}

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:689:5: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null26=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type2998); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null26_tree = (BAST)adaptor.create(LITERAL_null26);
					adaptor.addChild(root_0, LITERAL_null26_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:692:1: typeOrReference : (ty= type |ref= ID );
	public final BLESS3Parser.typeOrReference_return typeOrReference() throws RecognitionException {
		BLESS3Parser.typeOrReference_return retval = new BLESS3Parser.typeOrReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ref=null;
		ParserRuleReturnScope ty =null;

		BAST ref_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:692:16: (ty= type |ref= ID )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==LITERAL_array||LA20_0==LITERAL_boolean||LA20_0==LITERAL_enumeration||LA20_0==LITERAL_null||LA20_0==LITERAL_quantity||LA20_0==LITERAL_record||LA20_0==LITERAL_string||LA20_0==LITERAL_union||LA20_0==LITERAL_variant) ) {
				alt20=1;
			}
			else if ( (LA20_0==ID) ) {
				alt20=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:3: ty= type
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeOrReference3010);
					ty=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:13: ref= ID
					{
					root_0 = (BAST)adaptor.nil();


					ref=(Token)match(input,ID,FOLLOW_ID_in_typeOrReference3016); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:1: enumerationType : LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !;
	public final BLESS3Parser.enumerationType_return enumerationType() throws RecognitionException {
		BLESS3Parser.enumerationType_return retval = new BLESS3Parser.enumerationType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_enumeration27=null;
		Token LPAREN28=null;
		Token RPAREN29=null;
		Token defining_enumeration_literal=null;
		List<Object> list_defining_enumeration_literal=null;

		BAST LITERAL_enumeration27_tree=null;
		BAST LPAREN28_tree=null;
		BAST RPAREN29_tree=null;
		BAST defining_enumeration_literal_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:16: ( LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:697:3: LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_enumeration27=(Token)match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType3029); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_enumeration27_tree = (BAST)adaptor.create(LITERAL_enumeration27);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_enumeration27_tree, root_0);
			}

			LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumerationType3032); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:697:60: (defining_enumeration_literal+= ID )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==ID) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:697:60: defining_enumeration_literal+= ID
					{
					defining_enumeration_literal=(Token)match(input,ID,FOLLOW_ID_in_enumerationType3037); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					defining_enumeration_literal_tree = (BAST)adaptor.create(defining_enumeration_literal);
					adaptor.addChild(root_0, defining_enumeration_literal_tree);
					}

					if (list_defining_enumeration_literal==null) list_defining_enumeration_literal=new ArrayList<Object>();
					list_defining_enumeration_literal.add(defining_enumeration_literal);
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

			RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumerationType3040); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:1: quantityType : q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= propertyName )? ;
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
		Token LBRACKET30=null;
		Token RBRACKET31=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope step =null;
		ParserRuleReturnScope representation =null;

		BAST q_tree=null;
		BAST unit_tree=null;
		BAST scalar_tree=null;
		BAST whole_tree=null;
		BAST dd_tree=null;
		BAST st_tree=null;
		BAST rep_tree=null;
		BAST LBRACKET30_tree=null;
		BAST RBRACKET31_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:13: (q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= propertyName )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:701:3: q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= propertyName )?
			{
			root_0 = (BAST)adaptor.nil();


			q=(Token)match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType3056); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			q_tree = (BAST)adaptor.create(q);
			root_0 = (BAST)adaptor.becomeRoot(q_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:702:3: (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole )
			int alt22=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt22=1;
				}
				break;
			case LITERAL_scalar:
				{
				alt22=2;
				}
				break;
			case LITERAL_whole:
				{
				alt22=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:702:5: unit= ID
					{
					unit=(Token)match(input,ID,FOLLOW_ID_in_quantityType3066); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					unit_tree = (BAST)adaptor.create(unit);
					adaptor.addChild(root_0, unit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:702:15: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType3072); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					scalar_tree = (BAST)adaptor.create(scalar);
					adaptor.addChild(root_0, scalar_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:702:39: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType3078); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					whole_tree = (BAST)adaptor.create(whole);
					adaptor.addChild(root_0, whole_tree);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:703:3: ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LBRACKET) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:703:5: LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )?
					{
					LBRACKET30=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_quantityType3086); if (state.failed) return retval;
					pushFollow(FOLLOW_aNumber_in_quantityType3091);
					lb=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

					dd=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType3095); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					dd_tree = (BAST)adaptor.create(dd);
					root_0 = (BAST)adaptor.becomeRoot(dd_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_quantityType3100);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					RBRACKET31=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_quantityType3102); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:3: (st= LITERAL_step ^step= aNumber )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LITERAL_step) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:5: st= LITERAL_step ^step= aNumber
							{
							st=(Token)match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType3112); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							st_tree = (BAST)adaptor.create(st);
							root_0 = (BAST)adaptor.becomeRoot(st_tree, root_0);
							}

							pushFollow(FOLLOW_aNumber_in_quantityType3117);
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

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:705:3: (rep= LITERAL_representation ^representation= propertyName )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LITERAL_representation) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:705:5: rep= LITERAL_representation ^representation= propertyName
					{
					rep=(Token)match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType3132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					rep_tree = (BAST)adaptor.create(rep);
					root_0 = (BAST)adaptor.becomeRoot(rep_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_quantityType3137);
					representation=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, representation.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:1: arrayType : LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference ;
	public final BLESS3Parser.arrayType_return arrayType() throws RecognitionException {
		BLESS3Parser.arrayType_return retval = new BLESS3Parser.arrayType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_array32=null;
		Token LBRACKET33=null;
		Token RBRACKET34=null;
		Token LITERAL_of35=null;
		ParserRuleReturnScope array_ranges =null;
		ParserRuleReturnScope ty =null;

		BAST LITERAL_array32_tree=null;
		BAST LBRACKET33_tree=null;
		BAST RBRACKET34_tree=null;
		BAST LITERAL_of35_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:708:11: ( LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:709:3: LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_array32=(Token)match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType3156); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_array32_tree = (BAST)adaptor.create(LITERAL_array32);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_array32_tree, root_0);
			}

			LBRACKET33=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType3159); if (state.failed) return retval;
			pushFollow(FOLLOW_arrayRangeList_in_arrayType3164);
			array_ranges=arrayRangeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, array_ranges.getTree());

			RBRACKET34=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType3166); if (state.failed) return retval;
			LITERAL_of35=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType3169); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_of35_tree = (BAST)adaptor.create(LITERAL_of35);
			adaptor.addChild(root_0, LITERAL_of35_tree);
			}

			pushFollow(FOLLOW_typeOrReference_in_arrayType3173);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:1: arrayRangeList :rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? ;
	public final BLESS3Parser.arrayRangeList_return arrayRangeList() throws RecognitionException {
		BLESS3Parser.arrayRangeList_return retval = new BLESS3Parser.arrayRangeList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA36=null;
		Token COMMA37=null;
		List<Object> list_rang=null;
		RuleReturnScope rang = null;
		BAST COMMA36_tree=null;
		BAST COMMA37_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:16: (rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:3: rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_arrayRange_in_arrayRangeList3189);
			rang=arrayRange();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

			if (list_rang==null) list_rang=new ArrayList<Object>();
			list_rang.add(rang.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:20: ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==COMMA) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:22: COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )*
					{
					COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3193); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA36_tree = (BAST)adaptor.create(COMMA36);
					root_0 = (BAST)adaptor.becomeRoot(COMMA36_tree, root_0);
					}

					pushFollow(FOLLOW_arrayRange_in_arrayRangeList3198);
					rang=arrayRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

					if (list_rang==null) list_rang=new ArrayList<Object>();
					list_rang.add(rang.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:46: ( COMMA !rang+= arrayRange )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==COMMA) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:48: COMMA !rang+= arrayRange
							{
							COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList3202); if (state.failed) return retval;
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList3207);
							rang=arrayRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

							if (list_rang==null) list_rang=new ArrayList<Object>();
							list_rang.add(rang.getTree());
							}
							break;

						default :
							break loop26;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:1: arrayRange : lb= aNumber ( DOTDOT ^ub= aNumber )? ;
	public final BLESS3Parser.arrayRange_return arrayRange() throws RecognitionException {
		BLESS3Parser.arrayRange_return retval = new BLESS3Parser.arrayRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT38=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST DOTDOT38_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:12: (lb= aNumber ( DOTDOT ^ub= aNumber )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:14: lb= aNumber ( DOTDOT ^ub= aNumber )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_aNumber_in_arrayRange3227);
			lb=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:25: ( DOTDOT ^ub= aNumber )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==DOTDOT) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:27: DOTDOT ^ub= aNumber
					{
					DOTDOT38=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange3231); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT38_tree = (BAST)adaptor.create(DOTDOT38);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT38_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_arrayRange3236);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:1: recordType : ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !;
	public final BLESS3Parser.recordType_return recordType() throws RecognitionException {
		BLESS3Parser.recordType_return retval = new BLESS3Parser.recordType_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set39=null;
		Token LPAREN40=null;
		Token RPAREN41=null;
		List<Object> list_fields=null;
		RuleReturnScope fields = null;
		BAST set39_tree=null;
		BAST LPAREN40_tree=null;
		BAST RPAREN41_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:12: ( ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:719:3: ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			set39=input.LT(1);
			set39=input.LT(1);
			if ( input.LA(1)==LITERAL_record||input.LA(1)==LITERAL_union||input.LA(1)==LITERAL_variant ) {
				input.consume();
				if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(set39), root_0);
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_recordType3266); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:17: (fields+= recordField )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==ID) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:720:17: fields+= recordField
					{
					pushFollow(FOLLOW_recordField_in_recordType3271);
					fields=recordField();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fields.getTree());

					if (list_fields==null) list_fields=new ArrayList<Object>();
					list_fields.add(fields.getTree());
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

			RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_recordType3274); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:723:1: recordField : id= ID COLON ^ty= typeOrReference ;
	public final BLESS3Parser.recordField_return recordField() throws RecognitionException {
		BLESS3Parser.recordField_return retval = new BLESS3Parser.recordField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token COLON42=null;
		ParserRuleReturnScope ty =null;

		BAST id_tree=null;
		BAST COLON42_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:723:13: (id= ID COLON ^ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:724:3: id= ID COLON ^ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_recordField3292); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			COLON42=(Token)match(input,COLON,FOLLOW_COLON_in_recordField3294); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON42_tree = (BAST)adaptor.create(COLON42);
			root_0 = (BAST)adaptor.becomeRoot(COLON42_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_recordField3299);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:1: assertionLibrary : (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:17: ( (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:3: (ghosts= ghostVariables )? (assertion_list+= namedAssertion )*
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:3: (ghosts= ghostVariables )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LITERAL_ghost) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:5: ghosts= ghostVariables
					{
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary3319);
					ghosts=ghostVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ghostVariables.add(ghosts.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:732:17: (assertion_list+= namedAssertion )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==LASS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:732:17: assertion_list+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertionLibrary3328);
					assertion_list=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_namedAssertion.add(assertion_list.getTree());
					if (list_assertion_list==null) list_assertion_list=new ArrayList<Object>();
					list_assertion_list.add(assertion_list.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			// AST REWRITE
			// elements: ghosts, assertion_list
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
			// 733:3: -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:733:6: ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ANNEX, "ASSERTION_ANNEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:733:25: ( $ghosts)?
				if ( stream_ghosts.hasNext() ) {
					adaptor.addChild(root_1, stream_ghosts.nextTree());
				}
				stream_ghosts.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:733:34: ( $assertion_list)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:736:1: ghostVariables : LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ ;
	public final BLESS3Parser.ghostVariables_return ghostVariables() throws RecognitionException {
		BLESS3Parser.ghostVariables_return retval = new BLESS3Parser.ghostVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_ghost43=null;
		Token LITERAL_variables44=null;
		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		BAST LITERAL_ghost43_tree=null;
		BAST LITERAL_variables44_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:737:3: ( LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:738:3: LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_ghost43=(Token)match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables3361); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_ghost43_tree = (BAST)adaptor.create(LITERAL_ghost43);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_ghost43_tree, root_0);
			}

			LITERAL_variables44=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_ghostVariables3364); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:738:39: (gv+= ghostVariable )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==LITERAL_def) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:738:39: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables3369);
					gv=ghostVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, gv.getTree());

					if (list_gv==null) list_gv=new ArrayList<Object>();
					list_gv.add(gv.getTree());
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:741:1: ghostVariable : LITERAL_def ^id= ID TILDE !tod= typeOrReference ;
	public final BLESS3Parser.ghostVariable_return ghostVariable() throws RecognitionException {
		BLESS3Parser.ghostVariable_return retval = new BLESS3Parser.ghostVariable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LITERAL_def45=null;
		Token TILDE46=null;
		ParserRuleReturnScope tod =null;

		BAST id_tree=null;
		BAST LITERAL_def45_tree=null;
		BAST TILDE46_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:741:14: ( LITERAL_def ^id= ID TILDE !tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:3: LITERAL_def ^id= ID TILDE !tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_def45=(Token)match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable3382); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_def45_tree = (BAST)adaptor.create(LITERAL_def45);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_def45_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_ghostVariable3388); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE46=(Token)match(input,TILDE,FOLLOW_TILDE_in_ghostVariable3390); if (state.failed) return retval;
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable3395);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:1: namedAssertion : lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred) -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {til!=null}? ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> $lass;
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
		Token COLON47=null;
		Token ASSIGN48=null;
		Token RASS49=null;
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
		BAST COLON47_tree=null;
		BAST ASSIGN48_tree=null;
		BAST RASS49_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:15: (lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred) -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {til!=null}? ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> $lass)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:746:3: lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS
			{
			lass=(Token)match(input,LASS,FOLLOW_LASS_in_namedAssertion3412); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(lass);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:747:3: (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:747:5: id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3420); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			COLON47=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3422); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON47);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:5: ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==ID) ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1==TILDE) ) {
					int LA35_3 = input.LA(3);
					if ( (LA35_3==ID) ) {
						int LA35_4 = input.LA(4);
						if ( (LA35_4==PLUS_ARROW) ) {
							alt35=2;
						}
						else if ( (LA35_4==COLON||LA35_4==COMMA||LA35_4==LITERAL_returns) ) {
							alt35=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 35, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA35_3==LITERAL_array||LA35_3==LITERAL_boolean||LA35_3==LITERAL_enumeration||LA35_3==LITERAL_null||LA35_3==LITERAL_quantity||LA35_3==LITERAL_record||LA35_3==LITERAL_string||LA35_3==LITERAL_union||LA35_3==LITERAL_variant) ) {
						alt35=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 35, 3, input);
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
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA35_0==COLON||LA35_0==LITERAL_returns) ) {
				alt35=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:5: (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:12: (formals= variableList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ID) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:749:12: formals= variableList
							{
							pushFollow(FOLLOW_variableList_in_namedAssertion3437);
							formals=variableList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_variableList.add(formals.getTree());
							}
							break;

					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:7: (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==COLON) ) {
						alt34=1;
					}
					else if ( (LA34_0==LITERAL_returns) ) {
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:7: col= COLON pred= predicate
							{
							col=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3457); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(col);

							pushFollow(FOLLOW_predicate_in_namedAssertion3462);
							pred=predicate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:753:7: ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue
							{
							ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion3482); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

							pushFollow(FOLLOW_typeOrReference_in_namedAssertion3486);
							tod=typeOrReference();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
							ASSIGN48=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namedAssertion3488); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN48);

							pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion3493);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:756:5: assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration
					{
					assertionvariable=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3518); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(assertionvariable);

					til=(Token)match(input,TILDE,FOLLOW_TILDE_in_namedAssertion3522); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(til);

					enumerationTy=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3526); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(enumerationTy);

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion3530);
					enumeration=assertionEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertionEnumeration.add(enumeration.getTree());
					}
					break;

			}

			}

			RASS49=(Token)match(input,RASS,FOLLOW_RASS_in_namedAssertion3544); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS49);

			// AST REWRITE
			// elements: id, id, assertionvariable, ret, ret, til, functionvalue, tod, functionvalue, id, id, pred, formals, pred, tod, enumerationTy, enumeration, formals, id, lass
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
			// 760:4: -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred)
			if (id!=null&&formals==null&&col!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:6: ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, id, "ASSERTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:8: ^( LABEL $id)
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

			else // 763:4: -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred)
			if (id!=null&&formals!=null&&col!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:764:6: ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, id, "ASSERTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:765:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:765:23: ^( PARAMETERS $formals)
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

			else // 766:4: -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue)
			if (id!=null&&formals==null&&ret!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:767:6: ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, id, "ASSERTION_FUNCTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:768:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:768:23: ^( $ret $tod)
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

			else // 769:4: -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
			if (id!=null&&formals!=null&&ret!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:770:6: ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, id, "ASSERTION_FUNCTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:23: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:48: ^( $ret $tod)
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

			else // 772:4: -> {til!=null}? ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
			if (til!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:773:6: ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, id, "ASSERTION_ENUMERATION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:23: ^( $til $assertionvariable $enumerationTy)
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

			else // 775:4: -> $lass
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:777:1: predicate : ex= expression -> $ex;
	public final BLESS3Parser.predicate_return predicate() throws RecognitionException {
		BLESS3Parser.predicate_return retval = new BLESS3Parser.predicate_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope ex =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:777:10: (ex= expression -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:777:13: ex= expression
			{
			pushFollow(FOLLOW_expression_in_predicate3904);
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
			// 778:3: -> $ex
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:1: variableList : first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? ;
	public final BLESS3Parser.variableList_return variableList() throws RecognitionException {
		BLESS3Parser.variableList_return retval = new BLESS3Parser.variableList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA50=null;
		Token COMMA51=null;
		List<Object> list_parameter=null;
		ParserRuleReturnScope first =null;
		RuleReturnScope parameter = null;
		BAST COMMA50_tree=null;
		BAST COMMA51_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:781:13: (first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:3: first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_variableList3925);
			first=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, first.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:18: ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==COMMA) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:20: COMMA ^parameter+= variable ( COMMA !parameter+= variable )*
					{
					COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3929); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA50_tree = (BAST)adaptor.create(COMMA50);
					root_0 = (BAST)adaptor.becomeRoot(COMMA50_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_variableList3934);
					parameter=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

					if (list_parameter==null) list_parameter=new ArrayList<Object>();
					list_parameter.add(parameter.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:47: ( COMMA !parameter+= variable )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==COMMA) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:782:49: COMMA !parameter+= variable
							{
							COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3938); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_variableList3943);
							parameter=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTree());
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:785:1: variable : id= ID TILDE ^tod= typeOrReference ;
	public final BLESS3Parser.variable_return variable() throws RecognitionException {
		BLESS3Parser.variable_return retval = new BLESS3Parser.variable_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token TILDE52=null;
		ParserRuleReturnScope tod =null;

		BAST id_tree=null;
		BAST TILDE52_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:785:9: (id= ID TILDE ^tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:786:3: id= ID TILDE ^tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_variable3961); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE52=(Token)match(input,TILDE,FOLLOW_TILDE_in_variable3963); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TILDE52_tree = (BAST)adaptor.create(TILDE52);
			root_0 = (BAST)adaptor.becomeRoot(TILDE52_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_variable3968);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:789:1: assertionFunctionValue : ( conditionalAssertionFunction | expression );
	public final BLESS3Parser.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		BLESS3Parser.assertionFunctionValue_return retval = new BLESS3Parser.assertionFunctionValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalAssertionFunction53 =null;
		ParserRuleReturnScope expression54 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:789:23: ( conditionalAssertionFunction | expression )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==LBRACKET) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==ID) ) {
					alt38=2;
				}
				else if ( (LA38_1==LPAREN) ) {
					alt38=1;
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
			else if ( (LA38_0==AADL_STRING_LITERAL||LA38_0==ID||LA38_0==LITERAL_abs||LA38_0==LITERAL_all||LA38_0==LITERAL_exists||LA38_0==LITERAL_false||(LA38_0 >= LITERAL_not && LA38_0 <= LITERAL_numberof)||LA38_0==LITERAL_product||LA38_0==LITERAL_round||LA38_0==LITERAL_self||LA38_0==LITERAL_sum||LA38_0==LITERAL_timeout||LA38_0==LITERAL_tops||(LA38_0 >= LITERAL_true && LA38_0 <= LITERAL_truncate)||LA38_0==LPAREN||LA38_0==MINUS||LA38_0==NUMBER||LA38_0==OCTOTHORPE) ) {
				alt38=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:790:2: conditionalAssertionFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue3979);
					conditionalAssertionFunction53=conditionalAssertionFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAssertionFunction53.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:791:4: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assertionFunctionValue3985);
					expression54=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression54.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:1: conditionalAssertionFunction : LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) ;
	public final BLESS3Parser.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		BLESS3Parser.conditionalAssertionFunction_return retval = new BLESS3Parser.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET55=null;
		Token COMMA56=null;
		Token RBRACKET57=null;
		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		BAST LBRACKET55_tree=null;
		BAST COMMA56_tree=null;
		BAST RBRACKET57_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_conditionValuePair=new RewriteRuleSubtreeStream(adaptor,"rule conditionValuePair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:794:29: ( LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:2: LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET
			{
			LBRACKET55=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_conditionalAssertionFunction3998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET55);

			pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction4002);
			cvp=conditionValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
			if (list_cvp==null) list_cvp=new ArrayList<Object>();
			list_cvp.add(cvp.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:35: ( COMMA cvp+= conditionValuePair )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==COMMA) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:795:37: COMMA cvp+= conditionValuePair
					{
					COMMA56=(Token)match(input,COMMA,FOLLOW_COMMA_in_conditionalAssertionFunction4006); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA56);

					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction4010);
					cvp=conditionValuePair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
					if (list_cvp==null) list_cvp=new ArrayList<Object>();
					list_cvp.add(cvp.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			RBRACKET57=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_conditionalAssertionFunction4015); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET57);

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
			// 796:4: -> ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:7: ^( CONDITIONAL_ASSERTION_FUNCTION ( $cvp)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITIONAL_ASSERTION_FUNCTION, "CONDITIONAL_ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:42: ( $cvp)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:799:1: conditionValuePair : LPAREN ! predicate CVP ^ expression ;
	public final BLESS3Parser.conditionValuePair_return conditionValuePair() throws RecognitionException {
		BLESS3Parser.conditionValuePair_return retval = new BLESS3Parser.conditionValuePair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN58=null;
		Token CVP60=null;
		ParserRuleReturnScope predicate59 =null;
		ParserRuleReturnScope expression61 =null;

		BAST LPAREN58_tree=null;
		BAST CVP60_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:799:19: ( LPAREN ! predicate CVP ^ expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:800:3: LPAREN ! predicate CVP ^ expression
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionValuePair4043); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_conditionValuePair4046);
			predicate59=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate59.getTree());

			CVP60=(Token)match(input,CVP,FOLLOW_CVP_in_conditionValuePair4048); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CVP60_tree = (BAST)adaptor.create(CVP60);
			root_0 = (BAST)adaptor.becomeRoot(CVP60_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_conditionValuePair4051);
			expression61=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression61.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:1: assertionEnumeration : ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> ^( $pa ( $pair)+ ) );
	public final BLESS3Parser.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		BLESS3Parser.assertionEnumeration_return retval = new BLESS3Parser.assertionEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token com=null;
		Token COMMA62=null;
		List<Object> list_pair=null;
		ParserRuleReturnScope inv =null;
		RuleReturnScope pair = null;
		BAST pa_tree=null;
		BAST com_tree=null;
		BAST COMMA62_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");
		RewriteRuleSubtreeStream stream_enumerationPair=new RewriteRuleSubtreeStream(adaptor,"rule enumerationPair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:21: ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> ^( $pa ( $pair)+ ) )
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==PLUS_ARROW) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==ID) ) {
					int LA42_2 = input.LA(3);
					if ( (LA42_2==LPAREN) ) {
						alt42=1;
					}
					else if ( (LA42_2==IMP) ) {
						alt42=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 42, 2, input);
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
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:2: (pa= PLUS_ARROW inv= invocation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:2: (pa= PLUS_ARROW inv= invocation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:804:4: pa= PLUS_ARROW inv= invocation
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration4067); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_invocation_in_assertionEnumeration4071);
					inv=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
					}

					// AST REWRITE
					// elements: pa, inv
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
					// 805:4: -> ^( $pa $inv)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:805:7: ^( $pa $inv)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:4: pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration4098); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4102);
					pair=enumerationPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
					if (list_pair==null) list_pair=new ArrayList<Object>();
					list_pair.add(pair.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:40: (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==COMMA) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:42: com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )*
							{
							com=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration4108); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(com);

							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4112);
							pair=enumerationPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTree());
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:74: ( COMMA pair+= enumerationPair )*
							loop40:
							while (true) {
								int alt40=2;
								int LA40_0 = input.LA(1);
								if ( (LA40_0==COMMA) ) {
									alt40=1;
								}

								switch (alt40) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:76: COMMA pair+= enumerationPair
									{
									COMMA62=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration4116); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA62);

									pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration4120);
									pair=enumerationPair();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
									if (list_pair==null) list_pair=new ArrayList<Object>();
									list_pair.add(pair.getTree());
									}
									break;

								default :
									break loop40;
								}
							}

							}
							break;

					}

					}

					// AST REWRITE
					// elements: pa, pair
					// token labels: pa
					// rule labels: retval
					// token list labels: 
					// rule list labels: pair
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_pa=new RewriteRuleTokenStream(adaptor,"token pa",pa);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"token pair",list_pair);
					root_0 = (BAST)adaptor.nil();
					// 809:4: -> ^( $pa ( $pair)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:809:7: ^( $pa ( $pair)+ )
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot(stream_pa.nextNode(), root_1);
						if ( !(stream_pair.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_pair.hasNext() ) {
							adaptor.addChild(root_1, stream_pair.nextTree());
						}
						stream_pair.reset();

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:1: enumerationPair : ID IMP ^ predicate ;
	public final BLESS3Parser.enumerationPair_return enumerationPair() throws RecognitionException {
		BLESS3Parser.enumerationPair_return retval = new BLESS3Parser.enumerationPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID63=null;
		Token IMP64=null;
		ParserRuleReturnScope predicate65 =null;

		BAST ID63_tree=null;
		BAST IMP64_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:16: ( ID IMP ^ predicate )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:813:3: ID IMP ^ predicate
			{
			root_0 = (BAST)adaptor.nil();


			ID63=(Token)match(input,ID,FOLLOW_ID_in_enumerationPair4157); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID63_tree = (BAST)adaptor.create(ID63);
			adaptor.addChild(root_0, ID63_tree);
			}

			IMP64=(Token)match(input,IMP,FOLLOW_IMP_in_enumerationPair4159); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP64_tree = (BAST)adaptor.create(IMP64);
			root_0 = (BAST)adaptor.becomeRoot(IMP64_tree, root_0);
			}

			pushFollow(FOLLOW_predicate_in_enumerationPair4162);
			predicate65=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate65.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:816:1: enumerationValue : enumeration_type= ID TICK ^enumeration_value= ID ;
	public final BLESS3Parser.enumerationValue_return enumerationValue() throws RecognitionException {
		BLESS3Parser.enumerationValue_return retval = new BLESS3Parser.enumerationValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token enumeration_type=null;
		Token enumeration_value=null;
		Token TICK66=null;

		BAST enumeration_type_tree=null;
		BAST enumeration_value_tree=null;
		BAST TICK66_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:816:17: (enumeration_type= ID TICK ^enumeration_value= ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:817:3: enumeration_type= ID TICK ^enumeration_value= ID
			{
			root_0 = (BAST)adaptor.nil();


			enumeration_type=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue4176); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			enumeration_type_tree = (BAST)adaptor.create(enumeration_type);
			adaptor.addChild(root_0, enumeration_type_tree);
			}

			TICK66=(Token)match(input,TICK,FOLLOW_TICK_in_enumerationValue4178); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TICK66_tree = (BAST)adaptor.create(TICK66);
			root_0 = (BAST)adaptor.becomeRoot(TICK66_tree, root_0);
			}

			enumeration_value=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue4183); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:1: namelessAssertion : la= LASS pred= predicate RASS -> ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred) ;
	public final BLESS3Parser.namelessAssertion_return namelessAssertion() throws RecognitionException {
		BLESS3Parser.namelessAssertion_return retval = new BLESS3Parser.namelessAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token la=null;
		Token RASS67=null;
		ParserRuleReturnScope pred =null;

		BAST la_tree=null;
		BAST RASS67_tree=null;
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:18: (la= LASS pred= predicate RASS -> ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:822:3: la= LASS pred= predicate RASS
			{
			la=(Token)match(input,LASS,FOLLOW_LASS_in_namelessAssertion4198); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(la);

			pushFollow(FOLLOW_predicate_in_namelessAssertion4202);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			RASS67=(Token)match(input,RASS,FOLLOW_RASS_in_namelessAssertion4204); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS67);

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
			// 823:5: -> ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:823:8: ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, la, "ASSERTION["+Integer.toString(la.getLine()+startingLine)+"]"), root_1);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:1: namelessFunction : LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue) ;
	public final BLESS3Parser.namelessFunction_return namelessFunction() throws RecognitionException {
		BLESS3Parser.namelessFunction_return retval = new BLESS3Parser.namelessFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ret=null;
		Token LASS68=null;
		Token ASSIGN69=null;
		Token RASS70=null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;

		BAST ret_tree=null;
		BAST LASS68_tree=null;
		BAST ASSIGN69_tree=null;
		BAST RASS70_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:17: ( LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:3: LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS
			{
			LASS68=(Token)match(input,LASS,FOLLOW_LASS_in_namelessFunction4234); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS68);

			ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction4238); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

			pushFollow(FOLLOW_typeOrReference_in_namelessFunction4242);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
			ASSIGN69=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namelessFunction4244); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN69);

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction4248);
			functionvalue=assertionFunctionValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
			RASS70=(Token)match(input,RASS,FOLLOW_RASS_in_namelessFunction4250); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS70);

			// AST REWRITE
			// elements: functionvalue, ret, tod
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
			// 828:5: -> ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:8: ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, ret, "ASSERTION_FUNCTION["+Integer.toString(ret.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:108: ^( $ret $tod)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:831:1: namelessEnumeration : LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv) ;
	public final BLESS3Parser.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		BLESS3Parser.namelessEnumeration_return retval = new BLESS3Parser.namelessEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token LASS71=null;
		Token RASS72=null;
		ParserRuleReturnScope inv =null;

		BAST pa_tree=null;
		BAST LASS71_tree=null;
		BAST RASS72_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:831:20: ( LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:832:2: LASS pa= PLUS_ARROW inv= invocation RASS
			{
			LASS71=(Token)match(input,LASS,FOLLOW_LASS_in_namelessEnumeration4291); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS71);

			pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_namelessEnumeration4295); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

			pushFollow(FOLLOW_invocation_in_namelessEnumeration4299);
			inv=invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
			RASS72=(Token)match(input,RASS,FOLLOW_RASS_in_namelessEnumeration4301); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS72);

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
			// 833:4: -> ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:833:8: ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, pa, "ASSERTION_ENUMERATION["+Integer.toString(pa.getLine()+startingLine)+"]"), root_1);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:836:1: assertion : ( ( LASS ID COLON )=> namedAssertion | ( LASS LITERAL_returns )=> namelessFunction | ( LASS PLUS_ARROW )=> namelessEnumeration | namelessAssertion );
	public final BLESS3Parser.assertion_return assertion() throws RecognitionException {
		BLESS3Parser.assertion_return retval = new BLESS3Parser.assertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope namedAssertion73 =null;
		ParserRuleReturnScope namelessFunction74 =null;
		ParserRuleReturnScope namelessEnumeration75 =null;
		ParserRuleReturnScope namelessAssertion76 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:838:3: ( ( LASS ID COLON )=> namedAssertion | ( LASS LITERAL_returns )=> namelessFunction | ( LASS PLUS_ARROW )=> namelessEnumeration | namelessAssertion )
			int alt43=4;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==LASS) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==LITERAL_returns) && (synpred64_BLESS3())) {
					alt43=2;
				}
				else if ( (LA43_1==PLUS_ARROW) && (synpred65_BLESS3())) {
					alt43=3;
				}
				else if ( (LA43_1==ID) ) {
					int LA43_4 = input.LA(3);
					if ( (LA43_4==COLON) && (synpred63_BLESS3())) {
						alt43=1;
					}
					else if ( ((LA43_4 >= AL && LA43_4 <= AM)||LA43_4==AT_SIGN||LA43_4==CARET||(LA43_4 >= DIVIDE && LA43_4 <= DOT)||LA43_4==DOUBLE_COLON||LA43_4==EQ||LA43_4==EXP||LA43_4==GT||LA43_4==LBRACKET||LA43_4==LITERAL_and||LA43_4==LITERAL_div||LA43_4==LITERAL_iff||(LA43_4 >= LITERAL_implies && LA43_4 <= LITERAL_in)||LA43_4==LITERAL_mod||LA43_4==LITERAL_or||LA43_4==LITERAL_rem||(LA43_4 >= LITERAL_xor && LA43_4 <= LT)||LA43_4==MINUS||LA43_4==NEQ||(LA43_4 >= OCTOTHORPE && LA43_4 <= OLD_NEQ)||LA43_4==PLUS||LA43_4==PLUS_EQUALS||(LA43_4 >= QUESTION && LA43_4 <= RASS)||LA43_4==TICK||LA43_4==TIMES) ) {
						alt43=4;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 43, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA43_1==AADL_STRING_LITERAL||LA43_1==LBRACKET||LA43_1==LITERAL_abs||LA43_1==LITERAL_all||LA43_1==LITERAL_exists||LA43_1==LITERAL_false||(LA43_1 >= LITERAL_not && LA43_1 <= LITERAL_numberof)||LA43_1==LITERAL_product||LA43_1==LITERAL_round||LA43_1==LITERAL_self||LA43_1==LITERAL_sum||LA43_1==LITERAL_timeout||LA43_1==LITERAL_tops||(LA43_1 >= LITERAL_true && LA43_1 <= LITERAL_truncate)||LA43_1==LPAREN||LA43_1==MINUS||LA43_1==NUMBER||LA43_1==OCTOTHORPE) ) {
					alt43=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:3: ( LASS ID COLON )=> namedAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namedAssertion_in_assertion4339);
					namedAssertion73=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion73.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:840:5: ( LASS LITERAL_returns )=> namelessFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessFunction_in_assertion4352);
					namelessFunction74=namelessFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessFunction74.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:5: ( LASS PLUS_ARROW )=> namelessEnumeration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessEnumeration_in_assertion4365);
					namelessEnumeration75=namelessEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessEnumeration75.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:842:5: namelessAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessAssertion_in_assertion4371);
					namelessAssertion76=namelessAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessAssertion76.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:846:1: invocation : id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? ) ;
	public final BLESS3Parser.invocation_return invocation() throws RecognitionException {
		BLESS3Parser.invocation_return retval = new BLESS3Parser.invocation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN77=null;
		Token COMMA78=null;
		Token RPAREN79=null;
		List<Object> list_params=null;
		ParserRuleReturnScope exp =null;
		RuleReturnScope params = null;
		BAST id_tree=null;
		BAST LPAREN77_tree=null;
		BAST COMMA78_tree=null;
		BAST RPAREN79_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_actualParameter=new RewriteRuleSubtreeStream(adaptor,"rule actualParameter");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:846:11: (id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:847:2: id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_invocation4385); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_invocation4387); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN77);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:2: ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )?
			int alt45=3;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==ID) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==COLON) ) {
					alt45=1;
				}
				else if ( ((LA45_1 >= AL && LA45_1 <= AM)||LA45_1==AT_SIGN||LA45_1==CARET||(LA45_1 >= DIVIDE && LA45_1 <= DOT)||LA45_1==DOUBLE_COLON||LA45_1==EQ||LA45_1==EXP||LA45_1==GT||LA45_1==LBRACKET||LA45_1==LITERAL_and||LA45_1==LITERAL_div||LA45_1==LITERAL_iff||(LA45_1 >= LITERAL_implies && LA45_1 <= LITERAL_in)||LA45_1==LITERAL_mod||LA45_1==LITERAL_or||LA45_1==LITERAL_rem||(LA45_1 >= LITERAL_xor && LA45_1 <= LT)||LA45_1==MINUS||LA45_1==NEQ||(LA45_1 >= OCTOTHORPE && LA45_1 <= OLD_NEQ)||LA45_1==PLUS||LA45_1==PLUS_EQUALS||LA45_1==QUESTION||LA45_1==RPAREN||LA45_1==TICK||LA45_1==TIMES) ) {
					alt45=2;
				}
			}
			else if ( (LA45_0==AADL_STRING_LITERAL||LA45_0==LBRACKET||LA45_0==LITERAL_abs||LA45_0==LITERAL_all||LA45_0==LITERAL_exists||LA45_0==LITERAL_false||(LA45_0 >= LITERAL_not && LA45_0 <= LITERAL_numberof)||LA45_0==LITERAL_product||LA45_0==LITERAL_round||LA45_0==LITERAL_self||LA45_0==LITERAL_sum||LA45_0==LITERAL_timeout||LA45_0==LITERAL_tops||(LA45_0 >= LITERAL_true && LA45_0 <= LITERAL_truncate)||LA45_0==LPAREN||LA45_0==MINUS||LA45_0==NUMBER||LA45_0==OCTOTHORPE) ) {
				alt45=2;
			}
			switch (alt45) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:6: params+= actualParameter ( COMMA params+= actualParameter )*
					{
					pushFollow(FOLLOW_actualParameter_in_invocation4397);
					params=actualParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
					if (list_params==null) list_params=new ArrayList<Object>();
					list_params.add(params.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:30: ( COMMA params+= actualParameter )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==COMMA) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:848:32: COMMA params+= actualParameter
							{
							COMMA78=(Token)match(input,COMMA,FOLLOW_COMMA_in_invocation4401); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA78);

							pushFollow(FOLLOW_actualParameter_in_invocation4405);
							params=actualParameter();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTree());
							}
							break;

						default :
							break loop44;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:849:6: exp= expression
					{
					pushFollow(FOLLOW_expression_in_invocation4419);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			RPAREN79=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_invocation4424); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN79);

			// AST REWRITE
			// elements: params, exp, id
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
			// 850:4: -> ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:7: ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVOKE, id, "INVOKE["+(id!=null?id.getText():null)+":"+Integer.toString(id.getLine()+startingLine)+"] "), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:102: ( $params)*
				while ( stream_params.hasNext() ) {
					adaptor.addChild(root_1, stream_params.nextTree());
				}
				stream_params.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:111: ( $exp)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:1: actualParameter : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.actualParameter_return actualParameter() throws RecognitionException {
		BLESS3Parser.actualParameter_return retval = new BLESS3Parser.actualParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON80=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON80_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:16: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:854:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_actualParameter4460); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON80=(Token)match(input,COLON,FOLLOW_COLON_in_actualParameter4462); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON80_tree = (BAST)adaptor.create(COLON80);
			root_0 = (BAST)adaptor.becomeRoot(COLON80_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_actualParameter4467);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:1: expression : (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? );
	public final BLESS3Parser.expression_return expression() throws RecognitionException {
		BLESS3Parser.expression_return retval = new BLESS3Parser.expression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_iff81=null;
		Token LITERAL_implies82=null;
		ParserRuleReturnScope all =null;
		ParserRuleReturnScope exists =null;
		ParserRuleReturnScope sum =null;
		ParserRuleReturnScope product =null;
		ParserRuleReturnScope numberof =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		BAST LITERAL_iff81_tree=null;
		BAST LITERAL_implies82_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:11: (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? )
			int alt48=6;
			switch ( input.LA(1) ) {
			case LITERAL_all:
				{
				alt48=1;
				}
				break;
			case LITERAL_exists:
				{
				alt48=2;
				}
				break;
			case LITERAL_sum:
				{
				alt48=3;
				}
				break;
			case LITERAL_product:
				{
				alt48=4;
				}
				break;
			case LITERAL_numberof:
				{
				alt48=5;
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
				{
				alt48=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:3: all= universalQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalQuantification_in_expression4485);
					all=universalQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, all.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:861:5: exists= existentialQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialQuantification_in_expression4493);
					exists=existentialQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:5: sum= sumQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_sumQuantification_in_expression4501);
					sum=sumQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sum.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:863:5: product= productQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_productQuantification_in_expression4509);
					product=productQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, product.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:864:5: numberof= countingQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_countingQuantification_in_expression4517);
					numberof=countingQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numberof.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:5: l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_disjunction_in_expression4525);
					l=disjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:19: ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==LITERAL_iff||LA47_0==LITERAL_implies) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:21: ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:21: ( LITERAL_iff ^| LITERAL_implies ^)
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==LITERAL_iff) ) {
								alt46=1;
							}
							else if ( (LA46_0==LITERAL_implies) ) {
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
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:22: LITERAL_iff ^
									{
									LITERAL_iff81=(Token)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression4530); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_iff81_tree = (BAST)adaptor.create(LITERAL_iff81);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_iff81_tree, root_0);
									}

									}
									break;
								case 2 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:865:37: LITERAL_implies ^
									{
									LITERAL_implies82=(Token)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression4535); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_implies82_tree = (BAST)adaptor.create(LITERAL_implies82);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_implies82_tree, root_0);
									}

									}
									break;

							}

							pushFollow(FOLLOW_disjunction_in_expression4541);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:1: universalQuantification : al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:24: (al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:870:3: al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate
			{
			al=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification4557); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_all.add(al);

			pushFollow(FOLLOW_logicVariables_in_universalQuantification4561);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalQuantification4572); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_universalQuantification4576);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_universalQuantification4582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_universalQuantification4586);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification4597); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_universalQuantification4601);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: al, ar, al, lv, pred, r, al, i, ar, b, pred, lv, w
			// token labels: ar, w, i, al
			// rule labels: r, b, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_al=new RewriteRuleTokenStream(adaptor,"token al",al);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 873:4: -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:873:18: ^( $al $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:873:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:873:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 874:4: -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:18: ^( $al $lv ^( $w $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:874:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 875:4: -> $al
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:1: existentialQuantification : ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) th= LITERAL_that pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) ) -> {w!=null}? ^( $ex $lv ^( $w $b) ^( $th $pred) ) -> $ex;
	public final BLESS3Parser.existentialQuantification_return existentialQuantification() throws RecognitionException {
		BLESS3Parser.existentialQuantification_return retval = new BLESS3Parser.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ex=null;
		Token i=null;
		Token w=null;
		Token th=null;
		ParserRuleReturnScope lv =null;
		ParserRuleReturnScope r =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope pred =null;

		BAST ex_tree=null;
		BAST i_tree=null;
		BAST w_tree=null;
		BAST th_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_which=new RewriteRuleTokenStream(adaptor,"token LITERAL_which");
		RewriteRuleTokenStream stream_LITERAL_that=new RewriteRuleTokenStream(adaptor,"token LITERAL_that");
		RewriteRuleTokenStream stream_LITERAL_exists=new RewriteRuleTokenStream(adaptor,"token LITERAL_exists");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");
		RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
		RewriteRuleSubtreeStream stream_logicVariables=new RewriteRuleSubtreeStream(adaptor,"rule logicVariables");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:26: (ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) th= LITERAL_that pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) ) -> {w!=null}? ^( $ex $lv ^( $w $b) ^( $th $pred) ) -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:879:3: ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) th= LITERAL_that pred= predicate
			{
			ex=(Token)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification4697); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_exists.add(ex);

			pushFollow(FOLLOW_logicVariables_in_existentialQuantification4701);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==LITERAL_in) ) {
				alt50=1;
			}
			else if ( (LA50_0==LITERAL_which) ) {
				alt50=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_existentialQuantification4712); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_existentialQuantification4716);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_existentialQuantification4722); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_existentialQuantification4726);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			th=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification4737); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(th);

			pushFollow(FOLLOW_predicate_in_existentialQuantification4741);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: pred, lv, th, b, r, th, pred, ex, w, ex, lv, i, ex
			// token labels: ex, th, w, i
			// rule labels: b, r, pred, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ex=new RewriteRuleTokenStream(adaptor,"token ex",ex);
			RewriteRuleTokenStream stream_th=new RewriteRuleTokenStream(adaptor,"token th",th);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_pred=new RewriteRuleSubtreeStream(adaptor,"rule pred",pred!=null?pred.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 882:4: -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:882:18: ^( $ex $lv ^( $i $r) ^( $th $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:882:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:882:40: ^( $th $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 883:4: -> {w!=null}? ^( $ex $lv ^( $w $b) ^( $th $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:18: ^( $ex $lv ^( $w $b) ^( $th $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:883:40: ^( $th $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 884:4: -> $ex
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:1: sumQuantification : sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:18: (sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:888:3: sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			sum=(Token)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification4837); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_sum.add(sum);

			pushFollow(FOLLOW_logicVariables_in_sumQuantification4841);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==LITERAL_in) ) {
				alt51=1;
			}
			else if ( (LA51_0==LITERAL_which) ) {
				alt51=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_sumQuantification4852); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_sumQuantification4856);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_sumQuantification4862); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_sumQuantification4866);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification4877); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_sumQuantification4881);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: i, b, sum, ar, lv, sum, sum, w, ex, ar, ex, r, lv
			// token labels: ar, w, i, sum
			// rule labels: b, r, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_sum=new RewriteRuleTokenStream(adaptor,"token sum",sum);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 891:4: -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:891:18: ^( $sum $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:891:30: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:891:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 892:4: -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:18: ^( $sum $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:30: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:892:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 893:4: -> $sum
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:1: productQuantification : pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:896:22: (pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:897:3: pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			pr=(Token)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification4977); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_product.add(pr);

			pushFollow(FOLLOW_logicVariables_in_productQuantification4981);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==LITERAL_in) ) {
				alt52=1;
			}
			else if ( (LA52_0==LITERAL_which) ) {
				alt52=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_productQuantification4992); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_productQuantification4996);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_productQuantification5002); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_productQuantification5006);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification5017); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_productQuantification5021);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: b, i, ar, lv, r, w, ex, pr, pr, pr, lv, ar, ex
			// token labels: ar, pr, w, i
			// rule labels: b, r, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_pr=new RewriteRuleTokenStream(adaptor,"token pr",pr);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 900:4: -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:18: ^( $pr $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 901:4: -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:18: ^( $pr $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 902:4: -> $pr
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:1: countingQuantification : n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:23: (n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:906:3: n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression
			{
			n=(Token)match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification5117); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_numberof.add(n);

			pushFollow(FOLLOW_logicVariables_in_countingQuantification5121);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:907:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==LITERAL_in) ) {
				alt53=1;
			}
			else if ( (LA53_0==LITERAL_which) ) {
				alt53=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}

			switch (alt53) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:907:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_countingQuantification5132); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_countingQuantification5136);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:907:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_countingQuantification5142); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_countingQuantification5146);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification5157); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(ar);

			pushFollow(FOLLOW_expression_in_countingQuantification5161);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: w, n, lv, ar, r, n, ar, i, ex, b, ex, lv, n
			// token labels: ar, w, i, n
			// rule labels: r, b, ex, lv, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_ar=new RewriteRuleTokenStream(adaptor,"token ar",ar);
			RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
			RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
			RewriteRuleTokenStream stream_n=new RewriteRuleTokenStream(adaptor,"token n",n);
			RewriteRuleSubtreeStream stream_r=new RewriteRuleSubtreeStream(adaptor,"rule r",r!=null?r.getTree():null);
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_ex=new RewriteRuleSubtreeStream(adaptor,"rule ex",ex!=null?ex.getTree():null);
			RewriteRuleSubtreeStream stream_lv=new RewriteRuleSubtreeStream(adaptor,"rule lv",lv!=null?lv.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 909:4: -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:18: ^( $n $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:28: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 910:4: -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:18: ^( $n $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:28: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 911:4: -> $n
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:1: logicVariables :lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? ;
	public final BLESS3Parser.logicVariables_return logicVariables() throws RecognitionException {
		BLESS3Parser.logicVariables_return retval = new BLESS3Parser.logicVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA83=null;
		Token COMMA84=null;
		List<Object> list_lv=null;
		RuleReturnScope lv = null;
		BAST COMMA83_tree=null;
		BAST COMMA84_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:914:15: (lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:3: lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_logicVariables5257);
			lv=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

			if (list_lv==null) list_lv=new ArrayList<Object>();
			list_lv.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:16: ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==COMMA) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:18: COMMA ^lv+= variable ( COMMA !lv+= variable )*
					{
					COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5261); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA83_tree = (BAST)adaptor.create(COMMA83);
					root_0 = (BAST)adaptor.becomeRoot(COMMA83_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_logicVariables5266);
					lv=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:38: ( COMMA !lv+= variable )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==COMMA) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:915:40: COMMA !lv+= variable
							{
							COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5270); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_logicVariables5275);
							lv=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv.getTree());
							}
							break;

						default :
							break loop54;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:918:1: disjunction : l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? ;
	public final BLESS3Parser.disjunction_return disjunction() throws RecognitionException {
		BLESS3Parser.disjunction_return retval = new BLESS3Parser.disjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or85=null;
		Token LITERAL_or86=null;
		Token LITERAL_or87=null;
		Token LITERAL_else88=null;
		Token LITERAL_or89=null;
		Token LITERAL_else90=null;
		Token LITERAL_xor91=null;
		Token LITERAL_xor92=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_or85_tree=null;
		BAST LITERAL_or86_tree=null;
		BAST LITERAL_or87_tree=null;
		BAST LITERAL_else88_tree=null;
		BAST LITERAL_or89_tree=null;
		BAST LITERAL_else90_tree=null;
		BAST LITERAL_xor91_tree=null;
		BAST LITERAL_xor92_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:918:12: (l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:3: l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_conjunction_in_disjunction5297);
			l=conjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:920:6: ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			int alt59=4;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==LITERAL_or) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==LITERAL_else) ) {
					alt59=2;
				}
				else if ( (LA59_1==AADL_STRING_LITERAL||LA59_1==ID||LA59_1==LBRACKET||LA59_1==LITERAL_abs||LA59_1==LITERAL_false||(LA59_1 >= LITERAL_not && LA59_1 <= LITERAL_null)||LA59_1==LITERAL_round||LA59_1==LITERAL_self||LA59_1==LITERAL_timeout||LA59_1==LITERAL_tops||(LA59_1 >= LITERAL_true && LA59_1 <= LITERAL_truncate)||LA59_1==LPAREN||LA59_1==MINUS||LA59_1==NUMBER||LA59_1==OCTOTHORPE) ) {
					alt59=1;
				}
			}
			else if ( (LA59_0==LITERAL_xor) ) {
				alt59=3;
			}
			switch (alt59) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:8: LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )*
					{
					LITERAL_or85=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5314); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or85_tree = (BAST)adaptor.create(LITERAL_or85);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or85_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5319);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:35: ( LITERAL_or !r+= conjunction )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==LITERAL_or) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:37: LITERAL_or !r+= conjunction
							{
							LITERAL_or86=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5323); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5328);
							r=conjunction();
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:8: LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					{
					LITERAL_or87=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5349); if (state.failed) return retval;
					LITERAL_else88=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5352); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else88_tree = (BAST)adaptor.create(LITERAL_else88);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_else88_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5357);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:49: ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==LITERAL_or) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:923:51: LITERAL_or ! LITERAL_else !r+= conjunction
							{
							LITERAL_or89=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5361); if (state.failed) return retval;
							LITERAL_else90=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5364); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5369);
							r=conjunction();
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
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:8: LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )*
					{
					LITERAL_xor91=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5390); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor91_tree = (BAST)adaptor.create(LITERAL_xor91);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_xor91_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5395);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:36: ( LITERAL_xor !r+= conjunction )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==LITERAL_xor) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:38: LITERAL_xor !r+= conjunction
							{
							LITERAL_xor92=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5399); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5404);
							r=conjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop58;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:929:1: conjunction : l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? ;
	public final BLESS3Parser.conjunction_return conjunction() throws RecognitionException {
		BLESS3Parser.conjunction_return retval = new BLESS3Parser.conjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and93=null;
		Token LITERAL_and94=null;
		Token LITERAL_and95=null;
		Token LITERAL_then96=null;
		Token LITERAL_and97=null;
		Token LITERAL_then98=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_and93_tree=null;
		BAST LITERAL_and94_tree=null;
		BAST LITERAL_and95_tree=null;
		BAST LITERAL_then96_tree=null;
		BAST LITERAL_and97_tree=null;
		BAST LITERAL_then98_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:929:12: (l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:3: l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_relation_in_conjunction5428);
			l=relation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:5: ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			int alt62=3;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==LITERAL_and) ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1==LITERAL_then) ) {
					alt62=2;
				}
				else if ( (LA62_1==AADL_STRING_LITERAL||LA62_1==ID||LA62_1==LBRACKET||LA62_1==LITERAL_abs||LA62_1==LITERAL_false||(LA62_1 >= LITERAL_not && LA62_1 <= LITERAL_null)||LA62_1==LITERAL_round||LA62_1==LITERAL_self||LA62_1==LITERAL_timeout||LA62_1==LITERAL_tops||(LA62_1 >= LITERAL_true && LA62_1 <= LITERAL_truncate)||LA62_1==LPAREN||LA62_1==MINUS||LA62_1==NUMBER||LA62_1==OCTOTHORPE) ) {
					alt62=1;
				}
			}
			switch (alt62) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:9: LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )*
					{
					LITERAL_and93=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and93_tree = (BAST)adaptor.create(LITERAL_and93);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and93_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5443);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:34: ( LITERAL_and !r+= relation )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==LITERAL_and) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:931:36: LITERAL_and !r+= relation
							{
							LITERAL_and94=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5447); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5452);
							r=relation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:9: LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )*
					{
					LITERAL_and95=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5467); if (state.failed) return retval;
					LITERAL_then96=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5470); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then96_tree = (BAST)adaptor.create(LITERAL_then96);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_then96_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5475);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:48: ( LITERAL_and ! LITERAL_then !r+= relation )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==LITERAL_and) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:50: LITERAL_and ! LITERAL_then !r+= relation
							{
							LITERAL_and97=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5479); if (state.failed) return retval;
							LITERAL_then98=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5482); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5487);
							r=relation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTree());
							}
							break;

						default :
							break loop61;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:1: relation : addSub ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )? ;
	public final BLESS3Parser.relation_return relation() throws RecognitionException {
		BLESS3Parser.relation_return retval = new BLESS3Parser.relation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_in102=null;
		ParserRuleReturnScope addSub99 =null;
		ParserRuleReturnScope relationSymbol100 =null;
		ParserRuleReturnScope addSub101 =null;
		ParserRuleReturnScope range103 =null;

		BAST LITERAL_in102_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:9: ( addSub ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:937:2: addSub ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_addSub_in_relation5508);
			addSub99=addSub();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub99.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:938:2: ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			int alt63=3;
			int LA63_0 = input.LA(1);
			if ( ((LA63_0 >= AL && LA63_0 <= AM)||LA63_0==EQ||LA63_0==GT||LA63_0==LT||LA63_0==NEQ||LA63_0==OLD_NEQ||LA63_0==PLUS_EQUALS) ) {
				alt63=1;
			}
			else if ( (LA63_0==LITERAL_in) ) {
				alt63=2;
			}
			switch (alt63) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:4: ( relationSymbol ^ addSub )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:4: ( relationSymbol ^ addSub )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:6: relationSymbol ^ addSub
					{
					pushFollow(FOLLOW_relationSymbol_in_relation5518);
					relationSymbol100=relationSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(relationSymbol100.getTree(), root_0);
					pushFollow(FOLLOW_addSub_in_relation5521);
					addSub101=addSub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub101.getTree());

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:4: ( LITERAL_in ^ range )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:4: ( LITERAL_in ^ range )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:6: LITERAL_in ^ range
					{
					LITERAL_in102=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation5535); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_in102_tree = (BAST)adaptor.create(LITERAL_in102);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_in102_tree, root_0);
					}

					pushFollow(FOLLOW_range_in_relation5538);
					range103=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, range103.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:945:1: range : subexpression rangeSymbol ^ subexpression ;
	public final BLESS3Parser.range_return range() throws RecognitionException {
		BLESS3Parser.range_return retval = new BLESS3Parser.range_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope subexpression104 =null;
		ParserRuleReturnScope rangeSymbol105 =null;
		ParserRuleReturnScope subexpression106 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:945:6: ( subexpression rangeSymbol ^ subexpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:945:8: subexpression rangeSymbol ^ subexpression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_range5553);
			subexpression104=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression104.getTree());

			pushFollow(FOLLOW_rangeSymbol_in_range5555);
			rangeSymbol105=rangeSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(rangeSymbol105.getTree(), root_0);
			pushFollow(FOLLOW_subexpression_in_range5558);
			subexpression106=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression106.getTree());

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


	public static class addSub_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "addSub"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:1: addSub : multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? ;
	public final BLESS3Parser.addSub_return addSub() throws RecognitionException {
		BLESS3Parser.addSub_return retval = new BLESS3Parser.addSub_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token PLUS108=null;
		Token PLUS110=null;
		Token MINUS112=null;
		ParserRuleReturnScope multDiv107 =null;
		ParserRuleReturnScope multDiv109 =null;
		ParserRuleReturnScope multDiv111 =null;
		ParserRuleReturnScope multDiv113 =null;

		BAST PLUS108_tree=null;
		BAST PLUS110_tree=null;
		BAST MINUS112_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:7: ( multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:948:3: multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_multDiv_in_addSub5568);
			multDiv107=multDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv107.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:949:3: ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			int alt65=3;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==PLUS) ) {
				alt65=1;
			}
			else if ( (LA65_0==MINUS) ) {
				alt65=2;
			}
			switch (alt65) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:7: PLUS ^ multDiv ( PLUS ! multDiv )*
					{
					PLUS108=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5580); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS108_tree = (BAST)adaptor.create(PLUS108);
					root_0 = (BAST)adaptor.becomeRoot(PLUS108_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5583);
					multDiv109=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv109.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:21: ( PLUS ! multDiv )*
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==PLUS) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:950:23: PLUS ! multDiv
							{
							PLUS110=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5587); if (state.failed) return retval;
							pushFollow(FOLLOW_multDiv_in_addSub5590);
							multDiv111=multDiv();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv111.getTree());

							}
							break;

						default :
							break loop64;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:952:5: ( MINUS ^ multDiv )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:952:5: ( MINUS ^ multDiv )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:952:7: MINUS ^ multDiv
					{
					MINUS112=(Token)match(input,MINUS,FOLLOW_MINUS_in_addSub5609); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS112_tree = (BAST)adaptor.create(MINUS112);
					root_0 = (BAST)adaptor.becomeRoot(MINUS112_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5612);
					multDiv113=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv113.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:956:1: multDiv : exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? ;
	public final BLESS3Parser.multDiv_return multDiv() throws RecognitionException {
		BLESS3Parser.multDiv_return retval = new BLESS3Parser.multDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TIMES115=null;
		Token TIMES117=null;
		ParserRuleReturnScope exponentiation114 =null;
		ParserRuleReturnScope exponentiation116 =null;
		ParserRuleReturnScope exponentiation118 =null;
		ParserRuleReturnScope dividers119 =null;
		ParserRuleReturnScope exponentiation120 =null;

		BAST TIMES115_tree=null;
		BAST TIMES117_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:956:8: ( exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:957:3: exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_exponentiation_in_multDiv5632);
			exponentiation114=exponentiation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation114.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:3: ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			int alt67=3;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==TIMES) ) {
				alt67=1;
			}
			else if ( (LA67_0==DIVIDE||LA67_0==LITERAL_div||LA67_0==LITERAL_mod||LA67_0==LITERAL_rem) ) {
				alt67=2;
			}
			switch (alt67) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:7: TIMES ^ exponentiation ( TIMES ! exponentiation )*
					{
					TIMES115=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES115_tree = (BAST)adaptor.create(TIMES115);
					root_0 = (BAST)adaptor.becomeRoot(TIMES115_tree, root_0);
					}

					pushFollow(FOLLOW_exponentiation_in_multDiv5647);
					exponentiation116=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation116.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:29: ( TIMES ! exponentiation )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==TIMES) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:31: TIMES ! exponentiation
							{
							TIMES117=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5651); if (state.failed) return retval;
							pushFollow(FOLLOW_exponentiation_in_multDiv5654);
							exponentiation118=exponentiation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation118.getTree());

							}
							break;

						default :
							break loop66;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:4: ( dividers ^ exponentiation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:4: ( dividers ^ exponentiation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:6: dividers ^ exponentiation
					{
					pushFollow(FOLLOW_dividers_in_multDiv5672);
					dividers119=dividers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(dividers119.getTree(), root_0);
					pushFollow(FOLLOW_exponentiation_in_multDiv5675);
					exponentiation120=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation120.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:965:1: dividers : ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem );
	public final BLESS3Parser.dividers_return dividers() throws RecognitionException {
		BLESS3Parser.dividers_return retval = new BLESS3Parser.dividers_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set121=null;

		BAST set121_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:965:9: ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set121=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==LITERAL_div||input.LA(1)==LITERAL_mod||input.LA(1)==LITERAL_rem ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set121));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:1: exponentiation : subexpression ( EXP ^ subexpression )? ;
	public final BLESS3Parser.exponentiation_return exponentiation() throws RecognitionException {
		BLESS3Parser.exponentiation_return retval = new BLESS3Parser.exponentiation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token EXP123=null;
		ParserRuleReturnScope subexpression122 =null;
		ParserRuleReturnScope subexpression124 =null;

		BAST EXP123_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:15: ( subexpression ( EXP ^ subexpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:968:3: subexpression ( EXP ^ subexpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_exponentiation5718);
			subexpression122=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression122.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:968:17: ( EXP ^ subexpression )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==EXP) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:968:19: EXP ^ subexpression
					{
					EXP123=(Token)match(input,EXP,FOLLOW_EXP_in_exponentiation5722); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXP123_tree = (BAST)adaptor.create(EXP123);
					root_0 = (BAST)adaptor.becomeRoot(EXP123_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_exponentiation5725);
					subexpression124=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression124.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:1: subexpression : (n= LITERAL_not te= timedExpression -> ^( $n $te) |abs= LITERAL_abs te= timedExpression -> ^( $abs $te) |trunc= LITERAL_truncate te= timedExpression -> ^( $trunc $te) |rnd= LITERAL_round te= timedExpression -> ^( $rnd $te) | MINUS te= timedExpression -> ^( UNARY_MINUS $te) |te= timedExpression -> $te);
	public final BLESS3Parser.subexpression_return subexpression() throws RecognitionException {
		BLESS3Parser.subexpression_return retval = new BLESS3Parser.subexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token n=null;
		Token abs=null;
		Token trunc=null;
		Token rnd=null;
		Token MINUS125=null;
		ParserRuleReturnScope te =null;

		BAST n_tree=null;
		BAST abs_tree=null;
		BAST trunc_tree=null;
		BAST rnd_tree=null;
		BAST MINUS125_tree=null;
		RewriteRuleTokenStream stream_LITERAL_not=new RewriteRuleTokenStream(adaptor,"token LITERAL_not");
		RewriteRuleTokenStream stream_LITERAL_round=new RewriteRuleTokenStream(adaptor,"token LITERAL_round");
		RewriteRuleTokenStream stream_LITERAL_abs=new RewriteRuleTokenStream(adaptor,"token LITERAL_abs");
		RewriteRuleTokenStream stream_LITERAL_truncate=new RewriteRuleTokenStream(adaptor,"token LITERAL_truncate");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_timedExpression=new RewriteRuleSubtreeStream(adaptor,"rule timedExpression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:14: (n= LITERAL_not te= timedExpression -> ^( $n $te) |abs= LITERAL_abs te= timedExpression -> ^( $abs $te) |trunc= LITERAL_truncate te= timedExpression -> ^( $trunc $te) |rnd= LITERAL_round te= timedExpression -> ^( $rnd $te) | MINUS te= timedExpression -> ^( UNARY_MINUS $te) |te= timedExpression -> $te)
			int alt69=6;
			switch ( input.LA(1) ) {
			case LITERAL_not:
				{
				alt69=1;
				}
				break;
			case LITERAL_abs:
				{
				alt69=2;
				}
				break;
			case LITERAL_truncate:
				{
				alt69=3;
				}
				break;
			case LITERAL_round:
				{
				alt69=4;
				}
				break;
			case MINUS:
				{
				alt69=5;
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
				{
				alt69=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:972:3: n= LITERAL_not te= timedExpression
					{
					n=(Token)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5744); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_not.add(n);

					pushFollow(FOLLOW_timedExpression_in_subexpression5748);
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
					// 973:5: -> ^( $n $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:973:8: ^( $n $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:975:3: abs= LITERAL_abs te= timedExpression
					{
					abs=(Token)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5773); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_abs.add(abs);

					pushFollow(FOLLOW_timedExpression_in_subexpression5777);
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
					// 976:5: -> ^( $abs $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:976:8: ^( $abs $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:978:3: trunc= LITERAL_truncate te= timedExpression
					{
					trunc=(Token)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5802); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_truncate.add(trunc);

					pushFollow(FOLLOW_timedExpression_in_subexpression5806);
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
					// 979:5: -> ^( $trunc $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:979:8: ^( $trunc $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:981:3: rnd= LITERAL_round te= timedExpression
					{
					rnd=(Token)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5831); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_round.add(rnd);

					pushFollow(FOLLOW_timedExpression_in_subexpression5835);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te, rnd
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
					// 982:5: -> ^( $rnd $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:982:8: ^( $rnd $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:984:2: MINUS te= timedExpression
					{
					MINUS125=(Token)match(input,MINUS,FOLLOW_MINUS_in_subexpression5857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS125);

					pushFollow(FOLLOW_timedExpression_in_subexpression5861);
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
					// 985:4: -> ^( UNARY_MINUS $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:985:7: ^( UNARY_MINUS $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:2: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5883);
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
					// 988:4: -> $te
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:991:1: unaryOperator : ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round );
	public final BLESS3Parser.unaryOperator_return unaryOperator() throws RecognitionException {
		BLESS3Parser.unaryOperator_return retval = new BLESS3Parser.unaryOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set126=null;

		BAST set126_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:991:14: ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set126=input.LT(1);
			if ( input.LA(1)==LITERAL_abs||input.LA(1)==LITERAL_not||input.LA(1)==LITERAL_round||input.LA(1)==LITERAL_truncate ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set126));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:1: timedExpression : timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? ;
	public final BLESS3Parser.timedExpression_return timedExpression() throws RecognitionException {
		BLESS3Parser.timedExpression_return retval = new BLESS3Parser.timedExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AT_SIGN128=null;
		Token TICK130=null;
		Token CARET131=null;
		ParserRuleReturnScope timedSubject127 =null;
		ParserRuleReturnScope subexpression129 =null;
		ParserRuleReturnScope periodShift132 =null;

		BAST AT_SIGN128_tree=null;
		BAST TICK130_tree=null;
		BAST CARET131_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:16: ( timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:3: timedSubject ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_timedSubject_in_timedExpression5924);
			timedSubject127=timedSubject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, timedSubject127.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:997:3: ( AT_SIGN ^ subexpression | TICK | CARET ^ periodShift )?
			int alt70=4;
			switch ( input.LA(1) ) {
				case AT_SIGN:
					{
					alt70=1;
					}
					break;
				case TICK:
					{
					alt70=2;
					}
					break;
				case CARET:
					{
					alt70=3;
					}
					break;
			}
			switch (alt70) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:3: AT_SIGN ^ subexpression
					{
					AT_SIGN128=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5932); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_SIGN128_tree = (BAST)adaptor.create(AT_SIGN128);
					root_0 = (BAST)adaptor.becomeRoot(AT_SIGN128_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_timedExpression5935);
					subexpression129=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression129.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:999:5: TICK
					{
					TICK130=(Token)match(input,TICK,FOLLOW_TICK_in_timedExpression5941); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK130_tree = (BAST)adaptor.create(TICK130);
					adaptor.addChild(root_0, TICK130_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1000:5: CARET ^ periodShift
					{
					CARET131=(Token)match(input,CARET,FOLLOW_CARET_in_timedExpression5947); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CARET131_tree = (BAST)adaptor.create(CARET131);
					root_0 = (BAST)adaptor.becomeRoot(CARET131_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_timedExpression5950);
					periodShift132=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift132.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:1: timedSubject : ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value );
	public final BLESS3Parser.timedSubject_return timedSubject() throws RecognitionException {
		BLESS3Parser.timedSubject_return retval = new BLESS3Parser.timedSubject_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalExpression133 =null;
		ParserRuleReturnScope parenthesizedSubexpression134 =null;
		ParserRuleReturnScope recordTerm135 =null;
		ParserRuleReturnScope invocation136 =null;
		ParserRuleReturnScope value137 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:13: ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value )
			int alt71=5;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==LPAREN) ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1==LITERAL_if) && (synpred116_BLESS3())) {
					alt71=1;
				}
				else if ( (LA71_1==AADL_STRING_LITERAL||LA71_1==ID||LA71_1==LBRACKET||LA71_1==LITERAL_abs||LA71_1==LITERAL_all||LA71_1==LITERAL_case||LA71_1==LITERAL_exists||LA71_1==LITERAL_false||(LA71_1 >= LITERAL_not && LA71_1 <= LITERAL_numberof)||LA71_1==LITERAL_product||LA71_1==LITERAL_round||LA71_1==LITERAL_self||LA71_1==LITERAL_sum||LA71_1==LITERAL_timeout||LA71_1==LITERAL_tops||(LA71_1 >= LITERAL_true && LA71_1 <= LITERAL_truncate)||LA71_1==LPAREN||LA71_1==MINUS||LA71_1==NUMBER||LA71_1==OCTOTHORPE) ) {
					alt71=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==LBRACKET) && (synpred118_BLESS3())) {
				alt71=3;
			}
			else if ( (LA71_0==ID) ) {
				int LA71_3 = input.LA(2);
				if ( (LA71_3==LPAREN) && (synpred119_BLESS3())) {
					alt71=4;
				}
				else if ( (LA71_3==EOF||(LA71_3 >= AL && LA71_3 <= AMPERSAND)||LA71_3==AT_SIGN||(LA71_3 >= BOX && LA71_3 <= COLON)||(LA71_3 >= COMMA && LA71_3 <= COMMADOT)||LA71_3==CVP||(LA71_3 >= DIVIDE && LA71_3 <= DOUBLE_COLON)||LA71_3==EQ||LA71_3==EXP||(LA71_3 >= GT && LA71_3 <= GUARD)||(LA71_3 >= ID && LA71_3 <= IMP)||(LA71_3 >= LASS && LA71_3 <= LBRACKET)||LA71_3==LCURLY||LA71_3==LITERAL_and||LA71_3==LITERAL_are||LA71_3==LITERAL_computation||LA71_3==LITERAL_declare||(LA71_3 >= LITERAL_div && LA71_3 <= LITERAL_else)||LA71_3==LITERAL_exception||(LA71_3 >= LITERAL_fetchadd && LA71_3 <= LITERAL_fi)||(LA71_3 >= LITERAL_for && LA71_3 <= LITERAL_forall)||(LA71_3 >= LITERAL_if && LA71_3 <= LITERAL_iff)||(LA71_3 >= LITERAL_implies && LA71_3 <= LITERAL_in)||LA71_3==LITERAL_invariant||LA71_3==LITERAL_mod||LA71_3==LITERAL_of||LA71_3==LITERAL_or||LA71_3==LITERAL_rem||LA71_3==LITERAL_setmode||LA71_3==LITERAL_skip||LA71_3==LITERAL_states||(LA71_3 >= LITERAL_swap && LA71_3 <= LITERAL_then)||LA71_3==LITERAL_transitions||LA71_3==LITERAL_until||LA71_3==LITERAL_when||LA71_3==LITERAL_while||LA71_3==LITERAL_xor||LA71_3==LT||LA71_3==MINUS||LA71_3==NEQ||(LA71_3 >= OCTOTHORPE && LA71_3 <= OLD_NEQ)||LA71_3==PLUS||LA71_3==PLUS_EQUALS||LA71_3==QQ||(LA71_3 >= QUESTION && LA71_3 <= RCURLY)||LA71_3==RPAREN||LA71_3==SEMICOLON||LA71_3==TICK||LA71_3==TIMES||LA71_3==VERT) ) {
					alt71=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA71_0==AADL_STRING_LITERAL||LA71_0==LITERAL_false||(LA71_0 >= LITERAL_now && LA71_0 <= LITERAL_null)||LA71_0==LITERAL_self||LA71_0==LITERAL_timeout||LA71_0==LITERAL_tops||LA71_0==LITERAL_true||LA71_0==NUMBER||LA71_0==OCTOTHORPE) ) {
				alt71=5;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:3: ( LPAREN LITERAL_if )=> conditionalExpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5975);
					conditionalExpression133=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression133.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1006:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5981);
					parenthesizedSubexpression134=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression134.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1007:5: ( LBRACKET ID COLON )=> recordTerm
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordTerm_in_timedSubject5998);
					recordTerm135=recordTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordTerm135.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1008:5: ( ID LPAREN )=> invocation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_invocation_in_timedSubject6011);
					invocation136=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, invocation136.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1009:5: value
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_value_in_timedSubject6019);
					value137=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value137.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1012:1: parenthesizedSubexpression : LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN ;
	public final BLESS3Parser.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		BLESS3Parser.parenthesizedSubexpression_return retval = new BLESS3Parser.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN138=null;
		Token QQ140=null;
		Token COLON142=null;
		Token RPAREN144=null;
		ParserRuleReturnScope caseexpression =null;
		ParserRuleReturnScope expression139 =null;
		ParserRuleReturnScope expression141 =null;
		ParserRuleReturnScope expression143 =null;

		BAST LPAREN138_tree=null;
		BAST QQ140_tree=null;
		BAST COLON142_tree=null;
		BAST RPAREN144_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1012:27: ( LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1013:2: LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6030); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN138_tree = (BAST)adaptor.create(LPAREN138);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN138_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:2: ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==AADL_STRING_LITERAL||LA73_0==ID||LA73_0==LBRACKET||LA73_0==LITERAL_abs||LA73_0==LITERAL_all||LA73_0==LITERAL_exists||LA73_0==LITERAL_false||(LA73_0 >= LITERAL_not && LA73_0 <= LITERAL_numberof)||LA73_0==LITERAL_product||LA73_0==LITERAL_round||LA73_0==LITERAL_self||LA73_0==LITERAL_sum||LA73_0==LITERAL_timeout||LA73_0==LITERAL_tops||(LA73_0 >= LITERAL_true && LA73_0 <= LITERAL_truncate)||LA73_0==LPAREN||LA73_0==MINUS||LA73_0==NUMBER||LA73_0==OCTOTHORPE) ) {
				alt73=1;
			}
			else if ( (LA73_0==LITERAL_case) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:4: ( expression ( QQ ^ expression COLON ! expression )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:4: ( expression ( QQ ^ expression COLON ! expression )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:6: expression ( QQ ^ expression COLON ! expression )?
					{
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6043);
					expression139=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression139.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:17: ( QQ ^ expression COLON ! expression )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==QQ) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1015:19: QQ ^ expression COLON ! expression
							{
							QQ140=(Token)match(input,QQ,FOLLOW_QQ_in_parenthesizedSubexpression6047); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							QQ140_tree = (BAST)adaptor.create(QQ140);
							root_0 = (BAST)adaptor.becomeRoot(QQ140_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6050);
							expression141=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression141.getTree());

							COLON142=(Token)match(input,COLON,FOLLOW_COLON_in_parenthesizedSubexpression6052); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6055);
							expression143=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1017:4: caseexpression= caseExpression
					{
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6073);
					caseexpression=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseexpression.getTree());

					}
					break;

			}

			RPAREN144=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6081); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN144_tree = (BAST)adaptor.create(RPAREN144);
			adaptor.addChild(root_0, RPAREN144_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1022:1: caseExpression : LITERAL_case ^ ( caseChoice )+ ;
	public final BLESS3Parser.caseExpression_return caseExpression() throws RecognitionException {
		BLESS3Parser.caseExpression_return retval = new BLESS3Parser.caseExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_case145=null;
		ParserRuleReturnScope caseChoice146 =null;

		BAST LITERAL_case145_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1022:15: ( LITERAL_case ^ ( caseChoice )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1023:3: LITERAL_case ^ ( caseChoice )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_case145=(Token)match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6091); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_case145_tree = (BAST)adaptor.create(LITERAL_case145);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_case145_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1023:17: ( caseChoice )+
			int cnt74=0;
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==LPAREN) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1023:17: caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6094);
					caseChoice146=caseChoice();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseChoice146.getTree());

					}
					break;

				default :
					if ( cnt74 >= 1 ) break loop74;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(74, input);
					throw eee;
				}
				cnt74++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1026:1: caseChoice : LPAREN !bool= expression IMP ^exp= expression RPAREN !;
	public final BLESS3Parser.caseChoice_return caseChoice() throws RecognitionException {
		BLESS3Parser.caseChoice_return retval = new BLESS3Parser.caseChoice_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN147=null;
		Token IMP148=null;
		Token RPAREN149=null;
		ParserRuleReturnScope bool =null;
		ParserRuleReturnScope exp =null;

		BAST LPAREN147_tree=null;
		BAST IMP148_tree=null;
		BAST RPAREN149_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1027:3: ( LPAREN !bool= expression IMP ^exp= expression RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1028:3: LPAREN !bool= expression IMP ^exp= expression RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN147=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_caseChoice6110); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseChoice6115);
			bool=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

			IMP148=(Token)match(input,IMP,FOLLOW_IMP_in_caseChoice6117); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP148_tree = (BAST)adaptor.create(IMP148);
			root_0 = (BAST)adaptor.becomeRoot(IMP148_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_caseChoice6122);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN149=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_caseChoice6124); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:1: conditionalExpression : lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) ;
	public final BLESS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		BLESS3Parser.conditionalExpression_return retval = new BLESS3Parser.conditionalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lp=null;
		Token rp=null;
		Token LITERAL_if150=null;
		Token LITERAL_then151=null;
		Token LITERAL_else152=null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope f =null;

		BAST lp_tree=null;
		BAST rp_tree=null;
		BAST LITERAL_if150_tree=null;
		BAST LITERAL_then151_tree=null;
		BAST LITERAL_else152_tree=null;
		RewriteRuleTokenStream stream_LITERAL_else=new RewriteRuleTokenStream(adaptor,"token LITERAL_else");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LITERAL_then=new RewriteRuleTokenStream(adaptor,"token LITERAL_then");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:22: (lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ $pred $t $f) $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1032:3: lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression6140); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			LITERAL_if150=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_conditionalExpression6142); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(LITERAL_if150);

			pushFollow(FOLLOW_expression_in_conditionalExpression6146);
			pred=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(pred.getTree());
			LITERAL_then151=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conditionalExpression6148); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_then.add(LITERAL_then151);

			pushFollow(FOLLOW_expression_in_conditionalExpression6152);
			t=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(t.getTree());
			LITERAL_else152=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_conditionalExpression6154); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_else.add(LITERAL_else152);

			pushFollow(FOLLOW_expression_in_conditionalExpression6158);
			f=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(f.getTree());
			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression6162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: lp, rp, t, pred, f
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
			// 1033:5: -> ^( $lp ^( QQ $pred $t $f) $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1033:8: ^( $lp ^( QQ $pred $t $f) $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1033:15: ^( QQ $pred $t $f)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:1: recordTerm : LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) ;
	public final BLESS3Parser.recordTerm_return recordTerm() throws RecognitionException {
		BLESS3Parser.recordTerm_return retval = new BLESS3Parser.recordTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token typeid=null;
		Token LBRACKET153=null;
		Token COLON154=null;
		Token RBRACKET155=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		BAST typeid_tree=null;
		BAST LBRACKET153_tree=null;
		BAST COLON154_tree=null;
		BAST RBRACKET155_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_recordValue=new RewriteRuleSubtreeStream(adaptor,"rule recordValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1037:3: ( LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM $typeid ( $prv)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:3: LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET
			{
			LBRACKET153=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_recordTerm6208); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET153);

			typeid=(Token)match(input,ID,FOLLOW_ID_in_recordTerm6212); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(typeid);

			COLON154=(Token)match(input,COLON,FOLLOW_COLON_in_recordTerm6214); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON154);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:31: (prv+= recordValue )+
			int cnt75=0;
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==ID) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6218);
					prv=recordValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_recordValue.add(prv.getTree());
					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTree());
					}
					break;

				default :
					if ( cnt75 >= 1 ) break loop75;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(75, input);
					throw eee;
				}
				cnt75++;
			}

			RBRACKET155=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_recordTerm6221); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET155);

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
			// 1039:5: -> ^( RECORD_TERM $typeid ( $prv)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1039:8: ^( RECORD_TERM $typeid ( $prv)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1042:1: recordValue : identifier ARROW ^ value ( SEMICOLON !)? ;
	public final BLESS3Parser.recordValue_return recordValue() throws RecognitionException {
		BLESS3Parser.recordValue_return retval = new BLESS3Parser.recordValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ARROW157=null;
		Token SEMICOLON159=null;
		ParserRuleReturnScope identifier156 =null;
		ParserRuleReturnScope value158 =null;

		BAST ARROW157_tree=null;
		BAST SEMICOLON159_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:3: ( identifier ARROW ^ value ( SEMICOLON !)? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1044:20: identifier ARROW ^ value ( SEMICOLON !)?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_recordValue6257);
			identifier156=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier156.getTree());

			ARROW157=(Token)match(input,ARROW,FOLLOW_ARROW_in_recordValue6259); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARROW157_tree = (BAST)adaptor.create(ARROW157);
			root_0 = (BAST)adaptor.becomeRoot(ARROW157_tree, root_0);
			}

			pushFollow(FOLLOW_value_in_recordValue6262);
			value158=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value158.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1044:44: ( SEMICOLON !)?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==SEMICOLON) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1044:46: SEMICOLON !
					{
					SEMICOLON159=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordValue6266); if (state.failed) return retval;
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
	// $ANTLR end "recordValue"


	public static class periodShift_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "periodShift"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1047:1: periodShift : (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1047:12: ( (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:2: (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:2: (m= MINUS )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==MINUS) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:4: m= MINUS
					{
					m=(Token)match(input,MINUS,FOLLOW_MINUS_in_periodShift6289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(m);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1049:2: (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==AADL_STRING_LITERAL||LA78_0==ID||LA78_0==LITERAL_false||(LA78_0 >= LITERAL_now && LA78_0 <= LITERAL_null)||LA78_0==LITERAL_self||LA78_0==LITERAL_timeout||LA78_0==LITERAL_tops||LA78_0==LITERAL_true||LA78_0==NUMBER||LA78_0==OCTOTHORPE) ) {
				alt78=1;
			}
			else if ( (LA78_0==LPAREN) ) {
				alt78=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1050:4: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift6302);
					v=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(v.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:5: lp= LPAREN ie= indexExpression rp= RPAREN
					{
					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_periodShift6316); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					pushFollow(FOLLOW_indexExpression_in_periodShift6320);
					ie=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpression.add(ie.getTree());
					rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_periodShift6324); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(rp);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: v, lp, rp, lp, rp, v, ie, ie
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
			// 1054:2: -> {m!=null&&v!=null}? ^( UNARY_MINUS $v)
			if (m!=null&&v!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:25: ^( UNARY_MINUS $v)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1055:2: -> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp) )
			if (m!=null&&ie!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1055:26: ^( UNARY_MINUS ^( $lp $ie $rp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, "UNARY_MINUS"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1055:41: ^( $lp $ie $rp)
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

			else // 1056:2: -> {m==null&&v!=null}? $v
			if (m==null&&v!=null) {
				adaptor.addChild(root_0, stream_v.nextTree());
			}

			else // 1057:2: -> ^( $lp $ie $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1057:5: ^( $lp $ie $rp)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:1: indexExpression : periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? ;
	public final BLESS3Parser.indexExpression_return indexExpression() throws RecognitionException {
		BLESS3Parser.indexExpression_return retval = new BLESS3Parser.indexExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS161=null;
		Token LITERAL_div163=null;
		Token LITERAL_mod165=null;
		Token LITERAL_rem167=null;
		Token PLUS169=null;
		Token PLUS171=null;
		Token TIMES173=null;
		Token TIMES175=null;
		ParserRuleReturnScope periodShift160 =null;
		ParserRuleReturnScope periodShift162 =null;
		ParserRuleReturnScope periodShift164 =null;
		ParserRuleReturnScope periodShift166 =null;
		ParserRuleReturnScope periodShift168 =null;
		ParserRuleReturnScope periodShift170 =null;
		ParserRuleReturnScope periodShift172 =null;
		ParserRuleReturnScope periodShift174 =null;
		ParserRuleReturnScope periodShift176 =null;

		BAST MINUS161_tree=null;
		BAST LITERAL_div163_tree=null;
		BAST LITERAL_mod165_tree=null;
		BAST LITERAL_rem167_tree=null;
		BAST PLUS169_tree=null;
		BAST PLUS171_tree=null;
		BAST TIMES173_tree=null;
		BAST TIMES175_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1060:16: ( periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1061:2: periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_periodShift_in_indexExpression6404);
			periodShift160=periodShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift160.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1062:2: ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			int alt81=7;
			switch ( input.LA(1) ) {
				case MINUS:
					{
					alt81=1;
					}
					break;
				case LITERAL_div:
					{
					alt81=2;
					}
					break;
				case LITERAL_mod:
					{
					alt81=3;
					}
					break;
				case LITERAL_rem:
					{
					alt81=4;
					}
					break;
				case PLUS:
					{
					alt81=5;
					}
					break;
				case TIMES:
					{
					alt81=6;
					}
					break;
			}
			switch (alt81) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1063:4: MINUS ^ periodShift
					{
					MINUS161=(Token)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6412); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS161_tree = (BAST)adaptor.create(MINUS161);
					root_0 = (BAST)adaptor.becomeRoot(MINUS161_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6415);
					periodShift162=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift162.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1065:4: LITERAL_div ^ periodShift
					{
					LITERAL_div163=(Token)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6425); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_div163_tree = (BAST)adaptor.create(LITERAL_div163);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_div163_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6428);
					periodShift164=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift164.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1067:4: LITERAL_mod ^ periodShift
					{
					LITERAL_mod165=(Token)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_mod165_tree = (BAST)adaptor.create(LITERAL_mod165);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_mod165_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6441);
					periodShift166=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift166.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1069:4: LITERAL_rem ^ periodShift
					{
					LITERAL_rem167=(Token)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6451); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_rem167_tree = (BAST)adaptor.create(LITERAL_rem167);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_rem167_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6454);
					periodShift168=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift168.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:4: PLUS ^ periodShift ( PLUS ! periodShift )*
					{
					PLUS169=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6464); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS169_tree = (BAST)adaptor.create(PLUS169);
					root_0 = (BAST)adaptor.becomeRoot(PLUS169_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6467);
					periodShift170=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift170.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:22: ( PLUS ! periodShift )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==PLUS) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:24: PLUS ! periodShift
							{
							PLUS171=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6471); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6474);
							periodShift172=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift172.getTree());

							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1073:4: TIMES ^ periodShift ( TIMES ! periodShift )*
					{
					TIMES173=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6487); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES173_tree = (BAST)adaptor.create(TIMES173);
					root_0 = (BAST)adaptor.becomeRoot(TIMES173_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6490);
					periodShift174=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift174.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1073:23: ( TIMES ! periodShift )*
					loop80:
					while (true) {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==TIMES) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1073:25: TIMES ! periodShift
							{
							TIMES175=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6494); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6497);
							periodShift176=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift176.getTree());

							}
							break;

						default :
							break loop80;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1077:1: indexExpressionOrRange : indexExpression ( DOTDOT ^ indexExpression )? ;
	public final BLESS3Parser.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		BLESS3Parser.indexExpressionOrRange_return retval = new BLESS3Parser.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT178=null;
		ParserRuleReturnScope indexExpression177 =null;
		ParserRuleReturnScope indexExpression179 =null;

		BAST DOTDOT178_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1077:23: ( indexExpression ( DOTDOT ^ indexExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:2: indexExpression ( DOTDOT ^ indexExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6514);
			indexExpression177=indexExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression177.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:18: ( DOTDOT ^ indexExpression )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==DOTDOT) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:20: DOTDOT ^ indexExpression
					{
					DOTDOT178=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6518); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT178_tree = (BAST)adaptor.create(DOTDOT178);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT178_tree, root_0);
					}

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6521);
					indexExpression179=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression179.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:1: value : ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue );
	public final BLESS3Parser.value_return value() throws RecognitionException {
		BLESS3Parser.value_return retval = new BLESS3Parser.value_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout182=null;
		Token LITERAL_now183=null;
		Token LITERAL_tops184=null;
		ParserRuleReturnScope valueName180 =null;
		ParserRuleReturnScope constant181 =null;
		ParserRuleReturnScope enumerationValue185 =null;

		BAST LITERAL_timeout182_tree=null;
		BAST LITERAL_now183_tree=null;
		BAST LITERAL_tops184_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:6: ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue )
			int alt83=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case DOUBLE_COLON:
				case OCTOTHORPE:
					{
					alt83=2;
					}
					break;
				case TICK:
					{
					int LA83_6 = input.LA(3);
					if ( (LA83_6==ID) ) {
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
							alt83=1;
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
							alt83=6;
							}
							break;
						case TICK:
							{
							int LA83_12 = input.LA(5);
							if ( (LA83_12==ASSIGN||LA83_12==LITERAL_count||LA83_12==LITERAL_fresh||LA83_12==LITERAL_updated) ) {
								alt83=1;
							}
							else if ( (LA83_12==EOF||(LA83_12 >= AL && LA83_12 <= AMPERSAND)||LA83_12==BOX||LA83_12==COLON||(LA83_12 >= COMMA && LA83_12 <= COMMADOT)||LA83_12==CVP||LA83_12==DIVIDE||(LA83_12 >= DOTCOMMA && LA83_12 <= DOTDOT)||LA83_12==EQ||LA83_12==EXP||(LA83_12 >= GT && LA83_12 <= GUARD)||(LA83_12 >= ID && LA83_12 <= IMP)||LA83_12==LASS||LA83_12==LCURLY||LA83_12==LITERAL_and||LA83_12==LITERAL_are||LA83_12==LITERAL_computation||LA83_12==LITERAL_declare||(LA83_12 >= LITERAL_div && LA83_12 <= LITERAL_else)||LA83_12==LITERAL_exception||(LA83_12 >= LITERAL_fetchadd && LA83_12 <= LITERAL_fi)||(LA83_12 >= LITERAL_for && LA83_12 <= LITERAL_forall)||(LA83_12 >= LITERAL_if && LA83_12 <= LITERAL_iff)||(LA83_12 >= LITERAL_implies && LA83_12 <= LITERAL_in)||LA83_12==LITERAL_invariant||LA83_12==LITERAL_mod||LA83_12==LITERAL_of||LA83_12==LITERAL_or||LA83_12==LITERAL_rem||LA83_12==LITERAL_setmode||LA83_12==LITERAL_skip||LA83_12==LITERAL_states||(LA83_12 >= LITERAL_swap && LA83_12 <= LITERAL_then)||LA83_12==LITERAL_transitions||LA83_12==LITERAL_until||LA83_12==LITERAL_when||LA83_12==LITERAL_while||LA83_12==LITERAL_xor||LA83_12==LT||LA83_12==MINUS||LA83_12==NEQ||LA83_12==OLD_NEQ||LA83_12==PLUS||LA83_12==PLUS_EQUALS||LA83_12==QQ||(LA83_12 >= RASS && LA83_12 <= RCURLY)||LA83_12==RPAREN||LA83_12==SEMICOLON||LA83_12==TIMES||LA83_12==VERT) ) {
								alt83=6;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 83, 12, input);
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
									new NoViableAltException("", 83, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA83_6==EOF||(LA83_6 >= AL && LA83_6 <= AMPERSAND)||LA83_6==BOX||LA83_6==COLON||(LA83_6 >= COMMA && LA83_6 <= COMMADOT)||LA83_6==CVP||LA83_6==DIVIDE||(LA83_6 >= DOTCOMMA && LA83_6 <= DOTDOT)||LA83_6==EQ||LA83_6==EXP||(LA83_6 >= GT && LA83_6 <= GUARD)||LA83_6==IMP||LA83_6==LASS||LA83_6==LCURLY||LA83_6==LITERAL_and||LA83_6==LITERAL_are||LA83_6==LITERAL_computation||(LA83_6 >= LITERAL_count && LA83_6 <= LITERAL_declare)||(LA83_6 >= LITERAL_div && LA83_6 <= LITERAL_else)||LA83_6==LITERAL_exception||(LA83_6 >= LITERAL_fetchadd && LA83_6 <= LITERAL_fi)||(LA83_6 >= LITERAL_for && LA83_6 <= LITERAL_fresh)||(LA83_6 >= LITERAL_if && LA83_6 <= LITERAL_iff)||(LA83_6 >= LITERAL_implies && LA83_6 <= LITERAL_in)||LA83_6==LITERAL_invariant||LA83_6==LITERAL_mod||LA83_6==LITERAL_of||LA83_6==LITERAL_or||LA83_6==LITERAL_rem||LA83_6==LITERAL_setmode||LA83_6==LITERAL_skip||LA83_6==LITERAL_states||(LA83_6 >= LITERAL_swap && LA83_6 <= LITERAL_then)||LA83_6==LITERAL_transitions||(LA83_6 >= LITERAL_until && LA83_6 <= LITERAL_updated)||LA83_6==LITERAL_when||LA83_6==LITERAL_while||LA83_6==LITERAL_xor||LA83_6==LT||LA83_6==MINUS||LA83_6==NEQ||LA83_6==OLD_NEQ||LA83_6==PLUS||LA83_6==PLUS_EQUALS||LA83_6==QQ||(LA83_6 >= RASS && LA83_6 <= RCURLY)||LA83_6==RPAREN||LA83_6==SEMICOLON||LA83_6==TIMES||LA83_6==VERT) ) {
						alt83=1;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 83, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

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
				case DOLLAR:
				case DOTCOMMA:
				case DOTDOT:
				case EQ:
				case EXP:
				case GT:
				case GUARD:
				case ID:
				case IMP:
				case LASS:
				case LBRACKET:
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
				case QUESTION:
				case RASS:
				case RBRACKET:
				case RCON:
				case RCURLY:
				case RPAREN:
				case SEMICOLON:
				case TIMES:
				case VERT:
					{
					alt83=1;
					}
					break;
				case DOT:
					{
					int LA83_8 = input.LA(3);
					if ( (LA83_8==ID) ) {
						int LA83_10 = input.LA(4);
						if ( (LA83_10==OCTOTHORPE) ) {
							alt83=2;
						}
						else if ( (LA83_10==EOF||(LA83_10 >= AL && LA83_10 <= AMPERSAND)||LA83_10==AT_SIGN||(LA83_10 >= BOX && LA83_10 <= COLON)||(LA83_10 >= COMMA && LA83_10 <= COMMADOT)||LA83_10==CVP||LA83_10==DIVIDE||(LA83_10 >= DOT && LA83_10 <= DOTDOT)||LA83_10==EQ||LA83_10==EXP||(LA83_10 >= GT && LA83_10 <= GUARD)||(LA83_10 >= ID && LA83_10 <= IMP)||(LA83_10 >= LASS && LA83_10 <= LBRACKET)||LA83_10==LCURLY||LA83_10==LITERAL_and||LA83_10==LITERAL_are||LA83_10==LITERAL_computation||LA83_10==LITERAL_declare||(LA83_10 >= LITERAL_div && LA83_10 <= LITERAL_else)||LA83_10==LITERAL_exception||(LA83_10 >= LITERAL_fetchadd && LA83_10 <= LITERAL_fi)||(LA83_10 >= LITERAL_for && LA83_10 <= LITERAL_forall)||(LA83_10 >= LITERAL_if && LA83_10 <= LITERAL_iff)||(LA83_10 >= LITERAL_implies && LA83_10 <= LITERAL_in)||LA83_10==LITERAL_invariant||LA83_10==LITERAL_mod||LA83_10==LITERAL_of||LA83_10==LITERAL_or||LA83_10==LITERAL_rem||LA83_10==LITERAL_setmode||LA83_10==LITERAL_skip||LA83_10==LITERAL_states||(LA83_10 >= LITERAL_swap && LA83_10 <= LITERAL_then)||LA83_10==LITERAL_transitions||LA83_10==LITERAL_until||LA83_10==LITERAL_when||LA83_10==LITERAL_while||LA83_10==LITERAL_xor||LA83_10==LT||LA83_10==MINUS||LA83_10==NEQ||LA83_10==OLD_NEQ||LA83_10==PLUS||LA83_10==PLUS_EQUALS||LA83_10==QQ||(LA83_10 >= QUESTION && LA83_10 <= RCURLY)||LA83_10==RPAREN||LA83_10==SEMICOLON||LA83_10==TICK||LA83_10==TIMES||LA83_10==VERT) ) {
							alt83=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 83, 10, input);
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
								new NoViableAltException("", 83, 8, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 83, 1, input);
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
				{
				alt83=2;
				}
				break;
			case LITERAL_timeout:
				{
				alt83=3;
				}
				break;
			case LITERAL_now:
				{
				alt83=4;
				}
				break;
			case LITERAL_tops:
				{
				alt83=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:3: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_value6537);
					valueName180=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName180.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1086:3: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_value6545);
					constant181=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant181.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:3: LITERAL_timeout
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout182=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6553); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout182_tree = (BAST)adaptor.create(LITERAL_timeout182);
					adaptor.addChild(root_0, LITERAL_timeout182_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1090:3: LITERAL_now
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_now183=(Token)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6561); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_now183_tree = (BAST)adaptor.create(LITERAL_now183);
					adaptor.addChild(root_0, LITERAL_now183_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:3: LITERAL_tops
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_tops184=(Token)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6569); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_tops184_tree = (BAST)adaptor.create(LITERAL_tops184);
					adaptor.addChild(root_0, LITERAL_tops184_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:3: enumerationValue
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationValue_in_value6577);
					enumerationValue185=enumerationValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationValue185.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1097:1: valueName : id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id;
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
		Token RPAREN186=null;
		Token RBRACKET187=null;
		Token LBRACKET188=null;
		Token RBRACKET189=null;
		Token DOT190=null;
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
		BAST RPAREN186_tree=null;
		BAST RBRACKET187_tree=null;
		BAST LBRACKET188_tree=null;
		BAST RBRACKET189_tree=null;
		BAST DOT190_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1097:10: (id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol $pr) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1098:3: id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_valueName6592); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1100:5: (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DOLLAR) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1100:7: dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN
					{
					dol=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6606); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOLLAR.add(dol);

					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueName6610); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1100:31: (pr= functionParameters )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==ID) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1100:31: pr= functionParameters
							{
							pushFollow(FOLLOW_functionParameters_in_valueName6615);
							pr=functionParameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_functionParameters.add(pr.getTree());
							}
							break;

					}

					RPAREN186=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueName6618); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN186);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1101:4: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LBRACKET) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1101:6: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6630); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6634);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET187=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6636); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET187);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:6: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==LBRACKET) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:8: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET188=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6646); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET188);

							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6650);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET189=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6652); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET189);

							}
							break;

						default :
							break loop86;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:4: (dot= DOT pn+= partialName ( DOT pn+= partialName )* )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==DOT) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:6: dot= DOT pn+= partialName ( DOT pn+= partialName )*
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6668); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					pushFollow(FOLLOW_partialName_in_valueName6672);
					pn=partialName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
					if (list_pn==null) list_pn=new ArrayList<Object>();
					list_pn.add(pn.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:30: ( DOT pn+= partialName )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==DOT) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:32: DOT pn+= partialName
							{
							DOT190=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6676); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(DOT190);

							pushFollow(FOLLOW_partialName_in_valueName6680);
							pn=partialName();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTree());
							}
							break;

						default :
							break loop88;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:5: (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			int alt90=5;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==QUESTION) ) {
				alt90=1;
			}
			else if ( (LA90_0==TICK) ) {
				switch ( input.LA(2) ) {
					case LITERAL_fresh:
						{
						alt90=2;
						}
						break;
					case LITERAL_count:
						{
						alt90=3;
						}
						break;
					case LITERAL_updated:
						{
						alt90=4;
						}
						break;
				}
			}
			switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:8: q= QUESTION
					{
					q=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6697); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(q);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1105:7: t= TICK fresh= LITERAL_fresh
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6709); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					fresh=(Token)match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6713); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_fresh.add(fresh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1106:7: t= TICK count= LITERAL_count
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6724); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					count=(Token)match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6728); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_count.add(count);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1107:7: t= TICK updated= LITERAL_updated
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6738); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					updated=(Token)match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6742); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_updated.add(updated);

					}
					break;

			}

			// AST REWRITE
			// elements: fresh, t, pn, dot, array_index, updated, id, id, dol, DOT, id, id, q, id, lb, t, id, pn, id, array_index, t, pr, count, lb, id, dot, id
			// token labels: dol, q, t, lb, dot, count, id, fresh, updated
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
			RewriteRuleTokenStream stream_dot=new RewriteRuleTokenStream(adaptor,"token dot",dot);
			RewriteRuleTokenStream stream_count=new RewriteRuleTokenStream(adaptor,"token count",count);
			RewriteRuleTokenStream stream_id=new RewriteRuleTokenStream(adaptor,"token id",id);
			RewriteRuleTokenStream stream_fresh=new RewriteRuleTokenStream(adaptor,"token fresh",fresh);
			RewriteRuleTokenStream stream_updated=new RewriteRuleTokenStream(adaptor,"token updated",updated);
			RewriteRuleSubtreeStream stream_pr=new RewriteRuleSubtreeStream(adaptor,"rule pr",pr!=null?pr.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_array_index=new RewriteRuleSubtreeStream(adaptor,"token array_index",list_array_index);
			RewriteRuleSubtreeStream stream_pn=new RewriteRuleSubtreeStream(adaptor,"token pn",list_pn);
			root_0 = (BAST)adaptor.nil();
			// 1110:3: -> {dol!=null}? ^( $id $dol $pr)
			if (dol!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1110:19: ^( $id $dol $pr)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				adaptor.addChild(root_1, stream_dol.nextNode());
				adaptor.addChild(root_1, stream_pr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1111:3: -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
			if (lb!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1111:29: ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1111:36: ^( $lb ( $array_index)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1111:59: ^( $dot ( $pn)+ )
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

			else // 1112:3: -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT )
			if (lb!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1112:29: ^( $id ^( $lb ( $array_index)+ ) DOT )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1112:36: ^( $lb ( $array_index)+ )
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

			else // 1113:3: -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) )
			if (lb==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1113:29: ^( $id ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1113:36: ^( $dot ( $pn)+ )
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

			else // 1114:3: -> {q!=null}? ^( $q $id)
			if (q!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:17: ^( $q $id)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_q.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1115:3: -> {fresh!=null}? ^( $t $id $fresh)
			if (fresh!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:21: ^( $t $id $fresh)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fresh.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1116:3: -> {count!=null}? ^( $t $id $count)
			if (count!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:21: ^( $t $id $count)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_count.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1117:3: -> {updated!=null}? ^( $t $id $updated)
			if (updated!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1117:23: ^( $t $id $updated)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_updated.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1118:3: -> $id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:1: functionParameters :parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? ;
	public final BLESS3Parser.functionParameters_return functionParameters() throws RecognitionException {
		BLESS3Parser.functionParameters_return retval = new BLESS3Parser.functionParameters_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA191=null;
		Token COMMA192=null;
		List<Object> list_parameters=null;
		RuleReturnScope parameters = null;
		BAST COMMA191_tree=null;
		BAST COMMA192_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:19: (parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1122:3: parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6950);
			parameters=formalExpressionPair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

			if (list_parameters==null) list_parameters=new ArrayList<Object>();
			list_parameters.add(parameters.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1122:36: ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==COMMA) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1122:38: COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )*
					{
					COMMA191=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6954); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA191_tree = (BAST)adaptor.create(COMMA191);
					root_0 = (BAST)adaptor.becomeRoot(COMMA191_tree, root_0);
					}

					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6959);
					parameters=formalExpressionPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1123:3: ( COMMA !parameters+= formalExpressionPair )*
					loop91:
					while (true) {
						int alt91=2;
						int LA91_0 = input.LA(1);
						if ( (LA91_0==COMMA) ) {
							alt91=1;
						}

						switch (alt91) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1123:5: COMMA !parameters+= formalExpressionPair
							{
							COMMA192=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6966); if (state.failed) return retval;
							pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6971);
							parameters=formalExpressionPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

							if (list_parameters==null) list_parameters=new ArrayList<Object>();
							list_parameters.add(parameters.getTree());
							}
							break;

						default :
							break loop91;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1126:1: formalExpressionPair : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		BLESS3Parser.formalExpressionPair_return retval = new BLESS3Parser.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON193=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON193_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1126:21: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1127:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_formalExpressionPair6989); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON193=(Token)match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6997); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON193_tree = (BAST)adaptor.create(COLON193);
			root_0 = (BAST)adaptor.becomeRoot(COLON193_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_formalExpressionPair7002);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1131:1: partialName : record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id;
	public final BLESS3Parser.partialName_return partialName() throws RecognitionException {
		BLESS3Parser.partialName_return retval = new BLESS3Parser.partialName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token record_id=null;
		Token lb=null;
		Token RBRACKET194=null;
		Token LBRACKET195=null;
		Token RBRACKET196=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		BAST record_id_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET194_tree=null;
		BAST LBRACKET195_tree=null;
		BAST RBRACKET196_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1131:12: (record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1132:2: record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			{
			record_id=(Token)match(input,ID,FOLLOW_ID_in_partialName7015); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(record_id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1133:3: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==LBRACKET) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1133:5: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName7025); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName7029);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET194=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName7031); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET194);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:3: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==LBRACKET) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:5: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET195=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName7038); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET195);

							pushFollow(FOLLOW_indexExpressionOrRange_in_partialName7042);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET196=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName7044); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET196);

							}
							break;

						default :
							break loop93;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: lb, record_id, array_index, record_id
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
			// 1135:2: -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) )
			if (lb!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1135:17: ^( $record_id ^( $lb ( $array_index)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_record_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1135:31: ^( $lb ( $array_index)+ )
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

			else // 1136:2: -> $record_id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1139:1: constant : ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null );
	public final BLESS3Parser.constant_return constant() throws RecognitionException {
		BLESS3Parser.constant_return retval = new BLESS3Parser.constant_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AADL_STRING_LITERAL198=null;
		Token LITERAL_true199=null;
		Token LITERAL_false200=null;
		Token LITERAL_null201=null;
		ParserRuleReturnScope quantity197 =null;

		BAST AADL_STRING_LITERAL198_tree=null;
		BAST LITERAL_true199_tree=null;
		BAST LITERAL_false200_tree=null;
		BAST LITERAL_null201_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1139:9: ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null )
			int alt95=5;
			switch ( input.LA(1) ) {
			case ID:
			case LITERAL_self:
			case NUMBER:
			case OCTOTHORPE:
				{
				alt95=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt95=2;
				}
				break;
			case LITERAL_true:
				{
				alt95=3;
				}
				break;
			case LITERAL_false:
				{
				alt95=4;
				}
				break;
			case LITERAL_null:
				{
				alt95=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 95, 0, input);
				throw nvae;
			}
			switch (alt95) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1140:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_constant7092);
					quantity197=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity197.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1142:3: AADL_STRING_LITERAL
					{
					root_0 = (BAST)adaptor.nil();


					AADL_STRING_LITERAL198=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant7100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AADL_STRING_LITERAL198_tree = (BAST)adaptor.create(AADL_STRING_LITERAL198);
					adaptor.addChild(root_0, AADL_STRING_LITERAL198_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1144:3: LITERAL_true
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_true199=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant7108); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_true199_tree = (BAST)adaptor.create(LITERAL_true199);
					adaptor.addChild(root_0, LITERAL_true199_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1146:3: LITERAL_false
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_false200=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant7116); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_false200_tree = (BAST)adaptor.create(LITERAL_false200);
					adaptor.addChild(root_0, LITERAL_false200_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:3: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null201=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant7124); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null201_tree = (BAST)adaptor.create(LITERAL_null201);
					adaptor.addChild(root_0, LITERAL_null201_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1152:1: quantity : (num= aNumber u= ID -> ^( QUANTITY $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY $num $whole) |num= aNumber -> ^( QUANTITY $num) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1152:9: (num= aNumber u= ID -> ^( QUANTITY $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY $num $whole) |num= aNumber -> ^( QUANTITY $num) )
			int alt96=4;
			alt96 = dfa96.predict(input);
			switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1153:3: num= aNumber u= ID
					{
					pushFollow(FOLLOW_aNumber_in_quantity7141);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					u=(Token)match(input,ID,FOLLOW_ID_in_quantity7145); if (state.failed) return retval; 
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
					// 1154:4: -> ^( QUANTITY $num $u)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:7: ^( QUANTITY $num $u)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1156:3: num= aNumber scalar= LITERAL_scalar
					{
					pushFollow(FOLLOW_aNumber_in_quantity7174);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7178); if (state.failed) return retval; 
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
					// 1157:4: -> ^( QUANTITY $num $scalar)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1157:7: ^( QUANTITY $num $scalar)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:3: num= aNumber whole= LITERAL_whole
					{
					pushFollow(FOLLOW_aNumber_in_quantity7208);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7212); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_whole.add(whole);

					// AST REWRITE
					// elements: whole, num
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
					// 1160:4: -> ^( QUANTITY $num $whole)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1160:7: ^( QUANTITY $num $whole)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1162:3: num= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_quantity7240);
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
					// 1163:4: -> ^( QUANTITY $num)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1163:7: ^( QUANTITY $num)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:1: aNumber : (lit= NUMBER |property= propertyReference |propertyConstant= propertyName );
	public final BLESS3Parser.aNumber_return aNumber() throws RecognitionException {
		BLESS3Parser.aNumber_return retval = new BLESS3Parser.aNumber_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lit=null;
		ParserRuleReturnScope property =null;
		ParserRuleReturnScope propertyConstant =null;

		BAST lit_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:8: (lit= NUMBER |property= propertyReference |propertyConstant= propertyName )
			int alt97=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt97=1;
				}
				break;
			case LITERAL_self:
			case OCTOTHORPE:
				{
				alt97=2;
				}
				break;
			case ID:
				{
				int LA97_3 = input.LA(2);
				if ( (LA97_3==DOUBLE_COLON) ) {
					int LA97_4 = input.LA(3);
					if ( (LA97_4==ID) ) {
						int LA97_5 = input.LA(4);
						if ( (LA97_5==EOF||(LA97_5 >= AL && LA97_5 <= AMPERSAND)||(LA97_5 >= ASSIGN && LA97_5 <= AT_SIGN)||(LA97_5 >= BOX && LA97_5 <= COLON)||(LA97_5 >= COMMA && LA97_5 <= COMMADOT)||LA97_5==CVP||LA97_5==DIVIDE||(LA97_5 >= DOTCOMMA && LA97_5 <= DOTDOT)||LA97_5==EQ||LA97_5==EXP||(LA97_5 >= GT && LA97_5 <= GUARD)||(LA97_5 >= ID && LA97_5 <= IMP)||LA97_5==LASS||LA97_5==LCURLY||LA97_5==LITERAL_and||LA97_5==LITERAL_are||LA97_5==LITERAL_computation||LA97_5==LITERAL_constant||(LA97_5 >= LITERAL_declare && LA97_5 <= LITERAL_def)||(LA97_5 >= LITERAL_div && LA97_5 <= LITERAL_else)||LA97_5==LITERAL_exception||(LA97_5 >= LITERAL_fetchadd && LA97_5 <= LITERAL_final)||(LA97_5 >= LITERAL_for && LA97_5 <= LITERAL_forall)||(LA97_5 >= LITERAL_if && LA97_5 <= LITERAL_iff)||(LA97_5 >= LITERAL_implies && LA97_5 <= LITERAL_in)||LA97_5==LITERAL_invariant||LA97_5==LITERAL_mod||LA97_5==LITERAL_nonvolatile||LA97_5==LITERAL_of||LA97_5==LITERAL_or||LA97_5==LITERAL_rem||LA97_5==LITERAL_representation||LA97_5==LITERAL_returns||LA97_5==LITERAL_scalar||(LA97_5 >= LITERAL_setmode && LA97_5 <= LITERAL_spread)||LA97_5==LITERAL_states||(LA97_5 >= LITERAL_swap && LA97_5 <= LITERAL_then)||LA97_5==LITERAL_transitions||LA97_5==LITERAL_type||LA97_5==LITERAL_until||(LA97_5 >= LITERAL_when && LA97_5 <= LITERAL_whole)||LA97_5==LITERAL_xor||LA97_5==LT||LA97_5==MINUS||LA97_5==NEQ||LA97_5==OLD_NEQ||LA97_5==PLUS||LA97_5==PLUS_EQUALS||LA97_5==QQ||(LA97_5 >= RASS && LA97_5 <= RCURLY)||LA97_5==RPAREN||LA97_5==SEMICOLON||LA97_5==TICK||LA97_5==TIMES||LA97_5==VERT) ) {
							alt97=3;
						}
						else if ( (LA97_5==DOUBLE_COLON) ) {
							alt97=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 97, 5, input);
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
								new NoViableAltException("", 97, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA97_3==DOT||LA97_3==OCTOTHORPE) ) {
					alt97=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 97, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 97, 0, input);
				throw nvae;
			}
			switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:2: lit= NUMBER
					{
					root_0 = (BAST)adaptor.nil();


					lit=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7270); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					lit_tree = (BAST)adaptor.create(lit);
					adaptor.addChild(root_0, lit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:4: property= propertyReference
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyReference_in_aNumber7277);
					property=propertyReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, property.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1169:4: propertyConstant= propertyName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyName_in_aNumber7284);
					propertyConstant=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, propertyConstant.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1172:1: propertyReference : ( OCTOTHORPE ^pname= propertyName (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= propertyName (field+= propertyField )* |component= componentName OCTOTHORPE ^cpname= propertyName (field+= propertyField )* );
	public final BLESS3Parser.propertyReference_return propertyReference() throws RecognitionException {
		BLESS3Parser.propertyReference_return retval = new BLESS3Parser.propertyReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token OCTOTHORPE202=null;
		Token LITERAL_self203=null;
		Token OCTOTHORPE204=null;
		Token OCTOTHORPE205=null;
		List<Object> list_field=null;
		ParserRuleReturnScope pname =null;
		ParserRuleReturnScope spname =null;
		ParserRuleReturnScope component =null;
		ParserRuleReturnScope cpname =null;
		RuleReturnScope field = null;
		BAST OCTOTHORPE202_tree=null;
		BAST LITERAL_self203_tree=null;
		BAST OCTOTHORPE204_tree=null;
		BAST OCTOTHORPE205_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1172:18: ( OCTOTHORPE ^pname= propertyName (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= propertyName (field+= propertyField )* |component= componentName OCTOTHORPE ^cpname= propertyName (field+= propertyField )* )
			int alt101=3;
			switch ( input.LA(1) ) {
			case OCTOTHORPE:
				{
				alt101=1;
				}
				break;
			case LITERAL_self:
				{
				alt101=2;
				}
				break;
			case ID:
				{
				alt101=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 101, 0, input);
				throw nvae;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1173:2: OCTOTHORPE ^pname= propertyName (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					OCTOTHORPE202=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7298); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE202_tree = (BAST)adaptor.create(OCTOTHORPE202);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE202_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_propertyReference7303);
					pname=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pname.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:4: (field+= propertyField )*
					loop98:
					while (true) {
						int alt98=2;
						int LA98_0 = input.LA(1);
						if ( (LA98_0==DOT||LA98_0==LBRACKET) ) {
							alt98=1;
						}

						switch (alt98) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7314);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop98;
						}
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1176:4: LITERAL_self OCTOTHORPE ^spname= propertyName (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_self203=(Token)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7324); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_self203_tree = (BAST)adaptor.create(LITERAL_self203);
					adaptor.addChild(root_0, LITERAL_self203_tree);
					}

					OCTOTHORPE204=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7326); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE204_tree = (BAST)adaptor.create(OCTOTHORPE204);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE204_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_propertyReference7331);
					spname=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, spname.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:4: (field+= propertyField )*
					loop99:
					while (true) {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==DOT||LA99_0==LBRACKET) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7342);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop99;
						}
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1178:4: component= componentName OCTOTHORPE ^cpname= propertyName (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_componentName_in_propertyReference7352);
					component=componentName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, component.getTree());

					OCTOTHORPE205=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7358); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE205_tree = (BAST)adaptor.create(OCTOTHORPE205);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE205_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_propertyReference7363);
					cpname=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cpname.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1180:5: (field+= propertyField )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==DOT||LA100_0==LBRACKET) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1180:7: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7375);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop100;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1184:1: propertyField : ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) );
	public final BLESS3Parser.propertyField_return propertyField() throws RecognitionException {
		BLESS3Parser.propertyField_return retval = new BLESS3Parser.propertyField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token index=null;
		Token var=null;
		Token pf=null;
		Token upper=null;
		Token lower=null;
		Token LBRACKET206=null;
		Token RBRACKET207=null;
		Token DOT208=null;

		BAST index_tree=null;
		BAST var_tree=null;
		BAST pf_tree=null;
		BAST upper_tree=null;
		BAST lower_tree=null;
		BAST LBRACKET206_tree=null;
		BAST RBRACKET207_tree=null;
		BAST DOT208_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1184:14: ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) )
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LBRACKET) ) {
				alt104=1;
			}
			else if ( (LA104_0==DOT) ) {
				alt104=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 104, 0, input);
				throw nvae;
			}

			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:2: LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !
					{
					root_0 = (BAST)adaptor.nil();


					LBRACKET206=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7390); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACKET206_tree = (BAST)adaptor.create(LBRACKET206);
					root_0 = (BAST)adaptor.becomeRoot(LBRACKET206_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:12: (index= NUMBER |var= ID )
					int alt102=2;
					int LA102_0 = input.LA(1);
					if ( (LA102_0==NUMBER) ) {
						alt102=1;
					}
					else if ( (LA102_0==ID) ) {
						alt102=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 102, 0, input);
						throw nvae;
					}

					switch (alt102) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:13: index= NUMBER
							{
							index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7396); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							index_tree = (BAST)adaptor.create(index);
							adaptor.addChild(root_0, index_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:28: var= ID
							{
							var=(Token)match(input,ID,FOLLOW_ID_in_propertyField7402); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							var_tree = (BAST)adaptor.create(var);
							adaptor.addChild(root_0, var_tree);
							}

							}
							break;

					}

					RBRACKET207=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_propertyField7411); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:4: DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					{
					root_0 = (BAST)adaptor.nil();


					DOT208=(Token)match(input,DOT,FOLLOW_DOT_in_propertyField7419); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT208_tree = (BAST)adaptor.create(DOT208);
					root_0 = (BAST)adaptor.becomeRoot(DOT208_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:10: (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					int alt103=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt103=1;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt103=2;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt103=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 103, 0, input);
						throw nvae;
					}
					switch (alt103) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:11: pf= ID
							{
							pf=(Token)match(input,ID,FOLLOW_ID_in_propertyField7426); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							pf_tree = (BAST)adaptor.create(pf);
							adaptor.addChild(root_0, pf_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:19: upper= LITERAL_upper_bound
							{
							upper=(Token)match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7432); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							upper_tree = (BAST)adaptor.create(upper);
							adaptor.addChild(root_0, upper_tree);
							}

							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:47: lower= LITERAL_lower_bound
							{
							lower=(Token)match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7438); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1192:1: actionSubclause : (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1192:16: ( (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1193:2: (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1193:11: (no_proof= DO_NOT_PROVE )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==DO_NOT_PROVE) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1193:11: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7458); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1194:16: (throws_clause= throwsClause )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LITERAL_throws) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1194:16: throws_clause= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7465);
					throws_clause=throwsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_throwsClause.add(throws_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1195:16: (assert_clause= assertClause )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==LITERAL_assert) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1195:16: assert_clause= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7473);
					assert_clause=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(assert_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1196:3: (pre= LITERAL_pre precondition= assertion )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==LITERAL_pre) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1196:5: pre= LITERAL_pre precondition= assertion
					{
					pre=(Token)match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7484); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_pre.add(pre);

					pushFollow(FOLLOW_assertion_in_actionSubclause7488);
					precondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(precondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1197:3: (post= LITERAL_post postcondition= assertion )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==LITERAL_post) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1197:5: post= LITERAL_post postcondition= assertion
					{
					post=(Token)match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7499); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_post.add(post);

					pushFollow(FOLLOW_assertion_in_actionSubclause7503);
					postcondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(postcondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:3: (inv= LITERAL_invariant invariant= assertion )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==LITERAL_invariant) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:5: inv= LITERAL_invariant invariant= assertion
					{
					inv=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7515); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(inv);

					pushFollow(FOLLOW_assertion_in_actionSubclause7519);
					invariant=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(invariant.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7529);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: LITERAL_post, elq, postcondition, invariant, no_proof, throws_clause, LITERAL_pre, precondition, LITERAL_invariant, assert_clause
			// token labels: no_proof
			// rule labels: throws_clause, assert_clause, elq, precondition, postcondition, retval, invariant
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_throws_clause=new RewriteRuleSubtreeStream(adaptor,"rule throws_clause",throws_clause!=null?throws_clause.getTree():null);
			RewriteRuleSubtreeStream stream_assert_clause=new RewriteRuleSubtreeStream(adaptor,"rule assert_clause",assert_clause!=null?assert_clause.getTree():null);
			RewriteRuleSubtreeStream stream_elq=new RewriteRuleSubtreeStream(adaptor,"rule elq",elq!=null?elq.getTree():null);
			RewriteRuleSubtreeStream stream_precondition=new RewriteRuleSubtreeStream(adaptor,"rule precondition",precondition!=null?precondition.getTree():null);
			RewriteRuleSubtreeStream stream_postcondition=new RewriteRuleSubtreeStream(adaptor,"rule postcondition",postcondition!=null?postcondition.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_invariant=new RewriteRuleSubtreeStream(adaptor,"rule invariant",invariant!=null?invariant.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1200:3: -> ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:6: ^( ACTION_SUBCLAUSE ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre ( $precondition)? ) ^( LITERAL_post ( $postcondition)? ) ^( LITERAL_invariant $invariant) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION_SUBCLAUSE, "ACTION_SUBCLAUSE"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:27: ( $no_proof)?
				if ( stream_no_proof.hasNext() ) {
					adaptor.addChild(root_1, stream_no_proof.nextNode());
				}
				stream_no_proof.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:38: ( $throws_clause)?
				if ( stream_throws_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_clause.nextTree());
				}
				stream_throws_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:54: ( $assert_clause)?
				if ( stream_assert_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_assert_clause.nextTree());
				}
				stream_assert_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:69: ^( LITERAL_pre ( $precondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_pre.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1200:85: ( $precondition)?
				if ( stream_precondition.hasNext() ) {
					adaptor.addChild(root_2, stream_precondition.nextTree());
				}
				stream_precondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1201:6: ^( LITERAL_post ( $postcondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_LITERAL_post.nextNode(), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1201:23: ( $postcondition)?
				if ( stream_postcondition.hasNext() ) {
					adaptor.addChild(root_2, stream_postcondition.nextTree());
				}
				stream_postcondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1201:40: ^( LITERAL_invariant $invariant)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:1: throwsClause : LITERAL_throws ^ (exceptions+= ID )+ ;
	public final BLESS3Parser.throwsClause_return throwsClause() throws RecognitionException {
		BLESS3Parser.throwsClause_return retval = new BLESS3Parser.throwsClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_throws209=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;

		BAST LITERAL_throws209_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1204:13: ( LITERAL_throws ^ (exceptions+= ID )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1205:2: LITERAL_throws ^ (exceptions+= ID )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_throws209=(Token)match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7597); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throws209_tree = (BAST)adaptor.create(LITERAL_throws209);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_throws209_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1205:28: (exceptions+= ID )+
			int cnt111=0;
			loop111:
			while (true) {
				int alt111=2;
				int LA111_0 = input.LA(1);
				if ( (LA111_0==ID) ) {
					alt111=1;
				}

				switch (alt111) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1205:28: exceptions+= ID
					{
					exceptions=(Token)match(input,ID,FOLLOW_ID_in_throwsClause7602); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					exceptions_tree = (BAST)adaptor.create(exceptions);
					adaptor.addChild(root_0, exceptions_tree);
					}

					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt111 >= 1 ) break loop111;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(111, input);
					throw eee;
				}
				cnt111++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:1: assertClause : LITERAL_assert ^ ( namedAssertion )+ ;
	public final BLESS3Parser.assertClause_return assertClause() throws RecognitionException {
		BLESS3Parser.assertClause_return retval = new BLESS3Parser.assertClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_assert210=null;
		ParserRuleReturnScope namedAssertion211 =null;

		BAST LITERAL_assert210_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:13: ( LITERAL_assert ^ ( namedAssertion )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1209:3: LITERAL_assert ^ ( namedAssertion )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_assert210=(Token)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7617); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_assert210_tree = (BAST)adaptor.create(LITERAL_assert210);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_assert210_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1209:19: ( namedAssertion )+
			int cnt112=0;
			loop112:
			while (true) {
				int alt112=2;
				int LA112_0 = input.LA(1);
				if ( (LA112_0==LASS) ) {
					alt112=1;
				}

				switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1209:19: namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7620);
					namedAssertion211=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion211.getTree());

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
	// $ANTLR end "assertClause"


	public static class behaviorTime_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "behaviorTime"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1217:1: behaviorTime : (q= quantity -> ^( BEHAVIOR_TIME $q) |v= valueName u= ID -> ^( BEHAVIOR_TIME $v $u) |v= valueName s= LITERAL_scalar -> ^( BEHAVIOR_TIME $v $s) |v= valueName w= LITERAL_whole -> ^( BEHAVIOR_TIME $v $w) |v= valueName -> ^( BEHAVIOR_TIME $v) );
	public final BLESS3Parser.behaviorTime_return behaviorTime() throws RecognitionException {
		BLESS3Parser.behaviorTime_return retval = new BLESS3Parser.behaviorTime_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token u=null;
		Token s=null;
		Token w=null;
		ParserRuleReturnScope q =null;
		ParserRuleReturnScope v =null;

		BAST u_tree=null;
		BAST s_tree=null;
		BAST w_tree=null;
		RewriteRuleTokenStream stream_LITERAL_whole=new RewriteRuleTokenStream(adaptor,"token LITERAL_whole");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_LITERAL_scalar=new RewriteRuleTokenStream(adaptor,"token LITERAL_scalar");
		RewriteRuleSubtreeStream stream_quantity=new RewriteRuleSubtreeStream(adaptor,"rule quantity");
		RewriteRuleSubtreeStream stream_valueName=new RewriteRuleSubtreeStream(adaptor,"rule valueName");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1217:13: (q= quantity -> ^( BEHAVIOR_TIME $q) |v= valueName u= ID -> ^( BEHAVIOR_TIME $v $u) |v= valueName s= LITERAL_scalar -> ^( BEHAVIOR_TIME $v $s) |v= valueName w= LITERAL_whole -> ^( BEHAVIOR_TIME $v $w) |v= valueName -> ^( BEHAVIOR_TIME $v) )
			int alt113=5;
			int LA113_0 = input.LA(1);
			if ( (LA113_0==LITERAL_self||LA113_0==NUMBER||LA113_0==OCTOTHORPE) ) {
				alt113=1;
			}
			else if ( (LA113_0==ID) ) {
				int LA113_4 = input.LA(2);
				if ( (synpred181_BLESS3()) ) {
					alt113=1;
				}
				else if ( (synpred182_BLESS3()) ) {
					alt113=2;
				}
				else if ( (synpred183_BLESS3()) ) {
					alt113=3;
				}
				else if ( (synpred184_BLESS3()) ) {
					alt113=4;
				}
				else if ( (true) ) {
					alt113=5;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}

			switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1218:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_behaviorTime7642);
					q=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_quantity.add(q.getTree());
					// AST REWRITE
					// elements: q
					// token labels: 
					// rule labels: q, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_q=new RewriteRuleSubtreeStream(adaptor,"rule q",q!=null?q.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1219:3: -> ^( BEHAVIOR_TIME $q)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1219:6: ^( BEHAVIOR_TIME $q)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, "BEHAVIOR_TIME"), root_1);
						adaptor.addChild(root_1, stream_q.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:5: v= valueName u= ID
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7663);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					u=(Token)match(input,ID,FOLLOW_ID_in_behaviorTime7667); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(u);

					// AST REWRITE
					// elements: u, v
					// token labels: u
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_u=new RewriteRuleTokenStream(adaptor,"token u",u);
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1221:3: -> ^( BEHAVIOR_TIME $v $u)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1221:6: ^( BEHAVIOR_TIME $v $u)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, "BEHAVIOR_TIME"), root_1);
						adaptor.addChild(root_1, stream_v.nextTree());
						adaptor.addChild(root_1, stream_u.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:5: v= valueName s= LITERAL_scalar
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7691);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					s=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_behaviorTime7695); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_scalar.add(s);

					// AST REWRITE
					// elements: v, s
					// token labels: s
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1223:3: -> ^( BEHAVIOR_TIME $v $s)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:6: ^( BEHAVIOR_TIME $v $s)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, "BEHAVIOR_TIME"), root_1);
						adaptor.addChild(root_1, stream_v.nextTree());
						adaptor.addChild(root_1, stream_s.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:5: v= valueName w= LITERAL_whole
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7720);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					w=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_behaviorTime7724); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_whole.add(w);

					// AST REWRITE
					// elements: v, w
					// token labels: w
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_w=new RewriteRuleTokenStream(adaptor,"token w",w);
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1225:3: -> ^( BEHAVIOR_TIME $v $w)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1225:6: ^( BEHAVIOR_TIME $v $w)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, "BEHAVIOR_TIME"), root_1);
						adaptor.addChild(root_1, stream_v.nextTree());
						adaptor.addChild(root_1, stream_w.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1226:5: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7748);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					// AST REWRITE
					// elements: v
					// token labels: 
					// rule labels: v, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"rule v",v!=null?v.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (BAST)adaptor.nil();
					// 1227:3: -> ^( BEHAVIOR_TIME $v)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1227:6: ^( BEHAVIOR_TIME $v)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, "BEHAVIOR_TIME"), root_1);
						adaptor.addChild(root_1, stream_v.nextTree());
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
	// $ANTLR end "behaviorTime"


	public static class catchClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "catchClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:1: catchClause : LITERAL_catch ^ ( catchClauseTerm )+ ;
	public final BLESS3Parser.catchClause_return catchClause() throws RecognitionException {
		BLESS3Parser.catchClause_return retval = new BLESS3Parser.catchClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_catch212=null;
		ParserRuleReturnScope catchClauseTerm213 =null;

		BAST LITERAL_catch212_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:12: ( LITERAL_catch ^ ( catchClauseTerm )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:2: LITERAL_catch ^ ( catchClauseTerm )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_catch212=(Token)match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause7776); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_catch212_tree = (BAST)adaptor.create(LITERAL_catch212);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_catch212_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:17: ( catchClauseTerm )+
			int cnt114=0;
			loop114:
			while (true) {
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==LPAREN) ) {
					alt114=1;
				}

				switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1233:17: catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause7779);
					catchClauseTerm213=catchClauseTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClauseTerm213.getTree());

					}
					break;

				default :
					if ( cnt114 >= 1 ) break loop114;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(114, input);
					throw eee;
				}
				cnt114++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1236:1: catchClauseTerm : LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN ;
	public final BLESS3Parser.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		BLESS3Parser.catchClauseTerm_return retval = new BLESS3Parser.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token colon=null;
		Token LPAREN214=null;
		Token LITERAL_all215=null;
		Token RPAREN216=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;
		ParserRuleReturnScope act =null;

		BAST colon_tree=null;
		BAST LPAREN214_tree=null;
		BAST LITERAL_all215_tree=null;
		BAST RPAREN216_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1236:16: ( LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1237:3: LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN214=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7792); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN214_tree = (BAST)adaptor.create(LPAREN214);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN214_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:3: ( (exceptions+= ID )+ | LITERAL_all )
			int alt116=2;
			int LA116_0 = input.LA(1);
			if ( (LA116_0==ID) ) {
				alt116=1;
			}
			else if ( (LA116_0==LITERAL_all) ) {
				alt116=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 116, 0, input);
				throw nvae;
			}

			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:5: (exceptions+= ID )+
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:15: (exceptions+= ID )+
					int cnt115=0;
					loop115:
					while (true) {
						int alt115=2;
						int LA115_0 = input.LA(1);
						if ( (LA115_0==ID) ) {
							alt115=1;
						}

						switch (alt115) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:15: exceptions+= ID
							{
							exceptions=(Token)match(input,ID,FOLLOW_ID_in_catchClauseTerm7801); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							exceptions_tree = (BAST)adaptor.create(exceptions);
							adaptor.addChild(root_0, exceptions_tree);
							}

							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt115 >= 1 ) break loop115;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(115, input);
							throw eee;
						}
						cnt115++;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:23: LITERAL_all
					{
					LITERAL_all215=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm7806); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_all215_tree = (BAST)adaptor.create(LITERAL_all215);
					adaptor.addChild(root_0, LITERAL_all215_tree);
					}

					}
					break;

			}

			colon=(Token)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7812); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			colon_tree = (BAST)adaptor.create(colon);
			adaptor.addChild(root_0, colon_tree);
			}

			pushFollow(FOLLOW_basicAction_in_catchClauseTerm7816);
			act=basicAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, act.getTree());

			RPAREN216=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7818); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN216_tree = (BAST)adaptor.create(RPAREN216);
			adaptor.addChild(root_0, RPAREN216_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:1: quantifiedVariables : LITERAL_declare ^ ( variableDeclaration )+ ;
	public final BLESS3Parser.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		BLESS3Parser.quantifiedVariables_return retval = new BLESS3Parser.quantifiedVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_declare217=null;
		ParserRuleReturnScope variableDeclaration218 =null;

		BAST LITERAL_declare217_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:20: ( LITERAL_declare ^ ( variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:3: LITERAL_declare ^ ( variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_declare217=(Token)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7830); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_declare217_tree = (BAST)adaptor.create(LITERAL_declare217);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_declare217_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:20: ( variableDeclaration )+
			int cnt117=0;
			loop117:
			while (true) {
				int alt117=2;
				int LA117_0 = input.LA(1);
				if ( (LA117_0==ID) ) {
					alt117=1;
				}

				switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:20: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7833);
					variableDeclaration218=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration218.getTree());

					}
					break;

				default :
					if ( cnt117 >= 1 ) break loop117;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(117, input);
					throw eee;
				}
				cnt117++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:1: variableDeclaration : v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:20: (v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:3: v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )?
			{
			pushFollow(FOLLOW_variable_in_variableDeclaration7847);
			v=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(v.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:2: (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )?
			int alt118=6;
			switch ( input.LA(1) ) {
				case LITERAL_nonvolatile:
					{
					alt118=1;
					}
					break;
				case LITERAL_shared:
					{
					alt118=2;
					}
					break;
				case LITERAL_constant:
					{
					alt118=3;
					}
					break;
				case LITERAL_spread:
					{
					alt118=4;
					}
					break;
				case LITERAL_final:
					{
					alt118=5;
					}
					break;
			}
			switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:4: nv= LITERAL_nonvolatile
					{
					nv=(Token)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7858); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_nonvolatile.add(nv);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1249:6: sh= LITERAL_shared
					{
					sh=(Token)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7868); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_shared.add(sh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1250:6: c= LITERAL_constant
					{
					c=(Token)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7878); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_constant.add(c);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1251:7: sp= LITERAL_spread
					{
					sp=(Token)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7888); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_spread.add(sp);

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1252:7: f= LITERAL_final
					{
					f=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration7898); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(f);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1254:3: (assign= ASSIGN exp= expression )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==ASSIGN) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1254:5: assign= ASSIGN exp= expression
					{
					assign=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7912); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(assign);

					pushFollow(FOLLOW_expression_in_variableDeclaration7916);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:4: (a= assertion )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==LASS) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:4: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7926);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1256:7: (semi= SEMICOLON )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==SEMICOLON) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1256:7: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration7935); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: a, v, exp, sh, nv, assign, sh, c, f, sp, nv, f, sp, a, v, c
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
			// 1257:5: -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			if (assign!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:24: ^( VARIABLE_DECLARATION $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:51: ^( $assign $exp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_assign.nextNode(), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:70: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:74: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:79: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:84: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:88: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:93: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1258:5: -> ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:8: ^( VARIABLE_DECLARATION $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:36: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:40: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:45: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:50: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:54: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1258:59: ( $f)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:1: behaviorActions :a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? ;
	public final BLESS3Parser.behaviorActions_return behaviorActions() throws RecognitionException {
		BLESS3Parser.behaviorActions_return retval = new BLESS3Parser.behaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token SEMICOLON219=null;
		Token SEMICOLON220=null;
		Token AMPERSAND221=null;
		Token AMPERSAND222=null;
		List<Object> list_a=null;
		RuleReturnScope a = null;
		BAST SEMICOLON219_tree=null;
		BAST SEMICOLON220_tree=null;
		BAST AMPERSAND221_tree=null;
		BAST AMPERSAND222_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:16: (a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1263:3: a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_assertedAction_in_behaviorActions8042);
			a=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

			if (list_a==null) list_a=new ArrayList<Object>();
			list_a.add(a.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1264:3: ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			int alt124=3;
			int LA124_0 = input.LA(1);
			if ( (LA124_0==SEMICOLON) ) {
				alt124=1;
			}
			else if ( (LA124_0==AMPERSAND) ) {
				alt124=2;
			}
			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:6: SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )*
					{
					SEMICOLON219=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions8055); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON219_tree = (BAST)adaptor.create(SEMICOLON219);
					root_0 = (BAST)adaptor.becomeRoot(SEMICOLON219_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions8060);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:35: ( SEMICOLON !a+= assertedAction )*
					loop122:
					while (true) {
						int alt122=2;
						int LA122_0 = input.LA(1);
						if ( (LA122_0==SEMICOLON) ) {
							alt122=1;
						}

						switch (alt122) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1265:37: SEMICOLON !a+= assertedAction
							{
							SEMICOLON220=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions8064); if (state.failed) return retval;
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8069);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop122;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:6: AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )*
					{
					AMPERSAND221=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions8088); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND221_tree = (BAST)adaptor.create(AMPERSAND221);
					root_0 = (BAST)adaptor.becomeRoot(AMPERSAND221_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions8093);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:35: ( AMPERSAND a+= assertedAction )*
					loop123:
					while (true) {
						int alt123=2;
						int LA123_0 = input.LA(1);
						if ( (LA123_0==AMPERSAND) ) {
							alt123=1;
						}

						switch (alt123) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:37: AMPERSAND a+= assertedAction
							{
							AMPERSAND222=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions8097); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AMPERSAND222_tree = (BAST)adaptor.create(AMPERSAND222);
							adaptor.addChild(root_0, AMPERSAND222_tree);
							}

							pushFollow(FOLLOW_assertedAction_in_behaviorActions8101);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop123;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1271:1: assertedAction : (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1271:17: ( (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1272:3: (pre= assertion )? s= action (post= assertion )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1272:6: (pre= assertion )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==LASS) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1272:6: pre= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction8124);
					pre=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(pre.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_assertedAction8133);
			s=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(s.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1274:7: (post= assertion )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==LASS) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1274:7: post= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction8139);
					post=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(post.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: pre, post, s
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
			// 1275:5: -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1276:5: ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[\"Q\"] ( $post)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, (s!=null?((BAST)s.getTree()):null).getToken(), "ACTION["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1277:9: ^( P[\"P\"] ( $pre)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(P, "P"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1277:20: ( $pre)?
				if ( stream_pre.hasNext() ) {
					adaptor.addChild(root_2, stream_pre.nextTree());
				}
				stream_pre.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1278:9: ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(S, (s!=null?((BAST)s.getTree()):null).getToken(), "S["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1279:9: ^( Q[\"Q\"] ( $post)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, "Q"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1279:20: ( $post)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1285:1: action : ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification );
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
		ParserRuleReturnScope basicAction223 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1285:7: ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification )
			int alt127=7;
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
				alt127=1;
				}
				break;
			case LITERAL_if:
				{
				alt127=2;
				}
				break;
			case LITERAL_while:
				{
				alt127=3;
				}
				break;
			case LITERAL_for:
				{
				alt127=4;
				}
				break;
			case LITERAL_do:
				{
				alt127=5;
				}
				break;
			case LCURLY:
			case LITERAL_declare:
				{
				alt127=6;
				}
				break;
			case LITERAL_forall:
				{
				alt127=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 127, 0, input);
				throw nvae;
			}
			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:3: basicAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_basicAction_in_action8255);
					basicAction223=basicAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basicAction223.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1287:5: if_fi= alternative
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_alternative_in_action8263);
					if_fi=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_fi.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:5: wl= whileLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_action8271);
					wl=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, wl.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1289:5: fl= forLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_action8279);
					fl=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fl.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1290:5: du= doUntilLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_doUntilLoop_in_action8287);
					du=doUntilLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, du.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:5: elq= existentialLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8295);
					elq=existentialLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elq.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1292:5: ulq= universalLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalLatticeQuantification_in_action8304);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:1: basicAction : ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException );
	public final BLESS3Parser.basicAction_return basicAction() throws RecognitionException {
		BLESS3Parser.basicAction_return retval = new BLESS3Parser.basicAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token mode=null;
		Token LITERAL_skip224=null;
		Token LITERAL_setmode226=null;
		ParserRuleReturnScope assignment225 =null;
		ParserRuleReturnScope whenThrow227 =null;
		ParserRuleReturnScope combinableOperation228 =null;
		ParserRuleReturnScope communicationAction229 =null;
		ParserRuleReturnScope computation230 =null;
		ParserRuleReturnScope simultaneousAssignment231 =null;
		ParserRuleReturnScope issueException232 =null;

		BAST mode_tree=null;
		BAST LITERAL_skip224_tree=null;
		BAST LITERAL_setmode226_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:12: ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException )
			int alt128=9;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt128=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EXCLAMATION:
				case LPAREN:
					{
					alt128=6;
					}
					break;
				case QUESTION:
					{
					int LA128_10 = input.LA(3);
					if ( (LA128_10==LPAREN) ) {
						alt128=6;
					}
					else if ( (LA128_10==ASSIGN||LA128_10==TICK) ) {
						alt128=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 128, 10, input);
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
					alt128=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 128, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LITERAL_setmode:
				{
				alt128=3;
				}
				break;
			case LITERAL_when:
				{
				alt128=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt128=5;
				}
				break;
			case LITERAL_computation:
				{
				alt128=7;
				}
				break;
			case VERT:
				{
				alt128=8;
				}
				break;
			case LITERAL_exception:
				{
				alt128=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}
			switch (alt128) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1296:3: LITERAL_skip
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_skip224=(Token)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8319); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_skip224_tree = (BAST)adaptor.create(LITERAL_skip224);
					adaptor.addChild(root_0, LITERAL_skip224_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1297:5: assignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_basicAction8325);
					assignment225=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment225.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1298:5: ^( LITERAL_setmode mode= ID )
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_setmode226=(Token)match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8333); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_setmode226_tree = (BAST)adaptor.create(LITERAL_setmode226);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_setmode226_tree, root_0);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					mode=(Token)match(input,ID,FOLLOW_ID_in_basicAction8337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					mode_tree = (BAST)adaptor.create(mode);
					adaptor.addChild(root_0, mode_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1299:5: whenThrow
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whenThrow_in_basicAction8346);
					whenThrow227=whenThrow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThrow227.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1300:5: combinableOperation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_combinableOperation_in_basicAction8352);
					combinableOperation228=combinableOperation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, combinableOperation228.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1301:5: communicationAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_communicationAction_in_basicAction8358);
					communicationAction229=communicationAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, communicationAction229.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:5: computation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_computation_in_basicAction8365);
					computation230=computation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, computation230.getTree());

					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1303:5: simultaneousAssignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8371);
					simultaneousAssignment231=simultaneousAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simultaneousAssignment231.getTree());

					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1305:5: issueException
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_issueException_in_basicAction8378);
					issueException232=issueException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, issueException232.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1308:1: assignment : nameTick ASSIGN ^ expressionOrAny ;
	public final BLESS3Parser.assignment_return assignment() throws RecognitionException {
		BLESS3Parser.assignment_return retval = new BLESS3Parser.assignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ASSIGN234=null;
		ParserRuleReturnScope nameTick233 =null;
		ParserRuleReturnScope expressionOrAny235 =null;

		BAST ASSIGN234_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1308:11: ( nameTick ASSIGN ^ expressionOrAny )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1309:3: nameTick ASSIGN ^ expressionOrAny
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_nameTick_in_assignment8390);
			nameTick233=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nameTick233.getTree());

			ASSIGN234=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8392); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN234_tree = (BAST)adaptor.create(ASSIGN234);
			root_0 = (BAST)adaptor.becomeRoot(ASSIGN234_tree, root_0);
			}

			pushFollow(FOLLOW_expressionOrAny_in_assignment8395);
			expressionOrAny235=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrAny235.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1312:1: simultaneousAssignment : VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) ;
	public final BLESS3Parser.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		BLESS3Parser.simultaneousAssignment_return retval = new BLESS3Parser.simultaneousAssignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token left_comma=null;
		Token a=null;
		Token right_comma=null;
		Token VERT236=null;
		Token COMMA237=null;
		Token COMMA238=null;
		Token VERT239=null;
		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		BAST left_comma_tree=null;
		BAST a_tree=null;
		BAST right_comma_tree=null;
		BAST VERT236_tree=null;
		BAST COMMA237_tree=null;
		BAST COMMA238_tree=null;
		BAST VERT239_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERT=new RewriteRuleTokenStream(adaptor,"token VERT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_nameTick=new RewriteRuleSubtreeStream(adaptor,"rule nameTick");
		RewriteRuleSubtreeStream stream_expressionOrAny=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrAny");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1312:24: ( VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1313:2: VERT lhs+= nameTick left_comma= COMMA lhs+= nameTick ( COMMA lhs+= nameTick )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT
			{
			VERT236=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8407); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT236);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8413);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			left_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8417); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(left_comma);

			pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8421);
			lhs=nameTick();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:47: ( COMMA lhs+= nameTick )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==COMMA) ) {
					alt129=1;
				}

				switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:49: COMMA lhs+= nameTick
					{
					COMMA237=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8425); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA237);

					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment8429);
					lhs=nameTick();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nameTick.add(lhs.getTree());
					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTree());
					}
					break;

				default :
					break loop129;
				}
			}

			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8437); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(a);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8443);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			right_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8447); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(right_comma);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8451);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1316:62: ( COMMA rhs+= expressionOrAny )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==COMMA) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1316:64: COMMA rhs+= expressionOrAny
					{
					COMMA238=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8455); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA238);

					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8459);
					rhs=expressionOrAny();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTree());
					}
					break;

				default :
					break loop130;
				}
			}

			VERT239=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8466); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT239);

			// AST REWRITE
			// elements: left_comma, right_comma, rhs, a, lhs
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
			// 1318:5: -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:8: ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_a.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:13: ^( $left_comma ( $lhs)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:36: ^( $right_comma ( $rhs)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1321:1: nameTick : valueName ( TICK ^)? ;
	public final BLESS3Parser.nameTick_return nameTick() throws RecognitionException {
		BLESS3Parser.nameTick_return retval = new BLESS3Parser.nameTick_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TICK241=null;
		ParserRuleReturnScope valueName240 =null;

		BAST TICK241_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1321:9: ( valueName ( TICK ^)? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1321:11: valueName ( TICK ^)?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_valueName_in_nameTick8507);
			valueName240=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName240.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1321:21: ( TICK ^)?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==TICK) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1321:23: TICK ^
					{
					TICK241=(Token)match(input,TICK,FOLLOW_TICK_in_nameTick8511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TICK241_tree = (BAST)adaptor.create(TICK241);
					root_0 = (BAST)adaptor.becomeRoot(TICK241_tree, root_0);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1323:1: expressionOrAny : ( expression | LITERAL_any );
	public final BLESS3Parser.expressionOrAny_return expressionOrAny() throws RecognitionException {
		BLESS3Parser.expressionOrAny_return retval = new BLESS3Parser.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_any243=null;
		ParserRuleReturnScope expression242 =null;

		BAST LITERAL_any243_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1323:16: ( expression | LITERAL_any )
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==AADL_STRING_LITERAL||LA132_0==ID||LA132_0==LBRACKET||LA132_0==LITERAL_abs||LA132_0==LITERAL_all||LA132_0==LITERAL_exists||LA132_0==LITERAL_false||(LA132_0 >= LITERAL_not && LA132_0 <= LITERAL_numberof)||LA132_0==LITERAL_product||LA132_0==LITERAL_round||LA132_0==LITERAL_self||LA132_0==LITERAL_sum||LA132_0==LITERAL_timeout||LA132_0==LITERAL_tops||(LA132_0 >= LITERAL_true && LA132_0 <= LITERAL_truncate)||LA132_0==LPAREN||LA132_0==MINUS||LA132_0==NUMBER||LA132_0==OCTOTHORPE) ) {
				alt132=1;
			}
			else if ( (LA132_0==LITERAL_any) ) {
				alt132=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1324:3: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_expressionOrAny8525);
					expression242=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression242.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1324:16: LITERAL_any
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_any243=(Token)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8529); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_any243_tree = (BAST)adaptor.create(LITERAL_any243);
					adaptor.addChild(root_0, LITERAL_any243_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1327:1: whenThrow : LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ;
	public final BLESS3Parser.whenThrow_return whenThrow() throws RecognitionException {
		BLESS3Parser.whenThrow_return retval = new BLESS3Parser.whenThrow_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token excep=null;
		Token message=null;
		Token LITERAL_when244=null;
		Token LPAREN245=null;
		Token RPAREN246=null;
		Token LITERAL_throw247=null;
		ParserRuleReturnScope exp =null;

		BAST excep_tree=null;
		BAST message_tree=null;
		BAST LITERAL_when244_tree=null;
		BAST LPAREN245_tree=null;
		BAST RPAREN246_tree=null;
		BAST LITERAL_throw247_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1327:10: ( LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1328:3: LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_when244=(Token)match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8541); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_when244_tree = (BAST)adaptor.create(LITERAL_when244);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_when244_tree, root_0);
			}

			LPAREN245=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8544); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN245_tree = (BAST)adaptor.create(LPAREN245);
			adaptor.addChild(root_0, LPAREN245_tree);
			}

			pushFollow(FOLLOW_expression_in_whenThrow8548);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN246=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8550); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN246_tree = (BAST)adaptor.create(RPAREN246);
			adaptor.addChild(root_0, RPAREN246_tree);
			}

			LITERAL_throw247=(Token)match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8552); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throw247_tree = (BAST)adaptor.create(LITERAL_throw247);
			adaptor.addChild(root_0, LITERAL_throw247_tree);
			}

			excep=(Token)match(input,ID,FOLLOW_ID_in_whenThrow8556); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			excep_tree = (BAST)adaptor.create(excep);
			adaptor.addChild(root_0, excep_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1329:10: (message= AADL_STRING_LITERAL )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==AADL_STRING_LITERAL) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1329:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8564); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:1: combinableOperation : (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !);
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
		Token LPAREN248=null;
		Token COMMA249=null;
		Token COMMA250=null;
		Token RPAREN251=null;
		Token LPAREN252=null;
		Token COMMA253=null;
		Token COMMA254=null;
		Token RPAREN255=null;
		Token LPAREN256=null;
		Token COMMA257=null;
		Token COMMA258=null;
		Token RPAREN259=null;
		Token LPAREN260=null;
		Token COMMA261=null;
		Token COMMA262=null;
		Token RPAREN263=null;
		Token LPAREN264=null;
		Token COMMA265=null;
		Token COMMA266=null;
		Token RPAREN267=null;
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
		BAST LPAREN248_tree=null;
		BAST COMMA249_tree=null;
		BAST COMMA250_tree=null;
		BAST RPAREN251_tree=null;
		BAST LPAREN252_tree=null;
		BAST COMMA253_tree=null;
		BAST COMMA254_tree=null;
		BAST RPAREN255_tree=null;
		BAST LPAREN256_tree=null;
		BAST COMMA257_tree=null;
		BAST COMMA258_tree=null;
		BAST RPAREN259_tree=null;
		BAST LPAREN260_tree=null;
		BAST COMMA261_tree=null;
		BAST COMMA262_tree=null;
		BAST RPAREN263_tree=null;
		BAST LPAREN264_tree=null;
		BAST COMMA265_tree=null;
		BAST COMMA266_tree=null;
		BAST RPAREN267_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:20: (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !)
			int alt134=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt134=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt134=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt134=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt134=4;
				}
				break;
			case LITERAL_swap:
				{
				alt134=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}
			switch (alt134) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1333:3: f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_add=(Token)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation8585); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_add_tree = (BAST)adaptor.create(f_add);
					root_0 = (BAST)adaptor.becomeRoot(f_add_tree, root_0);
					}

					LPAREN248=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8588); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8593); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8595); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8600);
					arithmetic=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic.getTree());

					COMMA250=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8602); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8607); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN251=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8609); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:3: f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_or=(Token)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation8621); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_or_tree = (BAST)adaptor.create(f_or);
					root_0 = (BAST)adaptor.becomeRoot(f_or_tree, root_0);
					}

					LPAREN252=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8624); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8629); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8631); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8636);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8638); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8643); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN255=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8645); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1337:3: f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_and=(Token)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation8656); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_and_tree = (BAST)adaptor.create(f_and);
					root_0 = (BAST)adaptor.becomeRoot(f_and_tree, root_0);
					}

					LPAREN256=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8659); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8664); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA257=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8666); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8671);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA258=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8673); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8678); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN259=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8680); if (state.failed) return retval;
					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1339:3: f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_xor=(Token)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation8691); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_xor_tree = (BAST)adaptor.create(f_xor);
					root_0 = (BAST)adaptor.becomeRoot(f_xor_tree, root_0);
					}

					LPAREN260=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8694); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8699); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA261=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8701); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8706);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA262=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8708); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8713); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN263=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8715); if (state.failed) return retval;
					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1341:3: sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					sw=(Token)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation8726); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					sw_tree = (BAST)adaptor.create(sw);
					root_0 = (BAST)adaptor.becomeRoot(sw_tree, root_0);
					}

					LPAREN264=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8729); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8734); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8736); if (state.failed) return retval;
					reference=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8741); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					reference_tree = (BAST)adaptor.create(reference);
					adaptor.addChild(root_0, reference_tree);
					}

					COMMA266=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8743); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8748); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN267=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8750); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1344:1: communicationAction : (pc= subprogramCall |po= portOutput |pi= portInput );
	public final BLESS3Parser.communicationAction_return communicationAction() throws RecognitionException {
		BLESS3Parser.communicationAction_return retval = new BLESS3Parser.communicationAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pc =null;
		ParserRuleReturnScope po =null;
		ParserRuleReturnScope pi =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1344:20: (pc= subprogramCall |po= portOutput |pi= portInput )
			int alt135=3;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==ID) ) {
				switch ( input.LA(2) ) {
				case LPAREN:
					{
					alt135=1;
					}
					break;
				case EXCLAMATION:
					{
					alt135=2;
					}
					break;
				case QUESTION:
					{
					alt135=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 135, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}

			switch (alt135) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1345:3: pc= subprogramCall
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_subprogramCall_in_communicationAction8765);
					pc=subprogramCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1347:3: po= portOutput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portOutput_in_communicationAction8775);
					po=portOutput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, po.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:3: pi= portInput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portInput_in_communicationAction8785);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:1: computation : LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )? ;
	public final BLESS3Parser.computation_return computation() throws RecognitionException {
		BLESS3Parser.computation_return retval = new BLESS3Parser.computation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_computation268=null;
		Token LPAREN269=null;
		Token COMMA270=null;
		Token RPAREN271=null;
		Token LITERAL_in272=null;
		Token LITERAL_binding273=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope component =null;

		BAST LITERAL_computation268_tree=null;
		BAST LPAREN269_tree=null;
		BAST COMMA270_tree=null;
		BAST RPAREN271_tree=null;
		BAST LITERAL_in272_tree=null;
		BAST LITERAL_binding273_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1356:12: ( LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:3: LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_computation268=(Token)match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation8801); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_computation268_tree = (BAST)adaptor.create(LITERAL_computation268);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_computation268_tree, root_0);
			}

			LPAREN269=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computation8804); if (state.failed) return retval;
			pushFollow(FOLLOW_behaviorTime_in_computation8809);
			lb=behaviorTime();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:48: ( COMMA !ub= behaviorTime )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==COMMA) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1357:50: COMMA !ub= behaviorTime
					{
					COMMA270=(Token)match(input,COMMA,FOLLOW_COMMA_in_computation8813); if (state.failed) return retval;
					pushFollow(FOLLOW_behaviorTime_in_computation8818);
					ub=behaviorTime();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					}
					break;

			}

			RPAREN271=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computation8823); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:5: ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==LITERAL_in) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:7: LITERAL_in ! LITERAL_binding ^ (component= componentName )+
					{
					LITERAL_in272=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_computation8832); if (state.failed) return retval;
					LITERAL_binding273=(Token)match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation8835); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_binding273_tree = (BAST)adaptor.create(LITERAL_binding273);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_binding273_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:45: (component= componentName )+
					int cnt137=0;
					loop137:
					while (true) {
						int alt137=2;
						int LA137_0 = input.LA(1);
						if ( (LA137_0==ID) ) {
							alt137=1;
						}

						switch (alt137) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:45: component= componentName
							{
							pushFollow(FOLLOW_componentName_in_computation8840);
							component=componentName();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, component.getTree());

							}
							break;

						default :
							if ( cnt137 >= 1 ) break loop137;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(137, input);
							throw eee;
						}
						cnt137++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1361:1: subprogramCall : id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal) ;
	public final BLESS3Parser.subprogramCall_return subprogramCall() throws RecognitionException {
		BLESS3Parser.subprogramCall_return retval = new BLESS3Parser.subprogramCall_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN274=null;
		Token RPAREN275=null;
		ParserRuleReturnScope fal =null;

		BAST id_tree=null;
		BAST LPAREN274_tree=null;
		BAST RPAREN275_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_formalActualList=new RewriteRuleSubtreeStream(adaptor,"rule formalActualList");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1361:15: (id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:3: id= ID LPAREN (fal= formalActualList )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_subprogramCall8858); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN274=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subprogramCall8860); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN274);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:19: (fal= formalActualList )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==AADL_STRING_LITERAL||LA139_0==ID||LA139_0==LITERAL_false||LA139_0==LITERAL_null||LA139_0==LITERAL_self||LA139_0==LITERAL_true||LA139_0==LPAREN||LA139_0==NUMBER||LA139_0==OCTOTHORPE) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:19: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall8864);
					fal=formalActualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalActualList.add(fal.getTree());
					}
					break;

			}

			RPAREN275=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subprogramCall8867); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN275);

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
			// 1363:5: -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:8: ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(SUBPROGRAM_INVOCATION, id, "SUBPROGRAM_INVOCATION["+(id!=null?id.getText():null)+":"+Integer.toString(id.getLine()+startingLine)+"] "), root_1);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1367:1: formalActualList : formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? ;
	public final BLESS3Parser.formalActualList_return formalActualList() throws RecognitionException {
		BLESS3Parser.formalActualList_return retval = new BLESS3Parser.formalActualList_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA277=null;
		Token COMMA279=null;
		ParserRuleReturnScope formalActual276 =null;
		ParserRuleReturnScope formalActual278 =null;
		ParserRuleReturnScope formalActual280 =null;

		BAST COMMA277_tree=null;
		BAST COMMA279_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1367:17: ( formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1368:3: formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalActual_in_formalActualList8898);
			formalActual276=formalActual();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual276.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1368:16: ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==COMMA) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1368:18: COMMA ^ formalActual ( COMMA ! formalActual )*
					{
					COMMA277=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8902); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA277_tree = (BAST)adaptor.create(COMMA277);
					root_0 = (BAST)adaptor.becomeRoot(COMMA277_tree, root_0);
					}

					pushFollow(FOLLOW_formalActual_in_formalActualList8905);
					formalActual278=formalActual();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual278.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1368:38: ( COMMA ! formalActual )*
					loop140:
					while (true) {
						int alt140=2;
						int LA140_0 = input.LA(1);
						if ( (LA140_0==COMMA) ) {
							alt140=1;
						}

						switch (alt140) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1368:40: COMMA ! formalActual
							{
							COMMA279=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8909); if (state.failed) return retval;
							pushFollow(FOLLOW_formalActual_in_formalActualList8912);
							formalActual280=formalActual();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual280.getTree());

							}
							break;

						default :
							break loop140;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1371:1: formalActual : (formal= ID COLON ^)? actual= subProgramParameter ;
	public final BLESS3Parser.formalActual_return formalActual() throws RecognitionException {
		BLESS3Parser.formalActual_return retval = new BLESS3Parser.formalActual_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON281=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON281_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1371:13: ( (formal= ID COLON ^)? actual= subProgramParameter )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1372:3: (formal= ID COLON ^)? actual= subProgramParameter
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1372:3: (formal= ID COLON ^)?
			int alt142=2;
			int LA142_0 = input.LA(1);
			if ( (LA142_0==ID) ) {
				int LA142_1 = input.LA(2);
				if ( (LA142_1==COLON) ) {
					alt142=1;
				}
			}
			switch (alt142) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1372:5: formal= ID COLON ^
					{
					formal=(Token)match(input,ID,FOLLOW_ID_in_formalActual8934); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					formal_tree = (BAST)adaptor.create(formal);
					adaptor.addChild(root_0, formal_tree);
					}

					COLON281=(Token)match(input,COLON,FOLLOW_COLON_in_formalActual8942); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLON281_tree = (BAST)adaptor.create(COLON281);
					root_0 = (BAST)adaptor.becomeRoot(COLON281_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_subProgramParameter_in_formalActual8950);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1376:1: subProgramParameter : ( valueName | constant | parenthesizedSubexpression );
	public final BLESS3Parser.subProgramParameter_return subProgramParameter() throws RecognitionException {
		BLESS3Parser.subProgramParameter_return retval = new BLESS3Parser.subProgramParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope valueName282 =null;
		ParserRuleReturnScope constant283 =null;
		ParserRuleReturnScope parenthesizedSubexpression284 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1376:20: ( valueName | constant | parenthesizedSubexpression )
			int alt143=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case DOUBLE_COLON:
				case OCTOTHORPE:
					{
					alt143=2;
					}
					break;
				case EOF:
				case COMMA:
				case DOLLAR:
				case LBRACKET:
				case QUESTION:
				case RPAREN:
				case TICK:
					{
					alt143=1;
					}
					break;
				case DOT:
					{
					int LA143_5 = input.LA(3);
					if ( (LA143_5==ID) ) {
						int LA143_6 = input.LA(4);
						if ( (LA143_6==OCTOTHORPE) ) {
							alt143=2;
						}
						else if ( (LA143_6==EOF||LA143_6==COMMA||LA143_6==DOT||LA143_6==LBRACKET||LA143_6==QUESTION||LA143_6==RPAREN||LA143_6==TICK) ) {
							alt143=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 143, 6, input);
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
								new NoViableAltException("", 143, 5, input);
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
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 143, 1, input);
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
				{
				alt143=2;
				}
				break;
			case LPAREN:
				{
				alt143=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 143, 0, input);
				throw nvae;
			}
			switch (alt143) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1377:2: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_subProgramParameter8961);
					valueName282=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName282.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1378:4: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_subProgramParameter8966);
					constant283=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant283.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1379:4: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter8971);
					parenthesizedSubexpression284=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression284.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1382:1: portOutput : pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) ;
	public final BLESS3Parser.portOutput_return portOutput() throws RecognitionException {
		BLESS3Parser.portOutput_return retval = new BLESS3Parser.portOutput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn=null;
		Token EXCLAMATION285=null;
		Token LPAREN286=null;
		Token RPAREN287=null;
		ParserRuleReturnScope be =null;

		BAST pn_tree=null;
		BAST EXCLAMATION285_tree=null;
		BAST LPAREN286_tree=null;
		BAST RPAREN287_tree=null;
		RewriteRuleTokenStream stream_EXCLAMATION=new RewriteRuleTokenStream(adaptor,"token EXCLAMATION");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1382:11: (pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1383:5: pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )?
			{
			pn=(Token)match(input,ID,FOLLOW_ID_in_portOutput8987); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn);

			EXCLAMATION285=(Token)match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_portOutput8989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXCLAMATION.add(EXCLAMATION285);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1383:23: ( LPAREN be= expression RPAREN )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LPAREN) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1383:25: LPAREN be= expression RPAREN
					{
					LPAREN286=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portOutput8993); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN286);

					pushFollow(FOLLOW_expression_in_portOutput8997);
					be=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(be.getTree());
					RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portOutput8999); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN287);

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
			// 1384:5: -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1384:8: ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_OUTPUT, pn, "PORT_OUTPUT["+Integer.toString(pn_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1386:19: ( $be)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1389:1: portInput : pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) ;
	public final BLESS3Parser.portInput_return portInput() throws RecognitionException {
		BLESS3Parser.portInput_return retval = new BLESS3Parser.portInput_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pn2=null;
		Token QUESTION288=null;
		Token LPAREN289=null;
		Token RPAREN290=null;
		ParserRuleReturnScope n =null;

		BAST pn2_tree=null;
		BAST QUESTION288_tree=null;
		BAST LPAREN289_tree=null;
		BAST RPAREN290_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_QUESTION=new RewriteRuleTokenStream(adaptor,"token QUESTION");
		RewriteRuleSubtreeStream stream_valueName=new RewriteRuleSubtreeStream(adaptor,"rule valueName");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1389:10: (pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1390:5: pn2= ID QUESTION LPAREN n= valueName RPAREN
			{
			pn2=(Token)match(input,ID,FOLLOW_ID_in_portInput9045); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn2);

			QUESTION288=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_portInput9047); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION288);

			LPAREN289=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portInput9049); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN289);

			pushFollow(FOLLOW_valueName_in_portInput9054);
			n=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(n.getTree());
			RPAREN290=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portInput9056); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN290);

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
			// 1391:6: -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:9: ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1396:1: alternative : lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) ;
	public final BLESS3Parser.alternative_return alternative() throws RecognitionException {
		BLESS3Parser.alternative_return retval = new BLESS3Parser.alternative_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lif=null;
		Token BOX291=null;
		Token LITERAL_fi292=null;
		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		BAST lif_tree=null;
		BAST BOX291_tree=null;
		BAST LITERAL_fi292_tree=null;
		RewriteRuleTokenStream stream_LITERAL_fi=new RewriteRuleTokenStream(adaptor,"token LITERAL_fi");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_BOX=new RewriteRuleTokenStream(adaptor,"token BOX");
		RewriteRuleSubtreeStream stream_guardedAction=new RewriteRuleSubtreeStream(adaptor,"rule guardedAction");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1396:12: (lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1397:3: lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi
			{
			lif=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative9097); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(lif);

			pushFollow(FOLLOW_guardedAction_in_alternative9105);
			alt=guardedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
			if (list_alt==null) list_alt=new ArrayList<Object>();
			list_alt.add(alt.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1400:3: ( BOX alt+= guardedAction )+
			int cnt145=0;
			loop145:
			while (true) {
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==BOX) ) {
					alt145=1;
				}

				switch (alt145) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1400:5: BOX alt+= guardedAction
					{
					BOX291=(Token)match(input,BOX,FOLLOW_BOX_in_alternative9111); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOX.add(BOX291);

					pushFollow(FOLLOW_guardedAction_in_alternative9115);
					alt=guardedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTree());
					}
					break;

				default :
					if ( cnt145 >= 1 ) break loop145;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(145, input);
					throw eee;
				}
				cnt145++;
			}

			LITERAL_fi292=(Token)match(input,LITERAL_fi,FOLLOW_LITERAL_fi_in_alternative9123); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_fi.add(LITERAL_fi292);

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
			// 1402:5: -> ^( $lif ( $alt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1402:8: ^( $lif ( $alt)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1408:1: guardedAction : LPAREN ! expression GUARD ^ assertedAction ;
	public final BLESS3Parser.guardedAction_return guardedAction() throws RecognitionException {
		BLESS3Parser.guardedAction_return retval = new BLESS3Parser.guardedAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN293=null;
		Token GUARD295=null;
		ParserRuleReturnScope expression294 =null;
		ParserRuleReturnScope assertedAction296 =null;

		BAST LPAREN293_tree=null;
		BAST GUARD295_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1408:14: ( LPAREN ! expression GUARD ^ assertedAction )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1409:3: LPAREN ! expression GUARD ^ assertedAction
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN293=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_guardedAction9161); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_guardedAction9165);
			expression294=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression294.getTree());

			GUARD295=(Token)match(input,GUARD,FOLLOW_GUARD_in_guardedAction9167); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GUARD295_tree = (BAST)adaptor.create(GUARD295);
			root_0 = (BAST)adaptor.becomeRoot(GUARD295_tree, root_0);
			}

			pushFollow(FOLLOW_assertedAction_in_guardedAction9170);
			assertedAction296=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertedAction296.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1414:1: whileLoop : lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) ;
	public final BLESS3Parser.whileLoop_return whileLoop() throws RecognitionException {
		BLESS3Parser.whileLoop_return retval = new BLESS3Parser.whileLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lw=null;
		Token LPAREN297=null;
		Token RPAREN298=null;
		Token LITERAL_invariant299=null;
		Token LITERAL_bound300=null;
		ParserRuleReturnScope be =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope elq =null;

		BAST lw_tree=null;
		BAST LPAREN297_tree=null;
		BAST RPAREN298_tree=null;
		BAST LITERAL_invariant299_tree=null;
		BAST LITERAL_bound300_tree=null;
		RewriteRuleTokenStream stream_LITERAL_invariant=new RewriteRuleTokenStream(adaptor,"token LITERAL_invariant");
		RewriteRuleTokenStream stream_LITERAL_bound=new RewriteRuleTokenStream(adaptor,"token LITERAL_bound");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_LITERAL_while=new RewriteRuleTokenStream(adaptor,"token LITERAL_while");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1414:10: (lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1415:3: lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification
			{
			lw=(Token)match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop9194); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_while.add(lw);

			LPAREN297=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileLoop9200); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN297);

			pushFollow(FOLLOW_expression_in_whileLoop9205);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN298=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileLoop9207); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN298);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1418:3: ( LITERAL_invariant inv= assertion )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==LITERAL_invariant) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1418:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant299=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_whileLoop9214); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant299);

					pushFollow(FOLLOW_assertion_in_whileLoop9218);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1419:3: ( LITERAL_bound bd= expression )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==LITERAL_bound) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1419:5: LITERAL_bound bd= expression
					{
					LITERAL_bound300=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_whileLoop9227); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound300);

					pushFollow(FOLLOW_expression_in_whileLoop9232);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop9243);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: be, lw, bd, inv, elq
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
			// 1421:5: -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:8: ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lw.nextNode(), root_1);
				adaptor.addChild(root_1, stream_be.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:18: ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lw, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:48: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:54: ^( BOUND[$lw,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, lw, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1421:76: ( $bd)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1426:1: forLoop : lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) ;
	public final BLESS3Parser.forLoop_return forLoop() throws RecognitionException {
		BLESS3Parser.forLoop_return retval = new BLESS3Parser.forLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT301=null;
		Token LITERAL_invariant302=null;
		Token LCURLY303=null;
		Token RCURLY304=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope act =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT301_tree=null;
		BAST LITERAL_invariant302_tree=null;
		BAST LCURLY303_tree=null;
		BAST RCURLY304_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1426:8: (lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1427:3: lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY
			{
			lf=(Token)match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop9301); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_for.add(lf);

			pushFollow(FOLLOW_identifier_in_forLoop9308);
			a=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(a.getTree());
			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop9313); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_forLoop9318);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT301=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_forLoop9320); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT301);

			pushFollow(FOLLOW_expression_in_forLoop9325);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1429:3: ( LITERAL_invariant inv= assertion )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==LITERAL_invariant) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1429:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant302=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_forLoop9332); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant302);

					pushFollow(FOLLOW_assertion_in_forLoop9336);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			LCURLY303=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forLoop9343); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY303);

			pushFollow(FOLLOW_behaviorActions_in_forLoop9348);
			act=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(act.getTree());
			RCURLY304=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forLoop9350); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY304);

			// AST REWRITE
			// elements: inv, a, lb, ub, act, lf, li
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
			// 1431:5: -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:7: ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:16: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:31: ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lf, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1431:61: ( $inv)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1436:1: doUntilLoop : ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) ;
	public final BLESS3Parser.doUntilLoop_return doUntilLoop() throws RecognitionException {
		BLESS3Parser.doUntilLoop_return retval = new BLESS3Parser.doUntilLoop_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ld=null;
		Token lu=null;
		Token LITERAL_invariant305=null;
		Token LITERAL_bound306=null;
		Token LPAREN307=null;
		Token RPAREN308=null;
		ParserRuleReturnScope inv =null;
		ParserRuleReturnScope bd =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope be =null;

		BAST ld_tree=null;
		BAST lu_tree=null;
		BAST LITERAL_invariant305_tree=null;
		BAST LITERAL_bound306_tree=null;
		BAST LPAREN307_tree=null;
		BAST RPAREN308_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1436:12: (ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1437:3: ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN
			{
			ld=(Token)match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9413); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_do.add(ld);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1438:3: ( LITERAL_invariant inv= assertion )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==LITERAL_invariant) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1438:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant305=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_doUntilLoop9420); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant305);

					pushFollow(FOLLOW_assertion_in_doUntilLoop9424);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:3: ( LITERAL_bound bd= expression )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LITERAL_bound) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:5: LITERAL_bound bd= expression
					{
					LITERAL_bound306=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_doUntilLoop9433); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound306);

					pushFollow(FOLLOW_expression_in_doUntilLoop9438);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9449);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(ba.getTree());
			lu=(Token)match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9455); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_until.add(lu);

			LPAREN307=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doUntilLoop9457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN307);

			pushFollow(FOLLOW_expression_in_doUntilLoop9462);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doUntilLoop9464); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN308);

			// AST REWRITE
			// elements: inv, bd, ld, be, ba, lu
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
			// 1442:5: -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:7: ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ld.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:13: ^( $lu $be)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lu.nextNode(), root_2);
				adaptor.addChild(root_2, stream_be.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:24: ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, ld, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:54: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:60: ^( BOUND[$ld,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, ld, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:82: ( $bd)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:1: existentialLatticeQuantification : (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? ;
	public final BLESS3Parser.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		BLESS3Parser.existentialLatticeQuantification_return retval = new BLESS3Parser.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lc=null;
		Token RCURLY309=null;
		ParserRuleReturnScope qv =null;
		ParserRuleReturnScope ba =null;
		ParserRuleReturnScope cc =null;

		BAST lc_tree=null;
		BAST RCURLY309_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:33: ( (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:3: (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )?
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:5: (qv= quantifiedVariables )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LITERAL_declare) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:5: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9531);
					qv=quantifiedVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qv.getTree());

					}
					break;

			}

			lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification9538); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			lc_tree = (BAST)adaptor.create(lc);
			root_0 = (BAST)adaptor.becomeRoot(lc_tree, root_0);
			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification9544);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ba.getTree());

			RCURLY309=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification9546); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RCURLY309_tree = (BAST)adaptor.create(RCURLY309);
			adaptor.addChild(root_0, RCURLY309_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1451:5: (cc= catchClause )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==LITERAL_catch) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1451:5: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification9554);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1456:1: universalLatticeQuantification : lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) ;
	public final BLESS3Parser.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		BLESS3Parser.universalLatticeQuantification_return retval = new BLESS3Parser.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lf=null;
		Token li=null;
		Token DOTDOT310=null;
		Token lv=null;
		List<Object> list_lv=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope elq =null;

		BAST lf_tree=null;
		BAST li_tree=null;
		BAST DOTDOT310_tree=null;
		BAST lv_tree=null;
		RewriteRuleTokenStream stream_LITERAL_in=new RewriteRuleTokenStream(adaptor,"token LITERAL_in");
		RewriteRuleTokenStream stream_LITERAL_forall=new RewriteRuleTokenStream(adaptor,"token LITERAL_forall");
		RewriteRuleTokenStream stream_DOTDOT=new RewriteRuleTokenStream(adaptor,"token DOTDOT");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_existentialLatticeQuantification=new RewriteRuleSubtreeStream(adaptor,"rule existentialLatticeQuantification");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1456:31: (lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:3: lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification
			{
			lf=(Token)match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9579); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_forall.add(lf);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:5: (lv+= ID )+
			int cnt153=0;
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==ID) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:5: lv+= ID
					{
					lv=(Token)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9588); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(lv);

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt153 >= 1 ) break loop153;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(153, input);
					throw eee;
				}
				cnt153++;
			}

			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9593); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9597);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT310=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_universalLatticeQuantification9599); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT310);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9603);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9612);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: lv, li, elq, lf, ub, lb
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
			// 1461:5: -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1461:8: ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1461:19: ^( $li $lb $ub)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:1: issueException : LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN ;
	public final BLESS3Parser.issueException_return issueException() throws RecognitionException {
		BLESS3Parser.issueException_return retval = new BLESS3Parser.issueException_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token exception=null;
		Token message=null;
		Token LITERAL_exception311=null;
		Token LPAREN312=null;
		Token RPAREN313=null;

		BAST exception_tree=null;
		BAST message_tree=null;
		BAST LITERAL_exception311_tree=null;
		BAST LPAREN312_tree=null;
		BAST RPAREN313_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:15: ( LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:2: LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_exception311=(Token)match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9661); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_exception311_tree = (BAST)adaptor.create(LITERAL_exception311);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_exception311_tree, root_0);
			}

			LPAREN312=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_issueException9664); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN312_tree = (BAST)adaptor.create(LPAREN312);
			adaptor.addChild(root_0, LPAREN312_tree);
			}

			exception=(Token)match(input,ID,FOLLOW_ID_in_issueException9668); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			exception_tree = (BAST)adaptor.create(exception);
			adaptor.addChild(root_0, exception_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1468:10: (message= AADL_STRING_LITERAL )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==AADL_STRING_LITERAL) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1468:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9676); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			RPAREN313=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_issueException9679); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN313_tree = (BAST)adaptor.create(RPAREN313);
			adaptor.addChild(root_0, RPAREN313_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:1: blessSubclause : (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1474:15: ( (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:2: (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:10: (no_proof= DO_NOT_PROVE )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==DO_NOT_PROVE) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:10: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9693); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:5: (ac= assertClause )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LITERAL_assert) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:5: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_blessSubclause9700);
					ac=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(ac.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1477:6: (inv= invariantClause )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==LITERAL_invariant) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1477:6: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_blessSubclause9709);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invariantClause.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1478:5: (vs= variablesSection )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==LITERAL_variables) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1478:5: vs= variablesSection
					{
					pushFollow(FOLLOW_variablesSection_in_blessSubclause9716);
					vs=variablesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variablesSection.add(vs.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1479:5: (ss= statesSection )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==LITERAL_states) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1479:5: ss= statesSection
					{
					pushFollow(FOLLOW_statesSection_in_blessSubclause9723);
					ss=statesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statesSection.add(ss.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1480:4: (t= transitions )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==LITERAL_transitions) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1480:4: t= transitions
					{
					pushFollow(FOLLOW_transitions_in_blessSubclause9730);
					t=transitions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_transitions.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: vs, ac, t, ss, no_proof, inv
			// token labels: no_proof
			// rule labels: ss, inv, ac, t, vs, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_no_proof=new RewriteRuleTokenStream(adaptor,"token no_proof",no_proof);
			RewriteRuleSubtreeStream stream_ss=new RewriteRuleSubtreeStream(adaptor,"rule ss",ss!=null?ss.getTree():null);
			RewriteRuleSubtreeStream stream_inv=new RewriteRuleSubtreeStream(adaptor,"rule inv",inv!=null?inv.getTree():null);
			RewriteRuleSubtreeStream stream_ac=new RewriteRuleSubtreeStream(adaptor,"rule ac",ac!=null?ac.getTree():null);
			RewriteRuleSubtreeStream stream_t=new RewriteRuleSubtreeStream(adaptor,"rule t",t!=null?t.getTree():null);
			RewriteRuleSubtreeStream stream_vs=new RewriteRuleSubtreeStream(adaptor,"rule vs",vs!=null?vs.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (BAST)adaptor.nil();
			// 1481:5: -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1481:8: ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:1: invariantClause : LITERAL_invariant ^ assertion ;
	public final BLESS3Parser.invariantClause_return invariantClause() throws RecognitionException {
		BLESS3Parser.invariantClause_return retval = new BLESS3Parser.invariantClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_invariant314=null;
		ParserRuleReturnScope assertion315 =null;

		BAST LITERAL_invariant314_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:16: ( LITERAL_invariant ^ assertion )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1485:3: LITERAL_invariant ^ assertion
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_invariant314=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9772); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_invariant314_tree = (BAST)adaptor.create(LITERAL_invariant314);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_invariant314_tree, root_0);
			}

			pushFollow(FOLLOW_assertion_in_invariantClause9775);
			assertion315=assertion();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assertion315.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1488:1: variablesSection : LITERAL_variables ^ (vd+= variableDeclaration )+ ;
	public final BLESS3Parser.variablesSection_return variablesSection() throws RecognitionException {
		BLESS3Parser.variablesSection_return retval = new BLESS3Parser.variablesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_variables316=null;
		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		BAST LITERAL_variables316_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1488:17: ( LITERAL_variables ^ (vd+= variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1489:2: LITERAL_variables ^ (vd+= variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_variables316=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection9787); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_variables316_tree = (BAST)adaptor.create(LITERAL_variables316);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_variables316_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1489:23: (vd+= variableDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1489:23: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection9792);
					vd=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, vd.getTree());

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTree());
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:1: statesSection : LITERAL_states ^ (states+= behaviorState )+ ;
	public final BLESS3Parser.statesSection_return statesSection() throws RecognitionException {
		BLESS3Parser.statesSection_return retval = new BLESS3Parser.statesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_states317=null;
		List<Object> list_states=null;
		RuleReturnScope states = null;
		BAST LITERAL_states317_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:14: ( LITERAL_states ^ (states+= behaviorState )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:4: LITERAL_states ^ (states+= behaviorState )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_states317=(Token)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection9804); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_states317_tree = (BAST)adaptor.create(LITERAL_states317);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_states317_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:26: (states+= behaviorState )+
			int cnt162=0;
			loop162:
			while (true) {
				int alt162=2;
				int LA162_0 = input.LA(1);
				if ( (LA162_0==ID) ) {
					alt162=1;
				}

				switch (alt162) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection9809);
					states=behaviorState();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, states.getTree());

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTree());
					}
					break;

				default :
					if ( cnt162 >= 1 ) break loop162;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(162, input);
					throw eee;
				}
				cnt162++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1499:1: behaviorState : i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) ;
	public final BLESS3Parser.behaviorState_return behaviorState() throws RecognitionException {
		BLESS3Parser.behaviorState_return retval = new BLESS3Parser.behaviorState_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token init=null;
		Token com=null;
		Token finl=null;
		Token st=null;
		Token COLON318=null;
		Token SEMICOLON319=null;
		ParserRuleReturnScope i =null;
		ParserRuleReturnScope a =null;

		BAST init_tree=null;
		BAST com_tree=null;
		BAST finl_tree=null;
		BAST st_tree=null;
		BAST COLON318_tree=null;
		BAST SEMICOLON319_tree=null;
		RewriteRuleTokenStream stream_LITERAL_final=new RewriteRuleTokenStream(adaptor,"token LITERAL_final");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_LITERAL_state=new RewriteRuleTokenStream(adaptor,"token LITERAL_state");
		RewriteRuleTokenStream stream_LITERAL_initial=new RewriteRuleTokenStream(adaptor,"token LITERAL_initial");
		RewriteRuleTokenStream stream_LITERAL_complete=new RewriteRuleTokenStream(adaptor,"token LITERAL_complete");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_assertion=new RewriteRuleSubtreeStream(adaptor,"rule assertion");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1499:14: (i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1500:3: i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )?
			{
			pushFollow(FOLLOW_identifier_in_behaviorState9826);
			i=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(i.getTree());
			COLON318=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorState9831); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON318);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:9: (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )?
			int alt163=4;
			switch ( input.LA(1) ) {
				case LITERAL_initial:
					{
					alt163=1;
					}
					break;
				case LITERAL_complete:
					{
					alt163=2;
					}
					break;
				case LITERAL_final:
					{
					alt163=3;
					}
					break;
			}
			switch (alt163) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:10: init= LITERAL_initial
					{
					init=(Token)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState9836); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_initial.add(init);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:33: com= LITERAL_complete
					{
					com=(Token)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState9842); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_complete.add(com);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:56: finl= LITERAL_final
					{
					finl=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState9848); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(finl);

					}
					break;

			}

			st=(Token)match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState9854); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_state.add(st);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:95: (a= assertion )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==LASS) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:95: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState9858);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:107: ( SEMICOLON )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==SEMICOLON) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:107: SEMICOLON
					{
					SEMICOLON319=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorState9861); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON319);

					}
					break;

			}

			// AST REWRITE
			// elements: init, finl, a, i, LITERAL_state, com
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
			// 1502:5: -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:8: ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_state, st, "state["+Integer.toString(st.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:89: ( $init)?
				if ( stream_init.hasNext() ) {
					adaptor.addChild(root_1, stream_init.nextNode());
				}
				stream_init.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:96: ( $com)?
				if ( stream_com.hasNext() ) {
					adaptor.addChild(root_1, stream_com.nextNode());
				}
				stream_com.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:102: ( $finl)?
				if ( stream_finl.hasNext() ) {
					adaptor.addChild(root_1, stream_finl.nextNode());
				}
				stream_finl.reset();

				adaptor.addChild(root_1, stream_i.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1502:112: ( $a)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1507:1: transitions : t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1508:3: (t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1509:3: t= LITERAL_transitions (bt+= behaviorTransition )+
			{
			t=(Token)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions9922); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(t);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1509:27: (bt+= behaviorTransition )+
			int cnt166=0;
			loop166:
			while (true) {
				int alt166=2;
				int LA166_0 = input.LA(1);
				if ( (LA166_0==ID) ) {
					alt166=1;
				}

				switch (alt166) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1509:27: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions9926);
					bt=behaviorTransition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorTransition.add(bt.getTree());
					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTree());
					}
					break;

				default :
					if ( cnt166 >= 1 ) break loop166;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(166, input);
					throw eee;
				}
				cnt166++;
			}

			// AST REWRITE
			// elements: LITERAL_transitions, bt
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
			// 1510:5: -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1510:8: ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1517:1: behaviorTransition : id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) ;
	public final BLESS3Parser.behaviorTransition_return behaviorTransition() throws RecognitionException {
		BLESS3Parser.behaviorTransition_return retval = new BLESS3Parser.behaviorTransition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token x=null;
		Token semi=null;
		Token COLON320=null;
		Token COMMA321=null;
		Token RCON322=null;
		Token LCURLY323=null;
		Token RCURLY324=null;
		Token EMPTY_CURLY325=null;
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
		BAST COLON320_tree=null;
		BAST COMMA321_tree=null;
		BAST RCON322_tree=null;
		BAST LCURLY323_tree=null;
		BAST RCURLY324_tree=null;
		BAST EMPTY_CURLY325_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1518:3: (id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:4: id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_behaviorTransition9971); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:12: (pr= priority )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==LBRACKET) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:12: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition9975);
					pr=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_priority.add(pr.getTree());
					}
					break;

			}

			COLON320=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorTransition9978); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON320);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9986);
			ssi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
			if (list_ssi==null) list_ssi=new ArrayList<Object>();
			list_ssi.add(ssi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:36: ( COMMA ssi+= identifier )*
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==COMMA) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:38: COMMA ssi+= identifier
					{
					COMMA321=(Token)match(input,COMMA,FOLLOW_COMMA_in_behaviorTransition9990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA321);

					pushFollow(FOLLOW_identifier_in_behaviorTransition9995);
					ssi=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi.getTree());
					}
					break;

				default :
					break loop168;
				}
			}

			x=(Token)match(input,LCON,FOLLOW_LCON_in_behaviorTransition10004); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCON.add(x);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1521:12: (bc= behaviorCondition )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==AADL_STRING_LITERAL||LA169_0==ID||LA169_0==LBRACKET||LA169_0==LITERAL_abs||LA169_0==LITERAL_all||LA169_0==LITERAL_exists||LA169_0==LITERAL_false||(LA169_0 >= LITERAL_not && LA169_0 <= LITERAL_numberof)||LA169_0==LITERAL_on||LA169_0==LITERAL_product||LA169_0==LITERAL_round||LA169_0==LITERAL_self||LA169_0==LITERAL_sum||LA169_0==LITERAL_timeout||LA169_0==LITERAL_tops||(LA169_0 >= LITERAL_true && LA169_0 <= LITERAL_truncate)||LA169_0==LPAREN||LA169_0==MINUS||LA169_0==NUMBER||LA169_0==OCTOTHORPE) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1521:12: bc= behaviorCondition
					{
					pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition10008);
					bc=behaviorCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorCondition.add(bc.getTree());
					}
					break;

			}

			RCON322=(Token)match(input,RCON,FOLLOW_RCON_in_behaviorTransition10011); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCON.add(RCON322);

			pushFollow(FOLLOW_identifier_in_behaviorTransition10018);
			dsi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dsi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:3: ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY )
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==LCURLY) ) {
				alt170=1;
			}
			else if ( (LA170_0==EMPTY_CURLY) ) {
				alt170=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 170, 0, input);
				throw nvae;
			}

			switch (alt170) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:5: LCURLY s= behaviorActions RCURLY
					{
					LCURLY323=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behaviorTransition10025); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY323);

					pushFollow(FOLLOW_behaviorActions_in_behaviorTransition10029);
					s=behaviorActions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorActions.add(s.getTree());
					RCURLY324=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_behaviorTransition10031); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY324);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:39: EMPTY_CURLY
					{
					EMPTY_CURLY325=(Token)match(input,EMPTY_CURLY,FOLLOW_EMPTY_CURLY_in_behaviorTransition10035); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EMPTY_CURLY.add(EMPTY_CURLY325);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:4: (q= assertion )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==LASS) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:4: q= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorTransition10043);
					q=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(q.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:20: (semi= SEMICOLON )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==SEMICOLON) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1524:20: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorTransition10048); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: ssi, id, q, s, bc, dsi, pr
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
			// 1525:5: -> ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1526:7: ^( TRANSITION[$x,\"TRANSITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(TRANSITION, x, "TRANSITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:7: ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, x, "LABEL["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1527:82: ( $pr)?
				if ( stream_pr.hasNext() ) {
					adaptor.addChild(root_2, stream_pr.nextTree());
				}
				stream_pr.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1528:7: ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1529:7: ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITION, x, "CONDITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1529:86: ( $bc)?
				if ( stream_bc.hasNext() ) {
					adaptor.addChild(root_2, stream_bc.nextTree());
				}
				stream_bc.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1530:7: ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(DESTINATION, x, "DESTINATION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_dsi.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1531:7: ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, x, "ACTION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1531:80: ( $s)?
				if ( stream_s.hasNext() ) {
					adaptor.addChild(root_2, stream_s.nextTree());
				}
				stream_s.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1532:7: ^( Q[$semi,\"Q[\"+Integer.toString($semi.getLine()+startingLine)+\"]\"] ( $q)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, semi, "Q["+Integer.toString(semi.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1532:76: ( $q)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1543:1: priority : LBRACKET ^ NUMBER RBRACKET ;
	public final BLESS3Parser.priority_return priority() throws RecognitionException {
		BLESS3Parser.priority_return retval = new BLESS3Parser.priority_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET326=null;
		Token NUMBER327=null;
		Token RBRACKET328=null;

		BAST LBRACKET326_tree=null;
		BAST NUMBER327_tree=null;
		BAST RBRACKET328_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1543:9: ( LBRACKET ^ NUMBER RBRACKET )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1544:2: LBRACKET ^ NUMBER RBRACKET
			{
			root_0 = (BAST)adaptor.nil();


			LBRACKET326=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_priority10210); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACKET326_tree = (BAST)adaptor.create(LBRACKET326);
			root_0 = (BAST)adaptor.becomeRoot(LBRACKET326_tree, root_0);
			}

			NUMBER327=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_priority10213); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER327_tree = (BAST)adaptor.create(NUMBER327);
			adaptor.addChild(root_0, NUMBER327_tree);
			}

			RBRACKET328=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_priority10215); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RBRACKET328_tree = (BAST)adaptor.create(RBRACKET328);
			adaptor.addChild(root_0, RBRACKET328_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1547:1: behaviorCondition : ( dispatchCondition | executeCondition | modeCondition | internalCondition );
	public final BLESS3Parser.behaviorCondition_return behaviorCondition() throws RecognitionException {
		BLESS3Parser.behaviorCondition_return retval = new BLESS3Parser.behaviorCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope dispatchCondition329 =null;
		ParserRuleReturnScope executeCondition330 =null;
		ParserRuleReturnScope modeCondition331 =null;
		ParserRuleReturnScope internalCondition332 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1548:3: ( dispatchCondition | executeCondition | modeCondition | internalCondition )
			int alt173=4;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==LITERAL_on) ) {
				switch ( input.LA(2) ) {
				case LITERAL_dispatch:
					{
					alt173=1;
					}
					break;
				case LITERAL_internal:
					{
					alt173=4;
					}
					break;
				case ID:
				case LPAREN:
					{
					alt173=3;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 173, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA173_0==AADL_STRING_LITERAL||LA173_0==ID||LA173_0==LBRACKET||LA173_0==LITERAL_abs||LA173_0==LITERAL_all||LA173_0==LITERAL_exists||LA173_0==LITERAL_false||(LA173_0 >= LITERAL_not && LA173_0 <= LITERAL_numberof)||LA173_0==LITERAL_product||LA173_0==LITERAL_round||LA173_0==LITERAL_self||LA173_0==LITERAL_sum||LA173_0==LITERAL_timeout||LA173_0==LITERAL_tops||(LA173_0 >= LITERAL_true && LA173_0 <= LITERAL_truncate)||LA173_0==LPAREN||LA173_0==MINUS||LA173_0==NUMBER||LA173_0==OCTOTHORPE) ) {
				alt173=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 173, 0, input);
				throw nvae;
			}

			switch (alt173) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:3: dispatchCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition10230);
					dispatchCondition329=dispatchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchCondition329.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:23: executeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_executeCondition_in_behaviorCondition10234);
					executeCondition330=executeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, executeCondition330.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:42: modeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeCondition_in_behaviorCondition10238);
					modeCondition331=modeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modeCondition331.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:58: internalCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_internalCondition_in_behaviorCondition10242);
					internalCondition332=internalCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, internalCondition332.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1552:1: dispatchCondition : LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? ;
	public final BLESS3Parser.dispatchCondition_return dispatchCondition() throws RecognitionException {
		BLESS3Parser.dispatchCondition_return retval = new BLESS3Parser.dispatchCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on333=null;
		Token LITERAL_dispatch334=null;
		ParserRuleReturnScope de =null;

		BAST LITERAL_on333_tree=null;
		BAST LITERAL_dispatch334_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1552:18: ( LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1553:3: LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on333=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_dispatchCondition10254); if (state.failed) return retval;
			LITERAL_dispatch334=(Token)match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition10257); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_dispatch334_tree = (BAST)adaptor.create(LITERAL_dispatch334);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_dispatch334_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1553:35: (de= dispatchExpression )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==ID||LA174_0==LITERAL_timeout) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1553:35: de= dispatchExpression
					{
					pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition10262);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:1: dispatchExpression :dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? ;
	public final BLESS3Parser.dispatchExpression_return dispatchExpression() throws RecognitionException {
		BLESS3Parser.dispatchExpression_return retval = new BLESS3Parser.dispatchExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or335=null;
		Token LITERAL_or336=null;
		List<Object> list_dc=null;
		RuleReturnScope dc = null;
		BAST LITERAL_or335_tree=null;
		BAST LITERAL_or336_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:19: (dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:3: dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10280);
			dc=dispatchConjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

			if (list_dc==null) list_dc=new ArrayList<Object>();
			list_dc.add(dc.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:27: ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==LITERAL_or) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:29: LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )*
					{
					LITERAL_or335=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10284); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or335_tree = (BAST)adaptor.create(LITERAL_or335);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or335_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10289);
					dc=dispatchConjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

					if (list_dc==null) list_dc=new ArrayList<Object>();
					list_dc.add(dc.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1560:4: ( LITERAL_or !dc+= dispatchConjunction )*
					loop175:
					while (true) {
						int alt175=2;
						int LA175_0 = input.LA(1);
						if ( (LA175_0==LITERAL_or) ) {
							alt175=1;
						}

						switch (alt175) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1560:6: LITERAL_or !dc+= dispatchConjunction
							{
							LITERAL_or336=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10297); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10302);
							dc=dispatchConjunction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTree());
							}
							break;

						default :
							break loop175;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:1: dispatchConjunction :trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? ;
	public final BLESS3Parser.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		BLESS3Parser.dispatchConjunction_return retval = new BLESS3Parser.dispatchConjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and337=null;
		Token LITERAL_and338=null;
		List<Object> list_trigger=null;
		RuleReturnScope trigger = null;
		BAST LITERAL_and337_tree=null;
		BAST LITERAL_and338_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:20: (trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1566:3: trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10325);
			trigger=dispatchTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

			if (list_trigger==null) list_trigger=new ArrayList<Object>();
			list_trigger.add(trigger.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1567:5: ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==LITERAL_and) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1567:7: LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )*
					{
					LITERAL_and337=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and337_tree = (BAST)adaptor.create(LITERAL_and337);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and337_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10339);
					trigger=dispatchTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

					if (list_trigger==null) list_trigger=new ArrayList<Object>();
					list_trigger.add(trigger.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1568:6: ( LITERAL_and !trigger+= dispatchTrigger )*
					loop177:
					while (true) {
						int alt177=2;
						int LA177_0 = input.LA(1);
						if ( (LA177_0==LITERAL_and) ) {
							alt177=1;
						}

						switch (alt177) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1568:8: LITERAL_and !trigger+= dispatchTrigger
							{
							LITERAL_and338=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10349); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10354);
							trigger=dispatchTrigger();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

							if (list_trigger==null) list_trigger=new ArrayList<Object>();
							list_trigger.add(trigger.getTree());
							}
							break;

						default :
							break loop177;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:1: dispatchTrigger : (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )? );
	public final BLESS3Parser.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		BLESS3Parser.dispatchTrigger_return retval = new BLESS3Parser.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout339=null;
		Token LPAREN340=null;
		Token LITERAL_or341=null;
		Token RPAREN342=null;
		Token ports=null;
		List<Object> list_ports=null;
		ParserRuleReturnScope port =null;
		ParserRuleReturnScope time =null;

		BAST LITERAL_timeout339_tree=null;
		BAST LPAREN340_tree=null;
		BAST LITERAL_or341_tree=null;
		BAST RPAREN342_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1571:16: (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )? )
			int alt182=2;
			int LA182_0 = input.LA(1);
			if ( (LA182_0==ID) ) {
				alt182=1;
			}
			else if ( (LA182_0==LITERAL_timeout) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1572:3: port= portName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portName_in_dispatchTrigger10372);
					port=portName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, port.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1573:5: LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )?
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout339=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger10380); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout339_tree = (BAST)adaptor.create(LITERAL_timeout339);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_timeout339_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1574:4: ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )?
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==ID||LA181_0==LITERAL_self||LA181_0==LPAREN||LA181_0==NUMBER||LA181_0==OCTOTHORPE) ) {
						alt181=1;
					}
					switch (alt181) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1574:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1574:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)?
							int alt180=2;
							int LA180_0 = input.LA(1);
							if ( (LA180_0==LPAREN) ) {
								alt180=1;
							}
							switch (alt180) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1574:8: LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !
									{
									LPAREN340=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger10391); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LPAREN340_tree = (BAST)adaptor.create(LPAREN340);
									root_0 = (BAST)adaptor.becomeRoot(LPAREN340_tree, root_0);
									}

									ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10396); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ports_tree = (BAST)adaptor.create(ports);
									adaptor.addChild(root_0, ports_tree);
									}

									if (list_ports==null) list_ports=new ArrayList<Object>();
									list_ports.add(ports);
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1575:9: ( LITERAL_or !ports+= ID )*
									loop179:
									while (true) {
										int alt179=2;
										int LA179_0 = input.LA(1);
										if ( (LA179_0==LITERAL_or) ) {
											alt179=1;
										}

										switch (alt179) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1575:10: LITERAL_or !ports+= ID
											{
											LITERAL_or341=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchTrigger10408); if (state.failed) return retval;
											ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10413); if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											ports_tree = (BAST)adaptor.create(ports);
											adaptor.addChild(root_0, ports_tree);
											}

											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop179;
										}
									}

									RPAREN342=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dispatchTrigger10427); if (state.failed) return retval;
									}
									break;

							}

							pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10446);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:1: portName : port= ID ^ ( '[' index= NUMBER ']' )? ;
	public final BLESS3Parser.portName_return portName() throws RecognitionException {
		BLESS3Parser.portName_return retval = new BLESS3Parser.portName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token port=null;
		Token index=null;
		Token char_literal343=null;
		Token char_literal344=null;

		BAST port_tree=null;
		BAST index_tree=null;
		BAST char_literal343_tree=null;
		BAST char_literal344_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:9: (port= ID ^ ( '[' index= NUMBER ']' )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1583:3: port= ID ^ ( '[' index= NUMBER ']' )?
			{
			root_0 = (BAST)adaptor.nil();


			port=(Token)match(input,ID,FOLLOW_ID_in_portName10467); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			port_tree = (BAST)adaptor.create(port);
			root_0 = (BAST)adaptor.becomeRoot(port_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1584:3: ( '[' index= NUMBER ']' )?
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==LBRACKET) ) {
				alt183=1;
			}
			switch (alt183) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1584:5: '[' index= NUMBER ']'
					{
					char_literal343=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_portName10475); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal343_tree = (BAST)adaptor.create(char_literal343);
					adaptor.addChild(root_0, char_literal343_tree);
					}

					index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_portName10479); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					index_tree = (BAST)adaptor.create(index);
					adaptor.addChild(root_0, index_tree);
					}

					char_literal344=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_portName10481); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal344_tree = (BAST)adaptor.create(char_literal344);
					adaptor.addChild(root_0, char_literal344_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:1: executeCondition : expression ;
	public final BLESS3Parser.executeCondition_return executeCondition() throws RecognitionException {
		BLESS3Parser.executeCondition_return retval = new BLESS3Parser.executeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression345 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:17: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1588:15: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_executeCondition10496);
			expression345=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression345.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1591:1: modeCondition : LITERAL_on ^tle= triggerLogicalExpression ;
	public final BLESS3Parser.modeCondition_return modeCondition() throws RecognitionException {
		BLESS3Parser.modeCondition_return retval = new BLESS3Parser.modeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on346=null;
		ParserRuleReturnScope tle =null;

		BAST LITERAL_on346_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1591:14: ( LITERAL_on ^tle= triggerLogicalExpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1592:2: LITERAL_on ^tle= triggerLogicalExpression
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on346=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10507); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_on346_tree = (BAST)adaptor.create(LITERAL_on346);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_on346_tree, root_0);
			}

			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10512);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1595:1: triggerLogicalExpression : first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1595:25: (first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1596:3: first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			{
			pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10525);
			first=eventTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_eventTrigger.add(first.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1596:22: (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			int alt185=2;
			int LA185_0 = input.LA(1);
			if ( (LA185_0==LITERAL_and||LA185_0==LITERAL_or||LA185_0==LITERAL_xor) ) {
				alt185=1;
			}
			switch (alt185) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1596:24: op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)*
					{
					pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10531);
					op1=logicalOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalOperator.add(op1.getTree());
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10535);
					et=eventTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
					if (list_et==null) list_et=new ArrayList<Object>();
					list_et.add(et.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1597:5: (op2= logicalOperator et+= eventTrigger {...}?)*
					loop184:
					while (true) {
						int alt184=2;
						int LA184_0 = input.LA(1);
						if ( (LA184_0==LITERAL_and||LA184_0==LITERAL_or||LA184_0==LITERAL_xor) ) {
							alt184=1;
						}

						switch (alt184) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1597:6: op2= logicalOperator et+= eventTrigger {...}?
							{
							pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10545);
							op2=logicalOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicalOperator.add(op2.getTree());
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10549);
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
							break loop184;
						}
					}

					}
					break;

			}

			// AST REWRITE
			// elements: first, first, et, op1
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
			// 1598:5: -> {op1!=null}? ^( $op1 $first ( $et)+ )
			if (op1!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1598:21: ^( $op1 $first ( $et)+ )
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

			else // 1599:5: -> $first
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1606:1: logicalOperator : ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else );
	public final BLESS3Parser.logicalOperator_return logicalOperator() throws RecognitionException {
		BLESS3Parser.logicalOperator_return retval = new BLESS3Parser.logicalOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and347=null;
		Token LITERAL_or348=null;
		Token LITERAL_xor349=null;
		Token LITERAL_and350=null;
		Token LITERAL_then351=null;
		Token LITERAL_or352=null;
		Token LITERAL_else353=null;

		BAST LITERAL_and347_tree=null;
		BAST LITERAL_or348_tree=null;
		BAST LITERAL_xor349_tree=null;
		BAST LITERAL_and350_tree=null;
		BAST LITERAL_then351_tree=null;
		BAST LITERAL_or352_tree=null;
		BAST LITERAL_else353_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1607:3: ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else )
			int alt186=5;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				int LA186_1 = input.LA(2);
				if ( (LA186_1==LITERAL_then) ) {
					alt186=4;
				}
				else if ( (LA186_1==ID||LA186_1==LPAREN) ) {
					alt186=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 186, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_or:
				{
				int LA186_2 = input.LA(2);
				if ( (LA186_2==LITERAL_else) ) {
					alt186=5;
				}
				else if ( (LA186_2==ID||LA186_2==LPAREN) ) {
					alt186=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 186, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_xor:
				{
				alt186=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 186, 0, input);
				throw nvae;
			}
			switch (alt186) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1608:3: LITERAL_and
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and347=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10615); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and347_tree = (BAST)adaptor.create(LITERAL_and347);
					adaptor.addChild(root_0, LITERAL_and347_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1609:5: LITERAL_or
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or348=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10621); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or348_tree = (BAST)adaptor.create(LITERAL_or348);
					adaptor.addChild(root_0, LITERAL_or348_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1610:5: LITERAL_xor
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_xor349=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_logicalOperator10627); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor349_tree = (BAST)adaptor.create(LITERAL_xor349);
					adaptor.addChild(root_0, LITERAL_xor349_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1611:5: LITERAL_and ! LITERAL_then
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and350=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10633); if (state.failed) return retval;
					LITERAL_then351=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_logicalOperator10636); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then351_tree = (BAST)adaptor.create(LITERAL_then351);
					adaptor.addChild(root_0, LITERAL_then351_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1612:5: LITERAL_or ! LITERAL_else
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or352=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10642); if (state.failed) return retval;
					LITERAL_else353=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_logicalOperator10645); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else353_tree = (BAST)adaptor.create(LITERAL_else353);
					adaptor.addChild(root_0, LITERAL_else353_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1615:1: eventTrigger : (tr= modeTrigger | LPAREN ^ triggerLogicalExpression RPAREN );
	public final BLESS3Parser.eventTrigger_return eventTrigger() throws RecognitionException {
		BLESS3Parser.eventTrigger_return retval = new BLESS3Parser.eventTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN354=null;
		Token RPAREN356=null;
		ParserRuleReturnScope tr =null;
		ParserRuleReturnScope triggerLogicalExpression355 =null;

		BAST LPAREN354_tree=null;
		BAST RPAREN356_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1615:13: (tr= modeTrigger | LPAREN ^ triggerLogicalExpression RPAREN )
			int alt187=2;
			int LA187_0 = input.LA(1);
			if ( (LA187_0==ID) ) {
				alt187=1;
			}
			else if ( (LA187_0==LPAREN) ) {
				alt187=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 187, 0, input);
				throw nvae;
			}

			switch (alt187) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1616:3: tr= modeTrigger
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeTrigger_in_eventTrigger10660);
					tr=modeTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tr.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1617:5: LPAREN ^ triggerLogicalExpression RPAREN
					{
					root_0 = (BAST)adaptor.nil();


					LPAREN354=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger10666); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN354_tree = (BAST)adaptor.create(LPAREN354);
					root_0 = (BAST)adaptor.becomeRoot(LPAREN354_tree, root_0);
					}

					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger10669);
					triggerLogicalExpression355=triggerLogicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, triggerLogicalExpression355.getTree());

					RPAREN356=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger10671); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN356_tree = (BAST)adaptor.create(RPAREN356);
					adaptor.addChild(root_0, RPAREN356_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1620:1: internalCondition : LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* ;
	public final BLESS3Parser.internalCondition_return internalCondition() throws RecognitionException {
		BLESS3Parser.internalCondition_return retval = new BLESS3Parser.internalCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on357=null;
		Token LITERAL_internal358=null;
		Token LITERAL_or359=null;
		Token ports=null;
		List<Object> list_ports=null;

		BAST LITERAL_on357_tree=null;
		BAST LITERAL_internal358_tree=null;
		BAST LITERAL_or359_tree=null;
		BAST ports_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1620:18: ( LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1621:2: LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )*
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on357=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_internalCondition10682); if (state.failed) return retval;
			LITERAL_internal358=(Token)match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10685); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_internal358_tree = (BAST)adaptor.create(LITERAL_internal358);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_internal358_tree, root_0);
			}

			ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10690); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ports_tree = (BAST)adaptor.create(ports);
			adaptor.addChild(root_0, ports_tree);
			}

			if (list_ports==null) list_ports=new ArrayList<Object>();
			list_ports.add(ports);
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1622:3: ( LITERAL_or !ports+= ID )*
			loop188:
			while (true) {
				int alt188=2;
				int LA188_0 = input.LA(1);
				if ( (LA188_0==LITERAL_or) ) {
					alt188=1;
				}

				switch (alt188) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1622:5: LITERAL_or !ports+= ID
					{
					LITERAL_or359=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_internalCondition10697); if (state.failed) return retval;
					ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10702); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ports_tree = (BAST)adaptor.create(ports);
					adaptor.addChild(root_0, ports_tree);
					}

					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					break loop188;
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

	// $ANTLR start synpred63_BLESS3
	public final void synpred63_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:3: ( LASS ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:4: LASS ID COLON
		{
		match(input,LASS,FOLLOW_LASS_in_synpred63_BLESS34331); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred63_BLESS34333); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred63_BLESS34335); if (state.failed) return;

		}

	}
	// $ANTLR end synpred63_BLESS3

	// $ANTLR start synpred64_BLESS3
	public final void synpred64_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:840:5: ( LASS LITERAL_returns )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:840:6: LASS LITERAL_returns
		{
		match(input,LASS,FOLLOW_LASS_in_synpred64_BLESS34346); if (state.failed) return;

		match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_synpred64_BLESS34348); if (state.failed) return;

		}

	}
	// $ANTLR end synpred64_BLESS3

	// $ANTLR start synpred65_BLESS3
	public final void synpred65_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:5: ( LASS PLUS_ARROW )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:6: LASS PLUS_ARROW
		{
		match(input,LASS,FOLLOW_LASS_in_synpred65_BLESS34359); if (state.failed) return;

		match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_synpred65_BLESS34361); if (state.failed) return;

		}

	}
	// $ANTLR end synpred65_BLESS3

	// $ANTLR start synpred116_BLESS3
	public final void synpred116_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:3: ( LPAREN LITERAL_if )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1005:4: LPAREN LITERAL_if
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred116_BLESS35969); if (state.failed) return;

		match(input,LITERAL_if,FOLLOW_LITERAL_if_in_synpred116_BLESS35971); if (state.failed) return;

		}

	}
	// $ANTLR end synpred116_BLESS3

	// $ANTLR start synpred118_BLESS3
	public final void synpred118_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1007:5: ( LBRACKET ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1007:6: LBRACKET ID COLON
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred118_BLESS35989); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred118_BLESS35991); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred118_BLESS35993); if (state.failed) return;

		}

	}
	// $ANTLR end synpred118_BLESS3

	// $ANTLR start synpred119_BLESS3
	public final void synpred119_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1008:5: ( ID LPAREN )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1008:6: ID LPAREN
		{
		match(input,ID,FOLLOW_ID_in_synpred119_BLESS36005); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred119_BLESS36007); if (state.failed) return;

		}

	}
	// $ANTLR end synpred119_BLESS3

	// $ANTLR start synpred181_BLESS3
	public final void synpred181_BLESS3_fragment() throws RecognitionException {
		ParserRuleReturnScope q =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1218:3: (q= quantity )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1218:3: q= quantity
		{
		pushFollow(FOLLOW_quantity_in_synpred181_BLESS37642);
		q=quantity();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred181_BLESS3

	// $ANTLR start synpred182_BLESS3
	public final void synpred182_BLESS3_fragment() throws RecognitionException {
		Token u=null;
		ParserRuleReturnScope v =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:5: (v= valueName u= ID )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1220:5: v= valueName u= ID
		{
		pushFollow(FOLLOW_valueName_in_synpred182_BLESS37663);
		v=valueName();
		state._fsp--;
		if (state.failed) return;

		u=(Token)match(input,ID,FOLLOW_ID_in_synpred182_BLESS37667); if (state.failed) return;

		}

	}
	// $ANTLR end synpred182_BLESS3

	// $ANTLR start synpred183_BLESS3
	public final void synpred183_BLESS3_fragment() throws RecognitionException {
		Token s=null;
		ParserRuleReturnScope v =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:5: (v= valueName s= LITERAL_scalar )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:5: v= valueName s= LITERAL_scalar
		{
		pushFollow(FOLLOW_valueName_in_synpred183_BLESS37691);
		v=valueName();
		state._fsp--;
		if (state.failed) return;

		s=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_synpred183_BLESS37695); if (state.failed) return;

		}

	}
	// $ANTLR end synpred183_BLESS3

	// $ANTLR start synpred184_BLESS3
	public final void synpred184_BLESS3_fragment() throws RecognitionException {
		Token w=null;
		ParserRuleReturnScope v =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:5: (v= valueName w= LITERAL_whole )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1224:5: v= valueName w= LITERAL_whole
		{
		pushFollow(FOLLOW_valueName_in_synpred184_BLESS37720);
		v=valueName();
		state._fsp--;
		if (state.failed) return;

		w=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_synpred184_BLESS37724); if (state.failed) return;

		}

	}
	// $ANTLR end synpred184_BLESS3

	// Delegated rules

	public final boolean synpred65_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred181_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred181_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred183_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred183_BLESS3_fragment(); // can never throw exception
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
	public final boolean synpred118_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred118_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred119_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred119_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred63_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred63_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred64_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred64_BLESS3_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA96 dfa96 = new DFA96(this);
	static final String DFA96_eotS =
		"\64\uffff";
	static final String DFA96_eofS =
		"\1\uffff\1\10\3\uffff\1\16\11\uffff\1\16\2\uffff\1\10\2\uffff\1\10\5\uffff"+
		"\1\10\1\uffff\1\10\2\uffff\3\10\4\uffff\1\10\2\uffff\3\10\2\uffff\5\10";
	static final String DFA96_minS =
		"\1\73\1\10\1\73\1\u00e3\1\51\1\10\3\uffff\1\54\4\73\1\uffff\1\10\1\73"+
		"\1\54\1\10\1\u00e3\1\54\1\10\5\73\1\10\1\51\1\10\2\u00f5\3\10\4\73\1\10"+
		"\2\u00f5\3\10\2\u00f5\5\10";
	static final String DFA96_maxS =
		"\1\u00e3\1\u0112\1\73\2\u00e3\1\u0112\3\uffff\1\54\4\73\1\uffff\1\u0112"+
		"\1\73\1\54\1\u0112\1\u00e3\1\54\1\u0112\3\73\1\u00e1\1\u00d1\1\u0112\1"+
		"\u00e3\1\u0112\2\u00f5\3\u0112\1\u00e1\1\u00d1\1\u00e1\1\u00d1\1\u0112"+
		"\2\u00f5\3\u0112\2\u00f5\5\u0112";
	static final String DFA96_acceptS =
		"\6\uffff\1\2\1\3\1\4\5\uffff\1\1\45\uffff";
	static final String DFA96_specialS =
		"\64\uffff}>";
	static final String[] DFA96_transitionS = {
			"\1\4\166\uffff\1\3\56\uffff\1\1\1\uffff\1\2",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\2\uffff\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff\1\5\1"+
			"\10\10\uffff\1\10\2\uffff\1\10\14\uffff\1\10\2\uffff\1\10\16\uffff\1"+
			"\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2\uffff\2\10"+
			"\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff\1\10\1\uffff"+
			"\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10\2\uffff\1\10"+
			"\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7"+
			"\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\3\uffff"+
			"\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\11",
			"\1\12",
			"\1\14\2\uffff\1\13\u00b6\uffff\1\15",
			"\3\16\2\uffff\1\10\4\uffff\1\10\1\16\5\uffff\3\16\1\uffff\3\16\4\uffff"+
			"\1\16\2\uffff\1\16\2\10\2\16\6\uffff\1\16\1\10\1\16\3\uffff\2\16\1\uffff"+
			"\2\16\10\uffff\1\16\1\10\1\uffff\1\16\14\uffff\1\16\2\uffff\1\16\16\uffff"+
			"\1\16\4\uffff\1\16\3\uffff\3\16\1\uffff\1\16\5\uffff\5\16\2\uffff\2\16"+
			"\2\uffff\2\16\1\uffff\2\16\3\uffff\1\16\4\uffff\1\16\7\uffff\1\16\1\uffff"+
			"\1\16\16\uffff\1\16\11\uffff\1\16\1\uffff\1\16\2\uffff\1\16\5\uffff\3"+
			"\16\6\uffff\1\16\5\uffff\1\16\4\uffff\1\16\1\uffff\1\16\2\uffff\1\16"+
			"\1\10\1\16\2\uffff\1\16\1\uffff\1\16\3\uffff\1\16\3\uffff\1\16\1\uffff"+
			"\1\16\6\uffff\1\16\1\uffff\1\10\4\16\2\uffff\1\16\1\uffff\1\16\6\uffff"+
			"\1\17\1\10\1\16\14\uffff\1\16",
			"",
			"",
			"",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"",
			"\3\16\7\uffff\1\10\6\uffff\1\16\1\uffff\1\16\1\uffff\3\16\4\uffff\1"+
			"\16\2\uffff\1\16\2\uffff\2\16\6\uffff\1\16\1\uffff\1\16\3\uffff\2\16"+
			"\1\uffff\2\16\10\uffff\1\16\2\uffff\1\16\14\uffff\1\16\2\uffff\1\16\16"+
			"\uffff\1\16\3\uffff\1\10\1\16\3\uffff\3\16\1\uffff\1\16\5\uffff\5\16"+
			"\2\uffff\2\16\1\10\1\uffff\2\16\1\uffff\2\16\3\uffff\1\16\4\uffff\1\16"+
			"\7\uffff\1\16\1\uffff\1\16\16\uffff\1\16\11\uffff\1\16\1\uffff\1\16\2"+
			"\uffff\1\16\5\uffff\3\16\6\uffff\1\16\5\uffff\1\16\1\10\3\uffff\1\16"+
			"\1\uffff\1\16\2\uffff\1\16\1\uffff\1\16\2\uffff\1\16\1\uffff\1\16\3\uffff"+
			"\1\16\3\uffff\1\16\1\uffff\1\16\6\uffff\1\16\2\uffff\4\16\2\uffff\1\16"+
			"\1\uffff\1\16\10\uffff\1\16\14\uffff\1\16",
			"\1\25",
			"\1\26",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\2\uffff\2\10\1\27\5\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\2\uffff\1\10\14\uffff\1\10\2\uffff\1\10\16\uffff"+
			"\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2\uffff\2\10"+
			"\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff\1\10\1\uffff"+
			"\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10\2\uffff\1\10"+
			"\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7"+
			"\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\3\uffff"+
			"\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\15",
			"\1\30",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\32\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\31\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\37\u00a5\uffff\1\36",
			"\1\40\125\uffff\1\42\77\uffff\1\41",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\44\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\43\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\14\u00b9\uffff\1\15",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\46\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\45\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\47",
			"\1\47",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\32\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\31\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\32\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\31\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\32\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\31\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\51\u00a5\uffff\1\50",
			"\1\52\125\uffff\1\54\77\uffff\1\53",
			"\1\56\u00a5\uffff\1\55",
			"\1\57\125\uffff\1\61\77\uffff\1\60",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\32\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\31\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\62",
			"\1\62",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\44\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\43\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\44\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\43\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\44\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\43\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\1\63",
			"\1\63",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\46\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\45\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\46\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\45\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\46\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\45\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\44\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\43\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10",
			"\3\10\10\uffff\1\10\5\uffff\3\10\1\uffff\3\10\4\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\46\2\10\6\uffff\1\10\1\uffff\1\10\3\uffff\2\10\1\uffff"+
			"\1\5\1\10\10\uffff\1\10\1\45\1\uffff\1\10\14\uffff\1\10\2\uffff\1\10"+
			"\16\uffff\1\10\4\uffff\1\10\3\uffff\3\10\1\uffff\1\10\5\uffff\5\10\2"+
			"\uffff\2\10\2\uffff\2\10\1\uffff\2\10\3\uffff\1\10\4\uffff\1\10\7\uffff"+
			"\1\10\1\uffff\1\10\16\uffff\1\10\5\uffff\1\6\3\uffff\1\10\1\uffff\1\10"+
			"\2\uffff\1\10\5\uffff\3\10\6\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff"+
			"\1\10\1\7\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff"+
			"\1\10\3\uffff\1\10\1\uffff\1\10\6\uffff\1\10\2\uffff\4\10\2\uffff\1\10"+
			"\1\uffff\1\10\6\uffff\1\10\1\uffff\1\10\14\uffff\1\10"
	};

	static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
	static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
	static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
	static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
	static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
	static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
	static final short[][] DFA96_transition;

	static {
		int numStates = DFA96_transitionS.length;
		DFA96_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
		}
	}

	protected class DFA96 extends DFA {

		public DFA96(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 96;
			this.eot = DFA96_eot;
			this.eof = DFA96_eof;
			this.min = DFA96_min;
			this.max = DFA96_max;
			this.accept = DFA96_accept;
			this.special = DFA96_special;
			this.transition = DFA96_transition;
		}
		@Override
		public String getDescription() {
			return "1152:1: quantity : (num= aNumber u= ID -> ^( QUANTITY $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY $num $whole) |num= aNumber -> ^( QUANTITY $num) );";
		}
	}

	public static final BitSet FOLLOW_ID_in_propertyName2321 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_propertyName2325 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_propertyName2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_componentName2362 = new BitSet(new long[]{0x0000120000000002L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_componentName2368 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_componentName2372 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_componentName2376 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_componentName2380 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_DOT_in_componentName2391 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_componentName2395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_modeTrigger2491 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_DOT_in_modeTrigger2495 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_modeTrigger2498 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_DOT_in_modeTrigger2502 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_modeTrigger2504 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_ID_in_identifier2525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitDeclaration_in_unitLibrary2548 = new BitSet(new long[]{0x0800008000000002L,0x0080000010000000L});
	public static final BitSet FOLLOW_LT_in_unitName2587 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2592 = new BitSet(new long[]{0x0900000000000000L});
	public static final BitSet FOLLOW_GT_in_unitName2596 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula2635 = new BitSet(new long[]{0x0800008000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2642 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2646 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2684 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2688 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration2721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration2725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration2744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration2756 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration2760 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_rootDeclaration2763 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration2770 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration2774 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_rootDeclaration2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension2827 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_unitExtension2832 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension2836 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_unitExtension2839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor2873 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_unitName_in_unitFactor2877 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_mulDiv_in_unitFactor2881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor2885 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary2925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration2938 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_is_in_typeDeclaration2945 = new BitSet(new long[]{0x0000000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration2950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationType_in_type2962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type2968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type2974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type2980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type2986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type2992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type2998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference3010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference3016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType3029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_enumerationType3032 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationType3037 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_enumerationType3040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType3056 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0002000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_ID_in_quantityType3066 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000200000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType3072 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000200000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType3078 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x0000200000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_quantityType3086 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType3091 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType3095 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_quantityType3102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800200000000000L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType3112 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType3117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType3132 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_propertyName_in_quantityType3137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType3156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayType3159 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType3164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayType3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType3169 = new BitSet(new long[]{0x0800000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType3173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3189 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3193 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3198 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList3202 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList3207 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3227 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange3231 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange3236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_recordType3250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_recordType3266 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_recordField_in_recordType3271 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_recordType3274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_recordField3292 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_recordField3294 = new BitSet(new long[]{0x0800000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField3299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary3319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary3328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables3361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_variables_in_ghostVariables3364 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables3369 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable3382 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_ghostVariable3388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_TILDE_in_ghostVariable3390 = new BitSet(new long[]{0x0800000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable3395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namedAssertion3412 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3420 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3422 = new BitSet(new long[]{0x0800000008000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion3437 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3457 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion3462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion3482 = new BitSet(new long[]{0x0800000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion3486 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namedAssertion3488 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion3522 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion3530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_RASS_in_namedAssertion3544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_predicate3904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableList3925 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3929 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3934 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3938 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3943 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ID_in_variable3961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_TILDE_in_variable3963 = new BitSet(new long[]{0x0800000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable3968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue3979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue3985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_conditionalAssertionFunction3998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction4002 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_COMMA_in_conditionalAssertionFunction4006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction4010 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_conditionalAssertionFunction4015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionValuePair4043 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair4046 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair4048 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair4051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration4067 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration4071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration4098 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4102 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration4108 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4112 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration4116 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration4120 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ID_in_enumerationPair4157 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair4159 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair4162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_enumerationValue4176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue4178 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue4183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessAssertion4198 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion4202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessAssertion4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessFunction4234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction4238 = new BitSet(new long[]{0x0800000000000000L,0x0008000042000000L,0x2000028001000000L,0x0000000000082000L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction4242 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_namelessFunction4244 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction4248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessFunction4250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessEnumeration4291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_namelessEnumeration4295 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration4299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessEnumeration4301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion4339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion4352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion4365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion4371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_invocation4385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_invocation4387 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0400000A44000CA0L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4397 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_invocation4401 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4405 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_expression_in_invocation4419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_invocation4424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_actualParameter4460 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_actualParameter4462 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_actualParameter4467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression4485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression4493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression4501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression4509 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression4517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disjunction_in_expression4525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000140L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression4530 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression4535 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_disjunction_in_expression4541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification4557 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification4561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalQuantification4572 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_range_in_universalQuantification4576 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_universalQuantification4582 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4586 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification4597 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification4697 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification4701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_existentialQuantification4712 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_range_in_existentialQuantification4716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_which_in_existentialQuantification4722 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification4737 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification4837 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification4841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_sumQuantification4852 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_range_in_sumQuantification4856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_sumQuantification4862 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_sumQuantification4866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification4877 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_sumQuantification4881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification4977 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification4981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_productQuantification4992 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_range_in_productQuantification4996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_productQuantification5002 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_productQuantification5006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification5017 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_productQuantification5021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification5117 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification5121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_in_in_countingQuantification5132 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_range_in_countingQuantification5136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_which_in_countingQuantification5142 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_predicate_in_countingQuantification5146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification5157 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_countingQuantification5161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_logicVariables5257 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5261 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5266 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5270 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5275 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5297 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5314 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5319 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5323 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5328 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5349 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5352 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5357 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5361 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5364 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5390 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5399 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_relation_in_conjunction5428 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5438 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_relation_in_conjunction5443 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5447 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_relation_in_conjunction5452 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5470 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_relation_in_conjunction5475 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5482 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_relation_in_conjunction5487 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_addSub_in_relation5508 = new BitSet(new long[]{0x0104000000000302L,0x0000000000000000L,0x0000000000000200L,0x0000041108000000L});
	public static final BitSet FOLLOW_relationSymbol_in_relation5518 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_addSub_in_relation5521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation5535 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_range_in_relation5538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_range5553 = new BitSet(new long[]{0x00000C00C0000000L});
	public static final BitSet FOLLOW_rangeSymbol_in_range5555 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_subexpression_in_range5558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multDiv_in_addSub5568 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010040000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5580 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_multDiv_in_addSub5583 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5587 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_multDiv_in_addSub5590 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_MINUS_in_addSub5609 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_multDiv_in_addSub5612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5632 = new BitSet(new long[]{0x0000008000000002L,0x0001000000000000L,0x0000080000040000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5644 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5651 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5654 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_dividers_in_multDiv5672 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5718 = new BitSet(new long[]{0x0010000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5722 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5744 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000040L,0x0004000001800000L,0x0000000A040004A0L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5773 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000040L,0x0004000001800000L,0x0000000A040004A0L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5802 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000040L,0x0004000001800000L,0x0000000A040004A0L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5831 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000040L,0x0004000001800000L,0x0000000A040004A0L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_subexpression5857 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000040L,0x0004000001800000L,0x0000000A040004A0L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5924 = new BitSet(new long[]{0x0000000004080002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5932 = new BitSet(new long[]{0x0800000000000010L,0x0100000000040040L,0x0005000001C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5947 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject6011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject6019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6030 = new BitSet(new long[]{0x0800000000000010L,0x0120000400140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0402000000000000L});
	public static final BitSet FOLLOW_QQ_in_parenthesizedSubexpression6047 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6050 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_parenthesizedSubexpression6052 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_caseChoice6110 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_caseChoice6115 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6117 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_caseChoice6122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_caseChoice6124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression6140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_if_in_conditionalExpression6142 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_then_in_conditionalExpression6148 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6152 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_conditionalExpression6154 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression6162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_recordTerm6208 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_recordTerm6212 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_recordTerm6214 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6218 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_recordTerm6221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_recordValue6257 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6259 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A000004A0L});
	public static final BitSet FOLLOW_value_in_recordValue6262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_recordValue6266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_periodShift6289 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A040004A0L});
	public static final BitSet FOLLOW_value_in_periodShift6302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift6316 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift6320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift6324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6404 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L,0x0000080000040000L,0x0000010040000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6412 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6425 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6438 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6451 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6464 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6471 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6487 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6490 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6494 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6514 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6518 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationValue_in_value6577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6592 = new BitSet(new long[]{0x0000030000000002L,0x0000000000000040L,0x0000000000000000L,0x0008000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_valueName6610 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_valueName6618 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L,0x0000000000000000L,0x0008000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6630 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6636 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L,0x0000000000000000L,0x0008000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6646 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6652 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L,0x0000000000000000L,0x0008000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_valueName6668 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6672 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_valueName6676 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6680 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6724 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6950 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6954 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6959 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6966 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6971 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6989 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6997 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair7002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName7015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName7025 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName7029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName7031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName7038 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001800000L,0x0000000A440004A0L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName7042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName7044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_quantity_in_constant7092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant7100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant7108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant7116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant7124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7141 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity7145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyName_in_aNumber7284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7298 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7303 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7314 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7326 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7331 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7342 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_componentName_in_propertyReference7352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7358 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7363 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7375 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7390 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_ID_in_propertyField7402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_propertyField7411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propertyField7419 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000020000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ID_in_propertyField7426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7458 = new BitSet(new long[]{0x0000000000000000L,0x0000100004000100L,0x0000000300002000L,0x0000000000000010L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7465 = new BitSet(new long[]{0x0000000000000000L,0x0000100004000100L,0x0000000300002000L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7473 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L,0x0000000300002000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7488 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L,0x0000000100002000L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7503 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7519 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7597 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_throwsClause7602 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7620 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime7642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7663 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_behaviorTime7667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_behaviorTime7695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_behaviorTime7724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause7776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause7779 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7792 = new BitSet(new long[]{0x0800000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm7801 = new BitSet(new long[]{0x0800000008000000L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm7806 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7812 = new BitSet(new long[]{0x0800000000000000L,0x3C10008000000000L,0x00A0000000000000L,0x0000000000100001L,0x0000000000040000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7830 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7833 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7847 = new BitSet(new long[]{0x0000000000040002L,0x8000040000000020L,0x0140000000200000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7858 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7868 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7878 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7888 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration7898 = new BitSet(new long[]{0x0000000000040002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7912 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7916 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7926 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration7935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8042 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions8055 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions8064 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions8088 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8093 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions8097 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8101 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8124 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000100L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_action_in_assertedAction8133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicAction_in_action8255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8333 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction8337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_computation_in_basicAction8365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nameTick_in_assignment8390 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8392 = new BitSet(new long[]{0x0800000000000010L,0x0120000000540040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8407 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8413 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8417 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8421 = new BitSet(new long[]{0x0000000020040000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8425 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment8429 = new BitSet(new long[]{0x0000000020040000L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8437 = new BitSet(new long[]{0x0800000000000010L,0x0120000000540040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8443 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8447 = new BitSet(new long[]{0x0800000000000010L,0x0120000000540040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8451 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8455 = new BitSet(new long[]{0x0800000000000010L,0x0120000000540040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8459 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_nameTick8507 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_nameTick8511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8544 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_whenThrow8548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8552 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8556 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation8585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8588 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8593 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8595 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8600 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8602 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation8621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8624 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8629 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8631 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8636 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8638 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation8656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8659 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8664 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8666 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8671 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8673 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation8691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8694 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8699 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8701 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8706 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8708 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8715 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation8726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8729 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8734 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8736 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8741 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8743 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction8765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction8775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction8785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation8801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_computation8804 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8809 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_COMMA_in_computation8813 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_computation8823 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_in_in_computation8832 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation8835 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_componentName_in_computation8840 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_ID_in_subprogramCall8858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_subprogramCall8860 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001000000L,0x0400000A04000400L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall8864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_subprogramCall8867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8898 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8902 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001000000L,0x0000000A04000400L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8905 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8909 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001000000L,0x0000000A04000400L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8912 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_ID_in_formalActual8934 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_formalActual8942 = new BitSet(new long[]{0x0800000000000010L,0x0100000000000000L,0x0004000001000000L,0x0000000A04000400L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter8961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter8966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter8971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portOutput8987 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EXCLAMATION_in_portOutput8989 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_portOutput8993 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_portOutput8997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_portOutput8999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portInput9045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
	public static final BitSet FOLLOW_QUESTION_in_portInput9047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_portInput9049 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_valueName_in_portInput9054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_portInput9056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative9097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative9105 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_BOX_in_alternative9111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative9115 = new BitSet(new long[]{0x0000000002000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_LITERAL_fi_in_alternative9123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_guardedAction9161 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_guardedAction9165 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction9167 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction9170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop9194 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileLoop9200 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_whileLoop9205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_whileLoop9207 = new BitSet(new long[]{0x0000000000000000L,0x0000100080000100L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_whileLoop9214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9218 = new BitSet(new long[]{0x0000000000000000L,0x0000100080000100L});
	public static final BitSet FOLLOW_LITERAL_bound_in_whileLoop9227 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_whileLoop9232 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop9243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop9301 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_identifier_in_forLoop9308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop9313 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_forLoop9318 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_forLoop9320 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_forLoop9325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000002000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_forLoop9332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_forLoop9336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LCURLY_in_forLoop9343 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_forLoop9350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9413 = new BitSet(new long[]{0x0800000000000000L,0x3C12108080000120L,0x00A0000000002026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_doUntilLoop9420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9424 = new BitSet(new long[]{0x0800000000000000L,0x3C12108080000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_doUntilLoop9433 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9438 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_doUntilLoop9457 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_doUntilLoop9464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification9538 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification9544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification9546 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification9554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9579 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9588 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9593 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9597 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_universalLatticeQuantification9599 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x8005000803C00000L,0x0000000A44000CA0L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9603 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000100L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_issueException9664 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_issueException9668 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_issueException9679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9693 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L,0x0400000000002000L,0x0000000000040200L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9700 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000002000L,0x0000000000040200L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000040200L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9716 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0400000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection9787 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection9792 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection9804 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection9809 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_identifier_in_behaviorState9826 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorState9831 = new BitSet(new long[]{0x0000000000000000L,0x8000002000000000L,0x0200000000000800L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState9836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState9842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState9848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState9854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_assertion_in_behaviorState9858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorState9861 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions9922 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions9926 = new BitSet(new long[]{0x0800000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9971 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition9975 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorTransition9978 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9986 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_COMMA_in_behaviorTransition9990 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9995 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LCON_in_behaviorTransition10004 = new BitSet(new long[]{0x0800000000000010L,0x0120000000140040L,0x800500080BC00000L,0x0040000A44000CA0L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition10008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_RCON_in_behaviorTransition10011 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition10018 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_LCURLY_in_behaviorTransition10025 = new BitSet(new long[]{0x0800000000000000L,0x3C12108000000120L,0x00A0000000000026L,0x0000000000500001L,0x0000000000040000L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition10029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_RCURLY_in_behaviorTransition10031 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_EMPTY_CURLY_in_behaviorTransition10035 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition10043 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorTransition10048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_priority10210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_NUMBER_in_priority10213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_priority10215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition10230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition10234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition10238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition10242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_dispatchCondition10254 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition10257 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition10262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10280 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10284 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10289 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10297 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10302 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10334 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10339 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10349 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10354 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger10372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger10380 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x0004000000000000L,0x0000000A04000000L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger10391 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchTrigger10408 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_dispatchTrigger10427 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0004000000000000L,0x0000000A00000000L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10467 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
	public static final BitSet FOLLOW_LBRACKET_in_portName10475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_NUMBER_in_portName10479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_RBRACKET_in_portName10481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_executeCondition10496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10507 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000010000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10531 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10535 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000010000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10545 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10549 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L,0x0000000010000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_xor_in_logicalOperator10627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_then_in_logicalOperator10636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10642 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_logicalOperator10645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeTrigger_in_eventTrigger10660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger10666 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger10669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger10671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_internalCondition10682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10685 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_internalCondition10697 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LASS_in_synpred63_BLESS34331 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred63_BLESS34333 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_synpred63_BLESS34335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_synpred64_BLESS34346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_synpred64_BLESS34348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_synpred65_BLESS34359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_synpred65_BLESS34361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred116_BLESS35969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_if_in_synpred116_BLESS35971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred118_BLESS35989 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred118_BLESS35991 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_COLON_in_synpred118_BLESS35993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred119_BLESS36005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred119_BLESS36007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_synpred181_BLESS37642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_synpred182_BLESS37663 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred182_BLESS37667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_synpred183_BLESS37691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_synpred183_BLESS37695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_synpred184_BLESS37720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_synpred184_BLESS37724 = new BitSet(new long[]{0x0000000000000002L});
}
