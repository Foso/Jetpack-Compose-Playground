package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.SubcomposeLayout
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.IntSize


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
         * We can place the Composables on the screen
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