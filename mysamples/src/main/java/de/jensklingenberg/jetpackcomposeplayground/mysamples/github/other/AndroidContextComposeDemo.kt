package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.other

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import de.jensklingenberg.jetpackcomposeplayground.mysamples.R


@Composable
fun AndroidContextComposeDemo() {
    MaterialTheme {
        val context = LocalContext.current
        Text(text = "Read this string from Context: "+context.getString(R.string.app_name))
    }
}
