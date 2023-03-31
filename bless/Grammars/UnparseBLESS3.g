//UnparseBLESS.g
//Tree parser grammar for converting BLESS ASTs back into text
 

tree grammar UnparseBLESS3;

options
{
tokenVocab=BLESS3;
ASTLabelType=BAST;
output=template;
}


@header 
{
//copyright 2023 Multitude Corporation
package com.multitude.bless.antlr3generated;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import com.multitude.bless.tree.BAST;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;
import com.multitude.bless.app.Global;
import com.multitude.bless.exceptions.Dump;
import com.multitude.bless.exceptions.HelpfulHints;
import com.multitude.bless.exceptions.BLESSmarker;
import com.multitude.bless.app.Global;
import com.multitude.aadl.bless.maps.BlessMaps;
}

@members
{
public static int countRecognitionErrors = 0; //accumulates count of recognition errors
public static boolean recognitionErrorOccurred = false;    //did a parse error occur?
public static boolean suppressRecognitionException = false;  //inhibit report error of RecognitionException 
//public static StringTemplateGroup templates=null;	//templates currently used by UnparseBLESS
public static boolean lookUpPropertyValues = false;  //look up AADL property values when unparsing rather than name
public static String singletonName = "";	//Slang name for AADL component hving subprogram subcomponents

//public boolean SAL=false;  //are we unparsing to SAL?

public String componentName = "";

 int startingLine = 0; //starting line of sublanguage in AADL file

  public  void 
setStartingLine(int line) //sets starting line
  {
  startingLine = line;
  }

public  int
getStartingLine()
  {
  return startingLine;
  }
  

//ANTLR string template magic
  public static StringTemplate 
template(String name) 
  {
  return Global.templates.getInstanceOf(name);
  }

  public static StringTemplate 
text(String t) 
  {
  return new StringTemplate(Global.templates,t);
  }

  public void 
reportError(RecognitionException ex)
  {
  if (!suppressRecognitionException)
  {
 // if (true)
 // {
  if (countRecognitionErrors<Global.YouIdiotReportLimit)
    {
//   Dump.it("\nUnparseBLESS.reportError(RecognitionException ex)=>"+
//    Integer.toString(countRecognitionErrors)+" ");
  Dump.it(getErrorHeader(ex));
  Dump.it(ex);
   recognitionErrorOccurred = true;
   ex.line = ex.line+startingLine;
   super.reportError(ex);
  ex.printStackTrace();
//  Dump.re(ex);
    }
  countRecognitionErrors++;
//  }
//  // Global.stopProof = true;	//stop proving!
  }
  } //end of reportError

static int typeNameNumber = 0;	//counts type names created


static StringTemplate getNextTypeID()
	{
	typeNameNumber++;
	return text(makeIntoString(typeNameNumber));
	}

public static String makeIntoString(int i)
	{
	return Integer.toString(i);
	}

static StringTemplate  getPackageName()
	{
	return text(Global.packageOrPropertySetID);
	}

  static StringTemplate slang_simultaneous_assignment(List<Object> l, List<Object> r)
    {
    String spaces = "    ";
    StringBuffer sb = new StringBuffer();
    sb.append("//simultaneous assignment\n");
    sb.append(spaces+"//assign to fresh values\n");
    for (int i=0;i<l.size();i++)
      {
      String lhs = ((StringTemplate)l.get(i)).toString().replace("'", "");
      String rhs = ((StringTemplate)r.get(i)).toString();
      sb.append(spaces+"val new_"+lhs+" = "+rhs+"\n");
      }
    sb.append(spaces+"//copy to variables\n");
    for (int i=0;i<l.size();i++)
      {
      String lhs = ((StringTemplate)l.get(i)).toString().replace("'", "");
      sb.append(spaces+lhs+" = new_"+lhs+"\n");
      }
    return text(sb.toString());
    }

static StringTemplate  makeDimensionFromRange(StringTemplate l, StringTemplate r)
	{
	String l_value = l.toString();
	int l_int = 0;
	try
		{
		l_int = Integer.decode(l_value).intValue();
		}
	catch (NumberFormatException ex)
		{
		//look up the value of the ID or enumeration literal
		//otherwise leave as 0
		}	
	String r_value = r.toString();
	int r_int = 1;
	try
		{
		r_int = Integer.decode(r_value).intValue();
		}
	catch (NumberFormatException ex)
		{
		//look up the value of the ID or enumeration literal
		//otherwise use length of string
		r_int = r_value.length();
		}	
	int dimension = r_int-l_int;
	return text(makeIntoString(dimension));
	}  //end of makeDimensionFromRange
	
static StringTemplate getAadlPropertyValue(BAST dc)
	  {
	  if (!dc.hasType(DOUBLE_COLON))
	    return text("parameter to UnparseBLESS.getAadlPropertyValue must have root DOUBLE_COLON");
	  return text(Global.getAadlPropertyValue(dc.getChild(0).getText(),dc.getChild(1).getText()));
	  }  //end of getAadlPropertyValue
	  
  
static StringTemplate getSlangFunctionCall(String functionID)
  {
  return text(singletonName+"_subprograms."+functionID);
  }
  

  
}  //end of @members

@rulecatch
{
catch (RecognitionException re) 
	{
	countRecognitionErrors++;
	Dump.it("recognition error #"+countRecognitionErrors);
	recognitionErrorOccurred=true;
  if (retval==null)
    Dump.it("null retval");
  else 
  {
  Dump.it("retval.getClass()="+retval.getClass());
  if (retval.start==null)
    Dump.it("null retval.start");
  else if (retval.start instanceof BAST)
	BLESSmarker.setWarningMarker("UnparseBLESS recognition error:  "+
	  ((BAST)retval.start).toStringTree(),(BAST)retval.start);
	else
	  {
	  Dump.it("retval.start not instanceof BAST:  "+retval.toString());
	  }
	}
  reportError(re);
	}
}	//end of rulecatch

identifier 
	:	
	word=ID
		->{%{$word.text}}  //template(w={$word.text})"<w>"
	;

////////////////AADL SPECIFICATION///////////////////////////////
//
//aadl_specification
//  :
//	props=property_set
//		-> me(i={$props.st})
//	|
//	pack=package_spec
//		-> me(i={$pack.st})
//  ;
//

////////////////AADL PACKAGE///////////////////////////////
////
////
////package_spec
////  	:
////  	^(pack=LITERAL_package pi=package_name
////  	pub=public_declarations?
////  	pri=private_declarations?
//// 		 LITERAL_end)
//// 	-> aadl_package(pi={$pi.st},pub={$pub.st},pri={$pri.st})
////// "package <pi> <\n><imdec; separator=<\n>><ct; separator=<\n>><co; separator=<\n>> end package <pi>;"
////  	 ;
////catch[RecognitionException re] 
////	{
////	Dump.it("RecognitionException in package_spec ");
////	reportError(re);
////	if ($pack!=null) $pack.showParseTree($pi.text);
////	}
//
//
//public_declarations
//  :
//  ^(LITERAL_public 
//  	nv+=name_visibility_declaration+
//  	ad+=aadl_declaration+
//		)
//  	-> public_declarations(nv={$nv},ad={$ad})
//	|
//  ^(LITERAL_public 
//  	nv+=name_visibility_declaration+
//		)
//  	-> public_declarations(nv={$nv})
//	|
//  ^(LITERAL_public 
//  	ad+=aadl_declaration+
//		)
//  	-> public_declarations(ad={$ad})
//	|
//	pub=LITERAL_public
//		-> {%{$pub.text}}
//  ;
//
//private_declarations
//  :
//  ^(LITERAL_private  
//  	pnv+=name_visibility_declaration+
//  	pad+=aadl_declaration+
//		)
//  	-> private_declarations(pnv={$pnv},pad={$pad})
//	|
//  ^(LITERAL_private  
//  	pnv+=name_visibility_declaration+
//		)
//  	-> private_declarations(pnv={$pnv})
//	|
//  ^(LITERAL_private  
//  	pad+=aadl_declaration+
//		)
//  	-> private_declarations(pad={$pad})
//  |
//  pri=LITERAL_private
//  	-> {%{$pri.text}}
//  ;
//  

//package_name
//	:
//	i=ID
//		-> {%{$i.text}}
////	|
////	^(DOUBLE_COLON i2+=ID+)
////		-> template(i2={$i2}) "<i2; separator=\"::\">"
//	;

//
//aadl_declaration
//  :
//  cd=classifier_declaration 
//  	-> {$cd.st}
//  | al=annex_library
//  	-> {$al.st}
//  ;
//  
//classifier_declaration
//  :
//  ccd=component_classifier_declaration
//  	-> {$ccd.st}
//  |
//  fgcd=feature_group_classifier_declaration
//  	-> {$fgcd.st}
//  ;
//
//      
//component_classifier_declaration 
//  :
//  ct=component_type 
//  	-> {$ct.st}
////  | component_type_extension 
//  | ci=component_implementation 
//  	-> {$ci.st}
////  | component_implementation_extension
//  ;
//  
//feature_group_classifier_declaration 
//  : 
//  fgt=feature_group_type //| feature_group_type_extension
//  	-> {$fgt.st}
//  ;
// 
//name_visibility_declaration 
//  :
//  id=import_declaration 
//  	-> {$id.st}
//  | ad=alias_declaration
//  	-> {$ad.st}
//  ;

//
//import_declaration
//	:
//	^(LITERAL_with pnopsi+=package_name_or_property_set_id+ )
//		-> import_declaration(pnopsi={$pnopsi})
//	;
//
//package_name_or_property_set_id
//	:
//	i=ID
//	  -> {%{$i.text}}
//	|
//	b=LITERAL_BLESS
//	  -> {%{$b.text}}
//	;	


//alias_declaration
//	:
//	^(LITERAL_renames i=ID pn=identifier)
//	  -> alias_declaration(i={$i.text},pn={$pn.st}) 
//	;
//  

///////////////////////////COMPONENT TYPES///////////////////////////////////
//
//component_type
//	:
//	^(c=COMPONENT cc=component_category dcti=ID 
//	  ext=extends_type? as+=annex_subclause* LITERAL_end)
//		->component_type(cc={$cc.st},dcti={$dcti.text},as={$as},ext={$ext.st})
//	|
//	^(c=COMPONENT cc=component_category dcti=ID ext=extends_type? 
//		^(LITERAL_properties  p+=property_association+)
//		as+=annex_subclause* LITERAL_end)
//		->component_type(cc={$cc.st},dcti={$dcti.text},as={$as},p={$p},ext={$ext.st})
//	|
//	^(c=COMPONENT cc=component_category dcti=ID ext=extends_type? 
//		^(LITERAL_features f+=feature+)
//		( ^(LITERAL_properties  p+=property_association+) )?
//		as+=annex_subclause* LITERAL_end)
//		->component_type(cc={$cc.st},dcti={$dcti.text},as={$as},p={$p},f={$f},ext={$ext.st})
//	;
//catch[RecognitionException re] 
//	{
//	Dump.it("RecognitionException in component_type ");
//	reportError(re);
//	if ($c!=null) $c.showParseTree("COMPONENT");
////	throw re;
//	}

	
//component_category
//	:
//	(t=LITERAL_abstract | t=LITERAL_data | t=LITERAL_subprogram 
////	| t=LITERAL_subprogram t=LITERAL_group
//	| t=LITERAL_thread | t=LITERAL_process 
// 	 |  t=LITERAL_memory  | t=LITERAL_processor | t=LITERAL_bus | t=LITERAL_device 
//  	| t=LITERAL_system | t=THREAD_GROUP )
//  	-> {%{$t.text}}
////		-> template(t={$t.text})"<t>"
////	| LITERAL_thread LITERAL_group-> template()"thread group" 
////	| LITERAL_virtual LITERAL_processor-> template()"virtual processor"
////	| LITERAL_virtual LITERAL_bus -> template()"virtual bus"
//  	;

//unique_component_type_reference 
//  :
//  cti=ID
//  	-> {%{$cti.text}}
//  |
//  ^(DOUBLE_COLON pack=ID comp=ID)
//  	-> id_cc_id(fst={$pack.text},snd={$comp.text})
//  ;
//
//extends_type
//	:
//	^(ext=LITERAL_extends uctr=unique_component_type_reference)
//	  ->{$uctr.st}
//	;

/////////////////////////4.4 COMPONENT IMPLEMENTATIONS////////////////////////

//component_implementation
//	:
//	^(c=COMPONENT cc=component_category LITERAL_implementation 
//		^(PERIOD dcti=ID des=ID) 
//		ext=extends_clause?
//		sub=subcomponents_clause?
//		con=connections_clause?
//		pc=properties_clause?
//		as+=annex_subclause* LITERAL_end)
//		->  component_implementation(ccx={$cc.st},dctix={$dcti.text},desx={$des.text},
//		  	extx={$ext.st},subx={$sub.st},conx={$con.st},pcx={$pc.st},asx={$as})
//	;
//catch[RecognitionException re] 
//	{
//	Dump.it("@rulecatch of RecognitionException");
//	reportError(re);
//	if ($c!=null) $c.showParseTree("COMPONENT");
//	throw re;
//	}	//end of component_implementation

//extends_clause
//	:
//	^(ext=LITERAL_extends ucir=unique_component_implementation_reference)
//	  ->{$ucir.st}
//	;


//subcomponents_clause
//  :
//  ^(LITERAL_subcomponents sub+=subcomponent+ )
//    -> subcomp(sub={$sub})
////      "subcomponents<\n>  <sub; separator=\"\n\">"
//  ;
  
//connections_clause
//  :
//  ^(LITERAL_connections cons+=connection+)
//  	-> connections_clause(cons={$cons})
////  	"connections<\n>  <cons; separator=\"\n\"><\n>"
//  ;

//properties_clause
//  :
//  ^(LITERAL_properties pa+=property_association+)
//  	-> properties_clause(pa={$pa})
////  	"properties<\n>  <pa; separator=\"\n\">"
//  ;

//unique_component_implementation_reference
//	:
//	^(DOUBLE_COLON pn=ID cti=ID cii=ID)
//		-> id_cc_id_dot_id(fst={$pn.text},snd={$cti.text},thr={$cii.text})
////			"<cn>::<cti>.<cii>"
//	|	
//	^(PERIOD cti=ID cii=ID)
//		-> id_dot_id(fst={$cti.text},snd={$cii.text})
////			"<cti>.<cii>"
//	;

///////////////////////////////////4.3 SUBCOMPONENTS///////////////////////////////

//subcomponent
//	:
//	^(SUBCOMPONENT i=ID cc=component_category 
//		uccr=unique_component_classifier_reference
//	  ad=array_dimensions? aeil=array_element_implementation_list?
//	  sbpa+=property_association* sbim=in_modes?)
//	  -> {(ad==null)&&(aeil==null)&&(sbpa==null)&&(sbim==null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st})
//	  -> {(ad!=null)&&(aeil!=null)&&(sbpa!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			aeil={$aeil.st},sbpa={$sbpa},sbim={$sbim.st})
//	  -> {(ad!=null)&&(aeil!=null)&&(sbpa!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			aeil={$aeil.st},sbpa={$sbpa})
//	  -> {(ad!=null)&&(aeil!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			aeil={$aeil.st},sbim={$sbim.st})
//	  -> {(ad!=null)&&(sbpa!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			aeil={$aeil.st},sbim={$sbim.st})
//	  -> {(sbpa!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},
//			sbpa={$sbpa},sbim={$sbim.st})
//	  -> {(ad!=null)&&(sbpa!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			sbpa={$sbpa},sbim={$sbim.st})
//	  -> {(ad!=null)&&(sbpa!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			sbpa={$sbpa})
//	  -> {(ad!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st},
//			sbim={$sbim.st})
//	  -> {(ad!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},ad={$ad.st})
//	  -> {(sbpa!=null)&&(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},
//			sbpa={$sbpa},sbim={$sbim.st})
//	  -> {(sbpa!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},
//			sbpa={$sbpa})
//	  -> {(sbim!=null)}?
//	  	subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st},
//			sbim={$sbim.st})
//	  -> subcomponent(i={$i.text},cc={$cc.st},uccr={$uccr.st})
////		"<i>: <cc> <uccr><ad><aeil><if(sbpa)>(<sbpa; separator=\",\">)<endif><im>;"
//	;





