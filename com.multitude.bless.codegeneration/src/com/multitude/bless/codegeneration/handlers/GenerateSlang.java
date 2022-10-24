/**
 * GenerateSlang.java
 */
package com.multitude.bless.codegeneration.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.util.Aadl2Util;
import org.osate.ui.dialogs.Dialog;

import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl;
import com.multitude.aadl.bless.bLESS.impl.BLESSSubclauseImpl;
import com.multitude.aadl.bless.maps.BlessMaps;
import com.multitude.bless.BLESS;
import com.multitude.bless.antlr3generated.BLESStoASTLexer;
import com.multitude.bless.antlr3generated.UnparseBLESS;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.codegeneration.WriteSlangFile;
import com.multitude.bless.codegeneration.antlr3generated.GetTimeoutDispatchTriggers;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.handlers.AbstractBLESSHandler;
import com.multitude.bless.proof.handlers.GenerateVCHandler;
import com.multitude.bless.symbol.LoadBLESS;
import com.multitude.bless.toast.ToAST;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.tree.BASTTreeAdaptor;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.util.Util;

/**
 * @author brl
 *
 */
public class GenerateSlang extends AbstractBLESSHandler 
	{
	boolean verbose = true;

	String keepEventsName = "api.Keep_Events";
	String updatedName = "updated";
	String receiveInputName = "receive_input";
	String initializeEntrypointName = "initialise";
	String computeEntrypointName = "compute_entrypoint";
  String finalizeEntrypointName = "finalise";
  String recoverEntrypointName = "recover";
  String activateEntrypointName = "activate";
  String deactivateEntrypointName = "deactivate";
	String folderString = "";
	String slangPackage = "";

  private static SystemInstance si = null;

  @Override
  public IStatus runJob(Element elem, IProgressMonitor monitor)
    {

    si = getSystemInstance(elem);
    if (si == null)
      {
      Dialog.showError(getToolName(), "Please select a system implementation or a system instance");
      return Status.CANCEL_STATUS;
      }
    Dump.it("Generating Slang . . .");
    // load the model, if not already loaded
    if (!LoadBLESS.haveLoaded)
      try {
      LoadBLESS.load();
      } catch(YouIdiot yi)
      {
      Dump.it("Problem loading architecture preceding Slang generation");
      yi.handleException();
      }
    generateSlangForAllThreads();
    Dump.it("Done Generating Slang");
    return Status.CANCEL_STATUS;
    }

//	@Override
//	public Object execute(ExecutionEvent event) throws ExecutionException
//		{
//		Dump.it("Generating Slang . . .");
//		// load the model, if not already loaded
//		if (!LoadBLESS.haveLoaded)
//			{
//      Dialog.showError("BLESS", "Please right-click system instance (.aaxl2) \n"+
//          "to Generate BLESS Verification Conditions");
//         Dump.it("Please right-click system instance (.aaxl2)");
//         Dump.it("to Generate BLESS Verification Conditions.");
//		  } 
//		else 
//		  {
//		  generateSlangForAllThreads();
//		  Dump.it("Done Generating Slang");
//		  }
//		return null;
//		} // end of execute

	@Override
	public boolean isEnabled()
		{
		return true;
		}

	@Override
	public boolean isHandled()
		{
		return true;
		}

	void generateSlangForAllThreads()
		{
//    SystemInstance si = GenerateVCHandler.getSystemInstance();
    if (si == null) 
      {
      Dialog.showError("BLESS", "Please click on a system implementation (in the Outline),\n"+
        "or an instance fle .aaxl2 (in the AADL Navigator).");
      Dump.it("Please click on a system implementation (in the Outline),\n"+
          "or an instance fle .aaxl2 (in the AADL Navigator).");
      return;
      }
    // get output folder
//		folderString = ConfigurationPreferencePage.getSlangDirectory();
    boolean choosePreferenceSlangDirectory = Dialog.askQuestion("", "Do you want to use the default Slang directory from the BLESS preference?");
    if (choosePreferenceSlangDirectory)
      folderString = ConfigurationPreferencePage.getSlangDirectory();
    else
      {
      DirectoryDialog dd = new DirectoryDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), SWT.OPEN);
      dd.setMessage("Select directory for Slang generation");
      folderString = dd.open();
      }
    //get Slang project ID
    slangPackage = Dialog.getInput("What is the Slang package name?","",slangPackage,null);
		//set String Template line wrap length
		Global.wrapLength = 100;
		// set String Template for Slang
		try
			{
			if (Global.Slangtemplates == null)
				{
				Global.Slangtemplates = Util.loadStringTemplateGroup(Global.stringTemplateGroupFolder + "Slang.stg");
				}
			Global.templates = Global.Slangtemplates;
			Global.usingSlangStringTemplateGroup = true;
			Global.usingBLESSStringTemplateGroup = false;
			}
    catch (YouIdiot e1)
      {
      e1.handleException();
      }
    String rootName = si.getName();
    List<String>  path = new ArrayList<String>();
    path.add(rootName);
		//get all components having BLESS annex subclauses
		EList<ComponentInstance> cis = si.getComponentInstances();
		for (ComponentInstance ci : cis)
		  generateSlangForComponentInstance(path,ci);

	
		// find PackageRecord loaded in workspace
