package com.multitude.aadl.bless.util

import com.multitude.aadl.bless.bLESS.UnitName
import java.util.ArrayList
import java.util.Iterator
import java.util.List
import org.eclipse.emf.common.util.EList

class UnitRecord
{
//	@Inject package UnitUtil util
//  @Inject extension BlessIndex
	 
	public boolean isBase = false
	public UnitName rootUnit
	public UnitName myUnit
	public double conversionFactor = 1.0
	public List<String> top = new ArrayList<String>()
	public List<String> bottom = new ArrayList<String>()
	public boolean isScalar = false
	public boolean multiplyFactor = false
	// multiply by conversionFactor to get root unit
	public boolean divideFactor = false
	// divide by conversionFactor to get root unit
	public boolean isWhole = false
	public boolean notANumber = false

  //default constructor
  new(){}
  
	new(boolean isbase, UnitName myunit, UnitName rootunit, EList<UnitName> t, EList<UnitName> b, 
	  boolean isscalar, boolean mult, boolean div, double factor)
	{
		isBase = isbase
		myUnit = myunit
		rootUnit = rootunit
		if(t !== null)
		{
			for (UnitName un : t)
			{
				top.add(un.getName())
			}
		}
		if(b !== null)
		{
			for (UnitName un : b)
			{
				bottom.add(un.getName())
			}
		}
		isScalar = isscalar
		multiplyFactor = mult
		divideFactor = div
		conversionFactor = factor
	}

	new(boolean isbase, UnitName myunit, UnitName rootunit, List<String> t, List<String> b, boolean isscalar, 
	  boolean mult, boolean div, double factor, boolean iswhole, boolean nan)
	{
		isBase = isbase
    myUnit = myunit
		rootUnit = rootunit
		top = t
		bottom = b
		isScalar = isscalar
		multiplyFactor = mult
		divideFactor = div
		conversionFactor = factor
		isWhole = iswhole
		notANumber = nan
	}

	// end of constructor
	def UnitRecord copy()
	{
		return new UnitRecord(isBase, myUnit, rootUnit, top, bottom, isScalar, multiplyFactor, divideFactor, conversionFactor,
			isWhole,notANumber)
	}
	
	def void sort()
	{
	  top?.sort
	  bottom?.sort
	}

	def void removeCommonUnits()
	{
	  sort
		var Iterator<String> topIter = top.iterator()
		var List<String> newTop = new ArrayList<String>()
		while(topIter.hasNext())
		{
			var String un = topIter.next()
			if(bottom.contains(un))
			{
				bottom.remove(un)
			}
			else
			{
				newTop.add(un)
			}
		}
		top = newTop
	}

	def void multiply(UnitRecord ur)
	{
		if(ur.isScalar)
		{
			return;
		}
		top.addAll(ur.top)
		bottom.addAll(ur.bottom)
		removeCommonUnits()
		isScalar = top.isEmpty() && bottom.isEmpty()
	}

	def void divide(UnitRecord ur)
	{
		top.addAll(ur.bottom)
		bottom.addAll(ur.top)
		top.sort([o1, o2|o1.compareTo(o2)])
		removeCommonUnits()
		isScalar = top.isEmpty() && bottom.isEmpty()
	}

	def boolean sameRootUnit(UnitRecord ur)
	{
		if((rootUnit !== null) && (ur.rootUnit !== null) && (rootUnit === ur.rootUnit))
		{
			return true
		}
		else
		{
			return top.equals(ur.top) && bottom.equals(ur.bottom)
		}
	}

	def boolean matchTopAndBottom(UnitRecord ur)
	{
    if(notANumber && ur.notANumber)
      return true
    if(notANumber && !ur.notANumber)
      return false
    if(!notANumber && ur.notANumber)
      return false
    if((isScalar||isWhole)&&(ur.isScalar||ur.isWhole))
      return true
    if(!(isScalar||isWhole)&&(ur.isScalar||ur.isWhole))
      return false
    if((isScalar||isWhole)&&!(ur.isScalar||ur.isWhole))
      return false
    if(top === null && ur.top !== null)
      return false
    if(top !== null && ur.top === null)
      return false
    if(bottom === null && ur.bottom !== null)
      return false
    if(bottom !== null && ur.bottom === null)
      return false
    if(top !== null && ur.top !== null && top.size() !== ur.top.size())
      return false
    if(bottom !== null && ur.bottom !== null && bottom.size() !== ur.bottom.size())
      return false
    sort
    ur.sort
    if(top !== null)
		for (var int t = 0; t < top.size(); t++)
			if(!top.get(t).contentEquals(ur.top.get(t)))
				return false
		if(bottom !== null)
		for (var int b = 0; b < bottom.size(); b++)
			if(!bottom.get(b).contentEquals(ur.bottom.get(b)))
				return false
		return true
	}

	override String toString()
	{
		var StringBuffer sb = new StringBuffer()
		if(isScalar)  // || (top.isEmpty && bottom.isEmpty))
			sb.append("scalar")
    else if(isWhole)
      sb.append("whole")
    else if(notANumber)
      sb.append("not-a-number")
		else
		{
			if(top === null || top.isEmpty())
				sb.append("1")
			else if (top !== null)
			for (String t : top)
				sb.append(t)
			if(bottom !== null && !bottom.isEmpty())
			  {
				sb.append("/")
			  for (String b : bottom)
				  sb.append(b)
			  }
		}
		return sb.toString()
	}
}
