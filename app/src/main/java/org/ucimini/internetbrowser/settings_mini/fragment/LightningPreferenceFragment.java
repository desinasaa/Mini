package org.ucimini.internetbrowser.settings_mini.fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import javax.inject.Inject;

import org.ucimini.internetbrowser.BrowserApp;
import org.ucimini.internetbrowser.preference_mini.PreferenceManager_mini;

/**
 * Simplify {@link PreferenceManager_mini} inject in all the PreferenceFragments
 *
 * @author Stefano Pacifici
 * @date 2015/09/16
 */
public class LightningPreferenceFragment extends PreferenceFragment {

    @Inject
    PreferenceManager_mini mPreferenceManagerMini;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrowserApp.getAppComponent().inject(this);
    }
}
