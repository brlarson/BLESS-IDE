package com.multitude.bless.exceptions;

import java.util.Vector;

import org.osate.aadl2.Connection;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.errorreporting.MarkerAnalysisErrorReporter;

import com.multitude.bless.tree.BAST;

public class BLESSmarker
{

public static Vector<String> error_messages = new Vector<String>();
public static Vector<String> warning_messages = new Vector<String>();
public static Vector<String> info_messages = new Vector<String>();
public static AnalysisErrorReporterManager errManager = null;

  public static void 	
setErrorMarker(String message, BAST node)
  	{
	if (errManager==null)
	  errManager = new AnalysisErrorReporterManager(
				new MarkerAnalysisErrorReporter.Factory("com.multitude.bless.BLESSErrorMarker"));  	
  	error_messages.add(message);
  	Dump.it("Error at line "+node.getLine()+" in "+
  	  (node.getElement()!=null ? node.getElement().getElementRoot().getQualifiedName():"")+
  	  "\n  "+message);
  	if (node.getElement()!=null)
  		errManager.error(node.getElement(), message);
  	else Dump.it("No Element for message:  "+message+"\n"+node.toStringTree());
  	}  //end of setErrorMarker

  public static void 	
setWarningMarker(String message, BAST node)
  	{
  	if (errManager==null)
  	  errManager = new AnalysisErrorReporterManager(
  				new MarkerAnalysisErrorReporter.Factory("com.multitude.bless.BLESSErrorMarker"));  	
  	warning_messages.add(message);
  	Dump.it("Warning at line "+node.getLine()+" in "+
    	  ((node.getElement()!=null) && (node.getElement() instanceof NamedElement) ? 
    	      node.getElement().getElementRoot().getQualifiedName():"")+
    	  "\n  "+message);
  	if (node.getElement()!=null)
  		errManager.warning(node.getElement(), message);
  	else Dump.it("No Element for message:  "+message+"\n"+node.toStringTree());
  	}  //end of setWarningMarker


  public static void 	
setInfoMarker(String message, BAST node)
  	{
  	if (errManager==null)
  	  errManager = new AnalysisErrorReporterManager(
  				new MarkerAnalysisErrorReporter.Factory("com.multitude.bless.BLESSErrorMarker"));  	
  	info_messages.add(message);
 	Dump.it("Info at line "+node.getLine()+" in "+
    	  (node.getElement()!=null ? node.getElement().getElementRoot().getQualifiedName():"")+
    	  "\n  "+message);
  	if (node.getElement()!=null)
  		errManager.info(node.getElement(), message);
  	else Dump.it("No Element for message:  "+message+"\n"+node.toStringTree());
  	}  //end of setInfoMarker

  public static void  
setConnectionInfoMarker(String message, ConnectionInstance con)
    {
    if (errManager==null)
      errManager = new AnalysisErrorReporterManager(
          new MarkerAnalysisErrorReporter.Factory("com.multitude.bless.BLESSErrorMarker"));   
    info_messages.add(message);
//  Dump.it("Info at line "+con..getLine()+" in "+
//        (node.getElement()!=null ? node.getElement().getElementRoot().getQualifiedName():"")+
//        "\n  "+message);
    if (con!=null)
      errManager.info(con, message);
    else Dump.it("No Connection for message:  "+message);
    }  //end of setInfoMarker

  public static void  
setConnectionInfoMarker(String message, Connection con)
    {
    if (errManager==null)
      errManager = new AnalysisErrorReporterManager(
          new MarkerAnalysisErrorReporter.Factory("com.multitude.bless.BLESSErrorMarker"));   
    info_messages.add(message);
//  Dump.it("Info at line "+con..getLine()+" in "+
//        (node.getElement()!=null ? node.getElement().getElementRoot().getQualifiedName():"")+
//        "\n  "+message);
    if (con!=null)
      errManager.info(con, message);
    else Dump.it("No Connection for message:  "+message);
    }  //end of setInfoMarker

}  //end of BLESSmarker.java
