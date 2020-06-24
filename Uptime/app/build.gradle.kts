import java.io.FileInputStream
import java.util.*

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Apps.compileSdk)

    compileSdkVersion(Apps.compileSdk)
    defaultConfig {
        minSdkVersion(Apps.minSdk)
        targetSdkVersion(Apps.targetSdk)
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        multiDexEnabled = true
        setProperty("archivesBaseName", "$applicationId-v$versionName($versionCode)")
        resConfigs("en")
        ndk {
            abiFilters("armeabi-v7a", "x86", "arm64-v8a", "x86_64")
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    signingConfigs {
        if (rootProject.file("signing-debug.properties").exists()) {
            val signingDebug = Properties()
            signingDebug.load(FileInputStream(rootProject.file("signing-debug.properties")))
            getByName("debug") { // ToDo:: Fill related files
                //storeFile = rootProject.file(signingDebug.getProperty("storeFile"))
                //storePassword = signingDebug.getProperty("storePassword")
                //keyAlias = signingDebug.getProperty("keyAlias")
                //keyPassword = signingDebug.getProperty("keyPassword")
            }
        }
        if (rootProject.file("signing-release.properties").exists()) {
            val signingRelease = Properties()
            signingRelease.load(FileInputStream(rootProject.file("signing-release.properties")))
            create("release") {// ToDo:: Fill related files
                //storeFile =  rootProject.file(signingRelease.getProperty("storeFile"))
                //storePassword = signingRelease.getProperty("storePassword")
                //keyAlias = signingRelease.getProperty("keyAlias")
                //keyPassword = signingRelease.getProperty("keyPassword")
            }
        }
    }

    buildTypes {
        getByName("debug") {
            buildConfigField("String", "API_BASE", "\"https://api.jikan.moe/v3\"")
            isMinifyEnabled = false
            isDebuggable = true
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-dev"
            signingConfig = signingConfigs.getByName("debug")
        }
        getByName("release") {
            buildConfigField("String", "API_BASE", "\"https://api.jikan.moe/v3\"")
            isMinifyEnabled = true
            isDebuggable = false
            isShrinkResources = true
            isZipAlignEnabled = true
            isJniDebuggable = false
            isRenderscriptDebuggable = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")
        }
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(project(":uptime_module")) // Projects that you need to compile
    implementation(LibraryDependency.kotlin)
    implementation(LibraryDependency.appcompat)
    implementation(LibraryDependency.constraint_layout)
    implementation(LibraryDependency.core_ktx)
    testImplementation(TestLibs.junit)
}