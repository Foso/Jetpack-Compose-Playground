package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.button

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ButtonExample() {
    Button(onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
        backgroundColor = Color.Red
    )) {
        Text("Button")
    }
}

@Composable
fun OutlinedButtonExample() {
    OutlinedButton(onClick = { /* Do something! */ }) {
        Text("I'm an Outlined Button")
    }
}