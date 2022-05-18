package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.divider

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun DividerExample(){
    Column {
        Text("Foo")
        Divider(startIndent = 8.dp, thickness = 1.dp, color = Color.Black)
        Text("Bar")
    }
}