//UiServices.java

package com.multitude.bless.app;

import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.tree.BAST;

/**
 * @author brl
 * User-interface services the parser and proof engine call
 * (Global.showMessageBox, BAST.showParseTree).
 * Has no Eclipse dependency; Activator.start() installs com.multitude.bless.ui.SwtUiServices.
 * The default, HEADLESS, writes to Dump, as BLESS did when not running as a plugin.
 */
public interface UiServices
{
  /** show an information message to the user */
  void showMessage(String message);

  /** show a tree (already written to Dump by BAST.showParseTree) */
  void showTree(String title, BAST tree);

  UiServices HEADLESS = new UiServices()
    {
    @Override
    public void showMessage(String message)
      {
      Dump.it("BLESS Message:  "+message);
      }

    @Override
    public void showTree(String title, BAST tree)
      {
      Dump.it("Please choose Window->Show View->Other->Absract Syntax Tree to see the tree for \""
          + title + "\"");
      }
    };
}  //end of UiServices
