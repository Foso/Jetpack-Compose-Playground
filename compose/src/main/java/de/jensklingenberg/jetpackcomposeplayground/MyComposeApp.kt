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
import de.jensklingenberg.compocialmedia.lightThemeColors
import de.jensklingenberg.compocialmedia.themeTypography
import de.jensklingenberg.jetpackcomposeplayground.samples.common.MultipleCollectTest
import de.jensklingenberg.jetpackcomposeplayground.model.Page
import de.jensklingenberg.jetpackcomposeplayground.samples.*
import de.jensklingenberg.jetpackcomposeplayground.samples.R
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.HelloAnimation
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.HelloGesture
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.RepeatedRotation
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.StateBasedRippleDemo
import de.jensklingenberg.jetpackcomposeplayground.samples.layout.*
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.RallyApp
import de.jensklingenberg.jetpackcomposeplayground.samples.text.TextDemo


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
                AppContent({ onDrawerStateChange(DrawerState.Opened) }, pageIndex)
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
                            VectorImageButton(R.drawable.ic_menu_24px) {
                                openDrawer()
                            }
                        }
                    )
                }
                expanded(1F) {
                    when (pageIndex.value) {
                        -1 -> {
                            HomeScreen(pageIndex)
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


val mainPagesEntries = listOf(
    //  Page("AppBarDemo") { AppBarDemo() },
    Page("TextDemo") { TextDemo() },
    Page("ButtonDemo") { ButtonDemo() },
    // Page("RippleDemo") { RippleDemo() },
    Page("CounterDemo") { CounterDemo() },
    Page("RallyApp") { RallyApp() },
    Page("CounterModelDemo") { CounterModelDemo() },
    Page("DividersDemo") { DividersDemo() },
    Page("ProgressIndicatorDemo") { ProgressIndicatorDemo() },
    Page("SelectionsControlsDemo") { SelectionsControlsDemo() },
    Page("VerticalScrollerDemo") { VerticalScrollerDemo() },
    Page("Rowdemo") { RowDemo() },
    Page("ColumnDemo") { ColumnDemo() },
    Page("StackDemo") { StackDemo() },
    Page("Animation") { HelloAnimation() },
    Page("HelloGesture") { HelloGesture() },
    Page("RepeatedRotation") { RepeatedRotation() },
    Page("StateBasedRippleDemo") { StateBasedRippleDemo() },
    Page("MultipleCollectTest") { MultipleCollectTest() },
    Page("InputFieldDemo") { InputFieldDemo() }


)

