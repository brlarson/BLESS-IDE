//Reporter.java

package com.multitude.bless.exceptions;

import com.multitude.bless.tree.SourceRef;

/**
 * @author brl
 * Places error, warning, and info markers on the user's model.
 * BLESSmarker delegates to the installed Reporter; when running as an OSATE plugin
 * Activator.start() installs com.multitude.bless.osate.MarkerReporter.
 * The default, NONE, places no markers (messages still go to Dump).
 */
public interface Reporter
{
  void error(String message, SourceRef where);
  void warning(String message, SourceRef where);
  void info(String message, SourceRef where);

  /** info marker on a front-end model object, e.g. an AADL connection */
  void info(String message, Object modelElement);

  Reporter NONE = new Reporter()
    {
    @Override public void error(String message, SourceRef where) {}
    @Override public void warning(String message, SourceRef where) {}
    @Override public void info(String message, SourceRef where) {}
    @Override public void info(String message, Object modelElement) {}
    };
}  //end of Reporter
