!!! info
    This is the API of version dev06. Newer versions may have a different one

<p align="left">
  <img src ="../../images/CheckboxDemo.png" height=500 />
</p>

```kotlin
@Composable
fun CheckBoxDemo() {
        val checkedState = state { true }
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
}
```