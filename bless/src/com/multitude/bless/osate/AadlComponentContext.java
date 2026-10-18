//AadlComponentContext.java

package com.multitude.bless.osate;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.Property;
import org.osate.xtext.aadl2.properties.util.GetProperties;

import com.multitude.bless.record.ComponentContext;

/**
 * @author brl
 * ComponentContext reading Dispatch_Protocol, Period, and BLESS::Invariant
 * from an AADL component classifier
 */
public class AadlComponentContext implements ComponentContext
{
private final ComponentClassifier classifier;

public AadlComponentContext(ComponentClassifier c)
  {
  classifier = c;
  }

@Override
public EObject getModelElement() { return classifier; }

public ComponentClassifier getClassifier() { return classifier; }

@Override
public String getDispatchProtocol()
  {
  EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol(classifier);
  return dispatchProtocol==null ? null : dispatchProtocol.getName();
  }

@Override
public double getPeriodInMS()
  {
  return GetProperties.getPeriodinMS(classifier);
  }

@Override
public String getInvariantPropertyDefinition()
  {
  Property pn = GetProperties.lookupPropertyDefinition(classifier, "BLESS::Invariant");
  return pn==null ? null : pn.toString();
  }

}  //end of AadlComponentContext
