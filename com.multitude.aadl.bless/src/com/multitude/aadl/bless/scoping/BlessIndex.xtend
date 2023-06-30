package com.multitude.aadl.bless.scoping

import com.google.inject.Guice
import com.google.inject.Inject
import com.multitude.aadl.bless.BLESSRuntimeModule
import com.multitude.aadl.bless.bLESS.BLESSPackage
import com.multitude.aadl.bless.bLESS.GhostVariable
import com.multitude.aadl.bless.bLESS.NamedAssertion
import com.multitude.aadl.bless.bLESS.RootDeclaration
import com.multitude.aadl.bless.bLESS.TypeDeclaration
import com.multitude.aadl.bless.bLESS.UnitDeclaration
import com.multitude.aadl.bless.bLESS.UnitExtension
import com.multitude.aadl.bless.bLESS.UnitName
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import com.multitude.aadl.bless.BlessControl
import com.multitude.aadl.bless.bLESS.Type
import com.multitude.aadl.bless.exception.ValidationException

//import org.example.smalljava.smallJava.SmallJavaPackage
class BlessIndex
{
	@Inject
	ResourceDescriptionsProvider rdp

	@Inject
	IContainer.Manager cm
	
//	@Inject
//	extension EcoreUtil2
  var ResourceSet rs

  def UnitName findUnitNameFromString(EObject context, String s)
    {
    val s2 = s.equals('sec') ? 's' : s	//substitute AADL sec with s
    for (un : context.eResource.getVisibleUnitNames)
      if (un.name !== null)
        if (un.name.equals(s2))
    	    return un
    }

	def getVisibleEObjectDescriptions(EObject o)
	{
		o.getVisibleContainers.map [ container |
			container.getExportedObjects
		].flatten
	}

	def getVisibleEObjectDescriptions(EObject o, EClass type)
	{
		o.getVisibleContainers.map [ container |
			container.getExportedObjectsByType(type)
		].flatten
	}

//  def Iterable<AadlPackage> 
//getAadlPackages()
//  {
//  if (rs === null)
//    rs = ResourcesPlugin.getWorkspace().getRoot().
//  if (rdp === null) 
//    rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
//  val rd = rdp.getResourceDescriptions(o)
//  rd.getExportedObjectsByType(Aadl2Package.eINSTANCE.aadlPackage).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(AadlPackage)
//  }

  def Iterable<Exception> 
getVisibleExceptions(Resource o)
  {
  if (rdp === null) 
    rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
  val rd = rdp.getResourceDescriptions(o)
  rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.exception).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(Exception)
  }

  def Iterable<GhostVariable> 
getVisibleGhostVariables(Resource o)
  {
  if (rdp === null) 
    rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
  val rd = rdp.getResourceDescriptions(o)
  rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.ghostVariable).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(GhostVariable)
  }

  def Iterable<NamedAssertion> 
getVisibleNamedAssertions(Resource o)
  {
  if (rdp === null) 
    rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
  val rd = rdp.getResourceDescriptions(o)
  rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.namedAssertion).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(NamedAssertion)
  }

  def Iterable<TypeDeclaration> 
getVisibleTypeDeclarations(Resource o)
  {
  if (rdp === null) 
    rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
  val rd = rdp.getResourceDescriptions(o)
  rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.typeDeclaration).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(TypeDeclaration)
  }

  def Iterable<UnitName> 
getVisibleUnitNames(Resource o)
  {
  if (rdp === null) 
    rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
  val rd = rdp.getResourceDescriptions(o)
  rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.unitName).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(UnitName)
  }

	def Iterable<UnitDeclaration> 
getVisibleUnitDeclarations(Resource o)
	{
//		o.getVisibleEObjectDescriptions(BLESSPackage::eINSTANCE.unitDeclaration)
	if (rdp === null) 
		rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
  val rd = rdp.getResourceDescriptions(o)
  rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.unitDeclaration).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(UnitDeclaration)
	}

	def Iterable<RootDeclaration> 
