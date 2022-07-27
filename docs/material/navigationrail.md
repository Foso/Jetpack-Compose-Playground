<!---
This is the API of version 1.2.0
-->
# Navigation Rail 

"Navigation rails provide ergonomic movement between primary destinations in apps." 

# Example
<div>
<video height="500" align="center" controls>
  <source src="{{ site.images }}/material/navigationrail/navigationRail.webm" type="video/webm" align="center">
</video>
</div>

``` kotlin
enum class Page(val title:String, val content: String){
    HOME("home","Show only icon"),
    SEARCH("Search","Show icon with label"),
    SETTINGS("Settings","Show icon /Show the label only when selected")
}

@Composable
fun NavigationRailSample() {
    var selectedItem by remember { mutableStateOf(0) }
    val pages = Page.values()
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Search, Icons.Filled.Settings)
    Row {
        NavigationRail {
            pages.forEachIndexed { index, item ->
                when(item){
                    Page.HOME -> {
                        NavigationRailItem(
                            icon = { Icon(icons[index], contentDescription = "") },
                            selected = selectedItem == index,
                            onClick = { selectedItem = index }
                        )
                    }
                    Page.SEARCH -> {
                        NavigationRailItem(
                            label = { Text(item.title) },
                            icon = { Icon(icons[index], contentDescription = "") },
                            selected = selectedItem == index,
                            onClick = { selectedItem = index }
                        )
                    }
                    Page.SETTINGS -> {
                        NavigationRailItem(
                            label = { Text(item.title) },
                            icon = { Icon(icons[index], contentDescription = "") },
                            selected = selectedItem == index,
                            onClick = { selectedItem = index },
                            alwaysShowLabel = false
                        )
                    }
                }
            }
        }

        Text(pages[selectedItem].content, Modifier.padding(start = 8.dp))
    }
}
```

## See also:
* [Material.io](https://material.io/components/navigation-rail)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#NavigationRail)
* [Full Example Code]({{ site.samplefolder }}/material/navigationrail/NavigationRailSample.kt)
