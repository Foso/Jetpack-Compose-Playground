package de.jensklingenberg.jetpackcomposeplayground.ui.github.layout

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun BoxExample() {
    Stack {
        Text("This text is drawn first", modifier = Modifier.gravity(Alignment.TopCenter))
        Box(
            Modifier.gravity(Alignment.TopCenter).fillMaxHeight().preferredWidth(
                50.dp
            ), backgroundColor = Color.Blue
        )
        Text("This text is drawn last", modifier = Modifier.gravity(Alignment.Center))
        FloatingActionButton(
            modifier = Modifier.gravity(Alignment.BottomEnd).padding(12.dp),
            onClick = {}
        ) {
            Text("+")
        }
    }
}

/**
 * alpha05
@Composable
fun BoxExample() {
    Box(Modifier.fillMaxSize()) {
        Text("This text is drawn first", modifier = Modifier.align(Alignment.TopCenter))
        Box(
            Modifier.align(Alignment.TopCenter).fillMaxHeight().preferredWidth(
                50.dp
            ).background( Color.Blue)
        )
        Text("This text is drawn last", modifier = Modifier.align(Alignment.Center))
        FloatingActionButton(
            modifier = Modifier.align(Alignment.BottomEnd).padding(12.dp),
            onClick = {}
        ) {
            Text("+")
        }
    }
}
*/