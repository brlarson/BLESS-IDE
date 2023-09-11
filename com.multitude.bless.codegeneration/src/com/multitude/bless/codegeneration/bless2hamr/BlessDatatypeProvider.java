package com.multitude.bless.codegeneration.bless2hamr;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.DataClassifier;
import org.sireum.IS;
import org.sireum.ST;
import org.sireum.Z;
import org.sireum.$internal.MutableMarker;
import org.sireum.aadl.osate.util.VisitorUtil;
import org.sireum.hamr.arsit.plugin.DatatypeContribution;
import org.sireum.hamr.arsit.plugin.DatatypeProviderPlugin;
import org.sireum.hamr.arsit.templates.DatatypeTemplate;
import org.sireum.hamr.arsit.templates.EnumTemplate;
import org.sireum.hamr.arsit.templates.IDatatypeTemplate;
import org.sireum.hamr.codegen.common.containers.IResource;
import org.sireum.hamr.codegen.common.containers.IResource$;
import org.sireum.hamr.codegen.common.properties.PropertyUtil;
import org.sireum.hamr.codegen.common.symbols.AnnexClauseInfo;
import org.sireum.hamr.codegen.common.symbols.SymbolTable;
import org.sireum.hamr.codegen.common.types.AadlType;
import org.sireum.hamr.codegen.common.types.AadlTypes;
import org.sireum.hamr.ir.PropertyValue;
import org.sireum.hamr.ir.ValueProp;
import org.sireum.message.Reporter;
import org.stringtemplate.v4.STGroupFile;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.QuantityType;
import com.multitude.aadl.bless.bLESS.Type;
import com.multitude.aadl.bless.bLESS.UnitName;
import com.multitude.aadl.bless.scoping.BlessIndex;
import com.multitude.aadl.bless.util.TypeUtil;
import com.multitude.aadl.bless.exception.ValidationException;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;

public class BlessDatatypeProvider implements DatatypeProviderPlugin
  {
//  @Inject private BLESSValidator validator; 
  @Inject private TypeUtil typeUtil; 
  @Inject private BlessIndex index; 
  
  STGroupFile slang_stg;

  public BlessDatatypeProvider()
  {
  slang_stg = new STGroupFile(getClass().getResource("slang.stg"), "UTF-8", '$', '$');
  Injector injector = IResourceServiceProvider.Registry.INSTANCE.
      getResourceServiceProvider(URI.createFileURI("dummy.bless")).get(Injector.class);
  injector.injectMembers(this);
  }
  
  @Override
  public String name()
    {
    return "BLESS Datatype Provider Plugin";
    }

  @Override
  public String string()
    {
    return "BLESS Datatype Provider";
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
  public boolean canHandleDatatypeProvider(AadlType aadlType, IS<Z, AnnexClauseInfo> resolvedAnnexSubclauses)
    {
    if (aadlType.container().nonEmpty())
      return PropertyUtil.getProperty(aadlType.container().get().properties(), "BLESS::Typed").nonEmpty();
    else
      return false;
    }

  @Override
  public DatatypeContribution handleDatatypeProvider(AadlType aadlType, IDatatypeTemplate datatypeTemplate,
      String suggestFilename, String dataDirectory, IS<Z, AnnexClauseInfo> resolvedAnnexSubclauses,
      SymbolTable symbolTable, AadlTypes aadlTypes, Reporter reporter)
    {
    DataClassifier dataClassifier = BlessBehaviorProvider.feature_types.get(aadlType.name());
    PropertyValue pv = PropertyUtil.getDiscreetPropertyValue(aadlType.container().get().properties(),
        "BLESS::Typed").get();
    String source = "// generated by BLESS "+com.multitude.bless.BLESS.versionDate+" at "+
        Time.todayString+" from "+ aadlType.nameProvider().classifier();
    if (pv instanceof ValueProp)
      try
      {
      String blessTypedValue = ((ValueProp)pv).getValue();
      Type ty = typeUtil.getTypeOfString(blessTypedValue, (EObject)Global.context);
      String params = "";  //parameter of @datatype class
      String exampleArgs = "";  //initialization value for example()
      if (ty instanceof QuantityType)
        {
        QuantityType qt = (QuantityType)ty;
        UnitName unitName = index.findUnitNameFromString(dataClassifier,qt.getUnit().getName());
        UnitName root = index.getRootUnit(unitName);
        if (root.getName().equals("s"))  //it's a time
          {
          params = qt.getUnit().getName() + " : Art.Time";
          exampleArgs = "s64\"0\"";
          }
        else if (qt.getWhole() != null)
          {
          params = "whole : S32";
          exampleArgs = "s32\"0\"";    
          }
        else if (qt.getScalar() != null)
          {
          params = "scalar : F32";
          exampleArgs = "f32\"0.0\"";    
          }
        else 
          {
          params = qt.getUnit().getName() + " : F32";
          exampleArgs = "f32\"0.0\"";    
          }
        }
      if (datatypeTemplate instanceof DatatypeTemplate)
        {
        DatatypeTemplate dt = (DatatypeTemplate)datatypeTemplate;
        //making a DatatypeContribution which needs a Resource and a ISZ[Resource]
        String dstPath = dataDirectory+"/"+suggestFilename;
        org.stringtemplate.v4.ST ed = slang_stg.getInstanceOf("exampleDatatype");
        ed.add("qualifiedReferencedTypeName", aadlType.nameProvider().qualifiedReferencedTypeName());
        ed.add("qualifiedTypeName", aadlType.nameProvider().qualifiedTypeName());
        ed.add("args", exampleArgs);
        String exampleDatatype = ed.render();
        
        ST content = dt.generateCustom(
            VisitorUtil.toISZ(new org.sireum.String("#Sireum"),
                new org.sireum.String("\n"+source)),  //custSlangSwitches
            VisitorUtil.toISZ(new org.sireum.String("org.sireum.S64._"),
                new org.sireum.String("org.sireum.S32._"),
                new org.sireum.String("org.sireum.F32._"),
                new org.sireum.String("art.Art")),  //custImports
            VisitorUtil.toISZ(new org.sireum.String(exampleDatatype)),  //custDatatypeCompanionBlocks
            VisitorUtil.toISZ(new org.sireum.String(params)),  //custParams
            dt.defaultDatatypeBlocks().map(m -> new org.sireum.String(m.render())),  //custDatatypeBlocks
            VisitorUtil.toISZ(),  //custPayloadSingletonBlocks
            VisitorUtil.toISZ(),  //custPreBlocks
            VisitorUtil.toISZ());  //custPostBlocks
            
        
        IResource ir = IResource$.MODULE$.apply( dstPath, content, VisitorUtil.toISZ(), true, false, false, false);
        return new DatatypeContribution(ir, VisitorUtil.toISZ());
        }
      else if (datatypeTemplate instanceof EnumTemplate)
        {
        throw new ValidationException("Enumeration Data Types Not Supported.");
        }
      }
      catch (ValidationException ve) {
      ve.handleException();
      }
      catch (Exception ex) {
      ex.printStackTrace();
      }
    return null;
    }

  }