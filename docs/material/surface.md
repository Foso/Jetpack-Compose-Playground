<!---
This is the API of version 1.1.0
-->
# Surface

# Example

<p align="left">
  <img src ="{{ site.images }}/material/surface/surfacedemo.png" height=100 width=300 />
</p>

```kotlin
@Composable
    fun SurfaceDemo() {
        Surface(
            modifier = Modifier.padding(8.dp),
            border = BorderStroke(2.dp, Color.Red),
            contentColor = Color.Blue,
            elevation = 8.dp,
            shape = CircleShape
        ) {
            Text("Hello World", modifier = Modifier.padding(8.dp))
        }
    }
```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#surface)
* [Full Example Code]({{ site.samplefolder }}/material/surface/SurfaceDemo.kt)
