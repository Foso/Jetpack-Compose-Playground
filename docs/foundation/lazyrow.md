<!---
This is the API of version 1.1.1
-->

# LazyRow

A [LazyRow]({{ site.composedoc }}/foundation/lazy/package-summary#lazyrow) is a horizontal scrolling list that only composes and lays out the currently visible items.
It's similar to a horizontal Recyclerview in the classic Android View system.


<p align="left">
  <img src ="{{ site.images }}/foundation/lazyrow/lazyrow.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun LazyRowDemo() {
    val list = listOf(
        "A", "B", "C", "D"
    ) + ((0..100).map { it.toString() })
    LazyRow(modifier = Modifier.fillMaxHeight()) {
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
* [Official Docs]({{ site.composedoc }}/foundation/lazy/package-summary#lazyrow)
* [Full Example Code]({{ site.samplefolder }}/foundation/LazyRowDemo.kt)

<iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/1ANt65eoNhQ" title="Lazy layouts in Compose" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
