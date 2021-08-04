# Box

The children of the Box layout will be stacked over each other. You can use the align modifier to specify where the composable should be drawn.

!!! info
    This is the API of version 1.0.1


<p align="center">
  <img src ="{{ site.images }}/layout/box/boxdemo.png" height=100 width=300 />
</p>


```kotlin
@Composable
fun BoxExample() {
    Box(Modifier.fillMaxSize()) {
        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
        Box(
            Modifier.align(Alignment.TopCenter).fillMaxHeight().width(
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
* [Official Docs]({{ site.composedoc }}/foundation/layout/package-summary#Box)
* [Full Example Code]({{ site.samplefolder }}/layout/BoxExample.kt)

