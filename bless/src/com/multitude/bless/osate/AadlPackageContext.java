//AadlPackageContext.java

package com.multitude.bless.osate;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.AadlPackage;

import com.multitude.bless.record.PackageContext;
import com.multitude.bless.record.PackageRecord;

/**
 * @author brl
 * PackageContext for an AADL package and the .aadl file it came from
 */
public class AadlPackageContext implements PackageContext
{
private final AadlPackage aadlPackage;
private final IFile file;

public AadlPackageContext(AadlPackage p, IFile f)
  {
  aadlPackage = p;
  file = f;
  }

@Override
public EObject getModelElement() { return aadlPackage; }

@Override
public Object getResource() { return file; }

@Override
public String getResourceName() { return file==null ? null : file.getName(); }

public AadlPackage getAadlPackage() { return aadlPackage; }

public IFile getFile() { return file; }

/** the AADL package of a PackageRecord loaded by LoadBLESS */
public static AadlPackage aadlPackageOf(PackageRecord pr)
  {
  return ((AadlPackageContext) pr.packageContext).aadlPackage;
  }

/** the .aadl file of a PackageRecord loaded by LoadBLESS */
public static IFile fileOf(PackageRecord pr)
  {
  return ((AadlPackageContext) pr.packageContext).file;
  }

}  //end of AadlPackageContext
