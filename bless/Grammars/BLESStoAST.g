//BLESStoAST.g
grammar BLESStoAST;

 
options {
  language = Java;
  output = AST;
  ASTLabelType = BAST;
//  k=3;
//  ignoreCase = true;
}  //end of options

tokens 
{ FUNCTION_CALL; ASSERTION; ASSERTION_FUNCTION; ASSERTION_ENUMERATION; LABEL; PARAMETERS; CONDITIONAL_FUNCTION;
TYPE; TYPE_OPERATOR; PROCEDURE_CALL; INVOKE; INVOKE_FUNCTION; START; RECORD_VALUE; COMPONENT;
FUNCTION; PROCEDURE; FLOATING; UNARY_MINUS; //NAME;
VALUE; PREDICATE_RELATION; //assertion_subexpression;
IP_NAME; IP_PE; IP_PRED;  //invoctionParameter tags
//ASSERTED_FORMULA; 
P; S; Q; ACTION;  //asserted_action
BEHAVIOR_TIME; PORT_OUTPUT; PORT_INPUT; BEHAVIOR_GUARD;
TRANSITION; SOURCE; DESTINATION; CONDITION;
THREAD_ANNEX; SUBPROGRAM_ANNEX; ASSERTION_ANNEX;  //root of trees for AADL annex sublanguages
ON;   //for behavior_guard
INMODE;  //for 'in mode' clause
COUNTING_TRIGGER;  //for counting dispatch triggers in a dispatch condition, ormore/orless
INVARIANT; BOUND;  //for loops
TYPE_OPERATOR_INVOCATION; //for types
//remove these later
LITERAL_procedure; LITERAL_function;  //to fake-out DANCE token tests
//TYPE;   //root of all type trees
WP;  //weakest precondition
STOP; //used to mark the end of some strings of children
OBLIGATION; //root of tree representation of ProofObligation
COMPONENT; //AADL component root
SUBCOMPONENT; //AADL subcomponent root
PORT; //AADL port feature root
INOUT;	//both in and out direction for port
TOP;  //the set of all values; every values is in TOP
CONNECTION; //AADL onnection between ports  
PROPERTY_LIST;  //root of AADL property list
THREAD_GROUP;  //component_category for thread group
DUMMY;  //used for dummy roots of trees
PARAMETER;  // formal:actual in predicate_invocation b:c => ^(PARAMETER b c)
COMPLEX;  //complex literal
RATIONAL;  //rational literal
CONDITIONAL;  //conditional expression, replaces QQ='??'
CASE_EXPRESSION;  //case expression
} //end of tokens


