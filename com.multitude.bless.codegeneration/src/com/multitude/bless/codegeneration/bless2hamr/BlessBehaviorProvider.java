//BlessBehaviorProvider.java

//BLESS Behavior Provider Plugin



package com.multitude.bless.codegeneration.bless2hamr;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

import org.osate.aadl2.Classifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DataClassifier;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.Feature;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Parameter;
import org.osate.aadl2.SubprogramType;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureCategory;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.instance.util.InstanceSwitch;
import org.osate.xtext.aadl2.properties.util.GetProperties;
import org.sireum.IS;
import org.sireum.Z;
import org.sireum.$internal.MutableMarker;
import org.sireum.aadl.osate.hamr.plugin.OSATECodegenPlugin;
import org.sireum.aadl.osate.util.VisitorUtil;
import org.sireum.hamr.arsit.plugin.BehaviorProviderPlugin;
import org.sireum.hamr.codegen.common.containers.*;
import org.sireum.hamr.codegen.common.symbols.AadlThreadOrDevice;
import org.sireum.hamr.codegen.common.symbols.AnnexClauseInfo;
import org.sireum.hamr.codegen.common.symbols.SymbolTable;
import org.sireum.hamr.codegen.common.types.AadlTypes;
import org.sireum.hamr.codegen.common.util.NameUtil;
import org.sireum.hamr.codegen.common.util.NameUtil.NameProvider;
import org.sireum.hamr.ir.Annex;
import org.sireum.hamr.ir.Component;
import org.sireum.message.Reporter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.BehaviorState;
import com.multitude.aadl.bless.bLESS.BehaviorTime;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.DispatchCondition;
import com.multitude.aadl.bless.bLESS.DispatchTrigger;
import com.multitude.aadl.bless.bLESS.EnumerationType;
import com.multitude.aadl.bless.bLESS.EnumerationValue;
import com.multitude.aadl.bless.bLESS.ExecuteCondition;
import com.multitude.aadl.bless.bLESS.Expression;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.VariableDeclaration;
import com.multitude.aadl.bless.bLESS.util.BLESSSwitch;
import com.multitude.aadl.bless.maps.BlessMaps;
import com.multitude.aadl.bless.util.TypeUtil;
import com.multitude.aadl.bless.util.UnitUtil;
import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.antlr3generated.GetTimeouts;
import com.multitude.bless.antlr3generated.UnparseBLESS3;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.codegeneration.bless2hamr.BlessEntrypointProvider;
import com.multitude.bless.codegeneration.bless2hamr.FindTimeoutDispatchTriggers;
import com.multitude.bless.codegeneration.TimeoutRecord;
import com.multitude.bless.codegeneration.antlr3generated.GetTimeoutDispatchTriggers;
import com.multitude.bless.codegeneration.antlr3generated.ToSlangExp;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.symbol.LoadBLESS;
import com.multitude.bless.toast.ToAST;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.tree.BASTTreeAdaptor;
import com.multitude.bless.util.Util;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;

