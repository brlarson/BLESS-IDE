//WriteSlangFile.java
//write-out generated Slang to file


package com.multitude.bless.codegeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;


public class WriteSlangFile
{

public static String slangProjectName = "Slang";
public static String slangFolderName = "generated";

public static File slangFile;
public static FileWriter slangFileWriter;
//public static PrintWriter slangPrintWriter;

/**
 * write generated Slang code
 * @param componentName
 * @param content
 */
@SuppressWarnings("deprecation")
public static void writeSlang(String componentName, String content, String directoryName)
  {
  String fileName = componentName+".scala";
	//set up slang file
	try
		{
		File directory = new File(directoryName);
    if (directory.mkdirs())
      Dump.it("Directory created:  "+directoryName);
    Dump.it("opening Slang file:  "+fileName);
		slangFile = new File(directoryName+fileName);
		if (slangFile.exists()) slangFile.delete();
		slangFile.createNewFile();
		slangFile.setWritable(true);
		slangFileWriter = new FileWriter(slangFile);
//			slangPrintWriter = new PrintWriter(slangFileWriter);
		Dump.it("writing Slang file:  "+slangFile.getAbsolutePath());
    slangFileWriter.write(content,0,content.length());
    slangFileWriter.flush();  //flush the last characters of the file writer
    slangFileWriter.close();  //close the file writer
    Dump.it("closing Slang file:  "+slangFile.getAbsolutePath());
		}
	catch (IOException e)
		{
		Global.exceptionOccurred = true;
		System.out.println("Error while making Slang file "+fileName);
		e.printStackTrace(System.out);
		} //done catching file making

//
//  IWorkspace workspace = ResourcesPlugin.getWorkspace();
//  IProject slangProject = workspace.getRoot().getProject(slangProjectName);
//  if (!slangProject.exists())
//    try
//      {
//      slangProject.create(null);
//      }
//    catch (CoreException e1)
//      {
//      Dump.it("CoreException when creating project \""+slangProjectName+"\"");
//      e1.printStackTrace();
//      }
//  if (!slangProject.isOpen())
//    try
//      {
//      slangProject.open(null);
//      }
//    catch (CoreException e1)
//      {
//      Dump.it("CoreException when opening project \""+slangProjectName+"\"");
//      e1.printStackTrace();
//      }
//  IFolder slangFolder = slangProject.getFolder(slangFolderName);
//  if (!slangFolder.exists())
//    try
//      {
//      slangFolder.create(false, false, null);
//      }
//    catch (CoreException e1)
//      {
//      Dump.it("CoreException when creating folder \""+slangFolderName+"\"");
//      e1.printStackTrace();
//      }
//  IFile slangFile = slangFolder.getFile(fileName);
//  FileOutputStream outputStream = new FileOutputStream(slangFile);
//  try { slangFile.delete(true,false,null); }
//  catch (CoreException e1)
//    { }
//  try
//    {
//    String slangString = componentName+"\n"+content;
//    slangFile.create(new ByteArrayInputStream(slangString.getBytes("UTF-8")), true, null);
////    slangFile.setContents(new StringBufferInputStream(componentName+"\n"+content),true,false,null);
////    slangFile.appendContents(new StringBufferInputStream(content),true,false,null);
////    slangFile.close ???
//    }
//  catch (CoreException e)
//    {
////    Dump.it("CoreException when writing \""+slangFile.getName()+"\"");
//    Dump.it(e.getMessage());
//    e.printStackTrace();
//    }
//  catch (UnsupportedEncodingException e)
//    {
//    Dump.it("UTF-8 is not a string encoding supported on this platform.");
//    e.printStackTrace();
//    }
  }  //end of writeSlang



}  //end of WriteSlangFile
