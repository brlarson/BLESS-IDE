package com.multitude.bless.app;
//(C) 2006 Multitude Corporation


//created 1/19/99 brl
//updated 1/1/2010

import java.util.Date;

	public class
Time
{

  public static long
startTime=0;	//starting time
  public static Date
today=null;
  public static String
todayString="";
  
	public static String
niceTime(long ms)
	{	//convert time in milliseconds to nice time
	String theTime=null;
	if (ms<1000) //less than a second
		theTime = String.valueOf(ms)+" milliseconds ";
	else if (ms<60000)	//less than a minute
		theTime =  String.valueOf(ms/1000)+"."+String.valueOf((ms/100)%10)+
				" seconds ";
	else
		theTime =  String.valueOf(ms/60000)+" minutes "+
				String.valueOf((ms%60000)/1000)+" seconds ";
	return theTime;
	}

}	//end of Time (oh no!)