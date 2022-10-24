//BlessReferenceUtil.java

package com.multitude.bless.ge.util;

import org.osate.ge.RelativeBusinessObjectReference;
import org.osate.ge.aadl2.internal.AnnexHandler;
import org.osate.ge.internal.services.impl.DeclarativeReferenceType;

/**
 * Class containing constants and utility functions related to references to behavior annex business objects
 *
 */
public class BlessReferenceUtil {
	/**
	 * Private constructor to prevent instantiation.
	 */
	private BlessReferenceUtil() {
	}

	/**
	 * First segment for annex subclause references
	 */
	private static final String ANNEX_SUBCLAUSE = DeclarativeReferenceType.ANNEX_SUBCLAUSE.getId();

	/**
	 * Name of the behavior specification annex subclauses
	 */
	public static final String ANNEX_NAME = "BLESS";

	private static final String BLESS_REFERENCE_PREFIX = "bless.";

  /**
   * First segment for state references
   */
  public static final String STATE_TYPE = BLESS_REFERENCE_PREFIX + "state";

  /**
   * First segment for state references
   */
  public static final String ASSERTION_TYPE = BLESS_REFERENCE_PREFIX + "assertion";

  /**
   * First segment for state references
   */
  public static final String INVARIANT_TYPE = BLESS_REFERENCE_PREFIX + "invariant";

	/**
	 * First segment of behavior transitions references
	 */
	public static final String TRANSITION_TYPE = BLESS_REFERENCE_PREFIX + "transition";

	/**
	 * First segment of variable references
	 */
	public static final String VARIABLE_TYPE = BLESS_REFERENCE_PREFIX + "variable";

	/**
	 * First segment of behavior condition references
	 * @since 2.0
	 */
//MAY NEED TO HAVE DISPATCH, EXECUTE, MODE AND INTERNAL CONDITION	
  public static final String DISPATCH_CONDITION = BLESS_REFERENCE_PREFIX + "dispatch_condition";
  public static final String EXECUTE_CONDITION = BLESS_REFERENCE_PREFIX + "execute_condition";
  public static final String MODE_CONDITION = BLESS_REFERENCE_PREFIX + "mode_condition";
  public static final String INTERNAL_CONDITION = BLESS_REFERENCE_PREFIX + "internal_condition";

	/**
	 * Returns the relative reference for a behavior specification
	 * @param index see {@link AnnexHandler#getAnnexSubclauseIndex(org.osate.aadl2.AnnexSubclause, boolean)}
	 * @return the relative reference
	 */
	public static RelativeBusinessObjectReference getSpecificationRelativeReference(final int index) {
		return AnnexHandler.getRelativeBusinessObjectReference(BlessReferenceUtil.ANNEX_SUBCLAUSE,
		    BlessReferenceUtil.ANNEX_NAME, index);
	}

	/**
	 * Returns the relative reference for a state with the specified name
	 * @param name the name of the state
	 * @return the relative reference for the state
	 */
	public static RelativeBusinessObjectReference getStateRelativeReference(final String name) {
		return new RelativeBusinessObjectReference(BlessReferenceUtil.STATE_TYPE, name);
	}

	/**
	 * Returns the relative reference for a transition with the specified identifier
	 * @param id the identifier for the transition. If the transition has a name, this is the name of the transition. If it is not named, then this
	 * is expected to be the index of the transition within the behavior specification
	 * @return the relative reference for the transition
	 */
	public static RelativeBusinessObjectReference getTransitionRelativeReference(
			final String id) {
		return new RelativeBusinessObjectReference(BlessReferenceUtil.TRANSITION_TYPE, id);
	}

  /**
   * Returns a relative reference for the variable with the specified name
   * @param name the name of the variable
   * @return the relative reference for the variable
   */
  public static RelativeBusinessObjectReference getVariableRelativeReference(final String name) {
    return new RelativeBusinessObjectReference(BlessReferenceUtil.VARIABLE_TYPE, name);
  }

  /**
   * Returns a relative reference for the assertion with the specified name
   * @param name the name of the assertion
   * @return the relative reference for the assertion
   */
  public static RelativeBusinessObjectReference getAssertionRelativeReference(final String name) {
    return new RelativeBusinessObjectReference(BlessReferenceUtil.ASSERTION_TYPE, name);
  }
  
}
