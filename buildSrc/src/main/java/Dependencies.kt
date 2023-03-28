object Dependencies {

    object config {
        const val versionCode = 1
        const val versionName = "1.0"

        const val namespace = "ru.mike.creditcalculator2"
        const val applicationId = "ru.mike.creditcalculator2"
    }

    object versions {
        const val minSdk = 23
        const val compileSdk = 33
        const val targetSdk = 33

        const val buildTools = "33.0.0"

        const val kotlin = "1.7.20"
        const val androidLibrary = "7.3.1"
        const val androidApplication = "7.3.1"

        object androidx {
            const val core = "1.7.0"
            const val appcompat = "1.6.1"
            const val design = "1.8.0"
            const val constraintlayout = "2.1.4"
            const val splashscreen = "1.0.0"
        }

        object test {
            const val ext = "1.1.5"
            const val espresso = "3.5.1"
            const val junit = "4.13.2"
        }
    }

    object libraries {
        object androidx {
            const val core = "androidx.core:core-ktx:${versions.androidx.core}"
            const val appcompat = "androidx.appcompat:appcompat:${versions.androidx.appcompat}"
            const val design = "com.google.android.material:material:${versions.androidx.design}"
            const val constraintlayout =
                "androidx.constraintlayout:constraintlayout:${versions.androidx.constraintlayout}"
            const val splashscreen = "androidx.core:core-splashscreen:${versions.androidx.splashscreen}"
        }
    }

    object testLibraries {
        const val junit = "junit:junit:${versions.test.junit}"
        const val ext = "androidx.test.ext:junit:${versions.test.ext}"
        const val espresso = "androidx.test.espresso:espresso-core:${versions.test.espresso}"
    }

}