@header {
//copyright 2020 Multitude Corporation
package com.multitude.bless.antlr3generated;
import java.util.HashMap;
import java.util.Vector;
//import com.multitude.bless.BAST;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import com.multitude.bless.exceptions.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.app.Global;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.record.ThreadRecord;
import com.multitude.bless.record.DataRecord;
import com.multitude.bless.record.SubprogramRecord;
import com.multitude.bless.record.PropertySetRecord;
//import com.multitude.bless.symbol.Model;
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
  Dump.it("\nBLESS Syntax Error #"+
    Integer.toString(countRecognitionErrors)+"\n");
  error_messages.add(getErrorHeader(ex));  
  Dump.it("\nSome "+Global.dope+", made another "+
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
  if (countRecognitionErrors<Global.YouIdiotReportLimit)
    {
    recognitionErrorOccurred = true;
    ex.line = ex.line+startingLine;
    Dump.it("offending text = \""+input.toString()+"\"");
    Dump.it(getErrorHeader(ex));
//    super.reportError(ex);
  ex.printStackTrace();
//    StackTraceElement[] ste = ex.getStackTrace(); 
//    for (int k=0;k<ste.length;k++)
//      Dump.it("   "+ste[k].toString());     
//    HelpfulHints.giveHint();
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
 

//tell user of BNF when they make a mistake 
public boolean toldBNF=false;         
public void tellBNF(String s, RecognitionException re)
  {
  if (!toldBNF)
    {
    Dump.it("BNF reminder:\n"+s);
    toldBNF=true;
    }
  } //end of tellBNF(String s, RecognitionException re)
  
public void tellBNF(String s, RecognitionException re, BAST errorTree)
  {
  if (errorTree!=null)
    {
    errorTree.showParseTree(errorTree.getText()!=null?errorTree.getText():"error");
    Dump.it("error on line "+Integer.toString(errorTree.getLine()+startingLine)+": "+
      (errorTree.getText()!=null?errorTree.getText():""));
    }
  else Dump.it("error tree is null");
  tellBNF(s,re);
  }  //end of tellBNF(String s, RecognitionException re, BAST errorTree)
  
  
} //end of parser members

@lexer::header {
//copyright 2012 Multitude Corporation
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


// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'9' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.

//fragment
//ESC
//  : '\\'
//    ( 'n'
//    | 'r'
//    | 't'
//    | 'b'
//    | 'f'
//    | '"'
//    | '\''
//    | '\\'
//    | ('u')+ HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
//    | '0'..'3'
//      (
        /* options {
          warnWhenFollowAmbig = false;
        } */
 //       '0'..'7'
 //       (
          /* options {
            warnWhenFollowAmbig = false;
          } */
 //         '0'..'7'
//        )?
//      )?
//    | '4'..'7'
//      (
//        /* options {
//          warnWhenFollowAmbig = false;
//        } */
//        '0'..'7'
//      )?
//    )
 // ;


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

//need PERIOD before use in NUMERIC_LIT
//PERIOD : '.';

//numeric literal from AADL
//NUMERIC_LIT : 
//    ( DIGIT )+
//    (( '#' BASED_INTEGER  '#' ( INT_EXPONENT )? )
//    | ( '_' ( DIGIT )+ )*  // INTEGER
//      ( {input.LA(1)=='.' &&  input.LA(2)!='.' }?=>  //&& input.LA(3)!=PERIOD }?
//        // real
//      ( '.' ( DIGIT )+ ( '_' ( DIGIT )+ )* ( EXPONENT )?)
//        // integer with exponent
//      | (INT_EXPONENT)?
//      )
//    )
//  ;

REAL_LIT :  
  (DIGIT)+('_' (DIGIT)+)* ( '.' (DIGIT)+('_' (DIGIT)+)* ( EXPONENT )?)
  ;

INTEGER_LIT : 
    (DIGIT)+('_' (DIGIT)+)*
    (( '#' BASED_INTEGER  '#' ( INT_EXPONENT )? )
      | (INT_EXPONENT)?
    )
  ;
  
PERIOD : '.';

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

//used to make string literals in AADL -- not used in BLESS
DOUBLE_QUOTE :	'"';
//used to delineate annex subclauses and annex libraries in AADL
ANNEX_START:	'{**';
ANNEX_END:	'**}';

DO_NOT_PROVE: 'DO_NOT_PROVE';

//added for simultaneous_assignment
//ADDING THESE tokesn CAUSES WEIRD RECOGNITION ERRORS IN UnparseBLESS.java
//LSA : '|[';
//RSA : ']|';

//operatores that are literals
LITERAL_mod : 'mod';
LITERAL_rem : 'rem';
LITERAL_and : 'and';
LITERAL_or : 'or';
LITERAL_xor : 'xor';
LITERAL_cand : 'cand';
LITERAL_cor : 'cor';

//BLESS literals
LITERAL_record : 'record';
LITERAL_true : 'true';
LITERAL_false : 'false';
LITERAL_states : 'states';
LITERAL_assert : 'assert';
LITERAL_availability : 'availability';
LITERAL_invariant : 'invariant';
LITERAL_variables : 'variables';
LITERAL_nonvolatile : 'nonvolatile';
LITERAL_shared : 'shared';
LITERAL_skip : 'skip';
LITERAL_setmode : 'setmode';
LITERAL_not : 'not';
LITERAL_units : 'units';
LITERAL_pre : 'pre';
LITERAL_post : 'post';
LITERAL_forall : 'forall';
LITERAL_for : 'for';
LITERAL_if : 'if';
LITERAL_fi : 'fi';
LITERAL_while : 'while';
LITERAL_do : 'do';
LITERAL_until : 'until';
LITERAL_bound : 'bound';
LITERAL_declare : 'declare';
LITERAL_exists : 'exists';
LITERAL_that : 'that';
LITERAL_type : 'type';  //this is not the same as TYPE the root of all type trees
LITERAL_in : 'in';
LITERAL_transitions : 'transitions';
LITERAL_all : 'all';
LITERAL_are : 'are';
LITERAL_dispatch : 'dispatch';
LITERAL_now : 'now';
LITERAL_timeout : 'timeout';
LITERAL_state : 'state';
LITERAL_stop : 'stop';
LITERAL_computation : 'computation';
LITERAL_delay : 'delay';
LITERAL_implies: 'implies';
LITERAL_iff: 'iff';
LITERAL_tops: 'tops';
LITERAL_sum: 'sum';
LITERAL_product: 'product';
LITERAL_numberof: 'numberof';
//LITERAL_BLESS:	'BLESS';
//LITERAL_subBLESS:	'subBLESS';
LITERAL_initial: 'initial';
LITERAL_complete: 'complete';
LITERAL_final: 'final';
//LITERAL_on: 'on';
 
//AADL literals from SAE AS5506A S4.3
LITERAL_prototypes: 'prototypes';
LITERAL_features: 'features';
LITERAL_flows: 'flows';
LITERAL_properties: 'properties';
LITERAL_abstract: 'abstract';
LITERAL_data: 'data';
LITERAL_subprogram: 'subprogram';
LITERAL_group: 'group';
LITERAL_thread: 'thread';
LITERAL_process: 'process';
LITERAL_memory: 'memory';
LITERAL_processor: 'processor';
LITERAL_bus: 'bus';
LITERAL_device: 'device';
LITERAL_virtual: 'virtual';
LITERAL_system: 'system';
LITERAL_port: 'port';
LITERAL_out: 'out';
LITERAL_event: 'event';
LITERAL_constant: 'constant';
LITERAL_end:	 'end';
LITERAL_annex:	'annex';
LITERAL_none: 'none';
LITERAL_modes:  'modes';

LITERAL_natural: 'natural';
LITERAL_integer: 'integer';
LITERAL_rational: 'rational';
LITERAL_real: 'real';
LITERAL_complex: 'complex'; 
LITERAL_time: 'time';

LITERAL_with: 'with';
LITERAL_implementation: 'implementation';
LITERAL_package: 'package';
LITERAL_public: 'public';
LITERAL_parameter: 'parameter';
LITERAL_feature: 'feature';
LITERAL_renames: 'renames';
LITERAL_private: 'private';
LITERAL_provides: 'provides'; 
LITERAL_requires: 'requires';
LITERAL_access: 'access';
LITERAL_subcomponents: 'subcomponents';
LITERAL_calls: 'calls';
LITERAL_connections: 'connections';
LITERAL_self: 'self';
LITERAL_property: 'property'; 
LITERAL_set: 'set';
LITERAL_is: 'is';
LITERAL_aadlboolean: 'aadlboolean'; 
LITERAL_aadlstring: 'aadlstring';
LITERAL_aadlinteger: 'aadlinteger'; 
LITERAL_aadlreal: 'aadlreal';
LITERAL_range: 'range';
LITERAL_inverse: 'inverse';
LITERAL_of: 'of';
LITERAL_classifier: 'classifier';
LITERAL_applies: 'applies'; 
LITERAL_to: 'to';
LITERAL_list: 'list';
LITERAL_connection: 'connection';
LITERAL_flow: 'flow';
LITERAL_inherit: 'inherit';
LITERAL_reference: 'reference';
LITERAL_component: 'component';
LITERAL_call: 'call'; 
LITERAL_sequence: 'sequence';
LITERAL_transition: 'transition';
LITERAL_mode: 'mode';
LITERAL_extends: 'extends';

//literals for type expressions
LITERAL_array: 'array';
LITERAL_variant: 'variant';
LITERAL_boolean:  'boolean';
LITERAL_string:  'string';

//literals for exception handling
LITERAL_catch :'catch'; 
LITERAL_when :'when'; 
LITERAL_throw :'throw'; 

//literals for type checking
LITERAL_null :'null';
LITERAL_enumeration: 'enumeration';
LITERAL_count: 'count';
LITERAL_fresh: 'fresh';
LITERAL_updated: 'updated';

//literals for cominable operations
LITERAL_fetchadd: 'fetchadd';
LITERAL_fetchor: 'fetchor';
LITERAL_fetchand: 'fetchand';
LITERAL_fetchxor: 'fetchxor';
LITERAL_swap: 'swap';
LITERAL_spread: 'spread';
//LITERAL_: '';

//define value for logic variable identifier
LITERAL_def: 'def';

//literals used AADL components, that themselves are NOT reserved words in AADL
LITERAL_Typed: 'Typed';
LITERAL_Precondition: 'Precondition';
LITERAL_Postcondition: 'Postcondition';
LITERAL_Assertion: 'Assertion';
LITERAL_Invariant: 'Invariant';

//time units
LITERAL_ps: 'ps';
LITERAL_ns: 'ns';
LITERAL_us: 'us';
LITERAL_ms: 'ms';
LITERAL_sec: 'sec';
LITERAL_min: 'min';
LITERAL_hr: 'hr';

//replace conditional expression
LITERAL_then: 'then';
LITERAL_else: 'else';

//pause
LITERAL_pause:  'pause';
//issue exception
LITERAL_exception: 'exception';
//absolute value
LITERAL_abs:  'abs';
//proerty range upper and lower bounds
LITERAL_upper_bound:  'upper_bound';
LITERAL_lower_bound:  'lower_bound';

//for BA assignment
LITERAL_any:  'any';
//for mode condition
LITERAL_on:  'on';

//multi-character tokens

ID :  ( 'a'..'z' | 'A'..'Z' )   
  ( 'a'..'z' | 'A'..'Z' | '_' | '0'..'9' )*   
  ; 

// a couple protected methods to assist in matching the various numbers

fragment
DIGIT   :  ( '0'..'9' ) ;

fragment
EXPONENT   :  ('e'|'E') ('+'|'-')? ( DIGIT )+ ;

fragment
INT_EXPONENT  :  ('e'|'E') ('+')? ( DIGIT )+ 
  ;
  /*
          catch [RecognitionException ex] {
            reportError(ex);
      input.consume();
          }
    */


fragment
EXTENDED_DIGIT     :  ( DIGIT | 'a'..'f' ) ;

fragment
BASED_INTEGER      :  ( EXTENDED_DIGIT ) ( ('_')? EXTENDED_DIGIT )* ;

fragment
BASE        : DIGIT ( DIGIT )?
;

START_ASSERTION_PROPERTY : '"<<';

END_ASSERTION_PROPERTY : '>>"';

//fragment
//STRING_PART :  
//'`'   
//( ~( '\'' | '\\' ) )*   
//( ESC | ~( '\'' | '\\' ) )*   
//'\''   
//; 

//STRINGLITERAL returns [Token tok]
//  @init {StringBuffer sb = new StringBuffer();
//         boolean hasMore=false;}
//  : //append all the sub-strings into a StringBuffer
//  first=STRING_PART  
//    {sb.append(first.getText());}
//  ( '+' more=STRING_PART 
//    {sb.append(more.getText()); hasMore=true;} 
//  )* 
//    {if (hasMore) first.setText(sb.toString()); 
//    tok = first;}
//  ;

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
//OLD_NEQ : '!=';

AM : '<=';

AL : '>=';

PLUS_EQUALS : '+=';  //indivisible addition; often used with fetch-add

LCON : '-[';  //left side of transition condition

RCON : ']->';  //right side of transition condition

BOX : '[]';   //separtes althernatives in if-fi

EXCLAMATION : '!';

QUESTION : '?';
 
GUARD : ')~>';  //right side of guard for guarded_action

LASS : '<<';  //left side of assertion

RASS : '>>';  //right side of assertion

QQ : '??';  //used for conditional expression
 
 
rational_literal
  :
  LBRACKET up=MINUS? dividend=INTEGER_LIT '|' down=MINUS? divisor=INTEGER_LIT RBRACKET
  -> {(up!=null)&&(down!=null)}? ^(RATIONAL ^($up $dividend) ^($down $divisor))
  -> {up!=null}? ^(RATIONAL ^($up $dividend) $divisor)
  -> {down!=null}? ^(RATIONAL $dividend ^($down $divisor))
  -> ^(RATIONAL $dividend $divisor)
  ;

complex_literal
  :
  LBRACKET up=MINUS? real=REAL_LIT COLON down=MINUS? im=REAL_LIT RBRACKET
  -> {(up!=null)&&(down!=null)}? ^(COMPLEX ^($up $real) ^($down $im))
  -> {up!=null}? ^(COMPLEX ^($up $real) $im)
  -> {down!=null}? ^(COMPLEX $real ^($down $im))
  -> ^(COMPLEX $real $im)
  ;

relation_symbol
  :
  EQ | NEQ | LT | AM | AL | GT 
  ;


range_symbol : DOTDOT | COMMADOT | DOTCOMMA | COMMACOMMA; 

identifier 
  : ID ;
  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); Dump.it("\nYou may be using a reserved word inappropriately.\n");throw(re);}
  
////////////////AADL SPECIFICATION///////////////////////////////
//
//aadl_specification
//  :
//  pack=package_spec
//    -> $pack
//  | props=property_set
//    -> $props
//  ;
//

////////////////AADL PACKAGE///////////////////////////////
//
//package_spec
//  @after{currentPackageRecord.ast=$package_spec.tree;}
//  :
//  pack=LITERAL_package^ pi=package_name
//    {currentPackageRecord= new PackageRecord(new BAST(),$pi.text,null); 
//    currentParseRecord=currentPackageRecord;}
//  public_declarations?
//  private_declarations?
//  LITERAL_end ei=package_name! SEMICOLON!
//  {$pi.tree.equalsTree($ei.tree)}?  //id's must match
//  ;
//  catch [FailedPredicateException fpe] {
//    Dump.it("\nDoes the package have the same identifier at beginning ("+
//      $pi.tree.getText()+") and end ("+$ei.tree.getText()+")?");
//    Dump.re((RecognitionException)fpe);
//    throw fpe;
//    }
//  catch [MismatchedTokenException mte] {
//    Dump.it("\nDid you forget public or private?\n");
//    Dump.it("MismatchedTokenException in BLESStoAST.package_spec:  "+mte.toString());
//    Dump.re((RecognitionException)mte);
//    }   //end of component_type
// 
//public_declarations
//  :
//  LITERAL_public^ package_declarations
//  ;
//
//private_declarations
//  :
//  LITERAL_private^ package_declarations
//  ;
//  
//package_declarations
//  :
//  ( name_visibility_declaration )*
//  ( aadl_declaration )*
//  ;
//
//package_name
//  :
//  identifier //(DOUBLE_COLON^ identifier (DOUBLE_COLON! identifier)* )?
//  ;
// 
//aadl_declaration
//  :
//  classifier_declaration | annex_library[null]
//  ;
//
//classifier_declaration
//  :
//  component_classifier_declaration
//  |
//  feature_group_classifier_declaration
//  ;
//
// component_classifier_declaration 
//  :
//  component_type 
////  | component_type_extension 
//  | component_implementation 
////  | component_implementation_extension
//  ;
//
// 
//feature_group_classifier_declaration 
//  : 
//  feature_group_type //| feature_group_type_extension
//  ;
//        
//name_visibility_declaration 
//  :
//  import_declaration | alias_declaration
//  ;

//loads ThreadRecord.imported_package_names_and_property_set_identifiers directly during parse
//import_declaration
//  : //with ( package_name | property_set_identifier ) (, package_name | property_set_identifier )* ;
//  //import_declaration returns a tree, but is not used by component_type
//  LITERAL_with^ t1=package_name_or_property_set_id 
//    {currentPackageRecord.imported_package_names_and_property_set_identifiers.add($t1.tree);}
//  ( COMMA! t2=package_name_or_property_set_id 
//    {currentPackageRecord.imported_package_names_and_property_set_identifiers.add($t2.tree);}  
//  )*
//   SEMICOLON! 
//  ;

//package_name_or_property_set_id
//  :
//  identifier //(DOUBLE_COLON^ identifier (DOUBLE_COLON! identifier)* )?
//  |
//  LITERAL_BLESS
//  ;
  
// 
//alias_declaration 
//  :   //note:  AADL v2 allows other aliases
//  /*defining_*/identifier LITERAL_renames^ LITERAL_package! identifier SEMICOLON! 
//  ;          

///////////////////////////COMPONENT TYPES///////////////////////////////////

//component_type 
////  options{backtrack=true;}
//  @init{Parse.port_assertion_map=new HashMap<String,BAST>();}
//  @after{ParseRecord parseRec=null;   
//    if ($cc.tree.hasType(LITERAL_subprogram)) 
//      parseRec=new SubprogramRecord($component_type.tree,$dcti.text,null,
//      currentPackageRecord);  //create subproagram record
//    if ($cc.tree.hasType(LITERAL_data)) 
//      parseRec=new DataRecord($component_type.tree,$dcti.text,null,
//      currentPackageRecord);  //create data record
//    else if ($cc.tree.hasType(LITERAL_thread)||$cc.tree.hasType(LITERAL_device)||$cc.tree.hasType(LITERAL_system)) 
//      parseRec=new ThreadRecord($component_type.tree,$dcti.text,null,
//      currentPackageRecord);  //create thread record
//    else 
//      parseRec=new ParseRecord($component_type.tree,$dcti.text,null,
//      currentPackageRecord);  //create plain parse record
//    parseRec.port_assertion_map=Parse.port_assertion_map;
//    parseRec.setStartingLine(getStartingLine());
//    currentPackageRecord.addComponent($dcti.text,parseRec);}
//  : 
////  import_declaration? //with ( package_name | property_set_identifier ) (, package_name | property_set_identifier )* ;
//  //what happens when cc is a double literal like LITERAL_virtual LITERAL_bus?
//  cc=component_category dcti=/*defining_component_type_*/identifier
//  (ext=LITERAL_extends uctr=unique_component_type_reference)?
////  (LITERAL_prototypes .+)?
//  (fea=LITERAL_features f+=feature+)?
//  (prop=LITERAL_properties p+=property_association+)?
//  as+=annex_subclause*
//  en=LITERAL_end  dcti2=/*defining_component_type_*/identifier SEMICOLON
//  {$dcti.tree.isText($dcti2.tree.getText())}?  //id's must match
//    -> {(ext!=null)&&(fea!=null)&&(prop!=null)}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($ext $uctr) ^($fea $f+) ^($prop $p+) $as* $en)
//    -> {(ext!=null)&&(fea!=null)}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($ext $uctr) ^($fea $f+) $as* $en)
//    -> {(ext!=null)&&(prop!=null)}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($ext $uctr) ^($prop $p+) $as* $en)
//    -> {ext!=null}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($ext $uctr) $as* $en)
//    -> {(fea!=null)&&(prop!=null)}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($fea $f+) ^($prop $p+) $as* $en)
//    -> {fea!=null}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($fea $f+) $as* $en)
//    -> {prop!=null}? 
//      ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti ^($prop $p+) $as* $en)
//    -> ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"]"] $cc $dcti $as* $en)
//  ;
//  catch [FailedPredicateException fpe] {
//    Dump.it("\nDoes the component have the same identifier at beginning ("+
//      $dcti.tree.getText()+") and end ("+$dcti2.tree.getText()+")?");
//    Dump.re((RecognitionException)fpe);
//    throw fpe;
//    }
//  catch [MismatchedTokenException mte] {
//    Dump.it("MismatchedTokenException in BLESStoAST.component_type:  "+mte.toString());
//    Dump.re((RecognitionException)mte);
//    }   //end of component_type
//  catch [ProofException pe] {pe.handleProofException();} 
 
//component_category ::= 
//component_category :             
//  LITERAL_abstract
//  | LITERAL_data | LITERAL_subprogram | LITERAL_process | LITERAL_thread 
//  | LITERAL_memory | LITERAL_processor | LITERAL_bus | LITERAL_device 
//  | LITERAL_system
//  | LITERAL_thread LITERAL_group
//    -> THREAD_GROUP["thread group"]
//  ; 

//unique_component_type_reference 
//  :
//  ( identifier DOUBLE_COLON^ )? /*component_type_*/identifier  
//  ;

/////////////////////////4.4 COMPONENT IMPLEMENTATIONS////////////////////////

//component_implementation 
////  options{backtrack=true;}
////  @init{Parse.port_assertion_map= new HashMap<String,BAST>();}  //reset port-label/Assertion map
//  @after{ParseRecord parseRec=null;   
//    if ($cc.tree.hasType(LITERAL_subprogram)) 
//      parseRec=new SubprogramRecord($component_implementation.tree,$dcti.text,$imp.text,null,
//      currentPackageRecord);  //create subproagram record
//    if ($cc.tree.hasType(LITERAL_data)) 
//      parseRec=new DataRecord($component_implementation.tree,$dcti.text,$imp.text,null,
//      currentPackageRecord);  //create data record
//    else if ($cc.tree.hasType(LITERAL_thread)||$cc.tree.hasType(LITERAL_device)||$cc.tree.hasType(LITERAL_system)) 
//      parseRec=new ThreadRecord($component_implementation.tree,$dcti.text,$imp.text,null,
//      currentPackageRecord);  //create thread record
//    else 
//      parseRec=new ParseRecord($component_implementation.tree,$dcti.text,$imp.text,null,
//      currentPackageRecord);  //create plain parse record
//    parseRec.setStartingLine(getStartingLine());
//    currentPackageRecord.addImplementation($dcti.text+'.'+$des.text,parseRec);}
//  : 
////  import_declaration? //with ( package_name | property_set_identifier ) (, package_name | property_set_identifier )* ;
//  //what happens when cc is a double literal like LITERAL_virtual LITERAL_bus?
//  cc=component_category imp=LITERAL_implementation 
//    dcti=/*defining_component_type_*/identifier per=PERIOD des=/*implementation_designator*/identifier
//  extc=extends_clause?
////  (LITERAL_prototypes .+)?
//  subc=subcomponents_clause?
////  calc=calls_clause?
//  con=connections_clause?
////  floc=flows_clause?
//  prop=properties_clause?
//  as+=annex_subclause*
//  en=LITERAL_end  dcti2=/*defining_component_type_*/identifier PERIOD des2=identifier SEMICOLON
//  {$dcti.tree.isText($dcti2.tree.getText())
//    &&$des.tree.isText($des2.tree.getText())}?  //id's must match
//    -> ^(COMPONENT[$en,"COMPONENT["+$dcti.text+"."+$des.text+"]"]  
//      $cc $imp  ^($per $dcti $des) $extc? $subc? $con?  $prop? $as* $en)
//  ; //end of component_implementation
//  catch [FailedPredicateException fpe] {
//    Dump.it("\nDoes the component have the same identifier at beginning ("+
//      $dcti.tree.getText()+"."+$des.tree.getText()+") and end ("+$dcti2.tree.getText()+"."+$des2.tree.getText()+")?");
//    Dump.re((RecognitionException)fpe);
//    throw fpe;}

//extends_clause
//  :
//  LITERAL_extends^ uctr=unique_component_implementation_reference
//  ;

//subcomponents_clause
//  :
//  LITERAL_subcomponents^ subcomponent+
//  ;
//  
//connections_clause
//  :
//  LITERAL_connections^ connection+
//  ;
// 
//properties_clause
//  :
//  LITERAL_properties^ property_association+
//  ;

//unique_component_implementation_reference 
//  :
//  ( pn=identifier dc=DOUBLE_COLON )? cti=/*component_type_*/identifier dot=PERIOD cii=identifier
//    -> {dc!=null}? ^(DOUBLE_COLON $pn $cti $cii)
//    -> ^(PERIOD $cti $cii)
//  ;

///////////////////////////////////4.3 SUBCOMPONENTS///////////////////////////////
 
//subcomponent
//  :
//  i=/*defining_subcomponent*/identifier COLON
//  cc=component_category
//  uccr=unique_component_classifier_reference? //[prototype_bindings]
////    | /*prototype_*/identifier )
//  ( ad=array_dimensions aeil=array_element_implementation_list? )?
//  ( LCURLY pa+=/*subcomponent_ or contained_*/property_association+ RCURLY )?
//  im=/*component_*/in_modes? SEMICOLON
//    -> ^(SUBCOMPONENT $i $cc $uccr? $pa* $im?)
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); 
//    Dump.it("\nDid you forget the subcomponent\'s component category?\n");
//    tellBNF(GrammarStrings.subcomponent,re,$subcomponent.tree);}
  
//what is this really?   -> name of a data component
 
//array_dimensions
//  :
//  ( LBRACKET^ ( NUMERIC_LIT | unique_property_name ) RBRACKET! )
//  ( LBRACKET! ( NUMERIC_LIT | unique_property_name ) RBRACKET! )*
//  ;

//array_element_implementation_list
//  :
//  LPAREN^ unique_component_implementation_reference (COMMA! unique_component_implementation_reference)+ RPAREN!
//  ;    

  
////////////////////////////4.8 ANNEX SUBCLAUSE AND LIBRARY//////////////////////////
  
//annex_subclause ::= 
//    annex annex_identifier (  
//      ( {** annex_specific_language_constructs **} ) |  none )  
//      [ in_modes ] ;
//annex_subclause
//  :
//  LITERAL_annex^
//  (ai=LITERAL_BLESS ANNEX_START! thread_behavior ANNEX_END!
//  |
//  ai=LITERAL_subBLESS ANNEX_START! subprogram_behavior ANNEX_END! 
//  |
//  ai=LITERAL_Assertion ANNEX_START! assertion ANNEX_END! 
//  |
//  identifier ANNEX_START! ( (~ANNEX_END)+ )! ANNEX_END!
//  )
//  in_modes?
//  SEMICOLON!
//  ;

//contains AADL grammar in addition the sequence of Assertions that are BLESS
//annex_library[HashMap<String,BAST> assertions_in_library]
//  :
//  LITERAL_annex^
//  (
//  ai=LITERAL_Assertion! ANNEX_START! 
//    (a=assertion 
//    {if ((assertions_in_library!=null)&&((BAST)$a.tree.getChild(0)).hasType(BLESStoASTLexer.LABEL)) 
//      assertions_in_library.put(((BAST)$a.tree.getChild(0).getChild(0)).getText(),$a.tree);}
//     )+ 
//     ANNEX_END! 
//  |
//  identifier ANNEX_START! ( (~ANNEX_END)+ )! ANNEX_END!
//  )
//  in_modes?
//  SEMICOLON!
//  ;  

