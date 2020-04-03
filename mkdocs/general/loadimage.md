# How to load an image

You can use **imageResource** to load an image from the resources

```kotlin
@Composable fun LoadImageResourceDemo(){
    val imRes: ImageAsset = imageResource(id = R.drawable.placeholder_1_1)

    Box(modifier = Modifier.preferredHeight(50.dp) + Modifier.preferredWidth(50.dp)) {
        Image(imRes)
    }
}
```