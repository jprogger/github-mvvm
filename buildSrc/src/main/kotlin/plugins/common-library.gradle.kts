plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdk = Versions.compileSdkVersion
    buildToolsVersion = Versions.buildToolsVersion

    defaultConfig {
        multiDexEnabled = true
        minSdk = Versions.minSdkVersion
        versionName = Versions.versionName
        versionCode = Versions.versionCode
        targetSdk = Versions.targetSdkVersion
        applicationId = Versions.applicationId
    }
}