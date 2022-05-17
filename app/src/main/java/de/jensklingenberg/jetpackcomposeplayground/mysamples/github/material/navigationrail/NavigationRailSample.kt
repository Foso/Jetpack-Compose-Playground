package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.navigationrail

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.NavigationRail
import androidx.compose.material.NavigationRailItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector

enum class Screen(val image: ImageVector) {
    HOME(Icons.Filled.Home), SEARCH(Icons.Filled.Search), SETTINGS(Icons.Filled.Settings)
}

@Composable
fun NavigationRailSample() {
    val icons = Screen.values().map { it.image }

    var page by remember {
        mutableStateOf(Screen.HOME)
    }

    Row {
        NavigationRail(header = {
            Text("I`m a header")
        }, content = {
            Screen.values().forEachIndexed { index: Int, item ->
                NavigationRailItem(
                    icon = { Icon(icons[index], contentDescription = item.name) },
                    label = { Text(item.name) },
                    selected = page == Screen.values()[index],
                    onClick = { page = Screen.values()[index] },
                    alwaysShowLabel = true,
                    enabled = true
                )
            }
        })
        when (page) {
            Screen.HOME -> {
                Text("Home")
            }
            Screen.SEARCH -> {
                Text("Search")
            }
            Screen.SETTINGS -> {
                Text("Settings")
            }
        }
    }
}