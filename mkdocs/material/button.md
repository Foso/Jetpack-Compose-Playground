# Button

!!! info
    This is the API of version dev16. Newer versions may have a different one

A [Button](https://developer.android.com/reference/kotlin/androidx/ui/material/package-summary#button) has a onClick-Function. You can not set text as an argument. But you can add a Text-Composable  or other composables as child elements of the Button.

<p align="left">
  <img src ="../../images/material/button/buttonExample.png"  />
</p>

```kotlin
@Composable fun ButtonExample() {
    Button(onClick = { /* Do something! */ },backgroundColor = Color.Red) {
        Text("Button")
    }
}
```


<hr>
### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/material/Button)
* [Compose Academy/Button](https://compose.academy/academy/material/button/)
* [Learn-Jetpack-Compose-By-Example/ButtonActivity](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/material/ButtonActivity.kt)

