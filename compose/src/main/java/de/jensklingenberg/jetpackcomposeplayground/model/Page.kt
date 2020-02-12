package de.jensklingenberg.jetpackcomposeplayground.model

import androidx.compose.Composable


class Page(val title: String, @Composable val function: () -> Unit)
