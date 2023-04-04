package com.multitude.bless.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

import com.multitude.bless.Activator;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.YouIdiot;

public class Util {

//	public enum SerializerType {
//		JSON, JSON_COMPACT, MSG_PACK
//	}
//
//	public static String serialize(Aadl model, SerializerType t) {
//		switch (t) {
//		case JSON:
//			return JSON.fromAadl(model, false);
//		case JSON_COMPACT:
//			return JSON.fromAadl(model, true);
//		case MSG_PACK:
//			IS<Z, U8> x = MsgPack.fromAadl(model, true);
//			String ret = org.sireum.conversions.String.toBase64(x).toString();
//			return ret;
//		default:
//			return null;
//		}
//	}
//
//	public static Aadl getAir(ComponentInstance root) {
//		return getAir(root, true);
//	}
//
//	public static Aadl getAir(ComponentInstance root, boolean includeDataComponents) {
//		return getAir(root, includeDataComponents, System.out);
//	}
//
//	public static Aadl getAir(ComponentInstance root, boolean includeDataComponents, MessageConsole console) {
//		try (OutputStream out = console.newOutputStream()) {
//			return getAir(root, includeDataComponents, out);
//		} catch (Throwable t) {
//			return null;
//		}
//	}
//
//	public static Aadl getAir(ComponentInstance root, boolean includeDataComponents, OutputStream out) {
//		try {
//			return new Visitor().convert(root, includeDataComponents).get();
//		} catch (Throwable t) {
//			PrintStream p = new PrintStream(out);
//			p.println("Error encountered while generating AIR");
//			t.printStackTrace(p);
//			p.close();
//			return null;
//		}
//	}
//
//	public static int callWrapper(String toolName, MessageConsole ms, IntSupplier f) {
//		int[] ret = {-1};
//
//		PrintStream out = new PrintStream(ms.newMessageStream());
//		PrintStream outOld = System.out;
//		PrintStream errOld = System.err;
//
//		System.setOut(out);
//		System.setErr(out);
//
//		Console.withOut(System.out, (Function0<Object>) () -> {
//            Console.withErr(System.err, (Function0<Object>) ()  -> {
//
//            	try {
//            		ret[0] = f.getAsInt();
//            	} catch (Throwable t) {
//					System.err.println("Exception raised when invoking " + toolName);
//            		t.printStackTrace(out);
//            	} finally {
//            		out.flush();
//            		try { if(out != null) {
//						out.close();
//					} }
//            		catch (Throwable t) { t.printStackTrace(); }
//            	}
//
//            	return BoxedUnit.UNIT;
//            });
//            return BoxedUnit.UNIT;
//        });
//
//		System.setOut(outOld);
//		System.setErr(errOld);
//
//		return ret[0];
//	}

	public static IFile toIFile(URI resourceURI) {
		/*
		 * Ideally we'd just call OsateResourceUtil.toIFile however that is not
		 * available in OSATE 2.4.x (which the CASE FM-IDE is based on). Workaround
		 * is to just replicate the current behavior of that method, refer to
		 * <a href=
		 * "https://github.com/osate/osate2/blob/bed18dd95fe3f3bf54d657911cd5e5da1ff2718b/core/org.osate.aadl2.modelsupport/src/org/osate/aadl2/modelsupport/resources/OsateResourceUtil.java#L62"
		 * >this</a>
		 */

		// return OsateResourceUtil.toIFile(resourceURI);

		if (resourceURI.isPlatform()) {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toPlatformString(true)));
		} else {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(resourceURI.toFileString()));
		}
	}
	
public static StringTemplateGroup
loadStringTemplateGroup(String templateFileName)
  throws YouIdiot
{
StringTemplateGroup templates=null;
//Dump.it("opening StringTemplateGroup file:  "+templateFileName);
//set flags if using BA.stg or DataModel.stg instead of BLESS.stg
Global.usingDataModelStringTemplateGroup  = (templateFileName.compareTo("DataModel.stg")==0);
Global.usingBAStringTemplateGroup  = (templateFileName.compareTo("BA.stg")==0);
Global.usingBLESSStringTemplateGroup  = (templateFileName.compareTo("BLESS3.stg")==0);
//if it ends in .stg
try
{
  if ((templateFileName.length()>4) &&
      templateFileName.substring(templateFileName.length()-4).equals(".stg"))
  {
    if (Global.runningAsOSATEplugin)
    {  //I'm a plugin
      // code to retrieve an java.io.InputStream
      Path stgPath =  new Path(templateFileName);
//      if (stgPath==null) {
//        throw new YouIdiot(templateFileName+" cannot be found!");
//      }
      InputStream inputStream = FileLocator.openStream(
          Activator.getDefault().getBundle(),stgPath, false);
      InputStreamReader isr = new InputStreamReader(inputStream);
      templates = new StringTemplateGroup(isr,AngleBracketTemplateLexer.class);
      inputStream.close();
      isr.close();
    } else {
      templates = new StringTemplateGroup(new FileReader(templateFileName),
          AngleBracketTemplateLexer.class);
    }
  }
  else
  {
    //        Dump.it("The first parameter must be a StringTemplateGroup file: *.stg like BLESS3.stg or BA.stg");
    extracted();
  }
}
catch (FileNotFoundException fnfe)
{
  Dump.it(fnfe);
  throw new YouIdiot("The StringTemplateGroup "+templateFileName+" file could not be found");
}
catch (IOException ioe)
{
  Dump.it(ioe);
  throw new YouIdiot("The StringTemplateGroup "+templateFileName+" file caused an IO exception.");
}
return templates;
}   //end of loadStringTemplateGroup

private static void extracted() throws YouIdiot
  {
  throw new YouIdiot("The first parameter must be a StringTemplateGroup file: *.stg like BLESS.stg or BA.stg");
  }
	
	
	
	
}
