package de.jensklingenberg.compose.desktop.sevengui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


/**
 * The task is to build a frame containing a label or read-only textfield T and a button B. Initially,
 * the value in T is “0” and each click of B increases the value in T by one.
 * Counter serves as a gentle introduction to the basics of the language, paradigm and toolkit for one of the simplest GUI
 * applications imaginable. Thus, Counter reveals the required scaffolding and how the very basic features work together to build a GUI
 * application. A good solution will have almost no scaffolding.
 */
@Composable
fun Counter() {

        val counterState = remember { mutableStateOf(0) }

        Column {
            Text("You have clicked the button ${counterState.value} times")

            Button(onClick = { counterState.value++ }) {
                Text(text = "Count")
            }
        }

}