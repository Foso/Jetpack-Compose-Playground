package de.jensklingenberg.jetpackcomposeplayground.samples

import androidx.compose.Composable
import androidx.compose.unaryPlus

import androidx.ui.core.Text
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import de.jensklingenberg.jetpackcomposeplayground.model.CounterModel


@Composable
fun CounterModelDemo() {

    MaterialTheme {
        val countState = CounterModel()

        Center {
            Column {
                CounterHeader(countState)
                AddSubtractButtons(countState)
                CounterLabel(countState)
            }
        }
    }


}

@Composable
fun CounterHeader(counterModel: CounterModel) {
    Text(text = counterModel.header, style = +themeTextStyle { h4 })
}

@Composable
fun AddSubtractButtons(
    counterModel: CounterModel
) {
    Button(
        text = "Add",
        onClick = {
            counterModel.counter.value++
        })
    Button(
        text = "Subtract",
        onClick = { counterModel.counter.value-- })
}

@Composable
fun CounterLabel(counterModel: CounterModel) {
    Text(text = "Clicks: ${counterModel.counter.value}", style = +themeTextStyle { h4 })
}
