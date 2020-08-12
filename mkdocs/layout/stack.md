# Stack

The children of the Stack layout will be stacked over each other. You can use the LayoutGravity modifier to specify where the composable should be drawn.

!!! info
    This is the API of version dev16. Newer versions may have a different one


<p align="left">
  <img src ="../../images/layout/stack/StackExample.png" height=500 />
</p>


```kotlin
@Composable
fun StackExample() {
   Stack() {
           Text("This text is drawed first",modifier = Modifier.gravity(Alignment.TopCenter))
           Box(Modifier.gravity(Alignment.TopCenter) + Modifier.fillMaxHeight() + Modifier.preferredWidth(
               50.dp
           ), backgroundColor = Color.Blue)
           Text("This text is drawed last",modifier = Modifier.gravity(Alignment.Center))
           FloatingActionButton(
               contentColor =  Color.Blue,modifier = Modifier.gravity(Alignment.BottomEnd) + Modifier.padding(12.dp),onClick = {}
           ){
               Text("x")
           }
       }
}
```