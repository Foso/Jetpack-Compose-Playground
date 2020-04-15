package de.jensklingenberg.jetpackcomposeplayground.ui.github.animation

import android.util.Log
import androidx.animation.FastOutLinearInEasing
import androidx.animation.FloatPropKey
import androidx.animation.transitionDefinition
import androidx.compose.Composable
import androidx.ui.animation.Transition
import androidx.ui.core.Modifier
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.layout.padding
import androidx.ui.unit.dp

private val paddingPropKey = FloatPropKey()

private val paddingTransitionDefinition = transitionDefinition {

    state("A"){
        this[paddingPropKey] = 0f }
    state("B") { this[paddingPropKey] = 200f }

    // Here we define the transition spec i.e what action do we need to do as we transition from
    // one state to another. Below, we define a TransitionSpec for the transition
    // state A -> state B.
    transition("A" to "B") {
        // For the transition from state A -> state B, we assign a AnimationBuilder to the
        // rotation prop where we specify how we want to update the value of the rotation prop
        // between state A & B, what the duration of this animation should be, what kind of
        // interpolator to use for the animation & how many iterations of this animation are needed.
        // Since we want the rotation to be continous, we use the repeatable AnimationBuilder and
        // set the iterations to Infinite.
        paddingPropKey using repeatable {
            animation = tween {
                duration = 1000
                easing = FastOutLinearInEasing
            }
            iterations = 10
        }
    }
}

@Composable
fun TransistionDemo() {
    Column {
        Transition(
            definition = paddingTransitionDefinition,
            initState = "A",
            toState = "B"
        ) { state ->

            Log.d("HEY", state[paddingPropKey].toString())
            Text( "The state is: "+state[paddingPropKey].toString(),modifier = Modifier.padding(top = state[paddingPropKey].dp))

        }
    }
}
