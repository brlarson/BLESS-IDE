//BLESS3.g
grammar BLESS3;

 
options {
  language = Java;
  output = AST;
  ASTLabelType = BAST;
  backtrack=true;
//  k=3;
//  ignoreCase = true;
}  //end of options

tokens 
{ 
ACTION;  //asserted_action
ACTION_SUBCLAUSE;
ASSERTION; 
ASSERTION_ANNEX;  //root of trees for AADL annex sublanguages
ASSERTION_ENUMERATION; 
ASSERTION_FUNCTION; 
BEHAVIOR_GUARD;
//BEHAVIOR_TIME; 
BLESS_SUBCLAUSE;
BOUND;  //for loops
//CASE_EXPRESSION;  //case expression
COMPONENT;
CONDITION;
//QQ;  //conditional expression, replaces QQ='??'
CONDITIONAL_ASSERTION_FUNCTION;
COUNTING_TRIGGER;  //for counting dispatch triggers in a dispatch condition, ormore/orless
DESTINATION; 
DUMMY;  //used for dummy roots of trees
FLOATING; 
FUNCTION; 
INMODE;  //for 'in mode' clause
INOUT;  //both in and out direction for port
INVARIANT; 
INVOKE; 
//INVOKE_FUNCTION; 
IP_NAME; 
IP_PE; 
IP_PRED;  //invoctionParameter tags
LABEL;
OBLIGATION;  //proof obligation 
ON;   //for behavior_guard
P; 
PARAMETER;  // formal:actual in predicate_invocation b:c => ^(PARAMETER b c)
PARAMETERS; 
PORT; //AADL port feature root
PORT_INPUT; 
PORT_OUTPUT; 
PREDICATE_RELATION; //assertion_subexpression;
PROCEDURE; 
//PROCEDURE_CALL; 
Q; 
QUANTITY;
RECORD_TERM; 
ROOT_DECLARATION;
S; 
SOURCE; 
START; 
STOP; //used to mark the end of some strings of children
//SUBPROGRAM_ANNEX; 
SUBPROGRAM_INVOCATION; 
TOP;  //the set of all values; every values is in TOP
TRANSITION; 
TYPE; 
TYPE_LIBRARY;
TYPE_OPERATOR; 
TYPE_OPERATOR_INVOCATION; //for types
UNARY_MINUS; 
UNIT_FORMULA;
UNIT_LIBRARY;
UNIT_NAME;
VALUE;
VARIABLE_DECLARATION; 
//WP;  //weakest precondition
} //end of tokens


@header {
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
}


@members {
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
  
} //end of parser members

@lexer::header {
//copyright 2023 Multitude Corporation
package com.multitude.bless.antlr3generated;
}
  
//tokens  
@lexer::members {
  
  public static final int COMMENT_CHANNEL=10;
  
  //offset of starting line in AADL file when just parsing an annex subclause or library
  public int lineNumberOffset=0;
  
  //set value for offset, call before invoking lexer
  public void
setLine(int offset)
	{ lineNumberOffset=offset;}

  //override getLine in Lexer
  public int
getLine()
  { return lineNumberOffset+input.getLine(); }

}  //end of @lexer::members


// hexadecimal digit (again, note it's protected)
fragment
HEX_DIGIT
  : ('0'..'9'|
  //'A'..'F'|
  'a'..'f')
  ;

//whitespace
WS 
  :  
  ( ' ' | '\t' | '\f' | '\r' | '\n' )+ 
  { $channel=HIDDEN; }    
  ; 

//single-line comment
SLCOMMENT 
  :  
  '--'   
  ( ~( '\n' | '\r' ) )*   
  { $channel=COMMENT_CHANNEL; }
  ; 
 
NUMBER: '-'? DIGIT+ ('.' DIGIT+ ('e' '-'? DIGIT+)? )? ( 'i' '-'? DIGIT+ ('.' DIGIT+ ('e' '-'? DIGIT+)? )? )?;

/*
NUMBER :  
  (DIGIT)+ ( '.' (DIGIT)+ ( EXPONENT )?)
//  (DIGIT)+('_' (DIGIT)+)* ( '.' (DIGIT)+('_' (DIGIT)+)* ( EXPONENT )?)
  ;

NUMBER : 
    (DIGIT)+
//    (DIGIT)+('_' (DIGIT)+)*
//    (( '#' BASED_INTEGER  '#' ( INT_EXPONENT )? )
//      | (INT_EXPONENT)?
//    )
  ;
*/
  
DOT : '.';

//range ends
DOTDOT  : '..';
COMMADOT : ',.';
DOTCOMMA   : '.,';
COMMACOMMA   : ',,';

//need to declare '+=>' before '+' or '=>' to be recognized
PLUS_ARROW : '+=>';

//make symbols token types so new BAST(String,token type,line number) 
//creates a Token with a named token type number
PLUS : '+';
TIMES : '*';
MINUS : '-';
DIVIDE : '/';
EXP : '**';
ASSIGN : ':=';
SEMICOLON : ';';
AMPERSAND : '&';
LCURLY : '{';
RCURLY : '}';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
COLON : ':';
DOUBLE_COLON : '::';
COMMA : ',';
AT_SIGN : '@';
CARET : '^';
EMPTY_CURLY : '{}';
DOLLAR : '$';
TILDE : '~';
OCTOTHORPE : '#';
CVP : ')->';
COLON_TILDE : ':~';
VERT : '|';

//used to make string literals in AADL -- not used in BLESS
DOUBLE_QUOTE :	'"';
//used to delineate annex subclauses and annex libraries in AADL
ANNEX_START:	'{**';
ANNEX_END:	'**}';

DO_NOT_PROVE: 'DO_NOT_PROVE';


//operators that are literals
LITERAL_and : 'and';
//LITERAL_cand : 'cand';
//LITERAL_cor : 'cor';
LITERAL_mod : 'mod';
LITERAL_or : 'or';
LITERAL_rem : 'rem';
LITERAL_xor : 'xor';

