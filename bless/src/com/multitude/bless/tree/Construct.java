package com.multitude.bless.tree;
//(C) 2006 Multitude Corporation

//Construct.java

//created to make enumerated type used in BA.construct
//if this AST node forms the root of a DANCE construct like assignment

	public class
Construct
{
	//NEED TO UPDATE WITH BLESS CONSTRUCTS
public final static int NOTACONSTRUCT = 0;
public final static int ASSIGNMENT = 1;
public final static int CONCURRENT_COMPOSITION = 2;
public final static int SEQUENTIAL_COMPOSITION = 3;
public final static int EXISTENTIAL_QUANTIFICATION = 4;
public final static int UNIVERSAL_QUANTIFICATION = 5;
public final static int CONDITIONAL = 6;
public final static int ITERATIVE = 7;
public final static int SKIP = 8;
public final static int PROCEDURE_CALL = 9;
public final static int BOOLEAN_ASSIGNMENT = 10;
public final static int RETURN = 11;
public final static int COMBINABLE = 12;	//fetchadd etc.
public final static int ASSERTION = 13;	//not really a construct, but marked so we don't bother searching its branch for temporal formulae
public final static int MODULE_DECLARATION = 14;
public final static int MODULE_BODY = 15;
public final static int MODULE_SUBDIVISION = 16;
public final static int PROTOCOL = 17;
public final static int BODY = 18;


	public static String
getChar(int i)
	{
	String ch = "";
	switch (i)
		{
		case  NOTACONSTRUCT :
			ch = "?";
			break;
		case  ASSIGNMENT :
			ch = ":=";
			break;
		case  CONCURRENT_COMPOSITION :
			ch = "&";
			break;
		case  SEQUENTIAL_COMPOSITION :
			ch = " ;";
			break;
		case  EXISTENTIAL_QUANTIFICATION :
			ch = "B";
			break;
		case  UNIVERSAL_QUANTIFICATION :
			ch = "F";
			break;
		case  CONDITIONAL :
			ch = "if";
			break;
		case  ITERATIVE :
			ch = "D";
			break;
		case  SKIP :
			ch = "S";
			break;
		case  PROCEDURE_CALL :
			ch = "P";
			break;
		case  BOOLEAN_ASSIGNMENT :
			ch = "==";
			break;
		case  RETURN :
			ch = "R";
			break;
		case  COMBINABLE :
			ch = "C";
			break;
    case  ASSERTION :
      ch = "A";
      break;
    case  MODULE_DECLARATION :
      ch = "MD";
      break;
    case  MODULE_BODY :
      ch = "MB";
      break;
    case  MODULE_SUBDIVISION :
      ch = "MS";
      break;
    case  PROTOCOL :
      ch = "P";
      break;
    case  BODY :
      ch = "B";
      break;
		}	//end of switch			
	return ch;
	}	//end of getChar


}	//end of Construct