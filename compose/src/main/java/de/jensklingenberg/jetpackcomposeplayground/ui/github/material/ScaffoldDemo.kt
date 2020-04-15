package de.jensklingenberg.jetpackcomposeplayground.ui.github.material

import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.material.*

@Composable
fun ScaffoldDemo() {
    val materialBlue700= Color(0xFF1976D2)

     Scaffold(
          scaffoldState = ScaffoldState(DrawerState.Opened),
          topAppBar = { TopAppBar(title = {Text("TopAppBar")},backgroundColor = materialBlue700)  },
          floatingActionButtonPosition = Scaffold.FabPosition.End,
          floatingActionButton = { FloatingActionButton(onClick = {}){
              Text("X")
          } },
          drawerContent = { Text(text = "drawerContent") },
          bodyContent = { Text("BodyContent") },
          bottomAppBar = { BottomAppBar(backgroundColor = materialBlue700) { Text("BottomAppBar") } }
      )
}
