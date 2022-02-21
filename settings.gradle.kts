rootProject.name = "MppKoverExample"

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

include(":moduleA")
include(":moduleB")
