plugins {
    kotlin("jvm") version "1.8.21"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "al.pregoffici"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://repo.purpurmc.org/snapshots")
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("org.purpurmc.purpur:purpur-api:1.19.4-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

