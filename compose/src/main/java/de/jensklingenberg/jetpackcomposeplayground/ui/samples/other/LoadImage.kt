package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.ui.foundation.SimpleImage
import androidx.ui.graphics.Image
import androidx.ui.layout.Container
import androidx.ui.layout.LayoutHeight
import androidx.ui.layout.LayoutWidth
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R

@Composable fun LoadImageResourceDemo(){
    val imRes: Image = imageResource(id = R.drawable.placeholder_1_1)
   Container(modifier = LayoutHeight(50.dp)+LayoutWidth(50.dp)) {
       SimpleImage(imRes)
   }
}