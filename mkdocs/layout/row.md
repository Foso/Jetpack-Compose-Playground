# Row

A Row will show each children next to the previous children. It' similar to a LinearLayout with horizontal orientation.


<p align="left">
  <img src ="../../images/layout/row/RowExample.png" height=500 />
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

## How to align row childrens with equal width
```kotlin
@Composable
fun RowExample() {
    Row(arrangement = Arrangement.SpaceEvenly) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```

Row takes an **Arrangement** parameter. When you set it to **Arrangement.SpaceEvenly**, the children of Row will equal a width.

<p align="left">
  <img src ="../../images/layout/row/row_arrangement_space_evenly.png" />
</p>

## How to align row childrens in center
```kotlin
@Composable
fun RowExample() {
    Row(arrangement = Arrangement.Center) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```
Row takes an Arrangement parameter. When you set it to **Arrangement.Center**, the children of Row will aligned in the center of Row.

<p align="left">
  <img src ="../../images/layout/row/arrange_center.png" />
</p>

## How to align row childrens at end
```kotlin
@Composable
fun RowExample() {
    Row(arrangement = Arrangement.End) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```
Row takes an Arrangement parameter. When you set it to **Arrangement.End**, the children of Row will aligned at the end of Row.

<p align="left">
  <img src ="../../images/layout/row/arrangement_end.png" />
</p>


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/layout/package-summary#row)
* [Compose Academy/Row](https://compose.academy/academy/layout/row/)
