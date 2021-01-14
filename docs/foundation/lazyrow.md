# LazyRow

!!! info
    This is the API of version 1.0.0-alpha09. Newer versions may have a different one
    
A [LazyRow](https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/package-summary.html#LazyRowFor) is a horizontal scrolling list that only composes and lays out the currently visible items.
It's similar to a  horizontal Recyclerview in the classic Android View system.


<p align="left">
  <img src ="../../images/foundation/lazyrowfor/lazyrowfor.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun LazyRowDemo() {
    LazyRow( modifier = Modifier)
        items(items = listOf(
            "A", "B", "C", "D"
        ) + ((0..100).map { it.toString() }),  
            itemContent = { item ->
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


## items
This is the data of items that should be displayed. It expects a List of T

## modifier
Here you can specify some modifiers

## itemContent
This will be called every time a item from the **items**-List gets visible.
Then you can create your composable that should be displayed.  

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/package-summary#lazyrowfor)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/foundation/LazyRowForDemo.kt)
