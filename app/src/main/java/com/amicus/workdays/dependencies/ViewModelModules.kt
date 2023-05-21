package com.amicus.workdays.dependencies

import com.amicus.workdays.feature.login.auth.viewmodel.LoginViewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * В этом модуле указываются ViewModel для DI
 * **/
internal val viewModelModule = module {
    singleOf(::LoginViewModel)
}

/**
 * Объект для краткого призыва ViewModel в Feature-слой
 * **/
internal object ViewModels{
    
    val loginVM by
    Modules.getVM(LoginViewModel::class.java)
    
}