//SwtUiServices.java

package com.multitude.bless.ui;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeItem;

import com.multitude.aadl.bless.BlessControl;
import com.multitude.bless.app.UiServices;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.tree.BAST;

/**
 * @author brl
 * UiServices for running as an Eclipse plugin: JFace message dialogs and SWT tree windows;
 * installed by Activator.start()
 */
public class SwtUiServices implements UiServices
{

@Override
public void showMessage(String message)
  {
  Shell shell = new Shell(Display.getDefault());
  MessageDialog.openInformation(shell, "BLESS Message", message);
  }

@Override
public void showTree(String s, BAST t)
  {
  try {
  Display display = Display.getDefault();
  Shell shell = new Shell(display);
  shell.setLayout(new FillLayout());
  shell.setText(s);
  final org.eclipse.swt.widgets.Tree tree = new org.eclipse.swt.widgets.Tree(
      shell, SWT.BORDER);
  TreeItem fakeRootItem = new TreeItem(tree, 0);
  fakeRootItem.setText(s);
  TreeItem rootItem = new TreeItem(fakeRootItem, 0);
  rootItem.setText(t.getText());
  addTreeItemChildren(t, rootItem);
  shell.setSize(500, 500);
  shell.open();
    } catch (Exception ex)
    {Dump.it("Unable to display parse tree.");}
  }  //end of showTree

@Override
public void println(String text)
  {
  BlessControl.println(text);
  }

@Override
public String[] chooseFileToOpen()
  {
  Shell shell = new Shell(Display.getDefault());
  FileDialog dialog = new FileDialog(shell, SWT.OPEN);
  dialog.open();
  String[] choice = {dialog.getFilterPath(), dialog.getFileName()};
  shell.dispose();
  return choice;
  }  //end of chooseFileToOpen

public static void addTreeItemChildren(BAST t, TreeItem rootItem)
  {
  for (int ch = 0; ch < t.getChildCount(); ch++)
    {
    BAST child = (BAST) t.getChild(ch);
    TreeItem childItem = new TreeItem(rootItem, 0);
    childItem.setText(child.getText());
    // childItem.setForeground(new Color(AWT.));
    addTreeItemChildren(child, childItem);
    }
  } // end of addTreeItemChildren

}  //end of SwtUiServices
