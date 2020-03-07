You can use a PressGestureDetector to detect when a compose element gets pressed and released.

<p align="left">
  <img src ="../../images/PressGesturePressed.png" height=500 />
<img src ="../../images/PressGestureReleased.png" height=500 />
</p>

```kotlin
@Composable
fun PressGestureDetectorDemo() {

    val posX = state { 0f }
    val posXY = state { 0f }
    val clickState = state { "" }

    Column(modifier = LayoutWidth.Fill+LayoutHeight.Fill, arrangement = Arrangement.Center) {
        PressGestureDetector(
            onPress = { position ->
                posX.value = position.x.value
                posXY.value = position.y.value
                clickState.value = "Pressed"
            },
            onRelease = {
                clickState.value = "Released"
            }) {

            Column(modifier = LayoutWidth.Fill+LayoutHeight.Fill, arrangement = Arrangement.Center) {
                Text("ClickState: " + clickState.value)
                Text("PostitionX: ${posX.value}")
                Text("PostitionY: ${posXY.value}")
            }
        }
    }

}
```