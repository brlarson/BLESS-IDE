package com.multitude.aadl.bless;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class BlessControl {

	public static boolean cacheReferences = false;
	static String CONSOLE_NAME = "BLESS";
	static MessageConsole blessConsole = null;
	static MessageConsoleStream out = null;

  private static MessageConsole 
findConsole(String name) 
  {
  ConsolePlugin plugin = ConsolePlugin.getDefault();
  IConsoleManager conMan = plugin.getConsoleManager();
  IConsole[] existing = conMan.getConsoles();
  for (int i = 0; i < existing.length; i++)
     if (name.equals(existing[i].getName()))
        return (MessageConsole) existing[i];
  //no console found, so create a new one
  MessageConsole myConsole = new MessageConsole(name, null);
  myConsole.activate();
  conMan.addConsoles(new IConsole[]{myConsole});
  return myConsole;
  }
  
  public static void
println(String text)
  {
  if (out == null)
    {
    blessConsole = findConsole(CONSOLE_NAME);
    out = blessConsole.newMessageStream();
    }
  out.println(text);
//  System.out.println(text);
  }

} 