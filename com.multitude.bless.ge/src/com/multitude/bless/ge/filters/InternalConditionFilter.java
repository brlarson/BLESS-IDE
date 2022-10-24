//InternalConditionFilter.java

package com.multitude.bless.ge.filters;

import org.osate.ge.ContentFilter;

import com.multitude.aadl.bless.bLESS.InternalCondition;

/**
 * Content filter which matches {@link InternalCondition} objects.
 */
public class InternalConditionFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.internalCondition";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "Internal Condition";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof com.multitude.aadl.bless.bLESS.BehaviorTransition;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof InternalCondition;
	}
}
