# Image

!!! info
    This is the API of version alpha01. Newer versions may have a different one

Image is used to display Images. It's similar to an ImageView in the classic Android View system.


<p align="left">
  <img src ="../../images/foundation/image/imagedemo.png" height=100 width=300 />
</p>

## Load Image Drawable

```kotlin
@Composable
fun ImageResourceDrawableDemo() {
     val image = loadImageResource(id = R.drawable.composelogo)
     //loadImageResource will load the drawable asynchronous
        image.resource.resource?.let {
            Image(asset = it)
        }
}
```

## Load Vector Drawable

```kotlin
@Composable
fun ImageVectorResourceDemo() {
    val image = loadVectorResource(id = R.drawable.favorite)
    //loadVectorResource will load the vector image asynchronous
    image.resource.resource?.let {
        Image(asset = it)
    }
}
```


