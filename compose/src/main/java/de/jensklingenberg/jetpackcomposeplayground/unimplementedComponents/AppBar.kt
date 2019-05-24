package de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.engine.text.TextAlign
import androidx.ui.graphics.Color
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.layout.Row
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle

import de.jensklingenberg.jetpackcomposeplayground.samples.rally.materialBlue

@Composable
fun AppBar(title: String = "") {
    Surface(color = materialBlue) {
        Row(mainAxisAlignment = MainAxisAlignment.Center) {
            Text(
                text = title,
                style = +themeTextStyle { h4.copy(color = Color(0xFFFFFFFF.toInt())) },
                textAlign = TextAlign.Center
            )
        }
    }
}

