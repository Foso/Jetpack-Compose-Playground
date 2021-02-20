# How to load an image

!!! info
    This is the API of version 1.0.0-alpha12. Newer versions may have a different one


## Load Image
You can use **painterResource** to load an image from the resources

```kotlin
@Composable
fun ImageResourceDemo() {
    val image: Painter = painterResource(id = R.drawable.composelogo)
    Image(painter = image,contentDescription = "")
}
```


<hr>

## See also:

* [Full Example Code]({{ site.samplefolder }}/foundation/ImageResourceDemo.kt)
