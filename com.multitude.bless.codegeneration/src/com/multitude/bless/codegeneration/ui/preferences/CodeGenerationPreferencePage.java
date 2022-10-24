//CodeGenerationPreferencePage.java



package com.multitude.bless.codegeneration.ui.preferences;

//import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.multitude.bless.Activator;


/**
 * @author brl
 * put up Eclipse preferences for BLESS proof engine
 */
public class CodeGenerationPreferencePage extends FieldEditorPreferencePage
    implements IWorkbenchPreferencePage
{

//use PreferenceInitializer to set default preference
//get value by
//int configLimit = WorkspacePlugin.getDefault().getPreferenceStore().getInt(ConfigurationPreferencePage.CONFIGURATION_LIMIT);

//private static int signature_upper_limit = 10000;

private StringFieldEditor codeGenField;

//private IntegerFieldEditor sl;
//private BooleanFieldEditor flattenField;
//private BooleanFieldEditor verboseParseField;
//private BooleanFieldEditor verboseProofField;
//private BooleanFieldEditor epithetField;

//public static String FLATTEN_SUFFIX = "-flat";  //added to new AADL project names for flattened behavior
//public static String FLATTEN_FIELD = "flattenField";
//public static String VERBOSE_PARSE_FIELD = "verboseParseField";
//public static String VERBOSE_PROOF_FIELD = "verboseProofField";
//public static String EPITHET_FIELD = "epithetField";
public static String CODEGEN_FIELD = "codegenField";

public static CodeGenerationPreferencePage thePage=null;

///**
// * move scale factor
// */
//static double scaleFactor = 0.01;
//static int iterationLimit = 1000;
//
///**
// * move threshold
// */
//static double threshold = 0.001;

  /**
   *
   */
  public CodeGenerationPreferencePage()
    {
    super(GRID);
		setPreferenceStore(Activator.plugin.getPreferenceStore());
//    setPreferenceStore(WorkspacePlugin.getDefault().getPreferenceStore());
    setDescription("BLESS Code Generation Preferences\n");
//    getPreferenceStore().setDefault(CONFIGURATION_LIMIT, signature_limit);
    thePage=this;
    }

  /**
   * @param style
   */
  public CodeGenerationPreferencePage(int style)
    {
    super(style);
    thePage=this;
    }

  /**
   * @param title
   * @param style
   */
  public CodeGenerationPreferencePage(String title, int style)
    {
    super(title, style);
    thePage=this;
    }

  /**
   * @param title
   * @param image
   * @param style
   */
  public CodeGenerationPreferencePage(String title, ImageDescriptor image,
      int style)
    {
    super(title, image, style);
    thePage=this;
    }

  /* (non-Javadoc)
   * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
   */
  @Override
  public void init(IWorkbench workbench)
    {
    }

  /*
   * create the field editors
   */
  @Override
  protected void createFieldEditors()
    {
    codeGenField = new StringFieldEditor(CodeGenerationPreferencePage.CODEGEN_FIELD,
    		"root folder/directory for code generated",
        getFieldEditorParent());
    addField(codeGenField);

//    flattenField = new BooleanFieldEditor(CodeGenerationPreferencePage.FLATTEN_FIELD,
//        "Create new AADL projects when flattening state machines",
//        getFieldEditorParent());
//    addField(flattenField);
//    verboseParseField = new BooleanFieldEditor(CodeGenerationPreferencePage.VERBOSE_PARSE_FIELD,
//        "Emit verbose messages during parsing",
//        getFieldEditorParent());
//    addField(verboseParseField);
//    verboseProofField = new BooleanFieldEditor(CodeGenerationPreferencePage.VERBOSE_PROOF_FIELD,
//        "Emit verbose messages during proving",
//        getFieldEditorParent());
//    addField(verboseProofField);
//    epithetField = new BooleanFieldEditor(CodeGenerationPreferencePage.EPITHET_FIELD,
//        "Call user \"idiot\" (or equivalent) in error messages",
//        getFieldEditorParent());
//    addField(epithetField);
    }  //end of createFieldEditors


// public static boolean getMakeNewProjectsWhenFlattening()
//   {
//   return WorkspacePlugin.getDefault().getPreferenceStore().getBoolean(CodeGenerationPreferencePage.FLATTEN_FIELD);
//   }  //end of getMakeNewProjectsWhenFlattening
//
//public static boolean getVerboseParse()
//  {
//  return WorkspacePlugin.getDefault().getPreferenceStore().getBoolean(CodeGenerationPreferencePage.VERBOSE_PARSE_FIELD);
//  }  //end of getVerboseParse
//
//public static boolean getVerboseProof()
// {
// return WorkspacePlugin.getDefault().getPreferenceStore().getBoolean(CodeGenerationPreferencePage.VERBOSE_PROOF_FIELD);
// }  //end of getVerboseProof
//
//public static boolean useEpithet()
// {
// return WorkspacePlugin.getDefault().getPreferenceStore().getBoolean(CodeGenerationPreferencePage.EPITHET_FIELD);
// }  //end of getVerboseEverythin

//public static int getSignatureLimit()
//  {
//  return WorkspacePlugin.getDefault().getPreferenceStore().getInt(ConfigurationPreferencePage.CONFIGURATION_LIMIT);
//  }  //end of getSignatureLimit

}  //end of ConfigurationPreferencePage
