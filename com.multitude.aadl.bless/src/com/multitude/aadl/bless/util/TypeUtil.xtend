package com.multitude.aadl.bless.util

import com.google.inject.Inject
import com.multitude.aadl.bless.BlessControl
import com.multitude.aadl.bless.bLESS.AddSub
import com.multitude.aadl.bless.bLESS.ArrayRange
import com.multitude.aadl.bless.bLESS.ArrayRangeList
import com.multitude.aadl.bless.bLESS.ArrayType
import com.multitude.aadl.bless.bLESS.BLESSFactory
import com.multitude.aadl.bless.bLESS.BooleanType
import com.multitude.aadl.bless.bLESS.EnumerationType
import com.multitude.aadl.bless.bLESS.Exp
import com.multitude.aadl.bless.bLESS.MultDiv
import com.multitude.aadl.bless.bLESS.Quantity
import com.multitude.aadl.bless.bLESS.QuantityType
import com.multitude.aadl.bless.bLESS.RecordField
import com.multitude.aadl.bless.bLESS.RecordType
import com.multitude.aadl.bless.bLESS.Relation
import com.multitude.aadl.bless.bLESS.StringType
import com.multitude.aadl.bless.bLESS.Subexpression
import com.multitude.aadl.bless.bLESS.Type
import com.multitude.aadl.bless.bLESS.TypeOrReference
import com.multitude.aadl.bless.bLESS.UnitName
import com.multitude.aadl.bless.bLESS.Value
import com.multitude.aadl.bless.exception.ParseException
import com.multitude.aadl.bless.maps.BlessMaps
import com.multitude.aadl.bless.parsing.TypeAnnexParser
import org.eclipse.emf.ecore.EObject
import org.osate.aadl2.EventPort
import org.osate.aadl2.Feature
import org.osate.aadl2.StringLiteral
import org.osate.aadl2.modelsupport.util.AadlUtil
import org.osate.aadl2.Aadl2Package
import com.multitude.aadl.bless.scoping.BlessIndex
import com.multitude.aadl.bless.bLESS.ANumber

class TypeUtil {

@Inject extension UnitUtil
@Inject extension BlessUtil
@Inject extension BlessIndex
//@Inject extension PropertyUtil

def Type booleanType() { BLESSFactory.eINSTANCE.createBooleanType }
def Type stringType() {BLESSFactory.eINSTANCE.createStringType}
def Type nullType() {BLESSFactory.eINSTANCE.createNullType}


   def boolean sameStructuralType(Type a, Type b)
     {
     	//enumeration types are the same if they have the same identifiers
     	if (a instanceof EnumerationType && b instanceof EnumerationType )
     	  return (a as EnumerationType).defining_enumeration_literal.
     	     elementsEqual((b as EnumerationType).defining_enumeration_literal)
     	//quantity types are the same if their units have the same kind
     	if (a instanceof QuantityType && b instanceof QuantityType )
        return true
//     	  return (a as QuantityType).unit.sameUnitRoot((b as QuantityType).unit)
//      if (a instanceof IndexType && b instanceof IndexType )
//     	  return true
     	//array types are the same if they have the same length and element type
     	if (a instanceof ArrayType && b instanceof ArrayType )
     	  return (a as ArrayType).array_ranges.sameArrayRangeLists((b as ArrayType).array_ranges)
     	    && (a as ArrayType).typ.getType.sameStructuralType((b as ArrayType).typ.getType)
     	if (a instanceof RecordType && b instanceof RecordType )
     	  return (a as RecordType).fields.forall[ f | (b as RecordType).recordHasFieldWith(f.label,f.typ.getType)]
      if (a instanceof BooleanType && b instanceof BooleanType )
     	  return true
      if (a instanceof StringType && b instanceof StringType )
     	  return true
     	return false;
     }
	
	 def Type getType(TypeOrReference tod)
	   {
	   	tod?.ty
	   	tod?.ref.type
	   }
	
   def boolean sameArrayRangeLists(ArrayRangeList c, ArrayRangeList d)
    {
    	if (c.range.size != d.range.size)
    	  return false;
    	for (var i=0;i<c.range.size;i++)
    	  {
    	  if (!c.range.get(i).sameArrayRange(d.range.get(i))) 
    	    return false 
    	  }
    	true
    }
 
