plugins {
    id ("org.jetbrains.kotlin.jvm") version "1.3.40"
}

group = "com.kata.gameOfLife"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("junit:junit:4.12")
}
