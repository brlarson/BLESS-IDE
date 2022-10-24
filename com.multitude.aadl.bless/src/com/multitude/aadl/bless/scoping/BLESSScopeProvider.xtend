//BLESSScopeProvider.xtend
//this does only local, relative scoping
//for global scoping of units types and assertions, see BlessGlobalScopeProvider
/*
 * (C) Multitude Corporation 2020
 */
package com.multitude.aadl.bless.scoping

import com.google.inject.Inject
import com.multitude.aadl.bless.bLESS.ActionSubclause
import com.multitude.aadl.bless.bLESS.AssertionLibrary
import com.multitude.aadl.bless.bLESS.BLESSPackage
import com.multitude.aadl.bless.bLESS.BLESSSubclause
import com.multitude.aadl.bless.bLESS.CountingQuantification
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification
import com.multitude.aadl.bless.bLESS.ExistentialQuantification
import com.multitude.aadl.bless.bLESS.ForLoop
import com.multitude.aadl.bless.bLESS.NamedAssertion
import com.multitude.aadl.bless.bLESS.ProductQuantification
import com.multitude.aadl.bless.bLESS.SumQuantification
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification
import com.multitude.aadl.bless.bLESS.UniversalQuantification
import com.multitude.aadl.bless.util.AssertionUtil
import com.multitude.aadl.bless.util.BlessUtil
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.osate.aadl2.NamedElement
import org.osate.aadl2.modelsupport.util.AadlUtil

