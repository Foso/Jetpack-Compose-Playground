package de.jensklingenberg.jetpackcomposeplayground

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.ui.core.setContent
import androidx.ui.foundation.Text

class ComposeFrameLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        setContent {
            Text("Hallo")
        }
    }

}