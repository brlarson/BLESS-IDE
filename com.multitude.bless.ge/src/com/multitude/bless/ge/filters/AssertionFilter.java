//AssertionFilter.java

package com.multitude.bless.ge.filters;

import com.multitude.aadl.bless.bLESS.Assertion;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import org.osate.ge.ContentFilter;

/**
 * Content filter which matches {@link BehaviorVariable} objects.
 */
public class AssertionFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.assertions";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "State Machine Assertions";

	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof BLESSSubclause;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof Assertion;
	}
}
