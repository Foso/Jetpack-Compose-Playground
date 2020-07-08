
# AdapterList

!!! info
    This is the API of version dev14. Newer versions may have a different one
    
A [AdapterList](https://developer.android.com/reference/kotlin/androidx/ui/foundation/package-summary#adapterlist 
) is a vertically scrolling list that only composes and lays out the currently visible items.


<p align="left">
  <img src ="../../images/foundation/AdapterList.png" />
</p>

```kotlin
@Composable
fun AdapterListDemo() {
    AdapterList(
        data = listOf(
            "A", "B", "C", "D"
        )+((0..100).map { it.toString() }),
        modifier = Modifier.None,
        itemCallback = {item->

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
        }
    )
}
```


## data
This is the data of items that should be displayed. It expects a List of T

## modifier
Here you can specify some modifiers

## itemCallback
This will be called every time a item from the **data**-List gets visible. 
Then you can create your composable that should be displayed.  

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/foundation/package-summary#adapterlist)
