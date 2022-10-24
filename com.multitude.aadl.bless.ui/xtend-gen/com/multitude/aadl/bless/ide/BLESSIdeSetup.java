/**
 * Copyright (c) 2004-2020 Multitude Corporation.
 * All Rights Reserved.
 * 
 * NO WARRANTY. ALL MATERIAL IS FURNISHED ON AN "AS-IS" BASIS. MULTITUDE CORPORATION MAKES NO WARRANTIES OF ANY
 * KIND, EITHER EXPRESSED OR IMPLIED, AS TO ANY MATTER INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR PURPOSE
 * OR MERCHANTABILITY, EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF THE MATERIAL. MULTITUDE CORPORATION DOES NOT
 * MAKE ANY WARRANTY OF ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT INFRINGEMENT.
 * 
 * This program includes and/or can make use of certain third party source code, object code, documentation and other
 * files ("Third Party Software"). The Third Party Software that is used by this program is dependent upon your system
 * configuration. By using this program, You agree to comply with any and all relevant Third Party Software terms and
 * conditions contained in any such Third Party Software or separate license file distributed with such Third Party
 * Software. The parties who own the Third Party Software ("Third Party Licensors") are intended third party
 * beneficiaries to this license with respect to the terms applicable to their Third Party Software. Third Party Software
 * licenses only apply to the Third Party Software and not any other portion of this program or this program as a whole.
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
