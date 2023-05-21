@file:Suppress("DEPRECATION")

package com.amicus.workdays.shared.theme

import android.app.Activity
import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES.S
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat.getWindowInsetsController

private val DarkColorScheme = darkColorScheme(
    primary = UIPurple,
    tertiary = UIGray,
    background = White,
    outline = OutlineDark
)

private val LightColorScheme = lightColorScheme(
    primary = UIPurple,
    tertiary = UIGray,
    background = White,
    outline = OutlineDark
)

@Composable
fun AWDTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val dynamic = dynamicColor && SDK_INT >= S
    
    val colorScheme = when {
        dynamic -> LocalContext.current.let {
            if(darkTheme) dynamicDarkColorScheme(it)
            else dynamicLightColorScheme(it)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    val view = LocalView.current
    if(!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor =
                colorScheme.primary.toArgb()
            getWindowInsetsController(view)
                ?.isAppearanceLightStatusBars = darkTheme
        }
    }
    
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}