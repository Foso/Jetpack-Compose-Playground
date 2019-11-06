package de.jensklingenberg.jetpackcomposeplayground.data

import androidx.ui.animation.Crossfade
import de.jensklingenberg.jetpackcomposeplayground.model.Page
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation.*

import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation.StateBasedRippleDemo
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.common.MultipleCollectTest
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.layout.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.rally.RallyApp
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.text.TextDemo


val animationDemos = listOf(
    Page("FancyScrollingExample") { FancyScrollingExample() },

    Page("AnimatableSeekBar") { AnimatableSeekBarDemo() },
    Page("HelloGesture") { HelloGestureDemo() },
    Page("HelloAnimation") { HelloAnimationDemo() },
    Page("RepeatedRotation") { RepeatedRotation() },
    Page("SpringBackScrolling") { SpringBackScrollingDemo() },
    Page("SwipeToDismiss") { SwipeToDismissDemo() },
    Page("CrossfadeDemo") { CrossfadeDemo() }



)

val layoutDemos = listOf(
    Page("Rowdemo") { RowDemo() },
    Page("ColumnDemo") { ColumnDemo() },
    Page("StackDemo") { StackDemo() }

)

val otherDemos = listOf(
    Page("RallyApp") { RallyApp() },
    Page("CounterDemo") { CounterDemo() }

)

val mainPagesEntries = animationDemos + layoutDemos + otherDemos + listOf(

    Page("TextDemo") { TextDemo() },
    Page("ButtonDemo") { ButtonDemo() },
    Page("CounterModelDemo") { CounterModelDemo() },
    Page("DividersDemo") { DividersDemo() },
    Page("ProgressIndicatorDemo") { ProgressIndicatorDemo() },
    Page("SelectionsControlsDemo") { SelectionsControlsDemo() },
    Page("VerticalScrollerDemo") { VerticalScrollerDemo() },

    Page("StateBasedRippleDemo") { StateBasedRippleDemo() },
    Page("MultipleCollectTest") { MultipleCollectTest() },
    Page("InputFieldDemo") { InputFieldDemo() }
)
