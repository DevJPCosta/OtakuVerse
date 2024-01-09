// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.library") version "8.2.1" apply false // Or appropriate version
    id("com.google.gms.google-services") version "4.3.10" apply false // Or appropriate version


}
repositories {
    google()
    mavenCentral()
}
