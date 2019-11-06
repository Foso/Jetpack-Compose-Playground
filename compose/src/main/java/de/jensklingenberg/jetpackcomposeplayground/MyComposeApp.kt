package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.compose.State
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.animation.Crossfade
import androidx.ui.core.Text
import androidx.ui.layout.CrossAxisAlignment
import androidx.ui.layout.FlexColumn
import androidx.ui.material.*
import androidx.ui.material.surface.Surface
import de.jensklingenberg.jetpackcomposeplayground.data.mainPagesEntries
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.*
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.R
import de.jensklingenberg.jetpackcomposeplayground.ui.HomeScreen
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.layout.AppDrawer


@Composable
fun MainPage() {
    val pageIndex = +state { -1 }

    val (drawerState: DrawerState, onDrawerStateChange: (DrawerState) -> Unit) = +state { DrawerState.Closed }

    MaterialTheme(
        colors = lightThemeColors,
        typography = themeTypography
    ) {
        ModalDrawerLayout(
            drawerState = drawerState,
            onStateChange = onDrawerStateChange,
            gesturesEnabled = drawerState == DrawerState.Opened,
            drawerContent = {
                AppDrawer(
                    closeDrawer = { onDrawerStateChange(DrawerState.Closed) },
                    pageIndex = pageIndex
                )
            },
            bodyContent = {
                AppContent({
                    onDrawerStateChange(
                        DrawerState.Opened
                    )
                }, pageIndex)
            }
        )
    }

}


@Composable
private fun AppContent(
    openDrawer: () -> Unit,
    pageIndex: State<Int>
) {

    Crossfade(JetnewsStatus.currentScreen) { screen ->
        Surface(color = +themeColor { background }) {
            FlexColumn(crossAxisAlignment = CrossAxisAlignment.Center) {
                inflexible {
                    TopAppBar(
                        title = { Text(text = "Jetpack Compose Playground") },
                        navigationIcon = {
                            VectorImageButton(
                                R.drawable.ic_menu_24px
                            ) {
                                openDrawer()
                            }
                        }
                    )
                }
                expanded(1F) {
                    when (pageIndex.value) {
                        -1 -> {
                            HomeScreen(
                                pageIndex
                            )
                        }
                        else -> {
                            mainPagesEntries[pageIndex.value].function.invoke()
                        }
                    }


                }
            }


        }
    }
}