//just the text between ANNEX_START and ANNEX_END
annex_library_assertions[HashMap<String,BAST> assertions_in_library] returns [BAST newRoot]
//  @before{BAST newRoot = new BAST("LITERAL_annex",BLESStoASTLexer.LITERAL_annex,getStartingLine());}
  :
  {$newRoot = new BAST("ASSERTION_ANNEX",BLESStoASTLexer.ASSERTION_ANNEX,getStartingLine());}
  ANNEX_START?
    (ala=assertion 
    {if ((assertions_in_library!=null)&&
      ($ala.tree!=null)&&($ala.tree.getChild(0)!=null)&&
      ($ala.tree.getChild(0).getChild(0)!=null)&&
      ((BAST)$ala.tree.getChild(0)).hasType(BLESStoASTLexer.LABEL)) 
      assertions_in_library.put(((BAST)$ala.tree.getChild(0).getChild(0)).getText(),$ala.tree);
      $newRoot.addChild((BAST)$ala.tree);}
     )+ 
  ANNEX_END?
//  ->
//    ^(LITERAL_annex $ala+)     
  ;
 
///////////////////////8 FEATURES AND SHARED ACCESS//////////////////////////////

           
//feature ::=  
//    ( abstract_feature_spec | 
//      port_spec |  
//      feature_group_spec | 
//      subcomponent_access | 
//     parameter ) 
//    [ array_dimension ] 
//    [ { { feature_property_association }+ } ] ; 
//feature
//  @after
//  {if (fpa!=null)  //is there a feature with an Assertion?
//     {
//     BAST arrow = ($fpa.tree).dupTree();
//     if (((BAST)arrow.getChild(0)).hasType(BLESStoASTLexer.LITERAL_Assertion))
//       {
//       Parse.port_assertion_map.put(($dpi.tree).getText(),(BAST)arrow.getChild(1).getChild(0));  
////       Dump.it("port "+((BAST)dpi.tree).getText()+" on line "+Integer.toString(((BAST)dpi.tree).getLine()+startingLine)+
////         " has Assertion "+((BAST)arrow.getChild(1).getChild(0)).toStringTree());
//       }
//    }
////  else  //no Assertion => map to null
////    {
////    Parse.port_assertion_map.put(((BAST)dpi.tree).getText(),
////      new BAST("no Assertion",BLESStoASTLexer.DUMMY,(BAST)dpi.tree));    
////    Dump.it("port "+((BAST)dpi.tree).getText()+" on line "+Integer.toString(((BAST)dpi.tree).getLine()+startingLine)+
////         " has no Assertion. ");
////    } 
//   }
//  :
//  ( //port_spec 
////port_spec ::=  defining_port_identifier : ( in | out | in out ) port_type 
//  dpi=/*defining_port_*/identifier COLON i=LITERAL_in? o=LITERAL_out? pt=port_type
//  {(i!=null)||(o!=null)}?
//  | //parameter_spec
//  dpi=/*defining_parameter_*/identifier COLON i=LITERAL_in? o=LITERAL_out? 
//    par=LITERAL_parameter uccr=/*data_*/unique_component_classifier_reference   
//  {(i!=null)||(o!=null)}?
//// | abstract_feature_spec
// | feature_group_spec
//// | subcomponent_access = subprogram_access | subprogram_group_access
//  | //bus_access_spec
//  dpi=/*defining_bus_access_*/identifier COLON
//    ( p=LITERAL_provides | r=LITERAL_requires ) b=LITERAL_bus a=LITERAL_access
//    uccr=/*bus_*/unique_component_classifier_reference?
//  | //data_access
//  dpi=/*defining_bus_access_*/identifier COLON
//    ( p=LITERAL_provides | r=LITERAL_requires ) dat=LITERAL_data a=LITERAL_access
//    uccr=/*bus_*/unique_component_classifier_reference+
//  )
//// [ array_dimension ]  
//  ( lc=LCURLY fpa=/*feature_*/property_association mpa+=/*more*/property_association* RCURLY )? //fpa gets the first one, not all of them
//  SEMICOLON
////    -> {$ps.addChild($fpa);}  //Assertion if any is last child
//    -> {(pt!=null)&&(i!=null)&&(o!=null)}? ^(PORT["PORT["+$dpi.text+"]"] $dpi INOUT["in out"] $pt $fpa? $mpa*)
//    -> {(pt!=null)&&(o!=null)}? ^(PORT["PORT["+$dpi.text+"]"] $dpi $o $pt $fpa? $mpa*)
//    -> {(pt!=null)&&(i!=null)}? ^(PORT["PORT["+$dpi.text+"]"] $dpi $i $pt $fpa? $mpa*)
//    -> {(par!=null)&&(i!=null)&&(o!=null)}? ^($par $dpi INOUT["in out"] $uccr $fpa? $mpa*)
//    -> {(par!=null)&&(o!=null)}? ^($par $dpi $o $uccr $fpa? $mpa*)
//    -> {(par!=null)&&(i!=null)}? ^($par $dpi $i $uccr $fpa? $mpa*)
//    -> {b!=null}? ^($b $a $dpi $p? $r? $uccr?)
//    -> {dat!=null}? ^($dat $a $dpi $p? $r? $uccr?)
//    ->  //otherwise error
//  ;
//  catch [FailedPredicateException fpe] {
//    Dump.it("Does the port or parameter have in, out or both?");
//    throw fpe;}
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); Dump.it("\nBad feature\n");
//    tellBNF(GrammarStrings.feature,re,$feature.tree);}
    
////////////////////////////////8.2 FEATURE GROUP TYPES/////////////////////////////////   
         
//feature_group_type
//  :
//  LITERAL_feature! LITERAL_group^ pi=/*defining_*/identifier
//  features_clause?
//  inverse_clause?
//  properties_clause?
//  LITERAL_end! ei=/*defining_*/identifier! SEMICOLON!
//    {$pi.tree.equalsTree($ei.tree)}?  //id's must match
//  ;     
//  catch [FailedPredicateException fpe] {
//    Dump.it("Does the feature group have the same identifiers at the end as the beginning?");
//    throw fpe;}

//feature_group_spec
//  :
//  /*defining_feature_group_*/identifier COLON!
//  ( LITERAL_in | LITERAL_out ) LITERAL_feature! LITERAL_group^
//  ( ( LITERAL_inverse LITERAL_of! )? unique_feature_group_type_reference )?
//  ;

//features_clause
//  :
//  LITERAL_features^ feature+
//  ;

//inverse_clause
//  :
//  LITERAL_inverse^ LITERAL_of! unique_feature_group_type_reference
//  ;

//unique_feature_group_type_reference
//  :
//  ( identifier DOUBLE_COLON^ )? /*feature_group_type_*/identifier
//  ;    
  
//////////////////////////////////8.3 PORTS/////////////////////////////////////////////

//port_type ::=  
//     data port [ data_unique_component_classifier_reference  
//     | data_component_prototype_identifier ]  
//    |  event data port [ data_unique_component_classifier_reference  
//    | data_component_prototype_identifier ] 
//    |  event port  
//port_type 
//  :
//  LITERAL_data^ LITERAL_port! ( /*data_*/unique_component_classifier_reference )?
//  |
//  LITERAL_event^ LITERAL_data LITERAL_port! ( /*data_*/unique_component_classifier_reference )?
//  |
//  LITERAL_event^ LITERAL_port!
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); Dump.it("\ntry data port, event port, or event data port, dimwit!\n");
//    tellBNF(GrammarStrings.portType,re,$port_type.tree);}

//////////////////////////////////9 CONNECTIONS////////////////////////

//connection 
//  :
//  dcid=/*defining_connection_*/identifier COLON
//  ( fc=feature_connection
//  | 
//  prtc=port_connection
////  | parameter_connection
//  | ac=access_connection
//  | fgc=feature_group_connection 
//  )
//  ( LCURLY propa+=property_association+ RCURLY )?
//  inm=in_modes/*_and_transitions*/? SEMICOLON
//  -> {prtc!=null}? ^(CONNECTION $dcid $prtc $propa* $inm?)
//  -> {fc!=null}? ^(CONNECTION $dcid $fc $propa* $inm?)
//  -> {ac!=null}? ^(CONNECTION $dcid $ac $propa* $inm?)
//  -> {fgc!=null}? ^(CONNECTION $dcid $fgc $propa* $inm?)
//  -> ^(CONNECTION $dcid)  //error
//  ;  

////////////////////////////////9.1 FEATURE CONNECTION////////////////////////

//feature_connection
//  :
//  LITERAL_feature /*source_*/feature_reference
//  (IMP^ | BI^)
//  /*destination_*/feature_reference
//  ;
//
//feature_reference 
//  :
//  /*component_type_feature_*/identifier 
//  |
//  /*subcomponent_*/identifier PERIOD^ /*feature_*/identifier
//  ;
  
////////////////////////////////9.2 PORT CONNECTIONS////////////////////////

//port_connection 
//  :
//  LITERAL_port!
//  /*source_*/port_connection_reference 
//  (IMP^ | BI^)
//  /*destination_*/port_connection_reference   
//  ;
//
//port_connection_reference 
//  :
//  //port in the component type
//  /*component_type_port_*/identifier 
//  |
//  //port in a subcomponent  or other identifiers commented below
//  /*subcomponent_*/identifier PERIOD^ /*port_*/identifier
//  |
////-- port element in a feature group of the component type
////component_type_feature_group_identifier . element_port_identifier |
////-- data element in aggregate data port 
////component_type_port_identifier . data_elementsubcomponent_identifier |
////-- requires data access in the component type
////component_type_requires_data_access_identifier |
////        -- data subcomponent
////data_subcomponent_identifier |
////-- data component provided by a subcomponent subcomponent_identifier . provides_data_access_identifier|
////-- data access element in a feature group of the component type
////component_type_feature_group_identifier . element_data_access_identifier |
////-- access to element in a data subcomponent data_subcomponent_identifier .data_subcomponent_identifier|
////       -- processor port
//  LITERAL_processor PERIOD^ /*processor_port_*/identifier 
//  |
////-- component itself as event or event data source 
//  LITERAL_self PERIOD^ /*event_or_event_data_source_*/identifier  
//  ;

//////////////////////////////////9.4 ACCESS CONNECTIONS///////////////////////////////

//access_connection
//  :
//  ( LITERAL_bus | LITERAL_data )
//  LITERAL_access^
//  /*source_*/access_reference
//   (IMP | BI)
//  /*destination*/access_reference
//  ;  

//access_reference
//  :
//  identifier
//  |
//  identifier PERIOD^ identifier
//  |
//  LITERAL_processor PERIOD^ identifier
//  ;
  
//////////////////////////////////9.5 FEATURE GOUP CONNECTIONS///////////////////////////////

//feature_group_connection
//  :
//  LITERAL_feature^ LITERAL_group /*source_*/feature_group_reference
//  ( IMP | BI )
//  /*destination_*/feature_group_reference
//  ;
//
//feature_group_reference     
//  :
//  identifier
//  |
//  identifier PERIOD^ identifier
//  ;
     
///////////////////////////////11.1 PROPERTY SETS////////////////////////////////////////////
//
//property_set
//  @after{currentPropertySetRecord.ast=$property_set.tree; }
//  :
//  prop=LITERAL_property LITERAL_set psi=/*defining_property_set_*/identifier LITERAL_is
//    {currentPropertySetRecord= new PropertySetRecord(new BAST(),$psi.text,null,currentPackageRecord); 
//    currentPropertySetRecord.setStartingLine(getStartingLine());
//      currentParseRecord=currentPropertySetRecord;}
//  ids+=import_declaration*
//  ( ptd+=property_type_declaration 
//  | pdd+=property_definition_declaration 
//  | pcon+=property_constant 
//  )*
//  LITERAL_end psi2=/*defining_property_set_*/identifier SEMICOLON  
//  {$psi.tree.equalsTree($psi2.tree)}?  //id's must match
//    -> ^($prop $psi $ids* $ptd* $pdd* $pcon*)
//  ;
//  catch [FailedPredicateException fpe] {
//    Dump.it("Does the property set "+$psi.tree.getText()+" have the same identifiers at the end as the beginning?");
//    throw fpe;}
//
//    
///////////////////////////////11.1.1 PROPERTY TYPES////////////////////////////////////////////

         
//property_type_declaration 
//  @after{currentPropertySetRecord.addProperty($property_type_declaration.tree);}
//  :
//  /*defining_property_type_*/identifier COLON! LITERAL_type^ property_type SEMICOLON!
//  ; 

//property_type 
//  :
//  LITERAL_aadlboolean | LITERAL_aadlstring
//  | enumeration_type 
//  | units_type
//  | property_number_type 
//  | range_type
//  | classifier_type
//  | reference_type
//  | property_record_type  
//  ;

//classifier_type
//  :
//  LITERAL_classifier^ LPAREN! model_element (COMMA! model_element)* RPAREN!
//  ;

//reference_type
//  :
//  LITERAL_reference^ LPAREN! model_element (COMMA! model_element)* RPAREN!
//  ;
  
   
//units_type 
//  :
//  LITERAL_units^ units_list
//  ;   

//property_number_type
//  :
//  LITERAL_aadlreal^ real_range? (LITERAL_units units_designator)?
//  |
//  LITERAL_aadlinteger^ integer_range? (LITERAL_units units_designator)?
//  ;


//real_range
//  :
//  aadlreal_or_constant DOTDOT^ aadlreal_or_constant
//  ;

//aadlreal_or_constant
//  :
//  fp_literal^ /*unit_*/identifier?
//  |
//  /*real_*/property_constant_name
//  ;
  
//integer_range
//  :
//  aadlinteger_or_constant DOTDOT^ aadlinteger_or_constant
//  ;
//
//aadlinteger_or_constant
//  :
//  integer_literal^ /*unit_*/identifier?
//  |
//  /*integer_*/property_constant_name
//  ;
  
//range_type 
//  :
//  LITERAL_range^ LITERAL_of! property_number_type
//  | LITERAL_range^ LITERAL_of! /*number_*/unique_property_type_name   
//  ;
 
//unique_property_type_name
//  :
//  upn=unique_property_name
//    -> $upn
//  ;  

//property_record_type 
//  : 
//  LITERAL_record^ LPAREN! property_record_field+ RPAREN!
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.recordType,re,$property_record_type.tree);}
//  
//property_record_field 
//  : //no 'list of'
//  /*defining_field_*/identifier COLON^ ( LITERAL_list LITERAL_of! )? property_type_designator SEMICOLON!
//  ; 
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); Dump.it("\nDid you forget a ; after a record or variant field?\n");
//    tellBNF(GrammarStrings.recordField,re,$property_record_field.tree);}
  
//property_type_designator
//  :
//  unique_property_type_name
//  |
//  property_type
//  ;

//////////////////////////////////11.1.2 PROPERTY DEFINITIONS////////////////////////////

//property_definition_declaration
//  @after{currentPropertySetRecord.addProperty($property_definition_declaration.tree);}
//  :
//  /*defining_property_name_*/identifier COLON!
//  LITERAL_inherit?
//  ( single_valued_property | multi_valued_property )
//  LITERAL_applies^ LITERAL_to! LPAREN! ( 
//    property_owner ( COMMA! property_owner )* )? RPAREN! 
//  SEMICOLON!
//  ;
//    
//single_valued_property
//  :
//  property_type_designator ( ARROW^ /*default_*/property_expression )?
//  ;
//  
//multi_valued_property
//  :
//  l=LITERAL_list LITERAL_of ( l2+=LITERAL_list LITERAL_of )* 
//    ptd=property_type_designator
//    ( ar=ARROW /*default_*/plv=property_list_value )?
//    -> {ar!=null}? ^($l $l2* $ar $plv $ptd)
//    -> ^($l $l2* $ptd)
//  ;

