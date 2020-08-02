package de.jensklingenberg.jetpackcomposeplayground.ui.github.foundation

import android.util.Log
import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.foundation.lazy.LazyColumnItems
import androidx.ui.material.Button
import androidx.ui.text.TextStyle
import androidx.ui.unit.sp


@Composable
fun LazyColumnItemsDemo() {
    LazyColumnItems(
        items = listOf(
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
