/*
 * Copyright 2019 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.jensklingenberg.jetpackcomposeplayground.ui

import androidx.compose.Composable
import androidx.compose.State
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.material.Button
import androidx.ui.material.Divider
import de.jensklingenberg.jetpackcomposeplayground.data.mainPagesEntries


@Composable
fun HomeScreen(pageIndex: State<Int>) {

    val dividerColor = Color(0xFFC6C6C6.toInt())

    VerticalScroller {
        Column {
            mainPagesEntries.forEachIndexed { index, page ->
                HeightSpacer(height = 10.dp)
                Button(page.title, onClick = {
                    pageIndex.value = index
                })
                HeightSpacer(height = 10.dp)
                Divider(color = dividerColor, height = 0.5.dp)
            }


        }


    }
}


