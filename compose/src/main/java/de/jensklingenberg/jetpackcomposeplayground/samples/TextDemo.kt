package de.jensklingenberg.jetpackcomposeplayground.samples

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.CraneWrapper
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle

@Composable
fun TextDemo() {
    CraneWrapper {
        MaterialTheme {
            Text(text = "Hello World!", style = +themeTextStyle { h1 })
        }
    }
}