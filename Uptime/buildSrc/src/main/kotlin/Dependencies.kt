object Apps {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Versions {
    const val gradle = "4.0.0"
    const val kotlin = "1.3.72"
    const val appcompat = "1.0.2"

    const val KODEIN = "6.3.3"
    const val OBJECTBOX = "2.5.1"
    const val RETROFIT = "2.6.1"
    const val LOGGING_INTERCEPTOR = "4.2.0"
    const val STETHO = "1.5.1"
    const val TIMBER = "4.7.1"
    const val PLAY_CORE = "1.6.1"
    const val APP_COMPACT = "1.0.2"
    const val RECYCLER_VIEW = "1.0.0"
    const val COORDINATOR_LAYOUT = "1.0.0"
    const val MATERIAL = "1.1.0-beta01"
    const val CONSTRAINT_LAYOUT = "1.1.3"
    const val CORE_KTX = "1.0.2"
    const val FRAGMENT_KTX = "1.0.0"
    const val LIFECYCLE = "1.1.1"
    const val LIFECYCLE_VIEW_MODEL_KTX = "2.1.0-rc01"
    const val COIL = "0.6.1"
    const val K_ANDROID = "0.8.8@aar"
    const val LOTTIE = "3.0.7"
    const val FIREBASE_ANALYTICS = "17.0.1"
    const val PLAY_SERVICES_AUTH = "17.0.0"
    const val FIREBASE_AUTH = "17.0.0"
    const val RX_ANDROID = "2.1.0"
    const val RX_JAVA = "2.2.2"
    const val RX_KOTLIN = "2.3.0"
    const val APP_CENTER = "2.3.0"
    const val GSON = "2.8.5"
    const val FLEXBOX = "1.1.1"
    const val DAGGER = "2.24"
    const val AUTO_SERVICE = "1.0-rc4"
    const val DEVICE_NAMES = "1.1.9"
    const val OKHTTP = "4.2.0"
    const val TINK = "1.3.0-rc1"
    const val TRUTH = "0.44"
    const val CHUCKER = "3.0.1"
    const val ROOM = "2.2.0"
    const val WORK = "2.2.0"
    const val DEVTOOLS_PLUGIN = "0.0.3"
    const val DEVTOOLS = "0.0.5"
    const val GLIDE = "4.10.0"
    const val PICASSO = "2.71828"

    /* test */
    const val junit = "4.12"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core_ktx = "androidx.core:core-ktx:1.1.0"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:1.1.3"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
}

object LibraryDependency {
    const val DEVTOOLS_PLUGIN =
        "com.loodos.devtools.plugin:devtools_plugin:${Versions.DEVTOOLS_PLUGIN}"
    const val DEVTOOLS = "com.loodos.devtools:devtools:${Versions.DEVTOOLS}"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersion.KOTLIN}"
    const val KOTLIN_REFLECT =
        "org.jetbrains.kotlin:kotlin-reflect:${CoreVersion.KOTLIN}" //safe args
    const val KODEIN = "org.kodein.di:kodein-di-generic-jvm:${Versions.KODEIN}"
    const val KODEIN_ANDROID_X = "org.kodein.di:kodein-di-framework-android-x:${Versions.KODEIN}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_MOSHI_CONVERTER =
        "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"
    const val LOGGING_INTERCEPTOR =
        "com.squareup.okhttp3:logging-interceptor:${Versions.LOGGING_INTERCEPTOR}"
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val STETHO = "com.facebook.stetho:stetho:${Versions.STETHO}"
    const val STETHO_OK_HTTP = "com.facebook.stetho:stetho-okhttp3:${Versions.STETHO}"
    const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
    const val SUPPORT_CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val PLAY_CORE = "com.google.android.play:core:${Versions.PLAY_CORE}"
    const val APP_COMPACT = "androidx.appcompat:appcompat:${Versions.APP_COMPACT}"
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
    const val COORDINATOR_LAYOUT =
        "androidx.coordinatorlayout:coordinatorlayout:${Versions.COORDINATOR_LAYOUT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${CoreVersion.COROUTINES_ANDROID}"
    const val COROUTINES_CORE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${CoreVersion.COROUTINES_ANDROID}"
    const val CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"
    const val LIFECYCLE_EXTENSIONS = "android.arch.lifecycle:extensions:${Versions.LIFECYCLE}"
    const val LIFECYCLE_VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VIEW_MODEL_KTX}"
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${CoreVersion.NAVIGATION}"
    const val NAVIGATION_UI_KTX = "androidx.navigation:navigation-ui-ktx:${CoreVersion.NAVIGATION}"
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"
    const val K_ANDROID = "com.pawegio.kandroid:kandroid:${Versions.K_ANDROID}"
    const val LOTTIE = "com.airbnb.android:lottie:${Versions.LOTTIE}"
    const val FIREBASE_ANALYTICS =
        "com.google.firebase:firebase-analytics:${Versions.FIREBASE_ANALYTICS}"
    const val PLAY_SERVICES_AUTH =
        "com.google.android.gms:play-services-auth:${Versions.PLAY_SERVICES_AUTH}"
    const val FIREBASE_AUTH = "com.google.firebase:firebase-auth:${Versions.FIREBASE_AUTH}"
    const val RX_ANDROID = "io.reactivex.rxjava2:rxandroid:${Versions.RX_ANDROID}"
    const val RX_JAVA = "io.reactivex.rxjava2:rxjava:${Versions.RX_JAVA}"
    const val RX_KOTLIN = "com.microsoft.appcenter:appcenter-analytics:${Versions.RX_KOTLIN}"
    const val APP_CENTER_ANALYTICS = "io.reactivex.rxjava2:rxkotlin:${Versions.APP_CENTER}"
    const val APP_CENTER_CRASHES =
        "com.microsoft.appcenter:appcenter-crashes:${Versions.APP_CENTER}"
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
    const val FLEXBOX = "com.google.android:flexbox:${Versions.FLEXBOX}"
    const val DAGGER = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:${Versions.DAGGER}"
    const val AUTO_SERVICE = "com.google.auto.service:auto-service:${Versions.AUTO_SERVICE}"
    const val DEVICE_NAMES = "com.jaredrummler:android-device-names:${Versions.DEVICE_NAMES}"
    const val TINK = "com.google.crypto.tink:tink-android:${Versions.TINK}"
    const val TRUTH = "com.google.truth:truth:${Versions.TRUTH}"
    const val CHUCKER = "com.github.ChuckerTeam.Chucker:library:${Versions.CHUCKER}"
    const val CHUCKER_NO_OP = "com.github.ChuckerTeam.Chucker:library-no-op:${Versions.CHUCKER}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"
    const val WORK_KTX = "androidx.work:work-runtime-ktx:${Versions.WORK}"
    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
    const val PICASSO = "com.squareup.picasso:picasso:${Versions.PICASSO}"
    const val OBJECTBOX = "io.objectbox:objectbox-kotlin:${Versions.OBJECTBOX}"
    const val OBJECTBOX_DEBUG = "io.objectbox:objectbox-android-objectbrowser:${Versions.OBJECTBOX}"
}

object CoreVersion {
    const val KOTLIN = "1.3.50"
    const val COROUTINES_ANDROID = "1.3.2"
    const val KTLINT = "0.34.2"
    const val NAVIGATION = "2.1.0-rc01"
    const val GOOGLE_SERVICES = "4.2.0"
    const val BINTRY = "0.9.1"
}

