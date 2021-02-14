package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.general

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.runtime.ambientOf
import androidx.compose.ui.platform.setContent


data class User(val name: String, val age: Int)

val ActiveUser = ambientOf<User> { error("No user found!") }

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyUserScreen()
        }
    }
}

@Composable
private fun MyUserScreen() {
    val user = User("Jens", 31)
    Providers(ActiveUser provides user) {
        UserInfo()
    }
}


@Composable
fun UserInfo() {
    Column {
        Text("Name: " + ActiveUser.current.name)
        Text("Age: " + ActiveUser.current.age)
    }
}
