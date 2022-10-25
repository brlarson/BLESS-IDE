//ParseRecord.java
//common to all objects parsed by BLESS
//subclasses:  ThreadRecord DataRecord SubprogramRecord


package com.multitude.bless.record;

import java.util.HashMap;
import java.util.Vector;

import org.eclipse.emf.ecore.EObject;

import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.symbol.Scope;
import com.multitude.bless.symbol.SubprogramAccessFeature;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;

public class ParseRecord
{
public EObject context=null;  //link to OSATE metamodel

public PackageRecord myPackageRecord=null;  //holds reference to AADL package holding this element

public String name="no name yet";
public String impID="";
public String fileName=null;
public BAST ast=null;	//abstract syntax tree root for this thread's BLESS annex subclause
//public Scope scope=null;	//root scope

//map of port labels to the ports' Assertion properties
public HashMap<String,BAST> port_assertion_map = null;  //created by BLESStoASTParser.component_type
//map of port labels to the ports' Value properties
public HashMap<String,BAST> port_value_map = null;  //created by BLESStoASTParser.component_type
//map of port labels to the ports' BLESS::Typed properties
public HashMap<String,BAST> port_typed_map = null;  //created by BLESStoASTParser.component_type
//map of subprogram access IDs to their SubprogramAccessFeature record
public HashMap<String,SubprogramAccessFeature> subprogram_access_map = null;
//is this a predeclared property or package?

//map of port IDs to EntityRecord
public HashMap<String,EntityRecord> port_entity_map = null;  //

//map of parameter IDs to EntityRecord
public HashMap<String,EntityRecord> parameter_entity_map = null;  //
//map of port labels to the parameters' Assertion properties
public HashMap<String,BAST> parameter_assertion_map = null;  //created by BLESStoASTParser.component_type
//map of port labels to the parameters' BLESS::Typed properties
public HashMap<String,BAST> parameter_typed_map = null;  //created by BLESStoASTParser.component_type


public Vector<String> in_ports = null;  //in port names, if any
public Vector<String> out_ports = null;  //in port names, if any


public boolean predeclared = false;

private int startingLine=0;

//verbose console output?
//public static boolean verbose=true;

	public static boolean verbose() {
		return ConfigurationPreferencePage.getVerboseParse();
	}

public ParseRecord(BAST cu, String id, EObject aadlContext, PackageRecord pr)
  {
  context=aadlContext;
  name=id;
  myPackageRecord=pr;
  if (cu!=null)
    {
    ast=cu;
    ast.setScope(new Scope(null,cu)); //tell ast what the root scope is
    }
  predeclared=Global.parsingPredeclaredProperties;  //set predeclared flag
  fileName=Global.fileName;
  }

public ParseRecord(BAST cu, String id, String imp, EObject aadlContext, PackageRecord pr)
  { //includes implementation ID
  context=aadlContext;
  impID=imp;
  name=id;
  myPackageRecord=pr;
  if (cu!=null)
    {
    ast=cu;
    ast.setScope(new Scope(null,cu)); //tell ast what the root scope is
    }
  predeclared=Global.parsingPredeclaredProperties;  //set predeclared flag
  fileName=Global.fileName;
  }


  public int
getStartingLine()
	{
	return startingLine;
	}

  public void
setStartingLine(int line)
	{
	startingLine=line;
	}

@Override
public String
toString()
	{
	return //super.toString()+
			"\nfrom ParseRecord:  "+
			"\n  name="+name.toString()+
			"\n  impID="+impID.toString()+
			"\n  fileName="+fileName.toString()+
			"\n  ast="+(ast==null?"null":ast.toStringTree())+
//			"\n  scope="+(scope==null?"null":scope.toString())+
			"\n  imported_package_names_and_property_set_identifiers="+
      (myPackageRecord!=null?myPackageRecord.imported_package_names_and_property_set_identifiers.toString():"")+
			"\n  logic_variable_identifiers="+
      (myPackageRecord!=null?myPackageRecord.logic_variable_identifiers.toString():"")+
      "\n  port_assertion_map="+port_assertion_map.toString()+
      "\n  port_assertion_map="+port_value_map.toString()+
			"\n"
			;
	}  //end of toString


public boolean
hasThisBeenImported(BAST x)
	{	//look through imported_package_names_and_property_set_identifiers for x
	for (int i=0;i<myPackageRecord.imported_package_names_and_property_set_identifiers.size();i++)
		{
		BAST psid=myPackageRecord.imported_package_names_and_property_set_identifiers.get(i);
		if (psid.isText(x.getText()))
			{
				return true;
				}
		}
	return false;
	}	//end of hasThisBeenImported

//  public void
//loadTypeMaps()
//  {   //invoke tree parser to load  Global.type_map  Global.type_operator_map  Global.label_enumeration_map
//    if (true)
//      if (ast!=null)
//      {
//      //use the same pattern to get three type maps
//      BAST new_ast = ast.dupTree();
//      LoadTypeMaps treePattern = new LoadTypeMaps(new CommonTreeNodeStream(new_ast));
//      treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//      //set PackageRecord in grammar
//      treePattern.pr=this.myPackageRecord;
//      treePattern.downup(new_ast,false);  //scan tree down then up
//      if (verbose()) Dump.it(name+" has loaded type maps");
//      }
////      else if (verbose()) Dump.it(name+" does not have a BLESS annex subclause");
//  } //end of loadTypeMaps

