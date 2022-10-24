package com.multitude.bless.record;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;

import com.multitude.bless.app.Global;
import com.multitude.bless.tree.BAST;

public class PropertySetRecord extends ParseRecord
{

//BAST root=null;

//String propertySetName="";

HashMap<String,BAST> propertyMap= new HashMap<String,BAST>();
HashMap<String,BAST> propertyTypeMap= new HashMap<String,BAST>();

//this is not currently used to ignore predeclared AADL properties
static HashMap<String,BAST> predeclaredAADLpropertyMap= new HashMap<String,BAST>();

public PropertySetRecord(BAST cu, String id, EObject aadlContext, PackageRecord pr)
{ //create a PropertySetRecord from a AST
	super(cu,id,aadlContext,pr);	//invoke ParseRecord constructor
//	root=cu;
//	propertySetName=root.getChild(0).getText();
//	Model.addPropertySet(id,this);
if (cu!=null) cu.setParseRecord(this);
}	//end of PropertySetRecord constructor


public void addProperty(BAST propertyRoot)
  {addProperty(propertyRoot.getText(),propertyRoot);}

  
public void addProperty(String propertyName, BAST propertyRoot)
{
  propertyMap.put(propertyName,propertyRoot);
  if (Global.parsingPredeclaredProperties)
    predeclaredAADLpropertyMap.put(propertyName,propertyRoot);
  } //end of addProperty

public boolean hasProperty(String propertyName)
  {
  return propertyMap.containsKey(propertyName);
  }

public BAST getProperty(String propertyName)
  {
  return propertyMap.get(propertyName);
  }

public void addPropertyType(String propertyName, BAST propertyRoot)
  {
  propertyTypeMap.put(propertyName,propertyRoot);
  if (Global.parsingPredeclaredProperties)
    predeclaredAADLpropertyMap.put(propertyName,propertyRoot);
  } //end of addProperty

public void addPropertyTyep(BAST propertyRoot)
  {addPropertyType(propertyRoot.getText(),propertyRoot);}

public boolean hasPropertyType(String propertyName)
  {
  return propertyTypeMap.containsKey(propertyName);
  }

public BAST getPropertyType(String propertyName)
  {
  return propertyTypeMap.get(propertyName);
  }

public static boolean hasPredeclaredProperty(String propertyName)
	{
	return predeclaredAADLpropertyMap.containsKey(propertyName);
	}

public static BAST getPredeclaredProperty(String propertyName)
	{
	return predeclaredAADLpropertyMap.get(propertyName);
	}

} //end of PropertySetRecord


