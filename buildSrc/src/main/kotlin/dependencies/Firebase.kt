package dependencies

import implementation
import org.gradle.api.artifacts.dsl.DependencyHandler

object Firebase {
    const val version = "32.8.1"
    const val firebase = "com.google.firebase:firebase-bom:$version"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics"
}

fun DependencyHandler.firebase(){
    implementation(platform(Firebase.firebase))
    implementation(Firebase.firebaseAnalytics)
}

