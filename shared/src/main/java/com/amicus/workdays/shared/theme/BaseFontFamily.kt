package com.amicus.workdays.shared.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle.Companion.Italic
import androidx.compose.ui.text.font.FontStyle.Companion.Normal
import androidx.compose.ui.text.font.FontWeight.Companion.W100
import androidx.compose.ui.text.font.FontWeight.Companion.W200
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W600
import androidx.compose.ui.text.font.FontWeight.Companion.W700
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.font.FontWeight.Companion.W900
import com.amicus.workdays.shared.R.font.*

val baseFontFamily = FontFamily(
    Font(
        resId = lato_hairline,
        weight = W100,
        style = Normal
    ),
    Font(
        resId = lato_hairline_italic,
        weight = W100,
        style = Italic
    ),
    Font(
        resId = lato_thin,
        weight = W200,
        style = Normal
    ),
    Font(
        resId = lato_thin_italic,
        weight = W200,
        style = Italic
    ),
    Font(
        resId = lato_light,
        weight = W300,
        style = Normal
    ),
    Font(
        resId = lato_light_italic,
        weight = W300,
        style = Italic
    ),
    Font(
        resId = lato_italic,
        weight = W400,
        style = Italic
    ),
    Font(
        resId = lato_regular,
        weight = W400,
        style = Normal
    ),
    Font(
        resId = lato_medium,
        weight = W500,
        style = Normal
    ),
    Font(
        resId = lato_medium_italic,
        weight = W500,
        style = Italic
    ),
    Font(
        resId = lato_semibold,
        weight = W600,
        style = Normal
    ),
    Font(
        resId = lato_semibold_italic,
        weight = W600,
        style = Italic
    ),
    Font(
        resId = lato_bold,
        weight = W700,
        style = Normal
    ),
    Font(
        resId = lato_bold_italic,
        weight = W700,
        style = Italic
    ),
    Font(
        resId = lato_heavy,
        weight = W800,
        style = Normal
    ),
    Font(
        resId = lato_heavy_italic,
        weight = W800,
        style = Italic
    ),
    Font(
        resId = lato_black,
        weight = W900,
        style = Normal
    ),
    Font(
        resId = lato_black_italic,
        weight = W900,
        style = Italic
    ),
)

val baseTextStyle = TextStyle(
    fontFamily = baseFontFamily
)