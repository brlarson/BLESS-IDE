//BlessDiagramType.java

package com.multitude.bless.ge;

import org.osate.aadl2.DefaultAnnexSubclause;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import org.osate.ge.DiagramType;

import com.multitude.bless.ge.filters.AssertionFilter;
import com.multitude.bless.ge.filters.BehaviorStateFilter;
import com.multitude.bless.ge.filters.BehaviorTransitionFilter;
import com.multitude.bless.ge.filters.InvariantFilter;
import com.multitude.bless.ge.filters.VariableDeclarationFilter;
import com.multitude.bless.ge.util.BlessReferenceUtil;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;

/**
 * Diagram type for behavior specifications. Automatically includes variables, transitions, and state.
 * @since 2.0
 *
 */
public class BlessDiagramType implements DiagramType {
	/**
	 * Unique identifier for the BLESS diagram type
	 */
	public final static String ID = "bless.state_machine";

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public String getName() {
		return "BLESS";
	}

	@Override
	public boolean isApplicableToContext(final Object contextBo) {
		return contextBo instanceof DefaultAnnexSubclause
				&& BlessReferenceUtil.ANNEX_NAME
						.equalsIgnoreCase(((DefaultAnnexSubclause) contextBo).getName());
	}

	@Override
	public ImmutableSet<String> getDefaultContentFilters(final Object bo) {
		if (bo instanceof BLESSSubclause) {
			return ImmutableSet.of(AssertionFilter.ID, InvariantFilter.ID, VariableDeclarationFilter.ID, BehaviorTransitionFilter.ID, BehaviorStateFilter.ID);
		}

		return ImmutableSet.of();
	}

	@Override
	public ImmutableCollection<String> getDefaultAadlPropertyNames() {
		return ImmutableSet.of();
	}
}
