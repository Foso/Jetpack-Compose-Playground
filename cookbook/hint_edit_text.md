# How to show hint with underline in a TextField

!!! info
    This is the API of version dev08. Newer versions may have a different one

We have all used EditText in classic Android development. It has lots of features like hint showing or default underline background. In Jetpack compose it's name is TextField
and we set up it like that.

## Create TextField
```kotlin
val state = state { "" }
TextField(
	value = state.value,
	modifier = modifier,
	onValueChange = { state.value = it },
	textStyle = yourTextStyle
)
```

With textStyle parameter you can change your TextField's font, font size, color and many other things, but there are something that its missing, you cant quite set its PlaceHolder
text(Hint). So how can we do that? If you think about that hint's only purpose is to be shown when TextField is empty and be hidden when we are starting to type something in TextField.
So we need two views one Text for hint showing and one TextField. They must have same location on the screen so it will look like same component. So without further ado let's start
implementing it.

## Create HintTextField
```kotlin
@Composable
fun HintEditText(
    hintText: String = "",
    modifier: Modifier = Modifier.None,
    textStyle: TextStyle = currentTextStyle()
) {
    val state = state { "" }
    val inputField = @Composable {
        TextField(
            value = state.value,
            modifier = modifier,
            onValueChange = { state.value = it },
            textStyle = textStyle.merge(TextStyle(textDecoration = TextDecoration.None))
        )
    }

    Layout(
        children = @Composable {
            inputField()
            Text(
                text = hintText,
                modifier = modifier,
                style = textStyle.merge(TextStyle(color = Color.Gray))
            )
            Divider(color = Color.Black, height = 2.dp)
        },
        measureBlock = { measurables: List<Measurable>, constraints: Constraints, _ ->
            val inputFieldPlace = measurables[0].measure(constraints)
            val hintEditPlace = measurables[1].measure(constraints)
            val dividerEditPlace = measurables[2].measure(
                Constraints(constraints.minWidth, constraints.maxWidth, 2.ipx, 2.ipx)
            )
            layout(
                inputFieldPlace.width,
                inputFieldPlace.height + dividerEditPlace.height
            ) {
                inputFieldPlace.place(0.ipx, 0.ipx)
                if (state.value.isEmpty())
                    hintEditPlace.place(0.ipx, 0.ipx)
                dividerEditPlace.place(0.ipx, inputFieldPlace.height)
            }
        })
}
```


Seems like lots of code for simple functional, doesn’t it? Let’s describe whats happening from the function declaration. It has three function parameters and they are pretty
self-explanatory. As second part we are creating TextField lambda and passing it in Layout Composable function, with our HintText and Divider, which as you might have guessed
will create underline background. Now it's time to decide where we are going to put our HintTextField. 

First of all we need to measure our views and **measureBlock** will help us do that. 
Measurables list will contain three items(Our TextField, HintText and Divider) as Measurable type, we need to call measure on all of list items and pass constraints in it. Constraints
is a class which only has four properties(minWidth, maxWidth, minHeight, maxHeight). We can pass constraints which is given to us by measuring @Composable children lambda, which works
with our TextField and HintText because we want them to have same size as it's parent, but when it comes to underline background we need it to stay as thin as possible. 
Now we are measuring our HintTextField one more time and placing it's children on some (x, y).
 
One last thing to realize is that if our state value is not empty we don’t place
our HintText at all!