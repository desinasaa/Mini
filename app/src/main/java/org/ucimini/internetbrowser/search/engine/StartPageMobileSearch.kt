package org.ucimini.internetbrowser.search.engine

import org.ucimini.internetbrowser.R
import org.ucimini.internetbrowser.constant_mini.Constants_mini

/**
 * The StartPage_mini mobile search engine.
 */
class StartPageMobileSearch : BaseSearchEngine(
        "file:///android_asset/startpage.png",
        Constants_mini.STARTPAGE_MOBILE_SEARCH,
        R.string.search_engine_startpage_mobile
)
