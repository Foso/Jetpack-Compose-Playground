# BaseTextField

!!! info
    This is the API of version 1.0.0-alpha03. Newer versions may have a different one

BaseTextField can be used to insert text. See [TextField](../material/textfield.md) for a material version.

<p align="center">
  <img src ="../../images/foundation/basetextfield/basetextfield.png"  />
</p>

```kotlin
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BaseTextFieldDemo() {
    var textState by remember { mutableStateOf(TextFieldValue()) }

    Column {
        BaseTextField(value = textState, onValueChange = {
            textState = it
        })
        Text("The textfield has this text: " + textState.text)
    }

}
```

<hr>
## See also:
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/material/basetextfield/BaseTextFieldDemo.kt)
