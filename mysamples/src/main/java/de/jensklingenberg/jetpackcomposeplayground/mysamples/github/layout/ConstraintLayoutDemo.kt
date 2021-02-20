package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout



import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet


@Composable
fun ConstraintLayoutDemo() {
    ConstraintSet {
        val text1 = createRefFor("text1")
        val text2 = createRefFor("text2")
        val text3 = createRefFor("text3")

        constrain(text1) {
            start.linkTo(text2.end)
        }
        constrain(text2) {
            top.linkTo(text1.bottom)
        }

        constrain(text3) {
            start.linkTo(text2.end)
            top.linkTo(text2.bottom)
        }

    }
    ConstraintLayout {
        Text("Text1", Modifier.layoutId("text1"))
        Text("Text2", Modifier.layoutId("text2"))
        Text("This is a very long text", Modifier.layoutId("text3"))
    }
}
