# How to use an Android View in Compose

!!! info
    This is the API of version dev16. Newer versions may have a different one

Altough Compose itself is independent from the classic Android View system, in Android Apps it is possible to use Views(any class extends android.view.View) inside of Compose.
This example will show you, how you can use a **android.widget.Button**, an **android.widget.TextView** and an **android.widget.ImageView** alongside with an Compose Button.


<p align="center">
  <img src ="../../images/cookbook/emitview/embeddedAndroidView.png" height=100 width=300  />
</p>

In the example above you can see a @Composable() with a Column and a counter state. The ImageView is loading an drawable.
The compose button and the wiget.Button will both update the counter and the TextView will display the value of counter. See below how **emitView()** is working.


```kotlin
@Composable
  fun embeddedAndroidViewDemo() {
      Column {
          val state = state { 0 }

         //widget.ImageView
          emitView(
              ctor = { ctx ->
                  ImageView(ctx).apply {
                      val drawable = ContextCompat.getDrawable(ctx, R.drawable.ic_launcher_background)
                      setImageDrawable(drawable)
                  }
              },
              update = {})

         //Compose Button
          Button(onClick = { state.value++ }) {
              Text("MyComposeButton")
          }

          //widget.Button
          emitView(ctor = { ctx ->
              //Here you can construct your View
              Button(ctx).apply {
                  text = "MyAndroidButton"
                  layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                  setOnClickListener {
                      state.value++
                  }
              }
          }, update = { })

          //widget.TextView
          emitView(ctor = { ctx ->
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



## EmitView
```kotlin
//androidx.compose.ui.viewinterop
@Composable
fun <T : View> emitView(
    ctor: (Context) -> T,
    update: (T) -> Unit
) {
    val context = ContextAmbient.current
    emit<T, UiApplier>(
        ctor = { ctor(context) },
        update = {
            reconcile(update)
        }
    )
}
```
**emitView()** is a function that can be used to add Android Views inside of a @Composable function.

**ctor** expects a function that gets an Android Context and will return a class that extends an Android View. This constructor function will only be executed at initial rendering and when a parent composable triggers a new execution.
You can use the value of a state in here, but it will not observe any changes.

In the **update** function you will get the View that was created in **ctor**. This function is used to handle all updates of the composition tree. Here you can use your state objects and handle all the update logic.


### See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/ui/viewinterop/package-summary#emitview)