//BehaviorStateFilter.java


package com.multitude.bless.ge.filters;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import org.osate.ge.ContentFilter;

/**
 * Content filter which matches {@link BehaviorState} objects.
 */
public class BehaviorStateFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.behaviorStates";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "BLESS States";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof BLESSSubclause;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof BehaviorState;
	}
}
