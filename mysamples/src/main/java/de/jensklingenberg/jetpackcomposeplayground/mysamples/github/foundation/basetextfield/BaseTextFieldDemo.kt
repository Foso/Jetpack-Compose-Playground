package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation.basetextfield

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BaseTextFieldDemo() {
    var textState by remember { mutableStateOf(TextFieldValue()) }

    Column {
        TextField(value = textState, onValueChange = {
            textState = it
        })
        Text("The textfield has this text: " + textState.text)
    }

}