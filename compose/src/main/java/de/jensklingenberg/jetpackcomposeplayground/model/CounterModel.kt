package de.jensklingenberg.jetpackcomposeplayground.model

import androidx.compose.state
import androidx.compose.unaryPlus

class CounterModel {
    val counter = state { 0 }
    var header = "Counter demo"
}