package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.button

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.R
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExample() {
    Button(
        onClick = { /* Do something! */ }, colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.Red
        )
    ) {
        Text("Button")
    }
}

@Composable
fun OutlinedButtonExample() {
    OutlinedButton(onClick = { /* Do something! */ }) {
        Text("I'm an Outlined Button")
    }
}

@Composable
fun TextButtonExample() {
    TextButton(onClick = { /* Do something! */ }) {
        Text("I'm a Text Button")
    }
}


@Composable
fun ProgressButtonExample() {
    var loading by remember {
        mutableStateOf(false)
    }
    Box() {
        ProgressButton(
            onClick = { loading = !loading },
            modifier = Modifier
                .padding(16.dp)
                .height(46.dp)
                .align(Alignment.Center),
            loading = loading,
            color = Color.Black,
            progressColor = Color.White
        ) {
            Text(
                color = Color.White,
                text = "Refresh"
            )
        }
    }
}

@Composable
fun ProgressButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    loading: Boolean = false,
    color: Color,
    progressColor: Color,
    content: @Composable () -> Unit,
) {
    val contentAlpha by animateFloatAsState(targetValue = if (loading) 0f else 1f)
    val loadingAlpha by animateFloatAsState(targetValue = if (loading) 1f else 0f)
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(backgroundColor = color),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            contentAlignment = Alignment.Center,
        ) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(size = 16.dp)
                    .graphicsLayer { alpha = loadingAlpha },
                color = progressColor,
                strokeWidth = 2.dp,
            )
            Box(
                modifier = Modifier.graphicsLayer { alpha = contentAlpha }
            ) {
                content()
            }
        }
    }
}
