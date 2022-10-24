//EntityRecord.java
//holds the ID-type-value binding for entities that have values during execution

//holds constant and literal values, during compilation; later to holds values during emulation

//created by declarations, or by lattice existential (declare) or universal (forall) quantification

//(C) 2010 Multitude Corporation

package com.multitude.bless.record;

import java.util.Vector;

import com.multitude.bless.tree.BAST;

public class EntityRecord
{
//mandatory values, all EntityRecord must have kind id & type
public int kind=0;				//what kind of entity is this?
public String id=null;		//the identifier of this entity
public BAST identifier=null;  //pointer to AST holding identifier of declaration
public BAST type=null;		//pointer to AST of type expression for this entity

//optional values
public BAST value=null;											//value of this entity, if any
public Vector<BAST> formal_parameters=null;	//type operator formal parameters, if any
public BAST assertion=null;									//the Assertion made for this entity, if any

//BLESS type, if any
public String typed=null;	//holds string from BLESS::Typed => "*";

//attributes of behavior variables
public boolean shared=false;			//is this a behavior variable declared to be shared?
public boolean spread=false;  //is this a behavior variable declared to be spread?
public boolean constant=false;  //is this a behavior variable declared to be constant?
public boolean nonvolatile=false;  //is this a behavior variable declared to be non-volatile?

//attributes of ports, only valid when kind=PORT
public boolean inPort=false;			//does this port accept events and/or data?
public boolean outPort=false;			//does this port produce events and/or data?
public boolean eventPort=false;			//does this port produce or accept events?
public boolean dataPort=false;			//does this port produce or accept data?

//constant definitions for kind=
public static int VARIABLE=1;					//this entity is a behavior variable
public static int TYPE_DECLARATION=2;	//this entity is a type declaration
public static int TYPE_OPERATOR=3;		//this entity is a type operator (use in type expressions after substitution of actual parameters for formal parameters)
public static int DATA_COMPONENT=4;		//this entity is an AADL data component external to the thread
public static int PORT=5;							//this entity is an AADL port feature
public static int STATE=6;						//this entity is a behavior state
public static int MODE=7;							//this entity is a system operating mode
public static int PROPERTY=8;					//this entity is an imported property
public static int ENUMERATION_LITERAL=10;					//this entity is a literal of an enumeration
public static int PARAMETER=10;					//this entity is a subprogram parameter

	public
EntityRecord(int k, BAST i)
{	//constructor, just kind and identifier
	kind=k; id=i.getText(); identifier=i;
}

	public
EntityRecord(int k, BAST i, BAST t)
{	//constructor,  kind, identifier, and type
	kind=k; id=i.getText(); identifier=i; type=t;
}

	public
EntityRecord(int k, BAST i, BAST t, BAST v)
{	//constructor,  kind, identifier, type, and value
	kind=k; id=i.getText(); identifier=i; type=t; value=v;
}



}	//end of EntityRecord
