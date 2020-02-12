package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.Composable
import androidx.ui.core.Draw
import androidx.ui.unit.dp
import androidx.ui.geometry.Offset
import androidx.ui.geometry.Rect
import androidx.ui.graphics.Color
import androidx.ui.graphics.Paint
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme

@Composable
fun CanvasDrawExample() {
    MaterialTheme {
        Container(height = 60.dp, expanded = true) {
            val paint = Paint()
            Draw { canvas, parentSize ->
                val centerY = 0f

                // draw bar
                paint.color = Color.Blue
                canvas.drawRect(
                    Rect(
                        0f,
                        centerY + 10,
                        parentSize.width.value,
                        55f
                    ),
                    paint
                )

                // draw circle
                canvas.drawCircle(
                    Offset(50f, 200f), 40f, paint
                )

                //Draw a line
                paint.color = Color.Red
                paint.strokeWidth = 5f
                canvas.drawLine(
                    Offset(20f, 0f),
                    Offset(200f, 200f),
                    paint
                )

            }
        }
    }
}