# VerticalScroller
When an app has layout content that might be longer than the height of the device and that content should be vertically scrollable, then we need to use a VerticalScroller.

https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/samples/layout/ScrollerExample.kt

```kotlin
/**
 * A container that composes all of its contents and lays it out, fitting the width of the child.
 * If the child's height is less than the [Constraints.maxHeight], the child's height is used,
 * or the [Constraints.maxHeight] otherwise. If the contents don't fit the height, the drag gesture
 * allows scrolling its content vertically. The contents of the VerticalScroller are clipped to
 * the VerticalScroller's bounds.
 */
```

```kotlin
@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/VerticalScroller]
         */
fun VerticalScrollerDemo() {
    CraneWrapper {
        MaterialTheme {
            VerticalScrollerExample()
        }
    }
}

@Composable
fun VerticalScrollerExample() {
    VerticalScroller {
        //Only one child is allowed in a VerticalScroller
        Column {
            for (i in 0..6) {
                Text(text = "Hello World!", style = +themeTextStyle { h1 })
            }
        }
    }
}
```

Note that a VerticalScroller can only contain a single child element so if you need multiple things to be scrollable, you need to wrap that content into a layout as shown above.