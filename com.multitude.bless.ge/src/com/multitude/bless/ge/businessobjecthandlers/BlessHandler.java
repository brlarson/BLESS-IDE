//BlessHandler.java

package com.multitude.bless.ge.businessobjecthandlers;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.osate.aadl2.Classifier;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.Mode;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.CanonicalBusinessObjectReference;
import org.osate.ge.GraphicalConfiguration;
import org.osate.ge.GraphicalConfigurationBuilder;
import org.osate.ge.RelativeBusinessObjectReference;
import org.osate.ge.aadl2.internal.AnnexHandler;
import com.multitude.bless.ge.util.BlessReferenceUtil;
import org.osate.ge.businessobjecthandling.BusinessObjectHandler;
import org.osate.ge.businessobjecthandling.CanDeleteContext;
import org.osate.ge.businessobjecthandling.GetGraphicalConfigurationContext;
import org.osate.ge.businessobjecthandling.GetNameContext;
import org.osate.ge.businessobjecthandling.GetNameForDiagramContext;
import org.osate.ge.businessobjecthandling.IsApplicableContext;
import org.osate.ge.businessobjecthandling.ReferenceContext;
import org.osate.ge.graphics.RectangleBuilder;
import org.osate.ge.graphics.StyleBuilder;

/**
 * Business object handler for {@link BehaviorAnnex}
 */
public class BlessHandler implements BusinessObjectHandler {
	private final AnnexHandler annexHandler = new AnnexHandler();
	private static final GraphicalConfiguration graphicalConfig = GraphicalConfigurationBuilder.create()
			.graphic(RectangleBuilder.create().build())
			.style(StyleBuilder.create().labelsHorizontalCenter().labelsTop().build()).build();

	@Override
	public boolean isApplicable(final IsApplicableContext ctx) {
		return ctx.getBusinessObject(BLESSSubclause.class).isPresent();
	}

	@Override
	public CanonicalBusinessObjectReference getCanonicalReference(final ReferenceContext ctx) {
		return annexHandler.getCanonicalReference(ctx);
	}

	@Override
	public RelativeBusinessObjectReference getRelativeReference(final ReferenceContext ctx) {
		return annexHandler.getRelativeReference(ctx);
	}

	@Override
	public Optional<GraphicalConfiguration> getGraphicalConfiguration(final GetGraphicalConfigurationContext ctx) {
		return Optional.of(graphicalConfig);
	}

	@Override
	public boolean canDelete(final CanDeleteContext ctx) {
		return true;
	}

	@Override
	public String getName(final GetNameContext ctx) {
		return BlessReferenceUtil.ANNEX_NAME;
	}

	@Override
	public String getNameForDiagram(final GetNameForDiagramContext ctx) {
		final BusinessObjectContext boc = Objects.requireNonNull(ctx.getBusinessObjectContext(),
				"Context cannot be null");
		return boc.getBusinessObject(BLESSSubclause.class).map(behaviorAnnex -> {
			final DefaultAnnexSubclause annexSubclause = (DefaultAnnexSubclause) behaviorAnnex.getOwner();
			final Classifier classifier = Objects.requireNonNull(annexSubclause.getContainingClassifier(),
					"Classifier cannot be null");

			final StringBuilder builder = new StringBuilder();
			final Object diagramRootBo = getDiagramRootBusinessObject(boc);
			if (diagramRootBo instanceof BLESSSubclause) {
				builder.append(classifier.getName());
				builder.append("::");
				appendBehaviorAnnexName(builder);
				appendInModes(behaviorAnnex, builder);
			} else {
				appendBehaviorAnnexName(builder);
			}

			return builder.toString();
		}).orElse("");
	}

	private static void appendBehaviorAnnexName(final StringBuilder builder) {
		builder.append("<");
		builder.append(BlessReferenceUtil.ANNEX_NAME);
		builder.append(">");
	}

	private static void appendInModes(final BLESSSubclause behaviorAnnex, final StringBuilder builder) {
		final Set<String> inModes = behaviorAnnex.getAllInModes().stream().map(Mode::getName)
				.collect(Collectors.toSet());
		if (!inModes.isEmpty()) {
			builder.append(" in modes (");
			builder.append(String.join(", ", inModes));
			builder.append(")");
		}
	}

	private static Object getDiagramRootBusinessObject(BusinessObjectContext tmp) {
		while (tmp.getParent() != null && tmp.getParent().getBusinessObject() != null) {
			tmp = tmp.getParent();
		}

		return Objects.requireNonNull(tmp.getBusinessObject(), "Diagram root object cannot be null");
	}
}
