package org.ucimini.internetbrowser.browser_mini;

import android.support.annotation.NonNull;

import org.ucimini.internetbrowser.database_mini.HistoryItem_mini;

public interface BookmarksView_mini {

    void navigateBack();

    void handleUpdatedUrl(@NonNull String url);

    void handleBookmarkDeleted(@NonNull HistoryItem_mini item);

}
