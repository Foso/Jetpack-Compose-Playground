package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.circularprogress

import androidx.compose.animation.animate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CircularProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress = animate(
            target = progress,
            animSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(Modifier.height(30.dp))
        Text("LinearProgressIndicator with undefined progress")
        LinearProgressIndicator()
        Spacer(Modifier.height(30.dp))
        Text("LinearProgressIndicator with progress set by buttons")
        LinearProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.height(30.dp))
        OutlinedButton(
                onClick = {
                    if (progress < 1f) progress += 0.1f
                }
        ) {
            Text("Increase")
        }

        OutlinedButton(
                onClick = {
                    if (progress > 0f) progress -= 0.1f
                }
        ) {
            Text("Decrease")
        }
    }
}