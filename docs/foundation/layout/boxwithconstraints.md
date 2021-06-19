# BoxWithConstraints

!!! info
    This is the API of version 1.0.0-beta09

BoxWithConstraints is a layout similar to the [Box](../../../layout/box) layout, but it has the advantage that you can get the minimum/maximum available width and height for the Composable on the screen.
You can use it to show a different content depending on the available space.

Inside the scope of BoxWithConstraints you have access to the BoxWithConstraintsScope. With it you can get the **minWidth**, **maxWidth**, **minHeight**, **maxHeight** in dp and **constraints** in pixels.

## Example:
<p align="center">
  <img src ="../{{ site.images }}/foundation/layout/boxwithconstraints/boxwithconstraints.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun BoxWithConstraintsDemo() {
    Column {
        Column {
            MyBoxWithConstraintsDemo()
        }

        Text("Here we set the size to 150.dp", modifier = Modifier.padding(top = 20.dp))
        Column(modifier = Modifier.size(150.dp)) {
            MyBoxWithConstraintsDemo()
        }
    }
}

@Composable
private fun MyBoxWithConstraintsDemo() {
    BoxWithConstraints {
        val boxWithConstraintsScope = this
        //You can use this scope to get the minWidth, maxWidth, minHeight, maxHeight in dp and constraints

        Column {
            if (boxWithConstraintsScope.maxHeight >= 200.dp) {
                Text(
                    "This is only visible when the maxHeight is >= 200.dp",
                    style = TextStyle(fontSize = 20.sp)
                )
            }
            Text("minHeight: ${boxWithConstraintsScope.minHeight}, maxHeight: ${boxWithConstraintsScope.maxHeight},  minWidth: ${boxWithConstraintsScope.minWidth} maxWidth: ${boxWithConstraintsScope.maxWidth}")
        }
    }
}
```


## See also:
* [Official Docs]({{ site.composedoc }}/foundation/layout/package-summary#BoxWithConstraints(androidx.compose.ui.Modifier,androidx.compose.ui.Alignment,kotlin.Boolean,kotlin.Function1))
* [Full Example Code]({{ site.samplefolder }}/foundation/layout/BoxWithConstraintsExample.kt)
