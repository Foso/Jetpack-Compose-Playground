# Slider

!!! info
    This is the API of version 1.0.0-alpha02. Newer versions may have a different one

"Sliders allow users to make selections from a range of values."
    
<p align="center">
  <img src ="../../images/material/slider/sliderdemo.png" height=100 width=300 />
</p>


```kotlin
@Composable fun MySliderDemo() {
    var sliderPosition by remember { mutableStateOf(0f) }
    Text(text = sliderPosition.toString())
    Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
}
```


## See also:
* [Material.io](https://material.io/components/sliders)