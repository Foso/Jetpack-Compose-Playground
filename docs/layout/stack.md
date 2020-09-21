# Stack

The children of the Stack layout will be stacked over each other. You can use the gravity modifier to specify where the composable should be drawn.

!!! info
    This is the API of version 1.0.0-alpha02. Newer versions may have a different one


<p align="center">
  <img src ="../../images/layout/stack/stackdemo.png" height=100 width=300 />
</p>


```kotlin
@Composable
fun StackExample() {
    Stack {
        Text("This text is drawn first", modifier = Modifier.gravity(Alignment.TopCenter))
        Box(
            Modifier.gravity(Alignment.TopCenter).fillMaxHeight().preferredWidth(
                50.dp
            ), backgroundColor = Color.Blue
        )
        Text("This text is drawn last", modifier = Modifier.gravity(Alignment.Center))
        FloatingActionButton(
            modifier = Modifier.gravity(Alignment.BottomEnd).padding(12.dp),
            onClick = {}
        ) {
            Text("+")
        }
    }
}
```

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary#stack)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/foundation/StackExample.kt)

