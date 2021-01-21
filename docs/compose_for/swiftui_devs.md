# Compose for SwiftUI Developers


| SwiftUI           | Compose  |
| ----------------------------------------- | ------------------------------------ |
| Button  		    | [Button](../material/button.md)  |
| Text  		    | [Text](../foundation/text.md)  |
| EditText  	    | [TextField](../material/textfield.md)  |
| Image  		    | [Image](../foundation/image.md)  |
| HStack  		    | [Row](../layout/row.md)  |
| VStack  		    | [Column](../layout/column.md)  |
| ZStack  		    | [Box](../layout/box.md)  |
| LazyVStack  		| [LazyColumn](../foundation/lazycolumn.md)   |
| LazyHStack  		| [LazyRow](../foundation/lazyrow.md)  |
| ScrollView  		| [ScrollableRow](../foundation/scrollablerow.md)/[ScrollableColumn](../foundation/scrollablecolumn.md)  |

## What is the equivalent of a View?
In "Jetpack Compose" Views are called **Composable**. They are Kotlin functions that are annotated with @Composable.
```kotlin
@Composable fun ComposableDemo(){
    Text("Hello, World")
}
```

## How to define a state?
In SwiftUI you can use the **@State** property wrapper to create a state.

```swift
//SwiftUI
@State var isActiveState = false
```

In Compose you use **mutableStateOf()**
```kotlin
//Compose
var isActiveState = mutableStateOf(false)
```

But this will only create the state. When you want to remember the value of your state in every recomposition, you have to put your state inside **remember**
```kotlin
//Compose
 val isActiveState = remember { mutableStateOf(false) }
```
           


## What is the equivalent of a ViewModifier?

```swift
//SwiftUI
struct ContentView: View {
    var body : some View {
        Text("Hello, World!").background(Color.Red).padding(100)
    }
}
```

In Compose a ViewModifier is called [Modifier](/general/modifier/). You can't directly append it to a View, you need to apply your modifier as a parameter to a Composable that expects a modifier.

```kotlin
//Compose
Text("Hello, World", modifier = Modifier.background(Color.Red).padding(100.dp))
```

## What is the equivalent of EnvironmentObject?
For data that should be shared with all views in your entire app, in SwiftUI you can use EnvironmentObject. In Compose this can be done with [Ambients](/general/ambient/)
