package com.example

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.AppUtils.toJson
import org.jsoup.Jsoup

class NetMirrorProvider : MainAPI() { // Provider hamesha MainAPI hota hai
    override var name = "NetMirror"
    override var mainUrl = "https://netmirror2.bio"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun search(query: String): List<SearchResponse> {
        val url = "$mainUrl/search?q=$query"
        val response = app.get(url).text
        val document = Jsoup.parse(response)
        
        return document.select("a.movie-link").map {
            val title = it.text()
            val href = it.attr("href")
            // CloudStream search responses is format mein hoti hain
            newMovieSearchResponse(title, href, TvType.Movie) {
                this.posterUrl = "" // Poster ka link yahan ayega
            }
        }
    }
}
