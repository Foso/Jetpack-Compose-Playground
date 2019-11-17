package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Column
import androidx.ui.layout.Padding

@Composable
fun PaddingDemo() {

    Column {
        Text("TextWithoutPadding")
        Padding(left = 80.dp) {
            Text("TextWith80dpOnlyLeftPadding")
        }
        Padding(80.dp) {
            Text("TextWith80dpPadding")
        }

    }

}