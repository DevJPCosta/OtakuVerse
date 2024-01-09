pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    include("app")

}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.google.gms:google-services:4.4.0") // Or appropriate version
    }
}

plugins {
    id("com.android.application") version "8.2.1" apply false // Or appropriate version
    id("com.android.library") version "8.2.1" apply false // Or appropriate version
    id("com.google.gms.google-services") version "4.3.10" apply false // Or appropriate version
}



