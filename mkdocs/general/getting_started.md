!!! info
        Note: Jetpack Compose is currently in Developer Preview. The API surface is not yet finalized, and changes are planned and expected. See the Compose Compiler and Runtime release notes and the Compose UI release notes for the latest updates.

## Android Studio
To use Jetpack Compose you need to use at least a [version >=4.1 Canary 1](https://developer.android.com/studio/preview)

## Gradle Dependencies


Add this inside in the android{} block your build.gradle
```groovy
buildFeatures {
    compose true
}
composeOptions {
       kotlinCompilerVersion "1.3.70-dev-withExperimentalGoogleExtensions-20200424"
       kotlinCompilerExtensionVersion "0.1.0-dev12"
}

```

Below are all compose dependencies that are online available, you don't need to add all of them.

```groovy

dependencies {
    def compose_version = "0.1.0-dev12"

       implementation("androidx.compose:compose-runtime:$compose_version")
       implementation("androidx.ui:ui-animation:$compose_version")
       implementation("androidx.ui:ui-animation-core:$compose_version")
       implementation("androidx.ui:ui-core:$compose_version")
       implementation("androidx.ui:ui-foundation:$compose_version")
       implementation("androidx.ui:ui-geometry:$compose_version")
       implementation("androidx.ui:ui-graphics:$compose_version")
       implementation("androidx.ui:ui-livedata:$compose_version")
       implementation("androidx.ui:ui-layout:$compose_version")
       implementation("androidx.ui:ui-material:$compose_version")
       implementation("androidx.ui:ui-material-icons-core:$compose_version")
       implementation("androidx.ui:ui-material-icons-extended:$compose_version")
       implementation("androidx.ui:ui-rxjava2:$compose_version")
       implementation("androidx.ui:ui-saved-instance-state:$compose_version")
       implementation("androidx.ui:ui-test:$compose_version")
       implementation "androidx.ui:ui-text:$compose_version"
       implementation "androidx.ui:ui-text-android:$compose_version"
       implementation "androidx.ui:ui-tooling:$compose_version"
       implementation "androidx.ui:ui-unit:$compose_version"
       implementation "androidx.ui:ui-util:$compose_version"
       implementation "androidx.ui:ui-vector:$compose_version"
}

```
