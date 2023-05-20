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
    description: String? = null,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    Icon(
        painterResource(icon),
        contentDescription = description,
        modifier = modifier,
        tint = tint
    )
}

@Composable
fun AWDVectorIcon(
    vector: ImageVector,
    description: String? = null,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current,
) {
    Icon(
        imageVector = vector,
        contentDescription = description,
        modifier = modifier,
        tint = tint
    )
}