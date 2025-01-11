plugins {
    id("com.gradleup.shadow") version "9.0.0-beta4"
//    kotlin("jvm") version "2.0.21"
    kotlin("jvm")
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

    test {
        useJUnitPlatform()
    }

    register<JavaExec>("run") {
        group = "application"
        description = "Runs the application"
        classpath = sourceSets["main"].runtimeClasspath
        mainClass.set("ir.rezajax.MainKt") // Replace with your actual main class
    }
}


dependencies {

    implementation(project(":sock"))
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}