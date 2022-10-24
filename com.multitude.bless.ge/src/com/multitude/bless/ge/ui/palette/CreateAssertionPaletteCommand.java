//CreateAssertionPaletteCommand.java

package com.multitude.bless.ge.ui.palette;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
//import org.osate.ge.ba.util.BehaviorAnnexNamingUtil;
//import org.osate.ge.ba.util.BehaviorAnnexUtil;
import org.osate.ge.operations.Operation;
import org.osate.ge.operations.StepResultBuilder;
import org.osate.ge.palette.BasePaletteCommand;
import org.osate.ge.palette.GetTargetedOperationContext;
import org.osate.ge.palette.TargetedPaletteCommand;

import com.multitude.aadl.bless.bLESS.BLESSFactory;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.impl.BLESSFactoryImpl;
import com.multitude.bless.ge.util.BlessNamingUtil;

/**
 * Palette command for creating {@link NamedAssertion} elements.
 */
public class CreateAssertionPaletteCommand extends BasePaletteCommand implements TargetedPaletteCommand {
	/**
	 * Creates a new instance
	 */
	public CreateAssertionPaletteCommand() {
		super("Assertion", BlessPaletteContributor.BLESS_CATEGORY_ID, null);
	}

	@Override
	public Optional<Operation> getOperation(final GetTargetedOperationContext ctx) {
    return ctx.getTarget().getBusinessObject(BLESSSubclause.class)
      .map(state_machine -> Operation.createSimple(ctx.getTarget(), BLESSSubclause.class, blessToModify -> {
        // Create the assertion
        final NamedAssertion newAssertion = (NamedAssertion) EcoreUtil
            .create(BLESSPackage.eINSTANCE.getBehaviorState());
        final String newName = BlessNamingUtil.buildUniqueIdentifier(blessToModify, "new_assertion");
        newAssertion.setName(newName);

        // Add the new assertion 
        if (blessToModify.getAssert_clause() == null)
          {
          BLESSFactory factory = BLESSFactoryImpl.init();
          blessToModify.setAssert_clause(factory.createAssertClause());
          }
        blessToModify.getAssert_clause().getAssertions().add(newAssertion);
        return StepResultBuilder.create()
            .showNewBusinessObject(ctx.getTarget(), newAssertion).build();
      })).orElse(Optional.empty());
	}
}
