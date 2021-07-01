# FloatingActionButton

!!! info
    This is the API of version 1.0.0-rc01

## FloatingActionButton


```kotlin
fun FloatingActionButtonDemo() {
    FloatingActionButton(onClick = { /*do something*/}) {
        Text("FloatingActionButton")
    }
}
```

<p align="center">
  <img src ="{{ site.images }}/material/floatingactionbutton/fab.png" height=100 width=300 />
</p>

## ExtendedFloatingActionButton

```kotlin
@Composable
fun ExtendedFloatingActionButtonDemo() {
    ExtendedFloatingActionButton(
        icon = { Icon(Icons.Filled.Favorite,"") },
        text = { Text("FloatingActionButton") },
        onClick = { /*do something*/ },
        elevation = FloatingActionButtonDefaults.elevation(8.dp)
    )
}
```

<p align="center">
  <img src ="{{ site.images }}/material/floatingactionbutton/exfab.png" height=100 width=300 />
</p>

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#floatingactionbutton)
* [Full Example Code]({{ site.samplefolder }}/material/floatingactionbutton/FabDemo.kt)