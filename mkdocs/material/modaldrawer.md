# ModalDrawerLayout

!!! info
    This is the API of version 1.0.0-alpha02. Newer versions may have a different one

With a ModalDrawerLayout you can create a navigation drawer. You can define a drawer state and an onStateChange function.
You define the content of the drawer with **drawerContent** and the rest of your layout in **bodyContent**

<p align="left">
  <img src ="../../images/modaldrawerClosed.png" height=100 width=300 />
    <img src ="../../images/ModaldrawerOpened.png" height=100 width=300 />

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