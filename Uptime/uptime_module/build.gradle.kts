import java.io.FileInputStream
import java.util.*

plugins {
    id("com.android.application")
    id("io.objectbox")
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
            getByName("debug") {
                //storeFile = rootProject.file(signingDebug.getProperty("storeFile"))
                //storePassword = signingDebug.getProperty("storePassword")
                //keyAlias = signingDebug.getProperty("keyAlias")
                //keyPassword = signingDebug.getProperty("keyPassword")
            }
        }
        if (rootProject.file("signing-release.properties").exists()) {
            val signingRelease = Properties()
            signingRelease.load(FileInputStream(rootProject.file("signing-release.properties")))
            create("release") {
                //storeFile =  rootProject.file(signingRelease.getProperty("storeFile"))
                //storePassword = signingRelease.getProperty("storePassword")
                //keyAlias = signingRelease.getProperty("keyAlias")
                //keyPassword = signingRelease.getProperty("keyPassword")
            }
        }
    }

    buildTypes {
        getByName("debug") {
            buildConfigField("String", "API_BASE", "\"http://www.mocky.io/v2/\"")
            isMinifyEnabled = false
            isDebuggable = true
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-dev"
            signingConfig = signingConfigs.getByName("debug")
        }
        getByName("release") {
            buildConfigField("String", "API_BASE", "\"http://www.mocky.io/v2/\"")
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

    kapt {
        arguments {
            arg("objectbox.debug", true)
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    // Core + util
    api(LibraryDependency.TIMBER)
    api(LibraryDependency.GSON)
    api(LibraryDependency.COROUTINES_ANDROID)
    api(LibraryDependency.COROUTINES_CORE)

    // DI
    api(LibraryDependency.KOTLIN)
    api(LibraryDependency.KODEIN)
    api(LibraryDependency.KODEIN_ANDROID_X)

    // Network
    api(LibraryDependency.RETROFIT)
    api(LibraryDependency.RETROFIT_MOSHI_CONVERTER)
    api(LibraryDependency.OKHTTP)
    api(LibraryDependency.LOGGING_INTERCEPTOR)

    // Network Debug
    debugImplementation(LibraryDependency.CHUCKER)
    releaseImplementation(LibraryDependency.CHUCKER_NO_OP)

    // Cryptography libs
    //api(LibraryDependency.TRUTH)

    // DB
    debugImplementation(LibraryDependency.OBJECTBOX_DEBUG)
    releaseImplementation(LibraryDependency.OBJECTBOX)

    // Debug View
    kapt(LibraryDependency.AUTO_SERVICE)
    compileOnly(LibraryDependency.AUTO_SERVICE)
    annotationProcessor(LibraryDependency.AUTO_SERVICE)
    api(LibraryDependency.APP_COMPACT)
    api(LibraryDependency.RECYCLER_VIEW)
}