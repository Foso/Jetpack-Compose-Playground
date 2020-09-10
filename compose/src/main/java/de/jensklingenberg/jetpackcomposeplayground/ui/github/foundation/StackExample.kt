package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Stack
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.material.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Preview(showBackground = true)
@Composable
fun StackExample() {
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