@file:Suppress("KDocUnresolvedReference")

package de.jensklingenberg.jetpackcomposeplayground.samples.layout

import androidx.compose.Composable
import androidx.compose.unaryPlus

import androidx.ui.core.Text
import androidx.ui.layout.Column
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.VerticalScroller
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle

@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/VerticalScroller]
         */
fun VerticalScrollerDemo() {

        MaterialTheme {
            FlexColumn {
                VerticalScrollerExample()
            }
        }

}

@Composable
fun VerticalScrollerExample() {
    VerticalScroller {
        //Only one child is allowed in a VerticalScroller
        Column {
            for (i in 0..100) {
                Text(text = "$i Hello World!", style = +themeTextStyle { body1 })
            }
        }
    }
}