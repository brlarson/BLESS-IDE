//Resources.java

package com.multitude.bless.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author brl
 * Opens files shipped with BLESS (e.g. StringTemplateGroups/BLESS3.stg).
 * Has no Eclipse dependency; when running as a plugin Activator.start() installs
 * one that reads from the plugin bundle. The default, FILES, opens plain files.
 */
public interface Resources
{
  /** open the resource at this path */
  InputStream open(String path) throws IOException;

  Resources FILES = path -> new FileInputStream(path);
}  //end of Resources
