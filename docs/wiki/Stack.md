# Stack
<p align="left">
  <img src ="https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/screenshots/StackExample.png" height=500 />
</p>

```kotlin
/**
 * A widget that positions its children relative to its edges.
 * The component is useful for drawing children that overlap. The children will always be
 * drawn in the order they are specified in the body of the [Stack].
 *
 * [Stack] children can be:
 * - [StackChildren.aligned], which are aligned in the box of the [Stack]. These are also the
 * children that define the size of the [Stack] box: this will be the maximum between the
 * minimum constraints and the size of the largest child.
 * - [StackChildren.positioned], which are positioned in the box defined as above, according to
 * their specified insets. When the positioning of these is ambiguous in one direction (the
 * component has [null] left and right or top and bottom insets), the positioning in this direction
 * will be resolved according to the [Stack]'s defaultAlignment argument.
```



```kotlin

@Composable
        /**
         * @see wiki [https://github.com/Foso/Jetpack-Compose-Playground/wiki/Stack]
         */
fun StackDemo() {
    CraneWrapper {
        MaterialTheme {
            StackExample()
        }
    }
}

@Composable
fun StackExample() {
    Stack {

        aligned(Alignment.TopCenter) {
            Text(
                text = "This text is drawed first ",
                style = +themeTextStyle { h4 },
                textAlign = TextAlign.Center
            )
        }

        aligned(Alignment.BottomRight) {
            Padding(padding = EdgeInsets(0.dp, 12.dp, 12.dp, 12.dp)) {
                FloatingActionButton(
                    text = "+",
                    color = materialBlue
                )
            }
        }
        positioned(null, 20.dp, null, 20.dp) {
            ColoredRect(
                width = 50.dp,
                height = 50.dp,
                color = materialBlue
            )
        }
        aligned(Alignment.Center) {
            Text(
                text = "This text is drawed last ",
                style = +themeTextStyle { h4 },
                textAlign = TextAlign.Center
            )
        }

    }
}
```