package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation.scrollablecolumn

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ScrollableColumnDemo() {
    ScrollableColumn {
        //Only one child is allowed in a ScrollableColumn
        Column {
            for (i in 0..100) {
                Text("$i Hello World!", style =MaterialTheme.typography.body1)
            }
        }
    }
}
