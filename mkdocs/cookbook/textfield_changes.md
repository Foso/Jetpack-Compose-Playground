# Handle changes to a TextField

!!! info
    This is the API of version alpha01. Newer versions may have a different one

In some cases, it’s useful to get the value of a textfield every time the text in a text field changes. For example, you might want to build a search screen with autocomplete functionality where you want to update the results as the user types.

With Compose you have the following options:

## Supply an onValueChange() callback to a BaseTextField

<p align="left">
  <img src ="../../images/TextFieldDemo.png"  />
</p>

```kotlin

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HandleTextFieldChanges() {
    var textState by remember { mutableStateOf(TextFieldValue()) }

    BaseTextField(value = textState, onValueChange = {
        textState = it
    })
}
```

The simplest approach is to supply an onValueChange() callback to a BaseTextField. Whenever the text changes, the callback is invoked.

In this example, every time the BaseTextField changes, the new text value will be saved in a state and set to the TextField and the Text.