package com.multitude.bless.exceptions;


//strings holding AS5506A-style bnf

//created 1/3/99 brl to hold string literals for reporting syntax errors
//conveted for BLESS grammar 10/5/2009 brl

  public class
GrammarStrings
{

  //4
  public static final String 
assertionAnnexSubclause ="assertion_annex_subclause ::=" +
      " { Assertion }+ | predicate";
    
  //4
  public static final String 
assertionAnnexLibrary ="assertion_annex_library ::=" +
      " { Assertion }+ "+
      "\nDo you have << >> around all your Assertions?";
  
  //4
  public static final String 
AssertionBNF ="Assertion ::= << assertion_body >> ";    
  
  //4
  public static final String 
assertionBody ="assertion_body ::= \n"+
"   label_identifier : \n"+
"   { parameter_identifier }* \n"+
"   ( : predicate | := predicate_expression ) \n"+
"   | predicate";

  //4.1
  public static final String
  predicate="predicate ::= \n"+
"universal_quantification | existential_quantification | \n"+
"predicate_atom \n"+
"  [ \n"+
"  { and predicate_atom }+ \n"+
"  | \n"+
"  { or predicate_atom }+ \n"+
"  | \n"+
"  { xor predicate_atom }+ \n"+
"  | implies predicate_atom \n"+
"  | iff predicate_atom \n"+
"  | => predicate_atom ]";

  //4.1
  public static final String
  predicateAtom = "predicate_atom ::= [ not ] ( true | false | predicate_invocation | predicate_relation "+
      "| parenthesized_predicate [ time_expression ] | name [ time_expression ] )"; 
  
  //4.2
  public static final String
  timeExpression = "time_expression ::= � | @ subexpression | � integer_value"; 
    
  //4.3
  public static final String
  predicateInvocation = "predicate_invocation ::=   id() | id(e) | id(l1:e1, l2:e2, ... ) ";  
    
  //4.4
  public static final String
  predicateRelation = "predicate_relation ::= predicate_expression ( in range | relation predicate_expression ) ";  
    
  //4.4
  public static final String
  relation = "relation ::= = | != | < | > | <= | >= ";  
    
  //4.4
  public static final String
  range = "range ::= predicate_expression .. predicate_expression"; 

  //4.5
  public static final String
  universalQuantification = "universal_quantification ::= all logic_variables logic_variable_domain are predicate"; 
  
  //4.5
  public static final String
  logicVariables = "logic_variables ::= identifier , identifier * : type";  
  
  //4.5
  public static final String
  logicVariableDomain = "logic_variable_domain ::= in ( expression .. expression | predicate )";  
  
  //4.6
  public static final String
  existentialQuantification = "existential_quantification ::= exists logic_variables logic_variable_domain that predicate ";  
  
  //4.7
  public static final String
  predicateExpression = "predicate_expression ::= \n"+
"   sum logic_variables logic_variable_domain \n"+
"   of predicate_expression \n"+
"   | product logic_variables logic_variable_domain \n"+
"   of predicate_expression \n"+
"   | numberof logic_variables logic_variable_domain \n"+
"   that predicate_atom \n"+
"   | predicate_subexpression \n"+
"   [ \n"+
"   { + predicate_subexpression }* \n"+
"   | \n"+
"   { * predicate_subexpression }* \n"+
"   | - predicate_subexpression \n"+
"   | / predicate_subexpression \n"+
"   | ** predicate_subexpression \n"+
"   | mod predicate_subexpression \n"+
"   | rem predicate_subexpression ] ";
  
  //4.7
  public static final String
  predicateSubexpression  = "predicate_subexpression ::= \n"+
"   [ - | not ] \n"+
"   ( ( variable_name | port_name ) [ time_expression ] \n"+
"   | assertion_function_identifier ( [ parameter_list ] ) \n"+
"   | ( predicate_expression ) [ time_expression ] \n"+
"   | now \n"+
"   | string_literal \n"+
"   | numeric_literal ) ";
  
  //4.7
  public static final String
  parameterList = "parameter_list ::= expression_or_range { , expression_or_range }*";
  
  //4.7
  public static final String
  expressionOrRange = "expression_or_range ::= expression [ .. expression]";

  //5
  public static final String  
  subprogramBehavior = "subprogram_behavior ::= [ availability ] [ pre predicate ] [ post predicate ] \n"+
    "   existential_lattice_quantification ";
  
  //5.1
  public static final String  
  elq ="existential_lattice_quantification ::= [ quantified_variables ] { behavior_actions } ";
  
  //5.1
  public static final String  
  quantifiedVariables ="variables ::= variables { quantified_variable }+";  
  
  //5.1
  public static final String  
  quantifiedVariable ="quantified_variable ::= variable_identifier : type [ := expression ] ; ";  
  
  //5.2
  public static final String  
  behaviorActions="behavior_actions ::= asserted_action | sequential_composition | concurrent_composition \n"+
    "sequentialComposition ::= asserted_action {; asserted_action}+ \n"+
    "concurrentComposition ::= asserted_action {& asserted_action}+ ";
  
  //5.3
  public static final String  
  assertedAction="asserted_action ::= [ precondition_Assertion ] action [ postcondition_Assertion ] ";
  
  //5.4
  public static final String  
  action = "action ::= \n"+
"  basic_action \n"+
"  | alternative \n"+
"  | while_loop \n"+
"  | for_loop \n"+
"  | do_until_loop\n"+ 
"  | existential_lattice_quantification \n"+
"  | universal_lattice_quantification";
  
  //5.7
  public static final String  
  alternative = "alternative ::= if [ availability ] guarded_action [] guarded_action + fi";

  //5.7
  public static final String  
  guardedAction = "guarded_action ::= ( boolean_expression )-> asserted_action";
  
  //5.8
  public static final String
  ulq = "universal_lattice_quantification ::= forall quantified_variable_identifier"+
    ": type in range [ availability ] existential_lattice_quantification ";

  //5.9
  public static final String
  whileLoop = "while_loop ::= while ( boolean_expression_or_relation ) [ availability ] "+
    "[ invariant Assertion ] [ bound boolean_expression ] \n  existential_lattice_quantification";
  
  //5.9
  public static final String
  doUntilLoop = "do_until_loop ::= do [ availability ] [ invariant Assertion ] "+
    "[ bound integer_expression ]\n  existential_lattice_quantification until( boolean_expression ) ";
  
  //5.9
  public static final String
  forLoop = "for_loop ::= for ( integer_identifier in integer_expression .. integer_expression ) "+
    "[ availability ] [ invariant Assertion ] \n  existential_lattice_quantification ";
  
  //5.10 & 6.5
  public static final String
  basicAction = "basic_action ::= skip | name := expression | communication_action | timed_action | setmode mode_identifier ";
  
  //5.11
  public static final String
  expression = "expression ::= subexpression \n"+
"  [ { + numeric_subexpression }+ \n"+
"  | { * numeric_subexpression }+ \n"+
"  | - numeric_subexpression \n"+
"  | / numeric_subexpression \n"+
"  | mod natural_subexpression \n"+
"  | rem integer_subexpression \n"+
"  | ** numeric_subexpression \n"+
"  | { and boolean_subexpression }+ \n"+
"  | { or boolean_subexpression }+ \n"+
"  | { xor boolean_subexpression }+ \n"+
"  | cand boolean_subexpression \n"+
"  | cor boolean_subexpression ] ";

  //5.11
  public static final String
  subexpression = "subexpression ::= [ - | not ] { value | ( expression_or_relation ) } ";
  
  //5.11
  public static final String
  expressionOrRelation = "expression_or_relation ::= expression [ relation_symbol expression ] ";
  
  //5.13
  public static final String
  name = "name ::= identifier [ [ parameter_list ] ] {\'.\' identifier [ [ parameter_list ] ]}* ";
  
  //5.14
  public static final String
  functionCall = "function_call ::= { package_identifier :: }* function_identifier ( [ parameter_list ] ) ";
  
  //6
  public static final String
  threadBehavior = "thread_behavior ::=\n [ availability ]\n [ assert_clause ]\n"+
     " [ invariant_clause ]\n [ variables ]\n \'states\' ( behavior_state )+ \n [ transitions ] ";
  
  //6.1
  public static final String
  behaviorState = "behavior_state ::= behavior_state_identifier "+
    "{ , behavior_state_identifier }* : [ \'initial\' | \'complete\' | \'final\' ] \'state\' [ Assertion ] ; ";
  
  //6.2
  public static final String
  variables = "variables ::= \'variables\' { behavior_variable }+ ";
  
  //6.2
  public static final String
  behaviorVariable = "behavior_variable ::= behavior_variable_identifier {\',\' behavior_variable_identifier}+"+
    "\':\' ( [ 'persistent' ] type [ ':=' expression ] | 'shared' unique_component_classifier_reference ) ; ";
  
  //6.3
  public static final String
  transitions = "transitions ::= 'transitions' { behavior_transition }+ ";
  
  //6.3
  public static final String
  behaviorTransition = "behavior_transition ::= \n"+
  "[ behavior_transition_label : ] \n"+
  "source_state_identifier \n"+
  "{ , source_state_identifier }* \n"+
  "-[ behavior_condition ]-> destination_state_identifier \n"+
  "[ { behavior_actions } ] [ Assertion ] ; ";

  //6.4
  public static final String
  dispatchCondition = "dispatch_condition ::= 'on' 'dispatch' [ dispatch_logical_expression ] ";
  
  //6.4
  public static final String
  dispatchLogicalExpression = "dispatch_logical_expression ::= ( dispatch_trigger \n"+
    "[ { and dispatch_trigger }+ | { or dispatch_trigger }+ | { xor dispatch_trigger + ] )\n"+
    "| stop ";
  
  //6.4
  public static final String
  dispatchTrigger = "dispatch_trigger ::= [ not ] ( ( dispatch_logical_expression ) |"+
    "input_event_port_identifier [ ( ( value_constant | others ) ) ] | integer_literal"+
    "[ ormore | orless ] ( dispatch_trigger { , dispatch_trigger }+ ) ) | timeout [ behavior_time ]" +
    " 'timeout'^ ( LPAREN /*in_event_port_ or in_event_data_port*/identifier+ RPAREN behavior_time)?";
  
  //6.7
  public static final String
  communicationAction = "communication_action ::= \n"+
    "output_port_name ! [ ( expression ) ] \n"+
    "| input_port_name ? [ ( target ) ] \n"+
    "| requires_subprogram_identifier ( [ variable_list ] ) ";

  //6.12
  public static final String
  value = "value ::= function_call | variable_name | numeric_literal | "+
    "string_literal | true | false | null | timeout | port_value |"+
    "in mode ( { mode_identifier }+ ) | property_constant ";

  //6.12
  public static final String
  propertyConstant = "property_constant ::= property_set_identifier :: property_constant_identifier";
  
  //7
  public static final String
  type = "type ::= type_name | enumeration_type | units_type | number_type | array_type | record_type | variant_type";
  
  //7.1
  public static final String
  typeName = "type_name ::= { package_identifier :: }* data_component_identifier [ . implementation_identifier ] ";   
  
  //7.2
  public static final String
  enumerationType = "enumeration_type ::= enumeration ( identifier { , identifier }+ ) ";
  
  //7.3
  public static final String
  unitsType = "units_type ::= units units_list";
  
  //7.3
  public static final String
  unitsList = "units_list ::= ( defining_unit_identifier { , another_unit }* ) ";
  
  //7.3
  public static final String
  anotherUnit = "another_unit ::= defining_unit_identifier => unit_identifier * numeric_literal ";
  
  //7.3
  public static final String
  unitsDesignator = "units_designator ::= units_unique_property_type_identifier | units_list";
  
  //7.4
  public static final String
  numberType = "number_type ::= type_name [ range ] [ units units_designator ]";
  
  //7.5
  public static final String
  arrayType = "array_type ::= array [ array_range_list ] of type";
  
  //7.5
  public static final String
  arrayRangeList = "array_range_list ::= natural_range { , natural_range }* ";
  
  //7.5
  public static final String
  naturalRange = "natural_range ::= positive_integer_literal | "+
    "( natural_literal | natural_identifier ) .. ( natural_literal | natural_identifier ) ";

//ENUMERATION RANGE REMOVED 
  //7.5
//  public static final String
//  enumerationRange = "enumeration_range ::= enumeration_literal_identifier .. enumeration_literal_identifier";
  
  //7.6
  public static final String
  recordType = "record_type ::= record ( { record_field }+ ) ";
  
  //7.6
  public static final String
  recordField = "record_field ::= defining_field_identifier : type ; ";
  
  //7.7
  public static final String
  variantType = "variant_type ::= variant [ discriminant_identifier ] ( { record_field }+ ) ";
  
  //7.8
  public static final String
  typeDeclaration = "type_declaration ::= type_identifier : 'type' type ;";
  
  
  //7.9
  public static final String
  typeOperator = "type_operator ::= type_identifier [ type_parameter_identifier+ ] : 'type' type ;";
  
  public static final String
  typeOperatorInvocation = "type_operator_invocation ::= type_operator_identifier [ type { , type }* ] ";
  
  //8
  public static final String
  feature = "feature ::= \n"+
    "( abstract_feature_spec |\n"+
    "  port_spec |\n"+
    "  feature_group_spec |\n"+
    "  subcomponent_access_spec |\n"+
    " parameter_spec )\n"+
    "[ array_dimension ]\n"+
    "[ { { feature_contained_property_association }+ } ] ;";  
  
//AADL component grammar  
  public static final String
  portType ="event port | data port | event data port";  
  
  public static final String
  propertyAssociation ="BLESS::Assertion=>\" \"";  
  
  public static final String
  assertClause ="'assert' assertion+";  
  
  public static final String
  invariantClause ="'invariant' assertion";  
  
  public static final String
subcomponent = "subcomponent . . .";  
  
} //end of GrammarStrings



