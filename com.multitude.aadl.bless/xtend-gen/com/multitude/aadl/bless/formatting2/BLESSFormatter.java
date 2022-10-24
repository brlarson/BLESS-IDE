/**
 * (C) Multitude Corporation 2020
 * generated by Xtext 2.20.0
 * from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.formatting2;

import com.multitude.aadl.bless.bLESS.BLESSGrammarRoots;
import com.multitude.aadl.bless.bLESS.UnitDeclaration;
import com.multitude.aadl.bless.bLESS.UnitLibrary;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class BLESSFormatter extends AbstractFormatter2 {
  protected void _format(final BLESSGrammarRoots bLESSGrammarRoots, @Extension final IFormattableDocument document) {
    document.<UnitLibrary>format(bLESSGrammarRoots.getUnit_library());
  }

  protected void _format(final UnitLibrary unitLibrary, @Extension final IFormattableDocument document) {
    EList<UnitDeclaration> _unitDeclarations = unitLibrary.getUnitDeclarations();
    for (final UnitDeclaration unitDeclaration : _unitDeclarations) {
      document.<UnitDeclaration>format(unitDeclaration);
    }
  }

  public void format(final Object unitLibrary, final IFormattableDocument document) {
    if (unitLibrary instanceof UnitLibrary) {
      _format((UnitLibrary)unitLibrary, document);
      return;
    } else if (unitLibrary instanceof XtextResource) {
      _format((XtextResource)unitLibrary, document);
      return;
    } else if (unitLibrary instanceof BLESSGrammarRoots) {
      _format((BLESSGrammarRoots)unitLibrary, document);
      return;
    } else if (unitLibrary instanceof EObject) {
      _format((EObject)unitLibrary, document);
      return;
    } else if (unitLibrary == null) {
      _format((Void)null, document);
      return;
    } else if (unitLibrary != null) {
      _format(unitLibrary, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(unitLibrary, document).toString());
    }
  }
}
