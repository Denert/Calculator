plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
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
}

dependencies {

    implementation(Dependencies.libraries.androidx.core)
    implementation(Dependencies.libraries.androidx.appcompat)
    implementation(Dependencies.libraries.androidx.design)
    implementation(Dependencies.libraries.androidx.constraintlayout)
    implementation(Dependencies.testLibraries.junit)
    implementation(Dependencies.testLibraries.ext)
    implementation(Dependencies.testLibraries.espresso)

    //Splash API
    implementation(Dependencies.libraries.androidx.splashscreen)

//    //Dagger 2
//    implementation ''
}