# Badge
A `BadgeBox` is used to decorate content with a badge that can contain dynamic information, such as the presence of a new notification or a number of pending requests. Badges can be icon only or contain short text.

A common use case is to display a badge with bottom navigation items. For more information, see Bottom Navigation

A simple icon with badge example looks like:
```kotlin
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text

BottomNavigation {
    BottomNavigationItem(
        icon = {
            BadgedBox(badge = { Badge { Text("8") } }) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Favorite"
                )
            }
        },
        selected = false,
        onClick = {}
    )
}
```