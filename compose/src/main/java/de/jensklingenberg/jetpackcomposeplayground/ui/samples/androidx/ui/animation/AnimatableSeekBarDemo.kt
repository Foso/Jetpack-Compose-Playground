package de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation

import androidx.animation.PhysicsBuilder
import androidx.compose.Composable
import androidx.compose.remember
import androidx.ui.animation.animatedFloat
import androidx.ui.core.Draw
import androidx.ui.core.Text
import androidx.ui.core.gesture.DragObserver
import androidx.ui.core.gesture.PressGestureDetector
import androidx.ui.core.gesture.RawDragGestureDetector
import androidx.ui.geometry.Offset
import androidx.ui.geometry.Rect
import androidx.ui.graphics.Color
import androidx.ui.graphics.Paint
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Padding
import androidx.ui.text.TextStyle
import androidx.ui.unit.PxPosition
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun AnimatableSeekBarDemo() {

    Column {
        Padding(40.dp) {
            Text("Drag or tap on the seek bar", style = TextStyle(fontSize = 8.sp))
        }

        Padding(left = 10.dp, right = 10.dp, bottom = 30.dp) {
            MovingTargetExample()
        }
    }

}

@Composable
fun MovingTargetExample() {
    val animValue = animatedFloat(0f)
    RawDragGestureDetector(dragObserver = object : DragObserver {
        override fun onDrag(dragDistance: PxPosition): PxPosition {
            animValue.snapTo(animValue.targetValue + dragDistance.x.value)
            return dragDistance
        }
    }) {
        PressGestureDetector(
            onPress = { position ->
                animValue.animateTo(position.x.value,
                    PhysicsBuilder(dampingRatio = 1.0f, stiffness = 1500f)
                )
            }) {

            Container(height = 60.dp, expanded = true) {
                DrawSeekBar(animValue.value)
            }
        }
    }
}

@Composable
fun DrawSeekBar(x: Float) {
    val paint = remember { Paint() }
    Draw { canvas, parentSize ->
        val centerY = parentSize.height.value / 2
        val xConstraint = x.coerceIn(0f, parentSize.width.value)
        // draw bar
        paint.color = Color.Gray
        canvas.drawRect(
            Rect(0f, centerY - 5, parentSize.width.value, centerY + 5),
            paint
        )
        paint.color = Color.Magenta
        canvas.drawRect(
            Rect(0f, centerY - 5, xConstraint, centerY + 5),
            paint
        )

        // draw ticker
        canvas.drawCircle(
            Offset(xConstraint, centerY), 40f, paint
        )
    }
}