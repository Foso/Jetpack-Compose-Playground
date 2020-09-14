# How to load an image

!!! info
    This is the API of version alpha02. Newer versions may have a different one


## Load Image Drawable
You can use **loadImageResource** to load an drawable image from the resources

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
You can use **loadVectorResource** to load an vector image from the resources

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


<hr>
## See also:
* [How to load an image from the resource folder?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/image/ImageActivity.kt#L87)
