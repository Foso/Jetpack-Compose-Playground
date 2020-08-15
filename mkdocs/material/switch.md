# Switch

!!! info
    This is the API of version dev16. Newer versions may have a different one
    
<p align="left">
  <img src ="../../images/material/switch/SwitchDemo.png" height=100 width=300 />
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