//BLESS literals
LITERAL_aadlboolean: 'aadlboolean'; 
LITERAL_aadlinteger: 'aadlinteger'; 
LITERAL_aadlreal: 'aadlreal';
LITERAL_aadlstring: 'aadlstring';
LITERAL_abs:  'abs';
LITERAL_access: 'access';
LITERAL_all : 'all';
LITERAL_any:  'any';
LITERAL_applies: 'applies'; 
LITERAL_are : 'are';
LITERAL_array: 'array';
LITERAL_assert : 'assert';
LITERAL_Assertion: 'Assertion';
LITERAL_availability : 'availability';
LITERAL_base : 'base';
LITERAL_binding : 'binding';
LITERAL_boolean:  'boolean';
LITERAL_bound : 'bound';
LITERAL_call: 'call'; 
LITERAL_calls: 'calls';
LITERAL_case : 'case';
LITERAL_catch :'catch'; 
LITERAL_classifier: 'classifier';
LITERAL_complete: 'complete';
LITERAL_component: 'component';
LITERAL_computation : 'computation';
LITERAL_connection: 'connection';
LITERAL_connections: 'connections';
LITERAL_constant: 'constant';
LITERAL_count: 'count';
LITERAL_declare : 'declare';
LITERAL_def: 'def';
LITERAL_delay : 'delay';
LITERAL_dispatch : 'dispatch';
LITERAL_div : 'div';
LITERAL_do : 'do';
LITERAL_else: 'else';
LITERAL_enumeration: 'enumeration';
LITERAL_exception: 'exception';
LITERAL_extension : 'extension';
LITERAL_exists : 'exists';
LITERAL_extends: 'extends';
LITERAL_false : 'false';
LITERAL_feature: 'feature';
LITERAL_fetchadd: 'fetchadd';
LITERAL_fetchand: 'fetchand';
LITERAL_fetchor: 'fetchor';
LITERAL_fetchxor: 'fetchxor';
LITERAL_fi : 'fi';
LITERAL_final: 'final';
LITERAL_flow: 'flow';
LITERAL_for : 'for';
LITERAL_forall : 'forall';
LITERAL_fresh: 'fresh';
LITERAL_ghost : 'ghost';
//LITERAL_hr: 'hr';
LITERAL_if : 'if';
LITERAL_iff: 'iff';
LITERAL_implementation: 'implementation';
LITERAL_implies: 'implies';
LITERAL_in : 'in';
LITERAL_inherit: 'inherit';
LITERAL_initial: 'initial';
LITERAL_internal: 'internal';
LITERAL_invariant : 'invariant';
LITERAL_Invariant: 'Invariant';
LITERAL_inverse: 'inverse';
LITERAL_is: 'is';
LITERAL_list: 'list';
LITERAL_lower_bound:  'lower_bound';
//LITERAL_min: 'min';
LITERAL_mode: 'mode';
LITERAL_modes:  'modes';
//LITERAL_ms: 'ms';
LITERAL_nonvolatile : 'nonvolatile';
LITERAL_not : 'not';
LITERAL_now : 'now';
//LITERAL_ns: 'ns';
LITERAL_null :'null';
LITERAL_numberof: 'numberof';
LITERAL_of: 'of';
LITERAL_on:  'on';
LITERAL_package: 'package';
LITERAL_parameter: 'parameter';
LITERAL_pause:  'pause';
LITERAL_post : 'post';
LITERAL_Postcondition: 'Postcondition';
LITERAL_pre : 'pre';
LITERAL_Precondition: 'Precondition';
LITERAL_private: 'private';
LITERAL_product: 'product';
LITERAL_property: 'property'; 
LITERAL_provides: 'provides'; 
//LITERAL_ps: 'ps';
LITERAL_public: 'public';
LITERAL_quantity : 'quantity';
LITERAL_range: 'range';
LITERAL_record : 'record';
LITERAL_reference: 'reference';
LITERAL_renames: 'renames';
LITERAL_returns : 'returns' ;
LITERAL_representation : 'representation';
LITERAL_requires: 'requires';
LITERAL_round: 'round';
LITERAL_scalar : 'scalar';
//LITERAL_sec: 'sec';
LITERAL_self: 'self';
LITERAL_sequence: 'sequence';
LITERAL_set: 'set';
LITERAL_setmode : 'setmode';
LITERAL_shared : 'shared';
LITERAL_skip : 'skip';
LITERAL_spread: 'spread';
LITERAL_state : 'state';
LITERAL_states : 'states';
LITERAL_step : 'step';
LITERAL_stop : 'stop';
LITERAL_string:  'string';
LITERAL_subcomponents: 'subcomponents';
LITERAL_sum: 'sum';
LITERAL_swap: 'swap';
LITERAL_that : 'that';
LITERAL_then: 'then';
LITERAL_throw :'throw'; 
LITERAL_throws : 'throws';
//LITERAL_time: 'time';
LITERAL_timeout : 'timeout';
LITERAL_to: 'to';
LITERAL_tops: 'tops';
LITERAL_transition: 'transition';
LITERAL_transitions : 'transitions';
LITERAL_true : 'true';
LITERAL_truncate : 'truncate';
LITERAL_type : 'type';  //this is not the same as TYPE the root of all type trees
LITERAL_Typed: 'Typed';
LITERAL_union : 'union';
LITERAL_units : 'units';
LITERAL_until : 'until';
LITERAL_updated: 'updated';
LITERAL_upper_bound:  'upper_bound';
//LITERAL_us: 'us';
LITERAL_variables : 'variables';
LITERAL_variant: 'variant';
LITERAL_when :'when'; 
LITERAL_while : 'while';
LITERAL_which : 'which';
LITERAL_whole : 'whole';
LITERAL_with: 'with';

//multi-character tokens

ID :  ( 'a'..'z' | 'A'..'Z' )   
  ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*   
  ; 

// a few protected methods to assist in matching the various numbers

fragment
DIGIT   :  ( '0'..'9' ) ;

fragment
EXPONENT   :  ('e'|'E') ('+'|'-')? ( DIGIT )+ ;
/*
fragment
INT_EXPONENT  :  ('e'|'E') ('+')? ( DIGIT )+ 
  ;

fragment
EXTENDED_DIGIT     :  ( DIGIT | 'a'..'f' ) ;

fragment
BASED_INTEGER      :  ( EXTENDED_DIGIT ) ( ('_')? EXTENDED_DIGIT )* ;

fragment
BASE        : DIGIT ( DIGIT )?
;
*/
//NUMBER: '-'? DIGIT+ ('.' DIGIT+ ('e' '-'? DIGIT+)? )? ;