//array_dimensions
//  :
//  ^( LBRACKET ad+=array_dimension+  )
//    -> template(ad={$ad})
//    "[<ad; separator=\"][\">]"
//  ;

//array_dimension
//	:
//	ad=NUMERIC_LIT 
//		-> {%{$ad.text}}
//	| upn=unique_property_name 
//		-> {$upn.st}
//	;
	
//array_element_implementation_list
//  :
//  ^(LPAREN uccr+=unique_component_implementation_reference+)
//  	-> template(uccr={$uccr})
//  	"(<uccr; separator\",\">)"
//  ;    

  
////////////////////////////4.8 ANNEX SUBCLAUSE AND LIBRARY//////////////////////////
 
  
//annex_subclause
//	:
//	^(LITERAL_annex LITERAL_BLESS tb=thread_behavior in_modes?)
//	-> annex_subclause_bless(tb={$tb.st})
////	-> template(tb={$tb.st})
////		"<\n>annex BLESS <\n>{**<\n><tb><\n>**};  --end of annex<\n>"
//	|
//	^(LITERAL_annex LITERAL_subBLESS sb=subprogram_behavior in_modes?)
//	-> annex_subclause_subbless(sb={$sb.st})
////	-> template(sb={$sb.st})
////		"<\n>annex subBLESS <\n>{**<\n><sb><\n>**};  --end of annex<\n>"
//	|
//	^(LITERAL_annex LITERAL_Assertion a=assertion in_modes?)
//	-> annex_subclause_assertion(a={$a.st})
////	-> template(a={$a.st})
////		"<\n>annex Assertion <\n>{**<a>**};<\n>"
//	;

	
annex_library
	:
  ^(ASSERTION_ANNEX ass+=assertion+)
	-> annex_library_assertion(ass={$ass})
	
	;  	 

///////////////////////8 FEATURES AND SHARED ACCESS//////////////////////////////

 
//feature
//	:
//	^(p=PORT dpi=ID (io=INOUT|io=LITERAL_in|io=LITERAL_out) pt=port_type 
//	    mpa+=property_association+ ) 
//	  ->port_spec(dpi={$dpi.text},io={$io.text},pt={$pt.st},mpa={$mpa})
//	|
//	^(p=PORT dpi=ID (io=INOUT|io=LITERAL_in|io=LITERAL_out) pt=port_type) 
//	  ->port_spec(dpi={$dpi.text},io={$io.text},pt={$pt.st})
//	 |
//	 ^(par=LITERAL_parameter dpi=ID (io=INOUT|io=LITERAL_in|io=LITERAL_out) 
//	   uccr=/*data_*/unique_component_classifier_reference
//	      mpa2+=property_association+ ) 
//	  ->parameter_spec(dpi={$dpi.text},io={$io.text},uccr={$uccr.st},mpa={$mpa2})
//	|
//	 ^(par=LITERAL_parameter dpi=ID (io=INOUT|io=LITERAL_in|io=LITERAL_out) 
//	   uccr=/*data_*/unique_component_classifier_reference ) 
//	  ->parameter_spec(dpi={$dpi.text},io={$io.text},uccr={$uccr.st})
//	|
//	^(b=LITERAL_bus a=LITERAL_access i=ID 
//		( pr=LITERAL_provides |pr=LITERAL_requires )  )
//		-> bus_access_spec(b={$b.text},a={$a.text},i={$i.text},pr={$pr.text})
////			"<i>: <pr> <b> <a>;"	
//	|
//	^(b=LITERAL_bus a=LITERAL_access i=ID 
//		( pr=LITERAL_provides |pr=LITERAL_requires )
//		uccr=unique_component_classifier_reference )
//		-> bus_access_spec(b={$b.text},a={$a.text},i={$i.text},pr={$pr.text},
//				uccr={$uccr.st})
////			"<i>: <pr> <b> <a> <uccr>;"	
//	|
//	^(dat=LITERAL_data a=LITERAL_access i=ID 
//		( pr=LITERAL_provides |pr=LITERAL_requires )  )
//		-> data_access_spec(dat={$dat.text},a={$a.text},i={$i.text},pr={$pr.text})
////			"<i>: <pr> <dat> <a>;"	
//	|
//	^(dat=LITERAL_data a=LITERAL_access i=ID 
//		( pr=LITERAL_provides |pr=LITERAL_requires )
//		uccr=unique_component_classifier_reference )
//		-> data_access_spec(dat={$dat.text},a={$a.text},i={$i.text},pr={$pr.text},
//				uccr={$uccr.st})
////			"<i>: <pr> <dat> <a> <uccr>;"	
//	|
//	fgs=feature_group_spec
//		-> {$fgs.st}
//	;
//catch[RecognitionException re] 
//	{
//	Dump.it("RecognitionException in UnparseBLESS.feature "+
//	  ($dpi.text==null?"*null defining port identifier":$dpi.text)+
//	  ($p==null?"":" on line "+Integer.toString($p.getLine())) +
//	  ($par==null?"":" on line "+Integer.toString($par.getLine())) 
//	  );
//	reportError(re);
//	if ($p!=null) $p.showParseTree("PORT "+$dpi.text);
//	if ($par!=null) $par.showParseTree("parameter "+$dpi.text);
////	throw re;
//	}	//end of feature

////////////////////////////////8.2 FEATURE GROUP TYPES/////////////////////////////////   
         

//feature_group_type
//	:
//	^(LITERAL_group pi=ID fc=features_clause?
//			ic=inverse_clause? pc=properties_clause?)
//	  -> feature_group_type(pi={$pi.text},fc={$fc.st},ic={$ic.st},pc={$pc.st}) 
//	;

//feature_group_spec
//	:
//	^(gr=LITERAL_group dfgi=ID (io=LITERAL_in | io=LITERAL_out) )
//		-> feature_group_spec(gr={$gr.text},dfgi={$dfgi.text},io={$io.text})
//	|
//	^(gr=LITERAL_group dfgi=ID (io=LITERAL_in | io=LITERAL_out) 
//			ufgtr=unique_feature_group_type_reference )
//		-> feature_group_spec(gr={$gr.text},dfgi={$dfgi.text},io={$io.text},
//				ufgtr={$ufgtr.st})
//	|
//	^(gr=LITERAL_group dfgi=ID (io=LITERAL_in | io=LITERAL_out) 
//			inv=LITERAL_inverse ufgtr=unique_feature_group_type_reference )	
//		-> feature_group_spec(gr={$gr.text},dfgi={$dfgi.text},io={$io.text},
//				inv={$inv.text}, ufgtr={$ufgtr.st})
//	;

//features_clause
//  :
//  ^(LITERAL_features feat+=feature+)
//  	-> features_clause(feat={$feat})
//  ;

//inverse_clause
//  :
//  ^(LITERAL_inverse  uftg=unique_feature_group_type_reference)
//  	-> inverse_clause(uftg={$uftg.st})
//  ;

//unique_feature_group_type_reference
//	:
//	fgt=ID
//		-> {%{$fgt.text}}
//	|
//	^(DOUBLE_COLON pn=ID fgt=ID)
//		-> template(pn={$pn.text},fgt={$fgt.text})
//			"<pn>::<fgt>"
//	;

//////////////////////////////////8.3 PORTS/////////////////////////////////////////////

//port_type
//	:
//	LITERAL_data
//		-> template()"data port"
//	|
//	^(LITERAL_data u=unique_component_classifier_reference)
//		-> template(u={$u.st})"data port <u>"
//	|
//	^(LITERAL_event LITERAL_data)
//		-> template()"event data port"
//	|
//	^(LITERAL_event LITERAL_data u2=unique_component_classifier_reference)
//		-> template(u2={$u2.st})"event data port <u2>"
//	|
//	LITERAL_event
//		-> template()"event port"
//	;


//////////////////////////////////9 CONNECTIONS////////////////////////


//connection 
//  :
//  ^(CONNECTION dcid=ID prtc=port_connection
//			propa+=property_association* 
//  		inm=in_modes? )
//  	-> connection(dcid={$dcid.text},prtc={$prtc.st},propa={$propa},inm={$inm.st})
//	|
//  ^(CONNECTION dcid=ID fc=feature_connection
//			propa+=property_association* 
//  		inm=in_modes? )
//  	-> connection(dcid={$dcid.text},prtc={$fc.st},propa={$propa},inm={$inm.st})
//	|
//  ^(CONNECTION dcid=ID ac=access_connection
//			propa+=property_association* 
//  		inm=in_modes? )
//  	-> connection(dcid={$dcid.text},prtc={$ac.st},propa={$propa},inm={$inm.st})
//	|
//  ^(CONNECTION dcid=ID fgc=feature_group_connection
//			propa+=property_association* 
//  		inm=in_modes? )
//  	-> connection(dcid={$dcid.text},prtc={$fgc.st},propa={$propa},inm={$inm.st})
//  ;  


////////////////////////////////9.1 FEATURE CONNECTION////////////////////////

//feature_connection
//	:
//	^(im=IMP LITERAL_feature source=feature_reference dest=feature_reference)
//		-> feature_connection(con={$im.text},source={$source.st},dest={$dest.st})
//	|
//	^(bi=BI LITERAL_feature source=feature_reference dest=feature_reference)	
//		-> feature_connection(con={$bi.text},source={$source.st},dest={$dest.st})
//	;
//
//feature_reference
//	:
//	ctf=ID
//		-> {%{$ctf.text}}
//	|
//	^(PERIOD sub=ID fea=ID)
//		-> id_dot_id(fst={$sub.text},snd={$fea.text})
////			"<sub>.<fea>"
//	;
//	
  
////////////////////////////////9.2 PORT CONNECTIONS////////////////////////
	

//port_connection 
//  :
//  ^(imp=IMP source=port_connection_reference dest=port_connection_reference)
//  	-> port_connection(direction={$imp.text},source={$source.st},dest={$dest.st})
// // 	"port <s>-\><d>"
//  |
//  ^(bi=BI source=port_connection_reference dest=port_connection_reference)
//  	-> port_connection(direction={$bi.text},source={$source.st},dest={$dest.st})
////  	"port <s>\<-\><d>"
//  ;
  
//port_connection_reference
//	:
//	ctp=ID	///*component_type_port_*/identifier
//		-> me(i={$ctp.text})
//	|
//	^(PERIOD si=ID pi=ID)
//	  -> template(si={$si.text},pi={$pi.text})
//			"<si>.<pi>"
//	|
//	^(PERIOD LITERAL_processor ppi=ID)
//	  -> template(ppi={$ppi.text})
//			"processor.<ppi>"
//	|
//	^(PERIOD LITERAL_self dsi=ID)
//	  -> template(dsi={$dsi.text})
//			"self.<dsi>"	
//	;
	
//////////////////////////////////9.4 ACCESS CONNECTIONS///////////////////////////////

//access_connection
//	:
//	^(LITERAL_access ( bord=LITERAL_bus | bord=LITERAL_data )
////	  source=port_connection_reference (con=IMP | con=BI)
////	   dest=port_connection_reference
//	   )
//	-> access_connection(bord={$bord.text},source={$source.st},con={$con.text},
//			dest={$dest.st})
//	;
	
//access_reference
//	:
//	ctf=ID
//		-> {%{$ctf.text}}
//	|
//	^(PERIOD sub=ID fea=ID)
//		-> id_dot_id(fst={$sub.text},snd={$fea.text})
////			"<sub>.<fea>"
//	|
//	^(PERIOD pr=LITERAL_processor fea=ID)
//		-> id_dot_id(fst={$pr.text},snd={$fea.text})
//	;
	
  
//////////////////////////////////9.5 FEATURE GOUP CONNECTIONS///////////////////////////////

//feature_group_connection
//  :
//  ^(LITERAL_feature LITERAL_group source=feature_group_reference
//  	( con=IMP | con=BI )
//  	dest=feature_group_reference)
//  	-> feature_group_connection(source={$source.st},con={$con.text},
//  			dest={$dest.st})
//  ;
//
//feature_group_reference     
//  :
//	ctf=ID
//		-> {%{$ctf.text}}
//	|
//	^(PERIOD sub=ID fea=ID)
//		-> id_dot_id(fst={$sub.text},snd={$fea.text})
//  ;
		
///////////////////////////////11.1 PROPERTY SETS////////////////////////////////////////////
//
//
//property_set
//  :
//	^(prop=LITERAL_property psi=ID ids+=import_declaration*
//		ptd+=property_type_declaration* pdd+=property_definition_declaration*
//		pcon+=property_constant* )
//		-> property_set(psi={$psi.text},ids={$ids},ptd={$ptd},
//				pdd={$pdd},pcon={$pcon})
//	;
//catch[RecognitionException re] 
//	{
//	Dump.it("RecognitionException in property_set ");
//	reportError(re);
//	if ($prop!=null) $prop.showParseTree($psi.text);
//	}
 
///////////////////////////////11.1.1 PROPERTY TYPES////////////////////////////////////////////
	 
//property_type_declaration
//	:
//	^(LITERAL_type ty=ID pt=property_type)
//	  -> property_type_declaration(ty={$ty.text},pt={$pt.st})
//	;	
	
//property_type 
//  :
//  bo=LITERAL_aadlboolean 
//    ->me(i={$bo.text})
//  | st=LITERAL_aadlstring
//    ->me(i={$bo.text})
//  | et=enumeration_type 
//    -> {$et.st}
//  | ut=units_type
//    -> {$ut.st}
//  | nt=property_number_type 
//    -> {$nt.st}
//  | rat=range_type
//    -> {$rat.st}
//  | clt=classifier_type
//    -> {$clt.st}
//  | rft=reference_type
//    -> {$rft.st}
//  | ret=property_record_type  
//    -> {$ret.st}
//  ;
  
//classifier_type  
//  :
//  ^(LITERAL_classifier i+=model_element+)
//    -> classifier_type(i={$i})
//  ;  
  
//reference_type  
//  :
//  ^(LITERAL_reference i+=model_element+)
//    -> reference_type(i={$i})
//  ;  
	

//units_type 
//  :
//  ^(LITERAL_units ul=units_list)
//    -> units_type(ul={$ul.st})
//  ;   

//property_number_type
//  :
//  ar=LITERAL_aadlreal
//  	-> property_number_type(kind={$ar.text})
//  |
//  ^(ar=LITERAL_aadlreal rr=real_range)
//  	-> property_number_type(kind={$ar.text},range={$rr.st})
//  |
//  ^(ar=LITERAL_aadlreal u=LITERAL_units ud=units_designator)
//  	-> property_number_type(kind={$ar.text},units={$u.text},designator={$ud.st})
//  |
//  ^(ar=LITERAL_aadlreal rr=real_range u=LITERAL_units ud=units_designator)
//  	-> property_number_type(kind={$ar.text},range={$rr.st},units={$u.text},designator={$ud.st})
//  |
//  ai=LITERAL_aadlinteger
//  	-> property_number_type(kind={$ai.text})
//  |
//  ^(ai=LITERAL_aadlinteger ir=integer_range)
//  	-> property_number_type(kind={$ai.text},range={$ir.st})
//  |
//  ^(ai=LITERAL_aadlinteger u=LITERAL_units ud=units_designator)
//  	-> property_number_type(kind={$ai.text},units={$u.text},designator={$ud.st})
//  |
//  ^(ai=LITERAL_aadlinteger ir=integer_range u=LITERAL_units ud=units_designator)
//  	-> property_number_type(kind={$ai.text},range={$ir.st},units={$u.text},designator={$ud.st})
//  ;



