package com.multitude.aadl.bless.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.serializer.ISerializer;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.annexsupport.AnnexUnparser;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class ActionAnnexUnparser implements AnnexUnparser
  {
  @Inject
  ISerializer serializer;

  public ActionAnnexUnparser() {
    Injector injector = IResourceServiceProvider.Registry.INSTANCE
        .getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
    injector.injectMembers(this);
  }

  @Override
  public String unparseAnnexLibrary(AnnexLibrary library, String indent)
    {
    return null;
    }

  @Override
  public String unparseAnnexSubclause(AnnexSubclause subclause, String indent)
    {
    subclause.setName("Action");
    return serializer.serialize(subclause);
    }

  }
