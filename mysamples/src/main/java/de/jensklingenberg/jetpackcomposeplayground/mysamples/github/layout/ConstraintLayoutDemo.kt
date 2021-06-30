package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.layout



import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun ConstraintLayoutDemo() {
    ConstraintLayout {
        val (text1,text2,text3) = createRefs()

        Text("Text1", Modifier.constrainAs(text1){
            start.linkTo(text2.end)
        })
        Text("Text2", Modifier.constrainAs(text2){
            top.linkTo(text1.bottom)
        })
        Text("This is a very long text", Modifier.constrainAs(text3){
            start.linkTo(text2.end)
            top.linkTo(text2.bottom)
        })
    }
}
