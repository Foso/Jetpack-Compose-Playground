# Spacer

!!! info
    This is the API of version 1.0.0-rc02

Spacer is a Composable that can be used when you want to add an additional space between Composables

<p align="center">
  <img src ="../{{ site.images }}/foundation/layout/spacer/spacedemo.png" height=50 width=50 />
</p>
```kotlin
@Composable
fun SpacerDemo() {
    Column {
        Text("Hello")
        Spacer(modifier = Modifier.size(30.dp))
        Text("World")
    }
}
```


## See also:
* [Full Example Code]({{ site.samplefolder }}/foundation/layout/SpacerDemo.kt)
