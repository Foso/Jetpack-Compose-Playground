
# Clickable    

!!! info
    This is the API of version dev06. Newer versions may have a different one
    
Childrens of Clickable will become clickable

https://developer.android.com/reference/kotlin/androidx/ui/foundation/package-summary#clickable 
```kotlin
@Composable
fun ClickableSample() {

    val count = state { 0 }
    Clickable(onClick = { count.value += 1 }) {
        // content that you want to make clickable
        Text("You have clicked this text: "+count.value.toString())
    }
}

```