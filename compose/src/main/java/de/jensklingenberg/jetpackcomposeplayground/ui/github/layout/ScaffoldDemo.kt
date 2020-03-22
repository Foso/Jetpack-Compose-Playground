package de.jensklingenberg.jetpackcomposeplayground.ui.github.layout

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.graphics.Color
import androidx.ui.material.*
import androidx.ui.unit.dp

@Composable
fun ScaffoldDemo() {
    val materialBlue700= Color(0xFF1976D2)

     Scaffold(
          scaffoldState = ScaffoldState(DrawerState.Opened),
          topAppBar = { TopAppBar(title = {Text("TopAppBar")},color = materialBlue700)  },
          floatingActionButtonPosition = Scaffold.FabPosition.End,
          floatingActionButton = { FloatingActionButton(text = "X", elevation = 8.dp,onClick = {}) },
          drawerContent = { Text(text = "drawerContent") },
          bodyContent = { Text("BodyContent") },
          bottomAppBar = { BottomAppBar(color = materialBlue700) { Text("BottomAppBar") } }
      )
}
