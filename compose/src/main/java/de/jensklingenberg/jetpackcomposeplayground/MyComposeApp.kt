package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.ui.material.Colors
import de.jensklingenberg.jetpackcomposeplayground.rally.RallyApp
import de.jensklingenberg.jetpackcomposeplayground.sample.Counter
import de.jensklingenberg.jetpackcomposeplayground.sample.RippleDemo
import de.jensklingenberg.jetpackcomposeplayground.sample.SelectionsControlsDemo
import de.jensklingenberg.jetpackcomposeplayground.sample.buttondemo.ButtonDemo
import de.jensklingenberg.jetpackcomposeplayground.sample.dividersSpacers.DividersDemo
import de.jensklingenberg.jetpackcomposeplayground.sample.text.SimpleComposable
import de.jensklingenberg.jetpackcomposeplayground.ui.CounterDemo

@Composable
fun MyComposeApp() {
    val page = 0

    when (page) {
        0 -> CounterDemo()
        1 -> SimpleComposable()
        2 -> ButtonDemo()
        3 -> RippleDemo()
        4 -> SelectionsControlsDemo()
        5 -> RallyApp()
        6 -> Counter()
        7-> DividersDemo()
    }


}