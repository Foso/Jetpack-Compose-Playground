# Scaffold

A Scaffold is a layout which implements the basic material design layout structure. You can add things like a TopBar, BottomBar, FAB or a Drawer.

```kotlin
@Composable
fun ScaffoldDemo() {
    val materialBlue700= Color(0xFF1976D2)
     Scaffold(
          scaffoldState = ScaffoldState(DrawerState.Opened),
          topAppBar = { TopAppBar(title = {Text("TopAppBar")},color = materialBlue700)  },
          floatingActionButtonPosition = Scaffold.FabPosition.End,
          floatingActionButton = { FloatingActionButton(text = "X") },
          drawerContent = { Text(text = "drawerContent") },
          bodyContent = { Text("BodyContent") },
          bottomAppBar = { BottomAppBar(color = materialBlue700) { Text("BottomAppBar") } }
      )
}
```

<p align="left">
  <img src ="../../images/layout/scaffold/scaffold.png" height="500"  />
  <img src ="../../images/layout/scaffold/scaffoldwithdrawer.png" height="500"  />

</p>


## scaffoldState
With the scaffoldState you can set the opening state of the drawer(DrawerState.Opened or DrawerState.Closed)


## topAppBar

<p align="left">
  <img src ="../../images/layout/scaffold/topappbar.png"  />
</p>

Here you can set the part of your layout that should be displayed on top of the screen. You can use it for things like a toolbar. You can set any Composable, but **TopAppBar** is already made for this usecase.

## floatingActionButton
<p align="left">
  <img src ="../../images/layout/scaffold/floatingactionbutton.png"  />
</p>
Here you can add FloatingActionButton. You can set any Composable, but **FloatingActionButton** is already made for this usecase

## floatingActionButtonPosition
When you have added a FAB, you can use this specify the position of it. The default position is at the end of your layout.
 
## drawerContent
Here you can set the content of your drawer.

## bodyContent
This is the primary content of the scaffold. You can add any Composable here.

## bottomAppBar

<p align="left">
  <img src ="../../images/layout/scaffold/bottomappbar.png"  />
</p>

Here you can set the part of your layout is on bottom of the screen. You can set any Composable, but **BottomAppBar** is already made for this usecase.