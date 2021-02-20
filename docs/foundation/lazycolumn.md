# LazyColumn

!!! info
    This is the API of version 1.0.0-alpha12. Newer versions may have a different one
    
A [LazyColumn](https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/package-summary#lazycolumn) is a vertically scrolling list that only composes and lays out the currently visible items.
It's similar to a Recyclerview in the classic Android View system.

<p align="left">
  <img src ="{{ site.images }}/foundation/lazycolumnitems.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun LazyColumnDemo() {
    val list = listOf(
        "A", "B", "C", "D"
    ) + ((0..100).map { it.toString() })
    LazyColumn(modifier = Modifier.fillMaxHeight()) {
        items(items = list, itemContent = { item ->
            Log.d("COMPOSE", "This get rendered $item")
            when (item) {
                "A" -> {
                    Text(text = item, style = TextStyle(fontSize = 80.sp))
                }
                "B" -> {
                    Button(onClick = {}) {
                        Text(text = item, style = TextStyle(fontSize = 80.sp))
                    }
                }
                "C" -> {
                    //Do Nothing
                }
                "D" -> {
                    Text(text = item)
                }
                else -> {
                    Text(text = item, style = TextStyle(fontSize = 80.sp))
                }
            }
        })
    }
}
```

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/package-summary#lazycolumn)
* [Full Example Code]({{ site.samplefolder }}/foundation/LazyColumnDemo.kt)
