!!! info
    This is the API of version dev14. Newer versions may have a different one
    
<p align="left">
  <img src ="../../images/material/switch/SwitchDemo.png" height=500 />
</p>


```kotlin
@Composable
fun SwitchDemo() {
        val checkedState = state { true }
        Switch(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
}
```