//real_range
//  :
//  ^(DOTDOT lb=aadlreal_or_constant ub=aadlreal_or_constant)
//    -> range(lb={$lb.st},ub={$ub.st})
//  ;

//aadlreal_or_constant
//	:
//	nl=NUMERIC_LIT
//		-> {%{$nl.text}}
//	|
//	^(nl=NUMERIC_LIT i=ID)
//		-> template(nl={$nl.text},i={$i.text})
//			"<nl> <i>"
//	|
//	pct=property_constant_name
//		-> {$pct.st}
//	;

//integer_range
//  :
//  ^(DOTDOT lb=aadlinteger_or_constant ub=aadlinteger_or_constant)
//    -> range(lb={$lb.st},ub={$ub.st})
//  ;
//
//aadlinteger_or_constant
//	:
//	nl=NUMERIC_LIT
//		-> {%{$nl.text}}
//	|
//	^(nl=NUMERIC_LIT i=ID)
//		-> template(nl={$nl.text},i={$i.text})
//			"<nl> <i>"
//	|
//	pct=property_constant_name
//		-> {$pct.st}
//	;
	
//range_type 
//  :
//  ^(LITERAL_range rnt=property_number_type)
//    -> range_type(rt={$rnt.st})
//  | 
//  ^(LITERAL_range uptn=unique_property_name)
//    -> range_type(rt={$uptn.st})
//  ;

//property_record_type 
//  : 
//  ^(LITERAL_record prf+=property_record_field+)
//		-> record_type(rf={$prf})
//  ;
//
//property_record_field
//	:
//	^(COLON rid=ID ptd=property_type_designator)
//		-> record_field(df={$rid.text},ptd={$ptd.st})
//	|	
//	^(COLON rid=ID l=LITERAL_list ptd=property_type_designator)
//		-> record_field(df={$rid.text},ptd={$ptd.st},l={$l.text})
//	;
	
//property_type_designator
//  :
//  uptn=unique_property_name
//  	-> {$uptn.st}
//  |
//  pt=property_type
//  	-> {$pt.st}
//  ;

//////////////////////////////////11.1.2 PROPERTY DEFINITIONS////////////////////////////

//property_definition_declaration
//  :
//  ^(LITERAL_applies dpni=ID inh=LITERAL_inherit? svp=single_valued_property
//  	puccr+=property_owner*)
//  		-> property_definition_declaration(dpni={$dpni.text},
//  		  prop={$svp.st},puccr={$puccr},inh={$inh.text})
//  |
//  ^(LITERAL_applies dpni=ID inh=LITERAL_inherit? mvp=multi_valued_property
//  	puccr+=property_owner*)
//  		-> property_definition_declaration(dpni={$dpni.text},
//  		  prop={$mvp.st},puccr={$puccr},inh={$inh.text})
//  ;

//single_valued_property
//  :
//	ptd=property_type_designator
//		-> {$ptd.st}
//	|
//	^(ARROW ptd=property_type_designator dpe=property_expression)
//		-> single_valued_property(ptd={$ptd.st},dpe={$dpe.st})
//	;
//	
//	
//multi_valued_property
//  :
//	^(LITERAL_list ll+=LITERAL_list* 
//	  ptd=property_type_designator)
//		-> multi_valued_property(ll={$ll},ptd={$ptd.st})
//	|
//	^(LITERAL_list ll+=LITERAL_list*  ARROW 
//			^(PROPERTY_LIST pvs+=property_value+ ) 
//			ptd=property_type_designator )
//		-> multi_valued_property(ll={$ll},pvs={$pvs},ptd={$ptd.st})
//	;

//property_owner
//  :        
//  uccr=unique_component_classifier_reference  
//    -> {$uccr.st}
//  | me=model_element
//    -> {$me.st}
//  ;
//
//model_element
//  :
//  cc=component_category 
//  	-> {$cc.st}
//  | port=LITERAL_port 
//  	-> {%{$port.text}} 
//  | con=LITERAL_connection 
//  	-> {%{$con.text}} 
//  | ^(LITERAL_event LITERAL_port) 
//    -> template()"event port"
//  | ^(LITERAL_data LITERAL_port )
//    -> template()"data port"
//  | ^(LITERAL_event LITERAL_data LITERAL_port )
//    -> template()"event data port"
//  | ^(LITERAL_subprogram LITERAL_access )
//    -> template()"subprogram access"
//  | ^(LITERAL_port LITERAL_connection )
//    -> template()"port connection"
//  | fl=LITERAL_flow
//  	-> {%{$fl.text}} 
//  | fe=LITERAL_feature
//  	-> {%{$fe.text}} 
//	| ^(LITERAL_virtual LITERAL_bus)
//    -> template()"virtual bus"
//	| ^(LITERAL_virtual LITERAL_processor)
//    -> template()"virtual processor"
//	| ^(LITERAL_thread LITERAL_group)
//    -> template()"thread group"
//	| ^(LITERAL_subprogram LITERAL_group)
//    -> template()"subprogram group"
//	| ^(LITERAL_subprogram LITERAL_classifier)
//    -> template()"subprogram classifier"
//	| ^(LITERAL_subprogram LITERAL_call LITERAL_sequence)
//    -> template()"subprogram call sequence"
//	| ^(LITERAL_feature LITERAL_group)
//    -> template()"feature group"
//  | ^(LITERAL_data LITERAL_access )
//    -> template()"data access"
//  | ^(LITERAL_bus LITERAL_access )
//    -> template()"bus access"
//  | ^(LITERAL_component LITERAL_implementation )
//    -> template()"component implementation"
//  | ^(LITERAL_system LITERAL_implementation )
//    -> template()"system implementation"
//  | ^(LITERAL_abstract LITERAL_implementation )
//    -> template()"abstract implementation"
//  | clsfr=LITERAL_classifier
//  	-> {%{$clsfr.text}} 
//  | par=LITERAL_parameter
//  	-> {%{$par.text}} 
//  | pkg=LITERAL_package
//  	-> {%{$pkg.text}} 
//  | ^(LITERAL_mode LITERAL_transition)
//    -> template()"mode transition"
//  | al=LITERAL_all
//    -> {%{$al.text}}
//	;
		
	 
/////////////////////////////////11.1.3 PROPERTY CONSTANTS/////////////////////////
    
//property_constant
//  :
//  single_valued_property_constant | multi_valued_property_constant
//  ;
//      
//single_valued_property_constant
//  :
//  ^(LITERAL_constant /*defining_property_constant_*/dpc=ID 
//    ptd=property_type_designator
//    ARROW /*constant*/pe=property_expression)
//    -> property_constant(dpc={$dpc.text},ptd={$ptd.st},pe={$pe.st})
//  ;  

//multi_valued_property_constant
//  :
//  ^(LITERAL_constant /*defining_property_constant_*/dpc=ID 
//  	ll+=LITERAL_list+
//    ptd=property_type_designator
//    ARROW plv=property_list_value)
//    -> property_constant(dpc={$dpc.text},ptd={$ptd.st},pe={$plv.st},
//    	ll={$ll})
//  ;  

//property_list_value
//	:
//	^(PROPERTY_LIST pvs+=property_value+ )
//	  ->property_list_value(pvs={$pvs})
//	; 
	
//property_constant_name
//	:
//	^(DOUBLE_COLON ps=ID i=ID)
//		-> id_cc_id(fst={$ps.text},snd={$i.text})
////			"<ps>::<i>"
//	;
     
 
///////////////////////////////11.3 PROPERTY ASSOCIATIONS/////////////////////////

//property_association
//	:	//only unparse Assertion properties
//	^(ARROW 
//		( bpa=LITERAL_Assertion | bpa=LITERAL_Precondition |
//			bpa=LITERAL_Postcondition | bpa=LITERAL_Invariant )	
//		ass=assertion)
//	  -> bless_property_association(bpa={$bpa.text},ass={$ass.st})
//	|
//	^(ar=ARROW upi=unique_property_name cons=LITERAL_constant? 
//			propv=property_value )
//	  -> property_association(ar={$ar.text},upi={$upi.st},propv={$propv.st},
//	  		const={$cons.text}) 
//	|
//	^(ar=PLUS_ARROW upi=unique_property_name cons=LITERAL_constant? 
//			propv=property_value )
//	  -> property_association(ar={$ar.text},upi={$upi.st},propv={$propv.st},
//	  		const={$cons.text}) 
//	;

//unique_property_name
//	:
//	property_name_identifier=ID
//	 	-> {%{$property_name_identifier.text}}
//	|
//	^(DOUBLE_COLON property_set_identifier=ID  property_name_identifier=ID )	
//		->id_cc_id(fst={$property_set_identifier.text},snd={$property_name_identifier.text})
//	|
//	^(DOUBLE_COLON bl=LITERAL_BLESS  bless_property=ID )	
//		->id_cc_id(fst={$bl.text},snd={$bless_property.text})
//	;

///////////////////////////////11.4 property expressions////////////////////////

//property_expression
//  :
//  bt=boolean_term 
//    -> {$bt.st}
//	| sl=AADL_STRING_LITERAL
//		-> me(i={$sl.text})  //needs to unparse "<"
//  | cct=component_classifier_term 
//    -> {$cct.st}
//  | rect=property_record_term 
//    -> {$rect.st}
//  | pt=property_term
//  	-> {$pt.st}
//  | ^(DOTDOT ltp=property_term rtp=property_term)
//  	-> range(lb={$ltp.st},ub={$rtp.st})	
//  ;
	

//component_classifier_term
//  :
//  ^(LITERAL_classifier uccr=unique_component_classifier_reference)
//  	-> component_classifier_term(uccr={$uccr.st})
//  ;

//property_record_term
//  :
//  ^(LPAREN recf+=property_record_value+ RPAREN)
//  	-> property_record_term(recf={$recf})
//  ;
//  
//property_record_value
//  :
//  ^(ARROW rfi=ID pv=property_value)
//  	-> property_record_value(rfi={$rfi.text},pv={$pv.st})
//  ;  

//property_value
//	:
//	^(PROPERTY_LIST pvs+=property_value+ )
//		-> property_list_value(pvs={$pvs})
////	| pexp=property_expression
////		-> {$pexp.st}
//	;
    
//boolean_term
//  :
//  lt=LITERAL_true 
//  	->{%{$lt.text}}
//  | lf=LITERAL_false
//  	->{%{$lf.text}}
//  | ^(LITERAL_not bt=boolean_term )
//  	-> not(bt={$bt.st})
////  | ^(LITERAL_not pt=property_term )
////  	-> not(bt={$pt.st})
//  | ^(LPAREN be=boolean_expression RPAREN)
//  	-> parentheses(be={$be.st})
//  ;  
//  
//boolean_expression
//	:
//	bt=boolean_term
//	-> {$bt.st}
////	| pt=property_term
////		-> {$pt.st}
//	| ^(LITERAL_and bopt+=boolean_or_property_term+)
//		-> conjunction(bopt={$bopt})	
//	| ^(LITERAL_or bopt+=boolean_or_property_term+)
//		-> disjunction(bopt={$bopt})	
//	;  
//
//boolean_or_property_term
//	:
//	bt=boolean_term
//	-> {$bt.st}
////	| pt=property_term
////		-> {$pt.st}
//	;

//property_term
//	:
//	i=ID
//	-> {%{$i.text}}
//	|
//	^(DOUBLE_COLON ps=ID pn=ID)
//		-> id_cc_id(fst={$ps.text},snd={$pn.text})
//	|
//	nl=NUMERIC_LIT
//		-> {%{$nl.text}}
//	|
//	^(nl=NUMERIC_LIT unit=ID)
//		-> template(nl={$nl.text},unit={$unit.text})
//			"<nl> <unit>"
//	;
	 
//////////////BEHAVIOR SPECIFICATION LANGUAGE/////////////////////


thread_behavior 
	:	
	^( THREAD_ANNEX  ^(LITERAL_states bs+=behavior_state+ ) 
//		av=availability? 
 		ac=assert_clause?
  	inv=invariant_clause?
		sv=variables? 
		tran=transitions?
    no_proof=DO_NOT_PROVE?
		STOP  )
		-> thread_behavior(np={$no_proof.text},sv={$sv.st},bs={$bs},tran={$tran.st},ac={$ac.st},inv={$inv.st},name={componentName})
//		-> template(sv={$sv.st},bs={$bs},av={$av.st},tran={$tran.st})
//<<
//<av><sv>

//states
//  <bs; separator="\n">

//<tran>
//>>
	;

assert_clause
  :
  ^(LITERAL_assert ass+=assertion+) 
  	->template(ass={$ass})
<<assert 
  <ass; separator="\n"> 
>>
  ;

invariant_clause
  :
  ^(LITERAL_invariant a=assertion)
  	->invariant_clause(a={$a.st})
//  	->template(a={$a.st})
//<<invariant <a>
//>>
  ;
	
variables 
	:	
	^(LITERAL_variables bv+=behavior_variable* )
//		-> {Global.usingDataModelStringTemplateGroup}? 
//			variables(bv={$bv},pn={getPackageName()})
		-> variables(bv={$bv})
	;	
	
behavior_variable 
	:	
	^(COLON 
//	  d=declarators 
    (^(COMMA d+=ID+) | d+=ID)
	  ^(TYPE t=type )
	  ( ^(agn=ASSIGN e=expression) )? 
	  ( ass=assertion )?
	  ( (  p=LITERAL_nonvolatile | 
	    sh=LITERAL_shared | con=LITERAL_constant 
	   	| sp=LITERAL_spread | finl=LITERAL_final ) )?
	  SEMICOLON
	  )
		->behavior_variable_type(d={$d},t={$t.st}, p={$p.text},
		s={$sh.text},con={$con.text},sp={$sp.text},e={$e.st},finl={$finl.text},ass={$ass.st})
//	|
//	^(COLON d=declarators  t=type e2=expression? )
//		->behavior_variable_type(d={$d.st},t={$t.st},e={$e2.st})
//		->template(d={$d.st},t={$t.st},e={$e.st},p={$p.text})
//		"<d> :<p> <t><if(e)>:=<e><endif>;"
	;

/*
declarators
	:
	^(COMMA d+=ID+)
		->template(d={$d})"<d; separator=\",\">"
	|
	d1=ID
		->{%{$d1.text}}
	;
*/

/*
units_declaration
	:
	^(LITERAL_units i=ID ul=units_list)
		->units_declaration(i={$i.text},ul={$ul.st})	
	;
	
	
	
type_declaration
	:
	^(LITERAL_type i=ID t=type )
		->type_declaration(i={$i.text},t={$t.st})
	;
	

type_operator
	:
	^(LITERAL_type i=ID LBRACKET param+=ID+ RBRACKET t=type )
		->type_operator(i={$i.text},param={$param},t={$t.st})
	;
	
type_operator_invocation
	:
	^( TYPE_OPERATOR_INVOCATION o=ID ty+=type+ )
		->type_operator_invocation(o={$o.text},ty={$ty})
	;	
*/

behavior_state 
	:	
	^(LITERAL_state in=LITERAL_initial? com=LITERAL_complete? finl=LITERAL_final? bsi=identifier a=assertion?)
		-> behavior_state(bsi={$bsi.st},i={$in.text},com={$com.text},finl={$finl.text},a={$a.st})
//		-> template(bsi={$bsi},i={$in.text},com={$com.text},finl={$finl.text},a={$a.st})
//		"<bsi; separator=\",\"> : <if(i)><i> <endif><if(com)><com> <endif><if(finl)><finl> <endif>state<a>;"
	;
	
			
transitions 
	:	
	^(LITERAL_transitions bt+=behavior_transition+)
		-> transitions(bt={$bt})
//		-> template(bt={$bt})
//<<transitions
//  <bt; separator="\n\n">
//>>
	;	
	
