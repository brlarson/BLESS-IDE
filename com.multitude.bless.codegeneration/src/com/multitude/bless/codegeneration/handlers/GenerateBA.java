package com.multitude.bless.codegeneration.handlers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.EcoreUtil2;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.DeviceImplementation;
import org.osate.aadl2.DeviceType;
import org.osate.aadl2.ThreadImplementation;
import org.osate.aadl2.ThreadType;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.modelsupport.util.AadlUtil;
import org.osate.ui.dialogs.Dialog;

import com.multitude.aadl.bless.bLESS.impl.ActionSubclauseImpl;
import com.multitude.aadl.bless.bLESS.impl.BLESSSubclauseImpl;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;
import com.multitude.bless.proof.handlers.GenerateVCHandler;
import com.multitude.bless.toast.ToAST;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.util.Util;

public class GenerateBA extends AbstractHandler implements IHandler
{



  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException
    {
//    Dump.it("Generating Data Model Components from BLESS types . . .");
    SystemInstance si = GenerateVCHandler.getSystemInstance();
    if (si == null) 
      {
      Dialog.showError("BLESS", "Please right-click system instance (.aaxl2) \n"+
       "to Generate BLESS Verification Conditions");
      Dump.it("Please right-click system instance (.aaxl2)");
      Dump.it("to Generate BLESS Verification Conditions.");
      return null;
      }
    // get output folder
//    generateDataModelforAllTypes(si);
//    Dump.it("Done generating Data Model Components from BLESS types.");
    Dump.it("Generating BA from BLESS  . . .");
    generateBAforAllThreads(si);
    Dump.it("Done generating BA from BLESS.");
    return null;
    }

  @Override
  public boolean isEnabled()
    {
    return true;
    }

  @Override
  public boolean isHandled()
    {
    return true;
    }

  
void generateBAforAllThreads(SystemInstance si) 
  {
  // set String Template for BA
  try
    {
    if (Global.BAtemplates == null)
      {
      Global.BAtemplates = Util.loadStringTemplateGroup(Global.stringTemplateGroupFolder + "BA.stg");
      }
    Global.templates = Global.BAtemplates;
    }
  catch (YouIdiot e1)
    {
    e1.handleException();
    }
  String rootName = si.getName();
  List<String>  path = new ArrayList<String>();
  path.add(rootName);
  //get all components having BLESS annex subclauses
  EList<ComponentInstance> cis = si.getComponentInstances();
  for (ComponentInstance ci : cis)
    generateBAForComponentInstance(path,ci);
  Global.templates = Global.BLESStemplates;
  }  //end of generateBAforAllThreads

private void 
generateBAForComponentInstance(List<String> path, ComponentInstance ci)
  {
  String componentName = ci.getName();
  path.add(componentName);
  if (ci.getClassifier() != null) 
    {
    List<BLESSSubclauseImpl> bas = EcoreUtil2.eAllOfType(ci.getClassifier(),
        BLESSSubclauseImpl.class);
//    if (bas.size() == 1)
    for (int i=0;i<bas.size();i++)  
      {
      try
        { 
        generateBAForBLESS(bas.get(i)); 
        }
      catch (YouIdiot yi)
        {
        Dump.it("Exception generating Slang from BLESS for "+componentName);
        yi.handleException();
        }
      }  //done with BLESS subclause
    //is there an Action subclause?
      
      List<ActionSubclauseImpl> act = EcoreUtil2.eAllOfType(ci.getClassifier(),
          ActionSubclauseImpl.class);
//      if (act.size() == 1)
      for (int i=0;i<act.size();i++) 
        {
        try
          { generateBAForAction(act.get(i)); }
        catch (YouIdiot yi)
          {
          Dump.it("Exception generating Slang from Action for "+path.toString());
          yi.handleException();
          }
        } //done with Action subclause
    }
  //do subcomponents
  for (ComponentInstance sub : ci.getComponentInstances())
    generateBAForComponentInstance(path, sub);   
  }  //end of generateBAForComponentInstance

  private void 
generateBAForAction(ActionSubclauseImpl actionSubclauseImpl)
  throws YouIdiot
  {
  
  
  }  //end of generateBAForAction

