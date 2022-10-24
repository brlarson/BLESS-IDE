//BehaviorStateHandler.java

package com.multitude.bless.ge.businessobjecthandlers;

import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
//import org.osate.ba.declarative.Identifier;  --use BehaviorState
import org.osate.ge.CanonicalBusinessObjectReference;
import org.osate.ge.GraphicalConfiguration;
import org.osate.ge.GraphicalConfigurationBuilder;
import org.osate.ge.RelativeBusinessObjectReference;
import com.multitude.bless.ge.util.BlessReferenceUtil;
import com.multitude.bless.ge.util.BlessNamingUtil;
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
import org.osate.ge.graphics.EllipseBuilder;
import org.osate.ge.graphics.StyleBuilder;

/**
 * Business Object Handler for {@link BehaviorState} objects.
 */
public class BehaviorStateHandler implements BusinessObjectHandler, CustomDeleter, CustomRenamer {
	private static final GraphicalConfiguration graphicalConfig = GraphicalConfigurationBuilder.create()
			.graphic(EllipseBuilder.create().build()).style(StyleBuilder.create().labelsCenter().build()).build();

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
		final BehaviorState behaviorState = ctx.getBusinessObject(BehaviorState.class).orElseThrow();
		return new CanonicalBusinessObjectReference(BlessReferenceUtil.STATE_TYPE,
				behaviorState.getName(),
				ctx.getReferenceBuilder().getCanonicalReference(behaviorState.getOwner()).encode());
	}

	@Override
	public RelativeBusinessObjectReference getRelativeReference(final ReferenceContext ctx) {
		final BehaviorState behaviorState = ctx.getBusinessObject(BehaviorState.class).orElseThrow();
		return BlessReferenceUtil.getStateRelativeReference(behaviorState.getName());
	}

	@Override
	public Optional<GraphicalConfiguration> getGraphicalConfiguration(final GetGraphicalConfigurationContext ctx) {
		return Optional.of(graphicalConfig);
	}

	@Override
	public String getName(final GetNameContext ctx) {
		return ctx.getBusinessObject(BehaviorState.class).map(BehaviorState::getName).orElse("");
	}

	@Override
	public void delete(final CustomDeleteContext ctx) {
		final BLESSSubclause blessAnnex = ctx.getContainerBusinessObject(BLESSSubclause.class).orElseThrow();
		// Find state by URI.
		final BehaviorState behaviorState = (BehaviorState) blessAnnex.eResource().getResourceSet()
				.getEObject(EcoreUtil.getURI(ctx.getReadonlyBoToDelete(BehaviorState.class).orElseThrow()), true);
		EcoreUtil.remove(behaviorState);
//		if (blessAnnex.getStatesSection().getStates().isEmpty()) {
//		  blessAnnex.unsetStates();
//		}
	}

	@Override
	public void rename(final RenameContext ctx) {
		final BehaviorState behaviorState = ctx.getBusinessObject(BehaviorState.class).orElseThrow();
		final BLESSSubclause subclause = (BLESSSubclause) behaviorState.getOwner();
		final String originalName = behaviorState.getName();
		final String newName = ctx.getNewName();

		// Handle DeclarativeBehaviorTransitions
		// Set the ID for source and destination states because they do not update if an invalid state name change occurs
		Stream.of(subclause.getTransitions()).filter(BehaviorTransition.class::isInstance)
				.forEach(transition -> {
					final BehaviorTransition dt = (BehaviorTransition) transition;
					final EList<BehaviorState> srcStates = dt.getSources();
					if (!srcStates.isEmpty() && dt.getDestination() != null) {
						// Set id for source and destination
						setId(srcStates.get(0), originalName, newName);
						setId(dt.getDestination(), originalName, newName);
					}
		});

		behaviorState.setName(newName);
	}

	private static void setId(final BehaviorState identifier, final String originalName, final String newName) {
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
