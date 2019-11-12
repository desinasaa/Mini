package org.ucimini.internetbrowser.browser_mini;

public interface TabsView_mini {

    void tabAdded();

    void tabRemoved(int position);

    void tabChanged(int position);

    void tabsInitialized();
}
