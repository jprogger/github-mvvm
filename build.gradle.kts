// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.google.com")
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${Versions.gradlePluginVersion}")
        classpath("org.jetbrains.kotlin.kapt:org.jetbrains.kotlin.kapt.gradle.plugin:${Versions.kotlinVersion}")
        classpath("org.jetbrains.kotlin.android:org.jetbrains.kotlin.android.gradle.plugin:${Versions.kotlinVersion}")
        classpath("androidx.navigation.safeargs.kotlin:androidx.navigation.safeargs.kotlin.gradle.plugin:${Versions.navigationArgsPluginVersion}")
    }
}