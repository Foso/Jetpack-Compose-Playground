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
import androidx.compose.state
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.DrawerState
import androidx.ui.material.MaterialTheme
import androidx.ui.material.ModalDrawerLayout
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout.CanvasDrawExample
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout.ColumnExample


@Composable
fun HomeScreen() {

    MaterialTheme {
        val (drawerState: androidx.ui.material.DrawerState, onDrawerStateChange: (DrawerState) -> Unit) = state { DrawerState.Closed }

        var currentScreen by state { RallyScreenState.Overview }

        ModalDrawerLayout(
            drawerState = drawerState,
            onStateChange = onDrawerStateChange,
            gesturesEnabled = drawerState == DrawerState.Opened,
            drawerContent = {
               myDrawerContent(onDrawerStateChange){
                   currentScreen=it
               }

            },
            bodyContent = {

                Column(modifier = LayoutWidth.Fill, arrangement = Arrangement.Center) {
                    Row(modifier = LayoutWidth.Fill, arrangement = Arrangement.Begin) {
                        Button(text = "Drawer", onClick = {
                            onDrawerStateChange(DrawerState.Opened)
                        })

                        Button(text = "Back", onClick = {
                            currentScreen = RallyScreenState.Overview
                        })
                    }

                    if (currentScreen == RallyScreenState.Overview) {
                        myOverView(){
                            currentScreen = it
                        }
                    } else {
                        currentScreen.body()
                    }

                }
            }
        )


    }

}
@Composable
fun myDrawerContent(onDrawerStateChange: (DrawerState) -> Unit, fn:(RallyScreenState)->Unit) {
    val allScreens = RallyScreenState.values().toList()

    VerticalScroller {
        Column(arrangement = Arrangement.Begin) {
            allScreens.forEach {

                Button(text = it.name, onClick = {
                    fn(it)
                    onDrawerStateChange(DrawerState.Closed)
                })

            }

        }
    }
}

@Composable
fun myOverView(fn:(RallyScreenState)->Unit){
    val allScreens = RallyScreenState.values().toList()

    allScreens.forEach {
        Row(modifier = LayoutWidth.Fill, arrangement = Arrangement.Center) {
            Button(text = it.name, onClick = {
                fn(it)
            })
        }
    }
}

enum class RallyScreenState {
    Overview, CANVAS, ColumnExample
}

@Composable
fun RallyScreenState.body() = when (this) {
    RallyScreenState.Overview -> CanvasDrawExample()
    RallyScreenState.CANVAS -> CanvasDrawExample()
    RallyScreenState.ColumnExample -> ColumnExample()

}
