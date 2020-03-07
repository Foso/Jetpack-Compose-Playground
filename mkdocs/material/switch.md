!!! info
    This is the API of version dev06. Newer versions may have a different one
    
<p align="left">
  <img src ="../../images/SwtichDemo.png" height=500 />
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