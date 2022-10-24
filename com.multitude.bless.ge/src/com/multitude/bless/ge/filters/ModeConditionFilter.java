//ModeConditionFilter.java

package com.multitude.bless.ge.filters;

import org.osate.ge.ContentFilter;

import com.multitude.aadl.bless.bLESS.ModeCondition;

/**
 * Content filter which matches {@link ModeCondition} objects.
 */
public class ModeConditionFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.modeCondition";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "Mode Condition";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof com.multitude.aadl.bless.bLESS.BehaviorTransition;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof ModeCondition;
	}
}
