package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.floatingactionbutton

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun FloatingActionButtonDemo() {
    FloatingActionButton(onClick = { /*do something*/}) {
        Text("FloatingActionButton")
    }
}

@Composable
fun ExtendedFloatingActionButtonDemo() {
    ExtendedFloatingActionButton(
        icon = { Icon(Icons.Filled.Favorite,"") },
        text = { Text("FloatingActionButton") },
        onClick = { /*do something*/ },
        elevation = FloatingActionButtonDefaults.elevation(8.dp)
    )
}

