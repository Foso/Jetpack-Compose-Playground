<!---
This is the API of version 1.0.5
-->
# CompositionLocal


CompositionLocal is useful when you want to create a dependency in a higher node of the layout tree and use it on lower node without having to
pass it down the tree through every child Composable.

## How to create an CompositionLocal?
```kotlin
data class User(val name: String, val age: Int)
val LocalActiveUser = compositionLocalOf<User> { error("No user found!") }
```
Let's say you want to create an CompositionLocal with an User. You can use **compositionLocalOf**. Inside the function you can return an initial user object
 or you can throw an exception when the user is missing.

## How to provide a value for an CompositionLocal?

```kotlin
@Composable
private fun MyUserScreen() {
    val user = User("Jens", 31)
    CompositionLocalProvider(LocalActiveUser provides user) {
        UserInfo()
    }
}
```
Somewhere above in your hierarchy you have to use CompositionLocalProvider to provide a value for your CompositionLocal.
The syntax is: "**CompositionLocal`<T>`** provides **T**".
All child @Composable of CompositionLocalProvider will implicitly be able to get the value of the CompositionLocals.

## How to use a value of an CompositionLocal?

```kotlin
@Preview
@Composable
fun UserInfo() {
    Column {
        Text("Name: " + LocalActiveUser.current.name)
        Text("Age: " + LocalActiveUser.current.age)
    }
}
```

Now you can use your CompositionLocal in your @Composable. Every CompositionLocal has a **current** property that contains the current value.

## Predefined CompositionLocals
The Compose libraries already contain some useful CompositionLocals. You can directly use them without needing add a Providers.

### LocalContext
Provides a [Context] that can be used by Android applications.

### LocalConfiguration
The [Configuration] is useful for determining how to organize the UI.

#### Device orientation
One of the things you can get from the LocalConfiguration is the orientation of your device. This can be used to give the user a different ui when the device is rotated.

```kotlin
val configuration = LocalConfiguration.current
when (configuration.orientation) {
    Configuration.ORIENTATION_LANDSCAPE -> {
        Text("Landscape")
    }
    else -> {
        Text("Portrait")
    }
}
```

### LocalLifecycleOwner
The CompositionLocal containing the current [LifecycleOwner].

### LocalView
 The CompositionLocal containing the current Compose [View].

### LocalViewModelStoreOwner
The CompositionLocal containing the current [ViewModelStoreOwner].


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/runtime/CompositionLocal)
* [Full Example Code]({{ site.samplefolder }}/general/CompositionLocalExample.kt)

