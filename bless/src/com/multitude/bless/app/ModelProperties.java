//ModelProperties.java

package com.multitude.bless.app;

import org.eclipse.emf.ecore.EObject;

/**
 * @author brl
 * Reads property values from the user's architecture model, for
 * Global.getAadlPropertyValue (used when unparsing property references).
 * Has no OSATE dependency; Activator.start() installs
 * com.multitude.bless.osate.AadlModelProperties.
 * The default, NONE, defines no properties.
 */
public interface ModelProperties
{
  /**
   * integer value, as text, of the property on the model element;
   * propertySet may be null for a qualified or predeclared property name;
   * null when no such property is defined
   */
  String getIntegerPropertyValue(EObject element, String propertySet, String propertyName);

  ModelProperties NONE = (element, propertySet, propertyName) -> null;
}  //end of ModelProperties
