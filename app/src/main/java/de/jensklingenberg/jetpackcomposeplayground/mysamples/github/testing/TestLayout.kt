package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.testing

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun TestingExample() {
    val state = remember { mutableStateOf("Hello") }
    Button(onClick = { state.value = "Bye" }, modifier = Modifier.testTag("MyTestTag")) {
        Text(state.value)
    }
}