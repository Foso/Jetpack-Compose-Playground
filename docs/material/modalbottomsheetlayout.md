<!---
This is the API of version 1.0.5
-->

# ModalBottomSheetLayout

<p align="center">
  <img src ="{{ site.images }}/material/modalbottomsheetlayout/modalbottomsheetlayout.png" height=100 width=300 />
</p>

## Example

```kotlin
@Composable
@OptIn(ExperimentalMaterialApi::class)
fun ModalBottomSheetSample() {
    val state = rememberModalBottomSheetState(ModalBottomSheetValue.Hidden)
    val scope = rememberCoroutineScope()
    ModalBottomSheetLayout(
        sheetState = state,
        sheetContent = {
            LazyColumn {
                items(50) {
                    ListItem(
                        text = { Text("Item $it") },
                        icon = {
                            Icon(
                                Icons.Default.Favorite,
                                contentDescription = "Localized description"
                            )
                        }
                    )
                }
            }
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Rest of the UI")
            Spacer(Modifier.height(20.dp))
            Button(onClick = { scope.launch { state.show() } }) {
                Text("Click to show sheet")
            }
        }
    }
}
```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#modalbottomsheetlayout)
* [Full Example Code]({{ site.samplefolder }}/material/modalbottomsheetlayout/ModalBottomSheetLayout.kt)
