package com.multitude.aadl.bless.validation;

public interface IssueCodes
	{
	String PREFIX = "com.multitude.aadl.bless.validation.";

	String INVALID_TYPE_RANGE = PREFIX + "InvalidTypeRange";
	String INVALID_QUANTITY_RANGE = PREFIX + "InvalidQuantityRange";
	String RANGE_BOUNDS_MUST_BE_NATURAL = PREFIX + "RnageBoundsMustBeNatural";
	String TYPE_MUST_BE_BOOLEAN = PREFIX + "TypeMustBeBoolean";
	String TYPE_NOT_ARRAY = PREFIX + "TypeNotArray";
	String INDICES_DONT_MATCH_ARRAY_DIMENSION = PREFIX + "IndicesDontMatchArrayDimension";
	String VARIANT_TYPES_DISCOURAGED = PREFIX + "VariantTypesDiscouraged";
	String MUST_HAVE_RECORD_TYPE = PREFIX + "MustHaveRecordType";
	String INCOMPATIBLE_TYPES = PREFIX + "IncompatibleTypes";
	String INCOMPATIBLE_UNITS = PREFIX + "IncompatibleUnits";
	String MUST_HAVE_INDEX_TYPE = PREFIX + "MustHaveIndexType";
	String MUST_HAVE_TIME_UNITS = PREFIX + "MustHaveTimeUnits";
	String PRODUCT_QUANTIFICATION_MUST_BE_SCALAR = PREFIX + "ProductQuantificationMustBeScalar";
	String MISMATCHED_UNITS = PREFIX + "MismatchedUnits";
	String EXPONENTIATION_WARNING = PREFIX + "ExponentiationWarning";
	String INDETERMINATE_UNITS = PREFIX + "IndeterminateUnits";
	String NOT_YET_IMPLEMENTED = PREFIX + "NotYetImplemented";
	String MUST_HAVE_ENUM_TYPE = PREFIX + "MustHaveEnumerationType";
	String LABEL_NOT_IN_ENUM_TYPE = PREFIX + "LabelNotInEnumerationType";
	String MUST_BE_WHOLE_NUMBER = PREFIX + "MustBeWholeNumber";
	String MUST_BE_SCALAR = PREFIX + "MustBeScalar";
  String MUST_BE_QUANTITY = PREFIX + "MustBeQuantity";
  String MUST_NOT_BE_NULL = PREFIX + "MustNotBeNull";
	String SIMULTANEOUS_ASSIGNMENT = PREFIX + "SimultaneousAssignment";
	String MISSING_BLESS_TYPED_PROPERTY = PREFIX + "MissingBlessTypedProperty";
  String UNIT_DEFINITION_NOT_FOUND = PREFIX + "UnitDefinitionNotFound";
  String MUST_NOT_BE_BOOLEAN = PREFIX + "MustNotBeBoolean";
  String NULL_TYPE_DECLARATION_DISALLOWED = PREFIX + "NullTypeDeclarationDisallowed";
  String LOOP_INVARIANTS_MUST_BE_NAMELESS = PREFIX + "LoopInvariantsMustBeNameless";
  String PORT_INPUT_MUST_TARGET_VARIABLE = PREFIX + "PortInputMustTargetVariable";
  String PORT_INPUT_NOT_ALLOWED = PREFIX + "PortInputNotAllowed";
  String ASSERTION_ENUMERATION_INVOCATION_NOT_ALLOWED = PREFIX + "AssertionEnumerationInvocationNotAllowed";
  String ILLEGAL_TIME_OPERATOR = PREFIX + "IllegalTimeOperator";
  String COMBINABLE_OPERATION_TARGET_MUST_BE_SHARED = PREFIX + "CombinableOperationTargetustBeShared";
  String SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_HAVE_FORMAL = PREFIX + "SubprogramCallExpressionParameterMustHaveFormal";
  String SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_BE_IN = PREFIX + "SubprogramCallExpressionParameterMustBeIn";
  String MISSING_RECORD_FIELD_LABEL = PREFIX + "MissingRecordFieldLabel";
  String UNASSIGNED_RECORD_FIELD_LABEL = PREFIX + "UnassignedRecordFieldLabel";
  String TIMED_INVOCATION_PARAMETERS = PREFIX + "TimedInvocationParameters";
  String DUPLICATE_TRANSITION_LABEL = PREFIX + "DuplicateTransitionLabel";
  String PORT_VALUE_IN_EXPRESSION_HAS_Q = PREFIX + "PortValueInExpressionHasQ";
  String SUBPROGRAMS_HAVE_PARAMETERS = PREFIX + "SubprogramsHaveParameters";
  String SUBPROGRAMS_USED_AS_FUNCTIONS = PREFIX + "SubprogramsUsedAsFunctions";
  String ASSIGNMENT_TO_IN_FEATURE = PREFIX + "AssignmentToInFeature";
  String PORT_ARRAY_INDEX_ERROR = PREFIX + "PortArrayIndexError";
  String NEEDS_QUESTION_MARK = PREFIX + "NeedsQuestionMark";
  String PLUS_EQUALS_ERROR = PREFIX + "PlusEqualsError";
  String FEATURE_TYPED_ERROR = PREFIX + "FeatureTypedError";
  String UNINITIALIZED_VARIABLE = PREFIX + "UninitializedVariable";

	}
