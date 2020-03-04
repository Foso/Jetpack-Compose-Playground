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

package androidx.ui.material.samples


import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.CircleShape
import androidx.ui.layout.Spacer
import androidx.ui.material.BottomAppBar
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.IconButton
import androidx.ui.material.Scaffold
import androidx.ui.material.TopAppBar
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Favorite
import androidx.ui.material.icons.filled.Menu
import androidx.ui.res.loadVectorResource
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R

@Composable fun menuIcon() = loadVectorResource(R.drawable.ic_crane).resource.resource!!
@Composable fun favIcon() = loadVectorResource(R.drawable.favorite).resource.resource!!

@Composable
fun SimpleTopAppBar() {



    TopAppBar(
        title = { Text("Simple TopAppBar") },
        navigationIcon = {

            IconButton(onClick = { /* doSomething() */ }) {
                Icon(menuIcon())
            }
        },
        actions = {
            // RowScope here, so these icons will be placed horizontally
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(favIcon())
            }
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(favIcon())
            }
        }
    )
}


@Composable
fun SimpleBottomAppBar() {
    BottomAppBar {
        IconButton(onClick = { /* doSomething() */ }) {
            Icon(menuIcon())
        }
        // The actions should be at the end of the BottomAppBar
        Spacer(LayoutFlexible(1f))
        IconButton(onClick = { /* doSomething() */ }) {
            Icon(favIcon())
        }
        IconButton(onClick = { /* doSomething() */ }) {
            Icon(favIcon())
        }
    }
}


@Composable
fun SimpleBottomAppBarCutoutWithScaffold() {
    val fabShape = CircleShape

    Scaffold(
        bottomAppBar = { fabConfiguration ->
            BottomAppBar(fabConfiguration = fabConfiguration, cutoutShape = fabShape) {
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.Favorite)
                }
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(Icons.Filled.Favorite)
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(shape = fabShape, onClick = { /* doSomething() */ }) {
                Text("Click me!")
            }
        },
        floatingActionButtonPosition = Scaffold.FabPosition.EndDocked
    ) {
        Text("Your app goes here")
    }
}