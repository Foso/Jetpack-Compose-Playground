package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.junit4.createComposeRule
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.testing.TestingExample
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUiTestWithComposeRule {

    @Rule
    @JvmField
    var composeTestRule: ComposeContentTestRule = createComposeRule()

    @Before
    fun before(){
        composeTestRule.setContent {
            TestingExample()
        }
    }

    @Test
    fun whenIClickOnButton_TheTextShouldChange() {
        composeTestRule.onNodeWithText("Hello").assertTextEquals("Hello")
        composeTestRule.onNodeWithText("Hello").performClick()
        composeTestRule.onNodeWithText("Hello").assertDoesNotExist()
        composeTestRule.onNodeWithText("Bye").assertExists()
    }


    @Test
    fun whenIClickOnButton_TheTextShouldChange_WithTag() {
        composeTestRule.onNodeWithTag("MyTestTag").assertTextEquals("Hello")
        composeTestRule.onNodeWithTag("MyTestTag").performClick()
        composeTestRule.onNodeWithText("Hello").assertDoesNotExist()
        composeTestRule.onNodeWithTag("MyTestTag").assertTextEquals("Bye")
    }


}
