package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.material.*
import de.jensklingenberg.jetpackcomposeplayground.ui.HomeScreen
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout.AppDrawer


@Composable
fun MainPage() {
    val navigator = Navigator()
    navigator.setHome {
        HomeScreen(
            navigator.getIndex()
        )
    }

    val (drawerState: DrawerState, onDrawerStateChange: (DrawerState) -> Unit) = state { DrawerState.Closed }

    MaterialTheme() {
        ModalDrawerLayout(
            drawerState = drawerState,
            onStateChange = onDrawerStateChange,
            gesturesEnabled = drawerState == DrawerState.Opened,
            drawerContent = {
                AppDrawer(
                    closeDrawer = { onDrawerStateChange(DrawerState.Closed) },
                    navigator = navigator
                )
            },
            bodyContent = {
                AppContent(navigator) {
                    MyAppBar {
                        onDrawerStateChange(
                            DrawerState.Opened
                        )
                    }
                }
            }
        )
    }

}