behavior_transition 
	:	
	^( TRANSITION ^( LABEL btl=behavior_transition_label? ) ^( SOURCE ssi+=ID+ )  
		^( CONDITION bc=behavior_condition? ) 
		^( DESTINATION dsi=ID ) ^( ACTION ba=behavior_actions? ) ^( Q btq=assertion?) )
		-> behavior_transition(btl={$btl.st},ssi={$ssi},bc={$bc.st},dsi={$dsi.text},ba={$ba.st},btq={$btq.st})
//		-> template(btl={$btl.st},ssi={$ssi},bc={$bc.st},dsi={$dsi.text},ba={$ba.st},btq={$btq.st})
//<<<if(btl)><btl>: <endif><ssi; separator=",">-[<bc>]-\><dsi><if(ba)><\n>{<ba><\n>}<endif><btq>;<if(btl)>  --end of <btl><endif> >>
	;
	
behavior_transition_label 
	:	
	^(i=ID n=INTEGER_LIT)
		-> template(i={$i.text},n={$n.text})"<i>[<n>]"
	|
	i2=ID
		-> template(i2={$i2.text})"<i2>"
	;	

behavior_condition 
	:	
	dc=dispatch_condition 
		-> {$dc.st}	
	| e=execute_condition
		-> {$e.st}
	| c=mode_condition
		-> {$c.st}
	;
 
execute_condition 
	:	
	be=/*boolean_*/expression_or_relation
		-> {$be.st}
	;
 

mode_condition
  :
   ^(LITERAL_on mt=trigger_logical_expression)
     -> template(mt={$mt.st})"on <mt>"
  ;

trigger_logical_expression
  :
  et=event_trigger
    -> {$et.st}
  |
  ^(LITERAL_and triggers+=event_trigger)
    -> l_and(bs={$triggers})
//    -> template(t={$triggers})"<t, separator=\" and \">"
  |
  ^(LITERAL_or triggers+=event_trigger)
    -> l_or(bs={$triggers})
//    -> template(t={$triggers})"<t, separator=\" or \">"
  |
  ^(LITERAL_xor triggers+=event_trigger)
    -> l_xor(bs={$triggers})
//    -> template(t={$triggers})"<t, separator=\" xor \">"
  |
  ^(LITERAL_cand triggers+=event_trigger)
    -> l_cand(bs={$triggers})
//    -> template(t={$triggers})"<t, separator=\" and then \">"
  |
  ^(LITERAL_cor triggers+=event_trigger)
     -> l_cor(bs={$triggers})
//   -> template(t={$triggers})"<t, separator=\" or else \">"
  ;
 
event_trigger
  :
  port=ID
    -> {%{$port.text}}
  |
  ^(PERIOD id+=ID)  
    -> template(id={$id})"<id, separator=\".\">"
  |
  ^(LPAREN tle=trigger_logical_expression RPAREN)
    -> template(tle={$tle.st})"(<tle>)"
  ;  


/////////////////BEHAVIOR ACTION LANGUAGE////////////////////////	

subprogram_behavior 
	:
	^(SUBPROGRAM_ANNEX 
//		av=availability?   
		ac=assert_clause?
		( ^(LITERAL_pre p1=assertion) )?
		( ^( LITERAL_post p2=assertion) )?
		elq=existential_lattice_quantification)	
    no_proof=DO_NOT_PROVE?
	-> subprogram_behavior(np={$no_proof.text},ac={$ac.st},p1={$p1.st},p2={$p2.st},elq={$elq.st})
	;


asserted_action
	:
	aas=asserted_action_stub
		->{$aas.code}
	;
	
asserted_action_stub  returns [StringTemplate code=Global.templates.getInstanceOf("asserted_action")]
	:
	^( ACTION 
		^(P (pr=assertion { $code.setAttribute("p", pr);} )? )
		^( S s=action {$code.setAttribute("s", s);}) 
		^(Q (po=assertion  {$code.setAttribute("q", po);})? )	)
	;

action 
	:	
	ba=basic_action
 		 ->{$ba.st}		//template(a={$ba.st})"<a>" 
	| alt=alternative
 		 ->{$alt.st}
	| ulq=universal_lattice_quantification
  		->{$ulq.st}
	| wl=while_loop
  		->{$wl.st}
	| dul=do_until_loop
		  ->{$dul.st}
	| fl=for_loop
		  ->{$fl.st}
	| elq=existential_lattice_quantification
 		 ->{$elq.st}
	;

alternative 
	:	
	^(LITERAL_if //av=availability? 
	  gf+=guarded_action+)
		-> alternative(gf={$gf})

//		-> template(gf={$gf},av={$av.st})
//<<if <if(av)><av><endif>
//  <gf; separator="\n[]\n">
//fi>>
	;

guarded_action 
	:	
	^(GUARD be=expression_or_relation ba=asserted_action)
		-> guarded_action(be={$be.st},ba={$ba.st})
//		-> template(be={$be.st},ba={$ba.st})
//			"(<be>)-> <ba>"
	;

universal_lattice_quantification 
	:	
	^(LITERAL_forall
		lv=lattice_variables
		^(LITERAL_in ir=range) 
//		av=availability? 
		elq=existential_lattice_quantification)
		-> ulq(lv={$lv.st},ir={$ir.st},elq={$elq.st})
//		-> template(lv={$lv.text},ty={$ty.st},ir={$ir.st},elq={$elq.st},av={$av.st})
//<<forall <lv>:<ty> in <ir><if(av)> <av><endif>
//  <elq> >>
	;
	
while_loop 
	:	
	^(LITERAL_while be=expression_or_relation ^(INVARIANT inv=assertion?) 
		^(BOUND bd=expression?) elq=existential_lattice_quantification)
		-> while_loop(be={$be.st},elq={$elq.st},bd={$bd.st},inv={$inv.st})
	;
		
for_loop 
	:	
	^(LITERAL_for a=ID 
		^(LITERAL_in lb=expression ub=expression) 
		 ^(INVARIANT inv=assertion?) 
		act=behavior_actions )
		-> for_loop(a={$a.text},lb={$lb.st},ub={$ub.st},ba={$act.st},inv={$inv.st})
	;
	
do_until_loop 
	:		
	^(LITERAL_do ^(LITERAL_until be=expression_or_relation) ^(INVARIANT inv=assertion?) 
		^(BOUND bd=expression?) ba=behavior_actions)
		-> do_until(be={$be.st},ba={$ba.st},bd={$bd.st},inv={$inv.st})
//		-> template(be={$be.st},ba={$ba.st},av={$av.st},bd={$bd.st},inv={$inv.st})
//<<do <\n><if(av)>  <av><endif><if(inv)>  invariant <inv><\n><endif><if(bd)>  bound <bd><\n><endif>  <ba><\n>until (<be>)>>	
	;
		
basic_action 
	:	
	LITERAL_skip
		->skip()//"skip"
	| sa=simultaneous_assignment
				-> {$sa.st}	
	| a=assignment
         -> {$a.st}
	| c=communication 
         -> {$c.st}
	| ta=timed_actions
         -> {$ta.st}
	| LITERAL_setmode m=ID
		->template(m={$m.text})"setmode <m>"
	| wt=when_throw
         -> {$wt.st}
  | co=combinable_operation
          -> {$co.st}
  | ie=issue_exception
     -> {$ie.st}
	;

assignment 
	:	
	^(ASSIGN nt=name_tick eort=expression_or_record_term)
	  -> assignment(nt={$nt.st},eort={$eort.st})
//		-> template(nt={$nt.st},eort={$eort.st})"<nt> := <eort>"
	;

name_tick
  :
   ^(TICK vn=/*variable_*/name)
     -> name_tick(vn={$vn.st})
//     -> template(vn={$vn.st})"<vn>'"  
  |
   vn=/*variable_*/name
     -> {$vn.st}  
  ;
  
expression_or_record_term
  :
  e=expression 
    -> {$e.st}
  | 
  rt=record_term
    -> {$rt.st}
  | any=LITERAL_any
    -> {%{$any.text}}
  ;

simultaneous_assignment
  :
  ^( ASSIGN ^( COMMA lhs+=name_tick+ ) ^( COMMA rhs+=expression_or_record_term+ ) )
    -> {Global.usingSlangStringTemplateGroup}?  {slang_simultaneous_assignment($lhs,$rhs)}
    -> simultaneous_assignment(l={$lhs},r={$rhs})
  ;

issue_exception
  :
  ^(LITERAL_exception exception_state=ID message=AADL_STRING_LITERAL)
    -> template(es={$exception_state.text},m={$message.text})
      "exception (<es>,<m>)"
  |
  ^(LITERAL_exception message=AADL_STRING_LITERAL)
    -> template(m={$message.text})
      "exception (<m>)"
  ;	
	
timed_actions 
	:	
	^(LITERAL_computation bt+=behavior_time+)
		-> template(bt={$bt})"computation(<bt; wrap, anchor, separator=\", \">)"  //this just looks wrong
	|
	^(LITERAL_delay bt2+=behavior_time+)
		-> template(bt2={$bt2})"delay(<bt2; wrap, anchor, separator=\", \">)"	
	;	
	
behavior_time 
	:	
	^(BEHAVIOR_TIME e=expression u=time_unit?)
	  -> behavior_time(e={$e.st},u={$u.st})
//		-> template(e={$e.st},u={$u.st})"<e> <u>"
//	|
//	^(BEHAVIOR_TIME e=expression)
//	  -> behavior_time(e={$e.st})
	;	

time_unit
  :
  ( tu=LITERAL_ps
  | tu=LITERAL_us 
  | tu=LITERAL_ms 
  | tu=LITERAL_sec 
  | tu=LITERAL_min     
  | tu=LITERAL_hr  
  ) -> {%{$tu.text}}    
  ;

communication 
	:	
	^(PROCEDURE_CALL p=ID spb=formal_actual_list)
		-> procedure_call(p={$p.text},spb={$spb.st})
	|
	^(PROCEDURE_CALL p=ID)
		-> procedure_call(p={$p.text})
	|
	^(PORT_OUTPUT o=port_name be=expression_or_relation)
	  -> port_output(o={$o.st},be={$be.st})
//		-> template(o={$o.st},be={$be.st})"<o>!(<be>)"
	|
	^(PORT_OUTPUT o=port_name)
	  -> event_port_output(o={$o.st})
//		-> template(o2={$o.st})"<o2>!"
	|
	^(PORT_INPUT i=port_name n=/*local_variable_ or outgoing_port_ or outgoing_parameter_*/name)
    -> port_input(i={$i.st},n={$n.st})
//		-> template(i={$i.st},n={$n.st})"<i>?(<n>)"
  | pause=LITERAL_pause
    -> {%{$pause.text}}
	;

port_name
	:
	port=ID
	  -> {%{$ID.text}}
	|
	^(PERIOD ids+=ID+)
	  -> template(ids={$ids})"<ids; separator=\".\">"
//	|
//	^(LBRACKET portarray=ID portelement=ID RBRACKET)
//	  -> template(a={$portarray.text},e={$portelement.text})"<a>[<e>]"
	|
	^(LBRACKET portarray=ID portindex=INTEGER_LIT RBRACKET)	
	  -> template(a={$portarray.text},idx={$portindex.text})"<a>[<idx>]"
	;


formal_actual_list 
	:	
	^( COMMA ns+=formal_actual+)
	 -> formal_actual_list(ns={$ns})
//	 -> template(ns={$ns})"<ns; wrap; separator=\",\">"
	|
	n=formal_actual
	 -> {$n.st}  //template(n={n.st})"<n>"
	;

formal_actual
  :
  ^(COLON formal=ID ap=actual_parameter )
    -> formal_actual(f={$formal.text},ap={$ap.st})
//    -> template(f={$formal.text},ap={$ap.st})"<f>:<ap>"
  | 
  ap=actual_parameter
    -> {$ap.st}
  ;

//allows actual paramters to have '
actual_parameter
	:
/*	^(TICK constant=value_constant)
    -> template(c={$constant.st})"<c>'"
  |  
	^(TICK actual=name)
    -> template(a={$actual.st})"<a>'"
  | */
  vc=value_constant
    -> {$vc.st}
  |  
  n=name
    -> {$n.st}
  |
  ps=parenthesized_subexpression
    -> {$ps.st}  
  ;
	
quantified_variables 
  : 
  ^(v=LITERAL_declare ( bv+=behavior_variable )+ )
    -> quantified_variables(bv={$bv})
  ;

//quantified_variable
//	:
//	^(COLON i=ID t=type)
//	-> template(i={$i.text},t={$t.st})"<i>:<t>"
//	|
//	^(COLON i=ID ^(ASSIGN e=expression)  t=type )
//	-> template(i={$i.text},t={$t.st},e={$e.st})"<i>:<t>:=<e>"
//	;

existential_lattice_quantification 
	:	
	^(LCURLY v=quantified_variables? ba=behavior_actions RCURLY  
	   timeout=timeout_clause? 
	   cc=catch_clause? )
		-> elq(v={$v.st},ba={$ba.st},cc={$cc.st})
//		-> template(v={$v.st},ba={$ba.st})
//<<<if(v)>variables
 // <v><endif>
//{
//  <ba>
//}>> 
	;

timeout_clause
  :
  ^(LITERAL_timeout time=behavior_time)
  	->template(time={$time.st})"timeout <time>"
  ; 

catch_clause
  :
  ^(LITERAL_catch cct+=catch_clause_term+)
    ->catch_clause(cct={$cct})
//  	->template(cct={$cct})"catch <cct; separator= >"
  ; 

catch_clause_term
  :  
  ^(COLON LITERAL_all ba=basic_action)
  	->template(ba={$ba.st})"(all:<ba>)"  
  |
  ^(COLON ei+=ID ba=basic_action)
    ->catch_clause_term(ei={$ei},ba={$ba.st})
//  	->template(ei={$ei},ba={$ba.st})"(<ei; seperator= >:<ba>)"  
  ;
 
when_throw
	:
	^(LITERAL_when e=expression LITERAL_throw x=ID)
		-> template(e={$e.st},x={$x.text})"when (<e>)<\n>throw <x>"
	;


combinable_operation
  :
  ^(cl=combinable_literal tar=variable_name val=expression result=ID?  )
    -> {result!=null}? template(cl={$cl.st},t={$tar.st},v={$val.st},r={$result.text})
      "<cl>(<t>,<v>,<r>)"
    -> template(cl={$cl.st},t={$tar.st},v={$val.st})
      "<cl>(<t>,<v>)"
   |
 ^( LITERAL_swap vn=variable_name ref=variable_name result=ID  )
    -> template(t={$vn.st},v={$ref.st},r={$result.text})
      "swap(<t>,<v>,<r>)"
  ;

combinable_literal
//  @after {$st = %{$text};}
  :  
  (
  f=LITERAL_fetchadd  
  |
  f=LITERAL_fetchor  
  |
  f=LITERAL_fetchand   
  |
  f=LITERAL_fetchxor 
  )
  -> {%{$f.text}}
   ;


behavior_actions 
	:	
	aa=asserted_action
		-> {$aa.st}  // template(aa={$aa.st})"<aa>"
//		-> me(i={$aa.st})
	|
	^(semi=SEMICOLON scom+=asserted_action+)
		-> sequential_composition(f={$scom})
//		-> {$semi.n()}? template(scom={$scom})"<scom; separator=\";\n\">"
//		-> template(scom={$scom})"<scom; separator=\" ; \">"
	|
	^(amp=AMPERSAND ccom+=asserted_action+)
		-> concurrent_composition(g={$ccom})
//		->  template(ccom={$ccom})"<ccom; separator=\"\n&\n\">"
//		-> {$amp.n()}? template(ccom={$ccom})"<ccom; separator=\"\n&\n\">"
//		-> template(ccom={$ccom})"<ccom; separator=\" & \">"
	;

////////////////////////////////////////// EXPRESSION /////////////////////////////////////////


name 
	:
	^(PERIOD pn+=partial_name+ )
	  -> name(p={$pn})
//		-> template(p={$pn})"<p; separator=\".\">"
	|
	pp=partial_name
	  -> name(pp={$pp.st})
//		-> {$pp.st}
	;
	

