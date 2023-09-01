//ThreadRecord.java
//holds all the Maps for a BLESS thread behavior

//(C) 2010 Multitude Corporation

package com.multitude.bless.record;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Property;
import org.osate.aadl2.ThreadClassifier;
import org.osate.xtext.aadl2.properties.util.GetProperties;

import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.symbol.CompleteStateMapRecord;
import com.multitude.bless.tree.BAST;

public class ThreadRecord extends ParseRecord
{
public String threadTypeID=null;	//identifier for this AADL thread component type
public String threadImplementationID=null;	//identifier for this AADL thread component implementation (if any)
public ThreadRecord myThreadType = null;  //only if thread implementation
public ArrayList<CompleteStateMapRecord> complete_state_list=null;  //map of complete states for transition v.c. precondition

//map of state labels to the state's Assertion
public HashMap<String,BAST> state_assertion_map = new HashMap<String,BAST>();
//map of complete state labels to the state's Assertion
public HashMap<String,BAST> complete_state_assertion_map = new HashMap<String,BAST>();
//map of execute state labels to the state's Assertion
public HashMap<String,BAST> execute_state_assertion_map = new HashMap<String,BAST>();
//map of transition labels to following Assertions
public HashMap<String,BAST> transition_label_assertion_map = new HashMap<String,BAST>();
public boolean isPeriodic=false;


public ThreadRecord(BAST cu, String typeid, ComponentClassifier context, PackageRecord pr)	//cu=compilation unit root of thread
{
//this.context=context;
super(cu,typeid,context,pr);	//invoke ParseRecord constructor
threadTypeID = typeid;
if (cu!=null)
  cu.setParseRecord(this);
myThreadType = this;
EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol(context);
isPeriodic = (dispatchProtocol==null ? false : (dispatchProtocol.getName().endsWith("Periodic")||dispatchProtocol.getName().endsWith("Hybrid")));
}	//end of ThreadRecord constructor

//constructor for thread implementations
public ThreadRecord(BAST cu, String typeid, String impid, ComponentClassifier context, PackageRecord pr)	//cu=compilation unit root of thread
{  //includes implementation ID
super(cu,typeid+"."+impid,impid,context,pr);	//invoke ParseRecord constructor
threadTypeID = typeid;
threadImplementationID = impid;
if (cu!=null)
  cu.setParseRecord(this);
EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol(context);
isPeriodic = (dispatchProtocol==null ? false : (dispatchProtocol.getName().endsWith("Periodic")||dispatchProtocol.getName().endsWith("Hybrid")));
if ((pr!=null)&&(pr.component_type_map!=null)&&pr.component_type_map.containsKey(typeid))
  {
  myThreadType = (ThreadRecord) pr.component_type_map.get(typeid);
  if (dispatchProtocol==null)
    isPeriodic = myThreadType.isPeriodic;
  }
}	//end of ThreadRecord constructor

//	boolean saidPeriodic=false;
//	boolean isPeriodic=false;

  public boolean
isPeriodic()
//    throws YouIdiot //,ProofException
    {
    return isPeriodic;
//    EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol((NamedElement)myThreadType.context);
//    return (dispatchProtocol.getName().endsWith("Periodic")||dispatchProtocol.getName().endsWith("Hybrid"));
//    return isPeriodic;
//    if (saidPeriodic)
//			{
//				return isPeriodic;
//				}
//    if (context==null)
//			{
//				throw new YouIdiot("null AADL architecture context");
//				}
//    if (context instanceof NamedElement)
//      {
//      EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol((NamedElement)context);
//      if (dispatchProtocol==null)
//        {
//				if (verbose() && !saidPeriodic)
//					{
//						Dump.it(this.name+
//						  (this.threadImplementationID!=null?"."+this.threadImplementationID:"")
//						  +" does not have a Dispatch_Protocol property, so is deemed not Periodic.");
//						}
//        saidPeriodic=true;
//        isPeriodic=false;
//        return false;
//        }
//      else
//        {
//				if (verbose() && !saidPeriodic)
//					{
//						Dump.it("Thread \""+this.name+
//						  (this.threadImplementationID!=null?"."+this.threadImplementationID:"")
//						  +"\" has Dispatch_Protocol property "+dispatchProtocol.getName());
//						}
//        saidPeriodic=true;
//        isPeriodic=(dispatchProtocol.getName().endsWith("Periodic")||dispatchProtocol.getName().endsWith("Hybrid"));
//        return isPeriodic;
//        }
//      }
//    else
//      {
//      Dump.it("context="+context.toString());
//      throw new YouIdiot("AADL architecture context was not instance of NamedElement,"+
//          " could not get thread period");
//      }
    }  //end of isPeriodic

  /** fetch thread period and units as BAST tree ^(period unit)  */
  public BAST
getThreadPeriod()
  throws YouIdiot
    {
    BAST period = null;
    if (context==null)
			{
				throw new YouIdiot("null AADL architecture context");
				}
    if (ast==null)
			{
				throw new YouIdiot("null root ast");
				}
    if (context instanceof NamedElement)
      {
      EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol((NamedElement)context);
//      if (dispatchProtocol.toString().endsWith("Periodic"))
//        {
        double periodInMS = GetProperties.getPeriodinMS((NamedElement)context);
        period = new BAST(String.valueOf(periodInMS),BLESS3Lexer.NUMBER,this.ast);
        period.addChild(new BAST("ms",BLESS3Lexer.ID,this.ast));
//        }
//      else
//        Dump.it(this.name+" does not have a thread period");
      }
		else
			{
				throw new YouIdiot("AADL architecture context was not instance of NamedElement,"+
				    " could not get thread period");
				}
    return period;
    }  //end of getThreadPeriod

  /** fetch thread period and units as BAST tree ^(period unit)  */
  public String
getThreadInvariantProperty()
  throws YouIdiot
    {
    if (context==null)
			{
				throw new YouIdiot("null AADL architecture context");
				}
    if (context instanceof NamedElement)
      {
      Property pn = GetProperties.lookupPropertyDefinition(context, "BLESS::Invariant");
//      if (pn==null)
//      	pn = GetProperties.lookupPropertyDefinition(context, "BA2015::Invariant");
      if (pn!=null)
				{
					return pn.toString();
					}
      }
		else
			{
				throw new YouIdiot("AADL architecture context was not instance of NamedElement,"+
				    " could not get thread period");
				}
    return null;
    }  //end of getThreadInvariantProperty


  @Override
	public String
toString()
    {
    return 
        "\nfrom ThreadRecord:  "+
        "\n  threadTypeID="+(threadTypeID==null?"null":threadTypeID)+
        "\n  threadImplementationID="+(threadImplementationID==null?"null":threadImplementationID)+
        "\n  state_assertion_map="+state_assertion_map.toString()+
        "\n  complete_state_assertion_map="+complete_state_assertion_map.toString()+
        "\n  execute_state_assertion_map="+execute_state_assertion_map.toString()+
        "\n  transition_label_assertion_map="+transition_label_assertion_map.toString()+
        "\n"+super.toString()
        ;
    }  //end of toString


} 	//end of ThreadRecord


