package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Text
import androidx.ui.core.TextField
import androidx.ui.layout.Column

@Composable
fun TextFieldDemo() {
    Column {
        val state = state { "" }
        TextField(
            value = state.value,
            onValueChange = { state.value = it }
        )
        Text("The textfield has this text: "+state.value)
    }
}