partial_name 
	:	
	ID  -> {%{$ID.text}}
//		-> template(identifier={$ID.text})"<identifier>"
	|
	^( ID idx+=expressionOrRange+)
		-> template(i={$ID.text},idx={$idx})
			"<i>[<idx; separator=\"][\">]"
	;
	
parameter_list 
	:	
	^(COMMA eor+=expressionOrRange+ )
		-> template(eor={$eor})"<eor; separator=\",\">"
	|
	eor2=expressionOrRange
		-> {$eor2.st}  //template(eor2={$eor2.st})"<eor2>"
	;	

range_symbol 
  : 
  (rs=DOTDOT | rs=COMMADOT | rs=DOTCOMMA | rs=COMMACOMMA)
    -> {%{$rs.text}}
//  DOTDOT -> {%{$DOTDOT.text}}
//  | COMMADOT -> {%{$COMMADOT.text}}
//  | DOTCOMMA -> {%{$DOTCOMMA.text}}
//  | COMMACOMMA -> {%{$COMMACOMMA.text}}
	; 
	
expressionOrRange 
	:	
	^( rs=range_symbol l=expression h=expression )
		-> template(lb={$l.st},ub={$h.st},rs={$rs.st})
			"<lb><rs><ub>"
	|
	e=expression
		-> {$e.st}  //template(e={$e.st})"<e>"
	;	
	
	
expression // throws ProofException
	:	
	^( n=PLUS a+=subexpression+ )
		-> add(terms={$a})
	|
	^( n=TIMES a2+=subexpression+ )
		-> multiply(terms={$a2})
	|
	^( n=MINUS l=subexpression r=subexpression )
	  -> two_element_expression_spaced(op={$n.text},l={$l.st},r={$r.st})
	|
	^( n=DIVIDE numer=subexpression d=subexpression )
	  -> two_element_expression_spaced(op={$n.text},l={$numer.st},r={$d.st})
	|
	^( n=LITERAL_mod l2=subexpression r2=subexpression )
	  -> mod(l={$l2.st},r={$r2.st})
	|
	^( n=LITERAL_rem l6=subexpression r6=subexpression )
	  -> rem(l={$l6.st},r={$r6.st})
	|
	^( n=EXP l3=subexpression r3=subexpression )
	  -> exp(l={$l3.st},r={$r3.st})
	|
	^( n=LITERAL_and a3+=subexpression+ )
		-> l_and(bs={$a3})
	|
	^( n=LITERAL_or a4+=subexpression+ )
		-> l_or(bs={$a4})
	|
	^( n=LITERAL_xor a5+=subexpression+  )
		-> l_xor(bs={$a5})
	|
	^( n=LITERAL_cand l4+=subexpression+ )
	  -> l_cand(bs={$l4})
	|
	^( n=LITERAL_cor l5+=subexpression+ )
	  -> l_cor(bs={$l5})
	| 
	only=subexpression
	  -> {$only.st}
//		-> template(only={$only.st})"<only>"
	;	
  catch [RecognitionException re]
    {
    if (!suppressRecognitionException)
      {
      Dump.it("UnparseBLESS.expression caught RecognitionException");
      if ($n!=null)
        $n.showParseTree($n.getText());
      }
    reportError(re);
    }
	
subexpression // throws ProofException
	:
//	^( BEHAVIOR_TIME n=name unit=ID)
//		-> {$n.st}	//print the name w/o unit in subexpression
//	|
	^( UNARY_MINUS a=value )
		-> template(a={$a.st}) "-<a>"
	|
	^( UNARY_MINUS ps=parenthesized_subexpression  )
		-> template(ps={$ps.st}) "-<ps>"
	|
	^( LITERAL_not a2=value )
	  -> not(bt={$a2.st})
//		-> template(a2={$a2.st}) "not <a2>"
	|
	^(LITERAL_not ps=parenthesized_subexpression  )
	  -> not(bt={$ps.st})
//		-> template(ps={$ps.st}) "not <ps>"
	|
	ps=parenthesized_subexpression  
		-> {$ps.st}
//	|
//	^( r=relation_symbol lhs=expression rhs=expression )
//		-> template(r={$r.st},lhs={$lhs.st},rhs={$rhs.st})
//			"<lhs> <r> <rhs>"
	|
	a3=value
		-> {$a3.st}
	|
  fc=function_call 
    -> {$fc.st}
  | tc=type_conversion
    -> {$tc.st}
	;
//	catch [RecognitionException re] 
//		{throw new ProofException("subexpression",(BAST)retval.getTree());}
	
