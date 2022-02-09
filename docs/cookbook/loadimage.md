<!---
This is the API of version 1.1.0
-->
# How to load an image

## Load Image
You can use **painterResource** to load an image from the resources

```kotlin
@Composable
fun ImageResourceDemo() {
    val image: Painter = painterResource(id = R.drawable.composelogo)
    Image(painter = image,contentDescription = "")
}
```
Or load an Icon from Material Icons

```kotlin
@Composable
fun ImageResourceDemo() {
    Icon(Icons.Rounded.Home,contentDescription = "")
}
```

Remember to add dependencies to build.gradle

```
    implementation "androidx.compose.material:material-icons-extended:$compose_version"
```


<hr>

## See also:

* [Full Example Code]({{ site.samplefolder }}/foundation/ImageResourceDemo.kt)
