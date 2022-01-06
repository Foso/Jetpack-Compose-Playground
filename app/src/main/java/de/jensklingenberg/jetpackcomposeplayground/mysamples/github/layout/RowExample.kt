package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout

import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
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