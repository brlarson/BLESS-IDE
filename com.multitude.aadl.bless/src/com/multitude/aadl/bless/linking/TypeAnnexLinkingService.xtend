package com.multitude.aadl.bless.linking

import com.google.inject.Inject
import com.google.inject.Injector
import com.multitude.aadl.bless.BlessControl
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.linking.ILinkingService
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.osate.annexsupport.AnnexLinkingService

class TypeAnnexLinkingService implements AnnexLinkingService
{
	// final private Injector injector = OsateCorePlugin.getDefault().getInjector("edu.ksu.aadl.unitannex.Unit");
//	final package Injector injector = Objects.requireNonNull(
//		MyBlessActivator.getInstance().getInjector(MyBlessActivator.COM_MULTITUDE_AADL_BLESS_BLESS),
//		"Unable to retrieve injector")

@Inject	ILinkingService linkingService
@Inject	IQualifiedNameProvider nameProvider

  new() 
  {
    val Injector injector = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(typeof(Injector));
    injector.injectMembers(this);
  }

	def protected ILinkingService getLinkingService()
	{
		if (linkingService === null)
		{
			BlessControl.println("TypeAnnexLinkingService did not get injected ILinkingService")
		}
		return linkingService
	}

	def protected IQualifiedNameProvider getNameProvider()
	{
		if (nameProvider === null)
		{
      BlessControl.println("TypeAnnexLinkingService did not get injected IQualifiedNameProvider")
		}
		return nameProvider
	}


//	def static void 
//loadTypes()
//	{
//	BlessMaps.makeTypeMap 
//	val HashSet<IFile> files = TraverseBlessWorkspace.getAadlFilesInWorkspace();
//	for (IFile file : files) 
//	  {
//	  val ModelUnit ir = AadlUtil.getElement(file) as ModelUnit;
//	  if (ir instanceof AadlPackage) 
//	    {
//		  val List<AnnexLibrary> typeLibrariesInPackage = 
//		    AnnexUtil.getAllActualAnnexLibraries(ir as AadlPackage, BLESSPackage::eINSTANCE.typeLibrary)
//		  for (lib : typeLibrariesInPackage)
//		    if (lib instanceof TypeLibrary)
//			    for (typeDeclaration : (lib as TypeLibrary).decs)
//			      if (BlessMaps.typeMapContainsKey(typeDeclaration.name))
////change to error marker
//			        BlessControl.println("Type \""+typeDeclaration.name+"\" in file \""+file.name+"\"  was previously declared.")
//			      else
//			        BlessMaps.typeMapPut(typeDeclaration.name,typeDeclaration)
//		  } // done with each package
//	  }
//	}  //end of loadTypes

  override List<EObject> 
resolveAnnexReference(String annexName, EObject context, EReference reference, INode node)
  {
    if (annexName.equalsIgnoreCase("Typedef")) {
      return linkingService.getLinkedObjects(context, reference, node);
    } else {
      return Collections.<EObject> emptyList();
    }    
  }  //end of resolveAnnexReference

	// end of resolveAnnexReference
	override QualifiedName getFullyQualifiedName(EObject obj)
	{
		return getNameProvider().getFullyQualifiedName(obj)
	}
}
