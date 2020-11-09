import androidx.compose.desktop.Window
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember


fun main() {
    Window {
        val counterState = remember { mutableStateOf(0) }

        Column {
            Text("You have clicked the button ${counterState.value} times")

            Button(onClick = { counterState.value++ }) {
                Text(text = "Open dialog")
            }
        }
    }
}