type_conversion
	:
  ^(n=LITERAL_natural ps=parenthesized_subexpression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_integer ps=parenthesized_subexpression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_rational ps=parenthesized_subexpression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_real ps=parenthesized_subexpression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_complex ps=parenthesized_subexpression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_time ps=parenthesized_subexpression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
	;
	
assertion_type_conversion
	:
  ^(n=LITERAL_natural ps=parenthesized_assertion_expression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_integer ps=parenthesized_assertion_expression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_rational ps=parenthesized_assertion_expression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_real ps=parenthesized_assertion_expression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_complex ps=parenthesized_assertion_expression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
  | ^(n=LITERAL_time ps=parenthesized_assertion_expression)
    -> template(n={$n.text},ps={$ps.st})"<n><ps>"
	;
	
	
parenthesized_subexpression
	:
	^( LPAREN eor=expression_or_relation RPAREN  )
	  -> template(eor={$eor.st})"(<eor>)"	
	|
	ce=conditional_expression
	  -> {$ce.st}
	|
	cas=case_expression
	  -> {$cas.st}
	;	

case_expression
  :
  ^( CASE_EXPRESSION cc+=case_choice+ )
    -> case_expression(cc={$cc})
  ;

case_choice
  :
  ^( IMP be=boolean_expression_or_relation exp=expression)
    -> case_choice(be={$be.st},exp={$exp.st})
  ;
  	
conditional_expression
  :
	^(CONDITIONAL be=expression_or_relation t=expression f=expression)
	  -> conditional_expression(be={$be.st},t={$t.st},f={$f.st})
	  //"(<be>??<t>:<f>)" 
    //(if <be> then <t> else <f>)" 
  ;	
	
value
	:	
  vc=value_constant -> {$vc.st}
	|
	vn=variable_name -> {$vn.st}
	|
	^(QUESTION pn=port_name)
	  -> in_port_value(pn={$pn.st})
//		-> template(i={$pn.st})"<i>?"
	|
	^(TICK pn=port_name LITERAL_fresh)
	  -> port_fresh(i={$pn.st})
//		-> template(i={$pn.st})"<i>'fresh" //portname'fresh = unread value at in data port
	|
	^(TICK pn=port_name LITERAL_count)
	  -> port_count(i={$pn.st})
//		-> template(i={$pn.st})"<i>'count" //portname'count = number of unread values in queue for in data port
	|
	^(TICK pn=port_name LITERAL_updated)
	  -> port_updated(i={$pn.st})
//		-> template(i={$pn.st})"<i>'updated" //portname'count = number of unread values in queue for in data port
	|
	^(INMODE m+=ID+)
		-> template(m={$m})"in mode (<m; separator=\" \">)"
	|
	to=LITERAL_timeout -> {%{$to.text}}
	|
	nu=LITERAL_null -> {%{$nu.text}}
	|
	now=LITERAL_now -> now() //{%{$now.text}} 
	|
	tops=LITERAL_tops -> {%{$tops.text}}
	;
		
variable_name 
	:
	n=name -> {$n.st}
	; 

expression_or_relation_or_record	
  :
  eor=expression_or_relation
    -> {$eor.st}
  ;

expression_or_relation
	:
//	^( r=relation_symbol lhs=subexpression rhs=subexpression )
//		-> template(r={$r.st},lhs={$lhs.st},rhs={$rhs.st})
//			"<lhs> <r> <rhs>"
  rel=relation -> {$rel.st}
	|
	e=expression -> {$e.st}
  |
  rt=record_term -> {$rt.st}  
	;	

relation
  :
  ^(EQ  lhs=subexpression rhs=subexpression )
    -> equal_relation(lhs={$lhs.st},rhs={$rhs.st})
//    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> = <rhs>"
  |  
  ^(LT  lhs=subexpression rhs=subexpression )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \< <rhs>"
  |  
  ^(AM  lhs=subexpression rhs=subexpression )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \<= <rhs>"
  |  
  ^(AL  lhs=subexpression rhs=subexpression )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \>= <rhs>"
  |  
  ^(GT  lhs=subexpression rhs=subexpression )
    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \> <rhs>"
  |  
  ^(NEQ  lhs=subexpression rhs=subexpression )
    -> not_equal_relation(lhs={$lhs.st},rhs={$rhs.st})
//    ->  template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> \<\> <rhs>"
  ;

relation_symbol
	:
	( t=EQ |  t=LT | t=AM | t=AL | t=GT ) // | t=NEQ )
		-> template(t={$t.text})"<t>"
		//must use anonymous template because LT is recognized as the start of a StringTemplate symbol
	|
	t=NEQ
  -> //{%{$t.text}}  
    {%{(Global.usingSignalStringTemplateGroup?"/=":"\\<\\>")}}
	;
	

function_call
  :
  ^(FUNCTION_CALL ^(DOUBLE_COLON p+=ID+)  f=ID pl=function_parameters? )
    -> {Global.usingSlangStringTemplateGroup}? function_call(f={getSlangFunctionCall($f.text)}, pl={$pl.st}, p={$p})
    -> function_call(f={$f.text}, pl={$pl.st}, p={$p})
//			"<p; separator=\"::\">::<f>(<pl>)"
  |
  ^(FUNCTION_CALL f=ID pl=function_parameters? )
   -> {Global.usingSlangStringTemplateGroup}? function_call(f={getSlangFunctionCall($f.text)}, pl={$pl.st})
   -> function_call(f={$f.text}, pl={$pl.st})
//			"<f>(<pl>)"
	;
	
 
function_parameters
  :
  fpr=formal_expression_pair 
    -> {$fpr.st}
  |
  ^( COMMA  param+=formal_expression_pair+ )
    -> template(param={$param})"<param; separator=\", \">"
  ;

formal_expression_pair
  :
  ^(ARROW formal=ID  actual=expression)
    -> formal_expression_pair(f={$formal.text},a={$actual.st}) //"<f>=\><a>"
  ;

/////////////////////// AADL TYPE //////////////////////////////////

type 
	:	
	tn=type_name
		->{$tn.st}
	|
	et=enumeration_type
		->{$et.st}
	|
	nt=number_type
		->{$nt.st}
	|
	at=array_type
		->{$at.st}
	|
	rt=record_type
		->{$rt.st}
	|
	vt=variant_type
		->{$vt.st}
//	|
//	 toi=type_operator_invocation
//		->{$toi.st}
	|
	bo=LITERAL_boolean ->  boolean() 
	|
	st=LITERAL_string ->  string() 
	;
	catch [RecognitionException re] 
		{Dump.it("Unparse:type="+((BAST)retval.start).toStringTree()); reportError(re);}

enumeration_type 
  : 
  ^(LITERAL_enumeration id+=ID+)
    -> enumeration_type(id={$id},et={getNextTypeID()})
  ; 
	
//units_type 
//	:	
//	^('units' ul=units_list)
//		-> units_type(ul={$ul.st},ut={getNextTypeID()})
//		{ 
//		StringTemplate b = template("units_type");
//		b.setAttribute("ut",getNextTypeID());
//		b.setAttribute("ul",$ul.st);
//		$units_type.st = b;
//		}
//		-> units_type(ul={$ul.st})
//		"units <ul>"
//	;

/*
units_list 
	:	
	^(LPAREN first_unit=ID au+=another_unit+)
		-> units_list(fu={$first_unit.text},au={$au})
//		"(<fu>, <au;  separator=\", \">)"
	|
	^(LPAREN first_unit=ID)
		-> units_list(fu={$first_unit.text})
//		 "(<fu2>)"
	;

another_unit 
	:	
	^(ARROW du=ID ^(TIMES u=ID n=INTEGER_LIT))
		-> template(du={$du.text},u={$u.text},n={$n.text})
		"<du>=><u>*<n>"
	;
*/

number_word
	:
	n=LITERAL_natural 
	-> natural()
	| n=LITERAL_integer 
	-> integer()
	| n=LITERAL_rational 
	-> rational()
	| n=LITERAL_real 
	-> real()
	| n=LITERAL_complex
	-> complex()
	| n=LITERAL_time
	 -> time()  //{%{$n.text}}
	;

number_type 
	:	
	nw3=number_word 
		-> {$nw3.st}
  |
	^( nw=number_word
		^(LITERAL_units ud=units_designator) nr=number_range  )
		-> number_type(nr={$nr.st}, ud={$ud.st},nw={$nw.st})
//	"<nw> [<nr>] units <ud>"
	|
	^( nw=number_word
		^(LITERAL_units ud=units_designator)  )
		-> number_type( ud={$ud.st},nw={$nw.st})
//		"<nw> units <ud>"
	|
	^( nw2=number_word nr=number_range  )
		-> number_type(nr={$nr.st},nw={$nw2.st})
//	"<nw> [<nr>]"
	;

number_range
  :
  cnr=constant_number_range
    -> template(cnr={$cnr.st})"<cnr>"
  ;

constant_number_range
  :
  ^(DOTDOT lb=numeric_constant ub=numeric_constant )
    -> template(lb={$lb.st},ub={$ub.st})"<lb> .. <ub>"
  |
  ^(DOTDOT ^(UNARY_MINUS lb=numeric_constant) ub=numeric_constant )
    -> template(lb={$lb.st},ub={$ub.st})"-<lb> .. <ub>"
  |
  ^(DOTDOT lb=numeric_constant ^(UNARY_MINUS ub=numeric_constant) )
    -> template(lb={$lb.st},ub={$ub.st})"<lb> .. -<ub>"
  |
  ^(DOTDOT ^(UNARY_MINUS lb=numeric_constant) ^(UNARY_MINUS ub=numeric_constant) )
    -> template(lb={$lb.st},ub={$ub.st})"-<lb> .. -<ub>"
  ;

units_designator
  :
  /*units_unique_property_type_*/uupt=ID
    -> {%{$uupt.text}}
  | tu=time_unit -> {$tu.st}
  ;

//range_type 
//	:	
//	^('range' nt=number_type)
//		-> template(nt={$nt.st})"range <nt>"
//	|
//	^('range' /*number_unique_property_type_*/nupt=ID)
//		-> template(nupt={$nupt.text})"range <nupt>"
//	;

record_type 
	:
	//cheating to test for generating Data Model text	
	{Global.usingDataModelStringTemplateGroup}?=>
	^(LITERAL_record ( ^(COLON df+=ID ptd+=type) )+ )
		->record_type(df={$df},ptd={$ptd})
	|
	^(LITERAL_record rf+=record_field+)
		-> record_type(rf={$rf})
	;


record_term
  :
  ^(RECORD_TERM typeid=ID rv+=record_value+ )
    -> template(rv={$rv})"[$typeid : <rv; separator=\" \">]"
  ;

record_value
  :
  ^(ARROW i=ID v=value)
    -> template(i={$i.text},v={$v.st}) "<i>=><v>;"
  ;  


record_field 
	:	
	^(COLON df=ID ptd=type)
		-> record_field(df={$df.text},ptd={$ptd.st})
	;

unique_component_classifier_reference 
  : 
  ^(DOUBLE_COLON  p+=ID+)
    -> unique_component_classifier_reference(p={$p})
  |
//  ^(DOUBLE_COLON bl=LITERAL_BLESS  r=ID)
//    ->  id_cc_id(fst={$bl.text},snd={$r.text})
//  |
  ^(DOUBLE_COLON  p+=ID+ ^(PERIOD ii=ID))
    -> unique_component_classifier_reference(p={$p},ii={$ii.text})
  |
  ^(PERIOD n=ID imp=ID)
    -> local_name(n={$n.text},imp={$imp.text},pn={getPackageName()})
    //"<i2>.<ii>"
  |
  n=ID
    -> local_name(n={$n.text},pn={getPackageName()})
//    -> template(i={$i.text})"<i>"
  ;

type_name
	:
	d=unique_component_classifier_reference
	  -> {$d.st}
	;


array_type 
	:	
	^(LITERAL_array arl=array_range_list LITERAL_of t=type)
		-> array_type(arl={$arl.st},t={$t.st},at={getNextTypeID()})
//		"array[<ar; separator=\" \">] of <t>"
	;
	
array_range_list
	:
	nr=natural_range
	  -> {$nr.st}
	|
	^(COMMA ranges+=natural_range+)
	  -> array_range_list(r={$ranges})
	;
	
natural_range 
	:	
	^(DOTDOT l=id_literal_or_property r=id_literal_or_property ) 
		-> {Global.usingDataModelStringTemplateGroup}? 
			me(i={makeDimensionFromRange($l.st,$r.st)})	
	 	->  array_range(l={$l.st},r={$r.st})
//	 	-> template(el1={$el1.text},el2={$el2.text})
//	 	"<el1>..<el2>"
//	|
//	^('..' il1=integer_literal il2=integer_literal  )
//	 	-> array_range(l={$il1.st},r={$il2.st})
//	 	"<il1>..<il2>"
	|
	 il=id_literal_or_property
	   -> {$il.st}
//	 	-> me(i={$il.st})
	;	

id_literal_or_property
	:
	i=ID
		->{%{$i.text}}
	|
	 il=integer_literal
     -> {$il.st}
  |
  constant=property_constant
    ->{$constant.st}
  |
  reference=property_reference
    ->{$reference.st}
//	 	-> me(i={$il.st})		
//  |  ^(DOUBLE_COLON ps=ID pn=ID)
//     ->template(ps={$ps.text},pn={$pn.text})"<ps>::<pn>"
//  |  ^(DOUBLE_COLON bl=LITERAL_BLESS pn=ID)
//     ->template(pn={$pn.text})"BLESS::<pn>"
//  |  ^(UNARY_MINUS il=integer_literal)
//     ->template(il={$il.st})"-<il>"
	;
	
variant_type 
	:	
//cheat .stg generality by testing a bit set only when generating AADL Data Model text	
	^(LITERAL_variant vf+=variant_field+ )
		->variant_type(vf={$vf})
	;


variant_field 
	:	
	^(COLON df=ID ptd=type)
		-> variant_field(df={$df.text},ptd={$ptd.st})
	;
		
///////////////////////////// ASSERTION /////////////////////////////////////

assertion_annex_library
	:	
  	ASSERTION_ANNEX
  	|
	^(ASSERTION_ANNEX a+=assertion+)
		-> template(a={$a})"<a; separator=\"\n\">"
	|
	^(ASSERTION_ANNEX p=predicate)
	  -> {$p.st}
//		-> template(p={$p.st})"<p>"
	;


assertion 
	:  
	^( ass=ASSERTION_ENUMERATION  ^( LABEL a=ID ) ^(PARAMETERS lv1=ID ) ae=assertion_enumeration )
		-> {Global.unparseAssertions}? assertion_enumeration(a={$a.text},lv1={$lv1.text},ae={$ae.st})
    -> template()" "
	|
	^( ass=ASSERTION_ENUMERATION ae=assertion_enumeration )
		-> {Global.unparseAssertions}? assertion_enumeration2(ae={$ae.st})  //same template, no label or parameters << +=>P(x)>>
    -> template()" "
	|
	^( ass=ASSERTION  ^( LABEL a=ID ) ^(PARAMETERS lv=formal_assertion_parameter_list )  p=predicate )
		-> {Global.unparseAssertions}? assertion(a={$a.text},lv={$lv.st},p={$p.st})
    -> template()" "
//		-> template(a={$a.text},lv={$lv},p={$p.st})
//	"<\n>  \<\<<if(a)><a>:<lv; separator=\" \" > : <endif><p>\>\><endif> "
	|
	^( ass=ASSERTION  ^( LABEL a=ID )  p=predicate )
		-> {Global.unparseAssertions}? assertion(a={$a.text},p={$p.st})
    -> template()" "
//	"<\n>  \<\<<if(a)><a>: : <endif><p>\>\><endif> "
	|
	^( ass=ASSERTION_FUNCTION ^( LABEL f=ID ) ^(PARAMETERS lv2=formal_assertion_parameter_list ) e=assertion_function_value )
		-> {Global.unparseAssertions}? assertion_function(a={$f.text},lv={$lv2.st},e={$e.st})
    -> template()" "
//		-> template(f={$f.text},lv2={$lv2},e={$e.st})
//		"<\n>  \<\<<f>:<lv2; separator=\" \"> := <e>\>\> "
	|
	^( ass=ASSERTION_FUNCTION ^( LABEL f=ID ) e=assertion_function_value )
		-> {Global.unparseAssertions}? assertion_function(a={$f.text},e={$e.st})
    -> template()" "
//		"<\n>  \<\<<f>: := <e>\>\> "
	|
	^( ass=ASSERTION_FUNCTION  e=assertion_function_value )
		-> {Global.unparseAssertions}? assertion_function(e={$e.st})
    -> template()" "
//		"<\n>  \<\<<f>: := <e>\>\> "
	|
	^( ass=ASSERTION   p2=predicate )
		-> {Global.unparseAssertions}? assertion(p={$p2.st})
    -> template()" "
//		-> template(p2={$p2.st})"\<\<<p2>\>\>"
  | ^( ass=ASSERTION d=DUMMY ) //do nothing
//    -> {%{$d.text}}
    -> template()" "
	; 
	catch [NoViableAltException nvae]
	   {reportError(nvae); 
	   if ($ass!=null)
	     $ass.showParseTree("Assertion Error");
	   Dump.it("\nDid you forget to put parentheses after an Assertion label?\n");
	   throw nvae;}

formal_assertion_parameter
  :
  p=ID
    -> formal_assertion_parameter(p={$p.text})
//    -> {%{$p.text}}
  |
  ^(TILDE p=ID t=type_name)
    -> formal_assertion_parameter(p={$p.text},t={$t.st})
//    -> template(p={$p.text},t={$t.st})"<p>~<t>"
  ;

formal_assertion_parameter_list
  :
  fap=formal_assertion_parameter 
    -> {$fap.st}
  |  
  ^(COMMA faps+=formal_assertion_parameter+ )
    -> formal_assertion_parameter_list(faps={$faps})
  //  -> template(faps={$faps})"<faps; separator=\", \">" 
  ;
 
assertion_function_value
	:
	cae=conditional_assertion_function
	  -> {$cae.st}
	|
	pe=assertion_expression
	  -> {$pe.st}
	;
	
conditional_assertion_function
	:
	^(CONDITIONAL_FUNCTION ( cvp+=condition_value_pair )+ )
	  -> conditional_assertion_function(cvp={$cvp})
//	  ->template(cvp={$cvp})"(<cvp; wrap, anchor, separator=\", \">)"
	;	

condition_value_pair
  :
  ^(IMP pp=parenthesized_predicate pe=assertion_expression)
    -> condition_value_pair(pp={$pp.st},pe={$pe.st})
//    ->template(pp={$pp.st},pe={$pe.st})"<pp> -> <pe>"
  ;


assertion_enumeration
  :
  ^( PLUS_ARROW pi=predicate_invocation )
    -> assertion_enumeration_predicate_invocation(pi={$pi.st})
//		-> template(pi={$pi.st}) "+=> <pi>"   
	|
  ^( PLUS_ARROW ep+=enumeration_pair* )
    -> assertion_enumeration_pairs(ep={$ep})
//		-> template(ep={$ep}) "+=> <ep; separator=\", \">"   	
  ;

enumeration_pair
  :
  ^( i=/*enumeration_literal_*/ID pe=predicate)
    -> enumeration_pair(i={$i.text},pe={$pe.st})
//    -> template(i={$i.text},pe={$pe.st}) "<i> -\> <pe>"
  ;



universal_quantification 
	:	
	^( a=LITERAL_all lv=logic_variables d=logic_variable_domain p=predicate  )
		->  universal_quantification(a={$a.text},lv={$lv.st},d={$d.st},p={$p.st})
//		->  template(a={$a.text},lv={$lv.st},d={$d.st},r={$r.text},p={$p.st})
//<<<a> <lv>
//    <d>
//    <r> <p; wrap,anchor> >>	
	;
	
lattice_variables 
	:  
	^( COMMA i+=identifier+ )
		-> template(i={$i})"<i; separator=\",\"> " 
  |
  i1=ID
    ->  {%{$i1.text}}  
	; 
	
existential_quantification 
	:	
	^( e=LITERAL_exists lv2=logic_variables d2=logic_variable_domain p2=predicate )
		->  existential_quantification(e={$e.text},lv2={$lv2.st},d2={$d2.st},p2={$p2.st})
//		->  template(e={$e.text},lv2={$lv2.st},d2={$d2.st},t={$t.text},p2={$p2.st})
//<<<e> <lv2>
//    <d2>
//    <t> <p2; wrap,anchor> >>
	;
	
logic_variables 
	:  
	^( COLON aty=assertion_type i+=identifier+ )	
		-> logic_variables(t={$aty.st},i={$i})  //"<i; separator=\",\">:<t>"    
		//-> template(t={$aty.st},i={$i})"<i; separator=\",\">:<t>"    
	; 
	
logic_variable_domain 
	:  
	^( i=LITERAL_in ^( rs=range_symbol l=assertion_expression h=assertion_expression ) )
	  -> logic_variable_domain(i={$i.text},l={$l.st},h={$h.st},rs={$rs.st})
//		-> template(i={$i.text},l={$l.st},h={$h.st},rs={$rs.st}) "<i> <l><rs><h>"
//	|
//	^( i=LITERAL_in ^( rs=range_symbol l=assertion_expression h=assertion_expression ) )
//	  -> logic_variable_domain(i={$i.text},l={$l.st},h={$h.st},rs={$rs.st})
//		-> template(i={$i.text},l={$l.st},h={$h.st},rs={$rs.st}) "<i> <l><rs><h>"
	|
	^(i2=LITERAL_in p=predicate )
	  -> logic_variable_domain2(i2={$i2.text},p={$p.st})
//		-> template(i2={$i2.text},p={$p.st}) "<i2> <p>"
	; 
		
	
predicate 
	: 
	(LITERAL_all)=>
	u=universal_quantification
		-> {$u.st}
//		-> template(u={$u.st}) "<u>"
	|
	(LITERAL_exists)=>
	e=existential_quantification
		-> {$e.st}
//		-> template(e={$e.st}) "<e>"
	|
	^( an=LITERAL_and pa+=subpredicate+ )
//		-> {$an.n()}? template(pa={$pa})"  <pa; separator=\"\nand\n\">"
		-> and(terms={$pa})//"<pa; wrap, separator=\" and \">"
	|
	^( o=LITERAL_or pa2+=subpredicate+ )
//		-> {$o.n()}? template(pa2={$pa2})"<pa2; separator=\"\nor \">"
		-> or(terms={$pa2})//"<pa2; wrap, separator=\" or \">"
	|
	^( x=LITERAL_xor pa3+=subpredicate+ )
//		-> {$x.n()}? template(pa3={$pa3})"<pa3; separator=\"\nxor \">"
		-> xor(terms={$pa3})//"<pa3; wrap, separator=\" xor \">"
	|
	^( imp=LITERAL_implies suposition=subpredicate consequence=subpredicate)
//		-> {$imp.n()}? template(imp={$imp.text},s={$suposition.st},c={$consequence.st})"<s><\n> <imp> <c>"
     -> implies(s={$suposition.st},c={$consequence.st})
//		-> template(imp={$imp.text},s={$suposition.st},c={$consequence.st})"<s> <imp> <c>"
	|
	^( i=LITERAL_iff ifthis=subpredicate andonlyifthis=subpredicate)
//		-> {$i.n()}? template(i={$i.text},l={$ifthis.st},r={$andonlyifthis.st})"<l><\n><i> <r>"
     -> iff(l={$ifthis.st},r={$andonlyifthis.st})
//		-> template(i={$i.text},l={$ifthis.st},r={$andonlyifthis.st})"<l> <i> <r>"
	|
	^( ar=IMP suposition=subpredicate consequence=subpredicate)
//		-> {$ar.n()}? template(ar={$ar.text},s2={$suposition.st},c2={$consequence.st})"<s2><\n><ar><c2>"
     -> implies(s={$suposition.st},c={$consequence.st})
//		-> template(ar={$ar.text},s2={$suposition.st},c2={$consequence.st})"<s2><ar><c2>"
	|
	paonly=subpredicate
		-> template(paonly={$paonly.st})"<paonly>"
	;	
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.predicate caught RecognitionException");
	  if ($an!=null)
	  	$an.showParseTree($an.getText());
	 else  if ($o!=null)
	  	$o.showParseTree($o.getText());
	 else  if ($x!=null)
	  	$x.showParseTree($x.getText());
	 else  if ($imp!=null)
	  	$imp.showParseTree($imp.getText());
	 else  if ($i!=null)
	  	$i.showParseTree($i.getText());
	 else  if ($ar!=null)
	  	$ar.showParseTree($ar.getText());
	  reportError(re);
	  }
		
subpredicate 
	:  
	^( n=LITERAL_not pas=predicate_atom_stub )
	  -> not(bt={$pas.st})
//		-> template(r={$pas.st}) "not <r>"
	| 
	pas=predicate_atom_stub
	  -> {$pas.st}
//		->me(i={$pas.st})
	; 
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.subpredicate caught RecognitionException");
	  if ($n!=null)
	  	$n.showParseTree($n.getText());
	  reportError(re);
	  }
	
predicate_atom_stub
	:
	t=LITERAL_true 
	  -> true()
//		-> {%{$t.text}}
	| f=LITERAL_false 
	  -> false()
//		-> {%{$f.text}}
	| s=LITERAL_stop
	  -> stop()
//		-> {%{$s.text}}
	| ta=timed_predicate
	  -> {$ta.st}
//		-> me(i={$ta.st})
//		-> template(pi={$pi.st})	"<pi>"
	| ^(  r=relation_symbol  lhs=assertion_subexpression rhs=assertion_subexpression)
	  -> relation(r={$r.st},lhs={$lhs.st},rhs={$rhs.st})
//		->template(r={$r.st},lhs={$lhs.st},rhs={$rhs.st})
//		"<lhs> <r> <rhs>"
	| ^( i=LITERAL_in p=assertion_subexpression ra=assertion_range)
		->in_range(p={$p.st},ra={$ra.st})
//		->template(p={$p.st},ra={$ra.st})
//		"<p> in <ra>"
	| ^( PLUS_EQUALS target=/*shared_integer*/ name parameter=assertion_subexpression)
		->template(target={$target.st},parameter={$parameter.st})
		" <target> += <parameter> "
//	| ^( LITERAL_def v=ID )
//	  ->template(v={$v.text})" def <v> "
	| ^( LITERAL_def lv=assertion_parameter )
	  ->template(lv={$lv.st})" def <lv> " 
//	|	//gets added during intial obligation creation
//	dc=dispatch_condition
//		->{$dc.st}
	;	//end of predicate_atom_stub

assertion_range
  : 
	^( rs=range_symbol lb=assertion_expression ub=assertion_expression )
		-> range(rs={$rs.st},lb={$lb.st},ub={$ub.st})
//	-> template(lb={$lb.st},ub={$ub.st},rs={$rs.st}) "<lb><rs><ub>"
  ;

assertion_parameter
  :
  par=ID
    -> {%{$par.text}}
  |
  ^(TILDE par=ID at=assertion_type)
    -> template(par={$par.text},at={$at.st})"<par>~<at>"
  ;

