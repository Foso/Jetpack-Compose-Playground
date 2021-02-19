# DropdownMenu

!!! info
    This is the API of version 1.0.0-alpha08. Newer versions may have a different one

The DropdownMenu Composable can be used to create DropdownMenu.

<p align="center">
  <img src ="../../images/material/dropdownmenu/dropdown.png"  />
</p>

```kotlin
@Composable
fun DropdownMenu(
    toggle: @Composable () -> Unit,
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    toggleModifier: Modifier = Modifier,
    dropdownOffset: Position = Position(0.dp, 0.dp),
    dropdownModifier: Modifier = Modifier,
    dropdownContent: @Composable ColumnScope.() -> Unit
)
```

**toggle**

This is the layout of the DropdownMenu.

**expanded**

If true, the popupmenu with the dropdownContent will be shown

**onDismissRequest**

Called when the menu should be dismiss

**toggleModifier**

Here you can apply a modifier for **toggle**

**dropdownModifier**

Here you can apply a modifier for the popupmenu that shows the dropdownContent

**dropdownContent**

This is the content that will be shown inside the menu. You can use any Composable, but you can use DropdownMenuItem, for a item that follows material design spec


```kotlin
@Preview
@Composable
fun DropdownDemo() {
    val items = listOf("A", "B", "C", "D", "E", "F")
    val disabledValue = "B"
    var showMenu by remember { mutableStateOf( false ) }
    var selectedIndex by remember { mutableStateOf(0) }

    DropdownMenu(
            toggle = {
                Text(items[selectedIndex], modifier = Modifier.fillMaxWidth().clickable(onClick = { showMenu = true }))
            },
            expanded = showMenu,
            onDismissRequest = { showMenu = false },
            toggleModifier = Modifier.fillMaxWidth().background(Color.Gray),
            dropdownModifier = Modifier.fillMaxWidth().background(Color.Red)
    ) {
        items.forEachIndexed { index, s ->
            DropdownMenuItem(
                    enabled = (s != disabledValue),
                    onClick = {
                        selectedIndex = index
                        showMenu = false
                    }
            ) {
                val disabledText = if (s == disabledValue) {
                    " (Disabled)"
                } else {
                    ""
                }
                Text(text = s + disabledText)
            }
        }
    }
}
```


## See also:
* [Material.io](https://material.io/components/menus#dropdown-menu)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#dropdownmenu)
* [Full Example Code]({{ site.samplefolder }}/material/dropdown/DropdownDemo.kt)
