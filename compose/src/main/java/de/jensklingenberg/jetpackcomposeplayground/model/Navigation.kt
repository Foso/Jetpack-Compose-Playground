package de.jensklingenberg.jetpackcomposeplayground.model

import androidx.compose.state
import androidx.compose.unaryPlus
import de.jensklingenberg.jetpackcomposeplayground.samples.text.SimgpleTextDemo

/**
 * Custom navigation class
 */
class Navigation {
    private val page = +state { -1 }
    var func = { SimgpleTextDemo() }
    var entries: List<Page>? = emptyList()

    fun setPages(pages: List<Page>) {
        entries = pages
    }

    fun setHome() {
        page.value = -1
    }

    fun getPageIndex(): Int {
        return page.value
    }

    fun setStartPage(function: () -> Unit) {
        func = function
    }

    fun setPage(value: Int) {
        page.value = value
    }

    fun navigateToPage(value: Int) {
        when (value) {
            -1 -> func()
            else -> {
                entries!![value].function.invoke()
            }

        }

    }

}



