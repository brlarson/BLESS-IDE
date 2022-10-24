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
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.osate.annexsupport.AnnexLinkingService

class BlessAnnexLinkingService implements AnnexLinkingService
{

//	final package Injector injector = Objects.requireNonNull(
//		MyBlessActivator.getInstance().getInjector(MyBlessActivator.COM_MULTITUDE_AADL_BLESS_BLESS),
//		"Unable to retrieve injector")

@Inject	ILinkingService linkingService
@Inject	IQualifiedNameProvider nameProvider
@Inject	ResourceDescriptionsProvider rdp

  new() 
  {
    val Injector injector = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(typeof(Injector));
    injector.injectMembers(this);
  }

	def protected ILinkingService 
getLinkingService()
	{
		if(linkingService === null)
		{
      BlessControl.println("BlessAnnexLinkingService did not get injected ILinkingService")
		}
		return linkingService
	}

	def protected IQualifiedNameProvider 
getNameProvider()
	{
		if(nameProvider === null)
		{
      BlessControl.println("BlessAnnexLinkingService did not get injected IQualifiedNameProvider")
		}
		return nameProvider
	}

	def protected ResourceDescriptionsProvider 
getResourceDescriptionsProvider()
	{
		if(rdp === null)
		{
      BlessControl.println("BlessAnnexLinkingService did not get injected ResourceDescriptionsProvider")
		}
		return rdp
	}

	override 
getFullyQualifiedName(EObject obj)
	{
		return getNameProvider().getFullyQualifiedName(obj)
	}

  override List<EObject> 
resolveAnnexReference(String annexName, EObject context, EReference reference, INode node)
  {
    if (annexName.equalsIgnoreCase("BLESS")) {
      return linkingService.getLinkedObjects(context, reference, node);
    } else {
      return Collections.<EObject> emptyList();
    }    
  }  //end of resolveAnnexReference

}
