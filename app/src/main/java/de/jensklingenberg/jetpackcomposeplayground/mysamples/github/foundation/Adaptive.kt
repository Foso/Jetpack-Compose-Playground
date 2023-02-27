package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.foundation

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class AdaptiveWithMax(private val minSize: Dp, private val max : Int) : GridCells {
        init {
            require(minSize > 0.dp)
        }

        override fun Density.calculateCrossAxisCellSizes(
            availableSize: Int,
            spacing: Int
        ): List<Int> {
            val bySpace = (availableSize + spacing) / (minSize.roundToPx() + spacing)
            val minBySpace = minOf(bySpace, max)
            val count = maxOf(minBySpace, 1)
            return calculateCellsCrossAxisSizeImpl(availableSize, count, spacing)
        }

        override fun hashCode(): Int {
            return minSize.hashCode()
        }

        override fun equals(other: Any?): Boolean {
            return other is AdaptiveWithMax && minSize == other.minSize
        }
    }

private fun calculateCellsCrossAxisSizeImpl(
    gridSize: Int,
    slotCount: Int,
    spacing: Int
): List<Int> {
    val gridSizeWithoutSpacing = gridSize - spacing * (slotCount - 1)
    val slotSize = gridSizeWithoutSpacing / slotCount
    val remainingPixels = gridSizeWithoutSpacing % slotCount
    return List(slotCount) {
        slotSize + if (it < remainingPixels) 1 else 0
    }
}