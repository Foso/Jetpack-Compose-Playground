package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.other

import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Switch
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R

@Composable
fun AndroidContextComposeDemo() {
    MaterialTheme {
        val context = ambient(ContextAmbient)
        Text(text = "Read this string from Context: "+context.getString(R.string.app_name))
    }
}
