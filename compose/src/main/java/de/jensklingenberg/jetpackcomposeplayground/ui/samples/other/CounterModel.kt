package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.compose.Model

import androidx.ui.core.Text
import androidx.ui.layout.Center
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme

@Model
class CounterModel {
    var counter = 0
    var header = "Counter demo"
}

@Composable
fun CounterModelDemo() {

    MaterialTheme {
        val countState: CounterModel =
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
    Text(text = counterModel.header)
}

@Composable
fun AddSubtractButtons(
    counterModel: CounterModel
) {
    Column {
        Button(
            onClick = {
                counterModel.counter++
            }) {
            Text("Add")
        }
        Button(

            onClick = { counterModel.counter-- }) {
            Text("Subtract")

        }
    }
}

@Composable
fun CounterLabel(counterModel: CounterModel) {
    Text(text = "Clicks: ${counterModel.counter}")
}
