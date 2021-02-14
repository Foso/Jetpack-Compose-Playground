package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation.scrollablerow

import androidx.compose.foundation.ScrollableRow

import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ScrollableRowDemo() {
    ScrollableRow {
        //Only one child is allowed in a VerticalScroller
        Row {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style = (MaterialTheme.typography).body1)
            }
        }
    }
}