//		try {
//			for (ParseRecord pr : Global.compilationUnits)
//				{
//				if ((pr instanceof PackageRecord)) // &&(pr.name.compareTo(packageName)==0))
//					{ // find thread types with BLESS subclauses
//					String packageName = ((PackageRecord) pr).name;
//					if ((packageName == null) || (packageName.length() < 1))
//						{
//						throw new YouIdiot("PackageRecord had null name");
//						}
//					String slangPackageName = convertAADLpackageNameToSlang(packageName);
//					for (ParseRecord tt : ((PackageRecord) pr).component_type_map.values())
//						{ // is it a thread record with non-null abstract syntax tree?
//						if ((tt instanceof ThreadRecord) && (tt.ast != null))
//							{ // has BLESS subclause
//							// determine source file name
//							ThreadRecord tr = (ThreadRecord) tt;
//							Global.context = tr.context;
//							generateSlangForThisThread(tr, tr.name.replace('.', '_'), slangPackageName);
//							} // done with thread type
//						} // end of for tt loop
//							// find thread implementations with BLESS subclauses
//					for (ParseRecord ti : ((PackageRecord) pr).component_implementation_map.values())
//						{ // is it a thread record with non-null abstract syntax
//						// tree?
//						if ((ti instanceof ThreadRecord) && (ti.ast != null))
//							{ // has BLESS subclause
//							// determine source file name
//							ThreadRecord tr = (ThreadRecord) ti;
//							generateSlangForThisThread(tr, tr.name.replace('.', '_'), slangPackageName);
//							} // done with thread implementation
//						} // end of for ti loop
//					}
//				} // end of for pr loop
//		  }
//		catch (YouIdiot e1)
//			{
//			e1.handleException();
//			}
		
		
//restore BLESS.stg
    Global.templates = Global.BLESStemplates;
    Global.usingSlangStringTemplateGroup = false;
    Global.usingBLESSStringTemplateGroup = true;
		
		} // end of generateSlangForAllThreads

	private void 
generateSlangForComponentInstance(List<String> path, ComponentInstance ci)
	{
	String componentName = ci.getName();
  path.add(componentName);
	if (ci.getClassifier() != null) 
	  {
    List<BLESSSubclauseImpl> bas = EcoreUtil2.eAllOfType(ci.getClassifier(),
        BLESSSubclauseImpl.class);
//    if (bas.size() == 1)
    for (int i=0;i<bas.size();i++)  
      {
      BAST ast = ToAST.TOAST.toAST((BLESSSubclause)bas.get(i));
      try
        { 
        generateSlangForBLESS(path, ast, ci); 
        }
      catch (YouIdiot yi)
        {
        Dump.it("Exception generating Slang from BLESS for "+componentName);
        yi.handleException();
        }
      }  //done with BLESS subclause
    //is there an Action subclause? 
      
      List<ActionSubclauseImpl> act = EcoreUtil2.eAllOfType(ci.getClassifier(),
          ActionSubclauseImpl.class);
//      if (act.size() == 1)
      for (int i=0;i<act.size();i++) 
        {
        BAST ast = ToAST.TOAST.toAST(act.get(i));
        try
          { generateSlangForAction(path, ast); }
        catch (YouIdiot yi)
          {
          Dump.it("Exception generating Slang from Action for "+path.toString());
          yi.handleException();
          }
        } //done with Action subclause
	  }
//are there any subcomponents?	
	//do subcomponents
	for (ComponentInstance sub : ci.getComponentInstances())
	  generateSlangForComponentInstance(path, sub);	
	path.remove(componentName);
	}  //end of generateSlangForComponentInstance
  
  private void 
