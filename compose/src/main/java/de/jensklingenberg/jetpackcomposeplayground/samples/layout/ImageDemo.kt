package de.jensklingenberg.jetpackcomposeplayground.samples.layout

import android.content.Context
import androidx.compose.Composable
import androidx.ui.core.Draw
import androidx.ui.core.WithDensity
import androidx.ui.engine.geometry.Offset
import androidx.ui.foundation.SimpleImage
import androidx.ui.graphics.Paint
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.Container
import androidx.ui.material.MaterialTheme
import de.jensklingenberg.jetpackcomposeplayground.samples.R


@Composable
fun LoadImageDemo(context: Context) {
    MaterialTheme {
        val icon = imageFromResource(context.resources, R.drawable.ic_launcher_background)

        WithDensity(block = {
            Container(width = 50.toDp(), height = 50.toDp()) {
                Draw { canvas, _ ->
                    canvas.drawImage(icon, Offset.zero, Paint())
                }
            }
        })


    }
}

@Composable
fun LoadImageExample(context: Context) {
    val tst = R.id.icon_group
    val icon = imageFromResource(context.resources, R.drawable.ic_launcher_background)
    SimpleImage(icon)
}