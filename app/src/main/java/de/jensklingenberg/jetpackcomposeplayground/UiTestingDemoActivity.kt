package de.jensklingenberg.jetpackcomposeplayground


import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.testing.TestingExample


class UiTestingDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestingExample()
        }
    }
}