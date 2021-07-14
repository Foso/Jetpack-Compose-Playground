# How to detect dark mode

!!! info
    This is the API of 1.0.0-rc02. Newer versions may have a different one

Inside your composable you can use **isSystemInDarkTheme** to detect if the device is running in dark mode.

```kotlin
    val dark = isSystemInDarkTheme()
```

-------------

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/package-summary#issystemindarktheme)
* [Learn-Jetpack-Compose-By-Example/DarkModeActivity](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/theme/DarkModeActivity.kt)
