/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material


import SnackbarDemo
import de.jensklingenberg.jetpackcomposeplayground.mysamples.demo.ComposableDemo
import de.jensklingenberg.jetpackcomposeplayground.mysamples.demo.DemoCategory
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.button.ButtonExample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.card.CardDemo
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.checkbox.CheckBoxDemo
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.circularprogress.CircularProgressIndicatorSample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.dropdown.DropdownDemo
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.floatingactionbutton.FloatingActionButtonDemo
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.linearprogress.LinearProgressIndicatorSample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.modaldrawer.ModalDrawerSample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.radiobutton.RadioButtonSample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.alertdialog.AlertDialogSample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.scaffold.ScaffoldDemo


val MaterialDemos = DemoCategory(
    "MaterialDemos",
    listOf(
        ComposableDemo("AlertDialogSample") { AlertDialogSample() },
        ComposableDemo("ButtonExample") { ButtonExample() },
        ComposableDemo("CardDemo") { CardDemo() },
        ComposableDemo("CheckBoxDemo") { CheckBoxDemo() },
        ComposableDemo("CircularProgressIndicatorSample") { CircularProgressIndicatorSample() },
        ComposableDemo("DropdownDemo") { DropdownDemo() },
        ComposableDemo("FloatingActionButtonDemo") { FloatingActionButtonDemo() },
        ComposableDemo("LinearProgressIndicatorSample") { LinearProgressIndicatorSample() },
        ComposableDemo("ModalDrawerLayoutSample") { ModalDrawerSample() },
        ComposableDemo("RadioButtonSample") { RadioButtonSample() },
        ComposableDemo("ScaffoldDemo") { ScaffoldDemo() },
        ComposableDemo("SnackbarDemo") { SnackbarDemo() },

        )
)
