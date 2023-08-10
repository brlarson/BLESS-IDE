// $ANTLR 3.5.2 /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g 2023-08-10 10:32:59

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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:336:1: typeOrReference : (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}});
	public final UnparseBLESS3.typeOrReference_return typeOrReference() throws RecognitionException {
		UnparseBLESS3.typeOrReference_return retval = new UnparseBLESS3.typeOrReference_return();
		retval.start = input.LT(1);

		BAST ref=null;
		TreeRuleReturnScope ty =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:336:16: (ty= type -> {$ty.st}|ref= ID -> {%{$ref.text}})
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==LITERAL_array||LA21_0==LITERAL_boolean||LA21_0==LITERAL_enumeration||LA21_0==LITERAL_null||LA21_0==LITERAL_quantity||LA21_0==LITERAL_record||LA21_0==LITERAL_string||LA21_0==LITERAL_variant) ) {
				alt21=1;
			}
			else if ( (LA21_0==ID) ) {
				alt21=2;
			}

			else {
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:344:1: enumerationType : ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id);
	public final UnparseBLESS3.enumerationType_return enumerationType() throws RecognitionException {
		UnparseBLESS3.enumerationType_return retval = new UnparseBLESS3.enumerationType_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_id=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:345:3: ( ^( LITERAL_enumeration (id+= ID )+ ) -> enumeration_type(id=$id))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:346:3: ^( LITERAL_enumeration (id+= ID )+ )
			{
			match(input,LITERAL_enumeration,FOLLOW_LITERAL_enumeration_in_enumerationType1010); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:346:27: (id+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:346:27: id+= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationType1014); 
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
			// 347:5: -> enumeration_type(id=$id)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:350:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:351:3: ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st))
			int alt23=18;
			alt23 = dfa23.predict(input);
			switch (alt23) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:352:3: ^( LITERAL_quantity unit= ID )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1049); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1053); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 353:5: -> quantity_type(unit=$unit.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:355:3: ^( LITERAL_quantity scalar= LITERAL_scalar )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1078); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1082); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 356:5: -> quantity_type(scalar=$scalar.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:358:3: ^( LITERAL_quantity whole= LITERAL_whole )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1107); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1111); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 359:5: -> quantity_type(whole=$whole.text)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:361:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1136); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1140); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1143); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1147);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1151);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 362:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:364:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1187); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1191); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1194); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1198);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1202);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 365:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:367:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1238); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1242); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1245); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1249);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1253);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 368:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:370:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1289); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1293); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1296); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1300);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1304);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1308); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1312);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 371:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:373:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1353); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1357); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1360); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1364);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1368);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1372); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1376);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 374:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:376:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1417); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1421); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1424); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1428);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1432);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1436); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1440);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 377:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:379:3: ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1481); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1485); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1488); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1492);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 380:5: -> quantity_type(unit=$unit.textrepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 11 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:382:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1524); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1528); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1531); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1535);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 383:5: -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 12 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:385:3: ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1567); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1571); 
					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1574); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1578);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 386:5: -> quantity_type(whole=$whole.textrepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 13 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:388:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1610); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1614); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1617); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1621);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1625);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1629); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1633);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 389:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 14 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:391:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1675); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1679); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1682); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1686);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1690);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1694); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1698);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 392:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 15 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:394:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1740); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1744); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1747); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1751);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1755);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1759); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1763);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 395:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("whole", (whole!=null?whole.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 16 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:397:3: ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1805); 
					match(input, Token.DOWN, null); 
					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantityType1809); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1812); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1816);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1820);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1824); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1828);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1832); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1836);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 398:5: -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("unit", (unit!=null?unit.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 17 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:400:3: ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1883); 
					match(input, Token.DOWN, null); 
					scalar=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantityType1887); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1890); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1894);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1898);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1902); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1906);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1910); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1914);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 401:5: -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)
					{
						retval.st = templateLib.getInstanceOf("quantity_type",new STAttrMap().put("scalar", (scalar!=null?scalar.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)).put("step", (step!=null?((StringTemplate)step.getTemplate()):null)).put("representation", (representation!=null?((StringTemplate)representation.getTemplate()):null)));
					}



					}
					break;
				case 18 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:403:3: ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) )
					{
					match(input,LITERAL_quantity,FOLLOW_LITERAL_quantity_in_quantityType1961); 
					match(input, Token.DOWN, null); 
					whole=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantityType1965); 
					match(input,DOTDOT,FOLLOW_DOTDOT_in_quantityType1968); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1972);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_quantityType1976);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_step,FOLLOW_LITERAL_step_in_quantityType1980); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantityType1984);
					step=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_representation,FOLLOW_LITERAL_representation_in_quantityType1988); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_quantityType1992);
					representation=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 404:5: -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:408:1: arrayType : ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st);
	public final UnparseBLESS3.arrayType_return arrayType() throws RecognitionException {
		UnparseBLESS3.arrayType_return retval = new UnparseBLESS3.arrayType_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope arl =null;
		TreeRuleReturnScope t =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:409:2: ( ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference ) -> array_type(arl=$arl.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:410:2: ^( LITERAL_array arl= arrayRangeList LITERAL_of t= typeOrReference )
			{
			match(input,LITERAL_array,FOLLOW_LITERAL_array_in_arrayType2048); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_arrayRangeList_in_arrayType2052);
			arl=arrayRangeList();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_arrayType2054); 
			pushFollow(FOLLOW_typeOrReference_in_arrayType2058);
			t=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 411:3: -> array_type(arl=$arl.stt=$t.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:415:1: arrayRangeList : (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges));
	public final UnparseBLESS3.arrayRangeList_return arrayRangeList() throws RecognitionException {
		UnparseBLESS3.arrayRangeList_return retval = new UnparseBLESS3.arrayRangeList_return();
		retval.start = input.LT(1);

		List<Object> list_ranges=null;
		TreeRuleReturnScope nr =null;
		RuleReturnScope ranges = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:416:2: (nr= arrayRange -> {$nr.st}| ^( COMMA (ranges+= arrayRange )+ ) -> array_range_list(r=$ranges))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:417:2: nr= arrayRange
					{
					pushFollow(FOLLOW_arrayRange_in_arrayRangeList2091);
					nr=arrayRange();
					state._fsp--;

					// TEMPLATE REWRITE
					// 418:4: -> {$nr.st}
					{
						retval.st = (nr!=null?((StringTemplate)nr.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:420:2: ^( COMMA (ranges+= arrayRange )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_arrayRangeList2105); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:420:16: (ranges+= arrayRange )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:420:16: ranges+= arrayRange
							{
							pushFollow(FOLLOW_arrayRange_in_arrayRangeList2109);
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
					// 421:4: -> array_range_list(r=$ranges)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:424:1: arrayRange : (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st));
	public final UnparseBLESS3.arrayRange_return arrayRange() throws RecognitionException {
		UnparseBLESS3.arrayRange_return retval = new UnparseBLESS3.arrayRange_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:425:3: (n= aNumber -> {$n.st}| ^( DOTDOT lb= aNumber ub= aNumber ) -> array_range(l=$lb.str=$ub.st))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:426:3: n= aNumber
					{
					pushFollow(FOLLOW_aNumber_in_arrayRange2140);
					n=aNumber();
					state._fsp--;

					// TEMPLATE REWRITE
					// 427:5: -> {$n.st}
					{
						retval.st = (n!=null?((StringTemplate)n.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:429:3: ^( DOTDOT lb= aNumber ub= aNumber )
					{
					match(input,DOTDOT,FOLLOW_DOTDOT_in_arrayRange2158); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_arrayRange2162);
					lb=aNumber();
					state._fsp--;

					pushFollow(FOLLOW_aNumber_in_arrayRange2166);
					ub=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 430:5: -> array_range(l=$lb.str=$ub.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:433:1: recordType : ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf));
	public final UnparseBLESS3.recordType_return recordType() throws RecognitionException {
		UnparseBLESS3.recordType_return retval = new UnparseBLESS3.recordType_return();
		retval.start = input.LT(1);

		BAST r=null;
		List<Object> list_rf=null;
		RuleReturnScope rf = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:434:2: ( ^(r= LITERAL_record (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf)| ^(r= LITERAL_variant (rf+= recordField )+ ) -> record_type(rvu=$r.textrf=$rf))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:435:2: ^(r= LITERAL_record (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_record,FOLLOW_LITERAL_record_in_recordType2203); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:435:23: (rf+= recordField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:435:23: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2207);
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
					// 436:3: -> record_type(rvu=$r.textrf=$rf)
					{
						retval.st = templateLib.getInstanceOf("record_type",new STAttrMap().put("rvu", (r!=null?r.getText():null)).put("rf", list_rf));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:2: ^(r= LITERAL_variant (rf+= recordField )+ )
					{
					r=(BAST)match(input,LITERAL_variant,FOLLOW_LITERAL_variant_in_recordType2234); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:24: (rf+= recordField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:438:24: rf+= recordField
							{
							pushFollow(FOLLOW_recordField_in_recordType2238);
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
					// 439:3: -> record_type(rvu=$r.textrf=$rf)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:446:1: recordField : ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st);
	public final UnparseBLESS3.recordField_return recordField() throws RecognitionException {
		UnparseBLESS3.recordField_return retval = new UnparseBLESS3.recordField_return();
		retval.start = input.LT(1);

		BAST df=null;
		TreeRuleReturnScope ptd =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:447:2: ( ^( COLON df= ID ptd= typeOrReference ) -> record_field(df=$df.textptd=$ptd.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:448:2: ^( COLON df= ID ptd= typeOrReference )
			{
			match(input,COLON,FOLLOW_COLON_in_recordField2275); 
			match(input, Token.DOWN, null); 
			df=(BAST)match(input,ID,FOLLOW_ID_in_recordField2279); 
			pushFollow(FOLLOW_typeOrReference_in_recordField2283);
			ptd=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 449:3: -> record_field(df=$df.textptd=$ptd.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:457:1: assertionLibrary : ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass));
	public final UnparseBLESS3.assertionLibrary_return assertionLibrary() throws RecognitionException {
		UnparseBLESS3.assertionLibrary_return retval = new UnparseBLESS3.assertionLibrary_return();
		retval.start = input.LT(1);

		List<Object> list_ass=null;
		TreeRuleReturnScope ghosts =null;
		RuleReturnScope ass = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:458:2: ( ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ ) -> annex_library_assertion(ghosts=$ghosts.stass=$ass)| ^( ASSERTION_ANNEX (ass+= namedAssertion )+ ) -> annex_library_assertion(ass=$ass))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:459:3: ^( ASSERTION_ANNEX ghosts= ghostVariables (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2320); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_ghostVariables_in_assertionLibrary2324);
					ghosts=ghostVariables();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:459:46: (ass+= namedAssertion )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:459:46: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2328);
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
					// 460:4: -> annex_library_assertion(ghosts=$ghosts.stass=$ass)
					{
						retval.st = templateLib.getInstanceOf("annex_library_assertion",new STAttrMap().put("ghosts", (ghosts!=null?((StringTemplate)ghosts.getTemplate()):null)).put("ass", list_ass));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:462:3: ^( ASSERTION_ANNEX (ass+= namedAssertion )+ )
					{
					match(input,ASSERTION_ANNEX,FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2355); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:462:24: (ass+= namedAssertion )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:462:24: ass+= namedAssertion
							{
							pushFollow(FOLLOW_namedAssertion_in_assertionLibrary2359);
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
					// 463:4: -> annex_library_assertion(ass=$ass)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:467:1: ghostVariables : ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv);
	public final UnparseBLESS3.ghostVariables_return ghostVariables() throws RecognitionException {
		UnparseBLESS3.ghostVariables_return retval = new UnparseBLESS3.ghostVariables_return();
		retval.start = input.LT(1);

		List<Object> list_gv=null;
		RuleReturnScope gv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:468:3: ( ^( LITERAL_ghost (gv+= ghostVariable )+ ) -> ghost_variables(gv=$gv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:469:3: ^( LITERAL_ghost (gv+= ghostVariable )+ )
			{
			match(input,LITERAL_ghost,FOLLOW_LITERAL_ghost_in_ghostVariables2395); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:469:22: (gv+= ghostVariable )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:469:22: gv+= ghostVariable
					{
					pushFollow(FOLLOW_ghostVariable_in_ghostVariables2399);
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
			// 470:5: -> ghost_variables(gv=$gv)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:473:1: ghostVariable : ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.ghostVariable_return ghostVariable() throws RecognitionException {
		UnparseBLESS3.ghostVariable_return retval = new UnparseBLESS3.ghostVariable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:474:3: ( ^( LITERAL_def id= ID tod= typeOrReference ) -> ghost_variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:475:3: ^( LITERAL_def id= ID tod= typeOrReference )
			{
			match(input,LITERAL_def,FOLLOW_LITERAL_def_in_ghostVariable2432); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_ghostVariable2437); 
			pushFollow(FOLLOW_typeOrReference_in_ghostVariable2441);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 476:5: -> ghost_variable(id=$id.texttod=$tod.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:479:1: namedAssertion : ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textassertionvariable=$assertionvariable.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:480:3: ( ^( ASSERTION ^( LABEL id= ID ) pred= predicate ) -> named_assertion(id=$id.textpred=$pred.st)| ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate ) -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)| ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration ) -> named_assertion_enum(id=$id.textassertionvariable=$assertionvariable.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st))
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
									else if ( (LA34_12==AADL_STRING_LITERAL||(LA34_12 >= AL && LA34_12 <= AM)||LA34_12==AT_SIGN||LA34_12==CARET||LA34_12==DIVIDE||LA34_12==EQ||LA34_12==EXP||LA34_12==GT||LA34_12==ID||LA34_12==INVOKE||(LA34_12 >= LITERAL_abs && LA34_12 <= LITERAL_and)||LA34_12==LITERAL_div||LA34_12==LITERAL_else||LA34_12==LITERAL_exists||LA34_12==LITERAL_false||(LA34_12 >= LITERAL_iff && LA34_12 <= LITERAL_in)||LA34_12==LITERAL_mod||(LA34_12 >= LITERAL_not && LA34_12 <= LITERAL_numberof)||LA34_12==LITERAL_or||LA34_12==LITERAL_product||LA34_12==LITERAL_rem||LA34_12==LITERAL_round||LA34_12==LITERAL_sum||LA34_12==LITERAL_then||LA34_12==LITERAL_timeout||LA34_12==LITERAL_tops||(LA34_12 >= LITERAL_true && LA34_12 <= LITERAL_truncate)||(LA34_12 >= LITERAL_xor && LA34_12 <= LT)||LA34_12==MINUS||LA34_12==NEQ||LA34_12==OLD_NEQ||LA34_12==PLUS||LA34_12==PLUS_EQUALS||(LA34_12 >= QUANTITY && LA34_12 <= QUESTION)||LA34_12==RECORD_TERM||LA34_12==TICK||LA34_12==TIMES||LA34_12==UNARY_MINUS) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:481:3: ^( ASSERTION ^( LABEL id= ID ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2478); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2482); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2486); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2492);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 482:5: -> named_assertion(id=$id.textpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:484:3: ^( ASSERTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namedAssertion2522); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2526); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2530); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2536); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2540);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_predicate_in_namedAssertion2546);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 485:5: -> named_assertion(id=$id.textformals=$formals.stpred=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("pred", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:487:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2581); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2585); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2589); 
					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2595); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2599);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2605);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 488:5: -> named_assertion(id=$id.texttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:490:3: ^( ASSERTION_FUNCTION ^( LABEL id= ID ) ^( PARAMETERS formals= variableList ) ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
					{
					match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2640); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2644); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2648); 
					match(input, Token.UP, null); 

					match(input,PARAMETERS,FOLLOW_PARAMETERS_in_namedAssertion2654); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_variableList_in_namedAssertion2658);
					formals=variableList();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namedAssertion2664); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_typeOrReference_in_namedAssertion2668);
					tod=typeOrReference();
					state._fsp--;

					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionFunctionValue_in_namedAssertion2674);
					functionvalue=assertionFunctionValue();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 491:5: -> named_assertion(id=$id.textformals=$formals.sttod=$tod.stfunctionvalue=$functionvalue.st)
					{
						retval.st = templateLib.getInstanceOf("named_assertion",new STAttrMap().put("id", (id!=null?id.getText():null)).put("formals", (formals!=null?((StringTemplate)formals.getTemplate()):null)).put("tod", (tod!=null?((StringTemplate)tod.getTemplate()):null)).put("functionvalue", (functionvalue!=null?((StringTemplate)functionvalue.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:493:3: ^( ASSERTION_ENUMERATION ^( LABEL id= ID ) ^( TILDE assertionvariable= ID enumerationTy= ID ) enumeration= assertionEnumeration )
					{
					match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2714); 
					match(input, Token.DOWN, null); 
					match(input,LABEL,FOLLOW_LABEL_in_namedAssertion2718); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2722); 
					match(input, Token.UP, null); 

					match(input,TILDE,FOLLOW_TILDE_in_namedAssertion2728); 
					match(input, Token.DOWN, null); 
					assertionvariable=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2732); 
					enumerationTy=(BAST)match(input,ID,FOLLOW_ID_in_namedAssertion2736); 
					match(input, Token.UP, null); 

					pushFollow(FOLLOW_assertionEnumeration_in_namedAssertion2742);
					enumeration=assertionEnumeration();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 494:5: -> named_assertion_enum(id=$id.textassertionvariable=$assertionvariable.textenumerationTy=$enumerationTy.textenumeration=$enumeration.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:497:1: variableList : (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter));
	public final UnparseBLESS3.variableList_return variableList() throws RecognitionException {
		UnparseBLESS3.variableList_return retval = new UnparseBLESS3.variableList_return();
		retval.start = input.LT(1);

		List<Object> list_parameter=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope parameter = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:498:3: (v= variable -> {$v.st}| ^( COMMA (parameter+= variable )+ ) -> variable_list(parameter=$parameter))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:499:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_variableList2791);
					v=variable();
					state._fsp--;

					// TEMPLATE REWRITE
					// 500:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:502:3: ^( COMMA (parameter+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_variableList2809); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:502:21: (parameter+= variable )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:502:21: parameter+= variable
							{
							pushFollow(FOLLOW_variable_in_variableList2813);
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
					// 503:5: -> variable_list(parameter=$parameter)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:506:1: variable : ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st);
	public final UnparseBLESS3.variable_return variable() throws RecognitionException {
		UnparseBLESS3.variable_return retval = new UnparseBLESS3.variable_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope tod =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:507:3: ( ^( TILDE id= ID tod= typeOrReference ) -> variable(id=$id.texttod=$tod.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:508:3: ^( TILDE id= ID tod= typeOrReference )
			{
			match(input,TILDE,FOLLOW_TILDE_in_variable2847); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_variable2851); 
			pushFollow(FOLLOW_typeOrReference_in_variable2855);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 509:5: -> variable(id=$id.texttod=$tod.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:512:1: assertionFunctionValue : (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st});
	public final UnparseBLESS3.assertionFunctionValue_return assertionFunctionValue() throws RecognitionException {
		UnparseBLESS3.assertionFunctionValue_return retval = new UnparseBLESS3.assertionFunctionValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope caf =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:513:3: (caf= conditionalAssertionFunction -> {$caf.st}|exp= expression -> {$exp.st})
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==CONDITIONAL_ASSERTION_FUNCTION) ) {
				alt37=1;
			}
			else if ( (LA37_0==AADL_STRING_LITERAL||(LA37_0 >= AL && LA37_0 <= AM)||LA37_0==AT_SIGN||LA37_0==CARET||LA37_0==DIVIDE||LA37_0==EQ||LA37_0==EXP||LA37_0==GT||LA37_0==ID||LA37_0==INVOKE||(LA37_0 >= LITERAL_abs && LA37_0 <= LITERAL_and)||LA37_0==LITERAL_div||LA37_0==LITERAL_else||LA37_0==LITERAL_exists||LA37_0==LITERAL_false||(LA37_0 >= LITERAL_iff && LA37_0 <= LITERAL_in)||LA37_0==LITERAL_mod||(LA37_0 >= LITERAL_not && LA37_0 <= LITERAL_numberof)||LA37_0==LITERAL_or||LA37_0==LITERAL_product||LA37_0==LITERAL_rem||LA37_0==LITERAL_round||LA37_0==LITERAL_sum||LA37_0==LITERAL_then||LA37_0==LITERAL_timeout||LA37_0==LITERAL_tops||(LA37_0 >= LITERAL_true && LA37_0 <= LITERAL_truncate)||(LA37_0 >= LITERAL_xor && LA37_0 <= LT)||LA37_0==MINUS||LA37_0==NEQ||LA37_0==OLD_NEQ||LA37_0==PLUS||LA37_0==PLUS_EQUALS||(LA37_0 >= QUANTITY && LA37_0 <= QUESTION)||LA37_0==RECORD_TERM||LA37_0==TICK||LA37_0==TIMES||LA37_0==UNARY_MINUS) ) {
				alt37=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:514:3: caf= conditionalAssertionFunction
					{
					pushFollow(FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2892);
					caf=conditionalAssertionFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 515:5: -> {$caf.st}
					{
						retval.st = (caf!=null?((StringTemplate)caf.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:516:4: exp= expression
					{
					pushFollow(FOLLOW_expression_in_assertionFunctionValue2908);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 517:5: -> {$exp.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:520:1: conditionalAssertionFunction : ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp);
	public final UnparseBLESS3.conditionalAssertionFunction_return conditionalAssertionFunction() throws RecognitionException {
		UnparseBLESS3.conditionalAssertionFunction_return retval = new UnparseBLESS3.conditionalAssertionFunction_return();
		retval.start = input.LT(1);

		List<Object> list_cvp=null;
		RuleReturnScope cvp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:521:3: ( ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ ) -> conditional_assertion_function(cvp=$cvp))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:522:3: ^( CONDITIONAL_ASSERTION_FUNCTION (cvp+= conditionValuePair )+ )
			{
			match(input,CONDITIONAL_ASSERTION_FUNCTION,FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2935); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:522:40: (cvp+= conditionValuePair )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:522:40: cvp+= conditionValuePair
					{
					pushFollow(FOLLOW_conditionValuePair_in_conditionalAssertionFunction2939);
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
			// 523:5: -> conditional_assertion_function(cvp=$cvp)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:526:1: conditionValuePair : ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st);
	public final UnparseBLESS3.conditionValuePair_return conditionValuePair() throws RecognitionException {
		UnparseBLESS3.conditionValuePair_return retval = new UnparseBLESS3.conditionValuePair_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:527:3: ( ^( CVP pred= predicate exp= expression ) -> condition_value_pair(pp=$pred.stpe=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:528:3: ^( CVP pred= predicate exp= expression )
			{
			match(input,CVP,FOLLOW_CVP_in_conditionValuePair2973); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_conditionValuePair2977);
			pred=predicate();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionValuePair2981);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 529:5: -> condition_value_pair(pp=$pred.stpe=$exp.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:532:1: assertionEnumeration : ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW (pair+= enumerationPair )+ ) -> assertion_enumeration_pairs(ep=$pair));
	public final UnparseBLESS3.assertionEnumeration_return assertionEnumeration() throws RecognitionException {
		UnparseBLESS3.assertionEnumeration_return retval = new UnparseBLESS3.assertionEnumeration_return();
		retval.start = input.LT(1);

		List<Object> list_pair=null;
		TreeRuleReturnScope inv =null;
		RuleReturnScope pair = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:533:3: ( ^( PLUS_ARROW inv= invocation ) -> assertion_enumeration_predicate_invocation(pi=$inv.st)| ^( PLUS_ARROW (pair+= enumerationPair )+ ) -> assertion_enumeration_pairs(ep=$pair))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:534:3: ^( PLUS_ARROW inv= invocation )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3020); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_invocation_in_assertionEnumeration3024);
					inv=invocation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 535:5: -> assertion_enumeration_predicate_invocation(pi=$inv.st)
					{
						retval.st = templateLib.getInstanceOf("assertion_enumeration_predicate_invocation",new STAttrMap().put("pi", (inv!=null?((StringTemplate)inv.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:537:3: ^( PLUS_ARROW (pair+= enumerationPair )+ )
					{
					match(input,PLUS_ARROW,FOLLOW_PLUS_ARROW_in_assertionEnumeration3050); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:537:21: (pair+= enumerationPair )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:537:21: pair+= enumerationPair
							{
							pushFollow(FOLLOW_enumerationPair_in_assertionEnumeration3054);
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
					// 538:5: -> assertion_enumeration_pairs(ep=$pair)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:541:1: enumerationPair : ^( IMP id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st);
	public final UnparseBLESS3.enumerationPair_return enumerationPair() throws RecognitionException {
		UnparseBLESS3.enumerationPair_return retval = new UnparseBLESS3.enumerationPair_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:542:3: ( ^( IMP id= ID pred= predicate ) -> enumeration_pair(i=$id.textpe=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:543:3: ^( IMP id= ID pred= predicate )
			{
			match(input,IMP,FOLLOW_IMP_in_enumerationPair3089); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_enumerationPair3093); 
			pushFollow(FOLLOW_predicate_in_enumerationPair3097);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 544:5: -> enumeration_pair(i=$id.textpe=$pred.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:547:1: enumerationValue : ^( TICK enumeration_type= ID enumeration_value= ID ) -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text);
	public final UnparseBLESS3.enumerationValue_return enumerationValue() throws RecognitionException {
		UnparseBLESS3.enumerationValue_return retval = new UnparseBLESS3.enumerationValue_return();
		retval.start = input.LT(1);

		BAST enumeration_type=null;
		BAST enumeration_value=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:548:3: ( ^( TICK enumeration_type= ID enumeration_value= ID ) -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:549:3: ^( TICK enumeration_type= ID enumeration_value= ID )
			{
			match(input,TICK,FOLLOW_TICK_in_enumerationValue3136); 
			match(input, Token.DOWN, null); 
			enumeration_type=(BAST)match(input,ID,FOLLOW_ID_in_enumerationValue3140); 
			enumeration_value=(BAST)match(input,ID,FOLLOW_ID_in_enumerationValue3144); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 550:5: -> enumeration_value(t=$enumeration_type.textv=$enumeration_value.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:553:1: invocation : ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st));
	public final UnparseBLESS3.invocation_return invocation() throws RecognitionException {
		UnparseBLESS3.invocation_return retval = new UnparseBLESS3.invocation_return();
		retval.start = input.LT(1);

		BAST id=null;
		List<Object> list_params=null;
		TreeRuleReturnScope exp =null;
		RuleReturnScope params = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:554:3: ( ^( INVOKE id= ID ) -> invocation(i=$id.text)| ^( INVOKE id= ID (params+= actualParameter )+ ) -> invocation(i=$id.textp=$params)| ^( INVOKE id= ID exp= expression ) -> invocation(i=$id.textp=$exp.st))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:555:3: ^( INVOKE id= ID )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3181); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3185); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 556:5: -> invocation(i=$id.text)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:558:3: ^( INVOKE id= ID (params+= actualParameter )+ )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3210); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3214); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:558:25: (params+= actualParameter )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:558:25: params+= actualParameter
							{
							pushFollow(FOLLOW_actualParameter_in_invocation3218);
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
					// 559:5: -> invocation(i=$id.textp=$params)
					{
						retval.st = templateLib.getInstanceOf("invocation",new STAttrMap().put("i", (id!=null?id.getText():null)).put("p", list_params));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:561:3: ^( INVOKE id= ID exp= expression )
					{
					match(input,INVOKE,FOLLOW_INVOKE_in_invocation3249); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_invocation3253); 
					pushFollow(FOLLOW_expression_in_invocation3257);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 562:5: -> invocation(i=$id.textp=$exp.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:565:1: actualParameter : ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st);
	public final UnparseBLESS3.actualParameter_return actualParameter() throws RecognitionException {
		UnparseBLESS3.actualParameter_return retval = new UnparseBLESS3.actualParameter_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:566:3: ( ^( COLON formal= ID actual= expression ) -> actual_parameter(formal=$formal.textactual=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:567:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_actualParameter3294); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_actualParameter3298); 
			pushFollow(FOLLOW_expression_in_actualParameter3302);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 568:5: -> actual_parameter(formal=$formal.textactual=$actual.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:571:1: namelessAssertion : ( ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st)| ^( ASSERTION DUMMY ) );
	public final UnparseBLESS3.namelessAssertion_return namelessAssertion() throws RecognitionException {
		UnparseBLESS3.namelessAssertion_return retval = new UnparseBLESS3.namelessAssertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:572:3: ( ^( ASSERTION pred= predicate ) -> nameless_assertion(a=$pred.st)| ^( ASSERTION DUMMY ) )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==ASSERTION) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==DOWN) ) {
					int LA43_2 = input.LA(3);
					if ( (LA43_2==DUMMY) ) {
						alt43=2;
					}
					else if ( (LA43_2==AADL_STRING_LITERAL||(LA43_2 >= AL && LA43_2 <= AM)||LA43_2==AT_SIGN||LA43_2==CARET||LA43_2==DIVIDE||LA43_2==EQ||LA43_2==EXP||LA43_2==GT||LA43_2==ID||LA43_2==INVOKE||(LA43_2 >= LITERAL_abs && LA43_2 <= LITERAL_and)||LA43_2==LITERAL_div||LA43_2==LITERAL_else||LA43_2==LITERAL_exists||LA43_2==LITERAL_false||(LA43_2 >= LITERAL_iff && LA43_2 <= LITERAL_in)||LA43_2==LITERAL_mod||(LA43_2 >= LITERAL_not && LA43_2 <= LITERAL_numberof)||LA43_2==LITERAL_or||LA43_2==LITERAL_product||LA43_2==LITERAL_rem||LA43_2==LITERAL_round||LA43_2==LITERAL_sum||LA43_2==LITERAL_then||LA43_2==LITERAL_timeout||LA43_2==LITERAL_tops||(LA43_2 >= LITERAL_true && LA43_2 <= LITERAL_truncate)||(LA43_2 >= LITERAL_xor && LA43_2 <= LT)||LA43_2==MINUS||LA43_2==NEQ||LA43_2==OLD_NEQ||LA43_2==PLUS||LA43_2==PLUS_EQUALS||(LA43_2 >= QUANTITY && LA43_2 <= QUESTION)||LA43_2==RECORD_TERM||LA43_2==TICK||LA43_2==TIMES||LA43_2==UNARY_MINUS) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:573:3: ^( ASSERTION pred= predicate )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3341); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_namelessAssertion3345);
					pred=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 574:5: -> nameless_assertion(a=$pred.st)
					{
						retval.st = templateLib.getInstanceOf("nameless_assertion",new STAttrMap().put("a", (pred!=null?((StringTemplate)pred.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:576:3: ^( ASSERTION DUMMY )
					{
					match(input,ASSERTION,FOLLOW_ASSERTION_in_namelessAssertion3370); 
					match(input, Token.DOWN, null); 
					match(input,DUMMY,FOLLOW_DUMMY_in_namelessAssertion3372); 
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:579:1: namelessFunction : ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st);
	public final UnparseBLESS3.namelessFunction_return namelessFunction() throws RecognitionException {
		UnparseBLESS3.namelessFunction_return retval = new UnparseBLESS3.namelessFunction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tod =null;
		TreeRuleReturnScope functionvalue =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:580:3: ( ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue ) -> nameless_function(tod=$tod.sta=$functionvalue.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:581:3: ^( ASSERTION_FUNCTION ^( LITERAL_returns tod= typeOrReference ) functionvalue= assertionFunctionValue )
			{
			match(input,ASSERTION_FUNCTION,FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3395); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_returns,FOLLOW_LITERAL_returns_in_namelessFunction3399); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeOrReference_in_namelessFunction3403);
			tod=typeOrReference();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_assertionFunctionValue_in_namelessFunction3409);
			functionvalue=assertionFunctionValue();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 582:5: -> nameless_function(tod=$tod.sta=$functionvalue.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:585:1: namelessEnumeration : ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st);
	public final UnparseBLESS3.namelessEnumeration_return namelessEnumeration() throws RecognitionException {
		UnparseBLESS3.namelessEnumeration_return retval = new UnparseBLESS3.namelessEnumeration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope inv =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:586:3: ( ^( ASSERTION_ENUMERATION inv= invocation ) -> nameless_enumeration(inv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:587:2: ^( ASSERTION_ENUMERATION inv= invocation )
			{
			match(input,ASSERTION_ENUMERATION,FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3447); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_invocation_in_namelessEnumeration3451);
			inv=invocation();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 588:4: -> nameless_enumeration(inv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:591:1: assertion : (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st});
	public final UnparseBLESS3.assertion_return assertion() throws RecognitionException {
		UnparseBLESS3.assertion_return retval = new UnparseBLESS3.assertion_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope na =null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope f =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:591:10: (na= namedAssertion -> {$na.st}|a= namelessAssertion -> {$a.st}|f= namelessFunction -> {$f.st}|e= namelessEnumeration -> {$e.st})
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
					else if ( (LA44_4==AADL_STRING_LITERAL||(LA44_4 >= AL && LA44_4 <= AM)||LA44_4==AT_SIGN||LA44_4==CARET||LA44_4==DIVIDE||LA44_4==DUMMY||LA44_4==EQ||LA44_4==EXP||LA44_4==GT||LA44_4==ID||LA44_4==INVOKE||(LA44_4 >= LITERAL_abs && LA44_4 <= LITERAL_and)||LA44_4==LITERAL_div||LA44_4==LITERAL_else||LA44_4==LITERAL_exists||LA44_4==LITERAL_false||(LA44_4 >= LITERAL_iff && LA44_4 <= LITERAL_in)||LA44_4==LITERAL_mod||(LA44_4 >= LITERAL_not && LA44_4 <= LITERAL_numberof)||LA44_4==LITERAL_or||LA44_4==LITERAL_product||LA44_4==LITERAL_rem||LA44_4==LITERAL_round||LA44_4==LITERAL_sum||LA44_4==LITERAL_then||LA44_4==LITERAL_timeout||LA44_4==LITERAL_tops||(LA44_4 >= LITERAL_true && LA44_4 <= LITERAL_truncate)||(LA44_4 >= LITERAL_xor && LA44_4 <= LT)||LA44_4==MINUS||LA44_4==NEQ||LA44_4==OLD_NEQ||LA44_4==PLUS||LA44_4==PLUS_EQUALS||(LA44_4 >= QUANTITY && LA44_4 <= QUESTION)||LA44_4==RECORD_TERM||LA44_4==TICK||LA44_4==TIMES||LA44_4==UNARY_MINUS) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:592:3: na= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertion3480);
					na=namedAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 593:5: -> {$na.st}
					{
						retval.st = (na!=null?((StringTemplate)na.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:594:5: a= namelessAssertion
					{
					pushFollow(FOLLOW_namelessAssertion_in_assertion3496);
					a=namelessAssertion();
					state._fsp--;

					// TEMPLATE REWRITE
					// 595:5: -> {$a.st}
					{
						retval.st = (a!=null?((StringTemplate)a.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:596:5: f= namelessFunction
					{
					pushFollow(FOLLOW_namelessFunction_in_assertion3512);
					f=namelessFunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 597:5: -> {$f.st}
					{
						retval.st = (f!=null?((StringTemplate)f.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:598:5: e= namelessEnumeration
					{
					pushFollow(FOLLOW_namelessEnumeration_in_assertion3528);
					e=namelessEnumeration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 599:5: -> {$e.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:604:1: expression : (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st)|dis= disjunction -> {$dis.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:605:2: (all= universalQuantification -> {$all.st}|exists= existentialQuantification -> {$exists.st}|sum= sumQuantification -> {$sum.st}|product= productQuantification -> {$product.st}|numberof= countingQuantification -> {$numberof.st}| ^(iff= LITERAL_iff l= disjunction r= disjunction ) -> relation(r=$iff.textlhs=$l.strhs=$r.st)| ^(imp= LITERAL_implies l= disjunction r= disjunction ) -> relation(r=$imp.textlhs=$l.strhs=$r.st)|dis= disjunction -> {$dis.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:606:3: all= universalQuantification
					{
					pushFollow(FOLLOW_universalQuantification_in_expression3560);
					all=universalQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 607:5: -> {$all.st}
					{
						retval.st = (all!=null?((StringTemplate)all.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:608:5: exists= existentialQuantification
					{
					pushFollow(FOLLOW_existentialQuantification_in_expression3576);
					exists=existentialQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 609:5: -> {$exists.st}
					{
						retval.st = (exists!=null?((StringTemplate)exists.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:610:5: sum= sumQuantification
					{
					pushFollow(FOLLOW_sumQuantification_in_expression3592);
					sum=sumQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 611:5: -> {$sum.st}
					{
						retval.st = (sum!=null?((StringTemplate)sum.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:612:5: product= productQuantification
					{
					pushFollow(FOLLOW_productQuantification_in_expression3608);
					product=productQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 613:5: -> {$product.st}
					{
						retval.st = (product!=null?((StringTemplate)product.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:614:5: numberof= countingQuantification
					{
					pushFollow(FOLLOW_countingQuantification_in_expression3624);
					numberof=countingQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 615:5: -> {$numberof.st}
					{
						retval.st = (numberof!=null?((StringTemplate)numberof.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:616:5: ^(iff= LITERAL_iff l= disjunction r= disjunction )
					{
					iff=(BAST)match(input,LITERAL_iff,FOLLOW_LITERAL_iff_in_expression3642); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3646);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3650);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 617:5: -> relation(r=$iff.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (iff!=null?iff.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:618:5: ^(imp= LITERAL_implies l= disjunction r= disjunction )
					{
					imp=(BAST)match(input,LITERAL_implies,FOLLOW_LITERAL_implies_in_expression3685); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_disjunction_in_expression3689);
					l=disjunction();
					state._fsp--;

					pushFollow(FOLLOW_disjunction_in_expression3693);
					r=disjunction();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 619:5: -> relation(r=$imp.textlhs=$l.strhs=$r.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (imp!=null?imp.getText():null)).put("lhs", (l!=null?((StringTemplate)l.getTemplate()):null)).put("rhs", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:620:5: dis= disjunction
					{
					pushFollow(FOLLOW_disjunction_in_expression3726);
					dis=disjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 621:5: -> {$dis.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:624:1: universalQuantification : ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st);
	public final UnparseBLESS3.universalQuantification_return universalQuantification() throws RecognitionException {
		UnparseBLESS3.universalQuantification_return retval = new UnparseBLESS3.universalQuantification_return();
		retval.start = input.LT(1);

		BAST a=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:625:3: ( ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) ) -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:626:3: ^(a= LITERAL_all lv= logicVariables iw= in_which ^( LITERAL_are pred= predicate ) )
			{
			a=(BAST)match(input,LITERAL_all,FOLLOW_LITERAL_all_in_universalQuantification3753); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_universalQuantification3757);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_universalQuantification3761);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_are,FOLLOW_LITERAL_are_in_universalQuantification3765); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_universalQuantification3769);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 627:5: -> universal_quantification(a=$a.textlv=$lv.std=$iw.stp=$pred.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:630:1: in_which : ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\");
	public final UnparseBLESS3.in_which_return in_which() throws RecognitionException {
		UnparseBLESS3.in_which_return retval = new UnparseBLESS3.in_which_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope r =null;
		TreeRuleReturnScope b =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:631:3: ( ^( LITERAL_in r= range ) -> template(r=$r.st) \"in <r>\"| ^( LITERAL_which b= predicate ) -> template(b=$b.st) \"which <b>\")
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:632:3: ^( LITERAL_in r= range )
					{
					match(input,LITERAL_in,FOLLOW_LITERAL_in_in_in_which3818); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_range_in_in_which3822);
					r=range();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 633:5: -> template(r=$r.st) \"in <r>\"
					{
						retval.st = new StringTemplate(templateLib, "in <r>",new STAttrMap().put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:635:3: ^( LITERAL_which b= predicate )
					{
					match(input,LITERAL_which,FOLLOW_LITERAL_which_in_in_which3849); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_predicate_in_in_which3853);
					b=predicate();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 636:5: -> template(b=$b.st) \"which <b>\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:639:1: existentialQuantification : ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_that pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st);
	public final UnparseBLESS3.existentialQuantification_return existentialQuantification() throws RecognitionException {
		UnparseBLESS3.existentialQuantification_return retval = new UnparseBLESS3.existentialQuantification_return();
		retval.start = input.LT(1);

		BAST e=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope pred =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:640:3: ( ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_that pred= predicate ) ) -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:641:3: ^(e= LITERAL_exists lv= logicVariables iw= in_which ^( LITERAL_that pred= predicate ) )
			{
			e=(BAST)match(input,LITERAL_exists,FOLLOW_LITERAL_exists_in_existentialQuantification3889); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_existentialQuantification3893);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_existentialQuantification3897);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_that,FOLLOW_LITERAL_that_in_existentialQuantification3901); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_predicate_in_existentialQuantification3905);
			pred=predicate();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 642:5: -> existential_quantification(e=$e.textlv2=$lv.std2=$iw.stp2=$pred.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:645:1: sumQuantification : ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.sumQuantification_return sumQuantification() throws RecognitionException {
		UnparseBLESS3.sumQuantification_return retval = new UnparseBLESS3.sumQuantification_return();
		retval.start = input.LT(1);

		BAST s=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:646:3: ( ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:647:3: ^(s= LITERAL_sum lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			s=(BAST)match(input,LITERAL_sum,FOLLOW_LITERAL_sum_in_sumQuantification3956); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_sumQuantification3960);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_sumQuantification3964);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_sumQuantification3968); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_sumQuantification3972);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 648:5: -> sum(s=$s.textlv=$lv.std=$iw.stpe=$ex.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:651:1: productQuantification : ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.productQuantification_return productQuantification() throws RecognitionException {
		UnparseBLESS3.productQuantification_return retval = new UnparseBLESS3.productQuantification_return();
		retval.start = input.LT(1);

		BAST p=null;
		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:652:3: ( ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) ) -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:653:3: ^(p= LITERAL_product lv= logicVariables iw= in_which ^( LITERAL_of ex= expression ) )
			{
			p=(BAST)match(input,LITERAL_product,FOLLOW_LITERAL_product_in_productQuantification4024); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_productQuantification4028);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_productQuantification4032);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_of,FOLLOW_LITERAL_of_in_productQuantification4036); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_productQuantification4040);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 654:6: -> product(p=$p.textlv=$lv.std=$iw.stpe=$ex.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:657:1: countingQuantification : ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st);
	public final UnparseBLESS3.countingQuantification_return countingQuantification() throws RecognitionException {
		UnparseBLESS3.countingQuantification_return retval = new UnparseBLESS3.countingQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope lv =null;
		TreeRuleReturnScope iw =null;
		TreeRuleReturnScope ex =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:658:3: ( ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) ) -> numberof(lv=$lv.std=$iw.stpe=$ex.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:659:3: ^( LITERAL_numberof lv= logicVariables iw= in_which ^( LITERAL_that ex= expression ) )
			{
			match(input,LITERAL_numberof,FOLLOW_LITERAL_numberof_in_countingQuantification4091); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_logicVariables_in_countingQuantification4095);
			lv=logicVariables();
			state._fsp--;

			pushFollow(FOLLOW_in_which_in_countingQuantification4099);
			iw=in_which();
			state._fsp--;

			match(input,LITERAL_that,FOLLOW_LITERAL_that_in_countingQuantification4103); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_countingQuantification4107);
			ex=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 660:5: -> numberof(lv=$lv.std=$iw.stpe=$ex.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:663:1: logicVariables : ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable -> {$v.st});
	public final UnparseBLESS3.logicVariables_return logicVariables() throws RecognitionException {
		UnparseBLESS3.logicVariables_return retval = new UnparseBLESS3.logicVariables_return();
		retval.start = input.LT(1);

		List<Object> list_lv=null;
		TreeRuleReturnScope v =null;
		RuleReturnScope lv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:664:3: ( ^( COMMA (lv+= variable )+ ) -> variable_list(parameter=$lv)|v= variable -> {$v.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:3: ^( COMMA (lv+= variable )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_logicVariables4154); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:14: (lv+= variable )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:665:14: lv+= variable
							{
							pushFollow(FOLLOW_variable_in_logicVariables4158);
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
					// 666:5: -> variable_list(parameter=$lv)
					{
						retval.st = templateLib.getInstanceOf("variable_list",new STAttrMap().put("parameter", list_lv));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:668:3: v= variable
					{
					pushFollow(FOLLOW_variable_in_logicVariables4184);
					v=variable();
					state._fsp--;

					// TEMPLATE REWRITE
					// 669:5: -> {$v.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:672:1: disjunction : ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction -> {$con.st});
	public final UnparseBLESS3.disjunction_return disjunction() throws RecognitionException {
		UnparseBLESS3.disjunction_return retval = new UnparseBLESS3.disjunction_return();
		retval.start = input.LT(1);

		List<Object> list_c=null;
		TreeRuleReturnScope con =null;
		RuleReturnScope c = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:673:3: ( ^( LITERAL_or (c+= conjunction )+ ) -> disjunction(bopt=$c)| ^( LITERAL_else (c+= conjunction )+ ) -> cor(t=$c)| ^( LITERAL_xor (c+= conjunction )+ ) -> xor(terms=$c)|con= conjunction -> {$con.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:674:3: ^( LITERAL_or (c+= conjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_disjunction4213); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:674:18: (c+= conjunction )+
					int cnt49=0;
					loop49:
					while (true) {
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==AADL_STRING_LITERAL||(LA49_0 >= AL && LA49_0 <= AM)||LA49_0==AT_SIGN||LA49_0==CARET||LA49_0==DIVIDE||LA49_0==EQ||LA49_0==EXP||LA49_0==GT||LA49_0==ID||LA49_0==INVOKE||LA49_0==LITERAL_abs||LA49_0==LITERAL_and||LA49_0==LITERAL_div||LA49_0==LITERAL_false||LA49_0==LITERAL_in||LA49_0==LITERAL_mod||(LA49_0 >= LITERAL_not && LA49_0 <= LITERAL_null)||LA49_0==LITERAL_rem||LA49_0==LITERAL_round||LA49_0==LITERAL_then||LA49_0==LITERAL_timeout||LA49_0==LITERAL_tops||(LA49_0 >= LITERAL_true && LA49_0 <= LITERAL_truncate)||(LA49_0 >= LPAREN && LA49_0 <= LT)||LA49_0==MINUS||LA49_0==NEQ||LA49_0==OLD_NEQ||LA49_0==PLUS||LA49_0==PLUS_EQUALS||(LA49_0 >= QUANTITY && LA49_0 <= QUESTION)||LA49_0==RECORD_TERM||LA49_0==TICK||LA49_0==TIMES||LA49_0==UNARY_MINUS) ) {
							alt49=1;
						}

						switch (alt49) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:674:18: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4217);
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
					// 675:5: -> disjunction(bopt=$c)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_c));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:3: ^( LITERAL_else (c+= conjunction )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_disjunction4243); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:20: (c+= conjunction )+
					int cnt50=0;
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==AADL_STRING_LITERAL||(LA50_0 >= AL && LA50_0 <= AM)||LA50_0==AT_SIGN||LA50_0==CARET||LA50_0==DIVIDE||LA50_0==EQ||LA50_0==EXP||LA50_0==GT||LA50_0==ID||LA50_0==INVOKE||LA50_0==LITERAL_abs||LA50_0==LITERAL_and||LA50_0==LITERAL_div||LA50_0==LITERAL_false||LA50_0==LITERAL_in||LA50_0==LITERAL_mod||(LA50_0 >= LITERAL_not && LA50_0 <= LITERAL_null)||LA50_0==LITERAL_rem||LA50_0==LITERAL_round||LA50_0==LITERAL_then||LA50_0==LITERAL_timeout||LA50_0==LITERAL_tops||(LA50_0 >= LITERAL_true && LA50_0 <= LITERAL_truncate)||(LA50_0 >= LPAREN && LA50_0 <= LT)||LA50_0==MINUS||LA50_0==NEQ||LA50_0==OLD_NEQ||LA50_0==PLUS||LA50_0==PLUS_EQUALS||(LA50_0 >= QUANTITY && LA50_0 <= QUESTION)||LA50_0==RECORD_TERM||LA50_0==TICK||LA50_0==TIMES||LA50_0==UNARY_MINUS) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:677:20: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4247);
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
					// 678:5: -> cor(t=$c)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_c));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:3: ^( LITERAL_xor (c+= conjunction )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_disjunction4273); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:19: (c+= conjunction )+
					int cnt51=0;
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==AADL_STRING_LITERAL||(LA51_0 >= AL && LA51_0 <= AM)||LA51_0==AT_SIGN||LA51_0==CARET||LA51_0==DIVIDE||LA51_0==EQ||LA51_0==EXP||LA51_0==GT||LA51_0==ID||LA51_0==INVOKE||LA51_0==LITERAL_abs||LA51_0==LITERAL_and||LA51_0==LITERAL_div||LA51_0==LITERAL_false||LA51_0==LITERAL_in||LA51_0==LITERAL_mod||(LA51_0 >= LITERAL_not && LA51_0 <= LITERAL_null)||LA51_0==LITERAL_rem||LA51_0==LITERAL_round||LA51_0==LITERAL_then||LA51_0==LITERAL_timeout||LA51_0==LITERAL_tops||(LA51_0 >= LITERAL_true && LA51_0 <= LITERAL_truncate)||(LA51_0 >= LPAREN && LA51_0 <= LT)||LA51_0==MINUS||LA51_0==NEQ||LA51_0==OLD_NEQ||LA51_0==PLUS||LA51_0==PLUS_EQUALS||(LA51_0 >= QUANTITY && LA51_0 <= QUESTION)||LA51_0==RECORD_TERM||LA51_0==TICK||LA51_0==TIMES||LA51_0==UNARY_MINUS) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:680:19: c+= conjunction
							{
							pushFollow(FOLLOW_conjunction_in_disjunction4277);
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
					// 681:5: -> xor(terms=$c)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_c));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:683:3: con= conjunction
					{
					pushFollow(FOLLOW_conjunction_in_disjunction4303);
					con=conjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 684:5: -> {$con.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:687:1: conjunction : ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st});
	public final UnparseBLESS3.conjunction_return conjunction() throws RecognitionException {
		UnparseBLESS3.conjunction_return retval = new UnparseBLESS3.conjunction_return();
		retval.start = input.LT(1);

		List<Object> list_r=null;
		TreeRuleReturnScope rel =null;
		RuleReturnScope r = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:688:3: ( ^( LITERAL_and (r+= relation )+ ) -> conjunction(bopt=$r)| ^( LITERAL_then (r+= relation )+ ) -> cand(t=$r)|rel= relation -> {$rel.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:689:3: ^( LITERAL_and (r+= relation )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_conjunction4331); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:689:19: (r+= relation )+
					int cnt53=0;
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==AADL_STRING_LITERAL||(LA53_0 >= AL && LA53_0 <= AM)||LA53_0==AT_SIGN||LA53_0==CARET||LA53_0==DIVIDE||LA53_0==EQ||LA53_0==EXP||LA53_0==GT||LA53_0==ID||LA53_0==INVOKE||LA53_0==LITERAL_abs||LA53_0==LITERAL_div||LA53_0==LITERAL_false||LA53_0==LITERAL_in||LA53_0==LITERAL_mod||(LA53_0 >= LITERAL_not && LA53_0 <= LITERAL_null)||LA53_0==LITERAL_rem||LA53_0==LITERAL_round||LA53_0==LITERAL_timeout||LA53_0==LITERAL_tops||(LA53_0 >= LITERAL_true && LA53_0 <= LITERAL_truncate)||(LA53_0 >= LPAREN && LA53_0 <= LT)||LA53_0==MINUS||LA53_0==NEQ||LA53_0==OLD_NEQ||LA53_0==PLUS||LA53_0==PLUS_EQUALS||(LA53_0 >= QUANTITY && LA53_0 <= QUESTION)||LA53_0==RECORD_TERM||LA53_0==TICK||LA53_0==TIMES||LA53_0==UNARY_MINUS) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:689:19: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4335);
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
					// 690:5: -> conjunction(bopt=$r)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_r));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:3: ^( LITERAL_then (r+= relation )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_conjunction4361); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:20: (r+= relation )+
					int cnt54=0;
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==AADL_STRING_LITERAL||(LA54_0 >= AL && LA54_0 <= AM)||LA54_0==AT_SIGN||LA54_0==CARET||LA54_0==DIVIDE||LA54_0==EQ||LA54_0==EXP||LA54_0==GT||LA54_0==ID||LA54_0==INVOKE||LA54_0==LITERAL_abs||LA54_0==LITERAL_div||LA54_0==LITERAL_false||LA54_0==LITERAL_in||LA54_0==LITERAL_mod||(LA54_0 >= LITERAL_not && LA54_0 <= LITERAL_null)||LA54_0==LITERAL_rem||LA54_0==LITERAL_round||LA54_0==LITERAL_timeout||LA54_0==LITERAL_tops||(LA54_0 >= LITERAL_true && LA54_0 <= LITERAL_truncate)||(LA54_0 >= LPAREN && LA54_0 <= LT)||LA54_0==MINUS||LA54_0==NEQ||LA54_0==OLD_NEQ||LA54_0==PLUS||LA54_0==PLUS_EQUALS||(LA54_0 >= QUANTITY && LA54_0 <= QUESTION)||LA54_0==RECORD_TERM||LA54_0==TICK||LA54_0==TIMES||LA54_0==UNARY_MINUS) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:692:20: r+= relation
							{
							pushFollow(FOLLOW_relation_in_conjunction4365);
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
					// 693:5: -> cand(t=$r)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_r));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:695:3: rel= relation
					{
					pushFollow(FOLLOW_relation_in_conjunction4391);
					rel=relation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 696:5: -> {$rel.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:699:2: relation : ( ^(eq= EQ lhs= addSub rhs= addSub ) -> relation(r=$eq.textlhs=$lhs.strhs=$rhs.st)| ^(lt= LT lhs= addSub rhs= addSub ) -> relation(r=$lt.textlhs=$lhs.strhs=$rhs.st)| ^(am= AM lhs= addSub rhs= addSub ) -> relation(r=$am.textlhs=$lhs.strhs=$rhs.st)| ^(al= AL lhs= addSub rhs= addSub ) -> relation(r=$al.textlhs=$lhs.strhs=$rhs.st)| ^(gt= GT lhs= addSub rhs= addSub ) -> relation(r=$gt.textlhs=$lhs.strhs=$rhs.st)| ^(pe= PLUS_EQUALS lhs= addSub rhs= addSub ) -> relation(r=$pe.textlhs=$lhs.strhs=$rhs.st)| ^(ne= NEQ lhs= addSub rhs= addSub ) -> relation(r=$ne.textlhs=$lhs.strhs=$rhs.st)| ^(one= OLD_NEQ lhs= addSub rhs= addSub ) -> relation(r=$one.textlhs=$lhs.strhs=$rhs.st)| ^(in= LITERAL_in lhs= addSub rng= range ) -> relation(r=$in.textlhs=$lhs.strhs=$rng.st)|as= addSub -> {$as.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:700:3: ( ^(eq= EQ lhs= addSub rhs= addSub ) -> relation(r=$eq.textlhs=$lhs.strhs=$rhs.st)| ^(lt= LT lhs= addSub rhs= addSub ) -> relation(r=$lt.textlhs=$lhs.strhs=$rhs.st)| ^(am= AM lhs= addSub rhs= addSub ) -> relation(r=$am.textlhs=$lhs.strhs=$rhs.st)| ^(al= AL lhs= addSub rhs= addSub ) -> relation(r=$al.textlhs=$lhs.strhs=$rhs.st)| ^(gt= GT lhs= addSub rhs= addSub ) -> relation(r=$gt.textlhs=$lhs.strhs=$rhs.st)| ^(pe= PLUS_EQUALS lhs= addSub rhs= addSub ) -> relation(r=$pe.textlhs=$lhs.strhs=$rhs.st)| ^(ne= NEQ lhs= addSub rhs= addSub ) -> relation(r=$ne.textlhs=$lhs.strhs=$rhs.st)| ^(one= OLD_NEQ lhs= addSub rhs= addSub ) -> relation(r=$one.textlhs=$lhs.strhs=$rhs.st)| ^(in= LITERAL_in lhs= addSub rng= range ) -> relation(r=$in.textlhs=$lhs.strhs=$rng.st)|as= addSub -> {$as.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:701:3: ^(eq= EQ lhs= addSub rhs= addSub )
					{
					eq=(BAST)match(input,EQ,FOLLOW_EQ_in_relation4420); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4425);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4429);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 702:5: -> relation(r=$eq.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (eq!=null?eq.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:704:3: ^(lt= LT lhs= addSub rhs= addSub )
					{
					lt=(BAST)match(input,LT,FOLLOW_LT_in_relation4466); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4471);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4475);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 705:5: -> relation(r=$lt.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (lt!=null?lt.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:707:3: ^(am= AM lhs= addSub rhs= addSub )
					{
					am=(BAST)match(input,AM,FOLLOW_AM_in_relation4513); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4518);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4522);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 708:5: -> relation(r=$am.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (am!=null?am.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:710:3: ^(al= AL lhs= addSub rhs= addSub )
					{
					al=(BAST)match(input,AL,FOLLOW_AL_in_relation4560); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4565);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4569);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 711:5: -> relation(r=$al.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (al!=null?al.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:713:3: ^(gt= GT lhs= addSub rhs= addSub )
					{
					gt=(BAST)match(input,GT,FOLLOW_GT_in_relation4607); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4612);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4616);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 714:5: -> relation(r=$gt.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (gt!=null?gt.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:716:3: ^(pe= PLUS_EQUALS lhs= addSub rhs= addSub )
					{
					pe=(BAST)match(input,PLUS_EQUALS,FOLLOW_PLUS_EQUALS_in_relation4654); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4659);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4663);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 717:5: -> relation(r=$pe.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (pe!=null?pe.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:719:3: ^(ne= NEQ lhs= addSub rhs= addSub )
					{
					ne=(BAST)match(input,NEQ,FOLLOW_NEQ_in_relation4701); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4706);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4710);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 720:5: -> relation(r=$ne.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (ne!=null?ne.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:722:3: ^(one= OLD_NEQ lhs= addSub rhs= addSub )
					{
					one=(BAST)match(input,OLD_NEQ,FOLLOW_OLD_NEQ_in_relation4747); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4752);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_addSub_in_relation4756);
					rhs=addSub();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 723:5: -> relation(r=$one.textlhs=$lhs.strhs=$rhs.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (one!=null?one.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rhs!=null?((StringTemplate)rhs.getTemplate()):null)));
					}



					}
					break;
				case 9 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:725:3: ^(in= LITERAL_in lhs= addSub rng= range )
					{
					in=(BAST)match(input,LITERAL_in,FOLLOW_LITERAL_in_in_relation4791); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_addSub_in_relation4795);
					lhs=addSub();
					state._fsp--;

					pushFollow(FOLLOW_range_in_relation4799);
					rng=range();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 726:6: -> relation(r=$in.textlhs=$lhs.strhs=$rng.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (in!=null?in.getText():null)).put("lhs", (lhs!=null?((StringTemplate)lhs.getTemplate()):null)).put("rhs", (rng!=null?((StringTemplate)rng.getTemplate()):null)));
					}



					}
					break;
				case 10 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:728:3: as= addSub
					{
					pushFollow(FOLLOW_addSub_in_relation4833);
					as=addSub();
					state._fsp--;

					// TEMPLATE REWRITE
					// 729:5: -> {$as.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:732:1: range : ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:733:3: ( ^(dd= DOTDOT lb= subexpression ub= subexpression ) -> range(rs=$dd.textlb=$lb.stub=$ub.st)| ^(cd= COMMADOT lb= subexpression ub= subexpression ) -> range(rs=$cd.textlb=$lb.stub=$ub.st)| ^(dc= DOTCOMMA lb= subexpression ub= subexpression ) -> range(rs=$dc.textlb=$lb.stub=$ub.st)| ^(cc= COMMACOMMA lb= subexpression ub= subexpression ) -> range(rs=$cc.textlb=$lb.stub=$ub.st))
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:734:3: ^(dd= DOTDOT lb= subexpression ub= subexpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_range4860); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4864);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4868);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 735:5: -> range(rs=$dd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dd!=null?dd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:737:4: ^(cd= COMMADOT lb= subexpression ub= subexpression )
					{
					cd=(BAST)match(input,COMMADOT,FOLLOW_COMMADOT_in_range4906); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4910);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4914);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 738:5: -> range(rs=$cd.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (cd!=null?cd.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:740:4: ^(dc= DOTCOMMA lb= subexpression ub= subexpression )
					{
					dc=(BAST)match(input,DOTCOMMA,FOLLOW_DOTCOMMA_in_range4952); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range4956);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range4960);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 741:5: -> range(rs=$dc.textlb=$lb.stub=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("range",new STAttrMap().put("rs", (dc!=null?dc.getText():null)).put("lb", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("ub", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:743:4: ^(cc= COMMACOMMA lb= subexpression ub= subexpression )
					{
					cc=(BAST)match(input,COMMACOMMA,FOLLOW_COMMACOMMA_in_range4998); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_range5002);
					lb=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_range5006);
					ub=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 744:5: -> range(rs=$cc.textlb=$lb.stub=$ub.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:747:1: addSub : ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st});
	public final UnparseBLESS3.addSub_return addSub() throws RecognitionException {
		UnparseBLESS3.addSub_return retval = new UnparseBLESS3.addSub_return();
		retval.start = input.LT(1);

		List<Object> list_md=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope m =null;
		RuleReturnScope md = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:748:3: ( ^( PLUS (md+= multDiv )+ ) -> add(terms=$md)| ^( MINUS l= multDiv r= multDiv ) -> template(l=$l.str=$r.st) \"<l> - <r>\"|m= multDiv -> {$m.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:749:3: ^( PLUS (md+= multDiv )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_addSub5049); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:749:13: (md+= multDiv )+
					int cnt58=0;
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==AADL_STRING_LITERAL||LA58_0==AT_SIGN||LA58_0==CARET||LA58_0==DIVIDE||LA58_0==EXP||LA58_0==ID||LA58_0==INVOKE||LA58_0==LITERAL_abs||LA58_0==LITERAL_div||LA58_0==LITERAL_false||LA58_0==LITERAL_mod||(LA58_0 >= LITERAL_not && LA58_0 <= LITERAL_null)||LA58_0==LITERAL_rem||LA58_0==LITERAL_round||LA58_0==LITERAL_timeout||LA58_0==LITERAL_tops||(LA58_0 >= LITERAL_true && LA58_0 <= LITERAL_truncate)||LA58_0==LPAREN||(LA58_0 >= QUANTITY && LA58_0 <= QUESTION)||LA58_0==RECORD_TERM||LA58_0==TICK||LA58_0==TIMES||LA58_0==UNARY_MINUS) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:749:13: md+= multDiv
							{
							pushFollow(FOLLOW_multDiv_in_addSub5053);
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
					// 750:5: -> add(terms=$md)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_md));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:752:3: ^( MINUS l= multDiv r= multDiv )
					{
					match(input,MINUS,FOLLOW_MINUS_in_addSub5079); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_multDiv_in_addSub5083);
					l=multDiv();
					state._fsp--;

					pushFollow(FOLLOW_multDiv_in_addSub5087);
					r=multDiv();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 753:5: -> template(l=$l.str=$r.st) \"<l> - <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> - <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:755:3: m= multDiv
					{
					pushFollow(FOLLOW_multDiv_in_addSub5119);
					m=multDiv();
					state._fsp--;

					// TEMPLATE REWRITE
					// 756:5: -> {$m.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:759:1: multDiv : ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st});
	public final UnparseBLESS3.multDiv_return multDiv() throws RecognitionException {
		UnparseBLESS3.multDiv_return retval = new UnparseBLESS3.multDiv_return();
		retval.start = input.LT(1);

		List<Object> list_exp=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope e =null;
		RuleReturnScope exp = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:760:3: ( ^( TIMES (exp+= exponentiation )+ ) -> multiply(terms=$exp)| ^( DIVIDE l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^( LITERAL_div l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^( LITERAL_mod l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^( LITERAL_rem l= exponentiation r= exponentiation ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"|e= exponentiation -> {$e.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:761:3: ^( TIMES (exp+= exponentiation )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_multDiv5150); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:761:15: (exp+= exponentiation )+
					int cnt60=0;
					loop60:
					while (true) {
						int alt60=2;
						int LA60_0 = input.LA(1);
						if ( (LA60_0==AADL_STRING_LITERAL||LA60_0==AT_SIGN||LA60_0==CARET||LA60_0==EXP||LA60_0==ID||LA60_0==INVOKE||LA60_0==LITERAL_abs||LA60_0==LITERAL_false||(LA60_0 >= LITERAL_not && LA60_0 <= LITERAL_null)||LA60_0==LITERAL_round||LA60_0==LITERAL_timeout||LA60_0==LITERAL_tops||(LA60_0 >= LITERAL_true && LA60_0 <= LITERAL_truncate)||LA60_0==LPAREN||(LA60_0 >= QUANTITY && LA60_0 <= QUESTION)||LA60_0==RECORD_TERM||LA60_0==TICK||LA60_0==UNARY_MINUS) ) {
							alt60=1;
						}

						switch (alt60) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:761:15: exp+= exponentiation
							{
							pushFollow(FOLLOW_exponentiation_in_multDiv5154);
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
					// 762:5: -> multiply(terms=$exp)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_exp));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:764:3: ^( DIVIDE l= exponentiation r= exponentiation )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multDiv5180); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5184);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5188);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 765:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:767:3: ^( LITERAL_div l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_div,FOLLOW_LITERAL_div_in_multDiv5220); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5224);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5228);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 768:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:770:3: ^( LITERAL_mod l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_multDiv5260); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5264);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5268);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 771:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:773:3: ^( LITERAL_rem l= exponentiation r= exponentiation )
					{
					match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_multDiv5300); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_exponentiation_in_multDiv5304);
					l=exponentiation();
					state._fsp--;

					pushFollow(FOLLOW_exponentiation_in_multDiv5308);
					r=exponentiation();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 774:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:776:3: e= exponentiation
					{
					pushFollow(FOLLOW_exponentiation_in_multDiv5340);
					e=exponentiation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 777:5: -> {$e.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:781:1: exponentiation : ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st});
	public final UnparseBLESS3.exponentiation_return exponentiation() throws RecognitionException {
		UnparseBLESS3.exponentiation_return retval = new UnparseBLESS3.exponentiation_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		TreeRuleReturnScope s =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:782:3: ( ^( EXP l= subexpression r= subexpression ) -> template(l=$l.str=$r.st) \"<l> ** <r>\"|s= subexpression -> {$s.st})
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==EXP) ) {
				alt62=1;
			}
			else if ( (LA62_0==AADL_STRING_LITERAL||LA62_0==AT_SIGN||LA62_0==CARET||LA62_0==ID||LA62_0==INVOKE||LA62_0==LITERAL_abs||LA62_0==LITERAL_false||(LA62_0 >= LITERAL_not && LA62_0 <= LITERAL_null)||LA62_0==LITERAL_round||LA62_0==LITERAL_timeout||LA62_0==LITERAL_tops||(LA62_0 >= LITERAL_true && LA62_0 <= LITERAL_truncate)||LA62_0==LPAREN||(LA62_0 >= QUANTITY && LA62_0 <= QUESTION)||LA62_0==RECORD_TERM||LA62_0==TICK||LA62_0==UNARY_MINUS) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:783:3: ^( EXP l= subexpression r= subexpression )
					{
					match(input,EXP,FOLLOW_EXP_in_exponentiation5372); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_subexpression_in_exponentiation5376);
					l=subexpression();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_exponentiation5380);
					r=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 784:5: -> template(l=$l.str=$r.st) \"<l> ** <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> ** <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:786:3: s= subexpression
					{
					pushFollow(FOLLOW_subexpression_in_exponentiation5412);
					s=subexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 787:5: -> {$s.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:790:1: subexpression : ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:791:3: ( ^(n= LITERAL_not te= timedExpression ) -> unary(sym=$n.textex=$te.st)| ^(m= UNARY_MINUS te= timedExpression ) -> unary(sym=$m.textex=$te.st)| ^(s= LITERAL_abs te= timedExpression ) -> unary(sym=$s.textex=$te.st)| ^(t= LITERAL_truncate te= timedExpression ) -> unary(sym=$t.textex=$te.st)| ^(r= LITERAL_round te= timedExpression ) -> unary(sym=$r.textex=$te.st)|te= timedExpression -> {$te.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:792:3: ^(n= LITERAL_not te= timedExpression )
					{
					n=(BAST)match(input,LITERAL_not,FOLLOW_LITERAL_not_in_subexpression5443); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5447);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 793:5: -> unary(sym=$n.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (n!=null?n.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:795:3: ^(m= UNARY_MINUS te= timedExpression )
					{
					m=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_subexpression5479); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5483);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 796:5: -> unary(sym=$m.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (m!=null?m.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:798:3: ^(s= LITERAL_abs te= timedExpression )
					{
					s=(BAST)match(input,LITERAL_abs,FOLLOW_LITERAL_abs_in_subexpression5515); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5519);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 799:5: -> unary(sym=$s.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (s!=null?s.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:801:3: ^(t= LITERAL_truncate te= timedExpression )
					{
					t=(BAST)match(input,LITERAL_truncate,FOLLOW_LITERAL_truncate_in_subexpression5551); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5555);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 802:5: -> unary(sym=$t.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (t!=null?t.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:804:3: ^(r= LITERAL_round te= timedExpression )
					{
					r=(BAST)match(input,LITERAL_round,FOLLOW_LITERAL_round_in_subexpression5587); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedExpression_in_subexpression5591);
					te=timedExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 805:5: -> unary(sym=$r.textex=$te.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (r!=null?r.getText():null)).put("ex", (te!=null?((StringTemplate)te.getTemplate()):null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:807:3: te= timedExpression
					{
					pushFollow(FOLLOW_timedExpression_in_subexpression5621);
					te=timedExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 808:5: -> {$te.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:811:1: timedExpression : ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st});
	public final UnparseBLESS3.timedExpression_return timedExpression() throws RecognitionException {
		UnparseBLESS3.timedExpression_return retval = new UnparseBLESS3.timedExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ts =null;
		TreeRuleReturnScope se =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:812:3: ( ^( TICK ts= timedSubject ) -> tick(tp=$ts.st)| ^( AT_SIGN ts= timedSubject se= subexpression ) -> at(p=$ts.stt=$se.st)| ^( CARET ts= timedSubject ps= periodShift ) -> caret(p=$ts.stcv=$ps.st)|ts= timedSubject -> {$ts.st})
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
					else if ( (LA64_5==AADL_STRING_LITERAL||LA64_5==INVOKE||LA64_5==LITERAL_false||(LA64_5 >= LITERAL_now && LA64_5 <= LITERAL_null)||LA64_5==LITERAL_timeout||LA64_5==LITERAL_tops||LA64_5==LITERAL_true||LA64_5==LPAREN||(LA64_5 >= QUANTITY && LA64_5 <= QUESTION)||LA64_5==RECORD_TERM||LA64_5==TICK) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:813:3: ^( TICK ts= timedSubject )
					{
					match(input,TICK,FOLLOW_TICK_in_timedExpression5651); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5655);
					ts=timedSubject();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 814:5: -> tick(tp=$ts.st)
					{
						retval.st = templateLib.getInstanceOf("tick",new STAttrMap().put("tp", (ts!=null?((StringTemplate)ts.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:816:3: ^( AT_SIGN ts= timedSubject se= subexpression )
					{
					match(input,AT_SIGN,FOLLOW_AT_SIGN_in_timedExpression5680); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5684);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_subexpression_in_timedExpression5688);
					se=subexpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 817:5: -> at(p=$ts.stt=$se.st)
					{
						retval.st = templateLib.getInstanceOf("at",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("t", (se!=null?((StringTemplate)se.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:819:3: ^( CARET ts= timedSubject ps= periodShift )
					{
					match(input,CARET,FOLLOW_CARET_in_timedExpression5718); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_timedSubject_in_timedExpression5722);
					ts=timedSubject();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_timedExpression5726);
					ps=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 820:5: -> caret(p=$ts.stcv=$ps.st)
					{
						retval.st = templateLib.getInstanceOf("caret",new STAttrMap().put("p", (ts!=null?((StringTemplate)ts.getTemplate()):null)).put("cv", (ps!=null?((StringTemplate)ps.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:822:3: ts= timedSubject
					{
					pushFollow(FOLLOW_timedSubject_in_timedExpression5756);
					ts=timedSubject();
					state._fsp--;

					// TEMPLATE REWRITE
					// 823:5: -> {$ts.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:826:1: timedSubject : (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st});
	public final UnparseBLESS3.timedSubject_return timedSubject() throws RecognitionException {
		UnparseBLESS3.timedSubject_return retval = new UnparseBLESS3.timedSubject_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ce =null;
		TreeRuleReturnScope ps =null;
		TreeRuleReturnScope rt =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:827:3: (ce= conditionalExpression -> {$ce.st}|ps= parenthesizedSubexpression -> {$ps.st}|rt= recordTerm -> {$rt.st}|inv= invocation -> {$inv.st}|v= value -> {$v.st})
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
					else if ( (LA65_5==AADL_STRING_LITERAL||(LA65_5 >= AL && LA65_5 <= AM)||LA65_5==AT_SIGN||LA65_5==CARET||LA65_5==DIVIDE||LA65_5==EQ||LA65_5==EXP||LA65_5==GT||LA65_5==ID||LA65_5==INVOKE||(LA65_5 >= LITERAL_abs && LA65_5 <= LITERAL_and)||LA65_5==LITERAL_case||LA65_5==LITERAL_div||LA65_5==LITERAL_else||LA65_5==LITERAL_exists||LA65_5==LITERAL_false||(LA65_5 >= LITERAL_iff && LA65_5 <= LITERAL_in)||LA65_5==LITERAL_mod||(LA65_5 >= LITERAL_not && LA65_5 <= LITERAL_numberof)||LA65_5==LITERAL_or||LA65_5==LITERAL_product||LA65_5==LITERAL_rem||LA65_5==LITERAL_round||LA65_5==LITERAL_sum||LA65_5==LITERAL_then||LA65_5==LITERAL_timeout||LA65_5==LITERAL_tops||(LA65_5 >= LITERAL_true && LA65_5 <= LITERAL_truncate)||(LA65_5 >= LITERAL_xor && LA65_5 <= LT)||LA65_5==MINUS||LA65_5==NEQ||LA65_5==OLD_NEQ||LA65_5==PLUS||LA65_5==PLUS_EQUALS||(LA65_5 >= QUANTITY && LA65_5 <= QUESTION)||LA65_5==RECORD_TERM||LA65_5==TICK||LA65_5==TIMES||LA65_5==UNARY_MINUS) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:828:3: ce= conditionalExpression
					{
					pushFollow(FOLLOW_conditionalExpression_in_timedSubject5783);
					ce=conditionalExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 829:4: -> {$ce.st}
					{
						retval.st = (ce!=null?((StringTemplate)ce.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:830:5: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_timedSubject5798);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 831:5: -> {$ps.st}
					{
						retval.st = (ps!=null?((StringTemplate)ps.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:832:5: rt= recordTerm
					{
					pushFollow(FOLLOW_recordTerm_in_timedSubject5815);
					rt=recordTerm();
					state._fsp--;

					// TEMPLATE REWRITE
					// 833:5: -> {$rt.st}
					{
						retval.st = (rt!=null?((StringTemplate)rt.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:834:5: inv= invocation
					{
					pushFollow(FOLLOW_invocation_in_timedSubject5831);
					inv=invocation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 835:5: -> {$inv.st}
					{
						retval.st = (inv!=null?((StringTemplate)inv.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:836:5: v= value
					{
					pushFollow(FOLLOW_value_in_timedSubject5849);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 837:5: -> {$v.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:840:1: periodShift : ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st));
	public final UnparseBLESS3.periodShift_return periodShift() throws RecognitionException {
		UnparseBLESS3.periodShift_return retval = new UnparseBLESS3.periodShift_return();
		retval.start = input.LT(1);

		BAST um=null;
		TreeRuleReturnScope v =null;
		TreeRuleReturnScope ie =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:841:3: ( ^(um= UNARY_MINUS v= value ) -> unary(sym=$um.textex=$v.st)| ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) ) -> unary_paren(sym=$um.textex=$v.st)|v= value -> {$v.st}| ^( LPAREN ie= indexExpression RPAREN ) -> parentheses(be=$ie.st))
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
					else if ( (LA66_4==AADL_STRING_LITERAL||LA66_4==ID||LA66_4==LITERAL_false||(LA66_4 >= LITERAL_now && LA66_4 <= LITERAL_null)||LA66_4==LITERAL_timeout||LA66_4==LITERAL_tops||LA66_4==LITERAL_true||(LA66_4 >= QUANTITY && LA66_4 <= QUESTION)||LA66_4==TICK) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:842:3: ^(um= UNARY_MINUS v= value )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5878); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_value_in_periodShift5882);
					v=value();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 843:5: -> unary(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:845:3: ^(um= UNARY_MINUS ^( LPAREN ie= indexExpression RPAREN ) )
					{
					um=(BAST)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_periodShift5914); 
					match(input, Token.DOWN, null); 
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5918); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5922);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5924); 
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 846:5: -> unary_paren(sym=$um.textex=$v.st)
					{
						retval.st = templateLib.getInstanceOf("unary_paren",new STAttrMap().put("sym", (um!=null?um.getText():null)).put("ex", (v!=null?((StringTemplate)v.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:848:3: v= value
					{
					pushFollow(FOLLOW_value_in_periodShift5956);
					v=value();
					state._fsp--;

					// TEMPLATE REWRITE
					// 849:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:851:3: ^( LPAREN ie= indexExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_periodShift5974); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_periodShift5978);
					ie=indexExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_periodShift5980); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 852:5: -> parentheses(be=$ie.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:855:1: indexExpression : ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps)|l= periodShift -> {$l.st});
	public final UnparseBLESS3.indexExpression_return indexExpression() throws RecognitionException {
		UnparseBLESS3.indexExpression_return retval = new UnparseBLESS3.indexExpression_return();
		retval.start = input.LT(1);

		BAST m=null;
		List<Object> list_ps=null;
		TreeRuleReturnScope l =null;
		TreeRuleReturnScope r =null;
		RuleReturnScope ps = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:856:3: ( ^(m= MINUS l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> / <r>\"| ^(m= LITERAL_div l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> div <r>\"| ^(m= LITERAL_mod l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> mod <r>\"| ^(m= LITERAL_rem l= periodShift r= periodShift ) -> template(l=$l.str=$r.st) \"<l> rem <r>\"| ^( PLUS (ps+= periodShift )+ ) -> add(terms=$ps)| ^( TIMES (ps+= periodShift )+ ) -> multiply(terms=$ps)|l= periodShift -> {$l.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:857:3: ^(m= MINUS l= periodShift r= periodShift )
					{
					m=(BAST)match(input,MINUS,FOLLOW_MINUS_in_indexExpression6016); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6020);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6024);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 858:5: -> template(l=$l.str=$r.st) \"<l> / <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> / <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:860:3: ^(m= LITERAL_div l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_div,FOLLOW_LITERAL_div_in_indexExpression6058); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6062);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6066);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 861:5: -> template(l=$l.str=$r.st) \"<l> div <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> div <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:863:3: ^(m= LITERAL_mod l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_mod,FOLLOW_LITERAL_mod_in_indexExpression6100); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6104);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6108);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 864:5: -> template(l=$l.str=$r.st) \"<l> mod <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> mod <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:866:3: ^(m= LITERAL_rem l= periodShift r= periodShift )
					{
					m=(BAST)match(input,LITERAL_rem,FOLLOW_LITERAL_rem_in_indexExpression6142); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_periodShift_in_indexExpression6146);
					l=periodShift();
					state._fsp--;

					pushFollow(FOLLOW_periodShift_in_indexExpression6150);
					r=periodShift();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 867:5: -> template(l=$l.str=$r.st) \"<l> rem <r>\"
					{
						retval.st = new StringTemplate(templateLib, "<l> rem <r>",new STAttrMap().put("l", (l!=null?((StringTemplate)l.getTemplate()):null)).put("r", (r!=null?((StringTemplate)r.getTemplate()):null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:869:3: ^( PLUS (ps+= periodShift )+ )
					{
					match(input,PLUS,FOLLOW_PLUS_in_indexExpression6182); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:869:13: (ps+= periodShift )+
					int cnt67=0;
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==AADL_STRING_LITERAL||LA67_0==ID||LA67_0==LITERAL_false||(LA67_0 >= LITERAL_now && LA67_0 <= LITERAL_null)||LA67_0==LITERAL_timeout||LA67_0==LITERAL_tops||LA67_0==LITERAL_true||LA67_0==LPAREN||(LA67_0 >= QUANTITY && LA67_0 <= QUESTION)||LA67_0==TICK||LA67_0==UNARY_MINUS) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:869:13: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression6186);
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
					// 870:5: -> add(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("add",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:3: ^( TIMES (ps+= periodShift )+ )
					{
					match(input,TIMES,FOLLOW_TIMES_in_indexExpression6212); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:14: (ps+= periodShift )+
					int cnt68=0;
					loop68:
					while (true) {
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==AADL_STRING_LITERAL||LA68_0==ID||LA68_0==LITERAL_false||(LA68_0 >= LITERAL_now && LA68_0 <= LITERAL_null)||LA68_0==LITERAL_timeout||LA68_0==LITERAL_tops||LA68_0==LITERAL_true||LA68_0==LPAREN||(LA68_0 >= QUANTITY && LA68_0 <= QUESTION)||LA68_0==TICK||LA68_0==UNARY_MINUS) ) {
							alt68=1;
						}

						switch (alt68) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:872:14: ps+= periodShift
							{
							pushFollow(FOLLOW_periodShift_in_indexExpression6216);
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
					// 873:5: -> multiply(terms=$ps)
					{
						retval.st = templateLib.getInstanceOf("multiply",new STAttrMap().put("terms", list_ps));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:875:3: l= periodShift
					{
					pushFollow(FOLLOW_periodShift_in_indexExpression6243);
					l=periodShift();
					state._fsp--;

					// TEMPLATE REWRITE
					// 876:5: -> {$l.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:879:1: conditionalExpression : ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st);
	public final UnparseBLESS3.conditionalExpression_return conditionalExpression() throws RecognitionException {
		UnparseBLESS3.conditionalExpression_return retval = new UnparseBLESS3.conditionalExpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pred =null;
		TreeRuleReturnScope t =null;
		TreeRuleReturnScope f =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:880:3: ( ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN ) -> conditional_expression(be=$pred.stt=$t.stf=$f.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:881:3: ^( LPAREN ^( QQ pred= expression t= expression f= expression ) RPAREN )
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_conditionalExpression6270); 
			match(input, Token.DOWN, null); 
			match(input,QQ,FOLLOW_QQ_in_conditionalExpression6274); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_conditionalExpression6278);
			pred=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression6282);
			t=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_conditionalExpression6286);
			f=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,RPAREN,FOLLOW_RPAREN_in_conditionalExpression6291); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 882:5: -> conditional_expression(be=$pred.stt=$t.stf=$f.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:885:1: parenthesizedSubexpression : ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st));
	public final UnparseBLESS3.parenthesizedSubexpression_return parenthesizedSubexpression() throws RecognitionException {
		UnparseBLESS3.parenthesizedSubexpression_return retval = new UnparseBLESS3.parenthesizedSubexpression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ex =null;
		TreeRuleReturnScope ce =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:886:3: ( ^( LPAREN ex= expression RPAREN ) -> parentheses(be=$ex.st)| ^( LPAREN ce= caseExpression RPAREN ) -> parentheses(be=$ce.st))
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==LPAREN) ) {
				int LA70_1 = input.LA(2);
				if ( (LA70_1==DOWN) ) {
					int LA70_2 = input.LA(3);
					if ( (LA70_2==AADL_STRING_LITERAL||(LA70_2 >= AL && LA70_2 <= AM)||LA70_2==AT_SIGN||LA70_2==CARET||LA70_2==DIVIDE||LA70_2==EQ||LA70_2==EXP||LA70_2==GT||LA70_2==ID||LA70_2==INVOKE||(LA70_2 >= LITERAL_abs && LA70_2 <= LITERAL_and)||LA70_2==LITERAL_div||LA70_2==LITERAL_else||LA70_2==LITERAL_exists||LA70_2==LITERAL_false||(LA70_2 >= LITERAL_iff && LA70_2 <= LITERAL_in)||LA70_2==LITERAL_mod||(LA70_2 >= LITERAL_not && LA70_2 <= LITERAL_numberof)||LA70_2==LITERAL_or||LA70_2==LITERAL_product||LA70_2==LITERAL_rem||LA70_2==LITERAL_round||LA70_2==LITERAL_sum||LA70_2==LITERAL_then||LA70_2==LITERAL_timeout||LA70_2==LITERAL_tops||(LA70_2 >= LITERAL_true && LA70_2 <= LITERAL_truncate)||(LA70_2 >= LITERAL_xor && LA70_2 <= LT)||LA70_2==MINUS||LA70_2==NEQ||LA70_2==OLD_NEQ||LA70_2==PLUS||LA70_2==PLUS_EQUALS||(LA70_2 >= QUANTITY && LA70_2 <= QUESTION)||LA70_2==RECORD_TERM||LA70_2==TICK||LA70_2==TIMES||LA70_2==UNARY_MINUS) ) {
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:887:3: ^( LPAREN ex= expression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6337); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_parenthesizedSubexpression6341);
					ex=expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6343); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 888:5: -> parentheses(be=$ex.st)
					{
						retval.st = templateLib.getInstanceOf("parentheses",new STAttrMap().put("be", (ex!=null?((StringTemplate)ex.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:893:3: ^( LPAREN ce= caseExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_parenthesizedSubexpression6372); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_caseExpression_in_parenthesizedSubexpression6376);
					ce=caseExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_parenthesizedSubexpression6378); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 894:5: -> parentheses(be=$ce.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:897:1: caseExpression : ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc);
	public final UnparseBLESS3.caseExpression_return caseExpression() throws RecognitionException {
		UnparseBLESS3.caseExpression_return retval = new UnparseBLESS3.caseExpression_return();
		retval.start = input.LT(1);

		List<Object> list_cc=null;
		RuleReturnScope cc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:898:3: ( ^( LITERAL_case (cc+= caseChoice )+ ) -> case_expression(cc=$cc))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:899:3: ^( LITERAL_case (cc+= caseChoice )+ )
			{
			match(input,LITERAL_case,FOLLOW_LITERAL_case_in_caseExpression6412); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:899:21: (cc+= caseChoice )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:899:21: cc+= caseChoice
					{
					pushFollow(FOLLOW_caseChoice_in_caseExpression6416);
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
			// 900:5: -> case_expression(cc=$cc)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:903:1: caseChoice : ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st);
	public final UnparseBLESS3.caseChoice_return caseChoice() throws RecognitionException {
		UnparseBLESS3.caseChoice_return retval = new UnparseBLESS3.caseChoice_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope bool =null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:904:3: ( ^( IMP bool= expression exp= expression ) -> case_choice(be=$bool.stexp=$exp.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:905:3: ^( IMP bool= expression exp= expression )
			{
			match(input,IMP,FOLLOW_IMP_in_caseChoice6449); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_caseChoice6453);
			bool=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_caseChoice6457);
			exp=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 906:5: -> case_choice(be=$bool.stexp=$exp.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:909:1: recordTerm : ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv);
	public final UnparseBLESS3.recordTerm_return recordTerm() throws RecognitionException {
		UnparseBLESS3.recordTerm_return retval = new UnparseBLESS3.recordTerm_return();
		retval.start = input.LT(1);

		BAST typeid=null;
		List<Object> list_prv=null;
		RuleReturnScope prv = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:910:3: ( ^( RECORD_TERM typeid= ID (prv+= recordValue )+ ) -> record_term(typeid=$typeid.textprv=$prv))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:3: ^( RECORD_TERM typeid= ID (prv+= recordValue )+ )
			{
			match(input,RECORD_TERM,FOLLOW_RECORD_TERM_in_recordTerm6498); 
			match(input, Token.DOWN, null); 
			typeid=(BAST)match(input,ID,FOLLOW_ID_in_recordTerm6502); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:31: (prv+= recordValue )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:911:31: prv+= recordValue
					{
					pushFollow(FOLLOW_recordValue_in_recordTerm6506);
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
			// 912:5: -> record_term(typeid=$typeid.textprv=$prv)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:915:1: recordValue : ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st);
	public final UnparseBLESS3.recordValue_return recordValue() throws RecognitionException {
		UnparseBLESS3.recordValue_return retval = new UnparseBLESS3.recordValue_return();
		retval.start = input.LT(1);

		BAST field=null;
		TreeRuleReturnScope v =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:916:3: ( ^( ARROW field= ID v= value ) -> record_value(id=$field.textv=$v.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:917:3: ^( ARROW field= ID v= value )
			{
			match(input,ARROW,FOLLOW_ARROW_in_recordValue6545); 
			match(input, Token.DOWN, null); 
			field=(BAST)match(input,ID,FOLLOW_ID_in_recordValue6549); 
			pushFollow(FOLLOW_value_in_recordValue6553);
			v=value();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 918:5: -> record_value(id=$field.textv=$v.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:921:1: predicate : exp= expression -> {$exp.st};
	public final UnparseBLESS3.predicate_return predicate() throws RecognitionException {
		UnparseBLESS3.predicate_return retval = new UnparseBLESS3.predicate_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:922:3: (exp= expression -> {$exp.st})
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:923:3: exp= expression
			{
			pushFollow(FOLLOW_expression_in_predicate6592);
			exp=expression();
			state._fsp--;

			// TEMPLATE REWRITE
			// 924:5: -> {$exp.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:929:1: value : (vn= valueName -> {$vn.st}|ev= enumerationValue -> {$ev.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:930:3: (vn= valueName -> {$vn.st}|ev= enumerationValue -> {$ev.st}|c= constant -> {$c.st}|to= LITERAL_timeout -> {%{$to.text}}|n= LITERAL_now -> {%{$n.text}}|t= LITERAL_tops -> {%{$t.text}})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:931:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_value6621);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 932:5: -> {$vn.st}
					{
						retval.st = (vn!=null?((StringTemplate)vn.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:934:3: ev= enumerationValue
					{
					pushFollow(FOLLOW_enumerationValue_in_value6639);
					ev=enumerationValue();
					state._fsp--;

					// TEMPLATE REWRITE
					// 935:5: -> {$ev.st}
					{
						retval.st = (ev!=null?((StringTemplate)ev.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:937:3: c= constant
					{
					pushFollow(FOLLOW_constant_in_value6657);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 938:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:940:3: to= LITERAL_timeout
					{
					to=(BAST)match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_value6675); 
					// TEMPLATE REWRITE
					// 941:5: -> {%{$to.text}}
					{
						retval.st = new StringTemplate(templateLib,(to!=null?to.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:943:3: n= LITERAL_now
					{
					n=(BAST)match(input,LITERAL_now,FOLLOW_LITERAL_now_in_value6693); 
					// TEMPLATE REWRITE
					// 944:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:946:3: t= LITERAL_tops
					{
					t=(BAST)match(input,LITERAL_tops,FOLLOW_LITERAL_tops_in_value6711); 
					// TEMPLATE REWRITE
					// 947:5: -> {%{$t.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:950:1: valueName : ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:951:3: ( ^(id= ID DOLLAR pr= functionParameters ) -> function_call(f=$id.textpl=$pr.st)| ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) ) -> name(id=$id.textindex=$array_indexrec=$pn)| ^(id= ID ^( DOT (pn+= partialName )+ ) ) -> name(id=$id.textrec=$pn)| ^(q= QUESTION id= ID ) -> template(id=$id.text) \"<id>?\"| ^( TICK id= ID LITERAL_fresh ) -> port_fresh(id=$id.text)| ^( TICK id= ID LITERAL_count ) -> port_count(id=$id.text)| ^( TICK id= ID LITERAL_updated ) -> port_updated(id=$id.text)|id= ID -> {%{$id.text}})
			int alt77=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA77_1 = input.LA(2);
				if ( (LA77_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case DOLLAR:
						{
						alt77=1;
						}
						break;
					case LBRACKET:
						{
						alt77=2;
						}
						break;
					case DOT:
						{
						alt77=3;
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
				else if ( ((LA77_1 >= UP && LA77_1 <= AADL_STRING_LITERAL)||LA77_1==ACTION||(LA77_1 >= AL && LA77_1 <= AM)||LA77_1==AT_SIGN||(LA77_1 >= CARET && LA77_1 <= COLON)||(LA77_1 >= COMMACOMMA && LA77_1 <= COMMADOT)||LA77_1==DIVIDE||(LA77_1 >= DOTCOMMA && LA77_1 <= DOTDOT)||LA77_1==EQ||LA77_1==EXP||LA77_1==GT||LA77_1==ID||(LA77_1 >= INVARIANT && LA77_1 <= INVOKE)||(LA77_1 >= LITERAL_abs && LA77_1 <= LITERAL_any)||LA77_1==LITERAL_div||LA77_1==LITERAL_else||LA77_1==LITERAL_exists||LA77_1==LITERAL_false||(LA77_1 >= LITERAL_iff && LA77_1 <= LITERAL_in)||LA77_1==LITERAL_mod||(LA77_1 >= LITERAL_not && LA77_1 <= LITERAL_numberof)||LA77_1==LITERAL_or||LA77_1==LITERAL_product||LA77_1==LITERAL_rem||(LA77_1 >= LITERAL_round && LA77_1 <= LITERAL_scalar)||LA77_1==LITERAL_sum||LA77_1==LITERAL_then||LA77_1==LITERAL_timeout||LA77_1==LITERAL_tops||(LA77_1 >= LITERAL_true && LA77_1 <= LITERAL_truncate)||LA77_1==LITERAL_whole||(LA77_1 >= LITERAL_xor && LA77_1 <= LT)||LA77_1==MINUS||LA77_1==NEQ||LA77_1==OLD_NEQ||LA77_1==PLUS||LA77_1==PLUS_EQUALS||(LA77_1 >= QUANTITY && LA77_1 <= QUESTION)||LA77_1==RECORD_TERM||LA77_1==RPAREN||LA77_1==TICK||LA77_1==TIMES||LA77_1==UNARY_MINUS) ) {
					alt77=8;
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
				alt77=4;
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
							alt77=5;
							}
							break;
						case LITERAL_count:
							{
							alt77=6;
							}
							break;
						case LITERAL_updated:
							{
							alt77=7;
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:952:3: ^(id= ID DOLLAR pr= functionParameters )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6738); 
					match(input, Token.DOWN, null); 
					match(input,DOLLAR,FOLLOW_DOLLAR_in_valueName6740); 
					pushFollow(FOLLOW_functionParameters_in_valueName6744);
					pr=functionParameters();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 953:5: -> function_call(f=$id.textpl=$pr.st)
					{
						retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (pr!=null?((StringTemplate)pr.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:3: ^(id= ID ^( LBRACKET (array_index+= indexExpressionOrRange )+ ) ^( DOT (pn+= partialName )* ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6776); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_valueName6780); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:35: (array_index+= indexExpressionOrRange )+
					int cnt74=0;
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==AADL_STRING_LITERAL||LA74_0==DOTDOT||LA74_0==ID||LA74_0==LITERAL_div||LA74_0==LITERAL_false||LA74_0==LITERAL_mod||(LA74_0 >= LITERAL_now && LA74_0 <= LITERAL_null)||LA74_0==LITERAL_rem||LA74_0==LITERAL_timeout||LA74_0==LITERAL_tops||LA74_0==LITERAL_true||LA74_0==LPAREN||LA74_0==MINUS||LA74_0==PLUS||(LA74_0 >= QUANTITY && LA74_0 <= QUESTION)||LA74_0==TICK||LA74_0==TIMES||LA74_0==UNARY_MINUS) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:35: array_index+= indexExpressionOrRange
							{
							pushFollow(FOLLOW_indexExpressionOrRange_in_valueName6784);
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

					match(input,DOT,FOLLOW_DOT_in_valueName6791); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:72: (pn+= partialName )*
						loop75:
						while (true) {
							int alt75=2;
							int LA75_0 = input.LA(1);
							if ( (LA75_0==ID) ) {
								alt75=1;
							}

							switch (alt75) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:955:72: pn+= partialName
								{
								pushFollow(FOLLOW_partialName_in_valueName6795);
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
					// 956:5: -> name(id=$id.textindex=$array_indexrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("index", list_array_index).put("rec", list_pn));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:958:3: ^(id= ID ^( DOT (pn+= partialName )+ ) )
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6836); 
					match(input, Token.DOWN, null); 
					match(input,DOT,FOLLOW_DOT_in_valueName6840); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:958:21: (pn+= partialName )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:958:21: pn+= partialName
							{
							pushFollow(FOLLOW_partialName_in_valueName6844);
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
					// 959:5: -> name(id=$id.textrec=$pn)
					{
						retval.st = templateLib.getInstanceOf("name",new STAttrMap().put("id", (id!=null?id.getText():null)).put("rec", list_pn));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:961:3: ^(q= QUESTION id= ID )
					{
					q=(BAST)match(input,QUESTION,FOLLOW_QUESTION_in_valueName6880); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6884); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 962:5: -> template(id=$id.text) \"<id>?\"
					{
						retval.st = new StringTemplate(templateLib, "<id>?",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:964:3: ^( TICK id= ID LITERAL_fresh )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6911); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6915); 
					match(input,LITERAL_fresh,FOLLOW_LITERAL_fresh_in_valueName6917); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 965:5: -> port_fresh(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_fresh",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:967:3: ^( TICK id= ID LITERAL_count )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6942); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6946); 
					match(input,LITERAL_count,FOLLOW_LITERAL_count_in_valueName6948); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 968:5: -> port_count(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_count",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:970:3: ^( TICK id= ID LITERAL_updated )
					{
					match(input,TICK,FOLLOW_TICK_in_valueName6973); 
					match(input, Token.DOWN, null); 
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName6977); 
					match(input,LITERAL_updated,FOLLOW_LITERAL_updated_in_valueName6979); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 971:5: -> port_updated(id=$id.text)
					{
						retval.st = templateLib.getInstanceOf("port_updated",new STAttrMap().put("id", (id!=null?id.getText():null)));
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:973:3: id= ID
					{
					id=(BAST)match(input,ID,FOLLOW_ID_in_valueName7004); 
					// TEMPLATE REWRITE
					// 974:5: -> {%{$id.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:977:1: functionParameters : ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st});
	public final UnparseBLESS3.functionParameters_return functionParameters() throws RecognitionException {
		UnparseBLESS3.functionParameters_return retval = new UnparseBLESS3.functionParameters_return();
		retval.start = input.LT(1);

		List<Object> list_parameters=null;
		TreeRuleReturnScope parameter =null;
		RuleReturnScope parameters = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:978:3: ( ^( COMMA parameters+= formalExpressionPair ) -> array_range_list(r=$parameters)|parameter= formalExpressionPair -> {$parameter.st})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:979:3: ^( COMMA parameters+= formalExpressionPair )
					{
					match(input,COMMA,FOLLOW_COMMA_in_functionParameters7029); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters7033);
					parameters=formalExpressionPair();
					state._fsp--;

					if (list_parameters==null) list_parameters=new ArrayList<Object>();
					list_parameters.add(parameters.getTemplate());
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 980:5: -> array_range_list(r=$parameters)
					{
						retval.st = templateLib.getInstanceOf("array_range_list",new STAttrMap().put("r", list_parameters));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:982:3: parameter= formalExpressionPair
					{
					pushFollow(FOLLOW_formalExpressionPair_in_functionParameters7058);
					parameter=formalExpressionPair();
					state._fsp--;

					// TEMPLATE REWRITE
					// 983:5: -> {$parameter.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:986:1: formalExpressionPair : ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st);
	public final UnparseBLESS3.formalExpressionPair_return formalExpressionPair() throws RecognitionException {
		UnparseBLESS3.formalExpressionPair_return retval = new UnparseBLESS3.formalExpressionPair_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:987:3: ( ^( COLON formal= ID actual= expression ) -> formal_actual(f=$formal.textap=$actual.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:988:3: ^( COLON formal= ID actual= expression )
			{
			match(input,COLON,FOLLOW_COLON_in_formalExpressionPair7083); 
			match(input, Token.DOWN, null); 
			formal=(BAST)match(input,ID,FOLLOW_ID_in_formalExpressionPair7087); 
			pushFollow(FOLLOW_expression_in_formalExpressionPair7091);
			actual=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 989:5: -> formal_actual(f=$formal.textap=$actual.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:992:1: indexExpressionOrRange : ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st});
	public final UnparseBLESS3.indexExpressionOrRange_return indexExpressionOrRange() throws RecognitionException {
		UnparseBLESS3.indexExpressionOrRange_return retval = new UnparseBLESS3.indexExpressionOrRange_return();
		retval.start = input.LT(1);

		BAST dd=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope index =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:993:3: ( ^(dd= DOTDOT lb= indexExpression ub= indexExpression ) -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)|index= indexExpression -> {$index.st})
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==DOTDOT) ) {
				alt79=1;
			}
			else if ( (LA79_0==AADL_STRING_LITERAL||LA79_0==ID||LA79_0==LITERAL_div||LA79_0==LITERAL_false||LA79_0==LITERAL_mod||(LA79_0 >= LITERAL_now && LA79_0 <= LITERAL_null)||LA79_0==LITERAL_rem||LA79_0==LITERAL_timeout||LA79_0==LITERAL_tops||LA79_0==LITERAL_true||LA79_0==LPAREN||LA79_0==MINUS||LA79_0==PLUS||(LA79_0 >= QUANTITY && LA79_0 <= QUESTION)||LA79_0==TICK||LA79_0==TIMES||LA79_0==UNARY_MINUS) ) {
				alt79=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:994:3: ^(dd= DOTDOT lb= indexExpression ub= indexExpression )
					{
					dd=(BAST)match(input,DOTDOT,FOLLOW_DOTDOT_in_indexExpressionOrRange7134); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange7138);
					lb=indexExpression();
					state._fsp--;

					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange7142);
					ub=indexExpression();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 995:5: -> relation(r=$dd.textlhs=$lb.strhs=$ub.st)
					{
						retval.st = templateLib.getInstanceOf("relation",new STAttrMap().put("r", (dd!=null?dd.getText():null)).put("lhs", (lb!=null?((StringTemplate)lb.getTemplate()):null)).put("rhs", (ub!=null?((StringTemplate)ub.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:997:3: index= indexExpression
					{
					pushFollow(FOLLOW_indexExpression_in_indexExpressionOrRange7177);
					index=indexExpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 998:5: -> {$index.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1001:1: partialName : ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}});
	public final UnparseBLESS3.partialName_return partialName() throws RecognitionException {
		UnparseBLESS3.partialName_return retval = new UnparseBLESS3.partialName_return();
		retval.start = input.LT(1);

		BAST record_id=null;
		List<Object> list_array_index=null;
		RuleReturnScope array_index = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1002:3: ( ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) ) -> partial_name(i=$record_id.textp=$array_index)|record_id= ID -> {%{$record_id.text}})
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1003:3: ^(record_id= ID ^( LBRACKET array_index+= indexExpressionOrRange ) )
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName7204); 
					match(input, Token.DOWN, null); 
					match(input,LBRACKET,FOLLOW_LBRACKET_in_partialName7208); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_indexExpressionOrRange_in_partialName7212);
					array_index=indexExpressionOrRange();
					state._fsp--;

					if (list_array_index==null) list_array_index=new ArrayList<Object>();
					list_array_index.add(array_index.getTemplate());
					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1004:5: -> partial_name(i=$record_id.textp=$array_index)
					{
						retval.st = templateLib.getInstanceOf("partial_name",new STAttrMap().put("i", (record_id!=null?record_id.getText():null)).put("p", list_array_index));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1006:3: record_id= ID
					{
					record_id=(BAST)match(input,ID,FOLLOW_ID_in_partialName7244); 
					// TEMPLATE REWRITE
					// 1007:5: -> {%{$record_id.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1011:1: constant : (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}});
	public final UnparseBLESS3.constant_return constant() throws RecognitionException {
		UnparseBLESS3.constant_return retval = new UnparseBLESS3.constant_return();
		retval.start = input.LT(1);

		BAST s=null;
		BAST t=null;
		BAST f=null;
		BAST n=null;
		TreeRuleReturnScope q =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1012:3: (q= quantity -> {$q.st}|s= AADL_STRING_LITERAL -> {%{$s.text}}|t= LITERAL_true -> {%{$t.text}}|f= LITERAL_false -> {%{$f.text}}|n= LITERAL_null -> {%{$n.text}})
			int alt81=5;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1013:3: q= quantity
					{
					pushFollow(FOLLOW_quantity_in_constant7271);
					q=quantity();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1014:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1016:3: s= AADL_STRING_LITERAL
					{
					s=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_constant7289); 
					// TEMPLATE REWRITE
					// 1017:5: -> {%{$s.text}}
					{
						retval.st = new StringTemplate(templateLib,(s!=null?s.getText():null));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1019:3: t= LITERAL_true
					{
					t=(BAST)match(input,LITERAL_true,FOLLOW_LITERAL_true_in_constant7307); 
					// TEMPLATE REWRITE
					// 1020:5: -> {%{$t.text}}
					{
						retval.st = new StringTemplate(templateLib,(t!=null?t.getText():null));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1022:3: f= LITERAL_false
					{
					f=(BAST)match(input,LITERAL_false,FOLLOW_LITERAL_false_in_constant7325); 
					// TEMPLATE REWRITE
					// 1023:5: -> {%{$f.text}}
					{
						retval.st = new StringTemplate(templateLib,(f!=null?f.getText():null));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1025:3: n= LITERAL_null
					{
					n=(BAST)match(input,LITERAL_null,FOLLOW_LITERAL_null_in_constant7343); 
					// TEMPLATE REWRITE
					// 1026:5: -> {%{$n.text}}
					{
						retval.st = new StringTemplate(templateLib,(n!=null?n.getText():null));
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


	public static class quantity_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "quantity"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1029:1: quantity : ( ^( QUANTITY num= aNumber ) -> {$num.st}| ^( QUANTITY num= aNumber unit= ID ) -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY num= aNumber LITERAL_scalar ) -> template(number=$num.st) \"<number> scalar\"| ^( QUANTITY num= aNumber LITERAL_whole ) -> template(number=$num.st) \"<number> whole\");
	public final UnparseBLESS3.quantity_return quantity() throws RecognitionException {
		UnparseBLESS3.quantity_return retval = new UnparseBLESS3.quantity_return();
		retval.start = input.LT(1);

		BAST unit=null;
		TreeRuleReturnScope num =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1030:3: ( ^( QUANTITY num= aNumber ) -> {$num.st}| ^( QUANTITY num= aNumber unit= ID ) -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY num= aNumber LITERAL_scalar ) -> template(number=$num.st) \"<number> scalar\"| ^( QUANTITY num= aNumber LITERAL_whole ) -> template(number=$num.st) \"<number> whole\")
			int alt82=4;
			alt82 = dfa82.predict(input);
			switch (alt82) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1031:3: ^( QUANTITY num= aNumber )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7368); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7372);
					num=aNumber();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1032:5: -> {$num.st}
					{
						retval.st = (num!=null?((StringTemplate)num.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1034:3: ^( QUANTITY num= aNumber unit= ID )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7392); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7396);
					num=aNumber();
					state._fsp--;

					unit=(BAST)match(input,ID,FOLLOW_ID_in_quantity7400); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1035:5: -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"
					{
						retval.st = new StringTemplate(templateLib, "<number> <unit>",new STAttrMap().put("number", (num!=null?((StringTemplate)num.getTemplate()):null)).put("unit", (unit!=null?unit.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1037:3: ^( QUANTITY num= aNumber LITERAL_scalar )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7432); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7436);
					num=aNumber();
					state._fsp--;

					match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_quantity7438); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1038:5: -> template(number=$num.st) \"<number> scalar\"
					{
						retval.st = new StringTemplate(templateLib, "<number> scalar",new STAttrMap().put("number", (num!=null?((StringTemplate)num.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1040:3: ^( QUANTITY num= aNumber LITERAL_whole )
					{
					match(input,QUANTITY,FOLLOW_QUANTITY_in_quantity7465); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_aNumber_in_quantity7469);
					num=aNumber();
					state._fsp--;

					match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_quantity7471); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1041:5: -> template(number=$num.st) \"<number> whole\"
					{
						retval.st = new StringTemplate(templateLib, "<number> whole",new STAttrMap().put("number", (num!=null?((StringTemplate)num.getTemplate()):null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1044:1: aNumber : (lit= NUMBER -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= propertyName -> {$propertyConstant.st});
	public final UnparseBLESS3.aNumber_return aNumber() throws RecognitionException {
		UnparseBLESS3.aNumber_return retval = new UnparseBLESS3.aNumber_return();
		retval.start = input.LT(1);

		BAST lit=null;
		TreeRuleReturnScope property =null;
		TreeRuleReturnScope propertyConstant =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1044:8: (lit= NUMBER -> {%{$lit.text}}|property= propertyReference -> {$property.st}|propertyConstant= propertyName -> {$propertyConstant.st})
			int alt83=3;
			switch ( input.LA(1) ) {
			case NUMBER:
				{
				alt83=1;
				}
				break;
			case OCTOTHORPE:
				{
				alt83=2;
				}
				break;
			case DOUBLE_COLON:
				{
				alt83=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1045:2: lit= NUMBER
					{
					lit=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_aNumber7506); 
					// TEMPLATE REWRITE
					// 1046:4: -> {%{$lit.text}}
					{
						retval.st = new StringTemplate(templateLib,(lit!=null?lit.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1047:4: property= propertyReference
					{
					pushFollow(FOLLOW_propertyReference_in_aNumber7520);
					property=propertyReference();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1048:4: -> {$property.st}
					{
						retval.st = (property!=null?((StringTemplate)property.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1049:4: propertyConstant= propertyName
					{
					pushFollow(FOLLOW_propertyName_in_aNumber7534);
					propertyConstant=propertyName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1050:4: -> {$propertyConstant.st}
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
	// $ANTLR end "aNumber"


	public static class propertyReference_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "propertyReference"
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1053:1: propertyReference : ( ^(oct= OCTOTHORPE pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.st)| ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.stf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.st)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName ) -> property_reference(component=$component.stpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ ) -> property_reference(component=$component.stpname=$pname.stf=$field));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1054:2: ( ^(oct= OCTOTHORPE pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.st)| ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.stf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.st)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName ) -> property_reference(component=$component.stpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ ) -> property_reference(component=$component.stpname=$pname.stf=$field))
			int alt87=6;
			alt87 = dfa87.predict(input);
			switch (alt87) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1056:3: ^(oct= OCTOTHORPE pname= propertyName )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7566); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7570);
					pname=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1057:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1058:5: -> property_reference(pname=$pname.st)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1060:3: ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7607); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7611);
					pname=propertyName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1060:44: (field+= propertyField )+
					int cnt84=0;
					loop84:
					while (true) {
						int alt84=2;
						int LA84_0 = input.LA(1);
						if ( (LA84_0==DOT||LA84_0==LBRACKET) ) {
							alt84=1;
						}

						switch (alt84) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1060:44: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7615);
							field=propertyField();
							state._fsp--;

							if (list_field==null) list_field=new ArrayList<Object>();
							list_field.add(field.getTemplate());
							}
							break;

						default :
							if ( cnt84 >= 1 ) break loop84;
							EarlyExitException eee = new EarlyExitException(84, input);
							throw eee;
						}
						cnt84++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1061:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(0));
					}

					else // 1062:5: -> property_reference(pname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1064:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7657); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7661); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7665);
					pname=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1065:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1066:5: -> property_reference(component=$self.textpname=$pname.st)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1068:3: ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7707); 
					match(input, Token.DOWN, null); 
					self=(BAST)match(input,LITERAL_self,FOLLOW_LITERAL_self_in_propertyReference7711); 
					pushFollow(FOLLOW_propertyName_in_propertyReference7715);
					pname=propertyName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1068:62: (field+= propertyField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1068:62: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7719);
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
					// 1069:5: -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
					if (lookUpPropertyValues) {
						retval.st = getAadlPropertyValue((BAST)oct.getChild(1));
					}

					else // 1070:5: -> property_reference(component=$self.textpname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (self!=null?self.getText():null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1072:3: ^(oct= OCTOTHORPE component= componentName pname= propertyName )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7765); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_componentName_in_propertyReference7769);
					component=componentName();
					state._fsp--;

					pushFollow(FOLLOW_propertyName_in_propertyReference7773);
					pname=propertyName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1073:5: -> property_reference(component=$component.stpname=$pname.stf=$field)
					{
						retval.st = templateLib.getInstanceOf("property_reference",new STAttrMap().put("component", (component!=null?((StringTemplate)component.getTemplate()):null)).put("pname", (pname!=null?((StringTemplate)pname.getTemplate()):null)).put("f", list_field));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1075:3: ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ )
					{
					oct=(BAST)match(input,OCTOTHORPE,FOLLOW_OCTOTHORPE_in_propertyReference7808); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_componentName_in_propertyReference7812);
					component=componentName();
					state._fsp--;

					pushFollow(FOLLOW_propertyName_in_propertyReference7816);
					pname=propertyName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1075:68: (field+= propertyField )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1075:68: field+= propertyField
							{
							pushFollow(FOLLOW_propertyField_in_propertyReference7820);
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
					// 1076:5: -> property_reference(component=$component.stpname=$pname.stf=$field)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1079:1: propertyField : ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\");
	public final UnparseBLESS3.propertyField_return propertyField() throws RecognitionException {
		UnparseBLESS3.propertyField_return retval = new UnparseBLESS3.propertyField_return();
		retval.start = input.LT(1);

		BAST index=null;
		BAST var=null;
		BAST pf=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1080:3: ( ^( LBRACKET index= NUMBER ) -> index(i=$index.text)| ^( LBRACKET var= ID ) -> index(i=$var.text)| ^( DOT pf= ID ) -> template(pf=$pf.text) \".<pf>\"| ^( DOT LITERAL_upper_bound ) -> template( \".upper_bound\"| ^( DOT LITERAL_lower_bound ) -> template( \".lower_bound\")
			int alt88=5;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==LBRACKET) ) {
				int LA88_1 = input.LA(2);
				if ( (LA88_1==DOWN) ) {
					int LA88_3 = input.LA(3);
					if ( (LA88_3==NUMBER) ) {
						alt88=1;
					}
					else if ( (LA88_3==ID) ) {
						alt88=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 88, 3, input);
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
							new NoViableAltException("", 88, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA88_0==DOT) ) {
				int LA88_2 = input.LA(2);
				if ( (LA88_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case ID:
						{
						alt88=3;
						}
						break;
					case LITERAL_upper_bound:
						{
						alt88=4;
						}
						break;
					case LITERAL_lower_bound:
						{
						alt88=5;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 88, 4, input);
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
							new NoViableAltException("", 88, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1081:3: ^( LBRACKET index= NUMBER )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7862); 
					match(input, Token.DOWN, null); 
					index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_propertyField7866); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1082:5: -> index(i=$index.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (index!=null?index.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1084:3: ^( LBRACKET var= ID )
					{
					match(input,LBRACKET,FOLLOW_LBRACKET_in_propertyField7891); 
					match(input, Token.DOWN, null); 
					var=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7895); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1085:5: -> index(i=$var.text)
					{
						retval.st = templateLib.getInstanceOf("index",new STAttrMap().put("i", (var!=null?var.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1087:3: ^( DOT pf= ID )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7920); 
					match(input, Token.DOWN, null); 
					pf=(BAST)match(input,ID,FOLLOW_ID_in_propertyField7924); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1088:5: -> template(pf=$pf.text) \".<pf>\"
					{
						retval.st = new StringTemplate(templateLib, ".<pf>",new STAttrMap().put("pf", (pf!=null?pf.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1090:3: ^( DOT LITERAL_upper_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7951); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_upper_bound,FOLLOW_LITERAL_upper_bound_in_propertyField7953); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1091:5: -> template( \".upper_bound\"
					{
						retval.st = new StringTemplate(templateLib, ".upper_bound");
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1093:3: ^( DOT LITERAL_lower_bound )
					{
					match(input,DOT,FOLLOW_DOT_in_propertyField7977); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_lower_bound,FOLLOW_LITERAL_lower_bound_in_propertyField7979); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1094:5: -> template( \".lower_bound\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1101:1: actionSubclause : ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1102:3: ( ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification ) -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:3: ^( ACTION_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (tc= throwsClause )? (ac= assertClause )? ^( LITERAL_pre (precondition= assertion )? ) ^( LITERAL_post (postcondition= assertion )? ) ^( LITERAL_invariant (invariant= assertion )? ) elq= existentialLatticeQuantification )
			{
			match(input,ACTION_SUBCLAUSE,FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause8014); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:23: (no_proof= DO_NOT_PROVE )?
			int alt89=2;
			int LA89_0 = input.LA(1);
			if ( (LA89_0==DO_NOT_PROVE) ) {
				alt89=1;
			}
			switch (alt89) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:24: no_proof= DO_NOT_PROVE
					{
					no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_actionSubclause8019); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:48: (tc= throwsClause )?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LITERAL_throws) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:49: tc= throwsClause
					{
					pushFollow(FOLLOW_throwsClause_in_actionSubclause8026);
					tc=throwsClause();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:67: (ac= assertClause )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==LITERAL_assert) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1103:68: ac= assertClause
					{
					pushFollow(FOLLOW_assertClause_in_actionSubclause8033);
					ac=assertClause();
					state._fsp--;

					}
					break;

			}

			match(input,LITERAL_pre,FOLLOW_LITERAL_pre_in_actionSubclause8044); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1104:20: (precondition= assertion )?
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==ASSERTION||(LA92_0 >= ASSERTION_ENUMERATION && LA92_0 <= ASSERTION_FUNCTION)) ) {
					alt92=1;
				}
				switch (alt92) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1104:21: precondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause8049);
						precondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_post,FOLLOW_LITERAL_post_in_actionSubclause8061); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1105:21: (postcondition= assertion )?
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==ASSERTION||(LA93_0 >= ASSERTION_ENUMERATION && LA93_0 <= ASSERTION_FUNCTION)) ) {
					alt93=1;
				}
				switch (alt93) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1105:22: postcondition= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause8066);
						postcondition=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_actionSubclause8079); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1106:26: (invariant= assertion )?
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==ASSERTION||(LA94_0 >= ASSERTION_ENUMERATION && LA94_0 <= ASSERTION_FUNCTION)) ) {
					alt94=1;
				}
				switch (alt94) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1106:27: invariant= assertion
						{
						pushFollow(FOLLOW_assertion_in_actionSubclause8084);
						invariant=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_actionSubclause8097);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1108:3: -> action_subclause(no_proof=$no_proof.texttc=$tc.stac=$ac.stpre=$precondition.stpost=$postcondition.stinv=$invariant.stelq=$elq.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1113:1: throwsClause : ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions);
	public final UnparseBLESS3.throwsClause_return throwsClause() throws RecognitionException {
		UnparseBLESS3.throwsClause_return retval = new UnparseBLESS3.throwsClause_return();
		retval.start = input.LT(1);

		BAST exceptions=null;
		List<Object> list_exceptions=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1114:3: ( ^( LITERAL_throws (exceptions+= ID )+ ) -> throws_clause(ex=$exceptions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1115:2: ^( LITERAL_throws (exceptions+= ID )+ )
			{
			match(input,LITERAL_throws,FOLLOW_LITERAL_throws_in_throwsClause8170); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1115:30: (exceptions+= ID )+
			int cnt95=0;
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==ID) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1115:30: exceptions+= ID
					{
					exceptions=(BAST)match(input,ID,FOLLOW_ID_in_throwsClause8174); 
					if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
					list_exceptions.add(exceptions);
					}
					break;

				default :
					if ( cnt95 >= 1 ) break loop95;
					EarlyExitException eee = new EarlyExitException(95, input);
					throw eee;
				}
				cnt95++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1116:4: -> throws_clause(ex=$exceptions)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1119:1: assertClause : ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions);
	public final UnparseBLESS3.assertClause_return assertClause() throws RecognitionException {
		UnparseBLESS3.assertClause_return retval = new UnparseBLESS3.assertClause_return();
		retval.start = input.LT(1);

		List<Object> list_assertions=null;
		RuleReturnScope assertions = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1120:3: ( ^( LITERAL_assert (assertions+= namedAssertion )+ ) -> assert_clause(a=$assertions))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1121:3: ^( LITERAL_assert (assertions+= namedAssertion )+ )
			{
			match(input,LITERAL_assert,FOLLOW_LITERAL_assert_in_assertClause8207); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1121:31: (assertions+= namedAssertion )+
			int cnt96=0;
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==ASSERTION||(LA96_0 >= ASSERTION_ENUMERATION && LA96_0 <= ASSERTION_FUNCTION)) ) {
					alt96=1;
				}

				switch (alt96) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1121:31: assertions+= namedAssertion
					{
					pushFollow(FOLLOW_namedAssertion_in_assertClause8211);
					assertions=namedAssertion();
					state._fsp--;

					if (list_assertions==null) list_assertions=new ArrayList<Object>();
					list_assertions.add(assertions.getTemplate());
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
			// 1122:5: -> assert_clause(a=$assertions)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1125:1: existentialLatticeQuantification : ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st);
	public final UnparseBLESS3.existentialLatticeQuantification_return existentialLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.existentialLatticeQuantification_return retval = new UnparseBLESS3.existentialLatticeQuantification_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope qv =null;
		TreeRuleReturnScope actions =null;
		TreeRuleReturnScope cc =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1126:3: ( ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? ) -> elq(v=$qv.stba=$actions.stcc=$cc.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:3: ^( LCURLY (qv= quantifiedVariables )? actions= behaviorActions RCURLY (cc= catchClause )? )
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_existentialLatticeQuantification8244); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:13: (qv= quantifiedVariables )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==LITERAL_declare) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:15: qv= quantifiedVariables
					{
					pushFollow(FOLLOW_quantifiedVariables_in_existentialLatticeQuantification8250);
					qv=quantifiedVariables();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_behaviorActions_in_existentialLatticeQuantification8257);
			actions=behaviorActions();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_existentialLatticeQuantification8259); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:72: (cc= catchClause )?
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==LITERAL_catch) ) {
				alt98=1;
			}
			switch (alt98) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1127:74: cc= catchClause
					{
					pushFollow(FOLLOW_catchClause_in_existentialLatticeQuantification8265);
					cc=catchClause();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1128:5: -> elq(v=$qv.stba=$actions.stcc=$cc.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1131:1: quantifiedVariables : ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs);
	public final UnparseBLESS3.quantifiedVariables_return quantifiedVariables() throws RecognitionException {
		UnparseBLESS3.quantifiedVariables_return retval = new UnparseBLESS3.quantifiedVariables_return();
		retval.start = input.LT(1);

		List<Object> list_decs=null;
		RuleReturnScope decs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1132:3: ( ^( LITERAL_declare (decs+= variableDeclaration )+ ) -> quantified_variables(bv=$decs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1133:3: ^( LITERAL_declare (decs+= variableDeclaration )+ )
			{
			match(input,LITERAL_declare,FOLLOW_LITERAL_declare_in_quantifiedVariables8310); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1133:26: (decs+= variableDeclaration )+
			int cnt99=0;
			loop99:
			while (true) {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( (LA99_0==VARIABLE_DECLARATION) ) {
					alt99=1;
				}

				switch (alt99) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1133:26: decs+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_quantifiedVariables8314);
					decs=variableDeclaration();
					state._fsp--;

					if (list_decs==null) list_decs=new ArrayList<Object>();
					list_decs.add(decs.getTemplate());
					}
					break;

				default :
					if ( cnt99 >= 1 ) break loop99;
					EarlyExitException eee = new EarlyExitException(99, input);
					throw eee;
				}
				cnt99++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1134:5: -> quantified_variables(bv=$decs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1137:1: variableDeclaration : ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1138:3: ( ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? ) -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:3: ^( VARIABLE_DECLARATION v= variable ( ^( ASSIGN exp= expression ) )? (a= assertion )? (nv= LITERAL_nonvolatile )? (sh= LITERAL_shared )? (c= LITERAL_constant )? (sp= LITERAL_spread )? (f= LITERAL_final )? )
			{
			match(input,VARIABLE_DECLARATION,FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration8346); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variable_in_variableDeclaration8350);
			v=variable();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:38: ( ^( ASSIGN exp= expression ) )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==ASSIGN) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:40: ^( ASSIGN exp= expression )
					{
					match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration8356); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expression_in_variableDeclaration8360);
					exp=expression();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:71: (a= assertion )?
			int alt101=2;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==ASSERTION||(LA101_0 >= ASSERTION_ENUMERATION && LA101_0 <= ASSERTION_FUNCTION)) ) {
				alt101=1;
			}
			switch (alt101) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1139:71: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_variableDeclaration8369);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:7: (nv= LITERAL_nonvolatile )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==LITERAL_nonvolatile) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:7: nv= LITERAL_nonvolatile
					{
					nv=(BAST)match(input,LITERAL_nonvolatile,FOLLOW_LITERAL_nonvolatile_in_variableDeclaration8379); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:31: (sh= LITERAL_shared )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==LITERAL_shared) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:31: sh= LITERAL_shared
					{
					sh=(BAST)match(input,LITERAL_shared,FOLLOW_LITERAL_shared_in_variableDeclaration8384); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:49: (c= LITERAL_constant )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==LITERAL_constant) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:49: c= LITERAL_constant
					{
					c=(BAST)match(input,LITERAL_constant,FOLLOW_LITERAL_constant_in_variableDeclaration8389); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:70: (sp= LITERAL_spread )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==LITERAL_spread) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:70: sp= LITERAL_spread
					{
					sp=(BAST)match(input,LITERAL_spread,FOLLOW_LITERAL_spread_in_variableDeclaration8394); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:88: (f= LITERAL_final )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==LITERAL_final) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1140:88: f= LITERAL_final
					{
					f=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_variableDeclaration8399); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1141:5: -> variable_declaration(v=$v.stexp=$exp.sta=$a.stnv=$nv.textsh=$sh.textc=$c.textsp=$sp.textf=$f.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1144:1: catchClause : ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct);
	public final UnparseBLESS3.catchClause_return catchClause() throws RecognitionException {
		UnparseBLESS3.catchClause_return retval = new UnparseBLESS3.catchClause_return();
		retval.start = input.LT(1);

		List<Object> list_cct=null;
		RuleReturnScope cct = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1145:3: ( ^( LITERAL_catch (cct+= catchClauseTerm )+ ) -> catch_clause(cct=$cct))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:2: ^( LITERAL_catch (cct+= catchClauseTerm )+ )
			{
			match(input,LITERAL_catch,FOLLOW_LITERAL_catch_in_catchClause8459); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:22: (cct+= catchClauseTerm )+
			int cnt107=0;
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==LPAREN) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1146:22: cct+= catchClauseTerm
					{
					pushFollow(FOLLOW_catchClauseTerm_in_catchClause8463);
					cct=catchClauseTerm();
					state._fsp--;

					if (list_cct==null) list_cct=new ArrayList<Object>();
					list_cct.add(cct.getTemplate());
					}
					break;

				default :
					if ( cnt107 >= 1 ) break loop107;
					EarlyExitException eee = new EarlyExitException(107, input);
					throw eee;
				}
				cnt107++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1147:4: -> catch_clause(cct=$cct)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1150:1: catchClauseTerm : ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st));
	public final UnparseBLESS3.catchClauseTerm_return catchClauseTerm() throws RecognitionException {
		UnparseBLESS3.catchClauseTerm_return retval = new UnparseBLESS3.catchClauseTerm_return();
		retval.start = input.LT(1);

		BAST colon=null;
		BAST exceptions=null;
		List<Object> list_exceptions=null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1151:3: ( ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN ) -> catch_clause_term(ei=$exceptionsba=$act.st)| ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN ) -> catch_clause_term_all(ba=$act.st))
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==LPAREN) ) {
				int LA109_1 = input.LA(2);
				if ( (LA109_1==DOWN) ) {
					int LA109_2 = input.LA(3);
					if ( (LA109_2==LITERAL_all) ) {
						alt109=2;
					}
					else if ( (LA109_2==ID) ) {
						alt109=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 109, 2, input);
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
							new NoViableAltException("", 109, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:3: ^( LPAREN (exceptions+= ID )+ colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8495); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:23: (exceptions+= ID )+
					int cnt108=0;
					loop108:
					while (true) {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==ID) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1152:23: exceptions+= ID
							{
							exceptions=(BAST)match(input,ID,FOLLOW_ID_in_catchClauseTerm8499); 
							if (list_exceptions==null) list_exceptions=new ArrayList<Object>();
							list_exceptions.add(exceptions);
							}
							break;

						default :
							if ( cnt108 >= 1 ) break loop108;
							EarlyExitException eee = new EarlyExitException(108, input);
							throw eee;
						}
						cnt108++;
					}

					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8505); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8509);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8511); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1153:5: -> catch_clause_term(ei=$exceptionsba=$act.st)
					{
						retval.st = templateLib.getInstanceOf("catch_clause_term",new STAttrMap().put("ei", list_exceptions).put("ba", (act!=null?((StringTemplate)act.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1155:3: ^( LPAREN LITERAL_all colon= COLON act= basicAction RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_catchClauseTerm8541); 
					match(input, Token.DOWN, null); 
					match(input,LITERAL_all,FOLLOW_LITERAL_all_in_catchClauseTerm8543); 
					colon=(BAST)match(input,COLON,FOLLOW_COLON_in_catchClauseTerm8547); 
					pushFollow(FOLLOW_basicAction_in_catchClauseTerm8551);
					act=basicAction();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_catchClauseTerm8553); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1156:5: -> catch_clause_term_all(ba=$act.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1159:1: behaviorActions : ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st});
	public final UnparseBLESS3.behaviorActions_return behaviorActions() throws RecognitionException {
		UnparseBLESS3.behaviorActions_return retval = new UnparseBLESS3.behaviorActions_return();
		retval.start = input.LT(1);

		List<Object> list_aa=null;
		TreeRuleReturnScope a =null;
		RuleReturnScope aa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1160:3: ( ^( SEMICOLON (aa+= assertedAction )+ ) -> sequential_composition(f=$aa)| ^( AMPERSAND (aa+= assertedAction )+ ) -> concurrent_composition(g=$aa)|a= assertedAction -> {$a.st})
			int alt112=3;
			switch ( input.LA(1) ) {
			case SEMICOLON:
				{
				alt112=1;
				}
				break;
			case AMPERSAND:
				{
				alt112=2;
				}
				break;
			case ACTION:
				{
				alt112=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 112, 0, input);
				throw nvae;
			}
			switch (alt112) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:3: ^( SEMICOLON (aa+= assertedAction )+ )
					{
					match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behaviorActions8585); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:18: (aa+= assertedAction )+
					int cnt110=0;
					loop110:
					while (true) {
						int alt110=2;
						int LA110_0 = input.LA(1);
						if ( (LA110_0==ACTION) ) {
							alt110=1;
						}

						switch (alt110) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1161:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8589);
							aa=assertedAction();
							state._fsp--;

							if (list_aa==null) list_aa=new ArrayList<Object>();
							list_aa.add(aa.getTemplate());
							}
							break;

						default :
							if ( cnt110 >= 1 ) break loop110;
							EarlyExitException eee = new EarlyExitException(110, input);
							throw eee;
						}
						cnt110++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1162:5: -> sequential_composition(f=$aa)
					{
						retval.st = templateLib.getInstanceOf("sequential_composition",new STAttrMap().put("f", list_aa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1164:3: ^( AMPERSAND (aa+= assertedAction )+ )
					{
					match(input,AMPERSAND,FOLLOW_AMPERSAND_in_behaviorActions8615); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1164:18: (aa+= assertedAction )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1164:18: aa+= assertedAction
							{
							pushFollow(FOLLOW_assertedAction_in_behaviorActions8619);
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
					// 1165:5: -> concurrent_composition(g=$aa)
					{
						retval.st = templateLib.getInstanceOf("concurrent_composition",new STAttrMap().put("g", list_aa));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1167:3: a= assertedAction
					{
					pushFollow(FOLLOW_assertedAction_in_behaviorActions8645);
					a=assertedAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1168:5: -> {$a.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1171:1: assertedAction : ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st);
	public final UnparseBLESS3.assertedAction_return assertedAction() throws RecognitionException {
		UnparseBLESS3.assertedAction_return retval = new UnparseBLESS3.assertedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pre =null;
		TreeRuleReturnScope s =null;
		TreeRuleReturnScope post =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1172:3: ( ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) ) -> asserted_action(p=$pre.sts=$s.stq=$post.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1173:3: ^( ACTION ^( P (pre= assertion )? ) ^( S s= action ) ^( Q (post= assertion )? ) )
			{
			match(input,ACTION,FOLLOW_ACTION_in_assertedAction8670); 
			match(input, Token.DOWN, null); 
			match(input,P,FOLLOW_P_in_assertedAction8674); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1173:21: (pre= assertion )?
				int alt113=2;
				int LA113_0 = input.LA(1);
				if ( (LA113_0==ASSERTION||(LA113_0 >= ASSERTION_ENUMERATION && LA113_0 <= ASSERTION_FUNCTION)) ) {
					alt113=1;
				}
				switch (alt113) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1173:21: pre= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8678);
						pre=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,S,FOLLOW_S_in_assertedAction8685); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_action_in_assertedAction8689);
			s=action();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,Q,FOLLOW_Q_in_assertedAction8695); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1173:60: (post= assertion )?
				int alt114=2;
				int LA114_0 = input.LA(1);
				if ( (LA114_0==ASSERTION||(LA114_0 >= ASSERTION_ENUMERATION && LA114_0 <= ASSERTION_FUNCTION)) ) {
					alt114=1;
				}
				switch (alt114) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1173:60: post= assertion
						{
						pushFollow(FOLLOW_assertion_in_assertedAction8699);
						post=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1174:5: -> asserted_action(p=$pre.sts=$s.stq=$post.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1177:1: action : (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1177:7: (ba= basicAction -> {$ba.st}|if_fi= alternative -> {$if_fi.st}|wl= whileLoop -> {$wl.st}|fl= forLoop -> {$fl.st}|du= doUntilLoop -> {$du.st}|elq= existentialLatticeQuantification -> {$elq.st}|ulq= universalLatticeQuantification -> {$ulq.st})
			int alt115=7;
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
				alt115=1;
				}
				break;
			case LITERAL_if:
				{
				alt115=2;
				}
				break;
			case LITERAL_while:
				{
				alt115=3;
				}
				break;
			case LITERAL_for:
				{
				alt115=4;
				}
				break;
			case LITERAL_do:
				{
				alt115=5;
				}
				break;
			case LCURLY:
				{
				alt115=6;
				}
				break;
			case LITERAL_forall:
				{
				alt115=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}
			switch (alt115) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1178:3: ba= basicAction
					{
					pushFollow(FOLLOW_basicAction_in_action8741);
					ba=basicAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1179:5: -> {$ba.st}
					{
						retval.st = (ba!=null?((StringTemplate)ba.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1180:5: if_fi= alternative
					{
					pushFollow(FOLLOW_alternative_in_action8757);
					if_fi=alternative();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1181:5: -> {$if_fi.st}
					{
						retval.st = (if_fi!=null?((StringTemplate)if_fi.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1182:5: wl= whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_action8773);
					wl=whileLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1183:5: -> {$wl.st}
					{
						retval.st = (wl!=null?((StringTemplate)wl.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1184:5: fl= forLoop
					{
					pushFollow(FOLLOW_forLoop_in_action8789);
					fl=forLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1185:5: -> {$fl.st}
					{
						retval.st = (fl!=null?((StringTemplate)fl.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1186:5: du= doUntilLoop
					{
					pushFollow(FOLLOW_doUntilLoop_in_action8805);
					du=doUntilLoop();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1187:5: -> {$du.st}
					{
						retval.st = (du!=null?((StringTemplate)du.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1188:5: elq= existentialLatticeQuantification
					{
					pushFollow(FOLLOW_existentialLatticeQuantification_in_action8821);
					elq=existentialLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1189:5: -> {$elq.st}
					{
						retval.st = (elq!=null?((StringTemplate)elq.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1190:5: ulq= universalLatticeQuantification
					{
					pushFollow(FOLLOW_universalLatticeQuantification_in_action8838);
					ulq=universalLatticeQuantification();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1191:5: -> {$ulq.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1194:1: basicAction : (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| ^( LITERAL_setmode mode= ID ) -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st});
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1195:3: (sk= LITERAL_skip -> {%{$sk.text}}|ass= assignment -> {$ass.st}| ^( LITERAL_setmode mode= ID ) -> template(mode=$mode.text) \"setmode <mode>\"|wt= whenThrow -> {$wt.st}|co= combinableOperation -> {$co.st}|ca= communicationAction -> {$ca.st}|sa= simultaneousAssignment -> {$sa.st}|ie= issueException -> {$ie.st})
			int alt116=8;
			switch ( input.LA(1) ) {
			case LITERAL_skip:
				{
				alt116=1;
				}
				break;
			case ASSIGN:
				{
				int LA116_2 = input.LA(2);
				if ( (LA116_2==DOWN) ) {
					int LA116_8 = input.LA(3);
					if ( (LA116_8==COMMA) ) {
						alt116=7;
					}
					else if ( (LA116_8==ID||LA116_8==QUESTION||LA116_8==TICK) ) {
						alt116=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 116, 8, input);
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
							new NoViableAltException("", 116, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LITERAL_setmode:
				{
				alt116=3;
				}
				break;
			case LITERAL_when:
				{
				alt116=4;
				}
				break;
			case LITERAL_fetchadd:
			case LITERAL_fetchand:
			case LITERAL_fetchor:
			case LITERAL_fetchxor:
			case LITERAL_swap:
				{
				alt116=5;
				}
				break;
			case PORT_INPUT:
			case PORT_OUTPUT:
			case SUBPROGRAM_INVOCATION:
				{
				alt116=6;
				}
				break;
			case LITERAL_exception:
				{
				alt116=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 116, 0, input);
				throw nvae;
			}
			switch (alt116) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1196:3: sk= LITERAL_skip
					{
					sk=(BAST)match(input,LITERAL_skip,FOLLOW_LITERAL_skip_in_basicAction8867); 
					// TEMPLATE REWRITE
					// 1197:4: -> {%{$sk.text}}
					{
						retval.st = new StringTemplate(templateLib,(sk!=null?sk.getText():null));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1198:5: ass= assignment
					{
					pushFollow(FOLLOW_assignment_in_basicAction8883);
					ass=assignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1199:5: -> {$ass.st}
					{
						retval.st = (ass!=null?((StringTemplate)ass.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1200:5: ^( LITERAL_setmode mode= ID )
					{
					match(input,LITERAL_setmode,FOLLOW_LITERAL_setmode_in_basicAction8899); 
					match(input, Token.DOWN, null); 
					mode=(BAST)match(input,ID,FOLLOW_ID_in_basicAction8903); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1201:5: -> template(mode=$mode.text) \"setmode <mode>\"
					{
						retval.st = new StringTemplate(templateLib, "setmode <mode>",new STAttrMap().put("mode", (mode!=null?mode.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1202:5: wt= whenThrow
					{
					pushFollow(FOLLOW_whenThrow_in_basicAction8929);
					wt=whenThrow();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1203:5: -> {$wt.st}
					{
						retval.st = (wt!=null?((StringTemplate)wt.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1204:5: co= combinableOperation
					{
					pushFollow(FOLLOW_combinableOperation_in_basicAction8945);
					co=combinableOperation();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1205:5: -> {$co.st}
					{
						retval.st = (co!=null?((StringTemplate)co.getTemplate()):null);
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1206:5: ca= communicationAction
					{
					pushFollow(FOLLOW_communicationAction_in_basicAction8961);
					ca=communicationAction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1207:5: -> {$ca.st}
					{
						retval.st = (ca!=null?((StringTemplate)ca.getTemplate()):null);
					}



					}
					break;
				case 7 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1208:5: sa= simultaneousAssignment
					{
					pushFollow(FOLLOW_simultaneousAssignment_in_basicAction8978);
					sa=simultaneousAssignment();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1209:5: -> {$sa.st}
					{
						retval.st = (sa!=null?((StringTemplate)sa.getTemplate()):null);
					}



					}
					break;
				case 8 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1210:5: ie= issueException
					{
					pushFollow(FOLLOW_issueException_in_basicAction8994);
					ie=issueException();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1211:5: -> {$ie.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1214:1: issueException : ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text);
	public final UnparseBLESS3.issueException_return issueException() throws RecognitionException {
		UnparseBLESS3.issueException_return retval = new UnparseBLESS3.issueException_return();
		retval.start = input.LT(1);

		BAST exception=null;
		BAST message=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1215:3: ( ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? ) -> issue_exception(ex=$exception.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1216:3: ^( LITERAL_exception exception= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_exception,FOLLOW_LITERAL_exception_in_issueException9020); 
			match(input, Token.DOWN, null); 
			exception=(BAST)match(input,ID,FOLLOW_ID_in_issueException9024); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1216:44: (message= AADL_STRING_LITERAL )?
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==AADL_STRING_LITERAL) ) {
				alt117=1;
			}
			switch (alt117) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1216:44: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_issueException9028); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1217:5: -> issue_exception(ex=$exception.textm=$message.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1220:1: assignment : ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st);
	public final UnparseBLESS3.assignment_return assignment() throws RecognitionException {
		UnparseBLESS3.assignment_return retval = new UnparseBLESS3.assignment_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;
		TreeRuleReturnScope e =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1221:3: ( ^( ASSIGN n= nameTick e= expressionOrAny ) -> assignment(nt=$n.steort=$e.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1222:3: ^( ASSIGN n= nameTick e= expressionOrAny )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment9068); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_nameTick_in_assignment9072);
			n=nameTick();
			state._fsp--;

			pushFollow(FOLLOW_expressionOrAny_in_assignment9076);
			e=expressionOrAny();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1223:5: -> assignment(nt=$n.steort=$e.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1226:1: nameTick : ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st});
	public final UnparseBLESS3.nameTick_return nameTick() throws RecognitionException {
		UnparseBLESS3.nameTick_return retval = new UnparseBLESS3.nameTick_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1227:3: ( ^( TICK vn= valueName ) -> name_tick(vn=$vn.st)|vn= valueName -> {$vn.st})
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==TICK) ) {
				int LA118_1 = input.LA(2);
				if ( (LA118_1==DOWN) ) {
					int LA118_3 = input.LA(3);
					if ( (LA118_3==ID) ) {
						int LA118_4 = input.LA(4);
						if ( (LA118_4==LITERAL_count||LA118_4==LITERAL_fresh||LA118_4==LITERAL_updated) ) {
							alt118=2;
						}
						else if ( ((LA118_4 >= DOWN && LA118_4 <= UP)) ) {
							alt118=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 118, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA118_3==QUESTION||LA118_3==TICK) ) {
						alt118=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 118, 3, input);
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
							new NoViableAltException("", 118, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA118_0==ID||LA118_0==QUESTION) ) {
				alt118=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 118, 0, input);
				throw nvae;
			}

			switch (alt118) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1228:3: ^( TICK vn= valueName )
					{
					match(input,TICK,FOLLOW_TICK_in_nameTick9115); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_nameTick9119);
					vn=valueName();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1229:5: -> name_tick(vn=$vn.st)
					{
						retval.st = templateLib.getInstanceOf("name_tick",new STAttrMap().put("vn", (vn!=null?((StringTemplate)vn.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1231:3: vn= valueName
					{
					pushFollow(FOLLOW_valueName_in_nameTick9144);
					vn=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1232:5: -> {$vn.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1235:1: expressionOrAny : (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}});
	public final UnparseBLESS3.expressionOrAny_return expressionOrAny() throws RecognitionException {
		UnparseBLESS3.expressionOrAny_return retval = new UnparseBLESS3.expressionOrAny_return();
		retval.start = input.LT(1);

		BAST any=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1236:3: (exp= expression -> {$exp.st}|any= LITERAL_any -> {%{$any.text}})
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==AADL_STRING_LITERAL||(LA119_0 >= AL && LA119_0 <= AM)||LA119_0==AT_SIGN||LA119_0==CARET||LA119_0==DIVIDE||LA119_0==EQ||LA119_0==EXP||LA119_0==GT||LA119_0==ID||LA119_0==INVOKE||(LA119_0 >= LITERAL_abs && LA119_0 <= LITERAL_and)||LA119_0==LITERAL_div||LA119_0==LITERAL_else||LA119_0==LITERAL_exists||LA119_0==LITERAL_false||(LA119_0 >= LITERAL_iff && LA119_0 <= LITERAL_in)||LA119_0==LITERAL_mod||(LA119_0 >= LITERAL_not && LA119_0 <= LITERAL_numberof)||LA119_0==LITERAL_or||LA119_0==LITERAL_product||LA119_0==LITERAL_rem||LA119_0==LITERAL_round||LA119_0==LITERAL_sum||LA119_0==LITERAL_then||LA119_0==LITERAL_timeout||LA119_0==LITERAL_tops||(LA119_0 >= LITERAL_true && LA119_0 <= LITERAL_truncate)||(LA119_0 >= LITERAL_xor && LA119_0 <= LT)||LA119_0==MINUS||LA119_0==NEQ||LA119_0==OLD_NEQ||LA119_0==PLUS||LA119_0==PLUS_EQUALS||(LA119_0 >= QUANTITY && LA119_0 <= QUESTION)||LA119_0==RECORD_TERM||LA119_0==TICK||LA119_0==TIMES||LA119_0==UNARY_MINUS) ) {
				alt119=1;
			}
			else if ( (LA119_0==LITERAL_any) ) {
				alt119=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 119, 0, input);
				throw nvae;
			}

			switch (alt119) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1237:3: exp= expression
					{
					pushFollow(FOLLOW_expression_in_expressionOrAny9171);
					exp=expression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1238:5: -> {$exp.st}
					{
						retval.st = (exp!=null?((StringTemplate)exp.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1240:3: any= LITERAL_any
					{
					any=(BAST)match(input,LITERAL_any,FOLLOW_LITERAL_any_in_expressionOrAny9191); 
					// TEMPLATE REWRITE
					// 1241:4: -> {%{$any.text}}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1244:1: simultaneousAssignment : ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs);
	public final UnparseBLESS3.simultaneousAssignment_return simultaneousAssignment() throws RecognitionException {
		UnparseBLESS3.simultaneousAssignment_return retval = new UnparseBLESS3.simultaneousAssignment_return();
		retval.start = input.LT(1);

		List<Object> list_lhs=null;
		List<Object> list_rhs=null;
		RuleReturnScope lhs = null;
		RuleReturnScope rhs = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1245:3: ( ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) ) -> simultaneous_assignment(l=$lhsr=$rhs))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:3: ^( ASSIGN ^( COMMA (lhs+= nameTick )+ ) ^( COMMA (rhs+= expressionOrAny )+ ) )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_simultaneousAssignment9217); 
			match(input, Token.DOWN, null); 
			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment9221); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:25: (lhs+= nameTick )+
			int cnt120=0;
			loop120:
			while (true) {
				int alt120=2;
				int LA120_0 = input.LA(1);
				if ( (LA120_0==ID||LA120_0==QUESTION||LA120_0==TICK) ) {
					alt120=1;
				}

				switch (alt120) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:25: lhs+= nameTick
					{
					pushFollow(FOLLOW_nameTick_in_simultaneousAssignment9225);
					lhs=nameTick();
					state._fsp--;

					if (list_lhs==null) list_lhs=new ArrayList<Object>();
					list_lhs.add(lhs.getTemplate());
					}
					break;

				default :
					if ( cnt120 >= 1 ) break loop120;
					EarlyExitException eee = new EarlyExitException(120, input);
					throw eee;
				}
				cnt120++;
			}

			match(input, Token.UP, null); 

			match(input,COMMA,FOLLOW_COMMA_in_simultaneousAssignment9232); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:51: (rhs+= expressionOrAny )+
			int cnt121=0;
			loop121:
			while (true) {
				int alt121=2;
				int LA121_0 = input.LA(1);
				if ( (LA121_0==AADL_STRING_LITERAL||(LA121_0 >= AL && LA121_0 <= AM)||LA121_0==AT_SIGN||LA121_0==CARET||LA121_0==DIVIDE||LA121_0==EQ||LA121_0==EXP||LA121_0==GT||LA121_0==ID||LA121_0==INVOKE||(LA121_0 >= LITERAL_abs && LA121_0 <= LITERAL_any)||LA121_0==LITERAL_div||LA121_0==LITERAL_else||LA121_0==LITERAL_exists||LA121_0==LITERAL_false||(LA121_0 >= LITERAL_iff && LA121_0 <= LITERAL_in)||LA121_0==LITERAL_mod||(LA121_0 >= LITERAL_not && LA121_0 <= LITERAL_numberof)||LA121_0==LITERAL_or||LA121_0==LITERAL_product||LA121_0==LITERAL_rem||LA121_0==LITERAL_round||LA121_0==LITERAL_sum||LA121_0==LITERAL_then||LA121_0==LITERAL_timeout||LA121_0==LITERAL_tops||(LA121_0 >= LITERAL_true && LA121_0 <= LITERAL_truncate)||(LA121_0 >= LITERAL_xor && LA121_0 <= LT)||LA121_0==MINUS||LA121_0==NEQ||LA121_0==OLD_NEQ||LA121_0==PLUS||LA121_0==PLUS_EQUALS||(LA121_0 >= QUANTITY && LA121_0 <= QUESTION)||LA121_0==RECORD_TERM||LA121_0==TICK||LA121_0==TIMES||LA121_0==UNARY_MINUS) ) {
					alt121=1;
				}

				switch (alt121) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1246:51: rhs+= expressionOrAny
					{
					pushFollow(FOLLOW_expressionOrAny_in_simultaneousAssignment9236);
					rhs=expressionOrAny();
					state._fsp--;

					if (list_rhs==null) list_rhs=new ArrayList<Object>();
					list_rhs.add(rhs.getTemplate());
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

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1247:5: -> simultaneous_assignment(l=$lhsr=$rhs)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1250:1: whenThrow : ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text);
	public final UnparseBLESS3.whenThrow_return whenThrow() throws RecognitionException {
		UnparseBLESS3.whenThrow_return retval = new UnparseBLESS3.whenThrow_return();
		retval.start = input.LT(1);

		BAST excep=null;
		BAST message=null;
		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1250:10: ( ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? ) -> when_throw(e=$exp.sti=$excep.textm=$message.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1251:3: ^( LITERAL_when LPAREN exp= expression RPAREN LITERAL_throw excep= ID (message= AADL_STRING_LITERAL )? )
			{
			match(input,LITERAL_when,FOLLOW_LITERAL_when_in_whenThrow9276); 
			match(input, Token.DOWN, null); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whenThrow9278); 
			pushFollow(FOLLOW_expression_in_whenThrow9282);
			exp=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whenThrow9284); 
			match(input,LITERAL_throw,FOLLOW_LITERAL_throw_in_whenThrow9286); 
			excep=(BAST)match(input,ID,FOLLOW_ID_in_whenThrow9290); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1252:14: (message= AADL_STRING_LITERAL )?
			int alt122=2;
			int LA122_0 = input.LA(1);
			if ( (LA122_0==AADL_STRING_LITERAL) ) {
				alt122=1;
			}
			switch (alt122) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1252:14: message= AADL_STRING_LITERAL
					{
					message=(BAST)match(input,AADL_STRING_LITERAL,FOLLOW_AADL_STRING_LITERAL_in_whenThrow9302); 
					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1253:5: -> when_throw(e=$exp.sti=$excep.textm=$message.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1256:1: combinableOperation : ( ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID ) -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)| ^(fo= LITERAL_fetchor target= ID bool= expression result= ID ) -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)| ^(fan= LITERAL_fetchand target= ID bool= expression result= ID ) -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)| ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID ) -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)| ^(sw= LITERAL_swap target= ID reference= ID result= ID ) -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text));
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1256:20: ( ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID ) -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)| ^(fo= LITERAL_fetchor target= ID bool= expression result= ID ) -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)| ^(fan= LITERAL_fetchand target= ID bool= expression result= ID ) -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)| ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID ) -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)| ^(sw= LITERAL_swap target= ID reference= ID result= ID ) -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text))
			int alt123=5;
			switch ( input.LA(1) ) {
			case LITERAL_fetchadd:
				{
				alt123=1;
				}
				break;
			case LITERAL_fetchor:
				{
				alt123=2;
				}
				break;
			case LITERAL_fetchand:
				{
				alt123=3;
				}
				break;
			case LITERAL_fetchxor:
				{
				alt123=4;
				}
				break;
			case LITERAL_swap:
				{
				alt123=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 123, 0, input);
				throw nvae;
			}
			switch (alt123) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1257:3: ^(fa= LITERAL_fetchadd target= ID arithmetic= expression result= ID )
					{
					fa=(BAST)match(input,LITERAL_fetchadd,FOLLOW_LITERAL_fetchadd_in_combinableOperation9348); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9352); 
					pushFollow(FOLLOW_expression_in_combinableOperation9356);
					arithmetic=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9360); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1258:4: -> combinable(op=$fa.textt=$target.texte=$arithmetic.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fa!=null?fa.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (arithmetic!=null?((StringTemplate)arithmetic.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1260:3: ^(fo= LITERAL_fetchor target= ID bool= expression result= ID )
					{
					fo=(BAST)match(input,LITERAL_fetchor,FOLLOW_LITERAL_fetchor_in_combinableOperation9402); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9406); 
					pushFollow(FOLLOW_expression_in_combinableOperation9410);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9414); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1261:4: -> combinable(op=$fo.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fo!=null?fo.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1263:3: ^(fan= LITERAL_fetchand target= ID bool= expression result= ID )
					{
					fan=(BAST)match(input,LITERAL_fetchand,FOLLOW_LITERAL_fetchand_in_combinableOperation9456); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9460); 
					pushFollow(FOLLOW_expression_in_combinableOperation9464);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9468); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1264:4: -> combinable(op=$fan.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fan!=null?fan.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1266:3: ^(fx= LITERAL_fetchxor target= ID bool= expression result= ID )
					{
					fx=(BAST)match(input,LITERAL_fetchxor,FOLLOW_LITERAL_fetchxor_in_combinableOperation9510); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9514); 
					pushFollow(FOLLOW_expression_in_combinableOperation9518);
					bool=expression();
					state._fsp--;

					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9522); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1267:4: -> combinable(op=$fx.textt=$target.texte=$bool.str=$result.text)
					{
						retval.st = templateLib.getInstanceOf("combinable",new STAttrMap().put("op", (fx!=null?fx.getText():null)).put("t", (target!=null?target.getText():null)).put("e", (bool!=null?((StringTemplate)bool.getTemplate()):null)).put("r", (result!=null?result.getText():null)));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1269:3: ^(sw= LITERAL_swap target= ID reference= ID result= ID )
					{
					sw=(BAST)match(input,LITERAL_swap,FOLLOW_LITERAL_swap_in_combinableOperation9564); 
					match(input, Token.DOWN, null); 
					target=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9568); 
					reference=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9572); 
					result=(BAST)match(input,ID,FOLLOW_ID_in_combinableOperation9576); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1270:4: -> combinable(op=$sw.textt=$target.texte=$reference.textr=$result.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1273:1: communicationAction : (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st});
	public final UnparseBLESS3.communicationAction_return communicationAction() throws RecognitionException {
		UnparseBLESS3.communicationAction_return retval = new UnparseBLESS3.communicationAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope pc =null;
		TreeRuleReturnScope po =null;
		TreeRuleReturnScope pi =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1273:20: (pc= subprogramCall -> {$pc.st}|po= portOutput -> {$po.st}|pi= portInput -> {$pi.st})
			int alt124=3;
			switch ( input.LA(1) ) {
			case SUBPROGRAM_INVOCATION:
				{
				alt124=1;
				}
				break;
			case PORT_OUTPUT:
				{
				alt124=2;
				}
				break;
			case PORT_INPUT:
				{
				alt124=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1274:3: pc= subprogramCall
					{
					pushFollow(FOLLOW_subprogramCall_in_communicationAction9622);
					pc=subprogramCall();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1275:5: -> {$pc.st}
					{
						retval.st = (pc!=null?((StringTemplate)pc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1277:3: po= portOutput
					{
					pushFollow(FOLLOW_portOutput_in_communicationAction9640);
					po=portOutput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1278:5: -> {$po.st}
					{
						retval.st = (po!=null?((StringTemplate)po.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1280:3: pi= portInput
					{
					pushFollow(FOLLOW_portInput_in_communicationAction9658);
					pi=portInput();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1281:5: -> {$pi.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1284:1: computation : ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component+= componentName )+ ) )? ) -> computation(lb=$lb.stub=$ub.stc=$component);
	public final UnparseBLESS3.computation_return computation() throws RecognitionException {
		UnparseBLESS3.computation_return retval = new UnparseBLESS3.computation_return();
		retval.start = input.LT(1);

		List<Object> list_component=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		RuleReturnScope component = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1285:3: ( ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component+= componentName )+ ) )? ) -> computation(lb=$lb.stub=$ub.stc=$component))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:3: ^( LITERAL_computation lb= behaviorTime (ub= behaviorTime )? ( ^( LITERAL_binding (component+= componentName )+ ) )? )
			{
			match(input,LITERAL_computation,FOLLOW_LITERAL_computation_in_computation9684); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_behaviorTime_in_computation9688);
			lb=behaviorTime();
			state._fsp--;

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:44: (ub= behaviorTime )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==BEHAVIOR_TIME) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:44: ub= behaviorTime
					{
					pushFollow(FOLLOW_behaviorTime_in_computation9692);
					ub=behaviorTime();
					state._fsp--;

					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:59: ( ^( LITERAL_binding (component+= componentName )+ ) )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==LITERAL_binding) ) {
				alt127=1;
			}
			switch (alt127) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:61: ^( LITERAL_binding (component+= componentName )+ )
					{
					match(input,LITERAL_binding,FOLLOW_LITERAL_binding_in_computation9699); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:89: (component+= componentName )+
					int cnt126=0;
					loop126:
					while (true) {
						int alt126=2;
						int LA126_0 = input.LA(1);
						if ( (LA126_0==DOUBLE_COLON||LA126_0==ID) ) {
							alt126=1;
						}

						switch (alt126) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1286:89: component+= componentName
							{
							pushFollow(FOLLOW_componentName_in_computation9703);
							component=componentName();
							state._fsp--;

							if (list_component==null) list_component=new ArrayList<Object>();
							list_component.add(component.getTemplate());
							}
							break;

						default :
							if ( cnt126 >= 1 ) break loop126;
							EarlyExitException eee = new EarlyExitException(126, input);
							throw eee;
						}
						cnt126++;
					}

					match(input, Token.UP, null); 

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1287:5: -> computation(lb=$lb.stub=$ub.stc=$component)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1290:1: portOutput : ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st);
	public final UnparseBLESS3.portOutput_return portOutput() throws RecognitionException {
		UnparseBLESS3.portOutput_return retval = new UnparseBLESS3.portOutput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope be =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1291:3: ( ^( PORT_OUTPUT pn= ID (be= expression )? ) -> port_output(o=$pn.textbe=$be.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:3: ^( PORT_OUTPUT pn= ID (be= expression )? )
			{
			match(input,PORT_OUTPUT,FOLLOW_PORT_OUTPUT_in_portOutput9754); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portOutput9758); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:26: (be= expression )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==AADL_STRING_LITERAL||(LA128_0 >= AL && LA128_0 <= AM)||LA128_0==AT_SIGN||LA128_0==CARET||LA128_0==DIVIDE||LA128_0==EQ||LA128_0==EXP||LA128_0==GT||LA128_0==ID||LA128_0==INVOKE||(LA128_0 >= LITERAL_abs && LA128_0 <= LITERAL_and)||LA128_0==LITERAL_div||LA128_0==LITERAL_else||LA128_0==LITERAL_exists||LA128_0==LITERAL_false||(LA128_0 >= LITERAL_iff && LA128_0 <= LITERAL_in)||LA128_0==LITERAL_mod||(LA128_0 >= LITERAL_not && LA128_0 <= LITERAL_numberof)||LA128_0==LITERAL_or||LA128_0==LITERAL_product||LA128_0==LITERAL_rem||LA128_0==LITERAL_round||LA128_0==LITERAL_sum||LA128_0==LITERAL_then||LA128_0==LITERAL_timeout||LA128_0==LITERAL_tops||(LA128_0 >= LITERAL_true && LA128_0 <= LITERAL_truncate)||(LA128_0 >= LITERAL_xor && LA128_0 <= LT)||LA128_0==MINUS||LA128_0==NEQ||LA128_0==OLD_NEQ||LA128_0==PLUS||LA128_0==PLUS_EQUALS||(LA128_0 >= QUANTITY && LA128_0 <= QUESTION)||LA128_0==RECORD_TERM||LA128_0==TICK||LA128_0==TIMES||LA128_0==UNARY_MINUS) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1292:26: be= expression
					{
					pushFollow(FOLLOW_expression_in_portOutput9762);
					be=expression();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1293:5: -> port_output(o=$pn.textbe=$be.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1296:1: portInput : ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st);
	public final UnparseBLESS3.portInput_return portInput() throws RecognitionException {
		UnparseBLESS3.portInput_return retval = new UnparseBLESS3.portInput_return();
		retval.start = input.LT(1);

		BAST pn=null;
		TreeRuleReturnScope n =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1297:3: ( ^( PORT_INPUT pn= ID n= valueName ) -> port_input(i=$pn.textn=$n.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1298:3: ^( PORT_INPUT pn= ID n= valueName )
			{
			match(input,PORT_INPUT,FOLLOW_PORT_INPUT_in_portInput9804); 
			match(input, Token.DOWN, null); 
			pn=(BAST)match(input,ID,FOLLOW_ID_in_portInput9808); 
			pushFollow(FOLLOW_valueName_in_portInput9812);
			n=valueName();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1299:5: -> port_input(i=$pn.textn=$n.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1303:1: subprogramCall : ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st);
	public final UnparseBLESS3.subprogramCall_return subprogramCall() throws RecognitionException {
		UnparseBLESS3.subprogramCall_return retval = new UnparseBLESS3.subprogramCall_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope fal =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1304:3: ( ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? ) -> function_call(f=$id.textpl=$fal.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:3: ^( SUBPROGRAM_INVOCATION id= ID (fal= formalActualList )? )
			{
			match(input,SUBPROGRAM_INVOCATION,FOLLOW_SUBPROGRAM_INVOCATION_in_subprogramCall9856); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_subprogramCall9860); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:37: (fal= formalActualList )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==AADL_STRING_LITERAL||LA129_0==COLON||LA129_0==COMMA||LA129_0==ID||LA129_0==LITERAL_false||LA129_0==LITERAL_null||LA129_0==LITERAL_true||LA129_0==LPAREN||(LA129_0 >= QUANTITY && LA129_0 <= QUESTION)||LA129_0==TICK) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1305:37: fal= formalActualList
					{
					pushFollow(FOLLOW_formalActualList_in_subprogramCall9864);
					fal=formalActualList();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1306:5: -> function_call(f=$id.textpl=$fal.st)
			{
				retval.st = templateLib.getInstanceOf("function_call",new STAttrMap().put("f", (id!=null?id.getText():null)).put("pl", (fal!=null?((StringTemplate)fal.getTemplate()):null)));
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1310:1: formalActualList : ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st});
	public final UnparseBLESS3.formalActualList_return formalActualList() throws RecognitionException {
		UnparseBLESS3.formalActualList_return retval = new UnparseBLESS3.formalActualList_return();
		retval.start = input.LT(1);

		List<Object> list_fa=null;
		TreeRuleReturnScope s =null;
		RuleReturnScope fa = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1311:3: ( ^( COMMA (fa+= formalActual )+ ) -> formal_actual_list(ns=$fa)|s= formalActual -> {$s.st})
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==COMMA) ) {
				alt131=1;
			}
			else if ( (LA131_0==AADL_STRING_LITERAL||LA131_0==COLON||LA131_0==ID||LA131_0==LITERAL_false||LA131_0==LITERAL_null||LA131_0==LITERAL_true||LA131_0==LPAREN||(LA131_0 >= QUANTITY && LA131_0 <= QUESTION)||LA131_0==TICK) ) {
				alt131=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 131, 0, input);
				throw nvae;
			}

			switch (alt131) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1312:3: ^( COMMA (fa+= formalActual )+ )
					{
					match(input,COMMA,FOLLOW_COMMA_in_formalActualList9909); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1312:14: (fa+= formalActual )+
					int cnt130=0;
					loop130:
					while (true) {
						int alt130=2;
						int LA130_0 = input.LA(1);
						if ( (LA130_0==AADL_STRING_LITERAL||LA130_0==COLON||LA130_0==ID||LA130_0==LITERAL_false||LA130_0==LITERAL_null||LA130_0==LITERAL_true||LA130_0==LPAREN||(LA130_0 >= QUANTITY && LA130_0 <= QUESTION)||LA130_0==TICK) ) {
							alt130=1;
						}

						switch (alt130) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1312:14: fa+= formalActual
							{
							pushFollow(FOLLOW_formalActual_in_formalActualList9913);
							fa=formalActual();
							state._fsp--;

							if (list_fa==null) list_fa=new ArrayList<Object>();
							list_fa.add(fa.getTemplate());
							}
							break;

						default :
							if ( cnt130 >= 1 ) break loop130;
							EarlyExitException eee = new EarlyExitException(130, input);
							throw eee;
						}
						cnt130++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1313:5: -> formal_actual_list(ns=$fa)
					{
						retval.st = templateLib.getInstanceOf("formal_actual_list",new STAttrMap().put("ns", list_fa));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1315:3: s= formalActual
					{
					pushFollow(FOLLOW_formalActual_in_formalActualList9939);
					s=formalActual();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1316:5: -> {$s.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1319:1: formalActual : ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter -> {$spp.st});
	public final UnparseBLESS3.formalActual_return formalActual() throws RecognitionException {
		UnparseBLESS3.formalActual_return retval = new UnparseBLESS3.formalActual_return();
		retval.start = input.LT(1);

		BAST formal=null;
		TreeRuleReturnScope actual =null;
		TreeRuleReturnScope spp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1320:3: ( ^( COLON formal= ID actual= subProgramParameter ) -> formal_actual(f=$formal.textap=$actual.st)|spp= subProgramParameter -> {$spp.st})
			int alt132=2;
			int LA132_0 = input.LA(1);
			if ( (LA132_0==COLON) ) {
				alt132=1;
			}
			else if ( (LA132_0==AADL_STRING_LITERAL||LA132_0==ID||LA132_0==LITERAL_false||LA132_0==LITERAL_null||LA132_0==LITERAL_true||LA132_0==LPAREN||(LA132_0 >= QUANTITY && LA132_0 <= QUESTION)||LA132_0==TICK) ) {
				alt132=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}

			switch (alt132) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1321:3: ^( COLON formal= ID actual= subProgramParameter )
					{
					match(input,COLON,FOLLOW_COLON_in_formalActual9968); 
					match(input, Token.DOWN, null); 
					formal=(BAST)match(input,ID,FOLLOW_ID_in_formalActual9972); 
					pushFollow(FOLLOW_subProgramParameter_in_formalActual9976);
					actual=subProgramParameter();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1322:5: -> formal_actual(f=$formal.textap=$actual.st)
					{
						retval.st = templateLib.getInstanceOf("formal_actual",new STAttrMap().put("f", (formal!=null?formal.getText():null)).put("ap", (actual!=null?((StringTemplate)actual.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1324:3: spp= subProgramParameter
					{
					pushFollow(FOLLOW_subProgramParameter_in_formalActual10006);
					spp=subProgramParameter();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1325:5: -> {$spp.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1328:1: subProgramParameter : (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st});
	public final UnparseBLESS3.subProgramParameter_return subProgramParameter() throws RecognitionException {
		UnparseBLESS3.subProgramParameter_return retval = new UnparseBLESS3.subProgramParameter_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope v =null;
		TreeRuleReturnScope c =null;
		TreeRuleReturnScope ps =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1328:20: (v= valueName -> {$v.st}|c= constant -> {$c.st}|ps= parenthesizedSubexpression -> {$ps.st})
			int alt133=3;
			switch ( input.LA(1) ) {
			case ID:
			case QUESTION:
			case TICK:
				{
				alt133=1;
				}
				break;
			case AADL_STRING_LITERAL:
			case LITERAL_false:
			case LITERAL_null:
			case LITERAL_true:
			case QUANTITY:
				{
				alt133=2;
				}
				break;
			case LPAREN:
				{
				alt133=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 133, 0, input);
				throw nvae;
			}
			switch (alt133) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1329:2: v= valueName
					{
					pushFollow(FOLLOW_valueName_in_subProgramParameter10028);
					v=valueName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1330:5: -> {$v.st}
					{
						retval.st = (v!=null?((StringTemplate)v.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1331:4: c= constant
					{
					pushFollow(FOLLOW_constant_in_subProgramParameter10043);
					c=constant();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1332:5: -> {$c.st}
					{
						retval.st = (c!=null?((StringTemplate)c.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1333:4: ps= parenthesizedSubexpression
					{
					pushFollow(FOLLOW_parenthesizedSubexpression_in_subProgramParameter10058);
					ps=parenthesizedSubexpression();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1334:5: -> {$ps.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1337:1: alternative : ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt);
	public final UnparseBLESS3.alternative_return alternative() throws RecognitionException {
		UnparseBLESS3.alternative_return retval = new UnparseBLESS3.alternative_return();
		retval.start = input.LT(1);

		List<Object> list_alt=null;
		RuleReturnScope alt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1338:3: ( ^( LITERAL_if (alt+= guardedAction )+ ) -> alternative(gf=$alt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:3: ^( LITERAL_if (alt+= guardedAction )+ )
			{
			match(input,LITERAL_if,FOLLOW_LITERAL_if_in_alternative10086); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:20: (alt+= guardedAction )+
			int cnt134=0;
			loop134:
			while (true) {
				int alt134=2;
				int LA134_0 = input.LA(1);
				if ( (LA134_0==GUARD) ) {
					alt134=1;
				}

				switch (alt134) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1339:20: alt+= guardedAction
					{
					pushFollow(FOLLOW_guardedAction_in_alternative10090);
					alt=guardedAction();
					state._fsp--;

					if (list_alt==null) list_alt=new ArrayList<Object>();
					list_alt.add(alt.getTemplate());
					}
					break;

				default :
					if ( cnt134 >= 1 ) break loop134;
					EarlyExitException eee = new EarlyExitException(134, input);
					throw eee;
				}
				cnt134++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1340:5: -> alternative(gf=$alt)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1343:1: guardedAction : ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st);
	public final UnparseBLESS3.guardedAction_return guardedAction() throws RecognitionException {
		UnparseBLESS3.guardedAction_return retval = new UnparseBLESS3.guardedAction_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;
		TreeRuleReturnScope aa =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1344:3: ( ^( GUARD exp= expression aa= assertedAction ) -> guarded_action(be=$exp.stba=$aa.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1345:3: ^( GUARD exp= expression aa= assertedAction )
			{
			match(input,GUARD,FOLLOW_GUARD_in_guardedAction10127); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_guardedAction10131);
			exp=expression();
			state._fsp--;

			pushFollow(FOLLOW_assertedAction_in_guardedAction10135);
			aa=assertedAction();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1346:5: -> guarded_action(be=$exp.stba=$aa.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1349:1: whileLoop : ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.whileLoop_return whileLoop() throws RecognitionException {
		UnparseBLESS3.whileLoop_return retval = new UnparseBLESS3.whileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1350:3: ( ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) elq= existentialLatticeQuantification ) -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:3: ^( LITERAL_while be= expression ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_while,FOLLOW_LITERAL_while_in_whileLoop10174); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_whileLoop10178);
			be=expression();
			state._fsp--;

			match(input,INVARIANT,FOLLOW_INVARIANT_in_whileLoop10182); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:50: (inv= assertion )?
				int alt135=2;
				int LA135_0 = input.LA(1);
				if ( (LA135_0==ASSERTION||(LA135_0 >= ASSERTION_ENUMERATION && LA135_0 <= ASSERTION_FUNCTION)) ) {
					alt135=1;
				}
				switch (alt135) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:50: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_whileLoop10186);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_whileLoop10193); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:75: (bd= expression )?
				int alt136=2;
				int LA136_0 = input.LA(1);
				if ( (LA136_0==AADL_STRING_LITERAL||(LA136_0 >= AL && LA136_0 <= AM)||LA136_0==AT_SIGN||LA136_0==CARET||LA136_0==DIVIDE||LA136_0==EQ||LA136_0==EXP||LA136_0==GT||LA136_0==ID||LA136_0==INVOKE||(LA136_0 >= LITERAL_abs && LA136_0 <= LITERAL_and)||LA136_0==LITERAL_div||LA136_0==LITERAL_else||LA136_0==LITERAL_exists||LA136_0==LITERAL_false||(LA136_0 >= LITERAL_iff && LA136_0 <= LITERAL_in)||LA136_0==LITERAL_mod||(LA136_0 >= LITERAL_not && LA136_0 <= LITERAL_numberof)||LA136_0==LITERAL_or||LA136_0==LITERAL_product||LA136_0==LITERAL_rem||LA136_0==LITERAL_round||LA136_0==LITERAL_sum||LA136_0==LITERAL_then||LA136_0==LITERAL_timeout||LA136_0==LITERAL_tops||(LA136_0 >= LITERAL_true && LA136_0 <= LITERAL_truncate)||(LA136_0 >= LITERAL_xor && LA136_0 <= LT)||LA136_0==MINUS||LA136_0==NEQ||LA136_0==OLD_NEQ||LA136_0==PLUS||LA136_0==PLUS_EQUALS||(LA136_0 >= QUANTITY && LA136_0 <= QUESTION)||LA136_0==RECORD_TERM||LA136_0==TICK||LA136_0==TIMES||LA136_0==UNARY_MINUS) ) {
					alt136=1;
				}
				switch (alt136) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1351:75: bd= expression
						{
						pushFollow(FOLLOW_expression_in_whileLoop10197);
						bd=expression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_existentialLatticeQuantification_in_whileLoop10211);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1353:5: -> while_loop(be=$be.stelq=$elq.stbd=$bd.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1356:1: forLoop : ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st);
	public final UnparseBLESS3.forLoop_return forLoop() throws RecognitionException {
		UnparseBLESS3.forLoop_return retval = new UnparseBLESS3.forLoop_return();
		retval.start = input.LT(1);

		BAST id=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1357:3: ( ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions ) -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:3: ^( LITERAL_for id= ID ^( LITERAL_in lb= expression ub= expression ) ^( INVARIANT (inv= assertion )? ) act= behaviorActions )
			{
			match(input,LITERAL_for,FOLLOW_LITERAL_for_in_forLoop10260); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_forLoop10264); 
			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_forLoop10268); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_forLoop10272);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_forLoop10276);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_forLoop10282); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:84: (inv= assertion )?
				int alt137=2;
				int LA137_0 = input.LA(1);
				if ( (LA137_0==ASSERTION||(LA137_0 >= ASSERTION_ENUMERATION && LA137_0 <= ASSERTION_FUNCTION)) ) {
					alt137=1;
				}
				switch (alt137) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1358:84: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_forLoop10286);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_forLoop10300);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1360:5: -> for_loop(a=$id.textlb=$lb.stub=$ub.stba=$act.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1363:1: doUntilLoop : ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st);
	public final UnparseBLESS3.doUntilLoop_return doUntilLoop() throws RecognitionException {
		UnparseBLESS3.doUntilLoop_return retval = new UnparseBLESS3.doUntilLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope be =null;
		TreeRuleReturnScope inv =null;
		TreeRuleReturnScope bd =null;
		TreeRuleReturnScope act =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1364:3: ( ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) act= behaviorActions ) -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:3: ^( LITERAL_do ^( LITERAL_until be= expression ) ^( INVARIANT (inv= assertion )? ) ^( BOUND (bd= expression )? ) act= behaviorActions )
			{
			match(input,LITERAL_do,FOLLOW_LITERAL_do_in_doUntilLoop10355); 
			match(input, Token.DOWN, null); 
			match(input,LITERAL_until,FOLLOW_LITERAL_until_in_doUntilLoop10359); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_doUntilLoop10363);
			be=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,INVARIANT,FOLLOW_INVARIANT_in_doUntilLoop10369); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:66: (inv= assertion )?
				int alt138=2;
				int LA138_0 = input.LA(1);
				if ( (LA138_0==ASSERTION||(LA138_0 >= ASSERTION_ENUMERATION && LA138_0 <= ASSERTION_FUNCTION)) ) {
					alt138=1;
				}
				switch (alt138) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:66: inv= assertion
						{
						pushFollow(FOLLOW_assertion_in_doUntilLoop10373);
						inv=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,BOUND,FOLLOW_BOUND_in_doUntilLoop10380); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:91: (bd= expression )?
				int alt139=2;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==AADL_STRING_LITERAL||(LA139_0 >= AL && LA139_0 <= AM)||LA139_0==AT_SIGN||LA139_0==CARET||LA139_0==DIVIDE||LA139_0==EQ||LA139_0==EXP||LA139_0==GT||LA139_0==ID||LA139_0==INVOKE||(LA139_0 >= LITERAL_abs && LA139_0 <= LITERAL_and)||LA139_0==LITERAL_div||LA139_0==LITERAL_else||LA139_0==LITERAL_exists||LA139_0==LITERAL_false||(LA139_0 >= LITERAL_iff && LA139_0 <= LITERAL_in)||LA139_0==LITERAL_mod||(LA139_0 >= LITERAL_not && LA139_0 <= LITERAL_numberof)||LA139_0==LITERAL_or||LA139_0==LITERAL_product||LA139_0==LITERAL_rem||LA139_0==LITERAL_round||LA139_0==LITERAL_sum||LA139_0==LITERAL_then||LA139_0==LITERAL_timeout||LA139_0==LITERAL_tops||(LA139_0 >= LITERAL_true && LA139_0 <= LITERAL_truncate)||(LA139_0 >= LITERAL_xor && LA139_0 <= LT)||LA139_0==MINUS||LA139_0==NEQ||LA139_0==OLD_NEQ||LA139_0==PLUS||LA139_0==PLUS_EQUALS||(LA139_0 >= QUANTITY && LA139_0 <= QUESTION)||LA139_0==RECORD_TERM||LA139_0==TICK||LA139_0==TIMES||LA139_0==UNARY_MINUS) ) {
					alt139=1;
				}
				switch (alt139) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1365:91: bd= expression
						{
						pushFollow(FOLLOW_expression_in_doUntilLoop10384);
						bd=expression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			pushFollow(FOLLOW_behaviorActions_in_doUntilLoop10397);
			act=behaviorActions();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1367:5: -> do_until(be=$be.stba=$act.stbd=$bd.stinv=$inv.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1370:1: universalLatticeQuantification : ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st);
	public final UnparseBLESS3.universalLatticeQuantification_return universalLatticeQuantification() throws RecognitionException {
		UnparseBLESS3.universalLatticeQuantification_return retval = new UnparseBLESS3.universalLatticeQuantification_return();
		retval.start = input.LT(1);

		BAST lv=null;
		List<Object> list_lv=null;
		TreeRuleReturnScope lb =null;
		TreeRuleReturnScope ub =null;
		TreeRuleReturnScope elq =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1371:3: ( ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification ) -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:3: ^( LITERAL_forall (lv+= ID )+ ^( LITERAL_in lb= expression ub= expression ) elq= existentialLatticeQuantification )
			{
			match(input,LITERAL_forall,FOLLOW_LITERAL_forall_in_universalLatticeQuantification10450); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:23: (lv+= ID )+
			int cnt140=0;
			loop140:
			while (true) {
				int alt140=2;
				int LA140_0 = input.LA(1);
				if ( (LA140_0==ID) ) {
					alt140=1;
				}

				switch (alt140) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1372:23: lv+= ID
					{
					lv=(BAST)match(input,ID,FOLLOW_ID_in_universalLatticeQuantification10454); 
					if (list_lv==null) list_lv=new ArrayList<Object>();
					list_lv.add(lv);
					}
					break;

				default :
					if ( cnt140 >= 1 ) break loop140;
					EarlyExitException eee = new EarlyExitException(140, input);
					throw eee;
				}
				cnt140++;
			}

			match(input,LITERAL_in,FOLLOW_LITERAL_in_in_universalLatticeQuantification10459); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_expression_in_universalLatticeQuantification10463);
			lb=expression();
			state._fsp--;

			pushFollow(FOLLOW_expression_in_universalLatticeQuantification10467);
			ub=expression();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification10473);
			elq=existentialLatticeQuantification();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1373:5: -> ulq(lv=$lvlb=$lb.stub=$ub.stelq=$elq.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1379:1: blessSubclause : ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1380:3: ( ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? ) -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1381:3: ^( BLESS_SUBCLAUSE (no_proof= DO_NOT_PROVE )? (ac= assertClause )? (inv= invariantClause )? (vs= variablesSection )? (ss= statesSection )? (t= transitions )? )
			{
			match(input,BLESS_SUBCLAUSE,FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause10523); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1382:12: (no_proof= DO_NOT_PROVE )?
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==DO_NOT_PROVE) ) {
					alt141=1;
				}
				switch (alt141) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1382:12: no_proof= DO_NOT_PROVE
						{
						no_proof=(BAST)match(input,DO_NOT_PROVE,FOLLOW_DO_NOT_PROVE_in_blessSubclause10531); 
						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1383:7: (ac= assertClause )?
				int alt142=2;
				int LA142_0 = input.LA(1);
				if ( (LA142_0==LITERAL_assert) ) {
					alt142=1;
				}
				switch (alt142) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1383:7: ac= assertClause
						{
						pushFollow(FOLLOW_assertClause_in_blessSubclause10540);
						ac=assertClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:8: (inv= invariantClause )?
				int alt143=2;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==LITERAL_invariant) ) {
					alt143=1;
				}
				switch (alt143) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1384:8: inv= invariantClause
						{
						pushFollow(FOLLOW_invariantClause_in_blessSubclause10551);
						inv=invariantClause();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1385:7: (vs= variablesSection )?
				int alt144=2;
				int LA144_0 = input.LA(1);
				if ( (LA144_0==LITERAL_variables) ) {
					alt144=1;
				}
				switch (alt144) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1385:7: vs= variablesSection
						{
						pushFollow(FOLLOW_variablesSection_in_blessSubclause10560);
						vs=variablesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1386:7: (ss= statesSection )?
				int alt145=2;
				int LA145_0 = input.LA(1);
				if ( (LA145_0==LITERAL_states) ) {
					alt145=1;
				}
				switch (alt145) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1386:7: ss= statesSection
						{
						pushFollow(FOLLOW_statesSection_in_blessSubclause10569);
						ss=statesSection();
						state._fsp--;

						}
						break;

				}

				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1387:6: (t= transitions )?
				int alt146=2;
				int LA146_0 = input.LA(1);
				if ( (LA146_0==LITERAL_transitions) ) {
					alt146=1;
				}
				switch (alt146) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1387:6: t= transitions
						{
						pushFollow(FOLLOW_transitions_in_blessSubclause10578);
						t=transitions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1388:5: -> bless_subclause(n=$no_proof.textac=$ac.stinv=$inv.stvs=$vs.stss=$ss.stt=$t.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1391:1: invariantClause : ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st);
	public final UnparseBLESS3.invariantClause_return invariantClause() throws RecognitionException {
		UnparseBLESS3.invariantClause_return retval = new UnparseBLESS3.invariantClause_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1392:3: ( ^( LITERAL_invariant a= assertion ) -> invariant_clause(a=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1393:3: ^( LITERAL_invariant a= assertion )
			{
			match(input,LITERAL_invariant,FOLLOW_LITERAL_invariant_in_invariantClause10640); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_assertion_in_invariantClause10644);
			a=assertion();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1394:5: -> invariant_clause(a=$a.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1397:1: variablesSection : ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd);
	public final UnparseBLESS3.variablesSection_return variablesSection() throws RecognitionException {
		UnparseBLESS3.variablesSection_return retval = new UnparseBLESS3.variablesSection_return();
		retval.start = input.LT(1);

		List<Object> list_vd=null;
		RuleReturnScope vd = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1398:3: ( ^( LITERAL_variables (vd+= variableDeclaration )+ ) -> variables(bv=$vd))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:2: ^( LITERAL_variables (vd+= variableDeclaration )+ )
			{
			match(input,LITERAL_variables,FOLLOW_LITERAL_variables_in_variablesSection10676); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:25: (vd+= variableDeclaration )+
			int cnt147=0;
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==VARIABLE_DECLARATION) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1399:25: vd+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variablesSection10680);
					vd=variableDeclaration();
					state._fsp--;

					if (list_vd==null) list_vd=new ArrayList<Object>();
					list_vd.add(vd.getTemplate());
					}
					break;

				default :
					if ( cnt147 >= 1 ) break loop147;
					EarlyExitException eee = new EarlyExitException(147, input);
					throw eee;
				}
				cnt147++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1400:4: -> variables(bv=$vd)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1403:1: statesSection : ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states);
	public final UnparseBLESS3.statesSection_return statesSection() throws RecognitionException {
		UnparseBLESS3.statesSection_return retval = new UnparseBLESS3.statesSection_return();
		retval.start = input.LT(1);

		List<Object> list_states=null;
		RuleReturnScope states = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1404:3: ( ^( LITERAL_states (states+= behaviorState )+ ) -> states_section(bs=$states))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:2: ^( LITERAL_states (states+= behaviorState )+ )
			{
			match(input,LITERAL_states,FOLLOW_LITERAL_states_in_statesSection10711); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:26: (states+= behaviorState )+
			int cnt148=0;
			loop148:
			while (true) {
				int alt148=2;
				int LA148_0 = input.LA(1);
				if ( (LA148_0==LITERAL_state) ) {
					alt148=1;
				}

				switch (alt148) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1405:26: states+= behaviorState
					{
					pushFollow(FOLLOW_behaviorState_in_statesSection10715);
					states=behaviorState();
					state._fsp--;

					if (list_states==null) list_states=new ArrayList<Object>();
					list_states.add(states.getTemplate());
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
			// 1406:4: -> states_section(bs=$states)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1409:1: behaviorState : ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st);
	public final UnparseBLESS3.behaviorState_return behaviorState() throws RecognitionException {
		UnparseBLESS3.behaviorState_return retval = new UnparseBLESS3.behaviorState_return();
		retval.start = input.LT(1);

		BAST init=null;
		BAST com=null;
		BAST finl=null;
		BAST i=null;
		TreeRuleReturnScope a =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1410:3: ( ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? ) -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:3: ^( LITERAL_state (init= LITERAL_initial )? (com= LITERAL_complete )? (finl= LITERAL_final )? i= ID (a= assertion )? )
			{
			match(input,LITERAL_state,FOLLOW_LITERAL_state_in_behaviorState10747); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:24: (init= LITERAL_initial )?
			int alt149=2;
			int LA149_0 = input.LA(1);
			if ( (LA149_0==LITERAL_initial) ) {
				alt149=1;
			}
			switch (alt149) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:24: init= LITERAL_initial
					{
					init=(BAST)match(input,LITERAL_initial,FOLLOW_LITERAL_initial_in_behaviorState10751); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:45: (com= LITERAL_complete )?
			int alt150=2;
			int LA150_0 = input.LA(1);
			if ( (LA150_0==LITERAL_complete) ) {
				alt150=1;
			}
			switch (alt150) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:45: com= LITERAL_complete
					{
					com=(BAST)match(input,LITERAL_complete,FOLLOW_LITERAL_complete_in_behaviorState10756); 
					}
					break;

			}

			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:68: (finl= LITERAL_final )?
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==LITERAL_final) ) {
				alt151=1;
			}
			switch (alt151) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:68: finl= LITERAL_final
					{
					finl=(BAST)match(input,LITERAL_final,FOLLOW_LITERAL_final_in_behaviorState10761); 
					}
					break;

			}

			i=(BAST)match(input,ID,FOLLOW_ID_in_behaviorState10766); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:90: (a= assertion )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==ASSERTION||(LA152_0 >= ASSERTION_ENUMERATION && LA152_0 <= ASSERTION_FUNCTION)) ) {
				alt152=1;
			}
			switch (alt152) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1411:90: a= assertion
					{
					pushFollow(FOLLOW_assertion_in_behaviorState10770);
					a=assertion();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1412:5: -> behavior_state(bsi=$i.texti=$init.textcom=$com.textfinl=$finl.texta=$a.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1415:1: transitions : ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt);
	public final UnparseBLESS3.transitions_return transitions() throws RecognitionException {
		UnparseBLESS3.transitions_return retval = new UnparseBLESS3.transitions_return();
		retval.start = input.LT(1);

		List<Object> list_bt=null;
		RuleReturnScope bt = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1416:3: ( ^( LITERAL_transitions (bt+= behaviorTransition )+ ) -> transitions(bt=$bt))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:3: ^( LITERAL_transitions (bt+= behaviorTransition )+ )
			{
			match(input,LITERAL_transitions,FOLLOW_LITERAL_transitions_in_transitions10825); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:28: (bt+= behaviorTransition )+
			int cnt153=0;
			loop153:
			while (true) {
				int alt153=2;
				int LA153_0 = input.LA(1);
				if ( (LA153_0==TRANSITION) ) {
					alt153=1;
				}

				switch (alt153) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1417:28: bt+= behaviorTransition
					{
					pushFollow(FOLLOW_behaviorTransition_in_transitions10829);
					bt=behaviorTransition();
					state._fsp--;

					if (list_bt==null) list_bt=new ArrayList<Object>();
					list_bt.add(bt.getTemplate());
					}
					break;

				default :
					if ( cnt153 >= 1 ) break loop153;
					EarlyExitException eee = new EarlyExitException(153, input);
					throw eee;
				}
				cnt153++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1418:5: -> transitions(bt=$bt)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1421:1: behaviorTransition : ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(i=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st);
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
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1422:3: ( ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) ) -> behavior_transition(i=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1423:3: ^( TRANSITION ^( LABEL id= ID (pr= priority )? ) ^( SOURCE (ssi+= ID )+ ) ^( CONDITION (bc= behaviorCondition )? ) ^( DESTINATION dsi= ID ) ^( ACTION (s= behaviorActions )? ) ^( Q (q= assertion )? ) )
			{
			match(input,TRANSITION,FOLLOW_TRANSITION_in_behaviorTransition10862); 
			match(input, Token.DOWN, null); 
			match(input,LABEL,FOLLOW_LABEL_in_behaviorTransition10871); 
			match(input, Token.DOWN, null); 
			id=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10875); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:22: (pr= priority )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==LBRACKET) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1424:22: pr= priority
					{
					pushFollow(FOLLOW_priority_in_behaviorTransition10879);
					pr=priority();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			match(input,SOURCE,FOLLOW_SOURCE_in_behaviorTransition10891); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1425:18: (ssi+= ID )+
			int cnt155=0;
			loop155:
			while (true) {
				int alt155=2;
				int LA155_0 = input.LA(1);
				if ( (LA155_0==ID) ) {
					alt155=1;
				}

				switch (alt155) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1425:18: ssi+= ID
					{
					ssi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10895); 
					if (list_ssi==null) list_ssi=new ArrayList<Object>();
					list_ssi.add(ssi);
					}
					break;

				default :
					if ( cnt155 >= 1 ) break loop155;
					EarlyExitException eee = new EarlyExitException(155, input);
					throw eee;
				}
				cnt155++;
			}

			match(input, Token.UP, null); 

			match(input,CONDITION,FOLLOW_CONDITION_in_behaviorTransition10907); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1426:20: (bc= behaviorCondition )?
				int alt156=2;
				int LA156_0 = input.LA(1);
				if ( (LA156_0==AADL_STRING_LITERAL||(LA156_0 >= AL && LA156_0 <= AM)||LA156_0==AT_SIGN||LA156_0==CARET||LA156_0==DIVIDE||LA156_0==EQ||LA156_0==EXP||LA156_0==GT||LA156_0==ID||LA156_0==INVOKE||(LA156_0 >= LITERAL_abs && LA156_0 <= LITERAL_and)||(LA156_0 >= LITERAL_dispatch && LA156_0 <= LITERAL_div)||LA156_0==LITERAL_else||LA156_0==LITERAL_exists||LA156_0==LITERAL_false||(LA156_0 >= LITERAL_iff && LA156_0 <= LITERAL_in)||LA156_0==LITERAL_internal||LA156_0==LITERAL_mod||(LA156_0 >= LITERAL_not && LA156_0 <= LITERAL_numberof)||(LA156_0 >= LITERAL_on && LA156_0 <= LITERAL_or)||LA156_0==LITERAL_product||LA156_0==LITERAL_rem||LA156_0==LITERAL_round||LA156_0==LITERAL_sum||LA156_0==LITERAL_then||LA156_0==LITERAL_timeout||LA156_0==LITERAL_tops||(LA156_0 >= LITERAL_true && LA156_0 <= LITERAL_truncate)||(LA156_0 >= LITERAL_xor && LA156_0 <= LT)||LA156_0==MINUS||LA156_0==NEQ||LA156_0==OLD_NEQ||LA156_0==PLUS||LA156_0==PLUS_EQUALS||(LA156_0 >= QUANTITY && LA156_0 <= QUESTION)||LA156_0==RECORD_TERM||LA156_0==TICK||LA156_0==TIMES||LA156_0==UNARY_MINUS) ) {
					alt156=1;
				}
				switch (alt156) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1426:20: bc= behaviorCondition
						{
						pushFollow(FOLLOW_behaviorCondition_in_behaviorTransition10911);
						bc=behaviorCondition();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,DESTINATION,FOLLOW_DESTINATION_in_behaviorTransition10923); 
			match(input, Token.DOWN, null); 
			dsi=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTransition10927); 
			match(input, Token.UP, null); 

			match(input,ACTION,FOLLOW_ACTION_in_behaviorTransition10937); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1428:16: (s= behaviorActions )?
				int alt157=2;
				int LA157_0 = input.LA(1);
				if ( (LA157_0==ACTION||LA157_0==AMPERSAND||LA157_0==SEMICOLON) ) {
					alt157=1;
				}
				switch (alt157) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1428:16: s= behaviorActions
						{
						pushFollow(FOLLOW_behaviorActions_in_behaviorTransition10941);
						s=behaviorActions();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input,Q,FOLLOW_Q_in_behaviorTransition10953); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1429:11: (q= assertion )?
				int alt158=2;
				int LA158_0 = input.LA(1);
				if ( (LA158_0==ASSERTION||(LA158_0 >= ASSERTION_ENUMERATION && LA158_0 <= ASSERTION_FUNCTION)) ) {
					alt158=1;
				}
				switch (alt158) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1429:11: q= assertion
						{
						pushFollow(FOLLOW_assertion_in_behaviorTransition10957);
						q=assertion();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1430:5: -> behavior_transition(i=$id.textpr=$pr.stssi=$ssibc=$bc.stdsi=$dsi.textba=$s.stbtq=$q.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1434:1: priority : ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text);
	public final UnparseBLESS3.priority_return priority() throws RecognitionException {
		UnparseBLESS3.priority_return retval = new UnparseBLESS3.priority_return();
		retval.start = input.LT(1);

		BAST num=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1435:3: ( ^( LBRACKET num= NUMBER RBRACKET ) -> priority(num=$num.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1436:2: ^( LBRACKET num= NUMBER RBRACKET )
			{
			match(input,LBRACKET,FOLLOW_LBRACKET_in_priority11029); 
			match(input, Token.DOWN, null); 
			num=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_priority11033); 
			match(input,RBRACKET,FOLLOW_RBRACKET_in_priority11035); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1437:4: -> priority(num=$num.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1440:1: behaviorCondition : (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st});
	public final UnparseBLESS3.behaviorCondition_return behaviorCondition() throws RecognitionException {
		UnparseBLESS3.behaviorCondition_return retval = new UnparseBLESS3.behaviorCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope dc =null;
		TreeRuleReturnScope ec =null;
		TreeRuleReturnScope mc =null;
		TreeRuleReturnScope ic =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1441:3: (dc= dispatchCondition -> {$dc.st}|ec= executeCondition -> {$ec.st}|mc= modeCondition -> {$mc.st}|ic= internalCondition -> {$ic.st})
			int alt159=4;
			switch ( input.LA(1) ) {
			case LITERAL_dispatch:
				{
				alt159=1;
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
				alt159=2;
				}
				break;
			case LITERAL_on:
				{
				alt159=3;
				}
				break;
			case LITERAL_internal:
				{
				alt159=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 159, 0, input);
				throw nvae;
			}
			switch (alt159) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1442:3: dc= dispatchCondition
					{
					pushFollow(FOLLOW_dispatchCondition_in_behaviorCondition11066);
					dc=dispatchCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1443:5: -> {$dc.st}
					{
						retval.st = (dc!=null?((StringTemplate)dc.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1444:5: ec= executeCondition
					{
					pushFollow(FOLLOW_executeCondition_in_behaviorCondition11083);
					ec=executeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1445:5: -> {$ec.st}
					{
						retval.st = (ec!=null?((StringTemplate)ec.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1446:5: mc= modeCondition
					{
					pushFollow(FOLLOW_modeCondition_in_behaviorCondition11101);
					mc=modeCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1447:5: -> {$mc.st}
					{
						retval.st = (mc!=null?((StringTemplate)mc.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1448:5: ic= internalCondition
					{
					pushFollow(FOLLOW_internalCondition_in_behaviorCondition11119);
					ic=internalCondition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1449:5: -> {$ic.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1452:1: dispatchCondition : ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st);
	public final UnparseBLESS3.dispatchCondition_return dispatchCondition() throws RecognitionException {
		UnparseBLESS3.dispatchCondition_return retval = new UnparseBLESS3.dispatchCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope de =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1453:3: ( ^( LITERAL_dispatch (de= dispatchExpression )? ) -> dispatch_condition(dle=$de.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1454:3: ^( LITERAL_dispatch (de= dispatchExpression )? )
			{
			match(input,LITERAL_dispatch,FOLLOW_LITERAL_dispatch_in_dispatchCondition11147); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1454:25: (de= dispatchExpression )?
				int alt160=2;
				int LA160_0 = input.LA(1);
				if ( (LA160_0==ID||LA160_0==LITERAL_and||LA160_0==LITERAL_or||LA160_0==LITERAL_timeout) ) {
					alt160=1;
				}
				switch (alt160) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1454:25: de= dispatchExpression
						{
						pushFollow(FOLLOW_dispatchExpression_in_dispatchCondition11151);
						de=dispatchExpression();
						state._fsp--;

						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1455:5: -> dispatch_condition(dle=$de.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1458:1: executeCondition : exp= expression -> {$exp.st};
	public final UnparseBLESS3.executeCondition_return executeCondition() throws RecognitionException {
		UnparseBLESS3.executeCondition_return retval = new UnparseBLESS3.executeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope exp =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1459:3: (exp= expression -> {$exp.st})
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1460:3: exp= expression
			{
			pushFollow(FOLLOW_expression_in_executeCondition11188);
			exp=expression();
			state._fsp--;

			// TEMPLATE REWRITE
			// 1461:5: -> {$exp.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1464:1: modeCondition : ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st);
	public final UnparseBLESS3.modeCondition_return modeCondition() throws RecognitionException {
		UnparseBLESS3.modeCondition_return retval = new UnparseBLESS3.modeCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1465:3: ( ^( LITERAL_on tle= triggerLogicalExpression ) -> mode_condition(tle=$tle.st))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1466:3: ^( LITERAL_on tle= triggerLogicalExpression )
			{
			match(input,LITERAL_on,FOLLOW_LITERAL_on_in_modeCondition11217); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_triggerLogicalExpression_in_modeCondition11221);
			tle=triggerLogicalExpression();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1467:5: -> mode_condition(tle=$tle.st)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1470:1: internalCondition : ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports);
	public final UnparseBLESS3.internalCondition_return internalCondition() throws RecognitionException {
		UnparseBLESS3.internalCondition_return retval = new UnparseBLESS3.internalCondition_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1471:3: ( ^( LITERAL_internal (ports+= ID )+ ) -> internal_condition(p=$ports))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1472:3: ^( LITERAL_internal (ports+= ID )+ )
			{
			match(input,LITERAL_internal,FOLLOW_LITERAL_internal_in_internalCondition11255); 
			match(input, Token.DOWN, null); 
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1472:28: (ports+= ID )+
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
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1472:28: ports+= ID
					{
					ports=(BAST)match(input,ID,FOLLOW_ID_in_internalCondition11259); 
					if (list_ports==null) list_ports=new ArrayList<Object>();
					list_ports.add(ports);
					}
					break;

				default :
					if ( cnt161 >= 1 ) break loop161;
					EarlyExitException eee = new EarlyExitException(161, input);
					throw eee;
				}
				cnt161++;
			}

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 1473:5: -> internal_condition(p=$ports)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1476:1: dispatchExpression : ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st});
	public final UnparseBLESS3.dispatchExpression_return dispatchExpression() throws RecognitionException {
		UnparseBLESS3.dispatchExpression_return retval = new UnparseBLESS3.dispatchExpression_return();
		retval.start = input.LT(1);

		List<Object> list_dc=null;
		TreeRuleReturnScope c =null;
		RuleReturnScope dc = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1477:3: ( ^( LITERAL_or (dc+= dispatchConjunction )+ ) -> disjunction(bopt=$dc)|c= dispatchConjunction -> {$c.st})
			int alt163=2;
			int LA163_0 = input.LA(1);
			if ( (LA163_0==LITERAL_or) ) {
				alt163=1;
			}
			else if ( (LA163_0==ID||LA163_0==LITERAL_and||LA163_0==LITERAL_timeout) ) {
				alt163=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 163, 0, input);
				throw nvae;
			}

			switch (alt163) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1478:3: ^( LITERAL_or (dc+= dispatchConjunction )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_dispatchExpression11295); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1478:19: (dc+= dispatchConjunction )+
					int cnt162=0;
					loop162:
					while (true) {
						int alt162=2;
						int LA162_0 = input.LA(1);
						if ( (LA162_0==ID||LA162_0==LITERAL_and||LA162_0==LITERAL_timeout) ) {
							alt162=1;
						}

						switch (alt162) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1478:19: dc+= dispatchConjunction
							{
							pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression11299);
							dc=dispatchConjunction();
							state._fsp--;

							if (list_dc==null) list_dc=new ArrayList<Object>();
							list_dc.add(dc.getTemplate());
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
					// 1479:5: -> disjunction(bopt=$dc)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_dc));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1481:3: c= dispatchConjunction
					{
					pushFollow(FOLLOW_dispatchConjunction_in_dispatchExpression11325);
					c=dispatchConjunction();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1482:5: -> {$c.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1485:1: dispatchConjunction : ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st});
	public final UnparseBLESS3.dispatchConjunction_return dispatchConjunction() throws RecognitionException {
		UnparseBLESS3.dispatchConjunction_return retval = new UnparseBLESS3.dispatchConjunction_return();
		retval.start = input.LT(1);

		List<Object> list_tr=null;
		TreeRuleReturnScope t =null;
		RuleReturnScope tr = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1486:3: ( ^( LITERAL_and (tr+= dispatchTrigger )+ ) -> conjunction(bopt=$tr)|t= dispatchTrigger -> {$t.st})
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==LITERAL_and) ) {
				alt165=1;
			}
			else if ( (LA165_0==ID||LA165_0==LITERAL_timeout) ) {
				alt165=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 165, 0, input);
				throw nvae;
			}

			switch (alt165) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1487:3: ^( LITERAL_and (tr+= dispatchTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_dispatchConjunction11356); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1487:20: (tr+= dispatchTrigger )+
					int cnt164=0;
					loop164:
					while (true) {
						int alt164=2;
						int LA164_0 = input.LA(1);
						if ( (LA164_0==ID||LA164_0==LITERAL_timeout) ) {
							alt164=1;
						}

						switch (alt164) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1487:20: tr+= dispatchTrigger
							{
							pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction11360);
							tr=dispatchTrigger();
							state._fsp--;

							if (list_tr==null) list_tr=new ArrayList<Object>();
							list_tr.add(tr.getTemplate());
							}
							break;

						default :
							if ( cnt164 >= 1 ) break loop164;
							EarlyExitException eee = new EarlyExitException(164, input);
							throw eee;
						}
						cnt164++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1488:5: -> conjunction(bopt=$tr)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_tr));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1490:3: t= dispatchTrigger
					{
					pushFollow(FOLLOW_dispatchTrigger_in_dispatchConjunction11386);
					t=dispatchTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1491:5: -> {$t.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1494:1: dispatchTrigger : (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports));
	public final UnparseBLESS3.dispatchTrigger_return dispatchTrigger() throws RecognitionException {
		UnparseBLESS3.dispatchTrigger_return retval = new UnparseBLESS3.dispatchTrigger_return();
		retval.start = input.LT(1);

		BAST ports=null;
		List<Object> list_ports=null;
		TreeRuleReturnScope port =null;
		TreeRuleReturnScope time =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1495:3: (port= portName -> {$port.st}| ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? ) -> timeout(bt=$time.stp=$ports))
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==ID) ) {
				alt169=1;
			}
			else if ( (LA169_0==LITERAL_timeout) ) {
				alt169=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 169, 0, input);
				throw nvae;
			}

			switch (alt169) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1496:3: port= portName
					{
					pushFollow(FOLLOW_portName_in_dispatchTrigger11412);
					port=portName();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1497:5: -> {$port.st}
					{
						retval.st = (port!=null?((StringTemplate)port.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:3: ^( LITERAL_timeout ( ^( LPAREN (ports+= ID )* ) )? (time= behaviorTime )? )
					{
					match(input,LITERAL_timeout,FOLLOW_LITERAL_timeout_in_dispatchTrigger11430); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:22: ( ^( LPAREN (ports+= ID )* ) )?
						int alt167=2;
						int LA167_0 = input.LA(1);
						if ( (LA167_0==LPAREN) ) {
							alt167=1;
						}
						switch (alt167) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:24: ^( LPAREN (ports+= ID )* )
								{
								match(input,LPAREN,FOLLOW_LPAREN_in_dispatchTrigger11436); 
								if ( input.LA(1)==Token.DOWN ) {
									match(input, Token.DOWN, null); 
									// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:39: (ports+= ID )*
									loop166:
									while (true) {
										int alt166=2;
										int LA166_0 = input.LA(1);
										if ( (LA166_0==ID) ) {
											alt166=1;
										}

										switch (alt166) {
										case 1 :
											// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:39: ports+= ID
											{
											ports=(BAST)match(input,ID,FOLLOW_ID_in_dispatchTrigger11440); 
											if (list_ports==null) list_ports=new ArrayList<Object>();
											list_ports.add(ports);
											}
											break;

										default :
											break loop166;
										}
									}

									match(input, Token.UP, null); 
								}

								}
								break;

						}

						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:54: (time= behaviorTime )?
						int alt168=2;
						int LA168_0 = input.LA(1);
						if ( (LA168_0==BEHAVIOR_TIME) ) {
							alt168=1;
						}
						switch (alt168) {
							case 1 :
								// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1499:54: time= behaviorTime
								{
								pushFollow(FOLLOW_behaviorTime_in_dispatchTrigger11450);
								time=behaviorTime();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 1500:5: -> timeout(bt=$time.stp=$ports)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1503:1: behaviorTime : ( ^( BEHAVIOR_TIME q= quantity ) -> {$q.st}| ^( BEHAVIOR_TIME vn= valueName (u= ID |s= LITERAL_scalar |w= LITERAL_whole )? ) -> template(vn=$vn.stu=$u.texts=$s.textw=$w.text) \"<vn> <u><s><w>\");
	public final UnparseBLESS3.behaviorTime_return behaviorTime() throws RecognitionException {
		UnparseBLESS3.behaviorTime_return retval = new UnparseBLESS3.behaviorTime_return();
		retval.start = input.LT(1);

		BAST u=null;
		BAST s=null;
		BAST w=null;
		TreeRuleReturnScope q =null;
		TreeRuleReturnScope vn =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1503:13: ( ^( BEHAVIOR_TIME q= quantity ) -> {$q.st}| ^( BEHAVIOR_TIME vn= valueName (u= ID |s= LITERAL_scalar |w= LITERAL_whole )? ) -> template(vn=$vn.stu=$u.texts=$s.textw=$w.text) \"<vn> <u><s><w>\")
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==BEHAVIOR_TIME) ) {
				int LA171_1 = input.LA(2);
				if ( (LA171_1==DOWN) ) {
					int LA171_2 = input.LA(3);
					if ( (LA171_2==QUANTITY) ) {
						alt171=1;
					}
					else if ( (LA171_2==ID||LA171_2==QUESTION||LA171_2==TICK) ) {
						alt171=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 171, 2, input);
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
							new NoViableAltException("", 171, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 171, 0, input);
				throw nvae;
			}

			switch (alt171) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1504:3: ^( BEHAVIOR_TIME q= quantity )
					{
					match(input,BEHAVIOR_TIME,FOLLOW_BEHAVIOR_TIME_in_behaviorTime11484); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_quantity_in_behaviorTime11488);
					q=quantity();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1505:5: -> {$q.st}
					{
						retval.st = (q!=null?((StringTemplate)q.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:6: ^( BEHAVIOR_TIME vn= valueName (u= ID |s= LITERAL_scalar |w= LITERAL_whole )? )
					{
					match(input,BEHAVIOR_TIME,FOLLOW_BEHAVIOR_TIME_in_behaviorTime11507); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_valueName_in_behaviorTime11512);
					vn=valueName();
					state._fsp--;

					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:37: (u= ID |s= LITERAL_scalar |w= LITERAL_whole )?
					int alt170=4;
					switch ( input.LA(1) ) {
						case ID:
							{
							alt170=1;
							}
							break;
						case LITERAL_scalar:
							{
							alt170=2;
							}
							break;
						case LITERAL_whole:
							{
							alt170=3;
							}
							break;
					}
					switch (alt170) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:39: u= ID
							{
							u=(BAST)match(input,ID,FOLLOW_ID_in_behaviorTime11518); 
							}
							break;
						case 2 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:46: s= LITERAL_scalar
							{
							s=(BAST)match(input,LITERAL_scalar,FOLLOW_LITERAL_scalar_in_behaviorTime11524); 
							}
							break;
						case 3 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1506:65: w= LITERAL_whole
							{
							w=(BAST)match(input,LITERAL_whole,FOLLOW_LITERAL_whole_in_behaviorTime11530); 
							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1507:5: -> template(vn=$vn.stu=$u.texts=$s.textw=$w.text) \"<vn> <u><s><w>\"
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1510:1: portName : ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text);
	public final UnparseBLESS3.portName_return portName() throws RecognitionException {
		UnparseBLESS3.portName_return retval = new UnparseBLESS3.portName_return();
		retval.start = input.LT(1);

		BAST port=null;
		BAST index=null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1511:3: ( ^(port= ID (index= NUMBER )? ) -> port_name(port=$port.textindex=$index.text))
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1512:3: ^(port= ID (index= NUMBER )? )
			{
			port=(BAST)match(input,ID,FOLLOW_ID_in_portName11587); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1512:19: (index= NUMBER )?
				int alt172=2;
				int LA172_0 = input.LA(1);
				if ( (LA172_0==NUMBER) ) {
					alt172=1;
				}
				switch (alt172) {
					case 1 :
						// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1512:19: index= NUMBER
						{
						index=(BAST)match(input,NUMBER,FOLLOW_NUMBER_in_portName11591); 
						}
						break;

				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 1513:5: -> port_name(port=$port.textindex=$index.text)
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1516:1: triggerLogicalExpression : ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st});
	public final UnparseBLESS3.triggerLogicalExpression_return triggerLogicalExpression() throws RecognitionException {
		UnparseBLESS3.triggerLogicalExpression_return retval = new UnparseBLESS3.triggerLogicalExpression_return();
		retval.start = input.LT(1);

		List<Object> list_et=null;
		TreeRuleReturnScope first =null;
		RuleReturnScope et = null;
		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1517:3: ( ^( LITERAL_and (et+= eventTrigger )+ ) -> conjunction(bopt=$et)| ^( LITERAL_or (et+= eventTrigger )+ ) -> disjunction(bopt=$et)| ^( LITERAL_xor (et+= eventTrigger )+ ) -> xor(terms=$et)| ^( LITERAL_then (et+= eventTrigger )+ ) -> cand(t=$et)| ^( LITERAL_else (et+= eventTrigger )+ ) -> cor(t=$et)|first= eventTrigger -> {$first.st})
			int alt178=6;
			switch ( input.LA(1) ) {
			case LITERAL_and:
				{
				alt178=1;
				}
				break;
			case LITERAL_or:
				{
				alt178=2;
				}
				break;
			case LITERAL_xor:
				{
				alt178=3;
				}
				break;
			case LITERAL_then:
				{
				alt178=4;
				}
				break;
			case LITERAL_else:
				{
				alt178=5;
				}
				break;
			case DOT:
			case LPAREN:
				{
				alt178=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 178, 0, input);
				throw nvae;
			}
			switch (alt178) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:3: ^( LITERAL_and (et+= eventTrigger )+ )
					{
					match(input,LITERAL_and,FOLLOW_LITERAL_and_in_triggerLogicalExpression11628); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:20: (et+= eventTrigger )+
					int cnt173=0;
					loop173:
					while (true) {
						int alt173=2;
						int LA173_0 = input.LA(1);
						if ( (LA173_0==DOT||LA173_0==LPAREN) ) {
							alt173=1;
						}

						switch (alt173) {
						case 1 :
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1518:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11632);
							et=eventTrigger();
							state._fsp--;

							if (list_et==null) list_et=new ArrayList<Object>();
							list_et.add(et.getTemplate());
							}
							break;

						default :
							if ( cnt173 >= 1 ) break loop173;
							EarlyExitException eee = new EarlyExitException(173, input);
							throw eee;
						}
						cnt173++;
					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1519:5: -> conjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("conjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1521:3: ^( LITERAL_or (et+= eventTrigger )+ )
					{
					match(input,LITERAL_or,FOLLOW_LITERAL_or_in_triggerLogicalExpression11659); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1521:19: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1521:19: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11663);
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
					// 1522:5: -> disjunction(bopt=$et)
					{
						retval.st = templateLib.getInstanceOf("disjunction",new STAttrMap().put("bopt", list_et));
					}



					}
					break;
				case 3 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1524:3: ^( LITERAL_xor (et+= eventTrigger )+ )
					{
					match(input,LITERAL_xor,FOLLOW_LITERAL_xor_in_triggerLogicalExpression11690); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1524:20: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1524:20: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11694);
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
					// 1525:5: -> xor(terms=$et)
					{
						retval.st = templateLib.getInstanceOf("xor",new STAttrMap().put("terms", list_et));
					}



					}
					break;
				case 4 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1527:3: ^( LITERAL_then (et+= eventTrigger )+ )
					{
					match(input,LITERAL_then,FOLLOW_LITERAL_then_in_triggerLogicalExpression11721); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1527:21: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1527:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11725);
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
					// 1528:5: -> cand(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cand",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 5 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1530:3: ^( LITERAL_else (et+= eventTrigger )+ )
					{
					match(input,LITERAL_else,FOLLOW_LITERAL_else_in_triggerLogicalExpression11752); 
					match(input, Token.DOWN, null); 
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1530:21: (et+= eventTrigger )+
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
							// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1530:21: et+= eventTrigger
							{
							pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11756);
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
					// 1531:5: -> cor(t=$et)
					{
						retval.st = templateLib.getInstanceOf("cor",new STAttrMap().put("t", list_et));
					}



					}
					break;
				case 6 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1533:3: first= eventTrigger
					{
					pushFollow(FOLLOW_eventTrigger_in_triggerLogicalExpression11782);
					first=eventTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1534:5: -> {$first.st}
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
	// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1537:1: eventTrigger : (tr= modeTrigger -> {$tr.st}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st));
	public final UnparseBLESS3.eventTrigger_return eventTrigger() throws RecognitionException {
		UnparseBLESS3.eventTrigger_return retval = new UnparseBLESS3.eventTrigger_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope tr =null;
		TreeRuleReturnScope tle =null;

		try {
			// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1538:3: (tr= modeTrigger -> {$tr.st}| ^( LPAREN tle= triggerLogicalExpression RPAREN ) -> parentheses(be=$tle.st))
			int alt179=2;
			int LA179_0 = input.LA(1);
			if ( (LA179_0==DOT) ) {
				alt179=1;
			}
			else if ( (LA179_0==LPAREN) ) {
				alt179=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 179, 0, input);
				throw nvae;
			}

			switch (alt179) {
				case 1 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1539:3: tr= modeTrigger
					{
					pushFollow(FOLLOW_modeTrigger_in_eventTrigger11807);
					tr=modeTrigger();
					state._fsp--;

					// TEMPLATE REWRITE
					// 1540:5: -> {$tr.st}
					{
						retval.st = (tr!=null?((StringTemplate)tr.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// /Users/brianlarson/git2/BLESS-IDE/bless/Grammars/UnparseBLESS3.g:1542:3: ^( LPAREN tle= triggerLogicalExpression RPAREN )
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_eventTrigger11826); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_triggerLogicalExpression_in_eventTrigger11830);
					tle=triggerLogicalExpression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_eventTrigger11832); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 1543:5: -> parentheses(be=$tle.st)
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
	protected DFA87 dfa87 = new DFA87(this);
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
			return "350:1: quantityType : ( ^( LITERAL_quantity unit= ID ) -> quantity_type(unit=$unit.text)| ^( LITERAL_quantity scalar= LITERAL_scalar ) -> quantity_type(scalar=$scalar.text)| ^( LITERAL_quantity whole= LITERAL_whole ) -> quantity_type(whole=$whole.text)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.st)| ^( LITERAL_quantity unit= ID ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textrepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textrepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textrepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.strepresentation=$representation.st)| ^( LITERAL_quantity unit= ID ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(unit=$unit.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity scalar= LITERAL_scalar ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(scalar=$scalar.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st)| ^( LITERAL_quantity whole= LITERAL_whole ^( DOTDOT lb= aNumber ub= aNumber ) ^( LITERAL_step step= aNumber ) ^( LITERAL_representation representation= propertyName ) ) -> quantity_type(whole=$whole.textlb=$lb.stub=$ub.ststep=$step.strepresentation=$representation.st));";
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
			return "1029:1: quantity : ( ^( QUANTITY num= aNumber ) -> {$num.st}| ^( QUANTITY num= aNumber unit= ID ) -> template(number=$num.stunit=$unit.text) \"<number> <unit>\"| ^( QUANTITY num= aNumber LITERAL_scalar ) -> template(number=$num.st) \"<number> scalar\"| ^( QUANTITY num= aNumber LITERAL_whole ) -> template(number=$num.st) \"<number> whole\");";
		}
	}

	static final String DFA87_eotS =
		"\47\uffff";
	static final String DFA87_eofS =
		"\47\uffff";
	static final String DFA87_minS =
		"\1\u00b1\1\2\2\47\3\2\1\63\1\44\1\2\1\63\1\3\1\2\2\63\1\3\1\2\1\47\2\63"+
		"\3\3\1\63\3\3\2\uffff\3\3\2\uffff\1\3\1\47\2\uffff\1\47";
	static final String DFA87_maxS =
		"\1\u00b1\1\2\1\u0085\1\47\1\2\1\47\1\2\1\63\1\44\1\2\2\63\1\2\3\63\1\2"+
		"\1\47\2\63\1\3\1\71\2\63\2\3\1\71\2\uffff\2\3\1\71\2\uffff\1\3\1\47\2"+
		"\uffff\1\47";
	static final String DFA87_acceptS =
		"\33\uffff\1\1\1\2\3\uffff\1\3\1\4\2\uffff\1\5\1\6\1\uffff";
	static final String DFA87_specialS =
		"\47\uffff}>";
	static final String[] DFA87_transitionS = {
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

	static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
	static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
	static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
	static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
	static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
	static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
	static final short[][] DFA87_transition;

	static {
		int numStates = DFA87_transitionS.length;
		DFA87_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
		}
	}

	protected class DFA87 extends DFA {

		public DFA87(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 87;
			this.eot = DFA87_eot;
			this.eof = DFA87_eof;
			this.min = DFA87_min;
			this.max = DFA87_max;
			this.accept = DFA87_accept;
			this.special = DFA87_special;
			this.transition = DFA87_transition;
		}
		@Override
		public String getDescription() {
			return "1053:1: propertyReference : ( ^(oct= OCTOTHORPE pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.st)| ^(oct= OCTOTHORPE pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))} -> property_reference(pname=$pname.stf=$field)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.st)| ^(oct= OCTOTHORPE self= LITERAL_self pname= propertyName (field+= propertyField )+ ) -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))} -> property_reference(component=$self.textpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName ) -> property_reference(component=$component.stpname=$pname.stf=$field)| ^(oct= OCTOTHORPE component= componentName pname= propertyName (field+= propertyField )+ ) -> property_reference(component=$component.stpname=$pname.stf=$field));";
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
	public static final BitSet FOLLOW_LITERAL_enumeration_in_enumerationType1010 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationType1014 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1082 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1140 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1143 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1147 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1191 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1194 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1198 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1202 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1242 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1249 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1293 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1296 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1300 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1308 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1312 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1357 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1360 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1364 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1417 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1421 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1428 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1574 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1610 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1614 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1617 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1621 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1625 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1633 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1675 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1679 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1686 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1694 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1698 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1744 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1751 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1755 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1763 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_quantityType1809 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1812 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1816 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1824 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1828 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1836 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantityType1887 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1890 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1894 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1898 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1902 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1906 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1914 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_quantity_in_quantityType1961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantityType1965 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_DOTDOT_in_quantityType1968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1972 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_step_in_quantityType1980 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantityType1984 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_representation_in_quantityType1988 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_quantityType1992 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_array_in_arrayType2048 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRangeList_in_arrayType2052 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_arrayType2054 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_arrayType2058 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_arrayRangeList2105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayRange_in_arrayRangeList2109 = new BitSet(new long[]{0x000000C000000008L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_arrayRange2158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2162 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000000L,0x0002800000000000L});
	public static final BitSet FOLLOW_aNumber_in_arrayRange2166 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_record_in_recordType2203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2207 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_LITERAL_variant_in_recordType2234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recordField_in_recordType2238 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_COLON_in_recordField2275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordField2279 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_recordField2283 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariables_in_assertionLibrary2324 = new BitSet(new long[]{0x000000000000D000L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2328 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_ASSERTION_ANNEX_in_assertionLibrary2355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertionLibrary2359 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_LITERAL_ghost_in_ghostVariables2395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ghostVariable_in_ghostVariables2399 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
	public static final BitSet FOLLOW_LITERAL_def_in_ghostVariable2432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_ghostVariable2437 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_ghostVariable2441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2486 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2492 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namedAssertion2522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2536 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2540 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_predicate_in_namedAssertion2546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2589 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2605 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namedAssertion2640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2648 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PARAMETERS_in_namedAssertion2654 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableList_in_namedAssertion2658 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namedAssertion2664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namedAssertion2668 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namedAssertion2674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namedAssertion2714 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_namedAssertion2718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2722 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TILDE_in_namedAssertion2728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2732 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_namedAssertion2736 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionEnumeration_in_namedAssertion2742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variable_in_variableList2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_variableList2809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableList2813 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_TILDE_in_variable2847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_variable2851 = new BitSet(new long[]{0x0008000000000000L,0xA020000000800042L,0x0000000200002000L});
	public static final BitSet FOLLOW_typeOrReference_in_variable2855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_conditionalAssertionFunction_in_assertionFunctionValue2892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assertionFunctionValue2908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONDITIONAL_ASSERTION_FUNCTION_in_conditionalAssertionFunction2935 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionValuePair_in_conditionalAssertionFunction2939 = new BitSet(new long[]{0x0000000080000008L});
	public static final BitSet FOLLOW_CVP_in_conditionValuePair2973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_conditionValuePair2977 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_conditionValuePair2981 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3020 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_assertionEnumeration3024 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_ARROW_in_assertionEnumeration3050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_enumerationPair_in_assertionEnumeration3054 = new BitSet(new long[]{0x0010000000000008L});
	public static final BitSet FOLLOW_IMP_in_enumerationPair3089 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationPair3093 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_predicate_in_enumerationPair3097 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_enumerationValue3136 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3140 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_enumerationValue3144 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3214 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_actualParameter_in_invocation3218 = new BitSet(new long[]{0x0000000001000008L});
	public static final BitSet FOLLOW_INVOKE_in_invocation3249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_invocation3253 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_invocation3257 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COLON_in_actualParameter3294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_actualParameter3298 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_actualParameter3302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_namelessAssertion3345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_in_namelessAssertion3370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DUMMY_in_namelessAssertion3372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_FUNCTION_in_namelessFunction3395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_returns_in_namelessFunction3399 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeOrReference_in_namelessFunction3403 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertionFunctionValue_in_namelessFunction3409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSERTION_ENUMERATION_in_namelessEnumeration3447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_invocation_in_namelessEnumeration3451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_namedAssertion_in_assertion3480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessAssertion_in_assertion3496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessFunction_in_assertion3512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_namelessEnumeration_in_assertion3528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalQuantification_in_expression3560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialQuantification_in_expression3576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sumQuantification_in_expression3592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_productQuantification_in_expression3608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_countingQuantification_in_expression3624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_iff_in_expression3642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3646 = new BitSet(new long[]{0x5049500400820310L,0x023A040010500000L,0x60A4538003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_disjunction_in_expression3650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_implies_in_expression3685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_disjunction_in_expression3689 = new BitSet(new long[]{0x5049500400820310L,0x023A040010500000L,0x60A4538003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_disjunction_in_expression3693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_disjunction_in_expression3726 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_all_in_universalQuantification3753 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_universalQuantification3757 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_universalQuantification3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_LITERAL_are_in_universalQuantification3765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_universalQuantification3769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_in_which3818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_range_in_in_which3822 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_which_in_in_which3849 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_in_which3853 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_exists_in_existentialQuantification3889 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_existentialQuantification3893 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_existentialQuantification3897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_that_in_existentialQuantification3901 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_predicate_in_existentialQuantification3905 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_sum_in_sumQuantification3956 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_sumQuantification3960 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_sumQuantification3964 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_sumQuantification3968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_sumQuantification3972 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_product_in_productQuantification4024 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_productQuantification4028 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_productQuantification4032 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
	public static final BitSet FOLLOW_LITERAL_of_in_productQuantification4036 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_productQuantification4040 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_numberof_in_countingQuantification4091 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_logicVariables_in_countingQuantification4095 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_in_which_in_countingQuantification4099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_LITERAL_that_in_countingQuantification4103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_countingQuantification4107 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_logicVariables4154 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_logicVariables4158 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_variable_in_logicVariables4184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_or_in_disjunction4213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4217 = new BitSet(new long[]{0x5049500400820318L,0x003A040010100000L,0x60A4530003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_else_in_disjunction4243 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4247 = new BitSet(new long[]{0x5049500400820318L,0x003A040010100000L,0x60A4530003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_xor_in_disjunction4273 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4277 = new BitSet(new long[]{0x5049500400820318L,0x003A040010100000L,0x60A4530003520009L,0x0000000000025008L});
	public static final BitSet FOLLOW_conjunction_in_disjunction4303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_conjunction4331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4335 = new BitSet(new long[]{0x1049500400820318L,0x003A040010100000L,0x60A4530003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_then_in_conjunction4361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_relation_in_conjunction4365 = new BitSet(new long[]{0x1049500400820318L,0x003A040010100000L,0x60A4530003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_relation_in_conjunction4391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_relation4420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4425 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4429 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_relation4466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4471 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AM_in_relation4513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4518 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AL_in_relation4560 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4565 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_relation4607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4612 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4616 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_EQUALS_in_relation4654 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4659 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_relation4701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4706 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_NEQ_in_relation4747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4752 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6020110003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_addSub_in_relation4756 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_in_in_relation4791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_addSub_in_relation4795 = new BitSet(new long[]{0x0000006018000000L});
	public static final BitSet FOLLOW_range_in_relation4799 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_addSub_in_relation4833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOTDOT_in_range4860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4864 = new BitSet(new long[]{0x1048000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range4868 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMADOT_in_range4906 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4910 = new BitSet(new long[]{0x1048000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range4914 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTCOMMA_in_range4952 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range4956 = new BitSet(new long[]{0x1048000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range4960 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMACOMMA_in_range4998 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_range5002 = new BitSet(new long[]{0x1048000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_range5006 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_addSub5049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub5053 = new BitSet(new long[]{0x1048400400820018L,0x003A000010100000L,0x6000010003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_MINUS_in_addSub5079 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_multDiv_in_addSub5083 = new BitSet(new long[]{0x1048400400820010L,0x003A000010100000L,0x6000010003500009L,0x0000000000025008L});
	public static final BitSet FOLLOW_multDiv_in_addSub5087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_multDiv_in_addSub5119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_multDiv5150 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5154 = new BitSet(new long[]{0x1048400000820018L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_DIVIDE_in_multDiv5180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5184 = new BitSet(new long[]{0x1048400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5188 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_multDiv5220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5224 = new BitSet(new long[]{0x1048400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_multDiv5260 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5264 = new BitSet(new long[]{0x1048400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_multDiv5300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5304 = new BitSet(new long[]{0x1048400000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5308 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_exponentiation_in_multDiv5340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXP_in_exponentiation5372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5376 = new BitSet(new long[]{0x1048000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subexpression_in_exponentiation5412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_not_in_subexpression5443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5447 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_subexpression5479 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5483 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_abs_in_subexpression5515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_truncate_in_subexpression5551 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_round_in_subexpression5587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5591 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedExpression_in_subexpression5621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TICK_in_timedExpression5651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5655 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_SIGN_in_timedExpression5680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5684 = new BitSet(new long[]{0x1048000000820010L,0x0038000010000000L,0x6000010003500008L,0x0000000000021008L});
	public static final BitSet FOLLOW_subexpression_in_timedExpression5688 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CARET_in_timedExpression5718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5722 = new BitSet(new long[]{0x0008000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_timedExpression5726 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_timedSubject_in_timedExpression5756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionalExpression_in_timedSubject5783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_timedSubject5798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_recordTerm_in_timedSubject5815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_invocation_in_timedSubject5831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_timedSubject5849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_value_in_periodShift5882 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_periodShift5914 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5924 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_value_in_periodShift5956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_periodShift5974 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_periodShift5978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_periodShift5980 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_indexExpression6016 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6020 = new BitSet(new long[]{0x0008000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6024 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_div_in_indexExpression6058 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6062 = new BitSet(new long[]{0x0008000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6066 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_mod_in_indexExpression6100 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6104 = new BitSet(new long[]{0x0008000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6108 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_rem_in_indexExpression6142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6146 = new BitSet(new long[]{0x0008000000000010L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6150 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_in_indexExpression6182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6186 = new BitSet(new long[]{0x0008000000000018L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_TIMES_in_indexExpression6212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6216 = new BitSet(new long[]{0x0008000000000018L,0x0030000010000000L,0x6000010001500000L,0x0000000000021000L});
	public static final BitSet FOLLOW_periodShift_in_indexExpression6243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_conditionalExpression6270 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQ_in_conditionalExpression6274 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6278 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6282 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_conditionalExpression6286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RPAREN_in_conditionalExpression6291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_parenthesizedSubexpression6341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6343 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_parenthesizedSubexpression6372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseExpression_in_parenthesizedSubexpression6376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_parenthesizedSubexpression6378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_case_in_caseExpression6412 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseChoice_in_caseExpression6416 = new BitSet(new long[]{0x0010000000000008L});
	public static final BitSet FOLLOW_IMP_in_caseChoice6449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_caseChoice6453 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_caseChoice6457 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RECORD_TERM_in_recordTerm6498 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordTerm6502 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_recordValue_in_recordTerm6506 = new BitSet(new long[]{0x0000000000000808L});
	public static final BitSet FOLLOW_ARROW_in_recordValue6545 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_recordValue6549 = new BitSet(new long[]{0x0008000000000010L,0x0030000010000000L,0x6000000001500000L,0x0000000000001000L});
	public static final BitSet FOLLOW_value_in_recordValue6553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_predicate6592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_value6621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enumerationValue_in_value6639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_value6657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_value6675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_now_in_value6693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_tops_in_value6711 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_valueName6738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOLLAR_in_valueName6740 = new BitSet(new long[]{0x0000000005000000L});
	public static final BitSet FOLLOW_functionParameters_in_valueName6744 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_valueName6780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_valueName6784 = new BitSet(new long[]{0x0008004000000018L,0x0032000010100000L,0x6020110001500001L,0x0000000000025000L});
	public static final BitSet FOLLOW_DOT_in_valueName6791 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6795 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName6836 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOT_in_valueName6840 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_partialName_in_valueName6844 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_QUESTION_in_valueName6880 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6884 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6915 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_fresh_in_valueName6917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6942 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_LITERAL_count_in_valueName6948 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_valueName6973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_valueName6977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
	public static final BitSet FOLLOW_LITERAL_updated_in_valueName6979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_valueName7004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_functionParameters7029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters7033 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalExpressionPair_in_functionParameters7058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalExpressionPair7083 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalExpressionPair7087 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_formalExpressionPair7091 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOTDOT_in_indexExpressionOrRange7134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange7138 = new BitSet(new long[]{0x0008000000000010L,0x0032000010100000L,0x6020110001500001L,0x0000000000025000L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange7142 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_indexExpression_in_indexExpressionOrRange7177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_partialName7204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LBRACKET_in_partialName7208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_indexExpressionOrRange_in_partialName7212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_partialName7244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_constant7271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_constant7289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_true_in_constant7307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_false_in_constant7325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_null_in_constant7343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7368 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7396 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_quantity7400 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_quantity7438 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUANTITY_in_quantity7465 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_aNumber_in_quantity7469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_LITERAL_whole_in_quantity7471 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NUMBER_in_aNumber7506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyReference_in_aNumber7520 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_propertyName_in_aNumber7534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7566 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7570 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7607 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7611 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7615 = new BitSet(new long[]{0x0200001000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7661 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7707 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_self_in_propertyReference7711 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7715 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7719 = new BitSet(new long[]{0x0200001000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7765 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_componentName_in_propertyReference7769 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7773 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OCTOTHORPE_in_propertyReference7808 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_componentName_in_propertyReference7812 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_propertyName_in_propertyReference7816 = new BitSet(new long[]{0x0200001000000000L});
	public static final BitSet FOLLOW_propertyField_in_propertyReference7820 = new BitSet(new long[]{0x0200001000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7862 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_propertyField7866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_propertyField7891 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7895 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7920 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_propertyField7924 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_upper_bound_in_propertyField7953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_in_propertyField7977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_lower_bound_in_propertyField7979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_SUBCLAUSE_in_actionSubclause8014 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_actionSubclause8019 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000004L,0x0000000000080000L});
	public static final BitSet FOLLOW_throwsClause_in_actionSubclause8026 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000004L});
	public static final BitSet FOLLOW_assertClause_in_actionSubclause8033 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_LITERAL_pre_in_actionSubclause8044 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause8049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_post_in_actionSubclause8061 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause8066 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_actionSubclause8079 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_actionSubclause8084 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_actionSubclause8097 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_throws_in_throwsClause8170 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_throwsClause8174 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_LITERAL_assert_in_assertClause8207 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAssertion_in_assertClause8211 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_LCURLY_in_existentialLatticeQuantification8244 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantifiedVariables_in_existentialLatticeQuantification8250 = new BitSet(new long[]{0x0000000000000440L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_behaviorActions_in_existentialLatticeQuantification8257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_RCURLY_in_existentialLatticeQuantification8259 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000800L});
	public static final BitSet FOLLOW_catchClause_in_existentialLatticeQuantification8265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_declare_in_quantifiedVariables8310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_quantifiedVariables8314 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_in_variableDeclaration8346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_variableDeclaration8350 = new BitSet(new long[]{0x000000000001D008L,0x0004000400004000L,0x0000000000000280L});
	public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration8356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration8360 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assertion_in_variableDeclaration8369 = new BitSet(new long[]{0x0000000000000008L,0x0004000400004000L,0x0000000000000280L});
	public static final BitSet FOLLOW_LITERAL_nonvolatile_in_variableDeclaration8379 = new BitSet(new long[]{0x0000000000000008L,0x0000000400004000L,0x0000000000000280L});
	public static final BitSet FOLLOW_LITERAL_shared_in_variableDeclaration8384 = new BitSet(new long[]{0x0000000000000008L,0x0000000400004000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_constant_in_variableDeclaration8389 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_LITERAL_spread_in_variableDeclaration8394 = new BitSet(new long[]{0x0000000000000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_variableDeclaration8399 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_catch_in_catchClause8459 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_catchClauseTerm_in_catchClause8463 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_catchClauseTerm8499 = new BitSet(new long[]{0x0008000001000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8505 = new BitSet(new long[]{0x0000000000010000L,0x00000001E1000000L,0x0300000400008140L,0x0000000000000800L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_catchClauseTerm8541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_all_in_catchClauseTerm8543 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_catchClauseTerm8547 = new BitSet(new long[]{0x0000000000010000L,0x00000001E1000000L,0x0300000400008140L,0x0000000000000800L});
	public static final BitSet FOLLOW_basicAction_in_catchClauseTerm8551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_catchClauseTerm8553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEMICOLON_in_behaviorActions8585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8589 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_AMPERSAND_in_behaviorActions8615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8619 = new BitSet(new long[]{0x0000000000000048L});
	public static final BitSet FOLLOW_assertedAction_in_behaviorActions8645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACTION_in_assertedAction8670 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_P_in_assertedAction8674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_S_in_assertedAction8685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_action_in_assertedAction8689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_assertedAction8695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_assertedAction8699 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_basicAction_in_action8741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alternative_in_action8757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_action8773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_action8789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doUntilLoop_in_action8805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_action8821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_universalLatticeQuantification_in_action8838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_skip_in_basicAction8867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_basicAction8883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_setmode_in_basicAction8899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_basicAction8903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_whenThrow_in_basicAction8929 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combinableOperation_in_basicAction8945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_communicationAction_in_basicAction8961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simultaneousAssignment_in_basicAction8978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_issueException_in_basicAction8994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_exception_in_issueException9020 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_issueException9024 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_issueException9028 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment9068 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_assignment9072 = new BitSet(new long[]{0xF049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expressionOrAny_in_assignment9076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TICK_in_nameTick9115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_nameTick9119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_valueName_in_nameTick9144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionOrAny9171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_any_in_expressionOrAny9191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_simultaneousAssignment9217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment9221 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_nameTick_in_simultaneousAssignment9225 = new BitSet(new long[]{0x0008000000000008L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COMMA_in_simultaneousAssignment9232 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expressionOrAny_in_simultaneousAssignment9236 = new BitSet(new long[]{0xF049500400820318L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_LITERAL_when_in_whenThrow9276 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_whenThrow9278 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_whenThrow9282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_whenThrow9284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LITERAL_throw_in_whenThrow9286 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_whenThrow9290 = new BitSet(new long[]{0x0000000000000018L});
	public static final BitSet FOLLOW_AADL_STRING_LITERAL_in_whenThrow9302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchadd_in_combinableOperation9348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9352 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9356 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9360 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchor_in_combinableOperation9402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9406 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9410 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchand_in_combinableOperation9456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9460 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9464 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_fetchxor_in_combinableOperation9510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9514 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_combinableOperation9518 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_swap_in_combinableOperation9564 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9568 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9572 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_combinableOperation9576 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subprogramCall_in_communicationAction9622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portOutput_in_communicationAction9640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portInput_in_communicationAction9658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_computation_in_computation9684 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTime_in_computation9688 = new BitSet(new long[]{0x0000000000040008L,0x0000000000000020L});
	public static final BitSet FOLLOW_behaviorTime_in_computation9692 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
	public static final BitSet FOLLOW_LITERAL_binding_in_computation9699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_componentName_in_computation9703 = new BitSet(new long[]{0x0008008000000008L});
	public static final BitSet FOLLOW_PORT_OUTPUT_in_portOutput9754 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portOutput9758 = new BitSet(new long[]{0x7049500400820318L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_portOutput9762 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PORT_INPUT_in_portInput9804 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_portInput9808 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000000L,0x4000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_valueName_in_portInput9812 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SUBPROGRAM_INVOCATION_in_subprogramCall9856 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_subprogramCall9860 = new BitSet(new long[]{0x0008000005000018L,0x0020000010000000L,0x6000010001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_formalActualList_in_subprogramCall9864 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMMA_in_formalActualList9909 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList9913 = new BitSet(new long[]{0x0008000001000018L,0x0020000010000000L,0x6000010001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_formalActual_in_formalActualList9939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_formalActual9968 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formalActual9972 = new BitSet(new long[]{0x0008000000000010L,0x0020000010000000L,0x6000010001000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual9976 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_subProgramParameter_in_formalActual10006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueName_in_subProgramParameter10028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_subProgramParameter10043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenthesizedSubexpression_in_subProgramParameter10058 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_if_in_alternative10086 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_guardedAction_in_alternative10090 = new BitSet(new long[]{0x0002000000000008L});
	public static final BitSet FOLLOW_GUARD_in_guardedAction10127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_guardedAction10131 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_assertedAction_in_guardedAction10135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_while_in_whileLoop10174 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop10178 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_INVARIANT_in_whileLoop10182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_whileLoop10186 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_whileLoop10193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop10197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_whileLoop10211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_for_in_forLoop10260 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_forLoop10264 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_forLoop10268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_forLoop10272 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_forLoop10276 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_forLoop10282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_forLoop10286 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_forLoop10300 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_do_in_doUntilLoop10355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_until_in_doUntilLoop10359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop10363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INVARIANT_in_doUntilLoop10369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_doUntilLoop10373 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BOUND_in_doUntilLoop10380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_doUntilLoop10384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_behaviorActions_in_doUntilLoop10397 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_forall_in_universalLatticeQuantification10450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_universalLatticeQuantification10454 = new BitSet(new long[]{0x0008000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_LITERAL_in_in_universalLatticeQuantification10459 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification10463 = new BitSet(new long[]{0x7049500400820310L,0x127A070012500000L,0x60A4538003524009L,0x0000000000025008L});
	public static final BitSet FOLLOW_expression_in_universalLatticeQuantification10467 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_existentialLatticeQuantification_in_universalLatticeQuantification10473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLESS_SUBCLAUSE_in_blessSubclause10523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DO_NOT_PROVE_in_blessSubclause10531 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000004L,0x0000000100800800L});
	public static final BitSet FOLLOW_assertClause_in_blessSubclause10540 = new BitSet(new long[]{0x0000000000000008L,0x0000200000000000L,0x0000000100800800L});
	public static final BitSet FOLLOW_invariantClause_in_blessSubclause10551 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000100800800L});
	public static final BitSet FOLLOW_variablesSection_in_blessSubclause10560 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000800800L});
	public static final BitSet FOLLOW_statesSection_in_blessSubclause10569 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_transitions_in_blessSubclause10578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_invariant_in_invariantClause10640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_invariantClause10644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_variables_in_variablesSection10676 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclaration_in_variablesSection10680 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LITERAL_states_in_statesSection10711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorState_in_statesSection10715 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_LITERAL_state_in_behaviorState10747 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LITERAL_initial_in_behaviorState10751 = new BitSet(new long[]{0x0008000000000000L,0x0000000400001000L});
	public static final BitSet FOLLOW_LITERAL_complete_in_behaviorState10756 = new BitSet(new long[]{0x0008000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_LITERAL_final_in_behaviorState10761 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ID_in_behaviorState10766 = new BitSet(new long[]{0x000000000000D008L});
	public static final BitSet FOLLOW_assertion_in_behaviorState10770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_transitions_in_transitions10825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorTransition_in_transitions10829 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_TRANSITION_in_behaviorTransition10862 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LABEL_in_behaviorTransition10871 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10875 = new BitSet(new long[]{0x0200000000000008L});
	public static final BitSet FOLLOW_priority_in_behaviorTransition10879 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SOURCE_in_behaviorTransition10891 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10895 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_CONDITION_in_behaviorTransition10907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorCondition_in_behaviorTransition10911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DESTINATION_in_behaviorTransition10923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_behaviorTransition10927 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_behaviorTransition10937 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_behaviorActions_in_behaviorTransition10941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Q_in_behaviorTransition10953 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assertion_in_behaviorTransition10957 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LBRACKET_in_priority11029 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_priority11033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_RBRACKET_in_priority11035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_dispatchCondition_in_behaviorCondition11066 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_executeCondition_in_behaviorCondition11083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeCondition_in_behaviorCondition11101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_internalCondition_in_behaviorCondition11119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_dispatch_in_dispatchCondition11147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchExpression_in_dispatchCondition11151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_executeCondition11188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_on_in_modeCondition11217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_modeCondition11221 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_internal_in_internalCondition11255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_internalCondition11259 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_LITERAL_or_in_dispatchExpression11295 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression11299 = new BitSet(new long[]{0x4008000000000008L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchConjunction_in_dispatchExpression11325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_and_in_dispatchConjunction11356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction11360 = new BitSet(new long[]{0x0008000000000008L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_dispatchTrigger_in_dispatchConjunction11386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_portName_in_dispatchTrigger11412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_timeout_in_dispatchTrigger11430 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_dispatchTrigger11436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_dispatchTrigger11440 = new BitSet(new long[]{0x0008000000000008L});
	public static final BitSet FOLLOW_behaviorTime_in_dispatchTrigger11450 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BEHAVIOR_TIME_in_behaviorTime11484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_quantity_in_behaviorTime11488 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BEHAVIOR_TIME_in_behaviorTime11507 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_valueName_in_behaviorTime11512 = new BitSet(new long[]{0x0008000000000008L,0x0000000000000000L,0x0000002000000010L});
	public static final BitSet FOLLOW_ID_in_behaviorTime11518 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_scalar_in_behaviorTime11524 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_whole_in_behaviorTime11530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_portName11587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NUMBER_in_portName11591 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LITERAL_and_in_triggerLogicalExpression11628 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11632 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_or_in_triggerLogicalExpression11659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11663 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_xor_in_triggerLogicalExpression11690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11694 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_then_in_triggerLogicalExpression11721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11725 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_LITERAL_else_in_triggerLogicalExpression11752 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11756 = new BitSet(new long[]{0x0000001000000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_eventTrigger_in_triggerLogicalExpression11782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modeTrigger_in_eventTrigger11807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_eventTrigger11826 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_triggerLogicalExpression_in_eventTrigger11830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_RPAREN_in_eventTrigger11832 = new BitSet(new long[]{0x0000000000000008L});
}
