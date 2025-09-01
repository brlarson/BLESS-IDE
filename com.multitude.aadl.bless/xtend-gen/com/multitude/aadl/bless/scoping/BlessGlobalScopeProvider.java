package com.multitude.aadl.bless.scoping;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.GhostVariable;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.UnitName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Extension;
import org.osate.aadl2.modelsupport.scoping.EClassGlobalScopeProvider;

@SuppressWarnings("all")
public class BlessGlobalScopeProvider extends EClassGlobalScopeProvider {
  @Inject
  @Extension
  private BlessIndex _blessIndex;

  @Override
  public IScope getScope(final Resource context, final EReference reference, final Predicate<IEObjectDescription> filter) {
    IScope _xblockexpression = null;
    {
      if ((((((Objects.equals(reference, BLESSPackage.eINSTANCE.getQuantityType_Unit()) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getUnitExtension_Root())) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getQuantity_Unit())) || Objects.equals(reference, BLESSPackage.eINSTANCE.getRootDeclaration_UnitName())) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getUnitFormula_Bottom())) || Objects.equals(reference, BLESSPackage.eINSTANCE.getUnitFormula_Top()))) {
        final List<EObject> unitNames = new ArrayList<EObject>();
        Iterable<UnitName> _visibleUnitNames = this._blessIndex.getVisibleUnitNames(context);
        for (final UnitName un : _visibleUnitNames) {
          unitNames.add(((EObject) un));
        }
        return Scopes.scopeFor(unitNames);
      }
      if ((((Objects.equals(reference, BLESSPackage.eINSTANCE.getTypeOrReference_Ref()) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getRecordTerm_Record_type())) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getEnumerationValue_Enumeration_type())) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getNamedAssertion_EnumerationType()))) {
        final List<EObject> typeDeclarations = new ArrayList<EObject>();
        Iterable<TypeDeclaration> _visibleTypeDeclarations = this._blessIndex.getVisibleTypeDeclarations(context);
        for (final TypeDeclaration un_1 : _visibleTypeDeclarations) {
          typeDeclarations.add(((EObject) un_1));
        }
        return Scopes.scopeFor(typeDeclarations);
      }
      EReference _invocation_Label = BLESSPackage.eINSTANCE.getInvocation_Label();
      boolean _equals = Objects.equals(reference, _invocation_Label);
      if (_equals) {
        final List<EObject> namedAssertions = new ArrayList<EObject>();
        Iterable<NamedAssertion> _visibleNamedAssertions = this._blessIndex.getVisibleNamedAssertions(context);
        for (final NamedAssertion un_2 : _visibleNamedAssertions) {
          namedAssertions.add(((EObject) un_2));
        }
        return Scopes.scopeFor(namedAssertions);
      }
      EReference _valueName_Id = BLESSPackage.eINSTANCE.getValueName_Id();
      boolean _equals_1 = Objects.equals(reference, _valueName_Id);
      if (_equals_1) {
        final List<EObject> ghostVariables = new ArrayList<EObject>();
        Iterable<GhostVariable> _visibleGhostVariables = this._blessIndex.getVisibleGhostVariables(context);
        for (final GhostVariable gv : _visibleGhostVariables) {
          ghostVariables.add(((EObject) gv));
        }
        return Scopes.scopeFor(ghostVariables);
      }
      if ((Objects.equals(reference, BLESSPackage.eINSTANCE.getThrowsClause_Exceptions()) || 
        Objects.equals(reference, BLESSPackage.eINSTANCE.getWhenThrow_Exception()))) {
        final List<EObject> exceptions = new ArrayList<EObject>();
        Iterable<Exception> _visibleExceptions = this._blessIndex.getVisibleExceptions(context);
        for (final Exception ex : _visibleExceptions) {
          exceptions.add(((EObject) ex));
        }
        return Scopes.scopeFor(exceptions);
      }
      _xblockexpression = super.getScope(context, reference, filter);
    }
    return _xblockexpression;
  }
}
