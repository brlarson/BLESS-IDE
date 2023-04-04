/**
 * GenerateISOSCELES.java
 */

package com.multitude.bless.codegeneration.handlers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.Feature;
import org.osate.annexsupport.AnnexUtil;

import com.multitude.bless.Activator;
import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.antlr3generated.UnparseBLESS3;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.codegeneration.TimeoutRecord;
import com.multitude.bless.codegeneration.WriteISOSCELESFile;
import com.multitude.bless.codegeneration.antlr3generated.GetTimeoutDispatchTriggers;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.record.EntityRecord;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.record.ThreadRecord;
import com.multitude.bless.symbol.LoadBLESS;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.tree.BASTTreeAdaptor;
import com.multitude.bless.util.Util;

/**
 * @author brl
 *
 */
public class GenerateISOSCELES extends AbstractHandler implements IHandler
	{
	boolean verbose = true;

	String keepEventsName = "api.Keep_Events";
	String updatedName = "Updated";
	String receiveInputName = "Receive_Input";
	String initializeEntrypointName = "Initialize_Entrypoint";
	String computeEntrypointName = "Compute_Entrypoint";
	String finalizeEntrypointName = "Finalize_Entrypoint";
	String folderString = "";
	String folderSuffix = "";

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
		{
		Dump.it("Generating ISOSCELES . . .");
		// load the model, if not already loaded
		if (!LoadBLESS.haveLoaded) {
			try
				{
				LoadBLESS.load();
				}
			catch (YouIdiot e)
				{
				Dump.it(e);
				}
		}
//			{
//			Dump.it("please Load the model before trying to generate code");
//			}
//		else
			generateISOSCELESForAllThreads();
		Dump.it("Done Generating ISOSCELES");
		return null;
		} // end of execute

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

	void generateISOSCELESForAllThreads()
		{
		// choose output directory
		Dump.it("choose directory (without spaces or special characters other" + "than \"_\") for generated ISOSCELES files");
		Shell shell = new Shell(PlatformUI.getWorkbench().getDisplay());
		DirectoryDialog dd = new DirectoryDialog(shell, SWT.OPEN);
		dd.setMessage(
				"choose directory (without spaces or special characters other" + "than \"_\") for generated ISOSCELES files");
		folderString = dd.open();
		folderSuffix = folderString.substring(folderString.lastIndexOf('/') + 1);
		if (verbose)
			{
			Dump.it("suffix=" + folderSuffix);
			}
		Global.wrapLength = 100;
		// set String Template for ISOSCELES
		try
			{
			if (Global.ISOSCELEStemplates == null)
				{
				Global.ISOSCELEStemplates = Util.loadStringTemplateGroup(Global.stringTemplateGroupFolder + "ISOSCELES.stg");
				}
			Global.templates = Global.ISOSCELEStemplates;
			// load port types to make .h for types and events
			Vector<BAST> portTypes = new Vector<BAST>();
			// find PackageRecord loaded in workspace
			for (ParseRecord pr : Global.compilationUnits)
				{
				if ((pr instanceof PackageRecord)) // &&(pr.name.compareTo(packageName)==0))
					{ // find thread types with BLESS subclauses
					String packageName = ((PackageRecord) pr).name;
					if ((packageName == null) || (packageName.length() < 1))
						{
						throw new YouIdiot("PackageRecord had null name");
						}
					String isoPackageName = convertAADLpackageNameToISOSCELES(packageName);
					for (ParseRecord tt : ((PackageRecord) pr).component_type_map.values())
						{ // is it a thread record with non-null abstract syntax tree?
						if ((tt instanceof ThreadRecord) && (tt.ast != null))
							{ // has BLESS subclause
							// determine source file name
							ThreadRecord tr = (ThreadRecord) tt;
							//set global context so unparser can evaluate property (set) names
							Global.context = tr.context;
							generateISOSCELESForThisThread(tr, tr.name.replace('.', '_'), isoPackageName, portTypes);
							} // done with thread type
						} // end of for tt loop
							// find thread implementations with BLESS subclauses
					for (ParseRecord ti : ((PackageRecord) pr).component_implementation_map.values())
						{ // is it a thread record with non-null abstract syntax
						// tree?
						if ((ti instanceof ThreadRecord) && (ti.ast != null))
							{ // has BLESS subclause
							// determine source file name
							ThreadRecord tr = (ThreadRecord) ti;
							Global.context = tr.context;
							generateISOSCELESForThisThread(tr, tr.name.replace('.', '_'), isoPackageName, portTypes);
							} // done with thread implementation
						} // end of for ti loop
					}
				}
			} // end of for pr loop
//		}
		catch (YouIdiot e1)
			{
			e1.handleException();
			}
		} // end of generateISOSCELESForAllThreads

	private void generateISOSCELESForThisThread(ThreadRecord tr, String threadName, String isoPackageName,
			Vector<BAST> portTypes) throws YouIdiot
		{
		String isoFolderName = folderString + "/" + threadName;
//		String ifdefname = "__" + folderString.toUpperCase() + "_" + threadName.toUpperCase() + "_cc";
		StringBuffer sb = new StringBuffer();
//	//find transitions root
//	BAST transitionsRoot = null;
//	for (int ch=1;ch<tr.ast.getChildCount();ch++)
//		{
//		BAST child = (BAST)tr.ast.getChild(ch);
//		if (child.hasType(BLESS3Lexer.LITERAL_transitions))
//			transitionsRoot=child;
//		}
		sb.append("// " + isoFolderName + "/" + threadName + ".cc \n");
		sb.append("// generated " + Time.todayString + "\n\n");
		sb.append(getSource(tr.context));
//find actual values for AADL properties
		UnparseBLESS3.lookUpPropertyValues = true;
		//make unparser use ISOSCELES templates
		try
			{
			Global.templates = Activator.loadStringTemplateGroup(Activator.stringTemplateGroupFolder + "ISOSCELES.stg");
			}
		catch (YouIdiot e)
			{
			e.handleException();;
			}
//    Global.context = tr.context;
		sb.append("\n#ifndef _" + threadName.toUpperCase() + "_CC\n");
		sb.append("\n#define _" + threadName.toUpperCase() + "_CC\n\n");

		sb.append("#include <base/component.h>\n" + "#include <base/log.h>\n" + "#include <base/attached_rom_dataspace.h>\n"
				+ "#include <util/xml_node.h>\n" + "#include <isos/types.h>\n" +
				"#include <isos/romclient.h>\n" + "#include <isos/binreporter.h>\n" +
				"#include <timer_session/connection.h>\n"
				+ "#include <aadl_types.h>\n" + "\n\n"); // "#include <isos/genreporter.h>\n\n");
		sb.append("namespace " + isoPackageName + "\n  {\n");
		sb.append("  class " + threadName + ";\n");
		sb.append("  typedef Genode::Constructible<Genode::Attached_rom_dataspace> InPortROM; \n  }\n\n");

//	sb.append("/*\nThread "+threadName+" was converted from AADL component "+threadName+"\'s BLESS annex subclause\n"+
//	       " by the BLESS Proof Engine \n*/\n");

		// create class for thread
		sb.append("class " + isoPackageName + "::" + threadName + "\n  {\n");
		sb.append("  protected:\n");
		sb.append("  Genode::Env &_env;\n");
		sb.append("  Isos::TscCal _tsccal { _env };\n");
		sb.append("\n//IN PORTS\n");
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			if (!er.inPort)
				{
				throw new YouIdiot("This should be EntityRecord for in port " + er.id);
				}
			sb.append("  static constexpr const char* PORT_" + in_port.toUpperCase() + " = \"port-" + in_port + "\";\n");
			sb.append("  InPortROM in_port_" + in_port + "_rom { };\n");
			if (er.eventPort && !er.dataPort)
				{
				sb.append("  AADL::EventPortVariable* in_port_" + in_port + " { };\n\n");
				}
			else
				{
				sb.append("  " + makeGenodePortType(er, portTypes) + "* in_port_" + in_port + " { };\n");
				sb.append("  " + makeCppType(er, portTypes) + " " + in_port + ";\n\n");
				}
			}
		sb.append("\n//OUT PORTS\n");
		for (String out_port : tr.out_ports)
			{
			EntityRecord er = tr.port_entity_map.get(out_port);
			if (!er.outPort)
				{
				throw new YouIdiot("This should be EntityRecord for out port " + er.id);
				}
			sb.append("  static constexpr const char* PORT_" + out_port.toUpperCase() + " = \"port-" + out_port + "\";\n");
			if (er.eventPort && !er.dataPort)
				{
				sb.append("  AADL::EventReporter out_port_" + out_port + "_reporter;\n");
				sb.append("  AADL::EventPortVariable out_port_" + out_port + " { };\n");
				sb.append("  bool " + out_port + " = false;\n\n");
				}
			else
				{
//				sb.append("  Isos::GenericReporter<" + makeGenodePortType(er, portTypes) + "> out_port_"
//						+ out_port + "_reporter;\n");
				sb.append(
						"  " + makeGenodePortType(er, portTypes) + " out_port_" + out_port + " { };\n");
				sb.append("  " + makeCppType(er, portTypes) + " " + out_port + " { };\n");
//				sb.append("  Timer::Connection _reporter_timer_" + out_port + ";\n\n");
				sb.append(
						"  Isos::BinReporter<" + makeGenodePortType(er, portTypes) + "> out_port_" + out_port + "_reporter;\n\n");
				}
			}
		sb.append("\n//SIGNAL HANDLERS\n");
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			if (er.eventPort)
				{
				sb.append("  Genode::Signal_handler<" + threadName + "> _in_port_" + in_port + "_handler \n");
				sb.append("    { _env.ep(), *this, &" + threadName + "::Compute_Entrypoint };\n");
				}
			}
		sb.append("\n//COMPLETE STATES\n");

		// create type for complete states
		Set<String> completeStateLabels = new HashSet<String>();
		String initialStateLabel = "";
		Set<String> executionStateLabels = new HashSet<String>();
		Set<String> finalStateLabels = new HashSet<String>();

		BAST states = (BAST) tr.ast.getChild(0);
		for (int s = 0; s < states.getChildCount(); s++)
			{
			BAST stateLabel = (BAST) states.getChild(s).getChild(0);
			if (stateLabel.hasType(BLESS3Lexer.LITERAL_complete))
				{
				completeStateLabels.add(states.getChild(s).getChild(1).getText());
				}
			else if (stateLabel.hasType(BLESS3Lexer.LITERAL_initial))
				{
				initialStateLabel = states.getChild(s).getChild(1).getText();
				}
			else if (stateLabel.hasType(BLESS3Lexer.LITERAL_final))
				{
				finalStateLabels.add(states.getChild(s).getChild(1).getText());
				}
			else
				{
				executionStateLabels.add(stateLabel.getText());
				}
			}
		sb.append("  enum CompleteState {");
		// put in initial state
		sb.append(" " + initialStateLabel.toUpperCase());
		int charCount = 23 + initialStateLabel.length();
		for (String completeState : completeStateLabels)
			{
			sb.append(", " + completeState.toUpperCase());
			charCount += 2 + completeState.length();
			if (charCount > 72)
				{
				sb.append("\n        ");
				charCount = 8;
				}
			}
		sb.append(" }; \n");
