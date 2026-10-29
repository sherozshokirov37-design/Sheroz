plugins {
    id("com.android.application")
}

android {
    namespace = "uz.bazaar.run"
    compileSdk = 35

    defaultConfig {
        applicationId = "uz.bazaar.run"
        minSdk = 24
        targetSdk = 35
        versionCode = 3
        versionName = "1.2"
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
