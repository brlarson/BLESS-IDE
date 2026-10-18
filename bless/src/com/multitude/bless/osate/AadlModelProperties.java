//AadlModelProperties.java

package com.multitude.bless.osate;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Property;
import org.osate.xtext.aadl2.properties.util.GetProperties;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;

import com.multitude.bless.app.ModelProperties;

/**
 * @author brl
 * ModelProperties reading AADL property values; installed by Activator.start()
 */
public class AadlModelProperties implements ModelProperties
{

@Override
public String getIntegerPropertyValue(EObject element, String propertySet, String propertyName)
  {
  Property prop = (propertySet==null)
      ? GetProperties.lookupPropertyDefinition(element,propertyName)
      : GetProperties.lookupPropertyDefinition(element,propertySet,propertyName);
  if (prop!=null)
    return Long.toString(PropertyUtils.getIntegerValue((NamedElement) element,prop));
  return null;
  }

}  //end of AadlModelProperties
