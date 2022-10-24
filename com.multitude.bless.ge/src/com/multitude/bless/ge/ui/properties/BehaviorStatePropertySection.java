//BehaviorStatePropertySection.java

package com.multitude.bless.ge.ui.properties;

import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
//import org.osate.ba.aadlba.BehaviorState;
import org.osate.ge.BusinessObjectSelection;
import org.osate.ge.internal.ui.util.InternalPropertySectionUtil;
import org.osate.ge.swt.SwtUtil;
import org.osate.ge.ui.PropertySectionUtil;

import com.multitude.aadl.bless.bLESS.BehaviorState;

/**
 * Property section for {@link BehaviorState}
 */
public class BehaviorStatePropertySection extends AbstractPropertySection {
	/**
	 * Filter which determines if the property section is compatible with an object.
	 */
	public static class Filter implements IFilter {
		@Override
		public boolean select(final Object toTest) {
			return PropertySectionUtil.isBoCompatible(toTest, bo -> bo instanceof BehaviorState);
		}
	}

	private BusinessObjectSelection selectedBos;
	private Button completeStatePropertyBtn;
	private Button finalStatePropertyBtn;
  private Button initialStatePropertyBtn;
  private Button executeStatePropertyBtn;
  private Button modeStatePropertyBtn;

	/**
	 * Testing ID for the "complete" check box
	 * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
	 */
	public static final String WIDGET_ID_COMPLETE = "org.osate.ge.ba.behaviorstate.complete";

	/**
	 * Testing ID for the "final" check box
	 * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
	 */
	public static final String WIDGET_ID_FINAL = "org.osate.ge.ba.behaviorstate.final";

  /**
   * Testing ID for the "initial" check box
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_INITIAL = "org.osate.ge.ba.behaviorstate.initial";

  /**
   * Testing ID for the "execute" check box
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_EXECUTE = "org.osate.ge.ba.behaviorstate.execute";

  /**
   * Testing ID for the "mode" check box
   * @see SwtUtil#getTestingId(org.eclipse.swt.widgets.Widget)
   */
  public static final String WIDGET_ID_MODE = "org.osate.ge.ba.behaviorstate.mode";

	@Override
	public void setInput(final IWorkbenchPart part, final ISelection selection) {
		super.setInput(part, selection);
		selectedBos = Adapters.adapt(selection, BusinessObjectSelection.class);
	}

