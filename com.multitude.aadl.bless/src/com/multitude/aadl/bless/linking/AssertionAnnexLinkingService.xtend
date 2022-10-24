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
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.osate.annexsupport.AnnexLinkingService

class AssertionAnnexLinkingService implements AnnexLinkingService
{
		
@Inject 	ILinkingService linkingService
@Inject 	IQualifiedNameProvider nameProvider
@Inject 	ResourceDescriptionsProvider rdp

  new() 
  {
    val Injector injector = IResourceServiceProvider.Registry.INSTANCE.
       getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(typeof(Injector));
    injector.injectMembers(this);
  }

	def protected ILinkingService 
getLinkingService()
	{
		if (linkingService === null)
		{
      BlessControl.println("AssertionAnnexLinkingService did not get injected ILinkingService")
		}
		return linkingService
	}

	def protected IQualifiedNameProvider 
getNameProvider()
	{
		if (nameProvider === null)
		{
      BlessControl.println("AssertionAnnexLinkingService did not get injected IQualifiedNameProvider")
		}
		return nameProvider
	}

	def protected ResourceDescriptionsProvider 
getResourceDescriptionsProvider()
	{
		if (rdp === null)
		{
      BlessControl.println("AssertionAnnexLinkingService did not get injected ResourceDescriptionsProvider")
		}
		return rdp
	}

  override QualifiedName 
getFullyQualifiedName(EObject obj)
  {
    return getNameProvider().getFullyQualifiedName(obj)
  }

//  def static void 
//loadAssertions()
//  {
//    BlessMaps.makeAssertionMap 
//    BlessMaps.makeGhostVariableMap 
//    val HashSet<IFile> files = TraverseBlessWorkspace.getAadlFilesInWorkspace()
//    for (IFile file : files)
//    {
//      var Element anElement = AadlUtil.getElement(file)
//      val ModelUnit ir = (anElement as ModelUnit)
//      if (ir instanceof AadlPackage)
//      {
//        val List<AnnexLibrary> assertionLibrariesInPackage = AnnexUtil.getAllActualAnnexLibraries((ir as AadlPackage),
//          BLESSPackage.eINSTANCE.getAssertionLibrary())
//        for (AnnexLibrary lib : assertionLibrariesInPackage)
//          if ((lib instanceof AssertionLibrary))
//          {
//            var EList<NamedAssertion> assertionList = (lib as AssertionLibrary).getAssertion_list()
//            for (NamedAssertion assertion : assertionList)
//              if (assertion instanceof NamedAssertion)
//                if (BlessMaps.assertionMapContainsKey((assertion as NamedAssertion).getName()))
////change to error marker
//                  BlessControl.println("Named assertion \""+(assertion as NamedAssertion).getName()+"\" was previously declared")
//                else
//                  BlessMaps.assertionMapPut((assertion as NamedAssertion).getName(), (assertion as NamedAssertion))
//            var GhostVariables ghosts = (lib as AssertionLibrary).getGhosts()
//            if (ghosts !== null)
//              for (GhostVariable ghost : ghosts.gv)
//                if (BlessMaps.ghostVariableMapContainsKey(ghost.getGhost().getName()))
////change to error marker
//                  BlessControl.println("Ghost variable \""+ghost.getGhost().getName()+"\" was previously declared.")
//                else
//                  BlessMaps.ghostVariableMapPut(ghost.getGhost().getName(), ghost.getGhost())
//          }
//      }
//    }
//  }  //end of loadAssertions
  

  override List<EObject> 
resolveAnnexReference(String annexName, EObject context, EReference reference, INode node)
  {
    if (annexName.equalsIgnoreCase("Assertion")) {
      return linkingService.getLinkedObjects(context, reference, node);
    } else {
      return Collections.<EObject> emptyList();
    }    
  }  //end of resolveAnnexReference

}
