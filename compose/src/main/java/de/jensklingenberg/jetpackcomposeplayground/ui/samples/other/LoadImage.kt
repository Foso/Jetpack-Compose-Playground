package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Box
import androidx.ui.foundation.Image
import androidx.ui.graphics.ImageAsset
import androidx.ui.layout.*

import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R

@Composable fun LoadImageResourceDemo(){
    val imRes: ImageAsset = imageResource(id = R.drawable.placeholder_1_1)

    Box(modifier = Modifier.preferredHeight(50.dp) + Modifier.preferredWidth(50.dp)) {
        Image(imRes)
    }
}
