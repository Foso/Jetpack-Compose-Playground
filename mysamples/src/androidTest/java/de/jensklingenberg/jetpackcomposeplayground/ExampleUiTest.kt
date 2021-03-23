package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.testing.MainLayout
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUiTest {

    @Rule
    @JvmField
    var composeTestRule = createComposeRule()

    @Test
    fun useAppContext() {
        // Context of the app under test.
        composeTestRule.setContent {
            MainLayout()
        }
        composeTestRule.onNodeWithText("Welcome").assertExists()
        composeTestRule.onNodeWithText("Welcome").performClick()
        composeTestRule.onNodeWithText("Welcome").assertDoesNotExist()

        composeTestRule.onNodeWithText("Bye").assertExists()


    }
}
