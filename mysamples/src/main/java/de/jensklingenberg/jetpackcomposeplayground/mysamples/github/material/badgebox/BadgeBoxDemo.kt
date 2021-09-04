package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.badgebox

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun BadgeBoxDemo() {
    BottomNavigation {
        BottomNavigationItem(
            icon = {
                BadgedBox(badge = { Badge { Text("8") } }) {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Favorite"
                    )
                }

            },
            selected = false,
            onClick = {})
    }
}