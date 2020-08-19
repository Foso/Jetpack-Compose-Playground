@file:Suppress("KDocUnresolvedReference")

package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable


/**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/HorizontalScroller]
         */

@Composable
fun ScrollableRowExample() {
    ScrollableRow(children = {
        //Only one child is allowed in a VerticalScroller
        Row {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style =(MaterialTheme.typography).body1)
            }
        }
    })
}