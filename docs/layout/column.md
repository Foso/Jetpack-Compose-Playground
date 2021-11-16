<!---
This is the API of version 1.0.5
-->
# Column

A Column will show each child below the previous children. It's similar to a LinearLayout with vertical orientation.

<p align="left">
  <img src ="{{ site.images }}/layout/column/ColumnExample.png" height=100 width=300 />
</p>

```kotlin
@Composable
fun ColumnExample() {
    Column {
        Text("Hello World!")
        Text("Hello World!2")
    }
}

```

## Content Alignment
### Horizontal
You can use **horizontalAlignment** to set the horizontal alignment of the content in the Column

=== "Alignment.Start"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/start.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    fun ColumnCenterHorizontal() {
        Column(horizontalAlignment = Alignment.Start, modifier = Modifier.width(200.dp)) {
            Text("Hello World!")
            Text("Hello World!2")
        }

    }
    ```


=== "Alignment.CenterHorizontally"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/centerhorizontal.png" height=100 width=300 style="border: 1px solid black;" />
    </p>
    ```kotlin

    fun ColumnCenterHorizontal() {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.width(200.dp)) {
            Text("Hello World!")
            Text("Hello World!2")
        }

    }
    ```

=== "Alignment.End"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/end.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    fun ColumnCenterHorizontal() {
        Column(horizontalAlignment = Alignment.End, modifier = Modifier.width(200.dp)) {
            Text("Hello World!")
            Text("Hello World!2")
        }

    }
    ```

You can also use the *align* modifier:

=== "Modifier.align(Alignment.Start)"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/modifierStart.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    fun ColumnCenterHorizontal() {
        Column(modifier = Modifier.width(200.dp)) {
                Text("Hello World!")
                Text("Hello World!2", modifier = Modifier.align(Alignment.Start))
            }
    }
    ```


=== "Modifier.align(Alignment.CenterHorizontally)"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/modifierCenterH.png" height=100 width=300  style="border: 1px solid black;" />
    </p>
    ```kotlin

    fun ColumnCenterHorizontal() {
         Column(modifier = Modifier.width(200.dp)) {
                Text("Hello World!")
                Text("Hello World!2",modifier = Modifier.align(Alignment.CenterHorizontally))
            }
    }
    ```

=== "Modifier.align(Alignment.End)"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/modifierEnd.png" height=100 width=300  style="border: 1px solid black;"/>
    </p>
    ```kotlin

    fun ColumnCenterHorizontal() {
        Column(modifier = Modifier.width(200.dp)) {
                Text("Hello World!")
                Text("Hello World!2",modifier = Modifier.align(Alignment.End))
            }

    }
    ```

### Vertical
You can use **verticalArrangement** to set the vertical alignment of the content in the Column

=== "Arrangement.Top"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/top.png" height=100 width=300  style="border: 1px solid black;"/>
    </p>
    ```kotlin

    fun ColumnVerticalTop() {
        Column(verticalArrangement = Arrangement.Top, modifier = Modifier.height(100.dp).background(Color.LightGray)) {
                Text("Hello World!")
                Text("Hello World!2")
            }
    }
    ```


=== "Arrangement.Center"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/vcenter.png" height=100 width=300  style="border: 1px solid black;"/>
    </p>
    ```kotlin

    fun ColumnVerticalCenter() {
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.height(100.dp).background(Color.LightGray)) {
                Text("Hello World!")
                Text("Hello World!2")
            }
    }
    ```

=== "Arrangement.Bottom"

    <p align="left">
      <img src ="{{ site.images }}/layout/column/vbottom.png" height=100 width=300  style="border: 1px solid black;"/>
    </p>
    ```kotlin

    fun ColumnVerticalBottom() {
        Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.height(100.dp).background(Color.LightGray)) {
                Text("Hello World!")
                Text("Hello World!2")
            }
    }
    ```


## See also:
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/foundation/layout/package-summary#column)
* [Full Example Code]({{ site.samplefolder }}/layout/ColumnExample.kt)
