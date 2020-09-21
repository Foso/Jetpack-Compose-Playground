# Card

!!! info
    This is the API of version 1.0.0-alpha03. Newer versions may have a different one

Card is the implementation of a CardView in Compose

```kotlin
 @Composable fun CardDemo(){
    Card(Modifier.fillMaxWidth().padding(8.dp),elevation = 8.dp){
        Text("This is a Card")
    }
}
```

<p align="center">
  <img src ="../../images/material/card/carddemo.png"  />
</p>


## See also:
* [Material.io](https://material.io/components/cards)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#card)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/material/card/CardDemo.kt)
