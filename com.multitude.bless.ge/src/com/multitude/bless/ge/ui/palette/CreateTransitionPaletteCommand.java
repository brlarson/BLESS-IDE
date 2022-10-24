//CreateTransitionPaletteCommand.java

package com.multitude.bless.ge.ui.palette;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.operations.Operation;
import org.osate.ge.operations.StepResultBuilder;
import org.osate.ge.palette.BasePaletteCommand;
import org.osate.ge.palette.CanStartConnectionContext;
import org.osate.ge.palette.CreateConnectionPaletteCommand;
import org.osate.ge.palette.GetCreateConnectionOperationContext;
import org.osate.ge.query.ExecutableQuery;
import org.osate.ge.services.QueryService;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;

/**
 * Palette command for create {@link BehaviorTransition}.
 */
public class CreateTransitionPaletteCommand extends BasePaletteCommand implements CreateConnectionPaletteCommand {
	private static final ExecutableQuery<Object> CONTAINER_QUERY = ExecutableQuery
			.create(root -> root.ancestors().filter(fa -> fa.getBusinessObject() instanceof BLESSSubclause).first());

	/**
	 * Creates a new instance
	 */
	public CreateTransitionPaletteCommand() {
		super("Transition", BlessPaletteContributor.BLESS_CATEGORY_ID, null);
	}

	@Override
	public boolean canStartConnection(final CanStartConnectionContext ctx) {
		return ctx.getSource().getBusinessObject(BehaviorState.class).isPresent();
	}

	@Override
	public Optional<Operation> getOperation(final GetCreateConnectionOperationContext ctx) {
		if (!ctx.getDestination().getBusinessObject(BehaviorState.class).isPresent()) {
			return Optional.empty();
		}

		final BusinessObjectContext srcContainer = getOwnerBoc(ctx.getSource(), ctx.getQueryService());
		if (srcContainer == null) {
			return Optional.empty();
		}

		final BusinessObjectContext dstContainer = getOwnerBoc(ctx.getDestination(), ctx.getQueryService());
		if (dstContainer != srcContainer) {
			return Optional.empty();
		}

		final BehaviorState srcState = ctx.getSource().getBusinessObject(BehaviorState.class).orElseThrow();
		final BehaviorState dstState = ctx.getDestination().getBusinessObject(BehaviorState.class).orElseThrow();
		return srcContainer.getBusinessObject(BLESSSubclause.class)
				.map(ba -> Operation.createSimple(srcContainer, BLESSSubclause.class, boToModify -> {
					final BehaviorTransition baTransition = (BehaviorTransition) EcoreUtil
							.create(BLESSPackage.eINSTANCE.getBehaviorTransition());

					final String srcName = srcState.getName();
					final String dstName = dstState.getName();
					if (srcName == null || dstName == null) {
						return StepResultBuilder.create().abort().build();
					}

					// Set source and destination for transition
					for (final BehaviorState behaviorState : boToModify.getStatesSection().getStates()) {
						final String name = behaviorState.getName();
						if (srcName.equalsIgnoreCase(name)) { // Source
							baTransition.getSources().add(behaviorState);
						}

						if (dstName.equalsIgnoreCase(name)) { // Destination
							baTransition.setDestination(behaviorState);
						}
					}

					// Add new transition
					boToModify.getTransitions().getBt().add(baTransition);

					final String name = getTransitionName(baTransition);
					baTransition.setName(name);

					// Show
					return StepResultBuilder.create().showNewBusinessObject(srcContainer, baTransition).build();
				})).orElse(Optional.empty());
	}

	private String getTransitionName(final BehaviorTransition baTransition) {
		int index = 0;
		String name = buildTransitionName(index++);
//		for (; BlessNamingUtil.checkNameValidity(baTransition, name)
//				.isPresent(); name = buildTransitionName(index++)) {
//		}
		return name;
	}

	private String buildTransitionName(final int index) {
		return new StringBuilder("t").append(index).toString();
	}

	private static BusinessObjectContext getOwnerBoc(final BusinessObjectContext modeBoc,
			final QueryService queryService) {
		return queryService.getFirstBusinessObjectContextOrNull(CONTAINER_QUERY, modeBoc, modeBoc.getBusinessObject());
	}
}
