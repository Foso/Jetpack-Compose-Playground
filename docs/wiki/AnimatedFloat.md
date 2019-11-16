animatedFloat

```kotlin
package de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation

import androidx.animation.AnimatedFloat
import androidx.compose.Composable
import androidx.compose.memo
import androidx.compose.unaryPlus
import androidx.ui.animation.animatedFloat
import androidx.ui.core.Draw
import androidx.ui.core.dp
import androidx.ui.engine.geometry.Rect
import androidx.ui.graphics.Color
import androidx.ui.graphics.Paint
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Padding
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme

@Composable
fun animatedFloatTest() {
    MaterialTheme {
        Column {

            val animValue = +animatedFloat(0f)

            Padding(left = 10.dp, right = 10.dp, bottom = 30.dp) {
                MovingTargetExample2(animValue)
            }
            Button("Animate to 100f", onClick = {
                animValue.animateTo(100f)
            })
            Button("Snap to 200f", onClick = {
                animValue.snapTo(200f)
            })
        }
    }
}

@Composable
fun MovingTargetExample2(animValue: AnimatedFloat) {
    Container(height = 60.dp, expanded = true) {
        DrawBar(animValue.value)
    }
}

@Composable
fun DrawBar(x: Float) {
    val paint = +memo { Paint() }
    Draw { canvas, parentSize ->
        val centerY = parentSize.height.value / 2
        val xConstraint = x.coerceIn(0f, parentSize.width.value)
        // draw bar
        paint.color = Color.Gray
        canvas.drawRect(
            Rect(0f, centerY - 50, parentSize.width.value, centerY + 5),
            paint
        )
        paint.color = Color.Magenta
        canvas.drawRect(
            Rect(0f, centerY - 50, xConstraint, centerY + 5),
            paint
        )

    }
}
```