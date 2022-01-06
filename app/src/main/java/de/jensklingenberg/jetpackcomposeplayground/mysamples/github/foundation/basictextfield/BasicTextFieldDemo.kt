package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation.basictextfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun BasicTextFieldDemo() {
    var textState by remember { mutableStateOf(TextFieldValue("Hello World")) }
    Column {
        BasicTextField(value = textState, onValueChange = {
            textState = it
        })
        Text("The textfield has this text: " + textState.text)
    }
}