@file:Suppress("UnstableApiUsage", "DEPRECATION")

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "${Config.applicationId}.feature"
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
    buildFeatures { compose = true }
    composeOptions {
        kotlinCompilerExtensionVersion =
            Config.kotlinCompilerExVer
        kotlinCompilerVersion =
            Config.kotlinCompilerVer
    }
    compileOptions {
        sourceCompatibility = Config.sourceCompatibility
        targetCompatibility = Config.sourceCompatibility
    }
    kotlinOptions { jvmTarget = Config.jvmTarget }
}

dependencies {
    feature()
    implementation(project(":feature:login"))
    implementation(project(":shared"))
    implementation(project(":data"))
    implementation(project(":core"))
}