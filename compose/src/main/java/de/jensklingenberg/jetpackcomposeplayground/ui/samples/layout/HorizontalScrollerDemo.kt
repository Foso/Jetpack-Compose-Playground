@file:Suppress("KDocUnresolvedReference")

package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.ui.foundation.Text
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme

import androidx.compose.Composable
import androidx.ui.foundation.ScrollableRow


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