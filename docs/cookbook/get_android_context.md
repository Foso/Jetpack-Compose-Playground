!!! info
    This is the API of version alpha08. Newer versions may have a different one
    
You can use ContextAmbient.current to receive the context of your Android App inside a Compose Function

```kotlin 
@Composable
fun AndroidContextComposeDemo() {
    Text("Read this string from Context: " + AmbientContext.current.getString(R.string.app_name))
}
```