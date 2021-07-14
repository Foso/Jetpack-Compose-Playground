# TopAppBar

!!! info
    This is the API of 1.0.0-rc02


A TopAppBar displays information and actions relating to the current screen and is placed at the top of the screen.

<p align="center">
  <img src ="{{ site.images }}/material/topappbar/topappbar.png"  height=100 width=300/>
</p>

```kotlin
@Composable
fun TopAppBarSample(){
    Column {
        TopAppBar(
            elevation = 4.dp,
            title = {
                Text("I'm a TopAppBar")
            },
            backgroundColor =  MaterialTheme.colors.primarySurface,
            navigationIcon = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.ArrowBack, null)
                }
            }, actions = {
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Share, null)
                }
                IconButton(onClick = {/* Do Something*/ }) {
                    Icon(Icons.Filled.Settings, null)
                }
            })

        Text("Hello World")

    }
}
```

## See also:
* [Full Example Code]({{ site.samplefolder }}/material/appbar/topappbar/TopAppBarSample.kt)
