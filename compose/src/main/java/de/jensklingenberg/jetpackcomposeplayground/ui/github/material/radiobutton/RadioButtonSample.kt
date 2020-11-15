package de.jensklingenberg.jetpackcomposeplayground.ui.github.material.radiobutton

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun RadioGroupSample() {
    val radioOptions = listOf("A", "B", "C")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(radioOptions[1] ) }
    Column {
        radioOptions.forEach { text ->
            Row(
                Modifier
                .fillMaxWidth()
                .selectable(
                    selected = (text == selectedOption),
                    onClick = {
                        onOptionSelected
                        (text)
                    }
                )
                .padding(horizontal = 16.dp)
            ) {
                RadioButton(
                    selected = (text == selectedOption),
                    onClick = { onOptionSelected(text) }
                )
                Text(
                    text = text,
                    style = MaterialTheme.typography.body1.merge(),
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}
