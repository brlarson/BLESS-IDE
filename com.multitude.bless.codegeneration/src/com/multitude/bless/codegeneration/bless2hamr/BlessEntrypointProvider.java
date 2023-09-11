//BlessEntrypointProvider.java

//insert calls to entry points into component's bridge


package com.multitude.bless.codegeneration.bless2hamr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.DirectionType;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.xtext.aadl2.properties.util.GetProperties;
import org.sireum.IS;
import org.sireum.ST;
import org.sireum.Z;
import org.sireum.$internal.MutableMarker;
import org.sireum.aadl.osate.hamr.plugin.OSATECodegenPlugin;
import org.sireum.aadl.osate.util.SlangUtil;
import org.sireum.aadl.osate.util.VisitorUtil;
import org.sireum.hamr.arsit.Port;
import org.sireum.hamr.arsit.ProjectDirectories;
import org.sireum.hamr.arsit.templates.EntryPointTemplate;
import org.sireum.hamr.arsit.util.ArsitOptions;
import org.sireum.hamr.codegen.common.symbols.AadlThreadOrDevice;
import org.sireum.hamr.codegen.common.symbols.AnnexClauseInfo;
import org.sireum.hamr.codegen.common.symbols.SymbolTable;
import org.sireum.hamr.codegen.common.types.AadlTypes;
import org.sireum.hamr.codegen.common.util.NameUtil.NameProvider;
import org.sireum.hamr.ir.Annex;
import org.sireum.message.Reporter;
import org.stringtemplate.v4.STGroupFile;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.DispatchTrigger;

