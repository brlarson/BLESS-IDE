//BehaviorTransitionEmbeddedTextUtil.java

package com.multitude.bless.ge.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.ISerializer;
//import org.eclipse.xtext.xbase.lib.Pair;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.DispatchCondition;
import com.multitude.bless.ge.ui.properties.DispatchConditionEmbeddedTextValue;
import com.multitude.bless.ge.ui.properties.EditableEmbeddedTextValue;

/**
 * Utility containing methods related to the source text of {@link BehaviorTransition} elements.
 */
public final class BehaviorTransitionEmbeddedTextUtil {

@Inject
ISerializer serializer;
/**
	 * Private constructor to prevent instantiation
	 */
private BehaviorTransitionEmbeddedTextUtil()
  {
  Injector injector = IResourceServiceProvider.Registry.INSTANCE
      .getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
  injector.injectMembers(this);
  }

	/**
	 * Creates an {@link EditableEmbeddedTextValue} that allows editing of the embedded AADL source for the {@link BehaviorCondition}
	 * @param behaviorTransition the {@link BehaviorTransition} that owns the Behavior Condition
	 * @return an {@link EditableEmbeddedTextValue} for the {@link DispatchCondition}
	 */
	public static EditableEmbeddedTextValue createConditionTextValue(final BehaviorTransition behaviorTransition) {
		final String sourceText = BlessXtextUtil.getText(behaviorTransition);
		final int conditionOffset = getConditionOffset(behaviorTransition, sourceText);
		// Condition start
		final String afterPrefix = getAfterPrefix(sourceText, conditionOffset);

		// Text before condition text
		final String prefix = sourceText.substring(0, conditionOffset);
		final int conditionEnd = getConditionEnd(afterPrefix);

		// Text after condition
		final String suffix = afterPrefix.substring(conditionEnd);
		final String conditionText = afterPrefix.substring(0, conditionEnd).trim();
		return new DispatchConditionEmbeddedTextValue(behaviorTransition, sourceText.length(), prefix, conditionText,
				suffix);
	}

	/**
	 * Returns AADL source region that contains the {@link BehaviorCondition} text
	 * @param behaviorTransition the {@link BehaviorTransition} that owns the Behavior Condition
	 * @param sourceText the full AADL source of the Behavior Transition's resource
	 * @return the AADL source region that contains the Behavior Condition text
	 */
	public static String getConditionText(final BehaviorTransition behaviorTransition, final String sourceText) {
		final int conditionOffset = getConditionOffset(behaviorTransition, sourceText);
		// Condition start
		final String afterPrefix = getAfterPrefix(sourceText, conditionOffset);
		final int conditionEnd = getConditionEnd(afterPrefix);
		// Condition text
		return afterPrefix.substring(0, conditionEnd).trim();
	}

	private static int getConditionEnd(final String afterPrefix) {
		// Note: condition.getAadlBaLocationReference().getLength() only counts until the first space (assuming).
		// For example, when dispatch condition is "on dispatch" length is 2.
		// Find closing "]", to get condition text
		return BlessXtextUtil.findUncommentedTerminationChar(afterPrefix, ']');
	}

	private static String getAfterPrefix(final String sourceText, final int conditionOffset) {
		return sourceText.substring(conditionOffset);
	}

	private static int getConditionOffset(final BehaviorTransition behaviorTransition, final String sourceText) {
    int conditionOffset=0;
    if (behaviorTransition.getDispatch() != null)
      {
      conditionOffset = BlessGeUtil.getLocationReference(behaviorTransition.getDispatch()).getOffset();
      }
    else if (behaviorTransition.getExecute() != null) 
      {
      conditionOffset = BlessGeUtil.getLocationReference(behaviorTransition.getExecute()).getOffset();
      }
    else if (behaviorTransition.getMode() != null) 
      {
      conditionOffset = BlessGeUtil.getLocationReference(behaviorTransition.getMode()).getOffset();
      }
    else if (behaviorTransition.getInternal() != null) 
      {
      conditionOffset = BlessGeUtil.getLocationReference(behaviorTransition.getInternal()).getOffset();
      }
		return conditionOffset;
	}
}
