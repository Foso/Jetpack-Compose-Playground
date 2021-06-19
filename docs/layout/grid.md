# Grid

!!! info
    This is the API of version 1.0.0-beta09

Jetpack Compose provides an API for displaying grid or grid elements. With Composable ``LazyVerticalGrid`` you can create a grid view even though until this article was written this API is still ***experimental*** or not yet stable.

To arrange cells or boxes in a grid, ``LazyVerticalGrid`` provides a cells parameter that controls how cells are formed into columns. The following example displays the items in a grid, using ``GridCells.Adaptive`` to set the width of each column at least 128.dp:

```kotlin
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PhotoGrid(photos: List<Photo>) {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 128.dp)
    ) {
        items(photos) { photo ->
            PhotoItem(photo)
        }
    }
}
```

![](https://ik.imagekit.io/u8uufhbnoej/blog/jetpack-compose-tutorial/grid/lazy_grid_Zb8o6L-uQG4d.png)

Apart from ``GridCells.Adaptive`` there are other types of cells that provide the number of columns per row. As follows
```
cels = GridCells.Fixed(2)
```
The above code will display 2 columns in 1 row.