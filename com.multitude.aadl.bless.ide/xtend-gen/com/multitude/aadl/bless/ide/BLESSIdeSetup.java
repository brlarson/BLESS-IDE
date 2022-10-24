/**
 * (C) Multitude Corporation 2020
 * generated by Xtext 2.20.0
 * from BLESS.xtext, by BRL
 */
package com.multitude.aadl.bless.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.multitude.aadl.bless.BLESSRuntimeModule;
import com.multitude.aadl.bless.BLESSStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class BLESSIdeSetup extends BLESSStandaloneSetup {
  @Override
  public Injector createInjector() {
    BLESSRuntimeModule _bLESSRuntimeModule = new BLESSRuntimeModule();
    BLESSIdeModule _bLESSIdeModule = new BLESSIdeModule();
    return Guice.createInjector(Modules2.mixin(_bLESSRuntimeModule, _bLESSIdeModule));
  }
}
