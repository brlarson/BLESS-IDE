//WorkspaceFiles.java

package com.multitude.bless.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

/**
 * @author brl
 * Eclipse workspace file helpers (moved from com.multitude.bless.util.Util)
 */
public class WorkspaceFiles
{

	public static IFile toIFile(URI resourceURI) {
		/*
		 * Ideally we'd just call OsateResourceUtil.toIFile however that is not
		 * available in OSATE 2.4.x (which the CASE FM-IDE is based on). Workaround
		 * is to just replicate the current behavior of that method, refer to
		 * <a href=
		 * "https://github.com/osate/osate2/blob/bed18dd95fe3f3bf54d657911cd5e5da1ff2718b/core/org.osate.aadl2.modelsupport/src/org/osate/aadl2/modelsupport/resources/OsateResourceUtil.java#L62"
		 * >this</a>
		 */

		// return OsateResourceUtil.toIFile(resourceURI);

		if (resourceURI.isPlatform()) {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
		} else {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toFileString()));
		}
	}

}  //end of WorkspaceFiles
