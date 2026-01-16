plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("cloudstream.plugin")
}

android {
    namespace = "com.example"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

version = 1

cloudstream {
    description = "NetMirror CloudStream Plugin"
    authors = listOf("Asad")
    status = 1
    tvTypes = listOf("Movie")
    language = "en"
}
