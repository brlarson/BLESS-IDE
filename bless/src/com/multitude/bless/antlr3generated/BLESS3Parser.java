// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g 2024-10-03 13:21:43

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:576:1: relationSymbol : ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS );
	public final BLESS3Parser.relationSymbol_return relationSymbol() throws RecognitionException {
		BLESS3Parser.relationSymbol_return retval = new BLESS3Parser.relationSymbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set1=null;

		BAST set1_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:577:3: ( EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:582:1: rangeSymbol : ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA );
	public final BLESS3Parser.rangeSymbol_return rangeSymbol() throws RecognitionException {
		BLESS3Parser.rangeSymbol_return retval = new BLESS3Parser.rangeSymbol_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set2=null;

		BAST set2_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:582:13: ( DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:584:1: propertyName : propertyset= ID dc= DOUBLE_COLON propertyid= ID -> ^( $dc $propertyset $propertyid) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:585:3: (propertyset= ID dc= DOUBLE_COLON propertyid= ID -> ^( $dc $propertyset $propertyid) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:586:3: propertyset= ID dc= DOUBLE_COLON propertyid= ID
			{
			propertyset=(Token)match(input,ID,FOLLOW_ID_in_propertyName2067); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(propertyset);

			dc=(Token)match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_propertyName2071); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOUBLE_COLON.add(dc);

			propertyid=(Token)match(input,ID,FOLLOW_ID_in_propertyName2075); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(propertyid);

			// AST REWRITE
			// elements: dc, propertyid, propertyset
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
			// 587:5: -> ^( $dc $propertyset $propertyid)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:587:8: ^( $dc $propertyset $propertyid)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:590:1: componentName : id= ID (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )? (dot= DOT imp= ID )? -> {dc!=null&&dot!=null}? ^( $dc $id ( $id2)* ^( $dot $imp) ) -> {dc!=null&&dot==null}? ^( $dc $id ( $id2)* ) -> {dc==null&&dot!=null}? ^( $id ^( $dot $imp) ) -> $id;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:591:3: (id= ID (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )? (dot= DOT imp= ID )? -> {dc!=null&&dot!=null}? ^( $dc $id ( $id2)* ^( $dot $imp) ) -> {dc!=null&&dot==null}? ^( $dc $id ( $id2)* ) -> {dc==null&&dot!=null}? ^( $id ^( $dot $imp) ) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:2: id= ID (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )? (dot= DOT imp= ID )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_componentName2108); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:8: (dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID ) )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==DOUBLE_COLON) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:10: dc= DOUBLE_COLON id2+= ID ( DOUBLE_COLON id2+= ID )
					{
					dc=(Token)match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_componentName2114); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE_COLON.add(dc);

					id2=(Token)match(input,ID,FOLLOW_ID_in_componentName2118); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(id2);

					if (list_id2==null) list_id2=new ArrayList<Object>();
					list_id2.add(id2);
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:34: ( DOUBLE_COLON id2+= ID )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:36: DOUBLE_COLON id2+= ID
					{
					DOUBLE_COLON3=(Token)match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_componentName2122); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE_COLON.add(DOUBLE_COLON3);

					id2=(Token)match(input,ID,FOLLOW_ID_in_componentName2126); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(id2);

					if (list_id2==null) list_id2=new ArrayList<Object>();
					list_id2.add(id2);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:63: (dot= DOT imp= ID )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==DOT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:592:64: dot= DOT imp= ID
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_componentName2137); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					imp=(Token)match(input,ID,FOLLOW_ID_in_componentName2141); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(imp);

					}
					break;

			}

			// AST REWRITE
			// elements: dot, dot, dc, dc, id2, imp, id, id2, id, imp, id, id
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
			// 593:4: -> {dc!=null&&dot!=null}? ^( $dc $id ( $id2)* ^( $dot $imp) )
			if (dc!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:593:31: ^( $dc $id ( $id2)* ^( $dot $imp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_dc.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:593:42: ( $id2)*
				while ( stream_id2.hasNext() ) {
					adaptor.addChild(root_1, stream_id2.nextNode());
				}
				stream_id2.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:593:47: ^( $dot $imp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				adaptor.addChild(root_2, stream_imp.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 594:4: -> {dc!=null&&dot==null}? ^( $dc $id ( $id2)* )
			if (dc!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:594:31: ^( $dc $id ( $id2)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_dc.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:594:42: ( $id2)*
				while ( stream_id2.hasNext() ) {
					adaptor.addChild(root_1, stream_id2.nextNode());
				}
				stream_id2.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 595:4: -> {dc==null&&dot!=null}? ^( $id ^( $dot $imp) )
			if (dc==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:595:31: ^( $id ^( $dot $imp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:595:37: ^( $dot $imp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_dot.nextNode(), root_2);
				adaptor.addChild(root_2, stream_imp.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 596:4: -> $id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:599:1: modeTrigger : ID ( DOT ^ ID ( DOT ID )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:600:3: ( ID ( DOT ^ ID ( DOT ID )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:3: ID ( DOT ^ ID ( DOT ID )* )?
			{
			root_0 = (BAST)adaptor.nil();


			ID4=(Token)match(input,ID,FOLLOW_ID_in_modeTrigger2237); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID4_tree = (BAST)adaptor.create(ID4);
			adaptor.addChild(root_0, ID4_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:6: ( DOT ^ ID ( DOT ID )* )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DOT) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:8: DOT ^ ID ( DOT ID )*
					{
					DOT5=(Token)match(input,DOT,FOLLOW_DOT_in_modeTrigger2241); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT5_tree = (BAST)adaptor.create(DOT5);
					root_0 = (BAST)adaptor.becomeRoot(DOT5_tree, root_0);
					}

					ID6=(Token)match(input,ID,FOLLOW_ID_in_modeTrigger2244); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID6_tree = (BAST)adaptor.create(ID6);
					adaptor.addChild(root_0, ID6_tree);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:16: ( DOT ID )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==DOT) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:601:18: DOT ID
							{
							DOT7=(Token)match(input,DOT,FOLLOW_DOT_in_modeTrigger2248); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DOT7_tree = (BAST)adaptor.create(DOT7);
							adaptor.addChild(root_0, DOT7_tree);
							}

							ID8=(Token)match(input,ID,FOLLOW_ID_in_modeTrigger2250); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:604:1: identifier : ID ;
	public final BLESS3Parser.identifier_return identifier() throws RecognitionException {
		BLESS3Parser.identifier_return retval = new BLESS3Parser.identifier_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID9=null;

		BAST ID9_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:605:3: ( ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:605:5: ID
			{
			root_0 = (BAST)adaptor.nil();


			ID9=(Token)match(input,ID,FOLLOW_ID_in_identifier2271); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:611:1: unitLibrary : (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY[\"UNIT_LIBRARY\"] ( $unitDeclarations)+ ) ;
	public final BLESS3Parser.unitLibrary_return unitLibrary() throws RecognitionException {
		BLESS3Parser.unitLibrary_return retval = new BLESS3Parser.unitLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_unitDeclarations=null;
		RuleReturnScope unitDeclarations = null;
		RewriteRuleSubtreeStream stream_unitDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule unitDeclaration");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:611:12: ( (unitDeclarations+= unitDeclaration )+ -> ^( UNIT_LIBRARY[\"UNIT_LIBRARY\"] ( $unitDeclarations)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:3: (unitDeclarations+= unitDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:19: (unitDeclarations+= unitDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:612:19: unitDeclarations+= unitDeclaration
					{
					pushFollow(FOLLOW_unitDeclaration_in_unitLibrary2294);
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
			// 613:5: -> ^( UNIT_LIBRARY[\"UNIT_LIBRARY\"] ( $unitDeclarations)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:613:8: ^( UNIT_LIBRARY[\"UNIT_LIBRARY\"] ( $unitDeclarations)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:616:1: unitName : (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME[\"UNIT_NAME\"] $id ( $longname)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:617:3: ( (lt= LT (longname+= ID )+ GT )? id= ID -> ^( UNIT_NAME[\"UNIT_NAME\"] $id ( $longname)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:618:3: (lt= LT (longname+= ID )+ GT )? id= ID
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:618:3: (lt= LT (longname+= ID )+ GT )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LT) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:618:5: lt= LT (longname+= ID )+ GT
					{
					lt=(Token)match(input,LT,FOLLOW_LT_in_unitName2334); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LT.add(lt);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:618:11: (longname+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:618:12: longname+= ID
							{
							longname=(Token)match(input,ID,FOLLOW_ID_in_unitName2339); if (state.failed) return retval; 
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

					GT10=(Token)match(input,GT,FOLLOW_GT_in_unitName2343); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GT.add(GT10);

					}
					break;

			}

			id=(Token)match(input,ID,FOLLOW_ID_in_unitName2350); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// AST REWRITE
			// elements: id, longname
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
			// 619:5: -> ^( UNIT_NAME[\"UNIT_NAME\"] $id ( $longname)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:619:8: ^( UNIT_NAME[\"UNIT_NAME\"] $id ( $longname)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNIT_NAME, "UNIT_NAME"), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:619:39: ( $longname)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:622:1: unitFormula : ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA[\"UNIT_FORMULA\"] ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA[\"UNIT_FORMULA\"] $slash ( $bottom)+ ) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:622:12: ( (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )? -> ^( UNIT_FORMULA[\"UNIT_FORMULA\"] ( $top)+ ( $slash)? ( $bottom)* ) |slash= DIVIDE (bottom+= ID )+ -> ^( UNIT_FORMULA[\"UNIT_FORMULA\"] $slash ( $bottom)+ ) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:3: (top+= ID )+ (slash= DIVIDE (bottom+= ID )+ )?
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:6: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:6: top+= ID
							{
							top=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2383); if (state.failed) return retval; 
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

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:12: (slash= DIVIDE (bottom+= ID )+ )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==DIVIDE) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:14: slash= DIVIDE (bottom+= ID )+
							{
							slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2390); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:33: (bottom+= ID )+
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
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:623:33: bottom+= ID
									{
									bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2394); if (state.failed) return retval; 
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
					// elements: top, slash, bottom
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
					// 624:5: -> ^( UNIT_FORMULA[\"UNIT_FORMULA\"] ( $top)+ ( $slash)? ( $bottom)* )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:624:8: ^( UNIT_FORMULA[\"UNIT_FORMULA\"] ( $top)+ ( $slash)? ( $bottom)* )
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

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:624:47: ( $slash)?
						if ( stream_slash.hasNext() ) {
							adaptor.addChild(root_1, stream_slash.nextNode());
						}
						stream_slash.reset();

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:624:55: ( $bottom)*
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:3: slash= DIVIDE (bottom+= ID )+
					{
					slash=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula2433); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DIVIDE.add(slash);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:22: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:626:22: bottom+= ID
							{
							bottom=(Token)match(input,ID,FOLLOW_ID_in_unitFormula2437); if (state.failed) return retval; 
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
					// elements: bottom, slash
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
					// 627:5: -> ^( UNIT_FORMULA[\"UNIT_FORMULA\"] $slash ( $bottom)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:627:8: ^( UNIT_FORMULA[\"UNIT_FORMULA\"] $slash ( $bottom)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:630:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final BLESS3Parser.unitDeclaration_return unitDeclaration() throws RecognitionException {
		BLESS3Parser.unitDeclaration_return retval = new BLESS3Parser.unitDeclaration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope rootDeclaration11 =null;
		ParserRuleReturnScope unitExtension12 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:630:16: ( rootDeclaration | unitExtension )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:3: rootDeclaration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration2471);
					rootDeclaration11=rootDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rootDeclaration11.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:631:21: unitExtension
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_unitExtension_in_unitDeclaration2475);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:1: rootDeclaration : (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION[\"ROOT_DECLARATION\"] ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:634:16: ( (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON -> ^( ROOT_DECLARATION[\"ROOT_DECLARATION\"] ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:3: (base= LITERAL_base |formula= unitFormula ) lb= LBRACKET (kindWords+= ID )+ RBRACKET unit= unitName (factors+= unitFactor )* SEMICOLON
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:3: (base= LITERAL_base |formula= unitFormula )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:5: base= LITERAL_base
					{
					base=(Token)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration2494); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_base.add(base);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:25: formula= unitFormula
					{
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration2500);
					formula=unitFormula();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unitFormula.add(formula.getTree());
					}
					break;

			}

			lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration2506); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:68: (kindWords+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:635:68: kindWords+= ID
					{
					kindWords=(Token)match(input,ID,FOLLOW_ID_in_rootDeclaration2510); if (state.failed) return retval; 
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

			RBRACKET13=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_rootDeclaration2513); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET13);

			pushFollow(FOLLOW_unitName_in_rootDeclaration2520);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:636:24: (factors+= unitFactor )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:636:24: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_rootDeclaration2524);
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

			SEMICOLON14=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_rootDeclaration2527); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON14);

			// AST REWRITE
			// elements: formula, factors, kindWords, unit, base, lb
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
			// 637:5: -> ^( ROOT_DECLARATION[\"ROOT_DECLARATION\"] ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:637:8: ^( ROOT_DECLARATION[\"ROOT_DECLARATION\"] ( $base)? ( $formula)? ^( $lb ( $kindWords)+ ) $unit ( $factors)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ROOT_DECLARATION, "ROOT_DECLARATION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:637:49: ( $base)?
				if ( stream_base.hasNext() ) {
					adaptor.addChild(root_1, stream_base.nextNode());
				}
				stream_base.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:637:56: ( $formula)?
				if ( stream_formula.hasNext() ) {
					adaptor.addChild(root_1, stream_formula.nextTree());
				}
				stream_formula.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:637:65: ^( $lb ( $kindWords)+ )
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
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:637:93: ( $factors)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:640:1: unitExtension : LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:640:14: ( LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:641:3: LITERAL_extension ^root= ID (factors+= unitFactor )+ SEMICOLON !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_extension15=(Token)match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension2578); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_extension15_tree = (BAST)adaptor.create(LITERAL_extension15);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_extension15_tree, root_0);
			}

			root=(Token)match(input,ID,FOLLOW_ID_in_unitExtension2583); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			root_tree = (BAST)adaptor.create(root);
			adaptor.addChild(root_0, root_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:641:37: (factors+= unitFactor )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:641:37: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension2587);
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

			SEMICOLON16=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_unitExtension2590); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:1: mulDiv : ( TIMES | DIVIDE ) ;
	public final BLESS3Parser.mulDiv_return mulDiv() throws RecognitionException {
		BLESS3Parser.mulDiv_return retval = new BLESS3Parser.mulDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set17=null;

		BAST set17_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:644:7: ( ( TIMES | DIVIDE ) )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:647:1: unitFactor : c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:647:11: (c= COMMA unit= unitName op= mulDiv factor= NUMBER -> ^( $c $unit $op $factor) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:648:3: c= COMMA unit= unitName op= mulDiv factor= NUMBER
			{
			c=(Token)match(input,COMMA,FOLLOW_COMMA_in_unitFactor2624); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(c);

			pushFollow(FOLLOW_unitName_in_unitFactor2628);
			unit=unitName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unitName.add(unit.getTree());
			pushFollow(FOLLOW_mulDiv_in_unitFactor2632);
			op=mulDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_mulDiv.add(op.getTree());
			factor=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor2636); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NUMBER.add(factor);

			// AST REWRITE
			// elements: c, unit, op, factor
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
			// 649:5: -> ^( $c $unit $op $factor)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:649:8: ^( $c $unit $op $factor)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:1: typeLibrary : (decs+= typeDeclaration )+ ;
	public final BLESS3Parser.typeLibrary_return typeLibrary() throws RecognitionException {
		BLESS3Parser.typeLibrary_return retval = new BLESS3Parser.typeLibrary_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		List<Object> list_decs=null;
		RuleReturnScope decs = null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:654:12: ( (decs+= typeDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:3: (decs+= typeDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:7: (decs+= typeDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:655:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary2676);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:658:1: typeDeclaration : LITERAL_type ^id= ID LITERAL_is !ty= type ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:658:16: ( LITERAL_type ^id= ID LITERAL_is !ty= type )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:659:3: LITERAL_type ^id= ID LITERAL_is !ty= type
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_type18=(Token)match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration2689); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_type18_tree = (BAST)adaptor.create(LITERAL_type18);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_type18_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_typeDeclaration2694); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			LITERAL_is19=(Token)match(input,LITERAL_is,FOLLOW_LITERAL_is_in_typeDeclaration2696); if (state.failed) return retval;
			pushFollow(FOLLOW_type_in_typeDeclaration2701);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:1: type : ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:662:5: ( enumerationType | quantityType | arrayType | recordType | LITERAL_boolean | LITERAL_string | LITERAL_null )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:663:3: enumerationType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationType_in_type2713);
					enumerationType20=enumerationType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationType20.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:664:5: quantityType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantityType_in_type2719);
					quantityType21=quantityType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantityType21.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:665:5: arrayType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_arrayType_in_type2725);
					arrayType22=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType22.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:666:5: recordType
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordType_in_type2731);
					recordType23=recordType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType23.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:667:5: LITERAL_boolean
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_boolean24=(Token)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type2737); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_boolean24_tree = (BAST)adaptor.create(LITERAL_boolean24);
					adaptor.addChild(root_0, LITERAL_boolean24_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:668:5: LITERAL_string
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_string25=(Token)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type2743); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_string25_tree = (BAST)adaptor.create(LITERAL_string25);
					adaptor.addChild(root_0, LITERAL_string25_tree);
					}

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:669:5: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null26=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type2749); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:1: typeOrReference : (ty= type |ref= ID );
	public final BLESS3Parser.typeOrReference_return typeOrReference() throws RecognitionException {
		BLESS3Parser.typeOrReference_return retval = new BLESS3Parser.typeOrReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ref=null;
		ParserRuleReturnScope ty =null;

		BAST ref_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:672:16: (ty= type |ref= ID )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:673:3: ty= type
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_type_in_typeOrReference2761);
					ty=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ty.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:673:13: ref= ID
					{
					root_0 = (BAST)adaptor.nil();


					ref=(Token)match(input,ID,FOLLOW_ID_in_typeOrReference2767); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:676:1: enumerationType : LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:676:16: ( LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:677:3: LITERAL_enumeration ^ LPAREN ! (defining_enumeration_literal+= ID )+ RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_enumeration27=(Token)match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType2780); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_enumeration27_tree = (BAST)adaptor.create(LITERAL_enumeration27);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_enumeration27_tree, root_0);
			}

			LPAREN28=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_enumerationType2783); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:677:60: (defining_enumeration_literal+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:677:60: defining_enumeration_literal+= ID
					{
					defining_enumeration_literal=(Token)match(input,ID,FOLLOW_ID_in_enumerationType2788); if (state.failed) return retval;
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

			RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_enumerationType2791); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:680:1: quantityType : q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= propertyName )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:680:13: (q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= propertyName )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:681:3: q= LITERAL_quantity ^ (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole ) ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )? (rep= LITERAL_representation ^representation= propertyName )?
			{
			root_0 = (BAST)adaptor.nil();


			q=(Token)match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType2807); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			q_tree = (BAST)adaptor.create(q);
			root_0 = (BAST)adaptor.becomeRoot(q_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:682:3: (unit= ID |scalar= LITERAL_scalar |whole= LITERAL_whole )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:682:5: unit= ID
					{
					unit=(Token)match(input,ID,FOLLOW_ID_in_quantityType2817); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					unit_tree = (BAST)adaptor.create(unit);
					adaptor.addChild(root_0, unit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:682:15: scalar= LITERAL_scalar
					{
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType2823); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					scalar_tree = (BAST)adaptor.create(scalar);
					adaptor.addChild(root_0, scalar_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:682:39: whole= LITERAL_whole
					{
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType2829); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					whole_tree = (BAST)adaptor.create(whole);
					adaptor.addChild(root_0, whole_tree);
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:683:3: ( LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )? )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==LBRACKET) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:683:5: LBRACKET !lb= aNumber dd= DOTDOT ^ub= aNumber RBRACKET ! (st= LITERAL_step ^step= aNumber )?
					{
					LBRACKET30=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_quantityType2837); if (state.failed) return retval;
					pushFollow(FOLLOW_aNumber_in_quantityType2842);
					lb=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

					dd=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType2846); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					dd_tree = (BAST)adaptor.create(dd);
					root_0 = (BAST)adaptor.becomeRoot(dd_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_quantityType2851);
					ub=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					RBRACKET31=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_quantityType2853); if (state.failed) return retval;
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:684:3: (st= LITERAL_step ^step= aNumber )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LITERAL_step) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:684:5: st= LITERAL_step ^step= aNumber
							{
							st=(Token)match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType2863); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							st_tree = (BAST)adaptor.create(st);
							root_0 = (BAST)adaptor.becomeRoot(st_tree, root_0);
							}

							pushFollow(FOLLOW_aNumber_in_quantityType2868);
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

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:3: (rep= LITERAL_representation ^representation= propertyName )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==LITERAL_representation) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:685:5: rep= LITERAL_representation ^representation= propertyName
					{
					rep=(Token)match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType2883); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					rep_tree = (BAST)adaptor.create(rep);
					root_0 = (BAST)adaptor.becomeRoot(rep_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_quantityType2888);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:688:1: arrayType : LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:688:11: ( LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:689:3: LITERAL_array ^ LBRACKET !array_ranges= arrayRangeList RBRACKET ! LITERAL_of ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_array32=(Token)match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType2907); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_array32_tree = (BAST)adaptor.create(LITERAL_array32);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_array32_tree, root_0);
			}

			LBRACKET33=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayType2910); if (state.failed) return retval;
			pushFollow(FOLLOW_arrayRangeList_in_arrayType2915);
			array_ranges=arrayRangeList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, array_ranges.getTree());

			RBRACKET34=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayType2917); if (state.failed) return retval;
			LITERAL_of35=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType2920); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_of35_tree = (BAST)adaptor.create(LITERAL_of35);
			adaptor.addChild(root_0, LITERAL_of35_tree);
			}

			pushFollow(FOLLOW_typeOrReference_in_arrayType2924);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:692:1: arrayRangeList :rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:692:16: (rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:3: rang+= arrayRange ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_arrayRange_in_arrayRangeList2940);
			rang=arrayRange();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

			if (list_rang==null) list_rang=new ArrayList<Object>();
			list_rang.add(rang.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:20: ( COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )* )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==COMMA) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:22: COMMA ^rang+= arrayRange ( COMMA !rang+= arrayRange )*
					{
					COMMA36=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList2944); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA36_tree = (BAST)adaptor.create(COMMA36);
					root_0 = (BAST)adaptor.becomeRoot(COMMA36_tree, root_0);
					}

					pushFollow(FOLLOW_arrayRange_in_arrayRangeList2949);
					rang=arrayRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, rang.getTree());

					if (list_rang==null) list_rang=new ArrayList<Object>();
					list_rang.add(rang.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:46: ( COMMA !rang+= arrayRange )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==COMMA) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:693:48: COMMA !rang+= arrayRange
							{
							COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList2953); if (state.failed) return retval;
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList2958);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:1: arrayRange : lb= aNumber ( DOTDOT ^ub= aNumber )? ;
	public final BLESS3Parser.arrayRange_return arrayRange() throws RecognitionException {
		BLESS3Parser.arrayRange_return retval = new BLESS3Parser.arrayRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT38=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;

		BAST DOTDOT38_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:12: (lb= aNumber ( DOTDOT ^ub= aNumber )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:14: lb= aNumber ( DOTDOT ^ub= aNumber )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_aNumber_in_arrayRange2978);
			lb=aNumber();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:25: ( DOTDOT ^ub= aNumber )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==DOTDOT) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:696:27: DOTDOT ^ub= aNumber
					{
					DOTDOT38=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange2982); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT38_tree = (BAST)adaptor.create(DOTDOT38);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT38_tree, root_0);
					}

					pushFollow(FOLLOW_aNumber_in_arrayRange2987);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:698:1: recordType : ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:698:12: ( ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:699:3: ( LITERAL_record | LITERAL_variant | LITERAL_union ) ^ LPAREN ! (fields+= recordField )+ RPAREN !
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
			LPAREN40=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_recordType3017); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:17: (fields+= recordField )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:700:17: fields+= recordField
					{
					pushFollow(FOLLOW_recordField_in_recordType3022);
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

			RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_recordType3025); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:703:1: recordField : id= ID COLON ^ty= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:703:13: (id= ID COLON ^ty= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:704:3: id= ID COLON ^ty= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_recordField3043); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			COLON42=(Token)match(input,COLON,FOLLOW_COLON_in_recordField3045); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON42_tree = (BAST)adaptor.create(COLON42);
			root_0 = (BAST)adaptor.becomeRoot(COLON42_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_recordField3050);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:710:1: assertionLibrary : (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:710:17: ( (ghosts= ghostVariables )? (assertion_list+= namedAssertion )* -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:3: (ghosts= ghostVariables )? (assertion_list+= namedAssertion )*
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:3: (ghosts= ghostVariables )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==LITERAL_ghost) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:711:5: ghosts= ghostVariables
					{
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary3070);
					ghosts=ghostVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ghostVariables.add(ghosts.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:17: (assertion_list+= namedAssertion )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==LASS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:712:17: assertion_list+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertionLibrary3079);
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
			// 713:3: -> ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:6: ^( ASSERTION_ANNEX ( $ghosts)? ( $assertion_list)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ANNEX, "ASSERTION_ANNEX"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:25: ( $ghosts)?
				if ( stream_ghosts.hasNext() ) {
					adaptor.addChild(root_1, stream_ghosts.nextTree());
				}
				stream_ghosts.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:713:34: ( $assertion_list)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:716:1: ghostVariables : LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:717:3: ( LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:3: LITERAL_ghost ^ LITERAL_variables ! (gv+= ghostVariable )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_ghost43=(Token)match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables3112); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_ghost43_tree = (BAST)adaptor.create(LITERAL_ghost43);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_ghost43_tree, root_0);
			}

			LITERAL_variables44=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_ghostVariables3115); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:39: (gv+= ghostVariable )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:718:39: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables3120);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:721:1: ghostVariable : LITERAL_def ^id= ID TILDE !tod= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:721:14: ( LITERAL_def ^id= ID TILDE !tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:722:3: LITERAL_def ^id= ID TILDE !tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_def45=(Token)match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable3133); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_def45_tree = (BAST)adaptor.create(LITERAL_def45);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_def45_tree, root_0);
			}

			id=(Token)match(input,ID,FOLLOW_ID_in_ghostVariable3139); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE46=(Token)match(input,TILDE,FOLLOW_TILDE_in_ghostVariable3141); if (state.failed) return retval;
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable3146);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:1: namedAssertion : lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred) -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {til!=null}? ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> $lass;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:725:15: (lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred) -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred) -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue) -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue) -> {til!=null}? ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration) -> $lass)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:726:3: lass= LASS (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) ) RASS
			{
			lass=(Token)match(input,LASS,FOLLOW_LASS_in_namedAssertion3163); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(lass);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:3: (id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:727:5: id= ID COLON ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3171); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			COLON47=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3173); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON47);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:728:5: ( (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue ) |assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:5: (formals= variableList )? (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:12: (formals= variableList )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==ID) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:729:12: formals= variableList
							{
							pushFollow(FOLLOW_variableList_in_namedAssertion3188);
							formals=variableList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_variableList.add(formals.getTree());
							}
							break;

					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:730:7: (col= COLON pred= predicate |ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue )
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:731:7: col= COLON pred= predicate
							{
							col=(Token)match(input,COLON,FOLLOW_COLON_in_namedAssertion3208); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON.add(col);

							pushFollow(FOLLOW_predicate_in_namedAssertion3213);
							pred=predicate();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:733:7: ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue
							{
							ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion3233); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

							pushFollow(FOLLOW_typeOrReference_in_namedAssertion3237);
							tod=typeOrReference();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
							ASSIGN48=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namedAssertion3239); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN48);

							pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion3244);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:736:5: assertionvariable= ID til= TILDE enumerationTy= ID enumeration= assertionEnumeration
					{
					assertionvariable=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3269); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(assertionvariable);

					til=(Token)match(input,TILDE,FOLLOW_TILDE_in_namedAssertion3273); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TILDE.add(til);

					enumerationTy=(Token)match(input,ID,FOLLOW_ID_in_namedAssertion3277); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(enumerationTy);

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion3281);
					enumeration=assertionEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertionEnumeration.add(enumeration.getTree());
					}
					break;

			}

			}

			RASS49=(Token)match(input,RASS,FOLLOW_RASS_in_namedAssertion3295); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS49);

			// AST REWRITE
			// elements: til, formals, enumerationTy, tod, tod, assertionvariable, id, functionvalue, id, pred, formals, id, pred, id, functionvalue, enumeration, lass, ret, ret, id
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
			// 740:4: -> {id!=null&&formals==null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred)
			if (id!=null&&formals==null&&col!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:741:6: ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, id, "ASSERTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:742:8: ^( LABEL $id)
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

			else // 743:4: -> {id!=null&&formals!=null&&col!=null}? ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred)
			if (id!=null&&formals!=null&&col!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:744:6: ^( ASSERTION[$id,\"ASSERTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) $pred)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION, id, "ASSERTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:745:23: ^( PARAMETERS $formals)
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

			else // 746:4: -> {id!=null&&formals==null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue)
			if (id!=null&&formals==null&&ret!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:747:6: ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, id, "ASSERTION_FUNCTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:748:23: ^( $ret $tod)
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

			else // 749:4: -> {id!=null&&formals!=null&&ret!=null}? ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
			if (id!=null&&formals!=null&&ret!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:750:6: ^( ASSERTION_FUNCTION[$id,\"ASSERTION_FUNCTION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( PARAMETERS $formals) ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, id, "ASSERTION_FUNCTION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:23: ^( PARAMETERS $formals)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PARAMETERS, "PARAMETERS"), root_2);
				adaptor.addChild(root_2, stream_formals.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:751:48: ^( $ret $tod)
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

			else // 752:4: -> {til!=null}? ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
			if (til!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:753:6: ^( ASSERTION_ENUMERATION[$id,\"ASSERTION_ENUMERATION[\"+$id.text+\":\"+Integer.toString($id.tree.getLine()+startingLine)+\"]\"] ^( LABEL $id) ^( $til $assertionvariable $enumerationTy) $enumeration)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_ENUMERATION, id, "ASSERTION_ENUMERATION["+(id!=null?id.getText():null)+":"+Integer.toString(id_tree.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:754:8: ^( LABEL $id)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, "LABEL"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:754:23: ^( $til $assertionvariable $enumerationTy)
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

			else // 755:4: -> $lass
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:757:1: predicate : ex= expression -> $ex;
	public final BLESS3Parser.predicate_return predicate() throws RecognitionException {
		BLESS3Parser.predicate_return retval = new BLESS3Parser.predicate_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope ex =null;

		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:757:10: (ex= expression -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:757:13: ex= expression
			{
			pushFollow(FOLLOW_expression_in_predicate3655);
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
			// 758:3: -> $ex
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:1: variableList : first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:761:13: (first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:3: first= variable ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_variableList3676);
			first=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, first.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:18: ( COMMA ^parameter+= variable ( COMMA !parameter+= variable )* )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==COMMA) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:20: COMMA ^parameter+= variable ( COMMA !parameter+= variable )*
					{
					COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3680); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA50_tree = (BAST)adaptor.create(COMMA50);
					root_0 = (BAST)adaptor.becomeRoot(COMMA50_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_variableList3685);
					parameter=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameter.getTree());

					if (list_parameter==null) list_parameter=new ArrayList<Object>();
					list_parameter.add(parameter.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:47: ( COMMA !parameter+= variable )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( (LA36_0==COMMA) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:762:49: COMMA !parameter+= variable
							{
							COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableList3689); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_variableList3694);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:765:1: variable : id= ID TILDE ^tod= typeOrReference ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:765:9: (id= ID TILDE ^tod= typeOrReference )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:766:3: id= ID TILDE ^tod= typeOrReference
			{
			root_0 = (BAST)adaptor.nil();


			id=(Token)match(input,ID,FOLLOW_ID_in_variable3712); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id_tree = (BAST)adaptor.create(id);
			adaptor.addChild(root_0, id_tree);
			}

			TILDE52=(Token)match(input,TILDE,FOLLOW_TILDE_in_variable3714); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TILDE52_tree = (BAST)adaptor.create(TILDE52);
			root_0 = (BAST)adaptor.becomeRoot(TILDE52_tree, root_0);
			}

			pushFollow(FOLLOW_typeOrReference_in_variable3719);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:769:1: assertionFunctionValue : ( conditionalAssertionFunction | expression );
	public final BLESS3Parser.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		BLESS3Parser.assertionFunctionValue_return retval = new BLESS3Parser.assertionFunctionValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalAssertionFunction53 =null;
		ParserRuleReturnScope expression54 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:769:23: ( conditionalAssertionFunction | expression )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==LBRACKET) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==ID||LA38_1==LITERAL_self||LA38_1==OCTOTHORPE) ) {
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
			else if ( (LA38_0==AADL_STRING_LITERAL||LA38_0==ID||(LA38_0 >= LITERAL_abs && LA38_0 <= LITERAL_all)||LA38_0==LITERAL_exists||LA38_0==LITERAL_false||(LA38_0 >= LITERAL_not && LA38_0 <= LITERAL_numberof)||LA38_0==LITERAL_product||LA38_0==LITERAL_round||LA38_0==LITERAL_self||LA38_0==LITERAL_sum||LA38_0==LITERAL_timeout||LA38_0==LITERAL_tops||(LA38_0 >= LITERAL_true && LA38_0 <= LITERAL_truncate)||LA38_0==LPAREN||LA38_0==MINUS||LA38_0==NUMBER||LA38_0==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:770:2: conditionalAssertionFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue3730);
					conditionalAssertionFunction53=conditionalAssertionFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAssertionFunction53.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:771:4: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assertionFunctionValue3736);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:1: conditionalAssertionFunction : lb= LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION[$lb,\"CONDITIONAL_ASSERTION_FUNCTION\"] ( $cvp)* ) ;
	public final BLESS3Parser.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		BLESS3Parser.conditionalAssertionFunction_return retval = new BLESS3Parser.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lb=null;
		Token COMMA55=null;
		Token RBRACKET56=null;
		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		BAST lb_tree=null;
		BAST COMMA55_tree=null;
		BAST RBRACKET56_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_conditionValuePair=new RewriteRuleSubtreeStream(adaptor,"rule conditionValuePair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:774:29: (lb= LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET -> ^( CONDITIONAL_ASSERTION_FUNCTION[$lb,\"CONDITIONAL_ASSERTION_FUNCTION\"] ( $cvp)* ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:2: lb= LBRACKET cvp+= conditionValuePair ( COMMA cvp+= conditionValuePair )* RBRACKET
			{
			lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_conditionalAssertionFunction3751); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

			pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction3755);
			cvp=conditionValuePair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_conditionValuePair.add(cvp.getTree());
			if (list_cvp==null) list_cvp=new ArrayList<Object>();
			list_cvp.add(cvp.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:38: ( COMMA cvp+= conditionValuePair )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==COMMA) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:775:40: COMMA cvp+= conditionValuePair
					{
					COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_conditionalAssertionFunction3759); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA55);

					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction3763);
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

			RBRACKET56=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_conditionalAssertionFunction3768); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET56);

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
			// 776:4: -> ^( CONDITIONAL_ASSERTION_FUNCTION[$lb,\"CONDITIONAL_ASSERTION_FUNCTION\"] ( $cvp)* )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:776:7: ^( CONDITIONAL_ASSERTION_FUNCTION[$lb,\"CONDITIONAL_ASSERTION_FUNCTION\"] ( $cvp)* )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITIONAL_ASSERTION_FUNCTION, lb, "CONDITIONAL_ASSERTION_FUNCTION"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:776:80: ( $cvp)*
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:779:1: conditionValuePair : LPAREN ! predicate CVP ^ expression ;
	public final BLESS3Parser.conditionValuePair_return conditionValuePair() throws RecognitionException {
		BLESS3Parser.conditionValuePair_return retval = new BLESS3Parser.conditionValuePair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN57=null;
		Token CVP59=null;
		ParserRuleReturnScope predicate58 =null;
		ParserRuleReturnScope expression60 =null;

		BAST LPAREN57_tree=null;
		BAST CVP59_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:779:19: ( LPAREN ! predicate CVP ^ expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:780:3: LPAREN ! predicate CVP ^ expression
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN57=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionValuePair3797); if (state.failed) return retval;
			pushFollow(FOLLOW_predicate_in_conditionValuePair3800);
			predicate58=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate58.getTree());

			CVP59=(Token)match(input,CVP,FOLLOW_CVP_in_conditionValuePair3802); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CVP59_tree = (BAST)adaptor.create(CVP59);
			root_0 = (BAST)adaptor.becomeRoot(CVP59_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_conditionValuePair3805);
			expression60=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression60.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:783:1: assertionEnumeration : ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> ^( $pa ( $pair)+ ) );
	public final BLESS3Parser.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		BLESS3Parser.assertionEnumeration_return retval = new BLESS3Parser.assertionEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token com=null;
		Token COMMA61=null;
		List<Object> list_pair=null;
		ParserRuleReturnScope inv =null;
		RuleReturnScope pair = null;
		BAST pa_tree=null;
		BAST com_tree=null;
		BAST COMMA61_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");
		RewriteRuleSubtreeStream stream_enumerationPair=new RewriteRuleSubtreeStream(adaptor,"rule enumerationPair");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:783:21: ( (pa= PLUS_ARROW inv= invocation ) -> ^( $pa $inv) | (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? ) -> ^( $pa ( $pair)+ ) )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:784:2: (pa= PLUS_ARROW inv= invocation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:784:2: (pa= PLUS_ARROW inv= invocation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:784:4: pa= PLUS_ARROW inv= invocation
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3821); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_invocation_in_assertionEnumeration3825);
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
					// 785:4: -> ^( $pa $inv)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:785:7: ^( $pa $inv)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:2: (pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:4: pa= PLUS_ARROW pair+= enumerationPair (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					{
					pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3852); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

					pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3856);
					pair=enumerationPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
					if (list_pair==null) list_pair=new ArrayList<Object>();
					list_pair.add(pair.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:40: (com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )* )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==COMMA) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:42: com= COMMA pair+= enumerationPair ( COMMA pair+= enumerationPair )*
							{
							com=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration3862); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(com);

							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3866);
							pair=enumerationPair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_enumerationPair.add(pair.getTree());
							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTree());
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:74: ( COMMA pair+= enumerationPair )*
							loop40:
							while (true) {
								int alt40=2;
								int LA40_0 = input.LA(1);
								if ( (LA40_0==COMMA) ) {
									alt40=1;
								}

								switch (alt40) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:787:76: COMMA pair+= enumerationPair
									{
									COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_assertionEnumeration3870); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA61);

									pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3874);
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
					// 789:4: -> ^( $pa ( $pair)+ )
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:789:7: ^( $pa ( $pair)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:792:1: enumerationPair : ID IMP ^ predicate ;
	public final BLESS3Parser.enumerationPair_return enumerationPair() throws RecognitionException {
		BLESS3Parser.enumerationPair_return retval = new BLESS3Parser.enumerationPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ID62=null;
		Token IMP63=null;
		ParserRuleReturnScope predicate64 =null;

		BAST ID62_tree=null;
		BAST IMP63_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:792:16: ( ID IMP ^ predicate )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:793:3: ID IMP ^ predicate
			{
			root_0 = (BAST)adaptor.nil();


			ID62=(Token)match(input,ID,FOLLOW_ID_in_enumerationPair3911); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ID62_tree = (BAST)adaptor.create(ID62);
			adaptor.addChild(root_0, ID62_tree);
			}

			IMP63=(Token)match(input,IMP,FOLLOW_IMP_in_enumerationPair3913); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP63_tree = (BAST)adaptor.create(IMP63);
			root_0 = (BAST)adaptor.becomeRoot(IMP63_tree, root_0);
			}

			pushFollow(FOLLOW_predicate_in_enumerationPair3916);
			predicate64=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, predicate64.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:1: enumerationValue : enumeration_type= ID TICK ^enumeration_value= ID ;
	public final BLESS3Parser.enumerationValue_return enumerationValue() throws RecognitionException {
		BLESS3Parser.enumerationValue_return retval = new BLESS3Parser.enumerationValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token enumeration_type=null;
		Token enumeration_value=null;
		Token TICK65=null;

		BAST enumeration_type_tree=null;
		BAST enumeration_value_tree=null;
		BAST TICK65_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:796:17: (enumeration_type= ID TICK ^enumeration_value= ID )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:797:3: enumeration_type= ID TICK ^enumeration_value= ID
			{
			root_0 = (BAST)adaptor.nil();


			enumeration_type=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue3930); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			enumeration_type_tree = (BAST)adaptor.create(enumeration_type);
			adaptor.addChild(root_0, enumeration_type_tree);
			}

			TICK65=(Token)match(input,TICK,FOLLOW_TICK_in_enumerationValue3932); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TICK65_tree = (BAST)adaptor.create(TICK65);
			root_0 = (BAST)adaptor.becomeRoot(TICK65_tree, root_0);
			}

			enumeration_value=(Token)match(input,ID,FOLLOW_ID_in_enumerationValue3937); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:801:1: namelessAssertion : la= LASS pred= predicate RASS -> ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred) ;
	public final BLESS3Parser.namelessAssertion_return namelessAssertion() throws RecognitionException {
		BLESS3Parser.namelessAssertion_return retval = new BLESS3Parser.namelessAssertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token la=null;
		Token RASS66=null;
		ParserRuleReturnScope pred =null;

		BAST la_tree=null;
		BAST RASS66_tree=null;
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_predicate=new RewriteRuleSubtreeStream(adaptor,"rule predicate");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:801:18: (la= LASS pred= predicate RASS -> ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:802:3: la= LASS pred= predicate RASS
			{
			la=(Token)match(input,LASS,FOLLOW_LASS_in_namelessAssertion3952); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(la);

			pushFollow(FOLLOW_predicate_in_namelessAssertion3956);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			RASS66=(Token)match(input,RASS,FOLLOW_RASS_in_namelessAssertion3958); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS66);

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
			// 803:5: -> ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:803:8: ^( ASSERTION[$la,\"ASSERTION[\"+Integer.toString($la.getLine()+startingLine)+\"]\"] $pred)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:1: namelessFunction : LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue) ;
	public final BLESS3Parser.namelessFunction_return namelessFunction() throws RecognitionException {
		BLESS3Parser.namelessFunction_return retval = new BLESS3Parser.namelessFunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ret=null;
		Token LASS67=null;
		Token ASSIGN68=null;
		Token RASS69=null;
		ParserRuleReturnScope tod =null;
		ParserRuleReturnScope functionvalue =null;

		BAST ret_tree=null;
		BAST LASS67_tree=null;
		BAST ASSIGN68_tree=null;
		BAST RASS69_tree=null;
		RewriteRuleTokenStream stream_LITERAL_returns=new RewriteRuleTokenStream(adaptor,"token LITERAL_returns");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_typeOrReference=new RewriteRuleSubtreeStream(adaptor,"rule typeOrReference");
		RewriteRuleSubtreeStream stream_assertionFunctionValue=new RewriteRuleSubtreeStream(adaptor,"rule assertionFunctionValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:806:17: ( LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS -> ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:807:3: LASS ret= LITERAL_returns tod= typeOrReference ASSIGN functionvalue= assertionFunctionValue RASS
			{
			LASS67=(Token)match(input,LASS,FOLLOW_LASS_in_namelessFunction3988); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS67);

			ret=(Token)match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction3992); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_returns.add(ret);

			pushFollow(FOLLOW_typeOrReference_in_namelessFunction3996);
			tod=typeOrReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_typeOrReference.add(tod.getTree());
			ASSIGN68=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_namelessFunction3998); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(ASSIGN68);

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction4002);
			functionvalue=assertionFunctionValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assertionFunctionValue.add(functionvalue.getTree());
			RASS69=(Token)match(input,RASS,FOLLOW_RASS_in_namelessFunction4004); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS69);

			// AST REWRITE
			// elements: tod, functionvalue, ret
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
			// 808:5: -> ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:808:8: ^( ASSERTION_FUNCTION[$ret,\"ASSERTION_FUNCTION[\"+Integer.toString($ret.getLine()+startingLine)+\"]\"] ^( $ret $tod) $functionvalue)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ASSERTION_FUNCTION, ret, "ASSERTION_FUNCTION["+Integer.toString(ret.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:808:108: ^( $ret $tod)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:811:1: namelessEnumeration : LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv) ;
	public final BLESS3Parser.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		BLESS3Parser.namelessEnumeration_return retval = new BLESS3Parser.namelessEnumeration_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token pa=null;
		Token LASS70=null;
		Token RASS71=null;
		ParserRuleReturnScope inv =null;

		BAST pa_tree=null;
		BAST LASS70_tree=null;
		BAST RASS71_tree=null;
		RewriteRuleTokenStream stream_PLUS_ARROW=new RewriteRuleTokenStream(adaptor,"token PLUS_ARROW");
		RewriteRuleTokenStream stream_LASS=new RewriteRuleTokenStream(adaptor,"token LASS");
		RewriteRuleTokenStream stream_RASS=new RewriteRuleTokenStream(adaptor,"token RASS");
		RewriteRuleSubtreeStream stream_invocation=new RewriteRuleSubtreeStream(adaptor,"rule invocation");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:811:20: ( LASS pa= PLUS_ARROW inv= invocation RASS -> ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:812:2: LASS pa= PLUS_ARROW inv= invocation RASS
			{
			LASS70=(Token)match(input,LASS,FOLLOW_LASS_in_namelessEnumeration4045); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LASS.add(LASS70);

			pa=(Token)match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_namelessEnumeration4049); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PLUS_ARROW.add(pa);

			pushFollow(FOLLOW_invocation_in_namelessEnumeration4053);
			inv=invocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_invocation.add(inv.getTree());
			RASS71=(Token)match(input,RASS,FOLLOW_RASS_in_namelessEnumeration4055); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RASS.add(RASS71);

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
			// 813:4: -> ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:813:8: ^( ASSERTION_ENUMERATION[$pa,\"ASSERTION_ENUMERATION[\"+Integer.toString($pa.getLine()+startingLine)+\"]\"] $inv)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:816:1: assertion : ( ( LASS ID COLON )=> namedAssertion | ( LASS LITERAL_returns )=> namelessFunction | ( LASS PLUS_ARROW )=> namelessEnumeration | namelessAssertion );
	public final BLESS3Parser.assertion_return assertion() throws RecognitionException {
		BLESS3Parser.assertion_return retval = new BLESS3Parser.assertion_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope namedAssertion72 =null;
		ParserRuleReturnScope namelessFunction73 =null;
		ParserRuleReturnScope namelessEnumeration74 =null;
		ParserRuleReturnScope namelessAssertion75 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:818:3: ( ( LASS ID COLON )=> namedAssertion | ( LASS LITERAL_returns )=> namelessFunction | ( LASS PLUS_ARROW )=> namelessEnumeration | namelessAssertion )
			int alt43=4;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==LASS) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==LITERAL_returns) && (synpred63_BLESS3())) {
					alt43=2;
				}
				else if ( (LA43_1==PLUS_ARROW) && (synpred64_BLESS3())) {
					alt43=3;
				}
				else if ( (LA43_1==ID) ) {
					int LA43_4 = input.LA(3);
					if ( (LA43_4==COLON) && (synpred62_BLESS3())) {
						alt43=1;
					}
					else if ( ((LA43_4 >= AL && LA43_4 <= AM)||LA43_4==AT_SIGN||LA43_4==CARET||(LA43_4 >= DIVIDE && LA43_4 <= DOT)||LA43_4==DOUBLE_COLON||LA43_4==EQ||LA43_4==EXP||LA43_4==GT||LA43_4==LBRACKET||LA43_4==LITERAL_and||LA43_4==LITERAL_div||(LA43_4 >= LITERAL_iff && LA43_4 <= LITERAL_in)||LA43_4==LITERAL_mod||LA43_4==LITERAL_or||LA43_4==LITERAL_rem||(LA43_4 >= LITERAL_xor && LA43_4 <= LT)||LA43_4==MINUS||LA43_4==NEQ||(LA43_4 >= OCTOTHORPE && LA43_4 <= OLD_NEQ)||LA43_4==PLUS||LA43_4==PLUS_EQUALS||(LA43_4 >= QUESTION && LA43_4 <= RASS)||LA43_4==TICK||LA43_4==TIMES) ) {
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
				else if ( (LA43_1==AADL_STRING_LITERAL||LA43_1==LBRACKET||(LA43_1 >= LITERAL_abs && LA43_1 <= LITERAL_all)||LA43_1==LITERAL_exists||LA43_1==LITERAL_false||(LA43_1 >= LITERAL_not && LA43_1 <= LITERAL_numberof)||LA43_1==LITERAL_product||LA43_1==LITERAL_round||LA43_1==LITERAL_self||LA43_1==LITERAL_sum||LA43_1==LITERAL_timeout||LA43_1==LITERAL_tops||(LA43_1 >= LITERAL_true && LA43_1 <= LITERAL_truncate)||LA43_1==LPAREN||LA43_1==MINUS||LA43_1==NUMBER||LA43_1==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:819:3: ( LASS ID COLON )=> namedAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namedAssertion_in_assertion4093);
					namedAssertion72=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion72.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:5: ( LASS LITERAL_returns )=> namelessFunction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessFunction_in_assertion4106);
					namelessFunction73=namelessFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessFunction73.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:5: ( LASS PLUS_ARROW )=> namelessEnumeration
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessEnumeration_in_assertion4119);
					namelessEnumeration74=namelessEnumeration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessEnumeration74.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:822:5: namelessAssertion
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_namelessAssertion_in_assertion4125);
					namelessAssertion75=namelessAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namelessAssertion75.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:1: invocation : id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? ) ;
	public final BLESS3Parser.invocation_return invocation() throws RecognitionException {
		BLESS3Parser.invocation_return retval = new BLESS3Parser.invocation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token id=null;
		Token LPAREN76=null;
		Token COMMA77=null;
		Token RPAREN78=null;
		List<Object> list_params=null;
		ParserRuleReturnScope exp =null;
		RuleReturnScope params = null;
		BAST id_tree=null;
		BAST LPAREN76_tree=null;
		BAST COMMA77_tree=null;
		BAST RPAREN78_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_actualParameter=new RewriteRuleSubtreeStream(adaptor,"rule actualParameter");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:826:11: (id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN -> ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:827:2: id= ID LPAREN ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_invocation4139); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN76=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_invocation4141); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN76);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:2: ( (params+= actualParameter ( COMMA params+= actualParameter )* ) |exp= expression )?
			int alt45=3;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==ID) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==COLON) ) {
					alt45=1;
				}
				else if ( ((LA45_1 >= AL && LA45_1 <= AM)||LA45_1==AT_SIGN||LA45_1==CARET||(LA45_1 >= DIVIDE && LA45_1 <= DOT)||LA45_1==DOUBLE_COLON||LA45_1==EQ||LA45_1==EXP||LA45_1==GT||LA45_1==LBRACKET||LA45_1==LITERAL_and||LA45_1==LITERAL_div||(LA45_1 >= LITERAL_iff && LA45_1 <= LITERAL_in)||LA45_1==LITERAL_mod||LA45_1==LITERAL_or||LA45_1==LITERAL_rem||(LA45_1 >= LITERAL_xor && LA45_1 <= LT)||LA45_1==MINUS||LA45_1==NEQ||(LA45_1 >= OCTOTHORPE && LA45_1 <= OLD_NEQ)||LA45_1==PLUS||LA45_1==PLUS_EQUALS||LA45_1==QUESTION||LA45_1==RPAREN||LA45_1==TICK||LA45_1==TIMES) ) {
					alt45=2;
				}
			}
			else if ( (LA45_0==AADL_STRING_LITERAL||LA45_0==LBRACKET||(LA45_0 >= LITERAL_abs && LA45_0 <= LITERAL_all)||LA45_0==LITERAL_exists||LA45_0==LITERAL_false||(LA45_0 >= LITERAL_not && LA45_0 <= LITERAL_numberof)||LA45_0==LITERAL_product||LA45_0==LITERAL_round||LA45_0==LITERAL_self||LA45_0==LITERAL_sum||LA45_0==LITERAL_timeout||LA45_0==LITERAL_tops||(LA45_0 >= LITERAL_true && LA45_0 <= LITERAL_truncate)||LA45_0==LPAREN||LA45_0==MINUS||LA45_0==NUMBER||LA45_0==OCTOTHORPE) ) {
				alt45=2;
			}
			switch (alt45) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:4: (params+= actualParameter ( COMMA params+= actualParameter )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:6: params+= actualParameter ( COMMA params+= actualParameter )*
					{
					pushFollow(FOLLOW_actualParameter_in_invocation4151);
					params=actualParameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_actualParameter.add(params.getTree());
					if (list_params==null) list_params=new ArrayList<Object>();
					list_params.add(params.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:30: ( COMMA params+= actualParameter )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==COMMA) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:828:32: COMMA params+= actualParameter
							{
							COMMA77=(Token)match(input,COMMA,FOLLOW_COMMA_in_invocation4155); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA77);

							pushFollow(FOLLOW_actualParameter_in_invocation4159);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:829:6: exp= expression
					{
					pushFollow(FOLLOW_expression_in_invocation4173);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			RPAREN78=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_invocation4178); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN78);

			// AST REWRITE
			// elements: id, exp, params
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
			// 830:4: -> ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:7: ^( INVOKE[$id, \"INVOKE[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \" ] $id ( $params)* ( $exp)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVOKE, id, "INVOKE["+(id!=null?id.getText():null)+":"+Integer.toString(id.getLine()+startingLine)+"] "), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:102: ( $params)*
				while ( stream_params.hasNext() ) {
					adaptor.addChild(root_1, stream_params.nextTree());
				}
				stream_params.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:830:111: ( $exp)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:833:1: actualParameter : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.actualParameter_return actualParameter() throws RecognitionException {
		BLESS3Parser.actualParameter_return retval = new BLESS3Parser.actualParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON79=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON79_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:833:16: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:834:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_actualParameter4214); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON79=(Token)match(input,COLON,FOLLOW_COLON_in_actualParameter4216); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON79_tree = (BAST)adaptor.create(COLON79);
			root_0 = (BAST)adaptor.becomeRoot(COLON79_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_actualParameter4221);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:1: expression : (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? );
	public final BLESS3Parser.expression_return expression() throws RecognitionException {
		BLESS3Parser.expression_return retval = new BLESS3Parser.expression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_iff80=null;
		Token LITERAL_implies81=null;
		ParserRuleReturnScope all =null;
		ParserRuleReturnScope exists =null;
		ParserRuleReturnScope sum =null;
		ParserRuleReturnScope product =null;
		ParserRuleReturnScope numberof =null;
		ParserRuleReturnScope l =null;
		ParserRuleReturnScope r =null;

		BAST LITERAL_iff80_tree=null;
		BAST LITERAL_implies81_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:839:11: (all= universalQuantification |exists= existentialQuantification |sum= sumQuantification |product= productQuantification |numberof= countingQuantification |l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )? )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:840:3: all= universalQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalQuantification_in_expression4239);
					all=universalQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, all.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:841:5: exists= existentialQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialQuantification_in_expression4247);
					exists=existentialQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:842:5: sum= sumQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_sumQuantification_in_expression4255);
					sum=sumQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, sum.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:843:5: product= productQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_productQuantification_in_expression4263);
					product=productQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, product.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:844:5: numberof= countingQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_countingQuantification_in_expression4271);
					numberof=countingQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, numberof.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:5: l= disjunction ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_disjunction_in_expression4279);
					l=disjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:19: ( ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( ((LA47_0 >= LITERAL_iff && LA47_0 <= LITERAL_implies)) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:21: ( LITERAL_iff ^| LITERAL_implies ^) r= disjunction
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:21: ( LITERAL_iff ^| LITERAL_implies ^)
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
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:22: LITERAL_iff ^
									{
									LITERAL_iff80=(Token)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression4284); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_iff80_tree = (BAST)adaptor.create(LITERAL_iff80);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_iff80_tree, root_0);
									}

									}
									break;
								case 2 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:845:37: LITERAL_implies ^
									{
									LITERAL_implies81=(Token)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression4289); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LITERAL_implies81_tree = (BAST)adaptor.create(LITERAL_implies81);
									root_0 = (BAST)adaptor.becomeRoot(LITERAL_implies81_tree, root_0);
									}

									}
									break;

							}

							pushFollow(FOLLOW_disjunction_in_expression4295);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:849:1: universalQuantification : al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:849:24: (al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) ) -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) ) -> $al)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:850:3: al= LITERAL_all lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_are pred= predicate
			{
			al=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification4311); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_all.add(al);

			pushFollow(FOLLOW_logicVariables_in_universalQuantification4315);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:851:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:851:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalQuantification4326); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_universalQuantification4330);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:851:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_universalQuantification4336); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_universalQuantification4340);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification4351); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_are.add(ar);

			pushFollow(FOLLOW_predicate_in_universalQuantification4355);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: lv, pred, lv, w, al, ar, r, pred, ar, al, al, i, b
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
			// 853:4: -> {i!=null}? ^( $al $lv ^( $i $r) ^( $ar $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:18: ^( $al $lv ^( $i $r) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:853:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
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

			else // 854:4: -> {w!=null}? ^( $al $lv ^( $w $b) ^( $ar $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:854:18: ^( $al $lv ^( $w $b) ^( $ar $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_al.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:854:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:854:40: ^( $ar $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 855:4: -> $al
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:858:1: existentialQuantification : ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) th= LITERAL_that pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) ) -> {w!=null}? ^( $ex $lv ^( $w $b) ^( $th $pred) ) -> $ex;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:858:26: (ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) th= LITERAL_that pred= predicate -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) ) -> {w!=null}? ^( $ex $lv ^( $w $b) ^( $th $pred) ) -> $ex)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:859:3: ex= LITERAL_exists lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) th= LITERAL_that pred= predicate
			{
			ex=(Token)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification4451); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_exists.add(ex);

			pushFollow(FOLLOW_logicVariables_in_existentialQuantification4455);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_existentialQuantification4466); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_existentialQuantification4470);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:860:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_existentialQuantification4476); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_existentialQuantification4480);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			th=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification4491); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(th);

			pushFollow(FOLLOW_predicate_in_existentialQuantification4495);
			pred=predicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_predicate.add(pred.getTree());
			// AST REWRITE
			// elements: ex, w, ex, pred, th, th, pred, ex, lv, b, lv, i, r
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
			// 862:4: -> {i!=null}? ^( $ex $lv ^( $i $r) ^( $th $pred) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:18: ^( $ex $lv ^( $i $r) ^( $th $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:862:40: ^( $th $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 863:4: -> {w!=null}? ^( $ex $lv ^( $w $b) ^( $th $pred) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:863:18: ^( $ex $lv ^( $w $b) ^( $th $pred) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ex.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:863:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:863:40: ^( $th $pred)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_th.nextNode(), root_2);
				adaptor.addChild(root_2, stream_pred.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 864:4: -> $ex
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:867:1: sumQuantification : sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:867:18: (sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) ) -> $sum)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:868:3: sum= LITERAL_sum lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			sum=(Token)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification4591); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_sum.add(sum);

			pushFollow(FOLLOW_logicVariables_in_sumQuantification4595);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_sumQuantification4606); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_sumQuantification4610);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:869:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_sumQuantification4616); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_sumQuantification4620);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification4631); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_sumQuantification4635);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: r, ar, lv, ex, w, lv, b, sum, ex, sum, sum, ar, i
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
			// 871:4: -> {i!=null}? ^( $sum $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:18: ^( $sum $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:871:30: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
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

			else // 872:4: -> {w!=null}? ^( $sum $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:872:18: ^( $sum $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_sum.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:872:30: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:872:41: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 873:4: -> $sum
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:876:1: productQuantification : pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:876:22: (pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) ) -> $pr)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:877:3: pr= LITERAL_product lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_of ex= expression
			{
			pr=(Token)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification4731); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_product.add(pr);

			pushFollow(FOLLOW_logicVariables_in_productQuantification4735);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_productQuantification4746); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_productQuantification4750);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:878:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_productQuantification4756); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_productQuantification4760);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification4771); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_of.add(ar);

			pushFollow(FOLLOW_expression_in_productQuantification4775);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: ar, r, pr, ex, w, ar, b, pr, lv, lv, i, ex, pr
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
			// 880:4: -> {i!=null}? ^( $pr $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:18: ^( $pr $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:880:29: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
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

			else // 881:4: -> {w!=null}? ^( $pr $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:881:18: ^( $pr $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_pr.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:881:29: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:881:40: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 882:4: -> $pr
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:885:1: countingQuantification : n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:885:23: (n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) ) -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) ) -> $n)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:886:3: n= LITERAL_numberof lv= logicVariables (i= LITERAL_in r= range |w= LITERAL_which b= predicate ) ar= LITERAL_that ex= expression
			{
			n=(Token)match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification4871); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_numberof.add(n);

			pushFollow(FOLLOW_logicVariables_in_countingQuantification4875);
			lv=logicVariables();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicVariables.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:5: (i= LITERAL_in r= range |w= LITERAL_which b= predicate )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:6: i= LITERAL_in r= range
					{
					i=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_countingQuantification4886); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_in.add(i);

					pushFollow(FOLLOW_range_in_countingQuantification4890);
					r=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_range.add(r.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:887:29: w= LITERAL_which b= predicate
					{
					w=(Token)match(input,LITERAL_which,FOLLOW_LITERAL_which_in_countingQuantification4896); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_which.add(w);

					pushFollow(FOLLOW_predicate_in_countingQuantification4900);
					b=predicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_predicate.add(b.getTree());
					}
					break;

			}

			ar=(Token)match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification4911); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_that.add(ar);

			pushFollow(FOLLOW_expression_in_countingQuantification4915);
			ex=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ex.getTree());
			// AST REWRITE
			// elements: n, b, lv, i, ex, ar, lv, ex, r, n, ar, n, w
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
			// 889:4: -> {i!=null}? ^( $n $lv ^( $i $r) ^( $ar $ex) )
			if (i!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:18: ^( $n $lv ^( $i $r) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:889:28: ^( $i $r)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_i.nextNode(), root_2);
				adaptor.addChild(root_2, stream_r.nextTree());
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

			else // 890:4: -> {w!=null}? ^( $n $lv ^( $w $b) ^( $ar $ex) )
			if (w!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:890:18: ^( $n $lv ^( $w $b) ^( $ar $ex) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_n.nextNode(), root_1);
				adaptor.addChild(root_1, stream_lv.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:890:28: ^( $w $b)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_w.nextNode(), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:890:39: ^( $ar $ex)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_ar.nextNode(), root_2);
				adaptor.addChild(root_2, stream_ex.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 891:4: -> $n
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:1: logicVariables :lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? ;
	public final BLESS3Parser.logicVariables_return logicVariables() throws RecognitionException {
		BLESS3Parser.logicVariables_return retval = new BLESS3Parser.logicVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA82=null;
		Token COMMA83=null;
		List<Object> list_lv=null;
		RuleReturnScope lv = null;
		BAST COMMA82_tree=null;
		BAST COMMA83_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:894:15: (lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:895:3: lv+= variable ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_variable_in_logicVariables5011);
			lv=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

			if (list_lv==null) list_lv=new ArrayList<Object>();
			list_lv.add(lv.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:895:16: ( COMMA ^lv+= variable ( COMMA !lv+= variable )* )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==COMMA) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:895:18: COMMA ^lv+= variable ( COMMA !lv+= variable )*
					{
					COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5015); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA82_tree = (BAST)adaptor.create(COMMA82);
					root_0 = (BAST)adaptor.becomeRoot(COMMA82_tree, root_0);
					}

					pushFollow(FOLLOW_variable_in_logicVariables5020);
					lv=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lv.getTree());

					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:895:38: ( COMMA !lv+= variable )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==COMMA) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:895:40: COMMA !lv+= variable
							{
							COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_logicVariables5024); if (state.failed) return retval;
							pushFollow(FOLLOW_variable_in_logicVariables5029);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:1: disjunction : l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? ;
	public final BLESS3Parser.disjunction_return disjunction() throws RecognitionException {
		BLESS3Parser.disjunction_return retval = new BLESS3Parser.disjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_or84=null;
		Token LITERAL_or85=null;
		Token LITERAL_or86=null;
		Token LITERAL_else87=null;
		Token LITERAL_or88=null;
		Token LITERAL_else89=null;
		Token LITERAL_xor90=null;
		Token LITERAL_xor91=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_or84_tree=null;
		BAST LITERAL_or85_tree=null;
		BAST LITERAL_or86_tree=null;
		BAST LITERAL_else87_tree=null;
		BAST LITERAL_or88_tree=null;
		BAST LITERAL_else89_tree=null;
		BAST LITERAL_xor90_tree=null;
		BAST LITERAL_xor91_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:898:12: (l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:899:3: l= conjunction ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_conjunction_in_disjunction5051);
			l=conjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:900:6: ( ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* ) | ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* ) | ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:6: ( LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:8: LITERAL_or ^r+= conjunction ( LITERAL_or !r+= conjunction )*
					{
					LITERAL_or84=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5068); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or84_tree = (BAST)adaptor.create(LITERAL_or84);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or84_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5073);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:35: ( LITERAL_or !r+= conjunction )*
					loop56:
					while (true) {
						int alt56=2;
						int LA56_0 = input.LA(1);
						if ( (LA56_0==LITERAL_or) ) {
							alt56=1;
						}

						switch (alt56) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:901:37: LITERAL_or !r+= conjunction
							{
							LITERAL_or85=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5077); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5082);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:6: ( LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:8: LITERAL_or ! LITERAL_else ^r+= conjunction ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					{
					LITERAL_or86=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5103); if (state.failed) return retval;
					LITERAL_else87=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5106); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_else87_tree = (BAST)adaptor.create(LITERAL_else87);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_else87_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5111);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:49: ( LITERAL_or ! LITERAL_else !r+= conjunction )*
					loop57:
					while (true) {
						int alt57=2;
						int LA57_0 = input.LA(1);
						if ( (LA57_0==LITERAL_or) ) {
							alt57=1;
						}

						switch (alt57) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:903:51: LITERAL_or ! LITERAL_else !r+= conjunction
							{
							LITERAL_or88=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction5115); if (state.failed) return retval;
							LITERAL_else89=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction5118); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5123);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:6: ( LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:8: LITERAL_xor ^r+= conjunction ( LITERAL_xor !r+= conjunction )*
					{
					LITERAL_xor90=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5144); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor90_tree = (BAST)adaptor.create(LITERAL_xor90);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_xor90_tree, root_0);
					}

					pushFollow(FOLLOW_conjunction_in_disjunction5149);
					r=conjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:36: ( LITERAL_xor !r+= conjunction )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==LITERAL_xor) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:905:38: LITERAL_xor !r+= conjunction
							{
							LITERAL_xor91=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction5153); if (state.failed) return retval;
							pushFollow(FOLLOW_conjunction_in_disjunction5158);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:1: conjunction : l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? ;
	public final BLESS3Parser.conjunction_return conjunction() throws RecognitionException {
		BLESS3Parser.conjunction_return retval = new BLESS3Parser.conjunction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_and92=null;
		Token LITERAL_and93=null;
		Token LITERAL_and94=null;
		Token LITERAL_then95=null;
		Token LITERAL_and96=null;
		Token LITERAL_then97=null;
		List<Object> list_r=null;
		ParserRuleReturnScope l =null;
		RuleReturnScope r = null;
		BAST LITERAL_and92_tree=null;
		BAST LITERAL_and93_tree=null;
		BAST LITERAL_and94_tree=null;
		BAST LITERAL_then95_tree=null;
		BAST LITERAL_and96_tree=null;
		BAST LITERAL_then97_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:909:12: (l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:910:3: l= relation ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_relation_in_conjunction5182);
			l=relation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, l.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:5: ( ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* ) | ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:7: ( LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:9: LITERAL_and ^r+= relation ( LITERAL_and !r+= relation )*
					{
					LITERAL_and92=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and92_tree = (BAST)adaptor.create(LITERAL_and92);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and92_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5197);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:34: ( LITERAL_and !r+= relation )*
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==LITERAL_and) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:911:36: LITERAL_and !r+= relation
							{
							LITERAL_and93=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5201); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5206);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:7: ( LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:9: LITERAL_and ! LITERAL_then ^r+= relation ( LITERAL_and ! LITERAL_then !r+= relation )*
					{
					LITERAL_and94=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5221); if (state.failed) return retval;
					LITERAL_then95=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5224); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then95_tree = (BAST)adaptor.create(LITERAL_then95);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_then95_tree, root_0);
					}

					pushFollow(FOLLOW_relation_in_conjunction5229);
					r=relation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, r.getTree());

					if (list_r==null) list_r=new ArrayList<Object>();
					list_r.add(r.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:48: ( LITERAL_and ! LITERAL_then !r+= relation )*
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==LITERAL_and) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:912:50: LITERAL_and ! LITERAL_then !r+= relation
							{
							LITERAL_and96=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction5233); if (state.failed) return retval;
							LITERAL_then97=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction5236); if (state.failed) return retval;
							pushFollow(FOLLOW_relation_in_conjunction5241);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:1: relation : addSub ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )? ;
	public final BLESS3Parser.relation_return relation() throws RecognitionException {
		BLESS3Parser.relation_return retval = new BLESS3Parser.relation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_in101=null;
		ParserRuleReturnScope addSub98 =null;
		ParserRuleReturnScope relationSymbol99 =null;
		ParserRuleReturnScope addSub100 =null;
		ParserRuleReturnScope range102 =null;

		BAST LITERAL_in101_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:916:9: ( addSub ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:917:2: addSub ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_addSub_in_relation5262);
			addSub98=addSub();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub98.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:918:2: ( ( relationSymbol ^ addSub ) | ( LITERAL_in ^ range ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:4: ( relationSymbol ^ addSub )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:4: ( relationSymbol ^ addSub )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:919:6: relationSymbol ^ addSub
					{
					pushFollow(FOLLOW_relationSymbol_in_relation5272);
					relationSymbol99=relationSymbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(relationSymbol99.getTree(), root_0);
					pushFollow(FOLLOW_addSub_in_relation5275);
					addSub100=addSub();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, addSub100.getTree());

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:4: ( LITERAL_in ^ range )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:4: ( LITERAL_in ^ range )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:921:6: LITERAL_in ^ range
					{
					LITERAL_in101=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation5289); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_in101_tree = (BAST)adaptor.create(LITERAL_in101);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_in101_tree, root_0);
					}

					pushFollow(FOLLOW_range_in_relation5292);
					range102=range();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, range102.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:1: range : subexpression rangeSymbol ^ subexpression ;
	public final BLESS3Parser.range_return range() throws RecognitionException {
		BLESS3Parser.range_return retval = new BLESS3Parser.range_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope subexpression103 =null;
		ParserRuleReturnScope rangeSymbol104 =null;
		ParserRuleReturnScope subexpression105 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:6: ( subexpression rangeSymbol ^ subexpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:925:8: subexpression rangeSymbol ^ subexpression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_range5307);
			subexpression103=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression103.getTree());

			pushFollow(FOLLOW_rangeSymbol_in_range5309);
			rangeSymbol104=rangeSymbol();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(rangeSymbol104.getTree(), root_0);
			pushFollow(FOLLOW_subexpression_in_range5312);
			subexpression105=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression105.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:1: addSub : multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? ;
	public final BLESS3Parser.addSub_return addSub() throws RecognitionException {
		BLESS3Parser.addSub_return retval = new BLESS3Parser.addSub_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token PLUS107=null;
		Token PLUS109=null;
		Token MINUS111=null;
		ParserRuleReturnScope multDiv106 =null;
		ParserRuleReturnScope multDiv108 =null;
		ParserRuleReturnScope multDiv110 =null;
		ParserRuleReturnScope multDiv112 =null;

		BAST PLUS107_tree=null;
		BAST PLUS109_tree=null;
		BAST MINUS111_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:927:7: ( multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:928:3: multDiv ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_multDiv_in_addSub5322);
			multDiv106=multDiv();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv106.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:929:3: ( ( PLUS ^ multDiv ( PLUS ! multDiv )* ) | ( MINUS ^ multDiv ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:5: ( PLUS ^ multDiv ( PLUS ! multDiv )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:7: PLUS ^ multDiv ( PLUS ! multDiv )*
					{
					PLUS107=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5334); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS107_tree = (BAST)adaptor.create(PLUS107);
					root_0 = (BAST)adaptor.becomeRoot(PLUS107_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5337);
					multDiv108=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv108.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:21: ( PLUS ! multDiv )*
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==PLUS) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:930:23: PLUS ! multDiv
							{
							PLUS109=(Token)match(input,PLUS,FOLLOW_PLUS_in_addSub5341); if (state.failed) return retval;
							pushFollow(FOLLOW_multDiv_in_addSub5344);
							multDiv110=multDiv();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv110.getTree());

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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:5: ( MINUS ^ multDiv )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:5: ( MINUS ^ multDiv )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:932:7: MINUS ^ multDiv
					{
					MINUS111=(Token)match(input,MINUS,FOLLOW_MINUS_in_addSub5363); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS111_tree = (BAST)adaptor.create(MINUS111);
					root_0 = (BAST)adaptor.becomeRoot(MINUS111_tree, root_0);
					}

					pushFollow(FOLLOW_multDiv_in_addSub5366);
					multDiv112=multDiv();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multDiv112.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:1: multDiv : exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? ;
	public final BLESS3Parser.multDiv_return multDiv() throws RecognitionException {
		BLESS3Parser.multDiv_return retval = new BLESS3Parser.multDiv_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token TIMES114=null;
		Token TIMES116=null;
		ParserRuleReturnScope exponentiation113 =null;
		ParserRuleReturnScope exponentiation115 =null;
		ParserRuleReturnScope exponentiation117 =null;
		ParserRuleReturnScope dividers118 =null;
		ParserRuleReturnScope exponentiation119 =null;

		BAST TIMES114_tree=null;
		BAST TIMES116_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:936:8: ( exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:937:3: exponentiation ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_exponentiation_in_multDiv5386);
			exponentiation113=exponentiation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation113.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:938:3: ( ( TIMES ^ exponentiation ( TIMES ! exponentiation )* ) | ( dividers ^ exponentiation ) )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:5: ( TIMES ^ exponentiation ( TIMES ! exponentiation )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:7: TIMES ^ exponentiation ( TIMES ! exponentiation )*
					{
					TIMES114=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5398); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES114_tree = (BAST)adaptor.create(TIMES114);
					root_0 = (BAST)adaptor.becomeRoot(TIMES114_tree, root_0);
					}

					pushFollow(FOLLOW_exponentiation_in_multDiv5401);
					exponentiation115=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation115.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:29: ( TIMES ! exponentiation )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==TIMES) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:939:31: TIMES ! exponentiation
							{
							TIMES116=(Token)match(input,TIMES,FOLLOW_TIMES_in_multDiv5405); if (state.failed) return retval;
							pushFollow(FOLLOW_exponentiation_in_multDiv5408);
							exponentiation117=exponentiation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation117.getTree());

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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:4: ( dividers ^ exponentiation )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:4: ( dividers ^ exponentiation )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:941:6: dividers ^ exponentiation
					{
					pushFollow(FOLLOW_dividers_in_multDiv5426);
					dividers118=dividers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (BAST)adaptor.becomeRoot(dividers118.getTree(), root_0);
					pushFollow(FOLLOW_exponentiation_in_multDiv5429);
					exponentiation119=exponentiation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exponentiation119.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:945:1: dividers : ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem );
	public final BLESS3Parser.dividers_return dividers() throws RecognitionException {
		BLESS3Parser.dividers_return retval = new BLESS3Parser.dividers_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set120=null;

		BAST set120_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:945:9: ( DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set120=input.LT(1);
			if ( input.LA(1)==DIVIDE||input.LA(1)==LITERAL_div||input.LA(1)==LITERAL_mod||input.LA(1)==LITERAL_rem ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set120));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:1: exponentiation : subexpression ( EXP ^ subexpression )? ;
	public final BLESS3Parser.exponentiation_return exponentiation() throws RecognitionException {
		BLESS3Parser.exponentiation_return retval = new BLESS3Parser.exponentiation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token EXP122=null;
		ParserRuleReturnScope subexpression121 =null;
		ParserRuleReturnScope subexpression123 =null;

		BAST EXP122_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:947:15: ( subexpression ( EXP ^ subexpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:948:3: subexpression ( EXP ^ subexpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_subexpression_in_exponentiation5472);
			subexpression121=subexpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression121.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:948:17: ( EXP ^ subexpression )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==EXP) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:948:19: EXP ^ subexpression
					{
					EXP122=(Token)match(input,EXP,FOLLOW_EXP_in_exponentiation5476); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EXP122_tree = (BAST)adaptor.create(EXP122);
					root_0 = (BAST)adaptor.becomeRoot(EXP122_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_exponentiation5479);
					subexpression123=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression123.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:951:1: subexpression : (n= LITERAL_not te= timedExpression -> ^( $n $te) |abs= LITERAL_abs te= timedExpression -> ^( $abs $te) |trunc= LITERAL_truncate te= timedExpression -> ^( $trunc $te) |rnd= LITERAL_round te= timedExpression -> ^( $rnd $te) | MINUS te= timedExpression -> ^( UNARY_MINUS $te) |te= timedExpression -> $te);
	public final BLESS3Parser.subexpression_return subexpression() throws RecognitionException {
		BLESS3Parser.subexpression_return retval = new BLESS3Parser.subexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token n=null;
		Token abs=null;
		Token trunc=null;
		Token rnd=null;
		Token MINUS124=null;
		ParserRuleReturnScope te =null;

		BAST n_tree=null;
		BAST abs_tree=null;
		BAST trunc_tree=null;
		BAST rnd_tree=null;
		BAST MINUS124_tree=null;
		RewriteRuleTokenStream stream_LITERAL_not=new RewriteRuleTokenStream(adaptor,"token LITERAL_not");
		RewriteRuleTokenStream stream_LITERAL_round=new RewriteRuleTokenStream(adaptor,"token LITERAL_round");
		RewriteRuleTokenStream stream_LITERAL_abs=new RewriteRuleTokenStream(adaptor,"token LITERAL_abs");
		RewriteRuleTokenStream stream_LITERAL_truncate=new RewriteRuleTokenStream(adaptor,"token LITERAL_truncate");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
		RewriteRuleSubtreeStream stream_timedExpression=new RewriteRuleSubtreeStream(adaptor,"rule timedExpression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:951:14: (n= LITERAL_not te= timedExpression -> ^( $n $te) |abs= LITERAL_abs te= timedExpression -> ^( $abs $te) |trunc= LITERAL_truncate te= timedExpression -> ^( $trunc $te) |rnd= LITERAL_round te= timedExpression -> ^( $rnd $te) | MINUS te= timedExpression -> ^( UNARY_MINUS $te) |te= timedExpression -> $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:952:3: n= LITERAL_not te= timedExpression
					{
					n=(Token)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5498); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_not.add(n);

					pushFollow(FOLLOW_timedExpression_in_subexpression5502);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: n, te
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
					// 953:5: -> ^( $n $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:953:8: ^( $n $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:955:3: abs= LITERAL_abs te= timedExpression
					{
					abs=(Token)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5527); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_abs.add(abs);

					pushFollow(FOLLOW_timedExpression_in_subexpression5531);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: te, abs
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
					// 956:5: -> ^( $abs $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:956:8: ^( $abs $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:958:3: trunc= LITERAL_truncate te= timedExpression
					{
					trunc=(Token)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5556); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_truncate.add(trunc);

					pushFollow(FOLLOW_timedExpression_in_subexpression5560);
					te=timedExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_timedExpression.add(te.getTree());
					// AST REWRITE
					// elements: trunc, te
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
					// 959:5: -> ^( $trunc $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:959:8: ^( $trunc $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:961:3: rnd= LITERAL_round te= timedExpression
					{
					rnd=(Token)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5585); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_round.add(rnd);

					pushFollow(FOLLOW_timedExpression_in_subexpression5589);
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
					// 962:5: -> ^( $rnd $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:962:8: ^( $rnd $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:964:2: MINUS te= timedExpression
					{
					MINUS124=(Token)match(input,MINUS,FOLLOW_MINUS_in_subexpression5611); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS124);

					pushFollow(FOLLOW_timedExpression_in_subexpression5615);
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
					// 965:4: -> ^( UNARY_MINUS $te)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:965:7: ^( UNARY_MINUS $te)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:967:2: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5637);
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
					// 968:4: -> $te
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:1: unaryOperator : ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round );
	public final BLESS3Parser.unaryOperator_return unaryOperator() throws RecognitionException {
		BLESS3Parser.unaryOperator_return retval = new BLESS3Parser.unaryOperator_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token set125=null;

		BAST set125_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:971:14: ( LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:
			{
			root_0 = (BAST)adaptor.nil();


			set125=input.LT(1);
			if ( input.LA(1)==LITERAL_abs||input.LA(1)==LITERAL_not||input.LA(1)==LITERAL_round||input.LA(1)==LITERAL_truncate ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (BAST)adaptor.create(set125));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:975:1: timedExpression : timedSubject ( AT_SIGN ^ subexpression | CARET ^ periodShift )? ;
	public final BLESS3Parser.timedExpression_return timedExpression() throws RecognitionException {
		BLESS3Parser.timedExpression_return retval = new BLESS3Parser.timedExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AT_SIGN127=null;
		Token CARET129=null;
		ParserRuleReturnScope timedSubject126 =null;
		ParserRuleReturnScope subexpression128 =null;
		ParserRuleReturnScope periodShift130 =null;

		BAST AT_SIGN127_tree=null;
		BAST CARET129_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:975:16: ( timedSubject ( AT_SIGN ^ subexpression | CARET ^ periodShift )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:976:3: timedSubject ( AT_SIGN ^ subexpression | CARET ^ periodShift )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_timedSubject_in_timedExpression5678);
			timedSubject126=timedSubject();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, timedSubject126.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:977:3: ( AT_SIGN ^ subexpression | CARET ^ periodShift )?
			int alt70=3;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==AT_SIGN) ) {
				alt70=1;
			}
			else if ( (LA70_0==CARET) ) {
				alt70=2;
			}
			switch (alt70) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:978:3: AT_SIGN ^ subexpression
					{
					AT_SIGN127=(Token)match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5686); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AT_SIGN127_tree = (BAST)adaptor.create(AT_SIGN127);
					root_0 = (BAST)adaptor.becomeRoot(AT_SIGN127_tree, root_0);
					}

					pushFollow(FOLLOW_subexpression_in_timedExpression5689);
					subexpression128=subexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subexpression128.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:981:5: CARET ^ periodShift
					{
					CARET129=(Token)match(input,CARET,FOLLOW_CARET_in_timedExpression5697); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CARET129_tree = (BAST)adaptor.create(CARET129);
					root_0 = (BAST)adaptor.becomeRoot(CARET129_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_timedExpression5700);
					periodShift130=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift130.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:985:1: timedSubject : ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value );
	public final BLESS3Parser.timedSubject_return timedSubject() throws RecognitionException {
		BLESS3Parser.timedSubject_return retval = new BLESS3Parser.timedSubject_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope conditionalExpression131 =null;
		ParserRuleReturnScope parenthesizedSubexpression132 =null;
		ParserRuleReturnScope recordTerm133 =null;
		ParserRuleReturnScope invocation134 =null;
		ParserRuleReturnScope value135 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:985:13: ( ( LPAREN LITERAL_if )=> conditionalExpression | parenthesizedSubexpression | ( LBRACKET ID COLON )=> recordTerm | ( ID LPAREN )=> invocation | value )
			int alt71=5;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				int LA71_1 = input.LA(2);
				if ( (LA71_1==LITERAL_if) && (synpred114_BLESS3())) {
					alt71=1;
				}
				else if ( (LA71_1==AADL_STRING_LITERAL||LA71_1==ID||LA71_1==LBRACKET||(LA71_1 >= LITERAL_abs && LA71_1 <= LITERAL_all)||LA71_1==LITERAL_case||LA71_1==LITERAL_exists||LA71_1==LITERAL_false||(LA71_1 >= LITERAL_not && LA71_1 <= LITERAL_numberof)||LA71_1==LITERAL_product||LA71_1==LITERAL_round||LA71_1==LITERAL_self||LA71_1==LITERAL_sum||LA71_1==LITERAL_timeout||LA71_1==LITERAL_tops||(LA71_1 >= LITERAL_true && LA71_1 <= LITERAL_truncate)||LA71_1==LPAREN||LA71_1==MINUS||LA71_1==NUMBER||LA71_1==OCTOTHORPE) ) {
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
				break;
			case LBRACKET:
				{
				int LA71_2 = input.LA(2);
				if ( (LA71_2==ID) ) {
					int LA71_7 = input.LA(3);
					if ( (LA71_7==COLON) && (synpred116_BLESS3())) {
						alt71=3;
					}
					else if ( (LA71_7==DOT||LA71_7==DOUBLE_COLON||LA71_7==OCTOTHORPE) ) {
						alt71=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 71, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA71_2==LITERAL_self||LA71_2==OCTOTHORPE) ) {
					alt71=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ID:
				{
				int LA71_3 = input.LA(2);
				if ( (LA71_3==LPAREN) && (synpred117_BLESS3())) {
					alt71=4;
				}
				else if ( (LA71_3==EOF||(LA71_3 >= AL && LA71_3 <= AMPERSAND)||LA71_3==AT_SIGN||(LA71_3 >= BOX && LA71_3 <= COLON)||(LA71_3 >= COMMA && LA71_3 <= COMMADOT)||LA71_3==CVP||(LA71_3 >= DIVIDE && LA71_3 <= DOUBLE_COLON)||LA71_3==EQ||LA71_3==EXP||(LA71_3 >= GT && LA71_3 <= GUARD)||(LA71_3 >= ID && LA71_3 <= IMP)||(LA71_3 >= LASS && LA71_3 <= LBRACKET)||LA71_3==LCURLY||LA71_3==LITERAL_and||LA71_3==LITERAL_are||LA71_3==LITERAL_computation||LA71_3==LITERAL_declare||(LA71_3 >= LITERAL_div && LA71_3 <= LITERAL_else)||LA71_3==LITERAL_exception||(LA71_3 >= LITERAL_fetchadd && LA71_3 <= LITERAL_fi)||(LA71_3 >= LITERAL_for && LA71_3 <= LITERAL_forall)||(LA71_3 >= LITERAL_if && LA71_3 <= LITERAL_in)||LA71_3==LITERAL_invariant||LA71_3==LITERAL_mod||LA71_3==LITERAL_of||LA71_3==LITERAL_or||LA71_3==LITERAL_rem||LA71_3==LITERAL_setmode||LA71_3==LITERAL_skip||LA71_3==LITERAL_states||(LA71_3 >= LITERAL_swap && LA71_3 <= LITERAL_then)||LA71_3==LITERAL_transitions||LA71_3==LITERAL_until||LA71_3==LITERAL_when||LA71_3==LITERAL_while||LA71_3==LITERAL_xor||LA71_3==LT||LA71_3==MINUS||LA71_3==NEQ||(LA71_3 >= OCTOTHORPE && LA71_3 <= OLD_NEQ)||LA71_3==PLUS||LA71_3==PLUS_EQUALS||LA71_3==QQ||(LA71_3 >= QUESTION && LA71_3 <= RCURLY)||LA71_3==RPAREN||LA71_3==SEMICOLON||LA71_3==TICK||LA71_3==TIMES||LA71_3==VERT) ) {
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
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_self:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case NUMBER:
			case OCTOTHORPE:
				{
				alt71=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:986:3: ( LPAREN LITERAL_if )=> conditionalExpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5725);
					conditionalExpression131=conditionalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression131.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:987:5: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5731);
					parenthesizedSubexpression132=parenthesizedSubexpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parenthesizedSubexpression132.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:5: ( LBRACKET ID COLON )=> recordTerm
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_recordTerm_in_timedSubject5748);
					recordTerm133=recordTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, recordTerm133.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:5: ( ID LPAREN )=> invocation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_invocation_in_timedSubject5761);
					invocation134=invocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, invocation134.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:990:5: value
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_value_in_timedSubject5769);
					value135=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value135.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:993:1: parenthesizedSubexpression : LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN ;
	public final BLESS3Parser.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		BLESS3Parser.parenthesizedSubexpression_return retval = new BLESS3Parser.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN136=null;
		Token QQ138=null;
		Token COLON140=null;
		Token RPAREN142=null;
		ParserRuleReturnScope caseexpression =null;
		ParserRuleReturnScope expression137 =null;
		ParserRuleReturnScope expression139 =null;
		ParserRuleReturnScope expression141 =null;

		BAST LPAREN136_tree=null;
		BAST QQ138_tree=null;
		BAST COLON140_tree=null;
		BAST RPAREN142_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:993:27: ( LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:994:2: LPAREN ^ ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression ) RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN136=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression5780); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN136_tree = (BAST)adaptor.create(LPAREN136);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN136_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:995:2: ( ( expression ( QQ ^ expression COLON ! expression )? ) |caseexpression= caseExpression )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==AADL_STRING_LITERAL||LA73_0==ID||LA73_0==LBRACKET||(LA73_0 >= LITERAL_abs && LA73_0 <= LITERAL_all)||LA73_0==LITERAL_exists||LA73_0==LITERAL_false||(LA73_0 >= LITERAL_not && LA73_0 <= LITERAL_numberof)||LA73_0==LITERAL_product||LA73_0==LITERAL_round||LA73_0==LITERAL_self||LA73_0==LITERAL_sum||LA73_0==LITERAL_timeout||LA73_0==LITERAL_tops||(LA73_0 >= LITERAL_true && LA73_0 <= LITERAL_truncate)||LA73_0==LPAREN||LA73_0==MINUS||LA73_0==NUMBER||LA73_0==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:4: ( expression ( QQ ^ expression COLON ! expression )? )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:4: ( expression ( QQ ^ expression COLON ! expression )? )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:6: expression ( QQ ^ expression COLON ! expression )?
					{
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5793);
					expression137=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression137.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:17: ( QQ ^ expression COLON ! expression )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==QQ) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:996:19: QQ ^ expression COLON ! expression
							{
							QQ138=(Token)match(input,QQ,FOLLOW_QQ_in_parenthesizedSubexpression5797); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							QQ138_tree = (BAST)adaptor.create(QQ138);
							root_0 = (BAST)adaptor.becomeRoot(QQ138_tree, root_0);
							}

							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5800);
							expression139=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression139.getTree());

							COLON140=(Token)match(input,COLON,FOLLOW_COLON_in_parenthesizedSubexpression5802); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_parenthesizedSubexpression5805);
							expression141=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression141.getTree());

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:998:4: caseexpression= caseExpression
					{
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression5823);
					caseexpression=caseExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseexpression.getTree());

					}
					break;

			}

			RPAREN142=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression5831); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN142_tree = (BAST)adaptor.create(RPAREN142);
			adaptor.addChild(root_0, RPAREN142_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:1: caseExpression : LITERAL_case ^ ( caseChoice )+ ;
	public final BLESS3Parser.caseExpression_return caseExpression() throws RecognitionException {
		BLESS3Parser.caseExpression_return retval = new BLESS3Parser.caseExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_case143=null;
		ParserRuleReturnScope caseChoice144 =null;

		BAST LITERAL_case143_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1003:15: ( LITERAL_case ^ ( caseChoice )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:3: LITERAL_case ^ ( caseChoice )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_case143=(Token)match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression5841); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_case143_tree = (BAST)adaptor.create(LITERAL_case143);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_case143_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:17: ( caseChoice )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1004:17: caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression5844);
					caseChoice144=caseChoice();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseChoice144.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1007:1: caseChoice : LPAREN !bool= expression IMP ^exp= expression RPAREN !;
	public final BLESS3Parser.caseChoice_return caseChoice() throws RecognitionException {
		BLESS3Parser.caseChoice_return retval = new BLESS3Parser.caseChoice_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN145=null;
		Token IMP146=null;
		Token RPAREN147=null;
		ParserRuleReturnScope bool =null;
		ParserRuleReturnScope exp =null;

		BAST LPAREN145_tree=null;
		BAST IMP146_tree=null;
		BAST RPAREN147_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1008:3: ( LPAREN !bool= expression IMP ^exp= expression RPAREN !)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1009:3: LPAREN !bool= expression IMP ^exp= expression RPAREN !
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN145=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_caseChoice5860); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_caseChoice5865);
			bool=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

			IMP146=(Token)match(input,IMP,FOLLOW_IMP_in_caseChoice5867); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IMP146_tree = (BAST)adaptor.create(IMP146);
			root_0 = (BAST)adaptor.becomeRoot(IMP146_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_caseChoice5872);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN147=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_caseChoice5874); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1012:1: conditionalExpression : lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ[$lp,\"??\"] $pred $t $f) $rp) ;
	public final BLESS3Parser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		BLESS3Parser.conditionalExpression_return retval = new BLESS3Parser.conditionalExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lp=null;
		Token rp=null;
		Token LITERAL_if148=null;
		Token LITERAL_then149=null;
		Token LITERAL_else150=null;
		ParserRuleReturnScope pred =null;
		ParserRuleReturnScope t =null;
		ParserRuleReturnScope f =null;

		BAST lp_tree=null;
		BAST rp_tree=null;
		BAST LITERAL_if148_tree=null;
		BAST LITERAL_then149_tree=null;
		BAST LITERAL_else150_tree=null;
		RewriteRuleTokenStream stream_LITERAL_else=new RewriteRuleTokenStream(adaptor,"token LITERAL_else");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_LITERAL_then=new RewriteRuleTokenStream(adaptor,"token LITERAL_then");
		RewriteRuleTokenStream stream_LITERAL_if=new RewriteRuleTokenStream(adaptor,"token LITERAL_if");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1012:22: (lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN -> ^( $lp ^( QQ[$lp,\"??\"] $pred $t $f) $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1013:3: lp= LPAREN LITERAL_if pred= expression LITERAL_then t= expression LITERAL_else f= expression rp= RPAREN
			{
			lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression5890); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(lp);

			LITERAL_if148=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_conditionalExpression5892); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(LITERAL_if148);

			pushFollow(FOLLOW_expression_in_conditionalExpression5896);
			pred=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(pred.getTree());
			LITERAL_then149=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conditionalExpression5898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_then.add(LITERAL_then149);

			pushFollow(FOLLOW_expression_in_conditionalExpression5902);
			t=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(t.getTree());
			LITERAL_else150=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_conditionalExpression5904); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_else.add(LITERAL_else150);

			pushFollow(FOLLOW_expression_in_conditionalExpression5908);
			f=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(f.getTree());
			rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression5912); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(rp);

			// AST REWRITE
			// elements: lp, t, rp, f, pred
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
			// 1014:5: -> ^( $lp ^( QQ[$lp,\"??\"] $pred $t $f) $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:8: ^( $lp ^( QQ[$lp,\"??\"] $pred $t $f) $rp)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lp.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1014:15: ^( QQ[$lp,\"??\"] $pred $t $f)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QQ, lp, "??"), root_2);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1017:1: recordTerm : LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM[$typeid,\"RECORD_TERM\"] $typeid ( $prv)+ ) ;
	public final BLESS3Parser.recordTerm_return recordTerm() throws RecognitionException {
		BLESS3Parser.recordTerm_return retval = new BLESS3Parser.recordTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token typeid=null;
		Token LBRACKET151=null;
		Token COLON152=null;
		Token RBRACKET153=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		BAST typeid_tree=null;
		BAST LBRACKET151_tree=null;
		BAST COLON152_tree=null;
		BAST RBRACKET153_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_recordValue=new RewriteRuleSubtreeStream(adaptor,"rule recordValue");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1018:3: ( LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET -> ^( RECORD_TERM[$typeid,\"RECORD_TERM\"] $typeid ( $prv)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:3: LBRACKET typeid= ID COLON (prv+= recordValue )+ RBRACKET
			{
			LBRACKET151=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_recordTerm5959); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET151);

			typeid=(Token)match(input,ID,FOLLOW_ID_in_recordTerm5963); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(typeid);

			COLON152=(Token)match(input,COLON,FOLLOW_COLON_in_recordTerm5965); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON152);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:31: (prv+= recordValue )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1019:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm5969);
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

			RBRACKET153=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_recordTerm5972); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET153);

			// AST REWRITE
			// elements: prv, typeid
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
			// 1020:5: -> ^( RECORD_TERM[$typeid,\"RECORD_TERM\"] $typeid ( $prv)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1020:8: ^( RECORD_TERM[$typeid,\"RECORD_TERM\"] $typeid ( $prv)+ )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(RECORD_TERM, typeid, "RECORD_TERM"), root_1);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1023:1: recordValue : identifier ARROW ^ value ( SEMICOLON !)? ;
	public final BLESS3Parser.recordValue_return recordValue() throws RecognitionException {
		BLESS3Parser.recordValue_return retval = new BLESS3Parser.recordValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ARROW155=null;
		Token SEMICOLON157=null;
		ParserRuleReturnScope identifier154 =null;
		ParserRuleReturnScope value156 =null;

		BAST ARROW155_tree=null;
		BAST SEMICOLON157_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1024:3: ( identifier ARROW ^ value ( SEMICOLON !)? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1025:20: identifier ARROW ^ value ( SEMICOLON !)?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_recordValue6009);
			identifier154=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier154.getTree());

			ARROW155=(Token)match(input,ARROW,FOLLOW_ARROW_in_recordValue6011); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ARROW155_tree = (BAST)adaptor.create(ARROW155);
			root_0 = (BAST)adaptor.becomeRoot(ARROW155_tree, root_0);
			}

			pushFollow(FOLLOW_value_in_recordValue6014);
			value156=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value156.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1025:44: ( SEMICOLON !)?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==SEMICOLON) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1025:46: SEMICOLON !
					{
					SEMICOLON157=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordValue6018); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1028:1: periodShift : (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS[$m,\"-\"] $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS[$m,\"-\"] ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1028:12: ( (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) ) -> {m!=null&&v!=null}? ^( UNARY_MINUS[$m,\"-\"] $v) -> {m!=null&&ie!=null}? ^( UNARY_MINUS[$m,\"-\"] ^( $lp $ie $rp) ) -> {m==null&&v!=null}? $v -> ^( $lp $ie $rp) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1029:2: (m= MINUS )? (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1029:2: (m= MINUS )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==MINUS) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1029:4: m= MINUS
					{
					m=(Token)match(input,MINUS,FOLLOW_MINUS_in_periodShift6041); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(m);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1030:2: (v= value | (lp= LPAREN ie= indexExpression rp= RPAREN ) )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==AADL_STRING_LITERAL||LA78_0==ID||LA78_0==LBRACKET||LA78_0==LITERAL_false||(LA78_0 >= LITERAL_now && LA78_0 <= LITERAL_null)||LA78_0==LITERAL_self||LA78_0==LITERAL_timeout||LA78_0==LITERAL_tops||LA78_0==LITERAL_true||LA78_0==NUMBER||LA78_0==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1031:4: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift6054);
					v=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_value.add(v.getTree());
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1033:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1033:4: (lp= LPAREN ie= indexExpression rp= RPAREN )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1033:5: lp= LPAREN ie= indexExpression rp= RPAREN
					{
					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_periodShift6068); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					pushFollow(FOLLOW_indexExpression_in_periodShift6072);
					ie=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpression.add(ie.getTree());
					rp=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_periodShift6076); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(rp);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: lp, ie, rp, v, lp, rp, ie, v
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
			// 1035:2: -> {m!=null&&v!=null}? ^( UNARY_MINUS[$m,\"-\"] $v)
			if (m!=null&&v!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1035:25: ^( UNARY_MINUS[$m,\"-\"] $v)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, m, "-"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1036:2: -> {m!=null&&ie!=null}? ^( UNARY_MINUS[$m,\"-\"] ^( $lp $ie $rp) )
			if (m!=null&&ie!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:26: ^( UNARY_MINUS[$m,\"-\"] ^( $lp $ie $rp) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(UNARY_MINUS, m, "-"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1036:49: ^( $lp $ie $rp)
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

			else // 1037:2: -> {m==null&&v!=null}? $v
			if (m==null&&v!=null) {
				adaptor.addChild(root_0, stream_v.nextTree());
			}

			else // 1038:2: -> ^( $lp $ie $rp)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1038:5: ^( $lp $ie $rp)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1041:1: indexExpression : periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? ;
	public final BLESS3Parser.indexExpression_return indexExpression() throws RecognitionException {
		BLESS3Parser.indexExpression_return retval = new BLESS3Parser.indexExpression_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token MINUS159=null;
		Token LITERAL_div161=null;
		Token LITERAL_mod163=null;
		Token LITERAL_rem165=null;
		Token PLUS167=null;
		Token PLUS169=null;
		Token TIMES171=null;
		Token TIMES173=null;
		ParserRuleReturnScope periodShift158 =null;
		ParserRuleReturnScope periodShift160 =null;
		ParserRuleReturnScope periodShift162 =null;
		ParserRuleReturnScope periodShift164 =null;
		ParserRuleReturnScope periodShift166 =null;
		ParserRuleReturnScope periodShift168 =null;
		ParserRuleReturnScope periodShift170 =null;
		ParserRuleReturnScope periodShift172 =null;
		ParserRuleReturnScope periodShift174 =null;

		BAST MINUS159_tree=null;
		BAST LITERAL_div161_tree=null;
		BAST LITERAL_mod163_tree=null;
		BAST LITERAL_rem165_tree=null;
		BAST PLUS167_tree=null;
		BAST PLUS169_tree=null;
		BAST TIMES171_tree=null;
		BAST TIMES173_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1041:16: ( periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1042:2: periodShift ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_periodShift_in_indexExpression6158);
			periodShift158=periodShift();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift158.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1043:2: ( MINUS ^ periodShift | LITERAL_div ^ periodShift | LITERAL_mod ^ periodShift | LITERAL_rem ^ periodShift | PLUS ^ periodShift ( PLUS ! periodShift )* | TIMES ^ periodShift ( TIMES ! periodShift )* )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1044:4: MINUS ^ periodShift
					{
					MINUS159=(Token)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					MINUS159_tree = (BAST)adaptor.create(MINUS159);
					root_0 = (BAST)adaptor.becomeRoot(MINUS159_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6169);
					periodShift160=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift160.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1046:4: LITERAL_div ^ periodShift
					{
					LITERAL_div161=(Token)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6179); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_div161_tree = (BAST)adaptor.create(LITERAL_div161);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_div161_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6182);
					periodShift162=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift162.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1048:4: LITERAL_mod ^ periodShift
					{
					LITERAL_mod163=(Token)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_mod163_tree = (BAST)adaptor.create(LITERAL_mod163);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_mod163_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6195);
					periodShift164=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift164.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1050:4: LITERAL_rem ^ periodShift
					{
					LITERAL_rem165=(Token)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6205); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_rem165_tree = (BAST)adaptor.create(LITERAL_rem165);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_rem165_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6208);
					periodShift166=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift166.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:4: PLUS ^ periodShift ( PLUS ! periodShift )*
					{
					PLUS167=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6218); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					PLUS167_tree = (BAST)adaptor.create(PLUS167);
					root_0 = (BAST)adaptor.becomeRoot(PLUS167_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6221);
					periodShift168=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift168.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:22: ( PLUS ! periodShift )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==PLUS) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1052:24: PLUS ! periodShift
							{
							PLUS169=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexExpression6225); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6228);
							periodShift170=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift170.getTree());

							}
							break;

						default :
							break loop79;
						}
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:4: TIMES ^ periodShift ( TIMES ! periodShift )*
					{
					TIMES171=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6241); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES171_tree = (BAST)adaptor.create(TIMES171);
					root_0 = (BAST)adaptor.becomeRoot(TIMES171_tree, root_0);
					}

					pushFollow(FOLLOW_periodShift_in_indexExpression6244);
					periodShift172=periodShift();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift172.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:23: ( TIMES ! periodShift )*
					loop80:
					while (true) {
						int alt80=2;
						int LA80_0 = input.LA(1);
						if ( (LA80_0==TIMES) ) {
							alt80=1;
						}

						switch (alt80) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1054:25: TIMES ! periodShift
							{
							TIMES173=(Token)match(input,TIMES,FOLLOW_TIMES_in_indexExpression6248); if (state.failed) return retval;
							pushFollow(FOLLOW_periodShift_in_indexExpression6251);
							periodShift174=periodShift();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, periodShift174.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1058:1: indexExpressionOrRange : indexExpression ( DOTDOT ^ indexExpression )? ;
	public final BLESS3Parser.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		BLESS3Parser.indexExpressionOrRange_return retval = new BLESS3Parser.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token DOTDOT176=null;
		ParserRuleReturnScope indexExpression175 =null;
		ParserRuleReturnScope indexExpression177 =null;

		BAST DOTDOT176_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1058:23: ( indexExpression ( DOTDOT ^ indexExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:2: indexExpression ( DOTDOT ^ indexExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6268);
			indexExpression175=indexExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression175.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:18: ( DOTDOT ^ indexExpression )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==DOTDOT) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1059:20: DOTDOT ^ indexExpression
					{
					DOTDOT176=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange6272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOTDOT176_tree = (BAST)adaptor.create(DOTDOT176);
					root_0 = (BAST)adaptor.becomeRoot(DOTDOT176_tree, root_0);
					}

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange6275);
					indexExpression177=indexExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, indexExpression177.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1064:1: value : ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue );
	public final BLESS3Parser.value_return value() throws RecognitionException {
		BLESS3Parser.value_return retval = new BLESS3Parser.value_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_timeout180=null;
		Token LITERAL_now181=null;
		Token LITERAL_tops182=null;
		ParserRuleReturnScope valueName178 =null;
		ParserRuleReturnScope constant179 =null;
		ParserRuleReturnScope enumerationValue183 =null;

		BAST LITERAL_timeout180_tree=null;
		BAST LITERAL_now181_tree=null;
		BAST LITERAL_tops182_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1064:6: ( valueName | constant | LITERAL_timeout | LITERAL_now | LITERAL_tops | enumerationValue )
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
						alt83=6;
					}
					else if ( (LA83_6==LITERAL_count||LA83_6==LITERAL_fresh||LA83_6==LITERAL_updated) ) {
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
						else if ( (LA83_10==EOF||(LA83_10 >= AL && LA83_10 <= AMPERSAND)||LA83_10==AT_SIGN||(LA83_10 >= BOX && LA83_10 <= COLON)||(LA83_10 >= COMMA && LA83_10 <= COMMADOT)||LA83_10==CVP||LA83_10==DIVIDE||(LA83_10 >= DOT && LA83_10 <= DOTDOT)||LA83_10==EQ||LA83_10==EXP||(LA83_10 >= GT && LA83_10 <= GUARD)||(LA83_10 >= ID && LA83_10 <= IMP)||(LA83_10 >= LASS && LA83_10 <= LBRACKET)||LA83_10==LCURLY||LA83_10==LITERAL_and||LA83_10==LITERAL_are||LA83_10==LITERAL_computation||LA83_10==LITERAL_declare||(LA83_10 >= LITERAL_div && LA83_10 <= LITERAL_else)||LA83_10==LITERAL_exception||(LA83_10 >= LITERAL_fetchadd && LA83_10 <= LITERAL_fi)||(LA83_10 >= LITERAL_for && LA83_10 <= LITERAL_forall)||(LA83_10 >= LITERAL_if && LA83_10 <= LITERAL_in)||LA83_10==LITERAL_invariant||LA83_10==LITERAL_mod||LA83_10==LITERAL_of||LA83_10==LITERAL_or||LA83_10==LITERAL_rem||LA83_10==LITERAL_setmode||LA83_10==LITERAL_skip||LA83_10==LITERAL_states||(LA83_10 >= LITERAL_swap && LA83_10 <= LITERAL_then)||LA83_10==LITERAL_transitions||LA83_10==LITERAL_until||LA83_10==LITERAL_when||LA83_10==LITERAL_while||LA83_10==LITERAL_xor||LA83_10==LT||LA83_10==MINUS||LA83_10==NEQ||LA83_10==OLD_NEQ||LA83_10==PLUS||LA83_10==PLUS_EQUALS||LA83_10==QQ||(LA83_10 >= QUESTION && LA83_10 <= RCURLY)||LA83_10==RPAREN||LA83_10==SEMICOLON||LA83_10==TICK||LA83_10==TIMES||LA83_10==VERT) ) {
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
			case LBRACKET:
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1065:3: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_value6291);
					valueName178=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName178.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1067:3: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_value6299);
					constant179=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant179.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1069:3: LITERAL_timeout
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout180=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout180_tree = (BAST)adaptor.create(LITERAL_timeout180);
					adaptor.addChild(root_0, LITERAL_timeout180_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1071:3: LITERAL_now
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_now181=(Token)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6315); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_now181_tree = (BAST)adaptor.create(LITERAL_now181);
					adaptor.addChild(root_0, LITERAL_now181_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1073:3: LITERAL_tops
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_tops182=(Token)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6323); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_tops182_tree = (BAST)adaptor.create(LITERAL_tops182);
					adaptor.addChild(root_0, LITERAL_tops182_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1075:3: enumerationValue
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_enumerationValue_in_value6331);
					enumerationValue183=enumerationValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, enumerationValue183.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:1: valueName : id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol ( $pr)? ) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT[$id,\".\"] ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id;
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
		Token RPAREN184=null;
		Token RBRACKET185=null;
		Token LBRACKET186=null;
		Token RBRACKET187=null;
		Token DOT188=null;
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
		BAST RPAREN184_tree=null;
		BAST RBRACKET185_tree=null;
		BAST LBRACKET186_tree=null;
		BAST RBRACKET187_tree=null;
		BAST DOT188_tree=null;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1078:10: (id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )? -> {dol!=null}? ^( $id $dol ( $pr)? ) -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) ) -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT[$id,\".\"] ) -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) ) -> {q!=null}? ^( $q $id) -> {fresh!=null}? ^( $t $id $fresh) -> {count!=null}? ^( $t $id $count) -> {updated!=null}? ^( $t $id $updated) -> $id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1079:3: id= ID (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )? (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? (dot= DOT pn+= partialName ( DOT pn+= partialName )* )? (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_valueName6346); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:5: (dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==DOLLAR) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:7: dol= DOLLAR lp= LPAREN (pr= functionParameters )? RPAREN
					{
					dol=(Token)match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6360); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOLLAR.add(dol);

					lp=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_valueName6364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(lp);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:31: (pr= functionParameters )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==ID) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1081:31: pr= functionParameters
							{
							pushFollow(FOLLOW_functionParameters_in_valueName6369);
							pr=functionParameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_functionParameters.add(pr.getTree());
							}
							break;

					}

					RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_valueName6372); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:4: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==LBRACKET) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1082:6: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6384); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6388);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET185=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6390); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET185);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:6: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==LBRACKET) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1083:8: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET186=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6400); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET186);

							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6404);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET187=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_valueName6406); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET187);

							}
							break;

						default :
							break loop86;
						}
					}

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:4: (dot= DOT pn+= partialName ( DOT pn+= partialName )* )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==DOT) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:6: dot= DOT pn+= partialName ( DOT pn+= partialName )*
					{
					dot=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6422); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(dot);

					pushFollow(FOLLOW_partialName_in_valueName6426);
					pn=partialName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partialName.add(pn.getTree());
					if (list_pn==null) list_pn=new ArrayList<Object>();
					list_pn.add(pn.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:30: ( DOT pn+= partialName )*
					loop88:
					while (true) {
						int alt88=2;
						int LA88_0 = input.LA(1);
						if ( (LA88_0==DOT) ) {
							alt88=1;
						}

						switch (alt88) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1084:32: DOT pn+= partialName
							{
							DOT188=(Token)match(input,DOT,FOLLOW_DOT_in_valueName6430); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_DOT.add(DOT188);

							pushFollow(FOLLOW_partialName_in_valueName6434);
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

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:5: (q= QUESTION |t= TICK fresh= LITERAL_fresh |t= TICK count= LITERAL_count |t= TICK updated= LITERAL_updated )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1085:8: q= QUESTION
					{
					q=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6451); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION.add(q);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1086:7: t= TICK fresh= LITERAL_fresh
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6463); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					fresh=(Token)match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6467); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_fresh.add(fresh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1087:7: t= TICK count= LITERAL_count
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6478); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					count=(Token)match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6482); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_count.add(count);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1088:7: t= TICK updated= LITERAL_updated
					{
					t=(Token)match(input,TICK,FOLLOW_TICK_in_valueName6492); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TICK.add(t);

					updated=(Token)match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6496); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_updated.add(updated);

					}
					break;

			}

			// AST REWRITE
			// elements: id, fresh, lb, q, id, pr, pn, id, dot, array_index, id, t, id, DOT, count, t, id, pn, id, updated, dol, lb, id, dot, array_index, id, t
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
			// 1091:3: -> {dol!=null}? ^( $id $dol ( $pr)? )
			if (dol!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:19: ^( $id $dol ( $pr)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				adaptor.addChild(root_1, stream_dol.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1091:32: ( $pr)?
				if ( stream_pr.hasNext() ) {
					adaptor.addChild(root_1, stream_pr.nextTree());
				}
				stream_pr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1092:3: -> {lb!=null&&dot!=null}? ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
			if (lb!=null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:29: ^( $id ^( $lb ( $array_index)+ ) ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:36: ^( $lb ( $array_index)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1092:59: ^( $dot ( $pn)+ )
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

			else // 1093:3: -> {lb!=null&&dot==null}? ^( $id ^( $lb ( $array_index)+ ) DOT[$id,\".\"] )
			if (lb!=null&&dot==null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1093:29: ^( $id ^( $lb ( $array_index)+ ) DOT[$id,\".\"] )
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

				adaptor.addChild(root_1, (BAST)adaptor.create(DOT, id, "."));
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1094:3: -> {lb==null&&dot!=null}? ^( $id ^( $dot ( $pn)+ ) )
			if (lb==null&&dot!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:29: ^( $id ^( $dot ( $pn)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1094:36: ^( $dot ( $pn)+ )
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

			else // 1095:3: -> {q!=null}? ^( $q $id)
			if (q!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1095:17: ^( $q $id)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_q.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1096:3: -> {fresh!=null}? ^( $t $id $fresh)
			if (fresh!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1096:21: ^( $t $id $fresh)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_fresh.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1097:3: -> {count!=null}? ^( $t $id $count)
			if (count!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1097:21: ^( $t $id $count)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_count.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1098:3: -> {updated!=null}? ^( $t $id $updated)
			if (updated!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1098:23: ^( $t $id $updated)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_t.nextNode(), root_1);
				adaptor.addChild(root_1, stream_id.nextNode());
				adaptor.addChild(root_1, stream_updated.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1099:3: -> $id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:1: functionParameters :parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? ;
	public final BLESS3Parser.functionParameters_return functionParameters() throws RecognitionException {
		BLESS3Parser.functionParameters_return retval = new BLESS3Parser.functionParameters_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token COMMA189=null;
		Token COMMA190=null;
		List<Object> list_parameters=null;
		RuleReturnScope parameters = null;
		BAST COMMA189_tree=null;
		BAST COMMA190_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1102:19: (parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:3: parameters+= formalExpressionPair ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6706);
			parameters=formalExpressionPair();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

			if (list_parameters==null) list_parameters=new ArrayList<Object>();
			list_parameters.add(parameters.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:36: ( COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )* )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==COMMA) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1103:38: COMMA ^parameters+= formalExpressionPair ( COMMA !parameters+= formalExpressionPair )*
					{
					COMMA189=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6710); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA189_tree = (BAST)adaptor.create(COMMA189);
					root_0 = (BAST)adaptor.becomeRoot(COMMA189_tree, root_0);
					}

					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6715);
					parameters=formalExpressionPair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters.getTree());

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:3: ( COMMA !parameters+= formalExpressionPair )*
					loop91:
					while (true) {
						int alt91=2;
						int LA91_0 = input.LA(1);
						if ( (LA91_0==COMMA) ) {
							alt91=1;
						}

						switch (alt91) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1104:5: COMMA !parameters+= formalExpressionPair
							{
							COMMA190=(Token)match(input,COMMA,FOLLOW_COMMA_in_functionParameters6722); if (state.failed) return retval;
							pushFollow(FOLLOW_formalExpressionPair_in_functionParameters6727);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1107:1: formalExpressionPair : formal= ID COLON ^actual= expression ;
	public final BLESS3Parser.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		BLESS3Parser.formalExpressionPair_return retval = new BLESS3Parser.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token formal=null;
		Token COLON191=null;
		ParserRuleReturnScope actual =null;

		BAST formal_tree=null;
		BAST COLON191_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1107:21: (formal= ID COLON ^actual= expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1108:3: formal= ID COLON ^actual= expression
			{
			root_0 = (BAST)adaptor.nil();


			formal=(Token)match(input,ID,FOLLOW_ID_in_formalExpressionPair6745); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			formal_tree = (BAST)adaptor.create(formal);
			adaptor.addChild(root_0, formal_tree);
			}

			COLON191=(Token)match(input,COLON,FOLLOW_COLON_in_formalExpressionPair6753); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COLON191_tree = (BAST)adaptor.create(COLON191);
			root_0 = (BAST)adaptor.becomeRoot(COLON191_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_formalExpressionPair6758);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1112:1: partialName : record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id;
	public final BLESS3Parser.partialName_return partialName() throws RecognitionException {
		BLESS3Parser.partialName_return retval = new BLESS3Parser.partialName_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token record_id=null;
		Token lb=null;
		Token RBRACKET192=null;
		Token LBRACKET193=null;
		Token RBRACKET194=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		BAST record_id_tree=null;
		BAST lb_tree=null;
		BAST RBRACKET192_tree=null;
		BAST LBRACKET193_tree=null;
		BAST RBRACKET194_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_indexExpressionOrRange=new RewriteRuleSubtreeStream(adaptor,"rule indexExpressionOrRange");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1112:12: (record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )? -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) ) -> $record_id)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1113:2: record_id= ID (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			{
			record_id=(Token)match(input,ID,FOLLOW_ID_in_partialName6771); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(record_id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:3: (lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )* )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==LBRACKET) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1114:5: lb= LBRACKET array_index+= indexExpressionOrRange RBRACKET ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					{
					lb=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(lb);

					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6785);
					array_index=indexExpressionOrRange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTree());
					RBRACKET192=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName6787); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET192);

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:3: ( LBRACKET array_index+= indexExpressionOrRange RBRACKET )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==LBRACKET) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1115:5: LBRACKET array_index+= indexExpressionOrRange RBRACKET
							{
							LBRACKET193=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName6794); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET193);

							pushFollow(FOLLOW_indexExpressionOrRange_in_partialName6798);
							array_index=indexExpressionOrRange();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_indexExpressionOrRange.add(array_index.getTree());
							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTree());
							RBRACKET194=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_partialName6800); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET194);

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
			// 1116:2: -> {lb!=null}? ^( $record_id ^( $lb ( $array_index)+ ) )
			if (lb!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:17: ^( $record_id ^( $lb ( $array_index)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_record_id.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1116:31: ^( $lb ( $array_index)+ )
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

			else // 1117:2: -> $record_id
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1120:1: constant : ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null | nonNumericProperty );
	public final BLESS3Parser.constant_return constant() throws RecognitionException {
		BLESS3Parser.constant_return retval = new BLESS3Parser.constant_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token AADL_STRING_LITERAL196=null;
		Token LITERAL_true197=null;
		Token LITERAL_false198=null;
		Token LITERAL_null199=null;
		ParserRuleReturnScope quantity195 =null;
		ParserRuleReturnScope nonNumericProperty200 =null;

		BAST AADL_STRING_LITERAL196_tree=null;
		BAST LITERAL_true197_tree=null;
		BAST LITERAL_false198_tree=null;
		BAST LITERAL_null199_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1120:9: ( quantity | AADL_STRING_LITERAL | LITERAL_true | LITERAL_false | LITERAL_null | nonNumericProperty )
			int alt95=6;
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
			case LBRACKET:
				{
				alt95=6;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1121:3: quantity
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_constant6848);
					quantity195=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity195.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1123:3: AADL_STRING_LITERAL
					{
					root_0 = (BAST)adaptor.nil();


					AADL_STRING_LITERAL196=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant6856); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AADL_STRING_LITERAL196_tree = (BAST)adaptor.create(AADL_STRING_LITERAL196);
					adaptor.addChild(root_0, AADL_STRING_LITERAL196_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1125:3: LITERAL_true
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_true197=(Token)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant6864); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_true197_tree = (BAST)adaptor.create(LITERAL_true197);
					adaptor.addChild(root_0, LITERAL_true197_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1127:3: LITERAL_false
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_false198=(Token)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant6872); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_false198_tree = (BAST)adaptor.create(LITERAL_false198);
					adaptor.addChild(root_0, LITERAL_false198_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1129:3: LITERAL_null
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_null199=(Token)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant6880); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_null199_tree = (BAST)adaptor.create(LITERAL_null199);
					adaptor.addChild(root_0, LITERAL_null199_tree);
					}

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1131:3: nonNumericProperty
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_nonNumericProperty_in_constant6888);
					nonNumericProperty200=nonNumericProperty();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nonNumericProperty200.getTree());

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


	public static class nonNumericProperty_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "nonNumericProperty"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:1: nonNumericProperty : LBRACKET ^npv= propertyValue RCON ty= type ;
	public final BLESS3Parser.nonNumericProperty_return nonNumericProperty() throws RecognitionException {
		BLESS3Parser.nonNumericProperty_return retval = new BLESS3Parser.nonNumericProperty_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LBRACKET201=null;
		Token RCON202=null;
		ParserRuleReturnScope npv =null;
		ParserRuleReturnScope ty =null;

		BAST LBRACKET201_tree=null;
		BAST RCON202_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1134:19: ( LBRACKET ^npv= propertyValue RCON ty= type )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1135:3: LBRACKET ^npv= propertyValue RCON ty= type
			{
			root_0 = (BAST)adaptor.nil();


			LBRACKET201=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_nonNumericProperty6900); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACKET201_tree = (BAST)adaptor.create(LBRACKET201);
			root_0 = (BAST)adaptor.becomeRoot(LBRACKET201_tree, root_0);
			}

			pushFollow(FOLLOW_propertyValue_in_nonNumericProperty6905);
			npv=propertyValue();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, npv.getTree());

			RCON202=(Token)match(input,RCON,FOLLOW_RCON_in_nonNumericProperty6907); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RCON202_tree = (BAST)adaptor.create(RCON202);
			adaptor.addChild(root_0, RCON202_tree);
			}

			pushFollow(FOLLOW_type_in_nonNumericProperty6911);
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
	// $ANTLR end "nonNumericProperty"


	public static class quantity_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "quantity"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1138:1: quantity : (num= aNumber u= ID -> ^( QUANTITY[$u,\"QUANTITY\"] $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY[$scalar,\"QUANTITY\"] $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY[$whole,\"QUANTITY\"] $num $whole) |num= aNumber -> ^( QUANTITY[\"QUANTITY\"] $num) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1138:9: (num= aNumber u= ID -> ^( QUANTITY[$u,\"QUANTITY\"] $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY[$scalar,\"QUANTITY\"] $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY[$whole,\"QUANTITY\"] $num $whole) |num= aNumber -> ^( QUANTITY[\"QUANTITY\"] $num) )
			int alt96=4;
			alt96 = dfa96.predict(input);
			switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1139:3: num= aNumber u= ID
					{
					pushFollow(FOLLOW_aNumber_in_quantity6927);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					u=(Token)match(input,ID,FOLLOW_ID_in_quantity6931); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(u);

					// AST REWRITE
					// elements: u, num
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
					// 1140:4: -> ^( QUANTITY[$u,\"QUANTITY\"] $num $u)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1140:7: ^( QUANTITY[$u,\"QUANTITY\"] $num $u)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, u, "QUANTITY"), root_1);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1142:3: num= aNumber scalar= LITERAL_scalar
					{
					pushFollow(FOLLOW_aNumber_in_quantity6961);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					scalar=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity6965); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_scalar.add(scalar);

					// AST REWRITE
					// elements: scalar, num
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
					// 1143:4: -> ^( QUANTITY[$scalar,\"QUANTITY\"] $num $scalar)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1143:7: ^( QUANTITY[$scalar,\"QUANTITY\"] $num $scalar)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, scalar, "QUANTITY"), root_1);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1145:3: num= aNumber whole= LITERAL_whole
					{
					pushFollow(FOLLOW_aNumber_in_quantity6996);
					num=aNumber();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aNumber.add(num.getTree());
					whole=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7000); if (state.failed) return retval; 
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
					// 1146:4: -> ^( QUANTITY[$whole,\"QUANTITY\"] $num $whole)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1146:7: ^( QUANTITY[$whole,\"QUANTITY\"] $num $whole)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(QUANTITY, whole, "QUANTITY"), root_1);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1148:3: num= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_quantity7029);
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
					// 1149:4: -> ^( QUANTITY[\"QUANTITY\"] $num)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1149:7: ^( QUANTITY[\"QUANTITY\"] $num)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1152:1: aNumber : (lit= NUMBER |pv= propertyValue );
	public final BLESS3Parser.aNumber_return aNumber() throws RecognitionException {
		BLESS3Parser.aNumber_return retval = new BLESS3Parser.aNumber_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token lit=null;
		ParserRuleReturnScope pv =null;

		BAST lit_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1152:8: (lit= NUMBER |pv= propertyValue )
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==NUMBER) ) {
				alt97=1;
			}
			else if ( (LA97_0==ID||LA97_0==LITERAL_self||LA97_0==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1153:2: lit= NUMBER
					{
					root_0 = (BAST)adaptor.nil();


					lit=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7060); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					lit_tree = (BAST)adaptor.create(lit);
					adaptor.addChild(root_0, lit_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1154:4: pv= propertyValue
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyValue_in_aNumber7067);
					pv=propertyValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pv.getTree());

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


	public static class propertyValue_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1157:1: propertyValue : (property= propertyReference |propertyConstant= propertyName );
	public final BLESS3Parser.propertyValue_return propertyValue() throws RecognitionException {
		BLESS3Parser.propertyValue_return retval = new BLESS3Parser.propertyValue_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope property =null;
		ParserRuleReturnScope propertyConstant =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1157:14: (property= propertyReference |propertyConstant= propertyName )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LITERAL_self||LA98_0==OCTOTHORPE) ) {
				alt98=1;
			}
			else if ( (LA98_0==ID) ) {
				int LA98_2 = input.LA(2);
				if ( (LA98_2==DOUBLE_COLON) ) {
					int LA98_3 = input.LA(3);
					if ( (LA98_3==ID) ) {
						int LA98_4 = input.LA(4);
						if ( (LA98_4==EOF||(LA98_4 >= AL && LA98_4 <= AMPERSAND)||(LA98_4 >= ASSIGN && LA98_4 <= AT_SIGN)||(LA98_4 >= BOX && LA98_4 <= COLON)||(LA98_4 >= COMMA && LA98_4 <= COMMADOT)||LA98_4==CVP||LA98_4==DIVIDE||(LA98_4 >= DOTCOMMA && LA98_4 <= DOTDOT)||LA98_4==EQ||LA98_4==EXP||(LA98_4 >= GT && LA98_4 <= GUARD)||(LA98_4 >= ID && LA98_4 <= IMP)||LA98_4==LASS||LA98_4==LCURLY||LA98_4==LITERAL_and||LA98_4==LITERAL_are||(LA98_4 >= LITERAL_computation && LA98_4 <= LITERAL_constant)||(LA98_4 >= LITERAL_declare && LA98_4 <= LITERAL_def)||(LA98_4 >= LITERAL_div && LA98_4 <= LITERAL_else)||LA98_4==LITERAL_exception||(LA98_4 >= LITERAL_fetchadd && LA98_4 <= LITERAL_forall)||(LA98_4 >= LITERAL_if && LA98_4 <= LITERAL_in)||LA98_4==LITERAL_invariant||(LA98_4 >= LITERAL_mod && LA98_4 <= LITERAL_nonvolatile)||LA98_4==LITERAL_of||LA98_4==LITERAL_or||(LA98_4 >= LITERAL_rem && LA98_4 <= LITERAL_returns)||LA98_4==LITERAL_scalar||(LA98_4 >= LITERAL_setmode && LA98_4 <= LITERAL_spread)||LA98_4==LITERAL_states||(LA98_4 >= LITERAL_swap && LA98_4 <= LITERAL_then)||LA98_4==LITERAL_transitions||LA98_4==LITERAL_type||LA98_4==LITERAL_until||(LA98_4 >= LITERAL_when && LA98_4 <= LITERAL_whole)||LA98_4==LITERAL_xor||LA98_4==LT||LA98_4==MINUS||LA98_4==NEQ||LA98_4==OLD_NEQ||LA98_4==PLUS||LA98_4==PLUS_EQUALS||LA98_4==QQ||(LA98_4 >= RASS && LA98_4 <= RCURLY)||LA98_4==RPAREN||LA98_4==SEMICOLON||LA98_4==TIMES||LA98_4==VERT) ) {
							alt98=2;
						}
						else if ( (LA98_4==DOUBLE_COLON) ) {
							alt98=1;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 98, 4, input);
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
								new NoViableAltException("", 98, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA98_2==DOT||LA98_2==OCTOTHORPE) ) {
					alt98=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 98, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1158:3: property= propertyReference
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyReference_in_propertyValue7081);
					property=propertyReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, property.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1159:4: propertyConstant= propertyName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_propertyName_in_propertyValue7088);
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
	// $ANTLR end "propertyValue"


	public static class propertyReference_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "propertyReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1162:1: propertyReference : ( OCTOTHORPE ^pname= propertyName (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= propertyName (field+= propertyField )* |component= componentName OCTOTHORPE ^cpname= propertyName (field+= propertyField )* );
	public final BLESS3Parser.propertyReference_return propertyReference() throws RecognitionException {
		BLESS3Parser.propertyReference_return retval = new BLESS3Parser.propertyReference_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token OCTOTHORPE203=null;
		Token LITERAL_self204=null;
		Token OCTOTHORPE205=null;
		Token OCTOTHORPE206=null;
		List<Object> list_field=null;
		ParserRuleReturnScope pname =null;
		ParserRuleReturnScope spname =null;
		ParserRuleReturnScope component =null;
		ParserRuleReturnScope cpname =null;
		RuleReturnScope field = null;
		BAST OCTOTHORPE203_tree=null;
		BAST LITERAL_self204_tree=null;
		BAST OCTOTHORPE205_tree=null;
		BAST OCTOTHORPE206_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1162:18: ( OCTOTHORPE ^pname= propertyName (field+= propertyField )* | LITERAL_self OCTOTHORPE ^spname= propertyName (field+= propertyField )* |component= componentName OCTOTHORPE ^cpname= propertyName (field+= propertyField )* )
			int alt102=3;
			switch ( input.LA(1) ) {
			case OCTOTHORPE:
				{
				alt102=1;
				}
				break;
			case LITERAL_self:
				{
				alt102=2;
				}
				break;
			case ID:
				{
				alt102=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1163:2: OCTOTHORPE ^pname= propertyName (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					OCTOTHORPE203=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7100); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE203_tree = (BAST)adaptor.create(OCTOTHORPE203);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE203_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_propertyReference7105);
					pname=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pname.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1164:4: (field+= propertyField )*
					loop99:
					while (true) {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==DOT||LA99_0==LBRACKET) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1164:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7116);
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
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1166:4: LITERAL_self OCTOTHORPE ^spname= propertyName (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_self204=(Token)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7126); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_self204_tree = (BAST)adaptor.create(LITERAL_self204);
					adaptor.addChild(root_0, LITERAL_self204_tree);
					}

					OCTOTHORPE205=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7128); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE205_tree = (BAST)adaptor.create(OCTOTHORPE205);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE205_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_propertyReference7133);
					spname=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, spname.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:4: (field+= propertyField )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==DOT||LA100_0==LBRACKET) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1167:6: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7144);
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
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1168:4: component= componentName OCTOTHORPE ^cpname= propertyName (field+= propertyField )*
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_componentName_in_propertyReference7154);
					component=componentName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, component.getTree());

					OCTOTHORPE206=(Token)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7160); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OCTOTHORPE206_tree = (BAST)adaptor.create(OCTOTHORPE206);
					root_0 = (BAST)adaptor.becomeRoot(OCTOTHORPE206_tree, root_0);
					}

					pushFollow(FOLLOW_propertyName_in_propertyReference7165);
					cpname=propertyName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cpname.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1170:5: (field+= propertyField )*
					loop101:
					while (true) {
						int alt101=2;
						int LA101_0 = input.LA(1);
						if ( (LA101_0==DOT||LA101_0==LBRACKET) ) {
							alt101=1;
						}

						switch (alt101) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1170:7: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7177);
							field=propertyField();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, field.getTree());

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTree());
							}
							break;

						default :
							break loop101;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:1: propertyField : ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) );
	public final BLESS3Parser.propertyField_return propertyField() throws RecognitionException {
		BLESS3Parser.propertyField_return retval = new BLESS3Parser.propertyField_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token index=null;
		Token var=null;
		Token pf=null;
		Token upper=null;
		Token lower=null;
		Token LBRACKET207=null;
		Token RBRACKET208=null;
		Token DOT209=null;

		BAST index_tree=null;
		BAST var_tree=null;
		BAST pf_tree=null;
		BAST upper_tree=null;
		BAST lower_tree=null;
		BAST LBRACKET207_tree=null;
		BAST RBRACKET208_tree=null;
		BAST DOT209_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1174:14: ( LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !| DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound ) )
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LBRACKET) ) {
				alt105=1;
			}
			else if ( (LA105_0==DOT) ) {
				alt105=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:2: LBRACKET ^ (index= NUMBER |var= ID ) RBRACKET !
					{
					root_0 = (BAST)adaptor.nil();


					LBRACKET207=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7192); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LBRACKET207_tree = (BAST)adaptor.create(LBRACKET207);
					root_0 = (BAST)adaptor.becomeRoot(LBRACKET207_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:12: (index= NUMBER |var= ID )
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==NUMBER) ) {
						alt103=1;
					}
					else if ( (LA103_0==ID) ) {
						alt103=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 103, 0, input);
						throw nvae;
					}

					switch (alt103) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:13: index= NUMBER
							{
							index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7198); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							index_tree = (BAST)adaptor.create(index);
							adaptor.addChild(root_0, index_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1175:28: var= ID
							{
							var=(Token)match(input,ID,FOLLOW_ID_in_propertyField7204); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							var_tree = (BAST)adaptor.create(var);
							adaptor.addChild(root_0, var_tree);
							}

							}
							break;

					}

					RBRACKET208=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_propertyField7213); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:4: DOT ^ (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					{
					root_0 = (BAST)adaptor.nil();


					DOT209=(Token)match(input,DOT,FOLLOW_DOT_in_propertyField7221); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT209_tree = (BAST)adaptor.create(DOT209);
					root_0 = (BAST)adaptor.becomeRoot(DOT209_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:10: (pf= ID |upper= LITERAL_upper_bound |lower= LITERAL_lower_bound )
					int alt104=3;
					switch ( input.LA(1) ) {
					case ID:
						{
						alt104=1;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt104=2;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt104=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 104, 0, input);
						throw nvae;
					}
					switch (alt104) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:11: pf= ID
							{
							pf=(Token)match(input,ID,FOLLOW_ID_in_propertyField7228); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							pf_tree = (BAST)adaptor.create(pf);
							adaptor.addChild(root_0, pf_tree);
							}

							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:19: upper= LITERAL_upper_bound
							{
							upper=(Token)match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7234); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							upper_tree = (BAST)adaptor.create(upper);
							adaptor.addChild(root_0, upper_tree);
							}

							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1177:47: lower= LITERAL_lower_bound
							{
							lower=(Token)match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7240); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:1: actionSubclause : (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE[\"ACTION_SUBCLAUSE\"] ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre[\"pre\"] ( $precondition)? ) ^( LITERAL_post[\"post\"] ( $postcondition)? ) ^( LITERAL_invariant[\"invariant\"] ( $invariant)? ) $elq) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1182:16: ( (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification -> ^( ACTION_SUBCLAUSE[\"ACTION_SUBCLAUSE\"] ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre[\"pre\"] ( $precondition)? ) ^( LITERAL_post[\"post\"] ( $postcondition)? ) ^( LITERAL_invariant[\"invariant\"] ( $invariant)? ) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:2: (no_proof= DO_NOT_PROVE )? (throws_clause= throwsClause )? (assert_clause= assertClause )? (pre= LITERAL_pre precondition= assertion )? (post= LITERAL_post postcondition= assertion )? (inv= LITERAL_invariant invariant= assertion )? elq= existentialLatticeQuantification
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:11: (no_proof= DO_NOT_PROVE )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==DO_NOT_PROVE) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1183:11: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause7260); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1184:16: (throws_clause= throwsClause )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==LITERAL_throws) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1184:16: throws_clause= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause7267);
					throws_clause=throwsClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_throwsClause.add(throws_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:16: (assert_clause= assertClause )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==LITERAL_assert) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1185:16: assert_clause= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause7275);
					assert_clause=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(assert_clause.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:3: (pre= LITERAL_pre precondition= assertion )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==LITERAL_pre) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1186:5: pre= LITERAL_pre precondition= assertion
					{
					pre=(Token)match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause7286); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_pre.add(pre);

					pushFollow(FOLLOW_assertion_in_actionSubclause7290);
					precondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(precondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:3: (post= LITERAL_post postcondition= assertion )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==LITERAL_post) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1187:5: post= LITERAL_post postcondition= assertion
					{
					post=(Token)match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause7301); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_post.add(post);

					pushFollow(FOLLOW_assertion_in_actionSubclause7305);
					postcondition=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(postcondition.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1188:3: (inv= LITERAL_invariant invariant= assertion )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==LITERAL_invariant) ) {
				alt111=1;
			}
			switch (alt111) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1188:5: inv= LITERAL_invariant invariant= assertion
					{
					inv=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause7317); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(inv);

					pushFollow(FOLLOW_assertion_in_actionSubclause7321);
					invariant=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(invariant.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause7331);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: throws_clause, LITERAL_post, invariant, assert_clause, elq, precondition, LITERAL_invariant, no_proof, LITERAL_pre, postcondition
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
			// 1190:3: -> ^( ACTION_SUBCLAUSE[\"ACTION_SUBCLAUSE\"] ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre[\"pre\"] ( $precondition)? ) ^( LITERAL_post[\"post\"] ( $postcondition)? ) ^( LITERAL_invariant[\"invariant\"] ( $invariant)? ) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:6: ^( ACTION_SUBCLAUSE[\"ACTION_SUBCLAUSE\"] ( $no_proof)? ( $throws_clause)? ( $assert_clause)? ^( LITERAL_pre[\"pre\"] ( $precondition)? ) ^( LITERAL_post[\"post\"] ( $postcondition)? ) ^( LITERAL_invariant[\"invariant\"] ( $invariant)? ) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION_SUBCLAUSE, "ACTION_SUBCLAUSE"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:47: ( $no_proof)?
				if ( stream_no_proof.hasNext() ) {
					adaptor.addChild(root_1, stream_no_proof.nextNode());
				}
				stream_no_proof.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:58: ( $throws_clause)?
				if ( stream_throws_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_throws_clause.nextTree());
				}
				stream_throws_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:74: ( $assert_clause)?
				if ( stream_assert_clause.hasNext() ) {
					adaptor.addChild(root_1, stream_assert_clause.nextTree());
				}
				stream_assert_clause.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:89: ^( LITERAL_pre[\"pre\"] ( $precondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_pre, "pre"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1190:112: ( $precondition)?
				if ( stream_precondition.hasNext() ) {
					adaptor.addChild(root_2, stream_precondition.nextTree());
				}
				stream_precondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:6: ^( LITERAL_post[\"post\"] ( $postcondition)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_post, "post"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:31: ( $postcondition)?
				if ( stream_postcondition.hasNext() ) {
					adaptor.addChild(root_2, stream_postcondition.nextTree());
				}
				stream_postcondition.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:48: ^( LITERAL_invariant[\"invariant\"] ( $invariant)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_invariant, "invariant"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1191:83: ( $invariant)?
				if ( stream_invariant.hasNext() ) {
					adaptor.addChild(root_2, stream_invariant.nextTree());
				}
				stream_invariant.reset();

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1194:1: throwsClause : LITERAL_throws ^ (exceptions+= ID )+ ;
	public final BLESS3Parser.throwsClause_return throwsClause() throws RecognitionException {
		BLESS3Parser.throwsClause_return retval = new BLESS3Parser.throwsClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_throws210=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;

		BAST LITERAL_throws210_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1194:13: ( LITERAL_throws ^ (exceptions+= ID )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1195:2: LITERAL_throws ^ (exceptions+= ID )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_throws210=(Token)match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause7404); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throws210_tree = (BAST)adaptor.create(LITERAL_throws210);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_throws210_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1195:28: (exceptions+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1195:28: exceptions+= ID
					{
					exceptions=(Token)match(input,ID,FOLLOW_ID_in_throwsClause7409); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					exceptions_tree = (BAST)adaptor.create(exceptions);
					adaptor.addChild(root_0, exceptions_tree);
					}

					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
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
	// $ANTLR end "throwsClause"


	public static class assertClause_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "assertClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:1: assertClause : LITERAL_assert ^ ( namedAssertion )+ ;
	public final BLESS3Parser.assertClause_return assertClause() throws RecognitionException {
		BLESS3Parser.assertClause_return retval = new BLESS3Parser.assertClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_assert211=null;
		ParserRuleReturnScope namedAssertion212 =null;

		BAST LITERAL_assert211_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1198:13: ( LITERAL_assert ^ ( namedAssertion )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:3: LITERAL_assert ^ ( namedAssertion )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_assert211=(Token)match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause7424); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_assert211_tree = (BAST)adaptor.create(LITERAL_assert211);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_assert211_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:19: ( namedAssertion )+
			int cnt113=0;
			loop113:
			while (true) {
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==LASS) ) {
					alt113=1;
				}

				switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1199:19: namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause7427);
					namedAssertion212=namedAssertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, namedAssertion212.getTree());

					}
					break;

				default :
					if ( cnt113 >= 1 ) break loop113;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(113, input);
					throw eee;
				}
				cnt113++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:1: behaviorTime : (q= quantity -> ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $q) |v= valueName u= ID -> ^( BEHAVIOR_TIME[$u,\"BEHAVIOR_TIME\"] $v $u) |v= valueName s= LITERAL_scalar -> ^( BEHAVIOR_TIME[$s,\"BEHAVIOR_TIME\"] $v $s) |v= valueName w= LITERAL_whole -> ^( BEHAVIOR_TIME[$w,\"BEHAVIOR_TIME\"] $v $w) |v= valueName -> ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $v) );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1207:13: (q= quantity -> ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $q) |v= valueName u= ID -> ^( BEHAVIOR_TIME[$u,\"BEHAVIOR_TIME\"] $v $u) |v= valueName s= LITERAL_scalar -> ^( BEHAVIOR_TIME[$s,\"BEHAVIOR_TIME\"] $v $s) |v= valueName w= LITERAL_whole -> ^( BEHAVIOR_TIME[$w,\"BEHAVIOR_TIME\"] $v $w) |v= valueName -> ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $v) )
			int alt114=5;
			int LA114_0 = input.LA(1);
			if ( (LA114_0==LITERAL_self||LA114_0==NUMBER||LA114_0==OCTOTHORPE) ) {
				alt114=1;
			}
			else if ( (LA114_0==ID) ) {
				int LA114_4 = input.LA(2);
				if ( (synpred180_BLESS3()) ) {
					alt114=1;
				}
				else if ( (synpred181_BLESS3()) ) {
					alt114=2;
				}
				else if ( (synpred182_BLESS3()) ) {
					alt114=3;
				}
				else if ( (synpred183_BLESS3()) ) {
					alt114=4;
				}
				else if ( (true) ) {
					alt114=5;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 114, 0, input);
				throw nvae;
			}

			switch (alt114) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_behaviorTime7449);
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
					// 1209:3: -> ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $q)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1209:6: ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $q)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1210:5: v= valueName u= ID
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7471);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					u=(Token)match(input,ID,FOLLOW_ID_in_behaviorTime7475); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(u);

					// AST REWRITE
					// elements: v, u
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
					// 1211:3: -> ^( BEHAVIOR_TIME[$u,\"BEHAVIOR_TIME\"] $v $u)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1211:6: ^( BEHAVIOR_TIME[$u,\"BEHAVIOR_TIME\"] $v $u)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, u, "BEHAVIOR_TIME"), root_1);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:5: v= valueName s= LITERAL_scalar
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7500);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					s=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_behaviorTime7504); if (state.failed) return retval; 
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
					// 1213:3: -> ^( BEHAVIOR_TIME[$s,\"BEHAVIOR_TIME\"] $v $s)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1213:6: ^( BEHAVIOR_TIME[$s,\"BEHAVIOR_TIME\"] $v $s)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, s, "BEHAVIOR_TIME"), root_1);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1214:5: v= valueName w= LITERAL_whole
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7530);
					v=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(v.getTree());
					w=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_behaviorTime7534); if (state.failed) return retval; 
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
					// 1215:3: -> ^( BEHAVIOR_TIME[$w,\"BEHAVIOR_TIME\"] $v $w)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1215:6: ^( BEHAVIOR_TIME[$w,\"BEHAVIOR_TIME\"] $v $w)
						{
						BAST root_1 = (BAST)adaptor.nil();
						root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BEHAVIOR_TIME, w, "BEHAVIOR_TIME"), root_1);
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1216:5: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_behaviorTime7559);
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
					// 1217:3: -> ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $v)
					{
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1217:6: ^( BEHAVIOR_TIME[\"BEHAVIOR_TIME\"] $v)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:1: catchClause : LITERAL_catch ^ ( catchClauseTerm )+ ;
	public final BLESS3Parser.catchClause_return catchClause() throws RecognitionException {
		BLESS3Parser.catchClause_return retval = new BLESS3Parser.catchClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_catch213=null;
		ParserRuleReturnScope catchClauseTerm214 =null;

		BAST LITERAL_catch213_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1222:12: ( LITERAL_catch ^ ( catchClauseTerm )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:2: LITERAL_catch ^ ( catchClauseTerm )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_catch213=(Token)match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause7588); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_catch213_tree = (BAST)adaptor.create(LITERAL_catch213);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_catch213_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:17: ( catchClauseTerm )+
			int cnt115=0;
			loop115:
			while (true) {
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==LPAREN) ) {
					alt115=1;
				}

				switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1223:17: catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause7591);
					catchClauseTerm214=catchClauseTerm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, catchClauseTerm214.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1226:1: catchClauseTerm : LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN ;
	public final BLESS3Parser.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		BLESS3Parser.catchClauseTerm_return retval = new BLESS3Parser.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token colon=null;
		Token LPAREN215=null;
		Token LITERAL_all216=null;
		Token RPAREN217=null;
		Token exceptions=null;
		List<Object> list_exceptions=null;
		ParserRuleReturnScope act =null;

		BAST colon_tree=null;
		BAST LPAREN215_tree=null;
		BAST LITERAL_all216_tree=null;
		BAST RPAREN217_tree=null;
		BAST exceptions_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1226:16: ( LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1227:3: LPAREN ^ ( (exceptions+= ID )+ | LITERAL_all ) colon= COLON act= basicAction RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN215=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm7604); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN215_tree = (BAST)adaptor.create(LPAREN215);
			root_0 = (BAST)adaptor.becomeRoot(LPAREN215_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:3: ( (exceptions+= ID )+ | LITERAL_all )
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==ID) ) {
				alt117=1;
			}
			else if ( (LA117_0==LITERAL_all) ) {
				alt117=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}

			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:5: (exceptions+= ID )+
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:15: (exceptions+= ID )+
					int cnt116=0;
					loop116:
					while (true) {
						int alt116=2;
						int LA116_0 = input.LA(1);
						if ( (LA116_0==ID) ) {
							alt116=1;
						}

						switch (alt116) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:15: exceptions+= ID
							{
							exceptions=(Token)match(input,ID,FOLLOW_ID_in_catchClauseTerm7613); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							exceptions_tree = (BAST)adaptor.create(exceptions);
							adaptor.addChild(root_0, exceptions_tree);
							}

							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt116 >= 1 ) break loop116;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(116, input);
							throw eee;
						}
						cnt116++;
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1228:23: LITERAL_all
					{
					LITERAL_all216=(Token)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm7618); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_all216_tree = (BAST)adaptor.create(LITERAL_all216);
					adaptor.addChild(root_0, LITERAL_all216_tree);
					}

					}
					break;

			}

			colon=(Token)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm7624); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			colon_tree = (BAST)adaptor.create(colon);
			adaptor.addChild(root_0, colon_tree);
			}

			pushFollow(FOLLOW_basicAction_in_catchClauseTerm7628);
			act=basicAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, act.getTree());

			RPAREN217=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm7630); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN217_tree = (BAST)adaptor.create(RPAREN217);
			adaptor.addChild(root_0, RPAREN217_tree);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:1: quantifiedVariables : LITERAL_declare ^ ( variableDeclaration )+ ;
	public final BLESS3Parser.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		BLESS3Parser.quantifiedVariables_return retval = new BLESS3Parser.quantifiedVariables_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_declare218=null;
		ParserRuleReturnScope variableDeclaration219 =null;

		BAST LITERAL_declare218_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1231:20: ( LITERAL_declare ^ ( variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:3: LITERAL_declare ^ ( variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_declare218=(Token)match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables7642); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_declare218_tree = (BAST)adaptor.create(LITERAL_declare218);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_declare218_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:20: ( variableDeclaration )+
			int cnt118=0;
			loop118:
			while (true) {
				int alt118=2;
				int LA118_0 = input.LA(1);
				if ( (LA118_0==ID) ) {
					alt118=1;
				}

				switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1232:20: variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables7645);
					variableDeclaration219=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration219.getTree());

					}
					break;

				default :
					if ( cnt118 >= 1 ) break loop118;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(118, input);
					throw eee;
				}
				cnt118++;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:1: variableDeclaration : v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION[$assign,\"VARIABLE_DECLARATION\"] $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION[\"VARIABLE_DECLARATION\"] $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1235:20: (v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )? -> {assign!=null}? ^( VARIABLE_DECLARATION[$assign,\"VARIABLE_DECLARATION\"] $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) -> ^( VARIABLE_DECLARATION[\"VARIABLE_DECLARATION\"] $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1236:3: v= variable (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )? (assign= ASSIGN exp= expression )? (a= assertion )? (semi= SEMICOLON )?
			{
			pushFollow(FOLLOW_variable_in_variableDeclaration7659);
			v=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(v.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1237:2: (nv= LITERAL_nonvolatile |sh= LITERAL_shared |c= LITERAL_constant |sp= LITERAL_spread |f= LITERAL_final )?
			int alt119=6;
			switch ( input.LA(1) ) {
				case LITERAL_nonvolatile:
					{
					alt119=1;
					}
					break;
				case LITERAL_shared:
					{
					alt119=2;
					}
					break;
				case LITERAL_constant:
					{
					alt119=3;
					}
					break;
				case LITERAL_spread:
					{
					alt119=4;
					}
					break;
				case LITERAL_final:
					{
					alt119=5;
					}
					break;
			}
			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1238:4: nv= LITERAL_nonvolatile
					{
					nv=(Token)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_nonvolatile.add(nv);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1239:6: sh= LITERAL_shared
					{
					sh=(Token)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration7680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_shared.add(sh);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1240:6: c= LITERAL_constant
					{
					c=(Token)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration7690); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_constant.add(c);

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1241:7: sp= LITERAL_spread
					{
					sp=(Token)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration7700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_spread.add(sp);

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1242:7: f= LITERAL_final
					{
					f=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration7710); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(f);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1244:3: (assign= ASSIGN exp= expression )?
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==ASSIGN) ) {
				alt120=1;
			}
			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1244:5: assign= ASSIGN exp= expression
					{
					assign=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration7724); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ASSIGN.add(assign);

					pushFollow(FOLLOW_expression_in_variableDeclaration7728);
					exp=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(exp.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:4: (a= assertion )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==LASS) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1245:4: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration7738);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:7: (semi= SEMICOLON )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==SEMICOLON) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1246:7: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration7747); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: c, assign, sp, sh, f, exp, nv, a, v, nv, f, a, c, sp, sh, v
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
			// 1247:5: -> {assign!=null}? ^( VARIABLE_DECLARATION[$assign,\"VARIABLE_DECLARATION\"] $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			if (assign!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:24: ^( VARIABLE_DECLARATION[$assign,\"VARIABLE_DECLARATION\"] $v ^( $assign $exp) ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, assign, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:83: ^( $assign $exp)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_assign.nextNode(), root_2);
				adaptor.addChild(root_2, stream_exp.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:102: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:106: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:111: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:116: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:120: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1247:125: ( $f)?
				if ( stream_f.hasNext() ) {
					adaptor.addChild(root_1, stream_f.nextNode());
				}
				stream_f.reset();

				adaptor.addChild(root_0, root_1);
				}

			}

			else // 1248:5: -> ^( VARIABLE_DECLARATION[\"VARIABLE_DECLARATION\"] $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:8: ^( VARIABLE_DECLARATION[\"VARIABLE_DECLARATION\"] $v ( $a)? ( $nv)? ( $sh)? ( $c)? ( $sp)? ( $f)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, stream_v.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:60: ( $a)?
				if ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:64: ( $nv)?
				if ( stream_nv.hasNext() ) {
					adaptor.addChild(root_1, stream_nv.nextNode());
				}
				stream_nv.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:69: ( $sh)?
				if ( stream_sh.hasNext() ) {
					adaptor.addChild(root_1, stream_sh.nextNode());
				}
				stream_sh.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:74: ( $c)?
				if ( stream_c.hasNext() ) {
					adaptor.addChild(root_1, stream_c.nextNode());
				}
				stream_c.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:78: ( $sp)?
				if ( stream_sp.hasNext() ) {
					adaptor.addChild(root_1, stream_sp.nextNode());
				}
				stream_sp.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1248:83: ( $f)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1252:1: behaviorActions :a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? ;
	public final BLESS3Parser.behaviorActions_return behaviorActions() throws RecognitionException {
		BLESS3Parser.behaviorActions_return retval = new BLESS3Parser.behaviorActions_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token SEMICOLON220=null;
		Token SEMICOLON221=null;
		Token AMPERSAND222=null;
		Token AMPERSAND223=null;
		List<Object> list_a=null;
		RuleReturnScope a = null;
		BAST SEMICOLON220_tree=null;
		BAST SEMICOLON221_tree=null;
		BAST AMPERSAND222_tree=null;
		BAST AMPERSAND223_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1252:16: (a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1253:3: a+= assertedAction ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_assertedAction_in_behaviorActions7856);
			a=assertedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

			if (list_a==null) list_a=new ArrayList<Object>();
			list_a.add(a.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1254:3: ( ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* ) | ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* ) )?
			int alt125=3;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==SEMICOLON) ) {
				alt125=1;
			}
			else if ( (LA125_0==AMPERSAND) ) {
				alt125=2;
			}
			switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:4: ( SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:6: SEMICOLON ^a+= assertedAction ( SEMICOLON !a+= assertedAction )*
					{
					SEMICOLON220=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7869); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON220_tree = (BAST)adaptor.create(SEMICOLON220);
					root_0 = (BAST)adaptor.becomeRoot(SEMICOLON220_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7874);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:35: ( SEMICOLON !a+= assertedAction )*
					loop123:
					while (true) {
						int alt123=2;
						int LA123_0 = input.LA(1);
						if ( (LA123_0==SEMICOLON) ) {
							alt123=1;
						}

						switch (alt123) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1255:37: SEMICOLON !a+= assertedAction
							{
							SEMICOLON221=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions7878); if (state.failed) return retval;
							pushFollow(FOLLOW_assertedAction_in_behaviorActions7883);
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
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					{
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:4: ( AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )* )
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:6: AMPERSAND ^a+= assertedAction ( AMPERSAND a+= assertedAction )*
					{
					AMPERSAND222=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7902); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AMPERSAND222_tree = (BAST)adaptor.create(AMPERSAND222);
					root_0 = (BAST)adaptor.becomeRoot(AMPERSAND222_tree, root_0);
					}

					pushFollow(FOLLOW_assertedAction_in_behaviorActions7907);
					a=assertedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:35: ( AMPERSAND a+= assertedAction )*
					loop124:
					while (true) {
						int alt124=2;
						int LA124_0 = input.LA(1);
						if ( (LA124_0==AMPERSAND) ) {
							alt124=1;
						}

						switch (alt124) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1257:37: AMPERSAND a+= assertedAction
							{
							AMPERSAND223=(Token)match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions7911); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AMPERSAND223_tree = (BAST)adaptor.create(AMPERSAND223);
							adaptor.addChild(root_0, AMPERSAND223_tree);
							}

							pushFollow(FOLLOW_assertedAction_in_behaviorActions7915);
							a=assertedAction();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, a.getTree());

							if (list_a==null) list_a=new ArrayList<Object>();
							list_a.add(a.getTree());
							}
							break;

						default :
							break loop124;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1261:1: assertedAction : (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[$s.tree.getToken(),\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[$s.tree.getToken(),\"Q\"] ( $post)? ) ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1261:17: ( (pre= assertion )? s= action (post= assertion )? -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[$s.tree.getToken(),\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[$s.tree.getToken(),\"Q\"] ( $post)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:3: (pre= assertion )? s= action (post= assertion )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:6: (pre= assertion )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==LASS) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1262:6: pre= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7938);
					pre=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(pre.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_assertedAction7947);
			s=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(s.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1264:7: (post= assertion )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==LASS) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1264:7: post= assertion
					{
					pushFollow(FOLLOW_assertion_in_assertedAction7953);
					post=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(post.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: post, pre, s
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
			// 1265:5: -> ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[$s.tree.getToken(),\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[$s.tree.getToken(),\"Q\"] ( $post)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1266:5: ^( ACTION[$s.tree.getToken(),\"ACTION[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] ^( P[$s.tree.getToken(),\"P\"] ( $pre)? ) ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s) ^( Q[$s.tree.getToken(),\"Q\"] ( $post)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, (s!=null?((BAST)s.getTree()):null).getToken(), "ACTION["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:9: ^( P[$s.tree.getToken(),\"P\"] ( $pre)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(P, (s!=null?((BAST)s.getTree()):null).getToken(), "P"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1267:39: ( $pre)?
				if ( stream_pre.hasNext() ) {
					adaptor.addChild(root_2, stream_pre.nextTree());
				}
				stream_pre.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1268:9: ^( S[$s.tree.getToken(),\"S[\"+Integer.toString($s.tree.getLine()+startingLine)+\"]\"] $s)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(S, (s!=null?((BAST)s.getTree()):null).getToken(), "S["+Integer.toString((s!=null?((BAST)s.getTree()):null).getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_s.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1269:9: ^( Q[$s.tree.getToken(),\"Q\"] ( $post)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, (s!=null?((BAST)s.getTree()):null).getToken(), "Q"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1269:39: ( $post)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1275:1: action : ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification );
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
		ParserRuleReturnScope basicAction224 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1275:7: ( basicAction |if_fi= alternative |wl= whileLoop |fl= forLoop |du= doUntilLoop |elq= existentialLatticeQuantification |ulq= universalLatticeQuantification )
			int alt128=7;
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
				alt128=1;
				}
				break;
			case LITERAL_if:
				{
				alt128=2;
				}
				break;
			case LITERAL_while:
				{
				alt128=3;
				}
				break;
			case LITERAL_for:
				{
				alt128=4;
				}
				break;
			case LITERAL_do:
				{
				alt128=5;
				}
				break;
			case LCURLY:
			case LITERAL_declare:
				{
				alt128=6;
				}
				break;
			case LITERAL_forall:
				{
				alt128=7;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1276:3: basicAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_basicAction_in_action8069);
					basicAction224=basicAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, basicAction224.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1277:5: if_fi= alternative
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_alternative_in_action8077);
					if_fi=alternative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_fi.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1278:5: wl= whileLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whileLoop_in_action8085);
					wl=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, wl.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1279:5: fl= forLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_forLoop_in_action8093);
					fl=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fl.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1280:5: du= doUntilLoop
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_doUntilLoop_in_action8101);
					du=doUntilLoop();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, du.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1281:5: elq= existentialLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8109);
					elq=existentialLatticeQuantification();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, elq.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1282:5: ulq= universalLatticeQuantification
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_universalLatticeQuantification_in_action8118);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1285:1: basicAction : ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException );
	public final BLESS3Parser.basicAction_return basicAction() throws RecognitionException {
		BLESS3Parser.basicAction_return retval = new BLESS3Parser.basicAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token mode=null;
		Token LITERAL_skip225=null;
		Token LITERAL_setmode227=null;
		ParserRuleReturnScope assignment226 =null;
		ParserRuleReturnScope whenThrow228 =null;
		ParserRuleReturnScope combinableOperation229 =null;
		ParserRuleReturnScope communicationAction230 =null;
		ParserRuleReturnScope computation231 =null;
		ParserRuleReturnScope simultaneousAssignment232 =null;
		ParserRuleReturnScope issueException233 =null;

		BAST mode_tree=null;
		BAST LITERAL_skip225_tree=null;
		BAST LITERAL_setmode227_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1285:12: ( LITERAL_skip | assignment | ^( LITERAL_setmode mode= ID ) | whenThrow | combinableOperation | communicationAction | computation | simultaneousAssignment | issueException )
			int alt129=9;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt129=1;
				}
				break;
			case ID:
				{
				switch ( input.LA(2) ) {
				case EXCLAMATION:
				case LPAREN:
					{
					alt129=6;
					}
					break;
				case QUESTION:
					{
					int LA129_10 = input.LA(3);
					if ( (LA129_10==LPAREN) ) {
						alt129=6;
					}
					else if ( (LA129_10==ASSIGN) ) {
						alt129=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 129, 10, input);
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
					alt129=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 129, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LITERAL_setmode:
				{
				alt129=3;
				}
				break;
			case LITERAL_when:
				{
				alt129=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt129=5;
				}
				break;
			case LITERAL_computation:
				{
				alt129=7;
				}
				break;
			case VERT:
				{
				alt129=8;
				}
				break;
			case LITERAL_exception:
				{
				alt129=9;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1286:3: LITERAL_skip
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_skip225=(Token)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8133); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_skip225_tree = (BAST)adaptor.create(LITERAL_skip225);
					adaptor.addChild(root_0, LITERAL_skip225_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1287:5: assignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_basicAction8139);
					assignment226=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment226.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1288:5: ^( LITERAL_setmode mode= ID )
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_setmode227=(Token)match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8147); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_setmode227_tree = (BAST)adaptor.create(LITERAL_setmode227);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_setmode227_tree, root_0);
					}

					match(input, Token.DOWN, null); if (state.failed) return retval;
					mode=(Token)match(input,ID,FOLLOW_ID_in_basicAction8151); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					mode_tree = (BAST)adaptor.create(mode);
					adaptor.addChild(root_0, mode_tree);
					}

					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1289:5: whenThrow
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_whenThrow_in_basicAction8160);
					whenThrow228=whenThrow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThrow228.getTree());

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1290:5: combinableOperation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_combinableOperation_in_basicAction8166);
					combinableOperation229=combinableOperation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, combinableOperation229.getTree());

					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1291:5: communicationAction
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_communicationAction_in_basicAction8172);
					communicationAction230=communicationAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, communicationAction230.getTree());

					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1292:5: computation
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_computation_in_basicAction8179);
					computation231=computation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, computation231.getTree());

					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1293:5: simultaneousAssignment
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8185);
					simultaneousAssignment232=simultaneousAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simultaneousAssignment232.getTree());

					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1295:5: issueException
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_issueException_in_basicAction8192);
					issueException233=issueException();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, issueException233.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1298:1: assignment : valueName ASSIGN ^ expressionOrAny ;
	public final BLESS3Parser.assignment_return assignment() throws RecognitionException {
		BLESS3Parser.assignment_return retval = new BLESS3Parser.assignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token ASSIGN235=null;
		ParserRuleReturnScope valueName234 =null;
		ParserRuleReturnScope expressionOrAny236 =null;

		BAST ASSIGN235_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1298:11: ( valueName ASSIGN ^ expressionOrAny )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1299:3: valueName ASSIGN ^ expressionOrAny
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_valueName_in_assignment8204);
			valueName234=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName234.getTree());

			ASSIGN235=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment8206); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ASSIGN235_tree = (BAST)adaptor.create(ASSIGN235);
			root_0 = (BAST)adaptor.becomeRoot(ASSIGN235_tree, root_0);
			}

			pushFollow(FOLLOW_expressionOrAny_in_assignment8209);
			expressionOrAny236=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionOrAny236.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:1: simultaneousAssignment : VERT lhs+= valueName left_comma= COMMA lhs+= valueName ( COMMA lhs+= valueName )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) ;
	public final BLESS3Parser.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		BLESS3Parser.simultaneousAssignment_return retval = new BLESS3Parser.simultaneousAssignment_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token left_comma=null;
		Token a=null;
		Token right_comma=null;
		Token VERT237=null;
		Token COMMA238=null;
		Token COMMA239=null;
		Token VERT240=null;
		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		BAST left_comma_tree=null;
		BAST a_tree=null;
		BAST right_comma_tree=null;
		BAST VERT237_tree=null;
		BAST COMMA238_tree=null;
		BAST COMMA239_tree=null;
		BAST VERT240_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_VERT=new RewriteRuleTokenStream(adaptor,"token VERT");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_valueName=new RewriteRuleSubtreeStream(adaptor,"rule valueName");
		RewriteRuleSubtreeStream stream_expressionOrAny=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrAny");

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1302:24: ( VERT lhs+= valueName left_comma= COMMA lhs+= valueName ( COMMA lhs+= valueName )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1303:2: VERT lhs+= valueName left_comma= COMMA lhs+= valueName ( COMMA lhs+= valueName )* a= ASSIGN rhs+= expressionOrAny right_comma= COMMA rhs+= expressionOrAny ( COMMA rhs+= expressionOrAny )* VERT
			{
			VERT237=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8221); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT237);

			pushFollow(FOLLOW_valueName_in_simultaneousAssignment8227);
			lhs=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			left_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8231); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(left_comma);

			pushFollow(FOLLOW_valueName_in_simultaneousAssignment8235);
			lhs=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(lhs.getTree());
			if (list_lhs==null) list_lhs=new ArrayList<Object>();
			list_lhs.add(lhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1304:49: ( COMMA lhs+= valueName )*
			loop130:
			while (true) {
				int alt130=2;
				int LA130_0 = input.LA(1);
				if ( (LA130_0==COMMA) ) {
					alt130=1;
				}

				switch (alt130) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1304:51: COMMA lhs+= valueName
					{
					COMMA238=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8239); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA238);

					pushFollow(FOLLOW_valueName_in_simultaneousAssignment8243);
					lhs=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valueName.add(lhs.getTree());
					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTree());
					}
					break;

				default :
					break loop130;
				}
			}

			a=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment8251); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ASSIGN.add(a);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8257);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			right_comma=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8261); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COMMA.add(right_comma);

			pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8265);
			rhs=expressionOrAny();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
			if (list_rhs==null) list_rhs=new ArrayList<Object>();
			list_rhs.add(rhs.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1306:62: ( COMMA rhs+= expressionOrAny )*
			loop131:
			while (true) {
				int alt131=2;
				int LA131_0 = input.LA(1);
				if ( (LA131_0==COMMA) ) {
					alt131=1;
				}

				switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1306:64: COMMA rhs+= expressionOrAny
					{
					COMMA239=(Token)match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment8269); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA239);

					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment8273);
					rhs=expressionOrAny();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expressionOrAny.add(rhs.getTree());
					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTree());
					}
					break;

				default :
					break loop131;
				}
			}

			VERT240=(Token)match(input,VERT,FOLLOW_VERT_in_simultaneousAssignment8280); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_VERT.add(VERT240);

			// AST REWRITE
			// elements: rhs, right_comma, lhs, left_comma, a
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
			// 1308:5: -> ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1308:8: ^( $a ^( $left_comma ( $lhs)+ ) ^( $right_comma ( $rhs)+ ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_a.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1308:13: ^( $left_comma ( $lhs)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1308:36: ^( $right_comma ( $rhs)+ )
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


	public static class expressionOrAny_return extends ParserRuleReturnScope {
		BAST tree;
		@Override
		public BAST getTree() { return tree; }
	};


	// $ANTLR start "expressionOrAny"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:1: expressionOrAny : ( expression | LITERAL_any );
	public final BLESS3Parser.expressionOrAny_return expressionOrAny() throws RecognitionException {
		BLESS3Parser.expressionOrAny_return retval = new BLESS3Parser.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_any242=null;
		ParserRuleReturnScope expression241 =null;

		BAST LITERAL_any242_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1314:16: ( expression | LITERAL_any )
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==AADL_STRING_LITERAL||LA132_0==ID||LA132_0==LBRACKET||(LA132_0 >= LITERAL_abs && LA132_0 <= LITERAL_all)||LA132_0==LITERAL_exists||LA132_0==LITERAL_false||(LA132_0 >= LITERAL_not && LA132_0 <= LITERAL_numberof)||LA132_0==LITERAL_product||LA132_0==LITERAL_round||LA132_0==LITERAL_self||LA132_0==LITERAL_sum||LA132_0==LITERAL_timeout||LA132_0==LITERAL_tops||(LA132_0 >= LITERAL_true && LA132_0 <= LITERAL_truncate)||LA132_0==LPAREN||LA132_0==MINUS||LA132_0==NUMBER||LA132_0==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1315:3: expression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_expressionOrAny8326);
					expression241=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression241.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1315:16: LITERAL_any
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_any242=(Token)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny8330); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:1: whenThrow : LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1318:10: ( LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1319:3: LITERAL_when ^ LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_when243=(Token)match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow8342); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_when243_tree = (BAST)adaptor.create(LITERAL_when243);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_when243_tree, root_0);
			}

			LPAREN244=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow8345); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN244_tree = (BAST)adaptor.create(LPAREN244);
			adaptor.addChild(root_0, LPAREN244_tree);
			}

			pushFollow(FOLLOW_expression_in_whenThrow8349);
			exp=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exp.getTree());

			RPAREN245=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow8351); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN245_tree = (BAST)adaptor.create(RPAREN245);
			adaptor.addChild(root_0, RPAREN245_tree);
			}

			LITERAL_throw246=(Token)match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow8353); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_throw246_tree = (BAST)adaptor.create(LITERAL_throw246);
			adaptor.addChild(root_0, LITERAL_throw246_tree);
			}

			excep=(Token)match(input,ID,FOLLOW_ID_in_whenThrow8357); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			excep_tree = (BAST)adaptor.create(excep);
			adaptor.addChild(root_0, excep_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1320:10: (message= AADL_STRING_LITERAL )?
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==AADL_STRING_LITERAL) ) {
				alt133=1;
			}
			switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1320:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow8365); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1323:1: combinableOperation : (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1323:20: (f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !|f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !|sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !)
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1324:3: f_add= LITERAL_fetchadd ^ LPAREN !target= ID COMMA !arithmetic= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_add=(Token)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation8386); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_add_tree = (BAST)adaptor.create(f_add);
					root_0 = (BAST)adaptor.becomeRoot(f_add_tree, root_0);
					}

					LPAREN247=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8389); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8394); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8396); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8401);
					arithmetic=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arithmetic.getTree());

					COMMA249=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8403); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8408); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8410); if (state.failed) return retval;
					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1326:3: f_or= LITERAL_fetchor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_or=(Token)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation8422); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_or_tree = (BAST)adaptor.create(f_or);
					root_0 = (BAST)adaptor.becomeRoot(f_or_tree, root_0);
					}

					LPAREN251=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8425); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8430); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA252=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8432); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8437);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA253=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8439); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8444); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN254=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8446); if (state.failed) return retval;
					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1328:3: f_and= LITERAL_fetchand ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_and=(Token)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation8457); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_and_tree = (BAST)adaptor.create(f_and);
					root_0 = (BAST)adaptor.becomeRoot(f_and_tree, root_0);
					}

					LPAREN255=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8460); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8465); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA256=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8467); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8472);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA257=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8474); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8479); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8481); if (state.failed) return retval;
					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1330:3: f_xor= LITERAL_fetchxor ^ LPAREN !target= ID COMMA !bool= expression COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					f_xor=(Token)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation8492); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					f_xor_tree = (BAST)adaptor.create(f_xor);
					root_0 = (BAST)adaptor.becomeRoot(f_xor_tree, root_0);
					}

					LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8495); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8500); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA260=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8502); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_combinableOperation8507);
					bool=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool.getTree());

					COMMA261=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8509); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN262=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8516); if (state.failed) return retval;
					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1332:3: sw= LITERAL_swap ^ LPAREN !target= ID COMMA !reference= ID COMMA !result= ID RPAREN !
					{
					root_0 = (BAST)adaptor.nil();


					sw=(Token)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation8527); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					sw_tree = (BAST)adaptor.create(sw);
					root_0 = (BAST)adaptor.becomeRoot(sw_tree, root_0);
					}

					LPAREN263=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_combinableOperation8530); if (state.failed) return retval;
					target=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8535); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					target_tree = (BAST)adaptor.create(target);
					adaptor.addChild(root_0, target_tree);
					}

					COMMA264=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8537); if (state.failed) return retval;
					reference=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					reference_tree = (BAST)adaptor.create(reference);
					adaptor.addChild(root_0, reference_tree);
					}

					COMMA265=(Token)match(input,COMMA,FOLLOW_COMMA_in_combinableOperation8544); if (state.failed) return retval;
					result=(Token)match(input,ID,FOLLOW_ID_in_combinableOperation8549); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					result_tree = (BAST)adaptor.create(result);
					adaptor.addChild(root_0, result_tree);
					}

					RPAREN266=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_combinableOperation8551); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:1: communicationAction : (pc= subprogramCall |po= portOutput |pi= portInput );
	public final BLESS3Parser.communicationAction_return communicationAction() throws RecognitionException {
		BLESS3Parser.communicationAction_return retval = new BLESS3Parser.communicationAction_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope pc =null;
		ParserRuleReturnScope po =null;
		ParserRuleReturnScope pi =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1335:20: (pc= subprogramCall |po= portOutput |pi= portInput )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1336:3: pc= subprogramCall
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_subprogramCall_in_communicationAction8566);
					pc=subprogramCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pc.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1338:3: po= portOutput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portOutput_in_communicationAction8576);
					po=portOutput();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, po.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1340:3: pi= portInput
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portInput_in_communicationAction8586);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1347:1: computation : LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )? ;
	public final BLESS3Parser.computation_return computation() throws RecognitionException {
		BLESS3Parser.computation_return retval = new BLESS3Parser.computation_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_computation267=null;
		Token LPAREN268=null;
		Token COMMA269=null;
		Token RPAREN270=null;
		Token LITERAL_in271=null;
		Token LITERAL_binding272=null;
		ParserRuleReturnScope lb =null;
		ParserRuleReturnScope ub =null;
		ParserRuleReturnScope component =null;

		BAST LITERAL_computation267_tree=null;
		BAST LPAREN268_tree=null;
		BAST COMMA269_tree=null;
		BAST RPAREN270_tree=null;
		BAST LITERAL_in271_tree=null;
		BAST LITERAL_binding272_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1347:12: ( LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1348:3: LITERAL_computation ^ LPAREN !lb= behaviorTime ( COMMA !ub= behaviorTime )? RPAREN ! ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_computation267=(Token)match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation8602); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_computation267_tree = (BAST)adaptor.create(LITERAL_computation267);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_computation267_tree, root_0);
			}

			LPAREN268=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_computation8605); if (state.failed) return retval;
			pushFollow(FOLLOW_behaviorTime_in_computation8610);
			lb=behaviorTime();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lb.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1348:48: ( COMMA !ub= behaviorTime )?
			int alt136=2;
			int LA136_0 = input.LA(1);
			if ( (LA136_0==COMMA) ) {
				alt136=1;
			}
			switch (alt136) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1348:50: COMMA !ub= behaviorTime
					{
					COMMA269=(Token)match(input,COMMA,FOLLOW_COMMA_in_computation8614); if (state.failed) return retval;
					pushFollow(FOLLOW_behaviorTime_in_computation8619);
					ub=behaviorTime();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ub.getTree());

					}
					break;

			}

			RPAREN270=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_computation8624); if (state.failed) return retval;
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:5: ( LITERAL_in ! LITERAL_binding ^ (component= componentName )+ )?
			int alt138=2;
			int LA138_0 = input.LA(1);
			if ( (LA138_0==LITERAL_in) ) {
				alt138=1;
			}
			switch (alt138) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:7: LITERAL_in ! LITERAL_binding ^ (component= componentName )+
					{
					LITERAL_in271=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_computation8633); if (state.failed) return retval;
					LITERAL_binding272=(Token)match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation8636); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_binding272_tree = (BAST)adaptor.create(LITERAL_binding272);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_binding272_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:45: (component= componentName )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1349:45: component= componentName
							{
							pushFollow(FOLLOW_componentName_in_computation8641);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1352:1: subprogramCall : id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1352:15: (id= ID LPAREN (fal= formalActualList )? RPAREN -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1353:3: id= ID LPAREN (fal= formalActualList )? RPAREN
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_subprogramCall8659); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			LPAREN273=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subprogramCall8661); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN273);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1353:19: (fal= formalActualList )?
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( (LA139_0==AADL_STRING_LITERAL||LA139_0==ID||LA139_0==LBRACKET||LA139_0==LITERAL_false||LA139_0==LITERAL_null||LA139_0==LITERAL_self||LA139_0==LITERAL_true||LA139_0==LPAREN||LA139_0==NUMBER||LA139_0==OCTOTHORPE) ) {
				alt139=1;
			}
			switch (alt139) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1353:19: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall8665);
					fal=formalActualList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalActualList.add(fal.getTree());
					}
					break;

			}

			RPAREN274=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subprogramCall8668); if (state.failed) return retval; 
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
			// 1354:5: -> ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1354:8: ^( SUBPROGRAM_INVOCATION[$id,\n \"SUBPROGRAM_INVOCATION[\"+$id.text+\":\"+Integer.toString($id.getLine()+startingLine)+\"] \"] $id $fal)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:1: formalActualList : formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1358:17: ( formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1359:3: formalActual ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_formalActual_in_formalActualList8699);
			formalActual275=formalActual();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual275.getTree());

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1359:16: ( COMMA ^ formalActual ( COMMA ! formalActual )* )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==COMMA) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1359:18: COMMA ^ formalActual ( COMMA ! formalActual )*
					{
					COMMA276=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8703); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA276_tree = (BAST)adaptor.create(COMMA276);
					root_0 = (BAST)adaptor.becomeRoot(COMMA276_tree, root_0);
					}

					pushFollow(FOLLOW_formalActual_in_formalActualList8706);
					formalActual277=formalActual();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual277.getTree());

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1359:38: ( COMMA ! formalActual )*
					loop140:
					while (true) {
						int alt140=2;
						int LA140_0 = input.LA(1);
						if ( (LA140_0==COMMA) ) {
							alt140=1;
						}

						switch (alt140) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1359:40: COMMA ! formalActual
							{
							COMMA278=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalActualList8710); if (state.failed) return retval;
							pushFollow(FOLLOW_formalActual_in_formalActualList8713);
							formalActual279=formalActual();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, formalActual279.getTree());

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:1: formalActual : (formal= ID COLON ^)? actual= subProgramParameter ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1362:13: ( (formal= ID COLON ^)? actual= subProgramParameter )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:3: (formal= ID COLON ^)? actual= subProgramParameter
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:3: (formal= ID COLON ^)?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1363:5: formal= ID COLON ^
					{
					formal=(Token)match(input,ID,FOLLOW_ID_in_formalActual8735); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					formal_tree = (BAST)adaptor.create(formal);
					adaptor.addChild(root_0, formal_tree);
					}

					COLON280=(Token)match(input,COLON,FOLLOW_COLON_in_formalActual8743); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COLON280_tree = (BAST)adaptor.create(COLON280);
					root_0 = (BAST)adaptor.becomeRoot(COLON280_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_subProgramParameter_in_formalActual8751);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1367:1: subProgramParameter : ( valueName | constant | parenthesizedSubexpression );
	public final BLESS3Parser.subProgramParameter_return subProgramParameter() throws RecognitionException {
		BLESS3Parser.subProgramParameter_return retval = new BLESS3Parser.subProgramParameter_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope valueName281 =null;
		ParserRuleReturnScope constant282 =null;
		ParserRuleReturnScope parenthesizedSubexpression283 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1367:20: ( valueName | constant | parenthesizedSubexpression )
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
			case LBRACKET:
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1368:2: valueName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_valueName_in_subProgramParameter8762);
					valueName281=valueName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueName281.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1369:4: constant
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_constant_in_subProgramParameter8767);
					constant282=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant282.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1370:4: parenthesizedSubexpression
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter8772);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1373:1: portOutput : pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1373:11: (pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )? -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1374:5: pn= ID EXCLAMATION ( LPAREN be= expression RPAREN )?
			{
			pn=(Token)match(input,ID,FOLLOW_ID_in_portOutput8788); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn);

			EXCLAMATION284=(Token)match(input,EXCLAMATION,FOLLOW_EXCLAMATION_in_portOutput8790); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EXCLAMATION.add(EXCLAMATION284);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1374:23: ( LPAREN be= expression RPAREN )?
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==LPAREN) ) {
				alt144=1;
			}
			switch (alt144) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1374:25: LPAREN be= expression RPAREN
					{
					LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portOutput8794); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN285);

					pushFollow(FOLLOW_expression_in_portOutput8798);
					be=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(be.getTree());
					RPAREN286=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portOutput8800); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN286);

					}
					break;

			}

			// AST REWRITE
			// elements: pn, be
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
			// 1375:5: -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1375:8: ^( PORT_OUTPUT[$pn, //.tree.getToken(),\n \"PORT_OUTPUT[\"+Integer.toString($pn.tree.getLine() //+startingLine\n )+\"]\"] $pn ( $be)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(PORT_OUTPUT, pn, "PORT_OUTPUT["+Integer.toString(pn_tree.getLine()       )+"]"), root_1);
				adaptor.addChild(root_1, stream_pn.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1377:19: ( $be)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1380:1: portInput : pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1380:10: (pn2= ID QUESTION LPAREN n= valueName RPAREN -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1381:5: pn2= ID QUESTION LPAREN n= valueName RPAREN
			{
			pn2=(Token)match(input,ID,FOLLOW_ID_in_portInput8846); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(pn2);

			QUESTION287=(Token)match(input,QUESTION,FOLLOW_QUESTION_in_portInput8848); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_QUESTION.add(QUESTION287);

			LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_portInput8850); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN288);

			pushFollow(FOLLOW_valueName_in_portInput8855);
			n=valueName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valueName.add(n.getTree());
			RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_portInput8857); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN289);

			// AST REWRITE
			// elements: n, pn2
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
			// 1382:6: -> ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1382:9: ^( PORT_INPUT[$pn2, //.tree.getToken(),\n \"PORT_INPUT[\"+Integer.toString($pn2.tree.getLine() //+startingLine\n )+\"]\"] $pn2 $n)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1387:1: alternative : lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1387:12: (lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi -> ^( $lif ( $alt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1388:3: lif= LITERAL_if alt+= guardedAction ( BOX alt+= guardedAction )+ LITERAL_fi
			{
			lif=(Token)match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative8898); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_if.add(lif);

			pushFollow(FOLLOW_guardedAction_in_alternative8906);
			alt=guardedAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_guardedAction.add(alt.getTree());
			if (list_alt==null) list_alt=new ArrayList<Object>();
			list_alt.add(alt.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:3: ( BOX alt+= guardedAction )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1391:5: BOX alt+= guardedAction
					{
					BOX290=(Token)match(input,BOX,FOLLOW_BOX_in_alternative8912); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BOX.add(BOX290);

					pushFollow(FOLLOW_guardedAction_in_alternative8916);
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

			LITERAL_fi291=(Token)match(input,LITERAL_fi,FOLLOW_LITERAL_fi_in_alternative8924); if (state.failed) return retval; 
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
			// 1393:5: -> ^( $lif ( $alt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1393:8: ^( $lif ( $alt)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1399:1: guardedAction : LPAREN ! expression GUARD ^ assertedAction ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1399:14: ( LPAREN ! expression GUARD ^ assertedAction )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1400:3: LPAREN ! expression GUARD ^ assertedAction
			{
			root_0 = (BAST)adaptor.nil();


			LPAREN292=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_guardedAction8962); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_guardedAction8966);
			expression293=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression293.getTree());

			GUARD294=(Token)match(input,GUARD,FOLLOW_GUARD_in_guardedAction8968); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GUARD294_tree = (BAST)adaptor.create(GUARD294);
			root_0 = (BAST)adaptor.becomeRoot(GUARD294_tree, root_0);
			}

			pushFollow(FOLLOW_assertedAction_in_guardedAction8971);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1405:1: whileLoop : lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1405:10: (lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1406:3: lw= LITERAL_while LPAREN be= expression RPAREN ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? elq= existentialLatticeQuantification
			{
			lw=(Token)match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop8995); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_while.add(lw);

			LPAREN296=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileLoop9001); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN296);

			pushFollow(FOLLOW_expression_in_whileLoop9006);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN297=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileLoop9008); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN297);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1409:3: ( LITERAL_invariant inv= assertion )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==LITERAL_invariant) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1409:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant298=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_whileLoop9015); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant298);

					pushFollow(FOLLOW_assertion_in_whileLoop9019);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1410:3: ( LITERAL_bound bd= expression )?
			int alt147=2;
			int LA147_0 = input.LA(1);
			if ( (LA147_0==LITERAL_bound) ) {
				alt147=1;
			}
			switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1410:5: LITERAL_bound bd= expression
					{
					LITERAL_bound299=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_whileLoop9028); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound299);

					pushFollow(FOLLOW_expression_in_whileLoop9033);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop9044);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: elq, bd, be, lw, inv
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
			// 1412:5: -> ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:8: ^( $lw $be ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$lw,\"BOUND\"] ( $bd)? ) $elq)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lw.nextNode(), root_1);
				adaptor.addChild(root_1, stream_be.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:18: ^( INVARIANT[$lw,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lw, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:48: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:54: ^( BOUND[$lw,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, lw, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1412:76: ( $bd)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1417:1: forLoop : lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1417:8: (lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1418:3: lf= LITERAL_for a= identifier li= LITERAL_in lb= expression DOTDOT ub= expression ( LITERAL_invariant inv= assertion )? LCURLY act= behaviorActions RCURLY
			{
			lf=(Token)match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop9102); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_for.add(lf);

			pushFollow(FOLLOW_identifier_in_forLoop9109);
			a=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(a.getTree());
			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop9114); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_forLoop9119);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT300=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_forLoop9121); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT300);

			pushFollow(FOLLOW_expression_in_forLoop9126);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1420:3: ( LITERAL_invariant inv= assertion )?
			int alt148=2;
			int LA148_0 = input.LA(1);
			if ( (LA148_0==LITERAL_invariant) ) {
				alt148=1;
			}
			switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1420:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant301=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_forLoop9133); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant301);

					pushFollow(FOLLOW_assertion_in_forLoop9137);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			LCURLY302=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_forLoop9144); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY302);

			pushFollow(FOLLOW_behaviorActions_in_forLoop9149);
			act=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(act.getTree());
			RCURLY303=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_forLoop9151); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY303);

			// AST REWRITE
			// elements: lb, act, inv, a, li, ub, lf
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
			// 1422:5: -> ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:7: ^( $lf $a ^( $li $lb $ub) ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? ) $act)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_lf.nextNode(), root_1);
				adaptor.addChild(root_1, stream_a.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:16: ^( $li $lb $ub)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_li.nextNode(), root_2);
				adaptor.addChild(root_2, stream_lb.nextTree());
				adaptor.addChild(root_2, stream_ub.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:31: ^( INVARIANT[$lf,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, lf, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1422:61: ( $inv)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1427:1: doUntilLoop : ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1427:12: (ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1428:3: ld= LITERAL_do ( LITERAL_invariant inv= assertion )? ( LITERAL_bound bd= expression )? ba= behaviorActions lu= LITERAL_until LPAREN be= expression RPAREN
			{
			ld=(Token)match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop9214); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_do.add(ld);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1429:3: ( LITERAL_invariant inv= assertion )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==LITERAL_invariant) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1429:5: LITERAL_invariant inv= assertion
					{
					LITERAL_invariant304=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_doUntilLoop9221); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_invariant.add(LITERAL_invariant304);

					pushFollow(FOLLOW_assertion_in_doUntilLoop9225);
					inv=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1430:3: ( LITERAL_bound bd= expression )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LITERAL_bound) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1430:5: LITERAL_bound bd= expression
					{
					LITERAL_bound305=(Token)match(input,LITERAL_bound,FOLLOW_LITERAL_bound_in_doUntilLoop9234); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_bound.add(LITERAL_bound305);

					pushFollow(FOLLOW_expression_in_doUntilLoop9239);
					bd=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(bd.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop9250);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_behaviorActions.add(ba.getTree());
			lu=(Token)match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop9256); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_until.add(lu);

			LPAREN306=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doUntilLoop9258); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN306);

			pushFollow(FOLLOW_expression_in_doUntilLoop9263);
			be=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(be.getTree());
			RPAREN307=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doUntilLoop9265); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN307);

			// AST REWRITE
			// elements: lu, be, ld, bd, inv, ba
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
			// 1433:5: -> ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:7: ^( $ld ^( $lu $be) ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? ) ^( BOUND[$ld,\"BOUND\"] ( $bd)? ) $ba)
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot(stream_ld.nextNode(), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:13: ^( $lu $be)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot(stream_lu.nextNode(), root_2);
				adaptor.addChild(root_2, stream_be.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:24: ^( INVARIANT[$ld,\"INVARIANT\"] ( $inv)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(INVARIANT, ld, "INVARIANT"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:54: ( $inv)?
				if ( stream_inv.hasNext() ) {
					adaptor.addChild(root_2, stream_inv.nextTree());
				}
				stream_inv.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:60: ^( BOUND[$ld,\"BOUND\"] ( $bd)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(BOUND, ld, "BOUND"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1433:82: ( $bd)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:1: existentialLatticeQuantification : (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1439:33: ( (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:3: (qv= quantifiedVariables )? lc= LCURLY ^ba= behaviorActions RCURLY (cc= catchClause )?
			{
			root_0 = (BAST)adaptor.nil();


			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:5: (qv= quantifiedVariables )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LITERAL_declare) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1440:5: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9332);
					qv=quantifiedVariables();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, qv.getTree());

					}
					break;

			}

			lc=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification9339); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			lc_tree = (BAST)adaptor.create(lc);
			root_0 = (BAST)adaptor.becomeRoot(lc_tree, root_0);
			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification9345);
			ba=behaviorActions();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, ba.getTree());

			RCURLY308=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification9347); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RCURLY308_tree = (BAST)adaptor.create(RCURLY308);
			adaptor.addChild(root_0, RCURLY308_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:5: (cc= catchClause )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==LITERAL_catch) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1442:5: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification9355);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1447:1: universalLatticeQuantification : lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1447:31: (lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1448:3: lf= LITERAL_forall (lv+= ID )+ li= LITERAL_in lb= expression DOTDOT ub= expression elq= existentialLatticeQuantification
			{
			lf=(Token)match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification9380); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_forall.add(lf);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:5: (lv+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1449:5: lv+= ID
					{
					lv=(Token)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification9389); if (state.failed) return retval; 
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

			li=(Token)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification9394); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_in.add(li);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9398);
			lb=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(lb.getTree());
			DOTDOT309=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_universalLatticeQuantification9400); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DOTDOT.add(DOTDOT309);

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification9404);
			ub=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(ub.getTree());
			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9413);
			elq=existentialLatticeQuantification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_existentialLatticeQuantification.add(elq.getTree());
			// AST REWRITE
			// elements: lf, elq, lb, ub, li, lv
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
			// 1452:5: -> ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1452:8: ^( $lf ( $lv)+ ^( $li $lb $ub) $elq)
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1452:19: ^( $li $lb $ub)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:1: issueException : LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1457:15: ( LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1458:2: LITERAL_exception ^ LPAREN exception= ID (message= AADL_STRING_LITERAL )? RPAREN
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_exception310=(Token)match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9462); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_exception310_tree = (BAST)adaptor.create(LITERAL_exception310);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_exception310_tree, root_0);
			}

			LPAREN311=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_issueException9465); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN311_tree = (BAST)adaptor.create(LPAREN311);
			adaptor.addChild(root_0, LPAREN311_tree);
			}

			exception=(Token)match(input,ID,FOLLOW_ID_in_issueException9469); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			exception_tree = (BAST)adaptor.create(exception);
			adaptor.addChild(root_0, exception_tree);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1459:10: (message= AADL_STRING_LITERAL )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==AADL_STRING_LITERAL) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1459:10: message= AADL_STRING_LITERAL
					{
					message=(Token)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9477); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					message_tree = (BAST)adaptor.create(message);
					adaptor.addChild(root_0, message_tree);
					}

					}
					break;

			}

			RPAREN312=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_issueException9480); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1465:1: blessSubclause : (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE[\"BLESS_SUBCLAUSE\"] $no_proof $ac $inv $vs $ss $t) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1465:15: ( (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? -> ^( BLESS_SUBCLAUSE[\"BLESS_SUBCLAUSE\"] $no_proof $ac $inv $vs $ss $t) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:2: (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )?
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:10: (no_proof= DO_NOT_PROVE )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==DO_NOT_PROVE) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1466:10: no_proof= DO_NOT_PROVE
					{
					no_proof=(Token)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause9494); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_NOT_PROVE.add(no_proof);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:5: (ac= assertClause )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==LITERAL_assert) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1467:5: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_blessSubclause9501);
					ac=assertClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertClause.add(ac.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1468:6: (inv= invariantClause )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==LITERAL_invariant) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1468:6: inv= invariantClause
					{
					pushFollow(FOLLOW_invariantClause_in_blessSubclause9510);
					inv=invariantClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_invariantClause.add(inv.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1469:5: (vs= variablesSection )?
			int alt158=2;
			int LA158_0 = input.LA(1);
			if ( (LA158_0==LITERAL_variables) ) {
				alt158=1;
			}
			switch (alt158) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1469:5: vs= variablesSection
					{
					pushFollow(FOLLOW_variablesSection_in_blessSubclause9517);
					vs=variablesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variablesSection.add(vs.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1470:5: (ss= statesSection )?
			int alt159=2;
			int LA159_0 = input.LA(1);
			if ( (LA159_0==LITERAL_states) ) {
				alt159=1;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1470:5: ss= statesSection
					{
					pushFollow(FOLLOW_statesSection_in_blessSubclause9524);
					ss=statesSection();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statesSection.add(ss.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1471:4: (t= transitions )?
			int alt160=2;
			int LA160_0 = input.LA(1);
			if ( (LA160_0==LITERAL_transitions) ) {
				alt160=1;
			}
			switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1471:4: t= transitions
					{
					pushFollow(FOLLOW_transitions_in_blessSubclause9531);
					t=transitions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_transitions.add(t.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ac, vs, inv, t, ss, no_proof
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
			// 1472:5: -> ^( BLESS_SUBCLAUSE[\"BLESS_SUBCLAUSE\"] $no_proof $ac $inv $vs $ss $t)
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1472:8: ^( BLESS_SUBCLAUSE[\"BLESS_SUBCLAUSE\"] $no_proof $ac $inv $vs $ss $t)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:1: invariantClause : LITERAL_invariant ^ assertion ;
	public final BLESS3Parser.invariantClause_return invariantClause() throws RecognitionException {
		BLESS3Parser.invariantClause_return retval = new BLESS3Parser.invariantClause_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_invariant313=null;
		ParserRuleReturnScope assertion314 =null;

		BAST LITERAL_invariant313_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1475:16: ( LITERAL_invariant ^ assertion )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1476:3: LITERAL_invariant ^ assertion
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_invariant313=(Token)match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause9574); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_invariant313_tree = (BAST)adaptor.create(LITERAL_invariant313);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_invariant313_tree, root_0);
			}

			pushFollow(FOLLOW_assertion_in_invariantClause9577);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1479:1: variablesSection : LITERAL_variables ^ (vd+= variableDeclaration )+ ;
	public final BLESS3Parser.variablesSection_return variablesSection() throws RecognitionException {
		BLESS3Parser.variablesSection_return retval = new BLESS3Parser.variablesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_variables315=null;
		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		BAST LITERAL_variables315_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1479:17: ( LITERAL_variables ^ (vd+= variableDeclaration )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1480:2: LITERAL_variables ^ (vd+= variableDeclaration )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_variables315=(Token)match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection9589); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_variables315_tree = (BAST)adaptor.create(LITERAL_variables315);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_variables315_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1480:23: (vd+= variableDeclaration )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1480:23: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection9594);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:1: statesSection : LITERAL_states ^ (states+= behaviorState )+ ;
	public final BLESS3Parser.statesSection_return statesSection() throws RecognitionException {
		BLESS3Parser.statesSection_return retval = new BLESS3Parser.statesSection_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_states316=null;
		List<Object> list_states=null;
		RuleReturnScope states = null;
		BAST LITERAL_states316_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1483:14: ( LITERAL_states ^ (states+= behaviorState )+ )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:4: LITERAL_states ^ (states+= behaviorState )+
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_states316=(Token)match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection9606); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_states316_tree = (BAST)adaptor.create(LITERAL_states316);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_states316_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:26: (states+= behaviorState )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1484:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection9611);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1490:1: behaviorState : i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1490:14: (i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )? -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1491:3: i= identifier COLON (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )? st= LITERAL_state (a= assertion )? ( SEMICOLON )?
			{
			pushFollow(FOLLOW_identifier_in_behaviorState9628);
			i=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(i.getTree());
			COLON317=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorState9633); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON317);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:9: (init= LITERAL_initial |com= LITERAL_complete |finl= LITERAL_final )?
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:10: init= LITERAL_initial
					{
					init=(Token)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState9638); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_initial.add(init);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:33: com= LITERAL_complete
					{
					com=(Token)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState9644); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_complete.add(com);

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:56: finl= LITERAL_final
					{
					finl=(Token)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState9650); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LITERAL_final.add(finl);

					}
					break;

			}

			st=(Token)match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState9656); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_state.add(st);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:95: (a= assertion )?
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==LASS) ) {
				alt164=1;
			}
			switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:95: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState9660);
					a=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(a.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:107: ( SEMICOLON )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==SEMICOLON) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1492:107: SEMICOLON
					{
					SEMICOLON318=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorState9663); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON318);

					}
					break;

			}

			// AST REWRITE
			// elements: a, init, i, finl, com, LITERAL_state
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
			// 1493:5: -> ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:8: ^( LITERAL_state[$st,\"state[\"+Integer.toString($st.getLine()+startingLine)+\"]\"] ( $init)? ( $com)? ( $finl)? $i ( $a)? )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LITERAL_state, st, "state["+Integer.toString(st.getLine()+startingLine)+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:89: ( $init)?
				if ( stream_init.hasNext() ) {
					adaptor.addChild(root_1, stream_init.nextNode());
				}
				stream_init.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:96: ( $com)?
				if ( stream_com.hasNext() ) {
					adaptor.addChild(root_1, stream_com.nextNode());
				}
				stream_com.reset();

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:102: ( $finl)?
				if ( stream_finl.hasNext() ) {
					adaptor.addChild(root_1, stream_finl.nextNode());
				}
				stream_finl.reset();

				adaptor.addChild(root_1, stream_i.nextTree());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1493:112: ( $a)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1498:1: transitions : t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1499:3: (t= LITERAL_transitions (bt+= behaviorTransition )+ -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1500:3: t= LITERAL_transitions (bt+= behaviorTransition )+
			{
			t=(Token)match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions9724); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LITERAL_transitions.add(t);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1500:27: (bt+= behaviorTransition )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1500:27: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions9728);
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
			// 1501:5: -> ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1501:8: ^( LITERAL_transitions[$t,\"transitions[\"+Integer.toString($t.getLine()+startingLine)+\"]\"] ( $bt)+ )
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1508:1: behaviorTransition : id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+$id.getText()+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$x,\"Q\"] ( $q)? ) ) ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1509:3: (id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )? -> ^( TRANSITION[$x,\"TRANSITION[\"+$id.getText()+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$x,\"Q\"] ( $q)? ) ) )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1510:4: id= ID (pr= priority )? COLON ssi+= identifier ( COMMA ssi+= identifier )* x= LCON (bc= behaviorCondition )? RCON dsi= identifier ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY ) (q= assertion )? (semi= SEMICOLON )?
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_behaviorTransition9773); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(id);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1510:12: (pr= priority )?
			int alt167=2;
			int LA167_0 = input.LA(1);
			if ( (LA167_0==LBRACKET) ) {
				alt167=1;
			}
			switch (alt167) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1510:12: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition9777);
					pr=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_priority.add(pr.getTree());
					}
					break;

			}

			COLON319=(Token)match(input,COLON,FOLLOW_COLON_in_behaviorTransition9780); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON.add(COLON319);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9788);
			ssi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(ssi.getTree());
			if (list_ssi==null) list_ssi=new ArrayList<Object>();
			list_ssi.add(ssi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1511:36: ( COMMA ssi+= identifier )*
			loop168:
			while (true) {
				int alt168=2;
				int LA168_0 = input.LA(1);
				if ( (LA168_0==COMMA) ) {
					alt168=1;
				}

				switch (alt168) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1511:38: COMMA ssi+= identifier
					{
					COMMA320=(Token)match(input,COMMA,FOLLOW_COMMA_in_behaviorTransition9792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA320);

					pushFollow(FOLLOW_identifier_in_behaviorTransition9797);
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

			x=(Token)match(input,LCON,FOLLOW_LCON_in_behaviorTransition9806); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LCON.add(x);

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1512:12: (bc= behaviorCondition )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==AADL_STRING_LITERAL||LA169_0==ID||LA169_0==LBRACKET||(LA169_0 >= LITERAL_abs && LA169_0 <= LITERAL_all)||LA169_0==LITERAL_exists||LA169_0==LITERAL_false||(LA169_0 >= LITERAL_not && LA169_0 <= LITERAL_numberof)||LA169_0==LITERAL_on||LA169_0==LITERAL_product||LA169_0==LITERAL_round||LA169_0==LITERAL_self||LA169_0==LITERAL_sum||LA169_0==LITERAL_timeout||LA169_0==LITERAL_tops||(LA169_0 >= LITERAL_true && LA169_0 <= LITERAL_truncate)||LA169_0==LPAREN||LA169_0==MINUS||LA169_0==NUMBER||LA169_0==OCTOTHORPE) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1512:12: bc= behaviorCondition
					{
					pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition9810);
					bc=behaviorCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorCondition.add(bc.getTree());
					}
					break;

			}

			RCON321=(Token)match(input,RCON,FOLLOW_RCON_in_behaviorTransition9813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RCON.add(RCON321);

			pushFollow(FOLLOW_identifier_in_behaviorTransition9820);
			dsi=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(dsi.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1514:3: ( LCURLY s= behaviorActions RCURLY | EMPTY_CURLY )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1514:5: LCURLY s= behaviorActions RCURLY
					{
					LCURLY322=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behaviorTransition9827); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LCURLY.add(LCURLY322);

					pushFollow(FOLLOW_behaviorActions_in_behaviorTransition9831);
					s=behaviorActions();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_behaviorActions.add(s.getTree());
					RCURLY323=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_behaviorTransition9833); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RCURLY.add(RCURLY323);

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1514:39: EMPTY_CURLY
					{
					EMPTY_CURLY324=(Token)match(input,EMPTY_CURLY,FOLLOW_EMPTY_CURLY_in_behaviorTransition9837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EMPTY_CURLY.add(EMPTY_CURLY324);

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1515:4: (q= assertion )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==LASS) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1515:4: q= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorTransition9845);
					q=assertion();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assertion.add(q.getTree());
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1515:20: (semi= SEMICOLON )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==SEMICOLON) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1515:20: semi= SEMICOLON
					{
					semi=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorTransition9850); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(semi);

					}
					break;

			}

			// AST REWRITE
			// elements: id, dsi, q, bc, pr, ssi, s
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
			// 1516:5: -> ^( TRANSITION[$x,\"TRANSITION[\"+$id.getText()+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$x,\"Q\"] ( $q)? ) )
			{
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1517:7: ^( TRANSITION[$x,\"TRANSITION[\"+$id.getText()+\"]\"] ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? ) ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ ) ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? ) ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi) ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? ) ^( Q[$x,\"Q\"] ( $q)? ) )
				{
				BAST root_1 = (BAST)adaptor.nil();
				root_1 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(TRANSITION, x, "TRANSITION["+id.getText()+"]"), root_1);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1518:7: ^( LABEL[$x,\"LABEL[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $id ( $pr)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(LABEL, x, "LABEL["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_id.nextNode());
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1518:82: ( $pr)?
				if ( stream_pr.hasNext() ) {
					adaptor.addChild(root_2, stream_pr.nextTree());
				}
				stream_pr.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1519:7: ^( SOURCE[$x,\"SOURCE[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $ssi)+ )
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

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:7: ^( CONDITION[$x,\"CONDITION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $bc)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(CONDITION, x, "CONDITION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1520:86: ( $bc)?
				if ( stream_bc.hasNext() ) {
					adaptor.addChild(root_2, stream_bc.nextTree());
				}
				stream_bc.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1521:7: ^( DESTINATION[$x,\"DESTINATION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] $dsi)
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(DESTINATION, x, "DESTINATION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				adaptor.addChild(root_2, stream_dsi.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1522:7: ^( ACTION[$x,\"ACTION[\"+Integer.toString($x.getLine()+startingLine)+\"]\"] ( $s)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(ACTION, x, "ACTION["+Integer.toString(x.getLine()+startingLine)+"]"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1522:80: ( $s)?
				if ( stream_s.hasNext() ) {
					adaptor.addChild(root_2, stream_s.nextTree());
				}
				stream_s.reset();

				adaptor.addChild(root_1, root_2);
				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:7: ^( Q[$x,\"Q\"] ( $q)? )
				{
				BAST root_2 = (BAST)adaptor.nil();
				root_2 = (BAST)adaptor.becomeRoot((BAST)adaptor.create(Q, x, "Q"), root_2);
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1523:21: ( $q)?
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:1: priority : LBRACKET ^ NUMBER RBRACKET ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1534:9: ( LBRACKET ^ NUMBER RBRACKET )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1535:2: LBRACKET ^ NUMBER RBRACKET
			{
			root_0 = (BAST)adaptor.nil();


			LBRACKET325=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_priority10012); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LBRACKET325_tree = (BAST)adaptor.create(LBRACKET325);
			root_0 = (BAST)adaptor.becomeRoot(LBRACKET325_tree, root_0);
			}

			NUMBER326=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_priority10015); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NUMBER326_tree = (BAST)adaptor.create(NUMBER326);
			adaptor.addChild(root_0, NUMBER326_tree);
			}

			RBRACKET327=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_priority10017); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1538:1: behaviorCondition : ( dispatchCondition | executeCondition | modeCondition | internalCondition );
	public final BLESS3Parser.behaviorCondition_return behaviorCondition() throws RecognitionException {
		BLESS3Parser.behaviorCondition_return retval = new BLESS3Parser.behaviorCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope dispatchCondition328 =null;
		ParserRuleReturnScope executeCondition329 =null;
		ParserRuleReturnScope modeCondition330 =null;
		ParserRuleReturnScope internalCondition331 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1539:3: ( dispatchCondition | executeCondition | modeCondition | internalCondition )
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
			else if ( (LA173_0==AADL_STRING_LITERAL||LA173_0==ID||LA173_0==LBRACKET||(LA173_0 >= LITERAL_abs && LA173_0 <= LITERAL_all)||LA173_0==LITERAL_exists||LA173_0==LITERAL_false||(LA173_0 >= LITERAL_not && LA173_0 <= LITERAL_numberof)||LA173_0==LITERAL_product||LA173_0==LITERAL_round||LA173_0==LITERAL_self||LA173_0==LITERAL_sum||LA173_0==LITERAL_timeout||LA173_0==LITERAL_tops||(LA173_0 >= LITERAL_true && LA173_0 <= LITERAL_truncate)||LA173_0==LPAREN||LA173_0==MINUS||LA173_0==NUMBER||LA173_0==OCTOTHORPE) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:3: dispatchCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition10032);
					dispatchCondition328=dispatchCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dispatchCondition328.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:23: executeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_executeCondition_in_behaviorCondition10036);
					executeCondition329=executeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, executeCondition329.getTree());

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:42: modeCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeCondition_in_behaviorCondition10040);
					modeCondition330=modeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modeCondition330.getTree());

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1540:58: internalCondition
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_internalCondition_in_behaviorCondition10044);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1543:1: dispatchCondition : LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1543:18: ( LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1544:3: LITERAL_on ! LITERAL_dispatch ^ (de= dispatchExpression )?
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on332=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_dispatchCondition10056); if (state.failed) return retval;
			LITERAL_dispatch333=(Token)match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition10059); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_dispatch333_tree = (BAST)adaptor.create(LITERAL_dispatch333);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_dispatch333_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1544:35: (de= dispatchExpression )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==ID||LA174_0==LITERAL_timeout) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1544:35: de= dispatchExpression
					{
					pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition10064);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:1: dispatchExpression :dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1549:19: (dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1550:3: dc+= dispatchConjunction ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10082);
			dc=dispatchConjunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

			if (list_dc==null) list_dc=new ArrayList<Object>();
			list_dc.add(dc.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1550:27: ( LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )* )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==LITERAL_or) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1550:29: LITERAL_or ^dc+= dispatchConjunction ( LITERAL_or !dc+= dispatchConjunction )*
					{
					LITERAL_or334=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10086); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or334_tree = (BAST)adaptor.create(LITERAL_or334);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_or334_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10091);
					dc=dispatchConjunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dc.getTree());

					if (list_dc==null) list_dc=new ArrayList<Object>();
					list_dc.add(dc.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1551:4: ( LITERAL_or !dc+= dispatchConjunction )*
					loop175:
					while (true) {
						int alt175=2;
						int LA175_0 = input.LA(1);
						if ( (LA175_0==LITERAL_or) ) {
							alt175=1;
						}

						switch (alt175) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1551:6: LITERAL_or !dc+= dispatchConjunction
							{
							LITERAL_or335=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression10099); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression10104);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1556:1: dispatchConjunction :trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1556:20: (trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1557:3: trigger+= dispatchTrigger ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10127);
			trigger=dispatchTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

			if (list_trigger==null) list_trigger=new ArrayList<Object>();
			list_trigger.add(trigger.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:5: ( LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )* )?
			int alt178=2;
			int LA178_0 = input.LA(1);
			if ( (LA178_0==LITERAL_and) ) {
				alt178=1;
			}
			switch (alt178) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1558:7: LITERAL_and ^trigger+= dispatchTrigger ( LITERAL_and !trigger+= dispatchTrigger )*
					{
					LITERAL_and336=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10136); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and336_tree = (BAST)adaptor.create(LITERAL_and336);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_and336_tree, root_0);
					}

					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10141);
					trigger=dispatchTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, trigger.getTree());

					if (list_trigger==null) list_trigger=new ArrayList<Object>();
					list_trigger.add(trigger.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:6: ( LITERAL_and !trigger+= dispatchTrigger )*
					loop177:
					while (true) {
						int alt177=2;
						int LA177_0 = input.LA(1);
						if ( (LA177_0==LITERAL_and) ) {
							alt177=1;
						}

						switch (alt177) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1559:8: LITERAL_and !trigger+= dispatchTrigger
							{
							LITERAL_and337=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction10151); if (state.failed) return retval;
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction10156);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:1: dispatchTrigger : (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )? );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1562:16: (port= portName | LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )? )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1563:3: port= portName
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_portName_in_dispatchTrigger10174);
					port=portName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, port.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1564:5: LITERAL_timeout ^ ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )?
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_timeout338=(Token)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger10182); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_timeout338_tree = (BAST)adaptor.create(LITERAL_timeout338);
					root_0 = (BAST)adaptor.becomeRoot(LITERAL_timeout338_tree, root_0);
					}

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:4: ( ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime )?
					int alt181=2;
					int LA181_0 = input.LA(1);
					if ( (LA181_0==ID||LA181_0==LITERAL_self||LA181_0==LPAREN||LA181_0==NUMBER||LA181_0==OCTOTHORPE) ) {
						alt181=1;
					}
					switch (alt181) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)? time= behaviorTime
							{
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:6: ( LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !)?
							int alt180=2;
							int LA180_0 = input.LA(1);
							if ( (LA180_0==LPAREN) ) {
								alt180=1;
							}
							switch (alt180) {
								case 1 :
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1565:8: LPAREN ^ports+= ID ( LITERAL_or !ports+= ID )* RPAREN !
									{
									LPAREN339=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger10193); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									LPAREN339_tree = (BAST)adaptor.create(LPAREN339);
									root_0 = (BAST)adaptor.becomeRoot(LPAREN339_tree, root_0);
									}

									ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10198); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									ports_tree = (BAST)adaptor.create(ports);
									adaptor.addChild(root_0, ports_tree);
									}

									if (list_ports==null) list_ports=new ArrayList<Object>();
									list_ports.add(ports);
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1566:9: ( LITERAL_or !ports+= ID )*
									loop179:
									while (true) {
										int alt179=2;
										int LA179_0 = input.LA(1);
										if ( (LA179_0==LITERAL_or) ) {
											alt179=1;
										}

										switch (alt179) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1566:10: LITERAL_or !ports+= ID
											{
											LITERAL_or340=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchTrigger10210); if (state.failed) return retval;
											ports=(Token)match(input,ID,FOLLOW_ID_in_dispatchTrigger10215); if (state.failed) return retval;
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

									RPAREN341=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dispatchTrigger10229); if (state.failed) return retval;
									}
									break;

							}

							pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger10248);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1573:1: portName : port= ID ^ ( '[' index= NUMBER ']' )? ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1573:9: (port= ID ^ ( '[' index= NUMBER ']' )? )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1574:3: port= ID ^ ( '[' index= NUMBER ']' )?
			{
			root_0 = (BAST)adaptor.nil();


			port=(Token)match(input,ID,FOLLOW_ID_in_portName10269); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			port_tree = (BAST)adaptor.create(port);
			root_0 = (BAST)adaptor.becomeRoot(port_tree, root_0);
			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1575:3: ( '[' index= NUMBER ']' )?
			int alt183=2;
			int LA183_0 = input.LA(1);
			if ( (LA183_0==LBRACKET) ) {
				alt183=1;
			}
			switch (alt183) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1575:5: '[' index= NUMBER ']'
					{
					char_literal342=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_portName10277); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal342_tree = (BAST)adaptor.create(char_literal342);
					adaptor.addChild(root_0, char_literal342_tree);
					}

					index=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_portName10281); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					index_tree = (BAST)adaptor.create(index);
					adaptor.addChild(root_0, index_tree);
					}

					char_literal343=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_portName10283); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1578:1: executeCondition : expression ;
	public final BLESS3Parser.executeCondition_return executeCondition() throws RecognitionException {
		BLESS3Parser.executeCondition_return retval = new BLESS3Parser.executeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		ParserRuleReturnScope expression344 =null;


		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1578:17: ( expression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1579:15: expression
			{
			root_0 = (BAST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_executeCondition10298);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:1: modeCondition : LITERAL_on ^tle= triggerLogicalExpression ;
	public final BLESS3Parser.modeCondition_return modeCondition() throws RecognitionException {
		BLESS3Parser.modeCondition_return retval = new BLESS3Parser.modeCondition_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LITERAL_on345=null;
		ParserRuleReturnScope tle =null;

		BAST LITERAL_on345_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1582:14: ( LITERAL_on ^tle= triggerLogicalExpression )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1583:2: LITERAL_on ^tle= triggerLogicalExpression
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on345=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition10309); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_on345_tree = (BAST)adaptor.create(LITERAL_on345);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_on345_tree, root_0);
			}

			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition10314);
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1586:1: triggerLogicalExpression : first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1586:25: (first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )? -> {op1!=null}? ^( $op1 $first ( $et)+ ) -> $first)
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:3: first= eventTrigger (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			{
			pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10327);
			first=eventTrigger();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_eventTrigger.add(first.getTree());
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:22: (op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)* )?
			int alt185=2;
			int LA185_0 = input.LA(1);
			if ( (LA185_0==LITERAL_and||LA185_0==LITERAL_or||LA185_0==LITERAL_xor) ) {
				alt185=1;
			}
			switch (alt185) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1587:24: op1= logicalOperator et+= eventTrigger (op2= logicalOperator et+= eventTrigger {...}?)*
					{
					pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10333);
					op1=logicalOperator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalOperator.add(op1.getTree());
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10337);
					et=eventTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_eventTrigger.add(et.getTree());
					if (list_et==null) list_et=new ArrayList<Object>();
					list_et.add(et.getTree());
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1588:5: (op2= logicalOperator et+= eventTrigger {...}?)*
					loop184:
					while (true) {
						int alt184=2;
						int LA184_0 = input.LA(1);
						if ( (LA184_0==LITERAL_and||LA184_0==LITERAL_or||LA184_0==LITERAL_xor) ) {
							alt184=1;
						}

						switch (alt184) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1588:6: op2= logicalOperator et+= eventTrigger {...}?
							{
							pushFollow(FOLLOW_logicalOperator_in_triggerLogicalExpression10347);
							op2=logicalOperator();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_logicalOperator.add(op2.getTree());
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression10351);
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
			// 1589:5: -> {op1!=null}? ^( $op1 $first ( $et)+ )
			if (op1!=null) {
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1589:21: ^( $op1 $first ( $et)+ )
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

			else // 1590:5: -> $first
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1597:1: logicalOperator : ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else );
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1598:3: ( LITERAL_and | LITERAL_or | LITERAL_xor | LITERAL_and ! LITERAL_then | LITERAL_or ! LITERAL_else )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1599:3: LITERAL_and
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and346=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10417); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_and346_tree = (BAST)adaptor.create(LITERAL_and346);
					adaptor.addChild(root_0, LITERAL_and346_tree);
					}

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1600:5: LITERAL_or
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or347=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_or347_tree = (BAST)adaptor.create(LITERAL_or347);
					adaptor.addChild(root_0, LITERAL_or347_tree);
					}

					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1601:5: LITERAL_xor
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_xor348=(Token)match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_logicalOperator10429); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_xor348_tree = (BAST)adaptor.create(LITERAL_xor348);
					adaptor.addChild(root_0, LITERAL_xor348_tree);
					}

					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1602:5: LITERAL_and ! LITERAL_then
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_and349=(Token)match(input,LITERAL_and,FOLLOW_LITERAL_and_in_logicalOperator10435); if (state.failed) return retval;
					LITERAL_then350=(Token)match(input,LITERAL_then,FOLLOW_LITERAL_then_in_logicalOperator10438); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LITERAL_then350_tree = (BAST)adaptor.create(LITERAL_then350);
					adaptor.addChild(root_0, LITERAL_then350_tree);
					}

					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1603:5: LITERAL_or ! LITERAL_else
					{
					root_0 = (BAST)adaptor.nil();


					LITERAL_or351=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_logicalOperator10444); if (state.failed) return retval;
					LITERAL_else352=(Token)match(input,LITERAL_else,FOLLOW_LITERAL_else_in_logicalOperator10447); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1606:1: eventTrigger : (tr= modeTrigger | LPAREN ^ triggerLogicalExpression RPAREN );
	public final BLESS3Parser.eventTrigger_return eventTrigger() throws RecognitionException {
		BLESS3Parser.eventTrigger_return retval = new BLESS3Parser.eventTrigger_return();
		retval.start = input.LT(1);

		BAST root_0 = null;

		Token LPAREN353=null;
		Token RPAREN355=null;
		ParserRuleReturnScope tr =null;
		ParserRuleReturnScope triggerLogicalExpression354 =null;

		BAST LPAREN353_tree=null;
		BAST RPAREN355_tree=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1606:13: (tr= modeTrigger | LPAREN ^ triggerLogicalExpression RPAREN )
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1607:3: tr= modeTrigger
					{
					root_0 = (BAST)adaptor.nil();


					pushFollow(FOLLOW_modeTrigger_in_eventTrigger10462);
					tr=modeTrigger();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tr.getTree());

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1608:5: LPAREN ^ triggerLogicalExpression RPAREN
					{
					root_0 = (BAST)adaptor.nil();


					LPAREN353=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger10468); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN353_tree = (BAST)adaptor.create(LPAREN353);
					root_0 = (BAST)adaptor.becomeRoot(LPAREN353_tree, root_0);
					}

					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger10471);
					triggerLogicalExpression354=triggerLogicalExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, triggerLogicalExpression354.getTree());

					RPAREN355=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger10473); if (state.failed) return retval;
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1611:1: internalCondition : LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* ;
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1611:18: ( LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )* )
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1612:2: LITERAL_on ! LITERAL_internal ^ports+= ID ( LITERAL_or !ports+= ID )*
			{
			root_0 = (BAST)adaptor.nil();


			LITERAL_on356=(Token)match(input,LITERAL_on,FOLLOW_LITERAL_on_in_internalCondition10484); if (state.failed) return retval;
			LITERAL_internal357=(Token)match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition10487); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LITERAL_internal357_tree = (BAST)adaptor.create(LITERAL_internal357);
			root_0 = (BAST)adaptor.becomeRoot(LITERAL_internal357_tree, root_0);
			}

			ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10492); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ports_tree = (BAST)adaptor.create(ports);
			adaptor.addChild(root_0, ports_tree);
			}

			if (list_ports==null) list_ports=new ArrayList<Object>();
			list_ports.add(ports);
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1613:3: ( LITERAL_or !ports+= ID )*
			loop188:
			while (true) {
				int alt188=2;
				int LA188_0 = input.LA(1);
				if ( (LA188_0==LITERAL_or) ) {
					alt188=1;
				}

				switch (alt188) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1613:5: LITERAL_or !ports+= ID
					{
					LITERAL_or358=(Token)match(input,LITERAL_or,FOLLOW_LITERAL_or_in_internalCondition10499); if (state.failed) return retval;
					ports=(Token)match(input,ID,FOLLOW_ID_in_internalCondition10504); if (state.failed) return retval;
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

	// $ANTLR start synpred62_BLESS3
	public final void synpred62_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:819:3: ( LASS ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:819:4: LASS ID COLON
		{
		match(input,LASS,FOLLOW_LASS_in_synpred62_BLESS34085); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred62_BLESS34087); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred62_BLESS34089); if (state.failed) return;

		}

	}
	// $ANTLR end synpred62_BLESS3

	// $ANTLR start synpred63_BLESS3
	public final void synpred63_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:5: ( LASS LITERAL_returns )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:820:6: LASS LITERAL_returns
		{
		match(input,LASS,FOLLOW_LASS_in_synpred63_BLESS34100); if (state.failed) return;

		match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_synpred63_BLESS34102); if (state.failed) return;

		}

	}
	// $ANTLR end synpred63_BLESS3

	// $ANTLR start synpred64_BLESS3
	public final void synpred64_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:5: ( LASS PLUS_ARROW )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:821:6: LASS PLUS_ARROW
		{
		match(input,LASS,FOLLOW_LASS_in_synpred64_BLESS34113); if (state.failed) return;

		match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_synpred64_BLESS34115); if (state.failed) return;

		}

	}
	// $ANTLR end synpred64_BLESS3

	// $ANTLR start synpred114_BLESS3
	public final void synpred114_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:986:3: ( LPAREN LITERAL_if )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:986:4: LPAREN LITERAL_if
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred114_BLESS35719); if (state.failed) return;

		match(input,LITERAL_if,FOLLOW_LITERAL_if_in_synpred114_BLESS35721); if (state.failed) return;

		}

	}
	// $ANTLR end synpred114_BLESS3

	// $ANTLR start synpred116_BLESS3
	public final void synpred116_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:5: ( LBRACKET ID COLON )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:988:6: LBRACKET ID COLON
		{
		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred116_BLESS35739); if (state.failed) return;

		match(input,ID,FOLLOW_ID_in_synpred116_BLESS35741); if (state.failed) return;

		match(input,COLON,FOLLOW_COLON_in_synpred116_BLESS35743); if (state.failed) return;

		}

	}
	// $ANTLR end synpred116_BLESS3

	// $ANTLR start synpred117_BLESS3
	public final void synpred117_BLESS3_fragment() throws RecognitionException {
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:5: ( ID LPAREN )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:989:6: ID LPAREN
		{
		match(input,ID,FOLLOW_ID_in_synpred117_BLESS35755); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred117_BLESS35757); if (state.failed) return;

		}

	}
	// $ANTLR end synpred117_BLESS3

	// $ANTLR start synpred180_BLESS3
	public final void synpred180_BLESS3_fragment() throws RecognitionException {
		ParserRuleReturnScope q =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:3: (q= quantity )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1208:3: q= quantity
		{
		pushFollow(FOLLOW_quantity_in_synpred180_BLESS37449);
		q=quantity();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred180_BLESS3

	// $ANTLR start synpred181_BLESS3
	public final void synpred181_BLESS3_fragment() throws RecognitionException {
		Token u=null;
		ParserRuleReturnScope v =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1210:5: (v= valueName u= ID )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1210:5: v= valueName u= ID
		{
		pushFollow(FOLLOW_valueName_in_synpred181_BLESS37471);
		v=valueName();
		state._fsp--;
		if (state.failed) return;

		u=(Token)match(input,ID,FOLLOW_ID_in_synpred181_BLESS37475); if (state.failed) return;

		}

	}
	// $ANTLR end synpred181_BLESS3

	// $ANTLR start synpred182_BLESS3
	public final void synpred182_BLESS3_fragment() throws RecognitionException {
		Token s=null;
		ParserRuleReturnScope v =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:5: (v= valueName s= LITERAL_scalar )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1212:5: v= valueName s= LITERAL_scalar
		{
		pushFollow(FOLLOW_valueName_in_synpred182_BLESS37500);
		v=valueName();
		state._fsp--;
		if (state.failed) return;

		s=(Token)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_synpred182_BLESS37504); if (state.failed) return;

		}

	}
	// $ANTLR end synpred182_BLESS3

	// $ANTLR start synpred183_BLESS3
	public final void synpred183_BLESS3_fragment() throws RecognitionException {
		Token w=null;
		ParserRuleReturnScope v =null;


		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1214:5: (v= valueName w= LITERAL_whole )
		// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/BLESS3.g:1214:5: v= valueName w= LITERAL_whole
		{
		pushFollow(FOLLOW_valueName_in_synpred183_BLESS37530);
		v=valueName();
		state._fsp--;
		if (state.failed) return;

		w=(Token)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_synpred183_BLESS37534); if (state.failed) return;

		}

	}
	// $ANTLR end synpred183_BLESS3

	// Delegated rules

	public final boolean synpred180_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred180_BLESS3_fragment(); // can never throw exception
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
	public final boolean synpred62_BLESS3() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_BLESS3_fragment(); // can never throw exception
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
		"\63\uffff";
	static final String DFA96_eofS =
		"\1\uffff\1\10\3\uffff\1\16\13\uffff\1\10\2\uffff\1\10\5\uffff\1\10\1\uffff"+
		"\1\10\2\uffff\3\10\4\uffff\1\10\2\uffff\3\10\2\uffff\5\10";
	static final String DFA96_minS =
		"\1\63\1\10\1\63\1\u00b1\1\44\1\10\3\uffff\1\47\4\63\1\uffff\1\63\1\47"+
		"\1\10\1\u00b1\1\47\1\10\5\63\1\10\1\44\1\10\2\u00c0\3\10\4\63\1\10\2\u00c0"+
		"\3\10\2\u00c0\5\10";
	static final String DFA96_maxS =
		"\1\u00b1\1\u00d7\1\63\2\u00b1\1\u00d7\3\uffff\1\47\4\63\1\uffff\1\63\1"+
		"\47\1\u00d7\1\u00b1\1\47\1\u00d7\3\63\1\u00af\1\u009f\1\u00d7\1\u00b1"+
		"\1\u00d7\2\u00c0\3\u00d7\1\u00af\1\u009f\1\u00af\1\u009f\1\u00d7\2\u00c0"+
		"\3\u00d7\2\u00c0\5\u00d7";
	static final String DFA96_acceptS =
		"\6\uffff\1\2\1\3\1\4\5\uffff\1\1\44\uffff";
	static final String DFA96_specialS =
		"\63\uffff}>";
	static final String[] DFA96_transitionS = {
			"\1\4\121\uffff\1\3\51\uffff\1\1\1\uffff\1\2",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\2\uffff\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff\1\5\1"+
			"\10\3\uffff\1\10\2\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14\uffff\1\10"+
			"\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff\2\10\2\uffff"+
			"\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10\6\uffff\1\10"+
			"\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff\3\10\5\uffff"+
			"\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff\1\10\1\uffff"+
			"\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10\1\uffff\1\10"+
			"\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff\1\10\10"+
			"\uffff\1\10",
			"\1\11",
			"\1\12",
			"\1\14\2\uffff\1\13\u0089\uffff\1\15",
			"\3\16\1\10\4\uffff\1\10\1\16\4\uffff\3\16\1\uffff\3\16\2\uffff\1\16"+
			"\2\uffff\1\16\2\10\2\16\5\uffff\1\16\1\10\1\16\1\uffff\2\16\1\uffff\2"+
			"\16\3\uffff\1\16\1\10\1\uffff\1\16\2\uffff\1\16\1\uffff\1\16\14\uffff"+
			"\1\16\2\uffff\1\16\3\uffff\3\16\1\uffff\1\16\4\uffff\5\16\1\uffff\2\16"+
			"\2\uffff\4\16\2\uffff\1\16\3\uffff\1\16\5\uffff\1\16\1\uffff\1\16\6\uffff"+
			"\1\16\5\uffff\1\16\1\uffff\1\16\2\uffff\1\16\3\uffff\3\16\5\uffff\1\16"+
			"\5\uffff\1\16\4\uffff\1\16\1\uffff\1\16\2\uffff\1\16\1\10\1\16\2\uffff"+
			"\1\16\1\uffff\1\16\3\uffff\1\16\2\uffff\1\16\1\uffff\1\16\4\uffff\1\16"+
			"\1\uffff\1\10\4\16\2\uffff\1\16\1\uffff\1\16\4\uffff\2\10\1\16\10\uffff"+
			"\1\16",
			"",
			"",
			"",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"",
			"\1\24",
			"\1\25",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\2\uffff\2\10\1\26\4\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\2\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14\uffff"+
			"\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff\2\10"+
			"\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff\3\10"+
			"\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff\1\10"+
			"\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10\1\uffff"+
			"\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff\1\10"+
			"\10\uffff\1\10",
			"\1\15",
			"\1\27",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\31\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\30\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\36\173\uffff\1\35",
			"\1\37\74\uffff\1\41\56\uffff\1\40",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\43\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\42\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\1\14\u008c\uffff\1\15",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\45\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\44\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\1\46",
			"\1\46",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\31\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\30\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\31\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\30\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\31\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\30\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\1\50\173\uffff\1\47",
			"\1\51\74\uffff\1\53\56\uffff\1\52",
			"\1\55\173\uffff\1\54",
			"\1\56\74\uffff\1\60\56\uffff\1\57",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\31\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\30\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\1\61",
			"\1\61",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\43\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\42\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\43\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\42\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\43\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\42\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\1\62",
			"\1\62",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\45\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\44\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\45\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\44\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\45\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\44\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\43\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\42\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10",
			"\3\10\6\uffff\1\10\4\uffff\3\10\1\uffff\3\10\2\uffff\1\10\2\uffff\1"+
			"\10\1\uffff\1\45\2\10\5\uffff\1\10\1\uffff\1\10\1\uffff\2\10\1\uffff"+
			"\1\5\1\10\3\uffff\1\10\1\44\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\14"+
			"\uffff\1\10\2\uffff\1\10\3\uffff\3\10\1\uffff\1\10\4\uffff\5\10\1\uffff"+
			"\2\10\2\uffff\4\10\2\uffff\1\10\3\uffff\1\10\5\uffff\1\10\1\uffff\1\10"+
			"\6\uffff\1\10\3\uffff\1\6\1\uffff\1\10\1\uffff\1\10\2\uffff\1\10\3\uffff"+
			"\3\10\5\uffff\1\10\5\uffff\1\10\4\uffff\1\10\1\uffff\1\10\1\7\1\uffff"+
			"\1\10\1\uffff\1\10\2\uffff\1\10\1\uffff\1\10\3\uffff\1\10\2\uffff\1\10"+
			"\1\uffff\1\10\4\uffff\1\10\2\uffff\4\10\2\uffff\1\10\1\uffff\1\10\6\uffff"+
			"\1\10\10\uffff\1\10"
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
			return "1138:1: quantity : (num= aNumber u= ID -> ^( QUANTITY[$u,\"QUANTITY\"] $num $u) |num= aNumber scalar= LITERAL_scalar -> ^( QUANTITY[$scalar,\"QUANTITY\"] $num $scalar) |num= aNumber whole= LITERAL_whole -> ^( QUANTITY[$whole,\"QUANTITY\"] $num $whole) |num= aNumber -> ^( QUANTITY[\"QUANTITY\"] $num) );";
		}
	}

	public static final BitSet FOLLOW_ID_in_propertyName2067 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_propertyName2071 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_propertyName2075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_componentName2108 = new BitSet(new long[]{0x0000009000000002L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_componentName2114 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_componentName2118 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_componentName2122 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_componentName2126 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_DOT_in_componentName2137 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_componentName2141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_modeTrigger2237 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_DOT_in_modeTrigger2241 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_modeTrigger2244 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_DOT_in_modeTrigger2248 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_modeTrigger2250 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_ID_in_identifier2271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitDeclaration_in_unitLibrary2294 = new BitSet(new long[]{0x0008000400000002L,0x0000000008000010L});
	public static final BitSet FOLLOW_LT_in_unitName2334 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2339 = new BitSet(new long[]{0x0009000000000000L});
	public static final BitSet FOLLOW_GT_in_unitName2343 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitName2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_unitFormula2383 = new BitSet(new long[]{0x0008000400000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2390 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2394 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula2433 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula2437 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration2471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration2475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration2494 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration2500 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration2506 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration2510 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_rootDeclaration2513 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration2520 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration2524 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_rootDeclaration2527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension2578 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitExtension2583 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension2587 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_unitExtension2590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor2624 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000020000000000L});
	public static final BitSet FOLLOW_unitName_in_unitFactor2628 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_mulDiv_in_unitFactor2632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor2636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary2676 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration2689 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration2694 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LITERAL_is_in_typeDeclaration2696 = new BitSet(new long[]{0x0000000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration2701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationType_in_type2713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type2719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type2725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type2737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type2743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type2749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference2767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_enumerationType2783 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationType2788 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_enumerationType2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType2807 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000002000000010L});
	public static final BitSet FOLLOW_ID_in_quantityType2817 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType2823 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType2829 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_quantityType2837 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2842 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType2846 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_quantityType2853 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001002L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType2863 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2868 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType2883 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_propertyName_in_quantityType2888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType2907 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayType2910 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType2915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayType2917 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType2920 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType2924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2940 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList2944 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2949 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList2953 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2958 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2978 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange2982 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_recordType3001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_recordType3017 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_recordField_in_recordType3022 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_recordType3025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_recordField3043 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_recordField3045 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField3050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary3070 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary3079 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables3112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_LITERAL_variables_in_ghostVariables3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables3120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable3133 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_ghostVariable3139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_TILDE_in_ghostVariable3141 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable3146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namedAssertion3163 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3171 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3173 = new BitSet(new long[]{0x0008000001000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion3188 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_COLON_in_namedAssertion3208 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion3213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion3233 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion3237 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ASSIGN_in_namedAssertion3239 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion3273 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion3277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_RASS_in_namedAssertion3295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_predicate3655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variableList3676 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3680 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3685 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList3689 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_variable_in_variableList3694 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ID_in_variable3712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_TILDE_in_variable3714 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable3719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue3730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue3736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_conditionalAssertionFunction3751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction3755 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_COMMA_in_conditionalAssertionFunction3759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction3763 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_conditionalAssertionFunction3768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionValuePair3797 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair3800 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair3802 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3821 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration3825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3852 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3856 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration3862 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3866 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_assertionEnumeration3870 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3874 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ID_in_enumerationPair3911 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair3913 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair3916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue3932 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessAssertion3952 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessAssertion3958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessFunction3988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction3992 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction3996 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ASSIGN_in_namelessFunction3998 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction4002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessFunction4004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_namelessEnumeration4045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_namelessEnumeration4049 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration4053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_RASS_in_namelessEnumeration4055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion4093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion4106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion4119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion4125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_invocation4139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_invocation4141 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L,0x0000000000000020L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4151 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_invocation4155 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation4159 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_expression_in_invocation4173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_invocation4178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_actualParameter4214 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_actualParameter4216 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_actualParameter4221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression4247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression4255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression4263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression4271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_disjunction_in_expression4279 = new BitSet(new long[]{0x0000000000000002L,0x0000030000000000L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression4284 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression4289 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_disjunction_in_expression4295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification4311 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification4315 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalQuantification4326 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_range_in_universalQuantification4330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_which_in_universalQuantification4336 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification4351 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification4355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification4451 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification4455 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_existentialQuantification4466 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_range_in_existentialQuantification4470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_which_in_existentialQuantification4476 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification4491 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification4495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification4591 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification4595 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_sumQuantification4606 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_range_in_sumQuantification4610 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_sumQuantification4616 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_sumQuantification4620 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification4631 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_sumQuantification4635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification4731 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification4735 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_productQuantification4746 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_range_in_productQuantification4750 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_which_in_productQuantification4756 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_productQuantification4760 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification4771 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_productQuantification4775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification4871 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification4875 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_countingQuantification4886 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_range_in_countingQuantification4890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_which_in_countingQuantification4896 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_predicate_in_countingQuantification4900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification4911 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_countingQuantification4915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_logicVariables5011 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5015 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5020 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables5024 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_variable_in_logicVariables5029 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5051 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5068 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5073 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5077 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5082 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5106 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5111 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction5115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction5118 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5123 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5144 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction5153 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_conjunction_in_disjunction5158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_relation_in_conjunction5182 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5192 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_relation_in_conjunction5197 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5201 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_relation_in_conjunction5206 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5224 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_relation_in_conjunction5229 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction5233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction5236 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_relation_in_conjunction5241 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_addSub_in_relation5262 = new BitSet(new long[]{0x0001100000000302L,0x0000040000000000L,0x0084420000000000L});
	public static final BitSet FOLLOW_relationSymbol_in_relation5272 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_addSub_in_relation5275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation5289 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_range_in_relation5292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_range5307 = new BitSet(new long[]{0x0000006018000000L});
	public static final BitSet FOLLOW_rangeSymbol_in_range5309 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_subexpression_in_range5312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multDiv_in_addSub5322 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020100000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5334 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_multDiv_in_addSub5337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_PLUS_in_addSub5341 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_multDiv_in_addSub5344 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_MINUS_in_addSub5363 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_multDiv_in_addSub5366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5386 = new BitSet(new long[]{0x0000000400000002L,0x0002000000100000L,0x0000000000000001L,0x0000000000004000L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5398 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5405 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5408 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_dividers_in_multDiv5426 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5472 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5476 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5498 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002810001500020L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5527 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002810001500020L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5556 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002810001500020L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5585 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002810001500020L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_subexpression5611 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002810001500020L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5678 = new BitSet(new long[]{0x0000000000820002L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5686 = new BitSet(new long[]{0x1208000000000010L,0x0038000010000000L,0x0002910003500028L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5689 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5697 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression5780 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000400L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_QQ_in_parenthesizedSubexpression5797 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5800 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_parenthesizedSubexpression5802 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression5805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression5823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression5831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression5841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression5844 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_caseChoice5860 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_caseChoice5865 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_IMP_in_caseChoice5867 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_caseChoice5872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_caseChoice5874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression5890 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_if_in_conditionalExpression5892 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_then_in_conditionalExpression5898 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_else_in_conditionalExpression5904 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression5908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression5912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_recordTerm5959 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_recordTerm5963 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_recordTerm5965 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm5969 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_recordTerm5972 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_recordValue6009 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6011 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002800001500020L});
	public static final BitSet FOLLOW_value_in_recordValue6014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_recordValue6018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_periodShift6041 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002810001500020L});
	public static final BitSet FOLLOW_value_in_periodShift6054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift6068 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift6072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift6076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6158 = new BitSet(new long[]{0x0000000000000002L,0x0002000000100000L,0x0020100000000001L,0x0000000000004000L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6166 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6179 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6192 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6205 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6218 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6225 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6228 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6241 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6244 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6248 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6268 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange6272 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange6275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationValue_in_value6331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6346 = new BitSet(new long[]{0x0200001800000002L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_valueName6364 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_valueName6372 = new BitSet(new long[]{0x0200001000000002L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6384 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6390 = new BitSet(new long[]{0x0200001000000002L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6400 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_valueName6406 = new BitSet(new long[]{0x0200001000000002L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_valueName6422 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6426 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_DOT_in_valueName6430 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_partialName_in_valueName6434 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6451 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6463 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_valueName6492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6706 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6710 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6715 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters6722 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters6727 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair6745 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair6753 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair6758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName6771 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6781 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName6787 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName6794 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x0002910001500020L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName6798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_partialName6800 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_quantity_in_constant6848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant6856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant6864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant6872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant6880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonNumericProperty_in_constant6888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_nonNumericProperty6900 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002000000000020L});
	public static final BitSet FOLLOW_propertyValue_in_nonNumericProperty6905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RCON_in_nonNumericProperty6907 = new BitSet(new long[]{0x0000000000000000L,0xA020000000800042L,0x0000000208002000L});
	public static final BitSet FOLLOW_type_in_nonNumericProperty6911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity6927 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity6931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity6961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity6965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity6996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aNumber_in_quantity7029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyValue_in_aNumber7067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_propertyValue7081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyName_in_propertyValue7088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7100 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7105 = new BitSet(new long[]{0x0200001000000002L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7116 = new BitSet(new long[]{0x0200001000000002L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7128 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7133 = new BitSet(new long[]{0x0200001000000002L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7144 = new BitSet(new long[]{0x0200001000000002L});
	public static final BitSet FOLLOW_componentName_in_propertyReference7154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7160 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7165 = new BitSet(new long[]{0x0200001000000002L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7177 = new BitSet(new long[]{0x0200001000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7192 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ID_in_propertyField7204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_propertyField7213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_propertyField7221 = new BitSet(new long[]{0x0008000000000000L,0x0001000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_propertyField7228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause7260 = new BitSet(new long[]{0x0800000000000000L,0x0C00200000010004L,0x0000000000080000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause7267 = new BitSet(new long[]{0x0800000000000000L,0x0C00200000010004L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause7275 = new BitSet(new long[]{0x0800000000000000L,0x0C00200000010000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause7286 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7290 = new BitSet(new long[]{0x0800000000000000L,0x0400200000010000L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause7301 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7305 = new BitSet(new long[]{0x0800000000000000L,0x0000200000010000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause7317 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause7321 = new BitSet(new long[]{0x0800000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause7331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause7404 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_throwsClause7409 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause7424 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause7427 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime7449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7471 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_behaviorTime7475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_behaviorTime7504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_behaviorTime7534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime7559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause7588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause7591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm7604 = new BitSet(new long[]{0x2008000000000000L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm7613 = new BitSet(new long[]{0x0008000001000000L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm7618 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm7624 = new BitSet(new long[]{0x0008000000000000L,0x00000001E1002000L,0x0000000400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm7628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm7630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables7642 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables7645 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration7659 = new BitSet(new long[]{0x0100000000010002L,0x0004000400004000L,0x0000000000000280L,0x0000000000000080L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration7670 = new BitSet(new long[]{0x0100000000010002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration7680 = new BitSet(new long[]{0x0100000000010002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration7690 = new BitSet(new long[]{0x0100000000010002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration7700 = new BitSet(new long[]{0x0100000000010002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration7710 = new BitSet(new long[]{0x0100000000010002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration7724 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration7728 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration7738 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration7747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7856 = new BitSet(new long[]{0x0000000000000402L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7869 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions7878 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7883 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7902 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7907 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions7911 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions7915 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7938 = new BitSet(new long[]{0x0808000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_action_in_assertedAction7947 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_assertion_in_assertedAction7953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_basicAction_in_action8069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction8151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_computation_in_basicAction8179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_assignment8204 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment8206 = new BitSet(new long[]{0xB208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment8209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8221 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_valueName_in_simultaneousAssignment8227 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8231 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_valueName_in_simultaneousAssignment8235 = new BitSet(new long[]{0x0000000004010000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8239 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_valueName_in_simultaneousAssignment8243 = new BitSet(new long[]{0x0000000004010000L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment8251 = new BitSet(new long[]{0xB208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8257 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8261 = new BitSet(new long[]{0xB208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8265 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment8269 = new BitSet(new long[]{0xB208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment8273 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_VERT_in_simultaneousAssignment8280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny8326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny8330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow8342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow8345 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_whenThrow8349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow8351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow8353 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow8357 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow8365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation8386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8389 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8394 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8396 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8401 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8403 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation8422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8425 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8430 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8432 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8437 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8439 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation8457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8460 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8465 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8467 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8472 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8474 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation8492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8495 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8500 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8502 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_combinableOperation8507 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8509 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation8527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_combinableOperation8530 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8535 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8537 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8542 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_combinableOperation8544 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation8549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_combinableOperation8551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction8566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction8576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction8586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation8602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_computation8605 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8610 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_COMMA_in_computation8614 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_behaviorTime_in_computation8619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_computation8624 = new BitSet(new long[]{0x0000000000000002L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_computation8633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation8636 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_componentName_in_computation8641 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_ID_in_subprogramCall8659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_subprogramCall8661 = new BitSet(new long[]{0x0208000000000010L,0x0020000010000000L,0x0002810001000020L,0x0000000000000020L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall8665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_subprogramCall8668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8699 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8703 = new BitSet(new long[]{0x0208000000000010L,0x0020000010000000L,0x0002810001000020L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8706 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList8710 = new BitSet(new long[]{0x0208000000000010L,0x0020000010000000L,0x0002810001000020L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList8713 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_ID_in_formalActual8735 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_formalActual8743 = new BitSet(new long[]{0x0208000000000010L,0x0020000010000000L,0x0002810001000020L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual8751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter8762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter8767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter8772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portOutput8788 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_EXCLAMATION_in_portOutput8790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_portOutput8794 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_portOutput8798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_portOutput8800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portInput8846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
	public static final BitSet FOLLOW_QUESTION_in_portInput8848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_portInput8850 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_valueName_in_portInput8855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_portInput8857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative8898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8906 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_BOX_in_alternative8912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_guardedAction_in_alternative8916 = new BitSet(new long[]{0x0000000000400000L,0x0000000200000000L});
	public static final BitSet FOLLOW_LITERAL_fi_in_alternative8924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_guardedAction8962 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_guardedAction8966 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction8968 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction8971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop8995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileLoop9001 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_whileLoop9006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_whileLoop9008 = new BitSet(new long[]{0x0800000000000000L,0x0000200000010080L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_whileLoop9015 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_whileLoop9019 = new BitSet(new long[]{0x0800000000000000L,0x0000000000010080L});
	public static final BitSet FOLLOW_LITERAL_bound_in_whileLoop9028 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_whileLoop9033 = new BitSet(new long[]{0x0800000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop9044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop9102 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifier_in_forLoop9109 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop9114 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_forLoop9119 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_forLoop9121 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_forLoop9126 = new BitSet(new long[]{0x0800000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_forLoop9133 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_forLoop9137 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LCURLY_in_forLoop9144 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop9149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_forLoop9151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop9214 = new BitSet(new long[]{0x0908000000000000L,0x00002099E1212080L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_doUntilLoop9221 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop9225 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212080L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_LITERAL_bound_in_doUntilLoop9234 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9239 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop9250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop9256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_doUntilLoop9258 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop9263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_doUntilLoop9265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification9332 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification9339 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification9345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification9347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification9355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification9380 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification9389 = new BitSet(new long[]{0x0008000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification9394 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9398 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_universalLatticeQuantification9400 = new BitSet(new long[]{0x3208000000000010L,0x1078000012000000L,0x0002910003504028L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification9404 = new BitSet(new long[]{0x0800000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification9413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_issueException9465 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_issueException9469 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_issueException9480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause9494 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000004L,0x0000000100800800L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause9501 = new BitSet(new long[]{0x0000000000000002L,0x0000200000000000L,0x0000000100800800L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause9510 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100800800L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause9517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800800L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause9524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause9531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause9574 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_assertion_in_invariantClause9577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection9589 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection9594 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection9606 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection9611 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_identifier_in_behaviorState9628 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorState9633 = new BitSet(new long[]{0x0000000000000000L,0x0000080400001000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState9638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState9644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState9650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState9656 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_assertion_in_behaviorState9660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorState9663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions9724 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions9728 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition9773 = new BitSet(new long[]{0x0200000001000000L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition9777 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_behaviorTransition9780 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9788 = new BitSet(new long[]{0x0400000004000000L});
	public static final BitSet FOLLOW_COMMA_in_behaviorTransition9792 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9797 = new BitSet(new long[]{0x0400000004000000L});
	public static final BitSet FOLLOW_LCON_in_behaviorTransition9806 = new BitSet(new long[]{0x3208000000000010L,0x1178000012000000L,0x0002910003504028L,0x0000000000000002L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition9810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RCON_in_behaviorTransition9813 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_identifier_in_behaviorTransition9820 = new BitSet(new long[]{0x0800080000000000L});
	public static final BitSet FOLLOW_LCURLY_in_behaviorTransition9827 = new BitSet(new long[]{0x0908000000000000L,0x00000099E1212000L,0x0000001400008140L,0x0000000000800000L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition9831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_behaviorTransition9833 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_EMPTY_CURLY_in_behaviorTransition9837 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition9845 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorTransition9850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_priority10012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_priority10015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_priority10017 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition10032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition10036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition10040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition10044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_dispatchCondition10056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition10059 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition10064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10082 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10086 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10091 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression10099 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression10104 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10127 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10136 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10141 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction10151 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction10156 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger10174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger10182 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000000L,0x0002810000000020L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger10193 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10198 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchTrigger10210 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger10215 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_dispatchTrigger10229 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0002800000000020L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger10248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_portName10269 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_portName10277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_portName10281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_portName10283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_executeCondition10298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition10309 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition10314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10327 = new BitSet(new long[]{0x4000000000000002L,0x0200000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10333 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10337 = new BitSet(new long[]{0x4000000000000002L,0x0200000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_logicalOperator_in_triggerLogicalExpression10347 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression10351 = new BitSet(new long[]{0x4000000000000002L,0x0200000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10417 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_xor_in_logicalOperator10429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_logicalOperator10435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_then_in_logicalOperator10438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_logicalOperator10444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_else_in_logicalOperator10447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeTrigger_in_eventTrigger10462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger10468 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger10471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger10473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_internalCondition10484 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition10487 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10492 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_internalCondition10499 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_internalCondition10504 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_LASS_in_synpred62_BLESS34085 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred62_BLESS34087 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_synpred62_BLESS34089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_synpred63_BLESS34100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_synpred63_BLESS34102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LASS_in_synpred64_BLESS34113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_synpred64_BLESS34115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred114_BLESS35719 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_LITERAL_if_in_synpred114_BLESS35721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred116_BLESS35739 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred116_BLESS35741 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_synpred116_BLESS35743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred117_BLESS35755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred117_BLESS35757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_synpred180_BLESS37449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_synpred181_BLESS37471 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_synpred181_BLESS37475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_synpred182_BLESS37500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_synpred182_BLESS37504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_synpred183_BLESS37530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_synpred183_BLESS37534 = new BitSet(new long[]{0x0000000000000002L});
}