public class BlessEntrypointProvider implements org.sireum.hamr.arsit.plugin.EntryPointProviderPlugin,
    org.sireum.hamr.arsit.plugin.ArsitConfigurationProvider, OSATECodegenPlugin
  {
  @Inject private UnparseToSlang unparser; 

  SystemInstance si; 
  STGroupFile slang_stg;
  
  public BlessEntrypointProvider() 
    {
    slang_stg = new STGroupFile(getClass().getResource("slang.stg"), "UTF-8", '$', '$');
    Injector injector = IResourceServiceProvider.Registry.INSTANCE.
        getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
    injector.injectMembers(this);
    }
  
//  public BlessEntrypointProvider(SystemInstance si) 
//    {
//    this.si = si;
//    slang_stg = new STGroupFile(getClass().getResource("slang.stg"), "UTF-8", '$', '$');
//    Injector injector = IResourceServiceProvider.Registry.INSTANCE.
//        getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
//    injector.injectMembers(this);
//    }
  
  public void setSystemInstance(SystemInstance si)
    {
    this.si = si;
    }

  public static int numTO = 0;  //number of timeouts, plus one

  @Override
  public org.sireum.Z addPortIds()
    {
    return SlangUtil.toZ(numTO+2);
    }
        
  @Override
  public String name()
    {
    return "BlessEntrypointProvider";
    }

  @Override
  public String string()
    {
    return this.toString();
    }

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
  public boolean canHandleEntryPointProvider(AadlThreadOrDevice component,
      IS<Z, AnnexClauseInfo> resolvedAnnexSubclauses, ArsitOptions arsitOptions, SymbolTable symbolTable,
      AadlTypes aadlTypes)
    {
      List<Annex> annexes = scala.collection.JavaConverters.seqAsJavaListConverter(component.annexes().elements()).asJava();
      for(Annex a : annexes) {
        if(a.name().equalsIgnoreCase("BLESS")) 
          return true;
      }
    return false;
    }

  @Override
  public EntryPointContributions handleEntryPointProvider(AadlThreadOrDevice component, NameProvider nameProvider,
      IS<Z, Port> ports, IS<Z, AnnexClauseInfo> resolvedAnnexSubclauses, EntryPointTemplate entryPointTemplate,
      SymbolTable symbolTable, AadlTypes aadlTypes, ProjectDirectories projectDirectories, Reporter reporter)
    {
    // set String Template for Slang
//    try
//      {
//      if (Global.Slangtemplates == null)
//        {
//        Global.Slangtemplates = Util.loadStringTemplateGroup(Global.stringTemplateGroupFolder + "Slang.stg");
//        }
//      Global.templates = Global.Slangtemplates;
//      Global.usingSlangStringTemplateGroup = true;
//      Global.usingBLESSStringTemplateGroup = false;
//      }
//    catch (YouIdiot e1)
//      {
//      e1.handleException();
//      }

    String packageName = nameProvider.aadlPackage();
    String slangComponentName = nameProvider.componentSingletonType();
    String bridgeID = slangComponentName+"_Bridge"; // nameProvider.bridgeIdentifier();
    ComponentInstance cinst = BlessBehaviorProvider.instances.get(component.pathAsString("."));
    Classifier c = cinst.getComponentClassifier();
    unparser.classifier = c;
    
    //make map of feature identifier to direction
    Map<String,String> directionMap = new HashMap<String,String>();
    for (FeatureInstance f : cinst.getAllFeatureInstances())
      {
      directionMap.put(f.getName(), (f.getFlowDirection().equals(DirectionType.IN)?"In":"Out"));
      }
  
    //make timeout parameters for Compute_Entrypoint
    List<BLESSSubclause> bas = EcoreUtil2.eAllOfType(c, BLESSSubclause.class);
    assert bas.size() == 1 : "BLESS only allows one subclause per component but " + component.pathAsString(".")
      + " has " + bas.size() + " BLESS subclauses.  \n If you want to have different BLESS behaviors in different modes, do it in the architecture.";
    BLESSSubclause bsc = bas.get(0);
    
    //make timeout timers
    FindTimeoutDispatchTriggers fodt = new FindTimeoutDispatchTriggers();
    Set<String> timeouts = fodt.getTimeouts(bsc);
    numTO = timeouts.size();
    addPortIds();  //transmit the additional number of port IDs needed for timeouts
    StringBuffer callbackclasses = new StringBuffer(numTO>0 ? "//timeout callback classes\n" : "");
    StringBuffer timeoutvars = new StringBuffer(numTO>0 ? "//timeout variables\n" : "");
    org.stringtemplate.v4.ST callbackmethods = slang_stg.getInstanceOf("actions");
    if (numTO > 0)
      callbackmethods.add("a", "//timeout callback methods");
    int portNumber = 1; 
    for (String timeoutID : timeouts)
      {
//      DispatchTrigger dt = fodt.timeout_map.get(timeoutID);
//      if (dt != null)
//        timeouttasks.append("// for "+ unparser.toST(dt).render()+"\n");
      org.stringtemplate.v4.ST cbc = slang_stg.getInstanceOf("callbackclass");
      cbc.add("timeoutID", timeoutID);
      callbackclasses.append(cbc.render()+"\n");
      org.stringtemplate.v4.ST tv = slang_stg.getInstanceOf("timeoutVars");
      tv.add("timeoutID", timeoutID);
      tv.add("portNumber", portNumber++);
      timeoutvars.append(tv.render()+"\n");
      org.stringtemplate.v4.ST cbm = slang_stg.getInstanceOf("callbackmethod");
      callbackmethods.add("a", cbm.add("timeoutID", timeoutID).render());
      }
    
    
    EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol((NamedElement)c);
    boolean isPeriodic = (dispatchProtocol==null ? false : (dispatchProtocol.getName().endsWith("Periodic")||dispatchProtocol.getName().endsWith("Hybrid")));

    
    IS<Z, org.sireum.String> imports = VisitorUtil.toISZ(
//        new org.sireum.String("org.sireum._"),
//        new org.sireum.String("art._"),new org.sireum.String("bless._"),
//        new org.sireum.String("bless."+packageName+".{"+slangComponentName+" => component}"),
        new org.sireum.String("org.sireum.S64._"));
    
    IS<Z, org.sireum.String> blocks = VisitorUtil.toISZ(new org.sireum.String("// I'm a companion object block"),
        new org.sireum.String(slang_stg.getInstanceOf("contains").add("typ", "Art.PortId").render()),
        new org.sireum.String("var event_set : Set[Art.PortId] = Set.empty[Art.PortId]"),
        new org.sireum.String("var timeout_id : Art.PortId = Art.PortId.fromZ(Art.numPorts - "+(numTO+1)+")"),
        new org.sireum.String(timeoutvars.toString()),
        new org.sireum.String(callbackclasses.toString())
        );

// IF THIS WASN'T IMMUTABLE IT WOULD BE EASY TO ADD VARIABLES FOR TIMEOUTS!
    IS<Z, org.sireum.String> epblocks = 
        VisitorUtil.toISZ(
            new org.sireum.String(callbackmethods.render())
            );
    
//    org.sireum.Option<org.sireum.String> none = SlangUtil.toNone();

    org.sireum.Option<org.sireum.String> activateBody = SlangUtil.toSome(new org.sireum.String("// i'm an activate body"));

    //start initialize body template
    org.stringtemplate.v4.ST ib = slang_stg.getInstanceOf("initializeBody");
    ib.add("bridgeID", bridgeID);

//make def compute()  
    org.sireum.Option<org.sireum.String> computeBody      = SlangUtil.toNone();
    if (isPeriodic)
      {
      org.stringtemplate.v4.ST pcb = slang_stg.getInstanceOf("periodicComputeBody");
      computeBody = SlangUtil.toSome(new org.sireum.String(pcb.render()));
      }
    else
      {
      org.stringtemplate.v4.ST cb = slang_stg.getInstanceOf("computeBody");
      cb.add("bridgeID", bridgeID);
      for (String t : timeouts)
        {
        DispatchTrigger          dt  = fodt.timeout_map.get(t);
        org.stringtemplate.v4.ST lor = slang_stg.getInstanceOf("l_or");
        for (NamedElement p : dt.getPorts())
          {
          org.stringtemplate.v4.ST gv = slang_stg.getInstanceOf("eventSet");
          gv.add("portID", p.getName());
          gv.add("inout", directionMap.get(p.getName()));
          lor.add("bs", gv);
          }
        org.stringtemplate.v4.ST ifc = slang_stg.getInstanceOf("ifClause");
        ifc.add("guard", lor);
        org.stringtemplate.v4.ST sched = slang_stg.getInstanceOf("scheduleTrait");
        sched.add("timeoutID", t);
        ifc.add("action", sched);
        cb.add("schedules", ifc);
        //add to initialize body too
        ib.add("schedules", ifc);
       }
      computeBody = SlangUtil.toSome(new org.sireum.String(cb.render()));
      }
    
    //now render the initialize body template
    org.sireum.Option<org.sireum.String> initializeBody = SlangUtil.toSome(new org.sireum.String(ib.render()));
    
    org.sireum.Option<org.sireum.String> deactivateBody = SlangUtil.toSome(new org.sireum.String("// i'm a deactivate body"));

    org.sireum.Option<org.sireum.String> finalizeBody = SlangUtil.toSome(new org.sireum.String("// i'm a finalize body\n"+
        "Art.receiveInput(eventInPortIds, dataInPortIds)\n"+
        "component.Finalize_Entrypoint(operational_api)"));
    org.sireum.Option<org.sireum.String> recoverBody = SlangUtil.toSome(new org.sireum.String("// i'm a recover body"));
    ST ep = entryPointTemplate.generateCustom(epblocks, activateBody, initializeBody, initializeBody, computeBody, 
        computeBody, deactivateBody, finalizeBody, recoverBody);
    
    EntryPointContributions ret = EntryPointContributions$.MODULE$.apply(imports, blocks, ep, VisitorUtil.toISZ());
    //restore BLESS.stg
//    Global.templates = Global.BLESStemplates;
//    Global.usingSlangStringTemplateGroup = false;
//    Global.usingBLESSStringTemplateGroup = true;
    
    return ret;
    }

  }
