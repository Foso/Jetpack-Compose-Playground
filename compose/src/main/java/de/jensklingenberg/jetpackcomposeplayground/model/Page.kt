package de.jensklingenberg.jetpackcomposeplayground.model

import android.content.Context

data class Page(val title: String, val function: () -> Unit)
