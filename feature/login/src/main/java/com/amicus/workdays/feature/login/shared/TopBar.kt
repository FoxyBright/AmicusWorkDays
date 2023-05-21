package com.amicus.workdays.feature.login.shared

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.amicus.workdays.shared.R.drawable.ic_left_back_arrow
import com.amicus.workdays.shared.standart.AWDIcon

@Composable
fun LoginTopBar(
    title: String,
    modifier: Modifier = Modifier,
    onBack: () -> Unit,
) {
    Column(modifier) {
        AWDIcon(
            icon = ic_left_back_arrow,
            modifier = modifier.clickable(
                MutableInteractionSource(),
                (null)
            ) { onBack() }
        )
        Text(
            text = title,
            modifier = Modifier,
        )
    }
}