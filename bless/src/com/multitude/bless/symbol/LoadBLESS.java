//LoadBLESS.java

package com.multitude.bless.symbol;

import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;
import org.eclipse.emf.common.util.URI;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osate.aadl2.AadlBoolean;
import org.osate.aadl2.AadlInteger;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.AadlReal;
import org.osate.aadl2.AadlString;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.BasicProperty;
import org.osate.aadl2.ClassifierType;
import org.osate.aadl2.ComponentClassifier;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.ComponentType;
import org.osate.aadl2.DefaultAnnexLibrary;
import org.osate.aadl2.DefaultAnnexSubclause;
import org.osate.aadl2.EnumerationLiteral;
import org.osate.aadl2.EnumerationType;
import org.osate.aadl2.Feature;
import org.osate.aadl2.ListType;
import org.osate.aadl2.ModelUnit;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.NumericRange;
import org.osate.aadl2.Parameter;
import org.osate.aadl2.Port;
import org.osate.aadl2.PortCategory;
import org.osate.aadl2.Property;
import org.osate.aadl2.PropertyType;
import org.osate.aadl2.RangeType;
import org.osate.aadl2.RecordType;
import org.osate.aadl2.ReferenceType;
import org.osate.aadl2.StringLiteral;
import org.osate.aadl2.SubprogramAccess;
import org.osate.aadl2.SubprogramSubcomponentType;
import org.osate.aadl2.ThreadClassifier;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.UnitsType;
import org.osate.aadl2.impl.StringLiteralImpl;
import org.osate.aadl2.modelsupport.errorreporting.MarkerParseErrorReporter;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.aadl2.parsesupport.LocationReference;
import org.osate.aadl2.properties.PropertyNotPresentException;
import org.osate.pluginsupport.PluginSupportUtil;
import org.osate.xtext.aadl2.Aadl2StandaloneSetup;
import org.osate.xtext.aadl2.properties.util.GetProperties;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;

import com.google.inject.Injector;
import com.multitude.aadl.bless.bLESS.TypeOrReference;
import com.multitude.aadl.bless.maps.BlessMaps;
import com.multitude.aadl.bless.parsing.TypeAnnexParser;
import com.multitude.aadl.bless.util.TraverseBlessWorkspace;
import com.multitude.bless.antlr3generated.BLESStoASTLexer;
import com.multitude.bless.antlr3generated.BLESStoASTParser;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.record.DataRecord;
import com.multitude.bless.record.EntityRecord;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.record.SubprogramRecord;
import com.multitude.bless.record.ThreadRecord;
import com.multitude.bless.toast.ToAST;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.tree.BASTTreeAdaptor;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;

