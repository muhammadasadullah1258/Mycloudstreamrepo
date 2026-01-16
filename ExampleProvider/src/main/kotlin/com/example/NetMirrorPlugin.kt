package com.example

import android.content.Context
import com.lagradost.cloudstream3.CloudstreamPlugin

class NetMirrorPlugin : CloudstreamPlugin() {
    override fun load(context: Context) {
        registerMainAPI(NetMirrorProvider())
    }
}
