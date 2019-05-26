package de.jensklingenberg.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.setContent
import de.jensklingenberg.jetpackcomposeplayground.model.Navigation
import de.jensklingenberg.jetpackcomposeplayground.samples.animation.RepeatedRotation


class MainActivity : AppCompatActivity() {

    lateinit var navigation : Navigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            navigation = Navigation()

            MyComposeApp(navigation)

        }
    }

    override fun onBackPressed() {
        navigation.setHome()

    }


}

