package com.multitude.aadl.bless.util

import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.osate.aadl2.ComponentClassifier
import org.osate.aadl2.ComponentImplementation
import org.osate.aadl2.ComponentType
import org.osate.aadl2.Feature
import org.osate.aadl2.Mode
import org.osate.aadl2.Prototype
import org.osate.aadl2.Subcomponent
import org.osate.aadl2.SubprogramAccess
import com.multitude.aadl.bless.bLESS.Invocation
import com.multitude.aadl.bless.bLESS.Assignment
import com.multitude.aadl.bless.bLESS.SimultaneousAssignment
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.HashSet
import java.util.Set
import com.multitude.aadl.bless.validation.AbstractBLESSValidator
import com.multitude.aadl.bless.bLESS.BehaviorActions

class BlessUtil extends AbstractBLESSValidator {

  static val Set<EObject> usedMarkers = new HashSet<EObject>()

  def boolean firstMarkerHere(EObject o)
    {
      if (usedMarkers.contains(o))
        return false
      usedMarkers.add(o)
      return true
    } 
    
  def boolean inBehaviorActions(EObject o) 
    {
    var up=o
    while (up !== null)
      {
      if (up instanceof BehaviorActions)
        return true
      up = up.eContainer      
      }
    return false  
    }   
	
	def List<Feature> getFeaturesOfComponent(EObject n)
	  {
	  var up = n
	  while (up !== null && !(up instanceof ComponentType)&& !(up instanceof ComponentImplementation))
	    up = up.eContainer
	  if (up === null)
	    return Collections.<Feature> emptyList() as List<Feature>;
	  if (up instanceof ComponentType)
	    return (up as ComponentType).allFeatures
	  if (up instanceof ComponentImplementation)
	    return (up as ComponentImplementation).type.allFeatures
	  }
	
	
	def List<Prototype> getPrototypesOfComponent(EObject n) // getOwnedPrototypes();
    {
    var up = n
    while (up !== null && !(up instanceof ComponentType)&& !(up instanceof ComponentImplementation))
      up = up.eContainer
    if (up === null)
      return Collections.<Prototype> emptyList() as List<Prototype>;
    if (up instanceof ComponentType)
      return (up as ComponentType).ownedPrototypes
    if (up instanceof ComponentImplementation)
      return (up as ComponentImplementation).type.ownedPrototypes
    }
	
	def List<SubprogramAccess> getSubprogramAccesses(EObject n)
	  {
	  val List<SubprogramAccess> refs = new ArrayList<SubprogramAccess>()
	  for (f : n.getFeaturesOfComponent )
	    if (f instanceof SubprogramAccess)
	      refs.add(f as SubprogramAccess)
	  return refs
	  }
  
  def List<Subcomponent> getSubcomponents(EObject n)
    {
    var up = n
    while (up !== null && !(up instanceof ComponentImplementation))
      up = up.eContainer
    if (up === null)
      return Collections.<Subcomponent> emptyList() as List<Subcomponent>;
    if (up instanceof ComponentImplementation)
      return (up as ComponentImplementation).allSubcomponents
    }
  
  def List<Mode> getModes(EObject n)
    {
    var up = n
    while (up !== null && !(up instanceof ComponentImplementation)
          && !(up instanceof ComponentType))
      up = up.eContainer
    if (up === null)
      return Collections.<Mode> emptyList() as List<Mode>;
    if (up instanceof ComponentImplementation)
      return (up as ComponentImplementation).allModes
    if (up instanceof ComponentType)
      return (up as ComponentType).allModes
    }
  
  def ComponentClassifier getSubcomponentFromListOfIDs(EObject n, Iterable<String> sub)
    {  //find subcomponent for EventTrigger
    for (subcomponent : n.getSubcomponents)
      if (subcomponent.name == sub.head)
        if (sub.length == 1)
          return subcomponent.classifier
        else
          return subcomponent.getSubcomponentFromListOfIDs(sub.tail)
    return null
    }
	
	def static String pathToString(List<String> path)
	  {
	  val sb = new StringBuffer()
	  for (p : path)
	    sb.append("/"+p)
	  sb.toString
	  }

  
  def boolean containedInInvocation(EObject o)
    {
    var c = o.eContainer
    while (c !== null && !(c instanceof Invocation))
      c = c.eContainer
    c !== null
    }
  
  def EObject getAsgnInAssignment(EObject o)
    {
    var c = o.eContainer
    while (c !== null && !(c instanceof Assignment))
      c = c.eContainer
    c
    }
  
  def EObject getAsgnInSimultaneousAssignment(EObject o)
    {
    var c = o.eContainer
    while (c !== null && !(c instanceof SimultaneousAssignment))
      c = c.eContainer
    c
    }
  	  
}