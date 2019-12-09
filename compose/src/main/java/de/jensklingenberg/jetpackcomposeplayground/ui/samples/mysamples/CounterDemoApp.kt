package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.Padding
import androidx.ui.layout.Stack
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.MaterialTheme
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.rally.rallyBlue


@Composable
fun CounterDemo() {

    MaterialTheme {
        val counterState = +state { 0 }


        Stack {
            aligned(Alignment.Center) {
                Text(
                    text = "You have pushed the button this many times: " + counterState.value,
                    style =(+MaterialTheme.typography()).h4
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