# Switch

!!! info
    This is the API of version 1.0.0
    
<p align="left">
  <img src ="{{ site.images }}/material/switch/SwitchDemo.png" height=100 width=300 />
</p>


```kotlin
@Composable
fun SwitchDemo() {
    val checkedState = remember { mutableStateOf(true) }
    Switch(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it }
    )
}
```

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#switch)
* [Full Example Code]({{ site.samplefolder }}/material/switch/SwitchDemo.kt)
