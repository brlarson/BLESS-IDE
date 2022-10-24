//NamedAssertionHandler.java

package com.multitude.bless.ge.businessobjecthandlers;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.ge.CanonicalBusinessObjectReference;
import org.osate.ge.GraphicalConfiguration;
import org.osate.ge.GraphicalConfigurationBuilder;
import org.osate.ge.RelativeBusinessObjectReference;
import org.osate.ge.businessobjecthandling.BusinessObjectHandler;
import org.osate.ge.businessobjecthandling.CanDeleteContext;
import org.osate.ge.businessobjecthandling.CanRenameContext;
import org.osate.ge.businessobjecthandling.CustomDeleteContext;
import org.osate.ge.businessobjecthandling.CustomDeleter;
import org.osate.ge.businessobjecthandling.CustomRenamer;
import org.osate.ge.businessobjecthandling.GetGraphicalConfigurationContext;
import org.osate.ge.businessobjecthandling.GetNameContext;
import org.osate.ge.businessobjecthandling.IsApplicableContext;
import org.osate.ge.businessobjecthandling.ReferenceContext;
import org.osate.ge.businessobjecthandling.RenameContext;
import org.osate.ge.graphics.Point;
import org.osate.ge.graphics.PolyBuilder;
import org.osate.ge.graphics.StyleBuilder;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.bless.ge.util.BlessNamingUtil;
import com.multitude.bless.ge.util.BlessReferenceUtil;

/**
 * Business Object Handler for {@link NamedAssertion} objects.
 */
public class NamedAssertionHandler implements BusinessObjectHandler, CustomDeleter, CustomRenamer {
	private static final GraphicalConfiguration graphicalConfig = GraphicalConfigurationBuilder.create()
			.graphic(PolyBuilder.create()
		      .points(new Point(0.2, 0.0), new Point(0.0, 0.5), new Point(0.2, 1.0), new Point(0.8, 1.0), new Point(1.0, 0.5), new Point(0.8, 0.0))
		      .build()).style(StyleBuilder.create().labelsCenter().build()).build();

	@Override
	public boolean isApplicable(final IsApplicableContext ctx) {
		return ctx.getBusinessObject(BehaviorState.class).isPresent();
	}

	@Override
	public boolean canRename(final CanRenameContext ctx) {
		return true;
	}

	@Override
	public boolean canDelete(final CanDeleteContext ctx) {
		return true;
	}

	@Override
	public CanonicalBusinessObjectReference getCanonicalReference(final ReferenceContext ctx) {
		final NamedAssertion assertion = ctx.getBusinessObject(NamedAssertion.class).orElseThrow();
		return new CanonicalBusinessObjectReference(BlessReferenceUtil.ASSERTION_TYPE,
				assertion.getName(),
				ctx.getReferenceBuilder().getCanonicalReference(assertion.getOwner()).encode());
	}

	@Override
	public RelativeBusinessObjectReference getRelativeReference(final ReferenceContext ctx) {
		final NamedAssertion assertion = ctx.getBusinessObject(NamedAssertion.class).orElseThrow();
		return BlessReferenceUtil.getAssertionRelativeReference(assertion.getName());
	}

	@Override
	public Optional<GraphicalConfiguration> getGraphicalConfiguration(final GetGraphicalConfigurationContext ctx) {
		return Optional.of(graphicalConfig);
	}

	@Override
	public String getName(final GetNameContext ctx) {
		return ctx.getBusinessObject(NamedAssertion.class).map(NamedAssertion::getName).orElse("");
	}

	@Override
	public void delete(final CustomDeleteContext ctx) {
		final BLESSSubclause blessAnnex = ctx.getContainerBusinessObject(BLESSSubclause.class).orElseThrow();
		// Find named assertion by URI.
		final NamedAssertion assertion = (NamedAssertion) blessAnnex.eResource().getResourceSet()
				.getEObject(EcoreUtil.getURI(ctx.getReadonlyBoToDelete(NamedAssertion.class).orElseThrow()), true);
		EcoreUtil.remove(assertion);
//		if (blessAnnex.getStatesSection().getStates().isEmpty()) {
//		  blessAnnex.unsetStates();
//		}
	}

	@Override
	public void rename(final RenameContext ctx) {
		final NamedAssertion assertion = ctx.getBusinessObject(NamedAssertion.class).orElseThrow();
		final BLESSSubclause subclause = (BLESSSubclause) assertion.getOwner();
		final String originalName = assertion.getName();
		final String newName = ctx.getNewName();

		// Handle DeclarativeBehaviorTransitions
		// Set the ID for source and destination states because they do not update if an invalid state name change occurs
//		Stream.of(subclause.getTransitions()).filter(BehaviorTransition.class::isInstance)
//				.forEach(transition -> {
//					final BehaviorTransition dt = (BehaviorTransition) transition;
//					final EList<BehaviorState> srcStates = dt.getSources();
//					if (!srcStates.isEmpty() && dt.getDestination() != null) {
//						// Set id for source and destination
//						setId(srcStates.get(0), originalName, newName);
//						setId(dt.getDestination(), originalName, newName);
//					}
//		});

		assertion.setName(newName);
	}

	private static void setId(final NamedAssertion identifier, final String originalName, final String newName) {
		final String id = identifier.getName();
		if (originalName.equalsIgnoreCase(id)) {
			identifier.setName(newName);
		}
	}

	@Override
	public Optional<String> validateName(final RenameContext ctx) {
		return BlessNamingUtil.checkNameValidity(ctx);
	}
}
