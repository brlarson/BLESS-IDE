package com.multitude.aadl.bless.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.annexsupport.AnnexUnparser;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.BLESSSubclause;
import com.multitude.aadl.bless.bLESS.BehaviorActions;
import com.multitude.aadl.bless.bLESS.Expression;

public class BlessAnnexUnparser implements AnnexUnparser {
	@Inject
	ISerializer serializer;

	public static BlessAnnexUnparser eINSTANCE;
	
	public BlessAnnexUnparser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
		injector.injectMembers(this);
		eINSTANCE = this;
	}

	@Override
	public String unparseAnnexLibrary(AnnexLibrary library, String indent) {
		// We are only called if it is the actual parsed annex, not the DefaultAnnexLibrary
		return serializer.serialize(library);
	}

	@Override
	public String unparseAnnexSubclause(AnnexSubclause subclause, String indent) {
		// We are only called if it is the actual parsed annex, not the DefaultAnnexLibrary
		subclause.setName("BLESS");
		if (subclause instanceof BLESSSubclause)
		  {
		  BLESSSubclause bsc = (BLESSSubclause)subclause;
		  if ((bsc.getAssert_clause()==null) && (bsc.getInvariant()==null) && (bsc.getStatesSection()==null) 
		      && (bsc.getTransitions()==null) && (bsc.getVariables()==null))
		    return "";
		  return serializer.serialize(bsc);
		  }
		else return "";
	}
  
  public String unparseBehaviorActions(BehaviorActions actions, String indent)
  {
  return serializer.serialize(actions);
  }
  
  public String unparseExpression(Expression exp, String indent)
  {
  return serializer.serialize(exp);
  }
}