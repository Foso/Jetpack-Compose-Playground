package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.foundation.BaseTextField
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.state
import androidx.compose.ui.text.input.TextFieldValue


@ExperimentalFoundationApi
@Composable
fun TextFieldDemo() {
    Column {
        val state = state { TextFieldValue("") }
        BaseTextField(
            value = state.value,
            onValueChange = { state.value  }
        )
        Text("The textfield has this text: "+state.value)
    }
}