  public void
buildScopeTree()
  {
  if (true)
	 {
			//operates right on ast--not a copy
			if (ast!=null)
			  //invoke tree parser to build the scope tree
			    {
//  ast.showParseTree("buildScopeTree");
			    ast.setScope( new Scope(null,ast)); //create highest-level scope attached to root node
//    scope = ast.scope;
//			    BuildScopeTree treePattern = new BuildScopeTree(new CommonTreeNodeStream(ast));
//			    treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//			    treePattern.downup(ast,true);  //scan tree down then up
				if (verbose())
						{
							Dump.it(name+" has built scope tree");
							}
			    }
//  else if (verbose) Dump.it(name+" does not have a BLESS annex subclause");
			}
  } //end of buildScopeTree


  public void
fillScopeTree()
  {
  if (true)
	 {
			//put declared things into symbol table
			if (ast!=null)
			  {
			  //      if ((ast.scope==null)||(scope==null))
			  //        {
			  //        ast.scope = new Scope(null,ast);  //create highest-level scope attached to root node
			  //        scope = ast.scope;
			  //        }
//			  FillScopeTree treePattern = new FillScopeTree(new CommonTreeNodeStream(ast));
//			  treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//			  treePattern.downup(ast,false);  //scan tree down then up
				if (verbose())
					{
						Dump.it(name+" has filled scope tree");
						}
			  }
//    else if (verbose()) Dump.it(name+" does not have a BLESS annex subclause");
			}
  } //end of fillScopeTree



//  public void
//resolveReferences()
//  {
//  if (true)
//	 {
//			if (ast!=null)
//			    {
////			    ResolveReferences treePattern = new ResolveReferences(new CommonTreeNodeStream(ast));
////			    treePattern.setTreeAdaptor(new BASTTreeAdaptor());
////			    treePattern.parseRec=this;
////			    treePattern.downup(ast,false);  //scan tree down then up
//				if (verbose())
//						{
//							Dump.it(name+" has resolved references");
//							}
//			    }
////  else if (verbose) Dump.it(name+" does not have a BLESS annex subclause");
//			}
//  } //end of resolveReferences

//  public void
//normalizeTypes()
//  {
//  if (true)
////put type ASTs into normal form
//  if (ast!=null)
//      {
//      NormalizeType treePattern = new NormalizeType(new CommonTreeNodeStream(ast));
//      treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//      treePattern.pr=myPackageRecord;
//      treePattern.downup(ast,false);  //scan tree down then up
//      int scanCount = 1;
//      while (treePattern.madeChange&&(scanCount<10))
//        { //repeat until no changes. or scan count exceeds limit
//        treePattern.madeChange=false;
//        treePattern.downup(ast,false);  //scan tree down then up
//        scanCount++;
//        }
//      if (verbose()) Dump.it(name+" has normalized types");
//      }
////  else if (verbose()) Dump.it(name+" does not have a BLESS annex subclause");
//  } //end of normalizeTypes

  /** check (and fill-in) types of operators relations := */
  public void
checkTypes()
  {
  if (true&&Global.checkTypeWithProofTool)
	 {
			//use tree pattern matching to check and propagate types
			if (ast!=null)
			    {
//			    CheckType treePattern = new CheckType(new CommonTreeNodeStream(ast));
//			    treePattern.pr=myPackageRecord;
//			    treePattern.setTreeAdaptor(new BASTTreeAdaptor());
//      treePattern.initTime(); //initialize time type
//			    treePattern.downup(ast,false);  //scan tree down then up
				if (verbose())
						{
							Dump.it(name+" has checked types");
							}
			    }
//  else if (verbose()) Dump.it(name+" does not have a BLESS annex subclause");
//    catch (YI yi) {yi.handleException();}
			}
  } //end of checkTypes





}	//end of ParseRecord
