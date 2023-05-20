package com.amicus.workdays.feature.login.shared

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.amicus.workdays.shared.R

@Composable
fun LoginTopBar(
    title: String,
    onBack: () -> Unit,
) {
    Icon(
        painter = painterResource(
            R.drawable.ic_left_back_arrow
        ),
        
    )
}