//property_owner
//  :        
//  unique_component_classifier_reference  | model_element
//  ;
//  
//model_element
//  :
//  LITERAL_port 
//  | LITERAL_connection
//  | LITERAL_event^ LITERAL_port 
//  | LITERAL_data^ LITERAL_port 
//  | LITERAL_event^ LITERAL_data LITERAL_port 
//  | LITERAL_feature 
//  | LITERAL_subprogram^ LITERAL_access 
//  | LITERAL_port^ LITERAL_connection 
//  | LITERAL_flow 
//  | LITERAL_abstract 
//  | LITERAL_data 
//  | LITERAL_subprogram 
//  | LITERAL_process 
//  | LITERAL_thread 
//  | LITERAL_memory 
//  | LITERAL_processor 
//  | LITERAL_bus 
//  | LITERAL_device 
//  | LITERAL_system
//  | LITERAL_virtual^ LITERAL_bus
//  | LITERAL_virtual^ LITERAL_processor
//  | LITERAL_thread^ LITERAL_group
//  | LITERAL_subprogram^ LITERAL_group
//  | LITERAL_subprogram^ LITERAL_classifier
//  | LITERAL_subprogram^ LITERAL_call LITERAL_sequence
//  | LITERAL_feature^ LITERAL_group
//  | LITERAL_data^ LITERAL_access
//  | LITERAL_bus^ LITERAL_access
//  | LITERAL_component^ LITERAL_implementation
//  | LITERAL_system^ LITERAL_implementation
//  | LITERAL_abstract^ LITERAL_implementation
//  | LITERAL_classifier
//  | LITERAL_parameter
//  | LITERAL_mode^ LITERAL_transition
//  | LITERAL_package
//  | LITERAL_all
//  ;      
//  
/////////////////////////////////11.1.3 PROPERTY CONSTANTS/////////////////////////

//property_constant
//  :
//  single_valued_property_constant | multi_valued_property_constant
//  ;
//      
//single_valued_property_constant
//  @after{currentPropertySetRecord.addProperty($single_valued_property_constant.tree);}
//  :
//  /*defining_property_constant_*/identifier COLON! LITERAL_constant^
//    property_type_designator
//    ARROW /*constant*/property_expression SEMICOLON!
//  ;  
//
//multi_valued_property_constant
//  @after{currentPropertySetRecord.addProperty($multi_valued_property_constant.tree);}
//  :
//  /*defining_property_constant_*/identifier COLON! LITERAL_constant^
//    ( LITERAL_list LITERAL_of! )+
//    property_type_designator
//    ARROW /*constant*/property_list_value SEMICOLON!
//  ;  
//
//
//property_constant_name 
//  : 
//  ( /*property_set_*/identifier DOUBLE_COLON^ )? /*property_constant*/identifier
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); 
//    tellBNF(GrammarStrings.propertyConstant,re,$property_constant_name.tree);}

 
///////////////////////////////11.3 PROPERTY ASSOCIATIONS/////////////////////////

//property_association ::=  unique_property_identifier ( => | +=> ) [ constant ] assignment [ in_binding ] ; 
//property_association
//  :
//  b=LITERAL_BLESS! dc=DOUBLE_COLON! 
//    (a=LITERAL_Assertion | LITERAL_Precondition | LITERAL_Postcondition | LITERAL_Invariant)
//    ar=ARROW^ START_ASSERTION_PROPERTY! assertion_body END_ASSERTION_PROPERTY! SEMICOLON!
////  |
////  b=LITERAL_BLESS! dc=DOUBLE_COLON! LITERAL_Type_Expression ar=ARROW^ DOUBLE_QUOTE! data_component_type=type DOUBLE_QUOTE! SEMICOLON!
//  |
//  upi=unique_property_name 
//    ar=ARROW^ LITERAL_constant? property_value SEMICOLON!
//  |
//  upi=unique_property_name 
//    par=PLUS_ARROW^  c=LITERAL_constant? property_value SEMICOLON!
////     {throw new YouIdiot("Go ask yourself:\n\nDo I really need property lists?",$upi.tree);}
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); 
//    tellBNF(GrammarStrings.propertyAssociation,re,$property_association.tree);}
//  catch [YouIdiot yi] {yi.handleException();Dump.it("***************************************no");}

//unique_property_name
//  :
//  /*property_set_*/identifier DOUBLE_COLON^  /*property_name_*/identifier
//  |
//  LITERAL_BLESS DOUBLE_COLON^ /*bless_property_*/identifier
//  |
//  /*property_name_*/identifier
//  ;

//property_value
////  options{backtrack=true;}
//  :
//  plv=property_list_value
//    -> $plv
//  |
//  pe=property_expression
//    -> $pe
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); 
//    Dump.it("Are you trying to use a property list with a single element?\n\nDon\'t do that!\n");}
//  
//    
//property_list_value
//  :
//  LPAREN
//  pvals+=property_value ( COMMA pvals+=property_value )*
//  RPAREN
//    -> ^(PROPERTY_LIST $pvals+ )
//  ;
    
///////////////////////////////11.4 property expressions////////////////////////

//property_expression
//  :
//  property_term 
//    ( DOTDOT^ property_term )?
//  | bt=boolean_term 
////    -> $bt
//  | st=AADL_STRING_LITERAL 
////    -> $st
//  | cct=component_classifier_term 
////    -> $cct
////  | reft=reference_term
////    -> $reft
//  | rect=record_term 
////    -> $rect
////  | comt=computed_term
////    -> $comt
//  ;
    
//boolean_term
//  :
//  LITERAL_true | LITERAL_false
////  | LITERAL_not^ ( boolean_term | property_term )
////  | LPAREN^ boolean_expression RPAREN
//  ;  
  
//boolean_expression
//  :
//  ( boolean_term | property_term) 
//    ( (LITERAL_and^ ( boolean_term | property_term)) (LITERAL_and! ( boolean_term | property_term))*
//    |
//    (LITERAL_or^ ( boolean_term | property_term)) (LITERAL_or! ( boolean_term | property_term))* 
//    ) 
//  ;   

//unit_term
//  :
//  LITERAL_unit /*unit_*/identifier
//  ;
    
//property_term  
//  :
//  ( /*property_set_*/identifier DOUBLE_COLON^ )? /*property_name_*/identifier
//  |
//  NUMERIC_LIT^ ( /*unit*/identifier )?
//  ;


//component_classifier_term
//  :
//  LITERAL_classifier^ LPAREN! unique_component_classifier_reference RPAREN!
//  ;
    
//////////////THREAD BEHAVIOR SPECIFICATION LANGUAGE/////////////////////
    
thread_behavior  //starting production like behavior_annex for BA
  :
  ANNEX_START?
  no_proof=DO_NOT_PROVE?
  av=availability?
  ac=assert_clause?
  inv=invariant_clause?
  sv=variables?
  s=LITERAL_states ( bs+=behavior_state )+
  tran=transitions
  ANNEX_END?
    -> ^( THREAD_ANNEX[$s,"THREAD_ANNEX"+(startingLine>0?"["+startingLine+"]":"")]
        ^( LITERAL_states[$s,"states["+Integer.toString($s.getLine()+startingLine)+"]"] $bs+ ) 
        $ac? $inv? $sv? $tran $no_proof? STOP )
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());
    Dump.it("RecognitionException in BLESStoAST.thread_behavior");
     if (re instanceof MismatchedTokenException)
       Dump.it("\nHey "+HelpfulHints.getIdiot()+"!\n\nDid you put the semicolon *after* "+
        "the Assertion?\n"+
        "You must have \"states\" and at least one behvior state:  PowerOn: initial state;\n");
     tellBNF(GrammarStrings.threadBehavior,re,$thread_behavior.tree);}

assert_clause
  :
  la=LITERAL_assert ass+=assertion+ 
    -> ^(LITERAL_assert[$la,"assert["+Integer.toString($la.getLine()+startingLine)+"]"] $ass+  )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());tellBNF(GrammarStrings.assertClause,re,$assert_clause.tree);}

invariant_clause
  :
  li=LITERAL_invariant inv=assertion
    -> ^(LITERAL_invariant[$li,"invariant["+Integer.toString($li.getLine()+startingLine)+"]"] $inv  )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());tellBNF(GrammarStrings.invariantClause,re,$invariant_clause.tree);}

variables 
  : 
  v=LITERAL_variables ( bv+=behavior_variable )+ 
    -> ^( LITERAL_variables[$v,"variables["+Integer.toString($v.getLine()+startingLine)+"]"] $bv* )
//  v=LITERAL_variables ( bv+=behavior_variable | td+=type_declaration | to+=type_operator | ud+=units_declaration )+ 
//    -> ^( LITERAL_variables[$v,"variables["+Integer.toString($v.getLine()+startingLine)+"]"] $to* $td* $bv* $ud*)
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());tellBNF(GrammarStrings.variables,re,$variables.tree);}
  
quantified_variables 
  : 
  v=LITERAL_declare ( bv+=behavior_variable )+ 
    -> ^( LITERAL_declare[$v,"declare["+Integer.toString($v.getLine()+startingLine)+"]"] $bv+ )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());tellBNF(GrammarStrings.quantifiedVariables,re,$quantified_variables.tree);}


//quantified_variable
//  :
//  v=/*variable_*/identifier c=COLON t=type ( agn=ASSIGN e=expression )? SEMICOLON
//    -> {e!=null}? ^($c $v ^( $agn $e ) $t ) /*type follows := to disambiguate tree parser*/
//    -> ^($c $v $t )
//  ; 
//  catch [RecognitionException re] {tellBNF(GrammarStrings.quantifiedVariable,re,$quantified_variable.tree);}

    
behavior_variable
  :
  dec=declarators c=COLON 
  ( p=LITERAL_nonvolatile | s=LITERAL_shared | con=LITERAL_constant | sp=LITERAL_spread
  | finl=LITERAL_final )? 
  t=type ( agn=ASSIGN e=expression )? 
  ass=assertion?  //added August 2010 for DDD.aadl
  semi=SEMICOLON
    -> {e!=null}? ^($c $dec ^(TYPE["TYPE"] $t) ^( $agn $e ) $ass? $p? $s? $con? $sp? $finl? $semi)
    -> ^($c $dec ^(TYPE["TYPE"] $t) $ass? $p? $s? $con? $sp? $finl? $semi)
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());tellBNF(GrammarStrings.behaviorVariable,re,$behavior_variable.tree);}

declarators
  :
  /*behavior_variable*/d=ID (c=COMMA /*behavior_variable*/ds+=ID)* 
    -> {ds!=null}? ^($c $d $ds+ )
    -> $d
  ; 

//units_declaration
//  :
//  i=/*type_*/identifier COLON u=LITERAL_units ul=units_list SEMICOLON
//    -> ^($u $i $ul) 
//  ;
//  
//type_declaration
//  :
//  i=/*type_*/identifier COLON lt=LITERAL_type t=type SEMICOLON
//    -> ^($lt $i $t )
//  ; 
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.typeDeclaration,re,$type_declaration.tree);}
  
//type_operator
//  :
//  i=/*type_operator_*/identifier LBRACKET param+=/*type_parameter_*/identifier+ RBRACKET COLON lt=LITERAL_type t=type SEMICOLON
//    -> ^($lt $i LBRACKET $param+ RBRACKET $t )
//  ; 
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.typeOperator,re,$type_operator.tree);}
// 
//type_operator_invocation
//  :
//  o=/*type_operator_*/identifier lb=LBRACKET ty+=type ( COMMA ty+=type )* RBRACKET
//    -> ^( TYPE_OPERATOR_INVOCATION $o $ty+ )
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.typeOperatorInvocation,re,$type_operator_invocation.tree);}
    
behavior_state
  :
  i=identifier 
  COLON (init=LITERAL_initial | com=LITERAL_complete | finl=LITERAL_final)? st=LITERAL_state a=assertion? SEMICOLON
    -> ^( LITERAL_state[$st,"state["+Integer.toString($st.getLine()+startingLine)+"]"] $init? $com? $finl? $i $a? )
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.behaviorState,re,$behavior_state.tree);}

transitions 
  : 
  t=LITERAL_transitions bt+=behavior_transition+
    -> ^( LITERAL_transitions[$t,"transitions["+Integer.toString($t.getLine()+startingLine)+"]"] $bt+ )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("If you get \"mismatched input"+
      " '<<' expecting 'transitions'\" then you might have put a semicolon "+
      "between an action and a Assertion, instead of afterwards.");
    tellBNF(GrammarStrings.transitions,re,$transitions.tree);}
  
behavior_transition
  :
  ( btl=behavior_transition_label COLON )?
  /*source_state_*/ssi+=identifier ( COMMA /*source_state_*/ssi+=identifier )*
  x=LCON bc=behavior_condition? RCON
  /*destination_state*/dsi=identifier 
  ( LCURLY s=behavior_actions RCURLY | EMPTY_CURLY )
  q=assertion? semi=SEMICOLON
    -> 
      ^( TRANSITION[$x,"TRANSITION["+Integer.toString($x.getLine()+startingLine)+"]"] 
      ^( LABEL[$x,"LABEL["+Integer.toString($x.getLine()+startingLine)+"]"] $btl? ) 
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
    tellBNF(GrammarStrings.behaviorTransition,re,$behavior_transition.tree);
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());}

behavior_transition_label
  :
  id=identifier ( LBRACKET lit=INTEGER_LIT RBRACKET )?
    -> ^( $id $lit? )
  ; 

behavior_condition 
  : 
  dispatch_condition | execute_condition | mode_condition
  ;

execute_condition 
  : 
  /*boolean_*/expression_or_relation //| LITERAL_timeout
  ;

mode_condition
  :
  LITERAL_on^ trigger_logical_expression
  ;

//operators must match
trigger_logical_expression
  :
  first=event_trigger ( op1=logical_operator et+=event_trigger 
    (op2=logical_operator et+=event_trigger {op1==op2}? )* )?
    -> {op1!=null}? ^($op1 $first $et+)
    -> $first
  ;
  catch [RecognitionException re] 
    {
    Dump.it("\nAll operators in trigger_logical_expression must be the same.");
    reportError(re,(BAST)retval.getTree());}
  
event_trigger
  :
  ( sub+=ID PERIOD^ ( sub+=ID PERIOD )* )? port=ID
  | LPAREN^ trigger_logical_expression RPAREN
  ;

logical_operator
  :
  LITERAL_and
  | LITERAL_or
  | LITERAL_xor
  | LITERAL_cand
  | LITERAL_cor
  ;
   
/////////////////BEHAVIOR ACTION LANGUAGE//////////////////////// 
  
subprogram_behavior 
  :
  ANNEX_START?
  no_proof=DO_NOT_PROVE?
//  av=availability?  
  ac=assert_clause?
  ( pr=LITERAL_pre p1=assertion )?
  ( po=LITERAL_post p2=assertion )?
  elq=existential_lattice_quantification
  ANNEX_END?
