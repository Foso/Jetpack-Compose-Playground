# Compose for Android Developers
This page is inspired by https://flutter.dev/docs/get-started/flutter-for/android-devs. 
The goal is to show how common use cases with the classic Android View system, can be done with Compose.

## Layouts
### What is the equivalent of a LinearLayout?

In Android, a LinearLayout is used to lay your widgets out linearly—either horizontally or vertically. With Compose, use the [Row](https://foso.github.io/Jetpack-Compose-Playground/layout/row/) or [Column](https://foso.github.io/Jetpack-Compose-Playground/layout/column/) composable to achieve the same result.

If you notice the two code samples are identical with the exception of the “Row” and “Column” composable. The children are the same and this feature can be exploited to develop rich layouts that can change overtime with the same children.

```kotlin
@Composable
fun Example() {
    Row {
        Text("Hello World!")
        Text("Hello World!2")
    }
}
```

```kotlin
@Composable
fun Example() {
    Column {
        Text("Hello World!")
        Text("Hello World!2")
    }
}

``` 


### What is the equivalent of a RelativeLayout?
A RelativeLayout lays your widgets out relative to each other. In Compose, there are a few ways to achieve the same result.

You can achieve the result of a RelativeLayout by using a combination of Column, Row, and Stack widgets

### What is the equivalent of a ScrollView?

In Android, use a ScrollView to lay out your widgets—if the user’s device has a smaller screen than your content, it scrolls.

In Compose, you can use a VerticalScroller.

```kotlin
@Composable
fun VerticalScrollerExample() {
    VerticalScroller {
        //Only one child is allowed in a VerticalScroller
        Column {
            Text("Hello World!")
            Text("Hello World!2")
        }
    }
}
```

## Working with Text

### What is the equivalent of a TextView?
In Compose you can use a **[Text](https://foso.github.io/Jetpack-Compose-Playground/core/text/)** to display text

### What is the equivalent of a EditText?
The EditText is the standard text entry view in the Android View system. If the user needs to enter text into an app, this is the primary way for them to do that. 
In Compose you can use **[TextField](https://foso.github.io/Jetpack-Compose-Playground/core/textfield/)**
