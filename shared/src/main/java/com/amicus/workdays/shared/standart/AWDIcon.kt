package com.amicus.workdays.shared.standart

import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

@Composable
fun AWDIcon(
    icon: Int,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
    description: String? = null,
) {
    Icon(
        painterResource(icon),
        contentDescription = description,
        modifier = modifier,
        tint = tint
    )
}

@Composable
@Suppress("unused")
fun AWDVectorIcon(
    vector: ImageVector,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
    description: String? = null,
) {
    Icon(
        imageVector = vector,
        contentDescription = description,
        modifier = modifier,
        tint = tint
    )
}