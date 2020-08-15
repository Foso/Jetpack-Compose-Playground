# Canvas

!!! info
    This is the API of version dev09. Newer versions may have a different one

## How to draw on Canvas

<p align="left">
  <img src ="../../images/foundation/canvas/CanvasDrawExample.png" height=100 width=300 />
</p>



```kotlin
@Composable
fun CanvasDrawExample() {
  Canvas(modifier = Modifier.preferredHeight(60.dp)) {
      val paint = Paint()
      val centerY = 0f

      // draw rect
      paint.color = Color.Blue
      drawRect(
          Rect(
              0f,
              centerY + 10,
              size.width.value,
              55f
          ),
          paint
      )

      // draw circle
      drawCircle(
          Offset(50f, 200f), 40f, paint
      )

      //Draw a line
      paint.color = Color.Red
      paint.strokeWidth = 5f
      drawLine(
          Offset(20f, 0f),
          Offset(200f, 200f),
          paint
      )

  }
}


```