
package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout

import androidx.compose.foundation.ScrollableColumn

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable


@Composable
fun ScrollableColumnExample() {
    ScrollableColumn {
        //Only one child is allowed in a VerticalScroller
        Column {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style =(MaterialTheme.typography).body1)
            }
        }
    }
}