//    ->{no_proof!=null}? ^( SUBPROGRAM_ANNEX )
    -> {pr==null & po==null}? ^(SUBPROGRAM_ANNEX $ac? $elq $no_proof?)
    -> {pr!=null & po==null}? ^(SUBPROGRAM_ANNEX $ac? ^($pr $p1)  $elq $no_proof?)
    -> {pr==null & po!=null}? ^(SUBPROGRAM_ANNEX $ac? ^($po $p2) $elq $no_proof?)
    -> ^(SUBPROGRAM_ANNEX $ac? ^($pr $p1) ^($po $p2) $elq $no_proof?)
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.subprogramBehavior,re,$subprogram_behavior.tree);}
  
asserted_action
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$s.tree).getParseRecord());}
  :
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
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.assertedAction,re,$asserted_action.tree);}

action 
  : 
  basic_action
  | alternative
  | while_loop
  | for_loop
  | do_until_loop
  | existential_lattice_quantification
  | universal_lattice_quantification
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.action,re,$action.tree);}

alternative 
  : 
  lif=LITERAL_if 
//  av=availability?    
  alt+=guarded_action
  ( '[]' alt+=guarded_action )+ 
  LITERAL_fi
    -> ^( $lif $alt+ )
//    -> ^( $lif $av? $alt+ )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.alternative,re,$alternative.tree);}

guarded_action 
  : 
  LPAREN! /*boolean_*/expression_or_relation GUARD^ asserted_action
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.guardedAction,re,$guarded_action.tree);}

universal_lattice_quantification 
  : 
  lf=LITERAL_forall   
  lv=lattice_variables li=LITERAL_in r=range  
//  av=availability? 
  elq=existential_lattice_quantification
    -> ^($lf $lv ^($li $r) $elq )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.ulq,re,$universal_lattice_quantification.tree);}

lattice_variables
  :
  i1=identifier (com=COMMA i+=identifier (COMMA i+=identifier)* )?  
    ->{com!=null}? ^( $com $i1 $i+ )  
    -> $i1  
//  i+=identifier (COMMA i+=identifier)* coln=COLON ty=type 
//    -> ^( $coln $ty $i+ )    
  ;

while_loop 
  : 
  lw=LITERAL_while  
  LPAREN be=/*boolean_*/expression_or_relation RPAREN
//  av=availability?  
  ( LITERAL_invariant inv=assertion )?
  ( LITERAL_bound bd=/*integer_*/expression )?  
  elq=existential_lattice_quantification
    -> ^($lw $be ^(INVARIANT[$lw,"INVARIANT"] $inv?) ^(BOUND[$lw,"BOUND"] $bd?) $elq )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.whileLoop,re,$while_loop.tree);}
  
for_loop 
  : 
  lf=LITERAL_for
//  LPAREN
  a=/*integer_*/identifier  li=LITERAL_in lb=/*integer_*/expression DOTDOT ub=/*integer_*/expression 
//  RPAREN
//  av=availability?  
  ( LITERAL_invariant inv=assertion )?
  LCURLY  act=behavior_actions RCURLY  //keep the closing }
//  elq=existential_lattice_quantification
    ->^($lf $a ^($li $lb $ub) ^(INVARIANT[$lf,"INVARIANT"] $inv?) $act ) 
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.forLoop,re,$for_loop.tree);}
  
do_until_loop 
  : 
  ld=LITERAL_do 
//  av=availability?  
  ( LITERAL_invariant inv=assertion )?
  ( LITERAL_bound bd=/*integer_*/expression )?  
  ba=behavior_actions
  lu=LITERAL_until LPAREN be=/*boolean_*/expression_or_relation RPAREN   
    ->^($ld ^($lu $be) ^(INVARIANT[$ld,"INVARIANT"] $inv?) ^(BOUND[$ld,"BOUND"] $bd?) $ba )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.doUntilLoop,re,$do_until_loop.tree);}
    
basic_action
  :
  LITERAL_skip
  | assignment
////MUST CHECK THAT IN subBLESS NONE OF THE FOLLOWING ARE USED///////
  | communication_action 
  | computation_action
  | LITERAL_setmode /*mode_*/identifier
  | when_throw
  | combinable_operation
  | simultaneous_assignment
  | issue_exception
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.basicAction,re,$basic_action.tree);}

assignment 
  : 
 nt=name_tick a=ASSIGN eort=expression_or_record_term
    -> ^($a $nt $eort)
 //name_tick a=ASSIGN ( e=expression | rt=record_term )
 //   -> {(t!=null)&&(e!=null)}? ^($a ^($t $n) $e)
 //   -> {(t!=null)&&(rt!=null)}? ^($a ^($t $n) $rt)
 //   -> {(t==null)&&(e!=null)}? ^($a $n $e)
 //   -> ^($a $n $rt)
  ;

name_tick
  :
   /*variable_*/name ( TICK^ )? 
  ;
  
expression_or_record_term
  :
  e=expression | rt=record_term | any=LITERAL_any
  ;

record_term
  :
  LPAREN^ prv+=record_value+ RPAREN
  ;
  
record_value
  :
  /*record_field_*/identifier ARROW^ value SEMICOLON!
  ;  

simultaneous_assignment
  @after{
    if (retval.tree==null) throw new YouIdiot("No retval.tree in simultaneous_assignment");
    if (!retval.tree.hasType(BLESStoASTLexer.ASSIGN)) throw new YouIdiot(
      "retval.tree must be := for simulatneous assignmen",retval.tree);
    if (retval.tree.getChildCount()!=2) throw new YouIdiot(" := must have two children",retval.tree);
    BAST lhc=(BAST)retval.tree.getChild(0); 
    BAST rhc=(BAST)retval.tree.getChild(1); 
    if (!lhc.hasType(BLESStoASTLexer.COMMA) || !rhc.hasType(BLESStoASTLexer.COMMA))
      throw new YouIdiot(" children of := must be ,",retval.tree);
    if (lhc.getChildCount()!=rhc.getChildCount())
      {
      Dump.it("\n\nBoth sides of simulatneous assignment must have equal number of terms:  "+
          lhc.getChildCount()+" is not "+rhc.getChildCount());
      throw new YouIdiot("simultaneous assignment "+
      (lhc.getChildCount()>rhc.getChildCount()?"more variables than expressions":"more expressions than variables")
      ,retval.tree);
      }
  }  //end of after simultaneous_assignment
  :
  LPAREN lhs+=name_tick ( left_comma=COMMA lhs+=name_tick )+ 
  a=ASSIGN rhs+=expression_or_record_term ( right_comma=COMMA rhs+=expression_or_record_term )+ RPAREN
    -> ^($a ^($left_comma $lhs+ )  ^($right_comma $rhs+ ) )
  ;
  catch [YouIdiot yi] {yi.handleException();}
      
issue_exception
  :
  LITERAL_exception^ LPAREN! 
  ( exception_state=identifier COMMA! )? message=AADL_STRING_LITERAL RPAREN!
  ;
      
      
computation_action
  :
  LITERAL_computation^ 
//  availability?   
  LPAREN! behavior_time ( COMMA! behavior_time )? 
  RPAREN!
//  | 
//  LITERAL_delay^ 
//  availability?   
//  LPAREN! behavior_time ( COMMA! behavior_time )? RPAREN!
  ;
  
behavior_time
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$duration.tree).getParseRecord());}
  :
  duration=expression /*unit_*/u=time_unit
    -> ^( BEHAVIOR_TIME["BEHAVIOR_TIME"] $duration $u )
//  | upn=unique_property_name
//    -> ^( BEHAVIOR_TIME["BEHAVIOR_TIME"] $upn )
  ; 
  
time_unit
  :
  LITERAL_ps | LITERAL_ns | LITERAL_us | LITERAL_ms | LITERAL_sec | LITERAL_min | LITERAL_hr   
  ;
      
communication_action
  : 
  pc=procedure_call
    ->$pc
  |
  po=port_output
    ->$po
  |
  pi=port_input
    ->$pi
  |
  pause=LITERAL_pause
    ->$pause
  ;
  
procedure_call
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$p.tree).getParseRecord());}
  :  
  /*requires_subprogram_*/p=identifier /*no '!'*/ LPAREN spb=formal_actual_list? RPAREN 
    -> ^( PROCEDURE_CALL[$p.tree.getToken(),
      "PROCEDURE_CALL["+Integer.toString($p.tree.getLine() //+startingLine
      )+"]"] $p $spb? )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
  Dump.it("RecognitionException caught by BLESStoAST.procedure_call");
  Dump.it("Did you forget \"formal:actual\" in your subprogram invocation, "+HelpfulHints.getIdiot()+"?");
//    tellBNF(GrammarStrings.procedureCall,re,$procedure_call.tree);
    }

port_output
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$pn.tree).getParseRecord());}
  :  
    pn=port_name EXCLAMATION ( LPAREN be=expression_or_relation RPAREN )?  //output
    -> ^( PORT_OUTPUT[$pn.tree.getToken(),
      "PORT_OUTPUT["+Integer.toString($pn.tree.getLine() //+startingLine
      )+"]"] $pn $be? )
   ;

  
port_input
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$pn2.tree).getParseRecord());}
  :   
    pn2=port_name QUESTION LPAREN n=/*local_variable_ or outgoing_port_ or outgoing_parameter_*/name RPAREN   //input
     -> ^( PORT_INPUT[$pn2.tree.getToken(),
      "PORT_INPUT["+Integer.toString($pn2.tree.getLine() //+startingLine
      )+"]"] $pn2 $n )
  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.communicationAction,re,$communication_action.tree);}

//NAMES OF ELEMENTS OF PORTS ARRAYS ARE NOT SUPPORTED!
port_name 
  : 
  /*port_*/identifier (PERIOD^ identifier (PERIOD! identifier)* )?
  |
  /*port_*/identifier LBRACKET^  INTEGER_LIT RBRACKET
  ;

formal_actual_list 
  : 
  fa=formal_actual ( c=COMMA fa2+=formal_actual  )*
    -> {c!=null}? ^( $c $fa $fa2+ )
    -> $fa
  ;

formal_actual  //formal parameter, actual variable name pair
  :
  ( /*formal_parameter_*/identifier COLON^ )? actual_parameter
  ;

actual_parameter
  :  //tick optional, but root if there
   /*variable_*/name 
   | value_constant //( TICK^ )?
   | parenthesized_subexpression
  ; 
        
existential_lattice_quantification 
  : 
  quantified_variables?
  LCURLY^  behavior_actions RCURLY  //keep the closing }
  timeout_clause?
  catch_clause?
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.elq,re,$existential_lattice_quantification.tree);}

catch_clause
  :
  LITERAL_catch^ catch_clause_term+
  ;

timeout_clause
  :
  LITERAL_timeout^ behavior_time
  ;
    
catch_clause_term
  :  
  LPAREN ( ei+=/*exception_*/identifier+ | a=LITERAL_all ) c=COLON ba=basic_action RPAREN
    -> {a!=null}? ^($c $a $ba)
    -> ^($c $ei+ $ba)
  ;  //the manual splits out exception_label for ( /*exception_*/identifier+ | LITERAL_all )
  
when_throw
  :
  LITERAL_when^ LPAREN! /*boolean_*/expression RPAREN! LITERAL_throw /*exception_*/identifier
  ;

combinable_operation
  :
  LITERAL_fetchadd^ LPAREN! /*target_*/variable_name COMMA! 
      /*aritmetic_*/expression ( COMMA! /*result_*/identifier )? RPAREN!
  |
  LITERAL_fetchor^ LPAREN! /*target_*/variable_name COMMA! 
      /*boolean_*/expression ( COMMA! /*result_*/identifier )? RPAREN!
  |
  LITERAL_fetchand^ LPAREN! /*target_*/variable_name COMMA! 
      /*boolean_*/expression ( COMMA! /*result_*/identifier )? RPAREN!
  |
  LITERAL_fetchxor^ LPAREN! /*target_*/variable_name COMMA! 
      /*boolean_*/expression ( COMMA! /*result_*/identifier )? RPAREN!
  |
  LITERAL_swap^  LPAREN! /*target_*/variable_name COMMA! 
      /*reference_*/variable_name ( COMMA! /*result_*/identifier )? RPAREN!
  ;
   
behavior_actions 
  : 
  aa=asserted_action
    (
    ( c=SEMICOLON as+=asserted_action ( SEMICOLON as+=asserted_action )* )
    |
    ( amp=AMPERSAND ac+=asserted_action ( AMPERSAND ac+=asserted_action )* )
    )?
    -> {c!=null}? ^( $c $aa $as+ )
    -> {amp!=null}? ^( $amp $aa $ac+ )
    -> $aa
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.behaviorActions,re,$behavior_actions.tree);}
  

//////////////// EXPRESSION /////////////////


name 
  : pn1=partial_name ( d=PERIOD pn2+=partial_name )*
    // if there's a dot, make it the root
    -> {d!=null}? ^( $d $pn1 $pn2+ )
    -> $pn1
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.name,re,$name.tree);}
  
partial_name 
  :  
  identifier   
  ( LBRACKET index+=expression_or_range RBRACKET )* 
  -> {index!=null}? ^( identifier $index+ )  
  -> identifier
  ; 

parameter_list 
  :  
  e1=expression_or_range 
  ( c=COMMA e2+=expression_or_range )* 
    -> {c!=null}? ^( $c $e1 $e2+ )
    -> $e1
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.parameterList,re,$parameter_list.tree);}

expression_or_range 
  :  
  expression ( range_symbol^ expression )?  
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.expressionOrRange,re,$expression_or_range.tree);}

variable_name 
  : name
  ;

//give all the symbols token types with names



  
expression 
//  @option{backtrack=true;}
  :
  a1=subexpression
  ( 
  //one or more additions
  ( o=PLUS a+=subexpression)+ 
  | //one or more multiplications
  ( o=TIMES a+=subexpression)+ 
  | //a subtraction
  o=MINUS a+=subexpression
  | //a division
  o=DIVIDE a+=subexpression
  | //a modulus
  o=LITERAL_mod a+=subexpression
  | //a remainder
  o=LITERAL_rem a+=subexpression
  | //an exponentiation
  o=EXP a+=subexpression
  | //one or more conjunctions
  ( o=LITERAL_and a+=subexpression )+
  | //one or more disjunctions
  ( o=LITERAL_or a+=subexpression )+
  | //one or more exclusive-ors
  ( o=LITERAL_xor a+=subexpression )+
  | //a onditional and
  o=LITERAL_cand a+=subexpression
  | //a cnditional or
  o=LITERAL_cor a+=subexpression
  | //or just an subexpression (nothing follows)
  )
  //generate ASTs, if it has an operator, make one the root
  -> {$o!=null}? ^( $o $a1 $a+ )
  //otherwise it's just an subexpression
  -> $a1
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.expression,re,$expression.tree);}

subexpression 
//  @option{backtrack=true;}
  :
  ( m=MINUS | n=LITERAL_not )? 
  ( v=value | ps=parenthesized_subexpression)
    -> {m!=null&&v!=null}? ^( UNARY_MINUS[$m] $v )
    -> {m!=null&&ps!=null}? ^( UNARY_MINUS[$m] $ps )
    -> {n!=null&&v!=null}? ^( $n $v )
    -> {n!=null&&ps!=null}? ^( $n $ps)
    -> {v!=null}? $v
    -> $ps
  | tc=type_conversion
    -> $tc
  | 
  fc=function_call -> $fc
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.subexpression,re,$subexpression.tree);}

