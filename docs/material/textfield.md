<!---
This is the API of version 1.0.2
-->
# TextField

TextField can be used to insert text. This is the equivalent to **EditText** from the Android View system.

<p align="center">
  <img src ="{{ site.images }}/material/textfield/textfield.png"  />
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

-------------
## See also:
* [Handle changes in a TextField](https://foso.github.io/Jetpack-Compose-Playground/cookbook/textfield_changes/)
* [Full Example Code]({{ site.samplefolder }}/other/TextFieldDemo.kt)
