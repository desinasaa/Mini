package org.ucimini.internetbrowser.search.engine

import org.ucimini.internetbrowser.R
import org.ucimini.internetbrowser.constant_mini.Constants_mini

/**
 * The Yandex search engine.
 *
 * See http://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Yandex.svg/600px-Yandex.svg.png
 * for the icon.
 */
class YandexSearch : BaseSearchEngine(
        "file:///android_asset/yandex.png",
        Constants_mini.YANDEX_SEARCH,
        R.string.search_engine_yandex
)
