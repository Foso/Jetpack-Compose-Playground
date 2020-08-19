package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.foundation.Box
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.foundation.layout.preferredWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageAsset
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R


@Composable
fun LoadImageResourceDemo(){
    val imRes: ImageAsset = imageResource(id = R.drawable.placeholder_1_1)

    Box(modifier = Modifier.preferredHeight(50.dp) + Modifier.preferredWidth(50.dp)) {
        Image(imRes)
    }
}
