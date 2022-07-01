/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.5.31"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/public/")
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
}

dependencies {
    // Align versions of all Kotlin components
    compileOnly(group="me.clip", name="placeholderapi", version="2.11.1")
    compileOnly("org.spigotmc:spigot-api:1.18.1-R0.1-SNAPSHOT")


    // This dependency is used by the application.

    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 18 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

application {
    // Define the main class for the application.
    mainClass.set("me.em.point")
}


tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "15"
    }

}

java {
    sourceCompatibility = JavaVersion.VERSION_15
    targetCompatibility = JavaVersion.VERSION_15

}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "me.em.point"
    }
    destinationDirectory.set(file("/home/metumortis/Desktop/Sunucu Kurma Klasörü/plugins/"))
}