<!---
This is the API of version 1.0.5
-->
# Row

A Row will show each child next to the previous children. It's similar to a LinearLayout with a horizontal orientation.


<p align="left">
  <img src ="{{ site.images }}/layout/row/RowExample.png" height=100 width=300 />
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
    Row(horizontalArrangement = Arrangement.SpaceEvenly) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```

Row takes an **horizontalArrangement** parameter. When you set it to **Arrangement.SpaceEvenly**, the children of Row will equal a width.

<p align="left">
  <img src ="{{ site.images }}/layout/row/row_arrangement_space_evenly.png" />
</p>

## How to align row childrens in center
```kotlin
@Composable
fun RowExample() {
    Row(horizontalArrangement = Arrangement.Center) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```
Row takes an Arrangement parameter. When you set it to **Arrangement.Center**, the children of Row will be aligned in the center of Row.

<p align="left">
  <img src ="{{ site.images }}/layout/row/arrange_center.png" />
</p>

## How to align row childrens at end
```kotlin
@Composable
fun RowExample() {
    Row(horizontalArrangement = Arrangement.End) {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```
Row takes an Arrangement parameter. When you set it to **Arrangement.End**, the children of Row will be aligned at the end of Row.

<p align="left">
  <img src ="{{ site.images }}/layout/row/arrangement_end.png" />
</p>


## See also:
* [Official Docs]({{ site.composedoc }}/foundation/layout/package-summary#row)
* [Full Example Code]({{ site.samplefolder }}/layout/RowExample.kt)
