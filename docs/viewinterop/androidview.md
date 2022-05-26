<!---
This is the API of version 1.1.1
-->
# AndroidView

Altough Compose itself is independent from the classic Android View system, in Android Apps it is possible to use Views(classes that extend android.view.View).
In this example you will see how you can use **android.widget.Button**, **android.widget.TextView** and **android.widget.ImageView** alongside a Compose Button.


<p align="center">
  <img src ="{{ site.images }}/viewinterop/androidview/androidview.png" height=100 width=300  />
</p>

In this code example you can see a `@Composable()` with a `Column()` and a counter state variable. The ImageView displays a drawable.
The compose button and the wiget.Button will both update the counter variable and the TextView will display the value of counter.


```kotlin
@Composable
fun EmbeddedAndroidViewDemo() {
    Column {
    
        // Holds state
        val state = remember { mutableStateOf(0) }

        // widget.ImageView
        AndroidView(factory = { ctx ->
          
            Initialize a View or View hierarchy here
        
            ImageView(ctx).apply {
                val drawable = ContextCompat.getDrawable(ctx, R.drawable.composelogo)
                setImageDrawable(drawable)
            }
        })

        // Compose Button
        androidx.compose.material.Button(onClick = { state.value++ }) {
            Text("MyComposeButton")
        }

        // widget.Button
        AndroidView(factory = { ctx ->
            android.widget.Button(ctx).apply {
                text = "MyAndroidButton"
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                setOnClickListener {
                    state.value++
                }
            }
        }, modifier = Modifier.padding(8.dp))

        // widget.TextView
        AndroidView(factory = { ctx ->
            TextView(ctx).apply {
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            }
        }, update = {
            // Update TextView with the current state value
            it.text = "You have clicked the buttons: " + state.value.toString() + " times"
        })
    }
}
```



## AndroidView
```kotlin
//androidx.compose.ui.viewinterop
@Composable
fun <T : View> AndroidView(
    factory: (Context) -> T,
    modifier: Modifier = Modifier,
    update: (T) -> Unit = NoOpUpdate
) {
   ...
}
```
**AndroidView()** is a Composable that can be used to add Android Views inside of a @Composable function.

**factory** expects a function that gets an Android Context and will return a class that extends an Android View. This constructor function will only be executed at initial rendering and when a parent composable triggers a new execution.
You can use the value of a state in here, but it will not observe any changes.

**modifier** can be used to apply modifiers to the layout that will host the created View

In the **update** function you will get the View that was created in **ctor**. This function is used to handle all updates of the composition tree. Here you can use your state objects and handle all the update logic.


### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/ui/viewinterop/package-summary#androidview)
* [Full Example Code]({{ site.samplefolder }}/androidview/embeddedAndroidViewDemo.kt)

