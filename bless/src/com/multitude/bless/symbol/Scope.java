//Scope.java
//holds Map of variable ID to EntityRecord
//may be nested


//(C) 2010 Multitude Corporation

package com.multitude.bless.symbol;

import java.util.HashMap;
import java.util.Vector;

import com.multitude.bless.record.EntityRecord;
import com.multitude.bless.tree.BAST;

public class Scope
{
public Scope parent=null;	//parent Scope, if any
HashMap<String,EntityRecord> map=new HashMap<String,EntityRecord>();	//map of variable IDs to their EntityRecord
public BAST root=null;	//root of AST that this scope covers
Vector<Scope> subScope=new Vector<Scope>(); 	//sub-scopes, if any

public String
toString()
	{
	return 
			"\nfrom Scope:  "+
			"\n   parent="+(parent==null?"null":parent.toString())+
			"\n   EntityRecord map="+map.toString()+
			"\n   root="+(root==null?"null":root.toString())+
			"\n   EntityRecord map="+map.toString()+
			"\n   Vector<Scope> subScope= not included"+
			"\n"
			;
	}  //end of toString
			
	public
Scope(Scope p, BAST r)
{	//add as subscope to parent if defined
parent=p; root=r;
if (p!=null) p.addSubScope(this);
}

	public void 
addSubScope(Scope sub)
	{ subScope.add(sub); }

	public EntityRecord 
get(String s)
	{ 
	if (map.containsKey(s)) //in this scope?
		return map.get(s);	//then get it
	else if (parent!=null) //o.w. have a parent scope?
		return parent.get(s);	//then get it from parent
	else return null; 	//o.w. return null to say no find
	}	//end of get

public boolean
has(String s)
	{
	if (map.containsKey(s)) //in this scope?
		return true;	//then we have it
	else if (parent!=null) //o.w. have a parent scope?
		return parent.has(s);	//does parent have it?
	else return false; 	//o.w. return false to say no find	
	}	//end of has
	
	public void 
add(EntityRecord er)
	{ map.put(er.id,er); }

}	//end of Scope