//		sb.append("  //execution states " + executionStateLabels.toString() + "\n");
//		sb.append("  //final state(s) " + finalStateLabels.toString() + "\n");
		// create variable for current complete state
		sb.append("  CompleteState currentState = " + initialStateLabel.toUpperCase() + ";\n");
		// declare local variables
		// find LITERAL_variables
		BAST varRoot = null;
		for (int i = 1; i < tr.ast.getChildCount(); i++)
			{
			if (((BAST) tr.ast.getChild(i)).hasType(BLESS3Lexer.LITERAL_variables))
				{
				varRoot = (BAST) tr.ast.getChild(i);
				}
			}
		if (varRoot == null)
			{
			sb.append("  //  no local variables\n\n");
			}
		else
			{
			sb.append("\n//VARIABLES\n");
			CommonTreeNodeStream nodes = new CommonTreeNodeStream(varRoot);
			UnparseBLESS3 unparser = new UnparseBLESS3(nodes);
			unparser.setTemplateLib(Global.ISOSCELEStemplates);
			try
				{
				sb.append(unparser.variablesSection().toString());
				}
			catch (RecognitionException e)
				{
				e.printStackTrace();
				}
			sb.append("\n");
			} // done with local variables
		sb.append("\n//TRANSITIONS\n");
		Vector<BAST> transitions = findTransitions(tr.ast);
		for (BAST bt : transitions)
			{
			if (!bt.hasType(BLESS3Lexer.TRANSITION))
				{
				throw new YouIdiot("transition must have TRANSITION as root", bt);
				}
			if (bt.getChild(0).getChild(0) == null)
				{
				throw new YouIdiot("transition must have a label", bt);
				}
			String label = bt.getChild(0).getChild(0).getText();
			sb.append("  void transition_" + label.toUpperCase() + "();\n");
			}
		sb.append("\n//EXECUTION STATES\n");
		for (String ex : executionStateLabels)
			{
			sb.append("  void execute_" + ex.toUpperCase() + "();\n");
			}
		if (finalStateLabels.size() > 0)
			{
			sb.append("\n//FINAL STATES\n");
			for (String ex : finalStateLabels)
				{
				sb.append("  void execute_" + ex.toUpperCase() + "();\n");
				}
			}
		ArrayList<TimeoutRecord> tor = makeTimers(tr);
		if (tor.size() > 0)
			{
			sb.append("\n//TIMEOUT DISPATCH TRIGGERS\n");
			for (TimeoutRecord t : tor)
				{
				sb.append("  void " + t.timeoutPortId + "_handler( Genode::Duration );\n");
				sb.append("  bool " + t.timeoutPortId + "_event = false;\n");
				sb.append("  Timer::One_shot_timeout<" + threadName + "> _" + t.timeoutPortId + "\n");
				sb.append("   {_timer, *this, &" + threadName + "::" + t.timeoutPortId + "_handler };\n");
				sb.append("  void reset_" + t.timeoutPortId + "();\n");
				}
			}
		sb.append("\n//COMMON TO ALL\n" + "  bool _verbose = false;\n" + "  Timer::Connection _timer { _env };\n"
				+ "  Isos::timestamp_t _tops { 0 };\n" + "  void Send_Output();\n" + "  void Receive_Input();\n"
				+ "  Genode::Attached_rom_dataspace config_rom { _env, \"config\" };\n"
				+ "  void attachSignalHandlers( Genode::Duration );\n" + "  Timer::One_shot_timeout<" + threadName
				+ "> _timeout\n" + "    { _timer, *this, &" + threadName + "::attachSignalHandlers };\n"
        + "  int attachAttemptCount = 1;\n"
				+ "  Isos::timestamp_t power_on_tick = AADL::now();\n" + "  long millisecondsSincePower()\n"
				+ "    { return Isos::timestampToMilliseconds(AADL::now() - power_on_tick); };\n\n" + "public:\n");
		sb.append("  " + threadName + "(Genode::Env &env);\n" + "  void Initialize_Entrypoint();\n"
				+ "  void Compute_Entrypoint();\n" + "  void Finalize_Entrypoint();\n");
		sb.append("  };  //end of class " + isoPackageName + "::" + threadName + "\n\n");

		sb.append("//CTOR\n");
		sb.append(isoPackageName + "::" + threadName + "::" + threadName + "(Genode::Env &env) :\n");
		sb.append("    _env(env), \n");
