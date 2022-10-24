//BehaviorVariableHandler.java

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
import org.osate.ge.graphics.RectangleBuilder;
import org.osate.ge.graphics.StyleBuilder;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.bless.ge.util.BlessNamingUtil;
import com.multitude.bless.ge.util.BlessReferenceUtil;

/**
 * Business Object Handler for {@link BehaviorVariable} objects.
 */
public class BehaviorVariableHandler implements BusinessObjectHandler, CustomDeleter, CustomRenamer {
	private static final GraphicalConfiguration GRAPHICAL_CONFIG = GraphicalConfigurationBuilder.create()
			.graphic(RectangleBuilder.create().build()).style(StyleBuilder.create().labelsCenter().build()).build();

	@Override
	public boolean isApplicable(final IsApplicableContext ctx) {
		return ctx.getBusinessObject(VariableDeclaration.class).isPresent();
	}

	@Override
	public boolean canRename(final CanRenameContext ctx) {
		return true;
	}

	@Override
	public void rename(final RenameContext ctx) {
		final VariableDeclaration variableDeclaration = ctx.getBusinessObject(VariableDeclaration.class).orElseThrow();
		variableDeclaration.getVariable().setName(ctx.getNewName());
	}

	@Override
	public boolean canDelete(final CanDeleteContext ctx) {
		return true;
	}

	@Override
	public void delete(final CustomDeleteContext ctx) {
		final BLESSSubclause blessAnnex = ctx.getContainerBusinessObject(BLESSSubclause.class).orElseThrow();
		// Find variable by URI.
		final VariableDeclaration variableDeclaration = (VariableDeclaration) blessAnnex.eResource()
				.getResourceSet()
				.getEObject(EcoreUtil.getURI(ctx.getReadonlyBoToDelete(VariableDeclaration.class).orElseThrow()), true);
		EcoreUtil.remove(variableDeclaration);
//		if (behaviorAnnex.getVariables().isEmpty()) {
//			behaviorAnnex.unsetVariables();
//		}
	}

	@Override
	public CanonicalBusinessObjectReference getCanonicalReference(final ReferenceContext ctx) {
		final VariableDeclaration variableDeclaration = ctx.getBusinessObject(VariableDeclaration.class).orElseThrow();
		return new CanonicalBusinessObjectReference(BlessReferenceUtil.VARIABLE_TYPE,
				variableDeclaration.getVariable().getName(),
				ctx.getReferenceBuilder().getCanonicalReference(variableDeclaration.getOwner()).encode());
	}

	@Override
	public RelativeBusinessObjectReference getRelativeReference(final ReferenceContext ctx) {
		final VariableDeclaration variableDeclaration = ctx.getBusinessObject(VariableDeclaration.class).orElseThrow();
		return BlessReferenceUtil.getVariableRelativeReference(variableDeclaration.getVariable().getName());
	}

	@Override
	public Optional<GraphicalConfiguration> getGraphicalConfiguration(final GetGraphicalConfigurationContext ctx) {
		return Optional.of(GRAPHICAL_CONFIG);
	}

	@Override
	public String getName(final GetNameContext ctx) {
		return ctx.getBusinessObject(VariableDeclaration.class)
				.map(variableDeclaration -> (variableDeclaration.getVariable().getName() == null ? "" : variableDeclaration.getVariable().getName())
//						+ AadlArrayUtil.getDimensionUserString(variableDeclaration.getVariable())
						)
				.orElse("");
	}

	@Override
	public String getNameForRenaming(final GetNameContext ctx) {
		return ctx.getBusinessObject(VariableDeclaration.class)
				.map(variableDeclaration -> variableDeclaration.getVariable().getName())
				.orElse("");
	}

	@Override
	public Optional<String> validateName(final RenameContext ctx) {
		return BlessNamingUtil.checkNameValidity(ctx);
	}
}
