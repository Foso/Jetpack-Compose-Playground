<!---
This is the API of version 1.1.0
-->
# Text

You can use **Text** to display text. You can use the **style** argument to define things like textdecoration or fontfamily.


<p align="left">
  <img src ="{{ site.images }}/foundation/text/TextExample.png" height=100 width=300 />
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

# Working with Text

## Normal text
<p align="center">
  <img src ="{{ site.images }}/foundation/text/normal_text.png"  />
</p>

```kotlin
@Composable
fun NormalTextExample(){
    Text("Just Text")
}
```

## Cursive text
<p align="center">
  <img src ="{{ site.images }}/foundation/text/cursive_text.png"  />
</p>

```kotlin
@Composable
fun CursiveTextExample(){
    Text("Text with cursive font", style = TextStyle(fontFamily = Cursive))
}
```

## Text with LineThrough
<p align="center">
  <img src ="{{ site.images }}/foundation/text/linethrough_text.png"  />
</p>

```kotlin
@Composable
fun TextWithLineThroughExample(){
    Text(
        text = "Text with LineThrough",
        style = TextStyle(textDecoration = TextDecoration.LineThrough)
    )
}
```

## Text with underline
<p align="center">
  <img src ="{{ site.images }}/foundation/text/underline_text.png"  />
</p>

```kotlin
@Composable
fun TextWithUnderline(){
    Text(
        text = "Text with underline",
        style = TextStyle(textDecoration = TextDecoration.Underline)
    )
}
```

## Text with underline, bold and linethrough
<p align="center">
  <img src ="{{ site.images }}/foundation/text/underline_bold_linethrough_text.png"  />
</p>

```kotlin
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
```


## See also:
* [Full Example Code]({{ site.samplefolder }}/foundation/TextExample.kt)
