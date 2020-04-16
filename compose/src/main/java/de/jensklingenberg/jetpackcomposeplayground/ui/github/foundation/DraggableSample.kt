package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.core.DensityAmbient
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.gestures.DragDirection
import androidx.ui.foundation.gestures.draggable
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.unit.dp

@Composable
fun DraggableSample() {

    val max = 300.dp
    val min = 0.dp
    val (minPx, maxPx) = with(DensityAmbient.current) {
        min.toPx().value to max.toPx().value
    }
    var position by state { 0f }

    Box(
        modifier = Modifier
            .draggable(dragDirection = DragDirection.Horizontal) { delta ->
                // consume only delta that needed if we hit bounds
                val old = position
                position = (position + delta).coerceIn(minPx, maxPx)
                position - old
            }
    ) {
        Column {
            Text("Drag me ",modifier = Modifier.padding(start = position.dp))
            Text("Dragvalue: "+position.dp)
        }

    }
}