package de.jensklingenberg.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import de.jensklingenberg.jetpackcomposeplayground.ui.samples.androidx.ui.animation.AnimatableSeekBarDemo

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            //AnimatableSeekBarDemo()
        }
    }

    override fun onBackPressed() {}
}

