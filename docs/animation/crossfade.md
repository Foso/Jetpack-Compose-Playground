# Crossfade

!!! info
    This is the API of version 1.0.0-alpha12. Newer versions may have a different one

Crossfade can be used to switch between Composables with an crossfade animation.

<div>
<video height="500" align="center" controls>
  <source src="../../images/animation/crossfade/crossfadedemo.webm" type="video/webm" align="center">
</video>
</div>
Example video of the code below. On every button click, the content of the screen will change with an animation duration of 3 seconds.

```kotlin
enum class MyColors(val color: Color) {
    Red(Color.Red), Green(Color.Green), Blue(Color.Blue)
}

@Composable
fun CrossfadeDemo() {
    var currentColor by remember { mutableStateOf(MyColors.Red) }
    Column {
        Row {
            MyColors.values().forEach { myColors ->
                Button(
                        onClick = { currentColor = myColors },
                        Modifier.weight(1f, true)
                                .preferredHeight(48.dp).background(myColors.color),colors = ButtonDefaults.buttonColors(backgroundColor = myColors.color)
                ) {
                    Text(myColors.name)
                }
            }
        }
        Crossfade(targetState = currentColor, animationSpec = tween(3000)) { selectedColor ->
            Box(modifier = Modifier.fillMaxSize().background(selectedColor.color))
        }
    }
}
```

## How does it work?
As you can see in the video above, this demo consists of a screen with 3 buttons at the top. On a button click, the screen below will change to the selected color.

```kotlin
Crossfade(targetState = currentColor, animationSpec = tween(3000)) { selectedColor ->
   Box(modifier = Modifier.fillMaxSize().background(selectedColor.color))
}
```

Crossfade expects some kind of state to detect when it should recompose. In this example, this is **currentColor**, which is a state with the selected color enum. This state will be set to the **current** parameter.

With the **animationSpec** parameter, you can set which animation should be used to switch between the Composables. The default parameter here is the **tween** animation. You can choose between any class that implements **AnimationSpec**.
The **3000** in this example is the duration that the tween animation will have.

The last parameter is the body of the Crossfade Composable. Here you have to create the UI that you want to display. **selectedColor** is the current value of **currentColor**. In this example i'm using a Box to display the colors.
Everytime one of the 3 buttons is clicked, the value of currentColor will change and the Crossfade will recompose with an animation between the old and new UI.


## See also:
* [Full Example Code]({{ site.samplefolder }}/animation/crossfade/CrossfadeDemo.kt)
