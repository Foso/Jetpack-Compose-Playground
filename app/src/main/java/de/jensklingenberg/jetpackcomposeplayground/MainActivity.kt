package de.jensklingenberg.jetpackcomposeplayground

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import de.jensklingenberg.jetpackcomposeplayground.mysamples.DemoActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity)

        findViewById<Button>(R.id.button1).setOnClickListener {
            startActivity(Intent(this, DemoActivity::class.java))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
         //   startActivity(Intent(this, MyComposeActivity::class.java))
        }

    }

}
