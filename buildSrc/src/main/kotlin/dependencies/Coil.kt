import dependencies.AndroidX
import org.gradle.api.artifacts.dsl.DependencyHandler

object Coil {
    private const val version = "1.3.2"
    const val coilCompose = "io.coil-kt:coil-compose:$version"
}

fun DependencyHandler.coil(){
    implementation(Coil.coilCompose)
}