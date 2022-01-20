# Project Setup

## Android Studio
To use Jetpack Compose you need to use at least a [version >= Android Studio Arctic Fox ](https://developer.android.com/studio/preview)

## Gradle Dependencies

Add this inside in the **android{}** block your build.gradle
```groovy
android{
//YOUR OTHER CODE

    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion "1.0.5"
        kotlinCompilerVersion '1.5.31'
    }

}
```

Below are some Compose dependencies that are online available, can find the others [here](https://maven.google.com/web/index.html?q=compose#androidx.compose.ui)

```kotlin

dependencies {
    val compose_version = "1.0.5"

    implementation("androidx.compose.animation:animation-core:$compose_version")
    implementation("androidx.compose.animation:animation:$compose_version")
    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.foundation:foundation:$compose_version")
    implementation("androidx.compose.ui:ui-geometry:$compose_version")
    implementation("androidx.compose.ui:ui-graphics:$compose_version")
    implementation("androidx.compose.foundation:foundation-layout:$compose_version")
    implementation("androidx.compose.runtime:runtime-livedata:$compose_version")
    implementation("androidx.compose.material:material:$compose_version")
    implementation("androidx.compose.material:material-icons-core:$compose_version")
    implementation("androidx.compose.material:material-icons-extended:$compose_version")
    implementation("androidx.compose.runtime:runtime-rxjava2:$compose_version")
    implementation("androidx.compose.ui:ui-text:$compose_version")
    implementation("androidx.compose.ui:ui-util:$compose_version")
    implementation("androidx.compose.ui:ui-viewbinding:$compose_version")
    implementation("androidx.compose.ui:ui-tooling:$compose_version")
    implementation("androidx.activity:activity-compose:1.3.1")

    //Compose Constraintlayout
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.0-beta02")
}

```
