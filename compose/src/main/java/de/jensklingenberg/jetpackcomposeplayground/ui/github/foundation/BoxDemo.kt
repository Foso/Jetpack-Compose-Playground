package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BoxDemo(){
    Box(
        shape = CircleShape,
        backgroundColor = Color.Red,
        border = BorderStroke(8.dp, Color.Blue),
        padding = 16.dp
    ) {
        Text("HELLO")
    }
}