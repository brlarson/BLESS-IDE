//WriteBAv1File.java



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

public class WriteBAv1File
{

public static String bav1FolderName = "BAv1";
public static String bav1extension = "bav1";


//@SuppressWarnings("deprecation")
public static void writeBAv1(String componentName, String projectName, String content)
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
  IFolder signatureFolder = configurationProject.getFolder(bav1FolderName);
  if (!signatureFolder.exists())
    try
      {
      signatureFolder.create(false, false, null);
      }
    catch (CoreException e1)
      {
      Dump.it("CoreException when creating folder \""+bav1FolderName+"\"");
      e1.printStackTrace();
      }
  String fileName = componentName.replace('.','_')+"."+bav1extension;   
  IFile signatureFile = signatureFolder.getFile(fileName);
//  FileOutputStream outputStream = new FileOutputStream(signatureFile);
  try { signatureFile.delete(true,false,null); }
  catch (CoreException e1)
    { }
  try
    {
    String signatureString = "--"+componentName+"\n"+content;
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
  }  //end of writeBAv1



}  //end of WriteBAv1File
