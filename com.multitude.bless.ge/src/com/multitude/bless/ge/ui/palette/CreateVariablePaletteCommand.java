//CreateVariablePaletteCommand.java

package com.multitude.bless.ge.ui.palette;

import static  com.multitude.bless.ge.util.BlessGeUtil.getPackage;

import java.util.Optional;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.PublicPackageSection;
import org.osate.ge.aadl2.AadlImportsUtil;
import org.osate.ge.operations.Operation;
import org.osate.ge.operations.OperationBuilder;
import org.osate.ge.operations.StepResult;
import org.osate.ge.operations.StepResultBuilder;
import org.osate.ge.palette.BasePaletteCommand;
import org.osate.ge.palette.GetTargetedOperationContext;
import org.osate.ge.palette.TargetedPaletteCommand;

import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.bless.ge.util.BlessGeUtil;
import com.multitude.bless.ge.util.BlessNamingUtil;

/**
 * Palette command for creating {@link VariableDeclaration} elements.
 */
public class CreateVariablePaletteCommand extends BasePaletteCommand implements TargetedPaletteCommand {
	/**
	 * Creates a new instance
	 */
	public CreateVariablePaletteCommand() {
		super("Variable Declaration", BlessPaletteContributor.BLESS_CATEGORY_ID, null);
	}

	@Override
	public Optional<Operation> getOperation(final GetTargetedOperationContext ctx) {
		return ctx.getTarget().getBusinessObject(BLESSSubclause.class).map(blessAnnex -> {
			final PublicPackageSection section = getPackage(blessAnnex).map(AadlPackage::getPublicSection)
					.orElse(null);
			if (section == null) {
				return null;
			}

// THIS ASSIGNS A DATA CLASSIFIER AS TYPE
//  REPLACE WITH SELECTION FROM TYPEDEF			
			return Operation.createWithBuilder(builder -> {
				final OperationBuilder<DataClassifier> prompt = builder
						.supply(() -> BlessGeUtil.promptForDataClassifier(blessAnnex.eResource())
							.filter(c -> BlessGeUtil.getPackage(c).isPresent())
							.map(StepResult::forValue)
								.orElseGet(StepResult::abort));

				final OperationBuilder<DataClassifier> addImportIfNeeded = prompt.modifyModel(null,
						(tag, prevResult) -> section, (tag, sectionToModify, dataClassifier) -> {
						BlessGeUtil.getPackage(dataClassifier)
									.ifPresent(classifierPkg -> AadlImportsUtil.addImportIfNeeded(sectionToModify,
											classifierPkg));
							return StepResult.forValue(dataClassifier);
						});

				addImportIfNeeded.modifyModel(null, (tag, dataClassifier) -> blessAnnex,
						(tag, blessAnnexToModify, prevResult) -> {
							final VariableDeclaration newVariable = (VariableDeclaration) EcoreUtil
									.create(BLESSPackage.eINSTANCE.getVariableDeclaration());
							final String newName = BlessNamingUtil.buildUniqueIdentifier(blessAnnexToModify,
									"new_behavior_variable");
							newVariable.getVariable().setName(newName);
//THIS SET VARIABLE TYPES TO BE DATA CLASSIFIERS
//							newVariable.getVariable().setTod(prevResult);

							blessAnnexToModify.getVariables().getBehavior_variables().add(newVariable);
							return StepResultBuilder.create()
									.showNewBusinessObject(ctx.getTarget(), newVariable)
									.build();
						});
			});
		});
	}
}
