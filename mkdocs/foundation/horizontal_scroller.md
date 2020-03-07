# HorizontalScroller

When an app has layout content that might be longer than the width of the device and that content should be horizontal scrollable, then we need to use a HorizontalScroller. It is the horizontal equivalent of [VerticalScroller](/foundation/vertical_scroller)

```kotlin

@Composable
fun HorizontalScrollerExample() {
    HorizontalScroller {
        //Only one child is allowed in a HorizontalScroller
        Row {
            for (i in 0..100) {
                Text("$i Hello World!", style =(MaterialTheme.typography()).body1)
            }
        }
    }
}
```