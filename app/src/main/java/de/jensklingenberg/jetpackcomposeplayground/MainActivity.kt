package de.jensklingenberg.jetpackcomposeplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.animation.demos.*
import androidx.ui.foundation.demos.*
import androidx.ui.framework.demos.autofill.ExplicitAutofillTypesActivity
import androidx.ui.framework.demos.focus.FocusableActivity
import androidx.ui.framework.demos.gestures.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, TouchSlopDragGestureDetectorDemo::class.java))
    }

    override fun onBackPressed() {}
}
