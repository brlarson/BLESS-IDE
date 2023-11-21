//BASTMap.java
//map of BAST trees
//made from a Vector of two-child trees

package com.multitude.bless.tree;

import java.util.Vector;

import com.multitude.bless.exceptions.YouIdiot;

public class BASTMap
	{
	
	public BASTMap()
	{
	map = new Vector<BAST>();
	}
	
	Vector<BAST> map;
	
	public void put(BAST key, BAST value)
		{
		BAST root = new BAST();
		root.addChild(key);
		root.addChild(value);
		map.add(root);
		}  //end of put
	
//must be root with two children like ^(AM lhs rhs)	
	public void put(BAST root)
		{
		map.add(root);
		}  //end of put

	public boolean containsKey(BAST key)
		{
		for (BAST root : map)
			{
//			try
//        {
        if (key.equalsTree((BAST)root.getChild(0)))
        	return true;
//        }
//      catch (YouIdiot e)
//        {
//          e.handleException();
//        }
			}
		return false;
		}  //end of containsKey

	public BAST get(BAST key)
		{
		for (BAST root : map)
			{
//			try
//        {
        if (key.equalsTree((BAST)root.getChild(0)))
        	return (BAST)root.getChild(1);
//        }
//      catch (YouIdiot e)
//        {
//          e.handleException();
//        }
			}
		return null;
		}  //end of containsKey

	
	public int size()
		{
		return map.size();
		}
	
	public boolean hasLoop()
	{
	for (int i=0;i<map.size();i++)
		{
		BAST start = (BAST)map.elementAt(i).getChild(0);
		if (hasLoop(start))
			return true;
		}	
	return false;
	}  //end of hasLoop

	//start at element 
	boolean 
hasLoop(BAST start)
	  {
	  BAST x=(BAST)start.getParent().getChild(1);
	  int count=0;
//	  try {
	  while ((x!=null)&&!x.equalsTree(start)&&containsKey(x)&&(count<100))
	    {x = get(x); count++;}
	  return (x!=null)&&x.equalsTree(start);
//	  }
//	  catch (YouIdiot e)
//	    {
//	    e.handleException();
//      return false;
//	    }	
	  }  //end of hasLoop
	
	}  //end of BASTMap
