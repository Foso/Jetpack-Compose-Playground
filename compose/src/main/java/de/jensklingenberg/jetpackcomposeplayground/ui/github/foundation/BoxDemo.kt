package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.foundation.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.preferredSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp


@Composable
fun BoxDemo(){
    Column(modifier = Modifier.fillMaxWidth() + Modifier.wrapContentSize(Alignment.Center)) {
        Box(
            modifier = Modifier.preferredSize(100.dp),
            backgroundColor = Color.Red,
            shape = RectangleShape
        ) {}
    }
}