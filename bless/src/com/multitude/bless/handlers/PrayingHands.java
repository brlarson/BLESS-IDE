/**
 *
 */
package com.multitude.bless.handlers;

import java.util.Date;

import javax.swing.UIManager;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import com.multitude.aadl.bless.maps.BlessMaps;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.symbol.LoadBLESS;

/**
 * @author brl
 *
 */
public class PrayingHands extends AbstractHandler
	{

  boolean firstClick = true;

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
	 * ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
		{
		if (!Global.prayingHandsClicked)
      {
      Time.startTime              = System.currentTimeMillis();
      Time.today                  = new Date(Time.startTime);
      Time.todayString            = Time.today.toString();
      Global.runningAsOSATEplugin = true;
      try
        {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
      catch (Exception e)
        {
        if (!Global.dumpFileClosed)
          {
          Global.dumpToSystemOutToo = true;
          if (!Global.stackTracePrinted)
            {
            Dump.it(e.getMessage());
            e.printStackTrace(System.out);
            e.printStackTrace(Global.pw);
            Global.stackTracePrinted = true;
            }
          Global.exceptionOccurred = true;
          if (e instanceof YouIdiot)
            {
            ((YouIdiot) e).handleException();
            }
          Dump.close();
          }
        } // end of catch(Exception e)
      }
		Global.prayingHandsClicked = true;
//    if (Global.stopProof)
//      {
//      Dump.it("Your proof has been unstopped.");
//      Global.stopProof = false;
//      }
//    else 
    if (firstClick)
      {
      Dump.it("Welcome to the BLESS proof tool.");
      firstClick = false;
      }
    else
      {
      // flush caches
      BlessMaps.clearMaps();
      Dump.it("BLESS caches cleaned.");
      }

    try
      {
      LoadBLESS.load();
      }
    catch (YouIdiot e)
      {
      Dump.it("Error loading while praying.");
      e.handleException();
      }
		return null;
		}  //end of execute

	}  //end of PrayingHands
