//Parse.java
//control main parsing, symbol table entry, and type checking


//(C) 2010 Multitude Corporation

package com.multitude.bless;

public class Parse
{
//starting productions for parsing depend on file suffix
//	public static final int thread_behavior = 1;
//	public static final int subprogram_behavior = 2;
//	public static final int assertion_annex_subclause = 3;
//	public static final int assertion_annex_library = 4;
//	public static final int package_or_property_set = 5;
//	public static final int assertion = 6;
//
//	public static BLESStoASTLexer lexer=null;
//	public static BLESStoASTParser parser=null;
//	public static UnparseBLESS unparser = null;
//	public static ASTtoAST treeToTreeParser = null;
//	public static StringTemplateGroup templates=null;	//templates currently used by UnparseBLESS
//	public static StringTemplateGroup BLESStemplates=null;
//	public static StringTemplateGroup BAtemplates=null;
//	public static StringTemplateGroup Pilartemplates=null;
//	public static StringTemplateGroup DataModeltemplates=null;
//	public static StringTemplateGroup SALtemplates=null;
//	public static StringTemplateGroup ToEnglishtemplates=null;
//	public static StringTemplateGroup Signaltemplates=null;
//	public static StringTemplateGroup Coqtemplates=null;
//	public static StringTemplateGroup Slangtemplates=null;
//	public static StringTemplateGroup JSONtemplates=null;
//	public static StringTemplateGroup ISOSCELEStemplates = null;
//
//	public static HashMap<String,BAST> port_assertion_map;	//loaded by AADL parser during BLESStoAST
//
//	public static File df = null; // file for Pilar output
//	public static FileWriter fw = null; //file writer for Pilar output
//	public static PrintWriter pw = null;  //print writer for  Pilar
//
//
//// Here's where we do the real work...
//	public static ParseRecord	//return a ParseRecord for whatever's parsed
//parseBehavior(String fileName, int startingProduction, int lineNumber) throws Exception
//	{
//		ParseRecord result = null;
////boolean dumpTree = false;		//want to see the parse tree?
////		long startTime = System.currentTimeMillis();
////		Date today = new Date(startTime);
////Dump.it("This file, dump.txt, "+
////	(Global.dumpToSystemOutToo?"and console output, ":"")+
////	" was produced the BLESS Parser "+BLESS.versionDate);
////Dump.it("  at "+Time.todayString+" by "+System.getProperty("user.name")+"\n");
////		Dump.it(" at "+today.toString()+". ");
//		try
//		{
//			Dump.it("reading file "+fileName);
//			String shortFileName = fileName.substring(fileName.lastIndexOf("/")+1,fileName.lastIndexOf("."));
//			//open fileName, put it in pane w/ line numbers
//			try
//			{
//				LineNumberReader lnr = new LineNumberReader(new FileReader(fileName));
//				StringBuffer numberedLinesBuffer = new StringBuffer();
//				while (lnr.ready())
//				{
//					String sourceLine = lnr.readLine();	//do read first before getting line 0=>1
//					numberedLinesBuffer.append(Integer.toString(lnr.getLineNumber())+"\t"+sourceLine+"\n");
//				}
////				if (!Global.translateIntoPilar&&!Global.parsingPredeclaredProperties) {
////					BLESS.treeTabbedPane.addTabWithText(shortFileName+" source",numberedLinesBuffer.toString(),"Source BLESS Text from file: "+fileName);
////				}
//				lnr.close();
//			}	//done trying to display source with line numbers
//			catch (Exception ex) {Dump.it("We\'re sorry, but something went wrong trying to show "+
//					fileName+" source with line numbers.");}
//			//set up ANTLR file reader
//			CharStream spec = new ANTLRFileStream(fileName);
//			lexer = new BLESStoASTLexer(spec);
//			// lexer.setLine(line);
//			// lexer.setColumn(column);
//			// lexer.setFilename(filename);
//			CommonTokenStream tokens = new CommonTokenStream();
//			BAST.tokens = tokens;
//			tokens.setTokenSource(lexer);
//
//			parser = new BLESStoASTParser(tokens);
//			parser.setTreeAdaptor(new BASTTreeAdaptor());
//			parser.setStartingLine(lineNumber);
//			// parser.setColumn(column);
//			PackageRecord pr = new PackageRecord(null,fileName,null,null);
//			switch (startingProduction)
//			{
//			case thread_behavior:
//				//parse starting with production thread_behavior
//				BAST tb = parser.thread_behavior().getTree();
//				ThreadRecord tr = new ThreadRecord(tb,"Thread Behavior from file:  "+fileName,null,pr);
////MOVED TO com.multitude.bless.proof							
////				tr.loadMaps();
//				result = tr;
//				break;
//			case subprogram_behavior:
//				//parse starting with production subprogram_behavior
//				BAST sb = parser.subprogram_behavior().getTree();
//				result = new SubprogramRecord(sb,"Subprogram Behavior from file:  "+fileName,null,pr);
//				break;
//			case assertion_annex_subclause:
//				//parse starting with production assertion_annex_subclause
//				BAST aas = parser.assertion_annex_subclause().getTree();
//				result = new ParseRecord(aas,"Assertion Annex Subclause from file:  "+fileName,null,pr);
//				break;
//			case assertion_annex_library:
//				//parse starting with production assertion_annex_library
//				BAST aal = parser.assertion_annex_library().getTree();
//				result = new ParseRecord(aal,"Assertion Annex Library from file:  "+fileName,null,pr);
//				break;
////	case package_or_property_set:
////		//parse starting with production component_type
////		BAST ct = (BAST) parser.aadl_specification().getTree();
////		if (ct.hasType(BLESStoASTLexer.LITERAL_property))
////			{	//it's a property set
//////			BAST firstChild = (BAST)ct.getChild(0);
////			PropertySetRecord ok = parser.currentPropertySetRecord;
////			//		    ok.loadMaps();
////			//			  Global.compilationUnitRoots.add(ok);
////			result = ok;
////			} //done with just one AADL component
////		else if (ct.hasType(BLESStoASTLexer.LITERAL_package))
////			{	//it's an AADL package
////			PackageRecord pack = parser.currentPackageRecord;
////			pack.loadTypeMaps();
//////			Global.compilationUnitRoots.add(pack);
////			result=pack;
////			}
////		else throw new YouIdiot("is this a package or a property set?",ct);
////		break;
//			default: throw new YouIdiot(" startingProduction value does not match its switch choices.");
//			//			Dump.it("String Tree:\n"+assertionTree.toStringTree()+"\n");
//			}
//			//normalize it?
////			if (Global.preNormalize) {
////				result.ast = com.multitude.bless.proof.Algebra.normalize(result.ast);
////			}
//			//			try
//			//				{
//			//			boolean changedSomething = proof.Algebra.normalize(threadTree);
//			//			Dump.it("normalization did "+(changedSomething?"":"NOT ")+"change something.");
//			//				}
//			//			catch (ProofException pe) {pe.handleProofException();}
//			//display tree in Swing
//			//			ASTFrame af = new ASTFrame(fileName, threadTree);
//			//			af.setVisible(true);
//			//			af.setSize(250, 900);
//			//show tree in tabbed panel
////			if (!Global.translateIntoPilar) {
////				result.ast.showParseTree(result.name+" tree");
////			}
//			//put threadTree as a compilation unit root
//			// use lint for debugging
//			//StringTemplate.setLintMode(true);
//			Global.compilationUnits.add(result);
//			Global.compilationUnitStartingProductions.add(new Integer(startingProduction));
//			if (!parser.recognitionErrorOccurred)
//			{
//				//unparse with BLESS.stg
//				Dump.it("unparsing "+fileName+" using BLESS.stg");
//				CommonTreeNodeStream nodes = new CommonTreeNodeStream(result.ast.dupTree());
//				unparser = new UnparseBLESS(nodes);
//				unparser.setTemplateLib(BLESStemplates);
//				templates = BLESStemplates;
//				//debug .stg
//				//				Dump.it(templates.toString(true));
//				unparse(unparser,startingProduction,result.name);
//			}
//			long currentTime = System.currentTimeMillis();
//			long duration = currentTime - Time.startTime;
//			Dump.it(//fileName+
//					" took "+Time.niceTime(duration)+" to parse.");
//			Date today = new Date(currentTime);
//			Dump.it(" at "+today.toString()+". ");
//			//				Dump.close();
//		}
//		catch (YouIdiot yi)
//		{
//			Dump.it("Parse.parseBehavior =>");
//			yi.handleException();
//		}
//		catch (Throwable e)
//		{
//			Dump.it("Error!   You did something bad while parsing."+e.toString());
//			e.printStackTrace();
//		}
//		return result;
//	}	//end of parseBehavior
//
//
//	public static String
//	unparse(UnparseBLESS unparser, int startingProduction, String tabTitle)
//			throws YouIdiot
//	{
//		String result = "*empty*";
//		try
//		{
//			UnparseBLESS.thread_behavior_return tbu = null;
//			UnparseBLESS.subprogram_behavior_return sbu = null;
//			assertion_annex_library_return aau = null;
//			UnparseBLESS.assertion_return ass = null;
//			switch (startingProduction)
//			{
//			case thread_behavior: tbu = unparser.thread_behavior(); break;
//			case subprogram_behavior: sbu = unparser.subprogram_behavior(); break;
//			//use same starting production for both subclause & library unparsing
//			case assertion_annex_subclause:
//			case assertion_annex_library: aau = unparser.assertion_annex_library(); break;
//			case assertion: ass = unparser.assertion(); break;
////	case package_or_property_set: ctu = unparser.aadl_specification(); break;
//			default: throw new YouIdiot(" startingProduction value does not match its switch choices.");
//			}
//			//need tree adaptor?
//			//					walker.setTreeAdaptor(new BASTTreeAdaptor());
//			StringTemplate output = null;
//			switch (startingProduction)
//			{
//			case thread_behavior: output = (StringTemplate) tbu.getTemplate(); break;
//			case subprogram_behavior: output = (StringTemplate) sbu.getTemplate(); break;
//			case assertion_annex_subclause:
//			case assertion_annex_library: output = (StringTemplate) aau.getTemplate(); break;
//			case assertion: output = (StringTemplate) ass.getTemplate(); break;
////	case package_or_property_set: output = (StringTemplate) ctu.getTemplate(); break;
//			default: throw new YouIdiot(" startingProduction value does not match its switch choices.");
//			}
//			if (output==null) {
//				throw new YouIdiot("No output returned!");
//			}
////			if (!Global.translateIntoPilar)
////			{
////				result=output.toString(BLESS.wrapLength);
////				Dump.it(result); //wrap at 72
////				if ((BLESS.treeTabbedPane!=null)&&!Global.parsingPredeclaredProperties) {
////					BLESS.treeTabbedPane.addTabWithText(tabTitle+" unparse",output.toString(BLESS.wrapLength),"Unparsed Text of "+tabTitle);
////				}
////			}
//		}
//		catch (RecognitionException e)
//		{
//			if (!Global.dumpFileClosed)
//			{
//				Global.dumpToSystemOutToo = true;
//				if (!Global.stackTracePrinted)
//				{
//					Dump.it(e.getMessage());
//					e.printStackTrace(System.out);
//					e.printStackTrace(Global.pw);
//					Global.stackTracePrinted=true;
//				}
//				Dump.it("RecognitionException during unparsing" + e.toString());
//			}
//			else
//			{
//				Dump.it("RecognitionException during unparsing" + e.toString());
//				e.printStackTrace();
//			}
//		}  //end of catch
//		return result;
//	}	//end of unparse
//
//
////	static void
////	unparsePilar(UnparsePilar unparser, int startingProduction, String tabTitle)
////			throws YouIdiot
////	{
////		try
////		{
////			UnparsePilar.thread_behavior_return tbu = null;
////			UnparsePilar.subprogram_behavior_return sbu = null;
////			UnparsePilar.assertion_annex_return aau = null;
////			UnparsePilar.aadl_specification_return ctu = null;
////			switch (startingProduction)
////			{
////			case thread_behavior: tbu = unparser.thread_behavior(); break;
////			case subprogram_behavior: sbu = unparser.subprogram_behavior(); break;
////			//use same starting production for both subclause & library unparsing
////			case assertion_annex_subclause:
////			case assertion_annex_library: aau = unparser.assertion_annex(); break;
////			case package_or_property_set: ctu = unparser.aadl_specification(); break;
////			default: throw new YouIdiot(" startingProduction value does not match its switch choices.");
////			}
////			//need tree adaptor?
////			//					walker.setTreeAdaptor(new BASTTreeAdaptor());
////			StringTemplate output = null;
////			switch (startingProduction)
////			{
////			case thread_behavior: output = (StringTemplate) tbu.getTemplate(); break;
////			case subprogram_behavior: output = (StringTemplate) sbu.getTemplate(); break;
////			case assertion_annex_subclause:
////			case assertion_annex_library: output = (StringTemplate) aau.getTemplate(); break;
////			case package_or_property_set: output = (StringTemplate) ctu.getTemplate(); break;
////			default: throw new YouIdiot(" startingProduction value does not match its switch choices.");
////			}
////			if (output==null) {
////				throw new YouIdiot("No output returned!");
////			}
////			if (Global.translateIntoPilar)
////			{		//send to .plr file
////				try
////				{
////					fw.write(output.toString());
////				}
////				catch (IOException e)
////				{
////					Dump.it("\nI/O error writing: "+Global.pilarFileName);
////					e.printStackTrace(System.out);   // so we can get stack trace
////				}
////			}
////			else
////			{
////				Dump.it(output.toString(BLESS.wrapLength)); //wrap at 72
////				BLESS.treeTabbedPane.addTabWithText(tabTitle+" unparse",output.toString(BLESS.wrapLength),"Unparsed Text of "+tabTitle);
////			}
////		}
////		catch (RecognitionException e)
////		{
////			if (!Global.dumpFileClosed)
////			{
////				Global.dumpToSystemOutToo = true;
////				if (!Global.stackTracePrinted)
////				{
////					Dump.it(e.getMessage());
////					e.printStackTrace(System.out);
////					e.printStackTrace(Global.pw);
////					Global.stackTracePrinted=true;
////				}
////				Dump.it("RecognitionException during unparsing to Pilar:  " + e.toString());
////			}
////			else
////			{
////				Dump.it("RecognitionException during unparsing" + e.toString());
////				e.printStackTrace();
////			}
////		}
////	}	//end of unparse
//
//
////	public static StringTemplateGroup
////	loadStringTemplateGroup(String templateFileName)
////			throws YouIdiot
////	{
////		StringTemplateGroup templates=null;
//////	Dump.it("opening StringTemplateGroup file:  "+templateFileName);
////		//set flags if using BA.stg or DataModel.stg instead of BLESS.stg
////		Global.usingDataModelStringTemlateGroup  = (templateFileName.compareTo("DataModel.stg")==0);
////		Global.usingBAStringTemlateGroup  = (templateFileName.compareTo("BA.stg")==0);
////		Global.usingBLESSStringTemlateGroup  = (templateFileName.compareTo("BLESS.stg")==0);
////		//if it ends in .stg
////		try
////		{
////			if ((templateFileName.length()>4) &&
////					templateFileName.substring(templateFileName.length()-4).equals(".stg"))
////			{
////				if (Global.runningAsOSATEplugin)
////				{  //I'm a plugin
////					// code to retrieve an java.io.InputStream
////					Path stgPath =  new Path(templateFileName);
////					if (stgPath==null) {
////						throw new YouIdiot(templateFileName+" cannot be found!");
////					}
////					InputStream inputStream = FileLocator.openStream(
////							Activator.getDefault().getBundle(),stgPath, false);
////					InputStreamReader isr = new InputStreamReader(inputStream);
////					templates = new StringTemplateGroup(isr,AngleBracketTemplateLexer.class);
////				} else {
////					templates = new StringTemplateGroup(new FileReader(templateFileName),
////							AngleBracketTemplateLexer.class);
////				}
////			}
////			else
////			{
////				//				Dump.it("The first parameter must be a StringTemplateGroup file: *.stg like BLESS.stg or BA.stg");
////				throw new YouIdiot("The first parameter must be a StringTemplateGroup file: *.stg like BLESS.stg or BA.stg");
////			}
////		}
////		catch (FileNotFoundException fnfe)
////		{
////			Dump.it(fnfe);
////			throw new YouIdiot("The StringTemplateGroup "+templateFileName+" file could not be found");
////		}
////		catch (IOException ioe)
////		{
////			Dump.it(ioe);
////			throw new YouIdiot("The StringTemplateGroup "+templateFileName+" file caused an IO exception.");
////		}
////		return templates;
////	} 	//end of loadStringTemplateGroup
//
//	public static void
//	parseBLESSsubclause(String sourceFileName) throws Exception
//	{
//		Global.packageOrPropertySetID = sourceFileName.substring(sourceFileName.lastIndexOf("/")+1, sourceFileName.length()-5);
//		ThreadRecord bs = (ThreadRecord)Parse.parseBehavior(sourceFileName,thread_behavior,0);
//		//load maps
////MOVED TO com.multitude.bless.proof							
////		bs.loadMaps();
//		// create symbol table & resolve all references
//		bs.buildScopeTree();
//		bs.fillScopeTree();
//		bs.resolveReferences();
//		// check type
////	bs.normalizeTypes();
//		bs.checkTypes();
//		// add to Global compilation unit records
//		Global.compilationUnitRecords.add(bs);
//	}	//end of parseBLESSsubclause
//
//	public static void
//	parsePackageOrPropertySet(String sourceFileName) throws Exception
//	{
//		Global.packageOrPropertySetID = sourceFileName.substring(sourceFileName.lastIndexOf("/")+1, sourceFileName.length()-5);
//		ParseRecord pr = Parse.parseBehavior(sourceFileName,package_or_property_set,0);
//		if (pr instanceof PropertySetRecord)
//		{
//			PropertySetRecord aadl = (PropertySetRecord)pr;
//			//copy over port map filled during parsing
////  	//load maps
////  	aadl.loadMaps();
////  	// create symbol table & resolve all references
////  	aadl.buildScopeTree();
////  	aadl.fillScopeTree();
////  	aadl.resolveReferences();
////  	// check type
////  	aadl.normalizeTypes();
////  	aadl.checkTypes();
////  	// add to Global compilation unit records
//			Global.compilationUnitRecords.add(aadl);
////  	Model.addPropertySet(Global.packageOrPropertySetID,aadl);
//		}
//		else if (pr instanceof PackageRecord)
//		{
//			PackageRecord aadl = (PackageRecord)pr;
//			//is it predeclared?
//			aadl.predeclared =Global.parsingPredeclaredProperties;
//			//load maps
////  	aadl.loadTypeMaps();
//			// create symbol table & resolve all references
//			aadl.buildScopeTree();
//			aadl.fillScopeTree();
//			aadl.resolveReferences();
//			// check type
////  	aadl.normalizeTypes();
////  	aadl.checkTypes();
//			// add to Global compilation unit records
//			Global.compilationUnitRecords.add(aadl);
////  	Model.addPackage(Global.packageOrPropertySetID,aadl);
//		}
//	}	//end of parsePackageOrComponent
//
//	public static void
//	parseSubBLESSsubclause(String sourceFileName) throws Exception
//	{  	// parse it as a subprogram_behavior start node
//		Global.packageOrPropertySetID = sourceFileName.substring(sourceFileName.lastIndexOf("/")+1, sourceFileName.length()-4);
//		SubprogramRecord sr = (SubprogramRecord)Parse.parseBehavior(sourceFileName,subprogram_behavior,0);
//		//load maps
////	sr.loadMaps();
//		// create symbol table & resolve all references
////	sr.buildScopeTree();
////	sr.fillScopeTree();
////	sr.resolveReferences();
////	// check type
////	sr.normalizeTypes();
////	sr.checkTypes();
//		// add to Global compilation unit records
//		Global.compilationUnitRecords.add(sr);
//	}	//end of parseSubBLESSsubclause


}	//end of Parse
