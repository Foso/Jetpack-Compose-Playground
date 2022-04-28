<!---
This is the API of version 1.1.1
-->
# Image

Image is used to display Images. It's similar to an ImageView in the classic Android View system.


<p align="left">
  <img src ="{{ site.images }}/foundation/image/imagedemo.png" height=100 width=300 />
</p>


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



