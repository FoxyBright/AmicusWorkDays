package com.amicus.workdays

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.amicus.workdays.AppStateModel.AppContent

/**
 *  Основная активность приложения
 * **/
class MainActivity: ComponentActivity() {
    
    override fun onCreate(
        savedInstanceState: Bundle?,
    ) {
        super.onCreate(savedInstanceState)
        setContent { AppContent() }
    }
}