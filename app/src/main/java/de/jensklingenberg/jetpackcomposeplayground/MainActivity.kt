package de.jensklingenberg.jetpackcomposeplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.setContent
import de.jensklingenberg.jetpackcomposeplayground.model.Navigation


class MainActivity : AppCompatActivity() {

    var navigation: Navigation? = null

    var index = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {


            MainPage2 { t -> change(t) }


        }


    }

    fun change(index: Int) {
        startActivity(SecondActivity.getStartIntent(this, index))
    }
}

