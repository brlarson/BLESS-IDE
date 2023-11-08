package com.multitude.aadl.bless.validation;

public interface IssueCodes
  {
  String PREFIX = "com.multitude.aadl.bless.validation.";

  String ASSERTION_ENUMERATION_INVOCATION_NOT_ALLOWED = PREFIX + "AssertionEnumerationInvocationNotAllowed";
  String ASSERTION_INVOCATION = PREFIX + "AssertionInvocation";
  String ASSIGNMENT_TO_IN_FEATURE = PREFIX + "AssignmentToInFeature";
  String COMBINABLE_OPERATION_TARGET_MUST_BE_SHARED = PREFIX + "CombinableOperationTargetustBeShared";
  String DUPLICATE_TRANSITION_LABEL = PREFIX + "DuplicateTransitionLabel";
  String EXPONENTIATION_WARNING = PREFIX + "ExponentiationWarning";
  String FEATURE_TYPED_ERROR = PREFIX + "FeatureTypedError";
  String ILLEGAL_TIME_OPERATOR = PREFIX + "IllegalTimeOperator";
  String INCOMPATIBLE_TYPES = PREFIX + "IncompatibleTypes";
  String INCOMPATIBLE_UNITS = PREFIX + "IncompatibleUnits";
  String INDETERMINATE_UNITS = PREFIX + "IndeterminateUnits";
  String INDICES_DONT_MATCH_ARRAY_DIMENSION = PREFIX + "IndicesDontMatchArrayDimension";
  String INVALID_QUANTITY_RANGE = PREFIX + "InvalidQuantityRange";
  String INVALID_TYPE_RANGE = PREFIX + "InvalidTypeRange";
  String LABEL_NOT_IN_ENUM_TYPE = PREFIX + "LabelNotInEnumerationType";
  String LOOP_INVARIANTS_MUST_BE_NAMELESS = PREFIX + "LoopInvariantsMustBeNameless";
  String MISMATCHED_UNITS = PREFIX + "MismatchedUnits";
  String MISSING_BLESS_TYPED_PROPERTY = PREFIX + "MissingBlessTypedProperty";
  String MISSING_RECORD_FIELD_LABEL = PREFIX + "MissingRecordFieldLabel";
  String MUST_BE_QUANTITY = PREFIX + "MustBeQuantity";
  String MUST_BE_SCALAR = PREFIX + "MustBeScalar";
  String MUST_BE_WHOLE_NUMBER = PREFIX + "MustBeWholeNumber";
  String MUST_HAVE_ENUM_TYPE = PREFIX + "MustHaveEnumerationType";
  String MUST_HAVE_INDEX_TYPE = PREFIX + "MustHaveIndexType";
  String MUST_HAVE_RECORD_TYPE = PREFIX + "MustHaveRecordType";
  String MUST_HAVE_TIME_UNITS = PREFIX + "MustHaveTimeUnits";
  String MUST_NOT_BE_BOOLEAN = PREFIX + "MustNotBeBoolean";
  String MUST_NOT_BE_NULL = PREFIX + "MustNotBeNull";
  String NEEDS_QUESTION_MARK = PREFIX + "NeedsQuestionMark";
  String NOT_YET_IMPLEMENTED = PREFIX + "NotYetImplemented";
  String NOW_IN_NAMED_ASSERTION = PREFIX + "NowInNamedAssertion";
  String NULL_TYPE_DECLARATION_DISALLOWED = PREFIX + "NullTypeDeclarationDisallowed";
  String PLUS_EQUALS_ERROR = PREFIX + "PlusEqualsError";
  String PORT_ARRAY_INDEX_ERROR = PREFIX + "PortArrayIndexError";
  String PORT_INPUT_MUST_TARGET_VARIABLE = PREFIX + "PortInputMustTargetVariable";
  String PORT_INPUT_NOT_ALLOWED = PREFIX + "PortInputNotAllowed";
  String PORT_INPUT_WRONG_TYPE = PREFIX + "PortInputWrongType";
  String PORT_OUTPUT_HAS_PARAMETER = PREFIX + "PortOutputHasParameter";
  String PORT_OUTPUT_LACKS_PARAMETER = PREFIX + "PortOutputLacksParameter";
  String PORT_OUTPUT_NOT_ALLOWED = PREFIX + "PortOutputNotAllowed";
  String PORT_OUTPUT_WRONG_TYPE = PREFIX + "PortOutputWrongType";
  String PORT_VALUE_IN_EXPRESSION_HAS_Q = PREFIX + "PortValueInExpressionHasQ";
  String PRODUCT_QUANTIFICATION_MUST_BE_SCALAR = PREFIX + "ProductQuantificationMustBeScalar";
  String RANGE_BOUNDS_MUST_BE_NATURAL = PREFIX + "RnageBoundsMustBeNatural";
  String SIMULTANEOUS_ASSIGNMENT = PREFIX + "SimultaneousAssignment";
  String SUBPROGRAMS_HAVE_PARAMETERS = PREFIX + "SubprogramsHaveParameters";
  String SUBPROGRAMS_USED_AS_FUNCTIONS = PREFIX + "SubprogramsUsedAsFunctions";
  String SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_BE_IN = PREFIX + "SubprogramCallExpressionParameterMustBeIn";
  String SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_HAVE_FORMAL = PREFIX + "SubprogramCallExpressionParameterMustHaveFormal";
  String TIMED_INVOCATION_PARAMETERS = PREFIX + "TimedInvocationParameters";
  String TYPE_MUST_BE_BOOLEAN = PREFIX + "TypeMustBeBoolean";
  String TYPE_NOT_ARRAY = PREFIX + "TypeNotArray";
  String UNASSIGNED_RECORD_FIELD_LABEL = PREFIX + "UnassignedRecordFieldLabel";
  String UNINITIALIZED_VARIABLE = PREFIX + "UninitializedVariable";
  String UNIT_DEFINITION_NOT_FOUND = PREFIX + "UnitDefinitionNotFound";
  String VARIANT_TYPES_DISCOURAGED = PREFIX + "VariantTypesDiscouraged";
  String WHOLE_QUANTITY_LITERAL = PREFIX + "WholeQuantityLiteral";
  String UNIT_QUANTITY_LITERAL = PREFIX + "UnitQuantityLiteral";

  }
