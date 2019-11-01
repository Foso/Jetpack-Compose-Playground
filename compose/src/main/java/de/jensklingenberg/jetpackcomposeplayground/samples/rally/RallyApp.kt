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

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.core.dp
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.LayoutSize
import androidx.ui.layout.Padding
import androidx.ui.material.Tab
import androidx.ui.material.TabRow
import de.jensklingenberg.jetpackcomposeplayground.samples.layout.Scaffold

/**
 * This Activity recreates the Rally Material Study from
 * https://material.io/design/material-studies/rally.html
 */

@Composable
fun RallyApp() {
    RallyTheme {
        val allScreens = RallyScreenState.values().toList()
        var currentScreen by +state { RallyScreenState.Overview }
        Scaffold(
            appBar = {
                TabRow(allScreens, selectedIndex = currentScreen.ordinal) { i, screen ->
                    Tab(text = screen.name, selected = currentScreen.ordinal == i) {
                        currentScreen = screen
                    }
                }
            }) {
            currentScreen.body()
        }
    }
}

@Composable
fun RallyBody() {
    VerticalScroller {
        Padding(16.dp) {
            Column(mainAxisSize = LayoutSize.Expand) {
                RallyAlertCard()
                HeightSpacer(height = 10.dp)
                RallyAccountsOverviewCard()
                HeightSpacer(height = 10.dp)
                RallyBillsOverviewCard()
            }
        }

    }
}

private enum class RallyScreenState {
    Overview, Accounts, Bills
}

@Composable
private fun RallyScreenState.body() = when (this) {
    RallyScreenState.Overview -> RallyBody()
    RallyScreenState.Accounts -> RallyAccountsCard()
    RallyScreenState.Bills -> RallyBillsCard()
}
