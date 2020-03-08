# ModalDrawerLayout

!!! info
    This is the API of version dev06. Newer versions may have a different one

With a ModalDrawerLayout you can create a navigation drawer. You can define a drawer state and an onStateChange function.
You define the content of the drawer with **drawerContent** and the rest of your layout in **bodyContent**

<p align="left">
  <img src ="../../images/modaldrawerClosed.png" height=500 />
    <img src ="../../images/ModaldrawerOpened.png" height=500 />

</p>

```kotlin
@Composable
fun ModalDrawerLayoutSample() {
    val (state, onStateChange) = state { DrawerState.Closed }

    ModalDrawerLayout(
        drawerState = state,
        onStateChange = onStateChange,
        drawerContent = {
            Column {
                Text("Text in Drawer")
                Button(onClick = { onStateChange(DrawerState.Closed) }) {
                    Text("Close Drawer")
                }
            }
        },
        bodyContent = {
           Column {
               Text("Text in Bodycontext")
               Button(onClick = { onStateChange(DrawerState.Opened) }) {
                   Text("Click to open")
               }
           }
        }
    )
}
```