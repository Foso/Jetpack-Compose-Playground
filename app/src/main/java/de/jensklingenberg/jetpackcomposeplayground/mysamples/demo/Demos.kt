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

package de.jensklingenberg.jetpackcomposeplayground.mysamples.demo

import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.activity.ActivityDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.animation.AnimationDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation.FoundationDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.general.GeneralDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout.LayoutDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.MaterialDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.other.OtherDemos
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.ui.UIDemos


/**
 * [DemoCategory] containing all the top level demo categories.
 */
val AllDemosCategory = DemoCategory(
    "Jetpack Compose Playground Demos",
    listOf(
        AnimationDemos,
        FoundationDemos,
        LayoutDemos,
        MaterialDemos,
        GeneralDemos,
        OtherDemos,
        ActivityDemos,
        UIDemos
    )
)