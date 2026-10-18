//ComponentContext.java

package com.multitude.bless.record;

import org.eclipse.emf.ecore.EObject;

/**
 * @author brl
 * The architecture properties of a component that a ThreadRecord needs.
 * Has no OSATE dependency; the AADL front end supplies
 * com.multitude.bless.osate.AadlComponentContext.
 */
public interface ComponentContext
{
  /** front-end model element for the component, kept as ParseRecord.context */
  EObject getModelElement();

  /** name of the dispatch protocol (e.g. "Periodic", "Sporadic"), or null when none is given */
  String getDispatchProtocol();

  /** thread period in milliseconds */
  double getPeriodInMS();

  /** the BLESS::Invariant property definition, as text, or null when it is not defined */
  String getInvariantPropertyDefinition();

  /**
   * value of the component's BLESS::Invariant property ("" when it has no value),
   * or null when that property does not apply to the component
   */
  String getInvariantPropertyValue();

  /** line number of the BLESS::Invariant property value, or 0 */
  int getInvariantPropertyLine();
}  //end of ComponentContext
