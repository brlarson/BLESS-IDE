//BLESSSubclauseFilter.java

package com.multitude.bless.ge.filters;

import org.osate.aadl2.ComponentClassifier;
import org.osate.ge.ContentFilter;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;

/**
 * Content filter which matches {@link BLESSSubclause} objects.
 */
public class BLESSSubclauseFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.BLESSSubclause";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "BLESS State Machine";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof ComponentClassifier;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof BLESSSubclause;
	}
}
