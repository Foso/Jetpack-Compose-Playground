package de.jensklingenberg.jetpackcomposeplayground.ui.common

import androidx.ui.unit.Dp
import androidx.ui.unit.dp

fun  LayoutPadding(
     start: Dp = 0.dp,
     top: Dp = 0.dp,
     end: Dp = 0.dp,
     bottom: Dp = 0.dp) =  androidx.ui.layout.LayoutPadding(left=start,top=top,right=end,bottom=bottom)