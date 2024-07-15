plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.curso.android.app.practica.databindingapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.curso.android.app.practica.databindingapp"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures{

        dataBinding = true

    }

}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    constraints {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-sdk7:1.8.0") {
            because("kotlin-stdlib-sdk7 is now a part of kotlin-stdlib")
        }
        implementation("org.jetbrains.kotlin:kotlin-stdlib-sdk8:1.8.0") {
            because("kotlin-stdlib-sdk8 is now a part of kotlin-stdlib")
        }
    }
}