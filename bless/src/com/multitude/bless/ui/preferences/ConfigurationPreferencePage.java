//ConfigurationPreferencePage.java



package com.multitude.bless.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.multitude.bless.Activator;
import com.multitude.bless.BLESS;


/**
 * @author brl
 * put up Eclipse preferences for BLESS proof engine
 */
public class ConfigurationPreferencePage extends FieldEditorPreferencePage
    implements IWorkbenchPreferencePage
{

//use PreferenceInitializer to set default preference
//get value by
//int configLimit = WorkspacePlugin.getDefault().getPreferenceStore().getInt(ConfigurationPreferencePage.CONFIGURATION_LIMIT);

//private static int signature_upper_limit = 10000;

//private IntegerFieldEditor sl;
private BooleanFieldEditor flattenField;
private BooleanFieldEditor verboseParseField;
private BooleanFieldEditor verboseProofField;
private BooleanFieldEditor epithetField;
private BooleanFieldEditor showUnparsedField;
private BooleanFieldEditor showVCField;
private DirectoryFieldEditor slangDirectoryField;
private DirectoryFieldEditor baDirectoryField;

public static String FLATTEN_SUFFIX = "-flat";  //added to new AADL project names for flattened behavior
public static String FLATTEN_FIELD = "flattenField";
public static String VERBOSE_PARSE_FIELD = "verboseParseField";
public static String VERBOSE_PROOF_FIELD = "verboseProofField";
public static String EPITHET_FIELD = "epithetField";
public static String SHOW_UNPARSED_FIELD = "showUnparsedField";
public static String SHOW_VC_FIELD = "showVCField";
public static String SET_SLANG_FIELD = "setSlangField";
public static String SET_BA_FIELD = "setBAField";

public static ConfigurationPreferencePage thePage=null;

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
  public ConfigurationPreferencePage()
    {
    super(GRID);
		setPreferenceStore(Activator.plugin.getPreferenceStore());
    setDescription("BLESS Proof Tool Preferences "+BLESS.versionDate+"\n");
//    getPreferenceStore().setDefault(CONFIGURATION_LIMIT, signature_limit);
    thePage=this;
    }

  /**
   * @param style
   */
  public ConfigurationPreferencePage(int style)
    {
    super(style);
    thePage=this;
    }

  /**
   * @param title
   * @param style
   */
  public ConfigurationPreferencePage(String title, int style)
    {
    super(title, style);
    thePage=this;
    }

  /**
   * @param title
   * @param image
   * @param style
   */
  public ConfigurationPreferencePage(String title, ImageDescriptor image,
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
    flattenField = new BooleanFieldEditor(ConfigurationPreferencePage.FLATTEN_FIELD,
        "Create new AADL projects when flattening state machines",
        getFieldEditorParent());
    addField(flattenField);
    verboseParseField = new BooleanFieldEditor(ConfigurationPreferencePage.VERBOSE_PARSE_FIELD,
        "Emit verbose messages during parsing",
        getFieldEditorParent());
    addField(verboseParseField);
    verboseProofField = new BooleanFieldEditor(ConfigurationPreferencePage.VERBOSE_PROOF_FIELD,
        "Emit verbose messages during proving",
        getFieldEditorParent());
    addField(verboseProofField);
    epithetField = new BooleanFieldEditor(ConfigurationPreferencePage.EPITHET_FIELD,
				"Call user \"idiot\" (or equivalent) in error messages", getFieldEditorParent());
    addField(epithetField);
    showUnparsedField = new BooleanFieldEditor(ConfigurationPreferencePage.SHOW_UNPARSED_FIELD,
        "Show unparsed annexes when loaded", getFieldEditorParent());
    addField(showUnparsedField);
    showVCField = new BooleanFieldEditor(ConfigurationPreferencePage.SHOW_VC_FIELD,
        "Show verification conditions when created", getFieldEditorParent());
    addField(showVCField);
//    slangDirectoryField = new DirectoryFieldEditor(ConfigurationPreferencePage.SET_SLANG_FIELD,
//        "Choose root directory for generated Slang code\n", getFieldEditorParent());
//    addField(slangDirectoryField);
    baDirectoryField = new DirectoryFieldEditor(ConfigurationPreferencePage.SET_BA_FIELD,
        "Choose root directory for generated BA behavior and Data Model types\n", getFieldEditorParent());
    addField(baDirectoryField);
    }  //end of createFieldEditors


 public static boolean getMakeNewProjectsWhenFlattening()
   {
		return Activator.plugin.getPreferenceStore().getBoolean(ConfigurationPreferencePage.FLATTEN_FIELD);
   }  //end of getMakeNewProjectsWhenFlattening

public static boolean getVerboseParse()
  {
		return Activator.plugin.getPreferenceStore().getBoolean(ConfigurationPreferencePage.VERBOSE_PARSE_FIELD);
  }  //end of getVerboseParse

public static boolean getVerboseProof()
 {
		return Activator.plugin.getPreferenceStore().getBoolean(ConfigurationPreferencePage.VERBOSE_PROOF_FIELD);
 }  //end of getVerboseProof

public static boolean useEpithet()
 {
		return Activator.plugin.getPreferenceStore().getBoolean(ConfigurationPreferencePage.EPITHET_FIELD);
	} // end of useEpithet

public static boolean showUnparsed() {
  return Activator.plugin.getPreferenceStore().getBoolean(ConfigurationPreferencePage.SHOW_UNPARSED_FIELD);
} // end of useEpithet

public static boolean showVC() {
  return Activator.plugin.getPreferenceStore().getBoolean(ConfigurationPreferencePage.SHOW_VC_FIELD);
} // end of useEpithet

public static String getSlangDirectory() {
  return Activator.plugin.getPreferenceStore().getString(ConfigurationPreferencePage.SET_SLANG_FIELD);
} // end of useEpithet

public static String getBADirectory() {
  return Activator.plugin.getPreferenceStore().getString(ConfigurationPreferencePage.SET_BA_FIELD);
} // end of useEpithet

}  //end of ConfigurationPreferencePage
