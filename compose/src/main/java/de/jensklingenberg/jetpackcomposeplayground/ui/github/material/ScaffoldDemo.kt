package de.jensklingenberg.jetpackcomposeplayground.ui.github.material

import androidx.compose.foundation.Text
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun ScaffoldDemo() {
    val materialBlue700= Color(0xFF1976D2)

     Scaffold(
          //scaffoldState = ScaffoldState(DrawerValue.Open),
          topBar = { TopAppBar(title = {Text("TopAppBar")},backgroundColor = materialBlue700)  },
         // floatingActionButtonPosition = Scaffold.FabPosition.End,
          floatingActionButton = { FloatingActionButton(onClick = {}){
              Text("X")
          } },
          drawerContent = { Text(text = "drawerContent") },
          bodyContent = { Text("BodyContent") },
          bottomBar = { BottomAppBar(backgroundColor = materialBlue700) { Text("BottomAppBar") } }
      )
}
