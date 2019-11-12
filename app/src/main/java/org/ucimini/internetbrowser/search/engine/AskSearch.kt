package org.ucimini.internetbrowser.search.engine

import org.ucimini.internetbrowser.R
import org.ucimini.internetbrowser.constant_mini.Constants_mini

/**
 * The Ask search engine.
 */
class AskSearch : BaseSearchEngine(
        "file:///android_asset/ask.png",
        Constants_mini.ASK_SEARCH,
        R.string.search_engine_ask
)
