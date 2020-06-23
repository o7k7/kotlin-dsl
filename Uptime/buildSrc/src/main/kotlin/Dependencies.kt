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