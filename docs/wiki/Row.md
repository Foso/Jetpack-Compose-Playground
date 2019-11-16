# Row
<p align="left">
  <img src ="https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/screenshots/RowExample.png" height=500 />
</p>

```kotlin
@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Row]
         */
fun RowDemo() {
    CraneWrapper {
        MaterialTheme {
            RowExample()
        }
    }
}

@Composable
fun RowExample() {
    Row {
        Text(text = " Hello World!", style = +themeTextStyle { body1 })
        Text(text = " Hello World!2", style = +themeTextStyle { body1 })
    }
}
```
