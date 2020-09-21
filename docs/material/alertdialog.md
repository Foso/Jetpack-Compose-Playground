# AlertDialog

!!! info
    This is the API of version dev09. Newer versions may have a different one

<p align="center">
  <img src ="../../images/material/alertdialog/AlertDialogSample.png"  height=100 width=300/>
</p>

```kotlin
@Composable
fun AlertDialogSample() {
    MaterialTheme {
        Column {
            val openDialog = state { false }

            Button( onClick = {
                openDialog.value = true
            }){
                Text("Click me")
            }

            if (openDialog.value) {
                AlertDialog(
                    onCloseRequest = {
                        openDialog.value = false
                    },
                    title = {
                        Text("Dialog Title")
                    },
                    text = {
                        Text("Here is a text ")
                    },
                    confirmButton = {
                        Button(

                            onClick = {
                                openDialog.value = false
                            }){
                            Text("This is the Confirm Button")
                        }
                    },
                    dismissButton = {
                        Button(

                            onClick = {
                                openDialog.value = false
                            }){
                            Text("This is the dismiss Button")
                        }
                    },
                    buttonLayout = AlertDialogButtonLayout.Stacked
                )
            }
        }

    }
}
```

## See also:
* [How do I display an alert dialog/popup modal?](https://github.com/vinaygaba/Learn-Jetpack-Compose-By-Example/blob/master/app/src/main/java/com/example/jetpackcompose/material/AlertDialogActivity.kt)