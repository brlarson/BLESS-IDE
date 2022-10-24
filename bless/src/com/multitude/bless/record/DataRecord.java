//DataRecord.java
//holds all the Maps for a data component

//(C) 2010 Multitude Corporation

package com.multitude.bless.record;

import org.eclipse.emf.ecore.EObject;

import com.multitude.bless.tree.BAST;

public class DataRecord extends ParseRecord
{
////map of type labels to the AST of its type expression
//public HashMap<String,BAST> type_map = new HashMap<String,BAST>();
////map of type-operator labels to the AST of its type-operator expression (includes formals)
//public HashMap<String,BAST> type_operator_map = new HashMap<String,BAST>();

public String bless_typed_text = "";  //hold the string of the BLESS::Typed property, if any
public BAST blessType = null;  //holds the AST parsed from the text

public DataRecord(BAST cu, String id, EObject aadlContext, PackageRecord pr)	//cu=compilation unit root of thread
{
super(cu,id,aadlContext,pr);
if (cu!=null) 		
	cu.setParseRecord(this);
}	//end of SubprogramRecord constructor

public DataRecord(BAST cu, String id, String imp, EObject aadlContext, PackageRecord pr)	//cu=compilation unit root of thread
{
super(cu,id,imp,aadlContext,pr);
if (cu!=null) 		
	cu.setParseRecord(this);
}	//end of SubprogramRecord constructor

} 	//end of SubprogramRecord


