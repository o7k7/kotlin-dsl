include(":uptime_module")
rootProject.name = "Uptime"
rootDir.walk()
    .maxDepth(1)
    .filter {
        it.name != "buildSrc"
                && it.isDirectory
                && file("${it.absolutePath}/build.gradle.kts").exists()
    }
    .forEach {
        include(":${it.name}")
    }