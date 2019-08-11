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

package de.jensklingenberg.jetpackcomposeplayground.samples.animation


import android.graphics.PointF
import androidx.animation.*
import androidx.compose.Composable
import androidx.compose.memo
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.animation.Transition
import androidx.ui.core.*
import androidx.ui.core.gesture.PressGestureDetector
import androidx.ui.engine.geometry.Offset
import androidx.ui.graphics.Color
import androidx.ui.layout.Container
import androidx.ui.painting.Paint

@Composable
fun StateBasedRippleDemo() {
    Container(expanded = true) {
        RippleRect()
    }

}


@Composable
fun RippleRect() {
    val radius = withDensity(+ambientDensity()) { TargetRadius.toPx() }
    val toState = +state { ButtonStatus.Initial }
    val rippleTransDef = +memo { createTransDef(radius.value) }
    val onPress: (PxPosition) -> Unit = { position ->
        down.x = position.x.value
        down.y = position.y.value
        toState.value = ButtonStatus.Pressed
    }

    val onRelease: () -> Unit = {
        toState.value = ButtonStatus.Released
    }
    PressGestureDetector(onPress = onPress, onRelease = onRelease) {
        Container(expanded = true) {
            Transition(definition = rippleTransDef, toState = toState.value) { state ->
                RippleRectFromState(state = state)
            }
        }
    }
}

private val alpha1 = FloatPropKey()


@Composable
fun RippleRectFromState(state: TransitionState) {

    // TODO: file bug for when "down" is not a file level val, it's not memoized correctly
    val x = down.x
    val y = down.y

    val paint =
        Paint().apply {
            color = Color(
                alpha = (state[alpha1] * 255).toInt(),
                red = 0,
                green = 235,
                blue = 224
            )
        }

    val radius = state[radius]

    Draw { canvas, _ ->
        canvas.drawCircle(Offset(x, y), radius, paint)
    }
}

private enum class ButtonStatus {
    Initial,
    Pressed,
    Released
}

private val TargetRadius = 200.dp

private val down = PointF(0f, 0f)

private val radius = FloatPropKey()

private fun createTransDef(targetRadius: Float): TransitionDefinition<ButtonStatus> {
    return transitionDefinition {
        state(ButtonStatus.Initial) {
            this[alpha1] = 0f
            this[radius] = targetRadius * 0.3f
        }
        state(ButtonStatus.Pressed) {
            this[alpha1] = 0.2f
            this[radius] = targetRadius + 15f
        }
        state(ButtonStatus.Released) {
            this[alpha1] = 0f
            this[radius] = targetRadius + 15f
        }


        // State switch without animation
        snapTransition(ButtonStatus.Released to ButtonStatus.Initial)
    }
}
