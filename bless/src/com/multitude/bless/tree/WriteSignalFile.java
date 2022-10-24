//WriteSignalFile.java



package com.multitude.bless.tree;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import com.multitude.bless.exceptions.Dump;

public class WriteSignalFile
{

public static String extension = "sig";


//@SuppressWarnings("deprecation")
public static void writeSignal(String packageName, String projectName, StringBuffer content)
  {
  IWorkspace workspace = ResourcesPlugin.getWorkspace();
  IProject configurationProject = workspace.getRoot().getProject(projectName);
  if (!configurationProject.exists())
    try
      {
      configurationProject.create(null);
      }
    catch (CoreException e1)
      {
      Dump.it("CoreException when creating project \""+projectName+"\"");
      e1.printStackTrace();
      }
  if (!configurationProject.isOpen())
    try
      {
      configurationProject.open(null);
      }
    catch (CoreException e1)
      {
      Dump.it("CoreException when opening project \""+projectName+"\"");
      e1.printStackTrace();
      }
  IFolder signatureFolder = configurationProject.getFolder(packageName);
  if (!signatureFolder.exists())
    try
      {
      signatureFolder.create(false, false, null);
      }
    catch (CoreException e1)
      {
      Dump.it("CoreException when creating folder \""+packageName+"\"");
      e1.printStackTrace();
      }
  String fileName = packageName.replace(':','_')+"."+extension;   
  IFile signatureFile = signatureFolder.getFile(fileName);
//  FileOutputStream outputStream = new FileOutputStream(signatureFile);
  try { signatureFile.delete(true,false,null); }
  catch (CoreException e1)
    { }
  try
    {
    String signatureString = "%"+fileName+"%\n"+content;
    signatureFile.create(new ByteArrayInputStream(signatureString.getBytes("UTF-8")), true, null);
    }
  catch (CoreException e)
    {
//    Dump.it("CoreException when writing \""+signatureFile.getName()+"\"");
    Dump.it(e.getMessage());
    e.printStackTrace();
    }
  catch (UnsupportedEncodingException e)
    {
    Dump.it("UTF-8 is not a string encoding supported on this platform.");
    e.printStackTrace();
    } 
  }  //end of writeSignal



}  //end of WriteSignalFile
