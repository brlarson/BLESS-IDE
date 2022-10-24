//BehaviorTransitionFilter.java

package com.multitude.bless.ge.filters;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import org.osate.ge.ContentFilter;

/**
 * Content filter which matches {@link BehaviorTransition} objects.
 */
public class BehaviorTransitionFilter implements ContentFilter {
	/**
	 * The ID of the content filter
	 */
	public static final String ID = "bless.behaviorTransitions";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "BLESS Transitions";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof BLESSSubclause;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof BehaviorTransition;
	}
}
