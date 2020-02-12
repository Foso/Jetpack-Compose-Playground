package de.jensklingenberg.jetpackcomposeplayground

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.foundation.demos.VerticalScrollerActivity
import androidx.ui.material.demos.ButtonActivity
import androidx.ui.material.studies.rally.RallyActivity
import androidx.ui.text.demos.ComposeTextActivity
import de.jensklingenberg.jetpackcomposeplayground.ui.MyComposeActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity)
        val button1 = findViewById<Button>(R.id.button1)
        button1.text="RallyApp"
        button1.setOnClickListener {
            startActivity(Intent(this, RallyActivity::class.java))
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.text="ComposeTextActivity"
        button2.setOnClickListener {
            startActivity(Intent(this, ComposeTextActivity::class.java))
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.text="VerticalScrollerActivity"
        button3.setOnClickListener {
            startActivity(Intent(this, VerticalScrollerActivity::class.java))
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.text="ButtonActivity"
        button4.setOnClickListener {
            startActivity(Intent(this, ButtonActivity::class.java))
        }

        val button5 = findViewById<Button>(R.id.button5)
        button5.text="MyComposeActivity"
        button5.setOnClickListener {
            startActivity(Intent(this, MyComposeActivity::class.java))
        }
    }

    override fun onBackPressed() {}
}
