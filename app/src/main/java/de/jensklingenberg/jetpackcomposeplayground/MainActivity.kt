package de.jensklingenberg.jetpackcomposeplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.animation.demos.*
import androidx.ui.foundation.demos.*
import androidx.ui.framework.demos.autofill.ExplicitAutofillTypesActivity
import androidx.ui.framework.demos.focus.FocusableActivity
import androidx.ui.framework.demos.gestures.*
import androidx.ui.layout.demos.*
import androidx.ui.material.demos.*
import androidx.ui.material.studies.rally.RallyActivity
import androidx.ui.text.demos.ComposeTextActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       // startActivity(Intent(this, SnackbarActivity::class.java))
        startActivity(Intent(this, ComposeTextActivity::class.java))

    }

    override fun onBackPressed() {}
}
