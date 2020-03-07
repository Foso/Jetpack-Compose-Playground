# Draggable 

https://developer.android.com/reference/kotlin/androidx/ui/foundation/gestures/package-summary#draggable

<p align="left">
  <img src ="../../images/DraggableDemo.png" height=500 />
</p>

```kotlin
@Composable
fun DraggableDemo(){

    val max = 300.dp
    val min = 0.dp
    val (minPx, maxPx) = with(DensityAmbient.current) {
        min.toPx().value to max.toPx().value
    }
    val position = animatedFloat(0f)
    position.setBounds(minPx, maxPx)
    
    Draggable(DragDirection.Horizontal,position,{ position.snapTo(it) }) {
        // dragValue is the current value in progress of dragging
        val draggedDp = with(DensityAmbient.current) {
            position.value.toDp()
        }

        Column {
                Text("Drag me ",modifier = LayoutPadding(start=draggedDp))
            Text("Dragvalue: "+position.value.dp)
        }
    }
}
```