START_ASSERTION_PROPERTY : '"<<';

END_ASSERTION_PROPERTY : '>>"';

fragment
LT_STRING : '"<"';

fragment
LTE_STRING : '"<="';

fragment
MT_STRING : '""';

fragment
AADL_STRING_PART :
LT_STRING | LTE_STRING | MT_STRING
|
'"' ~('<') ( ( '""' | ~('"') )* '"' ) ;


//break strings over lines
AADL_STRING_LITERAL  returns [Token tok]
  @init {StringBuffer sb = new StringBuffer();
         boolean hasMore=false;}
  : //append all the sub-strings into a StringBuffer
  p=AADL_STRING_PART 
    {sb.append(p.getText());}
  ( '+' r=AADL_STRING_PART 
    {sb.append(r.getText()); hasMore=true;} 
  )* 
    {if (hasMore) r.setText(sb.toString()); 
    tok = r;}
  ;


LT :  '<' ;
GT :  '>' ;

TICK : '\'' ;

ARROW : '=>'; //value association for AADL properties

IMP : '->';  //implies, logical implication & directional connection

BI : '<->'; //bidirectional connection

EQ : '=';

//NEQ : '!=';
NEQ : '<>';
OLD_NEQ : '!=';

AM : '<=';

AL : '>=';

PLUS_EQUALS : '+=';  //indivisible addition; often used with fetch-add

LCON : '-[';  //left side of transition condition

RCON : ']->';  //right side of transition condition

BOX : '[]';   //separates alternatives in if-fi

EXCLAMATION : '!';

QUESTION : '?';
 
GUARD : ')~>';  //right side of guard for guarded_action

LASS : '<<';  //left side of assertion

RASS : '>>';  //right side of assertion

QQ : '??';  //used for conditional expression
 
relationSymbol
  :
  EQ | NEQ | LT | AM | AL | GT | OLD_NEQ | PLUS_EQUALS
  ;


rangeSymbol : DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA; 

propertyName
  :
  propertyset=ID dc=DOUBLE_COLON propertyid=ID
    -> ^($dc $propertyset $propertyid)
  ;

componentName
  :
	id=ID ( dc=DOUBLE_COLON id2+=ID ( DOUBLE_COLON id2+=ID )  )? (dot=DOT imp=ID)?
	  -> {dc!=null&&dot!=null}?  ^($dc $id $id2* ^($dot $imp) )
	  -> {dc!=null&&dot==null}?  ^($dc $id $id2* )
	  -> {dc==null&&dot!=null}?  ^($id ^($dot $imp) )
	  -> $id
	;

modeTrigger
  :
  ID ( DOT^ ID ( DOT ID )* )?
  ;	

identifier 
  : ID ;
  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); Dump.it("\nYou may be using a reserved word inappropriately.\n");throw(re);}


/////////////////////////   UNIT   \\\\\\\\\\\\\\\\\\\\\\\\

unitLibrary:
  unitDeclarations+=unitDeclaration+
    -> ^( UNIT_LIBRARY $unitDeclarations+ )
  ;

unitName
  :   
  ( lt=LT (longname+=ID)+ GT )? id=ID 
    -> ^( UNIT_NAME $id $longname* )
;

unitFormula:
  top+=ID+ ( slash=DIVIDE bottom+=ID+ )?
    -> ^( UNIT_FORMULA $top+ $slash? $bottom* )
  |
  slash=DIVIDE bottom+=ID+
    -> ^( UNIT_FORMULA $slash $bottom+ )
  ;

unitDeclaration: 
  rootDeclaration | unitExtension
  ;

rootDeclaration:   
  ( base=LITERAL_base | formula=unitFormula ) lb=LBRACKET kindWords+=ID+ RBRACKET 
  unit=unitName factors+=unitFactor* SEMICOLON
    -> ^( ROOT_DECLARATION $base? $formula? ^( $lb $kindWords+ ) $unit $factors* )
  ;

unitExtension:
  LITERAL_extension^ root=ID factors+=unitFactor+ SEMICOLON!
  ;

mulDiv: ( TIMES | DIVIDE )
  ;

unitFactor: 
  c=COMMA unit=unitName op=mulDiv factor=NUMBER
    -> ^( $c $unit $op $factor )
  ;

///////////////////////////   TYPE   \\\\\\\\\\\\\\\\\\\\\\\\\\

typeLibrary:  
  decs+=typeDeclaration+
  ;

typeDeclaration:
  LITERAL_type^ id=ID LITERAL_is! ty=type
  ;

type:
  enumerationType
  | quantityType
  | arrayType
  | recordType
  | LITERAL_boolean
  | LITERAL_string
  | LITERAL_null
;

typeOrReference:
  ty=type | ref=ID
  ;

enumerationType: 
  LITERAL_enumeration^ LPAREN! defining_enumeration_literal+=ID+ RPAREN!
  ;

quantityType: 
  q=LITERAL_quantity^ 
  ( unit=ID | scalar=LITERAL_scalar | whole=LITERAL_whole )
  ( LBRACKET! lb=aNumber dd=DOTDOT^ ub=aNumber RBRACKET! 
  ( st=LITERAL_step^ step=aNumber )? )? //check if positive
  ( rep=LITERAL_representation^ representation=propertyName )?
  ;

arrayType :   
  LITERAL_array^ LBRACKET! array_ranges=arrayRangeList RBRACKET! LITERAL_of ty=typeOrReference
  ;

arrayRangeList : 
  rang+=arrayRange ( COMMA^ rang+=arrayRange ( COMMA! rang+=arrayRange )* )? 
  ;

arrayRange : lb=aNumber ( DOTDOT^ ub=aNumber)? ;

recordType : 
  (LITERAL_record | LITERAL_variant | LITERAL_union )^
  LPAREN! fields+=recordField+ RPAREN! 
  ;

recordField : 
  id=ID COLON^ ty=typeOrReference 
  ;


