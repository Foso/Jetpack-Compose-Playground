# Image

!!! info
    This is the API of version dev17. Newer versions may have a different one


<p align="left">
  <img src ="../../images/foundation/image/imagedemo.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ImageResourceDemo() {
    val image = imageResource(id = R.drawable.composelogo)
    Image(asset = image)
}

```