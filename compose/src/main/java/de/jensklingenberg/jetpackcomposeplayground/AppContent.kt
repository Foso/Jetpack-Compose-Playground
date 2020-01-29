package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface

@Composable
fun AppContent(
    navigator: Navigator,
    appBar: () -> Unit
) {

    Surface(color = (MaterialTheme.colors()).background) {
        FlexColumn(crossAxisAlignment = CrossAxisAlignment.Center) {
            inflexible {
                appBar()
            }
            expanded(1F) {
                navigator.navigateTo(navigator.getIndex().value)
            }
        }


    }
}