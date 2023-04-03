//convert AADL property types to BLESS property types

package com.multitude.aadl.bless.util

import com.google.inject.Inject
import com.multitude.aadl.bless.bLESS.BLESSFactory
import com.multitude.aadl.bless.bLESS.RecordField
import com.multitude.aadl.bless.bLESS.Type
import com.multitude.aadl.bless.bLESS.UnitName
import com.multitude.aadl.bless.scoping.BlessIndex
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.osate.aadl2.AadlBoolean
import org.osate.aadl2.AadlInteger
import org.osate.aadl2.AadlReal
import org.osate.aadl2.AadlString
import org.osate.aadl2.BasicProperty
import org.osate.aadl2.ClassifierType
import org.osate.aadl2.EnumerationType
import org.osate.aadl2.Property
import org.osate.aadl2.PropertyExpression
import org.osate.aadl2.PropertyType
import org.osate.aadl2.RangeType
import org.osate.aadl2.RecordType
import org.osate.aadl2.ReferenceType
import org.osate.aadl2.UnitsType

class PropertyUtil {

//@Inject extension UnitUtil
@Inject extension BlessIndex


def UnitName getUnitName(EObject context, UnitsType e)
  {
  context.findUnitNameFromString(e.name)
  }

def String toRealLiteral(PropertyExpression e)
  {
  if (e instanceof AadlReal)
    (e as AadlReal).toString
  else
    'not-a-real'
  }

def String toWholeLiteral(PropertyExpression e)
  {
  if (e instanceof AadlInteger)
    (e as AadlInteger).toString
  else
    'not-a-whole'
  }

def Type getType(Property e)  
  {
  if (e.eIsProxy)
    EcoreUtil.resolve(e,e.getResourceSet)    	
  e.referencedPropertyType?.getType ?:
  e.ownedPropertyType.getType
  }

def Type getType(BasicProperty e)  
  {
  if (e.eIsProxy)
    EcoreUtil.resolve(e,e.getResourceSet)    	
  e.referencedPropertyType?.getType ?:
  e.ownedPropertyType.getType
  }

def Type getType(PropertyType e) 
  {
  if (e.eIsProxy)
    EcoreUtil.resolve(e,e.getResourceSet)    	
  switch e
    {
    AadlBoolean:
      BLESSFactory.eINSTANCE.createBooleanType
    AadlString:
      BLESSFactory.eINSTANCE.createStringType
    AadlReal:
      (e as AadlReal).getType
    AadlInteger:
      (e as AadlInteger).getType
    RangeType:
      (e as RangeType).getType
    UnitsType:
      null  //if we're trying to use a UnitsType to make a BLESS type, something's wrong
    ClassifierType:
       null  //if we're trying to use a ClassifierType to make a BLESS type, something's wrong
    ReferenceType:
       null  //if we're trying to use a ReferenceType to make a BLESS type, something's wrong
    RecordType:
    	 (e as RecordType).getType
    EnumerationType:
      (e as EnumerationType).getType
    }	
  }

def Type getType(RecordType e)
  {
  val retval = BLESSFactory.eINSTANCE.createRecordType
  for (rt : e.ownedFields)
    retval.fields.add(rt.toBlessRecordField)
  retval
  }

def RecordField toBlessRecordField(BasicProperty rt)
  {
  val retval = BLESSFactory.eINSTANCE.createRecordField
  retval.label = rt.name
  val tod = BLESSFactory.eINSTANCE.createTypeOrReference
  tod.ty = getType(rt)
  retval.typ = tod
  retval
  }

def Type getType(AadlBoolean e)
  {
  BLESSFactory.eINSTANCE.createBooleanType
  }

def Type getType(AadlString e)
  {
  BLESSFactory.eINSTANCE.createStringType
  }

def Type getType(EnumerationType e)
  {
  var et = BLESSFactory.eINSTANCE.createEnumerationType
  for (lit : e.ownedLiterals)
    {  //convert AADL enum literals into BLESS enum literals
 //   var blit = BLESSFactory.eINSTANCE.createID
//    blit.name = lit.name
    et.defining_enumeration_literal.add(lit.name)
    }
  et
  }


def Type getType(AadlReal e)
  {
  var ar = BLESSFactory.eINSTANCE.createQuantityType
//  ar.whole = false
  if (e.referencedUnitsType !== null)
    ar.unit = getUnitName(e,e.referencedUnitsType)
  else
    ar.scalar = 'scalar'
  if (e.range !== null)
    {
    ar.lb.lit = e.range.lowerBound.toRealLiteral
    ar.ub.lit = e.range.upperBound.toRealLiteral
    }
  ar	
  }

def Type getType(AadlInteger e)
  {
  var ar = BLESSFactory.eINSTANCE.createQuantityType
  if (e.referencedUnitsType !== null)
    ar.unit = getUnitName(e,e.referencedUnitsType)
  else
    ar.whole = 'whole'
//  ar.whole = true
//  if (e.referencedUnitsType !== null)
//    ar.unit = getUnitName(e,e.referencedUnitsType)
//  else
//    ar.scalar = true
  if (e.range !== null)
    {
    ar.lb.lit = e.range.lowerBound.toWholeLiteral
    ar.ub.lit = e.range.upperBound.toWholeLiteral
    }
  ar	
  }

def Type getType(RangeType e)
  {
  if (e.ownedNumberType !== null)
    {
    if (e.ownedNumberType instanceof AadlInteger)
      return (e.ownedNumberType as AadlInteger).getType
    if (e.ownedNumberType instanceof AadlReal)
      return (e.ownedNumberType as AadlReal).getType
    }
  else  //it's a referenced number type
    return e.referencedNumberType.getType
  }

	
}