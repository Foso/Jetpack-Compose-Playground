# ScrollableRow

!!! warning
    ScrollableColumn/Row were deprecated. Using ScrollableColumn is less efficient comparing to LazyColumn when you have a large scrolling content because with LazyColumn we can only compose/measure/draw visible elements. 
    To prevent users from going inefficient way we decided to deprecate ScrollableColumn and ScrollableRow and promote usages of 
    LazyColumn and LazyRow instead. Users can still decide they don't need the lazy behaviour and use the modifiers directly like this: 
    Column(Modifier.verticalScroll(rememberScrollState()))
    
    Use [LazyRowFor](/foundation/lazyrowfor)
    
    https://android-review.googlesource.com/c/platform/frameworks/support/+/1530328

When an app has layout content that might be longer than the width of the device and that content should be horizontal scrollable, then we need to use a ScrollableRow. It is the horizontal equivalent of [ScrollableColumn](/Jetpack-Compose-Playground/foundation/scrollablecolumn)

```kotlin
@Composable
fun ScrollableRowDemo() {
    ScrollableRow {
        //Only one child is allowed in a ScrollableRow
        Row {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style = (MaterialTheme.typography).body1)
            }
        }
    }
}
```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/package-summary#scrollablerow)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/foundation/scrollablerow/ScrollableRowDemo.kt)
