# RadioButton

!!! info
    This is the API of version 1.0.0-alpha08. Newer versions may have a different one

<p align="left">
  <img src ="../../images/material/radiobutton/RadioGroupExample.png" height=100 width=300 />
</p>

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


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#radiobutton)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/mysamples/github/material/radiobutton/RadioButtonSample.kt)
