package com.multitude.aadl.bless.naming

import com.multitude.aadl.bless.bLESS.ArrayType
import com.multitude.aadl.bless.bLESS.CountingQuantification
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification
import com.multitude.aadl.bless.bLESS.ExistentialQuantification
import com.multitude.aadl.bless.bLESS.ForallVariable
import com.multitude.aadl.bless.bLESS.NamedAssertion
import com.multitude.aadl.bless.bLESS.NamelessAssertion
import com.multitude.aadl.bless.bLESS.NamelessEnumeration
import com.multitude.aadl.bless.bLESS.NamelessFunction
import com.multitude.aadl.bless.bLESS.ProductQuantification
import com.multitude.aadl.bless.bLESS.RecordField
import com.multitude.aadl.bless.bLESS.RecordType
import com.multitude.aadl.bless.bLESS.StatesSection
import com.multitude.aadl.bless.bLESS.SumQuantification
import com.multitude.aadl.bless.bLESS.TypeDeclaration
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification
import com.multitude.aadl.bless.bLESS.UniversalQuantification
import com.multitude.aadl.bless.bLESS.Variable
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.naming.QualifiedName

class BlessQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();

static int recordCount = 1  
static int variantCount = 1  
//static int enumCount = 1  
static int arrayCount = 1  
static int naCount = 1  //NamelessAssertion count
static int nfCount = 1  //NamelessFunction count
static int neCount = 1  //NamelessEnumeration count
static  int allCount = 1  //UniversalQuantification count
static  int existsCount = 1  //ExistentialQuantification count
static  int sumCount = 1  //SumQuantification count
static  int productCount = 1  //ProductQuantification count
static  int numberofCount = 1  //CountingQuantification count
static  int elqCount = 1  //ExistentialLatticeQuantification count
static  int ulqCount = 1  //UniversalLatticeQuantification count
static int tbd = 1  //dummy counter to make names during typing that don't cause errors
	
	
override getFullyQualifiedName(EObject obj)
  {  //make names for things that don't have them, 
  switch obj
    {  
    // append "NamelessXXX"+count to it's otherwise qualified name
    NamedAssertion:   
      if ((obj as NamedAssertion).name !== null && (obj as NamedAssertion).name.length > 0)
        obj.myContaintersQualifiedName.append((obj as NamedAssertion).name)
      else
        obj.myContaintersQualifiedName.append("TBD"+(tbd++))
    NamelessAssertion: 	
      converter.toQualifiedName("NamelessAssertion"+(naCount++))
    NamelessFunction: 	
      converter.toQualifiedName("NamelessFunction"+(nfCount++))
    NamelessEnumeration: 	converter.toQualifiedName("NamelessEnumeration"+(neCount++))
    // universal quantification = "all"+count+logic variable identifiers
    UniversalQuantification: 
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("all"+(allCount++))?:  //  add "all"+count to name
      converter.toQualifiedName("all"+(allCount++)) //otherwise, just use the plain ID
    UniversalLatticeQuantification: 
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("ULQ"+(ulqCount++))?:  //  add "ULQ"+count to name
      converter.toQualifiedName("ULQ"+(ulqCount++)) //otherwise, just use the plain ID
    ExistentialLatticeQuantification: 
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("ELQ"+(elqCount++))?:  //  add "ELQ"+count to name
      converter.toQualifiedName("ELQ"+(elqCount++)) //otherwise, just use the plain ID
    ExistentialQuantification:
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("exists"+(existsCount++))?:  //  add "exists"+count to name
      converter.toQualifiedName("exists"+(existsCount++)) //otherwise, just use the plain ID
    SumQuantification:
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("sum"+(sumCount++))?:  //  add "sum"+count to name
      converter.toQualifiedName("sum"+(sumCount++)) //otherwise, just use the plain ID
    ProductQuantification:  
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("product"+(productCount++))?:  //  add "product"+count to name
      converter.toQualifiedName("product"+(productCount++)) //otherwise, just use the plain ID
    CountingQuantification:        
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("numberof"+(numberofCount++))?:  //  add "numberof"+count to name
      converter.toQualifiedName("numberof"+(numberofCount++)) //otherwise, just use the plain ID
    ForallVariable:  
      obj.myContaintersQualifiedName.  // variable's container must have a qualified name
        append(obj.name)  //add its name to it
    Variable:
      obj.myContaintersQualifiedName.  // variable's container must have a qualified name
        append(obj.name)  //add its name to it
    TypeDeclaration:   
      if ((obj as TypeDeclaration).name !== null && (obj as TypeDeclaration).name.length > 0)
        obj.myContaintersQualifiedName.append((obj as TypeDeclaration).name)
      else
        obj.myContaintersQualifiedName.append("TBD"+(tbd++))
//    EnumerationLiteral:   
//      if ((obj as EnumerationLiteral).name !== null && (obj as EnumerationLiteral).name.length > 0
//        && obj.eContainer instanceof EnumerationType && obj.eContainer.eContainer instanceof TypeDeclaration)
//          obj.eContainer.myContaintersQualifiedName.append((obj as EnumerationLiteral).name)
//      else
//        obj.myContaintersQualifiedName.append("TBD"+(tbd++))
    RecordType: 
      if ((obj as RecordType).record)	
        converter.toQualifiedName("Record"+(recordCount++))
      else if ((obj as RecordType).variant)	
        converter.toQualifiedName("Variant"+(variantCount++))
    RecordField:
      if ((obj as RecordField).label !== null && (obj as RecordField).label.length > 0)
      obj.myContaintersQualifiedName.  // record field's container must have a qualified name
        append((obj as RecordField).label)  //add its name to it
      else
        obj.myContaintersQualifiedName.append("TBD"+(tbd++))
    ArrayType: 	
      converter.toQualifiedName("ArrayType"+(arrayCount++))
//    AssertClause:
//      obj.myContaintersQualifiedName?.  //if my container has a qualified name
//        append("assert")?:  //  add "assert" to name
//      converter.toQualifiedName("assert") //otherwise, just use the plain ID      
//    VariablesSection:
//      obj.myContaintersQualifiedName?.  //if my container has a qualified name
//        append("variables")?:  //  add "variables" to name
//      converter.toQualifiedName("variables") //otherwise, just use the plain ID
    StatesSection:
      obj.myContaintersQualifiedName?.  //if my container has a qualified name
        append("states")?:  //  add "states" to name
      converter.toQualifiedName("states") //otherwise, just use the plain ID
    default: //converter.toQualifiedName("default")  //
      super.getFullyQualifiedName(obj)	//otherwise, see if super-class has a fully-qualified name for it
    }	 	
  }  //end of getFullyQualifiedName
  
  def QualifiedName 
myContaintersQualifiedName(EObject obj)  
  {  //if my container has a qualified name, return it
  	val fqn = getFullyQualifiedName(obj.eContainer) 
  	if (fqn !== null && fqn.segmentCount >0)
  	  return fqn
  	//otherwise use its container
  	val cqn = myContaintersQualifiedName(obj.eContainer) 
  	if (cqn !== null && cqn.segmentCount >0)
  	  return cqn
  	QualifiedName.create('bless_root')
  }  //end of myContaintersQualifiedName
	
	
}