package de.jensklingenberg.jetpackcomposeplayground.samples.layout

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle


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
        Text(text = " Hello World!", style = +themeTextStyle { body1 })
        Text(text = " Hello World!2", style = +themeTextStyle { body1 })
    }
}