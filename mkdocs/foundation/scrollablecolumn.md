# ScrollableColumn

!!! info
    This is the API of version dev15. Newer versions may have a different one


When an app has layout content that might be longer than the height of the device and that content should be vertically scrollable, then we need to use a ScrollableColumn. It's similar to a ScrollView

<video width="320" height="300" align="center" controls>
  <source src="https://raw.githubusercontent.com/Foso/Jetpack-Compose-Playground/master/docs/images/foundation/verticalscroller/VerticalScroller.webm" type="video/webm">
</video>

```kotlin
@Composable
fun ScrollableColumnExample() {
    ScrollableColumn {
        //Only one child is allowed in a ScrollableColumn
        Column {
            for (i in 0..100) {
                Text("$i Hello World!", style =(MaterialTheme.typography()).body1)
            }
        }
    }
}
```

Note that a ScrollableColumn can only contain a single child element so if you need multiple things to be scrollable, you need to wrap that content into a layout as shown above.


### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/foundation/package-summary#scrollablecolumn)
* [Video](https://raw.githubusercontent.com/Foso/Jetpack-Compose-Playground/master/docs/images/foundation/verticalscroller/VerticalScroller.webm)
