package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.modaldrawer

import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.runtime.Composable

@Composable
fun ModalDrawerLayoutSample() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    ModalDrawerLayout(
            drawerState = drawerState,
            drawerContent = {
                Column {
                    Text("Text in Drawer")
                    Button(onClick = { drawerState.close() }) {
                        Text("Close Drawer")
                    }
                }
            },
            bodyContent = {
                Column {
                    Text("Text in Bodycontext")
                    Button(onClick = { drawerState.open() }) {
                        Text("Click to open")
                    }
                }
            }
    )
}
