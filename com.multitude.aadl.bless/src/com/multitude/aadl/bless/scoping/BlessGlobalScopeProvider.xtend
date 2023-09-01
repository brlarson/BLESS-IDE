//BlessGlobalScopeProvider.xtend

//only globally visible units/types/assertions/exceptions here

//add contributed files when Joe makes something for me

package com.multitude.aadl.bless.scoping

import com.google.common.base.Predicate
import com.google.inject.Inject
import com.multitude.aadl.bless.bLESS.BLESSPackage
import com.multitude.aadl.bless.bLESS.GhostVariable
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.Scopes
import org.osate.aadl2.modelsupport.scoping.EClassGlobalScopeProvider

class BlessGlobalScopeProvider extends EClassGlobalScopeProvider
{
  @Inject extension BlessIndex

  override 
getScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter)
  {
  if (reference == BLESSPackage.eINSTANCE.quantityType_Unit || // TypePackage.Literals.QUANTITY_TYPE__UNIT ||
    reference == BLESSPackage.eINSTANCE.unitExtension_Root || // Literals.QUANTITY__UNIT)
    reference == BLESSPackage.eINSTANCE.quantity_Unit || reference == BLESSPackage.eINSTANCE.rootDeclaration_UnitName ||
      reference == BLESSPackage.eINSTANCE.unitFormula_Bottom || reference == BLESSPackage.eINSTANCE.unitFormula_Top)
    {
      val List<EObject> unitNames = new ArrayList<EObject>()
      for (un : context.getVisibleUnitNames)
        unitNames.add(un as EObject)
      return Scopes.scopeFor(unitNames)
    } // done looking for unit names
//type references    
  if (reference == BLESSPackage.eINSTANCE.typeOrReference_Ref || 
      reference == BLESSPackage.eINSTANCE.recordTerm_Record_type || 
      reference == BLESSPackage.eINSTANCE.enumerationValue_Enumeration_type || 
      reference == BLESSPackage.eINSTANCE.namedAssertion_EnumerationType )
    {
      val List<EObject> typeDeclarations = new ArrayList<EObject>()
      for (un : context.getVisibleTypeDeclarations)
        typeDeclarations.add(un as EObject)
      return Scopes.scopeFor(typeDeclarations)
    } // done with types
//assertion invocations    
  if (reference == BLESSPackage.eINSTANCE.invocation_Label) 
    { // look globally for named assertions
      val List<EObject> namedAssertions = new ArrayList<EObject>()
      for (un : context.getVisibleNamedAssertions)
        namedAssertions.add(un as EObject)
      return Scopes.scopeFor(namedAssertions);
    } // done with assertions
//variables and values    
  if (reference == BLESSPackage.eINSTANCE.valueName_Id) 
    { // look globally for ghost variables
      val List<EObject> ghostVariables = new ArrayList<EObject>()
      for (GhostVariable gv : context.getVisibleGhostVariables)
        ghostVariables.add(gv as EObject)
      return Scopes.scopeFor(ghostVariables);
    } // done with  ghost variables
//exceptions
  if (reference == BLESSPackage.eINSTANCE.throwsClause_Exceptions ||
      reference == BLESSPackage.eINSTANCE.whenThrow_Exception)
    {
      val List<EObject> exceptions = new ArrayList<EObject>()
      for (Exception ex : context.getVisibleExceptions)
        exceptions.add(ex as EObject)
      return Scopes.scopeFor(exceptions)
    } // done with exceptions
  super.getScope(context, reference, filter);
  } // end of getScope
}
