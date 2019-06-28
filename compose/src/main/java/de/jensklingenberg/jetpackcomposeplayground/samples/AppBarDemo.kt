package de.jensklingenberg.jetpackcomposeplayground.samples

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.CraneWrapper
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.material.surface.Surface
import androidx.ui.material.themeTextStyle
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.materialBlue

@Composable
fun AppBarDemo() {
    CraneWrapper {
        MaterialTheme {
            Surface(color = materialBlue) {
                Column {
                    TopAppBar(title = "Default")
                    HeightSpacer(height = 24.dp)
                    TopAppBar(title = "Custom color", color = Color(0xFFE91E63.toInt()))
                    HeightSpacer(height = 24.dp)
                    TopAppBar(title = "Custom icons", icons = listOf(24.dp, 24.dp))
                    HeightSpacer(height = 12.dp)
                    Text(text = "No title", style = +themeTextStyle { h6 })
                    TopAppBar(icons = listOf(24.dp, 24.dp))
                    HeightSpacer(height = 24.dp)
                    TopAppBar(title = "Too many icons", icons = listOf(24.dp, 24.dp, 24.dp, 24.dp))
                }
            }
        }


    }


}