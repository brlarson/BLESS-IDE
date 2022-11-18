package com.multitude.aadl.bless.util;

import com.google.common.base.Objects;
import com.multitude.aadl.bless.bLESS.Assignment;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.Invocation;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.NamelessAssertion;
import com.multitude.aadl.bless.bLESS.NamelessEnumeration;
import com.multitude.aadl.bless.bLESS.NamelessFunction;
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment;
import com.multitude.aadl.bless.validation.AbstractBLESSValidator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.Feature;
import org.osate.aadl2.Mode;
import org.osate.aadl2.Prototype;
import org.osate.aadl2.Subcomponent;
import org.osate.aadl2.SubprogramAccess;

@SuppressWarnings("all")
public class BlessUtil extends AbstractBLESSValidator {
  private static final Set<EObject> usedMarkers = new HashSet<EObject>();

  public boolean firstMarkerHere(final EObject o) {
    boolean _contains = BlessUtil.usedMarkers.contains(o);
    if (_contains) {
      return false;
    }
    BlessUtil.usedMarkers.add(o);
    return true;
  }

  public boolean inBehaviorActions(final EObject o) {
    EObject up = o;
    while ((up != null)) {
      {
        if ((up instanceof BehaviorActions)) {
          return true;
        }
        up = up.eContainer();
      }
    }
    return false;
  }

  public boolean inAssertion(final EObject o) {
    EObject up = o;
    while ((up != null)) {
      {
        if (((((up instanceof NamedAssertion) || (up instanceof NamelessAssertion)) || (up instanceof NamelessFunction)) || (up instanceof NamelessEnumeration))) {
          return true;
        }
        up = up.eContainer();
      }
    }
    return false;
  }

  public List<Feature> getFeaturesOfComponent(final EObject n) {
    EObject up = n;
    while ((((up != null) && (!(up instanceof ComponentType))) && (!(up instanceof ComponentImplementation)))) {
      up = up.eContainer();
    }
    if ((up == null)) {
      List<Feature> _emptyList = Collections.<Feature>emptyList();
      return ((List<Feature>) _emptyList);
    }
    if ((up instanceof ComponentType)) {
      return ((ComponentType) up).getAllFeatures();
    }
    if ((up instanceof ComponentImplementation)) {
      return ((ComponentImplementation) up).getType().getAllFeatures();
    }
    return null;
  }

  public List<Prototype> getPrototypesOfComponent(final EObject n) {
    EObject up = n;
    while ((((up != null) && (!(up instanceof ComponentType))) && (!(up instanceof ComponentImplementation)))) {
      up = up.eContainer();
    }
    if ((up == null)) {
      List<Prototype> _emptyList = Collections.<Prototype>emptyList();
      return ((List<Prototype>) _emptyList);
    }
    if ((up instanceof ComponentType)) {
      return ((ComponentType) up).getOwnedPrototypes();
    }
    if ((up instanceof ComponentImplementation)) {
      return ((ComponentImplementation) up).getType().getOwnedPrototypes();
    }
    return null;
  }

  public List<SubprogramAccess> getSubprogramAccesses(final EObject n) {
    final List<SubprogramAccess> refs = new ArrayList<SubprogramAccess>();
    List<Feature> _featuresOfComponent = this.getFeaturesOfComponent(n);
    for (final Feature f : _featuresOfComponent) {
      if ((f instanceof SubprogramAccess)) {
        refs.add(((SubprogramAccess) f));
      }
    }
    return refs;
  }

  public List<Subcomponent> getSubcomponents(final EObject n) {
    EObject up = n;
    while (((up != null) && (!(up instanceof ComponentImplementation)))) {
      up = up.eContainer();
    }
    if ((up == null)) {
      List<Subcomponent> _emptyList = Collections.<Subcomponent>emptyList();
      return ((List<Subcomponent>) _emptyList);
    }
    if ((up instanceof ComponentImplementation)) {
      return ((ComponentImplementation) up).getAllSubcomponents();
    }
    return null;
  }

  public List<Mode> getModes(final EObject n) {
    EObject up = n;
    while ((((up != null) && (!(up instanceof ComponentImplementation))) && (!(up instanceof ComponentType)))) {
      up = up.eContainer();
    }
    if ((up == null)) {
      List<Mode> _emptyList = Collections.<Mode>emptyList();
      return ((List<Mode>) _emptyList);
    }
    if ((up instanceof ComponentImplementation)) {
      return ((ComponentImplementation) up).getAllModes();
    }
    if ((up instanceof ComponentType)) {
      return ((ComponentType) up).getAllModes();
    }
    return null;
  }

  public ComponentClassifier getSubcomponentFromListOfIDs(final EObject n, final Iterable<String> sub) {
    List<Subcomponent> _subcomponents = this.getSubcomponents(n);
    for (final Subcomponent subcomponent : _subcomponents) {
      String _name = subcomponent.getName();
      String _head = IterableExtensions.<String>head(sub);
      boolean _equals = Objects.equal(_name, _head);
      if (_equals) {
        int _length = ((Object[])Conversions.unwrapArray(sub, Object.class)).length;
        boolean _equals_1 = (_length == 1);
        if (_equals_1) {
          return subcomponent.getClassifier();
        } else {
          return this.getSubcomponentFromListOfIDs(subcomponent, IterableExtensions.<String>tail(sub));
        }
      }
    }
    return null;
  }

  public static String pathToString(final List<String> path) {
    String _xblockexpression = null;
    {
      final StringBuffer sb = new StringBuffer();
      for (final String p : path) {
        sb.append(("/" + p));
      }
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }

  public boolean containedInInvocation(final EObject o) {
    boolean _xblockexpression = false;
    {
      EObject c = o.eContainer();
      while (((c != null) && (!(c instanceof Invocation)))) {
        c = c.eContainer();
      }
      _xblockexpression = (c != null);
    }
    return _xblockexpression;
  }

  public EObject getAsgnInAssignment(final EObject o) {
    EObject _xblockexpression = null;
    {
      EObject c = o.eContainer();
      while (((c != null) && (!(c instanceof Assignment)))) {
        c = c.eContainer();
      }
      _xblockexpression = c;
    }
    return _xblockexpression;
  }

  public EObject getAsgnInSimultaneousAssignment(final EObject o) {
    EObject _xblockexpression = null;
    {
      EObject c = o.eContainer();
      while (((c != null) && (!(c instanceof SimultaneousAssignment)))) {
        c = c.eContainer();
      }
      _xblockexpression = c;
    }
    return _xblockexpression;
  }
}
