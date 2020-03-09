# TextField
TextField can be used to insert text

<p align="left">
  <img src ="../../images/TextFieldDemo.png"  />
</p>

```kotlin
@Composable
fun TextFieldDemo() {
    Column {
        val state = state { "" }
        TextField(
            value = state.value,
            onValueChange = { state.value = it }
        )
        Text("The textfield has this text: "+state.value)
    }
}
```