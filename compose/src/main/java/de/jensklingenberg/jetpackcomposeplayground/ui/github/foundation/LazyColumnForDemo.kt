package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import android.util.Log
import androidx.compose.foundation.Text
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumnForDemo() {
    LazyColumnFor(items = listOf(
            "A", "B", "C", "D"
    ) + ((0..100).map { it.toString() }),
            modifier = Modifier,
            itemContent = { item ->
                Log.d("COMPOSE", "This get rendered $item")
                when (item) {
                    "A" -> {
                        Text(text = item, style = TextStyle(fontSize = 80.sp))
                    }
                    "B" -> {
                        Button(onClick = {}) {
                            Text(text = item, style = TextStyle(fontSize = 80.sp))
                        }
                    }
                    "C" -> {
                        //Do Nothing
                    }
                    "D" -> {
                        Text(text = item)
                    }
                    else -> {
                        Text(text = item, style = TextStyle(fontSize = 80.sp))
                    }
                }
            })
}
