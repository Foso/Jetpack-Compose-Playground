package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.imageResource
import de.jensklingenberg.jetpackcomposeplayground.mysamples.R


@Composable
fun ImageResourceDemo() {
    val image = imageResource(id = R.drawable.composelogo)
    Image(bitmap = image)
}
