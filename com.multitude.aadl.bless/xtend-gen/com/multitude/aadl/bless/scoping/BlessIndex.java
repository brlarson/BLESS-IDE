package com.multitude.aadl.bless.scoping;

import com.google.common.collect.Iterables;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.multitude.aadl.bless.BLESSRuntimeModule;
import com.multitude.aadl.bless.bLESS.BLESSPackage;
import com.multitude.aadl.bless.bLESS.GhostVariable;
import com.multitude.aadl.bless.bLESS.NamedAssertion;
import com.multitude.aadl.bless.bLESS.RootDeclaration;
import com.multitude.aadl.bless.bLESS.TypeDeclaration;
import com.multitude.aadl.bless.bLESS.UnitDeclaration;
import com.multitude.aadl.bless.bLESS.UnitExtension;
import com.multitude.aadl.bless.bLESS.UnitName;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class BlessIndex {
  @Inject
  private ResourceDescriptionsProvider rdp;

  @Inject
  private IContainer.Manager cm;

  private ResourceSet rs;

  public UnitName findUnitNameFromString(final EObject context, final String s) {
    String _xifexpression = null;
    boolean _equals = s.equals("sec");
    if (_equals) {
      _xifexpression = "s";
    } else {
      _xifexpression = s;
    }
    final String s2 = _xifexpression;
    Iterable<UnitName> _visibleUnitNames = this.getVisibleUnitNames(context.eResource());
    for (final UnitName un : _visibleUnitNames) {
      String _name = un.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        boolean _equals_1 = un.getName().equals(s2);
        if (_equals_1) {
          return un;
        }
      }
    }
    return null;
  }

  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjects();
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }

  public Iterable<IEObjectDescription> getVisibleEObjectDescriptions(final EObject o, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer container) -> {
      return container.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(o), _function));
  }

  public Iterable<Exception> getVisibleExceptions(final Resource o) {
    Iterable<Exception> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o);
      final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
        return it.getEObjectOrProxy();
      };
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, o);
      };
      _xblockexpression = Iterables.<Exception>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getException()), _function), _function_1), Exception.class);
    }
    return _xblockexpression;
  }

  public Iterable<GhostVariable> getVisibleGhostVariables(final Resource o) {
    Iterable<GhostVariable> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o);
      final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
        return it.getEObjectOrProxy();
      };
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, o);
      };
      _xblockexpression = Iterables.<GhostVariable>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getGhostVariable()), _function), _function_1), GhostVariable.class);
    }
    return _xblockexpression;
  }

  public Iterable<NamedAssertion> getVisibleNamedAssertions(final Resource o) {
    Iterable<NamedAssertion> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o);
      final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
        return it.getEObjectOrProxy();
      };
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, o);
      };
      _xblockexpression = Iterables.<NamedAssertion>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getNamedAssertion()), _function), _function_1), NamedAssertion.class);
    }
    return _xblockexpression;
  }

  public Iterable<TypeDeclaration> getVisibleTypeDeclarations(final Resource o) {
    Iterable<TypeDeclaration> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o);
      final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
        return it.getEObjectOrProxy();
      };
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, o);
      };
      _xblockexpression = Iterables.<TypeDeclaration>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getTypeDeclaration()), _function), _function_1), TypeDeclaration.class);
    }
    return _xblockexpression;
  }

  public Iterable<UnitName> getVisibleUnitNames(final Resource o) {
    Iterable<UnitName> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o);
      final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
        return it.getEObjectOrProxy();
      };
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, o);
      };
      _xblockexpression = Iterables.<UnitName>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getUnitName()), _function), _function_1), UnitName.class);
    }
    return _xblockexpression;
  }

  public Iterable<UnitDeclaration> getVisibleUnitDeclarations(final Resource o) {
    Iterable<UnitDeclaration> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o);
      final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
        return it.getEObjectOrProxy();
      };
      final Function1<EObject, EObject> _function_1 = (EObject it) -> {
        return EcoreUtil.resolve(it, o);
      };
      _xblockexpression = Iterables.<UnitDeclaration>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getUnitDeclaration()), _function), _function_1), UnitDeclaration.class);
    }
    return _xblockexpression;
  }

  public Iterable<RootDeclaration> getVisibleRootDeclarations(final EObject o) {
    Iterable<RootDeclaration> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      Iterable<RootDeclaration> _xifexpression = null;
      Resource _eResource = o.eResource();
      boolean _tripleNotEquals = (_eResource != null);
      if (_tripleNotEquals) {
        Iterable<RootDeclaration> _xblockexpression_1 = null;
        {
          final IResourceDescriptions rd = this.rdp.getResourceDescriptions(o.eResource());
          final Function1<IEObjectDescription, EObject> _function = (IEObjectDescription it) -> {
            return it.getEObjectOrProxy();
          };
          final Function1<EObject, EObject> _function_1 = (EObject it) -> {
            return EcoreUtil.resolve(it, o);
          };
          _xblockexpression_1 = Iterables.<RootDeclaration>filter(IterableExtensions.<EObject, EObject>map(IterableExtensions.<IEObjectDescription, EObject>map(rd.getExportedObjectsByType(BLESSPackage.eINSTANCE.getRootDeclaration()), _function), _function_1), RootDeclaration.class);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public Iterable<RootDeclaration> getBaseUnitDeclarations(final EObject o) {
    final Function1<RootDeclaration, Boolean> _function = (RootDeclaration it) -> {
      return Boolean.valueOf(it.isBase());
    };
    return IterableExtensions.<RootDeclaration>filter(this.getVisibleRootDeclarations(o), _function);
  }

  public UnitName getRootUnit(final UnitName o) {
    UnitName _xblockexpression = null;
    {
      final RootDeclaration root = EcoreUtil2.<RootDeclaration>getContainerOfType(o, RootDeclaration.class);
      UnitName _xifexpression = null;
      if ((root == null)) {
        UnitName _xblockexpression_1 = null;
        {
          final UnitExtension ext = EcoreUtil2.<UnitExtension>getContainerOfType(o, UnitExtension.class);
          UnitName _xifexpression_1 = null;
          if ((ext != null)) {
            _xifexpression_1 = ext.getRoot();
          } else {
            UnitName _xblockexpression_2 = null;
            {
              String _name = o.getName();
              String _plus = ("Unit name \"" + _name);
              String _plus_1 = (_plus + "\" has neither root declaration, nor unit extension.");
              System.out.println(_plus_1);
              _xblockexpression_2 = o;
            }
            _xifexpression_1 = _xblockexpression_2;
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = root.getUnitName();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public RootDeclaration getRootDeclaration(final UnitName o) {
    RootDeclaration _xblockexpression = null;
    {
      RootDeclaration rd = EcoreUtil2.<RootDeclaration>getContainerOfType(o, RootDeclaration.class);
      if ((rd == null)) {
        final Function1<RootDeclaration, Boolean> _function = (RootDeclaration it) -> {
          return Boolean.valueOf(it.getUnitName().getName().equals(o.getName()));
        };
        rd = IterableExtensions.<RootDeclaration>head(IterableExtensions.<RootDeclaration>filter(this.getVisibleRootDeclarations(o), _function));
      }
      _xblockexpression = rd;
    }
    return _xblockexpression;
  }

  public List<IContainer> getVisibleContainers(final EObject o) {
    List<IContainer> _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      if ((this.cm == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule_1 = new BLESSRuntimeModule();
        this.cm = Guice.createInjector(_bLESSRuntimeModule_1).<IContainer.Manager>getInstance(IContainer.Manager.class);
      }
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      final IResourceDescription rd = index.getResourceDescription(o.eResource().getURI());
      List<IContainer> _xifexpression = null;
      if ((rd != null)) {
        _xifexpression = this.cm.getVisibleContainers(rd, index);
      } else {
        _xifexpression = CollectionLiterals.<IContainer>emptyList();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public IResourceDescription getResourceDescription(final EObject o) {
    IResourceDescription _xblockexpression = null;
    {
      if ((this.rdp == null)) {
        BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
        this.rdp = Guice.createInjector(_bLESSRuntimeModule).<ResourceDescriptionsProvider>getInstance(ResourceDescriptionsProvider.class);
      }
      final IResourceDescriptions index = this.rdp.getResourceDescriptions(o.eResource());
      _xblockexpression = index.getResourceDescription(o.eResource().getURI());
    }
    return _xblockexpression;
  }

  public ResourceSet getResourceSet(final EObject o) {
    ResourceSet _xblockexpression = null;
    {
      if ((this.rs == null)) {
        this.rs = o.eResource().getResourceSet();
      }
      _xblockexpression = this.rs;
    }
    return _xblockexpression;
  }

  public UnitName getTimeUnit(final EObject o) {
    final Function1<RootDeclaration, Boolean> _function = (RootDeclaration it) -> {
      return Boolean.valueOf(it.getUnitName().getName().equals("s"));
    };
    return IterableExtensions.<RootDeclaration>head(IterableExtensions.<RootDeclaration>filter(this.getBaseUnitDeclarations(o), _function)).getUnitName();
  }
}
