package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.other

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus

import androidx.ui.core.Text
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme


class CounterModel {
    val counter = +state { 0 }
    var header = "Counter demo"
}

@Composable
fun CounterModelDemo() {

    MaterialTheme {
        val countState =
            CounterModel()

        Center {
            Column {
                CounterHeader(
                    countState
                )
                AddSubtractButtons(
                    countState
                )
                CounterLabel(
                    countState
                )
            }
        }
    }


}

@Composable
fun CounterHeader(counterModel: CounterModel) {
    Text(text = counterModel.header, style = (+MaterialTheme.typography()).h4)
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
    Text(text = "Clicks: ${counterModel.counter.value}",  style = (+MaterialTheme.typography()).h4)
}
