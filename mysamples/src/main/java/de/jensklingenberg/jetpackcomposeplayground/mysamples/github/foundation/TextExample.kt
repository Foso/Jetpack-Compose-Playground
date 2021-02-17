package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation


import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration

@Composable
fun TextExample(){
    Column {
        Text("Just Text")
        Text("Text with cursive font", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "Text with LineThrough",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "Text with underline",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "Text with underline, linethrough and bold",
            style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(
                        TextDecoration.Underline,
                        TextDecoration.LineThrough
                    )
                ), fontWeight = FontWeight.Bold
            )
        )
    }
}


@Composable
fun NormalTextExample(){
    Text("Just Text")
}

@Composable
fun CursiveTextExample(){
    Text("Text with cursive font", style = TextStyle(fontFamily = FontFamily.Cursive))
}

@Composable
fun TextWithLineThroughExample(){
    Text(
        text = "Text with LineThrough",
        style = TextStyle(textDecoration = TextDecoration.LineThrough)
    )
}

@Composable
fun TextWithUnderline(){
    Text(
        text = "Text with underline",
        style = TextStyle(textDecoration = TextDecoration.Underline)
    )
}


@Composable
fun TextWithUnderlineStrikeThroughAndBold(){
    Text(
        text = "Text with underline, linethrough and bold",
        style = TextStyle(
            textDecoration = TextDecoration.combine(
                listOf(
                    TextDecoration.Underline,
                    TextDecoration.LineThrough
                )
            ), fontWeight = FontWeight.Bold
        )
    )
}