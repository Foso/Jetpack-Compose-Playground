package de.jensklingenberg.jetpackcomposeplayground.ui.github

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.Composable
import androidx.compose.Providers
import androidx.compose.ambientOf
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.layout.Column
import androidx.ui.tooling.preview.Preview

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

@Preview
@Composable
fun UserInfo() {
    Column {
        Text("Name: " + ActiveUser.current.name)
        Text("Age: " + ActiveUser.current.age)
    }
}
