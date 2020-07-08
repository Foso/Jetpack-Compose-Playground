!!! info
    This is the API of version dev14. Newer versions may have a different one
    
You can use ContextAmbient.current to receive the context of your Android App inside a Compose Function

```kotlin 
@Composable
fun AndroidContextComposeDemo() {
        val context = ContextAmbient.current
        Text("Read this string from Context: "+context.getString(R.string.app_name))
}
```