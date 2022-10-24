//WriteISOSCELESFile.java
//write-out generated C++/Genode for ISOSCELES to file


package com.multitude.bless.codegeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.exceptions.Dump;


public class WriteISOSCELESFile
{

//	public static String isocProjectName = "ISOSCELES";
//	public static String isocFolderName = "generated";

	static File isocFile;
	static FileWriter isocFileWriter;
//public static PrintWriter isocPrintWriter;

	/**
	 * write generated ISOSCELES code
	 * @param componentName
	 * @param content
	 */
	@SuppressWarnings("deprecation")
	public static void writeISOSCELES(String folderName, String componentName, String content)
	{
		String fileName = folderName + "/"+ componentName + ".cc";
			try
			{
			Files.createDirectories(Paths.get(folderName));
		  isocFile = new File(fileName);
			isocFileWriter = new FileWriter(isocFile);
//			isocPrintWriter = new PrintWriter(isocFileWriter);
				Dump.it("opening ISOSCELES file \"" + isocFile.getAbsolutePath() + "\" " +
						Time.todayString);
			}
			catch (IOException e)
			{
				Global.exceptionOccurred = true;
				System.out.println("Error while making ISOSCELES file " + fileName);
				e.printStackTrace(System.out);
			} //done catching file making
		try
		{
			if (isocFileWriter!=null) {
				isocFileWriter.write(content, 0, content.length());
			}
		}
		catch (IOException e)
		{
			System.out.println("\nI/O error writing ISOSCELES file " + isocFile.getAbsolutePath());
			e.printStackTrace(System.out);   // so we can get stack trace
		}
		//close the file
		try
		{
			isocFileWriter.flush(); // flush the last characters of the file writer
			isocFileWriter.close(); // close the file writer
			Dump.it("\n"+fileName+" is closed\n");
		}
		catch (IOException e)
		{
			Dump.it("\nError while closing "+fileName+"\n");
			e.printStackTrace();
		} //done catching file closing
//create target.mk file
		String target_mk = "TARGET = " + componentName + "\n" + "SRC_CC = " + componentName + ".cc\n" + "LIBS   = base\n\n"
				+ "CC_CXX_WARN_STRICT=\n\n";
		String mkName = folderName + "/target.mk";
		try {
			isocFile = new File(mkName);
			isocFileWriter = new FileWriter(isocFile);
//		isocPrintWriter = new PrintWriter(isocFileWriter);
			Dump.it("opening ISOSCELES file \"" + isocFile.getAbsolutePath() + "\" " + Time.todayString);
		} catch (IOException e) {
			Global.exceptionOccurred = true;
			System.out.println("Error while making ISOSCELES file " + fileName);
			e.printStackTrace(System.out);
		} // done catching file making
		try {
			if (isocFileWriter != null) {
				isocFileWriter.write(target_mk, 0, target_mk.length());
			}
		} catch (IOException e) {
			System.out.println("\nI/O error writing ISOSCELES file " + isocFile.getAbsolutePath());
			e.printStackTrace(System.out); // so we can get stack trace
		}
		// close the file
		try {
			isocFileWriter.flush(); // flush the last characters of the file writer
			isocFileWriter.close(); // close the file writer
			Dump.it("\n" + mkName + " is closed\n");
		} catch (IOException e) {
			Dump.it("\nError while closing " + mkName + "\n");
			e.printStackTrace();
		} // done catching file closing

	} // end of writeISOSCELES



} // end of WriteISOSCELESFile