assertion_type 
  :
  b=LITERAL_boolean 
    -> {%{$b.text}}
  |	n=LITERAL_natural 
	-> natural()
	| n=LITERAL_integer 
	-> integer()
	| n=LITERAL_rational 
	-> rational()
	| n=LITERAL_real 
	-> real()
	| n=LITERAL_complex
	-> complex()
	| n=LITERAL_time
	 -> time()  //{%{$n.text}}
  | uccr=unique_component_classifier_reference
    -> {$uccr.st}
  ;

timed_predicate
//		options {backtrack=true;memoize=true;}
	:
	n=name 
	  -> {$n.st}
//		-> me(i={$n.st})
	| 
	p=parenthesized_predicate
		-> {$p.st}
	| 
	pi=predicate_invocation
	  -> {$pi.st}
	|
	^(tk=TICK tp=parenthesized_predicate )
	  -> tick(tp={$tp.st})
//		-> template(tp={$tp.st},tk={$tk.text})"<tp><tk>"
	|
	^(tk=TICK tn=name )
	  -> tick(tp={$tn.st})
//	-> template(tn={$tn.st},tk={$tk.text})"<tn><tk>"
	|
	^(AT_SIGN  
	  (atn=name 
	  | 
	  atp=parenthesized_predicate 
	  | 
	  stp=LITERAL_stop
          | 
          tru=LITERAL_true
	  | 
	  pi=predicate_invocation
	  )  
	  te=time_subexpression)
	-> {atn!=null}? at(p={$atn.st},t={$te.st}) //"<atn>@<te>"
        -> {stp!=null}? at(p={$stp.text},t={$te.st})   //"stop@<te>"
        -> {tru!=null}? at(p={$tru.text},t={$te.st})   //"true@<te>"
	-> {pi!=null}? at(p={$pi.st},t={$te.st})  //"<pi>@<te>"
	-> at(p={$atp.st},t={$te.st})   //"<atp>@<te>"
//		-> {atn!=null}? template(atn={$atn.st},te={$te.st})"<atn>@<te>"
//		-> {stp!=null}? template(te={$te.st})"stop@<te>"
//		-> {pi!=null}? template(pi={$pi.st},te={$te.st})"<pi>@<te>"
//		-> template(atp={$atp.st},te={$te.st})"<atp>@<te>"
	|
	^(CARET  
	  (cn=name 
	  | cp=parenthesized_predicate 
	  | stp=LITERAL_stop
      	  | tru=LITERAL_true
	  | pi2=predicate_invocation
	  )   
	  cv=period_shift)
	-> {cn!=null}? caret(p={$cn.st},cv={$cv.st})  //"<cn>^<cv>"
	-> {pi2!=null}? caret(p={$pi2.st},cv={$cv.st})  //"<pi2>^<cv>"
        -> {stp!=null}? caret(p={$stp.text},cv={$cv.st})  //"stop^<cv>"
        -> {tru!=null}? caret(p={$tru.text},cv={$cv.st})  //"true^<cv>"
	-> caret(p={$cp.st},cv={$cv.st})  //"<cp>^<cv>"
//		-> {cn!=null}? template(cn={$cn.st},cv={$cv.st})"<cn>^<cv>"
//		-> {pi2!=null}? template(pi2={$pi2.st},cv={$cv.st})"<pi2>^<cv>"
//		-> {stp!=null}? template(cv={$cv.st})"stop^<cv>"
//		-> template(cp={$cp.st},cv={$cv.st})"<cp>^<cv>"
	;
	
parenthesized_predicate 
	:  
	^(lb=LPAREN p=predicate rb=RPAREN)
	  -> parenthesized_predicate(p={$p.st})
//		-> template(lb={$lb.text},p={$p.st},rb={$rb.text})"<lb><p><rb>"   
	; 

predicate_invocation 
	:	
	^( INVOKE ^( p=ID exp+=actual_assertion_parameter+ ) )
		-> predicate_invocation(p={$p.text},ip={$exp}) 
//		-> template(p={$p.text},ip={$exp}) 
//		"<p>(<if(ip)><ip; wrap, separator=\",\"><endif>)"
 |
	^( INVOKE p=ID )
		-> predicate_invocation(p={$p.text}) 
//	   -> template(f={$p.text})"<f>()"
	|
	^( INVOKE ^( p=ID actual=assertion_expression ) )
		-> predicate_invocation(p={$p.text},a={$actual.st}) 
//     ->template(f={$p.text},a={$actual.st})"<f>(<a>)"
	|  //treat WP like a predicate invocation
	^( WP ba=behavior_actions pr=predicate )
		-> template(ba={$ba.st},pr={$pr.st})
		"WP(<ba>,<pr>)"
	;

//  ^(c=COLON forml=ID ae=assertion_expression)
 //   -> template(c={$c.text},formal={$formal.text},actual={$actual.st})"<formal><c><actual>"
 
actual_assertion_parameter
 	:
 	^(PARAMETER formal=ID actual=assertion_expression )
 	-> template(formal={$formal.text},actual={$actual.st})"<formal>:<actual>"
 	|
 	^(PARAMETER COLON_TILDE formal=ID pred=predicate )
  	-> template(formal={$formal.text},pred={$pred.st})"<formal>:<pred>"
	;

 

predicate_relation
	:
	^(  r=relation_symbol lhs=assertion_expression rhs=assertion_expression )
//		-> {rhs!=null}? template(r={$r.st},lhs={$lhs.st},rhs={$rhs.st})"<lhs> <r> <rhs>"
//		-> {ra!=null}?  template(r={$r.st},lhs={$lhs.st},rhs={$ra.st})"<lhs> <r> <rhs>"
		-> template(r={$r.st},lhs={$lhs.st},rhs={$ra.st})"<lhs> <r> <rhs>"
	|	
        ^( in=LITERAL_in lhs=assertion_expression ra=range )
		-> template(lhs={$lhs.st},rhs={$ra.st})"<lhs> in <rhs>"
	;

range
	:
	^( rs=range_symbol lb=expression ub=expression )
	  -> range(lb={$lb.st},ub={$ub.st},rs={$rs.st})
//	^( rs=range_symbol lb=assertion_expression ub=assertion_expression )
//	^( rs=range_symbol lb=subexpression ub=subexpression )
	//	-> template(lb={$lb.st},ub={$ub.st},rs={$rs.st}) "<lb><rs><ub>"
//	|
//	n=name
//		-> template(i={$n.st})"<i>"
	;

assertion_expression 
	:   
	^( s=LITERAL_sum lv=logic_variables lvd=logic_variable_domain?  LITERAL_of pe=assertion_expression )
		-> sum(s={$s.text},lv={$lv.st},d={$lvd.st},pe={$pe.st})
//			"sum <lv><if(d)> <d><endif> of <pe>"
	|
	^( p=LITERAL_product lv2=logic_variables d2=logic_variable_domain?  LITERAL_of pe2=assertion_expression  )
		-> product(p={$p.text},lv={$lv2.st},d={$d2.st},pe={$pe2.st})
//			"product <lv2><if(d2)> <d2><endif> of <pe2>"
	|
	^( no=LITERAL_numberof lv3=logic_variables d3=logic_variable_domain? LITERAL_that pa=subpredicate  )
 		-> numberof(lv={$lv3.st},d={$d3.st},pe={$pa.st})
// 			"numberof <lv3><if(d3)> <d3><endif> that <pa>"
 	|
	^( op=PLUS pse+=assertion_subexpression+ )  
		-> add(terms={$pse})
//		-> template(pse={$pse})"<pse;wrap, separator=\"+\">"
	| 
	^( op=TIMES pset+=assertion_subexpression+ )    
		-> multiply(terms={$pset})
//		-> template(pset={$pset})"<pset; wrap, separator=\"*\">"
	| 
	^( op=MINUS l=assertion_subexpression r=assertion_subexpression )   
	  -> two_element_expression(op={$op.text},l={$l.st},r={$r.st}) 
//		-> template(l={$l.st},r={$r.st}) "<l>-<r>"  
	| 
	^( op=DIVIDE n=assertion_subexpression d=assertion_subexpression )    
	  -> two_element_expression(op={$op.text},l={$n.st},r={$d.st}) 
//		-> template(n={$n.st},d={$d.st}) "<n>/<d>"  
	| 
	^( op=EXP b=assertion_subexpression exp=assertion_subexpression )    
	  -> two_element_expression(op={$op.text},l={$b.st},r={$exp.st}) 
//		-> template(b={$b.st},exp={$exp.st}) "<b>**<exp>"  
	| 
	^( op=LITERAL_mod l=assertion_subexpression r=assertion_subexpression )
	  -> two_element_expression_spaced(op={$op.text},l={$l.st},r={$r.st}) 
//		-> template(l={$l.st},r={$r.st}) "<l> mod <r>"  
	| 
	^( op=LITERAL_rem l=assertion_subexpression r=assertion_subexpression )
	  -> two_element_expression_spaced(op={$op.text},l={$l.st},r={$r.st}) 
//		-> template(l={$l.st},r={$r.st}) "<l> rem <r>"  
	| //or nothing, return just one assertion_subexpression
	pse3=assertion_subexpression 
		-> {$pse3.st} 
	; 
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.assertion_expression caught RecognitionException");
	  if ($op!=null)
	  	((BAST)$op).showParseTree($op.getText());
	  else if ($s!=null)
	  	((BAST)$s).showParseTree($s.getText());
	  else if ($p!=null)
	  	((BAST)$p).showParseTree($p.getText());
	  else if ($no!=null)
	  	((BAST)$no).showParseTree($no.getText());
	  reportError(re);
	  }

assertion_subexpression 
	:
/*	
	(DOUBLE_COLON)=>
	pc=property_constant_name
	  -> {$pc.st}
	|
	(um=UNARY_MINUS DOUBLE_COLON)=>
	^( UNARY_MINUS pc=property_constant_name )
		-> template(pc={$pc.st}) " -<pc>"
	|
	^( um=UNARY_MINUS fc=function_call)
		->template(fc={$fc.st}) " -<fc>"
	|
	fc2=function_call
	  -> {$fc2.st}
	|
	sl=AADL_STRING_LITERAL
    -> me(i={$sl.text})
	|
	^( um=UNARY_MINUS  n=NUMERIC_LIT)
		->template(n={$n.text}) " -<n>"
	|
	n2=NUMERIC_LIT
    -> {%{$n2.text}}
	|
	^( um=UNARY_MINUS  LITERAL_now)
		->template() "-now"
	|
	n3=LITERAL_now
    -> {%{$n3.text}}
	|
	^( um=UNARY_MINUS  LITERAL_tops)
		->template() "-tops"
	|
	t=LITERAL_tops
    -> {%{$t.text}}
	|	
*/	
	ts=timed_expression
	  -> {$ts.st}
	|	
	^(um=UNARY_MINUS ts2=timed_expression)
		->template(ts2={$ts2.st}) " -<ts2>"
	|	
	^(abs=LITERAL_abs ts3=timed_expression)
		->template(ts3={$ts3.st}) " abs <ts3>"
//	|
//	^(def=LITERAL_def definedLogicVariable=ID)
//		->template(d={$definedLogicVariable.text}) " def <d> "
	| 
	^( def=LITERAL_def lv=assertion_parameter )
	  ->template(lv={$lv.st})" def <lv> " 
	  //probably should put proper type checking in Assertions too
  	|  atc=assertion_type_conversion
  	  -> {$atc.st}
  	| rt=record_term
  	  -> {$rt.st}
  ;
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.assertion_subexpression caught RecognitionException");
	  if ($um!=null)
	  	((BAST)$um).showParseTree($um.getText());
	  else if ($def!=null)
	  	((BAST)$def).showParseTree($def.getText());
	  reportError(re);
	  }

	
	
timed_expression
	:
	n=value 
	  -> {$n.st}
//		-> me(i={$n.st})
//	| //note, this cannot be parsed with BLESStoAST because xxx() 
	  //looks like both a predicate invocation and a function call!!!
//	pi=predicate_invocation
//	  -> {$pi.st}
	|
	ppe=parenthesized_assertion_expression
		-> {$ppe.st}
	|
	afi=assertion_function_invocation
	  -> {$afi.st}
	|
	^(tic=TICK (tv=value | ppe=parenthesized_assertion_expression  ) )
		-> {tv!=null}? template(tv={$tv.st})"<tv>'"
		-> template(ppe={$ppe.st})"<ppe>'"
	|
	^(ats=AT_SIGN  (av=value |  ppe=parenthesized_assertion_expression | pi=assertion_function_invocation )  te=time_subexpression)
		-> {av!=null}? template(av={$av.st},te={$te.st})"<av>@<te>"
		-> {pi!=null}? template(pi={$pi.st},te={$te.st})"<pi>@<te>"
		-> template(ppe={$ppe.st},te={$te.st})"<ppe>@<te>"
	|
	^(crt=CARET  (cv=value |  ppe=parenthesized_assertion_expression | pi=assertion_function_invocation )  val=period_shift)
		-> {cv!=null}? template(cv={$cv.st},val={$val.st})"<cv>^<val>"
		-> {pi!=null}? template(pi={$pi.st},val={$val.st})"<pi>^<val>"
		-> template(ppe={$ppe.st},val={$val.st})"<ppe>^<val>"
	;
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.timed_expression caught RecognitionException");
	  if ($tic!=null)
	  	((BAST)$tic).showParseTree($tic.getText());
	  else if ($ats!=null)
	  	((BAST)$ats).showParseTree($ats.getText());
	  else if ($crt!=null)
	  	((BAST)$crt).showParseTree($crt.getText());
	  reportError(re);
	  }


time_expression
  :
  lhs=time_subexpression
    -> {$lhs.st}
  |  
  ^(PLUS ts+=time_subexpression+)
    -> template(ts={$ts})"<ts; separator=\"+\">"
  |  
  ^(TIMES ts+=time_subexpression+)
    -> template(ts={$ts})"<ts; separator=\"*\">"
  |  
  ^(MINUS lhs=time_subexpression rhs=time_subexpression)
    -> template(lhs={$lhs.st},rhs={$rhs.st})"<lhs>-<rhs>"
  |  
  ^(DIVIDE lhs=time_subexpression rhs=time_subexpression)
    -> template(lhs={$lhs.st},rhs={$rhs.st})"<lhs>/<rhs>"
  |  
  ^(EXP lhs=time_subexpression rhs=time_subexpression)
    -> template(lhs={$lhs.st},rhs={$rhs.st})"<lhs>**<rhs>"
  |  
  ^(LITERAL_mod lhs=time_subexpression rhs=time_subexpression)
    -> template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> mod <rhs>"
  |  
  ^(LITERAL_rem lhs=time_subexpression rhs=time_subexpression)
    -> template(lhs={$lhs.st},rhs={$rhs.st})"<lhs> rem <rhs>"    
  ;

time_subexpression
  :
  ^(UNARY_MINUS val=value)
    -> template(val={$val.st})" -<val>"
  |
  ^(UNARY_MINUS afi=assertion_function_invocation)
    -> template(afi={$afi.st})" -<afi>"
  |
  ^(UNARY_MINUS ^(lp=LPAREN exp=time_expression rp=RPAREN) )
    -> template(exp={$exp.st})" -(<exp>)"
  | val=value
    -> {$val.st}
  | afi=assertion_function_invocation
    -> {$afi.st}
  | ^(lp=LPAREN exp=time_expression rp=RPAREN)
    ->  template(exp={$exp.st})"(<exp>)"
  ;

assertion_function_invocation
  :
  ^(INVOKE_FUNCTION assertion_function_identifier=ID )
    -> template(i={$assertion_function_identifier.text})"<i>()"
  |
  ^(INVOKE_FUNCTION ^(assertion_function_identifier=ID actual=assertion_expression ) )
    -> template(i={$assertion_function_identifier.text},actual={$actual.st})"<i>(<actual>)"
  |
  ^(INVOKE_FUNCTION ^(assertion_function_identifier=ID (params+=actual_assertion_parameter)+ ) )
    -> template(i={$assertion_function_identifier.text},params={$params})
      "<i>(<params; separator=\", \">)"  
  ;


