# Card

!!! info
    This is the API of version 1.0.0-beta02.

Card is the equivalent of a CardView in Compose

```kotlin
 @Composable fun CardDemo(){
    Card(Modifier.fillMaxWidth().padding(8.dp),elevation = 8.dp){
        Text("This is a Card")
    }
}
```

<p align="center">
  <img src ="{{ site.images }}/material/card/carddemo.png"  />
</p>


## See also:
* [Material.io](https://material.io/components/cards)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#card)
* [Full Example Code]({{ site.samplefolder }}/material/card/CardDemo.kt)
