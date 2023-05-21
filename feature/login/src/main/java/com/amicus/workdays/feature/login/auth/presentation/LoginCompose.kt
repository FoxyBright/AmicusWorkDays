package com.amicus.workdays.feature.login.auth.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.amicus.workdays.feature.login.R
import com.amicus.workdays.feature.login.shared.LoginTopBar
import com.amicus.workdays.shared.theme.AWDTheme

@Preview
@Composable
private fun LoginPreview() {
    AWDTheme {
        LoginContent(
            LoginState(
                phone = "",
                password = "",
                passwordState = false
            )
        )
    }
}

data class LoginState(
    val phone: String,
    val password: String,
    val passwordState: Boolean,
)

interface LoginCallback {
    
    fun onChangePasswordState(state: Boolean)
    fun onChangePassword(password: String)
    fun onChangePhone(phone: String)
    fun onGoogleLogin()
    fun onVKLogin()
    fun onLogin()
    fun onBack()
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
            LoginTopBar(stringResource(R.string.login_label))
            { callback?.onBack() }
        },
    ) {
        Text(state.phone)
    }
}