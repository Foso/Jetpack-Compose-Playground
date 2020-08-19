
package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


/**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/VerticalScroller]
         */

@Composable
fun ScrollableColumnExample() {
    ScrollableColumn(children = {
        //Only one child is allowed in a VerticalScroller
        Column {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style =(MaterialTheme.typography).body1)
            }
        }
    })
}