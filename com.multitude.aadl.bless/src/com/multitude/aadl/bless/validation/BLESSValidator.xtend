/*
 * (C) Multitude Corporation 2022
 */
package com.multitude.aadl.bless.validation

import com.google.inject.Inject
import com.multitude.aadl.bless.BlessControl
import com.multitude.aadl.bless.bLESS.ANumber
import com.multitude.aadl.bless.bLESS.AddSub
import com.multitude.aadl.bless.bLESS.ArrayRange
import com.multitude.aadl.bless.bLESS.ArrayType
import com.multitude.aadl.bless.bLESS.AssertionFunctionValue
import com.multitude.aadl.bless.bLESS.AssertionNumericExpression
import com.multitude.aadl.bless.bLESS.Assignment
import com.multitude.aadl.bless.bLESS.BLESSFactory
import com.multitude.aadl.bless.bLESS.BLESSPackage
import com.multitude.aadl.bless.bLESS.BLESSSubclause
import com.multitude.aadl.bless.bLESS.BehaviorState
import com.multitude.aadl.bless.bLESS.BehaviorTime
import com.multitude.aadl.bless.bLESS.BehaviorTransition
import com.multitude.aadl.bless.bLESS.BooleanExpression
import com.multitude.aadl.bless.bLESS.BooleanType
import com.multitude.aadl.bless.bLESS.CaseExpression
import com.multitude.aadl.bless.bLESS.CombinableOperation
import com.multitude.aadl.bless.bLESS.ConditionalAssertionFunction
import com.multitude.aadl.bless.bLESS.ConditionalExpression
import com.multitude.aadl.bless.bLESS.Conjunction
import com.multitude.aadl.bless.bLESS.Constant
import com.multitude.aadl.bless.bLESS.CountingQuantification
import com.multitude.aadl.bless.bLESS.Disjunction
import com.multitude.aadl.bless.bLESS.DispatchTrigger
import com.multitude.aadl.bless.bLESS.DoUntilLoop
import com.multitude.aadl.bless.bLESS.EnumerationType
import com.multitude.aadl.bless.bLESS.EnumerationValue
import com.multitude.aadl.bless.bLESS.EventTrigger
import com.multitude.aadl.bless.bLESS.ExecuteCondition
import com.multitude.aadl.bless.bLESS.ExistentialQuantification
import com.multitude.aadl.bless.bLESS.Exp
import com.multitude.aadl.bless.bLESS.Expression
import com.multitude.aadl.bless.bLESS.ForallVariable
import com.multitude.aadl.bless.bLESS.GhostVariable
import com.multitude.aadl.bless.bLESS.IndexExpression
import com.multitude.aadl.bless.bLESS.IndexExpressionOrRange
import com.multitude.aadl.bless.bLESS.Invocation
import com.multitude.aadl.bless.bLESS.MultDiv
import com.multitude.aadl.bless.bLESS.NameTick
import com.multitude.aadl.bless.bLESS.NamedAssertion
import com.multitude.aadl.bless.bLESS.NamelessAssertion
import com.multitude.aadl.bless.bLESS.NamelessFunction
import com.multitude.aadl.bless.bLESS.NullType
import com.multitude.aadl.bless.bLESS.NumericExpression
import com.multitude.aadl.bless.bLESS.ParenthesizedSubexpression
import com.multitude.aadl.bless.bLESS.PartialName
import com.multitude.aadl.bless.bLESS.PeriodShift
import com.multitude.aadl.bless.bLESS.PortInput
import com.multitude.aadl.bless.bLESS.Predicate
import com.multitude.aadl.bless.bLESS.ProductQuantification
import com.multitude.aadl.bless.bLESS.PropertyReference
import com.multitude.aadl.bless.bLESS.Quantity
import com.multitude.aadl.bless.bLESS.QuantityType
import com.multitude.aadl.bless.bLESS.Range
import com.multitude.aadl.bless.bLESS.RecordTerm
import com.multitude.aadl.bless.bLESS.RecordType
import com.multitude.aadl.bless.bLESS.Relation
import com.multitude.aadl.bless.bLESS.RootDeclaration
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment
import com.multitude.aadl.bless.bLESS.StatesSection
import com.multitude.aadl.bless.bLESS.SubProgramParameter
import com.multitude.aadl.bless.bLESS.Subexpression
import com.multitude.aadl.bless.bLESS.SubprogramCall
import com.multitude.aadl.bless.bLESS.SumQuantification
import com.multitude.aadl.bless.bLESS.TimedExpression
import com.multitude.aadl.bless.bLESS.TimedSubject
import com.multitude.aadl.bless.bLESS.Transitions
import com.multitude.aadl.bless.bLESS.Type
import com.multitude.aadl.bless.bLESS.TypeDeclaration
import com.multitude.aadl.bless.bLESS.TypeOrReference
import com.multitude.aadl.bless.bLESS.UnitFactor
import com.multitude.aadl.bless.bLESS.UnitFormula
import com.multitude.aadl.bless.bLESS.UniversalQuantification
import com.multitude.aadl.bless.bLESS.Value
import com.multitude.aadl.bless.bLESS.ValueName
import com.multitude.aadl.bless.bLESS.Variable
import com.multitude.aadl.bless.bLESS.VariableDeclaration
import com.multitude.aadl.bless.bLESS.WhileLoop
import com.multitude.aadl.bless.maps.BlessMaps
import com.multitude.aadl.bless.scoping.BlessIndex
import com.multitude.aadl.bless.util.BlessUtil
import com.multitude.aadl.bless.util.TypeUtil
import com.multitude.aadl.bless.util.UnitRecord
import com.multitude.aadl.bless.util.UnitUtil
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import org.osate.aadl2.AadlInteger
import org.osate.aadl2.AadlReal
import org.osate.aadl2.DataPort
import org.osate.aadl2.EventDataPort
import org.osate.aadl2.EventPort
import org.osate.aadl2.Feature
import org.osate.aadl2.IntegerLiteral
import org.osate.aadl2.NamedElement
import org.osate.aadl2.NamedValue
import org.osate.aadl2.Parameter
import org.osate.aadl2.Property
import org.osate.aadl2.PropertyConstant
import org.osate.aadl2.RangeValue
import org.osate.aadl2.RealLiteral
import org.osate.aadl2.SubprogramSubcomponent
import org.osate.aadl2.UnitLiteral
import org.osate.aadl2.impl.SubprogramTypeImpl
import org.eclipse.emf.ecore.EStructuralFeature
import com.multitude.aadl.bless.bLESS.CaseChoice
import com.multitude.aadl.bless.bLESS.BehaviorActions
import com.multitude.aadl.bless.bLESS.InvariantClause
import com.multitude.aadl.bless.bLESS.PortOutput
import com.multitude.aadl.bless.exception.ValidationException
import org.osate.xtext.aadl2.properties.util.GetProperties
import org.osate.xtext.aadl2.properties.util.PropertyUtils
import com.multitude.aadl.bless.bLESS.UnitName
import com.multitude.aadl.bless.bLESS.BLESSGrammarRoots
import com.multitude.aadl.bless.bLESS.NonNumericProperty

