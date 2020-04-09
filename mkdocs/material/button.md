# Button
A [Button](https://developer.android.com/reference/kotlin/androidx/ui/material/package-summary#button) has a onClick-Function. You can not set text as an argument. But you can add a Text-Composable  or other composables as child elements of the Button.

<p align="left">
  <img src ="../../images/buttonExample.png"  />
</p>

```kotlin
@Composable fun ButtonExample() {
    Button(onClick = { /* Do something! */ },backgroundColor = Color.Red) {
        Text("Button")
    }
}
```
