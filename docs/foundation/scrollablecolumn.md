# ScrollableColumn

!!! warning
    ScrollableColumn/Row were deprecated. Using ScrollableColumn is less efficient comparing to LazyColumn when you have a large scrolling content because with LazyColumn we can only compose/measure/draw visible elements.
    To prevent users from going inefficient way we decided to deprecate ScrollableColumn and ScrollableRow and promote usages of
    LazyColumn and LazyRow instead. Users can still decide they don't need the lazy behaviour and use the modifiers directly like this:
    Column(Modifier.verticalScroll(rememberScrollState()))

    Use [LazyColumnFor](/foundation/lazycolumnfor)
    
    https://android-review.googlesource.com/c/platform/frameworks/support/+/1530328


When an app has layout content that might be longer than the height of the device and that content should be vertically scrollable, then we need to use a ScrollableColumn. It's similar to a ScrollView

<video width="320" height="300" align="center" controls>
    <source src="../../images/foundation/scrollablecolumn/VerticalScroller.webm" type="video/webm" align="center">
</video>

```kotlin
@Composable
fun ScrollableColumnDemo() {
    ScrollableColumn {
        //Only one child is allowed in a ScrollableColumn
        Column {
            for (i in 0..100) {
                Text("$i Hello World!", style =MaterialTheme.typography.body1)
            }
        }
    }
}
```

Note that a ScrollableColumn can only contain a single child element so if you need multiple things to be scrollable, you need to wrap that content into a layout as shown above.


### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/foundation/package-summary#scrollablecolumn)
* [Video](https://raw.githubusercontent.com/Foso/Jetpack-Compose-Playground/master/docs/images/foundation/verticalscroller/VerticalScroller.webm)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/foundation/scrollablecolumn/ScrollableColumnDemo.kt)
