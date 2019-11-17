package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.gesturedetectors

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.ambientDensity
import androidx.ui.core.dp
import androidx.ui.core.withDensity
import androidx.ui.foundation.gestures.DragDirection
import androidx.ui.foundation.gestures.Draggable
import androidx.ui.layout.Column
import androidx.ui.layout.Padding

@Composable
fun DraggableDemo(){

    val max = 300.dp
    val min = 0.dp
    val (minPx, maxPx) = withDensity(+ambientDensity()) {
        min.toPx().value to max.toPx().value
    }
    Draggable(DragDirection.Horizontal, minPx, maxPx) { dragValue ->
        // dragValue is the current value in progress of dragging
        val draggedDp = withDensity(+ambientDensity()) {
            dragValue.toDp()
        }

       Column {
           Padding(left = draggedDp){
               Text("Drag me ")
           }
           Text("Dragvalue: "+dragValue.dp)
       }
    }
}