//		for (String in_port : tr.in_ports)
//			{
//			EntityRecord er = tr.port_entity_map.get(in_port);
//			sb.append("  in_port_" + in_port + "_rom(),");
//			sb.append("  in_port_" + in_port + "(),\n");
//			}
		for (String out_port : tr.out_ports)
			{
//			EntityRecord er = tr.port_entity_map.get(out_port);
//			if (er.eventPort && !er.dataPort)
//				{
				sb.append("    out_port_" + out_port + "_reporter(env, PORT_" + out_port.toUpperCase() + "), \n");
//				}
//			else
//				{
//				sb.append("    _reporter_timer_" + out_port + "( env ),\n");
//				sb.append("    out_port_" + out_port + "_reporter(env, " + " _reporter_timer_" + out_port + ", PORT_"
//						+ out_port.toUpperCase() + "),\n");
//				}
			}
		sb.append("    _tops(AADL::now())\n");
		// body of constructor
		sb.append("  {\n" + "  try {  //read config XML\n" + "    Genode::Xml_node xnode = config_rom.xml();\n"
				+ "    xnode.attribute(\"verbose\").value(&_verbose);\n" + "    } catch(...) {}\n"
				+ "  if ( _verbose ) Genode::log(\"Creating " + threadName + " [\",millisecondsSincePower(),\"]\");\n"
				+ "  Initialize_Entrypoint();\n" + "  }  //end of CTOR\n\n");
		// INITIALIZE ENTRYPOINT
		sb.append("//INITIALIZE ENTRYPOINT\n" + "void " + isoPackageName + "::" + threadName + "::Initialize_Entrypoint()\n"
				+ "  {\n");
		sb.append("  //enable out ports  \n");
		for (String out_port : tr.out_ports) {
			sb.append("  out_port_" + out_port + "_reporter.enabled( true );\n");
		}
		sb.append("  //send initialization reports  \n");
		for (String out_port : tr.out_ports)
			{
				sb.append("  out_port_" + out_port + ".valid = false;\n");
				sb.append("  out_port_" + out_port + "_reporter.report( &out_port_" + out_port + " );\n");
			}
		sb.append("  //construct roms  (first)\n");
		for (String in_port : tr.in_ports) {
			sb.append("  in_port_" + in_port + "_rom.construct( _env, PORT_" + in_port.toUpperCase() + " );\n");
		}
		sb.append(
				"  //start timeout to hook up signal handlers\n" +
		    "  _timeout.schedule(Genode::Microseconds(100*1000UL));\n" +
				"  }  //end of Initialize_Entrypoint\n\n");

		sb.append("//ATTACH SIGNAL HANDLERS\n");
		sb.append("void " + isoPackageName + "::" + threadName + "::attachSignalHandlers( Genode::Duration dur )\n");
		sb.append(
				"  {\n" + "  if ( _verbose ) Genode::log(\"connecting signal handlers: [\",millisecondsSincePower(),\"]\");\n");
		sb.append("  //constructs roms (again)\n");
		for (String in_port : tr.in_ports) {
			sb.append("  in_port_" + in_port + "_rom.construct( _env, PORT_" + in_port.toUpperCase() + " );\n");
		}
		sb.append("  try { \n");
		sb.append("  //when all report-ROMs are valid \n");
		sb.append("  if ( ");
		boolean firstPort = true;
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			if (er.eventPort)
				{
				if (!firstPort) {
					sb.append(" &&\n      ");
				}
				sb.append("in_port_" + in_port + "_rom->valid())");
				firstPort = false;
				}
			}
		sb.append(" )\n    { ");
		sb.append("  //attach signal handlers to event or event data ports \n");
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			if (er.eventPort)
				{
				sb.append("    in_port_" + in_port + "_rom->sigh(_in_port_"
						+ in_port + "_handler);\n");
				}
			}
		sb.append("  //get first inputs (if any)\n" + "    Receive_Input();\n" + "  //perform initial transition\n");
		// transition(s) leaving initial state
		Vector<BAST> initialTransitions = findTransitionsLeavingState(tr.ast, initialStateLabel);
		if (initialTransitions.size() == 0)
			{
			sb.append("//no transitions leaving initial state " + initialStateLabel + " were found.");
			}
		else if (initialTransitions.size() == 1)
			{
			BAST trans = initialTransitions.firstElement();
			String label = trans.getChild(0).getChild(0).getText().toUpperCase();
			sb.append("    transition_" + label + "();\n");
			}
		else
			{
			throw new YouIdiot("Please only have one transition leaving the initial state.");
			}
		sb.append("    }\n  else\n    {\n");
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			if (er.eventPort)
				{
				sb.append("    if ( _verbose && !in_port_" + in_port + "_rom->valid() )\n");
				sb.append("      Genode::log(\"Attempt \", attachAttemptCount,\n");
				sb.append("        \" to attach signal handlers found in_port_" +
				   in_port + "_rom unready.  Trying again.\n");
				}
			}
		sb.append("    _timeout.schedule(Genode::Microseconds(100*1000UL*attachAttemptCount));\n");
		sb.append("    attachAttemptCount++;\n");
		sb.append("    }\n");
		sb.append("  } catch(Genode::Rom_connection::Rom_connection_failed &)\n" +
	      "    { Genode::log(\"Rom_connection_failed\"); }\n");
		sb.append("  }  //end of attachSignalHandlers\n\n");

		sb.append("//COMPUTE ENTRYPOINT\n");
		sb.append("void " + isoPackageName + "::" + threadName + "::Compute_Entrypoint()\n");
		sb.append("  {\n" + "  if ( _verbose ) Genode::log(\"Compute_Entrypoint() [\",millisecondsSincePower(),\"]\");\n"
				+ "  Receive_Input();\n" + "  switch (currentState)\n" + "    {\n");
		sb.append("    case " + initialStateLabel.toUpperCase() + ":\n");
		sb.append("      break;\n");
		for (String completeState : completeStateLabels)
			{
			sb.append("    case " + completeState.toUpperCase() + ":\n");
			sb.append("      if ( _verbose ) Genode::log(\"" + completeState.toUpperCase() + " state\");\n");
			Vector<BAST> transitionsFromCompleteState = findTransitionsLeavingState(tr.ast, completeState);
			boolean firstTransition = true;
			for (BAST trans : transitionsFromCompleteState)
				{
				BAST dispatchCondition = (BAST) trans.getChild(2).getChild(0);
				sb.append("      " + (firstTransition ? "if (" : "else if (")
						+ (dispatchCondition == null ? "true" : dispatchCondition.unparse()) + ")\n");
				sb.append("        transition_" + trans.getChild(0).getChild(0).getText().toUpperCase() + "();\n");
				firstTransition = false;
				}
			sb.append("      else Genode::log(\"no enabled dispatch condition from " + completeState.toUpperCase()
					+ " state [\",millisecondsSincePower(),\"]\");\n" + "      break;\n");
			} // done with transitions leaving complete states
		sb.append("    }  //end of switch \n");
		sb.append("  }  //end of Compute_Entrypoint \n\n");

		sb.append("//RECEIVE_INPUT\n");
		sb.append("void " + isoPackageName + "::" + threadName + "::Receive_Input()\n");
		sb.append("  {\n" + "  if ( _verbose ) "
				+ "Genode::log(\"Receive_Input() [\",millisecondsSincePower(),\"]\"); \n");
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			if (er.eventPort)
				{
				sb.append("  if ( _verbose && !in_port_" + in_port + "_rom->valid() )\n");
				sb.append("    in_port_" + in_port + "_rom.construct( _env, PORT_" + in_port.toUpperCase() + " );\n");
				}
			}
		for (String in_port : tr.in_ports)
			{
			EntityRecord er = tr.port_entity_map.get(in_port);
			sb.append("  if (in_port_" + in_port + "_rom -> valid())\n" + "    {\n" + "    in_port_" + in_port
					+ "_rom -> update();\n");
			sb.append("    in_port_" + in_port + " = (in_port_" + in_port + "_rom->local_addr<"
					+ (er.dataPort ? makeGenodePortType(er, portTypes) : "AADL::EventPortVariable") + ">());\n");
			if (er.dataPort)
				{
				sb.append("    " + in_port + " = in_port_" + in_port + "->Get_Value();\n");
				sb.append("    Genode::log(\"" +
				  in_port.replace('_', ' ') + "\" set to \", " + in_port + " \");\\n");
				}
			sb.append("    }\n" + "  else Genode::log(\"in_port_" + in_port + "_rom not valid\");\n");
			for (TimeoutRecord to : tor)
				{
					for (BAST p : to.resetPorts)
						{
							if (p.isText(in_port))
								{
									sb.append("   //reset timeout\n" + "    reset_" + to.timeoutPortId + "();\n");
									}
							}
					}
			}
		sb.append("  }  //end of Receive_Input() \n\n");

		sb.append("//SEND_OUTPUT\n");
		sb.append("void " + isoPackageName + "::" + threadName + "::Send_Output()\n");
		sb.append(
				"  {\n" + "  if ( _verbose ) Genode::log(\"Send_Output() [\",millisecondsSincePower(),\"]\"); \n");
		for (String out_port : tr.out_ports)
			{
			EntityRecord er = tr.port_entity_map.get(out_port);
			if (er.dataPort)
				{

				}
			else
				{
				sb.append("  if ( " + out_port + " ) \n" + "    { \n" + "    //timestamp the event\n" + "    out_port_"
						+ out_port + ".stamp();\n" + "    // send an event out port " + out_port + "\n" + "    out_port_" + out_port
						+ "_reporter.report(&out_port_" + out_port + ");\n" + "    //clear the event\n" + "    " + out_port
						+ " = false;\n");
				for (TimeoutRecord to : tor)
					{
					for (BAST p : to.resetPorts)
						{
						if (p.isText(out_port))
							{
							sb.append("   //reset timeout\n" + "    reset_" + to.timeoutPortId + "();\n");
							}
						}
					}
				sb.append("    } \n");
				}
			} // done with all out ports
		for (TimeoutRecord to : tor)
			{
			sb.append("  //clear timeout flags\n  " + to.timeoutPortId + "_event = false;\n");
			}
		sb.append("     //set tops to now\n" + "  _tops = AADL::now();\n" + "  } //end of Send_Output\n\n");
