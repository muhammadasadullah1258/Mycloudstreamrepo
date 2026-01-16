plugins {
    id("com.android.library") // Android Library
    kotlin("android")         // Kotlin Android support
}

android {
    namespace = "com.muhammadasadullah.cloudstream.plugin" // Safe namespace
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        targetSdk = 35
    }

    buildFeatures {
        buildConfig = true
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// Plugin version
version = 1

cloudstream {
    description = "Lorem ipsum"
    authors = listOf("Cloudburst", "Luna712")

    /**
     * Status int as one of the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta-only
     **/
    status = 1

    tvTypes = listOf("Movie")

    requiresResources = true
    language = "en"

    iconUrl = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Korduene_Logo.png"
}
