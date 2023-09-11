//FindTimeoutDispatchTriggers.java


package com.multitude.bless.codegeneration.bless2hamr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.NamedElement;
//import org.sireum.aadl.osate.bless2air.UnparseToSlang;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorTransition;
import com.multitude.aadl.bless.bLESS.DispatchConjunction;
import com.multitude.aadl.bless.bLESS.DispatchExpression;
import com.multitude.aadl.bless.bLESS.DispatchTrigger;
import com.multitude.aadl.bless.bLESS.Transitions;
import com.multitude.aadl.bless.bLESS.util.BLESSSwitch;

public class FindTimeoutDispatchTriggers extends BLESSSwitch<Boolean>
  {
  @Inject private UnparseToSlang unparser; 

  Set<DispatchTrigger> dts;
  public Set<String> tos;
  public Map<String, DispatchTrigger> timeout_map = new HashMap<String, DispatchTrigger>();
  STGroupFile slang_stg = new STGroupFile(getClass().getResource("slang.stg"), "UTF-8", '$', '$');

  FindTimeoutDispatchTriggers()
  {
  Injector injector = IResourceServiceProvider.Registry.INSTANCE.
      getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
  injector.injectMembers(this);
  }
  
  public Set<String> getTimeouts(BLESSSubclause bsc)
    {
    dts = new HashSet<DispatchTrigger>();
    tos = new HashSet<String>();
    this.doSwitch(bsc);
    char ch = '0';
    for (DispatchTrigger dt : dts)
      {
      String label = unparser.makeTimeoutID(dt);
      tos.add(label);
      timeout_map.put(label, dt);
      }
    return tos;
    }

  @Override
  public Boolean caseBLESSSubclause(BLESSSubclause object)
    {
    this.doSwitch(object.getTransitions());
    return true;
    }
  
  @Override
  public Boolean caseTransitions(Transitions object)
    {
    for (BehaviorTransition bt : object.getBt())
      if ((bt.getDispatch() != null) && (bt.getDispatch().getDe() != null))
        this.doSwitch(bt.getDispatch().getDe());
    return true;
    }
  
  @Override
  public Boolean caseDispatchExpression(DispatchExpression object)
    {
    for (DispatchConjunction dc : object.getDc())
      this.doSwitch(dc);
    return true;
    }
  
  @Override
  public Boolean caseDispatchConjunction(DispatchConjunction object)
    {
    for (DispatchTrigger trigger : object.getTrigger())
      this.doSwitch(trigger);
    return true;
    }
  
  @Override
  public Boolean caseDispatchTrigger(DispatchTrigger object)
    {
    if (object.getTimeout() != null)
      dts.add(object);
    return true;
    }

  }
