package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.activity.backhandler

import androidx.activity.compose.BackHandler
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun BackHandlerExample() {
    var backPressedCount by remember { mutableStateOf(0) }
    BackHandler(enabled = true, onBack = {
        backPressedCount += 1
    })
    Text(text="Backbutton was pressed : $backPressedCount times")
}

