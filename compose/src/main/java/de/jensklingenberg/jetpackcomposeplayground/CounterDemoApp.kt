package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.Alignment
import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.Padding
import androidx.ui.layout.Stack
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.rallyBlue
import de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents.AppBar
import de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents.Scaffold


@Composable
fun CounterDemo() {
    MaterialTheme {
        val counterState = +state { 0 }

        Scaffold(appBar = {
            AppBar(
                title = "Compose Playground"
            )
        }) {
            Stack {
                aligned(Alignment.Center) {
                    Text(
                        text = "You have pushed the button this many times: " + counterState.value,
                        style = +themeTextStyle { h4 }
                    )
                }

                aligned(Alignment.BottomRight) {
                    Padding(padding = EdgeInsets(0.dp, 12.dp, 12.dp, 12.dp)) {
                        FloatingActionButton(
                            text = "+",
                            onClick = { counterState.value++ },
                            color = rallyBlue
                        )
                    }
                }

            }
        }


    }

}