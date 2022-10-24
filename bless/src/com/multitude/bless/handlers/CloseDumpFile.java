/**
 * CloseDumpFile.java
 */
package com.multitude.bless.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
//import com.multitude.bless.Activator;
import com.multitude.bless.exceptions.Dump;

/**
 * @author brl
 *
 */
public class CloseDumpFile extends AbstractHandler implements IHandler
	{

	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
		{
//		Dump.it("emit Data Model");
//		Activator.consoleStream.println("emit Data Model");
		Dump.it("closing dump.txt");
		Dump.close();
		Dump.it("Dump File Closed");
		return null;
		}
	
	@Override
  public boolean isEnabled() {return true;}
	
	@Override
  public boolean isHandled() {return true;}
	
	}
