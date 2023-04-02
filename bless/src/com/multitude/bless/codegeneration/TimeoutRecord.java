package com.multitude.bless.codegeneration;

import java.util.ArrayList;
import java.util.List;

import com.multitude.bless.antlr3generated.BLESS3Lexer;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.tree.BAST;

public class TimeoutRecord
{

public TimeoutRecord(){};

  public TimeoutRecord(BAST t)
    {
    StringBuffer sb = new StringBuffer("timeout_");
//load reset ports
    resetPorts = new ArrayList<BAST>();
    for (int ch = 1; ((BAST) t.getChild(ch)).hasType(BLESS3Lexer.ID); ch++)
      {
      resetPorts.add((BAST) t.getChild(ch));
      sb.append(t.getChild(ch).getText() + "_");
      }
    BAST behavior_time = (BAST) t.getChild(t.getChildCount() - 1);
    BAST e = (BAST) behavior_time.getChild(0);
    if (e.getChildCount() > 0)
      {
      Dump.it("Please don't use expressions for timeout durations!" + e.toStringTree());
      }
    else
      {
      duration = e.getText();
      sb.append(duration);
      }
    timeUnit = ((BAST) behavior_time.getChild(0)).getText();
    timeoutPortId = sb.toString();
    }

//public TimeoutRecord(List<Object> ports, BAST d, String t)
//  {
//  StringBuffer sb = new StringBuffer("timeout_");
//  if (d.getChildCount()==0)
//    {
//      duration = d.getText();
//      }
//  else {
//      duration = d.getText()+"x";  //not a number  duration = d;
//      }
//  //get rid of period if any
//  if (duration.contains("."))
//    {
//      duration = duration.substring(1, duration.indexOf(".")-1);
//      }
//  timeUnit = t;
//  resetPorts = new ArrayList<BAST>();
//  for (Object p : ports)
//    {
//      if (p instanceof BAST)
//      	{
//      	resetPorts.add((BAST)p);
//      	sb.append(((BAST)p).getText()+"_");
//      	if (ports.iterator().hasNext())
//          {
//            sb.append("or_");
//            }
//      	}
//      }
//  sb.append(duration+"_"+t);
//  timeoutPortId = sb.toString();
//  }

public String timeoutPortId;  //identifier of the port variable made for this timer
public List<BAST> resetPorts;  //ports that reset the timer
  public String duration = ""; // time after most recent reset to generate timeout event
  public String timeUnit = ""; // units of time, must be AADL standard time types

public List<String> getPortSet()
  {
  List<String> portSet = new ArrayList<String>();
  for (BAST b : resetPorts)
  	{
  	portSet.add(b.getText()+"_Id");
  	}
  return portSet;
  }

}
