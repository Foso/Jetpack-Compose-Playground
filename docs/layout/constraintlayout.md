# ConstraintLayout

!!! info
    This is the API of version 1.0.0-beta07. Newer versions may have a different one

A ConstraintLayout in Compose is similar to a ConstraintLayout from the classic Android View System

<p align="left">
  <img src ="{{ site.images }}/layout/constraintlayout/constraintlayout.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ConstraintLayoutDemo() {
    ConstraintSet {
        val text1 = createRefFor("text1")
        val text2 = createRefFor("text2")
        val text3 = createRefFor("text3")

        constrain(text1) {
            start.linkTo(text2.end)
        }
        constrain(text2) {
            top.linkTo(text1.bottom)
        }

        constrain(text3) {
            start.linkTo(text2.end)
            top.linkTo(text2.bottom)
        }

    }
    ConstraintLayout {
        Text("Text1", Modifier.layoutId("text1"))
        Text("Text2", Modifier.layoutId("text2"))
        Text("This is a very long text", Modifier.layoutId("text3"))
    }
}
```

## See also:
* [Full Example Code]({{ site.samplefolder }}/layout/ConstraintLayoutDemo.kt)