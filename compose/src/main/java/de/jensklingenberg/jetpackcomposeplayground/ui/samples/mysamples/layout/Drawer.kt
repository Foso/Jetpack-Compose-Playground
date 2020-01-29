package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout

import androidx.annotation.DrawableRes
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Modifier
import androidx.ui.core.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TextButtonStyle
import androidx.ui.material.surface.Surface
import androidx.ui.unit.dp
import de.jensklingenberg.jetpackcomposeplayground.Navigator
import de.jensklingenberg.jetpackcomposeplayground.data.mainPagesEntries
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.common.VectorImage


@Composable
fun AppDrawer(
    closeDrawer: () -> Unit,
    navigator: Navigator
) {

    VerticalScroller {

        Column {
            Column {
                DrawerButton(
                    icon = R.drawable.ic_interests,
                    label = "Home",
                    isSelected = false
                ) {
                    navigator.navigateToHome()
                    closeDrawer()
                }
                mainPagesEntries.forEachIndexed { index, page ->
                    DrawerButton(
                        icon = R.drawable.ic_interests,
                        label = page.title,
                        isSelected = navigator.getIndex().value == index
                    ) {
                        navigator.getIndex().value = index
                        closeDrawer()
                    }

                }
            }
        }


    }
}


@Composable
private fun DrawerButton(
    modifier: Modifier = Modifier.None,
    @DrawableRes icon: Int,
    label: String,
    isSelected: Boolean,
    action: () -> Unit
) {
    val colors = MaterialTheme.colors()
    val textIconColor = if (isSelected) {
        colors.primary
    } else {
        colors.onSurface.copy(alpha = 0.6f)
    }
    val backgroundColor = if (isSelected) {
        colors.primary.copy(alpha = 0.12f)
    } else {
        colors.surface
    }


    Surface(
        modifier = modifier wraps Spacing(left = 8.dp, top = 8.dp, right = 8.dp),
        color = backgroundColor,
        shape = RoundedCornerShape(4.dp)
    ) {
        Button(onClick = action, style = TextButtonStyle()) {
            Row {
                VectorImage(
                    modifier = LayoutGravity.Center,
                    id = icon,
                    tint = textIconColor
                )
           Spacer(LayoutWidth(16.dp))
                Text(
                    text = label,
                    style = (MaterialTheme.typography()).body2.copy(
                        color = textIconColor
                    )
                )
            }
        }
    }
}
