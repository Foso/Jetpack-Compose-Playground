package de.jensklingenberg.jetpackcomposeplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.demos.DemoActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        startActivity(Intent(this, DemoActivity::class.java))
     //   startActivity(Intent(this, MyComposeActivity::class.java))

    }

}
