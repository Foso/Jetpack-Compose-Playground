# VerticalScroller

!!! info
    This is the API of version dev07. Newer versions may have a different one

https://developer.android.com/reference/kotlin/androidx/ui/foundation/package-summary#verticalscroller

When an app has layout content that might be longer than the height of the device and that content should be vertically scrollable, then we need to use a VerticalScroller. It's similar to a ScrollView

<video width="320" height="240" controls>
  <source src="../../images/foundation/verticalscroller/VerticalScroller.webm" type="video/webm">
Your browser does not support the video tag.
</video>
https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/images/foundation/verticalscroller/VerticalScroller.webm

```kotlin
@Composable
fun VerticalScrollerExample() {
    VerticalScroller {
        //Only one child is allowed in a VerticalScroller
        Column {
            for (i in 0..100) {
                Text("$i Hello World!", style =(MaterialTheme.typography()).body1)
            }
        }
    }
}
```

Note that a VerticalScroller can only contain a single child element so if you need multiple things to be scrollable, you need to wrap that content into a layout as shown above.