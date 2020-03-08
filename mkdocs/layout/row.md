# Row

A Row will show each children next to the previous children. It' similar to a LinearLayout with horizontal orientation.


<p align="left">
  <img src ="../../images/RowExample.png" height=500 />
</p>

```kotlin
@Composable
fun RowExample() {
    Row {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```
