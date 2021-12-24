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


## Content Arrangement
### Horizontal

You can use **horizontalArrangement** to set the horizontal arrangement of the content in the Row

=== "Arrangement.SpaceEvenly"

    <p align="left">
      <img src ="{{ site.images }}/layout/row/row_arrangement_space_evenly.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    @Composable
    fun RowExample() {
        Row(horizontalArrangement = Arrangement.SpaceEvenly) {
            Text("Hello World!")
            Text("Hello World!2")
        }
    }
    ```

=== "Arrangement.Center"

    <p align="left">
      <img src ="{{ site.images }}/layout/row/arrange_center.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    @Composable
    fun RowExample() {
        Row(horizontalArrangement = Arrangement.Center) {
            Text("Hello World!")
            Text("Hello World!2")
        }
    }
    ```


=== "Arrangement.End"

    <p align="left">
      <img src ="{{ site.images }}/layout/row/arrangement_end.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    @Composable
    fun RowExample() {
        Row(horizontalArrangement = Arrangement.End) {
            Text("Hello World!")
            Text("Hello World!2")
        }
    }
    ```


## See also:
* [Official Docs]({{ site.composedoc }}/foundation/layout/package-summary#row)
* [Full Example Code]({{ site.samplefolder }}/layout/RowExample.kt)
