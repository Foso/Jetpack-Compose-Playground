# DropdownMenu

!!! info
    This is the API of version 1.0.0-rc01

The DropdownMenu Composable can be used to create DropdownMenu.

<p align="center">
  <img src ="{{ site.images }}/material/dropdownmenu/dropdown.png"  />
</p>

```kotlin
fun DropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    offset: DpOffset = DpOffset(0.dp, 0.dp),
    properties: PopupProperties = PopupProperties(focusable = true),
    content: @Composable ColumnScope.() -> Unit
)
```

**expanded**
If true, the popupmenu with the dropdownContent will be shown

**onDismissRequest**
Called when the menu should be dismiss

```kotlin
@Composable
fun DropdownDemo() {
    var expanded by remember { mutableStateOf(false) }
    val items = listOf("A", "B", "C", "D", "E", "F")
    val disabledValue = "B"
    var selectedIndex by remember { mutableStateOf(0) }
    Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.TopStart)) {
        Text(items[selectedIndex],modifier = Modifier.fillMaxWidth().clickable(onClick = { expanded = true }).background(
            Color.Gray))
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth().background(
                Color.Red)
        ) {
            items.forEachIndexed { index, s ->
                DropdownMenuItem(onClick = {
                    selectedIndex = index
                    expanded = false
                }) {
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
}
```


## See also:
* [Material.io](https://material.io/components/menus#dropdown-menu)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#dropdownmenu)
* [Full Example Code]({{ site.samplefolder }}/material/dropdown/DropdownDemo.kt)
