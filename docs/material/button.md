# Button

!!! info
    This is the API of version 1.0.0-beta01

A [Button](https://developer.android.com/reference/kotlin/androidx/ui/material/package-summary#button) has a onClick-Function. You can add a Text-Composable or any other composables as child elements of the Button.

<p align="left">
  <img src ="{{ site.images }}/material/button/buttonExample.png"  />
</p>

```kotlin
@Composable
fun ButtonExample() {
    Button(onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
        backgroundColor = Color.Red
    )) {
        Text("Button")
    }
}
```


<hr>
### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/material/Button)
* [Full Example Code]({{ site.samplefolder }}/material/button/ButtonExample.kt)

