/**
 * (C) Multitude Corporation 2020
 * generated by Xtext 2.20.0
 * from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless;

import org.eclipse.xtext.ui.shared.JdtHelper;
import org.eclipse.xtext.ui.util.IJdtHelper;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BLESSStandaloneSetup extends BLESSStandaloneSetupGenerated {
  public static void doSetup() {
    new BLESSStandaloneSetup().createInjectorAndDoEMFRegistration();
  }

  public Class<? extends IJdtHelper> bindIJdtHelper() {
    return JdtHelper.class;
  }
}