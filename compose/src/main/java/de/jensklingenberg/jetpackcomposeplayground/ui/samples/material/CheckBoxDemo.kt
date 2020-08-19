package de.jensklingenberg.jetpackcomposeplayground.ui.samples.material

import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.state


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