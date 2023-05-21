package com.amicus.workdays.shared.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.TileMode

@Suppress("unused")
object Gradients {
    
    val primary = linearGradient(
        colors = listOf(
            GradientColorOne,
            GradientColorTwo
        ),
        start = Offset(0f, 0f),
        end = Offset(1f, 1f),
        tileMode = TileMode.Clamp
    )
}