# Providers
Providers are used to provide a value for an [Ambient](./ambient.md)

## How to provide a value for an Ambient?

```kotlin
@Composable
private fun MyUserScreen() {
    val user = User("Jens", 31)
    Providers(ActiveUser provides user) {
        YourContent()
    }
}
```
Somewhere above in your hierarchy you have to use Providers to provide a value for your ambient. You can provide the values of multiple ambients inside Providers.
The syntax is: "**Ambient`<T>`** provides **T**". ActiveUser in this case is a custom Ambient.
All child @Composable of Providers will implicitly be able to get the value of the ambients.
