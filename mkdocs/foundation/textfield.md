# TextField
TextField can be used to insert text. This is the equivalent to **EditText** from the Android View system.

<p align="left">
  <img src ="../../images/TextFieldDemo.png"  />
</p>

```kotlin
@Composable
fun TextFieldDemo() {
    Column {
        val state = state { TextFieldValue("") }
        TextField(
            value = state.value,
            onValueChange = { state.value = it }
        )
        Text("The textfield has this text: "+state.value)
    }
}
```

<hr>
## See also:
* [Handle changes in a TextField](https://foso.github.io/Jetpack-Compose-Playground/cookbook/textfield_changes/)
* [How to show hint with underline in a TextField](https://foso.github.io/Jetpack-Compose-Playground/cookbook/hint_edit_text/)