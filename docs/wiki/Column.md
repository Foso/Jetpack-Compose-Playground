# Column
<p align="left">
  <img src ="https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/screenshots/ColumnExample.png" height=500 />
</p>

```kotlin
@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Column]
         */
fun ColumnDemo() {
    CraneWrapper {
        MaterialTheme {
            ColumnExample()
        }
    }
}

@Composable
fun ColumnExample() {
    Column {
        Text(text = " Hello World!", style = +themeTextStyle { body1 })
        Text(text = " Hello World!2", style = +themeTextStyle { body1 })
    }
}
```