/*
 * Copyright 2014 A.C.R. Development
 */
package org.ucimini.internetbrowser.controller_mini;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Message;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.CustomViewCallback;

import org.ucimini.internetbrowser.browser_mini.TabsManager_mini;
import org.ucimini.internetbrowser.database_mini.HistoryItem_mini;
import org.ucimini.internetbrowser.dialog.LightningDialogBuilder;
import org.ucimini.internetbrowser.view_mini.LightningView;

public interface UIController_mini {

    void changeToolbarBackground(@NonNull Bitmap favicon, @Nullable Drawable drawable);

    @ColorInt
    int getUiColor();

    boolean getUseDarkTheme();

    void updateUrl(@Nullable String title, boolean isLoading);

    void updateProgress(int n);

    void updateHistory(@Nullable String title, @NonNull String url);

    void openFileChooser(ValueCallback<Uri> uploadMsg);

    void onShowCustomView(View view, CustomViewCallback callback);

    void onShowCustomView(View view, CustomViewCallback callback, int requestedOrienation);

    void onHideCustomView();

    void onCreateWindow(Message resultMsg);

    void onCloseWindow(LightningView view);

    void hideActionBar();

    void showActionBar();

    void showFileChooser(ValueCallback<Uri[]> filePathCallback);

    void closeEmptyTab();

    void showCloseDialog(int position);

    void newTabButtonClicked();

    void tabCloseClicked(int position);

    void tabClicked(int position);

    void newTabButtonLongClicked();

    void bookmarkButtonClicked();

    void bookmarkItemClicked(@NonNull HistoryItem_mini item);

    void closeBookmarksDrawer();

    void setForwardButtonEnabled(boolean enabled);

    void setBackButtonEnabled(boolean enabled);

    void tabChanged(LightningView tab);

    TabsManager_mini getTabModel();

    void onBackButtonPressed();

    void onForwardButtonPressed();

    void onHomeButtonPressed();

    void handleBookmarksChange();

    void handleDownloadDeleted();

    void handleBookmarkDeleted(@NonNull HistoryItem_mini item);

    void handleNewTab(@NonNull LightningDialogBuilder.NewTab newTabType, @NonNull String url);

    void handleHistoryChange();

}
