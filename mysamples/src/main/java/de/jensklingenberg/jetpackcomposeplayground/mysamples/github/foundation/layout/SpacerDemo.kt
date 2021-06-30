package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerDemo() {
    Column {
        Text("Hello")
        Spacer(
            modifier = Modifier
                .size(30.dp)
        )
        Text("World")
    }
}