  private void  
generateBAForBLESS(BLESSSubclauseImpl blessSubclauseImpl)  
  throws YouIdiot
    {
    BAST ast = ToAST.TOAST.toAST(blessSubclauseImpl);
    StringBuffer sb = new StringBuffer();
    //get containing component type or implementation
    AadlPackage pack = AadlUtil.getContainingPackage(blessSubclauseImpl);
    Classifier c =  AadlUtil.getContainingClassifier(blessSubclauseImpl);
    String classifierKind = "";
    String classifierTypeName = "";  
//    String classifierImplementationName = "";  
    //what kind of component is it?
    if (c instanceof ThreadType)
      {
      classifierKind = "thread";
      classifierTypeName = c.getName();
      }
    else if (c instanceof ThreadImplementation)
      {
      classifierKind = "thread";
      int period = c.getName().indexOf('.');
      classifierTypeName = c.getName().substring(0, period);
//      classifierImplementationName = c.getName().substring(period+1);
      }
    else if (c instanceof DeviceType)
      {
      classifierKind = "device";
      classifierTypeName = c.getName();
      }
    else if (c instanceof DeviceImplementation)
      {
      classifierKind = "device";
      int period = c.getName().indexOf('.');
      classifierTypeName = c.getName().substring(0, period);
//      classifierImplementationName = c.getName().substring(period+1);
      }
    String baFileName =  ConfigurationPreferencePage.getBADirectory() + "/" +
//        ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() +
//        blessSubclauseImpl.eResource().getURI().path() + "/" + 
        c.getName().replace('.', '_') + ".aadl";
//make package text
    sb.append("--generated on "+Time.todayString + "\n");
    sb.append("package " + pack.getName() + "_" + c.getName().replace('.', '_') + "\n  public \n");
    sb.append("  with " + pack.getName() + ", BLESS_Types;\n\n");
    sb.append(classifierKind+" "+c.getName().replace('.', '_') + 
        " extends "+pack.getName()+"::"+classifierTypeName+"\n");
    sb.append("end "+c.getName().replace('.', '_') + 
        ";\n\n");
    sb.append(classifierKind+" implementation "+c.getName().replace('.', '_') + 
        ".ba\n");
    sb.append("annex Behavior_Specification \n{**\n");
    sb.append(ast.unparse());
    sb.append("\n**};\n");
    sb.append("end "+c.getName().replace('.', '_') + 
        ".ba;\n\n");
    sb.append("end "+pack.getName() + "_" + c.getName().replace('.', '_')+";\n");
//write to file
    writeBA(baFileName,sb.toString());
    }  //end of generateBAForBLESS
  
  
//  void 
//generateDataModelforAllTypes(SystemInstance si) 
//  {
//  
//  }  //end of generateDataModelforAllTypes

  
  
  void
writeBA(String fileName, String content)
  {
  File baFile = null;
  FileWriter baFileWriter = null;
  try
    {
    baFile = new File(fileName);
    if (baFile.exists()) baFile.delete();
    baFile.createNewFile();
    baFile.setWritable(true);
    baFileWriter = new FileWriter(baFile);
//    baPrintWriter = new PrintWriter(baFileWriter);
    Dump.it("opening BA file \""+baFile.getAbsolutePath()+"\" "+
        Time.todayString);
    }
  catch (IOException e)
    {
    Global.exceptionOccurred = true;
    Dump.it("Error while making BA file "+fileName);
    Dump.it("Please choose root directory for generated BA behavior:  Preferences > BLESS > BLESS preferences");
    e.printStackTrace(System.out);
    } //done catching file making
  try
    {
    baFileWriter.write(content,0,content.length());
    }
  catch (IOException e)
    {
    Dump.it("\nI/O error writing file "+fileName);
    e.printStackTrace(System.out);   // so we can get stack trace
    }
  //close the file
  try
    {
    baFileWriter.flush();  //flush the last characters of the file writer
    baFileWriter.close();  //close the file writer
    Dump.it("\n"+fileName+" is closed\n");
    }
  catch (IOException e)
    {
    Dump.it("\nError while closing "+fileName+"\n");
    e.printStackTrace();
    } //done catching file closing 
  }  //end of writeBA


}
