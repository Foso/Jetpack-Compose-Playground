# Ambient
!!! info
    This is the API of version 1.0.0-alpha02. Newer versions may have a different one

Ambient is useful when you want to create a dependency in a higher node of the layout tree and use it on lower node without having to
pass it down the tree through every child Composable.

## How to create an Ambient?
```kotlin
data class User(val name: String, val age: Int)
val ActiveUser = ambientOf<User> { error("No user found!") }
```
Let's say you want to create an Ambient with an User. You can use **ambientOf()**. Inside the function you can return an initial user object
 or you can throw an exception when the user is missing.

## How to provide a value for an Ambient?

```kotlin
@Composable
private fun MyUserScreen() {
    val user = User("Jens", 31)
    Providers(ActiveUser provides user) {
        UserInfo()
    }
}
```
Somewhere above in your hierarchy you have to use Providers to provide a value for your ambient. You can provide the values of multiple ambients inside Providers.
The syntax is: "**Ambient`<T>`** provides **T**".
All child @Composable of Providers will implicitly be able to get the value of the ambients.

## How to use a value of an Ambient?

```kotlin
@Preview
@Composable
fun UserInfo() {
    Column {
        Text("Name: " + ActiveUser.current.name)
        Text("Age: " + ActiveUser.current.age)
    }
}
```

Now you can use your ambient in your @Composable. Every ambient has a **current** property that contains the current value.

## Predifinied Ambients
The Compose libraries already contain some useful ambients. You can directly use them without needing add a Providers.

### ContextAmbient
Provides a [Context] that can be used by Android applications.

### ConfigurationAmbient
The [Configuration] is useful for determining how to organize the UI.

#### Device orientation
One of the things you can get from the ConfigurationAmbient is the orientation of your device. This can be used to give the user a different ui when the device is rotated.

```kotlin
val configuration = ConfigurationAmbient.current
when (configuration.orientation) {
    Configuration.ORIENTATION_LANDSCAPE -> {
        Text("Landscape")
    }
    else -> {
        Text("Portrait")
    }
}
```

### LifecycleOwnerAmbient
The ambient containing the current [LifecycleOwner].

### ViewAmbient
 The ambient containing the current Compose [View].

### ViewModelStoreOwnerAmbient
The ambient containing the current [ViewModelStoreOwner].



## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Ambient)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/compose/src/main/java/de/jensklingenberg/jetpackcomposeplayground/ui/github/general/AmbientExample.kt)