////////////////////////////   Assertion   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

assertionLibrary:
  ( ghosts=ghostVariables )?
  assertion_list+=namedAssertion*
  -> ^(ASSERTION_ANNEX $ghosts? $assertion_list*) 
  ;

ghostVariables
  :
  LITERAL_ghost^ LITERAL_variables! gv+=ghostVariable+
  ;

ghostVariable:
  LITERAL_def^  id=ID TILDE! tod=typeOrReference  
  ;

namedAssertion: 
  lass=LASS
  ( id=ID COLON 
    (
    formals=variableList?
      ( //assertion_predicate
      col=COLON  pred=predicate 
      | //assertion_function
      ret=LITERAL_returns tod=typeOrReference ASSIGN  functionvalue=assertionFunctionValue 
      ) 
    | //assertion_enumeration
    assertionvariable=ID til=TILDE enumerationTy=ID enumeration=assertionEnumeration
    )
  )
  RASS
   -> {id!=null&&formals==null&&col!=null}? 
     ^( ASSERTION[$id,"ASSERTION["+$id.text+":"+Integer.toString($id.tree.getLine()+startingLine)+"]"] 
       ^( LABEL $id ) $pred )                                          
   -> {id!=null&&formals!=null&&col!=null}? 
     ^( ASSERTION[$id,"ASSERTION["+$id.text+":"+Integer.toString($id.tree.getLine()+startingLine)+"]"] 
       ^( LABEL $id ) ^( PARAMETERS $formals ) $pred )
   -> {id!=null&&formals==null&&ret!=null}? 
     ^( ASSERTION_FUNCTION[$id,"ASSERTION_FUNCTION["+$id.text+":"+Integer.toString($id.tree.getLine()+startingLine)+"]"] 
       ^( LABEL $id ) ^( $ret $tod ) $functionvalue )                                          
   -> {id!=null&&formals!=null&&ret!=null}? 
     ^( ASSERTION_FUNCTION[$id,"ASSERTION_FUNCTION["+$id.text+":"+Integer.toString($id.tree.getLine()+startingLine)+"]"] 
       ^( LABEL $id ) ^( PARAMETERS $formals ) ^( $ret $tod ) $functionvalue ) 
   -> {til!=null}?  
     ^( ASSERTION_ENUMERATION[$id,"ASSERTION_ENUMERATION["+$id.text+":"+Integer.toString($id.tree.getLine()+startingLine)+"]"] 
       ^( LABEL $id ) ^( $til $assertionvariable $enumerationTy ) $enumeration  ) 
   -> $lass  //error
; 
predicate:  ex=expression
  -> $ex
  ;

variableList:
  first=variable ( COMMA^ parameter+=variable ( COMMA! parameter+=variable )* )?
;

variable:
  id=ID TILDE^ tod=typeOrReference
	;
	
assertionFunctionValue:
	conditionalAssertionFunction 
	| expression  
	;	

conditionalAssertionFunction:
	LBRACKET cvp+=conditionValuePair ( COMMA cvp+=conditionValuePair )* RBRACKET
	  -> ^( CONDITIONAL_ASSERTION_FUNCTION $cvp* )
	;	
	
conditionValuePair:
  LPAREN! predicate CVP^ expression
  ;
	
assertionEnumeration:
	( pa=PLUS_ARROW inv=invocation )
	  -> ^( $pa $inv )
	|
	( pa=PLUS_ARROW pair+=enumerationPair ( com=COMMA pair+=enumerationPair ( COMMA pair+=enumerationPair )* )? )
//	  -> {com!=null}? ^( $pa ^( $com $pair+ ) )
	  -> ^( $pa $pair+ )
	;
	
enumerationPair:
  ID IMP^ predicate
	;	

enumerationValue:
  enumeration_type=ID TICK^ enumeration_value=ID
  ;


namelessAssertion:
  la=LASS pred=predicate RASS
    -> ^( ASSERTION[$la,"ASSERTION["+Integer.toString($la.getLine()+startingLine)+"]"] $pred )
  ;
  
namelessFunction:
  LASS ret=LITERAL_returns tod=typeOrReference ASSIGN functionvalue=assertionFunctionValue RASS
    -> ^( ASSERTION_FUNCTION[$ret,"ASSERTION_FUNCTION["+Integer.toString($ret.getLine()+startingLine)+"]"] ^( $ret $tod ) $functionvalue  )
  ;	
		
namelessEnumeration:
	LASS pa=PLUS_ARROW inv=invocation RASS
	  ->  ^( ASSERTION_ENUMERATION[$pa,"ASSERTION_ENUMERATION["+Integer.toString($pa.getLine()+startingLine)+"]"] $inv )
	;

assertion
//  options{backtrack=true;}
:
  (LASS ID COLON)=> namedAssertion
  | (LASS LITERAL_returns)=> namelessFunction
  | (LASS PLUS_ARROW)=> namelessEnumeration
  | namelessAssertion
  ;


invocation:
	id=ID LPAREN 
	( ( params+=actualParameter ( COMMA params+=actualParameter )* )
	  | exp=expression )? RPAREN
	  -> ^( INVOKE[$id, "INVOKE["+$id.text+":"+Integer.toString($id.getLine()+startingLine)+"] " ] $id $params* $exp? )
	;

actualParameter:
  formal=ID COLON^ actual=expression
  ;
  
//////////////////////////  EXPRESSION   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

expression:
  all=universalQuantification
  | exists=existentialQuantification
  | sum=sumQuantification
  | product=productQuantification
  | numberof=countingQuantification
  | l=disjunction ( (LITERAL_iff^ | LITERAL_implies^) r=disjunction)?
; 


universalQuantification:
  al=LITERAL_all lv=logicVariables  
    (i=LITERAL_in r=range | w=LITERAL_which b=predicate )
     ar=LITERAL_are pred=predicate
   -> {i!=null}? ^( $al $lv ^( $i $r ) ^( $ar $pred ) )
   -> {w!=null}? ^( $al $lv ^( $w $b ) ^( $ar $pred ) )
   -> $al
  ;

