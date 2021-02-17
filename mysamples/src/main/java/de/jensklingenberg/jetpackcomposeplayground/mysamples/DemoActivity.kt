package de.jensklingenberg.jetpackcomposeplayground.mysamples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Providers
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.setContent
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.material.linearprogress.LinearProgressIndicatorSample
import de.jensklingenberg.jetpackcomposeplayground.mysamples.github.other.AlertDialogSample

data class User(val name: String, val age: Int)

val LocalActiveUser = compositionLocalOf<User> { error("No user found!") }

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlertDialogSample()
        }
    }
}
@Composable
private fun MyUserScreen() {
    val user = User("Jens", 31)
    Providers(LocalActiveUser provides user) {
        UserInfo()
    }
}


@Composable
fun UserInfo() {
    Column {
        Text("Name: " + LocalActiveUser.current.name)
        Text("Age: " + LocalActiveUser.current.age)
    }
}