package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation

import android.graphics.Movie
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.CombinedLoadStates
import androidx.paging.LoadState
import de.jensklingenberg.jetpackcomposeplayground.R
import timber.log.Timber

@Composable
fun LazyVerticalGridDemo() {

    Timber.e("aaaaaaaa it = a")

    VerticalGrid()


}


private fun span2(): (LazyGridItemSpanScope.(Int) -> GridItemSpan) {
    return fun LazyGridItemSpanScope.(it: Int): GridItemSpan {
        Timber.e("LazyGridItemSpanScope it = $it")
        return GridItemSpan(it)
    }
}



@Composable
private fun VerticalGrid() {
    LazyVerticalGrid(
        columns = AdaptiveWithMax(128.dp, 2),

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ),
        content = {
            items(
                count = myItemsList.size,
                span = span2(),
                itemContent = { index: Int ->
                    if (index == 4) {
                        Card(
                            backgroundColor = Color.Green,
                            modifier = Modifier
                                .padding(4.dp)
                                .height(50.dp)
                                .fillMaxWidth(),
                            elevation = 8.dp,
                            content = {
                                Text(text = "item at index 4")
                            }
                        )
                        return@items
                    }

                    Card(
                        backgroundColor = Color.Red,
                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth(),
                        elevation = 8.dp,
                    ) {
                        val myItemSuperclass = myItemsList[index]

                        when (myItemSuperclass) {
                            is MyItemSuperclass.MyItem -> {
                                Text(
                                    text = myItemSuperclass.title,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 30.sp,
                                    color = Color(0xFFFFFFFF),
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.padding(16.dp)
                                )
                            }
                            is MyItemSuperclass.MyOtherItem -> Text(
                                text = myItemSuperclass.title,
                                fontWeight = FontWeight.Bold,
                                fontSize = 30.sp,
                                color = Color(0xFF00BCD4),
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                    }
                }
            )
        }
    )
}


sealed class MyItemSuperclass {

    data class MyItem(val title: String, val subtitle: String, val id: Int) : MyItemSuperclass()
    data class MyOtherItem(val title: String, val subtitle: String, val id: Int) : MyItemSuperclass()
}

private val myItemsList = listOf(
    MyItemSuperclass.MyItem(
        title = "title 1",
        subtitle = "subtitle 1",
        id = 1
    ),
    MyItemSuperclass.MyItem(
        title = "title 2",
        subtitle = "subtitle 2",
        id = 2
    ),
    MyItemSuperclass.MyItem(
        title = "title 3",
        subtitle = "subtitle 3",
        id = 3
    ),
    MyItemSuperclass.MyItem(
        title = "title 4",
        subtitle = "subtitle 4",
        id = 4
    ),
    MyItemSuperclass.MyItem(
        title = "title 5",
        subtitle = "subtitle 5",
        id = 5
    ),
    MyItemSuperclass.MyItem(
        title = "title 6",
        subtitle = "subtitle 6",
        id = 6
    ),
    MyItemSuperclass.MyItem(
        title = "title 7",
        subtitle = "subtitle 7",
        id = 7
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 8",
        subtitle = "subtitle 8",
        id = 8
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 9",
        subtitle = "subtitle 9",
        id = 9
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 10",
        subtitle = "subtitle 10",
        id = 10
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 11",
        subtitle = "subtitle 11",
        id = 11
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 12",
        subtitle = "subtitle 12",
        id = 12
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 13",
        subtitle = "subtitle 13",
        id = 13
    ),
    MyItemSuperclass.MyOtherItem(
        title = "title 14",
        subtitle = "subtitle 14",
        id = 14
    )
)
