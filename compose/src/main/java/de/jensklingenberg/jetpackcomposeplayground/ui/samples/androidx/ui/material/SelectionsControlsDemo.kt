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

package de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.material

import androidx.compose.Composable
import androidx.compose.memo
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.selection.ToggleableState
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.EdgeInsets
import androidx.ui.layout.MainAxisAlignment
import androidx.ui.layout.Padding
import androidx.ui.layout.Row
import androidx.ui.material.*
import androidx.ui.material.surface.Surface


private val customColor = Color(0xFFFF5722.toInt())
private val customColor2 = Color(0xFFE91E63.toInt())
private val customColor3 = Color(0xFF607D8B.toInt())

@Composable
fun SelectionsControlsDemo() {
    MaterialTheme {
        SelectionsControls()
    }

}


@Composable
fun SelectionsControls() {

    val headerStyle = (+MaterialTheme.typography()).h6
    val padding = EdgeInsets(10.dp)

    Padding(padding = padding) {
        Column {
            Text(text = "Checkbox", style = headerStyle)
            Padding(padding = padding) {
                TriStateCheckboxSample()
            }
            Text(text = "Switch", style = headerStyle)
            Padding(padding = padding) {
                SwitchSample()
            }
            Text(text = "RadioButton", style = headerStyle)
            Padding(padding = padding) {
                RadioButtonSample()
            }
            Text(text = "Radio group :: Default usage", style = headerStyle)
            Padding(padding = padding) {
                DefaultRadioGroupSample()
            }
            Text(text = "Radio group :: Custom usage", style = headerStyle)
            Padding(padding = padding) {
                CustomRadioGroupSample()
            }
        }
    }
}

