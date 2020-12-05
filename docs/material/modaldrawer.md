# ModalDrawerLayout

!!! info
    This is the API of version 1.0.0-alpha08. Newer versions may have a different one

With a ModalDrawerLayout you can create a navigation drawer.

<p align="left">
  <img src ="../../images/material/modaldrawer/modaldrawerClosed.png" height=100 width=300 />
  <img src ="../../images/material/modaldrawer/ModaldrawerOpened.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ModalDrawerLayoutSample() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    ModalDrawerLayout(
            drawerState = drawerState,
            drawerContent = {
                Column {
                    Text("Text in Drawer")
                    Button(onClick = { drawerState.close() }) {
                        Text("Close Drawer")
                    }
                }
            },
            bodyContent = {
                Column {
                    Text("Text in Bodycontext")
                    Button(onClick = { drawerState.open() }) {
                        Text("Click to open")
                    }
                }
            }
    )
}
```

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#modaldrawerlayout)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/material/modaldrawer/ModalDrawerLayoutSample.kt)
