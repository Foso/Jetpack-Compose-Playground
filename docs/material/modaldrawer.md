<!---
This is the API of version 1.0.2
-->
# ModalDrawerLayout

With a ModalDrawer you can create a navigation drawer.

<p align="left">
  <img src ="{{ site.images }}/material/modaldrawer/modaldrawerClosed.png" height=100 width=300 />
  <img src ="{{ site.images }}/material/modaldrawer/ModaldrawerOpened.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ModalDrawerSample() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column {
                Text("Text in Drawer")
                Button(onClick = {
                    scope.launch {
                        drawerState.close()
                    }
                }) {
                    Text("Close Drawer")
                }
            }
        },
        content = {
            Column {
                Text("Text in Bodycontext")
                Button(onClick = {

                    scope.launch {
                        drawerState.open()
                    }

                }) {
                    Text("Click to open")
                }
            }
        }
    )
}
```

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#modaldrawerlayout)
* [Full Example Code]({{ site.samplefolder }}/material/modaldrawer/ModalDrawerLayoutSample.kt)
