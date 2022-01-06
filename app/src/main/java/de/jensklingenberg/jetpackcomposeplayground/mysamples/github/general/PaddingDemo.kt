package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.general


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


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