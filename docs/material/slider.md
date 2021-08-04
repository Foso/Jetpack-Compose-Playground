# Slider

!!! info
    This is the API of version 1.0.1

"Sliders allow users to make selections from a range of values."
    
<p align="center">
  <img src ="{{ site.images }}/material/slider/sliderdemo.png" height=100 width=300 />
</p>


```kotlin
@Composable
fun MySliderDemo() {
    var sliderPosition by remember { mutableStateOf(0f) }
    Text(text = sliderPosition.toString())
    Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
}
```


## See also:
* [Material.io](https://material.io/components/sliders)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#slider)
* [Full Example Code]({{ site.samplefolder }}/material/slider/MySliderDemo.kt)
