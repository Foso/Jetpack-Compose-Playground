# Column

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
