# LayoutPadding

You can use the [LayoutPadding](https://developer.android.com/reference/kotlin/androidx/ui/layout/LayoutPadding) modifier to set padding to composables that take a modifier as an argument.

<p align="left">
  <img src ="../../images/PaddingExample.png" height=500 />
</p>

```kotlin
@Composable
fun PaddingDemo() {
    Column {
        Text("TextWithoutPadding")
        Column(modifier = LayoutPadding(start = 80.dp)){
            Text("TextWith80dpOnlyLeftPadding")
        }
        Column(LayoutPadding(all=80.dp)){
            Text("TextWith80dpPadding")
        }
    }
}
```
