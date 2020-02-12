package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.other

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.material.MaterialTheme
import androidx.ui.material.RadioGroup

@Composable
fun RadioGroupSample() {
    MaterialTheme {
        val radioOptions = listOf("A", "B", "C")
        val (selectedOption, onOptionSelected) = state { radioOptions[0] }
        RadioGroup(
            options = radioOptions,
            selectedOption = selectedOption,
            onSelectedChange = onOptionSelected
        )
    }

}