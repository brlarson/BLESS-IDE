//ExecuteConditionHandler.java

package com.multitude.bless.ge.businessobjecthandlers;

import java.util.Optional;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import org.osate.ge.CanonicalBusinessObjectReference;
import org.osate.ge.GraphicalConfiguration;
import org.osate.ge.GraphicalConfigurationBuilder;
import org.osate.ge.RelativeBusinessObjectReference;
import com.multitude.bless.ge.util.BlessReferenceUtil;
import com.multitude.bless.ge.util.BlessXtextUtil;
import com.multitude.bless.ge.util.BehaviorTransitionEmbeddedTextUtil;
import org.osate.ge.businessobjecthandling.BusinessObjectHandler;
import org.osate.ge.businessobjecthandling.CanDeleteContext;
import org.osate.ge.businessobjecthandling.GetGraphicalConfigurationContext;
import org.osate.ge.businessobjecthandling.GetNameContext;
import org.osate.ge.businessobjecthandling.GetNameForDiagramContext;
import org.osate.ge.businessobjecthandling.IsApplicableContext;
import org.osate.ge.businessobjecthandling.ReferenceContext;
import org.osate.ge.graphics.Graphic;
import org.osate.ge.graphics.LabelBuilder;
import org.osate.ge.internal.ui.xtext.AgeXtextUtil;

/**
 * Business Object Handler for {@link BehaviorCondition} objects.
 */
public class ExecuteConditionHandler implements BusinessObjectHandler {
	private final Graphic labelGraphic = LabelBuilder.create().build();

	@Override
	public boolean isApplicable(final IsApplicableContext ctx) {
		return ctx.getBusinessObject(ExecuteCondition.class).isPresent();
	}

	@Override
	public CanonicalBusinessObjectReference getCanonicalReference(final ReferenceContext ctx) {
		final ExecuteCondition bc = ctx.getBusinessObject(ExecuteCondition.class)
				.orElseThrow();
		return new CanonicalBusinessObjectReference(BlessReferenceUtil.EXECUTE_CONDITION,
				ctx.getReferenceBuilder().getCanonicalReference(bc.getOwner()).encode());
	}

	@Override
	public RelativeBusinessObjectReference getRelativeReference(final ReferenceContext ctx) {
		return new RelativeBusinessObjectReference(BlessReferenceUtil.EXECUTE_CONDITION);
	}

	@Override
	public Optional<GraphicalConfiguration> getGraphicalConfiguration(final GetGraphicalConfigurationContext ctx) {
		return Optional.of(GraphicalConfigurationBuilder.create().graphic(labelGraphic).build());
	}

	@Override
	public String getName(final GetNameContext ctx) {
		return "";
	}

	@Override
	public String getNameForDiagram(final GetNameForDiagramContext ctx) {
		return ctx.getBusinessObjectContext()
				.getBusinessObject(ExecuteCondition.class)
				.map(execute_condition -> {
					final BehaviorTransition bt = (BehaviorTransition) execute_condition.getOwner();
					final XtextResource xtextResource = getXtextResource(bt)
							.orElseThrow(() -> new RuntimeException("Resource must be XtextResource"));
					final IXtextDocument xtextDocument = getXtextDocument(bt).orElse(null);
					final String sourceText = BlessXtextUtil.getText(xtextDocument, xtextResource);
					return BehaviorTransitionEmbeddedTextUtil.getConditionText(bt, sourceText);
				})
				.orElseThrow();
	}

	@Override
	public boolean canDelete(final CanDeleteContext ctx) {
		return true;
	}

	private static Optional<XtextResource> getXtextResource(final BehaviorTransition behaviorTransition) {
		final Resource resource = behaviorTransition.eResource();
		return Optional.ofNullable(resource instanceof XtextResource ? (XtextResource) resource : null);
	}

	private static Optional<IXtextDocument> getXtextDocument(final BehaviorTransition behaviorTransition) {
		return Optional.ofNullable(AgeXtextUtil.getDocumentByRootElement(behaviorTransition.getElementRoot()));
	}
}
