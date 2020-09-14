package de.jensklingenberg.jetpackcomposeplayground.ui.github.animation.crossfade

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


enum class MyColors(val color: Color) {
    Red(Color.Red), Green(Color.Green), Blue(Color.Blue)
}

@Preview(showBackground = true)
@Composable
fun CrossfadeDemo() {
    var currentColor by remember { mutableStateOf(MyColors.Red) }
    Column {
        Row {
            MyColors.values().forEach { myColors ->
                Button(
                    onClick = { currentColor = myColors },
                    Modifier.weight(1f, true).clip(RoundedCornerShape(8.dp))
                        .preferredHeight(48.dp), backgroundColor = myColors.color
                ) {
                    Text(myColors.name)
                }
            }
        }
        Crossfade(current = currentColor, animation = tween(3000)) { selectedColor ->
            Box(Modifier.fillMaxSize(), backgroundColor = selectedColor.color)
        }
    }
}