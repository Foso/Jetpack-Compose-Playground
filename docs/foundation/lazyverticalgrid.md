<!---
This is the API of version 1.0.4
-->

# LazyVerticalGrid


!!! warning
    Caution:  The API is still ***experimental***. Experimental APIs can change in the future or may be removed entirely.


Jetpack Compose provides an API for displaying grid or grid elements.

# Example

To arrange list items in a grid, ``LazyVerticalGrid`` provides a cells parameter that controls how cells are formed into columns.
The following example displays the items in a grid, using ``GridCells.Adaptive`` to set the width of each column at least 128.dp:



<p align="left">
  <img src ="{{ site.images }}/foundation/lazyverticalgrid/lazyverticalgrid.png" height=100 width=300 />
</p>

```kotlin
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyVerticalGridDemo(){
    val list = (1..10).map { it.toString() }

    LazyVerticalGrid(
        cells = GridCells.Adaptive(128.dp),

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ),
        content = {
            items(list.size) { index ->
                Card(
                    backgroundColor = Color.Red,
                    modifier = Modifier
                        .padding(4.dp)
                        .fillMaxWidth(),
                    elevation = 8.dp,
                ) {
                    Text(
                        text = list[index],
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    )
}
```

Apart from ``GridCells.Adaptive`` there are other types of cells that provide the number of columns per row. As follows
```
cels = GridCells.Fixed(2)
```
The above code will display 2 columns in 1 row.



## See also:
* [Official Docs]({{ site.composedoc }}/foundation/lazy/package-summary#LazyVerticalGrid)
* [Full Example Code]({{ site.samplefolder }}/foundation/LazyVerticalGridDemo.kt)