package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.Composable

import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme


@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Column]
         */
fun ColumnDemo() {

    MaterialTheme {
        ColumnExample()
    }

}

@Composable
fun ColumnExample() {
    Container {
        Column {
            Text(text = " Hello World!")
            Text(text = " Hello World!2")
        }
    }

}