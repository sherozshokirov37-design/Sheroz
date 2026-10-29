plugins {
    id("com.android.application")
}

android {
    namespace = "uz.minaret.game"
    compileSdk = 35

    defaultConfig {
        applicationId = "uz.minaret.game"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
