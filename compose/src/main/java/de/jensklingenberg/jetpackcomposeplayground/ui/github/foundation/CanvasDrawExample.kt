package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Canvas
import androidx.ui.geometry.Offset
import androidx.ui.geometry.Rect
import androidx.ui.graphics.Color
import androidx.ui.graphics.Paint
import androidx.ui.layout.preferredHeight
import androidx.ui.unit.dp

@Composable
fun CanvasDrawExample() {
    Canvas(modifier = Modifier.preferredHeight(60.dp)) {
        val paint = Paint()
        val centerY = 0f

        // draw rect
        paint.color = Color.Blue
        drawRect(
            Rect(
                0f,
                centerY + 10,
                size.width.value,
                55f
            ),
            paint
        )

        // draw circle
        drawCircle(
            Offset(50f, 200f), 40f, paint
        )

        //Draw a line
        paint.color = Color.Red
        paint.strokeWidth = 5f
        drawLine(
            Offset(20f, 0f),
            Offset(200f, 200f),
            paint
        )

    }
}