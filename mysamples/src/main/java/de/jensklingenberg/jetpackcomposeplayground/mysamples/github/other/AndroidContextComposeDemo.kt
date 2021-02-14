package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.other

import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ContextAmbient
import de.jensklingenberg.jetpackcomposeplayground.mysamples.R


@Composable
fun AndroidContextComposeDemo() {
    MaterialTheme {
        val context = ContextAmbient.current
        Text(text = "Read this string from Context: "+context.getString(R.string.app_name))
    }
}
