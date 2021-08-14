# BadgeBox
A `BadgeBox` is used to decorate content with a badge that can contain dynamic information, such as the presence of a new notification or a number of pending requests. Badges can be icon only or contain short text.

A common use case is to display a badge with bottom navigation items. For more information, see Bottom Navigation

A simple icon with badge example looks like:

<p align="left">
  <img src ="{{ site.images }}/material/badgebox/img.png"  />
</p>

```kotlin
@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun BadgeBoxDemo() {
    BottomNavigation {
        BottomNavigationItem(
            icon = {
                BadgeBox(badgeContent = { Text("8") }) {
                    Icon(
                        Icons.Filled.Favorite,
                        contentDescription = "Favorite"
                    )
                }

            },
            selected = false,
            onClick = {})
    }
}
```


### See also:
* [Full Example Code]({{ site.samplefolder }}/material/badgebox/BadgeBoxDemo.kt)
