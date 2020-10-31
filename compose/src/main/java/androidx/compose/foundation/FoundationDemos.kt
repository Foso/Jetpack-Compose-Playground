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

package androidx.compose.foundation

import androidx.compose.foundation.demos.DrawModifiersDemo
import androidx.compose.foundation.demos.HighLevelGesturesDemo
import androidx.compose.foundation.demos.LazyListDemos
import androidx.compose.foundation.samples.ControlledScrollableRowSample
import androidx.compose.foundation.samples.MultipleInteractionStateSample
import androidx.compose.foundation.samples.PriorityInteractionStateSample
import androidx.compose.foundation.samples.ScrollableColumnSample
import androidx.ui.ComposableDemo


import androidx.ui.DemoCategory

val FoundationDemos = DemoCategory(
    "Foundation",
    listOf(
        ComposableDemo("Draggable, Scrollable, Zoomable") { HighLevelGesturesDemo() },
        ComposableDemo("Scrollable Column") { ScrollableColumnSample() },
        ComposableDemo("Controlled Scrollable Row") { ControlledScrollableRowSample() },
        ComposableDemo("Draw Modifiers") { DrawModifiersDemo() },
        DemoCategory("Lazy lists", LazyListDemos),
        ComposableDemo("Priority InteractionState") { PriorityInteractionStateSample() },
        ComposableDemo("Multiple-interaction InteractionState") { MultipleInteractionStateSample() }
    )
)
