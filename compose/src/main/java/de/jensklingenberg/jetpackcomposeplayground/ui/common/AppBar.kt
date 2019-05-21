package de.jensklingenberg.jetpackcomposeplayground.ui.common

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.engine.text.TextAlign
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.layout.Row
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import androidx.ui.painting.Color
import de.jensklingenberg.jetpackcomposeplayground.rally.materialBlue
import de.jensklingenberg.jetpackcomposeplayground.rally.rallyBlue

@Composable
fun AppBar(title: String = "") {
    Surface(color = materialBlue) {
        Row(mainAxisAlignment = MainAxisAlignment.Center) {
            Text(
                text = title,
                style = +themeTextStyle { h4.copy(color = Color(0xFFFFFFFF.toInt())) },
                textAlign = TextAlign.CENTER
            )
        }
    }
}

