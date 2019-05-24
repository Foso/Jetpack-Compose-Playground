package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import de.jensklingenberg.jetpackcomposeplayground.samples.DividersDemo
import de.jensklingenberg.jetpackcomposeplayground.samples.*
import de.jensklingenberg.jetpackcomposeplayground.samples.ProgressIndicatorDemo
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.RallyApp

@Composable
fun MyComposeApp() {
    // Change this value to browse the demos
    val page = 0

    when (page) {
        0 -> CounterDemo()
        1 -> TextDemo()
        2 -> ButtonDemo()
        3 -> RippleDemo()
        4 -> SelectionsControlsDemo()
        5 -> RallyApp()
        6 -> CounterModelDemo()
        7 -> DividersDemo()
        8 -> ProgressIndicatorDemo()
    }

}


