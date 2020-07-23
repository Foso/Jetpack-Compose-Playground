package de.jensklingenberg.jetpackcomposeplayground.ui.samples.material

import androidx.compose.Composable
import androidx.compose.state

import androidx.ui.material.Checkbox
import androidx.ui.material.MaterialTheme

@Composable
fun CheckBoxDemo() {
    MaterialTheme {
        val checkedState = state { true }
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
    }
}