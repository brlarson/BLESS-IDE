//OpenBlessDiagramHandler.java

package com.multitude.bless.ge.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.ge.internal.services.DiagramService;

import com.multitude.bless.ge.util.BlessSelectionUtil;

/**
 * Handler for the open diagram command which is enabled when a behavior specification diagram context can be obtained from a selection.
 * This is needed because the open diagram command defined by org.osate.ge is not enabled for behavior specifications and
 * there is not a supported extension mechanism to convert a selection to a diagram context.
 *
 */
public class OpenBlessDiagramHandler extends AbstractHandler {
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelection(event);
		final DefaultAnnexSubclause diagramContext = BlessSelectionUtil
				.getBLESSAnnexSubclause(selection, HandlerUtil.getActiveEditor(event))
				.orElseThrow(() -> new RuntimeException("diagramContext cannot be null"));
		final DiagramService diagramService = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getService(DiagramService.class);
		diagramService.openOrCreateDiagramForBusinessObject(diagramContext);
		return null;
	}
}
