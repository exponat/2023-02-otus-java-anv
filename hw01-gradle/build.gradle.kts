import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow")
}

dependencies {
    implementation("com.google.guava:guava")
}

tasks {
    named<ShadowJar>("shadowJar") {
        archiveBaseName.set("gradleShadowJar")
        archiveVersion.set("0.1")
        archiveClassifier.set("")
        manifest {
            attributes(mapOf("Main-Class" to "org.example.Main"))
        }
    }

    build {
        dependsOn(shadowJar)
    }
}
