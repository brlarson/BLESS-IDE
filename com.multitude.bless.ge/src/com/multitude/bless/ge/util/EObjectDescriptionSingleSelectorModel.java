//EObjectDescriptionSingleSelectorModel.java

package com.multitude.bless.ge.util;

import java.util.Collection;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.osate.ge.swt.selectors.CollectionSingleSelectorModel;

/**
 * View model for selecting a single {@link IEObjectDescription} from a collection.
 *
 */
class EObjectDescriptionSingleSelectorModel
		extends CollectionSingleSelectorModel<IEObjectDescription> {

	/**
	 * Creates a new instance
	 * @param elements the selectable elements
	 */
	public EObjectDescriptionSingleSelectorModel(final Collection<IEObjectDescription> elements) {
		super(elements);
	}

	@Override
	public String getLabel(final IEObjectDescription element) {
		return element.getQualifiedName().toString("::");
	}
}
