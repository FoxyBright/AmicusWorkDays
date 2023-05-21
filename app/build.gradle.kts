@file:Suppress("UnstableApiUsage", "DEPRECATION")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileSdk
    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName
        testInstrumentationRunner =
            Config.testInstrumentationRunner
        vectorDrawables {
            useSupportLibrary =
                Config.useSupportLibrary
        }
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
    buildFeatures { compose = true }
    composeOptions {
        kotlinCompilerExtensionVersion =
            Config.kotlinCompilerExVer
        kotlinCompilerVersion =
            Config.kotlinCompilerVer
    }
    packagingOptions {
        resources { excludes += Config.packagingOptExclude }
    }
}

dependencies {
    app()
    implementation(project(":feature:login"))
    implementation(project(":feature"))
    implementation(project(":domain"))
    implementation(project(":shared"))
    implementation(project(":core"))
    implementation(project(":data"))
}