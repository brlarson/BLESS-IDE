package com.multitude.aadl.bless.util

import com.google.inject.Inject
import com.multitude.aadl.bless.bLESS.BLESSFactory
import com.multitude.aadl.bless.bLESS.QuantityType
import com.multitude.aadl.bless.bLESS.RootDeclaration
import com.multitude.aadl.bless.bLESS.UnitFactor
import com.multitude.aadl.bless.bLESS.UnitName
import com.multitude.aadl.bless.scoping.BlessIndex
import java.util.Collections
import java.util.Comparator
import org.eclipse.emf.common.util.ECollections
import org.eclipse.emf.common.util.EList

class UnitUtil 
{

//@Inject LazyLinkingResource lazyLinkingResource
//@Inject IQualifiedNameProvider nameProvider
//@Inject extension BlessUtil
@Inject extension BlessIndex
//@Inject extension TypeUtil

 
def UnitName nullUnitName() 
  {
  	BLESSFactory.eINSTANCE.createUnitName 	
  }

/* is this string a negative number? */
def boolean nonnegativeNumber(String s)
  { !s.startsWith('-') }

/* is this UnitName a base type? */
def boolean isBaseType(UnitName ul)
  {
  if (ul?.eContainer instanceof RootDeclaration)
    return (ul.eContainer as RootDeclaration).base
  false
  }

// use UnitIndex instead
//def UnitName getRootUnit(UnitName ul)
//  {
//  if (ul?.eContainer instanceof RootDeclaration)
//    return (ul.eContainer as RootDeclaration).unitName
//  null
//  }


/* is this identifier all letters */
def boolean allLetters(String s)
  {
  	val char[] chars = s.toCharArray
  	for (i : 0 ..< chars.size)  //look for character neither small nor large letter
  		if(!(chars.get(i) >= 'a' && chars.get(i) <= 'z') && !(chars.get(i) >= 'A' && chars.get(i) <= 'Z'))
  		  return false
  	true
  }

def boolean sameUnitRoot(UnitName u1, UnitName u2)
  {
  	u1.getRootUnit == u2.getRootUnit
  }

def boolean sameUnitRoot(Iterable<UnitName> unitSet)
  {
  	val rootSet = unitSet.map([u | u.getRootUnit])
  	rootSet.forall([r | rootSet.last == r])
  }

def UnitRecord toUnitRecord(QuantityType t)
  {
  val UnitRecord ur = new UnitRecord() 
  val UnitName un = t.unit
  ur.isScalar = t.scalar
  if (un !== null)
    {
    ur.rootUnit = getRootUnit(un)
    var RootDeclaration rd = getRootDeclaration(ur.rootUnit)
    ur.isBase = rd.isBase()
    if(ur.isBase)
    {
      ur.top.add(ur.rootUnit.getName())
    }
    else
    {
      for (UnitName unt : rd.getFormula().getTop())
      {
        ur.top.add(unt.getName())
      }
      for (UnitName b : rd.getFormula().getBottom())
      {
        ur.bottom.add(b.getName()) // top = rd.getFormula().getTop();
        // bottom =  rd.getFormula().getBottom();
      }
    }
    ur.isScalar = false    
    }
  ur.isWhole = t.whole
  ur
  }

def UnitRecord toUnitRecord(UnitName unit)
  {
  	var UnitRecord retval
   if (unit.eContainer instanceof RootDeclaration)
    {val root=unit.eContainer as RootDeclaration
			if (root.base)
			  retval = new UnitRecord(unit.isBaseType, unit, unit.getRootUnit, ECollections.singletonEList(unit), 
			    ECollections.emptyEList, false, false, false, 1.0)
			else
			  retval =  new UnitRecord(unit.isBaseType, unit, unit.getRootUnit, root.formula.top, 
			    root.formula.bottom, false, false, false, 1.0) 
		}
	else
	  {
		val root=unit.rootDeclaration  //not sure if need to search all RootDeclaration
		val UnitFactor uf = unit.eContainer as UnitFactor
			if (root.base)
			  retval = new UnitRecord(unit.isBaseType, unit, unit.getRootUnit, ECollections.singletonEList(root.unitName), ECollections.emptyEList, false,
			  	uf.op.equals("*"), uf.op.equals("/"), Double.valueOf(uf.factor))
			else 
			  retval = new UnitRecord(unit.isBaseType, unit, unit.getRootUnit,root.formula.top, root.formula.bottom, false,
			  	uf.op.equals("*"), uf.op.equals("/"), Double.valueOf(uf.factor))   	
	  }
	retval
  }

def UnitRecord scalar()
  {
   new UnitRecord(false,null,null,null,null,true, false, false, 1.0, false, false)  //scalar 
  }

def UnitRecord whole()
  {
   new UnitRecord(false,null,null,null,null,false, false, false, 1.0, true, false)  //whole
  }

def UnitRecord nan()
  {
   new UnitRecord(false,null,null,null,null,false, false, false, 1.0, false, true)  //not a number
  }


def EList<UnitName> sort(EList<UnitName> list)
  {
		Collections.sort(list,
      new Comparator<UnitName>() {

			override compare(UnitName o1, UnitName o2) {
				return o1.name.compareTo(o2.name)
			}

		})
	return list  
	}

def boolean hasTimeUnit(UnitName u)  
  {
  val UnitName un = findUnitNameFromString(u,"s")
  sameUnitRoot(u, un)  
  }


def String getConversionToRootUnit(UnitName u)
  {
  val rec = u.toUnitRecord 
  return (rec.multiplyFactor?"*":"/")+rec.conversionFactor 
  }
	
//def void sortInPlace(EList<UnitName> list)
//  {
//		Collections.sort(list,
//      new Comparator<UnitName>() {
//
//			override compare(UnitName o1, UnitName o2) {
//				return o1.name.compareTo(o2.name)
//			}
//
//		})
//	}

//def UnitRecord getUnitRecord(UnitName un)	
//  {
//  	
//  }
	
//def UnitFormula normalize(UnitFormula uf)
//  {  //sort top and bottom
//	var List<UnitName> top = uf.top.sort
//  	ECollections.sort
//  	uf
//  }

}
