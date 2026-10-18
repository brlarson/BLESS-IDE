//AadlSourceRef.java

package com.multitude.bless.osate;

import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.modelsupport.util.AadlUtil;

import com.multitude.bless.tree.SourceRef;

/**
 * @author brl
 * SourceRef for a BAST translated from the AADL/BLESS EMF model (see ToAST)
 */
public class AadlSourceRef implements SourceRef
{
private final Element element;

public AadlSourceRef(Element e)
  {
  element = e;
  }

@Override
public int getLine()
  {
  return AadlUtil.getLineNumberFor(element);
  }

@Override
public String getQualifiedName()
  {
  NamedElement root = element.getElementRoot();
  return root!=null ? root.getQualifiedName() : "";
  }

@Override
public Object getModelElement() { return element; }

public Element getElement() { return element; }

}  //end of AadlSourceRef
