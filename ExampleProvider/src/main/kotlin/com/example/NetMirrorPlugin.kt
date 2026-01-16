package com.example

import com.lagradost.cloudstream3.CloudstreamPlugin
import android.content.Context

class NetMirrorPlugin: CloudstreamPlugin() {
    override fun load(context: Context) {
        // Sirf ye line provider ko app mein register karti hai
        registerMainAPI(NetMirrorProvider())
    }
}
