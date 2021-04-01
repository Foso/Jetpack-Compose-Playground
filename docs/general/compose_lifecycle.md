# Lifecycle

!!! info
    This is the API of version 1.0.0-alpha12. Newer versions may have a different one
    
Compose has some "effects"-functions that can be used in Composables to track the lifecycle of a function.

* SideEffect {}
will be called the first time a compose function is applied.

* DisposableEffect { }
Has a onDispose() which will be called when the compose function isn't part of the composition anymore.

The example below has a Button that will count up everytime it gets clicked.
When the count value gets 3, the Text() function will not be added anymore.

The first time the LifecycleDemo will be executed, the SideEffect in the if-clause will be executed.
When the count value gets 3 +onDispose{} inside the if-clause will be called. 


```kotlin
@Composable
fun LifecycleDemo() {
    val count = remember { mutableStateOf(0) }

    Column {
        Button(onClick = {
            count.value++
        }) {
            Text("Click me")
        }

        if (count.value < 3) {
            SideEffect {
                Log.d("Compose", "onactive with value: " + count.value)
            }
            DisposableEffect(Unit) {
                onDispose {
                    Log.d("Compose", "onDispose because value=" + count.value)
                }
            }

            Text(text = "You have clicked the button: " + count.value.toString())
        }
    }
}
```


## See also:
* [Full Example Code]({{ site.samplefolder }}/general/LifecycleDemo.kt)

