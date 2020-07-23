package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout

import androidx.compose.Composable

import androidx.ui.foundation.Text
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme


@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Row]
         */
fun RowDemo() {
    MaterialTheme {
        RowExample()
    }

}

@Composable
fun RowExample() {
    Row {
        Text(text = " Hello World!", style = (MaterialTheme.typography).body1)
        Text(text = " Hello World!2", style = (MaterialTheme.typography).body1)
    }
}