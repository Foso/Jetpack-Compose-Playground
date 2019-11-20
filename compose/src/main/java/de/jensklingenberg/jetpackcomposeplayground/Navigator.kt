package de.jensklingenberg.jetpackcomposeplayground

import androidx.compose.State
import androidx.compose.state
import androidx.compose.unaryPlus
import androidx.ui.material.MaterialTheme
import de.jensklingenberg.jetpackcomposeplayground.data.mainPagesEntries
import de.jensklingenberg.jetpackcomposeplayground.ui.HomeScreen

class Navigator {

    private val pageIndex = +state { -1 }
    private var home = {}

    fun setHome(home: () -> Unit) {
        this.home = home
    }

    fun navigateToHome() {
        pageIndex.value = -1
    }

    fun getIndex(): State<Int> {
        return pageIndex
    }

    fun navigateTo(pageIndex: Int) {

        when (pageIndex) {
            -1 -> {
                home.invoke()
            }
            else -> {
                MaterialTheme {
                    mainPagesEntries[pageIndex].function.invoke()
                }
            }
        }
    }
}