   def boolean sameArrayRange(ArrayRange e, ArrayRange f) 
     {
     return e.lb.getStringValue.equals(f.lb.getStringValue) 
       && e.ub.getStringValue.equals(f.ub.getStringValue)  
     } 
   
   def String getStringValue(ANumber n)
     {
     n?.lit 
     n?.property.pname.name 
     n?.propertyConstant.name
     }
     
   def boolean recordHasFieldWith(RecordType r, String label, Type typ) 
     {
     r.fields.exists[ u | u.label.equalsIgnoreCase(label) && u.typ.getType.sameStructuralType(typ)]	
     } 
     
//   def boolean variantHasFieldWith(VariantType r, String label, Type typ) 
//     {
//     r.fields.exists[ u | u.label.equalsIgnoreCase(label) && u.typ.getType.sameStructuralType(typ)]	
//     } 


  def boolean quantityTypesHaveSameUnits(QuantityType a, QuantityType b)
    {
      if (a.scalar!==null && b.scalar!==null)
//      if (a.isScalar && b.isScalar)
     	  return true
      if (a.unit === null || a.unit.equals(nullUnitName))
     	  return false
      if (b.unit === null || b.unit.equals(nullUnitName))
     	  return false
      if (a.unit.equals(b.unit))
    	    return true;
    	//otherwise
    	false
    }

  def UnitName getUnitName(Quantity q)
	{
		q.unit ?: nullUnitName
	}
	
//identifier regular expression
  val String idregex = "[a-zA-Z][[_]?[a-zA-Z0-9]]*"

  def Type getFeatureType(Feature f)  
    {
    if (BlessMaps.typeMapIsNull)
      BlessMaps.makeTypeMap(getVisibleTypeDeclarations(f.eResource))
    if (f instanceof EventPort)
      return booleanType
    val c = f.classifier 
    for (pa : c.ownedPropertyAssociations) 	
      if (pa.property.getQualifiedName.equalsIgnoreCase('BLESS::Typed'))
        {
        val str = (pa.ownedValues.head.ownedValue as StringLiteral).value
        return getTypeOfString(str)
        }    
    //otherwise error  
    return null
    }  //end of getFeatureType
    
  def Type getTypeOfString(String str)
  {
    if (str.startsWith("boolean"))
      return booleanType
    if (str.matches(idregex) && BlessMaps.typeMapContainsKey(str))
      return BlessMaps.typeMapGet(str).type
    if (str.startsWith('quantity'))
    { // kludge quantity type because parsing doesn't fill in unit
      val QuantityType qt = BLESSFactory.eINSTANCE.createQuantityType
      if (str.endsWith('scalar'))
      {
        qt.scalar = 'scalar' //true
        return qt
      }
      if (str.endsWith('whole'))
      {
        qt.whole = 'whole'  //true
        return qt
      }
      val UnitName un = BLESSFactory.eINSTANCE.createUnitName
      un.name = str.substring(str.lastIndexOf(' ') + 1)
      qt.unit = un
      return qt
    }
  } // end of getTypeOfString
  
  
//  def boolean hasIndexType(Type t)
//    {
//    t instanceof IndexType
//    }

  def QuantityType toQuantityType(UnitRecord ur)
    {
    val QuantityType qt =	BLESSFactory.eINSTANCE.createQuantityType
    if (ur.rootUnit !== null)
      qt.unit = ur.rootUnit
    else if (ur.isScalar)
      qt.scalar = 'scalar'
    else if (ur.isWhole)
      qt.whole = 'whole'
//    qt.scalar = ur.isScalar
//    qt.unit = ur.rootUnit
//    qt.whole = ur.isWhole
    qt
    }
   
  def String typeString(Type t)
    {
    val sb = new StringBuffer
    switch t
      {
      EnumerationType:
        {
        sb.append('enumeration ( ')
        val et = t as EnumerationType 
          for (lit : et.defining_enumeration_literal)
           sb.append(lit+' ')
        sb.append(')')
        }
      QuantityType:
        {
        val qt = t as QuantityType
        sb.append('quantity ')
        if (qt.unit !== null)
          sb.append(qt.unit.name)
        if (qt.scalar !== null) sb.append('scalar')
        if (qt.whole !== null) sb.append('whole')
        }
      ArrayType:
        {
        val at = t as ArrayType
        sb.append('array ['+at.array_ranges.typeString+'] of '+at.typ.typeString)	
        }
      RecordType:
        {
        val rt = t as RecordType
        sb.append(rt.record ? 'record (' : 'variant (')
        sb.append(rt.fields.head.typeString)
        for (r : rt.fields.tail)
          sb.append(', '+r.typeString)
        sb.append(')')
        }
      BooleanType:
        sb.append('boolean')
      StringType:
        sb.append('string')
      }  //end of switch
      
    sb.toString	
    }
 
