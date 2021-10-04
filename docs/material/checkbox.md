<!---
This is the API of version 1.0.3
-->
# Checkbox

<p align="left">
  <img src ="{{ site.images }}/material/checkbox/CheckboxDemo.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun CheckBoxDemo() {
    val checkedState = remember { mutableStateOf(true) }
    Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it }
    )
}
```
<hr>

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#checkbox)
* [Full Example Code]({{ site.samplefolder }}/material/checkbox/CheckBoxDemo.kt)
