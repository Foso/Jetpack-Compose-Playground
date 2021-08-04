# ConstraintLayout

!!! info
    This is the API of version 1.0.1-beta01. Newer versions may have a different one


Remember to add dependencies to build.gradle

```
    implementation 'androidx.constraintlayout:constraintlayout-compose:1.0.0-beta02'
```

A ConstraintLayout in Compose is similar to a ConstraintLayout from the classic Android View System

## Example:
<p align="left">
  <img src ="{{ site.images }}/layout/constraintlayout/constraintlayout.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ConstraintLayoutDemo() {
    ConstraintLayout(modifier = Modifier.size(200.dp)) {
        val (redBox, blueBox, yellowBox, text) = createRefs()

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Red)
            .constrainAs(redBox) {})

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
            .constrainAs(blueBox) {
                top.linkTo(redBox.bottom)
                start.linkTo(redBox.end)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow)
            .constrainAs(yellowBox) {
                bottom.linkTo(blueBox.bottom)
                start.linkTo(blueBox.end, 20.dp)
            })

        Text("Hello World", modifier = Modifier.constrainAs(text) {
            top.linkTo(parent.top)
            start.linkTo(yellowBox.start)
        })

    }
}

```


## How to use it?

First add the Constraintlayout dependency to your project (see start of this page)

I will use the example code above, to explain how the boxes are constraint to each other.
Inside the scope of ConstraintLayout you can use createRefs() to create reference objects.
These will be used by ConstraintLayout to know which Composables should be linked to each other.

```kotlin
val (redBox, blueBox, yellowBox, text) = createRefs()
```

Kotlin's destructuring declaration feature is used here to generate reference objects.

Now we need to let ConstraintLayout know which reference objects belongs to which Composable.
To do that you need to use the constrainAs Modifier on your Composable.

```kotlin
.constrainAs(redBox) {})
```

Now ConstraintLayout knows that redBox belongs to the first Box Composable.

We do the same for the blue box, but now we want to link it to the red box.

```kotlin
.constrainAs(blueBox) {
    top.linkTo(redBox.bottom)
    start.linkTo(redBox.end)
})
```

Inside the scope of **constrainAs** we have access to the ConstrainScope.
We can now link start/end/top/bottom of the Composable to Composables through the reference object.
You can also link to the parent ConstraintLayout with the **parent** object. It's used at the Text Composable.

## See also:
* [Full Example Code]({{ site.samplefolder }}/layout/ConstraintLayoutDemo.kt)