//HANDLE TIMEOUTS
		if (!tor.isEmpty())
			{
			sb.append("//HANDLE TIMEOUTS\n");
			}
		for (TimeoutRecord to : tor)
			{
			sb.append("void " + isoPackageName + "::" + threadName + "::" + to.timeoutPortId
					+ "_handler( Genode::Duration dur )\n");
			sb.append("  {\n" + "  if ( _verbose )\n" + "    Genode::log(\"handling " + to.timeoutPortId
					+ " [\",millisecondsSincePower(),\"]\");\n");
			sb.append("  " + to.timeoutPortId + "_event = true;\n" + "  Compute_Entrypoint();\n" + "	 }  //end of "
					+ to.timeoutPortId + "_handler\n\n");
			}
//RESET TIMEOUTS
		if (!tor.isEmpty())
			{
			sb.append("//RESET TIMEOUTS\n");
			}
		for (TimeoutRecord to : tor)
			{
			sb.append("void " + isoPackageName + "::" + threadName + "::reset_" + to.timeoutPortId + "()\n");
			sb.append("  {\n" + "  if ( _verbose )\n" + "    Genode::log(\"resetting " + to.timeoutPortId
					+ " [\",millisecondsSincePower(),\"]\");\n");
			sb.append(
					"  if ( " + to.timeoutPortId + "_timer.scheduled() )\n" + "    " + to.timeoutPortId + "_timer.discard();\n");
			sb.append("  " + to.timeoutPortId + "_timer.schedule(Genode::Microseconds( " + to.duration + " * 1000UL));\n");
			sb.append("  Genode::log(\"timeout_n_p_lrl was reset [\",millisecondsSincePower(),\"]\");\n"
					+ "  }  //end of reset_" + to.timeoutPortId + "\n\n");
			}
