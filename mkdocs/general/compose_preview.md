# @Preview
You can use the @Preview annotation to preview compose functions inside Android Studio.

```kotlin

@Preview
@Composable
fun TextDemo(){
    Text("Hello")
}

@Preview(name = "MyPreviewName")
@Composable
fun TextDemo2(){
    Text("Hello")
}

```
Android Studio Preview
<p align="left">
  <img src ="../../images/ComposePreview.png"  height=100 width=300 />
</p>