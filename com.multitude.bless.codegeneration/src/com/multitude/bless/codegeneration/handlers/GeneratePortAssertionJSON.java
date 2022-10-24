/**
 * GeneratePortAssertionJSON.java
 */
package com.multitude.bless.codegeneration.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.multitude.bless.app.Global;
import com.multitude.bless.codegeneration.WriteJSONFile;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.record.PackageRecord;
import com.multitude.bless.record.ParseRecord;
import com.multitude.bless.symbol.LoadBLESS;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.util.Util;

/**
 * @author brl
 *
 */
public class GeneratePortAssertionJSON extends AbstractHandler implements IHandler
	{
  boolean verbose=true;
    
  String folderString = "";
  
	/* (non-Javadoc)
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
		{
		Dump.it("Generating JSON for port BLESS::Assertion properties . . .");
		//load the model, if not already loaded
		if (!LoadBLESS.haveLoaded)
			try
			{
			LoadBLESS.load();
			}
		catch (YouIdiot e)
			{
			Dump.it(e);
			}
//			{
//			Dump.it("please Load the model before trying to generate code");
//			}		
//		else
		generateJSONforAllCompponents();
		Dump.it("Done Generating JSON for port Assertions");

		return null;
		}  //end of execute
	
	@Override
  public boolean isEnabled() {return true;}
	
	@Override
  public boolean isHandled() {return true;}
	
void generateJSONforAllCompponents()
	{
	//choose output directory
	Dump.it("choose directory (without spaces or special characters other" + "than \"_\") for generated JSON files");
  Shell shell = new Shell(PlatformUI.getWorkbench().getDisplay());
	DirectoryDialog dd = new DirectoryDialog(shell,SWT.OPEN);
	dd.setMessage("choose directory for generated JSON files");
	folderString = dd.open();
	Global.wrapLength = 100;
	//set String Template for JSON
	try
		{
	if (Global.JSONtemplates==null)
	  Global.JSONtemplates=Util.loadStringTemplateGroup(Global.stringTemplateGroupFolder+"JSON.stg");
	Global.templates = Global.JSONtemplates;
  //find PackageRecord loaded in workspace
	for (ParseRecord pr : Global.compilationUnits)
		if ((pr instanceof PackageRecord))  //&&(pr.name.compareTo(packageName)==0))
			{  //find component types with ports
			String packageName = ((PackageRecord)pr).name;
			if ((packageName==null)||(packageName.length()<1) )
				throw new YouIdiot("PackageRecord had null name");
			for (ParseRecord tt : ((PackageRecord)pr).component_type_map.values())
				{
				generateJSONforPortAssertions(tt,packageName);
				}	
			}
		}
	catch (YouIdiot e1) { e1.handleException(); }
	}  // end of generateJSONforAllCompponents

private void generateJSONforPortAssertions(ParseRecord tt, String packageName) 
		throws YouIdiot
	{
	Boolean foundAPortAssertion = false;
	String fullyQualifiedName = packageName+"::"+tt.name;
	String jsonFileName = folderString+"/"+tt.name;
	StringBuffer sb = new StringBuffer();
	sb.append("{ \"component\" : \""+fullyQualifiedName+"\", \n");
	sb.append("  \"ports\" : [\n");
	boolean first = true;
	if (tt.port_assertion_map!=null)
	for (String portID : tt.port_assertion_map.keySet())
		{
		if (!first) sb.append(",\n");
		sb.append("  {\"portID\" : \""+portID+"\", \n");
		if ((tt.in_ports!=null)&&(tt.in_ports.contains(portID)))
			sb.append("  \"direction\" : \"in\"");
		else if ((tt.out_ports!=null)&&(tt.out_ports.contains(portID)))
			sb.append("  \"direction\" : \"out\"");
		else  // throw new YouIdiot("port "+portID+" is neither in nor out");
			sb.append("  \"direction\" : \"?\"");
		BAST pa = tt.port_assertion_map.get(portID);
		if (pa!=null)
			{  //found a port with an Assertion
			foundAPortAssertion = true;
			sb.append(", \n"+pa.unparse());
			}
		sb.append("}");
		first = false;
		}  //done with all ports
	sb.append("\n  ]\n}");
	if (foundAPortAssertion)
		WriteJSONFile.writeJSON(jsonFileName,sb.toString());
	}  //end of generateJSONforPortAssertions

	
}  //end of GeneratePortAssertionJSON