existentialQuantification:
  ex=LITERAL_exists lv=logicVariables  
    (i=LITERAL_in r=range | th=LITERAL_that b=predicate )
     th=LITERAL_that pred=predicate
   -> {i!=null}? ^( $ex $lv ^( $i $r ) ^( $th $pred ) )
   -> {th!=null}? ^( $ex $lv ^( $th $b ) ^( $th $pred ) )
   -> $ex
  ;

sumQuantification:
  sum=LITERAL_sum lv=logicVariables  
    (i=LITERAL_in r=range | w=LITERAL_which b=predicate )
     ar=LITERAL_of ex=expression
   -> {i!=null}? ^( $sum $lv ^( $i $r ) ^( $ar $ex ) )
   -> {w!=null}? ^( $sum $lv ^( $w $b ) ^( $ar $ex ) )
   -> $sum
  ;

productQuantification:
  pr=LITERAL_product lv=logicVariables  
    (i=LITERAL_in r=range | w=LITERAL_which b=predicate )
     ar=LITERAL_of ex=expression
   -> {i!=null}? ^( $pr $lv ^( $i $r ) ^( $ar $ex ) )
   -> {w!=null}? ^( $pr $lv ^( $w $b ) ^( $ar $ex ) )
   -> $pr
  ;

countingQuantification:
  n=LITERAL_numberof lv=logicVariables  
    (i=LITERAL_in r=range | w=LITERAL_which b=predicate )
     ar=LITERAL_that ex=expression
   -> {i!=null}? ^( $n $lv ^( $i $r ) ^( $ar $ex ) )
   -> {w!=null}? ^( $n $lv ^( $w $b ) ^( $ar $ex ) )
   -> $n
  ;

logicVariables:
  lv+=variable ( COMMA^ lv+=variable ( COMMA! lv+=variable )* )?
  ;
  
disjunction:
  l=conjunction 
     (
     ( LITERAL_or^ r+=conjunction ( LITERAL_or! r+=conjunction )*)
     |	
     ( LITERAL_or! LITERAL_else^ r+=conjunction ( LITERAL_or! LITERAL_else! r+=conjunction )*)
     |	
     ( LITERAL_xor^ r+=conjunction ( LITERAL_xor! r+=conjunction )*)
     )?
;

conjunction:
  l=relation
    ( ( LITERAL_and^ r+=relation ( LITERAL_and! r+=relation )* )
    |	( LITERAL_and! LITERAL_then^ r+=relation ( LITERAL_and! LITERAL_then! r+=relation )* )
    )?
;

relation:
	addSub
	(
	  ( relationSymbol^ addSub )
	  |
	  ( LITERAL_in^ range )
	)?
	;

range: subexpression rangeSymbol^ subexpression ;

addSub:
  multDiv
  (
    ( PLUS^ multDiv ( PLUS! multDiv )* )
    |
    ( MINUS^ multDiv )
  )?
  ;	

multDiv:
  exponentiation
  (
    ( TIMES^ exponentiation ( TIMES! exponentiation )* )
    |
  	( dividers^ exponentiation )
  )?
  ;	
	
dividers: DIVIDE | LITERAL_div | LITERAL_mod | LITERAL_rem ;	
	
exponentiation:
  subexpression ( EXP^ subexpression )?
  ;	
	
subexpression:
  n=LITERAL_not te=timedExpression
    -> ^( $n $te )
	|
  abs=LITERAL_abs te=timedExpression
    -> ^( $abs $te )
	|
  trunc=LITERAL_truncate te=timedExpression
    -> ^( $trunc $te )
	|
  rnd=LITERAL_round te=timedExpression
    -> ^( $rnd $te )
	|
	MINUS te=timedExpression
	  -> ^( UNARY_MINUS $te )
	|
	te=timedExpression
	  -> $te
	;

unaryOperator:
	LITERAL_not | LITERAL_abs | LITERAL_truncate | LITERAL_round
	;

timedExpression:
  timedSubject
  (
  AT_SIGN^ subexpression
  | TICK
  | CARET^ periodShift
  )?
  ;
	
timedSubject:
  (LPAREN LITERAL_if)=> conditionalExpression
  | parenthesizedSubexpression 
  | (LBRACKET ID COLON )=> recordTerm
  | (ID LPAREN)=> invocation  
  | value
  ;

parenthesizedSubexpression:
	LPAREN^ 
	( 
	  ( expression ( QQ^ expression COLON! expression )? )
	  | 
	  caseexpression=caseExpression
  )
  RPAREN
;

caseExpression:
  LITERAL_case^ caseChoice+
  ;

caseChoice
  :
  LPAREN! bool=expression IMP^ exp=expression RPAREN!
  ;
 
conditionalExpression:
  lp=LPAREN LITERAL_if pred=expression LITERAL_then t=expression LITERAL_else f=expression rp=RPAREN
    -> ^( $lp ^( QQ $pred $t $f ) $rp )
	; 

recordTerm
  :
  LBRACKET typeid=ID COLON prv+=recordValue+ RBRACKET 
    -> ^(RECORD_TERM $typeid $prv+)
  ;
  
recordValue
  :
  /*record_field_*/identifier ARROW^ value SEMICOLON!
  ;  
  
periodShift:
	( m=MINUS )?
	(
	  v=value
	  | 
	  (lp=LPAREN ie=indexExpression rp=RPAREN)
	)
	-> {m!=null&&v!=null}? ^( UNARY_MINUS $v )
	-> {m!=null&&ie!=null}? ^( UNARY_MINUS ^( $lp $ie $rp ) )
	-> {m==null&&v!=null}? $v
	-> ^( $lp $ie $rp ) 
	;  	

indexExpression:
	periodShift
	(
	  MINUS^ periodShift
	  |
	  LITERAL_div^ periodShift
	  |
	  LITERAL_mod^ periodShift
	  |
	  LITERAL_rem^ periodShift
	  |
	  PLUS^ periodShift ( PLUS! periodShift )*
	  |
	  TIMES^ periodShift ( TIMES! periodShift )*
	)?
	;

indexExpressionOrRange:
	indexExpression ( DOTDOT^ indexExpression )?
	;

//////////////////////////   VALUE   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

