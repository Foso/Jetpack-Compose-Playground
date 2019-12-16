package de.jensklingenberg.jetpackcomposeplayground.ui.samples.mysamples.material

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Alignment
import androidx.ui.core.dp
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.AppBarIcon
import androidx.ui.material.BottomAppBar
import androidx.ui.material.FloatingActionButton
import androidx.ui.material.MaterialTheme
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.common.FakeImage

@Composable
fun myBottomBar(){
    //TODO: Add bettter sample
        FlexColumn {
            flexible(1f) {
                Column(ExpandedHeight, arrangement = Arrangement.SpaceBetween) {

                }
            }
            inflexible {
                Container(height = 120.dp, alignment = Alignment.BottomCenter) {


                    val actionData = listOf("hhh", "eeee", "ddereuer")

                    BottomAppBar<String>(

                        fabConfiguration = BottomAppBar.FabConfiguration(fab = {
                            FloatingActionButton(
                                text = "Hello",
                                textStyle = (+MaterialTheme.typography()).h5,
                                color = Color.Red,
                                onClick = {}
                            )
                        }), actionData = actionData, action = {
                            AppBarIcon(FakeImage()) {

                            }
                        }
                    )

                }
            }
        }

}