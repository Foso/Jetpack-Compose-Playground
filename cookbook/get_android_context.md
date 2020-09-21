!!! info
    This is the API of version alpha02. Newer versions may have a different one
    
You can use ContextAmbient.current to receive the context of your Android App inside a Compose Function

```kotlin 
@Composable
fun AndroidContextComposeDemo() {
    Text("Read this string from Context: " + ContextAmbient.current.getString(R.string.app_name))
}
```