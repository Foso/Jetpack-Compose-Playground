package androidx.ui.material
import androidx.compose.Composable
import androidx.ui.core.*
import androidx.ui.foundation.*
import androidx.ui.foundation.shape.RectangleShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.layout.*
import androidx.ui.layout.RowScope.weight
import androidx.ui.material.*
import androidx.ui.semantics.Semantics
import androidx.ui.unit.Dp
import androidx.ui.unit.dp

/**
 * A TopAppBar displays information and actions relating to the current screen and is placed at the
 * top of the screen.
 *
 * This TopAppBar has slots for a title, navigation icon, and actions. Use the other TopAppBar
 * overload for a generic TopAppBar with no restriction on content.
 *
 * @sample androidx.ui.material.samples.SimpleTopAppBar
 *
 * @param title The title to be displayed in the center of the TopAppBar
 * @param navigationIcon The navigation icon displayed at the start of the TopAppBar. This should
 * typically be an [IconButton] or [IconToggleButton].
 * @param actions The actions displayed at the end of the TopAppBar. This should typically be
 * [IconButton]s. The default layout here is a [Row], so icons inside will be placed horizontally.
 * @param backgroundColor The background color for the TopAppBar. Use [Color.Transparent] to have
 * no color.
 * @param contentColor The preferred content color provided by this TopAppBar to its children.
 * Defaults to either the matching `onFoo` color for [backgroundColor], or if [backgroundColor]
 * is not a color from the theme, this will keep the same value set above this TopAppBar.
 * @param elevation the elevation of this TopAppBar.
 */
@Composable
fun TopAppBar(
    title: @Composable() () -> Unit,
    modifier: Modifier = Modifier.None,
    navigationIcon: @Composable() (() -> Unit)? = null,
    actions: @Composable() RowScope.() -> Unit = {},
    backgroundColor: Color = MaterialTheme.colors.primarySurface,
    contentColor: Color = contentColorFor(backgroundColor)) {


}

