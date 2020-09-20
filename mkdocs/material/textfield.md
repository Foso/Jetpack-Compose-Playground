# TextField

!!! info
    This is the API of version 1.0.0-alpha03. Newer versions may have a different one

TextField can be used to insert text. This is the equivalent to **EditText** from the Android View system.

<p align="center">
  <img src ="../../images/material/textfield/textfield.png"  />
</p>

```kotlin
@Composable
fun TextFieldDemo() {
    Column(Modifier.padding(16.dp)) {
        val textState = remember { mutableStateOf(TextFieldValue()) }
        TextField(
                value = textState.value,
                onValueChange = { textState.value = it }
        )
        Text("The textfield has this text: " + textState.value.text)
    }
}
```

<hr>
## See also:
* [Handle changes in a TextField](https://foso.github.io/Jetpack-Compose-Playground/cookbook/textfield_changes/)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/material/textfield/TextFieldDemo.kt)
