package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.compose.state

import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.core.gesture.PressGestureDetector
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutHeight
import androidx.ui.layout.LayoutWidth

@Composable
fun PressGestureDetectorDemo() {

    val posX = state { 0f }
    val posXY = state { 0f }
    val clickState = state { "" }

    Column(modifier = LayoutWidth.Fill+LayoutHeight.Fill, arrangement = Arrangement.Center) {
        PressGestureDetector(
            onPress = { position ->
                posX.value = position.x.value
                posXY.value = position.y.value
                clickState.value = "Pressed"
            },
            onRelease = {
                clickState.value = "Released"
            }) {

            Column(modifier = LayoutWidth.Fill+LayoutHeight.Fill, arrangement = Arrangement.Center) {
                Text("ClickState: " + clickState.value)
                Text("PostitionX: ${posX.value}")
                Text("PostitionY: ${posXY.value}")
            }
        }
    }

}