buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
        classpath("com.android.tools.build:gradle:7.1.0-beta03")
    }
}

plugins {
    id("org.jetbrains.kotlinx.kover") version "0.5.0"
}

allprojects {
    group = "io.github.gmvalentino8"
    version = "0.0.1"

    repositories {
        google()
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
    }
}

//kover {
//    coverageEngine.set(kotlinx.kover.api.CoverageEngine.INTELLIJ)
//    intellijEngineVersion.set("1.0.656")
//    disabledProjects = setOf("moduleA")
//}

tasks.withType(kotlinx.kover.tasks.KoverMergedTask::class) {
    excludes = listOf("*.tests.*", "*.BuildConfig")
}
