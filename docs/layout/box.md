# Box

The children of the Box layout will be stacked over each other. You can use the gravity modifier to specify where the composable should be drawn.

!!! info
    This is the API of version 1.0.0-alpha10. Newer versions may have a different one


<p align="center">
  <img src ="../../images/layout/box/stackdemo.png" height=100 width=300 />
</p>


```kotlin
@Composable
fun BoxExample() {
    Box(Modifier.fillMaxSize()) {
        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
        Box(
                Modifier.align(Alignment.TopCenter).fillMaxHeight().preferredWidth(
                        50.dp
                ).background( Color.Blue)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
        FloatingActionButton(
                modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp),
                onClick = {}
        ) {
            Text("+")
        }
    }
}
```

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary#Box)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/layout/BoxExample.kt)