class BLESSScopeProvider extends AbstractBLESSScopeProvider {

@Inject extension BlessUtil
//@Inject extension AadlUtil
//@Inject extension AssertionUtil

//@Inject IGlobalScopeProvider globalScopeProvider

override getScope(EObject context, EReference reference)
  {
  //prevent duplicate errors on assertion parameters
  if (reference == BLESSPackage.eINSTANCE.variableList_First ||
  	reference == BLESSPackage.eINSTANCE.variableList_Parameter)
  	if (context.eContainer instanceof NamedAssertion)
  	  return IScope.NULLSCOPE
  val List<EObject> refs = new ArrayList<EObject>()
  //look for NamedElement references
//most used is ValueName
  if (reference == BLESSPackage.eINSTANCE.valueName_Id
      || reference == BLESSPackage.eINSTANCE.combinableOperation_Target
      || reference == BLESSPackage.eINSTANCE.combinableOperation_Result)
    { //variable references
    //get ghost variables
//    refs.addAll(getGhostVariables)
    var up = context.eContainer
//walk up the hierarchy looking for NamedElement(s)    
    while (up !== null && !(up instanceof AssertionLibrary) &&
    	  !(up instanceof BLESSSubclause) && !(up instanceof ActionSubclause) )
      {
      if (up instanceof SumQuantification)
          refs.addAll((up as SumQuantification).variables.lv)
      else if (up instanceof ProductQuantification)
          refs.addAll((up as ProductQuantification).variables.lv)
      else if (up instanceof CountingQuantification)
          refs.addAll((up as CountingQuantification).variables.lv)
      else if (up instanceof UniversalQuantification)
          refs.addAll((up as UniversalQuantification).variables.lv)
      else if (up instanceof ExistentialQuantification)
          refs.addAll((up as ExistentialQuantification).variables.lv)
      else if (up instanceof ExistentialLatticeQuantification && 
      	      (up as ExistentialLatticeQuantification).quantified_variables !== null)
        for (v : (up as ExistentialLatticeQuantification).quantified_variables?.variables)
          refs.add(v.variable)
      else if (up instanceof UniversalLatticeQuantification)
        refs.addAll((up as UniversalLatticeQuantification).variables)
      else if (up instanceof ForLoop)
        refs.add((up as ForLoop).count)
    //parameters of named assertions
      else if (up instanceof NamedAssertion)  // && (up as Assertion).namedassertion !== null)
        {
        val na = up as NamedAssertion
        if (na.formals !== null)
          {
          refs.add(na.formals.first)
            refs.addAll(na.formals.parameter)
          }    
        }
      up = up.eContainer
      }  //done with while loop
//BLESS annex subclause
    if (up !== null && up instanceof BLESSSubclause)
      {
      val bs = up as BLESSSubclause
    //add all VariableDeclaration(s)  
      if (bs.variables !== null)
        for ( v : bs.variables.behavior_variables)
          refs.add(v.variable)
    //now look for features
      refs.addAll(up.getFeaturesOfComponent)
    //then prototypes
      refs.addAll(up.getPrototypesOfComponent)
    //then (subprogram) subcomponents  
      refs.addAll(up.subcomponents)
      }  //done with BLESS subclause
//Action subclause for subprograms; just the features
    if (up !== null && up instanceof ActionSubclause)
      {
      refs.addAll(up.getFeaturesOfComponent)  
      refs.addAll(up.getPrototypesOfComponent)
      //get "declare" variables
      val elq = (up as ActionSubclause).elq
      if (elq.quantified_variables !== null)
        for (v : elq.quantified_variables.variables)
          refs.add(v.variable)
      }  
    //return the batch
//    return Scopes.scopeFor(refs)
    return Scopes.scopeFor(refs,super.getScope(context,reference))
    }  //done with variable references
    
//named elements which must be ports or features
  if (reference == BLESSPackage.eINSTANCE.internalCondition_First ||
  	reference == BLESSPackage.eINSTANCE.internalCondition_Ports ||
//  	reference == BLESSPackage.eINSTANCE.behaviorTime_Port_value ||
  	reference == BLESSPackage.eINSTANCE.dispatchTrigger_Port ||
  	reference == BLESSPackage.eINSTANCE.dispatchTrigger_Ports ||
  	reference == BLESSPackage.eINSTANCE.freezePort_Frozen ||
  	reference == BLESSPackage.eINSTANCE.portInput_Port ||
    reference == BLESSPackage.eINSTANCE.portOutput_Port  ||
    reference == BLESSPackage.eINSTANCE.portName_Port 
//  	reference == BLESSPackage.eINSTANCE.portValue_Port 
  	)
  {	
  refs.addAll(context.getFeaturesOfComponent)
  return Scopes.scopeFor(refs)
  }

//subprogram access and subprogram subcomponent
  if (reference == BLESSPackage.eINSTANCE.subprogramCall_Procedure)
    {
    refs.addAll(context.getSubprogramAccesses)
    refs.addAll(context.getSubcomponents)
    return Scopes.scopeFor(refs)
    }
  
//behavior states  
  if (reference == BLESSPackage.eINSTANCE.behaviorTransition_Sources ||
  	reference == BLESSPackage.eINSTANCE.behaviorTransition_Destination)
    {  
    var up = context.eContainer
    while (up !== null  && !(up instanceof BLESSSubclause))
       up = up.eContainer
    if (up !== null && (up as BLESSSubclause).statesSection !== null)
		  refs.addAll((up as BLESSSubclause).statesSection.states)
    return Scopes.scopeFor(refs)
    }
    
//assertion invocation
  if (reference == BLESSPackage.eINSTANCE.invocation_Label)
    {  //if in a BLESS annex subclause
    val namedAssertions = new ArrayList<NamedAssertion>
    val NamedElement annex = AadlUtil.getContainingAnnex(context)
    AssertionUtil.getAllContainedNamedAssertions(annex,namedAssertions)
    return Scopes.scopeFor(namedAssertions,super.getScope(context,reference))
 //   return Scopes.scopeFor(namedAssertions,globalScope)
    }  //done with assertion invocation
//otherwise, devolve to superclass    
  super.getScope(context,reference)	
  }

//def getGhostVariables()
//      { // look globally for ghost variables
//      val List<EObject> ghostVariables = new ArrayList<EObject>()
//      for (IFile file : TraverseBlessWorkspace.getAadlFilesInWorkspace())
//      {
//        val ModelUnit ir = AadlUtil.getElement(file) as ModelUnit;
//        if (ir instanceof AadlPackage)
//        {
//          val List<AnnexLibrary> assertionLibrariesInPackage = AnnexUtil.getAllActualAnnexLibraries(ir as AadlPackage,
//            BLESSPackage.eINSTANCE.assertionLibrary)
//          for (lib : assertionLibrariesInPackage)
//            if (lib instanceof AssertionLibrary && (lib as AssertionLibrary).ghosts !== null)
//              for (defghost : (lib as AssertionLibrary).ghosts.gv)
//                ghostVariables.add(defghost.ghost)
//        } // done with each package
//      }
//    ghostVariables
//    } // done with  ghost variables
  

}
