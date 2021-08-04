# Snackbar

!!! info
    This is the API of version 1.0.1

"Snackbars provide brief messages about app processes at the bottom of the screen."
    
<p align="left">
  <img src ="{{ site.images }}/material/snackbar/snackbarDemo.png" height=100 width=300 />
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

                action = {
                    Button(onClick = {}) {
                        Text("MyAction")
                    }
                },
                modifier = Modifier.padding(8.dp)
            ) { Text(text = "This is a snackbar!") }
        }
    }
}
```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#snackbar)
* [Full Example Code]({{ site.samplefolder }}/material/snackbar/SnackbarDemo.kt)
