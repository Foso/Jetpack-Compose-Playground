import androidx.compose.runtime.mutableStateOf
import org.jetbrains.compose.common.foundation.layout.Column
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    val count = mutableStateOf(0)

    renderComposable(rootElementId = "root") {
        Div(attrs = {
            style { padding(25.px) }
        }, content = {
            Text("Hello World")
            Div {
                Button(attrs = {
                    onClick { count.value = count.value - 1 }
                }) {
                    Text("-")
                }

                Span(attrs = { style { padding(15.px) } }, content = {
                    Text("${count.value}")
                })


                Button(attrs = {
                    onClick { count.value = count.value + 1 }
                }) {
                    Text("+")
                }
            }


        })
    }
}