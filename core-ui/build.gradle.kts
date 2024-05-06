import dependencies.compose
import dependencies.core
import dependencies.hilt
import dependencies.ktx
import dependencies.test

plugins {
    `android-library`
    `kotlin-android`
}

apply<GradlePlugins>()

android {
    namespace = "com.fAndroid.core_ui"
}

dependencies {
    compose()
    hilt()
    test()
}