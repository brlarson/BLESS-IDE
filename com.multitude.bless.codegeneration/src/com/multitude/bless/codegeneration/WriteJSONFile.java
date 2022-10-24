//WriteJSONFile.java
//write-out generated JSON to file


package com.multitude.bless.codegeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.exceptions.Dump;


public class WriteJSONFile
{

public static String jsonProjectName = "JSON";
public static String jsonFolderName = "generated";

public static File jsonFile;
public static FileWriter jsonFileWriter;
//public static PrintWriter jsonPrintWriter;

/**
 * write generated JSON code 
 * @param componentName
 * @param content
 */
@SuppressWarnings("deprecation")
public static void writeJSON(String componentName, String content)
  {
  String fileName = componentName.replace('.','_')+".json";   
		try
			{
			jsonFile = new File(fileName);
			jsonFileWriter = new FileWriter(jsonFile);
//			jsonPrintWriter = new PrintWriter(jsonFileWriter);
			Dump.it("opening JSON file \""+jsonFile.getAbsolutePath()+"\" "+
					Time.todayString);
			}
		catch (IOException e)
			{
			Global.exceptionOccurred = true;
			System.out.println("Error while making JSON file "+fileName);
			e.printStackTrace(System.out);
			} //done catching file making
	try
	{
	Dump.it(content);
	jsonFileWriter.write(content,0,content.length());
	}
catch (IOException e)
	{
	System.out.println("\nI/O error writing dump.txt file");
	e.printStackTrace(System.out);   // so we can get stack trace
	}
	//close the file
  try
  {
  jsonFileWriter.flush();  //flush the last characters of the file writer
  jsonFileWriter.close();  //close the file writer
  Dump.it("\n"+fileName+" is closed\n");
  }
  catch (IOException e)
  {
  Dump.it("\nError while closing "+fileName+"\n");
  e.printStackTrace();
  } //done catching file closing

//
//  IWorkspace workspace = ResourcesPlugin.getWorkspace();
//  IProject jsonProject = workspace.getRoot().getProject(jsonProjectName);
//  if (!jsonProject.exists())
//    try
//      {
//      jsonProject.create(null);
//      }
//    catch (CoreException e1)
//      {
//      Dump.it("CoreException when creating project \""+jsonProjectName+"\"");
//      e1.printStackTrace();
//      }
//  if (!jsonProject.isOpen())
//    try
//      {
//      jsonProject.open(null);
//      }
//    catch (CoreException e1)
//      {
//      Dump.it("CoreException when opening project \""+jsonProjectName+"\"");
//      e1.printStackTrace();
//      }
//  IFolder jsonFolder = jsonProject.getFolder(jsonFolderName);
//  if (!jsonFolder.exists())
//    try
//      {
//      jsonFolder.create(false, false, null);
//      }
//    catch (CoreException e1)
//      {
//      Dump.it("CoreException when creating folder \""+jsonFolderName+"\"");
//      e1.printStackTrace();
//      }
//  IFile jsonFile = jsonFolder.getFile(fileName);
//  FileOutputStream outputStream = new FileOutputStream(jsonFile);
//  try { jsonFile.delete(true,false,null); }
//  catch (CoreException e1)
//    { }
//  try
//    {
//    String jsonString = componentName+"\n"+content;
//    jsonFile.create(new ByteArrayInputStream(jsonString.getBytes("UTF-8")), true, null);
////    jsonFile.setContents(new StringBufferInputStream(componentName+"\n"+content),true,false,null);
////    jsonFile.appendContents(new StringBufferInputStream(content),true,false,null);
////    jsonFile.close ???
//    }
//  catch (CoreException e)
//    {
////    Dump.it("CoreException when writing \""+jsonFile.getName()+"\"");
//    Dump.it(e.getMessage());
//    e.printStackTrace();
//    }
//  catch (UnsupportedEncodingException e)
//    {
//    Dump.it("UTF-8 is not a string encoding supported on this platform.");
//    e.printStackTrace();
//    } 
  }  //end of writeJSON



}  //end of WriteJSONFile
