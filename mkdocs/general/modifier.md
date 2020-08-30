# Modifier

!!! info
    This is the API of version alpha01. Newer versions may have a different one

Modifiers can be used modify certain aspects of a composable.
To set them, a composable needs to accept a modifier as a parameter.

## Combine modifiers    
```kotlin
Column(modifier = Modifier.preferredHeight(500.dp).then(Modifier.padding(100.dp))) {
                Text("Hello")
}
```
You can combine multiple modifiers with plus sign.
The order is important modifier elements to the left are applied before modifier elements to the right.

## Some Modifiers
### Modifier.None
This can be used as a default parameter.

### Modifier.preferredHeight()
Modifies the height of a Compose UI layout element.

### Modifier.preferredWidth()
Modifies the width of a Compose UI layout element.

###  Modifier.preferredSize()
Modifies the width and height of a Compose UI layout element together
