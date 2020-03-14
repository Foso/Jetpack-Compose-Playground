# Stack

The children of the Stack layout will be stacked over each other. You can use the LayoutGravity modifier to specify where the composable should be drawn.

!!! info
    This is the API of version dev06. Newer versions may have a different one


<p align="left">
  <img src ="../../images/layout/stack/StackExample.png" height=500 />
</p>


```kotlin
@Composable
fun StackExample() {
    Stack() {
            Text("This text is drawed first",modifier = LayoutGravity.TopCenter)
            Box(LayoutGravity.TopCenter +LayoutHeight.Fill+LayoutWidth(50.dp), backgroundColor = Color.Blue)
            Text("This text is drawed last",modifier = LayoutGravity.Center)
            FloatingActionButton(
                text = "+",
                color = Color.Blue,modifier = LayoutGravity.BottomEnd+ LayoutPadding(12.dp)
            )
        }
}
```