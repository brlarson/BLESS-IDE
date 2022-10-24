//EmbeddedTextEditor.java

package com.multitude.bless.ge.ui;

import java.util.Objects;
import java.util.Optional;

import org.eclipse.core.runtime.Adapters;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Caret;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.osate.aadl2.NamedElement;
import com.multitude.bless.ge.ui.properties.EditableEmbeddedTextValue;
import com.multitude.bless.ge.util.BlessSelectionUtil;
import org.osate.ge.internal.services.ActionExecutor.ExecutionMode;
import org.osate.ge.internal.services.ActionService;
import org.osate.ge.internal.services.ModelChangeNotifier;
import org.osate.ge.internal.ui.xtext.AgeXtextUtil;
import org.osate.ge.swt.SwtUtil;

/**
 * Composite for editing AADL source that is embedded in a StyledText
 * @since 2.0
 */
public class EmbeddedTextEditor extends Composite {
	private StyledText styledText;
	private Button editBtn;
	private EmbeddedStyledTextXtextAdapter xtextAdapter;
	private final int styledTextStyle;

	private EmbeddedTextEditor(final Composite parent, final int styledTextStyle,
			final GridData layoutData) {
		super(parent, SWT.NONE);
		this.setBackground(parent.getBackground());
		this.setLayout(GridLayoutFactory.swtDefaults().numColumns(2).create());
		this.styledTextStyle = styledTextStyle;
		createControls(layoutData);
		setLayoutData(layoutData);
	}

	/**
	 * Instantiates a single line EmbeddedTextEditor
	 * @param parent the parent composite
	 * @return the new EmbeddedTextEditor
	 * @since 2.0
	 */
	public static EmbeddedTextEditor createSingleline(
			final Composite parent) {
		return new EmbeddedTextEditor(parent, SWT.BORDER | SWT.SINGLE,
				GridDataFactory.swtDefaults()
						.align(SWT.FILL, SWT.FILL)
						.grab(true, true)
						.hint(SWT.DEFAULT, SWT.DEFAULT)
						.create());
	}

	/**
	 * Instantiates a multiline EmbeddedTextEditor
	 * @param parent the parent composite
	 * @return the new EmbeddedTextEditor
	 * @since 2.0
	 */
	public static EmbeddedTextEditor createMultiline(
			final Composite parent) {
		return new EmbeddedTextEditor(parent, SWT.BORDER | SWT.V_SCROLL | SWT.WRAP | SWT.MULTI,
				GridDataFactory.swtDefaults()
						.align(SWT.FILL, SWT.FILL)
						.grab(true, true)
						.hint(SWT.DEFAULT, 100)
						.create());
	}

	private void createControls(
			final GridData styledTextLayoutData) {
		// Create styled text
		styledText = new StyledText(this, styledTextStyle);
		styledText.setEditable(false);
		// Set empty caret so that the caret will not show.
		// Makes sure users know it is not editable.
		// Note: If caret is set to null, exception may occur
		// when used with the StyledTextXtextAdapter.
		final Caret emptyCaret = new Caret(getShell(), SWT.NONE);
		styledText.setCaret(emptyCaret);
		styledText.setLayoutData(styledTextLayoutData);
		styledText.addDisposeListener(e -> emptyCaret.dispose());

		editBtn = new Button(this, SWT.PUSH);
		editBtn.setText("Edit...");
		editBtn.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
			final EditableEmbeddedTextValue embeddedTextValue = xtextAdapter.getEmbeddedTextValue();
			final NamedElement ne = embeddedTextValue.getElementToModify();
			final EditEmbeddedTextDialog dlg = new EditEmbeddedTextDialog(Display.getCurrent().getActiveShell(),
					embeddedTextValue, styledTextStyle,
					styledTextLayoutData);
			if (dlg.open() == Window.OK) {
				// Edit condition
				BlessSelectionUtil.getActiveEditor().ifPresent(editorPart -> {
					final ActionService actionService = Adapters.adapt(editorPart, ActionService.class);
					final ModelChangeNotifier modelChangeNotifier = Objects.requireNonNull(
							editorPart.getAdapter(ModelChangeNotifier.class), "Unable to get model change notifier");
					final IXtextDocument xtextDocument = getXtextDocument(ne).orElse(null);
					if (xtextDocument != null) {
						// Execute modification with xtext document
						actionService.execute(embeddedTextValue.getModificationLabel(),
								ExecutionMode.NORMAL,
								new EmbeddedTextModificationAction(xtextDocument, modelChangeNotifier,
										dlg.getResult().getFullSource()));
					} else {
						final XtextResource xtextResource = getXtextResource(ne).orElseThrow();
						embeddedTextValue.setEditableText(dlg.getResult().getPartialSource());
						// Execute modification with xtext resource
						actionService.execute(embeddedTextValue.getModificationLabel(), ExecutionMode.NORMAL,
								new EmbeddedTextModificationAction(xtextResource, modelChangeNotifier,
										embeddedTextValue));
					}
				});
			}
		}));
	}

	private static Optional<IXtextDocument> getXtextDocument(final NamedElement element) {
		return Optional.ofNullable(AgeXtextUtil.getDocumentByRootElement(element.getElementRoot()));
	}

	private static Optional<XtextResource> getXtextResource(final NamedElement element) {
		final Resource resource = element.eResource();
		return Optional.ofNullable(resource instanceof XtextResource ? (XtextResource) resource : null);
	}

	/**
	 * Sets the {@link EditableEmbeddedTextValue} for the EmbeddedTextEditor
	 * @param value the text value being edited
	 * @since 2.0
	 */
	public void setEditorTextValue(final EditableEmbeddedTextValue value) {
		disposeXtextAdapter();
		xtextAdapter = new EmbeddedStyledTextXtextAdapter(value);
		xtextAdapter.adapt(styledText);
	}

	/**
	 * Sets the test ID for the styled text
	 * @param styledTextTestId the test ID
	 */
	public void setStyledTextTestId(final String styledTextTestId) {
		SwtUtil.setTestingId(styledText, styledTextTestId);
	}

	/**
	 * Sets test ID for the edit button
	 * @param editBtnTestId the test ID
	 */
	public void setEditButtonTestId(final String editBtnTestId) {
		SwtUtil.setTestingId(editBtn, editBtnTestId);
	}

	private void disposeXtextAdapter() {
		if (xtextAdapter != null) {
			xtextAdapter.dispose();
			xtextAdapter = null;
		}
	}

	@Override
	public void setEnabled(boolean isEnabled) {
		super.setEnabled(isEnabled);
		styledText.setEnabled(isEnabled);
		editBtn.setEnabled(isEnabled);
	}

	/**
	 * Sets the text for the styled text
	 * @param text the text for the styled text
	 */
	public void setStyledTextText(final String text) {
		styledText.setText(text);
	}
}
