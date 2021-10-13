<!---
This is the API of version 1.0.4
-->
# RadioButton

Radio buttons allow users to select one option from a set.

<p align="left">
  <img src ="{{ site.images }}/material/radiobutton/radiobutton.png" height=100 width=300 style="border: 1px solid black;" />
</p>

## Example

```kotlin
@Composable
fun RadioButtonSample() {
    val radioOptions = listOf("A", "B", "C")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1] ) }
    Column {
        radioOptions.forEach { text ->
            Row(
                Modifier
                .fillMaxWidth()
                .selectable(
                    selected = (text == selectedOption),
                    onClick = {
                        onOptionSelected(text)
                    }
                )
                .padding(horizontal = 16.dp)
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) }
                )
                Text(
                    text = text,
                    style = MaterialTheme.typography.body1.merge(),
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}
```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#radiobutton)
* [Full Example Code]({{ site.samplefolder }}/material/radiobutton/RadioButtonSample.kt)
