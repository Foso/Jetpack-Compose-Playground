package de.jensklingenberg.jetpackcomposeplayground.data

import de.jensklingenberg.jetpackcomposeplayground.model.Page
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.animation.HelloAnimation
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.animation.HelloGesture
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.animation.RepeatedRotation
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.animation.StateBasedRippleDemo
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.common.MultipleCollectTest
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.rally.RallyApp
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.text.TextDemo


val mainPagesEntries = listOf(
    //  Page("AppBarDemo") { AppBarDemo() },
    Page("TextDemo") { TextDemo() },
    Page("ButtonDemo") { ButtonDemo() },
    // Page("RippleDemo") { RippleDemo() },
    Page("CounterDemo") { CounterDemo() },
    Page("RallyApp") { RallyApp() },
    Page("CounterModelDemo") { CounterModelDemo() },
    Page("DividersDemo") { DividersDemo() },
    Page("ProgressIndicatorDemo") { ProgressIndicatorDemo() },
    Page("SelectionsControlsDemo") { SelectionsControlsDemo() },
    Page("VerticalScrollerDemo") { VerticalScrollerDemo() },
    Page("Rowdemo") { RowDemo() },
    Page("ColumnDemo") { ColumnDemo() },
    Page("StackDemo") { StackDemo() },
    Page("Animation") { HelloAnimation() },
    Page("HelloGesture") { HelloGesture() },
    Page("RepeatedRotation") { RepeatedRotation() },
    Page("StateBasedRippleDemo") { StateBasedRippleDemo() },
    Page("MultipleCollectTest") { MultipleCollectTest() },
    Page("InputFieldDemo") { InputFieldDemo() }


)
