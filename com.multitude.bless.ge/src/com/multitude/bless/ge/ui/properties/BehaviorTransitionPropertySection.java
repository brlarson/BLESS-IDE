//BehaviorTransitionPropertySection.java

package com.multitude.bless.ge.ui.properties;

import java.util.Optional;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.BusinessObjectSelection;
import org.osate.ge.ProjectUtil;
import org.osate.ge.swt.SwtUtil;
import org.osate.ge.ui.PropertySectionUtil;

import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.bless.ge.ui.EmbeddedTextEditor;
import com.multitude.bless.ge.util.BehaviorTransitionEmbeddedTextUtil;

/**
 * Property section for {@link BehaviorTransition}
 */
public class BehaviorTransitionPropertySection extends AbstractPropertySection {
	/**
	 * Filter which determines if the property section is compatible with an object.
	 */
	public static class Filter implements IFilter {
		@Override
		public boolean select(final Object toTest) {
			return PropertySectionUtil.isBocCompatible(toTest, boc -> isBehaviorTransition(boc));
		}
	}

  /**
   * Testing ID for the styled text widget containing the transition's dispatch condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_DISPATCH = "com.multitude.bless.ge.transition.dispatchcondition";

  /**
   * Testing ID for the edit button for the transition's dispatch condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_EDIT_DISPATCH = WIDGET_ID_DISPATCH + ".edit";

  /**
   * Testing ID for the styled text widget containing the transition's execute condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_EXECUTE = "com.multitude.bless.ge.transition.executecondition";

  /**
   * Testing ID for the edit button for the transition's execute condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_EDIT_EXECUTE = WIDGET_ID_EXECUTE + ".edit";

  /**
   * Testing ID for the styled text widget containing the transition's internal condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_INTERNAL = "com.multitude.bless.ge.transition.internalcondition";

  /**
   * Testing ID for the edit button for the transition's internal condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_EDIT_INTERNAL = WIDGET_ID_INTERNAL + ".edit";

  /**
   * Testing ID for the styled text widget containing the transition's mode condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_MODE = "com.multitude.bless.ge.transition.modecondition";

  /**
   * Testing ID for the edit button for the transition's mode condition
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_EDIT_MODE = WIDGET_ID_MODE + ".edit";

	/**
	 * Testing ID for the styled text widget containing the transition's action block
	 * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
	 */
	public static final String WIDGET_ID_ACTION_BLOCK = "com.multitude.bless.ge.transition.actionblock";

	/**
	 * Testing ID for the edit button for the transition's action block
	 * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
	 */
	public static final String WIDGET_ID_EDIT_ACTION_BLOCK = WIDGET_ID_ACTION_BLOCK + ".edit";

	private Composite container;
	private EmbeddedTextEditor conditionTextEditor;
	private EmbeddedTextEditor actionBlockTextEditor;
	private BusinessObjectSelection selectedBos;

	@Override
	public void setInput(final IWorkbenchPart part, final ISelection selection) {
		super.setInput(part, selection);
		selectedBos = Adapters.adapt(selection, BusinessObjectSelection.class);
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		// Create composite for widgets
		container = getWidgetFactory().createPlainComposite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.swtDefaults().numColumns(2).create());

		final Label conditionLabel = new Label(container, SWT.NONE);
		conditionLabel.setText("Condition:");
		SwtUtil.setColorsToMatchParent(conditionLabel);

		conditionTextEditor = EmbeddedTextEditor.createSingleline(container);
		conditionTextEditor.setStyledTextTestId(WIDGET_ID_DISPATCH);
		conditionTextEditor.setEditButtonTestId(WIDGET_ID_EDIT_DISPATCH);

		final Label actionLabel = new Label(container, SWT.NONE);
		actionLabel.setText("Action:");
		SwtUtil.setColorsToMatchParent(actionLabel);

		actionBlockTextEditor = EmbeddedTextEditor.createMultiline(container);
		actionBlockTextEditor.setStyledTextTestId(WIDGET_ID_ACTION_BLOCK);
		actionBlockTextEditor.setEditButtonTestId(WIDGET_ID_EDIT_ACTION_BLOCK);
	}

	@Override
	public void refresh() {
		final Optional<BusinessObjectContext> optSelectedBoc = selectedBos.bocStream()
				.filter(boc -> isBehaviorTransition(boc)
						&& ProjectUtil.getProjectForBo(boc.getBusinessObject()).isPresent())
				.findAny();

		if (optSelectedBoc.isPresent()) {
			final BusinessObjectContext selectedBoc = optSelectedBoc.orElseThrow();
			final boolean isSingleSelection = selectedBos.bocStream().limit(2).count() == 1;
			if (!isSingleSelection) {
				setControlsToMultipleSelected();
			} else {
				final BehaviorTransition behaviorTransition = (BehaviorTransition) selectedBoc.getBusinessObject();
				conditionTextEditor.setEditorTextValue(
						BehaviorTransitionEmbeddedTextUtil.createConditionTextValue(behaviorTransition));
				actionBlockTextEditor.setEditorTextValue(
						BehaviorActionsEmbeddedTextValue.create(behaviorTransition));
			}
		}
	}

	private void setControlsToMultipleSelected() {
		final String msg = "<Multiple>";
		conditionTextEditor.setEnabled(false);
		conditionTextEditor.setStyledTextText(msg);

		actionBlockTextEditor.setEnabled(false);
		actionBlockTextEditor.setStyledTextText(msg);
	}

	private static boolean isBehaviorTransition(final BusinessObjectContext boc) {
		final Object bo = boc.getBusinessObject();
		return bo instanceof BehaviorTransition;  // || bo instanceof DeclarativeBehaviorTransition;
	}
}
