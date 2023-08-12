import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "org.tanriverdi"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    compilerOptions {
        freeCompilerArgs.set(listOf("-Xcontext-receivers"))
        jvmTarget.set(JvmTarget.JVM_17)
        languageVersion.set(KotlinVersion.KOTLIN_2_0)
    }
}