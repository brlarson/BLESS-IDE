//CreateSpecificationPaletteCommand.java

package com.multitude.bless.ge.ui.palette;

import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.Subcomponent;
import org.osate.ge.BusinessObjectContext;
import org.osate.ge.aadl2.GraphicalAnnexUtil;
import org.osate.ge.operations.Operation;
import org.osate.ge.operations.StepResult;
import org.osate.ge.operations.StepResultBuilder;
import org.osate.ge.palette.BasePaletteCommand;
import org.osate.ge.palette.GetTargetedOperationContext;
import org.osate.ge.palette.TargetedPaletteCommand;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.bless.ge.util.BlessReferenceUtil;

/**
 * Palette command for creating {@link BLESS} elements.
 */
public class CreateSpecificationPaletteCommand extends BasePaletteCommand implements TargetedPaletteCommand {
	/**
	 * Creates a new instance
	 */
	public CreateSpecificationPaletteCommand() {
		super("BLESS State Machine", BlessPaletteContributor.BLESS_CATEGORY_ID, null);
	}

	@Override
	public Optional<Operation> getOperation(final GetTargetedOperationContext ctx) {
		return ctx.getTarget().getBusinessObject(EObject.class).map(eObject -> {
			// Get behavior annex owner
			final Optional<ComponentClassifier> owner = getBehaviorAnnexOwner(ctx.getTarget());
			if (!owner.isPresent()) {
				return null;
			}

			return Operation.createWithBuilder(builder -> {
				builder.supply(() -> StepResult.forValue(owner.orElseThrow())).modifyPreviousResult(classifier -> {
					// Create behavior annex
					final BLESSSubclause ba = createBLESSSubclause(classifier);
					// Show new specification
					return StepResultBuilder.create().showNewBusinessObject(ctx.getTarget(), ba).build();
				});
			});
		});
	}

	private static BLESSSubclause createBLESSSubclause(final Classifier c) {
		final String name = BlessReferenceUtil.ANNEX_NAME;
		final BLESSSubclause ba = GraphicalAnnexUtil.createParsedAnnexSubclause(c, name,
				BLESSPackage.eINSTANCE.getBLESSSubclause(), BLESSSubclause.class);
		ba.setName(name);
		return ba;
	}

	// Get classifier that will own behavior annex
	private Optional<ComponentClassifier> getBehaviorAnnexOwner(final BusinessObjectContext boc) {
		final Subcomponent sc = boc.getBusinessObject(Subcomponent.class).orElse(null);
		if (sc != null) {
			return Optional.ofNullable(sc.getAllClassifier());
		}

		return boc.getBusinessObject(ComponentClassifier.class);
	}
}
