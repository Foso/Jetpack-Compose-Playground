package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.compose.Recompose
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.Button

@Composable
fun recomposeDemo() {

    var countState = 0

    Recompose { recompose ->
        Column {
            Text("CountState is: " + countState)

            Button(onClick = { countState++ }) {
                Text("Count up")
            }

            Button(onClick = {
                 recompose()
            }) {
                Text("I want to recompose")
            }
        }
    }
}