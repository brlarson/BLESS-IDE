//SubprogramAccessFeature.java

package com.multitude.bless.symbol;

import org.eclipse.emf.ecore.EObject;
import com.multitude.bless.tree.BAST;
import java.util.HashMap;

  public class
SubprogramAccessFeature
{
public String featureID;  //id of the subprogram access feature in the component type
public int line=0;  //line number
public EObject sa;   //AADL SubprogramAccess (not yet set)
public EObject sst;  //AADL SubprogramSubcomponentType (not yet set)
public BAST precondition;
public BAST postcondition;
public HashMap<String,BAST> formal_type_map = new HashMap<String,BAST>(); 

public SubprogramAccessFeature(){}
		
//public SubprogramAccessFeature(String id, SubprogramAccess suba, SubprogramSubcomponentType sstype,
//	BAST pre, BAST post)
//{
//featureID=id; sa=suba; sst=sstype; precondition=pre; postcondition=post;
//}  //end of SubprogramAccessFeature constructor
//


};  //end of SubprogramAccessFeature  
  