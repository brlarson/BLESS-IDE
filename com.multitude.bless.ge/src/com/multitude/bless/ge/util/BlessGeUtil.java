//BlessGeUtil.java

package com.multitude.bless.ge.util;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.parsesupport.LocationReference;
import org.osate.ge.aadl2.ui.AadlModelAccessUtil;
import org.osate.ge.swt.selectors.FilteringSelectorDialog;
import org.osate.ge.swt.selectors.LabelFilteringListSelectorModel;

/**
 * Utility class containing miscellaneous helper functions used by the OSATE graphical editor's behavior annex plugin.
 *
 */
public final class BlessGeUtil {
	/**
	 * Private constructor to prevent instantiation.
	 */
	private BlessGeUtil() {
	}

	/**
	 * MUST BE CHANGED TO SELECT FROM DECLARED TYPE
	 * Prompts the user for to select a data classifier
	 * @param resource the resource from which the classifier will be referenced. Used to determine which classifiers may be referenced.
	 * @return an optional containing the selected classifier. Returns an empty optional if a classifier was not selected.
	 */
	public static Optional<DataClassifier> promptForDataClassifier(final Resource resource) {
		final EObjectDescriptionSingleSelectorModel model = new EObjectDescriptionSingleSelectorModel(
				AadlModelAccessUtil.getAllEObjectsByType(resource, Aadl2Package.eINSTANCE.getDataClassifier()));
		if (!FilteringSelectorDialog.open(Display.getCurrent().getActiveShell(), "Set the Variable's Data Classifier",
				new LabelFilteringListSelectorModel<>(model))) {
			return Optional.empty();
		}

		return Optional
				.of((DataClassifier) EcoreUtil.resolve(model.getSelectedElement().getEObjectOrProxy(), resource));
	}

	/**
	 * Return the package containing the specified element
	 * @param e the element for which to get the package
	 * @return the package containing the element. An empty optional is returned if the package cannot be determined.
	 */
	public static Optional<AadlPackage> getPackage(final Element e) {
		if (e == null) {
			return Optional.empty();
		}

		final Element root = e.getElementRoot();
		final AadlPackage pkg = root instanceof AadlPackage ? (AadlPackage) root : null;
		return Optional.ofNullable(pkg);
	}

  /**
   * Return the location reference of the given Element object.
   *
   * @param e the given Element
   * @return a LocationReference object
   */
  public static LocationReference getLocationReference(Element e) {
    LocationReference result = null;

    result = e.getLocationReference();

    if (result == null) {
      ICompositeNode node = NodeModelUtils.findActualNodeFor(e);

      result = new LocationReference();

      if (node != null && e.eResource() != null) {
        result.setFilename(e.eResource().getURI().lastSegment());
        result.setOffset(node.getOffset());
        result.setLength(node.getLength());
        result.setLine(node.getStartLine());
      } else {
        // DEBUG
        System.err.println("BlessGeUtil.getLocationReference: node or eResource " + "not found for " + e);
      }
    }

    return result;
  }

}
