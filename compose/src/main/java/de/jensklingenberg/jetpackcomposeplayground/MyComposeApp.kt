package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.Composable
import androidx.ui.core.CraneWrapper
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.Column
import androidx.ui.layout.HeightSpacer
import androidx.ui.layout.VerticalScroller
import androidx.ui.material.Button
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import de.jensklingenberg.jetpackcomposeplayground.demos.MultipleCollectTest
import de.jensklingenberg.jetpackcomposeplayground.model.Navigation
import de.jensklingenberg.jetpackcomposeplayground.model.Page
import de.jensklingenberg.jetpackcomposeplayground.samples.*
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.HelloAnimation
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.HelloGesture
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.RepeatedRotation
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.StateBasedRippleDemo
import de.jensklingenberg.jetpackcomposeplayground.samples.layout.*
import de.jensklingenberg.jetpackcomposeplayground.samples.rally.RallyApp
import de.jensklingenberg.jetpackcomposeplayground.samples.text.TextDemo
import de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents.AppBar
import de.jensklingenberg.jetpackcomposeplayground.unimplementedComponents.Scaffold

@Composable
fun MyComposeApp(navigation: Navigation) {
    navigation.setStartPage { MainPage(navigation) }

    navigation.setPages(mainPagesEntries)
    navigation.navigateToPage(navigation.getPageIndex())
}


@Composable
fun MainPage(navigation: Navigation) {
    val dividerColor = Color(0xFFC6C6C6.toInt())

    CraneWrapper {
        MaterialTheme {
            Scaffold(appBar = {
                AppBar(
                    title = "Compose Playground"
                )
            }) {
                VerticalScroller {
                    Column {
                        mainPagesEntries.forEachIndexed { index, page ->
                            HeightSpacer(height = 10.dp)
                            Button(page.title, onClick = {
                                navigation.setPage(index)
                            })
                            HeightSpacer(height = 10.dp)
                            Divider(color = dividerColor, height = 0.5.dp)

                        }
                    }
                }

            }
        }
    }
}


@Composable
fun MainPage2(tt: (Int) -> Unit) {
    val dividerColor = Color(0xFFC6C6C6.toInt())

    CraneWrapper {
        MaterialTheme {
            Scaffold(appBar = {
                AppBar(
                    title = "Compose Playground"
                )
            }) {
                VerticalScroller {
                    Column {
                        mainPagesEntries.forEachIndexed { index, page ->
                            HeightSpacer(height = 10.dp)
                            Button(page.title, onClick = {
                                tt(index)

                            })
                            HeightSpacer(height = 10.dp)
                            Divider(color = dividerColor, height = 0.5.dp)

                        }
                    }
                }

            }
        }
    }
}


val mainPagesEntries = listOf(
    Page("AppBarDemo") { AppBarDemo() },
    Page("TextDemo") { TextDemo() },
    Page("ButtonDemo") { ButtonDemo() },
    Page("RippleDemo") { RippleDemo() },
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
    Page("InputFieldDemo") { InputFieldDemo() },
    Page("LoadImageDemo") { context -> LoadImageDemo(context) }


)

