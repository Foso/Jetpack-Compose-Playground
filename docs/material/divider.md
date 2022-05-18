<!---
This is the API of version 1.1.1
-->
# Divider

A divider is a thin line that groups content in lists and layouts.

<p align="center">
  <img src ="{{ site.images }}/material/divider/divider.png"  />
</p>

``` kotlin
@Composable
fun DividerExample(){
    Column {
        Text("Foo")
        Divider(startIndent = 8.dp, thickness = 1.dp, color = Color.Black)
        Text("Bar")
    }
}
```

## See also:
* [Material.io](https://material.io/components/divider)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#divider)
* [Full Example Code]({{ site.samplefolder }}/material/divider/DividerDemo.kt)
