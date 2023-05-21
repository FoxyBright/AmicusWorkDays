package com.amicus.workdays.dependencies

import org.koin.java.KoinJavaComponent.inject

/**
 * Настройки для DI
 * **/
internal object Modules {
    
    fun getKoinModules() = listOf(
        featureModule, dataModule,
        viewModelModule, domainModule
    )
    
    fun <T> getVM(clazz: Class<T>) = inject<T>(clazz)
}