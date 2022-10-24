//com.multitude.bless.ge

package com.multitude.bless.ge.ui;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ListBasedDiagnosticConsumer;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import com.multitude.bless.ge.ui.properties.EditableEmbeddedTextValue;
import com.multitude.bless.ge.util.BlessXtextUtil;
import org.osate.xtext.aadl2.ui.internal.Aadl2Activator;
import org.osate.xtext.aadl2.ui.propertyview.OsateStyledTextXtextAdapter;
import org.yakindu.base.xtext.utils.jface.viewers.context.IXtextFakeContextResourcesProvider;

import com.google.inject.Injector;

/**
 * Embeds AADL source specified by {@link EditableEmbeddedTextValue} with Xtext highlighting in a {@link StyledText}
 * @since 2.0
 */
class EmbeddedStyledTextXtextAdapter extends OsateStyledTextXtextAdapter {
	private final static Injector injector = Aadl2Activator.getInstance()
			.getInjector(Aadl2Activator.ORG_OSATE_XTEXT_AADL2_AADL2);
	private final EditableEmbeddedTextValue embeddedTextValue;
	private static final IXtextFakeContextResourcesProvider contextFakeResourceProvider = IXtextFakeContextResourcesProvider.NULL_CONTEXT_PROVIDER;

	/**
	 * Instantiates the Embedded Styled Text Xtext Adapter for embedding AADL source in a {@link StyledText}
	 * @param embeddedTextValue the text information for the embedded AADL source
	 */
	public EmbeddedStyledTextXtextAdapter(final EditableEmbeddedTextValue embeddedTextValue) {
		super(injector, contextFakeResourceProvider, embeddedTextValue.getProject());
		this.embeddedTextValue = embeddedTextValue;
	}

	@Override
	public void adapt(final StyledText styledText, final boolean decorate) {
		super.adapt(styledText, decorate);
		final XtextDocument xtextDoc = getXtextDocument();
		final SourceViewer srcViewer = getXtextSourceviewer();
		final String prefixWithNewLineEnding = embeddedTextValue.getPrefix() + "\n";
		final String suffixWithNewLineBeginning = "\n" + embeddedTextValue.getSuffix();
		final String editableText = embeddedTextValue.getEditableText();
		final String wholeText = new StringBuilder(prefixWithNewLineEnding).append(editableText)
				.append(suffixWithNewLineBeginning)
				.toString();
		xtextDoc.set(wholeText);
		srcViewer.setDocument(xtextDoc, srcViewer.getAnnotationModel(), prefixWithNewLineEnding.length(),
				editableText.length());
	}

	/**
	 * Returns the editable embedded text value
	 * @return the editable embedded text value
	 * @since 2.0
	 */
	public EditableEmbeddedTextValue getEmbeddedTextValue() {
		return embeddedTextValue;
	}

	@Override
	public void adapt(final StyledText styledText) {
		adapt(styledText, false);
	}

	/**
	 * Returns an optional of the modified full AADL source if edited region is a valid modification.  Empty if modification is invalid.
	 * @param newText the text to replace editable text region
	 * @return an optional of the modified full AADL source if edited region is a valid modification.  Empty if modification is invalid.
	 * @since 2.0
	 */
	public Optional<String> getValidModifiedSource(final String newText) {
		final String originalSrc = getOriginalSource();
		String modifiedSrc = null;
		try {
			// AADL source text to load
			modifiedSrc = embeddedTextValue.getModifiedAADLSourceForNewText(newText)
					.orElse(serialize(getXtextParseResult().getRootASTElement()));
			loadSource(modifiedSrc);

			final EObject tmpBo = getFakeResource()
					.getEObject(EcoreUtil.getURI(embeddedTextValue.getElementToModify()).fragment());
			if (tmpBo == null || !embeddedTextValue.isValidModification(tmpBo, newText)) {
				modifiedSrc = null;
			}
		} catch (final Exception ex) {
			modifiedSrc = null;
		} finally {
			// Load original source
			loadSource(originalSrc);
		}

		return Optional.ofNullable(modifiedSrc);
	}

	private String getOriginalSource() {
		// Update save button based on whether the text entered into the
		// styled text is a serializable condition
		final EObject rootElement = getXtextParseResult().getRootASTElement();
		final XtextResource resource = getFakeResource();
		// Link model
		resource.getLinker().linkModel(rootElement, new ListBasedDiagnosticConsumer());

		// Original source text
		return BlessXtextUtil.getText(null, resource);
	}

	private void loadSource(final String src) {
		try {
			getFakeResource().unload();
			getFakeResource().load(new ByteArrayInputStream(src.getBytes()), null);
		} catch (final IOException e) {
			throw new RuntimeException("Serialized source cannot be loaded");
		}
	}

	private XtextResource getFakeResource() {
		return getFakeResourceContext().getFakeResource();
	}

	private String serialize(final EObject rootElement) {
		return getFakeResource().getSerializer().serialize(rootElement);
	}
}
