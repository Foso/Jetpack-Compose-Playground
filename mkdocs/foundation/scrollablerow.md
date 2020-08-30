# ScrollableRow

!!! info
    This is the API of version alpha01. Newer versions may have a different one

When an app has layout content that might be longer than the width of the device and that content should be horizontal scrollable, then we need to use a ScrollableRow. It is the horizontal equivalent of [ScrollableColumn](/Jetpack-Compose-Playground/foundation/scrollablecolumn)

```kotlin

@Composable
fun ScrollableRowExample() {
    ScrollableRow(children = {
        //Only one child is allowed in a VerticalScroller
        Row {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style =(MaterialTheme.typography).body1)
            }
        }
    })
}
```