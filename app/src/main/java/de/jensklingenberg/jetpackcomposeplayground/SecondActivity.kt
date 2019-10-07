package de.jensklingenberg.jetpackcomposeplayground

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent


class SecondActivity : AppCompatActivity() {

    companion object {
        const val ARG_PAGE_INDEX = "ARG_PAGE_INDEX"
        fun getStartIntent(context: Context, index: Int): Intent {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(ARG_PAGE_INDEX, index)
            return intent

        }
    }


    var pageIndex = -1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        pageIndex = intent.getIntExtra(ARG_PAGE_INDEX, -1)

        // val icon = imageFromResource(resources, R.drawable.ic_account_circle_black_24dp)

        setContent {

            mainPagesEntries[pageIndex].function(this)
        }
    }


    override fun onBackPressed() {
        finish()

    }


}

