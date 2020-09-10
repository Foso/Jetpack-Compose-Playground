package de.jensklingenberg.jetpackcomposeplayground.ui.github.material.card

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardDemo(){
    Card(Modifier.fillMaxWidth().padding(8.dp),elevation = 8.dp){
        Text("This is a Card")
    }
}
