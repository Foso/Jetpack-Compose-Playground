# SubComposeLayout

You can use SubComposeLayout to measure and resize Composables.

# Example
Let`s say you have a chat log this:

<p align="center">
   <img src ="{{ site.images }}/ui/layout/chatbefore.png"  height=100 width=200  />
</p>

And know you want to set the width of every composable to the width of the widest Composable 

<p align="center">
   <img src ="{{ site.images }}/ui/layout/chatafter.png"  height=100 width=200  />
</p>

You can use the SubcomposeLayout to get the height/width of every child composable and then you can resize 
the values to the one that you want. 

```kotlin
@Composable
fun SubComposeLayoutDemo() {
    ResizeWidthColumn(Modifier.fillMaxWidth(), true) {

        Box(
            modifier = Modifier
                .background(Color.Red)
        ) {
            Text("Hello")
        }

        Box(
            modifier = Modifier
                .background(Color.Red)
        ) {
            Text("This is a long messsage \n and its longer")
        }
    }
}

@Composable
fun ResizeWidthColumn(modifier: Modifier, resize: Boolean, mainContent: @Composable () -> Unit) {
    SubcomposeLayout(modifier) { constraints ->
        val mainPlaceables = subcompose(SlotsEnum.Main, mainContent).map {
            // Here we measure the width/height of the child Composables
            it.measure(Constraints())
        }

        //Here we find the max width/height of the child Composables
        val maxSize = mainPlaceables.fold(IntSize.Zero) { currentMax, placeable ->
            IntSize(
                width = maxOf(currentMax.width, placeable.width),
                height = maxOf(currentMax.height, placeable.height)
            )
        }

        val resizedPlaceables: List<Placeable> =
            subcompose(SlotsEnum.Dependent, mainContent).map {
                if (resize) {
                    /** Here we rewrite the child Composables to have the width of
                     * widest Composable
                     */
                    it.measure(
                        Constraints(
                            minHeight = maxSize.height,
                            minWidth = maxSize.width
                        )
                    )
                } else {
                    // Ask the child for its preferred size.
                    it.measure(Constraints())
                }
            }

        /**
         * We can place the Compoables on the screen
         * with layout() and the place() functions
         */
        layout(constraints.maxWidth, constraints.maxHeight) {
            resizedPlaceables.forEachIndexed { index, placeable ->
                val widthStart = resizedPlaceables.take(index).sumOf { it.measuredHeight }
                placeable.place(0, widthStart)
            }
        }
    }
}


enum class SlotsEnum {
    Main,
    Dependent

}

```


## See also:
* [Official Docs]({{ site.composedoc }}/ui/layout/package-summary#SubcomposeLayout(androidx.compose.ui.Modifier,kotlin.Function2))
* [Full Example Code]({{ site.samplefolder }}/ui/layout/SubComposeLayoutExample.kt)