public class LoadBLESS
  {
  static final boolean convertFromXtext = true;
//static Aadl2Factory factory = new Aadl2FactoryImpl();
////make a Property for BLESS::Assertion
//	public static Property blessAssertion = null;
////make a Property for BLESS::Typed
//	public static Property blessTyped = null;
////make a Property for BLESS::Precondition
//	public static Property blessPrecondition = null;
////make a Property for BLESS::Postcondition
//	public static Property blessPostcondition = null;
////make a Property for BLESS::Invariant
//	public static Property blessInvariant = null;

//	public static boolean verbose = true; // development Dump.it, turn off when BLESS stuff is loading correctly

  public static boolean haveLoaded = false; // has the model been loaded already?
//  public static ResourceSet rs = null;

  static String idregex = "[ ]*[a-zA-Z][[_]?[a-zA-Z0-9]]*[ ]*";  //allow spaces
  static String namedassertion = "<<"+idregex+":.*";  //start with << id :
  static String namelessfunction = "<<[ ]returns.*";  //start with << returns
  static String namelessenumeration = "<<[ ]+=>.*";  //start with << +=>

  public static 
boolean verbose()
    {
    return ConfigurationPreferencePage.getVerboseParse();
    }

  public static void 
load() throws YouIdiot
    {
//    final Injector         injector    = new Aadl2StandaloneSetup().createInjectorAndDoEMFRegistration();
//    final XtextResourceSet rs          = injector.getInstance(XtextResourceSet.class);
//    List<URI>              contributed = PluginSupportUtil.getContributedAadl();
//    for (final URI uri : contributed)
//      {
//      rs.getResource(uri, true);
//      }
    if (verbose())
      {
      Dump.it("\nStarting to gather BLESS/subBLESS annex subclauses, Assertion annex libraries,"
          + " and\n Assertion properties of features from packages open in the workspace.\n");
      }
    //load data component map for contributed resources like BLESS_Types.aadl
//    for (Resource resource : rs.getResources())
//      {
//      for (EObject o : resource.getContents())
//        if (o instanceof AadlPackage)
//          {
//          AadlPackage pack = (AadlPackage)o;
//          if (pack.getName().contains("BLESS"))
//            {
//            // get all component types in package
//            List<ComponentType> componentTypesInPackage = EcoreUtil2.eAllOfType(pack, ComponentType.class);
//            for (ComponentType ct : componentTypesInPackage)
//              {
//              Property blessTyped = GetProperties.lookupPropertyDefinition(ct, "BLESS", "Typed");
//              if (ct.getCategory().getName().equalsIgnoreCase("data") && ct.acceptsProperty(blessTyped) )
//                {
//                String typedText = LoadBLESS.getPropertyStringValue(ct, blessTyped, "");                
//                if (typedText.length() > 0) 
//                  //put into type/component map
//                  BlessMaps.dataComponentMapPut(typedText, ct.getQualifiedName());
//                }        
//              }
//            }
//          } // done with each package        
//      }
    //now do all files in workspace
    HashSet<IFile> files = TraverseBlessWorkspace.getAadlFilesInWorkspace();
    for (IFile file : files)
      {
     try
        {
        file.deleteMarkers(null, true, IResource.DEPTH_INFINITE);
        }
      catch (CoreException e)
        {
        throw new YouIdiot(e);
        }
      ModelUnit ir = (ModelUnit) AadlUtil.getElement(file);
//      EcoreUtil.resolveAll(ir); // resolve all proxies in ModelUnit
      if (ir instanceof AadlPackage)
        {
        PackageRecord pr = new PackageRecord(null, ir.getName(), (AadlPackage) ir, file);

        if (verbose())
          {
          Dump.it("Gathering package \"" + ir.getName() + "\".");
          }
        Global.compilationUnits.add(pr);
        loadPackage(pr);
        } // done with each package
      }
    haveLoaded = true;
    Dump.it("\nDeclarative Model has been Loaded.\n");
    } // end of load

  static void loadPackage(PackageRecord pr) throws YouIdiot
    {
    // load Annex Assertion {** **}
    loadAnnexLibrary(pr);
    // load component types
    loadComponentTypes(pr);
    if (verbose())
      {
      Dump.it("All component types in package \"" + pr.name + "\" have had their BLESS annex subclauses parsed, and "
          + "feature names mapped to their Assertions.\n  Starting to gather component implementations.");
      }
    // load component implementations
    loadComponentImplementations(pr);
    if (verbose())
      { Dump.it("Done with package " + pr.name + ".\n"); }
    } // end of loadPackages

  static void loadAnnexLibrary(PackageRecord pr) throws YouIdiot
    {
//Looking for all DefaultAnnexLibrary(s) in package: there most always will be just one for BLESS Assertions
    boolean found = false; // workaround for OSATE returning two copies of the same library
    List<DefaultAnnexLibrary> dal = EcoreUtil2.eAllOfType(pr.myAadlPackage, DefaultAnnexLibrary.class);
    for (DefaultAnnexLibrary defaultAnnexLibrary : dal)
      {
      // defaultAnnexLibrary.getName() gets you the name
      String annexName = defaultAnnexLibrary.getName();
      if (!found && annexName.endsWith("Assertion"))
        {
        try
          {
          found = true;
          if (verbose())
            { Dump.it("Found an Assertion annex library in package " + pr.name); }
          BAST aal = null;
          AnnexLibrary assertionLibrary = defaultAnnexLibrary.getParsedAnnexLibrary();
          if (assertionLibrary == null)
            { throw new YouIdiot("null annex library"); }
          aal = ToAST.TOAST.toAST(assertionLibrary);
          if (aal == null)
            { throw new YouIdiot("null annex AST"); }
          // put labeled Assertions into pr.assertions_in_library
          if (pr.assertions_in_library == null)
            {
            throw new YouIdiot("null annex ParseRecord.assertions_in_library");
            }
          else
            {
            for (int ch = 0; ch < aal.getChildCount(); ch++)
              {
              BAST ass = (BAST) aal.getChild(ch);
              // does it have a label?
              if (((BAST) ass.getChild(0)).hasType(BLESStoASTLexer.LABEL))
                {
                // then put it in the map
                pr.assertions_in_library.put(((BAST) ass.getChild(0).getChild(0)).getText(), ass);
                }
              }
            }
          // save AST in PackageRecord
          pr.ast = aal;
          // make and BAST node in the tree find the PackageReocrd at the top
          aal.setParseRecord(pr);
          if (verbose())
            {
//            Dump.it(aal.toStringTree());
            Dump.it("Assertion annex library (line " + aal.getLine() + " unparsed=\n" + aal.unparse());
            }
          } // done with Assertion Library
        catch (RecognitionException re)
          {
          Dump.it("recognition exception parsing Assertion annex library");
//					Dump.it(re);
          throw new YouIdiot(re);
          }
        catch (Exception ex)
          {
          Dump.it("Exception parsing Assertion annex library");
//				Dump.it(re);
          throw new YouIdiot(ex);
          }
        }
      } // done with all annex libraries in package
    } // end of loadAnnexLibrary

  static void loadComponentTypes(PackageRecord pr) throws YouIdiot
    {
    // get all component types in package
    List<ComponentType> componentTypesInPackage = EcoreUtil2.eAllOfType(pr.myAadlPackage, ComponentType.class);
    if (componentTypesInPackage.size() == 0 && verbose())
      { Dump.it("There are no component types in package \"" + pr.name + "\"."); }
    for (ComponentType ct : componentTypesInPackage)
      {
 
      EnumerationLiteral dispatchProtocol = GetProperties.getDispatchProtocol(ct);
      if (dispatchProtocol == null)
        Dump.it("Thread " + ct.getName() + " has null Dispatch_Prototcol.");
      else
        Dump.it(ct.getCategory().getName()+" "+ ct.getName() + " has Dispatch_Prototcol => " + dispatchProtocol.getName());

      if (verbose())
        {
        Dump.it("Creating a parse record for a \"" + ct.getCategory().getName() + "\" component type named \""
            + ct.getName() + "\".");
        }
      //resolve if abstract
//      if (ct.eIsProxy())
//        ct = (ComponentType) EcoreUtil.resolve((EObject)ct, pr.myAadlPackage);
      
      // make appropriate ParseRecord for the component, and attach it to the PackageRecord
      ParseRecord componentTypeParseRecord = null; // filled in with ThreadRecord, SubprogramRecord,
      // is it a thread?
      if //(ct instanceof ThreadType ) 
        (ct.getCategory().getName().equalsIgnoreCase("thread") || ct.getCategory().getName().equalsIgnoreCase("device")
          || ct.getCategory().getName().equalsIgnoreCase("system"))
        {
        // look for annex subclauses of this component
        BAST rootOfASTofBLESSbehavior = null;
        // Looking for all DefaultAnnexSubcluase(s) in component: there most always will be just one
        // for BLESS Assertions
        List<DefaultAnnexSubclause> das = EcoreUtil2.eAllOfType(ct, DefaultAnnexSubclause.class);
        for (DefaultAnnexSubclause defaultAnnexSubclause : das)
          {
          // defaultAnnexSubclause.getName() gets you the name
          String annexName = defaultAnnexSubclause.getName();
          if (annexName.endsWith("BLESS") // ||annexName.endsWith("BA2015")
          )
            {
            try
              {
//							if (verbose())
                {
                Dump.it("Found a " + annexName + " annex subclause in component type \"" + ct.getName()
                    + "\" in package \"" + pr.name + "\".");
                }
              AnnexSubclause subclause = defaultAnnexSubclause.getParsedAnnexSubclause();
              rootOfASTofBLESSbehavior = ToAST.TOAST.toAST(subclause);
              // should have root with type THREAD_ANNEX
              // save AST in ThreadRecord
//              if (!(ct instanceof ThreadClassifier))
//                throw new YouIdiot("device and system BLESS annex subclauses not yet supported");
              ThreadRecord tr = new ThreadRecord(rootOfASTofBLESSbehavior, ct.getName(), (ComponentClassifier)ct, pr);
              // set context
//							tr.context = ct;
              // make and BAST node in the tree find the ThreadRecord at the top
              rootOfASTofBLESSbehavior.setParseRecord(tr);
              // put ThreadRecord in package record
              pr.addComponent(ct.getName(), tr);
              // set ParseRecord reference
              componentTypeParseRecord = tr;
              // make port-assertion map (filled below)
              componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
              // make port-value map (filled below)
              componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
              if (verbose())
                { Dump.it(rootOfASTofBLESSbehavior.toStringTree()); }
              Dump.it("unparsed:");
              Dump.it(rootOfASTofBLESSbehavior.unparse());
//            rootOfASTofBLESSbehavior.showParseTree(ct.getName());
              // load all the thread maps
//MOVED TO com.multitude.bless.proof
//							tr.loadMaps();
              // check data types in thread
//          tr.checkTypes();
              } // done with annex BLESS
            catch (RecognitionException re)
              {
              Dump.it("RecognitionException parsing " + annexName + " annex subclause");
//								Dump.it(re);
              throw new YouIdiot(re);
              }
            catch (Exception ex)
              {
              Dump.it("Exception parsing " + annexName + " annex subclause");
//						Dump.it(re);
              throw new YouIdiot(ex);
              }
            }
          else if (verbose())
            {
            Dump.it(
                "Component \"" + ct.getName() + "\" has annex subclause \"" + annexName + "\" which is not \"BLESS\".");
            }
          } // done with all annex subclauses in thread or device
        if (componentTypeParseRecord == null)
          {
          componentTypeParseRecord = new ThreadRecord(null, ct.getName(), (ComponentClassifier)ct, pr);
          componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
          componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
          pr.addComponent(ct.getName(), componentTypeParseRecord);
          }
        } // done with thread or device component type
      // else is it a subprogram?
      else if (ct.getCategory().getName().equalsIgnoreCase("subprogram"))
      // then make it a SubprogramRecord
        {
        // look for annex subclauses of this subprogram component type
        BAST rootOfASTofBLESSbehavior = null;
        SubprogramRecord sr = null; // make default BLESS record of this subprogram
        // Looking for all DefaultAnnexSubcluase(s) in component: there most always will be just one
        // for BLESS Assertions
        List<DefaultAnnexSubclause> das = EcoreUtil2.eAllOfType(ct, DefaultAnnexSubclause.class);
        for (DefaultAnnexSubclause defaultAnnexSubclause : das)
          {
          // defaultAnnexSubclause.getName() gets you the name
          String annexName = defaultAnnexSubclause.getName();
          if (annexName.endsWith("subBLESS") || annexName.endsWith("Subprogram") || annexName.endsWith("Action"))
            {
//						try
//							{
            if (verbose())
              {
              Dump.it("Found a " + annexName + " annex subclause in component type \"" + ct.getName()
                  + "\" in package \"" + pr.name + "\".");
              }
            AnnexSubclause subclause = defaultAnnexSubclause.getParsedAnnexSubclause();
            rootOfASTofBLESSbehavior = ToAST.TOAST.toAST(subclause);
            // result should have root with token type=SUBPROGRAM_ANNEX
            // save AST in ThreadRecord
            sr = new SubprogramRecord(rootOfASTofBLESSbehavior, ct.getName(), ct, pr);
            // make and BAST node in the tree find the ThreadRecord at the top
            rootOfASTofBLESSbehavior.setParseRecord(sr);
            // put SubprogramRecord in package record
            pr.addComponent(ct.getName(), sr);
            // set ParseRecord reference
            componentTypeParseRecord = sr;
            // make parameter-assertion map (filled below)
            componentTypeParseRecord.parameter_assertion_map = new HashMap<String, BAST>();
            // make parameter-type map (filled below)
            componentTypeParseRecord.parameter_typed_map = new HashMap<String, BAST>();
            if (ConfigurationPreferencePage.showUnparsed())
              {
              try
                {
                Dump.it("unparsed:");
                Dump.it(rootOfASTofBLESSbehavior.unparse());
//            rootOfASTofBLESSbehavior.showParseTree(ct.getName());
                }
              catch (YouIdiot yi)
                {
                yi.handleException();
                }
              }
//							} // done with subBLESS subclause
//						catch (RecognitionException re)
//							{
//							Dump.it(re);
//							throw new YouIdiot(re);
//							}
//						catch (IOException ioe)
//							{
//							Dump.it(ioe);
//							throw new YouIdiot(ioe);
//							}
            }
          else if (verbose())
            {
            Dump.it("Subprogram component type \"" + ct.getName() + "\" has annex subclause \"" + annexName
                + "\" which is not \"subBLESS\"," + " \"Subprogram\", or \"Action\".");
            }
          } // done with all annex subclauses in subprogram
        if (componentTypeParseRecord == null)
          {
          componentTypeParseRecord = new SubprogramRecord(null, ct.getName(), ct, pr);
          componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
          componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
          pr.addComponent(ct.getName(), componentTypeParseRecord);
          }
        } // done with SubprogramRecord
      // else is it a data component type?
      else if (ct.getCategory().getName().equalsIgnoreCase("data"))
        {
        componentTypeParseRecord = new DataRecord(null, ct.getName(), ct, pr);
//       String dataName = ct.getQualifiedName();
        String dataName = ct.getName();
        pr.addComponent(dataName, componentTypeParseRecord);
//FIND BLESS::Typed properties, parse, attach it to the DataRecord, and put it in a map
        Property blessTyped = GetProperties.lookupPropertyDefinition(ct, "BLESS", "Typed");
//      ba2015Typed = GetProperties.lookupPropertyDefinition(ct,"BA2015","Typed");
        if (blessTyped == null)
          {
          // throw new YouIdiot
//					Dump.it("null return from GetProperties.lookupPropertyDefinition for BLESS::Typed\n" + " on " + ct.getName());
//      else if (ba2015Typed==null)
//        //throw new YouIdiot
//        Dump.it("null return from GetProperties.lookupPropertyDefinition for BA2015::Typed\n"+
//           " on "+ct.getName());
          }
        else if (ct.acceptsProperty(blessTyped)
        // ||ct.acceptsProperty(ba2015Typed)
        )
          {
          BAST rootOfTyped = null; // result of parsing an Assertion
          String typedText = LoadBLESS.getPropertyStringValue(ct, blessTyped, "");
//        if (typedText.length()==0)
//        	typedText = getPropertyStringValue(ct,ba2015Typed,"");
          if (typedText.length() > 0) // does it have an Assertion property?
            {
            //put into type/component map
            BlessMaps.dataComponentMapPut(typedText, ct.getQualifiedName());
           if (verbose())
              { Dump.it("  data type \"" + dataName + "\" has BLESS::Typed property \"" + typedText + "\"."); }
            try
              {
              LocationReference lr = ct.getLocationReference();
              int line = (lr!=null?lr.getLine():1);
              int offset = (lr!=null?lr.getOffset():1);
              rootOfTyped = LoadBLESS.parseTyped(typedText, line, offset, pr.file );
//              rootOfTyped = LoadBLESS.parseTyped(typedText, 1, 0, pr.file );
              }
            catch (RecognitionException re)
              {
              Dump.it("This \"" + typedText + "\" is not proper grammar for a BLESS::Typed property.");
//            Dump.it(re);
              throw new YouIdiot(re);
              }
//          if (verbose()) Dump.it(dataName+" BLESS::Typed property as string tree:  "+rootOfTyped.toStringTree());
            if (rootOfTyped == null)
              { throw new YouIdiot("Typed property of " + ct.getQualifiedName() + " is null."); }
            try
              {
              if (verbose() && (rootOfTyped != null))
                { Dump.it(dataName + " BLESS::Typed property unparsed:  " + rootOfTyped.unparse()); }
              }
            catch (YouIdiot yi)
              {
              Dump.it(" problem unparsing BLESS::Typed for data component " + dataName);
              yi.handleException();
              }
            // put it in map, null if no Assertion property; rootOfTyped will be null if no
            // BLESS::Typed property
            Global.data_type_map.put(ct.getQualifiedName(), rootOfTyped);
            // put enumeration literals into global set
            if (rootOfTyped.hasType(BLESStoASTLexer.LITERAL_enumeration))
              {
              for (int e = 0; e < rootOfTyped.getChildCount(); e++)
                { Global.enum_label_set.add(rootOfTyped.getChild(e).getText()); }
              }
            }
          }
        } // done with DataRecord
      // else is it a process component type?
      else if (ct.getCategory().getName().equalsIgnoreCase("process"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Process component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with DataRecord
      // else is it a processor component type?
      else if (ct.getCategory().getName().equalsIgnoreCase("processor"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Processor component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with DataRecord
      // else is it a thread group type?
      else if (ct.getCategory().getName().equalsIgnoreCase("thread group"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Thread group component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with thread group
      // else is it a memory type?
      else if (ct.getCategory().getName().equalsIgnoreCase("memory"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Memory component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with memory
      // else is it an abstract type?
      else if (ct.getCategory().getName().equalsIgnoreCase("abstract"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Abstract component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with abstract
      // else is it a bus type?
      else if (ct.getCategory().getName().equalsIgnoreCase("bus"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Bus component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with bus
      // else is it a virtual bus type?
      else if (ct.getCategory().getName().equalsIgnoreCase("virtual bus"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Virtual bus component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with virtual bus
      // else is it a virtual processor type?
      else if (ct.getCategory().getName().equalsIgnoreCase("virtual processor"))
        {
        componentTypeParseRecord = new ParseRecord(null, ct.getName(), ct, pr);
        componentTypeParseRecord.port_assertion_map = new HashMap<String, BAST>();
        componentTypeParseRecord.port_value_map = new HashMap<String, BAST>();
        pr.addComponent(ct.getName(), componentTypeParseRecord);
//      if (verbose()) Dump.it("Virtual processor component with name of \""+ct.getName()+
//          "\" had no BLESS to gather.");
        } // done with virtual processor
      // else it must be some other component type
      else
        {
        if (verbose())
          {
          Dump.it("Component with category of \"" + ct.getCategory().getName() + "\" and name of \"" + ct.getName()
              + "\" does not have means for gathering defined.");
          }
        } // done with other component type
      // check if no parse record
      try
        {
        if (componentTypeParseRecord == null)
          {
          throw new YouIdiot("\nYikes!  " + ct.getCategory().getName() + " with name of \"" + ct.getName()
              + " didn\'t have a component type parse record created.\n");
          }
        }
      catch (YouIdiot yi)
        {
        yi.handleException();
        }
      if (componentTypeParseRecord.port_typed_map == null)
        { componentTypeParseRecord.port_typed_map = new HashMap<String, BAST>(); }
      if (componentTypeParseRecord.port_entity_map == null)
        { componentTypeParseRecord.port_entity_map = new HashMap<String, EntityRecord>(); }
      // put all feature-Assertion pairs into map: sr.port_assertion_map
      // get all features of this component
      if (verbose())
        { Dump.it("looking for features with BLESS::Assertion properties in " + ct.getName()); }
      List<Feature> featuresOfComponent = ct.getAllFeatures();
      if (verbose() && (featuresOfComponent.size() == 0))
        { Dump.it(ct.getName() + " has no features."); }
      for (Feature f : featuresOfComponent)
        {
        Property blessAssertion = GetProperties.lookupPropertyDefinition(f, "BLESS", "Assertion");
        Property blessTyped = GetProperties.lookupPropertyDefinition(f, "BLESS", "Typed");
        Property blessValue = GetProperties.lookupPropertyDefinition(f, "BLESS", "Value");
        String featureName = f.getName(); // get label of feature
        int featureLine = // 0;
            AadlUtil.getLineNumberFor(f) + AadlUtil.getLineNumberFor(AadlUtil.getContainingDefaultAnnex(f));
        if (verbose())
          { Dump.it("  feature " + featureName + " " + f.toString() + " on line " + featureLine); }
//Does it have an BLESS::Assertion property?
        if (f instanceof Parameter)
          {
          // create EntityRecord for this port
          EntityRecord er = new EntityRecord(EntityRecord.PARAMETER,
              new BAST(featureName, BLESStoASTLexer.ID, featureLine));
          // put EntityRecord into map
          if (componentTypeParseRecord.parameter_entity_map == null)
            { componentTypeParseRecord.parameter_entity_map = new HashMap<String, EntityRecord>(); }
          componentTypeParseRecord.parameter_entity_map.put(featureName, er);
          Parameter p = (Parameter) f;
          if (((blessAssertion != null) && p.acceptsProperty(blessAssertion))
          )
            {
            BAST rootOfAssertion = null; // result of parsing an Assertion
            String assertionText = LoadBLESS.getPropertyStringValue(p, blessAssertion, "");
//        if (assertionText.length()==0)
//        	assertionText = getPropertyStringValue(p,ba2015Assertion,"");
            if (assertionText.length() > 0) // does it have an Assertion property?
              {
              if (verbose())
                { Dump.it("  parameter \"" + featureName + "\" has Assertion property \"" + assertionText + "\"."); }
              try  {
                rootOfAssertion = LoadBLESS.parseAssertion(assertionText, featureLine, 0, false, pr);
                }
              catch (RecognitionException re)
                {
                Dump.it("recognition exception in LoadBLESS.parseAssertion: " + assertionText);
                Dump.it(re);
                throw new YouIdiot(re);
                }
              if (verbose())
                { Dump.it(featureName + " as string tree:  " + rootOfAssertion.toStringTree()); }
              try
                {
                if (verbose())
                  { Dump.it(featureName + " as unparsed:  " + rootOfAssertion.unparse()); }
                }
              catch (YouIdiot yi)
                {
                Dump.it(" problem unparsing Assertion for parameter " + featureName);
                yi.handleException();
                }
              // put it in map, null if no Assertion property; rootOfAssertion will be null if no
              // Assertion property
              if (componentTypeParseRecord.parameter_assertion_map == null)
                { componentTypeParseRecord.parameter_assertion_map = new HashMap<String, BAST>(); }
              componentTypeParseRecord.parameter_assertion_map.put(featureName, rootOfAssertion);
              }
            else
              {
              if (componentTypeParseRecord.parameter_assertion_map == null)
                { componentTypeParseRecord.parameter_assertion_map = new HashMap<String, BAST>(); }
              componentTypeParseRecord.parameter_assertion_map.put(featureName, null);
              }
            }
          else
            {
//        if (verbose()) Dump.it("    feature \""+featureName+"\" does not accept property BA2015::Assertion.");
            // put it in map, null if no Assertion property
            if (componentTypeParseRecord.parameter_assertion_map == null)
              { componentTypeParseRecord.parameter_assertion_map = new HashMap<String, BAST>(); }
            componentTypeParseRecord.parameter_assertion_map.put(featureName, null);
            }
          // now check for BLESS::Typed
          if ((blessTyped != null) && p.acceptsProperty(blessTyped))
            {
            BAST rootOfTyped = null; // result of parsing a type
            String typedText = LoadBLESS.getPropertyStringValue(p, blessTyped, "");
            if (typedText.length() > 0) // does it have an Assertion property?
              {
              if (verbose())
                { Dump.it("  feature \"" + featureName + "\" has BLESS::Typed property \"" + typedText + "\"."); }
              try
                {
                rootOfTyped = LoadBLESS.parseTyped(typedText, featureLine, 0, pr.file );
                }
              catch (RecognitionException re)
                {
                Dump.it("recognition exception in LoadBLESS.parseTyped.");
                Dump.it(re);
                throw new YouIdiot(re);
                }
              if (verbose())
                { Dump.it(featureName + " as string tree:  " + rootOfTyped.toStringTree()); }
              try
                {
                if (verbose())
                  { Dump.it(featureName + " as unparsed:  " + rootOfTyped.unparse()); }
                }
              catch (YouIdiot yi)
                {
                Dump.it(" problem unparsing BLESS::Typed for feature " + featureName);
                yi.handleException();
                }
              // put it in map, null if no Assertion property; rootOfTyped will be null if no
              // Assertion property
              if (componentTypeParseRecord.parameter_typed_map == null)
                { componentTypeParseRecord.parameter_typed_map = new HashMap<String, BAST>(); }
              componentTypeParseRecord.parameter_typed_map.put(featureName, rootOfTyped);
              }
            else
              {
              if (componentTypeParseRecord.parameter_typed_map == null)
                { componentTypeParseRecord.parameter_typed_map = new HashMap<String, BAST>(); }
              componentTypeParseRecord.parameter_typed_map.put(p.getName(), null);
              }
            }

          } // done with parameter
        if (f instanceof Port)
          {
          // create EntityRecord for this port
          EntityRecord er = new EntityRecord(EntityRecord.PORT, new BAST(featureName, BLESStoASTLexer.ID, featureLine));
          // put EntityRecord into map
          componentTypeParseRecord.port_entity_map.put(featureName, er);
          Port p = (Port) f;
          if (p.isIn())
            {
            if (componentTypeParseRecord.in_ports == null)
              { componentTypeParseRecord.in_ports = new Vector<String>(); }
            componentTypeParseRecord.in_ports.add(p.getName());
            er.inPort = true;
            }
          if (p.isOut())
            {
            if (componentTypeParseRecord.out_ports == null)
              { componentTypeParseRecord.out_ports = new Vector<String>(); }
            componentTypeParseRecord.out_ports.add(p.getName());
            er.outPort = true;
            }
          String assertionText = null;
          BAST rootOfAssertion = null;
          String typedText = "";
          String valueText = null;
         BAST rootOfValue = null; 
          try
            {
          switch (p.getCategory().getValue())
            {
            case PortCategory.EVENT_VALUE:
              er.eventPort = true;
              er.type = new BAST("boolean", BLESStoASTLexer.LITERAL_boolean, er.identifier);
              // add Assertion to map
              assertionText = LoadBLESS.getPropertyStringValue(p, blessAssertion, "");
              if (assertionText.length() > 0) // does it have an Assertion property?
                {
                rootOfAssertion = LoadBLESS.parseAssertion(assertionText, featureLine, 0, false, pr);
                componentTypeParseRecord.port_assertion_map.put(featureName, rootOfAssertion);
                } 
              else
                {
                componentTypeParseRecord.port_assertion_map.put(featureName, null);
                }
              componentTypeParseRecord.port_value_map.put(featureName, null);
              componentTypeParseRecord.port_typed_map.put(featureName, er.type);
              break;
            case PortCategory.DATA_VALUE:
              er.dataPort = true;
              NamedElement portData = p.getAllClassifier();
              if (portData != null)
                {
                typedText = LoadBLESS.getPropertyStringValue(portData, blessTyped, "");
                }
              if (typedText.length() > 0)
                {
                try
                  {
                  er.type = LoadBLESS.parseTyped(typedText, featureLine, 0, pr.file );
                  componentTypeParseRecord.port_typed_map.put(featureName, er.type);
                  }
                catch (RecognitionException e)
                  {
                  e.printStackTrace();
                  }
                }
              else
                {
//PUT DOWN ERROR MARKER?
                er.type = new BAST("TOP", BLESStoASTLexer.TOP, er.identifier);
                componentTypeParseRecord.port_typed_map.put(featureName, er.type);
                }
              // add Assertion to map
              assertionText = LoadBLESS.getPropertyStringValue(p, blessAssertion, "");
              if (assertionText.length() > 0) // does it have an Assertion property?
                {
                rootOfAssertion = LoadBLESS.parseAssertion(assertionText, featureLine, 0, false, pr);
                componentTypeParseRecord.port_assertion_map.put(featureName, rootOfAssertion);
                } 
              else
                {
                componentTypeParseRecord.port_assertion_map.put(featureName, null);
                }
             //add value to map
              valueText = LoadBLESS.getPropertyStringValue(p, blessValue, "");             
              if (valueText.length() > 0) 
                {
                rootOfValue = LoadBLESS.parseAssertion(valueText, featureLine, 0, false, pr );
                componentTypeParseRecord.port_value_map.put(featureName, rootOfValue);                
                }
              else
                componentTypeParseRecord.port_value_map.put(featureName, null);
              break;
            case PortCategory.EVENT_DATA_VALUE:
              er.eventPort = true;
              er.dataPort = true;
              typedText = "";
              portData = p.getAllClassifier();
              if (portData != null)
                typedText = LoadBLESS.getPropertyStringValue(portData, blessTyped, "");
              if (typedText.length() > 0)
                {
                er.type = LoadBLESS.parseTyped(typedText, featureLine, 0, pr.file );
                componentTypeParseRecord.port_typed_map.put(featureName, er.type);
                }
              else
                {
                er.type = new BAST("TOP", BLESStoASTLexer.TOP, er.identifier);
                componentTypeParseRecord.port_typed_map.put(featureName, null);
                }
              // add Assertion to map
              assertionText = LoadBLESS.getPropertyStringValue(p, blessAssertion, "");
              if (assertionText.length() > 0) // does it have an Assertion property?
                {
                rootOfAssertion = LoadBLESS.parseAssertion(assertionText, featureLine, 0, false, pr);
                componentTypeParseRecord.port_assertion_map.put(featureName, rootOfAssertion);
                } 
              else
                {
                componentTypeParseRecord.port_assertion_map.put(featureName, null);
                }
              //add value to map
              valueText = LoadBLESS.getPropertyStringValue(p, blessValue, "");             
              if (valueText.length() > 0) 
                {
                rootOfValue = LoadBLESS.parseAssertion(valueText, featureLine, 0, false, pr );
                componentTypeParseRecord.port_value_map.put(featureName, rootOfValue);                
                }
              else
                componentTypeParseRecord.port_value_map.put(featureName, null);
              break;
            }  //end of switch
            }
          catch (RecognitionException re)
            {
            Dump.it("recognition exception in LoadBLESS.parseAssertion: " + assertionText);
            Dump.it(re);
            throw new YouIdiot(re);
            }
          } // done with port
//is this feature a subprogram access?
        else if (f instanceof SubprogramAccess)
          {
          SubprogramAccess sa = (SubprogramAccess) f;
          SubprogramSubcomponentType sst = sa.getSubprogramFeatureClassifier();
          if (sst == null)
            {
            Dump.it("No SubprogramSubcomponentType returned from " + "SubprogramAccess for \nfeature \"" + featureName
                + "\" on line " + featureLine + ".");
            }
          else
            {
            try
              {
              Property blessPrecondition = GetProperties.lookupPropertyDefinition(sst, "BLESS", "Precondition");
              if (blessPrecondition == null)
                throw new YouIdiot("BLESS::Precondition property is null. \nRefresh, clean, then try again.");
              Property blessPostcondition = GetProperties.lookupPropertyDefinition(sst, "BLESS", "Postcondition");
              if (blessPostcondition == null)
                throw new YouIdiot("BLESS::Postcondition property is null. \nRefresh, clean, then try again.");
              // initialize subprogram_access_map?
              if (componentTypeParseRecord.subprogram_access_map == null)
                { componentTypeParseRecord.subprogram_access_map = new HashMap<String, SubprogramAccessFeature>(); }
              SubprogramAccessFeature saf = new SubprogramAccessFeature(); // store information
                                                                           // about this subprogram
                                                                           // access
              saf.featureID = new String(featureName); // set feature identifier, this will be used
                                                       // in BLESS behaviors
              saf.line = featureLine;
              // do precondition
              if (sst.acceptsProperty(blessPrecondition)
              // ||sst.acceptsProperty(ba2015Precondition)
              )
                {
                BAST rootOfAssertion = null; // result of parsing an Assertion
                String assertionText = LoadBLESS.getPropertyStringValue(sst, blessPrecondition, "");
                if (assertionText.length() > 0) // does it have an Assertion property?
                  {
                  if (verbose())
                    {
                    Dump.it("  subprogram access \"" + featureName + "\" has Precondition property \"" + assertionText
                        + "\".");
                    }
                  try
                    {
                    rootOfAssertion = LoadBLESS.parseAssertion(assertionText, featureLine, 0, false, pr);
                    }
                  catch (RecognitionException re)
                    {
                    Dump.it("recognition exception in LoadBLESS.parseAssertion:\n" + assertionText);
                    Dump.it(re);
                    throw new YouIdiot(re);
                    }
                  if (verbose())
                    { Dump.it(featureName + " as string tree:  " + rootOfAssertion.toStringTree()); }
                  try
                    {
                    if (verbose())
                      { Dump.it(featureName + " as unparsed:  " + rootOfAssertion.unparse()); }
                    }
                  catch (YouIdiot yi)
                    {
                    Dump.it(" problem unparsing Assertion for feature " + featureName);
                    yi.handleException();
                    }
                  // put it in map, null if no Assertion property; rootOfAssertion will be null if
                  // no Assertion property
                  if (rootOfAssertion.hasType(BLESStoASTLexer.ASSERTION) && (rootOfAssertion.getChildCount() == 1))
                    {
                    saf.precondition = (BAST) rootOfAssertion.getChild(0);
                    }
                  else
                    {
                    throw new YouIdiot("Precondition must be ASSERTION w/o parameters.", rootOfAssertion);
                    }
                  }
                else
                  {
                  // throw new ProofException(
                  Dump.it((f.getLocationReference() != null ? "On line " + f.getLocationReference().getLine() : "")
                      + " subprogram access feature \"" + featureName + "\" has no precondition for subprogram type \""
                      + sst.getName() + "\".");
                  }
                } // done with precondition
              else
                {
                throw new YouIdiot(
                    (f.getLocationReference() != null ? "On line " + f.getLocationReference().getLine() : "")
                        + " subprogram access feature \"" + featureName + "\" does not accept BLESS preconditions.");
                }
              // do postcondition
              if (sst.acceptsProperty(blessPostcondition)
              // ||sst.acceptsProperty(ba2015Postcondition)
              )
                {
                BAST rootOfAssertion = null; // result of parsing an Assertion
                String assertionText = LoadBLESS.getPropertyStringValue(sst, blessPostcondition, "");
                if (assertionText.length() > 0) // does it have an Assertion property?
                  {
                  if (verbose())
                    {
                    Dump.it("  subprogram access \"" + featureName + "\" has Postcondition property \"" + assertionText
                        + "\".");
                    }
                  try
                    {
                    rootOfAssertion = LoadBLESS.parseAssertion(assertionText, featureLine, 0, false, pr);
                    }
                  catch (RecognitionException re)
                    {
                    Dump.it("recognition exception in LoadBLESS.parseAssertion:\n" + assertionText);
                    Dump.it(re);
//                    throw new YouIdiot(re);
                    }
                  if (verbose())
                    { Dump.it(featureName + " as string tree:  " + rootOfAssertion.toStringTree()); }
                  try
                    {
                    if (verbose())
                      { Dump.it(featureName + " as unparsed:  " + rootOfAssertion.unparse()); }
                    }
                  catch (YouIdiot yi)
                    {
                    Dump.it(" problem unparsing Assertion for feature " + featureName);
                    yi.handleException();
                    }
                  // put it in map, null if no Assertion property; rootOfAssertion will be null if
                  // no Assertion property
                  if (rootOfAssertion.hasType(BLESStoASTLexer.ASSERTION) && (rootOfAssertion.getChildCount() == 1))
                    {
                    saf.postcondition = (BAST) rootOfAssertion.getChild(0);
                    }
                  else
                    {
                    throw new YouIdiot("Postcondition must be ASSERTION w/o parameters.", rootOfAssertion);
                    }
                  }
                else
                  {
                  // throw new ProofException(
                  Dump.it((f.getLocationReference() != null ? "On line " + f.getLocationReference().getLine() : "")
                      + " subprogram access feature \"" + featureName + "\" has no postcondition for subprogram type \""
                      + sst.getName() + "\".");
                  }
                } // done with postcondition
              else
                {
                throw new YouIdiot(
                    (f.getLocationReference() != null ? "On line " + f.getLocationReference().getLine() : "")
                        + " subprogram access feature \"" + featureName + "\" does not accept BLESS postconditions.");
                }
              // load up map of formal parameters to their types
              if (verbose())              
                Dump.it("Still need to load formal_type_map for " + featureName);
              // put it in the map
              componentTypeParseRecord.subprogram_access_map.put(featureName, saf);
              }
            catch (YouIdiot yi)
              {
              Dump.it("Problem with subprogram access feature.");
              yi.handleException();
              }
//        catch (ProofException pe){Dump.it("Problem with subprogram access feature.");pe.handleProofException();}
            }
          }
//      else
//        try{ throw new ProofException("feature kind not yet supported");}
//         catch(ProofException pe) {pe.handleProofException();}
        } // done with all features of this subprogram
      } // done with all component types in package
    } // end of loadComponentTypes

  static void loadComponentImplementations(PackageRecord pr) throws YouIdiot
    {
//get all component implementations in package
//look through component implementations
    List<ComponentImplementation> componentImplementationsInPackage = EcoreUtil2.eAllOfType(pr.myAadlPackage,
        ComponentImplementation.class);
    if (verbose() && (componentImplementationsInPackage.size() == 0))
      {
      Dump.it(pr.name + " has no component implementations.");
      }
    for (ComponentImplementation ci : componentImplementationsInPackage)
      {
      if (verbose())
        {
        Dump.it("  gathering component implementation \"" + ci.getName() + "\"");
        }
      //resolve if abstract
//      if (ci.eIsProxy())
//        ci = (ComponentImplementation) EcoreUtil.resolve((EObject)ci, pr.myAadlPackage);
//      
      // make appropriate ParseRecord for the component, and attach it to the
      // PackageRecord
      ParseRecord componentImplementationParseRecord = null; // filled in with
                                                             // ThreadRecord,
                                                             // SubprogramRecord,
      // is it a thread?
      if //(ci instanceof ThreadClassifier) 
       (ci.getCategory().getName().equalsIgnoreCase("thread") || ci.getCategory().getName().equalsIgnoreCase("device")
          || ci.getCategory().getName().equalsIgnoreCase("system"))
        {
        // look for annex subclauses of this component
        BAST                        rootOfASTofBLESSbehavior = null;
        ThreadRecord                tr                       = null;
        // Looking for all DefaultAnnexSubcluase(s) in component: there most
        // always will be just one
        // for BLESS Assertions
        List<DefaultAnnexSubclause> das                      = EcoreUtil2.eAllOfType(ci, DefaultAnnexSubclause.class);
        for (DefaultAnnexSubclause defaultAnnexSubclause : das)
          {
          // defaultAnnexSubclause.getName() gets you the name
          String annexName = defaultAnnexSubclause.getName();
          if ((rootOfASTofBLESSbehavior == null) && (annexName.endsWith("BLESS")// ||annexName.endsWith("BA2015")
          ))
            {
            try
              {
              if (verbose())
                {
                Dump.it("Found a " + annexName + " annex subclause in component implementation \"" + ci.getName()
                    + "\" in package \"" + pr.name + "\".");
                }
              AnnexSubclause subclause = defaultAnnexSubclause.getParsedAnnexSubclause();
              rootOfASTofBLESSbehavior = ToAST.TOAST.toAST(subclause);
              // save AST in ThreadRecord
//              if (!(ci instanceof ThreadClassifier))
//                throw new YouIdiot("device and system BLESS annex subclauses not yet supported");
              tr = new ThreadRecord(rootOfASTofBLESSbehavior, ci.getTypeName(),
                  ci.getImplementationName(), (ComponentClassifier)ci, pr);
              // set context
//							tr.context = ci;
              // make and BAST node in the tree find the ThreadRecord at the top
              rootOfASTofBLESSbehavior.setParseRecord(tr);
              // load all the thread maps
//MOVED TO com.multitude.bless.proof
//							tr.loadMaps();
              // put ThreadRecord in package record
              pr.addImplementation(ci.getName(), tr);
              if (verbose())
                {
                Dump.it(rootOfASTofBLESSbehavior.toStringTree());
                }
              if (ConfigurationPreferencePage.showUnparsed())
                {
                Dump.it("unparsed:\nannex BLESS\n{**  --" + ci.getName());
                Dump.it(rootOfASTofBLESSbehavior.unparse());
                Dump.it("**}  --" + ci.getName());
//            rootOfASTofBLESSbehavior.showParseTree(ct.getName());
                }
              } // done with annex subclause
            catch (RecognitionException re)
              {
              Dump.it("RecognitionException parsing " + annexName + " annex subclause");
//								Dump.it(re);

              throw new YouIdiot(re);
              }
            catch (Exception ex)
              {
              Dump.it("Exception parsing " + annexName + " annex subclause");
//						Dump.it(re);
              throw new YouIdiot(ex);
              }
            }
          } // done with all annex subclauses in thread or device
        if (tr == null)
          { // no BLESS annex subclause?
          tr = new ThreadRecord(null, ci.getTypeName(), ci.getImplementationName(), (ComponentClassifier)ci, pr);
          pr.addImplementation(ci.getName(), tr);
          }
        // link to its component type
        // find dot in implementation name
        int    dot               = ci.getName().indexOf(".");
        String componentTypeName = ci.getName().substring(0, dot);
//      String componentTypeName = ci.getName().substring(0,ci.getName().length()-4);
        if (verbose())
          {
          Dump.it(
              "Looking for component type \"" + componentTypeName + "\", defining features this implementation uses.");
          }
        try
          {
          if (pr.hasComponent(componentTypeName))
            {
            // set implementation's port_assertion_map to type's
            // port_assertion_map
            tr.port_assertion_map = pr.getComponent(componentTypeName).port_assertion_map;
            if (tr.port_assertion_map == null)
              {
              throw new YouIdiot("null port assertion map for component " + componentTypeName);
              }
            // set implementation's port_value_map to type's port_assertion_map
            tr.port_value_map = pr.getComponent(componentTypeName).port_value_map;
            if (tr.port_value_map == null)
              {
              throw new YouIdiot("null port value map for component " + componentTypeName);
              }
            // set implementation's subprogram_access_map to type's
            // subprogram_access_map
            tr.subprogram_access_map = pr.getComponent(componentTypeName).subprogram_access_map;
            if (tr.subprogram_access_map == null)
              {
              // throw new YI(
              if (verbose())
                {
                Dump.it("no subprogram access map for component " + componentTypeName);
                }
              }
            // set implementation's port_entity_map
            tr.port_entity_map = pr.getComponent(componentTypeName).port_entity_map;
            if (tr.port_entity_map == null)
              {
              throw new YouIdiot("null port entity map for component " + componentTypeName);
              }
            tr.port_typed_map = pr.getComponent(componentTypeName).port_typed_map;
            if (tr.port_typed_map == null)
              {
              throw new YouIdiot("null port type map for component " + componentTypeName);
              }
            // set in and out ports
            tr.in_ports  = pr.getComponent(componentTypeName).in_ports;
//        if (tr.in_ports==null)
//          throw new YouIdiot("null in ports for component "+componentTypeName);
            tr.out_ports = pr.getComponent(componentTypeName).out_ports;
//        if (tr.out_ports==null)
//          throw new YouIdiot("null out ports for component "+componentTypeName);
            }
          else if (verbose())
            {
            Dump.it("There was no component type \"" + componentTypeName + "\" found in package \"" + pr.name
                + "\" for component implementation \"" + ci.getName() + "\".");
            }
          }
        catch (YouIdiot yi)
          {
          yi.handleException();
          }
        } // done with thread or device component type
      // else is it a subprogram?
      else if (ci.getCategory().getName().equalsIgnoreCase("subprogram"))
      // then make it a SubprogramRecord
        {
        // look for annex subclauses of this subprogram component type
        BAST                        rootOfASTofBLESSbehavior = null;
        SubprogramRecord            sr                       = null;
        // Looking for all DefaultAnnexSubcluase(s) in component: there most
        // always will be just one
        // for BLESS Assertions
        List<DefaultAnnexSubclause> das                      = EcoreUtil2.eAllOfType(ci, DefaultAnnexSubclause.class);
        for (DefaultAnnexSubclause defaultAnnexSubclause : das)
          {
          // defaultAnnexSubclause.getName() gets you the name
          String annexName = defaultAnnexSubclause.getName();
          if (annexName.endsWith("subBLESS"))
            {
            try
              {
              if (verbose())
                {
                Dump.it("Found a subBLESS annex subclause in a subprogram component implementation \"" + ci.getName()
                    + "\" in package \"" + pr.name + "\".");
                }
              String            sourceText = defaultAnnexSubclause.getSourceText();
              // parse the source text, putting Assertions into the
              // PackageRecord's map:
              // assertions_in_library
              // set up ANTLR file reader
              CharStream        spec       = new ANTLRReaderStream(new StringReader(sourceText));
              BLESStoASTLexer   lexer      = new BLESStoASTLexer(spec);
              CommonTokenStream tokens     = new CommonTokenStream();
              BAST.tokens = tokens;
              tokens.setTokenSource(lexer);
              BLESStoASTParser parser = new BLESStoASTParser(tokens);
              parser.setTreeAdaptor(new BASTTreeAdaptor());
              parser.setStartingLine(AadlUtil.getLineNumberFor(defaultAnnexSubclause));
              // okay, now parse it subprogram_behavior
              rootOfASTofBLESSbehavior = parser.subprogram_behavior().getTree();
              // save AST in SubprogramRecord
              sr                       = new SubprogramRecord(rootOfASTofBLESSbehavior, ci.getName(),
                  ci.getImplementationName(), ci, pr);
              // make and BAST node in the tree find the SubprogramRecord at the
              // top
              rootOfASTofBLESSbehavior.setParseRecord(sr);
              // put SubprogramRecord in package record
              pr.addImplementation(ci.getName(), sr);
              } // done with try
            catch (RecognitionException re)
              {
              Dump.it(re);
              throw new YouIdiot(re);
              }
            catch (IOException ioe)
              {
              Dump.it(ioe);
              throw new YouIdiot(ioe);
              }
            } // done with subprogram
          }
        }
      else if (ci.getCategory().getName().equalsIgnoreCase("data"))
        {
        componentImplementationParseRecord = new DataRecord(null, ci.getName(), ci, pr);
        String dataName = ci.getName();
        pr.addComponent(dataName, componentImplementationParseRecord);
        // FIND BLESS::Typed properties, parse, attach it to the DataRecord, and
        // put it in a map
        Property blessTyped = GetProperties.lookupPropertyDefinition(ci, "BLESS", "Typed");
        if ((blessTyped != null) && ci.acceptsProperty(blessTyped))
          {
          BAST   rootOfTyped = null;                                                // result
                                                                                    // of
                                                                                    // parsing
                                                                                    // an
                                                                                    // Assertion
          String typedText   = LoadBLESS.getPropertyStringValue(ci, blessTyped, "");
          if (typedText.length() > 0) // does it have an Assertion property?
            {
            // put into type/component map
            BlessMaps.dataComponentMapPut(typedText, ci.getQualifiedName());
            if (verbose())
              {
              Dump.it("  data type \"" + dataName + "\" has BLESS::Typed property \"" + typedText + "\".");
              }
            try
              {
              LocationReference lr     = ci.getLocationReference();
              int               line   = (lr != null ? lr.getLine() : 1);
              int               offset = (lr != null ? lr.getOffset() : 1);
              rootOfTyped = LoadBLESS.parseTyped(typedText, line, offset, pr.file);
              }
            catch (RecognitionException re)
              {
              Dump.it("This \"" + typedText + "\" is not proper grammar for a BLESS::Typed property.");
              throw new YouIdiot(re);
              }
//              if (verbose()) Dump.it(dataName+" BLESS::Typed property as string tree:  "+rootOfTyped.toStringTree());
            if (rootOfTyped == null)
              {
              throw new YouIdiot("Typed property of " + ci.getQualifiedName() + " is null.");
              }
            try
              {
              if (verbose() && (rootOfTyped != null))
                {
                Dump.it(dataName + " BLESS::Typed property unparsed:  " + rootOfTyped.unparse());
                }
              }
            catch (YouIdiot yi)
              {
              Dump.it(" problem unparsing BLESS::Typed for data component " + dataName);
              yi.handleException();
              }
            // put it in map, null if no Assertion property; rootOfTyped will be
            // null if no
            // BLESS::Typed property
            Global.data_type_map.put(ci.getQualifiedName(), rootOfTyped);
            // put enumeration literals into global set
            if (rootOfTyped.hasType(BLESStoASTLexer.LITERAL_enumeration))
              {
              for (int e = 0; e < rootOfTyped.getChildCount(); e++)
                {
                Global.enum_label_set.add(rootOfTyped.getChild(e).getText());
                }
              }
            }
          }
        } // done with DataRecord
//        // link to its component type
//        String componentTypeName = ci.getName().substring(0, ci.getName().length() - 4);
//        if (verbose())
//          {
//          Dump.it(
//              "Looking for component type \"" + componentTypeName + "\", defining features this implementation uses.");
//          }
//        try
//          {
//          if (pr.hasComponent(componentTypeName))
//            {
//            // set implementation's port_assertion_map to type's port_assertion_map
//            sr.port_assertion_map = pr.getComponent(componentTypeName).port_assertion_map;
//            if (sr.port_assertion_map == null)
//              { throw new YouIdiot("null port assertion map for component " + componentTypeName); }
//            // set implementation's port_value_map to type's port_value_map
//            sr.port_value_map = pr.getComponent(componentTypeName).port_value_map;
//            if (sr.port_value_map == null)
//              { throw new YouIdiot("null port value map for component " + componentTypeName); }
//            }
//          else if (verbose())
//            {
//            Dump.it("There was no component type \"" + componentTypeName + "\" found in package \"" + pr.name
//                + "\" for component implementation \"" + ci.getName() + "\".");
//            }
//          }
//        catch (YouIdiot yi)
//          {
//          yi.handleException();
//          }
      } // done with all component implementations in package
    } // end of loadComponentImplementations
  
  public static BAST 
parseAssertion(String text, int line, int column, boolean putAssertionsIntoMap, PackageRecord pr)
  throws RecognitionException
    {
// set up ANTLR string reader
    CharStream        spec   = new ANTLRStringStream(text);
    BLESStoASTLexer   lexer  = new BLESStoASTLexer(spec);
    CommonTokenStream tokens = new CommonTokenStream();
    BAST.tokens = tokens;
    tokens.setTokenSource(lexer);

    BLESStoASTParser parser = new BLESStoASTParser(tokens);
    parser.setStartingLine(line);
    parser.setTreeAdaptor(new BASTTreeAdaptor());
    parser.currentPackageRecord = pr;
//parser.putAssertionsIntoMap = putAssertionsIntoMap; // put Assertions found into map?
// parser.setLine(line);
// parser.setColumn(column);
    BAST tb = null;
//   try {
    tb = parser.assertion().getTree();
//    } catch (UnwantedTokenException re)
//      {
//      Dump.it("/nDon\'t include units for numeric literals in BLESS::Assertion property strings.\n");
//      }
    return tb;
    } // end of parseAssertion

//  public static BAST 
//parseAssertion(String text, int line, int column, IResource rsrc)
//      throws RecognitionException
//    {
//    MarkerParseErrorReporter errorReporter = new MarkerParseErrorReporter(rsrc, "assertion");
//    if (text.matches(namedassertion))
//      return ToAST.TOAST.toAST(BlessAnnexParser.eINSTANCE.parseNamedAssertion(text,
//          "",line,column,errorReporter));
//    if (text.matches(namelessfunction))
//      return ToAST.TOAST.toAST(BlessAnnexParser.eINSTANCE.parseNamelessFunction(text,
//          "",line,column,errorReporter));
//    if (text.matches(namelessenumeration))
//      return ToAST.TOAST.toAST(BlessAnnexParser.eINSTANCE.parseNamelessEnumeration(text,
//          "",line,column,errorReporter));
//    NamelessAssertion na = BlessAnnexParser.eINSTANCE.parseNamelessAssertion(text,
//        "",line,column,errorReporter);
//    if (na != null)
//      return ToAST.TOAST.toAST(na);
//    throw new YouIdiot("Assertion \"" + text + "\" at line " + line + " is ungrammatical.");
//    } // end of parseAssertion
  
  public static BAST parseTyped(String text, int line, int column, IResource rsrc) 
      throws RecognitionException, YouIdiot
    {
    TypeAnnexParser tap;
//    if (rsrc == null)
//      throw new YouIdiot("Null IResource (file) passed to parseTyped");
    if (text == null)
      throw new YouIdiot("Null text passed to parseTyped");
//   MarkerParseErrorReporter errorReporter = new MarkerParseErrorReporter(rsrc, "type");
//look for type identifiers
//    if (text.matches(idregex))
//      return new BAST(text, BLESStoASTLexer.ID,line); 
//    if (TypeAnnexParser.eINSTANCE == null)
//      tap = new com.multitude.aadl.bless.parsing.TypeAnnexParser();
//    
//  WORKAROUND  change column to line => see issue #2713
    TypeOrReference t = TypeAnnexParser.eINSTANCE.parseTypeOrReference(text,"",line,line, //errorReporter
        (rsrc == null ? null : new MarkerParseErrorReporter(rsrc, "type")));
//    TypeOrReference t = TypeAnnexParser.eINSTANCE.parseTypeOrReference(text,"",line,column,errorReporter);
//    Type t = TypeAnnexParser.eINSTANCE.parseType(text,"",line,column,errorReporter);
    if (t == null)
      throw new YouIdiot("Type \"" + text + "\" at line " + line + " is ungrammatical.");
    return ToAST.TOAST.toAST(t);
    } // end of parseTyped

  /**
   * get line number of AADL object, return 0 for now
   * @param x
   * @return
   */
  static int getLine(AadlPackage x)
    {
    return AadlUtil.getLineNumberFor(x);
    }

  static int

      getLine(NamedElement x)
    {
    return AadlUtil.getLineNumberFor(x);
    }

//	static void loadPropertySets()
//		{
//		EList<AadlPackage> propertysetlist = EMFIndexRetrieval
//				.getAllPropertySetsInWorkspace(OsateResourceUtil.getResourceSet());
//		// for each property set:
//		for (AadlPackage psod : propertysetlist)
//			{
//			PropertySetImpl psi = (PropertySetImpl) EcoreUtil.resolve(psod.getEObjectOrProxy(),
//					OsateResourceUtil.getResourceSet());
//			if (verbose())
//				{
//				Dump.it("Gathering property set \"" + psi.getName() + "\".");
//				}
//			Dump.it("psi:  " + psi.toString());
//			// if (ps.getName().equalsIgnoreCase("Plugin_Resources"))
//			// {Dump.it("Plugin_Resources not loaded.");}
//			// else
//			BAST psrRoot = new BAST(psi.getName(), BLESStoASTLexer.DUMMY, getLine(psod));
//			// create a BLESS PropertySetRecord, put in Model.addPropertySet automatically
//			PropertySetRecord psr = new PropertySetRecord(psrRoot, psi.getName(), psi, null);
//			// put it in compilation units
//			// Global.compilationUnits.add(psr);
//			// import declarations?
//			// property types
//			EList<PropertyType> propertytypelist = psi.getOwnedPropertyTypes();
//			for (PropertyType pt : propertytypelist)
//				{
//				String propertyTypeLabel = pt.getName();
//				try
//					{
//					BAST propertyTypeTree = getTypeTree(pt);
//					if (propertyTypeTree == null)
//						{
//						throw new YouIdiot("this is an unknown AADL property type: " + propertyTypeLabel);
//						}
//					// add to property set tree
//					psrRoot.addChild(propertyTypeTree);
//					// add it to the property set map
//					psr.addPropertyType(propertyTypeLabel, propertyTypeTree);
//					}
//				catch (YouIdiot yi)
//					{
//					yi.handleException();
//					}
//				} // done with property types
//			// now do property values
////    BAST propRoot = new BAST(psi.getName(),BLESStoASTLexer.DUMMY,getLine(psod));
//			EList<Property> propertylist = psi.getOwnedProperties();
//			for (Property prop : propertylist)
//				{
//				String propertyLabel = prop.getName();
//				try
//					{
//					BAST propertyTree = getTypeTree(prop.getPropertyType());
//					if (propertyTree == null)
//						{
//						throw new YouIdiot("this is an unknown AADL property: " + propertyLabel);
//						}
//					// add to property set tree
//					psrRoot.addChild(propertyTree);
//					// add it to the property set map
//					psr.addProperty(propertyLabel, propertyTree);
//					}
//				catch (YouIdiot yi)
//					{
//					yi.handleException();
//					}
//				} // done with properties
//			// now do property constants
//			EList<PropertyConstant> propertyconstantlist = psi.getOwnedPropertyConstants();
//			for (PropertyConstant propConst : propertyconstantlist)
//				{
//				String propertyConstantLabel = propConst.getName();
//				PropertyType pt = propConst.getPropertyType();
//				try
//					{
//					BAST propertyConstantTree = getTypeTree(pt);
//					if (propertyConstantTree == null)
//						{
//						throw new YouIdiot("this is an unknown AADL property constant: " + propertyConstantLabel);
//						}
//					// add to property set tree
//					psrRoot.addChild(propertyConstantTree);
//					// add it to the property set map
//					psr.addProperty(propertyConstantLabel, propertyConstantTree);
//					}
//				catch (YouIdiot yi)
//					{
//					yi.handleException();
//					}
//				} // done with properties
//
//			// EList<PropertyAssociation> propertyassociationlist=psi.getOwnedPropertyAssociations();
//			if (verbose())
//				{
//				Dump.it("What should be done with property associations?");
//				}
//			} // done with all property sets
//		} // end of loadPropertySets

  /**
   * Determine BAST tree from AADL property type
   * @param pt
   * @return
   */
  static BAST getTypeTree(PropertyType pt) throws YouIdiot
    {
    if (pt == null)
      { throw new YouIdiot("null parameter passed!"); }
    BAST resultTree = null;
    // boolean
    if (pt instanceof AadlBoolean)
      {
      resultTree = new BAST("boolean", BLESStoASTLexer.LITERAL_boolean, getLine(pt));
      }
    // integer
    else if (pt instanceof AadlInteger)
      {
      resultTree = new BAST("integer", BLESStoASTLexer.LITERAL_integer, getLine(pt));
      }
    // string
    else if (pt instanceof StringLiteral)
      {
      resultTree = new BAST("string", BLESStoASTLexer.LITERAL_string, getLine(pt));
      }
    else if (pt instanceof AadlString)
      {
      resultTree = new BAST("string", BLESStoASTLexer.LITERAL_string, getLine(pt));
      }
    // real
    else if (pt instanceof AadlReal)
      {
      resultTree = new BAST("real", BLESStoASTLexer.LITERAL_real, getLine(pt));
      }
    // enumeration
    else if (pt instanceof EnumerationType)
      {
      resultTree = new BAST("enumeration", BLESStoASTLexer.LITERAL_enumeration, getLine(pt));
      // then add children for enumeration literals
      EnumerationType et = (EnumerationType) pt;
      for (NamedElement ch : et.getOwnedMembers())
        { // make a BAST for the enum literal and attach it to the tree
        resultTree.addChild(new BAST(ch.getName(), BLESStoASTLexer.ID, getLine(pt)));
        } // done with enumeration literals
      } // done with enumeration type
    // is list type enumeration??? or array?
    else if (pt instanceof ListType)
      {
      resultTree = new BAST("enumeration", BLESStoASTLexer.LITERAL_enumeration, getLine(pt));
      }
//record_type : LITERAL_record^ LPAREN! record_field+ RPAREN!
//record_field : identifier COLON^ type SEMICOLON!
    else if (pt instanceof RecordType)
      {
      resultTree = new BAST("record", BLESStoASTLexer.LITERAL_record, getLine(pt));
      // put record fields on "record" root
      RecordType pcr = (RecordType) pt;
      EList<BasicProperty> ownedFieldsList = pcr.getOwnedFields();
      for (BasicProperty ownedField : ownedFieldsList)
        {
//      String fieldName = ownedField.getName();
        PropertyType opt = ownedField.getPropertyType();
        BAST fieldTypeTree = getTypeTree(opt);
        resultTree.addChild(fieldTypeTree);
        } // done adding all record fields
      } // done with record type
    else if (pt instanceof UnitsType)
      {
      resultTree = new BAST("units", BLESStoASTLexer.LITERAL_units, getLine(pt));
      // add units tree
//units_type :LITERAL_units^ units_list
//units_list : lp=LPAREN /*defining_unit_*/first_unit=identifier  ( COMMA au+=another_unit )* RPAREN
//another_unit : /*defining_unit_*/du=identifier arrow=ARROW /*unit_*/u=identifier star=TIMES n=NUMERIC_LIT
      } // done with units type
//range_type : LITERAL_range^ LITERAL_of! property_number_type
//| LITERAL_range^ LITERAL_of! /*number_*/unique_property_type_name
    else if (pt instanceof RangeType)
      {
      resultTree = new BAST("range", BLESStoASTLexer.LITERAL_range, getLine(pt));
      // then add children for either property_number_type or unique_property_type_name ??
      RangeType rt = (RangeType) pt;
//need to find range domain
      PropertyType rangeDomainType = rt.getNumberType();
      resultTree.addChild(getTypeTree(rangeDomainType));
      } // done with range type
    else if (pt instanceof NumericRange)
      {
      resultTree = new BAST("range", BLESStoASTLexer.LITERAL_range, getLine(pt));
      // then add children for either
//   range_type : LITERAL_range^ LITERAL_of! property_number_type
//    | LITERAL_range^ LITERAL_of! /*number_*/unique_property_type_name
      RangeType rt = (RangeType) pt;
      PropertyType rangeDomainType = rt.getNumberType();
      resultTree.addChild(getTypeTree(rangeDomainType));
      } // done with NUMERIC range type
    else if (pt instanceof ReferenceType)
      {
      resultTree = new BAST("ReferenceType", BLESStoASTLexer.DUMMY, getLine(pt));
      }
    else if (pt instanceof ClassifierType)
      { resultTree = new BAST("ClassifierType", BLESStoASTLexer.DUMMY, getLine(pt)); }
    return resultTree;
    } // end of getTypeTree

  /**             typedText =PropertyUtils.getStringValue(portData,blessTyped);
   *
   * @param ne
   * @param howTyped
   * @param defaultvalue
   * @return string value of the property fetched by OSATE
   * replaces PropertyNotPresentException with empty string, like before
   * this is because of a change made to PropertyUtils for somebody else,
   * that all of a sudden started throwing never before seen exceptions
   */
  public static String getPropertyStringValue(NamedElement ne, Property howTyped, String defaultvalue)
    {
    String typedText = "";
    try
      {
      typedText = PropertyUtils.getStringValue(ne, howTyped, defaultvalue);
      }
    catch (PropertyNotPresentException pnpe)
      {}
    return typedText;
    } // end of getPropertyStringValue

  public static String getBLESSassertionStringDirectly(Port p)
    {
    String result = "";
    try
      {
      result = ((StringLiteralImpl) p.getOwnedPropertyAssociations().get(0)
          .getOwnedValues().get(0).eContents().get(0))
          .getValue();
      }
    catch (Exception e)
      {}
    return result;
    }
  
  
  } // end of LoadBLESS
