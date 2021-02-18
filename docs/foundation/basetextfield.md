# BaseTextField

!!! info
    This is the API of version 1.0.0-alpha12. Newer versions may have a different one

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
        TextField(value = textState, onValueChange = {
            textState = it
        })
        Text("The textfield has this text: " + textState.text)
    }

}
```

-------------
## See also:
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/mysamples/src/main/java/de/jensklingenberg/jetpackcomposeplayground/mysamples/github/foundation/basetextfield/BaseTextFieldDemo.kt)
