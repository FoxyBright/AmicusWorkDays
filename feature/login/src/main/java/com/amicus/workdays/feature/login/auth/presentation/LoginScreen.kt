package com.amicus.workdays.feature.login.auth.presentation

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import com.amicus.workdays.feature.login.auth.viewmodel.LoginViewModel
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(
    vm: LoginViewModel,
    nav: NavHostController,
) {
    val scope = rememberCoroutineScope()
    
    val passwordState by vm.passwordState.collectAsState()
    val password by vm.password.collectAsState()
    val phone by vm.phone.collectAsState()
    
    LoginContent(
        state = LoginState(
            phone = phone,
            password = password,
            passwordState = passwordState
        ),
        callback = object: LoginCallback {
            
            override fun onChangePasswordState(state: Boolean) {
                scope.launch { vm.changePasswordState() }
            }
            
            override fun onChangePassword(password: String) {
                scope.launch { vm.changePassword(password) }
            }
            
            override fun onChangePhone(phone: String) {
                scope.launch { vm.changePhone(phone) }
            }
    
            override fun onGoogleLogin() {
            }
    
            override fun onVKLogin() {
            }
    
            override fun onLogin() {
                nav.navigate("")
            }
            
            override fun onBack() {
                nav.navigate("")
            }
        }
    )
}