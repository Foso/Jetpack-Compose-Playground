package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.unit.dp
import androidx.ui.layout.Column
import androidx.ui.layout.LayoutPadding


@Composable
fun PaddingDemo() {

    Column {
        Text("TextWithoutPadding")
        Column(modifier = LayoutPadding(start = 80.dp)){
            Text("TextWith80dpOnlyLeftPadding")

        }


        Column(LayoutPadding(all=80.dp)){
            Text("TextWith80dpPadding")
        }

    }

}