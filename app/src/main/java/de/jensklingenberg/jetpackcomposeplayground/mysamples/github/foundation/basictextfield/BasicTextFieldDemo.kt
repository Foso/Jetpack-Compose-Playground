package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation.basictextfield

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue

//# --8<-- [start:func]
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
//# --8<-- [end:func]