# Canvas

!!! info
    This is the API of version 1.0.0-alpha12. Newer versions may have a different one

## How to draw on Canvas

<p align="left">
  <img src ="{{ site.images }}/foundation/canvas/CanvasDrawExample.png" height=100 width=300 />
</p>

```kotlin
@Preview(showBackground = true)
@Composable
fun CanvasDrawExample() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(Color.Blue, topLeft = Offset(0f, 0f), size = Size(this.size.width, 55f))
        drawCircle(Color.Red, center = Offset(50f, 200f), radius = 40f)
        drawLine(
            Color.Green, Offset(20f, 0f),
            Offset(200f, 200f), strokeWidth = 5f
        )

        drawArc(
            Color.Black,
            0f,
            60f,
            useCenter = true,
            size = Size(300f, 300f),
            topLeft = Offset(60f, 60f)
        )
    }
}
```

## See also:
* [Full Example Code]({{ site.samplefolder }}/foundation/CanvasDrawExample.kt)
