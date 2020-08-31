# Preview
## Preview
You can use the **@Preview** annotation to preview compose functions inside Android Studio.
Preview can not be used on Composables that have parameters without a default parameter.

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
<p align="center">
  <img src ="../../../images/general/preview/ComposePreview.png"  height=100 width=300 />
</p>
