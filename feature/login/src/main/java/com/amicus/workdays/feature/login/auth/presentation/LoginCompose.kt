package com.amicus.workdays.feature.login.auth.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amicus.workdays.ui.theme.AWDTheme

@Preview
@Composable
private fun LoginPreview() {
    AWDTheme {
        LoginContent(
            LoginState(
                phone = "",
                password = "",
            )
        )
    }
}

data class LoginState(
    val phone: String,
    val password: String,
)

interface LoginCallback {
    
    fun onLogin()
    fun onPasswordState()
    fun onGoogleLogin()
    fun onVKLogin()
}

@Composable
fun LoginContent(
    state: LoginState,
    modifier: Modifier = Modifier,
    callback: LoginCallback? = null,
) {
    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .background(
                colorScheme.background
            ),
        topBar = {
            TopBar()
        },
    ) {
    
    }
}

@Composable
private fun TopBar() {
}