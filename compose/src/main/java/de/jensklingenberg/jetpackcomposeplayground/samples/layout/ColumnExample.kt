package de.jensklingenberg.jetpackcomposeplayground.samples.layout

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.CraneWrapper
import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle


@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Column]
         */
fun ColumnDemo() {
    CraneWrapper {
        MaterialTheme {
            ColumnExample()
        }
    }
}

@Composable
fun ColumnExample() {
    Container{
        Column {
            Text(text = " Hello World!", style = +themeTextStyle { body1 })
            Text(text = " Hello World!2", style = +themeTextStyle { body1 })
        }
    }

}