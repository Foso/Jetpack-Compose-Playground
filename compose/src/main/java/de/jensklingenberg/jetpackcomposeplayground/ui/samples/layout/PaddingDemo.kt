package de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.unit.dp


@Composable
fun PaddingDemo() {

    Column {
        Text("TextWithoutPadding")
        Column(modifier = Modifier.padding(start = 80.dp)){
            Text("TextWith80dpOnlyLeftPadding")

        }


        Column(Modifier.padding(all = 80.dp)){
            Text("TextWith80dpPadding")
        }

    }

}