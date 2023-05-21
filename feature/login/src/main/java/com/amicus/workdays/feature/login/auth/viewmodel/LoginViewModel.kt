package com.amicus.workdays.feature.login.auth.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel {
    
    private val _phone =
        MutableStateFlow("")
    val phone =
        _phone.asStateFlow()
    
    private val _password =
        MutableStateFlow("")
    val password =
        _password.asStateFlow()
    
    private val _passwordState =
        MutableStateFlow(false)
    val passwordState =
        _passwordState.asStateFlow()
    
    suspend fun changePhone(phone: String) {
        _phone.emit(phone)
    }
    
    suspend fun changePassword(password: String) {
        _phone.emit(password)
    }
    
    suspend fun changePasswordState() {
        _passwordState.emit(!passwordState.value)
    }
}