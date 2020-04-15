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

