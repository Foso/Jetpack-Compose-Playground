package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.material.TopAppBar
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.common.VectorImageButton

@Composable
fun MyAppBar(openDrawer: () -> Unit) {
    TopAppBar(
        title = { Text(text = "Jetpack Compose Playground") },
        navigationIcon = {
            VectorImageButton(
                R.drawable.ic_menu_24px
            ) {
                openDrawer()
            }
        }
    )
}