package org.ucimini.internetbrowser.search.engine

import org.ucimini.internetbrowser.R
import org.ucimini.internetbrowser.constant_mini.Constants_mini

/**
 * The Baidu search engine.
 *
 * See http://www.baidu.com/img/bdlogo.gif for the icon.
 */
class BaiduSearch : BaseSearchEngine(
        "file:///android_asset/baidu.png",
        Constants_mini.BAIDU_SEARCH,
        R.string.search_engine_baidu
)
