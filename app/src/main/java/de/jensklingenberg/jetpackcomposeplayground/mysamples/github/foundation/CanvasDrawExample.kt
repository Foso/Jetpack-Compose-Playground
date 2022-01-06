package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun CanvasDrawExample() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawRect(Color.Blue, topLeft = Offset(0f, 0f), size = Size(this.size.width, 55f))
        drawCircle(Color.Red, center = Offset(50f, 200f), radius = 40f)
        drawLine(
            Color.Green, Offset(20f, 0f),
            Offset(200f, 200f), strokeWidth = 5f
        )

        drawArc(
            Color.Black,
            0f,
            60f,
            useCenter = true,
            size = Size(300f, 300f),
            topLeft = Offset(60f, 60f)
        )
    }
}