//TRANSITIONS
		sb.append("//TRANSITIONS\n");
		for (BAST bt : transitions)
			{
			String label = bt.getChild(0).getChild(0).getText();
			sb.append("void " + isoPackageName + "::" + threadName + "::transition_" + label.toUpperCase() + "()\n");
			sb.append("  {\n" + "  if ( _verbose )\n" + "    Genode::log(\"transition_" + label.toUpperCase()
					+ " [\",millisecondsSincePower(),\"]\");\n");
			BAST action = (BAST) bt.getChild(4).getChild(0);
			if (action != null)
				{
				sb.append("  " + action.unparse() + "\n");
				}
			BAST destination = (BAST) bt.getChild(3).getChild(0);
			if (completeStateLabels.contains(destination.getText()))
				{
				sb.append("  currentState = " + destination.getText().toUpperCase() + ";\n" + "  Send_Output();\n");
				}
			else
				{
				sb.append("  execute_" + destination.getText().toUpperCase() + "();\n");
				}
			sb.append("  }  //end of transition_" + label.toUpperCase() + "\n\n");
			}

		// make methods for execution states
		sb.append("//EXECUTE STATES\n");
		// get execution states
		for (String executionState : executionStateLabels)
			{ // find all transitions leaving this execution state
			Vector<BAST> executeTransitions = findTransitionsLeavingState(tr.ast, executionState);
			sb.append("void " + isoPackageName + "::" + threadName + "::execute_" + executionState.toUpperCase() + "()\n"
					+ "  {\n");
			sb.append(
					"  if ( _verbose )\n" + "    Genode::log(\"" + executionState + " [\",millisecondsSincePower(),\"]\");\n");
			boolean firstIf = true;
			// make methods for leaving this complete state
			for (BAST trans : executeTransitions)
				{
				String label = trans.getChild(0).getChild(0).getText();
				// determine transition condition
				BAST tc = (BAST) trans.getChild(2).getChild(0);
				sb.append("  " + (firstIf ? "if (" : "else if (") + (tc == null ? "true" : tc.unparse()) + ")\n"
						+ "    transition_" + label.toUpperCase() + "();\n");
				firstIf = false;
				}
			sb.append("  else Genode::log(\"ERROR: " + executionState + " did not have enabled outgoing transition\");\n"
					+ "  }  //end of execute_" + executionState.toUpperCase() + "\n\n");
			} // done with execution states

		// make methods for final states
		if (finalStateLabels.size() > 0)
			{
			sb.append("//FINAL STATE(S)\n");
			for (String finalState : finalStateLabels)
				{
				sb.append(
						"void " + isoPackageName + "::" + threadName + "::execute_" + finalState.toUpperCase() + "()\n" + "  {\n");
				sb.append("  Genode::log(\"" + finalState + " [\",millisecondsSincePower(),\"]\");\n");
				sb.append("  Finalize_Entrypoint();\n" + "  }  //end of execute_" + finalState.toUpperCase() + "\n\n");
				}
			} // done with final states

		sb.append("void " + isoPackageName + "::" + threadName + "::Finalize_Entrypoint()\n" + "	{ Genode::log(\"Finalize "
				+ threadName + "\"); }\n\n");

		sb.append("void Component::construct(Genode::Env &env)\n" + "  {\n" + "  static " + isoPackageName + "::"
				+ threadName + " main(env);\n" +
				//				"  env.exec_static_constructors();\n" +
				"  }\n\n");
		sb.append("#endif   /* " + threadName.toUpperCase() + "_CC */\n\n");
		if (verbose)
			{
			Dump.it(sb.toString());
			}
		UnparseBLESS3.lookUpPropertyValues = false;
		WriteISOSCELESFile.writeISOSCELES(isoFolderName, threadName, sb.toString());