type_conversion
	:
  (n=LITERAL_natural | 
  n=LITERAL_integer | 
  n=LITERAL_rational | 
  n=LITERAL_real | 
  n=LITERAL_complex |
  n=LITERAL_time) 	
  ps=parenthesized_subexpression
    -> ^($n $ps)
	;


assertion_type_conversion
	:
  (n=LITERAL_natural | 
  n=LITERAL_integer | 
  n=LITERAL_rational | 
  n=LITERAL_real | 
  n=LITERAL_complex |
  n=LITERAL_time) 	
  ps=parenthesized_assertion_expression
    -> ^($n $ps)
	;

  
boolean_expression 
//  @option{backtrack=true;}
  :
  a1=boolean_subexpression
  ( 
  //one or more conjunctions
  ( o=LITERAL_and a+=boolean_subexpression )+
  | //one or more disjunctions
  ( o=LITERAL_or a+=boolean_subexpression )+
  | //one or more exclusive-ors
  ( o=LITERAL_xor a+=boolean_subexpression )+
  | //a onditional and
  o=LITERAL_cand a+=boolean_subexpression
  | //a cnditional or
  o=LITERAL_cor a+=boolean_subexpression
  | //or just an subexpression (nothing follows)
  )
  //generate ASTs, if it has an operator, make one the root
  -> {$o!=null}? ^( $o $a1 $a+ )
  //otherwise it's just an subexpression
  -> $a1
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.expression,re,$boolean_expression.tree);}

boolean_subexpression 
//  @option{backtrack=true;}
  :
  ( n=LITERAL_not )? 
  ( v=value | ps=parenthesized_subexpression)
    -> {n!=null&&v!=null}? ^( $n $v )
    -> {n!=null&&ps!=null}? ^( $n $ps)
    -> {v!=null}? $v
    -> $ps
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.subexpression,re,$boolean_subexpression.tree);}
  
numeric_expression 
//  @option{backtrack=true;}
  :
  a1=numeric_subexpression
  ( 
  //one or more additions
  ( o=PLUS a+=numeric_subexpression)+ 
  | //one or more multiplications
  ( o=TIMES a+=numeric_subexpression)+ 
  | //a subtraction
  o=MINUS a+=numeric_subexpression
  | //a division
  o=DIVIDE a+=numeric_subexpression
  | //a modulus
  o=LITERAL_mod a+=numeric_subexpression
  | //a remainder
  o=LITERAL_rem a+=numeric_subexpression
  | //an exponentiation
  o=EXP a+=numeric_subexpression
  | //or just an subexpression (nothing follows)
  )
  //generate ASTs, if it has an operator, make one the root
  -> {$o!=null}? ^( $o $a1 $a+ )
  //otherwise it's just an subexpression
  -> $a1
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
     tellBNF(GrammarStrings.expression,re,$numeric_expression.tree);}

numeric_subexpression 
//  @option{backtrack=true;}
  :
  ( m=MINUS )? 
  ( v=value | ps=parenthesized_subexpression)
    -> {m!=null&&v!=null}? ^( UNARY_MINUS[$m] $v )
    -> {m!=null&&ps!=null}? ^( UNARY_MINUS[$m] $ps )
    -> {v!=null}? $v
    -> $ps
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
    tellBNF(GrammarStrings.subexpression,re,$numeric_subexpression.tree);}
  
parenthesized_subexpression
//  @option{backtrack=true;}
  :
  (LPAREN LITERAL_if | LPAREN boolean_expression_or_relation QQ)=>
  ce=conditional_expression
    -> $ce
  |  
  (LPAREN case_choice)=>
  ce=case_expression
    -> $ce
  |
  lp=LPAREN eor=expression_or_relation rp=RPAREN 
    -> ^($lp $eor $rp)
  ;  

case_expression
  :
  lp=LPAREN cc+=case_choice ( c=COMMA cc+=case_choice ( COMMA cc+=case_choice )* ) RPAREN
    -> ^(CASE_EXPRESSION 
      $cc+ )
  ;

case_choice
  :
  LPAREN! be=boolean_expression_or_relation RPAREN! IMP^ exp=expression
  ;

conditional_expression
  :
  LPAREN LITERAL_if be=boolean_expression_or_relation then=LITERAL_then t=/*true*/expression LITERAL_else f=/*false*/expression RPAREN
    -> ^(CONDITIONAL[$then] $be $t $f)
  |  
  LPAREN be=boolean_expression_or_relation q=QQ t=/*true*/expression COLON f=/*false*/expression RPAREN
    -> ^(CONDITIONAL[$q] $be $t $f)
  ;
  
value
  : 
  vc=value_constant -> $vc
  |
  //put test to only allow in thread_behavior
  /*port_valuie*/
  (port_name ( QUESTION | TICK LITERAL_fresh | TICK LITERAL_count| TICK LITERAL_updated ))=>
  pn=port_name ( q=QUESTION | tf=TICK f=LITERAL_fresh | tc=TICK c=LITERAL_count  | tc=TICK u=LITERAL_updated )
    -> {$f!=null}? ^($tf $pn $f)
    -> {$c!=null}? ^($tc $pn $c)
    -> {$u!=null}? ^($tc $pn $u)
    -> ^($q $pn)
  |
  /*subprogram_paramerer_*/
  /*local_variable_*/
  /*data_component_reference*/
  nam=name -> $nam
  |
  li=LITERAL_in 'mode' LPAREN /*mode_*/i+=identifier+ RPAREN
    -> ^(INMODE[$li,"in mode"] $i+ )
  |
  timeout=LITERAL_timeout -> $timeout
  |
  nu=LITERAL_null -> $nu
  |
  now=LITERAL_now -> $now
  |
  tops=LITERAL_tops -> $tops
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.value,re,$value.tree);}

value_constant
  :
  LITERAL_true | LITERAL_false
  | numeric_constant
  | AADL_STRING_LITERAL
  | enumeration_value
  ;
  catch [RecognitionException re] 
    {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.value,re,$value_constant.tree);}

enumeration_value
  :	//added for generation of Slang enumeration literals
  enum_type=identifier tick=TICK enum_value=identifier
    -> ^($tick $enum_type $enum_value)
  ;	
  	
property
  :
  property_constant | property_reference
  ;

property_constant
  :
  ps=/*property_set_*/identifier dc=DOUBLE_COLON^ p=/*property_*/identifier
  ;

property_reference
  :
  oc=OCTOTHORPE pname=property_name
    //ps=/*property_set_*/identifier dc=DOUBLE_COLON p=/*property_*/identifier 
    ( field+=property_field )*
    -> ^($oc $pname $field*)
//    -> ^($oc ^($dc $ps $p) $field*)
  | self=LITERAL_self oc=OCTOTHORPE pname=property_name ( field+=property_field )*
    -> ^($oc $self $pname $field*)
//  | id=ID oc=OCTOTHORPE pname=property_name 
//    -> ^($oc $id $pname)  
  | component=unique_component_classifier_reference oc=OCTOTHORPE pname=property_name
    ( field+=property_field )*
    -> ^($oc $component $pname $field*) 
  ;

property_field
  :
  LBRACKET^ (INTEGER_LIT | ID) RBRACKET
  |
  PERIOD^ (ID|LITERAL_upper_bound|LITERAL_lower_bound)
  ;
  
property_name
  :
  ps=/*property_set_*/identifier dc=DOUBLE_COLON p=/*property_*/identifier
    -> ^($dc $ps $p) 
//  ID^ ( field+=property_field )*
  ;
    
numeric_constant
  :
  INTEGER_LIT 
  | REAL_LIT 
  |
  rational_literal | complex_literal
  | property
  ;
   
expression_or_relation
//  @option{backtrack=true;}
  :
  (LPAREN ID ARROW)=>
  rt=record_term
    -> $rt
  |  
  (subexpression relation_symbol)=>
  e1=subexpression 
    rs=relation_symbol e2=subexpression 
    -> ^($rs $e1 $e2)
  |
  e=expression
  -> $e
  ;
  catch [RecognitionException re] 
    {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.expressionOrRelation,re,$expression_or_relation.tree);}
  
boolean_expression_or_relation
//  @option{backtrack=true;}
  :
  (subexpression relation_symbol)=>
  e1=subexpression 
//  ( 
    rs=relation_symbol e2=subexpression 
//  )?
  -> ^($rs $e1 $e2)
  |
  e=boolean_expression
  -> $e
  ;
  catch [RecognitionException re] 
    {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
      tellBNF(GrammarStrings.expressionOrRelation,re,$boolean_expression_or_relation.tree);}

function_call 
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$id.tree).getParseRecord());}
  : 
  ( /*package_*/p+=identifier DOUBLE_COLON )+
  id=/*function_*/identifier lp=LPAREN fp=function_parameters? RPAREN
  -> ^(FUNCTION_CALL[$lp,"FUNCTION_CALL"] ^(DOUBLE_COLON $p+) $id $fp? )
//  -> {p!=null}? ^(FUNCTION_CALL[$lp,"FUNCTION_CALL"] ^(DOUBLE_COLON $p+) $id $fp? )
//  -> ^(FUNCTION_CALL[$lp,"FUNCTION_CALL"] $id $fp? )
  ;
  catch [RecognitionException re] 
    {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.functionCall,re,$function_call.tree);}

 
function_parameters
  :
  param+=formal_expression_pair ( COMMA^  param+=formal_expression_pair  
    ( COMMA  param+=formal_expression_pair)* )?
  ;

formal_expression_pair
  :
  formal=ID COLON^ actual=expression
  ;
  
/////////////////////// TYPE //////////////////////////////////

type 
  : 
 // (DOUBLE_COLON | PERIOD | ID)=>
  tn=type_name
    ->$tn // ^(TYPE[$tn.tree.getToken(),"TYPE_NAME["+Integer.toString($tn.tree.getToken())+"]"] $tn)
  |
  et=enumeration_type
    ->$et // ^(TYPE[$et.tree.getToken(),"TYPE_ENUMERATION["+Integer.toString($et.tree.getToken())+"]"] $et)
  |
  nt=number_type
    ->$nt // ^(TYPE[$nt.tree.getToken(),"TYPE_NUMBER["+Integer.toString($nt.tree.getToken())+"]"] $nt)
  |
  at=array_type
    ->$at // ^(TYPE[$at.tree.getToken(),"TYPE_ARRAY["+Integer.toString($at.tree.getToken())+"]"] $at)
  |
  rt=record_type
    ->$rt // ^(TYPE[$rt.tree.getToken(),"TYPE_RECORD["+Integer.toString($rt.tree.getToken())+"]"] $rt)
  |
  vt=variant_type
    ->$vt // ^(TYPE[$vt.tree.getToken(),"TYPE_VARIANT["+Integer.toString($vt.tree.getToken())+"]"] $vt)
//  |
//  toi=type_operator_invocation
//    ->$toi // ^(TYPE[$toi.tree.getToken(),"TYPE_OPERATOR_INVOCATION["+Integer.toString($toi.tree.getToken())+"]"] $toi)
  |
  b=LITERAL_boolean -> $b
  |
  s=LITERAL_string -> $s
  ;
  catch [RecognitionException re] {
  Dump.it("\n"+(saidTypeError?"That ":"Some ")+Global.dope+
  " made "+(saidTypeError?"another":"an")+" error in grammar of a \"type\".\n");
  Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
  tellBNF(GrammarStrings.type,re,$type.tree);
//  Dump.it("RecognitionException suppressed ");
//  if ((retval!=null)&&(retval.getTree()!=null))
//    Dump.it(((BAST)retval.getTree()).toStringTree());
  }

enumeration_type 
  : 
 LITERAL_enumeration^ LPAREN! /*defining_enumeration_literal_*/ identifier
   (COMMA! identifier)* RPAREN!
  ;
  catch [RecognitionException re] 
  { Dump.it("Did you forget commas between your enumeration literals?");
  Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.enumerationType,re,$enumeration_type.tree);}

//units_type 
//  : 
//  u='units' ul=units_list
//    -> ^( $u $ul )
//  ;
//  catch [RecognitionException re] {tellBNF(GrammarStrings.unitsType,re);}

//units_list 
//  : 
//  lp=LPAREN /*defining_unit_*/first_unit=identifier  ( COMMA au+=another_unit )* RPAREN
//    -> ^( $lp $first_unit $au* )
////    -> {$au!=null}? ^( $lp $first_unit $au+ )
////    -> ^( $lp $first_unit  )
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.unitsList,re,$units_list.tree);}
//  
//another_unit 
//  : 
//  /*defining_unit_*/du=identifier arrow=ARROW /*unit_*/u=identifier star=TIMES n=NUMERIC_LIT 
//    -> ^( $arrow $du ^( $star $u $n ) )
//  ;
//  catch [RecognitionException re] {reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.anotherUnit,re,$another_unit.tree);}

number_type 
  : //range does not have units
  (n=LITERAL_natural | 
  n=LITERAL_integer | 
  n=LITERAL_rational | 
  n=LITERAL_real | 
  n=LITERAL_complex |
  n=LITERAL_time) 
  r=number_range? ( u=LITERAL_units ud=units_designator )?
   -> {u!=null}? ^($n ^($u $ud) $r?)
   -> ^($n $r? )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.numberType,re,$number_type.tree);}

number_range
  :
  LBRACKET! constant_number_range RBRACKET!
  ;

constant_number_range
  :
  lb_um=MINUS? lb=numeric_constant dd=DOTDOT ub_um=MINUS? ub=numeric_constant 
  -> {(lb_um!=null)&&(ub_um!=null)}? ^($dd ^(UNARY_MINUS[$lb_um] $lb) ^(UNARY_MINUS[$ub_um] $ub) ) 
  -> {lb_um!=null}? ^($dd ^(UNARY_MINUS[$lb_um] $lb) $ub ) 
  -> {ub_um!=null}? ^($dd $lb ^(UNARY_MINUS[$ub_um] $ub) ) 
  -> ^($dd $lb $ub ) 
  ;
 
units_designator 
  : 
  /*units_unique_property_type_*/identifier
  | time_unit
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.unitsDesignator,re,$units_designator.tree);}
  
//range_type 
//  : 
//  'range'^ 'of'! ( number_type | /*number_unique_property_type_*/identifier )
//  ;

//property_type_designator 
//  : 
//  ( /*property_set_*/identifier DOUBLE_COLON^ )? (/*property_type_*/identifier | type)
//  ;

unique_component_classifier_reference 
  : 
  p+=/*package_*/identifier ( DOUBLE_COLON p+=/*data_component*/identifier )+ 
    ( PERIOD ii=/*implementation_*/identifier )?  //optional period
    -> {ii!=null}? ^( DOUBLE_COLON $p+ ^(PERIOD $ii))
    -> ^( DOUBLE_COLON $p+)
  |
//  LITERAL_BLESS DOUBLE_COLON t=identifier
//    -> ^( DOUBLE_COLON LITERAL_BLESS $t)
//  |
  dci=/*data_component*/identifier
    ( PERIOD ii=/*implementation_*/identifier )?
    -> {ii!=null}? ^(PERIOD $dci $ii)
    -> $dci
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
    Dump.it("\nIs this a unique_component_classifier_reference?\n");
//    tellBNF(GrammarStrings.subcomponent,re,$subcomponent.tree);
    }
                
