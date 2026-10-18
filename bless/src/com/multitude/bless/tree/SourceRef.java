//SourceRef.java

package com.multitude.bless.tree;

/**
 * @author brl
 * Where a BAST came from in the user's model, for messages and error markers.
 * Has no OSATE dependency so the core can be driven by any front end;
 * the AADL front end supplies com.multitude.bless.osate.AadlSourceRef.
 */
public interface SourceRef
{
  /** line number in the source file */
  int getLine();

  /** qualified name of the model unit (e.g. package) containing the source, or "" */
  String getQualifiedName();

  /** front-end model object (e.g. an aadl2.Element), for front-end specific reporters */
  Object getModelElement();
}  //end of SourceRef
