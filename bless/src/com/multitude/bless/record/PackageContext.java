//PackageContext.java

package com.multitude.bless.record;

import org.eclipse.emf.ecore.EObject;

/**
 * @author brl
 * The model unit and file a PackageRecord was loaded from.
 * Has no OSATE dependency; the AADL front end supplies
 * com.multitude.bless.osate.AadlPackageContext.
 */
public interface PackageContext
{
  /** front-end model element for the package, kept as ParseRecord.context */
  EObject getModelElement();

  /** front-end handle on the source file (e.g. an Eclipse IFile), or null */
  Object getResource();

  /** name of the source file, for messages, or null */
  String getResourceName();
}  //end of PackageContext
