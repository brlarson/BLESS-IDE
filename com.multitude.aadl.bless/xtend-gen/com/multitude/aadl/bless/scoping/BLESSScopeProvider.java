package com.multitude.aadl.bless.scoping;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.multitude.aadl.bless.bLESS.ActionSubclause;
import com.multitude.aadl.bless.bLESS.AssertionLibrary;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.CountingQuantification;
import com.multitude.aadl.bless.bLESS.ExistentialLatticeQuantification;
import com.multitude.aadl.bless.bLESS.ExistentialQuantification;
import com.multitude.aadl.bless.bLESS.ForLoop;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.ProductQuantification;
import com.multitude.aadl.bless.bLESS.QuantifiedVariables;
import com.multitude.aadl.bless.bLESS.SumQuantification;
import com.multitude.aadl.bless.bLESS.UniversalLatticeQuantification;
import com.multitude.aadl.bless.bLESS.UniversalQuantification;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.aadl.bless.bLESS.VariableList;
import com.multitude.aadl.bless.bLESS.VariablesSection;
import com.multitude.aadl.bless.util.AssertionUtil;
import com.multitude.aadl.bless.util.BlessUtil;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Extension;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.modelsupport.util.AadlUtil;

@SuppressWarnings("all")
public class BLESSScopeProvider extends AbstractBLESSScopeProvider {
  @Inject
  @Extension
  private BlessUtil _blessUtil;

  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      if ((Objects.equal(reference, BLESSPackage.eINSTANCE.getVariableList_First()) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getVariableList_Parameter()))) {
        EObject _eContainer = context.eContainer();
        if ((_eContainer instanceof NamedAssertion)) {
          return IScope.NULLSCOPE;
        }
      }
      final List<EObject> refs = new ArrayList<EObject>();
      if (((Objects.equal(reference, BLESSPackage.eINSTANCE.getValueName_Id()) || Objects.equal(reference, BLESSPackage.eINSTANCE.getCombinableOperation_Target())) || Objects.equal(reference, BLESSPackage.eINSTANCE.getCombinableOperation_Result()))) {
        EObject up = context.eContainer();
        while (((((up != null) && (!(up instanceof AssertionLibrary))) && 
          (!(up instanceof BLESSSubclause))) && (!(up instanceof ActionSubclause)))) {
          {
            if ((up instanceof SumQuantification)) {
              refs.addAll(((SumQuantification) up).getVariables().getLv());
            } else {
              if ((up instanceof ProductQuantification)) {
                refs.addAll(((ProductQuantification) up).getVariables().getLv());
              } else {
                if ((up instanceof CountingQuantification)) {
                  refs.addAll(((CountingQuantification) up).getVariables().getLv());
                } else {
                  if ((up instanceof UniversalQuantification)) {
                    refs.addAll(((UniversalQuantification) up).getVariables().getLv());
                  } else {
                    if ((up instanceof ExistentialQuantification)) {
                      refs.addAll(((ExistentialQuantification) up).getVariables().getLv());
                    } else {
                      if (((up instanceof ExistentialLatticeQuantification) && 
                        (((ExistentialLatticeQuantification) up).getQuantified_variables() != null))) {
                        QuantifiedVariables _quantified_variables = ((ExistentialLatticeQuantification) up).getQuantified_variables();
                        EList<VariableDeclaration> _variables = null;
                        if (_quantified_variables!=null) {
                          _variables=_quantified_variables.getVariables();
                        }
                        for (final VariableDeclaration v : _variables) {
                          refs.add(v.getVariable());
                        }
                      } else {
                        if ((up instanceof UniversalLatticeQuantification)) {
                          refs.addAll(((UniversalLatticeQuantification) up).getVariables());
                        } else {
                          if ((up instanceof ForLoop)) {
                            refs.add(((ForLoop) up).getCount());
                          } else {
                            if ((up instanceof NamedAssertion)) {
                              final NamedAssertion na = ((NamedAssertion) up);
                              VariableList _formals = na.getFormals();
                              boolean _tripleNotEquals = (_formals != null);
                              if (_tripleNotEquals) {
                                refs.add(na.getFormals().getFirst());
                                refs.addAll(na.getFormals().getParameter());
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            up = up.eContainer();
          }
        }
        if (((up != null) && (up instanceof BLESSSubclause))) {
          final BLESSSubclause bs = ((BLESSSubclause) up);
          VariablesSection _variables = bs.getVariables();
          boolean _tripleNotEquals = (_variables != null);
          if (_tripleNotEquals) {
            EList<VariableDeclaration> _behavior_variables = bs.getVariables().getBehavior_variables();
            for (final VariableDeclaration v : _behavior_variables) {
              refs.add(v.getVariable());
            }
          }
          refs.addAll(this._blessUtil.getFeaturesOfComponent(up));
          refs.addAll(this._blessUtil.getPrototypesOfComponent(up));
          refs.addAll(this._blessUtil.getSubcomponents(up));
        }
        if (((up != null) && (up instanceof ActionSubclause))) {
          refs.addAll(this._blessUtil.getFeaturesOfComponent(up));
          refs.addAll(this._blessUtil.getPrototypesOfComponent(up));
          final ExistentialLatticeQuantification elq = ((ActionSubclause) up).getElq();
          QuantifiedVariables _quantified_variables = elq.getQuantified_variables();
          boolean _tripleNotEquals_1 = (_quantified_variables != null);
          if (_tripleNotEquals_1) {
            EList<VariableDeclaration> _variables_1 = elq.getQuantified_variables().getVariables();
            for (final VariableDeclaration v_1 : _variables_1) {
              refs.add(v_1.getVariable());
            }
          }
        }
        return Scopes.scopeFor(refs, super.getScope(context, reference));
      }
      if ((((((((Objects.equal(reference, BLESSPackage.eINSTANCE.getInternalCondition_First()) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getInternalCondition_Ports())) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getDispatchTrigger_Port())) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getDispatchTrigger_Ports())) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getFreezePort_Frozen())) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getPortInput_Port())) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getPortOutput_Port())) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getPortName_Port()))) {
        refs.addAll(this._blessUtil.getFeaturesOfComponent(context));
        return Scopes.scopeFor(refs);
      }
      EReference _subprogramCall_Procedure = BLESSPackage.eINSTANCE.getSubprogramCall_Procedure();
      boolean _equals = Objects.equal(reference, _subprogramCall_Procedure);
      if (_equals) {
        refs.addAll(this._blessUtil.getSubprogramAccesses(context));
        refs.addAll(this._blessUtil.getSubcomponents(context));
        return Scopes.scopeFor(refs);
      }
      if ((Objects.equal(reference, BLESSPackage.eINSTANCE.getBehaviorTransition_Sources()) || 
        Objects.equal(reference, BLESSPackage.eINSTANCE.getBehaviorTransition_Destination()))) {
        EObject up_1 = context.eContainer();
        while (((up_1 != null) && (!(up_1 instanceof BLESSSubclause)))) {
          up_1 = up_1.eContainer();
        }
        if (((up_1 != null) && (((BLESSSubclause) up_1).getStatesSection() != null))) {
          refs.addAll(((BLESSSubclause) up_1).getStatesSection().getStates());
        }
        return Scopes.scopeFor(refs);
      }
      EReference _invocation_Label = BLESSPackage.eINSTANCE.getInvocation_Label();
      boolean _equals_1 = Objects.equal(reference, _invocation_Label);
      if (_equals_1) {
        final ArrayList<NamedAssertion> namedAssertions = new ArrayList<NamedAssertion>();
        final NamedElement annex = AadlUtil.getContainingAnnex(context);
        AssertionUtil.getAllContainedNamedAssertions(annex, namedAssertions);
        return Scopes.scopeFor(namedAssertions, super.getScope(context, reference));
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }
}
