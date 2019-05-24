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

package de.jensklingenberg.jetpackcomposeplayground.samples

import CircularProgressIndicator
import LinearProgressIndicator
import android.os.Handler
import androidx.ui.core.CraneWrapper
import androidx.ui.layout.FlexColumn
import androidx.ui.layout.MainAxisAlignment.Companion.SpaceEvenly
import androidx.ui.layout.Row
import androidx.ui.material.MaterialTheme
import androidx.ui.graphics.Color
import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.onActive
import androidx.compose.onDispose
import androidx.compose.unaryPlus

@Composable
fun ProgressIndicatorDemo(){
    CraneWrapper {
        MaterialTheme {
            ProgressIndicator()
        }
    }
}

@Composable
private fun ProgressIndicator() {

    FlexColumn {
        expanded(flex = 1f) {
            Row(mainAxisAlignment = SpaceEvenly) {
                // Indeterminate indicators
                LinearProgressIndicator()
                CircularProgressIndicator()
            }
        }
    }
}