  def String typeString(RecordField rf)
    {
    rf.label+':'+rf.typ.typeString
    }
 
  def String typeString(TypeOrReference tod)
    {
    if (tod !== null)
    if (tod.ref !== null)	
      return tod.ref.name
    else 
      return tod.ty.typeString
    }
    
  def String typeString(ArrayRangeList arl)
    {
    val sb = new StringBuffer
    sb.append(arl.range.head.typeString)
    for (r :arl.range.tail )
      sb.append(', '+r.typeString)
    sb.toString	
    }
   
  def String typeString(ArrayRange ar)
    {
    val sb = new StringBuffer
    if (ar.lb !== null)
      {
      if (ar.lb.lit !== null)
        sb.append(ar.lb.lit)
      else if (ar.lb.property !== null)
        sb.append(ar.lb.property)
      else
        sb.append(ar.lb.propertyConstant) 
      }
    if (ar.ub !== null)
      {
      sb.append('..') 
      if (ar.ub.lit !== null)
        sb.append(ar.ub.lit)
      else if (ar.ub.property !== null)
        sb.append(ar.ub.property)
      else
        sb.append(ar.ub.propertyConstant)
      }
    sb.toString	    	
    }
    
 def Type makeWholeQuantity()
  {
  var wq = BLESSFactory.eINSTANCE.createQuantityType
  wq.whole = 'whole' // true
  wq 	
  }

def boolean isInTypedefAnnex(EObject o)
  {
  	if (AadlUtil.getContainingAnnex(o) === null) return false
    AadlUtil.getContainingAnnex(o)?.name.equalsIgnoreCase('Typedef')
  }

  def boolean relationComparesNull(Relation r)
    {
    if (r.sym !== null && (r.sym.equals('=')  || r.sym.equals('!=')  ||r.sym.equals('<>') ))
      {
      if (r.l !== null && (r.l as AddSub).sym === null && (r.l as AddSub).l !==null)
        {
        val multDiv = (r.l as AddSub).l as MultDiv
        if (multDiv.sym === null && multDiv.l !== null && (multDiv.l as Exp).sym === null && (multDiv.l as Exp).l !== null)	
          {
          val subexpression = (multDiv.l as Exp).l as Subexpression	
          if (subexpression.unary === null && subexpression.timed_expression.subject.value !== null)
            {
            val value = subexpression.timed_expression.subject.value as Value	
            if (value.constant !== null && value.constant.nul !== null)
              return true
            }
          }
        }
      if (r.r !== null && (r.r as AddSub).sym === null && (r.r as AddSub).l !==null)
        {
        val multDiv = (r.r as AddSub).l as MultDiv
        if (multDiv.sym === null && multDiv.l !== null && (multDiv.l as Exp).sym === null && (multDiv.l as Exp).l !== null)	
          {
          val subexpression = (multDiv.l as Exp).l as Subexpression	
          if (subexpression.unary === null && subexpression.timed_expression.subject.value !== null)
            {
            val value = subexpression.timed_expression.subject.value as Value	
            if (value.constant !== null && value.constant.nul !== null)
              return true
            }
          }
        }
      	
      }
    false	
    }  //end of relationComparesNull

def String convertQuantityToArtTime(Quantity q) 
  {
  if (q.unit === null) 
    return "**no unit for quantity***"
  val un = q.unit
  if (!un.hasTimeUnit)
    return "***quantity must have time unit***"
  val unit_record = un.toUnitRecord
  if (unit_record.multiplyFactor)
    {
    val mf = unit_record.conversionFactor * 1000
    "* s64\""+mf+"\""
    }
  else
    {
    val df = unit_record.conversionFactor/1000.0
    "/ s64\""+df+"\""  
    }
  }  //end of convertQuantityToArtTime
   
    
}