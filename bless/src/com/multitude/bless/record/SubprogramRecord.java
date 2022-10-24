//SubprogramRecord.java
//holds all the Maps for a subBLESS annex subclause attached to subprogram components

//(C) 2010 Multitude Corporation

package com.multitude.bless.record;

import org.eclipse.emf.ecore.EObject;

import com.multitude.bless.tree.BAST;

public class SubprogramRecord extends ParseRecord
{

public SubprogramRecord(BAST cu, String id, EObject aadlContext, PackageRecord pr)	//cu=compilation unit root of thread
{
	super(cu,id,aadlContext,pr);
	if (cu!=null)  // throw new YI("null parameter");	
		cu.setParseRecord(this);
}	//end of SubprogramRecord constructor

public SubprogramRecord(BAST cu, String id, String imp, EObject aadlContext, PackageRecord pr)	//cu=compilation unit root of thread
{
	super(cu,id,imp,aadlContext,pr);
	if (cu!=null)		
		cu.setParseRecord(this);
}	//end of SubprogramRecord constructor


} 	//end of SubprogramRecord


