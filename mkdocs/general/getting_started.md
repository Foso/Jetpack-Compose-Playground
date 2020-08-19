!!! info
        Note: Jetpack Compose is currently in Developer Preview. The API surface is not yet finalized, and changes are planned and expected. See the Compose Compiler and Runtime release notes and the Compose UI release notes for the latest updates.

## Android Studio
To use Jetpack Compose you need to use at least a [version >=4.2 Canary 7](https://developer.android.com/studio/preview)

## Gradle Dependencies


Add this inside in the android{} block your build.gradle
```groovy
buildFeatures {
    compose true
}
 composeOptions {
        kotlinCompilerVersion "1.4.0"
        kotlinCompilerExtensionVersion "0.1.0-dev17"
    }

```

Below are all compose dependencies that are online available, you don't need to add all of them.

```groovy

dependencies {
    def compose_version = "0.1.0-dev17"

      implementation("androidx.compose.runtime:runtime-dispatch:$compose_version")
      implementation("androidx.compose.runtime:runtime:$compose_version")
      implementation "androidx.compose.animation:animation-core:$compose_version"
      implementation "androidx.compose.animation:animation:$compose_version"
      implementation("androidx.compose.ui:ui:$compose_version")
      implementation "androidx.compose.foundation:foundation:$compose_version"
      implementation "androidx.compose.ui:ui-geometry:$compose_version"
      implementation "androidx.compose.ui:ui-graphics:$compose_version"
      implementation "androidx.compose.foundation:foundation-layout:$compose_version"
      implementation "androidx.compose.runtime:runtime-livedata:$compose_version"
      implementation "androidx.compose.material:material:$compose_version"
      implementation "androidx.compose.material:material-icons-core:$compose_version"
      implementation "androidx.compose.material:material-icons-extended:$compose_version"
      implementation "androidx.compose.runtime:runtime-rxjava2:$compose_version"
      implementation("androidx.compose.ui:ui-text:$compose_version")
      implementation("androidx.compose.ui:ui-text:$compose_version")
      implementation("androidx.compose.ui:ui-text-android:$compose_version")
      implementation("androidx.compose.ui:ui-util:$compose_version")
      implementation ("androidx.compose.ui:ui-viewbinding:0.1.0-$compose_version")
}

```
