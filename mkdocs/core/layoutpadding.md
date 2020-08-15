# LayoutPadding

!!! info
    This is the API of version dev16. Newer versions may have a different one

You can use **Modifier.padding** to set padding to composables that take a modifier as an argument.

<p align="left">
  <img src ="../../images/PaddingExample.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun PaddingDemo() {

    Column {
        Text("TextWithoutPadding")
        Column(modifier = Modifier.padding(start = 80.dp)){
            Text("TextWith80dpOnlyLeftPadding")
        }

        Column(Modifier.padding(all = 80.dp)){
            Text("TextWith80dpPadding")
        }
    }
}
```
