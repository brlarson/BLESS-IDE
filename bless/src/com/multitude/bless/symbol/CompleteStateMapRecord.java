//CompleteStateMapRecord.java
//Maps a complete state and destination state with the dispatch condition that leads to them

package com.multitude.bless.symbol;
import com.multitude.bless.tree.BAST;
public class CompleteStateMapRecord
{
public String completeStateID = null;
public String destinationStateID = null;
public BAST dispatchCondition = null;

public CompleteStateMapRecord(String c, String d, BAST dc)
{completeStateID=c; destinationStateID=d; dispatchCondition=dc;
}

public String toString()
	{
	String s=null;
//	try
//		{
	 s= "source="+completeStateID+
	" destination="+destinationStateID+
	" dispatch condition="+dispatchCondition.toStringTree(); 
//		}
//	catch (YI yi) {;}
	return s;
	}	//end of toString

}	//end of CompleteStateMapRecord
