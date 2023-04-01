//UnparseBLESS.g
//Tree parser grammar for converting BLESS ASTs back into text
 

tree grammar UnparseBLESS3;

options
{
tokenVocab=BLESS3;
ASTLabelType=BAST;
output=template;
}


@header 
{
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
}

@members
{
public static int countRecognitionErrors = 0; //accumulates count of recognition errors
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
reportError(RecognitionException ex)
  {
  if (!suppressRecognitionException)
  {
 // if (true)
 // {
  if (countRecognitionErrors<Global.YouIdiotReportLimit)
    {
//   Dump.it("\nUnparseBLESS.reportError(RecognitionException ex)=>"+
//    Integer.toString(countRecognitionErrors)+" ");
  Dump.it(getErrorHeader(ex));
  Dump.it(ex);
   recognitionErrorOccurred = true;
   ex.line = ex.line+startingLine;
   super.reportError(ex);
  ex.printStackTrace();
//  Dump.re(ex);
    }
  countRecognitionErrors++;
//  }
//  // Global.stopProof = true;	//stop proving!
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
	  if (!dc.hasType(DOUBLE_COLON))
	    return text("parameter to UnparseBLESS.getAadlPropertyValue must have root DOUBLE_COLON");
	  return text(Global.getAadlPropertyValue(dc.getChild(0).getText(),dc.getChild(1).getText()));
	  }  //end of getAadlPropertyValue
	  
  
static StringTemplate getSlangFunctionCall(String functionID)
  {
  return text(singletonName+"_subprograms."+functionID);
  }
  

  
}  //end of @members

@rulecatch
{
catch (RecognitionException re) 
	{
	countRecognitionErrors++;
	Dump.it("recognition error #"+countRecognitionErrors);
	recognitionErrorOccurred=true;
  if (retval==null)
    Dump.it("null retval");
  else 
  {
  Dump.it("retval.getClass()="+retval.getClass());
  if (retval.start==null)
    Dump.it("null retval.start");
  else if (retval.start instanceof BAST)
	BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
	  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
	else
	  {
	  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
	  }
	}
  reportError(re);
	}
}	//end of rulecatch

identifier 
	:	
	word=ID
		->{%{$word.text}}  //template(w={$word.text})"<w>"
	;

/////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////   UNIT   \\\\\\\\\\\\\\\\\\\\\\\\
/*
unitLibrary
  :
  ^( UNIT_LIBRARY unitDeclarations+=unitDeclaration+ )
    -> unit_library(unitDeclarations={$unitDeclarations})
  ;
*/
unitName
  :
  ^( UNIT_NAME id=ID longname+=ID* )
    -> unit_name(id={$id.text}, longname={$longname})
  ;  

unitFormula
  :
  ^( UNIT_FORMULA top+=ID+ )
    -> unit_formula(top={$top})
  |
  ^( UNIT_FORMULA top+=ID+ DIVIDE bottom+=ID+ )
    -> unit_formula(top={$top}, bottom={$bottom})
  |
  ^( UNIT_FORMULA DIVIDE bottom+=ID+ )
    -> unit_formula(bottom={$bottom})
  ;

unitDeclaration: 
  rootDeclaration | unitExtension
  ;

rootDeclaration
  :
  ^( ROOT_DECLARATION base=LITERAL_base ^( LBRACKET kindWords+=ID+ ) unit=unitName factors+=unitFactor* )
    -> root_declaration(base={$base.text}, kindWords={$kindWords}, unit={$unit.st}, factors={$factors})
  |
  ^( ROOT_DECLARATION formula=unitFormula ^( LBRACKET kindWords+=ID+ ) unit=unitName factors+=unitFactor* )
    -> root_declaration(formula={$formula.st}, kindWords={$kindWords}, unit={$unit.st}, factors={$factors})
  ;

unitExtension
  :
  ^( LITERAL_extension root=ID factors+=unitFactor+ )
    -> unit_extension(root={$root.text}, factors={$factors})
  ;


unitFactor: 
  ^( COMMA unit=unitName t=TIMES factor=NUMBER )
    -> unit_factor(unit={$unit.st}, op={$t.text}, factor={$factor.text})
  |
  ^( COMMA unit=unitName d=DIVIDE factor=NUMBER )
    -> unit_factor(unit={$unit.st}, op={$d.text}, factor={$factor.text})
  ;
  
///////////////////////  TYPE  \\\\\\\\\\\\\\\\\\\\\
	

typeLibrary:  
  decs+=typeDeclaration+
    -> type_library(decs={$decs})
  ;

typeDeclaration:
  ^( LITERAL_type id=ID ty=type )
    -> type_declaration(id={$id.text}, ty={$ty.st})
  ;



type 
	:	
	et=enumerationType
		->{$et.st}
	|
	nt=quantityType
		->{$nt.st}
	|
	at=arrayType
		->{$at.st}
	|
	rt=recordType
		->{$rt.st}
	|
	bo=LITERAL_boolean ->  boolean() 
	|
	st=LITERAL_string ->  string() 
	|
	nu=LITERAL_null -> {%{$nu.text}}
	;
	catch [RecognitionException re] 
		{Dump.it("Unparse:type="+((BAST)retval.start).toStringTree()); reportError(re);}

typeOrReference:
  ty=type
    -> {$ty.st} 
  | 
  ref=ID
    ->{%{$ref.text}}  
  ;

enumerationType 
  : 
  ^(LITERAL_enumeration id+=ID+)
    -> enumeration_type(id={$id})  //,et={getNextTypeID()})
  ; 

quantityType
  :
  ^( LITERAL_quantity unit=ID )
    -> quantity_type(unit={$unit.text})
  |
  ^( LITERAL_quantity scalar=LITERAL_scalar )
    -> quantity_type(scalar={$scalar.text})
  |
  ^( LITERAL_quantity whole=LITERAL_whole )
    -> quantity_type(whole={$whole.text})
  |
  ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) )
    -> quantity_type(unit={$unit.text}, lb={$lb.st}, ub={$ub.st})
  |
  ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) )
    -> quantity_type(scalar={$scalar.text}, lb={$lb.st}, ub={$ub.st})
  |
  ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) )
    -> quantity_type(whole={$whole.text}, lb={$lb.st}, ub={$ub.st})
  |
  ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) )
    -> quantity_type(unit={$unit.text}, lb={$lb.st}, ub={$ub.st}, step={$step.st})
  |
  ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) )
    -> quantity_type(scalar={$scalar.text}, lb={$lb.st}, ub={$ub.st}, step={$step.st})
  |
  ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) )
    -> quantity_type(whole={$whole.text}, lb={$lb.st}, ub={$ub.st}, step={$step.st})
  |
  ^( LITERAL_quantity unit=ID ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(unit={$unit.text}, representation={$representation.text})
  |
  ^( LITERAL_quantity scalar=LITERAL_scalar ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(scalar={$scalar.text}, representation={$representation.text})
  |
  ^( LITERAL_quantity whole=LITERAL_whole ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(whole={$whole.text}, representation={$representation.text})
  |
  ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(unit={$unit.text}, lb={$lb.st}, ub={$ub.st}, representation={$representation.text})
  |
  ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(scalar={$scalar.text}, lb={$lb.st}, ub={$ub.st}, representation={$representation.text})
  |
  ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(whole={$whole.text}, lb={$lb.st}, ub={$ub.st}, representation={$representation.text})
  |
  ^( LITERAL_quantity unit=ID ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(unit={$unit.text}, lb={$lb.st}, ub={$ub.st}, step={$step.st}, representation={$representation.text})
  |
  ^( LITERAL_quantity scalar=LITERAL_scalar ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(scalar={$scalar.text}, lb={$lb.st}, ub={$ub.st}, step={$step.st}, representation={$representation.text})
  |
  ^( LITERAL_quantity whole=LITERAL_whole ^(DOTDOT lb=aNumber ub=aNumber) ^(LITERAL_step step=aNumber) ^(LITERAL_representation representation=QCLREF ) )
    -> quantity_type(whole={$whole.text}, lb={$lb.st}, ub={$ub.st}, step={$step.st}, representation={$representation.text})
  ;	
	

arrayType 
	:	
	^(LITERAL_array arl=arrayRangeList LITERAL_of t=typeOrReference)
		-> array_type(arl={$arl.st},t={$t.st}) //,at={getNextTypeID()})
//		"array[<ar; separator=\" \">] of <t>"
	;
	
arrayRangeList
	:
	nr=arrayRange
	  -> {$nr.st}
	|
	^(COMMA ranges+=arrayRange+)
	  -> array_range_list(r={$ranges})
	;
	
arrayRange
  :
  n=aNumber
    -> {$n.st}
  |
  ^( DOTDOT lb=aNumber ub=aNumber )
    -> array_range(l={$lb.st}, r={$ub.st})
  ;

recordType 
	:
	^(r=LITERAL_record rf+=recordField+)
		-> record_type(rvu={$r.text}, rf={$rf})
	|
	^(r=LITERAL_variant rf+=recordField+)
		-> record_type(rvu={$r.text}, rf={$rf})
	|
	^(r=LITERAL_union rf+=recordField+)
		-> record_type(rvu={$r.text}, rf={$rf})
	;


recordField 
	:	
	^(COLON df=ID ptd=typeOrReference)
		-> record_field(df={$df.text},ptd={$ptd.st})
	;



////////////////////////////   Assertion   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	
assertionLibrary
	:
  ^(ASSERTION_ANNEX ghosts=ghostVariables ass+=namedAssertion+)
	  -> annex_library_assertion(ghosts={$ghosts.st}, ass={$ass})
	|
  ^(ASSERTION_ANNEX ass+=namedAssertion+)
	  -> annex_library_assertion(ass={$ass})
	;  	 

 
ghostVariables
  :
  ^( LITERAL_ghost gv+=ghostVariable+ )
    -> ghost_variables(gv={$gv})
  ;

ghostVariable
  :
  ^( LITERAL_def  id=ID tod=typeOrReference )
    -> ghost_variable(id={$id.text}, tod={$tod.st})
  ;

namedAssertion
  :
  ^( ASSERTION ^( LABEL id=ID ) pred=predicate )
    -> named_assertion(id={$id.text}, pred={$pred.st})
  |
  ^( ASSERTION ^( LABEL id=ID ) ^( PARAMETERS formals=variableList ) pred=predicate )
    -> named_assertion(id={$id.text}, formals={$formals.st}, pred={$pred.st})
  |
  ^( ASSERTION_FUNCTION ^( LABEL id=ID ) ^( LITERAL_returns tod=typeOrReference ) functionvalue=assertionFunctionValue )
    -> named_assertion(id={$id.text}, tod={$tod.st}, functionvalue={$functionvalue.st})
  |
  ^( ASSERTION_FUNCTION ^( LABEL id=ID ) ^( PARAMETERS formals=variableList ) ^( LITERAL_returns tod=typeOrReference ) functionvalue=assertionFunctionValue )
    -> named_assertion(id={$id.text}, formals={$formals.st}, tod={$tod.st}, functionvalue={$functionvalue.st})
  |
  ^( ASSERTION_ENUMERATION ^( LABEL id=ID ) ^( TILDE assertionvariable=ID enumerationTy=ID ) enumeration=assertionEnumeration  ) 
    -> named_assertion_enum(id={$id.text}, enumerationTy={$enumerationTy.text}, enumeration={$enumeration.st})
 ;
 
variableList
  :
  v=variable
    -> {$v.st}
  |
  ^( COMMA parameter+=variable+ )
    -> variable_list(parameter={$parameter})
  ; 

variable
  :
  ^( TILDE id=ID tod=typeOrReference )
    -> variable(id={$id.text}, tod={$tod.st})
  ;

assertionFunctionValue
  :
 	caf=conditionalAssertionFunction 
 	  -> {$caf.st}
	| exp=expression  
 	  -> {$exp.st}
 
  ;

conditionalAssertionFunction
  :
  ^( LBRACKET cvp+=conditionValuePair+  RBRACKET )
    -> conditional_assertion_function(cvp={$cvp})
  ;  

conditionValuePair
  :
  ^(CVP pred=predicate exp=expression )
    -> condition_value_pair(pp={$pred.st}, pe={$exp.st})
  ;
  
assertionEnumeration
  :
  ^( PLUS_ARROW inv=invocation )
    -> assertion_enumeration_predicate_invocation(pi={$inv.st})
  |
  ^( PLUS_ARROW ep=enumerationPair )
    -> assertion_enumeration_pairs(ep={$ep.st})
  | 
  ^( PLUS_ARROW ^( COMMA pair+=enumerationPair+ ) )
    -> assertion_enumeration_pairs(ep={$pair})
  ;  

enumerationPair
  :
  ^( ARROW id=ID pred=predicate )
    -> enumeration_pair(i={$id.text}, pe={$pred.st})
  ;  

invocation
  :
  ^( INVOKE id=ID )
    -> invocation(i={$id.text})
  |
  ^( INVOKE id=ID params+=actualParameter+ )
    -> invocation(i={$id.text}, p={$params})
  |
  ^( INVOKE id=ID exp=expression )
    -> invocation(i={$id.text}, p={$exp.st})
  ;

actualParameter
  :
  ^( COLON formal=ID actual=expression )
    -> actual_parameter(formal={$formal.text}, actual={$actual.st})
  ;  

namelessAssertion
  :
  ^( ASSERTION pred=predicate )
    -> nameless_assertion(a={$pred.st})
  ;
  
namelessFunction
  :
  ^( ASSERTION_FUNCTION ^( LITERAL_returns tod=typeOrReference ) functionvalue=assertionFunctionValue )
    -> nameless_function(tod={$tod.st}, a={$functionvalue.st})
  ;
  
namelessEnumeration
  :
	^( ASSERTION_ENUMERATION inv=invocation )
	  -> nameless_enumeration(inv={$inv.st})
	;
  
assertion:
  na=namedAssertion
    -> {$na.st}
  | a=namelessAssertion
    -> {$a.st}
  | f=namelessFunction
    -> {$f.st}
  | e=namelessEnumeration
    -> {$e.st}
  ;
  
//////////////////////////  EXPRESSION   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
  
expression // throws ProofException
	:	
  all=universalQuantification
    -> {$all.st}
  | exists=existentialQuantification
    -> {$exists.st}
  | sum=sumQuantification
    -> {$sum.st}
  | product=productQuantification
    -> {$product.st}
  | numberof=countingQuantification
    -> {$numberof.st}
  | ^( iff=LITERAL_iff l=disjunction r=disjunction )
    -> relation(r={$iff.text}, lhs={$l.st}, rhs={$r.st})
  | ^( imp=LITERAL_implies l=disjunction r=disjunction )
    -> relation(r={$imp.text}, lhs={$l.st}, rhs={$r.st})
	;	

universalQuantification
  :
  ^( a=LITERAL_all lv=logicVariables iw=in_which ^( LITERAL_are pred=predicate ) )
    -> universal_quantification(a={$a.text}, lv={$lv.st}, d={$iw.st}, p={$pred.st})
  ;

in_which
  :
  ^( LITERAL_in r=range )
    -> template(r={$r.st}) "in <r>"
  |
  ^( LITERAL_which b=predicate )
    -> template(b={$b.st}) "which <b>"
  ;

existentialQuantification
  :
  ^( e=LITERAL_exists lv=logicVariables iw=in_which ^( LITERAL_are pred=predicate ) )
    -> existential_quantification(e={$e.text},  lv2={$lv.st}, d2={$iw.st}, p2={$pred.st})
	;

sumQuantification
  :
  ^( s=LITERAL_sum lv=logicVariables iw=in_which ^( LITERAL_of ex=expression ) )
    -> sum(s={$s.text}, lv={$lv.st}, d={$iw.st}, pe={$ex.st})
  ;	

productQuantification
  :
  ^( p=LITERAL_product lv=logicVariables iw=in_which ^( LITERAL_of ex=expression ) )
     -> product(p={$p.text}, lv={$lv.st}, d={$iw.st}, pe={$ex.st})
 ;
  
countingQuantification
  :
  ^( LITERAL_numberof lv=logicVariables iw=in_which ^( LITERAL_that ex=expression) ) 
    -> numberof(lv={$lv.st}, d={$iw.st}, pe={$ex.st}) 
  ;  

logicVariables
  :
  ^( COMMA lv+=variable+ )
    -> variable_list(parameter={$lv})
  |
  v=variable
  ;
    
disjunction
  :
  ^( LITERAL_or c+=conjunction+ )
    -> disjunction(bopt={$c})
  |
  ^( LITERAL_else c+=conjunction+ )
    -> cor(t={$c})
  |
  ^( LITERAL_xor c+=conjunction+ )
    -> xor(terms={$c})
  |
  con=conjunction
  ;  

conjunction
  :
  ^( LITERAL_and r+=relation+ )
    -> conjunction(bopt={$r})
  |
  ^( LITERAL_then r+=relation+ )
    -> cand(t={$r})
  |
  rel=relation
    -> {$rel.st}
  ;
  
 relation
  :
  ^(EQ  lhs=addSub rhs=addSub )
    -> equal_relation(lhs={$lhs.st},rhs={$rhs.st})
  |  
  ^(LT  lhs=addSub rhs=addSub )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \< <rhs>"
  |  
  ^(AM  lhs=addSub rhs=addSub )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \<= <rhs>"
  |  
  ^(AL  lhs=addSub rhs=addSub )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \>= <rhs>"
  |  
  ^(GT  lhs=addSub rhs=addSub )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \> <rhs>"
  |  
  ^(PLUS_EQUALS  lhs=addSub rhs=addSub )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> += <rhs>"
  |  
  ^(NEQ  lhs=addSub rhs=addSub )
    -> not_equal_relation(lhs={$lhs.st},rhs={$rhs.st})
  |  
  ^(OLD_NEQ  lhs=addSub rhs=addSub )
    -> not_equal_relation(lhs={$lhs.st},rhs={$rhs.st})
  |
  as=addSub
    -> {$as.st}
  ;

range
  :
  ^( dd=DOTDOT lb=subexpression ub=subexpression )
    -> range(rs={$dd.text}, lb={$lb.st}, ub={$ub.st})
  |
   ^( cd=COMMADOT lb=subexpression ub=subexpression )
    -> range(rs={$cd.text}, lb={$lb.st}, ub={$ub.st})
  |
   ^( dc=DOTCOMMA lb=subexpression ub=subexpression )
    -> range(rs={$dc.text}, lb={$lb.st}, ub={$ub.st})
  |
   ^( cc=COMMACOMMA lb=subexpression ub=subexpression )
    -> range(rs={$cc.text}, lb={$lb.st}, ub={$ub.st})
  ;
 
addSub
  :
  ^( PLUS md+=multDiv+ )
    -> add(terms={$md})
  |
  ^( MINUS l=multDiv r=multDiv )
    -> template(l={$l.st}, r={$r.st}) "<l> - <r>"
  |
  m=multDiv
    -> {$m.st}
  ;    
  
multDiv
  :
  ^( TIMES exp+=exponentiation+ )
    -> multiply(terms={$exp})
  |
  ^( DIVIDE l=exponentiation r=exponentiation )
    -> template(l={$l.st}, r={$r.st}) "<l> / <r>"
  |
  ^( LITERAL_div l=exponentiation r=exponentiation )
    -> template(l={$l.st}, r={$r.st}) "<l> div <r>"
  |
  ^( LITERAL_mod l=exponentiation r=exponentiation )
    -> template(l={$l.st}, r={$r.st}) "<l> mod <r>"
  |
  ^( LITERAL_rem l=exponentiation r=exponentiation )
    -> template(l={$l.st}, r={$r.st}) "<l> rem <r>"
  |
  e=exponentiation
    -> {$e.st}
  ;  
  
  
exponentiation
  :
  ^( EXP l=subexpression r=subexpression )
    -> template(l={$l.st}, r={$r.st}) "<l> ** <r>"
  |
  s=subexpression
    -> {$s.st}
  ;  
  
subexpression
  :
  ^( n=LITERAL_not te=timedExpression )
    -> unary(sym={$n.text}, ex={$te.st})
  |
  ^( m=UNARY_MINUS te=timedExpression )
    -> unary(sym={$m.text}, ex={$te.st})
  |
  ^( s=LITERAL_abs te=timedExpression )
    -> unary(sym={$s.text}, ex={$te.st})
  |
  ^( t=LITERAL_truncate te=timedExpression )
    -> unary(sym={$t.text}, ex={$te.st})
  |
  ^( r=LITERAL_round te=timedExpression )
    -> unary(sym={$r.text}, ex={$te.st})
  |
  te=timedExpression 
    -> {$te.st}
  ;  
  
timedExpression
  :
  ^( TICK ts=timedSubject )
    -> tick(tp={$ts.st})
  |
  ^( AT_SIGN ts=timedSubject se=subexpression )
    -> at(p={$ts.st}, t={$se.st})
  |
  ^( CARET ts=timedSubject ps=periodShift )
    -> caret(p={$ts.st}, cv={$ps.st})
  |
  ts=timedSubject
    -> {$ts.st}
  ;  

timedSubject
  :
  ce=conditionalExpression
    -> {$ce.st}
  | ps=parenthesizedSubexpression 
    -> {$ps.st}
  | rt=recordTerm
    -> {$rt.st}
  | inv=invocation  
    -> {$inv.st}
  | v=value
    -> {$v.st}
  ;
  
periodShift
  :
  ^( um=UNARY_MINUS v=value )
    -> unary(sym={$um.text}, ex={$v.st})
  |
  ^( um=UNARY_MINUS ^( LPAREN ie=indexExpression RPAREN ) )
    -> unary_paren(sym={$um.text}, ex={$v.st})
  |
  v=value
    -> {$v.st}
  |
  ^( LPAREN ie=indexExpression RPAREN )
    -> parentheses(be={$ie.st})
  ;  

indexExpression
  :
  ^( m=MINUS l=periodShift r=periodShift )
    -> template(l={$l.st}, r={$r.st}) "<l> / <r>"
  |
  ^( m=LITERAL_div l=periodShift r=periodShift )
    -> template(l={$l.st}, r={$r.st}) "<l> div <r>"
  |
  ^( m=LITERAL_mod l=periodShift r=periodShift )
    -> template(l={$l.st}, r={$r.st}) "<l> mod <r>"
  |
  ^( m=LITERAL_rem l=periodShift r=periodShift )
    -> template(l={$l.st}, r={$r.st}) "<l> rem <r>"
  |
  ^( PLUS ps+=periodShift+ )
    -> add(terms={$ps})
  |
  ^( TIMES ps+=periodShift+ )
    -> multiply(terms={$ps})
  ;
  
conditionalExpression
  :
  ^( LPAREN ^( QQ pred=expression t=expression f=expression )  RPAREN )
    -> conditional_expression(be={$pred.st}, t={$t.st}, f={$f.st})
  ;  
  
parenthesizedSubexpression
  :
  ^( LPAREN ex=expression RPAREN )
    -> parentheses(be={$ex.st})  
  ;
  
recordTerm
  :
  ^( RECORD_TERM typeid=ID prv+=recordValue+ )
    -> record_term(typeid={$typeid.text},prv={$prv})
  ;
  
recordValue
  :
  ^( ARROW field=ID v=value )
    -> record_value(id={$field.text}, v={$v.st})
  ;  

predicate
  :
  expression
	;
	  
//////////////////////////   VALUE   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

value
  :
  vn=valueName
    -> {$vn.st}
  |
  c=constant
    -> {$c.st}
  |
  to=LITERAL_timeout
    -> {%{$to.text}}
  |
  n=LITERAL_now
    -> {%{$n.text}}
  |
  t=LITERAL_tops
    -> {%{$t.text}}
  ;

valueName
  :
  ^( id=ID DOLLAR pr=functionParameters )
    -> function_call(f={$id.text}, pl={$pr.st})
  |
  ^( id=ID ^( LBRACKET array_index+=indexExpressionOrRange+ ) ^( DOT pn+=partialName* )  )
    -> name(id={$id.text}, index={$array_index}, rec={$pn})
  |
  ^( id=ID ^( DOT pn+=partialName+ )  )
    -> name(id={$id.text}, rec={$pn})
  |
  ^( q=QUESTION id=ID )
    -> template(id={$id.text}) "<id>?"
  |
  ^( TICK id=ID LITERAL_fresh )
    -> port_fresh(id={$id.text})
  |
  ^( TICK id=ID LITERAL_count )
    -> port_count(id={$id.text})
  |
  ^( TICK id=ID LITERAL_updated )
    -> port_updated(id={$id.text})
  |
  id=ID
    -> {%{$id.text}}
  ;

functionParameters
  :
  ^( COMMA parameters+=formalExpressionPair )
    -> array_range_list(r={$parameters})
  |
  parameter=formalExpressionPair
    -> {$parameter.st}
	;
	
formalExpressionPair
  :
  ^( COLON formal=ID actual=expression )
    ->  formal_actual(f={$formal.text}, ap={$actual.st})
  ;
  	
indexExpressionOrRange
  :
  ^( dd=DOTDOT lb=indexExpression ub=indexExpression )
    -> relation(r={$dd.text}, lhs={$lb.st}, rhs={$ub.st})
  |
  index=indexExpression
    -> {$index.st}
  ;

partialName
  :
  ^( record_id=ID ^( LBRACKET array_index+=indexExpressionOrRange ) )
    -> partial_name(i={$record_id.text}, p={$array_index})
  |
  record_id=ID
    -> {%{$record_id.text}}
	;
	
	
constant
  :
  q=quantity
    -> {$q.st}
  |
  s=AADL_STRING_LITERAL
    -> {%{$s.text}}
  |
  t=LITERAL_true
    -> {%{$t.text}}
  |
  f=LITERAL_false
    -> {%{$f.text}}
  |
  n=LITERAL_null
    -> {%{$n.text}}
	;	

quantity
  :
  ^( QUANTITY number=aNumber )
    -> {$number.st}
  |
  ^( QUANTITY number=aNumber unit=ID )
    -> template(number={$number.st}, unit={$unit.text}) "<number> <unit>"
  |
  ^( QUANTITY number=aNumber LITERAL_scalar )
    -> template(number={$number.st}) "<number> scalar"
  |
  ^( QUANTITY number=aNumber LITERAL_whole )
    -> template(number={$number.st}) "<number> whole"
	;	
	    
aNumber:
 lit=NUMBER
   -> {%{$lit.text}}
 | property=propertyReference
   -> {$property.st}
 | propertyConstant=QCLREF //[aadl2::PropertyConstant|QCLREF]
   -> {%{$propertyConstant.text}}
  ;
    
propertyReference
 :
  //just property name
  ^(oct=OCTOTHORPE pname=QCLREF)
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
    -> property_reference(pname={$pname.text})
  |  //with record field(s)
  ^(oct=OCTOTHORPE pname=QCLREF field+=propertyField+)
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
    -> property_reference(pname={$pname.text},f={$field})
  |  //self property
  ^(oct=OCTOTHORPE self=LITERAL_self pname=QCLREF )
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
    -> property_reference(component={$self.text},pname={$pname.text})
  |  //self property with record filed(s)
  ^(oct=OCTOTHORPE self=LITERAL_self pname=QCLREF field+=propertyField+)
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
    -> property_reference(component={$self.text},pname={$pname.text},f={$field})
  |  //component property
  ^(oct=OCTOTHORPE component=QCREF pname=QCLREF)
    -> property_reference(component={$component.text},pname={$pname.text},f={$field})
  |  //component property with record filed(s)
  ^(oct=OCTOTHORPE component=QCREF pname=QCLREF field+=propertyField+)
    -> property_reference(component={$component.text},pname={$pname.text},f={$field})
  ;
  
propertyField
  :
  ^( LBRACKET index=NUMBER )
    -> index(i={$index.text})
  |
  ^( LBRACKET var=ID )
    -> index(i={$var.text})
  |
  ^( DOT pf=ID )
    -> template(pf={$pf.text}) ".<pf>"
  |
  ^( DOT LITERAL_upper_bound )
    -> template() ".upper_bound"
  |
  ^( DOT LITERAL_lower_bound )
    -> template() ".lower_bound"
  ;


/////////////////////////   ACTION   \\\\\\\\\\\\\\\\\\\\\\\\\


actionSubclause
  :
  ^( ACTION_SUBCLAUSE (no_proof=DO_NOT_PROVE)? (tc=throwsClause)? (ac=assertClause)? 
    ^( LITERAL_pre (precondition=assertion)? )
    ^( LITERAL_post (postcondition=assertion)? ) 
    ^( LITERAL_invariant (invariant=assertion)? ) 
    elq=existentialLatticeQuantification )
  -> action_subclause(no_proof={$no_proof.text},
       tc={$tc.st}, ac={$ac.st}, pre={$precondition.st}, post={$postcondition.st}, inv={$invariant.st},
       elq={$elq.st})
  ;

throwsClause
  :
	^( LITERAL_throws exceptions+=ID+ ) //[Exception]
	  -> throws_clause(ex={$exceptions})
  ;

assertClause
  :
  ^( LITERAL_assert assertions+=namedAssertion+ )
    -> assert_clause(a={$assertions})
  ;

existentialLatticeQuantification
  :
  ^( LCURLY ( qv=quantifiedVariables )? actions=behaviorActions RCURLY ( cc=catchClause )? )
    -> elq(v={$qv.st}, ba={$actions.st}, cc={$cc.st})
  ;

quantifiedVariables
  :
  ^( LITERAL_declare decs+=variableDeclaration+ )
    -> quantified_variables(bv={$decs})
	;

variableDeclaration
  :
  ^( VARIABLE_DECLARATION v=variable ( ^( ASSIGN exp=expression ) )? a=assertion? 
    nv=LITERAL_nonvolatile? sh=LITERAL_shared? c=LITERAL_constant? sp=LITERAL_spread? f=LITERAL_final? )
    -> variable_declaration(v={$v.st},exp={$exp.st},a={$a.st},nv={$nv.text},sh={$sh.text},c={$c.text},sp={$sp.text},f={$f.text})
  ;

catchClause
  :
	^( LITERAL_catch cct+=catchClauseTerm+ )
	  -> catch_clause(cct={$cct})
  ;

catchClauseTerm
  :
  ^( LPAREN exceptions+=ID+  colon=COLON act=basicAction RPAREN )
    -> catch_clause_term(ei={$exceptions}, ba={$act.st})
  |
  ^( LPAREN LITERAL_all colon=COLON act=basicAction RPAREN )
    -> catch_clause_term_all(ba={$act.st})
	;
	
behaviorActions
  :
  ^( SEMICOLON aa+=assertedAction+ )
    -> sequential_composition(f={$aa})
  |
  ^( AMPERSAND aa+=assertedAction+ )
    -> concurrent_composition(g={$aa})
  |
  a=assertedAction
    -> {$a.st}
  ;

assertedAction
  :
  ^( ACTION ^( P pre=assertion? ) ^( S s=action ) ^( Q post=assertion? ) )
    -> asserted_action(p={$pre.st}, s={$s.st}, q={$post.st})
  ;

action:
  ba=basicAction
    -> {$ba.st}
  | if_fi=alternative
    -> {$if_fi.st}
  | wl=whileLoop
    -> {$wl.st}
  | fl=forLoop
    -> {$fl.st}
  | du=doUntilLoop
    -> {$du.st}
  | elq=existentialLatticeQuantification //behavior_action_block
    -> {$elq.st}
  | ulq=universalLatticeQuantification   //forall_action
    -> {$ulq.st}
  ;
	
basicAction
  :
  sk=LITERAL_skip
  	-> {%{$sk.text}} 
  | ass=assignment
    -> {$ass.st}
  | LITERAL_setmode mode=ID //[aadl2::Mode]
    -> template(mode={$mode.text}) "setmode <mode>"
  | wt=whenThrow
    -> {$wt.st}
  | co=combinableOperation
    -> {$co.st}
  | ca=communicationAction 
    -> {$ca.st}
  | sa=simultaneousAssignment
    -> {$sa.st}
  | ie=issueException
    -> {$ie.st}
  ;
 
issueException
  :
  ^( LITERAL_exception exception=ID message=AADL_STRING_LITERAL? )
    -> issue_exception(ex={$exception.text},m={$message.text})
  ; 
  
assignment
  :
  ^( ASSIGN n=nameTick e=expressionOrAny )
    -> assignment(nt={$n.st}, eort={$e.st})
  ;
 
nameTick
  : 
  ^( TICK vn=valueName )
    -> name_tick(vn={$vn.st})
  |
  vn=valueName
    -> {$vn.st}
  ;
  
expressionOrAny
  :
  exp=expression
    -> {$exp.st} 
  | 
  any=LITERAL_any
  	->{%{$any.text}} 
  ;
  
simultaneousAssignment
  :
  ^( ASSIGN ^( COMMA lhs+=nameTick+ ) ^( COMMA rhs+=expressionOrAny+ ) )
    -> simultaneous_assignment(l={$lhs}, r={$rhs})
	;  
  
whenThrow:
  ^( LITERAL_when LPAREN exp=expression RPAREN LITERAL_throw excep=ID  //[Exception]  
      message=AADL_STRING_LITERAL? )  
    -> when_throw(e={$exp.st},i={$excep.text},m={$message.text})  
  ;
  
combinableOperation:
  fa=LITERAL_fetchadd
  	->{%{$fa.text}} 
  |
  fo=LITERAL_fetchor
  	->{%{$fo.text}} 
  |
  fan=LITERAL_fetchand
  	->{%{$fan.text}} 
  |
  fx=LITERAL_fetchxor
  	->{%{$fx.text}} 
  |
  sw=LITERAL_swap
  	->{%{$sw.text}} 
  ;
  
communicationAction:
  pc=subprogramCall
    -> {$pc.st}
  |
  po=portOutput
    -> {$po.st}
  |
  pi=portInput
    -> {$pi.st}
  ;
  
portOutput
  :
  ^( PORT_OUTPUT pn=ID be=expression? )
    -> port_output(o={$pn.text}, be={$be.st})
  ;
    
portInput
  :
  ^( PORT_INPUT pn=ID n=valueName )
    -> port_input(i={$pn.text}, n={$n.st})
  ;  
  
  
subprogramCall
  :
  ^( FUNCTION_CALL id=ID fal=formalActualList? )
    -> function_call(f={$id.text}, pl={$fal.st})
  ;  
  
  
formalActualList
  :
  ^( COMMA fa+=formalActual+ )
    -> formal_actual_list(ns={$fa})
  |
  s=formalActual
    -> {$s.st}
  ;  
  
formalActual
  :
  ^( COLON formal=ID actual=subProgramParameter )
    -> formal_actual(f={$formal.text}, ap={$actual.st})
  |
  spp=subProgramParameter
	;  

subProgramParameter:
	v=valueName
    -> {$v.st}
	| c=constant
    -> {$c.st}
	| ps=parenthesizedSubexpression
    -> {$ps.st}
  ;
  	
alternative
  :
  ^( LITERAL_if alt+=guardedAction+ )
    -> alternative(gf={$alt})
  ;	 
	 
guardedAction
  :
  ^( GUARD exp=expression aa=assertedAction )
    -> guarded_action(be={$exp.st}, ba={$aa.st})
  ;	 

whileLoop
  :
  ^( LITERAL_while be=expression ^( INVARIANT inv=assertion? ) ^( BOUND bd=assertion? ) 
      elq=existentialLatticeQuantification )
    -> while_loop(be={$be.st}, elq={$elq.st}, bd={$bd.st}, inv={$inv.st})
  ;
  
forLoop
  :
  ^( LITERAL_for id=ID ^( LITERAL_in lb=expression ub=expression ) ^( INVARIANT inv=assertion? ) 
      act=behaviorActions )
    -> for_loop(a={$id.text}, lb={$lb.st}, ub={$ub.st}, ba={$act.st}, inv={$inv.st})
	;  
  
doUntilLoop
  :
  ^( LITERAL_do ^( LITERAL_until be=expression ) ^( INVARIANT inv=assertion? ) ^( BOUND bd=assertion? ) 
     act=behaviorActions )
    -> do_until(be={$be.st}, ba={$act.st}, bd={$bd.st}, inv={$inv.st})
  ;  
  	 
universalLatticeQuantification
  :
  ^( LITERAL_forall lv+=ID+ ^( LITERAL_in lb=expression ub=expression ) elq=existentialLatticeQuantification )
    -> ulq(lv={$lv}, lb={$lb.st}, ub={$ub.st}, elq={$elq.st})
  ;

///////////////////////////////  STATE MACHINE   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


blessSubclause
  :
  ^( BLESS_SUBCLAUSE 
  	no_proof=DO_NOT_PROVE?
    ac=assertClause?  
    inv=invariantClause?
    vs=variablesSection?
    ss=statesSection?
    t=transitions? )
    -> bless_subclause(n={$no_proof.text}, ac={$ac.st}, inv={$inv.st}, vs={$vs.st}, ss={$ss.st}, t={$t.st})
  ;
  	 
invariantClause
  :
  ^( LITERAL_invariant a=assertion )
    -> invariant_clause(a={$a.st}) 
  ;

variablesSection
  :
	^( LITERAL_variables vd+=variableDeclaration+ )
	  -> variables(bv={$vd})
  ;

statesSection
  :
	^( LITERAL_states states+=behaviorState+ )
	  -> states_section(bs={$states})
  ;

behaviorState
  :
  ^( LITERAL_state init=LITERAL_initial? com=LITERAL_complete? finl=LITERAL_final? i=ID a=assertion? )
    -> behavior_state(bsi={$i.text}, i={$init.text}, com={$com.text}, finl={$finl.text}, a={$a.st})
  ;

transitions 
  : 
  ^( LITERAL_transitions bt+=behaviorTransition+ )
    -> transitions(bt={$bt})
  ;

behaviorTransition
  :
  ^( TRANSITION ^( LABEL id=ID pr=priority? ) ^( SOURCE ssi+=ID+ ) 
    ^( CONDITION bc=behaviorCondition? ) ^( DESTINATION dsi=ID )
    ^( ACTION s=behaviorActions? ) ^( Q q=assertion? ) )
    -> behavior_transition(id={$id.text}, pr={$pr.st}, ssi={$ssi},
        bc={$bc.st}, dsi={$dsi.text}, ba={$s.st}, btq={$q.st})
  ;

priority
  :
	^( LBRACKET num=NUMBER RBRACKET )
	  -> priority(num={$num.text})
  ;

behaviorCondition
  :
  dc=dispatchCondition
    -> {$dc.st} 
  | ec=executeCondition 
    -> {$ec.st} 
  | mc=modeCondition 
    -> {$mc.st} 
  | ic=internalCondition
    -> {$ic.st} 
  ;
  
dispatchCondition
  :
  ^( LITERAL_dispatch de=dispatchExpression? )
    -> dispatch_condition(dle={$de.st})
  ;  
  
executeCondition
  :
  expression
  ;  
  
modeCondition
  :
  ^( LITERAL_on tle=triggerLogicalExpression )
    -> mode_condition(tle={$tle.st})
  ;
  
internalCondition
  :
  ^( LITERAL_internal ports+=ID+ )
    -> internal_condition(p={$ports})
	;  
  
dispatchExpression
  :
  ^( LITERAL_or dc+=dispatchConjunction+ )
    -> disjunction(bopt={$dc})
  |
  c=dispatchConjunction
    -> {$c.st}
  ;  
    
dispatchConjunction
  :
  ^( LITERAL_and tr+=dispatchTrigger+ )
    -> conjunction(bopt={$tr})
  |
  t=dispatchTrigger
    -> {$t.st}
	;  

dispatchTrigger
  :
  port=portName
    -> {$port.st}
  |
  ^( LITERAL_timeout ^( LPAREN ports+=ID* ) time=behaviorTime? )
    -> timeout(bt={$time.st},p={$ports})
  ;

behaviorTime:
  q=quantity
    -> {$q.st}
  | vn=valueName
    -> {$vn.st}
  | ps=parenthesizedSubexpression
    -> {$ps.st}
  ;	

portName
  :
  ^( port=ID index=NUMBER? )
    -> port_name(port={$port.text},index={$index.text})
  ;

triggerLogicalExpression
  :
  ^( LITERAL_and et+=eventTrigger+ )
    -> conjunction(bopt={$et})
  | 
  ^( LITERAL_or et+=eventTrigger+ )
    -> disjunction(bopt={$et})
  | 
  ^( LITERAL_xor et+=eventTrigger+ )
    -> xor(terms={$et})
  | 
  ^( LITERAL_then et+=eventTrigger+ )
    -> cand(t={$et})
  | 
  ^( LITERAL_else et+=eventTrigger+ )
    -> cor(t={$et})
  |
  first=eventTrigger
    -> {$first.st}
  ;

eventTrigger
  :
  tr=TRIGGER
    -> {%{$tr.text}}
  | 
  ^( LPAREN tle=triggerLogicalExpression RPAREN )
    -> parentheses(be={$tle.st})
  ;

  	 
///////END OF FILE	
