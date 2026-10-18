package com.multitude.bless.exceptions;

import java.util.Vector;

import com.multitude.bless.tree.BAST;

public class BLESSmarker
{

public static Vector<String> error_messages = new Vector<String>();
public static Vector<String> warning_messages = new Vector<String>();
public static Vector<String> info_messages = new Vector<String>();
//places markers on the user's model; see Reporter
private static Reporter reporter = Reporter.NONE;

  public static void
setReporter(Reporter r)
    {
    reporter = (r==null) ? Reporter.NONE : r;
    }  //end of setReporter

  public static Reporter
getReporter() { return reporter; }

  public static void
setErrorMarker(String message, BAST node)
  	{
  	error_messages.add(message);
  	Dump.it("Error at line "+node.getLine()+" in "+
  	  (node.getSourceRef()!=null ? node.getSourceRef().getQualifiedName():"")+
  	  "\n  "+message);
  	if (node.getSourceRef()!=null)
  		reporter.error(message, node.getSourceRef());
  	else Dump.it("No Element for message:  "+message+"\n"+node.toStringTree());
  	}  //end of setErrorMarker

  public static void
setWarningMarker(String message, BAST node)
  	{
  	warning_messages.add(message);
  	Dump.it("Warning at line "+node.getLine()+" in "+
    	  (node.getSourceRef()!=null ? node.getSourceRef().getQualifiedName():"")+
    	  "\n  "+message);
  	if (node.getSourceRef()!=null)
  		reporter.warning(message, node.getSourceRef());
  	else Dump.it("No Element for message:  "+message+"\n"+node.toStringTree());
  	}  //end of setWarningMarker


  public static void
setInfoMarker(String message, BAST node)
  	{
  	info_messages.add(message);
 	Dump.it("Info at line "+node.getLine()+" in "+
    	  (node.getSourceRef()!=null ? node.getSourceRef().getQualifiedName():"")+
    	  "\n  "+message);
  	if (node.getSourceRef()!=null)
  		reporter.info(message, node.getSourceRef());
  	else Dump.it("No Element for message:  "+message+"\n"+node.toStringTree());
  	}  //end of setInfoMarker

  /**
   * info marker on a front-end model object, e.g. an AADL Connection or ConnectionInstance
   */
  public static void
setConnectionInfoMarker(String message, Object con)
    {
    info_messages.add(message);
//  Dump.it("Info at line "+con..getLine()+" in "+
//        (node.getElement()!=null ? node.getElement().getElementRoot().getQualifiedName():"")+
//        "\n  "+message);
    if (con!=null)
      reporter.info(message, con);
    else Dump.it("No Connection for message:  "+message);
    }  //end of setConnectionInfoMarker

}  //end of BLESSmarker.java
