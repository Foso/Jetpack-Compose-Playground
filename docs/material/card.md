# Card

!!! info
    This is the API of version 1.0.0-beta06.

Card is the equivalent of a CardView in Compose

```kotlin
 @Composable fun CardDemo(){
    Card(Modifier.fillMaxWidth().padding(8.dp),elevation = 8.dp){
        Text("This is a Card")
    }
}
```

<p align="center">
  <img src ="{{ site.images }}/material/card/card.png"  />
</p>

``` kotlin

@Composable
fun CardDemo() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
            .clickable{ },  
        elevation = 10.dp
    ) {
        Column(
            modifier = Modifier.padding(15.dp)
        ) {
            Text(
                buildAnnotatedString {
                    append("welcome to ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.W900, color = Color(0xFF4552B8))
                    ) {
                        append("Jetpack Compose Playground")
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    append("Now you are in the ")
                    withStyle(style = SpanStyle(fontWeight = FontWeight.W900)) {
                        append("Card")
                    }
                    append(" section")
                }
            )
        }
    }
}
```

## See also:
* [Material.io](https://material.io/components/cards)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#card)
* [Full Example Code]({{ site.samplefolder }}/material/card/CardDemo.kt)
