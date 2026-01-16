plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.lagradost.cloudstream3.gradle")
}

android {
    namespace = "com.example"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }
}

dependencies {
    implementation("com.lagradost:cloudstream3:pre-release")
}

version = 1

cloudstream {
    description = "NetMirror CloudStream Plugin"
    authors = listOf("Asad")
    status = 1
    tvTypes = listOf("Movie")
    language = "en"
}
