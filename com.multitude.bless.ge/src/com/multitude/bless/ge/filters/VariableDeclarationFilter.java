//VariableDeclarationFilter.java

package com.multitude.bless.ge.filters;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import org.osate.ge.ContentFilter;

/**
 * Content filter which matches {@link BehaviorVariable} objects.
 */
public class VariableDeclarationFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.variableDeclarations";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "Variable Declarations";

	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof BLESSSubclause;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof VariableDeclaration;
	}
}