//import com.multitude.aadl.bless.bLESS.ArrayRange

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BLESSValidator extends AbstractBLESSValidator {
	

@Inject extension TypeUtil
@Inject extension UnitUtil
@Inject extension BlessIndex
//@Inject extension PropertyUtil
@Inject extension BlessUtil
//@Inject IGlobalScopeProvider globalScopeProvider

var boolean cacheUnits = false;
val Map<EObject,UnitRecord> unitRecordMap = new HashMap<EObject,UnitRecord>();


	override protected isResponsible(Map<Object, Object> context, EObject eObject) {
		eObject.eClass().getEPackage() == BLESSPackage.eINSTANCE
	}
	
	override protected handleExceptionDuringValidation(Throwable targetException)
	  {
	    targetException.printStackTrace
	  }


//////////////////////  MARKERS   \\\\\\\\\\\\\\\\\\\\\\\\\
//check to see if this is the first error from this source
  def fError(String message, EObject source, EStructuralFeature feature)
    {
    if (source.firstMarkerHere) 
      error(message,source,feature)
    }
    
  def fWarning(String message, EObject source, EStructuralFeature feature)
    {
    if (source.firstMarkerHere) 
      warning(message,source,feature)
    }
    
  def fError(String message, EObject source, EStructuralFeature feature, int index)
    {
    if (source.firstMarkerHere) 
      error(message,source,feature,index)
    }
  
  def  fError(String message, EObject source, EStructuralFeature feature, String code, String... issueData)
    {
     if (source.firstMarkerHere)  
      error(message,source,feature,code,issueData)
    }
   
  def fWarning(String message, EObject source, EStructuralFeature feature, int index)
    {
    if (source.firstMarkerHere) 
      warning(message,source,feature,index)
    }
  
  def  fWarning(String message, EObject source, EStructuralFeature feature, String code, String... issueData)
    {
     if (source.firstMarkerHere)  
      warning(message,source,feature,code,issueData)
    }
 

 ////////////////////////   CHECK THREAD PROPERTIES  \\\\\\\\\\\\\\\\\\\\\\\\\\\\
 
// @Check(CheckType.NORMAL)
//def checkFeatureInputTime(StatesSection ss)
//  {
//  val List<Feature> features = ss.getFeaturesOfComponent
//  for (f : features)
//    if ( f.getNonModalPropertyValue(AadlPackage.))
//      {
//        
//      }
//  }  
 
 @Check(CheckType.NORMAL)
 def checkStatesExist(BLESSSubclause bsc)
   {
     if (bsc.statesSection === null || bsc.statesSection.states === null
       ||  bsc.statesSection.states.empty )
    fWarning('BLESS annex subclauses must have at least one state.', bsc,
      BLESSPackage.eINSTANCE.BLESSSubclause_StatesSection) 
   }


 @Check(CheckType.NORMAL)
def checkInvariantHasNoParameters(InvariantClause ic)
  {
    if (ic.inv?.namedassertion?.formals !== null)
    fError('Assertions used as invariants must not have parameters.', ic.inv.namedassertion,
      BLESSPackage.eINSTANCE.namedAssertion_Formals) 
  }  
 
 ////////////////////////   CHECK UNIT ANNEX  \\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
//@Check(CheckType.NORMAL)
//def checkUnitLiteralIsAllLetters(UnitName un)
//  {
//  if (!un.name.toString.allLetters)
//    error('Unit literals must be all letters', un,
//  	  	BLESSPackage.Literals::UNIT_NAME)  //can't get structural feature for UnitName_name
//  }

@Check(CheckType.NORMAL)
def checkIfPositiveUnitFactor(UnitFactor uf)
  {
  if (!uf.factor.nonnegativeNumber)
    fError('Unit factors must be positive', uf,
      BLESSPackage.eINSTANCE.unitFactor_Factor) 
  }

//@Check(CheckType.NORMAL)
//def checkQuantityLiteralLackingUnitIsWhole(Constant c)
//  {
//  if (c.numeric_constant !== null
//    && c.numeric_constant.isWhole 
//    && c.numeric_constant.number !== null
//    && c.numeric_constant.number.lit !== null
//    && c.numeric_constant.number.lit.contains('.'))
//  warning('quantity literal lacking unit must be integer', c,
//      BLESSPackage.eINSTANCE.constant_Numeric_constant) 
//  }


@Check(CheckType.NORMAL)
def checkThatUnitFormulaIsAllBaseUnit(UnitFormula form)
  {
  form.top.forEach[ul| if(!ul.isBaseType)
  	      if (form.firstMarkerHere)
    error('All units in a unit formula must be base types; "'+
  	  	ul.name+'" is not a base type.', form,
  	  	BLESSPackage.eINSTANCE.unitFormula_Top) ] //  Literals::UNIT_FORMULA__TOP) ]
  form.bottom.forEach[ul| if(!ul.isBaseType)
  	      if (form.firstMarkerHere)
    error('All units in a unit formula must be base types; "'+
  	  	ul.name+'" is not a base type.', form,
  	  	BLESSPackage.eINSTANCE.unitFormula_Bottom) ]  //.Literals::UNIT_FORMULA__BOTTOM) ]
  }

//@Check(CheckType.NORMAL)
//def checkForDuplicateUnitLiteral(UnitDeclaration ud)
//  {
//    val gsp=globalScopeProvider.getScope(ud.eResource,BLESSPackage.eINSTANCE.rootDeclaration_UnitName,  //  .Literals.UNIT_EXTENSION__ROOT,
//  	   null)  
//  if (ud instanceof RootDeclaration)
//    {
//    val rd = ud as RootDeclaration
//    if (gsp.getElements(ud.unitName).size>1)
//      fError(rd.unitName.name+" is already declared in another file", ud,BLESSPackage.eINSTANCE.rootDeclaration_UnitName)
//    for (factor : rd.factors)
//      {
//      if (gsp.getElements(factor.unit).size>1)
//        fError(factor.unit.name+" is already declared in another file.", factor, BLESSPackage.eINSTANCE.unitFactor_Unit)
//      }
//    }
//  else if (ud instanceof UnitExtension)
//    {
//    val rd = ud as UnitExtension
//    for (factor : rd.factors)
//      {
//      if (gsp.getElements(factor.unit).size>1)
//        fError(factor.unit.name+" is already declared in another file.", factor, BLESSPackage.eINSTANCE.unitFactor_Unit)
//      }
//    }
//  }  //end of checkForDuplicateUnitLiteral

  @Check(CheckType.NORMAL)
  def checkSingleCharacterBaseUnit(RootDeclaration ud)
  {
  	if (ud.base && ud.unitName.name.length>1)
  	  fError('Base units must have single-character names',ud,
  	  	BLESSPackage.eINSTANCE.rootDeclaration_UnitName)  //  ::ROOT_DECLARATION__UNIT_NAME)
  }
  

//////////////////////////   TYPE   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//TODO: add checks when AADL properties are used for array ranges
@Check def arrayRangesHaveNaturalValues(ArrayRange range)
  {
  if (range.lb?.lit !==null && (range.lb?.lit.contains('.') || range.lb?.lit.contains('-')))
      fError('Range bounds must be natural numbers',range.lb,
						BLESSPackage::eINSTANCE.ANumber_Lit, IssueCodes.RANGE_BOUNDS_MUST_BE_NATURAL)  	      	   	
  if (range?.ub?.lit !== null && (range?.ub?.lit.contains('.') || range?.ub?.lit.contains('-')))
      fError('Range bounds must be natural numbers',range.ub,
						BLESSPackage::eINSTANCE.ANumber_Lit, IssueCodes.RANGE_BOUNDS_MUST_BE_NATURAL)  	      	   	
    
  }

@Check(CheckType.NORMAL)
def void checkForNullTypeDeclaration(TypeDeclaration td)
  {
  if (td.type instanceof NullType)
    fError('Null is not allowed as a type declaration.',td,
        BLESSPackage.eINSTANCE.typeDeclaration_Type, IssueCodes.NULL_TYPE_DECLARATION_DISALLOWED)             
  }


@Check(CheckType.NORMAL)
  def void 
checkThatRecordTermsHaveRecordType(RecordTerm rt)
  {
  if (!(rt.record_type.type instanceof RecordType))
      fError('Record terms (values) must have record types.',rt.record_type,
            BLESSPackage::eINSTANCE.recordTerm_Record_type, IssueCodes.INCOMPATIBLE_TYPES)               
  val RecordType ty = rt.record_type.type as RecordType
  val HashMap<String,Type> rf = new HashMap<String,Type>()
  for (f : ty.fields)
    if (f.typ.ty !== null)
      rf.put(f.label, f.typ.ty)
    else
      rf.put(f.label, f.typ.ref.type)
  for (rv : rt.record_value) 
    {
    if (rf.containsKey(rv.label))
      {  //check type of record value with field type
      if (!rv.aval.getType.sameStructuralType(rf.remove(rv.label))) 
        fError('Record type \''+rt.record_type.name+'\' field with label \''+rv.label+'\' does not match type.',rv,
          BLESSPackage.eINSTANCE.recordValue_Aval, IssueCodes.MISSING_RECORD_FIELD_LABEL)                
      }
    else
      fError('Record type \''+rt.record_type.name+'\' does not have a field with label \''+rv.label+'\'.',rt,
        BLESSPackage.eINSTANCE.recordTerm_Record_type, IssueCodes.MISSING_RECORD_FIELD_LABEL)             
    }
  if (!rf.empty)
      fError('Record type \''+rt.record_type.name+'\' has unassigned fields: '+rf.keySet+'\'.',rt,
        BLESSPackage.eINSTANCE.recordTerm_Record_type, IssueCodes.UNASSIGNED_RECORD_FIELD_LABEL)             
  }


///////////////////////////   ASSERTION   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

@Check(CheckType.NORMAL)
def void 
checkThatAssertionEnumerationsHaveEnumerationTypeLabels(NamedAssertion na)
  {
  if (na.enumer)
    {
    if (na.enumerationType !== null && !(na.enumerationType.type instanceof EnumerationType))
        if (na.firstMarkerHere)
      fError('Assertion enumerations must have enumeration type parameters', na,
      	BLESSPackage::eINSTANCE.namedAssertion_EnumerationType, IssueCodes.MUST_HAVE_ENUM_TYPE)
     val et = (na.enumerationType.type as EnumerationType).defining_enumeration_literal.toSet	
     for (ePair : na.enumeration.pair)
       if (!et.contains(ePair.enumeration_literal))
        if (ePair.firstMarkerHere)
        fError('Assertion enumeration label \''+ePair.enumeration_literal+'\' is not one of the literals in \''+
        	na.enumerationType.name+'\' enumeration type', ePair,
      	  BLESSPackage::eINSTANCE.enumerationPair_Enumeration_literal, IssueCodes.LABEL_NOT_IN_ENUM_TYPE)    
    }
  }

@Check(CheckType.NORMAL)
def void checkThatAssertionFunctionHasCompatibleUnits(NamedAssertion a)	
  {
  if (a.func)	
	  if (!a.tod.getType.sameStructuralType(a.functionvalue.getType))
      fError('Operands of assertion functions must have compatible types', a,
						BLESSPackage.eINSTANCE.namedAssertion_Func, IssueCodes.INCOMPATIBLE_TYPES)
	  else if (!a.tod.getUnitRecord.matchTopAndBottom(a.functionvalue.getUnitRecord))	
      fError('Return type of assertion function must have the same base units as its expression; '+
      	a.tod.getUnitRecord.toString+' is not '+a.functionvalue.getUnitRecord.toString,a,
						BLESSPackage.eINSTANCE.namedAssertion_Func, IssueCodes.INCOMPATIBLE_UNITS)  			      
  }

@Check(CheckType.NORMAL)
def void checkThatNamelessAssertionsHavePredicates(NamelessAssertion n)
  {
  if (!n.predicate.getType.boolean)
    fError('Nameless assertions must have boolean predicates',n,
						BLESSPackage::eINSTANCE.namelessAssertion_Predicate, IssueCodes.TYPE_MUST_BE_BOOLEAN)   
  }
  
@Check(CheckType.NORMAL)
def void checkThatNamelessFunctionHaveQuantity(NamelessFunction n)
  {
  if (!(n.functionvalue.getType instanceof QuantityType))
    fError('Nameless functions must have quantity function values',n,
						BLESSPackage::eINSTANCE.namelessFunction_Functionvalue, IssueCodes.MUST_BE_QUANTITY)   
  }

@Check(CheckType.NORMAL)
def void checkThatNamedAssertionType(NamedAssertion n)
  {
  if (n.pred && !n.predicate.getType.isBoolean)	
    fError('Assertions must have boolean predicates.',n,
			BLESSPackage::eINSTANCE.namedAssertion_Predicate, IssueCodes.TYPE_MUST_BE_BOOLEAN)   
  if (n.func && !(n.functionvalue.getType.sameStructuralType(n.tod.getType)))
    fError('Assertion functions must match their types.',n,
			BLESSPackage::eINSTANCE.namedAssertion_Tod, IssueCodes.MISMATCHED_UNITS)   
  }


//@Check(CheckType.NORMAL)
//def void checkPortValueInAssignment(ValueName n)
//  {
//  if (n.q && n.getAsgnInAssignment !== null)  
//    fError('Don\'t use \'?\' for port values in assignment.',n.getAsgnInAssignment,
//      BLESSPackage::eINSTANCE.assignment_Asgn, IssueCodes.PORT_VALUE_IN_EXPRESSION_HAS_Q)   
//  if (n.q && n.getAsgnInSimultaneousAssignment !== null)  
//    fError('Don\'t use \'?\' for port values in assignment.',n.getAsgnInSimultaneousAssignment,
//      BLESSPackage::eINSTANCE.simultaneousAssignment_Asgn, IssueCodes.PORT_VALUE_IN_EXPRESSION_HAS_Q)   
//  }



@Check(CheckType.NORMAL)
def void checkPortInputTarget(PortInput n)
  {
  if (n.target.q ||n.target.fresh ||n.target.count ||n.target.updated )
    fError('Target of port input must be a variable name.',n,
      BLESSPackage::eINSTANCE.portInput_Target, IssueCodes.PORT_INPUT_MUST_TARGET_VARIABLE)   
  }

@Check(CheckType.NORMAL)
def void checkAssignmentToInPort(Assignment asgn)
  {
  val vName = asgn.lhs.value.id
  if (vName instanceof DataPort && !(vName as DataPort).out)
    fError('May not assign to in data port.',asgn,
      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)   
  if (vName instanceof EventDataPort && !(vName as EventDataPort).out)
    fError('May not assign to in event data port.',asgn,
      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)   
  if (vName instanceof EventPort && !(vName as EventPort).out)
    fError('May not assign to in event port.',asgn,
      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)   
  if (vName instanceof Parameter && !(vName as Parameter).out)
    fError('May not assign to in parameter.',asgn,
      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)  
  }

//@Check(CheckType.NORMAL)
//def void checkInPortValueHasQuestionMark(ValueName vn)
//  {
//  if (vn.id instanceof DataPort || vn.id instanceof EventPort || vn.id instanceof EventDataPort) 
//    if (!vn.q && !vn.fresh && !vn.count && !vn.updated && vn.inBehaviorActions) 
//        fError('Values of in ports must use ?, fresh, count, or updated.',vn,
//          BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.NEEDS_QUESTION_MARK) 
//  }

@Check(CheckType.NORMAL)
def void checkPortIndexIsNaturalLiteral(ValueName vn)
  {
  if (vn.id instanceof DataPort || vn.id instanceof EventPort || vn.id instanceof EventDataPort)  
    if (vn.array_index !== null && vn.array_index.size > 0)
      {
      if (vn.array_index.size > 1)  
        fError('Port arrays are one dimensional.',vn,
          BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.PORT_ARRAY_INDEX_ERROR) 
      else if (vn.array_index.head instanceof ANumber)
        {
        val num = vn.array_index.head as ANumber
        if (num.lit !== null && (num.lit.contains('.') || num.lit.contains('-') ))  
          fError('Port array index must be natural literal.',vn,
            BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.PORT_ARRAY_INDEX_ERROR) 
        }   
      else
        fError('Port array index must be natural literal.',vn,
          BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.PORT_ARRAY_INDEX_ERROR) 
      }
  }

@Check(CheckType.NORMAL)
def void checkPElhsIsWhole(Relation r)
  {
  if (r.sym !== null && r.sym.equalsIgnoreCase("+="))
    {
    if (r.l instanceof ValueName)
      {
      val ty = (r.l as ValueName).getType
      if (ty instanceof QuantityType)
        {
        if ((ty as QuantityType).whole !== null)      
//        if (!(ty as QuantityType).whole)      
          fError('+= only apples to whole variables.',r,
            BLESSPackage::eINSTANCE.relation_L, IssueCodes.PLUS_EQUALS_ERROR) 
        }
      else    
        fError('+= only apples to whole variables.',r,
          BLESSPackage::eINSTANCE.relation_L, IssueCodes.PLUS_EQUALS_ERROR) 
      }
    else    
      fError('+= only apples to whole variables.',r,
          BLESSPackage::eINSTANCE.relation_L, IssueCodes.PLUS_EQUALS_ERROR) 
    }  
  }

@Check(CheckType.NORMAL)
def void checkNameTickValue(NameTick n)
  {
  if (n.tick &&(n.value.q ||n.value.fresh ||n.value.count ||n.value.updated ))
    fError('Must be a variable name to have \'.',n,
      BLESSPackage::eINSTANCE.portInput_Target, IssueCodes.PORT_INPUT_NOT_ALLOWED)   
  }

@Check(CheckType.NORMAL)
def void checkSubProgramParameterValue(SubProgramParameter n)
  {
  if ((n.value !== null ) && (n.value.q ||n.value.fresh ||n.value.count ||n.value.updated ))
    fError('Subprogram parameters may not be port input.',n,
      BLESSPackage::eINSTANCE.subProgramParameter_Value, IssueCodes.PORT_INPUT_NOT_ALLOWED)   
  }

//WHAT'S THIS SUPPOSED TO CHECK?  removed May 22, 2023
//@Check(CheckType.NORMAL)
//def void checkBehaviorTimeValue(BehaviorTime n)
//  {
//  if (n.value.q ||n.value.fresh ||n.value.count ||n.value.updated )
//    fError('Behavior time may not be port input.',n,
//      BLESSPackage::eINSTANCE.behaviorTime_Value, IssueCodes.PORT_INPUT_NOT_ALLOWED)   
//  }

//@Check(CheckType.NORMAL)
//def void checkValueNameInAssertion(Value n)
//  {
//  if (AssertionUtil.containedInAssertion(n)  && n.value_name.q)
//    fError('Assertions may not contain port input.',n,
//      BLESSPackage::eINSTANCE.value_Value_name, IssueCodes.PORT_INPUT_NOT_ALLOWED)   
//  }

//@Check(CheckType.NORMAL)
//def void checkInvocationsHaveNoTimedExpression(TimedExpression te)
//  {
//  if ((te.tick!==null || te.at || te.caret) && te.containedInInvocation) 
//    fError('Invocation parameters may not be timed (\' @ ^)',te,
//      BLESSPackage::eINSTANCE.timedExpression_Subject, 
//      IssueCodes.TIMED_INVOCATION_PARAMETERS)    
//  }

@Check(CheckType.NORMAL)
def void checkInvocationNumericExpression(Invocation i)
  {
  if (i.actual_parameter !== null && !(i.actual_parameter.getType instanceof QuantityType))  
    fError('Invocation of '+i.label?.name+' with unlabeled parameter must be quantity.  Try '+
      i.label?.name+'(x:e)',i,
      BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.MUST_BE_QUANTITY)    
  }


@Check(CheckType.NORMAL)
def void checkDuplicateTransitionLabels(Transitions trans)
  {
  val labels = new HashMap<String,BehaviorTransition>()
  for (t : trans.bt) 
    if (labels.containsKey(t.name))
      {
      fError('Duplicate transition label \''+t.name+'\'',t,
        BLESSPackage::eINSTANCE.behaviorTransition_Colon, IssueCodes.DUPLICATE_TRANSITION_LABEL)    
      fError('Duplicate transition label \''+t.name+'\'',labels.get(t.name),
        BLESSPackage::eINSTANCE.behaviorTransition_Colon, IssueCodes.DUPLICATE_TRANSITION_LABEL)     
      }
    else labels.put(t.name,t)
  }

@Check(CheckType.NORMAL)
def void checkProductQuantificationNumericExpression(ProductQuantification pq)
  {
  if (pq.numeric_expression !== null && !(pq.numeric_expression.getType instanceof QuantityType))  
    fError('product-of must be quantity.',pq,
      BLESSPackage::eINSTANCE.productQuantification_Numeric_expression, IssueCodes.MUST_BE_QUANTITY)   
  }

@Check(CheckType.NORMAL)
def void checkSumQuantificationNumericExpression(SumQuantification sq)
  {
  if (sq.numeric_expression !== null && !(sq.numeric_expression.getType instanceof QuantityType))  
    fError('sum-of must be quantity.',sq,
      BLESSPackage::eINSTANCE.sumQuantification_Numeric_expression, IssueCodes.MUST_BE_QUANTITY)   
  }


//@Check(CheckType.NORMAL)
//def void checkNoAssertionEnumeration(Invocation i)
//  {
//  if (i.label.enumer && !(i.eContainer instanceof NamelessEnumeration))
//    fError('Invocations of assertion enumerations may only be in nameless enumerations << +=> '+
//      i.label.name+'(x) >>',i,
//      BLESSPackage::eINSTANCE.invocation_Label, IssueCodes.ASSERTION_ENUMERATION_INVOCATION_NOT_ALLOWED)   
//  }

@Check(CheckType.NORMAL)
def void checkNamedAssertionHasNoNow(Value v)
  {
  if (v.now !== null) 
    {
    var p = v.eContainer
    while (p !== null && !(p instanceof NamedAssertion)) 
      p = p.eContainer
    if (p !== null)
      fWarning('Don\'t use \"now\" in named assertions.',v,
            BLESSPackage::eINSTANCE.value_Now, IssueCodes.NOW_IN_NAMED_ASSERTION)         
    }
  }

@Check(CheckType.NORMAL)
def void checkNamedAssertionInvocation(Invocation i)
  { //first check for named enumeration
  if (i.label.assertionvariable !==null )
    {
    if (i.params.size != 1)  
      fError('Assertion enumeration invocation must have a single value.',i,
         BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION)
    else 
      {
      val vd = i.params.head.actual?.l?.l?.l?.l?.l?.l?.l?.timed_expression?.subject?.value?.enum_val  
      if (!(vd instanceof EnumerationValue))
        fError('Parameter for assertion enumeration invocation must be enumeration value.',i,
          BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION)
      else if ((vd as EnumerationValue).enumeration_type.name !=  i.label.enumerationType.name) 
      fError('Parameter for assertion enumeration invocation must have the same enumeration type: '+
        (vd as EnumerationValue).enumeration_type.name+" is not "+ 
        i.label.enumerationType.name+".",i,
         BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION)
      }
    }
  //then check no parameter
  else if (i.label.formals === null)
    {
    if (i.params !== null  && i.params.size > 0)
        fError('Invoked assertion has no parameters.',i,
            BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION)                  
    else if (i.actual_parameter !== null ) 
        fError('Invoked assertion has no parameters.',i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)              
    }
  else if (i.actual_parameter !== null)
    {  //one parameter
    if (i.label.formals.parameter !== null && i.label.formals.parameter.size > 0) 
        fError('Invoked assertion has more than one parameter.',i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)  
    val Type actualType = (i.actual_parameter as Expression).getType      
    val formalType = i.label.formals.first.getType 
    if (!sameStructuralType(actualType, formalType))  
        fError('Invocation parameter type mismatch.',i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)              
    if (actualType.isQuantity && formalType.isQuantity) 
      {
      val actualQuantity = actualType as QuantityType
      val formalQuantity = formalType as QuantityType
      if (actualQuantity.whole !== null && formalQuantity.whole === null)
        fError('Invocation actual parameter is whole, but it\'s formal parameter is not.',i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)             
      if (actualQuantity.scalar !== null && formalQuantity.scalar === null)
        fError('Invocation actual parameter is scalar, but it\'s formal parameter is not.',i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)             
      if (actualQuantity.unit !== null && formalQuantity.unit === null)
        fError('Invocation actual parameter has a unit, but it\'s formal parameter does not.',i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)             
      if (actualQuantity.unit !== null && formalQuantity.unit !== null && !sameUnitRoot(actualQuantity.unit, formalQuantity.unit)) 
        fError('Invocation parameter unit mismatch; '+actualQuantity.unit.name+" is not "+formalQuantity.unit.name,i,
            BLESSPackage::eINSTANCE.invocation_Actual_parameter, IssueCodes.ASSERTION_INVOCATION)             
      }    
    }
  else  //multiple parameters
    {  //check number
    if (i.label.formals.parameter === null) 
      fError('Invocation has more parameters than assertion.',i,
         BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION)              
    else if (i.label.formals.parameter.size + 1 > i.params.size) 
      fError('Invocation has fewer parameters than assertion.',i,
         BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION)              
    else if (i.label.formals.parameter.size + 1 < i.params.size) 
      fError('Invocation has more parameters than assertion.',i,
         BLESSPackage::eINSTANCE.invocation_Params, IssueCodes.ASSERTION_INVOCATION) 
    else
      {  //check labels then types
      for (param : i.params) 
        {
        var found = false
        if (i.label.formals.first.name == param.formal)
          {
          found = true
          if (!sameStructuralType(i.label.formals.first.getType, param.actual.getType)) 
            fError('Invocation parameter \"'+param.formal+'\" type mismatch: '+
              i.label.formals.first.name + "~" +i.label.formals.first.getType.typeString+
              " is not " +param.formal+ "~" +param.actual.getType.typeString, param,
              BLESSPackage::eINSTANCE.actualParameter_Formal, IssueCodes.ASSERTION_INVOCATION)              
          else if (param.actual.getType.isQuantity && i.label.formals.first.getType.isQuantity
            && !param.actual.getUnitRecord.matchTopAndBottom(i.label.formals.first.tod.getUnitRecord))
            fError('Invocation parameter \"'+param.formal+'\" unit mismatch: '+
              i.label.formals.first.name + "~" +i.label.formals.first.tod.getUnitRecord+
              " is not " +param.formal+ "~" +param.actual.getUnitRecord, param,
              BLESSPackage::eINSTANCE.actualParameter_Formal, IssueCodes.ASSERTION_INVOCATION)              
          }
        for (formal : i.label.formals.parameter) 
          {
          if (formal.name == param.formal)
            {
            found = true
            if (!sameStructuralType(formal.tod.getType, param.actual.getType)) 
              fError('Invocation parameter \"'+param.formal+'\" type mismatch: '+
              formal.name + "~" +formal.getType.typeString+
              " is not " +param.formal+ "~" +param.actual.getType.typeString, param,
                BLESSPackage::eINSTANCE.actualParameter_Formal, IssueCodes.ASSERTION_INVOCATION)              
            else if (param.actual.getType.isQuantity && formal.tod.getType.isQuantity
                && !param.actual.getUnitRecord.matchTopAndBottom(formal.tod.getUnitRecord))
              fError('Invocation parameter \"'+param.formal+'\" unit mismatch: '+
                formal.name + "~" +(formal.getType as QuantityType).unit+
              " is not " +param.formal+ "~" +(param.actual.getType as QuantityType).unit,param,
                BLESSPackage::eINSTANCE.actualParameter_Formal, IssueCodes.ASSERTION_INVOCATION)               
            }  
          }  // done for formal
        if (!found)
          fError('Invocation parameter \"'+param.formal+'\" not found.',param,
             BLESSPackage::eINSTANCE.actualParameter_Formal, IssueCodes.ASSERTION_INVOCATION)               
        }
      }             
    }
  }  //end of checkNamedAssertionInvocation

//////////////////////////  EXPRESSION  \\\\\\\\\\\\\\\\\\\\
 
@Check(CheckType.NORMAL)
def void 
checkThatBooleanExpressionsAreBoolean(BooleanExpression be)
  {
  val le = be as Expression
  	if (le.all !== null && !le.all.getType.sameStructuralType(booleanType))
        fError('Universal quantification must be Boolean type.',le,
						BLESSPackage::eINSTANCE.expression_All, IssueCodes.TYPE_MUST_BE_BOOLEAN)  	      	  
  	if (le.exists !== null && !le.exists.getType.sameStructuralType(booleanType))
        fError('Existential quantification must be Boolean type.',le,
						BLESSPackage::eINSTANCE.expression_Exists, IssueCodes.TYPE_MUST_BE_BOOLEAN)  	      	  
  	if (le.r !== null && !le.r.getType.sameStructuralType(booleanType))
        fError('Consequents of implication must have Boolean type.',le,
          BLESSPackage::eINSTANCE.expression_R,IssueCodes.TYPE_MUST_BE_BOOLEAN)  	      	  
  	if (le.l !== null && le.sym !==null && !le.l.getType.sameStructuralType(booleanType))
        fError('Premises of implication must have Boolean type.',le,
          BLESSPackage::eINSTANCE.expression_L,IssueCodes.TYPE_MUST_BE_BOOLEAN)  	      	  
  }

@Check(CheckType.NORMAL)
def void checkThatRelationsHaveCompatibleUnits(Relation r)	
  {  
  if (r.in !==null)
	   {
	   val rlur = r.l.getUnitRecord  	
	   val rrur = r.range.lower_bound.getUnitRecord  	
	   if (!rlur.matchTopAndBottom(rrur))	
       fError('Subject of \'in\' relation must have the same base units as lower bound of range; '+
      	 rlur.toString+' is not '+rrur.toString,r.range,
						BLESSPackage.eINSTANCE.range_Lower_bound, IssueCodes.INCOMPATIBLE_UNITS) 		
     val rubur = r.range.upper_bound.getUnitRecord   
     if (!rlur.matchTopAndBottom(rubur)) 
       fError('Subject of \'in\' relation must have the same base units as upper bound of range; '+
         rlur.toString+' is not '+rubur.toString,r.range,
            BLESSPackage.eINSTANCE.range_Upper_bound, IssueCodes.INCOMPATIBLE_UNITS)    
	   }	  
  if (r.sym !== null && !r.relationComparesNull)    //null comparison always is type correct
    {
    val rlqt = 	r.l.getType
    val rrqt = r.r.getType
    if (rlqt instanceof QuantityType && rrqt instanceof QuantityType)
	   {
	   val rlur = r.l.getUnitRecord  	
	   val rrur = r.r.getUnitRecord 	
	   if (!rlur.matchTopAndBottom(rrur))	
       fError('Operands of \''+r.sym+'\' must have the same base units; '+
      	 rlur.toString+' is not '+rrur.toString,r,
						BLESSPackage.eINSTANCE.relation_Sym, IssueCodes.INCOMPATIBLE_UNITS) 		
	   }	
    else if (!r.l.getType.sameStructuralType(r.r.getType))
      fError('Operands of \''+r.sym+'\' must have compatible types.  '+
            r.l.getType.typeString+" is not "+r.r.getType.typeString ,r,
						BLESSPackage.eINSTANCE.relation_Sym, IssueCodes.INCOMPATIBLE_TYPES)
	}      	   	
  }

@Check(CheckType.NORMAL)
def void checkThatAdditionHasCompatibleUnits(AddSub a)	
  {
  for (t : a.r)
		if (!a.l.getUnitRecord.matchTopAndBottom(t.getUnitRecord))	
      fError('Operands of \''+a.sym+
      '\' must have the same base units; '+
      	a.l.getUnitRecord.toString+' is not '+t.getUnitRecord.toString,a,
						BLESSPackage.eINSTANCE.addSub_Sym, IssueCodes.INCOMPATIBLE_UNITS)  			      
  }


////////////////////////////   ACTION   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

@Check(CheckType.NORMAL)
def void checkThatAssignmentHasCompatibleUnits(Assignment a)  
  { 
    if (a.rhs.exp.getType.isNull)
      {}  //null matches all types
    else if (!a.lhs.value.getType.sameStructuralType(a.rhs.exp?.getType))
      fError('Targets of assignment must have compatible types with their expressions.  '+
            a.lhs.value.getType.typeString+" is not "+a.rhs.exp?.getType.typeString, a,
            BLESSPackage.eINSTANCE.assignment_Asgn, IssueCodes.INCOMPATIBLE_TYPES)
    else if ( a.lhs.value.getType instanceof QuantityType && a.rhs.exp.getType instanceof QuantityType &&
      !a.lhs.value.getUnitRecord.matchTopAndBottom(a.rhs.exp?.getUnitRecord)) 
      fError('Target of assignment of must have the same base units as its expression; '+
        a.lhs.value.getUnitRecord.toString+' is not '+a.rhs.exp.getUnitRecord.toString, a,
            BLESSPackage.eINSTANCE.assignment_Asgn, IssueCodes.INCOMPATIBLE_UNITS)              
  }

@Check(CheckType.NORMAL)
def void checkThatVariableDelcarationAssignmentHasCompatibleUnits(VariableDeclaration vd)  
  {
  if (vd.assign) 
    {
    if (vd.expression===null || vd.expression.getType.isNull)
      {}  //null matches all types
    else if (vd.variable.tod.getType instanceof ArrayType)
      {
      val ArrayType art =vd.variable.tod.getType as ArrayType
      if (!art.typ.getType.sameStructuralType(vd.expression.getType))
        fError('Array variable declaration initialization expression must match its element type.', vd,
            BLESSPackage.eINSTANCE.variableDeclaration_Expression, IssueCodes.INCOMPATIBLE_TYPES)            
      else if (art.typ.getType instanceof QuantityType && vd.expression.getType instanceof QuantityType &&
               !art.typ.getUnitRecord.matchTopAndBottom(vd.expression?.getUnitRecord)) 
        fError('Array variable declaration initialization expression must have the same base units as its element type; '+
            art.typ.getUnitRecord.toString+' is not '+vd.expression.getUnitRecord.toString, vd,
            BLESSPackage.eINSTANCE.variableDeclaration_Expression, IssueCodes.INCOMPATIBLE_UNITS)              
      }     
    else if (!vd.variable.tod.getType.sameStructuralType(vd.expression.getType))
      fError('Variable declaration initialization expression must match its type.', vd,
            BLESSPackage.eINSTANCE.variableDeclaration_Expression, IssueCodes.INCOMPATIBLE_TYPES)            
    else if ( vd.variable.tod.getType instanceof QuantityType && vd.expression.getType instanceof QuantityType &&
               !vd.variable.tod.getUnitRecord.matchTopAndBottom(vd.expression.getUnitRecord)) 
        fError('Variable declaration initialization expression must have the same base units; '+
            vd.variable.tod.getUnitRecord.toString+' is not '+vd.expression.getUnitRecord.toString, vd,
            BLESSPackage.eINSTANCE.variableDeclaration_Expression, IssueCodes.INCOMPATIBLE_UNITS)              
    }             
  }

@Check(CheckType.NORMAL)
def void checkThatVariableDelcarationHasAssignment(VariableDeclaration vd)  
  {
  if (!vd.assign)
    fWarning('Variable declarations should have initialization assignments to prevent use of uninitialized values.',
      vd,BLESSPackage.eINSTANCE.variableDeclaration_Expression, IssueCodes.INCOMPATIBLE_UNITS);
  }

@Check(CheckType.NORMAL)
def void checkThatSimultaneousAssignmentHasCompatibleUnits(SimultaneousAssignment a)	
  {	
  if (a.lhs.size !== a.rhs.size)
    fError('Simultaneous assignment must have the same number of targets as expressions', a,
    	  BLESSPackage.eINSTANCE.simultaneousAssignment_Asgn, IssueCodes.SIMULTANEOUS_ASSIGNMENT)
  else for (var i=0;i<a.lhs.size;i++)
    {
    val target = a.lhs.get(i).value
    val expression = a.rhs.get(i).exp
    val targetType = target.getType
    val expressionType = expression.getType
    if (expressionType.isNull)
      {}  //null matches all types
	  else if (!targetType.sameStructuralType(expressionType))
	    {
      error('Targets of simultaneous assignment must have compatible types with expressions.  '+
        targetType.typeString+" is not "+expressionType.typeString, a,
						BLESSPackage.eINSTANCE.simultaneousAssignment_Lhs, i)
//      fError('Expressions of simultaneous assignment must have compatible types with targets', a,
//						BLESSPackage.eINSTANCE.simultaneousAssignment_Rhs, i)			
			}
	  else if (!target.getUnitRecord.matchTopAndBottom(expression?.getUnitRecord))
	    {	
      error('Target of assignment of must have the same base units as its expression; '+
      	target.getUnitRecord.toString+' is not '+expression.getUnitRecord.toString, a,
						BLESSPackage.eINSTANCE.simultaneousAssignment_Lhs, i)  	
//      fError('Expressions too ', a,
//						BLESSPackage.eINSTANCE.simultaneousAssignment_Rhs, i)  	
		  }
	  }		      
  }

@Check(CheckType.NORMAL)
def void checkThatBoundFunctionsAreWhole(WhileLoop a)	
  {
  if (!a.bound_function.isWhole)
    fError('Bound functions of while loops must be whole numbers', a,
			BLESSPackage.eINSTANCE.whileLoop_Bound_function, IssueCodes.MUST_BE_WHOLE_NUMBER)
  }

@Check(CheckType.NORMAL)
def void checkThatBoundFunctionsAreWhole(DoUntilLoop a)	
  {
  if (!a.bnd.isWhole)
    fError('Bound functions of do-unitl loops must be whole numbers', a,
			BLESSPackage.eINSTANCE.whileLoop_Bound_function, IssueCodes.MUST_BE_WHOLE_NUMBER)
  }


@Check(CheckType.NORMAL)
def void checkThatNamelessFunctionHasCompatibleUnits(NamelessFunction a)	
  {
  if (!a.tod.getUnitRecord.matchTopAndBottom(a.functionvalue.getUnitRecord))	
      fError('Return type of nameless function must have the same base units as its expression; '+
      	a.tod.getUnitRecord.toString+' is not '+a.functionvalue.getUnitRecord.toString,a,
						BLESSPackage.eINSTANCE.namelessFunction_Func, IssueCodes.INCOMPATIBLE_UNITS)  			      
  }

@Check(CheckType.NORMAL)
def void checkThatTimeExpressionsHaveTimeUnits(TimedExpression tse)
  {
  if (tse.at)
  if (!tse.time.getUnitRecord.rootUnit.name.equals('s'))
    fError('time expressions must have time units',tse,
			BLESSPackage::eINSTANCE.timedExpression_Time, IssueCodes.MUST_HAVE_TIME_UNITS)  	      	   	
    
  }

@Check(CheckType.NORMAL)
def void checkThatPeriodShiftsHaveWholeNumbers(PeriodShift ps)
  {
  if (ps.v !== null && !ps.v.isWhole)
    fError('Must be whole number',ps,
			BLESSPackage::eINSTANCE.periodShift_V, IssueCodes.MUST_HAVE_INDEX_TYPE)  
  if (ps.index_expression !== null && !ps.index_expression.isWhole)
    fError('Index expression must be whole number',ps,
			BLESSPackage::eINSTANCE.periodShift_Index_expression, IssueCodes.MUST_HAVE_INDEX_TYPE)  
  }

@Check(CheckType.NORMAL)
def void checkThatRangesHaveCompatibleUnits(Range range)
  {
  if (!range.lower_bound.getUnitRecord.matchTopAndBottom(range.upper_bound.getUnitRecord))
    fError('Lower and upper bounds of ranges must have compatible units',range,
						BLESSPackage.eINSTANCE.range_Sym, IssueCodes.INCOMPATIBLE_TYPES)   
  }

  
@Check(CheckType.NORMAL)
def void 
checkTargetsOfCombinableOperationsAreShared(CombinableOperation co) 
  {
  if (co.target.eContainer instanceof VariableDeclaration)  
    {
    val vd = co.target.eContainer as VariableDeclaration 
    if (!vd.shared)
      fError('Targets of combinable operations must be \'shared\'.',co,
            BLESSPackage.eINSTANCE.combinableOperation_Target, IssueCodes.COMBINABLE_OPERATION_TARGET_MUST_BE_SHARED)             
    }
  } 

@Check(CheckType.NORMAL)
def void 
checkSubprogramInvocationParametersHavingExpressionsAreIn(SubprogramCall sc)
  {
  if (sc.parameters !== null)
    for (v : sc.parameters.variables)
      if (v.actual.expression !== null)
        {
        if (v.formal === null) 
          fError('Expression subprogram parameters must have formal identifier in subprogram call f:(e).',v,
            BLESSPackage.eINSTANCE.subProgramParameter_Expression, IssueCodes.SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_HAVE_FORMAL)             
        else if (sc.procedure === null)
          fError('Subprogram call has null procedure!',sc,
            BLESSPackage.eINSTANCE.subprogramCall_Procedure, IssueCodes.MUST_NOT_BE_NULL)             
        else
        //find parameter, check that it's "in"
          for (p : sc.procedure.getFeaturesOfComponent)
            if (p instanceof Parameter && (p as Parameter)==v.formal && !(p as Parameter).in)
              fError('Expression subprogram parameters must have "in" direction.',v,
                BLESSPackage.eINSTANCE.formalActual_Actual, IssueCodes.SUBPROGRAM_CALL_EXPRESSION_PARAMETER_MUST_HAVE_FORMAL)                       
        }
  }



@Check(CheckType.NORMAL)
def void checkPortOutput(PortOutput o)
  {
  if (!o.port.direction.outgoing)
    fError('Port output of port that is not \'out\'.', o,
      BLESSPackage::eINSTANCE.portOutput_Port, IssueCodes.PORT_OUTPUT_NOT_ALLOWED)  
  if (o.port instanceof DataPort  && o.eor===null)   
    fError('Port output of data port lacks parameter.', o,
      BLESSPackage::eINSTANCE.portOutput_Port, IssueCodes.PORT_OUTPUT_LACKS_PARAMETER)  
  if (o.port instanceof EventDataPort && o.eor===null)   
    fError('Port output of event data port lacks parameter.', o,
      BLESSPackage::eINSTANCE.portOutput_Port, IssueCodes.PORT_OUTPUT_LACKS_PARAMETER)  
  if (o.port instanceof EventPort  && o.eor!==null)   
    fError('Port output of event port has parameter.', o,
      BLESSPackage::eINSTANCE.portOutput_Eor, IssueCodes.PORT_OUTPUT_HAS_PARAMETER)  
  if (o.port instanceof EventPort  && !isBoolean(o.port.getFeatureType))   
    fError('Event port must have boolean type.', o,
      BLESSPackage::eINSTANCE.portOutput_Port, IssueCodes.PORT_OUTPUT_WRONG_TYPE)  
  if (o.port instanceof DataPort  && !o.port.getFeatureType.sameStructuralType(o.eor.getType))   
    fError('Port output parameter must have same type as its data port.', o,
      BLESSPackage::eINSTANCE.portOutput_Port, IssueCodes.PORT_OUTPUT_WRONG_TYPE)  
  if (o.port instanceof EventDataPort  && !o.port.getFeatureType.sameStructuralType(o.eor.getType))   
    fError('Port output parameter must have same type as its event data port.', o,
      BLESSPackage::eINSTANCE.portOutput_Port, IssueCodes.PORT_OUTPUT_WRONG_TYPE)   
  }

@Check(CheckType.NORMAL)
def void checkPortInput(PortInput n)
  {
  if ((n.target.q ||n.target.fresh ||n.target.count ||n.target.updated ) &&
       !(n.target.id!==null && n.target.id instanceof Variable))
    fError('Target of port input must be a variable name.',n,
      BLESSPackage::eINSTANCE.portInput_Target, IssueCodes.PORT_INPUT_MUST_TARGET_VARIABLE)   
  if (!n.port.direction.incoming)
    fError('Port input of port that is not \'in\'.',n,
      BLESSPackage::eINSTANCE.portInput_Port, IssueCodes.PORT_INPUT_NOT_ALLOWED) 
  try {  
  if (n.target.id!==null && n.target.id instanceof Variable && 
        !n.port.featureType.sameStructuralType((n.target.id as Variable).tod.getType))
    fError('Target of port input must have same type as its port.',n,
      BLESSPackage::eINSTANCE.portInput_Target, IssueCodes.PORT_INPUT_WRONG_TYPE) 
      } 
  catch (ValidationException ve)
    fError(ve.getMessage(),n,
      BLESSPackage::eINSTANCE.portInput_Port, IssueCodes.PORT_INPUT_WRONG_TYPE) 
    
  }

//@Check(CheckType.NORMAL)
//def void checkAssignmentToInPort(Assignment asgn)
//  {
//  val vName = asgn.lhs.value.id
//  if (vName instanceof DataPort && !(vName as DataPort).out)
//    fError('May not assign to in data port.',asgn,
//      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)   
//  if (vName instanceof EventDataPort && !(vName as EventDataPort).out)
//    fError('May not assign to in event data port.',asgn,
//      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)   
//  if (vName instanceof EventPort && !(vName as EventPort).out)
//    fError('May not assign to in event port.',asgn,
//      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)   
//  if (vName instanceof Parameter && !(vName as Parameter).out)
//    fError('May not assign to in parameter.',asgn,
//      BLESSPackage::eINSTANCE.assignment_Lhs, IssueCodes.ASSIGNMENT_TO_IN_FEATURE)  
//  }

//@Check(CheckType.NORMAL)
//def void checkInPortValueHasQuestionMark(ValueName vn)
//  {
//  if (vn.id instanceof DataPort || vn.id instanceof EventPort || vn.id instanceof EventDataPort) 
//    if (!vn.q && !vn.fresh && !vn.count && !vn.updated && vn.inBehaviorActions) 
//        fError('Values of in ports must use ?, fresh, count, or updated.',vn,
//          BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.NEEDS_QUESTION_MARK) 
//  }

//@Check(CheckType.NORMAL)
//def void checkPortIndexIsNaturalLiteral(ValueName vn)
//  {
//  if (vn.id instanceof DataPort || vn.id instanceof EventPort || vn.id instanceof EventDataPort)  
//    if (vn.array_index !== null && vn.array_index.size > 0)
//      {
//      if (vn.array_index.size > 1)  
//        fError('Port arrays are one dimensional.',vn,
//          BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.PORT_ARRAY_INDEX_ERROR) 
//      else if (vn.array_index.head instanceof ANumber)
//        {
//        val num = vn.array_index.head as ANumber
//        if (num.lit !== null && (num.lit.contains('.') || num.lit.contains('-') ))  
//          fError('Port array index must be natural literal.',vn,
//            BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.PORT_ARRAY_INDEX_ERROR) 
//        }   
//      else
//        fError('Port array index must be natural literal.',vn,
//          BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.PORT_ARRAY_INDEX_ERROR) 
//      }
//  }

//@Check(CheckType.NORMAL)
//def void checkWhileLoopInvariantIsNameless(WhileLoop wl)
//  {
//  if (wl.invariant && !(wl.inv instanceof NamelessAssertion))
//    fError('Invariant of while loop must be nameless',wl,
//            BLESSPackage.eINSTANCE.whileLoop_Inv, IssueCodes.LOOP_INVARIANTS_MUST_BE_NAMELESS)     
//  }
//
//@Check(CheckType.NORMAL)
//def void checkForLoopInvariantIsNameless(ForLoop fl)
//  {
//  if (fl.inv !==null && !(fl.inv instanceof NamelessAssertion))
//    fError('Invariant of for loop must be nameless',fl,
//            BLESSPackage.eINSTANCE.forLoop_Inv, IssueCodes.LOOP_INVARIANTS_MUST_BE_NAMELESS)     
//  }
//
//@Check(CheckType.NORMAL)
//def void checkDoUntilLoopInvariantIsNameless(DoUntilLoop dul)
//  {
//  if (dul.invariant && !(dul.inv instanceof NamelessAssertion))
//    fError('Invariant of do-unitl loop must be nameless',dul,
//            BLESSPackage.eINSTANCE.doUntilLoop_Inv, IssueCodes.LOOP_INVARIANTS_MUST_BE_NAMELESS)     
//  }

/////////////////////////  STATE MACHINES   \\\\\\\\\\\\\\\\\\\\\\\

@Check(CheckType.NORMAL)
def void checkTimeoutBehaviorTimeHasTimeUnits(DispatchTrigger dt)
  {
  if (dt.time !== null)
    {
    val ur = dt.time.getUnitRecord
    if (ur === null)
    	fError('No unit definition found for timeout duration.',dt,
						BLESSPackage.eINSTANCE.dispatchTrigger_Time, IssueCodes.UNIT_DEFINITION_NOT_FOUND) 
    else if (ur.rootUnit === null || ur.rootUnit.name === null)
      fError('Timeout dispatch trigger has no root unit.',dt,
            BLESSPackage.eINSTANCE.dispatchTrigger_Time, IssueCodes.MUST_HAVE_TIME_UNITS)             
    else if (!ur.rootUnit.name.equals('s'))
    	fError('Timeout dispatch trigger must have time units, but has unit \''+ur.rootUnit.name+'\'.',dt,
						BLESSPackage.eINSTANCE.dispatchTrigger_Time, IssueCodes.MUST_HAVE_TIME_UNITS) 						
		}
  }


//getting strange error about TypeOrReference
//@Check(CheckType.NORMAL)
//def void checkExecuteConditionsAreBoolean(BehaviorTransition bt)
//  {
//  if (bt.execute !== null) 
//    if (!(bt.execute.eor.getType instanceof BooleanType))
//      fError('Execute conditions must have boolean type.',bt,
//            BLESSPackage.eINSTANCE.behaviorTransition_Execute, IssueCodes.TYPE_MUST_BE_BOOLEAN)             
//  }
//
//@Check(CheckType.NORMAL)
//def void checkEBooleanExpressionsAreBoolean(BooleanExpression be)
//  {
//   if (!(be.getType instanceof BooleanType))
//      fError('Execute conditions must have boolean type.',be,
//            BLESSPackage.eINSTANCE.behaviorTransition_Execute, IssueCodes.TYPE_MUST_BE_BOOLEAN)             
//  }

@Check(CheckType.NORMAL)
def void 
checkExecuteConditionsHaveNoTickAtOrCaret(TimedExpression te)
  {  //is it in an execute condition?
  var parent = te.eContainer
  while (parent !==null && !(parent instanceof ExecuteCondition))
    parent = parent.eContainer
  if (parent instanceof ExecuteCondition)
    if (te.tick !== null) 
      fError('Execute conditions may not have \'.',te,
            BLESSPackage.eINSTANCE.timedExpression_Tick, IssueCodes.ILLEGAL_TIME_OPERATOR)             
    else if (te.at) 
      fError('Execute conditions may not have @.',te,
            BLESSPackage.eINSTANCE.timedExpression_At, IssueCodes.ILLEGAL_TIME_OPERATOR)             
    else if (te.caret) 
      fError('Execute conditions may not have ^.',te,
            BLESSPackage.eINSTANCE.timedExpression_Caret, IssueCodes.ILLEGAL_TIME_OPERATOR)              
  }

@Check(CheckType.NORMAL)
def void 
checkTimedExpressionNotInAssertion(TimedExpression te)
  {  
  if (!te.inAssertion)
    if (te.tick !== null) 
      fError('Actions may not have \'.',te,
            BLESSPackage.eINSTANCE.timedExpression_Tick, IssueCodes.ILLEGAL_TIME_OPERATOR)             
    else if (te.at) 
      fError('Actions may not have @.',te,
            BLESSPackage.eINSTANCE.timedExpression_At, IssueCodes.ILLEGAL_TIME_OPERATOR)             
    else if (te.caret) 
      fError('Actions may not have ^.',te,
            BLESSPackage.eINSTANCE.timedExpression_Caret, IssueCodes.ILLEGAL_TIME_OPERATOR)              
  }

@Check(CheckType.NORMAL)
def void 
checkOnlyOneStateKind(BehaviorState bs)
  {
  var kindCount = 0
  if (bs.initial)
    kindCount++
  if (bs.complete)
    kindCount++
  if (bs.final)
    kindCount++
  if (bs.mode)
    kindCount++
  if (kindCount > 1)
    warning('State has more than one kind',bs,BLESSPackage.eINSTANCE.statesSection_States)
  }

///////////////////////////   MODES   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

@Check(CheckType.NORMAL)
def void 
checkMixedModeAndCompleteStates(BLESSSubclause sub)
  {
  var hasComplete = false
  var hasMode = false
  if (sub.statesSection !== null)
  for (state : sub.statesSection.states)
    {
    if (state.complete) hasComplete = true
    if (state.mode) hasMode = true
    }
  if (hasComplete && hasMode)
    fError('Complete states and mode states may not be used together',sub,
      BLESSPackage.eINSTANCE.BLESSSubclause_StatesSection)
  }

@Check(CheckType.NORMAL)
def void 
checkThatTransitionsLeavingModeStatesHaveModeConditions(BehaviorTransition bt)
  {
  for (s : bt.sources)  
    if (s.mode && bt.mode === null)
    fError('Transition leaving mode state \''+s.name+'\' must have mode condition.',bt,
      BLESSPackage.eINSTANCE.behaviorTransition_Sources)   
  }

@Check(CheckType.NORMAL)
def void 
checkThatTransitionsWithModeConditionsLeaveModeStates(BehaviorTransition bt)
  {
  if (bt.mode !== null)
  for (s : bt.sources)  
    if (!s.mode)
    fError('Transitions having mode conditions must leave mode states.  \''+
      s.name+'\' is not mode state.',bt,
      BLESSPackage.eINSTANCE.behaviorTransition_Sources)   
  }

@Check(CheckType.NORMAL)
def void 
checkThatModeStatesAreReallyModes(StatesSection ss)
  {
  val modes = ss.getModes
  for (state : ss.states)
    if (state.mode)  //is it a mode state?
    {
    var hasMode = false
    for (m : modes)
      if (m.name == state.name)
        hasMode = true
    if (!hasMode)
      fError('Mode state \''+
      state.name+'\' is not a mode of this component:'+modes.toString,ss,
      BLESSPackage.eINSTANCE.statesSection_St)       
    }
  }

@Check(CheckType.NORMAL)
def void 
checkThatEventTriggerNamesASubcomponent(EventTrigger et)
  {
  val subcomponent = et.getSubcomponentFromListOfIDs(et.sub) 
  if (subcomponent === null)
    fError('Event trigger must specify a subcomponent.',et,
      BLESSPackage.eINSTANCE.eventTrigger_Sub)
  }

///////////////////////////  CODE GENERATION   \\\\\\\\\\\\\\\\\\\\\\\\

@Check(CheckType.NORMAL)
def void 
checkPortNamesForCodegen(DispatchTrigger dt)
  {
  if (dt.port !== null)
    {
    if (dt.port.port.name !==null && dt.port.port.name.equalsIgnoreCase("halt"))
      fWarning('"halt" should not be used as a port name due to code generation name conflict.',
        dt, BLESSPackage.eINSTANCE.dispatchTrigger_Port )
    }
  }

//@Check(CheckType.NORMAL)
//def void 
//checkTransitionsHaveSingleSource(BehaviorTransition bt)
//  {
//  if (bt.sources.size > 1) 
//      fWarning('Transitions used for code generation should have a single source state.',
//        bt, BLESSPackage.eINSTANCE.behaviorTransition_Sources )
//  }



///////////////////////////   TYPE FUNCTIONS   \\\\\\\\\\\\\\\\\\\\\\\\

def boolean isBoolean(Type t)
  {t instanceof BooleanType}
  

def boolean isScalar(Type t)  
  {
  return t.isQuantity && (t as QuantityType).scalar!==null
//  return t.isQuantity && (t as QuantityType).scalar
  }

def boolean isQuantity(Type t)
  { return t instanceof QuantityType }

def boolean isNull(Type t)
  { return t instanceof NullType }


def boolean hasNestedAt(TimedExpression s) 
  {
  var EObject container = s.eContainer
  while (container !== null)
    {
    if (container instanceof TimedExpression && (container as TimedExpression).at)
      return true
    container = container.eContainer
    }
  false 
  }

def Type getType(AssertionFunctionValue afv)
  {
  afv.cexp?.getType?:
  afv.pexp?.getType 
  }
  
def Type getType(ConditionalAssertionFunction afv)
  {
  val cafType = afv.cvp.head.expression.getType
  for (p : afv.cvp)
    if (!cafType.sameStructuralType(p.expression.getType))
      fError('Mismatched expression type of condition-value pairs',p,
        BLESSPackage::eINSTANCE.conditionValuePair_Expression, IssueCodes.INCOMPATIBLE_TYPES)
  cafType
  }

def Type getType(PeriodShift a)
  {
  a.v?.getType
  a.index_expression?.getType 
  } 
  
def Type getType(IndexExpression a) 
  {
  if (!a.l.isWhole)
    fError('Terms of index expression must have index type',a,
      BLESSPackage::eINSTANCE.indexExpression_L, IssueCodes.MUST_HAVE_INDEX_TYPE) 
  for (r : a.r) 
    if (!r.isWhole)
    fError('Terms of index expression must have index type',a,
      BLESSPackage::eINSTANCE.indexExpression_R, IssueCodes.MUST_HAVE_INDEX_TYPE) 
  a.l.getType
  } 
  
def Type getType(UniversalQuantification a) 
  { 
  if (a.which && !a.condition.getType.isBoolean)
    fError('Condition for universal quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.universalQuantification_Condition )
  if (!a.predicate.getType.isBoolean)
    fError('Predicate for universal quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.universalQuantification_Predicate )
  booleanType
  }
  
def Type getType(Predicate a) 
  { 
  (a as Expression).getType  
  }
  
def Type getType(AssertionNumericExpression a)  
  { 
  (a as Expression).getType  
  }
  
def Type getType(BooleanExpression a) 
  { 
  (a as Expression).getType  
  }
  
def Type getType(NumericExpression a) 
  { 
  (a as Expression).getType  
  }
  
def Type getType(Subexpression a) 
  { 
  a.timed_expression.getType
  }

def Type getType(TimedExpression a)
  {
//check that time subexpression has no @
  if (a.at && a.hasNestedAt)
    fError('Nesting of time expressions (@) disallowed.',
      a, BLESSPackage::eINSTANCE.timedExpression_Time )
  a.subject.getType
  }

def Type getType(TimedSubject a)
  {
  a.ps?.getType ?:
  a.value?.getType ?:
  a.conditional?.getType ?:
  a.record?.getType ?:
  a.invocation?.getType
  }

def Type getType(TypeOrReference tor)
  {
  tor?.ty ?: 
  tor.ref.type
  }
  
def Type getType(ParenthesizedSubexpression e)
  {
  if (e.expression !== null && e.t !== null && e.f !== null)
    {
    if (!e.expression.getType.isBoolean)  
      fError('must have boolean type in conditional expression',e,BLESSPackage::eINSTANCE.parenthesizedSubexpression_Expression)
    if (!e.t.getType.sameStructuralType(e.f.getType))  
      fError('both alternatives in conditional expression must have same type',e,BLESSPackage::eINSTANCE.parenthesizedSubexpression_T)
    return e.t.getType
    }
  if (e.caseexpression !== null)
    return e.caseexpression.getType
  e.expression.getType
  }
  
def Type getType(CaseExpression e)
  {
  val t = e.cc.head.exp.getType
  for (CaseChoice c : e.cc) 
    {
    if (!t.sameStructuralType(c.exp.getType))
      fError('alternatives in case expression must have same type',c,BLESSPackage::eINSTANCE.caseChoice_Exp)
    if (!c.be.getType.isBoolean)  
      fError('must be boolean expression in case choice',c,BLESSPackage::eINSTANCE.caseChoice_Be)
    }
  t 
  }
  
def Type getType(Value e)
  {
  if (e.timeout !== null)
    return booleanType
  if (e.now !== null || e.tops !== null)
    {
    val qt=BLESSFactory.eINSTANCE.createQuantityType
    qt.unit = e.getTimeUnit
    return qt
    }   
  if (e.value_name !== null)
    {
    val t = e.value_name.getType
    if (t === null)
      fError('null type for value',e,BLESSPackage::eINSTANCE.value_Value_name)
    return t
    }
  if (e.constant !== null)
    {
    val t = e.constant.getType
    if (t === null)
      fError('null type for constant',e,BLESSPackage::eINSTANCE.value_Constant)
    return t    
    }
  if (e.enum_val !== null)
    return e.enum_val.enumeration_type.type
//  if (e.port_val !== null) 
//    return (e.port_val.port as Feature).getFeatureType  
  }


def Type getType(ConditionalExpression e)
  {
  if (!e.pred.getType.isBoolean)
    fError('Discriminator (if e) of conditional expression must be boolean.',
        e, BLESSPackage::eINSTANCE.conditionalExpression_Pred )
    if (!e.t.getType.sameStructuralType(e.f.getType))
    fError('Choices of conditional expression  (then x else y) must be have same structural type.',
      e, BLESSPackage::eINSTANCE.conditionalExpression_T, IssueCodes.INCOMPATIBLE_TYPES) 
    val tUnitRecord = e.t.getUnitRecord
    if (tUnitRecord === null)
      fError('\'then\' branch of conditional expression has indeterminate units', e,
        BLESSPackage::eINSTANCE.conditionalExpression_T, IssueCodes.INDETERMINATE_UNITS)     
    val fUnitRecord = e.f.getUnitRecord
    if (fUnitRecord === null)
      fError('\'else\' branch of conditional expression has indeterminate units', e,
        BLESSPackage::eINSTANCE.conditionalExpression_F, IssueCodes.INDETERMINATE_UNITS)     
    if (tUnitRecord !== null && fUnitRecord !== null && !tUnitRecord.matchTopAndBottom(fUnitRecord) )
      fError('Choices of conditional expression (then x else y) must have same root units \''+e.t.getUnitRecord.toString+
         '\' is not \''+e.f.getUnitRecord.toString +"\'", e,
      BLESSPackage::eINSTANCE.conditionalExpression_F, IssueCodes.MISMATCHED_UNITS)     
  e.t.getType
  }

def Type getType(RecordTerm e)
  {
    e.record_type.type
  }

def Type getType(Invocation e)
  {
  if (e.label.pred)
    return booleanType
  if (e.label.func)
    return e.label.tod.getType  
  if (e.label.enumer)
    return booleanType
  }

//def Type getType(TypeOrReference e)
//  {
//  if (e.ty !== null)
//    e.ty  
//  else
//    e.ref.type
//  }
  
def Type getType(ExistentialQuantification a) 
  { 
  if (a.which && !a.condition.getType.isBoolean)
    fError('Condition for existential quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.existentialQuantification_Condition )
  if (!a.predicate.getType.isBoolean)
    fError('Predicate for existential quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.existentialQuantification_Predicate )  
  booleanType
  }

def Type getType(SumQuantification a)
  {
  //check that variables are whole numbers
  for (v : a.variables.lv)
    if (!v.isWhole )
      fError('Logic variables of summing quantification must be whole numbers',
        v,BLESSPackage::eINSTANCE.variable_Tod)
  //check that condition is boolean
  if (a.which && !a.condition.getType.isBoolean)
    fError('Condition for summing quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.sumQuantification_Condition )    
  //check that range is closed and bounds are whole numbers
  if (!a.range.sym.equals('..'))
    fError('Range for summing quantification must be closed (..).',
      a.range, BLESSPackage.eINSTANCE.range_Sym )    
  if (!a.range.lower_bound.isWhole)
    fError('Range lower bound for summing quantification must be whole number.',
      a.range, BLESSPackage::eINSTANCE.range_Lower_bound)    
  if (!a.range.upper_bound.isWhole)
    fError('Range upper bound for summing quantification must be whole number.',
      a.range, BLESSPackage::eINSTANCE.range_Upper_bound)    
  a.numeric_expression.getType
  }

  
def Type getType(ProductQuantification a)
  {
  //check that condition is boolean
  if (a.which && !a.condition.getType.isBoolean)
    fError('Condition for product quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.productQuantification_Condition )    
  //check that range is closed and bounds are whole numbers
  if (!a.range.sym.equals('..'))
    fError('Range for product quantification must be closed (..).',
      a.range, BLESSPackage.eINSTANCE.range_Sym  )    
  if (!a.range.lower_bound.isWhole)
    fError('Range lower bound for product quantification must be whole number.',
      a.range, BLESSPackage::eINSTANCE.range_Lower_bound)    
  if (!a.range.upper_bound.isWhole)
    fError('Range upper bound for product quantification must be whole number.',
      a.range, BLESSPackage::eINSTANCE.range_Upper_bound)    
  //check that numeric expression is scalar
  if (!a.numeric_expression.getType.isScalar)
    fError('Numeric expression for product quantification must be scalar.',
      a, BLESSPackage::eINSTANCE.productQuantification_Numeric_expression )    
  a.numeric_expression.getType    
  }

def Type getType(CountingQuantification a)
  {
  //check that condition is boolean
  if (a.which && !a.condition.getType.isBoolean)
    fError('Condition for counting quantification must have boolean type.',
      a, BLESSPackage::eINSTANCE.countingQuantification_Condition )    
  //check that range is closed and bounds are whole numbers
  if (!a.range.sym.equals('..'))
    fError('Range for counting quantification must be closed (..).',
      a.range, BLESSPackage.eINSTANCE.range_Sym )    
//  if (!a.range.lower_bound.isWhole)
//    fError('Range lower bound for counting quantification must be whole number.',
//      a.range, BLESSPackage::eINSTANCE.range_Lower_bound)    
//  if (!a.range.upper_bound.isWhole)
//    fError('Range upper bound for counting quantification must be whole number.',
//      a.range, BLESSPackage::eINSTANCE.range_Upper_bound)    
  //check that counted is boolean
  if (!a.counted.getType.isBoolean)
    fError('Boolean-typed expression required for counting quantification.',
      a, BLESSPackage::eINSTANCE.countingQuantification_Counted )    
  makeWholeQuantity   
  }

def Type getType(Expression e)
  {
  try
    {
      if (e.sym !== null && e.sym.equals('iff'))
      {
        if (!e.l?.getType.isBoolean)
          fError('Operands of if-and-only-in must be boolean.', e, BLESSPackage::eINSTANCE.expression_L,
            IssueCodes.TYPE_MUST_BE_BOOLEAN)
        if (!e.r?.getType.isBoolean)
          fError('Operands of if-and-only-in must be boolean.', e, BLESSPackage::eINSTANCE.expression_R,
            IssueCodes.TYPE_MUST_BE_BOOLEAN)
        return booleanType
      }
      else if (e.sym !== null && e.sym.equals('implies'))
      {
        if (!e.l?.getType.isBoolean)
          fError('Premise of implication must be boolean.', e, BLESSPackage::eINSTANCE.expression_L,
            IssueCodes.TYPE_MUST_BE_BOOLEAN)
        if (!e.r?.getType.isBoolean)
          fError('Consequent of implication must be boolean.', e, BLESSPackage::eINSTANCE.expression_R,
            IssueCodes.TYPE_MUST_BE_BOOLEAN)
        return booleanType
      }
      if (e.all !== null)
        return e.all.getType
      if (e.exists !== null)
        return e.exists.getType
      if (e.sum !== null)
        return e.sum.getType
      if (e.product !== null)
        return e.product.getType
      if (e.numberof !== null)
        return e.numberof.getType
      if (e.l !== null)
        return e.l.getType
    }
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    null
  }

def Type getType(Conjunction e)
  {
  if (e.sym !== null) // && e.sym.equals('and'))
    {
    if (!e.l.getType.isBoolean)
      fError('Operands of conjunction must be boolean.',
        e, BLESSPackage::eINSTANCE.conjunction_L, IssueCodes.TYPE_MUST_BE_BOOLEAN)  
    for (r : e.r)  
      if (!r.getType.isBoolean)
        fError('Operands of conjunction must be boolean.',
          e, BLESSPackage::eINSTANCE.conjunction_R, e.r.indexOf(r))  
    }
  e.l.getType
  }

def Type getType(Disjunction e)
  {
  if (e.sym !== null) // && (e.sym.equals('or') || e.sym.equals('xor')))
    {
    if (!e.l.getType.isBoolean)
      fError('Operands of disjunction must be boolean.',
        e, BLESSPackage::eINSTANCE.disjunction_L, IssueCodes.TYPE_MUST_BE_BOOLEAN)  
    for (r : e.r)  
      if (!r.getType.isBoolean)
        fError('Operands of disjunction must be boolean.',
          e, BLESSPackage::eINSTANCE.disjunction_R, e.r.indexOf(r))  
    }
  e.l.getType
  }

def Type getType(Relation e)
  {
  val ltype = e.l.getType  
  if (e.sym !== null) 
//    return booleanType
    {
    val rtype = e.r.getType
    if (ltype.isBoolean)
      fError('Operands of '+e.sym+' must not be boolean.  Use \'iff\' instead of =',
        e, BLESSPackage::eINSTANCE.relation_L, IssueCodes.MUST_NOT_BE_BOOLEAN)  
    if (rtype.isBoolean)
      fError('Operands of '+e.sym+' must not be boolean.  Use \'iff\' instead of =',
        e, BLESSPackage::eINSTANCE.relation_R, IssueCodes.MUST_NOT_BE_BOOLEAN)  
//null matches all types
    if (rtype.isNull || ltype.isNull)
          return booleanType
    if (ltype.isQuantity && rtype.isQuantity && !e.l.getUnitRecord.matchTopAndBottom(e.r.getUnitRecord))
      fError('Operands of '+e.sym+' must have root base units \''+e.l.getUnitRecord.toString+
           '\' is not \''+e.r.getUnitRecord.toString, 
        e,BLESSPackage.eINSTANCE.relation_Sym, IssueCodes.MISMATCHED_UNITS) 
    else if (!ltype.sameStructuralType(rtype)) 
      fError('Operands of '+e.sym+' must be have compatible types.'+
            ltype.typeString+" is not "+rtype.typeString , 
        e,BLESSPackage.eINSTANCE.relation_Sym, IssueCodes.INCOMPATIBLE_TYPES)            
    return booleanType
    } 
  if (e.in !== null)
    {
    if (!ltype.isQuantity)
      fError('lhs of \'in\' must be quantity type.',
          e, BLESSPackage::eINSTANCE.relation_L, IssueCodes.MUST_BE_QUANTITY)  
    //check range
    if (!e.range.lower_bound.getType.isQuantity)
       fError('Lower bound of range must be have quantity type.',
          e.range, BLESSPackage::eINSTANCE.range_Lower_bound, IssueCodes.MUST_BE_QUANTITY)  
    else if (!e.l.getUnitRecord.matchTopAndBottom(e.range.lower_bound.getUnitRecord))
        fError('Lower bound of range must have same root units as subject \''+e.l.getUnitRecord.toString+
           '\' is not \''+e.range.lower_bound.getUnitRecord.toString, 
           e, BLESSPackage::eINSTANCE.range_Lower_bound, IssueCodes.MISMATCHED_UNITS)     
    if (!e.range.upper_bound.getType.isQuantity)
        fError('Upper bound of range must be have quantity type.',
          e.range, BLESSPackage::eINSTANCE.range_Upper_bound, IssueCodes.MUST_BE_QUANTITY)  
    else if (!e.l.getUnitRecord.matchTopAndBottom(e.range.upper_bound.getUnitRecord))
        fError('Upper bound of range must have same root units as subject \''+e.l.getUnitRecord.toString+
           '\' is not \''+e.range.upper_bound.getUnitRecord.toString, 
           e, BLESSPackage::eINSTANCE.range_Upper_bound, IssueCodes.MISMATCHED_UNITS)     
    return booleanType
    }   
  ltype
  }
  
def Type getType(Exp e)
  {
  if (e.r !== null)
    {
    if (!(e.l.getType instanceof QuantityType))
      fError('Operands of ** must be have same structural type.',
        e, BLESSPackage::eINSTANCE.exp_L, IssueCodes.MUST_BE_QUANTITY)  
      if (!(e.r.getType instanceof QuantityType))
      fError('Operands of ** must be have same structural type.',
        e, BLESSPackage::eINSTANCE.exp_R, IssueCodes.MUST_BE_QUANTITY)  
    }
  e.l.getType   
  }
  
  
def Type getType(MultDiv e)
  {  
  if (e.sym !== null)
    {
    if (!(e.l.getType instanceof QuantityType))
      fError('Operands of '+e.sym+' must be have quantity type.',
        e, BLESSPackage::eINSTANCE.multDiv_L, IssueCodes.MUST_BE_QUANTITY)  
    for (r : e.r)
      if (!(r.getType instanceof QuantityType))
      fError('Operands of '+e.sym+' must be have quantity type.',
        e, BLESSPackage::eINSTANCE.multDiv_R, e.r.indexOf(r))  
    }
  //compute type with proper quantity?  
  e.l.getType       
  }
  
def Type getType(AddSub e)
  {
  if (e.sym !== null)
    {
    if (!(e.l.getType instanceof QuantityType))
      fError('Operands of '+e.sym+' must be have same structural type.',
        e, BLESSPackage::eINSTANCE.addSub_L, IssueCodes.MUST_BE_QUANTITY)  
    for (r : e.r)
      if (!(r.getType instanceof QuantityType))
      fError('Operands of '+e.sym+' must be have same structural type.',
        e, BLESSPackage::eINSTANCE.addSub_R,  e.r.indexOf(r))  
    }
  e.l.getType           
  }   
 
def Type getType(ValueName a) 
  {
  if (a.fresh || a.updated) return booleanType
  if (a.count) return makeWholeQuantity
  if (a.id instanceof ForallVariable) return makeWholeQuantity
  if (a.id instanceof Variable)
    {
      val aid = a.id as Variable
      val Type nameRootType = aid.tod.getType
      if (a.array_index!==null && a.array_index.size>0) // is it an array name
//      if (a.lb) // is it an array name
      {
        if (!(nameRootType instanceof ArrayType))
          fError('Variable name \'' + aid.name + '\' has array index, but it\'s type is not array', a,
            BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.TYPE_NOT_ARRAY)
        else if (a.array_index.size !== (nameRootType as ArrayType).array_ranges.range.size)
          fError('Variable name \'' + aid.name +
            '\' must have as many array indices, as the dimension of its array type', a.array_index.last,
            BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION)
        if (!a.dot) // no record field reference
          return (nameRootType as ArrayType).typ.getType
        else
          return getType(a.pn, (nameRootType as ArrayType).typ.getType) // get partial name type
      }
      if (!a.dot) // no index, no record field reference
        return nameRootType
      else
        return getType(a.pn, nameRootType) // get partial name type
    }
  if (a.id instanceof GhostVariable)
    {
      val aid = a.id as GhostVariable
      val Type nameRootType = aid.tod.getType
      if (a.lb) // is it an array name
      {
        if (!(nameRootType instanceof ArrayType))
          fError('Ghost Variable name \'' + aid.name + '\' has array index, but it\'s type is not array', a,
            BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.TYPE_NOT_ARRAY)
        else if (a.array_index.size !== (nameRootType as ArrayType).array_ranges.range.size)
          fError('Ghost Variable name \'' + aid.name +
            '\' must have as many array indices, as the dimension of its array type', a.array_index.last,
            BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION)
        if (!a.dot) // no record field reference
          return (nameRootType as ArrayType).typ.getType
        else
          return getType(a.pn, (nameRootType as ArrayType).typ.getType) // get partial name type
      }
      if (a.dot) // no index, no record field reference
        return getType(a.pn, nameRootType) // get partial name type
     return nameRootType   
    }
//  if (a.id instanceof Property)
//    return getType(a.id as Property)
  if (a.id instanceof Feature)
    {
      val aid = a.id as Feature
      val featureType = getType(aid)
      if (featureType === null)
      {
        fError("No feature type found for feature \""+aid.name, a,
          BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.FEATURE_TYPED_ERROR)
        return booleanType
      }
      if (a.lb) // is it an array name
      {
        if (!(featureType instanceof ArrayType))
          fError('Feature name \'' + aid.name + '\' has array index, but it\'s type is not array', a,
            BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.TYPE_NOT_ARRAY)
        else if (a.array_index.size !== (featureType as ArrayType).array_ranges.range.size)
          fError('Feature name \'' + aid.name +
            '\' must have as many array indices, as the dimension of its array type', a.array_index.last,
            BLESSPackage::eINSTANCE.valueName_Array_index, IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION)
        if (!a.dot) // no record field reference
          return (featureType as ArrayType).typ.getType
        else
          return getType(a.pn, (featureType as ArrayType).typ.getType) // get partial name type
      }
      if (!a.dot) // no index, no record field reference
        return featureType
      else
        return getType(a.pn, featureType) // get partial name type
    }
  if (a.id instanceof SubprogramSubcomponent)  
    {
    val sub = a.id as SubprogramSubcomponent  
    val st = sub.subprogramSubcomponentType as SubprogramTypeImpl
    //check that all but the last are in parameters
    for (feat : st.ownedParameters)
        if ((feat!=st.ownedParameters.last)&&(feat as Parameter).out)
        fError('Subprogram \'' + a.id.name + ' feature \'' + //feat.name+
            '\' must be \'in\' parameter', a,
            BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.SUBPROGRAMS_USED_AS_FUNCTIONS)
    val outParameter = st.ownedParameters.last
        if (!(outParameter as Parameter).out)
        fError('Subprogram \'' + a.id.name + ' feature \''+outParameter.name+
            '\' must be \'in\' parameter', a,
            BLESSPackage::eINSTANCE.valueName_Id, IssueCodes.SUBPROGRAMS_USED_AS_FUNCTIONS)   
    getType(outParameter)
    }
}  //end of getType(ValueName a) 

def Type getType(Iterable<PartialName> pn, Type typ)
  {
  if (typ instanceof RecordType)
    { 
    if ((typ as RecordType).variant)
      fWarning('Using variant/union types requires run-time type checks which may not be enforced',pn.head,
        BLESSPackage::eINSTANCE.partialName_Record_id, IssueCodes.VARIANT_TYPES_DISCOURAGED)
    for (field :(typ as RecordType).fields)
      if (field.label.equals(pn.head.record_id))
        if (pn.size === 1 && !pn.head.lb)  //just record w/o array?
          return field.typ.getType
        else if (pn.head.lb)
          {  //the partial name has array index list
            val fieldType = field.typ.getType
            if (!(fieldType instanceof ArrayType))
              fError(
                'Variable field \'' + pn.head.record_id +
                  '\' has array index, but it\'s type is not array', pn.head,
                BLESSPackage::eINSTANCE.partialName_Record_id, IssueCodes.TYPE_NOT_ARRAY)
            else if (pn.head.array_index.size !== (fieldType as ArrayType).array_ranges.range.size)
              fError(
                'Variable field \'' + pn.head.record_id +
                  '\' must have as many array indices, as the dimension of its array type',
                pn.head.array_index.last, BLESSPackage::eINSTANCE.valueName_Array_index,
                IssueCodes.INDICES_DONT_MATCH_ARRAY_DIMENSION)
            if (pn.size === 1) // no record field reference
              return (fieldType as ArrayType).typ.getType  //get type of record field array 3/23/2023
            else  // get partial name type 
              return getType(pn.tail, (fieldType as ArrayType).typ.getType)    
          }
        else
          return getType(pn.tail, field.typ.getType)
    }
//  fError('Variable field \''+pn.head.record_id+'\' must have record type',pn.head,
//      BLESSPackage::eINSTANCE.partialName_Record_id, IssueCodes.MUST_HAVE_RECORD_TYPE)  
//  null  
  typ
  }

def Type getType(Constant c)
  {
  if (c.t!==null || c.f!==null) return booleanType
  if (c.string_literal !==null) return stringType
  if (c.nul !== null)return nullType
  c.numeric_constant?.getType ?:
  c.prop?.getType
  }

def Type getType(NonNumericProperty n)
  { 
    n.tod.getType
  }

def Type getType(Quantity q)
  {
    val qt = BLESSFactory.eINSTANCE.createQuantityType
    if (q.unit !== null)
      qt.unit = q.unit 
    else if (q.scalar !== null)
      qt.scalar = 'scalar'
    else if (q.whole !== null)
      qt.whole = 'whole'
    else //look for . in number
      if (q.number.lit !== null)
        {
        if (q.number.lit.contains('.'))
          qt.scalar = 'scalar'
        else
          qt.whole = 'whole'
        }
    else //assume property is scalar
      qt.scalar = 'scalar'  
//    qt.scalar = q.scalar
//    qt.unit = q.unit 
//    if (qt.unit === null) 
//      qt.scalar = true
    return qt    
  }
  
//def Type getType(NumericConstant nc)
//  {
//  if (nc.quantity !== null)
//    {
//    val qt = BLESSFactory.eINSTANCE.createQuantityType
//    qt.scalar = nc.quantity.scalar
//    qt.unit = nc.quantity.unit 
//    if (qt.unit === null) 
//      qt.scalar = true
//    return qt
//    }
//  else if (nc.propertyConstant !== null)
//    {
//    val a = nc.propertyConstant as PropertyConstant
//    if (a.referencedPropertyType !== null)
//      return a.referencedPropertyType.getType 
//    if (a.ownedPropertyType !== null)
//      return a.ownedPropertyType.getType 
//    }
//  else if (nc.property !== null)
//    {//return nc.property.getType
//    val a = nc.property as PropertyReference
//    return a.getUnitRecord.toQuantityType
//    }
//  }

//def Type getType(Property p)
//  {
//  return PropertyUtil.getType(p)    
//  }

def Type getType(Feature f)
  {
  f.getFeatureType  
  }


def Type getType(EnumerationValue ev)
  {
    ev.enumeration_type.type
  }

def Type getType(Variable v)
  {
  v.tod?.ty ?:
  v.tod.ref.type 
  }
  
////////////////////////   GET UNIT RECORD   ///////////////////////////////

def UnitRecord getUnitRecord(AddSub a) 
  {
    val retval = a.l.getUnitRecord
    try
    {
      if (cacheUnits && unitRecordMap.containsKey(a))
        return unitRecordMap.get(a)
      if (retval === null)
        fError('unit not found:  ' + a.l.toString.substring(36,a.l.toString.indexOf('@')), 
          a, BLESSPackage.eINSTANCE.addSub_L,
          IssueCodes.UNIT_DEFINITION_NOT_FOUND)
      if (a.sym === null)
        return retval
      for (r : a.r)
        {
        val runit = r.getUnitRecord  
        if (!retval.matchTopAndBottom(runit))
          fError(
            'Unit mismatch for ' + a.sym + ' :  ' + retval.toString + ' is not ' + runit.toString,
            a, BLESSPackage.eINSTANCE.addSub_Sym, IssueCodes.MISMATCHED_UNITS)
        }
      if (cacheUnits) unitRecordMap.put(a, retval)
    }
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    retval
  }

def UnitRecord getUnitRecord(MultDiv a) 
  {
    if (cacheUnits && unitRecordMap.containsKey(a))
      return unitRecordMap.get(a)
    var retval = a.l.getUnitRecord
    try
    {
      if (retval === null)
        fError('unit not found:  ' + a.l.toString.substring(36,a.l.toString.indexOf('@')), 
          a, BLESSPackage.eINSTANCE.multDiv_L,
          IssueCodes.UNIT_DEFINITION_NOT_FOUND)
      if (a.sym === null)
        return retval
      if (a.sym !== null)
        if (a.sym.equals('*'))
          for (rval : a.r)
            retval.multiply(rval.getUnitRecord)
        else if (a.sym.equals('/'))
          retval.divide(a.r.head.getUnitRecord)
        else if (a.sym.equals('div') || a.sym.equals('mod'))
        { // check that each is a whole number
          if (!a.l.getUnitRecord.isWhole)
            fError('Operands of \'' + a.sym + '\' must be whole numbers.', a, BLESSPackage::eINSTANCE.multDiv_L,
              IssueCodes.MUST_BE_WHOLE_NUMBER)
          if (!a.r.head.getUnitRecord.isWhole)
            fError('Operands of \'' + a.sym + '\' must be whole numbers.', a, BLESSPackage::eINSTANCE.multDiv_R,
              IssueCodes.MUST_BE_WHOLE_NUMBER)
        }
      if (cacheUnits) unitRecordMap.put(a, retval)
    }
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    retval
  }

def UnitRecord getUnitRecord(Exp a)
  {
    if (cacheUnits && unitRecordMap.containsKey(a))
      return unitRecordMap.get(a)
    var retval = a.l.getUnitRecord
    try
    {
      if (retval === null)
        fError('unit not found:  ' + a.l.toString.substring(36,a.l.toString.indexOf('@')), 
          a, BLESSPackage.eINSTANCE.exp_L,
          IssueCodes.UNIT_DEFINITION_NOT_FOUND)
      if (a.sym === null)
        return retval
      if (a.r !== null && !a.r.getType.isScalar)
        fError('Exponents must be scalar.', a, BLESSPackage::eINSTANCE.exp_L, IssueCodes.MUST_BE_SCALAR)
      if (a.r !== null && a.r instanceof Quantity)
      {
        val exponent = (a.r as Quantity).number.lit
        if (exponent.contains('.') || exponent.contains('-'))
          fWarning('Exponents must be positive whole numbers for unit determination', a, BLESSPackage::eINSTANCE.exp_L,
            IssueCodes.MUST_BE_SCALAR)
        val exponent_as_int = Integer.parseInt(exponent)
        var newRetVal = retval
        for (var i = 1; i < exponent_as_int; i++)
          newRetVal.multiply(retval)
        retval = newRetVal
      }
      else
        fError('Operands of ** must be whole scalar.', a, BLESSPackage::eINSTANCE.exp_R, IssueCodes.MUST_BE_SCALAR)
    }
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    retval
  }
  
def UnitRecord getUnitRecord(Subexpression a) 
  {
  if (a.unary !== null)
    if (a.unary.truncate !== null || a.unary.round !== null)
      if (a.timed_expression.getUnitRecord.isScalar)
        return whole
  a.timed_expression.getUnitRecord
  }
 
def UnitRecord getUnitRecord(TimedExpression a)  
  {
  a.subject.getUnitRecord
  }
 
def UnitRecord getUnitRecord(TimedSubject a)  
  {
  a.ps?.getUnitRecord ?:  
  a.value?.getUnitRecord ?: 
  a.conditional?.getUnitRecord ?: 
  a.record?.getUnitRecord ?:  
  a.invocation?.getUnitRecord   
  }
 
def UnitRecord getUnitRecord(ParenthesizedSubexpression a)  
  {
  nan
  a.t?.getUnitRecord?: 
  a.expression?.getUnitRecord?: 
  a.caseexpression?.cc.head.exp.getUnitRecord 
  }
  
def UnitRecord getUnitRecord(Expression a) 
  {
    if (cacheUnits && unitRecordMap.containsKey(a))
      return unitRecordMap.get(a)
    var retval = nan
    try
    {
      if (a.sum !== null)
        retval = a.sum.getUnitRecord
      else if (a.product !== null)
        retval = a.product.getUnitRecord
      else if (a.numberof !== null)
        retval = a.numberof.getUnitRecord
      else if (a.sym !== null)
        retval = nan
      else if (a.l !== null)
        retval = a.l.getUnitRecord
      if (retval !== null)
        if (cacheUnits) unitRecordMap.put(a, retval)
    if (retval===null)
      throw new ValidationException("no unit record found for expression")
    }
    catch (ValidationException ve) {ve.handleException}
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    retval
  }
  
def UnitRecord getUnitRecord(Disjunction a) 
  {
  if (a.sym !== null)
    nan
  else a.l.getUnitRecord
  }
  
def UnitRecord getUnitRecord(Conjunction a) 
  {
  if (a.sym !== null)
    nan
  else a.l.getUnitRecord
  }
  
def UnitRecord getUnitRecord(Relation a) 
  {
  if (a.sym !== null || a.in !== null)
    nan
  else a.l.getUnitRecord
  }
  
def UnitRecord getUnitRecord(Value a) 
  {
    if (cacheUnits && unitRecordMap.containsKey(a))
      return unitRecordMap.get(a)
    var retval = scalar
    try
    {
      if (a.value_name !== null)
        retval = a.value_name.getUnitRecord
      if (a.constant !== null)
        retval = a.constant.getUnitRecord
      if (a.enum_val !== null)
        retval = nan
      if (a.now !== null || a.tops !== null)
      {
        val qt = BLESSFactory.eINSTANCE.createQuantityType
        qt.unit = a.getTimeUnit
        retval = qt.getUnitRecord
      }
//  if (retval === null)
//    error('unit not found for Value',a.eContainingFeature)
//  else 
      if (retval !== null)
        if (cacheUnits) unitRecordMap.put(a, retval)
    }
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    retval
  }
  
def UnitRecord getUnitRecord(ConditionalExpression a) 
  {
  if (cacheUnits && unitRecordMap.containsKey(a))
    return unitRecordMap.get(a)
  val retval = a.t.getUnitRecord 
  if (!retval.matchTopAndBottom(a.f.getUnitRecord))
    fError('True branch base units of \''+retval.toString+'\'; false branch has base units of \''+a.f.getUnitRecord.toString+'\'',
           a, BLESSPackage::eINSTANCE.conditionalExpression_F, IssueCodes.MISMATCHED_UNITS)  
  if (cacheUnits) unitRecordMap.put(a,retval)    
  retval
  }
  
def UnitRecord getUnitRecord(RecordTerm a) 
  {
  if (cacheUnits && unitRecordMap.containsKey(a))
    return unitRecordMap.get(a)
  val retval = nan
  if (cacheUnits) unitRecordMap.put(a,retval)    
  retval
  }
  
def UnitRecord getUnitRecord(Invocation a) 
  {
    if (cacheUnits && unitRecordMap.containsKey(a))
      return unitRecordMap.get(a)
    var retval = scalar
    try
    {
      if (a.label.tod !== null)
        if (a.label.tod.getType instanceof QuantityType)
        {
          val t = a.label.tod.getType as QuantityType
          if (t.unit !== null)
            retval = toUnitRecord(t.unit)
        // o.w. leave as scalar
        }
        else
          fError('Return type of assertion invocation must be quantity type.', a,
            BLESSPackage::eINSTANCE.invocation_Label, IssueCodes.MUST_BE_QUANTITY)
      if (retval === null)
        fError('unit not found for Invocation:  ' + a.label.name, a, BLESSPackage::eINSTANCE.invocation_Label)
      if (cacheUnits) unitRecordMap.put(a, retval)
    }
    catch (Exception ex)
    {
      ex.printStackTrace
    }
    retval
  }
  
def UnitRecord getUnitRecord(SumQuantification a) 
  {
  if (cacheUnits && unitRecordMap.containsKey(a))
    return unitRecordMap.get(a)
  val retval =  a.numeric_expression.getUnitRecord
//  if (cacheUnits) unitRecordMap.put(a,retval)    
  retval
  }
  
def UnitRecord getUnitRecord(ProductQuantification a) 
  {
  if (cacheUnits && unitRecordMap.containsKey(a))
    return unitRecordMap.get(a)
  val retval = a.numeric_expression.getUnitRecord
  if (!retval.isScalar)
    fError('Subject of product must be scalar.',
        a, BLESSPackage::eINSTANCE.productQuantification_Numeric_expression, 
        IssueCodes.MUST_BE_SCALAR)        
  if (cacheUnits) unitRecordMap.put(a,retval)    
  retval
  }
  
def UnitRecord getUnitRecord(CountingQuantification a) 
  {
  if (cacheUnits && unitRecordMap.containsKey(a))
    return unitRecordMap.get(a)
  val retval = whole
  if (cacheUnits) unitRecordMap.put(a,retval)    
  retval
  }
  
def UnitRecord getUnitRecord(ValueName a) 
  {
  var  UnitRecord retval = null
    try {
  if (cacheUnits && unitRecordMap.containsKey(a))
    return unitRecordMap.get(a)
  val itsType=a.getType
  if (itsType instanceof QuantityType)
    retval = (itsType as QuantityType).getUnitRecord
  else
    retval = nan
  if (a.id instanceof Feature)
    {
    val f = a.id as Feature
    val ty = a.type
    if (ty===null)
      fError('No BLESS::Typed property found for feature '+f.name,
            a, BLESSPackage::eINSTANCE.valueName_Id, 
            IssueCodes.MISSING_BLESS_TYPED_PROPERTY) 
    else if (ty instanceof QuantityType) 
      retval = (ty as QuantityType).getUnitRecord
    else if (ty instanceof BooleanType) 
      retval = nan
    else  
      fError('No BLESS::Typed property for feature '+f.name+' must be quantity, not '+ty.typeString+' .',
            a, BLESSPackage::eINSTANCE.valueName_Id, 
            IssueCodes.MUST_BE_QUANTITY)           
//    val Property blessTyped = GetProperties.lookupPropertyDefinition(f, 'BLESS', 'Typed');
//    val String blesstypestring = (blessTyped !== null ? PropertyUtils.getStringValue(f,blessTyped) : '')
//    if (blesstypestring === null || blesstypestring.length === 0 )
//      fError('No BLESS::Typed property found for feature '+f.name,
//            a, BLESSPackage::eINSTANCE.valueName_Id, 
//            IssueCodes.MISSING_BLESS_TYPED_PROPERTY)           
//    else 
//      {
//      val Type ty = blesstypestring.parseBlessType(f.eResource) 
//      }
    }
  if (a.id instanceof Variable) 
    if ((a.id as Variable).tod.getType instanceof QuantityType)
      {
      val t = (a.id as Variable).tod.getType as QuantityType
      retval = t.getUnitRecord
      }
//    else
//      fError('Variables in numeric expressions must be quantity type.',
//            a, BLESSPackage::eINSTANCE.valueName_Id, 
//            IssueCodes.MUST_BE_QUANTITY)           
  if (retval === null)
    fError('unit not found for ValueName',a,BLESSPackage::eINSTANCE.valueName_Id)
  else
  if (retval !== null)
    if (cacheUnits) unitRecordMap.put(a,retval)    
  }
  catch (Exception ex) {ex.printStackTrace}
  retval
  }
  
def UnitRecord getUnitRecord(Constant a) 
  {
  a?.numeric_constant.getUnitRecord ?:
  nan
  }
  
def UnitRecord getUnitRecord(NumericExpression a) 
  {
  (a as Expression).getUnitRecord
  }
  
  
//def UnitRecord getUnitRecord(NumericConstant a) 
//  {
//  if (cacheUnits && unitRecordMap.containsKey(a))
//    return unitRecordMap.get(a)
//  var retval = scalar
//  if (a.quantity !== null && a.quantity.unit !== null)
//      retval = toUnitRecord(a.quantity.unit) 
//  else if (a.quantity !== null && a.quantity.number !== null)
//     {
//     if (!a.quantity.number.contains('.'))  //plain integer?
//       retval = whole
//    //otherwise leave as scalar
//    }
//  else if (a.propertyConstant !== null)
//    {
//    retval = a.propertyConstant.getUnitRecord
//     if (retval === null)
//      fError('unit not found for property constant:  '+a.propertyConstant.qualifiedName(),a,
//        BLESSPackage::eINSTANCE.numericConstant_PropertyConstant )    
//    }
//  else if (a.property !== null)
//    {
//    retval = a.property.getUnitRecord
//    if (retval === null)
//      fError('unit not found for property: '+a.property.pname.qualifiedName(),a,
//        BLESSPackage::eINSTANCE.numericConstant_Property ) 
//    }
//    //o.w. leave as scalar 
//  if (retval !== null)   
//    if (cacheUnits) unitRecordMap.put(a,retval)    
//  retval
//  }

//def UnitRecord getUnitRecord(PropertyConstant a)
//  {
//  if (a.constantValue instanceof RealLiteral)
//    {
//    val rl = a.constantValue as RealLiteral
//    if (rl.unit === null)
//      return scalar  //scalar real
//    else if (BlessMaps.unitMapContainsKey(rl.unit.name))
//      return toUnitRecord(BlessMaps.unitMapGet(rl.unit.name))
//    else
//      {
//      BlessControl.println("No Unit annex definition for \""+rl.unit.name+"\" was found; treated as scalar.")  
////      fError("No Unit annex definition for \""+rl.unit.name+"\" was found; treated as scalar.",a.constantValue,
////        BLESSPackage::eINSTANCE. )    
//      return scalar  //scalar real
//      }
//    }
//  else if (a.constantValue instanceof IntegerLiteral)
//    {
//    val rl = a.constantValue as IntegerLiteral
//    if (rl.unit === null)
//      return whole  //scalar integer isWhole
//    else if (BlessMaps.unitMapContainsKey(rl.unit.name))
//      return toUnitRecord(BlessMaps.unitMapGet(rl.unit.name))
//    else
//      {
//      BlessControl.println("No Unit annex definition for \""+rl.unit.name+"\" was found; treated as scalar.")  
//      return scalar  //scalar 
//      }
//    }
//  else if (a.constantValue instanceof RangeValue)
//    {
//    val rl = a.constantValue as RangeValue
//    if (rl.delta === null)
//      return whole  //scalar integer isWhole
//    else if (rl.delta instanceof RealLiteral)
//      {
//      if ((rl.delta as RealLiteral).unit !== null) 
//        return toUnitRecord(BlessMaps.unitMapGet((rl.delta as RealLiteral).unit.name))
//      else
//        return scalar  //scalar real
//      }
//    else
//       return whole  //scalar integer isWhole
//    }
//  }  //end of getUnitRecord(PropertyConstant
//
//def UnitLiteral getUnitLiteral(Property p)
//  {
//  for (o : p.eContents)
//    if (o instanceof NamedValue && (o as NamedValue).namedValue instanceof PropertyConstant)
//        {
//        val pc = (o as NamedValue).namedValue as PropertyConstant
//        if (pc.constantValue instanceof IntegerLiteral)
//          return (pc.constantValue as IntegerLiteral).unit  
//        else if (pc.constantValue instanceof RealLiteral)
//          return (pc.constantValue as RealLiteral).unit
//        }
//    else if (o instanceof IntegerLiteral)
//      return (o as IntegerLiteral).unit 
//    else if (o instanceof RealLiteral)
//      return (o as RealLiteral).unit  
//  }
//
//def UnitRecord getUnitRecord(Property p)
//  {
//  val UnitLiteral ul = getUnitLiteral(p)  
//  if (BlessMaps.unitMapContainsKey(ul.name))
//      return toUnitRecord(BlessMaps.unitMapGet(ul.name))
//  else
//    return whole  //scalar integer isWhole
//  }
//
//
//def UnitRecord getUnitRecord(PropertyReference a)
//  {
//  if (a.pname !== null)  
//    {
//    val NamedElement ne = a.pname 
//    if (ne instanceof PropertyConstant) 
//      {
//      val PropertyConstant pc = ne as PropertyConstant
//      if (pc.eIsProxy)
//        EcoreUtil.resolve(pc,a.resourceSet)
//      if (pc.referencedPropertyType !== null)
//        return getUnitRecord(pc)
//      }
//    if (ne instanceof Property) 
//      {
//      val Property prop = ne as Property
//      if (prop.eIsProxy)
//        EcoreUtil.resolve(prop,a.resourceSet)
//      if (prop.referencedPropertyType !== null)
//        return getUnitRecord(prop)
//      if (prop.ownedPropertyType !== null) 
//        if (prop.ownedPropertyType instanceof AadlInteger)
//          return whole  //scalar isWhole
//        else if (prop.ownedPropertyType instanceof AadlReal)
//          return scalar  //scalar not isWhole
//      }
//    }
//  if (a.spname !== null)
//    return getUnitRecord(a.spname)
//  if (a.cpname !== null)
//    return getUnitRecord(a.cpname)
//  }


def UnitRecord getUnitRecord(QuantityType a) 
  {
  return a.toUnitRecord
  }

def UnitRecord getUnitRecord(TypeOrReference a)
  {
  if (a.ty !== null && a.ty instanceof QuantityType)
    return (a.ty as QuantityType).getUnitRecord
  else if (a.ref !== null && a.ref.type instanceof QuantityType)
    return (a.ref.type as QuantityType).getUnitRecord
  else return nan
  }

def UnitRecord getUnitRecord(AssertionFunctionValue a)
  {
  if (a.cexp !== null)
    return (a.cexp as ConditionalAssertionFunction).getUnitRecord
  else if (a.pexp !== null)
    return (a.pexp as AssertionNumericExpression).getUnitRecord
  }

def UnitRecord getUnitRecord(AssertionNumericExpression a)
  {
  (a as Expression).getUnitRecord
  }

def UnitRecord getUnitRecord(ConditionalAssertionFunction a)
  {
//TODO:  CHECK THAT ALL EXPRESSIONS HAVE SAME UNIT RECORDS
  return a.cvp.head.expression.getUnitRecord
  }
  
def UnitRecord getUnitRecord(BehaviorTime a)
  {
  if (a.quantity !== null)  
    a.quantity.getUnitRecord 
  else if (a.whole !== null)
    whole
  else if (a.scalar !== null)
    scalar
  else if (a.unit !== null)
    a.unit.toUnitRecord
  else
    a.value.getUnitRecord
  }


 def UnitRecord getUnitRecord(ForallVariable p)
  {
    whole  //scalar integer isWhole
  }

 def UnitRecord getUnitRecord(EnumerationValue p)
  {
    nan  //not a number
  }
  
 def UnitRecord getUnitRecord(Quantity q)
  {
  q?.unit?.toUnitRecord ?:
  scalar
  }  
  
 def UnitRecord getUnitRecord(NameTick a) 
  {
  a.value.getUnitRecord  
  } 
  
////////////////////   WHOLE NUMBERS   \\\\\\\\\\\\\\\\\\\\\\\\\\\  
  
def boolean isWhole(Variable v)  
  {
  return (v.tod.getType instanceof QuantityType) && (v.tod.getType as QuantityType).whole !== null
  }
  
def boolean isWhole(ForallVariable v)  
  {
  true  
  }

def boolean isWhole(PeriodShift ps)
  {
  if (ps.v !== null)
    return ps.v.isWhole
  if (ps.index_expression !== null)
    return ps.index_expression.isWhole
  false
  }
  
def boolean isWhole(IndexExpression ie)
  {
  if (!ie.l.isWhole)
    return false
  for (r : ie.r)
    if (!r.isWhole)
      return false
  true  
  }
  
def boolean isWhole(IndexExpressionOrRange ie)
  {
  if (!ie.left_hand_side.isWhole)
    return false
  if (ie.right_hand_side !== null && !ie.right_hand_side.isWhole)
    return false
  true  
  }
  
def boolean isWhole(Value v)  
  {
  if (v.value_name !== null)
    if (v.value_name.getType instanceof QuantityType)
      return (v.value_name.getType as QuantityType).whole !== null
//  if (v.q) return (v.feature as Feature).isWhole
  if (v.constant !== null) return v.constant.isWhole
  false
  }

def boolean isWhole(Feature f)
  {
//TODO determine isWhole for aadl2::Feature
  true    
  }

def boolean isWhole(Constant c)
  {
  if (c.numeric_constant !== null)
    return isWhole(c.numeric_constant)
  false 
  }
  
def boolean isWhole(Quantity q)
  {
  q.number.isWhole 
  }
  
def boolean isWhole(ANumber n)
  {
    if (n.lit !== null) //is there a decimal point ?
      return !n.lit.contains('.')
    if (n.property !== null)
      return n.property.isWhole
    if (n.propertyConstant !== null)
      return n.propertyConstant.isWhole
  false   
  }

def boolean isWhole(PropertyConstant p) 
  {
//TODO  extract isWhole for property constant   
  true  
  }
  
def boolean isWhole(PropertyReference p) 
  {
//TODO  extract isWhole for property reference    
  true  
  }
  
def boolean isWhole(Subexpression s) 
  {
  if (s.unary !== null)
    if (s.unary.truncate !== null || s.unary.round !== null)
     return true
  s.timed_expression.isWhole
  }
  
def boolean isWhole(TimedExpression e) 
  {
  e.subject.isWhole
  }
  
def boolean isWhole(TimedSubject e) 
  {
  if (e.ps !== null)
    e.ps.isWhole
  else if (e.value !== null)
    e.value.isWhole
  else if (e.conditional !== null)
    e.conditional.isWhole 
  else if (e.record !== null)
    false
//    e.record.isWhole 
  else if (e.invocation !== null)
     e.invocation.isWhole 
  else false  
  }
  
def boolean isWhole(ConditionalExpression e) 
  {
  e.t.isWhole && e.f.isWhole
  }
  
def boolean isWhole(ParenthesizedSubexpression e) 
  {
  if (e.expression !== null)
    e.expression.isWhole 
  else if (e.caseexpression !== null)
    e.caseexpression.isWhole
  else false
  }

def boolean isWhole(CaseExpression e)
  {
  for (casechoice : e.cc) 
    if (!casechoice.exp.isWhole)
      return false
  true
  }
  
def boolean isWhole(Expression e) 
  {
  if (e.sum !== null)
    return e.sum.numeric_expression.isWhole
  if (e.product !== null)
    return e.product.numeric_expression.isWhole
  if (e.numberof !== null)
    return true
  if (e.sym !== null)  //iff or implies
    return false
  e.l.isWhole
  }

def boolean isWhole(Disjunction e)
  {
  if (e.sym !== null)  //or or xor
    return false
  e.l.isWhole   
  }

def boolean isWhole(Conjunction e)
  {
  if (e.sym !== null)  //and or then
    return false
  e.l.isWhole   
  }

def boolean isWhole(Relation e)
  {
  if (e.sym !== null || e.in !== null)  //= etc or in
    return false
  e.l.isWhole   
  }

def boolean isWhole(AddSub e)
  {
  if (!e.l.isWhole)
    return false
  for (r : e.r)
    if (!r.isWhole)
      return false
  true  
  }

def boolean isWhole(MultDiv e)
  {
  if (!e.l.isWhole)
    return false
  for (r : e.r)
    if (!r.isWhole)
      return false
  true      
  }

def boolean isWhole(Exp e)
  {
  if (e.r === null)
    e.l.isWhole
  else e.l.isWhole && e.r.whole
  }
  
def boolean isWhole(NumericExpression e) 
  {
  (e as Expression).isWhole 
  }
  
def boolean isWhole(Invocation e) 
  {

  true  
  }


	
}