	@Override
	public void createControls(final Composite parent, final TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		final Composite composite = getWidgetFactory().createFlatFormComposite(parent);

		final Label completeSectionLabel = PropertySectionUtil.createSectionLabel(composite, getWidgetFactory(),
				"Complete:");
		completeStatePropertyBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), composite, SWT.NONE,
				new SetPropertyStateSelectionListener("Set Complete State", (state, value) -> state.setComplete(value)),
				"", SWT.RADIO);
		SwtUtil.setTestingId(completeStatePropertyBtn, WIDGET_ID_COMPLETE);
		setButtonLayoutData(completeStatePropertyBtn, completeSectionLabel);

		final Label finalSectionLabel = PropertySectionUtil.createSectionLabel(composite, getWidgetFactory(), "Final:");
		setLabelLayoutData(finalSectionLabel, completeSectionLabel);
		finalStatePropertyBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), composite, SWT.NONE,
				new SetPropertyStateSelectionListener("Set Final State", (state, value) -> state.setFinal(value)), "",
				SWT.RADIO);
		SwtUtil.setTestingId(finalStatePropertyBtn, WIDGET_ID_FINAL);
		setButtonLayoutData(finalStatePropertyBtn, finalSectionLabel);

    final Label initialSectionLabel = PropertySectionUtil.createSectionLabel(composite, getWidgetFactory(),
        "Initial:");
    setLabelLayoutData(initialSectionLabel, finalSectionLabel);
    initialStatePropertyBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), composite, SWT.NONE,
        new SetPropertyStateSelectionListener("Set Initial State", (state, value) -> state.setInitial(value)),
        "", SWT.RADIO);
    SwtUtil.setTestingId(initialStatePropertyBtn, WIDGET_ID_INITIAL);
    setButtonLayoutData(initialStatePropertyBtn, initialSectionLabel);

    final Label executeSectionLabel = PropertySectionUtil.createSectionLabel(composite, getWidgetFactory(),
        "Execute:");
    setLabelLayoutData(executeSectionLabel, initialSectionLabel);
    executeStatePropertyBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), composite, SWT.NONE,
        new SetPropertyStateSelectionListener("Set Execute State", (state, value) -> state.setInitial(value)),
        "", SWT.RADIO);
    SwtUtil.setTestingId(executeStatePropertyBtn, WIDGET_ID_EXECUTE);
    setButtonLayoutData(executeStatePropertyBtn, executeSectionLabel);

    final Label modeSectionLabel = PropertySectionUtil.createSectionLabel(composite, getWidgetFactory(),
        "Mode:");
    setLabelLayoutData(modeSectionLabel, executeSectionLabel);
    modeStatePropertyBtn = InternalPropertySectionUtil.createButton(getWidgetFactory(), composite, SWT.NONE,
        new SetPropertyStateSelectionListener("Set Mode State", (state, value) -> state.setInitial(value)),
        "", SWT.RADIO);
    SwtUtil.setTestingId(modeStatePropertyBtn, WIDGET_ID_MODE);
    setButtonLayoutData(modeStatePropertyBtn, modeSectionLabel);
	}

	private void setButtonLayoutData(final Button statePropertyBtn, final Label labelReference) {
		final FormData fd = new FormData();
		fd.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
		fd.top = new FormAttachment(labelReference, 0, SWT.CENTER);
		statePropertyBtn.setLayoutData(fd);
	}

	private void setLabelLayoutData(final Label initialSectionLabel, final Label labelReference) {
		final FormData fd = new FormData();
		fd.left = new FormAttachment(0, 0);
		fd.top = new FormAttachment(labelReference, ITabbedPropertyConstants.VSPACE);
		initialSectionLabel.setLayoutData(fd);
	}

	@Override
	public void refresh() {
		final List<BehaviorState> behaviorStates = selectedBos.boStream(BehaviorState.class)
				.collect(Collectors.toList());
		final Entry<Boolean, Boolean> completeBtnSelectionAndGray = getButtonSelectionAndGrayedState(
				behaviorStates.iterator(), behaviorState -> behaviorState.isComplete());
		// Set button grayed and selection state
		completeStatePropertyBtn.setSelection(completeBtnSelectionAndGray.getKey());
		completeStatePropertyBtn.setGrayed(completeBtnSelectionAndGray.getValue());

		final Entry<Boolean, Boolean> finalBtnSelectionAndGray = getButtonSelectionAndGrayedState(
				behaviorStates.iterator(), behaviorState -> behaviorState.isFinal());
		// Set button grayed and selection state
		finalStatePropertyBtn.setSelection(finalBtnSelectionAndGray.getKey());
		finalStatePropertyBtn.setGrayed(finalBtnSelectionAndGray.getValue());

    final Entry<Boolean, Boolean> initialBtnSelectionAndGray = getButtonSelectionAndGrayedState(
        behaviorStates.iterator(), behaviorState -> behaviorState.isInitial());
    // Set button grayed and selection state
    initialStatePropertyBtn.setSelection(initialBtnSelectionAndGray.getKey());
    initialStatePropertyBtn.setGrayed(initialBtnSelectionAndGray.getValue());

    final Entry<Boolean, Boolean> modeBtnSelectionAndGray = getButtonSelectionAndGrayedState(
        behaviorStates.iterator(), behaviorState -> behaviorState.isMode());
    // Set button grayed and selection state
    modeStatePropertyBtn.setSelection(modeBtnSelectionAndGray.getKey());
    modeStatePropertyBtn.setGrayed(modeBtnSelectionAndGray.getValue());

    final Entry<Boolean, Boolean> executeBtnSelectionAndGray = getButtonSelectionAndGrayedState(
        behaviorStates.iterator(), behaviorState -> 
        !(behaviorState.isInitial()||behaviorState.isComplete()||behaviorState.isFinal()||behaviorState.isMode()));
    // Set button grayed and selection state
    executeStatePropertyBtn.setSelection(executeBtnSelectionAndGray.getKey());
    executeStatePropertyBtn.setGrayed(executeBtnSelectionAndGray.getValue());
	}

	private class SetPropertyStateSelectionListener extends SelectionAdapter {
		private final String label;
		private BiConsumer<BehaviorState, Boolean> modifier;

		public SetPropertyStateSelectionListener(final String label,
				final BiConsumer<BehaviorState, Boolean> modifier) {
			this.label = label;
			this.modifier = modifier;
		}

		@Override
		public void widgetSelected(final SelectionEvent e) {
			selectedBos.modify(label, boc -> boc.getBusinessObject(BehaviorState.class).isPresent(),
					boc -> boc.getBusinessObject(BehaviorState.class).orElseThrow(),
					(behaviorState, boc) -> modifier.accept(behaviorState, ((Button) e.getSource()).getSelection()));
		}
	}

	private SimpleEntry<Boolean, Boolean> getButtonSelectionAndGrayedState(final Iterator<BehaviorState> it,
			final Function<BehaviorState, Boolean> getPropertyValue) {
		final boolean isPropertyValue = getPropertyValue.apply(it.next());
		while (it.hasNext()) {
			if (getPropertyValue.apply(it.next()) != isPropertyValue) {
				// Set grayed and selection to true
				return new SimpleEntry<Boolean, Boolean>(true, true);
			}
		}

		// Return selection state and grayed state
		return new SimpleEntry<Boolean, Boolean>(isPropertyValue, false);
	}
}
