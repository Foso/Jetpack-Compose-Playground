<!---
This is the API of version 1.2.0
-->
# CircularProgressIndicator

A CircularProgressIndicator can be used to display a progress in circular shape.
There are two kinds:

**Indeterminate**

```kotlin
CircularProgressIndicator()
```

When you use the CircularProgressIndicator without the **progress** parameter, it will run forever.


**Determinate**

```kotlin
CircularProgressIndicator(progress = 0.5f)
```

<p align="left">
  <img src ="{{ site.images }}/material/circularprogressindicator/progresshalf.png"  />
</p>
When you set a value to the **progress** parameter, the indicator will be shown with that progress.
E.g. a progress of 0.5f will fill it to the half.

# Example
<div>
<video height="500" align="center" controls>
  <source src="{{ site.images }}/material/circularprogressindicator/circularprogress.mp4" type="video/mp4" align="center">
</video>
</div>

```kotlin
@Composable
fun CircularProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(Modifier.height(30.dp))
        Text("CircularProgressIndicator with undefined progress")
        CircularProgressIndicator()
        Spacer(Modifier.height(30.dp))
        Text("CircularProgressIndicator with progress set by buttons")
        CircularProgressIndicator(progress = animatedProgress)
        Spacer(Modifier.height(30.dp))
        OutlinedButton(
            onClick = {
                if (progress < 1f) progress += 0.1f
            }
        ) {
            Text("Increase")
        }

        OutlinedButton(
            onClick = {
                if (progress > 0f) progress -= 0.1f
            }
        ) {
            Text("Decrease")
        }
    }
}
```

## See also:
* [Material.io](https://material.io/components/progress-indicators#circular-progress-indicators)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#circularprogressindicator)
* [Full Example Code]({{ site.samplefolder }}/material/circularprogress/CircularProgressIndicatorSample.kt)
