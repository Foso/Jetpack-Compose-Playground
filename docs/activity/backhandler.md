<!---
This is the API of version 1.1.1
-->

# BackHandler

You can use BackHandler to detect the presses on the device back button inside of Compose

## Example
```kotlin
@Composable
fun BackHandlerExample() {
    var backPressedCount by remember { mutableStateOf(0) }
    BackHandler(enabled = true, onBack = {
        backPressedCount += 1
    })
    Text(text="Backbutton was pressed : $backPressedCount times")
}
```

<p align="left">
  <img src ="{{ site.images }}/activity/backhandler/backhandler.png"  height=100 width=200  style="border: 1px solid black;"  />
</p>

## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/activity/compose/package-summary#backhandler)
* [Full Example Code]({{ site.samplefolder }}/activity/backhandler/BackHandlerExample.kt)