# State
!!! info
    This is the API of version 1.0.0-alpha08. Newer versions may have a different one

## Define a state
```kotlin
val textState = mutableStateOf("Hello")
```

You can use the mutableStateOf function to create a mutable state.


## Example
In this example we will create a composable with a Text and a Button. On a click on the button, the count state will go up and the text of Text will be updated.

<p align="center">
Initial state:<br>
  <img src ="../../images/general/state/state1.png"  />
</p>

<p align="center">
After Button click:<br>
  <img src ="../../images/general/state/state2.png"  />
</p>



```kotlin
@Composable
fun StateDemo(){
    val countState = remember { mutableStateOf(0) }
    Column {
        Button(backgroundColor = MaterialTheme.colors.secondary, onClick = { countState.value++ }) {
            Text("count up")
        }
        Text("You have clicked the Button " + countState.value.toString() + " times")
    }
}
```

```kotlin
val countState = remember { mutableStateOf(0) }
```

Here we define the state for the click counter with **mutableStateOf(0)**. 0 will be the initial value. Because 0 is an Int, the counterState will only allow values which are Int.

**remember** is used to remember the countstate. Without remember, every time the value of countstate would change, the StateDemo Composable will be recomposed and your state will also
get recreated with the initial value. When you use remember it will remember the last value and not be recreated.

```kotlin
countState.value
```
With the value property you can get/set the value of the counterstate. In the onClick() function of the Button, the value will be incremented. The Text shows the value of the counterstate. When counterstate is changed, 
"Text" will also change. 