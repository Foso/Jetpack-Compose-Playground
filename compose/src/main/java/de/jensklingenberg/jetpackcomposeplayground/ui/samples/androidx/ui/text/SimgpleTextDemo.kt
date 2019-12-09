package de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.text

import androidx.compose.Composable
import androidx.compose.unaryPlus

import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme

@Composable
fun SimpleTextDemo() {

    MaterialTheme {
        Text(text = "Hello World!", style =(+MaterialTheme.typography()).body2)
    }

}