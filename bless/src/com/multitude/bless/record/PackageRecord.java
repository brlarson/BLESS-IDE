//PackageRecord.java
//holds all the Maps for an AADL package

//(C) 2010 Multitude Corporation

package com.multitude.bless.record;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.osate.aadl2.AadlPackage;

import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.tree.BAST;

public class PackageRecord extends ParseRecord
{
public String packageID=null;	//identifier for this AADL package

//OSATE object for this PackageRecord, if any
public AadlPackage myAadlPackage = null;
//IFile for IResource
public IFile file = null;


//list of import declarations
public Vector<BAST> import_declarations = new Vector<BAST>();

public Vector<BAST> imported_package_names_and_property_set_identifiers = new Vector<BAST>();

//set of logic variable identifiers
public HashSet<String> logic_variable_identifiers = new HashSet<String>();
//map of component labels to the component's root AST node
public HashMap<String,ParseRecord> component_type_map = new HashMap<String,ParseRecord>();
//map of component implementation labels to the root AST node
public HashMap<String,ParseRecord> component_implementation_map = new HashMap<String,ParseRecord>();
//map of Assertion label to their Assertions in an Assertion annex library attached to the package
public HashMap<String,BAST> assertions_in_library = new HashMap<String,BAST>();

	public PackageRecord(BAST cu, String id, AadlPackage ir, IFile file) // cu=compilation unit root of package
		{
		super(cu, id, ir, null); // invoke ParseRecord constructor, null PackageRecord because we are the package
		myAadlPackage = ir;
		this.file = file;
//		Model.addPackage(id, this);
		if (cu != null)
			{
			cu.setParseRecord(this);
			}
		} // end of PackageRecord constructor
	
public void addComponent(String compName, ParseRecord pr)
	{
	component_type_map.put(compName,pr);
	}

public boolean hasComponent(String compName)
	{
	return component_type_map.containsKey(compName);
	}

public ParseRecord getComponent(String compName)
	{
	return component_type_map.get(compName);
	}

public void addImplementation(String compName, ParseRecord pr)
	{
	component_implementation_map.put(compName,pr);
	}

public boolean hasImplementation(String impName)
	{
	return component_implementation_map.containsKey(impName);
	}

public ParseRecord getImplementation(String impName)
	{
	return component_implementation_map.get(impName);
	}





//	public void
//fillScopeTree()
//  throws YI
//	{	//put declared things into symbol table
//		if (true)
//			{
//			if (ast.getScope()==null)
//				{
//				throw new YI("PackageRecord had null scope",ast);
////				ast.scope = new Scope(null,ast);	//create highest-level scope attached to root node
////				scope = ast.scope;
//				}
//			FillScopeTree treePattern = new FillScopeTree(new CommonTreeNodeStream(ast));
//			treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//			treePattern.downup(ast,false);  //scan tree down then up
//			}
//	}	//end of buildScopeTree

//	public void
//replaceDataModelReferences()
//	{	//replace (some) Data Model Annex references with their BLESS-equivalent types
//		if (true)
//			{
//			DataModelReferenceToBLESStype treePattern = new DataModelReferenceToBLESStype(new CommonTreeNodeStream(ast));
//			treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//			treePattern.downup(ast,false);  //scan tree down then up
//			}
//	}	//end of replaceDataModelReferences


