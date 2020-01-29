package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.gesturedetectors

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.ambientDensity
import androidx.ui.foundation.animation.animatedDragValue
import androidx.ui.foundation.gestures.DragDirection
import androidx.ui.foundation.gestures.Draggable
import androidx.ui.layout.Column
import androidx.ui.layout.Padding
import androidx.ui.unit.dp
import androidx.ui.unit.withDensity

@Composable
fun DraggableDemo(){

    val max = 300.dp
    val min = 0.dp
    val (minPx, maxPx) = withDensity(ambientDensity()) {
        min.toPx().value to max.toPx().value
    }

    val position = animatedDragValue(0f, minPx, maxPx)

    Draggable(DragDirection.Horizontal,position,{ position.animatedFloat.snapTo(it) }) {
        // dragValue is the current value in progress of dragging
        val draggedDp = withDensity(ambientDensity()) {
            position.value.toDp()
        }

       Column {
           Padding(left = draggedDp){
               Text("Drag me ")
           }
           Text("Dragvalue: "+position.value.dp)
       }
    }
}