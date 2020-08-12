# RadioButton

!!! info
    This is the API of version dev16. Newer versions may have a different one

<p align="left">
  <img src ="../../images/material/radiogroup/RadioGroupExample.png" height=500 />
</p>

```kotlin
@Composable
fun RadioGroupSample() {
    val radioOptions = listOf("A", "B", "C")
    val (selectedOption, onOptionSelected) = state { radioOptions[1] }
    Column {
        radioOptions.forEach { text ->
            Row(Modifier
                    .fillMaxWidth()
                    .selectable(
                            selected = (text == selectedOption),
                            onClick = {
                                onOptionSelected
                                (text)
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