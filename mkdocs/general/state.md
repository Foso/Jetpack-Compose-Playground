# Compose State

## Define a state
### state function
val textState = state{"Hello"}

You can use the state function to create a state. state{T} will return a MutableState`<T>`


## Example
In this example we will create a composable with a Text and a Button. On a click on the button, the count state will go up and the text of Text will be updated.

<p align="center">
Initial state:<br>
  <img src ="../../images/state1.png"  />
</p>

<p align="center">
After Button click:<br>
  <img src ="../../images/state2.png"  />
</p>



```kotlin
@Composable
fun StateDemo(){
    val countState = state{0}
    Column {
        Button(backgroundColor = MaterialTheme.colors().secondary, onClick = {countState.value++}) {
            Text("count up")
        }
        Text("You have clicked the Button "+countState.value.toString() +" times")
    }
}
```

```kotlin
val countState = state{0}
```

Here we define the state for the click counter. 0 will be the initial value. Because 0 is an Int, the counterState will only allow values which are Int.

```kotlin
countState.value
```
With the value property you can get/set the value of the counterstate. In the onClick() function of the Button, the value will be incremented. The Text shows the value of the counterstate. When counterstate is changed, 
"Text" will also change. 