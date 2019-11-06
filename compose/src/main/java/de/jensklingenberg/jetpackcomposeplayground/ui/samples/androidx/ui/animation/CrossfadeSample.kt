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

package de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation

import android.util.Log
import androidx.compose.Composable
import androidx.compose.memo
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.animation.Crossfade
import androidx.ui.core.*
import androidx.ui.core.gesture.PressReleasedGestureDetector
import androidx.ui.graphics.Canvas
import androidx.ui.graphics.Color
import androidx.ui.graphics.Paint
import androidx.ui.layout.Container
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.FlexRow
import androidx.ui.material.MaterialTheme
import kotlin.random.Random

@Composable
fun CrossfadeDemo() {
    MaterialTheme {
        var current by +state { tabs[0] }
        FlexColumn {
            inflexible {
                FlexRow {
                    tabs.forEach {
                        flexible(flex = 1f) {
                            PressReleasedGestureDetector(onRelease = {
                                Log.e("Crossfade", "Switch to $it")
                                current = it
                            }) {
                                Container(expanded = true, height = 48.dp) {
                                    DrawTab(tab = it)
                                }
                            }
                        }
                    }
                }
            }
            flexible(1f) {
                Crossfade(current = current) { tab ->
                    tab.lastInt = +memo { Random.nextInt() }
                    Container(expanded = true) {
                        DrawTab(tab = tab)
                    }
                }
            }
    }

    }
}

@Composable
private fun DrawTab(tab: Tab) {
    Draw { canvas: Canvas, parentSize: PxSize ->
        canvas.drawRect(parentSize.toRect(), Paint().apply { color = tab.color })
    }
}

private val tabs = listOf(
    Tab(Color(1f, 0f, 0f)),
    Tab(Color(0f, 1f, 0f)),
    Tab(Color(0f, 0f, 1f))
)

private data class Tab(val color: Color) {
    var lastInt: Int = 0
        set(value) {
            if (value != field) {
                Log.e("Crossfade", "State recreated for $color")
                field = value
            }
        }
}