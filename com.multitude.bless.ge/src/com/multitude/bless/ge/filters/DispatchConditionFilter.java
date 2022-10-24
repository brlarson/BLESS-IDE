//DispatchConditionFilter.java

package com.multitude.bless.ge.filters;

import org.osate.ge.ContentFilter;

import com.multitude.aadl.bless.bLESS.DispatchCondition;

/**
 * Content filter which matches {@link DispatchCondition} objects.
 */
public class DispatchConditionFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.dispatchCondition";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "Dispatch Condition";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof com.multitude.aadl.bless.bLESS.BehaviorTransition;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof DispatchCondition;
	}
}
