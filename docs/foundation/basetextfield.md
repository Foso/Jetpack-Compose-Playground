# BaseTextField

!!! info
    This is the API of version 1.0.0

BaseTextField can be used to insert text. See [TextField](../material/textfield.md) for a material version.

<p align="center">
  <img src ="{{ site.images }}/foundation/basetextfield/basetextfield.png"  />
</p>

```kotlin
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
* [Full Example Code]({{ site.samplefolder }}/foundation/basetextfield/BaseTextFieldDemo.kt)
