# Column

!!! info
    This is the API of version dev16. Newer versions may have a different one

A Column will show each children below the previous children. It' similar to a LinearLayout with vertical orientation.

<p align="left">
  <img src ="../../images/layout/column/ColumnExample.png" height=500 />
</p>

```kotlin
@Composable
fun ColumnExample() {
    Column {
        Text("Hello World!")
        Text("Hello World!2")
    }
}

```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/layout/package-summary#column)
* [Compose Academy/Column](https://compose.academy/academy/layout/column/)
