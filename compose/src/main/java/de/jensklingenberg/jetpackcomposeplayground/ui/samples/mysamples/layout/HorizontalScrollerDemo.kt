@file:Suppress("KDocUnresolvedReference")

package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme

@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/HorizontalScroller]
         */
fun HorizontalScrollerDemo() {

    MaterialTheme {
        FlexColumn {
            HorizontalScrollerExample()
        }
    }

}

@Composable
fun HorizontalScrollerExample() {
    HorizontalScroller {
        //Only one child is allowed in a VerticalScroller
        Row {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style =(MaterialTheme.typography()).body1)
            }
        }
    }
}