//PreferenceInitializer.java

/*
SBIR RIGHTS NOTICE (DEC 2007)

These SBIR data are furnished with SBIR rights under Contract No. NNX15CM05C.
For a period of 4 years unless extended in accordance with FAR 27.409 (h),
after acceptance of all items to be delivered under this contract,
the Government will use these data for Government purposes only,
and they shall not be disclosed outside the Government
(including disclosure for the procurement purposes)
during such period without permission of the Contractor,
except that, subject to the foregoing use and disclosure prohibitions,
these data may be disclosed for the use by support Contractors.
After the protection period, the Government has a paid-up license to use,
and to authorize others to use on it behalf, these data for Government purposes
but is relieved of all disclosure prohibitions and assumes no liability for
unauthorized use of these data by third parties.

This notice shall be affixed to any reproductions of these data, in whole or in part.

Copyright 2016, Adventium Labs
*/



package com.multitude.bless.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.multitude.bless.Activator;

public class PreferenceInitializer extends AbstractPreferenceInitializer
{


  @Override
  public void initializeDefaultPreferences()
    {
    /**
     * Sets the default values of the preferences.
     */
		IPreferenceStore store = Activator.plugin.getPreferenceStore();
//    store.setDefault(ConfigurationPreferencePage.CONFIGURATION_LIMIT, ConfigurationPreferencePage.signature_limit);
    store.setDefault(ConfigurationPreferencePage.FLATTEN_FIELD, true);
    store.setDefault(ConfigurationPreferencePage.VERBOSE_PARSE_FIELD, false);
    store.setDefault(ConfigurationPreferencePage.VERBOSE_PROOF_FIELD, false);
    store.setDefault(ConfigurationPreferencePage.EPITHET_FIELD, false);
    store.setDefault(ConfigurationPreferencePage.SHOW_UNPARSED_FIELD, false);
    store.setDefault(ConfigurationPreferencePage.SHOW_VC_FIELD, false);
    store.setDefault(ConfigurationPreferencePage.CONTINUUM_FIELD, false);
    }

}