generateSlangForAction(List<String> path, BAST ast)
  throws YouIdiot
  {

  }  //end of generateSlangForBLESS
	
  private String 
makeSlangFileName(List<String> path, ComponentInstance ci)
  {
  StringBuffer sb = new StringBuffer();
  sb.append(ci.getClassifier().getName().replace('.','_'));
  for (int i=1;i<path.size();i++)
    sb.append("_"+path.get(i));
  return sb.toString();
  }
  
  
	private void 	
generateSlangForBLESS(List<String> path, BAST ast, ComponentInstance ci)  
  throws YouIdiot
		{
		String slangFileName = makeSlangFileName(path,ci);
		String componentName =   ci.getClassifier().getName().replace('.','_');
    String aadlPackageName = convertAADLpackageNameToSlang(Aadl2Util.getPackageName(ci.getClassifier().getQualifiedName()));
		StringBuffer sb = new StringBuffer();
//	//find transitions root
//	BAST transitionsRoot = null;
//	for (int ch=1;ch<tr.ast.getChildCount();ch++)
//		{
//		BAST child = (BAST)tr.ast.getChild(ch);
//		if (child.hasType(BLESStoASTLexer.LITERAL_transitions))
//			transitionsRoot=child;
//		}
		sb.append("//#Sireum \n\n");
	sb.append("// generated by BLESS "+BLESS.versionDate+" at "+Time.todayString+"\n\n");
		sb.append("package " + slangPackage + "." + aadlPackageName + "\n\n");
//	sb.append("/*\nThread "+threadName+" was converted from AADL component "+threadName+"\'s BLESS annex subclause\n"+
//	       " by the BLESS Proof Engine \n*/\n");
		// make imports
    sb.append("import org.sireum._ \n");
    sb.append("import art.Art._ \n");
	sb.append("import "+slangFileName+"_Bridge._\n");
//		sb.append("import " + path.toString() + "._\n");
		sb.append("import "+slangPackage+"._ \n\n");

		// create record class for thread
//		sb.append("@record class " + threadName + " {\n\n");
		// create type for complete states
		Set<String> completeStateLabels = new HashSet<String>();
		String initialStateLabel = "";
		Set<String> executionStateLabels = new HashSet<String>();
		Set<String> finalStateLabels = new HashSet<String>();

		BAST states = (BAST) ast.getChild(0);
		for (int s = 0; s < states.getChildCount(); s++)
			{
			BAST stateLabel = (BAST) states.getChild(s).getChild(0);
			if (stateLabel.hasType(BLESStoASTLexer.LITERAL_complete))
				{
				completeStateLabels.add(states.getChild(s).getChild(1).getText());
				}
			else if (stateLabel.hasType(BLESStoASTLexer.LITERAL_initial))
				{
				initialStateLabel = states.getChild(s).getChild(1).getText();
				}
			else if (stateLabel.hasType(BLESStoASTLexer.LITERAL_final))
				{
				finalStateLabels.add(states.getChild(s).getChild(1).getText());
				}
			else
				{
				executionStateLabels.add(stateLabel.getText());
				}
			}
		sb.append("@enum object CompleteState {\n");
		// put in initial state
		sb.append("  \"" + initialStateLabel + "\" //initial state\n");
		for (String completeState : completeStateLabels)
			{
			sb.append("  \"" + completeState + "\"\n");
			}
		sb.append("  } //end of CompleteState\n");
		sb.append("  //execution states " + executionStateLabels.toString() + "\n");
		sb.append("  //final state(s) " + finalStateLabels.toString() + "\n\n");
//	sb.append("}  // end of object "+threadName+"()\n\n");
		// imports
//	sb.append("import BLESS._ \n");
//	sb.append("import "+threadName+"._ \n\n");
		// @record class ThreadTemplate(api: ThreadTemplateBridge.Api) {
		sb.append("object " +  slangFileName + //"(api: " +  slangFileName + "_Bridge.Api) 
		    " { \n\n");
		// create variable for current complete state
		sb.append("  var currentState : CompleteState.Type = CompleteState." + initialStateLabel + "\n\n");
		// declare local variables
		// find LITERAL_variables
		BAST varRoot = null;
		for (int i = 1; i < ast.getChildCount(); i++)
			{
			if (((BAST) ast.getChild(i)).hasType(BLESStoASTLexer.LITERAL_variables))
				{
				varRoot = (BAST) ast.getChild(i);
				}
			}
		if (varRoot == null)
			{
			sb.append("  //no local variables\n\n");
			}
		else
			{
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(varRoot);
			UnparseBLESS unparser = new UnparseBLESS(nodes);
			unparser.setTemplateLib(Global.Slangtemplates);
			try
				{
				sb.append(unparser.variables().toString());
				}
			catch (RecognitionException e)
				{
				e.printStackTrace();
				}
			sb.append("\n");
			} // done with local variables
// make initialize entrypoint
		Vector<BAST> initialTransitions = findTransitionsLeavingState(ast, initialStateLabel);
		sb.append("\n/* Initialize_Entrypoint property for the thread */\n");
		sb.append("  def " + initializeEntrypointName + "(api: "+componentName+"_Initialization_Api): Unit = {\n");
		// make timers, if any
		sb.append(makeTimers(ast));
//	sb.append("  api."+receiveInputName+"()  //invoke AADL runtime service Receive_Input to freeze all incoming ports\n");
		sb.append("  //determine which transition to take from initial state\n");
		boolean elseif = false;
		for (BAST trans : initialTransitions)
			{ // CONDITION is third child
			BAST condition = (BAST) trans.getChild(2).getChild(0);
			// LABEL is first child
			String label = trans.getChild(0).getChild(0).getText();
			sb.append(
					"  " + (elseif ? "else if" : "if") + " (" + (condition != null ? condition.unparse() : "true") + ") \n");
			sb.append("    { do_" + label + "() }\n");
			elseif = true;
			}
		sb.append("  }  //end of " + initializeEntrypointName + "\n\n");
		// transition(s) leaving initial state
		if (initialTransitions.size() == 0)
			{
			sb.append("//no transitions leaving initial state " + initialStateLabel + " were found.");
			}
		else
			{
			for (BAST trans : initialTransitions)
				{
				sb.append(make_do_T(trans, completeStateLabels, finalStateLabels, executionStateLabels));
				}
			}

		// make compute entrypoint
		sb.append("/* Compute_Entrypoint property for the thread */\n");
		sb.append("  def " + computeEntrypointName + "(api: "+componentName+"_Operational_Api): Unit = {\n\n");
//	sb.append("\n  api.Receive_Input()  //invoke AADL runtime service Receive_Input to freeze all incoming ports\n");
		sb.append("    //choose complete state entered at last suspension\n");
		sb.append("    currentState match {\n");
		// must have choice for initial state
		sb.append("      case CompleteState." + initialStateLabel + " => \n");
		for (String completeState : completeStateLabels)
			{
//		String completeState = csmr.completeStateID;
			// get all transitions leaving this complete state
			Vector<BAST> transitions = findTransitionsLeavingState(ast, completeState);
			sb.append("      case CompleteState." + completeState + " => \n");
			boolean firstIf = true;
			for (BAST trans : transitions)
				{ // get transition condition
				BAST tc = (BAST) trans.getChild(2).getChild(0);
				String transitionCondition = (tc != null ? tc.unparse() : "true");
				String methodName = (trans.getChild(0).getChild(0) != null ? "do_" + trans.getChild(0).getChild(0).getText()
						: "do_" + completeState + "Transition");
				sb.append(
						"        " + (firstIf ? "" : "else ") + "if (" + transitionCondition + ") { " + methodName + "() }\n");
				firstIf = false;
				} // done with transition
//			sb.append("        " + (firstIf ? "" : "else ") + "{ " + keepEventsName + "() } "
//					+ (firstIf ? "" : " // no dispatch condition fired, keep current events") + "\n");
			} // done with all complete states
		sb.append("    }  //end of match\n");
		sb.append("  }  //end of " + computeEntrypointName + "\n\n");

		sb.append("  // transitions leaving complete states\n");
		// make defs for all transitions leaving complete states
		for (String completeState : completeStateLabels)
			{
			Vector<BAST> transitionsFromCompleteState = findTransitionsLeavingState(ast, completeState);
			for (BAST trans : transitionsFromCompleteState)
				{
				sb.append(make_do_T(trans, completeStateLabels, finalStateLabels, executionStateLabels));
				}
			} // done with transitions leaving complete states

		// make methods for execution states
		sb.append("  //methods for execution states\n");
		// get execution states
		for (String executionState : executionStateLabels)
			{ // find all transitions leaving this execution state
			Vector<BAST> transitions = findTransitionsLeavingState(ast, executionState);
			sb.append("  def executionState_" + executionState + " (): Unit = {\n");
			boolean firstIf = true;
			// make alternative that selects a transition
			sb.append("  //body of method executionState_" + executionState + " ()\n");
			for (BAST trans : transitions)
				{
				BAST tc = (BAST) trans.getChild(2).getChild(0);
				String transitionCondition;
				if (tc==null) {
					transitionCondition = "true";
				} else
					{
					CommonTreeNodeStream nodes = new CommonTreeNodeStream(tc.dupTree());
					UnparseBLESS unparser = new UnparseBLESS(nodes);
					unparser.setTemplateLib(Global.Slangtemplates);
					UnparseBLESS.expression_or_relation_return bau = null;
					try
						{
						bau = unparser.expression_or_relation();
						}
					catch (RecognitionException e)
						{
						Dump.it("Transition condition wouldn't unparse  Using toStringTree instead.");
						transitionCondition = tc.toStringTree();
						}
					StringTemplate actionOutput = (StringTemplate) bau.getTemplate();
					transitionCondition = actionOutput.toString(Global.wrapLength); // wrap at 72
					}
				String methodName = (trans.getChild(0).getChild(0) != null ? "do_" + trans.getChild(0).getChild(0).getText()
						: "do_" + executionState + "Transition");
				sb.append(
						"    " + (firstIf ? "" : "else ") + "if ( " + transitionCondition + " )\n      { " + methodName + "() }\n");
				firstIf = false;
				} // done with all transition alternatives
			sb.append("  }  //end of executionState_" + executionState + "\n\n");

			// make methods for transitions leaving this execution state
			for (BAST trans : transitions)
				{
				String methodName = (trans.getChild(0).getChild(0) != null ? "do_" + trans.getChild(0).getChild(0).getText()
						: "do_" + executionState + "Transition");
				sb.append("  def " + methodName + "(): Unit = { \n");
				// action is fifth child
				BAST action = (BAST) trans.getChild(4).getChild(0);
				if (action != null)
					{
					sb.append("      " + action.unparse() + "\n");
					}
				// is destination complete? destination is 4th child
				String destination = trans.getChild(3).getChild(0).getText();
				if (completeStateLabels.contains(destination))
					{
					sb.append("     currentState = CompleteState." + destination + "  //destination is complete state "
							+ destination + "\n");
					}
				else if (finalStateLabels.contains(destination))
					{
					sb.append("      //" + destination + " is final state\n");
					sb.append("      " + finalizeEntrypointName + "()");
					}
				else if (executionStateLabels.contains(destination))
					{
					sb.append("    executionState_" + destination + "()  \n");
					}
				sb.append("    } // end of " + methodName + "\n\n");
				} // done making methods for transitions leaving this execution state
			} // done with all execution states
		sb.append("  def " + finalizeEntrypointName + "(api: "+componentName+"_Operational_Api): Unit = {}\n\n");
		sb.append("  def " + activateEntrypointName + "(api: "+componentName+"_Operational_Api): Unit = {}\n\n");
		sb.append("  def " + deactivateEntrypointName + "(api: "+componentName+"_Operational_Api): Unit = {}\n\n");
		sb.append("  def " + recoverEntrypointName + "(api: "+componentName+"_Operational_Api): Unit = {}\n");
		sb.append("}  // end of class " +  path.toString() + "()\n");
		if (verbose)
			{
			Dump.it(sb.toString());
			}
		String directoryName = folderString+"/src/main/blessgenerated/"+slangPackage + '/' + aadlPackageName +'/';
		WriteSlangFile.writeSlang(slangFileName, sb.toString(),directoryName);
//	return sb;
		} // end of generateSlangForThisThread

	private String make_do_T(BAST transition, Set<String> completeStateLabels, Set<String> finalStateLabels,
			Set<String> executionStateLabels) throws YouIdiot
		{
		StringBuffer sb = new StringBuffer();
		String label = transition.getChild(0).getChild(0).getText();
		sb.append("  def do_" + label + "(): Unit = {\n");
		// ACTION is fifth child
		BAST action = (BAST) transition.getChild(4).getChild(0);
		if (action != null)
			{
			sb.append(action.unparse() + "\n");
			}
		else
			{
			sb.append("    //no action\n");
			}
		String destination = transition.getChild(3).getChild(0).getText();
		// is destination complete state?
		if (completeStateLabels.contains(destination))
			{
			sb.append("    //set currentState to destination complete state " + destination + "\n");
			sb.append("    currentState = CompleteState." + destination + "\n");
			}
		else if (executionStateLabels.contains(destination))
			{
			sb.append("    //the destination is execution state " + destination + "\n");
			sb.append("    executionState_" + destination + "() \n");
			}
		else if (finalStateLabels.contains(destination))
			{
			sb.append("    //the destination is final state " + destination + "\n");
			sb.append("    " + finalizeEntrypointName + "()\n");
			}
		else
			{
			throw new YouIdiot("state \"" + destination + "\" not found in complete, execution or final states");
			}
		sb.append("  }  // end of do_" + label + "\n\n");
		return sb.toString();
		} // end of make_do_T

	private String makeTimers(BAST ast)
		{
		StringBuffer sb = new StringBuffer();
		// find all timeout clauses, put in Set
		BAST newRoot = ast.dupTree();
		GetTimeoutDispatchTriggers treePattern = new GetTimeoutDispatchTriggers(new CommonTreeNodeStream(newRoot));
		treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//	treePattern.downup(newRoot);
//	for (BAST b : treePattern.s)
//
//	//remove any duplicates??  (does Set alredy drop duplicates
//	for (TimeoutRecord t : timeouts)
//		sb.append("  ctx.Make_Timer("+t.timeoutPortId+", "+t.getPortSet()+","+t.timeUnit+")\n");
		return sb.toString();
		}

	private Vector<BAST> findTransitionsLeavingState(BAST root, String state)
		{
		Vector<BAST> transitions = new Vector<BAST>();
		// find transitions root
		BAST tRoot = null;
		for (int i = 1; i < root.getChildCount(); i++)
			{
			if (((BAST) root.getChild(i)).hasType(BLESStoASTLexer.LITERAL_transitions))
				{
				tRoot = (BAST) root.getChild(i);
				}
			}
		if (tRoot != null)
			{
			for (int j = 0; j < tRoot.getChildCount(); j++)
				{
				if (tRoot.getChild(j).getChild(1).getChild(0).getText().compareTo(state) == 0)
					{
					transitions.add((BAST) tRoot.getChild(j));
					}
				}
			}
		return transitions;
		} // end of findTransitionsLeavingState

	private String convertAADLpackageNameToSlang(String aadlPackageName)
		{
		return aadlPackageName.replace("::", "_").toLowerCase();
		}


	} // end of GenerateSlang
