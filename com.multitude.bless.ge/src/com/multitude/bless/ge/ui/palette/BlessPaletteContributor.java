//BlessPaletteContributor.java

package com.multitude.bless.ge.ui.palette;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.osate.ge.aadl2.ui.PaletteCommandUtil;
import org.osate.ge.palette.CreateConnectionPaletteCommand;
import org.osate.ge.palette.PaletteCategory;
import org.osate.ge.palette.PaletteCommandProviderContext;
import org.osate.ge.palette.PaletteContributor;
import org.osate.ge.palette.TargetedPaletteCommand;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;

/**
 * Palette contributor which contributes commands for creating behavior annex elements.
 *
 */
public class BlessPaletteContributor implements PaletteContributor {
	/**
	 * ID for the category containing behavior annex palette commands.
	 */
	public static final String BLESS_CATEGORY_ID = "com.multitude.bless.ge.categories.bless";

	@Override
	public Stream<PaletteCategory> getCategories() {
		return Stream.of(new PaletteCategory(BLESS_CATEGORY_ID, "BLESS"));
	}

	@Override
	public Stream<TargetedPaletteCommand> getTargetedCommands(final PaletteCommandProviderContext ctx) {
		final List<TargetedPaletteCommand> commands = new ArrayList<>();
		// Do not show BLESS specification palette option when diagram bo is BLESS ???
		if (PaletteCommandUtil.diagramMayContainPackageOrComponentClassifiers(ctx)) {
			commands.add(new CreateSpecificationPaletteCommand());
		} else if (!diagramIsBLESS(ctx)) {
			// Return empty if diagram context is not valid
			return Stream.empty();
		}

		commands.add(new CreateStatePaletteCommand());
		commands.add(new CreateVariablePaletteCommand());
		return commands.stream();
	}

	@Override
	public Stream<CreateConnectionPaletteCommand> getCreateConnectionCommands(
			final PaletteCommandProviderContext ctx) {
		final List<CreateConnectionPaletteCommand> commands = new ArrayList<>();
		if (diagramIsBLESS(ctx) || PaletteCommandUtil.diagramMayContainPackageOrComponentClassifiers(ctx)) {
			commands.add(new CreateTransitionPaletteCommand());
		}
		return commands.stream();
	}

	private static boolean diagramIsBLESS(final PaletteCommandProviderContext ctx) {
		return ctx.getDiagramBusinessObject() instanceof BLESSSubclause;
	}
}
