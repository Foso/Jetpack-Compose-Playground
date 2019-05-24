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

package de.jensklingenberg.jetpackcomposeplayground.samples.rally

import androidx.ui.core.Text
import androidx.ui.core.dp

import androidx.ui.material.themeTextStyle
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.CraneWrapper
import androidx.ui.layout.*
import de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents.Scaffold

/**
 * This Activity recreates the Rally Material Study from
 * https://material.io/design/material-studies/rally.html
 */

@Composable
fun RallyApp() {
    CraneWrapper {
        RallyTheme {
            Scaffold(appBar = { RallyAppBar() }) {
                VerticalScroller {
                    RallyBody()
                }
            }
        }
    }

}

@Composable
fun RallyAppBar() {
    // TODO: Transform to tabs
    Row {
        // Icon()
        Text(text = "Overview", style = +themeTextStyle { h4 })
        // TODO: Other items
    }
}


@Composable
fun RallyBody() {
    Padding(padding = 16.dp) {
        Column {
            // TODO: scrolling container
            RallyAlertCard()
            HeightSpacer(height = 10.dp)
            RallyAccountsCard()
            HeightSpacer(height = 10.dp)
            RallyBillsCard()
        }
    }
}