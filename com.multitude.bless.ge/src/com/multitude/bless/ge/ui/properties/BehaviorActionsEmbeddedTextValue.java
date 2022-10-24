//BehaviorActionsEmbeddedTextValue.java

package com.multitude.bless.ge.ui.properties;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.parsesupport.LocationReference;
import org.osate.ge.ProjectUtil;

import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.parsing.BlessAnnexUnparser;
import com.multitude.bless.ge.ui.EmbeddedTextEditor;
import com.multitude.bless.ge.util.BlessGeUtil;
import com.multitude.bless.ge.util.BlessXtextUtil;

/**
 * EditableEmbeddedTextValue for editing an {@link BehaviorActionBlock} in an {@link EmbeddedTextEditor}
 * @since 2.0
 */
public class BehaviorActionsEmbeddedTextValue extends EditableEmbeddedTextValue {
	/**
	 * The behavior transition that owns the behavior action block that is being edited
	 */
	private final BehaviorTransition behaviorTransition;
	private final boolean hadNoActions;  //did the original transition have an action?

	/**
	 * Instantiates an {@link EditableEmbeddedTextValue} for {@link BehaviorActionBlock} and editing support within an {@link EmbeddedTextEditor}
	 * @param behaviorTransition the owner of the {@link BehaviorActionBlock} being edited
	 * @param originalSrcLength is the length of the AADL source before being edited
	 * Note: The {@link #originalSrcLength} may not be the same length as {@link #prefix}, {@link #editableText}, and {@link #suffix} combined
	 * because although these values are derived from the original AADL source, they may be modified to support embedded editing.
	 * @param prefix is the text before the modifiable text
	 * @param editableText is the text that is modifiable
	 * @param suffix is the text after the modifiable text
	 */
	private BehaviorActionsEmbeddedTextValue(final BehaviorTransition behaviorTransition,
			final int originalSrcLength, final String prefix, final String editableText, 
			final String suffix, final boolean hadNoActions) 
	  {
		super(ProjectUtil.getProjectForBoOrThrow(behaviorTransition), originalSrcLength, prefix, editableText, suffix);
		this.behaviorTransition = behaviorTransition;
		this.hadNoActions = hadNoActions;
	  }

	@Override
	public String getEditDialogTitle() {
		return "Edit Transition Action";
	}

	@Override
	public String getEditDialogMessage() {
		return "Enter new action block.";
	}

	@Override
	public String getModificationLabel() {
		return "Modify Behavior Transition Action";
	}

	@Override
	public boolean isValidModification(final EObject bo, final String newText) {
		if (bo instanceof BehaviorTransition) {
			final BehaviorActions actionBlock = ((BehaviorTransition) bo).getActions();
			// Calculate enabled based on if action should exist and if it exists
			return newText.isEmpty() ? actionBlock == null : actionBlock != null;
		}

		return false;
	}

	@Override
	public NamedElement getElementToModify() {
		return behaviorTransition;
	}

	@Override
	public Optional<String> getModifiedAADLSourceForNewText(final String newActionBlock) {
		if (newActionBlock.isBlank()) {
			// Remove brackets for empty action block
			final String prefix = getPrefix();
			return Optional
					.of(new StringBuilder(prefix.substring(0, prefix.length() - 1)).append(getSuffix().substring(1))
							.toString());
		}

		return Optional.empty();
	}

	@Override
  public void setEditableText(String newActionBlock)
    {
    if (hadNoActions && !newActionBlock.isEmpty())
      {
      // Modify prefix to account for bracket being added
      setPrefix(getPrefix().substring(0, getPrefix().length() - 1));
      // Add braces for creating new action block
      newActionBlock = "{" + newActionBlock + "}";
      } 
    else if (!hadNoActions && newActionBlock.isEmpty())
        {
        // Modify prefix and suffix to delete existing brackets for removing
        // action block
        setPrefix(getPrefix().substring(0, getPrefix().length() - 1));
        setSuffix(getSuffix().substring(1));
        }
		super.setEditableText(newActionBlock);
	};

	/**
	 * Creates an {@link EditableEmbeddedTextValue} that allows editing of the embedded AADL source for the {@link BehaviorActionBlock}
	 * @param behaviorTransition the Behavior Transition that owns the Behavior Actions
	 * @return an {@link EditableEmbeddedTextValue} for the {@link BehaviorActions}
	 */
	public static EditableEmbeddedTextValue create(final BehaviorTransition behaviorTransition) {
		final String sourceText = BlessXtextUtil.getText(behaviorTransition);
		final BehaviorActions actions = behaviorTransition.getActions();
    boolean hasTerminatingSemicolon = sourceText.endsWith(";");
    boolean hasNoAction = actions == null;
		// Text before action block
		final String prefix;
		// Action block text
		final String actionText;
		// Text after action block
		final String suffix;
		LocationReference transitonLocationReference = BlessGeUtil.getLocationReference(behaviorTransition);
		if (hasNoAction) 
		  {
			// Transition offset
			final int transitionOffset = transitonLocationReference.getOffset();
			// Find transition terminating offset, adjusting for semicolon if there is one
			final int terminationOffset = transitonLocationReference.getLength()+ transitionOffset+(hasTerminatingSemicolon?-1:0);
			// Transition action prefix and add open bracket for action
			prefix = sourceText.substring(0, terminationOffset);
			// Empty action text
			actionText = "";
			// Add bracket to close action text
			suffix = sourceText.substring(terminationOffset);
		  } 
		else 
		  {  //has an action
	    LocationReference actionLocationReference = BlessGeUtil.getLocationReference(actions);
			// Action offset
			final int actionOffset = actionLocationReference.getOffset();
      final int terminationOffset = actionOffset + actionLocationReference.getLength();
			prefix = sourceText.substring(0, actionOffset);
      suffix = sourceText.substring(terminationOffset);
			// Get formatted action block text
			actionText = BlessAnnexUnparser.eINSTANCE.unparseBehaviorActions(actions,"");
  		}
		// Create the value
		return new BehaviorActionsEmbeddedTextValue(behaviorTransition, sourceText.length(), prefix, actionText,
				suffix, hasNoAction);
	}

	private static int getWhiteSpace(final String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				return i;
			}
		}

		return 0;
	}

	private static List<String> getInnerActionBlockText(final String[] splitActionBlockText) {
		return Arrays.asList(splitActionBlockText);  //.subList(1, splitActionBlockText.length - 1);
	}
}