//	return sb;
		} // end of generateISOSCELESForThisThread

	private String make_complete_state_dispatch(BAST dc) throws YouIdiot
		{
		StringBuffer sb = new StringBuffer();
		return sb.toString();
		} // end of make_do_T

	private ArrayList<TimeoutRecord> makeTimers(ThreadRecord tr)
		{
		ArrayList<TimeoutRecord> timeoutRecords = new ArrayList<TimeoutRecord>();
		// find all timeout clauses, put in Set
		BAST newRoot = tr.ast.dupTree();
		GetTimeoutDispatchTriggers treePattern = new GetTimeoutDispatchTriggers(new CommonTreeNodeStream(newRoot));
		treePattern.setTreeAdaptor(new BASTTreeAdaptor());
		treePattern.downup(newRoot);
		for (BAST b : treePattern.s)
			{
			timeoutRecords.add(new TimeoutRecord(b));
			}
		return timeoutRecords;
		}

	private Vector<BAST> findTransitionsLeavingState(BAST root, String state)
		{
		Vector<BAST> transitions = new Vector<BAST>();
		// find transitions root
		BAST tRoot = null;
		for (int i = 1; i < root.getChildCount(); i++)
			{
			if (((BAST) root.getChild(i)).hasType(BLESS3Lexer.LITERAL_transitions))
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

	private Vector<BAST> findTransitions(BAST root)
		{
		Vector<BAST> transitions = new Vector<BAST>();
		// find transitions root
		BAST tRoot = null;
		for (int i = 1; i < root.getChildCount(); i++)
			{
			if (((BAST) root.getChild(i)).hasType(BLESS3Lexer.LITERAL_transitions))
				{
				tRoot = (BAST) root.getChild(i);
				}
			}
		if (tRoot != null)
			{
			for (int j = 0; j < tRoot.getChildCount(); j++)
				{
				transitions.add((BAST) tRoot.getChild(j));
				}
			}
		return transitions;
		} // end of findTransitions

	private String convertAADLpackageNameToISOSCELES(String aadlPackageName)
		{
		return aadlPackageName.replace("::", "_").toLowerCase();
		}

	// make Genode type for port type
	private String makeGenodePortType(EntityRecord er, Vector<BAST> portTypes)
		{
		return "AADL::DataPortVariable<" + makeCppType(er, portTypes) + ">";
		}

	// make C++ type
	private String makeCppType(EntityRecord er, Vector<BAST> portTypes)
		{
		// hopefully the ISOSCELES.stg has been loaded
		try
			{
			return er.type.unparse();
			}
		catch (YouIdiot e)
			{
			Dump.it("Unparse Error" + er.type.toStringTree());
			return "Unparse Error" + er.type.toStringTree();
			}
		}

	// get source code for both the component type and the BLESS annex subclause
	public static String getSource(EObject context)
		{
		//make unparser use BLESS templates
		try
			{
			Global.templates = Activator.loadStringTemplateGroup(Activator.stringTemplateGroupFolder + "BLESS3.stg");
			}
		catch (YouIdiot e)
			{
			e.handleException();;
			}
		if (context == null)
			{
			return "// null context\n";
			}
		StringBuffer source = new StringBuffer();
		// determine if component type or implementation
		if (context instanceof ComponentType)
			{
			ComponentType ct = (ComponentType) context;
			List<DefaultAnnexSubclause> das = EcoreUtil2.eAllOfType(ct, DefaultAnnexSubclause.class);
			for (DefaultAnnexSubclause defaultAnnexSubclause : das)
				{
				// defaultAnnexSubclause.getName() gets you the name
				String annexName = defaultAnnexSubclause.getName();
				if (annexName.endsWith("BLESS"))
					{ // found one, do features
					EList<Feature> features = ct.getAllFeatures();
					for (Feature f : features)
						{
						source.append("//  " + f.toString() + "\n");
						}
					source.append(
							"// annex BLESS " + AnnexUtil.getSourceText(defaultAnnexSubclause).replaceAll("\n", "\n//  ") + ";\n\n");
					}
				} // done looking for BLESS annex subclause
			} // done with ComponentType
		else if (context instanceof ComponentImplementation)
			{
			ComponentImplementation ci = (ComponentImplementation) context;
			List<DefaultAnnexSubclause> das = EcoreUtil2.eAllOfType(ci, DefaultAnnexSubclause.class);
			for (DefaultAnnexSubclause defaultAnnexSubclause : das)
				{
				// defaultAnnexSubclause.getName() gets you the name
				String annexName = defaultAnnexSubclause.getName();
				if (annexName.endsWith("BLESS"))
					{ // found one, do features
					EList<Feature> features = ci.getAllFeatures();
					for (Feature f : features)
						{
						source.append("//  " + f.toString() + "\n");
						}
					source.append(
							"// annex BLESS " + AnnexUtil.getSourceText(defaultAnnexSubclause).replaceAll("\n", "\n//  ") + ";\n\n");
					}
				} // done looking for BLESS annex subclause
			} // done with ComponentImplementation
		return source.toString();
		} // end of getSource

	} // end of GenerateISOSCELES
