//MyBlessLinkingService.java
package com.multitude.aadl.bless.linking

import com.google.inject.Inject
import com.multitude.aadl.bless.BlessControl
import com.multitude.aadl.bless.bLESS.BLESSPackage
import com.multitude.aadl.bless.bLESS.EventTrigger
import com.multitude.aadl.bless.bLESS.FormalActual
import com.multitude.aadl.bless.bLESS.FormalActualList
import com.multitude.aadl.bless.bLESS.PropertyReference
import com.multitude.aadl.bless.bLESS.SubprogramCall
import com.multitude.aadl.bless.util.BlessUtil
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.linking.impl.DefaultLinkingService
import org.eclipse.xtext.linking.impl.IllegalNodeException
import org.eclipse.xtext.nodemodel.INode
import org.osate.aadl2.Parameter
import org.osate.aadl2.SubprogramAccess
import org.osate.aadl2.SubprogramType
import org.osate.aadl2.modelsupport.util.AadlUtil
import org.osate.xtext.aadl2.properties.util.GetProperties

//import edu.ksu.aadl.unitannex.unit.UnitPackage;
class MyBlessLinkingService extends // PropertiesLinkingService // 
  DefaultLinkingService
{
@Inject extension BlessUtil


	override List<EObject> 
getLinkedObjects(EObject context, EReference ref, INode node) throws IllegalNodeException 
	{  //find AADL links
	val List<EObject> result = new ArrayList<EObject>()
	val s = node.crossRefNodeAsString
	if (ref.eIsProxy)
	  EcoreUtil.resolve(ref,context)
	if ( //ref == BLESSPackage.eINSTANCE.numericConstant_PropertyConstant ||
	  ref == BLESSPackage.eINSTANCE.nonNumericProperty_PropertyConstant ||
	    ref == BLESSPackage.eINSTANCE.ANumber_PropertyConstant)
	  {
	  val propertyConstant = // findPropertyConstant(context,s)  
	    GetProperties.lookupPropertyConstant(context,s)
	  if (propertyConstant !== null)
	    result.add(propertyConstant)
    else
	    //System.out
	    BlessControl.println("Reference to property constant \""+s+"\" not found.")
	  }
	else if (ref == BLESSPackage.eINSTANCE.propertyReference_Pname)
    {  //made PropertyReference '#' pname=[aadl2::NamedElement|QCLREF] ( field+=PropertyField )*
      val propertyDefinition = // findPropertyDefinition(context,s)  
        GetProperties.lookupPropertyDefinition(context,s)
      if (propertyDefinition !== null)
        result.add(propertyDefinition)
      else
        //System.out
        BlessControl.println("Reference to global property \"#"+s+"\" not found.")    
//      }
    }
	else if (ref == BLESSPackage.eINSTANCE.propertyReference_Cpname)
	  {  //property of specific component
	  val component = (context as PropertyReference).component	
	  val componentPropertyDefinition = // findPropertyDefinition(component,s) // 
	    GetProperties.lookupPropertyDefinition(component,s)
	  if (componentPropertyDefinition !== null)
	    result.add(componentPropertyDefinition)
    else
      //System.out
      BlessControl.println("Reference to property \"#"+s+"\" of component \""+
        component.name+"\" not found."
      )
	  }
	else if (ref == BLESSPackage.eINSTANCE.propertyReference_Spname)
	  {  //property of this component
	  val me = AadlUtil.getContainingClassifier(context)
	  val selfPropertyDefinition = //findPropertyDefinition(me,s)  
	    GetProperties.lookupPropertyDefinition(me,s)
	  if (selfPropertyDefinition !== null)
	    result.add(selfPropertyDefinition)
    else
      //System.out
      BlessControl.println("Reference to property #\""+s+"\" not found.")
	  }
  else if (ref == BLESSPackage.eINSTANCE.formalActual_Formal)
    {  //it's a parameter
      if (context instanceof FormalActual)
      {
        val fa = context as FormalActual
        if (fa.eContainer instanceof FormalActualList)
        {
          val fal = fa.eContainer as FormalActualList
          if (fal.eContainer instanceof SubprogramCall)
          {
            val prod = (fal.eContainer as SubprogramCall).procedure
//WHAT IF IT'S A SUBCOMPONENT SUBPROGRAM?            
            if (prod instanceof SubprogramAccess)
            {
              val sst = (prod as SubprogramAccess).getSubprogramFeatureClassifier
              var boolean found = false
              if (sst instanceof SubprogramType)
              {
                val st = sst as SubprogramType
                for (f : st.ownedParameters)
                  if (f instanceof Parameter)
                    if ((f as Parameter).name.equals(s))
                    {
                      result.add(f)
                      found = true
                    }
                if (!found && st.ownedExtension?.extended !== null &&
                  st.ownedExtension.extended instanceof SubprogramType)
                {
                  var ex = st.ownedExtension.extended as SubprogramType
                  while (!found && ex !== null)
                  {
                    for (f2 : ex.ownedParameters)
                      if (f2 instanceof Parameter)
                        if ((f2 as Parameter).name.equals(s))
                        {
                          result.add(f2)
                          found = true
                        }
                  }
                }
              }
            }
          }
        }
      }
    } //end of parameter
  //THIS IS UNLIKELY TO FIND THE MODE TRIGGER PORT  
  else if (ref == BLESSPackage.eINSTANCE.eventTrigger_Sub)
    {  //walk the subcompont ID list to find intended subcomponent
    if (context instanceof EventTrigger)
      {
      val component = context.getSubcomponentFromListOfIDs((context as EventTrigger).sub) 
      if (component !== null)
        result.addAll(component.allFeatures) 
      }
    }  //end of event trigger
	if (result.isEmpty)
	  result.addAll(super.getLinkedObjects(context,ref,node)) 
	if (result.size > 1)
	   //System.out
	   BlessControl.println("Cross-reference node \""+s+"\" has multiple linked objects:\n  "+result.toString+"\n")   
	result
	}
	
	
}
