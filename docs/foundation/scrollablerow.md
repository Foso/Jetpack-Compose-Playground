# ScrollableRow

!!! info
    This is the API of version 1.0.0-alpha08. Newer versions may have a different one

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
