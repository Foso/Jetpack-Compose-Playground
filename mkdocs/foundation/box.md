# Box

WIP

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