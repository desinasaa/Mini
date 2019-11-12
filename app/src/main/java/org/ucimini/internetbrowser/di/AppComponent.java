package org.ucimini.internetbrowser.di;

import javax.inject.Singleton;

import org.ucimini.internetbrowser.BrowserApp;
import org.ucimini.internetbrowser.browser_mini.activity.BrowserActivity_mini;
import org.ucimini.internetbrowser.browser_mini.fragment.BookmarksFragment_miniMini;
import org.ucimini.internetbrowser.browser_mini.fragment.TabsFragment_miniMini;
import org.ucimini.internetbrowser.browser_mini.BrowserPresenter_mini;
import org.ucimini.internetbrowser.browser_mini.SearchBoxModel_mini;
import org.ucimini.internetbrowser.constant_mini.DownloadsPage_mini;
import org.ucimini.internetbrowser.constant_mini.HistoryPage_mini;
import org.ucimini.internetbrowser.download_mini.DownloadHandler_mini;
import org.ucimini.internetbrowser.reading_mini.activity.ReadingActivity;
import org.ucimini.internetbrowser.browser_mini.TabsManager_mini;
import org.ucimini.internetbrowser.browser_mini.activity.ThemableBrowserActivity;
import org.ucimini.internetbrowser.settings_mini.activity.ThemableSettingsActivityMini;
import org.ucimini.internetbrowser.constant_mini.BookmarkPage_mini;
import org.ucimini.internetbrowser.constant_mini.StartPage_mini;
import org.ucimini.internetbrowser.dialog.LightningDialogBuilder;
import org.ucimini.internetbrowser.download_mini.LightningDownloadListener_mini;
import org.ucimini.internetbrowser.settings_mini.fragment.BookmarkSettingsFragment;
import org.ucimini.internetbrowser.settings_mini.fragment.DebugSettingsFragment;
import org.ucimini.internetbrowser.settings_mini.fragment.GeneralSettingsFragment;
import org.ucimini.internetbrowser.settings_mini.fragment.LightningPreferenceFragment;
import org.ucimini.internetbrowser.settings_mini.fragment.PrivacySettingsFragment;
import org.ucimini.internetbrowser.search.SearchEngineProvider;
import org.ucimini.internetbrowser.search.SuggestionsAdapter;
import org.ucimini.internetbrowser.utils.ProxyUtils;
import org.ucimini.internetbrowser.view_mini.LightningChromeClient;
import org.ucimini.internetbrowser.view_mini.LightningView;
import org.ucimini.internetbrowser.view_mini.LightningWebClient;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BrowserActivity_mini activity);

    void inject(BookmarksFragment_miniMini fragment);

    void inject(BookmarkSettingsFragment fragment);

    void inject(LightningDialogBuilder builder);

    void inject(TabsFragment_miniMini fragment);

    void inject(LightningView lightningView);

    void inject(ThemableBrowserActivity activity);

    void inject(LightningPreferenceFragment fragment);

    void inject(BrowserApp app);

    void inject(ProxyUtils proxyUtils);

    void inject(ReadingActivity activity);

    void inject(LightningWebClient webClient);

    void inject(ThemableSettingsActivityMini activity);

    void inject(LightningDownloadListener_mini listener);

    void inject(PrivacySettingsFragment fragment);

    void inject(StartPage_mini StartPage_mini);

    void inject(HistoryPage_mini HistoryPage_mini);

    void inject(BookmarkPage_mini BookmarkPage_mini);

    void inject(DownloadsPage_mini DownloadsPage_mini);

    void inject(BrowserPresenter_mini presenter);

    void inject(TabsManager_mini manager);

    void inject(DebugSettingsFragment fragment);

    void inject(SuggestionsAdapter suggestionsAdapter);

    void inject(LightningChromeClient chromeClient);

    void inject(DownloadHandler_mini DownloadHandler_mini);

    void inject(SearchBoxModel_mini SearchBoxModel_mini);

    void inject(SearchEngineProvider searchEngineProvider);

    void inject(GeneralSettingsFragment generalSettingsFragment);

}
