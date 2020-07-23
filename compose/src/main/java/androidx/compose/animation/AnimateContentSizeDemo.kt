/*
 * Copyright 2020 The Android Open Source Project
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

package androidx.compose.animation.demos


import androidx.animation.*
import androidx.compose.*
import androidx.ui.background
import androidx.ui.animation.AnimatedValueModel
import androidx.ui.animation.IntSizeToVectorConverter
import androidx.ui.animation.asDisposableClock
import androidx.ui.core.*
import androidx.ui.foundation.Box
import androidx.ui.foundation.Text
import androidx.ui.foundation.clickable
import androidx.ui.foundation.currentTextStyle
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.unit.IntSize
import androidx.ui.unit.dp

/**
 * This class creates a [LayoutModifier] that measures children, and responds to children's size
 * change by animating to that size. The size reported to parents will be the animated size.
 */
private class SizeAnimationModifier(
    val animSpec: AnimationSpec<IntSize>,
    val clock: AnimationClockObservable
) : LayoutModifier {
    var sizeAnim: AnimatedValueModel<IntSize, AnimationVector2D>? = null

    override fun MeasureScope.measure(
        measurable: Measurable,
        constraints: Constraints,
        layoutDirection: LayoutDirection
    ): MeasureScope.MeasureResult {

        val placeable = measurable.measure(constraints)

        val measuredSize = IntSize(placeable.width, placeable.height)

        val anim = sizeAnim?.apply {
            if (targetValue != measuredSize) {
                animateTo(measuredSize, animSpec)
            }
        } ?: AnimatedValueModel(
            measuredSize, IntSizeToVectorConverter, clock, IntSize(1, 1)
        )
        sizeAnim = anim
        return layout(anim.value.width, anim.value.height) {
            placeable.place(0, 0)
        }
    }
}


fun Modifier.animateContentSize(
    animSpec: AnimationSpec<IntSize> = spring(),
    clip: Boolean = true
): Modifier = composed {
    val clock = AnimationClockAmbient.current.asDisposableClock()
    val animModifier = remember {
        SizeAnimationModifier(animSpec, clock)
    }
    if (clip) {
        this + Modifier.clipToBounds() + animModifier
    } else {
        this + animModifier
    }
}


@Composable
fun AnimateContentSizeDemo() {
    Column(
        Modifier.wrapContentHeight()
            .padding(50.dp)
            .background(Color.Gray)
            .fillMaxWidth()
            .padding(50.dp)
    ) {
        text()
        Spacer(Modifier.height(20.dp))
        button()
        Spacer(Modifier.height(20.dp))
        image()
    }
}

@Composable
fun text() {
    val shortText = "Click me"
    val longText = "Very long text\nthat spans across\nmultiple lines"
    var short by remember { mutableStateOf(true) }
    Box(modifier = Modifier
        .background(Color.Blue, RoundedCornerShape(15.dp))
        .clickable { short = !short }
        .padding(20.dp)
        .wrapContentSize()
        .animateContentSize()
    ) {
        Text(
            if (short) {
                shortText
            } else {
                longText
            },
            style = currentTextStyle().copy(color = Color.White)
        )
    }
}

@Composable
fun button() {
    val shortText = "Short"
    val longText = "Very loooooong text"
    var short by remember { mutableStateOf(true) }
    Button(
        { short = !short }
    ) {
        Text(
            if (short) {
                shortText
            } else {
                longText
            },
            style = currentTextStyle().copy(color = Color.White),
            modifier = Modifier.animateContentSize()
        )
    }
}

@Composable
fun image() {
    var portraitMode by remember { mutableStateOf(true) }
    Box(
        Modifier.clickable { portraitMode = !portraitMode }
            .sizeIn(maxWidth = 300.dp, maxHeight = 300.dp)
            .background(if (portraitMode) Color(0xFFfffbd0) else Color(0xFFe3ffd9))
            .animateContentSize(tween(500))
            .aspectRatio(if (portraitMode) 3 / 4f else 16 / 9f)
    ) {
        Text(
            if (portraitMode) {
                "3 : 4"
            } else {
                "16 : 9"
            },
            style = currentTextStyle().copy(color = Color.Black)
        )
    }
}
