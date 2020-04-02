package de.jensklingenberg.jetpackcomposeplayground.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.Button

class ComposeFrameLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
          setContent {
              Button(onClick = {}) {
                  Text("ComposeButton")
              }
        }
    }

}


class ComposeLinLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        setContent {
            Text("Hallo")
        }
    }


}
