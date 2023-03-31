import Dependencies.libraries
import Dependencies.testLibraries

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = Dependencies.config.namespace
    compileSdk = Dependencies.versions.compileSdk

    defaultConfig {
        applicationId = Dependencies.config.applicationId
        minSdk = Dependencies.versions.minSdk
        targetSdk = Dependencies.versions.targetSdk
        versionCode = Dependencies.config.versionCode
        versionName = Dependencies.config.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libraries.androidx.core)
    implementation(libraries.androidx.appcompat)
    implementation(libraries.androidx.design)
    implementation(libraries.androidx.constraintlayout)
    implementation(testLibraries.junit)
    implementation(testLibraries.ext)
    implementation(testLibraries.espresso)

    //Splash API
    implementation(libraries.androidx.splashscreen)
    implementation(project(":core"))

    //Dagger 2
    implementation(libraries.dagger)
    kapt(libraries.daggerCompiler)
}