	public void
linkImplementationScopesToTheirComponentTypes()
	{
  String[] impKey = component_implementation_map.keySet().toArray(new String[0]);
  for (int i = 0; i < impKey.length; i++)
    {
    try
      {
      String impName        = impKey[i];
      int    periodPosition = impName.indexOf('.');
      if (periodPosition < 1)
        {
        throw new YouIdiot("Implementation name \"" + impName + "\" didn\'t have a period.");
        }
      String compID = impName.substring(0, periodPosition);
      if (hasComponent(compID))
        {
        ParseRecord theImplementation = component_implementation_map.get(impName);
        ParseRecord theComponentType  = component_type_map.get(compID);
        // put all the entity records of the type into the implementation
//				theImplementation.ast.getScope().map.putAll(theComponentType.ast.getScope().map);
        if (theComponentType.port_assertion_map == null)
          {
          throw new YouIdiot("Null port assertion map for component type " + theComponentType.name);
          }
        theImplementation.port_assertion_map = new HashMap<String, BAST>(theComponentType.port_assertion_map);
        theImplementation.port_value_map     = new HashMap<String, BAST>(theComponentType.port_value_map);
//				theImplementation.port_assertion_map = ((HashMap<String,BAST>)theComponentType.port_assertion_map.clone());
        if (theImplementation.port_assertion_map == null)
          {
          throw new YouIdiot("Null port assertion map for component implementation " + theComponentType.name);
          }
        } else
        {
        throw new YouIdiot("Implementation \"" + impName + "\" does not have a component type \"" + compID + "\"");
        }
      } catch (YouIdiot yi)
      {
      yi.handleException();
      } catch (Exception ex)
      {
      Dump.it("In PackageRecord.linkImplementationScopesToTheirComponentTypes, " + "you threw an Exception! "
          + ex.getMessage());
      ex.printStackTrace();
      }
    } // end of for i
  } // end of linkImplementationScopesToTheirComponentTypes

/**
 * load maps for named-types, type operators, and enumeration types
 */
//  public void
//loadTypeMaps()
//  {
//  if (verbose()) Dump.it("load type maps for package "+name);
//  for (ParseRecord componentType : component_type_map.values())
//    componentType.loadTypeMaps();
//  for (ParseRecord componentImplementation : component_implementation_map.values())
//    componentImplementation.loadTypeMaps();
//}   //end of loadMaps

/**
 * Build scope tree for each component type and implementation in the package
 */
  @Override
	public void
buildScopeTree()
  { //operates right on ast--not a copy
		if (verbose())
		{
			Dump.it("build scope tree for package "+name);
			}
  for (ParseRecord componentType : component_type_map.values())
		{
			componentType.buildScopeTree();
			}
  for (ParseRecord componentImplementation : component_implementation_map.values())
		{
			componentImplementation.buildScopeTree();
			}
  } //end of buildScopeTree

  @Override
	public void
fillScopeTree()
  { //operates right on ast--not a copy
		if (verbose())
		{
			Dump.it("fill scope tree for package "+name);
			}
  for (ParseRecord componentType : component_type_map.values())
		{
			componentType.fillScopeTree();
			}
  for (ParseRecord componentImplementation : component_implementation_map.values())
		{
			componentImplementation.fillScopeTree();
			}
  } //end of fillScopeTree

  @Override
	public void
resolveReferences()
  { //operates right on ast--not a copy
		if (verbose())
		{
			Dump.it("resolve references for package "+name);
			}
  for (ParseRecord componentType : component_type_map.values())
		{
			componentType.resolveReferences();
			}
  for (ParseRecord componentImplementation : component_implementation_map.values())
		{
			componentImplementation.resolveReferences();
			}
  } //end of resolveReferences


//  public void
//normalizeTypes()
//  { //operates right on ast--not a copy
//  if (verbose()) Dump.it("normalizing types for package "+name);
//  for (ParseRecord componentType : component_type_map.values())
//    componentType.normalizeTypes();
//  for (ParseRecord componentImplementation : component_implementation_map.values())
//    componentImplementation.normalizeTypes();
//  } //end of normalizeTypes

  @Override
	public void
checkTypes()
  { //operates right on ast--not a copy
  if (Global.checkTypeWithProofTool)
    {
			if (verbose())
			{
				Dump.it("checking types for package "+name);
				}
    for (ParseRecord componentType : component_type_map.values())
			{
				componentType.checkTypes();
				}
    for (ParseRecord componentImplementation : component_implementation_map.values())
			{
				componentImplementation.checkTypes();
				}
    }
  } //end of checkTypes



} 	//end of PackageRecord


