package de.jensklingenberg.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.setContent


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           MyComposeApp()
        }
    }
}

