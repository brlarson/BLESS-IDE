//MarkerReporter.java

package com.multitude.bless.osate;

import org.osate.aadl2.Element;
import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.aadl2.modelsupport.errorreporting.MarkerAnalysisErrorReporter;

import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.Reporter;
import com.multitude.bless.tree.SourceRef;

/**
 * @author brl
 * Reporter placing OSATE error markers (com.multitude.bless.BLESSErrorMarker) on AADL elements;
 * installed by Activator.start()
 */
public class MarkerReporter implements Reporter
{
public static final String MARKER_ID = "com.multitude.bless.BLESSErrorMarker";
private AnalysisErrorReporterManager errManager = null;

private AnalysisErrorReporterManager manager()
  {
  if (errManager==null)
    errManager = new AnalysisErrorReporterManager(
        new MarkerAnalysisErrorReporter.Factory(MARKER_ID));
  return errManager;
  }  //end of manager

private static Element elementOf(Object o, String message)
  {
  if (o instanceof Element)
    return (Element) o;
  Dump.it("Not an AADL Element, no marker for message:  "+message);
  return null;
  }  //end of elementOf

@Override
public void error(String message, SourceRef where)
  {
  Element e = elementOf(where.getModelElement(), message);
  if (e!=null) manager().error(e, message);
  }

@Override
public void warning(String message, SourceRef where)
  {
  Element e = elementOf(where.getModelElement(), message);
  if (e!=null) manager().warning(e, message);
  }

@Override
public void info(String message, SourceRef where)
  {
  Element e = elementOf(where.getModelElement(), message);
  if (e!=null) manager().info(e, message);
  }

@Override
public void info(String message, Object modelElement)
  {
  Element e = elementOf(modelElement, message);
  if (e!=null) manager().info(e, message);
  }

}  //end of MarkerReporter