public class BlessBehaviorProvider implements BehaviorProviderPlugin, OSATECodegenPlugin
  {
  @Inject private UnitUtil unitUtil; 
  @Inject private TypeUtil typeUtil; 
  @Inject private UnparseToSlang unparser; 
  
  SystemInstance si;
  
  public static Map<String, ComponentInstance> instances;
  public static Map<String, DataClassifier> feature_types;
//  public static PropertiesToSlang p2s; 
  
  // requires stringtemplate-4.0.2.jar
  STGroupFile slang_stg;
//  StringTemplateGroup stg;
  String basePackageName = "bless";
  String blessAnnexName = "BLESS";
  String finalizeEntrypointName = "Finalize_Entrypoint";
  String initializeEntrypointName = "Initialize_Entrypoint";
  String computeEntrypointName = "Compute_Entrypoint";
  String dispatchStatusName = "Dispatch_Status";
  String integerSlangType = "Z";
  String defaultIntegerValue = "z\"0\"";
  String floatSlangType = "F32";
  String defaultFloatValue = "f32\"0.0\"";
  public static String timeSlangType = "Art.Time";
  public static String slangTimestamp = "Art.time()";
  String defaultTimeValue = "s64\"0\"";
  private List<String> featureNames = null;
  private List<String> subcomponentNames = null;


  public BlessBehaviorProvider()
    {
    URL slangURL = getClass().getResource("slang.stg"); 
    System.out.println(slangURL.toExternalForm());
    System.out.println(slangURL.toString());
    System.out.println(slangURL.getFile());
    try
      {
      FileReader fileReader = new FileReader(slangURL.getFile());
      BufferedReader buff = new BufferedReader(fileReader);
      while (buff.ready())
        System.out.println(buff.readLine());
      }
    catch (FileNotFoundException e)
      {
      e.printStackTrace();
      }
    catch (IOException e)
      {
      e.printStackTrace();
      }
    slang_stg = new STGroupFile(slangURL, "UTF-8", '$', '$');
    Injector injector = IResourceServiceProvider.Registry.INSTANCE.
        getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
    injector.injectMembers(this);
    }

//  public BlessBehaviorProvider(SystemInstance si)
//    {
//    this.si = si;
//    Global.context = si;
//    (new BuildComponentInstanceMap()).buildMap(si);    
//    slang_stg = new STGroupFile(getClass().getResource("slang.stg"), "UTF-8", '$', '$');
//    Injector injector = IResourceServiceProvider.Registry.INSTANCE.
//        getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
//    injector.injectMembers(this);
//    }
  
  public void setSystemInstance(SystemInstance si)
    {
    this.si = si;
    Global.context = si;
    (new BuildComponentInstanceMap()).buildMap(si);
    }
 
  class BuildComponentInstanceMap extends InstanceSwitch<Boolean>
    {

    public void buildMap(ComponentInstance ci)
      {
      instances = new HashMap<>();
      feature_types = new HashMap<>();
      this.doSwitch(ci);
      }

    @Override
    public Boolean caseComponentInstance(ComponentInstance ci)
      {
      instances.put(ci.getInstanceObjectPath(), ci);
      for (FeatureInstance f : ci.getFeatureInstances())
        this.doSwitch(f);
      for (ComponentInstance child : ci.getComponentInstances())
        this.doSwitch(child);
      return true;
      }

    @Override
    public Boolean caseFeatureInstance(FeatureInstance fi)
      {

      Feature f = fi.getFeature();

      switch (fi.getCategory())
        {
        case DATA_ACCESS:
        case DATA_PORT:
        case EVENT_DATA_PORT:
        case PARAMETER:
          if (f.getClassifier() instanceof DataClassifier)
            {
            String qn = f.getClassifier().getQualifiedName();
            feature_types.put(qn, (DataClassifier) f.getClassifier());
            }
        default: // do nothing
        }
      return true;
      }

    }  //end of BuildComponentInstanceMap
  
  
  @Override
  public String name()
    {
    return "BLESS Behavior Provider";
    }

  @Override
  public String string()
    {
    return "none";
    }

  public List<org.sireum.String> getPath(ComponentInstance ci)
    {
    List<org.sireum.String> theList = new ArrayList<org.sireum.String>();
    theList.add(new org.sireum.String(ci.getName()));
    EObject parent = ci.eContainer();
    while (parent != null)
      {
      if (parent instanceof NamedElement)
        theList.add(0,new org.sireum.String(((NamedElement)parent).getName()));
      parent = parent.eContainer();
      }
    return theList;
    }
 
  private ST makeSlangFromBLESS(BLESSSubclause bsc, boolean isPeriodic, Classifier c, IS<Z, org.sireum.String> componentDirectory, ComponentInstance ci)
    {
//    BAST ast = ToAST.TOAST.toAST(bsc);
    ST st = slang_stg.getInstanceOf("slangFile");
    String classifierName = c.getQualifiedName();
    NameProvider np = NameUtil.getNameProvider(VisitorUtil.toISZ(getPath(ci)), classifierName, basePackageName);
    String singletonName = np.componentSingletonType();
    UnparseBLESS3.singletonName = singletonName;
    //find timeouts
    FindTimeoutDispatchTriggers fodt = new FindTimeoutDispatchTriggers();
    Set<String> timeouts = fodt.getTimeouts(bsc);

    String source = "// generated by BLESS "+com.multitude.bless.BLESS.versionDate+" at "+Time.todayString+" from "+ classifierName;

    st.add("source", source);
    st.add("packageName", np.packageName());

    st.add("importPackages", "import " + basePackageName + "._");
    st.add("singletonName", singletonName);

  //collect states
    Set<String>   completeStateLabels  = new HashSet<String>();
    String        initialStateLabel    = "";
    Set<String>   executionStateLabels = new HashSet<String>();
    Set<String>   finalStateLabels     = new HashSet<String>();
    if (bsc.getStatesSection() != null)
      {
      for (BehaviorState bs : bsc.getStatesSection().getStates())
        if (bs.isInitial())
          initialStateLabel = bs.getName();
        else if (bs.isComplete())
          completeStateLabels.add(bs.getName());
        else if (bs.isFinal())
          finalStateLabels.add(bs.getName());
        else
          executionStateLabels.add(bs.getName());
      }

  //Complete states   
    StringBuffer sb = new StringBuffer();
    sb.append("\"" + initialStateLabel + "_state\" //initial state");
    for (String completeState : completeStateLabels)
      {
      sb.append("\n\"" + completeState + "_state\" ");
      }
    st.add("states", sb.toString());
    if (executionStateLabels.size() > 0)
      for (String label :executionStateLabels)
        st.add("executionStateLabels", label+"_state");
    else
      st.add("executionStateLabels", "[none]");
    if (finalStateLabels.size() > 0)
      for (String label :finalStateLabels)
        st.add("finalStateLabels", label+"_state");
    else
      st.add("finalStateLabels", "[none]");
    st.add("initialState", initialStateLabel+"_state");

    //tops
    st.add("variables", "var tops: "+timeSlangType+" = "+defaultTimeValue);
    
    st.add("variables", makeVariableDeclarations(bsc, timeouts));
    
    // create Initialize_Entrypoint
    ST m1 = slang_stg.getInstanceOf("methodDef");
    m1.add("methodName", initializeEntrypointName);
    m1.add("args", "api: " + np.apiInitialization());
    m1.add("sep", "\nelse ");
    m1.add("returnType", "Unit");
//    m1.add("body", "api.logDebug(\"executing"+initializeEntrypointName+" of "+singletonName+"\")");  causes "else"
    Vector<BehaviorTransition> initialTransitions = findTransitionsLeavingState(bsc, initialStateLabel);
    sb = new StringBuffer();
    // make timers, if any
//    sb.append(makeTimeouts(ast));
    for (BehaviorTransition trans : initialTransitions)
      {
      ExecuteCondition ec = trans.getExecute();
      String   label     = trans.getName();
      ST ic = slang_stg.getInstanceOf("ifClause");
      ic.add("guard", (ec==null ? "true" : unparser.toST(ec)));
      ic.add("action", "do_"+label+"_"+initialStateLabel+"(api)");
      m1.add("body", ic);
      }
    st.add("methods", m1);


  // Compute_Entrypoint   
    ST compute_entrypoint = make_Compute_Entrypoint( np,  singletonName,  initialStateLabel,
        completeStateLabels, bsc, fodt, timeouts, isPeriodic); 
    st.add("methods", compute_entrypoint);

  //Finalize_Entrypoint
    ST m3 = slang_stg.getInstanceOf("methodDef");
    m3.add("methodName", finalizeEntrypointName);
    m3.add("args", "api: " + np.apiOperational());
    m3.add("returnType", "Unit");
    st.add("methods", m3);
    
  //Recover_Entrypoint
//    m3 = stg.getInstanceOf("methodDef");
//    m3.add("methodName", recoverEntrypointName);
//    m3.add("args", "api: " + np.apiOperational());
//    m3.add("returnType", "Unit");
//    st.add("methods", m3);
//    
//    m3 = stg.getInstanceOf("methodDef");
//    m3.add("methodName", activateEntrypointName);
//    m3.add("args", "api: " + np.apiOperational());
//    m3.add("returnType", "Unit");
//    st.add("methods", m3);
//    
//    m3 = stg.getInstanceOf("methodDef");
//    m3.add("methodName", deactivateEntrypointName);
//    m3.add("args", "api: " + np.apiOperational());
//    m3.add("returnType", "Unit");
//    st.add("methods", m3);
    
    
    //transitions leaving initial state
//    st.add("methods", "//transitions leaving initial state");
    for (BehaviorTransition trans : initialTransitions)
      {
      try
        {
        ST intr = make_do_T(np, trans, completeStateLabels, finalStateLabels, executionStateLabels,
            singletonName, false, initialStateLabel);
        st.add("initialStateMethods", intr);
       } 
      catch (YouIdiot e)   
        { e.handleException(); }
      }
    

    // transitions leaving complete states
    // make defs for all transitions leaving complete states
    for (String completeState : completeStateLabels)
      {
      Vector<BehaviorTransition> transitionsFromCompleteState = findTransitionsLeavingState(bsc, completeState);
      for (BehaviorTransition trans : transitionsFromCompleteState)
        {
        try
          {
          ST completeStateMethod = make_do_T(np, trans, completeStateLabels, finalStateLabels, executionStateLabels,
              singletonName, true, completeState);
          st.add("completeStateMethods", completeStateMethod);
          } catch (YouIdiot e)
          {
          e.handleException();
          }
        }
      } // done with transitions leaving complete states

    // make methods for execution states
//    st.add("methods", "//methods for execution states");
    // get execution states
    for (String executionState : executionStateLabels)
      { // find all transitions leaving this execution state
      ST exst = slang_stg.getInstanceOf("methodDef");
      Vector<BehaviorTransition>   transitions = findTransitionsLeavingState(bsc, executionState);
      exst.add("methodName", "executionState_" + executionState);
      exst.add("args", "api: " + np.apiOperational());
      exst.add("returnType", "Unit");
      exst.add("sep", "\nelse ");
      // make alternative that selects a transition
      for (BehaviorTransition trans : transitions)
        {
        ST ifClause = slang_stg.getInstanceOf("ifClause");
        ifClause.add("guard", unparser.toST(trans.getExecute()));
        ifClause.add("action", "do_"+trans.getName()+ "_" + executionState + "(api)");
        exst.add("body", ifClause);
        } // done with all transition alternatives
      st.add("executionStateMethods", exst);

      // make methods for transitions leaving this execution state
      for (BehaviorTransition trans : transitions)
        {
        ST trst = slang_stg.getInstanceOf("methodDef");
        String methodName = "do_" + trans.getName()+ "_" + executionState;
        trst.add("methodName", methodName);
        trst.add("args", "api: " + np.apiOperational());
        trst.add("returnType", "Unit");
        ST actions = slang_stg.getInstanceOf("actions");
        actions.add("a", "api.logDebug(\"executing "+methodName+"\")\n");
        BehaviorActions action = trans.getActions();
        if (action != null)
          actions.add("a", unparser.toST(action));
        // is destination complete? destination is 4th child
        String destination = trans.getDestination().getName();
        if (completeStateLabels.contains(destination))
          actions.add("a", "currentState = "+singletonName+".CompleteStates." + destination
              + "_state  //destination is complete state " + destination);
        else if (finalStateLabels.contains(destination))
          actions.add("a", finalizeEntrypointName + "(api)  //destination is final state " + destination);
        else if (executionStateLabels.contains(destination))
          actions.add("a", "executionState_" + destination + "(api)  //destination is execution state " + destination);
        trst.add("body", actions);
        st.add("executionStateMethods", trst);
        } // done making methods for transitions leaving this execution state
      } // done with all execution states
    
    //add subprogram subcomponents
    if ((ci.getComponentInstances() != null) && (ci.getComponentInstances().size() > 0))
      {
      ST subprograms = slang_stg.getInstanceOf("makeSubprograms");
      subprograms.add("singletonName", singletonName);
      for (ComponentInstance elt : ci.getComponentInstances())
        if (elt.getClassifier() instanceof SubprogramType)
          {
          SubprogramType sub = (SubprogramType) elt.getClassifier();
          ST subST = slang_stg.getInstanceOf("aSubprogram");
          subST.add("subcomponentName", elt.getName());
          for (Parameter p : sub.getOwnedParameters())
            if (p.isIn())
            {  //add it to the subprogram parameters
            boolean isEnum = (GetProperties.getDataRepresentation(p.getClassifier()) != null) 
                && GetProperties.getDataRepresentation(p.getClassifier()).getName().equalsIgnoreCase("Enum");
            String label = p.getName();
            String itsType = np.packageName()+"."+p.getClassifier().getName()+
                (isEnum ? ".Type" : "");
            subST.add("inputs", label+" : "+itsType);
            }
            else if (p.isOut())
              {  //this is the result
              boolean isEnum = (GetProperties.getDataRepresentation(p.getClassifier()) != null) 
                && GetProperties.getDataRepresentation(p.getClassifier()).getName().equalsIgnoreCase("Enum");
              String itsType = np.packageName()+"."+p.getClassifier().getName()+ (isEnum ? ".Type" : "");
              subST.add("result", itsType);
              }
          subprograms.add("subs", subST);
          }
      st.add("subprograms", subprograms);
      }

    return st;
    }  //end of makeSlangFromBLESS

//  private BAST toSlangExp(BAST exp)
//    {
//    BAST e2=exp.dupTree();
//    ToSlangExp normalizePattern = new ToSlangExp(new CommonTreeNodeStream(e2));
//    normalizePattern.setTreeAdaptor(new BASTTreeAdaptor());
//    normalizePattern.featureNames = featureNames;
//    return (BAST)normalizePattern.downup(e2,false);
//    }

  private ST toSlangExp(Expression e)
    {
    return unparser.toST(e);
    }
  
  private Vector<BehaviorTransition> findTransitionsLeavingState(BLESSSubclause bsc, String state)
    {
    Vector<BehaviorTransition>   transitions = new Vector<BehaviorTransition>();
    if (bsc.getTransitions() != null)
      {
      for (BehaviorTransition bt : bsc.getTransitions().getBt())
        for (BehaviorState source : bt.getSources())
          if (source.getName().equals(state))
            transitions.add(bt);
      }
    return transitions;
    } // end of findTransitionsLeavingState


//private String makeTimeouts(BAST ast)
//  {
//  StringBuffer sb = new StringBuffer();
//  // find all timeout clauses, put in Set
//  BAST newRoot = ast.dupTree();
//  GetTimeoutDispatchTriggers treePattern = new GetTimeoutDispatchTriggers(new CommonTreeNodeStream(newRoot));
//  treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//  treePattern.downup(newRoot);
//
//  Map<String,TimeoutRecord> timeouts = new HashMap<String,TimeoutRecord>();
//  for (BAST b : treePattern.s)
//    {
//    TimeoutRecord tr = new TimeoutRecord(b);
//    if (!timeouts.containsKey(tr.timeoutPortId))
//      timeouts.put(tr.timeoutPortId, tr);
//    }
//  //remove any duplicates??  (does Set already drop duplicates?)
//  for (TimeoutRecord t : timeouts.values())
//    {
//    ST tost = slang_stg.getInstanceOf("makeTimeout");
//    tost.add("name", t.timeoutPortId);
//    tost.add("portSet", t.getPortSet());
//    sb.append(tost.render()+"\n");
//    }
//  return sb.toString();
//  }  //end of makeTimeouts

private ST make_do_T(NameProvider np, BehaviorTransition transition, Set<String> completeStateLabels, Set<String> finalStateLabels,
    Set<String> executionStateLabels, String singletonName, boolean opInit, String source) throws YouIdiot
  {
  ST completeStateMethod = slang_stg.getInstanceOf("methodDef");
  String label = transition.getName();
  completeStateMethod.add("methodName", "do_" + label + "_" + source);
  completeStateMethod.add("args", "api: " + (opInit ? np.apiOperational() : np.apiInitialization()));
  completeStateMethod.add("returnType", "Unit");
  ST body = slang_stg.getInstanceOf("actions");
  body.add("a", "api.logDebug(\"executing "+label+"\")\n");
  BehaviorActions action = transition.getActions();
  if (action != null)
    body.add("a", unparser.toST(action));
  else
    body.add("a", "//no action");
  String destination = transition.getDestination().getName();
  // is destination complete state?
  if (completeStateLabels.contains(destination))
    {
    body.add("a", "//set currentState to destination complete state " + destination);
    body.add("a", "currentState = "+singletonName+".CompleteStates." + destination + "_state");
    }
  else if (executionStateLabels.contains(destination))
    {
    body.add("a", "//the destination is execution state " + destination);
    body.add("a", "executionState_" + destination + "(api)");
    }
  else if (finalStateLabels.contains(destination))
    {
    body.add("a", "//the destination is final state " + destination);
    body.add("a", finalizeEntrypointName + "(api)");
    }
  else
    {
    throw new YouIdiot("state \"" + destination + "\" not found in complete, execution or final states");
    }
  completeStateMethod.add("body", body);
  return completeStateMethod;
  } // end of make_do_T

private ST make_Compute_Entrypoint(NameProvider np, String singletonName, String initialStateLabel,
    Set<String> completeStateLabels, BLESSSubclause bsc, FindTimeoutDispatchTriggers fodt, Set<String> timeouts,
    boolean isPeriodic)
  {
  ST m2 = slang_stg.getInstanceOf("methodDef");
  m2.add("methodName", computeEntrypointName); // (isPeriodic?timeTriggeredEntrypointName:computeEntrypointName));
  m2.add("sep", "\n");
  m2.add("args", "api: " + np.apiOperational());
  m2.add("returnType",  "B");
  if (!isPeriodic)
    m2.add("args", dispatchStatusName+": Set[art.Art.PortId]");
//for (String s : timeouts)
//  m2.add("args", s+": B");
  m2.add("body", "api.logDebug(\"executing "+computeEntrypointName+" of "+singletonName+"\")");
  m2.add("body", "var retval : B = F");

  ST ms = slang_stg.getInstanceOf("matchStatement");
  ms.add("case", "currentState");
// must have choice for initial state
  ST icc = slang_stg.getInstanceOf("caseClause");
  icc.add("t", singletonName + ".CompleteStates." + initialStateLabel + "_state");
  icc.add("action", "return T //initial state, do nothing ");
  ms.add("clauses", icc);
  for (String completeState : completeStateLabels)
    {
    // get all transitions leaving this complete state
    ST                           cc          = slang_stg.getInstanceOf("caseClause");
    Vector<BehaviorTransition>   transitions = findTransitionsLeavingState(bsc, completeState);
    cc.add("t", singletonName + ".CompleteStates." + completeState + "_state");
    for (BehaviorTransition trans : transitions)
      { // get transition condition
      DispatchCondition   dc       = trans.getDispatch();
      ST                  ifClause = slang_stg.getInstanceOf("ifClause");
      ifClause.add("guard", unparser.toST(dc));
      ifClause.add("action", "do_" + trans.getName()+ "_" + completeState + "(api)");
      ifClause.add("action", "retval = T");
      cc.add("action", ifClause);
      } // done with transition
    ms.add("clauses", cc);
    } // done with all complete states
//ST rc = slang_stg.getInstanceOf("caseClause");
//rc.add("t", "_");
//rc.add("action", "return F");
//ms.add("clauses", rc);
  m2.add("body", ms);

  //set durations of timeouts in Bridge
  for (String timeoutID : timeouts)
    {
    DispatchTrigger dt = fodt.timeout_map.get(timeoutID);
    BehaviorTime bt = dt.getTime();
    String exp = "";
    if (bt.getQuantity() != null)
      exp = unparser.toST(bt.getQuantity().getNumber()).render();  // + typeUtil.convertQuantityToArtTime(bt.getQuantity());
    else if (bt.getValue() != null)
      exp = unparser.toST(bt.getValue()).render();
//    else if (bt.getDuration() != null)
//      exp = unparser.toST(bt.getDuration()).render();
    String timeoutAssignment = np.bridge()+"."+timeoutID+"_Duration = "+exp;
    m2.add("body", timeoutAssignment);
    }
  
  m2.add("body", "return retval");
  return m2;
  }  //end of make_Compute_Entrypoint

private ST makeVariableDeclarations(BLESSSubclause bsc, Set<String> timeouts)
  {
  ST decs = slang_stg.getInstanceOf("actions");

  if (bsc.getVariables() == null)
    decs.add("a", "// no local variables");
  else
    for (VariableDeclaration vd : bsc.getVariables().getBehavior_variables())
      {
      String    variableID          = vd.getVariable().getName();
      String    typeID              = "";
      String    dataComponent       = "";
      String    initializationValue = "";
//      boolean   unparseANTLR        = false;
      if (vd.getVariable().getTod().getTy() != null && vd.getVariable().getTod().getTy() instanceof QuantityType)
        {
        QuantityType qt = (QuantityType) vd.getVariable().getTod().getTy();
        if (unitUtil == null)
          {
          dataComponent         = "null UnitUtil";
          initializationValue   = "null UnitUtil";
          }
        else if ((qt.getUnit() != null) && unitUtil.hasTimeUnit(qt.getUnit()))
          {
          dataComponent         = timeSlangType;
          initializationValue   = defaultTimeValue;
          }
        else if (qt.getWhole() != null)
          { // it's an integer
          dataComponent         = integerSlangType;
          initializationValue   = (vd.getExpression() != null ? toSlangExp(vd.getExpression()).render() : defaultIntegerValue);
          }
        else
          {
          dataComponent         = floatSlangType;
          initializationValue   = (vd.getExpression() != null ? toSlangExp(vd.getExpression()).render() : defaultFloatValue);
          }
        }
      else
        {
        typeID = (vd.getVariable().getTod().getRef() != null ? vd.getVariable().getTod().getRef().getName()
            : vd.getVariable().getTod().toString());
        boolean isEnum = (vd.getVariable().getTod().getRef() != null && vd.getVariable().getTod().getRef()
            .getType() instanceof EnumerationType);
        if (typeID.equalsIgnoreCase("time"))
          {
          dataComponent         = timeSlangType;
          initializationValue   = (vd.getExpression() != null ? toSlangExp(vd.getExpression()).render() : defaultTimeValue);
          }
        else if (BlessMaps.dataComponentMapContainsKey(typeID))
          {
          dataComponent = BlessMaps.dataComponentMapGet(typeID) + (isEnum ? ".Type" : "");
          if (isEnum)
            {
            if ((vd.getExpression() != null) && (vd.getExpression() instanceof EnumerationValue))
              initializationValue = BlessMaps.dataComponentMapGet(typeID) + "." + ((EnumerationValue) vd
                  .getExpression()).getEnumeration_value();
            else
              initializationValue = BlessMaps.dataComponentMapGet(typeID) + "." + ((EnumerationType) vd.getVariable()
                  .getTod().getRef().getType()).getDefining_enumeration_literal().get(0);
            }
          else
            initializationValue = (vd.getExpression() != null ? toSlangExp(vd.getExpression()).render()
                : dataComponent + ".example()");
          }
//        else
//          {
//          unparseANTLR = true;
//          decs.add("a", "Please don't use ANTLR unparser!");
//          }
        }
//      if (unparseANTLR)
//        {
//        BAST     bvd = ToAST.TOAST.toAST(vd);
//        String   vardec;
//        try
//          {
//          vardec = bvd.unparse();
//          decs.add("a", vardec);
//          }
//        catch (YouIdiot e)
//          {
//          e.handleException();
//          }
//        }
//      else
        decs.add("a", "var " + variableID + ": " + dataComponent + " = " + initializationValue);
      }
//add timeout PortID
  if (timeouts.size() > 0)
    {
    decs.add("a", "var timeout_id : Art.PortId = Art.PortId.fromZ(Art.numPorts - "+(BlessEntrypointProvider.numTO+1)+")");
    int portNumber = 1;
    for (String s : timeouts)
      {
      decs.add("a", "val " + s + "_Id : Art.PortId = timeout_id+Art.PortId.fromZ(" + portNumber++ +")");
      }
    }
  return decs;
  } // end of makeVariableDeclarations

@Override
public boolean $clonable()
  {
  return true;
  }

@Override
public MutableMarker $clonable_$eq(boolean b)
  {
  return this;
  }

@Override
public MutableMarker $clone()
  {
  return this;
  }

@Override
public boolean $owned()
  {
  return false;
  }

@Override
public MutableMarker $owned_$eq(boolean b)
  {
  return this;
  }

@Override
public boolean canHandleBehaviorProvider(AadlThreadOrDevice component, IS<Z, AnnexClauseInfo> resolvedAnnexSubclauses)
  {
    List<Annex> annexes = scala.collection.JavaConverters.seqAsJavaListConverter(component.annexes().elements()).asJava();
    for(Annex a : annexes) {
      if(a.name().equalsIgnoreCase("BLESS")) //||a.name().equalsIgnoreCase("Action")) 
        return true;
    }
    return false;
  }

@Override
public IS<Z, FileResource> handleBehaviorProvider(AadlThreadOrDevice component,
    IS<Z, AnnexClauseInfo> resolvedAnnexSubclauses, String suggestedFilename,
    IS<Z, org.sireum.String> componentDirectory, SymbolTable symbolTable, AadlTypes aadlTypes, Reporter reporter)
  {
    ComponentInstance cinst = instances.get(component.pathAsString("."));
    Classifier c = cinst.getComponentClassifier();
    unparser.classifier = c;
    EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol((NamedElement)c);
    boolean isPeriodic = (dispatchProtocol==null ? false : (dispatchProtocol.getName().endsWith("Periodic")||dispatchProtocol.getName().endsWith("Hybrid")));

    org.sireum.ST returnST = org.sireum.hamr.codegen.CodeGenJavaFactory.stringToST("// empty "+suggestedFilename);
    if (!LoadBLESS.haveLoaded)
      try
        {
        LoadBLESS.load();
        } catch (YouIdiot e1)
        {
        e1.handleException();
        }

    List<BLESSSubclause> bas = EcoreUtil2.eAllOfType(c, BLESSSubclause.class);
    assert bas.size() < 2 : "BLESS only allows one subclause per component but " + component.pathAsString(".")
      + " has " + bas.size() + " BLESS subclauses.  \n If you want to have different BLESS behaviors in different modes, do it in the architecture.";
        
    for(BLESSSubclause bsc : bas)
      {  //should be at most one
      returnST = org.sireum.hamr.codegen.CodeGenJavaFactory.stringToST(makeSlangFromBLESS(bsc, isPeriodic, c, componentDirectory, cinst).render(Global.wrapLength));
      }
    
    return VisitorUtil.toISZ(IResource$.MODULE$.apply( suggestedFilename, returnST, VisitorUtil.toISZ(), true, false, false, false));
  }


}  //end of BlessBehaviorProvider
