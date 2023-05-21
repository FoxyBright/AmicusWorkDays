package com.amicus.workdays

import androidx.compose.runtime.Composable
import com.amicus.workdays.dependencies.ViewModels.loginVM
import com.amicus.workdays.feature.Presentation
import com.amicus.workdays.shared.theme.AWDTheme

/**
 * AppStateModel - место где указываются основные
 * перераспределения внутри проекта
 * **/
internal object AppStateModel {
    
    private const val isAuthorized = false
    
    @Composable
    fun AppContent() {
        AWDTheme { Presentation(isAuthorized, loginVM) }
    }
}