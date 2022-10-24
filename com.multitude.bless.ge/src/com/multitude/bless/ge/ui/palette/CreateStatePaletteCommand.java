//CreateStatePaletteCommand.java

package com.multitude.bless.ge.ui.palette;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.ge.operations.Operation;
import org.osate.ge.operations.StepResultBuilder;
import org.osate.ge.palette.BasePaletteCommand;
import org.osate.ge.palette.GetTargetedOperationContext;
import org.osate.ge.palette.TargetedPaletteCommand;

import com.multitude.aadl.bless.bLESS.BLESSFactory;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.impl.BLESSFactoryImpl;
import com.multitude.bless.ge.util.BlessNamingUtil;

/**
 * Palette command for creating {@link BehaviorState} elements.
 */
public class CreateStatePaletteCommand extends BasePaletteCommand implements TargetedPaletteCommand {
	/**
	 * Creates a new instance
	 */
	public CreateStatePaletteCommand() {
		super("State", BlessPaletteContributor.BLESS_CATEGORY_ID, null);
	}

	@Override
	public Optional<Operation> getOperation(final GetTargetedOperationContext ctx) {
		return ctx.getTarget().getBusinessObject(BLESSSubclause.class)
				.map(state_machine -> Operation.createSimple(ctx.getTarget(), BLESSSubclause.class, blessToModify -> {
					// Create the state
					final BehaviorState newState = (BehaviorState) EcoreUtil
							.create(BLESSPackage.eINSTANCE.getBehaviorState());
					final String newName = BlessNamingUtil.buildUniqueIdentifier(blessToModify, "new_state");
					newState.setName(newName);
					if (blessToModify.getStatesSection() == null)
					  {
					  BLESSFactory factory = BLESSFactoryImpl.init();
					  blessToModify.setStatesSection(factory.createStatesSection());
					  }
					// Add the new state to the behavior annex
					blessToModify.getStatesSection().getStates().add(newState);
					return StepResultBuilder.create()
							.showNewBusinessObject(ctx.getTarget(), newState).build();
				})).orElse(Optional.empty());
	}
}