getVisibleRootDeclarations(EObject o)
	{
	if (rdp === null) 
		rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
	if (o.eResource!==null)
	  {
    val rd = rdp.getResourceDescriptions(o.eResource)
    rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.rootDeclaration).map[EObjectOrProxy].map[EcoreUtil.resolve(it,o)].filter(RootDeclaration)
	  }	
	}

	def Iterable<RootDeclaration> 
getBaseUnitDeclarations(EObject o)
	{
		o.getVisibleRootDeclarations.filter[base]
	}

	def UnitName 
getRootUnit(UnitName o)
  {
    val root = EcoreUtil2.getContainerOfType(o, RootDeclaration)
    if (root === null)
    {
      val ext = EcoreUtil2.getContainerOfType(o, UnitExtension)
      if (ext !== null)
        ext.root
      else
      {
        //BlessControl. 
        System.out.println("Unit name \"" + o.name + "\" has neither root declaration, nor unit extension.")
        o
      }
    }
    else
    {
      root.unitName
    }
  }

	def RootDeclaration 
getRootDeclaration(UnitName o)
	{
	val ue = EcoreUtil2.getContainerOfType(o, UnitExtension)
	if (ue !== null)
	  {
	  val UnitName extensionRoot = EcoreUtil.resolve(ue.root,o) as UnitName
	  return extensionRoot.eContainer as RootDeclaration
	  }
	var rd = EcoreUtil2.getContainerOfType(o, RootDeclaration)
	if (rd === null)
		rd = o.getVisibleRootDeclarations.filter[it.unitName.name.equals(o.name)].head
//		 EcoreUtil2.getContainerOfType(o, RootDeclaration)
  rd
	}

	def
getVisibleContainers(EObject o)
	{
		if (rdp === null) 
			rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
		if (cm === null)
			cm = Guice.createInjector(new BLESSRuntimeModule()).getInstance(IContainer.Manager)
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.getURI)
		if (rd !== null)
			cm.getVisibleContainers(rd, index)
		else
			emptyList
	}

	def getResourceDescription(EObject o)
	{
		if (rdp === null) 			
		  rdp = Guice.createInjector(new BLESSRuntimeModule()).getInstance(ResourceDescriptionsProvider)
		val index = rdp.getResourceDescriptions(o.eResource)
		index.getResourceDescription(o.eResource.getURI)
	}

  def ResourceSet getResourceSet(EObject o)
  {
  if (rs === null)
  	rs = o.eResource.resourceSet
  rs
  }
  
//	def getExportedEObjectDescriptions(EObject o)
//	{
//		o.getResourceDescription.getExportedObjects
//	}

var UnitName s = null;  //cached unit name for seconds
	
def	UnitName getTimeUnit(EObject o)
  {
  if (s===null) 
    s = o.findUnitNameFromString("s")   
  s	
  }
  

def Type getTypeFromID(String id, Resource r) throws ValidationException
  {
  val td = r.getVisibleTypeDeclarations.filter[it.name==id].head
  if (td ===null)
    throw new ValidationException("No type declaration found for \""+id+"\"")
  td.type 
  }
  
//def UnitName findRootUnitWithTopAndBottom(EObject o, EList<UnitName> t, EList<UnitName> b)
//  {
//  var UnitName un = null
//  for (r : o.getVisibleRootDeclarations) 
//    if (r.base && t.contains(r.unitName) && t.size===1 && b.empty)  //is it a base unit?
//      un = r.unitName
//    else if (t.containsAll(r.formula?.top) && b.containsAll(r.formula?.bottom) )
//      un = r.unitName
//  if (un === null)
//    {
//    un = UnitFactory.eINSTANCE.createUnitName
//    un.name = t.toString + '_' + b.toString
//    }
//  un 
//  }

}
