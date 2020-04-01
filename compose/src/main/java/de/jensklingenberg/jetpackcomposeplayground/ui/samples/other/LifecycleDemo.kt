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

package de.jensklingenberg.jetpackcomposeplayground.ui.samples.other


import android.util.Log
import androidx.compose.*
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme


@Composable
fun LifecycleDemo() {
    MaterialTheme {
        val count = state { 0 }

        Column {
            Button( onClick = {
                count.value++
            }){
                Text("Click me")
            }

            if (count.value < 3) {
                onActive { Log.d("Compose", "onactive with value: " + count.value) }
                onDispose { Log.d("Compose", "onDispose because value=" + count.value) }
                Text(text = "You have clicked the button: " + count.value.toString())
            }
        }
    }
}