import org.jetbrains.compose.compose
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.0"
    id("org.jetbrains.compose") version "0.1.0-m1-build62"
    application
}

group = "de.jensklingenberg"
version = "1.0-SNAPSHOT"

repositories {
    google()
    jcenter()
    mavenCentral()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
}

dependencies {
    implementation("org.jetbrains.compose.desktop:desktop-jvm-all:0.1.0-m1-build62")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "MainKt"
}