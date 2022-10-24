//ExecuteConditionFilter.java

package com.multitude.bless.ge.filters;

import org.osate.ge.ContentFilter;

import com.multitude.aadl.bless.bLESS.ExecuteCondition;

/**
 * Content filter which matches {@link ExecuteCondition} objects.
 */
public class ExecuteConditionFilter implements ContentFilter {
	/**
	 * Unique identifier for the content filter
	 */
	public static final String ID = "bless.executeCondition";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "Execute Condition";
	}

	@Override
	public boolean isApplicable(final Object bo) {
		return bo instanceof com.multitude.aadl.bless.bLESS.BehaviorTransition;
	}

	@Override
	public boolean test(final Object bo) {
		return bo instanceof ExecuteCondition;
	}
}
