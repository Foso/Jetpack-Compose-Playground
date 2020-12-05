package de.jensklingenberg.jetpackcomposeplayground.ui.github.material.dropdown

import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DropdownDemo() {
    val items = listOf("A", "B", "C", "D", "E", "F")
    val disabledValue = "B"
    var showMenu by remember { mutableStateOf( false ) }
    var selectedIndex by remember { mutableStateOf(0) }

    DropdownMenu(
            toggle = {
                Text(items[selectedIndex], modifier = Modifier.fillMaxWidth().clickable(onClick = { showMenu = true }))
            },
            expanded = showMenu,
            onDismissRequest = { showMenu = false },
            toggleModifier = Modifier.fillMaxWidth().background(Color.Gray),
            dropdownModifier = Modifier.fillMaxWidth().background(Color.Red)
    ) {
        items.forEachIndexed { index, s ->
            DropdownMenuItem(
                    enabled = (s != disabledValue),
                    onClick = {
                        selectedIndex = index
                        showMenu = false
                    }
            ) {
                val disabledText = if (s == disabledValue) {
                    " (Disabled)"
                } else {
                    ""
                }
                Text(text = s + disabledText)
            }
        }
    }
}