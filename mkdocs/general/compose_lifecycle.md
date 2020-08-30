#Compose Lifecycle

!!! info
    This is the API of version alpha01. Newer versions may have a different one
    
Compose has some "effects"-function that can be used in compose function to track the lifecycle of a function.

* onActive {} 
willl be called the first time a compose function is applied.

* onDispose { }
will be called when the compose function isn't part of the composition anymore.

The example below has a Button that will count up everytime it gets clicked.
When the count value gets 3, the Text() function will not be added anymore.

The first time the LifecycleDemo will be executed, the +onActive{} in the if-clause will be executed.
When the count value gets 3 +onDispose{} inside the if-clause will be called. 


```kotlin
@Composable
fun LifecycleDemo() {
        val count = state { 0 }

        Column {
            Button(onClick = {
                count.value++
            }) {
                Text("Click me")
            }

            if (count.value < 3) {
                onActive { Log.d("Compose", "onactive with value: " + count.value) }
                onDispose { Log.d("Compose", "onDispose because value=" + count.value) }
                Text("You have clicked the button: " + count.value.toString())
            }
        }
}
```