package de.jensklingenberg.jetpackcomposeplayground.ui

import androidx.compose.*
import androidx.ui.baseui.selection.Toggleable
import androidx.ui.core.CraneWrapper
import androidx.ui.core.Draw
import androidx.ui.core.toRect
import androidx.ui.core.vectorgraphics.Brush
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.painting.Paint


class Navigator() {
    val test = +state { { } }
    var start = true


    fun setPage(function: () -> Unit) {
        start = false

        test.value = function

    }

    fun setStartPage(function: () -> Unit) {
        if (start) {
            test.value = function
            start = false
        }
    }
}


@Composable
fun EmptyPage() {
    Toggleable { }

}

@Composable
fun navigate(context: Composer<*>, state: State<() -> Unit>, @Children children: @Composable() () -> Unit) {

    context.apply {
        Column() {
            state.value.invoke()

        }
    }


}


@Composable
fun PageRouter(
    navigator: Navigator,
    @Children children: @Composable() (Navigator) -> Unit
) {

    Column(crossAxisAlignment = CrossAxisAlignment.Start) {
        children(navigator)

    }

}


@Composable
private fun DrawFillRect(brush: Brush) {
    Draw { canvas, parentSize ->
        val paint = Paint()
        brush.applyBrush(paint)
        canvas.drawRect(parentSize.toRect(), paint)
    }
}

@Composable
fun NavigationApp() {
    CraneWrapper {

        val navigator = Navigator()

        MaterialTheme {

            Column {
                Button(
                    text = "CounterDemo",
                    onClick = {

                    })

                PageRouter(navigator) {

                    it.test.value.invoke()

                }
            }


        }

    }


}


