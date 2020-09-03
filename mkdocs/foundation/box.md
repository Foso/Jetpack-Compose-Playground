# Box

WIP
!!! info
    This is the API of version 1.0.0-alpha02. Newer versions may have a different one
    
<p align="left">
  <img src ="../../images/foundation/box/box.png" />
</p>

```kotlin
@Composable
fun BoxDemo(){
    Column(modifier = Modifier.fillMaxWidth() + Modifier.wrapContentSize(Alignment.Center)) {
        Box(
            modifier = Modifier.preferredSize(100.dp),
            backgroundColor = Color.Red,
            shape = RectangleShape
        ) {}
    }
}
```