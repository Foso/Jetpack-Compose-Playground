# Compose for Android Developers
This page is inspired by https://flutter.dev/docs/get-started/flutter-for/android-devs. 
The goal is to show how common use cases with the classic Android View system, can be done with Compose.

| Android View                                    | Compose  |
| ----------------------------------------- | ------------------------------------ |
| Button  		    | [Button](../material/button.md)  |
| TextView  		    | [Text](../foundation/text.md)  |
| EditText  		    | [TextField](../material/textfield.md)  |
| ImageView  		    | [Image](../foundation/image.md)  |
| LinearLayout(horizontally)  		    | [Row](../layout/row.md)  |
| LinearLayout(vertically)  		    | [Column](../layout/column.md)  |
| FrameLayout  		    | [Box](../layout/box.md)  |
| RecyclerView  		    | [LazyColumnFor](../foundation/lazycolumnfor.md)  |
| RecyclerView(horizontally)  		    | [LazyRowFor](../foundation/lazyrowfor.md)  |
| Snackbar  		    | [Snackbar](../material/snackbar.md)  |
| ScrollView  		    | [ScrollableRow](../foundation/scrollablerow.md)/[ScrollableColumn](../foundation/scrollablecolumn.md)  |


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

In Compose, you can use a **[ScrollableColumn](https://foso.github.io/Jetpack-Compose-Playground/foundation/scrollablecolumn/)**

```kotlin
@Composable
fun ScrollableColumnExample() {
    ScrollableColumn {
        //Only one child is allowed in a ScrollableColumn
        Column {
            for (i in 0..100) {
                Text("$i Hello World!", style =(MaterialTheme.typography()).body1)
            }
        }
    }
}
```

### What is the equivalent of a RecyclerView?
In Compose, you can use a **[LazyColumnFor](https://foso.github.io/Jetpack-Compose-Playground/foundation/lazycolumnfor/)** or **[LazyRowFor](https://foso.github.io/Jetpack-Compose-Playground/foundation/lazyrowfor/)**.


### What is the equivalent of wrap_content?

In the classic Android View system you use **wrap_content** to set the height/width of a View to the minimun needed value.  

In Compose, you can set a Modifier:

#### Modifier.wrapContentWidth()
Android View equivalent -> android:layout_width="wrap_content"

#### Modifier.wrapContentHeight()
Android View equivalent ->android:layout_height="wrap_content"

#### Modifier.wrapContentSize()
Android View equivalent ->android:layout_height="wrap_content"

Android View equivalent -> android:layout_width="wrap_content"

```kotlin
@Composable
fun Example() {
    Row {
        Text("Text1",modifier = Modifier.wrapContentWidth())
        Text("Text2",modifier = Modifier.wrapContentHeight())
    }
}
```

## Working with Text

### What is the equivalent of a TextView?
In Compose you can use a **[Text](https://foso.github.io/Jetpack-Compose-Playground/foundation/text/)** to display text

### What is the equivalent of a EditText?
The EditText is the standard text entry view in the Android View system. If the user needs to enter text into an app, this is the primary way for them to do that. 
In Compose you can use **[TextField](https://foso.github.io/Jetpack-Compose-Playground/material/textfield/)**
