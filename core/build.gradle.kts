@file:Suppress("UnstableApiUsage", "DEPRECATION")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "${Config.applicationId}.core"
    compileSdk = Config.compileSdk
    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        testInstrumentationRunner =
            Config.testInstrumentationRunner
        consumerProguardFiles(Config.consumer)
    }
    buildTypes {
        release {
            isMinifyEnabled = Config.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(Config.proguardFile),
                Config.proguard
            )
        }
    }
    compileOptions {
        sourceCompatibility = Config.sourceCompatibility
        targetCompatibility = Config.sourceCompatibility
    }
    kotlinOptions { jvmTarget = Config.jvmTarget }
}

dependencies {
    core()
    implementation(project(":shared"))
}