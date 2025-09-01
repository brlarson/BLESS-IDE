package com.multitude.aadl.bless.linking;

import com.google.inject.Inject;
import com.multitude.aadl.bless.BlessControl;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.EventTrigger;
import com.multitude.aadl.bless.bLESS.FormalActual;
import com.multitude.aadl.bless.bLESS.FormalActualList;
import com.multitude.aadl.bless.bLESS.PropertyReference;
import com.multitude.aadl.bless.bLESS.SubprogramCall;
import com.multitude.aadl.bless.util.BlessUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Extension;
import org.osate.aadl2.CalledSubprogram;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.Parameter;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyConstant;
import org.osate.aadl2.SubprogramAccess;
import org.osate.aadl2.SubprogramSubcomponentType;
import org.osate.aadl2.SubprogramType;
import org.osate.aadl2.TypeExtension;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.xtext.aadl2.properties.util.GetProperties;

@SuppressWarnings("all")
public class MyBlessLinkingService extends DefaultLinkingService {
  @Inject
  @Extension
  private BlessUtil _blessUtil;

  @Override
  public List<EObject> getLinkedObjects(final EObject context, final EReference ref, final INode node) throws IllegalNodeException {
    List<EObject> _xblockexpression = null;
    {
      final List<EObject> result = new ArrayList<EObject>();
      final String s = this.getCrossRefNodeAsString(node);
      boolean _eIsProxy = ref.eIsProxy();
      if (_eIsProxy) {
        EcoreUtil.resolve(ref, context);
      }
      if ((Objects.equals(ref, BLESSPackage.eINSTANCE.getNonNumericProperty_PropertyConstant()) || 
        Objects.equals(ref, BLESSPackage.eINSTANCE.getANumber_PropertyConstant()))) {
        final PropertyConstant propertyConstant = GetProperties.lookupPropertyConstant(context, s);
        if ((propertyConstant != null)) {
          result.add(propertyConstant);
        } else {
          BlessControl.println((("Reference to property constant \"" + s) + "\" not found."));
        }
      } else {
        EReference _propertyReference_Pname = BLESSPackage.eINSTANCE.getPropertyReference_Pname();
        boolean _equals = Objects.equals(ref, _propertyReference_Pname);
        if (_equals) {
          final Property propertyDefinition = GetProperties.lookupPropertyDefinition(context, s);
          if ((propertyDefinition != null)) {
            result.add(propertyDefinition);
          } else {
            BlessControl.println((("Reference to global property \"#" + s) + "\" not found."));
          }
        } else {
          EReference _propertyReference_Cpname = BLESSPackage.eINSTANCE.getPropertyReference_Cpname();
          boolean _equals_1 = Objects.equals(ref, _propertyReference_Cpname);
          if (_equals_1) {
            final ComponentClassifier component = ((PropertyReference) context).getComponent();
            final Property componentPropertyDefinition = GetProperties.lookupPropertyDefinition(component, s);
            if ((componentPropertyDefinition != null)) {
              result.add(componentPropertyDefinition);
            } else {
              String _name = component.getName();
              String _plus = ((("Reference to property \"#" + s) + "\" of component \"") + _name);
              String _plus_1 = (_plus + "\" not found.");
              BlessControl.println(_plus_1);
            }
          } else {
            EReference _propertyReference_Spname = BLESSPackage.eINSTANCE.getPropertyReference_Spname();
            boolean _equals_2 = Objects.equals(ref, _propertyReference_Spname);
            if (_equals_2) {
              final Classifier me = AadlUtil.getContainingClassifier(context);
              final Property selfPropertyDefinition = GetProperties.lookupPropertyDefinition(me, s);
              if ((selfPropertyDefinition != null)) {
                result.add(selfPropertyDefinition);
              } else {
                BlessControl.println((("Reference to property #\"" + s) + "\" not found."));
              }
            } else {
              EReference _formalActual_Formal = BLESSPackage.eINSTANCE.getFormalActual_Formal();
              boolean _equals_3 = Objects.equals(ref, _formalActual_Formal);
              if (_equals_3) {
                if ((context instanceof FormalActual)) {
                  final FormalActual fa = ((FormalActual) context);
                  EObject _eContainer = fa.eContainer();
                  if ((_eContainer instanceof FormalActualList)) {
                    EObject _eContainer_1 = fa.eContainer();
                    final FormalActualList fal = ((FormalActualList) _eContainer_1);
                    EObject _eContainer_2 = fal.eContainer();
                    if ((_eContainer_2 instanceof SubprogramCall)) {
                      EObject _eContainer_3 = fal.eContainer();
                      final CalledSubprogram prod = ((SubprogramCall) _eContainer_3).getProcedure();
                      if ((prod instanceof SubprogramAccess)) {
                        final SubprogramSubcomponentType sst = ((SubprogramAccess) prod).getSubprogramFeatureClassifier();
                        boolean found = false;
                        if ((sst instanceof SubprogramType)) {
                          final SubprogramType st = ((SubprogramType) sst);
                          EList<Parameter> _ownedParameters = st.getOwnedParameters();
                          for (final Parameter f : _ownedParameters) {
                            if ((f instanceof Parameter)) {
                              boolean _equals_4 = ((Parameter) f).getName().equals(s);
                              if (_equals_4) {
                                result.add(f);
                                found = true;
                              }
                            }
                          }
                          boolean _and = false;
                          boolean _and_1 = false;
                          if (!(!found)) {
                            _and_1 = false;
                          } else {
                            TypeExtension _ownedExtension = st.getOwnedExtension();
                            ComponentType _extended = null;
                            if (_ownedExtension!=null) {
                              _extended=_ownedExtension.getExtended();
                            }
                            boolean _tripleNotEquals = (_extended != null);
                            _and_1 = _tripleNotEquals;
                          }
                          if (!_and_1) {
                            _and = false;
                          } else {
                            ComponentType _extended_1 = st.getOwnedExtension().getExtended();
                            _and = (_extended_1 instanceof SubprogramType);
                          }
                          if (_and) {
                            ComponentType _extended_2 = st.getOwnedExtension().getExtended();
                            SubprogramType ex = ((SubprogramType) _extended_2);
                            while (((!found) && (ex != null))) {
                              EList<Parameter> _ownedParameters_1 = ex.getOwnedParameters();
                              for (final Parameter f2 : _ownedParameters_1) {
                                if ((f2 instanceof Parameter)) {
                                  boolean _equals_5 = ((Parameter) f2).getName().equals(s);
                                  if (_equals_5) {
                                    result.add(f2);
                                    found = true;
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
              } else {
                EAttribute _eventTrigger_Sub = BLESSPackage.eINSTANCE.getEventTrigger_Sub();
                boolean _equals_5 = Objects.equals(ref, _eventTrigger_Sub);
                if (_equals_5) {
                  if ((context instanceof EventTrigger)) {
                    final ComponentClassifier component_1 = this._blessUtil.getSubcomponentFromListOfIDs(context, ((EventTrigger) context).getSub());
                    if ((component_1 != null)) {
                      result.addAll(component_1.getAllFeatures());
                    }
                  }
                }
              }
            }
          }
        }
      }
      boolean _isEmpty = result.isEmpty();
      if (_isEmpty) {
        result.addAll(super.getLinkedObjects(context, ref, node));
      }
      int _size = result.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _string = result.toString();
        String _plus_2 = ((("Cross-reference node \"" + s) + "\" has multiple linked objects:\n  ") + _string);
        String _plus_3 = (_plus_2 + "\n");
        BlessControl.println(_plus_3);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
