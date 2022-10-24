package com.multitude.aadl.bless.util;

import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.AssertionLibrary;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class AssertionUtil {
  public static boolean isNamedAssertionParameter(final EObject o) {
    EObject container = o.eContainer();
    while (((container != null) && (!(container instanceof NamedAssertion)))) {
      container = container.eContainer();
    }
    return (container != null);
  }

  public static boolean containedInAssertion(final EObject o) {
    boolean _xblockexpression = false;
    {
      if (((o instanceof Assertion) || (o instanceof NamedAssertion))) {
        return true;
      }
      EObject c = o.eContainer();
      while (((((c != null) && (!(c instanceof Assertion))) && (!(c instanceof NamedAssertion))) && 
        (!(c instanceof AssertionLibrary)))) {
        c = c.eContainer();
      }
      _xblockexpression = (c != null);
    }
    return _xblockexpression;
  }

  /**
   * find all the named assertions in children of this node
   */
  public static void getAllContainedNamedAssertions(final EObject o, final List<NamedAssertion> namedAssertions) {
    EList<EObject> _eContents = o.eContents();
    for (final EObject e : _eContents) {
      if ((e instanceof NamedAssertion)) {
        namedAssertions.add(((NamedAssertion) e));
      } else {
        AssertionUtil.getAllContainedNamedAssertions(e, namedAssertions);
      }
    }
  }
}