value:
  valueName
  |
  constant
  |
  LITERAL_timeout
  |
  LITERAL_now
  |
  LITERAL_tops
  |
  enumerationValue
	;
		
valueName:
  id=ID //[aadl2::NamedElement|ID] //resolve as variable or feature (port)
  //either function call or variable or port 
    ( dol=DOLLAR lp=LPAREN  pr=functionParameters? RPAREN )?
  	( lb=LBRACKET array_index+=indexExpressionOrRange RBRACKET 
  	  ( LBRACKET array_index+=indexExpressionOrRange RBRACKET )* )? //optional array index
  	( dot=DOT pn+=partialName ( DOT pn+=partialName )* )?
    (  q=QUESTION  
    | t=TICK fresh=LITERAL_fresh //fresh is boolean
    | t=TICK count=LITERAL_count
    | t=TICK updated=LITERAL_updated
 //   | t=TICK enum=ID  //enumerationValue
    )?
  -> {dol!=null}? ^( $id $dol $pr )
  -> {lb!=null&&dot!=null}? ^( $id ^( $lb $array_index+ ) ^( $dot $pn+ ) )
  -> {lb!=null&&dot==null}? ^( $id ^( $lb $array_index+ ) DOT )  //to avoid unparse ambiguity
  -> {lb==null&&dot!=null}? ^( $id ^( $dot $pn+ ) )
  -> {q!=null}? ^( $q $id )
  -> {fresh!=null}? ^( $t $id $fresh )
  -> {count!=null}? ^( $t $id $count )
  -> {updated!=null}? ^( $t $id $updated )
  -> $id
	;

functionParameters:
 	parameters+=formalExpressionPair ( COMMA^ parameters+=formalExpressionPair 
		( COMMA! parameters+=formalExpressionPair)* )? 
;

formalExpressionPair:
  formal=ID  //[aadl2::Parameter] 
    COLON^ actual=expression
  ;

partialName:
	record_id=ID  //[RecordField]
	 ( lb=LBRACKET array_index+=indexExpressionOrRange RBRACKET 
		( LBRACKET array_index+=indexExpressionOrRange RBRACKET )* )?
	-> {lb!=null}? ^( $record_id ^( $lb $array_index+ ) )
	-> $record_id
  ;
	
constant:
  quantity
  |
  AADL_STRING_LITERAL
  |
  LITERAL_true
  |
  LITERAL_false
  |
  LITERAL_null
  ;
	

quantity: 
  num=aNumber u=ID 
   -> ^( QUANTITY $num $u )
  | 
  num=aNumber scalar=LITERAL_scalar 
   -> ^( QUANTITY $num  $scalar )
  | 
  num=aNumber whole=LITERAL_whole 
   -> ^( QUANTITY $num $whole )
  |
  num=aNumber 
   -> ^( QUANTITY $num )
  ;  

aNumber:
 lit=NUMBER
 | property=propertyReference
 | propertyConstant=propertyName //[aadl2::PropertyConstant|propertyName]
  ;
  
propertyReference:
	OCTOTHORPE^ pname=propertyName  //[aadl2::Property|propertyName] 
	  ( field+=propertyField )*
	//component_element_reference
	| LITERAL_self OCTOTHORPE^ spname=propertyName  //[aadl2::Property|propertyName] 
	  ( field+=propertyField )*
	| component=componentName //[aadl2::ComponentClassifier|componentName] 
	  OCTOTHORPE^ cpname=propertyName  //[aadl2::Property|propertyName]
	   ( field+=propertyField )*
  ;


propertyField:
	LBRACKET^ (index=NUMBER | var=ID ) //[Variable]) 
	   RBRACKET!  //must check that number is integer
	| DOT^  (pf=ID | upper=LITERAL_upper_bound | lower=LITERAL_lower_bound)
  ;
		
/////////////////////////   ACTION   \\\\\\\\\\\\\\\\\\\\\\\\\

actionSubclause:
	no_proof = DO_NOT_PROVE?
  throws_clause=throwsClause? 
  assert_clause=assertClause?  //optionally set av
  ( pre=LITERAL_pre precondition=assertion )?
  ( post=LITERAL_post postcondition=assertion )?	
  ( inv=LITERAL_invariant invariant=assertion )?	
  elq=existentialLatticeQuantification
  -> ^( ACTION_SUBCLAUSE $no_proof? $throws_clause? $assert_clause? ^( LITERAL_pre $precondition? )
     ^( LITERAL_post $postcondition? ) ^( LITERAL_invariant $invariant ) $elq )
;

throwsClause:
	LITERAL_throws^ exceptions+=ID+  //[Exception]
  ;

assertClause:
  LITERAL_assert^ namedAssertion+
  ;
	
//actionTimeout:
//  LITERAL_timeout^ behaviorTime
//  ;	
	

behaviorTime:
  quantity
  | valueName
  | parenthesizedSubexpression
  ;	


catchClause:
	LITERAL_catch^ catchClauseTerm+
  ;

catchClauseTerm:
  LPAREN^
  ( exceptions+=ID+ | LITERAL_all ) colon=COLON act=basicAction RPAREN
  ;

quantifiedVariables:
  LITERAL_declare^ variableDeclaration+
	;

variableDeclaration:
  v=variable
	( //modifier
	  nv=LITERAL_nonvolatile 
  	| sh=LITERAL_shared 
  	| c=LITERAL_constant
    | sp=LITERAL_spread
    | f=LITERAL_final
  )? 
  ( assign=ASSIGN exp=expression )? 
  a=assertion?  
  semi=SEMICOLON?
    -> {assign!=null}? ^( VARIABLE_DECLARATION $v ^( $assign $exp ) $a? $nv? $sh? $c? $sp? $f? )
    -> ^( VARIABLE_DECLARATION $v $a? $nv? $sh? $c? $sp? $f? )
  ; 


behaviorActions:
  a+=assertedAction
  (  //sequential_composition
  	( SEMICOLON^ a+=assertedAction ( SEMICOLON! a+=assertedAction )* )
  	|  //concurrent_composition
  	( AMPERSAND^ a+=assertedAction ( AMPERSAND a+=assertedAction)* )
  )?
;

