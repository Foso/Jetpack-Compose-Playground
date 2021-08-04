# LinearProgressIndicator

!!! info
    This is the API of version 1.0.1

A LinearProgressIndicator can be used to display a progress in linear line, also known as a progress bar.
There are two kinds:

**Indeterminate**

```kotlin
LinearProgressIndicator()
```

When you use the LinearProgressIndicator without the **progress** parameter, it will run forever.


**Determinate**

```kotlin
LinearProgressIndicator(progress = 0.5f)
```

<p align="left">
  <img src ="{{ site.images }}/material/linearprogressindicator/progresshalf.png"  />
</p>
When you set a value to the **progress** parameter, the indicator will be shown with that progress.
E.g. a progress of 0.5f will fill it to the half.

# Example
<div>
<video height="500" align="center" controls>
  <source src="{{ site.images }}/material/linearprogressindicator/linearprogress.mp4" type="video/mp4" align="center">
</video>
</div>

```kotlin
@Composable
fun LinearProgressIndicatorSample() {
    var progress by remember { mutableStateOf(0.1f) }
    val animatedProgress = animateFloatAsState(
        targetValue = progress,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(Modifier.height(30.dp))
        Text("LinearProgressIndicator with undefined progress")
        LinearProgressIndicator()
        Spacer(Modifier.height(30.dp))
        Text("LinearProgressIndicator with progress set by buttons")
        LinearProgressIndicator(progress = animatedProgress)
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
* [Material.io](https://material.io/components/progress-indicators#linear-progress-indicators)
* [Official Docs](https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#linearprogressindicator)
* [Full Example Code]({{ site.samplefolder }}/material/linearprogress/LinearProgressIndicatorSample.kt)
