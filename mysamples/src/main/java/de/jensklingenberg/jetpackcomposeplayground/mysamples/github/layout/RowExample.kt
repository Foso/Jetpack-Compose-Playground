package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


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