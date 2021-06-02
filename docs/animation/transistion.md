# Transistion

WORK IN PROGRESS

# Working with Transistion

<video width="320" height="240" controls>
  <source src="{{ site.images }}/animation/transistion/rotation.mp4" type="video/webm">
Your browser does not support the video tag.
</video>

## What will we build?
This is might not be a spectacutlar use case for Transistion, but it should give an idea, how to use Transistion.
This is example consist of a **Text** which will print the active value of the Transition state and a padding which will change depending on this state.
The value of the Transistion state will change from 0 to 200 over and over again.

## Create a transistion definition
Transistion requires a TransitionDefinition, so let's build that first.

```kotlin
private val paddingTransitionDefinition = transitionDefinition {
...
}
```

Inside the TransitionDefinition, we have to define all possible transition states and which transition should be used between two transition states.
In this example we want to create transition between 0 and 200, so let's create two states for that.

```kotlin
private val paddingPropKey = FloatPropKey()

private val paddingTransitionDefinition = transitionDefinition {
 state("A"){ this[paddingPropKey] = 0f }
 state("B") { this[paddingPropKey] = 200f }
...
}
```  

Inside **transitionDefinition** you have to use the **state()** to define a transition state. It requires a name and a function to initialize a state.
**paddingPropKey** is a **FloatPropKey**, it's like a state with a float value. It will be constantly updated with the latest value inside the transition.

Now we have two states. One with the Name **A** and a paddingPropKey value of **0f** and one with the Name **B** and a paddingPropKey value of **200f**. Next we have to define a transistion between **A** and **B**.

```kotlin
private val paddingPropKey = FloatPropKey()

private val paddingTransitionDefinition = transitionDefinition {
 state("A"){ this[paddingPropKey] = 0f }
 state("B") { this[paddingPropKey] = 200f }

 transition("A" to "B") {
        paddingPropKey using repeatable {
            animation = tween {
                duration = 1000
                easing = FastOutLinearInEasing
            }
            iterations = Infinite
        }
    }
}

```

With
```kotlin
 transition("A" to "B")
```
a transistion between state **A** and state **B** is definied. Inside the transition you have to define **how**, **how long** and **how often** the transition should happen.

paddingPropKey using repeatable