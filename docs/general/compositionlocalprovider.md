# CompositionLocalProvider
CompositionLocalProvider are used to provide a value for an [CompositionLocal](../compositionlocal)

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
Somewhere above in your hierarchy you have to use CompositionLocalProviders to provide a value for your CompositionLocal. You can provide the values of multiple CompositionLocals inside Providers.
The syntax is: "**CompositionLocal`<T>`** provides **T**".
All child @Composable of CompositionLocalProvider will implicitly be able to get the value of the CompositionLocals.
