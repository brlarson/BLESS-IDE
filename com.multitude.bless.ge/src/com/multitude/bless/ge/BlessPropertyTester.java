//BlessPropertyTester.java

package com.multitude.bless.ge;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import com.multitude.bless.ge.util.BlessSelectionUtil;

public class BlessPropertyTester extends PropertyTester
  {

  /**
   * Property tester for the BLESS plugin.
   *
   * Implements the "isDiagramContext" property which returns true if the object being tested is a selection from which a
   * BLESS subclause can be retrieved using {@link BehaviorAnnexSelectionUtil#getBLESSAnnexSubclause(ISelection, IEditorPart)}
   */
  @Override
  public boolean test(Object receiver, String property, Object[] args, Object expectedValue)
    {
    if (!("isDiagramContext".equals(property) && receiver instanceof ISelection)) {
    return false;
  }

  final ISelection selection = (ISelection) receiver;
  if (selection instanceof IStructuredSelection && ((IStructuredSelection) selection).size() != 1) {
    return false;
  }

  final IEditorPart editor = BlessSelectionUtil.getActiveEditor().orElse(null);
  return BlessSelectionUtil.getBLESSAnnexSubclause(selection, editor).isPresent();
    }
    
  
  }

  
