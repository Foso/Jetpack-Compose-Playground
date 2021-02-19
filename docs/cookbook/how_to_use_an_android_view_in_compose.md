# How to use an Android View in Compose

!!! info
    This is the API of version alpha08. Newer versions may have a different one

Altough Compose itself is independent from the classic Android View system, in Android Apps it is possible to use Views(any class extends android.view.View) inside of Compose.
This example will show you, how you can use a **android.widget.Button**, an **android.widget.TextView** and an **android.widget.ImageView** alongside with an Compose Button.


<p align="center">
  <img src ="../../images/cookbook/androidview/androidview.png" height=100 width=300  />
</p>

In the example above you can see a @Composable() with a Column and a counter state. The ImageView is loading an drawable.
The compose button and the wiget.Button will both update the counter and the TextView will display the value of counter. See below how **AndroidView()** is working.


```kotlin
@Composable
fun embeddedAndroidViewDemo() {
    Column {
        val state = remember { mutableStateOf(0) }

        //widget.ImageView
        AndroidView(viewBlock = { ctx ->
            ImageView(ctx).apply {
                val drawable = ContextCompat.getDrawable(ctx, R.drawable.composelogo)
                setImageDrawable(drawable)
            }
        })

        //Compose Button
        androidx.compose.material.Button(onClick = { state.value++ }) {
            Text("MyComposeButton")
        }

        //widget.Button
        AndroidView(viewBlock = { ctx ->
            //Here you can construct your View
            android.widget.Button(ctx).apply {
                text = "MyAndroidButton"
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                setOnClickListener {
                    state.value++
                }
            }
        }, modifier = Modifier.padding(8.dp))

        //widget.TextView
        AndroidView(viewBlock = { ctx ->
            //Here you can construct your View
            TextView(ctx).apply {
                layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            }
        }, update = {
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
    viewBlock: (Context) -> T,
    modifier: Modifier = Modifier,
    update: (T) -> Unit = NoOpUpdate
) {
   ...
}
```
**AndroidView()** is a Composable that can be used to add Android Views inside of a @Composable function.

**viewBlock** expects a function that gets an Android Context and will return a class that extends an Android View. This constructor function will only be executed at initial rendering and when a parent composable triggers a new execution.
You can use the value of a state in here, but it will not observe any changes.

**modifier** can be used to apply modifiers to the layout that will host the created View

In the **update** function you will get the View that was created in **ctor**. This function is used to handle all updates of the composition tree. Here you can use your state objects and handle all the update logic.


### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/ui/viewinterop/package-summary#androidview)
* [Full Example Code]({{ site.samplefolder }}/androidview/embeddedAndroidViewDemo.kt)

