# UI Testing

## Setup
Add the Compose testing library to your dependencies in build.gradle

```kotlin
androidTestImplementation("androidx.ui:ui-test:$compose_version")
debugImplementation("androidx.compose.ui:ui-test-manifest:$compose_version")
```

## Example
Let's say you have the following example code, it's a button with a text that says **Hello** and when you click on it, it turns to **Bye**

```kotlin
@Composable
fun TestingExample() {
    val state = remember { mutableStateOf("Hello") }
    Button(onClick = { state.value = "Bye" }) {
        Text(state.value)
    }
}
```


## TestRule
To run this Composable in your test Code you have 2 options:

### 1) createComposeRule()
```kotlin
@Rule
@JvmField
var composeTestRule: ComposeContentTestRule = createComposeRule()
```

You can use this when you want to run your Composable without a specific Activity. You can then use the **setContent()** from the TestRule to host your Composable.

```kotlin
composeTestRule.setContent {
    TestingExample()
}
```


### 2) createAndroidComposeRule()
```kotlin
@Rule
@JvmField
var composeTestRule: ComposeContentTestRule = createAndroidComposeRule<UiTestingDemoActivity>()
```

You can use this when you want to start your test with a specific Activity.

## Interaction with Composables

Now we want to test how the Composable reacts when we interact with it. 
Usually in Tests we would use Espresso for that, but you can use that only for classic Android Views and not for Composables.

The ComposeTestRule will offer a similar API

```kotlin
class ExampleUiTestWithAndroidComposeRule {

    @Rule
    @JvmField
    var composeTestRule: ComposeContentTestRule = createAndroidComposeRule<UiTestingDemoActivity>()

    @Test
    fun whenIClickOnButton_TheTextShouldChange() {
        composeTestRule.onNodeWithText("Hello").assertExists()
        composeTestRule.onNodeWithText("Hello").performClick()
        composeTestRule.onNodeWithText("Hello").assertDoesNotExist()
        composeTestRule.onNodeWithText("Bye").assertExists()
    }

}
```

As you can see above we used the TestRule methods to click on the node with the text **Hello** and asserted that the text changed to **Bye**

The TestRule offers a lot of different methods. You can find a cheatSheet [here](https://developer.android.com/jetpack/compose/testing-cheatsheet) 

### TestTags
The test above is only half correct, because it looks for the text inside the button and not the button itself.
Composables have no resource ids so we cant just use **onView(withId(R.id.my_view))** to find a Composable in a test, also we can't find Composables of a specific "type" 
like a button, because everything is just a Composable function. 

When you can't find a Composable by a text and you want to make it detectable in your test. Jetpack Compose offers the concept of a **TestTag**.
testTag is a modifier that needs to be set to a Composable. It expects a string which will be used as a reference in your test.

```kotlin
@Composable
fun TestingExample() {
    val state = remember { mutableStateOf("Hello") }
    Button(onClick = { state.value = "Bye" }, modifier = Modifier.testTag("MyTestTag")) {
        Text(state.value)
    }
}
```

Now you can use **onNodeWithTag("MyTestTag")** to find the button Composable.

```kotlin
@Test
fun whenIClickOnButton_TheTextShouldChange() {
    composeTestRule.onNodeWithTag("MyTestTag").assertTextEquals("Hello")
    composeTestRule.onNodeWithTag("MyTestTag").performClick()
    composeTestRule.onNodeWithText("Hello").assertDoesNotExist()
    composeTestRule.onNodeWithTag("MyTestTag").assertTextEquals("Bye")
}
```

### PrintToLog
When you want to get more information about how the node tree of a Composable looks like, 
you can use **printToLog()** on a node.

```kotlin
composeTestRule.onNodeWithTag("MyTestTag").printToLog("XXX")
```

will print to logcat:

```kotlin
2022-01-07 22:58:55.048 9567-9587/de.jensklingenberg.jetpackcomposeplayground D/XXX: printToLog:
Printing with useUnmergedTree = 'false'
Node #2 at (l=0.0, t=325.0, r=195.0, b=424.0)px, Tag: 'MyTestTag'
Role = 'Button'
Text = '[Hello]'
Actions = [OnClick, GetTextLayoutResult]
MergeDescendants = 'true'
```

## See also:
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/app/src/androidTest/java/de/jensklingenberg/jetpackcomposeplayground/ExampleUiTestWithAndroidComposeRule.kt)
* [Full Example Code](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/app/src/androidTest/java/de/jensklingenberg/jetpackcomposeplayground/ExampleUiTestWithComposeRule.kt)
