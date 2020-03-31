# ConstraintLayout
A ConstraintLayout in Compose is similar to a ConstraintLayout from the classic Android View System

A ConstraintLayout requires a **ConstraintSet** as parameter. In the ConstraintSet all constraints of the layout has to be declared. **children** will set the children of the layout 

# Simple ConstraintLayout

```kotlin
@Composable fun SimpleConstraintLayout(){
    ConstraintLayout(constraintSet = ConstraintSet {}) {
        Text("Text1")
    }
}
```
This is a ConstraintLayout that just shows a text composable. The ConstraintSet is empty.

<p align="left">
  <img src ="../../images/layout/constraintlayout/simplelayout.png" />
</p>

# Align a ConstraintLayout children
Let's align the text composable created above, to the right end of it's a parent layout.

First we need to create a **LayoutTag** for the Text. The LayoutTag will be added as a modifier. The tag name used inside the LayoutTag, will be used as a reference inside the ConstraintSet.

```kotlin
Text("Text1",modifier = LayoutTag("text1"))
```

Inside the ConstraintSet, you have to add a **tag()** with the same name like your LayoutTag 
```kotlin
ConstraintSet {
val text1 = tag("text1")
}
```

Now you can apply constraints to this tag. With **constrainTo** you can set a composable to another one. 

```kotlin
ConstraintSet {
val text1 = tag("text1")
text1.apply {
    right constrainTo parent.right
}}
```

```kotlin
@Composable fun FinalConstraintLayout(){
    ConstraintLayout(constraintSet = ConstraintSet {
        val text1 = tag("text1")
        text1.apply {
            right constrainTo parent.right
        }

    }) {
        Text("Text1",modifier = LayoutTag("text1"))
    }
}
```

Now the right of your text will be constraint to the right of your parent composable.
<p align="left">
  <img src ="../../images/layout/constraintlayout/constrainParentend.png" />
</p>

# Create a guideline

A guideline can used as an invisible line to which you can constrain your composables.

The example below shows how to create a guideline at 50% of the height of the ConstraintLayout and align a Text to it.
There are similar functions for guidelines from left, right and bottom.

```kotlin
@Composable fun TopGuideLineExample(){
    ConstraintLayout(constraintSet = ConstraintSet {
        val half = createGuidelineFromTop(percent = 0.5f)

        val text1 = tag("text1")
        text1.apply {
            top constrainTo half
        }

    }) {
        Text("Text1",modifier = LayoutTag("text1"))
    }
}
```