assertedAction  :
  pre=assertion?  //precondition
  s=action
  post=assertion? //postcondition
    -> 
    ^( ACTION[$s.tree.getToken(),"ACTION["+Integer.toString($s.tree.getLine()+startingLine)+"]"]       
        ^( P["P"] $pre? ) 
        ^( S[$s.tree.getToken(),"S["+Integer.toString($s.tree.getLine()+startingLine)+"]"] $s ) 
        ^( Q["Q"] $post? ) 
         )
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }

action:
  basicAction
  | if_fi=alternative
  | wl=whileLoop
  | fl=forLoop
  | du=doUntilLoop
  | elq=existentialLatticeQuantification //behavior_action_block
  | ulq=universalLatticeQuantification   //forall_action
  ;

basicAction:
  LITERAL_skip
  | assignment
  | ^( LITERAL_setmode mode=ID ) //[aadl2::Mode]
  | whenThrow
  | combinableOperation
  | communicationAction 
  | computation
  | simultaneousAssignment
// //BA2015 reconciliation add IssueException
  | issueException
  ;

assignment:
  nameTick ASSIGN^ expressionOrAny
  ;

simultaneousAssignment :
	VERT 
	lhs+=nameTick left_comma=COMMA lhs+=nameTick ( COMMA lhs+=nameTick )*
	a=ASSIGN 
	rhs+=expressionOrAny right_comma=COMMA rhs+=expressionOrAny ( COMMA rhs+=expressionOrAny )*
  VERT
    -> ^($a ^($left_comma $lhs+ )  ^($right_comma $rhs+ ) )
;

nameTick: valueName ( TICK^ )? ;

expressionOrAny:
  expression | LITERAL_any
  ;

whenThrow:
  LITERAL_when^ LPAREN exp=expression RPAREN LITERAL_throw excep=ID  //[Exception]  
  message=AADL_STRING_LITERAL?      
  ;

combinableOperation:
  f_add=LITERAL_fetchadd^ LPAREN! target=ID COMMA! arithmetic=expression COMMA! result=ID RPAREN! 
  |
  f_or=LITERAL_fetchor^ LPAREN! target=ID COMMA! bool=expression COMMA! result=ID RPAREN!
  |
  f_and=LITERAL_fetchand^ LPAREN! target=ID COMMA! bool=expression COMMA! result=ID RPAREN!
  |
  f_xor=LITERAL_fetchxor^ LPAREN! target=ID COMMA! bool=expression COMMA! result=ID RPAREN!
  |
  sw=LITERAL_swap^ LPAREN! target=ID COMMA! reference=ID COMMA! result=ID RPAREN!
  ;

communicationAction:
  pc=subprogramCall
  |
  po=portOutput
  |
  pi=portInput
//  |  //freeze port
//  fp=freezePort
//  |
//  pa=pause
  ;

computation:
  LITERAL_computation^ LPAREN! lb=behaviorTime ( COMMA! ub=behaviorTime )? RPAREN!
    ( LITERAL_in! LITERAL_binding^ component=componentName+ )?
  ;

subprogramCall:
  id=ID LPAREN fal=formalActualList? RPAREN
    -> ^( SUBPROGRAM_INVOCATION[$id,
      "SUBPROGRAM_INVOCATION["+$id.text+":"+Integer.toString($id.getLine()+startingLine)+"] "] $id $fal )
  ;

formalActualList:
  formalActual ( COMMA^ formalActual ( COMMA! formalActual )* )?
  ;

formalActual:
  ( formal=ID  //[aadl2::Parameter] 
    COLON^ )? actual=subProgramParameter
  ;

subProgramParameter:
	valueName
	| constant
	| parenthesizedSubexpression
  ;

portOutput:
    pn=ID EXCLAMATION ( LPAREN be=expression RPAREN )?  //output
    -> ^( PORT_OUTPUT[$pn, //.tree.getToken(),
      "PORT_OUTPUT["+Integer.toString($pn.tree.getLine() //+startingLine
      )+"]"] $pn $be? )
   ;
  
portInput:  
    pn2=ID QUESTION LPAREN n=/*local_variable_ or outgoing_port_ or outgoing_parameter_*/valueName RPAREN   //input
     -> ^( PORT_INPUT[$pn2,  //.tree.getToken(),
      "PORT_INPUT["+Integer.toString($pn2.tree.getLine() //+startingLine
      )+"]"] $pn2 $n )
  ;
    
alternative:
  lif=LITERAL_if 
//  av=availability?    
  alt+=guardedAction
  ( BOX alt+=guardedAction )+ 
  LITERAL_fi
    -> ^( $lif $alt+ )
//    -> ^( $lif $av? $alt+ )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }

guardedAction:
  LPAREN! /*boolean_*/expression GUARD^ assertedAction
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }
  
whileLoop:
  lw=LITERAL_while  
  LPAREN be=/*boolean_*/expression RPAREN
//  av=availability?  
  ( LITERAL_invariant inv=assertion )?
  ( LITERAL_bound bd=/*integer_*/expression )?  
  elq=existentialLatticeQuantification
    -> ^($lw $be ^(INVARIANT[$lw,"INVARIANT"] $inv?) ^(BOUND[$lw,"BOUND"] $bd?) $elq )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }

forLoop:
  lf=LITERAL_for
  a=/*integer_*/identifier  li=LITERAL_in lb=/*integer_*/expression DOTDOT ub=/*integer_*/expression 
  ( LITERAL_invariant inv=assertion )?
  LCURLY  act=behaviorActions RCURLY  //keep the closing }
    ->^($lf $a ^($li $lb $ub) ^(INVARIANT[$lf,"INVARIANT"] $inv?) $act ) 
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }
 
doUntilLoop:
  ld=LITERAL_do 
  ( LITERAL_invariant inv=assertion )?
  ( LITERAL_bound bd=/*integer_*/expression )?  
  ba=behaviorActions
  lu=LITERAL_until LPAREN be=/*boolean_*/expression RPAREN   
    ->^($ld ^($lu $be) ^(INVARIANT[$ld,"INVARIANT"] $inv?) ^(BOUND[$ld,"BOUND"] $bd?) $ba )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }


