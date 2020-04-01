import androidx.animation.PhysicsBuilder
import androidx.animation.Spring.DampingRatioHighBouncy
import androidx.animation.Spring.StiffnessLow
import androidx.compose.Composable
import androidx.compose.Model
import androidx.compose.remember
import androidx.ui.animation.animate
import androidx.ui.core.DrawClipToBounds
import androidx.ui.foundation.Text
import androidx.ui.core.drawLayer
import androidx.ui.foundation.Border
import androidx.ui.foundation.Box
import androidx.ui.foundation.Icon
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.Add
import androidx.ui.material.icons.filled.Menu
import androidx.ui.material.icons.filled.Navigation
import androidx.ui.unit.dp

/**
 * Got this from: https://gist.github.com/zach-klippenstein/e2c8e6edf0d950d8ba527cd0681c5b60
 */

@Model
data class DrawModel(
    var scaleX: Float = 1f,
    var scaleY: Float = 1f,
    var rotationX: Float = 0f,
    var rotationY: Float = 0f,
    var rotationZ: Float = 0f,
    var elevation: Float = 0f,
    var alpha: Float = 1f
)

@Composable
fun DrawLayerDemo() {
    val model = remember { DrawModel() }

    Column() {
        Config(model)
        Spacer(modifier = LayoutWeight(1f))
        Display(model)
    }
}

@Composable
private fun Config(model: DrawModel) {
    LabeledSlider(
        label = "ScaleX",
        value = model.scaleX,
        range = 0f..2f,
        onChanged = model::scaleX::set
    )
    LabeledSlider(
        label = "ScaleY",
        value = model.scaleY,
        range = 0f..2f,
        onChanged = model::scaleY::set
    )
    LabeledSlider(
        label = "RotationX",
        value = model.rotationX,
        range = -180f..180f,
        onChanged = model::rotationX::set
    )
    LabeledSlider(
        label = "RotationY",
        value = model.rotationY,
        range = -180f..180f,
        onChanged = model::rotationY::set
    )
    LabeledSlider(
        label = "RotationZ",
        value = model.rotationZ,
        range = -180f..180f,
        onChanged = model::rotationZ::set
    )
    LabeledSlider(
        label = "Elevation",
        value = model.elevation,
        range = 0f..10f,
        onChanged = model::elevation::set
    )
    LabeledSlider(
        label = "Alpha",
        value = model.alpha,
        range = 0f..1f,
        onChanged = model::alpha::set
    )
}

@Composable
private fun LabeledSlider(
    label: String,
    value: Float,
    range: ClosedFloatingPointRange<Float>,
    onChanged: (Float) -> Unit
) {
    val position = SliderPosition(initial = 0f, valueRange = range)
    position.value = value
    Text(label)
    Slider(position = position, onValueChange = onChanged)
}

@Composable
private fun ColumnScope.Display(model: DrawModel) {
    val anim = remember {
        PhysicsBuilder<Float>(dampingRatio = DampingRatioHighBouncy, stiffness = StiffnessLow)
    }

    Box(
        modifier = DrawClipToBounds + LayoutGravity.Center,
        padding = 24.dp
    ) {
        Center {
            Surface(
                modifier = LayoutAspectRatio(1f) + drawLayer(
                    scaleX = animate(model.scaleX, animBuilder = anim),
                    scaleY = animate(model.scaleY, animBuilder = anim),
                    rotationX = animate(model.rotationX, animBuilder = anim),
                    rotationY = animate(model.rotationY, animBuilder = anim),
                    rotationZ = animate(model.rotationZ, animBuilder = anim),
                    elevation = animate(model.elevation, animBuilder = anim),
                    // Animating the alpha just look janky.
                    alpha = model.alpha
                ),
                shape = RoundedCornerShape(10.dp),
                border = Border(1.dp, Color.Red),
                color = Color.LightGray
            ) {
                Scaffold(
                    topAppBar = {
                        TopAppBar(
                            title = { Text("Demo") },
                            navigationIcon = { IconButton(onClick = {}) { Icon(Icons.Default.Navigation) } }
                        )
                    },
                    floatingActionButton = { FloatingActionButton(onClick = {}) { Icon(Icons.Default.Add) } }
                ) {
                    Center {
                        Column {
                            Text("Some text")
                            CircularProgressIndicator()
                        }
                    }
                }
            }
        }
    }
}
