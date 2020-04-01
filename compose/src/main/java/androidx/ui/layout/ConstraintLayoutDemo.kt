/*
 * Copyright 2019 The Android Open Source Project
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

package androidx.ui.layout.demos

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.tag
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.drawBackground
import androidx.ui.graphics.Color
import androidx.ui.layout.ConstraintLayout
import androidx.ui.layout.ConstraintSet
import androidx.ui.layout.fillMaxHeight
import androidx.ui.layout.fillMaxSize
import androidx.ui.layout.preferredSize
import androidx.ui.layout.preferredWidth
import androidx.ui.unit.dp

/**
 * Simple ConstraintLayout demo
 */
@Composable
fun ConstraintLayoutDemo() {
//    Demo1()
//    Demo2()
    Demo3()
}



@Composable
fun Demo3() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize(),
        constraintSet = ConstraintSet {
            val box1 = tag("box1")
            val box2 = tag("box2")
            val box3 = tag("box3")

            box1.center()

            val half = createGuidelineFromLeft(percent = 0.5f)
            box2.apply {
                left constrainTo half
                left.margin = 150.dp
                bottom constrainTo box1.top
            }

            box3.apply {
                left constrainTo parent.left
                left.margin = 150.dp
                bottom constrainTo parent.bottom
                bottom.margin = 150.dp
            }
        }
    ) {
        for (i in 0 until 3) {
            Box(Modifier.tag("box$i").preferredSize(100.dp, 100.dp), backgroundColor = Color.Blue)
        }
    }
}