type_name 
  : 
  //either identifier or AADL name P::X
  p=ID (dc=DOUBLE_COLON^ x=ID)?
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.typeName,re,$type_name.tree);}

array_type 
  : 
  LITERAL_array^ LBRACKET! array_range_list RBRACKET! LITERAL_of type 
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.arrayType,re,$array_type.tree);}


record_type 
  : 
  LITERAL_record^ LPAREN! record_field+ RPAREN!
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.recordType,re,$record_type.tree);}
  
record_field 
  : //no 'list of'
  /*defining_field_*/identifier COLON^ type SEMICOLON!
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("\nDid you forget a ; after a record or variant field?\n");
    tellBNF(GrammarStrings.recordField,re,$record_field.tree);}

///the grammar in the document is hopelessly ambiguous trying
////to distinguish and enumeration range from an integer range
////so instead we recognize a literal or an identifier, optionally followed by ..
////and another literal or identifier
array_range_list 
  :
  natural_range ( COMMA^ natural_range ( COMMA! natural_range )* )?
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.arrayRangeList,re);
      tellBNF(GrammarStrings.arrayRangeList,re,$array_range_list.tree);}

//add checks that literals are non-negative!  
natural_range
  :   
  ( ilb=INTEGER_LIT | elb=identifier | pnlb=property) //lower bound
  ( dd=DOTDOT^ ( iub=INTEGER_LIT | eub=identifier | pnub=property))? //optional upper bound
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.naturalRange,re);
      tellBNF(GrammarStrings.naturalRange,re,$natural_range.tree);}

//allow  ps::xyz for array range
//aadl_property_name
//  :
//  prop_set=ID DOUBLE_COLON^ prop_name=ID
//  ;
    
variant_type
  :
  LITERAL_variant^ //LBRACKET! /*discriminant_*/identifier RBRACKET! 
    LPAREN! record_field+ RPAREN!
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.variantType,re);}

///////////////////////////// ASSERTION /////////////////////////////////////

assertion_annex_subclause // for  annex subclause 
  : 
  ANNEX_START?
  (
  a+=assertion+
    -> ^(ASSERTION_ANNEX $a+)
  | p=predicate
    -> ^(ASSERTION_ANNEX $p)
  )
  ANNEX_END?
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.assertionAnnexSubclause,re,$assertion_annex_subclause.tree);}


//annex_library_assertions used instead
assertion_annex_library // for  annex library 
  : 
  ANNEX_START?
  (
  a+=assertion+
    -> ^(ASSERTION_ANNEX $a+)
  )
  ANNEX_END?
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.assertionAnnexLibrary,re,$assertion_annex_library.tree);}

assertion 
//  @after{$assertion.tree.setPartOfAssertion();}
  :  
  ll=LASS! ab=assertion_body RASS!
//    {if (((BAST)$ab.tree.getChild(0)).hasType(LABEL))  //if the assertion has a label,
//     Proof.label_assertion_map.put(((BAST)$ab.tree.getChild(0).getChild(0)).getText(),$ab.tree);} //put it in the map
  ;
  catch [MismatchedTokenException mte] 
    {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(mte,(BAST)retval.getTree());
    tellBNF("\ntry using more parentheses near line "+
      Integer.toString($ll.getLine()+startingLine)+", as if you\'re not parenthetic enough already"+
      "\n",mte,$assertion.tree);}
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); tellBNF(GrammarStrings.AssertionBNF,re,$assertion.tree);}
  
assertion_body 
//  @after{
//  if (putAssertionsIntoMap&&($cln!=null)&&($a.text!=null)) 
//    if (Proof.label_assertion_map.containsKey($a.text))
//      throw new YouIdiot("Duplicate Assertion for \""+$a.text+"\"",$a.tree);
//    else
//      Proof.label_assertion_map.put($a.text,$assertion_body.tree);}
  :
  //labeled assertion enumeration
  ( a=identifier cln=COLON lv1=identifier ae=assertion_enumeration )
    -> ^(ASSERTION_ENUMERATION[$a.tree.getToken(),
        "ASSERTION_ENUMERATION["+Integer.toString($a.tree.getLine()+startingLine)+"]"] 
        ^(LABEL $a ) ^(PARAMETERS $lv1 )  $ae)
  | 
  //unlabeled assertion enumeration
  ae=assertion_enumeration
    -> ^(ASSERTION_ENUMERATION[$ae.tree.getToken(),
        "ASSERTION_ENUMERATION["+Integer.toString($ae.tree.getLine()+startingLine)+"]"] $ae)
  | 
  ( a=identifier cln=COLON lv=formal_assertion_parameter_list? COLON p=predicate )
    -> {lv!=null}? ^(ASSERTION[$p.tree.getToken(),"ASSERTION["+Integer.toString($p.tree.getLine()+startingLine)+"]"]  
        ^(LABEL $a ) ^(PARAMETERS $lv )  $p )
    ->  ^(ASSERTION[$p.tree.getToken(),"ASSERTION["+Integer.toString($p.tree.getLine()+startingLine)+"]"]
        ^(LABEL $a )  $p )
  | 
  ( a=identifier cln=COLON lv=formal_assertion_parameter_list? ASSIGN e=assertion_function_value )
    -> {lv!=null}? ^(ASSERTION_FUNCTION[$e.tree.getToken(),
        "ASSERTION_FUNCTION["+Integer.toString($e.tree.getLine()+startingLine)+"]"] 
        ^(LABEL $a ) ^(PARAMETERS $lv ) $e)
    -> ^(ASSERTION_FUNCTION[$e.tree.getToken(),
        "ASSERTION_FUNCTION["+Integer.toString($e.tree.getLine()+startingLine)+"]"] 
        ^(LABEL $a )  $e)
//  |
//  ( a=identifier cln=COLON lv+=identifier* ASSIGN ( condition_value_pair (COMMA condition_value_pair)+ ) )
  
  //unlabeled assertion function
  | ( ASSIGN e=assertion_function_value )
    -> ^(ASSERTION_FUNCTION[$e.tree.getToken(),
        "ASSERTION_FUNCTION["+Integer.toString($e.tree.getLine()+startingLine)+"]"] 
        $e)
  //just a predicate
  | p3=predicate 
    -> ^(ASSERTION[$p3.tree.getToken(),"ASSERTION["+Integer.toString($p3.tree.getLine()+startingLine)+"]"]   $p3 )
  ; 
  catch [YouIdiot yi] {yi.handleException();}
  catch [RecognitionException re] { 
    Dump.it("Could you be missing parentheses?");
    tellBNF(GrammarStrings.assertionBody,re,$assertion_body.tree);
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());}

formal_assertion_parameter
  :
  /*parameter_*/ID TILDE^ type_name 
  ;

formal_assertion_parameter_list
  :
  formal_assertion_parameter ( COMMA^ formal_assertion_parameter
     ( COMMA formal_assertion_parameter )* )?
  ;
  
assertion_function_value
  :
  (parenthesized_predicate IMP)=>
  cae=conditional_assertion_function
    -> $cae
  |
  e=assertion_expression
    -> $e
  ;

conditional_assertion_function
  :
  ( LPAREN
   cvp+=condition_value_pair ( c=COMMA cvp+=condition_value_pair 
   (COMMA cvp+=condition_value_pair)* ) 
   RPAREN )
    -> ^(CONDITIONAL_FUNCTION[$c] 
        $cvp+)
  ;

condition_value_pair
  :
  parenthesized_predicate IMP^ assertion_expression
  ;
  
assertion_enumeration
  :
  (PLUS_ARROW^ enumeration_pair (COMMA! enumeration_pair)* )  //to define the Assertion enumeration
  |
  (PLUS_ARROW^ predicate_invocation)  //to use the Assertion enumeration
  ;

enumeration_pair
  :
  /*enumeration_literal_*/ID^ IMP! predicate
  ;
  
universal_quantification
  :
  a=LITERAL_all^ logic_variables logic_variable_domain r=LITERAL_are! predicate 
  ;
  catch [RecognitionException re] {
   Dump.it("RecognitionException caught by BLESStoAST.universal_quantification");
   Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree());
    tellBNF(GrammarStrings.universalQuantification,re,$universal_quantification.tree);}

existential_quantification
  :
  e=LITERAL_exists^ logic_variables logic_variable_domain t=LITERAL_that! predicate
  ;
  catch [RecognitionException re] {Dump.it("RecognitionException caught by BLESStoAST.existential_quantification");
    tellBNF(GrammarStrings.existentialQuantification,re,$existential_quantification.tree);
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }

logic_variables 
  :  
  i+=identifier (COMMA i+=identifier)* coln=COLON aty=assertion_type 
    -> ^( $coln $aty $i+ )  
  ; 
  catch [RecognitionException re] {
    Dump.it("RecognitionException caught by BLESStoAST.logic_variables");
    tellBNF(GrammarStrings.logicVariables,re,$logic_variables.tree);
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); }

logic_variable_domain 
  :  
  i=LITERAL_in   
  ( 
    ( assertion_expression range_symbol ) => 
  l=assertion_expression rs=range_symbol r=assertion_expression 
    -> ^($i ^( $rs $l $r ) )
  | 
  predicate 
    -> ^( $i predicate )
  )   
  ; 
  catch [MismatchedTokenException re] {Dump.it("MismatchedTokenException caught by BLESStoAST.logic_variable_domain");
    Dump.it("\ntry bounding your quantification, eat less food too\n");
    tellBNF(GrammarStrings.logicVariableDomain,re,$logic_variable_domain.tree);}
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.logic_variable_domain");
    tellBNF(GrammarStrings.logicVariableDomain,re,$logic_variable_domain.tree);}
  
predicate 
  :  
  universal_quantification
  |
  existential_quantification
  | 
  subpredicate   
    ( 
    ( LITERAL_and^ subpredicate ( LITERAL_and! subpredicate )*) 
    | 
    ( LITERAL_or^ subpredicate ( LITERAL_or! subpredicate )* )   
    | 
    ( LITERAL_xor^ subpredicate ( LITERAL_xor! subpredicate )* )  
    | 
    imp=LITERAL_implies^ subpredicate    
    | 
    i=LITERAL_iff^ subpredicate   
    | 
    a=IMP^ subpredicate 
    )?  
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.predicate");
    tellBNF(GrammarStrings.predicate,re,$predicate.tree);}

subpredicate 
//  options{backtrack=true;}
  :  
  ( n=LITERAL_not )?   
  ( 
  (assertion_subexpression relation_symbol)=>  
    lhs=assertion_subexpression r=relation_symbol rhs=assertion_subexpression
     -> {n!=null}? ^( $n ^( $r $lhs $rhs ) )
    -> ^( $r $lhs $rhs )
  |  
  (assertion_subexpression LITERAL_in)=> 
//     p=assertion_subexpression i=LITERAL_in lb=assertion_expression rs=range_symbol ub=assertion_expression
//     -> {n!=null}? ^( $n ^( $i $p ^( $rs $lb $ub ) ) )
//     -> ^( $i $p ^( $rs $lb $ub ) )
    p=assertion_subexpression i=LITERAL_in ra=assertion_range
     -> {n!=null}? ^( $n ^( $i $p $ra ) )
    -> ^( $i $p $ra )
  |
  (name PLUS_EQUALS)=>
  target=/*shared_integer_*/name pe=PLUS_EQUALS /*integer_value_*/ increment=assertion_subexpression
    -> {n!=null}? //{throw new YouIdiot("You, are a very special kind of idiot to try to negate indivisible incrementing.");}
    -> ^( $pe $target $increment )
  |  
    tr=LITERAL_true   //'true' 
    -> {n!=null}? ^( $n $tr )
    -> $tr
  | fa=LITERAL_false 
    -> {n!=null}? ^( $n $fa )
    -> $fa
  | st=LITERAL_stop 
    -> {n!=null}? ^( $n $st )
    -> $st
  | (ID LPAREN)=>
    predicate_invocation 
    -> {n!=null}? ^( $n predicate_invocation )
    -> predicate_invocation
  |
  timed_predicate 
    -> {n!=null}? ^( $n timed_predicate )
    -> timed_predicate
  |
//  d=LITERAL_def definedLogicVariable=ID
  d=LITERAL_def definedLogicVariable=assertion_parameter
    -> ^($d $definedLogicVariable)
  )
  ; 
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.subpredicate");
    tellBNF(GrammarStrings.predicateAtom,re,$subpredicate.tree);}

   
timed_predicate 
  : 
  (name | parenthesized_predicate | predicate_invocation)
  (TICK^
  |  AT_SIGN^ time_subexpression  
  |  CARET^ period_shift 
  )?     
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.timed_predicate");
    tellBNF(GrammarStrings.timeExpression,re,$timed_predicate.tree);}
 
parenthesized_predicate 
  :  
  LPAREN^ predicate RPAREN  
  ; 

floatingAtom 
  : //must have floating type
  value
  ;
  
period_shift    
//  options {backtrack=true;}
  : //must have integer type
//   n=/*variable_*/name t=TICK
//   ->  ^($t $n)
//  |
  v=value// (t=TICK)?
//  -> {$t!=null}? ^($t $v)
  -> $v
  |
  m2=MINUS x=period_shift 
  -> ^(UNARY_MINUS[$m2] $x)
// |
//  lp2=LPAREN m2=MINUS x=period_shift rp2=RPAREN
//  -> ^($lp2 ^(UNARY_MINUS["-"] $x) $rp2)
  |
  lp=LPAREN ia=period_shift 
    ( mia=MINUS ia2=period_shift rp=RPAREN
    |
    dia=DIVIDE ia2=period_shift rp=RPAREN
    |
    pia=PLUS ia2=period_shift (PLUS ia3+=period_shift)* rp=RPAREN  
    |
    tia=TIMES ia2=period_shift (TIMES ia3+=period_shift)* rp=RPAREN  
    |
    rp=RPAREN
    )
  -> {mia!=null}? ^($lp ^($mia $ia $ia2) $rp)
  -> {dia!=null}? ^($lp ^($dia $ia $ia2) $rp)
  -> {pia!=null}? ^($lp ^($pia $ia $ia2 $ia3*) $rp)
  -> {tia!=null}? ^($lp ^($tia $ia $ia2 $ia3*) $rp)
  -> ^($lp $ia $rp)
  ;
  catch [RecognitionException re] 
    {
    if ((re.getUnexpectedType()==BLESStoASTLexer.TICK)||(re.getUnexpectedType()==BLESStoASTLexer.CARET))
      Dump.it("^ and ' are not allowed in integer atoms on rhs of ^");
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
    Dump.it("RecognitionException caught by BLESStoAST.period_shift");
//    tellBNF(GrammarStrings.predicateInvocation,re,$predicate_invocation.tree);
    }

predicate_invocation 
  @after {((BAST)retval.getTree()).setParseRecord(((BAST)$i.tree).getParseRecord());}
  : 
  i=identifier lp=LPAREN RPAREN
    -> ^( INVOKE[$lp,"INVOKE["+Integer.toString($lp.getLine()+startingLine)+"]"] 
        $i )
  |
  i=identifier lp=LPAREN exp=assertion_expression RPAREN
    -> ^( INVOKE[$lp,"INVOKE["+Integer.toString($lp.getLine()+startingLine)+"]"] 
        ^( $i  $exp ) )
  |
  i=identifier lp=LPAREN params+=actual_assertion_parameter ( COMMA params+=actual_assertion_parameter )*  RPAREN
    -> ^( INVOKE[$lp,"INVOKE["+Integer.toString($lp.getLine()+startingLine)+"]"] 
        ^( $i $params+) )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
  Dump.it("RecognitionException caught by BLESStoAST.predicate_invocation"+
  "\n\nDid you forget that parameters must be of the form \"formal:assertion_expression\"?");
    tellBNF(GrammarStrings.predicateInvocation,re,$predicate_invocation.tree);}

