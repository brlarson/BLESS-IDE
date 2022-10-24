package com.multitude.aadl.bless.util

import com.multitude.aadl.bless.bLESS.Assertion
import com.multitude.aadl.bless.bLESS.AssertionLibrary
import com.multitude.aadl.bless.bLESS.NamedAssertion
import java.util.List
import org.eclipse.emf.ecore.EObject

class AssertionUtil {
	
	static def boolean isNamedAssertionParameter(EObject o)
	  {
	  var EObject container = o.eContainer
		while (container !== null && !(container instanceof NamedAssertion)) 
		  {
			container = container.eContainer();
		  }
	  return container !== null	
	  }
	
  static def boolean containedInAssertion(EObject o)
    {
    if (o instanceof Assertion || o instanceof NamedAssertion) return true
    var c = o.eContainer
    while (c !== null && !(c instanceof Assertion) &&!(c instanceof NamedAssertion) && 
      !(c instanceof AssertionLibrary))
      c = c.eContainer
    c !== null
    }

/**
 * find all the named assertions in children of this node
 */
  static def void getAllContainedNamedAssertions(EObject o, List<NamedAssertion> namedAssertions)
    {
    for (EObject e : o.eContents()) 
      {
      if (e instanceof NamedAssertion)
        namedAssertions.add(e as NamedAssertion)
      else
        getAllContainedNamedAssertions(e,namedAssertions)
      }
    }
	
}