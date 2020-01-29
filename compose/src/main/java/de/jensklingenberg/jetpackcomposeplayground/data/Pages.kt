package de.jensklingenberg.jetpackcomposeplayground.data

import androidx.ui.foundation.samples.AnchoredDraggableSample
import androidx.ui.foundation.samples.ControlledHorizontalScrollerSample

import androidx.ui.foundation.samples.DraggableSample
import androidx.ui.framework.samples.TextFieldSampleDemo
import androidx.ui.material.samples.SimpleDataTable
import androidx.ui.text.demos.InputFieldDemo
import de.jensklingenberg.jetpackcomposeplayground.model.Page
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation.*

import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation.StateBasedRippleDemo
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.layout.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.material.*


import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.rally.RallyApp
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.text.ButtonDemo
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.CounterDemo
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.text.TextDemo
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.other.CounterModelDemo


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
    Page("SimpleStack") { SimpleStack() },
   // Page("StackDemo") { StackDemo() },

    //Scroller
    Page("VerticalScrollerDemo") { VerticalScrollerDemo() },
    Page("ControlledHorizontalScrollerSample") { ControlledHorizontalScrollerSample() },


    //Table
    Page("SimpleTable") { SimpleTable() },
    Page("TableWithDecorations") { TableWithDecorations() },
    Page("TableWithDifferentColumnWidths") { TableWithDifferentColumnWidths() },

    //Flow
    Page("SimpleFlowColumn") { SimpleFlowColumn() },
    Page("SimpleFlowRow") { SimpleFlowRow() }

    //ExpandedModifier


)

val materialDemos = listOf(
    Page("RallyApp") { RallyApp() },
    Page("ButtonDemo") { ButtonDemo() },

    //Dialogs
    Page("SideBySideAlertDialogSample") { SideBySideAlertDialogSample() },
    Page("SideBySideAlertDialogSample") { StackedAlertDialogSample() },
    Page("CustomAlertDialogSample") { CustomAlertDialogSample() },

    //Table
    Page("SimpleDataTable") { SimpleDataTable() }
)

val foundationDemos = listOf(
    Page("DraggableSample") { DraggableSample() },
    Page("AnchoredDraggableSample") { AnchoredDraggableSample() }
)

val otherDemos = listOf(
    Page("RallyApp") { RallyApp() },
    Page("CounterDemo") { CounterDemo() }
)


val mainPagesEntries = animationDemos +foundationDemos+ layoutDemos + materialDemos + otherDemos + listOf(
    Page("TextDemo") { TextDemo() },
    Page("CounterModelDemo") { CounterModelDemo() },
    Page("DividersDemo") { DividersDemo() },
    Page("ProgressIndicatorDemo") { ProgressIndicatorDemo() },
    Page("SelectionsControlsDemo") { SelectionsControlsDemo() },
    Page("StateBasedRippleDemo") { StateBasedRippleDemo() },
  //  Page("MultipleCollectTest") { MultipleCollectTest() },
  //  Page("MultipleCollectTest") { MultipleCollectTest() },
    Page("InputFieldDemo") { InputFieldDemo() },
    Page("TextFieldSampleDemo") { TextFieldSampleDemo() }



)
