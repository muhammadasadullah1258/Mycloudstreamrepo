package com.example

import com.lagradost.cloudstream3.*
import org.jsoup.Jsoup

class NetMirrorProvider : MainAPI() {

    override var name = "NetMirror"
    override var mainUrl = "https://netmirror2.bio"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun search(query: String): List<SearchResponse> {
        val url = "$mainUrl/search?q=$query"
        val document = Jsoup.parse(app.get(url).text)

        return document.select("a").mapNotNull {
            val title = it.text()
            val href = it.attr("href")
            if (title.isNotBlank() && href.startsWith("/")) {
                newMovieSearchResponse(
                    title,
                    mainUrl + href,
                    TvType.Movie
                )
            } else null
        }
    }
}
