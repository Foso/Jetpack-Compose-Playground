# Handle changes to a TextField

In some cases, it’s useful to get the value of a textfield every time the text in a text field changes. For example, you might want to build a search screen with autocomplete functionality where you want to update the results as the user types.

With Compose you have the following options:

## 1) Supply an onValueChange() callback to a TextField

<p align="left">
  <img src ="../../images/TextFieldDemo.png"  />
</p>

```kotlin
@Composable
fun HandleTextFieldChanges() {
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

The simplest approach is to supply an onValueChange() callback to a TextField. Whenever the text changes, the callback is invoked.

In this example, every time the TextField changes, the new text value will be saved in a state and set to the TextField and the Text.