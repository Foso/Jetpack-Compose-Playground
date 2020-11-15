package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.other

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember



@Composable
fun SwitchDemo() {
    MaterialTheme {
        val checkedState = remember { mutableStateOf(true)  }
        Switch(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it }
        )
    }
}

