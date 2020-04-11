# Text
You can use **Text** to display text. You can use the **style** argument to define things like textdecoration or fontfamily.

<p align="left">
  <img src ="../../images/TextExample.png" height=500 />
</p>

```kotlin
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
```