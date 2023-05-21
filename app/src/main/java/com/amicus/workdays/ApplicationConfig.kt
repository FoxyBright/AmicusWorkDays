package com.amicus.workdays

import android.app.Application
import com.amicus.workdays.dependencies.Modules.getKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level.NONE

/**
 * Верхний слой настроек приложения
 * **/
internal class ApplicationConfig: Application() {
    
    override fun onCreate() {
        super.onCreate()
        
        startKoin {
            androidLogger(NONE)
            androidContext(this@ApplicationConfig)
            modules(getKoinModules())
        }
    }
}