existentialLatticeQuantification:	
  qv=quantifiedVariables?
  lc=LCURLY^  ba=behaviorActions RCURLY  //keep the closing }
  cc=catchClause?
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }
  
universalLatticeQuantification:
  lf=LITERAL_forall   
  lv+=ID+ li=LITERAL_in lb=expression DOTDOT ub=expression  
//  av=availability? 
  elq=existentialLatticeQuantification
    -> ^($lf $lv+ ^($li $lb $ub) $elq )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }

issueException:
	LITERAL_exception^ LPAREN exception=ID  //[Exception]
	 message=AADL_STRING_LITERAL? RPAREN
;

///////////////////////////////  STATE MACHINE   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


blessSubclause:
	no_proof=DO_NOT_PROVE?
  ac=assertClause?  
  inv=invariantClause?
  vs=variablesSection?
  ss=statesSection?
  t=transitions?
    -> ^( BLESS_SUBCLAUSE $no_proof $ac $inv $vs $ss $t )
	;

invariantClause:
  LITERAL_invariant^ assertion 
  ;

variablesSection:
	LITERAL_variables^ vd+=variableDeclaration+
;

statesSection:
	  LITERAL_states^ states+=behaviorState+ 
;

//behavior_state
//allow states to have more than one:  initial complete final
//for BA2015 reconciliation
behaviorState:
  i=identifier 
  COLON (init=LITERAL_initial | com=LITERAL_complete | finl=LITERAL_final)? st=LITERAL_state a=assertion? SEMICOLON?
    -> ^( LITERAL_state[$st,"state["+Integer.toString($st.getLine()+startingLine)+"]"] $init? $com? $finl? $i $a? )
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());}

transitions 
  : 
  t=LITERAL_transitions bt+=behaviorTransition+
    -> ^( LITERAL_transitions[$t,"transitions["+Integer.toString($t.getLine()+startingLine)+"]"] $bt+ )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("If you get \"mismatched input"+
      " '<<' expecting 'transitions'\" then you might have put a semicolon "+
      "between an action and a Assertion, instead of afterwards.");}
 
behaviorTransition
  :
   id=ID pr=priority? COLON 
  /*source_state_*/ssi+=identifier ( COMMA /*source_state_*/ssi+=identifier )*
  x=LCON bc=behaviorCondition? RCON
  /*destination_state*/dsi=identifier 
  ( LCURLY s=behaviorActions RCURLY | EMPTY_CURLY )
  q=assertion? semi=SEMICOLON?
    -> 
      ^( TRANSITION[$x,"TRANSITION["+Integer.toString($x.getLine()+startingLine)+"]"] 
      ^( LABEL[$x,"LABEL["+Integer.toString($x.getLine()+startingLine)+"]"] $id $pr? ) 
      ^( SOURCE[$x,"SOURCE["+Integer.toString($x.getLine()+startingLine)+"]"] $ssi+ ) 
      ^( CONDITION[$x,"CONDITION["+Integer.toString($x.getLine()+startingLine)+"]"] $bc? ) 
      ^( DESTINATION[$x,"DESTINATION["+Integer.toString($x.getLine()+startingLine)+"]"] $dsi ) 
      ^( ACTION[$x,"ACTION["+Integer.toString($x.getLine()+startingLine)+"]"] $s? ) 
      ^( Q[$semi,"Q["+Integer.toString($semi.getLine()+startingLine)+"]"] $q?) 
      )
  ; 
  catch [RecognitionException re] 
    {
    Dump.it("\nDo you have either behavior actions or empty curly brackets?");
    Dump.it("Is there a space between your empty curly brackets?\nYou stink!  Take a bath.\n");
    Dump.it("Is your execute condition grammatically-correct? ");
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());}

priority:
	LBRACKET^ NUMBER RBRACKET
;

behaviorCondition 
  : 
  dispatchCondition | executeCondition | modeCondition | internalCondition
  ;

dispatchCondition:
  LITERAL_on! LITERAL_dispatch^ de=dispatchExpression? 
  //BA2015 reconciliation declare ports to be frozen
//  frozen=FreezePort?
;

dispatchExpression:
  dc+=dispatchConjunction ( LITERAL_or^ dc+=dispatchConjunction 
  	( LITERAL_or! dc+=dispatchConjunction )* )?
  	//BA2015 reconciliation 
//  | subprogramaccessdispatch=SubprogramAccessDispatch
;

dispatchConjunction:
  trigger+=dispatchTrigger 
    ( LITERAL_and^ trigger+=dispatchTrigger 
    	( LITERAL_and! trigger+=dispatchTrigger)* )? 
;

dispatchTrigger:
  port=portName  
  | LITERAL_timeout^ 
   ( ( LPAREN^ ports+=ID //[aadl2::NamedElement|ID] 
        (LITERAL_or! ports+=ID //[aadl2::NamedElement|ID] 
        )* RPAREN
      )?
   	 time=behaviorTime 
   )?
  ;

portName:
  port=ID^ //[aadl2::NamedElement|ID] 
  ( '[' index=NUMBER ']' )? 
;

executeCondition:
  /*boolean_*/expression
  ;

modeCondition:
	LITERAL_on^ tle=triggerLogicalExpression
	;

triggerLogicalExpression:
  first=eventTrigger ( op1=logicalOperator et+=eventTrigger 
    (op2=logicalOperator et+=eventTrigger {op1==op2}? )* )?
    -> {op1!=null}? ^($op1 $first $et+)
    -> $first
  ;
  catch [RecognitionException re] 
    {
    Dump.it("\nAll operators in trigger_logical_expression must be the same.");
    reportError(re,(BAST)retval.getTree());}
 
logicalOperator
  :
  LITERAL_and
  | LITERAL_or
  | LITERAL_xor
  | LITERAL_and! LITERAL_then
  | LITERAL_or! LITERAL_else
  ;
 
eventTrigger:
  tr=modeTrigger
  | LPAREN^ triggerLogicalExpression RPAREN
  ;

internalCondition:
	LITERAL_on! LITERAL_internal^ ports+=ID //[aadl2::Port]
	 ( LITERAL_or! ports+=ID  //[aadl2::Port]
	  )*
;  //note may need to make real port Name with index

	