// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") apply false
    id("org.jetbrains.kotlin.android") apply false
    id("com.google.gms.google-services") apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Pastikan versi ini kompatibel dengan versi Android Studio dan Flutter Anda
        classpath("com.android.tools.build:gradle:8.4.1") // Versi yang umum digunakan
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0") // Versi Kotlin
        classpath("com.google.gms:google-services:4.4.3") // Versi Google Services
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir = rootProject.layout.buildDirectory.dir("../../build").get()
rootProject.layout.buildDirectory.set(newBuildDir)

subprojects {
    val newSubprojectBuildDir = newBuildDir.dir(project.name)
    project.layout.buildDirectory.set(newSubprojectBuildDir)
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}