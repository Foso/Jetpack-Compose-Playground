# Box

!!! info
    This is the API of version 1.0.0-alpha02. Newer versions may have a different one

A Box can be used as wrapper Composable around Composables where want to apply things like backgroundColor, a [Shape](./shape.md) or padding.
If you wrap your composable in a Box without any parameters, you won't notice any difference. This is because by default the Box has the width/height of the child composables.

The **padding** parameters will be applied to the child composable. When you want to apply padding to the Box, you have to use the padding Modifier.
<p align="center">
  <img src ="../../images/foundation/box/boxdemo.png" />
</p>

```kotlin
@Composable
fun BoxDemo(){
    Box(
        shape = CircleShape,
        backgroundColor = Color.Red,
        border = BorderStroke(8.dp, Color.Blue),
        padding = 16.dp
    ) {
        Text("HELLO")
    }
}
```

## See also:
* [Official Docs/Box](https://developer.android.com/reference/kotlin/androidx/compose/foundation/package-summary#box)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/foundation/BoxDemo.kt)
