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

class UnitAnnexLinkingService implements AnnexLinkingService
{
//	final private Injector injector = OsateCorePlugin.getDefault().getInjector("edu.ksu.aadl.unitannex.Unit");
//	final package Injector injector = Objects::requireNonNull(
//		MyBlessActivator::getInstance().getInjector(MyBlessActivator::COM_MULTITUDE_AADL_BLESS_BLESS),
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
		if(linkingService === null)
		{
      BlessControl.println("UnitAnnexLinkingService did not get injected ILinkingService")
		}
		return linkingService
	}

	def protected IQualifiedNameProvider getNameProvider()
	{
		if(nameProvider === null)
		{
      BlessControl.println("UnitAnnexLinkingService did not get injected IQualifiedNameProvider")
		}
		return nameProvider
	}


//	def static void loadUnits()
//	{
//	BlessMaps.makeUnitMap
//	val HashSet<IFile> files = new HashSet<IFile>
//	files.addAll(TraverseBlessWorkspace.getAadlFilesInWorkspace);
//	for (IFile file : files) 
//	  {
//	  val ModelUnit ir = AadlUtil.getElement(file) as ModelUnit;
//	  if (ir instanceof AadlPackage) 
//	    {
//		  val List<AnnexLibrary> unitLibrariesInPackage = AnnexUtil.
//				getAllActualAnnexLibraries(ir as AadlPackage, BLESSPackage.eINSTANCE.unitLibrary)
//		  for (lib : unitLibrariesInPackage)
//		    if (lib instanceof UnitLibrary)
//			  for (unitDeclaration : (lib as UnitLibrary).unitDeclarations) 
//			    {
//			    if (unitDeclaration instanceof RootDeclaration) 
//			      {
//				    val rd = unitDeclaration as RootDeclaration
//				    if (BlessMaps.unitMapContainsKey(rd.unitName.name))
////convert to error marker				      
//              BlessControl.println("Root unit \""+rd.unitName.name+"\" in file \""+file.name+"\" has been previously declared.")
//            else
//              {
//				      BlessMaps.unitMapPut(rd.unitName.name,rd.unitName)
//				      for (factor : rd.factors)
//                if (BlessMaps.unitMapContainsKey(factor.unit.name))
////convert to error marker             
//                   BlessControl.println("Unit \""+factor.unit.name+"\" in file \""+file.name+"\" has been previously declared.")
//                else
//				          BlessMaps.unitMapPut(factor.unit.name,factor.unit)
//				      
//				      }
//			    } 
//			  else if (unitDeclaration instanceof UnitExtension)
//				for (factor : (unitDeclaration as UnitExtension).factors)
//				  BlessMaps.unitMapPut(factor.unit.name,factor.unit)
//			  }
//	    } // done with each package
//	  }
//	}  //end of loadUnits

  override List<EObject> 
resolveAnnexReference(String annexName, EObject context, EReference reference, INode node)
  {
    if (annexName.equalsIgnoreCase("Unit")) {
      return linkingService.getLinkedObjects(context, reference, node);
    } else {
      return Collections.<EObject> emptyList();
    }    
  }  //end of resolveAnnexReference

	override QualifiedName getFullyQualifiedName(EObject obj)
	{
		return getNameProvider().getFullyQualifiedName(obj)
	}
}
