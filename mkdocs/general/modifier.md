# Modifier
Modifiers can be used modify certain aspects of a composable.
To set them, a composable needs to accept a modifier as a parameter.

## Combine modifiers    
```kotlin
Column(modifier = LayoutHeight(500.dp) + LayoutPadding(100.dp)) {
                Text("Hello")
}
```
You can combine multiple modifiers with plus sign.
The order is important modifier elements to the left are applied before modifier elements to the right.

## Some Modifiers
### Modifier.None
This can be used as a default parameter.

### LayoutHeight
Modifies the height of a Compose UI layout element.

### LayoutWidth
Modifies the width of a Compose UI layout element.

### LayoutWidth
Modifies the width and height of a Compose UI layout element together

### LayoutPadding
See [LayoutPadding](/layout/layoutpadding)