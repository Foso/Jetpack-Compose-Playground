# Recompose

//TODO: GOT DELETED IN dev14

You can use Recompose when you need to manually trigger an recomposition/update of a part of your composable tree.
Wrap **Recompose** around the part where you need the functionality. When you execute the **recompose** function, the whole code inside Recompose will be rendered again.

```kotlin
@Composable
fun recomposeDemo() {

    var countState = 0

    Recompose { recompose ->
        Column {
            Text("CountState is: " + countState)

            Button(onClick = { countState++ }) {
                Text("Count up")
            }

            Button(onClick = {
                 recompose()
            }) {
                Text("I want to recompose")
            }
        }
    }
}
```

# Example

The UI in the **recomposeDemo** consists of 3 Elements. A Text with the counterstate, a button which will increment the counterstate and a button to recompose the UI.

<p align="left">
  <img src ="../../images/recompose1.png" />
</p>

On a click on the "Count up"-Button, the value of countState will go up, but the **Text** will not be updated. This is because countState is usual Int and not an State`<Int>`.
When the recompose button gets clicked, the **Column** inside **Recompose** will be rendered again. This time with the updated value of countState.

<p align="left">
  <img src ="../../images/recompose2.png" />
</p>