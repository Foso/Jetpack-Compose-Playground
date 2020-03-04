package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other

import androidx.compose.Composable
import androidx.compose.state

import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Switch
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R

@Composable
fun AndroidContextComposeDemo() {
    MaterialTheme {
        val context = ContextAmbient.current
        Text(text = "Read this string from Context: "+context.getString(R.string.app_name))
    }
}
