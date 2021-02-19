# Snackbar

!!! info
    This is the API of version 1.0.0-alpha10. Newer versions may have a different one

"Snackbars provide brief messages about app processes at the bottom of the screen."
    
<p align="left">
  <img src ="../../images/material/snackbar/snackbarDemo.png" height=100 width=300 />
</p>


```kotlin
@Composable
fun SnackbarDemo() {
    Column {
        val snackbarVisibleState = remember { mutableStateOf(false) }

        Button(onClick = { snackbarVisibleState.value = !snackbarVisibleState.value }) {
            if (snackbarVisibleState.value) {
                Text("Hide Snackbar")
            } else {
                Text("Show Snackbar")
            }
        }
        if (snackbarVisibleState.value) {
            Snackbar(
                text = { Text(text = "This is a snackbar!") },
                action = {
                    Button(onClick = {}) {
                        Text("MyAction")
                    }
                },
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}
```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#snackbar)
* [Full Example Code]({{ site.samplefolder }}/material/snackbar/SnackbarDemo.kt)
