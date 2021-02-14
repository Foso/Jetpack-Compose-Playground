package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material

import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun CheckBoxDemo() {
    MaterialTheme {
        val checkedState = remember { mutableStateOf(true) }
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
    }
}