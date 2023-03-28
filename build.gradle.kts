// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version Dependencies.versions.androidApplication apply false
    id("com.android.library") version Dependencies.versions.androidLibrary apply false
    id("org.jetbrains.kotlin.android") version Dependencies.versions.kotlin apply false
}