plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group "org.ton"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("androidx.activity:activity-compose:1.3.0")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "org.ton.wallet.android"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}