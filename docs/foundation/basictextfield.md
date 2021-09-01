<!---
This is the API of version 1.0.2
-->

# BasicTextField

BasicTextField can be used to insert text. See [TextField](../material/textfield.md) for a material version.

<p align="center">
  <img src ="{{ site.images }}/foundation/basictextfield/basictextfield.png"  />
</p>

```kotlin
@Composable
fun BasicTextFieldDemo() {
    var textState by remember { mutableStateOf(TextFieldValue("Hello World")) }
    Column {
        BasicTextField(value = textState, onValueChange = {
            textState = it
        })
        Text("The textfield has this text: " + textState.text)
    }
}
```

-------------
## See also:
* [Full Example Code]({{ site.samplefolder }}/foundation/basictextfield/BasicTextFieldDemo.kt)