actual_assertion_parameter
  :
  formal=ID c=COLON actual=assertion_expression
    -> ^( PARAMETER[$c,"PARAMETER["+$formal.text+"]"] $formal $actual )
  ;    
    
/*
predicate_relation 
  : 
  lhs=assertion_expression 
  (
  (in=LITERAL_in ra=range)
  |
  (r=relation rhs=assertion_expression)
  )
    -> {$in!=null}? ^( $in $lhs $ra )
    -> ^( $r $lhs $rhs )
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.");
    tellBNF(GrammarStrings.predicateRelation,re);}
*/

range
  : 
  numeric_expression range_symbol^ numeric_expression
//  subexpression range_symbol^ subexpression
//  assertion_expression range_symbol^ assertion_expression
  ;
  catch [RecognitionException re] {
    Dump.it("\nDid you forget to put spaces around your range symbol?\n");
    Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.range");
    tellBNF(GrammarStrings.range,re,$range.tree);}

assertion_range
  : 
  assertion_expression range_symbol^ assertion_expression
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.assertion_range");
    tellBNF(GrammarStrings.range,re,$assertion_range.tree);}


assertion_expression 
options{backtrack=true;}
  :   
  LITERAL_sum logic_variables ( logic_variable_domain )? LITERAL_of assertion_expression 
    -> ^( LITERAL_sum logic_variables logic_variable_domain?  LITERAL_of assertion_expression  )
  |
  LITERAL_product logic_variables ( logic_variable_domain )? LITERAL_of assertion_expression
    -> ^( LITERAL_product logic_variables logic_variable_domain? LITERAL_of assertion_expression  )
  |
  LITERAL_numberof logic_variables ( logic_variable_domain )? LITERAL_that subpredicate 
    -> ^( LITERAL_numberof logic_variables logic_variable_domain?  LITERAL_that subpredicate  )
    |
  assertion_subexpression   
  ( 
  ( PLUS assertion_subexpression )+
    -> ^( PLUS assertion_subexpression+ )    
  | 
  ( TIMES assertion_subexpression )+   
    -> ^( TIMES assertion_subexpression+ )    
  | 
  MINUS assertion_subexpression   
    -> ^( MINUS assertion_subexpression+ )    
  | 
  DIVIDE assertion_subexpression    
    -> ^( DIVIDE assertion_subexpression+ )    
  | 
  EXP assertion_subexpression    
    -> ^( EXP assertion_subexpression+ )    
  | 
  LITERAL_mod assertion_subexpression  
    -> ^( LITERAL_mod assertion_subexpression+ )
  |
  LITERAL_rem assertion_subexpression  
    -> ^( LITERAL_rem assertion_subexpression+ )
  | //or just one assertion_subexpression
    -> assertion_subexpression
  )
  ; 
//  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
//     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.assertion_expression");
//    tellBNF(GrammarStrings.predicateExpression,re,$assertion_expression.tree);}


assertion_subexpression 
  : 
  ( m=MINUS | abs=LITERAL_abs )? 
//  ( 
//  ps=/*property_set*/identifier dc=DOUBLE_COLON pi=/*property_value*/identifier
//    -> {m!=null}? ^( UNARY_MINUS[$m] ^($dc $ps $pi) )
//    -> ^($dc $ps $pi)  
/*    
  |
  fc=function_call   
    -> {m!=null}? ^( UNARY_MINUS[$m] $fc )
    -> $fc 
  | 
  sl=AADL_STRING_LITERAL 
    -> $sl 
  | 
  nl=NUMERIC_LIT
    -> {m!=null}? ^( UNARY_MINUS[$m] $nl )
    ->  $nl 
  |
  now=LITERAL_now
    -> {m!=null}? ^( UNARY_MINUS[$m] $now )
    -> $now 
  |
  tops=LITERAL_tops
    -> {m!=null}? ^( UNARY_MINUS[$m] $tops )
    -> $tops 
 */   
//  |
  ts=timed_expression
    -> {m!=null}? ^( UNARY_MINUS[$m] $ts )
    -> {abs!=null}? ^( $abs $ts )
    -> $ts 
//  |
//  d=LITERAL_def definedLogicVariable=ID
//  d=LITERAL_def definedLogicVariable=assertion_parameter
//    -> ^($d $definedLogicVariable)
//  )
  |  atc=assertion_type_conversion
    -> $atc
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); Dump.it("RecognitionException caught by BLESStoAST.assertion_subexpression");
    tellBNF(GrammarStrings.predicateSubexpression,re,$assertion_subexpression.tree);}


timed_expression
  :
  vpa
  (TICK^
  |  AT_SIGN^ time_subexpression  
  |  CARET^ period_shift 
  )?     
  ;

vpa
  :
  v=value 
  | 
  parenthesized_assertion_expression 
  | 
  assertion_function_invocation
  ;

time_expression
  :
  lhs=time_subexpression
  (
  (sym=PLUS^ rhs+=time_subexpression ( PLUS rhs+=time_subexpression)* )
  |
  (sym=TIMES^ rhs+=time_subexpression ( TIMES rhs+=time_subexpression)* )
  |
  (sym=MINUS^ rhs+=time_subexpression )
  |
  (sym=DIVIDE^ rhs+=time_subexpression )
  |
  (sym=EXP^ rhs+=time_subexpression )
  |
  (sym=LITERAL_mod^ rhs+=time_subexpression )
  |
  (sym=LITERAL_rem^ rhs+=time_subexpression )
  )?
  ;
  
time_subexpression
  :
  (um=MINUS)?
  ( val=value
  | afi=assertion_function_invocation 
  | lp=LPAREN exp=time_expression rp=RPAREN
  )
    -> {(um!=null)&&(val!=null)}? ^(UNARY_MINUS[$um] $val)
    -> {(um!=null)&&(afi!=null)}? ^(UNARY_MINUS[$um] $afi)
    -> {(um!=null)&&(lp!=null)}? ^(UNARY_MINUS[$um] ^($lp $exp $rp))
    -> {val!=null}? $val
    -> {afi!=null}? $afi
    -> ^($lp $exp $rp)
  ;
    
assertion_function_invocation
  :
  assertion_function_identifier=ID lp=LPAREN actual=assertion_expression? RPAREN
    -> ^( INVOKE_FUNCTION[$lp,"INVOKE_FUNCTION["+Integer.toString($lp.getLine()+startingLine)+"]"] 
        ^( $assertion_function_identifier  $actual? ) )
	|    
  assertion_function_identifier=ID lp=LPAREN 
    list+=actual_assertion_parameter ( COMMA list+=actual_assertion_parameter )* RPAREN
    -> ^( INVOKE_FUNCTION[$lp,"INVOKE_FUNCTION["+Integer.toString($lp.getLine()+startingLine)+"]"] 
        ^( $assertion_function_identifier  $list+ ) )
  ;
  catch [RecognitionException re] 
  {Dump.it("Did you forget the formal identifier when invoking an assertion-function?");
  Dump.it("actual_assertion_parameter ::= formal_identifier : actual_assertion_expression"); 
  throw re;}    
    
parenthesized_assertion_expression
  :
  (LPAREN LITERAL_if | LPAREN predicate QQ)=>
  cpe=conditional_assertion_expression
    -> $cpe
  |
  (LPAREN ID ARROW)=>
  art=assertion_record_term
    -> $art  
  |  
  (LPAREN parenthesized_predicate IMP)=>
  caf=conditional_assertion_function 
    -> $caf 
  |
  lp=LPAREN pe=assertion_expression rp=RPAREN
    -> ^($lp $pe $rp)
  ;

conditional_assertion_expression
  :
  LPAREN LITERAL_if p=predicate then=LITERAL_then t=/*true*/assertion_expression LITERAL_else f=/*false*/assertion_expression RPAREN
    -> ^(CONDITIONAL[$then] $p $t $f)
  |
  LPAREN p=predicate q=QQ t=/*true*/assertion_expression COLON f=/*false*/assertion_expression RPAREN
    -> ^(CONDITIONAL[$q] $p $t $f)
  ;
 
assertion_record_term
  :
    LPAREN^ assertion_record_value+ RPAREN
  ;

assertion_record_value
  :
  ID ARROW^ value SEMICOLON!
  ;

assertion_parameter
  :
  ID //( TILDE^ assertion_type )?
  ;  

assertion_type
  :
  LITERAL_boolean | LITERAL_natural | LITERAL_integer | LITERAL_rational | LITERAL_real | LITERAL_complex
 | LITERAL_time
//  | ID  //type identifier
  | unique_component_classifier_reference
  ;
       
//////////////// AVAILABILITY SPECIFICATION LANGUAGE //////////////////////////////

availability 
  : 
  LITERAL_availability^  availability_subexpression
  ;
  
availability_expression 
  : 
  ae+=availability_subexpression
  (
    ( dna=LITERAL_and ae+=availability_subexpression )+
    |
    ( ro=LITERAL_or ae+=availability_subexpression )+
    |
    ( rox=LITERAL_xor ae+=availability_subexpression )+    
  )?
    -> {dna!=null}? ^($dna $ae+)
    -> {ro!=null}? ^($ro $ae+)
    -> {rox!=null}? ^($rox $ae+)
    -> $ae
  ;

availability_subexpression 
  :
  ( n=LITERAL_not )?
  ( 
  id=/*product_line_engieering_*/identifier
  |
  l=LPAREN ae=availability_expression RPAREN
  )
    -> {n!=null&&id!=null}? ^($n $id)
    -> {n!=null&&ae!=null}? ^($n ^($l $ae) )
    -> {ae!=null}? ^($l $ae)
    -> $id
  ; 


//////////////// DISPATCH CONDITION SPECIFICATION LANGUAGE //////////////////////////////

dispatch_condition 
  : 
  'on'! LITERAL_dispatch^  dispatch_expression? 
//  'on'! LITERAL_dispatch^  dispatch_logical_expression? 
  ;
  catch [RecognitionException re] {Dump.it("error token text=\""+retval.start.getText()+"\"");
     reportError(re,(BAST)retval.getTree()); 
    Dump.it("RecognitionException caught by BLESStoAST.dispatch_condition");
    tellBNF(GrammarStrings.dispatchCondition,re,$dispatch_condition.tree);}

dispatch_expression
  :
  dc=dispatch_conjunction ( o=LITERAL_or dc2+=dispatch_conjunction )*
    -> {o!=null}? ^($o $dc $dc2+)
    -> $dc
  ;

dispatch_conjunction
  :
  dt=dispatch_trigger ( a=LITERAL_and dt2+=dispatch_trigger )*
    -> {a!=null}? ^($a $dt $dt2)
    -> $dt  //just one dispatch trigger in parentheses-> strip them
//  dt=dispatch_trigger
//    -> $dt 
//  |
//  lp=LPAREN dt=dispatch_trigger ( a=LITERAL_and dt2+=dispatch_trigger )+ rp=RPAREN
//    -> {a!=null}? ^($lp ^($a $dt $dt2) $rp)
//    -> $dt  //just one dispatch trigger in parentheses-> strip them
  ;

//port index added 4/17/2022
dispatch_trigger 
  :
//    (LITERAL_timeout LPAREN)=>
  LITERAL_timeout^ LPAREN /*in_event_port_ or in_event_data_port*/identifier+ RPAREN  behavior_time 
  |
  LITERAL_timeout^ 
  |
  /*in_event_port_ or in_event_data_port*/identifier
  |
  stop=LITERAL_stop
    -> $stop
  ;
  
/*      
dispatch_logical_expression 
  : 
  dt+=dispatch_trigger
  (
    ( dna=LITERAL_and dt+=dispatch_trigger )+
    |
    ( ro=LITERAL_or dt+=dispatch_trigger )+
    |
    ( rox=LITERAL_xor dt+=dispatch_trigger )+    
  )?
    -> {dna!=null}? ^($dna $dt+)
    -> {ro!=null}? ^($ro $dt+)
    -> {rox!=null}? ^($rox $dt+)
    -> $dt
  |
  stop=LITERAL_stop
    -> $stop
  ;
  catch [RecognitionException re] {Dump.it("RecognitionException caught by BLESStoAST.dispatch_logical_expression");
    tellBNF(GrammarStrings.dispatchLogicalExpression,re,$dispatch_logical_expression.tree);}

dispatch_trigger 
  :
  ( LITERAL_not^ )? dispatch_trigger_stub
  |
  LITERAL_timeout^ ( LPAREN /*in_event_port_ or in_event_data_port*//*identifier+ RPAREN behavior_time)?
  ; 
  catch [RecognitionException re] 
    {
    Dump.it("Which event (data) ports will reset this timeout?");
    Dump.it("Could you have forgotten to list time-resetting ports within parentheses?\n");
    Dump.it("RecognitionException caught by BLESStoAST.dispatch_trigger");
    tellBNF(GrammarStrings.dispatchTrigger,re,$dispatch_trigger.tree);
    }  //end of catch dispatch_trigger

dispatch_trigger_stub
  : 
  /*in_event_port_ or in_event_data_port*//*identifier^ 
    ( LPAREN! ( value_constant | 'others' ) RPAREN! )?
  |
  LPAREN^ dispatch_logical_expression RPAREN!
  |
  counting_trigger
  ;
  catch [RecognitionException re] {Dump.it("RecognitionException caught by BLESStoAST.dispatch_trigger_stub");
    tellBNF(GrammarStrings.dispatchTrigger,re,$dispatch_trigger_stub.tree);}


counting_trigger 
  : 
  il=integer_literal ( om='ormore' | ol='orless' )?
    lp=LPAREN dt+=dispatch_trigger ( COMMA dt+=dispatch_trigger )+ rp=RPAREN
    -> ^(COUNTING_TRIGGER $il $om? $ol? $lp $dt+ $rp)
  ;
*/
////////////////////////////AADL COMPONENT///////////////////////////////////////////////
//component_type ::=  
//  component_category defining_component_type_identifier 
//  [ prototypes ( { prototype }+ | none_statement ) ]  
//  [ features ( { feature }+ | none_statement ) ] 
//  [ flows ( { flow_spec }+ | none_statement ) ] 
//  [ modes_subclause | requires_modes_subclause ]
//  [ properties (  
//    { component_type_property_association | contained_property_association  }+  
//    | none_statement ) ] 
//  { annex_subclause }* 
//  end defining_component_type_identifier ;

/*
calls_clause
  :
  c=LITERAL_calls LPAREN (x+=~RPAREN)+ RPAREN
    -> ^($c $x+) 
  ;

flows_clause
  :
  f=LITERAL_flows LPAREN (x+=~RPAREN)+ RPAREN
    -> ^($f $x+) 
  ;
*/  


//in_modes ::= in modes ( mode_identifier { , mode_identifier }* )
in_modes 
  :
  LITERAL_in^ LITERAL_modes
  LPAREN!
  /*mode_*/identifier ( COMMA! /*mode_*/identifier )*
  RPAREN!
  ; 



//package_or_component
//  :
//  package_spec | component_type | component_implementation
//  ;  

