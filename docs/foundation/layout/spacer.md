<!---
This is the API of version 1.0.4
-->

# Spacer

Spacer is a Composable that can be used when you want to add an additional space between Composables

<p align="center">
  <img src ="../{{ site.images }}/foundation/layout/spacer/spacer.png" height=50 width=50 style="border: 1px solid black;" />
</p>

## Example

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
