package com.multitude.aadl.bless.linking;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.BlessControl;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.osate.annexsupport.AnnexLinkingService;

@SuppressWarnings("all")
public class BlessAnnexLinkingService implements AnnexLinkingService {
  @Inject
  private ILinkingService linkingService;

  @Inject
  private IQualifiedNameProvider nameProvider;

  @Inject
  private ResourceDescriptionsProvider rdp;

  public BlessAnnexLinkingService() {
    final Injector injector = IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(URI.createFileURI("dummy.bless")).<Injector>get(Injector.class);
    injector.injectMembers(this);
  }

  protected ILinkingService getLinkingService() {
    if ((this.linkingService == null)) {
      BlessControl.println("BlessAnnexLinkingService did not get injected ILinkingService");
    }
    return this.linkingService;
  }

  protected IQualifiedNameProvider getNameProvider() {
    if ((this.nameProvider == null)) {
      BlessControl.println("BlessAnnexLinkingService did not get injected IQualifiedNameProvider");
    }
    return this.nameProvider;
  }

  protected ResourceDescriptionsProvider getResourceDescriptionsProvider() {
    if ((this.rdp == null)) {
      BlessControl.println("BlessAnnexLinkingService did not get injected ResourceDescriptionsProvider");
    }
    return this.rdp;
  }

  @Override
  public QualifiedName getFullyQualifiedName(final EObject obj) {
    return this.getNameProvider().getFullyQualifiedName(obj);
  }

  @Override
  public List<EObject> resolveAnnexReference(final String annexName, final EObject context, final EReference reference, final INode node) {
    boolean _equalsIgnoreCase = annexName.equalsIgnoreCase("BLESS");
    if (_equalsIgnoreCase) {
      return this.linkingService.getLinkedObjects(context, reference, node);
    } else {
      return Collections.<EObject>emptyList();
    }
  }
}
