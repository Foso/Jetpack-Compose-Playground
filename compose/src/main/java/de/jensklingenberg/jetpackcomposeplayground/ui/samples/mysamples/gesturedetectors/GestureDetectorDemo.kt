package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.gesturedetectors

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.gesture.PressGestureDetector
import androidx.ui.layout.Column

@Composable
fun PressGestureDetectorDemo() {

    val posX = state { 0f }
    val posXY = state { 0f }
    val clickState = state { "" }

    PressGestureDetector(
        onPress = { position ->
            posX.value = position.x.value
            posXY.value = position.y.value
            clickState.value = "Pressed"
        },
        onRelease = {
            clickState.value = "Released"
        }) {

        Column {
            Text("ClickState: " + clickState.value)
            Text("PostitionX: ${posX.value}")
            Text("PostitionY: ${posXY.value}")
        }
    }
}