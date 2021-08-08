<!---
This is the API of version 1.0.1
-->
# Modifier

Modifiers can be used modify certain aspects of a Composable.
To set them, a Composable needs to accept a modifier as a parameter.

## Combine modifiers    
```kotlin
Column(modifier = Modifier.height(500.dp).padding(100.dp)) {
    Text("Hello")
}
```
You can chain multiple modifiers.
The order is important modifier elements to the left are applied before modifier elements to the right.

## Some Modifiers
The Compose libraries already contain some useful modifiers.
 
### LayoutModifier

#### Modifier.width()
You can use this to set the width of a Composable.

#### Modifier.height()
You can use this to set the height of a Composable.

#### Modifier.size()
You can use this to set the width and height of a Composable.

#### Modifier.fillMaxHeight()
This will set the height of the Composable to the maximum available height. This is similar to **MATCH_PARENT** from the classic View system.

#### Modifier.fillMaxWidth()
This will set the width of the Composable to the maximum available width. This is similar to **MATCH_PARENT** from the classic View system.

#### Modifier.fillMaxSize()
This will set the height/width of the Composable to the maximum available height/width

####  Modifier.padding()
You can use **Modifier.padding** to set padding to Composables that take a modifier as an argument.

<p align="left">
  <img src ="../../images/general/modifier/PaddingExample.png" height=100 width=300 />
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

### DrawModifier

#### Modifier.background()
With this modifier you can set a background color/shape for the Composable

#### Modifier.clip()
This modifier can clip the Composable to rectangle, rounded, or circle

### GestureModifier

#### Modifier.clickable
Configure component to receive clicks via input or accessibility "click" event.


#### Modifier.scrollable
You can use this to make a Composable scrollable

#### Modifier.draggable
You can use this to make a Composable draggable

#### Modifier.swipeable
You drag elements which, when released, animate towards typically two or more anchor points defined in an orientation

#### Multitouch: Panning, zooming, rotating
To detect multitouch gestures used for panning, zooming and rotating, you can use the ``transformable`` modifier. This modifier does not transform elements by itself, it only detects the gestures.


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/ui/Modifier)
