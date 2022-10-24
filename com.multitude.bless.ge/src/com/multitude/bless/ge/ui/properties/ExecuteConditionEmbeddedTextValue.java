//ExecuteConditionEmbeddedTextValue.java

package com.multitude.bless.ge.ui.properties;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.NamedElement;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import org.osate.ge.ProjectUtil;
import com.multitude.bless.ge.ui.EmbeddedTextEditor;

/**
 * EditableEmbeddedTextValue editing an {@link BehaviorCondition} in an {@link EmbeddedTextEditor}
 * @since 2.0
 */
public class ExecuteConditionEmbeddedTextValue extends EditableEmbeddedTextValue {
	/**
	 * The behavior transition that owns the behavior condition being edited
	 */
	private final BehaviorTransition behaviorTransition;

	/**
	 * Instantiates an {@link EditableEmbeddedTextValue} for {@link BehaviorCondition} and editing support within an {@link EmbeddedTextEditor}
	 * @param behaviorTransition the owner of the {@link BehaviorCondition} being edited
	 * @param originalSrcLength is the length of the AADL source before being edited
	 * Note: The {@link #originalSrcLength} may not be the same length as {@link #prefix}, {@link #editableText}, and {@link #suffix} combined
	 * because although these values are derived from the original AADL source, they may be modified to support embedded editing.
	 * @param prefix is the text before the modifiable text
	 * @param editableText is the text that is modifiable
	 * @param suffix is the text after the modifiable text
	 */
	public ExecuteConditionEmbeddedTextValue(final BehaviorTransition behaviorTransition, final int originalSrcLength,
			final String prefix, final String editableText, final String suffix) {
		super(ProjectUtil.getProjectForBoOrThrow(behaviorTransition), originalSrcLength, prefix, editableText, suffix);
		this.behaviorTransition = behaviorTransition;
	}

	@Override
	public String getEditDialogTitle() {
		return "Edit Execute Condition";
	}

	@Override
	public String getEditDialogMessage() {
		return "Enter new execute condition.";
	}

	@Override
	public String getModificationLabel() {
		return "Modify Behavior Transition Condition";
	}

	@Override
	public NamedElement getElementToModify() {
		return (NamedElement)behaviorTransition;
	}

	@Override
	public boolean isValidModification(final EObject bo, final String newText) {
		if (bo instanceof BehaviorTransition) {
			final ExecuteCondition condition = ((BehaviorTransition) bo).getExecute();
			// Calculate enabled based on if condition should exist and if it exists
			return newText.isEmpty() ? condition == null : condition != null;
		}

		return false;
	}
}
