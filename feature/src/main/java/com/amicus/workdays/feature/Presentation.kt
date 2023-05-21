package com.amicus.workdays.feature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.amicus.workdays.feature.login.auth.presentation.LoginScreen
import com.amicus.workdays.feature.login.auth.viewmodel.LoginViewModel

/**
 * Presentation - навигация внутри приложения
 * **/
@Composable
fun Presentation(
    isAuthorized: Boolean = false,
    loginVM: LoginViewModel,
) {
    
    val nav = rememberNavController()
    val start = if(isAuthorized) "" else "login"
    
    AppBackground {
        NavHost(nav, start) {
            composable("login")
            { LoginScreen(loginVM, nav) }
        }
    }
}

@Composable
private fun AppBackground(
    content: @Composable () -> Unit,
) {
    Box(
        Modifier
            .fillMaxSize()
            .background(
                colorScheme.background
            )
    ) { content.invoke() }
}