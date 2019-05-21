package de.jensklingenberg.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.setContent
import androidx.ui.core.CraneWrapper

import de.jensklingenberg.jetpackcomposeplayground.sample.MyApp


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CraneWrapper {

                    MyApp()

            }
        }
    }
}

