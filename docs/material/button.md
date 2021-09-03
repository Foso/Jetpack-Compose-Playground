<!---
This is the API of version 1.0.2
-->
# Button

A [Button](https://developer.android.com/reference/kotlin/androidx/ui/material/package-summary#button) has a onClick-Function. You can add a Text-Composable or any other Composables as child elements of the Button.

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


# OutlinedButton

<p align="left">
  <img src ="{{ site.images }}/material/outlinedbutton/outlinedbutton.png"  />
</p>

```kotlin
@Composable
fun OutlinedButtonExample() {
    OutlinedButton(onClick = { /* Do something! */ }) {
       Text("I'm an Outlined Button")
   }
}
```

<hr>
### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Button(kotlin.Function0,androidx.compose.ui.Modifier,kotlin.Boolean,androidx.compose.foundation.interaction.MutableInteractionSource,androidx.compose.material.ButtonElevation,androidx.compose.ui.graphics.Shape,androidx.compose.foundation.BorderStroke,androidx.compose.material.ButtonColors,androidx.compose.foundation.layout.PaddingValues,kotlin.Function1))
* [Full Example Code]({{ site.samplefolder }}/material/button/ButtonExample.kt)

