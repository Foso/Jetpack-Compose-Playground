package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.androidview

import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import de.jensklingenberg.jetpackcomposeplayground.mysamples.R


@Preview(showBackground = true)
@Composable
fun EmbeddedAndroidViewDemo() {
    Column {
        val state = remember { mutableStateOf(0) }

        //widget.ImageView
        AndroidView(viewBlock = { ctx ->
            ImageView(ctx).apply {
                val drawable = ContextCompat.getDrawable(ctx, R.drawable.composelogo)
                setImageDrawable(drawable)
            }
        })

        //Compose Button
        androidx.compose.material.Button(onClick = { state.value++ }) {
            Text("MyComposeButton")
        }

        //widget.Button
        AndroidView(viewBlock = { ctx ->
            //Here you can construct your View
            android.widget.Button(ctx).apply {
                text = "MyAndroidButton"
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                setOnClickListener {
                    state.value++
                }
            }
        }, modifier = Modifier.padding(8.dp))

        //widget.TextView
        AndroidView(viewBlock = { ctx ->
            //Here you can construct your View
            TextView(ctx).apply {
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            }
        }, update = {
            it.text = "You have clicked the buttons: " + state.value.toString() + " times"
        })
    }
}