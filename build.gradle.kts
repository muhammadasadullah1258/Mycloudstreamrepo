plugins {
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("com.android.library") version "8.2.2" apply false
    id("cloudstream.plugin") version "1.0.0" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
