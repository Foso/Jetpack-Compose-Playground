# ConstraintLayout

!!! info
    This is the API of version 1.0.0-alpha08. Newer versions may have a different one


Remember to add dependencies to build.gradle

```
    implementation 'androidx.constraintlayout:constraintlayout-compose:1.0.0-alpha08'
```

A ConstraintLayout in Compose is similar to a ConstraintLayout from the classic Android View System

<p align="left">
  <img src ="{{ site.images }}/layout/constraintlayout/constraintlayout.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ConstraintLayoutDemo() {
    ConstraintLayout {
        val (text1,text2,text3) = createRefs()

        Text("Text1", Modifier.constrainAs(text1){
            start.linkTo(text2.end)
        })
        Text("Text2", Modifier.constrainAs(text2){
            top.linkTo(text1.bottom)
        })
        Text("This is a very long text", Modifier.constrainAs(text3){
            start.linkTo(text2.end)
            top.linkTo(text2.bottom)
        })
    }
}
```

## See also:
* [Full Example Code]({{ site.samplefolder }}/layout/ConstraintLayoutDemo.kt)