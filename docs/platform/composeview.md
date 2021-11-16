# ComposeView

!!! info
    This is the API of version 1.0.5-alpha10. Newer versions may have a different one

You can use ComposeView to use Compose inside a ViewGroup.
This example will show you, how you can use ComposeView inside a FrameLayout. It should also work in other layouts like LinearLayout


## Create a custom FrameLayout
Create a custom FrameLayout, then you can use the **ComposeView** and **setContent()** for example inside **init()**.
Inside **setContent()** you can then add your Compose code.
```kotlin
class ComposeFrameLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        ComposeView(context).setContent {
                    Button(onClick = {}) {
                        Text("ComposeButton")
                    }
        }
    }
}
```

## Add it to your layout file
Just add your FrameLayout like any other layout.
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/container"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <ComposeFrameLayout
        android:id="@+id/composeFrame"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="WidgetButton"
        />
</LinearLayout>
```

<p align="center">
  <img src ="{{ site.images }}/platform/composeview/viewgroupExample.png"  height=100 width=200  />
</p>