package com.multitude.bless.toPilar;

import org.antlr.stringtemplate.AttributeRenderer;

public class TypeRenderer implements AttributeRenderer
{

	public String toString(Object o)
		{
		return o.toString();
		}

	public String toString(Object o, String formatName)
		{
		if (formatName.equals("attribute"))
			return makeIntoAttribute(toString(o));
		if (formatName.equals("globalize"))
			return makeIntoGlobal(toString(o));
		else
		  return toString(o);
		}

	    
    public static String makeIntoAttribute(String s) {
        s = "@"+Character.toUpperCase(s.charAt(0))+s.substring(1);
        return s;
    }
    
    public static String makeIntoGlobal(String s) {
        s = "@@"+Character.toUpperCase(s.charAt(0))+s.substring(1);
        return s;
    }

}
