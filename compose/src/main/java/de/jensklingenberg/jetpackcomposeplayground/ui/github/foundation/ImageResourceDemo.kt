package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.imageResource
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R

@Composable
fun ImageResourceDemo() {
    val image = imageResource(id = R.drawable.composelogo)
    Image(bitmap = image)
}
