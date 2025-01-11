plugins {
    id("com.gradleup.shadow") version "9.0.0-beta4"
    kotlin("jvm") version "2.0.21"
}

group = "ir.rezajax"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks {
    shadowJar {
        // Specify the main class to run
        manifest {
            attributes["Main-Class"] = "ir.rezajax.MainKt" // Replace with your main class path

        }
        archiveBaseName.set("my-shadow-jar") // Name of the JAR file
        archiveVersion.set("1.0.0") // Set the version if necessary
        mergeServiceFiles() // Optional: Merges service files from dependencies
    }
}


dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}