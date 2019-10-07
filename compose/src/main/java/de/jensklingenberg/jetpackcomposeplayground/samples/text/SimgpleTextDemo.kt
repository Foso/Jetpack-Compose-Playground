package de.jensklingenberg.jetpackcomposeplayground.samples.text

import androidx.compose.Composable
import androidx.compose.unaryPlus

import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle

@Composable
fun SimgpleTextDemo() {

    MaterialTheme {
        Text(text = "Hello World!", style = +themeTextStyle { h1 })
    }

}