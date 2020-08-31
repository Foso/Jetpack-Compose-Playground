# How to load an image

!!! info
    This is the API of version alpha01. Newer versions may have a different one

You can use **imageResource** to load an image from the resources

```kotlin
@Composable fun LoadImageResourceDemo(){
    val imRes: ImageAsset = imageResource(id = R.drawable.placeholder_1_1)

    Box(modifier = Modifier.preferredHeight(50.dp).then(Modifier.preferredWidth(50.dp))) {
        Image(imRes)
    }
}
```


<hr>
## See also:
* [How to load an image from the resource folder?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/image/ImageActivity.kt#L87)
