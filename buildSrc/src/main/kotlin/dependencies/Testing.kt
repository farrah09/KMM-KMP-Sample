package dependencies

import androidTestImplementation
import debugImplementation
import org.gradle.api.artifacts.dsl.DependencyHandler
import testImplementation

object Testing {
    private const val junitVersion = "4.13.2"
    const val junit4 = "junit:junit:$junitVersion"

    private const val junitAndroidExtVersion = "1.1.5"
    const val junitAndroidExt = "androidx.test.ext:junit:$junitAndroidExtVersion"

    private const val espressoCoreVersion = "3.5.1"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"

    const val junitComposeUiTest = "androidx.compose.ui:ui-test-junit4"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling"
    const val composeUiTest = "androidx.compose.ui:ui-test-manifest"

    private const val coroutinesTestVersion = "1.5.1"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesTestVersion"

    private const val truthVersion = "1.1.3"
    const val truth = "com.google.truth:truth:$truthVersion"

    private const val mockkVersion = "1.10.0"
    const val mockk = "io.mockk:mockk:$mockkVersion"
    const val mockkAndroid = "io.mockk:mockk-android:$mockkVersion"

    private const val turbineVersion = "0.7.0"
    const val turbine = "app.cash.turbine:turbine:$turbineVersion"

    private const val mockWebServerVersion = "4.9.3"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:$mockWebServerVersion"

    const val hiltTesting = "com.google.dagger:hilt-android-testing:${DaggerHilt.version}"

    private const val testRunnerVersion = "1.4.0"
    const val testRunner = "androidx.test:runner:$testRunnerVersion"
}

fun DependencyHandler.test(){
    testImplementation(Testing.junit4)
    androidTestImplementation(Testing.junitAndroidExt)
    androidTestImplementation(Testing.espressoCore)
    androidTestImplementation(platform(Compose.bom))
    androidTestImplementation(Testing.junitComposeUiTest)
    debugImplementation(Testing.composeUiTest)
    debugImplementation(Testing.composeUiTooling)
}