package de.jensklingenberg.jetpackcomposeplayground.sample

import android.util.Log
import androidx.compose.*
import androidx.ui.baseui.selection.Toggleable
import androidx.ui.core.Text
import androidx.ui.engine.text.TextAlign
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import de.jensklingenberg.jetpackcomposeplayground.rally.RallyTheme

@Composable
fun MyApp() {
    val navigator = Navigator()

    MaterialTheme {

        Column {


            PageRouter(navigator) {
                MainPage(navigator) { function->navigator.setPage { function() }}

                it.test.value.invoke()

            }
        }


    }
}


class Navigator() {
    val test = +state { { } }
    var start = true


    fun setPage(function: () -> Unit) {
        start = false

        test.value = function

    }

    fun setStartPage(function: () -> Unit) {
        if (start) {
            test.value = function
            start = false
        }
    }
}


@Composable
fun EmptyPage() {
    Toggleable { }

}

@Composable
fun MainPage(navigator: Navigator, start: ( () -> Unit) -> Unit) {
    AppBar(title = "Compose Playground")


    Button(
        text = "CounterDemo",
        onClick = {
            start {Counter(start)}
        })

    Button(
        text = "empty",
        onClick = {
            start {}
        })


}



@Composable
fun navigate(context: Composer<*>, state: State<() -> Unit>, @Children children: @Composable() () -> Unit) {

    context.apply {
        Column() {
            state.value.invoke()

        }
    }


}




@Composable
fun PageRouter(
    navigator: Navigator,
    @Children children: @Composable() (Navigator) -> Unit
) {


    Column(crossAxisAlignment = CrossAxisAlignment.Start) {


        children(navigator)

    }

}


@Composable
fun AppBar(title: String = "") {
    Row(mainAxisAlignment = MainAxisAlignment.Center) {
        Text(text = title, style = +themeTextStyle { h4 }, textAlign = TextAlign.CENTER)
    }
}



class CounterModel() {
    val counter = +state { 0 }
    var header = "Counter demo"

}


@Composable
fun Counter(start: ( () -> Unit) -> Unit) {

    val countState = CounterModel()

    val counterModel = countState//+memo { CounterModel() }

    Center {
        Column {
            CounterHeader(counterModel)
            AddSubtractButtons(counterModel)
            CounterLabel(counterModel)
        }
    }

}

@Composable
fun CounterHeader(counterModel: CounterModel) {
    Text(text = counterModel.header, style = +themeTextStyle { h4 })
}

@Composable
fun AddSubtractButtons(
    counterModel: CounterModel
) {
    Button(
        text = "Add",
        onClick = {
            Log.d("D", counterModel.counter.value.toString())
            counterModel.counter.value++
        })
    Button(
        text = "Subtract",
        onClick = { counterModel.counter.value-- })
}

@Composable
fun CounterLabel(counterModel: CounterModel) {
    Text(text = "Clicks: ${counterModel.counter.value}", style = +themeTextStyle { h4 })
}
