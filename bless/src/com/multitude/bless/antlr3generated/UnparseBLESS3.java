// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g 2024-01-27 21:18:25

//copyright 2023 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.exceptions.BLESSmarker;
import com.multitude.bless.app.Global;
import com.multitude.aadl.bless.maps.BlessMaps;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class UnparseBLESS3 extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public UnparseBLESS3(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public UnparseBLESS3(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("UnparseBLESS3Templates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return UnparseBLESS3.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g"; }


	public static int countUnparserErrors = 0; //accumulates count of recognition errors
	public static boolean recognitionErrorOccurred = false;    //did a parse error occur?
	public static boolean suppressRecognitionException = false;  //inhibit report error of RecognitionException 
	//public static StringTemplateGroup templates=null;	//templates currently used by UnparseBLESS
	public static boolean lookUpPropertyValues = false;  //look up AADL property values when unparsing rather than name
	public static String singletonName = "";	//Slang name for AADL component hving subprogram subcomponents

	//public boolean SAL=false;  //are we unparsing to SAL?

	public String componentName = "";

	 int startingLine = 0; //starting line of sublanguage in AADL file

	  public  void 
	setStartingLine(int line) //sets starting line
	  {
	  startingLine = line;
	  }

	public  int
	getStartingLine()
	  {
	  return startingLine;
	  }
	  

	//ANTLR string template magic
	  public static StringTemplate 
	template(String name) 
	  {
	  return Global.templates.getInstanceOf(name);
	  }

	  public static StringTemplate 
	text(String t) 
	  {
	  return new StringTemplate(Global.templates,t);
	  }

		  public void 
		reportError(Exception ex)
		  {
		  if (!suppressRecognitionException)
		    {
		    if (countUnparserErrors<Global.UnparserReportLimit)
		      {
		      if (ex instanceof RecognitionException)
		        {
		        RecognitionException re = (RecognitionException)ex;
	  	      Dump.it(getErrorHeader(re));
		        recognitionErrorOccurred = true;
		        re.line = re.line+startingLine;
		        super.reportError(re);
		        }
	        Dump.it(ex);
		      ex.printStackTrace();
		      }
		    }
		  if (countUnparserErrors > Global.YouIdiotReportLimit)
	      {
	      int x = 5;
	      Dump.it(countUnparserErrors+" unparser errors occurred; divide by zero to stop runaway unparser");
	      x=(x+x)/(x-5);
	      }
	  } //end of reportError

	static int typeNameNumber = 0;	//counts type names created


	static StringTemplate getNextTypeID()
		{
		typeNameNumber++;
		return text(makeIntoString(typeNameNumber));
		}

	public static String makeIntoString(int i)
		{
		return Integer.toString(i);
		}

	static StringTemplate  getPackageName()
		{
		return text(Global.packageOrPropertySetID);
		}

	  static StringTemplate slang_simultaneous_assignment(List<Object> l, List<Object> r)
	    {
	    String spaces = "    ";
	    StringBuffer sb = new StringBuffer();
	    sb.append("//simultaneous assignment\n");
	    sb.append(spaces+"//assign to fresh values\n");
	    for (int i=0;i<l.size();i++)
	      {
	      String lhs = ((StringTemplate)l.get(i)).toString().replace("'", "");
	      String rhs = ((StringTemplate)r.get(i)).toString();
	      sb.append(spaces+"val new_"+lhs+" = "+rhs+"\n");
	      }
	    sb.append(spaces+"//copy to variables\n");
	    for (int i=0;i<l.size();i++)
	      {
	      String lhs = ((StringTemplate)l.get(i)).toString().replace("'", "");
	      sb.append(spaces+lhs+" = new_"+lhs+"\n");
	      }
	    return text(sb.toString());
	    }

	static StringTemplate  makeDimensionFromRange(StringTemplate l, StringTemplate r)
		{
		String l_value = l.toString();
		int l_int = 0;
		try
			{
			l_int = Integer.decode(l_value).intValue();
			}
		catch (NumberFormatException ex)
			{
			//look up the value of the ID or enumeration literal
			//otherwise leave as 0
			}	
		String r_value = r.toString();
		int r_int = 1;
		try
			{
			r_int = Integer.decode(r_value).intValue();
			}
		catch (NumberFormatException ex)
			{
			//look up the value of the ID or enumeration literal
			//otherwise use length of string
			r_int = r_value.length();
			}	
		int dimension = r_int-l_int;
		return text(makeIntoString(dimension));
		}  //end of makeDimensionFromRange
		
	static StringTemplate getAadlPropertyValue(BAST dc)
		  {
	//	  if (!dc.hasType(DOUBLE_COLON))
	//	    return text("parameter to UnparseBLESS.getAadlPropertyValue must have root DOUBLE_COLON");
		  return text(Global.getAadlPropertyValue(dc.getChild(0).getText(),dc.getChild(1).getText()));
		  }  //end of getAadlPropertyValue
		  
	  
	static StringTemplate getSlangFunctionCall(String functionID)
	  {
	  return text(singletonName+"_subprograms."+functionID);
	  }
	  

	  


	public static class identifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "identifier"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:210:1: identifier : word= ID -> {%{$word.text}};
	public final UnparseBLESS3.identifier_return identifier() throws RecognitionException {
		UnparseBLESS3.identifier_return retval = new UnparseBLESS3.identifier_return();
		retval.start = input.LT(1);

		BAST word=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:211:2: (word= ID -> {%{$word.text}})
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:212:2: word= ID
			{
			word=(BAST)match(input,ID,FOLLOW_ID_in_identifier66); 
			// TEMPLATE REWRITE
			// 213:3: -> {%{$word.text}}
			{
				retval.st = new StringTemplate(templateLib,(word!=null?word.getText():null));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class propertyName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:216:1: propertyName : ^( DOUBLE_COLON ps= ID p= ID ) -> property_name(ps=$ps.textp=$p.text);
	public final UnparseBLESS3.propertyName_return propertyName() throws RecognitionException {
		UnparseBLESS3.propertyName_return retval = new UnparseBLESS3.propertyName_return();
		retval.start = input.LT(1);

		BAST ps=null;
		BAST p=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:217:3: ( ^( DOUBLE_COLON ps= ID p= ID ) -> property_name(ps=$ps.textp=$p.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:218:3: ^( DOUBLE_COLON ps= ID p= ID )
			{
			match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_propertyName89); 
			match(input, Token.DOWN, null); 
			ps=(BAST)match(input,ID,FOLLOW_ID_in_propertyName93); 
			p=(BAST)match(input,ID,FOLLOW_ID_in_propertyName97); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 219:5: -> property_name(ps=$ps.textp=$p.text)
			{
				retval.st = templateLib.getInstanceOf("property_name",new STAttrMap().put("ps", (ps!=null?ps.getText():null)).put("p", (p!=null?p.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyName"


	public static class componentName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "componentName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:222:1: componentName : ( ^( DOUBLE_COLON (ci+= ID )+ ^( DOT imp= ID ) ) -> component_name(ci=$ciimp=$imp.text)| ^( DOUBLE_COLON (ci+= ID )+ ) -> component_name(ci=$ci)| ^(id= ID ^( DOT imp= ID ) ) -> component_name(ci=$id.textimp=$imp.text)|id= ID -> {%{$id.text}});
	public final UnparseBLESS3.componentName_return componentName() throws RecognitionException {
		UnparseBLESS3.componentName_return retval = new UnparseBLESS3.componentName_return();
		retval.start = input.LT(1);

		BAST imp=null;
		BAST id=null;
		BAST ci=null;
		List<Object> list_ci=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:223:3: ( ^( DOUBLE_COLON (ci+= ID )+ ^( DOT imp= ID ) ) -> component_name(ci=$ciimp=$imp.text)| ^( DOUBLE_COLON (ci+= ID )+ ) -> component_name(ci=$ci)| ^(id= ID ^( DOT imp= ID ) ) -> component_name(ci=$id.textimp=$imp.text)|id= ID -> {%{$id.text}})
			int alt3=4;
			alt3 = dfa3.predict(input);
			switch (alt3) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:224:3: ^( DOUBLE_COLON (ci+= ID )+ ^( DOT imp= ID ) )
					{
					match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_componentName133); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:224:20: (ci+= ID )+
					int cnt1=0;
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( (LA1_0==ID) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:224:20: ci+= ID
							{
							ci=(BAST)match(input,ID,FOLLOW_ID_in_componentName137); 
							if (list_ci==null) list_ci=new ArrayList<Object>();
							list_ci.add(ci);
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							throw eee;
						}
						cnt1++;
					}

					match(input,DOT,FOLLOW_DOT_in_componentName141); 
					match(input, Token.DOWN, null); 
					imp=(BAST)match(input,ID,FOLLOW_ID_in_componentName145); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 225:5: -> component_name(ci=$ciimp=$imp.text)
					{
						retval.st = templateLib.getInstanceOf("component_name",new STAttrMap().put("ci", list_ci).put("imp", (imp!=null?imp.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:227:3: ^( DOUBLE_COLON (ci+= ID )+ )
					{
					match(input,DOUBLE_COLON,FOLLOW_DOUBLE_COLON_in_componentName175); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:227:20: (ci+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:227:20: ci+= ID
							{
							ci=(BAST)match(input,ID,FOLLOW_ID_in_componentName179); 
							if (list_ci==null) list_ci=new ArrayList<Object>();
							list_ci.add(ci);
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 228:5: -> component_name(ci=$ci)
					{
						retval.st = templateLib.getInstanceOf("component_name",new STAttrMap().put("ci", list_ci));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:230:3: ^(id= ID ^( DOT imp= ID ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_componentName206); 
					match(input, Token.DOWN, null); 
					match(input,DOT,FOLLOW_DOT_in_componentName209); 
					match(input, Token.DOWN, null); 
					imp=(BAST)match(input,ID,FOLLOW_ID_in_componentName213); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 231:5: -> component_name(ci=$id.textimp=$imp.text)
					{
						retval.st = templateLib.getInstanceOf("component_name",new STAttrMap().put("ci", (id!=null?id.getText():null)).put("imp", (imp!=null?imp.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:233:3: id= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_componentName244); 
					// TEMPLATE REWRITE
					// 234:5: -> {%{$id.text}}
					{
						retval.st = new StringTemplate(templateLib,(id!=null?id.getText():null));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "componentName"


	public static class modeTrigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "modeTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:237:1: modeTrigger : ^( DOT (mt+= ID )+ ) -> mode_trigger(mt=$mt);
	public final UnparseBLESS3.modeTrigger_return modeTrigger() throws RecognitionException {
		UnparseBLESS3.modeTrigger_return retval = new UnparseBLESS3.modeTrigger_return();
		retval.start = input.LT(1);

		BAST mt=null;
		List<Object> list_mt=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:238:3: ( ^( DOT (mt+= ID )+ ) -> mode_trigger(mt=$mt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:239:3: ^( DOT (mt+= ID )+ )
			{
			match(input,DOT,FOLLOW_DOT_in_modeTrigger269); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:239:11: (mt+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:239:11: mt+= ID
					{
					mt=(BAST)match(input,ID,FOLLOW_ID_in_modeTrigger273); 
					if (list_mt==null) list_mt=new ArrayList<Object>();
					list_mt.add(mt);
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 240:5: -> mode_trigger(mt=$mt)
			{
				retval.st = templateLib.getInstanceOf("mode_trigger",new STAttrMap().put("mt", list_mt));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modeTrigger"


	public static class unitName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:252:1: unitName : ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname);
	public final UnparseBLESS3.unitName_return unitName() throws RecognitionException {
		UnparseBLESS3.unitName_return retval = new UnparseBLESS3.unitName_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST longname=null;
		List<Object> list_longname=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:253:3: ( ^( UNIT_NAME id= ID (longname+= ID )* ) -> unit_name(id=$id.textlongname=$longname))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:254:3: ^( UNIT_NAME id= ID (longname+= ID )* )
			{
			match(input,UNIT_NAME,FOLLOW_UNIT_NAME_in_unitName315); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_unitName319); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:254:30: (longname+= ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:254:30: longname+= ID
					{
					longname=(BAST)match(input,ID,FOLLOW_ID_in_unitName323); 
					if (list_longname==null) list_longname=new ArrayList<Object>();
					list_longname.add(longname);
					}
					break;

				default :
					break loop5;
				}
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 255:5: -> unit_name(id=$id.textlongname=$longname)
			{
				retval.st = templateLib.getInstanceOf("unit_name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("longname", list_longname));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitName"


	public static class unitFormula_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitFormula"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:258:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom));
	public final UnparseBLESS3.unitFormula_return unitFormula() throws RecognitionException {
		UnparseBLESS3.unitFormula_return retval = new UnparseBLESS3.unitFormula_return();
		retval.start = input.LT(1);

		BAST top=null;
		BAST bottom=null;
		List<Object> list_top=null;
		List<Object> list_bottom=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:259:3: ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom))
			int alt10=3;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:260:3: ^( UNIT_FORMULA (top+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula363); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:260:22: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:260:22: top+= ID
							{
							top=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula367); 
							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 261:5: -> unit_formula(top=$top)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:263:3: ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula393); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:263:22: (top+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:263:22: top+= ID
							{
							top=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula397); 
							if (list_top==null) list_top=new ArrayList<Object>();
							list_top.add(top);
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula400); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:263:41: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:263:41: bottom+= ID
							{
							bottom=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula404); 
							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 264:5: -> unit_formula(top=$topbottom=$bottom)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("top", list_top).put("bottom", list_bottom));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:266:3: ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ )
					{
					match(input,UNIT_FORMULA,FOLLOW_UNIT_FORMULA_in_unitFormula435); 
					match(input, Token.DOWN, null); 
					match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFormula437); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:266:32: (bottom+= ID )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:266:32: bottom+= ID
							{
							bottom=(BAST)match(input,ID,FOLLOW_ID_in_unitFormula441); 
							if (list_bottom==null) list_bottom=new ArrayList<Object>();
							list_bottom.add(bottom);
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 267:5: -> unit_formula(bottom=$bottom)
					{
						retval.st = templateLib.getInstanceOf("unit_formula",new STAttrMap().put("bottom", list_bottom));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitFormula"


	public static class unitDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:270:1: unitDeclaration : ( rootDeclaration | unitExtension );
	public final UnparseBLESS3.unitDeclaration_return unitDeclaration() throws RecognitionException {
		UnparseBLESS3.unitDeclaration_return retval = new UnparseBLESS3.unitDeclaration_return();
		retval.start = input.LT(1);

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:270:16: ( rootDeclaration | unitExtension )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ROOT_DECLARATION) ) {
				alt11=1;
			}
			else if ( (LA11_0==LITERAL_extension) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:271:3: rootDeclaration
					{
					pushFollow(FOLLOW_rootDeclaration_in_unitDeclaration470);
					rootDeclaration();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:271:21: unitExtension
					{
					pushFollow(FOLLOW_unitExtension_in_unitDeclaration474);
					unitExtension();
					state._fsp--;

					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitDeclaration"


	public static class rootDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "rootDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:274:1: rootDeclaration : ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors));
	public final UnparseBLESS3.rootDeclaration_return rootDeclaration() throws RecognitionException {
		UnparseBLESS3.rootDeclaration_return retval = new UnparseBLESS3.rootDeclaration_return();
		retval.start = input.LT(1);

		BAST base=null;
		BAST kindWords=null;
		List<Object> list_kindWords=null;
		List<Object> list_factors=null;
		TreeRuleReturnScope unit =null;
		TreeRuleReturnScope formula =null;
		RuleReturnScope factors = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:275:3: ( ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)| ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* ) -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors))
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ROOT_DECLARATION) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==DOWN) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==LITERAL_base) ) {
						alt16=1;
					}
					else if ( (LA16_2==UNIT_FORMULA) ) {
						alt16=2;
					}

					else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:3: ^( ROOT_DECLARATION base= LITERAL_base ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* )
					{
					match(input,ROOT_DECLARATION,FOLLOW_ROOT_DECLARATION_in_rootDeclaration491); 
					match(input, Token.DOWN, null); 
					base=(BAST)match(input,LITERAL_base,FOLLOW_LITERAL_base_in_rootDeclaration495); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration499); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:62: (kindWords+= ID )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==ID) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:62: kindWords+= ID
							{
							kindWords=(BAST)match(input,ID,FOLLOW_ID_in_rootDeclaration503); 
							if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
							list_kindWords.add(kindWords);
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_unitName_in_rootDeclaration510);
					unit=unitName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:91: (factors+= unitFactor )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==COMMA) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:276:91: factors+= unitFactor
							{
							pushFollow(FOLLOW_unitFactor_in_rootDeclaration514);
							factors=unitFactor();
							state._fsp--;

							if (list_factors==null) list_factors=new ArrayList<Object>();
							list_factors.add(factors.getTemplate());
							}
							break;

						default :
							break loop13;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 277:5: -> root_declaration(base=$base.textkindWords=$kindWordsunit=$unit.stfactors=$factors)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("base", (base!=null?base.getText():null)).put("kindWords", list_kindWords).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:279:3: ^( ROOT_DECLARATION formula= unitFormula ^( LBRACKET (kindWords+= ID )+ ) unit= unitName (factors+= unitFactor )* )
					{
					match(input,ROOT_DECLARATION,FOLLOW_ROOT_DECLARATION_in_rootDeclaration555); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitFormula_in_rootDeclaration559);
					formula=unitFormula();
					state._fsp--;

					match(input,LBRACKET,FOLLOW_LBRACKET_in_rootDeclaration563); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:279:64: (kindWords+= ID )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ID) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:279:64: kindWords+= ID
							{
							kindWords=(BAST)match(input,ID,FOLLOW_ID_in_rootDeclaration567); 
							if (list_kindWords==null) list_kindWords=new ArrayList<Object>();
							list_kindWords.add(kindWords);
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_unitName_in_rootDeclaration574);
					unit=unitName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:279:93: (factors+= unitFactor )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:279:93: factors+= unitFactor
							{
							pushFollow(FOLLOW_unitFactor_in_rootDeclaration578);
							factors=unitFactor();
							state._fsp--;

							if (list_factors==null) list_factors=new ArrayList<Object>();
							list_factors.add(factors.getTemplate());
							}
							break;

						default :
							break loop15;
						}
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 280:5: -> root_declaration(formula=$formula.stkindWords=$kindWordsunit=$unit.stfactors=$factors)
					{
						retval.st = templateLib.getInstanceOf("root_declaration",new STAttrMap().put("formula", (formula!=null?((StringTemplate)formula.getTemplate()):null)).put("kindWords", list_kindWords).put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("factors", list_factors));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rootDeclaration"


	public static class unitExtension_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitExtension"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:283:1: unitExtension : ^( LITERAL_extension root= ID (factors+= unitFactor )+ ) -> unit_extension(root=$root.textfactors=$factors);
	public final UnparseBLESS3.unitExtension_return unitExtension() throws RecognitionException {
		UnparseBLESS3.unitExtension_return retval = new UnparseBLESS3.unitExtension_return();
		retval.start = input.LT(1);

		BAST root=null;
		List<Object> list_factors=null;
		RuleReturnScope factors = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:284:3: ( ^( LITERAL_extension root= ID (factors+= unitFactor )+ ) -> unit_extension(root=$root.textfactors=$factors))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:285:3: ^( LITERAL_extension root= ID (factors+= unitFactor )+ )
			{
			match(input,LITERAL_extension,FOLLOW_LITERAL_extension_in_unitExtension626); 
			match(input, Token.DOWN, null); 
			root=(BAST)match(input,ID,FOLLOW_ID_in_unitExtension630); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:285:39: (factors+= unitFactor )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:285:39: factors+= unitFactor
					{
					pushFollow(FOLLOW_unitFactor_in_unitExtension634);
					factors=unitFactor();
					state._fsp--;

					if (list_factors==null) list_factors=new ArrayList<Object>();
					list_factors.add(factors.getTemplate());
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 286:5: -> unit_extension(root=$root.textfactors=$factors)
			{
				retval.st = templateLib.getInstanceOf("unit_extension",new STAttrMap().put("root", (root!=null?root.getText():null)).put("factors", list_factors));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitExtension"


	public static class unitFactor_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unitFactor"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:290:1: unitFactor : ( ^( COMMA unit= unitName t= TIMES factor= NUMBER ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= NUMBER ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text));
	public final UnparseBLESS3.unitFactor_return unitFactor() throws RecognitionException {
		UnparseBLESS3.unitFactor_return retval = new UnparseBLESS3.unitFactor_return();
		retval.start = input.LT(1);

		BAST t=null;
		BAST factor=null;
		BAST d=null;
		TreeRuleReturnScope unit =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:290:11: ( ^( COMMA unit= unitName t= TIMES factor= NUMBER ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= NUMBER ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text))
			int alt18=2;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:291:3: ^( COMMA unit= unitName t= TIMES factor= NUMBER )
					{
					match(input,COMMA,FOLLOW_COMMA_in_unitFactor671); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitName_in_unitFactor675);
					unit=unitName();
					state._fsp--;

					t=(BAST)match(input,TIMES,FOLLOW_TIMES_in_unitFactor679); 
					factor=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor683); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 292:5: -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)
					{
						retval.st = templateLib.getInstanceOf("unit_factor",new STAttrMap().put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("op", (t!=null?t.getText():null)).put("factor", (factor!=null?factor.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:294:3: ^( COMMA unit= unitName d= DIVIDE factor= NUMBER )
					{
					match(input,COMMA,FOLLOW_COMMA_in_unitFactor718); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_unitName_in_unitFactor722);
					unit=unitName();
					state._fsp--;

					d=(BAST)match(input,DIVIDE,FOLLOW_DIVIDE_in_unitFactor726); 
					factor=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_unitFactor730); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 295:5: -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text)
					{
						retval.st = templateLib.getInstanceOf("unit_factor",new STAttrMap().put("unit", (unit!=null?((StringTemplate)unit.getTemplate()):null)).put("op", (d!=null?d.getText():null)).put("factor", (factor!=null?factor.getText():null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unitFactor"


	public static class typeLibrary_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:301:1: typeLibrary : (decs+= typeDeclaration )+ -> type_library(decs=$decs);
	public final UnparseBLESS3.typeLibrary_return typeLibrary() throws RecognitionException {
		UnparseBLESS3.typeLibrary_return retval = new UnparseBLESS3.typeLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:301:12: ( (decs+= typeDeclaration )+ -> type_library(decs=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:302:3: (decs+= typeDeclaration )+
			{
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:302:7: (decs+= typeDeclaration )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==LITERAL_type) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:302:7: decs+= typeDeclaration
					{
					pushFollow(FOLLOW_typeDeclaration_in_typeLibrary777);
					decs=typeDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			// TEMPLATE REWRITE
			// 303:5: -> type_library(decs=$decs)
			{
				retval.st = templateLib.getInstanceOf("type_library",new STAttrMap().put("decs", list_decs));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeLibrary"


	public static class typeDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:306:1: typeDeclaration : ^( LITERAL_type id= ID ty= type ) -> type_declaration(id=$id.textty=$ty.st);
	public final UnparseBLESS3.typeDeclaration_return typeDeclaration() throws RecognitionException {
		UnparseBLESS3.typeDeclaration_return retval = new UnparseBLESS3.typeDeclaration_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:306:16: ( ^( LITERAL_type id= ID ty= type ) -> type_declaration(id=$id.textty=$ty.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:307:3: ^( LITERAL_type id= ID ty= type )
			{
			match(input,LITERAL_type,FOLLOW_LITERAL_type_in_typeDeclaration805); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_typeDeclaration809); 
			pushFollow(FOLLOW_type_in_typeDeclaration813);
			ty=type();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 308:5: -> type_declaration(id=$id.textty=$ty.st)
			{
				retval.st = templateLib.getInstanceOf("type_declaration",new STAttrMap().put("id", (id!=null?id.getText():null)).put("ty", (ty!=null?((StringTemplate)ty.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeDeclaration"


	public static class type_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:313:1: type : (et= enumerationType -> {$et.st}|nt= quantityType -> {$nt.st}|at= arrayType -> {$at.st}|rt= recordType -> {$rt.st}|bo= LITERAL_boolean -> boolean(|st= LITERAL_string -> string(|nu= LITERAL_null -> {%{$nu.text}});
	public final UnparseBLESS3.type_return type() throws RecognitionException {
		UnparseBLESS3.type_return retval = new UnparseBLESS3.type_return();
		retval.start = input.LT(1);

		BAST bo=null;
		BAST st=null;
		BAST nu=null;
		TreeRuleReturnScope et =null;
		TreeRuleReturnScope nt =null;
		TreeRuleReturnScope at =null;
		TreeRuleReturnScope rt =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:314:2: (et= enumerationType -> {$et.st}|nt= quantityType -> {$nt.st}|at= arrayType -> {$at.st}|rt= recordType -> {$rt.st}|bo= LITERAL_boolean -> boolean(|st= LITERAL_string -> string(|nu= LITERAL_null -> {%{$nu.text}})
			int alt20=7;
			switch ( input.LA(1) ) {
			case LITERAL_enumeration:
				{
				alt20=1;
				}
				break;
			case LITERAL_quantity:
				{
				alt20=2;
				}
				break;
			case LITERAL_array:
				{
				alt20=3;
				}
				break;
			case LITERAL_record:
			case LITERAL_variant:
				{
				alt20=4;
				}
				break;
			case LITERAL_boolean:
				{
				alt20=5;
				}
				break;
			case LITERAL_string:
				{
				alt20=6;
				}
				break;
			case LITERAL_null:
				{
				alt20=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:315:2: et= enumerationType
					{
					pushFollow(FOLLOW_enumerationType_in_type852);
					et=enumerationType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 316:3: -> {$et.st}
					{
						retval.st = (et!=null?((StringTemplate)et.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:318:2: nt= quantityType
					{
					pushFollow(FOLLOW_quantityType_in_type865);
					nt=quantityType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 319:3: -> {$nt.st}
					{
						retval.st = (nt!=null?((StringTemplate)nt.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:321:2: at= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_type878);
					at=arrayType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 322:3: -> {$at.st}
					{
						retval.st = (at!=null?((StringTemplate)at.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:324:2: rt= recordType
					{
					pushFollow(FOLLOW_recordType_in_type891);
					rt=recordType();
					state._fsp--;

					// TEMPLATE REWRITE
					// 325:3: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:327:2: bo= LITERAL_boolean
					{
					bo=(BAST)match(input,LITERAL_boolean,FOLLOW_LITERAL_boolean_in_type904); 
					// TEMPLATE REWRITE
					// 327:21: -> boolean(
					{
						retval.st = templateLib.getInstanceOf("boolean");
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:329:2: st= LITERAL_string
					{
					st=(BAST)match(input,LITERAL_string,FOLLOW_LITERAL_string_in_type920); 
					// TEMPLATE REWRITE
					// 329:20: -> string(
					{
						retval.st = templateLib.getInstanceOf("string");
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:331:2: nu= LITERAL_null
					{
					nu=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_type936); 
					// TEMPLATE REWRITE
					// 331:18: -> {%{$nu.text}}
					{
						retval.st = new StringTemplate(templateLib,(nu!=null?nu.getText():null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			Dump.it("Unparse:type="+((BAST)retval.start).toStringTree()); reportError(re);
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class typeOrReference_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeOrReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:336:1: typeOrReference : (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}}|dum= DUMMY -> {%{$dum.text}});
	public final UnparseBLESS3.typeOrReference_return typeOrReference() throws RecognitionException {
		UnparseBLESS3.typeOrReference_return retval = new UnparseBLESS3.typeOrReference_return();
		retval.start = input.LT(1);

		BAST ref=null;
		BAST dum=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:336:16: (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}}|dum= DUMMY -> {%{$dum.text}})
			int alt21=3;
			switch ( input.LA(1) ) {
			case LITERAL_array:
			case LITERAL_boolean:
			case LITERAL_enumeration:
			case LITERAL_null:
			case LITERAL_quantity:
			case LITERAL_record:
			case LITERAL_string:
			case LITERAL_variant:
				{
				alt21=1;
				}
				break;
			case ID:
				{
				alt21=2;
				}
				break;
			case DUMMY:
				{
				alt21=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:337:3: ty= type
					{
					pushFollow(FOLLOW_type_in_typeOrReference963);
					ty=type();
					state._fsp--;

					// TEMPLATE REWRITE
					// 338:5: -> {$ty.st}
					{
						retval.st = (ty!=null?((StringTemplate)ty.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:340:3: ref= ID
					{
					ref=(BAST)match(input,ID,FOLLOW_ID_in_typeOrReference983); 
					// TEMPLATE REWRITE
					// 341:5: -> {%{$ref.text}}
					{
						retval.st = new StringTemplate(templateLib,(ref!=null?ref.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:343:3: dum= DUMMY
					{
					dum=(BAST)match(input,DUMMY,FOLLOW_DUMMY_in_typeOrReference1004); 
					// TEMPLATE REWRITE
					// 344:5: -> {%{$dum.text}}
					{
						retval.st = new StringTemplate(templateLib,(dum!=null?dum.getText():null));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeOrReference"


	public static class enumerationType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "enumerationType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:347:1: enumerationType : ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id);
	public final UnparseBLESS3.enumerationType_return enumerationType() throws RecognitionException {
		UnparseBLESS3.enumerationType_return retval = new UnparseBLESS3.enumerationType_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_id=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:348:3: ( ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:349:3: ^( LITERAL_enumeration (id+= ID )+ )
			{
			match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType1030); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:349:27: (id+= ID )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==ID) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:349:27: id+= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationType1034); 
					if (list_id==null) list_id=new ArrayList<Object>();
					list_id.add(id);
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 350:5: -> enumeration_type(id=$id)
			{
				retval.st = templateLib.getInstanceOf("enumeration_type",new STAttrMap().put("id", list_id));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationType"


	public static class quantityType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantityType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:353:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st));
	public final UnparseBLESS3.quantityType_return quantityType() throws RecognitionException {
		UnparseBLESS3.quantityType_return retval = new UnparseBLESS3.quantityType_return();
		retval.start = input.LT(1);

		BAST unit=null;
		BAST scalar=null;
		BAST whole=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope step =null;
		TreeRuleReturnScope representation =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:354:3: ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st))
			int alt23=18;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:355:3: ^( LITERAL_quantity unit= ID )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1069); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1073); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 356:5: -> quantity_type(unit=$unit.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:358:3: ^( LITERAL_quantity scalar= LITERAL_scalar )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1098); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1102); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 359:5: -> quantity_type(scalar=$scalar.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:361:3: ^( LITERAL_quantity whole= LITERAL_whole )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1127); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1131); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 362:5: -> quantity_type(whole=$whole.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:364:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1156); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1160); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1163); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1167);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1171);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 365:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:367:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1207); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1211); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1214); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1218);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1222);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 368:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:370:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1258); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1262); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1265); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1269);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1273);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 371:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:373:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1309); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1313); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1316); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1320);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1324);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1328); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1332);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 374:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:376:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1373); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1377); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1380); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1384);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1388);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1392); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1396);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 377:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:379:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1437); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1441); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1444); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1448);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1452);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1456); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1460);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 380:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:382:3: ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1501); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1505); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1508); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1512);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 383:5: -> quantity_type(unit=$unit.textrepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 11 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:385:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1544); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1548); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1551); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1555);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 386:5: -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 12 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:388:3: ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1587); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1591); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1594); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1598);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 389:5: -> quantity_type(whole=$whole.textrepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 13 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:391:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1630); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1634); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1637); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1641);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1645);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1649); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1653);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 392:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 14 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1695); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1699); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1702); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1706);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1710);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1714); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1718);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 395:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 15 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:397:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1760); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1764); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1767); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1771);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1775);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1779); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1783);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 398:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 16 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:400:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1825); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1829); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1832); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1836);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1840);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1844); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1848);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1852); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1856);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 401:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 17 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:403:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1903); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1907); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1910); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1914);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1918);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1922); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1926);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1934);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 404:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 18 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:406:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1981); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1985); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1988); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1992);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1996);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType2000); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType2004);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType2008); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType2012);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 407:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantityType"


	public static class arrayType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:411:1: arrayType : ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st);
	public final UnparseBLESS3.arrayType_return arrayType() throws RecognitionException {
		UnparseBLESS3.arrayType_return retval = new UnparseBLESS3.arrayType_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope arl =null;
		TreeRuleReturnScope t =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:412:2: ( ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:413:2: ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference )
			{
			match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType2068); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_arrayRangeList_in_arrayType2072);
			arl=arrayRangeList();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType2074); 
			pushFollow(FOLLOW_typeOrReference_in_arrayType2078);
			t=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 414:3: -> array_type(arl=$arl.stt=$t.st)
			{
				retval.st = templateLib.getInstanceOf("array_type",new STAttrMap().put("arl", (arl!=null?((StringTemplate)arl.getTemplate()):null)).put("t", (t!=null?((StringTemplate)t.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayType"


	public static class arrayRangeList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayRangeList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:418:1: arrayRangeList : (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges));
	public final UnparseBLESS3.arrayRangeList_return arrayRangeList() throws RecognitionException {
		UnparseBLESS3.arrayRangeList_return retval = new UnparseBLESS3.arrayRangeList_return();
		retval.start = input.LT(1);

		List<Object> list_ranges=null;
		TreeRuleReturnScope nr =null;
		RuleReturnScope ranges = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:419:2: (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges))
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= DOTDOT && LA25_0 <= DOUBLE_COLON)||LA25_0==NUMBER||LA25_0==OCTOTHORPE) ) {
				alt25=1;
			}
			else if ( (LA25_0==COMMA) ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:420:2: nr= arrayRange
					{
					pushFollow(FOLLOW_arrayRange_in_arrayRangeList2111);
					nr=arrayRange();
					state._fsp--;

					// TEMPLATE REWRITE
					// 421:4: -> {$nr.st}
					{
						retval.st = (nr!=null?((StringTemplate)nr.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:423:2: ^( COMMA (ranges+= arrayRange )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList2125); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:423:16: (ranges+= arrayRange )+
					int cnt24=0;
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= DOTDOT && LA24_0 <= DOUBLE_COLON)||LA24_0==NUMBER||LA24_0==OCTOTHORPE) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:423:16: ranges+= arrayRange
							{
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList2129);
							ranges=arrayRange();
							state._fsp--;

							if (list_ranges==null) list_ranges=new ArrayList<Object>();
							list_ranges.add(ranges.getTemplate());
							}
							break;

						default :
							if ( cnt24 >= 1 ) break loop24;
							EarlyExitException eee = new EarlyExitException(24, input);
							throw eee;
						}
						cnt24++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 424:4: -> array_range_list(r=$ranges)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_ranges));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayRangeList"


	public static class arrayRange_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:427:1: arrayRange : (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st));
	public final UnparseBLESS3.arrayRange_return arrayRange() throws RecognitionException {
		UnparseBLESS3.arrayRange_return retval = new UnparseBLESS3.arrayRange_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:428:3: (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st))
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==DOUBLE_COLON||LA26_0==NUMBER||LA26_0==OCTOTHORPE) ) {
				alt26=1;
			}
			else if ( (LA26_0==DOTDOT) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:429:3: n= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_arrayRange2160);
					n=aNumber();
					state._fsp--;

					// TEMPLATE REWRITE
					// 430:5: -> {$n.st}
					{
						retval.st = (n!=null?((StringTemplate)n.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:432:3: ^( DOTDOT lb= aNumber ub= aNumber )
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange2178); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_arrayRange2182);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_arrayRange2186);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 433:5: -> array_range(l=$lb.str=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("array_range",new STAttrMap().put("l", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("r", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayRange"


	public static class recordType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordType"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:436:1: recordType : ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf));
	public final UnparseBLESS3.recordType_return recordType() throws RecognitionException {
		UnparseBLESS3.recordType_return retval = new UnparseBLESS3.recordType_return();
		retval.start = input.LT(1);

		BAST r=null;
		List<Object> list_rf=null;
		RuleReturnScope rf = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:437:2: ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf))
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==LITERAL_record) ) {
				alt29=1;
			}
			else if ( (LA29_0==LITERAL_variant) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:2: ^(r= LITERAL_record (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_record,FOLLOW_LITERAL_record_in_recordType2223); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:23: (rf+= recordField )+
					int cnt27=0;
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==COLON) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:23: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2227);
							rf=recordField();
							state._fsp--;

							if (list_rf==null) list_rf=new ArrayList<Object>();
							list_rf.add(rf.getTemplate());
							}
							break;

						default :
							if ( cnt27 >= 1 ) break loop27;
							EarlyExitException eee = new EarlyExitException(27, input);
							throw eee;
						}
						cnt27++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 439:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:2: ^(r= LITERAL_variant (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_variant,FOLLOW_LITERAL_variant_in_recordType2254); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:24: (rf+= recordField )+
					int cnt28=0;
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==COLON) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:441:24: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2258);
							rf=recordField();
							state._fsp--;

							if (list_rf==null) list_rf=new ArrayList<Object>();
							list_rf.add(rf.getTemplate());
							}
							break;

						default :
							if ( cnt28 >= 1 ) break loop28;
							EarlyExitException eee = new EarlyExitException(28, input);
							throw eee;
						}
						cnt28++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 442:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordType"


	public static class recordField_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:449:1: recordField : ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st);
	public final UnparseBLESS3.recordField_return recordField() throws RecognitionException {
		UnparseBLESS3.recordField_return retval = new UnparseBLESS3.recordField_return();
		retval.start = input.LT(1);

		BAST df=null;
		TreeRuleReturnScope ptd =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:450:2: ( ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:451:2: ^( COLON df= ID ptd= typeOrReference )
			{
			match(input,COLON,FOLLOW_COLON_in_recordField2295); 
			match(input, Token.DOWN, null); 
			df=(BAST)match(input,ID,FOLLOW_ID_in_recordField2299); 
			pushFollow(FOLLOW_typeOrReference_in_recordField2303);
			ptd=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 452:3: -> record_field(df=$df.textptd=$ptd.st)
			{
				retval.st = templateLib.getInstanceOf("record_field",new STAttrMap().put("df", (df!=null?df.getText():null)).put("ptd", (ptd!=null?((StringTemplate)ptd.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordField"


	public static class assertionLibrary_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertionLibrary"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:460:1: assertionLibrary : ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass));
	public final UnparseBLESS3.assertionLibrary_return assertionLibrary() throws RecognitionException {
		UnparseBLESS3.assertionLibrary_return retval = new UnparseBLESS3.assertionLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_ass=null;
		TreeRuleReturnScope ghosts =null;
		RuleReturnScope ass = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:461:2: ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass))
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==ASSERTION_ANNEX) ) {
				int LA32_1 = input.LA(2);
				if ( (LA32_1==DOWN) ) {
					int LA32_2 = input.LA(3);
					if ( (LA32_2==LITERAL_ghost) ) {
						alt32=1;
					}
					else if ( (LA32_2==ASSERTION||(LA32_2 >= ASSERTION_ENUMERATION && LA32_2 <= ASSERTION_FUNCTION)) ) {
						alt32=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 32, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:462:3: ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2340); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary2344);
					ghosts=ghostVariables();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:462:46: (ass+= namedAssertion )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==ASSERTION||(LA30_0 >= ASSERTION_ENUMERATION && LA30_0 <= ASSERTION_FUNCTION)) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:462:46: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2348);
							ass=namedAssertion();
							state._fsp--;

							if (list_ass==null) list_ass=new ArrayList<Object>();
							list_ass.add(ass.getTemplate());
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 463:4: -> annex_library_assertion(ghosts=$ghosts.stass=$ass)
					{
						retval.st = templateLib.getInstanceOf("annex_library_assertion",new STAttrMap().put("ghosts", (ghosts!=null?((StringTemplate)ghosts.getTemplate()):null)).put("ass", list_ass));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:465:3: ^( ASSERTION_ANNEX (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2375); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:465:24: (ass+= namedAssertion )+
					int cnt31=0;
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==ASSERTION||(LA31_0 >= ASSERTION_ENUMERATION && LA31_0 <= ASSERTION_FUNCTION)) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:465:24: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2379);
							ass=namedAssertion();
							state._fsp--;

							if (list_ass==null) list_ass=new ArrayList<Object>();
							list_ass.add(ass.getTemplate());
							}
							break;

						default :
							if ( cnt31 >= 1 ) break loop31;
							EarlyExitException eee = new EarlyExitException(31, input);
							throw eee;
						}
						cnt31++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 466:4: -> annex_library_assertion(ass=$ass)
					{
						retval.st = templateLib.getInstanceOf("annex_library_assertion",new STAttrMap().put("ass", list_ass));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionLibrary"


	public static class ghostVariables_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ghostVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:470:1: ghostVariables : ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv);
	public final UnparseBLESS3.ghostVariables_return ghostVariables() throws RecognitionException {
		UnparseBLESS3.ghostVariables_return retval = new UnparseBLESS3.ghostVariables_return();
		retval.start = input.LT(1);

		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:471:3: ( ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:472:3: ^( LITERAL_ghost (gv+= ghostVariable )+ )
			{
			match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables2415); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:472:22: (gv+= ghostVariable )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==LITERAL_def) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:472:22: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables2419);
					gv=ghostVariable();
					state._fsp--;

					if (list_gv==null) list_gv=new ArrayList<Object>();
					list_gv.add(gv.getTemplate());
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 473:5: -> ghost_variables(gv=$gv)
			{
				retval.st = templateLib.getInstanceOf("ghost_variables",new STAttrMap().put("gv", list_gv));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ghostVariables"


	public static class ghostVariable_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ghostVariable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:476:1: ghostVariable : ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.ghostVariable_return ghostVariable() throws RecognitionException {
		UnparseBLESS3.ghostVariable_return retval = new UnparseBLESS3.ghostVariable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:477:3: ( ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:478:3: ^( LITERAL_def id= ID tod= typeOrReference )
			{
			match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable2452); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_ghostVariable2457); 
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable2461);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 479:5: -> ghost_variable(id=$id.texttod=$tod.st)
			{
				retval.st = templateLib.getInstanceOf("ghost_variable",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ghostVariable"


	public static class namedAssertion_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namedAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:482:1: namedAssertion : ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textassertionvariable=$assertionvariable.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st));
	public final UnparseBLESS3.namedAssertion_return namedAssertion() throws RecognitionException {
		UnparseBLESS3.namedAssertion_return retval = new UnparseBLESS3.namedAssertion_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST assertionvariable=null;
		BAST enumerationTy=null;
		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope formals =null;
		TreeRuleReturnScope tod =null;
		TreeRuleReturnScope functionvalue =null;
		TreeRuleReturnScope enumeration =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:483:3: ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textassertionvariable=$assertionvariable.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st))
			int alt34=5;
			switch ( input.LA(1) ) {
			case ASSERTION:
				{
				int LA34_1 = input.LA(2);
				if ( (LA34_1==DOWN) ) {
					int LA34_4 = input.LA(3);
					if ( (LA34_4==LABEL) ) {
						int LA34_6 = input.LA(4);
						if ( (LA34_6==DOWN) ) {
							int LA34_8 = input.LA(5);
							if ( (LA34_8==ID) ) {
								int LA34_10 = input.LA(6);
								if ( (LA34_10==UP) ) {
									int LA34_12 = input.LA(7);
									if ( (LA34_12==PARAMETERS) ) {
										alt34=2;
									}
									else if ( (LA34_12==AADL_STRING_LITERAL||(LA34_12 >= AL && LA34_12 <= AM)||LA34_12==AT_SIGN||LA34_12==CARET||LA34_12==DIVIDE||LA34_12==EQ||LA34_12==EXP||LA34_12==GT||LA34_12==ID||LA34_12==INVOKE||LA34_12==LBRACKET||(LA34_12 >= LITERAL_abs && LA34_12 <= LITERAL_and)||LA34_12==LITERAL_div||LA34_12==LITERAL_else||LA34_12==LITERAL_exists||LA34_12==LITERAL_false||(LA34_12 >= LITERAL_iff && LA34_12 <= LITERAL_in)||LA34_12==LITERAL_mod||(LA34_12 >= LITERAL_not && LA34_12 <= LITERAL_numberof)||LA34_12==LITERAL_or||LA34_12==LITERAL_product||LA34_12==LITERAL_rem||LA34_12==LITERAL_round||LA34_12==LITERAL_sum||LA34_12==LITERAL_then||LA34_12==LITERAL_timeout||LA34_12==LITERAL_tops||(LA34_12 >= LITERAL_true && LA34_12 <= LITERAL_truncate)||(LA34_12 >= LITERAL_xor && LA34_12 <= LT)||LA34_12==MINUS||LA34_12==NEQ||LA34_12==OLD_NEQ||LA34_12==PLUS||LA34_12==PLUS_EQUALS||(LA34_12 >= QUANTITY && LA34_12 <= QUESTION)||LA34_12==RECORD_TERM||LA34_12==TICK||LA34_12==TIMES||LA34_12==UNARY_MINUS) ) {
										alt34=1;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 34, 12, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 34, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 34, 8, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 34, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
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
				break;
			case ASSERTION_FUNCTION:
				{
				int LA34_2 = input.LA(2);
				if ( (LA34_2==DOWN) ) {
					int LA34_5 = input.LA(3);
					if ( (LA34_5==LABEL) ) {
						int LA34_7 = input.LA(4);
						if ( (LA34_7==DOWN) ) {
							int LA34_9 = input.LA(5);
							if ( (LA34_9==ID) ) {
								int LA34_11 = input.LA(6);
								if ( (LA34_11==UP) ) {
									int LA34_13 = input.LA(7);
									if ( (LA34_13==LITERAL_returns) ) {
										alt34=3;
									}
									else if ( (LA34_13==PARAMETERS) ) {
										alt34=4;
									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 34, 13, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 34, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 34, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 34, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_ENUMERATION:
				{
				alt34=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:484:3: ^( ASSERTION ^( LABEL id= ID ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2498); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2502); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2506); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2512);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 485:5: -> named_assertion(id=$id.textpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:487:3: ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2542); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2546); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2550); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2556); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2560);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2566);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 488:5: -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:490:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2601); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2605); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2609); 
					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2615); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2619);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2625);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 491:5: -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:493:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2660); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2664); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2668); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2674); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2678);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2684); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2688);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2694);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 494:5: -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:496:3: ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration )
					{
					match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2734); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2738); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2742); 
					match(input, Token.UP, null); 

					match(input,TILDE,FOLLOW_TILDE_in_namedAssertion2748); 
					match(input, Token.DOWN, null); 
					assertionvariable=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2752); 
					enumerationTy=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2756); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion2762);
					enumeration=assertionEnumeration();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 497:5: -> named_assertion_enum(id=$id.textassertionvariable=$assertionvariable.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion_enum",new STAttrMap().put("id", (id!=null?id.getText():null)).put("assertionvariable", (assertionvariable!=null?assertionvariable.getText():null)).put("enumerationTy", (enumerationTy!=null?enumerationTy.getText():null)).put("enumeration", (enumeration!=null?((StringTemplate)enumeration.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedAssertion"


	public static class variableList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:500:1: variableList : (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter));
	public final UnparseBLESS3.variableList_return variableList() throws RecognitionException {
		UnparseBLESS3.variableList_return retval = new UnparseBLESS3.variableList_return();
		retval.start = input.LT(1);

		List<Object> list_parameter=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope parameter = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:501:3: (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter))
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==TILDE) ) {
				alt36=1;
			}
			else if ( (LA36_0==COMMA) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:502:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_variableList2811);
					v=variable();
					state._fsp--;

					// TEMPLATE REWRITE
					// 503:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:505:3: ^( COMMA (parameter+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_variableList2829); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:505:21: (parameter+= variable )+
					int cnt35=0;
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==TILDE) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:505:21: parameter+= variable
							{
							pushFollow(FOLLOW_variable_in_variableList2833);
							parameter=variable();
							state._fsp--;

							if (list_parameter==null) list_parameter=new ArrayList<Object>();
							list_parameter.add(parameter.getTemplate());
							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							EarlyExitException eee = new EarlyExitException(35, input);
							throw eee;
						}
						cnt35++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 506:5: -> variable_list(parameter=$parameter)
					{
						retval.st = templateLib.getInstanceOf("variable_list",new STAttrMap().put("parameter", list_parameter));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableList"


	public static class variable_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variable"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:509:1: variable : ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.variable_return variable() throws RecognitionException {
		UnparseBLESS3.variable_return retval = new UnparseBLESS3.variable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:510:3: ( ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:511:3: ^( TILDE id= ID tod= typeOrReference )
			{
			match(input,TILDE,FOLLOW_TILDE_in_variable2867); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_variable2871); 
			pushFollow(FOLLOW_typeOrReference_in_variable2875);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 512:5: -> variable(id=$id.texttod=$tod.st)
			{
				retval.st = templateLib.getInstanceOf("variable",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class assertionFunctionValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertionFunctionValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:515:1: assertionFunctionValue : (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st});
	public final UnparseBLESS3.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		UnparseBLESS3.assertionFunctionValue_return retval = new UnparseBLESS3.assertionFunctionValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope caf =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:516:3: (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st})
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CONDITIONAL_ASSERTION_FUNCTION) ) {
				alt37=1;
			}
			else if ( (LA37_0==AADL_STRING_LITERAL||(LA37_0 >= AL && LA37_0 <= AM)||LA37_0==AT_SIGN||LA37_0==CARET||LA37_0==DIVIDE||LA37_0==EQ||LA37_0==EXP||LA37_0==GT||LA37_0==ID||LA37_0==INVOKE||LA37_0==LBRACKET||(LA37_0 >= LITERAL_abs && LA37_0 <= LITERAL_and)||LA37_0==LITERAL_div||LA37_0==LITERAL_else||LA37_0==LITERAL_exists||LA37_0==LITERAL_false||(LA37_0 >= LITERAL_iff && LA37_0 <= LITERAL_in)||LA37_0==LITERAL_mod||(LA37_0 >= LITERAL_not && LA37_0 <= LITERAL_numberof)||LA37_0==LITERAL_or||LA37_0==LITERAL_product||LA37_0==LITERAL_rem||LA37_0==LITERAL_round||LA37_0==LITERAL_sum||LA37_0==LITERAL_then||LA37_0==LITERAL_timeout||LA37_0==LITERAL_tops||(LA37_0 >= LITERAL_true && LA37_0 <= LITERAL_truncate)||(LA37_0 >= LITERAL_xor && LA37_0 <= LT)||LA37_0==MINUS||LA37_0==NEQ||LA37_0==OLD_NEQ||LA37_0==PLUS||LA37_0==PLUS_EQUALS||(LA37_0 >= QUANTITY && LA37_0 <= QUESTION)||LA37_0==RECORD_TERM||LA37_0==TICK||LA37_0==TIMES||LA37_0==UNARY_MINUS) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:517:3: caf= conditionalAssertionFunction
					{
					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2912);
					caf=conditionalAssertionFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 518:5: -> {$caf.st}
					{
						retval.st = (caf!=null?((StringTemplate)caf.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:519:4: exp= expression
					{
					pushFollow(FOLLOW_expression_in_assertionFunctionValue2928);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 520:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionFunctionValue"


	public static class conditionalAssertionFunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionalAssertionFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:523:1: conditionalAssertionFunction : ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp);
	public final UnparseBLESS3.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		UnparseBLESS3.conditionalAssertionFunction_return retval = new UnparseBLESS3.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:524:3: ( ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:525:3: ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ )
			{
			match(input,CONDITIONAL_ASSERTION_FUNCTION,FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2955); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:525:40: (cvp+= conditionValuePair )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==CVP) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:525:40: cvp+= conditionValuePair
					{
					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction2959);
					cvp=conditionValuePair();
					state._fsp--;

					if (list_cvp==null) list_cvp=new ArrayList<Object>();
					list_cvp.add(cvp.getTemplate());
					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 526:5: -> conditional_assertion_function(cvp=$cvp)
			{
				retval.st = templateLib.getInstanceOf("conditional_assertion_function",new STAttrMap().put("cvp", list_cvp));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalAssertionFunction"


	public static class conditionValuePair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionValuePair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:529:1: conditionValuePair : ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st);
	public final UnparseBLESS3.conditionValuePair_return conditionValuePair() throws RecognitionException {
		UnparseBLESS3.conditionValuePair_return retval = new UnparseBLESS3.conditionValuePair_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:530:3: ( ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:531:3: ^( CVP pred= predicate exp= expression )
			{
			match(input,CVP,FOLLOW_CVP_in_conditionValuePair2993); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_conditionValuePair2997);
			pred=predicate();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionValuePair3001);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 532:5: -> condition_value_pair(pp=$pred.stpe=$exp.st)
			{
				retval.st = templateLib.getInstanceOf("condition_value_pair",new STAttrMap().put("pp", (pred!=null?((StringTemplate)pred.getTemplate()):null)).put("pe", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionValuePair"


	public static class assertionEnumeration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertionEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:535:1: assertionEnumeration : ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW (pair+= enumerationPair )+ ) -> assertion_enumeration_pairs(ep=$pair));
	public final UnparseBLESS3.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		UnparseBLESS3.assertionEnumeration_return retval = new UnparseBLESS3.assertionEnumeration_return();
		retval.start = input.LT(1);

		List<Object> list_pair=null;
		TreeRuleReturnScope inv =null;
		RuleReturnScope pair = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:536:3: ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW (pair+= enumerationPair )+ ) -> assertion_enumeration_pairs(ep=$pair))
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==PLUS_ARROW) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==DOWN) ) {
					int LA40_2 = input.LA(3);
					if ( (LA40_2==INVOKE) ) {
						alt40=1;
					}
					else if ( (LA40_2==IMP) ) {
						alt40=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 40, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:537:3: ^( PLUS_ARROW inv= invocation )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3040); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_invocation_in_assertionEnumeration3044);
					inv=invocation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 538:5: -> assertion_enumeration_predicate_invocation(pi=$inv.st)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_predicate_invocation",new STAttrMap().put("pi", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:540:3: ^( PLUS_ARROW (pair+= enumerationPair )+ )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3070); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:540:21: (pair+= enumerationPair )+
					int cnt39=0;
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==IMP) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:540:21: pair+= enumerationPair
							{
							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3074);
							pair=enumerationPair();
							state._fsp--;

							if (list_pair==null) list_pair=new ArrayList<Object>();
							list_pair.add(pair.getTemplate());
							}
							break;

						default :
							if ( cnt39 >= 1 ) break loop39;
							EarlyExitException eee = new EarlyExitException(39, input);
							throw eee;
						}
						cnt39++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 541:5: -> assertion_enumeration_pairs(ep=$pair)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_pairs",new STAttrMap().put("ep", list_pair));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertionEnumeration"


	public static class enumerationPair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "enumerationPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:544:1: enumerationPair : ^( IMP id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st);
	public final UnparseBLESS3.enumerationPair_return enumerationPair() throws RecognitionException {
		UnparseBLESS3.enumerationPair_return retval = new UnparseBLESS3.enumerationPair_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:545:3: ( ^( IMP id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:546:3: ^( IMP id= ID pred= predicate )
			{
			match(input,IMP,FOLLOW_IMP_in_enumerationPair3109); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationPair3113); 
			pushFollow(FOLLOW_predicate_in_enumerationPair3117);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 547:5: -> enumeration_pair(i=$id.textpe=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("enumeration_pair",new STAttrMap().put("i", (id!=null?id.getText():null)).put("pe", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationPair"


	public static class enumerationValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "enumerationValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:550:1: enumerationValue : ^( TICK enumeration_type= ID enumeration_value= ID ) -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text);
	public final UnparseBLESS3.enumerationValue_return enumerationValue() throws RecognitionException {
		UnparseBLESS3.enumerationValue_return retval = new UnparseBLESS3.enumerationValue_return();
		retval.start = input.LT(1);

		BAST enumeration_type=null;
		BAST enumeration_value=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:551:3: ( ^( TICK enumeration_type= ID enumeration_value= ID ) -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:552:3: ^( TICK enumeration_type= ID enumeration_value= ID )
			{
			match(input,TICK,FOLLOW_TICK_in_enumerationValue3156); 
			match(input, Token.DOWN, null); 
			enumeration_type=(BAST)match(input,ID,FOLLOW_ID_in_enumerationValue3160); 
			enumeration_value=(BAST)match(input,ID,FOLLOW_ID_in_enumerationValue3164); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 553:5: -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text)
			{
				retval.st = templateLib.getInstanceOf("enumeration_value",new STAttrMap().put("t", (enumeration_type!=null?enumeration_type.getText():null)).put("v", (enumeration_value!=null?enumeration_value.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enumerationValue"


	public static class invocation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "invocation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:556:1: invocation : ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st));
	public final UnparseBLESS3.invocation_return invocation() throws RecognitionException {
		UnparseBLESS3.invocation_return retval = new UnparseBLESS3.invocation_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_params=null;
		TreeRuleReturnScope exp =null;
		RuleReturnScope params = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:557:3: ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st))
			int alt42=3;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==INVOKE) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==DOWN) ) {
					int LA42_2 = input.LA(3);
					if ( (LA42_2==ID) ) {
						switch ( input.LA(4) ) {
						case UP:
							{
							alt42=1;
							}
							break;
						case COLON:
							{
							alt42=2;
							}
							break;
						case AADL_STRING_LITERAL:
						case AL:
						case AM:
						case AT_SIGN:
						case CARET:
						case DIVIDE:
						case EQ:
						case EXP:
						case GT:
						case ID:
						case INVOKE:
						case LBRACKET:
						case LITERAL_abs:
						case LITERAL_all:
						case LITERAL_and:
						case LITERAL_div:
						case LITERAL_else:
						case LITERAL_exists:
						case LITERAL_false:
						case LITERAL_iff:
						case LITERAL_implies:
						case LITERAL_in:
						case LITERAL_mod:
						case LITERAL_not:
						case LITERAL_now:
						case LITERAL_null:
						case LITERAL_numberof:
						case LITERAL_or:
						case LITERAL_product:
						case LITERAL_rem:
						case LITERAL_round:
						case LITERAL_sum:
						case LITERAL_then:
						case LITERAL_timeout:
						case LITERAL_tops:
						case LITERAL_true:
						case LITERAL_truncate:
						case LITERAL_xor:
						case LPAREN:
						case LT:
						case MINUS:
						case NEQ:
						case OLD_NEQ:
						case PLUS:
						case PLUS_EQUALS:
						case QUANTITY:
						case QUESTION:
						case RECORD_TERM:
						case TICK:
						case TIMES:
						case UNARY_MINUS:
							{
							alt42=3;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 42, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}

			switch (alt42) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:558:3: ^( INVOKE id= ID )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3201); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3205); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 559:5: -> invocation(i=$id.text)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:3: ^( INVOKE id= ID (params+= actualParameter )+ )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3230); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3234); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:25: (params+= actualParameter )+
					int cnt41=0;
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==COLON) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:25: params+= actualParameter
							{
							pushFollow(FOLLOW_actualParameter_in_invocation3238);
							params=actualParameter();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt41 >= 1 ) break loop41;
							EarlyExitException eee = new EarlyExitException(41, input);
							throw eee;
						}
						cnt41++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 562:5: -> invocation(i=$id.textp=$params)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)).put("p", list_params));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:564:3: ^( INVOKE id= ID exp= expression )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3269); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3273); 
					pushFollow(FOLLOW_expression_in_invocation3277);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 565:5: -> invocation(i=$id.textp=$exp.st)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)).put("p", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invocation"


	public static class actualParameter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "actualParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:568:1: actualParameter : ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st);
	public final UnparseBLESS3.actualParameter_return actualParameter() throws RecognitionException {
		UnparseBLESS3.actualParameter_return retval = new UnparseBLESS3.actualParameter_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:569:3: ( ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:570:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_actualParameter3314); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_actualParameter3318); 
			pushFollow(FOLLOW_expression_in_actualParameter3322);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 571:5: -> actual_parameter(formal=$formal.textactual=$actual.st)
			{
				retval.st = templateLib.getInstanceOf("actual_parameter",new STAttrMap().put("formal", (formal!=null?formal.getText():null)).put("actual", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actualParameter"


	public static class namelessAssertion_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namelessAssertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:574:1: namelessAssertion : ( ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st)| ^( ASSERTION DUMMY ) );
	public final UnparseBLESS3.namelessAssertion_return namelessAssertion() throws RecognitionException {
		UnparseBLESS3.namelessAssertion_return retval = new UnparseBLESS3.namelessAssertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:575:3: ( ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st)| ^( ASSERTION DUMMY ) )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==ASSERTION) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==DOWN) ) {
					int LA43_2 = input.LA(3);
					if ( (LA43_2==DUMMY) ) {
						alt43=2;
					}
					else if ( (LA43_2==AADL_STRING_LITERAL||(LA43_2 >= AL && LA43_2 <= AM)||LA43_2==AT_SIGN||LA43_2==CARET||LA43_2==DIVIDE||LA43_2==EQ||LA43_2==EXP||LA43_2==GT||LA43_2==ID||LA43_2==INVOKE||LA43_2==LBRACKET||(LA43_2 >= LITERAL_abs && LA43_2 <= LITERAL_and)||LA43_2==LITERAL_div||LA43_2==LITERAL_else||LA43_2==LITERAL_exists||LA43_2==LITERAL_false||(LA43_2 >= LITERAL_iff && LA43_2 <= LITERAL_in)||LA43_2==LITERAL_mod||(LA43_2 >= LITERAL_not && LA43_2 <= LITERAL_numberof)||LA43_2==LITERAL_or||LA43_2==LITERAL_product||LA43_2==LITERAL_rem||LA43_2==LITERAL_round||LA43_2==LITERAL_sum||LA43_2==LITERAL_then||LA43_2==LITERAL_timeout||LA43_2==LITERAL_tops||(LA43_2 >= LITERAL_true && LA43_2 <= LITERAL_truncate)||(LA43_2 >= LITERAL_xor && LA43_2 <= LT)||LA43_2==MINUS||LA43_2==NEQ||LA43_2==OLD_NEQ||LA43_2==PLUS||LA43_2==PLUS_EQUALS||(LA43_2 >= QUANTITY && LA43_2 <= QUESTION)||LA43_2==RECORD_TERM||LA43_2==TICK||LA43_2==TIMES||LA43_2==UNARY_MINUS) ) {
						alt43=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 43, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
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
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:576:3: ^( ASSERTION pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3361); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_namelessAssertion3365);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 577:5: -> nameless_assertion(a=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("nameless_assertion",new STAttrMap().put("a", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:579:3: ^( ASSERTION DUMMY )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3390); 
					match(input, Token.DOWN, null); 
					match(input,DUMMY,FOLLOW_DUMMY_in_namelessAssertion3392); 
					match(input, Token.UP, null); 

					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessAssertion"


	public static class namelessFunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namelessFunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:582:1: namelessFunction : ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st);
	public final UnparseBLESS3.namelessFunction_return namelessFunction() throws RecognitionException {
		UnparseBLESS3.namelessFunction_return retval = new UnparseBLESS3.namelessFunction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tod =null;
		TreeRuleReturnScope functionvalue =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:583:3: ( ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:584:3: ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
			{
			match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3415); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction3419); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeOrReference_in_namelessFunction3423);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction3429);
			functionvalue=assertionFunctionValue();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 585:5: -> nameless_function(tod=$tod.sta=$functionvalue.st)
			{
				retval.st = templateLib.getInstanceOf("nameless_function",new STAttrMap().put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("a", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessFunction"


	public static class namelessEnumeration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namelessEnumeration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:588:1: namelessEnumeration : ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st);
	public final UnparseBLESS3.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		UnparseBLESS3.namelessEnumeration_return retval = new UnparseBLESS3.namelessEnumeration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope inv =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:589:3: ( ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:590:2: ^( ASSERTION_ENUMERATION inv= invocation )
			{
			match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3467); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_invocation_in_namelessEnumeration3471);
			inv=invocation();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 591:4: -> nameless_enumeration(inv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("nameless_enumeration",new STAttrMap().put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namelessEnumeration"


	public static class assertion_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertion"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:594:1: assertion : (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st});
	public final UnparseBLESS3.assertion_return assertion() throws RecognitionException {
		UnparseBLESS3.assertion_return retval = new UnparseBLESS3.assertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope na =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:594:10: (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st})
			int alt44=4;
			switch ( input.LA(1) ) {
			case ASSERTION:
				{
				int LA44_1 = input.LA(2);
				if ( (LA44_1==DOWN) ) {
					int LA44_4 = input.LA(3);
					if ( (LA44_4==LABEL) ) {
						alt44=1;
					}
					else if ( (LA44_4==AADL_STRING_LITERAL||(LA44_4 >= AL && LA44_4 <= AM)||LA44_4==AT_SIGN||LA44_4==CARET||LA44_4==DIVIDE||LA44_4==DUMMY||LA44_4==EQ||LA44_4==EXP||LA44_4==GT||LA44_4==ID||LA44_4==INVOKE||LA44_4==LBRACKET||(LA44_4 >= LITERAL_abs && LA44_4 <= LITERAL_and)||LA44_4==LITERAL_div||LA44_4==LITERAL_else||LA44_4==LITERAL_exists||LA44_4==LITERAL_false||(LA44_4 >= LITERAL_iff && LA44_4 <= LITERAL_in)||LA44_4==LITERAL_mod||(LA44_4 >= LITERAL_not && LA44_4 <= LITERAL_numberof)||LA44_4==LITERAL_or||LA44_4==LITERAL_product||LA44_4==LITERAL_rem||LA44_4==LITERAL_round||LA44_4==LITERAL_sum||LA44_4==LITERAL_then||LA44_4==LITERAL_timeout||LA44_4==LITERAL_tops||(LA44_4 >= LITERAL_true && LA44_4 <= LITERAL_truncate)||(LA44_4 >= LITERAL_xor && LA44_4 <= LT)||LA44_4==MINUS||LA44_4==NEQ||LA44_4==OLD_NEQ||LA44_4==PLUS||LA44_4==PLUS_EQUALS||(LA44_4 >= QUANTITY && LA44_4 <= QUESTION)||LA44_4==RECORD_TERM||LA44_4==TICK||LA44_4==TIMES||LA44_4==UNARY_MINUS) ) {
						alt44=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 44, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_FUNCTION:
				{
				int LA44_2 = input.LA(2);
				if ( (LA44_2==DOWN) ) {
					int LA44_5 = input.LA(3);
					if ( (LA44_5==LABEL) ) {
						alt44=1;
					}
					else if ( (LA44_5==LITERAL_returns) ) {
						alt44=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 44, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case ASSERTION_ENUMERATION:
				{
				int LA44_3 = input.LA(2);
				if ( (LA44_3==DOWN) ) {
					int LA44_6 = input.LA(3);
					if ( (LA44_6==LABEL) ) {
						alt44=1;
					}
					else if ( (LA44_6==INVOKE) ) {
						alt44=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 44, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 44, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:595:3: na= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertion3500);
					na=namedAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 596:5: -> {$na.st}
					{
						retval.st = (na!=null?((StringTemplate)na.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:597:5: a= namelessAssertion
					{
					pushFollow(FOLLOW_namelessAssertion_in_assertion3516);
					a=namelessAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 598:5: -> {$a.st}
					{
						retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:599:5: f= namelessFunction
					{
					pushFollow(FOLLOW_namelessFunction_in_assertion3532);
					f=namelessFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 600:5: -> {$f.st}
					{
						retval.st = (f!=null?((StringTemplate)f.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:601:5: e= namelessEnumeration
					{
					pushFollow(FOLLOW_namelessEnumeration_in_assertion3548);
					e=namelessEnumeration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 602:5: -> {$e.st}
					{
						retval.st = (e!=null?((StringTemplate)e.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertion"


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:607:1: expression : (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st)|dis= disjunction -> {$dis.st});
	public final UnparseBLESS3.expression_return expression() throws RecognitionException {
		UnparseBLESS3.expression_return retval = new UnparseBLESS3.expression_return();
		retval.start = input.LT(1);

		BAST iff=null;
		BAST imp=null;
		TreeRuleReturnScope all =null;
		TreeRuleReturnScope exists =null;
		TreeRuleReturnScope sum =null;
		TreeRuleReturnScope product =null;
		TreeRuleReturnScope numberof =null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope dis =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:608:2: (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st)|dis= disjunction -> {$dis.st})
			int alt45=8;
			switch ( input.LA(1) ) {
			case LITERAL_all:
				{
				alt45=1;
				}
				break;
			case LITERAL_exists:
				{
				alt45=2;
				}
				break;
			case LITERAL_sum:
				{
				alt45=3;
				}
				break;
			case LITERAL_product:
				{
				alt45=4;
				}
				break;
			case LITERAL_numberof:
				{
				alt45=5;
				}
				break;
			case LITERAL_iff:
				{
				alt45=6;
				}
				break;
			case LITERAL_implies:
				{
				alt45=7;
				}
				break;
			case AADL_STRING_LITERAL:
			case AL:
			case AM:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EQ:
			case EXP:
			case GT:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_and:
			case LITERAL_div:
			case LITERAL_else:
			case LITERAL_false:
			case LITERAL_in:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_or:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_then:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LITERAL_xor:
			case LPAREN:
			case LT:
			case MINUS:
			case NEQ:
			case OLD_NEQ:
			case PLUS:
			case PLUS_EQUALS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt45=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:609:3: all= universalQuantification
					{
					pushFollow(FOLLOW_universalQuantification_in_expression3580);
					all=universalQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 610:5: -> {$all.st}
					{
						retval.st = (all!=null?((StringTemplate)all.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:611:5: exists= existentialQuantification
					{
					pushFollow(FOLLOW_existentialQuantification_in_expression3596);
					exists=existentialQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 612:5: -> {$exists.st}
					{
						retval.st = (exists!=null?((StringTemplate)exists.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:613:5: sum= sumQuantification
					{
					pushFollow(FOLLOW_sumQuantification_in_expression3612);
					sum=sumQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 614:5: -> {$sum.st}
					{
						retval.st = (sum!=null?((StringTemplate)sum.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:615:5: product= productQuantification
					{
					pushFollow(FOLLOW_productQuantification_in_expression3628);
					product=productQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 616:5: -> {$product.st}
					{
						retval.st = (product!=null?((StringTemplate)product.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:617:5: numberof= countingQuantification
					{
					pushFollow(FOLLOW_countingQuantification_in_expression3644);
					numberof=countingQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 618:5: -> {$numberof.st}
					{
						retval.st = (numberof!=null?((StringTemplate)numberof.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:619:5: ^(iff= LITERAL_iff l= disjunction r= disjunction )
					{
					iff=(BAST)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression3662); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3666);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3670);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 620:5: -> relation(r=$iff.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (iff!=null?iff.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:621:5: ^(imp= LITERAL_implies l= disjunction r= disjunction )
					{
					imp=(BAST)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression3705); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3709);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3713);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 622:5: -> relation(r=$imp.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (imp!=null?imp.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:623:5: dis= disjunction
					{
					pushFollow(FOLLOW_disjunction_in_expression3746);
					dis=disjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 624:5: -> {$dis.st}
					{
						retval.st = (dis!=null?((StringTemplate)dis.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class universalQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "universalQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:627:1: universalQuantification : ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st);
	public final UnparseBLESS3.universalQuantification_return universalQuantification() throws RecognitionException {
		UnparseBLESS3.universalQuantification_return retval = new UnparseBLESS3.universalQuantification_return();
		retval.start = input.LT(1);

		BAST a=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:628:3: ( ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:629:3: ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			a=(BAST)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification3773); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_universalQuantification3777);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_universalQuantification3781);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification3785); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_universalQuantification3789);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 630:5: -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("universal_quantification",new STAttrMap().put("a", (a!=null?a.getText():null)).put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("p", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalQuantification"


	public static class in_which_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "in_which"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:633:1: in_which : ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\");
	public final UnparseBLESS3.in_which_return in_which() throws RecognitionException {
		UnparseBLESS3.in_which_return retval = new UnparseBLESS3.in_which_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope b =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:634:3: ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\")
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==LITERAL_in) ) {
				alt46=1;
			}
			else if ( (LA46_0==LITERAL_which) ) {
				alt46=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:635:3: ^( LITERAL_in r= range )
					{
					match(input,LITERAL_in,FOLLOW_LITERAL_in_in_in_which3838); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_range_in_in_which3842);
					r=range();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 636:5: -> template(r=$r.st) \"in <r>\"
					{
						retval.st = new StringTemplate(templateLib, "in <r>",new STAttrMap().put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:638:3: ^( LITERAL_which b= predicate )
					{
					match(input,LITERAL_which,FOLLOW_LITERAL_which_in_in_which3869); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_in_which3873);
					b=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 639:5: -> template(b=$b.st) \"which <b>\"
					{
						retval.st = new StringTemplate(templateLib, "which <b>",new STAttrMap().put("b", (b!=null?((StringTemplate)b.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in_which"


	public static class existentialQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "existentialQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:642:1: existentialQuantification : ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_that pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st);
	public final UnparseBLESS3.existentialQuantification_return existentialQuantification() throws RecognitionException {
		UnparseBLESS3.existentialQuantification_return retval = new UnparseBLESS3.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST e=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:643:3: ( ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_that pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:644:3: ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_that pred= predicate ) )
			{
			e=(BAST)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification3909); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_existentialQuantification3913);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_existentialQuantification3917);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification3921); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_existentialQuantification3925);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 645:5: -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st)
			{
				retval.st = templateLib.getInstanceOf("existential_quantification",new STAttrMap().put("e", (e!=null?e.getText():null)).put("lv2", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d2", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("p2", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialQuantification"


	public static class sumQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sumQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:648:1: sumQuantification : ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.sumQuantification_return sumQuantification() throws RecognitionException {
		UnparseBLESS3.sumQuantification_return retval = new UnparseBLESS3.sumQuantification_return();
		retval.start = input.LT(1);

		BAST s=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:649:3: ( ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:650:3: ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			s=(BAST)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification3976); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_sumQuantification3980);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_sumQuantification3984);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification3988); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sumQuantification3992);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 651:5: -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("s", (s!=null?s.getText():null)).put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("pe", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sumQuantification"


	public static class productQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "productQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:654:1: productQuantification : ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.productQuantification_return productQuantification() throws RecognitionException {
		UnparseBLESS3.productQuantification_return retval = new UnparseBLESS3.productQuantification_return();
		retval.start = input.LT(1);

		BAST p=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:655:3: ( ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:656:3: ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			p=(BAST)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification4044); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_productQuantification4048);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_productQuantification4052);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification4056); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_productQuantification4060);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 657:6: -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("product",new STAttrMap().put("p", (p!=null?p.getText():null)).put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("pe", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "productQuantification"


	public static class countingQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "countingQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:660:1: countingQuantification : ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.countingQuantification_return countingQuantification() throws RecognitionException {
		UnparseBLESS3.countingQuantification_return retval = new UnparseBLESS3.countingQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:661:3: ( ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:662:3: ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) )
			{
			match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification4111); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_countingQuantification4115);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_countingQuantification4119);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification4123); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_countingQuantification4127);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 663:5: -> numberof(lv=$lv.std=$iw.stpe=$ex.st)
			{
				retval.st = templateLib.getInstanceOf("numberof",new STAttrMap().put("lv", (lv!=null?((StringTemplate)lv.getTemplate()):null)).put("d", (iw!=null?((StringTemplate)iw.getTemplate()):null)).put("pe", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "countingQuantification"


	public static class logicVariables_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "logicVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:666:1: logicVariables : ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable -> {$v.st});
	public final UnparseBLESS3.logicVariables_return logicVariables() throws RecognitionException {
		UnparseBLESS3.logicVariables_return retval = new UnparseBLESS3.logicVariables_return();
		retval.start = input.LT(1);

		List<Object> list_lv=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope lv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:667:3: ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable -> {$v.st})
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==COMMA) ) {
				alt48=1;
			}
			else if ( (LA48_0==TILDE) ) {
				alt48=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:3: ^( COMMA (lv+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_logicVariables4174); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:14: (lv+= variable )+
					int cnt47=0;
					loop47:
					while (true) {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==TILDE) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:14: lv+= variable
							{
							pushFollow(FOLLOW_variable_in_logicVariables4178);
							lv=variable();
							state._fsp--;

							if (list_lv==null) list_lv=new ArrayList<Object>();
							list_lv.add(lv.getTemplate());
							}
							break;

						default :
							if ( cnt47 >= 1 ) break loop47;
							EarlyExitException eee = new EarlyExitException(47, input);
							throw eee;
						}
						cnt47++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 669:5: -> variable_list(parameter=$lv)
					{
						retval.st = templateLib.getInstanceOf("variable_list",new STAttrMap().put("parameter", list_lv));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:671:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_logicVariables4204);
					v=variable();
					state._fsp--;

					// TEMPLATE REWRITE
					// 672:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicVariables"


	public static class disjunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "disjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:675:1: disjunction : ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction -> {$con.st});
	public final UnparseBLESS3.disjunction_return disjunction() throws RecognitionException {
		UnparseBLESS3.disjunction_return retval = new UnparseBLESS3.disjunction_return();
		retval.start = input.LT(1);

		List<Object> list_c=null;
		TreeRuleReturnScope con =null;
		RuleReturnScope c = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:676:3: ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction -> {$con.st})
			int alt52=4;
			switch ( input.LA(1) ) {
			case LITERAL_or:
				{
				alt52=1;
				}
				break;
			case LITERAL_else:
				{
				alt52=2;
				}
				break;
			case LITERAL_xor:
				{
				alt52=3;
				}
				break;
			case AADL_STRING_LITERAL:
			case AL:
			case AM:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EQ:
			case EXP:
			case GT:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_and:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_in:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_then:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case LT:
			case MINUS:
			case NEQ:
			case OLD_NEQ:
			case PLUS:
			case PLUS_EQUALS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt52=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:3: ^( LITERAL_or (c+= conjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction4233); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:18: (c+= conjunction )+
					int cnt49=0;
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==AADL_STRING_LITERAL||(LA49_0 >= AL && LA49_0 <= AM)||LA49_0==AT_SIGN||LA49_0==CARET||LA49_0==DIVIDE||LA49_0==EQ||LA49_0==EXP||LA49_0==GT||LA49_0==ID||LA49_0==INVOKE||LA49_0==LBRACKET||LA49_0==LITERAL_abs||LA49_0==LITERAL_and||LA49_0==LITERAL_div||LA49_0==LITERAL_false||LA49_0==LITERAL_in||LA49_0==LITERAL_mod||(LA49_0 >= LITERAL_not && LA49_0 <= LITERAL_null)||LA49_0==LITERAL_rem||LA49_0==LITERAL_round||LA49_0==LITERAL_then||LA49_0==LITERAL_timeout||LA49_0==LITERAL_tops||(LA49_0 >= LITERAL_true && LA49_0 <= LITERAL_truncate)||(LA49_0 >= LPAREN && LA49_0 <= LT)||LA49_0==MINUS||LA49_0==NEQ||LA49_0==OLD_NEQ||LA49_0==PLUS||LA49_0==PLUS_EQUALS||(LA49_0 >= QUANTITY && LA49_0 <= QUESTION)||LA49_0==RECORD_TERM||LA49_0==TICK||LA49_0==TIMES||LA49_0==UNARY_MINUS) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:18: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4237);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt49 >= 1 ) break loop49;
							EarlyExitException eee = new EarlyExitException(49, input);
							throw eee;
						}
						cnt49++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 678:5: -> disjunction(bopt=$c)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_c));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:3: ^( LITERAL_else (c+= conjunction )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction4263); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:20: (c+= conjunction )+
					int cnt50=0;
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==AADL_STRING_LITERAL||(LA50_0 >= AL && LA50_0 <= AM)||LA50_0==AT_SIGN||LA50_0==CARET||LA50_0==DIVIDE||LA50_0==EQ||LA50_0==EXP||LA50_0==GT||LA50_0==ID||LA50_0==INVOKE||LA50_0==LBRACKET||LA50_0==LITERAL_abs||LA50_0==LITERAL_and||LA50_0==LITERAL_div||LA50_0==LITERAL_false||LA50_0==LITERAL_in||LA50_0==LITERAL_mod||(LA50_0 >= LITERAL_not && LA50_0 <= LITERAL_null)||LA50_0==LITERAL_rem||LA50_0==LITERAL_round||LA50_0==LITERAL_then||LA50_0==LITERAL_timeout||LA50_0==LITERAL_tops||(LA50_0 >= LITERAL_true && LA50_0 <= LITERAL_truncate)||(LA50_0 >= LPAREN && LA50_0 <= LT)||LA50_0==MINUS||LA50_0==NEQ||LA50_0==OLD_NEQ||LA50_0==PLUS||LA50_0==PLUS_EQUALS||(LA50_0 >= QUANTITY && LA50_0 <= QUESTION)||LA50_0==RECORD_TERM||LA50_0==TICK||LA50_0==TIMES||LA50_0==UNARY_MINUS) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:20: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4267);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt50 >= 1 ) break loop50;
							EarlyExitException eee = new EarlyExitException(50, input);
							throw eee;
						}
						cnt50++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 681:5: -> cor(t=$c)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_c));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:683:3: ^( LITERAL_xor (c+= conjunction )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction4293); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:683:19: (c+= conjunction )+
					int cnt51=0;
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==AADL_STRING_LITERAL||(LA51_0 >= AL && LA51_0 <= AM)||LA51_0==AT_SIGN||LA51_0==CARET||LA51_0==DIVIDE||LA51_0==EQ||LA51_0==EXP||LA51_0==GT||LA51_0==ID||LA51_0==INVOKE||LA51_0==LBRACKET||LA51_0==LITERAL_abs||LA51_0==LITERAL_and||LA51_0==LITERAL_div||LA51_0==LITERAL_false||LA51_0==LITERAL_in||LA51_0==LITERAL_mod||(LA51_0 >= LITERAL_not && LA51_0 <= LITERAL_null)||LA51_0==LITERAL_rem||LA51_0==LITERAL_round||LA51_0==LITERAL_then||LA51_0==LITERAL_timeout||LA51_0==LITERAL_tops||(LA51_0 >= LITERAL_true && LA51_0 <= LITERAL_truncate)||(LA51_0 >= LPAREN && LA51_0 <= LT)||LA51_0==MINUS||LA51_0==NEQ||LA51_0==OLD_NEQ||LA51_0==PLUS||LA51_0==PLUS_EQUALS||(LA51_0 >= QUANTITY && LA51_0 <= QUESTION)||LA51_0==RECORD_TERM||LA51_0==TICK||LA51_0==TIMES||LA51_0==UNARY_MINUS) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:683:19: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4297);
							c=conjunction();
							state._fsp--;

							if (list_c==null) list_c=new ArrayList<Object>();
							list_c.add(c.getTemplate());
							}
							break;

						default :
							if ( cnt51 >= 1 ) break loop51;
							EarlyExitException eee = new EarlyExitException(51, input);
							throw eee;
						}
						cnt51++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 684:5: -> xor(terms=$c)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_c));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:686:3: con= conjunction
					{
					pushFollow(FOLLOW_conjunction_in_disjunction4323);
					con=conjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 687:5: -> {$con.st}
					{
						retval.st = (con!=null?((StringTemplate)con.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "disjunction"


	public static class conjunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:690:1: conjunction : ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st});
	public final UnparseBLESS3.conjunction_return conjunction() throws RecognitionException {
		UnparseBLESS3.conjunction_return retval = new UnparseBLESS3.conjunction_return();
		retval.start = input.LT(1);

		List<Object> list_r=null;
		TreeRuleReturnScope rel =null;
		RuleReturnScope r = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:691:3: ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st})
			int alt55=3;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt55=1;
				}
				break;
			case LITERAL_then:
				{
				alt55=2;
				}
				break;
			case AADL_STRING_LITERAL:
			case AL:
			case AM:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EQ:
			case EXP:
			case GT:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_in:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case LT:
			case MINUS:
			case NEQ:
			case OLD_NEQ:
			case PLUS:
			case PLUS_EQUALS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt55=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:3: ^( LITERAL_and (r+= relation )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction4351); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:19: (r+= relation )+
					int cnt53=0;
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==AADL_STRING_LITERAL||(LA53_0 >= AL && LA53_0 <= AM)||LA53_0==AT_SIGN||LA53_0==CARET||LA53_0==DIVIDE||LA53_0==EQ||LA53_0==EXP||LA53_0==GT||LA53_0==ID||LA53_0==INVOKE||LA53_0==LBRACKET||LA53_0==LITERAL_abs||LA53_0==LITERAL_div||LA53_0==LITERAL_false||LA53_0==LITERAL_in||LA53_0==LITERAL_mod||(LA53_0 >= LITERAL_not && LA53_0 <= LITERAL_null)||LA53_0==LITERAL_rem||LA53_0==LITERAL_round||LA53_0==LITERAL_timeout||LA53_0==LITERAL_tops||(LA53_0 >= LITERAL_true && LA53_0 <= LITERAL_truncate)||(LA53_0 >= LPAREN && LA53_0 <= LT)||LA53_0==MINUS||LA53_0==NEQ||LA53_0==OLD_NEQ||LA53_0==PLUS||LA53_0==PLUS_EQUALS||(LA53_0 >= QUANTITY && LA53_0 <= QUESTION)||LA53_0==RECORD_TERM||LA53_0==TICK||LA53_0==TIMES||LA53_0==UNARY_MINUS) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:19: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4355);
							r=relation();
							state._fsp--;

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTemplate());
							}
							break;

						default :
							if ( cnt53 >= 1 ) break loop53;
							EarlyExitException eee = new EarlyExitException(53, input);
							throw eee;
						}
						cnt53++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 693:5: -> conjunction(bopt=$r)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_r));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:3: ^( LITERAL_then (r+= relation )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction4381); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:20: (r+= relation )+
					int cnt54=0;
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==AADL_STRING_LITERAL||(LA54_0 >= AL && LA54_0 <= AM)||LA54_0==AT_SIGN||LA54_0==CARET||LA54_0==DIVIDE||LA54_0==EQ||LA54_0==EXP||LA54_0==GT||LA54_0==ID||LA54_0==INVOKE||LA54_0==LBRACKET||LA54_0==LITERAL_abs||LA54_0==LITERAL_div||LA54_0==LITERAL_false||LA54_0==LITERAL_in||LA54_0==LITERAL_mod||(LA54_0 >= LITERAL_not && LA54_0 <= LITERAL_null)||LA54_0==LITERAL_rem||LA54_0==LITERAL_round||LA54_0==LITERAL_timeout||LA54_0==LITERAL_tops||(LA54_0 >= LITERAL_true && LA54_0 <= LITERAL_truncate)||(LA54_0 >= LPAREN && LA54_0 <= LT)||LA54_0==MINUS||LA54_0==NEQ||LA54_0==OLD_NEQ||LA54_0==PLUS||LA54_0==PLUS_EQUALS||(LA54_0 >= QUANTITY && LA54_0 <= QUESTION)||LA54_0==RECORD_TERM||LA54_0==TICK||LA54_0==TIMES||LA54_0==UNARY_MINUS) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:20: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4385);
							r=relation();
							state._fsp--;

							if (list_r==null) list_r=new ArrayList<Object>();
							list_r.add(r.getTemplate());
							}
							break;

						default :
							if ( cnt54 >= 1 ) break loop54;
							EarlyExitException eee = new EarlyExitException(54, input);
							throw eee;
						}
						cnt54++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 696:5: -> cand(t=$r)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_r));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:698:3: rel= relation
					{
					pushFollow(FOLLOW_relation_in_conjunction4411);
					rel=relation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 699:5: -> {$rel.st}
					{
						retval.st = (rel!=null?((StringTemplate)rel.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conjunction"


	public static class relation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:702:2: relation : ( ^(eq= EQ lhs= addSub rhs= addSub ) -> relation(r=$eq.textlhs=$lhs.strhs=$rhs.st)| ^(lt= LT lhs= addSub rhs= addSub ) -> relation(r=$lt.textlhs=$lhs.strhs=$rhs.st)| ^(am= AM lhs= addSub rhs= addSub ) -> relation(r=$am.textlhs=$lhs.strhs=$rhs.st)| ^(al= AL lhs= addSub rhs= addSub ) -> relation(r=$al.textlhs=$lhs.strhs=$rhs.st)| ^(gt= GT lhs= addSub rhs= addSub ) -> relation(r=$gt.textlhs=$lhs.strhs=$rhs.st)| ^(pe= PLUS_EQUALS lhs= addSub rhs= addSub ) -> relation(r=$pe.textlhs=$lhs.strhs=$rhs.st)| ^(ne= NEQ lhs= addSub rhs= addSub ) -> relation(r=$ne.textlhs=$lhs.strhs=$rhs.st)| ^(one= OLD_NEQ lhs= addSub rhs= addSub ) -> relation(r=$one.textlhs=$lhs.strhs=$rhs.st)| ^(in= LITERAL_in lhs= addSub rng= range ) -> relation(r=$in.textlhs=$lhs.strhs=$rng.st)|as= addSub -> {$as.st});
	public final UnparseBLESS3.relation_return relation() throws RecognitionException {
		UnparseBLESS3.relation_return retval = new UnparseBLESS3.relation_return();
		retval.start = input.LT(1);

		BAST eq=null;
		BAST lt=null;
		BAST am=null;
		BAST al=null;
		BAST gt=null;
		BAST pe=null;
		BAST ne=null;
		BAST one=null;
		BAST in=null;
		TreeRuleReturnScope lhs =null;
		TreeRuleReturnScope rhs =null;
		TreeRuleReturnScope rng =null;
		TreeRuleReturnScope as =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:703:3: ( ^(eq= EQ lhs= addSub rhs= addSub ) -> relation(r=$eq.textlhs=$lhs.strhs=$rhs.st)| ^(lt= LT lhs= addSub rhs= addSub ) -> relation(r=$lt.textlhs=$lhs.strhs=$rhs.st)| ^(am= AM lhs= addSub rhs= addSub ) -> relation(r=$am.textlhs=$lhs.strhs=$rhs.st)| ^(al= AL lhs= addSub rhs= addSub ) -> relation(r=$al.textlhs=$lhs.strhs=$rhs.st)| ^(gt= GT lhs= addSub rhs= addSub ) -> relation(r=$gt.textlhs=$lhs.strhs=$rhs.st)| ^(pe= PLUS_EQUALS lhs= addSub rhs= addSub ) -> relation(r=$pe.textlhs=$lhs.strhs=$rhs.st)| ^(ne= NEQ lhs= addSub rhs= addSub ) -> relation(r=$ne.textlhs=$lhs.strhs=$rhs.st)| ^(one= OLD_NEQ lhs= addSub rhs= addSub ) -> relation(r=$one.textlhs=$lhs.strhs=$rhs.st)| ^(in= LITERAL_in lhs= addSub rng= range ) -> relation(r=$in.textlhs=$lhs.strhs=$rng.st)|as= addSub -> {$as.st})
			int alt56=10;
			switch ( input.LA(1) ) {
			case EQ:
				{
				alt56=1;
				}
				break;
			case LT:
				{
				alt56=2;
				}
				break;
			case AM:
				{
				alt56=3;
				}
				break;
			case AL:
				{
				alt56=4;
				}
				break;
			case GT:
				{
				alt56=5;
				}
				break;
			case PLUS_EQUALS:
				{
				alt56=6;
				}
				break;
			case NEQ:
				{
				alt56=7;
				}
				break;
			case OLD_NEQ:
				{
				alt56=8;
				}
				break;
			case LITERAL_in:
				{
				alt56=9;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EXP:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case MINUS:
			case PLUS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt56=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:704:3: ^(eq= EQ lhs= addSub rhs= addSub )
					{
					eq=(BAST)match(input,EQ,FOLLOW_EQ_in_relation4440); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4445);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4449);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 705:5: -> relation(r=$eq.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (eq!=null?eq.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:707:3: ^(lt= LT lhs= addSub rhs= addSub )
					{
					lt=(BAST)match(input,LT,FOLLOW_LT_in_relation4486); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4491);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4495);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 708:5: -> relation(r=$lt.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (lt!=null?lt.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:710:3: ^(am= AM lhs= addSub rhs= addSub )
					{
					am=(BAST)match(input,AM,FOLLOW_AM_in_relation4533); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4538);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4542);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 711:5: -> relation(r=$am.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (am!=null?am.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:713:3: ^(al= AL lhs= addSub rhs= addSub )
					{
					al=(BAST)match(input,AL,FOLLOW_AL_in_relation4580); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4585);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4589);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 714:5: -> relation(r=$al.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (al!=null?al.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:716:3: ^(gt= GT lhs= addSub rhs= addSub )
					{
					gt=(BAST)match(input,GT,FOLLOW_GT_in_relation4627); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4632);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4636);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 717:5: -> relation(r=$gt.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (gt!=null?gt.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:719:3: ^(pe= PLUS_EQUALS lhs= addSub rhs= addSub )
					{
					pe=(BAST)match(input,PLUS_EQUALS,FOLLOW_PLUS_EQUALS_in_relation4674); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4679);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4683);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 720:5: -> relation(r=$pe.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (pe!=null?pe.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:722:3: ^(ne= NEQ lhs= addSub rhs= addSub )
					{
					ne=(BAST)match(input,NEQ,FOLLOW_NEQ_in_relation4721); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4726);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4730);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 723:5: -> relation(r=$ne.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (ne!=null?ne.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:725:3: ^(one= OLD_NEQ lhs= addSub rhs= addSub )
					{
					one=(BAST)match(input,OLD_NEQ,FOLLOW_OLD_NEQ_in_relation4767); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4772);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4776);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 726:5: -> relation(r=$one.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (one!=null?one.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:728:3: ^(in= LITERAL_in lhs= addSub rng= range )
					{
					in=(BAST)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation4811); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4815);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_range_in_relation4819);
					rng=range();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 729:6: -> relation(r=$in.textlhs=$lhs.strhs=$rng.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (in!=null?in.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rng!=null?((StringTemplate)rng.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:731:3: as= addSub
					{
					pushFollow(FOLLOW_addSub_in_relation4853);
					as=addSub();
					state._fsp--;

					// TEMPLATE REWRITE
					// 732:5: -> {$as.st}
					{
						retval.st = (as!=null?((StringTemplate)as.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class range_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "range"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:735:1: range : ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st));
	public final UnparseBLESS3.range_return range() throws RecognitionException {
		UnparseBLESS3.range_return retval = new UnparseBLESS3.range_return();
		retval.start = input.LT(1);

		BAST dd=null;
		BAST cd=null;
		BAST dc=null;
		BAST cc=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:736:3: ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st))
			int alt57=4;
			switch ( input.LA(1) ) {
			case DOTDOT:
				{
				alt57=1;
				}
				break;
			case COMMADOT:
				{
				alt57=2;
				}
				break;
			case DOTCOMMA:
				{
				alt57=3;
				}
				break;
			case COMMACOMMA:
				{
				alt57=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:737:3: ^(dd= DOTDOT lb= subexpression ub= subexpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_range4880); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4884);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4888);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 738:5: -> range(rs=$dd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dd!=null?dd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:740:4: ^(cd= COMMADOT lb= subexpression ub= subexpression )
					{
					cd=(BAST)match(input,COMMADOT,FOLLOW_COMMADOT_in_range4926); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4930);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4934);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 741:5: -> range(rs=$cd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cd!=null?cd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:743:4: ^(dc= DOTCOMMA lb= subexpression ub= subexpression )
					{
					dc=(BAST)match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_range4972); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4976);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4980);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 744:5: -> range(rs=$dc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dc!=null?dc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:746:4: ^(cc= COMMACOMMA lb= subexpression ub= subexpression )
					{
					cc=(BAST)match(input,COMMACOMMA,FOLLOW_COMMACOMMA_in_range5018); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range5022);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range5026);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 747:5: -> range(rs=$cc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cc!=null?cc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "range"


	public static class addSub_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "addSub"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:750:1: addSub : ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st});
	public final UnparseBLESS3.addSub_return addSub() throws RecognitionException {
		UnparseBLESS3.addSub_return retval = new UnparseBLESS3.addSub_return();
		retval.start = input.LT(1);

		List<Object> list_md=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope m =null;
		RuleReturnScope md = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:751:3: ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st})
			int alt59=3;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt59=1;
				}
				break;
			case MINUS:
				{
				alt59=2;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EXP:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_div:
			case LITERAL_false:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt59=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:752:3: ^( PLUS (md+= multDiv )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_addSub5069); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:752:13: (md+= multDiv )+
					int cnt58=0;
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==AADL_STRING_LITERAL||LA58_0==AT_SIGN||LA58_0==CARET||LA58_0==DIVIDE||LA58_0==EXP||LA58_0==ID||LA58_0==INVOKE||LA58_0==LBRACKET||LA58_0==LITERAL_abs||LA58_0==LITERAL_div||LA58_0==LITERAL_false||LA58_0==LITERAL_mod||(LA58_0 >= LITERAL_not && LA58_0 <= LITERAL_null)||LA58_0==LITERAL_rem||LA58_0==LITERAL_round||LA58_0==LITERAL_timeout||LA58_0==LITERAL_tops||(LA58_0 >= LITERAL_true && LA58_0 <= LITERAL_truncate)||LA58_0==LPAREN||(LA58_0 >= QUANTITY && LA58_0 <= QUESTION)||LA58_0==RECORD_TERM||LA58_0==TICK||LA58_0==TIMES||LA58_0==UNARY_MINUS) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:752:13: md+= multDiv
							{
							pushFollow(FOLLOW_multDiv_in_addSub5073);
							md=multDiv();
							state._fsp--;

							if (list_md==null) list_md=new ArrayList<Object>();
							list_md.add(md.getTemplate());
							}
							break;

						default :
							if ( cnt58 >= 1 ) break loop58;
							EarlyExitException eee = new EarlyExitException(58, input);
							throw eee;
						}
						cnt58++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 753:5: -> add(terms=$md)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_md));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:755:3: ^( MINUS l= multDiv r= multDiv )
					{
					match(input,MINUS,FOLLOW_MINUS_in_addSub5099); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_multDiv_in_addSub5103);
					l=multDiv();
					state._fsp--;

					pushFollow(FOLLOW_multDiv_in_addSub5107);
					r=multDiv();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 756:5: -> template(l=$l.str=$r.st) \"<l> - <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> - <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:758:3: m= multDiv
					{
					pushFollow(FOLLOW_multDiv_in_addSub5139);
					m=multDiv();
					state._fsp--;

					// TEMPLATE REWRITE
					// 759:5: -> {$m.st}
					{
						retval.st = (m!=null?((StringTemplate)m.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addSub"


	public static class multDiv_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "multDiv"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:762:1: multDiv : ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st});
	public final UnparseBLESS3.multDiv_return multDiv() throws RecognitionException {
		UnparseBLESS3.multDiv_return retval = new UnparseBLESS3.multDiv_return();
		retval.start = input.LT(1);

		List<Object> list_exp=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;
		RuleReturnScope exp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:763:3: ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st})
			int alt61=6;
			switch ( input.LA(1) ) {
			case TIMES:
				{
				alt61=1;
				}
				break;
			case DIVIDE:
				{
				alt61=2;
				}
				break;
			case LITERAL_div:
				{
				alt61=3;
				}
				break;
			case LITERAL_mod:
				{
				alt61=4;
				}
				break;
			case LITERAL_rem:
				{
				alt61=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case EXP:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_false:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_round:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case UNARY_MINUS:
				{
				alt61=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:764:3: ^( TIMES (exp+= exponentiation )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multDiv5170); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:764:15: (exp+= exponentiation )+
					int cnt60=0;
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==AADL_STRING_LITERAL||LA60_0==AT_SIGN||LA60_0==CARET||LA60_0==EXP||LA60_0==ID||LA60_0==INVOKE||LA60_0==LBRACKET||LA60_0==LITERAL_abs||LA60_0==LITERAL_false||(LA60_0 >= LITERAL_not && LA60_0 <= LITERAL_null)||LA60_0==LITERAL_round||LA60_0==LITERAL_timeout||LA60_0==LITERAL_tops||(LA60_0 >= LITERAL_true && LA60_0 <= LITERAL_truncate)||LA60_0==LPAREN||(LA60_0 >= QUANTITY && LA60_0 <= QUESTION)||LA60_0==RECORD_TERM||LA60_0==TICK||LA60_0==UNARY_MINUS) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:764:15: exp+= exponentiation
							{
							pushFollow(FOLLOW_exponentiation_in_multDiv5174);
							exp=exponentiation();
							state._fsp--;

							if (list_exp==null) list_exp=new ArrayList<Object>();
							list_exp.add(exp.getTemplate());
							}
							break;

						default :
							if ( cnt60 >= 1 ) break loop60;
							EarlyExitException eee = new EarlyExitException(60, input);
							throw eee;
						}
						cnt60++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 765:5: -> multiply(terms=$exp)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_exp));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:767:3: ^( DIVIDE l= exponentiation r= exponentiation )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multDiv5200); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5204);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5208);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 768:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:770:3: ^( LITERAL_div l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_div,FOLLOW_LITERAL_div_in_multDiv5240); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5244);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5248);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 771:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:773:3: ^( LITERAL_mod l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_multDiv5280); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5284);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5288);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 774:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:776:3: ^( LITERAL_rem l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_multDiv5320); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5324);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5328);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 777:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:779:3: e= exponentiation
					{
					pushFollow(FOLLOW_exponentiation_in_multDiv5360);
					e=exponentiation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 780:5: -> {$e.st}
					{
						retval.st = (e!=null?((StringTemplate)e.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multDiv"


	public static class exponentiation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exponentiation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:784:1: exponentiation : ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st});
	public final UnparseBLESS3.exponentiation_return exponentiation() throws RecognitionException {
		UnparseBLESS3.exponentiation_return retval = new UnparseBLESS3.exponentiation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope s =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:785:3: ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st})
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==EXP) ) {
				alt62=1;
			}
			else if ( (LA62_0==AADL_STRING_LITERAL||LA62_0==AT_SIGN||LA62_0==CARET||LA62_0==ID||LA62_0==INVOKE||LA62_0==LBRACKET||LA62_0==LITERAL_abs||LA62_0==LITERAL_false||(LA62_0 >= LITERAL_not && LA62_0 <= LITERAL_null)||LA62_0==LITERAL_round||LA62_0==LITERAL_timeout||LA62_0==LITERAL_tops||(LA62_0 >= LITERAL_true && LA62_0 <= LITERAL_truncate)||LA62_0==LPAREN||(LA62_0 >= QUANTITY && LA62_0 <= QUESTION)||LA62_0==RECORD_TERM||LA62_0==TICK||LA62_0==UNARY_MINUS) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:786:3: ^( EXP l= subexpression r= subexpression )
					{
					match(input,EXP,FOLLOW_EXP_in_exponentiation5392); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_exponentiation5396);
					l=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_exponentiation5400);
					r=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 787:5: -> template(l=$l.str=$r.st) \"<l> ** <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> ** <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:789:3: s= subexpression
					{
					pushFollow(FOLLOW_subexpression_in_exponentiation5432);
					s=subexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 790:5: -> {$s.st}
					{
						retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exponentiation"


	public static class subexpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:793:1: subexpression : ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st});
	public final UnparseBLESS3.subexpression_return subexpression() throws RecognitionException {
		UnparseBLESS3.subexpression_return retval = new UnparseBLESS3.subexpression_return();
		retval.start = input.LT(1);

		BAST n=null;
		BAST m=null;
		BAST s=null;
		BAST t=null;
		BAST r=null;
		TreeRuleReturnScope te =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:794:3: ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st})
			int alt63=6;
			switch ( input.LA(1) ) {
			case LITERAL_not:
				{
				alt63=1;
				}
				break;
			case UNARY_MINUS:
				{
				alt63=2;
				}
				break;
			case LITERAL_abs:
				{
				alt63=3;
				}
				break;
			case LITERAL_truncate:
				{
				alt63=4;
				}
				break;
			case LITERAL_round:
				{
				alt63=5;
				}
				break;
			case AADL_STRING_LITERAL:
			case AT_SIGN:
			case CARET:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
				{
				alt63=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:795:3: ^(n= LITERAL_not te= timedExpression )
					{
					n=(BAST)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5463); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5467);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 796:5: -> unary(sym=$n.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (n!=null?n.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:798:3: ^(m= UNARY_MINUS te= timedExpression )
					{
					m=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_subexpression5499); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5503);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 799:5: -> unary(sym=$m.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (m!=null?m.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:801:3: ^(s= LITERAL_abs te= timedExpression )
					{
					s=(BAST)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5535); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5539);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 802:5: -> unary(sym=$s.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (s!=null?s.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:804:3: ^(t= LITERAL_truncate te= timedExpression )
					{
					t=(BAST)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5571); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5575);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 805:5: -> unary(sym=$t.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (t!=null?t.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:807:3: ^(r= LITERAL_round te= timedExpression )
					{
					r=(BAST)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5607); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5611);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 808:5: -> unary(sym=$r.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (r!=null?r.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:810:3: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5641);
					te=timedExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 811:5: -> {$te.st}
					{
						retval.st = (te!=null?((StringTemplate)te.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subexpression"


	public static class timedExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "timedExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:814:1: timedExpression : ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st});
	public final UnparseBLESS3.timedExpression_return timedExpression() throws RecognitionException {
		UnparseBLESS3.timedExpression_return retval = new UnparseBLESS3.timedExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:815:3: ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st})
			int alt64=4;
			switch ( input.LA(1) ) {
			case TICK:
				{
				int LA64_1 = input.LA(2);
				if ( (LA64_1==DOWN) ) {
					int LA64_5 = input.LA(3);
					if ( (LA64_5==ID) ) {
						int LA64_6 = input.LA(4);
						if ( (LA64_6==ID||LA64_6==LITERAL_count||LA64_6==LITERAL_fresh||LA64_6==LITERAL_updated) ) {
							alt64=4;
						}
						else if ( ((LA64_6 >= DOWN && LA64_6 <= UP)) ) {
							alt64=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 64, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA64_5==AADL_STRING_LITERAL||LA64_5==INVOKE||LA64_5==LBRACKET||LA64_5==LITERAL_false||(LA64_5 >= LITERAL_now && LA64_5 <= LITERAL_null)||LA64_5==LITERAL_timeout||LA64_5==LITERAL_tops||LA64_5==LITERAL_true||LA64_5==LPAREN||(LA64_5 >= QUANTITY && LA64_5 <= QUESTION)||LA64_5==RECORD_TERM||LA64_5==TICK) ) {
						alt64=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 64, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 64, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AT_SIGN:
				{
				alt64=2;
				}
				break;
			case CARET:
				{
				alt64=3;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
				{
				alt64=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:816:3: ^( TICK ts= timedSubject )
					{
					match(input,TICK,FOLLOW_TICK_in_timedExpression5671); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5675);
					ts=timedSubject();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 817:5: -> tick(tp=$ts.st)
					{
						retval.st = templateLib.getInstanceOf("tick",new STAttrMap().put("tp", (ts!=null?((StringTemplate)ts.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:819:3: ^( AT_SIGN ts= timedSubject se= subexpression )
					{
					match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5700); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5704);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_timedExpression5708);
					se=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 820:5: -> at(p=$ts.stt=$se.st)
					{
						retval.st = templateLib.getInstanceOf("at",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("t", (se!=null?((StringTemplate)se.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:822:3: ^( CARET ts= timedSubject ps= periodShift )
					{
					match(input,CARET,FOLLOW_CARET_in_timedExpression5738); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5742);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_timedExpression5746);
					ps=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 823:5: -> caret(p=$ts.stcv=$ps.st)
					{
						retval.st = templateLib.getInstanceOf("caret",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("cv", (ps!=null?((StringTemplate)ps.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:825:3: ts= timedSubject
					{
					pushFollow(FOLLOW_timedSubject_in_timedExpression5776);
					ts=timedSubject();
					state._fsp--;

					// TEMPLATE REWRITE
					// 826:5: -> {$ts.st}
					{
						retval.st = (ts!=null?((StringTemplate)ts.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedExpression"


	public static class timedSubject_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "timedSubject"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:829:1: timedSubject : (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st});
	public final UnparseBLESS3.timedSubject_return timedSubject() throws RecognitionException {
		UnparseBLESS3.timedSubject_return retval = new UnparseBLESS3.timedSubject_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ce =null;
		TreeRuleReturnScope ps =null;
		TreeRuleReturnScope rt =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:830:3: (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st})
			int alt65=5;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				int LA65_1 = input.LA(2);
				if ( (LA65_1==DOWN) ) {
					int LA65_5 = input.LA(3);
					if ( (LA65_5==QQ) ) {
						alt65=1;
					}
					else if ( (LA65_5==AADL_STRING_LITERAL||(LA65_5 >= AL && LA65_5 <= AM)||LA65_5==AT_SIGN||LA65_5==CARET||LA65_5==DIVIDE||LA65_5==EQ||LA65_5==EXP||LA65_5==GT||LA65_5==ID||LA65_5==INVOKE||LA65_5==LBRACKET||(LA65_5 >= LITERAL_abs && LA65_5 <= LITERAL_and)||LA65_5==LITERAL_case||LA65_5==LITERAL_div||LA65_5==LITERAL_else||LA65_5==LITERAL_exists||LA65_5==LITERAL_false||(LA65_5 >= LITERAL_iff && LA65_5 <= LITERAL_in)||LA65_5==LITERAL_mod||(LA65_5 >= LITERAL_not && LA65_5 <= LITERAL_numberof)||LA65_5==LITERAL_or||LA65_5==LITERAL_product||LA65_5==LITERAL_rem||LA65_5==LITERAL_round||LA65_5==LITERAL_sum||LA65_5==LITERAL_then||LA65_5==LITERAL_timeout||LA65_5==LITERAL_tops||(LA65_5 >= LITERAL_true && LA65_5 <= LITERAL_truncate)||(LA65_5 >= LITERAL_xor && LA65_5 <= LT)||LA65_5==MINUS||LA65_5==NEQ||LA65_5==OLD_NEQ||LA65_5==PLUS||LA65_5==PLUS_EQUALS||(LA65_5 >= QUANTITY && LA65_5 <= QUESTION)||LA65_5==RECORD_TERM||LA65_5==TICK||LA65_5==TIMES||LA65_5==UNARY_MINUS) ) {
						alt65=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 65, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 65, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RECORD_TERM:
				{
				alt65=3;
				}
				break;
			case INVOKE:
				{
				alt65=4;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case QUANTITY:
			case QUESTION:
			case TICK:
				{
				alt65=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:831:3: ce= conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5803);
					ce=conditionalExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 832:4: -> {$ce.st}
					{
						retval.st = (ce!=null?((StringTemplate)ce.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:833:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5818);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 834:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:835:5: rt= recordTerm
					{
					pushFollow(FOLLOW_recordTerm_in_timedSubject5835);
					rt=recordTerm();
					state._fsp--;

					// TEMPLATE REWRITE
					// 836:5: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:837:5: inv= invocation
					{
					pushFollow(FOLLOW_invocation_in_timedSubject5851);
					inv=invocation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 838:5: -> {$inv.st}
					{
						retval.st = (inv!=null?((StringTemplate)inv.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:839:5: v= value
					{
					pushFollow(FOLLOW_value_in_timedSubject5869);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 840:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timedSubject"


	public static class periodShift_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "periodShift"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:843:1: periodShift : ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$ie.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st));
	public final UnparseBLESS3.periodShift_return periodShift() throws RecognitionException {
		UnparseBLESS3.periodShift_return retval = new UnparseBLESS3.periodShift_return();
		retval.start = input.LT(1);

		BAST um=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:844:3: ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$ie.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st))
			int alt66=4;
			switch ( input.LA(1) ) {
			case UNARY_MINUS:
				{
				int LA66_1 = input.LA(2);
				if ( (LA66_1==DOWN) ) {
					int LA66_4 = input.LA(3);
					if ( (LA66_4==LPAREN) ) {
						alt66=2;
					}
					else if ( (LA66_4==AADL_STRING_LITERAL||LA66_4==ID||LA66_4==LBRACKET||LA66_4==LITERAL_false||(LA66_4 >= LITERAL_now && LA66_4 <= LITERAL_null)||LA66_4==LITERAL_timeout||LA66_4==LITERAL_tops||LA66_4==LITERAL_true||(LA66_4 >= QUANTITY && LA66_4 <= QUESTION)||LA66_4==TICK) ) {
						alt66=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 66, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case QUANTITY:
			case QUESTION:
			case TICK:
				{
				alt66=3;
				}
				break;
			case LPAREN:
				{
				alt66=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:845:3: ^(um= UNARY_MINUS v= value )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5898); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_value_in_periodShift5902);
					v=value();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 846:5: -> unary(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:848:3: ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5934); 
					match(input, Token.DOWN, null); 
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5938); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5942);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5944); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 849:5: -> unary_paren(sym=$um.textex=$ie.st)
					{
						retval.st = templateLib.getInstanceOf("unary_paren",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (ie!=null?((StringTemplate)ie.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:851:3: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift5976);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 852:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:854:3: ^( LPAREN ie= indexExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5994); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5998);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift6000); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 855:5: -> parentheses(be=$ie.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ie!=null?((StringTemplate)ie.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "periodShift"


	public static class indexExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "indexExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:858:1: indexExpression : ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> - <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps)|l= periodShift -> {$l.st});
	public final UnparseBLESS3.indexExpression_return indexExpression() throws RecognitionException {
		UnparseBLESS3.indexExpression_return retval = new UnparseBLESS3.indexExpression_return();
		retval.start = input.LT(1);

		BAST m=null;
		List<Object> list_ps=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		RuleReturnScope ps = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:859:3: ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> - <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps)|l= periodShift -> {$l.st})
			int alt69=7;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				alt69=1;
				}
				break;
			case LITERAL_div:
				{
				alt69=2;
				}
				break;
			case LITERAL_mod:
				{
				alt69=3;
				}
				break;
			case LITERAL_rem:
				{
				alt69=4;
				}
				break;
			case PLUS:
				{
				alt69=5;
				}
				break;
			case TIMES:
				{
				alt69=6;
				}
				break;
			case AADL_STRING_LITERAL:
			case ID:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LPAREN:
			case QUANTITY:
			case QUESTION:
			case TICK:
			case UNARY_MINUS:
				{
				alt69=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:860:3: ^(m= MINUS l= periodShift r= periodShift )
					{
					m=(BAST)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6036); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6040);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6044);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 861:5: -> template(l=$l.str=$r.st) \"<l> - <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> - <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:863:3: ^(m= LITERAL_div l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6078); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6082);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6086);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 864:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:866:3: ^(m= LITERAL_mod l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6120); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6124);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6128);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 867:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:869:3: ^(m= LITERAL_rem l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6162); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6166);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6170);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 870:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:3: ^( PLUS (ps+= periodShift )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_indexExpression6202); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:13: (ps+= periodShift )+
					int cnt67=0;
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==AADL_STRING_LITERAL||LA67_0==ID||LA67_0==LBRACKET||LA67_0==LITERAL_false||(LA67_0 >= LITERAL_now && LA67_0 <= LITERAL_null)||LA67_0==LITERAL_timeout||LA67_0==LITERAL_tops||LA67_0==LITERAL_true||LA67_0==LPAREN||(LA67_0 >= QUANTITY && LA67_0 <= QUESTION)||LA67_0==TICK||LA67_0==UNARY_MINUS) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:13: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression6206);
							ps=periodShift();
							state._fsp--;

							if (list_ps==null) list_ps=new ArrayList<Object>();
							list_ps.add(ps.getTemplate());
							}
							break;

						default :
							if ( cnt67 >= 1 ) break loop67;
							EarlyExitException eee = new EarlyExitException(67, input);
							throw eee;
						}
						cnt67++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 873:5: -> add(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:875:3: ^( TIMES (ps+= periodShift )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_indexExpression6232); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:875:14: (ps+= periodShift )+
					int cnt68=0;
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==AADL_STRING_LITERAL||LA68_0==ID||LA68_0==LBRACKET||LA68_0==LITERAL_false||(LA68_0 >= LITERAL_now && LA68_0 <= LITERAL_null)||LA68_0==LITERAL_timeout||LA68_0==LITERAL_tops||LA68_0==LITERAL_true||LA68_0==LPAREN||(LA68_0 >= QUANTITY && LA68_0 <= QUESTION)||LA68_0==TICK||LA68_0==UNARY_MINUS) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:875:14: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression6236);
							ps=periodShift();
							state._fsp--;

							if (list_ps==null) list_ps=new ArrayList<Object>();
							list_ps.add(ps.getTemplate());
							}
							break;

						default :
							if ( cnt68 >= 1 ) break loop68;
							EarlyExitException eee = new EarlyExitException(68, input);
							throw eee;
						}
						cnt68++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 876:5: -> multiply(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:878:3: l= periodShift
					{
					pushFollow(FOLLOW_periodShift_in_indexExpression6263);
					l=periodShift();
					state._fsp--;

					// TEMPLATE REWRITE
					// 879:5: -> {$l.st}
					{
						retval.st = (l!=null?((StringTemplate)l.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexExpression"


	public static class conditionalExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditionalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:882:1: conditionalExpression : ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st);
	public final UnparseBLESS3.conditionalExpression_return conditionalExpression() throws RecognitionException {
		UnparseBLESS3.conditionalExpression_return retval = new UnparseBLESS3.conditionalExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope f =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:883:3: ( ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:884:3: ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN )
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression6290); 
			match(input, Token.DOWN, null); 
			match(input,QQ,FOLLOW_QQ_in_conditionalExpression6294); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_conditionalExpression6298);
			pred=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression6302);
			t=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression6306);
			f=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression6311); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 885:5: -> conditional_expression(be=$pred.stt=$t.stf=$f.st)
			{
				retval.st = templateLib.getInstanceOf("conditional_expression",new STAttrMap().put("be", (pred!=null?((StringTemplate)pred.getTemplate()):null)).put("t", (t!=null?((StringTemplate)t.getTemplate()):null)).put("f", (f!=null?((StringTemplate)f.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionalExpression"


	public static class parenthesizedSubexpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "parenthesizedSubexpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:888:1: parenthesizedSubexpression : ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st));
	public final UnparseBLESS3.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		UnparseBLESS3.parenthesizedSubexpression_return retval = new UnparseBLESS3.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope ce =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:889:3: ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st))
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==LPAREN) ) {
				int LA70_1 = input.LA(2);
				if ( (LA70_1==DOWN) ) {
					int LA70_2 = input.LA(3);
					if ( (LA70_2==AADL_STRING_LITERAL||(LA70_2 >= AL && LA70_2 <= AM)||LA70_2==AT_SIGN||LA70_2==CARET||LA70_2==DIVIDE||LA70_2==EQ||LA70_2==EXP||LA70_2==GT||LA70_2==ID||LA70_2==INVOKE||LA70_2==LBRACKET||(LA70_2 >= LITERAL_abs && LA70_2 <= LITERAL_and)||LA70_2==LITERAL_div||LA70_2==LITERAL_else||LA70_2==LITERAL_exists||LA70_2==LITERAL_false||(LA70_2 >= LITERAL_iff && LA70_2 <= LITERAL_in)||LA70_2==LITERAL_mod||(LA70_2 >= LITERAL_not && LA70_2 <= LITERAL_numberof)||LA70_2==LITERAL_or||LA70_2==LITERAL_product||LA70_2==LITERAL_rem||LA70_2==LITERAL_round||LA70_2==LITERAL_sum||LA70_2==LITERAL_then||LA70_2==LITERAL_timeout||LA70_2==LITERAL_tops||(LA70_2 >= LITERAL_true && LA70_2 <= LITERAL_truncate)||(LA70_2 >= LITERAL_xor && LA70_2 <= LT)||LA70_2==MINUS||LA70_2==NEQ||LA70_2==OLD_NEQ||LA70_2==PLUS||LA70_2==PLUS_EQUALS||(LA70_2 >= QUANTITY && LA70_2 <= QUESTION)||LA70_2==RECORD_TERM||LA70_2==TICK||LA70_2==TIMES||LA70_2==UNARY_MINUS) ) {
						alt70=1;
					}
					else if ( (LA70_2==LITERAL_case) ) {
						alt70=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 70, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 70, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}

			switch (alt70) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:890:3: ^( LPAREN ex= expression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6357); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6361);
					ex=expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6363); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 891:5: -> parentheses(be=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:896:3: ^( LPAREN ce= caseExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6392); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6396);
					ce=caseExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6398); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 897:5: -> parentheses(be=$ce.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ce!=null?((StringTemplate)ce.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parenthesizedSubexpression"


	public static class caseExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:900:1: caseExpression : ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc);
	public final UnparseBLESS3.caseExpression_return caseExpression() throws RecognitionException {
		UnparseBLESS3.caseExpression_return retval = new UnparseBLESS3.caseExpression_return();
		retval.start = input.LT(1);

		List<Object> list_cc=null;
		RuleReturnScope cc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:901:3: ( ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:902:3: ^( LITERAL_case (cc+= caseChoice )+ )
			{
			match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6432); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:902:21: (cc+= caseChoice )+
			int cnt71=0;
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==IMP) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:902:21: cc+= caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6436);
					cc=caseChoice();
					state._fsp--;

					if (list_cc==null) list_cc=new ArrayList<Object>();
					list_cc.add(cc.getTemplate());
					}
					break;

				default :
					if ( cnt71 >= 1 ) break loop71;
					EarlyExitException eee = new EarlyExitException(71, input);
					throw eee;
				}
				cnt71++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 903:5: -> case_expression(cc=$cc)
			{
				retval.st = templateLib.getInstanceOf("case_expression",new STAttrMap().put("cc", list_cc));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseExpression"


	public static class caseChoice_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseChoice"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:906:1: caseChoice : ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st);
	public final UnparseBLESS3.caseChoice_return caseChoice() throws RecognitionException {
		UnparseBLESS3.caseChoice_return retval = new UnparseBLESS3.caseChoice_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope bool =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:907:3: ( ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:908:3: ^( IMP bool= expression exp= expression )
			{
			match(input,IMP,FOLLOW_IMP_in_caseChoice6469); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_caseChoice6473);
			bool=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_caseChoice6477);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 909:5: -> case_choice(be=$bool.stexp=$exp.st)
			{
				retval.st = templateLib.getInstanceOf("case_choice",new STAttrMap().put("be", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("exp", (exp!=null?((StringTemplate)exp.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseChoice"


	public static class recordTerm_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:912:1: recordTerm : ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv);
	public final UnparseBLESS3.recordTerm_return recordTerm() throws RecognitionException {
		UnparseBLESS3.recordTerm_return retval = new UnparseBLESS3.recordTerm_return();
		retval.start = input.LT(1);

		BAST typeid=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:913:3: ( ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:3: ^( RECORD_TERM typeid= ID (prv+= recordValue )+ )
			{
			match(input,RECORD_TERM,FOLLOW_RECORD_TERM_in_recordTerm6518); 
			match(input, Token.DOWN, null); 
			typeid=(BAST)match(input,ID,FOLLOW_ID_in_recordTerm6522); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:31: (prv+= recordValue )+
			int cnt72=0;
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==ARROW) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:914:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6526);
					prv=recordValue();
					state._fsp--;

					if (list_prv==null) list_prv=new ArrayList<Object>();
					list_prv.add(prv.getTemplate());
					}
					break;

				default :
					if ( cnt72 >= 1 ) break loop72;
					EarlyExitException eee = new EarlyExitException(72, input);
					throw eee;
				}
				cnt72++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 915:5: -> record_term(typeid=$typeid.textprv=$prv)
			{
				retval.st = templateLib.getInstanceOf("record_term",new STAttrMap().put("typeid", (typeid!=null?typeid.getText():null)).put("prv", list_prv));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordTerm"


	public static class recordValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recordValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:918:1: recordValue : ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st);
	public final UnparseBLESS3.recordValue_return recordValue() throws RecognitionException {
		UnparseBLESS3.recordValue_return retval = new UnparseBLESS3.recordValue_return();
		retval.start = input.LT(1);

		BAST field=null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:919:3: ( ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:920:3: ^( ARROW field= ID v= value )
			{
			match(input,ARROW,FOLLOW_ARROW_in_recordValue6565); 
			match(input, Token.DOWN, null); 
			field=(BAST)match(input,ID,FOLLOW_ID_in_recordValue6569); 
			pushFollow(FOLLOW_value_in_recordValue6573);
			v=value();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 921:5: -> record_value(id=$field.textv=$v.st)
			{
				retval.st = templateLib.getInstanceOf("record_value",new STAttrMap().put("id", (field!=null?field.getText():null)).put("v", (v!=null?((StringTemplate)v.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recordValue"


	public static class predicate_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "predicate"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:924:1: predicate : exp= expression -> {$exp.st};
	public final UnparseBLESS3.predicate_return predicate() throws RecognitionException {
		UnparseBLESS3.predicate_return retval = new UnparseBLESS3.predicate_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:925:3: (exp= expression -> {$exp.st})
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:926:3: exp= expression
			{
			pushFollow(FOLLOW_expression_in_predicate6612);
			exp=expression();
			state._fsp--;

			// TEMPLATE REWRITE
			// 927:5: -> {$exp.st}
			{
				retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predicate"


	public static class value_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "value"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:932:1: value : (vn= valueName -> {$vn.st}|ev= enumerationValue -> {$ev.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}});
	public final UnparseBLESS3.value_return value() throws RecognitionException {
		UnparseBLESS3.value_return retval = new UnparseBLESS3.value_return();
		retval.start = input.LT(1);

		BAST to=null;
		BAST n=null;
		BAST t=null;
		TreeRuleReturnScope vn =null;
		TreeRuleReturnScope ev =null;
		TreeRuleReturnScope c =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:933:3: (vn= valueName -> {$vn.st}|ev= enumerationValue -> {$ev.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}})
			int alt73=6;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
				{
				alt73=1;
				}
				break;
			case TICK:
				{
				int LA73_2 = input.LA(2);
				if ( (LA73_2==DOWN) ) {
					int LA73_7 = input.LA(3);
					if ( (LA73_7==ID) ) {
						int LA73_8 = input.LA(4);
						if ( (LA73_8==LITERAL_count||LA73_8==LITERAL_fresh||LA73_8==LITERAL_updated) ) {
							alt73=1;
						}
						else if ( (LA73_8==ID) ) {
							alt73=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 73, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 73, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 73, 2, input);
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
			case LITERAL_true:
			case QUANTITY:
				{
				alt73=3;
				}
				break;
			case LITERAL_timeout:
				{
				alt73=4;
				}
				break;
			case LITERAL_now:
				{
				alt73=5;
				}
				break;
			case LITERAL_tops:
				{
				alt73=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:934:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_value6641);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 935:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:937:3: ev= enumerationValue
					{
					pushFollow(FOLLOW_enumerationValue_in_value6659);
					ev=enumerationValue();
					state._fsp--;

					// TEMPLATE REWRITE
					// 938:5: -> {$ev.st}
					{
						retval.st = (ev!=null?((StringTemplate)ev.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:940:3: c= constant
					{
					pushFollow(FOLLOW_constant_in_value6677);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 941:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:943:3: to= LITERAL_timeout
					{
					to=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6695); 
					// TEMPLATE REWRITE
					// 944:5: -> {%{$to.text}}
					{
						retval.st = new StringTemplate(templateLib,(to!=null?to.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:946:3: n= LITERAL_now
					{
					n=(BAST)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6713); 
					// TEMPLATE REWRITE
					// 947:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:949:3: t= LITERAL_tops
					{
					t=(BAST)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6731); 
					// TEMPLATE REWRITE
					// 950:5: -> {%{$t.text}}
					{
						retval.st = new StringTemplate(templateLib,(t!=null?t.getText():null));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class valueName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "valueName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:953:1: valueName : ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID DOLLAR ) -> function_call(f=$id.text)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}});
	public final UnparseBLESS3.valueName_return valueName() throws RecognitionException {
		UnparseBLESS3.valueName_return retval = new UnparseBLESS3.valueName_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST q=null;
		List<Object> list_array_index=null;
		List<Object> list_pn=null;
		TreeRuleReturnScope pr =null;
		RuleReturnScope array_index = null;
		RuleReturnScope pn = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:954:3: ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID DOLLAR ) -> function_call(f=$id.text)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}})
			int alt77=9;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA77_1 = input.LA(2);
				if ( (LA77_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case DOLLAR:
						{
						int LA77_7 = input.LA(4);
						if ( (LA77_7==UP) ) {
							alt77=2;
						}
						else if ( (LA77_7==COLON||LA77_7==COMMA) ) {
							alt77=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 77, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LBRACKET:
						{
						alt77=3;
						}
						break;
					case DOT:
						{
						alt77=4;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 77, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else if ( ((LA77_1 >= UP && LA77_1 <= AADL_STRING_LITERAL)||LA77_1==ACTION||(LA77_1 >= AL && LA77_1 <= AM)||LA77_1==AT_SIGN||(LA77_1 >= CARET && LA77_1 <= COLON)||(LA77_1 >= COMMACOMMA && LA77_1 <= COMMADOT)||LA77_1==DIVIDE||(LA77_1 >= DOTCOMMA && LA77_1 <= DOTDOT)||LA77_1==EQ||LA77_1==EXP||LA77_1==GT||LA77_1==ID||(LA77_1 >= INVARIANT && LA77_1 <= INVOKE)||LA77_1==LBRACKET||(LA77_1 >= LITERAL_abs && LA77_1 <= LITERAL_any)||LA77_1==LITERAL_div||LA77_1==LITERAL_else||LA77_1==LITERAL_exists||LA77_1==LITERAL_false||(LA77_1 >= LITERAL_iff && LA77_1 <= LITERAL_in)||LA77_1==LITERAL_mod||(LA77_1 >= LITERAL_not && LA77_1 <= LITERAL_numberof)||LA77_1==LITERAL_or||LA77_1==LITERAL_product||LA77_1==LITERAL_rem||(LA77_1 >= LITERAL_round && LA77_1 <= LITERAL_scalar)||LA77_1==LITERAL_sum||LA77_1==LITERAL_then||LA77_1==LITERAL_timeout||LA77_1==LITERAL_tops||(LA77_1 >= LITERAL_true && LA77_1 <= LITERAL_truncate)||LA77_1==LITERAL_whole||(LA77_1 >= LITERAL_xor && LA77_1 <= LT)||LA77_1==MINUS||LA77_1==NEQ||LA77_1==OLD_NEQ||LA77_1==PLUS||LA77_1==PLUS_EQUALS||(LA77_1 >= QUANTITY && LA77_1 <= QUESTION)||LA77_1==RECORD_TERM||LA77_1==RPAREN||LA77_1==TICK||LA77_1==TIMES||LA77_1==UNARY_MINUS) ) {
					alt77=9;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case QUESTION:
				{
				alt77=5;
				}
				break;
			case TICK:
				{
				int LA77_3 = input.LA(2);
				if ( (LA77_3==DOWN) ) {
					int LA77_6 = input.LA(3);
					if ( (LA77_6==ID) ) {
						switch ( input.LA(4) ) {
						case LITERAL_fresh:
							{
							alt77=6;
							}
							break;
						case LITERAL_count:
							{
							alt77=7;
							}
							break;
						case LITERAL_updated:
							{
							alt77=8;
							}
							break;
						default:
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 77, 10, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 77, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:3: ^(id= ID DOLLAR pr= functionParameters )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6758); 
					match(input, Token.DOWN, null); 
					match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6760); 
					pushFollow(FOLLOW_functionParameters_in_valueName6764);
					pr=functionParameters();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 956:5: -> function_call(f=$id.textpl=$pr.st)
					{
						retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (pr!=null?((StringTemplate)pr.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:958:3: ^(id= ID DOLLAR )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6796); 
					match(input, Token.DOWN, null); 
					match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6798); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 959:5: -> function_call(f=$id.text)
					{
						retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:3: ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6825); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6829); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:35: (array_index+= indexExpressionOrRange )+
					int cnt74=0;
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==AADL_STRING_LITERAL||LA74_0==DOTDOT||LA74_0==ID||LA74_0==LBRACKET||LA74_0==LITERAL_div||LA74_0==LITERAL_false||LA74_0==LITERAL_mod||(LA74_0 >= LITERAL_now && LA74_0 <= LITERAL_null)||LA74_0==LITERAL_rem||LA74_0==LITERAL_timeout||LA74_0==LITERAL_tops||LA74_0==LITERAL_true||LA74_0==LPAREN||LA74_0==MINUS||LA74_0==PLUS||(LA74_0 >= QUANTITY && LA74_0 <= QUESTION)||LA74_0==TICK||LA74_0==TIMES||LA74_0==UNARY_MINUS) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:35: array_index+= indexExpressionOrRange
							{
							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6833);
							array_index=indexExpressionOrRange();
							state._fsp--;

							if (list_array_index==null) list_array_index=new ArrayList<Object>();
							list_array_index.add(array_index.getTemplate());
							}
							break;

						default :
							if ( cnt74 >= 1 ) break loop74;
							EarlyExitException eee = new EarlyExitException(74, input);
							throw eee;
						}
						cnt74++;
					}

					match(input, Token.UP, null); 

					match(input,DOT,FOLLOW_DOT_in_valueName6840); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:72: (pn+= partialName )*
						loop75:
						while (true) {
							int alt75=2;
							int LA75_0 = input.LA(1);
							if ( (LA75_0==ID) ) {
								alt75=1;
							}

							switch (alt75) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:72: pn+= partialName
								{
								pushFollow(FOLLOW_partialName_in_valueName6844);
								pn=partialName();
								state._fsp--;

								if (list_pn==null) list_pn=new ArrayList<Object>();
								list_pn.add(pn.getTemplate());
								}
								break;

							default :
								break loop75;
							}
						}

						match(input, Token.UP, null); 
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 962:5: -> name(id=$id.textindex=$array_indexrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("index", list_array_index).put("rec", list_pn));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:964:3: ^(id= ID ^( DOT (pn+= partialName )+ ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6885); 
					match(input, Token.DOWN, null); 
					match(input,DOT,FOLLOW_DOT_in_valueName6889); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:964:21: (pn+= partialName )+
					int cnt76=0;
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==ID) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:964:21: pn+= partialName
							{
							pushFollow(FOLLOW_partialName_in_valueName6893);
							pn=partialName();
							state._fsp--;

							if (list_pn==null) list_pn=new ArrayList<Object>();
							list_pn.add(pn.getTemplate());
							}
							break;

						default :
							if ( cnt76 >= 1 ) break loop76;
							EarlyExitException eee = new EarlyExitException(76, input);
							throw eee;
						}
						cnt76++;
					}

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 965:5: -> name(id=$id.textrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("rec", list_pn));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:967:3: ^(q= QUESTION id= ID )
					{
					q=(BAST)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6929); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6933); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 968:5: -> template(id=$id.text) \"<id>?\"
					{
						retval.st = new StringTemplate(templateLib, "<id>?",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:970:3: ^( TICK id= ID LITERAL_fresh )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6960); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6964); 
					match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6966); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 971:5: -> port_fresh(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_fresh",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:973:3: ^( TICK id= ID LITERAL_count )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6991); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6995); 
					match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6997); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 974:5: -> port_count(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_count",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:976:3: ^( TICK id= ID LITERAL_updated )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName7022); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName7026); 
					match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName7028); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 977:5: -> port_updated(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_updated",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:979:3: id= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName7053); 
					// TEMPLATE REWRITE
					// 980:5: -> {%{$id.text}}
					{
						retval.st = new StringTemplate(templateLib,(id!=null?id.getText():null));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueName"


	public static class functionParameters_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionParameters"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:983:1: functionParameters : ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st});
	public final UnparseBLESS3.functionParameters_return functionParameters() throws RecognitionException {
		UnparseBLESS3.functionParameters_return retval = new UnparseBLESS3.functionParameters_return();
		retval.start = input.LT(1);

		List<Object> list_parameters=null;
		TreeRuleReturnScope parameter =null;
		RuleReturnScope parameters = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:984:3: ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st})
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==COMMA) ) {
				alt78=1;
			}
			else if ( (LA78_0==COLON) ) {
				alt78=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:985:3: ^( COMMA parameters+= formalExpressionPair )
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParameters7078); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters7082);
					parameters=formalExpressionPair();
					state._fsp--;

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTemplate());
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 986:5: -> array_range_list(r=$parameters)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_parameters));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:988:3: parameter= formalExpressionPair
					{
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters7107);
					parameter=formalExpressionPair();
					state._fsp--;

					// TEMPLATE REWRITE
					// 989:5: -> {$parameter.st}
					{
						retval.st = (parameter!=null?((StringTemplate)parameter.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionParameters"


	public static class formalExpressionPair_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalExpressionPair"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:992:1: formalExpressionPair : ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st);
	public final UnparseBLESS3.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		UnparseBLESS3.formalExpressionPair_return retval = new UnparseBLESS3.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:993:3: ( ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:994:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_formalExpressionPair7132); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_formalExpressionPair7136); 
			pushFollow(FOLLOW_expression_in_formalExpressionPair7140);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 995:5: -> formal_actual(f=$formal.textap=$actual.st)
			{
				retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalExpressionPair"


	public static class indexExpressionOrRange_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "indexExpressionOrRange"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:998:1: indexExpressionOrRange : ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st});
	public final UnparseBLESS3.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		UnparseBLESS3.indexExpressionOrRange_return retval = new UnparseBLESS3.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST dd=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope index =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:999:3: ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st})
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==DOTDOT) ) {
				alt79=1;
			}
			else if ( (LA79_0==AADL_STRING_LITERAL||LA79_0==ID||LA79_0==LBRACKET||LA79_0==LITERAL_div||LA79_0==LITERAL_false||LA79_0==LITERAL_mod||(LA79_0 >= LITERAL_now && LA79_0 <= LITERAL_null)||LA79_0==LITERAL_rem||LA79_0==LITERAL_timeout||LA79_0==LITERAL_tops||LA79_0==LITERAL_true||LA79_0==LPAREN||LA79_0==MINUS||LA79_0==PLUS||(LA79_0 >= QUANTITY && LA79_0 <= QUESTION)||LA79_0==TICK||LA79_0==TIMES||LA79_0==UNARY_MINUS) ) {
				alt79=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1000:3: ^(dd= DOTDOT lb= indexExpression ub= indexExpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange7183); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange7187);
					lb=indexExpression();
					state._fsp--;

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange7191);
					ub=indexExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1001:5: -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (dd!=null?dd.getText():null)).put("lhs", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("rhs", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1003:3: index= indexExpression
					{
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange7226);
					index=indexExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1004:5: -> {$index.st}
					{
						retval.st = (index!=null?((StringTemplate)index.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "indexExpressionOrRange"


	public static class partialName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "partialName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1007:1: partialName : ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}});
	public final UnparseBLESS3.partialName_return partialName() throws RecognitionException {
		UnparseBLESS3.partialName_return retval = new UnparseBLESS3.partialName_return();
		retval.start = input.LT(1);

		BAST record_id=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1008:3: ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}})
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==ID) ) {
				int LA80_1 = input.LA(2);
				if ( (LA80_1==DOWN) ) {
					alt80=1;
				}
				else if ( (LA80_1==UP||LA80_1==ID) ) {
					alt80=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1009:3: ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) )
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName7253); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName7257); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName7261);
					array_index=indexExpressionOrRange();
					state._fsp--;

					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTemplate());
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1010:5: -> partial_name(i=$record_id.textp=$array_index)
					{
						retval.st = templateLib.getInstanceOf("partial_name",new STAttrMap().put("i", (record_id!=null?record_id.getText():null)).put("p", list_array_index));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1012:3: record_id= ID
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName7293); 
					// TEMPLATE REWRITE
					// 1013:5: -> {%{$record_id.text}}
					{
						retval.st = new StringTemplate(templateLib,(record_id!=null?record_id.getText():null));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partialName"


	public static class constant_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constant"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1017:1: constant : (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}}|nnp= nonNumericProperty -> {$nnp.st});
	public final UnparseBLESS3.constant_return constant() throws RecognitionException {
		UnparseBLESS3.constant_return retval = new UnparseBLESS3.constant_return();
		retval.start = input.LT(1);

		BAST s=null;
		BAST t=null;
		BAST f=null;
		BAST n=null;
		TreeRuleReturnScope q =null;
		TreeRuleReturnScope nnp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1018:3: (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}}|nnp= nonNumericProperty -> {$nnp.st})
			int alt81=6;
			switch ( input.LA(1) ) {
			case QUANTITY:
				{
				alt81=1;
				}
				break;
			case AADL_STRING_LITERAL:
				{
				alt81=2;
				}
				break;
			case LITERAL_true:
				{
				alt81=3;
				}
				break;
			case LITERAL_false:
				{
				alt81=4;
				}
				break;
			case LITERAL_null:
				{
				alt81=5;
				}
				break;
			case LBRACKET:
				{
				alt81=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1019:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_constant7320);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1020:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1022:3: s= AADL_STRING_LITERAL
					{
					s=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant7338); 
					// TEMPLATE REWRITE
					// 1023:5: -> {%{$s.text}}
					{
						retval.st = new StringTemplate(templateLib,(s!=null?s.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1025:3: t= LITERAL_true
					{
					t=(BAST)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant7356); 
					// TEMPLATE REWRITE
					// 1026:5: -> {%{$t.text}}
					{
						retval.st = new StringTemplate(templateLib,(t!=null?t.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1028:3: f= LITERAL_false
					{
					f=(BAST)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant7374); 
					// TEMPLATE REWRITE
					// 1029:5: -> {%{$f.text}}
					{
						retval.st = new StringTemplate(templateLib,(f!=null?f.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1031:3: n= LITERAL_null
					{
					n=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant7392); 
					// TEMPLATE REWRITE
					// 1032:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1034:3: nnp= nonNumericProperty
					{
					pushFollow(FOLLOW_nonNumericProperty_in_constant7412);
					nnp=nonNumericProperty();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1035:5: -> {$nnp.st}
					{
						retval.st = (nnp!=null?((StringTemplate)nnp.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class nonNumericProperty_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "nonNumericProperty"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1038:1: nonNumericProperty : ^( LBRACKET pv= propertyValue RCON ty= type ) -> nonNumericProperty(pv=$pv.stty=$ty.st);
	public final UnparseBLESS3.nonNumericProperty_return nonNumericProperty() throws RecognitionException {
		UnparseBLESS3.nonNumericProperty_return retval = new UnparseBLESS3.nonNumericProperty_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pv =null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1038:19: ( ^( LBRACKET pv= propertyValue RCON ty= type ) -> nonNumericProperty(pv=$pv.stty=$ty.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1039:3: ^( LBRACKET pv= propertyValue RCON ty= type )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_nonNumericProperty7436); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_propertyValue_in_nonNumericProperty7441);
			pv=propertyValue();
			state._fsp--;

			match(input,RCON,FOLLOW_RCON_in_nonNumericProperty7443); 
			pushFollow(FOLLOW_type_in_nonNumericProperty7447);
			ty=type();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1040:5: -> nonNumericProperty(pv=$pv.stty=$ty.st)
			{
				retval.st = templateLib.getInstanceOf("nonNumericProperty",new STAttrMap().put("pv", (pv!=null?((StringTemplate)pv.getTemplate()):null)).put("ty", (ty!=null?((StringTemplate)ty.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nonNumericProperty"


	public static class quantity_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantity"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1043:1: quantity : ( ^( QUANTITY num= aNumber ) -> quantity(num=$num.st)| ^( QUANTITY num= aNumber unit= ID ) -> quantity(num=$num.stunit=$unit.text)| ^( QUANTITY num= aNumber sc= LITERAL_scalar ) -> quantity(num=$num.stunit=$sc.text)| ^( QUANTITY num= aNumber wh= LITERAL_whole ) -> quantity(num=$num.stunit=$wh.text));
	public final UnparseBLESS3.quantity_return quantity() throws RecognitionException {
		UnparseBLESS3.quantity_return retval = new UnparseBLESS3.quantity_return();
		retval.start = input.LT(1);

		BAST unit=null;
		BAST sc=null;
		BAST wh=null;
		TreeRuleReturnScope num =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1044:3: ( ^( QUANTITY num= aNumber ) -> quantity(num=$num.st)| ^( QUANTITY num= aNumber unit= ID ) -> quantity(num=$num.stunit=$unit.text)| ^( QUANTITY num= aNumber sc= LITERAL_scalar ) -> quantity(num=$num.stunit=$sc.text)| ^( QUANTITY num= aNumber wh= LITERAL_whole ) -> quantity(num=$num.stunit=$wh.text))
			int alt82=4;
			alt82 = dfa82.predict(input);
			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1045:3: ^( QUANTITY num= aNumber )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7484); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7488);
					num=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1046:5: -> quantity(num=$num.st)
					{
						retval.st = templateLib.getInstanceOf("quantity",new STAttrMap().put("num", (num!=null?((StringTemplate)num.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1048:3: ^( QUANTITY num= aNumber unit= ID )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7513); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7517);
					num=aNumber();
					state._fsp--;

					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantity7521); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1049:5: -> quantity(num=$num.stunit=$unit.text)
					{
						retval.st = templateLib.getInstanceOf("quantity",new STAttrMap().put("num", (num!=null?((StringTemplate)num.getTemplate()):null)).put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1051:3: ^( QUANTITY num= aNumber sc= LITERAL_scalar )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7552); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7556);
					num=aNumber();
					state._fsp--;

					sc=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7560); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1052:5: -> quantity(num=$num.stunit=$sc.text)
					{
						retval.st = templateLib.getInstanceOf("quantity",new STAttrMap().put("num", (num!=null?((StringTemplate)num.getTemplate()):null)).put("unit", (sc!=null?sc.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:3: ^( QUANTITY num= aNumber wh= LITERAL_whole )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7591); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7595);
					num=aNumber();
					state._fsp--;

					wh=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7599); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1055:5: -> quantity(num=$num.stunit=$wh.text)
					{
						retval.st = templateLib.getInstanceOf("quantity",new STAttrMap().put("num", (num!=null?((StringTemplate)num.getTemplate()):null)).put("unit", (wh!=null?wh.getText():null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantity"


	public static class aNumber_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "aNumber"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1058:1: aNumber : (lit= NUMBER -> {%{$lit.text}}|pv= propertyValue -> {$pv.st});
	public final UnparseBLESS3.aNumber_return aNumber() throws RecognitionException {
		UnparseBLESS3.aNumber_return retval = new UnparseBLESS3.aNumber_return();
		retval.start = input.LT(1);

		BAST lit=null;
		TreeRuleReturnScope pv =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1058:8: (lit= NUMBER -> {%{$lit.text}}|pv= propertyValue -> {$pv.st})
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==NUMBER) ) {
				alt83=1;
			}
			else if ( (LA83_0==DOUBLE_COLON||LA83_0==OCTOTHORPE) ) {
				alt83=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1059:2: lit= NUMBER
					{
					lit=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7638); 
					// TEMPLATE REWRITE
					// 1060:4: -> {%{$lit.text}}
					{
						retval.st = new StringTemplate(templateLib,(lit!=null?lit.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1061:4: pv= propertyValue
					{
					pushFollow(FOLLOW_propertyValue_in_aNumber7652);
					pv=propertyValue();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1062:4: -> {$pv.st}
					{
						retval.st = (pv!=null?((StringTemplate)pv.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aNumber"


	public static class propertyValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyValue"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1065:1: propertyValue : (property= propertyReference -> {$property.st}|propertyConstant= propertyName -> {$propertyConstant.st});
	public final UnparseBLESS3.propertyValue_return propertyValue() throws RecognitionException {
		UnparseBLESS3.propertyValue_return retval = new UnparseBLESS3.propertyValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope property =null;
		TreeRuleReturnScope propertyConstant =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1065:14: (property= propertyReference -> {$property.st}|propertyConstant= propertyName -> {$propertyConstant.st})
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==OCTOTHORPE) ) {
				alt84=1;
			}
			else if ( (LA84_0==DOUBLE_COLON) ) {
				alt84=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}

			switch (alt84) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1066:3: property= propertyReference
					{
					pushFollow(FOLLOW_propertyReference_in_propertyValue7673);
					property=propertyReference();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1067:4: -> {$property.st}
					{
						retval.st = (property!=null?((StringTemplate)property.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1068:4: propertyConstant= propertyName
					{
					pushFollow(FOLLOW_propertyName_in_propertyValue7687);
					propertyConstant=propertyName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1069:4: -> {$propertyConstant.st}
					{
						retval.st = (propertyConstant!=null?((StringTemplate)propertyConstant.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyValue"


	public static class propertyReference_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1072:1: propertyReference : ( ^(oct= OCTOTHORPE pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.st)| ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.stf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.st)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName ) -> property_reference(component=$component.stpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ ) -> property_reference(component=$component.stpname=$pname.stf=$field));
	public final UnparseBLESS3.propertyReference_return propertyReference() throws RecognitionException {
		UnparseBLESS3.propertyReference_return retval = new UnparseBLESS3.propertyReference_return();
		retval.start = input.LT(1);

		BAST oct=null;
		BAST self=null;
		List<Object> list_field=null;
		TreeRuleReturnScope pname =null;
		TreeRuleReturnScope component =null;
		RuleReturnScope field = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1073:2: ( ^(oct= OCTOTHORPE pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.st)| ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.stf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.st)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName ) -> property_reference(component=$component.stpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ ) -> property_reference(component=$component.stpname=$pname.stf=$field))
			int alt88=6;
			alt88 = dfa88.predict(input);
			switch (alt88) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1075:3: ^(oct= OCTOTHORPE pname= propertyName )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7719); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7723);
					pname=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1076:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1077:5: -> property_reference(pname=$pname.st)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:3: ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7760); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7764);
					pname=propertyName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:44: (field+= propertyField )+
					int cnt85=0;
					loop85:
					while (true) {
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==DOT||LA85_0==LBRACKET) ) {
							alt85=1;
						}

						switch (alt85) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:44: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7768);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt85 >= 1 ) break loop85;
							EarlyExitException eee = new EarlyExitException(85, input);
							throw eee;
						}
						cnt85++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1080:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1081:5: -> property_reference(pname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1083:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7810); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7814); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7818);
					pname=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1084:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1085:5: -> property_reference(component=$self.textpname=$pname.st)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7860); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7864); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7868);
					pname=propertyName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:62: (field+= propertyField )+
					int cnt86=0;
					loop86:
					while (true) {
						int alt86=2;
						int LA86_0 = input.LA(1);
						if ( (LA86_0==DOT||LA86_0==LBRACKET) ) {
							alt86=1;
						}

						switch (alt86) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:62: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7872);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt86 >= 1 ) break loop86;
							EarlyExitException eee = new EarlyExitException(86, input);
							throw eee;
						}
						cnt86++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1088:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1089:5: -> property_reference(component=$self.textpname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1091:3: ^(oct= OCTOTHORPE component= componentName pname= propertyName )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7918); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_componentName_in_propertyReference7922);
					component=componentName();
					state._fsp--;

					pushFollow(FOLLOW_propertyName_in_propertyReference7926);
					pname=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1092:5: -> property_reference(component=$component.stpname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?((StringTemplate)component.getTemplate()):null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1094:3: ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7961); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_componentName_in_propertyReference7965);
					component=componentName();
					state._fsp--;

					pushFollow(FOLLOW_propertyName_in_propertyReference7969);
					pname=propertyName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1094:68: (field+= propertyField )+
					int cnt87=0;
					loop87:
					while (true) {
						int alt87=2;
						int LA87_0 = input.LA(1);
						if ( (LA87_0==DOT||LA87_0==LBRACKET) ) {
							alt87=1;
						}

						switch (alt87) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1094:68: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7973);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt87 >= 1 ) break loop87;
							EarlyExitException eee = new EarlyExitException(87, input);
							throw eee;
						}
						cnt87++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1095:5: -> property_reference(component=$component.stpname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?((StringTemplate)component.getTemplate()):null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyReference"


	public static class propertyField_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyField"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1098:1: propertyField : ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\");
	public final UnparseBLESS3.propertyField_return propertyField() throws RecognitionException {
		UnparseBLESS3.propertyField_return retval = new UnparseBLESS3.propertyField_return();
		retval.start = input.LT(1);

		BAST index=null;
		BAST var=null;
		BAST pf=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1099:3: ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\")
			int alt89=5;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==LBRACKET) ) {
				int LA89_1 = input.LA(2);
				if ( (LA89_1==DOWN) ) {
					int LA89_3 = input.LA(3);
					if ( (LA89_3==NUMBER) ) {
						alt89=1;
					}
					else if ( (LA89_3==ID) ) {
						alt89=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 89, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA89_0==DOT) ) {
				int LA89_2 = input.LA(2);
				if ( (LA89_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case ID:
						{
						alt89=3;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt89=4;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt89=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 89, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 89, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 89, 0, input);
				throw nvae;
			}

			switch (alt89) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1100:3: ^( LBRACKET index= NUMBER )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField8015); 
					match(input, Token.DOWN, null); 
					index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField8019); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1101:5: -> index(i=$index.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (index!=null?index.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:3: ^( LBRACKET var= ID )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField8044); 
					match(input, Token.DOWN, null); 
					var=(BAST)match(input,ID,FOLLOW_ID_in_propertyField8048); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1104:5: -> index(i=$var.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (var!=null?var.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1106:3: ^( DOT pf= ID )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField8073); 
					match(input, Token.DOWN, null); 
					pf=(BAST)match(input,ID,FOLLOW_ID_in_propertyField8077); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1107:5: -> template(pf=$pf.text) \".<pf>\"
					{
						retval.st = new StringTemplate(templateLib, ".<pf>",new STAttrMap().put("pf", (pf!=null?pf.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1109:3: ^( DOT LITERAL_upper_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField8104); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField8106); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1110:5: -> template( \".upper_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".upper_bound");
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1112:3: ^( DOT LITERAL_lower_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField8130); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField8132); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1113:5: -> template( \".lower_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".lower_bound");
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "propertyField"


	public static class actionSubclause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "actionSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:1: actionSubclause : ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st);
	public final UnparseBLESS3.actionSubclause_return actionSubclause() throws RecognitionException {
		UnparseBLESS3.actionSubclause_return retval = new UnparseBLESS3.actionSubclause_return();
		retval.start = input.LT(1);

		BAST no_proof=null;
		TreeRuleReturnScope tc =null;
		TreeRuleReturnScope ac =null;
		TreeRuleReturnScope precondition =null;
		TreeRuleReturnScope postcondition =null;
		TreeRuleReturnScope invariant =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1121:3: ( ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:3: ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,ACTION_SUBCLAUSE,FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause8167); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:23: (no_proof= DO_NOT_PROVE )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==DO_NOT_PROVE) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:24: no_proof= DO_NOT_PROVE
					{
					no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause8172); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:48: (tc= throwsClause )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==LITERAL_throws) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:49: tc= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause8179);
					tc=throwsClause();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:67: (ac= assertClause )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==LITERAL_assert) ) {
				alt92=1;
			}
			switch (alt92) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1122:68: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause8186);
					ac=assertClause();
					state._fsp--;

					}
					break;

			}

			match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause8197); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1123:20: (precondition= assertion )?
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==ASSERTION||(LA93_0 >= ASSERTION_ENUMERATION && LA93_0 <= ASSERTION_FUNCTION)) ) {
					alt93=1;
				}
				switch (alt93) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1123:21: precondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause8202);
						precondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause8214); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1124:21: (postcondition= assertion )?
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==ASSERTION||(LA94_0 >= ASSERTION_ENUMERATION && LA94_0 <= ASSERTION_FUNCTION)) ) {
					alt94=1;
				}
				switch (alt94) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1124:22: postcondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause8219);
						postcondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause8232); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1125:26: (invariant= assertion )?
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==ASSERTION||(LA95_0 >= ASSERTION_ENUMERATION && LA95_0 <= ASSERTION_FUNCTION)) ) {
					alt95=1;
				}
				switch (alt95) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1125:27: invariant= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause8237);
						invariant=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause8250);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1127:3: -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st)
			{
				retval.st = templateLib.getInstanceOf("action_subclause",new STAttrMap().put("no_proof", (no_proof!=null?no_proof.getText():null)).put("tc", (tc!=null?((StringTemplate)tc.getTemplate()):null)).put("ac", (ac!=null?((StringTemplate)ac.getTemplate()):null)).put("pre", (precondition!=null?((StringTemplate)precondition.getTemplate()):null)).put("post", (postcondition!=null?((StringTemplate)postcondition.getTemplate()):null)).put("inv", (invariant!=null?((StringTemplate)invariant.getTemplate()):null)).put("elq", (elq!=null?((StringTemplate)elq.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "actionSubclause"


	public static class throwsClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "throwsClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1132:1: throwsClause : ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions);
	public final UnparseBLESS3.throwsClause_return throwsClause() throws RecognitionException {
		UnparseBLESS3.throwsClause_return retval = new UnparseBLESS3.throwsClause_return();
		retval.start = input.LT(1);

		BAST exceptions=null;
		List<Object> list_exceptions=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1133:3: ( ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1134:2: ^( LITERAL_throws (exceptions+= ID )+ )
			{
			match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause8323); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1134:30: (exceptions+= ID )+
			int cnt96=0;
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==ID) ) {
					alt96=1;
				}

				switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1134:30: exceptions+= ID
					{
					exceptions=(BAST)match(input,ID,FOLLOW_ID_in_throwsClause8327); 
					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt96 >= 1 ) break loop96;
					EarlyExitException eee = new EarlyExitException(96, input);
					throw eee;
				}
				cnt96++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1135:4: -> throws_clause(ex=$exceptions)
			{
				retval.st = templateLib.getInstanceOf("throws_clause",new STAttrMap().put("ex", list_exceptions));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "throwsClause"


	public static class assertClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1138:1: assertClause : ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions);
	public final UnparseBLESS3.assertClause_return assertClause() throws RecognitionException {
		UnparseBLESS3.assertClause_return retval = new UnparseBLESS3.assertClause_return();
		retval.start = input.LT(1);

		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:3: ( ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:3: ^( LITERAL_assert (assertions+= namedAssertion )+ )
			{
			match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause8360); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:31: (assertions+= namedAssertion )+
			int cnt97=0;
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==ASSERTION||(LA97_0 >= ASSERTION_ENUMERATION && LA97_0 <= ASSERTION_FUNCTION)) ) {
					alt97=1;
				}

				switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:31: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause8364);
					assertions=namedAssertion();
					state._fsp--;

					if (list_assertions==null) list_assertions=new ArrayList<Object>();
					list_assertions.add(assertions.getTemplate());
					}
					break;

				default :
					if ( cnt97 >= 1 ) break loop97;
					EarlyExitException eee = new EarlyExitException(97, input);
					throw eee;
				}
				cnt97++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1141:5: -> assert_clause(a=$assertions)
			{
				retval.st = templateLib.getInstanceOf("assert_clause",new STAttrMap().put("a", list_assertions));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertClause"


	public static class existentialLatticeQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "existentialLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1144:1: existentialLatticeQuantification : ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st);
	public final UnparseBLESS3.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.existentialLatticeQuantification_return retval = new UnparseBLESS3.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope qv =null;
		TreeRuleReturnScope actions =null;
		TreeRuleReturnScope cc =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1145:3: ( ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:3: ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification8397); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:13: (qv= quantifiedVariables )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LITERAL_declare) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:15: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification8403);
					qv=quantifiedVariables();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification8410);
			actions=behaviorActions();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification8412); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:72: (cc= catchClause )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==LITERAL_catch) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:74: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification8418);
					cc=catchClause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1147:5: -> elq(v=$qv.stba=$actions.stcc=$cc.st)
			{
				retval.st = templateLib.getInstanceOf("elq",new STAttrMap().put("v", (qv!=null?((StringTemplate)qv.getTemplate()):null)).put("ba", (actions!=null?((StringTemplate)actions.getTemplate()):null)).put("cc", (cc!=null?((StringTemplate)cc.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "existentialLatticeQuantification"


	public static class quantifiedVariables_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantifiedVariables"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1150:1: quantifiedVariables : ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs);
	public final UnparseBLESS3.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		UnparseBLESS3.quantifiedVariables_return retval = new UnparseBLESS3.quantifiedVariables_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1151:3: ( ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:3: ^( LITERAL_declare (decs+= variableDeclaration )+ )
			{
			match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables8463); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:26: (decs+= variableDeclaration )+
			int cnt100=0;
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==VARIABLE_DECLARATION) ) {
					alt100=1;
				}

				switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:26: decs+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables8467);
					decs=variableDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt100 >= 1 ) break loop100;
					EarlyExitException eee = new EarlyExitException(100, input);
					throw eee;
				}
				cnt100++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1153:5: -> quantified_variables(bv=$decs)
			{
				retval.st = templateLib.getInstanceOf("quantified_variables",new STAttrMap().put("bv", list_decs));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantifiedVariables"


	public static class variableDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableDeclaration"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1156:1: variableDeclaration : ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text);
	public final UnparseBLESS3.variableDeclaration_return variableDeclaration() throws RecognitionException {
		UnparseBLESS3.variableDeclaration_return retval = new UnparseBLESS3.variableDeclaration_return();
		retval.start = input.LT(1);

		BAST nv=null;
		BAST sh=null;
		BAST c=null;
		BAST sp=null;
		BAST f=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1157:3: ( ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:3: ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? )
			{
			match(input,VARIABLE_DECLARATION,FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration8499); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variable_in_variableDeclaration8503);
			v=variable();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:38: ( ^( ASSIGN exp= expression ) )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==ASSIGN) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:40: ^( ASSIGN exp= expression )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration8509); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_variableDeclaration8513);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:71: (a= assertion )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==ASSERTION||(LA102_0 >= ASSERTION_ENUMERATION && LA102_0 <= ASSERTION_FUNCTION)) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1158:71: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration8522);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:7: (nv= LITERAL_nonvolatile )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LITERAL_nonvolatile) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:7: nv= LITERAL_nonvolatile
					{
					nv=(BAST)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration8532); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:31: (sh= LITERAL_shared )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LITERAL_shared) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:31: sh= LITERAL_shared
					{
					sh=(BAST)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration8537); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:49: (c= LITERAL_constant )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LITERAL_constant) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:49: c= LITERAL_constant
					{
					c=(BAST)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration8542); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:70: (sp= LITERAL_spread )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LITERAL_spread) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:70: sp= LITERAL_spread
					{
					sp=(BAST)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration8547); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:88: (f= LITERAL_final )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==LITERAL_final) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:88: f= LITERAL_final
					{
					f=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration8552); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1160:5: -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text)
			{
				retval.st = templateLib.getInstanceOf("variable_declaration",new STAttrMap().put("v", (v!=null?((StringTemplate)v.getTemplate()):null)).put("exp", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("a", (a!=null?((StringTemplate)a.getTemplate()):null)).put("nv", (nv!=null?nv.getText():null)).put("sh", (sh!=null?sh.getText():null)).put("c", (c!=null?c.getText():null)).put("sp", (sp!=null?sp.getText():null)).put("f", (f!=null?f.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class catchClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "catchClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1163:1: catchClause : ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct);
	public final UnparseBLESS3.catchClause_return catchClause() throws RecognitionException {
		UnparseBLESS3.catchClause_return retval = new UnparseBLESS3.catchClause_return();
		retval.start = input.LT(1);

		List<Object> list_cct=null;
		RuleReturnScope cct = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1164:3: ( ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1165:2: ^( LITERAL_catch (cct+= catchClauseTerm )+ )
			{
			match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause8612); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1165:22: (cct+= catchClauseTerm )+
			int cnt108=0;
			loop108:
			while (true) {
				int alt108=2;
				int LA108_0 = input.LA(1);
				if ( (LA108_0==LPAREN) ) {
					alt108=1;
				}

				switch (alt108) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1165:22: cct+= catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause8616);
					cct=catchClauseTerm();
					state._fsp--;

					if (list_cct==null) list_cct=new ArrayList<Object>();
					list_cct.add(cct.getTemplate());
					}
					break;

				default :
					if ( cnt108 >= 1 ) break loop108;
					EarlyExitException eee = new EarlyExitException(108, input);
					throw eee;
				}
				cnt108++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1166:4: -> catch_clause(cct=$cct)
			{
				retval.st = templateLib.getInstanceOf("catch_clause",new STAttrMap().put("cct", list_cct));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchClause"


	public static class catchClauseTerm_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "catchClauseTerm"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1169:1: catchClauseTerm : ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st));
	public final UnparseBLESS3.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		UnparseBLESS3.catchClauseTerm_return retval = new UnparseBLESS3.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST colon=null;
		BAST exceptions=null;
		List<Object> list_exceptions=null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1170:3: ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st))
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==LPAREN) ) {
				int LA110_1 = input.LA(2);
				if ( (LA110_1==DOWN) ) {
					int LA110_2 = input.LA(3);
					if ( (LA110_2==LITERAL_all) ) {
						alt110=2;
					}
					else if ( (LA110_2==ID) ) {
						alt110=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 110, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 110, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}

			switch (alt110) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:3: ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8648); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:23: (exceptions+= ID )+
					int cnt109=0;
					loop109:
					while (true) {
						int alt109=2;
						int LA109_0 = input.LA(1);
						if ( (LA109_0==ID) ) {
							alt109=1;
						}

						switch (alt109) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:23: exceptions+= ID
							{
							exceptions=(BAST)match(input,ID,FOLLOW_ID_in_catchClauseTerm8652); 
							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt109 >= 1 ) break loop109;
							EarlyExitException eee = new EarlyExitException(109, input);
							throw eee;
						}
						cnt109++;
					}

					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8658); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8662);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8664); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1172:5: -> catch_clause_term(ei=$exceptionsba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term",new STAttrMap().put("ei", list_exceptions).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1174:3: ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8694); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm8696); 
					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8700); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8704);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8706); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1175:5: -> catch_clause_term_all(ba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term_all",new STAttrMap().put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catchClauseTerm"


	public static class behaviorActions_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorActions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1178:1: behaviorActions : ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st});
	public final UnparseBLESS3.behaviorActions_return behaviorActions() throws RecognitionException {
		UnparseBLESS3.behaviorActions_return retval = new UnparseBLESS3.behaviorActions_return();
		retval.start = input.LT(1);

		List<Object> list_aa=null;
		TreeRuleReturnScope a =null;
		RuleReturnScope aa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1179:3: ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st})
			int alt113=3;
			switch ( input.LA(1) ) {
			case SEMICOLON:
				{
				alt113=1;
				}
				break;
			case AMPERSAND:
				{
				alt113=2;
				}
				break;
			case ACTION:
				{
				alt113=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 113, 0, input);
				throw nvae;
			}
			switch (alt113) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1180:3: ^( SEMICOLON (aa+= assertedAction )+ )
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions8738); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1180:18: (aa+= assertedAction )+
					int cnt111=0;
					loop111:
					while (true) {
						int alt111=2;
						int LA111_0 = input.LA(1);
						if ( (LA111_0==ACTION) ) {
							alt111=1;
						}

						switch (alt111) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1180:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8742);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt111 >= 1 ) break loop111;
							EarlyExitException eee = new EarlyExitException(111, input);
							throw eee;
						}
						cnt111++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1181:5: -> sequential_composition(f=$aa)
					{
						retval.st = templateLib.getInstanceOf("sequential_composition",new STAttrMap().put("f", list_aa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1183:3: ^( AMPERSAND (aa+= assertedAction )+ )
					{
					match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions8768); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1183:18: (aa+= assertedAction )+
					int cnt112=0;
					loop112:
					while (true) {
						int alt112=2;
						int LA112_0 = input.LA(1);
						if ( (LA112_0==ACTION) ) {
							alt112=1;
						}

						switch (alt112) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1183:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8772);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt112 >= 1 ) break loop112;
							EarlyExitException eee = new EarlyExitException(112, input);
							throw eee;
						}
						cnt112++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1184:5: -> concurrent_composition(g=$aa)
					{
						retval.st = templateLib.getInstanceOf("concurrent_composition",new STAttrMap().put("g", list_aa));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1186:3: a= assertedAction
					{
					pushFollow(FOLLOW_assertedAction_in_behaviorActions8798);
					a=assertedAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1187:5: -> {$a.st}
					{
						retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorActions"


	public static class assertedAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assertedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1190:1: assertedAction : ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st);
	public final UnparseBLESS3.assertedAction_return assertedAction() throws RecognitionException {
		UnparseBLESS3.assertedAction_return retval = new UnparseBLESS3.assertedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pre =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope post =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1191:3: ( ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:3: ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) )
			{
			match(input,ACTION,FOLLOW_ACTION_in_assertedAction8823); 
			match(input, Token.DOWN, null); 
			match(input,P,FOLLOW_P_in_assertedAction8827); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:21: (pre= assertion )?
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==ASSERTION||(LA114_0 >= ASSERTION_ENUMERATION && LA114_0 <= ASSERTION_FUNCTION)) ) {
					alt114=1;
				}
				switch (alt114) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:21: pre= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8831);
						pre=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,S,FOLLOW_S_in_assertedAction8838); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_action_in_assertedAction8842);
			s=action();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,Q,FOLLOW_Q_in_assertedAction8848); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:60: (post= assertion )?
				int alt115=2;
				int LA115_0 = input.LA(1);
				if ( (LA115_0==ASSERTION||(LA115_0 >= ASSERTION_ENUMERATION && LA115_0 <= ASSERTION_FUNCTION)) ) {
					alt115=1;
				}
				switch (alt115) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1192:60: post= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8852);
						post=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1193:5: -> asserted_action(p=$pre.sts=$s.stq=$post.st)
			{
				retval.st = templateLib.getInstanceOf("asserted_action",new STAttrMap().put("p", (pre!=null?((StringTemplate)pre.getTemplate()):null)).put("s", (s!=null?((StringTemplate)s.getTemplate()):null)).put("q", (post!=null?((StringTemplate)post.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assertedAction"


	public static class action_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "action"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1196:1: action : (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st});
	public final UnparseBLESS3.action_return action() throws RecognitionException {
		UnparseBLESS3.action_return retval = new UnparseBLESS3.action_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ba =null;
		TreeRuleReturnScope if_fi =null;
		TreeRuleReturnScope wl =null;
		TreeRuleReturnScope fl =null;
		TreeRuleReturnScope du =null;
		TreeRuleReturnScope elq =null;
		TreeRuleReturnScope ulq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1196:7: (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st})
			int alt116=7;
			switch ( input.LA(1) ) {
			case ASSIGN:
			case LITERAL_exception:
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_setmode:
			case LITERAL_skip:
			case LITERAL_swap:
			case LITERAL_when:
			case PORT_INPUT:
			case PORT_OUTPUT:
			case SUBPROGRAM_INVOCATION:
				{
				alt116=1;
				}
				break;
			case LITERAL_if:
				{
				alt116=2;
				}
				break;
			case LITERAL_while:
				{
				alt116=3;
				}
				break;
			case LITERAL_for:
				{
				alt116=4;
				}
				break;
			case LITERAL_do:
				{
				alt116=5;
				}
				break;
			case LCURLY:
				{
				alt116=6;
				}
				break;
			case LITERAL_forall:
				{
				alt116=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 116, 0, input);
				throw nvae;
			}
			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1197:3: ba= basicAction
					{
					pushFollow(FOLLOW_basicAction_in_action8894);
					ba=basicAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1198:5: -> {$ba.st}
					{
						retval.st = (ba!=null?((StringTemplate)ba.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1199:5: if_fi= alternative
					{
					pushFollow(FOLLOW_alternative_in_action8910);
					if_fi=alternative();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1200:5: -> {$if_fi.st}
					{
						retval.st = (if_fi!=null?((StringTemplate)if_fi.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1201:5: wl= whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_action8926);
					wl=whileLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1202:5: -> {$wl.st}
					{
						retval.st = (wl!=null?((StringTemplate)wl.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1203:5: fl= forLoop
					{
					pushFollow(FOLLOW_forLoop_in_action8942);
					fl=forLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1204:5: -> {$fl.st}
					{
						retval.st = (fl!=null?((StringTemplate)fl.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1205:5: du= doUntilLoop
					{
					pushFollow(FOLLOW_doUntilLoop_in_action8958);
					du=doUntilLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1206:5: -> {$du.st}
					{
						retval.st = (du!=null?((StringTemplate)du.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1207:5: elq= existentialLatticeQuantification
					{
					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8974);
					elq=existentialLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1208:5: -> {$elq.st}
					{
						retval.st = (elq!=null?((StringTemplate)elq.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1209:5: ulq= universalLatticeQuantification
					{
					pushFollow(FOLLOW_universalLatticeQuantification_in_action8991);
					ulq=universalLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1210:5: -> {$ulq.st}
					{
						retval.st = (ulq!=null?((StringTemplate)ulq.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class basicAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "basicAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1213:1: basicAction : (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| ^( LITERAL_setmode mode= ID ) -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st});
	public final UnparseBLESS3.basicAction_return basicAction() throws RecognitionException {
		UnparseBLESS3.basicAction_return retval = new UnparseBLESS3.basicAction_return();
		retval.start = input.LT(1);

		BAST sk=null;
		BAST mode=null;
		TreeRuleReturnScope ass =null;
		TreeRuleReturnScope wt =null;
		TreeRuleReturnScope co =null;
		TreeRuleReturnScope ca =null;
		TreeRuleReturnScope sa =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:3: (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| ^( LITERAL_setmode mode= ID ) -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st})
			int alt117=8;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt117=1;
				}
				break;
			case ASSIGN:
				{
				int LA117_2 = input.LA(2);
				if ( (LA117_2==DOWN) ) {
					int LA117_8 = input.LA(3);
					if ( (LA117_8==COMMA) ) {
						alt117=7;
					}
					else if ( (LA117_8==ID||LA117_8==QUESTION||LA117_8==TICK) ) {
						alt117=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 117, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 117, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_setmode:
				{
				alt117=3;
				}
				break;
			case LITERAL_when:
				{
				alt117=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt117=5;
				}
				break;
			case PORT_INPUT:
			case PORT_OUTPUT:
			case SUBPROGRAM_INVOCATION:
				{
				alt117=6;
				}
				break;
			case LITERAL_exception:
				{
				alt117=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}
			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1215:3: sk= LITERAL_skip
					{
					sk=(BAST)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction9020); 
					// TEMPLATE REWRITE
					// 1216:4: -> {%{$sk.text}}
					{
						retval.st = new StringTemplate(templateLib,(sk!=null?sk.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1217:5: ass= assignment
					{
					pushFollow(FOLLOW_assignment_in_basicAction9036);
					ass=assignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1218:5: -> {$ass.st}
					{
						retval.st = (ass!=null?((StringTemplate)ass.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1219:5: ^( LITERAL_setmode mode= ID )
					{
					match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction9052); 
					match(input, Token.DOWN, null); 
					mode=(BAST)match(input,ID,FOLLOW_ID_in_basicAction9056); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1220:5: -> template(mode=$mode.text) \"setmode <mode>\"
					{
						retval.st = new StringTemplate(templateLib, "setmode <mode>",new STAttrMap().put("mode", (mode!=null?mode.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1221:5: wt= whenThrow
					{
					pushFollow(FOLLOW_whenThrow_in_basicAction9082);
					wt=whenThrow();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1222:5: -> {$wt.st}
					{
						retval.st = (wt!=null?((StringTemplate)wt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1223:5: co= combinableOperation
					{
					pushFollow(FOLLOW_combinableOperation_in_basicAction9098);
					co=combinableOperation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1224:5: -> {$co.st}
					{
						retval.st = (co!=null?((StringTemplate)co.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1225:5: ca= communicationAction
					{
					pushFollow(FOLLOW_communicationAction_in_basicAction9114);
					ca=communicationAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1226:5: -> {$ca.st}
					{
						retval.st = (ca!=null?((StringTemplate)ca.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1227:5: sa= simultaneousAssignment
					{
					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction9131);
					sa=simultaneousAssignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1228:5: -> {$sa.st}
					{
						retval.st = (sa!=null?((StringTemplate)sa.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1229:5: ie= issueException
					{
					pushFollow(FOLLOW_issueException_in_basicAction9147);
					ie=issueException();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1230:5: -> {$ie.st}
					{
						retval.st = (ie!=null?((StringTemplate)ie.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "basicAction"


	public static class issueException_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "issueException"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1233:1: issueException : ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text);
	public final UnparseBLESS3.issueException_return issueException() throws RecognitionException {
		UnparseBLESS3.issueException_return retval = new UnparseBLESS3.issueException_return();
		retval.start = input.LT(1);

		BAST exception=null;
		BAST message=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1234:3: ( ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1235:3: ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9173); 
			match(input, Token.DOWN, null); 
			exception=(BAST)match(input,ID,FOLLOW_ID_in_issueException9177); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1235:44: (message= AADL_STRING_LITERAL )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==AADL_STRING_LITERAL) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1235:44: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9181); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1236:5: -> issue_exception(ex=$exception.textm=$message.text)
			{
				retval.st = templateLib.getInstanceOf("issue_exception",new STAttrMap().put("ex", (exception!=null?exception.getText():null)).put("m", (message!=null?message.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "issueException"


	public static class assignment_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1239:1: assignment : ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st);
	public final UnparseBLESS3.assignment_return assignment() throws RecognitionException {
		UnparseBLESS3.assignment_return retval = new UnparseBLESS3.assignment_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1240:3: ( ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1241:3: ^( ASSIGN n= nameTick e= expressionOrAny )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment9221); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_nameTick_in_assignment9225);
			n=nameTick();
			state._fsp--;

			pushFollow(FOLLOW_expressionOrAny_in_assignment9229);
			e=expressionOrAny();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1242:5: -> assignment(nt=$n.steort=$e.st)
			{
				retval.st = templateLib.getInstanceOf("assignment",new STAttrMap().put("nt", (n!=null?((StringTemplate)n.getTemplate()):null)).put("eort", (e!=null?((StringTemplate)e.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class nameTick_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "nameTick"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1245:1: nameTick : ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st});
	public final UnparseBLESS3.nameTick_return nameTick() throws RecognitionException {
		UnparseBLESS3.nameTick_return retval = new UnparseBLESS3.nameTick_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:3: ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st})
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==TICK) ) {
				int LA119_1 = input.LA(2);
				if ( (LA119_1==DOWN) ) {
					int LA119_3 = input.LA(3);
					if ( (LA119_3==ID) ) {
						int LA119_4 = input.LA(4);
						if ( (LA119_4==LITERAL_count||LA119_4==LITERAL_fresh||LA119_4==LITERAL_updated) ) {
							alt119=2;
						}
						else if ( ((LA119_4 >= DOWN && LA119_4 <= UP)) ) {
							alt119=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 119, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA119_3==QUESTION||LA119_3==TICK) ) {
						alt119=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 119, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 119, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA119_0==ID||LA119_0==QUESTION) ) {
				alt119=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1247:3: ^( TICK vn= valueName )
					{
					match(input,TICK,FOLLOW_TICK_in_nameTick9268); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_nameTick9272);
					vn=valueName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1248:5: -> name_tick(vn=$vn.st)
					{
						retval.st = templateLib.getInstanceOf("name_tick",new STAttrMap().put("vn", (vn!=null?((StringTemplate)vn.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1250:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_nameTick9297);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1251:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nameTick"


	public static class expressionOrAny_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expressionOrAny"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1254:1: expressionOrAny : (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}});
	public final UnparseBLESS3.expressionOrAny_return expressionOrAny() throws RecognitionException {
		UnparseBLESS3.expressionOrAny_return retval = new UnparseBLESS3.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST any=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1255:3: (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}})
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==AADL_STRING_LITERAL||(LA120_0 >= AL && LA120_0 <= AM)||LA120_0==AT_SIGN||LA120_0==CARET||LA120_0==DIVIDE||LA120_0==EQ||LA120_0==EXP||LA120_0==GT||LA120_0==ID||LA120_0==INVOKE||LA120_0==LBRACKET||(LA120_0 >= LITERAL_abs && LA120_0 <= LITERAL_and)||LA120_0==LITERAL_div||LA120_0==LITERAL_else||LA120_0==LITERAL_exists||LA120_0==LITERAL_false||(LA120_0 >= LITERAL_iff && LA120_0 <= LITERAL_in)||LA120_0==LITERAL_mod||(LA120_0 >= LITERAL_not && LA120_0 <= LITERAL_numberof)||LA120_0==LITERAL_or||LA120_0==LITERAL_product||LA120_0==LITERAL_rem||LA120_0==LITERAL_round||LA120_0==LITERAL_sum||LA120_0==LITERAL_then||LA120_0==LITERAL_timeout||LA120_0==LITERAL_tops||(LA120_0 >= LITERAL_true && LA120_0 <= LITERAL_truncate)||(LA120_0 >= LITERAL_xor && LA120_0 <= LT)||LA120_0==MINUS||LA120_0==NEQ||LA120_0==OLD_NEQ||LA120_0==PLUS||LA120_0==PLUS_EQUALS||(LA120_0 >= QUANTITY && LA120_0 <= QUESTION)||LA120_0==RECORD_TERM||LA120_0==TICK||LA120_0==TIMES||LA120_0==UNARY_MINUS) ) {
				alt120=1;
			}
			else if ( (LA120_0==LITERAL_any) ) {
				alt120=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}

			switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1256:3: exp= expression
					{
					pushFollow(FOLLOW_expression_in_expressionOrAny9324);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1257:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1259:3: any= LITERAL_any
					{
					any=(BAST)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny9344); 
					// TEMPLATE REWRITE
					// 1260:4: -> {%{$any.text}}
					{
						retval.st = new StringTemplate(templateLib,(any!=null?any.getText():null));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionOrAny"


	public static class simultaneousAssignment_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "simultaneousAssignment"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1263:1: simultaneousAssignment : ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs);
	public final UnparseBLESS3.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		UnparseBLESS3.simultaneousAssignment_return retval = new UnparseBLESS3.simultaneousAssignment_return();
		retval.start = input.LT(1);

		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1264:3: ( ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:3: ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment9370); 
			match(input, Token.DOWN, null); 
			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment9374); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:25: (lhs+= nameTick )+
			int cnt121=0;
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==ID||LA121_0==QUESTION||LA121_0==TICK) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:25: lhs+= nameTick
					{
					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment9378);
					lhs=nameTick();
					state._fsp--;

					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTemplate());
					}
					break;

				default :
					if ( cnt121 >= 1 ) break loop121;
					EarlyExitException eee = new EarlyExitException(121, input);
					throw eee;
				}
				cnt121++;
			}

			match(input, Token.UP, null); 

			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment9385); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:51: (rhs+= expressionOrAny )+
			int cnt122=0;
			loop122:
			while (true) {
				int alt122=2;
				int LA122_0 = input.LA(1);
				if ( (LA122_0==AADL_STRING_LITERAL||(LA122_0 >= AL && LA122_0 <= AM)||LA122_0==AT_SIGN||LA122_0==CARET||LA122_0==DIVIDE||LA122_0==EQ||LA122_0==EXP||LA122_0==GT||LA122_0==ID||LA122_0==INVOKE||LA122_0==LBRACKET||(LA122_0 >= LITERAL_abs && LA122_0 <= LITERAL_any)||LA122_0==LITERAL_div||LA122_0==LITERAL_else||LA122_0==LITERAL_exists||LA122_0==LITERAL_false||(LA122_0 >= LITERAL_iff && LA122_0 <= LITERAL_in)||LA122_0==LITERAL_mod||(LA122_0 >= LITERAL_not && LA122_0 <= LITERAL_numberof)||LA122_0==LITERAL_or||LA122_0==LITERAL_product||LA122_0==LITERAL_rem||LA122_0==LITERAL_round||LA122_0==LITERAL_sum||LA122_0==LITERAL_then||LA122_0==LITERAL_timeout||LA122_0==LITERAL_tops||(LA122_0 >= LITERAL_true && LA122_0 <= LITERAL_truncate)||(LA122_0 >= LITERAL_xor && LA122_0 <= LT)||LA122_0==MINUS||LA122_0==NEQ||LA122_0==OLD_NEQ||LA122_0==PLUS||LA122_0==PLUS_EQUALS||(LA122_0 >= QUANTITY && LA122_0 <= QUESTION)||LA122_0==RECORD_TERM||LA122_0==TICK||LA122_0==TIMES||LA122_0==UNARY_MINUS) ) {
					alt122=1;
				}

				switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1265:51: rhs+= expressionOrAny
					{
					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment9389);
					rhs=expressionOrAny();
					state._fsp--;

					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTemplate());
					}
					break;

				default :
					if ( cnt122 >= 1 ) break loop122;
					EarlyExitException eee = new EarlyExitException(122, input);
					throw eee;
				}
				cnt122++;
			}

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1266:5: -> simultaneous_assignment(l=$lhsr=$rhs)
			{
				retval.st = templateLib.getInstanceOf("simultaneous_assignment",new STAttrMap().put("l", list_lhs).put("r", list_rhs));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simultaneousAssignment"


	public static class whenThrow_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whenThrow"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1269:1: whenThrow : ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text);
	public final UnparseBLESS3.whenThrow_return whenThrow() throws RecognitionException {
		UnparseBLESS3.whenThrow_return retval = new UnparseBLESS3.whenThrow_return();
		retval.start = input.LT(1);

		BAST excep=null;
		BAST message=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1269:10: ( ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1270:3: ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow9429); 
			match(input, Token.DOWN, null); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow9431); 
			pushFollow(FOLLOW_expression_in_whenThrow9435);
			exp=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow9437); 
			match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow9439); 
			excep=(BAST)match(input,ID,FOLLOW_ID_in_whenThrow9443); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1271:14: (message= AADL_STRING_LITERAL )?
			int alt123=2;
			int LA123_0 = input.LA(1);
			if ( (LA123_0==AADL_STRING_LITERAL) ) {
				alt123=1;
			}
			switch (alt123) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1271:14: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow9455); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1272:5: -> when_throw(e=$exp.sti=$excep.textm=$message.text)
			{
				retval.st = templateLib.getInstanceOf("when_throw",new STAttrMap().put("e", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("i", (excep!=null?excep.getText():null)).put("m", (message!=null?message.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenThrow"


	public static class combinableOperation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "combinableOperation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1275:1: combinableOperation : ( ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID ) -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)| ^(fo= LITERAL_fetchor target= ID bool= expression result= ID ) -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)| ^(fan= LITERAL_fetchand target= ID bool= expression result= ID ) -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)| ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID ) -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)| ^(sw= LITERAL_swap target= ID reference= ID result= ID ) -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text));
	public final UnparseBLESS3.combinableOperation_return combinableOperation() throws RecognitionException {
		UnparseBLESS3.combinableOperation_return retval = new UnparseBLESS3.combinableOperation_return();
		retval.start = input.LT(1);

		BAST fa=null;
		BAST target=null;
		BAST result=null;
		BAST fo=null;
		BAST fan=null;
		BAST fx=null;
		BAST sw=null;
		BAST reference=null;
		TreeRuleReturnScope arithmetic =null;
		TreeRuleReturnScope bool =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1275:20: ( ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID ) -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)| ^(fo= LITERAL_fetchor target= ID bool= expression result= ID ) -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)| ^(fan= LITERAL_fetchand target= ID bool= expression result= ID ) -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)| ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID ) -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)| ^(sw= LITERAL_swap target= ID reference= ID result= ID ) -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text))
			int alt124=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt124=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt124=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt124=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt124=4;
				}
				break;
			case LITERAL_swap:
				{
				alt124=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1276:3: ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID )
					{
					fa=(BAST)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation9501); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9505); 
					pushFollow(FOLLOW_expression_in_combinableOperation9509);
					arithmetic=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9513); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1277:4: -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fa!=null?fa.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (arithmetic!=null?((StringTemplate)arithmetic.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1279:3: ^(fo= LITERAL_fetchor target= ID bool= expression result= ID )
					{
					fo=(BAST)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation9555); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9559); 
					pushFollow(FOLLOW_expression_in_combinableOperation9563);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9567); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1280:4: -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fo!=null?fo.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1282:3: ^(fan= LITERAL_fetchand target= ID bool= expression result= ID )
					{
					fan=(BAST)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation9609); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9613); 
					pushFollow(FOLLOW_expression_in_combinableOperation9617);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9621); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1283:4: -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fan!=null?fan.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1285:3: ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID )
					{
					fx=(BAST)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation9663); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9667); 
					pushFollow(FOLLOW_expression_in_combinableOperation9671);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9675); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1286:4: -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fx!=null?fx.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1288:3: ^(sw= LITERAL_swap target= ID reference= ID result= ID )
					{
					sw=(BAST)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation9717); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9721); 
					reference=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9725); 
					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9729); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1289:4: -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (sw!=null?sw.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (reference!=null?reference.getText():null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "combinableOperation"


	public static class communicationAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "communicationAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:1: communicationAction : (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st});
	public final UnparseBLESS3.communicationAction_return communicationAction() throws RecognitionException {
		UnparseBLESS3.communicationAction_return retval = new UnparseBLESS3.communicationAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pc =null;
		TreeRuleReturnScope po =null;
		TreeRuleReturnScope pi =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:20: (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st})
			int alt125=3;
			switch ( input.LA(1) ) {
			case SUBPROGRAM_INVOCATION:
				{
				alt125=1;
				}
				break;
			case PORT_OUTPUT:
				{
				alt125=2;
				}
				break;
			case PORT_INPUT:
				{
				alt125=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}
			switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1293:3: pc= subprogramCall
					{
					pushFollow(FOLLOW_subprogramCall_in_communicationAction9775);
					pc=subprogramCall();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1294:5: -> {$pc.st}
					{
						retval.st = (pc!=null?((StringTemplate)pc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1296:3: po= portOutput
					{
					pushFollow(FOLLOW_portOutput_in_communicationAction9793);
					po=portOutput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1297:5: -> {$po.st}
					{
						retval.st = (po!=null?((StringTemplate)po.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1299:3: pi= portInput
					{
					pushFollow(FOLLOW_portInput_in_communicationAction9811);
					pi=portInput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1300:5: -> {$pi.st}
					{
						retval.st = (pi!=null?((StringTemplate)pi.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "communicationAction"


	public static class computation_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "computation"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1303:1: computation : ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component+= componentName )+ ) )? ) -> computation(lb=$lb.stub=$ub.stc=$component);
	public final UnparseBLESS3.computation_return computation() throws RecognitionException {
		UnparseBLESS3.computation_return retval = new UnparseBLESS3.computation_return();
		retval.start = input.LT(1);

		List<Object> list_component=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		RuleReturnScope component = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1304:3: ( ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component+= componentName )+ ) )? ) -> computation(lb=$lb.stub=$ub.stc=$component))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:3: ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component+= componentName )+ ) )? )
			{
			match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation9837); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_behaviorTime_in_computation9841);
			lb=behaviorTime();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:44: (ub= behaviorTime )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==BEHAVIOR_TIME) ) {
				alt126=1;
			}
			switch (alt126) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:44: ub= behaviorTime
					{
					pushFollow(FOLLOW_behaviorTime_in_computation9845);
					ub=behaviorTime();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:59: ( ^( LITERAL_binding (component+= componentName )+ ) )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==LITERAL_binding) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:61: ^( LITERAL_binding (component+= componentName )+ )
					{
					match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation9852); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:89: (component+= componentName )+
					int cnt127=0;
					loop127:
					while (true) {
						int alt127=2;
						int LA127_0 = input.LA(1);
						if ( (LA127_0==DOUBLE_COLON||LA127_0==ID) ) {
							alt127=1;
						}

						switch (alt127) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:89: component+= componentName
							{
							pushFollow(FOLLOW_componentName_in_computation9856);
							component=componentName();
							state._fsp--;

							if (list_component==null) list_component=new ArrayList<Object>();
							list_component.add(component.getTemplate());
							}
							break;

						default :
							if ( cnt127 >= 1 ) break loop127;
							EarlyExitException eee = new EarlyExitException(127, input);
							throw eee;
						}
						cnt127++;
					}

					match(input, Token.UP, null); 

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1306:5: -> computation(lb=$lb.stub=$ub.stc=$component)
			{
				retval.st = templateLib.getInstanceOf("computation",new STAttrMap().put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("c", list_component));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "computation"


	public static class portOutput_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portOutput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1309:1: portOutput : ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st);
	public final UnparseBLESS3.portOutput_return portOutput() throws RecognitionException {
		UnparseBLESS3.portOutput_return retval = new UnparseBLESS3.portOutput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope be =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1310:3: ( ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:3: ^( PORT_OUTPUT pn= ID (be= expression )? )
			{
			match(input,PORT_OUTPUT,FOLLOW_PORT_OUTPUT_in_portOutput9907); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portOutput9911); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:26: (be= expression )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==AADL_STRING_LITERAL||(LA129_0 >= AL && LA129_0 <= AM)||LA129_0==AT_SIGN||LA129_0==CARET||LA129_0==DIVIDE||LA129_0==EQ||LA129_0==EXP||LA129_0==GT||LA129_0==ID||LA129_0==INVOKE||LA129_0==LBRACKET||(LA129_0 >= LITERAL_abs && LA129_0 <= LITERAL_and)||LA129_0==LITERAL_div||LA129_0==LITERAL_else||LA129_0==LITERAL_exists||LA129_0==LITERAL_false||(LA129_0 >= LITERAL_iff && LA129_0 <= LITERAL_in)||LA129_0==LITERAL_mod||(LA129_0 >= LITERAL_not && LA129_0 <= LITERAL_numberof)||LA129_0==LITERAL_or||LA129_0==LITERAL_product||LA129_0==LITERAL_rem||LA129_0==LITERAL_round||LA129_0==LITERAL_sum||LA129_0==LITERAL_then||LA129_0==LITERAL_timeout||LA129_0==LITERAL_tops||(LA129_0 >= LITERAL_true && LA129_0 <= LITERAL_truncate)||(LA129_0 >= LITERAL_xor && LA129_0 <= LT)||LA129_0==MINUS||LA129_0==NEQ||LA129_0==OLD_NEQ||LA129_0==PLUS||LA129_0==PLUS_EQUALS||(LA129_0 >= QUANTITY && LA129_0 <= QUESTION)||LA129_0==RECORD_TERM||LA129_0==TICK||LA129_0==TIMES||LA129_0==UNARY_MINUS) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:26: be= expression
					{
					pushFollow(FOLLOW_expression_in_portOutput9915);
					be=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1312:5: -> port_output(o=$pn.textbe=$be.st)
			{
				retval.st = templateLib.getInstanceOf("port_output",new STAttrMap().put("o", (pn!=null?pn.getText():null)).put("be", (be!=null?((StringTemplate)be.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portOutput"


	public static class portInput_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portInput"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1315:1: portInput : ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st);
	public final UnparseBLESS3.portInput_return portInput() throws RecognitionException {
		UnparseBLESS3.portInput_return retval = new UnparseBLESS3.portInput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope n =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1316:3: ( ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1317:3: ^( PORT_INPUT pn= ID n= valueName )
			{
			match(input,PORT_INPUT,FOLLOW_PORT_INPUT_in_portInput9957); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portInput9961); 
			pushFollow(FOLLOW_valueName_in_portInput9965);
			n=valueName();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1318:5: -> port_input(i=$pn.textn=$n.st)
			{
				retval.st = templateLib.getInstanceOf("port_input",new STAttrMap().put("i", (pn!=null?pn.getText():null)).put("n", (n!=null?((StringTemplate)n.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portInput"


	public static class subprogramCall_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subprogramCall"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1322:1: subprogramCall : ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? ) -> subprogram_call(f=$id.textpl=$fal.st);
	public final UnparseBLESS3.subprogramCall_return subprogramCall() throws RecognitionException {
		UnparseBLESS3.subprogramCall_return retval = new UnparseBLESS3.subprogramCall_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope fal =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1323:3: ( ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? ) -> subprogram_call(f=$id.textpl=$fal.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1324:3: ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? )
			{
			match(input,SUBPROGRAM_INVOCATION,FOLLOW_SUBPROGRAM_INVOCATION_in_subprogramCall10009); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_subprogramCall10013); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1324:37: (fal= formalActualList )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==AADL_STRING_LITERAL||LA130_0==COLON||LA130_0==COMMA||LA130_0==ID||LA130_0==LBRACKET||LA130_0==LITERAL_false||LA130_0==LITERAL_null||LA130_0==LITERAL_true||LA130_0==LPAREN||(LA130_0 >= QUANTITY && LA130_0 <= QUESTION)||LA130_0==TICK) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1324:37: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall10017);
					fal=formalActualList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1325:5: -> subprogram_call(f=$id.textpl=$fal.st)
			{
				retval.st = templateLib.getInstanceOf("subprogram_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (fal!=null?((StringTemplate)fal.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subprogramCall"


	public static class formalActualList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalActualList"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:1: formalActualList : ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st});
	public final UnparseBLESS3.formalActualList_return formalActualList() throws RecognitionException {
		UnparseBLESS3.formalActualList_return retval = new UnparseBLESS3.formalActualList_return();
		retval.start = input.LT(1);

		List<Object> list_fa=null;
		TreeRuleReturnScope s =null;
		RuleReturnScope fa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1330:3: ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st})
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==COMMA) ) {
				alt132=1;
			}
			else if ( (LA132_0==AADL_STRING_LITERAL||LA132_0==COLON||LA132_0==ID||LA132_0==LBRACKET||LA132_0==LITERAL_false||LA132_0==LITERAL_null||LA132_0==LITERAL_true||LA132_0==LPAREN||(LA132_0 >= QUANTITY && LA132_0 <= QUESTION)||LA132_0==TICK) ) {
				alt132=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:3: ^( COMMA (fa+= formalActual )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_formalActualList10062); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:14: (fa+= formalActual )+
					int cnt131=0;
					loop131:
					while (true) {
						int alt131=2;
						int LA131_0 = input.LA(1);
						if ( (LA131_0==AADL_STRING_LITERAL||LA131_0==COLON||LA131_0==ID||LA131_0==LBRACKET||LA131_0==LITERAL_false||LA131_0==LITERAL_null||LA131_0==LITERAL_true||LA131_0==LPAREN||(LA131_0 >= QUANTITY && LA131_0 <= QUESTION)||LA131_0==TICK) ) {
							alt131=1;
						}

						switch (alt131) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:14: fa+= formalActual
							{
							pushFollow(FOLLOW_formalActual_in_formalActualList10066);
							fa=formalActual();
							state._fsp--;

							if (list_fa==null) list_fa=new ArrayList<Object>();
							list_fa.add(fa.getTemplate());
							}
							break;

						default :
							if ( cnt131 >= 1 ) break loop131;
							EarlyExitException eee = new EarlyExitException(131, input);
							throw eee;
						}
						cnt131++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1332:5: -> formal_actual_list(ns=$fa)
					{
						retval.st = templateLib.getInstanceOf("formal_actual_list",new STAttrMap().put("ns", list_fa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1334:3: s= formalActual
					{
					pushFollow(FOLLOW_formalActual_in_formalActualList10092);
					s=formalActual();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1335:5: -> {$s.st}
					{
						retval.st = (s!=null?((StringTemplate)s.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalActualList"


	public static class formalActual_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalActual"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1338:1: formalActual : ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter -> {$spp.st});
	public final UnparseBLESS3.formalActual_return formalActual() throws RecognitionException {
		UnparseBLESS3.formalActual_return retval = new UnparseBLESS3.formalActual_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;
		TreeRuleReturnScope spp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:3: ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter -> {$spp.st})
			int alt133=2;
			int LA133_0 = input.LA(1);
			if ( (LA133_0==COLON) ) {
				alt133=1;
			}
			else if ( (LA133_0==AADL_STRING_LITERAL||LA133_0==ID||LA133_0==LBRACKET||LA133_0==LITERAL_false||LA133_0==LITERAL_null||LA133_0==LITERAL_true||LA133_0==LPAREN||(LA133_0 >= QUANTITY && LA133_0 <= QUESTION)||LA133_0==TICK) ) {
				alt133=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}

			switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1340:3: ^( COLON formal= ID actual= subProgramParameter )
					{
					match(input,COLON,FOLLOW_COLON_in_formalActual10121); 
					match(input, Token.DOWN, null); 
					formal=(BAST)match(input,ID,FOLLOW_ID_in_formalActual10125); 
					pushFollow(FOLLOW_subProgramParameter_in_formalActual10129);
					actual=subProgramParameter();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1341:5: -> formal_actual(f=$formal.textap=$actual.st)
					{
						retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1343:3: spp= subProgramParameter
					{
					pushFollow(FOLLOW_subProgramParameter_in_formalActual10159);
					spp=subProgramParameter();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1344:5: -> {$spp.st}
					{
						retval.st = (spp!=null?((StringTemplate)spp.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalActual"


	public static class subProgramParameter_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "subProgramParameter"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1347:1: subProgramParameter : (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.subProgramParameter_return subProgramParameter() throws RecognitionException {
		UnparseBLESS3.subProgramParameter_return retval = new UnparseBLESS3.subProgramParameter_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1347:20: (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt134=3;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt134=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LBRACKET:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt134=2;
				}
				break;
			case LPAREN:
				{
				alt134=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 134, 0, input);
				throw nvae;
			}
			switch (alt134) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1348:2: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_subProgramParameter10181);
					v=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1349:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1350:4: c= constant
					{
					pushFollow(FOLLOW_constant_in_subProgramParameter10196);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1351:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1352:4: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter10211);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1353:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subProgramParameter"


	public static class alternative_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "alternative"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1356:1: alternative : ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt);
	public final UnparseBLESS3.alternative_return alternative() throws RecognitionException {
		UnparseBLESS3.alternative_return retval = new UnparseBLESS3.alternative_return();
		retval.start = input.LT(1);

		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1357:3: ( ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:3: ^( LITERAL_if (alt+= guardedAction )+ )
			{
			match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative10239); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:20: (alt+= guardedAction )+
			int cnt135=0;
			loop135:
			while (true) {
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==GUARD) ) {
					alt135=1;
				}

				switch (alt135) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:20: alt+= guardedAction
					{
					pushFollow(FOLLOW_guardedAction_in_alternative10243);
					alt=guardedAction();
					state._fsp--;

					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTemplate());
					}
					break;

				default :
					if ( cnt135 >= 1 ) break loop135;
					EarlyExitException eee = new EarlyExitException(135, input);
					throw eee;
				}
				cnt135++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1359:5: -> alternative(gf=$alt)
			{
				retval.st = templateLib.getInstanceOf("alternative",new STAttrMap().put("gf", list_alt));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alternative"


	public static class guardedAction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "guardedAction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1362:1: guardedAction : ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st);
	public final UnparseBLESS3.guardedAction_return guardedAction() throws RecognitionException {
		UnparseBLESS3.guardedAction_return retval = new UnparseBLESS3.guardedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope aa =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1363:3: ( ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1364:3: ^( GUARD exp= expression aa= assertedAction )
			{
			match(input,GUARD,FOLLOW_GUARD_in_guardedAction10280); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_guardedAction10284);
			exp=expression();
			state._fsp--;

			pushFollow(FOLLOW_assertedAction_in_guardedAction10288);
			aa=assertedAction();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1365:5: -> guarded_action(be=$exp.stba=$aa.st)
			{
				retval.st = templateLib.getInstanceOf("guarded_action",new STAttrMap().put("be", (exp!=null?((StringTemplate)exp.getTemplate()):null)).put("ba", (aa!=null?((StringTemplate)aa.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "guardedAction"


	public static class whileLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whileLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1368:1: whileLoop : ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.whileLoop_return whileLoop() throws RecognitionException {
		UnparseBLESS3.whileLoop_return retval = new UnparseBLESS3.whileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1369:3: ( ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:3: ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop10327); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileLoop10331);
			be=expression();
			state._fsp--;

			match(input,INVARIANT,FOLLOW_INVARIANT_in_whileLoop10335); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:50: (inv= assertion )?
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==ASSERTION||(LA136_0 >= ASSERTION_ENUMERATION && LA136_0 <= ASSERTION_FUNCTION)) ) {
					alt136=1;
				}
				switch (alt136) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:50: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop10339);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_whileLoop10346); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:75: (bd= expression )?
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==AADL_STRING_LITERAL||(LA137_0 >= AL && LA137_0 <= AM)||LA137_0==AT_SIGN||LA137_0==CARET||LA137_0==DIVIDE||LA137_0==EQ||LA137_0==EXP||LA137_0==GT||LA137_0==ID||LA137_0==INVOKE||LA137_0==LBRACKET||(LA137_0 >= LITERAL_abs && LA137_0 <= LITERAL_and)||LA137_0==LITERAL_div||LA137_0==LITERAL_else||LA137_0==LITERAL_exists||LA137_0==LITERAL_false||(LA137_0 >= LITERAL_iff && LA137_0 <= LITERAL_in)||LA137_0==LITERAL_mod||(LA137_0 >= LITERAL_not && LA137_0 <= LITERAL_numberof)||LA137_0==LITERAL_or||LA137_0==LITERAL_product||LA137_0==LITERAL_rem||LA137_0==LITERAL_round||LA137_0==LITERAL_sum||LA137_0==LITERAL_then||LA137_0==LITERAL_timeout||LA137_0==LITERAL_tops||(LA137_0 >= LITERAL_true && LA137_0 <= LITERAL_truncate)||(LA137_0 >= LITERAL_xor && LA137_0 <= LT)||LA137_0==MINUS||LA137_0==NEQ||LA137_0==OLD_NEQ||LA137_0==PLUS||LA137_0==PLUS_EQUALS||(LA137_0 >= QUANTITY && LA137_0 <= QUESTION)||LA137_0==RECORD_TERM||LA137_0==TICK||LA137_0==TIMES||LA137_0==UNARY_MINUS) ) {
					alt137=1;
				}
				switch (alt137) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:75: bd= expression
						{
						pushFollow(FOLLOW_expression_in_whileLoop10350);
						bd=expression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop10364);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1372:5: -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("while_loop",new STAttrMap().put("be", (be!=null?((StringTemplate)be.getTemplate()):null)).put("elq", (elq!=null?((StringTemplate)elq.getTemplate()):null)).put("bd", (bd!=null?((StringTemplate)bd.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class forLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1375:1: forLoop : ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st);
	public final UnparseBLESS3.forLoop_return forLoop() throws RecognitionException {
		UnparseBLESS3.forLoop_return retval = new UnparseBLESS3.forLoop_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1376:3: ( ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1377:3: ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop10413); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_forLoop10417); 
			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop10421); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_forLoop10425);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forLoop10429);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_forLoop10435); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1377:84: (inv= assertion )?
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==ASSERTION||(LA138_0 >= ASSERTION_ENUMERATION && LA138_0 <= ASSERTION_FUNCTION)) ) {
					alt138=1;
				}
				switch (alt138) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1377:84: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_forLoop10439);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_forLoop10453);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1379:5: -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("for_loop",new STAttrMap().put("a", (id!=null?id.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forLoop"


	public static class doUntilLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "doUntilLoop"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1382:1: doUntilLoop : ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.doUntilLoop_return doUntilLoop() throws RecognitionException {
		UnparseBLESS3.doUntilLoop_return retval = new UnparseBLESS3.doUntilLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1383:3: ( ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:3: ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) act= behaviorActions )
			{
			match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop10508); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop10512); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_doUntilLoop10516);
			be=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_doUntilLoop10522); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:66: (inv= assertion )?
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==ASSERTION||(LA139_0 >= ASSERTION_ENUMERATION && LA139_0 <= ASSERTION_FUNCTION)) ) {
					alt139=1;
				}
				switch (alt139) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:66: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop10526);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_doUntilLoop10533); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:91: (bd= expression )?
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==AADL_STRING_LITERAL||(LA140_0 >= AL && LA140_0 <= AM)||LA140_0==AT_SIGN||LA140_0==CARET||LA140_0==DIVIDE||LA140_0==EQ||LA140_0==EXP||LA140_0==GT||LA140_0==ID||LA140_0==INVOKE||LA140_0==LBRACKET||(LA140_0 >= LITERAL_abs && LA140_0 <= LITERAL_and)||LA140_0==LITERAL_div||LA140_0==LITERAL_else||LA140_0==LITERAL_exists||LA140_0==LITERAL_false||(LA140_0 >= LITERAL_iff && LA140_0 <= LITERAL_in)||LA140_0==LITERAL_mod||(LA140_0 >= LITERAL_not && LA140_0 <= LITERAL_numberof)||LA140_0==LITERAL_or||LA140_0==LITERAL_product||LA140_0==LITERAL_rem||LA140_0==LITERAL_round||LA140_0==LITERAL_sum||LA140_0==LITERAL_then||LA140_0==LITERAL_timeout||LA140_0==LITERAL_tops||(LA140_0 >= LITERAL_true && LA140_0 <= LITERAL_truncate)||(LA140_0 >= LITERAL_xor && LA140_0 <= LT)||LA140_0==MINUS||LA140_0==NEQ||LA140_0==OLD_NEQ||LA140_0==PLUS||LA140_0==PLUS_EQUALS||(LA140_0 >= QUANTITY && LA140_0 <= QUESTION)||LA140_0==RECORD_TERM||LA140_0==TICK||LA140_0==TIMES||LA140_0==UNARY_MINUS) ) {
					alt140=1;
				}
				switch (alt140) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:91: bd= expression
						{
						pushFollow(FOLLOW_expression_in_doUntilLoop10537);
						bd=expression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop10550);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1386:5: -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st)
			{
				retval.st = templateLib.getInstanceOf("do_until",new STAttrMap().put("be", (be!=null?((StringTemplate)be.getTemplate()):null)).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)).put("bd", (bd!=null?((StringTemplate)bd.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "doUntilLoop"


	public static class universalLatticeQuantification_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "universalLatticeQuantification"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1389:1: universalLatticeQuantification : ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st);
	public final UnparseBLESS3.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.universalLatticeQuantification_return retval = new UnparseBLESS3.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST lv=null;
		List<Object> list_lv=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1390:3: ( ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:3: ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification10603); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:23: (lv+= ID )+
			int cnt141=0;
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==ID) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:23: lv+= ID
					{
					lv=(BAST)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification10607); 
					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt141 >= 1 ) break loop141;
					EarlyExitException eee = new EarlyExitException(141, input);
					throw eee;
				}
				cnt141++;
			}

			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification10612); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_universalLatticeQuantification10616);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification10620);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification10626);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1392:5: -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st)
			{
				retval.st = templateLib.getInstanceOf("ulq",new STAttrMap().put("lv", list_lv).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("elq", (elq!=null?((StringTemplate)elq.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "universalLatticeQuantification"


	public static class blessSubclause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "blessSubclause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1398:1: blessSubclause : ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st);
	public final UnparseBLESS3.blessSubclause_return blessSubclause() throws RecognitionException {
		UnparseBLESS3.blessSubclause_return retval = new UnparseBLESS3.blessSubclause_return();
		retval.start = input.LT(1);

		BAST no_proof=null;
		TreeRuleReturnScope ac =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope vs =null;
		TreeRuleReturnScope ss =null;
		TreeRuleReturnScope t =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:3: ( ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1400:3: ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? )
			{
			match(input,BLESS_SUBCLAUSE,FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause10676); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1401:12: (no_proof= DO_NOT_PROVE )?
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==DO_NOT_PROVE) ) {
					alt142=1;
				}
				switch (alt142) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1401:12: no_proof= DO_NOT_PROVE
						{
						no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause10684); 
						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1402:7: (ac= assertClause )?
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==LITERAL_assert) ) {
					alt143=1;
				}
				switch (alt143) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1402:7: ac= assertClause
						{
						pushFollow(FOLLOW_assertClause_in_blessSubclause10693);
						ac=assertClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1403:8: (inv= invariantClause )?
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==LITERAL_invariant) ) {
					alt144=1;
				}
				switch (alt144) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1403:8: inv= invariantClause
						{
						pushFollow(FOLLOW_invariantClause_in_blessSubclause10704);
						inv=invariantClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:7: (vs= variablesSection )?
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==LITERAL_variables) ) {
					alt145=1;
				}
				switch (alt145) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:7: vs= variablesSection
						{
						pushFollow(FOLLOW_variablesSection_in_blessSubclause10713);
						vs=variablesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:7: (ss= statesSection )?
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==LITERAL_states) ) {
					alt146=1;
				}
				switch (alt146) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:7: ss= statesSection
						{
						pushFollow(FOLLOW_statesSection_in_blessSubclause10722);
						ss=statesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1406:6: (t= transitions )?
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==LITERAL_transitions) ) {
					alt147=1;
				}
				switch (alt147) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1406:6: t= transitions
						{
						pushFollow(FOLLOW_transitions_in_blessSubclause10731);
						t=transitions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1407:5: -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st)
			{
				retval.st = templateLib.getInstanceOf("bless_subclause",new STAttrMap().put("n", (no_proof!=null?no_proof.getText():null)).put("ac", (ac!=null?((StringTemplate)ac.getTemplate()):null)).put("inv", (inv!=null?((StringTemplate)inv.getTemplate()):null)).put("vs", (vs!=null?((StringTemplate)vs.getTemplate()):null)).put("ss", (ss!=null?((StringTemplate)ss.getTemplate()):null)).put("t", (t!=null?((StringTemplate)t.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "blessSubclause"


	public static class invariantClause_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "invariantClause"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1410:1: invariantClause : ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st);
	public final UnparseBLESS3.invariantClause_return invariantClause() throws RecognitionException {
		UnparseBLESS3.invariantClause_return retval = new UnparseBLESS3.invariantClause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:3: ( ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1412:3: ^( LITERAL_invariant a= assertion )
			{
			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause10793); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assertion_in_invariantClause10797);
			a=assertion();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1413:5: -> invariant_clause(a=$a.st)
			{
				retval.st = templateLib.getInstanceOf("invariant_clause",new STAttrMap().put("a", (a!=null?((StringTemplate)a.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "invariantClause"


	public static class variablesSection_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variablesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1416:1: variablesSection : ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd);
	public final UnparseBLESS3.variablesSection_return variablesSection() throws RecognitionException {
		UnparseBLESS3.variablesSection_return retval = new UnparseBLESS3.variablesSection_return();
		retval.start = input.LT(1);

		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:3: ( ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1418:2: ^( LITERAL_variables (vd+= variableDeclaration )+ )
			{
			match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection10829); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1418:25: (vd+= variableDeclaration )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==VARIABLE_DECLARATION) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1418:25: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection10833);
					vd=variableDeclaration();
					state._fsp--;

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTemplate());
					}
					break;

				default :
					if ( cnt148 >= 1 ) break loop148;
					EarlyExitException eee = new EarlyExitException(148, input);
					throw eee;
				}
				cnt148++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1419:4: -> variables(bv=$vd)
			{
				retval.st = templateLib.getInstanceOf("variables",new STAttrMap().put("bv", list_vd));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variablesSection"


	public static class statesSection_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statesSection"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1422:1: statesSection : ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states);
	public final UnparseBLESS3.statesSection_return statesSection() throws RecognitionException {
		UnparseBLESS3.statesSection_return retval = new UnparseBLESS3.statesSection_return();
		retval.start = input.LT(1);

		List<Object> list_states=null;
		RuleReturnScope states = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1423:3: ( ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:2: ^( LITERAL_states (states+= behaviorState )+ )
			{
			match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection10864); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:26: (states+= behaviorState )+
			int cnt149=0;
			loop149:
			while (true) {
				int alt149=2;
				int LA149_0 = input.LA(1);
				if ( (LA149_0==LITERAL_state) ) {
					alt149=1;
				}

				switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection10868);
					states=behaviorState();
					state._fsp--;

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTemplate());
					}
					break;

				default :
					if ( cnt149 >= 1 ) break loop149;
					EarlyExitException eee = new EarlyExitException(149, input);
					throw eee;
				}
				cnt149++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1425:4: -> states_section(bs=$states)
			{
				retval.st = templateLib.getInstanceOf("states_section",new STAttrMap().put("bs", list_states));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statesSection"


	public static class behaviorState_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorState"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1428:1: behaviorState : ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st);
	public final UnparseBLESS3.behaviorState_return behaviorState() throws RecognitionException {
		UnparseBLESS3.behaviorState_return retval = new UnparseBLESS3.behaviorState_return();
		retval.start = input.LT(1);

		BAST init=null;
		BAST com=null;
		BAST finl=null;
		BAST i=null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1429:3: ( ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:3: ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? )
			{
			match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState10900); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:24: (init= LITERAL_initial )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LITERAL_initial) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:24: init= LITERAL_initial
					{
					init=(BAST)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState10904); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:45: (com= LITERAL_complete )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LITERAL_complete) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:45: com= LITERAL_complete
					{
					com=(BAST)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState10909); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:68: (finl= LITERAL_final )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==LITERAL_final) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:68: finl= LITERAL_final
					{
					finl=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState10914); 
					}
					break;

			}

			i=(BAST)match(input,ID,FOLLOW_ID_in_behaviorState10919); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:90: (a= assertion )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==ASSERTION||(LA153_0 >= ASSERTION_ENUMERATION && LA153_0 <= ASSERTION_FUNCTION)) ) {
				alt153=1;
			}
			switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1430:90: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState10923);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1431:5: -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st)
			{
				retval.st = templateLib.getInstanceOf("behavior_state",new STAttrMap().put("bsi", (i!=null?i.getText():null)).put("i", (init!=null?init.getText():null)).put("com", (com!=null?com.getText():null)).put("finl", (finl!=null?finl.getText():null)).put("a", (a!=null?((StringTemplate)a.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorState"


	public static class transitions_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "transitions"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1434:1: transitions : ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt);
	public final UnparseBLESS3.transitions_return transitions() throws RecognitionException {
		UnparseBLESS3.transitions_return retval = new UnparseBLESS3.transitions_return();
		retval.start = input.LT(1);

		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1435:3: ( ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1436:3: ^( LITERAL_transitions (bt+= behaviorTransition )+ )
			{
			match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions10978); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1436:28: (bt+= behaviorTransition )+
			int cnt154=0;
			loop154:
			while (true) {
				int alt154=2;
				int LA154_0 = input.LA(1);
				if ( (LA154_0==TRANSITION) ) {
					alt154=1;
				}

				switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1436:28: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions10982);
					bt=behaviorTransition();
					state._fsp--;

					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTemplate());
					}
					break;

				default :
					if ( cnt154 >= 1 ) break loop154;
					EarlyExitException eee = new EarlyExitException(154, input);
					throw eee;
				}
				cnt154++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1437:5: -> transitions(bt=$bt)
			{
				retval.st = templateLib.getInstanceOf("transitions",new STAttrMap().put("bt", list_bt));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "transitions"


	public static class behaviorTransition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorTransition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:1: behaviorTransition : ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(i=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st);
	public final UnparseBLESS3.behaviorTransition_return behaviorTransition() throws RecognitionException {
		UnparseBLESS3.behaviorTransition_return retval = new UnparseBLESS3.behaviorTransition_return();
		retval.start = input.LT(1);

		BAST id=null;
		BAST dsi=null;
		BAST ssi=null;
		List<Object> list_ssi=null;
		TreeRuleReturnScope pr =null;
		TreeRuleReturnScope bc =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope q =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1441:3: ( ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(i=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1442:3: ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) )
			{
			match(input,TRANSITION,FOLLOW_TRANSITION_in_behaviorTransition11015); 
			match(input, Token.DOWN, null); 
			match(input,LABEL,FOLLOW_LABEL_in_behaviorTransition11024); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition11028); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:22: (pr= priority )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==LBRACKET) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1443:22: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition11032);
					pr=priority();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input,SOURCE,FOLLOW_SOURCE_in_behaviorTransition11044); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1444:18: (ssi+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1444:18: ssi+= ID
					{
					ssi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition11048); 
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi);
					}
					break;

				default :
					if ( cnt156 >= 1 ) break loop156;
					EarlyExitException eee = new EarlyExitException(156, input);
					throw eee;
				}
				cnt156++;
			}

			match(input, Token.UP, null); 

			match(input,CONDITION,FOLLOW_CONDITION_in_behaviorTransition11060); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1445:20: (bc= behaviorCondition )?
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==AADL_STRING_LITERAL||(LA157_0 >= AL && LA157_0 <= AM)||LA157_0==AT_SIGN||LA157_0==CARET||LA157_0==DIVIDE||LA157_0==EQ||LA157_0==EXP||LA157_0==GT||LA157_0==ID||LA157_0==INVOKE||LA157_0==LBRACKET||(LA157_0 >= LITERAL_abs && LA157_0 <= LITERAL_and)||(LA157_0 >= LITERAL_dispatch && LA157_0 <= LITERAL_div)||LA157_0==LITERAL_else||LA157_0==LITERAL_exists||LA157_0==LITERAL_false||(LA157_0 >= LITERAL_iff && LA157_0 <= LITERAL_in)||LA157_0==LITERAL_internal||LA157_0==LITERAL_mod||(LA157_0 >= LITERAL_not && LA157_0 <= LITERAL_numberof)||(LA157_0 >= LITERAL_on && LA157_0 <= LITERAL_or)||LA157_0==LITERAL_product||LA157_0==LITERAL_rem||LA157_0==LITERAL_round||LA157_0==LITERAL_sum||LA157_0==LITERAL_then||LA157_0==LITERAL_timeout||LA157_0==LITERAL_tops||(LA157_0 >= LITERAL_true && LA157_0 <= LITERAL_truncate)||(LA157_0 >= LITERAL_xor && LA157_0 <= LT)||LA157_0==MINUS||LA157_0==NEQ||LA157_0==OLD_NEQ||LA157_0==PLUS||LA157_0==PLUS_EQUALS||(LA157_0 >= QUANTITY && LA157_0 <= QUESTION)||LA157_0==RECORD_TERM||LA157_0==TICK||LA157_0==TIMES||LA157_0==UNARY_MINUS) ) {
					alt157=1;
				}
				switch (alt157) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1445:20: bc= behaviorCondition
						{
						pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition11064);
						bc=behaviorCondition();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,DESTINATION,FOLLOW_DESTINATION_in_behaviorTransition11076); 
			match(input, Token.DOWN, null); 
			dsi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition11080); 
			match(input, Token.UP, null); 

			match(input,ACTION,FOLLOW_ACTION_in_behaviorTransition11090); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1447:16: (s= behaviorActions )?
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==ACTION||LA158_0==AMPERSAND||LA158_0==SEMICOLON) ) {
					alt158=1;
				}
				switch (alt158) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1447:16: s= behaviorActions
						{
						pushFollow(FOLLOW_behaviorActions_in_behaviorTransition11094);
						s=behaviorActions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,Q,FOLLOW_Q_in_behaviorTransition11106); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1448:11: (q= assertion )?
				int alt159=2;
				int LA159_0 = input.LA(1);
				if ( (LA159_0==ASSERTION||(LA159_0 >= ASSERTION_ENUMERATION && LA159_0 <= ASSERTION_FUNCTION)) ) {
					alt159=1;
				}
				switch (alt159) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1448:11: q= assertion
						{
						pushFollow(FOLLOW_assertion_in_behaviorTransition11110);
						q=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1449:5: -> behavior_transition(i=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st)
			{
				retval.st = templateLib.getInstanceOf("behavior_transition",new STAttrMap().put("i", (id!=null?id.getText():null)).put("pr", (pr!=null?((StringTemplate)pr.getTemplate()):null)).put("ssi", list_ssi).put("bc", (bc!=null?((StringTemplate)bc.getTemplate()):null)).put("dsi", (dsi!=null?dsi.getText():null)).put("ba", (s!=null?((StringTemplate)s.getTemplate()):null)).put("btq", (q!=null?((StringTemplate)q.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTransition"


	public static class priority_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "priority"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1453:1: priority : ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text);
	public final UnparseBLESS3.priority_return priority() throws RecognitionException {
		UnparseBLESS3.priority_return retval = new UnparseBLESS3.priority_return();
		retval.start = input.LT(1);

		BAST num=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1454:3: ( ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1455:2: ^( LBRACKET num= NUMBER RBRACKET )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_priority11182); 
			match(input, Token.DOWN, null); 
			num=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_priority11186); 
			match(input,RBRACKET,FOLLOW_RBRACKET_in_priority11188); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1456:4: -> priority(num=$num.text)
			{
				retval.st = templateLib.getInstanceOf("priority",new STAttrMap().put("num", (num!=null?num.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "priority"


	public static class behaviorCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1459:1: behaviorCondition : (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st});
	public final UnparseBLESS3.behaviorCondition_return behaviorCondition() throws RecognitionException {
		UnparseBLESS3.behaviorCondition_return retval = new UnparseBLESS3.behaviorCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope dc =null;
		TreeRuleReturnScope ec =null;
		TreeRuleReturnScope mc =null;
		TreeRuleReturnScope ic =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1460:3: (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st})
			int alt160=4;
			switch ( input.LA(1) ) {
			case LITERAL_dispatch:
				{
				alt160=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case AL:
			case AM:
			case AT_SIGN:
			case CARET:
			case DIVIDE:
			case EQ:
			case EXP:
			case GT:
			case ID:
			case INVOKE:
			case LBRACKET:
			case LITERAL_abs:
			case LITERAL_all:
			case LITERAL_and:
			case LITERAL_div:
			case LITERAL_else:
			case LITERAL_exists:
			case LITERAL_false:
			case LITERAL_iff:
			case LITERAL_implies:
			case LITERAL_in:
			case LITERAL_mod:
			case LITERAL_not:
			case LITERAL_now:
			case LITERAL_null:
			case LITERAL_numberof:
			case LITERAL_or:
			case LITERAL_product:
			case LITERAL_rem:
			case LITERAL_round:
			case LITERAL_sum:
			case LITERAL_then:
			case LITERAL_timeout:
			case LITERAL_tops:
			case LITERAL_true:
			case LITERAL_truncate:
			case LITERAL_xor:
			case LPAREN:
			case LT:
			case MINUS:
			case NEQ:
			case OLD_NEQ:
			case PLUS:
			case PLUS_EQUALS:
			case QUANTITY:
			case QUESTION:
			case RECORD_TERM:
			case TICK:
			case TIMES:
			case UNARY_MINUS:
				{
				alt160=2;
				}
				break;
			case LITERAL_on:
				{
				alt160=3;
				}
				break;
			case LITERAL_internal:
				{
				alt160=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 160, 0, input);
				throw nvae;
			}
			switch (alt160) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1461:3: dc= dispatchCondition
					{
					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition11219);
					dc=dispatchCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1462:5: -> {$dc.st}
					{
						retval.st = (dc!=null?((StringTemplate)dc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1463:5: ec= executeCondition
					{
					pushFollow(FOLLOW_executeCondition_in_behaviorCondition11236);
					ec=executeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1464:5: -> {$ec.st}
					{
						retval.st = (ec!=null?((StringTemplate)ec.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1465:5: mc= modeCondition
					{
					pushFollow(FOLLOW_modeCondition_in_behaviorCondition11254);
					mc=modeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1466:5: -> {$mc.st}
					{
						retval.st = (mc!=null?((StringTemplate)mc.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1467:5: ic= internalCondition
					{
					pushFollow(FOLLOW_internalCondition_in_behaviorCondition11272);
					ic=internalCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1468:5: -> {$ic.st}
					{
						retval.st = (ic!=null?((StringTemplate)ic.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorCondition"


	public static class dispatchCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1471:1: dispatchCondition : ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st);
	public final UnparseBLESS3.dispatchCondition_return dispatchCondition() throws RecognitionException {
		UnparseBLESS3.dispatchCondition_return retval = new UnparseBLESS3.dispatchCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope de =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1472:3: ( ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1473:3: ^( LITERAL_dispatch (de= dispatchExpression )? )
			{
			match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition11300); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1473:25: (de= dispatchExpression )?
				int alt161=2;
				int LA161_0 = input.LA(1);
				if ( (LA161_0==ID||LA161_0==LITERAL_and||LA161_0==LITERAL_or||LA161_0==LITERAL_timeout) ) {
					alt161=1;
				}
				switch (alt161) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1473:25: de= dispatchExpression
						{
						pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition11304);
						de=dispatchExpression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1474:5: -> dispatch_condition(dle=$de.st)
			{
				retval.st = templateLib.getInstanceOf("dispatch_condition",new STAttrMap().put("dle", (de!=null?((StringTemplate)de.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchCondition"


	public static class executeCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "executeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1477:1: executeCondition : exp= expression -> {$exp.st};
	public final UnparseBLESS3.executeCondition_return executeCondition() throws RecognitionException {
		UnparseBLESS3.executeCondition_return retval = new UnparseBLESS3.executeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1478:3: (exp= expression -> {$exp.st})
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1479:3: exp= expression
			{
			pushFollow(FOLLOW_expression_in_executeCondition11341);
			exp=expression();
			state._fsp--;

			// TEMPLATE REWRITE
			// 1480:5: -> {$exp.st}
			{
				retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "executeCondition"


	public static class modeCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "modeCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1483:1: modeCondition : ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st);
	public final UnparseBLESS3.modeCondition_return modeCondition() throws RecognitionException {
		UnparseBLESS3.modeCondition_return retval = new UnparseBLESS3.modeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1484:3: ( ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1485:3: ^( LITERAL_on tle= triggerLogicalExpression )
			{
			match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition11370); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition11374);
			tle=triggerLogicalExpression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1486:5: -> mode_condition(tle=$tle.st)
			{
				retval.st = templateLib.getInstanceOf("mode_condition",new STAttrMap().put("tle", (tle!=null?((StringTemplate)tle.getTemplate()):null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modeCondition"


	public static class internalCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "internalCondition"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1489:1: internalCondition : ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports);
	public final UnparseBLESS3.internalCondition_return internalCondition() throws RecognitionException {
		UnparseBLESS3.internalCondition_return retval = new UnparseBLESS3.internalCondition_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1490:3: ( ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1491:3: ^( LITERAL_internal (ports+= ID )+ )
			{
			match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition11408); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1491:28: (ports+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1491:28: ports+= ID
					{
					ports=(BAST)match(input,ID,FOLLOW_ID_in_internalCondition11412); 
					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					if ( cnt162 >= 1 ) break loop162;
					EarlyExitException eee = new EarlyExitException(162, input);
					throw eee;
				}
				cnt162++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1492:5: -> internal_condition(p=$ports)
			{
				retval.st = templateLib.getInstanceOf("internal_condition",new STAttrMap().put("p", list_ports));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "internalCondition"


	public static class dispatchExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1495:1: dispatchExpression : ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st});
	public final UnparseBLESS3.dispatchExpression_return dispatchExpression() throws RecognitionException {
		UnparseBLESS3.dispatchExpression_return retval = new UnparseBLESS3.dispatchExpression_return();
		retval.start = input.LT(1);

		List<Object> list_dc=null;
		TreeRuleReturnScope c =null;
		RuleReturnScope dc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1496:3: ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st})
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==LITERAL_or) ) {
				alt164=1;
			}
			else if ( (LA164_0==ID||LA164_0==LITERAL_and||LA164_0==LITERAL_timeout) ) {
				alt164=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1497:3: ^( LITERAL_or (dc+= dispatchConjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression11448); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1497:19: (dc+= dispatchConjunction )+
					int cnt163=0;
					loop163:
					while (true) {
						int alt163=2;
						int LA163_0 = input.LA(1);
						if ( (LA163_0==ID||LA163_0==LITERAL_and||LA163_0==LITERAL_timeout) ) {
							alt163=1;
						}

						switch (alt163) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1497:19: dc+= dispatchConjunction
							{
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression11452);
							dc=dispatchConjunction();
							state._fsp--;

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTemplate());
							}
							break;

						default :
							if ( cnt163 >= 1 ) break loop163;
							EarlyExitException eee = new EarlyExitException(163, input);
							throw eee;
						}
						cnt163++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1498:5: -> disjunction(bopt=$dc)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_dc));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1500:3: c= dispatchConjunction
					{
					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression11478);
					c=dispatchConjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1501:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchExpression"


	public static class dispatchConjunction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchConjunction"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1504:1: dispatchConjunction : ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st});
	public final UnparseBLESS3.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		UnparseBLESS3.dispatchConjunction_return retval = new UnparseBLESS3.dispatchConjunction_return();
		retval.start = input.LT(1);

		List<Object> list_tr=null;
		TreeRuleReturnScope t =null;
		RuleReturnScope tr = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1505:3: ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st})
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==LITERAL_and) ) {
				alt166=1;
			}
			else if ( (LA166_0==ID||LA166_0==LITERAL_timeout) ) {
				alt166=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 166, 0, input);
				throw nvae;
			}

			switch (alt166) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:3: ^( LITERAL_and (tr+= dispatchTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction11509); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:20: (tr+= dispatchTrigger )+
					int cnt165=0;
					loop165:
					while (true) {
						int alt165=2;
						int LA165_0 = input.LA(1);
						if ( (LA165_0==ID||LA165_0==LITERAL_timeout) ) {
							alt165=1;
						}

						switch (alt165) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:20: tr+= dispatchTrigger
							{
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction11513);
							tr=dispatchTrigger();
							state._fsp--;

							if (list_tr==null) list_tr=new ArrayList<Object>();
							list_tr.add(tr.getTemplate());
							}
							break;

						default :
							if ( cnt165 >= 1 ) break loop165;
							EarlyExitException eee = new EarlyExitException(165, input);
							throw eee;
						}
						cnt165++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1507:5: -> conjunction(bopt=$tr)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_tr));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1509:3: t= dispatchTrigger
					{
					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction11539);
					t=dispatchTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1510:5: -> {$t.st}
					{
						retval.st = (t!=null?((StringTemplate)t.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchConjunction"


	public static class dispatchTrigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dispatchTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1513:1: dispatchTrigger : (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports));
	public final UnparseBLESS3.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		UnparseBLESS3.dispatchTrigger_return retval = new UnparseBLESS3.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;
		TreeRuleReturnScope port =null;
		TreeRuleReturnScope time =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1514:3: (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports))
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==ID) ) {
				alt170=1;
			}
			else if ( (LA170_0==LITERAL_timeout) ) {
				alt170=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 170, 0, input);
				throw nvae;
			}

			switch (alt170) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1515:3: port= portName
					{
					pushFollow(FOLLOW_portName_in_dispatchTrigger11565);
					port=portName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1516:5: -> {$port.st}
					{
						retval.st = (port!=null?((StringTemplate)port.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:3: ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? )
					{
					match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger11583); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:22: ( ^( LPAREN (ports+= ID )* ) )?
						int alt168=2;
						int LA168_0 = input.LA(1);
						if ( (LA168_0==LPAREN) ) {
							alt168=1;
						}
						switch (alt168) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:24: ^( LPAREN (ports+= ID )* )
								{
								match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger11589); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:39: (ports+= ID )*
									loop167:
									while (true) {
										int alt167=2;
										int LA167_0 = input.LA(1);
										if ( (LA167_0==ID) ) {
											alt167=1;
										}

										switch (alt167) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:39: ports+= ID
											{
											ports=(BAST)match(input,ID,FOLLOW_ID_in_dispatchTrigger11593); 
											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop167;
										}
									}

									match(input, Token.UP, null); 
								}

								}
								break;

						}

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:54: (time= behaviorTime )?
						int alt169=2;
						int LA169_0 = input.LA(1);
						if ( (LA169_0==BEHAVIOR_TIME) ) {
							alt169=1;
						}
						switch (alt169) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:54: time= behaviorTime
								{
								pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger11603);
								time=behaviorTime();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 1519:5: -> timeout(bt=$time.stp=$ports)
					{
						retval.st = templateLib.getInstanceOf("timeout",new STAttrMap().put("bt", (time!=null?((StringTemplate)time.getTemplate()):null)).put("p", list_ports));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dispatchTrigger"


	public static class behaviorTime_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "behaviorTime"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1522:1: behaviorTime : ( ^( BEHAVIOR_TIME q= quantity ) -> {$q.st}| ^( BEHAVIOR_TIME vn= valueName (u= ID |s= LITERAL_scalar |w= LITERAL_whole )? ) -> template(vn=$vn.stu=$u.texts=$s.textw=$w.text) \"<vn> <u><s><w>\");
	public final UnparseBLESS3.behaviorTime_return behaviorTime() throws RecognitionException {
		UnparseBLESS3.behaviorTime_return retval = new UnparseBLESS3.behaviorTime_return();
		retval.start = input.LT(1);

		BAST u=null;
		BAST s=null;
		BAST w=null;
		TreeRuleReturnScope q =null;
		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1522:13: ( ^( BEHAVIOR_TIME q= quantity ) -> {$q.st}| ^( BEHAVIOR_TIME vn= valueName (u= ID |s= LITERAL_scalar |w= LITERAL_whole )? ) -> template(vn=$vn.stu=$u.texts=$s.textw=$w.text) \"<vn> <u><s><w>\")
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==BEHAVIOR_TIME) ) {
				int LA172_1 = input.LA(2);
				if ( (LA172_1==DOWN) ) {
					int LA172_2 = input.LA(3);
					if ( (LA172_2==QUANTITY) ) {
						alt172=1;
					}
					else if ( (LA172_2==ID||LA172_2==QUESTION||LA172_2==TICK) ) {
						alt172=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 172, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 172, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 172, 0, input);
				throw nvae;
			}

			switch (alt172) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1523:3: ^( BEHAVIOR_TIME q= quantity )
					{
					match(input,BEHAVIOR_TIME,FOLLOW_BEHAVIOR_TIME_in_behaviorTime11637); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_quantity_in_behaviorTime11641);
					q=quantity();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1524:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1525:6: ^( BEHAVIOR_TIME vn= valueName (u= ID |s= LITERAL_scalar |w= LITERAL_whole )? )
					{
					match(input,BEHAVIOR_TIME,FOLLOW_BEHAVIOR_TIME_in_behaviorTime11660); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_behaviorTime11665);
					vn=valueName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1525:37: (u= ID |s= LITERAL_scalar |w= LITERAL_whole )?
					int alt171=4;
					switch ( input.LA(1) ) {
						case ID:
							{
							alt171=1;
							}
							break;
						case LITERAL_scalar:
							{
							alt171=2;
							}
							break;
						case LITERAL_whole:
							{
							alt171=3;
							}
							break;
					}
					switch (alt171) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1525:39: u= ID
							{
							u=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTime11671); 
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1525:46: s= LITERAL_scalar
							{
							s=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_behaviorTime11677); 
							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1525:65: w= LITERAL_whole
							{
							w=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_behaviorTime11683); 
							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1526:5: -> template(vn=$vn.stu=$u.texts=$s.textw=$w.text) \"<vn> <u><s><w>\"
					{
						retval.st = new StringTemplate(templateLib, "<vn> <u><s><w>",new STAttrMap().put("vn", (vn!=null?((StringTemplate)vn.getTemplate()):null)).put("u", (u!=null?u.getText():null)).put("s", (s!=null?s.getText():null)).put("w", (w!=null?w.getText():null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "behaviorTime"


	public static class portName_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "portName"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1529:1: portName : ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text);
	public final UnparseBLESS3.portName_return portName() throws RecognitionException {
		UnparseBLESS3.portName_return retval = new UnparseBLESS3.portName_return();
		retval.start = input.LT(1);

		BAST port=null;
		BAST index=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1530:3: ( ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1531:3: ^(port= ID (index= NUMBER )? )
			{
			port=(BAST)match(input,ID,FOLLOW_ID_in_portName11740); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1531:19: (index= NUMBER )?
				int alt173=2;
				int LA173_0 = input.LA(1);
				if ( (LA173_0==NUMBER) ) {
					alt173=1;
				}
				switch (alt173) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1531:19: index= NUMBER
						{
						index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_portName11744); 
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1532:5: -> port_name(port=$port.textindex=$index.text)
			{
				retval.st = templateLib.getInstanceOf("port_name",new STAttrMap().put("port", (port!=null?port.getText():null)).put("index", (index!=null?index.getText():null)));
			}



			}

		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "portName"


	public static class triggerLogicalExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "triggerLogicalExpression"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1535:1: triggerLogicalExpression : ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st});
	public final UnparseBLESS3.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		UnparseBLESS3.triggerLogicalExpression_return retval = new UnparseBLESS3.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		List<Object> list_et=null;
		TreeRuleReturnScope first =null;
		RuleReturnScope et = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1536:3: ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st})
			int alt179=6;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt179=1;
				}
				break;
			case LITERAL_or:
				{
				alt179=2;
				}
				break;
			case LITERAL_xor:
				{
				alt179=3;
				}
				break;
			case LITERAL_then:
				{
				alt179=4;
				}
				break;
			case LITERAL_else:
				{
				alt179=5;
				}
				break;
			case DOT:
			case LPAREN:
				{
				alt179=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}
			switch (alt179) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1537:3: ^( LITERAL_and (et+= eventTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_triggerLogicalExpression11781); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1537:20: (et+= eventTrigger )+
					int cnt174=0;
					loop174:
					while (true) {
						int alt174=2;
						int LA174_0 = input.LA(1);
						if ( (LA174_0==DOT||LA174_0==LPAREN) ) {
							alt174=1;
						}

						switch (alt174) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1537:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11785);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt174 >= 1 ) break loop174;
							EarlyExitException eee = new EarlyExitException(174, input);
							throw eee;
						}
						cnt174++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1538:5: -> conjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1540:3: ^( LITERAL_or (et+= eventTrigger )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_triggerLogicalExpression11812); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1540:19: (et+= eventTrigger )+
					int cnt175=0;
					loop175:
					while (true) {
						int alt175=2;
						int LA175_0 = input.LA(1);
						if ( (LA175_0==DOT||LA175_0==LPAREN) ) {
							alt175=1;
						}

						switch (alt175) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1540:19: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11816);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt175 >= 1 ) break loop175;
							EarlyExitException eee = new EarlyExitException(175, input);
							throw eee;
						}
						cnt175++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1541:5: -> disjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1543:3: ^( LITERAL_xor (et+= eventTrigger )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_triggerLogicalExpression11843); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1543:20: (et+= eventTrigger )+
					int cnt176=0;
					loop176:
					while (true) {
						int alt176=2;
						int LA176_0 = input.LA(1);
						if ( (LA176_0==DOT||LA176_0==LPAREN) ) {
							alt176=1;
						}

						switch (alt176) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1543:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11847);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt176 >= 1 ) break loop176;
							EarlyExitException eee = new EarlyExitException(176, input);
							throw eee;
						}
						cnt176++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1544:5: -> xor(terms=$et)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_et));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1546:3: ^( LITERAL_then (et+= eventTrigger )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_triggerLogicalExpression11874); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1546:21: (et+= eventTrigger )+
					int cnt177=0;
					loop177:
					while (true) {
						int alt177=2;
						int LA177_0 = input.LA(1);
						if ( (LA177_0==DOT||LA177_0==LPAREN) ) {
							alt177=1;
						}

						switch (alt177) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1546:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11878);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt177 >= 1 ) break loop177;
							EarlyExitException eee = new EarlyExitException(177, input);
							throw eee;
						}
						cnt177++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1547:5: -> cand(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1549:3: ^( LITERAL_else (et+= eventTrigger )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_triggerLogicalExpression11905); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1549:21: (et+= eventTrigger )+
					int cnt178=0;
					loop178:
					while (true) {
						int alt178=2;
						int LA178_0 = input.LA(1);
						if ( (LA178_0==DOT||LA178_0==LPAREN) ) {
							alt178=1;
						}

						switch (alt178) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1549:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11909);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt178 >= 1 ) break loop178;
							EarlyExitException eee = new EarlyExitException(178, input);
							throw eee;
						}
						cnt178++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1550:5: -> cor(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1552:3: first= eventTrigger
					{
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11935);
					first=eventTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1553:5: -> {$first.st}
					{
						retval.st = (first!=null?((StringTemplate)first.getTemplate()):null);
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerLogicalExpression"


	public static class eventTrigger_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "eventTrigger"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1556:1: eventTrigger : (tr= modeTrigger -> {$tr.st}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st));
	public final UnparseBLESS3.eventTrigger_return eventTrigger() throws RecognitionException {
		UnparseBLESS3.eventTrigger_return retval = new UnparseBLESS3.eventTrigger_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tr =null;
		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1557:3: (tr= modeTrigger -> {$tr.st}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st))
			int alt180=2;
			int LA180_0 = input.LA(1);
			if ( (LA180_0==DOT) ) {
				alt180=1;
			}
			else if ( (LA180_0==LPAREN) ) {
				alt180=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 180, 0, input);
				throw nvae;
			}

			switch (alt180) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1558:3: tr= modeTrigger
					{
					pushFollow(FOLLOW_modeTrigger_in_eventTrigger11960);
					tr=modeTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1559:5: -> {$tr.st}
					{
						retval.st = (tr!=null?((StringTemplate)tr.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1561:3: ^( LPAREN tle= triggerLogicalExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger11979); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger11983);
					tle=triggerLogicalExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger11985); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1562:5: -> parentheses(be=$tle.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (tle!=null?((StringTemplate)tle.getTemplate()):null)));
					}



					}
					break;

			}
		}

		catch (Exception re) 
			{
			countUnparserErrors++;
			Dump.it("unparse exception #"+countUnparserErrors);
			recognitionErrorOccurred=true;
		  if (retval==null)
		    Dump.it("null retval");
		  else 
		    {
		    Dump.it("retval.getClass()="+retval.getClass());
		    if (retval.start==null)
		      Dump.it("null retval.start");
		    else if (retval.start instanceof BAST)
			    BLESSmarker.setWarningMarker("UnparseBLESS3 exception:  "+
			      ((BAST)retval.start).toStringTree(),(BAST)retval.start);
			  else
			  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
			  }
		  reportError(re);
			}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "eventTrigger"

	// Delegated rules


	protected DFA3 dfa3 = new DFA3(this);
	protected DFA10 dfa10 = new DFA10(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA82 dfa82 = new DFA82(this);
	protected DFA88 dfa88 = new DFA88(this);
	static final String DFA3_eotS =
		"\11\uffff";
	static final String DFA3_eofS =
		"\11\uffff";
	static final String DFA3_minS =
		"\1\47\2\2\1\63\2\uffff\1\3\2\uffff";
	static final String DFA3_maxS =
		"\1\63\1\2\2\63\2\uffff\1\63\2\uffff";
	static final String DFA3_acceptS =
		"\4\uffff\1\3\1\4\1\uffff\1\1\1\2";
	static final String DFA3_specialS =
		"\11\uffff}>";
	static final String[] DFA3_transitionS = {
			"\1\1\13\uffff\1\2",
			"\1\3",
			"\1\4\1\5\43\uffff\1\5\13\uffff\1\5",
			"\1\6",
			"",
			"",
			"\1\10\40\uffff\1\7\16\uffff\1\6",
			"",
			""
	};

	static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
	static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
	static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
	static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
	static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
	static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
	static final short[][] DFA3_transition;

	static {
		int numStates = DFA3_transitionS.length;
		DFA3_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
		}
	}

	protected class DFA3 extends DFA {

		public DFA3(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 3;
			this.eot = DFA3_eot;
			this.eof = DFA3_eof;
			this.min = DFA3_min;
			this.max = DFA3_max;
			this.accept = DFA3_accept;
			this.special = DFA3_special;
			this.transition = DFA3_transition;
		}
		@Override
		public String getDescription() {
			return "222:1: componentName : ( ^( DOUBLE_COLON (ci+= ID )+ ^( DOT imp= ID ) ) -> component_name(ci=$ciimp=$imp.text)| ^( DOUBLE_COLON (ci+= ID )+ ) -> component_name(ci=$ci)| ^(id= ID ^( DOT imp= ID ) ) -> component_name(ci=$id.textimp=$imp.text)|id= ID -> {%{$id.text}});";
		}
	}

	static final String DFA10_eotS =
		"\7\uffff";
	static final String DFA10_eofS =
		"\7\uffff";
	static final String DFA10_minS =
		"\1\u00d2\1\2\1\42\1\uffff\1\3\2\uffff";
	static final String DFA10_maxS =
		"\1\u00d2\1\2\1\63\1\uffff\1\63\2\uffff";
	static final String DFA10_acceptS =
		"\3\uffff\1\3\1\uffff\1\1\1\2";
	static final String DFA10_specialS =
		"\7\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\20\uffff\1\4",
			"",
			"\1\5\36\uffff\1\6\20\uffff\1\4",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "258:1: unitFormula : ( ^( UNIT_FORMULA (top+= ID )+ ) -> unit_formula(top=$top)| ^( UNIT_FORMULA (top+= ID )+ DIVIDE (bottom+= ID )+ ) -> unit_formula(top=$topbottom=$bottom)| ^( UNIT_FORMULA DIVIDE (bottom+= ID )+ ) -> unit_formula(bottom=$bottom));";
		}
	}

	static final String DFA18_eotS =
		"\12\uffff";
	static final String DFA18_eofS =
		"\12\uffff";
	static final String DFA18_minS =
		"\1\32\1\2\1\u00d4\1\2\1\63\2\3\1\42\2\uffff";
	static final String DFA18_maxS =
		"\1\32\1\2\1\u00d4\1\2\3\63\1\u00ce\2\uffff";
	static final String DFA18_acceptS =
		"\10\uffff\1\1\1\2";
	static final String DFA18_specialS =
		"\12\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3",
			"\1\4",
			"\1\5",
			"\1\7\57\uffff\1\6",
			"\1\7\57\uffff\1\6",
			"\1\11\u00ab\uffff\1\10",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "290:1: unitFactor : ( ^( COMMA unit= unitName t= TIMES factor= NUMBER ) -> unit_factor(unit=$unit.stop=$t.textfactor=$factor.text)| ^( COMMA unit= unitName d= DIVIDE factor= NUMBER ) -> unit_factor(unit=$unit.stop=$d.textfactor=$factor.text));";
		}
	}

	static final String DFA23_eotS =
		"\u0330\uffff";
	static final String DFA23_eofS =
		"\u0330\uffff";
	static final String DFA23_minS =
		"\1\175\1\2\1\63\3\3\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff\4\47\2"+
		"\2\1\47\2\2\1\47\2\2\1\3\2\2\1\47\1\63\1\3\2\2\1\47\1\63\1\3\2\2\1\47"+
		"\1\63\1\3\1\47\1\63\1\47\2\2\1\63\1\3\1\47\1\63\1\47\2\2\1\63\1\3\1\47"+
		"\1\63\1\47\2\2\1\63\1\uffff\1\2\1\uffff\1\47\2\2\1\63\1\2\1\63\1\44\1"+
		"\2\1\3\1\uffff\1\2\1\uffff\1\47\2\2\1\63\1\2\1\63\1\44\1\2\1\3\1\uffff"+
		"\1\2\1\uffff\1\47\2\2\1\63\1\2\1\63\1\44\1\2\1\3\1\47\1\2\1\63\1\44\1"+
		"\2\1\3\1\63\1\3\1\2\1\63\2\47\1\2\1\63\1\44\1\2\1\3\1\63\1\3\1\2\1\63"+
		"\2\47\1\2\1\63\1\44\1\2\1\3\1\63\1\3\1\2\1\63\1\47\1\3\2\2\1\63\1\3\1"+
		"\2\1\63\1\3\1\63\1\3\1\2\1\47\2\63\1\3\2\2\1\63\1\3\1\2\1\63\1\3\1\63"+
		"\1\3\1\2\1\47\2\63\1\3\2\2\1\63\1\3\1\2\1\63\1\3\1\63\1\3\1\2\1\47\2\63"+
		"\1\3\1\47\2\63\1\3\1\2\1\47\2\63\3\3\1\63\3\3\1\47\2\63\1\3\1\2\1\47\2"+
		"\63\3\3\1\63\3\3\1\47\2\63\1\3\1\2\1\47\2\63\3\3\1\63\2\3\2\uffff\1\47"+
		"\2\2\1\63\3\3\1\63\3\3\1\47\2\2\3\3\2\uffff\1\47\2\2\1\63\3\3\1\63\3\3"+
		"\1\47\2\2\3\3\2\uffff\1\47\2\2\1\63\3\3\1\63\3\3\1\47\2\2\3\3\1\2\1\63"+
		"\1\44\1\2\3\3\2\2\3\3\1\47\2\2\2\63\1\3\2\47\3\2\1\63\1\44\1\2\3\3\2\2"+
		"\3\3\1\47\2\2\2\63\1\3\2\47\3\2\1\63\1\44\1\2\3\3\2\2\3\3\1\47\2\2\2\63"+
		"\1\3\2\47\2\2\1\63\1\3\1\2\1\63\2\3\2\2\2\63\1\3\1\47\1\3\2\2\2\63\5\3"+
		"\1\47\3\63\1\3\1\2\1\63\2\3\2\2\2\63\1\3\1\47\1\3\2\2\2\63\5\3\1\47\3"+
		"\63\1\3\1\2\1\63\2\3\2\2\2\63\1\3\1\47\1\3\2\2\2\63\5\3\1\47\3\63\1\3"+
		"\1\2\1\47\4\63\5\3\1\47\2\63\17\3\1\63\1\3\1\2\1\47\4\63\5\3\1\47\2\63"+
		"\17\3\1\63\1\3\1\2\1\47\4\63\5\3\1\47\2\63\22\3\1\63\26\3\1\47\10\3\1"+
		"\63\26\3\1\47\10\3\1\63\26\3\1\47\7\3\2\2\16\3\2\47\2\3\2\2\16\3\2\47"+
		"\2\3\2\2\16\3\2\47\1\3\2\2\2\63\1\3\1\47\1\3\2\2\3\3\2\2\2\63\1\3\1\47"+
		"\1\3\2\2\3\3\2\2\2\63\1\3\1\47\1\3\2\2\2\3\2\63\5\3\1\47\4\63\5\3\1\47"+
		"\4\63\5\3\1\47\2\63\124\3";
	static final String DFA23_maxS =
		"\1\175\1\2\1\u00a5\3\u0081\1\uffff\1\2\2\uffff\1\2\2\uffff\1\2\1\uffff"+
		"\4\u00b1\2\2\1\u00b1\2\2\1\u00b1\2\2\1\3\2\2\1\u0085\1\63\1\3\2\2\1\u0085"+
		"\1\63\1\3\2\2\1\u0085\1\63\1\u008c\1\u0085\1\63\1\47\1\2\1\47\1\63\1\u008c"+
		"\1\u0085\1\63\1\47\1\2\1\47\1\63\1\u008c\1\u0085\1\63\1\47\1\2\1\47\1"+
		"\63\1\uffff\1\2\1\uffff\1\47\1\2\1\47\1\63\1\2\1\63\1\44\1\2\1\3\1\uffff"+
		"\1\2\1\uffff\1\47\1\2\1\47\1\63\1\2\1\63\1\44\1\2\1\3\1\uffff\1\2\1\uffff"+
		"\1\47\1\2\1\47\1\63\1\2\1\63\1\44\1\2\1\3\1\u00b1\1\2\1\63\1\44\1\2\1"+
		"\3\2\63\1\2\1\63\2\u00b1\1\2\1\63\1\44\1\2\1\3\2\63\1\2\1\63\2\u00b1\1"+
		"\2\1\63\1\44\1\2\1\3\2\63\1\2\1\63\1\u00b1\1\3\2\2\2\63\1\2\1\63\1\3\2"+
		"\63\1\2\1\47\2\63\1\3\2\2\2\63\1\2\1\63\1\3\2\63\1\2\1\47\2\63\1\3\2\2"+
		"\2\63\1\2\1\63\1\3\2\63\1\2\1\47\2\63\1\u0081\1\u0085\3\63\1\2\1\47\2"+
		"\63\1\3\1\71\2\63\2\3\1\u0081\1\u0085\3\63\1\2\1\47\2\63\1\3\1\71\2\63"+
		"\2\3\1\u0081\1\u0085\3\63\1\2\1\47\2\63\1\3\1\71\2\63\2\3\2\uffff\1\47"+
		"\1\2\1\47\1\63\1\3\1\71\2\63\2\3\1\71\1\u00b1\2\2\2\3\1\71\2\uffff\1\47"+
		"\1\2\1\47\1\63\1\3\1\71\2\63\2\3\1\71\1\u00b1\2\2\2\3\1\71\2\uffff\1\47"+
		"\1\2\1\47\1\63\1\3\1\71\2\63\2\3\1\71\1\u00b1\2\2\2\3\1\71\1\2\1\63\1"+
		"\44\1\2\1\3\1\71\1\3\2\2\2\3\1\71\1\u00b1\2\2\1\u00af\1\u009f\1\3\1\47"+
		"\1\u00b1\3\2\1\63\1\44\1\2\1\3\1\71\1\3\2\2\2\3\1\71\1\u00b1\2\2\1\u00af"+
		"\1\u009f\1\3\1\47\1\u00b1\3\2\1\63\1\44\1\2\1\3\1\71\1\3\2\2\2\3\1\71"+
		"\1\u00b1\2\2\1\u00af\1\u009f\1\3\1\47\1\u00b1\2\2\2\63\1\2\1\63\2\3\2"+
		"\2\1\u00af\1\u009f\1\3\1\47\1\3\2\2\1\u00af\1\u009f\5\3\1\47\1\u00af\1"+
		"\u009f\2\63\1\2\1\63\2\3\2\2\1\u00af\1\u009f\1\3\1\47\1\3\2\2\1\u00af"+
		"\1\u009f\5\3\1\47\1\u00af\1\u009f\2\63\1\2\1\63\2\3\2\2\1\u00af\1\u009f"+
		"\1\3\1\47\1\3\2\2\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f\2\63\1\2\1"+
		"\47\2\63\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f\5\3\5\71\5\3\2\63\1"+
		"\2\1\47\2\63\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f\5\3\5\71\5\3\2\63"+
		"\1\2\1\47\2\63\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f\5\3\5\71\6\3\1"+
		"\71\2\63\7\3\5\71\5\3\5\71\1\u00b1\5\71\1\3\1\71\2\63\7\3\5\71\5\3\5\71"+
		"\1\u00b1\5\71\1\3\1\71\2\63\7\3\5\71\5\3\5\71\1\u00b1\6\71\1\3\2\2\2\3"+
		"\6\71\1\3\5\71\2\u00b1\1\71\1\3\2\2\2\3\6\71\1\3\5\71\2\u00b1\1\71\1\3"+
		"\2\2\2\3\6\71\1\3\5\71\2\u00b1\1\3\2\2\1\u00af\1\u009f\1\3\1\47\1\3\2"+
		"\2\3\3\2\2\1\u00af\1\u009f\1\3\1\47\1\3\2\2\3\3\2\2\1\u00af\1\u009f\1"+
		"\3\1\47\1\3\2\2\2\3\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f\1\u00af\1"+
		"\u009f\5\3\1\47\1\u00af\1\u009f\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f"+
		"\5\3\5\71\12\3\5\71\12\3\5\71\5\3\5\71\1\3\12\71\1\3\12\71\1\3\5\71\6"+
		"\3";
	static final String DFA23_acceptS =
		"\6\uffff\1\1\1\uffff\1\12\1\2\1\uffff\1\13\1\3\1\uffff\1\14\60\uffff\1"+
		"\4\1\uffff\1\15\11\uffff\1\5\1\uffff\1\16\11\uffff\1\6\1\uffff\1\17\u0081"+
		"\uffff\1\7\1\20\21\uffff\1\10\1\21\21\uffff\1\11\1\22\u022d\uffff";
	static final String DFA23_specialS =
		"\u0330\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\1",
			"\1\2",
			"\1\3\120\uffff\1\4\40\uffff\1\5",
			"\1\6\42\uffff\1\7\132\uffff\1\10",
			"\1\11\42\uffff\1\12\132\uffff\1\13",
			"\1\14\42\uffff\1\15\132\uffff\1\16",
			"",
			"\1\17",
			"",
			"",
			"\1\20",
			"",
			"",
			"\1\21",
			"",
			"\1\24\u0087\uffff\1\22\1\uffff\1\23",
			"\1\27\u0087\uffff\1\25\1\uffff\1\26",
			"\1\32\u0087\uffff\1\30\1\uffff\1\31",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\36",
			"\1\37",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\43",
			"\1\44",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\56\13\uffff\1\57\121\uffff\1\55",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\65\13\uffff\1\66\121\uffff\1\64",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\74\13\uffff\1\75\121\uffff\1\73",
			"\1\76",
			"\1\77\175\uffff\1\101\12\uffff\1\100",
			"\1\103\13\uffff\1\104\121\uffff\1\102",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110\44\uffff\1\111",
			"\1\112",
			"\1\113\175\uffff\1\115\12\uffff\1\114",
			"\1\117\13\uffff\1\120\121\uffff\1\116",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124\44\uffff\1\125",
			"\1\126",
			"\1\127\175\uffff\1\131\12\uffff\1\130",
			"\1\133\13\uffff\1\134\121\uffff\1\132",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140\44\uffff\1\141",
			"\1\142",
			"",
			"\1\143",
			"",
			"\1\144",
			"\1\145",
			"\1\146\44\uffff\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"",
			"\1\156",
			"",
			"\1\157",
			"\1\160",
			"\1\161\44\uffff\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"",
			"\1\171",
			"",
			"\1\172",
			"\1\173",
			"\1\174\44\uffff\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0086\u0087\uffff\1\u0084\1\uffff\1\u0085",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008f\40\uffff\1\u008e\16\uffff\1\u008d",
			"\1\u0090",
			"\1\u0091",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\u0094\u0087\uffff\1\u0092\1\uffff\1\u0093",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009d\40\uffff\1\u009c\16\uffff\1\u009b",
			"\1\u009e",
			"\1\u009f",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\u00a2\u0087\uffff\1\u00a0\1\uffff\1\u00a1",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00ab\40\uffff\1\u00aa\16\uffff\1\u00a9",
			"\1\u00ac",
			"\1\u00ad",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b4\40\uffff\1\u00b3\16\uffff\1\u00b2",
			"\1\u00b5",
			"\1\u00b6",
			"\1\52",
			"\1\u00b7",
			"\1\u00b8\40\uffff\1\u008e\16\uffff\1\u00b9",
			"\1\u00ba",
			"\1\111",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c3\40\uffff\1\u00c2\16\uffff\1\u00c1",
			"\1\u00c4",
			"\1\u00c5",
			"\1\61",
			"\1\u00c6",
			"\1\u00c7\40\uffff\1\u009c\16\uffff\1\u00c8",
			"\1\u00c9",
			"\1\125",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d2\40\uffff\1\u00d1\16\uffff\1\u00d0",
			"\1\u00d3",
			"\1\u00d4",
			"\1\70",
			"\1\u00d5",
			"\1\u00d6\40\uffff\1\u00aa\16\uffff\1\u00d7",
			"\1\u00d8",
			"\1\141",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db\175\uffff\1\u00dc",
			"\1\u00de\13\uffff\1\u00df\121\uffff\1\u00dd",
			"\1\u00e0",
			"\1\u00e1",
			"\1\u00e2\40\uffff\1\u00b3\16\uffff\1\u00e3",
			"\1\u00e4",
			"\1\147",
			"\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8\40\uffff\1\u00ea\2\uffff\1\111\21\uffff\1\u00e9",
			"\1\u008f\40\uffff\1\u008e\16\uffff\1\u00b9",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee\175\uffff\1\u00ef",
			"\1\u00f1\13\uffff\1\u00f2\121\uffff\1\u00f0",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5\40\uffff\1\u00c2\16\uffff\1\u00f6",
			"\1\u00f7",
			"\1\162",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb\40\uffff\1\u00fd\2\uffff\1\125\21\uffff\1\u00fc",
			"\1\u009d\40\uffff\1\u009c\16\uffff\1\u00c8",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101\175\uffff\1\u0102",
			"\1\u0104\13\uffff\1\u0105\121\uffff\1\u0103",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108\40\uffff\1\u00d1\16\uffff\1\u0109",
			"\1\u010a",
			"\1\175",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e\40\uffff\1\u0110\2\uffff\1\141\21\uffff\1\u010f",
			"\1\u00ab\40\uffff\1\u00aa\16\uffff\1\u00d7",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"",
			"",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116\44\uffff\1\u0117",
			"\1\u0118",
			"\1\u0119",
			"\1\u011a\40\uffff\1\u011c\2\uffff\1\147\21\uffff\1\u011b",
			"\1\u00b4\40\uffff\1\u00b3\16\uffff\1\u00e3",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120\40\uffff\1\u0122\24\uffff\1\u0121",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\u0123",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\1\u0127\40\uffff\1\u0129\24\uffff\1\u0128",
			"",
			"",
			"\1\u012a",
			"\1\u012b",
			"\1\u012c\44\uffff\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130\40\uffff\1\u0132\2\uffff\1\162\21\uffff\1\u0131",
			"\1\u00c3\40\uffff\1\u00c2\16\uffff\1\u00f6",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136\40\uffff\1\u0138\24\uffff\1\u0137",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d\40\uffff\1\u013f\24\uffff\1\u013e",
			"",
			"",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142\44\uffff\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146\40\uffff\1\u0148\2\uffff\1\175\21\uffff\1\u0147",
			"\1\u00d2\40\uffff\1\u00d1\16\uffff\1\u0109",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c\40\uffff\1\u014e\24\uffff\1\u014d",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153\40\uffff\1\u0155\24\uffff\1\u0154",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b\40\uffff\1\u015d\24\uffff\1\u015c",
			"\1\52",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162\40\uffff\1\u0164\24\uffff\1\u0163",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\u0165",
			"\1\u0166",
			"\1\u0168\173\uffff\1\u0167",
			"\1\u0169\74\uffff\1\u016b\56\uffff\1\u016a",
			"\1\u016c",
			"\1\111",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174\40\uffff\1\u0176\24\uffff\1\u0175",
			"\1\61",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b\40\uffff\1\u017d\24\uffff\1\u017c",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\u017e",
			"\1\u017f",
			"\1\u0181\173\uffff\1\u0180",
			"\1\u0182\74\uffff\1\u0184\56\uffff\1\u0183",
			"\1\u0185",
			"\1\125",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\u0186",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a",
			"\1\u018b",
			"\1\u018c",
			"\1\u018d\40\uffff\1\u018f\24\uffff\1\u018e",
			"\1\70",
			"\1\u0190",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194\40\uffff\1\u0196\24\uffff\1\u0195",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\u0197",
			"\1\u0198",
			"\1\u019a\173\uffff\1\u0199",
			"\1\u019b\74\uffff\1\u019d\56\uffff\1\u019c",
			"\1\u019e",
			"\1\141",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a4\40\uffff\1\u01a3\16\uffff\1\u01a2",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u00ae",
			"\1\52",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01aa\173\uffff\1\u01a9",
			"\1\u01ab\74\uffff\1\u01ad\56\uffff\1\u01ac",
			"\1\u01ae",
			"\1\147",
			"\1\52",
			"\1\u01af",
			"\1\u01b0",
			"\1\u01b2\173\uffff\1\u01b1",
			"\1\u01b3\74\uffff\1\u01b5\56\uffff\1\u01b4",
			"\1\u01b6",
			"\1\u01b7",
			"\1\u01b8",
			"\1\u01b9",
			"\1\u01ba",
			"\1\111",
			"\1\u01bc\173\uffff\1\u01bb",
			"\1\u01bd\74\uffff\1\u01bf\56\uffff\1\u01be",
			"\1\u01c0",
			"\1\u01c3\40\uffff\1\u01c2\16\uffff\1\u01c1",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u00bd",
			"\1\61",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c9\173\uffff\1\u01c8",
			"\1\u01ca\74\uffff\1\u01cc\56\uffff\1\u01cb",
			"\1\u01cd",
			"\1\162",
			"\1\61",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d1\173\uffff\1\u01d0",
			"\1\u01d2\74\uffff\1\u01d4\56\uffff\1\u01d3",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d8",
			"\1\u01d9",
			"\1\125",
			"\1\u01db\173\uffff\1\u01da",
			"\1\u01dc\74\uffff\1\u01de\56\uffff\1\u01dd",
			"\1\u01df",
			"\1\u01e2\40\uffff\1\u01e1\16\uffff\1\u01e0",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u00cc",
			"\1\70",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e8\173\uffff\1\u01e7",
			"\1\u01e9\74\uffff\1\u01eb\56\uffff\1\u01ea",
			"\1\u01ec",
			"\1\175",
			"\1\70",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01f0\173\uffff\1\u01ef",
			"\1\u01f1\74\uffff\1\u01f3\56\uffff\1\u01f2",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\141",
			"\1\u01fa\173\uffff\1\u01f9",
			"\1\u01fb\74\uffff\1\u01fd\56\uffff\1\u01fc",
			"\1\u01fe",
			"\1\u01ff\40\uffff\1\u01a3\16\uffff\1\u0200",
			"\1\u0201",
			"\1\u0117",
			"\1\u0202",
			"\1\u0203",
			"\1\u0205\173\uffff\1\u0204",
			"\1\u0206\74\uffff\1\u0208\56\uffff\1\u0207",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\147",
			"\1\u020f\173\uffff\1\u020e",
			"\1\u0210\74\uffff\1\u0212\56\uffff\1\u0211",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"\1\u0217",
			"\1\u0218\40\uffff\1\u00ea\24\uffff\1\u00e9",
			"\1\u0218\40\uffff\1\u00ea\24\uffff\1\u00e9",
			"\1\u0218\40\uffff\1\u00ea\24\uffff\1\u00e9",
			"\1\u0218\40\uffff\1\u00ea\24\uffff\1\u00e9",
			"\1\u0218\40\uffff\1\u00ea\24\uffff\1\u00e9",
			"\1\u0219",
			"\1\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f\40\uffff\1\u01c2\16\uffff\1\u0220",
			"\1\u0221",
			"\1\u012d",
			"\1\u0222",
			"\1\u0223",
			"\1\u0225\173\uffff\1\u0224",
			"\1\u0226\74\uffff\1\u0228\56\uffff\1\u0227",
			"\1\u0229",
			"\1\u022a",
			"\1\u022b",
			"\1\u022c",
			"\1\u022d",
			"\1\162",
			"\1\u022f\173\uffff\1\u022e",
			"\1\u0230\74\uffff\1\u0232\56\uffff\1\u0231",
			"\1\u0233",
			"\1\u0234",
			"\1\u0235",
			"\1\u0236",
			"\1\u0237",
			"\1\u0238\40\uffff\1\u00fd\24\uffff\1\u00fc",
			"\1\u0238\40\uffff\1\u00fd\24\uffff\1\u00fc",
			"\1\u0238\40\uffff\1\u00fd\24\uffff\1\u00fc",
			"\1\u0238\40\uffff\1\u00fd\24\uffff\1\u00fc",
			"\1\u0238\40\uffff\1\u00fd\24\uffff\1\u00fc",
			"\1\u0239",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"\1\u023e",
			"\1\u023f\40\uffff\1\u01e1\16\uffff\1\u0240",
			"\1\u0241",
			"\1\u0143",
			"\1\u0242",
			"\1\u0243",
			"\1\u0245\173\uffff\1\u0244",
			"\1\u0246\74\uffff\1\u0248\56\uffff\1\u0247",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\175",
			"\1\u024f\173\uffff\1\u024e",
			"\1\u0250\74\uffff\1\u0252\56\uffff\1\u0251",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258\40\uffff\1\u0110\24\uffff\1\u010f",
			"\1\u0258\40\uffff\1\u0110\24\uffff\1\u010f",
			"\1\u0258\40\uffff\1\u0110\24\uffff\1\u010f",
			"\1\u0258\40\uffff\1\u0110\24\uffff\1\u010f",
			"\1\u0258\40\uffff\1\u0110\24\uffff\1\u010f",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b",
			"\1\u025c",
			"\1\u025d",
			"\1\u025e",
			"\1\u025f\40\uffff\1\u0261\2\uffff\1\u0117\21\uffff\1\u0260",
			"\1\u01a4\40\uffff\1\u01a3\16\uffff\1\u0200",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0267",
			"\1\u0268",
			"\1\u0269",
			"\1\u026a\40\uffff\1\u011c\24\uffff\1\u011b",
			"\1\u026a\40\uffff\1\u011c\24\uffff\1\u011b",
			"\1\u026a\40\uffff\1\u011c\24\uffff\1\u011b",
			"\1\u026a\40\uffff\1\u011c\24\uffff\1\u011b",
			"\1\u026a\40\uffff\1\u011c\24\uffff\1\u011b",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270\40\uffff\1\u0122\24\uffff\1\u0121",
			"\1\u0270\40\uffff\1\u0122\24\uffff\1\u0121",
			"\1\u0270\40\uffff\1\u0122\24\uffff\1\u0121",
			"\1\u0270\40\uffff\1\u0122\24\uffff\1\u0121",
			"\1\u0270\40\uffff\1\u0122\24\uffff\1\u0121",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\u0271\40\uffff\1\u0129\24\uffff\1\u0128",
			"\1\u0271\40\uffff\1\u0129\24\uffff\1\u0128",
			"\1\u0271\40\uffff\1\u0129\24\uffff\1\u0128",
			"\1\u0271\40\uffff\1\u0129\24\uffff\1\u0128",
			"\1\u0271\40\uffff\1\u0129\24\uffff\1\u0128",
			"\1\u0272",
			"\1\u0273\40\uffff\1\u0275\2\uffff\1\u012d\21\uffff\1\u0274",
			"\1\u01c3\40\uffff\1\u01c2\16\uffff\1\u0220",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e\40\uffff\1\u0132\24\uffff\1\u0131",
			"\1\u027e\40\uffff\1\u0132\24\uffff\1\u0131",
			"\1\u027e\40\uffff\1\u0132\24\uffff\1\u0131",
			"\1\u027e\40\uffff\1\u0132\24\uffff\1\u0131",
			"\1\u027e\40\uffff\1\u0132\24\uffff\1\u0131",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\1\u0284\40\uffff\1\u0138\24\uffff\1\u0137",
			"\1\u0284\40\uffff\1\u0138\24\uffff\1\u0137",
			"\1\u0284\40\uffff\1\u0138\24\uffff\1\u0137",
			"\1\u0284\40\uffff\1\u0138\24\uffff\1\u0137",
			"\1\u0284\40\uffff\1\u0138\24\uffff\1\u0137",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\u0285\40\uffff\1\u013f\24\uffff\1\u013e",
			"\1\u0285\40\uffff\1\u013f\24\uffff\1\u013e",
			"\1\u0285\40\uffff\1\u013f\24\uffff\1\u013e",
			"\1\u0285\40\uffff\1\u013f\24\uffff\1\u013e",
			"\1\u0285\40\uffff\1\u013f\24\uffff\1\u013e",
			"\1\u0286",
			"\1\u0287\40\uffff\1\u0289\2\uffff\1\u0143\21\uffff\1\u0288",
			"\1\u01e2\40\uffff\1\u01e1\16\uffff\1\u0240",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u028f",
			"\1\u0290",
			"\1\u0291",
			"\1\u0292\40\uffff\1\u0148\24\uffff\1\u0147",
			"\1\u0292\40\uffff\1\u0148\24\uffff\1\u0147",
			"\1\u0292\40\uffff\1\u0148\24\uffff\1\u0147",
			"\1\u0292\40\uffff\1\u0148\24\uffff\1\u0147",
			"\1\u0292\40\uffff\1\u0148\24\uffff\1\u0147",
			"\1\u0293",
			"\1\u0294",
			"\1\u0295",
			"\1\u0296",
			"\1\u0297",
			"\1\u0298\40\uffff\1\u014e\24\uffff\1\u014d",
			"\1\u0298\40\uffff\1\u014e\24\uffff\1\u014d",
			"\1\u0298\40\uffff\1\u014e\24\uffff\1\u014d",
			"\1\u0298\40\uffff\1\u014e\24\uffff\1\u014d",
			"\1\u0298\40\uffff\1\u014e\24\uffff\1\u014d",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\u0299\40\uffff\1\u0155\24\uffff\1\u0154",
			"\1\u0299\40\uffff\1\u0155\24\uffff\1\u0154",
			"\1\u0299\40\uffff\1\u0155\24\uffff\1\u0154",
			"\1\u0299\40\uffff\1\u0155\24\uffff\1\u0154",
			"\1\u0299\40\uffff\1\u0155\24\uffff\1\u0154",
			"\1\u029a\40\uffff\1\u029c\24\uffff\1\u029b",
			"\1\u00ae",
			"\1\u029d",
			"\1\u029e",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1\40\uffff\1\u02a3\24\uffff\1\u02a2",
			"\1\u02a4\40\uffff\1\u015d\24\uffff\1\u015c",
			"\1\u02a4\40\uffff\1\u015d\24\uffff\1\u015c",
			"\1\u02a4\40\uffff\1\u015d\24\uffff\1\u015c",
			"\1\u02a4\40\uffff\1\u015d\24\uffff\1\u015c",
			"\1\u02a4\40\uffff\1\u015d\24\uffff\1\u015c",
			"\1\52",
			"\1\u02a5\40\uffff\1\u0164\24\uffff\1\u0163",
			"\1\u02a5\40\uffff\1\u0164\24\uffff\1\u0163",
			"\1\u02a5\40\uffff\1\u0164\24\uffff\1\u0163",
			"\1\u02a5\40\uffff\1\u0164\24\uffff\1\u0163",
			"\1\u02a5\40\uffff\1\u0164\24\uffff\1\u0163",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\35\u0087\uffff\1\33\1\uffff\1\34",
			"\1\u02a6\40\uffff\1\u02a8\24\uffff\1\u02a7",
			"\1\u00bd",
			"\1\u02a9",
			"\1\u02aa",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad\40\uffff\1\u02af\24\uffff\1\u02ae",
			"\1\u02b0\40\uffff\1\u0176\24\uffff\1\u0175",
			"\1\u02b0\40\uffff\1\u0176\24\uffff\1\u0175",
			"\1\u02b0\40\uffff\1\u0176\24\uffff\1\u0175",
			"\1\u02b0\40\uffff\1\u0176\24\uffff\1\u0175",
			"\1\u02b0\40\uffff\1\u0176\24\uffff\1\u0175",
			"\1\61",
			"\1\u02b1\40\uffff\1\u017d\24\uffff\1\u017c",
			"\1\u02b1\40\uffff\1\u017d\24\uffff\1\u017c",
			"\1\u02b1\40\uffff\1\u017d\24\uffff\1\u017c",
			"\1\u02b1\40\uffff\1\u017d\24\uffff\1\u017c",
			"\1\u02b1\40\uffff\1\u017d\24\uffff\1\u017c",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\42\u0087\uffff\1\40\1\uffff\1\41",
			"\1\u02b2\40\uffff\1\u02b4\24\uffff\1\u02b3",
			"\1\u00cc",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9\40\uffff\1\u02bb\24\uffff\1\u02ba",
			"\1\u02bc\40\uffff\1\u018f\24\uffff\1\u018e",
			"\1\u02bc\40\uffff\1\u018f\24\uffff\1\u018e",
			"\1\u02bc\40\uffff\1\u018f\24\uffff\1\u018e",
			"\1\u02bc\40\uffff\1\u018f\24\uffff\1\u018e",
			"\1\u02bc\40\uffff\1\u018f\24\uffff\1\u018e",
			"\1\70",
			"\1\u02bd\40\uffff\1\u0196\24\uffff\1\u0195",
			"\1\u02bd\40\uffff\1\u0196\24\uffff\1\u0195",
			"\1\u02bd\40\uffff\1\u0196\24\uffff\1\u0195",
			"\1\u02bd\40\uffff\1\u0196\24\uffff\1\u0195",
			"\1\u02bd\40\uffff\1\u0196\24\uffff\1\u0195",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\47\u0087\uffff\1\45\1\uffff\1\46",
			"\1\u00ae",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c1\173\uffff\1\u02c0",
			"\1\u02c2\74\uffff\1\u02c4\56\uffff\1\u02c3",
			"\1\u02c5",
			"\1\u0117",
			"\1\u00ae",
			"\1\u02c6",
			"\1\u02c7",
			"\1\52",
			"\1\52",
			"\1\u00bd",
			"\1\u02c8",
			"\1\u02c9",
			"\1\u02cb\173\uffff\1\u02ca",
			"\1\u02cc\74\uffff\1\u02ce\56\uffff\1\u02cd",
			"\1\u02cf",
			"\1\u012d",
			"\1\u00bd",
			"\1\u02d0",
			"\1\u02d1",
			"\1\61",
			"\1\61",
			"\1\u00cc",
			"\1\u02d2",
			"\1\u02d3",
			"\1\u02d5\173\uffff\1\u02d4",
			"\1\u02d6\74\uffff\1\u02d8\56\uffff\1\u02d7",
			"\1\u02d9",
			"\1\u0143",
			"\1\u00cc",
			"\1\u02da",
			"\1\u02db",
			"\1\70",
			"\1\70",
			"\1\u02dd\173\uffff\1\u02dc",
			"\1\u02de\74\uffff\1\u02e0\56\uffff\1\u02df",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\1\u0117",
			"\1\u02e7\173\uffff\1\u02e6",
			"\1\u02e8\74\uffff\1\u02ea\56\uffff\1\u02e9",
			"\1\u02ec\173\uffff\1\u02eb",
			"\1\u02ed\74\uffff\1\u02ef\56\uffff\1\u02ee",
			"\1\u02f0",
			"\1\u02f1",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"\1\u012d",
			"\1\u02f6\173\uffff\1\u02f5",
			"\1\u02f7\74\uffff\1\u02f9\56\uffff\1\u02f8",
			"\1\u02fb\173\uffff\1\u02fa",
			"\1\u02fc\74\uffff\1\u02fe\56\uffff\1\u02fd",
			"\1\u02ff",
			"\1\u0300",
			"\1\u0301",
			"\1\u0302",
			"\1\u0303",
			"\1\u0143",
			"\1\u0305\173\uffff\1\u0304",
			"\1\u0306\74\uffff\1\u0308\56\uffff\1\u0307",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\1\u030c",
			"\1\u030d",
			"\1\u030e\40\uffff\1\u0261\24\uffff\1\u0260",
			"\1\u030e\40\uffff\1\u0261\24\uffff\1\u0260",
			"\1\u030e\40\uffff\1\u0261\24\uffff\1\u0260",
			"\1\u030e\40\uffff\1\u0261\24\uffff\1\u0260",
			"\1\u030e\40\uffff\1\u0261\24\uffff\1\u0260",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\1\u0312",
			"\1\u0313",
			"\1\u0314",
			"\1\u0315",
			"\1\u0316",
			"\1\u0317",
			"\1\u0318",
			"\1\u0319\40\uffff\1\u0275\24\uffff\1\u0274",
			"\1\u0319\40\uffff\1\u0275\24\uffff\1\u0274",
			"\1\u0319\40\uffff\1\u0275\24\uffff\1\u0274",
			"\1\u0319\40\uffff\1\u0275\24\uffff\1\u0274",
			"\1\u0319\40\uffff\1\u0275\24\uffff\1\u0274",
			"\1\u031a",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f",
			"\1\u0320",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324\40\uffff\1\u0289\24\uffff\1\u0288",
			"\1\u0324\40\uffff\1\u0289\24\uffff\1\u0288",
			"\1\u0324\40\uffff\1\u0289\24\uffff\1\u0288",
			"\1\u0324\40\uffff\1\u0289\24\uffff\1\u0288",
			"\1\u0324\40\uffff\1\u0289\24\uffff\1\u0288",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a\40\uffff\1\u029c\24\uffff\1\u029b",
			"\1\u032a\40\uffff\1\u029c\24\uffff\1\u029b",
			"\1\u032a\40\uffff\1\u029c\24\uffff\1\u029b",
			"\1\u032a\40\uffff\1\u029c\24\uffff\1\u029b",
			"\1\u032a\40\uffff\1\u029c\24\uffff\1\u029b",
			"\1\u00ae",
			"\1\u032b\40\uffff\1\u02a3\24\uffff\1\u02a2",
			"\1\u032b\40\uffff\1\u02a3\24\uffff\1\u02a2",
			"\1\u032b\40\uffff\1\u02a3\24\uffff\1\u02a2",
			"\1\u032b\40\uffff\1\u02a3\24\uffff\1\u02a2",
			"\1\u032b\40\uffff\1\u02a3\24\uffff\1\u02a2",
			"\1\u032c\40\uffff\1\u02a8\24\uffff\1\u02a7",
			"\1\u032c\40\uffff\1\u02a8\24\uffff\1\u02a7",
			"\1\u032c\40\uffff\1\u02a8\24\uffff\1\u02a7",
			"\1\u032c\40\uffff\1\u02a8\24\uffff\1\u02a7",
			"\1\u032c\40\uffff\1\u02a8\24\uffff\1\u02a7",
			"\1\u00bd",
			"\1\u032d\40\uffff\1\u02af\24\uffff\1\u02ae",
			"\1\u032d\40\uffff\1\u02af\24\uffff\1\u02ae",
			"\1\u032d\40\uffff\1\u02af\24\uffff\1\u02ae",
			"\1\u032d\40\uffff\1\u02af\24\uffff\1\u02ae",
			"\1\u032d\40\uffff\1\u02af\24\uffff\1\u02ae",
			"\1\u032e\40\uffff\1\u02b4\24\uffff\1\u02b3",
			"\1\u032e\40\uffff\1\u02b4\24\uffff\1\u02b3",
			"\1\u032e\40\uffff\1\u02b4\24\uffff\1\u02b3",
			"\1\u032e\40\uffff\1\u02b4\24\uffff\1\u02b3",
			"\1\u032e\40\uffff\1\u02b4\24\uffff\1\u02b3",
			"\1\u00cc",
			"\1\u032f\40\uffff\1\u02bb\24\uffff\1\u02ba",
			"\1\u032f\40\uffff\1\u02bb\24\uffff\1\u02ba",
			"\1\u032f\40\uffff\1\u02bb\24\uffff\1\u02ba",
			"\1\u032f\40\uffff\1\u02bb\24\uffff\1\u02ba",
			"\1\u032f\40\uffff\1\u02bb\24\uffff\1\u02ba",
			"\1\u00ae",
			"\1\u00ae",
			"\1\u00bd",
			"\1\u00bd",
			"\1\u00cc",
			"\1\u00cc"
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "353:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st));";
		}
	}

	static final String DFA82_eotS =
		"\135\uffff";
	static final String DFA82_eofS =
		"\135\uffff";
	static final String DFA82_minS =
		"\1\u00bd\1\2\1\47\1\3\2\2\4\uffff\1\47\1\63\1\47\2\2\1\63\1\2\1\63\1\44"+
		"\1\2\1\3\1\63\1\3\1\2\1\63\1\3\1\63\1\3\1\2\1\47\2\63\3\3\1\63\4\3\2\2"+
		"\4\3\2\2\2\63\1\3\1\47\1\3\2\2\2\63\5\3\1\47\2\63\34\3";
	static final String DFA82_maxS =
		"\1\u00bd\1\2\1\u00b1\1\u00a5\2\2\4\uffff\1\u0085\1\63\1\47\1\2\1\47\1"+
		"\63\1\2\1\63\1\44\1\2\1\3\2\63\1\2\1\63\1\u00a5\2\63\1\2\1\47\2\63\1\3"+
		"\1\71\2\63\2\3\1\71\1\u00a5\2\2\2\3\1\71\1\u00a5\2\2\1\u00af\1\u009f\1"+
		"\3\1\47\1\u00a5\2\2\1\u00af\1\u009f\5\3\1\47\1\u00af\1\u009f\5\3\5\71"+
		"\5\3\5\71\1\u00a5\5\71\2\u00a5";
	static final String DFA82_acceptS =
		"\6\uffff\1\1\1\2\1\3\1\4\123\uffff";
	static final String DFA82_specialS =
		"\135\uffff}>";
	static final String[] DFA82_transitionS = {
			"\1\1",
			"\1\2",
			"\1\5\u0087\uffff\1\3\1\uffff\1\4",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\12",
			"\1\13",
			"",
			"",
			"",
			"",
			"\1\15\13\uffff\1\16\121\uffff\1\14",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22\44\uffff\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\35\40\uffff\1\34\16\uffff\1\33",
			"\1\36",
			"\1\37",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\40",
			"\1\41\40\uffff\1\34\16\uffff\1\42",
			"\1\43",
			"\1\23",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47\40\uffff\1\51\2\uffff\1\23\21\uffff\1\50",
			"\1\35\40\uffff\1\34\16\uffff\1\42",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\40\uffff\1\57\24\uffff\1\56",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64\40\uffff\1\66\24\uffff\1\65",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\67",
			"\1\70",
			"\1\72\173\uffff\1\71",
			"\1\73\74\uffff\1\75\56\uffff\1\74",
			"\1\76",
			"\1\23",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\77",
			"\1\100",
			"\1\102\173\uffff\1\101",
			"\1\103\74\uffff\1\105\56\uffff\1\104",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\23",
			"\1\114\173\uffff\1\113",
			"\1\115\74\uffff\1\117\56\uffff\1\116",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125\40\uffff\1\51\24\uffff\1\50",
			"\1\125\40\uffff\1\51\24\uffff\1\50",
			"\1\125\40\uffff\1\51\24\uffff\1\50",
			"\1\125\40\uffff\1\51\24\uffff\1\50",
			"\1\125\40\uffff\1\51\24\uffff\1\50",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133\40\uffff\1\57\24\uffff\1\56",
			"\1\133\40\uffff\1\57\24\uffff\1\56",
			"\1\133\40\uffff\1\57\24\uffff\1\56",
			"\1\133\40\uffff\1\57\24\uffff\1\56",
			"\1\133\40\uffff\1\57\24\uffff\1\56",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\134\40\uffff\1\66\24\uffff\1\65",
			"\1\134\40\uffff\1\66\24\uffff\1\65",
			"\1\134\40\uffff\1\66\24\uffff\1\65",
			"\1\134\40\uffff\1\66\24\uffff\1\65",
			"\1\134\40\uffff\1\66\24\uffff\1\65",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11",
			"\1\6\57\uffff\1\7\120\uffff\1\10\40\uffff\1\11"
	};

	static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
	static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
	static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
	static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
	static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
	static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
	static final short[][] DFA82_transition;

	static {
		int numStates = DFA82_transitionS.length;
		DFA82_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
		}
	}

	protected class DFA82 extends DFA {

		public DFA82(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 82;
			this.eot = DFA82_eot;
			this.eof = DFA82_eof;
			this.min = DFA82_min;
			this.max = DFA82_max;
			this.accept = DFA82_accept;
			this.special = DFA82_special;
			this.transition = DFA82_transition;
		}
		@Override
		public String getDescription() {
			return "1043:1: quantity : ( ^( QUANTITY num= aNumber ) -> quantity(num=$num.st)| ^( QUANTITY num= aNumber unit= ID ) -> quantity(num=$num.stunit=$unit.text)| ^( QUANTITY num= aNumber sc= LITERAL_scalar ) -> quantity(num=$num.stunit=$sc.text)| ^( QUANTITY num= aNumber wh= LITERAL_whole ) -> quantity(num=$num.stunit=$wh.text));";
		}
	}

	static final String DFA88_eotS =
		"\47\uffff";
	static final String DFA88_eofS =
		"\47\uffff";
	static final String DFA88_minS =
		"\1\u00b1\1\2\2\47\3\2\1\63\1\44\1\2\1\63\1\3\1\2\2\63\1\3\1\2\1\47\2\63"+
		"\3\3\1\63\3\3\2\uffff\3\3\2\uffff\1\3\1\47\2\uffff\1\47";
	static final String DFA88_maxS =
		"\1\u00b1\1\2\1\u0085\1\47\1\2\1\47\1\2\1\63\1\44\1\2\2\63\1\2\3\63\1\2"+
		"\1\47\2\63\1\3\1\71\2\63\2\3\1\71\2\uffff\2\3\1\71\2\uffff\1\3\1\47\2"+
		"\uffff\1\47";
	static final String DFA88_acceptS =
		"\33\uffff\1\1\1\2\3\uffff\1\3\1\4\2\uffff\1\5\1\6\1\uffff";
	static final String DFA88_specialS =
		"\47\uffff}>";
	static final String[] DFA88_transitionS = {
			"\1\1",
			"\1\2",
			"\1\4\13\uffff\1\5\121\uffff\1\3",
			"\1\6",
			"\1\7",
			"\1\10\44\uffff\1\11",
			"\1\12",
			"\1\13",
			"\1\14",
			"\1\15",
			"\1\16",
			"\1\21\40\uffff\1\20\16\uffff\1\17",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25\40\uffff\1\20\16\uffff\1\26",
			"\1\27",
			"\1\11",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33\40\uffff\1\34\2\uffff\1\11\21\uffff\1\34",
			"\1\21\40\uffff\1\20\16\uffff\1\26",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40\40\uffff\1\41\24\uffff\1\41",
			"",
			"",
			"\1\42",
			"\1\43",
			"\1\44\40\uffff\1\45\24\uffff\1\45",
			"",
			"",
			"\1\46",
			"\1\11",
			"",
			"",
			"\1\11"
	};

	static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
	static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
	static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
	static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
	static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
	static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
	static final short[][] DFA88_transition;

	static {
		int numStates = DFA88_transitionS.length;
		DFA88_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
		}
	}

	protected class DFA88 extends DFA {

		public DFA88(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 88;
			this.eot = DFA88_eot;
			this.eof = DFA88_eof;
			this.min = DFA88_min;
			this.max = DFA88_max;
			this.accept = DFA88_accept;
			this.special = DFA88_special;
			this.transition = DFA88_transition;
		}
		@Override
		public String getDescription() {
			return "1072:1: propertyReference : ( ^(oct= OCTOTHORPE pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.st)| ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.stf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.st)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName ) -> property_reference(component=$component.stpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ ) -> property_reference(component=$component.stpname=$pname.stf=$field));";
		}
	}

	public static final BitSet FOLLOW_ID_in_identifier66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_propertyName89 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyName93 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_propertyName97 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_componentName133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_componentName137 = new BitSet(new long[]{0x0008001000000000L});
	public static final BitSet FOLLOW_DOT_in_componentName141 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_componentName145 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOUBLE_COLON_in_componentName175 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_componentName179 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_ID_in_componentName206 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_componentName209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_componentName213 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_componentName244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_modeTrigger269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_modeTrigger273 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_UNIT_NAME_in_unitName315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitName319 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_ID_in_unitName323 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula367 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitFormula397 = new BitSet(new long[]{0x0008000400000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula400 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula404 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_UNIT_FORMULA_in_unitFormula435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFormula437 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_unitFormula441 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_rootDeclaration_in_unitDeclaration470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitExtension_in_unitDeclaration474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration491 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_base_in_rootDeclaration495 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration503 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration510 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration514 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_ROOT_DECLARATION_in_rootDeclaration555 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitFormula_in_rootDeclaration559 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_LBRACKET_in_rootDeclaration563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rootDeclaration567 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_unitName_in_rootDeclaration574 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_unitFactor_in_rootDeclaration578 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_LITERAL_extension_in_unitExtension626 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_unitExtension630 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_unitFactor_in_unitExtension634 = new BitSet(new long[]{0x0000000004000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_TIMES_in_unitFactor679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_unitFactor718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unitName_in_unitFactor722 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_DIVIDE_in_unitFactor726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_NUMBER_in_unitFactor730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeDeclaration_in_typeLibrary777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LITERAL_type_in_typeDeclaration805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_typeDeclaration809 = new BitSet(new long[]{0x0000000000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_type_in_typeDeclaration813 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_enumerationType_in_type852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantityType_in_type865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayType_in_type878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordType_in_type891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_boolean_in_type904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_string_in_type920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_type936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_typeOrReference963 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_typeOrReference983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DUMMY_in_typeOrReference1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType1030 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationType1034 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1069 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1073 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1098 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1102 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1160 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1167 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1171 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1211 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1218 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1262 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1265 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1269 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1273 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1313 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1320 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1324 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1332 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1373 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1377 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1384 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1437 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1441 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1448 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1508 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1544 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1594 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1598 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1630 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1634 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1641 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1645 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1653 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1699 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1702 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1706 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1714 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1718 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1764 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1771 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1775 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1829 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1836 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1840 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1844 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1848 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1856 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1903 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1907 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1914 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1918 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1922 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1926 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1981 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1985 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1988 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1992 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1996 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType2000 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType2004 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType2008 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType2012 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType2068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType2072 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType2074 = new BitSet(new long[]{0x0008040000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType2078 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList2125 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2129 = new BitSet(new long[]{0x000000C000000008L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange2178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2182 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2186 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_record_in_recordType2223 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2227 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_LITERAL_variant_in_recordType2254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2258 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_COLON_in_recordField2295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordField2299 = new BitSet(new long[]{0x0008040000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField2303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary2344 = new BitSet(new long[]{0x000000000000D000L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2348 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2375 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2379 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables2415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables2419 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable2452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ghostVariable2457 = new BitSet(new long[]{0x0008040000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable2461 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2498 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2506 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2512 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2542 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2546 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2566 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2601 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2609 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2625 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2668 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2694 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion2748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2752 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion2762 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_in_variableList2811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList2829 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList2833 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_TILDE_in_variable2867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable2871 = new BitSet(new long[]{0x0008040000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable2875 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue2928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2955 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction2959 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair2993 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair2997 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair3001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3040 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration3044 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3070 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3074 = new BitSet(new long[]{0x0010000000000008L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair3109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationPair3113 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair3117 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue3156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3160 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3164 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3230 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3234 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation3238 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3273 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_invocation3277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COLON_in_actualParameter3314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_actualParameter3318 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_actualParameter3322 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3365 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3390 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DUMMY_in_namelessAssertion3392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction3419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction3423 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction3429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration3471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion3500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion3516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion3532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion3548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression3580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression3596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression3612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression3628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression3644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression3662 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3666 = new BitSet(new long[]{0x5249500400820310L,0x023A040010500000L,0x60A4538003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_disjunction_in_expression3670 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression3705 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3709 = new BitSet(new long[]{0x5249500400820310L,0x023A040010500000L,0x60A4538003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_disjunction_in_expression3713 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_disjunction_in_expression3746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification3773 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification3777 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_universalQuantification3781 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification3785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification3789 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_in_which3838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_range_in_in_which3842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_which_in_in_which3869 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_in_which3873 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification3909 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification3913 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_existentialQuantification3917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification3921 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification3925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification3976 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification3980 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_sumQuantification3984 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification3988 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sumQuantification3992 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification4044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification4048 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_productQuantification4052 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification4056 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_productQuantification4060 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification4111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification4115 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_countingQuantification4119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification4123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_countingQuantification4127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables4174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_logicVariables4178 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_variable_in_logicVariables4204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction4233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4237 = new BitSet(new long[]{0x5249500400820318L,0x003A040010100000L,0x60A4530003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction4263 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4267 = new BitSet(new long[]{0x5249500400820318L,0x003A040010100000L,0x60A4530003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction4293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4297 = new BitSet(new long[]{0x5249500400820318L,0x003A040010100000L,0x60A4530003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction4351 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4355 = new BitSet(new long[]{0x1249500400820318L,0x003A040010100000L,0x60A4530003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction4381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4385 = new BitSet(new long[]{0x1249500400820318L,0x003A040010100000L,0x60A4530003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_relation_in_conjunction4411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_relation4440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4445 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4449 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_relation4486 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4491 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4495 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AM_in_relation4533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4538 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4542 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AL_in_relation4580 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4585 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4589 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_relation4627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4632 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4636 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_EQUALS_in_relation4674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4679 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_relation4721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4726 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4730 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_NEQ_in_relation4767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4772 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation4811 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4815 = new BitSet(new long[]{0x0000006018000000L});
	public static final BitSet FOLLOW_range_in_relation4819 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_addSub_in_relation4853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_range4880 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4884 = new BitSet(new long[]{0x1248000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range4888 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMADOT_in_range4926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4930 = new BitSet(new long[]{0x1248000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range4934 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTCOMMA_in_range4972 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4976 = new BitSet(new long[]{0x1248000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range4980 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMACOMMA_in_range5018 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range5022 = new BitSet(new long[]{0x1248000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range5026 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_addSub5069 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub5073 = new BitSet(new long[]{0x1248400400820018L,0x003A000010100000L,0x6000010003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_MINUS_in_addSub5099 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub5103 = new BitSet(new long[]{0x1248400400820010L,0x003A000010100000L,0x6000010003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_multDiv_in_addSub5107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multDiv_in_addSub5139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5174 = new BitSet(new long[]{0x1248400000820018L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_DIVIDE_in_multDiv5200 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5204 = new BitSet(new long[]{0x1248400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_multDiv5240 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5244 = new BitSet(new long[]{0x1248400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5248 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_multDiv5280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5284 = new BitSet(new long[]{0x1248400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_multDiv5320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5324 = new BitSet(new long[]{0x1248400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5396 = new BitSet(new long[]{0x1248000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5400 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5467 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_subexpression5499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5539 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5571 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5575 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5611 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5671 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5700 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5704 = new BitSet(new long[]{0x1248000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5708 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5742 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5746 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5898 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_periodShift5902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5934 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5944 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_periodShift5976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift6000 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6036 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6040 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6044 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6082 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6086 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6124 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6128 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6162 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6166 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6170 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6206 = new BitSet(new long[]{0x0208000000000018L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6236 = new BitSet(new long[]{0x0208000000000018L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression6290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQ_in_conditionalExpression6294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6298 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6302 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression6311 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6396 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6398 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6436 = new BitSet(new long[]{0x0010000000000008L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_caseChoice6473 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_caseChoice6477 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RECORD_TERM_in_recordTerm6518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordTerm6522 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6526 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordValue6569 = new BitSet(new long[]{0x0208000000000010L,0x0030000010000000L,0x6000000001500000L,0x0000000000001000L});
	public static final BitSet FOLLOW_value_in_recordValue6573 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_predicate6612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationValue_in_value6659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6758 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6760 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6796 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6798 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6829 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6833 = new BitSet(new long[]{0x0208004000000018L,0x0032000010100000L,0x6020110001500001L,0x0000000000025000L});
	public static final BitSet FOLLOW_DOT_in_valueName6840 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6844 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6885 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_valueName6889 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6893 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6929 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6933 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6960 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6964 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6966 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6991 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6997 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName7022 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName7026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName7028 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName7053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters7078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters7082 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters7107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair7132 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair7136 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair7140 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange7183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange7187 = new BitSet(new long[]{0x0208000000000010L,0x0032000010100000L,0x6020110001500001L,0x0000000000025000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange7191 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange7226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName7253 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName7257 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName7261 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_partialName7293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_constant7320 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant7338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant7356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant7374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant7392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonNumericProperty_in_constant7412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACKET_in_nonNumericProperty7436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyValue_in_nonNumericProperty7441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_RCON_in_nonNumericProperty7443 = new BitSet(new long[]{0x0000000000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_type_in_nonNumericProperty7447 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7488 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7517 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity7521 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7552 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyValue_in_aNumber7652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_propertyValue7673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyName_in_propertyValue7687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7719 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7764 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7768 = new BitSet(new long[]{0x0200001000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7814 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7864 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7868 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7872 = new BitSet(new long[]{0x0200001000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_componentName_in_propertyReference7922 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7926 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_componentName_in_propertyReference7965 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7969 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7973 = new BitSet(new long[]{0x0200001000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField8015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField8019 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField8044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField8048 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField8073 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField8077 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField8104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField8106 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField8130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField8132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause8167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause8172 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000004L,0x0000000000080000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause8179 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000004L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause8186 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause8197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause8202 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause8214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause8219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause8232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause8237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause8250 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause8323 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_throwsClause8327 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause8360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause8364 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification8397 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification8403 = new BitSet(new long[]{0x0000000000000440L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification8410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification8412 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification8418 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables8463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables8467 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration8499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration8503 = new BitSet(new long[]{0x000000000001D008L,0x0004000400004000L,0x0000000000000280L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration8509 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration8513 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration8522 = new BitSet(new long[]{0x0000000000000008L,0x0004000400004000L,0x0000000000000280L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration8532 = new BitSet(new long[]{0x0000000000000008L,0x0000000400004000L,0x0000000000000280L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration8537 = new BitSet(new long[]{0x0000000000000008L,0x0000000400004000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration8542 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration8547 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration8552 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause8612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause8616 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8648 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm8652 = new BitSet(new long[]{0x0008000001000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8658 = new BitSet(new long[]{0x0000000000010000L,0x00000001E1000000L,0x0300000400008140L,0x0000000000000800L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8664 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm8696 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8700 = new BitSet(new long[]{0x0000000000010000L,0x00000001E1000000L,0x0300000400008140L,0x0000000000000800L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions8738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8742 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions8768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8772 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_assertedAction8823 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_assertedAction8827 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_S_in_assertedAction8838 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_action_in_assertedAction8842 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_assertedAction8848 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8852 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_basicAction_in_action8894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8926 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction9020 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction9036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction9052 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction9056 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction9082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction9098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction9114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction9131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction9147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9173 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_issueException9177 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9181 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment9221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_assignment9225 = new BitSet(new long[]{0xF249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment9229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_nameTick9268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_nameTick9272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_valueName_in_nameTick9297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny9324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny9344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment9370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment9374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment9378 = new BitSet(new long[]{0x0008000000000008L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment9385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment9389 = new BitSet(new long[]{0xF249500400820318L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow9429 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow9431 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_whenThrow9435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow9437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow9439 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow9443 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow9455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation9501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9505 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9509 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9513 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation9555 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9559 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9563 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation9609 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9613 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9617 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9621 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation9663 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9667 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9671 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation9717 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9721 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9725 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction9775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction9793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction9811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation9837 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTime_in_computation9841 = new BitSet(new long[]{0x0000000000040008L,0x0000000000000020L});
	public static final BitSet FOLLOW_behaviorTime_in_computation9845 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation9852 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_componentName_in_computation9856 = new BitSet(new long[]{0x0008008000000008L});
	public static final BitSet FOLLOW_PORT_OUTPUT_in_portOutput9907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portOutput9911 = new BitSet(new long[]{0x7249500400820318L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_portOutput9915 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PORT_INPUT_in_portInput9957 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portInput9961 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_valueName_in_portInput9965 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUBPROGRAM_INVOCATION_in_subprogramCall10009 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_subprogramCall10013 = new BitSet(new long[]{0x0208000005000018L,0x0020000010000000L,0x6000010001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall10017 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList10062 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList10066 = new BitSet(new long[]{0x0208000001000018L,0x0020000010000000L,0x6000010001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList10092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalActual10121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalActual10125 = new BitSet(new long[]{0x0208000000000010L,0x0020000010000000L,0x6000010001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual10129 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual10159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter10181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter10196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter10211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative10239 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_guardedAction_in_alternative10243 = new BitSet(new long[]{0x0002000000000008L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction10280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_guardedAction10284 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction10288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop10327 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop10331 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_INVARIANT_in_whileLoop10335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop10339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_whileLoop10346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop10350 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop10364 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop10413 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_forLoop10417 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop10421 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forLoop10425 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_forLoop10429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_forLoop10435 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_forLoop10439 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop10453 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop10508 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop10512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop10516 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_doUntilLoop10522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop10526 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_doUntilLoop10533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop10537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop10550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification10603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification10607 = new BitSet(new long[]{0x0008000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification10612 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification10616 = new BitSet(new long[]{0x7249500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification10620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification10626 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause10676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause10684 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000004L,0x0000000100800800L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause10693 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0000000100800800L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause10704 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000100800800L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause10713 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000800800L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause10722 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause10731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause10793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_invariantClause10797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection10829 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection10833 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection10864 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection10868 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState10900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState10904 = new BitSet(new long[]{0x0008000000000000L,0x0000000400001000L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState10909 = new BitSet(new long[]{0x0008000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState10914 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_behaviorState10919 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_assertion_in_behaviorState10923 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions10978 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions10982 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_TRANSITION_in_behaviorTransition11015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_behaviorTransition11024 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition11028 = new BitSet(new long[]{0x0200000000000008L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition11032 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SOURCE_in_behaviorTransition11044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition11048 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_CONDITION_in_behaviorTransition11060 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition11064 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESTINATION_in_behaviorTransition11076 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition11080 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_behaviorTransition11090 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition11094 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_behaviorTransition11106 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition11110 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_priority11182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_priority11186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_priority11188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition11219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition11236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition11254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition11272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition11300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition11304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_executeCondition11341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition11370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition11374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition11408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_internalCondition11412 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression11448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression11452 = new BitSet(new long[]{0x4008000000000008L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression11478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction11509 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction11513 = new BitSet(new long[]{0x0008000000000008L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction11539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger11565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger11583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger11589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger11593 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger11603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BEHAVIOR_TIME_in_behaviorTime11637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime11641 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BEHAVIOR_TIME_in_behaviorTime11660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime11665 = new BitSet(new long[]{0x0008000000000008L,0x0000000000000000L,0x0000002000000010L});
	public static final BitSet FOLLOW_ID_in_behaviorTime11671 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_behaviorTime11677 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_whole_in_behaviorTime11683 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_portName11740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_portName11744 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_and_in_triggerLogicalExpression11781 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11785 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_triggerLogicalExpression11812 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11816 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_triggerLogicalExpression11843 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11847 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_then_in_triggerLogicalExpression11874 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11878 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_triggerLogicalExpression11905 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11909 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeTrigger_in_eventTrigger11960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger11979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger11983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger11985 = new BitSet(new long[]{0x0000000000000008L});
}
