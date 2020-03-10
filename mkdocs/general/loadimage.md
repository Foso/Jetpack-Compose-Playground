# How to load an image

You can use **imageResource** to load an image from the resources

```kotlin
@Composable fun LoadImageResourceDemo(){
    val imRes: Image = imageResource(id = R.drawable.placeholder_1_1)
  
   Container(modifier = LayoutHeight(50.dp)+LayoutWidth(50.dp)) {
       SimpleImage(imRes)
   }
}

```