parenthesized_assertion_expression
  :
  ^(lp=LPAREN pe=assertion_expression RPAREN )
    -> template(pe={$pe.st})"(<pe>)"
  |
  cpe=conditional_assertion_expression
    -> {$cpe.st}
  //|
 // caf=conditional_assertion_function 
 //   -> {$caf.st} 
//  |
//  art=assertion_record_term
//    -> {$art.st}
  	|
	cas=case_expression
	  -> {$cas.st}
	;
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.parenthesized_assertion_expression caught RecognitionException");
	  if ($lp!=null)
	  	((BAST)$lp).showParseTree($lp.getText());
	  reportError(re);
	  }
  
conditional_assertion_expression
	:  
  ^(qq=CONDITIONAL p=predicate t=assertion_expression f=assertion_expression)
	  -> conditional_expression(be={$p.st},t={$t.st},f={$f.st})
//	  -> template(be={$p.st},t={$t.st},f={$f.st})"(<be>??<t>:<f>)" 
//    -> template(p={$p.st},t={$t.st},f={$f.st})"(if <p> then <t> else <f>)"    
  ;
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.conditional_assertion_expression caught RecognitionException");
	  if ($qq!=null)
	  	((BAST)$qq).showParseTree($qq.getText());
	  reportError(re);
	  }

//assertion_record_term
//  :
//  ^(LPAREN arv+=assertion_record_value+ RPAREN)
//    -> template(arv={$arv}) "(<arv; wrap>)"
//  ;		  

assertion_record_value
  :
  ^(ARROW field=ID v=value)
    -> template(f={$field.text},v={$v.st})"<f>=\><v>;"
  ;
  
period_shift
	:
	v=value
	  -> {$v.st}
//	|
//	^(LPAREN ^(UNARY_MINUS ia=period_shift) RPAREN)
//	  -> template(ia={$ia.st}) "(-<ia>)"
  |
  ^(t=TICK n=name)
    -> template(n={$n.st})"$n' "
	|
	^(UNARY_MINUS ia=period_shift )
	  -> template(ia={$ia.st}) "-<ia>"
	|
	^(LPAREN ia=period_shift RPAREN)
	  -> template(ia={$ia.st}) "(<ia>)"
	|
	^(LPAREN ^(MINUS l=period_shift r=period_shift) RPAREN)
	  -> template(l={$l.st},r={$r.st}) "(<l> - <r>)"
	|
	^(LPAREN ^(DIVIDE ld=period_shift rd=period_shift) RPAREN)
	  -> template(l={$ld.st},r={$rd.st}) "(<l> / <r>)"
	|
	^(LPAREN ^(PLUS iap+=period_shift+) RPAREN)
	  -> template(ias={$iap}) "(<ias; separator=\" + \">)"
	|
	^(LPAREN ^(TIMES iat+=period_shift+) RPAREN)
	  -> template(ias={$iat}) "(<ias; separator=\" * \">)"      
	;
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.period_shift caught RecognitionException");
	//  if ($t!=null) Dump.it("is this ("+$t.getText()+
	 //   ") something other than a *name* having a tick being used in the time shift of a ^?");
	//  ((BAST)$t).showParseTree($t.getText());
	  reportError(re);
	  }
	
/////////////////////////////// AVAILABILITY //////////////////////////////////////////////////////////

availability 
	:	
	^(LITERAL_availability avs=availability_subexpression)
		->template(avs={$avs.st})
		"availability <avs><\n>"
	;

availability_expression 
	:	
	^(LITERAL_and asa+=availability_subexpression+)
		->template(asa={$asa})"<asa; wrap, separator=\" and \">"
	|
	^(LITERAL_or aso+=availability_subexpression+)
		->template(aso={$aso})"<aso; wrap, separator=\" or \">"
	|
	^(LITERAL_xor asx+=availability_subexpression+)
		->template(asx={$asx})"<asx; wrap, separator=\" xor \">"
	|
	as=availability_subexpression
	  -> {$as.st}
//		->template(as={$as.st})"<as>"
	;

availability_subexpression 
	:	//note: just the (
	^(LITERAL_not ^(LPAREN nae=availability_expression) )
		->template(nae={$nae.st})"not (<nae>)"
	|
	^(LITERAL_not ni=ID)
		->template(i={$ni.text})"not <ni>"
	|
	^( LPAREN ae=availability_expression )
		->template(ae={$ae.st})"(<ae>)"
	|
	i=ID
		->{%{$i.text}}
	;

////////////////////////////// DISPATCH CONDITION /////////////////////////////////////////////

dispatch_condition  
	:	
	^(d=LITERAL_dispatch  dle=dispatch_expression? )
    		->dispatch_condition(dle={$dle.st})
//    		->template(dle={$dle.st})"on dispatch <dle>"
;	
	catch [RecognitionException re]
	  {
	  Dump.it("UnparseBLESS.dispatch_condition caught RecognitionException");
	  if ($d!=null)
	  	$d.showParseTree($d.getText());
	  reportError(re);
	  }
	
dispatch_expression 
	:	
	^(LITERAL_or odt+=dispatch_conjunction+)
	  -> or(terms={$odt})
//		->template(odt={$odt})"<odt; wrap, separator=\" or \">"
	|
	dt=dispatch_conjunction
		->template(dt={$dt.st})"<dt>"
  ;

dispatch_conjunction
	:
	d=dispatch_trigger
		->{$d.st}
	|
	^(LITERAL_and dt+=dispatch_trigger+)
	  -> and(terms={$dt})
//		->template(dt={$dt})"<dt; separator= and >"
	;


//port_name added 4/17/2022 
dispatch_trigger 
	:	
 	 i=ID
 	   -> dispatch_trigger(i={$i.text})
// 	   -> {%{$i.text}}
  |
 	 ^(LITERAL_timeout LPAREN (ports+=ID)+ RPAREN bt=behavior_time)
 	   -> timeout(bt={$bt.st},p={$ports})
// 	   ->template(bt={$bt.st},p={$ports})"timeout (<p; separator=\", \">) <bt>"
//  | REMOVED FROM LANGUAGE
// 	 ^(LITERAL_timeout  bt=behavior_time)
// 	   ->template(bt={$bt.st},p={$ports})"timeout <bt>"
 	 |
	  t=LITERAL_timeout
	    ->{%{$t.text}}
 	 |
	  ^(LITERAL_timeout bt=behavior_time)
 	   -> timeout(bt={$bt.st})
	|
	s=LITERAL_stop
		->dispatch_trigger(i={$s.text})
	;	

integer_literal 
	:	nl=INTEGER_LIT	
     ->{%{$nl.text}}
//		->template(nl={$nl.text})"<nl>"
	;	

value_constant
  :
  t=LITERAL_true 
    -> {%{$t.text}}
  | f=LITERAL_false
    -> {%{$f.text}}
  | sl=AADL_STRING_LITERAL
    -> {%{$sl.text}}
  | nc=numeric_constant
    -> {$nc.st}
  | ev=enumeration_value
    -> {$ev.st} 
//  | pv=property_value
//    -> {$pv.st}
//  | pc=property_constant_name /*or property_value*/
//     -> {$pc.st}
//  | ^(nlu=NUMERIC_LIT unit=ID)
//  	-> template(nlu={$nlu.text},unit={$unit.text})
//  		"<nlu> <unit>"
  ;

enumeration_value
  :
  ^(TICK enum_type=ID enum_value=ID)
  	//replace type name with fully qualified name of data component with that BLESS::Typed property
    -> {Global.usingSlangStringTemplateGroup && BlessMaps.dataComponentMapContainsKey($enum_type.text)}? 
       enumeration_value(t={BlessMaps.dataComponentMapGet($enum_type.text)},v={$enum_value.text})
    -> enumeration_value(t={$enum_type.text},v={$enum_value.text})
  ;

property_constant
  :
  //property_constant
  ^(DOUBLE_COLON ps=ID p=ID)
    -> property_name(ps={$ps.text},p={$p.text})
//    -> template(ps={$ps.text},p={$p.text})"<ps>::<p>"
  ;
 
property_reference
  :
  //just property name
  ^(oct=OCTOTHORPE pname=property_name)
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
    -> property_reference(pname={$pname.st})
//    -> template(pname={$pname.st})"#<pname>"
  |  //with record field(s)
  ^(oct=OCTOTHORPE pname=property_name field+=property_field+)
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(0))}
    -> property_reference(pname={$pname.st},f={$field})
//    -> template(pname={$pname.st},f={$field})"#<pname><f>"
  |  //self property
  ^(oct=OCTOTHORPE self=LITERAL_self pname=property_name )
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
    -> property_reference(component={$self.text},pname={$pname.st})
//    -> template(pname={$pname.st})"self#<pname>"
  |  //self property with record filed(s)
  ^(oct=OCTOTHORPE self=LITERAL_self pname=property_name field+=property_field+)
    -> {lookUpPropertyValues}? {getAadlPropertyValue((BAST)$oct.getChild(1))}
    -> property_reference(component={$self.text},pname={$pname.st},f={$field})
//    -> template(pname={$pname.st},f={$field})"self#<pname><f>"
//  |
//  ^(OCTOTHORPE id=ID pname=property_name)
//    -> template(id={$id.text},pname={$pname.st})"<id>#<pname>"
  |  //component property
  ^(oct=OCTOTHORPE component=unique_component_classifier_reference pname=property_name)
    -> property_reference(component={$component.st},pname={$pname.st},f={$field})
//    -> template(component={$component.st},pname={$pname.st})"<component>#<pname>"
  |  //component property with record filed(s)
  ^(oct=OCTOTHORPE component=unique_component_classifier_reference pname=property_name field+=property_field+)
    -> property_reference(component={$component.st},pname={$pname.st},f={$field})
//    -> template(component={$component.st},pname={$pname.st},f={$field})"<component>#<pname><f>"
  ;

property_name
  :
  ^(DOUBLE_COLON ps=ID p=ID)
    -> property_name(ps={$ps.text},p={$p.text})
//    -> template(ps={$ps.text},p={$p.text})"<ps>::<p>"
  ;
  
property_field
  :
  ^(LBRACKET lit=INTEGER_LIT RBRACKET)
    -> template(lit={$lit.text})"[<lit>]"
  |
  ^(LBRACKET id=ID RBRACKET)
    -> template(id={$id.text})"[<id>]"
  |
  ^(PERIOD id=ID)
    -> template(id={$id.text})".<id>"
  |
  ^(PERIOD LITERAL_upper_bound)
    -> template()".upper_bound"
  |
  ^(PERIOD LITERAL_lower_bound)
    -> template()".lower_bound"
  ;

 
numeric_constant
  :
  il=INTEGER_LIT
    -> integer_literal(i={$il.text})  //{%{$il.text}}
  | rl=REAL_LIT
    -> real_literal(r={$rl.text})  //{%{$rl.text}}
//  | ^(DOUBLE_COLON property_set=ID property=ID)
//    -> id_cc_id(fst={$property_set.text},snd={$property.text})
  | rat=rational_literal
    -> {$rat.st}
  |  com=complex_literal
    -> {$com.st}
  |
  constant=property_constant
    ->{$constant.st}
  |
  reference=property_reference
    ->{$reference.st}
  ;

rational_literal
  :
  ^(RATIONAL dividend=INTEGER_LIT divisor=INTEGER_LIT)
    -> template(dividend={$dividend.text},divisor={$divisor.text})"[<dividend>|<divisor>]"
  | ^(RATIONAL ^(MINUS dividend=INTEGER_LIT) divisor=INTEGER_LIT)
    -> template(dividend={$dividend.text},divisor={$divisor.text})"[-<dividend>|<divisor>]"
  | ^(RATIONAL dividend=INTEGER_LIT ^(MINUS divisor=INTEGER_LIT))
    -> template(dividend={$dividend.text},divisor={$divisor.text})"[<dividend>|-<divisor>]"
  | ^(RATIONAL ^(MINUS dividend=INTEGER_LIT) ^(MINUS divisor=INTEGER_LIT))
    -> template(dividend={$dividend.text},divisor={$divisor.text})"[-<dividend>|-<divisor>]"
  ;

complex_literal
  :
  ^(COMPLEX real=REAL_LIT im=REAL_LIT)
    -> template(real={$real.text},im={$im.text})"[<real>:<im>]"
  | ^(COMPLEX ^(MINUS real=REAL_LIT) im=REAL_LIT)
    -> template(real={$real.text},im={$im.text})"[-<real>:<im>]"
  | ^(COMPLEX real=REAL_LIT ^(MINUS im=REAL_LIT))
    -> template(real={$real.text},im={$im.text})"[<real>:-<im>]"
  | ^(COMPLEX ^(MINUS real=REAL_LIT) ^(MINUS im=REAL_LIT))
    -> template(real={$real.text},im={$im.text})"[-<real>:-<im>]"
  
  ;
  
////////////////////////////AADL COMPONENT///////////////////////////////////////////////



//////////////////////////////////9 CONNECTIONS////////////////////////

in_modes
 	:
 	^(LITERAL_in LITERAL_modes m+=ID+)
 	-> template(m={$m})"in modes (<m; separator=\",\">)"
 	;

 
//package_or_component
//  :
//  ap=package_spec 
//  	->{$ap.st}
//  | ct=component_type 
//  	->{$ct.st}
//  | ci=component_implementation
//  	->{$ci.st}
//  ;  

//unparse anything starting with LPAREN
parenthesized_xxx 
  options{backtrack=true;}
	:
//	rt=record_term -> {$rt.st}
//	|  
	^( LPAREN eor=expression_or_relation RPAREN  )
	  -> template(eor={$eor.st})"(<eor>)"	
	|
  ^(lp=LPAREN pe=assertion_expression RPAREN )
    -> template(pe={$pe.st})"(<pe>)"
  |
	^(lb=LPAREN p=predicate rb=RPAREN)
		-> template(lb={$lb.text},p={$p.st},rb={$rb.text})"<lb><p><rb>"   
	; 

///////////// 

boolean_expression_or_relation
  :
//  ^( rs=relation_symbol lhs=subexpression rhs=subexpression )
//		-> template(rs={$rs.st},lhs={$lhs.st},rhs={$rhs.st})
//			"<lhs> <rs> <rhs>"
  rel=relation -> {$rel.st}
  |
  be=boolean_expression 
    -> {$be.st} 
  ;

boolean_expression
  :
//  ^( bo=boolean_operator bs+=boolean_subexpression+ )
//    -> template(bo={$bo.st},bs={$bs}) "<bs; separator=\" <bo> \">"
  ^( LITERAL_and bs+=boolean_subexpression+ )
    -> l_and(bs={$bs})
  |
  ^( LITERAL_or bs+=boolean_subexpression+ )
    -> l_or(bs={$bs})
  |
  ^( LITERAL_xor bs+=boolean_subexpression+ )
    -> l_and(bs={$bs})
  |
  ^( LITERAL_cand bs+=boolean_subexpression+ )
    -> l_cand(bs={$bs})
  |
  ^( LITERAL_cor bs+=boolean_subexpression+ )
    -> l_cor(bs={$bs})
  |
  sub=boolean_subexpression
    -> {$sub.st}
  ;

/*
boolean_operator
  :
  LITERAL_and 
    -> l_and()
  | LITERAL_or 
    -> l_or()
  | LITERAL_xor 
    -> l_xor()
  | LITERAL_cand
    -> l_cand() 
  | LITERAL_cor
    -> l_cor()
  ;
*/

boolean_subexpression
  :
  ^(LITERAL_not v=value)
    -> template(v={$v.st})"not <v>"
  |
  ^(LITERAL_not ps=parenthesized_subexpression)
    -> template(ps={$ps.st})"not <ps>"
  |
  v=value
    -> {$v.st}
  |
  ps=parenthesized_subexpression
    -> {$ps.st}
  ;

///////END OF FILE	
