package org.ucimini.internetbrowser.search.engine

import org.ucimini.internetbrowser.R
import org.ucimini.internetbrowser.constant_mini.Constants_mini

/**
 * The StartPage_mini search engine.
 */
class StartPageSearch : BaseSearchEngine(
        "file:///android_asset/startpage.png",
        Constants_mini.STARTPAGE_SEARCH,
        R.string.search_engine_startpage
)
